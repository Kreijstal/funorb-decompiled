/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nl {
    static aj field_b;
    static String[] field_a;
    static boolean field_c;

    final static byte[] a(Object param0, byte param1, boolean param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        nl var4 = null;
        Object stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        byte[] stackOut_14_0 = null;
        byte[] stackOut_10_0 = null;
        byte[] stackOut_8_0 = null;
        Object stackOut_4_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        try {
          if (param1 == -74) {
            if (param0 != null) {
              if (!(param0 instanceof byte[])) {
                if (param0 instanceof nl) {
                  var4 = (nl) param0;
                  stackOut_14_0 = var4.a((byte) -121);
                  stackIn_15_0 = stackOut_14_0;
                  return stackIn_15_0;
                } else {
                  throw new IllegalArgumentException();
                }
              } else {
                var3 = (byte[]) param0;
                if (param2) {
                  stackOut_10_0 = ld.a(120, var3);
                  stackIn_11_0 = stackOut_10_0;
                  return stackIn_11_0;
                } else {
                  stackOut_8_0 = (byte[]) var3;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0;
                }
              }
            } else {
              stackOut_4_0 = null;
              stackIn_5_0 = stackOut_4_0;
              return (byte[]) (Object) stackIn_5_0;
            }
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (byte[]) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            var3_ref = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var3_ref;
            stackOut_17_1 = new StringBuilder().append("nl.H(");
            stackIn_19_0 = stackOut_17_0;
            stackIn_19_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param0 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L0;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_20_0 = stackOut_18_0;
              stackIn_20_1 = stackOut_18_1;
              stackIn_20_2 = stackOut_18_2;
              break L0;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 44 + param1 + 44 + param2 + 41);
        }
    }

    public static void b(byte param0) {
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_25_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_24_0 = 0;
        int stackOut_23_0 = 0;
        var14 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param0 > param1) {
              L1: {
                if (param3 <= -73) {
                  break L1;
                } else {
                  field_b = null;
                  break L1;
                }
              }
              if (1 + param1 >= param6) {
                return;
              } else {
                L2: {
                  if (5 + param1 >= param6) {
                    break L2;
                  } else {
                    if (param5 != param4) {
                      var7_int = (param5 >> 1) + (param4 >> 1) + (1 & (param5 & param4));
                      var8 = param1;
                      var9 = param4;
                      var10 = param5;
                      var11 = param1;
                      L3: while (true) {
                        if (param6 <= var11) {
                          nl.a(param0, param1, param2, -86, param4, var9, var8);
                          nl.a(param0, var8, param2, -122, var10, param5, param6);
                          break L0;
                        } else {
                          L4: {
                            var12 = ff.field_a[var11];
                            if (param2) {
                              stackOut_24_0 = we.field_g[var12];
                              stackIn_25_0 = stackOut_24_0;
                              break L4;
                            } else {
                              stackOut_23_0 = oj.field_j[var12];
                              stackIn_25_0 = stackOut_23_0;
                              break L4;
                            }
                          }
                          var13 = stackIn_25_0;
                          if (var13 <= var7_int) {
                            L5: {
                              if (var10 >= var13) {
                                break L5;
                              } else {
                                break L5;
                              }
                            }
                            var11++;
                            continue L3;
                          } else {
                            L6: {
                              ff.field_a[var11] = ff.field_a[var8];
                              int incrementValue$1 = var8;
                              var8++;
                              ff.field_a[incrementValue$1] = var12;
                              if (var13 < var9) {
                                var9 = var13;
                                break L6;
                              } else {
                                break L6;
                              }
                            }
                            var11++;
                            continue L3;
                          }
                        }
                      }
                    } else {
                      break L2;
                    }
                  }
                }
                var7_int = param6 + -1;
                L7: while (true) {
                  if (param1 >= var7_int) {
                    return;
                  } else {
                    var8 = param1;
                    L8: while (true) {
                      if (var8 >= var7_int) {
                        var7_int--;
                        continue L7;
                      } else {
                        L9: {
                          var9 = ff.field_a[var8];
                          var10 = ff.field_a[1 + var8];
                          if (!cb.a((byte) 63, param2, var10, var9)) {
                            break L9;
                          } else {
                            ff.field_a[var8] = var10;
                            ff.field_a[1 + var8] = var9;
                            break L9;
                          }
                        }
                        var8++;
                        continue L8;
                      }
                    }
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw ld.a((Throwable) (Object) var7, "nl.J(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    final static void a(int param0, int param1, String param2, String[] param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        int stackIn_11_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var5 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              bk.field_c = c.field_o;
              if (param1 == -6258) {
                break L1;
              } else {
                field_c = true;
                break L1;
              }
            }
            L2: {
              if (param0 == 255) {
                L3: {
                  if (cg.field_l >= 13) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    break L3;
                  } else {
                    stackOut_9_0 = 1;
                    stackIn_11_0 = stackOut_9_0;
                    break L3;
                  }
                }
                li.field_T = mc.b(stackIn_11_0 != 0, param1 ^ -6168);
                break L2;
              } else {
                L4: {
                  if (param0 < 100) {
                    break L4;
                  } else {
                    if (param0 > 105) {
                      break L4;
                    } else {
                      li.field_T = oe.a(124, param3);
                      break L2;
                    }
                  }
                }
                li.field_T = wi.a(param0, (byte) -65, param2);
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("nl.I(").append(param0).append(44).append(param1).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L5;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L5;
            }
          }
          L6: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param3 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L6;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
    }

    abstract byte[] a(byte param0);

    abstract void a(byte[] param0, boolean param1);

    final static int a(int param0, int param1, byte param2, byte[] param3, CharSequence param4, int param5) {
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
        var9 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < -79) {
                break L1;
              } else {
                field_b = null;
                break L1;
              }
            }
            var6_int = -param1 + param0;
            var7 = 0;
            L2: while (true) {
              if (var6_int <= var7) {
                stackOut_68_0 = var6_int;
                stackIn_69_0 = stackOut_68_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param4.charAt(param1 + var7);
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
                        if (var8 > 255) {
                          break L6;
                        } else {
                          break L4;
                        }
                      }
                    }
                    if (8364 == var8) {
                      param3[param5 - -var7] = (byte) -128;
                      break L3;
                    } else {
                      if (var8 == 8218) {
                        param3[param5 - -var7] = (byte) -126;
                        break L3;
                      } else {
                        if (var8 != 402) {
                          if (var8 != 8222) {
                            if (8230 == var8) {
                              param3[var7 + param5] = (byte) -123;
                              break L3;
                            } else {
                              if (var8 != 8224) {
                                if (var8 != 8225) {
                                  if (710 == var8) {
                                    param3[var7 + param5] = (byte) -120;
                                    break L3;
                                  } else {
                                    if (8240 == var8) {
                                      param3[var7 + param5] = (byte) -119;
                                      break L3;
                                    } else {
                                      if (var8 != 352) {
                                        if (var8 == 8249) {
                                          param3[param5 + var7] = (byte) -117;
                                          break L3;
                                        } else {
                                          if (var8 == 338) {
                                            param3[param5 - -var7] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var8 == 381) {
                                              param3[var7 + param5] = (byte) -114;
                                              break L3;
                                            } else {
                                              if (var8 == 8216) {
                                                param3[var7 + param5] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (8217 != var8) {
                                                  if (var8 != 8220) {
                                                    if (8221 != var8) {
                                                      if (var8 != 8226) {
                                                        if (var8 != 8211) {
                                                          if (var8 == 8212) {
                                                            param3[param5 + var7] = (byte) -105;
                                                            break L3;
                                                          } else {
                                                            if (var8 != 732) {
                                                              if (var8 == 8482) {
                                                                param3[param5 - -var7] = (byte) -103;
                                                                break L3;
                                                              } else {
                                                                if (353 == var8) {
                                                                  param3[param5 + var7] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (var8 == 8250) {
                                                                    param3[param5 + var7] = (byte) -101;
                                                                    break L3;
                                                                  } else {
                                                                    if (var8 == 339) {
                                                                      param3[param5 - -var7] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 == 376) {
                                                                          param3[param5 - -var7] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          param3[param5 - -var7] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param3[var7 + param5] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              }
                                                            } else {
                                                              param3[var7 + param5] = (byte) -104;
                                                              break L3;
                                                            }
                                                          }
                                                        } else {
                                                          param3[var7 + param5] = (byte) -106;
                                                          break L3;
                                                        }
                                                      } else {
                                                        param3[var7 + param5] = (byte) -107;
                                                        break L3;
                                                      }
                                                    } else {
                                                      param3[param5 - -var7] = (byte) -108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param3[var7 + param5] = (byte) -109;
                                                    break L3;
                                                  }
                                                } else {
                                                  param3[var7 + param5] = (byte) -110;
                                                  break L3;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        param3[var7 + param5] = (byte) -118;
                                        break L3;
                                      }
                                    }
                                  }
                                } else {
                                  param3[var7 + param5] = (byte) -121;
                                  break L3;
                                }
                              } else {
                                param3[param5 - -var7] = (byte) -122;
                                break L3;
                              }
                            }
                          } else {
                            param3[param5 - -var7] = (byte) -124;
                            break L3;
                          }
                        } else {
                          param3[var7 + param5] = (byte) -125;
                          break L3;
                        }
                      }
                    }
                  }
                  param3[param5 + var7] = (byte)var8;
                  break L3;
                }
                var7++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var6 = decompiledCaughtException;
            stackOut_70_0 = (RuntimeException) var6;
            stackOut_70_1 = new StringBuilder().append("nl.K(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_72_0 = stackOut_70_0;
            stackIn_72_1 = stackOut_70_1;
            stackIn_71_0 = stackOut_70_0;
            stackIn_71_1 = stackOut_70_1;
            if (param3 == null) {
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
            stackOut_73_1 = ((StringBuilder) (Object) stackIn_73_1).append(stackIn_73_2).append(44);
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
          throw ld.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + 44 + param5 + 41);
        }
        return stackIn_69_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new aj(10, 2, 2, 0);
    }
}
