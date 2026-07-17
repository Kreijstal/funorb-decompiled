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
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        var4 = ((oqb) this).field_q * (param2 - -param0) >> 12;
        if (param1 == 1047718) {
          L0: {
            L1: {
              var5 = jmb.field_q[(255 * var4 & 1046912) >> 12];
              var5 = (var5 << 12) / ((oqb) this).field_q;
              var5 = (var5 << 12) / ((oqb) this).field_m;
              var5 = ((oqb) this).field_p * var5 >> 12;
              if (var5 <= param2 - param0) {
                break L1;
              } else {
                if (-param0 + param2 <= -var5) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return false;
        }
    }

    public oqb() {
        super(0, true);
        ((oqb) this).field_i = 2048;
        ((oqb) this).field_q = 12288;
        ((oqb) this).field_m = 8192;
        ((oqb) this).field_j = 0;
        ((oqb) this).field_p = 4096;
        ((oqb) this).field_l = 0;
        ((oqb) this).field_o = 2048;
    }

    final void c(byte param0) {
        if (param0 >= -35) {
            boolean discarded$0 = this.d(-93, -27, 100);
        }
        taa.e((byte) 118);
    }

    final int[] a(int param0, boolean param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int[] var12 = null;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        int[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        int[] stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_34_2 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_27_0 = 0;
        int[] stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        int[] stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        int[] stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int stackOut_32_2 = 0;
        L0: {
          var11 = VoidHunters.field_G;
          if (param1) {
            break L0;
          } else {
            ((oqb) this).c((byte) -85);
            break L0;
          }
        }
        L1: {
          var12 = ((oqb) this).field_f.a((byte) 119, param0);
          var3 = var12;
          if (!((oqb) this).field_f.field_e) {
            break L1;
          } else {
            var4 = sj.field_p[param0] + -2048;
            var5 = 0;
            L2: while (true) {
              if (~var5 <= ~hob.field_d) {
                break L1;
              } else {
                L3: {
                  var6 = -2048 + grb.field_l[var5];
                  var7 = ((oqb) this).field_o + var6;
                  if (var7 >= -2048) {
                    stackOut_7_0 = var7;
                    stackIn_8_0 = stackOut_7_0;
                    break L3;
                  } else {
                    stackOut_6_0 = 4096 + var7;
                    stackIn_8_0 = stackOut_6_0;
                    break L3;
                  }
                }
                L4: {
                  var7 = stackIn_8_0;
                  if (var7 <= 2048) {
                    stackOut_10_0 = var7;
                    stackIn_11_0 = stackOut_10_0;
                    break L4;
                  } else {
                    stackOut_9_0 = -4096 + var7;
                    stackIn_11_0 = stackOut_9_0;
                    break L4;
                  }
                }
                L5: {
                  var7 = stackIn_11_0;
                  var8 = var4 + ((oqb) this).field_j;
                  if (var8 < -2048) {
                    stackOut_13_0 = var8 - -4096;
                    stackIn_14_0 = stackOut_13_0;
                    break L5;
                  } else {
                    stackOut_12_0 = var8;
                    stackIn_14_0 = stackOut_12_0;
                    break L5;
                  }
                }
                L6: {
                  var8 = stackIn_14_0;
                  if (var8 <= 2048) {
                    stackOut_16_0 = var8;
                    stackIn_17_0 = stackOut_16_0;
                    break L6;
                  } else {
                    stackOut_15_0 = var8 + -4096;
                    stackIn_17_0 = stackOut_15_0;
                    break L6;
                  }
                }
                L7: {
                  var8 = stackIn_17_0;
                  var9 = var6 + ((oqb) this).field_l;
                  if (-2048 <= var9) {
                    stackOut_19_0 = var9;
                    stackIn_20_0 = stackOut_19_0;
                    break L7;
                  } else {
                    stackOut_18_0 = var9 - -4096;
                    stackIn_20_0 = stackOut_18_0;
                    break L7;
                  }
                }
                L8: {
                  var9 = stackIn_20_0;
                  if (2048 < var9) {
                    stackOut_22_0 = -4096 + var9;
                    stackIn_23_0 = stackOut_22_0;
                    break L8;
                  } else {
                    stackOut_21_0 = var9;
                    stackIn_23_0 = stackOut_21_0;
                    break L8;
                  }
                }
                L9: {
                  var9 = stackIn_23_0;
                  var10 = var4 - -((oqb) this).field_i;
                  if (var10 >= -2048) {
                    stackOut_25_0 = var10;
                    stackIn_26_0 = stackOut_25_0;
                    break L9;
                  } else {
                    stackOut_24_0 = var10 - -4096;
                    stackIn_26_0 = stackOut_24_0;
                    break L9;
                  }
                }
                L10: {
                  var10 = stackIn_26_0;
                  if (2048 < var10) {
                    stackOut_28_0 = var10 + -4096;
                    stackIn_29_0 = stackOut_28_0;
                    break L10;
                  } else {
                    stackOut_27_0 = var10;
                    stackIn_29_0 = stackOut_27_0;
                    break L10;
                  }
                }
                L11: {
                  L12: {
                    var10 = stackIn_29_0;
                    stackOut_29_0 = (int[]) var12;
                    stackOut_29_1 = var5;
                    stackIn_32_0 = stackOut_29_0;
                    stackIn_32_1 = stackOut_29_1;
                    stackIn_30_0 = stackOut_29_0;
                    stackIn_30_1 = stackOut_29_1;
                    if (this.c(var8, -23429, var7)) {
                      break L12;
                    } else {
                      stackOut_30_0 = (int[]) (Object) stackIn_30_0;
                      stackOut_30_1 = stackIn_30_1;
                      stackIn_33_0 = stackOut_30_0;
                      stackIn_33_1 = stackOut_30_1;
                      stackIn_31_0 = stackOut_30_0;
                      stackIn_31_1 = stackOut_30_1;
                      if (!this.d(var9, 1047718, var10)) {
                        stackOut_33_0 = (int[]) (Object) stackIn_33_0;
                        stackOut_33_1 = stackIn_33_1;
                        stackOut_33_2 = 0;
                        stackIn_34_0 = stackOut_33_0;
                        stackIn_34_1 = stackOut_33_1;
                        stackIn_34_2 = stackOut_33_2;
                        break L11;
                      } else {
                        stackOut_31_0 = (int[]) (Object) stackIn_31_0;
                        stackOut_31_1 = stackIn_31_1;
                        stackIn_32_0 = stackOut_31_0;
                        stackIn_32_1 = stackOut_31_1;
                        break L12;
                      }
                    }
                  }
                  stackOut_32_0 = (int[]) (Object) stackIn_32_0;
                  stackOut_32_1 = stackIn_32_1;
                  stackOut_32_2 = 4096;
                  stackIn_34_0 = stackOut_32_0;
                  stackIn_34_1 = stackOut_32_1;
                  stackIn_34_2 = stackOut_32_2;
                  break L11;
                }
                stackIn_34_0[stackIn_34_1] = stackIn_34_2;
                var5++;
                continue L2;
              }
            }
          }
        }
        return var12;
    }

    public static void e(byte param0) {
        field_k = null;
        field_n = null;
    }

    final void a(int param0, int param1, ds param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var5 = VoidHunters.field_G;
        try {
          L0: {
            L1: {
              var4_int = param0;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  ((oqb) this).field_j = param2.e(1869);
                  break L1;
                } else {
                  if (var4_int != 2) {
                    if (var4_int != 3) {
                      if (var4_int == 4) {
                        ((oqb) this).field_q = param2.e(1869);
                        break L1;
                      } else {
                        if (5 != var4_int) {
                          if (var4_int == 6) {
                            ((oqb) this).field_m = param2.e(1869);
                            break L1;
                          } else {
                            break L1;
                          }
                        } else {
                          ((oqb) this).field_p = param2.e(1869);
                          break L1;
                        }
                      }
                    } else {
                      ((oqb) this).field_i = param2.e(1869);
                      break L1;
                    }
                  } else {
                    ((oqb) this).field_l = param2.e(1869);
                    break L1;
                  }
                }
              } else {
                ((oqb) this).field_o = param2.e(1869);
                break L1;
              }
            }
            L2: {
              if (param1 <= -60) {
                break L2;
              } else {
                int[] discarded$1 = ((oqb) this).a(116, true);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var4;
            stackOut_23_1 = new StringBuilder().append("oqb.F(").append(param0).append(44).append(param1).append(44);
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param2 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw rta.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 41);
        }
    }

    private final boolean c(int param0, int param1, int param2) {
        int var4 = 0;
        int var5 = 0;
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        var4 = (-param2 + param0) * ((oqb) this).field_q >> 12;
        var5 = jmb.field_q[(var4 * 255 & 1047718) >> 12];
        var5 = (var5 << 12) / ((oqb) this).field_q;
        if (param1 == -23429) {
          L0: {
            L1: {
              var5 = (var5 << 12) / ((oqb) this).field_m;
              var5 = var5 * ((oqb) this).field_p >> 12;
              if (var5 <= param2 - -param0) {
                break L1;
              } else {
                if (-var5 >= param0 + param2) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Quick Chat game";
        field_n = "Respect";
    }
}
