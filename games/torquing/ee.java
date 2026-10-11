/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends am {
    static int[] field_t;
    private int field_u;
    static int field_v;
    static boolean field_s;

    final int[] a(byte param0, int param1) {
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
        var9 = Torquing.field_u;
        var10 = this.field_l.a(param1, 25657);
        var3 = var10;
        if (param0 < 86) {
          this.field_u = 108;
        }
        if (this.field_l.field_b) {
          var17 = this.b(0, 0, param1);
          var18 = this.b(0, 1, param1);
          var8 = this.field_u;
          if (var8 == 1) {
            var10Lifetime1 = var3;
            for (var8 = 0; var8 < ci.field_c; var8++) {
              var10Lifetime1[var8] = var17[var8] + var18[var8];
            }
          } else {
            if (var8 == 2) {
              var10Lifetime1 = var3;
              for (var8 = 0; var8 < ci.field_c; var8++) {
                var10Lifetime1[var8] = -var18[var8] + var17[var8];
              }
            } else {
              if (var8 == 3) {
                var10Lifetime1 = var3;
                for (var8 = 0; var8 < ci.field_c; var8++) {
                  var10Lifetime1[var8] = var17[var8] * var18[var8] >> 12;
                }
              } else {
                if (var8 == 4) {
                  var10Lifetime1 = var3;
                  for (var8 = 0; var8 < ci.field_c; var8++) {
                    var5 = var18[var8];
                    stackIn_34_0 = var10Lifetime1;
                    stackIn_34_1 = var8;
                    if (var5 != 0) {
                      stackIn_35_2 = (var17[var8] << 12) / var5;
                    } else {
                      stackIn_35_2 = 4096;
                    }
                    stackIn_34_0[stackIn_34_1] = stackIn_35_2;
                  }
                } else {
                  if (var8 == 5) {
                    for (var8 = 0; var8 < ci.field_c; var8++) {
                      var3[var8] = 4096 - ((4096 - var18[var8]) * (4096 - var17[var8]) >> 12);
                    }
                  } else {
                    if (var8 == 6) {
                      for (var8 = 0; ci.field_c > var8; var8++) {
                        var5 = var18[var8];
                        stackIn_43_0 = var3;
                        stackIn_43_1 = var8;
                        if (2048 <= var5) {
                          stackIn_44_2 = 4096 - ((4096 - var5) * (-var17[var8] + 4096) >> 11);
                        } else {
                          stackIn_44_2 = var5 * var17[var8] >> 11;
                        }
                        stackIn_43_0[stackIn_43_1] = stackIn_44_2;
                      }
                    } else {
                      if (var8 == 7) {
                        for (var8 = 0; var8 < ci.field_c; var8++) {
                          var4 = var17[var8];
                          stackIn_49_0 = var3;
                          stackIn_49_1 = var8;
                          if (var4 == 4096) {
                            stackIn_50_2 = 4096;
                          } else {
                            stackIn_50_2 = (var18[var8] << 12) / (4096 - var4);
                          }
                          stackIn_49_0[stackIn_49_1] = stackIn_50_2;
                        }
                      } else {
                        if (8 == var8) {
                          for (var8 = 0; var8 < ci.field_c; var8++) {
                            var4 = var17[var8];
                            stackIn_55_0 = var3;
                            stackIn_55_1 = var8;
                            if (var4 != 0) {
                              stackIn_56_2 = 4096 - (4096 - var18[var8] << 12) / var4;
                            } else {
                              stackIn_56_2 = 0;
                            }
                            stackIn_55_0[stackIn_55_1] = stackIn_56_2;
                          }
                        } else {
                          if (var8 == 9) {
                            for (var8 = 0; var8 < ci.field_c; var8++) {
                              var5 = var18[var8];
                              var4 = var17[var8];
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
                              for (var8 = 0; ci.field_c > var8; var8++) {
                                var5 = var18[var8];
                                var4 = var17[var8];
                                stackIn_67_0 = var3;
                                stackIn_67_1 = var8;
                                if (var5 < var4) {
                                  stackIn_68_2 = var4;
                                } else {
                                  stackIn_68_2 = var5;
                                }
                                stackIn_67_0[stackIn_67_1] = stackIn_68_2;
                              }
                            } else {
                              if (11 == var8) {
                                for (var8 = 0; var8 < ci.field_c; var8++) {
                                  var4 = var17[var8];
                                  var5 = var18[var8];
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
                                  for (var8 = 0; var8 < ci.field_c; var8++) {
                                    var4 = var17[var8];
                                    var5 = var18[var8];
                                    var3[var8] = var5 + (var4 - (var5 * var4 >> 11));
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

    final static long[] b(int param0) {
        ii var2 = null;
        long[] var3 = null;
        int var4 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int incrementValue$3 = 0;
        int incrementValue$4 = 0;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int var5 = Torquing.field_u;
        int var1 = 108 % ((-51 - param0) / 63);
        if (lc.field_z > 0) {
          lc.field_z = lc.field_z - 1;
          var2 = (ii) (bd.field_s.a((byte) 106));
          bp.field_a.a((byte) 54, var2);
          var3 = var2.field_l;
          var2.field_l = null;
          var4 = 0;
          while (var4 < 64) {
            incrementValue$0 = var4;
            var4++;
            var3[incrementValue$0] = 0L;
            incrementValue$1 = var4;
            var4++;
            var3[incrementValue$1] = 0L;
            incrementValue$2 = var4;
            var4++;
            var3[incrementValue$2] = 0L;
            incrementValue$3 = var4;
            var4++;
            var3[incrementValue$3] = 0L;
            incrementValue$4 = var4;
            var4++;
            var3[incrementValue$4] = 0L;
            incrementValue$5 = var4;
            var4++;
            var3[incrementValue$5] = 0L;
            incrementValue$6 = var4;
            var4++;
            var3[incrementValue$6] = 0L;
            incrementValue$7 = var4;
            var4++;
            var3[incrementValue$7] = 0L;
          }
          return var3;
        }
        return new long[64];
    }

    public static void g(byte param0) {
        field_t = null;
        if (param0 >= -59) {
          ee.b(115);
        }
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(boolean param0) {
        byte[] var3 = null;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        if (ha.field_b != null) {
          var1 = ha.field_b;
          synchronized (var1) {
            ha.field_b = null;
          }
        }
        if (!param0) {
          var3 = (byte[]) null;
          ee.a((byte[]) null, 74);
        }
    }

    final int[][] a(int param0, int param1) {
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
        var22 = Torquing.field_u;
        if (param0 != -29116) {
          this.field_u = -9;
        }
        var33 = this.field_r.a(15142, param1);
        var24 = var33;
        var23 = var24;
        var3 = var23;
        if (this.field_r.field_b) {
          var50 = this.c(param0 + 53182, param1, 0);
          var51 = this.c(param0 + 53182, param1, 1);
          var12 = var33[0];
          var13 = var33[1];
          var14 = var33[2];
          var53 = var50[0];
          var55 = var50[1];
          var57 = var50[2];
          var52 = var51[0];
          var54 = var51[1];
          var56 = var51[2];
          var21 = this.field_u;
          if (1 == var21) {
            var12Lifetime1 = var33[0];
            var13Lifetime1 = var33[1];
            var14Lifetime1 = var33[2];
            var52Lifetime1 = var51[0];
            var53Lifetime1 = var50[0];
            var54Lifetime1 = var51[1];
            var55Lifetime1 = var50[1];
            var56Lifetime1 = var51[2];
            var57Lifetime1 = var50[2];
            for (var21 = 0; var21 < ci.field_c; var21++) {
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
              var54Lifetime1 = var51[1];
              var55Lifetime1 = var50[1];
              var56Lifetime1 = var51[2];
              var57Lifetime1 = var50[2];
              for (var21 = 0; var21 < ci.field_c; var21++) {
                var12Lifetime1[var21] = var53Lifetime1[var21] - var52Lifetime1[var21];
                var13Lifetime1[var21] = -var54Lifetime1[var21] + var55Lifetime1[var21];
                var14Lifetime1[var21] = var57Lifetime1[var21] - var56Lifetime1[var21];
              }
            } else {
              if (var21 == 3) {
                var12Lifetime1 = var33[0];
                var13Lifetime1 = var33[1];
                var14Lifetime1 = var33[2];
                var52Lifetime1 = var51[0];
                var53Lifetime1 = var50[0];
                var54Lifetime1 = var51[1];
                var55Lifetime1 = var50[1];
                var56Lifetime1 = var51[2];
                var57Lifetime1 = var50[2];
                for (var21 = 0; ci.field_c > var21; var21++) {
                  var12Lifetime1[var21] = var52Lifetime1[var21] * var53Lifetime1[var21] >> 12;
                  var13Lifetime1[var21] = var55Lifetime1[var21] * var54Lifetime1[var21] >> 12;
                  var14Lifetime1[var21] = var57Lifetime1[var21] * var56Lifetime1[var21] >> 12;
                }
              } else {
                if (var21 == 4) {
                  var12Lifetime1 = var33[0];
                  var13Lifetime1 = var33[1];
                  var14Lifetime1 = var33[2];
                  var52Lifetime1 = var51[0];
                  var53Lifetime1 = var50[0];
                  var54Lifetime1 = var51[1];
                  var55Lifetime1 = var50[1];
                  var56Lifetime1 = var51[2];
                  var57Lifetime1 = var50[2];
                  for (var21 = 0; ci.field_c > var21; var21++) {
                    var9 = var56Lifetime1[var21];
                    var8 = var54Lifetime1[var21];
                    var7 = var52Lifetime1[var21];
                    stackIn_35_0 = var12Lifetime1;
                    stackIn_35_1 = var21;
                    if (0 != var7) {
                      stackIn_36_2 = (var53Lifetime1[var21] << 12) / var7;
                    } else {
                      stackIn_36_2 = 4096;
                    }
                    stackIn_35_0[stackIn_35_1] = stackIn_36_2;
                    stackIn_38_0 = var13Lifetime1;
                    stackIn_38_1 = var21;
                    if (0 == var8) {
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
                    var52Lifetime1 = var51[0];
                    var53Lifetime1 = var50[0];
                    var54Lifetime1 = var51[1];
                    var55Lifetime1 = var50[1];
                    var56Lifetime1 = var51[2];
                    var57Lifetime1 = var50[2];
                    for (var21 = 0; var21 < ci.field_c; var21++) {
                      var12Lifetime1[var21] = 4096 - ((4096 - var53Lifetime1[var21]) * (-var52Lifetime1[var21] + 4096) >> 12);
                      var13Lifetime1[var21] = -((4096 - var55Lifetime1[var21]) * (-var54Lifetime1[var21] + 4096) >> 12) + 4096;
                      var14Lifetime1[var21] = -((-var57Lifetime1[var21] + 4096) * (4096 - var56Lifetime1[var21]) >> 12) + 4096;
                    }
                  } else {
                    if (var21 == 6) {
                      var12Lifetime1 = var33[0];
                      var13Lifetime1 = var33[1];
                      var14Lifetime1 = var33[2];
                      var52Lifetime1 = var51[0];
                      var53Lifetime1 = var50[0];
                      var54Lifetime1 = var51[1];
                      var55Lifetime1 = var50[1];
                      var56Lifetime1 = var51[2];
                      var57Lifetime1 = var50[2];
                      for (var21 = 0; var21 < ci.field_c; var21++) {
                        var9 = var56Lifetime1[var21];
                        var7 = var52Lifetime1[var21];
                        var8 = var54Lifetime1[var21];
                        stackIn_50_0 = var12Lifetime1;
                        stackIn_50_1 = var21;
                        if (var7 >= 2048) {
                          stackIn_51_2 = 4096 - ((4096 - var7) * (-var53Lifetime1[var21] + 4096) >> 11);
                        } else {
                          stackIn_51_2 = var7 * var53Lifetime1[var21] >> 11;
                        }
                        stackIn_50_0[stackIn_50_1] = stackIn_51_2;
                        stackIn_53_0 = var13Lifetime1;
                        stackIn_53_1 = var21;
                        if (2048 <= var8) {
                          stackIn_54_2 = -((4096 - var8) * (4096 - var55Lifetime1[var21]) >> 11) + 4096;
                        } else {
                          stackIn_54_2 = var55Lifetime1[var21] * var8 >> 11;
                        }
                        stackIn_53_0[stackIn_53_1] = stackIn_54_2;
                        stackIn_56_0 = var14Lifetime1;
                        stackIn_56_1 = var21;
                        if (var9 < 2048) {
                          stackIn_57_2 = var9 * var57Lifetime1[var21] >> 11;
                        } else {
                          stackIn_57_2 = -((4096 - var9) * (4096 - var57Lifetime1[var21]) >> 11) + 4096;
                        }
                        stackIn_56_0[stackIn_56_1] = stackIn_57_2;
                      }
                    } else {
                      if (var21 == 7) {
                        var12Lifetime1 = var33[0];
                        var13Lifetime1 = var33[1];
                        var14Lifetime1 = var33[2];
                        var52Lifetime1 = var51[0];
                        var53Lifetime1 = var50[0];
                        var54Lifetime1 = var51[1];
                        var55Lifetime1 = var50[1];
                        var56Lifetime1 = var51[2];
                        var57Lifetime1 = var50[2];
                        for (var21 = 0; var21 < ci.field_c; var21++) {
                          var5 = var55Lifetime1[var21];
                          var6 = var57Lifetime1[var21];
                          var4 = var53Lifetime1[var21];
                          stackIn_62_0 = var12Lifetime1;
                          stackIn_62_1 = var21;
                          if (var4 == 4096) {
                            stackIn_63_2 = 4096;
                          } else {
                            stackIn_63_2 = (var52Lifetime1[var21] << 12) / (4096 - var4);
                          }
                          stackIn_62_0[stackIn_62_1] = stackIn_63_2;
                          stackIn_65_0 = var13Lifetime1;
                          stackIn_65_1 = var21;
                          if (var5 != 4096) {
                            stackIn_66_2 = (var54Lifetime1[var21] << 12) / (4096 - var5);
                          } else {
                            stackIn_66_2 = 4096;
                          }
                          stackIn_65_0[stackIn_65_1] = stackIn_66_2;
                          stackIn_68_0 = var14Lifetime1;
                          stackIn_68_1 = var21;
                          if (var6 != 4096) {
                            stackIn_69_2 = (var56Lifetime1[var21] << 12) / (4096 - var6);
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
                          var52Lifetime1 = var51[0];
                          var53Lifetime1 = var50[0];
                          var54Lifetime1 = var51[1];
                          var55Lifetime1 = var50[1];
                          var56Lifetime1 = var51[2];
                          var57Lifetime1 = var50[2];
                          for (var21 = 0; var21 < ci.field_c; var21++) {
                            var6 = var57Lifetime1[var21];
                            var5 = var55Lifetime1[var21];
                            var4 = var53Lifetime1[var21];
                            stackIn_74_0 = var12Lifetime1;
                            stackIn_74_1 = var21;
                            if (var4 == 0) {
                              stackIn_75_2 = 0;
                            } else {
                              stackIn_75_2 = -((-var52Lifetime1[var21] + 4096 << 12) / var4) + 4096;
                            }
                            stackIn_74_0[stackIn_74_1] = stackIn_75_2;
                            stackIn_77_0 = var13Lifetime1;
                            stackIn_77_1 = var21;
                            if (var5 != 0) {
                              stackIn_78_2 = -((4096 - var54Lifetime1[var21] << 12) / var5) + 4096;
                            } else {
                              stackIn_78_2 = 0;
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
                            var52Lifetime1 = var51[0];
                            var53Lifetime1 = var50[0];
                            var54Lifetime1 = var51[1];
                            var55Lifetime1 = var50[1];
                            var56Lifetime1 = var51[2];
                            var57Lifetime1 = var50[2];
                            for (var21 = 0; ci.field_c > var21; var21++) {
                              var4 = var53Lifetime1[var21];
                              var6 = var57Lifetime1[var21];
                              var8 = var54Lifetime1[var21];
                              var5 = var55Lifetime1[var21];
                              var7 = var52Lifetime1[var21];
                              var9 = var56Lifetime1[var21];
                              stackIn_86_0 = var12Lifetime1;
                              stackIn_86_1 = var21;
                              if (var7 > var4) {
                                stackIn_87_2 = var4;
                              } else {
                                stackIn_87_2 = var7;
                              }
                              stackIn_86_0[stackIn_86_1] = stackIn_87_2;
                              stackIn_89_0 = var13Lifetime1;
                              stackIn_89_1 = var21;
                              if (var5 < var8) {
                                stackIn_90_2 = var5;
                              } else {
                                stackIn_90_2 = var8;
                              }
                              stackIn_89_0[stackIn_89_1] = stackIn_90_2;
                              stackIn_92_0 = var14Lifetime1;
                              stackIn_92_1 = var21;
                              if (var6 < var9) {
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
                              var52Lifetime1 = var51[0];
                              var53Lifetime1 = var50[0];
                              var54Lifetime1 = var51[1];
                              var55Lifetime1 = var50[1];
                              var56Lifetime1 = var51[2];
                              var57Lifetime1 = var50[2];
                              for (var21 = 0; var21 < ci.field_c; var21++) {
                                var7 = var52Lifetime1[var21];
                                var6 = var57Lifetime1[var21];
                                var9 = var56Lifetime1[var21];
                                var8 = var54Lifetime1[var21];
                                var5 = var55Lifetime1[var21];
                                var4 = var53Lifetime1[var21];
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
                                if (var9 >= var6) {
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
                                var52Lifetime1 = var51[0];
                                var53Lifetime1 = var50[0];
                                var54Lifetime1 = var51[1];
                                var55Lifetime1 = var50[1];
                                var56Lifetime1 = var51[2];
                                var57Lifetime1 = var50[2];
                                for (var21 = 0; ci.field_c > var21; var21++) {
                                  var9 = var56Lifetime1[var21];
                                  var6 = var57Lifetime1[var21];
                                  var8 = var54Lifetime1[var21];
                                  var5 = var55Lifetime1[var21];
                                  var7 = var52Lifetime1[var21];
                                  var4 = var53Lifetime1[var21];
                                  stackIn_110_0 = var12Lifetime1;
                                  stackIn_110_1 = var21;
                                  if (var7 >= var4) {
                                    stackIn_111_2 = var7 - var4;
                                  } else {
                                    stackIn_111_2 = -var7 + var4;
                                  }
                                  stackIn_110_0[stackIn_110_1] = stackIn_111_2;
                                  stackIn_113_0 = var13Lifetime1;
                                  stackIn_113_1 = var21;
                                  if (var8 >= var5) {
                                    stackIn_114_2 = var8 - var5;
                                  } else {
                                    stackIn_114_2 = var5 - var8;
                                  }
                                  stackIn_113_0[stackIn_113_1] = stackIn_114_2;
                                  stackIn_116_0 = var14Lifetime1;
                                  stackIn_116_1 = var21;
                                  if (var9 >= var6) {
                                    stackIn_117_2 = var9 - var6;
                                  } else {
                                    stackIn_117_2 = var6 - var9;
                                  }
                                  stackIn_116_0[stackIn_116_1] = stackIn_117_2;
                                }
                              } else {
                                if (var21 == 12) {
                                  var12Lifetime1 = var33[0];
                                  var13Lifetime1 = var33[1];
                                  var14Lifetime1 = var33[2];
                                  var52Lifetime1 = var51[0];
                                  var53Lifetime1 = var50[0];
                                  var54Lifetime1 = var51[1];
                                  var55Lifetime1 = var50[1];
                                  var56Lifetime1 = var51[2];
                                  var57Lifetime1 = var50[2];
                                  for (var21 = 0; ci.field_c > var21; var21++) {
                                    var8 = var54Lifetime1[var21];
                                    var4 = var53Lifetime1[var21];
                                    var5 = var55Lifetime1[var21];
                                    var6 = var57Lifetime1[var21];
                                    var9 = var56Lifetime1[var21];
                                    var7 = var52Lifetime1[var21];
                                    var12Lifetime1[var21] = -(var7 * var4 >> 11) + var4 + var7;
                                    var13Lifetime1[var21] = var8 + (var5 - (var5 * var8 >> 11));
                                    var14Lifetime1[var21] = var6 + var9 - (var9 * var6 >> 11);
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

    final static li a(byte[] param0, int param1) {
        li var2 = null;
        RuntimeException var2_ref = null;
        li stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = new li(param0, fj.field_o, na.field_G, vo.field_b, ij.field_o, cq.field_y, pn.field_b);
          if (param1 != 7028) {
            ee.a(false);
          }
          go.b(param1 - 7028);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ee.A(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_u = param0.i((byte) -101);
          } else {
            if (var4_int == 1) {
              stackIn_7_1 = (param0.i((byte) -101) == 1);
              this.field_p = stackIn_7_1;
            }
          }
          if (param1 != 35) {
            ee.a(false);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_13_0 = var4;
          stackIn_13_1 = new StringBuilder().append("ee.H(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public ee() {
        super(2, false);
        this.field_u = 6;
    }

    final static void a(boolean param0, double[] param1, double[] param2, double param3, double param4, int param5) {
        double[] dupTemp$3 = null;
        double[] dupTemp$4 = null;
        double[] dupTemp$5 = null;
        double[] dupTemp$6 = null;
        double[] dupTemp$7 = null;
        double[] dupTemp$8 = null;
        int var9 = 0;
        double[] dupTemp$0 = null;
        double dupTemp$1 = 0.0;
        double[] arrayValue$2 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        double var9_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        double[] var12 = null;
        double[] var13 = null;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var8_intLifetime3;
        var11 = Torquing.field_u;
        try {
          for (var8_int = 0; var8_int < ia.field_i; var8_int++) {
            dg.field_f[var8_int] = new double[3];
            field_t[var8_int] = hj.a(param2, dg.field_f[var8_int], 0, ie.field_a[var8_int], param4, param3, bn.field_f[var8_int], param0, param1, var8_int);
            var9_double = Math.sqrt(ap.a(ie.field_a[var8_int], 0, ie.field_a[var8_int], 0));
            if (0.0 != var9_double) {
              dupTemp$3 = ie.field_a[var8_int];
              dupTemp$3[0] = dupTemp$3[0] / var9_double;
              dupTemp$4 = ie.field_a[var8_int];
              dupTemp$4[1] = dupTemp$4[1] / var9_double;
              dupTemp$5 = ie.field_a[var8_int];
              dupTemp$5[2] = dupTemp$5[2] / var9_double;
              dupTemp$6 = dg.field_f[var8_int];
              dupTemp$6[0] = dupTemp$6[0] / var9_double;
              dupTemp$7 = dg.field_f[var8_int];
              dupTemp$7[1] = dupTemp$7[1] / var9_double;
              dupTemp$8 = dg.field_f[var8_int];
              dupTemp$8[2] = dupTemp$8[2] / var9_double;
            }
            go.field_w[var8_int] = -var9_double;
            vf.field_e[var8_int] = (-param3 + bn.field_f[var8_int][3]) / param4;
          }
          bd.field_y = Math.sqrt(ap.a(param2, 3, param2, 3));
          vf.field_e[8] = -bd.field_y;
          if (param5 < 44) {
            field_s = true;
          }
          if (bd.field_y != 0.0) {
            ia.field_d = param2[5] / bd.field_y;
            mc.field_m = param2[4] / bd.field_y;
            tf.field_c = param2[3] / bd.field_y;
          } else {
            tf.field_c = 0.0;
            mc.field_m = 0.0;
            ia.field_d = 0.0;
          }
          for (var8_intLifetime1 = 0; ia.field_i > var8_intLifetime1; var8_intLifetime1++) {
            for (var9 = 0; ia.field_i > var9; var9++) {
              jl.field_O[var8_intLifetime1][var9] = ap.a(ie.field_a[var8_intLifetime1], 0, ie.field_a[var9], 0);
              mg.field_a[var8_intLifetime1][var9] = ap.a(bn.field_f[var8_intLifetime1], 6, bn.field_f[var9], 6);
            }
            var12 = jl.field_O[var8_intLifetime1];
            var10 = var8_intLifetime1;
            mg.field_a[var8_intLifetime1][var8_intLifetime1] = 1.0;
            var12[var10] = 1.0;
          }
          for (var8_intLifetime2 = 0; var8_intLifetime2 < ia.field_i; var8_intLifetime2++) {
            dupTemp$0 = mg.field_a[8];
            dupTemp$1 = mc.field_m * bn.field_f[var8_intLifetime2][7] + tf.field_c * bn.field_f[var8_intLifetime2][6] + bn.field_f[var8_intLifetime2][8] * ia.field_d;
            arrayValue$2 = mg.field_a[var8_intLifetime2];
            dupTemp$0[var8_intLifetime2] = dupTemp$1;
            arrayValue$2[8] = dupTemp$1;
          }
          for (var8_intLifetime3 = ia.field_i; var8_intLifetime3 < 8; var8_intLifetime3++) {
            var13 = mg.field_a[var8_intLifetime3];
            mg.field_a[8][var8_intLifetime3] = 0.0;
            var13[8] = 0.0;
          }
          mg.field_a[8][8] = 1.0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_28_0 = var8;
          stackIn_28_1 = new StringBuilder().append("ee.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          stackIn_31_1 = ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',');
          if (param2 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_t = new int[8];
        field_v = 0;
    }
}
