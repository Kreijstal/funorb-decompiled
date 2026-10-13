/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface NameSuggestionListener {
    public abstract void refreshNamesRequested(byte obfuscationGuard);

    public abstract void nameSelected(int obfuscationGuard, String name);
}
