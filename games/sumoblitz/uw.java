/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uw {
    static String[] field_b;
    static wb field_a;
    static String[] field_c;

    final int b(int param0, long param1) {
        if (param0 != 4007) {
            field_c = (String[]) null;
        }
        long var4 = this.a((byte) -52);
        if ((var4 ^ -1L) < -1L) {
            tg.a(var4, (byte) 110);
        }
        return this.a(0, param1);
    }

    abstract void b(byte param0);

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        RuntimeException stackIn_77_0 = null;
        StringBuilder stackIn_77_1 = null;
        RuntimeException stackIn_78_0 = null;
        StringBuilder stackIn_78_1 = null;
        String stackIn_78_2 = null;
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
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param3) {
                break L1;
              } else {
                if (param2 < nk.field_c) {
                  L2: {
                    if ((param7 ^ -1) <= -1) {
                      break L2;
                    } else {
                      if (-1 >= (param5 ^ -1)) {
                        break L2;
                      } else {
                        if (param1 < 0) {
                          decompiledRegionSelector0 = 1;
                          break L0;
                        } else {
                          break L2;
                        }
                      }
                    }
                  }
                  L3: {
                    if (param7 < nk.field_i) {
                      break L3;
                    } else {
                      if (nk.field_i > param5) {
                        break L3;
                      } else {
                        if (nk.field_i > param1) {
                          break L3;
                        } else {
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param6 == 1955582416) {
                      break L4;
                    } else {
                      field_a = (wb) null;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = param3 - param2;
                    if (param8 == param2) {
                      L6: {
                        if (param2 == param3) {
                          var12 = 0;
                          var9_int = param7 << 210787856;
                          var10 = param5 << 1955582416;
                          var11 = 0;
                          break L6;
                        } else {
                          var15 = param3 + -param8;
                          if (param7 >= param5) {
                            var9_int = param5 << 1791554960;
                            var11 = (param1 - param5 << -1828057040) / var15;
                            var10 = param7 << 1294097136;
                            var12 = (param1 + -param7 << -151453840) / var14;
                            break L6;
                          } else {
                            var9_int = param7 << 1791519120;
                            var10 = param5 << -1481087792;
                            var11 = (param1 - param7 << 376192240) / var14;
                            var12 = (-param5 + param1 << -1538448272) / var15;
                            break L6;
                          }
                        }
                      }
                      var13 = 0;
                      if (0 <= param2) {
                        break L5;
                      } else {
                        param2 = Math.min(-param2, param8 - param2);
                        var9_int = var9_int + param2 * var11;
                        var10 = var10 + param2 * var12;
                        param2 = 0;
                        break L5;
                      }
                    } else {
                      L7: {
                        var10 = param7 << -520295248;
                        var9_int = param7 << -520295248;
                        var15 = param8 - param2;
                        var12 = (-param7 + param1 << -1716209648) / var14;
                        var11 = (-param7 + param5 << 42362672) / var15;
                        if (var11 < var12) {
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
                          if (param2 < 0) {
                            if ((param8 ^ -1) <= -1) {
                              param2 = -param2;
                              var10 = var10 + var12 * param2;
                              var9_int = var9_int + param2 * var11;
                              param2 = 0;
                              break L9;
                            } else {
                              param2 = param8 - param2;
                              var10 = var10 + param2 * var12;
                              var9_int = var9_int + param2 * var11;
                              param2 = param8;
                              break L8;
                            }
                          } else {
                            break L9;
                          }
                        }
                        var16 = nk.field_d[param2];
                        L10: while (true) {
                          if (param2 >= param8) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 476688272;
                              if (nk.field_i <= var17) {
                                break L11;
                              } else {
                                var18 = (var10 >> -170956752) - (var9_int >> 1829009776);
                                if (0 == var18) {
                                  if ((var17 ^ -1) > -1) {
                                    break L11;
                                  } else {
                                    if (nk.field_i > var17) {
                                      wm.a(-1, var17 - -var16, param4, var18, param0);
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                } else {
                                  L12: {
                                    if (var18 + var17 < nk.field_i) {
                                      break L12;
                                    } else {
                                      var18 = nk.field_i + -var17 - 1;
                                      break L12;
                                    }
                                  }
                                  if (0 > var17) {
                                    wm.a(-1, var16, param4, var18 - -var17, param0);
                                    break L11;
                                  } else {
                                    wm.a(-1, var17 - -var16, param4, var18, param0);
                                    break L11;
                                  }
                                }
                              }
                            }
                            param2++;
                            if (nk.field_c <= param2) {
                              decompiledRegionSelector0 = 3;
                              break L0;
                            } else {
                              var9_int = var9_int + var11;
                              var10 = var10 + var12;
                              var16 = var16 + lk.field_b;
                              continue L10;
                            }
                          }
                        }
                      }
                      var16 = -param8 + param3;
                      if (var16 != 0) {
                        L13: {
                          if (var13 == 0) {
                            var9_int = param5 << 1488190256;
                            break L13;
                          } else {
                            var10 = param5 << -973254384;
                            break L13;
                          }
                        }
                        var17 = param1 << -395036784;
                        var12 = (-var10 + var17) / var16;
                        var11 = (var17 - var9_int) / var16;
                        break L5;
                      } else {
                        var11 = 0;
                        var12 = 0;
                        break L5;
                      }
                    }
                  }
                  L14: {
                    if (0 > param2) {
                      param2 = -param2;
                      var10 = var10 + param2 * var12;
                      var9_int = var9_int + param2 * var11;
                      param2 = 0;
                      break L14;
                    } else {
                      break L14;
                    }
                  }
                  var15 = nk.field_d[param2];
                  L15: while (true) {
                    if (param3 <= param2) {
                      decompiledRegionSelector0 = 4;
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 2085428848;
                        if (var16 >= nk.field_i) {
                          break L16;
                        } else {
                          var17 = (var10 >> -60135696) - (var9_int >> 47860144);
                          if (var17 != 0) {
                            L17: {
                              if (nk.field_i > var17 + var16) {
                                break L17;
                              } else {
                                var17 = -1 + (nk.field_i - var16);
                                break L17;
                              }
                            }
                            if (0 <= var16) {
                              wm.a(param6 ^ -1955582417, var15 + var16, param4, var17, param0);
                              break L16;
                            } else {
                              wm.a(-1, var15, param4, var17 - -var16, param0);
                              break L16;
                            }
                          } else {
                            if (0 > var16) {
                              break L16;
                            } else {
                              if (nk.field_i <= var16) {
                                break L16;
                              } else {
                                wm.a(-1, var15 + var16, param4, var17, param0);
                                break L16;
                              }
                            }
                          }
                        }
                      }
                      param2++;
                      if (nk.field_c <= param2) {
                        decompiledRegionSelector0 = 5;
                        break L0;
                      } else {
                        var10 = var10 + var12;
                        var15 = var15 + lk.field_b;
                        var9_int = var9_int + var11;
                        continue L15;
                      }
                    }
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
          L18: {
            var9 = decompiledCaughtException;
            stackIn_77_0 = (RuntimeException) (var9);

            stackIn_77_1 = new StringBuilder().append("uw.D(");

            if (param0 == null) {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "null";
              break L18;
            } else {
              stackIn_78_0 = (RuntimeException) ((Object) stackIn_77_0);
              stackIn_78_1 = (StringBuilder) ((Object) stackIn_77_1);
              stackIn_78_2 = "{...}";
              break L18;
            }
          }
          throw qo.a((Throwable) ((Object) stackIn_78_0), stackIn_78_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ')');
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

    abstract int a(int param0, long param1);

    public static void c(byte param0) {
        if (param0 != 96) {
            field_b = (String[]) null;
        }
        field_c = null;
        field_a = null;
        field_b = null;
    }

    abstract long a(byte param0);

    static {
    }
}
