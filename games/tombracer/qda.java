/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

abstract class qda {
    vj field_e;
    static String field_l;
    vj field_m;
    static String field_f;
    static int field_i;
    static String field_b;
    vj field_c;
    vj field_k;
    long field_j;
    uia field_o;
    int field_p;
    uia field_h;
    volatile int field_n;
    volatile int field_a;
    byte field_d;
    qqa field_g;

    public static void c(byte param0) {
        if (param0 != 0) {
            field_l = null;
        }
        field_b = null;
        field_l = null;
        field_f = null;
    }

    final boolean d(int param0) {
        if (param0 != -21) {
            boolean discarded$0 = ((qda) this).b(-15);
        }
        return -21 >= (((qda) this).f(-3) ^ -1) ? true : false;
    }

    final int f(int param0) {
        if (param0 != -3) {
            int discarded$0 = qda.b((byte) 52);
        }
        return ((qda) this).field_e.a((byte) -56) - -((qda) this).field_m.a((byte) -92);
    }

    final static void a(int param0, int param1) {
        int var3 = TombRacer.field_G ? 1 : 0;
        if (param1 != -21) {
            return;
        }
        toa var4 = (toa) (Object) vsa.field_m.f(-80);
        while (var4 != null) {
            uca.a(param0, var4, (byte) 93);
            var4 = (toa) (Object) vsa.field_m.e(113);
        }
        ik var5 = (ik) (Object) hca.field_I.f(param1 ^ 91);
        while (var5 != null) {
            fna.a(param0, -23814, var5);
            var5 = (ik) (Object) hca.field_I.e(121);
        }
    }

    final static int b(byte param0) {
        try {
            IOException var1 = null;
            int var1_int = 0;
            uia var2 = null;
            int stackIn_16_0 = 0;
            int stackIn_26_0 = 0;
            int stackIn_31_0 = 0;
            int stackIn_34_0 = 0;
            int stackIn_36_0 = 0;
            Throwable decompiledCaughtException = null;
            int stackOut_15_0 = 0;
            int stackOut_25_0 = 0;
            int stackOut_30_0 = 0;
            int stackOut_33_0 = 0;
            int stackOut_35_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (4 > wg.field_l.field_a) {
                            statePc = 7;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        if (0 == (wg.field_l.field_n ^ -1)) {
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
                        if (wg.field_l.field_n != -2) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return 4;
                    }
                    case 6: {
                        return 1;
                    }
                    case 7: {
                        if (param0 == -66) {
                            statePc = 9;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    }
                    case 8: {
                        return -114;
                    }
                    case 9: {
                        try {
                            if (cma.field_m == 0) {
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
                            bga.field_c = oi.field_a.a(-24818, pca.field_a, du.field_d);
                            cma.field_m = cma.field_m + 1;
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
                            if (cma.field_m == 1) {
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
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (2 != bga.field_c.field_b) {
                                statePc = 17;
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
                            stackOut_15_0 = du.a(-1, (byte) 122);
                            stackIn_16_0 = stackOut_15_0;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        return stackIn_16_0;
                    }
                    case 17: {
                        try {
                            if (bga.field_c.field_b != 1) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            cma.field_m = cma.field_m + 1;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((cma.field_m ^ -1) != -3) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            jia.field_a = new jqa((java.net.Socket) bga.field_c.field_f, oi.field_a);
                            var2 = new uia(13);
                            ea.a((byte) 107, pu.field_b, var2, wk.field_n, joa.field_a);
                            var2.i(15, 0);
                            var2.a(wea.field_a, (byte) 117);
                            jia.field_a.a(var2.field_g, 0, 13, 106);
                            cma.field_m = cma.field_m + 1;
                            pm.field_n = 30000L + bva.b((byte) -107);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (cma.field_m == 3) {
                                statePc = 23;
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
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if ((jia.field_a.c(0) ^ -1) >= -1) {
                                statePc = 28;
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
                            var1_int = jia.field_a.d(-2147483648);
                            if (var1_int == 0) {
                                statePc = 27;
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
                            stackOut_25_0 = du.a(var1_int, (byte) -26);
                            stackIn_26_0 = stackOut_25_0;
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        return stackIn_26_0;
                    }
                    case 27: {
                        try {
                            cma.field_m = cma.field_m + 1;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (bva.b((byte) -107) > pm.field_n) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            stackOut_30_0 = du.a(-2, (byte) 17);
                            stackIn_31_0 = stackOut_30_0;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 37;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        return stackIn_31_0;
                    }
                    case 32: {
                        try {
                            if (4 != cma.field_m) {
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
                            wg.field_l.a((Object) (Object) jia.field_a, (byte) 54, vga.field_q);
                            cma.field_m = 0;
                            jia.field_a = null;
                            bga.field_c = null;
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
                        return du.a(-3, (byte) -93);
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

    abstract void a(int param0);

    abstract void e(int param0);

    abstract boolean c(int param0);

    abstract void a(Object param0, byte param1, boolean param2);

    final boolean b(int param0) {
        if (param0 != -21) {
            ((qda) this).field_o = null;
        }
        return -21 >= (((qda) this).a((byte) 78) ^ -1) ? true : false;
    }

    final static int a(BitSet param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          var2 = 0;
          if (param1 >= 80) {
            break L0;
          } else {
            field_i = 11;
            break L0;
          }
        }
        var3 = 0;
        L1: while (true) {
          if (var3 >= param0.size()) {
            return var2;
          } else {
            if (param0.get(var3)) {
              var2++;
              var3++;
              continue L1;
            } else {
              var3++;
              continue L1;
            }
          }
        }
    }

    final int a(byte param0) {
        if (param0 != 78) {
            ((qda) this).field_k = null;
        }
        return ((qda) this).field_c.a((byte) -77) + ((qda) this).field_k.a((byte) -43);
    }

    final qqa a(int param0, boolean param1, int param2, int param3, byte param4) {
        long var6 = ((long)param2 << -133217952) - -(long)param0;
        qqa var8 = new qqa();
        var8.field_j = var6;
        if (param3 != -21) {
            return null;
        }
        var8.field_l = param1 ? true : false;
        var8.field_q = param4;
        if (param1) {
            if (!(((qda) this).f(param3 ^ 22) > -21)) {
                throw new RuntimeException();
            }
            ((qda) this).field_e.a((od) (Object) var8, (byte) -78);
        } else {
            if (!(-21 > ((qda) this).a((byte) 78))) {
                throw new RuntimeException();
            }
            ((qda) this).field_c.a((od) (Object) var8, (byte) -96);
        }
        return var8;
    }

    final static boolean a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var4 = TombRacer.field_G ? 1 : 0;
          if (param0 == -72) {
            break L0;
          } else {
            field_l = null;
            break L0;
          }
        }
        var2 = 0;
        L1: while (true) {
          if (param1.length() <= var2) {
            return false;
          } else {
            var3 = param1.charAt(var2);
            if (!dja.a((byte) -20, (char) var3)) {
              if (!dp.a(param0 + 190, (char) var3)) {
                return true;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    qda() {
        ((qda) this).field_e = new vj();
        ((qda) this).field_m = new vj();
        ((qda) this).field_c = new vj();
        ((qda) this).field_k = new vj();
        ((qda) this).field_o = new uia(6);
        ((qda) this).field_a = 0;
        ((qda) this).field_n = 0;
        ((qda) this).field_d = (byte) 0;
        ((qda) this).field_h = new uia(10);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Unfortunately we are unable to create an account for you at this time.";
        field_l = "Try changing the following settings:  ";
    }
}
