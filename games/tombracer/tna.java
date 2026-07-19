/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tna extends loa {
    static String field_d;
    static ph[] field_c;
    static vna field_e;
    static String field_b;
    static int field_f;

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
            return;
        }
        field_d = null;
        field_e = null;
        field_c = null;
    }

    final static void a(int param0, gqa param1) {
        int dupTemp$4 = 0;
        int dupTemp$5 = 0;
        int incrementValue$6 = 0;
        int fieldTemp$7 = 0;
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_20_0 = 0;
        int stackIn_28_0 = 0;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_27_0 = 0;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        RuntimeException stackOut_32_0 = null;
        StringBuilder stackOut_32_1 = null;
        String stackOut_32_2 = null;
        RuntimeException stackOut_31_0 = null;
        StringBuilder stackOut_31_1 = null;
        String stackOut_31_2 = null;
        var5 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if ((var2_int ^ -1) <= -4) {
                    break L3;
                  } else {
                    baa.field_b[var2_int] = 0;
                    var2_int++;
                    if (var5 != 0) {
                      break L2;
                    } else {
                      if (var5 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                var2_int = 0;
                break L2;
              }
              L4: while (true) {
                L5: {
                  L6: {
                    L7: {
                      if (var2_int >= ara.field_xb) {
                        break L7;
                      } else {
                        var7 = param1.field_d;
                        var6 = wea.field_d[var2_int].field_d;
                        if (var5 != 0) {
                          if (var6 == var7) {
                            break L5;
                          } else {
                            break L6;
                          }
                        } else {
                          L8: {
                            if (var6 == var7) {
                              dupTemp$4 = wea.field_d[var2_int].a(false);
                              baa.field_b[dupTemp$4] = baa.field_b[dupTemp$4] + 1;
                              break L8;
                            } else {
                              break L8;
                            }
                          }
                          var2_int++;
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L7;
                          }
                        }
                      }
                    }
                    if (param0 == 16599) {
                      break L5;
                    } else {
                      break L6;
                    }
                  }
                  field_b = (String) null;
                  break L5;
                }
                dupTemp$5 = param1.a(false);
                baa.field_b[dupTemp$5] = baa.field_b[dupTemp$5] + 1;
                var2_int = 0;
                var3 = 0;
                L9: while (true) {
                  L10: {
                    L11: {
                      if (var3 >= ara.field_xb) {
                        break L11;
                      } else {
                        stackOut_19_0 = param1.field_d;
                        stackIn_28_0 = stackOut_19_0;
                        stackIn_20_0 = stackOut_19_0;
                        if (var5 != 0) {
                          break L10;
                        } else {
                          L12: {
                            L13: {
                              if (stackIn_20_0 == wea.field_d[var3].field_d) {
                                var4 = wea.field_d[var3].a(false);
                                if (sd.field_K >= baa.field_b[var4]) {
                                  break L13;
                                } else {
                                  baa.field_b[var4] = baa.field_b[var4] - 1;
                                  if (var5 == 0) {
                                    break L12;
                                  } else {
                                    break L13;
                                  }
                                }
                              } else {
                                break L13;
                              }
                            }
                            incrementValue$6 = var2_int;
                            var2_int++;
                            wea.field_d[incrementValue$6] = wea.field_d[var3];
                            break L12;
                          }
                          var3++;
                          if (var5 == 0) {
                            continue L9;
                          } else {
                            break L11;
                          }
                        }
                      }
                    }
                    stackOut_27_0 = var2_int;
                    stackIn_28_0 = stackOut_27_0;
                    break L10;
                  }
                  ara.field_xb = stackIn_28_0;
                  fieldTemp$7 = ara.field_xb;
                  ara.field_xb = ara.field_xb + 1;
                  wea.field_d[fieldTemp$7] = param1;
                  break L0;
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L14: {
            var2 = decompiledCaughtException;
            stackOut_30_0 = (RuntimeException) (var2);
            stackOut_30_1 = new StringBuilder().append("tna.A(").append(param0).append(',');
            stackIn_32_0 = stackOut_30_0;
            stackIn_32_1 = stackOut_30_1;
            stackIn_31_0 = stackOut_30_0;
            stackIn_31_1 = stackOut_30_1;
            if (param1 == null) {
              stackOut_32_0 = (RuntimeException) ((Object) stackIn_32_0);
              stackOut_32_1 = (StringBuilder) ((Object) stackIn_32_1);
              stackOut_32_2 = "null";
              stackIn_33_0 = stackOut_32_0;
              stackIn_33_1 = stackOut_32_1;
              stackIn_33_2 = stackOut_32_2;
              break L14;
            } else {
              stackOut_31_0 = (RuntimeException) ((Object) stackIn_31_0);
              stackOut_31_1 = (StringBuilder) ((Object) stackIn_31_1);
              stackOut_31_2 = "{...}";
              stackIn_33_0 = stackOut_31_0;
              stackIn_33_1 = stackOut_31_1;
              stackIn_33_2 = stackOut_31_2;
              break L14;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
        }
    }

    tna(qea param0) {
        super(param0);
    }

    final void a(int param0, int param1, hj param2, int param3) {
        RuntimeException runtimeException = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        hj var8 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        var7 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 >= 73) {
                break L1;
              } else {
                var8 = (hj) null;
                this.a(-107, 127, (hj) null, -114);
                break L1;
              }
            }
            var5_int = 1;
            L2: while (true) {
              L3: {
                L4: {
                  if (param2.field_f + -1 <= var5_int) {
                    break L4;
                  } else {
                    if (var7 != 0) {
                      break L3;
                    } else {
                      var6 = 1;
                      L5: while (true) {
                        L6: {
                          L7: {
                            if (var6 >= param2.field_a - 1) {
                              break L7;
                            } else {
                              param2.a(var6, 0, 0, var5_int);
                              var6++;
                              if (var7 != 0) {
                                break L6;
                              } else {
                                if (var7 == 0) {
                                  continue L5;
                                } else {
                                  break L7;
                                }
                              }
                            }
                          }
                          var5_int++;
                          break L6;
                        }
                        if (var7 == 0) {
                          continue L2;
                        } else {
                          break L4;
                        }
                      }
                    }
                  }
                }
                this.a(0, param2.field_f, 0, param2, param2.field_a, 1);
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L8: {
            runtimeException = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) (runtimeException);
            stackOut_15_1 = new StringBuilder().append("tna.B(").append(param0).append(',').append(param1).append(',');
            stackIn_17_0 = stackOut_15_0;
            stackIn_17_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param2 == null) {
              stackOut_17_0 = (RuntimeException) ((Object) stackIn_17_0);
              stackOut_17_1 = (StringBuilder) ((Object) stackIn_17_1);
              stackOut_17_2 = "null";
              stackIn_18_0 = stackOut_17_0;
              stackIn_18_1 = stackOut_17_1;
              stackIn_18_2 = stackOut_17_2;
              break L8;
            } else {
              stackOut_16_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackOut_16_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackOut_16_2 = "{...}";
              stackIn_18_0 = stackOut_16_0;
              stackIn_18_1 = stackOut_16_1;
              stackIn_18_2 = stackOut_16_2;
              break L8;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_18_0), stackIn_18_2 + ',' + param3 + ')');
        }
    }

    private final void a(int param0, int param1, int param2, hj param3, int param4, int param5) {
        RuntimeException var7 = null;
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var10 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (-6 < (param1 ^ -1)) {
                break L1;
              } else {
                if (5 > param4) {
                  break L1;
                } else {
                  var7_int = (this.field_a.a(param1 / 2 + -1, 0) + param5) * 2 + param2;
                  var8 = param0 - (-(2 * this.field_a.a(-1 + param4 / 2, 0)) + -2);
                  var9 = param2 - -1;
                  L2: while (true) {
                    L3: {
                      L4: {
                        if (var9 >= param1 + param2 + -1) {
                          break L4;
                        } else {
                          param3.a(var8, 1, param5 ^ 1, var9);
                          var9++;
                          if (var10 != 0) {
                            break L3;
                          } else {
                            if (var10 == 0) {
                              continue L2;
                            } else {
                              break L4;
                            }
                          }
                        }
                      }
                      var9 = param0 - -1;
                      break L3;
                    }
                    L5: while (true) {
                      L6: {
                        L7: {
                          if (-1 + param4 + param0 <= var9) {
                            break L7;
                          } else {
                            param3.a(var9, 1, param5 ^ 1, var7_int);
                            var9++;
                            if (var10 != 0) {
                              break L6;
                            } else {
                              if (var10 == 0) {
                                continue L5;
                              } else {
                                break L7;
                              }
                            }
                          }
                        }
                        var9 = this.field_a.a(4, param5 ^ 1);
                        break L6;
                      }
                      L8: {
                        if (var9 == 0) {
                          break L8;
                        } else {
                          param3.a(param0 + 2 * (this.field_a.a(var8 + -param0, 0) / 2) - -1, 0, 0, var7_int);
                          break L8;
                        }
                      }
                      L9: {
                        if (1 == var9) {
                          break L9;
                        } else {
                          param3.a(var8, 0, 0, param2 + (this.field_a.a(-param2 + var7_int, param5 ^ 1) / 2 * 2 + 1));
                          break L9;
                        }
                      }
                      L10: {
                        if (2 != var9) {
                          param3.a(2 * (this.field_a.a(-1 + (param0 - -param4 + -var8), 0) / 2) + var8 + 1, 0, 0, var7_int);
                          break L10;
                        } else {
                          break L10;
                        }
                      }
                      L11: {
                        if (-4 != (var9 ^ -1)) {
                          param3.a(var8, 0, 0, 1 + this.field_a.a(-1 + param2 + (param1 - var7_int), 0) / 2 * 2 + var7_int);
                          break L11;
                        } else {
                          break L11;
                        }
                      }
                      this.a(param0, -param2 + (var7_int + 1), param2, param3, var8 + 1 + -param0, 1);
                      this.a(param0, param2 - -param1 + -var7_int, var7_int, param3, var8 + (1 + -param0), 1);
                      this.a(var8, -param2 + (var7_int + 1), param2, param3, param0 + (param4 - var8), param5 + 0);
                      this.a(var8, param2 - (-param1 + var7_int), var7_int, param3, -var8 + (param0 - -param4), param5 ^ 0);
                      decompiledRegionSelector0 = 1;
                      break L0;
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
          L12: {
            var7 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) (var7);
            stackOut_28_1 = new StringBuilder().append("tna.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param3 == null) {
              stackOut_30_0 = (RuntimeException) ((Object) stackIn_30_0);
              stackOut_30_1 = (StringBuilder) ((Object) stackIn_30_1);
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L12;
            } else {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L12;
            }
          }
          throw tba.a((Throwable) ((Object) stackIn_31_0), stackIn_31_2 + ',' + param4 + ',' + param5 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static {
        field_d = "You have completed the free content of Tomb Racer, to play a further 5 worlds become a member at FunOrb.com.";
        field_e = new vna();
        field_b = "Connecting to<br>friend server...";
    }
}
