/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ska extends k {
    private int field_l;
    static kv field_k;

    public static void e(byte param0) {
        if (param0 < 1) {
          return;
        }
        field_k = null;
    }

    final void a(byte param0, lu param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_9_1 = false;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          var4_int = param2;
          if (var4_int != 0) {
            if (var4_int == 1) {
              stackIn_9_1 = (param1.b(param0 ^ -16711866) == 1);
              this.field_f = stackIn_9_1;
            }
          } else {
            this.field_l = param1.b(16711935);
          }
          if (param0 != -71) {
            this.a(-58, -67);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_15_0 = var4;
          stackIn_15_1 = new StringBuilder().append("ska.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int stackIn_33_2 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_36_2 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_39_2 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_48_2 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_51_2 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_54_2 = 0;
        int[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_60_2 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_63_2 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_66_2 = 0;
        int[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_72_2 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_75_2 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
        int stackIn_78_2 = 0;
        int[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int stackIn_84_2 = 0;
        int[] stackIn_86_0 = null;
        int stackIn_86_1 = 0;
        int stackIn_87_2 = 0;
        int[] stackIn_89_0 = null;
        int stackIn_89_1 = 0;
        int stackIn_90_2 = 0;
        int[] stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int stackIn_96_2 = 0;
        int[] stackIn_98_0 = null;
        int stackIn_98_1 = 0;
        int stackIn_99_2 = 0;
        int[] stackIn_101_0 = null;
        int stackIn_101_1 = 0;
        int stackIn_102_2 = 0;
        int[] stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_108_2 = 0;
        int[] stackIn_110_0 = null;
        int stackIn_110_1 = 0;
        int stackIn_111_2 = 0;
        int[] stackIn_113_0 = null;
        int stackIn_113_1 = 0;
        int stackIn_114_2 = 0;
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
        var22 = BachelorFridge.field_y;
        if (param0) {
          return (int[][]) null;
        }
        var33 = this.field_h.a(param1, -858);
        var24 = var33;
        var23 = var24;
        var3 = var23;
        if (this.field_h.field_b) {
          var50 = this.a((byte) -94, 0, param1);
          var51 = this.a((byte) -126, 1, param1);
          var12 = var33[0];
          var13 = var33[1];
          var14 = var33[2];
          var53 = var50[0];
          var54 = var50[1];
          var56 = var50[2];
          var52 = var51[0];
          var55 = var51[1];
          var57 = var51[2];
          var21 = this.field_l;
          if (var21 == 1) {
            var12Lifetime1 = var33[0];
            var13Lifetime1 = var33[1];
            var14Lifetime1 = var33[2];
            var52Lifetime1 = var51[0];
            var53Lifetime1 = var50[0];
            var54Lifetime1 = var50[1];
            var55Lifetime1 = var51[1];
            var56Lifetime1 = var50[2];
            var57Lifetime1 = var51[2];
            for (var21 = 0; var21 < hh.field_d; var21++) {
              var12Lifetime1[var21] = var52Lifetime1[var21] + var53Lifetime1[var21];
              var13Lifetime1[var21] = var54Lifetime1[var21] + var55Lifetime1[var21];
              var14Lifetime1[var21] = var56Lifetime1[var21] + var57Lifetime1[var21];
            }
          } else {
            if (var21 == 2) {
              var12Lifetime1 = var33[0];
              var13Lifetime1 = var33[1];
              var14Lifetime1 = var33[2];
              var52Lifetime1 = var51[0];
              var53Lifetime1 = var50[0];
              var54Lifetime1 = var50[1];
              var55Lifetime1 = var51[1];
              var56Lifetime1 = var50[2];
              var57Lifetime1 = var51[2];
              for (var21 = 0; var21 < hh.field_d; var21++) {
                var12Lifetime1[var21] = -var52Lifetime1[var21] + var53Lifetime1[var21];
                var13Lifetime1[var21] = -var55Lifetime1[var21] + var54Lifetime1[var21];
                var14Lifetime1[var21] = -var57Lifetime1[var21] + var56Lifetime1[var21];
              }
            } else {
              if (var21 == 3) {
                var12Lifetime1 = var33[0];
                var13Lifetime1 = var33[1];
                var14Lifetime1 = var33[2];
                var52Lifetime1 = var51[0];
                var53Lifetime1 = var50[0];
                var54Lifetime1 = var50[1];
                var55Lifetime1 = var51[1];
                var56Lifetime1 = var50[2];
                var57Lifetime1 = var51[2];
                for (var21 = 0; hh.field_d > var21; var21++) {
                  var12Lifetime1[var21] = var53Lifetime1[var21] * var52Lifetime1[var21] >> 12;
                  var13Lifetime1[var21] = var54Lifetime1[var21] * var55Lifetime1[var21] >> 12;
                  var14Lifetime1[var21] = var56Lifetime1[var21] * var57Lifetime1[var21] >> 12;
                }
              } else {
                if (var21 == 4) {
                  var12Lifetime1 = var33[0];
                  var13Lifetime1 = var33[1];
                  var14Lifetime1 = var33[2];
                  var52Lifetime1 = var51[0];
                  var53Lifetime1 = var50[0];
                  var54Lifetime1 = var50[1];
                  var55Lifetime1 = var51[1];
                  var56Lifetime1 = var50[2];
                  var57Lifetime1 = var51[2];
                  for (var21 = 0; hh.field_d > var21; var21++) {
                    var7 = var52Lifetime1[var21];
                    var9 = var57Lifetime1[var21];
                    var8 = var55Lifetime1[var21];
                    stackIn_32_0 = var12Lifetime1;
                    stackIn_32_1 = var21;
                    if (var7 == 0) {
                      stackIn_33_2 = 4096;
                    } else {
                      stackIn_33_2 = (var53Lifetime1[var21] << 12) / var7;
                    }
                    stackIn_32_0[stackIn_32_1] = stackIn_33_2;
                    stackIn_35_0 = var13Lifetime1;
                    stackIn_35_1 = var21;
                    if (0 != var8) {
                      stackIn_36_2 = (var54Lifetime1[var21] << 12) / var8;
                    } else {
                      stackIn_36_2 = 4096;
                    }
                    stackIn_35_0[stackIn_35_1] = stackIn_36_2;
                    stackIn_38_0 = var14Lifetime1;
                    stackIn_38_1 = var21;
                    if (var9 != 0) {
                      stackIn_39_2 = (var56Lifetime1[var21] << 12) / var9;
                    } else {
                      stackIn_39_2 = 4096;
                    }
                    stackIn_38_0[stackIn_38_1] = stackIn_39_2;
                  }
                } else {
                  if (var21 == 5) {
                    var12Lifetime1 = var33[0];
                    var13Lifetime1 = var33[1];
                    var14Lifetime1 = var33[2];
                    var52Lifetime1 = var51[0];
                    var53Lifetime1 = var50[0];
                    var54Lifetime1 = var50[1];
                    var55Lifetime1 = var51[1];
                    var56Lifetime1 = var50[2];
                    var57Lifetime1 = var51[2];
                    for (var21 = 0; hh.field_d > var21; var21++) {
                      var12Lifetime1[var21] = 4096 - ((4096 - var53Lifetime1[var21]) * (-var52Lifetime1[var21] + 4096) >> 12);
                      var13Lifetime1[var21] = 4096 - ((-var55Lifetime1[var21] + 4096) * (4096 - var54Lifetime1[var21]) >> 12);
                      var14Lifetime1[var21] = 4096 - ((-var57Lifetime1[var21] + 4096) * (-var56Lifetime1[var21] + 4096) >> 12);
                    }
                  } else {
                    if (6 == var21) {
                      var12Lifetime1 = var33[0];
                      var13Lifetime1 = var33[1];
                      var14Lifetime1 = var33[2];
                      var52Lifetime1 = var51[0];
                      var53Lifetime1 = var50[0];
                      var54Lifetime1 = var50[1];
                      var55Lifetime1 = var51[1];
                      var56Lifetime1 = var50[2];
                      var57Lifetime1 = var51[2];
                      for (var21 = 0; hh.field_d > var21; var21++) {
                        var9 = var57Lifetime1[var21];
                        var8 = var55Lifetime1[var21];
                        var7 = var52Lifetime1[var21];
                        stackIn_47_0 = var12Lifetime1;
                        stackIn_47_1 = var21;
                        if (var7 >= 2048) {
                          stackIn_48_2 = 4096 - ((4096 - var7) * (4096 - var53Lifetime1[var21]) >> 11);
                        } else {
                          stackIn_48_2 = var7 * var53Lifetime1[var21] >> 11;
                        }
                        stackIn_47_0[stackIn_47_1] = stackIn_48_2;
                        stackIn_50_0 = var13Lifetime1;
                        stackIn_50_1 = var21;
                        if (var8 < 2048) {
                          stackIn_51_2 = var8 * var54Lifetime1[var21] >> 11;
                        } else {
                          stackIn_51_2 = 4096 - ((4096 - var54Lifetime1[var21]) * (4096 - var8) >> 11);
                        }
                        stackIn_50_0[stackIn_50_1] = stackIn_51_2;
                        stackIn_53_0 = var14Lifetime1;
                        stackIn_53_1 = var21;
                        if (var9 >= 2048) {
                          stackIn_54_2 = 4096 - ((4096 - var56Lifetime1[var21]) * (4096 - var9) >> 11);
                        } else {
                          stackIn_54_2 = var9 * var56Lifetime1[var21] >> 11;
                        }
                        stackIn_53_0[stackIn_53_1] = stackIn_54_2;
                      }
                    } else {
                      if (var21 == 7) {
                        var12Lifetime1 = var33[0];
                        var13Lifetime1 = var33[1];
                        var14Lifetime1 = var33[2];
                        var52Lifetime1 = var51[0];
                        var53Lifetime1 = var50[0];
                        var54Lifetime1 = var50[1];
                        var55Lifetime1 = var51[1];
                        var56Lifetime1 = var50[2];
                        var57Lifetime1 = var51[2];
                        for (var21 = 0; var21 < hh.field_d; var21++) {
                          var5 = var54Lifetime1[var21];
                          var4 = var53Lifetime1[var21];
                          var6 = var56Lifetime1[var21];
                          stackIn_59_0 = var12Lifetime1;
                          stackIn_59_1 = var21;
                          if (var4 == 4096) {
                            stackIn_60_2 = 4096;
                          } else {
                            stackIn_60_2 = (var52Lifetime1[var21] << 12) / (4096 - var4);
                          }
                          stackIn_59_0[stackIn_59_1] = stackIn_60_2;
                          stackIn_62_0 = var13Lifetime1;
                          stackIn_62_1 = var21;
                          if (var5 != 4096) {
                            stackIn_63_2 = (var55Lifetime1[var21] << 12) / (4096 - var5);
                          } else {
                            stackIn_63_2 = 4096;
                          }
                          stackIn_62_0[stackIn_62_1] = stackIn_63_2;
                          stackIn_65_0 = var14Lifetime1;
                          stackIn_65_1 = var21;
                          if (var6 == 4096) {
                            stackIn_66_2 = 4096;
                          } else {
                            stackIn_66_2 = (var57Lifetime1[var21] << 12) / (-var6 + 4096);
                          }
                          stackIn_65_0[stackIn_65_1] = stackIn_66_2;
                        }
                      } else {
                        if (var21 == 8) {
                          var12Lifetime1 = var33[0];
                          var13Lifetime1 = var33[1];
                          var14Lifetime1 = var33[2];
                          var52Lifetime1 = var51[0];
                          var53Lifetime1 = var50[0];
                          var54Lifetime1 = var50[1];
                          var55Lifetime1 = var51[1];
                          var56Lifetime1 = var50[2];
                          var57Lifetime1 = var51[2];
                          for (var21 = 0; hh.field_d > var21; var21++) {
                            var4 = var53Lifetime1[var21];
                            var6 = var56Lifetime1[var21];
                            var5 = var54Lifetime1[var21];
                            stackIn_71_0 = var12Lifetime1;
                            stackIn_71_1 = var21;
                            if (0 == var4) {
                              stackIn_72_2 = 0;
                            } else {
                              stackIn_72_2 = -((-var52Lifetime1[var21] + 4096 << 12) / var4) + 4096;
                            }
                            stackIn_71_0[stackIn_71_1] = stackIn_72_2;
                            stackIn_74_0 = var13Lifetime1;
                            stackIn_74_1 = var21;
                            if (var5 == 0) {
                              stackIn_75_2 = 0;
                            } else {
                              stackIn_75_2 = -((4096 - var55Lifetime1[var21] << 12) / var5) + 4096;
                            }
                            stackIn_74_0[stackIn_74_1] = stackIn_75_2;
                            stackIn_77_0 = var14Lifetime1;
                            stackIn_77_1 = var21;
                            if (var6 != 0) {
                              stackIn_78_2 = -((4096 - var57Lifetime1[var21] << 12) / var6) + 4096;
                            } else {
                              stackIn_78_2 = 0;
                            }
                            stackIn_77_0[stackIn_77_1] = stackIn_78_2;
                          }
                        } else {
                          if (var21 == 9) {
                            var12Lifetime1 = var33[0];
                            var13Lifetime1 = var33[1];
                            var14Lifetime1 = var33[2];
                            var52Lifetime1 = var51[0];
                            var53Lifetime1 = var50[0];
                            var54Lifetime1 = var50[1];
                            var55Lifetime1 = var51[1];
                            var56Lifetime1 = var50[2];
                            var57Lifetime1 = var51[2];
                            for (var21 = 0; var21 < hh.field_d; var21++) {
                              var6 = var56Lifetime1[var21];
                              var8 = var55Lifetime1[var21];
                              var9 = var57Lifetime1[var21];
                              var4 = var53Lifetime1[var21];
                              var5 = var54Lifetime1[var21];
                              var7 = var52Lifetime1[var21];
                              stackIn_83_0 = var12Lifetime1;
                              stackIn_83_1 = var21;
                              if (var7 > var4) {
                                stackIn_84_2 = var4;
                              } else {
                                stackIn_84_2 = var7;
                              }
                              stackIn_83_0[stackIn_83_1] = stackIn_84_2;
                              stackIn_86_0 = var13Lifetime1;
                              stackIn_86_1 = var21;
                              if (var8 > var5) {
                                stackIn_87_2 = var5;
                              } else {
                                stackIn_87_2 = var8;
                              }
                              stackIn_86_0[stackIn_86_1] = stackIn_87_2;
                              stackIn_89_0 = var14Lifetime1;
                              stackIn_89_1 = var21;
                              if (var6 < var9) {
                                stackIn_90_2 = var6;
                              } else {
                                stackIn_90_2 = var9;
                              }
                              stackIn_89_0[stackIn_89_1] = stackIn_90_2;
                            }
                          } else {
                            if (10 == var21) {
                              var12Lifetime1 = var33[0];
                              var13Lifetime1 = var33[1];
                              var14Lifetime1 = var33[2];
                              var52Lifetime1 = var51[0];
                              var53Lifetime1 = var50[0];
                              var54Lifetime1 = var50[1];
                              var55Lifetime1 = var51[1];
                              var56Lifetime1 = var50[2];
                              var57Lifetime1 = var51[2];
                              for (var21 = 0; hh.field_d > var21; var21++) {
                                var4 = var53Lifetime1[var21];
                                var5 = var54Lifetime1[var21];
                                var6 = var56Lifetime1[var21];
                                var8 = var55Lifetime1[var21];
                                var7 = var52Lifetime1[var21];
                                var9 = var57Lifetime1[var21];
                                stackIn_95_0 = var12Lifetime1;
                                stackIn_95_1 = var21;
                                if (var7 < var4) {
                                  stackIn_96_2 = var4;
                                } else {
                                  stackIn_96_2 = var7;
                                }
                                stackIn_95_0[stackIn_95_1] = stackIn_96_2;
                                stackIn_98_0 = var13Lifetime1;
                                stackIn_98_1 = var21;
                                if (var5 > var8) {
                                  stackIn_99_2 = var5;
                                } else {
                                  stackIn_99_2 = var8;
                                }
                                stackIn_98_0[stackIn_98_1] = stackIn_99_2;
                                stackIn_101_0 = var14Lifetime1;
                                stackIn_101_1 = var21;
                                if (var9 >= var6) {
                                  stackIn_102_2 = var9;
                                } else {
                                  stackIn_102_2 = var6;
                                }
                                stackIn_101_0[stackIn_101_1] = stackIn_102_2;
                              }
                            } else {
                              if (var21 == 11) {
                                var12Lifetime1 = var33[0];
                                var13Lifetime1 = var33[1];
                                var14Lifetime1 = var33[2];
                                var52Lifetime1 = var51[0];
                                var53Lifetime1 = var50[0];
                                var54Lifetime1 = var50[1];
                                var55Lifetime1 = var51[1];
                                var56Lifetime1 = var50[2];
                                var57Lifetime1 = var51[2];
                                for (var21 = 0; var21 < hh.field_d; var21++) {
                                  var9 = var57Lifetime1[var21];
                                  var8 = var55Lifetime1[var21];
                                  var6 = var56Lifetime1[var21];
                                  var4 = var53Lifetime1[var21];
                                  var5 = var54Lifetime1[var21];
                                  var7 = var52Lifetime1[var21];
                                  stackIn_107_0 = var12Lifetime1;
                                  stackIn_107_1 = var21;
                                  if (var7 >= var4) {
                                    stackIn_108_2 = -var4 + var7;
                                  } else {
                                    stackIn_108_2 = var4 - var7;
                                  }
                                  stackIn_107_0[stackIn_107_1] = stackIn_108_2;
                                  stackIn_110_0 = var13Lifetime1;
                                  stackIn_110_1 = var21;
                                  if (var8 < var5) {
                                    stackIn_111_2 = var5 - var8;
                                  } else {
                                    stackIn_111_2 = var8 - var5;
                                  }
                                  stackIn_110_0[stackIn_110_1] = stackIn_111_2;
                                  stackIn_113_0 = var14Lifetime1;
                                  stackIn_113_1 = var21;
                                  if (var6 > var9) {
                                    stackIn_114_2 = -var9 + var6;
                                  } else {
                                    stackIn_114_2 = -var6 + var9;
                                  }
                                  stackIn_113_0[stackIn_113_1] = stackIn_114_2;
                                }
                              } else {
                                if (12 == var21) {
                                  var12Lifetime1 = var33[0];
                                  var13Lifetime1 = var33[1];
                                  var14Lifetime1 = var33[2];
                                  var52Lifetime1 = var51[0];
                                  var53Lifetime1 = var50[0];
                                  var54Lifetime1 = var50[1];
                                  var55Lifetime1 = var51[1];
                                  var56Lifetime1 = var50[2];
                                  var57Lifetime1 = var51[2];
                                  for (var21 = 0; hh.field_d > var21; var21++) {
                                    var4 = var53Lifetime1[var21];
                                    var5 = var54Lifetime1[var21];
                                    var6 = var56Lifetime1[var21];
                                    var8 = var55Lifetime1[var21];
                                    var7 = var52Lifetime1[var21];
                                    var9 = var57Lifetime1[var21];
                                    var12Lifetime1[var21] = -(var7 * var4 >> 11) + var4 + var7;
                                    var13Lifetime1[var21] = var5 + var8 - (var5 * var8 >> 11);
                                    var14Lifetime1[var21] = -(var6 * var9 >> 11) + var9 + var6;
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

    final int[] a(int param0, int param1) {
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_38_2 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int stackIn_47_2 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_53_2 = 0;
        int[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int stackIn_59_2 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_65_2 = 0;
        int[] stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int stackIn_71_2 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_77_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var8;
        int var9;
        lu var10;
        int[] var11;
        int[] var18;
        int[] var19;
        int[] var11Lifetime1;
        var9 = BachelorFridge.field_y;
        if (param1 != 0) {
          var10 = (lu) null;
          this.a((byte) -21, (lu) null, -72);
        }
        var11 = this.field_j.a(param0, ~param1);
        var3 = var11;
        if (this.field_j.field_m) {
          var19 = this.a(0, param0, (byte) 110);
          var18 = this.a(1, param0, (byte) 126);
          var8 = this.field_l;
          if (var8 == 1) {
            var11Lifetime1 = var3;
            for (var8 = 0; var8 < hh.field_d; var8++) {
              var11Lifetime1[var8] = var18[var8] + var19[var8];
            }
          } else {
            if (var8 == 2) {
              for (var8 = 0; var8 < hh.field_d; var8++) {
                var3[var8] = var19[var8] - var18[var8];
              }
            } else {
              if (3 == var8) {
                for (var8 = 0; hh.field_d > var8; var8++) {
                  var3[var8] = var18[var8] * var19[var8] >> 12;
                }
              } else {
                if (var8 == 4) {
                  for (var8 = 0; hh.field_d > var8; var8++) {
                    var5 = var18[var8];
                    stackIn_37_0 = var3;
                    stackIn_37_1 = var8;
                    if (var5 != 0) {
                      stackIn_38_2 = (var19[var8] << 12) / var5;
                    } else {
                      stackIn_38_2 = 4096;
                    }
                    stackIn_37_0[stackIn_37_1] = stackIn_38_2;
                  }
                } else {
                  if (var8 == 5) {
                    for (var8 = 0; hh.field_d > var8; var8++) {
                      var3[var8] = -((4096 - var18[var8]) * (-var19[var8] + 4096) >> 12) + 4096;
                    }
                  } else {
                    if (var8 == 6) {
                      for (var8 = 0; hh.field_d > var8; var8++) {
                        var5 = var18[var8];
                        stackIn_46_0 = var3;
                        stackIn_46_1 = var8;
                        if (var5 < 2048) {
                          stackIn_47_2 = var19[var8] * var5 >> 11;
                        } else {
                          stackIn_47_2 = 4096 - ((4096 - var19[var8]) * (4096 - var5) >> 11);
                        }
                        stackIn_46_0[stackIn_46_1] = stackIn_47_2;
                      }
                    } else {
                      if (var8 == 7) {
                        for (var8 = 0; var8 < hh.field_d; var8++) {
                          var4 = var19[var8];
                          stackIn_52_0 = var3;
                          stackIn_52_1 = var8;
                          if (var4 == 4096) {
                            stackIn_53_2 = 4096;
                          } else {
                            stackIn_53_2 = (var18[var8] << 12) / (-var4 + 4096);
                          }
                          stackIn_52_0[stackIn_52_1] = stackIn_53_2;
                        }
                      } else {
                        if (var8 == 8) {
                          for (var8 = 0; var8 < hh.field_d; var8++) {
                            var4 = var19[var8];
                            stackIn_58_0 = var3;
                            stackIn_58_1 = var8;
                            if (var4 == 0) {
                              stackIn_59_2 = 0;
                            } else {
                              stackIn_59_2 = 4096 - (4096 - var18[var8] << 12) / var4;
                            }
                            stackIn_58_0[stackIn_58_1] = stackIn_59_2;
                          }
                        } else {
                          if (var8 == 9) {
                            for (var8 = 0; var8 < hh.field_d; var8++) {
                              var5 = var18[var8];
                              var4 = var19[var8];
                              stackIn_64_0 = var3;
                              stackIn_64_1 = var8;
                              if (var5 <= var4) {
                                stackIn_65_2 = var5;
                              } else {
                                stackIn_65_2 = var4;
                              }
                              stackIn_64_0[stackIn_64_1] = stackIn_65_2;
                            }
                          } else {
                            if (10 == var8) {
                              for (var8 = 0; hh.field_d > var8; var8++) {
                                var5 = var18[var8];
                                var4 = var19[var8];
                                stackIn_70_0 = var3;
                                stackIn_70_1 = var8;
                                if (var4 > var5) {
                                  stackIn_71_2 = var4;
                                } else {
                                  stackIn_71_2 = var5;
                                }
                                stackIn_70_0[stackIn_70_1] = stackIn_71_2;
                              }
                            } else {
                              if (var8 == 11) {
                                for (var8 = 0; var8 < hh.field_d; var8++) {
                                  var4 = var19[var8];
                                  var5 = var18[var8];
                                  stackIn_76_0 = var3;
                                  stackIn_76_1 = var8;
                                  if (var5 < var4) {
                                    stackIn_77_2 = var4 - var5;
                                  } else {
                                    stackIn_77_2 = -var4 + var5;
                                  }
                                  stackIn_76_0[stackIn_76_1] = stackIn_77_2;
                                }
                              } else {
                                if (var8 == 12) {
                                  for (var8 = 0; var8 < hh.field_d; var8++) {
                                    var5 = var18[var8];
                                    var4 = var19[var8];
                                    var3[var8] = -(var4 * var5 >> 11) + var5 + var4;
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

    public ska() {
        super(2, false);
        this.field_l = 6;
    }

    static {
    }
}
