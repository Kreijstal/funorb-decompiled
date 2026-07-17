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
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        RuntimeException stackIn_79_0 = null;
        StringBuilder stackIn_79_1 = null;
        RuntimeException stackIn_80_0 = null;
        StringBuilder stackIn_80_1 = null;
        String stackIn_80_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_77_0 = null;
        StringBuilder stackOut_77_1 = null;
        RuntimeException stackOut_79_0 = null;
        StringBuilder stackOut_79_1 = null;
        String stackOut_79_2 = null;
        RuntimeException stackOut_78_0 = null;
        StringBuilder stackOut_78_1 = null;
        String stackOut_78_2 = null;
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
                    if (param0 == -922437200) {
                      break L4;
                    } else {
                      field_i = -119;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = param7 - param3;
                    if (param3 != param6) {
                      L6: {
                        var10 = param5 << 16;
                        var9_int = param5 << 16;
                        var15 = param6 + -param3;
                        var11 = (param1 - param5 << 16) / var15;
                        var12 = (param4 + -param5 << 16) / var14;
                        if (var11 < var12) {
                          var13 = 0;
                          break L6;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          break L6;
                        }
                      }
                      L7: {
                        L8: {
                          if (param3 < 0) {
                            if (param6 >= 0) {
                              param3 = -param3;
                              var10 = var10 + var12 * param3;
                              var9_int = var9_int + var11 * param3;
                              param3 = 0;
                              break L8;
                            } else {
                              param3 = param6 + -param3;
                              var10 = var10 + var12 * param3;
                              var9_int = var9_int + param3 * var11;
                              param3 = param6;
                              break L7;
                            }
                          } else {
                            break L8;
                          }
                        }
                        var16 = uoa.field_d[param3];
                        L9: while (true) {
                          if (param6 <= param3) {
                            break L7;
                          } else {
                            L10: {
                              var17 = var9_int >> 16;
                              if (uoa.field_e > var17) {
                                var18 = -(var9_int >> 16) + (var10 >> 16);
                                if (0 == var18) {
                                  if (var17 < 0) {
                                    break L10;
                                  } else {
                                    if (var17 < uoa.field_e) {
                                      tl.a(var16 + var17, var18, param2, 1535993377, param8);
                                      break L10;
                                    } else {
                                      break L10;
                                    }
                                  }
                                } else {
                                  L11: {
                                    if (uoa.field_e > var17 - -var18) {
                                      break L11;
                                    } else {
                                      var18 = -var17 + (uoa.field_e + -1);
                                      break L11;
                                    }
                                  }
                                  if (var17 >= 0) {
                                    tl.a(var16 + var17, var18, param2, 1535993377, param8);
                                    break L10;
                                  } else {
                                    tl.a(var16, var18 + var17, param2, 1535993377, param8);
                                    break L10;
                                  }
                                }
                              } else {
                                break L10;
                              }
                            }
                            param3++;
                            if (param3 >= uoa.field_b) {
                              return;
                            } else {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + bea.field_g;
                              continue L9;
                            }
                          }
                        }
                      }
                      var16 = -param6 + param7;
                      if (0 == var16) {
                        var11 = 0;
                        var12 = 0;
                        break L5;
                      } else {
                        L12: {
                          if (var13 != 0) {
                            var10 = param1 << 16;
                            break L12;
                          } else {
                            var9_int = param1 << 16;
                            break L12;
                          }
                        }
                        var17 = param4 << 16;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        break L5;
                      }
                    } else {
                      L13: {
                        if (param7 == param3) {
                          var11 = 0;
                          var12 = 0;
                          var9_int = param5 << 16;
                          var10 = param1 << 16;
                          break L13;
                        } else {
                          var15 = param7 + -param6;
                          if (param1 <= param5) {
                            var11 = (param4 - param1 << 16) / var15;
                            var12 = (-param5 + param4 << 16) / var14;
                            var9_int = param1 << 16;
                            var10 = param5 << 16;
                            break L13;
                          } else {
                            var11 = (-param5 + param4 << 16) / var14;
                            var12 = (-param1 + param4 << 16) / var15;
                            var9_int = param5 << 16;
                            var10 = param1 << 16;
                            break L13;
                          }
                        }
                      }
                      L14: {
                        if (param3 >= 0) {
                          break L14;
                        } else {
                          param3 = Math.min(-param3, param6 + -param3);
                          var9_int = var9_int + param3 * var11;
                          var10 = var10 + param3 * var12;
                          param3 = 0;
                          break L14;
                        }
                      }
                      var13 = 0;
                      break L5;
                    }
                  }
                  L15: {
                    if (param3 >= 0) {
                      break L15;
                    } else {
                      param3 = -param3;
                      var9_int = var9_int + param3 * var11;
                      var10 = var10 + param3 * var12;
                      param3 = 0;
                      break L15;
                    }
                  }
                  var15 = uoa.field_d[param3];
                  L16: while (true) {
                    if (param7 <= param3) {
                      break L0;
                    } else {
                      L17: {
                        var16 = var9_int >> 16;
                        if (uoa.field_e <= var16) {
                          break L17;
                        } else {
                          var17 = (var10 >> 16) + -(var9_int >> 16);
                          if (var17 == 0) {
                            if (var16 < 0) {
                              break L17;
                            } else {
                              if (var16 >= uoa.field_e) {
                                break L17;
                              } else {
                                tl.a(var15 + var16, var17, param2, 1535993377, param8);
                                break L17;
                              }
                            }
                          } else {
                            L18: {
                              if (uoa.field_e <= var16 + var17) {
                                var17 = -1 + (-var16 + uoa.field_e);
                                break L18;
                              } else {
                                break L18;
                              }
                            }
                            if (var16 < 0) {
                              tl.a(var15, var17 + var16, param2, 1535993377, param8);
                              break L17;
                            } else {
                              tl.a(var15 + var16, var17, param2, 1535993377, param8);
                              break L17;
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
                        continue L16;
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
          L19: {
            var9 = decompiledCaughtException;
            stackOut_77_0 = (RuntimeException) var9;
            stackOut_77_1 = new StringBuilder().append("vb.A(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44).append(param6).append(44).append(param7).append(44);
            stackIn_79_0 = stackOut_77_0;
            stackIn_79_1 = stackOut_77_1;
            stackIn_78_0 = stackOut_77_0;
            stackIn_78_1 = stackOut_77_1;
            if (param8 == null) {
              stackOut_79_0 = (RuntimeException) (Object) stackIn_79_0;
              stackOut_79_1 = (StringBuilder) (Object) stackIn_79_1;
              stackOut_79_2 = "null";
              stackIn_80_0 = stackOut_79_0;
              stackIn_80_1 = stackOut_79_1;
              stackIn_80_2 = stackOut_79_2;
              break L19;
            } else {
              stackOut_78_0 = (RuntimeException) (Object) stackIn_78_0;
              stackOut_78_1 = (StringBuilder) (Object) stackIn_78_1;
              stackOut_78_2 = "{...}";
              stackIn_80_0 = stackOut_78_0;
              stackIn_80_1 = stackOut_78_1;
              stackIn_80_2 = stackOut_78_2;
              break L19;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_80_0, stackIn_80_2 + 41);
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
            throw tba.a((Throwable) (Object) runtimeException, "vb.<init>(" + (param0 != null ? "{...}" : "null") + 44 + (param1 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = 2;
    }
}
