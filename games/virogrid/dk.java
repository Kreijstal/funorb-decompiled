/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

abstract class dk {
    static on field_e;
    static e field_j;
    static oj field_v;
    static String field_o;
    static String field_a;
    static lc field_s;
    static java.security.SecureRandom field_m;
    qk field_i;
    static String field_r;
    qk field_c;
    static rm[] field_q;
    static String field_u;
    qk field_p;
    qk field_h;
    jc field_t;
    int field_k;
    long field_f;
    volatile int field_b;
    jc field_n;
    volatile int field_l;
    byte field_g;
    ub field_d;

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            jc var2 = null;
            int stackIn_9_0 = 0;
            int stackIn_15_0 = 0;
            int stackIn_24_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_33_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_23_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_8_0 = 0;
            int stackOut_32_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (-5 < (ji.field_e.field_l ^ -1)) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (ji.field_e.field_b != -1) {
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
                        if ((ji.field_e.field_b ^ -1) != 1) {
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
                            if (param0 == 108) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            stackOut_8_0 = -123;
                            stackIn_9_0 = stackOut_8_0;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return stackIn_9_0;
                    }
                    case 10: {
                        try {
                            if (ij.field_q != -1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            vm.field_b = ii.field_a.a(ok.field_G, 27402, co.field_g);
                            ij.field_q = ij.field_q + 1;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (-2 != ij.field_q) {
                                statePc = 18;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (2 != vm.field_b.field_a) {
                                statePc = 16;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = bk.a(-1, 1);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (-2 != (vm.field_b.field_a ^ -1)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ij.field_q = ij.field_q + 1;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (2 != ij.field_q) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            ng.field_N = new el((java.net.Socket) vm.field_b.field_f, ii.field_a);
                            var2 = new jc(13);
                            hj.a(fd.field_C, var2, rj.field_l, ed.field_b, 12);
                            var2.a(15, param0 ^ -26);
                            var2.a(dl.field_c, (byte) -42);
                            ng.field_N.a(var2.field_g, param0 ^ 108, 0, 13);
                            ij.field_q = ij.field_q + 1;
                            sg.field_l = hc.a(-9986) + 30000L;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((ij.field_q ^ -1) != -4) {
                                statePc = 30;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (0 < ng.field_N.f(31479)) {
                                statePc = 25;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if ((hc.a(-9986) ^ -1L) >= (sg.field_l ^ -1L)) {
                                statePc = 30;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            stackOut_23_0 = bk.a(-2, 1);
                            stackIn_24_0 = stackOut_23_0;
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        return stackIn_24_0;
                    }
                    case 25: {
                        try {
                            var1_int = ng.field_N.a(param0 + -109);
                            if (0 != var1_int) {
                                statePc = 27;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            stackOut_27_0 = bk.a(var1_int, 1);
                            stackIn_28_0 = stackOut_27_0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        return stackIn_28_0;
                    }
                    case 29: {
                        try {
                            ij.field_q = ij.field_q + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (ij.field_q == 4) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            return -1;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ji.field_e.a(param0 ^ -17, fb.field_i, (Object) (Object) ng.field_N);
                            ng.field_N = null;
                            vm.field_b = null;
                            ij.field_q = 0;
                            stackOut_32_0 = 0;
                            stackIn_33_0 = stackOut_32_0;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        return stackIn_33_0;
                    }
                    case 34: {
                        var1 = (IOException) (Object) caughtException;
                        return bk.a(-3, param0 ^ 109);
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

    final ub a(byte param0, int param1, boolean param2, int param3, int param4) {
        long var6 = (long)param1 + ((long)param4 << -1150070304);
        ub var8 = new ub();
        var8.field_j = var6;
        var8.field_A = param0;
        var8.field_w = param2 ? true : false;
        if (param3 != -1150070304) {
            return null;
        }
        if (param2) {
            if (((dk) this).a((byte) -85) >= 20) {
                throw new RuntimeException();
            }
            ((dk) this).field_i.a((wb) (Object) var8, (byte) 96);
        } else {
            if (-21 < (((dk) this).e(114) ^ -1)) {
                ((dk) this).field_p.a((wb) (Object) var8, (byte) 112);
                return var8;
            }
            throw new RuntimeException();
        }
        return var8;
    }

    abstract void a(int param0, boolean param1, Object param2);

    final int a(byte param0) {
        int var2 = -80 % ((52 - param0) / 62);
        return ((dk) this).field_i.b(0) + ((dk) this).field_c.b(0);
    }

    abstract void d(byte param0);

    final boolean c(int param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 20) {
          L0: {
            ((dk) this).b(3);
            if (((dk) this).e(108) < 20) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if (((dk) this).e(108) < 20) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    final boolean c(byte param0) {
        int stackIn_4_0 = 0;
        int stackIn_8_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_6_0 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        if (param0 != 113) {
          L0: {
            ((dk) this).field_k = -48;
            if ((((dk) this).a((byte) -11) ^ -1) > -21) {
              stackOut_7_0 = 0;
              stackIn_8_0 = stackOut_7_0;
              break L0;
            } else {
              stackOut_6_0 = 1;
              stackIn_8_0 = stackOut_6_0;
              break L0;
            }
          }
          return stackIn_8_0 != 0;
        } else {
          L1: {
            if ((((dk) this).a((byte) -11) ^ -1) > -21) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L1;
            } else {
              stackOut_2_0 = 1;
              stackIn_4_0 = stackOut_2_0;
              break L1;
            }
          }
          return stackIn_4_0 != 0;
        }
    }

    public static void a(int param0) {
        field_r = null;
        field_q = null;
        field_m = null;
        field_j = null;
        int var1 = 68 % ((param0 - -29) / 43);
        field_o = null;
        field_e = null;
        field_s = null;
        field_v = null;
        field_u = null;
        field_a = null;
    }

    abstract boolean d(int param0);

    final int e(int param0) {
        if (param0 <= 79) {
          int discarded$2 = ((dk) this).e(-30);
          return ((dk) this).field_p.b(0) - -((dk) this).field_h.b(0);
        } else {
          return ((dk) this).field_p.b(0) - -((dk) this).field_h.b(0);
        }
    }

    final static void f(int param0) {
        if (param0 == 389) {
          tm.field_l.a((byte) 76);
          if (null == md.field_i) {
            md.field_i = new vc(tm.field_l, vd.field_X);
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          } else {
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          }
        } else {
          int discarded$5 = dk.b((byte) 100);
          tm.field_l.a((byte) 76);
          if (null != md.field_i) {
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          } else {
            md.field_i = new vc(tm.field_l, vd.field_X);
            tm.field_l.a(param0 + -389, (fi) (Object) md.field_i);
            return;
          }
        }
    }

    abstract void b(int param0);

    dk() {
        ((dk) this).field_i = new qk();
        ((dk) this).field_c = new qk();
        ((dk) this).field_p = new qk();
        ((dk) this).field_h = new qk();
        ((dk) this).field_t = new jc(6);
        ((dk) this).field_l = 0;
        ((dk) this).field_b = 0;
        ((dk) this).field_g = (byte) 0;
        ((dk) this).field_n = new jc(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new on();
        field_a = "Month";
        field_o = "You can spectate this game";
        field_r = "Please select an option in the '<%0>' row.";
        field_s = new lc(12, 0, 1, 0);
        field_u = "to keep fullscreen or";
    }
}
