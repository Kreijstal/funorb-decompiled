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
        int var9 = 0;
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
        L0: {
          var19 = Transmogrify.field_A ? 1 : 0;
          if (param7 < 0) {
            break L0;
          } else {
            if (param6 >= ka.field_a) {
              break L0;
            } else {
              L1: {
                if (param4 >= 0) {
                  break L1;
                } else {
                  if (param2 >= 0) {
                    break L1;
                  } else {
                    if (param0 >= 0) {
                      break L1;
                    } else {
                      return;
                    }
                  }
                }
              }
              L2: {
                if (ka.field_i > param4) {
                  break L2;
                } else {
                  if (ka.field_i > param2) {
                    break L2;
                  } else {
                    if (ka.field_i <= param0) {
                      return;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              L3: {
                if (param5) {
                  break L3;
                } else {
                  ca.d(-92);
                  break L3;
                }
              }
              L4: {
                L5: {
                  var14 = param7 + -param6;
                  if (param6 == param1) {
                    break L5;
                  } else {
                    L6: {
                      L7: {
                        var10 = param4 << -1317603696;
                        var9 = param4 << -1317603696;
                        var15 = -param6 + param1;
                        var12 = (-param4 + param0 << -933790736) / var14;
                        var11 = (-param4 + param2 << 1350879792) / var15;
                        if (var12 > var11) {
                          break L7;
                        } else {
                          var13 = 1;
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          if (0 == 0) {
                            break L6;
                          } else {
                            break L7;
                          }
                        }
                      }
                      var13 = 0;
                      break L6;
                    }
                    L8: {
                      L9: {
                        if (param6 < 0) {
                          L10: {
                            if (0 <= param1) {
                              break L10;
                            } else {
                              param6 = -param6 + param1;
                              var9 = var9 + var11 * param6;
                              var10 = var10 + param6 * var12;
                              param6 = param1;
                              if (0 == 0) {
                                break L8;
                              } else {
                                break L10;
                              }
                            }
                          }
                          param6 = -param6;
                          var10 = var10 + var12 * param6;
                          var9 = var9 + var11 * param6;
                          param6 = 0;
                          break L9;
                        } else {
                          break L9;
                        }
                      }
                      var16 = ka.field_d[param6];
                      L11: while (true) {
                        if (param1 <= param6) {
                          break L8;
                        } else {
                          L12: {
                            var17 = var9 >> 1912388592;
                            if (ka.field_i > var17) {
                              L13: {
                                var18 = (var10 >> 1041630928) - (var9 >> 1171754384);
                                if (var18 == 0) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (ka.field_i > var17 - -var18) {
                                      break L14;
                                    } else {
                                      var18 = -1 + ka.field_i + -var17;
                                      break L14;
                                    }
                                  }
                                  L15: {
                                    if (var17 >= 0) {
                                      break L15;
                                    } else {
                                      pe.a(var18 - -var17, param8, var16, (byte) 117, param3);
                                      if (0 == 0) {
                                        break L12;
                                      } else {
                                        break L15;
                                      }
                                    }
                                  }
                                  pe.a(var18, param8, var17 + var16, (byte) 110, param3);
                                  if (0 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                              if (var17 < 0) {
                                break L12;
                              } else {
                                if (var17 < ka.field_i) {
                                  pe.a(var18, param8, var17 - -var16, (byte) 105, param3);
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                            } else {
                              break L12;
                            }
                          }
                          param6++;
                          if (param6 < ka.field_a) {
                            var16 = var16 + sb.field_c;
                            var10 = var10 + var12;
                            var9 = var9 + var11;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L8;
                            }
                          } else {
                            return;
                          }
                        }
                      }
                    }
                    L16: {
                      L17: {
                        var16 = -param1 + param7;
                        if (0 == var16) {
                          break L17;
                        } else {
                          L18: {
                            L19: {
                              var17 = param0 << 1124575536;
                              if (var13 != 0) {
                                break L19;
                              } else {
                                var9 = param2 << 2114563536;
                                if (0 == 0) {
                                  break L18;
                                } else {
                                  break L19;
                                }
                              }
                            }
                            var10 = param2 << -197595280;
                            break L18;
                          }
                          var11 = (var17 - var9) / var16;
                          var12 = (var17 - var10) / var16;
                          if (0 == 0) {
                            break L16;
                          } else {
                            break L17;
                          }
                        }
                      }
                      var12 = 0;
                      var11 = 0;
                      break L16;
                    }
                    if (0 == 0) {
                      break L4;
                    } else {
                      break L5;
                    }
                  }
                }
                L20: {
                  L21: {
                    if (param7 == param6) {
                      break L21;
                    } else {
                      L22: {
                        L23: {
                          var15 = -param1 + param7;
                          if (param4 >= param2) {
                            break L23;
                          } else {
                            var9 = param4 << -577295248;
                            var10 = param2 << 2117267440;
                            var12 = (-param2 + param0 << 1142820816) / var15;
                            var11 = (param0 + -param4 << 986351120) / var14;
                            if (0 == 0) {
                              break L22;
                            } else {
                              break L23;
                            }
                          }
                        }
                        var12 = (param0 + -param4 << -1425044464) / var14;
                        var11 = (param0 + -param2 << 383505296) / var15;
                        var10 = param4 << -1079969040;
                        var9 = param2 << -694416144;
                        break L22;
                      }
                      if (0 == 0) {
                        break L20;
                      } else {
                        break L21;
                      }
                    }
                  }
                  var10 = param2 << 1383272304;
                  var12 = 0;
                  var11 = 0;
                  var9 = param4 << 1943088;
                  break L20;
                }
                var13 = 0;
                if (0 > param6) {
                  param6 = Math.min(-param6, param1 + -param6);
                  var10 = var10 + var12 * param6;
                  var9 = var9 + param6 * var11;
                  param6 = 0;
                  break L4;
                } else {
                  break L4;
                }
              }
              L24: {
                if (param6 >= 0) {
                  break L24;
                } else {
                  param6 = -param6;
                  var10 = var10 + var12 * param6;
                  var9 = var9 + var11 * param6;
                  param6 = 0;
                  break L24;
                }
              }
              var15 = ka.field_d[param6];
              if (param6 < param7) {
                L25: {
                  var16 = var9 >> 2034786672;
                  if (ka.field_i <= var16) {
                    break L25;
                  } else {
                    L26: {
                      var17 = (var10 >> 456900624) - (var9 >> 1888753936);
                      if (var17 == 0) {
                        break L26;
                      } else {
                        L27: {
                          if (ka.field_i <= var17 + var16) {
                            var17 = ka.field_i + (-var16 + -1);
                            break L27;
                          } else {
                            break L27;
                          }
                        }
                        L28: {
                          if (var16 >= 0) {
                            break L28;
                          } else {
                            pe.a(var16 + var17, param8, var15, (byte) 104, param3);
                            if (0 == 0) {
                              break L25;
                            } else {
                              break L28;
                            }
                          }
                        }
                        pe.a(var17, param8, var15 + var16, (byte) 113, param3);
                        if (0 == 0) {
                          break L25;
                        } else {
                          break L26;
                        }
                      }
                    }
                    if (var16 < 0) {
                      break L25;
                    } else {
                      if (var16 < ka.field_i) {
                        pe.a(var17, param8, var16 - -var15, (byte) 94, param3);
                        break L25;
                      } else {
                        break L25;
                      }
                    }
                  }
                }
                param6++;
                if (param6 >= ka.field_a) {
                  return;
                } else {
                  var10 = var10 + var12;
                  var9 = var9 + var11;
                  var15 = var15 + sb.field_c;
                  return;
                }
              } else {
                return;
              }
            }
          }
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
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_19_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var4 = Transmogrify.field_A ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param1 == 2117267440) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_g = null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (!fe.field_k.startsWith("win")) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 0;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        if (param0.startsWith("http://")) {
                            statePc = 12;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (!param0.startsWith("https://")) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 11: {
                    return stackIn_11_0 != 0;
                }
                case 12: {
                    try {
                        var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                        var3 = 0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (param0.length() <= var3) {
                            statePc = 19;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0 != 0;
                }
                case 18: {
                    try {
                        var3++;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        Process discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                        stackOut_19_0 = 1;
                        stackIn_20_0 = stackOut_19_0;
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 21;
                        continue stateLoop;
                    }
                }
                case 20: {
                    return stackIn_20_0 != 0;
                }
                case 21: {
                    var2_ref = (Exception) (Object) caughtException;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    abstract rc e(int param0);

    final static String a(CharSequence param0, boolean param1) {
        if (!param1) {
            field_f = -104;
        }
        String var2 = tl.a(11468, uk.b(119, param0));
        if (var2 == null) {
            var2 = "";
        }
        return var2;
    }

    public final void a(boolean param0) {
        ((ca) this).field_d = lk.a(0);
        if (!param0) {
            Object var3 = null;
            ca.a(-41, -118, 56, -109, 40, false, 51, 94, (int[]) null);
        }
    }

    public final String c(int param0) {
        if (!((ca) this).b(-16000)) {
          if (350L + ((ca) this).field_d > lk.a(param0 ^ param0)) {
            return null;
          } else {
            return ((ca) this).f(param0 ^ 30523);
          }
        } else {
          return null;
        }
    }

    public final rc a(int param0) {
        Object var3 = null;
        if (!((ca) this).b(param0 + -43835)) {
          L0: {
            if (param0 == 27835) {
              break L0;
            } else {
              var3 = null;
              String discarded$2 = ca.a((CharSequence) null, false);
              break L0;
            }
          }
          if (lk.a(0) < ((ca) this).field_d + 350L) {
            return ek.field_a;
          } else {
            return ((ca) this).e(20456);
          }
        } else {
          return bc.field_a;
        }
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
