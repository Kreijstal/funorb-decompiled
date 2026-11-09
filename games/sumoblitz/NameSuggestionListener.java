/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface NameSuggestionListener {
    public abstract void setSuggestedName(String name, int guard);

    public abstract void invalidateNameAvailability(byte guard);
}
