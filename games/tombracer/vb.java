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
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_56_0 = 0;
        int stackIn_56_1 = 0;
        RuntimeException stackIn_86_0 = null;
        StringBuilder stackIn_86_1 = null;
        RuntimeException stackIn_87_0 = null;
        StringBuilder stackIn_87_1 = null;
        RuntimeException stackIn_88_0 = null;
        StringBuilder stackIn_88_1 = null;
        String stackIn_88_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_55_0 = 0;
        int stackOut_55_1 = 0;
        RuntimeException stackOut_85_0 = null;
        StringBuilder stackOut_85_1 = null;
        RuntimeException stackOut_87_0 = null;
        StringBuilder stackOut_87_1 = null;
        String stackOut_87_2 = null;
        RuntimeException stackOut_86_0 = null;
        StringBuilder stackOut_86_1 = null;
        String stackOut_86_2 = null;
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
                      if ((param1 ^ -1) <= -1) {
                        break L2;
                      } else {
                        if ((param4 ^ -1) > -1) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if ((uoa.field_e ^ -1) < (param5 ^ -1)) {
                      break L3;
                    } else {
                      if (uoa.field_e > param1) {
                        break L3;
                      } else {
                        if ((param4 ^ -1) <= (uoa.field_e ^ -1)) {
                          decompiledRegionSelector0 = 2;
                          break L0;
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
                    L6: {
                      var14 = param7 - param3;
                      if (param3 != param6) {
                        break L6;
                      } else {
                        L7: {
                          L8: {
                            if ((param7 ^ -1) == (param3 ^ -1)) {
                              break L8;
                            } else {
                              L9: {
                                L10: {
                                  var15 = param7 + -param6;
                                  if (param1 <= param5) {
                                    break L10;
                                  } else {
                                    var11 = (-param5 + param4 << -1273376176) / var14;
                                    var12 = (-param1 + param4 << -383989488) / var15;
                                    var9_int = param5 << -681285424;
                                    var10 = param1 << -1850749680;
                                    if (var19 == 0) {
                                      break L9;
                                    } else {
                                      break L10;
                                    }
                                  }
                                }
                                var11 = (param4 - param1 << 286772368) / var15;
                                var12 = (-param5 + param4 << -922437200) / var14;
                                var9_int = param1 << -958730128;
                                var10 = param5 << 1634223536;
                                break L9;
                              }
                              if (var19 == 0) {
                                break L7;
                              } else {
                                break L8;
                              }
                            }
                          }
                          var11 = 0;
                          var12 = 0;
                          var9_int = param5 << 668297648;
                          var10 = param1 << -1421477072;
                          break L7;
                        }
                        L11: {
                          if (-1 >= (param3 ^ -1)) {
                            break L11;
                          } else {
                            param3 = Math.min(-param3, param6 + -param3);
                            var9_int = var9_int + param3 * var11;
                            var10 = var10 + param3 * var12;
                            param3 = 0;
                            break L11;
                          }
                        }
                        var13 = 0;
                        if (var19 == 0) {
                          break L5;
                        } else {
                          break L6;
                        }
                      }
                    }
                    L12: {
                      L13: {
                        var10 = param5 << -196705808;
                        var9_int = param5 << -196705808;
                        var15 = param6 + -param3;
                        var11 = (param1 - param5 << 817570224) / var15;
                        var12 = (param4 + -param5 << -790418512) / var14;
                        if ((var11 ^ -1) > (var12 ^ -1)) {
                          break L13;
                        } else {
                          var16 = var11;
                          var11 = var12;
                          var12 = var16;
                          var13 = 1;
                          if (var19 == 0) {
                            break L12;
                          } else {
                            break L13;
                          }
                        }
                      }
                      var13 = 0;
                      break L12;
                    }
                    L14: {
                      L15: {
                        L16: {
                          if (param3 < 0) {
                            L17: {
                              if ((param6 ^ -1) <= -1) {
                                break L17;
                              } else {
                                param3 = param6 + -param3;
                                var10 = var10 + var12 * param3;
                                var9_int = var9_int + param3 * var11;
                                param3 = param6;
                                if (var19 == 0) {
                                  break L15;
                                } else {
                                  break L17;
                                }
                              }
                            }
                            param3 = -param3;
                            var10 = var10 + var12 * param3;
                            var9_int = var9_int + var11 * param3;
                            param3 = 0;
                            break L16;
                          } else {
                            break L16;
                          }
                        }
                        var16 = uoa.field_d[param3];
                        L18: while (true) {
                          if (param6 <= param3) {
                            break L15;
                          } else {
                            var17 = var9_int >> -1432215504;
                            stackOut_36_0 = uoa.field_e ^ -1;
                            stackOut_36_1 = var17 ^ -1;
                            stackIn_56_0 = stackOut_36_0;
                            stackIn_56_1 = stackOut_36_1;
                            stackIn_37_0 = stackOut_36_0;
                            stackIn_37_1 = stackOut_36_1;
                            if (var19 != 0) {
                              break L14;
                            } else {
                              L19: {
                                if (stackIn_37_0 < stackIn_37_1) {
                                  L20: {
                                    var18 = -(var9_int >> -1015013456) + (var10 >> -1843848112);
                                    if (0 == var18) {
                                      break L20;
                                    } else {
                                      L21: {
                                        if ((uoa.field_e ^ -1) < (var17 - -var18 ^ -1)) {
                                          break L21;
                                        } else {
                                          var18 = -var17 + (uoa.field_e + -1);
                                          break L21;
                                        }
                                      }
                                      L22: {
                                        if (-1 >= (var17 ^ -1)) {
                                          break L22;
                                        } else {
                                          tl.a(var16, var18 + var17, param2, 1535993377, param8);
                                          if (var19 == 0) {
                                            break L19;
                                          } else {
                                            break L22;
                                          }
                                        }
                                      }
                                      tl.a(var16 + var17, var18, param2, 1535993377, param8);
                                      if (var19 == 0) {
                                        break L19;
                                      } else {
                                        break L20;
                                      }
                                    }
                                  }
                                  if (-1 < (var17 ^ -1)) {
                                    break L19;
                                  } else {
                                    if (var17 < uoa.field_e) {
                                      tl.a(var16 + var17, var18, param2, 1535993377, param8);
                                      break L19;
                                    } else {
                                      break L19;
                                    }
                                  }
                                } else {
                                  break L19;
                                }
                              }
                              param3++;
                              if ((param3 ^ -1) <= (uoa.field_b ^ -1)) {
                                decompiledRegionSelector0 = 3;
                                break L0;
                              } else {
                                var9_int = var9_int + var11;
                                var10 = var10 + var12;
                                var16 = var16 + bea.field_g;
                                if (var19 == 0) {
                                  continue L18;
                                } else {
                                  break L15;
                                }
                              }
                            }
                          }
                        }
                      }
                      var16 = -param6 + param7;
                      stackOut_55_0 = 0;
                      stackOut_55_1 = var16;
                      stackIn_56_0 = stackOut_55_0;
                      stackIn_56_1 = stackOut_55_1;
                      break L14;
                    }
                    L23: {
                      if (stackIn_56_0 == stackIn_56_1) {
                        break L23;
                      } else {
                        L24: {
                          L25: {
                            if (var13 != 0) {
                              break L25;
                            } else {
                              var9_int = param1 << 1223450128;
                              if (var19 == 0) {
                                break L24;
                              } else {
                                break L25;
                              }
                            }
                          }
                          var10 = param1 << -1321228528;
                          break L24;
                        }
                        var17 = param4 << 25206640;
                        var11 = (-var9_int + var17) / var16;
                        var12 = (-var10 + var17) / var16;
                        if (var19 == 0) {
                          break L5;
                        } else {
                          break L23;
                        }
                      }
                    }
                    var11 = 0;
                    var12 = 0;
                    break L5;
                  }
                  L26: {
                    if ((param3 ^ -1) <= -1) {
                      break L26;
                    } else {
                      param3 = -param3;
                      var9_int = var9_int + param3 * var11;
                      var10 = var10 + param3 * var12;
                      param3 = 0;
                      break L26;
                    }
                  }
                  var15 = uoa.field_d[param3];
                  L27: while (true) {
                    L28: {
                      L29: {
                        if (param7 <= param3) {
                          break L29;
                        } else {
                          var16 = var9_int >> 690310000;
                          if (var19 != 0) {
                            break L28;
                          } else {
                            L30: {
                              if ((uoa.field_e ^ -1) >= (var16 ^ -1)) {
                                break L30;
                              } else {
                                L31: {
                                  var17 = (var10 >> 1602494576) + -(var9_int >> 1313026800);
                                  if (var17 == 0) {
                                    break L31;
                                  } else {
                                    L32: {
                                      if ((uoa.field_e ^ -1) >= (var16 + var17 ^ -1)) {
                                        var17 = -1 + (-var16 + uoa.field_e);
                                        break L32;
                                      } else {
                                        break L32;
                                      }
                                    }
                                    L33: {
                                      if (var16 < 0) {
                                        break L33;
                                      } else {
                                        tl.a(var15 + var16, var17, param2, 1535993377, param8);
                                        if (var19 == 0) {
                                          break L30;
                                        } else {
                                          break L33;
                                        }
                                      }
                                    }
                                    tl.a(var15, var17 + var16, param2, 1535993377, param8);
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
                                  if ((var16 ^ -1) <= (uoa.field_e ^ -1)) {
                                    break L30;
                                  } else {
                                    tl.a(var15 + var16, var17, param2, 1535993377, param8);
                                    break L30;
                                  }
                                }
                              }
                            }
                            param3++;
                            if ((uoa.field_b ^ -1) >= (param3 ^ -1)) {
                              decompiledRegionSelector0 = 5;
                              break L0;
                            } else {
                              var10 = var10 + var12;
                              var9_int = var9_int + var11;
                              var15 = var15 + bea.field_g;
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
                } else {
                  break L1;
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
            stackOut_85_0 = (RuntimeException) (var9);
            stackOut_85_1 = new StringBuilder().append("vb.A(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
            stackIn_87_0 = stackOut_85_0;
            stackIn_87_1 = stackOut_85_1;
            stackIn_86_0 = stackOut_85_0;
            stackIn_86_1 = stackOut_85_1;
            if (param8 == null) {
              stackOut_87_0 = (RuntimeException) ((Object) stackIn_87_0);
              stackOut_87_1 = (StringBuilder) ((Object) stackIn_87_1);
              stackOut_87_2 = "null";
              stackIn_88_0 = stackOut_87_0;
              stackIn_88_1 = stackOut_87_1;
              stackIn_88_2 = stackOut_87_2;
              break L34;
            } else {
              stackOut_86_0 = (RuntimeException) ((Object) stackIn_86_0);
              stackOut_86_1 = (StringBuilder) ((Object) stackIn_86_1);
              stackOut_86_2 = "{...}";
              stackIn_88_0 = stackOut_86_0;
              stackIn_88_1 = stackOut_86_1;
              stackIn_88_2 = stackOut_86_2;
              break L34;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_88_0), stackIn_88_2 + ')');
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

    final void a(int param0, int param1, byte param2) {
        param0 = param0 << 6;
        param1 = param1 << 6;
        if (param2 != -21) {
            field_i = 102;
        }
        this.field_g = param1;
        this.field_f.a(128 + param1 * ot.field_v >> 104662632, param0);
    }

    vb(qia param0, vg param1) {
        try {
            this.field_f = param0;
            this.field_g = param0.l();
            this.field_h = param1;
            this.field_f.e(128 + ot.field_v * this.field_g >> 1339526184);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "vb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_i = 2;
    }
}
