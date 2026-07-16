/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kk extends lf {
    static t field_o;
    uh field_r;
    static t field_n;
    private int[] field_p;
    static String field_q;

    final int a() {
        return 0;
    }

    final lf b() {
        return null;
    }

    public static void b(int param0) {
        field_n = null;
        if (param0 != 160) {
            return;
        }
        field_q = null;
        field_o = null;
    }

    final lf c() {
        return (lf) (Object) ((kk) this).field_r;
    }

    final int d() {
        return 255 * on.field_c / 160;
    }

    final void a(int param0) {
        ((kk) this).field_r.a(param0);
    }

    final synchronized void b(int[] param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var6 = Torquing.field_u;
          if (!pi.field_r) {
            stackOut_2_0 = param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param2 << -1862505791;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var4 = stackIn_3_0;
        if (((kk) this).field_p != null) {
          if (var4 > ((kk) this).field_p.length) {
            L1: {
              ((kk) this).field_p = new int[var4];
              ((kk) this).field_r.b(((kk) this).field_p, 0, param2);
              if (!pi.field_r) {
                break L1;
              } else {
                param1 = param1 << 1;
                break L1;
              }
            }
            var5 = 0;
            L2: while (true) {
              if (var4 <= var5) {
                return;
              } else {
                int incrementValue$12 = param1;
                param1++;
                int incrementValue$13 = var5;
                var5++;
                param0[incrementValue$12] = param0[incrementValue$12] + on.field_c * ((kk) this).field_p[incrementValue$13] / 160;
                continue L2;
              }
            }
          } else {
            L3: {
              dk.a(((kk) this).field_p, 0, var4);
              ((kk) this).field_r.b(((kk) this).field_p, 0, param2);
              if (!pi.field_r) {
                break L3;
              } else {
                param1 = param1 << 1;
                break L3;
              }
            }
            var5 = 0;
            L4: while (true) {
              if (var4 <= var5) {
                return;
              } else {
                int incrementValue$14 = param1;
                param1++;
                int incrementValue$15 = var5;
                var5++;
                param0[incrementValue$14] = param0[incrementValue$14] + on.field_c * ((kk) this).field_p[incrementValue$15] / 160;
                continue L4;
              }
            }
          }
        } else {
          L5: {
            ((kk) this).field_p = new int[var4];
            ((kk) this).field_r.b(((kk) this).field_p, 0, param2);
            if (!pi.field_r) {
              break L5;
            } else {
              param1 = param1 << 1;
              break L5;
            }
          }
          var5 = 0;
          L6: while (true) {
            if (var4 <= var5) {
              return;
            } else {
              int incrementValue$16 = param1;
              param1++;
              int incrementValue$17 = var5;
              var5++;
              param0[incrementValue$16] = param0[incrementValue$16] + on.field_c * ((kk) this).field_p[incrementValue$17] / 160;
              continue L6;
            }
          }
        }
    }

    kk() {
        ((kk) this).field_r = new uh();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Click to skip this page";
    }
}
