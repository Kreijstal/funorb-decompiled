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
        int stackIn_29_0 = 0;
        int stackIn_29_1 = 0;
        int stackIn_47_0 = 0;
        int stackIn_47_1 = 0;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        RuntimeException stackIn_89_0 = null;
        StringBuilder stackIn_89_1 = null;
        RuntimeException stackIn_90_0 = null;
        StringBuilder stackIn_90_1 = null;
        String stackIn_90_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_28_0 = 0;
        int stackOut_28_1 = 0;
        int stackOut_46_0 = 0;
        int stackOut_46_1 = 0;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        RuntimeException stackOut_89_0 = null;
        StringBuilder stackOut_89_1 = null;
        String stackOut_89_2 = null;
        RuntimeException stackOut_88_0 = null;
        StringBuilder stackOut_88_1 = null;
        String stackOut_88_2 = null;
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
                    if ((ka.field_i ^ -1) < (param4 ^ -1)) {
                      break L3;
                    } else {
                      if (ka.field_i > param2) {
                        break L3;
                      } else {
                        if ((ka.field_i ^ -1) >= (param0 ^ -1)) {
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
                    L6: {
                      var14 = param7 + -param6;
                      if (param6 == param1) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            var10 = param4 << -1317603696;
                            var9_int = param4 << -1317603696;
                            var15 = -param6 + param1;
                            var12 = (-param4 + param0 << -933790736) / var14;
                            var11 = (-param4 + param2 << 1350879792) / var15;
                            if ((var12 ^ -1) < (var11 ^ -1)) {
                              break L8;
                            } else {
                              var13 = 1;
                              var16 = var11;
                              var11 = var12;
                              var12 = var16;
                              if (var19 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var13 = 0;
                          break L7;
                        }
                        L9: {
                          L10: {
                            L11: {
                              if (-1 < (param6 ^ -1)) {
                                L12: {
                                  if (0 <= param1) {
                                    break L12;
                                  } else {
                                    param6 = -param6 + param1;
                                    var9_int = var9_int + var11 * param6;
                                    var10 = var10 + param6 * var12;
                                    param6 = param1;
                                    if (var19 == 0) {
                                      break L10;
                                    } else {
                                      break L12;
                                    }
                                  }
                                }
                                param6 = -param6;
                                var10 = var10 + var12 * param6;
                                var9_int = var9_int + var11 * param6;
                                param6 = 0;
                                break L11;
                              } else {
                                break L11;
                              }
                            }
                            var16 = ka.field_d[param6];
                            L13: while (true) {
                              if ((param1 ^ -1) >= (param6 ^ -1)) {
                                break L10;
                              } else {
                                var17 = var9_int >> 1912388592;
                                stackOut_28_0 = ka.field_i;
                                stackOut_28_1 = var17;
                                stackIn_47_0 = stackOut_28_0;
                                stackIn_47_1 = stackOut_28_1;
                                stackIn_29_0 = stackOut_28_0;
                                stackIn_29_1 = stackOut_28_1;
                                if (var19 != 0) {
                                  break L9;
                                } else {
                                  L14: {
                                    if (stackIn_29_0 > stackIn_29_1) {
                                      L15: {
                                        var18 = (var10 >> 1041630928) - (var9_int >> 1171754384);
                                        if (var18 == 0) {
                                          break L15;
                                        } else {
                                          L16: {
                                            if ((ka.field_i ^ -1) < (var17 - -var18 ^ -1)) {
                                              break L16;
                                            } else {
                                              var18 = -1 + ka.field_i + -var17;
                                              break L16;
                                            }
                                          }
                                          L17: {
                                            if ((var17 ^ -1) <= -1) {
                                              break L17;
                                            } else {
                                              pe.a(var18 - -var17, param8, var16, (byte) 117, param3);
                                              if (var19 == 0) {
                                                break L14;
                                              } else {
                                                break L17;
                                              }
                                            }
                                          }
                                          pe.a(var18, param8, var17 + var16, (byte) 110, param3);
                                          if (var19 == 0) {
                                            break L14;
                                          } else {
                                            break L15;
                                          }
                                        }
                                      }
                                      if (-1 < (var17 ^ -1)) {
                                        break L14;
                                      } else {
                                        if (var17 < ka.field_i) {
                                          pe.a(var18, param8, var17 - -var16, (byte) 105, param3);
                                          break L14;
                                        } else {
                                          break L14;
                                        }
                                      }
                                    } else {
                                      break L14;
                                    }
                                  }
                                  param6++;
                                  if (param6 < ka.field_a) {
                                    var16 = var16 + sb.field_c;
                                    var10 = var10 + var12;
                                    var9_int = var9_int + var11;
                                    if (var19 == 0) {
                                      continue L13;
                                    } else {
                                      break L10;
                                    }
                                  } else {
                                    decompiledRegionSelector0 = 3;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          var16 = -param1 + param7;
                          stackOut_46_0 = 0;
                          stackOut_46_1 = var16;
                          stackIn_47_0 = stackOut_46_0;
                          stackIn_47_1 = stackOut_46_1;
                          break L9;
                        }
                        L18: {
                          L19: {
                            if (stackIn_47_0 == stackIn_47_1) {
                              break L19;
                            } else {
                              L20: {
                                L21: {
                                  var17 = param0 << 1124575536;
                                  if (var13 != 0) {
                                    break L21;
                                  } else {
                                    var9_int = param2 << 2114563536;
                                    if (var19 == 0) {
                                      break L20;
                                    } else {
                                      break L21;
                                    }
                                  }
                                }
                                var10 = param2 << -197595280;
                                break L20;
                              }
                              var11 = (var17 - var9_int) / var16;
                              var12 = (var17 - var10) / var16;
                              if (var19 == 0) {
                                break L18;
                              } else {
                                break L19;
                              }
                            }
                          }
                          var12 = 0;
                          var11 = 0;
                          break L18;
                        }
                        if (var19 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L22: {
                      L23: {
                        if ((param7 ^ -1) == (param6 ^ -1)) {
                          break L23;
                        } else {
                          L24: {
                            L25: {
                              var15 = -param1 + param7;
                              if (param4 >= param2) {
                                break L25;
                              } else {
                                var9_int = param4 << -577295248;
                                var10 = param2 << 2117267440;
                                var12 = (-param2 + param0 << 1142820816) / var15;
                                var11 = (param0 + -param4 << 986351120) / var14;
                                if (var19 == 0) {
                                  break L24;
                                } else {
                                  break L25;
                                }
                              }
                            }
                            var12 = (param0 + -param4 << -1425044464) / var14;
                            var11 = (param0 + -param2 << 383505296) / var15;
                            var10 = param4 << -1079969040;
                            var9_int = param2 << -694416144;
                            break L24;
                          }
                          if (var19 == 0) {
                            break L22;
                          } else {
                            break L23;
                          }
                        }
                      }
                      var10 = param2 << 1383272304;
                      var12 = 0;
                      var11 = 0;
                      var9_int = param4 << 1943088;
                      break L22;
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
                  }
                  L26: {
                    if (-1 >= (param6 ^ -1)) {
                      break L26;
                    } else {
                      param6 = -param6;
                      var10 = var10 + var12 * param6;
                      var9_int = var9_int + var11 * param6;
                      param6 = 0;
                      break L26;
                    }
                  }
                  var15 = ka.field_d[param6];
                  L27: while (true) {
                    L28: {
                      L29: {
                        if (param6 >= param7) {
                          break L29;
                        } else {
                          var16 = var9_int >> 2034786672;
                          if (var19 != 0) {
                            break L28;
                          } else {
                            L30: {
                              if (ka.field_i <= var16) {
                                break L30;
                              } else {
                                L31: {
                                  var17 = (var10 >> 456900624) - (var9_int >> 1888753936);
                                  if (var17 == 0) {
                                    break L31;
                                  } else {
                                    L32: {
                                      if ((ka.field_i ^ -1) >= (var17 + var16 ^ -1)) {
                                        var17 = ka.field_i + (-var16 + -1);
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    L33: {
                                      if ((var16 ^ -1) <= -1) {
                                        break L33;
                                      } else {
                                        pe.a(var16 + var17, param8, var15, (byte) 104, param3);
                                        if (var19 == 0) {
                                          break L30;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    pe.a(var17, param8, var15 + var16, (byte) 113, param3);
                                    if (var19 == 0) {
                                      break L30;
                                    } else {
                                      break L31;
                                    }
                                  }
                                }
                                if ((var16 ^ -1) > -1) {
                                  break L30;
                                } else {
                                  if (var16 < ka.field_i) {
                                    pe.a(var17, param8, var16 - -var15, (byte) 94, param3);
                                    break L30;
                                  } else {
                                    break L30;
                                  }
                                }
                              }
                            }
                            param6++;
                            if ((param6 ^ -1) <= (ka.field_a ^ -1)) {
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              var15 = var15 + sb.field_c;
                              if (var19 == 0) {
                                continue L27;
                              } else {
                                break L29;
                              }
                            }
                          }
                        }
                      }
                      break L28;
                    }
                    decompiledRegionSelector0 = 4;
                    break L0;
                  }
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L34: {
            var9 = decompiledCaughtException;
            stackOut_87_0 = (RuntimeException) (var9);
            stackOut_87_1 = new StringBuilder().append("ca.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_89_0 = stackOut_87_0;
            stackIn_89_1 = stackOut_87_1;
            stackIn_88_0 = stackOut_87_0;
            stackIn_88_1 = stackOut_87_1;
            if (param8 == null) {
              stackOut_89_0 = (RuntimeException) ((Object) stackIn_89_0);
              stackOut_89_1 = (StringBuilder) ((Object) stackIn_89_1);
              stackOut_89_2 = "null";
              stackIn_90_0 = stackOut_89_0;
              stackIn_90_1 = stackOut_89_1;
              stackIn_90_2 = stackOut_89_2;
              break L34;
            } else {
              stackOut_88_0 = (RuntimeException) ((Object) stackIn_88_0);
              stackOut_88_1 = (StringBuilder) ((Object) stackIn_88_1);
              stackOut_88_2 = "{...}";
              stackIn_90_0 = stackOut_88_0;
              stackIn_90_1 = stackOut_88_1;
              stackIn_90_2 = stackOut_88_2;
              break L34;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_90_0), stackIn_90_2 + ')');
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
        Process discarded$2 = null;
        String var2 = null;
        Exception var2_ref = null;
        RuntimeException var2_ref2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        int decompiledRegionSelector1 = 0;
        Throwable decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_22_0 = 0;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
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
                  stackOut_5_0 = 0;
                  stackIn_6_0 = stackOut_5_0;
                  decompiledRegionSelector0 = 0;
                  break L1;
                } else {
                  L3: {
                    if (param0.startsWith("http://")) {
                      break L3;
                    } else {
                      if (!param0.startsWith("https://")) {
                        stackOut_10_0 = 0;
                        stackIn_11_0 = stackOut_10_0;
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
                    L5: {
                      L6: {
                        if ((param0.length() ^ -1) >= (var3 ^ -1)) {
                          break L6;
                        } else {
                          stackOut_14_0 = -1;
                          stackIn_21_0 = stackOut_14_0;
                          stackIn_15_0 = stackOut_14_0;
                          if (var4 != 0) {
                            break L5;
                          } else {
                            if (stackIn_15_0 == var2.indexOf((int) param0.charAt(var3))) {
                              stackOut_17_0 = 0;
                              stackIn_18_0 = stackOut_17_0;
                              decompiledRegionSelector0 = 3;
                              break L1;
                            } else {
                              var3++;
                              if (var4 == 0) {
                                continue L4;
                              } else {
                                break L6;
                              }
                            }
                          }
                        }
                      }
                      discarded$2 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + param0 + "\"");
                      stackOut_20_0 = 1;
                      stackIn_21_0 = stackOut_20_0;
                      break L5;
                    }
                    decompiledRegionSelector0 = 2;
                    break L1;
                  }
                }
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              return stackIn_23_0 != 0;
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
          L7: {
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackOut_24_0 = (RuntimeException) (var2_ref2);
            stackOut_24_1 = new StringBuilder().append("ca.J(");
            stackIn_26_0 = stackOut_24_0;
            stackIn_26_1 = stackOut_24_1;
            stackIn_25_0 = stackOut_24_0;
            stackIn_25_1 = stackOut_24_1;
            if (param0 == null) {
              stackOut_26_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackOut_26_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackOut_26_2 = "null";
              stackIn_27_0 = stackOut_26_0;
              stackIn_27_1 = stackOut_26_1;
              stackIn_27_2 = stackOut_26_2;
              break L7;
            } else {
              stackOut_25_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackOut_25_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackOut_25_2 = "{...}";
              stackIn_27_0 = stackOut_25_0;
              stackIn_27_1 = stackOut_25_1;
              stackIn_27_2 = stackOut_25_2;
              break L7;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector1 == 0) {
          return stackIn_6_0 != 0;
        } else {
          if (decompiledRegionSelector1 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector1 == 2) {
              return stackIn_21_0 != 0;
            } else {
              return stackIn_18_0 != 0;
            }
          }
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
            stackOut_4_0 = (String) (var2);
            stackIn_5_0 = stackOut_4_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) (var2_ref);
            stackOut_6_1 = new StringBuilder().append("ca.M(");
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackOut_8_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) ((Object) stackIn_7_0);
              stackOut_7_1 = (StringBuilder) ((Object) stackIn_7_1);
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
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
        if (this.b(-16000)) {
            return null;
        }
        if (350L + this.field_d > lk.a(param0 ^ param0)) {
            return null;
        }
        return this.f(param0 ^ 30523);
    }

    public final rc a(int param0) {
        String discarded$0 = null;
        if (this.b(param0 + -43835)) {
            return bc.field_a;
        }
        if (param0 != 27835) {
            CharSequence var3 = (CharSequence) null;
            discarded$0 = ca.a((CharSequence) null, false);
        }
        if (lk.a(0) < this.field_d + 350L) {
            return ek.field_a;
        }
        return this.e(20456);
    }

    abstract String f(int param0);

    static {
        field_c = new int[128];
        field_a = "End tutorial";
        field_f = 5;
        field_e = -1;
    }
}
