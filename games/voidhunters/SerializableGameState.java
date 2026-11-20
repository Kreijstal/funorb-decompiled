/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface SerializableGameState {
    public abstract boolean differsFrom(byte param0, SerializableGameState param1);

    public abstract void writeState(IsaacPacketBuffer param0, int param1);

    public abstract void copyTo(byte param0, SerializableGameState param1);

    public abstract void readState(IsaacPacketBuffer param0, boolean param1);
}
