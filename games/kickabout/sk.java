/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sk {
    static int field_c;
    static String field_b;
    static jj field_d;
    static ut[] field_a;

    final static void a(int param0, int param1) {
        ea.a(vt.field_c.field_v, 5, true, 636, param1, -51);
    }

    final static int a() {
        return wd.field_n[0];
    }

    final static void a(boolean param0) {
        fa var1 = (fa) (Object) nl.field_f.g(24009);
        if (!(var1 != null)) {
            int discarded$0 = -116;
            lr.b();
            return;
        }
        ml var2 = un.field_e;
        int discarded$1 = var2.k(4);
        int discarded$2 = var2.k(4);
        int discarded$3 = var2.k(4);
        int discarded$4 = var2.k(4);
        var1.c((byte) -109);
    }

    final static void a(int param0, int param1, lv param2) {
        try {
            np.field_Jb.a((gn) (Object) new i(7, param2), 3);
        } catch (RuntimeException runtimeException) {
            throw nb.a((Throwable) (Object) runtimeException, "sk.D(" + 7 + 44 + 16586 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
    }

    final static void a(int param0, int param1, int param2) {
        long var3 = 0L;
        float var5 = 0.0f;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        float var11 = 0.0f;
        String var12 = null;
        var3 = nj.a(108);
        if (~var3 > ~ah.field_c) {
          return;
        } else {
          L0: {
            ah.field_c = var3 + 25L;
            var5 = (float)param2 / (float)param1;
            var6 = (int)(var5 * 100.0f);
            var8 = -80 / ((param0 - 12) / 58);
            var7 = nm.a((byte) -100, field_c);
            var9 = nm.a((byte) -99, field_c + 1);
            var10 = -var7 + var9;
            var11 = var5 * (float)var10 + (float)var7;
            var12 = no.field_K[field_c];
            if (var12 != null) {
              var12 = var12 + " - " + var6 + "%";
              break L0;
            } else {
              break L0;
            }
          }
          ju.a(var11, var12, (byte) 30);
          nm.field_g.b((byte) 118);
          return;
        }
    }

    final static int a(int param0, int param1, int param2, int param3, ml param4) {
        RuntimeException var6 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_2_0 = 0;
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
              if (param0 == 19881) {
                break L1;
              } else {
                sk.a(22, -23, -9);
                break L1;
              }
            }
            int discarded$10 = 8;
            int discarded$11 = 1;
            int discarded$12 = 256;
            int discarded$13 = 65536;
            int discarded$14 = 4;
            stackOut_2_0 = gl.a(16, (byte) 123, 0, 16, param4);
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var6 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var6;
            stackOut_4_1 = new StringBuilder().append("sk.A(").append(param0).append(44).append(8).append(44).append(0).append(44).append(4).append(44);
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param4 == null) {
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
          throw nb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + 16 + 41);
        }
        return stackIn_3_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_b = "click";
    }
}
