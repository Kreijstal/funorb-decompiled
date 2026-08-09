/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ks extends ms {
    boolean field_z;
    static String[] field_u;
    static String field_v;
    static kl field_A;
    static int field_y;
    volatile boolean field_x;
    boolean field_w;

    public static void e(byte param0) {
        field_v = null;
        if (param0 >= -11) {
            field_y = 76;
            field_u = null;
            field_A = null;
            return;
        }
        field_u = null;
        field_A = null;
    }

    abstract byte[] d(byte param0);

    abstract int g(int param0);

    final static sd a(int param0, cf param1, vh param2) {
        sd var3 = null;
        RuntimeException var3_ref = null;
        sd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 900) {
                break L1;
              } else {
                ks.e((byte) 15);
                break L1;
              }
            }
            var3 = new sd();
            var3.field_m = param2.k(0);
            var3.field_u = param2.h((byte) 121);
            var3.field_p = ev.a(param2, (byte) -98);
            var3.field_q = uq.a(param2, false);
            var3.field_t = gt.a(-2, param2);
            var3.field_n = en.a(param2, (byte) -24);
            stackIn_3_0 = (sd) (var3);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3_ref = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3_ref);

            stackIn_6_1 = new StringBuilder().append("ks.F(").append(param0).append(',');

            if (param1 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',');

            if (param2 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L3;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L3;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_7_0), stackIn_10_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(kk param0, boolean param1, int param2, vj param3, int param4, int param5, int param6, js param7, int param8) {
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_21_1 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        StringBuilder stackIn_24_1 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        try {
          L0: {
            L1: {
              var9_int = 0;
              if (param8 == -10374) {
                break L1;
              } else {
                field_u = (String[]) null;
                break L1;
              }
            }
            L2: {
              var10 = param5;
              var11 = 1024;
              var12 = 2048;
              var13 = 12;
              var14 = var12 + -(var12 / var13);
              var15 = 0;
              if (param1) {
                stackIn_5_0 = 900;
                break L2;
              } else {
                stackIn_5_0 = 800;
                break L2;
              }
            }
            L3: {
              var16 = stackIn_5_0;
              var17 = -1400;
              tm.a();
              tm.c(40 + param6, 60 + param2);
              if (param7 != null) {
                break L3;
              } else {
                if (param0 != null) {
                  break L3;
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            }
            L4: {
              if (param0 != null) {
                break L4;
              } else {
                param0 = param7.a(be.field_x, fm.field_a, var15, var16, var17);
                break L4;
              }
            }
            L5: {
              if (param3 != null) {
                param0 = param3.a(false, true, false, param0);
                break L5;
              } else {
                break L5;
              }
            }
            param0.b(param4, param4, param4);
            param0.a(var9_int, var10, var11, var14, var15, var16, var17, -1L);
            decompiledRegionSelector0 = 1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var9 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var9);

            stackIn_18_1 = new StringBuilder().append("ks.E(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L6;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L6;
            }
          }
          L7: {


            stackIn_21_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_19_2).append(',').append(param1).append(',').append(param2).append(',');

            if (param3 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L7;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L7;
            }
          }
          L8: {


            stackIn_24_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_22_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');

            if (param7 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L8;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L8;
            }
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), stackIn_25_2 + ',' + param8 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    ks() {
        this.field_x = true;
    }

    static {
        field_v = "Log in";
    }
}
