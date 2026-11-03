/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ClientException extends RuntimeException {
    Throwable field_e;
    static ScrollPane field_c;
    static SortCriterion field_a;
    String field_d;
    static int field_f;
    static String field_b;

    final static void a(int param0) {
        StatefulTextPainter.field_s.setBounds(true, -(ui.field_t ? 40 + (2 + (TeamSelectionAgent.field_f + 2)) : 0) + TickClock.field_d.field_q, param0, 0, 18);
        ck.field_c.setBounds(true, TeamSelectionAgent.field_f + 42, -40 + (-2 - TeamSelectionAgent.field_f + TickClock.field_d.field_q), 0, 18);
        LineupView.field_u.setLayout(2, param0 ^ 118, TickClock.field_d.field_mb - 20, 20, 0, TickClock.field_d.field_q, TeamSelectionAgent.field_f);
    }

    public static void releaseStatics(byte param0) {
        field_b = null;
        if (param0 > -50) {
          ClientException.releaseStatics((byte) 40);
          field_c = null;
          field_a = null;
          return;
        }
        field_c = null;
        field_a = null;
    }

    final static Sprite[] a(Sprite[] param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Sprite var3_ref_ut = null;
        int var3 = 0;
        int var4 = 0;
        Sprite[] stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          for (var2_int = 0; param0.length > var2_int; var2_int++) {
            var3_ref_ut = param0[var2_int];
            param0[var2_int].field_n = 0;
            var3_ref_ut.field_s = 0;
            param0[var2_int].field_o = param0[var2_int].field_q;
            param0[var2_int].field_v = param0[var2_int].field_w;
          }
          var3 = 45 % ((param1 + 62) / 35);
          stackIn_5_0 = (Sprite[]) (param0);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("bs.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2) {
        if (param1 == 0) {
          tb.field_s = param0;
          TeamManagementScreen.field_A = param2;
          return;
        }
        Sprite[] var4 = (Sprite[]) null;
        ClientException.a((Sprite[]) null, (byte) 5);
        tb.field_s = param0;
        TeamManagementScreen.field_A = param2;
    }

    ClientException(Throwable param0, String param1) {
        this.field_d = param1;
        this.field_e = param0;
    }

    static {
        field_b = "This is your auction.";
        field_a = (SortCriterion) ((Object) new PlayerStatSortCriterion());
    }
}
