/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib extends wt implements vh {
    static String field_F;
    static String field_H;
    private fb field_G;
    static boolean field_E;
    static String field_B;
    static int[] field_C;
    private wi field_D;

    final void a(byte param0, fd param1, int param2, int param3) {
        try {
            super.a(param0, param1, param2, param3);
            ((ib) this).field_D.field_y = ((ib) this).field_G.a((byte) -125).c(-24407) == he.field_yb ? true : false;
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ib.P(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    public final void a(int param0, wi param1, int param2, byte param3, int param4) {
        if (param3 < 64) {
            return;
        }
        if (!(((ib) this).field_G.a((byte) -125).c(-24407) == he.field_yb)) {
            return;
        }
        try {
            pu.a((byte) -113, ((ib) this).field_G.m(-1), ((ib) this).field_G.h((byte) 48), ((ib) this).field_G.l(85));
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "ib.C(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    final static byte[] a(String param0, int param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1 < -79) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            stackOut_2_0 = up.field_m.a(param0, "", 120);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2;
            stackOut_4_1 = new StringBuilder().append("ib.O(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    final void a(byte param0) {
        int var2 = 0;
        var2 = 250;
        ((ib) this).field_G.a(25, param0 + 119, -var2 + ((ib) this).field_n >> 1, 140, 20 + ((ib) this).field_i - 25 >> 1);
        ((ib) this).field_D.a(30, 1, 140 + (((ib) this).field_n - var2 >> 1) + 10, 100, (20 + (((ib) this).field_i + -30) >> 1) + 2);
        if (param0 != -118) {
          field_C = null;
          return;
        } else {
          return;
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, (int) (char)param1, param2, param3);
        qo.field_k.a(kd.field_v, 4 + param2 - -((ib) this).field_t, 4 + qo.field_k.field_G + (((ib) this).field_g + param3), 16777215, -1);
    }

    ib(int param0, int param1, int param2, int param3) {
        super(param0, param1, param2, param3, (gj) null);
        ((ib) this).field_G = new fb((gj) (Object) new ri(10000536), field_E, 0, 0, 140, 25);
        ((ib) this).field_G.a(new hl(), -20274);
        ((ib) this).field_D = new wi(es.field_g, (jv) this);
        ((ib) this).field_w = new fd[]{(fd) (Object) ((ib) this).field_G, (fd) (Object) ((ib) this).field_D};
        ((ib) this).field_D.field_r = (gj) (Object) new op();
        ((ib) this).e(-1947);
    }

    public static void a(int param0) {
        field_F = null;
        field_B = null;
        field_H = null;
        if (param0 != 905215457) {
            ib.a(-67);
            field_C = null;
            return;
        }
        field_C = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "user";
        field_B = "This is your RuneScape clan if you have one.";
        field_F = "Players: <%0>/<%1>";
        field_C = new int[8192];
    }
}
