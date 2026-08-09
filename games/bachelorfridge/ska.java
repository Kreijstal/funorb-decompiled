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
        Object stackIn_8_0 = null;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (-1 != (var4_int ^ -1)) {
                if (var4_int != 1) {
                  break L1;
                } else {
                  L2: {
                    stackIn_8_0 = this;

                    if (-2 != (param1.b(param0 ^ -16711866) ^ -1)) {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 0;
                      break L2;
                    } else {
                      stackIn_9_0 = this;
                      stackIn_9_1 = 1;
                      break L2;
                    }
                  }
                  ((ska) (this)).field_f = stackIn_9_1 != 0;
                  break L1;
                }
              } else {
                this.field_l = param1.b(16711935);
                break L1;
              }
            }
            L3: {
              if (param0 == -71) {
                break L3;
              } else {
                this.a(-58, -67);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var4);

            stackIn_15_1 = new StringBuilder().append("ska.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param2 + ')');
        }
    }

    final int[][] a(boolean param0, int param1) {
        int[] stackIn_32_0 = null;
        int stackIn_32_1 = 0;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int stackIn_33_2 = 0;
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
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int stackIn_48_2 = 0;
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
        int[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int stackIn_60_2 = 0;
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
        int[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int stackIn_72_2 = 0;
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
        int[] stackIn_83_0 = null;
        int stackIn_83_1 = 0;
        int[] stackIn_84_0 = null;
        int stackIn_84_1 = 0;
        int stackIn_84_2 = 0;
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
        int[] stackIn_95_0 = null;
        int stackIn_95_1 = 0;
        int[] stackIn_96_0 = null;
        int stackIn_96_1 = 0;
        int stackIn_96_2 = 0;
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
        int[] stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int[] stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
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
        var22 = BachelorFridge.field_y;
        if (!param0) {
          L0: {
            var33 = this.field_h.a(param1, -858);
            var24 = var33;
            var23 = var24;
            var3 = var23;
            if (!this.field_h.field_b) {
              break L0;
            } else {
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
                var12 = var33[0];
                var13 = var33[1];
                var14 = var33[2];
                var52 = var51[0];
                var53 = var50[0];
                var54 = var50[1];
                var55 = var51[1];
                var56 = var50[2];
                var57 = var51[2];
                var21 = 0;
                L1: while (true) {
                  if (var21 >= hh.field_d) {
                    break L0;
                  } else {
                    var12[var21] = var52[var21] + var53[var21];
                    var13[var21] = var54[var21] + var55[var21];
                    var14[var21] = var56[var21] + var57[var21];
                    var21++;
                    continue L1;
                  }
                }
              } else {
                if (-3 == (var21 ^ -1)) {
                  var12 = var33[0];
                  var13 = var33[1];
                  var14 = var33[2];
                  var52 = var51[0];
                  var53 = var50[0];
                  var54 = var50[1];
                  var55 = var51[1];
                  var56 = var50[2];
                  var57 = var51[2];
                  var21 = 0;
                  L2: while (true) {
                    if (var21 >= hh.field_d) {
                      break L0;
                    } else {
                      var12[var21] = -var52[var21] + var53[var21];
                      var13[var21] = -var55[var21] + var54[var21];
                      var14[var21] = -var57[var21] + var56[var21];
                      var21++;
                      continue L2;
                    }
                  }
                } else {
                  if (-4 != (var21 ^ -1)) {
                    if ((var21 ^ -1) != -5) {
                      if ((var21 ^ -1) == -6) {
                        var12 = var33[0];
                        var13 = var33[1];
                        var14 = var33[2];
                        var52 = var51[0];
                        var53 = var50[0];
                        var54 = var50[1];
                        var55 = var51[1];
                        var56 = var50[2];
                        var57 = var51[2];
                        var21 = 0;
                        L3: while (true) {
                          if (hh.field_d <= var21) {
                            break L0;
                          } else {
                            var12[var21] = 4096 + -((4096 - var53[var21]) * (-var52[var21] + 4096) >> -2133966580);
                            var13[var21] = 4096 - ((-var55[var21] + 4096) * (4096 + -var54[var21]) >> 286664972);
                            var14[var21] = 4096 + -((-var57[var21] + 4096) * (-var56[var21] + 4096) >> -226865364);
                            var21++;
                            continue L3;
                          }
                        }
                      } else {
                        if (6 == var21) {
                          var12 = var33[0];
                          var13 = var33[1];
                          var14 = var33[2];
                          var52 = var51[0];
                          var53 = var50[0];
                          var54 = var50[1];
                          var55 = var51[1];
                          var56 = var50[2];
                          var57 = var51[2];
                          var21 = 0;
                          L4: while (true) {
                            if (hh.field_d <= var21) {
                              break L0;
                            } else {
                              L5: {
                                var9 = var57[var21];
                                var8 = var55[var21];
                                var7 = var52[var21];
                                stackIn_47_0 = (int[]) (var12);

                                stackIn_47_1 = var21;

                                if ((var7 ^ -1) <= -2049) {
                                  stackIn_48_0 = (int[]) ((Object) stackIn_47_0);
                                  stackIn_48_1 = stackIn_47_1;
                                  stackIn_48_2 = 4096 + -((4096 - var7) * (4096 - var53[var21]) >> -1692023573);
                                  break L5;
                                } else {
                                  stackIn_48_0 = (int[]) ((Object) stackIn_47_0);
                                  stackIn_48_1 = stackIn_47_1;
                                  stackIn_48_2 = var7 * var53[var21] >> -1837783029;
                                  break L5;
                                }
                              }
                              L6: {
                                stackIn_48_0[stackIn_48_1] = stackIn_48_2;
                                stackIn_50_0 = (int[]) (var13);

                                stackIn_50_1 = var21;

                                if ((var8 ^ -1) > -2049) {
                                  stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                  stackIn_51_1 = stackIn_50_1;
                                  stackIn_51_2 = var8 * var54[var21] >> -802430517;
                                  break L6;
                                } else {
                                  stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                  stackIn_51_1 = stackIn_50_1;
                                  stackIn_51_2 = 4096 - ((4096 - var54[var21]) * (4096 + -var8) >> 179423211);
                                  break L6;
                                }
                              }
                              L7: {
                                stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                                stackIn_53_0 = (int[]) (var14);

                                stackIn_53_1 = var21;

                                if (var9 >= 2048) {
                                  stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                  stackIn_54_1 = stackIn_53_1;
                                  stackIn_54_2 = 4096 + -((4096 - var56[var21]) * (4096 + -var9) >> 865155851);
                                  break L7;
                                } else {
                                  stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                  stackIn_54_1 = stackIn_53_1;
                                  stackIn_54_2 = var9 * var56[var21] >> 581240427;
                                  break L7;
                                }
                              }
                              stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                              var21++;
                              continue L4;
                            }
                          }
                        } else {
                          if (-8 == (var21 ^ -1)) {
                            var12 = var33[0];
                            var13 = var33[1];
                            var14 = var33[2];
                            var52 = var51[0];
                            var53 = var50[0];
                            var54 = var50[1];
                            var55 = var51[1];
                            var56 = var50[2];
                            var57 = var51[2];
                            var21 = 0;
                            L8: while (true) {
                              if (var21 >= hh.field_d) {
                                break L0;
                              } else {
                                L9: {
                                  var5 = var54[var21];
                                  var4 = var53[var21];
                                  var6 = var56[var21];
                                  stackIn_59_0 = (int[]) (var12);

                                  stackIn_59_1 = var21;

                                  if (var4 == 4096) {
                                    stackIn_60_0 = (int[]) ((Object) stackIn_59_0);
                                    stackIn_60_1 = stackIn_59_1;
                                    stackIn_60_2 = 4096;
                                    break L9;
                                  } else {
                                    stackIn_60_0 = (int[]) ((Object) stackIn_59_0);
                                    stackIn_60_1 = stackIn_59_1;
                                    stackIn_60_2 = (var52[var21] << 1656654156) / (4096 - var4);
                                    break L9;
                                  }
                                }
                                L10: {
                                  stackIn_60_0[stackIn_60_1] = stackIn_60_2;
                                  stackIn_62_0 = (int[]) (var13);

                                  stackIn_62_1 = var21;

                                  if ((var5 ^ -1) != -4097) {
                                    stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                    stackIn_63_1 = stackIn_62_1;
                                    stackIn_63_2 = (var55[var21] << 1372897452) / (4096 - var5);
                                    break L10;
                                  } else {
                                    stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                    stackIn_63_1 = stackIn_62_1;
                                    stackIn_63_2 = 4096;
                                    break L10;
                                  }
                                }
                                L11: {
                                  stackIn_63_0[stackIn_63_1] = stackIn_63_2;
                                  stackIn_65_0 = (int[]) (var14);

                                  stackIn_65_1 = var21;

                                  if (-4097 == (var6 ^ -1)) {
                                    stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                                    stackIn_66_1 = stackIn_65_1;
                                    stackIn_66_2 = 4096;
                                    break L11;
                                  } else {
                                    stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                                    stackIn_66_1 = stackIn_65_1;
                                    stackIn_66_2 = (var57[var21] << 1936451052) / (-var6 + 4096);
                                    break L11;
                                  }
                                }
                                stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                var21++;
                                continue L8;
                              }
                            }
                          } else {
                            if (-9 == (var21 ^ -1)) {
                              var12 = var33[0];
                              var13 = var33[1];
                              var14 = var33[2];
                              var52 = var51[0];
                              var53 = var50[0];
                              var54 = var50[1];
                              var55 = var51[1];
                              var56 = var50[2];
                              var57 = var51[2];
                              var21 = 0;
                              L12: while (true) {
                                if (hh.field_d <= var21) {
                                  break L0;
                                } else {
                                  L13: {
                                    var4 = var53[var21];
                                    var6 = var56[var21];
                                    var5 = var54[var21];
                                    stackIn_71_0 = (int[]) (var12);

                                    stackIn_71_1 = var21;

                                    if (0 == var4) {
                                      stackIn_72_0 = (int[]) ((Object) stackIn_71_0);
                                      stackIn_72_1 = stackIn_71_1;
                                      stackIn_72_2 = 0;
                                      break L13;
                                    } else {
                                      stackIn_72_0 = (int[]) ((Object) stackIn_71_0);
                                      stackIn_72_1 = stackIn_71_1;
                                      stackIn_72_2 = -((-var52[var21] + 4096 << -1797577652) / var4) + 4096;
                                      break L13;
                                    }
                                  }
                                  L14: {
                                    stackIn_72_0[stackIn_72_1] = stackIn_72_2;
                                    stackIn_74_0 = (int[]) (var13);

                                    stackIn_74_1 = var21;

                                    if (var5 == 0) {
                                      stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                      stackIn_75_1 = stackIn_74_1;
                                      stackIn_75_2 = 0;
                                      break L14;
                                    } else {
                                      stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                      stackIn_75_1 = stackIn_74_1;
                                      stackIn_75_2 = -((4096 + -var55[var21] << -850269620) / var5) + 4096;
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                    stackIn_77_0 = (int[]) (var14);

                                    stackIn_77_1 = var21;

                                    if (var6 != 0) {
                                      stackIn_78_0 = (int[]) ((Object) stackIn_77_0);
                                      stackIn_78_1 = stackIn_77_1;
                                      stackIn_78_2 = -((4096 + -var57[var21] << -715036980) / var6) + 4096;
                                      break L15;
                                    } else {
                                      stackIn_78_0 = (int[]) ((Object) stackIn_77_0);
                                      stackIn_78_1 = stackIn_77_1;
                                      stackIn_78_2 = 0;
                                      break L15;
                                    }
                                  }
                                  stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                                  var21++;
                                  continue L12;
                                }
                              }
                            } else {
                              if ((var21 ^ -1) == -10) {
                                var12 = var33[0];
                                var13 = var33[1];
                                var14 = var33[2];
                                var52 = var51[0];
                                var53 = var50[0];
                                var54 = var50[1];
                                var55 = var51[1];
                                var56 = var50[2];
                                var57 = var51[2];
                                var21 = 0;
                                L16: while (true) {
                                  if (var21 >= hh.field_d) {
                                    break L0;
                                  } else {
                                    L17: {
                                      var6 = var56[var21];
                                      var8 = var55[var21];
                                      var9 = var57[var21];
                                      var4 = var53[var21];
                                      var5 = var54[var21];
                                      var7 = var52[var21];
                                      stackIn_83_0 = (int[]) (var12);

                                      stackIn_83_1 = var21;

                                      if (var7 > var4) {
                                        stackIn_84_0 = (int[]) ((Object) stackIn_83_0);
                                        stackIn_84_1 = stackIn_83_1;
                                        stackIn_84_2 = var4;
                                        break L17;
                                      } else {
                                        stackIn_84_0 = (int[]) ((Object) stackIn_83_0);
                                        stackIn_84_1 = stackIn_83_1;
                                        stackIn_84_2 = var7;
                                        break L17;
                                      }
                                    }
                                    L18: {
                                      stackIn_84_0[stackIn_84_1] = stackIn_84_2;
                                      stackIn_86_0 = (int[]) (var13);

                                      stackIn_86_1 = var21;

                                      if (var8 > var5) {
                                        stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                                        stackIn_87_1 = stackIn_86_1;
                                        stackIn_87_2 = var5;
                                        break L18;
                                      } else {
                                        stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                                        stackIn_87_1 = stackIn_86_1;
                                        stackIn_87_2 = var8;
                                        break L18;
                                      }
                                    }
                                    L19: {
                                      stackIn_87_0[stackIn_87_1] = stackIn_87_2;
                                      stackIn_89_0 = (int[]) (var14);

                                      stackIn_89_1 = var21;

                                      if (var6 < var9) {
                                        stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                                        stackIn_90_1 = stackIn_89_1;
                                        stackIn_90_2 = var6;
                                        break L19;
                                      } else {
                                        stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                                        stackIn_90_1 = stackIn_89_1;
                                        stackIn_90_2 = var9;
                                        break L19;
                                      }
                                    }
                                    stackIn_90_0[stackIn_90_1] = stackIn_90_2;
                                    var21++;
                                    continue L16;
                                  }
                                }
                              } else {
                                if (10 == var21) {
                                  var12 = var33[0];
                                  var13 = var33[1];
                                  var14 = var33[2];
                                  var52 = var51[0];
                                  var53 = var50[0];
                                  var54 = var50[1];
                                  var55 = var51[1];
                                  var56 = var50[2];
                                  var57 = var51[2];
                                  var21 = 0;
                                  L20: while (true) {
                                    if (hh.field_d <= var21) {
                                      break L0;
                                    } else {
                                      L21: {
                                        var4 = var53[var21];
                                        var5 = var54[var21];
                                        var6 = var56[var21];
                                        var8 = var55[var21];
                                        var7 = var52[var21];
                                        var9 = var57[var21];
                                        stackIn_95_0 = (int[]) (var12);

                                        stackIn_95_1 = var21;

                                        if (var7 < var4) {
                                          stackIn_96_0 = (int[]) ((Object) stackIn_95_0);
                                          stackIn_96_1 = stackIn_95_1;
                                          stackIn_96_2 = var4;
                                          break L21;
                                        } else {
                                          stackIn_96_0 = (int[]) ((Object) stackIn_95_0);
                                          stackIn_96_1 = stackIn_95_1;
                                          stackIn_96_2 = var7;
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        stackIn_96_0[stackIn_96_1] = stackIn_96_2;
                                        stackIn_98_0 = (int[]) (var13);

                                        stackIn_98_1 = var21;

                                        if (var5 > var8) {
                                          stackIn_99_0 = (int[]) ((Object) stackIn_98_0);
                                          stackIn_99_1 = stackIn_98_1;
                                          stackIn_99_2 = var5;
                                          break L22;
                                        } else {
                                          stackIn_99_0 = (int[]) ((Object) stackIn_98_0);
                                          stackIn_99_1 = stackIn_98_1;
                                          stackIn_99_2 = var8;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        stackIn_99_0[stackIn_99_1] = stackIn_99_2;
                                        stackIn_101_0 = (int[]) (var14);

                                        stackIn_101_1 = var21;

                                        if (var9 >= var6) {
                                          stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                                          stackIn_102_1 = stackIn_101_1;
                                          stackIn_102_2 = var9;
                                          break L23;
                                        } else {
                                          stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                                          stackIn_102_1 = stackIn_101_1;
                                          stackIn_102_2 = var6;
                                          break L23;
                                        }
                                      }
                                      stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                                      var21++;
                                      continue L20;
                                    }
                                  }
                                } else {
                                  if (var21 != 11) {
                                    if (12 != var21) {
                                      break L0;
                                    } else {
                                      var12 = var33[0];
                                      var13 = var33[1];
                                      var14 = var33[2];
                                      var52 = var51[0];
                                      var53 = var50[0];
                                      var54 = var50[1];
                                      var55 = var51[1];
                                      var56 = var50[2];
                                      var57 = var51[2];
                                      var21 = 0;
                                      L24: while (true) {
                                        if (hh.field_d <= var21) {
                                          break L0;
                                        } else {
                                          var4 = var53[var21];
                                          var5 = var54[var21];
                                          var6 = var56[var21];
                                          var8 = var55[var21];
                                          var7 = var52[var21];
                                          var9 = var57[var21];
                                          var12[var21] = -(var7 * var4 >> -777017141) + var4 + var7;
                                          var13[var21] = var5 - -var8 + -(var5 * var8 >> 1451555979);
                                          var14[var21] = -(var6 * var9 >> -1207747605) + var9 + var6;
                                          var21++;
                                          continue L24;
                                        }
                                      }
                                    }
                                  } else {
                                    var12 = var33[0];
                                    var13 = var33[1];
                                    var14 = var33[2];
                                    var52 = var51[0];
                                    var53 = var50[0];
                                    var54 = var50[1];
                                    var55 = var51[1];
                                    var56 = var50[2];
                                    var57 = var51[2];
                                    var21 = 0;
                                    L25: while (true) {
                                      if (var21 >= hh.field_d) {
                                        break L0;
                                      } else {
                                        L26: {
                                          var9 = var57[var21];
                                          var8 = var55[var21];
                                          var6 = var56[var21];
                                          var4 = var53[var21];
                                          var5 = var54[var21];
                                          var7 = var52[var21];
                                          stackIn_107_0 = (int[]) (var12);

                                          stackIn_107_1 = var21;

                                          if (var7 >= var4) {
                                            stackIn_108_0 = (int[]) ((Object) stackIn_107_0);
                                            stackIn_108_1 = stackIn_107_1;
                                            stackIn_108_2 = -var4 + var7;
                                            break L26;
                                          } else {
                                            stackIn_108_0 = (int[]) ((Object) stackIn_107_0);
                                            stackIn_108_1 = stackIn_107_1;
                                            stackIn_108_2 = var4 - var7;
                                            break L26;
                                          }
                                        }
                                        L27: {
                                          stackIn_108_0[stackIn_108_1] = stackIn_108_2;
                                          stackIn_110_0 = (int[]) (var13);

                                          stackIn_110_1 = var21;

                                          if (var8 < var5) {
                                            stackIn_111_0 = (int[]) ((Object) stackIn_110_0);
                                            stackIn_111_1 = stackIn_110_1;
                                            stackIn_111_2 = var5 + -var8;
                                            break L27;
                                          } else {
                                            stackIn_111_0 = (int[]) ((Object) stackIn_110_0);
                                            stackIn_111_1 = stackIn_110_1;
                                            stackIn_111_2 = var8 - var5;
                                            break L27;
                                          }
                                        }
                                        L28: {
                                          stackIn_111_0[stackIn_111_1] = stackIn_111_2;
                                          stackIn_113_0 = (int[]) (var14);

                                          stackIn_113_1 = var21;

                                          if (var6 > var9) {
                                            stackIn_114_0 = (int[]) ((Object) stackIn_113_0);
                                            stackIn_114_1 = stackIn_113_1;
                                            stackIn_114_2 = -var9 + var6;
                                            break L28;
                                          } else {
                                            stackIn_114_0 = (int[]) ((Object) stackIn_113_0);
                                            stackIn_114_1 = stackIn_113_1;
                                            stackIn_114_2 = -var6 + var9;
                                            break L28;
                                          }
                                        }
                                        stackIn_114_0[stackIn_114_1] = stackIn_114_2;
                                        var21++;
                                        continue L25;
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                    } else {
                      var12 = var33[0];
                      var13 = var33[1];
                      var14 = var33[2];
                      var52 = var51[0];
                      var53 = var50[0];
                      var54 = var50[1];
                      var55 = var51[1];
                      var56 = var50[2];
                      var57 = var51[2];
                      var21 = 0;
                      L29: while (true) {
                        if (hh.field_d <= var21) {
                          break L0;
                        } else {
                          L30: {
                            var7 = var52[var21];
                            var9 = var57[var21];
                            var8 = var55[var21];
                            stackIn_32_0 = (int[]) (var12);

                            stackIn_32_1 = var21;

                            if (-1 == (var7 ^ -1)) {
                              stackIn_33_0 = (int[]) ((Object) stackIn_32_0);
                              stackIn_33_1 = stackIn_32_1;
                              stackIn_33_2 = 4096;
                              break L30;
                            } else {
                              stackIn_33_0 = (int[]) ((Object) stackIn_32_0);
                              stackIn_33_1 = stackIn_32_1;
                              stackIn_33_2 = (var53[var21] << 192758508) / var7;
                              break L30;
                            }
                          }
                          L31: {
                            stackIn_33_0[stackIn_33_1] = stackIn_33_2;
                            stackIn_35_0 = (int[]) (var13);

                            stackIn_35_1 = var21;

                            if (0 != var8) {
                              stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                              stackIn_36_1 = stackIn_35_1;
                              stackIn_36_2 = (var54[var21] << 18274604) / var8;
                              break L31;
                            } else {
                              stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                              stackIn_36_1 = stackIn_35_1;
                              stackIn_36_2 = 4096;
                              break L31;
                            }
                          }
                          L32: {
                            stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                            stackIn_38_0 = (int[]) (var14);

                            stackIn_38_1 = var21;

                            if (-1 != (var9 ^ -1)) {
                              stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                              stackIn_39_1 = stackIn_38_1;
                              stackIn_39_2 = (var56[var21] << 191485708) / var9;
                              break L32;
                            } else {
                              stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                              stackIn_39_1 = stackIn_38_1;
                              stackIn_39_2 = 4096;
                              break L32;
                            }
                          }
                          stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                          var21++;
                          continue L29;
                        }
                      }
                    }
                  } else {
                    var12 = var33[0];
                    var13 = var33[1];
                    var14 = var33[2];
                    var52 = var51[0];
                    var53 = var50[0];
                    var54 = var50[1];
                    var55 = var51[1];
                    var56 = var50[2];
                    var57 = var51[2];
                    var21 = 0;
                    L33: while (true) {
                      if (hh.field_d <= var21) {
                        break L0;
                      } else {
                        var12[var21] = var53[var21] * var52[var21] >> 705008972;
                        var13[var21] = var54[var21] * var55[var21] >> -76271476;
                        var14[var21] = var56[var21] * var57[var21] >> 389459340;
                        var21++;
                        continue L33;
                      }
                    }
                  }
                }
              }
            }
          }
          return var3;
        } else {
          return (int[][]) null;
        }
    }

    final int[] a(int param0, int param1) {
        int[] stackIn_37_0 = null;
        int stackIn_37_1 = 0;
        int[] stackIn_38_0 = null;
        int stackIn_38_1 = 0;
        int stackIn_38_2 = 0;
        int[] stackIn_46_0 = null;
        int stackIn_46_1 = 0;
        int[] stackIn_47_0 = null;
        int stackIn_47_1 = 0;
        int stackIn_47_2 = 0;
        int[] stackIn_52_0 = null;
        int stackIn_52_1 = 0;
        int[] stackIn_53_0 = null;
        int stackIn_53_1 = 0;
        int stackIn_53_2 = 0;
        int[] stackIn_58_0 = null;
        int stackIn_58_1 = 0;
        int[] stackIn_59_0 = null;
        int stackIn_59_1 = 0;
        int stackIn_59_2 = 0;
        int[] stackIn_64_0 = null;
        int stackIn_64_1 = 0;
        int[] stackIn_65_0 = null;
        int stackIn_65_1 = 0;
        int stackIn_65_2 = 0;
        int[] stackIn_70_0 = null;
        int stackIn_70_1 = 0;
        int[] stackIn_71_0 = null;
        int stackIn_71_1 = 0;
        int stackIn_71_2 = 0;
        int[] stackIn_76_0 = null;
        int stackIn_76_1 = 0;
        int[] stackIn_77_0 = null;
        int stackIn_77_1 = 0;
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
        L0: {
          var9 = BachelorFridge.field_y;
          if (param1 == 0) {
            break L0;
          } else {
            var10 = (lu) null;
            this.a((byte) -21, (lu) null, -72);
            break L0;
          }
        }
        L1: {
          var11 = this.field_j.a(param0, param1 ^ -1);
          var3 = var11;
          if (!this.field_j.field_m) {
            break L1;
          } else {
            var19 = this.a(0, param0, (byte) 110);
            var18 = this.a(1, param0, (byte) 126);
            var8 = this.field_l;
            if (var8 != 1) {
              if (-3 != (var8 ^ -1)) {
                if (3 == var8) {
                  var8 = 0;
                  L2: while (true) {
                    if (hh.field_d <= var8) {
                      break L1;
                    } else {
                      var3[var8] = var18[var8] * var19[var8] >> -237371380;
                      var8++;
                      continue L2;
                    }
                  }
                } else {
                  if (-5 != (var8 ^ -1)) {
                    if (var8 != 5) {
                      if (-7 != (var8 ^ -1)) {
                        if ((var8 ^ -1) != -8) {
                          if (var8 != 8) {
                            if (var8 == 9) {
                              var8 = 0;
                              L3: while (true) {
                                if (var8 >= hh.field_d) {
                                  break L1;
                                } else {
                                  L4: {
                                    var5 = var18[var8];
                                    var4 = var19[var8];
                                    stackIn_64_0 = (int[]) (var3);

                                    stackIn_64_1 = var8;

                                    if (var5 <= var4) {
                                      stackIn_65_0 = (int[]) ((Object) stackIn_64_0);
                                      stackIn_65_1 = stackIn_64_1;
                                      stackIn_65_2 = var5;
                                      break L4;
                                    } else {
                                      stackIn_65_0 = (int[]) ((Object) stackIn_64_0);
                                      stackIn_65_1 = stackIn_64_1;
                                      stackIn_65_2 = var4;
                                      break L4;
                                    }
                                  }
                                  stackIn_65_0[stackIn_65_1] = stackIn_65_2;
                                  var8++;
                                  continue L3;
                                }
                              }
                            } else {
                              if (10 == var8) {
                                var8 = 0;
                                L5: while (true) {
                                  if (hh.field_d <= var8) {
                                    break L1;
                                  } else {
                                    L6: {
                                      var5 = var18[var8];
                                      var4 = var19[var8];
                                      stackIn_70_0 = (int[]) (var3);

                                      stackIn_70_1 = var8;

                                      if (var4 > var5) {
                                        stackIn_71_0 = (int[]) ((Object) stackIn_70_0);
                                        stackIn_71_1 = stackIn_70_1;
                                        stackIn_71_2 = var4;
                                        break L6;
                                      } else {
                                        stackIn_71_0 = (int[]) ((Object) stackIn_70_0);
                                        stackIn_71_1 = stackIn_70_1;
                                        stackIn_71_2 = var5;
                                        break L6;
                                      }
                                    }
                                    stackIn_71_0[stackIn_71_1] = stackIn_71_2;
                                    var8++;
                                    continue L5;
                                  }
                                }
                              } else {
                                if (var8 != 11) {
                                  if (-13 == (var8 ^ -1)) {
                                    var8 = 0;
                                    L7: while (true) {
                                      if (var8 >= hh.field_d) {
                                        break L1;
                                      } else {
                                        var5 = var18[var8];
                                        var4 = var19[var8];
                                        var3[var8] = -(var4 * var5 >> -2124802389) + var5 + var4;
                                        var8++;
                                        continue L7;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  var8 = 0;
                                  L8: while (true) {
                                    if (var8 >= hh.field_d) {
                                      break L1;
                                    } else {
                                      L9: {
                                        var4 = var19[var8];
                                        var5 = var18[var8];
                                        stackIn_76_0 = (int[]) (var3);

                                        stackIn_76_1 = var8;

                                        if (var5 < var4) {
                                          stackIn_77_0 = (int[]) ((Object) stackIn_76_0);
                                          stackIn_77_1 = stackIn_76_1;
                                          stackIn_77_2 = var4 - var5;
                                          break L9;
                                        } else {
                                          stackIn_77_0 = (int[]) ((Object) stackIn_76_0);
                                          stackIn_77_1 = stackIn_76_1;
                                          stackIn_77_2 = -var4 + var5;
                                          break L9;
                                        }
                                      }
                                      stackIn_77_0[stackIn_77_1] = stackIn_77_2;
                                      var8++;
                                      continue L8;
                                    }
                                  }
                                }
                              }
                            }
                          } else {
                            var8 = 0;
                            L10: while (true) {
                              if (var8 >= hh.field_d) {
                                break L1;
                              } else {
                                L11: {
                                  var4 = var19[var8];
                                  stackIn_58_0 = (int[]) (var3);

                                  stackIn_58_1 = var8;

                                  if (var4 == 0) {
                                    stackIn_59_0 = (int[]) ((Object) stackIn_58_0);
                                    stackIn_59_1 = stackIn_58_1;
                                    stackIn_59_2 = 0;
                                    break L11;
                                  } else {
                                    stackIn_59_0 = (int[]) ((Object) stackIn_58_0);
                                    stackIn_59_1 = stackIn_58_1;
                                    stackIn_59_2 = 4096 - (4096 + -var18[var8] << 1333615404) / var4;
                                    break L11;
                                  }
                                }
                                stackIn_59_0[stackIn_59_1] = stackIn_59_2;
                                var8++;
                                continue L10;
                              }
                            }
                          }
                        } else {
                          var8 = 0;
                          L12: while (true) {
                            if (var8 >= hh.field_d) {
                              break L1;
                            } else {
                              L13: {
                                var4 = var19[var8];
                                stackIn_52_0 = (int[]) (var3);

                                stackIn_52_1 = var8;

                                if (var4 == 4096) {
                                  stackIn_53_0 = (int[]) ((Object) stackIn_52_0);
                                  stackIn_53_1 = stackIn_52_1;
                                  stackIn_53_2 = 4096;
                                  break L13;
                                } else {
                                  stackIn_53_0 = (int[]) ((Object) stackIn_52_0);
                                  stackIn_53_1 = stackIn_52_1;
                                  stackIn_53_2 = (var18[var8] << -2131246420) / (-var4 + 4096);
                                  break L13;
                                }
                              }
                              stackIn_53_0[stackIn_53_1] = stackIn_53_2;
                              var8++;
                              continue L12;
                            }
                          }
                        }
                      } else {
                        var8 = 0;
                        L14: while (true) {
                          if (hh.field_d <= var8) {
                            break L1;
                          } else {
                            L15: {
                              var5 = var18[var8];
                              stackIn_46_0 = (int[]) (var3);

                              stackIn_46_1 = var8;

                              if (var5 < 2048) {
                                stackIn_47_0 = (int[]) ((Object) stackIn_46_0);
                                stackIn_47_1 = stackIn_46_1;
                                stackIn_47_2 = var19[var8] * var5 >> 663826603;
                                break L15;
                              } else {
                                stackIn_47_0 = (int[]) ((Object) stackIn_46_0);
                                stackIn_47_1 = stackIn_46_1;
                                stackIn_47_2 = 4096 - ((4096 - var19[var8]) * (4096 + -var5) >> 1243464075);
                                break L15;
                              }
                            }
                            stackIn_47_0[stackIn_47_1] = stackIn_47_2;
                            var8++;
                            continue L14;
                          }
                        }
                      }
                    } else {
                      var8 = 0;
                      L16: while (true) {
                        if (hh.field_d <= var8) {
                          break L1;
                        } else {
                          var3[var8] = -((4096 + -var18[var8]) * (-var19[var8] + 4096) >> -1355694900) + 4096;
                          var8++;
                          continue L16;
                        }
                      }
                    }
                  } else {
                    var8 = 0;
                    L17: while (true) {
                      if (hh.field_d <= var8) {
                        break L1;
                      } else {
                        L18: {
                          var5 = var18[var8];
                          stackIn_37_0 = (int[]) (var3);

                          stackIn_37_1 = var8;

                          if (-1 != (var5 ^ -1)) {
                            stackIn_38_0 = (int[]) ((Object) stackIn_37_0);
                            stackIn_38_1 = stackIn_37_1;
                            stackIn_38_2 = (var19[var8] << 889244364) / var5;
                            break L18;
                          } else {
                            stackIn_38_0 = (int[]) ((Object) stackIn_37_0);
                            stackIn_38_1 = stackIn_37_1;
                            stackIn_38_2 = 4096;
                            break L18;
                          }
                        }
                        stackIn_38_0[stackIn_38_1] = stackIn_38_2;
                        var8++;
                        continue L17;
                      }
                    }
                  }
                }
              } else {
                var8 = 0;
                L19: while (true) {
                  if (var8 >= hh.field_d) {
                    break L1;
                  } else {
                    var3[var8] = var19[var8] - var18[var8];
                    var8++;
                    continue L19;
                  }
                }
              }
            } else {
              var11 = var3;
              var8 = 0;
              L20: while (true) {
                if (var8 >= hh.field_d) {
                  break L1;
                } else {
                  var11[var8] = var18[var8] + var19[var8];
                  var8++;
                  continue L20;
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
