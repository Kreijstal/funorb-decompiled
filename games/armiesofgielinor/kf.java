/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kf extends oj {
    int field_H;
    static String field_B;
    private boolean field_A;
    private int field_C;
    static int[] field_E;
    private int field_y;
    private int field_z;
    private int field_J;
    int field_F;
    static String field_I;

    public static void g(int param0) {
        field_E = null;
        field_I = null;
        field_B = null;
    }

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    final void a(ha param0, int param1) {
        jd var5 = null;
        jd var6 = null;
        if (!(!((kf) this).field_A)) {
            return;
        }
        ((kf) this).field_A = true;
        ((kf) this).field_w = new jd(((kf) this).field_H, ((kf) this).field_F, 39, ((kf) this).field_C, ((kf) this).field_z, ((kf) this).field_z, 0, 0, 0, param0, 0, 0, -1, false, 0);
        if (param1 != -26661) {
            return;
        }
        try {
            param0.a(param1 + 34949, ((kf) this).field_w);
            ((kf) this).field_w.field_B = 1;
            ((kf) this).field_w.field_s = true;
            var5 = param0.c(((kf) this).field_y, true, ((kf) this).field_J);
            var6 = var5;
            if (var6 != null) {
                var6.field_s = true;
            }
            fl.a(param0, param1 ^ 26716);
        } catch (RuntimeException runtimeException) {
            throw ig.a((Throwable) (Object) runtimeException, "kf.G(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 41);
        }
    }

    final boolean a(at param0, byte param1, ic param2) {
        RuntimeException var4 = null;
        int stackIn_2_0 = 0;
        boolean stackIn_4_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        try {
          L0: {
            if (param1 < -84) {
              stackOut_3_0 = ((kf) this).a((byte) -39, param2, param0, true);
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("kf.A(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          L2: {
            stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
            stackOut_8_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_8_2).append(44).append(param1).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param2 == null) {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L2;
            } else {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L2;
            }
          }
          throw ig.a((Throwable) (Object) stackIn_11_0, stackIn_11_2 + 41);
        }
        return stackIn_4_0;
    }

    final String a(byte param0, boolean param1) {
        int var4 = -32 / ((param0 - 53) / 51);
        String var3 = "EventGrowth: g: (" + ((kf) this).field_H + "," + ((kf) this).field_F + "), strength: " + ((kf) this).field_z + ", owner: " + ((kf) this).field_C + ", o: (" + ((kf) this).field_J + "," + ((kf) this).field_y + ")";
        return var3;
    }

    kf(int param0, int param1, int param2, int param3, int param4, int param5) {
        ((kf) this).field_J = param2;
        ((kf) this).field_C = param5;
        ((kf) this).field_z = param4;
        ((kf) this).field_m = 11;
        ((kf) this).field_F = param1;
        ((kf) this).field_H = param0;
        ((kf) this).field_A = false;
        ((kf) this).field_y = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_B = "<%0> has entered a game.";
        field_E = new int[]{7, 4, 4, 3, 2, 8};
        field_I = "END TURN";
    }
}
