/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dn extends ma {
    int[] field_l;
    static String field_p;
    static int[][] field_m;
    static int[] field_n;
    static dd[] field_o;
    int field_q;

    public static void a(int param0) {
        if (param0 != -2048) {
            dn.c(111);
        }
        field_o = null;
        field_m = (int[][]) null;
        field_p = null;
        field_n = null;
    }

    final static int[] a(int[] param0, byte param1, int[] param2) {
        int[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int[] stackIn_6_0 = null;
        int[] stackIn_8_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = Pool.field_O;
        try {
          L0: {
            var6 = new int[param2.length];
            var3 = var6;
            var4 = 0;
            L1: while (true) {
              if (var4 >= param2.length) {
                if (param1 >= 2) {
                  stackIn_8_0 = (int[]) (var3);
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_6_0 = (int[]) null;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                var6[param0[var4]] = param2[var4];
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_11_0 = (RuntimeException) (var3_ref);

            stackIn_11_1 = new StringBuilder().append("dn.A(");

            if (param0 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "null";
              break L2;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_11_0);
              stackIn_12_1 = (StringBuilder) ((Object) stackIn_11_1);
              stackIn_12_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_14_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_12_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_12_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          return stackIn_8_0;
        }
    }

    final static void d(int param0) {
        if (param0 != 8192) {
            field_m = (int[][]) null;
        }
        wf.field_c = null;
        cl.field_c = null;
    }

    final static int a(int param0, int param1, int param2, or param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var4_int = param0 * sa.field_h.field_G;
              var5 = param2 * sa.field_h.field_G;
              sa.field_h.d(param3.field_g + ": " + param3.b((byte) 115), var4_int, var5, 16777215, 3355443);
              if (param3.field_i != null) {
                param2++;
                param2 = dn.a(1 + param0, 30409, param2, param3.field_i);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              if (param3.field_d != null) {
                param2++;
                param2 = dn.a(param0 + 1, 30409, param2, param3.field_d);
                break L2;
              } else {
                break L2;
              }
            }
            if (param1 == 30409) {
              stackIn_10_0 = param2;
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackIn_8_0 = -95;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("dn.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0;
        } else {
          return stackIn_10_0;
        }
    }

    final static void c(int param0) {
        int var1 = 24 / ((-10 - param0) / 49);
        if (!(null == jd.field_c)) {
            jd.field_c.c(-96);
            jd.field_c = null;
        }
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            return 77;
        }
        param0 = param0 >> 5;
        if ((param0 ^ -1) > -1) {
            if (-2048 <= param0) {
                return -te.field_m[-param0];
            }
            return 0;
        }
        if (param0 <= 2048) {
            return te.field_m[param0];
        }
        return 0;
    }

    final static boolean a(boolean param0, int param1) {
        if (!param0) {
            field_p = (String) null;
        }
        return -1 >= (param1 ^ -1) ? true : false;
    }

    dn(int param0, int[] param1) {
        try {
            this.field_q = param0;
            this.field_l = param1;
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "dn.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_n = new int[8192];
        field_p = "Ask to join <%0>'s game";
    }
}
