/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class f extends ji {
    private int field_G;
    private int field_z;
    static ve field_H;
    static int field_y;
    static long field_F;
    static int field_B;
    static String[] field_I;
    static String field_J;
    static String field_D;

    final static void a(long param0, int param1, int param2, jj param3, int param4, int param5, int param6, int param7, boolean param8, int param9, boolean param10, String param11, int param12, int param13) {
        try {
            IOException var15 = null;
            int stackIn_3_0 = 0;
            int stackIn_6_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_2_0 = 0;
            int stackOut_1_0 = 0;
            int stackOut_5_0 = 0;
            int stackOut_4_0 = 0;
            L0: {
              id.field_f = new mi(param12);
              uh.field_Wb = new mi(param2);
              kr.field_g = param3;
              cl.field_d = param6;
              if (!param8) {
                stackOut_2_0 = 0;
                stackIn_3_0 = stackOut_2_0;
                break L0;
              } else {
                stackOut_1_0 = 1;
                stackIn_3_0 = stackOut_1_0;
                break L0;
              }
            }
            L1: {
              pl.field_i = stackIn_3_0 != 0;
              if (!param10) {
                stackOut_5_0 = 0;
                stackIn_6_0 = stackOut_5_0;
                break L1;
              } else {
                stackOut_4_0 = 1;
                stackIn_6_0 = stackOut_4_0;
                break L1;
              }
            }
            L2: {
              lm.field_G = stackIn_6_0 != 0;
              if (param13 == 6) {
                break L2;
              } else {
                int discarded$2 = f.b(true);
                break L2;
              }
            }
            nb.field_y = param11;
            nj.field_e = param4;
            ng.field_c = param1;
            bl.field_C = param9;
            ne.field_P = param5;
            kj.field_B = param7;
            ff.field_d = param0;
            if (null != kr.field_g.field_k) {
              try {
                as.field_d = new im(kr.field_g.field_k, 64, 0);
              } catch (java.io.IOException decompiledCaughtParameter) {
                decompiledCaughtException = decompiledCaughtParameter;
                return;
              }
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public f() {
        super(1, true);
        ((f) this).field_z = 0;
        ((f) this).field_G = 4096;
    }

    public static void b(byte param0) {
        int var1 = 14 % ((param0 - 5) / 51);
        field_D = null;
        field_J = null;
        field_I = null;
        field_H = null;
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6, boolean param7) {
        if (param2 <= 107) {
          field_F = -27L;
          if (-1 != (bp.field_C.field_tb ^ -1)) {
            if (pe.field_r) {
              if (il.field_a) {
                L0: {
                  ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                  gk.field_c.a(0, param7);
                  if (!param7) {
                    break L0;
                  } else {
                    if (0 == kk.field_a.field_tb) {
                      if (-1 == oa.field_s.field_tb) {
                        break L0;
                      } else {
                        fb.h(0);
                        il.field_a = false;
                        return;
                      }
                    } else {
                      il.field_a = false;
                      if (-1 == oa.field_s.field_tb) {
                        return;
                      } else {
                        fb.h(0);
                        il.field_a = false;
                        return;
                      }
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (hj.field_b) {
                g.a((byte) -10);
                if (il.field_a) {
                  L1: {
                    ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                    gk.field_c.a(0, param7);
                    if (!param7) {
                      break L1;
                    } else {
                      if (0 == kk.field_a.field_tb) {
                        if (-1 == oa.field_s.field_tb) {
                          break L1;
                        } else {
                          fb.h(0);
                          il.field_a = false;
                          return;
                        }
                      } else {
                        L2: {
                          il.field_a = false;
                          if (-1 == oa.field_s.field_tb) {
                            break L2;
                          } else {
                            fb.h(0);
                            il.field_a = false;
                            break L2;
                          }
                        }
                        return;
                      }
                    }
                  }
                  return;
                } else {
                  return;
                }
              } else {
                L3: {
                  il.field_a = true;
                  if (il.field_a) {
                    ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                    gk.field_c.a(0, param7);
                    if (!param7) {
                      break L3;
                    } else {
                      if (0 == kk.field_a.field_tb) {
                        if (-1 == oa.field_s.field_tb) {
                          break L3;
                        } else {
                          fb.h(0);
                          il.field_a = false;
                          return;
                        }
                      } else {
                        L4: {
                          il.field_a = false;
                          if (-1 == oa.field_s.field_tb) {
                            break L4;
                          } else {
                            fb.h(0);
                            il.field_a = false;
                            break L4;
                          }
                        }
                        return;
                      }
                    }
                  } else {
                    break L3;
                  }
                }
                return;
              }
            }
          } else {
            L5: {
              if (il.field_a) {
                ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                gk.field_c.a(0, param7);
                if (param7) {
                  L6: {
                    if (0 == kk.field_a.field_tb) {
                      break L6;
                    } else {
                      il.field_a = false;
                      break L6;
                    }
                  }
                  if (-1 == (oa.field_s.field_tb ^ -1)) {
                    break L5;
                  } else {
                    fb.h(0);
                    il.field_a = false;
                    break L5;
                  }
                } else {
                  return;
                }
              } else {
                break L5;
              }
            }
            return;
          }
        } else {
          if (-1 != (bp.field_C.field_tb ^ -1)) {
            if (pe.field_r) {
              if (il.field_a) {
                L7: {
                  ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                  gk.field_c.a(0, param7);
                  if (!param7) {
                    break L7;
                  } else {
                    if (0 == kk.field_a.field_tb) {
                      if (-1 == oa.field_s.field_tb) {
                        break L7;
                      } else {
                        fb.h(0);
                        il.field_a = false;
                        return;
                      }
                    } else {
                      L8: {
                        il.field_a = false;
                        if (-1 == oa.field_s.field_tb) {
                          break L8;
                        } else {
                          fb.h(0);
                          il.field_a = false;
                          break L8;
                        }
                      }
                      return;
                    }
                  }
                }
                return;
              } else {
                return;
              }
            } else {
              if (hj.field_b) {
                L9: {
                  g.a((byte) -10);
                  if (il.field_a) {
                    ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                    gk.field_c.a(0, param7);
                    if (!param7) {
                      break L9;
                    } else {
                      L10: {
                        if (0 == kk.field_a.field_tb) {
                          break L10;
                        } else {
                          il.field_a = false;
                          break L10;
                        }
                      }
                      if (-1 == (oa.field_s.field_tb ^ -1)) {
                        break L9;
                      } else {
                        fb.h(0);
                        il.field_a = false;
                        break L9;
                      }
                    }
                  } else {
                    break L9;
                  }
                }
                return;
              } else {
                L11: {
                  il.field_a = true;
                  if (il.field_a) {
                    ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                    gk.field_c.a(0, param7);
                    if (!param7) {
                      break L11;
                    } else {
                      L12: {
                        if (0 == kk.field_a.field_tb) {
                          break L12;
                        } else {
                          il.field_a = false;
                          break L12;
                        }
                      }
                      if (-1 == (oa.field_s.field_tb ^ -1)) {
                        break L11;
                      } else {
                        fb.h(0);
                        il.field_a = false;
                        break L11;
                      }
                    }
                  } else {
                    break L11;
                  }
                }
                return;
              }
            }
          } else {
            L13: {
              if (il.field_a) {
                ca.a(param1, param4, param6, param4, 20, param0, param5, 126, param3);
                gk.field_c.a(0, param7);
                if (!param7) {
                  break L13;
                } else {
                  L14: {
                    if (0 == kk.field_a.field_tb) {
                      break L14;
                    } else {
                      il.field_a = false;
                      break L14;
                    }
                  }
                  if (-1 == (oa.field_s.field_tb ^ -1)) {
                    break L13;
                  } else {
                    fb.h(0);
                    il.field_a = false;
                    break L13;
                  }
                }
              } else {
                break L13;
              }
            }
            return;
          }
        }
    }

    final static int b(boolean param0) {
        if (param0) {
            int discarded$0 = f.g(-57);
            return sf.field_d;
        }
        return sf.field_d;
    }

    final static int g(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ed var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_34_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 <= kb.field_e.field_m) {
                            statePc = 2;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        if (kb.field_e.field_j != -1) {
                            statePc = 4;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (1 == (kb.field_e.field_j ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 1;
                    }
                    case 6: {
                        return 4;
                    }
                    case 7: {
                        try {
                            if (param0 == al.field_t) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            pq.field_f = or.field_f.a(param0 + -108, rf.field_l, lm.field_H);
                            al.field_t = al.field_t + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (1 != al.field_t) {
                                statePc = 18;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (pq.field_f.field_b == -3) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            stackOut_13_0 = pl.a((byte) 11, -1);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if (-2 == pq.field_f.field_b) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            al.field_t = al.field_t + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-3 == (al.field_t ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            fn.field_y = new pm((java.net.Socket) pq.field_f.field_d, or.field_f);
                            var2 = new ed(13);
                            jo.a(var2, od.field_Kb, qi.field_a, 124, il.field_h);
                            var2.f(15, param0 + -85);
                            var2.e(rf.field_q, 0);
                            fn.field_y.a(0, 13, 127, var2.field_p);
                            al.field_t = al.field_t + 1;
                            pq.field_e = 30000L + gk.a(param0 + 60);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (-4 == (al.field_t ^ -1)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (fn.field_y.a(15166) > 0) {
                                statePc = 27;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (pq.field_e >= gk.a(param0 + 75)) {
                                statePc = 32;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            stackOut_25_0 = pl.a((byte) 11, -2);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            var1_int = fn.field_y.a((byte) -113);
                            if (0 != var1_int) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            stackOut_29_0 = pl.a((byte) 11, var1_int);
                            stackIn_30_0 = stackOut_29_0;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        return stackIn_30_0;
                    }
                    case 31: {
                        try {
                            al.field_t = al.field_t + 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (-5 == (al.field_t ^ -1)) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            kb.field_e.a((Object) (Object) fn.field_y, ni.field_f, -128);
                            pq.field_f = null;
                            fn.field_y = null;
                            al.field_t = 0;
                            stackOut_34_0 = 0;
                            stackIn_35_0 = stackOut_34_0;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        return stackIn_35_0;
                    }
                    case 36: {
                        var1 = (IOException) (Object) caughtException;
                        return pl.a((byte) 11, -3);
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

    final static void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        int var6 = 0;
        int[] var7 = null;
        int var8 = Vertigo2.field_L ? 1 : 0;
        param3++;
        ki.a(-118, param1, vl.field_e[param3], param0, param2);
        param5--;
        ki.a(param4 + -84, param1, vl.field_e[param5], param0, param2);
        if (param4 != -8) {
            return;
        }
        for (var6 = param3; var6 <= param5; var6++) {
            var7 = vl.field_e[var6];
            var7[param0] = param2;
            var7[param1] = param2;
        }
    }

    final static void c(byte param0) {
        int var2 = 0;
        var2 = Vertigo2.field_L ? 1 : 0;
        if (!gf.a((byte) -105)) {
          L0: {
            if (null == dc.field_L) {
              break L0;
            } else {
              if (dc.field_L.field_e) {
                cp.a((byte) 127);
                qb.field_d.b((iq) (Object) new gr(qb.field_d, sd.field_I), 0);
                break L0;
              } else {
                return;
              }
            }
          }
          return;
        } else {
          if (param0 == -6) {
            boolean discarded$4 = qb.field_d.a(qg.field_I, true, (byte) 115, oj.field_N);
            qb.field_d.l(0);
            L1: while (true) {
              if (!gf.a(false)) {
                return;
              } else {
                boolean discarded$5 = qb.field_d.a(-122, de.field_f, ji.field_r);
                continue L1;
              }
            }
          } else {
            field_I = null;
            boolean discarded$6 = qb.field_d.a(qg.field_I, true, (byte) 115, oj.field_N);
            qb.field_d.l(0);
            L2: while (true) {
              if (!gf.a(false)) {
                return;
              } else {
                boolean discarded$7 = qb.field_d.a(-122, de.field_f, ji.field_r);
                continue L2;
              }
            }
          }
        }
    }

    final void a(byte param0, int param1, ed param2) {
        int var4 = 0;
        Object var5 = null;
        var4 = param1;
        if (var4 == 0) {
          ((f) this).field_z = param2.a((byte) -11);
          if (param0 != 110) {
            var5 = null;
            ((f) this).a((byte) -51, 30, (ed) null);
            return;
          } else {
            return;
          }
        } else {
          if (var4 == 1) {
            ((f) this).field_G = param2.a((byte) -11);
            if (param0 == 110) {
              return;
            } else {
              var5 = null;
              ((f) this).a((byte) -51, 30, (ed) null);
              return;
            }
          } else {
            if (param0 != 110) {
              var5 = null;
              ((f) this).a((byte) -51, 30, (ed) null);
              return;
            } else {
              return;
            }
          }
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int[] var8 = null;
        int[] var9 = null;
        int[] var11 = null;
        int[] var12 = null;
        int[] stackIn_9_0 = null;
        int stackIn_9_1 = 0;
        int[] stackIn_10_0 = null;
        int stackIn_10_1 = 0;
        int[] stackIn_11_0 = null;
        int stackIn_11_1 = 0;
        int[] stackIn_12_0 = null;
        int stackIn_12_1 = 0;
        int[] stackIn_13_0 = null;
        int stackIn_13_1 = 0;
        int stackIn_13_2 = 0;
        int[] stackIn_20_0 = null;
        int stackIn_20_1 = 0;
        int[] stackIn_21_0 = null;
        int stackIn_21_1 = 0;
        int[] stackIn_22_0 = null;
        int stackIn_22_1 = 0;
        int[] stackIn_23_0 = null;
        int stackIn_23_1 = 0;
        int[] stackIn_24_0 = null;
        int stackIn_24_1 = 0;
        int stackIn_24_2 = 0;
        int[] stackOut_19_0 = null;
        int stackOut_19_1 = 0;
        int[] stackOut_20_0 = null;
        int stackOut_20_1 = 0;
        int[] stackOut_23_0 = null;
        int stackOut_23_1 = 0;
        int stackOut_23_2 = 0;
        int[] stackOut_21_0 = null;
        int stackOut_21_1 = 0;
        int[] stackOut_22_0 = null;
        int stackOut_22_1 = 0;
        int stackOut_22_2 = 0;
        int[] stackOut_8_0 = null;
        int stackOut_8_1 = 0;
        int[] stackOut_9_0 = null;
        int stackOut_9_1 = 0;
        int[] stackOut_12_0 = null;
        int stackOut_12_1 = 0;
        int stackOut_12_2 = 0;
        int[] stackOut_10_0 = null;
        int stackOut_10_1 = 0;
        int[] stackOut_11_0 = null;
        int stackOut_11_1 = 0;
        int stackOut_11_2 = 0;
        var7 = Vertigo2.field_L ? 1 : 0;
        if (param1 > 91) {
          var8 = ((f) this).field_x.a(param0, (byte) -46);
          var3 = var8;
          if (((f) this).field_x.field_i) {
            var12 = ((f) this).a(0, -1, param0);
            var5 = 0;
            L0: while (true) {
              if (we.field_M > var5) {
                L1: {
                  L2: {
                    var6 = var12[var5];
                    stackOut_19_0 = (int[]) var8;
                    stackOut_19_1 = var5;
                    stackIn_22_0 = stackOut_19_0;
                    stackIn_22_1 = stackOut_19_1;
                    stackIn_20_0 = stackOut_19_0;
                    stackIn_20_1 = stackOut_19_1;
                    if (((f) this).field_z > var6) {
                      break L2;
                    } else {
                      stackOut_20_0 = (int[]) (Object) stackIn_20_0;
                      stackOut_20_1 = stackIn_20_1;
                      stackIn_23_0 = stackOut_20_0;
                      stackIn_23_1 = stackOut_20_1;
                      stackIn_21_0 = stackOut_20_0;
                      stackIn_21_1 = stackOut_20_1;
                      if (((f) this).field_G >= var6) {
                        stackOut_23_0 = (int[]) (Object) stackIn_23_0;
                        stackOut_23_1 = stackIn_23_1;
                        stackOut_23_2 = 4096;
                        stackIn_24_0 = stackOut_23_0;
                        stackIn_24_1 = stackOut_23_1;
                        stackIn_24_2 = stackOut_23_2;
                        break L1;
                      } else {
                        stackOut_21_0 = (int[]) (Object) stackIn_21_0;
                        stackOut_21_1 = stackIn_21_1;
                        stackIn_22_0 = stackOut_21_0;
                        stackIn_22_1 = stackOut_21_1;
                        break L2;
                      }
                    }
                  }
                  stackOut_22_0 = (int[]) (Object) stackIn_22_0;
                  stackOut_22_1 = stackIn_22_1;
                  stackOut_22_2 = 0;
                  stackIn_24_0 = stackOut_22_0;
                  stackIn_24_1 = stackOut_22_1;
                  stackIn_24_2 = stackOut_22_2;
                  break L1;
                }
                stackIn_24_0[stackIn_24_1] = stackIn_24_2;
                var5++;
                continue L0;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        } else {
          field_B = -52;
          var8 = ((f) this).field_x.a(param0, (byte) -46);
          var3 = var8;
          if (((f) this).field_x.field_i) {
            var11 = ((f) this).a(0, -1, param0);
            var9 = var11;
            var4 = var9;
            var5 = 0;
            L3: while (true) {
              if (we.field_M > var5) {
                L4: {
                  L5: {
                    var11 = var9;
                    var6 = var11[var5];
                    stackOut_8_0 = (int[]) var8;
                    stackOut_8_1 = var5;
                    stackIn_11_0 = stackOut_8_0;
                    stackIn_11_1 = stackOut_8_1;
                    stackIn_9_0 = stackOut_8_0;
                    stackIn_9_1 = stackOut_8_1;
                    if (((f) this).field_z > var6) {
                      break L5;
                    } else {
                      stackOut_9_0 = (int[]) (Object) stackIn_9_0;
                      stackOut_9_1 = stackIn_9_1;
                      stackIn_12_0 = stackOut_9_0;
                      stackIn_12_1 = stackOut_9_1;
                      stackIn_10_0 = stackOut_9_0;
                      stackIn_10_1 = stackOut_9_1;
                      if (((f) this).field_G >= var6) {
                        stackOut_12_0 = (int[]) (Object) stackIn_12_0;
                        stackOut_12_1 = stackIn_12_1;
                        stackOut_12_2 = 4096;
                        stackIn_13_0 = stackOut_12_0;
                        stackIn_13_1 = stackOut_12_1;
                        stackIn_13_2 = stackOut_12_2;
                        break L4;
                      } else {
                        stackOut_10_0 = (int[]) (Object) stackIn_10_0;
                        stackOut_10_1 = stackIn_10_1;
                        stackIn_11_0 = stackOut_10_0;
                        stackIn_11_1 = stackOut_10_1;
                        break L5;
                      }
                    }
                  }
                  stackOut_11_0 = (int[]) (Object) stackIn_11_0;
                  stackOut_11_1 = stackIn_11_1;
                  stackOut_11_2 = 0;
                  stackIn_13_0 = stackOut_11_0;
                  stackIn_13_1 = stackOut_11_1;
                  stackIn_13_2 = stackOut_11_2;
                  break L4;
                }
                stackIn_13_0[stackIn_13_1] = stackIn_13_2;
                var5++;
                continue L3;
              } else {
                return var8;
              }
            }
          } else {
            return var8;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = new ve(6, 0, 4, 2);
        field_I = new String[]{"Waiting for text", "Warte auf Text", "En attente du texte", "Aguardando textos", "Op tekst wachten", "Esperando a texto"};
        field_D = "Rating";
        field_J = "Remove <%0> from ignore list";
    }
}
