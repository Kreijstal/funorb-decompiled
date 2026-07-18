/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ei {
    static int[] field_g;
    static String field_b;
    static int[] field_d;
    static int field_e;
    static String[][] field_f;
    static java.applet.Applet field_c;
    static bi field_a;

    final static void a(int param0, fb param1) {
        RuntimeException runtimeException = null;
        fb var2 = null;
        int var3 = 0;
        boolean stackIn_4_0 = false;
        int stackIn_14_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_3_0 = false;
        int stackOut_12_0 = 0;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_19_0 = null;
        StringBuilder stackOut_19_1 = null;
        String stackOut_19_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        var3 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            param1.b((byte) -86);
            var2 = (fb) (Object) kj.field_a.d(param0);
            L1: while (true) {
              L2: {
                L3: {
                  L4: {
                    if (null == var2) {
                      break L4;
                    } else {
                      stackOut_3_0 = var2.a(param1, -1);
                      stackIn_14_0 = stackOut_3_0 ? 1 : 0;
                      stackIn_4_0 = stackOut_3_0;
                      if (var3 != 0) {
                        break L3;
                      } else {
                        if (!stackIn_4_0) {
                          break L4;
                        } else {
                          var2 = (fb) (Object) kj.field_a.a((byte) -71);
                          if (var3 == 0) {
                            continue L1;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  L5: {
                    if (var2 != null) {
                      break L5;
                    } else {
                      kj.field_a.a((byte) -113, (oh) (Object) param1);
                      if (var3 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  stackOut_12_0 = -123;
                  stackIn_14_0 = stackOut_12_0;
                  break L3;
                }
                wp.a((byte) stackIn_14_0, (oh) (Object) param1, (oh) (Object) var2);
                break L2;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            runtimeException = decompiledCaughtException;
            stackOut_16_0 = (RuntimeException) runtimeException;
            stackOut_16_1 = new StringBuilder().append("ei.C(").append(param0).append(',');
            stackIn_19_0 = stackOut_16_0;
            stackIn_19_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param1 == null) {
              stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
              stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
              stackOut_19_2 = "null";
              stackIn_20_0 = stackOut_19_0;
              stackIn_20_1 = stackOut_19_1;
              stackIn_20_2 = stackOut_19_2;
              break L6;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_20_0 = stackOut_17_0;
              stackIn_20_1 = stackOut_17_1;
              stackIn_20_2 = stackOut_17_2;
              break L6;
            }
          }
          throw r.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + ')');
        }
    }

    final static void a(byte param0, nf param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_11_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_34_0 = 0;
        RuntimeException stackIn_37_0 = null;
        StringBuilder stackIn_37_1 = null;
        RuntimeException stackIn_39_0 = null;
        StringBuilder stackIn_39_1 = null;
        RuntimeException stackIn_40_0 = null;
        StringBuilder stackIn_40_1 = null;
        String stackIn_40_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_10_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_33_0 = 0;
        RuntimeException stackOut_36_0 = null;
        StringBuilder stackOut_36_1 = null;
        RuntimeException stackOut_39_0 = null;
        StringBuilder stackOut_39_1 = null;
        String stackOut_39_2 = null;
        RuntimeException stackOut_37_0 = null;
        StringBuilder stackOut_37_1 = null;
        String stackOut_37_2 = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            var2_int = 0;
            if (param0 >= 35) {
              L1: while (true) {
                L2: {
                  L3: {
                    if (var2_int >= 3) {
                      break L3;
                    } else {
                      im.field_b[var2_int] = 0;
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
                      if (~var2_int <= ~da.field_g) {
                        break L6;
                      } else {
                        stackOut_10_0 = wm.field_d[var2_int].field_n;
                        stackIn_20_0 = stackOut_10_0;
                        stackIn_11_0 = stackOut_10_0;
                        if (var5 != 0) {
                          break L5;
                        } else {
                          stackOut_11_0 = stackIn_11_0;
                          stackIn_13_0 = stackOut_11_0;
                          L7: {
                            if (stackIn_13_0 != param1.field_n) {
                              break L7;
                            } else {
                              int dupTemp$4 = wm.field_d[var2_int].a((byte) 115);
                              im.field_b[dupTemp$4] = im.field_b[dupTemp$4] + 1;
                              break L7;
                            }
                          }
                          var2_int++;
                          if (var5 == 0) {
                            continue L4;
                          } else {
                            break L6;
                          }
                        }
                      }
                    }
                    int dupTemp$5 = param1.a((byte) 113);
                    im.field_b[dupTemp$5] = im.field_b[dupTemp$5] + 1;
                    var2_int = 0;
                    stackOut_19_0 = 0;
                    stackIn_20_0 = stackOut_19_0;
                    break L5;
                  }
                  var3 = stackIn_20_0;
                  L8: while (true) {
                    L9: {
                      L10: {
                        if (var3 >= da.field_g) {
                          break L10;
                        } else {
                          stackOut_22_0 = ~wm.field_d[var3].field_n;
                          stackIn_34_0 = stackOut_22_0;
                          stackIn_23_0 = stackOut_22_0;
                          if (var5 != 0) {
                            break L9;
                          } else {
                            L11: {
                              L12: {
                                if (stackIn_23_0 != ~param1.field_n) {
                                  break L12;
                                } else {
                                  var4 = wm.field_d[var3].a((byte) 115);
                                  if (~kp.field_i > ~im.field_b[var4]) {
                                    im.field_b[var4] = im.field_b[var4] - 1;
                                    if (var5 == 0) {
                                      break L11;
                                    } else {
                                      break L12;
                                    }
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              int incrementValue$6 = var2_int;
                              var2_int++;
                              wm.field_d[incrementValue$6] = wm.field_d[var3];
                              break L11;
                            }
                            var3++;
                            if (var5 == 0) {
                              continue L8;
                            } else {
                              break L10;
                            }
                          }
                        }
                      }
                      stackOut_33_0 = var2_int;
                      stackIn_34_0 = stackOut_33_0;
                      break L9;
                    }
                    da.field_g = stackIn_34_0;
                    int fieldTemp$7 = da.field_g;
                    da.field_g = da.field_g + 1;
                    wm.field_d[fieldTemp$7] = param1;
                    break L0;
                  }
                }
              }
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L13: {
            var2 = decompiledCaughtException;
            stackOut_36_0 = (RuntimeException) var2;
            stackOut_36_1 = new StringBuilder().append("ei.B(").append(param0).append(',');
            stackIn_39_0 = stackOut_36_0;
            stackIn_39_1 = stackOut_36_1;
            stackIn_37_0 = stackOut_36_0;
            stackIn_37_1 = stackOut_36_1;
            if (param1 == null) {
              stackOut_39_0 = (RuntimeException) (Object) stackIn_39_0;
              stackOut_39_1 = (StringBuilder) (Object) stackIn_39_1;
              stackOut_39_2 = "null";
              stackIn_40_0 = stackOut_39_0;
              stackIn_40_1 = stackOut_39_1;
              stackIn_40_2 = stackOut_39_2;
              break L13;
            } else {
              stackOut_37_0 = (RuntimeException) (Object) stackIn_37_0;
              stackOut_37_1 = (StringBuilder) (Object) stackIn_37_1;
              stackOut_37_2 = "{...}";
              stackIn_40_0 = stackOut_37_0;
              stackIn_40_1 = stackOut_37_1;
              stackIn_40_2 = stackOut_37_2;
              break L13;
            }
          }
          throw r.a((Throwable) (Object) stackIn_40_0, stackIn_40_2 + ')');
        }
    }

    final static void a(int param0, int param1, byte[] param2, boolean param3, boolean param4, int param5) {
        RuntimeException runtimeException = null;
        sl var6 = null;
        int var7 = 0;
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        try {
          L0: {
            L1: {
              var6 = js.field_f;
              var6.h(param0, 255);
              var6.field_j = var6.field_j + 1;
              var7 = var6.field_j;
              var6.c(4, (byte) -106);
              if (!param4) {
                break L1;
              } else {
                ei.a(-47, (fb) null);
                break L1;
              }
            }
            L2: {
              var6.c(param1, (byte) -122);
              var8 = param5;
              if (param3) {
                var8 += 128;
                break L2;
              } else {
                break L2;
              }
            }
            var6.c(var8, (byte) -56);
            var6.a(0, param2.length, param2, 22186);
            var6.b(-var7 + var6.field_j, (byte) 127);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            runtimeException = decompiledCaughtException;
            stackOut_9_0 = (RuntimeException) runtimeException;
            stackOut_9_1 = new StringBuilder().append("ei.D(").append(param0).append(',').append(param1).append(',');
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          throw r.a((Throwable) (Object) stackIn_13_0, stackIn_13_2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(boolean param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        RuntimeException var7 = null;
        int[] var7_array = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        RuntimeException decompiledCaughtException = null;
        var12 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param2 <= 20) {
                break L1;
              } else {
                if (param1 <= 20) {
                  break L1;
                } else {
                  var7_array = new int[4];
                  gf.a(var7_array);
                  gf.a(param5, param4, param2, param1, 10, 0, 200);
                  am.a(-10 + param2, param6, param3 ^ 12362, -10 + param1, param5, param4);
                  gf.f(param5 + 10, param4, param2 + -20, 2052949);
                  gf.f(10 + param5, param4 - -param1, param2 + -20, 0);
                  gf.i(param5, param4, param5 - -10, 10 + param4);
                  gf.b(param5 - -10, 10 + param4, 10, 2052949);
                  gf.b(var7_array);
                  gf.i(-10 + param2 + param5, param4, param5 - -param2, param4 + 10);
                  gf.b(-11 + (param5 + param2), 10 + param4, 10, 2052949);
                  gf.b(var7_array);
                  if (param3 == -12394) {
                    gf.i(param5, param4 + (param1 - 10), 10 + param5, param4 + param1);
                    gf.b(param5 - -10, -10 + param1 + param4 - 1, 10, 0);
                    gf.b(var7_array);
                    gf.i(param5 - -param2 + -10, -10 + param1 + param4, param5 - -param2, param1 + param4);
                    gf.b(param2 + param5 + -10 - 1, param1 + param4 + -11, 10, 0);
                    gf.b(var7_array);
                    var8 = 0;
                    L2: while (true) {
                      L3: {
                        L4: {
                          L5: {
                            L6: {
                              if (var8 >= param1 + -20) {
                                break L6;
                              } else {
                                var9 = ui.a(2052949, 0, -110, var8 * 256 / (param1 + -20));
                                gf.a(param5, 10 + param4 + var8, var9);
                                gf.a(param2 + (param5 + -1), var8 + (10 + param4), var9);
                                var8++;
                                if (var12 != 0) {
                                  break L5;
                                } else {
                                  if (var12 == 0) {
                                    continue L2;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                            }
                            if (param0) {
                              jl.field_W.c(param5 - -4, param4 - -3, 256);
                              var8 = param5 + 4 - -jl.field_W.field_z;
                              var9 = param5 + param2 + -3 - mr.field_g.field_z;
                              mr.field_g.c(var9, 3 + param4, 64);
                              break L5;
                            } else {
                              break L4;
                            }
                          }
                          var11 = var8;
                          L7: while (true) {
                            if (~var11 <= ~var9) {
                              break L4;
                            } else {
                              var10 = 192 * (var9 + -var11) / (-var8 + var9) + 64;
                              me.field_h.c(var11, 3 + param4, var10);
                              var11++;
                              if (var12 != 0) {
                                break L3;
                              } else {
                                if (var12 == 0) {
                                  continue L7;
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                        break L3;
                      }
                      break L0;
                    }
                  } else {
                    return;
                  }
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var7, "ei.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_f = null;
              field_b = null;
              if (param0 < -67) {
                break L1;
              } else {
                field_e = -49;
                break L1;
              }
            }
            field_g = null;
            field_a = null;
            field_d = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ei.A(" + param0 + ')');
        }
    }

    final static int a(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_22_0 = 0;
        int stackIn_25_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_61_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_74_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_50_0 = 0;
        int stackOut_55_0 = 0;
        int stackOut_60_0 = 0;
        int stackOut_68_0 = 0;
        int stackOut_63_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_29_0 = 0;
        int stackOut_34_0 = 0;
        int stackOut_39_0 = 0;
        int stackOut_42_0 = 0;
        int stackOut_24_0 = 0;
        int stackOut_21_0 = 0;
        int stackOut_73_0 = 0;
        int stackOut_71_0 = 0;
        try {
          L0: {
            if (ma.field_p < 2) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              return stackIn_4_0;
            } else {
              L1: {
                if (0 == ai.field_e) {
                  if (rq.field_g.b((byte) 122)) {
                    if (!rq.field_g.a("commonui", 60)) {
                      stackOut_50_0 = 40;
                      stackIn_51_0 = stackOut_50_0;
                      return stackIn_51_0;
                    } else {
                      if (!tq.field_f.b((byte) -109)) {
                        stackOut_55_0 = 50;
                        stackIn_56_0 = stackOut_55_0;
                        return stackIn_56_0;
                      } else {
                        if (!tq.field_f.a("commonui", -112)) {
                          stackOut_60_0 = 60;
                          stackIn_61_0 = stackOut_60_0;
                          return stackIn_61_0;
                        } else {
                          if (l.field_g.b((byte) -85)) {
                            if (!l.field_g.a(param0 + -83)) {
                              stackOut_68_0 = 80;
                              stackIn_69_0 = stackOut_68_0;
                              return stackIn_69_0;
                            } else {
                              break L1;
                            }
                          } else {
                            stackOut_63_0 = 70;
                            stackIn_64_0 = stackOut_63_0;
                            return stackIn_64_0;
                          }
                        }
                      }
                    }
                  } else {
                    stackOut_45_0 = 20;
                    stackIn_46_0 = stackOut_45_0;
                    return stackIn_46_0;
                  }
                } else {
                  L2: {
                    if (es.field_j == null) {
                      break L2;
                    } else {
                      if (es.field_j.b((byte) -122)) {
                        if (es.field_j.b("", (byte) -122)) {
                          if (es.field_j.a("", -70)) {
                            break L2;
                          } else {
                            stackOut_18_0 = 29;
                            stackIn_19_0 = stackOut_18_0;
                            return stackIn_19_0;
                          }
                        } else {
                          stackOut_15_0 = 29;
                          stackIn_16_0 = stackOut_15_0;
                          return stackIn_16_0;
                        }
                      } else {
                        stackOut_12_0 = 14;
                        stackIn_13_0 = stackOut_12_0;
                        return stackIn_13_0;
                      }
                    }
                  }
                  if (rq.field_g.b((byte) 125)) {
                    if (rq.field_g.a("commonui", 127)) {
                      if (!tq.field_f.b((byte) -90)) {
                        stackOut_29_0 = 71;
                        stackIn_30_0 = stackOut_29_0;
                        return stackIn_30_0;
                      } else {
                        if (!tq.field_f.a("commonui", -105)) {
                          stackOut_34_0 = 80;
                          stackIn_35_0 = stackOut_34_0;
                          return stackIn_35_0;
                        } else {
                          if (!l.field_g.b((byte) -95)) {
                            stackOut_39_0 = 82;
                            stackIn_40_0 = stackOut_39_0;
                            return stackIn_40_0;
                          } else {
                            if (l.field_g.a(-1)) {
                              break L1;
                            } else {
                              stackOut_42_0 = 86;
                              stackIn_43_0 = stackOut_42_0;
                              return stackIn_43_0;
                            }
                          }
                        }
                      }
                    } else {
                      stackOut_24_0 = 57;
                      stackIn_25_0 = stackOut_24_0;
                      return stackIn_25_0;
                    }
                  } else {
                    stackOut_21_0 = 43;
                    stackIn_22_0 = stackOut_21_0;
                    return stackIn_22_0;
                  }
                }
              }
              if (param0 == 82) {
                stackOut_73_0 = 100;
                stackIn_74_0 = stackOut_73_0;
                break L0;
              } else {
                stackOut_71_0 = 4;
                stackIn_72_0 = stackOut_71_0;
                return stackIn_72_0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) (Object) var1, "ei.F(" + param0 + ')');
        }
        return stackIn_74_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "You have been removed from <%0>'s game.";
        field_g = new int[]{100, 100, 200, 200, 300, 100, 300, 200, 200, 200, 300, 300, 100, 300, 500, 500, 500, 500, 300, 500, 300, 500, 100, 100, 500};
    }
}
