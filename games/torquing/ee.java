/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ee extends am {
    static int[] field_t;
    private int field_u;
    static int field_v;
    static boolean field_s;

    final int[] a(byte param0, int param1) {
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var8 = 0;
        int var9 = 0;
        int[] var10 = null;
        int[] var17 = null;
        int[] var18 = null;
        int[] stackIn_33_0 = null;
        int stackIn_33_1 = 0;
        int[] stackIn_34_0 = null;
        int stackIn_34_1 = 0;
        int[] stackIn_35_0 = null;
        int stackIn_35_1 = 0;
        int stackIn_35_2 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_42_1 = 0;
        int[] stackIn_43_0 = null;
        int stackIn_43_1 = 0;
        int[] stackIn_44_0 = null;
        int stackIn_44_1 = 0;
        int stackIn_44_2 = 0;
        int[] stackIn_48_0 = null;
        int stackIn_48_1 = 0;
        int[] stackIn_49_0 = null;
        int stackIn_49_1 = 0;
        int[] stackIn_50_0 = null;
        int stackIn_50_1 = 0;
        int stackIn_50_2 = 0;
        int[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        int[] stackIn_55_0 = null;
        int stackIn_55_1 = 0;
        int[] stackIn_56_0 = null;
        int stackIn_56_1 = 0;
        int stackIn_56_2 = 0;
        int[] stackIn_60_0 = null;
        int stackIn_60_1 = 0;
        int[] stackIn_61_0 = null;
        int stackIn_61_1 = 0;
        int[] stackIn_62_0 = null;
        int stackIn_62_1 = 0;
        int stackIn_62_2 = 0;
        int[] stackIn_66_0 = null;
        int stackIn_66_1 = 0;
        int[] stackIn_67_0 = null;
        int stackIn_67_1 = 0;
        int[] stackIn_68_0 = null;
        int stackIn_68_1 = 0;
        int stackIn_68_2 = 0;
        int[] stackIn_72_0 = null;
        int stackIn_72_1 = 0;
        int[] stackIn_73_0 = null;
        int stackIn_73_1 = 0;
        int[] stackIn_74_0 = null;
        int stackIn_74_1 = 0;
        int stackIn_74_2 = 0;
        int[] stackOut_41_0 = null;
        int stackOut_41_1 = 0;
        int[] stackOut_43_0 = null;
        int stackOut_43_1 = 0;
        int stackOut_43_2 = 0;
        int[] stackOut_42_0 = null;
        int stackOut_42_1 = 0;
        int stackOut_42_2 = 0;
        int[] stackOut_53_0 = null;
        int stackOut_53_1 = 0;
        int[] stackOut_55_0 = null;
        int stackOut_55_1 = 0;
        int stackOut_55_2 = 0;
        int[] stackOut_54_0 = null;
        int stackOut_54_1 = 0;
        int stackOut_54_2 = 0;
        int[] stackOut_59_0 = null;
        int stackOut_59_1 = 0;
        int[] stackOut_61_0 = null;
        int stackOut_61_1 = 0;
        int stackOut_61_2 = 0;
        int[] stackOut_60_0 = null;
        int stackOut_60_1 = 0;
        int stackOut_60_2 = 0;
        int[] stackOut_71_0 = null;
        int stackOut_71_1 = 0;
        int[] stackOut_73_0 = null;
        int stackOut_73_1 = 0;
        int stackOut_73_2 = 0;
        int[] stackOut_72_0 = null;
        int stackOut_72_1 = 0;
        int stackOut_72_2 = 0;
        int[] stackOut_65_0 = null;
        int stackOut_65_1 = 0;
        int[] stackOut_67_0 = null;
        int stackOut_67_1 = 0;
        int stackOut_67_2 = 0;
        int[] stackOut_66_0 = null;
        int stackOut_66_1 = 0;
        int stackOut_66_2 = 0;
        int[] stackOut_47_0 = null;
        int stackOut_47_1 = 0;
        int[] stackOut_49_0 = null;
        int stackOut_49_1 = 0;
        int stackOut_49_2 = 0;
        int[] stackOut_48_0 = null;
        int stackOut_48_1 = 0;
        int stackOut_48_2 = 0;
        int[] stackOut_32_0 = null;
        int stackOut_32_1 = 0;
        int[] stackOut_34_0 = null;
        int stackOut_34_1 = 0;
        int stackOut_34_2 = 0;
        int[] stackOut_33_0 = null;
        int stackOut_33_1 = 0;
        int stackOut_33_2 = 0;
        L0: {
          var9 = Torquing.field_u;
          var10 = ((ee) this).field_l.a(param1, 25657);
          var3 = var10;
          if (param0 >= 86) {
            break L0;
          } else {
            ((ee) this).field_u = 108;
            break L0;
          }
        }
        L1: {
          if (((ee) this).field_l.field_b) {
            var17 = ((ee) this).b(0, 0, param1);
            var18 = ((ee) this).b(0, 1, param1);
            var8 = ((ee) this).field_u;
            if (var8 == 1) {
              var10 = var3;
              var8 = 0;
              L2: while (true) {
                if (~var8 <= ~ci.field_c) {
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
                  if (~var8 <= ~ci.field_c) {
                    break L1;
                  } else {
                    var10[var8] = -var18[var8] + var17[var8];
                    var8++;
                    continue L3;
                  }
                }
              } else {
                if (var8 == 3) {
                  var10 = var3;
                  var8 = 0;
                  L4: while (true) {
                    if (var8 >= ci.field_c) {
                      break L1;
                    } else {
                      var10[var8] = var17[var8] * var18[var8] >> 12;
                      var8++;
                      continue L4;
                    }
                  }
                } else {
                  if (var8 != 4) {
                    if (var8 == 5) {
                      var8 = 0;
                      L5: while (true) {
                        if (~var8 <= ~ci.field_c) {
                          break L1;
                        } else {
                          var3[var8] = 4096 - ((4096 + -var18[var8]) * (4096 + -var17[var8]) >> 12);
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
                              stackOut_41_0 = (int[]) var3;
                              stackOut_41_1 = var8;
                              stackIn_43_0 = stackOut_41_0;
                              stackIn_43_1 = stackOut_41_1;
                              stackIn_42_0 = stackOut_41_0;
                              stackIn_42_1 = stackOut_41_1;
                              if (2048 <= var5) {
                                stackOut_43_0 = (int[]) (Object) stackIn_43_0;
                                stackOut_43_1 = stackIn_43_1;
                                stackOut_43_2 = 4096 + -((4096 + -var5) * (-var17[var8] + 4096) >> 11);
                                stackIn_44_0 = stackOut_43_0;
                                stackIn_44_1 = stackOut_43_1;
                                stackIn_44_2 = stackOut_43_2;
                                break L7;
                              } else {
                                stackOut_42_0 = (int[]) (Object) stackIn_42_0;
                                stackOut_42_1 = stackIn_42_1;
                                stackOut_42_2 = var5 * var17[var8] >> 11;
                                stackIn_44_0 = stackOut_42_0;
                                stackIn_44_1 = stackOut_42_1;
                                stackIn_44_2 = stackOut_42_2;
                                break L7;
                              }
                            }
                            stackIn_44_0[stackIn_44_1] = stackIn_44_2;
                            var8++;
                            continue L6;
                          }
                        }
                      } else {
                        if (var8 != 7) {
                          if (8 == var8) {
                            var8 = 0;
                            L8: while (true) {
                              if (~var8 <= ~ci.field_c) {
                                break L1;
                              } else {
                                L9: {
                                  var4 = var17[var8];
                                  stackOut_53_0 = (int[]) var3;
                                  stackOut_53_1 = var8;
                                  stackIn_55_0 = stackOut_53_0;
                                  stackIn_55_1 = stackOut_53_1;
                                  stackIn_54_0 = stackOut_53_0;
                                  stackIn_54_1 = stackOut_53_1;
                                  if (var4 != 0) {
                                    stackOut_55_0 = (int[]) (Object) stackIn_55_0;
                                    stackOut_55_1 = stackIn_55_1;
                                    stackOut_55_2 = 4096 + -((4096 - var18[var8] << 12) / var4);
                                    stackIn_56_0 = stackOut_55_0;
                                    stackIn_56_1 = stackOut_55_1;
                                    stackIn_56_2 = stackOut_55_2;
                                    break L9;
                                  } else {
                                    stackOut_54_0 = (int[]) (Object) stackIn_54_0;
                                    stackOut_54_1 = stackIn_54_1;
                                    stackOut_54_2 = 0;
                                    stackIn_56_0 = stackOut_54_0;
                                    stackIn_56_1 = stackOut_54_1;
                                    stackIn_56_2 = stackOut_54_2;
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
                                if (~var8 <= ~ci.field_c) {
                                  break L1;
                                } else {
                                  L11: {
                                    var5 = var18[var8];
                                    var4 = var17[var8];
                                    stackOut_59_0 = (int[]) var3;
                                    stackOut_59_1 = var8;
                                    stackIn_61_0 = stackOut_59_0;
                                    stackIn_61_1 = stackOut_59_1;
                                    stackIn_60_0 = stackOut_59_0;
                                    stackIn_60_1 = stackOut_59_1;
                                    if (~var5 >= ~var4) {
                                      stackOut_61_0 = (int[]) (Object) stackIn_61_0;
                                      stackOut_61_1 = stackIn_61_1;
                                      stackOut_61_2 = var5;
                                      stackIn_62_0 = stackOut_61_0;
                                      stackIn_62_1 = stackOut_61_1;
                                      stackIn_62_2 = stackOut_61_2;
                                      break L11;
                                    } else {
                                      stackOut_60_0 = (int[]) (Object) stackIn_60_0;
                                      stackOut_60_1 = stackIn_60_1;
                                      stackOut_60_2 = var4;
                                      stackIn_62_0 = stackOut_60_0;
                                      stackIn_62_1 = stackOut_60_1;
                                      stackIn_62_2 = stackOut_60_2;
                                      break L11;
                                    }
                                  }
                                  stackIn_62_0[stackIn_62_1] = stackIn_62_2;
                                  var8++;
                                  continue L10;
                                }
                              }
                            } else {
                              if (var8 != 10) {
                                if (11 != var8) {
                                  if (var8 == 12) {
                                    var8 = 0;
                                    L12: while (true) {
                                      if (var8 >= ci.field_c) {
                                        break L1;
                                      } else {
                                        var4 = var17[var8];
                                        var5 = var18[var8];
                                        var3[var8] = var5 + (var4 - (var5 * var4 >> 11));
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
                                        stackOut_71_0 = (int[]) var3;
                                        stackOut_71_1 = var8;
                                        stackIn_73_0 = stackOut_71_0;
                                        stackIn_73_1 = stackOut_71_1;
                                        stackIn_72_0 = stackOut_71_0;
                                        stackIn_72_1 = stackOut_71_1;
                                        if (~var4 < ~var5) {
                                          stackOut_73_0 = (int[]) (Object) stackIn_73_0;
                                          stackOut_73_1 = stackIn_73_1;
                                          stackOut_73_2 = var4 + -var5;
                                          stackIn_74_0 = stackOut_73_0;
                                          stackIn_74_1 = stackOut_73_1;
                                          stackIn_74_2 = stackOut_73_2;
                                          break L14;
                                        } else {
                                          stackOut_72_0 = (int[]) (Object) stackIn_72_0;
                                          stackOut_72_1 = stackIn_72_1;
                                          stackOut_72_2 = var5 + -var4;
                                          stackIn_74_0 = stackOut_72_0;
                                          stackIn_74_1 = stackOut_72_1;
                                          stackIn_74_2 = stackOut_72_2;
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
                                  if (~ci.field_c >= ~var8) {
                                    break L1;
                                  } else {
                                    L16: {
                                      var5 = var18[var8];
                                      var4 = var17[var8];
                                      stackOut_65_0 = (int[]) var3;
                                      stackOut_65_1 = var8;
                                      stackIn_67_0 = stackOut_65_0;
                                      stackIn_67_1 = stackOut_65_1;
                                      stackIn_66_0 = stackOut_65_0;
                                      stackIn_66_1 = stackOut_65_1;
                                      if (var5 < var4) {
                                        stackOut_67_0 = (int[]) (Object) stackIn_67_0;
                                        stackOut_67_1 = stackIn_67_1;
                                        stackOut_67_2 = var4;
                                        stackIn_68_0 = stackOut_67_0;
                                        stackIn_68_1 = stackOut_67_1;
                                        stackIn_68_2 = stackOut_67_2;
                                        break L16;
                                      } else {
                                        stackOut_66_0 = (int[]) (Object) stackIn_66_0;
                                        stackOut_66_1 = stackIn_66_1;
                                        stackOut_66_2 = var5;
                                        stackIn_68_0 = stackOut_66_0;
                                        stackIn_68_1 = stackOut_66_1;
                                        stackIn_68_2 = stackOut_66_2;
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
                                stackOut_47_0 = (int[]) var3;
                                stackOut_47_1 = var8;
                                stackIn_49_0 = stackOut_47_0;
                                stackIn_49_1 = stackOut_47_1;
                                stackIn_48_0 = stackOut_47_0;
                                stackIn_48_1 = stackOut_47_1;
                                if (var4 == 4096) {
                                  stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                                  stackOut_49_1 = stackIn_49_1;
                                  stackOut_49_2 = 4096;
                                  stackIn_50_0 = stackOut_49_0;
                                  stackIn_50_1 = stackOut_49_1;
                                  stackIn_50_2 = stackOut_49_2;
                                  break L18;
                                } else {
                                  stackOut_48_0 = (int[]) (Object) stackIn_48_0;
                                  stackOut_48_1 = stackIn_48_1;
                                  stackOut_48_2 = (var18[var8] << 12) / (4096 + -var4);
                                  stackIn_50_0 = stackOut_48_0;
                                  stackIn_50_1 = stackOut_48_1;
                                  stackIn_50_2 = stackOut_48_2;
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
                          stackOut_32_0 = (int[]) var10;
                          stackOut_32_1 = var8;
                          stackIn_34_0 = stackOut_32_0;
                          stackIn_34_1 = stackOut_32_1;
                          stackIn_33_0 = stackOut_32_0;
                          stackIn_33_1 = stackOut_32_1;
                          if (var5 != 0) {
                            stackOut_34_0 = (int[]) (Object) stackIn_34_0;
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = (var17[var8] << 12) / var5;
                            stackIn_35_0 = stackOut_34_0;
                            stackIn_35_1 = stackOut_34_1;
                            stackIn_35_2 = stackOut_34_2;
                            break L20;
                          } else {
                            stackOut_33_0 = (int[]) (Object) stackIn_33_0;
                            stackOut_33_1 = stackIn_33_1;
                            stackOut_33_2 = 4096;
                            stackIn_35_0 = stackOut_33_0;
                            stackIn_35_1 = stackOut_33_1;
                            stackIn_35_2 = stackOut_33_2;
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
        int var5 = Torquing.field_u;
        int var1 = 108 % ((-51 - param0) / 63);
        if (lc.field_z > 0) {
            lc.field_z = lc.field_z - 1;
            var2 = (ii) (Object) bd.field_s.a((byte) 106);
            bp.field_a.a((byte) 54, (q) (Object) var2);
            var3 = var2.field_l;
            var2.field_l = null;
            var4 = 0;
            while (var4 < 64) {
                int incrementValue$0 = var4;
                var4++;
                var3[incrementValue$0] = 0L;
                int incrementValue$1 = var4;
                var4++;
                var3[incrementValue$1] = 0L;
                int incrementValue$2 = var4;
                var4++;
                var3[incrementValue$2] = 0L;
                int incrementValue$3 = var4;
                var4++;
                var3[incrementValue$3] = 0L;
                int incrementValue$4 = var4;
                var4++;
                var3[incrementValue$4] = 0L;
                int incrementValue$5 = var4;
                var4++;
                var3[incrementValue$5] = 0L;
                int incrementValue$6 = var4;
                var4++;
                var3[incrementValue$6] = 0L;
                int incrementValue$7 = var4;
                var4++;
                var3[incrementValue$7] = 0L;
            }
            return var3;
        }
        return new long[64];
    }

    public static void g() {
        field_t = null;
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final static void a(boolean param0) {
        Object var1 = null;
        Throwable var2 = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        L0: {
          if (ha.field_b == null) {
            break L0;
          } else {
            var1 = (Object) (Object) ha.field_b;
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
            var3 = null;
            li discarded$2 = ee.a((byte[]) null, 74);
            break L2;
          }
        }
    }

    final int[][] a(int param0, int param1) {
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
        int[][] var42 = null;
        int[][] var51 = null;
        int[][] var52 = null;
        int[][] var53 = null;
        int[] var54 = null;
        int[] var55 = null;
        int[] var56 = null;
        int[] var57 = null;
        int[] var58 = null;
        int[] var59 = null;
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
        L0: {
          var22 = Torquing.field_u;
          if (param0 == -29116) {
            break L0;
          } else {
            ((ee) this).field_u = -9;
            break L0;
          }
        }
        L1: {
          var51 = ((ee) this).field_r.a(15142, param1);
          var42 = var51;
          var33 = var42;
          var24 = var33;
          var23 = var24;
          var3 = var23;
          if (((ee) this).field_r.field_b) {
            var52 = ((ee) this).c(param0 + 53182, param1, 0);
            var53 = ((ee) this).c(param0 + 53182, param1, 1);
            var12 = var51[0];
            var13 = var51[1];
            var14 = var51[2];
            var55 = var52[0];
            var57 = var52[1];
            var59 = var52[2];
            var54 = var53[0];
            var56 = var53[1];
            var58 = var53[2];
            var21 = ((ee) this).field_u;
            if (1 != var21) {
              if (var21 != 2) {
                if (var21 == 3) {
                  var12 = var51[0];
                  var13 = var51[1];
                  var14 = var51[2];
                  var54 = var53[0];
                  var55 = var52[0];
                  var56 = var53[1];
                  var57 = var52[1];
                  var58 = var53[2];
                  var59 = var52[2];
                  var21 = 0;
                  L2: while (true) {
                    if (ci.field_c <= var21) {
                      break L1;
                    } else {
                      var12[var21] = var54[var21] * var55[var21] >> 12;
                      var13[var21] = var57[var21] * var56[var21] >> 12;
                      var14[var21] = var59[var21] * var58[var21] >> 12;
                      var21++;
                      continue L2;
                    }
                  }
                } else {
                  if (var21 == 4) {
                    var12 = var51[0];
                    var13 = var51[1];
                    var14 = var51[2];
                    var54 = var53[0];
                    var55 = var52[0];
                    var56 = var53[1];
                    var57 = var52[1];
                    var58 = var53[2];
                    var59 = var52[2];
                    var21 = 0;
                    L3: while (true) {
                      if (~ci.field_c >= ~var21) {
                        break L1;
                      } else {
                        L4: {
                          var9 = var58[var21];
                          var8 = var56[var21];
                          var7 = var54[var21];
                          stackOut_33_0 = (int[]) var12;
                          stackOut_33_1 = var21;
                          stackIn_35_0 = stackOut_33_0;
                          stackIn_35_1 = stackOut_33_1;
                          stackIn_34_0 = stackOut_33_0;
                          stackIn_34_1 = stackOut_33_1;
                          if (0 != var7) {
                            stackOut_35_0 = (int[]) (Object) stackIn_35_0;
                            stackOut_35_1 = stackIn_35_1;
                            stackOut_35_2 = (var55[var21] << 12) / var7;
                            stackIn_36_0 = stackOut_35_0;
                            stackIn_36_1 = stackOut_35_1;
                            stackIn_36_2 = stackOut_35_2;
                            break L4;
                          } else {
                            stackOut_34_0 = (int[]) (Object) stackIn_34_0;
                            stackOut_34_1 = stackIn_34_1;
                            stackOut_34_2 = 4096;
                            stackIn_36_0 = stackOut_34_0;
                            stackIn_36_1 = stackOut_34_1;
                            stackIn_36_2 = stackOut_34_2;
                            break L4;
                          }
                        }
                        L5: {
                          stackIn_36_0[stackIn_36_1] = stackIn_36_2;
                          stackOut_36_0 = (int[]) var13;
                          stackOut_36_1 = var21;
                          stackIn_38_0 = stackOut_36_0;
                          stackIn_38_1 = stackOut_36_1;
                          stackIn_37_0 = stackOut_36_0;
                          stackIn_37_1 = stackOut_36_1;
                          if (0 == var8) {
                            stackOut_38_0 = (int[]) (Object) stackIn_38_0;
                            stackOut_38_1 = stackIn_38_1;
                            stackOut_38_2 = 4096;
                            stackIn_39_0 = stackOut_38_0;
                            stackIn_39_1 = stackOut_38_1;
                            stackIn_39_2 = stackOut_38_2;
                            break L5;
                          } else {
                            stackOut_37_0 = (int[]) (Object) stackIn_37_0;
                            stackOut_37_1 = stackIn_37_1;
                            stackOut_37_2 = (var57[var21] << 12) / var8;
                            stackIn_39_0 = stackOut_37_0;
                            stackIn_39_1 = stackOut_37_1;
                            stackIn_39_2 = stackOut_37_2;
                            break L5;
                          }
                        }
                        L6: {
                          stackIn_39_0[stackIn_39_1] = stackIn_39_2;
                          stackOut_39_0 = (int[]) var14;
                          stackOut_39_1 = var21;
                          stackIn_41_0 = stackOut_39_0;
                          stackIn_41_1 = stackOut_39_1;
                          stackIn_40_0 = stackOut_39_0;
                          stackIn_40_1 = stackOut_39_1;
                          if (var9 != 0) {
                            stackOut_41_0 = (int[]) (Object) stackIn_41_0;
                            stackOut_41_1 = stackIn_41_1;
                            stackOut_41_2 = (var59[var21] << 12) / var9;
                            stackIn_42_0 = stackOut_41_0;
                            stackIn_42_1 = stackOut_41_1;
                            stackIn_42_2 = stackOut_41_2;
                            break L6;
                          } else {
                            stackOut_40_0 = (int[]) (Object) stackIn_40_0;
                            stackOut_40_1 = stackIn_40_1;
                            stackOut_40_2 = 4096;
                            stackIn_42_0 = stackOut_40_0;
                            stackIn_42_1 = stackOut_40_1;
                            stackIn_42_2 = stackOut_40_2;
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
                      var12 = var51[0];
                      var13 = var51[1];
                      var14 = var51[2];
                      var54 = var53[0];
                      var55 = var52[0];
                      var56 = var53[1];
                      var57 = var52[1];
                      var58 = var53[2];
                      var59 = var52[2];
                      var21 = 0;
                      L7: while (true) {
                        if (var21 >= ci.field_c) {
                          break L1;
                        } else {
                          var12[var21] = 4096 + -((4096 - var55[var21]) * (-var54[var21] + 4096) >> 12);
                          var13[var21] = -((4096 + -var57[var21]) * (-var56[var21] + 4096) >> 12) + 4096;
                          var14[var21] = -((-var59[var21] + 4096) * (4096 + -var58[var21]) >> 12) + 4096;
                          var21++;
                          continue L7;
                        }
                      }
                    } else {
                      if (var21 == 6) {
                        var12 = var51[0];
                        var13 = var51[1];
                        var14 = var51[2];
                        var54 = var53[0];
                        var55 = var52[0];
                        var56 = var53[1];
                        var57 = var52[1];
                        var58 = var53[2];
                        var59 = var52[2];
                        var21 = 0;
                        L8: while (true) {
                          if (var21 >= ci.field_c) {
                            break L1;
                          } else {
                            L9: {
                              var9 = var58[var21];
                              var7 = var54[var21];
                              var8 = var56[var21];
                              stackOut_48_0 = (int[]) var12;
                              stackOut_48_1 = var21;
                              stackIn_50_0 = stackOut_48_0;
                              stackIn_50_1 = stackOut_48_1;
                              stackIn_49_0 = stackOut_48_0;
                              stackIn_49_1 = stackOut_48_1;
                              if (var7 >= 2048) {
                                stackOut_50_0 = (int[]) (Object) stackIn_50_0;
                                stackOut_50_1 = stackIn_50_1;
                                stackOut_50_2 = 4096 + -((4096 + -var7) * (-var55[var21] + 4096) >> 11);
                                stackIn_51_0 = stackOut_50_0;
                                stackIn_51_1 = stackOut_50_1;
                                stackIn_51_2 = stackOut_50_2;
                                break L9;
                              } else {
                                stackOut_49_0 = (int[]) (Object) stackIn_49_0;
                                stackOut_49_1 = stackIn_49_1;
                                stackOut_49_2 = var7 * var55[var21] >> 11;
                                stackIn_51_0 = stackOut_49_0;
                                stackIn_51_1 = stackOut_49_1;
                                stackIn_51_2 = stackOut_49_2;
                                break L9;
                              }
                            }
                            L10: {
                              stackIn_51_0[stackIn_51_1] = stackIn_51_2;
                              stackOut_51_0 = (int[]) var13;
                              stackOut_51_1 = var21;
                              stackIn_53_0 = stackOut_51_0;
                              stackIn_53_1 = stackOut_51_1;
                              stackIn_52_0 = stackOut_51_0;
                              stackIn_52_1 = stackOut_51_1;
                              if (2048 <= var8) {
                                stackOut_53_0 = (int[]) (Object) stackIn_53_0;
                                stackOut_53_1 = stackIn_53_1;
                                stackOut_53_2 = -((4096 - var8) * (4096 + -var57[var21]) >> 11) + 4096;
                                stackIn_54_0 = stackOut_53_0;
                                stackIn_54_1 = stackOut_53_1;
                                stackIn_54_2 = stackOut_53_2;
                                break L10;
                              } else {
                                stackOut_52_0 = (int[]) (Object) stackIn_52_0;
                                stackOut_52_1 = stackIn_52_1;
                                stackOut_52_2 = var57[var21] * var8 >> 11;
                                stackIn_54_0 = stackOut_52_0;
                                stackIn_54_1 = stackOut_52_1;
                                stackIn_54_2 = stackOut_52_2;
                                break L10;
                              }
                            }
                            L11: {
                              stackIn_54_0[stackIn_54_1] = stackIn_54_2;
                              stackOut_54_0 = (int[]) var14;
                              stackOut_54_1 = var21;
                              stackIn_56_0 = stackOut_54_0;
                              stackIn_56_1 = stackOut_54_1;
                              stackIn_55_0 = stackOut_54_0;
                              stackIn_55_1 = stackOut_54_1;
                              if (var9 < 2048) {
                                stackOut_56_0 = (int[]) (Object) stackIn_56_0;
                                stackOut_56_1 = stackIn_56_1;
                                stackOut_56_2 = var9 * var59[var21] >> 11;
                                stackIn_57_0 = stackOut_56_0;
                                stackIn_57_1 = stackOut_56_1;
                                stackIn_57_2 = stackOut_56_2;
                                break L11;
                              } else {
                                stackOut_55_0 = (int[]) (Object) stackIn_55_0;
                                stackOut_55_1 = stackIn_55_1;
                                stackOut_55_2 = -((4096 - var9) * (4096 - var59[var21]) >> 11) + 4096;
                                stackIn_57_0 = stackOut_55_0;
                                stackIn_57_1 = stackOut_55_1;
                                stackIn_57_2 = stackOut_55_2;
                                break L11;
                              }
                            }
                            stackIn_57_0[stackIn_57_1] = stackIn_57_2;
                            var21++;
                            continue L8;
                          }
                        }
                      } else {
                        if (var21 == 7) {
                          var12 = var51[0];
                          var13 = var51[1];
                          var14 = var51[2];
                          var54 = var53[0];
                          var55 = var52[0];
                          var56 = var53[1];
                          var57 = var52[1];
                          var58 = var53[2];
                          var59 = var52[2];
                          var21 = 0;
                          L12: while (true) {
                            if (var21 >= ci.field_c) {
                              break L1;
                            } else {
                              L13: {
                                var5 = var57[var21];
                                var6 = var59[var21];
                                var4 = var55[var21];
                                stackOut_60_0 = (int[]) var12;
                                stackOut_60_1 = var21;
                                stackIn_62_0 = stackOut_60_0;
                                stackIn_62_1 = stackOut_60_1;
                                stackIn_61_0 = stackOut_60_0;
                                stackIn_61_1 = stackOut_60_1;
                                if (var4 == 4096) {
                                  stackOut_62_0 = (int[]) (Object) stackIn_62_0;
                                  stackOut_62_1 = stackIn_62_1;
                                  stackOut_62_2 = 4096;
                                  stackIn_63_0 = stackOut_62_0;
                                  stackIn_63_1 = stackOut_62_1;
                                  stackIn_63_2 = stackOut_62_2;
                                  break L13;
                                } else {
                                  stackOut_61_0 = (int[]) (Object) stackIn_61_0;
                                  stackOut_61_1 = stackIn_61_1;
                                  stackOut_61_2 = (var54[var21] << 12) / (4096 - var4);
                                  stackIn_63_0 = stackOut_61_0;
                                  stackIn_63_1 = stackOut_61_1;
                                  stackIn_63_2 = stackOut_61_2;
                                  break L13;
                                }
                              }
                              L14: {
                                stackIn_63_0[stackIn_63_1] = stackIn_63_2;
                                stackOut_63_0 = (int[]) var13;
                                stackOut_63_1 = var21;
                                stackIn_65_0 = stackOut_63_0;
                                stackIn_65_1 = stackOut_63_1;
                                stackIn_64_0 = stackOut_63_0;
                                stackIn_64_1 = stackOut_63_1;
                                if (var5 != 4096) {
                                  stackOut_65_0 = (int[]) (Object) stackIn_65_0;
                                  stackOut_65_1 = stackIn_65_1;
                                  stackOut_65_2 = (var56[var21] << 12) / (4096 - var5);
                                  stackIn_66_0 = stackOut_65_0;
                                  stackIn_66_1 = stackOut_65_1;
                                  stackIn_66_2 = stackOut_65_2;
                                  break L14;
                                } else {
                                  stackOut_64_0 = (int[]) (Object) stackIn_64_0;
                                  stackOut_64_1 = stackIn_64_1;
                                  stackOut_64_2 = 4096;
                                  stackIn_66_0 = stackOut_64_0;
                                  stackIn_66_1 = stackOut_64_1;
                                  stackIn_66_2 = stackOut_64_2;
                                  break L14;
                                }
                              }
                              L15: {
                                stackIn_66_0[stackIn_66_1] = stackIn_66_2;
                                stackOut_66_0 = (int[]) var14;
                                stackOut_66_1 = var21;
                                stackIn_68_0 = stackOut_66_0;
                                stackIn_68_1 = stackOut_66_1;
                                stackIn_67_0 = stackOut_66_0;
                                stackIn_67_1 = stackOut_66_1;
                                if (var6 != 4096) {
                                  stackOut_68_0 = (int[]) (Object) stackIn_68_0;
                                  stackOut_68_1 = stackIn_68_1;
                                  stackOut_68_2 = (var58[var21] << 12) / (4096 - var6);
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  stackIn_69_2 = stackOut_68_2;
                                  break L15;
                                } else {
                                  stackOut_67_0 = (int[]) (Object) stackIn_67_0;
                                  stackOut_67_1 = stackIn_67_1;
                                  stackOut_67_2 = 4096;
                                  stackIn_69_0 = stackOut_67_0;
                                  stackIn_69_1 = stackOut_67_1;
                                  stackIn_69_2 = stackOut_67_2;
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
                            var12 = var51[0];
                            var13 = var51[1];
                            var14 = var51[2];
                            var54 = var53[0];
                            var55 = var52[0];
                            var56 = var53[1];
                            var57 = var52[1];
                            var58 = var53[2];
                            var59 = var52[2];
                            var21 = 0;
                            L16: while (true) {
                              if (~var21 <= ~ci.field_c) {
                                break L1;
                              } else {
                                L17: {
                                  var6 = var59[var21];
                                  var5 = var57[var21];
                                  var4 = var55[var21];
                                  stackOut_72_0 = (int[]) var12;
                                  stackOut_72_1 = var21;
                                  stackIn_74_0 = stackOut_72_0;
                                  stackIn_74_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (var4 == 0) {
                                    stackOut_74_0 = (int[]) (Object) stackIn_74_0;
                                    stackOut_74_1 = stackIn_74_1;
                                    stackOut_74_2 = 0;
                                    stackIn_75_0 = stackOut_74_0;
                                    stackIn_75_1 = stackOut_74_1;
                                    stackIn_75_2 = stackOut_74_2;
                                    break L17;
                                  } else {
                                    stackOut_73_0 = (int[]) (Object) stackIn_73_0;
                                    stackOut_73_1 = stackIn_73_1;
                                    stackOut_73_2 = -((-var54[var21] + 4096 << 12) / var4) + 4096;
                                    stackIn_75_0 = stackOut_73_0;
                                    stackIn_75_1 = stackOut_73_1;
                                    stackIn_75_2 = stackOut_73_2;
                                    break L17;
                                  }
                                }
                                L18: {
                                  stackIn_75_0[stackIn_75_1] = stackIn_75_2;
                                  stackOut_75_0 = (int[]) var13;
                                  stackOut_75_1 = var21;
                                  stackIn_77_0 = stackOut_75_0;
                                  stackIn_77_1 = stackOut_75_1;
                                  stackIn_76_0 = stackOut_75_0;
                                  stackIn_76_1 = stackOut_75_1;
                                  if (var5 != 0) {
                                    stackOut_77_0 = (int[]) (Object) stackIn_77_0;
                                    stackOut_77_1 = stackIn_77_1;
                                    stackOut_77_2 = -((4096 - var56[var21] << 12) / var5) + 4096;
                                    stackIn_78_0 = stackOut_77_0;
                                    stackIn_78_1 = stackOut_77_1;
                                    stackIn_78_2 = stackOut_77_2;
                                    break L18;
                                  } else {
                                    stackOut_76_0 = (int[]) (Object) stackIn_76_0;
                                    stackOut_76_1 = stackIn_76_1;
                                    stackOut_76_2 = 0;
                                    stackIn_78_0 = stackOut_76_0;
                                    stackIn_78_1 = stackOut_76_1;
                                    stackIn_78_2 = stackOut_76_2;
                                    break L18;
                                  }
                                }
                                L19: {
                                  stackIn_78_0[stackIn_78_1] = stackIn_78_2;
                                  stackOut_78_0 = (int[]) var14;
                                  stackOut_78_1 = var21;
                                  stackIn_80_0 = stackOut_78_0;
                                  stackIn_80_1 = stackOut_78_1;
                                  stackIn_79_0 = stackOut_78_0;
                                  stackIn_79_1 = stackOut_78_1;
                                  if (0 != var6) {
                                    stackOut_80_0 = (int[]) (Object) stackIn_80_0;
                                    stackOut_80_1 = stackIn_80_1;
                                    stackOut_80_2 = -((4096 + -var58[var21] << 12) / var6) + 4096;
                                    stackIn_81_0 = stackOut_80_0;
                                    stackIn_81_1 = stackOut_80_1;
                                    stackIn_81_2 = stackOut_80_2;
                                    break L19;
                                  } else {
                                    stackOut_79_0 = (int[]) (Object) stackIn_79_0;
                                    stackOut_79_1 = stackIn_79_1;
                                    stackOut_79_2 = 0;
                                    stackIn_81_0 = stackOut_79_0;
                                    stackIn_81_1 = stackOut_79_1;
                                    stackIn_81_2 = stackOut_79_2;
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
                                if (var21 != 11) {
                                  if (var21 != 12) {
                                    break L1;
                                  } else {
                                    var12 = var51[0];
                                    var13 = var51[1];
                                    var14 = var51[2];
                                    var54 = var53[0];
                                    var55 = var52[0];
                                    var56 = var53[1];
                                    var57 = var52[1];
                                    var58 = var53[2];
                                    var59 = var52[2];
                                    var21 = 0;
                                    L20: while (true) {
                                      if (ci.field_c <= var21) {
                                        break L1;
                                      } else {
                                        var8 = var56[var21];
                                        var4 = var55[var21];
                                        var5 = var57[var21];
                                        var6 = var59[var21];
                                        var9 = var58[var21];
                                        var7 = var54[var21];
                                        var12[var21] = -(var7 * var4 >> 11) + var4 - -var7;
                                        var13[var21] = var8 + (var5 + -(var5 * var8 >> 11));
                                        var14[var21] = var6 + var9 + -(var9 * var6 >> 11);
                                        var21++;
                                        continue L20;
                                      }
                                    }
                                  }
                                } else {
                                  var12 = var51[0];
                                  var13 = var51[1];
                                  var14 = var51[2];
                                  var54 = var53[0];
                                  var55 = var52[0];
                                  var56 = var53[1];
                                  var57 = var52[1];
                                  var58 = var53[2];
                                  var59 = var52[2];
                                  var21 = 0;
                                  L21: while (true) {
                                    if (ci.field_c <= var21) {
                                      break L1;
                                    } else {
                                      L22: {
                                        var9 = var58[var21];
                                        var6 = var59[var21];
                                        var8 = var56[var21];
                                        var5 = var57[var21];
                                        var7 = var54[var21];
                                        var4 = var55[var21];
                                        stackOut_108_0 = (int[]) var12;
                                        stackOut_108_1 = var21;
                                        stackIn_110_0 = stackOut_108_0;
                                        stackIn_110_1 = stackOut_108_1;
                                        stackIn_109_0 = stackOut_108_0;
                                        stackIn_109_1 = stackOut_108_1;
                                        if (~var7 <= ~var4) {
                                          stackOut_110_0 = (int[]) (Object) stackIn_110_0;
                                          stackOut_110_1 = stackIn_110_1;
                                          stackOut_110_2 = var7 - var4;
                                          stackIn_111_0 = stackOut_110_0;
                                          stackIn_111_1 = stackOut_110_1;
                                          stackIn_111_2 = stackOut_110_2;
                                          break L22;
                                        } else {
                                          stackOut_109_0 = (int[]) (Object) stackIn_109_0;
                                          stackOut_109_1 = stackIn_109_1;
                                          stackOut_109_2 = -var7 + var4;
                                          stackIn_111_0 = stackOut_109_0;
                                          stackIn_111_1 = stackOut_109_1;
                                          stackIn_111_2 = stackOut_109_2;
                                          break L22;
                                        }
                                      }
                                      L23: {
                                        stackIn_111_0[stackIn_111_1] = stackIn_111_2;
                                        stackOut_111_0 = (int[]) var13;
                                        stackOut_111_1 = var21;
                                        stackIn_113_0 = stackOut_111_0;
                                        stackIn_113_1 = stackOut_111_1;
                                        stackIn_112_0 = stackOut_111_0;
                                        stackIn_112_1 = stackOut_111_1;
                                        if (var8 >= var5) {
                                          stackOut_113_0 = (int[]) (Object) stackIn_113_0;
                                          stackOut_113_1 = stackIn_113_1;
                                          stackOut_113_2 = var8 - var5;
                                          stackIn_114_0 = stackOut_113_0;
                                          stackIn_114_1 = stackOut_113_1;
                                          stackIn_114_2 = stackOut_113_2;
                                          break L23;
                                        } else {
                                          stackOut_112_0 = (int[]) (Object) stackIn_112_0;
                                          stackOut_112_1 = stackIn_112_1;
                                          stackOut_112_2 = var5 - var8;
                                          stackIn_114_0 = stackOut_112_0;
                                          stackIn_114_1 = stackOut_112_1;
                                          stackIn_114_2 = stackOut_112_2;
                                          break L23;
                                        }
                                      }
                                      L24: {
                                        stackIn_114_0[stackIn_114_1] = stackIn_114_2;
                                        stackOut_114_0 = (int[]) var14;
                                        stackOut_114_1 = var21;
                                        stackIn_116_0 = stackOut_114_0;
                                        stackIn_116_1 = stackOut_114_1;
                                        stackIn_115_0 = stackOut_114_0;
                                        stackIn_115_1 = stackOut_114_1;
                                        if (var9 >= var6) {
                                          stackOut_116_0 = (int[]) (Object) stackIn_116_0;
                                          stackOut_116_1 = stackIn_116_1;
                                          stackOut_116_2 = var9 + -var6;
                                          stackIn_117_0 = stackOut_116_0;
                                          stackIn_117_1 = stackOut_116_1;
                                          stackIn_117_2 = stackOut_116_2;
                                          break L24;
                                        } else {
                                          stackOut_115_0 = (int[]) (Object) stackIn_115_0;
                                          stackOut_115_1 = stackIn_115_1;
                                          stackOut_115_2 = var6 + -var9;
                                          stackIn_117_0 = stackOut_115_0;
                                          stackIn_117_1 = stackOut_115_1;
                                          stackIn_117_2 = stackOut_115_2;
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
                                var12 = var51[0];
                                var13 = var51[1];
                                var14 = var51[2];
                                var54 = var53[0];
                                var55 = var52[0];
                                var56 = var53[1];
                                var57 = var52[1];
                                var58 = var53[2];
                                var59 = var52[2];
                                var21 = 0;
                                L25: while (true) {
                                  if (~var21 <= ~ci.field_c) {
                                    break L1;
                                  } else {
                                    L26: {
                                      var7 = var54[var21];
                                      var6 = var59[var21];
                                      var9 = var58[var21];
                                      var8 = var56[var21];
                                      var5 = var57[var21];
                                      var4 = var55[var21];
                                      stackOut_96_0 = (int[]) var12;
                                      stackOut_96_1 = var21;
                                      stackIn_98_0 = stackOut_96_0;
                                      stackIn_98_1 = stackOut_96_1;
                                      stackIn_97_0 = stackOut_96_0;
                                      stackIn_97_1 = stackOut_96_1;
                                      if (var4 > var7) {
                                        stackOut_98_0 = (int[]) (Object) stackIn_98_0;
                                        stackOut_98_1 = stackIn_98_1;
                                        stackOut_98_2 = var4;
                                        stackIn_99_0 = stackOut_98_0;
                                        stackIn_99_1 = stackOut_98_1;
                                        stackIn_99_2 = stackOut_98_2;
                                        break L26;
                                      } else {
                                        stackOut_97_0 = (int[]) (Object) stackIn_97_0;
                                        stackOut_97_1 = stackIn_97_1;
                                        stackOut_97_2 = var7;
                                        stackIn_99_0 = stackOut_97_0;
                                        stackIn_99_1 = stackOut_97_1;
                                        stackIn_99_2 = stackOut_97_2;
                                        break L26;
                                      }
                                    }
                                    L27: {
                                      stackIn_99_0[stackIn_99_1] = stackIn_99_2;
                                      stackOut_99_0 = (int[]) var13;
                                      stackOut_99_1 = var21;
                                      stackIn_101_0 = stackOut_99_0;
                                      stackIn_101_1 = stackOut_99_1;
                                      stackIn_100_0 = stackOut_99_0;
                                      stackIn_100_1 = stackOut_99_1;
                                      if (var5 <= var8) {
                                        stackOut_101_0 = (int[]) (Object) stackIn_101_0;
                                        stackOut_101_1 = stackIn_101_1;
                                        stackOut_101_2 = var8;
                                        stackIn_102_0 = stackOut_101_0;
                                        stackIn_102_1 = stackOut_101_1;
                                        stackIn_102_2 = stackOut_101_2;
                                        break L27;
                                      } else {
                                        stackOut_100_0 = (int[]) (Object) stackIn_100_0;
                                        stackOut_100_1 = stackIn_100_1;
                                        stackOut_100_2 = var5;
                                        stackIn_102_0 = stackOut_100_0;
                                        stackIn_102_1 = stackOut_100_1;
                                        stackIn_102_2 = stackOut_100_2;
                                        break L27;
                                      }
                                    }
                                    L28: {
                                      stackIn_102_0[stackIn_102_1] = stackIn_102_2;
                                      stackOut_102_0 = (int[]) var14;
                                      stackOut_102_1 = var21;
                                      stackIn_104_0 = stackOut_102_0;
                                      stackIn_104_1 = stackOut_102_1;
                                      stackIn_103_0 = stackOut_102_0;
                                      stackIn_103_1 = stackOut_102_1;
                                      if (var9 >= var6) {
                                        stackOut_104_0 = (int[]) (Object) stackIn_104_0;
                                        stackOut_104_1 = stackIn_104_1;
                                        stackOut_104_2 = var9;
                                        stackIn_105_0 = stackOut_104_0;
                                        stackIn_105_1 = stackOut_104_1;
                                        stackIn_105_2 = stackOut_104_2;
                                        break L28;
                                      } else {
                                        stackOut_103_0 = (int[]) (Object) stackIn_103_0;
                                        stackOut_103_1 = stackIn_103_1;
                                        stackOut_103_2 = var6;
                                        stackIn_105_0 = stackOut_103_0;
                                        stackIn_105_1 = stackOut_103_1;
                                        stackIn_105_2 = stackOut_103_2;
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
                              var12 = var51[0];
                              var13 = var51[1];
                              var14 = var51[2];
                              var54 = var53[0];
                              var55 = var52[0];
                              var56 = var53[1];
                              var57 = var52[1];
                              var58 = var53[2];
                              var59 = var52[2];
                              var21 = 0;
                              L29: while (true) {
                                if (~ci.field_c >= ~var21) {
                                  break L1;
                                } else {
                                  L30: {
                                    var4 = var55[var21];
                                    var6 = var59[var21];
                                    var8 = var56[var21];
                                    var5 = var57[var21];
                                    var7 = var54[var21];
                                    var9 = var58[var21];
                                    stackOut_84_0 = (int[]) var12;
                                    stackOut_84_1 = var21;
                                    stackIn_86_0 = stackOut_84_0;
                                    stackIn_86_1 = stackOut_84_1;
                                    stackIn_85_0 = stackOut_84_0;
                                    stackIn_85_1 = stackOut_84_1;
                                    if (~var7 < ~var4) {
                                      stackOut_86_0 = (int[]) (Object) stackIn_86_0;
                                      stackOut_86_1 = stackIn_86_1;
                                      stackOut_86_2 = var4;
                                      stackIn_87_0 = stackOut_86_0;
                                      stackIn_87_1 = stackOut_86_1;
                                      stackIn_87_2 = stackOut_86_2;
                                      break L30;
                                    } else {
                                      stackOut_85_0 = (int[]) (Object) stackIn_85_0;
                                      stackOut_85_1 = stackIn_85_1;
                                      stackOut_85_2 = var7;
                                      stackIn_87_0 = stackOut_85_0;
                                      stackIn_87_1 = stackOut_85_1;
                                      stackIn_87_2 = stackOut_85_2;
                                      break L30;
                                    }
                                  }
                                  L31: {
                                    stackIn_87_0[stackIn_87_1] = stackIn_87_2;
                                    stackOut_87_0 = (int[]) var13;
                                    stackOut_87_1 = var21;
                                    stackIn_89_0 = stackOut_87_0;
                                    stackIn_89_1 = stackOut_87_1;
                                    stackIn_88_0 = stackOut_87_0;
                                    stackIn_88_1 = stackOut_87_1;
                                    if (~var5 > ~var8) {
                                      stackOut_89_0 = (int[]) (Object) stackIn_89_0;
                                      stackOut_89_1 = stackIn_89_1;
                                      stackOut_89_2 = var5;
                                      stackIn_90_0 = stackOut_89_0;
                                      stackIn_90_1 = stackOut_89_1;
                                      stackIn_90_2 = stackOut_89_2;
                                      break L31;
                                    } else {
                                      stackOut_88_0 = (int[]) (Object) stackIn_88_0;
                                      stackOut_88_1 = stackIn_88_1;
                                      stackOut_88_2 = var8;
                                      stackIn_90_0 = stackOut_88_0;
                                      stackIn_90_1 = stackOut_88_1;
                                      stackIn_90_2 = stackOut_88_2;
                                      break L31;
                                    }
                                  }
                                  L32: {
                                    stackIn_90_0[stackIn_90_1] = stackIn_90_2;
                                    stackOut_90_0 = (int[]) var14;
                                    stackOut_90_1 = var21;
                                    stackIn_92_0 = stackOut_90_0;
                                    stackIn_92_1 = stackOut_90_1;
                                    stackIn_91_0 = stackOut_90_0;
                                    stackIn_91_1 = stackOut_90_1;
                                    if (~var6 > ~var9) {
                                      stackOut_92_0 = (int[]) (Object) stackIn_92_0;
                                      stackOut_92_1 = stackIn_92_1;
                                      stackOut_92_2 = var6;
                                      stackIn_93_0 = stackOut_92_0;
                                      stackIn_93_1 = stackOut_92_1;
                                      stackIn_93_2 = stackOut_92_2;
                                      break L32;
                                    } else {
                                      stackOut_91_0 = (int[]) (Object) stackIn_91_0;
                                      stackOut_91_1 = stackIn_91_1;
                                      stackOut_91_2 = var9;
                                      stackIn_93_0 = stackOut_91_0;
                                      stackIn_93_1 = stackOut_91_1;
                                      stackIn_93_2 = stackOut_91_2;
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
                var12 = var51[0];
                var13 = var51[1];
                var14 = var51[2];
                var54 = var53[0];
                var55 = var52[0];
                var56 = var53[1];
                var57 = var52[1];
                var58 = var53[2];
                var59 = var52[2];
                var21 = 0;
                L33: while (true) {
                  if (var21 >= ci.field_c) {
                    break L1;
                  } else {
                    var12[var21] = var55[var21] - var54[var21];
                    var13[var21] = -var56[var21] + var57[var21];
                    var14[var21] = var59[var21] + -var58[var21];
                    var21++;
                    continue L33;
                  }
                }
              }
            } else {
              var12 = var51[0];
              var13 = var51[1];
              var14 = var51[2];
              var54 = var53[0];
              var55 = var52[0];
              var56 = var53[1];
              var57 = var52[1];
              var58 = var53[2];
              var59 = var52[2];
              var21 = 0;
              L34: while (true) {
                if (var21 >= ci.field_c) {
                  break L1;
                } else {
                  var12[var21] = var54[var21] + var55[var21];
                  var13[var21] = var56[var21] + var57[var21];
                  var14[var21] = var58[var21] + var59[var21];
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
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        li stackOut_5_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
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
              stackOut_5_0 = (li) var2;
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var2_ref;
            stackOut_7_1 = new StringBuilder().append("ee.A(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_10_0, stackIn_10_2 + 44 + param1 + 41);
        }
        return stackIn_6_0;
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_4_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var4_int = param2;
              if (var4_int == 0) {
                ((ee) this).field_u = param0.i((byte) -101);
                break L1;
              } else {
                if (var4_int == 1) {
                  L2: {
                    stackOut_4_0 = this;
                    stackIn_6_0 = stackOut_4_0;
                    stackIn_5_0 = stackOut_4_0;
                    if (param0.i((byte) -101) != 1) {
                      stackOut_6_0 = this;
                      stackOut_6_1 = 0;
                      stackIn_7_0 = stackOut_6_0;
                      stackIn_7_1 = stackOut_6_1;
                      break L2;
                    } else {
                      stackOut_5_0 = this;
                      stackOut_5_1 = 1;
                      stackIn_7_0 = stackOut_5_0;
                      stackIn_7_1 = stackOut_5_1;
                      break L2;
                    }
                  }
                  ((ee) this).field_p = stackIn_7_1 != 0;
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
            stackOut_11_0 = (RuntimeException) var4;
            stackOut_11_1 = new StringBuilder().append("ee.H(");
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public ee() {
        super(2, false);
        ((ee) this).field_u = 6;
    }

    final static void a(boolean param0, double[] param1, double[] param2, double param3, double param4, int param5) {
        RuntimeException var8 = null;
        int var8_int = 0;
        double var9_double = 0.0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        double[] var12 = null;
        double[] var13 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
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
                          if (var8_int >= 8) {
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
                        mg.field_a[8][var8_int] = mc.field_m * bn.field_f[var8_int][7] + tf.field_c * bn.field_f[var8_int][6] + bn.field_f[var8_int][8] * ia.field_d;
                        mg.field_a[var8_int][8] = mc.field_m * bn.field_f[var8_int][7] + tf.field_c * bn.field_f[var8_int][6] + bn.field_f[var8_int][8] * ia.field_d;
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
                    ie.field_a[var8_int][0] = ie.field_a[var8_int][0] / var9_double;
                    ie.field_a[var8_int][1] = ie.field_a[var8_int][1] / var9_double;
                    ie.field_a[var8_int][2] = ie.field_a[var8_int][2] / var9_double;
                    dg.field_f[var8_int][0] = dg.field_f[var8_int][0] / var9_double;
                    dg.field_f[var8_int][1] = dg.field_f[var8_int][1] / var9_double;
                    dg.field_f[var8_int][2] = dg.field_f[var8_int][2] / var9_double;
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
            stackOut_26_0 = (RuntimeException) var8;
            stackOut_26_1 = new StringBuilder().append("ee.E(").append(param0).append(44);
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (param1 == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L9;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L9;
            }
          }
          L10: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(44);
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L10;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L10;
            }
          }
          throw rb.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = new int[8];
        field_v = 0;
    }
}
