/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface AlternateSerializableGameState extends SerializableGameState {
    public abstract void readAlternateState(int param0, IsaacPacketBuffer param1);

    public abstract void writeAlternateState(IsaacPacketBuffer param0, int param1);

    public abstract void copyAlternateStateTo(SerializableGameState param0, int param1);

    public abstract boolean differsFromAlternate(boolean param0, AlternateSerializableGameState param1);
}
