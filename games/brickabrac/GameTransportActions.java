/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameTransportActions {
    static String field_a;
    static String field_b;
    static NineSliceFrame textChoiceOuterFrame;

    final static boolean canUseGameTransport(int obfuscationGuard) {
        if (obfuscationGuard != 3) {
          return true;
        }
        if (WhirlpoolHasher.gameTransport == null) {
          return false;
        }
        if (!GameConnectionHelpers.connectionPhase.allowsGameTransport(-26774)) {
          return false;
        }
        return true;
    }

    final static void requestLeaveOrDeclineGame(int gameId, boolean obfuscationGuard, int opcode) {
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.writeByte(-29, 3);
        packet.writeByte(-127, 9);
        packet.writeShort((byte) 121, gameId);
        if (!obfuscationGuard) {
          return;
        }
        textChoiceOuterFrame = (NineSliceFrame) null;
    }

    public static void b(int param0) {
        field_a = null;
        if (param0 < 12) {
          return;
        }
        field_b = null;
        textChoiceOuterFrame = null;
    }

    static {
        field_a = "Well done!";
        field_b = "You have declined the invitation.";
    }
}
