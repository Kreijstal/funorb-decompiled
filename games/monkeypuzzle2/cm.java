/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cm extends ua implements ql {
    private String[] field_C;
    static String[] field_E;
    static le[] field_F;
    private t[] field_A;
    static te field_D;
    static String[] field_z;
    private sh field_H;
    static String field_B;
    static String field_G;

    final static void k(int param0) {
        if (!ad.a(false)) {
            return;
        }
        jk.a(-95, false, param0);
    }

    final static void a(int param0, byte param1) {
        hi.field_c = param0 >> 560186724 & 3;
        int var2 = 51 / ((param1 - -78) / 35);
        if (!((hi.field_c ^ -1) >= -3)) {
            hi.field_c = 2;
        }
        o.field_a = (14 & param0) >> 1729984962;
        if (2 < o.field_a) {
            o.field_a = 2;
        }
        ak.field_v = param0 & 3;
        if (!((ak.field_v ^ -1) >= -3)) {
            ak.field_v = 2;
        }
    }

    final void a(String[] param0, int param1) {
        int var3 = 0;
        int var4_int = 0;
        lc var4 = null;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = MonkeyPuzzle2.field_F ? 1 : 0;
          ((cm) this).field_u.b((byte) 121);
          if (param0 == null) {
            break L0;
          } else {
            if (0 != param0.length) {
              var3 = param0.length;
              ((cm) this).field_C = new String[var3];
              var4_int = 0;
              L1: while (true) {
                if (var3 <= var4_int) {
                  var4 = new lc(t.field_z, 0, 1);
                  ((cm) this).field_A = new t[var3 + 1];
                  if (param1 == 560186724) {
                    var5 = 0;
                    L2: while (true) {
                      if (var5 >= var3) {
                        ((cm) this).field_A[var3] = new t(lf.field_b, (of) this);
                        ((cm) this).field_A[var3].field_h = (ml) (Object) var4;
                        ((cm) this).field_A[var3].a(15, 13361, 0, 100, var3 * 16 + 36);
                        ((cm) this).b((byte) -89, (we) (Object) ((cm) this).field_A[var3]);
                        return;
                      } else {
                        ((cm) this).field_A[var5] = new t(((cm) this).field_C[var5], (of) this);
                        ((cm) this).field_A[var5].field_h = (ml) (Object) var4;
                        ((cm) this).field_A[var5].field_m = ad.field_j;
                        ((cm) this).field_A[var5].a(15, 13361, 0, 80, 20 + var5 * 16);
                        ((cm) this).b((byte) -104, (we) (Object) ((cm) this).field_A[var5]);
                        var5++;
                        continue L2;
                      }
                    }
                  } else {
                    return;
                  }
                } else {
                  ((cm) this).field_C[var4_int] = pj.a((byte) 83, (CharSequence) (Object) param0[var4_int]).replace(' ', ' ');
                  var4_int++;
                  continue L1;
                }
              }
            } else {
              break L0;
            }
          }
        }
        ((cm) this).field_C = null;
    }

    cm(sh param0) {
        super(0, 0, 0, 0, (ml) null);
        ((cm) this).field_H = param0;
    }

    public static void d(byte param0) {
        field_F = null;
        field_E = null;
        field_G = null;
        if (param0 < 104) {
            field_G = null;
        }
        field_B = null;
        field_z = null;
        field_D = null;
    }

    final boolean a(we param0, char param1, int param2, int param3) {
        if (super.a(param0, param1, param2, -20)) {
            return true;
        }
        if (98 == param2) {
            return ((cm) this).a((byte) 88, param0);
        }
        if (99 == param2) {
            return ((cm) this).b(param0, false);
        }
        int var5 = -16 % ((param3 - 37) / 50);
        return false;
    }

    final void a(int param0, int param1, int param2, int param3) {
        super.a(param0, param1, param2, param3);
        if (param1 != 0) {
            return;
        }
        ta var5 = t.field_z;
        if (!(((cm) this).field_C == null)) {
            int discarded$0 = var5.a(dh.field_a, ((cm) this).field_r + param3, param2 + ((cm) this).field_e, ((cm) this).field_l, 20, 16777215, -1, 0, 0, var5.field_C - -var5.field_D);
        }
    }

    public final void a(int param0, int param1, int param2, int param3, t param4) {
        int var6 = 0;
        int var7 = 0;
        L0: {
          var7 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param3 == 7) {
            break L0;
          } else {
            cm.d((byte) 77);
            break L0;
          }
        }
        var6 = 0;
        L1: while (true) {
          if (((cm) this).field_C.length <= var6) {
            L2: {
              if (param4 != ((cm) this).field_A[((cm) this).field_C.length]) {
                break L2;
              } else {
                ((cm) this).field_H.a(param3 ^ 207);
                break L2;
              }
            }
            return;
          } else {
            if (param4 == ((cm) this).field_A[var6]) {
              ((cm) this).field_H.a(((cm) this).field_C[var6], -94);
              var6++;
              continue L1;
            } else {
              var6++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0) {
        int var3 = 0;
        int var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        le var1 = new le(540, 140);
        mc.a(param0 + -8512, var1);
        ig.b();
        ge.d();
        uj.field_i = 0;
        ec.b(-128);
        le var2 = var1.d();
        for (var3 = 0; (var3 ^ -1) > -16; var3++) {
            var2.e(-2, -2, 16777215);
            ge.b(4, 4, 0, 0, 540, 140);
        }
        ca.field_f.e();
        var1.e(0, 0);
        tj.b(653);
        if (param0 != 15) {
            field_E = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = new String[]{"All other member expansions", "Loads more Achievements", "Full community features"};
        field_D = new te(4, 1, 1, 1);
        field_B = "Names should contain a maximum of 12 characters";
    }
}
