/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ib {
    aga[] field_b;
    static be[] field_d;
    int field_a;
    boolean field_c;

    final int a(byte param0) {
        int var4 = 0;
        int var2;
        aga[] var3;
        int var5;
        aga var6;
        int var7;
        var7 = BachelorFridge.field_y;
        var2 = 0;
        var3 = this.field_b;
        var5 = 10 % ((54 - param0) / 44);
        for (var4 = 0; var4 < var3.length; var4++) {
          var6 = var3[var4];
          if (var6 != null) {
            var2++;
          }
        }
        return var2;
    }

    final static int a(boolean param0) {
        int stackIn_27_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        long var4 = 0L;
        int var6 = 0;
        int var7 = 0;
        var7 = BachelorFridge.field_y;
        try {
          var1_int = 0;
          var2 = 0;
          if (!param0) {
            field_d = (be[]) null;
          }
          while (kaa.b(127)) {
            dp.field_o.b(true);
            if (dp.field_o.e(0)) {
              var1_int = 1;
            }
            if (gf.field_k != 13) {
              continue;
            }
            var2 = 1;
          }
          dp.field_o.a(rla.a(nfa.field_a, jc.field_r, -126), -122, rla.a(mk.field_p, gd.field_m, -125));
          if (dp.field_o.e(0)) {
            var1_int = 1;
          }
          var3 = 0;
          if (var1_int != 0 &&
            dp.field_o.field_g >= 0) {
            var3 = mu.field_l[dp.field_o.field_g];
            if (var3 == 2 ||
              var3 == 5) {
              qja.a(0);
            }
          } else {
            if (var2 != 0 &&
              ub.field_j != 2) {
              qja.a(0);
            }
          }
          if (0 == var3 &&
            ub.field_j == 2) {
            var4 = f.b((byte) 73) - ph.field_P;
            var6 = (int)((10999L - var4) / 1000L);
            if (var6 <= 0) {
              tfa.a(5, 1, true);
              var3 = 2;
            }
          }
          stackIn_27_0 = var3;
          return stackIn_27_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ib.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        if (param0 > -71) {
          field_d = (be[]) null;
        }
    }

    final int b(byte param0) {
        int var4 = 0;
        int var2;
        aga[] var3;
        aga var5;
        int var6;
        var6 = BachelorFridge.field_y;
        if (param0 < 58) {
          this.field_a = 80;
        }
        var2 = 0;
        var3 = this.field_b;
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            !var5.i(-85)) {
            var2++;
          }
        }
        return var2;
    }

    final boolean a(byte param0, int param1) {
        int var4 = 0;
        aga[] var3;
        aga var5;
        int var6;
        var6 = BachelorFridge.field_y;
        var3 = this.field_b;
        if (param0 > -19) {
          ib.a(false);
        }
        for (var4 = 0; var3.length > var4; var4++) {
          var5 = var3[var4];
          if (var5 != null &&
            !var5.i(-73) &&
            var5.field_y == param1) {
            return true;
          }
        }
        return false;
    }

    final void a(int param0, aga param1) {
        if (param0 != -20836) {
          return;
        }
        try {
          param1.field_u = this.field_a;
          this.field_b[this.field_a] = param1;
          this.field_a = this.field_a + 1;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ib.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    ib(int param0) {
        this.field_b = new aga[7];
    }

    static {
        field_d = new be[38];
    }
}
