/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ln extends ma {
    static String field_l;
    static vh field_q;
    static String[] field_r;
    static tk field_n;
    static vh[] field_v;
    static int field_o;
    static dd[] field_s;
    static int field_t;
    static boolean field_p;
    static int[] field_m;
    static so[] field_u;

    private ln() throws Throwable {
        throw new Error();
    }

    final static dd[] a(int param0, byte param1, di param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        dd[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vj.a(param0, param2, param3, (byte) 121)) {
              var4_int = -39 / ((param1 - -12) / 57);
              stackIn_4_0 = sg.h(152);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4 = decompiledCaughtException;
            stackIn_7_0 = (RuntimeException) (var4);

            stackIn_7_1 = new StringBuilder().append("ln.B(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "null";
              break L1;
            } else {
              stackIn_8_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_8_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackIn_8_2 = "{...}";
              break L1;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), stackIn_8_2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    final static void a(int[] param0, int param1, eg param2) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        var7 = Pool.field_O;
        try {
          L0: {
            d.a(param2, -23109);
            var4 = (param2.field_D + param2.field_w) / 2;
            var5 = (param2.field_y + param2.field_S) / 2;
            var6 = (param2.field_x - -param2.field_V) / 2;
            var3_int = 0;
            L1: while (true) {
              if (param2.field_g.length <= var3_int) {
                var3_int = param1;
                L2: while (true) {
                  if (var3_int >= param2.field_Y.length) {
                    var3_int = 0;
                    L3: while (true) {
                      if (param2.field_q.length <= var3_int) {
                        param0[0] = var4;
                        param0[2] = var6;
                        param0[1] = var5;
                        param2.a();
                        break L0;
                      } else {
                        param2.field_q[var3_int] = param2.field_q[var3_int] - var6;
                        var3_int++;
                        continue L3;
                      }
                    }
                  } else {
                    param2.field_Y[var3_int] = param2.field_Y[var3_int] - var5;
                    var3_int++;
                    continue L2;
                  }
                }
              } else {
                param2.field_g[var3_int] = param2.field_g[var3_int] - var4;
                var3_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var3 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var3);

            stackIn_14_1 = new StringBuilder().append("ln.D(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_17_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_15_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L5;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L5;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_18_2 + ')');
        }
    }

    public static void a(int param0) {
        field_m = null;
        field_q = null;
        field_r = null;
        field_u = null;
        field_v = null;
        field_s = null;
        field_n = null;
        field_l = null;
        if (param0 != 27817) {
            field_m = (int[]) null;
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
            field_l = (String) null;
        }
        ph.a((byte) 118);
    }

    static {
        field_l = "Hide";
        field_m = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        field_t = 0;
    }
}
