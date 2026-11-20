/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface DiffableState extends SerializableGameState {
    public abstract void reportDifferences(SerializableGameState other, int obfuscationGuard);
}
