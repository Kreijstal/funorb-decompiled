/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextInputListener extends UiListener {
    public abstract void onSubmit(boolean guard, EditableTextWidget field);

    public abstract void onTextChanged(EditableTextWidget field, int guard);
}
