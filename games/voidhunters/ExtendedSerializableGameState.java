/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ExtendedSerializableGameState extends AlternateSerializableGameState {
    public abstract void copyExtendedStateTo(SerializableGameState param0, byte param1);

    public abstract void writeExtendedState(IsaacPacketBuffer param0, byte param1);

    public abstract boolean differsFromExtended(ExtendedSerializableGameState param0, int param1);

    public abstract void readExtendedState(IsaacPacketBuffer param0, int param1);
}
