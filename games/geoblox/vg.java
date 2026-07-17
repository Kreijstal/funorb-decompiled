/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vg {
    static String field_b;
    static int field_a;
    static rl field_i;
    private int field_h;
    static String field_d;
    private long field_e;
    static boolean[] field_j;
    private rc[] field_g;
    private rc field_c;
    static dm[] field_f;

    final void a(long param0, int param1, rc param2) {
        rc var5 = null;
        try {
            if (null != param2.field_l) {
                param2.a((byte) 65);
            }
            int var6 = -92 % ((param1 - 34) / 51);
            var5 = ((vg) this).field_g[(int)(param0 & (long)(-1 + ((vg) this).field_h))];
            param2.field_k = var5;
            param2.field_l = var5.field_l;
            param2.field_l.field_k = param2;
            param2.field_i = param0;
            param2.field_k.field_l = param2;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "vg.B(" + param0 + 44 + param1 + 44 + (param2 != null ? "{...}" : "null") + 41);
        }
    }

    final rc a(int param0) {
        rc var2 = null;
        rc var3 = null;
        int var4 = 0;
        var4 = Geoblox.field_C;
        if (null != ((vg) this).field_c) {
          var2 = ((vg) this).field_g[(int)(((vg) this).field_e & (long)(-1 + ((vg) this).field_h))];
          if (param0 != -29925) {
            ((vg) this).field_g = null;
            L0: while (true) {
              if (((vg) this).field_c != var2) {
                if (((vg) this).field_e == ((vg) this).field_c.field_i) {
                  var3 = ((vg) this).field_c;
                  ((vg) this).field_c = ((vg) this).field_c.field_k;
                  return var3;
                } else {
                  ((vg) this).field_c = ((vg) this).field_c.field_k;
                  continue L0;
                }
              } else {
                ((vg) this).field_c = null;
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (((vg) this).field_c != var2) {
                if (((vg) this).field_e == ((vg) this).field_c.field_i) {
                  var3 = ((vg) this).field_c;
                  ((vg) this).field_c = ((vg) this).field_c.field_k;
                  return var3;
                } else {
                  ((vg) this).field_c = ((vg) this).field_c.field_k;
                  continue L1;
                }
              } else {
                ((vg) this).field_c = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    final rc a(long param0, int param1) {
        rc var4 = null;
        rc var5 = null;
        int var6 = 0;
        var6 = Geoblox.field_C;
        ((vg) this).field_e = param0;
        var4 = ((vg) this).field_g[(int)(param0 & (long)(param1 + ((vg) this).field_h))];
        ((vg) this).field_c = var4.field_k;
        L0: while (true) {
          if (var4 != ((vg) this).field_c) {
            if (param0 == ((vg) this).field_c.field_i) {
              var5 = ((vg) this).field_c;
              ((vg) this).field_c = ((vg) this).field_c.field_k;
              return var5;
            } else {
              ((vg) this).field_c = ((vg) this).field_c.field_k;
              continue L0;
            }
          } else {
            ((vg) this).field_c = null;
            return null;
          }
        }
    }

    public static void a() {
        field_i = null;
        field_f = null;
        field_d = null;
        field_j = null;
        field_b = null;
    }

    vg(int param0) {
        int var2 = 0;
        rc var3 = null;
        ((vg) this).field_g = new rc[param0];
        ((vg) this).field_h = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            rc dupTemp$2 = new rc();
            var3 = dupTemp$2;
            ((vg) this).field_g[var2] = dupTemp$2;
            var3.field_k = var3;
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
        field_j = new boolean[33];
        field_d = "Please wait...";
    }
}
