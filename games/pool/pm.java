/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm extends ma {
    static String field_o;
    static int field_p;
    so field_n;
    static vh field_m;
    static int field_l;

    final static void a(byte[] param0, byte[] param1, String[][] param2, di param3, dd[][] param4, int param5, qb[] param6, int[] param7, dd[][] param8, int param9, String[] param10, di param11, boolean param12, int[] param13, di param14, String[][] param15, int param16) {
        if (param16 != -6103) {
            field_m = null;
        }
        so.a(param2, param9, param11, param8, param15, param16 ^ 6094, 1, param4, param10, param0, param5, param7, param14, (String[]) null, param1, param13, param3, param12, param6);
    }

    final static int a(int param0) {
        if (param0 == -27011) {
          if (cl.a(1, pl.field_b)) {
            return 0;
          } else {
            if (!cl.a(1, jq.field_d)) {
              if (cl.a(1, qa.field_v)) {
                if (vm.field_d[5] != qa.field_v.field_hb) {
                  return 2;
                } else {
                  return 3;
                }
              } else {
                return -1;
              }
            } else {
              return 1;
            }
          }
        } else {
          pm.a((byte[]) null, (byte[]) null, (String[][]) null, (di) null, (dd[][]) null, 100, (qb[]) null, (int[]) null, (dd[][]) null, 104, (String[]) null, (di) null, false, (int[]) null, (di) null, (String[][]) null, 112);
          if (cl.a(1, pl.field_b)) {
            return 0;
          } else {
            if (!cl.a(1, jq.field_d)) {
              if (cl.a(1, qa.field_v)) {
                if (vm.field_d[5] != qa.field_v.field_hb) {
                  return 2;
                } else {
                  return 3;
                }
              } else {
                return -1;
              }
            } else {
              return 1;
            }
          }
        }
    }

    final static void a(fl param0, int param1, boolean param2) {
        oq var3 = null;
        var3 = ej.field_j;
        var3.b(false, param1);
        var3.a(2, false);
        var3.a(0, false);
        var3.a(param0.field_o, false);
        if (!param2) {
          field_p = 32;
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
            return;
        }
        field_o = null;
        field_m = null;
    }

    pm(so param0) {
        ((pm) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = -1;
        field_o = "Drag <img=2> or <img=9><img=0> to rotate.";
    }
}
