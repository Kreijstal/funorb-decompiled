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
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              if (param1 <= -60) {
                break L1;
              } else {
                ((smb) this).field_k = -104;
                break L1;
              }
            }
            L2: {
              var4_int = param0;
              if (0 == var4_int) {
                ((smb) this).field_k = param2.e(1869);
                break L2;
              } else {
                if (var4_int == 1) {
                  ((smb) this).field_i = param2.e(1869);
                  break L2;
                } else {
                  if (2 != var4_int) {
                    break L2;
                  } else {
                    ((smb) this).field_j = param2.e(1869);
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("smb.F(").append(param0).append(',').append(param1).append(',');
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + ')');
        }
    }

    final void c(byte param0) {
        this.d(-32307);
        if (param0 >= -35) {
            Object var3 = null;
            smb.a((int[]) null, 127, -20, (byte) 126, (int[]) null);
        }
    }

    private final void d(int param0) {
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        L0: {
          var2 = Math.cos((double)((float)((smb) this).field_j / 4096.0f));
          ((smb) this).field_l[0] = (int)(4096.0 * (Math.sin((double)((float)((smb) this).field_i / 4096.0f)) * var2));
          ((smb) this).field_l[1] = (int)(var2 * Math.cos((double)((float)((smb) this).field_i / 4096.0f)) * 4096.0);
          ((smb) this).field_l[2] = (int)(Math.sin((double)((float)((smb) this).field_j / 4096.0f)) * 4096.0);
          var4 = ((smb) this).field_l[0] * ((smb) this).field_l[0] >> 12;
          var5 = ((smb) this).field_l[1] * ((smb) this).field_l[1] >> 12;
          var6 = ((smb) this).field_l[2] * ((smb) this).field_l[2] >> 12;
          var7 = (int)(Math.sqrt((double)(var4 - -var5 - -var6 >> 12)) * 4096.0);
          if (var7 == 0) {
            break L0;
          } else {
            ((smb) this).field_l[0] = (((smb) this).field_l[0] << 12) / var7;
            ((smb) this).field_l[2] = (((smb) this).field_l[2] << 12) / var7;
            ((smb) this).field_l[1] = (((smb) this).field_l[1] << 12) / var7;
            break L0;
          }
        }
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int[] var18 = null;
        int[] var25 = null;
        int[] var26 = null;
        var17 = VoidHunters.field_G;
        if (param1) {
          L0: {
            var18 = ((smb) this).field_f.a((byte) 127, param0);
            var3 = var18;
            if (!((smb) this).field_f.field_e) {
              break L0;
            } else {
              var7 = ((smb) this).field_k * tpa.field_b >> 12;
              var25 = ((smb) this).a(0, -1 + param0 & wf.field_d, 255);
              var9 = ((smb) this).a(0, param0, 255);
              var26 = ((smb) this).a(0, 1 + param0 & wf.field_d, 255);
              var11 = 0;
              L1: while (true) {
                if (var11 >= hob.field_d) {
                  break L0;
                } else {
                  L2: {
                    var12 = var7 * (-var25[var11] + var26[var11]) >> 12;
                    var13 = (var9[-1 + var11 & gbb.field_q] - var9[var11 + 1 & gbb.field_q]) * var7 >> 12;
                    var14 = var13 >> 4;
                    var15 = var12 >> 4;
                    if (var14 >= 0) {
                      break L2;
                    } else {
                      var14 = -var14;
                      break L2;
                    }
                  }
                  L3: {
                    if (0 > var15) {
                      var15 = -var15;
                      break L3;
                    } else {
                      break L3;
                    }
                  }
                  L4: {
                    if (255 >= var14) {
                      break L4;
                    } else {
                      var14 = 255;
                      break L4;
                    }
                  }
                  L5: {
                    if (var15 <= 255) {
                      break L5;
                    } else {
                      var15 = 255;
                      break L5;
                    }
                  }
                  var16 = rob.field_o[(var15 * (var15 - -1) >> 1) + var14] & 255;
                  var5 = var16 * var12 >> 8;
                  var6 = var16 * 4096 >> 8;
                  var4 = var16 * var13 >> 8;
                  var6 = var6 * ((smb) this).field_l[2] >> 12;
                  var4 = var4 * ((smb) this).field_l[0] >> 12;
                  var5 = ((smb) this).field_l[1] * var5 >> 12;
                  var18[var11] = var6 + (var5 + var4);
                  var11++;
                  continue L1;
                }
              }
            }
          }
          return var18;
        } else {
          return null;
        }
    }

    final static void a(int[] param0, int param1, int param2, byte param3, int[] param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var13 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
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
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_5_0 = stackOut_3_0;
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
                    L4: {
                      if ((var9 & var10) + var7 <= param4[var10]) {
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
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
          L5: {
            var5 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var5;
            stackOut_14_1 = new StringBuilder().append("smb.D(");
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          L6: {
            stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param4 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L6;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    public smb() {
        super(1, true);
        ((smb) this).field_l = new int[3];
        ((smb) this).field_i = 3216;
        ((smb) this).field_k = 4096;
        ((smb) this).field_j = 3216;
    }

    final static boolean a(byte param0, int param1) {
        return true;
    }

    static {
    }
}
