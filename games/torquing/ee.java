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
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int[] var3;
        int var4;
        int var5;
        int var8;
        int var9;
        int[] var10;
        int[] var17;
        int[] var18;
        L0: {
          var9 = Torquing.field_u;
          var10 = this.field_l.a(param1, 25657);
          var3 = var10;
          if (param0 >= 86) {
            break L0;
          } else {
            this.field_u = 108;
            break L0;
          }
        }
        L1: {
          if (this.field_l.field_b) {
            var17 = this.b(0, 0, param1);
            var18 = this.b(0, 1, param1);
            var8 = this.field_u;
            if ((var8 ^ -1) == -2) {
              var10 = var3;
              var8 = 0;
              L2: while (true) {
                if (var8 >= ci.field_c) {
                  break L1;
                } else {
                  var10[var8] = var17[var8] - -var18[var8];
                  var8++;
                  continue L2;
                }
              }
            } else {
              if (var8 == 2) {
                var10 = var3;
                var8 = 0;
                L3: while (true) {
                  if (var8 >= ci.field_c) {
                    break L1;
                  } else {
                    var10[var8] = -var18[var8] + var17[var8];
                    var8++;
                    continue L3;
                  }
                }
              } else {
                if ((var8 ^ -1) == -4) {
                  var10 = var3;
                  var8 = 0;
                  L4: while (true) {
                    if (var8 >= ci.field_c) {
                      break L1;
                    } else {
                      var10[var8] = var17[var8] * var18[var8] >> 1226368172;
                      var8++;
                      continue L4;
                    }
                  }
                } else {
                  if (var8 != 4) {
                    if ((var8 ^ -1) == -6) {
                      var8 = 0;
                      L5: while (true) {
                        if (var8 >= ci.field_c) {
                          break L1;
                        } else {
                          var3[var8] = 4096 - ((4096 + -var18[var8]) * (4096 + -var17[var8]) >> 391809580);
                          var8++;
                          continue L5;
                        }
                      }
                    } else {
                      if (var8 == 6) {
                        var8 = 0;
                        L6: while (true) {
                          if (ci.field_c <= var8) {
                            break L1;
                          } else {
                            L7: {
                              var5 = var18[var8];
                              stackIn_43_0 = (int[]) (var3);

                              stackIn_43_1 = var8;

                              if (2048 <= var5) {
                                stackIn_44_0 = (int[]) ((Object) stackIn_43_0);
                                stackIn_44_1 = stackIn_43_1;
                                stackIn_44_2 = 4096 + -((4096 + -var5) * (-var17[var8] + 4096) >> 230472235);
                                break L7;
                              } else {
                                stackIn_44_0 = (int[]) ((Object) stackIn_43_0);
                                stackIn_44_1 = stackIn_43_1;
                                stackIn_44_2 = var5 * var17[var8] >> -1959138837;
                                break L7;
                              }
                            }
                            stackIn_44_0[stackIn_44_1] = stackIn_44_2;
                            var8++;
                            continue L6;
                          }
                        }
                      } else {
                        if ((var8 ^ -1) != -8) {
                          if (8 == var8) {
                            var8 = 0;
                            L8: while (true) {
                              if (var8 >= ci.field_c) {
                                break L1;
                              } else {
                                L9: {
                                  var4 = var17[var8];
                                  stackIn_55_0 = (int[]) (var3);

                                  stackIn_55_1 = var8;

                                  if (var4 != 0) {
                                    stackIn_56_0 = (int[]) ((Object) stackIn_55_0);
                                    stackIn_56_1 = stackIn_55_1;
                                    stackIn_56_2 = 4096 + -((4096 - var18[var8] << -339770292) / var4);
                                    break L9;
                                  } else {
                                    stackIn_56_0 = (int[]) ((Object) stackIn_55_0);
                                    stackIn_56_1 = stackIn_55_1;
                                    stackIn_56_2 = 0;
                                    break L9;
                                  }
                                }
                                stackIn_56_0[stackIn_56_1] = stackIn_56_2;
                                var8++;
                                continue L8;
                              }
                            }
                          } else {
                            if (var8 == 9) {
                              var8 = 0;
                              L10: while (true) {
                                if (var8 >= ci.field_c) {
                                  break L1;
                                } else {
                                  L11: {
                                    var5 = var18[var8];
                                    var4 = var17[var8];
                                    stackIn_61_0 = (int[]) (var3);

                                    stackIn_61_1 = var8;

                                    if (var5 <= var4) {
                                      stackIn_62_0 = (int[]) ((Object) stackIn_61_0);
                                      stackIn_62_1 = stackIn_61_1;
                                      stackIn_62_2 = var5;
                                      break L11;
                                    } else {
                                      stackIn_62_0 = (int[]) ((Object) stackIn_61_0);
                                      stackIn_62_1 = stackIn_61_1;
                                      stackIn_62_2 = var4;
                                      break L11;
                                    }
                                  }
                                  stackIn_62_0[stackIn_62_1] = stackIn_62_2;
                                  var8++;
                                  continue L10;
                                }
                              }
                            } else {
                              if (-11 != (var8 ^ -1)) {
                                if (11 != var8) {
                                  if ((var8 ^ -1) == -13) {
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var8 >= ci.field_c) {
                                        break L1;
                                      } else {
                                        var4 = var17[var8];
                                        var5 = var18[var8];
                                        var3[var8] = var5 + (var4 - (var5 * var4 >> -1178925429));
                                        var8++;
                                        continue L12;
                                      }
                                    }
                                  } else {
                                    break L1;
                                  }
                                } else {
                                  var8 = 0;
                                  L13: while (true) {
                                    if (var8 >= ci.field_c) {
                                      break L1;
                                    } else {
                                      L14: {
                                        var4 = var17[var8];
                                        var5 = var18[var8];
                                        stackIn_73_0 = (int[]) (var3);

                                        stackIn_73_1 = var8;

                                        if (var4 > var5) {
                                          stackIn_74_0 = (int[]) ((Object) stackIn_73_0);
                                          stackIn_74_1 = stackIn_73_1;
                                          stackIn_74_2 = var4 + -var5;
                                          break L14;
                                        } else {
                                          stackIn_74_0 = (int[]) ((Object) stackIn_73_0);
                                          stackIn_74_1 = stackIn_73_1;
                                          stackIn_74_2 = var5 + -var4;
                                          break L14;
                                        }
                                      }
                                      stackIn_74_0[stackIn_74_1] = stackIn_74_2;
                                      var8++;
                                      continue L13;
                                    }
                                  }
                                }
                              } else {
                                var8 = 0;
                                L15: while (true) {
                                  if (ci.field_c <= var8) {
                                    break L1;
                                  } else {
                                    L16: {
                                      var5 = var18[var8];
                                      var4 = var17[var8];
                                      stackIn_67_0 = (int[]) (var3);

                                      stackIn_67_1 = var8;

                                      if (var5 < var4) {
                                        stackIn_68_0 = (int[]) ((Object) stackIn_67_0);
                                        stackIn_68_1 = stackIn_67_1;
                                        stackIn_68_2 = var4;
                                        break L16;
                                      } else {
                                        stackIn_68_0 = (int[]) ((Object) stackIn_67_0);
                                        stackIn_68_1 = stackIn_67_1;
                                        stackIn_68_2 = var5;
                                        break L16;
                                      }
                                    }
                                    stackIn_68_0[stackIn_68_1] = stackIn_68_2;
                                    var8++;
                                    continue L15;
                                  }
                                }
                              }
                            }
                          }
                        } else {
                          var8 = 0;
                          L17: while (true) {
                            if (var8 >= ci.field_c) {
                              break L1;
                            } else {
                              L18: {
                                var4 = var17[var8];
                                stackIn_49_0 = (int[]) (var3);

                                stackIn_49_1 = var8;

                                if (var4 == 4096) {
                                  stackIn_50_0 = (int[]) ((Object) stackIn_49_0);
                                  stackIn_50_1 = stackIn_49_1;
                                  stackIn_50_2 = 4096;
                                  break L18;
                                } else {
                                  stackIn_50_0 = (int[]) ((Object) stackIn_49_0);
                                  stackIn_50_1 = stackIn_49_1;
                                  stackIn_50_2 = (var18[var8] << -1304337492) / (4096 + -var4);
                                  break L18;
                                }
                              }
                              stackIn_50_0[stackIn_50_1] = stackIn_50_2;
                              var8++;
                              continue L17;
                            }
                          }
                        }
                      }
                    }
                  } else {
                    var10 = var3;
                    var8 = 0;
                    L19: while (true) {
                      if (var8 >= ci.field_c) {
                        break L1;
                      } else {
                        L20: {
                          var5 = var18[var8];
                          stackIn_34_0 = (int[]) (var10);

                          stackIn_34_1 = var8;

                          if (-1 != (var5 ^ -1)) {
                            stackIn_35_0 = (int[]) ((Object) stackIn_34_0);
                            stackIn_35_1 = stackIn_34_1;
                            stackIn_35_2 = (var17[var8] << -1908347188) / var5;
                            break L20;
                          } else {
                            stackIn_35_0 = (int[]) ((Object) stackIn_34_0);
                            stackIn_35_1 = stackIn_34_1;
                            stackIn_35_2 = 4096;
                            break L20;
                          }
                        }
                        stackIn_35_0[stackIn_35_1] = stackIn_35_2;
                        var8++;
                        continue L19;
                      }
                    }
                  }
                }
              }
            }
          } else {
            break L1;
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
        if ((lc.field_z ^ -1) < -1) {
            lc.field_z = lc.field_z - 1;
            var2 = (ii) ((Object) bd.field_s.a((byte) 106));
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
        L0: {
          if (ha.field_b == null) {
            break L0;
          } else {
            var1 = ha.field_b;
            synchronized (var1) {
              L1: {
                ha.field_b = null;
                break L1;
              }
            }
            break L0;
          }
        }
        L2: {
          if (param0) {
            break L2;
          } else {
            var3 = (byte[]) null;
            ee.a((byte[]) null, 74);
            break L2;
          }
        }
    }

    final int[][] a(int param0, int param1) {
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
        L0: {
          var22 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            this.field_u = -9;
            break L0;
          }
        }
        L1: {
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
            if (1 != var21) {
              if (var21 != 2) {
                if (-4 == (var21 ^ -1)) {
                  var12 = var33[0];
                  var13 = var33[1];
                  var14 = var33[2];
                  var52 = var51[0];
                  var53 = var50[0];
                  var54 = var51[1];
                  var55 = var50[1];
                  var56 = var51[2];
                  var57 = var50[2];
                  var21 = 0;
                  L2: while (true) {
                    if (ci.field_c <= var21) {
                      break L1;
                    } else {
                      var12[var21] = var52[var21] * var53[var21] >> 552580012;
                      var13[var21] = var55[var21] * var54[var21] >> 617612812;
                      var14[var21] = var57[var21] * var56[var21] >> -1234087508;
                      var21++;
                      continue L2;
                    }
                  }
                } else {
                  if (var21 == 4) {
                    var12 = var33[0];
                    var13 = var33[1];
                    var14 = var33[2];
                    var52 = var51[0];
                    var53 = var50[0];
                    var54 = var51[1];
                    var55 = var50[1];
                    var56 = var51[2];
                    var57 = var50[2];
                    var21 = 0;
                    L3: while (true) {
                      if (ci.field_c <= var21) {
                        break L1;
                      } else {
                        L4: {
                          var9 = var56[var21];
                          var8 = var54[var21];
                          var7 = var52[var21];
                          stackIn_35_0 = (int[]) (var12);

                          stackIn_35_1 = var21;

                          if (0 != var7) {
                            stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                            stackIn_36_1 = stackIn_35_1;
                            stackIn_36_2 = (var53[var21] << -1463609332) / var7;
                            break L4;
                          } else {
                            stackIn_36_0 = (int[]) ((Object) stackIn_35_0);
                            stackIn_36_1 = stackIn_35_1;
                            stackIn_36_2 = 4096;
                            break L4;
                          }
                        }
                        L5: {
                          stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                          stackIn_38_0 = (int[]) (var13);

                          stackIn_38_1 = var21;

                          if (0 == var8) {
                            stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                            stackIn_39_1 = stackIn_38_1;
                            stackIn_39_2 = 4096;
                            break L5;
                          } else {
                            stackIn_39_0 = (int[]) ((Object) stackIn_38_0);
                            stackIn_39_1 = stackIn_38_1;
                            stackIn_39_2 = (var55[var21] << 927828620) / var8;
                            break L5;
                          }
                        }
                        L6: {
                          stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                          stackIn_41_0 = (int[]) (var14);

                          stackIn_41_1 = var21;

                          if (var9 != 0) {
                            stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                            stackIn_42_1 = stackIn_41_1;
                            stackIn_42_2 = (var57[var21] << 1221966348) / var9;
                            break L6;
                          } else {
                            stackIn_42_0 = (int[]) ((Object) stackIn_41_0);
                            stackIn_42_1 = stackIn_41_1;
                            stackIn_42_2 = 4096;
                            break L6;
                          }
                        }
                        stackIn_42_0[stackIn_42_1] = stackIn_42_2;
                        var21++;
                        continue L3;
                      }
                    }
                  } else {
                    if (var21 == 5) {
                      var12 = var33[0];
                      var13 = var33[1];
                      var14 = var33[2];
                      var52 = var51[0];
                      var53 = var50[0];
                      var54 = var51[1];
                      var55 = var50[1];
                      var56 = var51[2];
                      var57 = var50[2];
                      var21 = 0;
                      L7: while (true) {
                        if (var21 >= ci.field_c) {
                          break L1;
                        } else {
                          var12[var21] = 4096 + -((4096 - var53[var21]) * (-var52[var21] + 4096) >> -279994612);
                          var13[var21] = -((4096 + -var55[var21]) * (-var54[var21] + 4096) >> 1010279500) + 4096;
                          var14[var21] = -((-var57[var21] + 4096) * (4096 + -var56[var21]) >> -1897291348) + 4096;
                          var21++;
                          continue L7;
                        }
                      }
                    } else {
                      if ((var21 ^ -1) == -7) {
                        var12 = var33[0];
                        var13 = var33[1];
                        var14 = var33[2];
                        var52 = var51[0];
                        var53 = var50[0];
                        var54 = var51[1];
                        var55 = var50[1];
                        var56 = var51[2];
                        var57 = var50[2];
                        var21 = 0;
                        L8: while (true) {
                          if (var21 >= ci.field_c) {
                            break L1;
                          } else {
                            L9: {
                              var9 = var56[var21];
                              var7 = var52[var21];
                              var8 = var54[var21];
                              stackIn_50_0 = (int[]) (var12);

                              stackIn_50_1 = var21;

                              if (var7 >= 2048) {
                                stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                stackIn_51_1 = stackIn_50_1;
                                stackIn_51_2 = 4096 + -((4096 + -var7) * (-var53[var21] + 4096) >> -1893076309);
                                break L9;
                              } else {
                                stackIn_51_0 = (int[]) ((Object) stackIn_50_0);
                                stackIn_51_1 = stackIn_50_1;
                                stackIn_51_2 = var7 * var53[var21] >> 1908974059;
                                break L9;
                              }
                            }
                            L10: {
                              stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                              stackIn_53_0 = (int[]) (var13);

                              stackIn_53_1 = var21;

                              if (2048 <= var8) {
                                stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                stackIn_54_1 = stackIn_53_1;
                                stackIn_54_2 = -((4096 - var8) * (4096 + -var55[var21]) >> 1600595851) + 4096;
                                break L10;
                              } else {
                                stackIn_54_0 = (int[]) ((Object) stackIn_53_0);
                                stackIn_54_1 = stackIn_53_1;
                                stackIn_54_2 = var55[var21] * var8 >> -401894229;
                                break L10;
                              }
                            }
                            L11: {
                              stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                              stackIn_56_0 = (int[]) (var14);

                              stackIn_56_1 = var21;

                              if (var9 < 2048) {
                                stackIn_57_0 = (int[]) ((Object) stackIn_56_0);
                                stackIn_57_1 = stackIn_56_1;
                                stackIn_57_2 = var9 * var57[var21] >> 1512517995;
                                break L11;
                              } else {
                                stackIn_57_0 = (int[]) ((Object) stackIn_56_0);
                                stackIn_57_1 = stackIn_56_1;
                                stackIn_57_2 = -((4096 - var9) * (4096 - var57[var21]) >> 1340306731) + 4096;
                                break L11;
                              }
                            }
                            stackIn_57_0[stackIn_57_1] = stackIn_57_2;
                            var21++;
                            continue L8;
                          }
                        }
                      } else {
                        if ((var21 ^ -1) == -8) {
                          var12 = var33[0];
                          var13 = var33[1];
                          var14 = var33[2];
                          var52 = var51[0];
                          var53 = var50[0];
                          var54 = var51[1];
                          var55 = var50[1];
                          var56 = var51[2];
                          var57 = var50[2];
                          var21 = 0;
                          L12: while (true) {
                            if (var21 >= ci.field_c) {
                              break L1;
                            } else {
                              L13: {
                                var5 = var55[var21];
                                var6 = var57[var21];
                                var4 = var53[var21];
                                stackIn_62_0 = (int[]) (var12);

                                stackIn_62_1 = var21;

                                if (-4097 == (var4 ^ -1)) {
                                  stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                  stackIn_63_1 = stackIn_62_1;
                                  stackIn_63_2 = 4096;
                                  break L13;
                                } else {
                                  stackIn_63_0 = (int[]) ((Object) stackIn_62_0);
                                  stackIn_63_1 = stackIn_62_1;
                                  stackIn_63_2 = (var52[var21] << -913258452) / (4096 - var4);
                                  break L13;
                                }
                              }
                              L14: {
                                stackIn_63_0[stackIn_63_1] = stackIn_63_2;
                                stackIn_65_0 = (int[]) (var13);

                                stackIn_65_1 = var21;

                                if ((var5 ^ -1) != -4097) {
                                  stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                                  stackIn_66_1 = stackIn_65_1;
                                  stackIn_66_2 = (var54[var21] << 1644451532) / (4096 - var5);
                                  break L14;
                                } else {
                                  stackIn_66_0 = (int[]) ((Object) stackIn_65_0);
                                  stackIn_66_1 = stackIn_65_1;
                                  stackIn_66_2 = 4096;
                                  break L14;
                                }
                              }
                              L15: {
                                stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                stackIn_68_0 = (int[]) (var14);

                                stackIn_68_1 = var21;

                                if (-4097 != (var6 ^ -1)) {
                                  stackIn_69_0 = (int[]) ((Object) stackIn_68_0);
                                  stackIn_69_1 = stackIn_68_1;
                                  stackIn_69_2 = (var56[var21] << -563387604) / (4096 - var6);
                                  break L15;
                                } else {
                                  stackIn_69_0 = (int[]) ((Object) stackIn_68_0);
                                  stackIn_69_1 = stackIn_68_1;
                                  stackIn_69_2 = 4096;
                                  break L15;
                                }
                              }
                              stackIn_69_0[stackIn_69_1] = stackIn_69_2;
                              var21++;
                              continue L12;
                            }
                          }
                        } else {
                          if (var21 == 8) {
                            var12 = var33[0];
                            var13 = var33[1];
                            var14 = var33[2];
                            var52 = var51[0];
                            var53 = var50[0];
                            var54 = var51[1];
                            var55 = var50[1];
                            var56 = var51[2];
                            var57 = var50[2];
                            var21 = 0;
                            L16: while (true) {
                              if (var21 >= ci.field_c) {
                                break L1;
                              } else {
                                L17: {
                                  var6 = var57[var21];
                                  var5 = var55[var21];
                                  var4 = var53[var21];
                                  stackIn_74_0 = (int[]) (var12);

                                  stackIn_74_1 = var21;

                                  if (-1 == (var4 ^ -1)) {
                                    stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                    stackIn_75_1 = stackIn_74_1;
                                    stackIn_75_2 = 0;
                                    break L17;
                                  } else {
                                    stackIn_75_0 = (int[]) ((Object) stackIn_74_0);
                                    stackIn_75_1 = stackIn_74_1;
                                    stackIn_75_2 = -((-var52[var21] + 4096 << -771008628) / var4) + 4096;
                                    break L17;
                                  }
                                }
                                L18: {
                                  stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                  stackIn_77_0 = (int[]) (var13);

                                  stackIn_77_1 = var21;

                                  if (var5 != 0) {
                                    stackIn_78_0 = (int[]) ((Object) stackIn_77_0);
                                    stackIn_78_1 = stackIn_77_1;
                                    stackIn_78_2 = -((4096 - var54[var21] << 970821036) / var5) + 4096;
                                    break L18;
                                  } else {
                                    stackIn_78_0 = (int[]) ((Object) stackIn_77_0);
                                    stackIn_78_1 = stackIn_77_1;
                                    stackIn_78_2 = 0;
                                    break L18;
                                  }
                                }
                                L19: {
                                  stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                                  stackIn_80_0 = (int[]) (var14);

                                  stackIn_80_1 = var21;

                                  if (0 != var6) {
                                    stackIn_81_0 = (int[]) ((Object) stackIn_80_0);
                                    stackIn_81_1 = stackIn_80_1;
                                    stackIn_81_2 = -((4096 + -var56[var21] << -1915477780) / var6) + 4096;
                                    break L19;
                                  } else {
                                    stackIn_81_0 = (int[]) ((Object) stackIn_80_0);
                                    stackIn_81_1 = stackIn_80_1;
                                    stackIn_81_2 = 0;
                                    break L19;
                                  }
                                }
                                stackIn_81_0[stackIn_81_1] = stackIn_81_2;
                                var21++;
                                continue L16;
                              }
                            }
                          } else {
                            if (var21 != 9) {
                              if (10 != var21) {
                                if (-12 != (var21 ^ -1)) {
                                  if (-13 != (var21 ^ -1)) {
                                    break L1;
                                  } else {
                                    var12 = var33[0];
                                    var13 = var33[1];
                                    var14 = var33[2];
                                    var52 = var51[0];
                                    var53 = var50[0];
                                    var54 = var51[1];
                                    var55 = var50[1];
                                    var56 = var51[2];
                                    var57 = var50[2];
                                    var21 = 0;
                                    L20: while (true) {
                                      if (ci.field_c <= var21) {
                                        break L1;
                                      } else {
                                        var8 = var54[var21];
                                        var4 = var53[var21];
                                        var5 = var55[var21];
                                        var6 = var57[var21];
                                        var9 = var56[var21];
                                        var7 = var52[var21];
                                        var12[var21] = -(var7 * var4 >> -1392256949) + var4 - -var7;
                                        var13[var21] = var8 + (var5 + -(var5 * var8 >> 1095329227));
                                        var14[var21] = var6 + var9 + -(var9 * var6 >> -92334197);
                                        var21++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var12 = var33[0];
                                  var13 = var33[1];
                                  var14 = var33[2];
                                  var52 = var51[0];
                                  var53 = var50[0];
                                  var54 = var51[1];
                                  var55 = var50[1];
                                  var56 = var51[2];
                                  var57 = var50[2];
                                  var21 = 0;
                                  L21: while (true) {
                                    if (ci.field_c <= var21) {
                                      break L1;
                                    } else {
                                      L22: {
                                        var9 = var56[var21];
                                        var6 = var57[var21];
                                        var8 = var54[var21];
                                        var5 = var55[var21];
                                        var7 = var52[var21];
                                        var4 = var53[var21];
                                        stackIn_110_0 = (int[]) (var12);

                                        stackIn_110_1 = var21;

                                        if (var7 >= var4) {
                                          stackIn_111_0 = (int[]) ((Object) stackIn_110_0);
                                          stackIn_111_1 = stackIn_110_1;
                                          stackIn_111_2 = var7 - var4;
                                          break L22;
                                        } else {
                                          stackIn_111_0 = (int[]) ((Object) stackIn_110_0);
                                          stackIn_111_1 = stackIn_110_1;
                                          stackIn_111_2 = -var7 + var4;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        stackIn_111_0[stackIn_111_1] = stackIn_111_2;
                                        stackIn_113_0 = (int[]) (var13);

                                        stackIn_113_1 = var21;

                                        if (var8 >= var5) {
                                          stackIn_114_0 = (int[]) ((Object) stackIn_113_0);
                                          stackIn_114_1 = stackIn_113_1;
                                          stackIn_114_2 = var8 - var5;
                                          break L23;
                                        } else {
                                          stackIn_114_0 = (int[]) ((Object) stackIn_113_0);
                                          stackIn_114_1 = stackIn_113_1;
                                          stackIn_114_2 = var5 - var8;
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        stackIn_114_0[stackIn_114_1] = stackIn_114_2;
                                        stackIn_116_0 = (int[]) (var14);

                                        stackIn_116_1 = var21;

                                        if (var9 >= var6) {
                                          stackIn_117_0 = (int[]) ((Object) stackIn_116_0);
                                          stackIn_117_1 = stackIn_116_1;
                                          stackIn_117_2 = var9 + -var6;
                                          break L24;
                                        } else {
                                          stackIn_117_0 = (int[]) ((Object) stackIn_116_0);
                                          stackIn_117_1 = stackIn_116_1;
                                          stackIn_117_2 = var6 + -var9;
                                          break L24;
                                        }
                                      }
                                      stackIn_117_0[stackIn_117_1] = stackIn_117_2;
                                      var21++;
                                      continue L21;
                                    }
                                  }
                                }
                              } else {
                                var12 = var33[0];
                                var13 = var33[1];
                                var14 = var33[2];
                                var52 = var51[0];
                                var53 = var50[0];
                                var54 = var51[1];
                                var55 = var50[1];
                                var56 = var51[2];
                                var57 = var50[2];
                                var21 = 0;
                                L25: while (true) {
                                  if (var21 >= ci.field_c) {
                                    break L1;
                                  } else {
                                    L26: {
                                      var7 = var52[var21];
                                      var6 = var57[var21];
                                      var9 = var56[var21];
                                      var8 = var54[var21];
                                      var5 = var55[var21];
                                      var4 = var53[var21];
                                      stackIn_98_0 = (int[]) (var12);

                                      stackIn_98_1 = var21;

                                      if (var4 > var7) {
                                        stackIn_99_0 = (int[]) ((Object) stackIn_98_0);
                                        stackIn_99_1 = stackIn_98_1;
                                        stackIn_99_2 = var4;
                                        break L26;
                                      } else {
                                        stackIn_99_0 = (int[]) ((Object) stackIn_98_0);
                                        stackIn_99_1 = stackIn_98_1;
                                        stackIn_99_2 = var7;
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      stackIn_99_0[stackIn_99_1] = stackIn_99_2;
                                      stackIn_101_0 = (int[]) (var13);

                                      stackIn_101_1 = var21;

                                      if (var5 <= var8) {
                                        stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                                        stackIn_102_1 = stackIn_101_1;
                                        stackIn_102_2 = var8;
                                        break L27;
                                      } else {
                                        stackIn_102_0 = (int[]) ((Object) stackIn_101_0);
                                        stackIn_102_1 = stackIn_101_1;
                                        stackIn_102_2 = var5;
                                        break L27;
                                      }
                                    }
                                    L28: {
                                      stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                                      stackIn_104_0 = (int[]) (var14);

                                      stackIn_104_1 = var21;

                                      if (var9 >= var6) {
                                        stackIn_105_0 = (int[]) ((Object) stackIn_104_0);
                                        stackIn_105_1 = stackIn_104_1;
                                        stackIn_105_2 = var9;
                                        break L28;
                                      } else {
                                        stackIn_105_0 = (int[]) ((Object) stackIn_104_0);
                                        stackIn_105_1 = stackIn_104_1;
                                        stackIn_105_2 = var6;
                                        break L28;
                                      }
                                    }
                                    stackIn_105_0[stackIn_105_1] = stackIn_105_2;
                                    var21++;
                                    continue L25;
                                  }
                                }
                              }
                            } else {
                              var12 = var33[0];
                              var13 = var33[1];
                              var14 = var33[2];
                              var52 = var51[0];
                              var53 = var50[0];
                              var54 = var51[1];
                              var55 = var50[1];
                              var56 = var51[2];
                              var57 = var50[2];
                              var21 = 0;
                              L29: while (true) {
                                if (ci.field_c <= var21) {
                                  break L1;
                                } else {
                                  L30: {
                                    var4 = var53[var21];
                                    var6 = var57[var21];
                                    var8 = var54[var21];
                                    var5 = var55[var21];
                                    var7 = var52[var21];
                                    var9 = var56[var21];
                                    stackIn_86_0 = (int[]) (var12);

                                    stackIn_86_1 = var21;

                                    if (var7 > var4) {
                                      stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                                      stackIn_87_1 = stackIn_86_1;
                                      stackIn_87_2 = var4;
                                      break L30;
                                    } else {
                                      stackIn_87_0 = (int[]) ((Object) stackIn_86_0);
                                      stackIn_87_1 = stackIn_86_1;
                                      stackIn_87_2 = var7;
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    stackIn_87_0[stackIn_87_1] = stackIn_87_2;
                                    stackIn_89_0 = (int[]) (var13);

                                    stackIn_89_1 = var21;

                                    if (var5 < var8) {
                                      stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                                      stackIn_90_1 = stackIn_89_1;
                                      stackIn_90_2 = var5;
                                      break L31;
                                    } else {
                                      stackIn_90_0 = (int[]) ((Object) stackIn_89_0);
                                      stackIn_90_1 = stackIn_89_1;
                                      stackIn_90_2 = var8;
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    stackIn_90_0[stackIn_90_1] = stackIn_90_2;
                                    stackIn_92_0 = (int[]) (var14);

                                    stackIn_92_1 = var21;

                                    if (var6 < var9) {
                                      stackIn_93_0 = (int[]) ((Object) stackIn_92_0);
                                      stackIn_93_1 = stackIn_92_1;
                                      stackIn_93_2 = var6;
                                      break L32;
                                    } else {
                                      stackIn_93_0 = (int[]) ((Object) stackIn_92_0);
                                      stackIn_93_1 = stackIn_92_1;
                                      stackIn_93_2 = var9;
                                      break L32;
                                    }
                                  }
                                  stackIn_93_0[stackIn_93_1] = stackIn_93_2;
                                  var21++;
                                  continue L29;
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
                var54 = var51[1];
                var55 = var50[1];
                var56 = var51[2];
                var57 = var50[2];
                var21 = 0;
                L33: while (true) {
                  if (var21 >= ci.field_c) {
                    break L1;
                  } else {
                    var12[var21] = var53[var21] - var52[var21];
                    var13[var21] = -var54[var21] + var55[var21];
                    var14[var21] = var57[var21] + -var56[var21];
                    var21++;
                    continue L33;
                  }
                }
              }
            } else {
              var12 = var33[0];
              var13 = var33[1];
              var14 = var33[2];
              var52 = var51[0];
              var53 = var50[0];
              var54 = var51[1];
              var55 = var50[1];
              var56 = var51[2];
              var57 = var50[2];
              var21 = 0;
              L34: while (true) {
                if (var21 >= ci.field_c) {
                  break L1;
                } else {
                  var12[var21] = var52[var21] + var53[var21];
                  var13[var21] = var54[var21] + var55[var21];
                  var14[var21] = var56[var21] + var57[var21];
                  var21++;
                  continue L34;
                }
              }
            }
          } else {
            break L1;
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
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 != null) {
              L1: {
                var2 = new li(param0, fj.field_o, na.field_G, vo.field_b, ij.field_o, cq.field_y, pn.field_b);
                if (param1 == 7028) {
                  break L1;
                } else {
                  ee.a(false);
                  break L1;
                }
              }
              go.b(param1 + -7028);
              stackIn_6_0 = (li) (var2);
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_9_0 = (RuntimeException) (var2_ref);

            stackIn_9_1 = new StringBuilder().append("ee.A(");

            if (param0 == null) {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_10_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_10_0), stackIn_10_2 + ',' + param1 + ')');
        }
        return stackIn_6_0;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                this.field_u = param0.i((byte) -101);
                break L1;
              } else {
                if (var4_int == 1) {
                  L2: {
                    stackIn_6_0 = this;

                    if ((param0.i((byte) -101) ^ -1) != -2) {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 0;
                      break L2;
                    } else {
                      stackIn_7_0 = this;
                      stackIn_7_1 = 1;
                      break L2;
                    }
                  }
                  ((ee) (this)).field_p = stackIn_7_1 != 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L3: {
              if (param1 == 35) {
                break L3;
              } else {
                ee.a(false);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var4);

            stackIn_13_1 = new StringBuilder().append("ee.H(");

            if (param0 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public ee() {
        super(2, false);
        this.field_u = 6;
    }

    final static void a(boolean param0, double[] param1, double[] param2, double param3, double param4, int param5) {
        double[] dupTemp$0 = null;
        double dupTemp$1 = 0.0;
        double[] arrayValue$2 = null;
        double[] dupTemp$3 = null;
        double[] dupTemp$4 = null;
        double[] dupTemp$5 = null;
        double[] dupTemp$6 = null;
        double[] dupTemp$7 = null;
        double[] dupTemp$8 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        StringBuilder stackIn_31_1 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var9_double = 0.0;
        int var10 = 0;
        int var11 = 0;
        double[] var12 = null;
        double[] var13 = null;
        var11 = Torquing.field_u;
        try {
          L0: {
            var8_int = 0;
            L1: while (true) {
              if (var8_int >= ia.field_i) {
                L2: {
                  bd.field_y = Math.sqrt(ap.a(param2, 3, param2, 3));
                  vf.field_e[8] = -bd.field_y;
                  if (param5 >= 44) {
                    break L2;
                  } else {
                    field_s = true;
                    break L2;
                  }
                }
                L3: {
                  if (bd.field_y != 0.0) {
                    ia.field_d = param2[5] / bd.field_y;
                    mc.field_m = param2[4] / bd.field_y;
                    tf.field_c = param2[3] / bd.field_y;
                    break L3;
                  } else {
                    tf.field_c = 0.0;
                    mc.field_m = 0.0;
                    ia.field_d = 0.0;
                    break L3;
                  }
                }
                var8_int = 0;
                L4: while (true) {
                  if (ia.field_i <= var8_int) {
                    var8_int = 0;
                    L5: while (true) {
                      if (var8_int >= ia.field_i) {
                        var8_int = ia.field_i;
                        L6: while (true) {
                          if (-9 >= (var8_int ^ -1)) {
                            mg.field_a[8][8] = 1.0;
                            break L0;
                          } else {
                            var13 = mg.field_a[var8_int];
                            mg.field_a[8][var8_int] = 0.0;
                            var13[8] = 0.0;
                            var8_int++;
                            continue L6;
                          }
                        }
                      } else {
                        dupTemp$0 = mg.field_a[8];
                        dupTemp$1 = mc.field_m * bn.field_f[var8_int][7] + tf.field_c * bn.field_f[var8_int][6] + bn.field_f[var8_int][8] * ia.field_d;
                        arrayValue$2 = mg.field_a[var8_int];
                        dupTemp$0[var8_int] = dupTemp$1;
                        arrayValue$2[8] = dupTemp$1;
                        var8_int++;
                        continue L5;
                      }
                    }
                  } else {
                    var9 = 0;
                    L7: while (true) {
                      if (ia.field_i <= var9) {
                        var12 = jl.field_O[var8_int];
                        var10 = var8_int;
                        mg.field_a[var8_int][var8_int] = 1.0;
                        var12[var10] = 1.0;
                        var8_int++;
                        continue L4;
                      } else {
                        jl.field_O[var8_int][var9] = ap.a(ie.field_a[var8_int], 0, ie.field_a[var9], 0);
                        mg.field_a[var8_int][var9] = ap.a(bn.field_f[var8_int], 6, bn.field_f[var9], 6);
                        var9++;
                        continue L7;
                      }
                    }
                  }
                }
              } else {
                L8: {
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
                    break L8;
                  } else {
                    break L8;
                  }
                }
                go.field_w[var8_int] = -var9_double;
                vf.field_e[var8_int] = (-param3 + bn.field_f[var8_int][3]) / param4;
                var8_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var8 = decompiledCaughtException;
            stackIn_28_0 = (RuntimeException) (var8);

            stackIn_28_1 = new StringBuilder().append("ee.E(").append(param0).append(',');

            if (param1 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "null";
              break L9;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackIn_29_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackIn_29_2 = "{...}";
              break L9;
            }
          }
          L10: {


            stackIn_31_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',');

            if (param2 == null) {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "null";
              break L10;
            } else {
              stackIn_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackIn_32_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackIn_32_2 = "{...}";
              break L10;
            }
          }
          throw rb.a((Throwable) ((Object) stackIn_29_0), stackIn_32_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_t = new int[8];
        field_v = 0;
    }
}
