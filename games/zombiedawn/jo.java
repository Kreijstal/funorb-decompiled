/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jo extends qk {
    static int field_Qb;
    static char[] field_Nb;
    private int field_Rb;
    private boolean field_Sb;
    static vf field_Ob;
    private int field_Pb;
    static vn[][] field_Tb;

    final void l(byte param0) {
        int var2 = 0;
        int var3 = 0;
        kk var3_ref_kk = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        qh var10 = null;
        L0: {
          var9 = ZombieDawn.field_J;
          if (-24 == (((jo) this).field_F ^ -1)) {
            ((jo) this).field_F = 0;
            break L0;
          } else {
            break L0;
          }
        }
        super.l(param0);
        if (((jo) this).field_Ab >= 0) {
          if (0 == ((jo) this).field_F) {
            if (!((jo) this).field_Sb) {
              if (0 == ((jo) this).field_Rb) {
                var2 = ((jo) this).l(param0 + -178) & 127;
                if (-61 <= var2) {
                  var3 = var2 - 60;
                  var4 = ((jo) this).a(true);
                  var5 = ((jo) this).f(237239984);
                  var6 = 0;
                  var7 = 0;
                  var8 = var3;
                  if (var8 != -1) {
                    if (-3 != var8) {
                      if (-2 != (var8 ^ -1)) {
                        if ((var8 ^ -1) != -4) {
                          L1: while (true) {
                            var4 = var4 + var6;
                            var5 = var5 + var7;
                            if (((jo) this).b(0, var4, var5) < 60) {
                              continue L1;
                            } else {
                              ((jo) this).field_Pb = var5;
                              ((jo) this).field_Rb = var4;
                              ((jo) this).e(23, -6904);
                              return;
                            }
                          }
                        } else {
                          var6 = -24;
                          L2: while (true) {
                            var4 = var4 + var6;
                            var5 = var5 + var7;
                            if (((jo) this).b(0, var4, var5) < 60) {
                              continue L2;
                            } else {
                              ((jo) this).field_Pb = var5;
                              ((jo) this).field_Rb = var4;
                              ((jo) this).e(23, -6904);
                              return;
                            }
                          }
                        }
                      } else {
                        var6 = 24;
                        L3: while (true) {
                          var4 = var4 + var6;
                          var5 = var5 + var7;
                          if (((jo) this).b(0, var4, var5) < 60) {
                            continue L3;
                          } else {
                            ((jo) this).field_Pb = var5;
                            ((jo) this).field_Rb = var4;
                            ((jo) this).e(23, -6904);
                            return;
                          }
                        }
                      }
                    } else {
                      var7 = 24;
                      L4: while (true) {
                        var4 = var4 + var6;
                        var5 = var5 + var7;
                        if (((jo) this).b(0, var4, var5) < 60) {
                          continue L4;
                        } else {
                          ((jo) this).field_Pb = var5;
                          ((jo) this).field_Rb = var4;
                          ((jo) this).e(23, -6904);
                          return;
                        }
                      }
                    }
                  } else {
                    var7 = -24;
                    L5: while (true) {
                      var4 = var4 + var6;
                      var5 = var5 + var7;
                      if (((jo) this).b(0, var4, var5) < 60) {
                        continue L5;
                      } else {
                        ((jo) this).field_Pb = var5;
                        ((jo) this).field_Rb = var4;
                        ((jo) this).e(23, -6904);
                        return;
                      }
                    }
                  }
                } else {
                  return;
                }
              } else {
                ((jo) this).e(23, -6904);
                return;
              }
            } else {
              L6: {
                ((jo) this).field_F = 23;
                if (-1 == ((jo) this).field_Rb) {
                  break L6;
                } else {
                  var10 = dj.field_e.field_H.a(true, ((jo) this).a(true), ((jo) this).field_Pb, ((jo) this).field_Rb, ((jo) this).f(237239984));
                  if (var10 == null) {
                    break L6;
                  } else {
                    var3_ref_kk = (kk) (Object) var10.b((byte) 26);
                    ((jo) this).field_Pb = var3_ref_kk.field_h;
                    ((jo) this).field_Rb = var3_ref_kk.field_l;
                    break L6;
                  }
                }
              }
              return;
            }
          } else {
            return;
          }
        } else {
          return;
        }
    }

    final static void x(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == -2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return;
                }
                case 2: {
                    if (null == ng.field_b) {
                        statePc = 8;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    var1 = (Object) (Object) ng.field_b;
                    // monitorenter ng.field_b
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        ng.field_b = null;
                        // monitorexit var1
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    return;
                }
                case 6: {
                    try {
                        var2 = caughtException;
                        // monitorexit var1
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var2;
                }
                case 8: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void o(byte param0) {
        field_Nb = null;
        if (param0 > -59) {
          jo.o((byte) -101);
          field_Tb = null;
          field_Ob = null;
          return;
        } else {
          field_Tb = null;
          field_Ob = null;
          return;
        }
    }

    jo(int param0, int param1, int param2) {
        super(param0, param1, param2);
        ((jo) this).field_Rb = -1;
        ((jo) this).field_Pb = -1;
        ((jo) this).field_pb = ((jo) this).field_Eb;
    }

    final void g(int param0) {
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        L0: {
          stackOut_0_0 = this;
          stackIn_2_0 = stackOut_0_0;
          stackIn_1_0 = stackOut_0_0;
          if ((((jo) this).field_F ^ -1) != -24) {
            stackOut_2_0 = this;
            stackOut_2_1 = 0;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            break L0;
          } else {
            stackOut_1_0 = this;
            stackOut_1_1 = 1;
            stackIn_3_0 = stackOut_1_0;
            stackIn_3_1 = stackOut_1_1;
            break L0;
          }
        }
        L1: {
          ((jo) this).field_Sb = stackIn_3_1 != 0;
          if (((jo) this).field_Sb) {
            ((jo) this).field_X = ((jo) this).field_Pb;
            ((jo) this).field_Y = ((jo) this).field_Rb;
            ((jo) this).c(0, ((jo) this).field_D / 2);
            break L1;
          } else {
            break L1;
          }
        }
        super.g(106);
        if (!((jo) this).field_Sb) {
          if (param0 <= 95) {
            jo.o((byte) -102);
            return;
          } else {
            return;
          }
        } else {
          if (1 != ((jo) this).field_F) {
            if (0 != ((jo) this).field_F) {
              if (param0 <= 95) {
                jo.o((byte) -102);
                return;
              } else {
                return;
              }
            } else {
              if (((jo) this).a(true) != ((jo) this).field_Rb) {
                ((jo) this).field_F = 23;
                if (param0 <= 95) {
                  jo.o((byte) -102);
                  return;
                } else {
                  return;
                }
              } else {
                if (((jo) this).f(237239984) == ((jo) this).field_Pb) {
                  ((jo) this).field_Pb = -1;
                  ((jo) this).field_Rb = -1;
                  ((jo) this).field_Sb = false;
                  ((jo) this).e(0, -6904);
                  ((jo) this).l((byte) 52);
                  if (param0 <= 95) {
                    jo.o((byte) -102);
                    return;
                  } else {
                    return;
                  }
                } else {
                  ((jo) this).field_F = 23;
                  if (param0 <= 95) {
                    jo.o((byte) -102);
                    return;
                  } else {
                    return;
                  }
                }
              }
            }
          } else {
            if (((jo) this).a(true) != ((jo) this).field_Rb) {
              ((jo) this).field_F = 23;
              if (param0 > 95) {
                return;
              } else {
                jo.o((byte) -102);
                return;
              }
            } else {
              if (((jo) this).f(237239984) == ((jo) this).field_Pb) {
                ((jo) this).field_Pb = -1;
                ((jo) this).field_Rb = -1;
                ((jo) this).field_Sb = false;
                ((jo) this).e(0, -6904);
                ((jo) this).l((byte) 52);
                if (param0 <= 95) {
                  jo.o((byte) -102);
                  return;
                } else {
                  return;
                }
              } else {
                ((jo) this).field_F = 23;
                if (param0 > 95) {
                  return;
                } else {
                  jo.o((byte) -102);
                  return;
                }
              }
            }
          }
        }
    }

    final static int w(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            de var2_ref = null;
            int var2 = 0;
            int stackIn_14_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_30_0 = 0;
            int stackIn_33_0 = 0;
            int stackIn_35_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_29_0 = 0;
            int stackOut_32_0 = 0;
            int stackOut_34_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if ((tf.field_c.field_h ^ -1) > -5) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if ((tf.field_c.field_e ^ -1) != 0) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        return 3;
                    }
                    case 3: {
                        if ((tf.field_c.field_e ^ -1) == 1) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 1;
                    }
                    case 5: {
                        return 4;
                    }
                    case 7: {
                        try {
                            var1_int = -73 / ((param0 - 36) / 39);
                            if (jd.field_a == 0) {
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
                            hi.field_O = lc.field_a.a(2, gd.field_u, bd.field_j);
                            jd.field_a = jd.field_a + 1;
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
                            if (jd.field_a != -2) {
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
                            if (-3 == hi.field_O.field_f) {
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
                            stackOut_13_0 = k.a(-1, 50);
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
                            if (hi.field_O.field_f == -2) {
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
                            jd.field_a = jd.field_a + 1;
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
                            if (-3 != jd.field_a) {
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
                            sb.field_a = new gm((java.net.Socket) hi.field_O.field_d, lc.field_a);
                            var2_ref = new de(13);
                            uj.a(ha.field_a, uj.field_d, (byte) -114, var2_ref, nd.field_a);
                            var2_ref.i(15, -101);
                            var2_ref.h(-116, wh.field_b);
                            sb.field_a.a(13, true, 0, var2_ref.field_h);
                            jd.field_a = jd.field_a + 1;
                            ul.field_e = 30000L + pd.a(-22826);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((jd.field_a ^ -1) != -4) {
                                statePc = 31;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (sb.field_a.b((byte) -80) <= 0) {
                                statePc = 27;
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
                            var2 = sb.field_a.a(false);
                            if (var2 != 0) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = k.a(var2, 50);
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return stackIn_25_0;
                    }
                    case 26: {
                        try {
                            jd.field_a = jd.field_a + 1;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if ((pd.a(-22826) ^ -1L) < (ul.field_e ^ -1L)) {
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
                            stackOut_29_0 = k.a(-2, 50);
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
                            if (4 != jd.field_a) {
                                statePc = 34;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            tf.field_c.a(bo.field_n, (Object) (Object) sb.field_a, 120);
                            sb.field_a = null;
                            jd.field_a = 0;
                            hi.field_O = null;
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 36;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0;
                    }
                    case 34: {
                        try {
                            stackOut_34_0 = -1;
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
                        return k.a(-3, 50);
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

    final void a(wk param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5_int = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        var9 = ZombieDawn.field_J;
        if (param1 == 5060) {
          var3 = param0.a(((jo) this).a(true), (byte) -107);
          var4 = param0.a(((jo) this).f(237239984), 0);
          bi.d(var3, var4, ((jo) this).field_Eb, 65535);
          if ((((jo) this).field_Rb ^ -1) != 0) {
            L0: {
              bi.e(var3, var4, param0.a(((jo) this).field_Rb, (byte) -74), param0.a(((jo) this).field_Pb, 0), 16711680);
              if (((jo) this).field_yb != null) {
                var5_int = param0.a(((jo) this).field_yb.a(true), (byte) -59);
                var6 = param0.a(((jo) this).field_yb.f(237239984), 0);
                bi.e(var3, 10 + var4 - 48, var5_int, -48 + (var6 - -10), 16776960);
                bj.field_q.c(Integer.toString(((jo) this).field_yb.field_F), var5_int, -48 + var6, 16777215, 0);
                break L0;
              } else {
                break L0;
              }
            }
            var5 = Integer.toString(((jo) this).field_F);
            var5 = Integer.toString(((jo) this).l(-111) & 127);
            var10 = 0;
            var6 = var10;
            L1: while (true) {
              if (((jo) this).field_ub <= var10) {
                bi.g(var3, var4, 3, 16776960);
                bj.field_q.c(var5, var3, -48 + var4, 16777215, 0);
                return;
              } else {
                var7 = param0.a(((jo) this).field_jb[var10], (byte) -62);
                var8 = param0.a(((jo) this).field_gb[var10], 0);
                bi.b(-1 + var7, var8 - 1, 3, 3, 0);
                bi.a(var7, var8, 65280);
                var10++;
                continue L1;
              }
            }
          } else {
            L2: {
              if (((jo) this).field_yb != null) {
                var5_int = param0.a(((jo) this).field_yb.a(true), (byte) -59);
                var6 = param0.a(((jo) this).field_yb.f(237239984), 0);
                bi.e(var3, 10 + var4 - 48, var5_int, -48 + (var6 - -10), 16776960);
                bj.field_q.c(Integer.toString(((jo) this).field_yb.field_F), var5_int, -48 + var6, 16777215, 0);
                break L2;
              } else {
                break L2;
              }
            }
            var5 = Integer.toString(((jo) this).field_F);
            var5 = Integer.toString(((jo) this).l(-111) & 127);
            var10 = 0;
            var6 = var10;
            L3: while (true) {
              if (((jo) this).field_ub <= var10) {
                bi.g(var3, var4, 3, 16776960);
                bj.field_q.c(var5, var3, -48 + var4, 16777215, 0);
                return;
              } else {
                var7 = param0.a(((jo) this).field_jb[var10], (byte) -62);
                var8 = param0.a(((jo) this).field_gb[var10], 0);
                bi.b(-1 + var7, var8 - 1, 3, 3, 0);
                bi.a(var7, var8, 65280);
                var10++;
                continue L3;
              }
            }
          }
        } else {
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Qb = 5;
        field_Nb = new char[]{(char)95, (char)97, (char)98, (char)99, (char)100, (char)101, (char)102, (char)103, (char)104, (char)105, (char)106, (char)107, (char)108, (char)109, (char)110, (char)111, (char)112, (char)113, (char)114, (char)115, (char)116, (char)117, (char)118, (char)119, (char)120, (char)121, (char)122, (char)48, (char)49, (char)50, (char)51, (char)52, (char)53, (char)54, (char)55, (char)56, (char)57};
        field_Tb = new vn[2][];
    }
}
