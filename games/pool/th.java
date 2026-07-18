/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static String field_d;
    static byte[][] field_j;
    static String field_e;
    static int field_a;
    static String field_k;
    static String field_i;
    static boolean field_h;
    static String field_g;
    static String field_f;
    static p[] field_l;
    static int field_b;
    static String field_c;

    final static void a(byte param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              kg.field_q = kc.field_g[param1];
              ir.field_b = kj.field_i[param1];
              if (param0 < -55) {
                break L1;
              } else {
                field_j = null;
                break L1;
              }
            }
            ud.field_F = cb.field_f[param1];
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var2, "th.A(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5_ref_String = null;
        int var5 = 0;
        int var6 = 0;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int var10 = 0;
        int var11 = 0;
        int stackIn_45_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_95_0 = 0;
        int stackIn_97_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_44_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_96_0 = 0;
        int stackOut_55_0 = 0;
        try {
          L0: {
            L1: {
              var3_int = 1 / ((param1 - 10) / 61);
              var4 = 1;
              if (gd.field_b) {
                break L1;
              } else {
                if (uq.field_D != null) {
                  break L1;
                } else {
                  var4 = 0;
                  break L1;
                }
              }
            }
            L2: {
              if (hn.field_b != 0) {
                break L2;
              } else {
                if (null != tp.field_e) {
                  var4 = 0;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (hn.field_b != 2) {
                break L3;
              } else {
                if (!hp.a(false)) {
                  var4 = 0;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
            if (qi.field_a == 84) {
              L4: {
                if (var4 != 0) {
                  L5: {
                    if (td.field_c.length() <= 0) {
                      break L5;
                    } else {
                      var5_ref_String = td.field_c.toString();
                      if (!ei.a((byte) -71, var5_ref_String)) {
                        L6: {
                          var6 = hn.field_b;
                          if (var6 != 0) {
                            break L6;
                          } else {
                            if (null == em.field_L) {
                              break L6;
                            } else {
                              var6 = 1;
                              break L6;
                            }
                          }
                        }
                        L7: {
                          if (f.a(5, var6) == 2) {
                            om.a(1, var6, param0, (byte) -4);
                            break L7;
                          } else {
                            break L7;
                          }
                        }
                        ub.a((byte) -116, var5_ref_String, param2, fm.field_I, hn.field_b, -1);
                        break L5;
                      } else {
                        jh.a(0, hj.field_h, (String) null, 2, (String) null, true);
                        jh.a(0, ci.field_m, (String) null, 2, (String) null, true);
                        break L5;
                      }
                    }
                  }
                  cl.a(14851);
                  break L4;
                } else {
                  if (hn.field_b != 0) {
                    cl.a(14851);
                    break L4;
                  } else {
                    break L4;
                  }
                }
              }
              stackOut_44_0 = 1;
              stackIn_45_0 = stackOut_44_0;
              return stackIn_45_0 != 0;
            } else {
              if (qi.field_a != 85) {
                var5 = ml.field_b;
                if (nq.a((char) var5, (byte) -125)) {
                  L8: {
                    if (var4 == 0) {
                      break L8;
                    } else {
                      if (80 > td.field_c.length()) {
                        L9: {
                          StringBuilder discarded$3 = td.field_c.append((char) var5);
                          var6 = 485;
                          var7 = di.field_j;
                          var7 = bm.a(524288, var7);
                          if (hn.field_b == 2) {
                            var8 = nr.a(new String[1], -1, jl.field_a);
                            var9 = nr.a(new String[1], -1, vh.field_S);
                            var10 = m.field_c.b(var8);
                            var11 = m.field_c.b(var9);
                            if (~var10 < ~var11) {
                              var6 = var6 - var10;
                              break L9;
                            } else {
                              var6 = var6 - var11;
                              break L9;
                            }
                          } else {
                            L10: {
                              var8 = "";
                              if (hn.field_b != 0) {
                                break L10;
                              } else {
                                L11: {
                                  if (null != em.field_L) {
                                    break L11;
                                  } else {
                                    if (ej.field_l) {
                                      var8 = "[" + sn.field_l + "] ";
                                      break L11;
                                    } else {
                                      break L11;
                                    }
                                  }
                                }
                                if (em.field_L == null) {
                                  break L10;
                                } else {
                                  L12: {
                                    if (!sa.field_c) {
                                      break L12;
                                    } else {
                                      if (kn.field_g != null) {
                                        var8 = "[" + kn.field_g + "] ";
                                        break L10;
                                      } else {
                                        break L12;
                                      }
                                    }
                                  }
                                  var8 = "[" + nr.a(new String[1], -1, field_c) + "] ";
                                  break L10;
                                }
                              }
                            }
                            var8 = var8 + var7 + ": ";
                            var6 = var6 - m.field_c.b(var8);
                            break L9;
                          }
                        }
                        if (m.field_c.b(td.field_c.toString()) > var6) {
                          StringBuilder discarded$4 = cj.a(' ', -1 + td.field_c.length(), -2790, td.field_c);
                          break L8;
                        } else {
                          break L8;
                        }
                      } else {
                        break L8;
                      }
                    }
                  }
                  stackOut_94_0 = 1;
                  stackIn_95_0 = stackOut_94_0;
                  return stackIn_95_0 != 0;
                } else {
                  stackOut_96_0 = 0;
                  stackIn_97_0 = stackOut_96_0;
                  break L0;
                }
              } else {
                L13: {
                  if (var4 == 0) {
                    break L13;
                  } else {
                    if (td.field_c.length() <= 0) {
                      break L13;
                    } else {
                      StringBuilder discarded$5 = cj.a(' ', -1 + td.field_c.length(), -2790, td.field_c);
                      break L13;
                    }
                  }
                }
                stackOut_55_0 = 1;
                stackIn_56_0 = stackOut_55_0;
                return stackIn_56_0 != 0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var3, "th.C(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_97_0 != 0;
    }

    public static void a(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_k = null;
              field_j = null;
              field_g = null;
              field_e = null;
              field_l = null;
              if (param0 == 15059) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            field_i = null;
            field_f = null;
            field_d = null;
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "th.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int[] param2, int[] param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_21_2 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        String stackOut_20_2 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            L1: {
              if (~param4 >= ~param0) {
                break L1;
              } else {
                L2: {
                  var5_int = (param4 + param0) / 2;
                  var6 = param0;
                  var7 = param2[var5_int];
                  param2[var5_int] = param2[param4];
                  param2[param4] = var7;
                  var8 = param3[var5_int];
                  param3[var5_int] = param3[param4];
                  param3[param4] = var8;
                  if (var7 == 2147483647) {
                    stackOut_4_0 = 0;
                    stackIn_5_0 = stackOut_4_0;
                    break L2;
                  } else {
                    stackOut_2_0 = 1;
                    stackIn_5_0 = stackOut_2_0;
                    break L2;
                  }
                }
                var9 = stackIn_5_0;
                var10 = param0;
                L3: while (true) {
                  if (param4 <= var10) {
                    param2[param4] = param2[var6];
                    param2[var6] = var7;
                    param3[param4] = param3[var6];
                    param3[var6] = var8;
                    th.a(param0, -30916, param2, param3, var6 - 1);
                    th.a(var6 - -1, param1, param2, param3, param4);
                    break L1;
                  } else {
                    L4: {
                      if (param2[var10] >= (var10 & var9) + var7) {
                        break L4;
                      } else {
                        var11 = param2[var10];
                        param2[var10] = param2[var6];
                        param2[var6] = var11;
                        var12 = param3[var10];
                        param3[var10] = param3[var6];
                        int incrementValue$2 = var6;
                        var6++;
                        param3[incrementValue$2] = var12;
                        break L4;
                      }
                    }
                    var10++;
                    continue L3;
                  }
                }
              }
            }
            L5: {
              if (param1 == -30916) {
                break L5;
              } else {
                boolean discarded$3 = th.a(-19, 83, -97);
                break L5;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L6: {
            var5 = decompiledCaughtException;
            stackOut_17_0 = (RuntimeException) var5;
            stackOut_17_1 = new StringBuilder().append("th.D(").append(param0).append(',').append(param1).append(',');
            stackIn_20_0 = stackOut_17_0;
            stackIn_20_1 = stackOut_17_1;
            stackIn_18_0 = stackOut_17_0;
            stackIn_18_1 = stackOut_17_1;
            if (param2 == null) {
              stackOut_20_0 = (RuntimeException) (Object) stackIn_20_0;
              stackOut_20_1 = (StringBuilder) (Object) stackIn_20_1;
              stackOut_20_2 = "null";
              stackIn_21_0 = stackOut_20_0;
              stackIn_21_1 = stackOut_20_1;
              stackIn_21_2 = stackOut_20_2;
              break L6;
            } else {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "{...}";
              stackIn_21_0 = stackOut_18_0;
              stackIn_21_1 = stackOut_18_1;
              stackIn_21_2 = stackOut_18_2;
              break L6;
            }
          }
          L7: {
            stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
            stackOut_21_1 = ((StringBuilder) (Object) stackIn_21_1).append(stackIn_21_2).append(',');
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param3 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L7;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param4 + ')');
        }
    }

    final static void b(int param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                th.a((byte) -3, 101);
                break L1;
              }
            }
            L2: {
              if (fm.field_H) {
                lq.i(param0 + 15976);
                break L2;
              } else {
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "th.B(" + param0 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "Kick <%0> from this game";
        field_j = new byte[250][];
        field_d = "To report a player, right-click on their name and select the option to report abuse.";
        field_e = "RuneScape clan";
        field_b = 1;
        field_f = "Close";
        field_k = "<%0> has entered a game.";
        field_h = false;
        field_g = null;
        field_c = "<%0>'s game";
    }
}
