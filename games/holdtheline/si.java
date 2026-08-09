/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class si extends dc {
    static gn field_lb;
    static h field_nb;
    static String field_mb;
    static int[] field_ob;
    static float[] field_kb;
    static int field_jb;

    si(qj param0, n param1) {
        super(param0, param1, 33, 20, 30);
    }

    final static ga n(int param0) {
        int var1;
        var1 = 93 % ((param0 - 49) / 42);
        if (jb.field_X == null) {
          jb.field_X = new ga();
          jb.field_X.a(hl.field_g, (byte) 39);
          jb.field_X.field_c = 7697781;
          jb.field_X.field_n = 0;
          jb.field_X.field_q = 2763306;
          jb.field_X.field_e = 4;
          jb.field_X.field_g = 14;
          jb.field_X.field_i = 6;
          jb.field_X.field_m = mo.field_w;
          jb.field_X.field_b = 5;
          return jb.field_X;
        } else {
          return jb.field_X;
        }
    }

    public static void h(byte param0) {
        field_nb = null;
        field_ob = null;
        field_lb = null;
        field_kb = null;
        int var1 = 53 / ((param0 - 6) / 55);
        field_mb = null;
    }

    final static hj[] a(gn param0, int param1, String param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        String[] var6 = null;
        hj[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1 == 33) {
                break L1;
              } else {
                var6 = (String[]) null;
                si.a((String) null, (String[]) null, 106, -22);
                break L1;
              }
            }
            var4_int = param0.c(param2, param1 ^ 34);
            var5 = param0.a(var4_int, param3, false);
            stackIn_3_0 = tf.a(var5, param0, var4_int, false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var4);

            stackIn_6_1 = new StringBuilder().append("si.W(");

            if (param0 == null) {
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


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_7_2).append(',').append(param1).append(',');

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
          L4: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(',');

            if (param3 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L4;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_13_2 + ')');
        }
        return stackIn_3_0;
    }

    final static void a(String param0, String[] param1, int param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = HoldTheLine.field_D;
        try {
          L0: {
            L1: {
              bb.field_a = fd.field_c;
              if (param2 <= -53) {
                break L1;
              } else {
                var6 = (String) null;
                si.a(-106, (String) null);
                break L1;
              }
            }
            if (param3 == 255) {
              L2: {
                if (13 <= u.field_V) {
                  stackIn_13_0 = 0;
                  break L2;
                } else {
                  stackIn_13_0 = 1;
                  break L2;
                }
              }
              bg.field_d = kl.a(stackIn_13_0 != 0, 0);
              break L0;
            } else {
              if (param3 < 100) {
                bg.field_d = ij.a(param0, 256, param3);
                return;
              } else {
                if (-106 <= (param3 ^ -1)) {
                  bg.field_d = ca.a(param1, (byte) 119);
                  return;
                } else {
                  bg.field_d = ij.a(param0, 256, param3);
                  return;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var4);

            stackIn_17_1 = new StringBuilder().append("si.U(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L3;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');

            if (param1 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L4;
            }
          }
          throw kk.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(n param0, byte param1) {
        try {
            super.a(param0, (byte) 99);
            int var3_int = 0 / ((-38 - param1) / 50);
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "si.HA(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static byte[] a(int param0, String param1) {
        RuntimeException var2 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == 6) {
                break L1;
              } else {
                field_kb = (float[]) null;
                break L1;
              }
            }
            stackIn_3_0 = lg.field_q.a(param1, false, "");
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var2);

            stackIn_6_1 = new StringBuilder().append("si.M(").append(param0).append(',');

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
          throw kk.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    static {
        field_mb = "Type your age in years";
        field_ob = new int[8192];
        field_nb = new h();
        field_kb = new float[]{0.25f, 1.0f, 3.0f, 250.0f, 1500.0f, 150.0f, 12.0f, 10.0f};
    }
}
