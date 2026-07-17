/*
 * Decompiled by CFR-JS 0.4.0.
 */
class o extends rg {
    static String field_D;
    static String field_z;
    static dd field_C;
    static wh field_x;
    static int field_y;
    static String field_A;
    static String field_B;
    static String field_w;

    o() {
    }

    final static int a(int param0, byte param1) {
        int var2 = 0;
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        param0 = param0 & 8191;
        var2 = 13 / ((param1 - -21) / 41);
        if (-4097 >= param0) {
          L0: {
            if (-6145 <= param0) {
              stackOut_7_0 = wf.field_b[-6144 + param0];
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = -wf.field_b[6144 - param0];
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0;
        } else {
          L1: {
            if (param0 < 2048) {
              stackOut_3_0 = wf.field_b[2048 - param0];
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = -wf.field_b[param0 + -2048];
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0;
        }
    }

    final static String a(char param0, String param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        StringBuilder var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        String stackIn_12_0 = null;
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
        String stackOut_11_0 = null;
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
        var11 = Pool.field_O;
        try {
          L0: {
            var4_int = param2.length();
            var5 = param1.length();
            var6 = var4_int;
            var7 = var5 + -1;
            L1: {
              if (var7 == 0) {
                break L1;
              } else {
                var8_int = 0;
                L2: while (true) {
                  var8_int = param2.indexOf((int) param0, var8_int);
                  if (var8_int < 0) {
                    break L1;
                  } else {
                    var8_int++;
                    var6 = var6 + var7;
                    continue L2;
                  }
                }
              }
            }
            var8 = new StringBuilder(var6);
            var9 = 0;
            L3: while (true) {
              var10 = param2.indexOf((int) param0, var9);
              if (var10 >= 0) {
                StringBuilder discarded$13 = var8.append(param2.substring(var9, var10));
                StringBuilder discarded$14 = var8.append(param1);
                var9 = 1 + var10;
                continue L3;
              } else {
                StringBuilder discarded$15 = var8.append(param2.substring(var9));
                stackOut_11_0 = var8.toString();
                stackIn_12_0 = stackOut_11_0;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var4 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var4;
            stackOut_13_1 = new StringBuilder().append("o.R(").append(param0).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param1 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param2 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 44 + 1 + 41);
        }
        return stackIn_12_0;
    }

    public static void e(int param0) {
        field_B = null;
        field_D = null;
        if (param0 <= 89) {
          return;
        } else {
          field_C = null;
          field_x = null;
          field_z = null;
          field_A = null;
          field_w = null;
          return;
        }
    }

    final static void c(byte param0) {
        if (!gk.field_kb) {
            throw new IllegalStateException();
        }
        mf.field_o = true;
        ii.a(true, 0);
        fk.field_ab = 0;
    }

    final static int a(byte[] param0, CharSequence param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_68_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_72_2 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        String stackIn_75_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_67_0 = 0;
        RuntimeException stackOut_69_0 = null;
        StringBuilder stackOut_69_1 = null;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        String stackOut_71_2 = null;
        RuntimeException stackOut_70_0 = null;
        StringBuilder stackOut_70_1 = null;
        String stackOut_70_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        try {
          L0: {
            var6_int = param3;
            var7 = 0;
            L1: while (true) {
              if (var6_int <= var7) {
                L2: {
                  if (param2 == -24984) {
                    break L2;
                  } else {
                    o.e(82);
                    break L2;
                  }
                }
                stackOut_67_0 = var6_int;
                stackIn_68_0 = stackOut_67_0;
                break L0;
              } else {
                L3: {
                  L4: {
                    L5: {
                      var8 = param1.charAt(var7);
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
                        if (var8 <= 255) {
                          break L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                    if (var8 != 8364) {
                      if (var8 == 8218) {
                        param0[var7 + param5] = (byte) -126;
                        break L3;
                      } else {
                        if (var8 == 402) {
                          param0[param5 - -var7] = (byte) -125;
                          break L3;
                        } else {
                          if (8222 == var8) {
                            param0[var7 + param5] = (byte) -124;
                            break L3;
                          } else {
                            if (8230 != var8) {
                              if (8224 != var8) {
                                if (var8 == 8225) {
                                  param0[var7 + param5] = (byte) -121;
                                  break L3;
                                } else {
                                  if (var8 != 710) {
                                    if (var8 != 8240) {
                                      if (352 != var8) {
                                        if (8249 != var8) {
                                          if (338 == var8) {
                                            param0[param5 + var7] = (byte) -116;
                                            break L3;
                                          } else {
                                            if (var8 != 381) {
                                              if (8216 == var8) {
                                                param0[var7 + param5] = (byte) -111;
                                                break L3;
                                              } else {
                                                if (var8 != 8217) {
                                                  if (8220 != var8) {
                                                    if (var8 != 8221) {
                                                      if (8226 == var8) {
                                                        param0[var7 + param5] = (byte) -107;
                                                        break L3;
                                                      } else {
                                                        if (8211 == var8) {
                                                          param0[var7 + param5] = (byte) -106;
                                                          break L3;
                                                        } else {
                                                          if (8212 != var8) {
                                                            if (var8 != 732) {
                                                              if (var8 != 8482) {
                                                                if (var8 == 353) {
                                                                  param0[var7 + param5] = (byte) -102;
                                                                  break L3;
                                                                } else {
                                                                  if (8250 == var8) {
                                                                    param0[param5 - -var7] = (byte) -101;
                                                                    break L3;
                                                                  } else {
                                                                    if (339 == var8) {
                                                                      param0[param5 + var7] = (byte) -100;
                                                                      break L3;
                                                                    } else {
                                                                      if (var8 != 382) {
                                                                        if (var8 == 376) {
                                                                          param0[var7 + param5] = (byte) -97;
                                                                          break L3;
                                                                        } else {
                                                                          param0[param5 + var7] = (byte) 63;
                                                                          break L3;
                                                                        }
                                                                      } else {
                                                                        param0[var7 + param5] = (byte) -98;
                                                                        break L3;
                                                                      }
                                                                    }
                                                                  }
                                                                }
                                                              } else {
                                                                param0[var7 + param5] = (byte) -103;
                                                                break L3;
                                                              }
                                                            } else {
                                                              param0[param5 - -var7] = (byte) -104;
                                                              break L3;
                                                            }
                                                          } else {
                                                            param0[var7 + param5] = (byte) -105;
                                                            break L3;
                                                          }
                                                        }
                                                      }
                                                    } else {
                                                      param0[var7 + param5] = (byte) -108;
                                                      break L3;
                                                    }
                                                  } else {
                                                    param0[param5 - -var7] = (byte) -109;
                                                    break L3;
                                                  }
                                                } else {
                                                  param0[param5 - -var7] = (byte) -110;
                                                  break L3;
                                                }
                                              }
                                            } else {
                                              param0[param5 - -var7] = (byte) -114;
                                              break L3;
                                            }
                                          }
                                        } else {
                                          param0[var7 + param5] = (byte) -117;
                                          break L3;
                                        }
                                      } else {
                                        param0[var7 + param5] = (byte) -118;
                                        break L3;
                                      }
                                    } else {
                                      param0[var7 + param5] = (byte) -119;
                                      break L3;
                                    }
                                  } else {
                                    param0[param5 + var7] = (byte) -120;
                                    break L3;
                                  }
                                }
                              } else {
                                param0[param5 - -var7] = (byte) -122;
                                break L3;
                              }
                            } else {
                              param0[param5 - -var7] = (byte) -123;
                              break L3;
                            }
                          }
                        }
                      }
                    } else {
                      param0[var7 + param5] = (byte) -128;
                      break L3;
                    }
                  }
                  param0[var7 + param5] = (byte)var8;
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
            stackOut_69_0 = (RuntimeException) var6;
            stackOut_69_1 = new StringBuilder().append("o.P(");
            stackIn_71_0 = stackOut_69_0;
            stackIn_71_1 = stackOut_69_1;
            stackIn_70_0 = stackOut_69_0;
            stackIn_70_1 = stackOut_69_1;
            if (param0 == null) {
              stackOut_71_0 = (RuntimeException) (Object) stackIn_71_0;
              stackOut_71_1 = (StringBuilder) (Object) stackIn_71_1;
              stackOut_71_2 = "null";
              stackIn_72_0 = stackOut_71_0;
              stackIn_72_1 = stackOut_71_1;
              stackIn_72_2 = stackOut_71_2;
              break L7;
            } else {
              stackOut_70_0 = (RuntimeException) (Object) stackIn_70_0;
              stackOut_70_1 = (StringBuilder) (Object) stackIn_70_1;
              stackOut_70_2 = "{...}";
              stackIn_72_0 = stackOut_70_0;
              stackIn_72_1 = stackOut_70_1;
              stackIn_72_2 = stackOut_70_2;
              break L7;
            }
          }
          L8: {
            stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
            stackOut_72_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_72_2).append(44);
            stackIn_74_0 = stackOut_72_0;
            stackIn_74_1 = stackOut_72_1;
            stackIn_73_0 = stackOut_72_0;
            stackIn_73_1 = stackOut_72_1;
            if (param1 == null) {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "null";
              stackIn_75_0 = stackOut_74_0;
              stackIn_75_1 = stackOut_74_1;
              stackIn_75_2 = stackOut_74_2;
              break L8;
            } else {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "{...}";
              stackIn_75_0 = stackOut_73_0;
              stackIn_75_1 = stackOut_73_1;
              stackIn_75_2 = stackOut_73_2;
              break L8;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_75_0, stackIn_75_2 + 44 + param2 + 44 + param3 + 44 + 0 + 44 + param5 + 41);
        }
        return stackIn_68_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_z = "Staff impersonation";
        field_D = "You lost 1 life!";
        field_y = 0;
        field_B = "You<%0> are all offering a rematch.";
        field_w = "To server list";
        field_A = "Loading...";
    }
}
