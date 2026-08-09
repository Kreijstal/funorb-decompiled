/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gia extends le {
    private boolean field_l;
    private int field_i;
    static eab field_k;
    static String field_j;

    final void a(int param0, int param1, ds param2) {
        RuntimeException runtimeException = null;
        int var4_int = 0;
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 < -60) {
                break L1;
              } else {
                field_k = (eab) null;
                break L1;
              }
            }
            var4_int = param0;
            if (var4_int == 0) {
              this.field_i = param2.e(1869);
              return;
            } else {
              L2: {
                if ((var4_int ^ -1) != -2) {
                  break L2;
                } else {
                  L3: {
                    stackIn_9_0 = this;

                    if ((param2.e((byte) -118) ^ -1) != -2) {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 0;
                      break L3;
                    } else {
                      stackIn_10_0 = this;
                      stackIn_10_1 = 1;
                      break L3;
                    }
                  }
                  ((gia) (this)).field_l = stackIn_10_1 != 0;
                  break L2;
                }
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("gia.F(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
    }

    public gia() {
        super(1, false);
        this.field_i = 4096;
        this.field_l = true;
    }

    final int[][] a(int param0, int param1) {
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
        var21 = VoidHunters.field_G;
        var29 = this.field_d.a(param1, (byte) -85);
        var23 = var29;
        var22 = var23;
        var3 = var22;
        if (param0 == 255) {
          if (!this.field_d.field_g) {
            return var22;
          } else {
            var41 = this.a(0, wf.field_d & param1 - 1, 255);
            var5 = this.a(0, param1, 255);
            var40 = this.a(0, 1 + param1 & wf.field_d, 255);
            var42 = var29[0];
            var43 = var29[1];
            var44 = var29[2];
            var10 = 0;
            L0: while (true) {
              if (hob.field_d <= var10) {
                return var22;
              } else {
                L1: {
                  var14 = this.field_i * (var40[var10] - var41[var10]);
                  var15 = (var5[gbb.field_q & var10 - -1] - var5[gbb.field_q & -1 + var10]) * this.field_i;
                  var16 = var15 >> 749562700;
                  var17 = var14 >> -426725108;
                  var18 = var16 * var16 >> -1497329268;
                  var19 = var17 * var17 >> -334275284;
                  var20 = (int)(Math.sqrt((double)((float)(4096 + (var19 + var18)) / 4096.0f)) * 4096.0);
                  if (var20 != 0) {
                    var12 = var14 / var20;
                    var13 = 16777216 / var20;
                    var11 = var15 / var20;
                    break L1;
                  } else {
                    var13 = 0;
                    var12 = 0;
                    var11 = 0;
                    break L1;
                  }
                }
                L2: {
                  if (!this.field_l) {
                    break L2;
                  } else {
                    var13 = 2048 - -(var13 >> -63435647);
                    var11 = 2048 + (var11 >> -111119967);
                    var12 = 2048 - -(var12 >> 2111853921);
                    break L2;
                  }
                }
                var42[var10] = var11;
                var43[var10] = var12;
                var44[var10] = var13;
                var10++;
                continue L0;
              }
            }
          }
        } else {
          return (int[][]) null;
        }
    }

    public static void a(boolean param0) {
        field_j = null;
        field_k = null;
        if (param0) {
            gia.a(true);
        }
    }

    final static int d(int param0) {
        if (param0 != -2) {
            field_j = (String) null;
            return rpa.field_b;
        }
        return rpa.field_b;
    }

    static {
        field_j = "Boosters";
    }
}
