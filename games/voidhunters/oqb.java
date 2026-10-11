/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oqb extends le {
    private int field_q;
    private int field_p;
    private int field_l;
    private int field_i;
    private int field_m;
    private int field_o;
    private int field_j;
    static String field_n;
    static String field_k;

    private final boolean d(int param0, int param1, int param2) {
        int var4;
        int var5;
        boolean stackIn_6_0 = false;
        var4 = this.field_q * (param2 + param0) >> 12;
        if (param1 != 1047718) {
          return false;
        }
        var5 = jmb.field_q[(255 * var4 & 1046912) >> 12];
        var5 = (var5 << 12) / this.field_q;
        var5 = (var5 << 12) / this.field_m;
        var5 = this.field_p * var5 >> 12;
        stackIn_6_0 = (var5 > param2 - param0) && (-param0 + param2 > -var5);
        return stackIn_6_0;
    }

    public oqb() {
        super(0, true);
        this.field_i = 2048;
        this.field_q = 12288;
        this.field_m = 8192;
        this.field_j = 0;
        this.field_p = 4096;
        this.field_l = 0;
        this.field_o = 2048;
    }

    final void c(byte param0) {
        boolean discarded$0 = false;
        if (param0 >= -35) {
          discarded$0 = this.d(-93, -27, 100);
        }
        taa.e((byte) 118);
    }

    final int[] a(int param0, boolean param1) {
        int var5 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_34_2 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int[] var12;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        var11 = VoidHunters.field_G;
        if (!param1) {
          this.c((byte) -85);
        }
        var12 = this.field_f.a((byte) 119, param0);
        var3 = var12;
        if (this.field_f.field_e) {
          var4 = sj.field_p[param0] - 2048;
          for (var5 = 0; var5 < hob.field_d; var5++) {
            var6 = -2048 + grb.field_l[var5];
            var7 = this.field_o + var6;
            if (var7 >= -2048) {
              stackIn_8_0 = var7;
            } else {
              stackIn_8_0 = 4096 + var7;
            }
            var7Lifetime1 = stackIn_8_0;
            if (var7Lifetime1 <= 2048) {
              stackIn_11_0 = var7Lifetime1;
            } else {
              stackIn_11_0 = -4096 + var7Lifetime1;
            }
            var7Lifetime2 = stackIn_11_0;
            var8 = var4 + this.field_j;
            if (var8 < -2048) {
              stackIn_14_0 = var8 + 4096;
            } else {
              stackIn_14_0 = var8;
            }
            var8Lifetime1 = stackIn_14_0;
            if (var8Lifetime1 <= 2048) {
              stackIn_17_0 = var8Lifetime1;
            } else {
              stackIn_17_0 = var8Lifetime1 - 4096;
            }
            var8Lifetime2 = stackIn_17_0;
            var9 = var6 + this.field_l;
            if (-2048 <= var9) {
              stackIn_20_0 = var9;
            } else {
              stackIn_20_0 = var9 + 4096;
            }
            var9Lifetime1 = stackIn_20_0;
            if (2048 < var9Lifetime1) {
              stackIn_23_0 = -4096 + var9Lifetime1;
            } else {
              stackIn_23_0 = var9Lifetime1;
            }
            var9Lifetime2 = stackIn_23_0;
            var10 = var4 + this.field_i;
            if (var10 >= -2048) {
              stackIn_26_0 = var10;
            } else {
              stackIn_26_0 = var10 + 4096;
            }
            var10Lifetime1 = stackIn_26_0;
            if (2048 < var10Lifetime1) {
              stackIn_29_0 = var10Lifetime1 - 4096;
            } else {
              stackIn_29_0 = var10Lifetime1;
            }
            var10Lifetime2 = stackIn_29_0;
            stackIn_32_0 = var12;
            stackIn_32_1 = var5;
            if (!this.c(var8Lifetime2, -23429, var7Lifetime2) &&
              !this.d(var9Lifetime2, 1047718, var10Lifetime2)) {
              stackIn_34_2 = 0;
            } else {
              stackIn_34_2 = 4096;
            }
            stackIn_32_0[stackIn_32_1] = stackIn_34_2;
          }
        }
        return var12;
    }

    public static void e(byte param0) {
        field_k = null;
        field_n = null;
        if (param0 > -117) {
          field_n = (String) null;
        }
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          var4_int = param0;
          if (var4_int != 0) {
            if (var4_int == 1) {
              this.field_j = param2.e(1869);
            } else {
              if (var4_int != 2) {
                if (var4_int != 3) {
                  if (var4_int == 4) {
                    this.field_q = param2.e(1869);
                  } else {
                    if (5 != var4_int) {
                      if (var4_int == 6) {
                        this.field_m = param2.e(1869);
                      }
                    } else {
                      this.field_p = param2.e(1869);
                    }
                  }
                } else {
                  this.field_i = param2.e(1869);
                }
              } else {
                this.field_l = param2.e(1869);
              }
            }
          } else {
            this.field_o = param2.e(1869);
          }
          if (param1 > -60) {
            this.a(116, true);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_25_0 = var4;
          stackIn_25_1 = new StringBuilder().append("oqb.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw rta.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4;
        int var5;
        boolean stackIn_6_0 = false;
        var4 = (-param2 + param0) * this.field_q >> 12;
        var5 = jmb.field_q[(var4 * 255 & 1047718) >> 12];
        var5 = (var5 << 12) / this.field_q;
        if (param1 != -23429) {
          return true;
        }
        var5 = (var5 << 12) / this.field_m;
        var5 = var5 * this.field_p >> 12;
        stackIn_6_0 = (var5 > param2 + param0) && (-var5 < param0 + param2);
        return stackIn_6_0;
    }

    static {
        field_k = "Quick Chat game";
        field_n = "Respect";
    }
}
