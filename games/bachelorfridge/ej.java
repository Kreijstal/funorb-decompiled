/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ej extends jm {
    private int field_m;
    static String field_n;
    static String field_o;
    static int field_p;

    ej(int param0) {
        ((ej) this).field_m = param0;
        ((ej) this).field_j = 7;
    }

    final void a(ub param0, int param1) {
        gj var3 = null;
        int var5 = 0;
        int var6 = 0;
        gj var7 = null;
        ib var8 = null;
        ib var9 = null;
        var6 = BachelorFridge.field_y;
        var7 = param0.field_o;
        var3 = var7;
        var7.field_T[((ej) this).field_m] = 0;
        if (param1 > -2) {
          L0: {
            ((ej) this).a(true, (op) null);
            var8 = param0.field_o.field_h.field_S[((ej) this).field_m];
            var5 = 0;
            if (var8.field_b.length <= var5) {
              break L0;
            } else {
              L1: {
                if (var8.field_b[var5] == null) {
                  var5++;
                  break L1;
                } else {
                  param0.a(27799, (at) (Object) new cb(param0.field_o.b(var8.field_b[var5], -23990), 5));
                  var5++;
                  break L1;
                }
              }
              var5++;
              var5++;
              var5++;
              break L0;
            }
          }
          ((ej) this).a(false, var3.field_h);
          return;
        } else {
          var9 = param0.field_o.field_h.field_S[((ej) this).field_m];
          var5 = 0;
          L2: while (true) {
            if (var9.field_b.length <= var5) {
              ((ej) this).a(false, var3.field_h);
              return;
            } else {
              if (var9.field_b[var5] == null) {
                var5++;
                var5++;
                var5++;
                continue L2;
              } else {
                param0.a(27799, (at) (Object) new cb(param0.field_o.b(var9.field_b[var5], -23990), 5));
                var5++;
                var5++;
                continue L2;
              }
            }
          }
        }
    }

    final static void a(int param0, int param1, String param2, boolean param3, int param4, int param5) {
        param0 = param0 - (hl.field_C.a(param2) >> -746667967);
        gb.a(param0, param4, param1, 0, param3, param2);
        int var6 = -111 / ((4 - param5) / 59);
    }

    ej(lu param0) {
        ((ej) this).field_j = 7;
        ((ej) this).field_m = param0.b(16711935);
    }

    final void a(boolean param0, op param1) {
        ib var3 = null;
        int var4 = 0;
        int var5 = 0;
        ib var6 = null;
        var5 = BachelorFridge.field_y;
        param1.field_S[((ej) this).field_m].field_c = true;
        var6 = param1.field_S[((ej) this).field_m];
        var3 = var6;
        if (param0) {
          L0: {
            ((ej) this).a(true, (op) null);
            var4 = 0;
            if (var3.field_b.length <= var4) {
              break L0;
            } else {
              L1: {
                if (null == var6.field_b[var4]) {
                  var4++;
                  break L1;
                } else {
                  var6.field_b[var4].j(-121);
                  var6.field_b[var4].field_A = false;
                  var4++;
                  break L1;
                }
              }
              var4++;
              var4++;
              var4++;
              break L0;
            }
          }
          return;
        } else {
          var4 = 0;
          L2: while (true) {
            if (var3.field_b.length <= var4) {
              return;
            } else {
              if (null == var6.field_b[var4]) {
                var4++;
                var4++;
                var4++;
                continue L2;
              } else {
                var6.field_b[var4].j(-121);
                var6.field_b[var4].field_A = false;
                var4++;
                var4++;
                continue L2;
              }
            }
          }
        }
    }

    final void b(lu param0, byte param1) {
        int var3 = -73 % ((param1 - 37) / 38);
        param0.d(((ej) this).field_m, 0);
    }

    final static String a(vr param0, String param1, byte param2, String param3, String param4) {
        if (param2 != -12) {
            ej.b(-110);
            if (!(param0.a(0))) {
                return param1;
            }
            return param4 + " - " + param0.a(0, param3) + "%";
        }
        if (!(param0.a(0))) {
            return param1;
        }
        return param4 + " - " + param0.a(0, param3) + "%";
    }

    final static void a(int param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        var4 = BachelorFridge.field_y;
        if (param0 != -11163) {
          ej.b(49);
          var8 = fg.field_a;
          var6 = var8;
          var5 = var6;
          var1 = var5;
          var2 = 0;
          var3 = var8.length;
          L0: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L0;
            }
          }
        } else {
          var9 = fg.field_a;
          var7 = var9;
          var5 = var7;
          var1 = var5;
          var2 = 0;
          var3 = var9.length;
          L1: while (true) {
            if (var3 <= var2) {
              return;
            } else {
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              var2++;
              var5[var2] = 0;
              continue L1;
            }
          }
        }
    }

    public static void b(int param0) {
        field_o = null;
        if (param0 != 0) {
            field_n = null;
            field_n = null;
            return;
        }
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_n = "Won";
        field_o = "Unfortunately your configuration doesn't support fullscreen mode.";
    }
}
