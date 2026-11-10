/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ByteRequestWriter {
    private static String field_z;

    final static void sendByteRequest(int param0, int param1) {
        BitPacketBuffer var2 = LinkTextPainter.field_e;
        var2.writeCipheredByte(11, param1);
        var2.writeByte(1, 29);
        var2.writeByte(param0, 104);
    }

    static {
        field_z = "pp.A(";
    }
}
