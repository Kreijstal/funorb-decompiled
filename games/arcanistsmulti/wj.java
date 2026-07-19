/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wj {
    static nb field_a;
    static kc field_b;
    private int[][] field_d;
    static String field_c;
    static String field_e;

    wj(int[] param0) {
        int[] array$9 = null;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        RuntimeException var2 = null;
        int[] var2_array = null;
        int var3_int = 0;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_16_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_15_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        var8 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            this.field_d = new int[512][];
            var2_array = new int[512];
            var3_int = 1;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var3_int ^ -1) <= (param0.length ^ -1)) {
                    break L3;
                  } else {
                    var4 = param0[var3_int];
                    var5 = ((14680064 & var4) >> 1192302895) + ((var4 >> -142225819 & 7) + ((var4 & 57344) >> 1368192074));
                    var2_array[var5] = var2_array[var5] + 1;
                    var3_int++;
                    if (var8 != 0) {
                      break L2;
                    } else {
                      if (var8 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var3_int = 1;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    if (param0.length <= var3_int) {
                      break L6;
                    } else {
                      var4 = param0[var3_int];
                      stackOut_9_0 = ((14680064 & var4) >> 395112527) + (56 & var4 >> 1384466186) + (7 & var4 >> -1225920187);
                      stackIn_16_0 = stackOut_9_0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var8 != 0) {
                        break L5;
                      } else {
                        L7: {
                          var5 = stackIn_10_0;
                          if (null == this.field_d[var5]) {
                            array$9 = new int[var2_array[var5]];
                            this.field_d[var5] = array$9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var2_array[var5] = var2_array[var5] - 1;
                        this.field_d[var5][var2_array[var5] - 1] = (var3_int << -1531773992) - -dg.a(var4, 16777215);
                        var3_int++;
                        if (var8 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  stackOut_15_0 = 512;
                  stackIn_16_0 = stackOut_15_0;
                  break L5;
                }
                var3 = new int[stackIn_16_0];
                var4 = 0;
                var5 = 0;
                var6 = var2_array;
                var7 = 0;
                L8: while (true) {
                  L9: {
                    L10: {
                      L11: {
                        if (512 <= var7) {
                          break L11;
                        } else {
                          if (var8 != 0) {
                            break L10;
                          } else {
                            L12: {
                              if (null != this.field_d[var7]) {
                                var6[var7] = 0;
                                incrementValue$10 = var5;
                                var5++;
                                var3[incrementValue$10] = var7;
                                break L12;
                              } else {
                                break L12;
                              }
                            }
                            var7++;
                            if (var8 == 0) {
                              continue L8;
                            } else {
                              break L11;
                            }
                          }
                        }
                      }
                      L13: while (true) {
                        if (var5 <= var4) {
                          break L10;
                        } else {
                          incrementValue$11 = var4;
                          var4++;
                          var7 = var3[511 & incrementValue$11];
                          if (var8 != 0) {
                            break L9;
                          } else {
                            L14: {
                              if ((var7 & 511 ^ -1) > -65) {
                                break L14;
                              } else {
                                if (!this.a(var7 + 131008, var6, var7, (byte) 114)) {
                                  break L14;
                                } else {
                                  incrementValue$12 = var5;
                                  var5++;
                                  var3[dg.a(incrementValue$12, 511)] = var7 + 131008;
                                  break L14;
                                }
                              }
                            }
                            L15: {
                              if ((var7 & 511 ^ -1) <= -449) {
                                break L15;
                              } else {
                                if (!this.a(131136 + var7, var6, var7, (byte) 114)) {
                                  break L15;
                                } else {
                                  incrementValue$13 = var5;
                                  var5++;
                                  var3[dg.a(511, incrementValue$13)] = var7 - -131136;
                                  break L15;
                                }
                              }
                            }
                            L16: {
                              if ((var7 & 63 ^ -1) > -9) {
                                break L16;
                              } else {
                                if (!this.a(262136 + var7, var6, var7, (byte) 114)) {
                                  break L16;
                                } else {
                                  incrementValue$14 = var5;
                                  var5++;
                                  var3[dg.a(incrementValue$14, 511)] = 262136 + var7;
                                  break L16;
                                }
                              }
                            }
                            L17: {
                              if (-57 >= (63 & var7 ^ -1)) {
                                break L17;
                              } else {
                                if (!this.a(var7 - -262152, var6, var7, (byte) 114)) {
                                  break L17;
                                } else {
                                  incrementValue$15 = var5;
                                  var5++;
                                  var3[dg.a(511, incrementValue$15)] = 262152 + var7;
                                  break L17;
                                }
                              }
                            }
                            L18: {
                              if (-1 <= (var7 & 7 ^ -1)) {
                                break L18;
                              } else {
                                if (this.a(65535 + var7, var6, var7, (byte) 114)) {
                                  incrementValue$16 = var5;
                                  var5++;
                                  var3[dg.a(511, incrementValue$16)] = var7 - -65535;
                                  break L18;
                                } else {
                                  break L18;
                                }
                              }
                            }
                            L19: {
                              if ((var7 & 7) >= 7) {
                                break L19;
                              } else {
                                if (!this.a(var7 - -65537, var6, var7, (byte) 114)) {
                                  break L19;
                                } else {
                                  incrementValue$17 = var5;
                                  var5++;
                                  var3[dg.a(511, incrementValue$17)] = var7 - -65537;
                                  break L19;
                                }
                              }
                            }
                            if (var8 == 0) {
                              continue L13;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                    }
                    break L9;
                  }
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L20: {
            var2 = decompiledCaughtException;
            stackOut_69_0 = (RuntimeException) (var2);
            stackOut_69_1 = new StringBuilder().append("wj.<init>(");
            stackIn_72_0 = stackOut_69_0;
            stackIn_72_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L20;
            } else {
              stackOut_70_0 = (RuntimeException) ((Object) stackIn_70_0);
              stackOut_70_1 = (StringBuilder) ((Object) stackIn_70_1);
              stackOut_70_2 = "{...}";
              stackIn_73_0 = stackOut_70_0;
              stackIn_73_1 = stackOut_70_1;
              stackIn_73_2 = stackOut_70_2;
              break L20;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_73_0), stackIn_73_2 + ')');
        }
    }

    final static void a(qb[] param0, int param1, int param2, int param3, int param4, int param5, boolean param6, int param7, qb[] param8, int param9, int param10, int param11, dj param12, dj param13, int param14) {
        RuntimeException var15 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          L0: {
            L1: {
              gh.a(p.field_c, param13, param9, param12, param1, param5, to.field_m, 480, param7, 0, 0, param3, (qb[]) null, param14, param11, (byte) -105, param4, param0, sl.field_T, param8, param10);
              if (param2 >= 108) {
                break L1;
              } else {
                wj.a(-97);
                break L1;
              }
            }
            nb.a(param6, 5);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var15 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) (var15);
            stackOut_5_1 = new StringBuilder().append("wj.B(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackOut_6_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) ((Object) stackIn_9_0);
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param8 == null) {
              stackOut_12_0 = (RuntimeException) ((Object) stackIn_12_0);
              stackOut_12_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) ((Object) stackIn_10_0);
              stackOut_10_1 = (StringBuilder) ((Object) stackIn_10_1);
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) ((Object) stackIn_13_0);
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param12 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
            stackOut_17_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_17_2).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param13 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackOut_18_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param14 + ')');
        }
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_e = null;
              field_a = null;
              if (param0 == 0) {
                break L1;
              } else {
                field_b = (kc) null;
                break L1;
              }
            }
            field_c = null;
            field_b = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "wj.C(" + param0 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_9_1 = 0;
        int stackIn_15_0 = 0;
        int stackIn_15_1 = 0;
        int stackIn_16_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_8_1 = 0;
        int stackOut_14_0 = 0;
        int stackOut_14_1 = 0;
        int stackOut_15_0 = 0;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 0) {
              stackOut_4_0 = 0;
              stackIn_5_0 = stackOut_4_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var3_int = (param0 >> -781171510 & 56) + ((param0 >> -677401275 & 7) - -(param0 >> -1863712049 & 448));
              var4 = this.field_d[var3_int];
              var5 = var4[0];
              var6 = (param1 & var5 >> 10067951) + ((var5 >> 383057382 & 1020) + (255 & var5));
              var7 = 1;
              L1: while (true) {
                L2: {
                  L3: {
                    if ((var7 ^ -1) <= (var4.length ^ -1)) {
                      break L3;
                    } else {
                      var8 = var4[var7];
                      var9 = (var8 & 255) - (-(var8 >> -909355930 & 1020) - (510 & var8 >> 958333871));
                      stackOut_8_0 = var6 ^ -1;
                      stackOut_8_1 = var9 ^ -1;
                      stackIn_15_0 = stackOut_8_0;
                      stackIn_15_1 = stackOut_8_1;
                      stackIn_9_0 = stackOut_8_0;
                      stackIn_9_1 = stackOut_8_1;
                      if (var10 != 0) {
                        break L2;
                      } else {
                        L4: {
                          if (stackIn_9_0 >= stackIn_9_1) {
                            break L4;
                          } else {
                            var6 = var9;
                            var5 = var8;
                            break L4;
                          }
                        }
                        var7++;
                        if (var10 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = var5;
                  stackOut_14_1 = 473841784;
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  break L2;
                }
                stackOut_15_0 = stackIn_15_0 >>> stackIn_15_1;
                stackIn_16_0 = stackOut_15_0;
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3), "wj.A(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          return stackIn_16_0;
        }
    }

    final static boolean a(String param0, int[] param1, int param2, int param3, long param4) {
        RuntimeException var6 = null;
        int stackIn_2_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_1_0 = 0;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        try {
          L0: {
            if (param3 == 2) {
              L1: {
                L2: {
                  if (null == param1) {
                    break L2;
                  } else {
                    L3: {
                      if (2 != param2) {
                        break L3;
                      } else {
                        if (!kg.a(param4, true, param0)) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                    stackOut_10_0 = 1;
                    stackIn_13_0 = stackOut_10_0;
                    break L1;
                  }
                }
                stackOut_12_0 = 0;
                stackIn_13_0 = stackOut_12_0;
                break L1;
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              stackOut_1_0 = 1;
              stackIn_2_0 = stackOut_1_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var6);
            stackOut_14_1 = new StringBuilder().append("wj.E(");
            stackIn_17_0 = stackOut_14_0;
            stackIn_17_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_18_0 = stackOut_15_0;
              stackIn_18_1 = stackOut_15_1;
              stackIn_18_2 = stackOut_15_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',');
            stackIn_21_0 = stackOut_18_0;
            stackIn_21_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param1 == null) {
              stackOut_21_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackOut_21_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackOut_21_2 = "null";
              stackIn_22_0 = stackOut_21_0;
              stackIn_22_1 = stackOut_21_1;
              stackIn_22_2 = stackOut_21_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_22_0 = stackOut_19_0;
              stackIn_22_1 = stackOut_19_1;
              stackIn_22_2 = stackOut_19_2;
              break L5;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_2_0 != 0;
        } else {
          return stackIn_13_0 != 0;
        }
    }

    private final boolean a(int param0, int[] param1, int param2, byte param3) {
        RuntimeException var5 = null;
        int stackIn_10_0 = 0;
        int stackIn_12_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_11_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3 == 114) {
                break L1;
              } else {
                field_c = (String) null;
                break L1;
              }
            }
            L2: {
              if (this.field_d[511 & param0] == null) {
                break L2;
              } else {
                if ((param1[511 & param0] ^ -1) < (param0 ^ -1)) {
                  break L2;
                } else {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            this.field_d[dg.a(param0, 511)] = this.field_d[dg.a(511, param2)];
            param1[dg.a(param0, 511)] = param0;
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) (var5);
            stackOut_13_1 = new StringBuilder().append("wj.D(").append(param0).append(',');
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_14_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackOut_14_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L3;
            }
          }
          throw aa.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param2 + ',' + param3 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          return stackIn_12_0 != 0;
        }
    }

    static {
        field_c = "This password contains your email address, and would be easy to guess";
        field_e = "Elements Installed";
        field_a = new nb();
    }
}
