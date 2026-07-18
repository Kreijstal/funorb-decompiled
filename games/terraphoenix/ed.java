/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static String field_c;
    static String field_b;
    static char[] field_a;
    static float field_d;

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        field_c = null;
    }

    final static int a(int param0, byte param1, CharSequence param2, byte[] param3, int param4, int param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_71_2 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_66_0 = 0;
        RuntimeException stackOut_68_0 = null;
        StringBuilder stackOut_68_1 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        String stackOut_69_2 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var10 = Terraphoenix.field_V;
        try {
          L0: {
            var6_int = 8 % ((param1 - 48) / 51);
            var7 = param5;
            var8 = 0;
            L1: while (true) {
              if (var8 >= var7) {
                stackOut_66_0 = var7;
                stackIn_67_0 = stackOut_66_0;
                break L0;
              } else {
                L2: {
                  L3: {
                    L4: {
                      var9 = param2.charAt(var8);
                      if (0 >= var9) {
                        break L4;
                      } else {
                        if (var9 < 128) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    L5: {
                      if (160 > var9) {
                        break L5;
                      } else {
                        if (var9 <= 255) {
                          break L3;
                        } else {
                          break L5;
                        }
                      }
                    }
                    if (var9 != 8364) {
                      if (var9 == 8218) {
                        param3[var8 + param4] = (byte) -126;
                        break L2;
                      } else {
                        if (var9 == 402) {
                          param3[var8 + param4] = (byte) -125;
                          break L2;
                        } else {
                          if (var9 == 8222) {
                            param3[var8 + param4] = (byte) -124;
                            break L2;
                          } else {
                            if (var9 != 8230) {
                              if (var9 == 8224) {
                                param3[var8 + param4] = (byte) -122;
                                break L2;
                              } else {
                                if (var9 == 8225) {
                                  param3[var8 + param4] = (byte) -121;
                                  break L2;
                                } else {
                                  if (710 == var9) {
                                    param3[var8 + param4] = (byte) -120;
                                    break L2;
                                  } else {
                                    if (8240 != var9) {
                                      if (var9 == 352) {
                                        param3[var8 + param4] = (byte) -118;
                                        break L2;
                                      } else {
                                        if (var9 != 8249) {
                                          if (var9 == 338) {
                                            param3[param4 + var8] = (byte) -116;
                                            break L2;
                                          } else {
                                            if (var9 == 381) {
                                              param3[var8 + param4] = (byte) -114;
                                              break L2;
                                            } else {
                                              if (var9 != 8216) {
                                                if (var9 == 8217) {
                                                  param3[param4 - -var8] = (byte) -110;
                                                  break L2;
                                                } else {
                                                  if (var9 == 8220) {
                                                    param3[var8 + param4] = (byte) -109;
                                                    break L2;
                                                  } else {
                                                    if (8221 == var9) {
                                                      param3[var8 + param4] = (byte) -108;
                                                      break L2;
                                                    } else {
                                                      if (var9 == 8226) {
                                                        param3[var8 + param4] = (byte) -107;
                                                        break L2;
                                                      } else {
                                                        if (var9 != 8211) {
                                                          if (var9 == 8212) {
                                                            param3[var8 + param4] = (byte) -105;
                                                            break L2;
                                                          } else {
                                                            if (732 != var9) {
                                                              if (8482 == var9) {
                                                                param3[var8 + param4] = (byte) -103;
                                                                break L2;
                                                              } else {
                                                                if (var9 == 353) {
                                                                  param3[var8 + param4] = (byte) -102;
                                                                  break L2;
                                                                } else {
                                                                  if (var9 != 8250) {
                                                                    if (339 == var9) {
                                                                      param3[var8 + param4] = (byte) -100;
                                                                      break L2;
                                                                    } else {
                                                                      if (var9 == 382) {
                                                                        param3[param4 + var8] = (byte) -98;
                                                                        break L2;
                                                                      } else {
                                                                        if (var9 != 376) {
                                                                          param3[param4 + var8] = (byte) 63;
                                                                          break L2;
                                                                        } else {
                                                                          param3[var8 + param4] = (byte) -97;
                                                                          break L2;
                                                                        }
                                                                      }
                                                                    }
                                                                  } else {
                                                                    param3[var8 + param4] = (byte) -101;
                                                                    break L2;
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param3[var8 + param4] = (byte) -104;
                                                              break L2;
                                                            }
                                                          }
                                                        } else {
                                                          param3[var8 + param4] = (byte) -106;
                                                          break L2;
                                                        }
                                                      }
                                                    }
                                                  }
                                                }
                                              } else {
                                                param3[param4 + var8] = (byte) -111;
                                                break L2;
                                              }
                                            }
                                          }
                                        } else {
                                          param3[param4 - -var8] = (byte) -117;
                                          break L2;
                                        }
                                      }
                                    } else {
                                      param3[var8 + param4] = (byte) -119;
                                      break L2;
                                    }
                                  }
                                }
                              }
                            } else {
                              param3[var8 + param4] = (byte) -123;
                              break L2;
                            }
                          }
                        }
                      }
                    } else {
                      param3[param4 + var8] = (byte) -128;
                      break L2;
                    }
                  }
                  param3[var8 + param4] = (byte)var9;
                  break L2;
                }
                var8++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var6 = decompiledCaughtException;
            stackOut_68_0 = (RuntimeException) var6;
            stackOut_68_1 = new StringBuilder().append("ed.C(").append(0).append(',').append(param1).append(',');
            stackIn_70_0 = stackOut_68_0;
            stackIn_70_1 = stackOut_68_1;
            stackIn_69_0 = stackOut_68_0;
            stackIn_69_1 = stackOut_68_1;
            if (param2 == null) {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "null";
              stackIn_71_0 = stackOut_70_0;
              stackIn_71_1 = stackOut_70_1;
              stackIn_71_2 = stackOut_70_2;
              break L6;
            } else {
              stackOut_69_0 = (RuntimeException) (Object) stackIn_69_0;
              stackOut_69_1 = (StringBuilder) (Object) stackIn_69_1;
              stackOut_69_2 = "{...}";
              stackIn_71_0 = stackOut_69_0;
              stackIn_71_1 = stackOut_69_1;
              stackIn_71_2 = stackOut_69_2;
              break L6;
            }
          }
          L7: {
            stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
            stackOut_71_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param3 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L7;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L7;
            }
          }
          throw qk.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + ',' + param4 + ',' + param5 + ')');
        }
        return stackIn_67_0;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        var13 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              var5_int = param0 + param4;
              var6 = param1 + param2;
              if (param4 <= l.field_b) {
                stackOut_3_0 = l.field_b;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = param4;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var7 = stackIn_4_0;
              if (l.field_d < param2) {
                stackOut_6_0 = param2;
                stackIn_7_0 = stackOut_6_0;
                break L2;
              } else {
                stackOut_5_0 = l.field_d;
                stackIn_7_0 = stackOut_5_0;
                break L2;
              }
            }
            L3: {
              var8 = stackIn_7_0;
              if (l.field_f <= var5_int) {
                stackOut_9_0 = l.field_f;
                stackIn_10_0 = stackOut_9_0;
                break L3;
              } else {
                stackOut_8_0 = var5_int;
                stackIn_10_0 = stackOut_8_0;
                break L3;
              }
            }
            L4: {
              var9 = stackIn_10_0;
              if (var6 < l.field_c) {
                stackOut_12_0 = var6;
                stackIn_13_0 = stackOut_12_0;
                break L4;
              } else {
                stackOut_11_0 = l.field_c;
                stackIn_13_0 = stackOut_11_0;
                break L4;
              }
            }
            L5: {
              var10 = stackIn_13_0;
              if (l.field_b > param4) {
                break L5;
              } else {
                if (l.field_f > param4) {
                  var11 = l.field_k * var8 - -param4;
                  var12 = -var8 + 1 + var10 >> 1;
                  L6: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L5;
                    } else {
                      l.field_i[var11] = 16777215;
                      var11 = var11 + 2 * l.field_k;
                      continue L6;
                    }
                  }
                } else {
                  break L5;
                }
              }
            }
            L7: {
              if (l.field_d > param2) {
                break L7;
              } else {
                if (l.field_c > var6) {
                  var11 = var7 + l.field_k * param2;
                  var12 = -var7 + (var9 + 1) >> 1;
                  L8: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L7;
                    } else {
                      l.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L8;
                    }
                  }
                } else {
                  break L7;
                }
              }
            }
            L9: {
              if (l.field_b > var5_int) {
                break L9;
              } else {
                if (var5_int < l.field_f) {
                  var11 = var5_int + (var8 - -(-param4 + var5_int & 1)) * l.field_k;
                  var12 = -var8 + (var10 + 1) >> 1;
                  L10: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L9;
                    } else {
                      l.field_i[var11] = 16777215;
                      var11 = var11 + l.field_k * 2;
                      continue L10;
                    }
                  }
                } else {
                  break L9;
                }
              }
            }
            L11: {
              if (param2 < l.field_d) {
                break L11;
              } else {
                if (var6 < l.field_c) {
                  var11 = (1 & -param2 + var6) + (var6 * l.field_k - -var7);
                  var12 = var9 + (1 + -var7) >> 1;
                  L12: while (true) {
                    var12--;
                    if (var12 < 0) {
                      break L11;
                    } else {
                      l.field_i[var11] = 16777215;
                      var11 += 2;
                      continue L12;
                    }
                  }
                } else {
                  break L11;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw qk.a((Throwable) (Object) var5, "ed.B(" + param0 + ',' + param1 + ',' + param2 + ',' + 52 + ',' + param4 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Email: ";
        field_c = "Quit to website";
        field_a = new char[]{'_', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n', 'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z', '0', '1', '2', '3', '4', '5', '6', '7', '8', '9'};
    }
}
