/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rla extends pp {
    private int field_j;
    static kv field_k;
    static String field_i;

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = BachelorFridge.field_y;
        if (param2 <= -118) {
          var3 = 0;
          var4 = ql.field_s;
          L0: while (true) {
            if (mj.field_h.length > var3) {
              var5 = fr.field_l[var3];
              if (0 > var5) {
                var4 = var4 + mm.field_z;
                var3++;
                var3++;
                continue L0;
              } else {
                var6 = gg.a(true, -103, mj.field_h[var3]);
                var7 = mg.field_k + -(var6 >> -636813407);
                var4 = var4 + cba.field_d;
                if (!hha.a((um.field_d << -31205567) + hc.field_D, param1, (vt.field_k << -1710690751) + var6, 1, var7 - vt.field_k, var4, param0)) {
                  var4 = var4 + (cba.field_d + (um.field_d << 219053985) + hc.field_D);
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  return var5;
                }
              }
            } else {
              return -1;
            }
          }
        } else {
          field_k = null;
          var3 = 0;
          var4 = ql.field_s;
          if (mj.field_h.length > var3) {
            var5 = fr.field_l[var3];
            if (0 <= var5) {
              var6 = gg.a(true, -103, mj.field_h[var3]);
              var7 = mg.field_k + -(var6 >> -636813407);
              var4 = var4 + cba.field_d;
              if (hha.a((um.field_d << -31205567) + hc.field_D, param1, (vt.field_k << -1710690751) + var6, 1, var7 - vt.field_k, var4, param0)) {
                return var5;
              } else {
                var4 = var4 + (cba.field_d + (um.field_d << 219053985) + hc.field_D);
                var3++;
                var3++;
                var3++;
                var3++;
                return -1;
              }
            } else {
              var4 = var4 + mm.field_z;
              var3++;
              var3++;
              var3++;
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    rla(nq param0, int param1) {
        ((rla) this).field_j = param1;
        ((rla) this).field_h = param0;
    }

    final void a(lu param0, byte param1) {
        this.a(param0, (byte) -123);
        er.a(((rla) this).field_h, 117, param0);
        param0.d(((rla) this).field_j, 0);
        int var3 = -78 / ((34 - param1) / 58);
    }

    public static void d(byte param0) {
        field_k = null;
        if (param0 != 29) {
            field_k = null;
            field_i = null;
            return;
        }
        field_i = null;
    }

    final void a(aga param0, op param1, int param2) {
        Object var5 = null;
        aga var7 = null;
        aga var8 = null;
        var7 = ((rla) this).field_h.a(74, param1);
        var8 = var7;
        if (var8 == null) {
          return;
        } else {
          L0: {
            var8.field_E = ((rla) this).field_j;
            if (param2 == 12) {
              break L0;
            } else {
              var5 = null;
              ((rla) this).a((lu) null, (byte) -61);
              break L0;
            }
          }
          return;
        }
    }

    final static int a(boolean param0, int param1) {
        if (param0) {
            field_k = null;
            return 255 & param1 >> 658235760;
        }
        return 255 & param1 >> 658235760;
    }

    final static void a(byte param0, boolean param1) {
        if (param0 != -1) {
          int discarded$2 = rla.a(-108, -62, 102);
          rda.a(param0 + 1, param1, true);
          return;
        } else {
          rda.a(param0 + 1, param1, true);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Loading extra data";
    }
}
