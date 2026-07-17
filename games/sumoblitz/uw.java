/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class uw {
    static String[] field_b;
    static wb field_a;
    static String[] field_c;

    final int b(int param0, long param1) {
        if (param0 != 4007) {
            field_c = null;
        }
        long var4 = ((uw) this).a((byte) -52);
        if (var4 > 0L) {
            tg.a(var4, (byte) 110);
        }
        return ((uw) this).a(0, param1);
    }

    abstract void b(byte param0);

    final static void a(int[] param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
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
        var19 = Sumoblitz.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              if (0 > param3) {
                break L1;
              } else {
                if (~param2 > ~nk.field_c) {
                  L2: {
                    if (param7 >= 0) {
                      break L2;
                    } else {
                      if (param5 >= 0) {
                        break L2;
                      } else {
                        if (param1 < 0) {
                          return;
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
                      if (~nk.field_i < ~param5) {
                        break L3;
                      } else {
                        if (nk.field_i > param1) {
                          break L3;
                        } else {
                          return;
                        }
                      }
                    }
                  }
                  L4: {
                    if (param6 == 1955582416) {
                      break L4;
                    } else {
                      field_a = null;
                      break L4;
                    }
                  }
                  L5: {
                    var14 = param3 - param2;
                    if (~param8 == ~param2) {
                      L6: {
                        if (~param2 == ~param3) {
                          var12 = 0;
                          var9_int = param7 << 16;
                          var10 = param5 << 16;
                          var11 = 0;
                          break L6;
                        } else {
                          var15 = param3 + -param8;
                          if (param7 >= param5) {
                            var9_int = param5 << 16;
                            var11 = (param1 - param5 << 16) / var15;
                            var10 = param7 << 16;
                            var12 = (param1 + -param7 << 16) / var14;
                            break L6;
                          } else {
                            var9_int = param7 << 16;
                            var10 = param5 << 16;
                            var11 = (param1 - param7 << 16) / var14;
                            var12 = (-param5 + param1 << 16) / var15;
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
                        var10 = param7 << 16;
                        var9_int = param7 << 16;
                        var15 = param8 - param2;
                        var12 = (-param7 + param1 << 16) / var14;
                        var11 = (-param7 + param5 << 16) / var15;
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
                            if (param8 >= 0) {
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
                          if (~param2 <= ~param8) {
                            break L8;
                          } else {
                            L11: {
                              var17 = var9_int >> 16;
                              if (nk.field_i <= var17) {
                                break L11;
                              } else {
                                var18 = (var10 >> 16) - (var9_int >> 16);
                                if (0 == var18) {
                                  if (var17 < 0) {
                                    break L11;
                                  } else {
                                    if (~nk.field_i < ~var17) {
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
                              return;
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
                            var9_int = param5 << 16;
                            break L13;
                          } else {
                            var10 = param5 << 16;
                            break L13;
                          }
                        }
                        var17 = param1 << 16;
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
                    if (~param3 >= ~param2) {
                      break L0;
                    } else {
                      L16: {
                        var16 = var9_int >> 16;
                        if (~var16 <= ~nk.field_i) {
                          break L16;
                        } else {
                          var17 = (var10 >> 16) - (var9_int >> 16);
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
                        return;
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
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L18: {
            var9 = decompiledCaughtException;
            stackOut_75_0 = (RuntimeException) var9;
            stackOut_75_1 = new StringBuilder().append("uw.D(");
            stackIn_77_0 = stackOut_75_0;
            stackIn_77_1 = stackOut_75_1;
            stackIn_76_0 = stackOut_75_0;
            stackIn_76_1 = stackOut_75_1;
            if (param0 == null) {
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
          throw qo.a((Throwable) (Object) stackIn_78_0, stackIn_78_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 44 + param7 + 44 + param8 + 41);
        }
    }

    abstract int a(int param0, long param1);

    public static void c(byte param0) {
        field_c = null;
        field_a = null;
        field_b = null;
    }

    abstract long a(byte param0);

    static {
    }
}
