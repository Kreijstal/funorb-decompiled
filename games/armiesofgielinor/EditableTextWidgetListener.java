/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface EditableTextWidgetListener extends WidgetListener {
    public abstract void textChanged(EditableTextWidget widget, int obfuscationGuard);

    public abstract void textSubmitted(EditableTextWidget widget, int obfuscationGuard);
}
