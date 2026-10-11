/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eka extends ci {
    static il field_o;
    private int field_m;
    static String field_n;

    public static void c(int param0) {
        if (param0 >= -52) {
          field_n = (String) null;
        }
        field_n = null;
        field_o = null;
    }

    final int[][] b(int param0, int param1) {
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_35_2 = 0;
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int stackIn_38_2 = 0;
        int[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        int stackIn_41_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int stackIn_53_2 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_56_2 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_62_2 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int stackIn_65_2 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_68_2 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_74_2 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int stackIn_77_2 = 0;
        int[] stackIn_79_0 = null;
        int stackIn_79_1 = 0;
        int stackIn_80_2 = 0;
        int[] stackIn_85_0 = null;
        int stackIn_85_1 = 0;
        int stackIn_86_2 = 0;
        int[] stackIn_88_0 = null;
        int stackIn_88_1 = 0;
        int stackIn_89_2 = 0;
        int[] stackIn_91_0 = null;
        int stackIn_91_1 = 0;
        int stackIn_92_2 = 0;
        int[] stackIn_97_0 = null;
        int stackIn_97_1 = 0;
        int stackIn_98_2 = 0;
        int[] stackIn_100_0 = null;
        int stackIn_100_1 = 0;
        int stackIn_101_2 = 0;
        int[] stackIn_103_0 = null;
        int stackIn_103_1 = 0;
        int stackIn_104_2 = 0;
        int[] stackIn_109_0 = null;
        int stackIn_109_1 = 0;
        int stackIn_110_2 = 0;
        int[] stackIn_112_0 = null;
        int stackIn_112_1 = 0;
        int stackIn_113_2 = 0;
        int[] stackIn_115_0 = null;
        int stackIn_115_1 = 0;
        int stackIn_116_2 = 0;
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
        var22 = TombRacer.field_G ? 1 : 0;
        var33 = this.field_h.a(param0, (byte) 102);
        var24 = var33;
        var23 = var24;
        var3 = var23;
        if (this.field_h.field_f) {
          var50 = this.a(param0, 0, -1);
          var51 = this.a(param0, 1, -1);
          var12 = var33[0];
          var13 = var33[1];
          var14 = var33[2];
          var52 = var50[0];
          var54 = var50[1];
          var57 = var50[2];
          var53 = var51[0];
          var55 = var51[1];
          var56 = var51[2];
          var21 = this.field_m;
          if (var21 == 1) {
            var12Lifetime1 = var33[0];
            var13Lifetime1 = var33[1];
            var14Lifetime1 = var33[2];
            var52Lifetime1 = var50[0];
            var53Lifetime1 = var51[0];
            var54Lifetime1 = var50[1];
            var55Lifetime1 = var51[1];
            var56Lifetime1 = var51[2];
            var57Lifetime1 = var50[2];
            for (var21 = 0; ns.field_g > var21; var21++) {
              var12Lifetime1[var21] = var52Lifetime1[var21] + var53Lifetime1[var21];
              var13Lifetime1[var21] = var54Lifetime1[var21] + var55Lifetime1[var21];
              var14Lifetime1[var21] = var56Lifetime1[var21] + var57Lifetime1[var21];
            }
          } else {
            if (var21 == 2) {
              var12Lifetime1 = var33[0];
              var13Lifetime1 = var33[1];
              var14Lifetime1 = var33[2];
              var52Lifetime1 = var50[0];
              var53Lifetime1 = var51[0];
              var54Lifetime1 = var50[1];
              var55Lifetime1 = var51[1];
              var56Lifetime1 = var51[2];
              var57Lifetime1 = var50[2];
              for (var21 = 0; ns.field_g > var21; var21++) {
                var12Lifetime1[var21] = var52Lifetime1[var21] - var53Lifetime1[var21];
                var13Lifetime1[var21] = var54Lifetime1[var21] - var55Lifetime1[var21];
                var14Lifetime1[var21] = var57Lifetime1[var21] - var56Lifetime1[var21];
              }
            } else {
              if (3 == var21) {
                var12Lifetime1 = var33[0];
                var13Lifetime1 = var33[1];
                var14Lifetime1 = var33[2];
                var52Lifetime1 = var50[0];
                var53Lifetime1 = var51[0];
                var54Lifetime1 = var50[1];
                var55Lifetime1 = var51[1];
                var56Lifetime1 = var51[2];
                var57Lifetime1 = var50[2];
                for (var21 = 0; var21 < ns.field_g; var21++) {
                  var12Lifetime1[var21] = var53Lifetime1[var21] * var52Lifetime1[var21] >> 12;
                  var13Lifetime1[var21] = var54Lifetime1[var21] * var55Lifetime1[var21] >> 12;
                  var14Lifetime1[var21] = var56Lifetime1[var21] * var57Lifetime1[var21] >> 12;
                }
              } else {
                if (var21 == 4) {
                  var12Lifetime1 = var33[0];
                  var13Lifetime1 = var33[1];
                  var14Lifetime1 = var33[2];
                  var52Lifetime1 = var50[0];
                  var53Lifetime1 = var51[0];
                  var54Lifetime1 = var50[1];
                  var55Lifetime1 = var51[1];
                  var56Lifetime1 = var51[2];
                  var57Lifetime1 = var50[2];
                  for (var21 = 0; var21 < ns.field_g; var21++) {
                    var8 = var55Lifetime1[var21];
                    var7 = var53Lifetime1[var21];
                    var9 = var56Lifetime1[var21];
                    stackIn_34_0 = var12Lifetime1;
                    stackIn_34_1 = var21;
                    if (0 == var7) {
                      stackIn_35_2 = 4096;
                    } else {
                      stackIn_35_2 = (var52Lifetime1[var21] << 12) / var7;
                    }
                    stackIn_34_0[stackIn_34_1] = stackIn_35_2;
                    stackIn_37_0 = var13Lifetime1;
                    stackIn_37_1 = var21;
                    if (var8 != 0) {
                      stackIn_38_2 = (var54Lifetime1[var21] << 12) / var8;
                    } else {
                      stackIn_38_2 = 4096;
                    }
                    stackIn_37_0[stackIn_37_1] = stackIn_38_2;
                    stackIn_40_0 = var14Lifetime1;
                    stackIn_40_1 = var21;
                    if (var9 == 0) {
                      stackIn_41_2 = 4096;
                    } else {
                      stackIn_41_2 = (var57Lifetime1[var21] << 12) / var9;
                    }
                    stackIn_40_0[stackIn_40_1] = stackIn_41_2;
                  }
                } else {
                  if (var21 == 5) {
                    var12Lifetime1 = var33[0];
                    var13Lifetime1 = var33[1];
                    var14Lifetime1 = var33[2];
                    var52Lifetime1 = var50[0];
                    var53Lifetime1 = var51[0];
                    var54Lifetime1 = var50[1];
                    var55Lifetime1 = var51[1];
                    var56Lifetime1 = var51[2];
                    var57Lifetime1 = var50[2];
                    for (var21 = 0; var21 < ns.field_g; var21++) {
                      var12Lifetime1[var21] = 4096 - ((-var53Lifetime1[var21] + 4096) * (-var52Lifetime1[var21] + 4096) >> 12);
                      var13Lifetime1[var21] = -((4096 - var55Lifetime1[var21]) * (4096 - var54Lifetime1[var21]) >> 12) + 4096;
                      var14Lifetime1[var21] = 4096 - ((4096 - var56Lifetime1[var21]) * (-var57Lifetime1[var21] + 4096) >> 12);
                    }
                  } else {
                    if (6 == var21) {
                      var12Lifetime1 = var33[0];
                      var13Lifetime1 = var33[1];
                      var14Lifetime1 = var33[2];
                      var52Lifetime1 = var50[0];
                      var53Lifetime1 = var51[0];
                      var54Lifetime1 = var50[1];
                      var55Lifetime1 = var51[1];
                      var56Lifetime1 = var51[2];
                      var57Lifetime1 = var50[2];
                      for (var21 = 0; ns.field_g > var21; var21++) {
                        var7 = var53Lifetime1[var21];
                        var8 = var55Lifetime1[var21];
                        var9 = var56Lifetime1[var21];
                        stackIn_49_0 = var12Lifetime1;
                        stackIn_49_1 = var21;
                        if (var7 < 2048) {
                          stackIn_50_2 = var52Lifetime1[var21] * var7 >> 11;
                        } else {
                          stackIn_50_2 = -((-var52Lifetime1[var21] + 4096) * (4096 - var7) >> 11) + 4096;
                        }
                        stackIn_49_0[stackIn_49_1] = stackIn_50_2;
                        stackIn_52_0 = var13Lifetime1;
                        stackIn_52_1 = var21;
                        if (2048 <= var8) {
                          stackIn_53_2 = 4096 - ((-var54Lifetime1[var21] + 4096) * (4096 - var8) >> 11);
                        } else {
                          stackIn_53_2 = var8 * var54Lifetime1[var21] >> 11;
                        }
                        stackIn_52_0[stackIn_52_1] = stackIn_53_2;
                        stackIn_55_0 = var14Lifetime1;
                        stackIn_55_1 = var21;
                        if (var9 < 2048) {
                          stackIn_56_2 = var9 * var57Lifetime1[var21] >> 11;
                        } else {
                          stackIn_56_2 = 4096 - ((4096 - var57Lifetime1[var21]) * (4096 - var9) >> 11);
                        }
                        stackIn_55_0[stackIn_55_1] = stackIn_56_2;
                      }
                    } else {
                      if (var21 == 7) {
                        var12Lifetime1 = var33[0];
                        var13Lifetime1 = var33[1];
                        var14Lifetime1 = var33[2];
                        var52Lifetime1 = var50[0];
                        var53Lifetime1 = var51[0];
                        var54Lifetime1 = var50[1];
                        var55Lifetime1 = var51[1];
                        var56Lifetime1 = var51[2];
                        var57Lifetime1 = var50[2];
                        for (var21 = 0; var21 < ns.field_g; var21++) {
                          var5 = var54Lifetime1[var21];
                          var6 = var57Lifetime1[var21];
                          var4 = var52Lifetime1[var21];
                          stackIn_61_0 = var12Lifetime1;
                          stackIn_61_1 = var21;
                          if (var4 == 4096) {
                            stackIn_62_2 = 4096;
                          } else {
                            stackIn_62_2 = (var53Lifetime1[var21] << 12) / (4096 - var4);
                          }
                          stackIn_61_0[stackIn_61_1] = stackIn_62_2;
                          stackIn_64_0 = var13Lifetime1;
                          stackIn_64_1 = var21;
                          if (var5 == 4096) {
                            stackIn_65_2 = 4096;
                          } else {
                            stackIn_65_2 = (var55Lifetime1[var21] << 12) / (4096 - var5);
                          }
                          stackIn_64_0[stackIn_64_1] = stackIn_65_2;
                          stackIn_67_0 = var14Lifetime1;
                          stackIn_67_1 = var21;
                          if (var6 != 4096) {
                            stackIn_68_2 = (var56Lifetime1[var21] << 12) / (-var6 + 4096);
                          } else {
                            stackIn_68_2 = 4096;
                          }
                          stackIn_67_0[stackIn_67_1] = stackIn_68_2;
                        }
                      } else {
                        if (var21 == 8) {
                          var12Lifetime1 = var33[0];
                          var13Lifetime1 = var33[1];
                          var14Lifetime1 = var33[2];
                          var52Lifetime1 = var50[0];
                          var53Lifetime1 = var51[0];
                          var54Lifetime1 = var50[1];
                          var55Lifetime1 = var51[1];
                          var56Lifetime1 = var51[2];
                          var57Lifetime1 = var50[2];
                          for (var21 = 0; var21 < ns.field_g; var21++) {
                            var4 = var52Lifetime1[var21];
                            var6 = var57Lifetime1[var21];
                            var5 = var54Lifetime1[var21];
                            stackIn_73_0 = var12Lifetime1;
                            stackIn_73_1 = var21;
                            if (var4 != 0) {
                              stackIn_74_2 = 4096 - (4096 - var53Lifetime1[var21] << 12) / var4;
                            } else {
                              stackIn_74_2 = 0;
                            }
                            stackIn_73_0[stackIn_73_1] = stackIn_74_2;
                            stackIn_76_0 = var13Lifetime1;
                            stackIn_76_1 = var21;
                            if (var5 == 0) {
                              stackIn_77_2 = 0;
                            } else {
                              stackIn_77_2 = -((4096 - var55Lifetime1[var21] << 12) / var5) + 4096;
                            }
                            stackIn_76_0[stackIn_76_1] = stackIn_77_2;
                            stackIn_79_0 = var14Lifetime1;
                            stackIn_79_1 = var21;
                            if (var6 != 0) {
                              stackIn_80_2 = 4096 - (4096 - var56Lifetime1[var21] << 12) / var6;
                            } else {
                              stackIn_80_2 = 0;
                            }
                            stackIn_79_0[stackIn_79_1] = stackIn_80_2;
                          }
                        } else {
                          if (var21 == 9) {
                            var12Lifetime1 = var33[0];
                            var13Lifetime1 = var33[1];
                            var14Lifetime1 = var33[2];
                            var52Lifetime1 = var50[0];
                            var53Lifetime1 = var51[0];
                            var54Lifetime1 = var50[1];
                            var55Lifetime1 = var51[1];
                            var56Lifetime1 = var51[2];
                            var57Lifetime1 = var50[2];
                            for (var21 = 0; ns.field_g > var21; var21++) {
                              var8 = var55Lifetime1[var21];
                              var4 = var52Lifetime1[var21];
                              var9 = var56Lifetime1[var21];
                              var5 = var54Lifetime1[var21];
                              var6 = var57Lifetime1[var21];
                              var7 = var53Lifetime1[var21];
                              stackIn_85_0 = var12Lifetime1;
                              stackIn_85_1 = var21;
                              if (var4 >= var7) {
                                stackIn_86_2 = var7;
                              } else {
                                stackIn_86_2 = var4;
                              }
                              stackIn_85_0[stackIn_85_1] = stackIn_86_2;
                              stackIn_88_0 = var13Lifetime1;
                              stackIn_88_1 = var21;
                              if (var5 >= var8) {
                                stackIn_89_2 = var8;
                              } else {
                                stackIn_89_2 = var5;
                              }
                              stackIn_88_0[stackIn_88_1] = stackIn_89_2;
                              stackIn_91_0 = var14Lifetime1;
                              stackIn_91_1 = var21;
                              if (var6 >= var9) {
                                stackIn_92_2 = var9;
                              } else {
                                stackIn_92_2 = var6;
                              }
                              stackIn_91_0[stackIn_91_1] = stackIn_92_2;
                            }
                          } else {
                            if (var21 == 10) {
                              var12Lifetime1 = var33[0];
                              var13Lifetime1 = var33[1];
                              var14Lifetime1 = var33[2];
                              var52Lifetime1 = var50[0];
                              var53Lifetime1 = var51[0];
                              var54Lifetime1 = var50[1];
                              var55Lifetime1 = var51[1];
                              var56Lifetime1 = var51[2];
                              var57Lifetime1 = var50[2];
                              for (var21 = 0; ns.field_g > var21; var21++) {
                                var4 = var52Lifetime1[var21];
                                var7 = var53Lifetime1[var21];
                                var8 = var55Lifetime1[var21];
                                var5 = var54Lifetime1[var21];
                                var6 = var57Lifetime1[var21];
                                var9 = var56Lifetime1[var21];
                                stackIn_97_0 = var12Lifetime1;
                                stackIn_97_1 = var21;
                                if (var7 < var4) {
                                  stackIn_98_2 = var4;
                                } else {
                                  stackIn_98_2 = var7;
                                }
                                stackIn_97_0[stackIn_97_1] = stackIn_98_2;
                                stackIn_100_0 = var13Lifetime1;
                                stackIn_100_1 = var21;
                                if (var5 <= var8) {
                                  stackIn_101_2 = var8;
                                } else {
                                  stackIn_101_2 = var5;
                                }
                                stackIn_100_0[stackIn_100_1] = stackIn_101_2;
                                stackIn_103_0 = var14Lifetime1;
                                stackIn_103_1 = var21;
                                if (var6 > var9) {
                                  stackIn_104_2 = var6;
                                } else {
                                  stackIn_104_2 = var9;
                                }
                                stackIn_103_0[stackIn_103_1] = stackIn_104_2;
                              }
                            } else {
                              if (var21 == 11) {
                                var12Lifetime1 = var33[0];
                                var13Lifetime1 = var33[1];
                                var14Lifetime1 = var33[2];
                                var52Lifetime1 = var50[0];
                                var53Lifetime1 = var51[0];
                                var54Lifetime1 = var50[1];
                                var55Lifetime1 = var51[1];
                                var56Lifetime1 = var51[2];
                                var57Lifetime1 = var50[2];
                                for (var21 = 0; ns.field_g > var21; var21++) {
                                  var8 = var55Lifetime1[var21];
                                  var5 = var54Lifetime1[var21];
                                  var4 = var52Lifetime1[var21];
                                  var9 = var56Lifetime1[var21];
                                  var7 = var53Lifetime1[var21];
                                  var6 = var57Lifetime1[var21];
                                  stackIn_109_0 = var12Lifetime1;
                                  stackIn_109_1 = var21;
                                  if (var7 >= var4) {
                                    stackIn_110_2 = -var4 + var7;
                                  } else {
                                    stackIn_110_2 = var4 - var7;
                                  }
                                  stackIn_109_0[stackIn_109_1] = stackIn_110_2;
                                  stackIn_112_0 = var13Lifetime1;
                                  stackIn_112_1 = var21;
                                  if (var5 > var8) {
                                    stackIn_113_2 = -var8 + var5;
                                  } else {
                                    stackIn_113_2 = -var5 + var8;
                                  }
                                  stackIn_112_0[stackIn_112_1] = stackIn_113_2;
                                  stackIn_115_0 = var14Lifetime1;
                                  stackIn_115_1 = var21;
                                  if (var6 > var9) {
                                    stackIn_116_2 = var6 - var9;
                                  } else {
                                    stackIn_116_2 = -var6 + var9;
                                  }
                                  stackIn_115_0[stackIn_115_1] = stackIn_116_2;
                                }
                              } else {
                                if (12 == var21) {
                                  var12Lifetime1 = var33[0];
                                  var13Lifetime1 = var33[1];
                                  var14Lifetime1 = var33[2];
                                  var52Lifetime1 = var50[0];
                                  var53Lifetime1 = var51[0];
                                  var54Lifetime1 = var50[1];
                                  var55Lifetime1 = var51[1];
                                  var56Lifetime1 = var51[2];
                                  var57Lifetime1 = var50[2];
                                  for (var21 = 0; ns.field_g > var21; var21++) {
                                    var8 = var55Lifetime1[var21];
                                    var9 = var56Lifetime1[var21];
                                    var5 = var54Lifetime1[var21];
                                    var7 = var53Lifetime1[var21];
                                    var6 = var57Lifetime1[var21];
                                    var4 = var52Lifetime1[var21];
                                    var12Lifetime1[var21] = -(var4 * var7 >> 11) + (var4 + var7);
                                    var13Lifetime1[var21] = var5 + var8 - (var5 * var8 >> 11);
                                    var14Lifetime1[var21] = -(var9 * var6 >> 11) + var6 + var9;
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
        if (param1 != -1) {
          eka.d((byte) 83);
        }
        return var3;
    }

    final static dfa d(int param0, int param1) {
        int var2;
        if (param1 <= 120) {
          return (dfa) null;
        }
        var2 = param0;
        if (var2 == -1) {
          return (dfa) ((Object) rba.field_a);
        }
        if (var2 == -2) {
          return (dfa) ((Object) oqa.field_s);
        }
        return (dfa) ((Object) nl.a(param0, (byte) 50));
    }

    final void a(byte param0, uia param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          var4_int = param2;
          if (0 == var4_int) {
            this.field_m = param1.h(param0 + 148);
          } else {
            if (1 == var4_int) {
              stackIn_8_1 = (param1.h(255) == 1);
              this.field_g = stackIn_8_1;
            }
          }
          if (param0 != 107) {
            eka.d(111, -90);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("eka.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param2).append(')').toString());
        }
    }

    final static br d(byte param0) {
        int var1_int = 0;
        br var2 = null;
        int var3 = 0;
        br stackIn_5_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        var3 = TombRacer.field_G ? 1 : 0;
        if (param0 != 86) {
          return (br) null;
        }
        try {
          var1_int = 0;
          while (true) {
            var2 = taa.field_g.a((byte) 115, var1_int);
            if (!var2.field_m) {
              var1_int++;
              continue;
            }
            break;
          }
          stackIn_5_0 = var2;
          return stackIn_5_0;
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    public eka() {
        super(2, false);
        this.field_m = 6;
    }

    final int[] c(int param0, int param1) {
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int stackIn_35_2 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int stackIn_44_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int stackIn_50_2 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int stackIn_56_2 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int stackIn_62_2 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int stackIn_68_2 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int stackIn_74_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var8;
        int var9;
        int[] var10;
        int[] var17;
        int[] var18;
        int[] var10Lifetime1;
        var9 = TombRacer.field_G ? 1 : 0;
        var10 = this.field_i.a((byte) 23, param1);
        var3 = var10;
        if (this.field_i.field_d) {
          var18 = this.c(0, -89, param1);
          var17 = this.c(1, -116, param1);
          var8 = this.field_m;
          if (var8 == 1) {
            for (var8 = 0; ns.field_g > var8; var8++) {
              var3[var8] = var17[var8] + var18[var8];
            }
          } else {
            if (var8 == 2) {
              var10Lifetime1 = var3;
              for (var8 = 0; ns.field_g > var8; var8++) {
                var10Lifetime1[var8] = -var17[var8] + var18[var8];
              }
            } else {
              if (var8 == 3) {
                for (var8 = 0; var8 < ns.field_g; var8++) {
                  var3[var8] = var17[var8] * var18[var8] >> 12;
                }
              } else {
                if (var8 == 4) {
                  for (var8 = 0; var8 < ns.field_g; var8++) {
                    var5 = var17[var8];
                    stackIn_34_0 = var3;
                    stackIn_34_1 = var8;
                    if (var5 != 0) {
                      stackIn_35_2 = (var18[var8] << 12) / var5;
                    } else {
                      stackIn_35_2 = 4096;
                    }
                    stackIn_34_0[stackIn_34_1] = stackIn_35_2;
                  }
                } else {
                  if (5 == var8) {
                    for (var8 = 0; ns.field_g > var8; var8++) {
                      var3[var8] = -((4096 - var17[var8]) * (4096 - var18[var8]) >> 12) + 4096;
                    }
                  } else {
                    if (var8 == 6) {
                      for (var8 = 0; ns.field_g > var8; var8++) {
                        var5 = var17[var8];
                        stackIn_43_0 = var3;
                        stackIn_43_1 = var8;
                        if (var5 >= 2048) {
                          stackIn_44_2 = -((-var18[var8] + 4096) * (-var5 + 4096) >> 11) + 4096;
                        } else {
                          stackIn_44_2 = var18[var8] * var5 >> 11;
                        }
                        stackIn_43_0[stackIn_43_1] = stackIn_44_2;
                      }
                    } else {
                      if (7 == var8) {
                        for (var8 = 0; var8 < ns.field_g; var8++) {
                          var4 = var18[var8];
                          stackIn_49_0 = var3;
                          stackIn_49_1 = var8;
                          if (var4 == 4096) {
                            stackIn_50_2 = 4096;
                          } else {
                            stackIn_50_2 = (var17[var8] << 12) / (-var4 + 4096);
                          }
                          stackIn_49_0[stackIn_49_1] = stackIn_50_2;
                        }
                      } else {
                        if (8 == var8) {
                          for (var8 = 0; var8 < ns.field_g; var8++) {
                            var4 = var18[var8];
                            stackIn_55_0 = var3;
                            stackIn_55_1 = var8;
                            if (var4 != 0) {
                              stackIn_56_2 = -((-var17[var8] + 4096 << 12) / var4) + 4096;
                            } else {
                              stackIn_56_2 = 0;
                            }
                            stackIn_55_0[stackIn_55_1] = stackIn_56_2;
                          }
                        } else {
                          if (9 == var8) {
                            for (var8 = 0; ns.field_g > var8; var8++) {
                              var4 = var18[var8];
                              var5 = var17[var8];
                              stackIn_61_0 = var3;
                              stackIn_61_1 = var8;
                              if (var5 <= var4) {
                                stackIn_62_2 = var5;
                              } else {
                                stackIn_62_2 = var4;
                              }
                              stackIn_61_0[stackIn_61_1] = stackIn_62_2;
                            }
                          } else {
                            if (var8 == 10) {
                              for (var8 = 0; var8 < ns.field_g; var8++) {
                                var5 = var17[var8];
                                var4 = var18[var8];
                                stackIn_67_0 = var3;
                                stackIn_67_1 = var8;
                                if (var5 >= var4) {
                                  stackIn_68_2 = var5;
                                } else {
                                  stackIn_68_2 = var4;
                                }
                                stackIn_67_0[stackIn_67_1] = stackIn_68_2;
                              }
                            } else {
                              if (var8 == 11) {
                                for (var8 = 0; var8 < ns.field_g; var8++) {
                                  var5 = var17[var8];
                                  var4 = var18[var8];
                                  stackIn_73_0 = var3;
                                  stackIn_73_1 = var8;
                                  if (var4 > var5) {
                                    stackIn_74_2 = var4 - var5;
                                  } else {
                                    stackIn_74_2 = var5 - var4;
                                  }
                                  stackIn_73_0[stackIn_73_1] = stackIn_74_2;
                                }
                              } else {
                                if (var8 == 12) {
                                  for (var8 = 0; var8 < ns.field_g; var8++) {
                                    var4 = var18[var8];
                                    var5 = var17[var8];
                                    var3[var8] = -(var5 * var4 >> 11) + (var5 + var4);
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
        if (param0 != 1) {
          this.field_m = -34;
        }
        return var3;
    }

    static {
        field_n = "Seriously offensive language";
    }
}
