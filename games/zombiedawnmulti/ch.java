/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ch {
    static boolean[][] field_g;
    static int field_i;
    static String field_h;
    static String field_j;
    static String field_a;
    static byte[] field_c;
    static boolean field_e;
    static boolean field_k;
    static ja[] field_b;
    private th field_d;
    private br field_f;

    final static boolean a(int param0, boolean param1) {
        if (!param1) {
          if (param0 >= 32) {
            if (38 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          ch.d(76);
          if (param0 >= 32) {
            if (38 < param0) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static int b(int param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            k var2 = null;
            int stackIn_15_0 = 0;
            int stackIn_23_0 = 0;
            int stackIn_29_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_36_0 = 0;
            int stackIn_38_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_22_0 = 0;
            int stackOut_28_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_35_0 = 0;
            int stackOut_37_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 > i.field_a.field_n) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (i.field_a.field_p != 0) {
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
                        if (1 != i.field_a.field_p) {
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
                        try {
                            if (-1 == (la.field_d ^ -1)) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            vo.field_o = p.field_a.a(vg.field_r, qe.field_f, (byte) -120);
                            la.field_d = la.field_d + 1;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (la.field_d == -2) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (-3 == vo.field_o.field_f) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = u.b(-1, 5);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (1 != vo.field_o.field_f) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            la.field_d = la.field_d + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (la.field_d == 2) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            vh.field_Gb = new ej((java.net.Socket) vo.field_o.field_d, p.field_a);
                            var2 = new k(13);
                            mo.a(o.field_b, var2, ej.field_q, db.field_e, (byte) -124);
                            var2.a(param0 + -19244, 15);
                            var2.b(-128, kk.field_q);
                            vh.field_Gb.a(0, -100, 13, var2.field_m);
                            la.field_d = la.field_d + 1;
                            li.field_A = 30000L + bl.a((byte) 43);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (param0 == 19352) {
                                statePc = 24;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = 36;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return stackIn_23_0;
                    }
                    case 24: {
                        try {
                            if ((la.field_d ^ -1) != -4) {
                                statePc = 34;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if ((vh.field_Gb.a(116) ^ -1) < -1) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (bl.a((byte) 124) > li.field_A) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            stackOut_28_0 = u.b(-2, param0 + -19347);
                            stackIn_29_0 = stackOut_28_0;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        return stackIn_29_0;
                    }
                    case 30: {
                        try {
                            var1_int = vh.field_Gb.c((byte) 59);
                            if (-1 == (var1_int ^ -1)) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            stackOut_31_0 = u.b(var1_int, 5);
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            la.field_d = la.field_d + 1;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (4 != la.field_d) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            i.field_a.a(k.field_f, (Object) (Object) vh.field_Gb, 104);
                            vo.field_o = null;
                            la.field_d = 0;
                            vh.field_Gb = null;
                            stackOut_35_0 = 0;
                            stackIn_36_0 = stackOut_35_0;
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        return stackIn_36_0;
                    }
                    case 37: {
                        try {
                            stackOut_37_0 = -1;
                            stackIn_38_0 = stackOut_37_0;
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 39;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        return stackIn_38_0;
                    }
                    case 39: {
                        var1 = (IOException) (Object) caughtException;
                        return u.b(-3, 5);
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

    public static void d(int param0) {
        field_c = null;
        field_a = null;
        if (param0 != -1) {
          ch.d(-29);
          field_g = null;
          field_h = null;
          field_b = null;
          field_j = null;
          return;
        } else {
          field_g = null;
          field_h = null;
          field_b = null;
          field_j = null;
          return;
        }
    }

    final br b(int param0, br param1) {
        br var3 = null;
        if (param0 != -4) {
            boolean discarded$8 = ch.a(92, false);
            if (param1 == null) {
                var3 = ((ch) this).field_d.field_b.field_b;
            } else {
                var3 = param1;
            }
            if (!(var3 != ((ch) this).field_d.field_b)) {
                ((ch) this).field_f = null;
                return null;
            }
            ((ch) this).field_f = var3.field_b;
            return var3;
        }
        if (param1 == null) {
            var3 = ((ch) this).field_d.field_b.field_b;
        } else {
            var3 = param1;
        }
        if (!(var3 != ((ch) this).field_d.field_b)) {
            ((ch) this).field_f = null;
            return null;
        }
        ((ch) this).field_f = var3.field_b;
        return var3;
    }

    final br a(int param0, br param1) {
        br var3 = null;
        L0: {
          if (param1 == null) {
            var3 = ((ch) this).field_d.field_b.field_d;
            break L0;
          } else {
            var3 = param1;
            break L0;
          }
        }
        if (var3 != ((ch) this).field_d.field_b) {
          ((ch) this).field_f = var3.field_d;
          if (param0 != 2680) {
            boolean discarded$2 = ch.a(95, true);
            return var3;
          } else {
            return var3;
          }
        } else {
          ((ch) this).field_f = null;
          return null;
        }
    }

    final br e(int param0) {
        br var2 = null;
        if (param0 != -3) {
            field_i = -81;
            var2 = ((ch) this).field_f;
            if (!(((ch) this).field_d.field_b != var2)) {
                ((ch) this).field_f = null;
                return null;
            }
            ((ch) this).field_f = var2.field_b;
            return var2;
        }
        var2 = ((ch) this).field_f;
        if (!(((ch) this).field_d.field_b != var2)) {
            ((ch) this).field_f = null;
            return null;
        }
        ((ch) this).field_f = var2.field_b;
        return var2;
    }

    final br c(int param0) {
        br var2 = null;
        var2 = ((ch) this).field_d.field_b.field_d;
        if (var2 != ((ch) this).field_d.field_b) {
          if (param0 != -3) {
            field_g = null;
            ((ch) this).field_f = var2.field_d;
            return var2;
          } else {
            ((ch) this).field_f = var2.field_d;
            return var2;
          }
        } else {
          ((ch) this).field_f = null;
          return null;
        }
    }

    final br a(int param0) {
        br var2 = null;
        var2 = ((ch) this).field_d.field_b.field_b;
        if (var2 != ((ch) this).field_d.field_b) {
          if (param0 != 32397) {
            br discarded$2 = ((ch) this).c(62);
            ((ch) this).field_f = var2.field_b;
            return var2;
          } else {
            ((ch) this).field_f = var2.field_b;
            return var2;
          }
        } else {
          ((ch) this).field_f = null;
          return null;
        }
    }

    final br a(byte param0) {
        br var2 = null;
        if (param0 < -26) {
          var2 = ((ch) this).field_f;
          if (var2 == ((ch) this).field_d.field_b) {
            ((ch) this).field_f = null;
            return null;
          } else {
            ((ch) this).field_f = var2.field_d;
            return var2;
          }
        } else {
          field_e = true;
          var2 = ((ch) this).field_f;
          if (var2 == ((ch) this).field_d.field_b) {
            ((ch) this).field_f = null;
            return null;
          } else {
            ((ch) this).field_f = var2.field_d;
            return var2;
          }
        }
    }

    ch(th param0) {
        ((ch) this).field_d = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Chat view has been scrolled up. Scroll down to chat.";
    }
}
