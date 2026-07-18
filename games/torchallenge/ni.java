/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    String field_e;
    int field_c;
    String field_j;
    static boolean field_b;
    static int field_i;
    static int field_f;
    static ka[] field_h;
    lj field_a;
    static bc field_d;
    String field_g;

    final static String a(String[] args, int param1, String param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        StringBuilder var6 = null;
        int var7 = 0;
        String var7_ref_String = null;
        int var8 = 0;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        String stackIn_25_0 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_29_2 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_32_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_24_0 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        String stackOut_27_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        var11 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var3_int = param2.length();
            var4 = var3_int;
            var5 = 0;
            L1: while (true) {
              var6_int = param2.indexOf("<%", var5);
              if (var6_int < 0) {
                var6 = new StringBuilder(var4);
                var7 = 0;
                var5 = 0;
                L2: while (true) {
                  var8 = param2.indexOf("<%", var5);
                  if (var8 >= 0) {
                    var5 = 2 + var8;
                    L3: while (true) {
                      L4: {
                        if (var5 >= var3_int) {
                          break L4;
                        } else {
                          if (!qb.a(param2.charAt(var5), true)) {
                            break L4;
                          } else {
                            var5++;
                            continue L3;
                          }
                        }
                      }
                      var9 = param2.substring(2 + var8, var5);
                      if (!ei.a((byte) -117, (CharSequence) (Object) var9)) {
                        continue L2;
                      } else {
                        if (var3_int <= var5) {
                          continue L2;
                        } else {
                          if (param2.charAt(var5) == 62) {
                            var5++;
                            var10 = qh.a((CharSequence) (Object) var9, (byte) -96);
                            StringBuilder discarded$3 = var6.append(param2.substring(var7, var8));
                            var7 = var5;
                            StringBuilder discarded$4 = var6.append(args[var10]);
                            continue L2;
                          } else {
                            continue L2;
                          }
                        }
                      }
                    }
                  } else {
                    StringBuilder discarded$5 = var6.append(param2.substring(var7));
                    stackOut_24_0 = var6.toString();
                    stackIn_25_0 = stackOut_24_0;
                    break L0;
                  }
                }
              } else {
                var5 = 2 + var6_int;
                L5: while (true) {
                  L6: {
                    if (var5 >= var3_int) {
                      break L6;
                    } else {
                      if (!qb.a(param2.charAt(var5), true)) {
                        break L6;
                      } else {
                        var5++;
                        continue L5;
                      }
                    }
                  }
                  var7_ref_String = param2.substring(2 + var6_int, var5);
                  if (!ei.a((byte) -117, (CharSequence) (Object) var7_ref_String)) {
                    continue L1;
                  } else {
                    if (var5 >= var3_int) {
                      continue L1;
                    } else {
                      if (param2.charAt(var5) == 62) {
                        var5++;
                        var8 = qh.a((CharSequence) (Object) var7_ref_String, (byte) -68);
                        var4 = var4 + (args[var8].length() - (-var6_int + var5));
                        continue L1;
                      } else {
                        continue L1;
                      }
                    }
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var3 = decompiledCaughtException;
            stackOut_26_0 = (RuntimeException) var3;
            stackOut_26_1 = new StringBuilder().append("ni.D(");
            stackIn_28_0 = stackOut_26_0;
            stackIn_28_1 = stackOut_26_1;
            stackIn_27_0 = stackOut_26_0;
            stackIn_27_1 = stackOut_26_1;
            if (args == null) {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "null";
              stackIn_29_0 = stackOut_28_0;
              stackIn_29_1 = stackOut_28_1;
              stackIn_29_2 = stackOut_28_2;
              break L7;
            } else {
              stackOut_27_0 = (RuntimeException) (Object) stackIn_27_0;
              stackOut_27_1 = (StringBuilder) (Object) stackIn_27_1;
              stackOut_27_2 = "{...}";
              stackIn_29_0 = stackOut_27_0;
              stackIn_29_1 = stackOut_27_1;
              stackIn_29_2 = stackOut_27_2;
              break L7;
            }
          }
          L8: {
            stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
            stackOut_29_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_29_2).append(',').append(0).append(',');
            stackIn_31_0 = stackOut_29_0;
            stackIn_31_1 = stackOut_29_1;
            stackIn_30_0 = stackOut_29_0;
            stackIn_30_1 = stackOut_29_1;
            if (param2 == null) {
              stackOut_31_0 = (RuntimeException) (Object) stackIn_31_0;
              stackOut_31_1 = (StringBuilder) (Object) stackIn_31_1;
              stackOut_31_2 = "null";
              stackIn_32_0 = stackOut_31_0;
              stackIn_32_1 = stackOut_31_1;
              stackIn_32_2 = stackOut_31_2;
              break L8;
            } else {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "{...}";
              stackIn_32_0 = stackOut_30_0;
              stackIn_32_1 = stackOut_30_1;
              stackIn_32_2 = stackOut_30_2;
              break L8;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_32_0, stackIn_32_2 + ')');
        }
        return stackIn_25_0;
    }

    final static void a(int param0, byte param1, int param2, int param3, int param4, int param5, int[] param6, int param7, int param8) {
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
        int var20 = 0;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        RuntimeException stackIn_75_0 = null;
        StringBuilder stackIn_75_1 = null;
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        String stackIn_76_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        String stackOut_75_2 = null;
        RuntimeException stackOut_74_0 = null;
        StringBuilder stackOut_74_1 = null;
        String stackOut_74_2 = null;
        var20 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 < 0) {
                break L1;
              } else {
                if (oc.field_e > param0) {
                  L2: {
                    if (param7 >= 0) {
                      break L2;
                    } else {
                      if (param4 >= 0) {
                        break L2;
                      } else {
                        if (param8 >= 0) {
                          break L2;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L3: {
                    if (~param7 > ~oc.field_d) {
                      break L3;
                    } else {
                      if (~param4 > ~oc.field_d) {
                        break L3;
                      } else {
                        if (oc.field_d > param8) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var12 = 90 / ((0 - param1) / 55);
                    var15 = -param0 + param2;
                    if (~param0 == ~param5) {
                      L5: {
                        if (param2 == param0) {
                          var11 = 0;
                          var9_int = param7 << 16;
                          var10 = param4 << 16;
                          var13 = 0;
                          break L5;
                        } else {
                          var16 = -param5 + param2;
                          if (param7 >= param4) {
                            var11 = (-param4 + param8 << 16) / var16;
                            var9_int = param4 << 16;
                            var13 = (param8 + -param7 << 16) / var15;
                            var10 = param7 << 16;
                            break L5;
                          } else {
                            var9_int = param7 << 16;
                            var10 = param4 << 16;
                            var13 = (-param4 + param8 << 16) / var16;
                            var11 = (param8 + -param7 << 16) / var15;
                            break L5;
                          }
                        }
                      }
                      var14 = 0;
                      if (param0 < 0) {
                        param0 = Math.min(-param0, param5 - param0);
                        var10 = var10 + var13 * param0;
                        var9_int = var9_int + param0 * var11;
                        param0 = 0;
                        break L4;
                      } else {
                        break L4;
                      }
                    } else {
                      L6: {
                        var10 = param7 << 16;
                        var9_int = param7 << 16;
                        var16 = -param0 + param5;
                        var13 = (-param7 + param8 << 16) / var15;
                        var11 = (param4 + -param7 << 16) / var16;
                        if (var11 < var13) {
                          var14 = 0;
                          break L6;
                        } else {
                          var17 = var11;
                          var11 = var13;
                          var13 = var17;
                          var14 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param0 >= 0) {
                            break L8;
                          } else {
                            if (param5 >= 0) {
                              param0 = -param0;
                              var10 = var10 + param0 * var13;
                              var9_int = var9_int + param0 * var11;
                              param0 = 0;
                              break L8;
                            } else {
                              param0 = param5 - param0;
                              var9_int = var9_int + param0 * var11;
                              var10 = var10 + param0 * var13;
                              param0 = param5;
                              break L7;
                            }
                          }
                        }
                        var17 = oc.field_b[param0];
                        L9: while (true) {
                          if (~param0 <= ~param5) {
                            break L7;
                          } else {
                            L10: {
                              var18 = var9_int >> 16;
                              if (~oc.field_d >= ~var18) {
                                break L10;
                              } else {
                                var19 = -(var9_int >> 16) + (var10 >> 16);
                                if (var19 != 0) {
                                  L11: {
                                    if (~oc.field_d < ~(var19 + var18)) {
                                      break L11;
                                    } else {
                                      var19 = oc.field_d + (-var18 + -1);
                                      break L11;
                                    }
                                  }
                                  if (var18 < 0) {
                                    kc.a(param3, param6, (byte) -39, var17, var18 + var19);
                                    break L10;
                                  } else {
                                    kc.a(param3, param6, (byte) -39, var18 - -var17, var19);
                                    break L10;
                                  }
                                } else {
                                  if (0 > var18) {
                                    break L10;
                                  } else {
                                    if (var18 < oc.field_d) {
                                      kc.a(param3, param6, (byte) -39, var17 + var18, var19);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                              }
                            }
                            param0++;
                            if (oc.field_e > param0) {
                              var9_int = var9_int + var11;
                              var10 = var10 + var13;
                              var17 = var17 + qg.field_g;
                              continue L9;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var17 = param2 - param5;
                      if (0 == var17) {
                        var13 = 0;
                        var11 = 0;
                        break L4;
                      } else {
                        L12: {
                          if (var14 == 0) {
                            var9_int = param4 << 16;
                            break L12;
                          } else {
                            var10 = param4 << 16;
                            break L12;
                          }
                        }
                        var18 = param8 << 16;
                        var11 = (-var9_int + var18) / var17;
                        var13 = (-var10 + var18) / var17;
                        break L4;
                      }
                    }
                  }
                  L13: {
                    if (param0 >= 0) {
                      break L13;
                    } else {
                      param0 = -param0;
                      var9_int = var9_int + var11 * param0;
                      var10 = var10 + var13 * param0;
                      param0 = 0;
                      break L13;
                    }
                  }
                  var16 = oc.field_b[param0];
                  L14: while (true) {
                    if (param2 <= param0) {
                      break L0;
                    } else {
                      L15: {
                        var17 = var9_int >> 16;
                        if (~oc.field_d < ~var17) {
                          var18 = -(var9_int >> 16) + (var10 >> 16);
                          if (0 == var18) {
                            if (0 > var17) {
                              break L15;
                            } else {
                              if (oc.field_d <= var17) {
                                break L15;
                              } else {
                                kc.a(param3, param6, (byte) -39, var16 + var17, var18);
                                break L15;
                              }
                            }
                          } else {
                            L16: {
                              if (oc.field_d <= var18 + var17) {
                                var18 = -var17 + (oc.field_d + -1);
                                break L16;
                              } else {
                                break L16;
                              }
                            }
                            if (var17 >= 0) {
                              kc.a(param3, param6, (byte) -39, var16 + var17, var18);
                              break L15;
                            } else {
                              kc.a(param3, param6, (byte) -39, var16, var18 - -var17);
                              break L15;
                            }
                          }
                        } else {
                          break L15;
                        }
                      }
                      param0++;
                      if (~oc.field_e >= ~param0) {
                        return;
                      } else {
                        var10 = var10 + var13;
                        var16 = var16 + qg.field_g;
                        var9_int = var9_int + var11;
                        continue L14;
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var9 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var9;
            stackOut_73_1 = new StringBuilder().append("ni.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param6 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L17;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L17;
            }
          }
          throw oj.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param7 + ',' + param8 + ')');
        }
    }

    final static void a(int param0, int param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        ji var5 = null;
        ae var6 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            var5 = (ji) (Object) wf.field_g.c((byte) 113);
            L1: while (true) {
              if (var5 == null) {
                var6 = (ae) (Object) bk.field_t.c((byte) 122);
                var3 = -1;
                L2: while (true) {
                  if (var6 == null) {
                    break L0;
                  } else {
                    bg.a(3, (byte) 26, var6);
                    var6 = (ae) (Object) bk.field_t.c(-270);
                    continue L2;
                  }
                }
              } else {
                ul.a(-18261, var5, 3);
                var5 = (ji) (Object) wf.field_g.c(-270);
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var2, "ni.B(" + 3 + ',' + 103 + ')');
        }
    }

    public static void a(boolean param0) {
        field_h = null;
        field_d = null;
    }

    private ni() throws Throwable {
        throw new Error();
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
    }
}
