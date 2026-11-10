/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PenaltyNotice extends IntrusiveNode {
    static BinaryBitmapFont field_f;
    static String field_g;
    static TextureProvider field_j;
    private Player player;
    private int kind;

    final Player getPlayer(int param0) {
        if (param0 != -14065) {
          PenaltyNotice.a(-124);
          return this.player;
        }
        return this.player;
    }

    final static void a(int param0) {
        int var1 = 0;
        int var1Lifetime1;
        if (param0 == 256) {
          if (224 <= MatchState.field_w) {
            S2CRoundResultPacket.a(256, -116);
          } else {
            var1 = MatchState.field_w % 32;
            S2CRoundResultPacket.a(MatchState.field_w - (-32 + var1), -127);
          }
          return;
        }
        PenaltyNotice.releaseStatics(false);
        if (224 <= MatchState.field_w) {
          S2CRoundResultPacket.a(256, -116);
        } else {
          var1Lifetime1 = MatchState.field_w % 32;
          S2CRoundResultPacket.a(MatchState.field_w - (-32 + var1Lifetime1), -127);
        }
    }

    public static void releaseStatics(boolean param0) {
        field_g = null;
        field_f = null;
        if (!param0) {
          return;
        }
        field_j = null;
    }

    final int getKind(int param0) {
        if (param0 <= 4) {
          return -38;
        }
        return this.kind;
    }

    PenaltyNotice(Player param0, Room param1, int param2, int param3, int param4) {
        try {
          this.kind = param3;
          this.player = param0;
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "qw.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(byte param0, int param1) {
        if (param0 != -32) {
          field_g = (String) null;
          if (param1 != msa.field_a) {
            return;
          }
          if (null != SecondaryNodeDequeIterator.field_a) {
            MatchProtocol.b(15, 0);
            return;
          }
          return;
        }
        if (param1 != msa.field_a) {
          return;
        }
        if (null != SecondaryNodeDequeIterator.field_a) {
          MatchProtocol.b(15, 0);
          return;
        }
    }

    static {
        field_g = "Friend's Best Score:<br> <%0> - <%1>";
    }
}
