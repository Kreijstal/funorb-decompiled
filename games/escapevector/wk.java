/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk {
    static String field_f;
    static String field_a;
    static mf field_e;
    static int field_d;
    static boolean[] field_b;
    static boolean field_c;

    public static void a(boolean param0) {
        field_f = null;
        field_e = null;
        field_a = null;
        field_b = null;
    }

    final static void a(int param0, int param1, int param2) {
        L0: {
          if (param1 == 55) {
            break L0;
          } else {
            wk.a(50, 41, 94);
            break L0;
          }
        }
        L1: {
          L2: {
            if (null == vi.field_e) {
              break L2;
            } else {
              if (param0 <= vi.field_e.length) {
                break L1;
              } else {
                break L2;
              }
            }
          }
          vi.field_e = new int[param0 * 2];
          break L1;
        }
        L3: {
          L4: {
            if (null == fl.field_k) {
              break L4;
            } else {
              if (param0 > fl.field_k.length) {
                break L4;
              } else {
                break L3;
              }
            }
          }
          fl.field_k = new int[param0 * 2];
          break L3;
        }
        L5: {
          L6: {
            if (pc.field_c == null) {
              break L6;
            } else {
              if (pc.field_c.length < param0) {
                break L6;
              } else {
                break L5;
              }
            }
          }
          pc.field_c = new int[2 * param0];
          break L5;
        }
        L7: {
          L8: {
            if (mi.field_k == null) {
              break L8;
            } else {
              if (mi.field_k.length >= param0) {
                break L7;
              } else {
                break L8;
              }
            }
          }
          mi.field_k = new int[2 * param0];
          break L7;
        }
        L9: {
          L10: {
            if (tm.field_fb == null) {
              break L10;
            } else {
              if (tm.field_fb.length < param0) {
                break L10;
              } else {
                break L9;
              }
            }
          }
          tm.field_fb = new int[2 * param0];
          break L9;
        }
        L11: {
          L12: {
            if (null == th.field_v) {
              break L12;
            } else {
              if (param0 <= th.field_v.length) {
                break L11;
              } else {
                break L12;
              }
            }
          }
          th.field_v = new int[2 * param0];
          break L11;
        }
        L13: {
          L14: {
            if (cd.field_q == null) {
              break L14;
            } else {
              if (param2 + param0 <= cd.field_q.length) {
                break L13;
              } else {
                break L14;
              }
            }
          }
          cd.field_q = new int[2 * (param0 - -param2)];
          break L13;
        }
        L15: {
          L16: {
            if (null == dj.field_a) {
              break L16;
            } else {
              if (param0 > dj.field_a.length) {
                break L16;
              } else {
                break L15;
              }
            }
          }
          dj.field_a = new boolean[2 * param0];
          break L15;
        }
        pl.field_r = -2147483648;
        jf.field_J = 0;
        oa.field_t = -2147483648;
        pg.field_d = 2147483647;
        vl.field_e = 2147483647;
    }

    final static int a(boolean param0, int param1, CharSequence param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int stackIn_42_0 = 0;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        RuntimeException stackIn_46_0 = null;
        StringBuilder stackIn_46_1 = null;
        String stackIn_46_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_41_0 = 0;
        RuntimeException stackOut_43_0 = null;
        StringBuilder stackOut_43_1 = null;
        RuntimeException stackOut_45_0 = null;
        StringBuilder stackOut_45_1 = null;
        String stackOut_45_2 = null;
        RuntimeException stackOut_44_0 = null;
        StringBuilder stackOut_44_1 = null;
        String stackOut_44_2 = null;
        var11 = EscapeVector.field_A;
        try {
          L0: {
            L1: {
              if (param1 < 2) {
                break L1;
              } else {
                if (36 < param1) {
                  break L1;
                } else {
                  var4_int = 0;
                  var5 = 0;
                  var6 = 0;
                  var7 = param2.length();
                  var8 = 0;
                  L2: while (true) {
                    if (var8 >= var7) {
                      if (var5 != 0) {
                        stackOut_41_0 = var6;
                        stackIn_42_0 = stackOut_41_0;
                        break L0;
                      } else {
                        throw new NumberFormatException();
                      }
                    } else {
                      L3: {
                        L4: {
                          var9 = param2.charAt(var8);
                          if (var8 == 0) {
                            if (var9 != 45) {
                              if (var9 != 43) {
                                break L4;
                              } else {
                                L5: {
                                  if (param0) {
                                    break L5;
                                  } else {
                                    break L5;
                                  }
                                }
                                var8++;
                                continue L2;
                              }
                            } else {
                              var4_int = 1;
                              break L3;
                            }
                          } else {
                            break L4;
                          }
                        }
                        L6: {
                          L7: {
                            if (var9 < 48) {
                              break L7;
                            } else {
                              if (var9 <= 57) {
                                var9 -= 48;
                                break L6;
                              } else {
                                break L7;
                              }
                            }
                          }
                          L8: {
                            if (65 > var9) {
                              break L8;
                            } else {
                              if (var9 <= 90) {
                                var9 -= 55;
                                break L6;
                              } else {
                                break L8;
                              }
                            }
                          }
                          L9: {
                            if (97 > var9) {
                              break L9;
                            } else {
                              if (122 < var9) {
                                break L9;
                              } else {
                                var9 -= 87;
                                break L6;
                              }
                            }
                          }
                          throw new NumberFormatException();
                        }
                        if (param1 <= var9) {
                          throw new NumberFormatException();
                        } else {
                          L10: {
                            if (var4_int == 0) {
                              break L10;
                            } else {
                              var9 = -var9;
                              break L10;
                            }
                          }
                          var10 = var6 * param1 - -var9;
                          if (var6 != var10 / param1) {
                            throw new NumberFormatException();
                          } else {
                            var6 = var10;
                            var5 = 1;
                            break L3;
                          }
                        }
                      }
                      var8++;
                      continue L2;
                    }
                  }
                }
              }
            }
            throw new IllegalArgumentException("" + param1);
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L11: {
            var4 = decompiledCaughtException;
            stackOut_43_0 = (RuntimeException) var4;
            stackOut_43_1 = new StringBuilder().append("wk.B(").append(param0).append(44).append(param1).append(44);
            stackIn_45_0 = stackOut_43_0;
            stackIn_45_1 = stackOut_43_1;
            stackIn_44_0 = stackOut_43_0;
            stackIn_44_1 = stackOut_43_1;
            if (param2 == null) {
              stackOut_45_0 = (RuntimeException) (Object) stackIn_45_0;
              stackOut_45_1 = (StringBuilder) (Object) stackIn_45_1;
              stackOut_45_2 = "null";
              stackIn_46_0 = stackOut_45_0;
              stackIn_46_1 = stackOut_45_1;
              stackIn_46_2 = stackOut_45_2;
              break L11;
            } else {
              stackOut_44_0 = (RuntimeException) (Object) stackIn_44_0;
              stackOut_44_1 = (StringBuilder) (Object) stackIn_44_1;
              stackOut_44_2 = "{...}";
              stackIn_46_0 = stackOut_44_0;
              stackIn_46_1 = stackOut_44_1;
              stackIn_46_2 = stackOut_44_2;
              break L11;
            }
          }
          throw t.a((Throwable) (Object) stackIn_46_0, stackIn_46_2 + 44 + 97 + 41);
        }
        return stackIn_42_0;
    }

    final static ia a(int param0, c param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ia var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        ia stackIn_21_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        ia stackOut_20_0 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var9 = EscapeVector.field_A;
        try {
          L0: {
            var2_int = param1.j(8, 8);
            if (var2_int > 0) {
              throw new IllegalStateException("" + var2_int);
            } else {
              L1: {
                var3 = 51 % ((-82 - param0) / 38);
                var4 = da.a(param1, (byte) -104) ? 1 : 0;
                var5 = da.a(param1, (byte) -114) ? 1 : 0;
                var6 = new ia();
                var6.field_K = (short)param1.j(16, 8);
                var6.field_L = rg.a(param1, 16, var6.field_L, -1);
                var6.field_r = rg.a(param1, 16, var6.field_r, -1);
                var6.field_J = rg.a(param1, 16, var6.field_J, -1);
                var6.field_D = (short)param1.j(16, 8);
                var6.field_e = rg.a(param1, 16, var6.field_e, -1);
                var6.field_o = rg.a(param1, 16, var6.field_o, -1);
                var6.field_f = rg.a(param1, 16, var6.field_f, -1);
                if (var4 != 0) {
                  var6.field_M = (short)param1.j(16, 8);
                  var6.field_N = rg.a(param1, 16, var6.field_N, -1);
                  var6.field_q = rg.a(param1, 16, var6.field_q, -1);
                  var6.field_w = rg.a(param1, 16, var6.field_w, -1);
                  var6.field_h = rg.a(param1, 16, var6.field_h, -1);
                  var6.field_u = rg.a(param1, 16, var6.field_u, -1);
                  var6.field_j = rg.a(param1, 16, var6.field_j, -1);
                  break L1;
                } else {
                  break L1;
                }
              }
              L2: {
                if (var5 == 0) {
                  break L2;
                } else {
                  int discarded$1 = param1.j(16, 8);
                  var6.field_v = rg.a(param1, 16, var6.field_v, -1);
                  var6.field_c = rg.a(param1, 16, var6.field_c, -1);
                  var6.field_Q = rg.a(param1, 16, var6.field_Q, -1);
                  var6.field_G = rg.a(param1, 16, var6.field_G, -1);
                  var6.field_F = rg.a(param1, 16, var6.field_F, -1);
                  break L2;
                }
              }
              L3: {
                if (!da.a(param1, (byte) -104)) {
                  break L3;
                } else {
                  var6.field_m = rg.a(param1, 16, var6.field_m, -1);
                  break L3;
                }
              }
              L4: {
                if (!da.a(param1, (byte) -102)) {
                  break L4;
                } else {
                  var6.field_n = jm.a(16, 118, param1, var6.field_n);
                  var7 = 0;
                  var8 = 0;
                  L5: while (true) {
                    if (var8 >= var6.field_n.length) {
                      if (0 == var7) {
                        var6.field_n = null;
                        break L4;
                      } else {
                        var6.field_I = (byte)(1 + var7);
                        break L4;
                      }
                    } else {
                      L6: {
                        if ((255 & var6.field_n[var8]) <= var7) {
                          break L6;
                        } else {
                          break L6;
                        }
                      }
                      var8++;
                      continue L5;
                    }
                  }
                }
              }
              stackOut_20_0 = (ia) var6;
              stackIn_21_0 = stackOut_20_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("wk.A(").append(param0).append(44);
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param1 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw t.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
        return stackIn_21_0;
    }

    final static String a(String param0, boolean param1, String param2, String param3, mf param4) {
        RuntimeException var5 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_5_0 = null;
        String stackOut_1_0 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_17_0 = null;
        StringBuilder stackOut_17_1 = null;
        String stackOut_17_2 = null;
        try {
          L0: {
            if (param4.b(0)) {
              L1: {
                if (!param1) {
                  break L1;
                } else {
                  field_a = null;
                  break L1;
                }
              }
              stackOut_5_0 = param2 + " - " + param4.a(param3, 0) + "%";
              stackIn_6_0 = stackOut_5_0;
              break L0;
            } else {
              stackOut_1_0 = (String) param0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var5 = decompiledCaughtException;
            stackOut_7_0 = (RuntimeException) var5;
            stackOut_7_1 = new StringBuilder().append("wk.D(");
            stackIn_9_0 = stackOut_7_0;
            stackIn_9_1 = stackOut_7_1;
            stackIn_8_0 = stackOut_7_0;
            stackIn_8_1 = stackOut_7_1;
            if (param0 == null) {
              stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "null";
              stackIn_10_0 = stackOut_9_0;
              stackIn_10_1 = stackOut_9_1;
              stackIn_10_2 = stackOut_9_2;
              break L2;
            } else {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "{...}";
              stackIn_10_0 = stackOut_8_0;
              stackIn_10_1 = stackOut_8_1;
              stackIn_10_2 = stackOut_8_2;
              break L2;
            }
          }
          L3: {
            stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
            stackOut_10_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_10_2).append(44).append(param1).append(44);
            stackIn_12_0 = stackOut_10_0;
            stackIn_12_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param2 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_13_0 = stackOut_11_0;
              stackIn_13_1 = stackOut_11_1;
              stackIn_13_2 = stackOut_11_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_15_0 = stackOut_13_0;
            stackIn_15_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param3 == null) {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "null";
              stackIn_16_0 = stackOut_15_0;
              stackIn_16_1 = stackOut_15_1;
              stackIn_16_2 = stackOut_15_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_16_0 = stackOut_14_0;
              stackIn_16_1 = stackOut_14_1;
              stackIn_16_2 = stackOut_14_2;
              break L4;
            }
          }
          L5: {
            stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
            stackOut_16_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_16_2).append(44);
            stackIn_18_0 = stackOut_16_0;
            stackIn_18_1 = stackOut_16_1;
            stackIn_17_0 = stackOut_16_0;
            stackIn_17_1 = stackOut_16_1;
            if (param4 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L5;
            } else {
              stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
              stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
              stackOut_17_2 = "{...}";
              stackIn_19_0 = stackOut_17_0;
              stackIn_19_1 = stackOut_17_1;
              stackIn_19_2 = stackOut_17_2;
              break L5;
            }
          }
          throw t.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_6_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "No highscores";
        field_a = "Error connecting to server. Please try using a different server.";
        field_b = new boolean[]{true, true, true, true, true};
    }
}
