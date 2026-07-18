/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ue extends s {
    private int field_K;
    int field_L;
    static ba field_G;
    int field_I;
    private tj field_N;
    static int[] field_H;
    static String field_J;

    final boolean a(byte param0, pj param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var8 = null;
        int var8_int = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        Object var15 = null;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_21_0 = 0;
        int stackOut_19_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var14 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -115) {
                break L1;
              } else {
                var15 = null;
                boolean discarded$1 = ((ue) this).a((byte) -22, (pj) null, -98, 37, 41, 57, 122);
                break L1;
              }
            }
            if (!super.a((byte) -125, param1, param2, param3, param4, param5, param6)) {
              stackOut_21_0 = 0;
              stackIn_22_0 = stackOut_21_0;
              break L0;
            } else {
              L2: {
                var8_int = -((ue) this).field_I + -param3 + param5;
                var9 = -(2 * ((ue) this).field_I) + ((ue) this).field_m;
                if (var8_int <= var9) {
                  break L2;
                } else {
                  var8_int = var9;
                  break L2;
                }
              }
              L3: {
                if (var8_int >= 0) {
                  break L3;
                } else {
                  var8_int = 0;
                  break L3;
                }
              }
              L4: {
                var8_int = ((ue) this).field_K * var8_int / var9;
                if (1 == param2) {
                  ((ue) this).field_N.b(1, var8_int);
                  break L4;
                } else {
                  if (2 == param2) {
                    var10 = 2147483647;
                    var11 = -1;
                    var12 = 0;
                    L5: while (true) {
                      if (var12 >= ((ue) this).field_N.b(1)) {
                        if (var11 < 0) {
                          break L4;
                        } else {
                          ((ue) this).field_N.a(var11, -3344);
                          break L4;
                        }
                      } else {
                        L6: {
                          var13 = ((ue) this).field_N.a(true, var12) - var8_int;
                          var13 = var13 * var13;
                          if (var13 >= var10) {
                            break L6;
                          } else {
                            break L6;
                          }
                        }
                        var12++;
                        continue L5;
                      }
                    }
                  } else {
                    return true;
                  }
                }
              }
              stackOut_19_0 = 1;
              stackIn_20_0 = stackOut_19_0;
              return stackIn_20_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var8 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var8;
            stackOut_23_1 = new StringBuilder().append("ue.F(").append(param0).append(',');
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param1 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L7;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
        return stackIn_22_0 != 0;
    }

    public static void c() {
        field_J = null;
        field_G = null;
        field_H = null;
    }

    final int j(int param0) {
        if (param0 != 1) {
            return 9;
        }
        return ((ue) this).field_K;
    }

    final static int b() {
        return 1;
    }

    final static int a(int param0, CharSequence param1, byte param2, int param3, byte[] param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        var9 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var6_int = param0;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var8 = param1.charAt(var7);
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
                    if (var8 != 8364) {
                      if (var8 != 8218) {
                        if (var8 == 402) {
                          param4[param5 - -var7] = (byte) -125;
                          break L2;
                        } else {
                          if (8222 == var8) {
                            param4[var7 + param5] = (byte) -124;
                            break L2;
                          } else {
                            if (var8 == 8230) {
                              param4[param5 - -var7] = (byte) -123;
                              break L2;
                            } else {
                              if (8224 != var8) {
                                if (8225 == var8) {
                                  param4[param5 - -var7] = (byte) -121;
                                  break L2;
                                } else {
                                  if (var8 != 710) {
                                    if (8240 == var8) {
                                      param4[param5 + var7] = (byte) -119;
                                      break L2;
                                    } else {
                                      if (352 != var8) {
                                        if (var8 != 8249) {
                                          if (var8 != 338) {
                                            if (var8 != 381) {
                                              if (8216 != var8) {
                                                if (8217 == var8) {
                                                  param4[param5 - -var7] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (8220 != var8) {
                                                    if (var8 == 8221) {
                                                      param4[var7 + param5] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var8 != 8226) {
                                                        if (var8 == 8211) {
                                                          param4[param5 - -var7] = (byte) -106;
                                                          break L2;
                                                        } else {
                                                          if (var8 != 8212) {
                                                            if (var8 != 732) {
                                                              if (var8 != 8482) {
                                                                if (var8 == 353) {
                                                                  param4[param5 + var7] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var8 != 8250) {
                                                                    if (var8 != 339) {
                                                                      if (382 != var8) {
                                                                        if (376 == var8) {
                                                                          param4[var7 + param5] = (byte) -97;
                                                                          break L2;
                                                                        } else {
                                                                          param4[param5 - -var7] = (byte) 63;
                                                                          break L2;
                                                                        }
                                                                      } else {
                                                                        param4[param5 - -var7] = (byte) -98;
                                                                        break L2;
                                                                      }
                                                                    } else {
                                                                      param4[var7 + param5] = (byte) -100;
                                                                      break L2;
                                                                    }
                                                                  } else {
                                                                    param4[var7 + param5] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              } else {
                                                                param4[var7 + param5] = (byte) -103;
                                                                break L2;
                                                              }
                                                            } else {
                                                              param4[var7 + param5] = (byte) -104;
                                                              break L2;
                                                            }
                                                          } else {
                                                            param4[param5 + var7] = (byte) -105;
                                                            break L2;
                                                          }
                                                        }
                                                      } else {
                                                        param4[var7 + param5] = (byte) -107;
                                                        break L2;
                                                      }
                                                    }
                                                  } else {
                                                    param4[var7 + param5] = (byte) -109;
                                                    break L2;
                                                  }
                                                }
                                              } else {
                                                param4[var7 + param5] = (byte) -111;
                                                break L2;
                                              }
                                            } else {
                                              param4[var7 + param5] = (byte) -114;
                                              break L2;
                                            }
                                          } else {
                                            param4[param5 - -var7] = (byte) -116;
                                            break L2;
                                          }
                                        } else {
                                          param4[var7 + param5] = (byte) -117;
                                          break L2;
                                        }
                                      } else {
                                        param4[var7 + param5] = (byte) -118;
                                        break L2;
                                      }
                                    }
                                  } else {
                                    param4[param5 - -var7] = (byte) -120;
                                    break L2;
                                  }
                                }
                              } else {
                                param4[var7 + param5] = (byte) -122;
                                break L2;
                              }
                            }
                          }
                        }
                      } else {
                        param4[param5 + var7] = (byte) -126;
                        break L2;
                      }
                    } else {
                      param4[param5 - -var7] = (byte) -128;
                      break L2;
                    }
                  }
                  param4[param5 - -var7] = (byte)var8;
                  break L2;
                }
                var7++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("ue.K(").append(param0).append(',');
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param1 == null) {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "null";
              stackIn_73_0 = stackOut_72_0;
              stackIn_73_1 = stackOut_72_1;
              stackIn_73_2 = stackOut_72_2;
              break L6;
            } else {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "{...}";
              stackIn_73_0 = stackOut_71_0;
              stackIn_73_1 = stackOut_71_1;
              stackIn_73_2 = stackOut_71_2;
              break L6;
            }
          }
          L7: {
            stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(',').append(-86).append(',').append(0).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param4 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L7;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L7;
            }
          }
          throw dd.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param5 + ')');
        }
        return stackIn_69_0;
    }

    final int a(byte param0) {
        if (param0 > -71) {
            ((ue) this).field_N = null;
        }
        return ((ue) this).field_N.b(1);
    }

    private ue() throws Throwable {
        throw new Error();
    }

    final int a(int param0, int param1) {
        L0: {
          if (param0 < ~param1) {
            break L0;
          } else {
            if (((ue) this).field_N.b(1) <= param1) {
              break L0;
            } else {
              return ((ue) this).field_N.a(true, param1);
            }
          }
        }
        return -1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_G = new ba(13, 0, 1, 0);
        field_H = new int[8192];
        field_J = "You can only place barriers next to a path";
    }
}
