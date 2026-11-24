/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReturnToLobbyPacketWriter {
    private static String field_z;

    final static void sendReturnToLobby(int param0, byte param1) {
        BitPacketBuffer var2 = CollisionGridEntryNodeBase.field_k;
        var2.writeCipheredOpcode(param0, param1 - 3016);
        var2.writeByte(1, 0);
        if (param1 == 28) {
          var2.writeByte(1, 0);
          return;
        }
    }

    static {
        field_z = "gk.A(";
    }
}
