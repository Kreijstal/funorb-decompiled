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
        if (param3 != -30486) {
          field_y = 78;
          bi.c(param2, param0, param1, param4);
          return;
        } else {
          bi.c(param2, param0, param1, param4);
          return;
        }
    }

    public static void b(byte param0) {
        field_H = null;
        field_L = null;
        field_A = null;
        if (param0 == -118) {
            return;
        }
        field_y = 20;
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
          if ((param3 ^ -1) >= -2049) {
            stackOut_2_0 = param3 * (4096 + param0) >> 1420937356;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          } else {
            stackOut_1_0 = -(param0 * param3 >> -1240887252) + (param3 + param0);
            stackIn_3_0 = stackOut_1_0;
            break L0;
          }
        }
        var5 = stackIn_3_0;
        if (param1) {
          if (0 < var5) {
            param2 = param2 * 6;
            var6 = -var5 + param3 + param3;
            var7 = (-var6 + var5 << -877878164) / var5;
            var8 = param2 >> 321980812;
            var9 = param2 + -(var8 << 1306561868);
            var10 = var5;
            var10 = var10 * var7 >> 1763568332;
            var10 = var9 * var10 >> 1767661164;
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
        } else {
          return;
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        int var5 = 0;
        var5 = Vertigo2.field_L ? 1 : 0;
        var4 = param1;
        if (-1 != (var4 ^ -1)) {
          if (var4 == -2) {
            ((jb) this).field_D = (param2.g(111) << -537177300) / 100;
            if (param0 == 110) {
              return;
            } else {
              ((jb) this).field_z = -99;
              return;
            }
          } else {
            if (-3 == var4) {
              ((jb) this).field_I = (param2.g(81) << -1779215636) / 100;
              if (param0 == 110) {
                return;
              } else {
                ((jb) this).field_z = -99;
                return;
              }
            } else {
              if (param0 == 110) {
                return;
              } else {
                ((jb) this).field_z = -99;
                return;
              }
            }
          }
        } else {
          ((jb) this).field_J = param2.n(2);
          if (param0 == 110) {
            return;
          } else {
            ((jb) this).field_z = -99;
            return;
          }
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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        Object stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        Object stackIn_18_0 = null;
        int stackIn_18_1 = 0;
        Object stackIn_19_0 = null;
        int stackIn_19_1 = 0;
        int stackIn_19_2 = 0;
        Object stackIn_23_0 = null;
        Object stackIn_24_0 = null;
        Object stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        Object stackIn_27_0 = null;
        Object stackIn_28_0 = null;
        Object stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        Object stackIn_31_0 = null;
        Object stackIn_32_0 = null;
        Object stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        Object stackIn_42_0 = null;
        Object stackIn_43_0 = null;
        Object stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        Object stackIn_46_0 = null;
        Object stackIn_47_0 = null;
        Object stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        Object stackIn_51_0 = null;
        Object stackIn_52_0 = null;
        Object stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        Object stackIn_61_0 = null;
        Object stackIn_62_0 = null;
        Object stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        Object stackIn_65_0 = null;
        Object stackIn_66_0 = null;
        Object stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        Object stackIn_70_0 = null;
        Object stackIn_71_0 = null;
        Object stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackOut_2_0 = 0;
        int stackOut_1_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        Object stackOut_50_0 = null;
        Object stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        Object stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        Object stackOut_45_0 = null;
        Object stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        Object stackOut_46_0 = null;
        int stackOut_46_1 = 0;
        Object stackOut_41_0 = null;
        Object stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        Object stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        Object stackOut_69_0 = null;
        Object stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        Object stackOut_70_0 = null;
        int stackOut_70_1 = 0;
        Object stackOut_64_0 = null;
        Object stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        Object stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        Object stackOut_60_0 = null;
        Object stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        Object stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        Object stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        Object stackOut_18_0 = null;
        int stackOut_18_1 = 0;
        int stackOut_18_2 = 0;
        Object stackOut_17_0 = null;
        int stackOut_17_1 = 0;
        int stackOut_17_2 = 0;
        Object stackOut_30_0 = null;
        Object stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        Object stackOut_31_0 = null;
        int stackOut_31_1 = 0;
        Object stackOut_26_0 = null;
        Object stackOut_28_0 = null;
        int stackOut_28_1 = 0;
        Object stackOut_27_0 = null;
        int stackOut_27_1 = 0;
        Object stackOut_22_0 = null;
        Object stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        Object stackOut_23_0 = null;
        int stackOut_23_1 = 0;
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
        var5 = stackIn_3_0;
        if (param3 == 12288) {
          L1: {
            if (var5 < param0) {
              stackOut_7_0 = param0;
              stackIn_8_0 = stackOut_7_0;
              break L1;
            } else {
              stackOut_6_0 = var5;
              stackIn_8_0 = stackOut_6_0;
              break L1;
            }
          }
          L2: {
            var5 = stackIn_8_0;
            if (param1 > param2) {
              stackOut_10_0 = param2;
              stackIn_11_0 = stackOut_10_0;
              break L2;
            } else {
              stackOut_9_0 = param1;
              stackIn_11_0 = stackOut_9_0;
              break L2;
            }
          }
          L3: {
            var6 = stackIn_11_0;
            if (var6 <= param0) {
              stackOut_13_0 = var6;
              stackIn_14_0 = stackOut_13_0;
              break L3;
            } else {
              stackOut_12_0 = param0;
              stackIn_14_0 = stackOut_12_0;
              break L3;
            }
          }
          var6 = stackIn_14_0;
          var7 = var5 + -var6;
          ((jb) this).field_E = (var5 + var6) / 2;
          if ((((jb) this).field_E ^ -1) >= -1) {
            ((jb) this).field_K = 0;
            if (-1 > (var7 ^ -1)) {
              var8 = (var5 - param2 << -1816751796) / var7;
              var9 = (var5 - param1 << 1705437100) / var7;
              var10 = (var5 + -param0 << 346720364) / var7;
              if (var5 == param2) {
                L4: {
                  stackOut_50_0 = this;
                  stackIn_52_0 = stackOut_50_0;
                  stackIn_51_0 = stackOut_50_0;
                  if (var6 != param1) {
                    stackOut_52_0 = this;
                    stackOut_52_1 = -var9 + 4096;
                    stackIn_53_0 = stackOut_52_0;
                    stackIn_53_1 = stackOut_52_1;
                    break L4;
                  } else {
                    stackOut_51_0 = this;
                    stackOut_51_1 = var10 + 20480;
                    stackIn_53_0 = stackOut_51_0;
                    stackIn_53_1 = stackOut_51_1;
                    break L4;
                  }
                }
                ((jb) this).field_C = stackIn_53_1;
                ((jb) this).field_C = ((jb) this).field_C / 6;
                return;
              } else {
                if (var5 != param1) {
                  L5: {
                    stackOut_45_0 = this;
                    stackIn_47_0 = stackOut_45_0;
                    stackIn_46_0 = stackOut_45_0;
                    if (param2 == var6) {
                      stackOut_47_0 = this;
                      stackOut_47_1 = 12288 - -var9;
                      stackIn_48_0 = stackOut_47_0;
                      stackIn_48_1 = stackOut_47_1;
                      break L5;
                    } else {
                      stackOut_46_0 = this;
                      stackOut_46_1 = 20480 - var8;
                      stackIn_48_0 = stackOut_46_0;
                      stackIn_48_1 = stackOut_46_1;
                      break L5;
                    }
                  }
                  ((jb) this).field_C = stackIn_48_1;
                  ((jb) this).field_C = ((jb) this).field_C / 6;
                  return;
                } else {
                  L6: {
                    stackOut_41_0 = this;
                    stackIn_43_0 = stackOut_41_0;
                    stackIn_42_0 = stackOut_41_0;
                    if (param0 == var6) {
                      stackOut_43_0 = this;
                      stackOut_43_1 = 4096 + var8;
                      stackIn_44_0 = stackOut_43_0;
                      stackIn_44_1 = stackOut_43_1;
                      break L6;
                    } else {
                      stackOut_42_0 = this;
                      stackOut_42_1 = -var10 + 12288;
                      stackIn_44_0 = stackOut_42_0;
                      stackIn_44_1 = stackOut_42_1;
                      break L6;
                    }
                  }
                  ((jb) this).field_C = stackIn_44_1;
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
              if (-1 > (var7 ^ -1)) {
                var8 = (var5 - param2 << -1816751796) / var7;
                var9 = (var5 - param1 << 1705437100) / var7;
                var10 = (var5 + -param0 << 346720364) / var7;
                if (var5 == param2) {
                  L7: {
                    stackOut_69_0 = this;
                    stackIn_71_0 = stackOut_69_0;
                    stackIn_70_0 = stackOut_69_0;
                    if (var6 != param1) {
                      stackOut_71_0 = this;
                      stackOut_71_1 = -var9 + 4096;
                      stackIn_72_0 = stackOut_71_0;
                      stackIn_72_1 = stackOut_71_1;
                      break L7;
                    } else {
                      stackOut_70_0 = this;
                      stackOut_70_1 = var10 + 20480;
                      stackIn_72_0 = stackOut_70_0;
                      stackIn_72_1 = stackOut_70_1;
                      break L7;
                    }
                  }
                  ((jb) this).field_C = stackIn_72_1;
                  ((jb) this).field_C = ((jb) this).field_C / 6;
                  return;
                } else {
                  if (var5 != param1) {
                    L8: {
                      stackOut_64_0 = this;
                      stackIn_66_0 = stackOut_64_0;
                      stackIn_65_0 = stackOut_64_0;
                      if (param2 == var6) {
                        stackOut_66_0 = this;
                        stackOut_66_1 = 12288 - -var9;
                        stackIn_67_0 = stackOut_66_0;
                        stackIn_67_1 = stackOut_66_1;
                        break L8;
                      } else {
                        stackOut_65_0 = this;
                        stackOut_65_1 = 20480 - var8;
                        stackIn_67_0 = stackOut_65_0;
                        stackIn_67_1 = stackOut_65_1;
                        break L8;
                      }
                    }
                    ((jb) this).field_C = stackIn_67_1;
                    ((jb) this).field_C = ((jb) this).field_C / 6;
                    return;
                  } else {
                    L9: {
                      stackOut_60_0 = this;
                      stackIn_62_0 = stackOut_60_0;
                      stackIn_61_0 = stackOut_60_0;
                      if (param0 == var6) {
                        stackOut_62_0 = this;
                        stackOut_62_1 = 4096 + var8;
                        stackIn_63_0 = stackOut_62_0;
                        stackIn_63_1 = stackOut_62_1;
                        break L9;
                      } else {
                        stackOut_61_0 = this;
                        stackOut_61_1 = -var10 + 12288;
                        stackIn_63_0 = stackOut_61_0;
                        stackIn_63_1 = stackOut_61_1;
                        break L9;
                      }
                    }
                    ((jb) this).field_C = stackIn_63_1;
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
                stackOut_16_0 = this;
                stackOut_16_1 = var7 << 1721524428;
                stackIn_18_0 = stackOut_16_0;
                stackIn_18_1 = stackOut_16_1;
                stackIn_17_0 = stackOut_16_0;
                stackIn_17_1 = stackOut_16_1;
                if ((((jb) this).field_E ^ -1) < -2049) {
                  stackOut_18_0 = this;
                  stackOut_18_1 = stackIn_18_1;
                  stackOut_18_2 = -(((jb) this).field_E * 2) + 8192;
                  stackIn_19_0 = stackOut_18_0;
                  stackIn_19_1 = stackOut_18_1;
                  stackIn_19_2 = stackOut_18_2;
                  break L10;
                } else {
                  stackOut_17_0 = this;
                  stackOut_17_1 = stackIn_17_1;
                  stackOut_17_2 = ((jb) this).field_E * 2;
                  stackIn_19_0 = stackOut_17_0;
                  stackIn_19_1 = stackOut_17_1;
                  stackIn_19_2 = stackOut_17_2;
                  break L10;
                }
              }
              L11: {
                ((jb) this).field_K = stackIn_19_1 / stackIn_19_2;
                if (-1 <= (var7 ^ -1)) {
                  ((jb) this).field_C = 0;
                  break L11;
                } else {
                  L12: {
                    var8 = (var5 - param2 << -1816751796) / var7;
                    var9 = (var5 - param1 << 1705437100) / var7;
                    var10 = (var5 + -param0 << 346720364) / var7;
                    if (var5 == param2) {
                      L13: {
                        stackOut_30_0 = this;
                        stackIn_32_0 = stackOut_30_0;
                        stackIn_31_0 = stackOut_30_0;
                        if (var6 != param1) {
                          stackOut_32_0 = this;
                          stackOut_32_1 = -var9 + 4096;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          break L13;
                        } else {
                          stackOut_31_0 = this;
                          stackOut_31_1 = var10 + 20480;
                          stackIn_33_0 = stackOut_31_0;
                          stackIn_33_1 = stackOut_31_1;
                          break L13;
                        }
                      }
                      ((jb) this).field_C = stackIn_33_1;
                      break L12;
                    } else {
                      if (var5 == param1) {
                        L14: {
                          stackOut_26_0 = this;
                          stackIn_28_0 = stackOut_26_0;
                          stackIn_27_0 = stackOut_26_0;
                          if (param0 == var6) {
                            stackOut_28_0 = this;
                            stackOut_28_1 = 4096 + var8;
                            stackIn_29_0 = stackOut_28_0;
                            stackIn_29_1 = stackOut_28_1;
                            break L14;
                          } else {
                            stackOut_27_0 = this;
                            stackOut_27_1 = -var10 + 12288;
                            stackIn_29_0 = stackOut_27_0;
                            stackIn_29_1 = stackOut_27_1;
                            break L14;
                          }
                        }
                        ((jb) this).field_C = stackIn_29_1;
                        break L12;
                      } else {
                        L15: {
                          stackOut_22_0 = this;
                          stackIn_24_0 = stackOut_22_0;
                          stackIn_23_0 = stackOut_22_0;
                          if (param2 == var6) {
                            stackOut_24_0 = this;
                            stackOut_24_1 = 12288 - -var9;
                            stackIn_25_0 = stackOut_24_0;
                            stackIn_25_1 = stackOut_24_1;
                            break L15;
                          } else {
                            stackOut_23_0 = this;
                            stackOut_23_1 = 20480 - var8;
                            stackIn_25_0 = stackOut_23_0;
                            stackIn_25_1 = stackOut_23_1;
                            break L15;
                          }
                        }
                        ((jb) this).field_C = stackIn_25_1;
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
        } else {
          return;
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
                          if (-4097 <= (((jb) this).field_E ^ -1)) {
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
                          if (-4097 <= (((jb) this).field_E ^ -1)) {
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
