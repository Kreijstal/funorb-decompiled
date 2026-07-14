/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static String field_a;
    static o[] field_e;
    private int field_c;
    static o[] field_f;
    private gg field_h;
    private gg[] field_g;
    static int field_d;
    private gg field_b;
    private int field_i;

    final gg c(byte param0) {
        int var3 = 0;
        gg var4 = null;
        gg var5 = null;
        gg var9 = null;
        gg var12 = null;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 >= 49) {
          if (0 < ((qd) this).field_c) {
            if (((qd) this).field_g[((qd) this).field_c + -1] != ((qd) this).field_h) {
              var12 = ((qd) this).field_h;
              ((qd) this).field_h = var12.field_d;
              return var12;
            } else {
              L0: while (true) {
                if (((qd) this).field_i > ((qd) this).field_c) {
                  ((qd) this).field_c = ((qd) this).field_c + 1;
                  var4 = ((qd) this).field_g[((qd) this).field_c].field_d;
                  var9 = var4;
                  if (var4 != ((qd) this).field_g[((qd) this).field_c + -1]) {
                    ((qd) this).field_h = var9.field_d;
                    return var9;
                  } else {
                    continue L0;
                  }
                } else {
                  return null;
                }
              }
            }
          } else {
            L1: while (true) {
              if (((qd) this).field_i > ((qd) this).field_c) {
                ((qd) this).field_c = ((qd) this).field_c + 1;
                var4 = ((qd) this).field_g[((qd) this).field_c].field_d;
                var5 = var4;
                if (var4 != ((qd) this).field_g[((qd) this).field_c + -1]) {
                  ((qd) this).field_h = var5.field_d;
                  return var5;
                } else {
                  continue L1;
                }
              } else {
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final gg a(boolean param0, long param1) {
        gg var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        gg var4 = ((qd) this).field_g[(int)((long)(((qd) this).field_i + -1) & param1)];
        ((qd) this).field_b = var4.field_d;
        while (var4 != ((qd) this).field_b) {
            if (!((((qd) this).field_b.field_g ^ -1L) != (param1 ^ -1L))) {
                var5 = ((qd) this).field_b;
                ((qd) this).field_b = ((qd) this).field_b.field_d;
                return var5;
            }
            ((qd) this).field_b = ((qd) this).field_b.field_d;
        }
        ((qd) this).field_b = null;
        if (param0) {
            return null;
        }
        gg discarded$0 = ((qd) this).c((byte) -46);
        return null;
    }

    final gg b(int param0) {
        ((qd) this).field_c = param0;
        return ((qd) this).c((byte) 107);
    }

    final static void a(byte param0) {
        h.a(4, true);
        if (param0 == -13) {
            return;
        }
        qd.a(28);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 4) {
            return;
        }
        field_a = null;
        field_e = null;
    }

    final void a(byte param0, gg param1, long param2) {
        if (!(param1.field_a == null)) {
            param1.c(10);
        }
        gg var5 = ((qd) this).field_g[(int)(param2 & (long)(((qd) this).field_i - 1))];
        param1.field_d = var5;
        param1.field_a = var5.field_a;
        param1.field_a.field_d = param1;
        param1.field_d.field_a = param1;
        param1.field_g = param2;
        if (param0 > 22) {
            return;
        }
        field_d = -118;
    }

    final static boolean b(byte param0) {
        if (te.field_O == -1) {
            if (!(bf.c(79, 1))) {
                return false;
            }
            te.field_O = te.field_N.j(255);
            te.field_N.field_m = 0;
        }
        if ((te.field_O ^ -1) == 1) {
            if (!bf.c(36, 2)) {
                return false;
            }
            te.field_O = te.field_N.i(-22);
            te.field_N.field_m = 0;
        }
        if (param0 <= 124) {
            qd.a(-104);
            return bf.c(100, te.field_O);
        }
        return bf.c(100, te.field_O);
    }

    qd(int param0) {
        int var2 = 0;
        gg var3 = null;
        ((qd) this).field_c = 0;
        ((qd) this).field_g = new gg[param0];
        ((qd) this).field_i = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            var3 = new gg();
            ((qd) this).field_g[var2] = new gg();
            var3.field_a = var3;
            var3.field_d = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "To server list";
        field_d = 0;
    }
}
