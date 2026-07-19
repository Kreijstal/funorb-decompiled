/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ac {
    final static void a(float[] param0, int param1, int param2, float param3, int param4, int param5, byte param6, float param7, int param8, float[] param9, int param10, int param11) {
        RuntimeException var12 = null;
        float var12_float = 0.0f;
        float var13 = 0.0f;
        float var14 = 0.0f;
        float var15 = 0.0f;
        float var16 = 0.0f;
        float var17 = 0.0f;
        int var18 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        var18 = VoidHunters.field_G;
        try {
          L0: {
            param5 = param5 - param1;
            param11 = param11 - param8;
            param4 = param4 - param10;
            var12_float = (float)param4 * param0[0] + param0[1] * (float)param5 + param0[2] * (float)param11;
            var13 = (float)param11 * param0[5] + (param0[3] * (float)param4 + (float)param5 * param0[4]);
            var14 = (float)param4 * param0[6] + (float)param5 * param0[7] + (float)param11 * param0[8];
            var15 = 0.5f + (float)Math.atan2((double)var12_float, (double)var14) / 6.2831854820251465f;
            if (param6 == -52) {
              L1: {
                if (1.0f != param7) {
                  var15 = var15 * param7;
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                L3: {
                  var16 = param3 + (var13 + 0.5f);
                  if ((param2 ^ -1) == -2) {
                    var17 = var15;
                    var15 = -var16;
                    var16 = var17;
                    break L3;
                  } else {
                    if ((param2 ^ -1) != -3) {
                      if (param2 == 3) {
                        var17 = var15;
                        var15 = var16;
                        var16 = -var17;
                        break L3;
                      } else {
                        param9[0] = var15;
                        param9[1] = var16;
                        break L2;
                      }
                    } else {
                      var15 = -var15;
                      var16 = -var16;
                      break L3;
                    }
                  }
                }
                param9[0] = var15;
                param9[1] = var16;
                break L2;
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
          L4: {
            var12 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (var12);
            stackOut_15_1 = new StringBuilder().append("ac.A(");
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L4;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L4;
            }
          }
          L5: {
            stackOut_18_0 = (RuntimeException) ((Object) stackIn_18_0);
            stackOut_18_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
            stackIn_20_0 = stackOut_18_0;
            stackIn_20_1 = stackOut_18_1;
            stackIn_19_0 = stackOut_18_0;
            stackIn_19_1 = stackOut_18_1;
            if (param9 == null) {
              stackOut_20_0 = (RuntimeException) ((Object) stackIn_20_0);
              stackOut_20_1 = (StringBuilder) ((Object) stackIn_20_1);
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L5;
            } else {
              stackOut_19_0 = (RuntimeException) ((Object) stackIn_19_0);
              stackOut_19_1 = (StringBuilder) ((Object) stackIn_19_1);
              stackOut_19_2 = "{...}";
              stackIn_21_0 = stackOut_19_0;
              stackIn_21_1 = stackOut_19_1;
              stackIn_21_2 = stackOut_19_2;
              break L5;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_21_0), stackIn_21_2 + ',' + param10 + ',' + param11 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static int a(int param0, boolean param1, int param2, CharSequence param3, byte[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_70_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        String stackIn_77_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_69_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            var6_int = -param0 + param2;
            if (param1) {
              var7 = 0;
              L1: while (true) {
                if (var7 >= var6_int) {
                  stackOut_69_0 = var6_int;
                  stackIn_70_0 = stackOut_69_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    L3: {
                      L4: {
                        var8 = param3.charAt(param0 + var7);
                        if (0 >= var8) {
                          break L4;
                        } else {
                          if (128 > var8) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        if (160 > var8) {
                          break L5;
                        } else {
                          if (var8 > 255) {
                            break L5;
                          } else {
                            break L3;
                          }
                        }
                      }
                      if (var8 == 8364) {
                        param4[param5 - -var7] = (byte)-128;
                        break L2;
                      } else {
                        if (var8 == 8218) {
                          param4[var7 + param5] = (byte)-126;
                          break L2;
                        } else {
                          if (var8 == 402) {
                            param4[param5 - -var7] = (byte)-125;
                            break L2;
                          } else {
                            if (var8 == 8222) {
                              param4[var7 + param5] = (byte)-124;
                              break L2;
                            } else {
                              if (var8 != 8230) {
                                if (var8 == 8224) {
                                  param4[var7 + param5] = (byte)-122;
                                  break L2;
                                } else {
                                  if (var8 != 8225) {
                                    if (710 != var8) {
                                      if (var8 != 8240) {
                                        if (var8 == 352) {
                                          param4[param5 + var7] = (byte)-118;
                                          break L2;
                                        } else {
                                          if (var8 == 8249) {
                                            param4[var7 + param5] = (byte)-117;
                                            break L2;
                                          } else {
                                            if (var8 != 338) {
                                              if (var8 == 381) {
                                                param4[var7 + param5] = (byte)-114;
                                                break L2;
                                              } else {
                                                if (var8 == 8216) {
                                                  param4[param5 + var7] = (byte)-111;
                                                  break L2;
                                                } else {
                                                  if (var8 == 8217) {
                                                    param4[param5 + var7] = (byte)-110;
                                                    break L2;
                                                  } else {
                                                    if (8220 != var8) {
                                                      if (8221 != var8) {
                                                        if (8226 != var8) {
                                                          if (var8 != 8211) {
                                                            if (var8 == 8212) {
                                                              param4[var7 + param5] = (byte)-105;
                                                              break L2;
                                                            } else {
                                                              if (var8 != 732) {
                                                                if (var8 != 8482) {
                                                                  if (var8 != 353) {
                                                                    if (var8 != 8250) {
                                                                      if (339 == var8) {
                                                                        param4[var7 + param5] = (byte)-100;
                                                                        break L2;
                                                                      } else {
                                                                        if (var8 == 382) {
                                                                          param4[param5 + var7] = (byte)-98;
                                                                          break L2;
                                                                        } else {
                                                                          if (376 != var8) {
                                                                            param4[param5 + var7] = (byte)63;
                                                                            break L2;
                                                                          } else {
                                                                            param4[var7 + param5] = (byte)-97;
                                                                            break L2;
                                                                          }
                                                                        }
                                                                      }
                                                                    } else {
                                                                      param4[var7 + param5] = (byte)-101;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    param4[var7 + param5] = (byte)-102;
                                                                    break L2;
                                                                  }
                                                                } else {
                                                                  param4[param5 + var7] = (byte)-103;
                                                                  break L2;
                                                                }
                                                              } else {
                                                                param4[param5 - -var7] = (byte)-104;
                                                                break L2;
                                                              }
                                                            }
                                                          } else {
                                                            param4[var7 + param5] = (byte)-106;
                                                            break L2;
                                                          }
                                                        } else {
                                                          param4[param5 + var7] = (byte)-107;
                                                          break L2;
                                                        }
                                                      } else {
                                                        param4[var7 + param5] = (byte)-108;
                                                        break L2;
                                                      }
                                                    } else {
                                                      param4[var7 + param5] = (byte)-109;
                                                      break L2;
                                                    }
                                                  }
                                                }
                                              }
                                            } else {
                                              param4[var7 + param5] = (byte)-116;
                                              break L2;
                                            }
                                          }
                                        }
                                      } else {
                                        param4[param5 - -var7] = (byte)-119;
                                        break L2;
                                      }
                                    } else {
                                      param4[var7 + param5] = (byte)-120;
                                      break L2;
                                    }
                                  } else {
                                    param4[param5 + var7] = (byte)-121;
                                    break L2;
                                  }
                                }
                              } else {
                                param4[param5 - -var7] = (byte)-123;
                                break L2;
                              }
                            }
                          }
                        }
                      }
                    }
                    param4[param5 + var7] = (byte)var8;
                    break L2;
                  }
                  var7++;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = -10;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) (var6);
            stackOut_71_1 = new StringBuilder().append("ac.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) ((Object) stackIn_73_0);
              stackOut_73_1 = (StringBuilder) ((Object) stackIn_73_1);
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L6;
            } else {
              stackOut_72_0 = (RuntimeException) ((Object) stackIn_72_0);
              stackOut_72_1 = (StringBuilder) ((Object) stackIn_72_1);
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L6;
            }
          }
          L7: {
            stackOut_74_0 = (RuntimeException) ((Object) stackIn_74_0);
            stackOut_74_1 = ((StringBuilder) (Object) stackIn_74_1).append(stackIn_74_2).append(',');
            stackIn_76_0 = stackOut_74_0;
            stackIn_76_1 = stackOut_74_1;
            stackIn_75_0 = stackOut_74_0;
            stackIn_75_1 = stackOut_74_1;
            if (param4 == null) {
              stackOut_76_0 = (RuntimeException) ((Object) stackIn_76_0);
              stackOut_76_1 = (StringBuilder) ((Object) stackIn_76_1);
              stackOut_76_2 = "null";
              stackIn_77_0 = stackOut_76_0;
              stackIn_77_1 = stackOut_76_1;
              stackIn_77_2 = stackOut_76_2;
              break L7;
            } else {
              stackOut_75_0 = (RuntimeException) ((Object) stackIn_75_0);
              stackOut_75_1 = (StringBuilder) ((Object) stackIn_75_1);
              stackOut_75_2 = "{...}";
              stackIn_77_0 = stackOut_75_0;
              stackIn_77_1 = stackOut_75_1;
              stackIn_77_2 = stackOut_75_2;
              break L7;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_77_0), stackIn_77_2 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_70_0;
        }
    }

    final static String a(int param0, int param1, int param2, byte[] param3) {
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        StringBuilder var10 = null;
        String stackIn_3_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var9 = VoidHunters.field_G;
        try {
          L0: {
            if (param0 == 1) {
              var10 = new StringBuilder();
              var5 = param2;
              L1: while (true) {
                if (var5 >= param2 + param1) {
                  stackOut_12_0 = var10.toString();
                  stackIn_13_0 = stackOut_12_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  L2: {
                    var6 = param3[var5] & 255;
                    discarded$5 = var10.append(eqb.field_a[var6 >>> 1669300322]);
                    if (var5 < param1 + -1) {
                      var7 = param3[var5 + 1] & 255;
                      discarded$6 = var10.append(eqb.field_a[var7 >>> -2033619836 | 48 & var6 << -2098884348]);
                      if (param1 - 2 <= var5) {
                        discarded$7 = var10.append(eqb.field_a[60 & var7 << -1614478654]);
                        break L2;
                      } else {
                        var8 = param3[2 + var5] & 255;
                        discarded$8 = var10.append(eqb.field_a[var8 >>> -1250911162 | var7 << -1519652542 & 60]).append(eqb.field_a[63 & var8]);
                        break L2;
                      }
                    } else {
                      discarded$9 = var10.append(eqb.field_a[(3 & var6) << -274148604]);
                      break L2;
                    }
                  }
                  var5 += 3;
                  continue L1;
                }
              }
            } else {
              stackOut_2_0 = (String) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var4 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) (var4);
            stackOut_14_1 = new StringBuilder().append("ac.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param3 == null) {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L3;
            } else {
              stackOut_15_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackOut_15_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L3;
            }
          }
          throw rta.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return stackIn_13_0;
        }
    }

    static {
    }
}
