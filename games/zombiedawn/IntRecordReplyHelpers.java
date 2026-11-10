/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IntRecordReplyHelpers {
    static boolean field_b;
    static boolean field_d;
    static Js5Archive field_e;
    static boolean field_c;
    static boolean field_a;
    static int field_f;

    final static void skipIntRecordReply(int param0) {
        PendingHighscoreRequest var1 = (PendingHighscoreRequest) (DecodedSpriteHelpers.field_a.last((byte) 26));
        if (var1 == null) {
          SessionSocketHelpers.closeSessionSocket(1);
          return;
        }
        BitPacketBuffer var2 = MatchingTextValidator.field_g;
        var2.readInt(param0 ^ 14826);
        var2.readInt(param0 ^ 14820);
        var2.readInt(-37);
        var2.readInt(95);
        var1.unlink(-27598);
        if (param0 == 14740) {
          return;
        }
        IntRecordReplyHelpers.alwaysTrue(-16);
    }

    final static boolean alwaysTrue(int param0) {
        if (param0 != -23022) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 > -19) {
          IntRecordReplyHelpers.alwaysTrue(-1);
        }
    }

    static {
    }
}
