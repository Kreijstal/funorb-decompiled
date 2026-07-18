/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wc {
    static String field_i;
    static int field_b;
    static String field_f;
    static sl field_g;
    static int[][][] field_e;
    static r field_h;
    static String field_a;
    static int[] field_d;
    static int[][] field_c;

    final static void a(boolean param0, boolean param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_23_0 = 0;
        int stackOut_22_0 = 0;
        var14 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (param5 <= param3) {
              return;
            } else {
              if (1 + param3 < param6) {
                L1: {
                  if (param6 <= param3 + 5) {
                    break L1;
                  } else {
                    if (param4 == param2) {
                      break L1;
                    } else {
                      var7_int = (param2 >> 1) + ((param4 >> 1) - -(1 & (param2 & param4)));
                      var8 = param3;
                      var9 = param2;
                      var10 = param4;
                      var11 = param3;
                      L2: while (true) {
                        if (var11 >= param6) {
                          wc.a(param0, param1, param2, param3, var9, param5, var8);
                          wc.a(param0, param1, var10, var8, param4, param5, param6);
                          break L0;
                        } else {
                          L3: {
                            var12 = hi.field_G[var11];
                            if (param0) {
                              stackOut_23_0 = bg.field_Q[var12];
                              stackIn_24_0 = stackOut_23_0;
                              break L3;
                            } else {
                              stackOut_22_0 = bj.field_b[var12];
                              stackIn_24_0 = stackOut_22_0;
                              break L3;
                            }
                          }
                          L4: {
                            var13 = stackIn_24_0;
                            if (var7_int < var13) {
                              hi.field_G[var11] = hi.field_G[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              hi.field_G[incrementValue$1] = var12;
                              if (var13 < var9) {
                                var9 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            } else {
                              if (var13 > var10) {
                                var10 = var13;
                                break L4;
                              } else {
                                break L4;
                              }
                            }
                          }
                          var11++;
                          continue L2;
                        }
                      }
                    }
                  }
                }
                var7_int = param6 - 1;
                L5: while (true) {
                  if (var7_int <= param3) {
                    return;
                  } else {
                    var8 = param3;
                    L6: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L5;
                      } else {
                        L7: {
                          var9 = hi.field_G[var8];
                          var10 = hi.field_G[1 + var8];
                          if (nh.a(param0, 0, var9, var10)) {
                            hi.field_G[var8] = var10;
                            hi.field_G[1 + var8] = var9;
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        var8++;
                        continue L6;
                      }
                    }
                  }
                }
              } else {
                return;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var7, "wc.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a() {
        field_c = null;
        field_d = null;
        field_g = null;
        field_i = null;
        field_a = null;
        field_h = null;
        field_e = null;
        field_f = null;
    }

    final static int a(byte param0, int param1, CharSequence param2, byte[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        Object var10 = null;
        int stackIn_69_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_73_2 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_68_0 = 0;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var6_int = param4 + -param1;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                L2: {
                  if (param0 < -1) {
                    break L2;
                  } else {
                    var10 = null;
                    int discarded$1 = wc.a((byte) -48, 61, (CharSequence) null, (byte[]) null, -43, 68);
                    break L2;
                  }
                }
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param2.charAt(var7 + param1);
                      if (var8 <= 0) {
                        break L5;
                      } else {
                        if (var8 < 128) {
                          break L4;
                        } else {
                          break L5;
                        }
                      }
                    }
                    L6: {
                      if (var8 < 160) {
                        break L6;
                      } else {
                        if (255 < var8) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (8364 != var8) {
                      if (var8 != 8218) {
                        if (var8 == 402) {
                          param3[param5 + var7] = (byte) -125;
                          break L3;
                        } else {
                          if (var8 != 8222) {
                            if (var8 == 8230) {
                              param3[param5 - -var7] = (byte) -123;
                              break L3;
                            } else {
                              if (var8 == 8224) {
                                param3[var7 + param5] = (byte) -122;
                                break L3;
                              } else {
                                if (var8 != 8225) {
                                  if (710 != var8) {
                                    if (var8 == 8240) {
                                      param3[param5 - -var7] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (8249 != var8) {
                                          if (var8 == 338) {
                                            param3[var7 + param5] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (8216 != var8) {
                                                if (var8 == 8217) {
                                                  param3[param5 - -var7] = (byte) -110;
                                                  break L3;
                                                } else {
                                                  if (8220 == var8) {
                                                    param3[var7 + param5] = (byte) -109;
                                                    break L3;
                                                  } else {
                                                    if (var8 != 8221) {
                                                      if (var8 == 8226) {
                                                        param3[param5 + var7] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (var8 == 8211) {
                                                          param3[param5 + var7] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (var8 != 8212) {
                                                            if (var8 == 732) {
                                                              param3[param5 + var7] = (byte) -104;
                                                              break L3;
                                                            } else {
                                                              if (var8 != 8482) {
                                                                if (var8 == 353) {
                                                                  param3[var7 + param5] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (8250 == var8) {
                                                                    param3[param5 - -var7] = (byte) -101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 != 339) {
                                                                      if (var8 != 382) {
                                                                        if (var8 != 376) {
                                                                          param3[param5 + var7] = (byte) 63;
                                                                          break L3;
                                                                        } else {
                                                                          param3[var7 + param5] = (byte) -97;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param3[param5 + var7] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    } else {
                                                                      param3[param5 - -var7] = (byte) -100;
                                                                      break L3;
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                param3[var7 + param5] = (byte) -103;
                                                                break L3;
                                                              }
                                                            }
                                                          } else {
                                                            param3[param5 - -var7] = (byte) -105;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      param3[var7 + param5] = (byte) -108;
                                                      break L3;
                                                    }
                                                  }
                                                }
                                              } else {
                                                param3[param5 + var7] = (byte) -111;
                                                break L3;
                                              }
                                            } else {
                                              param3[var7 + param5] = (byte) -114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param3[var7 + param5] = (byte) -117;
                                          break L3;
                                        }
                                      } else {
                                        param3[param5 + var7] = (byte) -118;
                                        break L3;
                                      }
                                    }
                                  } else {
                                    param3[var7 + param5] = (byte) -120;
                                    break L3;
                                  }
                                } else {
                                  param3[var7 + param5] = (byte) -121;
                                  break L3;
                                }
                              }
                            }
                          } else {
                            param3[param5 - -var7] = (byte) -124;
                            break L3;
                          }
                        }
                      } else {
                        param3[param5 - -var7] = (byte) -126;
                        break L3;
                      }
                    } else {
                      param3[var7 + param5] = (byte) -128;
                      break L3;
                    }
                  }
                  param3[var7 + param5] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("wc.C(").append(param0).append(',').append(param1).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param2 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L7;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L7;
            }
          }
          L8: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param3 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L8;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "This password contains your Player Name, and would be easy to guess";
        field_a = "Unpacking music";
        field_i = "Player";
        field_c = new int[][]{new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3], new int[3]};
        field_g = new sl();
    }
}
