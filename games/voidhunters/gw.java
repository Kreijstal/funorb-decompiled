/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gw extends le {
    private int field_j;
    static int[] field_i;

    final int[] a(int param0, boolean param1) {
        int var5 = 0;
        int stackIn_13_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_29_0 = 0;
        int stackIn_37_0 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var9Lifetime1;
        int[] var11Lifetime1;
        var8 = VoidHunters.field_G;
        if (!param1) {
          return (int[]) null;
        }
        var11 = this.field_f.a((byte) 124, param0);
        var10 = var11;
        var9 = var10;
        var3 = var9;
        if (!this.field_f.field_e) {
          return var9;
        }
        var4 = sj.field_p[param0];
        for (var5 = 0; hob.field_d > var5; var5++) {
          var6 = grb.field_l[var5];
          if (var6 > this.field_j &&
            4096 - this.field_j > var6 &&
            2048 - this.field_j < var4 &&
            this.field_j + 2048 > var4) {
            var7 = 2048 - var6;
            if (var7 >= 0) {
              var9 = var3;
              var11 = var10;
              stackIn_13_0 = var7;
            } else {
              stackIn_13_0 = -var7;
            }
            var9 = var3;
            var11 = var10;
            var7 = stackIn_13_0;
            var7 = var7 << 12;
            var7 = var7 / (2048 - this.field_j);
            var9[var5] = 4096 - var7;
          } else if (2048 - this.field_j < var6 &&
            var6 < 2048 + this.field_j) {
            var7 = var4 - 2048;
            if (var7 >= 0) {
              stackIn_21_0 = var7;
            } else {
              stackIn_21_0 = -var7;
            }
            var7 = stackIn_21_0;
            var7 = var7 - this.field_j;
            var7 = var7 << 12;
            var9[var5] = var7 / (2048 - this.field_j);
          } else if (var4 >= this.field_j &&
            -this.field_j + 4096 >= var4) {
            if (this.field_j <= var6 &&
              -this.field_j + 4096 >= var6) {
              var11[var5] = 0;
            } else {
              var7 = -var4 + 2048;
              if (0 > var7) {
                stackIn_37_0 = -var7;
              } else {
                stackIn_37_0 = var7;
              }
              var7 = stackIn_37_0;
              var7 = var7 << 12;
              var7 = var7 / (-this.field_j + 2048);
              var9[var5] = -var7 + 4096;
            }
          } else {
            var7 = var6 - 2048;
            if (var7 >= 0) {
              stackIn_29_0 = var7;
            } else {
              stackIn_29_0 = -var7;
            }
            var7 = stackIn_29_0;
            var7 = var7 - this.field_j;
            var7 = var7 << 12;
            var9[var5] = var7 / (-this.field_j + 2048);
          }
        }
        var9Lifetime1 = var3;
        var11Lifetime1 = var10;
        return var9Lifetime1;
    }

    public gw() {
        super(0, true);
        this.field_j = 585;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param0;
          if (var4_int == 0) {
            this.field_j = param2.e(1869);
          }
          if (param1 <= -60) {
            return;
          }
          gw.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gw.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (param0) {
          field_i = (int[]) null;
          field_i = null;
          return;
        }
        field_i = null;
    }

    static {
        field_i = new int[8192];
    }
}
