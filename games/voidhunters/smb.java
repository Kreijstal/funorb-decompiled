/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class smb extends le {
    private int[] field_l;
    private int field_i;
    private int field_k;
    private int field_j;

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                this.field_k = -104;
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (0 == var4_int) {
                this.field_k = param2.e(1869);
                break L2;
              } else {
                if (var4_int == 1) {
                  this.field_i = param2.e(1869);
                  break L2;
                } else {
                  if (2 != var4_int) {
                    break L2;
                  } else {
                    this.field_j = param2.e(1869);
                    break L2;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("smb.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L3;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    final void c(byte param0) {
        this.d(-32307);
        if (param0 >= -35) {
            int[] var3 = (int[]) null;
            smb.a((int[]) null, 127, -20, (byte) 126, (int[]) null);
        }
    }

    private final void d(int param0) {
        double var2 = Math.cos((double)((float)this.field_j / 4096.0f));
        this.field_l[0] = (int)(4096.0 * (Math.sin((double)((float)this.field_i / 4096.0f)) * var2));
        this.field_l[1] = (int)(var2 * Math.cos((double)((float)this.field_i / 4096.0f)) * 4096.0);
        this.field_l[2] = (int)(Math.sin((double)((float)this.field_j / 4096.0f)) * 4096.0);
        int var4 = this.field_l[0] * this.field_l[0] >> -397584052;
        int var5 = this.field_l[1] * this.field_l[1] >> -1050948436;
        if (param0 != -32307) {
            this.field_k = 57;
        }
        int var6 = this.field_l[2] * this.field_l[2] >> -809277972;
        int var7 = (int)(Math.sqrt((double)(var4 - -var5 - -var6 >> 985094092)) * 4096.0);
        if (var7 != 0) {
            this.field_l[0] = (this.field_l[0] << -55565684) / var7;
            this.field_l[2] = (this.field_l[2] << -674709076) / var7;
            this.field_l[1] = (this.field_l[1] << -328780276) / var7;
        }
    }

    final int[] a(int param0, boolean param1) {
        int var7 = 0;
        int[] var25 = null;
        int[] var9 = null;
        int[] var26 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var5 = 0;
        int var6 = 0;
        int var4 = 0;
        int var17 = VoidHunters.field_G;
        if (!param1) {
            return (int[]) null;
        }
        int[] var18 = this.field_f.a((byte) 127, param0);
        int[] var3 = var18;
        if (this.field_f.field_e) {
            var7 = this.field_k * tpa.field_b >> -494587508;
            var25 = this.a(0, -1 + param0 & wf.field_d, 255);
            var9 = this.a(0, param0, 255);
            var26 = this.a(0, 1 + param0 & wf.field_d, 255);
            for (var11 = 0; var11 < hob.field_d; var11++) {
                var12 = var7 * (-var25[var11] + var26[var11]) >> 1811174220;
                var13 = (var9[-1 + var11 & gbb.field_q] - var9[var11 + 1 & gbb.field_q]) * var7 >> 2043761548;
                var14 = var13 >> -211420572;
                var15 = var12 >> 381119300;
                if (-1 < (var14 ^ -1)) {
                    var14 = -var14;
                }
                if (!(0 <= var15)) {
                    var15 = -var15;
                }
                if (255 < var14) {
                    var14 = 255;
                }
                if (-256 > (var15 ^ -1)) {
                    var15 = 255;
                }
                var16 = rob.field_o[(var15 * (var15 - -1) >> -315103327) + var14] & 255;
                var5 = var16 * var12 >> -402082520;
                var6 = var16 * 4096 >> -40133848;
                var4 = var16 * var13 >> -257801400;
                var6 = var6 * this.field_l[2] >> -715242836;
                var4 = var4 * this.field_l[0] >> 409347596;
                var5 = this.field_l[1] * var5 >> 1339196620;
                var18[var11] = var6 + (var5 + var4);
            }
        }
        return var18;
    }

    final static void a(int[] param0, int param1, int param2, byte param3, int[] param4) {
        int incrementValue$0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 >= param2) {
                break L1;
              } else {
                L2: {
                  var5_int = (param2 + param1) / 2;
                  var6 = param1;
                  var7 = param4[var5_int];
                  param4[var5_int] = param4[param2];
                  param4[param2] = var7;
                  var8 = param0[var5_int];
                  param0[var5_int] = param0[param2];
                  param0[param2] = var8;
                  if (var7 != 2147483647) {
                    stackIn_5_0 = 1;
                    break L2;
                  } else {
                    stackIn_5_0 = 0;
                    break L2;
                  }
                }
                var9 = stackIn_5_0;
                var10 = param1;
                L3: while (true) {
                  if (var10 >= param2) {
                    param4[param2] = param4[var6];
                    param4[var6] = var7;
                    param0[param2] = param0[var6];
                    param0[var6] = var8;
                    smb.a(param0, param1, -1 + var6, (byte) -54, param4);
                    smb.a(param0, var6 - -1, param2, (byte) -119, param4);
                    break L1;
                  } else {
                    if ((var9 & var10) + var7 > param4[var10]) {
                      var11 = param4[var10];
                      param4[var10] = param4[var6];
                      param4[var6] = var11;
                      var12 = param0[var10];
                      param0[var10] = param0[var6];
                      incrementValue$0 = var6;
                      var6++;
                      param0[incrementValue$0] = var12;
                      var10++;
                      continue L3;
                    } else {
                      var10++;
                      continue L3;
                    }
                  }
                }
              }
            }
            if (param3 > -37) {
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var5 = decompiledCaughtException;
            stackIn_17_0 = (RuntimeException) (var5);

            stackIn_17_1 = new StringBuilder().append("smb.D(");

            if (param0 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "null";
              break L4;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackIn_18_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackIn_18_2 = "{...}";
              break L4;
            }
          }
          L5: {


            stackIn_20_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');

            if (param4 == null) {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "null";
              break L5;
            } else {
              stackIn_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_21_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackIn_21_2 = "{...}";
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_18_0), stackIn_21_2 + ')');
        }
    }

    public smb() {
        super(1, true);
        this.field_l = new int[3];
        this.field_i = 3216;
        this.field_k = 4096;
        this.field_j = 3216;
    }

    final static boolean a(byte param0, int param1) {
        if (param0 != -26) {
            int[] var3 = (int[]) null;
            smb.a((int[]) null, -116, 50, (byte) -85, (int[]) null);
        }
        return true;
    }

    static {
    }
}
