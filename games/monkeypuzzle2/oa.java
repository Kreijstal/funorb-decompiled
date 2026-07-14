/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oa extends jk {
    static pj field_J;
    static String field_E;
    static int field_G;
    static ai[] field_D;
    static int field_H;
    static String field_F;
    static boolean field_I;

    public static void a(boolean param0) {
        if (param0) {
          oa.a(false);
          field_J = null;
          field_E = null;
          field_D = null;
          field_F = null;
          return;
        } else {
          field_J = null;
          field_E = null;
          field_D = null;
          field_F = null;
          return;
        }
    }

    private oa(int param0, int param1, int param2, int param3, ml param4, of param5, we param6) {
        super(param0, param1, param2, param3, param4, param5);
        ((oa) this).field_v = param6;
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int var7 = 0;
            int stackIn_9_0 = 0;
            int stackIn_17_0 = 0;
            int stackIn_21_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_15_0 = 0;
            int stackOut_16_0 = 0;
            int stackOut_19_0 = 0;
            int stackOut_20_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var7 = MonkeyPuzzle2.field_F ? 1 : 0;
                        if (field_I) {
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
                            var3 = (String) mf.a(-26159, "getcookies", param1);
                            var4 = ma.a(126, ';', var3);
                            var5 = 0;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (var4.length <= var5) {
                                statePc = 13;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var6 = var4[var5].indexOf('=');
                            if (-1 < (var6 ^ -1)) {
                                statePc = 10;
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
                            if (var4[var5].substring(0, var6).trim().equals((Object) (Object) var2)) {
                                statePc = 8;
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
                            statePc = 10;
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
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2_ref = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param0 >= -120) {
                            statePc = 18;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (null == param1.getParameter("tuhstatbut")) {
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
                    case 18: {
                        field_D = null;
                        if (null == param1.getParameter("tuhstatbut")) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackOut_19_0 = 1;
                        stackIn_21_0 = stackOut_19_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 20: {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        return stackIn_21_0 != 0;
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

    final void a(int param0, int param1, we param2, int param3, int param4, int param5) {
        ee var7 = null;
        super.a(param0, param1, param2, param3, param4 ^ param4, param5);
        var7 = od.field_n;
        if (var7 != null) {
          if (((oa) this).a(param1, param0, param5, param3, (byte) 45)) {
            if (!(((oa) this).field_o instanceof tc)) {
              if (!(var7.field_o instanceof tc)) {
                return;
              } else {
                ((tc) (Object) var7.field_o).a((oa) this, (byte) -27, var7);
                od.field_n = null;
                return;
              }
            } else {
              ((tc) (Object) ((oa) this).field_o).a((oa) this, (byte) -27, var7);
              od.field_n = null;
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void a(float param0, float[] param1, int param2) {
        param1[1] = param1[1] * param0;
        if (param2 <= 104) {
          field_F = null;
          param1[0] = param1[0] * param0;
          return;
        } else {
          param1[0] = param1[0] * param0;
          return;
        }
    }

    final static void j(int param0) {
        int var1 = 0;
        Object var2 = null;
        ki var2_ref = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        il var7 = null;
        int stackIn_20_0 = 0;
        int stackIn_73_0 = 0;
        int stackIn_95_0 = 0;
        int stackOut_94_0 = 0;
        int stackOut_93_0 = 0;
        int stackOut_72_0 = 0;
        int stackOut_71_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_13_0 = 0;
        var2 = null;
        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        var1 = 0;
        var2_ref = (ki) (Object) ok.field_a.a((byte) -117);
        L0: while (true) {
          if (var2_ref == null) {
            var2_int = 0;
            L1: while (true) {
              if (-4 >= (var2_int ^ -1)) {
                var2_ref = (ki) (Object) ok.field_a.a((byte) -117);
                if (param0 <= -79) {
                  L2: while (true) {
                    if (var2_ref != null) {
                      var2_ref.d((byte) 116);
                      var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                      continue L2;
                    } else {
                      var2_ref = (ki) (Object) ok.field_a.a((byte) -117);
                      L3: while (true) {
                        if (var2_ref == null) {
                          vl.field_j = var1 != 0;
                          return;
                        } else {
                          L4: {
                            var2_ref.f(-7);
                            if (var2_ref.field_q - (float)var2_ref.field_y > (float)(hf.field_f.field_k + -90)) {
                              L5: {
                                if (vl.field_j) {
                                  hf.field_f.d(-115);
                                  vl.field_j = false;
                                  break L5;
                                } else {
                                  break L5;
                                }
                              }
                              var1 = 1;
                              break L4;
                            } else {
                              break L4;
                            }
                          }
                          L6: {
                            L7: {
                              if ((var2_ref.field_w ^ -1) == -2) {
                                break L7;
                              } else {
                                if (6 == var2_ref.field_w) {
                                  break L7;
                                } else {
                                  if (var2_ref.field_w == 5) {
                                    break L7;
                                  } else {
                                    if (var2_ref.field_w != 0) {
                                      break L6;
                                    } else {
                                      break L7;
                                    }
                                  }
                                }
                              }
                            }
                            if (!pa.a(var2_ref.field_I, (int)(var2_ref.field_B + (float)var2_ref.field_G), (int)var2_ref.field_q + var2_ref.field_y, sb.field_m, 80, 0)) {
                              break L6;
                            } else {
                              L8: {
                                if (!jj.a(-32680, var2_ref, -80 + (var2_ref.field_G + (int)var2_ref.field_B), var2_ref.field_y + (int)var2_ref.field_q)) {
                                  stackOut_94_0 = 0;
                                  stackIn_95_0 = stackOut_94_0;
                                  break L8;
                                } else {
                                  stackOut_93_0 = 1;
                                  stackIn_95_0 = stackOut_93_0;
                                  break L8;
                                }
                              }
                              var3 = stackIn_95_0;
                              var2_ref.field_x = var2_ref.field_x | var3 != 0;
                              var2_ref.c((byte) -114);
                              var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                              continue L3;
                            }
                          }
                          if (var2_ref.field_w != 3) {
                            var2_ref.c((byte) -114);
                            var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                            continue L3;
                          } else {
                            if (-2 != (var2_ref.field_n ^ -1)) {
                              var2_ref.c((byte) -114);
                              var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                              continue L3;
                            } else {
                              if ((var2_ref.field_C ^ -1) >= -5) {
                                var2_ref.c((byte) -114);
                                var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                                continue L3;
                              } else {
                                var2_ref.field_t = ri.field_b;
                                var2_ref.c((byte) -114);
                                var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                                continue L3;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                } else {
                  oa.a(true);
                  L9: while (true) {
                    if (var2_ref == null) {
                      var2_ref = (ki) (Object) ok.field_a.a((byte) -117);
                      L10: while (true) {
                        if (var2_ref == null) {
                          vl.field_j = var1 != 0;
                          return;
                        } else {
                          L11: {
                            var2_ref.f(-7);
                            if (var2_ref.field_q - (float)var2_ref.field_y > (float)(hf.field_f.field_k + -90)) {
                              L12: {
                                if (vl.field_j) {
                                  hf.field_f.d(-115);
                                  vl.field_j = false;
                                  break L12;
                                } else {
                                  break L12;
                                }
                              }
                              var1 = 1;
                              break L11;
                            } else {
                              break L11;
                            }
                          }
                          L13: {
                            L14: {
                              if ((var2_ref.field_w ^ -1) == -2) {
                                break L14;
                              } else {
                                if (6 == var2_ref.field_w) {
                                  break L14;
                                } else {
                                  if (var2_ref.field_w == 5) {
                                    break L14;
                                  } else {
                                    if (var2_ref.field_w == 0) {
                                      break L14;
                                    } else {
                                      if (var2_ref.field_w != 3) {
                                        break L13;
                                      } else {
                                        if (-2 != (var2_ref.field_n ^ -1)) {
                                          break L13;
                                        } else {
                                          if ((var2_ref.field_C ^ -1) >= -5) {
                                            break L13;
                                          } else {
                                            var2_ref.field_t = ri.field_b;
                                            break L13;
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                            if (pa.a(var2_ref.field_I, (int)(var2_ref.field_B + (float)var2_ref.field_G), (int)var2_ref.field_q + var2_ref.field_y, sb.field_m, 80, 0)) {
                              L15: {
                                if (!jj.a(-32680, var2_ref, -80 + (var2_ref.field_G + (int)var2_ref.field_B), var2_ref.field_y + (int)var2_ref.field_q)) {
                                  stackOut_72_0 = 0;
                                  stackIn_73_0 = stackOut_72_0;
                                  break L15;
                                } else {
                                  stackOut_71_0 = 1;
                                  stackIn_73_0 = stackOut_71_0;
                                  break L15;
                                }
                              }
                              var3 = stackIn_73_0;
                              var2_ref.field_x = var2_ref.field_x | var3 != 0;
                              break L13;
                            } else {
                              if (var2_ref.field_w != 3) {
                                break L13;
                              } else {
                                if (-2 != (var2_ref.field_n ^ -1)) {
                                  break L13;
                                } else {
                                  if ((var2_ref.field_C ^ -1) >= -5) {
                                    break L13;
                                  } else {
                                    var2_ref.field_t = ri.field_b;
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          var2_ref.c((byte) -114);
                          var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                          continue L10;
                        }
                      }
                    } else {
                      var2_ref.d((byte) 116);
                      var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
                      continue L9;
                    }
                  }
                }
              } else {
                var7 = (il) (Object) rf.field_a.a((byte) -117);
                L16: while (true) {
                  if (var7 == null) {
                    var2_int++;
                    var2_int++;
                    continue L1;
                  } else {
                    var7.e(5);
                    var7 = (il) (Object) rf.field_a.d((byte) 63);
                    continue L16;
                  }
                }
              }
            }
          } else {
            L17: {
              if (qb.field_b) {
                if (2 != var2_ref.field_w) {
                  if (-4 == (var2_ref.field_w ^ -1)) {
                    h.a(4, true);
                    break L17;
                  } else {
                    if (var2_ref.field_w != 5) {
                      if (6 != var2_ref.field_w) {
                        break L17;
                      } else {
                        h.a(1, true);
                        break L17;
                      }
                    } else {
                      h.a(2, true);
                      break L17;
                    }
                  }
                } else {
                  h.a(3, true);
                  break L17;
                }
              } else {
                break L17;
              }
            }
            L18: {
              if (var2_ref.field_w == 6) {
                if (!var2_ref.field_j) {
                  if (!var2_ref.field_x) {
                    stackOut_18_0 = 1;
                    stackIn_20_0 = stackOut_18_0;
                    break L18;
                  } else {
                    stackOut_17_0 = 0;
                    stackIn_20_0 = stackOut_17_0;
                    break L18;
                  }
                } else {
                  stackOut_15_0 = 0;
                  stackIn_20_0 = stackOut_15_0;
                  break L18;
                }
              } else {
                stackOut_13_0 = 0;
                stackIn_20_0 = stackOut_13_0;
                break L18;
              }
            }
            L19: {
              L20: {
                var3 = stackIn_20_0;
                var2_ref.g(122);
                if (var3 == 0) {
                  break L20;
                } else {
                  if (var2_ref.field_j) {
                    break L20;
                  } else {
                    if (-1 <= var2_ref.field_m) {
                      break L20;
                    } else {
                      var4 = 0;
                      var5 = 0;
                      L21: while (true) {
                        L22: {
                          if (var2_ref.field_m <= var5) {
                            break L22;
                          } else {
                            if (-5 == var2_ref.field_o[var5].field_w) {
                              var5++;
                              continue L21;
                            } else {
                              var4 = 1;
                              break L22;
                            }
                          }
                        }
                        if (var4 != 0) {
                          var2_ref.field_q = var2_ref.field_q + 2.0f;
                          break L19;
                        } else {
                          var2_ref.field_t = hd.field_u;
                          break L19;
                        }
                      }
                    }
                  }
                }
              }
              if (!var2_ref.field_x) {
                break L19;
              } else {
                if (var2_ref.field_w != 6) {
                  break L19;
                } else {
                  if (var2_ref.field_m == 0) {
                    var2_ref.field_t = hd.field_u;
                    break L19;
                  } else {
                    break L19;
                  }
                }
              }
            }
            var2_ref = (ki) (Object) ok.field_a.d((byte) 63);
            continue L0;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_J = new pj();
        field_G = -1;
        field_E = "Enter the name you'd prefer. This is the name displayed to other players.";
        field_F = "Please try again in a few minutes.";
    }
}
