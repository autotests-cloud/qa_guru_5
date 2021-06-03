package guru.qa;

public enum ImageFormat {
    jpg("Формат картинки jpg"),
    png("Формат картинки png"),
    gif("Формат картинки gif");

    public final String description;

    ImageFormat(String description) {
        this.description = description;
    }

    public String getDescription() {
        return description;
    }

    public static ImageFormat lookup(String description) {
        for (ImageFormat value : values()) {
            if (value.description.contains(description))
                return value;
        }
        throw new IllegalArgumentException("Cant find");
    }
}
