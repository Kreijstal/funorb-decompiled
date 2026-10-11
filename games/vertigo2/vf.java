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
        int stackIn_36_2 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_45_2 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_57_2 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_69_2 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
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
        int[] var11Lifetime1;
        var9 = Vertigo2.field_L ? 1 : 0;
        var11 = this.field_x.a(param0, (byte) -99);
        var3 = var11;
        if (this.field_x.field_i) {
          var19 = this.a(0, -1, param0);
          var18 = this.a(1, -1, param0);
          var8 = this.field_z;
          if (var8 == 1) {
            var11Lifetime1 = var3;
            for (var8 = 0; we.field_M > var8; var8++) {
              var11Lifetime1[var8] = var18[var8] + var19[var8];
            }
          } else {
            if (var8 == 2) {
              for (var8 = 0; var8 < we.field_M; var8++) {
                var3[var8] = var19[var8] - var18[var8];
              }
            } else {
              if (3 == var8) {
                for (var8 = 0; we.field_M > var8; var8++) {
                  var3[var8] = var19[var8] * var18[var8] >> 12;
                }
              } else {
                if (var8 == 4) {
                  for (var8 = 0; we.field_M > var8; var8++) {
                    var5 = var18[var8];
                    stackIn_35_0 = var3;
                    stackIn_35_1 = var8;
                    if (var5 != 0) {
                      stackIn_36_2 = (var19[var8] << 12) / var5;
                    } else {
                      stackIn_36_2 = 4096;
                    }
                    stackIn_35_0[stackIn_35_1] = stackIn_36_2;
                  }
                } else {
                  if (var8 == 5) {
                    for (var8 = 0; var8 < we.field_M; var8++) {
                      var3[var8] = 4096 - ((4096 - var18[var8]) * (-var19[var8] + 4096) >> 12);
                    }
                  } else {
                    if (6 == var8) {
                      for (var8 = 0; var8 < we.field_M; var8++) {
                        var5 = var18[var8];
                        stackIn_44_0 = var3;
                        stackIn_44_1 = var8;
                        if (var5 < 2048) {
                          stackIn_45_2 = var5 * var19[var8] >> 11;
                        } else {
                          stackIn_45_2 = -((-var19[var8] + 4096) * (4096 - var5) >> 11) + 4096;
                        }
                        stackIn_44_0[stackIn_44_1] = stackIn_45_2;
                      }
                    } else {
                      if (var8 == 7) {
                        for (var8 = 0; we.field_M > var8; var8++) {
                          var4 = var19[var8];
                          stackIn_50_0 = var3;
                          stackIn_50_1 = var8;
                          if (4096 != var4) {
                            stackIn_51_2 = (var18[var8] << 12) / (4096 - var4);
                          } else {
                            stackIn_51_2 = 4096;
                          }
                          stackIn_50_0[stackIn_50_1] = stackIn_51_2;
                        }
                      } else {
                        if (8 == var8) {
                          for (var8 = 0; var8 < we.field_M; var8++) {
                            var4 = var19[var8];
                            stackIn_56_0 = var3;
                            stackIn_56_1 = var8;
                            if (var4 == 0) {
                              stackIn_57_2 = 0;
                            } else {
                              stackIn_57_2 = -((4096 - var18[var8] << 12) / var4) + 4096;
                            }
                            stackIn_56_0[stackIn_56_1] = stackIn_57_2;
                          }
                        } else {
                          if (var8 == 9) {
                            for (var8 = 0; we.field_M > var8; var8++) {
                              var5 = var18[var8];
                              var4 = var19[var8];
                              stackIn_62_0 = var3;
                              stackIn_62_1 = var8;
                              if (var4 >= var5) {
                                stackIn_63_2 = var5;
                              } else {
                                stackIn_63_2 = var4;
                              }
                              stackIn_62_0[stackIn_62_1] = stackIn_63_2;
                            }
                          } else {
                            if (var8 == 10) {
                              for (var8 = 0; var8 < we.field_M; var8++) {
                                var4 = var19[var8];
                                var5 = var18[var8];
                                stackIn_68_0 = var3;
                                stackIn_68_1 = var8;
                                if (var4 > var5) {
                                  stackIn_69_2 = var4;
                                } else {
                                  stackIn_69_2 = var5;
                                }
                                stackIn_68_0[stackIn_68_1] = stackIn_69_2;
                              }
                            } else {
                              if (var8 == 11) {
                                for (var8 = 0; var8 < we.field_M; var8++) {
                                  var4 = var19[var8];
                                  var5 = var18[var8];
                                  stackIn_74_0 = var3;
                                  stackIn_74_1 = var8;
                                  if (var4 > var5) {
                                    stackIn_75_2 = var4 - var5;
                                  } else {
                                    stackIn_75_2 = var5 - var4;
                                  }
                                  stackIn_74_0[stackIn_74_1] = stackIn_75_2;
                                }
                              } else {
                                if (var8 == 12) {
                                  for (var8 = 0; we.field_M > var8; var8++) {
                                    var5 = var18[var8];
                                    var4 = var19[var8];
                                    var3[var8] = -(var5 * var4 >> 11) + (var4 + var5);
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        if (param1 <= 91) {
          var10 = (ed) null;
          this.a((byte) -30, 29, (ed) null);
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
        boolean stackIn_10_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          if (param0 != 110) {
            return;
          }
          var4_int = param1;
          if (var4_int == 0) {
            this.field_z = param2.h(param0 ^ -101);
          } else {
            if (1 == var4_int) {
              stackIn_10_1 = (param2.h(param0 - 121) == 1);
              this.field_o = stackIn_10_1;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("vf.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
        int stackIn_36_2 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_41_0 = null;
        int stackIn_41_1 = 0;
        int stackIn_42_2 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_54_2 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_57_2 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_66_2 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_69_2 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_78_2 = 0;
        int[] stackIn_80_0 = null;
        int stackIn_80_1 = 0;
        int stackIn_81_2 = 0;
        int[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_87_2 = 0;
        int[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_90_2 = 0;
        int[] stackIn_92_0 = null;
        int stackIn_92_1 = 0;
        int stackIn_93_2 = 0;
        int[] stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_99_2 = 0;
        int[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_102_2 = 0;
        int[] stackIn_104_0 = null;
        int stackIn_104_1 = 0;
        int stackIn_105_2 = 0;
        int[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_111_2 = 0;
        int[] stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_114_2 = 0;
        int[] stackIn_116_0 = null;
        int stackIn_116_1 = 0;
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
        int[] var12Lifetime1;
        int[] var13Lifetime1;
        int[] var14Lifetime1;
        int[] var52Lifetime1;
        int[] var53Lifetime1;
        int[] var54Lifetime1;
        int[] var55Lifetime1;
        int[] var56Lifetime1;
        int[] var57Lifetime1;
        var22 = Vertigo2.field_L ? 1 : 0;
        if (param0 != -3780) {
          return (int[][]) null;
        }
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
            var12Lifetime1 = var33[0];
            var13Lifetime1 = var33[1];
            var14Lifetime1 = var33[2];
            var52Lifetime1 = var50[0];
            var53Lifetime1 = var51[0];
            var54Lifetime1 = var51[1];
            var55Lifetime1 = var50[1];
            var56Lifetime1 = var51[2];
            var57Lifetime1 = var50[2];
            for (var21 = 0; var21 < we.field_M; var21++) {
              var12Lifetime1[var21] = var52Lifetime1[var21] + var53Lifetime1[var21];
              var13Lifetime1[var21] = var54Lifetime1[var21] + var55Lifetime1[var21];
              var14Lifetime1[var21] = var56Lifetime1[var21] + var57Lifetime1[var21];
            }
          } else {
            if (2 == var21) {
              var12Lifetime1 = var33[0];
              var13Lifetime1 = var33[1];
              var14Lifetime1 = var33[2];
              var52Lifetime1 = var50[0];
              var53Lifetime1 = var51[0];
              var54Lifetime1 = var51[1];
              var55Lifetime1 = var50[1];
              var56Lifetime1 = var51[2];
              var57Lifetime1 = var50[2];
              for (var21 = 0; var21 < we.field_M; var21++) {
                var12Lifetime1[var21] = -var53Lifetime1[var21] + var52Lifetime1[var21];
                var13Lifetime1[var21] = var55Lifetime1[var21] - var54Lifetime1[var21];
                var14Lifetime1[var21] = var57Lifetime1[var21] - var56Lifetime1[var21];
              }
            } else {
              if (3 == var21) {
                var12Lifetime1 = var33[0];
                var13Lifetime1 = var33[1];
                var14Lifetime1 = var33[2];
                var52Lifetime1 = var50[0];
                var53Lifetime1 = var51[0];
                var54Lifetime1 = var51[1];
                var55Lifetime1 = var50[1];
                var56Lifetime1 = var51[2];
                var57Lifetime1 = var50[2];
                for (var21 = 0; var21 < we.field_M; var21++) {
                  var12Lifetime1[var21] = var52Lifetime1[var21] * var53Lifetime1[var21] >> 12;
                  var13Lifetime1[var21] = var55Lifetime1[var21] * var54Lifetime1[var21] >> 12;
                  var14Lifetime1[var21] = var57Lifetime1[var21] * var56Lifetime1[var21] >> 12;
                }
              } else {
                if (var21 == 4) {
                  var12Lifetime1 = var33[0];
                  var13Lifetime1 = var33[1];
                  var14Lifetime1 = var33[2];
                  var52Lifetime1 = var50[0];
                  var53Lifetime1 = var51[0];
                  var54Lifetime1 = var51[1];
                  var55Lifetime1 = var50[1];
                  var56Lifetime1 = var51[2];
                  var57Lifetime1 = var50[2];
                  for (var21 = 0; we.field_M > var21; var21++) {
                    var7 = var53Lifetime1[var21];
                    var8 = var54Lifetime1[var21];
                    var9 = var56Lifetime1[var21];
                    stackIn_35_0 = var12Lifetime1;
                    stackIn_35_1 = var21;
                    if (var7 == 0) {
                      stackIn_36_2 = 4096;
                    } else {
                      stackIn_36_2 = (var52Lifetime1[var21] << 12) / var7;
                    }
                    stackIn_35_0[stackIn_35_1] = stackIn_36_2;
                    stackIn_38_0 = var13Lifetime1;
                    stackIn_38_1 = var21;
                    if (var8 == 0) {
                      stackIn_39_2 = 4096;
                    } else {
                      stackIn_39_2 = (var55Lifetime1[var21] << 12) / var8;
                    }
                    stackIn_38_0[stackIn_38_1] = stackIn_39_2;
                    stackIn_41_0 = var14Lifetime1;
                    stackIn_41_1 = var21;
                    if (var9 != 0) {
                      stackIn_42_2 = (var57Lifetime1[var21] << 12) / var9;
                    } else {
                      stackIn_42_2 = 4096;
                    }
                    stackIn_41_0[stackIn_41_1] = stackIn_42_2;
                  }
                } else {
                  if (var21 == 5) {
                    var12Lifetime1 = var33[0];
                    var13Lifetime1 = var33[1];
                    var14Lifetime1 = var33[2];
                    var52Lifetime1 = var50[0];
                    var53Lifetime1 = var51[0];
                    var54Lifetime1 = var51[1];
                    var55Lifetime1 = var50[1];
                    var56Lifetime1 = var51[2];
                    var57Lifetime1 = var50[2];
                    for (var21 = 0; we.field_M > var21; var21++) {
                      var12Lifetime1[var21] = -((-var53Lifetime1[var21] + 4096) * (-var52Lifetime1[var21] + 4096) >> 12) + 4096;
                      var13Lifetime1[var21] = 4096 - ((-var54Lifetime1[var21] + 4096) * (-var55Lifetime1[var21] + 4096) >> 12);
                      var14Lifetime1[var21] = -((-var56Lifetime1[var21] + 4096) * (4096 - var57Lifetime1[var21]) >> 12) + 4096;
                    }
                  } else {
                    if (var21 == 6) {
                      var12Lifetime1 = var33[0];
                      var13Lifetime1 = var33[1];
                      var14Lifetime1 = var33[2];
                      var52Lifetime1 = var50[0];
                      var53Lifetime1 = var51[0];
                      var54Lifetime1 = var51[1];
                      var55Lifetime1 = var50[1];
                      var56Lifetime1 = var51[2];
                      var57Lifetime1 = var50[2];
                      for (var21 = 0; var21 < we.field_M; var21++) {
                        var9 = var56Lifetime1[var21];
                        var7 = var53Lifetime1[var21];
                        var8 = var54Lifetime1[var21];
                        stackIn_50_0 = var12Lifetime1;
                        stackIn_50_1 = var21;
                        if (var7 >= 2048) {
                          stackIn_51_2 = -((4096 - var52Lifetime1[var21]) * (-var7 + 4096) >> 11) + 4096;
                        } else {
                          stackIn_51_2 = var7 * var52Lifetime1[var21] >> 11;
                        }
                        stackIn_50_0[stackIn_50_1] = stackIn_51_2;
                        stackIn_53_0 = var13Lifetime1;
                        stackIn_53_1 = var21;
                        if (2048 <= var8) {
                          stackIn_54_2 = -((-var8 + 4096) * (-var55Lifetime1[var21] + 4096) >> 11) + 4096;
                        } else {
                          stackIn_54_2 = var55Lifetime1[var21] * var8 >> 11;
                        }
                        stackIn_53_0[stackIn_53_1] = stackIn_54_2;
                        stackIn_56_0 = var14Lifetime1;
                        stackIn_56_1 = var21;
                        if (var9 < 2048) {
                          stackIn_57_2 = var57Lifetime1[var21] * var9 >> 11;
                        } else {
                          stackIn_57_2 = -((-var57Lifetime1[var21] + 4096) * (-var9 + 4096) >> 11) + 4096;
                        }
                        stackIn_56_0[stackIn_56_1] = stackIn_57_2;
                      }
                    } else {
                      if (7 == var21) {
                        var12Lifetime1 = var33[0];
                        var13Lifetime1 = var33[1];
                        var14Lifetime1 = var33[2];
                        var52Lifetime1 = var50[0];
                        var53Lifetime1 = var51[0];
                        var54Lifetime1 = var51[1];
                        var55Lifetime1 = var50[1];
                        var56Lifetime1 = var51[2];
                        var57Lifetime1 = var50[2];
                        for (var21 = 0; var21 < we.field_M; var21++) {
                          var4 = var52Lifetime1[var21];
                          var5 = var55Lifetime1[var21];
                          var6 = var57Lifetime1[var21];
                          stackIn_62_0 = var12Lifetime1;
                          stackIn_62_1 = var21;
                          if (var4 != 4096) {
                            stackIn_63_2 = (var53Lifetime1[var21] << 12) / (4096 - var4);
                          } else {
                            stackIn_63_2 = 4096;
                          }
                          stackIn_62_0[stackIn_62_1] = stackIn_63_2;
                          stackIn_65_0 = var13Lifetime1;
                          stackIn_65_1 = var21;
                          if (4096 != var5) {
                            stackIn_66_2 = (var54Lifetime1[var21] << 12) / (4096 - var5);
                          } else {
                            stackIn_66_2 = 4096;
                          }
                          stackIn_65_0[stackIn_65_1] = stackIn_66_2;
                          stackIn_68_0 = var14Lifetime1;
                          stackIn_68_1 = var21;
                          if (var6 != 4096) {
                            stackIn_69_2 = (var56Lifetime1[var21] << 12) / (-var6 + 4096);
                          } else {
                            stackIn_69_2 = 4096;
                          }
                          stackIn_68_0[stackIn_68_1] = stackIn_69_2;
                        }
                      } else {
                        if (var21 == 8) {
                          var12Lifetime1 = var33[0];
                          var13Lifetime1 = var33[1];
                          var14Lifetime1 = var33[2];
                          var52Lifetime1 = var50[0];
                          var53Lifetime1 = var51[0];
                          var54Lifetime1 = var51[1];
                          var55Lifetime1 = var50[1];
                          var56Lifetime1 = var51[2];
                          var57Lifetime1 = var50[2];
                          for (var21 = 0; we.field_M > var21; var21++) {
                            var6 = var57Lifetime1[var21];
                            var5 = var55Lifetime1[var21];
                            var4 = var52Lifetime1[var21];
                            stackIn_74_0 = var12Lifetime1;
                            stackIn_74_1 = var21;
                            if (var4 == 0) {
                              stackIn_75_2 = 0;
                            } else {
                              stackIn_75_2 = 4096 - (-var53Lifetime1[var21] + 4096 << 12) / var4;
                            }
                            stackIn_74_0[stackIn_74_1] = stackIn_75_2;
                            stackIn_77_0 = var13Lifetime1;
                            stackIn_77_1 = var21;
                            if (0 == var5) {
                              stackIn_78_2 = 0;
                            } else {
                              stackIn_78_2 = 4096 - (-var54Lifetime1[var21] + 4096 << 12) / var5;
                            }
                            stackIn_77_0[stackIn_77_1] = stackIn_78_2;
                            stackIn_80_0 = var14Lifetime1;
                            stackIn_80_1 = var21;
                            if (0 != var6) {
                              stackIn_81_2 = -((4096 - var56Lifetime1[var21] << 12) / var6) + 4096;
                            } else {
                              stackIn_81_2 = 0;
                            }
                            stackIn_80_0[stackIn_80_1] = stackIn_81_2;
                          }
                        } else {
                          if (var21 == 9) {
                            var12Lifetime1 = var33[0];
                            var13Lifetime1 = var33[1];
                            var14Lifetime1 = var33[2];
                            var52Lifetime1 = var50[0];
                            var53Lifetime1 = var51[0];
                            var54Lifetime1 = var51[1];
                            var55Lifetime1 = var50[1];
                            var56Lifetime1 = var51[2];
                            var57Lifetime1 = var50[2];
                            for (var21 = 0; we.field_M > var21; var21++) {
                              var4 = var52Lifetime1[var21];
                              var5 = var55Lifetime1[var21];
                              var9 = var56Lifetime1[var21];
                              var8 = var54Lifetime1[var21];
                              var6 = var57Lifetime1[var21];
                              var7 = var53Lifetime1[var21];
                              stackIn_86_0 = var12Lifetime1;
                              stackIn_86_1 = var21;
                              if (var4 >= var7) {
                                stackIn_87_2 = var7;
                              } else {
                                stackIn_87_2 = var4;
                              }
                              stackIn_86_0[stackIn_86_1] = stackIn_87_2;
                              stackIn_89_0 = var13Lifetime1;
                              stackIn_89_1 = var21;
                              if (var5 >= var8) {
                                stackIn_90_2 = var8;
                              } else {
                                stackIn_90_2 = var5;
                              }
                              stackIn_89_0[stackIn_89_1] = stackIn_90_2;
                              stackIn_92_0 = var14Lifetime1;
                              stackIn_92_1 = var21;
                              if (var9 > var6) {
                                stackIn_93_2 = var6;
                              } else {
                                stackIn_93_2 = var9;
                              }
                              stackIn_92_0[stackIn_92_1] = stackIn_93_2;
                            }
                          } else {
                            if (10 == var21) {
                              var12Lifetime1 = var33[0];
                              var13Lifetime1 = var33[1];
                              var14Lifetime1 = var33[2];
                              var52Lifetime1 = var50[0];
                              var53Lifetime1 = var51[0];
                              var54Lifetime1 = var51[1];
                              var55Lifetime1 = var50[1];
                              var56Lifetime1 = var51[2];
                              var57Lifetime1 = var50[2];
                              for (var21 = 0; we.field_M > var21; var21++) {
                                var4 = var52Lifetime1[var21];
                                var7 = var53Lifetime1[var21];
                                var6 = var57Lifetime1[var21];
                                var8 = var54Lifetime1[var21];
                                var5 = var55Lifetime1[var21];
                                var9 = var56Lifetime1[var21];
                                stackIn_98_0 = var12Lifetime1;
                                stackIn_98_1 = var21;
                                if (var4 > var7) {
                                  stackIn_99_2 = var4;
                                } else {
                                  stackIn_99_2 = var7;
                                }
                                stackIn_98_0[stackIn_98_1] = stackIn_99_2;
                                stackIn_101_0 = var13Lifetime1;
                                stackIn_101_1 = var21;
                                if (var5 <= var8) {
                                  stackIn_102_2 = var8;
                                } else {
                                  stackIn_102_2 = var5;
                                }
                                stackIn_101_0[stackIn_101_1] = stackIn_102_2;
                                stackIn_104_0 = var14Lifetime1;
                                stackIn_104_1 = var21;
                                if (var6 <= var9) {
                                  stackIn_105_2 = var9;
                                } else {
                                  stackIn_105_2 = var6;
                                }
                                stackIn_104_0[stackIn_104_1] = stackIn_105_2;
                              }
                            } else {
                              if (var21 == 11) {
                                var12Lifetime1 = var33[0];
                                var13Lifetime1 = var33[1];
                                var14Lifetime1 = var33[2];
                                var52Lifetime1 = var50[0];
                                var53Lifetime1 = var51[0];
                                var54Lifetime1 = var51[1];
                                var55Lifetime1 = var50[1];
                                var56Lifetime1 = var51[2];
                                var57Lifetime1 = var50[2];
                                for (var21 = 0; we.field_M > var21; var21++) {
                                  var7 = var53Lifetime1[var21];
                                  var6 = var57Lifetime1[var21];
                                  var4 = var52Lifetime1[var21];
                                  var8 = var54Lifetime1[var21];
                                  var9 = var56Lifetime1[var21];
                                  var5 = var55Lifetime1[var21];
                                  stackIn_110_0 = var12Lifetime1;
                                  stackIn_110_1 = var21;
                                  if (var4 <= var7) {
                                    stackIn_111_2 = var7 - var4;
                                  } else {
                                    stackIn_111_2 = -var7 + var4;
                                  }
                                  stackIn_110_0[stackIn_110_1] = stackIn_111_2;
                                  stackIn_113_0 = var13Lifetime1;
                                  stackIn_113_1 = var21;
                                  if (var8 >= var5) {
                                    stackIn_114_2 = -var5 + var8;
                                  } else {
                                    stackIn_114_2 = var5 - var8;
                                  }
                                  stackIn_113_0[stackIn_113_1] = stackIn_114_2;
                                  stackIn_116_0 = var14Lifetime1;
                                  stackIn_116_1 = var21;
                                  if (var9 < var6) {
                                    stackIn_117_2 = -var9 + var6;
                                  } else {
                                    stackIn_117_2 = var9 - var6;
                                  }
                                  stackIn_116_0[stackIn_116_1] = stackIn_117_2;
                                }
                              } else {
                                if (12 == var21) {
                                  var12Lifetime1 = var33[0];
                                  var13Lifetime1 = var33[1];
                                  var14Lifetime1 = var33[2];
                                  var52Lifetime1 = var50[0];
                                  var53Lifetime1 = var51[0];
                                  var54Lifetime1 = var51[1];
                                  var55Lifetime1 = var50[1];
                                  var56Lifetime1 = var51[2];
                                  var57Lifetime1 = var50[2];
                                  for (var21 = 0; var21 < we.field_M; var21++) {
                                    var9 = var56Lifetime1[var21];
                                    var5 = var55Lifetime1[var21];
                                    var7 = var53Lifetime1[var21];
                                    var6 = var57Lifetime1[var21];
                                    var4 = var52Lifetime1[var21];
                                    var8 = var54Lifetime1[var21];
                                    var12Lifetime1[var21] = var4 + (var7 - (var4 * var7 >> 11));
                                    var13Lifetime1[var21] = var8 + var5 - (var5 * var8 >> 11);
                                    var14Lifetime1[var21] = -(var6 * var9 >> 11) + var6 + var9;
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                }
              }
            }
          }
        }
        return var3;
    }

    static {
        field_C = new nj();
    }
}
