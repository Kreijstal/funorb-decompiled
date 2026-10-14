/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface TextFieldListener extends WidgetListener {
    public abstract void onSubmitted(TextFieldWidget textField, int obfuscationGuard);

    public abstract void onTextChanged(TextFieldWidget textField, byte obfuscationGuard);
}
