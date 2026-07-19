/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static w field_h;
    static int field_g;
    static ck field_f;
    static w field_d;
    static String field_b;
    static String field_a;
    static String field_e;
    static w field_c;

    final static void a(String[] args, int param1, String param2, int param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        String var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sh.field_d = kl.field_z;
              if (param1 == 255) {
                L2: {
                  stackOut_7_0 = 0;
                  stackIn_9_0 = stackOut_7_0;
                  stackIn_8_0 = stackOut_7_0;
                  if (jk.field_e >= 13) {
                    stackOut_9_0 = stackIn_9_0;
                    stackOut_9_1 = 0;
                    stackIn_10_0 = stackOut_9_0;
                    stackIn_10_1 = stackOut_9_1;
                    break L2;
                  } else {
                    stackOut_8_0 = stackIn_8_0;
                    stackOut_8_1 = 1;
                    stackIn_10_0 = stackOut_8_0;
                    stackIn_10_1 = stackOut_8_1;
                    break L2;
                  }
                }
                ea.field_x = bn.a(stackIn_10_0 != 0, stackIn_10_1 != 0);
                break L1;
              } else {
                if (100 > param1) {
                  ea.field_x = un.a(param1, param2, 127);
                  break L1;
                } else {
                  if (param1 > 105) {
                    ea.field_x = un.a(param1, param2, 127);
                    break L1;
                  } else {
                    ea.field_x = wi.a(args, -3);
                    break L1;
                  }
                }
              }
            }
            if (param3 == 0) {
              break L0;
            } else {
              var6 = (String) null;
              jc.a((String[]) null, -25, (String) null, -72);
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("jc.C(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (args == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          L4: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L4;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_20_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_e = null;
        field_d = null;
        field_f = null;
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void b(byte param0) {
    }

    final static void a(ac param0, int param1) {
        try {
            param0.field_E = new int[]{-1};
            param0.field_y = new char[]{'?'};
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "jc.B(" + (param0 != null ? "{...}" : "null") + ',' + -1 + ')');
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(byte param0) {
        hm.field_b = null;
        bf.field_v = null;
        ve.field_vc = null;
        tf.field_gb = null;
        jg.field_i = true;
        if (kf.field_Q != null) {
          jb.field_f = jf.field_e;
          wj.field_Mb = kf.field_Q;
          jf.field_e = null;
          kf.field_Q = null;
          wj.field_Mb.field_fb = -1;
          wj.field_Mb.field_Bb = -1;
          k.field_a = null;
          return;
        } else {
          k.field_a = null;
          return;
        }
    }

    static {
        field_g = 0;
        field_a = "Logging in...";
        field_e = "You have <%0> unread messages!";
        field_b = "Simultaneous Bonus: ";
    }
}
