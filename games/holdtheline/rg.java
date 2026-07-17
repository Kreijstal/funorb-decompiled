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
        try {
            if (param2.field_l != null) {
                param2.a((byte) -42);
            }
            if (param1 != -75) {
                field_f = null;
            }
            var5 = ((rg) this).field_c[(int)((long)(((rg) this).field_g + -1) & param0)];
            param2.field_l = var5.field_l;
            param2.field_n = var5;
            param2.field_l.field_n = param2;
            param2.field_n.field_l = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) (Object) runtimeException, "rg.D(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final static void b(int param0) {
        int var1 = 36;
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
              if (~((rg) this).field_i.field_i != ~param1) {
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
            ln dupTemp$2 = new ln();
            var3 = dupTemp$2;
            ((rg) this).field_c[var2] = dupTemp$2;
            var3.field_n = var3;
            var3.field_l = var3;
            var2++;
            continue L0;
          } else {
            return;
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
                if (~((rg) this).field_i.field_i != ~((rg) this).field_a) {
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
        field_h = new char[]{' ', ' ', '_', '-', 'à', 'á', 'â', 'ä', 'ã', 'À', 'Á', 'Â', 'Ä', 'Ã', 'è', 'é', 'ê', 'ë', 'È', 'É', 'Ê', 'Ë', 'í', 'î', 'ï', 'Í', 'Î', 'Ï', 'ò', 'ó', 'ô', 'ö', 'õ', 'Ò', 'Ó', 'Ô', 'Ö', 'Õ', 'ù', 'ú', 'û', 'ü', 'Ù', 'Ú', 'Û', 'Ü', 'ç', 'Ç', 'ÿ', 'Ÿ', 'ñ', 'Ñ', 'ß'};
        field_e = true;
    }
}
