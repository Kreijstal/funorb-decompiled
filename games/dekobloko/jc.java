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
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_10_1 = 0;
        int stackOut_9_0 = 0;
        int stackOut_9_1 = 0;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                sh.field_d = kl.field_z;
                if ((param1 ^ -1) == -256) {
                  break L2;
                } else {
                  L3: {
                    if (100 > param1) {
                      break L3;
                    } else {
                      if (param1 > 105) {
                        break L3;
                      } else {
                        ea.field_x = wi.a(args, -3);
                        if (var5 == 0) {
                          break L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  ea.field_x = un.a(param1, param2, 127);
                  if (var5 == 0) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L4: {
                stackOut_8_0 = 0;
                stackIn_10_0 = stackOut_8_0;
                stackIn_9_0 = stackOut_8_0;
                if (jk.field_e >= 13) {
                  stackOut_10_0 = stackIn_10_0;
                  stackOut_10_1 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  stackIn_11_1 = stackOut_10_1;
                  break L4;
                } else {
                  stackOut_9_0 = stackIn_9_0;
                  stackOut_9_1 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  stackIn_11_1 = stackOut_9_1;
                  break L4;
                }
              }
              ea.field_x = bn.a(stackIn_11_0 != 0, stackIn_11_1 != 0);
              break L1;
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
          L5: {
            var4 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var4);
            stackOut_15_1 = new StringBuilder().append("jc.C(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (args == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L5;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L5;
            }
          }
          L6: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L6;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        ac var2 = null;
        field_h = null;
        field_e = null;
        field_d = null;
        if (!param0) {
          var2 = (ac) null;
          jc.a((ac) null, -72);
          field_f = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        } else {
          field_f = null;
          field_b = null;
          field_a = null;
          field_c = null;
          return;
        }
    }

    final static void b(byte param0) {
        if (param0 != 84) {
            field_d = (w) null;
        }
    }

    final static void a(ac param0, int param1) {
        try {
            param0.field_E = new int[]{param1};
            param0.field_y = new char[]{(char)63};
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) ((Object) runtimeException), "jc.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
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
        if (param0 >= 97) {
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
        } else {
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
