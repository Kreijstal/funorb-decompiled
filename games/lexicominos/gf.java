/*
 * Decompiled by CFR-JS 0.4.0.
 */
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
                if ((((gf) this).field_f ^ -1) < -1) {
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
            ((gf) this).field_n = ((gf) this).field_n - 1;
            if ((((gf) this).field_n - 1 ^ -1) < param0) {
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

    public static void b(int param0) {
        if (param0 >= -46) {
            field_q = null;
        }
        field_q = null;
    }

    final static boolean a(int param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_7_0 = 0;
            int stackIn_14_0 = 0;
            int stackOut_6_0 = 0;
            int stackOut_12_0 = 0;
            int stackOut_13_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = Lexicominos.field_L ? 1 : 0;
                        if (!pf.field_m) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        return true;
                    }
                    case 2: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) oa.a(true, param1, "getcookies");
                            var4 = dc.a(var3, ';', (byte) -125);
                            var5 = param0;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (var5 >= var4.length) {
                                statePc = 11;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if ((var6 ^ -1) > -1) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 8;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            stackOut_6_0 = 1;
                            stackIn_7_0 = stackOut_6_0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return stackIn_7_0 != 0;
                    }
                    case 8: {
                        try {
                            var5++;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2_ref = caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 13;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        stackOut_12_0 = 1;
                        stackIn_14_0 = stackOut_12_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 13: {
                        stackOut_13_0 = 0;
                        stackIn_14_0 = stackOut_13_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
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
            if (-1 <= (((gf) this).field_f ^ -1)) {
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
        int var6 = 0;
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
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_18_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_16_0 = 0;
        var22 = Lexicominos.field_L ? 1 : 0;
        if (param2 == null) {
          return;
        } else {
          if (-1 <= (param3 ^ -1)) {
            return;
          } else {
            if ((param1 ^ -1) < -1) {
              L0: {
                if (param2[3] == null) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L0;
                } else {
                  stackOut_7_0 = param2[3].field_r;
                  stackIn_9_0 = stackOut_7_0;
                  break L0;
                }
              }
              L1: {
                var6 = stackIn_9_0;
                if (null == param2[5]) {
                  stackOut_11_0 = 0;
                  stackIn_12_0 = stackOut_11_0;
                  break L1;
                } else {
                  stackOut_10_0 = param2[5].field_r;
                  stackIn_12_0 = stackOut_10_0;
                  break L1;
                }
              }
              L2: {
                var7 = stackIn_12_0;
                if (null != param2[1]) {
                  stackOut_14_0 = param2[1].field_x;
                  stackIn_15_0 = stackOut_14_0;
                  break L2;
                } else {
                  stackOut_13_0 = 0;
                  stackIn_15_0 = stackOut_13_0;
                  break L2;
                }
              }
              L3: {
                var8 = stackIn_15_0;
                if (param2[7] == null) {
                  stackOut_17_0 = 0;
                  stackIn_18_0 = stackOut_17_0;
                  break L3;
                } else {
                  stackOut_16_0 = param2[7].field_x;
                  stackIn_18_0 = stackOut_16_0;
                  break L3;
                }
              }
              L4: {
                var9 = stackIn_18_0;
                var10 = param0 - -param3;
                var11 = param1 + param4;
                var12 = var6 + param0;
                var13 = -var7 + var10;
                var14 = var8 + param4;
                var15 = -var9 + var11;
                var16 = var12;
                var17 = var13;
                if (var16 > var17) {
                  var17 = param0 - -(var6 * param3 / (var7 + var6));
                  var16 = param0 - -(var6 * param3 / (var7 + var6));
                  break L4;
                } else {
                  break L4;
                }
              }
              L5: {
                var18 = var14;
                var19 = var15;
                lf.b(ji.field_a);
                if (var18 <= var19) {
                  break L5;
                } else {
                  var19 = param4 - -(param1 * var8 / (var9 + var8));
                  var18 = param4 - -(param1 * var8 / (var9 + var8));
                  break L5;
                }
              }
              L6: {
                if (null != param2[0]) {
                  lf.f(param0, param4, var16, var18);
                  param2[0].d(param0, param4);
                  lf.a(ji.field_a);
                  break L6;
                } else {
                  break L6;
                }
              }
              if (param5 > 77) {
                L7: {
                  if (param2[2] == null) {
                    break L7;
                  } else {
                    lf.f(var17, param4, var10, var18);
                    param2[2].d(var13, param4);
                    lf.a(ji.field_a);
                    break L7;
                  }
                }
                L8: {
                  if (param2[6] == null) {
                    break L8;
                  } else {
                    lf.f(param0, var19, var16, var11);
                    param2[6].d(param0, var15);
                    lf.a(ji.field_a);
                    break L8;
                  }
                }
                L9: {
                  if (null == param2[8]) {
                    break L9;
                  } else {
                    lf.f(var17, var19, var10, var11);
                    param2[8].d(var13, var15);
                    lf.a(ji.field_a);
                    break L9;
                  }
                }
                L10: {
                  if (null == param2[1]) {
                    break L10;
                  } else {
                    if (0 == param2[1].field_r) {
                      break L10;
                    } else {
                      lf.f(var16, param4, var17, var18);
                      var20 = var12;
                      L11: while (true) {
                        L12: {
                          if (var20 >= var13) {
                            break L12;
                          } else {
                            param2[1].d(var20, param4);
                            var20 = var20 + param2[1].field_r;
                            if (0 == 0) {
                              continue L11;
                            } else {
                              break L12;
                            }
                          }
                        }
                        lf.a(ji.field_a);
                        break L10;
                      }
                    }
                  }
                }
                L13: {
                  if (null == param2[7]) {
                    break L13;
                  } else {
                    if (0 == param2[7].field_r) {
                      break L13;
                    } else {
                      lf.f(var16, var19, var17, var11);
                      var20 = var12;
                      L14: while (true) {
                        L15: {
                          if (var13 <= var20) {
                            break L15;
                          } else {
                            param2[7].d(var20, var15);
                            var20 = var20 + param2[7].field_r;
                            if (0 == 0) {
                              continue L14;
                            } else {
                              break L15;
                            }
                          }
                        }
                        lf.a(ji.field_a);
                        break L13;
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
                        L18: {
                          if (var20 >= var15) {
                            break L18;
                          } else {
                            param2[3].d(param0, var20);
                            var20 = var20 + param2[3].field_x;
                            if (0 == 0) {
                              continue L17;
                            } else {
                              break L18;
                            }
                          }
                        }
                        lf.a(ji.field_a);
                        break L16;
                      }
                    } else {
                      break L16;
                    }
                  }
                }
                L19: {
                  if (param2[5] == null) {
                    break L19;
                  } else {
                    if (param2[5].field_x == 0) {
                      break L19;
                    } else {
                      lf.f(var17, var18, var10, var19);
                      var20 = var14;
                      L20: while (true) {
                        L21: {
                          if (var20 >= var15) {
                            break L21;
                          } else {
                            param2[5].d(var13, var20);
                            var20 = var20 + param2[5].field_x;
                            if (0 == 0) {
                              continue L20;
                            } else {
                              break L21;
                            }
                          }
                        }
                        lf.a(ji.field_a);
                        break L19;
                      }
                    }
                  }
                }
                L22: {
                  if (param2[4] == null) {
                    break L22;
                  } else {
                    if (0 == param2[4].field_r) {
                      break L22;
                    } else {
                      if (param2[4].field_x == 0) {
                        break L22;
                      } else {
                        lf.f(var16, var18, var17, var19);
                        var20 = var14;
                        L23: while (true) {
                          L24: {
                            if (var20 >= var15) {
                              break L24;
                            } else {
                              var21 = var12;
                              L25: while (true) {
                                L26: {
                                  if (var21 >= var13) {
                                    break L26;
                                  } else {
                                    param2[4].d(var21, var20);
                                    var21 = var21 + param2[4].field_r;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L26;
                                    }
                                  }
                                }
                                var20 = var20 + param2[4].field_x;
                                if (0 == 0) {
                                  continue L23;
                                } else {
                                  break L24;
                                }
                              }
                            }
                          }
                          lf.a(ji.field_a);
                          break L22;
                        }
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              return;
            }
          }
        }
    }

    final static void a(byte param0, byte[] param1) {
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
        int stackIn_35_0 = 0;
        int stackIn_36_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_37_1 = 0;
        int stackIn_52_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_54_0 = 0;
        int stackIn_54_1 = 0;
        int stackOut_34_0 = 0;
        int stackOut_36_0 = 0;
        int stackOut_36_1 = 0;
        int stackOut_35_0 = 0;
        int stackOut_35_1 = 0;
        int stackOut_51_0 = 0;
        int stackOut_53_0 = 0;
        int stackOut_53_1 = 0;
        int stackOut_52_0 = 0;
        int stackOut_52_1 = 0;
        var15 = Lexicominos.field_L ? 1 : 0;
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
        L0: while (true) {
          L1: {
            if (th.field_t <= var4) {
              break L1;
            } else {
              mg.field_x[var4] = var16.b(-1698573656);
              var4++;
              if (0 == 0) {
                continue L0;
              } else {
                break L1;
              }
            }
          }
          var4 = 0;
          L2: while (true) {
            L3: {
              if (th.field_t <= var4) {
                break L3;
              } else {
                rg.field_c[var4] = var16.b(-1698573656);
                var4++;
                if (0 == 0) {
                  continue L2;
                } else {
                  break L3;
                }
              }
            }
            var4 = 0;
            L4: while (true) {
              L5: {
                if (th.field_t <= var4) {
                  break L5;
                } else {
                  pb.field_h[var4] = var16.b(param0 + -1698573762);
                  var4++;
                  if (0 == 0) {
                    continue L4;
                  } else {
                    break L5;
                  }
                }
              }
              L6: {
                if (param0 == 106) {
                  break L6;
                } else {
                  field_q = null;
                  break L6;
                }
              }
              var4 = 0;
              L7: while (true) {
                L8: {
                  if (var4 >= th.field_t) {
                    break L8;
                  } else {
                    bd.field_m[var4] = var16.b(-1698573656);
                    var4++;
                    if (0 == 0) {
                      continue L7;
                    } else {
                      break L8;
                    }
                  }
                }
                var17.field_h = -(th.field_t * 8) + -7 + (param1.length - 3 * (var3 - 1));
                ci.field_b = new int[var3];
                var4 = 1;
                L9: while (true) {
                  L10: {
                    if (var4 >= var3) {
                      break L10;
                    } else {
                      L11: {
                        ci.field_b[var4] = var16.a(84);
                        if (ci.field_b[var4] != 0) {
                          break L11;
                        } else {
                          ci.field_b[var4] = 1;
                          break L11;
                        }
                      }
                      var4++;
                      if (0 == 0) {
                        continue L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  var17.field_h = 0;
                  var4 = 0;
                  L12: while (true) {
                    L13: {
                      if (var4 >= th.field_t) {
                        break L13;
                      } else {
                        L14: {
                          L15: {
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
                              break L15;
                            } else {
                              var12 = 0;
                              L16: while (true) {
                                L17: {
                                  if (var12 >= var7) {
                                    break L17;
                                  } else {
                                    var8[var12] = var16.e(true);
                                    var12++;
                                    if (0 == 0) {
                                      continue L16;
                                    } else {
                                      break L17;
                                    }
                                  }
                                }
                                if ((2 & var11) != 0) {
                                  var12 = 0;
                                  L18: while (true) {
                                    L19: {
                                      if (var12 >= var7) {
                                        break L19;
                                      } else {
                                        L20: {
                                          var9[var12] = var16.e(true);
                                          var13 = var16.e(true);
                                          stackOut_34_0 = var10;
                                          stackIn_36_0 = stackOut_34_0;
                                          stackIn_35_0 = stackOut_34_0;
                                          if ((var13 ^ -1) == 0) {
                                            stackOut_36_0 = stackIn_36_0;
                                            stackOut_36_1 = 0;
                                            stackIn_37_0 = stackOut_36_0;
                                            stackIn_37_1 = stackOut_36_1;
                                            break L20;
                                          } else {
                                            stackOut_35_0 = stackIn_35_0;
                                            stackOut_35_1 = 1;
                                            stackIn_37_0 = stackOut_35_0;
                                            stackIn_37_1 = stackOut_35_1;
                                            break L20;
                                          }
                                        }
                                        var10 = stackIn_37_0 | stackIn_37_1;
                                        var12++;
                                        if (0 == 0) {
                                          continue L18;
                                        } else {
                                          break L19;
                                        }
                                      }
                                    }
                                    if (0 == 0) {
                                      break L14;
                                    } else {
                                      break L15;
                                    }
                                  }
                                } else {
                                  break L14;
                                }
                              }
                            }
                          }
                          var12 = 0;
                          L21: while (true) {
                            L22: {
                              if (var12 >= var5) {
                                break L22;
                              } else {
                                var13 = 0;
                                L23: while (true) {
                                  L24: {
                                    if (var6 <= var13) {
                                      break L24;
                                    } else {
                                      var8[var12 + var13 * var5] = var16.e(true);
                                      var13++;
                                      if (0 == 0) {
                                        continue L23;
                                      } else {
                                        break L24;
                                      }
                                    }
                                  }
                                  var12++;
                                  if (0 == 0) {
                                    continue L21;
                                  } else {
                                    break L22;
                                  }
                                }
                              }
                            }
                            if (-1 == (2 & var11 ^ -1)) {
                              break L14;
                            } else {
                              var12 = 0;
                              L25: while (true) {
                                if (var12 >= var5) {
                                  break L14;
                                } else {
                                  var13 = 0;
                                  L26: while (true) {
                                    L27: {
                                      if (var6 <= var13) {
                                        break L27;
                                      } else {
                                        L28: {
                                          var9[var5 * var13 + var12] = var16.e(true);
                                          var14 = var16.e(true);
                                          stackOut_51_0 = var10;
                                          stackIn_53_0 = stackOut_51_0;
                                          stackIn_52_0 = stackOut_51_0;
                                          if (-1 == var14) {
                                            stackOut_53_0 = stackIn_53_0;
                                            stackOut_53_1 = 0;
                                            stackIn_54_0 = stackOut_53_0;
                                            stackIn_54_1 = stackOut_53_1;
                                            break L28;
                                          } else {
                                            stackOut_52_0 = stackIn_52_0;
                                            stackOut_52_1 = 1;
                                            stackIn_54_0 = stackOut_52_0;
                                            stackIn_54_1 = stackOut_52_1;
                                            break L28;
                                          }
                                        }
                                        var10 = stackIn_54_0 | stackIn_54_1;
                                        var13++;
                                        if (0 == 0) {
                                          continue L26;
                                        } else {
                                          break L27;
                                        }
                                      }
                                    }
                                    var12++;
                                    if (0 == 0) {
                                      continue L25;
                                    } else {
                                      break L14;
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        me.field_w[var4] = var10 != 0;
                        var4++;
                        if (0 == 0) {
                          continue L12;
                        } else {
                          break L13;
                        }
                      }
                    }
                    return;
                  }
                }
              }
            }
          }
        }
    }

    final static db a(byte param0, int param1, int param2) {
        int var4 = 0;
        int var5 = Lexicominos.field_L ? 1 : 0;
        if (param0 != -76) {
            Object var6 = null;
            java.net.URL discarded$0 = gf.a(107, (java.net.URL) null, (java.applet.Applet) null);
        }
        db var7 = new db(param1, param1);
        db var3 = var7;
        for (var4 = 0; var4 < var3.field_y.length; var4++) {
            var7.field_y[var4] = param2;
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
        String var4 = null;
        String var3 = null;
        if (param0 != 3) {
            field_e = 14;
        }
        if (mb.field_a != null) {
            if (!mb.field_a.equals((Object) (Object) param2.getParameter("settings"))) {
                var3 = mb.field_a;
                var4 = var3;
                var4 = var3;
            }
        }
        var4 = null;
        if (null != ta.field_d) {
            if (!ta.field_d.equals((Object) (Object) param2.getParameter("session"))) {
                var4 = ta.field_d;
            }
        }
        return rf.a(-1, param1, var4, 0, var3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = "Unpacking graphics";
    }
}
