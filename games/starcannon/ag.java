/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.lang.String;

abstract class ag extends th {
    String field_u;
    private int field_v;
    private int field_w;
    static String field_k;
    private long field_l;
    private int field_n;
    private int field_q;
    private int field_p;
    private boolean field_r;
    private boolean field_s;
    private boolean field_t;
    private int field_x;
    static o field_m;
    static int field_o;

    final int h(byte param0) {
        int var2 = 0;
        var2 = this.m(125);
        if (param0 != 58) {
          return -33;
        } else {
          L0: {
            L1: {
              if (var2 == 0) {
                break L1;
              } else {
                if (var2 == 1) {
                  break L1;
                } else {
                  break L0;
                }
              }
            }
            L2: {
              if (el.field_D[1]) {
                ti.a(57, 2);
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (!el.field_D[2]) {
                break L3;
              } else {
                ce.a(3, param0 + -106);
                break L3;
              }
            }
            L4: {
              if (!el.field_D[3]) {
                break L4;
              } else {
                gh.a((byte) -89, 4);
                break L4;
              }
            }
            L5: {
              if (el.field_D[4]) {
                fh.a(5, 8100);
                break L5;
              } else {
                break L5;
              }
            }
            L6: {
              if (el.field_D[5]) {
                nd.b(6, (byte) -66);
                break L6;
              } else {
                break L6;
              }
            }
            L7: {
              if (el.field_D[6]) {
                kh.a(param0 ^ -1101, 7);
                break L7;
              } else {
                break L7;
              }
            }
            if (el.field_D[8]) {
              sd.a((byte) 38);
              break L0;
            } else {
              break L0;
            }
          }
          return var2;
        }
    }

    final static boolean a(int param0, int param1) {
        try {
            int var2_int = 0;
            IOException var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_16_0 = 0;
            int stackOut_13_0 = 0;
            int stackOut_15_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param1 <= se.field_p.field_g) {
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
                        if (m.field_b != null) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return false;
                    }
                    case 5: {
                        try {
                            var2_int = m.field_b.c(118);
                            if (param0 > 122) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            field_o = 68;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var2_int <= 0) {
                                statePc = 17;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if (var2_int > -se.field_p.field_g + param1) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2_int = -se.field_p.field_g + param1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            m.field_b.a(se.field_p.field_g, 32498, var2_int, se.field_p.field_f);
                            ik.field_p = dd.b(115);
                            se.field_p.field_g = se.field_p.field_g + var2_int;
                            if (param1 > se.field_p.field_g) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = 0;
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0 != 0;
                    }
                    case 15: {
                        try {
                            se.field_p.field_g = 0;
                            stackOut_15_0 = 1;
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0 != 0;
                    }
                    case 17: {
                        try {
                            if (var2_int < 0) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-30001L <= (kg.b((byte) -71) ^ -1L)) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ec.a((byte) 27);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        return false;
                    }
                    case 22: {
                        var2 = (IOException) (Object) caughtException;
                        ec.a((byte) 27);
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        return false;
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

    public static void j(byte param0) {
        field_k = null;
        if (param0 != 39) {
            field_k = null;
        }
        field_m = null;
    }

    private final void g(int param0) {
        s.field_k[5] = -1;
        s.field_k[10] = -1;
        s.field_k[1] = 16;
        s.field_k[8] = -2;
        s.field_k[9] = -1;
        s.field_k[6] = -2;
        s.field_k[11] = -1;
        s.field_k[12] = -1;
        s.field_k[18] = 1;
        s.field_k[16] = -1;
        s.field_k[3] = -1;
        s.field_k[13] = -1;
        s.field_k[7] = -1;
        if (param0 >= -14) {
          return;
        } else {
          s.field_k[2] = -2;
          s.field_k[17] = -1;
          s.field_k[4] = -1;
          return;
        }
    }

    final static void a(boolean param0, String param1, int param2, java.applet.Applet param3) {
        try {
            java.net.MalformedURLException var4 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (!ka.field_r.startsWith("win")) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (!sj.a(param1, (byte) -54)) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return;
                    }
                    case 3: {
                        try {
                            param3.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
                            if (param2 == 64) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            boolean discarded$2 = ag.h(-67);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        var4 = (java.net.MalformedURLException) (Object) caughtException;
                        hc.a((Throwable) null, "MGR1: " + param1, (byte) 94);
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        return;
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

    private final void g(byte param0) {
        int var2 = 24 / ((param0 - 58) / 42);
        String var3 = rf.c(1);
        hi.a(0, var3, ll.b(110));
    }

    private final static boolean h(int param0) {
        if (param0 != -28050) {
            return false;
        }
        return bl.field_b.a(-6);
    }

    final void a(boolean param0) {
        int var2 = 0;
        fb var3 = null;
        int var4 = 0;
        int stackIn_29_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_31_0 = 0;
        int stackIn_31_1 = 0;
        int stackOut_28_0 = 0;
        int stackOut_30_0 = 0;
        int stackOut_30_1 = 0;
        int stackOut_29_0 = 0;
        int stackOut_29_1 = 0;
        L0: {
          var4 = StarCannon.field_A;
          var2 = vh.field_t;
          if (64 <= var2) {
            break L0;
          } else {
            if (!el.field_D[var2]) {
              break L0;
            } else {
              if (param0) {
                if (var2 == -1) {
                  return;
                } else {
                  L1: {
                    if (-2 == var2) {
                      ef.b((byte) -57);
                      break L1;
                    } else {
                      if (-3 != var2) {
                        if (-4 == var2) {
                          vk.f(-96);
                          break L1;
                        } else {
                          if (-5 == var2) {
                            wa.b((byte) -101);
                            break L1;
                          } else {
                            if (-6 == var2) {
                              ea.b((byte) -107);
                              break L1;
                            } else {
                              if ((var2 ^ -1) == -7) {
                                cb.a((byte) -104);
                                break L1;
                              } else {
                                if (var2 != 7) {
                                  if (8 != var2) {
                                    if ((var2 ^ -1) == -17) {
                                      ri.b(12000);
                                      break L1;
                                    } else {
                                      L2: {
                                        if (var2 == -12) {
                                          break L2;
                                        } else {
                                          if (var2 == -13) {
                                            break L2;
                                          } else {
                                            if (-14 == var2) {
                                              vk.f((byte) 78);
                                              break L1;
                                            } else {
                                              if (17 == var2) {
                                                this.i((byte) 74);
                                                break L1;
                                              } else {
                                                if (-19 != var2) {
                                                  hc.a((Throwable) null, "MGS1: " + oe.a(46), (byte) 108);
                                                  ec.a((byte) 27);
                                                  break L1;
                                                } else {
                                                  ca.f(0);
                                                  break L1;
                                                }
                                              }
                                            }
                                          }
                                        }
                                      }
                                      L3: {
                                        stackOut_28_0 = 13607;
                                        stackIn_30_0 = stackOut_28_0;
                                        stackIn_29_0 = stackOut_28_0;
                                        if (-13 != (var2 ^ -1)) {
                                          stackOut_30_0 = stackIn_30_0;
                                          stackOut_30_1 = 0;
                                          stackIn_31_0 = stackOut_30_0;
                                          stackIn_31_1 = stackOut_30_1;
                                          break L3;
                                        } else {
                                          stackOut_29_0 = stackIn_29_0;
                                          stackOut_29_1 = 1;
                                          stackIn_31_0 = stackOut_29_0;
                                          stackIn_31_1 = stackOut_29_1;
                                          break L3;
                                        }
                                      }
                                      var3 = pb.a(stackIn_31_0, stackIn_31_1 != 0);
                                      qc.a(var3, (byte) -89);
                                      break L1;
                                    }
                                  } else {
                                    wk.a(il.field_g, (rb) (Object) se.field_p, nb.field_e, false);
                                    break L1;
                                  }
                                } else {
                                  this.g((byte) -47);
                                  break L1;
                                }
                              }
                            }
                          }
                        }
                      } else {
                        ak.a(70);
                        break L1;
                      }
                    }
                  }
                  return;
                }
              } else {
                return;
              }
            }
          }
        }
        hc.a((Throwable) null, "MGS2: " + oe.a(-62), (byte) 84);
        ec.a((byte) 27);
    }

    final void b(boolean param0, int param1) {
        int var3 = 0;
        java.awt.Dimension var4 = null;
        int var5 = 0;
        java.awt.Container var6 = null;
        int stackIn_23_0 = 0;
        String stackIn_103_0 = null;
        String stackIn_104_0 = null;
        String stackIn_105_0 = null;
        int stackIn_105_1 = 0;
        String stackIn_106_0 = null;
        int stackIn_106_1 = 0;
        int stackIn_106_2 = 0;
        String stackIn_107_0 = null;
        int stackIn_107_1 = 0;
        int stackIn_107_2 = 0;
        String stackIn_108_0 = null;
        int stackIn_108_1 = 0;
        int stackIn_108_2 = 0;
        int stackIn_108_3 = 0;
        int stackIn_138_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_21_0 = 0;
        String stackOut_102_0 = null;
        String stackOut_104_0 = null;
        int stackOut_104_1 = 0;
        String stackOut_103_0 = null;
        int stackOut_103_1 = 0;
        String stackOut_105_0 = null;
        int stackOut_105_1 = 0;
        int stackOut_105_2 = 0;
        String stackOut_107_0 = null;
        int stackOut_107_1 = 0;
        int stackOut_107_2 = 0;
        int stackOut_107_3 = 0;
        String stackOut_106_0 = null;
        int stackOut_106_1 = 0;
        int stackOut_106_2 = 0;
        int stackOut_106_3 = 0;
        int stackOut_137_0 = 0;
        int stackOut_136_0 = 0;
        L0: {
          var5 = StarCannon.field_A;
          if (null == kd.field_B) {
            break L0;
          } else {
            L1: {
              if (null != n.field_a) {
                break L1;
              } else {
                var6 = wi.a((byte) 120);
                var4 = var6.getSize();
                kd.field_B.a(118, var4.width, var4.height);
                break L1;
              }
            }
            kd.field_B.b((byte) 44);
            break L0;
          }
        }
        L2: {
          bi.a(119);
          gf.a(true);
          if (le.c(param1 + 5)) {
            break L2;
          } else {
            if ((bl.field_a ^ -1) != -12) {
              ce.a((byte) -100);
              break L2;
            } else {
              break L2;
            }
          }
        }
        L3: {
          if (qj.field_eb != null) {
            lh.field_I = qj.field_eb.a((byte) -107);
            break L3;
          } else {
            break L3;
          }
        }
        L4: {
          if (!fc.a((byte) 57)) {
            break L4;
          } else {
            L5: {
              var3 = 1200 * wc.a(-75);
              if (((ag) this).field_t) {
                break L5;
              } else {
                if (var3 >= ck.b((byte) -33)) {
                  break L4;
                } else {
                  if (var3 >= oj.a(-79)) {
                    break L4;
                  } else {
                    break L5;
                  }
                }
              }
            }
            ((ag) this).field_t = false;
            ec.a((byte) 27);
            ob.a(-121);
            pd.a(sc.field_e, 2, (byte) -77);
            jc.b(0);
            fi.field_h = true;
            wa.field_a = 15000L + dd.b(56);
            break L4;
          }
        }
        L6: {
          L7: {
            if (0 == qb.field_j) {
              break L7;
            } else {
              if (qb.field_j == 0) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          L8: {
            if (0 != qb.field_j) {
              stackOut_22_0 = 0;
              stackIn_23_0 = stackOut_22_0;
              break L8;
            } else {
              stackOut_21_0 = 1;
              stackIn_23_0 = stackOut_21_0;
              break L8;
            }
          }
          L9: {
            var3 = stackIn_23_0;
            qb.field_j = bf.e(param1 ^ -1);
            if (var3 == 0) {
              break L9;
            } else {
              if (qb.field_j == 0) {
                if (11 != bl.field_a) {
                  break L9;
                } else {
                  if (!se.b((byte) -91)) {
                    w.b((byte) 14);
                    break L9;
                  } else {
                    break L9;
                  }
                }
              } else {
                break L9;
              }
            }
          }
          if (-1 == qb.field_j) {
            break L6;
          } else {
            if (qb.field_j != -1) {
              wa.field_a = 15000L + dd.b(105);
              break L6;
            } else {
              break L6;
            }
          }
        }
        L10: {
          if (qb.field_j == param1) {
            break L10;
          } else {
            if (0 != qb.field_j) {
              if (-11 > rk.field_d) {
                if (qb.field_j != 3) {
                  if (-5 != (qb.field_j ^ -1)) {
                    if ((qb.field_j ^ -1) == -3) {
                      ((ag) this).a("js5connect_full", false);
                      break L10;
                    } else {
                      if (qb.field_j != 5) {
                        ((ag) this).a("js5connect", false);
                        break L10;
                      } else {
                        ((ag) this).a("outofdate", false);
                        break L10;
                      }
                    }
                  } else {
                    ((ag) this).a("js5io", false);
                    break L10;
                  }
                } else {
                  ((ag) this).a("js5crc", false);
                  break L10;
                }
              } else {
                if (-11 >= (bl.field_a ^ -1)) {
                  L11: {
                    ob.a(-107);
                    if ((qb.field_j ^ -1) == -4) {
                      pd.a(ob.field_g, 256, (byte) -77);
                      break L11;
                    } else {
                      if (4 == qb.field_j) {
                        pd.a(d.field_m, 256, (byte) -77);
                        break L11;
                      } else {
                        if ((qb.field_j ^ -1) == -3) {
                          pd.a(lj.field_d, 256, (byte) -77);
                          break L11;
                        } else {
                          if (qb.field_j == 5) {
                            pd.a(mi.field_n, 5, (byte) -77);
                            break L11;
                          } else {
                            pd.a(rh.field_g, 256, (byte) -77);
                            break L11;
                          }
                        }
                      }
                    }
                  }
                  fi.field_h = true;
                  break L10;
                } else {
                  break L10;
                }
              }
            } else {
              break L10;
            }
          }
        }
        L12: {
          L13: {
            L14: {
              if ((qb.field_j ^ -1) == 0) {
                break L14;
              } else {
                if (qb.field_j != 0) {
                  break L13;
                } else {
                  break L14;
                }
              }
            }
            if (!se.b((byte) -91)) {
              break L12;
            } else {
              break L13;
            }
          }
          if (dd.b(param1 ^ -59) >= wa.field_a) {
            fi.field_h = false;
            if (qb.field_j == -1) {
              break L12;
            } else {
              if (qb.field_j != 0) {
                qb.field_j = -1;
                lj.a(-30294);
                break L12;
              } else {
                break L12;
              }
            }
          } else {
            break L12;
          }
        }
        L15: {
          if (0 != qb.field_j) {
            break L15;
          } else {
            if (!se.b((byte) -91)) {
              kb.field_a = false;
              break L15;
            } else {
              break L15;
            }
          }
        }
        L16: {
          if (rk.field_d == 0) {
            if (!ag.h(-28050)) {
              break L16;
            } else {
              rk.field_d = 1;
              break L16;
            }
          } else {
            break L16;
          }
        }
        L17: {
          if (rk.field_d != 1) {
            break L17;
          } else {
            L18: {
              if (vg.field_b == 0) {
                break L18;
              } else {
                kl.field_b = b.a(false, rf.field_c);
                break L18;
              }
            }
            bf.field_y = sb.a(1, true, false, r.field_a, (byte) 104);
            fk.field_k = sb.a(1, true, false, ob.field_j, (byte) 104);
            li.field_b = sb.a(1, true, false, p.field_c, (byte) 103);
            fi.field_f = bf.field_y;
            rk.field_d = 2;
            lf.field_eb = fk.field_k;
            break L17;
          }
        }
        L19: {
          if ((rk.field_d ^ -1) == -3) {
            L20: {
              if (kl.field_b != null) {
                if (kl.field_b.b((byte) 95)) {
                  if (kl.field_b.a(-20955, "")) {
                    if (kl.field_b.a("", param1 ^ 9882)) {
                      eh.a((byte) 63, kl.field_b);
                      kl.field_b = null;
                      tc.j(32);
                      break L20;
                    } else {
                      break L20;
                    }
                  } else {
                    kl.field_b = null;
                    break L20;
                  }
                } else {
                  break L20;
                }
              } else {
                break L20;
              }
            }
            if (null == kl.field_b) {
              rk.field_d = 3;
              break L19;
            } else {
              break L19;
            }
          } else {
            break L19;
          }
        }
        L21: {
          if (-4 != (rk.field_d ^ -1)) {
            break L21;
          } else {
            if (!kb.a(li.field_b, fk.field_k, (byte) 107, bf.field_y)) {
              break L21;
            } else {
              if (!pa.a(li.field_b, -206)) {
                break L21;
              } else {
                L22: {
                  L23: {
                    eg.b((byte) -64);
                    jg.e((byte) 109);
                    o.field_b = pa.field_J;
                    sh.field_t = false;
                    StarCannon.a(li.field_b, ah.field_i, -20169, bf.field_y, fk.field_k);
                    if (vj.field_X) {
                      break L23;
                    } else {
                      if (qb.field_g == null) {
                        break L22;
                      } else {
                        break L23;
                      }
                    }
                  }
                  L24: {
                    stackOut_102_0 = qb.field_g;
                    stackIn_104_0 = stackOut_102_0;
                    stackIn_103_0 = stackOut_102_0;
                    if (vj.field_X) {
                      stackOut_104_0 = (String) (Object) stackIn_104_0;
                      stackOut_104_1 = 0;
                      stackIn_105_0 = stackOut_104_0;
                      stackIn_105_1 = stackOut_104_1;
                      break L24;
                    } else {
                      stackOut_103_0 = (String) (Object) stackIn_103_0;
                      stackOut_103_1 = 1;
                      stackIn_105_0 = stackOut_103_0;
                      stackIn_105_1 = stackOut_103_1;
                      break L24;
                    }
                  }
                  L25: {
                    stackOut_105_0 = (String) (Object) stackIn_105_0;
                    stackOut_105_1 = stackIn_105_1;
                    stackOut_105_2 = 0;
                    stackIn_107_0 = stackOut_105_0;
                    stackIn_107_1 = stackOut_105_1;
                    stackIn_107_2 = stackOut_105_2;
                    stackIn_106_0 = stackOut_105_0;
                    stackIn_106_1 = stackOut_105_1;
                    stackIn_106_2 = stackOut_105_2;
                    if (vj.field_X) {
                      stackOut_107_0 = (String) (Object) stackIn_107_0;
                      stackOut_107_1 = stackIn_107_1;
                      stackOut_107_2 = stackIn_107_2;
                      stackOut_107_3 = 0;
                      stackIn_108_0 = stackOut_107_0;
                      stackIn_108_1 = stackOut_107_1;
                      stackIn_108_2 = stackOut_107_2;
                      stackIn_108_3 = stackOut_107_3;
                      break L25;
                    } else {
                      stackOut_106_0 = (String) (Object) stackIn_106_0;
                      stackOut_106_1 = stackIn_106_1;
                      stackOut_106_2 = stackIn_106_2;
                      stackOut_106_3 = 1;
                      stackIn_108_0 = stackOut_106_0;
                      stackIn_108_1 = stackOut_106_1;
                      stackIn_108_2 = stackOut_106_2;
                      stackIn_108_3 = stackOut_106_3;
                      break L25;
                    }
                  }
                  ae.a(stackIn_108_0, stackIn_108_1 != 0, stackIn_108_2, stackIn_108_3 != 0);
                  break L22;
                }
                L26: {
                  if (!cc.field_l) {
                    break L26;
                  } else {
                    pk.a((byte) -64);
                    break L26;
                  }
                }
                L27: {
                  if (uh.field_l == null) {
                    uh.field_l = rd.d(param1 + -60);
                    j.field_e = ui.a(true);
                    break L27;
                  } else {
                    break L27;
                  }
                }
                kg.a(uh.field_l, param1 + 1, j.field_e, li.field_b);
                bf.field_y = null;
                li.field_b = null;
                fk.field_k = null;
                rb.a((java.applet.Applet) this, 65);
                tc.j(param1 ^ -33);
                rk.field_d = 10;
                break L21;
              }
            }
          }
        }
        L28: {
          if (10 == rk.field_d) {
            L29: {
              if (-1 != vg.field_b) {
                fb.field_g = b.a(false, a.field_d);
                break L29;
              } else {
                break L29;
              }
            }
            rk.field_d = 11;
            break L28;
          } else {
            break L28;
          }
        }
        L30: {
          if (-12 != rk.field_d) {
            break L30;
          } else {
            L31: {
              if (null == fb.field_g) {
                break L31;
              } else {
                L32: {
                  if (!fb.field_g.b((byte) 101)) {
                    break L32;
                  } else {
                    if (!fb.field_g.a(param1 + 29742)) {
                      break L32;
                    } else {
                      break L31;
                    }
                  }
                }
                ma.a(lb.a(fb.field_g, b.field_e, lb.field_L, (byte) -116), param1 ^ 13922, 0.0f);
                break L30;
              }
            }
            rk.field_d = 12;
            fa.field_E = true;
            break L30;
          }
        }
        L33: {
          if (-13 != (rk.field_d ^ -1)) {
            break L33;
          } else {
            if (!fa.field_E) {
              rk.field_d = 13;
              break L33;
            } else {
              break L33;
            }
          }
        }
        L34: {
          if (rk.field_d == 13) {
            L35: {
              var3 = 1;
              if (null == lb.field_t) {
                break L35;
              } else {
                L36: {
                  if (!lb.field_t.a((byte) 15)) {
                    stackOut_137_0 = 0;
                    stackIn_138_0 = stackOut_137_0;
                    break L36;
                  } else {
                    stackOut_136_0 = 1;
                    stackIn_138_0 = stackOut_136_0;
                    break L36;
                  }
                }
                var3 = stackIn_138_0;
                ma.a(lb.field_t.field_h, -13923, lb.field_t.field_i);
                break L35;
              }
            }
            if (var3 != 0) {
              rk.field_d = 20;
              break L34;
            } else {
              break L34;
            }
          } else {
            break L34;
          }
        }
        L37: {
          if (param0) {
            break L37;
          } else {
            if (!jj.field_E) {
              break L37;
            } else {
              wf.a(kj.field_E, false);
              ((ag) this).e(-128);
              mf.a(true, kj.field_E);
              break L37;
            }
          }
        }
        L38: {
          if (el.field_D[8]) {
            fb.a((byte) 10);
            break L38;
          } else {
            break L38;
          }
        }
    }

    final int b(int param0, boolean param1) {
        if (param0 != 17) {
            ((ag) this).field_p = 0;
        }
        return this.a(param0 ^ 26, true, param1);
    }

    private final void e(byte param0) {
        el.field_D[1] = true;
        if (param0 != -6) {
            ((ag) this).f((byte) 11);
        }
    }

    final void a(int param0, int param1, int param2, int param3, boolean param4, int param5, boolean param6, int param7) {
        java.awt.Frame var10 = new java.awt.Frame("Jagex");
        var10.pack();
        var10.dispose();
        ((ag) this).setBackground(java.awt.Color.black);
        vg.field_b = ((ag) this).field_n;
        jh.a(vg.field_b, param4);
        le.a(((ag) this).field_u, vg.field_b, 5000, nb.field_e, param6, 22692, ((ag) this).field_l, ((ag) this).field_s, ((ag) this).field_w, ((ag) this).field_v, ((ag) this).field_p, 5000, param0, ((ag) this).field_q);
        hj.a(vg.field_b, ((ag) this).field_p, nb.field_e, ((ag) this).field_q, 78, ((ag) this).field_w, param0, ((ag) this).field_u, ((ag) this).field_v);
        ge.b(4039);
        qj.field_eb = wc.b(5220);
        mf.a(true, kj.field_E);
        rf.field_c = param7;
        p.field_c = param1;
        a.field_d = param3;
        r.field_a = param2;
        ob.field_j = param5;
        this.g(-102);
        ng.k(126);
    }

    private final void j(int param0) {
        el.field_D[2] = true;
        if (param0 != -1) {
            int discarded$0 = this.m(-8);
        }
    }

    private final int a(int param0, boolean param1, boolean param2) {
        try {
            int var4 = 0;
            Exception var5 = null;
            int var5_int = 0;
            String var7 = null;
            Object var8 = null;
            Boolean var9 = null;
            rb var10 = null;
            Throwable decompiledCaughtException = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = fa.a(lh.field_I, param2, vg.field_b, (byte) 121);
                        if (0 != var4) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        throw new IllegalStateException();
                    }
                    case 2: {
                        if (1 == var4) {
                            statePc = 4;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        var5_int = ok.a((byte) -49, tg.d((byte) 10), ig.b(-1006263007));
                        if (var5_int != -1) {
                            statePc = 6;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        ie.a(-111, uj.field_r, ph.field_nb, var5_int);
                        uj.field_r = null;
                        ph.field_nb = null;
                        statePc = 7;
                        continue stateLoop;
                    }
                    case 7: {
                        var9 = kk.c((byte) 95);
                        if (var9 == null) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        sb.a(var9.booleanValue(), (byte) 122);
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (-3 != (var4 ^ -1)) {
                            statePc = 12;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        var5_int = fi.a(kk.b((byte) 123), ((ag) this).field_x, ff.g(111), hc.a((byte) 96), dg.b((byte) -18), we.a(29084), (byte) -3);
                        if (var5_int == 0) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        qa.a(var5_int, ph.field_nb, uj.field_r, (byte) 70);
                        ph.field_nb = null;
                        uj.field_r = null;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (-4 == var4) {
                            statePc = 14;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        if (qb.field_j == -1) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        if (qb.field_j != 0) {
                            statePc = 17;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        qb.field_j = -1;
                        lj.a(-30294);
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param1) {
                            statePc = 24;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var5_int = qc.a(hc.a((byte) 117), ((ag) this).field_r, ((ag) this).field_x, false, -1, ff.g(9));
                        if (0 != (var5_int ^ -1)) {
                            statePc = 21;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (var5_int != 0) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        ne.field_j = cb.field_a;
                        w.b((byte) 14);
                        bl.field_a = 10;
                        ai.field_c = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 23: {
                        pd.a(uj.field_r, var5_int, (byte) -77);
                        uj.field_r = null;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        fi.field_h = false;
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        if (-5 != (var4 ^ -1)) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        if (ah.field_i) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        ai.field_c = true;
                        bl.field_a = 10;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 28: {
                        ij.a(18065, ll.b(105));
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
                        if ((var4 ^ -1) != -6) {
                            statePc = 31;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        nh.a(ll.b(91), 337033697);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
                        if (6 == var4) {
                            statePc = 33;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 33: {
                        if (sh.field_t) {
                            statePc = 35;
                        } else {
                            statePc = 36;
                        }
                        continue stateLoop;
                    }
                    case 35: {
                        bl.field_a = 10;
                        statePc = 36;
                        continue stateLoop;
                    }
                    case 36: {
                        if (7 == var4) {
                            statePc = 38;
                        } else {
                            statePc = 39;
                        }
                        continue stateLoop;
                    }
                    case 38: {
                        vk.b(ll.b(param0 ^ 80), 32);
                        statePc = 39;
                        continue stateLoop;
                    }
                    case 39: {
                        if (-9 == (var4 ^ -1)) {
                            statePc = 41;
                        } else {
                            statePc = 42;
                        }
                        continue stateLoop;
                    }
                    case 41: {
                        ij.a(18065, ll.b(104));
                        statePc = 42;
                        continue stateLoop;
                    }
                    case 42: {
                        if (9 == var4) {
                            statePc = 44;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    }
                    case 44: {
                        pa.b(ll.b(99), param0 ^ -31162);
                        statePc = 45;
                        continue stateLoop;
                    }
                    case 45: {
                        if (var4 != 10) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    }
                    case 46: {
                        d.field_b.d((byte) 73, 17);
                        statePc = 47;
                        continue stateLoop;
                    }
                    case 47: {
                        if (param0 == var4) {
                            statePc = 49;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    }
                    case 49: {
                        wj.a(ll.b(86), 0);
                        statePc = 50;
                        continue stateLoop;
                    }
                    case 50: {
                        if (12 == var4) {
                            statePc = 52;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    }
                    case 52: {
                        ef.a(uc.c((byte) 114), ll.b(115), param0 + 91);
                        statePc = 53;
                        continue stateLoop;
                    }
                    case 53: {
                        if (-14 != (var4 ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 54;
                        }
                        continue stateLoop;
                    }
                    case 54: {
                        try {
                            if (null != qa.field_b) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            qa.field_b = new gg(nb.field_e, new java.net.URL(((ag) this).getCodeBase(), "countrylist.ws"), 5000);
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (!qa.field_b.c((byte) -127)) {
                                statePc = 63;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var10 = qa.field_b.a((byte) 60);
                            if (var10 != null) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var8 = null;
                            ci.a((String) null, 0);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var7 = va.a(0, 107, var10.field_f, var10.field_g);
                            ci.a(var7, param0 + -11);
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            qa.field_b = null;
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 62;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        var5 = (Exception) (Object) caughtException;
                        hc.a((Throwable) (Object) var5, "S1", (byte) 111);
                        ci.a((String) null, param0 + -11);
                        qa.field_b = null;
                        statePc = 63;
                        continue stateLoop;
                    }
                    case 63: {
                        if (-16 != (var4 ^ -1)) {
                            statePc = 65;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        bl.field_a = 10;
                        statePc = 65;
                        continue stateLoop;
                    }
                    case 65: {
                        if (16 == var4) {
                            statePc = 67;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 67: {
                        return 1;
                    }
                    case 68: {
                        if (17 == var4) {
                            statePc = 70;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    }
                    case 69: {
                        return 0;
                    }
                    case 70: {
                        return 2;
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

    final static void k(int param0) {
        kg.a((String) null, "", (byte) 92);
        if (param0 != -1108) {
            ag.k(-89);
        }
    }

    private final void i(int param0) {
        int var2 = 28 % ((param0 - -8) / 35);
        el.field_D[4] = true;
    }

    final void f(byte param0) {
        int var3 = 0;
        Object stackIn_8_0 = null;
        int stackIn_8_1 = 0;
        int stackIn_8_2 = 0;
        Object stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int stackIn_9_2 = 0;
        Object stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int stackIn_10_2 = 0;
        int stackIn_10_3 = 0;
        Object stackOut_7_0 = null;
        int stackOut_7_1 = 0;
        int stackOut_7_2 = 0;
        Object stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int stackOut_9_2 = 0;
        int stackOut_9_3 = 0;
        Object stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int stackOut_8_2 = 0;
        int stackOut_8_3 = 0;
        L0: {
          var3 = StarCannon.field_A;
          if (ai.a((byte) -21)) {
            L1: {
              stackOut_7_0 = this;
              stackOut_7_1 = 11;
              stackOut_7_2 = 0;
              stackIn_9_0 = stackOut_7_0;
              stackIn_9_1 = stackOut_7_1;
              stackIn_9_2 = stackOut_7_2;
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              if (n.field_a == null) {
                stackOut_9_0 = this;
                stackOut_9_1 = stackIn_9_1;
                stackOut_9_2 = stackIn_9_2;
                stackOut_9_3 = 0;
                stackIn_10_0 = stackOut_9_0;
                stackIn_10_1 = stackOut_9_1;
                stackIn_10_2 = stackOut_9_2;
                stackIn_10_3 = stackOut_9_3;
                break L1;
              } else {
                stackOut_8_0 = this;
                stackOut_8_1 = stackIn_8_1;
                stackOut_8_2 = stackIn_8_2;
                stackOut_8_3 = 1;
                stackIn_10_0 = stackOut_8_0;
                stackIn_10_1 = stackOut_8_1;
                stackIn_10_2 = stackOut_8_2;
                stackIn_10_3 = stackOut_8_3;
                break L1;
              }
            }
            int discarded$122 = this.a(stackIn_10_1, stackIn_10_2 != 0, stackIn_10_3 != 0);
            break L0;
          } else {
            if ((rk.field_d ^ -1) > -11) {
              break L0;
            } else {
              if (!m.a(-35)) {
                uc.d(1);
                break L0;
              } else {
                if (bl.field_a != 0) {
                  ne.b(lh.field_I, 150);
                  break L0;
                } else {
                  int discarded$123 = this.a(11, false, false);
                  break L0;
                }
              }
            }
          }
        }
        L2: {
          if (param0 <= -20) {
            break L2;
          } else {
            this.g(66);
            break L2;
          }
        }
    }

    private final void a(boolean param0, int param1) {
        el.field_D[16] = true;
        el.field_D[7] = true;
        el.field_D[18] = true;
        el.field_D[8] = param0;
        el.field_D[17] = true;
        el.field_D[3] = true;
        el.field_D[param1] = true;
    }

    final void a(boolean param0, boolean param1, boolean param2, boolean param3, int param4) {
        L0: {
          this.a(false, 0);
          if (!param0) {
            break L0;
          } else {
            this.e((byte) -6);
            break L0;
          }
        }
        L1: {
          if (param3) {
            this.j(-1);
            break L1;
          } else {
            break L1;
          }
        }
        L2: {
          if (param1) {
            this.i(-57);
            break L2;
          } else {
            break L2;
          }
        }
        if (param4 != -752) {
          return;
        } else {
          L3: {
            if (!param2) {
              break L3;
            } else {
              this.l(98);
              break L3;
            }
          }
          return;
        }
    }

    final void a(int param0, int param1, String param2) {
        if (param0 != -15028) {
            return;
        }
        this.a(param1, param2, 480, 640, (byte) -25);
    }

    private final int m(int param0) {
        if (!(!((ag) this).field_b)) {
            return -1;
        }
        if (!se.b((byte) -91)) {
            return -1;
        }
        if (fi.field_h) {
            return -1;
        }
        int var2 = qc.a(hc.a((byte) 108), ((ag) this).field_r, ((ag) this).field_x, true, -1, ff.g(114));
        if (var2 == -1) {
            return -1;
        }
        if (0 != var2) {
            // if_icmpeq L74
        } else {
            if (-12 == (bl.field_a ^ -1)) {
                if (!(qb.field_j != 0)) {
                    w.b((byte) 14);
                }
            }
            return var2;
        }
        if (!(hd.field_p)) {
            ((ag) this).a("reconnect", false);
        }
        ob.a(-88);
        int var3 = 77 / ((param0 - 63) / 62);
        pd.a(uj.field_r, var2, (byte) -77);
        fi.field_h = true;
        wa.field_a = dd.b(103) + 15000L;
        return var2;
    }

    private final void i(byte param0) {
        int var2 = se.field_p.j(7909);
        if (param0 < 20) {
            this.a(true, -88);
        }
        int var3 = -1 != (1 & var2 ^ -1) ? 1 : 0;
        int var4 = il.field_g + -1;
        byte[] var5 = new byte[var4];
        se.field_p.b(var4, (byte) -54, var5, 0);
        ag.a(var3 != 0, uh.a(127, var5), 64, ll.b(126));
    }

    private final void a(int param0, String param1, int param2, int param3, byte param4) {
        Exception var6 = null;
        String var6_ref = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        Object var10 = null;
        Object stackIn_3_0 = null;
        Object stackIn_4_0 = null;
        Object stackIn_5_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        Throwable decompiledCaughtException = null;
        Object stackOut_2_0 = null;
        Object stackOut_3_0 = null;
        Object stackOut_6_0 = null;
        int stackOut_6_1 = 0;
        Object stackOut_4_0 = null;
        Object stackOut_5_0 = null;
        int stackOut_5_1 = 0;
        try {
          if (((ag) this).d(57)) {
            L0: {
              L1: {
                ((ag) this).field_u = ((ag) this).getCodeBase().getHost();
                var6_ref = ((ag) this).field_u.toLowerCase();
                stackOut_2_0 = this;
                stackIn_5_0 = stackOut_2_0;
                stackIn_3_0 = stackOut_2_0;
                if (var6_ref.equals((Object) (Object) "jagex.com")) {
                  break L1;
                } else {
                  stackOut_3_0 = this;
                  stackIn_6_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (!var6_ref.endsWith(".jagex.com")) {
                    stackOut_6_0 = this;
                    stackOut_6_1 = 0;
                    stackIn_7_0 = stackOut_6_0;
                    stackIn_7_1 = stackOut_6_1;
                    break L0;
                  } else {
                    stackOut_4_0 = this;
                    stackIn_5_0 = stackOut_4_0;
                    break L1;
                  }
                }
              }
              stackOut_5_0 = this;
              stackOut_5_1 = 1;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              break L0;
            }
            L2: {
              ((ag) this).field_r = stackIn_7_1 != 0;
              ((ag) this).field_v = Integer.parseInt(((ag) this).getParameter("gameport1"));
              ((ag) this).field_q = Integer.parseInt(((ag) this).getParameter("gameport2"));
              if (param4 == -25) {
                break L2;
              } else {
                ((ag) this).field_n = 113;
                break L2;
              }
            }
            L3: {
              var7 = ((ag) this).getParameter("servernum");
              if (var7 != null) {
                ((ag) this).field_p = Integer.parseInt(var7);
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              ((ag) this).field_w = Integer.parseInt(((ag) this).getParameter("gamecrc"));
              ((ag) this).field_l = Long.parseLong(((ag) this).getParameter("instanceid"));
              ((ag) this).field_s = ((ag) this).getParameter("member").equals((Object) (Object) "yes");
              var8 = ((ag) this).getParameter("lang");
              if (var8 != null) {
                ((ag) this).field_n = Integer.parseInt(var8);
                break L4;
              } else {
                break L4;
              }
            }
            L5: {
              if ((((ag) this).field_n ^ -1) > -6) {
                break L5;
              } else {
                ((ag) this).field_n = 0;
                break L5;
              }
            }
            L6: {
              var9 = ((ag) this).getParameter("affid");
              if (var9 != null) {
                ((ag) this).field_x = Integer.parseInt(var9);
                break L6;
              } else {
                break L6;
              }
            }
            cc.field_l = Boolean.valueOf(((ag) this).getParameter("simplemode")).booleanValue();
            ((ag) this).a((byte) 126, param1, ((ag) this).field_w, 32, param2, param3, param0);
          } else {
            return;
          }
        } catch (java.lang.Exception decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
        }
        var6 = (Exception) (Object) decompiledCaughtException;
        var10 = null;
        hc.a((Throwable) (Object) var6, (String) null, (byte) 100);
        ((ag) this).a("crash", false);
    }

    protected ag() {
    }

    private final void l(int param0) {
        el.field_D[5] = true;
        if (param0 <= 97) {
            ((ag) this).field_q = -96;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Invalid Login or Password<br><br>For accounts created after the 24th of November 2010, please use your email address to log in.<br><br>Otherwise please log in with your username.";
        field_m = new o(1, 2, 2, 0);
    }
}
