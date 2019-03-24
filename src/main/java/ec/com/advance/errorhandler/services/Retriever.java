package ec.com.advance.errorhandler.services;

import ec.com.advance.errorhandler.model.Model;
import org.springframework.stereotype.Service;

import java.util.LinkedHashMap;
import java.util.Map;

@Service
public class Retriever {
    public String retrieve(Model model) {
        StringBuilder html = new StringBuilder();
        html.append("<html><ol>")
                .append("<li>").append(model.getDescription()).append("</li>")
                .append("<li>").append(model.getUrl()).append("</li>")
                .append("</o/></html>");
        return html.toString();
    }
}
