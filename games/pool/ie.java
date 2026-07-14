/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ie {
    static String field_c;
    static int[] field_d;
    static int field_g;
    static String field_i;
    static String field_e;
    static String field_b;
    static int field_h;
    static int[][] field_a;
    static jg field_f;

    final static void a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dd var6 = null;
        aa var7 = null;
        lk var8 = null;
        lk stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        lk stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        lk stackIn_25_0 = null;
        int stackIn_25_1 = 0;
        int stackIn_25_2 = 0;
        lk stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        lk stackOut_24_0 = null;
        int stackOut_24_1 = 0;
        int stackOut_24_2 = 0;
        lk stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        if (!ne.field_r.c(0)) {
          L0: {
            var3 = param0 ? 1 : 0;
            var4 = 0;
            var5 = 0;
            var6 = ((lk) (Object) ne.field_r.c((byte) 63)).field_n;
            if (var6 == null) {
              break L0;
            } else {
              param1 = param1 - (var6.field_A >> 1705922497);
              if (gg.field_f >= param1) {
                if (wn.field_i >= param2) {
                  if (230 + param2 >= wn.field_i) {
                    if (gg.field_f <= param1 - -var6.field_A) {
                      L1: {
                        if (eq.field_W != -1) {
                          var5 = -wn.field_i + eq.field_W;
                          break L1;
                        } else {
                          break L1;
                        }
                      }
                      eq.field_W = wn.field_i;
                      var3 = 1;
                      break L0;
                    } else {
                      eq.field_W = -1;
                      break L0;
                    }
                  } else {
                    eq.field_W = -1;
                    break L0;
                  }
                } else {
                  eq.field_W = -1;
                  break L0;
                }
              } else {
                eq.field_W = -1;
                break L0;
              }
            }
          }
          var7 = new aa(ne.field_r);
          var8 = (lk) (Object) var7.b((byte) -92);
          L2: while (true) {
            L3: {
              if (var8 == null) {
                break L3;
              } else {
                if (var4 >= 230) {
                  break L3;
                } else {
                  if (var8.field_n == null) {
                    var8.c(-1);
                    break L3;
                  } else {
                    L4: {
                      stackOut_22_0 = (lk) var8;
                      stackOut_22_1 = var8.field_p;
                      stackIn_24_0 = stackOut_22_0;
                      stackIn_24_1 = stackOut_22_1;
                      stackIn_23_0 = stackOut_22_0;
                      stackIn_23_1 = stackOut_22_1;
                      if (var3 != 0) {
                        stackOut_24_0 = (lk) (Object) stackIn_24_0;
                        stackOut_24_1 = stackIn_24_1;
                        stackOut_24_2 = var5;
                        stackIn_25_0 = stackOut_24_0;
                        stackIn_25_1 = stackOut_24_1;
                        stackIn_25_2 = stackOut_24_2;
                        break L4;
                      } else {
                        stackOut_23_0 = (lk) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = var8.field_q;
                        stackIn_25_0 = stackOut_23_0;
                        stackIn_25_1 = stackOut_23_1;
                        stackIn_25_2 = stackOut_23_2;
                        break L4;
                      }
                    }
                    L5: {
                      stackIn_25_0.field_p = stackIn_25_1 - stackIn_25_2;
                      if (var8.field_p >= -var8.field_n.field_z) {
                        break L5;
                      } else {
                        var8.field_l = var8.field_l - 1;
                        if (-1 == (var8.field_l - 1 ^ -1)) {
                          var8.a((byte) -117);
                          break L5;
                        } else {
                          var8.field_p = var8.field_p + (4 + var8.field_n.field_z);
                          break L5;
                        }
                      }
                    }
                    var4 = var8.field_l * (4 + var8.field_n.field_z) + var8.field_p;
                    var8 = (lk) (Object) var7.b(-86);
                    continue L2;
                  }
                }
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final static boolean a(byte param0, java.applet.Applet param1) {
        try {
            String var2 = null;
            Throwable var2_ref = null;
            String var3 = null;
            String[] var4 = null;
            int var5 = 0;
            int var6 = 0;
            int stackIn_9_0 = 0;
            int stackIn_16_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_14_0 = 0;
            int stackOut_15_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!iq.field_j) {
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
                            if (param0 == 28) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ie.a(true, true, -103, -121);
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
                            var2 = "tuhstatbut";
                            var3 = (String) mo.a((byte) -88, "getcookies", param1);
                            var4 = jc.a(30634, var3, ';');
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
                            if (var4.length <= var5) {
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
                        var2_ref = caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (param1.getParameter("tuhstatbut") == null) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        stackOut_14_0 = 1;
                        stackIn_16_0 = stackOut_14_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 15: {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
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

    final static void a(int param0, int[] param1, eg param2) {
        if (param0 != -2656) {
            ie.a(true, -83, -119);
        }
        d.a(param2, -23109);
        param1[0] = (int)Math.ceil((double)(param2.field_w + -param2.field_D) / ((double)nc.field_Y.length / 2.5));
        param1[1] = (int)Math.ceil((double)(param2.field_S + -param2.field_y) / ((double)nc.field_Y.length / 2.5));
        param1[2] = (int)Math.ceil((double)(param2.field_x + -param2.field_V) / ((double)nc.field_Y.length / 2.5));
        if (!(0 != param1[1])) {
            param1[1] = 1;
        }
        if (!(param1[2] != 0)) {
            param1[2] = 1;
        }
        if (!(param1[0] != 0)) {
            param1[0] = 1;
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(byte param0) {
        if (param0 != -13) {
            return;
        }
        field_i = null;
        field_c = null;
        field_b = null;
        field_a = null;
        field_f = null;
        field_e = null;
        field_d = null;
    }

    final static void a(int param0, boolean param1, int param2, int param3) {
        rg.a(tk.field_i, kj.field_j, param0, param1, param2 + 21166, ad.field_x, param3);
        if (param2 != -17156) {
            field_b = null;
        }
    }

    final static void a(boolean param0, boolean param1, int param2, int param3) {
        vh stackIn_4_0 = null;
        vh stackIn_5_0 = null;
        vh stackIn_6_0 = null;
        vh stackIn_7_0 = null;
        vh stackIn_8_0 = null;
        vh stackIn_9_0 = null;
        vh stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        vh stackIn_11_0 = null;
        vh stackIn_12_0 = null;
        vh stackIn_13_0 = null;
        vh stackIn_14_0 = null;
        vh stackIn_15_0 = null;
        vh stackIn_16_0 = null;
        vh stackIn_17_0 = null;
        int stackIn_17_1 = 0;
        vh stackIn_18_0 = null;
        vh stackIn_19_0 = null;
        vh stackIn_20_0 = null;
        vh stackIn_21_0 = null;
        vh stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        vh stackOut_3_0 = null;
        vh stackOut_4_0 = null;
        vh stackOut_5_0 = null;
        vh stackOut_6_0 = null;
        vh stackOut_7_0 = null;
        vh stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        vh stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        vh stackOut_10_0 = null;
        vh stackOut_11_0 = null;
        vh stackOut_12_0 = null;
        vh stackOut_13_0 = null;
        vh stackOut_14_0 = null;
        vh stackOut_15_0 = null;
        int stackOut_15_1 = 0;
        vh stackOut_16_0 = null;
        int stackOut_16_1 = 0;
        vh stackOut_17_0 = null;
        vh stackOut_18_0 = null;
        vh stackOut_19_0 = null;
        vh stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        vh stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        L0: {
          qi.a((byte) -100);
          if (-1 >= (mg.field_d ^ -1)) {
            pm.field_m.field_nb = nr.a(new String[1], -1, m.field_a);
            break L0;
          } else {
            pm.field_m.field_nb = null;
            break L0;
          }
        }
        L1: {
          L2: {
            stackOut_3_0 = ir.field_a;
            stackIn_9_0 = stackOut_3_0;
            stackIn_4_0 = stackOut_3_0;
            if (!param1) {
              break L2;
            } else {
              stackOut_4_0 = (vh) (Object) stackIn_4_0;
              stackIn_9_0 = stackOut_4_0;
              stackIn_5_0 = stackOut_4_0;
              if (param0) {
                break L2;
              } else {
                stackOut_5_0 = (vh) (Object) stackIn_5_0;
                stackIn_9_0 = stackOut_5_0;
                stackIn_6_0 = stackOut_5_0;
                if (tf.field_d) {
                  break L2;
                } else {
                  stackOut_6_0 = (vh) (Object) stackIn_6_0;
                  stackIn_9_0 = stackOut_6_0;
                  stackIn_7_0 = stackOut_6_0;
                  if (em.field_L != null) {
                    break L2;
                  } else {
                    stackOut_7_0 = (vh) (Object) stackIn_7_0;
                    stackIn_9_0 = stackOut_7_0;
                    stackIn_8_0 = stackOut_7_0;
                    if (tp.field_e != null) {
                      break L2;
                    } else {
                      stackOut_8_0 = (vh) (Object) stackIn_8_0;
                      stackOut_8_1 = 1;
                      stackIn_10_0 = stackOut_8_0;
                      stackIn_10_1 = stackOut_8_1;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          stackOut_9_0 = (vh) (Object) stackIn_9_0;
          stackOut_9_1 = 0;
          stackIn_10_0 = stackOut_9_0;
          stackIn_10_1 = stackOut_9_1;
          break L1;
        }
        L3: {
          L4: {
            ((vh) (Object) stackIn_10_0).a(stackIn_10_1 != 0, false);
            stackOut_10_0 = oi.field_n;
            stackIn_16_0 = stackOut_10_0;
            stackIn_11_0 = stackOut_10_0;
            if (!param1) {
              break L4;
            } else {
              stackOut_11_0 = (vh) (Object) stackIn_11_0;
              stackIn_16_0 = stackOut_11_0;
              stackIn_12_0 = stackOut_11_0;
              if (param0) {
                break L4;
              } else {
                stackOut_12_0 = (vh) (Object) stackIn_12_0;
                stackIn_16_0 = stackOut_12_0;
                stackIn_13_0 = stackOut_12_0;
                if (tf.field_d) {
                  break L4;
                } else {
                  stackOut_13_0 = (vh) (Object) stackIn_13_0;
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_14_0 = stackOut_13_0;
                  if (em.field_L != null) {
                    break L4;
                  } else {
                    stackOut_14_0 = (vh) (Object) stackIn_14_0;
                    stackIn_16_0 = stackOut_14_0;
                    stackIn_15_0 = stackOut_14_0;
                    if (null != tp.field_e) {
                      break L4;
                    } else {
                      stackOut_15_0 = (vh) (Object) stackIn_15_0;
                      stackOut_15_1 = 1;
                      stackIn_17_0 = stackOut_15_0;
                      stackIn_17_1 = stackOut_15_1;
                      break L3;
                    }
                  }
                }
              }
            }
          }
          stackOut_16_0 = (vh) (Object) stackIn_16_0;
          stackOut_16_1 = 0;
          stackIn_17_0 = stackOut_16_0;
          stackIn_17_1 = stackOut_16_1;
          break L3;
        }
        L5: {
          L6: {
            ((vh) (Object) stackIn_17_0).a(stackIn_17_1 != 0, false);
            stackOut_17_0 = ln.field_q;
            stackIn_21_0 = stackOut_17_0;
            stackIn_18_0 = stackOut_17_0;
            if (!param1) {
              break L6;
            } else {
              stackOut_18_0 = (vh) (Object) stackIn_18_0;
              stackIn_21_0 = stackOut_18_0;
              stackIn_19_0 = stackOut_18_0;
              if (param0) {
                break L6;
              } else {
                stackOut_19_0 = (vh) (Object) stackIn_19_0;
                stackIn_21_0 = stackOut_19_0;
                stackIn_20_0 = stackOut_19_0;
                if (!tf.field_d) {
                  break L6;
                } else {
                  stackOut_20_0 = (vh) (Object) stackIn_20_0;
                  stackOut_20_1 = 1;
                  stackIn_22_0 = stackOut_20_0;
                  stackIn_22_1 = stackOut_20_1;
                  break L5;
                }
              }
            }
          }
          stackOut_21_0 = (vh) (Object) stackIn_21_0;
          stackOut_21_1 = 0;
          stackIn_22_0 = stackOut_21_0;
          stackIn_22_1 = stackOut_21_1;
          break L5;
        }
        L7: {
          ((vh) (Object) stackIn_22_0).a(stackIn_22_1 != 0, false);
          kg.field_l.field_i.c(true);
          if (-1 != (gj.field_K.field_R ^ -1)) {
            jo.field_H = true;
            break L7;
          } else {
            break L7;
          }
        }
        L8: {
          if (rn.field_f.field_R == 0) {
            break L8;
          } else {
            L9: {
              if (rg.field_s) {
                break L9;
              } else {
                if (mp.field_V < -1) {
                  break L9;
                } else {
                  L10: {
                    if (-3 > hq.field_i) {
                      break L10;
                    } else {
                      if (vj.field_c[12]) {
                        break L9;
                      } else {
                        break L10;
                      }
                    }
                  }
                  gn.field_f = true;
                  break L8;
                }
              }
            }
            rb.c(param3, 100);
            break L8;
          }
        }
        L11: {
          if (uc.field_b.field_R == 0) {
            break L11;
          } else {
            L12: {
              if ((dg.field_T.length ^ -1) != -2) {
                break L12;
              } else {
                if (cr.field_l == dg.field_T[0]) {
                  break L12;
                } else {
                  cr.field_l = dg.field_T[0];
                  break L12;
                }
              }
            }
            je.a(param3, cr.field_l, true, tq.field_u, 0, false);
            break L11;
          }
        }
        L13: {
          if (param2 <= -126) {
            break L13;
          } else {
            ie.a(true, -43, -89);
            break L13;
          }
        }
        L14: {
          if (-1 == (sb.field_a.field_R ^ -1)) {
            break L14;
          } else {
            tf.field_d = false;
            break L14;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_i = "To <u=ffffff>look at</u> a different part of the table: <img=0> <col=99ff99>Click on</col> that <col=99ff99>part of the table</col>, as long as it's not the cue ball.";
        field_d = new int[8192];
        field_h = 0;
        field_c = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
        field_b = "Accept";
    }
}
