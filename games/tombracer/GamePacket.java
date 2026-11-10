/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface GamePacket {
    public abstract void decode(BitPacketBuffer param0, byte param1);

    public abstract void encode(int param0, BitPacketBuffer param1);
}
