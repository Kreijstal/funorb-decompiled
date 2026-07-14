/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sj {
    static bd field_g;
    static int[] field_f;
    static int[] field_h;
    static String field_d;
    static ub field_c;
    static bd field_b;
    static sg field_a;
    static bd field_e;

    public static void a(byte param0) {
        if (param0 != 58) {
          field_h = null;
          field_c = null;
          field_h = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_c = null;
          field_h = null;
          field_f = null;
          field_e = null;
          field_b = null;
          field_g = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    final static int a(boolean param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            vi var2 = null;
            int stackIn_17_0 = 0;
            int stackIn_27_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_16_0 = 0;
            int stackOut_26_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (ig.field_N.field_k < 4) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (0 != (ig.field_N.field_e ^ -1)) {
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
                        if (-2 != ig.field_N.field_e) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 4: {
                        return 4;
                    }
                    case 5: {
                        return 1;
                    }
                    case 7: {
                        if (param0) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        field_b = null;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            if (ce.field_e == 0) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            db.field_o = jj.field_k.a(fk.field_a, 76, mb.field_p);
                            ce.field_e = ce.field_e + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if ((ce.field_e ^ -1) == -2) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (db.field_o.field_f == -3) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackOut_16_0 = th.a((byte) 125, -1);
                            stackIn_17_0 = stackOut_16_0;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        return stackIn_17_0;
                    }
                    case 18: {
                        try {
                            if (-2 != db.field_o.field_f) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ce.field_e = ce.field_e + 1;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((ce.field_e ^ -1) != -3) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            be.field_g = new td((java.net.Socket) db.field_o.field_c, jj.field_k);
                            var2 = new vi(13);
                            hm.a(ab.field_c, mm.field_s, var2, nj.field_a, 4122);
                            var2.d(87, 15);
                            var2.b(ik.field_a, 25251);
                            be.field_g.a(13, var2.field_n, (byte) -70, 0);
                            ce.field_e = ce.field_e + 1;
                            cb.field_e = hn.a((byte) 80) - -30000L;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (3 != ce.field_e) {
                                statePc = 33;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-1 <= (be.field_g.b((byte) 53) ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var1_int = be.field_g.d((byte) 97);
                            if (var1_int != 0) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            stackOut_26_0 = th.a((byte) 122, var1_int);
                            stackIn_27_0 = stackOut_26_0;
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        return stackIn_27_0;
                    }
                    case 28: {
                        try {
                            ce.field_e = ce.field_e + 1;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((hn.a((byte) 80) ^ -1L) < (cb.field_e ^ -1L)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = th.a((byte) 127, -2);
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            if ((ce.field_e ^ -1) == -5) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            ig.field_N.a(kd.field_q, (byte) 75, (Object) (Object) be.field_g);
                            ce.field_e = 0;
                            db.field_o = null;
                            be.field_g = null;
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        var1 = (IOException) (Object) caughtException;
                        return th.a((byte) 127, -3);
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

    final static void b(boolean param0) {
        int var3 = 0;
        int var4 = HostileSpawn.field_I ? 1 : 0;
        ji var1 = cl.field_o;
        ji var2 = bb.field_e;
        if (!((bm.field_c ^ -1) != -2)) {
            var2 = ua.field_f;
            var1 = en.field_u;
        }
        if (ii.b((byte) 30)) {
            var1 = bb.field_b;
        }
        ha.field_w.field_F.a(param0, (byte) 123, var1);
        ha.field_w.field_C.a(true, (byte) 123, uk.field_d);
        ha.field_w.field_B = var2;
        ha.field_w.field_n.a(true, (byte) 12, var2);
        ni.field_e = (null != q.field_g ? q.field_g : ue.field_a).a(mm.field_m[0].field_j, false, (byte) 109);
        ha.field_w.field_w = ni.field_e ? -1048576 : 1048576;
        ha.field_w.field_r = 128;
        ha.field_w.field_l = true;
        mb.field_s.a(256);
        for (var3 = 0; -17 < (var3 ^ -1); var3++) {
            mb.field_s.field_n.a(0, var3, (byte) -95);
        }
    }

    final static void a(int[] param0, oj param1, int param2, int param3, int param4) {
        if (param4 == 0) {
          L0: {
            if (-1 <= (param1.field_I ^ -1)) {
              break L0;
            } else {
              if (ln.field_a.field_y[param3] != 82) {
                break L0;
              } else {
                param0[param3 + -param2] = 2;
                param0[param3] = 2;
                param0[param3 + param2] = 2;
                return;
              }
            }
          }
          if (param0[param3 - param2] != 2) {
            L1: {
              if (2 == param0[param3]) {
                param0[param3] = 0;
                break L1;
              } else {
                break L1;
              }
            }
            if (param0[param2 + param3] != 2) {
              ln.field_a.field_y[-param2 + param3] = 144;
              ln.field_a.field_y[param3] = 152;
              ln.field_a.field_y[param2 + param3] = 145;
              param1.field_i = -1;
              return;
            } else {
              param0[param2 + param3] = 0;
              ln.field_a.field_y[-param2 + param3] = 144;
              ln.field_a.field_y[param3] = 152;
              ln.field_a.field_y[param2 + param3] = 145;
              param1.field_i = -1;
              return;
            }
          } else {
            L2: {
              param0[param3 + -param2] = 0;
              if (2 == param0[param3]) {
                param0[param3] = 0;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0[param2 + param3] != 2) {
                ln.field_a.field_y[-param2 + param3] = 144;
                ln.field_a.field_y[param3] = 152;
                ln.field_a.field_y[param2 + param3] = 145;
                param1.field_i = -1;
                break L3;
              } else {
                param0[param2 + param3] = 0;
                ln.field_a.field_y[-param2 + param3] = 144;
                ln.field_a.field_y[param3] = 152;
                ln.field_a.field_y[param2 + param3] = 145;
                param1.field_i = -1;
                break L3;
              }
            }
            return;
          }
        } else {
          sj.b(true);
          if (-1 > (param1.field_I ^ -1)) {
            if (ln.field_a.field_y[param3] != 82) {
              L4: {
                if (param0[param3 - param2] != 2) {
                  break L4;
                } else {
                  param0[param3 + -param2] = 0;
                  break L4;
                }
              }
              L5: {
                if (2 == param0[param3]) {
                  param0[param3] = 0;
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (param0[param2 + param3] != 2) {
                  ln.field_a.field_y[-param2 + param3] = 144;
                  ln.field_a.field_y[param3] = 152;
                  ln.field_a.field_y[param2 + param3] = 145;
                  param1.field_i = -1;
                  break L6;
                } else {
                  param0[param2 + param3] = 0;
                  ln.field_a.field_y[-param2 + param3] = 144;
                  ln.field_a.field_y[param3] = 152;
                  ln.field_a.field_y[param2 + param3] = 145;
                  param1.field_i = -1;
                  break L6;
                }
              }
              return;
            } else {
              param0[param3 + -param2] = 2;
              param0[param3] = 2;
              param0[param3 + param2] = 2;
              return;
            }
          } else {
            L7: {
              if (param0[param3 - param2] != 2) {
                break L7;
              } else {
                param0[param3 + -param2] = 0;
                break L7;
              }
            }
            L8: {
              if (2 == param0[param3]) {
                param0[param3] = 0;
                break L8;
              } else {
                break L8;
              }
            }
            L9: {
              if (param0[param2 + param3] != 2) {
                ln.field_a.field_y[-param2 + param3] = 144;
                ln.field_a.field_y[param3] = 152;
                ln.field_a.field_y[param2 + param3] = 145;
                param1.field_i = -1;
                break L9;
              } else {
                param0[param2 + param3] = 0;
                ln.field_a.field_y[-param2 + param3] = 144;
                ln.field_a.field_y[param3] = 152;
                ln.field_a.field_y[param2 + param3] = 145;
                param1.field_i = -1;
                break L9;
              }
            }
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new int[8192];
        field_d = "There are unusual life signs on the ship, so be careful in your search. Proceed towards your objective.";
        field_h = new int[]{370, 370, 410};
        field_c = new ub();
    }
}
