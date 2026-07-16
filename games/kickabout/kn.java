/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn extends i {
    static String[] field_G;
    static ut field_J;
    static hd field_F;
    static String field_H;
    private hd field_K;
    private dn[] field_I;

    public static void g(int param0) {
        field_J = null;
        if (param0 != 2) {
            field_H = null;
        }
        field_F = null;
        field_G = null;
        field_H = null;
    }

    kn() {
        super(27);
        dn var3 = null;
        ((kn) this).field_K = new hd();
        ((kn) this).field_I = new dn[ok.field_a.a(false)];
        int var1 = 0;
        oi var2 = (oi) (Object) ok.field_a.g(24009);
        while (var2 != null) {
            var3 = new dn(var2.field_j);
            var3.field_J = var3.field_mb * (var1 / 5);
            var3.field_s = var1 % 5 * var3.field_q;
            ((kn) this).field_K.a((byte) -107, (hd) (Object) var3);
            int incrementValue$0 = var1;
            var1++;
            ((kn) this).field_I[incrementValue$0] = var3;
            var2 = (oi) (Object) ok.field_a.c(33);
        }
        ((kn) this).field_K.a(true, 300, 100, 80, 200);
    }

    final int a(byte param0) {
        if (param0 < 75) {
            return 97;
        }
        return 320;
    }

    final int b(int param0) {
        if (param0 != -1379118556) {
            ((kn) this).field_I = null;
        }
        return 470;
    }

    final static int a(int param0, int param1, boolean param2, int param3) {
        L0: {
          if (param1 > 40) {
            break L0;
          } else {
            int discarded$2 = kn.a(-66, -60, false, 126);
            break L0;
          }
        }
        L1: {
          L2: {
            if (param3 == 0) {
              break L2;
            } else {
              if ((param3 ^ -1) == -2) {
                break L2;
              } else {
                if (param2) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
          }
          if (0 != param0) {
            if ((param0 ^ -1) != -2) {
              if (2 == param0) {
                return 3;
              } else {
                break L1;
              }
            } else {
              return 1;
            }
          } else {
            return 2;
          }
        }
        if (param3 == 2) {
          return 4;
        } else {
          if (param3 == 3) {
            return 6;
          } else {
            return 0;
          }
        }
    }

    final void a(byte param0, int param1, int param2) {
        int var5 = 0;
        dn var6 = null;
        String[] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        dn[] var13 = null;
        var12 = Kickabout.field_G;
        super.a((byte) -68, param1, param2);
        var13 = ((kn) this).field_I;
        var5 = 0;
        L0: while (true) {
          if (var13.length <= var5) {
            L1: {
              ((kn) this).field_K.field_J = param2 + 70;
              ((kn) this).field_K.field_s = 245 + param1;
              if (param0 < -11) {
                break L1;
              } else {
                field_H = null;
                break L1;
              }
            }
            ((kn) this).field_K.a(79, false);
            return;
          } else {
            var6 = var13[var5];
            if (var6 != null) {
              if (var6.field_gb) {
                on.a(var6.field_F, var6.field_T, var6.field_q, var6.field_mb, 8, 65793, 128);
                on.f(var6.field_F, var6.field_T, var6.field_q, var6.field_mb, 8, 6710886);
                qe.field_i[iw.field_e[var6.field_Bb]].c(64 + param1, param2 - -70);
                un.field_d.d(kw.field_c[var6.field_Bb].toLowerCase(), (qe.field_i[iw.field_e[var6.field_Bb]].field_q >> 348142625) + (64 + param1), 205 + param2, 16777215, -1);
                var7 = new String[16];
                var8 = un.field_d.a(lw.field_a[var6.field_Bb], new int[1], var7);
                var9 = 0;
                var10 = un.field_d.field_p + un.field_d.field_L;
                var11 = 0;
                L2: while (true) {
                  if (var11 < var8) {
                    int discarded$1 = un.field_d.a(var7[var11].toLowerCase(), -20 + param1, var9 + 162 + param2, 300, 100, 11184810, -1, 1, 1, 0);
                    var9 = var9 + var10;
                    var11++;
                    continue L2;
                  } else {
                    var5++;
                    continue L0;
                  }
                }
              } else {
                var5++;
                continue L0;
              }
            } else {
              var5++;
              continue L0;
            }
          }
        }
    }

    final void a(int param0, boolean param1) {
        if (param0 != 3) {
            field_H = null;
        }
        ((kn) this).field_K.b(0, param1);
    }

    final void a(int param0, int param1) {
        super.a(82, param1);
        if (param0 < 60) {
            ((kn) this).a(-61, -29);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "select a <%0> auction";
    }
}
