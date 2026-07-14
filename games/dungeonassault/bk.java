/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bk implements Runnable {
    volatile vn[] field_g;
    static hd field_b;
    static String[] field_f;
    static String field_c;
    static ph field_e;
    qg field_h;
    volatile boolean field_d;
    volatile boolean field_a;

    public static void a(boolean param0) {
        if (param0) {
            String discarded$0 = bk.b(89);
        }
        field_c = null;
        field_b = null;
        field_e = null;
        field_f = null;
    }

    final static String b(int param0) {
        if (param0 != 1) {
            field_e = null;
        }
        if (ti.field_f) {
            return null;
        }
        if (no.field_a < lp.field_z) {
            return null;
        }
        if (!(lp.field_z - -ga.field_p <= no.field_a)) {
            return vj.field_c;
        }
        return null;
    }

    final static int a(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            ec var2 = null;
            int stackIn_14_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_13_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 > hb.field_a.field_h) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (0 == (hb.field_a.field_c ^ -1)) {
                            statePc = 3;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    }
                    case 3: {
                        return 3;
                    }
                    case 4: {
                        if (hb.field_a.field_c == -2) {
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
                            if (ba.field_f == 0) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            qi.field_e = kn.field_f.a(param0 ^ -119, lk.field_T, of.field_d);
                            ba.field_f = ba.field_f + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if ((ba.field_f ^ -1) == -2) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (qi.field_e.field_c != 2) {
                                statePc = 15;
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
                            stackOut_13_0 = dl.a(-5, -1);
                            stackIn_14_0 = stackOut_13_0;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return stackIn_14_0;
                    }
                    case 15: {
                        try {
                            if (qi.field_e.field_c == 1) {
                                statePc = 17;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ba.field_f = ba.field_f + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if ((ba.field_f ^ -1) != -3) {
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
                            pe.field_l = new rk((java.net.Socket) qi.field_e.field_f, kn.field_f);
                            var2 = new ec(13);
                            rg.a(ri.field_b, var2, pj.field_a, param0 + 127, j.field_J);
                            var2.a(6, 15);
                            var2.a((byte) 63, ng.field_I);
                            pe.field_l.b(var2.field_m, false, 0, 13);
                            ba.field_f = ba.field_f + 1;
                            ce.field_s = kd.c(param0 + -2456) - -30000L;
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
                            if (ba.field_f != 3) {
                                statePc = 30;
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
                            if (0 >= pe.field_l.a(0)) {
                                statePc = 26;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var1_int = pe.field_l.a((byte) -108);
                            if (0 == var1_int) {
                                statePc = 25;
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
                            stackOut_23_0 = dl.a(-5, var1_int);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            ba.field_f = ba.field_f + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((kd.c(-2456) ^ -1L) < (ce.field_s ^ -1L)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = dl.a(param0 + -5, -2);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            if (param0 == 0) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            field_f = null;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if ((ba.field_f ^ -1) != -5) {
                                statePc = 35;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            hb.field_a.a((Object) (Object) pe.field_l, kn.field_c, (byte) 118);
                            pe.field_l = null;
                            ba.field_f = 0;
                            qi.field_e = null;
                            stackOut_33_0 = 0;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        try {
                            stackOut_35_0 = -1;
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
                        return dl.a(-5, -3);
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

    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        L0: {
          var6 = DungeonAssault.field_K;
          var2 = 0;
          var3 = nl.field_d;
          if (var3 > -6) {
            var2 = 8192 * (var3 * var3) / 1100;
            break L0;
          } else {
            if (-106 > var3) {
              var2 = (-40960 + var3 * 16384) / 220;
              break L0;
            } else {
              if (var3 >= 120) {
                break L0;
              } else {
                var3 = -var3 + 120;
                var2 = -(var3 * (var3 * 8192) / 3300) + 8192;
                break L0;
              }
            }
          }
        }
        L1: {
          var4 = 1;
          var5 = 0;
          if (param1 != 1) {
            break L1;
          } else {
            var5 = 1;
            break L1;
          }
        }
        L2: {
          if (param1 != -4) {
            break L2;
          } else {
            var4 = -1;
            break L2;
          }
        }
        L3: {
          if (-5 != param1) {
            break L3;
          } else {
            var4 = 1;
            var5 = 1;
            break L3;
          }
        }
        L4: {
          if (5 == param1) {
            var4 = -1;
            var5 = 1;
            break L4;
          } else {
            break L4;
          }
        }
        L5: {
          if ((param1 ^ -1) != -7) {
            break L5;
          } else {
            var4 = 1;
            var5 = -1;
            break L5;
          }
        }
        L6: {
          L7: {
            if (param1 == param0) {
              break L7;
            } else {
              if ((param1 ^ -1) == -9) {
                break L7;
              } else {
                break L6;
              }
            }
          }
          var5 = -1;
          var4 = -1;
          break L6;
        }
        L8: {
          if (param1 == 11) {
            var4 = -1;
            break L8;
          } else {
            break L8;
          }
        }
        L9: {
          if (12 == param1) {
            var5 = -1;
            var4 = -1;
            break L9;
          } else {
            break L9;
          }
        }
        L10: {
          if (param1 == 13) {
            var5 = -1;
            var4 = 1;
            break L10;
          } else {
            break L10;
          }
        }
        L11: {
          if (-15 == (param1 ^ -1)) {
            var4 = -1;
            var5 = 1;
            break L11;
          } else {
            break L11;
          }
        }
        L12: {
          if (param1 != 15) {
            break L12;
          } else {
            var5 = 1;
            var4 = 1;
            break L12;
          }
        }
        pj.field_e = vf.a(var5 * var2, var2 * var4, (byte) 84);
    }

    public final void run() {
        int var1_int = 0;
        vn var2 = null;
        int var4 = DungeonAssault.field_K;
        ((bk) this).field_d = true;
        try {
            while (!((bk) this).field_a) {
                for (var1_int = 0; var1_int < 2; var1_int++) {
                    var2 = ((bk) this).field_g[var1_int];
                    if (var2 == null) {
                    } else {
                        var2.a();
                    }
                }
                pj.a(0, 10L);
                Object var5 = null;
                ho.a(((bk) this).field_h, (Object) null, (byte) -32);
            }
        } catch (Exception exception) {
            Object var6 = null;
            sm.a((Throwable) (Object) exception, 1, (String) null);
        } finally {
            ((bk) this).field_d = false;
        }
    }

    final static void a(qk param0, byte param1, int param2, int param3, int param4, qk param5) {
        ci.field_j = param4;
        oh.field_t = param3;
        om.field_d = param5;
        gd.field_G = param0;
        h.field_q = param2;
        if (param1 != -40) {
            field_c = null;
        }
    }

    bk() {
        ((bk) this).field_g = new vn[2];
        ((bk) this).field_a = false;
        ((bk) this).field_d = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Type your email address again to make sure it's correct";
        field_f = new String[]{null, "<%guardians> require a raider either to <%dodge> (testing against the room's <%snare>), or, more commonly, <%sneak> (against the room's <%detect>)"};
    }
}
