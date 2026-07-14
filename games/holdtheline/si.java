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
        int var1 = 0;
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
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        if (param1 != 33) {
          var6 = null;
          si.a((String) null, (String[]) null, 106, -22);
          var4 = param0.c(param2, param1 ^ 34);
          var5 = param0.a(var4, param3, false);
          return tf.a(var5, param0, var4, false);
        } else {
          var4 = param0.c(param2, param1 ^ 34);
          var5 = param0.a(var4, param3, false);
          return tf.a(var5, param0, var4, false);
        }
    }

    final static void a(String param0, String[] param1, int param2, int param3) {
        int var5 = 0;
        Object var6 = null;
        int stackIn_5_0 = 0;
        int stackIn_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        var5 = HoldTheLine.field_D;
        bb.field_a = fd.field_c;
        if (param2 <= -53) {
          if (param3 != 255) {
            if (param3 >= 100) {
              if (-106 > (param3 ^ -1)) {
                bg.field_d = ij.a(param0, 256, param3);
                return;
              } else {
                bg.field_d = ca.a(param1, (byte) 119);
                return;
              }
            } else {
              bg.field_d = ij.a(param0, 256, param3);
              return;
            }
          } else {
            L0: {
              if (13 <= u.field_V) {
                stackOut_15_0 = 0;
                stackIn_16_0 = stackOut_15_0;
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_16_0 = stackOut_14_0;
                break L0;
              }
            }
            bg.field_d = kl.a(stackIn_16_0 != 0, 0);
            return;
          }
        } else {
          var6 = null;
          byte[] discarded$1 = si.a(-106, (String) null);
          if (param3 != 255) {
            if (param3 >= 100) {
              if (-106 <= (param3 ^ -1)) {
                bg.field_d = ca.a(param1, (byte) 119);
                return;
              } else {
                bg.field_d = ij.a(param0, 256, param3);
                return;
              }
            } else {
              bg.field_d = ij.a(param0, 256, param3);
              return;
            }
          } else {
            L1: {
              if (13 <= u.field_V) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L1;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L1;
              }
            }
            bg.field_d = kl.a(stackIn_5_0 != 0, 0);
            return;
          }
        }
    }

    final void a(n param0, byte param1) {
        super.a(param0, (byte) 99);
        int var3 = 0 / ((-38 - param1) / 50);
    }

    final static byte[] a(int param0, String param1) {
        if (param0 != 6) {
            field_kb = null;
            return lg.field_q.a(param1, false, "");
        }
        return lg.field_q.a(param1, false, "");
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_mb = "Type your age in years";
        field_ob = new int[8192];
        field_nb = new h();
        field_kb = new float[]{0.25f, 1.0f, 3.0f, 250.0f, 1500.0f, 150.0f, 12.0f, 10.0f};
    }
}
