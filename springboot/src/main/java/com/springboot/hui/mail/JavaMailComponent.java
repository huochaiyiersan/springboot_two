package com.springboot.hui.mail;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.mail.MailProperties;
import org.springframework.boot.context.properties.EnableConfigurationProperties;
import org.springframework.mail.javamail.JavaMailSender;
import org.springframework.mail.javamail.MimeMessageHelper;
import org.springframework.stereotype.Component;
import org.springframework.ui.freemarker.FreeMarkerTemplateUtils;
import org.springframework.web.servlet.view.freemarker.FreeMarkerConfigurer;

import javax.mail.MessagingException;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeMessage;
import java.io.UnsupportedEncodingException;
import java.util.HashMap;
import java.util.Map;

@Component
@EnableConfigurationProperties(MailProperties.class)
public class JavaMailComponent {


    @Autowired
    private FreeMarkerConfigurer freeMarkerConfigurer;

    @Autowired
    private JavaMailSender javaMailSender;

    @Autowired
    private MailProperties mailProperties;

    public void sendMail(String email) {
        Map<String, Object> map = new HashMap<String, Object>();
        map.put("email", email);
        try {
            // 第一种方式：获取内容,这个是有模板的，读取文件获取模板
           // String text = String text = this.getTextByTemplate("mail.ftl", map);
            //第二种方式 ：或者这样写模板
            String text = "<!DOCTYPE html>\n" +
                    "<html lang=\"zh\">\n" +
                    "<head>\n" +
                    "    <meta http-equiv=\"Content-Type\" content=\"text/html; charset=UTF-8\" />\n" +
                    "</head>\n" +
                    "<body>\n" +
                    "<div style=\"width: 600px; text-align: left; margin: 0 auto;\">\n" +
                    "    <h1 style=\"color: #005da7;\">边大爷的测试邮件</h1>\n" +
                    "    <div style=\"border-bottom: 5px solid #005da7; height: 2px; width: 100%;\"></div>\n" +
                    "    <div style=\"border: 1px solid #005da7; font-size: 16px; line-height: 50px; padding: 20px;\">\n" +
                    "        <div>1179757089@qq.com，您好！</div>\n" +
                    "        <div>\n" +
                    "            这是一封测试邮件\n" +
                    "        </div>\n" +
                    "        <div>\n" +
                    "            哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈哈\n" +
                    "        </div>\n" +
                    "    </div>\n" +
                    "</div>\n" +
                    "</body>\n" +
                    "</html>\n";
            //第三种方式,直接发送一句话
           // String text ="this is test eamail";
            // 发送
            System.out.println(text);

            this.send(email, text);
        } catch (Exception e) {
            e.printStackTrace();
        }
    }

    private String getTextByTemplate(String template, Map<String, Object> model) throws Exception {
        return FreeMarkerTemplateUtils
                .processTemplateIntoString(this.freeMarkerConfigurer.getConfiguration().getTemplate(template), model);
    }

    private String send(String email, String text) throws MessagingException, UnsupportedEncodingException {
        MimeMessage message = this.javaMailSender.createMimeMessage();
        MimeMessageHelper helper = new MimeMessageHelper(message, true, "UTF-8");
        InternetAddress from = new InternetAddress();
        from.setAddress(this.mailProperties.getUsername());
       // from.setPersonal("春晖", "UTF-8");
        helper.setFrom(from);
        helper.setTo(email);
        helper.setSubject("边打野");//邮件标题
        helper.setText(text, true);
        this.javaMailSender.send(message);
        return text;
    }
}
