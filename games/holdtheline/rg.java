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
                field_f = (String) null;
            }
            var5 = this.field_c[(int)((long)(this.field_g + -1) & param0)];
            param2.field_l = var5.field_l;
            param2.field_n = var5;
            param2.field_l.field_n = param2;
            param2.field_n.field_l = param2;
            param2.field_i = param0;
        } catch (RuntimeException runtimeException) {
            throw kk.a((Throwable) ((Object) runtimeException), "rg.D(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
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
        this.field_a = param1;
        var4 = this.field_c[(int)((long)(this.field_g - 1) & param1)];
        this.field_i = var4.field_n;
        if (param0 == -25839) {
          L0: while (true) {
            if (this.field_i != var4) {
              if ((this.field_i.field_i ^ -1L) != (param1 ^ -1L)) {
                this.field_i = this.field_i.field_n;
                continue L0;
              } else {
                var5 = this.field_i;
                this.field_i = this.field_i.field_n;
                return var5;
              }
            } else {
              this.field_i = null;
              return null;
            }
          }
        } else {
          return (ln) null;
        }
    }

    rg(int param0) {
        ln dupTemp$2 = null;
        int var2 = 0;
        ln var3 = null;
        this.field_c = new ln[param0];
        this.field_g = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            dupTemp$2 = new ln();
            var3 = dupTemp$2;
            this.field_c[var2] = dupTemp$2;
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
        if (null != this.field_i) {
          if (param0 == 20240) {
            var2 = this.field_c[(int)((long)(this.field_g - 1) & this.field_a)];
            L0: while (true) {
              if (var2 != this.field_i) {
                if ((this.field_i.field_i ^ -1L) != (this.field_a ^ -1L)) {
                  this.field_i = this.field_i.field_n;
                  continue L0;
                } else {
                  var3 = this.field_i;
                  this.field_i = this.field_i.field_n;
                  return var3;
                }
              } else {
                this.field_i = null;
                return null;
              }
            }
          } else {
            return (ln) null;
          }
        } else {
          return null;
        }
    }

    static {
        field_d = "Hatchback";
        field_h = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
        field_e = true;
    }
}
