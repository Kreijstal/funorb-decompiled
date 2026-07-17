/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qk {
    private long field_e;
    static int[] field_b;
    private pa field_d;
    static int field_a;
    static String field_h;
    private int field_g;
    static int[] field_f;
    private pa[] field_c;

    final pa a(long param0, int param1) {
        pa var4 = null;
        pa var5 = null;
        int var6 = 0;
        var6 = fleas.field_A ? 1 : 0;
        if (param1 == 16571) {
          ((qk) this).field_e = param0;
          var4 = ((qk) this).field_c[(int)((long)(-1 + ((qk) this).field_g) & param0)];
          ((qk) this).field_d = var4.field_p;
          L0: while (true) {
            if (var4 != ((qk) this).field_d) {
              if (((qk) this).field_d.field_j == param0) {
                var5 = ((qk) this).field_d;
                ((qk) this).field_d = ((qk) this).field_d.field_p;
                return var5;
              } else {
                ((qk) this).field_d = ((qk) this).field_d.field_p;
                continue L0;
              }
            } else {
              ((qk) this).field_d = null;
              return null;
            }
          }
        } else {
          return null;
        }
    }

    final pa a(int param0) {
        pa var2 = null;
        pa var3 = null;
        int var4 = 0;
        var4 = fleas.field_A ? 1 : 0;
        if (((qk) this).field_d != null) {
          var2 = ((qk) this).field_c[(int)(((qk) this).field_e & (long)(((qk) this).field_g - 1))];
          if (param0 > -60) {
            field_a = -114;
            L0: while (true) {
              if (var2 != ((qk) this).field_d) {
                if (~((qk) this).field_d.field_j != ~((qk) this).field_e) {
                  ((qk) this).field_d = ((qk) this).field_d.field_p;
                  continue L0;
                } else {
                  var3 = ((qk) this).field_d;
                  ((qk) this).field_d = ((qk) this).field_d.field_p;
                  return var3;
                }
              } else {
                ((qk) this).field_d = null;
                return null;
              }
            }
          } else {
            L1: while (true) {
              if (var2 != ((qk) this).field_d) {
                if (~((qk) this).field_d.field_j != ~((qk) this).field_e) {
                  ((qk) this).field_d = ((qk) this).field_d.field_p;
                  continue L1;
                } else {
                  var3 = ((qk) this).field_d;
                  ((qk) this).field_d = ((qk) this).field_d.field_p;
                  return var3;
                }
              } else {
                ((qk) this).field_d = null;
                return null;
              }
            }
          }
        } else {
          return null;
        }
    }

    public static void b(int param0) {
        field_f = null;
        field_h = null;
        field_b = null;
        if (param0 == 0) {
            return;
        }
        field_h = null;
    }

    qk(int param0) {
        int var2 = 0;
        pa var3 = null;
        ((qk) this).field_c = new pa[param0];
        ((qk) this).field_g = param0;
        var2 = 0;
        L0: while (true) {
          if (param0 > var2) {
            pa dupTemp$2 = new pa();
            var3 = dupTemp$2;
            ((qk) this).field_c[var2] = dupTemp$2;
            var3.field_m = var3;
            var3.field_p = var3;
            var2++;
            continue L0;
          } else {
            return;
          }
        }
    }

    final void a(pa param0, int param1, long param2) {
        pa var5 = null;
        try {
            if (!(null == param0.field_m)) {
                param0.e(param1 ^ -103);
            }
            var5 = ((qk) this).field_c[(int)((long)(param1 + ((qk) this).field_g) & param2)];
            param0.field_m = var5.field_m;
            param0.field_p = var5;
            param0.field_m.field_p = param0;
            param0.field_p.field_m = param0;
            param0.field_j = param2;
        } catch (RuntimeException runtimeException) {
            throw pf.a((Throwable) (Object) runtimeException, "qk.C(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new int[128];
        field_a = 0;
        field_f = new int[8192];
        field_h = "Create a free Account";
    }
}
