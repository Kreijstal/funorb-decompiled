/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hq extends li {
    int[] field_n;
    static int field_r;
    static String field_q;
    int field_p;
    boolean field_o;

    final static boolean a(int param0, int param1, int param2, r param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        byte[] var5 = null;
        int stackIn_4_0 = 0;
        int stackIn_6_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 124) {
                break L1;
              } else {
                hq.a(true);
                break L1;
              }
            }
            var5 = param3.a(param1, param2, (byte) -119);
            var4 = var5;
            if (var5 != null) {
              lc.a(59, var5);
              stackIn_6_0 = 1;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_4_0 = 0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var4_ref);

            stackIn_9_1 = new StringBuilder().append("hq.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_4_0 != 0;
        } else {
          return stackIn_6_0 != 0;
        }
    }

    public static void a(boolean param0) {
        field_q = null;
        if (param0) {
            field_r = 80;
        }
    }

    final static void b(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        var2 = (qg.field_G + -640) / 2;
        var3 = ld.field_b * ld.field_b;
        if (param1 >= -126) {
          hq.a(false);
          var4 = var3 + -(param0 * param0);
          hk.field_o.a(94, 199, -124 + (bi.field_j + -90), 90, var2 + -(var4 * 199 / var3));
          lb.field_c.a(118, 438, bi.field_j - 124, 0, var4 * 438 / var3 + (202 + var2));
          return;
        } else {
          var4 = var3 + -(param0 * param0);
          hk.field_o.a(94, 199, -124 + (bi.field_j + -90), 90, var2 + -(var4 * 199 / var3));
          lb.field_c.a(118, 438, bi.field_j - 124, 0, var4 * 438 / var3 + (202 + var2));
          return;
        }
    }

    hq() {
        this.field_o = false;
    }

    final static er[] a(er[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        er var3 = null;
        int var4 = 0;
        r var5 = null;
        er[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == 202) {
                break L1;
              } else {
                var5 = (r) null;
                hq.a(33, -77, -100, (r) null);
                break L1;
              }
            }
            var2_int = 0;
            L2: while (true) {
              if (param0.length <= var2_int) {
                stackIn_7_0 = (er[]) (param0);
                break L0;
              } else {
                var3 = param0[var2_int];
                param0[var2_int].field_z = 0;
                var3.field_C = 0;
                param0[var2_int].field_x = param0[var2_int].field_y;
                param0[var2_int].field_B = param0[var2_int].field_t;
                var2_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackIn_10_0 = (RuntimeException) (var2);

            stackIn_10_1 = new StringBuilder().append("hq.A(");

            if (param0 == null) {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "null";
              break L3;
            } else {
              stackIn_11_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackIn_11_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackIn_11_2 = "{...}";
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_11_0), stackIn_11_2 + ',' + param1 + ')');
        }
        return stackIn_7_0;
    }

    static {
        field_q = "<%0> has entered another game.";
    }
}
