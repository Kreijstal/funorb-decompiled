/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class la extends ca {
    static bd field_e;
    static String field_i;
    private String field_j;
    static int field_g;
    static bd field_h;
    private String field_f;

    final static void a(int param0, String param1, byte param2) {
        int var3 = 0;
        rj.field_K = false;
        if (param2 >= 41) {
          eh.field_e = false;
          if (null != jj.field_d) {
            if (jj.field_d.field_F) {
              L0: {
                var3 = 1;
                if (8 != param0) {
                  break L0;
                } else {
                  L1: {
                    if (li.field_o) {
                      param1 = ti.field_i;
                      break L1;
                    } else {
                      param1 = de.field_m;
                      break L1;
                    }
                  }
                  param0 = 2;
                  ib.field_e.a(rf.field_e, 10000536);
                  break L0;
                }
              }
              L2: {
                if (10 == param0) {
                  var3 = 0;
                  fe.a(true);
                  break L2;
                } else {
                  break L2;
                }
              }
              L3: {
                if (var3 == 0) {
                  break L3;
                } else {
                  L4: {
                    if (rj.field_K) {
                      param1 = vg.a(new String[1], 21, ck.field_o);
                      break L4;
                    } else {
                      break L4;
                    }
                  }
                  L5: {
                    if (md.field_i) {
                      param1 = jm.field_h;
                      break L5;
                    } else {
                      break L5;
                    }
                  }
                  jj.field_d.a(param0, 17, param1);
                  break L3;
                }
              }
              if (-257 != (param0 ^ -1)) {
                if (param0 != 10) {
                  if (!li.field_o) {
                    ib.field_e.a(false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        } else {
          field_h = null;
          eh.field_e = false;
          if (null != jj.field_d) {
            if (jj.field_d.field_F) {
              L6: {
                var3 = 1;
                if (8 != param0) {
                  break L6;
                } else {
                  L7: {
                    if (li.field_o) {
                      param1 = ti.field_i;
                      break L7;
                    } else {
                      param1 = de.field_m;
                      break L7;
                    }
                  }
                  param0 = 2;
                  ib.field_e.a(rf.field_e, 10000536);
                  break L6;
                }
              }
              L8: {
                if (10 == param0) {
                  var3 = 0;
                  fe.a(true);
                  break L8;
                } else {
                  break L8;
                }
              }
              L9: {
                if (var3 == 0) {
                  break L9;
                } else {
                  L10: {
                    if (rj.field_K) {
                      param1 = vg.a(new String[1], 21, ck.field_o);
                      break L10;
                    } else {
                      break L10;
                    }
                  }
                  L11: {
                    if (md.field_i) {
                      param1 = jm.field_h;
                      break L11;
                    } else {
                      break L11;
                    }
                  }
                  jj.field_d.a(param0, 17, param1);
                  break L9;
                }
              }
              if (-257 != (param0 ^ -1)) {
                if (param0 != 10) {
                  if (!li.field_o) {
                    ib.field_e.a(false);
                    return;
                  } else {
                    return;
                  }
                } else {
                  return;
                }
              } else {
                return;
              }
            } else {
              return;
            }
          } else {
            return;
          }
        }
    }

    final static boolean a(java.applet.Applet param0, int param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            int stackOut_9_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = HostileSpawn.field_I ? 1 : 0;
                        if (al.field_T) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return true;
                    }
                    case 3: {
                        try {
                            var2 = "tuhstatbut";
                            var3 = (String) a.a("getcookies", param0, param1 + -10419);
                            var4 = cj.a(var3, -44, ';');
                            if (param1 == 10295) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            la.b(-103);
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var5 = 0;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 14;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 11;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (!var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 11;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = 1;
                            stackIn_10_0 = stackOut_9_0;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return stackIn_10_0 != 0;
                    }
                    case 11: {
                        try {
                            var5++;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref = caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (param0.getParameter("tuhstatbut") == null) {
                            statePc = 16;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 1;
                        stackIn_17_0 = stackOut_15_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 16: {
                        stackOut_16_0 = 0;
                        stackIn_17_0 = stackOut_16_0;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        return stackIn_17_0 != 0;
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

    final static void b(int param0) {
        if (param0 == 19659) {
          if (uj.field_m == null) {
            if (eb.field_e != null) {
              eb.field_e.h();
              return;
            } else {
              return;
            }
          } else {
            uj.field_m.h();
            if (eb.field_e == null) {
              return;
            } else {
              eb.field_e.h();
              return;
            }
          }
        } else {
          return;
        }
    }

    final void a(vi param0, int param1) {
        param0.a(120, ((la) this).field_j);
        if (param1 >= -94) {
          field_g = -36;
          param0.a((byte) -119, ((la) this).field_f);
          return;
        } else {
          param0.a((byte) -119, ((la) this).field_f);
          return;
        }
    }

    final static void a(int param0, int param1) {
        Object var3 = null;
        kb.field_b = de.field_k[param1];
        u.field_j = gg.field_C[param1];
        if (param0 != -29828) {
          var3 = null;
          boolean discarded$2 = la.a((java.applet.Applet) null, 68);
          ad.field_b = gm.field_k[param1];
          return;
        } else {
          ad.field_b = gm.field_k[param1];
          return;
        }
    }

    final static void a(int param0, int param1, pg param2, int param3, int param4, int param5) {
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
        L0: {
          var21 = HostileSpawn.field_I ? 1 : 0;
          var6 = (param0 - param4 << -750320120) / param2.field_i;
          var7 = (param4 << -469219640) - -(var6 * param2.field_c);
          param5 = param5 + param2.field_b;
          param3 = param3 + param2.field_c;
          var8 = si.field_e * param5 + param3;
          var9 = 0;
          var10 = param2.field_f;
          var11 = param2.field_a;
          var12 = -var11 + si.field_e;
          if (param5 < si.field_j) {
            var14 = si.field_j - param5;
            var10 = var10 - var14;
            var9 = var9 + var14 * var11;
            param5 = si.field_j;
            var8 = var8 + var14 * si.field_e;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          var13 = 0;
          if (si.field_a < var10 + param5) {
            var10 = var10 - (-si.field_a + (param5 - -var10));
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param3 < si.field_b) {
            var14 = si.field_b - param3;
            param3 = si.field_b;
            var11 = var11 - var14;
            var12 = var12 + var14;
            var7 = var7 + var14 * var6;
            var13 = var13 + var14;
            var9 = var9 + var14;
            var8 = var8 + var14;
            break L2;
          } else {
            break L2;
          }
        }
        L3: {
          if (si.field_l < var11 + param3) {
            var14 = -si.field_l + (param3 - -var11);
            var12 = var12 + var14;
            var11 = var11 - var14;
            var13 = var13 + var14;
            break L3;
          } else {
            break L3;
          }
        }
        if (0 < var11) {
          if ((var10 ^ -1) >= -1) {
            return;
          } else {
            var14 = 75 / ((45 - param1) / 60);
            param5 = -var10;
            L4: while (true) {
              if (0 <= param5) {
                return;
              } else {
                var15 = var7;
                param3 = -var11;
                L5: while (true) {
                  if (0 <= param3) {
                    var8 = var8 + var12;
                    var9 = var9 + var13;
                    param5++;
                    continue L4;
                  } else {
                    var16 = var15 >> -1103182872;
                    var15 = var15 + var6;
                    var17 = 256 + -var16;
                    if (var16 < 0) {
                      var9++;
                      var8++;
                      param3++;
                      continue L5;
                    } else {
                      var9++;
                      var18 = param2.field_k[255 & param2.field_j[var9]];
                      if (var18 != 0) {
                        if (-256 > (var16 ^ -1)) {
                          si.field_i[var8] = var18;
                          var8++;
                          param3++;
                          continue L5;
                        } else {
                          var19 = si.field_i[var8];
                          var20 = var16 * (var18 & 16711935) + var17 * (var19 & 16711935) >> -81417368 & 16711935;
                          si.field_i[var8] = var20 - -(ua.a(16711749, var16 * ua.a(65280, var18) + ua.a(var19, 65280) * var17) >> 2095813768);
                          var8++;
                          param3++;
                          continue L5;
                        }
                      } else {
                        var8++;
                        param3++;
                        continue L5;
                      }
                    }
                  }
                }
              }
            }
          }
        } else {
          return;
        }
    }

    final bl a(boolean param0) {
        if (param0) {
            field_i = null;
            return uk.field_a;
        }
        return uk.field_a;
    }

    final static int a(int param0, boolean param1) {
        if (param1) {
            field_h = null;
            return ge.field_d[2047 & param0];
        }
        return ge.field_d[2047 & param0];
    }

    final static s b(boolean param0) {
        if (param0) {
          field_h = null;
          return new s(jm.a((byte) 93), hm.c(8));
        } else {
          return new s(jm.a((byte) 93), hm.c(8));
        }
    }

    public static void a(byte param0) {
        field_e = null;
        if (param0 != -62) {
            field_h = null;
            field_h = null;
            field_i = null;
            return;
        }
        field_h = null;
        field_i = null;
    }

    la(String param0, String param1) {
        ((la) this).field_f = param1;
        ((la) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "If you have an account, log in to start at any level you've reached.";
    }
}
