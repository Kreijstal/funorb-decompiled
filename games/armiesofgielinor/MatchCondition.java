/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface MatchCondition {
    public abstract boolean isVictory(int obfuscationGuard);

    public abstract boolean isDefeat(int obfuscationGuard);

    public abstract String describeCondition(int obfuscationGuard);
}
