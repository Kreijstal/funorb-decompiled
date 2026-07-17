/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ca implements wa {
    static int[] field_c;
    static ck field_g;
    private long field_d;
    static int field_b;
    static String field_a;
    static int field_f;
    static int field_e;

    final static void a(int param0, int param1, int param2, int param3, int param4, boolean param5, int param6, int param7, int[] param8) {
        RuntimeException var9 = null;
        int var9_int = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        RuntimeException stackOut_80_0 = null;
        StringBuilder stackOut_80_1 = null;
        String stackOut_80_2 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        var19 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 < 0) {
                break L1;
              } else {
                if (param6 >= ka.field_a) {
                  break L1;
                } else {
                  L2: {
                    if (param4 >= 0) {
                      break L2;
                    } else {
                      if (param2 >= 0) {
                        break L2;
                      } else {
                        if (param0 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~ka.field_i < ~param4) {
                      break L3;
                    } else {
                      if (ka.field_i > param2) {
                        break L3;
                      } else {
                        if (~ka.field_i >= ~param0) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param5) {
                      break L4;
                    } else {
                      ca.d(-92);
                      break L4;
                    }
                  }
                  L5: {
                    var14 = param7 + -param6;
                    if (param6 == param1) {
                      L6: {
                        if (~param7 == ~param6) {
                          var10 = param2 << 16;
                          var12 = 0;
                          var11 = 0;
                          var9_int = param4 << 16;
                          break L6;
                        } else {
                          var15 = -param1 + param7;
                          if (param4 >= param2) {
                            var12 = (param0 + -param4 << 16) / var14;
                            var11 = (param0 + -param2 << 16) / var15;
                            var10 = param4 << 16;
                            var9_int = param2 << 16;
                            break L6;
                          } else {
                            var9_int = param4 << 16;
                            var10 = param2 << 16;
                            var12 = (-param2 + param0 << 16) / var15;
                            var11 = (param0 + -param4 << 16) / var14;
                            break L6;
                          }
                        }
                      }
                      var13 = 0;
                      if (0 > param6) {
                        param6 = Math.min(-param6, param1 + -param6);
                        var10 = var10 + var12 * param6;
                        var9_int = var9_int + param6 * var11;
                        param6 = 0;
                        break L5;
                      } else {
                        break L5;
                      }
                    } else {
                      L7: {
                        var10 = param4 << 16;
                        var9_int = param4 << 16;
                        var15 = -param6 + param1;
                        var12 = (-param4 + param0 << 16) / var14;
                        var11 = (-param4 + param2 << 16) / var15;
                        if (~var12 < ~var11) {
                          var13 = 0;
                          break L7;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          break L7;
                        }
                      }
                      L8: {
                        L9: {
                          if (param6 < 0) {
                            if (0 <= param1) {
                              param6 = -param6;
                              var10 = var10 + var12 * param6;
                              var9_int = var9_int + var11 * param6;
                              param6 = 0;
                              break L9;
                            } else {
                              param6 = -param6 + param1;
                              var9_int = var9_int + var11 * param6;
                              var10 = var10 + param6 * var12;
                              param6 = param1;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = ka.field_d[param6];
                        L10: while (true) {
                          if (~param1 >= ~param6) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (ka.field_i > var17) {
                                var18 = (var10 >> 16) - (var9_int >> 16);
                                if (var18 == 0) {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (var17 < ka.field_i) {
                                      pe.a(var18, param8, var17 - -var16, (byte) 105, param3);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (~ka.field_i < ~(var17 - -var18)) {
                                      break L12;
                                    } else {
                                      var18 = -1 + ka.field_i + -var17;
                                      break L12;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    pe.a(var18, param8, var17 + var16, (byte) 110, param3);
                                    break L11;
                                  } else {
                                    pe.a(var18 - -var17, param8, var16, (byte) 117, param3);
                                    break L11;
                                  }
                                }
                              } else {
                                break L11;
                              }
                            }
                            param6++;
                            if (param6 < ka.field_a) {
                              var16 = var16 + sb.field_c;
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              continue L10;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var16 = -param1 + param7;
                      if (0 == var16) {
                        var12 = 0;
                        var11 = 0;
                        break L5;
                      } else {
                        L13: {
                          var17 = param0 << 16;
                          if (var13 != 0) {
                            var10 = param2 << 16;
                            break L13;
                          } else {
                            var9_int = param2 << 16;
                            break L13;
                          }
                        }
                        var11 = (var17 - var9_int) / var16;
                        var12 = (var17 - var10) / var16;
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if (param6 >= 0) {
                      break L14;
                    } else {
                      param6 = -param6;
                      var10 = var10 + var12 * param6;
                      var9_int = var9_int + var11 * param6;
                      param6 = 0;
                      break L14;
                    }
                  }
                  var15 = ka.field_d[param6];
                  L15: while (true) {
                    if (param6 >= param7) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (ka.field_i <= var16) {
                          break L16;
                        } else {
                          var17 = (var10 >> 16) - (var9_int >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (var16 < ka.field_i) {
                                pe.a(var17, param8, var16 - -var15, (byte) 94, param3);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (~ka.field_i >= ~(var17 + var16)) {
                                var17 = ka.field_i + (-var16 + -1);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var16 >= 0) {
                              pe.a(var17, param8, var15 + var16, (byte) 113, param3);
                              break L16;
                            } else {
                              pe.a(var16 + var17, param8, var15, (byte) 104, param3);
                              break L16;
                            }
                          }
                        }
                      }
                      param6++;
                      if (~param6 <= ~ka.field_a) {
                        return;
                      } else {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var15 = var15 + sb.field_c;
                        continue L15;
                      }
                    }
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_78_0 = (RuntimeException) var9;
            stackOut_78_1 = new StringBuilder().append("ca.Q(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_80_0 = stackOut_78_0;
            stackIn_80_1 = stackOut_78_1;
            stackIn_79_0 = stackOut_78_0;
            stackIn_79_1 = stackOut_78_1;
            if (param8 == null) {
              stackOut_80_0 = (RuntimeException) (Object) stackIn_80_0;
              stackOut_80_1 = (StringBuilder) (Object) stackIn_80_1;
              stackOut_80_2 = "null";
              stackIn_81_0 = stackOut_80_0;
              stackIn_81_1 = stackOut_80_1;
              stackIn_81_2 = stackOut_80_2;
              break L18;
            } else {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "{...}";
              stackIn_81_0 = stackOut_79_0;
              stackIn_81_1 = stackOut_79_1;
              stackIn_81_2 = stackOut_79_2;
              break L18;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_81_0, stackIn_81_2 + 41);
        }
    }

    public static void d(int param0) {
        field_a = null;
        field_c = null;
        field_g = null;
        if (param0 != -577295248) {
            field_a = null;
        }
    }

    final static boolean a(String param0, int param1) {
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_22_0 = 0;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_21_0 = 0;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          try {
            L0: {
              if (param1 == 2117267440) {
                break L0;
              } else {
                field_g = null;
                break L0;
              }
            }
            if (!fe.field_k.startsWith("win")) {
              stackOut_5_0 = 0;
              stackIn_6_0 = stackOut_5_0;
              return stackIn_6_0 != 0;
            } else {
              L1: {
                if (param0.startsWith("http://")) {
                  break L1;
                } else {
                  if (!param0.startsWith("https://")) {
                    stackOut_10_0 = 0;
                    stackIn_11_0 = stackOut_10_0;
                    return stackIn_11_0 != 0;
                  } else {
                    break L1;
                  }
                }
              }
              var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
              var3 = 0;
              L2: while (true) {
                if (~param0.length() >= ~var3) {
                  Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                  stackOut_19_0 = 1;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0 != 0;
                } else {
                  if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                    stackOut_16_0 = 0;
                    stackIn_17_0 = stackOut_16_0;
                    return stackIn_17_0 != 0;
                  } else {
                    var3++;
                    continue L2;
                  }
                }
              }
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var2_ref = (Exception) (Object) decompiledCaughtException;
            stackOut_21_0 = 0;
            stackIn_22_0 = stackOut_21_0;
            return stackIn_22_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L3: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2_ref2;
            stackOut_23_1 = new StringBuilder().append("ca.J(");
            stackIn_25_0 = stackOut_23_0;
            stackIn_25_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L3;
            } else {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "{...}";
              stackIn_26_0 = stackOut_24_0;
              stackIn_26_1 = stackOut_24_1;
              stackIn_26_2 = stackOut_24_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param1 + 41);
        }
    }

    abstract rc e(int param0);

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_4_0 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                field_f = -104;
                break L1;
              }
            }
            L2: {
              var2 = tl.a(11468, uk.b(119, param0));
              if (var2 != null) {
                break L2;
              } else {
                var2 = "";
                break L2;
              }
            }
            stackOut_4_0 = (String) var2;
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2_ref;
            stackOut_6_1 = new StringBuilder().append("ca.M(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param1 + 41);
        }
        return stackIn_5_0;
    }

    public final void a(boolean param0) {
        ((ca) this).field_d = lk.a(0);
        if (!param0) {
            Object var3 = null;
            ca.a(-41, -118, 56, -109, 40, false, 51, 94, (int[]) null);
        }
    }

    public final String c(int param0) {
        if (((ca) this).b(-16000)) {
            return null;
        }
        if (350L + ((ca) this).field_d > lk.a(param0 ^ param0)) {
            return null;
        }
        return ((ca) this).f(param0 ^ 30523);
    }

    public final rc a(int param0) {
        if (((ca) this).b(param0 + -43835)) {
            return bc.field_a;
        }
        if (param0 != 27835) {
            Object var3 = null;
            String discarded$0 = ca.a((CharSequence) null, false);
        }
        if (lk.a(0) < ((ca) this).field_d + 350L) {
            return ek.field_a;
        }
        return ((ca) this).e(20456);
    }

    abstract String f(int param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[128];
        field_a = "End tutorial";
        field_f = 5;
        field_e = -1;
    }
}
