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
        Object var6 = null;
        int stackIn_16_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_18_1 = 0;
        int stackOut_15_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_17_1 = 0;
        int stackOut_16_0 = 0;
        int stackOut_16_1 = 0;
        var5 = client.field_A ? 1 : 0;
        sh.field_d = kl.field_z;
        if ((param1 ^ -1) == -256) {
          L0: {
            stackOut_15_0 = 0;
            stackIn_17_0 = stackOut_15_0;
            stackIn_16_0 = stackOut_15_0;
            if (jk.field_e >= 13) {
              stackOut_17_0 = stackIn_17_0;
              stackOut_17_1 = 0;
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              break L0;
            } else {
              stackOut_16_0 = stackIn_16_0;
              stackOut_16_1 = 1;
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              break L0;
            }
          }
          ea.field_x = bn.a(stackIn_18_0 != 0, stackIn_18_1 != 0);
          if (param3 != 0) {
            var6 = null;
            jc.a((String[]) null, -25, (String) null, -72);
            return;
          } else {
            return;
          }
        } else {
          if (100 > param1) {
            ea.field_x = un.a(param1, param2, 127);
            if (param3 == 0) {
              return;
            } else {
              var6 = null;
              jc.a((String[]) null, -25, (String) null, -72);
              return;
            }
          } else {
            if (param1 > 105) {
              ea.field_x = un.a(param1, param2, 127);
              if (param3 != 0) {
                var6 = null;
                jc.a((String[]) null, -25, (String) null, -72);
                return;
              } else {
                return;
              }
            } else {
              ea.field_x = wi.a(args, -3);
              if (param3 == 0) {
                return;
              } else {
                var6 = null;
                jc.a((String[]) null, -25, (String) null, -72);
                return;
              }
            }
          }
        }
    }

    public static void a(boolean param0) {
        Object var2 = null;
        field_h = null;
        field_e = null;
        field_d = null;
        if (!param0) {
          var2 = null;
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
            field_d = null;
        }
    }

    final static void a(ac param0, int param1) {
        param0.field_E = new int[]{param1};
        param0.field_y = new char[]{(char)63};
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = 0;
        field_a = "Logging in...";
        field_e = "You have <%0> unread messages!";
        field_b = "Simultaneous Bonus: ";
    }
}
