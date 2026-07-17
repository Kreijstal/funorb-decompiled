/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;

final class gf {
    private int field_n;
    private int field_d;
    private int field_m;
    static int field_e;
    private int field_k;
    private oi field_g;
    private int field_j;
    private boolean field_r;
    private int field_p;
    private float field_t;
    private int field_b;
    private int field_s;
    private int field_h;
    private int field_f;
    private int field_i;
    private int field_o;
    private int field_l;
    static String field_q;
    private int field_a;
    private int field_c;

    final void d(int param0) {
        if (ff.field_b == null) {
          L0: {
            if (jd.field_c <= 0) {
              ((gf) this).field_r = false;
              break L0;
            } else {
              break L0;
            }
          }
          if (!((gf) this).field_r) {
            L1: {
              if (u.field_sb < ((gf) this).field_f) {
                ef.field_e = (((gf) this).field_f + -u.field_sb) / 2;
                break L1;
              } else {
                if (((gf) this).field_f > 0) {
                  ef.field_e = 0;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (u.field_sb != ((gf) this).field_s) {
                break L2;
              } else {
                if (bk.field_d == ((gf) this).field_c) {
                  return;
                } else {
                  break L2;
                }
              }
            }
            ((gf) this).field_g.a(-26278, ((gf) this).field_s, ((gf) this).field_c);
            return;
          } else {
            int fieldTemp$1 = ((gf) this).field_n - 1;
            ((gf) this).field_n = ((gf) this).field_n - 1;
            if (~fieldTemp$1 < param0) {
              return;
            } else {
              ((gf) this).field_n = ((gf) this).field_j;
              if (ia.field_C >= ((gf) this).field_p) {
                this.c(115);
                return;
              } else {
                ((gf) this).field_r = false;
                return;
              }
            }
          }
        } else {
          return;
        }
    }

    public static void b() {
        field_q = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            RuntimeException var2_ref2 = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_3_0 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            String stackIn_20_2 = null;
            int stackOut_2_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            String stackOut_18_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Lexicominos.field_L ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!pf.field_m) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            stackOut_2_0 = 1;
                            stackIn_3_0 = stackOut_2_0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return stackIn_3_0 != 0;
                    }
                    case 4: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) oa.a(true, param1, "getcookies");
                            int discarded$2 = -125;
                            var4 = dc.a(var3, ';');
                            var5 = 0;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 13;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (var6 < 0) {
                                statePc = 10;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = 1;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0 != 0;
                    }
                    case 10: {
                        try {
                            var5++;
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var2_ref = caughtException;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (param1.getParameter("tuhstatbut") == null) {
                                statePc = 15;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = 1;
                            stackIn_16_0 = stackOut_14_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            stackOut_15_0 = 0;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        var2_ref2 = (RuntimeException) (Object) caughtException;
                        stackOut_17_0 = (RuntimeException) var2_ref2;
                        stackOut_17_1 = new StringBuilder().append("gf.D(").append(0).append(44);
                        stackIn_19_0 = stackOut_17_0;
                        stackIn_19_1 = stackOut_17_1;
                        stackIn_18_0 = stackOut_17_0;
                        stackIn_18_1 = stackOut_17_1;
                        if (param1 == null) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
                        stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
                        stackOut_18_2 = "{...}";
                        stackIn_20_0 = stackOut_18_0;
                        stackIn_20_1 = stackOut_18_1;
                        stackIn_20_2 = stackOut_18_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                        stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                        stackOut_19_2 = "null";
                        stackIn_20_0 = stackOut_19_0;
                        stackIn_20_1 = stackOut_19_1;
                        stackIn_20_2 = stackOut_19_2;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        throw ld.a((Throwable) (Object) stackIn_20_0, stackIn_20_2 + 41);
                    }
                    default: throw new IllegalStateException("invalid CFG state " + statePc);
                }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ra b(byte param0) {
        if (param0 != -74) {
            this.c(-88);
        }
        ((gf) this).field_b = bk.field_d;
        ((gf) this).field_k = u.field_sb;
        ((gf) this).field_g.a(-26278, ((gf) this).field_i, ((gf) this).field_a);
        rl.field_O = false;
        ra var2 = sg.a(0, ((gf) this).field_i, ((gf) this).field_a, 0, 0, jh.field_a);
        if (!(var2 != null)) {
            ((gf) this).a((byte) -110);
        }
        return var2;
    }

    private final void c(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        L0: {
          var5 = Lexicominos.field_L ? 1 : 0;
          if (param0 >= 103) {
            break L0;
          } else {
            ((gf) this).field_m = -89;
            break L0;
          }
        }
        var2 = ((gf) this).field_f;
        var3 = ((gf) this).field_l;
        if (((gf) this).a(0)) {
          L1: {
            if (var3 > ((gf) this).field_m) {
              var3 = ((gf) this).field_m;
              break L1;
            } else {
              if (((gf) this).field_d > var3) {
                var3 = ((gf) this).field_d;
                break L1;
              } else {
                break L1;
              }
            }
          }
          L2: {
            if (((gf) this).field_h < var2) {
              var2 = ((gf) this).field_h;
              break L2;
            } else {
              if (var2 < ((gf) this).field_o) {
                var2 = ((gf) this).field_o;
                break L2;
              } else {
                break L2;
              }
            }
          }
          L3: {
            if (0.0f >= ((gf) this).field_t) {
              break L3;
            } else {
              var4 = (int)(0.5f + (float)var3 * ((gf) this).field_t);
              if (var4 > var2) {
                var3 = (int)((float)var2 / ((gf) this).field_t);
                break L3;
              } else {
                if (var4 < var2) {
                  var2 = var4;
                  break L3;
                } else {
                  break L3;
                }
              }
            }
          }
          L4: {
            L5: {
              if (var2 != u.field_sb) {
                break L5;
              } else {
                if (var3 != bk.field_d) {
                  break L5;
                } else {
                  break L4;
                }
              }
            }
            ((gf) this).field_g.a(-26278, var2, var3);
            break L4;
          }
          L6: {
            if (((gf) this).field_f <= 0) {
              break L6;
            } else {
              ef.field_e = (((gf) this).field_f - u.field_sb) / 2;
              break L6;
            }
          }
          return;
        } else {
          ((gf) this).field_r = false;
          return;
        }
    }

    final boolean a(int param0) {
        int stackIn_6_0 = 0;
        int stackOut_4_0 = 0;
        int stackOut_5_0 = 0;
        if (param0 == 0) {
          L0: {
            L1: {
              if (ia.field_C < ((gf) this).field_p) {
                break L1;
              } else {
                if (jd.field_c <= 0) {
                  break L1;
                } else {
                  stackOut_4_0 = 1;
                  stackIn_6_0 = stackOut_4_0;
                  break L0;
                }
              }
            }
            stackOut_5_0 = 0;
            stackIn_6_0 = stackOut_5_0;
            break L0;
          }
          return stackIn_6_0 != 0;
        } else {
          return true;
        }
    }

    final void a(byte param0) {
        ((gf) this).field_g.a(param0 ^ 26312, ((gf) this).field_k, ((gf) this).field_b);
        if (param0 != -110) {
            boolean discarded$0 = ((gf) this).a(107);
        }
    }

    final static void a(int param0, int param1, db[] param2, int param3, int param4, byte param5) {
        RuntimeException var6 = null;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
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
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        RuntimeException stackIn_73_0 = null;
        StringBuilder stackIn_73_1 = null;
        RuntimeException stackIn_74_0 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_9_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        RuntimeException stackOut_71_0 = null;
        StringBuilder stackOut_71_1 = null;
        RuntimeException stackOut_73_0 = null;
        StringBuilder stackOut_73_1 = null;
        String stackOut_73_2 = null;
        RuntimeException stackOut_72_0 = null;
        StringBuilder stackOut_72_1 = null;
        String stackOut_72_2 = null;
        var22 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            if (param2 == null) {
              return;
            } else {
              L1: {
                if (param3 <= 0) {
                  break L1;
                } else {
                  if (param1 > 0) {
                    L2: {
                      if (param2[3] == null) {
                        stackOut_9_0 = 0;
                        stackIn_10_0 = stackOut_9_0;
                        break L2;
                      } else {
                        stackOut_8_0 = param2[3].field_r;
                        stackIn_10_0 = stackOut_8_0;
                        break L2;
                      }
                    }
                    L3: {
                      var6_int = stackIn_10_0;
                      if (null == param2[5]) {
                        stackOut_12_0 = 0;
                        stackIn_13_0 = stackOut_12_0;
                        break L3;
                      } else {
                        stackOut_11_0 = param2[5].field_r;
                        stackIn_13_0 = stackOut_11_0;
                        break L3;
                      }
                    }
                    L4: {
                      var7 = stackIn_13_0;
                      if (null != param2[1]) {
                        stackOut_15_0 = param2[1].field_x;
                        stackIn_16_0 = stackOut_15_0;
                        break L4;
                      } else {
                        stackOut_14_0 = 0;
                        stackIn_16_0 = stackOut_14_0;
                        break L4;
                      }
                    }
                    L5: {
                      var8 = stackIn_16_0;
                      if (param2[7] == null) {
                        stackOut_18_0 = 0;
                        stackIn_19_0 = stackOut_18_0;
                        break L5;
                      } else {
                        stackOut_17_0 = param2[7].field_x;
                        stackIn_19_0 = stackOut_17_0;
                        break L5;
                      }
                    }
                    L6: {
                      var9 = stackIn_19_0;
                      var10 = param0 - -param3;
                      var11 = param1 + param4;
                      var12 = var6_int + param0;
                      var13 = -var7 + var10;
                      var14 = var8 + param4;
                      var15 = -var9 + var11;
                      var16 = var12;
                      var17 = var13;
                      if (var16 > var17) {
                        var17 = param0 - -(var6_int * param3 / (var7 + var6_int));
                        var16 = param0 - -(var6_int * param3 / (var7 + var6_int));
                        break L6;
                      } else {
                        break L6;
                      }
                    }
                    L7: {
                      var18 = var14;
                      var19 = var15;
                      lf.b(ji.field_a);
                      if (var18 <= var19) {
                        break L7;
                      } else {
                        var19 = param4 - -(param1 * var8 / (var9 + var8));
                        var18 = param4 - -(param1 * var8 / (var9 + var8));
                        break L7;
                      }
                    }
                    L8: {
                      if (null != param2[0]) {
                        lf.f(param0, param4, var16, var18);
                        param2[0].d(param0, param4);
                        lf.a(ji.field_a);
                        break L8;
                      } else {
                        break L8;
                      }
                    }
                    if (param5 > 77) {
                      L9: {
                        if (param2[2] == null) {
                          break L9;
                        } else {
                          lf.f(var17, param4, var10, var18);
                          param2[2].d(var13, param4);
                          lf.a(ji.field_a);
                          break L9;
                        }
                      }
                      L10: {
                        if (param2[6] == null) {
                          break L10;
                        } else {
                          lf.f(param0, var19, var16, var11);
                          param2[6].d(param0, var15);
                          lf.a(ji.field_a);
                          break L10;
                        }
                      }
                      L11: {
                        if (null == param2[8]) {
                          break L11;
                        } else {
                          lf.f(var17, var19, var10, var11);
                          param2[8].d(var13, var15);
                          lf.a(ji.field_a);
                          break L11;
                        }
                      }
                      L12: {
                        if (null == param2[1]) {
                          break L12;
                        } else {
                          if (0 == param2[1].field_r) {
                            break L12;
                          } else {
                            lf.f(var16, param4, var17, var18);
                            var20 = var12;
                            L13: while (true) {
                              if (var20 >= var13) {
                                lf.a(ji.field_a);
                                break L12;
                              } else {
                                param2[1].d(var20, param4);
                                var20 = var20 + param2[1].field_r;
                                continue L13;
                              }
                            }
                          }
                        }
                      }
                      L14: {
                        if (null == param2[7]) {
                          break L14;
                        } else {
                          if (0 == param2[7].field_r) {
                            break L14;
                          } else {
                            lf.f(var16, var19, var17, var11);
                            var20 = var12;
                            L15: while (true) {
                              if (var13 <= var20) {
                                lf.a(ji.field_a);
                                break L14;
                              } else {
                                param2[7].d(var20, var15);
                                var20 = var20 + param2[7].field_r;
                                continue L15;
                              }
                            }
                          }
                        }
                      }
                      L16: {
                        if (null == param2[3]) {
                          break L16;
                        } else {
                          if (param2[3].field_x != 0) {
                            lf.f(param0, var18, var16, var19);
                            var20 = var14;
                            L17: while (true) {
                              if (var20 >= var15) {
                                lf.a(ji.field_a);
                                break L16;
                              } else {
                                param2[3].d(param0, var20);
                                var20 = var20 + param2[3].field_x;
                                continue L17;
                              }
                            }
                          } else {
                            break L16;
                          }
                        }
                      }
                      L18: {
                        if (param2[5] == null) {
                          break L18;
                        } else {
                          if (param2[5].field_x == 0) {
                            break L18;
                          } else {
                            lf.f(var17, var18, var10, var19);
                            var20 = var14;
                            L19: while (true) {
                              if (var20 >= var15) {
                                lf.a(ji.field_a);
                                break L18;
                              } else {
                                param2[5].d(var13, var20);
                                var20 = var20 + param2[5].field_x;
                                continue L19;
                              }
                            }
                          }
                        }
                      }
                      L20: {
                        if (param2[4] == null) {
                          break L20;
                        } else {
                          if (0 == param2[4].field_r) {
                            break L20;
                          } else {
                            if (param2[4].field_x == 0) {
                              break L20;
                            } else {
                              lf.f(var16, var18, var17, var19);
                              var20 = var14;
                              L21: while (true) {
                                if (var20 >= var15) {
                                  lf.a(ji.field_a);
                                  break L20;
                                } else {
                                  var21 = var12;
                                  L22: while (true) {
                                    if (var21 >= var13) {
                                      var20 = var20 + param2[4].field_x;
                                      continue L21;
                                    } else {
                                      param2[4].d(var21, var20);
                                      var21 = var21 + param2[4].field_r;
                                      continue L22;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                      }
                      break L0;
                    } else {
                      return;
                    }
                  } else {
                    break L1;
                  }
                }
              }
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L23: {
            var6 = decompiledCaughtException;
            stackOut_71_0 = (RuntimeException) var6;
            stackOut_71_1 = new StringBuilder().append("gf.G(").append(param0).append(44).append(param1).append(44);
            stackIn_73_0 = stackOut_71_0;
            stackIn_73_1 = stackOut_71_1;
            stackIn_72_0 = stackOut_71_0;
            stackIn_72_1 = stackOut_71_1;
            if (param2 == null) {
              stackOut_73_0 = (RuntimeException) (Object) stackIn_73_0;
              stackOut_73_1 = (StringBuilder) (Object) stackIn_73_1;
              stackOut_73_2 = "null";
              stackIn_74_0 = stackOut_73_0;
              stackIn_74_1 = stackOut_73_1;
              stackIn_74_2 = stackOut_73_2;
              break L23;
            } else {
              stackOut_72_0 = (RuntimeException) (Object) stackIn_72_0;
              stackOut_72_1 = (StringBuilder) (Object) stackIn_72_1;
              stackOut_72_2 = "{...}";
              stackIn_74_0 = stackOut_72_0;
              stackIn_74_1 = stackOut_72_1;
              stackIn_74_2 = stackOut_72_2;
              break L23;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_74_0, stackIn_74_2 + 44 + param3 + 44 + param4 + 44 + param5 + 41);
        }
    }

    final static void a(byte param0, byte[] param1) {
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        byte[] var8 = null;
        byte[] var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        wf var16 = null;
        wf var17 = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        byte[] var22 = null;
        byte[] var23 = null;
        byte[] var24 = null;
        byte[] var25 = null;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackIn_44_0 = 0;
        int stackIn_45_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        RuntimeException stackIn_51_0 = null;
        StringBuilder stackIn_51_1 = null;
        RuntimeException stackIn_52_0 = null;
        StringBuilder stackIn_52_1 = null;
        RuntimeException stackIn_53_0 = null;
        StringBuilder stackIn_53_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_43_0 = 0;
        int stackOut_45_0 = 0;
        int stackOut_45_1 = 0;
        int stackOut_44_0 = 0;
        int stackOut_44_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        RuntimeException stackOut_50_0 = null;
        StringBuilder stackOut_50_1 = null;
        RuntimeException stackOut_52_0 = null;
        StringBuilder stackOut_52_1 = null;
        String stackOut_52_2 = null;
        RuntimeException stackOut_51_0 = null;
        StringBuilder stackOut_51_1 = null;
        String stackOut_51_2 = null;
        var15 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            var16 = new wf(param1);
            var17 = var16;
            var17.field_h = param1.length - 2;
            th.field_t = var17.b(-1698573656);
            mg.field_x = new int[th.field_t];
            hl.field_o = new byte[th.field_t][];
            me.field_w = new boolean[th.field_t];
            rg.field_c = new int[th.field_t];
            pb.field_h = new int[th.field_t];
            be.field_f = new byte[th.field_t][];
            bd.field_m = new int[th.field_t];
            var17.field_h = -(8 * th.field_t) + -7 + param1.length;
            uc.field_fb = var17.b(-1698573656);
            eh.field_b = var17.b(-1698573656);
            var3 = (var17.d(true) & 255) + 1;
            var4 = 0;
            L1: while (true) {
              if (th.field_t <= var4) {
                var4 = 0;
                L2: while (true) {
                  if (th.field_t <= var4) {
                    var4 = 0;
                    L3: while (true) {
                      if (th.field_t <= var4) {
                        var4 = 0;
                        L4: while (true) {
                          if (var4 >= th.field_t) {
                            var17.field_h = -(th.field_t * 8) + -7 + (param1.length - 3 * (var3 - 1));
                            ci.field_b = new int[var3];
                            var4 = 1;
                            L5: while (true) {
                              if (var4 >= var3) {
                                var17.field_h = 0;
                                var4 = 0;
                                L6: while (true) {
                                  if (var4 >= th.field_t) {
                                    break L0;
                                  } else {
                                    L7: {
                                      var5 = pb.field_h[var4];
                                      var6 = bd.field_m[var4];
                                      var7 = var6 * var5;
                                      var24 = new byte[var7];
                                      var22 = var24;
                                      var20 = var22;
                                      var18 = var20;
                                      var8 = var18;
                                      be.field_f[var4] = var24;
                                      var25 = new byte[var7];
                                      var23 = var25;
                                      var21 = var23;
                                      var19 = var21;
                                      var9 = var19;
                                      hl.field_o[var4] = var25;
                                      var10 = 0;
                                      var11 = var17.d(true);
                                      if ((var11 & 1) != 0) {
                                        var12 = 0;
                                        L8: while (true) {
                                          if (var12 >= var5) {
                                            if ((2 & var11) == 0) {
                                              break L7;
                                            } else {
                                              var12 = 0;
                                              L9: while (true) {
                                                if (var12 >= var5) {
                                                  break L7;
                                                } else {
                                                  var13 = 0;
                                                  L10: while (true) {
                                                    if (var6 <= var13) {
                                                      var12++;
                                                      continue L9;
                                                    } else {
                                                      L11: {
                                                        byte dupTemp$2 = var17.e(true);
                                                        var9[var5 * var13 + var12] = dupTemp$2;
                                                        var14 = dupTemp$2;
                                                        stackOut_43_0 = var10;
                                                        stackIn_45_0 = stackOut_43_0;
                                                        stackIn_44_0 = stackOut_43_0;
                                                        if (-1 == var14) {
                                                          stackOut_45_0 = stackIn_45_0;
                                                          stackOut_45_1 = 0;
                                                          stackIn_46_0 = stackOut_45_0;
                                                          stackIn_46_1 = stackOut_45_1;
                                                          break L11;
                                                        } else {
                                                          stackOut_44_0 = stackIn_44_0;
                                                          stackOut_44_1 = 1;
                                                          stackIn_46_0 = stackOut_44_0;
                                                          stackIn_46_1 = stackOut_44_1;
                                                          break L11;
                                                        }
                                                      }
                                                      var10 = stackIn_46_0 | stackIn_46_1;
                                                      var13++;
                                                      continue L10;
                                                    }
                                                  }
                                                }
                                              }
                                            }
                                          } else {
                                            var13 = 0;
                                            L12: while (true) {
                                              if (var6 <= var13) {
                                                var12++;
                                                continue L8;
                                              } else {
                                                var8[var12 + var13 * var5] = var17.e(true);
                                                var13++;
                                                continue L12;
                                              }
                                            }
                                          }
                                        }
                                      } else {
                                        var12 = 0;
                                        L13: while (true) {
                                          if (var12 >= var7) {
                                            if ((2 & var11) != 0) {
                                              var12 = 0;
                                              L14: while (true) {
                                                if (var12 >= var7) {
                                                  break L7;
                                                } else {
                                                  L15: {
                                                    byte dupTemp$3 = var17.e(true);
                                                    var9[var12] = dupTemp$3;
                                                    var13 = dupTemp$3;
                                                    stackOut_28_0 = var10;
                                                    stackIn_30_0 = stackOut_28_0;
                                                    stackIn_29_0 = stackOut_28_0;
                                                    if (var13 == -1) {
                                                      stackOut_30_0 = stackIn_30_0;
                                                      stackOut_30_1 = 0;
                                                      stackIn_31_0 = stackOut_30_0;
                                                      stackIn_31_1 = stackOut_30_1;
                                                      break L15;
                                                    } else {
                                                      stackOut_29_0 = stackIn_29_0;
                                                      stackOut_29_1 = 1;
                                                      stackIn_31_0 = stackOut_29_0;
                                                      stackIn_31_1 = stackOut_29_1;
                                                      break L15;
                                                    }
                                                  }
                                                  var10 = stackIn_31_0 | stackIn_31_1;
                                                  var12++;
                                                  continue L14;
                                                }
                                              }
                                            } else {
                                              break L7;
                                            }
                                          } else {
                                            var8[var12] = var17.e(true);
                                            var12++;
                                            continue L13;
                                          }
                                        }
                                      }
                                    }
                                    me.field_w[var4] = var10 != 0;
                                    var4++;
                                    continue L6;
                                  }
                                }
                              } else {
                                L16: {
                                  ci.field_b[var4] = var17.a(84);
                                  if (ci.field_b[var4] != 0) {
                                    break L16;
                                  } else {
                                    ci.field_b[var4] = 1;
                                    break L16;
                                  }
                                }
                                var4++;
                                continue L5;
                              }
                            }
                          } else {
                            bd.field_m[var4] = var17.b(-1698573656);
                            var4++;
                            continue L4;
                          }
                        }
                      } else {
                        pb.field_h[var4] = var17.b(-1698573656);
                        var4++;
                        continue L3;
                      }
                    }
                  } else {
                    rg.field_c[var4] = var17.b(-1698573656);
                    var4++;
                    continue L2;
                  }
                }
              } else {
                mg.field_x[var4] = var16.b(-1698573656);
                var4++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L17: {
            var2 = decompiledCaughtException;
            stackOut_50_0 = (RuntimeException) var2;
            stackOut_50_1 = new StringBuilder().append("gf.A(").append(106).append(44);
            stackIn_52_0 = stackOut_50_0;
            stackIn_52_1 = stackOut_50_1;
            stackIn_51_0 = stackOut_50_0;
            stackIn_51_1 = stackOut_50_1;
            if (param1 == null) {
              stackOut_52_0 = (RuntimeException) (Object) stackIn_52_0;
              stackOut_52_1 = (StringBuilder) (Object) stackIn_52_1;
              stackOut_52_2 = "null";
              stackIn_53_0 = stackOut_52_0;
              stackIn_53_1 = stackOut_52_1;
              stackIn_53_2 = stackOut_52_2;
              break L17;
            } else {
              stackOut_51_0 = (RuntimeException) (Object) stackIn_51_0;
              stackOut_51_1 = (StringBuilder) (Object) stackIn_51_1;
              stackOut_51_2 = "{...}";
              stackIn_53_0 = stackOut_51_0;
              stackIn_53_1 = stackOut_51_1;
              stackIn_53_2 = stackOut_51_2;
              break L17;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_53_0, stackIn_53_2 + 41);
        }
    }

    final static db a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        db var6 = new db(param1, param1);
        db var3 = var6;
        for (var4 = 0; var4 < var3.field_y.length; var4++) {
            var6.field_y[var4] = param2;
        }
        return var3;
    }

    final void a(int param0, byte param1, int param2) {
        ((gf) this).field_l = param0;
        if (param1 != -65) {
            return;
        }
        ((gf) this).field_f = param2;
    }

    private gf() throws Throwable {
        throw new Error();
    }

    final static java.net.URL a(int param0, java.net.URL param1, java.applet.Applet param2) {
        Object var3 = null;
        Object var4 = null;
        java.net.URL stackIn_7_0 = null;
        Object stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        Object stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        Object stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_11_2 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        Object stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        Object stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_6_0 = null;
        Object stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        Object stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        Object stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        String stackOut_9_2 = null;
        Object stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        Object stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        Object stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            L1: {
              var3 = null;
              if (mb.field_a == null) {
                break L1;
              } else {
                if (mb.field_a.equals((Object) (Object) param2.getParameter("settings"))) {
                  break L1;
                } else {
                  var3 = (Object) (Object) mb.field_a;
                  var4 = var3;
                  var4 = var3;
                  break L1;
                }
              }
            }
            L2: {
              var4 = null;
              if (null == ta.field_d) {
                break L2;
              } else {
                if (ta.field_d.equals((Object) (Object) param2.getParameter("session"))) {
                  break L2;
                } else {
                  var4 = (Object) (Object) ta.field_d;
                  break L2;
                }
              }
            }
            stackOut_6_0 = rf.a(-1, param1, (String) var4, 0, (String) var3);
            stackIn_7_0 = stackOut_6_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var3 = (Object) (Object) decompiledCaughtException;
            stackOut_8_0 = var3;
            stackOut_8_1 = new StringBuilder().append("gf.K(").append(3).append(44);
            stackIn_10_0 = stackOut_8_0;
            stackIn_10_1 = stackOut_8_1;
            stackIn_9_0 = stackOut_8_0;
            stackIn_9_1 = stackOut_8_1;
            if (param1 == null) {
              stackOut_10_0 = stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "null";
              stackIn_11_0 = stackOut_10_0;
              stackIn_11_1 = stackOut_10_1;
              stackIn_11_2 = stackOut_10_2;
              break L3;
            } else {
              stackOut_9_0 = stackIn_9_0;
              stackOut_9_1 = (StringBuilder) (Object) stackIn_9_1;
              stackOut_9_2 = "{...}";
              stackIn_11_0 = stackOut_9_0;
              stackIn_11_1 = stackOut_9_1;
              stackIn_11_2 = stackOut_9_2;
              break L3;
            }
          }
          L4: {
            stackOut_11_0 = stackIn_11_0;
            stackOut_11_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_11_2).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param2 == null) {
              stackOut_13_0 = stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_12_0 = stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L4;
            }
          }
          throw ld.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_7_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Unpacking graphics";
    }
}
