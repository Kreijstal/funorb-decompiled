/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends l {
    static km field_m;
    static String field_i;
    int field_o;
    boolean field_p;
    int field_l;
    static km field_k;
    static nh[] field_n;
    static String field_h;
    static int field_q;
    int field_g;
    static na field_j;

    public static void a(int param0) {
        field_m = null;
        field_k = null;
        field_h = null;
        field_n = null;
        field_j = null;
        field_i = null;
    }

    final static int a(int param0, int param1, int param2) {
        if (param1 >= 2) {
            return 2;
        }
        if (param0 >= 5) {
            return 1;
        }
        return 0;
    }

    final static void a(int[] param0, int param1, int param2, int param3, int[] param4) {
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
        int var14 = 0;
        int stackIn_5_0 = 0;
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
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
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
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              var5_int = -42 % ((param2 - -82) / 42);
              if (param1 >= param3) {
                break L1;
              } else {
                L2: {
                  var6 = (param3 + param1) / 2;
                  var7 = param1;
                  var8 = param0[var6];
                  param0[var6] = param0[param3];
                  param0[param3] = var8;
                  var9 = param4[var6];
                  param4[var6] = param4[param3];
                  param4[param3] = var9;
                  if (var8 != 2147483647) {
                    stackOut_4_0 = 1;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_3_0 = 0;
                    stackIn_5_0 = stackOut_3_0;
                    break L2;
                  }
                }
                var10 = stackIn_5_0;
                var11 = param1;
                L3: while (true) {
                  if (var11 >= param3) {
                    param0[param3] = param0[var7];
                    param0[var7] = var8;
                    param4[param3] = param4[var7];
                    param4[var7] = var9;
                    ij.a(param0, param1, 40, var7 - 1, param4);
                    ij.a(param0, 1 + var7, -127, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (param0[var11] > -(var10 & var11) + var8) {
                        var12 = param0[var11];
                        param0[var11] = param0[var7];
                        param0[var7] = var12;
                        var13 = param4[var11];
                        param4[var11] = param4[var7];
                        int incrementValue$1 = var7;
                        var7++;
                        param4[incrementValue$1] = var13;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var11++;
                    continue L3;
                  }
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var5 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var5;
            stackOut_13_1 = new StringBuilder().append("ij.A(");
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
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
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
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
          throw kg.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
    }

    final static byte a(char param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        L0: {
          L1: {
            L2: {
              var3 = Virogrid.field_F ? 1 : 0;
              if (param0 <= 0) {
                break L2;
              } else {
                if (param0 < 128) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (param0 < 160) {
                break L3;
              } else {
                if (param0 > 255) {
                  break L3;
                } else {
                  break L1;
                }
              }
            }
            if (8364 != param0) {
              if (8218 == param0) {
                var2 = -126;
                break L0;
              } else {
                if (402 != param0) {
                  if (param0 == 8222) {
                    var2 = -124;
                    break L0;
                  } else {
                    if (param0 != 8230) {
                      if (8224 != param0) {
                        if (8225 != param0) {
                          if (param0 != 710) {
                            if (param0 != 8240) {
                              if (param0 != 352) {
                                if (param0 != 8249) {
                                  if (param0 == 338) {
                                    var2 = -116;
                                    break L0;
                                  } else {
                                    if (param0 != 381) {
                                      if (param0 != 8216) {
                                        if (param0 != 8217) {
                                          if (8220 != param0) {
                                            if (8221 == param0) {
                                              var2 = -108;
                                              break L0;
                                            } else {
                                              if (param0 != 8226) {
                                                if (8211 != param0) {
                                                  if (param0 == 8212) {
                                                    var2 = -105;
                                                    break L0;
                                                  } else {
                                                    if (param0 == 732) {
                                                      var2 = -104;
                                                      break L0;
                                                    } else {
                                                      if (param0 != 8482) {
                                                        if (param0 != 353) {
                                                          if (param0 == 8250) {
                                                            var2 = -101;
                                                            break L0;
                                                          } else {
                                                            if (param0 != 339) {
                                                              if (382 == param0) {
                                                                var2 = -98;
                                                                break L0;
                                                              } else {
                                                                if (376 != param0) {
                                                                  var2 = 63;
                                                                  break L0;
                                                                } else {
                                                                  var2 = -97;
                                                                  break L0;
                                                                }
                                                              }
                                                            } else {
                                                              var2 = -100;
                                                              break L0;
                                                            }
                                                          }
                                                        } else {
                                                          var2 = -102;
                                                          break L0;
                                                        }
                                                      } else {
                                                        var2 = -103;
                                                        break L0;
                                                      }
                                                    }
                                                  }
                                                } else {
                                                  var2 = -106;
                                                  break L0;
                                                }
                                              } else {
                                                var2 = -107;
                                                break L0;
                                              }
                                            }
                                          } else {
                                            var2 = -109;
                                            break L0;
                                          }
                                        } else {
                                          var2 = -110;
                                          break L0;
                                        }
                                      } else {
                                        var2 = -111;
                                        break L0;
                                      }
                                    } else {
                                      var2 = -114;
                                      break L0;
                                    }
                                  }
                                } else {
                                  var2 = -117;
                                  break L0;
                                }
                              } else {
                                var2 = -118;
                                break L0;
                              }
                            } else {
                              var2 = -119;
                              break L0;
                            }
                          } else {
                            var2 = -120;
                            break L0;
                          }
                        } else {
                          var2 = -121;
                          break L0;
                        }
                      } else {
                        var2 = -122;
                        break L0;
                      }
                    } else {
                      var2 = -123;
                      break L0;
                    }
                  }
                } else {
                  var2 = -125;
                  break L0;
                }
              }
            } else {
              var2 = -128;
              break L0;
            }
          }
          var2 = (byte)param0;
          break L0;
        }
        return (byte) var2;
    }

    ij(int param0, boolean param1, int param2) {
        ((ij) this).field_g = param0;
        ((ij) this).field_l = param2;
        ((ij) this).field_p = param1 ? true : false;
        ((ij) this).field_o = 0;
    }

    final static void a(byte param0) {
        int var1 = id.field_r / 2;
        String var2 = jk.field_e;
        if (db.b((byte) 13, 0)) {
            var2 = ge.field_a;
        }
        String var3 = var2.substring(0, var1 <= var2.length() ? var1 : var2.length());
        int discarded$0 = mc.field_b.a(var3, 120, 100, 400, 200, 1141646, -1, 0, 0, 0);
    }

    final static void a(int param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Virogrid.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            var3 = 21 / ((-72 - param0) / 41);
            var4 = -(df.field_e * df.field_f);
            L1: while (true) {
              if (var4 >= 0) {
                break L0;
              } else {
                var5 = df.field_d[var2_int];
                var6 = var5 & 16711935;
                var5 = var5 & 65280;
                var6 = var6 * param1;
                var6 = var6 & -16711936;
                var5 = var5 * param1;
                var5 = var5 & 16711680;
                var5 = (var6 | var5) >> 8;
                int incrementValue$7 = var2_int;
                var2_int++;
                df.field_d[incrementValue$7] = var5;
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (Object) var2, "ij.B(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "No spectators";
        field_h = "Please try changing the following settings:  ";
    }
}
