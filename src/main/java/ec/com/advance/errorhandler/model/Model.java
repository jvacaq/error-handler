package ec.com.advance.errorhandler.model;

public class Model {
    private String url;
    private String description;

    public Model() {
    }

    public String getUrl() {
        return url;
    }

    public void setUrl(String url) {
        this.url = url;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    @Override
    public String toString() {
        return "Model{" +
                "url='" + url + '\'' +
                ", description='" + description + '\'' +
                '}';
    }
}
