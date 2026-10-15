/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static String field_d;
    static UiComponent field_c;
    static boolean field_f;
    static String field_e;
    static RgbSprite spaceSmallSprite;
    static TableDataRequest field_g;
    static ConnectionPhase connectionPhase;

    final static void requestRemoveOrRejectPlayer(int opcode, long playerId, boolean obfuscationGuard) {
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.position = packet.position + 1;
        int payloadStart = packet.position;
        packet.writeByte(96, 7);
        packet.writeLong(-23054, playerId);
        packet.backfillByteLength((byte) 113, -payloadStart + packet.position);
        if (obfuscationGuard) {
          return;
        }
        rf.a((byte) 102);
    }

    public static void a(byte param0) {
        field_c = null;
        field_g = null;
        field_d = null;
        if (param0 != 98) {
          return;
        }
        spaceSmallSprite = null;
        field_e = null;
        connectionPhase = null;
    }

    static {
        field_d = "Your email address is used to identify this account";
        field_g = null;
        field_e = "to keep fullscreen or";
    }
}
