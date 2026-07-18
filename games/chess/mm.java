/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mm {
    static um field_d;
    static String field_c;
    static dd field_a;
    static String field_b;
    static String field_e;

    final static int[] a(int param0, int param1, int param2) {
        int var3 = pj.a(104, param0);
        int var4 = rf.a(param0, 255);
        int var5 = pj.a(110, param2);
        int var6 = rf.a(param2, 255);
        int var7 = (int)((long)var5 * (long)var3 >> 16);
        int var8 = (int)((long)var6 * (long)var3 >> 16);
        int var9 = (int)((long)var4 * (long)var5 >> 16);
        int var10 = (int)((long)var6 * (long)var4 >> 16);
        return new int[]{0, 0, 0, var6, 0, var5, var7, var4, -var8, -var9, var3, var10};
    }

    final static void a(byte param0, int param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        var20 = Chess.field_G;
        try {
          L0: {
            L1: {
              if (0 > param1) {
                break L1;
              } else {
                if (~nh.field_l < ~param5) {
                  L2: {
                    if (param7 >= 0) {
                      break L2;
                    } else {
                      if (0 <= param6) {
                        break L2;
                      } else {
                        if (param3 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (nh.field_o > param7) {
                      break L3;
                    } else {
                      if (param6 < nh.field_o) {
                        break L3;
                      } else {
                        if (~nh.field_o < ~param3) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    var9_int = -124 / ((29 - param0) / 63);
                    var15 = -param5 + param1;
                    if (~param5 != ~param8) {
                      L5: {
                        var11 = param7 << 16;
                        var10 = param7 << 16;
                        var16 = param8 + -param5;
                        var13 = (-param7 + param3 << 16) / var15;
                        var12 = (param6 + -param7 << 16) / var16;
                        if (~var13 >= ~var12) {
                          var17 = var12;
                          var12 = var13;
                          var13 = var17;
                          var14 = 1;
                          break L5;
                        } else {
                          var14 = 0;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param5 < 0) {
                            if (param8 < 0) {
                              param5 = -param5 + param8;
                              var10 = var10 + var12 * param5;
                              var11 = var11 + param5 * var13;
                              param5 = param8;
                              break L6;
                            } else {
                              param5 = -param5;
                              var11 = var11 + param5 * var13;
                              var10 = var10 + var12 * param5;
                              param5 = 0;
                              break L7;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var17 = nh.field_p[param5];
                        L8: while (true) {
                          if (param8 <= param5) {
                            break L6;
                          } else {
                            L9: {
                              var18 = var10 >> 16;
                              if (nh.field_o <= var18) {
                                break L9;
                              } else {
                                var19 = -(var10 >> 16) + (var11 >> 16);
                                if (var19 == 0) {
                                  if (var18 < 0) {
                                    break L9;
                                  } else {
                                    if (~var18 > ~nh.field_o) {
                                      fk.a(0, var19, param4, param2, var17 + var18);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (var19 + var18 < nh.field_o) {
                                      break L10;
                                    } else {
                                      var19 = nh.field_o + -var18 - 1;
                                      break L10;
                                    }
                                  }
                                  if (0 > var18) {
                                    fk.a(0, var18 + var19, param4, param2, var17);
                                    break L9;
                                  } else {
                                    fk.a(0, var19, param4, param2, var17 + var18);
                                    break L9;
                                  }
                                }
                              }
                            }
                            param5++;
                            if (~nh.field_l < ~param5) {
                              var11 = var11 + var13;
                              var17 = var17 + wb.field_h;
                              var10 = var10 + var12;
                              continue L8;
                            } else {
                              return;
                            }
                          }
                        }
                      }
                      var17 = -param8 + param1;
                      if (var17 != 0) {
                        L11: {
                          if (var14 != 0) {
                            var11 = param6 << 16;
                            break L11;
                          } else {
                            var10 = param6 << 16;
                            break L11;
                          }
                        }
                        var18 = param3 << 16;
                        var12 = (-var10 + var18) / var17;
                        var13 = (-var11 + var18) / var17;
                        break L4;
                      } else {
                        var13 = 0;
                        var12 = 0;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (~param5 != ~param1) {
                          var16 = -param8 + param1;
                          if (param7 < param6) {
                            var11 = param6 << 16;
                            var12 = (-param7 + param3 << 16) / var15;
                            var13 = (param3 + -param6 << 16) / var16;
                            var10 = param7 << 16;
                            break L12;
                          } else {
                            var12 = (param3 + -param6 << 16) / var16;
                            var13 = (param3 + -param7 << 16) / var15;
                            var10 = param6 << 16;
                            var11 = param7 << 16;
                            break L12;
                          }
                        } else {
                          var11 = param6 << 16;
                          var10 = param7 << 16;
                          var12 = 0;
                          var13 = 0;
                          break L12;
                        }
                      }
                      L13: {
                        if (0 > param5) {
                          param5 = Math.min(-param5, param8 - param5);
                          var11 = var11 + param5 * var13;
                          var10 = var10 + var12 * param5;
                          param5 = 0;
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var14 = 0;
                      break L4;
                    }
                  }
                  L14: {
                    if (param5 >= 0) {
                      break L14;
                    } else {
                      param5 = -param5;
                      var11 = var11 + param5 * var13;
                      var10 = var10 + var12 * param5;
                      param5 = 0;
                      break L14;
                    }
                  }
                  var16 = nh.field_p[param5];
                  L15: while (true) {
                    if (param1 <= param5) {
                      break L0;
                    } else {
                      L16: {
                        var17 = var10 >> 16;
                        if (~var17 <= ~nh.field_o) {
                          break L16;
                        } else {
                          var18 = (var11 >> 16) + -(var10 >> 16);
                          if (var18 != 0) {
                            L17: {
                              if (var17 - -var18 >= nh.field_o) {
                                var18 = -1 + (-var17 + nh.field_o);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var17 >= 0) {
                              fk.a(0, var18, param4, param2, var17 - -var16);
                              break L16;
                            } else {
                              fk.a(0, var18 + var17, param4, param2, var16);
                              break L16;
                            }
                          } else {
                            if (0 > var17) {
                              break L16;
                            } else {
                              if (~var17 <= ~nh.field_o) {
                                break L16;
                              } else {
                                fk.a(0, var18, param4, param2, var16 + var17);
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      param5++;
                      if (nh.field_l > param5) {
                        var10 = var10 + var12;
                        var16 = var16 + wb.field_h;
                        var11 = var11 + var13;
                        continue L15;
                      } else {
                        return;
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
          L18: {
            var9 = decompiledCaughtException;
            stackOut_73_0 = (RuntimeException) var9;
            stackOut_73_1 = new StringBuilder().append("mm.C(").append(param0).append(',').append(param1).append(',');
            stackIn_75_0 = stackOut_73_0;
            stackIn_75_1 = stackOut_73_1;
            stackIn_74_0 = stackOut_73_0;
            stackIn_74_1 = stackOut_73_1;
            if (param2 == null) {
              stackOut_75_0 = (RuntimeException) (Object) stackIn_75_0;
              stackOut_75_1 = (StringBuilder) (Object) stackIn_75_1;
              stackOut_75_2 = "null";
              stackIn_76_0 = stackOut_75_0;
              stackIn_76_1 = stackOut_75_1;
              stackIn_76_2 = stackOut_75_2;
              break L18;
            } else {
              stackOut_74_0 = (RuntimeException) (Object) stackIn_74_0;
              stackOut_74_1 = (StringBuilder) (Object) stackIn_74_1;
              stackOut_74_2 = "{...}";
              stackIn_76_0 = stackOut_74_0;
              stackIn_76_1 = stackOut_74_1;
              stackIn_76_2 = stackOut_74_2;
              break L18;
            }
          }
          throw fk.a((Throwable) (Object) stackIn_76_0, stackIn_76_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        field_a = null;
        field_d = null;
        field_e = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "your friend";
        field_b = "Please try changing the following settings:  ";
        field_e = "Unpacking graphics";
    }
}
