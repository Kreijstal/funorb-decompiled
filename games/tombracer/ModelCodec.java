/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface ModelCodec {
    public abstract TrapModel readModel(Room param0, BitPacketBuffer param1, boolean param2);

    public abstract void writeModel(int param0, BitPacketBuffer param1, TrapModel param2);

    public abstract TrapModel a(TrapPart param0, WorldBody param1, int param2);

    public abstract TrapModel createModel(int param0, int param1);
}
