package at.refugeescode.mp11piratesofthecodebean3.logic;

public abstract class CsvParserModule<T> {

    private String path;

    public CsvParserModule(String path) {
        this.path = path;
    }

    String getPath() {
        return path;
    }

    abstract boolean isValid(String[] columns);

        abstract T toObject(String[] columns);


}
