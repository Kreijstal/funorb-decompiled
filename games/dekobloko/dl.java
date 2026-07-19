/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dl extends ek {
    static int field_M;
    static int field_N;
    static String[] field_K;
    static String field_L;

    dl(String param0, kg param1, boolean param2) {
        this(param0, param1);
        try {
            this.field_H = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private dl(String param0, kg param1) {
        this(param0, bf.field_x.field_b, param1);
        try {
            this.field_p = bf.field_x.field_a;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(byte param0, boolean param1, ck param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var6 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 != tc.field_Tb) {
                if (param2 != null) {
                  param2.e(0, param3, param4);
                  break L1;
                } else {
                  hk.a(0, 0, 640, 480, 0);
                  break L1;
                }
              } else {
                lj.a(param4, param3, 0, true);
                break L1;
              }
            }
            L2: {
              if (param1) {
                fj.a(0, param4, -26, param3);
                break L2;
              } else {
                break L2;
              }
            }
            if (param0 >= 40) {
              break L0;
            } else {
              field_L = (String) null;
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var5);
            stackOut_12_1 = new StringBuilder().append("dl.I(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void b(boolean param0) {
        field_K = null;
        field_L = null;
    }

    final static void b(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        cl var4 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = client.field_A ? 1 : 0;
        try {
          L0: {
            var4 = (cl) ((Object) oe.field_I.c((byte) 113));
            L1: while (true) {
              if (var4 == null) {
                break L0;
              } else {
                fh.a((byte) 104, var4, 7);
                var4 = (cl) ((Object) oe.field_I.d(true));
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "dl.L(" + 640 + ',' + 7 + ')');
        }
    }

    private dl(String param0, gl param1, kg param2) {
        super(param0, param1, param2);
        try {
            this.field_p = bf.field_x.field_a;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "dl.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, int param1, int param2, int param3) {
        this.field_H = !this.field_H ? true : false;
        super.b(param0, param1, param2, param3);
    }

    final static boolean a(int param0) {
        return 250 < gd.field_e;
    }

    static {
        field_M = 20;
        field_L = "Stage <%0>";
        field_N = -1;
    }
}
