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
        ((wb) this).field_D = 4096;
        ((wb) this).field_B = 8192;
        ((wb) this).field_G = 2048;
        ((wb) this).field_F = 0;
        ((wb) this).field_y = 0;
        ((wb) this).field_A = 2048;
        ((wb) this).field_z = 12288;
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        Object var12 = null;
        int[] var13 = null;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_28_1 = 0;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int stackIn_31_2 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_26_0 = 0;
        int stackOut_25_0 = 0;
        int[] stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        int[] stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int stackOut_29_2 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int stackOut_30_2 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          var13 = ((wb) this).field_x.a(param0, (byte) 75);
          var3 = var13;
          if (!((wb) this).field_x.field_i) {
            break L0;
          } else {
            var4 = lf.field_y[param0] + -2048;
            var5 = 0;
            L1: while (true) {
              if (var5 >= we.field_M) {
                break L0;
              } else {
                L2: {
                  var6 = rh.field_O[var5] - 2048;
                  var7 = ((wb) this).field_A + var6;
                  if (var7 < -2048) {
                    stackOut_5_0 = 4096 + var7;
                    stackIn_6_0 = stackOut_5_0;
                    break L2;
                  } else {
                    stackOut_4_0 = var7;
                    stackIn_6_0 = stackOut_4_0;
                    break L2;
                  }
                }
                L3: {
                  var7 = stackIn_6_0;
                  if (var7 <= 2048) {
                    stackOut_8_0 = var7;
                    stackIn_9_0 = stackOut_8_0;
                    break L3;
                  } else {
                    stackOut_7_0 = -4096 + var7;
                    stackIn_9_0 = stackOut_7_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_9_0;
                  var8 = var4 + ((wb) this).field_y;
                  if (var8 >= -2048) {
                    stackOut_11_0 = var8;
                    stackIn_12_0 = stackOut_11_0;
                    break L4;
                  } else {
                    stackOut_10_0 = 4096 + var8;
                    stackIn_12_0 = stackOut_10_0;
                    break L4;
                  }
                }
                L5: {
                  var8 = stackIn_12_0;
                  if (2048 >= var8) {
                    stackOut_14_0 = var8;
                    stackIn_15_0 = stackOut_14_0;
                    break L5;
                  } else {
                    stackOut_13_0 = -4096 + var8;
                    stackIn_15_0 = stackOut_13_0;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_15_0;
                  var9 = ((wb) this).field_F + var6;
                  if (var9 >= -2048) {
                    stackOut_17_0 = var9;
                    stackIn_18_0 = stackOut_17_0;
                    break L6;
                  } else {
                    stackOut_16_0 = 4096 + var9;
                    stackIn_18_0 = stackOut_16_0;
                    break L6;
                  }
                }
                L7: {
                  var9 = stackIn_18_0;
                  if (2048 >= var9) {
                    stackOut_20_0 = var9;
                    stackIn_21_0 = stackOut_20_0;
                    break L7;
                  } else {
                    stackOut_19_0 = var9 - 4096;
                    stackIn_21_0 = stackOut_19_0;
                    break L7;
                  }
                }
                L8: {
                  var9 = stackIn_21_0;
                  var10 = ((wb) this).field_G + var4;
                  if (-2048 <= var10) {
                    stackOut_23_0 = var10;
                    stackIn_24_0 = stackOut_23_0;
                    break L8;
                  } else {
                    stackOut_22_0 = var10 + 4096;
                    stackIn_24_0 = stackOut_22_0;
                    break L8;
                  }
                }
                L9: {
                  var10 = stackIn_24_0;
                  if (2048 < var10) {
                    stackOut_26_0 = var10 + -4096;
                    stackIn_27_0 = stackOut_26_0;
                    break L9;
                  } else {
                    stackOut_25_0 = var10;
                    stackIn_27_0 = stackOut_25_0;
                    break L9;
                  }
                }
                L10: {
                  L11: {
                    var10 = stackIn_27_0;
                    stackOut_27_0 = (int[]) var13;
                    stackOut_27_1 = var5;
                    stackIn_30_0 = stackOut_27_0;
                    stackIn_30_1 = stackOut_27_1;
                    stackIn_28_0 = stackOut_27_0;
                    stackIn_28_1 = stackOut_27_1;
                    if (this.a(var8, var7, false)) {
                      break L11;
                    } else {
                      stackOut_28_0 = (int[]) (Object) stackIn_28_0;
                      stackOut_28_1 = stackIn_28_1;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_30_1 = stackOut_28_1;
                      stackIn_29_0 = stackOut_28_0;
                      stackIn_29_1 = stackOut_28_1;
                      if (this.a(var9, var10, (byte) 125)) {
                        break L11;
                      } else {
                        stackOut_29_0 = (int[]) (Object) stackIn_29_0;
                        stackOut_29_1 = stackIn_29_1;
                        stackOut_29_2 = 0;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        stackIn_31_2 = stackOut_29_2;
                        break L10;
                      }
                    }
                  }
                  stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                  stackOut_30_1 = stackIn_30_1;
                  stackOut_30_2 = 4096;
                  stackIn_31_0 = stackOut_30_0;
                  stackIn_31_1 = stackOut_30_1;
                  stackIn_31_2 = stackOut_30_2;
                  break L10;
                }
                stackIn_31_0[stackIn_31_1] = stackIn_31_2;
                var5++;
                continue L1;
              }
            }
          }
        }
        L12: {
          if (param1 > 91) {
            break L12;
          } else {
            var12 = null;
            ((wb) this).a((byte) -116, 10, (ed) null);
            break L12;
          }
        }
        return var3;
    }

    final static boolean a(char param0, byte param1) {
        int var2 = 0;
        if (!Character.isISOControl(param0)) {
          var2 = 65 / ((param1 - 54) / 56);
          if (!d.a(param0, 2)) {
            L0: {
              if (45 == param0) {
                break L0;
              } else {
                if (param0 == 160) {
                  break L0;
                } else {
                  if (param0 == 32) {
                    break L0;
                  } else {
                    if (param0 != 95) {
                      return false;
                    } else {
                      return true;
                    }
                  }
                }
              }
            }
            return true;
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 110) {
                break L1;
              } else {
                ((wb) this).field_G = 78;
                break L1;
              }
            }
            L2: {
              var4_int = param1;
              if (var4_int == 0) {
                ((wb) this).field_A = param2.a((byte) -11);
                break L2;
              } else {
                if (var4_int == 1) {
                  ((wb) this).field_y = param2.a((byte) -11);
                  break L2;
                } else {
                  if (var4_int != 2) {
                    if (var4_int != 3) {
                      if (var4_int == 4) {
                        ((wb) this).field_z = param2.a((byte) -11);
                        break L2;
                      } else {
                        if (var4_int == 5) {
                          ((wb) this).field_D = param2.a((byte) -11);
                          break L2;
                        } else {
                          if (var4_int != 6) {
                            break L2;
                          } else {
                            ((wb) this).field_B = param2.a((byte) -11);
                            break L2;
                          }
                        }
                      }
                    } else {
                      ((wb) this).field_G = param2.a((byte) -11);
                      break L2;
                    }
                  } else {
                    ((wb) this).field_F = param2.a((byte) -11);
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
            stackOut_21_0 = (RuntimeException) var4;
            stackOut_21_1 = new StringBuilder().append("wb.C(").append(param0).append(',').append(param1).append(',');
            stackIn_23_0 = stackOut_21_0;
            stackIn_23_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param2 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_24_0 = stackOut_22_0;
              stackIn_24_1 = stackOut_22_1;
              stackIn_24_2 = stackOut_22_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    private final boolean a(int param0, int param1, byte param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = ((wb) this).field_z * (param0 + param1) >> 12;
            var5 = qb.field_b[var4 * 255 >> 12 & 255];
            var5 = (var5 << 12) / ((wb) this).field_z;
            var5 = (var5 << 12) / ((wb) this).field_B;
            var5 = var5 * ((wb) this).field_D >> 12;
            if (param1 + -param0 >= var5) {
              break L1;
            } else {
              if (param1 - param0 <= -var5) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    private final boolean a(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_4_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_3_0 = 0;
        L0: {
          L1: {
            var4 = ((wb) this).field_z * (param0 - param1) >> 12;
            var5 = qb.field_b[var4 * 255 >> 12 & 255];
            var5 = (var5 << 12) / ((wb) this).field_z;
            var5 = (var5 << 12) / ((wb) this).field_B;
            var5 = var5 * ((wb) this).field_D >> 12;
            if (param1 + param0 >= var5) {
              break L1;
            } else {
              if (param0 + param1 <= -var5) {
                break L1;
              } else {
                stackOut_2_0 = 1;
                stackIn_4_0 = stackOut_2_0;
                break L0;
              }
            }
          }
          stackOut_3_0 = 0;
          stackIn_4_0 = stackOut_3_0;
          break L0;
        }
        return stackIn_4_0 != 0;
    }

    final void a(int param0) {
        if (param0 >= -98) {
            return;
        }
        uk.d((byte) 37);
    }

    public static void b() {
        field_C = null;
        field_E = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Please remove <%0> from your friend list first.";
    }
}
