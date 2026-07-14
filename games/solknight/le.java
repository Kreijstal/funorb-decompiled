/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class le {
    int field_g;
    static String field_a;
    static String field_b;
    static volatile int field_f;
    int[] field_c;
    int field_e;
    static o[] field_d;

    final static void a(int param0, String param1, String param2) {
        if (null == ah.field_e) {
          ve.field_a = new bb(param1, param2, false, true, true);
          gf.field_cb.c(-3399, (rc) (Object) ve.field_a);
          if (param0 > -11) {
            field_f = 70;
            return;
          } else {
            return;
          }
        } else {
          ah.field_e.f(true);
          ve.field_a = new bb(param1, param2, false, true, true);
          gf.field_cb.c(-3399, (rc) (Object) ve.field_a);
          if (param0 <= -11) {
            return;
          } else {
            field_f = 70;
            return;
          }
        }
    }

    final int a(byte param0) {
        if (param0 >= 39) {
          if (((le) this).field_c != null) {
            if (0 == ((le) this).field_c.length) {
              return 0;
            } else {
              return ((le) this).field_c[((le) this).field_c.length - 1];
            }
          } else {
            return 0;
          }
        } else {
          le.a(-71);
          if (((le) this).field_c != null) {
            if (0 == ((le) this).field_c.length) {
              return 0;
            } else {
              return ((le) this).field_c[((le) this).field_c.length - 1];
            }
          } else {
            return 0;
          }
        }
    }

    final int a(int param0, boolean param1) {
        int var3 = 0;
        int var4 = 0;
        var4 = SolKnight.field_L ? 1 : 0;
        if (null != ((le) this).field_c) {
          if (-1 != (((le) this).field_c.length ^ -1)) {
            var3 = 1;
            L0: while (true) {
              if (((le) this).field_c.length <= var3) {
                if (param1) {
                  field_d = null;
                  return ((le) this).field_c.length + -1;
                } else {
                  return ((le) this).field_c.length + -1;
                }
              } else {
                if (param0 < ((le) this).field_c[var3] + ((le) this).field_c[var3 - 1] >> 873698625) {
                  return -1 + var3;
                } else {
                  var3++;
                  continue L0;
                }
              }
            }
          } else {
            return 0;
          }
        } else {
          return 0;
        }
    }

    le(int param0, int param1, int param2) {
        ((le) this).field_g = param0;
        ((le) this).field_e = param1;
        ((le) this).field_c = new int[param2 - -1];
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != -3390) {
            field_b = null;
            field_d = null;
            return;
        }
        field_d = null;
    }

    final static void b(int param0) {
        m var1 = null;
        jd var2 = null;
        var1 = (m) (Object) gg.field_b.a((byte) 51);
        if (var1 != null) {
          var2 = te.field_N;
          int discarded$48 = var2.e(true);
          int discarded$49 = var2.e(true);
          int discarded$50 = var2.e(true);
          int discarded$51 = var2.e(true);
          var1.c(10);
          if (param0 != 873698625) {
            le.a(-22);
            return;
          } else {
            return;
          }
        } else {
          je.a(false);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = -1;
        field_b = "EXCLUSIVE";
        field_a = "Close";
    }
}
