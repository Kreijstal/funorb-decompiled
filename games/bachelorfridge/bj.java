/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bj extends pp {
    int field_i;
    static du field_k;
    static String field_j;
    int field_l;

    final static void a(byte[] param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int[] var7 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        var6 = BachelorFridge.field_y;
        lka.field_E = qs.a(false, new lu(param0));
        uma.field_P = new kga[lka.field_E.length + -1];
        if (param1 != 22) {
          field_k = null;
          var2 = 1;
          L0: while (true) {
            if (lka.field_E.length <= var2) {
              return;
            } else {
              var3 = vc.a(var2, 0, -16306);
              var9 = new int[15];
              var7 = var9;
              var4 = var7;
              var5 = 0;
              L1: while (true) {
                if (var9.length <= var5) {
                  ql.a(var9, var3, 0);
                  var2++;
                  continue L0;
                } else {
                  var4[var5] = cl.a(var5 - -2, (byte) 107, var2);
                  var5++;
                  continue L1;
                }
              }
            }
          }
        } else {
          var2 = 1;
          L2: while (true) {
            if (lka.field_E.length <= var2) {
              return;
            } else {
              var3 = vc.a(var2, 0, -16306);
              var10 = new int[15];
              var8 = var10;
              var4 = var8;
              var5 = 0;
              L3: while (true) {
                if (var10.length <= var5) {
                  ql.a(var10, var3, 0);
                  var2++;
                  continue L2;
                } else {
                  var4[var5] = cl.a(var5 - -2, (byte) 107, var2);
                  var5++;
                  continue L3;
                }
              }
            }
          }
        }
    }

    public static void d(byte param0) {
        field_k = null;
        field_j = null;
        if (param0 != -13) {
            field_k = null;
        }
    }

    final void a(lu param0, byte param1) {
        this.a(param0, (byte) -28);
        er.a(((bj) this).field_h, 122, param0);
        param0.d(((bj) this).field_i, 0);
        int var3 = -81 / ((34 - param1) / 58);
        param0.d(((bj) this).field_l, 0);
    }

    final void a(aga param0, op param1, int param2) {
        aga var6 = null;
        aga var7 = null;
        if (param2 != 12) {
            field_k = null;
            var6 = ((bj) this).field_h.a(param2 ^ 30, param1);
            var7 = var6;
            if (!(null == param1.field_a[((bj) this).field_i][((bj) this).field_l].field_l)) {
                return;
            }
            param1.field_a[var6.field_x][var6.field_J].field_l = null;
            var7.field_J = ((bj) this).field_l;
            var7.field_x = ((bj) this).field_i;
            param1.field_a[((bj) this).field_i][((bj) this).field_l].field_l = var7;
            var7.f(32);
            return;
        }
        aga var8 = ((bj) this).field_h.a(param2 ^ 30, param1);
        aga var9 = var8;
        if (!(null == param1.field_a[((bj) this).field_i][((bj) this).field_l].field_l)) {
            return;
        }
        param1.field_a[var8.field_x][var8.field_J].field_l = null;
        var9.field_J = ((bj) this).field_l;
        var9.field_x = ((bj) this).field_i;
        param1.field_a[((bj) this).field_i][((bj) this).field_l].field_l = var9;
        var9.f(32);
    }

    bj(nq param0, int param1, int param2) {
        ((bj) this).field_h = param0;
        ((bj) this).field_i = param1;
        ((bj) this).field_l = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = new du(2, 4, 4, 0);
        field_j = "***Target blocked!***";
    }
}
