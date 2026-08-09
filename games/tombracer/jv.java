/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jv extends ci {
    static ica field_m;
    private int field_o;
    private boolean field_n;

    final static int d(int param0) {
        int var1 = 50 / ((32 - param0) / 60);
        return aqa.field_d - wt.field_a;
    }

    public jv() {
        super(1, false);
        this.field_o = 4096;
        this.field_n = true;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3;
        int[] var5;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int[][] var22;
        int[][] var23;
        int[][] var29;
        int[] var40;
        int[] var41;
        int[] var42;
        int[] var43;
        int[] var44;
        var21 = TombRacer.field_G ? 1 : 0;
        var29 = this.field_h.a(param0, (byte) -125);
        var23 = var29;
        var22 = var23;
        var3 = var22;
        if (this.field_h.field_f) {
          var41 = this.c(0, param1 + -118, hba.field_b & -1 + param0);
          var5 = this.c(0, -32, param0);
          var40 = this.c(0, -111, param0 - -1 & hba.field_b);
          var42 = var29[0];
          var43 = var29[1];
          var44 = var29[2];
          var10 = 0;
          L0: while (true) {
            if (ns.field_g > var10) {
              L1: {
                var14 = (var40[var10] - var41[var10]) * this.field_o;
                var15 = this.field_o * (-var5[una.field_b & -1 + var10] + var5[una.field_b & 1 + var10]);
                var16 = var15 >> 1141082572;
                var17 = var14 >> 1909882828;
                var18 = var16 * var16 >> 619297868;
                var19 = var17 * var17 >> -2018310388;
                var20 = (int)(4096.0 * Math.sqrt((double)((float)(4096 + var18 - -var19) / 4096.0f)));
                if ((var20 ^ -1) == -1) {
                  var13 = 0;
                  var11 = 0;
                  var12 = 0;
                  break L1;
                } else {
                  var12 = var14 / var20;
                  var11 = var15 / var20;
                  var13 = 16777216 / var20;
                  break L1;
                }
              }
              L2: {
                if (this.field_n) {
                  var12 = 2048 + (var12 >> -1720215103);
                  var11 = (var11 >> 1627837985) + 2048;
                  var13 = (var13 >> -1254476095) + 2048;
                  break L2;
                } else {
                  break L2;
                }
              }
              var42[var10] = var11;
              var43[var10] = var12;
              var44[var10] = var13;
              var10++;
              continue L0;
            } else {
              if (param1 != -1) {
                this.field_n = false;
                return var22;
              } else {
                return var22;
              }
            }
          }
        } else {
          if (param1 != -1) {
            this.field_n = false;
            return var22;
          } else {
            return var22;
          }
        }
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_10_0 = null;
        Object stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 107) {
              var4_int = param2;
              if (0 != var4_int) {
                if (var4_int == 1) {
                  L1: {
                    stackIn_10_0 = this;

                    if (-2 != (param1.h(255) ^ -1)) {
                      stackIn_11_0 = this;
                      stackIn_11_1 = 0;
                      break L1;
                    } else {
                      stackIn_11_0 = this;
                      stackIn_11_1 = 1;
                      break L1;
                    }
                  }
                  ((jv) (this)).field_n = stackIn_11_1 != 0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  return;
                }
              } else {
                this.field_o = param1.d(param0 ^ 18);
                return;
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("jv.A(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L2;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L2;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(int param0) {
        if (param0 != -15471) {
            return;
        }
        field_m = null;
    }

    static {
        field_m = new ica();
    }
}
