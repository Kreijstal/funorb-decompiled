/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh extends k {
    static String field_k;
    private int field_n;
    static String field_m;
    static volatile int field_l;

    public static void d(int param0) {
        field_m = null;
        field_k = null;
        if (param0 != 4096) {
          field_m = (String) null;
        }
    }

    final int[] a(int param0, int param1) {
        int var5 = 0;
        int stackIn_15_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int[] var11Lifetime1;
        var8 = BachelorFridge.field_y;
        if (param1 != 0) {
          return (int[]) null;
        }
        var11 = this.field_j.a(param0, -1);
        var10 = var11;
        var9 = var10;
        var3 = var9;
        if (!this.field_j.field_m) {
          return var9;
        }
        var4 = tj.field_f[param0];
        for (var5 = 0; hh.field_d > var5; var5++) {
          var6 = jq.field_k[var5];
          if (this.field_n < var6 &&
            -this.field_n + 4096 > var6 &&
            2048 - this.field_n < var4 &&
            var4 < this.field_n + 2048) {
            var7 = -var6 + 2048;
            if (var7 >= 0) {
              stackIn_15_0 = var7;
            } else {
              stackIn_15_0 = -var7;
            }
            var7 = stackIn_15_0;
            var7 = var7 << 12;
            var7 = var7 / (-this.field_n + 2048);
            var9[var5] = -var7 + 4096;
          } else if (2048 - this.field_n < var6 &&
            var6 < 2048 + this.field_n) {
            var7 = var4 - 2048;
            if (var7 >= 0) {
              stackIn_23_0 = var7;
            } else {
              stackIn_23_0 = -var7;
            }
            var7 = stackIn_23_0;
            var7 = var7 - this.field_n;
            var7 = var7 << 12;
            var9[var5] = var7 / (-this.field_n + 2048);
          } else if (var4 >= this.field_n &&
            -this.field_n + 4096 >= var4) {
            if (this.field_n <= var6 &&
              -this.field_n + 4096 >= var6) {
              var11Lifetime1 = var10;
              var11Lifetime1[var5] = 0;
            } else {
              var7 = -var4 + 2048;
              if (var7 < 0) {
                stackIn_39_0 = -var7;
              } else {
                stackIn_39_0 = var7;
              }
              var7 = stackIn_39_0;
              var7 = var7 << 12;
              var7 = var7 / (2048 - this.field_n);
              var9[var5] = -var7 + 4096;
            }
          } else {
            var7 = -2048 + var6;
            if (var7 >= 0) {
              stackIn_31_0 = var7;
            } else {
              stackIn_31_0 = -var7;
            }
            var7 = stackIn_31_0;
            var7 = var7 - this.field_n;
            var7 = var7 << 12;
            var9[var5] = var7 / (2048 - this.field_n);
          }
        }
        return var9;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param2;
          if (0 == var4_int) {
            this.field_n = param1.e((byte) 106);
          }
          if (param0 == -71) {
            return;
          }
          jh.d(-90);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("jh.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    public jh() {
        super(0, true);
        this.field_n = 585;
    }

    static {
        field_k = "Show players in <%0>'s game";
        field_m = "Loading fonts";
        field_l = 0;
    }
}
