/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static String field_d;
    private ln[] field_c;
    private int field_g;
    private ln field_i;
    static int field_j;
    static boolean field_e;
    static char[] field_h;
    private long field_a;
    static String field_f;
    static el field_b;

    final void a(long param0, byte param1, ln param2) {
        ln var5 = null;
        ln var6 = null;
        ln var7 = null;
        ln var8 = null;
        ln var9 = null;
        if (param2.field_l == null) {
          if (param1 != -75) {
            field_f = null;
            var8 = ((rg) this).field_c[(int)((long)(((rg) this).field_g + -1) & param0)];
            var5 = var8;
            param2.field_l = var8.field_l;
            param2.field_n = var5;
            param2.field_l.field_n = param2;
            param2.field_n.field_l = param2;
            param2.field_i = param0;
            return;
          } else {
            var9 = ((rg) this).field_c[(int)((long)(((rg) this).field_g + -1) & param0)];
            var5 = var9;
            param2.field_l = var9.field_l;
            param2.field_n = var5;
            param2.field_l.field_n = param2;
            param2.field_n.field_l = param2;
            param2.field_i = param0;
            return;
          }
        } else {
          param2.a((byte) -42);
          if (param1 == -75) {
            var6 = ((rg) this).field_c[(int)((long)(((rg) this).field_g + -1) & param0)];
            var5 = var6;
            param2.field_l = var6.field_l;
            param2.field_n = var5;
            param2.field_l.field_n = param2;
            param2.field_n.field_l = param2;
            param2.field_i = param0;
            return;
          } else {
            field_f = null;
            var7 = ((rg) this).field_c[(int)((long)(((rg) this).field_g + -1) & param0)];
            var5 = var7;
            param2.field_l = var7.field_l;
            param2.field_n = var5;
            param2.field_l.field_n = param2;
            param2.field_n.field_l = param2;
            param2.field_i = param0;
            return;
          }
        }
    }

    final static void b(int param0) {
        int var1 = 72 / ((param0 - 1) / 34);
        if (!(pk.field_G == null)) {
            pk.field_G.a();
        }
        if (!(jd.field_G == null)) {
            jd.field_G.a();
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        if (param0 >= -76) {
            return;
        }
        field_f = null;
        field_d = null;
    }

    final ln a(int param0, long param1) {
        ln var4 = null;
        ln var5 = null;
        int var6 = 0;
        var6 = HoldTheLine.field_D;
        ((rg) this).field_a = param1;
        var4 = ((rg) this).field_c[(int)((long)(((rg) this).field_g - 1) & param1)];
        ((rg) this).field_i = var4.field_n;
        if (param0 == -25839) {
          L0: while (true) {
            if (((rg) this).field_i != var4) {
              if ((((rg) this).field_i.field_i ^ -1L) != (param1 ^ -1L)) {
                ((rg) this).field_i = ((rg) this).field_i.field_n;
                continue L0;
              } else {
                var5 = ((rg) this).field_i;
                ((rg) this).field_i = ((rg) this).field_i.field_n;
                return var5;
              }
            } else {
              ((rg) this).field_i = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    rg(int param0) {
        int var2 = 0;
        ln var3 = null;
        ((rg) this).field_c = new ln[param0];
        ((rg) this).field_g = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            var3 = new ln();
            ((rg) this).field_c[var2] = new ln();
            var3.field_n = var3;
            var3.field_l = var3;
            var2++;
            continue L0;
          } else {
          }
        }
    }

    final ln a(int param0) {
        ln var2 = null;
        ln var3 = null;
        int var4 = 0;
        var4 = HoldTheLine.field_D;
        if (null != ((rg) this).field_i) {
          if (param0 == 20240) {
            var2 = ((rg) this).field_c[(int)((long)(((rg) this).field_g - 1) & ((rg) this).field_a)];
            L0: while (true) {
              if (var2 != ((rg) this).field_i) {
                if ((((rg) this).field_i.field_i ^ -1L) != (((rg) this).field_a ^ -1L)) {
                  ((rg) this).field_i = ((rg) this).field_i.field_n;
                  continue L0;
                } else {
                  var3 = ((rg) this).field_i;
                  ((rg) this).field_i = ((rg) this).field_i.field_n;
                  return var3;
                }
              } else {
                ((rg) this).field_i = null;
                return null;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Hatchback";
        field_h = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_e = true;
    }
}
