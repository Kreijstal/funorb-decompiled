/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ma extends h {
    private String field_M;
    private boolean field_J;
    private dh field_H;
    private int field_L;
    private int field_K;
    static ac field_I;
    static String field_G;
    private int field_N;
    static bi field_O;
    static mf field_P;

    final void a(int param0, int param1, int param2, byte param3) {
        int var5 = ((ma) this).field_o + param1;
        int var6 = param0 + ((ma) this).field_w;
        super.a(param0, param1, param2, param3);
        if (!(param2 == 0)) {
            return;
        }
        int var7 = ((ma) this).field_J ? ((ma) this).field_t - (((ma) this).field_N - -(((ma) this).field_L * 2)) : 0;
        int discarded$0 = ((ma) this).field_H.a(((ma) this).field_M, ((ma) this).field_L + var5 - -var7, ((ma) this).field_L + var6, ((ma) this).field_N + -((ma) this).field_L, -(2 * ((ma) this).field_L) + ((ma) this).field_s, ((ma) this).field_K, -1, !((ma) this).field_J ? 2 : 0, 1, ((ma) this).field_H.field_F);
    }

    public static void c(boolean param0) {
        field_O = null;
        field_I = null;
        field_G = null;
        field_P = null;
        if (param0) {
            field_O = null;
        }
    }

    ma(int param0, int param1, int param2, int param3, oc param4, boolean param5, int param6, int param7, dh param8, int param9, String param10) {
        super(param0, param1, param2, param3, (ub) null, (uh) null);
        ((ma) this).field_E = param4;
        ((ma) this).field_L = param7;
        ((ma) this).field_J = param5 ? true : false;
        ((ma) this).field_H = param8;
        ((ma) this).field_K = param9;
        ((ma) this).field_M = param10;
        ((ma) this).field_N = param6;
        int var12 = ((ma) this).field_N + -((ma) this).field_L;
        int var13 = ((ma) this).field_H.b(param10, var12, ((ma) this).field_H.field_F) + ((ma) this).field_L * 2;
        if (param3 < var13) {
            ((ma) this).a(var13, param0, param1, (byte) -119, param2);
        } else {
            var13 = param3;
        }
        int var14 = !((ma) this).field_J ? 2 * ((ma) this).field_L + ((ma) this).field_N : 0;
        ((ma) this).field_E.a(param3 + -(2 * ((ma) this).field_L), var14, ((ma) this).field_L + (var13 - param3 >> -655501471), (byte) -119, -(((ma) this).field_L * 3) + param2 + -((ma) this).field_N);
    }

    final static void a(byte param0, int param1) {
        int var2 = 51 / ((-51 - param0) / 53);
        h.a(13894, param1);
    }

    final String d(int param0) {
        int var2 = 0;
        String var3 = null;
        oc stackIn_2_0 = null;
        oc stackIn_3_0 = null;
        oc stackIn_4_0 = null;
        int stackIn_4_1 = 0;
        oc stackOut_1_0;
        oc stackOut_3_0;
        int stackOut_3_1;
        oc stackOut_2_0;
        int stackOut_2_1;
        if (param0 < 6) {
          return null;
        } else {
          L0: {
            var2 = ((ma) this).field_E.field_q ? 1 : 0;
            ((ma) this).field_E.field_q = ((ma) this).field_q;
            var3 = ((ma) this).field_E.d(39);
            stackOut_1_0 = ((ma) this).field_E;
            stackIn_3_0 = stackOut_1_0;
            stackIn_2_0 = stackOut_1_0;
            if (var2 == 0) {
              stackOut_3_0 = (oc) (Object) stackIn_3_0;
              stackOut_3_1 = 0;
              stackIn_4_0 = stackOut_3_0;
              stackIn_4_1 = stackOut_3_1;
              break L0;
            } else {
              stackOut_2_0 = (oc) (Object) stackIn_2_0;
              stackOut_2_1 = 1;
              stackIn_4_0 = stackOut_2_0;
              stackIn_4_1 = stackOut_2_1;
              break L0;
            }
          }
          ((oc) (Object) stackIn_4_0).field_q = stackIn_4_1 != 0;
          return var3;
        }
    }

    final static void b(byte param0, int param1) {
        pi var2 = null;
        if (param0 > -49) {
          ma.b((byte) -23, -84);
          var2 = k.field_h;
          var2.e(-13413, param1);
          var2.a(27, 1);
          var2.a(127, 2);
          return;
        } else {
          var2 = k.field_h;
          var2.e(-13413, param1);
          var2.a(27, 1);
          var2.a(127, 2);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = "Here you can set up a rated game. If you win, your rating will go up. If<nbsp>you lose, it will go down!<br><br>Please specify your preferences and click '<%0>'. Our system will then attempt to find suitable opponents in under a minute, depending on how busy the lobby<nbsp>is.<br><br>This is an excellent way to get to know new people!";
    }
}
