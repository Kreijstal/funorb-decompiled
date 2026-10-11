/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ii extends ji {
    static int field_E;
    private int field_F;
    static boolean field_z;
    static String field_A;
    private int field_B;
    static r field_C;
    private int field_D;
    private int field_y;

    public ii() {
        super(0, true);
        this.field_F = 0;
        this.field_B = 0;
        this.field_D = 20;
        this.field_y = 1365;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var4_int = param1;
          if (var4_int == 0) {
            this.field_y = param2.a((byte) -11);
          } else {
            if (1 == var4_int) {
              this.field_D = param2.a((byte) -11);
            } else {
              if (var4_int != 2) {
                if (3 == var4_int) {
                  this.field_B = param2.a((byte) -11);
                }
              } else {
                this.field_F = param2.a((byte) -11);
              }
            }
          }
          if (param0 != 110) {
            this.field_y = -51;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_16_0 = var4;
          stackIn_16_1 = new StringBuilder().append("ii.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int[] var15;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_11_2 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_25_2 = 0;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        int[] var3Lifetime1;
        int[] var15Lifetime1;
        var14 = Vertigo2.field_L ? 1 : 0;
        if (param1 >= 91) {
          var15 = this.field_x.a(param0, (byte) 66);
          var3 = var15;
          if (!this.field_x.field_i) {
            return var15;
          }
          for (var4 = 0; we.field_M > var4; var4++) {
            var5 = (rh.field_O[var4] << 12) / this.field_y + this.field_F;
            var6 = (lf.field_y[param0] << 12) / this.field_y + this.field_B;
            var7 = var5;
            var8 = var6;
            var9 = var5;
            var10 = var6;
            var11 = var5 * var5 >> 12;
            var12 = var6 * var6 >> 12;
            var13 = 0;
            while (var12 + var11 < 16384) {
              if (this.field_D > var13) {
                var10 = 2 * (var10 * var9 >> 12) + var8;
                var9 = var7 + var11 - var12;
                var11 = var9 * var9 >> 12;
                var12 = var10 * var10 >> 12;
                var13++;
                continue;
              }
              break;
            }
            stackIn_24_0 = var15;
            stackIn_24_1 = var4;
            if (-1 + this.field_D > var13) {
              stackIn_25_2 = (var13 << 12) / this.field_D;
            } else {
              stackIn_25_2 = 0;
            }
            stackIn_24_0[stackIn_24_1] = stackIn_25_2;
          }
          return var15;
        }
        field_C = (r) null;
        var15Lifetime1 = this.field_x.a(param0, (byte) 66);
        var3Lifetime1 = var15Lifetime1;
        if (!this.field_x.field_i) {
          return var15Lifetime1;
        }
        for (var4Lifetime1 = 0; we.field_M > var4Lifetime1; var4Lifetime1++) {
          var5Lifetime1 = (rh.field_O[var4Lifetime1] << 12) / this.field_y + this.field_F;
          var6Lifetime1 = (lf.field_y[param0] << 12) / this.field_y + this.field_B;
          var7Lifetime1 = var5Lifetime1;
          var8Lifetime1 = var6Lifetime1;
          var9Lifetime1 = var5Lifetime1;
          var10Lifetime1 = var6Lifetime1;
          var11Lifetime1 = var5Lifetime1 * var5Lifetime1 >> 12;
          var12Lifetime1 = var6Lifetime1 * var6Lifetime1 >> 12;
          var13Lifetime1 = 0;
          while (var12Lifetime1 + var11Lifetime1 < 16384) {
            if (this.field_D > var13Lifetime1) {
              var10Lifetime1 = 2 * (var10Lifetime1 * var9Lifetime1 >> 12) + var8Lifetime1;
              var9Lifetime1 = var7Lifetime1 + var11Lifetime1 - var12Lifetime1;
              var11Lifetime1 = var9Lifetime1 * var9Lifetime1 >> 12;
              var12Lifetime1 = var10Lifetime1 * var10Lifetime1 >> 12;
              var13Lifetime1++;
              continue;
            }
            break;
          }
          stackIn_10_0 = var15Lifetime1;
          stackIn_10_1 = var4Lifetime1;
          if (-1 + this.field_D > var13Lifetime1) {
            stackIn_11_2 = (var13Lifetime1 << 12) / this.field_D;
          } else {
            stackIn_11_2 = 0;
          }
          stackIn_10_0[stackIn_10_1] = stackIn_11_2;
        }
        return var15Lifetime1;
    }

    public static void g(int param0) {
        field_A = null;
        field_C = null;
        if (param0 < 57) {
          ii.g(-31);
        }
    }

    final static void b(byte param0) {
        if (param0 == -90) {
          qf.field_b = 0;
          gl.field_o = false;
          rl.field_db = -1;
          as.field_a = null;
          hn.field_n = -1;
          return;
        }
        ii.b((byte) 1);
        qf.field_b = 0;
        gl.field_o = false;
        rl.field_db = -1;
        as.field_a = null;
        hn.field_n = -1;
    }

    static {
        field_A = "Set up new game";
        field_E = 99;
        field_z = false;
    }
}
