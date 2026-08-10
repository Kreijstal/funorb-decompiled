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
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        String stackIn_81_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
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
                      if (-1 >= (param2 ^ -1)) {
                        break L2;
                      } else {
                        if (param0 >= 0) {
                          break L2;
                        } else {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        }
                      }
                    }
                  }
                  L3: {
                    if (ka.field_i > param4) {
                      break L3;
                    } else {
                      if (ka.field_i > param2) {
                        break L3;
                      } else {
                        if (ka.field_i <= param0) {
                          decompiledRegionSelector0 = 2;
                          break L0;
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
                        if (param7 == param6) {
                          var10 = param2 << 1383272304;
                          var12 = 0;
                          var11 = 0;
                          var9_int = param4 << 1943088;
                          break L6;
                        } else {
                          var15 = -param1 + param7;
                          if (param4 >= param2) {
                            var12 = (param0 + -param4 << -1425044464) / var14;
                            var11 = (param0 + -param2 << 383505296) / var15;
                            var10 = param4 << -1079969040;
                            var9_int = param2 << -694416144;
                            break L6;
                          } else {
                            var9_int = param4 << -577295248;
                            var10 = param2 << 2117267440;
                            var12 = (-param2 + param0 << 1142820816) / var15;
                            var11 = (param0 + -param4 << 986351120) / var14;
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
                        var10 = param4 << -1317603696;
                        var9_int = param4 << -1317603696;
                        var15 = -param6 + param1;
                        var12 = (-param4 + param0 << -933790736) / var14;
                        var11 = (-param4 + param2 << 1350879792) / var15;
                        if (var12 > var11) {
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
                          if (-1 < (param6 ^ -1)) {
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
                          if (param1 <= param6) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 1912388592;
                              if (ka.field_i > var17) {
                                var18 = (var10 >> 1041630928) - (var9_int >> 1171754384);
                                if (var18 == 0) {
                                  if (-1 < (var17 ^ -1)) {
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
                                    if (ka.field_i > var17 - -var18) {
                                      break L12;
                                    } else {
                                      var18 = -1 + ka.field_i + -var17;
                                      break L12;
                                    }
                                  }
                                  if ((var17 ^ -1) <= -1) {
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
                              decompiledRegionSelector0 = 3;
                              break L0;
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
                          var17 = param0 << 1124575536;
                          if (var13 != 0) {
                            var10 = param2 << -197595280;
                            break L13;
                          } else {
                            var9_int = param2 << 2114563536;
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
                    if (-1 >= (param6 ^ -1)) {
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
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 2034786672;
                        if (ka.field_i <= var16) {
                          break L16;
                        } else {
                          var17 = (var10 >> 456900624) - (var9_int >> 1888753936);
                          if (var17 == 0) {
                            if ((var16 ^ -1) > -1) {
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
                              if (ka.field_i <= var17 + var16) {
                                var17 = ka.field_i + (-var16 + -1);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if ((var16 ^ -1) <= -1) {
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
                      if (param6 >= ka.field_a) {
                        decompiledRegionSelector0 = 5;
                        break L0;
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
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackIn_80_0 = (RuntimeException) (var9);

            stackIn_80_1 = new StringBuilder().append("ca.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');

            if (param8 == null) {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "null";
              break L18;
            } else {
              stackIn_81_0 = (RuntimeException) ((Object) stackIn_80_0);
              stackIn_81_1 = (StringBuilder) ((Object) stackIn_80_1);
              stackIn_81_2 = "{...}";
              break L18;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_81_0), stackIn_81_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return;
                } else {
                  return;
                }
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
            field_a = (String) null;
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
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  if (param1 == 2117267440) {
                    break L2;
                  } else {
                    field_g = (ck) null;
                    break L2;
                  }
                }
                if (!fe.field_k.startsWith("win")) {
                  stackIn_6_0 = 0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L3: {
                    if (param0.startsWith("http://")) {
                      break L3;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackIn_11_0 = 0;
                        decompiledRegionSelector0 = 1;
                        break L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                  var2 = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                  var3 = 0;
                  L4: while (true) {
                    if (param0.length() <= var3) {
                      Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackIn_20_0 = 1;
                      decompiledRegionSelector0 = 3;
                      break L1;
                    } else {
                      if (-1 == var2.indexOf((int) param0.charAt(var3))) {
                        stackIn_17_0 = 0;
                        decompiledRegionSelector0 = 2;
                        break L1;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackIn_22_0 = 0;
              return stackIn_22_0 != 0;
            }
            if (decompiledRegionSelector0 == 0) {
              decompiledRegionSelector1 = 0;
              break L0;
            } else {
              if (decompiledRegionSelector0 == 1) {
                decompiledRegionSelector1 = 1;
                break L0;
              } else {
                if (decompiledRegionSelector0 == 2) {
                  decompiledRegionSelector1 = 2;
                  break L0;
                } else {
                  decompiledRegionSelector1 = 3;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          L5: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = (RuntimeException) (var2_ref2);

            stackIn_25_1 = new StringBuilder().append("ca.J(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L5;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L5;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_17_0 != 0;
            } else {
              return stackIn_20_0 != 0;
            }
          }
        }
    }

    abstract rc e(int param0);

    final static String a(CharSequence param0, boolean param1) {
        String var2 = null;
        RuntimeException var2_ref = null;
        String stackIn_5_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (String) (var2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("ca.M(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L3;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param1 + ')');
        }
        return stackIn_5_0;
    }

    public final void a(boolean param0) {
        this.field_d = lk.a(0);
        if (!param0) {
            int[] var3 = (int[]) null;
            ca.a(-41, -118, 56, -109, 40, false, 51, 94, (int[]) null);
        }
    }

    public final String c(int param0) {
        if (!this.b(-16000)) {
          if (350L + this.field_d > lk.a(param0 ^ param0)) {
            return null;
          } else {
            return this.f(param0 ^ 30523);
          }
        } else {
          return null;
        }
    }

    public final rc a(int param0) {
        CharSequence var3;
        if (!this.b(param0 + -43835)) {
          L0: {
            if (param0 == 27835) {
              break L0;
            } else {
              var3 = (CharSequence) null;
              ca.a((CharSequence) null, false);
              break L0;
            }
          }
          if (lk.a(0) < this.field_d + 350L) {
            return ek.field_a;
          } else {
            return this.e(20456);
          }
        } else {
          return bc.field_a;
        }
    }

    abstract String f(int param0);

    static {
        field_c = new int[128];
        field_a = "End tutorial";
        field_f = 5;
        field_e = -1;
    }
}
