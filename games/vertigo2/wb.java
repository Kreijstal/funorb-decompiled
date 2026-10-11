/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wb extends ji {
    private int field_y;
    private int field_A;
    private int field_D;
    static String field_C;
    private int field_z;
    private int field_B;
    private int field_F;
    private int field_G;
    static int[] field_E;

    public wb() {
        super(0, true);
        this.field_D = 4096;
        this.field_B = 8192;
        this.field_G = 2048;
        this.field_F = 0;
        this.field_y = 0;
        this.field_A = 2048;
        this.field_z = 12288;
    }

    final int[] c(int param0, int param1) {
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
        int stackIn_33_2 = 0;
        int[] var3;
        int var4;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        ed var12;
        int[] var13;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var8Lifetime2;
        int var9Lifetime1;
        int var9Lifetime2;
        int var10Lifetime1;
        int var10Lifetime2;
        var11 = Vertigo2.field_L ? 1 : 0;
        var13 = this.field_x.a(param0, (byte) 75);
        var3 = var13;
        if (this.field_x.field_i) {
          var4 = lf.field_y[param0] - 2048;
          for (var5 = 0; var5 < we.field_M; var5++) {
            var6 = rh.field_O[var5] - 2048;
            var7 = this.field_A + var6;
            if (var7 < -2048) {
              stackIn_8_0 = 4096 + var7;
            } else {
              stackIn_8_0 = var7;
            }
            var7Lifetime1 = stackIn_8_0;
            if (var7Lifetime1 <= 2048) {
              stackIn_11_0 = var7Lifetime1;
            } else {
              stackIn_11_0 = -4096 + var7Lifetime1;
            }
            var7Lifetime2 = stackIn_11_0;
            var8 = var4 + this.field_y;
            if (var8 >= -2048) {
              stackIn_14_0 = var8;
            } else {
              stackIn_14_0 = 4096 + var8;
            }
            var8Lifetime1 = stackIn_14_0;
            if (2048 >= var8Lifetime1) {
              stackIn_17_0 = var8Lifetime1;
            } else {
              stackIn_17_0 = -4096 + var8Lifetime1;
            }
            var8Lifetime2 = stackIn_17_0;
            var9 = this.field_F + var6;
            if (var9 >= -2048) {
              stackIn_20_0 = var9;
            } else {
              stackIn_20_0 = 4096 + var9;
            }
            var9Lifetime1 = stackIn_20_0;
            if (2048 >= var9Lifetime1) {
              stackIn_23_0 = var9Lifetime1;
            } else {
              stackIn_23_0 = var9Lifetime1 - 4096;
            }
            var9Lifetime2 = stackIn_23_0;
            var10 = this.field_G + var4;
            if (-2048 <= var10) {
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
            stackIn_32_0 = var13;
            stackIn_32_1 = var5;
            if (!this.a(var8Lifetime2, var7Lifetime2, false) &&
              !this.a(var9Lifetime2, var10Lifetime2, (byte) 125)) {
              stackIn_33_2 = 0;
            } else {
              stackIn_33_2 = 4096;
            }
            stackIn_32_0[stackIn_32_1] = stackIn_33_2;
          }
        }
        if (param1 <= 91) {
          var12 = (ed) null;
          this.a((byte) -116, 10, (ed) null);
        }
        return var13;
    }

    final static boolean a(char param0, byte param1) {
        int var2;
        if (Character.isISOControl(param0)) {
          return false;
        }
        var2 = 65 / ((param1 - 54) / 56);
        if (d.a(param0, 2)) {
          return true;
        }
        if (45 != param0 &&
          param0 != 160 &&
          param0 != 32) {
          if (param0 != 95) {
            return false;
          }
          return true;
        }
        return true;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            this.field_G = 78;
          }
          var4_int = param1;
          if (var4_int == 0) {
            this.field_A = param2.a((byte) -11);
          } else {
            if (var4_int == 1) {
              this.field_y = param2.a((byte) -11);
            } else {
              if (var4_int != 2) {
                if (var4_int != 3) {
                  if (var4_int == 4) {
                    this.field_z = param2.a((byte) -11);
                  } else {
                    if (var4_int == 5) {
                      this.field_D = param2.a((byte) -11);
                    } else {
                      if (var4_int == 6) {
                        this.field_B = param2.a((byte) -11);
                      }
                    }
                  }
                } else {
                  this.field_G = param2.a((byte) -11);
                }
              } else {
                this.field_F = param2.a((byte) -11);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_23_0 = var4;
          stackIn_23_1 = new StringBuilder().append("wb.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        boolean stackIn_6_0 = false;
        var4 = this.field_z * (param0 + param1) >> 12;
        if (param2 <= 85) {
          wb.b((byte) 118);
        }
        var5 = qb.field_b[var4 * 255 >> 12 & 255];
        var5 = (var5 << 12) / this.field_z;
        var5 = (var5 << 12) / this.field_B;
        var5 = var5 * this.field_D >> 12;
        stackIn_6_0 = (param1 - param0 < var5) && (param1 - param0 > -var5);
        return stackIn_6_0;
    }

    private final boolean a(int param0, int param1, boolean param2) {
        int var4;
        int var5;
        boolean stackIn_6_0 = false;
        var4 = this.field_z * (param0 - param1) >> 12;
        var5 = qb.field_b[var4 * 255 >> 12 & 255];
        var5 = (var5 << 12) / this.field_z;
        var5 = (var5 << 12) / this.field_B;
        var5 = var5 * this.field_D >> 12;
        if (param2) {
          return false;
        }
        stackIn_6_0 = (param1 + param0 < var5) && (param0 + param1 > -var5);
        return stackIn_6_0;
    }

    final void a(int param0) {
        if (param0 >= -98) {
          return;
        }
        uk.d((byte) 37);
    }

    public static void b(byte param0) {
        if (param0 != -33) {
          return;
        }
        field_C = null;
        field_E = null;
    }

    static {
        field_C = "Please remove <%0> from your friend list first.";
    }
}
