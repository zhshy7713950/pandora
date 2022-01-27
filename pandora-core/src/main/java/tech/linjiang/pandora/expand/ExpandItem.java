package tech.linjiang.pandora.expand;

public abstract class ExpandItem implements ExpandItemClickListener{
    private final ExpandType expandType;
    private final String text;

    public ExpandItem(ExpandType expandType, String text) {
        this.expandType = expandType;
        this.text = text;
    }

    public ExpandType getExpandType() {
        return expandType;
    }

    public String getText() {
        return text;
    }
}
