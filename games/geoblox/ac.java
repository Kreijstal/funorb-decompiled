/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ac extends ff {
    static gk field_v;
    static int field_s;
    static String[] field_r;
    static ff field_t;
    static int[] field_w;
    static int field_u;

    ac(m param0, int param1) {
        super(param0, 4, 2, 2, 2, param1, -1, 0, 1, param0.field_o, -1, 2147483647, false);
    }

    ac(int param0) {
        this(ng.field_F, param0);
    }

    public final void a(int param0, int param1, int param2, boolean param3, el param4) {
        try {
            if (param3) {
                int discarded$0 = -1540604944;
                ik.a(param0 + param4.field_v, param4.field_h, param4.field_m + param2, param4.field_r);
            }
            if (param1 > -5) {
                field_t = null;
            }
            super.a(param0, -11, param2, param3, param4);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) (Object) runtimeException, "ac.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final static sl a(int param0, String[] param1) {
        sl var2 = null;
        RuntimeException var2_ref = null;
        sl stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        sl stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            var2 = new sl(false);
            var2.field_a = param1;
            stackOut_2_0 = (sl) var2;
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2_ref = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var2_ref;
            stackOut_4_1 = new StringBuilder().append("ac.A(").append(28).append(',');
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L1;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L1;
            }
          }
          throw t.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + ')');
        }
        return stackIn_3_0;
    }

    final static boolean a(byte param0, pk param1) {
        RuntimeException var2 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_4_0 = 0;
        int stackOut_3_0 = 0;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        try {
          L0: {
            L1: {
              if (param0 >= 6) {
                break L1;
              } else {
                ac.a((byte) -125);
                break L1;
              }
            }
            L2: {
              if (1 != param1.e((byte) -17, 1)) {
                stackOut_4_0 = 0;
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = 1;
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_6_0 = (RuntimeException) var2;
            stackOut_6_1 = new StringBuilder().append("ac.B(").append(param0).append(',');
            stackIn_8_0 = stackOut_6_0;
            stackIn_8_1 = stackOut_6_1;
            stackIn_7_0 = stackOut_6_0;
            stackIn_7_1 = stackOut_6_1;
            if (param1 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L3;
            } else {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "{...}";
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              break L3;
            }
          }
          throw t.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ')');
        }
        return stackIn_5_0 != 0;
    }

    final static void a(boolean param0, boolean param1, byte param2) {
        RuntimeException var3 = null;
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        var14 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              var3_int = 160;
              var4 = 190;
              var4 -= 10;
              if (!param1) {
                stackOut_3_0 = vl.field_p;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = ug.field_c;
                stackIn_4_0 = stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var5 = stackIn_4_0;
              var6 = 0;
              var7 = a.field_e;
              var8 = 0;
              var9 = 0;
              if (param1) {
                var10 = 16;
                L3: while (true) {
                  if (var10 < 0) {
                    break L2;
                  } else {
                    L4: {
                      L5: {
                        if (da.a(0, -100)) {
                          break L5;
                        } else {
                          if (var10 != 16) {
                            break L5;
                          } else {
                            break L4;
                          }
                        }
                      }
                      if ((1 << var10 & var5) == 0) {
                        var9++;
                        var8 += 20;
                        break L4;
                      } else {
                        break L4;
                      }
                    }
                    var10--;
                    continue L3;
                  }
                }
              } else {
                break L2;
              }
            }
            L6: {
              if (8 > var9) {
                break L6;
              } else {
                var3_int = var3_int + (-160 + var8);
                break L6;
              }
            }
            var10 = 0;
            L7: while (true) {
              if (var10 >= pg.field_a.length) {
                L8: {
                  var10 = 170;
                  if (var7 == -1) {
                    fi.field_d.b(w.field_a, 315, var10, 0, -1);
                    if (fh.c(-94)) {
                      int discarded$2 = dd.field_G.a(ni.field_C, 125, 350, 395, 100, 0, -1, 1, 0, 26);
                      break L8;
                    } else {
                      break L8;
                    }
                  } else {
                    L9: {
                      fi.field_d.b(pg.field_a[var7], 315, var10, 0, -1);
                      var11 = -fi.field_d.field_q + fi.field_d.field_o;
                      var12 = 280;
                      if (0 != (1 << var7 & var5)) {
                        sl.field_f[var7].b(160, var12);
                        var12 += 30;
                        dd.field_G.a(kd.field_a, 318, var12, 0, -1);
                        break L9;
                      } else {
                        am.field_b.b(160, var12);
                        var12 += 30;
                        dd.field_G.field_K[0][wf.field_p] = 15488514;
                        dd.field_G.a(ib.field_d, 318, var12, 0, -1);
                        dd.field_G.field_K[0][wf.field_p] = 16689938;
                        break L9;
                      }
                    }
                    var12 = var12 + (fi.field_d.a(ri.field_b[var7], 318, var12, 190, 200, 0, -1, 0, 0, 16) * var11 + var11);
                    var12 += 10;
                    fi.field_d.a(wj.a(sl.field_h, new String[1], (byte) -50), 318, 360, 0, -1);
                    var13 = 0;
                    L10: while (true) {
                      if (var13 >= kk.field_s[var7]) {
                        var12 = var12 + var11;
                        break L8;
                      } else {
                        uk.field_m.f(318 + 10 * var13, 370);
                        var13++;
                        continue L10;
                      }
                    }
                  }
                }
                L11: {
                  if (param2 <= -61) {
                    break L11;
                  } else {
                    field_u = 108;
                    break L11;
                  }
                }
                break L0;
              } else {
                L12: {
                  if (da.a(0, -119)) {
                    break L12;
                  } else {
                    if (var10 != 16) {
                      break L12;
                    } else {
                      L13: {
                        if (!qi.d(105)) {
                          break L13;
                        } else {
                          break L13;
                        }
                      }
                      var10++;
                      continue L7;
                    }
                  }
                }
                L14: {
                  L15: {
                    if (0 != (1 << var10 & var5)) {
                      break L15;
                    } else {
                      if (param1) {
                        break L14;
                      } else {
                        break L15;
                      }
                    }
                  }
                  if (qa.field_a < var3_int) {
                    break L14;
                  } else {
                    if (32 + var3_int < qa.field_a) {
                      break L14;
                    } else {
                      if (var4 > ue.field_e) {
                        break L14;
                      } else {
                        if (32 + var4 < ue.field_e) {
                          break L14;
                        } else {
                          L16: {
                            vb.c(var3_int, var4, 32, 32, 2, 16689938);
                            if (var7 < 0) {
                              var7 = var10;
                              break L16;
                            } else {
                              break L16;
                            }
                          }
                          vb.a(2 + var3_int, var4 + 2, 28, 28, 2, 16777215);
                          break L14;
                        }
                      }
                    }
                  }
                }
                L17: {
                  if (var10 == a.field_e) {
                    vb.c(var3_int, var4, 32, 32, 2, 15488514);
                    vb.a(var3_int - -2, var4 - -2, 28, 28, 2, 16777215);
                    break L17;
                  } else {
                    break L17;
                  }
                }
                if ((var5 & 1 << var10) == 0) {
                  L18: {
                    if (param1) {
                      break L18;
                    } else {
                      break L18;
                    }
                  }
                  var10++;
                  continue L7;
                } else {
                  sl.field_f[var10].f(var3_int, var4);
                  int incrementValue$3 = var6;
                  var6++;
                  if (incrementValue$3 == 7) {
                    L19: {
                      var4 += 40;
                      var3_int = 160;
                      var4 += 5;
                      if (!param1) {
                        break L19;
                      } else {
                        break L19;
                      }
                    }
                    var10++;
                    continue L7;
                  } else {
                    var3_int += 40;
                    var10++;
                    continue L7;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw t.a((Throwable) (Object) var3, "ac.D(" + false + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void a(byte param0) {
        field_t = null;
        field_r = null;
        field_w = null;
        field_v = null;
        if (param0 < 62) {
            field_s = -128;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_v = new gk();
        field_r = new String[]{null, "To store your progress, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score, you must log in or create a free account.#Alternatively, click <%0> to discard it and continue.", "To store your score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements and score, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue.", "To store your achievements, score and progress, you must log in or create a free account.#Alternatively, click <%0> to discard them and continue."};
        field_w = new int[8192];
        field_u = 11;
    }
}
