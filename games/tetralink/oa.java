/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends mc {
    static boolean field_w;
    static rj field_y;
    static ah field_p;
    static je field_u;
    static String field_t;
    int field_s;
    int field_C;
    int field_z;
    static String field_A;
    static int[] field_q;
    static wf field_x;
    static boolean field_r;
    static a field_v;
    static String field_n;
    static String field_o;
    static ri field_B;

    final static void a(byte param0, java.awt.Canvas param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            if (param0 <= -95) {
              mn.a((java.awt.Component) ((Object) param1), true);
              vb.a(-51, (java.awt.Component) ((Object) param1));
              if (null != qf.field_k) {
                qf.field_k.a(0, (java.awt.Component) ((Object) param1));
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2);
            stackOut_6_1 = new StringBuilder().append("oa.E(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L1;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, double param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        if (param1 != 1.0) {
          if (param2 != 45) {
            oa.a(-17);
            var4 = param0 >> -1512952592;
            var5 = (param0 & 65416) >> 10882792;
            var4 = (int)(Math.pow((double)var4 / 256.0, param1) * 256.0);
            var6 = param0 & 255;
            var5 = (int)(Math.pow((double)var5 / 256.0, param1) * 256.0);
            var6 = (int)(256.0 * Math.pow((double)var6 / 256.0, param1));
            return (var4 << 926160176) + ((var5 << -1068730168) + var6);
          } else {
            var4 = param0 >> -1512952592;
            var5 = (param0 & 65416) >> 10882792;
            var4 = (int)(Math.pow((double)var4 / 256.0, param1) * 256.0);
            var6 = param0 & 255;
            var5 = (int)(Math.pow((double)var5 / 256.0, param1) * 256.0);
            var6 = (int)(256.0 * Math.pow((double)var6 / 256.0, param1));
            return (var4 << 926160176) + ((var5 << -1068730168) + var6);
          }
        } else {
          return param0;
        }
    }

    public static void a(int param0) {
        field_q = null;
        field_v = null;
        field_x = null;
        field_u = null;
        field_n = null;
        field_p = null;
        field_A = null;
        if (param0 != -25731) {
          return;
        } else {
          field_y = null;
          field_B = null;
          field_o = null;
          field_t = null;
          return;
        }
    }

    private oa() throws Throwable {
        throw new Error();
    }

    final static boolean a(String param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (param1 == 65416) {
              if (fd.field_J == null) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                decompiledRegionSelector0 = 1;
                break L0;
              } else {
                L1: {
                  if (param0.toLowerCase().indexOf(fd.field_J.toLowerCase()) < 0) {
                    stackOut_9_0 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    break L1;
                  } else {
                    stackOut_8_0 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    break L1;
                  }
                }
                decompiledRegionSelector0 = 2;
                break L0;
              }
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) (var2);
            stackOut_11_1 = new StringBuilder().append("oa.D(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L2;
            }
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_6_0 != 0;
          } else {
            return stackIn_10_0 != 0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        if (param1 != 13309) {
          return 105;
        } else {
          var3 = -1 + param2 & param0 >> 1716681983;
          return var3 + ((param0 >>> -2026239393) + param0) % param2;
        }
    }

    static {
        field_t = "Connection restored.";
        field_u = new je();
        field_A = "Open";
        field_n = "Login: ";
        field_r = true;
        field_o = "Join <%0>'s game";
        field_q = new int[8192];
        field_v = new a();
    }
}
