/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gla extends ci {
    private int field_n;
    static String field_q;
    static it field_p;
    static String field_o;
    static int field_m;

    public static void d(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 >= -91) {
          field_p = (it) null;
          field_q = null;
          return;
        }
        field_q = null;
    }

    final int[] c(int param0, int param1) {
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_57_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_80_0 = 0;
        int[] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int[] var9;
        int[] var10;
        int[] var11;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var7Lifetime1;
        int[] var3Lifetime1;
        int[] var9Lifetime1;
        int[] var9Lifetime2;
        int[] var10Lifetime1;
        int[] var11Lifetime1;
        int[] var11Lifetime2;
        var8 = TombRacer.field_G ? 1 : 0;
        if (param0 == 1) {
          var11 = this.field_i.a((byte) 17, param1);
          var10 = var11;
          var9 = var10;
          var3 = var9;
          if (!this.field_i.field_d) {
            return var9;
          }
          var4 = sj.field_b[param1];
          for (var5 = 0; ns.field_g > var5; var5++) {
            var6 = ht.field_Fb[var5];
            if (var6 > this.field_n &&
              var6 < -this.field_n + 4096 &&
              var4 > -this.field_n + 2048 &&
              var4 < this.field_n + 2048) {
              var7 = 2048 - var6;
              if (var7 < 0) {
                stackIn_57_0 = -var7;
              } else {
                stackIn_57_0 = var7;
              }
              var7 = stackIn_57_0;
              var7 = var7 << 12;
              var7 = var7 / (-this.field_n + 2048);
              var9[var5] = -var7 + 4096;
            } else if (var6 > 2048 - this.field_n &&
              var6 < 2048 + this.field_n) {
              var7 = var4 - 2048;
              if (0 > var7) {
                stackIn_64_0 = -var7;
              } else {
                stackIn_64_0 = var7;
              }
              var7 = stackIn_64_0;
              var7 = var7 - this.field_n;
              var7 = var7 << 12;
              var9[var5] = var7 / (-this.field_n + 2048);
            } else if (this.field_n <= var4 &&
              4096 - this.field_n >= var4) {
              if (var6 >= this.field_n &&
                var6 <= -this.field_n + 4096) {
                var11[var5] = 0;
              } else {
                var7 = 2048 - var4;
                if (var7 < 0) {
                  stackIn_80_0 = -var7;
                } else {
                  stackIn_80_0 = var7;
                }
                var7 = stackIn_80_0;
                var7 = var7 << 12;
                var7 = var7 / (2048 - this.field_n);
                var9[var5] = -var7 + 4096;
              }
            } else {
              var7 = var6 - 2048;
              if (var7 >= 0) {
                stackIn_72_0 = var7;
              } else {
                stackIn_72_0 = -var7;
              }
              var7 = stackIn_72_0;
              var7 = var7 - this.field_n;
              var7 = var7 << 12;
              var9[var5] = var7 / (-this.field_n + 2048);
            }
          }
          return var9;
        }
        field_p = (it) null;
        var11Lifetime1 = this.field_i.a((byte) 17, param1);
        var10Lifetime1 = var11Lifetime1;
        var9Lifetime1 = var10Lifetime1;
        var3Lifetime1 = var9Lifetime1;
        if (!this.field_i.field_d) {
          return var9Lifetime1;
        }
        var9Lifetime2 = var3Lifetime1;
        var11Lifetime2 = var10Lifetime1;
        var4Lifetime1 = sj.field_b[param1];
        for (var5Lifetime1 = 0; ns.field_g > var5Lifetime1; var5Lifetime1++) {
          var6Lifetime1 = ht.field_Fb[var5Lifetime1];
          if (var6Lifetime1 > this.field_n &&
            var6Lifetime1 < -this.field_n + 4096 &&
            var4Lifetime1 > -this.field_n + 2048 &&
            var4Lifetime1 < this.field_n + 2048) {
            var7Lifetime1 = 2048 - var6Lifetime1;
            if (var7Lifetime1 < 0) {
              stackIn_16_0 = -var7Lifetime1;
            } else {
              stackIn_16_0 = var7Lifetime1;
            }
            var7Lifetime1 = stackIn_16_0;
            var7Lifetime1 = var7Lifetime1 << 12;
            var7Lifetime1 = var7Lifetime1 / (-this.field_n + 2048);
            var9Lifetime2[var5Lifetime1] = -var7Lifetime1 + 4096;
          } else if (var6Lifetime1 > 2048 - this.field_n &&
            var6Lifetime1 < 2048 + this.field_n) {
            var7Lifetime1 = var4Lifetime1 - 2048;
            if (0 > var7Lifetime1) {
              stackIn_23_0 = -var7Lifetime1;
            } else {
              stackIn_23_0 = var7Lifetime1;
            }
            var7Lifetime1 = stackIn_23_0;
            var7Lifetime1 = var7Lifetime1 - this.field_n;
            var7Lifetime1 = var7Lifetime1 << 12;
            var9Lifetime2[var5Lifetime1] = var7Lifetime1 / (-this.field_n + 2048);
          } else if (this.field_n <= var4Lifetime1 &&
            4096 - this.field_n >= var4Lifetime1) {
            if (var6Lifetime1 >= this.field_n &&
              var6Lifetime1 <= -this.field_n + 4096) {
              var11Lifetime2[var5Lifetime1] = 0;
            } else {
              var7Lifetime1 = 2048 - var4Lifetime1;
              if (var7Lifetime1 < 0) {
                stackIn_39_0 = -var7Lifetime1;
              } else {
                stackIn_39_0 = var7Lifetime1;
              }
              var7Lifetime1 = stackIn_39_0;
              var7Lifetime1 = var7Lifetime1 << 12;
              var7Lifetime1 = var7Lifetime1 / (2048 - this.field_n);
              var9Lifetime2[var5Lifetime1] = -var7Lifetime1 + 4096;
            }
          } else {
            var7Lifetime1 = var6Lifetime1 - 2048;
            if (var7Lifetime1 >= 0) {
              stackIn_31_0 = var7Lifetime1;
            } else {
              stackIn_31_0 = -var7Lifetime1;
            }
            var7Lifetime1 = stackIn_31_0;
            var7Lifetime1 = var7Lifetime1 - this.field_n;
            var7Lifetime1 = var7Lifetime1 << 12;
            var9Lifetime2[var5Lifetime1] = var7Lifetime1 / (-this.field_n + 2048);
          }
        }
        return var9Lifetime2;
    }

    public gla() {
        super(0, true);
        this.field_n = 585;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_n = param1.d(124);
          }
          if (param0 != 107) {
            gla.d((byte) 92);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("gla.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
        field_q = "Room complete +<%0>";
        field_p = new it();
        field_o = "Idols";
        field_m = -1;
    }
}
