/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aj extends ig {
    static int field_t;
    static f field_s;

    aj(f param0) {
        super((f) null, bd.field_n, param0, false);
        ((aj) this).field_j = false;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5) {
        ef var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        param3 = param3 + ia.field_i;
        var6 = go.field_l;
        param4 = param4 + ia.field_i;
        var7 = param2 + 48 * param3;
        var8 = go.field_l.a(param5, 148);
        if (param0 != 32293) {
          return;
        } else {
          L0: {
            var9 = oe.field_a[2].field_s * oe.field_a[2].field_m + (oe.field_a[2].field_t + -param4) * 12;
            if (-1 < (var9 ^ -1)) {
              var9 = -var9;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            var9 = 48 + -(param1 * (48 - var9) >> 1488094661);
            if (-49 < (var9 ^ -1)) {
              L2: {
                if (16 > var9) {
                  var9 = (15 + -var9) * 64 / 16 * 259 - -16760896;
                  break L2;
                } else {
                  var9 = 262913 * ((-(var9 * 64) + 3008) / 32);
                  break L2;
                }
              }
              int discarded$1 = ((vc) (Object) var6).a(param5, 486, -((vc) (Object) var6).field_o + var7 + (18 + (-(var8 * 10) + 10)), 148, 1000, var9, -1, 0, 0, 20);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    final void c(int param0, int param1, f[][] param2, int param3) {
        param2[param0][param3] = ((aj) this).b(param2, param0, (byte) -118, param3);
        if (param1 != 0) {
            field_t = -100;
        }
    }

    public static void g(int param0) {
        if (param0 <= 6) {
            Object var2 = null;
            si discarded$0 = aj.a(-69, (String) null);
            field_s = null;
            return;
        }
        field_s = null;
    }

    final static si a(int param0, String param1) {
        int var2 = 0;
        var2 = -91 % ((param0 - -46) / 45);
        if (sg.field_b != l.field_b) {
          if (sg.field_b == io.field_P) {
            if (!param1.equals((Object) (Object) ne.field_h)) {
              ne.field_h = param1;
              nn.field_a = null;
              sg.field_b = l.field_b;
              return null;
            } else {
              sg.field_b = tl.field_e;
              return nn.field_a;
            }
          } else {
            ne.field_h = param1;
            nn.field_a = null;
            sg.field_b = l.field_b;
            return null;
          }
        } else {
          return null;
        }
    }

    final static boolean e(byte param0) {
        int var1 = 0;
        var1 = 31 / ((72 - param0) / 39);
        if (eq.field_j >= 20) {
          if (kf.b(47)) {
            if (0 < kl.field_V) {
              if (ca.a((byte) 117)) {
                return false;
              } else {
                return true;
              }
            } else {
              return false;
            }
          } else {
            return true;
          }
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        wb discarded$0 = new wb();
        field_s = (f) (Object) new pj(-1, 0);
    }
}
