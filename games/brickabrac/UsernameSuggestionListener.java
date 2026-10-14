/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface UsernameSuggestionListener {
    public abstract void onRefreshUsernameSuggestions(byte obfuscationGuard);

    public abstract void onUsernameSuggestionChosen(String username, byte obfuscationGuard);
}
