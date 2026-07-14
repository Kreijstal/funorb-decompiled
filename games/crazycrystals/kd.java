/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kd extends se {
    static String field_i;
    static md field_n;
    static String field_m;
    static int[] field_j;
    static double[] field_l;
    private String field_p;
    static String field_k;
    private oo field_o;
    private boolean field_q;

    public static void e(byte param0) {
        field_l = null;
        if (param0 != -33) {
            return;
        }
        field_m = null;
        field_j = null;
        field_i = null;
        field_k = null;
        field_n = null;
    }

    final static void d(int param0) {
        int var2 = 0;
        var2 = CrazyCrystals.field_B;
        if (md.l(-81)) {
          if (param0 != 3) {
            return;
          } else {
            boolean discarded$2 = kf.field_h.a(eb.field_l, false, true, vl.field_a);
            kf.field_h.b(false);
            L0: while (true) {
              if (!ge.b(-65)) {
                return;
              } else {
                boolean discarded$3 = kf.field_h.a(pj.field_q, false, c.field_p);
                continue L0;
              }
            }
          }
        } else {
          if (ph.field_E != null) {
            if (!ph.field_E.field_d) {
              return;
            } else {
              no.e((byte) -23);
              kf.field_h.b(-3264, (qm) (Object) new gn(kf.field_h, ab.field_A));
              return;
            }
          } else {
            return;
          }
        }
    }

    kd(ga param0, ga param1) {
        super(param0);
        ((kd) this).field_p = "";
        ((kd) this).field_q = false;
        ((kd) this).field_o = new oo(param0, param1);
    }

    final oi a(String param0, byte param1) {
        e var3 = null;
        oi stackIn_7_0 = null;
        oi stackIn_12_0 = null;
        oi stackOut_11_0 = null;
        oi stackOut_10_0 = null;
        oi stackOut_6_0 = null;
        oi stackOut_5_0 = null;
        if (((kd) this).field_o.a(param0, param1) == rk.field_c) {
          return rk.field_c;
        } else {
          if (!param0.equals((Object) (Object) ((kd) this).field_p)) {
            var3 = ke.a(param0, 28515);
            if (!var3.b(param1 ^ 82)) {
              return ec.field_h;
            } else {
              L0: {
                ((kd) this).field_p = param0;
                ((kd) this).field_q = var3.a((byte) 47);
                if (((kd) this).field_q) {
                  stackOut_11_0 = ih.field_b;
                  stackIn_12_0 = stackOut_11_0;
                  break L0;
                } else {
                  stackOut_10_0 = rk.field_c;
                  stackIn_12_0 = stackOut_10_0;
                  break L0;
                }
              }
              return stackIn_12_0;
            }
          } else {
            L1: {
              if (((kd) this).field_q) {
                stackOut_6_0 = ih.field_b;
                stackIn_7_0 = stackOut_6_0;
                break L1;
              } else {
                stackOut_5_0 = rk.field_c;
                stackIn_7_0 = stackOut_5_0;
                break L1;
              }
            }
            return stackIn_7_0;
          }
        }
    }

    final String a(String param0, int param1) {
        int var3 = 0;
        if (((kd) this).field_o.a(param0, (byte) -122) == rk.field_c) {
          return ((kd) this).field_o.a(param0, -21);
        } else {
          if (((kd) this).a(param0, (byte) -122) == rk.field_c) {
            return ai.field_l;
          } else {
            var3 = -117 / ((41 - param1) / 49);
            return rl.field_f;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Bomb";
        field_j = new int[]{0, 1, 3, 7, 15, 31, 63, 127, 255, 511, 1023, 2047, 4095, 8191, 16383, 32767, 65535, 131071, 262143, 524287, 1048575, 2097151, 4194303, 8388607, 16777215, 33554431, 67108863, 134217727, 268435455, 536870911, 1073741823, 2147483647, -1};
        field_k = "This password contains your email address, and would be easy to guess";
        field_m = "This is a laser hub.<br>It beams lasers in all<br>directions. Be careful!";
    }
}
