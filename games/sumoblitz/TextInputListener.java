/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextInputListener extends WidgetListener {
    public abstract void onTextChanged(TextInputWidget source, byte guard);

    public abstract void onTextSubmitted(TextInputWidget source, int guard);
}
