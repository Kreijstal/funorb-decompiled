/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vf extends ji {
    static int[] field_y;
    static cr field_B;
    private int field_z;
    static nj field_C;

    final int[] c(int param0, int param1) {
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int[] stackIn_45_0 = null;
        int stackIn_45_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var8;
        int var9;
        ed var10;
        int[] var11;
        int[] var18;
        int[] var19;
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
                              stackIn_44_0 = (int[]) (var3);

                              stackIn_44_1 = var8;

                              if (var5 < 2048) {
                                stackIn_45_0 = (int[]) ((Object) stackIn_44_0);
                                stackIn_45_1 = stackIn_44_1;
                                stackIn_45_2 = var5 * var19[var8] >> 971507211;
                                break L4;
                              } else {
                                stackIn_45_0 = (int[]) ((Object) stackIn_44_0);
                                stackIn_45_1 = stackIn_44_1;
                                stackIn_45_2 = -((-var19[var8] + 4096) * (4096 + -var5) >> -1004381653) + 4096;
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
                                    stackIn_62_0 = (int[]) (var3);

                                    stackIn_62_1 = var8;

                                    if (var4 >= var5) {
                                      stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                      stackIn_63_1 = stackIn_62_1;
                                      stackIn_63_2 = var5;
                                      break L6;
                                    } else {
                                      stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                      stackIn_63_1 = stackIn_62_1;
                                      stackIn_63_2 = var4;
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
                                        stackIn_74_0 = (int[]) (var3);

                                        stackIn_74_1 = var8;

                                        if (var4 > var5) {
                                          stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                          stackIn_75_1 = stackIn_74_1;
                                          stackIn_75_2 = var4 + -var5;
                                          break L9;
                                        } else {
                                          stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                          stackIn_75_1 = stackIn_74_1;
                                          stackIn_75_2 = var5 + -var4;
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
                                      stackIn_68_0 = (int[]) (var3);

                                      stackIn_68_1 = var8;

                                      if (var4 > var5) {
                                        stackIn_69_0 = (int[]) ((Object) stackIn_68_0);
                                        stackIn_69_1 = stackIn_68_1;
                                        stackIn_69_2 = var4;
                                        break L11;
                                      } else {
                                        stackIn_69_0 = (int[]) ((Object) stackIn_68_0);
                                        stackIn_69_1 = stackIn_68_1;
                                        stackIn_69_2 = var5;
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
                                  stackIn_56_0 = (int[]) (var3);

                                  stackIn_56_1 = var8;

                                  if (-1 == (var4 ^ -1)) {
                                    stackIn_57_0 = (int[]) ((Object) stackIn_56_0);
                                    stackIn_57_1 = stackIn_56_1;
                                    stackIn_57_2 = 0;
                                    break L13;
                                  } else {
                                    stackIn_57_0 = (int[]) ((Object) stackIn_56_0);
                                    stackIn_57_1 = stackIn_56_1;
                                    stackIn_57_2 = -((4096 - var18[var8] << -1071351060) / var4) + 4096;
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
                                stackIn_50_0 = (int[]) (var3);

                                stackIn_50_1 = var8;

                                if (4096 != var4) {
                                  stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                  stackIn_51_1 = stackIn_50_1;
                                  stackIn_51_2 = (var18[var8] << -1295577140) / (4096 - var4);
                                  break L15;
                                } else {
                                  stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                  stackIn_51_1 = stackIn_50_1;
                                  stackIn_51_2 = 4096;
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
                          stackIn_35_0 = (int[]) (var3);

                          stackIn_35_1 = var8;

                          if (-1 != (var5 ^ -1)) {
                            stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                            stackIn_36_1 = stackIn_35_1;
                            stackIn_36_2 = (var19[var8] << 760137356) / var5;
                            break L17;
                          } else {
                            stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                            stackIn_36_1 = stackIn_35_1;
                            stackIn_36_2 = 4096;
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
        int var5 = 0;
        Object stackIn_9_0 = null;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
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
                      stackIn_9_0 = this;

                      if (param2.h(param0 + -121) != 1) {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 0;
                        break L2;
                      } else {
                        stackIn_10_0 = this;
                        stackIn_10_1 = 1;
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
            stackIn_14_0 = (RuntimeException) (var4);

            stackIn_14_1 = new StringBuilder().append("vf.C(").append(param0).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
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
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int[] stackIn_36_0 = null;
        int stackIn_36_1 = 0;
        int stackIn_36_2 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int[] stackIn_39_0 = null;
        int stackIn_39_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int[] stackIn_51_0 = null;
        int stackIn_51_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int stackIn_54_2 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int[] stackIn_57_0 = null;
        int stackIn_57_1 = 0;
        int stackIn_57_2 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int[] stackIn_63_0 = null;
        int stackIn_63_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int stackIn_66_2 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int[] stackIn_69_0 = null;
        int stackIn_69_1 = 0;
        int stackIn_69_2 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int[] stackIn_75_0 = null;
        int stackIn_75_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int[] stackIn_78_0 = null;
        int stackIn_78_1 = 0;
        int stackIn_78_2 = 0;
        int[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int[] stackIn_81_0 = null;
        int stackIn_81_1 = 0;
        int stackIn_81_2 = 0;
        int[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int[] stackIn_87_0 = null;
        int stackIn_87_1 = 0;
        int stackIn_87_2 = 0;
        int[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int[] stackIn_90_0 = null;
        int stackIn_90_1 = 0;
        int stackIn_90_2 = 0;
        int[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int[] stackIn_93_0 = null;
        int stackIn_93_1 = 0;
        int stackIn_93_2 = 0;
        int[] stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int[] stackIn_99_0 = null;
        int stackIn_99_1 = 0;
        int stackIn_99_2 = 0;
        int[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int[] stackIn_102_0 = null;
        int stackIn_102_1 = 0;
        int stackIn_102_2 = 0;
        int[] stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int[] stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        int stackIn_105_2 = 0;
        int[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int[] stackIn_111_0 = null;
        int stackIn_111_1 = 0;
        int stackIn_111_2 = 0;
        int[] stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int[] stackIn_114_0 = null;
        int stackIn_114_1 = 0;
        int stackIn_114_2 = 0;
        int[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
        int[] stackIn_117_0 = null;
        int stackIn_117_1 = 0;
        int stackIn_117_2 = 0;
        int[][] var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int[] var12;
        int[] var13;
        int[] var14;
        int var21;
        int var22;
        int[][] var23;
        int[][] var24;
        int[][] var33;
        int[][] var50;
        int[][] var51;
        int[] var52;
        int[] var53;
        int[] var54;
        int[] var55;
        int[] var56;
        int[] var57;
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
                            stackIn_35_0 = (int[]) (var12);

                            stackIn_35_1 = var21;

                            if (var7 == 0) {
                              stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                              stackIn_36_1 = stackIn_35_1;
                              stackIn_36_2 = 4096;
                              break L3;
                            } else {
                              stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                              stackIn_36_1 = stackIn_35_1;
                              stackIn_36_2 = (var52[var21] << 1556283436) / var7;
                              break L3;
                            }
                          }
                          L4: {
                            stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                            stackIn_38_0 = (int[]) (var13);

                            stackIn_38_1 = var21;

                            if (var8 == 0) {
                              stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                              stackIn_39_1 = stackIn_38_1;
                              stackIn_39_2 = 4096;
                              break L4;
                            } else {
                              stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                              stackIn_39_1 = stackIn_38_1;
                              stackIn_39_2 = (var55[var21] << 1627315852) / var8;
                              break L4;
                            }
                          }
                          L5: {
                            stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                            stackIn_41_0 = (int[]) (var14);

                            stackIn_41_1 = var21;

                            if (-1 != (var9 ^ -1)) {
                              stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                              stackIn_42_1 = stackIn_41_1;
                              stackIn_42_2 = (var57[var21] << 462182988) / var9;
                              break L5;
                            } else {
                              stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                              stackIn_42_1 = stackIn_41_1;
                              stackIn_42_2 = 4096;
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
                                stackIn_50_0 = (int[]) (var12);

                                stackIn_50_1 = var21;

                                if (var7 >= 2048) {
                                  stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                  stackIn_51_1 = stackIn_50_1;
                                  stackIn_51_2 = -((4096 - var52[var21]) * (-var7 + 4096) >> -678950869) + 4096;
                                  break L7;
                                } else {
                                  stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                  stackIn_51_1 = stackIn_50_1;
                                  stackIn_51_2 = var7 * var52[var21] >> 1370638475;
                                  break L7;
                                }
                              }
                              L8: {
                                stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                                stackIn_53_0 = (int[]) (var13);

                                stackIn_53_1 = var21;

                                if (2048 <= var8) {
                                  stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                  stackIn_54_1 = stackIn_53_1;
                                  stackIn_54_2 = -((-var8 + 4096) * (-var55[var21] + 4096) >> -263616693) + 4096;
                                  break L8;
                                } else {
                                  stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                  stackIn_54_1 = stackIn_53_1;
                                  stackIn_54_2 = var55[var21] * var8 >> 814225547;
                                  break L8;
                                }
                              }
                              L9: {
                                stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                                stackIn_56_0 = (int[]) (var14);

                                stackIn_56_1 = var21;

                                if (-2049 < (var9 ^ -1)) {
                                  stackIn_57_0 = (int[]) ((Object) stackIn_56_0);
                                  stackIn_57_1 = stackIn_56_1;
                                  stackIn_57_2 = var57[var21] * var9 >> -95235989;
                                  break L9;
                                } else {
                                  stackIn_57_0 = (int[]) ((Object) stackIn_56_0);
                                  stackIn_57_1 = stackIn_56_1;
                                  stackIn_57_2 = -((-var57[var21] + 4096) * (-var9 + 4096) >> -1032851829) + 4096;
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
                                    stackIn_74_0 = (int[]) (var12);

                                    stackIn_74_1 = var21;

                                    if (var4 == 0) {
                                      stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                      stackIn_75_1 = stackIn_74_1;
                                      stackIn_75_2 = 0;
                                      break L11;
                                    } else {
                                      stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                      stackIn_75_1 = stackIn_74_1;
                                      stackIn_75_2 = 4096 - (-var53[var21] + 4096 << 204029580) / var4;
                                      break L11;
                                    }
                                  }
                                  L12: {
                                    stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                    stackIn_77_0 = (int[]) (var13);

                                    stackIn_77_1 = var21;

                                    if (0 == var5) {
                                      stackIn_78_0 = (int[]) ((Object) stackIn_77_0);
                                      stackIn_78_1 = stackIn_77_1;
                                      stackIn_78_2 = 0;
                                      break L12;
                                    } else {
                                      stackIn_78_0 = (int[]) ((Object) stackIn_77_0);
                                      stackIn_78_1 = stackIn_77_1;
                                      stackIn_78_2 = 4096 - (-var54[var21] + 4096 << 140766508) / var5;
                                      break L12;
                                    }
                                  }
                                  L13: {
                                    stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                                    stackIn_80_0 = (int[]) (var14);

                                    stackIn_80_1 = var21;

                                    if (0 != var6) {
                                      stackIn_81_0 = (int[]) ((Object) stackIn_80_0);
                                      stackIn_81_1 = stackIn_80_1;
                                      stackIn_81_2 = -((4096 + -var56[var21] << -1482587732) / var6) + 4096;
                                      break L13;
                                    } else {
                                      stackIn_81_0 = (int[]) ((Object) stackIn_80_0);
                                      stackIn_81_1 = stackIn_80_1;
                                      stackIn_81_2 = 0;
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
                                      stackIn_86_0 = (int[]) (var12);

                                      stackIn_86_1 = var21;

                                      if (var4 >= var7) {
                                        stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                                        stackIn_87_1 = stackIn_86_1;
                                        stackIn_87_2 = var7;
                                        break L15;
                                      } else {
                                        stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                                        stackIn_87_1 = stackIn_86_1;
                                        stackIn_87_2 = var4;
                                        break L15;
                                      }
                                    }
                                    L16: {
                                      stackIn_87_0[stackIn_87_1] = stackIn_87_2;
                                      stackIn_89_0 = (int[]) (var13);

                                      stackIn_89_1 = var21;

                                      if (var5 >= var8) {
                                        stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                                        stackIn_90_1 = stackIn_89_1;
                                        stackIn_90_2 = var8;
                                        break L16;
                                      } else {
                                        stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                                        stackIn_90_1 = stackIn_89_1;
                                        stackIn_90_2 = var5;
                                        break L16;
                                      }
                                    }
                                    L17: {
                                      stackIn_90_0[stackIn_90_1] = stackIn_90_2;
                                      stackIn_92_0 = (int[]) (var14);

                                      stackIn_92_1 = var21;

                                      if (var9 > var6) {
                                        stackIn_93_0 = (int[]) ((Object) stackIn_92_0);
                                        stackIn_93_1 = stackIn_92_1;
                                        stackIn_93_2 = var6;
                                        break L17;
                                      } else {
                                        stackIn_93_0 = (int[]) ((Object) stackIn_92_0);
                                        stackIn_93_1 = stackIn_92_1;
                                        stackIn_93_2 = var9;
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
                                          stackIn_110_0 = (int[]) (var12);

                                          stackIn_110_1 = var21;

                                          if (var4 <= var7) {
                                            stackIn_111_0 = (int[]) ((Object) stackIn_110_0);
                                            stackIn_111_1 = stackIn_110_1;
                                            stackIn_111_2 = var7 + -var4;
                                            break L19;
                                          } else {
                                            stackIn_111_0 = (int[]) ((Object) stackIn_110_0);
                                            stackIn_111_1 = stackIn_110_1;
                                            stackIn_111_2 = -var7 + var4;
                                            break L19;
                                          }
                                        }
                                        L20: {
                                          stackIn_111_0[stackIn_111_1] = stackIn_111_2;
                                          stackIn_113_0 = (int[]) (var13);

                                          stackIn_113_1 = var21;

                                          if (var8 >= var5) {
                                            stackIn_114_0 = (int[]) ((Object) stackIn_113_0);
                                            stackIn_114_1 = stackIn_113_1;
                                            stackIn_114_2 = -var5 + var8;
                                            break L20;
                                          } else {
                                            stackIn_114_0 = (int[]) ((Object) stackIn_113_0);
                                            stackIn_114_1 = stackIn_113_1;
                                            stackIn_114_2 = var5 + -var8;
                                            break L20;
                                          }
                                        }
                                        L21: {
                                          stackIn_114_0[stackIn_114_1] = stackIn_114_2;
                                          stackIn_116_0 = (int[]) (var14);

                                          stackIn_116_1 = var21;

                                          if (var9 < var6) {
                                            stackIn_117_0 = (int[]) ((Object) stackIn_116_0);
                                            stackIn_117_1 = stackIn_116_1;
                                            stackIn_117_2 = -var9 + var6;
                                            break L21;
                                          } else {
                                            stackIn_117_0 = (int[]) ((Object) stackIn_116_0);
                                            stackIn_117_1 = stackIn_116_1;
                                            stackIn_117_2 = var9 - var6;
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
                                        stackIn_98_0 = (int[]) (var12);

                                        stackIn_98_1 = var21;

                                        if (var4 > var7) {
                                          stackIn_99_0 = (int[]) ((Object) stackIn_98_0);
                                          stackIn_99_1 = stackIn_98_1;
                                          stackIn_99_2 = var4;
                                          break L24;
                                        } else {
                                          stackIn_99_0 = (int[]) ((Object) stackIn_98_0);
                                          stackIn_99_1 = stackIn_98_1;
                                          stackIn_99_2 = var7;
                                          break L24;
                                        }
                                      }
                                      L25: {
                                        stackIn_99_0[stackIn_99_1] = stackIn_99_2;
                                        stackIn_101_0 = (int[]) (var13);

                                        stackIn_101_1 = var21;

                                        if (var5 <= var8) {
                                          stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                                          stackIn_102_1 = stackIn_101_1;
                                          stackIn_102_2 = var8;
                                          break L25;
                                        } else {
                                          stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                                          stackIn_102_1 = stackIn_101_1;
                                          stackIn_102_2 = var5;
                                          break L25;
                                        }
                                      }
                                      L26: {
                                        stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                                        stackIn_104_0 = (int[]) (var14);

                                        stackIn_104_1 = var21;

                                        if (var6 <= var9) {
                                          stackIn_105_0 = (int[]) ((Object) stackIn_104_0);
                                          stackIn_105_1 = stackIn_104_1;
                                          stackIn_105_2 = var9;
                                          break L26;
                                        } else {
                                          stackIn_105_0 = (int[]) ((Object) stackIn_104_0);
                                          stackIn_105_1 = stackIn_104_1;
                                          stackIn_105_2 = var6;
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
                                  stackIn_62_0 = (int[]) (var12);

                                  stackIn_62_1 = var21;

                                  if (-4097 != (var4 ^ -1)) {
                                    stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                    stackIn_63_1 = stackIn_62_1;
                                    stackIn_63_2 = (var53[var21] << -858348148) / (4096 - var4);
                                    break L28;
                                  } else {
                                    stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                    stackIn_63_1 = stackIn_62_1;
                                    stackIn_63_2 = 4096;
                                    break L28;
                                  }
                                }
                                L29: {
                                  stackIn_63_0[stackIn_63_1] = stackIn_63_2;
                                  stackIn_65_0 = (int[]) (var13);

                                  stackIn_65_1 = var21;

                                  if (4096 != var5) {
                                    stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                                    stackIn_66_1 = stackIn_65_1;
                                    stackIn_66_2 = (var54[var21] << -882967828) / (4096 + -var5);
                                    break L29;
                                  } else {
                                    stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                                    stackIn_66_1 = stackIn_65_1;
                                    stackIn_66_2 = 4096;
                                    break L29;
                                  }
                                }
                                L30: {
                                  stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                  stackIn_68_0 = (int[]) (var14);

                                  stackIn_68_1 = var21;

                                  if (var6 != 4096) {
                                    stackIn_69_0 = (int[]) ((Object) stackIn_68_0);
                                    stackIn_69_1 = stackIn_68_1;
                                    stackIn_69_2 = (var56[var21] << 1725528012) / (-var6 + 4096);
                                    break L30;
                                  } else {
                                    stackIn_69_0 = (int[]) ((Object) stackIn_68_0);
                                    stackIn_69_1 = stackIn_68_1;
                                    stackIn_69_2 = 4096;
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
