/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oi extends ana {
    static js field_v;
    static sna field_w;

    private final void d(int param0) {
        if (param0 != 256) {
            oi.f(28);
        }
    }

    final static void a(int param0, kv[] param1) {
        oja.field_f = param1;
        if (null != oja.field_f) {
            if (3 > param1.length) {
                throw new IllegalArgumentException("");
            }
        }
        if (param0 != 3) {
            int discarded$0 = oi.a(-85, -83, -101, -96);
        }
    }

    final boolean c(byte param0) {
        int var2 = -107 / ((param0 - 71) / 47);
        ((oi) this).field_l = ((oi) this).field_l - 1;
        if ((((oi) this).field_l - 1 ^ -1) <= -1) {
            if ((((oi) this).field_l ^ -1) == -26) {
                jja.a(256, -1, 48);
                this.e(48);
            }
            return false;
        }
        this.d(256);
        return true;
    }

    private final void e(int param0) {
        int var2 = 0;
        int var3 = 0;
        wia var4 = null;
        int var5 = 0;
        Object var6 = null;
        var5 = BachelorFridge.field_y;
        var2 = 0;
        L0: while (true) {
          if (((oi) this).field_q.field_h.field_z <= var2) {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                var6 = null;
                oi.a(25, (kv[]) null);
                break L1;
              }
            }
            return;
          } else {
            var3 = 0;
            L2: while (true) {
              if (var3 >= ((oi) this).field_q.field_h.field_B) {
                var2++;
                continue L0;
              } else {
                var4 = ((oi) this).field_q.field_h.field_a[var2][var3];
                if (var4.c(-123)) {
                  ((oi) this).field_q.b(param0 + 30948, var2, var3);
                  var3++;
                  continue L2;
                } else {
                  var3++;
                  continue L2;
                }
              }
            }
          }
        }
    }

    public static void f(int param0) {
        if (param0 != -6887) {
            Object var2 = null;
            oi.a(-14, (kv[]) null);
        }
        field_w = null;
        field_v = null;
    }

    final static int a(int param0, int param1, int param2, int param3) {
        if (!(dg.field_i < param1 + param2)) {
            return param2;
        }
        if (!(param2 + param0 - param1 < 0)) {
            return -param1 + (param0 + param2);
        }
        if (param3 != -21264) {
            int discarded$0 = oi.a(-72, -7, -102, 104);
        }
        return dg.field_i - param1;
    }

    oi(gj param0, vba param1) {
        super(param0, (bca) (Object) param1);
    }

    static {
    }
}
