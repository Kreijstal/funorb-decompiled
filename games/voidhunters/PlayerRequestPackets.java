/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PlayerRequestPackets {
    static String field_a;

    final static void sendPlayerRequest(int param0, long param1, int param2) {
        IsaacPacketBuffer var4 = RequestNewestBlackboxRecording.field_p;
        var4.writeIsaacByte(24335, param2);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(0, param0);
        var4.writeLong(param1, 105);
        var4.writeLengthByte(var4.position - var5, -129);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 > -36) {
          PlayerRequestPackets.clearSharedReferences(7);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = "Cancel draw";
    }
}
