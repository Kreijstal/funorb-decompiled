/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_a;
    static String field_b;
    static ta field_c;

    final static boolean a(int param0) {
        if (param0 != 3) {
          return true;
        }
        if (eq.gameTransport == null) {
          return false;
        }
        if (!rf.field_b.c(-26774)) {
          return false;
        }
        return true;
    }

    final static void requestLeaveOrDeclineGame(int gameId, boolean obfuscationGuard, int opcode) {
        BitPacketBuffer packet = k.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.writeByte(-29, 3);
        packet.writeByte(-127, 9);
        packet.writeShort((byte) 121, gameId);
        if (!obfuscationGuard) {
          return;
        }
        field_c = (ta) null;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 < 12) {
          return;
        }
        field_b = null;
        field_c = null;
    }

    static {
        field_a = "Well done!";
        field_b = "You have declined the invitation.";
    }
}
