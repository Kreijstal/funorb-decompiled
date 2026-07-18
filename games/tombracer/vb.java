/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vb extends vg {
    int field_g;
    qia field_f;
    vg field_h;
    static int field_i;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int[] param8) {
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
        RuntimeException stackIn_76_0 = null;
        StringBuilder stackIn_76_1 = null;
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_75_0 = null;
        StringBuilder stackOut_75_1 = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        String stackOut_77_2 = null;
        RuntimeException stackOut_76_0 = null;
        StringBuilder stackOut_76_1 = null;
        String stackOut_76_2 = null;
        var19 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param7 < 0) {
                break L1;
              } else {
                if (uoa.field_b > param3) {
                  L2: {
                    if (0 <= param5) {
                      break L2;
                    } else {
                      if (param1 >= 0) {
                        break L2;
                      } else {
                        if (param4 < 0) {
                          return;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (uoa.field_e > param5) {
                      break L3;
                    } else {
                      if (uoa.field_e > param1) {
                        break L3;
                      } else {
                        if (param4 >= uoa.field_e) {
                          return;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  L4: {
                    var14 = param7 - param3;
                    if (param3 != param6) {
                      L5: {
                        var10 = param5 << 16;
                        var9_int = param5 << 16;
                        var15 = param6 + -param3;
                        var11 = (param1 - param5 << 16) / var15;
                        var12 = (param4 + -param5 << 16) / var14;
                        if (var11 < var12) {
                          var13 = 0;
                          break L5;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L5;
                        }
                      }
                      L6: {
                        L7: {
                          if (param3 < 0) {
                            if (param6 >= 0) {
                              param3 = -param3;
                              var10 = var10 + var12 * param3;
                              var9_int = var9_int + var11 * param3;
                              param3 = 0;
                              break L7;
                            } else {
                              param3 = param6 + -param3;
                              var10 = var10 + var12 * param3;
                              var9_int = var9_int + param3 * var11;
                              param3 = param6;
                              break L6;
                            }
                          } else {
                            break L7;
                          }
                        }
                        var16 = uoa.field_d[param3];
                        L8: while (true) {
                          if (param6 <= param3) {
                            break L6;
                          } else {
                            L9: {
                              var17 = var9_int >> 16;
                              if (uoa.field_e > var17) {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (0 == var18) {
                                  if (var17 < 0) {
                                    break L9;
                                  } else {
                                    if (var17 < uoa.field_e) {
                                      tl.a(var16 + var17, var18, param2, 1535993377, param8);
                                      break L9;
                                    } else {
                                      break L9;
                                    }
                                  }
                                } else {
                                  L10: {
                                    if (uoa.field_e > var17 - -var18) {
                                      break L10;
                                    } else {
                                      var18 = -var17 + (uoa.field_e + -1);
                                      break L10;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    tl.a(var16 + var17, var18, param2, 1535993377, param8);
                                    break L9;
                                  } else {
                                    tl.a(var16, var18 + var17, param2, 1535993377, param8);
                                    break L9;
                                  }
                                }
                              } else {
                                break L9;
                              }
                            }
                            param3++;
                            if (param3 >= uoa.field_b) {
                              return;
                            } else {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + bea.field_g;
                              continue L8;
                            }
                          }
                        }
                      }
                      var16 = -param6 + param7;
                      if (0 == var16) {
                        var11 = 0;
                        var12 = 0;
                        break L4;
                      } else {
                        L11: {
                          if (var13 != 0) {
                            var10 = param1 << 16;
                            break L11;
                          } else {
                            var9_int = param1 << 16;
                            break L11;
                          }
                        }
                        var17 = param4 << 16;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L4;
                      }
                    } else {
                      L12: {
                        if (param7 == param3) {
                          var11 = 0;
                          var12 = 0;
                          var9_int = param5 << 16;
                          var10 = param1 << 16;
                          break L12;
                        } else {
                          var15 = param7 + -param6;
                          if (param1 <= param5) {
                            var11 = (param4 - param1 << 16) / var15;
                            var12 = (-param5 + param4 << 16) / var14;
                            var9_int = param1 << 16;
                            var10 = param5 << 16;
                            break L12;
                          } else {
                            var11 = (-param5 + param4 << 16) / var14;
                            var12 = (-param1 + param4 << 16) / var15;
                            var9_int = param5 << 16;
                            var10 = param1 << 16;
                            break L12;
                          }
                        }
                      }
                      L13: {
                        if (param3 >= 0) {
                          break L13;
                        } else {
                          param3 = Math.min(-param3, param6 + -param3);
                          var9_int = var9_int + param3 * var11;
                          var10 = var10 + param3 * var12;
                          param3 = 0;
                          break L13;
                        }
                      }
                      var13 = 0;
                      break L4;
                    }
                  }
                  L14: {
                    if (param3 >= 0) {
                      break L14;
                    } else {
                      param3 = -param3;
                      var9_int = var9_int + param3 * var11;
                      var10 = var10 + param3 * var12;
                      param3 = 0;
                      break L14;
                    }
                  }
                  var15 = uoa.field_d[param3];
                  L15: while (true) {
                    if (param7 <= param3) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (uoa.field_e <= var16) {
                          break L16;
                        } else {
                          var17 = (var10 >> 16) + -(var9_int >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L16;
                            } else {
                              if (var16 >= uoa.field_e) {
                                break L16;
                              } else {
                                tl.a(var15 + var16, var17, param2, 1535993377, param8);
                                break L16;
                              }
                            }
                          } else {
                            L17: {
                              if (uoa.field_e <= var16 + var17) {
                                var17 = -1 + (-var16 + uoa.field_e);
                                break L17;
                              } else {
                                break L17;
                              }
                            }
                            if (var16 < 0) {
                              tl.a(var15, var17 + var16, param2, 1535993377, param8);
                              break L16;
                            } else {
                              tl.a(var15 + var16, var17, param2, 1535993377, param8);
                              break L16;
                            }
                          }
                        }
                      }
                      param3++;
                      if (uoa.field_b <= param3) {
                        return;
                      } else {
                        var10 = var10 + var12;
                        var9_int = var9_int + var11;
                        var15 = var15 + bea.field_g;
                        continue L15;
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
            stackOut_75_0 = (RuntimeException) var9;
            stackOut_75_1 = new StringBuilder().append("vb.A(").append(-922437200).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param8 == null) {
              stackOut_77_0 = (RuntimeException) (Object) stackIn_77_0;
              stackOut_77_1 = (StringBuilder) (Object) stackIn_77_1;
              stackOut_77_2 = "null";
              stackIn_78_0 = stackOut_77_0;
              stackIn_78_1 = stackOut_77_1;
              stackIn_78_2 = stackOut_77_2;
              break L18;
            } else {
              stackOut_76_0 = (RuntimeException) (Object) stackIn_76_0;
              stackOut_76_1 = (StringBuilder) (Object) stackIn_76_1;
              stackOut_76_2 = "{...}";
              stackIn_78_0 = stackOut_76_0;
              stackIn_78_1 = stackOut_76_1;
              stackIn_78_2 = stackOut_76_2;
              break L18;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + ')');
        }
    }

    final void a(int param0, int param1, byte param2) {
        param0 = param0 << 6;
        param1 = param1 << 6;
        if (param2 != -21) {
            field_i = 102;
        }
        ((vb) this).field_g = param1;
        ((vb) this).field_f.a(128 + param1 * ot.field_v >> 8, param0);
    }

    vb(qia param0, vg param1) {
        try {
            ((vb) this).field_f = param0;
            ((vb) this).field_g = param0.l();
            ((vb) this).field_h = param1;
            ((vb) this).field_f.e(128 + ot.field_v * ((vb) this).field_g >> 8);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 2;
    }
}
