/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb extends ji {
    private int field_K;
    private int field_J;
    private int field_B;
    static String field_L;
    static String field_A;
    private int field_D;
    static int field_y;
    private int field_z;
    private int field_C;
    static int[] field_H;
    private int field_I;
    static int field_G;
    private int field_F;
    private int field_E;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        tg.a((byte) -50);
        bi.c(param2, param0, param1, param4);
    }

    public static void b() {
        field_H = null;
        field_L = null;
        field_A = null;
    }

    private final void a(int param0, boolean param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        L0: {
          var14 = Vertigo2.field_L ? 1 : 0;
          if (param3 <= 2048) {
            stackOut_2_0 = param3 * (4096 + param0) >> 12;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -(param0 * param3 >> 12) + (param3 + param0);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (0 < var5) {
          param2 = param2 * 6;
          var6 = -var5 + param3 + param3;
          var7 = (-var6 + var5 << 12) / var5;
          var8 = param2 >> 12;
          var9 = param2 + -(var8 << 12);
          var10 = var5;
          var10 = var10 * var7 >> 12;
          var10 = var9 * var10 >> 12;
          var11 = var6 - -var10;
          var12 = var5 + -var10;
          var13 = var8;
          if (0 != var13) {
            if (-2 != var13) {
              if (var13 != 2) {
                if (3 != var13) {
                  if (var13 != 4) {
                    if (-6 != var13) {
                      return;
                    } else {
                      ((jb) this).field_z = var6;
                      ((jb) this).field_F = var5;
                      ((jb) this).field_B = var12;
                      return;
                    }
                  } else {
                    ((jb) this).field_z = var6;
                    ((jb) this).field_B = var5;
                    ((jb) this).field_F = var11;
                    return;
                  }
                } else {
                  ((jb) this).field_z = var12;
                  ((jb) this).field_F = var6;
                  ((jb) this).field_B = var5;
                  return;
                }
              } else {
                ((jb) this).field_z = var5;
                ((jb) this).field_F = var6;
                ((jb) this).field_B = var11;
                return;
              }
            } else {
              ((jb) this).field_F = var12;
              ((jb) this).field_z = var5;
              ((jb) this).field_B = var6;
              return;
            }
          } else {
            ((jb) this).field_z = var11;
            ((jb) this).field_F = var5;
            ((jb) this).field_B = var6;
            return;
          }
        } else {
          ((jb) this).field_B = param3;
          ((jb) this).field_z = param3;
          ((jb) this).field_F = param3;
          return;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var4_int = param1;
              if (var4_int != 0) {
                if (var4_int == 1) {
                  ((jb) this).field_D = (param2.g(111) << 12) / 100;
                  break L1;
                } else {
                  if (var4_int == 2) {
                    ((jb) this).field_I = (param2.g(81) << 12) / 100;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              } else {
                ((jb) this).field_J = param2.n(2);
                break L1;
              }
            }
            L2: {
              if (param0 == 110) {
                break L2;
              } else {
                ((jb) this).field_z = -99;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) var4;
            stackOut_12_1 = new StringBuilder().append("jb.C(").append(param0).append(44).append(param1).append(44);
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wn.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
    }

    public jb() {
        super(1, false);
        ((jb) this).field_J = 0;
        ((jb) this).field_D = 0;
        ((jb) this).field_I = 0;
    }

    private final void a(int param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_3_0 = 0;
        int stackIn_6_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        Object stackIn_15_0 = null;
        int stackIn_15_1 = 0;
        Object stackIn_16_0 = null;
        int stackIn_16_1 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        int stackIn_17_2 = 0;
        Object stackIn_21_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        Object stackIn_25_0 = null;
        Object stackIn_26_0 = null;
        Object stackIn_27_0 = null;
        int stackIn_27_1 = 0;
        Object stackIn_29_0 = null;
        Object stackIn_30_0 = null;
        Object stackIn_31_0 = null;
        int stackIn_31_1 = 0;
        Object stackIn_40_0 = null;
        Object stackIn_41_0 = null;
        Object stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        Object stackIn_44_0 = null;
        Object stackIn_45_0 = null;
        Object stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        Object stackIn_49_0 = null;
        Object stackIn_50_0 = null;
        Object stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        Object stackIn_59_0 = null;
        Object stackIn_60_0 = null;
        Object stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        Object stackIn_63_0 = null;
        Object stackIn_64_0 = null;
        Object stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        Object stackIn_68_0 = null;
        Object stackIn_69_0 = null;
        Object stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        Object stackOut_48_0 = null;
        Object stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        Object stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        Object stackOut_43_0 = null;
        Object stackOut_45_0 = null;
        int stackOut_45_1 = 0;
        Object stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        Object stackOut_39_0 = null;
        Object stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        Object stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        Object stackOut_67_0 = null;
        Object stackOut_69_0 = null;
        int stackOut_69_1 = 0;
        Object stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        Object stackOut_62_0 = null;
        Object stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        Object stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        Object stackOut_58_0 = null;
        Object stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        Object stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        Object stackOut_14_0 = null;
        int stackOut_14_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        int stackOut_16_2 = 0;
        Object stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        int stackOut_15_2 = 0;
        Object stackOut_28_0 = null;
        Object stackOut_30_0 = null;
        int stackOut_30_1 = 0;
        Object stackOut_29_0 = null;
        int stackOut_29_1 = 0;
        Object stackOut_24_0 = null;
        Object stackOut_26_0 = null;
        int stackOut_26_1 = 0;
        Object stackOut_25_0 = null;
        int stackOut_25_1 = 0;
        Object stackOut_20_0 = null;
        Object stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        Object stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          var11 = Vertigo2.field_L ? 1 : 0;
          if (param1 < param2) {
            stackOut_2_0 = param2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = param1;
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        L1: {
          var5 = stackIn_3_0;
          if (var5 < param0) {
            stackOut_5_0 = param0;
            stackIn_6_0 = stackOut_5_0;
            break L1;
          } else {
            stackOut_4_0 = var5;
            stackIn_6_0 = stackOut_4_0;
            break L1;
          }
        }
        L2: {
          var5 = stackIn_6_0;
          if (param1 > param2) {
            stackOut_8_0 = param2;
            stackIn_9_0 = stackOut_8_0;
            break L2;
          } else {
            stackOut_7_0 = param1;
            stackIn_9_0 = stackOut_7_0;
            break L2;
          }
        }
        L3: {
          var6 = stackIn_9_0;
          if (var6 <= param0) {
            stackOut_11_0 = var6;
            stackIn_12_0 = stackOut_11_0;
            break L3;
          } else {
            stackOut_10_0 = param0;
            stackIn_12_0 = stackOut_10_0;
            break L3;
          }
        }
        var6 = stackIn_12_0;
        var7 = var5 + -var6;
        ((jb) this).field_E = (var5 + var6) / 2;
        if (((jb) this).field_E <= 0) {
          ((jb) this).field_K = 0;
          if (var7 > 0) {
            var8 = (var5 - param2 << 12) / var7;
            var9 = (var5 - param1 << 12) / var7;
            var10 = (var5 + -param0 << 12) / var7;
            if (var5 == param2) {
              L4: {
                stackOut_48_0 = this;
                stackIn_50_0 = stackOut_48_0;
                stackIn_49_0 = stackOut_48_0;
                if (var6 != param1) {
                  stackOut_50_0 = this;
                  stackOut_50_1 = -var9 + 4096;
                  stackIn_51_0 = stackOut_50_0;
                  stackIn_51_1 = stackOut_50_1;
                  break L4;
                } else {
                  stackOut_49_0 = this;
                  stackOut_49_1 = var10 + 20480;
                  stackIn_51_0 = stackOut_49_0;
                  stackIn_51_1 = stackOut_49_1;
                  break L4;
                }
              }
              ((jb) this).field_C = stackIn_51_1;
              ((jb) this).field_C = ((jb) this).field_C / 6;
              return;
            } else {
              if (var5 != param1) {
                L5: {
                  stackOut_43_0 = this;
                  stackIn_45_0 = stackOut_43_0;
                  stackIn_44_0 = stackOut_43_0;
                  if (param2 == var6) {
                    stackOut_45_0 = this;
                    stackOut_45_1 = 12288 - -var9;
                    stackIn_46_0 = stackOut_45_0;
                    stackIn_46_1 = stackOut_45_1;
                    break L5;
                  } else {
                    stackOut_44_0 = this;
                    stackOut_44_1 = 20480 - var8;
                    stackIn_46_0 = stackOut_44_0;
                    stackIn_46_1 = stackOut_44_1;
                    break L5;
                  }
                }
                ((jb) this).field_C = stackIn_46_1;
                ((jb) this).field_C = ((jb) this).field_C / 6;
                return;
              } else {
                L6: {
                  stackOut_39_0 = this;
                  stackIn_41_0 = stackOut_39_0;
                  stackIn_40_0 = stackOut_39_0;
                  if (param0 == var6) {
                    stackOut_41_0 = this;
                    stackOut_41_1 = 4096 + var8;
                    stackIn_42_0 = stackOut_41_0;
                    stackIn_42_1 = stackOut_41_1;
                    break L6;
                  } else {
                    stackOut_40_0 = this;
                    stackOut_40_1 = -var10 + 12288;
                    stackIn_42_0 = stackOut_40_0;
                    stackIn_42_1 = stackOut_40_1;
                    break L6;
                  }
                }
                ((jb) this).field_C = stackIn_42_1;
                ((jb) this).field_C = ((jb) this).field_C / 6;
                return;
              }
            }
          } else {
            ((jb) this).field_C = 0;
            return;
          }
        } else {
          if (((jb) this).field_E >= 4096) {
            ((jb) this).field_K = 0;
            if (var7 > 0) {
              var8 = (var5 - param2 << 12) / var7;
              var9 = (var5 - param1 << 12) / var7;
              var10 = (var5 + -param0 << 12) / var7;
              if (var5 == param2) {
                L7: {
                  stackOut_67_0 = this;
                  stackIn_69_0 = stackOut_67_0;
                  stackIn_68_0 = stackOut_67_0;
                  if (var6 != param1) {
                    stackOut_69_0 = this;
                    stackOut_69_1 = -var9 + 4096;
                    stackIn_70_0 = stackOut_69_0;
                    stackIn_70_1 = stackOut_69_1;
                    break L7;
                  } else {
                    stackOut_68_0 = this;
                    stackOut_68_1 = var10 + 20480;
                    stackIn_70_0 = stackOut_68_0;
                    stackIn_70_1 = stackOut_68_1;
                    break L7;
                  }
                }
                ((jb) this).field_C = stackIn_70_1;
                ((jb) this).field_C = ((jb) this).field_C / 6;
                return;
              } else {
                if (var5 != param1) {
                  L8: {
                    stackOut_62_0 = this;
                    stackIn_64_0 = stackOut_62_0;
                    stackIn_63_0 = stackOut_62_0;
                    if (param2 == var6) {
                      stackOut_64_0 = this;
                      stackOut_64_1 = 12288 - -var9;
                      stackIn_65_0 = stackOut_64_0;
                      stackIn_65_1 = stackOut_64_1;
                      break L8;
                    } else {
                      stackOut_63_0 = this;
                      stackOut_63_1 = 20480 - var8;
                      stackIn_65_0 = stackOut_63_0;
                      stackIn_65_1 = stackOut_63_1;
                      break L8;
                    }
                  }
                  ((jb) this).field_C = stackIn_65_1;
                  ((jb) this).field_C = ((jb) this).field_C / 6;
                  return;
                } else {
                  L9: {
                    stackOut_58_0 = this;
                    stackIn_60_0 = stackOut_58_0;
                    stackIn_59_0 = stackOut_58_0;
                    if (param0 == var6) {
                      stackOut_60_0 = this;
                      stackOut_60_1 = 4096 + var8;
                      stackIn_61_0 = stackOut_60_0;
                      stackIn_61_1 = stackOut_60_1;
                      break L9;
                    } else {
                      stackOut_59_0 = this;
                      stackOut_59_1 = -var10 + 12288;
                      stackIn_61_0 = stackOut_59_0;
                      stackIn_61_1 = stackOut_59_1;
                      break L9;
                    }
                  }
                  ((jb) this).field_C = stackIn_61_1;
                  ((jb) this).field_C = ((jb) this).field_C / 6;
                  return;
                }
              }
            } else {
              ((jb) this).field_C = 0;
              return;
            }
          } else {
            L10: {
              stackOut_14_0 = this;
              stackOut_14_1 = var7 << 12;
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              if (((jb) this).field_E > 2048) {
                stackOut_16_0 = this;
                stackOut_16_1 = stackIn_16_1;
                stackOut_16_2 = -(((jb) this).field_E * 2) + 8192;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                stackIn_17_2 = stackOut_16_2;
                break L10;
              } else {
                stackOut_15_0 = this;
                stackOut_15_1 = stackIn_15_1;
                stackOut_15_2 = ((jb) this).field_E * 2;
                stackIn_17_0 = stackOut_15_0;
                stackIn_17_1 = stackOut_15_1;
                stackIn_17_2 = stackOut_15_2;
                break L10;
              }
            }
            L11: {
              ((jb) this).field_K = stackIn_17_1 / stackIn_17_2;
              if (var7 <= 0) {
                ((jb) this).field_C = 0;
                break L11;
              } else {
                L12: {
                  var8 = (var5 - param2 << 12) / var7;
                  var9 = (var5 - param1 << 12) / var7;
                  var10 = (var5 + -param0 << 12) / var7;
                  if (var5 == param2) {
                    L13: {
                      stackOut_28_0 = this;
                      stackIn_30_0 = stackOut_28_0;
                      stackIn_29_0 = stackOut_28_0;
                      if (var6 != param1) {
                        stackOut_30_0 = this;
                        stackOut_30_1 = -var9 + 4096;
                        stackIn_31_0 = stackOut_30_0;
                        stackIn_31_1 = stackOut_30_1;
                        break L13;
                      } else {
                        stackOut_29_0 = this;
                        stackOut_29_1 = var10 + 20480;
                        stackIn_31_0 = stackOut_29_0;
                        stackIn_31_1 = stackOut_29_1;
                        break L13;
                      }
                    }
                    ((jb) this).field_C = stackIn_31_1;
                    break L12;
                  } else {
                    if (var5 == param1) {
                      L14: {
                        stackOut_24_0 = this;
                        stackIn_26_0 = stackOut_24_0;
                        stackIn_25_0 = stackOut_24_0;
                        if (param0 == var6) {
                          stackOut_26_0 = this;
                          stackOut_26_1 = 4096 + var8;
                          stackIn_27_0 = stackOut_26_0;
                          stackIn_27_1 = stackOut_26_1;
                          break L14;
                        } else {
                          stackOut_25_0 = this;
                          stackOut_25_1 = -var10 + 12288;
                          stackIn_27_0 = stackOut_25_0;
                          stackIn_27_1 = stackOut_25_1;
                          break L14;
                        }
                      }
                      ((jb) this).field_C = stackIn_27_1;
                      break L12;
                    } else {
                      L15: {
                        stackOut_20_0 = this;
                        stackIn_22_0 = stackOut_20_0;
                        stackIn_21_0 = stackOut_20_0;
                        if (param2 == var6) {
                          stackOut_22_0 = this;
                          stackOut_22_1 = 12288 - -var9;
                          stackIn_23_0 = stackOut_22_0;
                          stackIn_23_1 = stackOut_22_1;
                          break L15;
                        } else {
                          stackOut_21_0 = this;
                          stackOut_21_1 = 20480 - var8;
                          stackIn_23_0 = stackOut_21_0;
                          stackIn_23_1 = stackOut_21_1;
                          break L15;
                        }
                      }
                      ((jb) this).field_C = stackIn_23_1;
                      break L12;
                    }
                  }
                }
                ((jb) this).field_C = ((jb) this).field_C / 6;
                break L11;
              }
            }
            return;
          }
        }
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int[][] var13 = null;
        int[][] var15 = null;
        int[][] var20 = null;
        int[] var21 = null;
        int[] var22 = null;
        int[] var23 = null;
        int[][] var25 = null;
        int[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[][] var30 = null;
        int[][] var34 = null;
        int[][] var35 = null;
        int[] var36 = null;
        int[] var37 = null;
        int[] var38 = null;
        int[][] var39 = null;
        int[][] var40 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        var12 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          var40 = ((jb) this).field_v.a(param1, -2);
          var30 = var40;
          var20 = var30;
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (!((jb) this).field_v.field_c) {
            return var3;
          } else {
            var39 = ((jb) this).c(0, 3, param1);
            var43 = var39[0];
            var42 = var39[1];
            var41 = var39[2];
            var8 = var40[0];
            var9 = var40[1];
            var10 = var40[2];
            var11 = 0;
            L0: while (true) {
              if (we.field_M <= var11) {
                return var3;
              } else {
                this.a(var41[var11], var42[var11], var43[var11], 12288);
                ((jb) this).field_E = ((jb) this).field_E + ((jb) this).field_I;
                ((jb) this).field_K = ((jb) this).field_K + ((jb) this).field_D;
                ((jb) this).field_C = ((jb) this).field_C + ((jb) this).field_J;
                L1: while (true) {
                  if (((jb) this).field_C >= 0) {
                    L2: {
                      if (0 > ((jb) this).field_K) {
                        ((jb) this).field_K = 0;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                    L3: while (true) {
                      if (4096 >= ((jb) this).field_C) {
                        L4: {
                          if (((jb) this).field_E >= 0) {
                            break L4;
                          } else {
                            ((jb) this).field_E = 0;
                            break L4;
                          }
                        }
                        L5: {
                          if (((jb) this).field_K > 4096) {
                            ((jb) this).field_K = 4096;
                            break L5;
                          } else {
                            break L5;
                          }
                        }
                        L6: {
                          if (((jb) this).field_E <= 4096) {
                            break L6;
                          } else {
                            ((jb) this).field_E = 4096;
                            break L6;
                          }
                        }
                        this.a(((jb) this).field_K, true, ((jb) this).field_C, ((jb) this).field_E);
                        var8[var11] = ((jb) this).field_F;
                        var9[var11] = ((jb) this).field_z;
                        var10[var11] = ((jb) this).field_B;
                        var11++;
                        continue L0;
                      } else {
                        ((jb) this).field_C = ((jb) this).field_C - 4096;
                        continue L3;
                      }
                    }
                  } else {
                    ((jb) this).field_C = ((jb) this).field_C + 4096;
                    continue L1;
                  }
                }
              }
            }
          }
        } else {
          ((jb) this).field_K = -88;
          var35 = ((jb) this).field_v.a(param1, -2);
          var25 = var35;
          var20 = var25;
          var15 = var20;
          var13 = var15;
          var3 = var13;
          if (((jb) this).field_v.field_c) {
            var34 = ((jb) this).c(0, 3, param1);
            var38 = var34[0];
            var28 = var38;
            var23 = var28;
            var37 = var34[1];
            var27 = var37;
            var22 = var27;
            var36 = var34[2];
            var26 = var36;
            var21 = var26;
            var8 = var35[0];
            var9 = var35[1];
            var10 = var35[2];
            var11 = 0;
            L7: while (true) {
              if (we.field_M > var11) {
                this.a(var36[var11], var37[var11], var38[var11], 12288);
                ((jb) this).field_E = ((jb) this).field_E + ((jb) this).field_I;
                ((jb) this).field_K = ((jb) this).field_K + ((jb) this).field_D;
                ((jb) this).field_C = ((jb) this).field_C + ((jb) this).field_J;
                L8: while (true) {
                  if (((jb) this).field_C >= 0) {
                    L9: {
                      if (0 > ((jb) this).field_K) {
                        ((jb) this).field_K = 0;
                        break L9;
                      } else {
                        break L9;
                      }
                    }
                    L10: while (true) {
                      if (4096 >= ((jb) this).field_C) {
                        L11: {
                          if (((jb) this).field_E >= 0) {
                            break L11;
                          } else {
                            ((jb) this).field_E = 0;
                            break L11;
                          }
                        }
                        L12: {
                          if (((jb) this).field_K > 4096) {
                            ((jb) this).field_K = 4096;
                            break L12;
                          } else {
                            break L12;
                          }
                        }
                        L13: {
                          if (((jb) this).field_E <= 4096) {
                            break L13;
                          } else {
                            ((jb) this).field_E = 4096;
                            break L13;
                          }
                        }
                        this.a(((jb) this).field_K, true, ((jb) this).field_C, ((jb) this).field_E);
                        var8[var11] = ((jb) this).field_F;
                        var9[var11] = ((jb) this).field_z;
                        var10[var11] = ((jb) this).field_B;
                        var11++;
                        continue L7;
                      } else {
                        ((jb) this).field_C = ((jb) this).field_C - 4096;
                        continue L10;
                      }
                    }
                  } else {
                    ((jb) this).field_C = ((jb) this).field_C + 4096;
                    continue L8;
                  }
                }
              } else {
                return var3;
              }
            }
          } else {
            return var3;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_A = "Reload game";
        field_H = new int[8192];
        field_L = "If you jump while standing on a fan, you go twice as high. You need to do this to reach the top of this level. Remember to paint the fan, too!";
        field_y = 72;
        field_G = -1;
    }
}
