/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj {
    static int field_d;
    static fe field_a;
    static PcmStreamMixer field_f;
    static String field_e;
    static String field_b;
    static Sprite field_c;

    final static void writeHighscoreQuery(int guard, int opcode, HighscoreQuery query) {
        try {
          CipherPacketBuffer var3 = QuickChatDynamicCommand.outgoingPackets;
          var3.writeCipheredOpcode(opcode, true);
          var3.writeByte(5, -123);
          var3.writeByte(0, -123);
          var3.writeShort(-123, query.boardId);
          var3.writeByte(query.field_h, -123);
          var3.writeByte(query.field_j, -123);
          int var4 = 58 % ((guard + 64) / 39);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "aj.B(" + guard + ',' + opcode + ',' + (query != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(int guard) {
        field_b = null;
        field_a = null;
        field_e = null;
        if (guard == 0) {
          field_f = null;
          field_c = null;
          return;
        }
        HighscoreQuery var2 = (HighscoreQuery) null;
        aj.writeHighscoreQuery(45, 15, (HighscoreQuery) null);
        field_f = null;
        field_c = null;
    }

    final static boolean b(int param0) {
        if (param0 > -88) {
          field_a = (fe) null;
          return SpriteState.field_u;
        }
        return SpriteState.field_u;
    }

    static {
        field_d = 0;
        field_e = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_b = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
    }
}
