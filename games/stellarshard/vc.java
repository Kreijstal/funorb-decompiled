/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class vc {
    static int[] field_b;
    String field_j;
    static long field_a;
    String field_c;
    static stellarshard field_h;
    static String field_g;
    String field_d;
    int field_i;
    static int[] field_f;
    pf field_e;

    public static void a(int param0) {
        if (param0 != -1) {
            return;
        }
        field_h = null;
        field_b = null;
        field_g = null;
        field_f = null;
    }

    final static pb a(pf param0, int param1, int param2, int param3) {
        if (param3 == -2) {
          if (!tl.a(param0, (byte) -5, param2, param1)) {
            return null;
          } else {
            return vg.c((byte) -118);
          }
        } else {
          field_a = 32L;
          if (!tl.a(param0, (byte) -5, param2, param1)) {
            return null;
          } else {
            return vg.c((byte) -118);
          }
        }
    }

    final static void a(byte param0, boolean param1, boolean param2) {
        if (param0 >= -61) {
          L0: {
            int discarded$9 = vc.a((byte) 54);
            if (!param2) {
              ti.d();
              ti.d();
              ti.d();
              break L0;
            } else {
              ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
              break L0;
            }
          }
          af.a(param2, (byte) -98);
          return;
        } else {
          L1: {
            if (!param2) {
              ti.d();
              ti.d();
              ti.d();
              break L1;
            } else {
              ti.b(0, 0, ti.field_i, ti.field_b, 0, 192);
              break L1;
            }
          }
          af.a(param2, (byte) -98);
          return;
        }
    }

    final static int a(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            int var2 = 0;
            ka var3 = null;
            int stackIn_15_0 = 0;
            int stackIn_25_0 = 0;
            int stackIn_28_0 = 0;
            int stackIn_32_0 = 0;
            int stackIn_34_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_14_0 = 0;
            int stackOut_24_0 = 0;
            int stackOut_27_0 = 0;
            int stackOut_31_0 = 0;
            int stackOut_33_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 > od.field_v.field_i) {
                            statePc = 8;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (od.field_v.field_g == -1) {
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
                        if (-2 == od.field_v.field_g) {
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
                    case 8: {
                        try {
                            if (kc.field_b == 0) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            dl.field_A = fa.field_p.a(field_g, (byte) 34, ll.field_b);
                            kc.field_b = kc.field_b + 1;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (kc.field_b != 1) {
                                statePc = 19;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if ((dl.field_A.field_f ^ -1) == -3) {
                                statePc = 14;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            stackOut_14_0 = tc.a(-1, (byte) 127);
                            stackIn_15_0 = stackOut_14_0;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return stackIn_15_0;
                    }
                    case 16: {
                        try {
                            if (1 == dl.field_A.field_f) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            kc.field_b = kc.field_b + 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((kc.field_b ^ -1) != -3) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            k.field_b = new fh((java.net.Socket) dl.field_A.field_b, fa.field_p);
                            var3 = new ka(13);
                            bk.a(fd.field_nb, false, sk.field_b, var3, ld.field_C);
                            var3.a(false, 15);
                            var3.b(0, n.field_d);
                            k.field_b.a(var3.field_r, 0, 120, 13);
                            kc.field_b = kc.field_b + 1;
                            fj.field_j = ih.a((byte) -98) + 30000L;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var1_int = 23 / ((param0 - -55) / 60);
                            if (-4 != kc.field_b) {
                                statePc = 30;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (-1 < k.field_b.b(-95)) {
                                statePc = 26;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if ((fj.field_j ^ -1L) <= (ih.a((byte) -98) ^ -1L)) {
                                statePc = 30;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            stackOut_24_0 = tc.a(-2, (byte) 126);
                            stackIn_25_0 = stackOut_24_0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        return stackIn_25_0;
                    }
                    case 26: {
                        try {
                            var2 = k.field_b.a(0);
                            if (-1 == (var2 ^ -1)) {
                                statePc = 29;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            stackOut_27_0 = tc.a(var2, (byte) 125);
                            stackIn_28_0 = stackOut_27_0;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        return stackIn_28_0;
                    }
                    case 29: {
                        try {
                            kc.field_b = kc.field_b + 1;
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (4 != kc.field_b) {
                                statePc = 33;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            od.field_v.a(sd.field_i, (Object) (Object) k.field_b, 70);
                            dl.field_A = null;
                            k.field_b = null;
                            kc.field_b = 0;
                            stackOut_31_0 = 0;
                            stackIn_32_0 = stackOut_31_0;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        return stackIn_32_0;
                    }
                    case 33: {
                        try {
                            stackOut_33_0 = -1;
                            stackIn_34_0 = stackOut_33_0;
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 35;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        return stackIn_34_0;
                    }
                    case 35: {
                        var1 = (IOException) (Object) caughtException;
                        return tc.a(-3, (byte) 125);
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

    private vc() throws Throwable {
        throw new Error();
    }

    static {
    }
}
