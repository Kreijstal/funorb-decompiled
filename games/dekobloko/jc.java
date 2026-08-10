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
        int var5 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        String var6 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              sh.field_d = kl.field_z;
              if ((param1 ^ -1) == -256) {
                L2: {
                  stackIn_9_0 = 0;

                  if (jk.field_e >= 13) {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 0;
                    break L2;
                  } else {
                    stackIn_10_0 = stackIn_9_0;
                    stackIn_10_1 = 1;
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
            stackIn_16_0 = (RuntimeException) (var4);

            stackIn_16_1 = new StringBuilder().append("jc.C(");

            if (args == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L3;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L3;
            }
          }
          L4: {


            stackIn_19_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "null";
              break L4;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_20_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackIn_20_2 = "{...}";
              break L4;
            }
          }
          throw dh.a((Throwable) ((Object) stackIn_17_0), stackIn_20_2 + ',' + param3 + ')');
        }
    }

    public static void a(boolean param0) {
        ac var2;
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
