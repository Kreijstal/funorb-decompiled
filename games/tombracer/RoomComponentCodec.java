/*
 * Decompiled by CFR-JS 0.4.0.
 */
interface RoomComponentCodec {
    public abstract RoomComponent createSkeletonComponent(Room param0, byte param1);

    public abstract RoomComponent readComponent(BitPacketBuffer param0, Room param1, byte param2, RoomComponent param3);

    public abstract RoomComponent readComponent(BitPacketBuffer param0, int param1, Room param2);

    public abstract void writeComponent(RoomComponent param0, int param1, BitPacketBuffer param2);
}
