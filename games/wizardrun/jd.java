/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jd {
    static int field_b;
    static int field_f;
    static String field_a;
    static String field_c;
    private rk field_h;
    private long field_g;
    private rk[] field_d;
    private int field_e;

    final void a(rk param0, long param1, int param2) {
        if (param2 <= 103) {
            return;
        }
        if (!(param0.field_l == null)) {
            param0.b(false);
        }
        rk var5 = ((jd) this).field_d[(int)((long)(((jd) this).field_e + -1) & param1)];
        param0.field_i = var5;
        param0.field_l = var5.field_l;
        param0.field_l.field_i = param0;
        param0.field_i.field_l = param0;
        param0.field_o = param1;
    }

    final rk a(boolean param0) {
        rk var2 = null;
        rk var3 = null;
        int var4 = 0;
        var4 = wizardrun.field_H;
        if (((jd) this).field_h != null) {
          var2 = ((jd) this).field_d[(int)((long)(((jd) this).field_e + -1) & ((jd) this).field_g)];
          if (param0) {
            ((jd) this).field_h = null;
            L0: while (true) {
              if (((jd) this).field_h == var2) {
                ((jd) this).field_h = null;
                return null;
              } else {
                if ((((jd) this).field_h.field_o ^ -1L) == (((jd) this).field_g ^ -1L)) {
                  var3 = ((jd) this).field_h;
                  ((jd) this).field_h = ((jd) this).field_h.field_i;
                  return var3;
                } else {
                  ((jd) this).field_h = ((jd) this).field_h.field_i;
                  continue L0;
                }
              }
            }
          } else {
            L1: while (true) {
              if (((jd) this).field_h == var2) {
                ((jd) this).field_h = null;
                return null;
              } else {
                if ((((jd) this).field_h.field_o ^ -1L) == (((jd) this).field_g ^ -1L)) {
                  var3 = ((jd) this).field_h;
                  ((jd) this).field_h = ((jd) this).field_h.field_i;
                  return var3;
                } else {
                  ((jd) this).field_h = ((jd) this).field_h.field_i;
                  continue L1;
                }
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        if (param0 == -1) {
            return;
        }
        field_b = 86;
    }

    final rk a(long param0, byte param1) {
        rk var4 = null;
        rk var5 = null;
        int var6 = 0;
        var6 = wizardrun.field_H;
        ((jd) this).field_g = param0;
        var4 = ((jd) this).field_d[(int)(param0 & (long)(-1 + ((jd) this).field_e))];
        ((jd) this).field_h = var4.field_i;
        if (param1 < 96) {
          jd.a(-102);
          L0: while (true) {
            if (var4 == ((jd) this).field_h) {
              ((jd) this).field_h = null;
              return null;
            } else {
              if ((param0 ^ -1L) != (((jd) this).field_h.field_o ^ -1L)) {
                ((jd) this).field_h = ((jd) this).field_h.field_i;
                continue L0;
              } else {
                var5 = ((jd) this).field_h;
                ((jd) this).field_h = ((jd) this).field_h.field_i;
                return var5;
              }
            }
          }
        } else {
          L1: while (true) {
            if (var4 == ((jd) this).field_h) {
              ((jd) this).field_h = null;
              return null;
            } else {
              if ((param0 ^ -1L) != (((jd) this).field_h.field_o ^ -1L)) {
                ((jd) this).field_h = ((jd) this).field_h.field_i;
                continue L1;
              } else {
                var5 = ((jd) this).field_h;
                ((jd) this).field_h = ((jd) this).field_h.field_i;
                return var5;
              }
            }
          }
        }
    }

    jd(int param0) {
        int var2 = 0;
        rk var3 = null;
        ((jd) this).field_d = new rk[param0];
        ((jd) this).field_e = param0;
        var2 = 0;
        L0: while (true) {
          if (var2 < param0) {
            rk dupTemp$2 = new rk();
            var3 = dupTemp$2;
            ((jd) this).field_d[var2] = dupTemp$2;
            var3.field_i = var3;
            var3.field_l = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 64;
        field_a = "Music";
        field_c = "To defeat the boss hit";
    }
}
