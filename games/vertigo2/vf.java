/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends ji {
    static int[] field_y;
    static cr field_B;
    private int field_z;
    static nj field_C;

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        ed var10 = null;
        int[] var11 = null;
        int[] var18 = null;
        int[] var19 = null;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int[] stackOut_44_0 = null;
        int stackOut_44_1 = 0;
        int stackOut_44_2 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int[] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int[] stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        L0: {
          var9 = Vertigo2.field_L ? 1 : 0;
          var11 = this.field_x.a(param0, (byte) -99);
          var3 = var11;
          if (this.field_x.field_i) {
            var19 = this.a(0, -1, param0);
            var18 = this.a(1, -1, param0);
            var8 = this.field_z;
            if (-2 != (var8 ^ -1)) {
              if ((var8 ^ -1) != -3) {
                if (3 == var8) {
                  var8 = 0;
                  L1: while (true) {
                    if (we.field_M <= var8) {
                      break L0;
                    } else {
                      var3[var8] = var19[var8] * var18[var8] >> 996669964;
                      var8++;
                      continue L1;
                    }
                  }
                } else {
                  if (-5 != (var8 ^ -1)) {
                    if (var8 == 5) {
                      var8 = 0;
                      L2: while (true) {
                        if (var8 >= we.field_M) {
                          break L0;
                        } else {
                          var3[var8] = 4096 - ((4096 + -var18[var8]) * (-var19[var8] + 4096) >> -245495444);
                          var8++;
                          continue L2;
                        }
                      }
                    } else {
                      if (6 == var8) {
                        var8 = 0;
                        L3: while (true) {
                          if (var8 >= we.field_M) {
                            break L0;
                          } else {
                            L4: {
                              var5 = var18[var8];
                              stackOut_42_0 = (int[]) (var3);
                              stackOut_42_1 = var8;
                              stackIn_44_0 = stackOut_42_0;
                              stackIn_44_1 = stackOut_42_1;
                              stackIn_43_0 = stackOut_42_0;
                              stackIn_43_1 = stackOut_42_1;
                              if (var5 < 2048) {
                                stackOut_44_0 = (int[]) ((Object) stackIn_44_0);
                                stackOut_44_1 = stackIn_44_1;
                                stackOut_44_2 = var5 * var19[var8] >> 971507211;
                                stackIn_45_0 = stackOut_44_0;
                                stackIn_45_1 = stackOut_44_1;
                                stackIn_45_2 = stackOut_44_2;
                                break L4;
                              } else {
                                stackOut_43_0 = (int[]) ((Object) stackIn_43_0);
                                stackOut_43_1 = stackIn_43_1;
                                stackOut_43_2 = -((-var19[var8] + 4096) * (4096 + -var5) >> -1004381653) + 4096;
                                stackIn_45_0 = stackOut_43_0;
                                stackIn_45_1 = stackOut_43_1;
                                stackIn_45_2 = stackOut_43_2;
                                break L4;
                              }
                            }
                            stackIn_45_0[stackIn_45_1] = stackIn_45_2;
                            var8++;
                            continue L3;
                          }
                        }
                      } else {
                        if (-8 != (var8 ^ -1)) {
                          if (8 != var8) {
                            if ((var8 ^ -1) == -10) {
                              var8 = 0;
                              L5: while (true) {
                                if (we.field_M <= var8) {
                                  break L0;
                                } else {
                                  L6: {
                                    var5 = var18[var8];
                                    var4 = var19[var8];
                                    stackOut_60_0 = (int[]) (var3);
                                    stackOut_60_1 = var8;
                                    stackIn_62_0 = stackOut_60_0;
                                    stackIn_62_1 = stackOut_60_1;
                                    stackIn_61_0 = stackOut_60_0;
                                    stackIn_61_1 = stackOut_60_1;
                                    if (var4 >= var5) {
                                      stackOut_62_0 = (int[]) ((Object) stackIn_62_0);
                                      stackOut_62_1 = stackIn_62_1;
                                      stackOut_62_2 = var5;
                                      stackIn_63_0 = stackOut_62_0;
                                      stackIn_63_1 = stackOut_62_1;
                                      stackIn_63_2 = stackOut_62_2;
                                      break L6;
                                    } else {
                                      stackOut_61_0 = (int[]) ((Object) stackIn_61_0);
                                      stackOut_61_1 = stackIn_61_1;
                                      stackOut_61_2 = var4;
                                      stackIn_63_0 = stackOut_61_0;
                                      stackIn_63_1 = stackOut_61_1;
                                      stackIn_63_2 = stackOut_61_2;
                                      break L6;
                                    }
                                  }
                                  stackIn_63_0[stackIn_63_1] = stackIn_63_2;
                                  var8++;
                                  continue L5;
                                }
                              }
                            } else {
                              if ((var8 ^ -1) != -11) {
                                if (-12 != (var8 ^ -1)) {
                                  if (var8 == 12) {
                                    var8 = 0;
                                    L7: while (true) {
                                      if (we.field_M <= var8) {
                                        break L0;
                                      } else {
                                        var5 = var18[var8];
                                        var4 = var19[var8];
                                        var3[var8] = -(var5 * var4 >> 1428768491) + (var4 - -var5);
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L0;
                                  }
                                } else {
                                  var8 = 0;
                                  L8: while (true) {
                                    if (var8 >= we.field_M) {
                                      break L0;
                                    } else {
                                      L9: {
                                        var4 = var19[var8];
                                        var5 = var18[var8];
                                        stackOut_72_0 = (int[]) (var3);
                                        stackOut_72_1 = var8;
                                        stackIn_74_0 = stackOut_72_0;
                                        stackIn_74_1 = stackOut_72_1;
                                        stackIn_73_0 = stackOut_72_0;
                                        stackIn_73_1 = stackOut_72_1;
                                        if (var4 > var5) {
                                          stackOut_74_0 = (int[]) ((Object) stackIn_74_0);
                                          stackOut_74_1 = stackIn_74_1;
                                          stackOut_74_2 = var4 + -var5;
                                          stackIn_75_0 = stackOut_74_0;
                                          stackIn_75_1 = stackOut_74_1;
                                          stackIn_75_2 = stackOut_74_2;
                                          break L9;
                                        } else {
                                          stackOut_73_0 = (int[]) ((Object) stackIn_73_0);
                                          stackOut_73_1 = stackIn_73_1;
                                          stackOut_73_2 = var5 + -var4;
                                          stackIn_75_0 = stackOut_73_0;
                                          stackIn_75_1 = stackOut_73_1;
                                          stackIn_75_2 = stackOut_73_2;
                                          break L9;
                                        }
                                      }
                                      stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                      var8++;
                                      continue L8;
                                    }
                                  }
                                }
                              } else {
                                var8 = 0;
                                L10: while (true) {
                                  if (var8 >= we.field_M) {
                                    break L0;
                                  } else {
                                    L11: {
                                      var4 = var19[var8];
                                      var5 = var18[var8];
                                      stackOut_66_0 = (int[]) (var3);
                                      stackOut_66_1 = var8;
                                      stackIn_68_0 = stackOut_66_0;
                                      stackIn_68_1 = stackOut_66_1;
                                      stackIn_67_0 = stackOut_66_0;
                                      stackIn_67_1 = stackOut_66_1;
                                      if (var4 > var5) {
                                        stackOut_68_0 = (int[]) ((Object) stackIn_68_0);
                                        stackOut_68_1 = stackIn_68_1;
                                        stackOut_68_2 = var4;
                                        stackIn_69_0 = stackOut_68_0;
                                        stackIn_69_1 = stackOut_68_1;
                                        stackIn_69_2 = stackOut_68_2;
                                        break L11;
                                      } else {
                                        stackOut_67_0 = (int[]) ((Object) stackIn_67_0);
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = var5;
                                        stackIn_69_0 = stackOut_67_0;
                                        stackIn_69_1 = stackOut_67_1;
                                        stackIn_69_2 = stackOut_67_2;
                                        break L11;
                                      }
                                    }
                                    stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                                    var8++;
                                    continue L10;
                                  }
                                }
                              }
                            }
                          } else {
                            var8 = 0;
                            L12: while (true) {
                              if (var8 >= we.field_M) {
                                break L0;
                              } else {
                                L13: {
                                  var4 = var19[var8];
                                  stackOut_54_0 = (int[]) (var3);
                                  stackOut_54_1 = var8;
                                  stackIn_56_0 = stackOut_54_0;
                                  stackIn_56_1 = stackOut_54_1;
                                  stackIn_55_0 = stackOut_54_0;
                                  stackIn_55_1 = stackOut_54_1;
                                  if (-1 == (var4 ^ -1)) {
                                    stackOut_56_0 = (int[]) ((Object) stackIn_56_0);
                                    stackOut_56_1 = stackIn_56_1;
                                    stackOut_56_2 = 0;
                                    stackIn_57_0 = stackOut_56_0;
                                    stackIn_57_1 = stackOut_56_1;
                                    stackIn_57_2 = stackOut_56_2;
                                    break L13;
                                  } else {
                                    stackOut_55_0 = (int[]) ((Object) stackIn_55_0);
                                    stackOut_55_1 = stackIn_55_1;
                                    stackOut_55_2 = -((4096 - var18[var8] << -1071351060) / var4) + 4096;
                                    stackIn_57_0 = stackOut_55_0;
                                    stackIn_57_1 = stackOut_55_1;
                                    stackIn_57_2 = stackOut_55_2;
                                    break L13;
                                  }
                                }
                                stackIn_57_0[stackIn_57_1] = stackIn_57_2;
                                var8++;
                                continue L12;
                              }
                            }
                          }
                        } else {
                          var8 = 0;
                          L14: while (true) {
                            if (we.field_M <= var8) {
                              break L0;
                            } else {
                              L15: {
                                var4 = var19[var8];
                                stackOut_48_0 = (int[]) (var3);
                                stackOut_48_1 = var8;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                if (4096 != var4) {
                                  stackOut_50_0 = (int[]) ((Object) stackIn_50_0);
                                  stackOut_50_1 = stackIn_50_1;
                                  stackOut_50_2 = (var18[var8] << -1295577140) / (4096 - var4);
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  stackIn_51_2 = stackOut_50_2;
                                  break L15;
                                } else {
                                  stackOut_49_0 = (int[]) ((Object) stackIn_49_0);
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = 4096;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  break L15;
                                }
                              }
                              stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                              var8++;
                              continue L14;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var8 = 0;
                    L16: while (true) {
                      if (we.field_M <= var8) {
                        break L0;
                      } else {
                        L17: {
                          var5 = var18[var8];
                          stackOut_33_0 = (int[]) (var3);
                          stackOut_33_1 = var8;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          if (-1 != (var5 ^ -1)) {
                            stackOut_35_0 = (int[]) ((Object) stackIn_35_0);
                            stackOut_35_1 = stackIn_35_1;
                            stackOut_35_2 = (var19[var8] << 760137356) / var5;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            stackIn_36_2 = stackOut_35_2;
                            break L17;
                          } else {
                            stackOut_34_0 = (int[]) ((Object) stackIn_34_0);
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = 4096;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_36_1 = stackOut_34_1;
                            stackIn_36_2 = stackOut_34_2;
                            break L17;
                          }
                        }
                        stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                        var8++;
                        continue L16;
                      }
                    }
                  }
                }
              } else {
                var8 = 0;
                L18: while (true) {
                  if (var8 >= we.field_M) {
                    break L0;
                  } else {
                    var3[var8] = var19[var8] - var18[var8];
                    var8++;
                    continue L18;
                  }
                }
              }
            } else {
              var11 = var3;
              var8 = 0;
              L19: while (true) {
                if (we.field_M <= var8) {
                  break L0;
                } else {
                  var11[var8] = var18[var8] + var19[var8];
                  var8++;
                  continue L19;
                }
              }
            }
          } else {
            break L0;
          }
        }
        L20: {
          if (param1 > 91) {
            break L20;
          } else {
            var10 = (ed) null;
            this.a((byte) -30, 29, (ed) null);
            break L20;
          }
        }
        return var3;
    }

    public vf() {
        super(2, false);
        this.field_z = 6;
    }

    final void a(byte param0, int param1, ed param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
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
            if (param0 == 110) {
              L1: {
                var4_int = param1;
                if (var4_int == 0) {
                  this.field_z = param2.h(param0 ^ -101);
                  break L1;
                } else {
                  if (1 != var4_int) {
                    break L1;
                  } else {
                    L2: {
                      stackOut_7_0 = this;
                      stackIn_9_0 = stackOut_7_0;
                      stackIn_8_0 = stackOut_7_0;
                      if (param2.h(param0 + -121) != 1) {
                        stackOut_9_0 = this;
                        stackOut_9_1 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        stackIn_10_1 = stackOut_9_1;
                        break L2;
                      } else {
                        stackOut_8_0 = this;
                        stackOut_8_1 = 1;
                        stackIn_10_0 = stackOut_8_0;
                        stackIn_10_1 = stackOut_8_1;
                        break L2;
                      }
                    }
                    ((vf) (this)).field_o = stackIn_10_1 != 0;
                    break L1;
                  }
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_12_0 = (RuntimeException) (var4);
            stackOut_12_1 = new StringBuilder().append("vf.C(").append(param0).append(',').append(param1).append(',');
            stackIn_14_0 = stackOut_12_0;
            stackIn_14_1 = stackOut_12_1;
            stackIn_13_0 = stackOut_12_0;
            stackIn_13_1 = stackOut_12_1;
            if (param2 == null) {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L3;
            } else {
              stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackOut_13_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackOut_13_2 = "{...}";
              stackIn_15_0 = stackOut_13_0;
              stackIn_15_1 = stackOut_13_1;
              stackIn_15_2 = stackOut_13_2;
              break L3;
            }
          }
          throw wn.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void b(byte param0) {
        field_C = null;
        if (param0 != 36) {
            field_B = (cr) null;
        }
        field_B = null;
        field_y = null;
    }

    final int[][] b(int param0, int param1) {
        int[][] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var12 = null;
        int[] var13 = null;
        int[] var14 = null;
        int var21 = 0;
        int var22 = 0;
        int[][] var23 = null;
        int[][] var24 = null;
        int[][] var33 = null;
        int[][] var50 = null;
        int[][] var51 = null;
        int[] var52 = null;
        int[] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int[] stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int[] stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int[] stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int[] stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int[] stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int[] stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int[] stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int[] stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int[] stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int[] stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int[] stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int[] stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int[] stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int[] stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int[] stackOut_35_0 = null;
        int stackOut_35_1 = 0;
        int stackOut_35_2 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int[] stackOut_36_0 = null;
        int stackOut_36_1 = 0;
        int[] stackOut_38_0 = null;
        int stackOut_38_1 = 0;
        int stackOut_38_2 = 0;
        int[] stackOut_37_0 = null;
        int stackOut_37_1 = 0;
        int stackOut_37_2 = 0;
        int[] stackOut_39_0 = null;
        int stackOut_39_1 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int stackOut_41_2 = 0;
        int[] stackOut_40_0 = null;
        int stackOut_40_1 = 0;
        int stackOut_40_2 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int[] stackOut_50_0 = null;
        int stackOut_50_1 = 0;
        int stackOut_50_2 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int[] stackOut_51_0 = null;
        int stackOut_51_1 = 0;
        int[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int stackOut_53_2 = 0;
        int[] stackOut_52_0 = null;
        int stackOut_52_1 = 0;
        int stackOut_52_2 = 0;
        int[] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int[] stackOut_56_0 = null;
        int stackOut_56_1 = 0;
        int stackOut_56_2 = 0;
        int[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int[] stackOut_74_0 = null;
        int stackOut_74_1 = 0;
        int stackOut_74_2 = 0;
        int[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int[] stackOut_75_0 = null;
        int stackOut_75_1 = 0;
        int[] stackOut_77_0 = null;
        int stackOut_77_1 = 0;
        int stackOut_77_2 = 0;
        int[] stackOut_76_0 = null;
        int stackOut_76_1 = 0;
        int stackOut_76_2 = 0;
        int[] stackOut_78_0 = null;
        int stackOut_78_1 = 0;
        int[] stackOut_80_0 = null;
        int stackOut_80_1 = 0;
        int stackOut_80_2 = 0;
        int[] stackOut_79_0 = null;
        int stackOut_79_1 = 0;
        int stackOut_79_2 = 0;
        int[] stackOut_84_0 = null;
        int stackOut_84_1 = 0;
        int[] stackOut_86_0 = null;
        int stackOut_86_1 = 0;
        int stackOut_86_2 = 0;
        int[] stackOut_85_0 = null;
        int stackOut_85_1 = 0;
        int stackOut_85_2 = 0;
        int[] stackOut_87_0 = null;
        int stackOut_87_1 = 0;
        int[] stackOut_89_0 = null;
        int stackOut_89_1 = 0;
        int stackOut_89_2 = 0;
        int[] stackOut_88_0 = null;
        int stackOut_88_1 = 0;
        int stackOut_88_2 = 0;
        int[] stackOut_90_0 = null;
        int stackOut_90_1 = 0;
        int[] stackOut_92_0 = null;
        int stackOut_92_1 = 0;
        int stackOut_92_2 = 0;
        int[] stackOut_91_0 = null;
        int stackOut_91_1 = 0;
        int stackOut_91_2 = 0;
        int[] stackOut_108_0 = null;
        int stackOut_108_1 = 0;
        int[] stackOut_110_0 = null;
        int stackOut_110_1 = 0;
        int stackOut_110_2 = 0;
        int[] stackOut_109_0 = null;
        int stackOut_109_1 = 0;
        int stackOut_109_2 = 0;
        int[] stackOut_111_0 = null;
        int stackOut_111_1 = 0;
        int[] stackOut_113_0 = null;
        int stackOut_113_1 = 0;
        int stackOut_113_2 = 0;
        int[] stackOut_112_0 = null;
        int stackOut_112_1 = 0;
        int stackOut_112_2 = 0;
        int[] stackOut_114_0 = null;
        int stackOut_114_1 = 0;
        int[] stackOut_116_0 = null;
        int stackOut_116_1 = 0;
        int stackOut_116_2 = 0;
        int[] stackOut_115_0 = null;
        int stackOut_115_1 = 0;
        int stackOut_115_2 = 0;
        int[] stackOut_96_0 = null;
        int stackOut_96_1 = 0;
        int[] stackOut_98_0 = null;
        int stackOut_98_1 = 0;
        int stackOut_98_2 = 0;
        int[] stackOut_97_0 = null;
        int stackOut_97_1 = 0;
        int stackOut_97_2 = 0;
        int[] stackOut_99_0 = null;
        int stackOut_99_1 = 0;
        int[] stackOut_101_0 = null;
        int stackOut_101_1 = 0;
        int stackOut_101_2 = 0;
        int[] stackOut_100_0 = null;
        int stackOut_100_1 = 0;
        int stackOut_100_2 = 0;
        int[] stackOut_102_0 = null;
        int stackOut_102_1 = 0;
        int[] stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        int stackOut_104_2 = 0;
        int[] stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        int stackOut_103_2 = 0;
        int[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int[] stackOut_62_0 = null;
        int stackOut_62_1 = 0;
        int stackOut_62_2 = 0;
        int[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int[] stackOut_63_0 = null;
        int stackOut_63_1 = 0;
        int[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int stackOut_65_2 = 0;
        int[] stackOut_64_0 = null;
        int stackOut_64_1 = 0;
        int stackOut_64_2 = 0;
        int[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int[] stackOut_68_0 = null;
        int stackOut_68_1 = 0;
        int stackOut_68_2 = 0;
        int[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        var22 = Vertigo2.field_L ? 1 : 0;
        if (param0 == -3780) {
          L0: {
            var33 = this.field_v.a(param1, -2);
            var24 = var33;
            var23 = var24;
            var3 = var23;
            if (this.field_v.field_c) {
              var50 = this.c(0, 3, param1);
              var51 = this.c(1, param0 + 3783, param1);
              var12 = var33[0];
              var13 = var33[1];
              var14 = var33[2];
              var52 = var50[0];
              var55 = var50[1];
              var57 = var50[2];
              var53 = var51[0];
              var54 = var51[1];
              var56 = var51[2];
              var21 = this.field_z;
              if (var21 == 1) {
                var12 = var33[0];
                var13 = var33[1];
                var14 = var33[2];
                var52 = var50[0];
                var53 = var51[0];
                var54 = var51[1];
                var55 = var50[1];
                var56 = var51[2];
                var57 = var50[2];
                var21 = 0;
                L1: while (true) {
                  if (var21 >= we.field_M) {
                    break L0;
                  } else {
                    var12[var21] = var52[var21] - -var53[var21];
                    var13[var21] = var54[var21] + var55[var21];
                    var14[var21] = var56[var21] + var57[var21];
                    var21++;
                    continue L1;
                  }
                }
              } else {
                if (2 != var21) {
                  if (3 != var21) {
                    if (-5 == (var21 ^ -1)) {
                      var12 = var33[0];
                      var13 = var33[1];
                      var14 = var33[2];
                      var52 = var50[0];
                      var53 = var51[0];
                      var54 = var51[1];
                      var55 = var50[1];
                      var56 = var51[2];
                      var57 = var50[2];
                      var21 = 0;
                      L2: while (true) {
                        if (we.field_M <= var21) {
                          break L0;
                        } else {
                          L3: {
                            var7 = var53[var21];
                            var8 = var54[var21];
                            var9 = var56[var21];
                            stackOut_33_0 = (int[]) (var12);
                            stackOut_33_1 = var21;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            stackIn_34_0 = stackOut_33_0;
                            stackIn_34_1 = stackOut_33_1;
                            if (var7 == 0) {
                              stackOut_35_0 = (int[]) ((Object) stackIn_35_0);
                              stackOut_35_1 = stackIn_35_1;
                              stackOut_35_2 = 4096;
                              stackIn_36_0 = stackOut_35_0;
                              stackIn_36_1 = stackOut_35_1;
                              stackIn_36_2 = stackOut_35_2;
                              break L3;
                            } else {
                              stackOut_34_0 = (int[]) ((Object) stackIn_34_0);
                              stackOut_34_1 = stackIn_34_1;
                              stackOut_34_2 = (var52[var21] << 1556283436) / var7;
                              stackIn_36_0 = stackOut_34_0;
                              stackIn_36_1 = stackOut_34_1;
                              stackIn_36_2 = stackOut_34_2;
                              break L3;
                            }
                          }
                          L4: {
                            stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                            stackOut_36_0 = (int[]) (var13);
                            stackOut_36_1 = var21;
                            stackIn_38_0 = stackOut_36_0;
                            stackIn_38_1 = stackOut_36_1;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            if (var8 == 0) {
                              stackOut_38_0 = (int[]) ((Object) stackIn_38_0);
                              stackOut_38_1 = stackIn_38_1;
                              stackOut_38_2 = 4096;
                              stackIn_39_0 = stackOut_38_0;
                              stackIn_39_1 = stackOut_38_1;
                              stackIn_39_2 = stackOut_38_2;
                              break L4;
                            } else {
                              stackOut_37_0 = (int[]) ((Object) stackIn_37_0);
                              stackOut_37_1 = stackIn_37_1;
                              stackOut_37_2 = (var55[var21] << 1627315852) / var8;
                              stackIn_39_0 = stackOut_37_0;
                              stackIn_39_1 = stackOut_37_1;
                              stackIn_39_2 = stackOut_37_2;
                              break L4;
                            }
                          }
                          L5: {
                            stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                            stackOut_39_0 = (int[]) (var14);
                            stackOut_39_1 = var21;
                            stackIn_41_0 = stackOut_39_0;
                            stackIn_41_1 = stackOut_39_1;
                            stackIn_40_0 = stackOut_39_0;
                            stackIn_40_1 = stackOut_39_1;
                            if (-1 != (var9 ^ -1)) {
                              stackOut_41_0 = (int[]) ((Object) stackIn_41_0);
                              stackOut_41_1 = stackIn_41_1;
                              stackOut_41_2 = (var57[var21] << 462182988) / var9;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              stackIn_42_2 = stackOut_41_2;
                              break L5;
                            } else {
                              stackOut_40_0 = (int[]) ((Object) stackIn_40_0);
                              stackOut_40_1 = stackIn_40_1;
                              stackOut_40_2 = 4096;
                              stackIn_42_0 = stackOut_40_0;
                              stackIn_42_1 = stackOut_40_1;
                              stackIn_42_2 = stackOut_40_2;
                              break L5;
                            }
                          }
                          stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                          var21++;
                          continue L2;
                        }
                      }
                    } else {
                      if (var21 != 5) {
                        if ((var21 ^ -1) == -7) {
                          var12 = var33[0];
                          var13 = var33[1];
                          var14 = var33[2];
                          var52 = var50[0];
                          var53 = var51[0];
                          var54 = var51[1];
                          var55 = var50[1];
                          var56 = var51[2];
                          var57 = var50[2];
                          var21 = 0;
                          L6: while (true) {
                            if (var21 >= we.field_M) {
                              break L0;
                            } else {
                              L7: {
                                var9 = var56[var21];
                                var7 = var53[var21];
                                var8 = var54[var21];
                                stackOut_48_0 = (int[]) (var12);
                                stackOut_48_1 = var21;
                                stackIn_50_0 = stackOut_48_0;
                                stackIn_50_1 = stackOut_48_1;
                                stackIn_49_0 = stackOut_48_0;
                                stackIn_49_1 = stackOut_48_1;
                                if (var7 >= 2048) {
                                  stackOut_50_0 = (int[]) ((Object) stackIn_50_0);
                                  stackOut_50_1 = stackIn_50_1;
                                  stackOut_50_2 = -((4096 - var52[var21]) * (-var7 + 4096) >> -678950869) + 4096;
                                  stackIn_51_0 = stackOut_50_0;
                                  stackIn_51_1 = stackOut_50_1;
                                  stackIn_51_2 = stackOut_50_2;
                                  break L7;
                                } else {
                                  stackOut_49_0 = (int[]) ((Object) stackIn_49_0);
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = var7 * var52[var21] >> 1370638475;
                                  stackIn_51_0 = stackOut_49_0;
                                  stackIn_51_1 = stackOut_49_1;
                                  stackIn_51_2 = stackOut_49_2;
                                  break L7;
                                }
                              }
                              L8: {
                                stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                                stackOut_51_0 = (int[]) (var13);
                                stackOut_51_1 = var21;
                                stackIn_53_0 = stackOut_51_0;
                                stackIn_53_1 = stackOut_51_1;
                                stackIn_52_0 = stackOut_51_0;
                                stackIn_52_1 = stackOut_51_1;
                                if (2048 <= var8) {
                                  stackOut_53_0 = (int[]) ((Object) stackIn_53_0);
                                  stackOut_53_1 = stackIn_53_1;
                                  stackOut_53_2 = -((-var8 + 4096) * (-var55[var21] + 4096) >> -263616693) + 4096;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  stackIn_54_2 = stackOut_53_2;
                                  break L8;
                                } else {
                                  stackOut_52_0 = (int[]) ((Object) stackIn_52_0);
                                  stackOut_52_1 = stackIn_52_1;
                                  stackOut_52_2 = var55[var21] * var8 >> 814225547;
                                  stackIn_54_0 = stackOut_52_0;
                                  stackIn_54_1 = stackOut_52_1;
                                  stackIn_54_2 = stackOut_52_2;
                                  break L8;
                                }
                              }
                              L9: {
                                stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                                stackOut_54_0 = (int[]) (var14);
                                stackOut_54_1 = var21;
                                stackIn_56_0 = stackOut_54_0;
                                stackIn_56_1 = stackOut_54_1;
                                stackIn_55_0 = stackOut_54_0;
                                stackIn_55_1 = stackOut_54_1;
                                if (-2049 < (var9 ^ -1)) {
                                  stackOut_56_0 = (int[]) ((Object) stackIn_56_0);
                                  stackOut_56_1 = stackIn_56_1;
                                  stackOut_56_2 = var57[var21] * var9 >> -95235989;
                                  stackIn_57_0 = stackOut_56_0;
                                  stackIn_57_1 = stackOut_56_1;
                                  stackIn_57_2 = stackOut_56_2;
                                  break L9;
                                } else {
                                  stackOut_55_0 = (int[]) ((Object) stackIn_55_0);
                                  stackOut_55_1 = stackIn_55_1;
                                  stackOut_55_2 = -((-var57[var21] + 4096) * (-var9 + 4096) >> -1032851829) + 4096;
                                  stackIn_57_0 = stackOut_55_0;
                                  stackIn_57_1 = stackOut_55_1;
                                  stackIn_57_2 = stackOut_55_2;
                                  break L9;
                                }
                              }
                              stackIn_57_0[stackIn_57_1] = stackIn_57_2;
                              var21++;
                              continue L6;
                            }
                          }
                        } else {
                          if (7 != var21) {
                            if (var21 == 8) {
                              var12 = var33[0];
                              var13 = var33[1];
                              var14 = var33[2];
                              var52 = var50[0];
                              var53 = var51[0];
                              var54 = var51[1];
                              var55 = var50[1];
                              var56 = var51[2];
                              var57 = var50[2];
                              var21 = 0;
                              L10: while (true) {
                                if (we.field_M <= var21) {
                                  break L0;
                                } else {
                                  L11: {
                                    var6 = var57[var21];
                                    var5 = var55[var21];
                                    var4 = var52[var21];
                                    stackOut_72_0 = (int[]) (var12);
                                    stackOut_72_1 = var21;
                                    stackIn_74_0 = stackOut_72_0;
                                    stackIn_74_1 = stackOut_72_1;
                                    stackIn_73_0 = stackOut_72_0;
                                    stackIn_73_1 = stackOut_72_1;
                                    if (var4 == 0) {
                                      stackOut_74_0 = (int[]) ((Object) stackIn_74_0);
                                      stackOut_74_1 = stackIn_74_1;
                                      stackOut_74_2 = 0;
                                      stackIn_75_0 = stackOut_74_0;
                                      stackIn_75_1 = stackOut_74_1;
                                      stackIn_75_2 = stackOut_74_2;
                                      break L11;
                                    } else {
                                      stackOut_73_0 = (int[]) ((Object) stackIn_73_0);
                                      stackOut_73_1 = stackIn_73_1;
                                      stackOut_73_2 = 4096 - (-var53[var21] + 4096 << 204029580) / var4;
                                      stackIn_75_0 = stackOut_73_0;
                                      stackIn_75_1 = stackOut_73_1;
                                      stackIn_75_2 = stackOut_73_2;
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                    stackOut_75_0 = (int[]) (var13);
                                    stackOut_75_1 = var21;
                                    stackIn_77_0 = stackOut_75_0;
                                    stackIn_77_1 = stackOut_75_1;
                                    stackIn_76_0 = stackOut_75_0;
                                    stackIn_76_1 = stackOut_75_1;
                                    if (0 == var5) {
                                      stackOut_77_0 = (int[]) ((Object) stackIn_77_0);
                                      stackOut_77_1 = stackIn_77_1;
                                      stackOut_77_2 = 0;
                                      stackIn_78_0 = stackOut_77_0;
                                      stackIn_78_1 = stackOut_77_1;
                                      stackIn_78_2 = stackOut_77_2;
                                      break L12;
                                    } else {
                                      stackOut_76_0 = (int[]) ((Object) stackIn_76_0);
                                      stackOut_76_1 = stackIn_76_1;
                                      stackOut_76_2 = 4096 - (-var54[var21] + 4096 << 140766508) / var5;
                                      stackIn_78_0 = stackOut_76_0;
                                      stackIn_78_1 = stackOut_76_1;
                                      stackIn_78_2 = stackOut_76_2;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                                    stackOut_78_0 = (int[]) (var14);
                                    stackOut_78_1 = var21;
                                    stackIn_80_0 = stackOut_78_0;
                                    stackIn_80_1 = stackOut_78_1;
                                    stackIn_79_0 = stackOut_78_0;
                                    stackIn_79_1 = stackOut_78_1;
                                    if (0 != var6) {
                                      stackOut_80_0 = (int[]) ((Object) stackIn_80_0);
                                      stackOut_80_1 = stackIn_80_1;
                                      stackOut_80_2 = -((4096 + -var56[var21] << -1482587732) / var6) + 4096;
                                      stackIn_81_0 = stackOut_80_0;
                                      stackIn_81_1 = stackOut_80_1;
                                      stackIn_81_2 = stackOut_80_2;
                                      break L13;
                                    } else {
                                      stackOut_79_0 = (int[]) ((Object) stackIn_79_0);
                                      stackOut_79_1 = stackIn_79_1;
                                      stackOut_79_2 = 0;
                                      stackIn_81_0 = stackOut_79_0;
                                      stackIn_81_1 = stackOut_79_1;
                                      stackIn_81_2 = stackOut_79_2;
                                      break L13;
                                    }
                                  }
                                  stackIn_81_0[stackIn_81_1] = stackIn_81_2;
                                  var21++;
                                  continue L10;
                                }
                              }
                            } else {
                              if (-10 == (var21 ^ -1)) {
                                var12 = var33[0];
                                var13 = var33[1];
                                var14 = var33[2];
                                var52 = var50[0];
                                var53 = var51[0];
                                var54 = var51[1];
                                var55 = var50[1];
                                var56 = var51[2];
                                var57 = var50[2];
                                var21 = 0;
                                L14: while (true) {
                                  if (we.field_M <= var21) {
                                    break L0;
                                  } else {
                                    L15: {
                                      var4 = var52[var21];
                                      var5 = var55[var21];
                                      var9 = var56[var21];
                                      var8 = var54[var21];
                                      var6 = var57[var21];
                                      var7 = var53[var21];
                                      stackOut_84_0 = (int[]) (var12);
                                      stackOut_84_1 = var21;
                                      stackIn_86_0 = stackOut_84_0;
                                      stackIn_86_1 = stackOut_84_1;
                                      stackIn_85_0 = stackOut_84_0;
                                      stackIn_85_1 = stackOut_84_1;
                                      if (var4 >= var7) {
                                        stackOut_86_0 = (int[]) ((Object) stackIn_86_0);
                                        stackOut_86_1 = stackIn_86_1;
                                        stackOut_86_2 = var7;
                                        stackIn_87_0 = stackOut_86_0;
                                        stackIn_87_1 = stackOut_86_1;
                                        stackIn_87_2 = stackOut_86_2;
                                        break L15;
                                      } else {
                                        stackOut_85_0 = (int[]) ((Object) stackIn_85_0);
                                        stackOut_85_1 = stackIn_85_1;
                                        stackOut_85_2 = var4;
                                        stackIn_87_0 = stackOut_85_0;
                                        stackIn_87_1 = stackOut_85_1;
                                        stackIn_87_2 = stackOut_85_2;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      stackIn_87_0[stackIn_87_1] = stackIn_87_2;
                                      stackOut_87_0 = (int[]) (var13);
                                      stackOut_87_1 = var21;
                                      stackIn_89_0 = stackOut_87_0;
                                      stackIn_89_1 = stackOut_87_1;
                                      stackIn_88_0 = stackOut_87_0;
                                      stackIn_88_1 = stackOut_87_1;
                                      if (var5 >= var8) {
                                        stackOut_89_0 = (int[]) ((Object) stackIn_89_0);
                                        stackOut_89_1 = stackIn_89_1;
                                        stackOut_89_2 = var8;
                                        stackIn_90_0 = stackOut_89_0;
                                        stackIn_90_1 = stackOut_89_1;
                                        stackIn_90_2 = stackOut_89_2;
                                        break L16;
                                      } else {
                                        stackOut_88_0 = (int[]) ((Object) stackIn_88_0);
                                        stackOut_88_1 = stackIn_88_1;
                                        stackOut_88_2 = var5;
                                        stackIn_90_0 = stackOut_88_0;
                                        stackIn_90_1 = stackOut_88_1;
                                        stackIn_90_2 = stackOut_88_2;
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      stackIn_90_0[stackIn_90_1] = stackIn_90_2;
                                      stackOut_90_0 = (int[]) (var14);
                                      stackOut_90_1 = var21;
                                      stackIn_92_0 = stackOut_90_0;
                                      stackIn_92_1 = stackOut_90_1;
                                      stackIn_91_0 = stackOut_90_0;
                                      stackIn_91_1 = stackOut_90_1;
                                      if (var9 > var6) {
                                        stackOut_92_0 = (int[]) ((Object) stackIn_92_0);
                                        stackOut_92_1 = stackIn_92_1;
                                        stackOut_92_2 = var6;
                                        stackIn_93_0 = stackOut_92_0;
                                        stackIn_93_1 = stackOut_92_1;
                                        stackIn_93_2 = stackOut_92_2;
                                        break L17;
                                      } else {
                                        stackOut_91_0 = (int[]) ((Object) stackIn_91_0);
                                        stackOut_91_1 = stackIn_91_1;
                                        stackOut_91_2 = var9;
                                        stackIn_93_0 = stackOut_91_0;
                                        stackIn_93_1 = stackOut_91_1;
                                        stackIn_93_2 = stackOut_91_2;
                                        break L17;
                                      }
                                    }
                                    stackIn_93_0[stackIn_93_1] = stackIn_93_2;
                                    var21++;
                                    continue L14;
                                  }
                                }
                              } else {
                                if (10 != var21) {
                                  if (var21 == 11) {
                                    var12 = var33[0];
                                    var13 = var33[1];
                                    var14 = var33[2];
                                    var52 = var50[0];
                                    var53 = var51[0];
                                    var54 = var51[1];
                                    var55 = var50[1];
                                    var56 = var51[2];
                                    var57 = var50[2];
                                    var21 = 0;
                                    L18: while (true) {
                                      if (we.field_M <= var21) {
                                        break L0;
                                      } else {
                                        L19: {
                                          var7 = var53[var21];
                                          var6 = var57[var21];
                                          var4 = var52[var21];
                                          var8 = var54[var21];
                                          var9 = var56[var21];
                                          var5 = var55[var21];
                                          stackOut_108_0 = (int[]) (var12);
                                          stackOut_108_1 = var21;
                                          stackIn_110_0 = stackOut_108_0;
                                          stackIn_110_1 = stackOut_108_1;
                                          stackIn_109_0 = stackOut_108_0;
                                          stackIn_109_1 = stackOut_108_1;
                                          if (var4 <= var7) {
                                            stackOut_110_0 = (int[]) ((Object) stackIn_110_0);
                                            stackOut_110_1 = stackIn_110_1;
                                            stackOut_110_2 = var7 + -var4;
                                            stackIn_111_0 = stackOut_110_0;
                                            stackIn_111_1 = stackOut_110_1;
                                            stackIn_111_2 = stackOut_110_2;
                                            break L19;
                                          } else {
                                            stackOut_109_0 = (int[]) ((Object) stackIn_109_0);
                                            stackOut_109_1 = stackIn_109_1;
                                            stackOut_109_2 = -var7 + var4;
                                            stackIn_111_0 = stackOut_109_0;
                                            stackIn_111_1 = stackOut_109_1;
                                            stackIn_111_2 = stackOut_109_2;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          stackIn_111_0[stackIn_111_1] = stackIn_111_2;
                                          stackOut_111_0 = (int[]) (var13);
                                          stackOut_111_1 = var21;
                                          stackIn_113_0 = stackOut_111_0;
                                          stackIn_113_1 = stackOut_111_1;
                                          stackIn_112_0 = stackOut_111_0;
                                          stackIn_112_1 = stackOut_111_1;
                                          if (var8 >= var5) {
                                            stackOut_113_0 = (int[]) ((Object) stackIn_113_0);
                                            stackOut_113_1 = stackIn_113_1;
                                            stackOut_113_2 = -var5 + var8;
                                            stackIn_114_0 = stackOut_113_0;
                                            stackIn_114_1 = stackOut_113_1;
                                            stackIn_114_2 = stackOut_113_2;
                                            break L20;
                                          } else {
                                            stackOut_112_0 = (int[]) ((Object) stackIn_112_0);
                                            stackOut_112_1 = stackIn_112_1;
                                            stackOut_112_2 = var5 + -var8;
                                            stackIn_114_0 = stackOut_112_0;
                                            stackIn_114_1 = stackOut_112_1;
                                            stackIn_114_2 = stackOut_112_2;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          stackIn_114_0[stackIn_114_1] = stackIn_114_2;
                                          stackOut_114_0 = (int[]) (var14);
                                          stackOut_114_1 = var21;
                                          stackIn_116_0 = stackOut_114_0;
                                          stackIn_116_1 = stackOut_114_1;
                                          stackIn_115_0 = stackOut_114_0;
                                          stackIn_115_1 = stackOut_114_1;
                                          if (var9 < var6) {
                                            stackOut_116_0 = (int[]) ((Object) stackIn_116_0);
                                            stackOut_116_1 = stackIn_116_1;
                                            stackOut_116_2 = -var9 + var6;
                                            stackIn_117_0 = stackOut_116_0;
                                            stackIn_117_1 = stackOut_116_1;
                                            stackIn_117_2 = stackOut_116_2;
                                            break L21;
                                          } else {
                                            stackOut_115_0 = (int[]) ((Object) stackIn_115_0);
                                            stackOut_115_1 = stackIn_115_1;
                                            stackOut_115_2 = var9 - var6;
                                            stackIn_117_0 = stackOut_115_0;
                                            stackIn_117_1 = stackOut_115_1;
                                            stackIn_117_2 = stackOut_115_2;
                                            break L21;
                                          }
                                        }
                                        stackIn_117_0[stackIn_117_1] = stackIn_117_2;
                                        var21++;
                                        continue L18;
                                      }
                                    }
                                  } else {
                                    if (12 == var21) {
                                      var12 = var33[0];
                                      var13 = var33[1];
                                      var14 = var33[2];
                                      var52 = var50[0];
                                      var53 = var51[0];
                                      var54 = var51[1];
                                      var55 = var50[1];
                                      var56 = var51[2];
                                      var57 = var50[2];
                                      var21 = 0;
                                      L22: while (true) {
                                        if (var21 >= we.field_M) {
                                          break L0;
                                        } else {
                                          var9 = var56[var21];
                                          var5 = var55[var21];
                                          var7 = var53[var21];
                                          var6 = var57[var21];
                                          var4 = var52[var21];
                                          var8 = var54[var21];
                                          var12[var21] = var4 + (var7 + -(var4 * var7 >> -1978414069));
                                          var13[var21] = var8 + var5 - (var5 * var8 >> -414950773);
                                          var14[var21] = -(var6 * var9 >> -1181972693) + var6 - -var9;
                                          var21++;
                                          continue L22;
                                        }
                                      }
                                    } else {
                                      break L0;
                                    }
                                  }
                                } else {
                                  var12 = var33[0];
                                  var13 = var33[1];
                                  var14 = var33[2];
                                  var52 = var50[0];
                                  var53 = var51[0];
                                  var54 = var51[1];
                                  var55 = var50[1];
                                  var56 = var51[2];
                                  var57 = var50[2];
                                  var21 = 0;
                                  L23: while (true) {
                                    if (we.field_M <= var21) {
                                      break L0;
                                    } else {
                                      L24: {
                                        var4 = var52[var21];
                                        var7 = var53[var21];
                                        var6 = var57[var21];
                                        var8 = var54[var21];
                                        var5 = var55[var21];
                                        var9 = var56[var21];
                                        stackOut_96_0 = (int[]) (var12);
                                        stackOut_96_1 = var21;
                                        stackIn_98_0 = stackOut_96_0;
                                        stackIn_98_1 = stackOut_96_1;
                                        stackIn_97_0 = stackOut_96_0;
                                        stackIn_97_1 = stackOut_96_1;
                                        if (var4 > var7) {
                                          stackOut_98_0 = (int[]) ((Object) stackIn_98_0);
                                          stackOut_98_1 = stackIn_98_1;
                                          stackOut_98_2 = var4;
                                          stackIn_99_0 = stackOut_98_0;
                                          stackIn_99_1 = stackOut_98_1;
                                          stackIn_99_2 = stackOut_98_2;
                                          break L24;
                                        } else {
                                          stackOut_97_0 = (int[]) ((Object) stackIn_97_0);
                                          stackOut_97_1 = stackIn_97_1;
                                          stackOut_97_2 = var7;
                                          stackIn_99_0 = stackOut_97_0;
                                          stackIn_99_1 = stackOut_97_1;
                                          stackIn_99_2 = stackOut_97_2;
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        stackIn_99_0[stackIn_99_1] = stackIn_99_2;
                                        stackOut_99_0 = (int[]) (var13);
                                        stackOut_99_1 = var21;
                                        stackIn_101_0 = stackOut_99_0;
                                        stackIn_101_1 = stackOut_99_1;
                                        stackIn_100_0 = stackOut_99_0;
                                        stackIn_100_1 = stackOut_99_1;
                                        if (var5 <= var8) {
                                          stackOut_101_0 = (int[]) ((Object) stackIn_101_0);
                                          stackOut_101_1 = stackIn_101_1;
                                          stackOut_101_2 = var8;
                                          stackIn_102_0 = stackOut_101_0;
                                          stackIn_102_1 = stackOut_101_1;
                                          stackIn_102_2 = stackOut_101_2;
                                          break L25;
                                        } else {
                                          stackOut_100_0 = (int[]) ((Object) stackIn_100_0);
                                          stackOut_100_1 = stackIn_100_1;
                                          stackOut_100_2 = var5;
                                          stackIn_102_0 = stackOut_100_0;
                                          stackIn_102_1 = stackOut_100_1;
                                          stackIn_102_2 = stackOut_100_2;
                                          break L25;
                                        }
                                      }
                                      L26: {
                                        stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                                        stackOut_102_0 = (int[]) (var14);
                                        stackOut_102_1 = var21;
                                        stackIn_104_0 = stackOut_102_0;
                                        stackIn_104_1 = stackOut_102_1;
                                        stackIn_103_0 = stackOut_102_0;
                                        stackIn_103_1 = stackOut_102_1;
                                        if (var6 <= var9) {
                                          stackOut_104_0 = (int[]) ((Object) stackIn_104_0);
                                          stackOut_104_1 = stackIn_104_1;
                                          stackOut_104_2 = var9;
                                          stackIn_105_0 = stackOut_104_0;
                                          stackIn_105_1 = stackOut_104_1;
                                          stackIn_105_2 = stackOut_104_2;
                                          break L26;
                                        } else {
                                          stackOut_103_0 = (int[]) ((Object) stackIn_103_0);
                                          stackOut_103_1 = stackIn_103_1;
                                          stackOut_103_2 = var6;
                                          stackIn_105_0 = stackOut_103_0;
                                          stackIn_105_1 = stackOut_103_1;
                                          stackIn_105_2 = stackOut_103_2;
                                          break L26;
                                        }
                                      }
                                      stackIn_105_0[stackIn_105_1] = stackIn_105_2;
                                      var21++;
                                      continue L23;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var12 = var33[0];
                            var13 = var33[1];
                            var14 = var33[2];
                            var52 = var50[0];
                            var53 = var51[0];
                            var54 = var51[1];
                            var55 = var50[1];
                            var56 = var51[2];
                            var57 = var50[2];
                            var21 = 0;
                            L27: while (true) {
                              if (var21 >= we.field_M) {
                                break L0;
                              } else {
                                L28: {
                                  var4 = var52[var21];
                                  var5 = var55[var21];
                                  var6 = var57[var21];
                                  stackOut_60_0 = (int[]) (var12);
                                  stackOut_60_1 = var21;
                                  stackIn_62_0 = stackOut_60_0;
                                  stackIn_62_1 = stackOut_60_1;
                                  stackIn_61_0 = stackOut_60_0;
                                  stackIn_61_1 = stackOut_60_1;
                                  if (-4097 != (var4 ^ -1)) {
                                    stackOut_62_0 = (int[]) ((Object) stackIn_62_0);
                                    stackOut_62_1 = stackIn_62_1;
                                    stackOut_62_2 = (var53[var21] << -858348148) / (4096 - var4);
                                    stackIn_63_0 = stackOut_62_0;
                                    stackIn_63_1 = stackOut_62_1;
                                    stackIn_63_2 = stackOut_62_2;
                                    break L28;
                                  } else {
                                    stackOut_61_0 = (int[]) ((Object) stackIn_61_0);
                                    stackOut_61_1 = stackIn_61_1;
                                    stackOut_61_2 = 4096;
                                    stackIn_63_0 = stackOut_61_0;
                                    stackIn_63_1 = stackOut_61_1;
                                    stackIn_63_2 = stackOut_61_2;
                                    break L28;
                                  }
                                }
                                L29: {
                                  stackIn_63_0[stackIn_63_1] = stackIn_63_2;
                                  stackOut_63_0 = (int[]) (var13);
                                  stackOut_63_1 = var21;
                                  stackIn_65_0 = stackOut_63_0;
                                  stackIn_65_1 = stackOut_63_1;
                                  stackIn_64_0 = stackOut_63_0;
                                  stackIn_64_1 = stackOut_63_1;
                                  if (4096 != var5) {
                                    stackOut_65_0 = (int[]) ((Object) stackIn_65_0);
                                    stackOut_65_1 = stackIn_65_1;
                                    stackOut_65_2 = (var54[var21] << -882967828) / (4096 + -var5);
                                    stackIn_66_0 = stackOut_65_0;
                                    stackIn_66_1 = stackOut_65_1;
                                    stackIn_66_2 = stackOut_65_2;
                                    break L29;
                                  } else {
                                    stackOut_64_0 = (int[]) ((Object) stackIn_64_0);
                                    stackOut_64_1 = stackIn_64_1;
                                    stackOut_64_2 = 4096;
                                    stackIn_66_0 = stackOut_64_0;
                                    stackIn_66_1 = stackOut_64_1;
                                    stackIn_66_2 = stackOut_64_2;
                                    break L29;
                                  }
                                }
                                L30: {
                                  stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                  stackOut_66_0 = (int[]) (var14);
                                  stackOut_66_1 = var21;
                                  stackIn_68_0 = stackOut_66_0;
                                  stackIn_68_1 = stackOut_66_1;
                                  stackIn_67_0 = stackOut_66_0;
                                  stackIn_67_1 = stackOut_66_1;
                                  if (var6 != 4096) {
                                    stackOut_68_0 = (int[]) ((Object) stackIn_68_0);
                                    stackOut_68_1 = stackIn_68_1;
                                    stackOut_68_2 = (var56[var21] << 1725528012) / (-var6 + 4096);
                                    stackIn_69_0 = stackOut_68_0;
                                    stackIn_69_1 = stackOut_68_1;
                                    stackIn_69_2 = stackOut_68_2;
                                    break L30;
                                  } else {
                                    stackOut_67_0 = (int[]) ((Object) stackIn_67_0);
                                    stackOut_67_1 = stackIn_67_1;
                                    stackOut_67_2 = 4096;
                                    stackIn_69_0 = stackOut_67_0;
                                    stackIn_69_1 = stackOut_67_1;
                                    stackIn_69_2 = stackOut_67_2;
                                    break L30;
                                  }
                                }
                                stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                                var21++;
                                continue L27;
                              }
                            }
                          }
                        }
                      } else {
                        var12 = var33[0];
                        var13 = var33[1];
                        var14 = var33[2];
                        var52 = var50[0];
                        var53 = var51[0];
                        var54 = var51[1];
                        var55 = var50[1];
                        var56 = var51[2];
                        var57 = var50[2];
                        var21 = 0;
                        L31: while (true) {
                          if (we.field_M <= var21) {
                            break L0;
                          } else {
                            var12[var21] = -((-var53[var21] + 4096) * (-var52[var21] + 4096) >> -1376307668) + 4096;
                            var13[var21] = 4096 + -((-var54[var21] + 4096) * (-var55[var21] + 4096) >> 118700332);
                            var14[var21] = -((-var56[var21] + 4096) * (4096 + -var57[var21]) >> 885605484) + 4096;
                            var21++;
                            continue L31;
                          }
                        }
                      }
                    }
                  } else {
                    var12 = var33[0];
                    var13 = var33[1];
                    var14 = var33[2];
                    var52 = var50[0];
                    var53 = var51[0];
                    var54 = var51[1];
                    var55 = var50[1];
                    var56 = var51[2];
                    var57 = var50[2];
                    var21 = 0;
                    L32: while (true) {
                      if (var21 >= we.field_M) {
                        break L0;
                      } else {
                        var12[var21] = var52[var21] * var53[var21] >> 965616524;
                        var13[var21] = var55[var21] * var54[var21] >> -1191665876;
                        var14[var21] = var57[var21] * var56[var21] >> -2091183412;
                        var21++;
                        continue L32;
                      }
                    }
                  }
                } else {
                  var12 = var33[0];
                  var13 = var33[1];
                  var14 = var33[2];
                  var52 = var50[0];
                  var53 = var51[0];
                  var54 = var51[1];
                  var55 = var50[1];
                  var56 = var51[2];
                  var57 = var50[2];
                  var21 = 0;
                  L33: while (true) {
                    if (var21 >= we.field_M) {
                      break L0;
                    } else {
                      var12[var21] = -var53[var21] + var52[var21];
                      var13[var21] = var55[var21] + -var54[var21];
                      var14[var21] = var57[var21] + -var56[var21];
                      var21++;
                      continue L33;
                    }
                  }
                }
              }
            } else {
              break L0;
            }
          }
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    static {
        field_C = new nj();
    }
}
