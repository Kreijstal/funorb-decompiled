/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface UsernameSuggestionListener {
    public abstract void onSuggestionSelected(String suggestion, int methodGuard);

    public abstract void onMoreSuggestionsRequested(byte methodGuard);
}
