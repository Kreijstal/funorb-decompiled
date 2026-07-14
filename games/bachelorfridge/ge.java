/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ge extends hfa {
    private po field_G;
    static int field_I;
    private boolean field_M;
    private int field_J;
    static ee field_K;
    private String field_C;
    static long field_F;
    static boolean field_D;
    static boolean field_L;
    private int field_E;
    private int field_H;

    ge(int param0, int param1, int param2, int param3, wj param4, boolean param5, int param6, int param7, po param8, int param9, String param10) {
        super(param0, param1, param2, param3, (qda) null, (pl) null);
        ((ge) this).field_J = param9;
        ((ge) this).field_E = param7;
        ((ge) this).field_H = param6;
        ((ge) this).field_G = param8;
        ((ge) this).field_A = param4;
        ((ge) this).field_M = param5 ? true : false;
        ((ge) this).field_C = param10;
        int var12 = -((ge) this).field_E + ((ge) this).field_H;
        int var13 = ((ge) this).field_G.a(param10, var12, ((ge) this).field_G.field_u) + ((ge) this).field_E * 2;
        if (param3 < var13) {
            ((ge) this).a(param0, var13, (byte) 59, param2, param1);
        } else {
            var13 = param3;
        }
        int var14 = !((ge) this).field_M ? ((ge) this).field_E * 2 + ((ge) this).field_H : 0;
        ((ge) this).field_A.a(var14, param3 + -(((ge) this).field_E * 2), (byte) 59, -((ge) this).field_H + param2 - ((ge) this).field_E * 3, (-param3 + var13 >> -806143679) + ((ge) this).field_E);
    }

    final static boolean a(int param0, boolean param1) {
        try {
            IOException var2 = null;
            pf var4 = null;
            pf var5 = null;
            int stackIn_13_0 = 0;
            int stackOut_11_0 = 0;
            int stackOut_12_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (null == aw.field_x) {
                            statePc = 2;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    }
                    case 2: {
                        aw.field_x = cc.field_e.a((byte) 121, oca.field_p, kn.field_h);
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        if (0 == aw.field_x.field_f) {
                            statePc = 5;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 5: {
                        return false;
                    }
                    case 6: {
                        vla.field_v = f.b((byte) 73);
                        pk.field_c = f.b((byte) 73);
                        if (param0 == -29510) {
                            statePc = 8;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    }
                    case 7: {
                        field_K = null;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (aw.field_x.field_f == 1) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        eia.field_a = mk.field_o;
                        aw.field_x = null;
                        return true;
                    }
                    case 10: {
                        try {
                            dma.field_b = new pj((java.net.Socket) aw.field_x.field_e, cc.field_e);
                            var4 = ig.field_m;
                            var5 = var4;
                            sja.field_fb.field_g = 0;
                            if (!param1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = -2;
                            stackIn_13_0 = stackOut_11_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = -1;
                            stackIn_13_0 = stackOut_12_0;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            f.field_b = stackIn_13_0;
                            ef.field_l = stackIn_13_0;
                            bd.field_j = stackIn_13_0;
                            eia.field_a = rga.field_c;
                            var5.field_g = 0;
                            cca.a((lu) (Object) sja.field_fb, fl.field_q, (byte) -106, mfa.field_a, kha.field_k);
                            hna.a(-1, 117);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        aw.field_x = null;
                        return true;
                    }
                    case 15: {
                        var2 = (IOException) (Object) caughtException;
                        eia.field_a = mk.field_o;
                        aw.field_x = null;
                        return true;
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

    public static void e(byte param0) {
        field_K = null;
        if (param0 >= -30) {
            ge.e((byte) 35);
        }
    }

    final String c(byte param0) {
        int var2 = ((ge) this).field_A.field_t ? 1 : 0;
        ((ge) this).field_A.field_t = ((ge) this).field_t;
        String var3 = ((ge) this).field_A.c(param0);
        ((ge) this).field_A.field_t = var2 != 0 ? true : false;
        return var3;
    }

    final void a(byte param0, int param1, int param2, int param3) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_4_0 = 0;
        po stackIn_5_0 = null;
        String stackIn_5_1 = null;
        int stackIn_5_2 = 0;
        int stackIn_5_3 = 0;
        int stackIn_5_4 = 0;
        int stackIn_5_5 = 0;
        int stackIn_5_6 = 0;
        int stackIn_5_7 = 0;
        po stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        int stackIn_6_4 = 0;
        int stackIn_6_5 = 0;
        int stackIn_6_6 = 0;
        int stackIn_6_7 = 0;
        po stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        int stackIn_7_5 = 0;
        int stackIn_7_6 = 0;
        int stackIn_7_7 = 0;
        int stackIn_7_8 = 0;
        int stackOut_3_0 = 0;
        int stackOut_2_0 = 0;
        po stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        int stackOut_4_5 = 0;
        int stackOut_4_6 = 0;
        int stackOut_4_7 = 0;
        po stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        int stackOut_6_5 = 0;
        int stackOut_6_6 = 0;
        int stackOut_6_7 = 0;
        int stackOut_6_8 = 0;
        po stackOut_5_0 = null;
        String stackOut_5_1 = null;
        int stackOut_5_2 = 0;
        int stackOut_5_3 = 0;
        int stackOut_5_4 = 0;
        int stackOut_5_5 = 0;
        int stackOut_5_6 = 0;
        int stackOut_5_7 = 0;
        int stackOut_5_8 = 0;
        var5 = param3 + ((ge) this).field_s;
        var6 = param1 + ((ge) this).field_v;
        var7 = 44 % ((-20 - param0) / 54);
        this.a((byte) 123, param1, param2, param3);
        if (0 != param2) {
          return;
        } else {
          L0: {
            if (!((ge) this).field_M) {
              stackOut_3_0 = 0;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_2_0 = -((ge) this).field_H + ((ge) this).field_p - ((ge) this).field_E * 2;
              stackIn_4_0 = stackOut_2_0;
              break L0;
            }
          }
          L1: {
            var8 = stackIn_4_0;
            stackOut_4_0 = ((ge) this).field_G;
            stackOut_4_1 = ((ge) this).field_C;
            stackOut_4_2 = var5 - (-var8 + -((ge) this).field_E);
            stackOut_4_3 = var6 + ((ge) this).field_E;
            stackOut_4_4 = -((ge) this).field_E + ((ge) this).field_H;
            stackOut_4_5 = -(((ge) this).field_E * 2) + ((ge) this).field_q;
            stackOut_4_6 = ((ge) this).field_J;
            stackOut_4_7 = -1;
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_6_2 = stackOut_4_2;
            stackIn_6_3 = stackOut_4_3;
            stackIn_6_4 = stackOut_4_4;
            stackIn_6_5 = stackOut_4_5;
            stackIn_6_6 = stackOut_4_6;
            stackIn_6_7 = stackOut_4_7;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            stackIn_5_2 = stackOut_4_2;
            stackIn_5_3 = stackOut_4_3;
            stackIn_5_4 = stackOut_4_4;
            stackIn_5_5 = stackOut_4_5;
            stackIn_5_6 = stackOut_4_6;
            stackIn_5_7 = stackOut_4_7;
            if (((ge) this).field_M) {
              stackOut_6_0 = (po) (Object) stackIn_6_0;
              stackOut_6_1 = (String) (Object) stackIn_6_1;
              stackOut_6_2 = stackIn_6_2;
              stackOut_6_3 = stackIn_6_3;
              stackOut_6_4 = stackIn_6_4;
              stackOut_6_5 = stackIn_6_5;
              stackOut_6_6 = stackIn_6_6;
              stackOut_6_7 = stackIn_6_7;
              stackOut_6_8 = 0;
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              stackIn_7_3 = stackOut_6_3;
              stackIn_7_4 = stackOut_6_4;
              stackIn_7_5 = stackOut_6_5;
              stackIn_7_6 = stackOut_6_6;
              stackIn_7_7 = stackOut_6_7;
              stackIn_7_8 = stackOut_6_8;
              break L1;
            } else {
              stackOut_5_0 = (po) (Object) stackIn_5_0;
              stackOut_5_1 = (String) (Object) stackIn_5_1;
              stackOut_5_2 = stackIn_5_2;
              stackOut_5_3 = stackIn_5_3;
              stackOut_5_4 = stackIn_5_4;
              stackOut_5_5 = stackIn_5_5;
              stackOut_5_6 = stackIn_5_6;
              stackOut_5_7 = stackIn_5_7;
              stackOut_5_8 = 2;
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              stackIn_7_3 = stackOut_5_3;
              stackIn_7_4 = stackOut_5_4;
              stackIn_7_5 = stackOut_5_5;
              stackIn_7_6 = stackOut_5_6;
              stackIn_7_7 = stackOut_5_7;
              stackIn_7_8 = stackOut_5_8;
              break L1;
            }
          }
          int discarded$1 = ((po) (Object) stackIn_7_0).a((String) (Object) stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, stackIn_7_5, stackIn_7_6, stackIn_7_7, stackIn_7_8, 1, ((ge) this).field_G.field_u);
          return;
        }
    }

    final static void a(int param0, int param1, boolean param2, po param3, int param4, int param5, int param6, kv[] param7, int param8, byte param9, int param10, kv[] param11) {
        vr.a(param8, param3, param6, param6, param10, param7, param0, param3, param4, param5, param2, param11, param1, param8, 480);
        int var12 = 3 / ((param9 - -6) / 43);
    }

    static {
    }
}
