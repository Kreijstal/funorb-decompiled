/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class da extends jj {
    private vn[] field_n;
    static ea field_o;
    static int field_m;

    final static void a(tf[] param0, int param1, tf[] param2, int param3, jl param4, int param5, int param6, jl param7, int param8, int param9, byte param10, int param11, int param12, int param13, int param14, int param15, tf[] param16, int param17, int param18, int param19, int param20) {
        vc.a(param17, param12, param9, new sb(param2), param14, new sb(param16), param8, param11, param13, param7, param5, param18, param3, new sb(param0), param19, param4, (byte) 119, param15, param20, param6, param1);
        int var21 = -40 / ((-41 - param10) / 48);
    }

    da(String param0, tf[] param1) {
        super(param0, param1);
        this.d(-14116);
    }

    final static void e(int param0) {
        int var4 = Pixelate.field_H ? 1 : 0;
        int[] var5 = kb.field_N;
        int[] var1 = var5;
        int var2 = 0;
        int var3 = var5.length;
        while (var2 < var3) {
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
        }
        if (param0 >= -87) {
            field_m = -103;
            return;
        }
    }

    public static void b(byte param0) {
        if (param0 != -13) {
            da.b((byte) 16);
            field_o = null;
            return;
        }
        field_o = null;
    }

    final void a(boolean param0) {
        vn[] var2 = null;
        int var3 = 0;
        vn var4 = null;
        int var5 = 0;
        vn[] var6 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        jg.field_H.f(0, 0);
        var6 = ((da) this).field_n;
        var2 = var6;
        if (!param0) {
          var3 = 0;
          L0: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.a((byte) 123);
              var3++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          field_m = -17;
          var3 = 0;
          L1: while (true) {
            if (var3 < var6.length) {
              var4 = var6[var3];
              var4.a((byte) 123);
              var3++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final void c(int param0) {
        vn[] var2 = null;
        int var3 = 0;
        vn var4 = null;
        int var5 = 0;
        vn[] var6 = null;
        var5 = Pixelate.field_H ? 1 : 0;
        super.c(param0);
        var6 = ((da) this).field_n;
        var2 = var6;
        var3 = 0;
        L0: while (true) {
          if (var3 < var6.length) {
            var4 = var6[var3];
            var4.a(param0 + 127);
            var3++;
            continue L0;
          } else {
            return;
          }
        }
    }

    private final void d(int param0) {
        int var2 = 0;
        int var3 = 0;
        var3 = Pixelate.field_H ? 1 : 0;
        ((da) this).field_n = new vn[5];
        var2 = 0;
        if (param0 != -14116) {
          field_o = null;
          L0: while (true) {
            if (((da) this).field_n.length > var2) {
              ((da) this).field_n[var2] = new vn(100 * var2);
              var2++;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (((da) this).field_n.length > var2) {
              ((da) this).field_n[var2] = new vn(100 * var2);
              var2++;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    final static int a(byte[] param0, byte param1, int param2, int param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Pixelate.field_H ? 1 : 0;
        var4 = -1;
        var5 = param2;
        if (param1 < 98) {
          return -86;
        } else {
          L0: while (true) {
            if (param3 <= var5) {
              var4 = var4 ^ -1;
              return var4;
            } else {
              var4 = var4 >>> -300237336 ^ dm.field_zb[255 & (var4 ^ param0[var5])];
              var5++;
              continue L0;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new ea(0);
    }
}
