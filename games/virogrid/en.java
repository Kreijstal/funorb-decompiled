/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.net.URL;
import java.lang.String;

final class en extends km {
    private km field_Ib;
    static int[] field_Hb;
    private km field_Gb;
    static String field_Eb;
    static int field_Jb;
    static boolean field_Fb;
    static int field_Kb;

    public static void g(int param0) {
        field_Hb = null;
        field_Eb = null;
        if (param0 != 0) {
            field_Eb = null;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        int var7 = -122 / ((25 - param3) / 37);
        ((en) this).a(param2, param4, param0, (byte) -120, param5);
        this.b(param1, 106);
    }

    final static void a(String param0, Throwable param1, int param2) {
        try {
            Exception var3 = null;
            String var3_ref = null;
            un var4 = null;
            DataInputStream var5 = null;
            int var6 = 0;
            String var7 = null;
            String var8 = null;
            String var9 = null;
            String var10 = null;
            pd stackIn_11_0 = null;
            java.net.URL stackIn_11_1 = null;
            java.net.URL stackIn_11_2 = null;
            java.net.URL stackIn_11_3 = null;
            StringBuilder stackIn_11_4 = null;
            pd stackIn_12_0 = null;
            java.net.URL stackIn_12_1 = null;
            java.net.URL stackIn_12_2 = null;
            java.net.URL stackIn_12_3 = null;
            StringBuilder stackIn_12_4 = null;
            pd stackIn_13_0 = null;
            java.net.URL stackIn_13_1 = null;
            java.net.URL stackIn_13_2 = null;
            java.net.URL stackIn_13_3 = null;
            StringBuilder stackIn_13_4 = null;
            String stackIn_13_5 = null;
            pd stackOut_10_0 = null;
            java.net.URL stackOut_10_1 = null;
            java.net.URL stackOut_10_2 = null;
            java.net.URL stackOut_10_3 = null;
            StringBuilder stackOut_10_4 = null;
            pd stackOut_11_0 = null;
            java.net.URL stackOut_11_1 = null;
            java.net.URL stackOut_11_2 = null;
            java.net.URL stackOut_11_3 = null;
            StringBuilder stackOut_11_4 = null;
            String stackOut_11_5 = null;
            pd stackOut_12_0 = null;
            java.net.URL stackOut_12_1 = null;
            java.net.URL stackOut_12_2 = null;
            java.net.URL stackOut_12_3 = null;
            StringBuilder stackOut_12_4 = null;
            String stackOut_12_5 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = Virogrid.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3_ref = "";
                            if (param1 == null) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var3_ref = ma.a(40, param1);
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (param0 == null) {
                                statePc = 7;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param1 == null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3_ref = var3_ref + " | ";
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var3_ref = var3_ref + param0;
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            kb.a(var3_ref, 0);
                            var7 = kn.a(var3_ref, (byte) -33, "%3a", ":");
                            var8 = kn.a(var7, (byte) -33, "%40", "@");
                            var9 = kn.a(var8, (byte) -33, "%26", "&");
                            var10 = kn.a(var9, (byte) -33, "%23", "#");
                            if (wf.field_m == null) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            stackOut_10_0 = qn.field_R;
                            stackOut_10_1 = null;
                            stackOut_10_2 = null;
                            stackOut_10_3 = wf.field_m.getCodeBase();
                            stackOut_10_4 = new StringBuilder().append("clienterror.ws?c=").append(db.field_v).append("&u=");
                            stackIn_12_0 = stackOut_10_0;
                            stackIn_12_1 = stackOut_10_1;
                            stackIn_12_2 = stackOut_10_2;
                            stackIn_12_3 = stackOut_10_3;
                            stackIn_12_4 = stackOut_10_4;
                            stackIn_11_0 = stackOut_10_0;
                            stackIn_11_1 = stackOut_10_1;
                            stackIn_11_2 = stackOut_10_2;
                            stackIn_11_3 = stackOut_10_3;
                            stackIn_11_4 = stackOut_10_4;
                            if (mf.field_f == null) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            stackOut_11_0 = (pd) (Object) stackIn_11_0;
                            stackOut_11_1 = null;
                            stackOut_11_2 = null;
                            stackOut_11_3 = (java.net.URL) (Object) stackIn_11_3;
                            stackOut_11_4 = (StringBuilder) (Object) stackIn_11_4;
                            stackOut_11_5 = mf.field_f;
                            stackIn_13_0 = stackOut_11_0;
                            stackIn_13_1 = stackOut_11_1;
                            stackIn_13_2 = stackOut_11_2;
                            stackIn_13_3 = stackOut_11_3;
                            stackIn_13_4 = stackOut_11_4;
                            stackIn_13_5 = stackOut_11_5;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            stackOut_12_0 = (pd) (Object) stackIn_12_0;
                            stackOut_12_1 = null;
                            stackOut_12_2 = null;
                            stackOut_12_3 = (java.net.URL) (Object) stackIn_12_3;
                            stackOut_12_4 = (StringBuilder) (Object) stackIn_12_4;
                            stackOut_12_5 = "" + ae.field_d;
                            stackIn_13_0 = stackOut_12_0;
                            stackIn_13_1 = stackOut_12_1;
                            stackIn_13_2 = stackOut_12_2;
                            stackIn_13_3 = stackOut_12_3;
                            stackIn_13_4 = stackOut_12_4;
                            stackIn_13_5 = stackOut_12_5;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            new java.net.URL(stackIn_13_3, stackIn_13_5 + "&v1=" + pd.field_q + "&v2=" + pd.field_k + "&e=" + var10);
                            var4 = ((pd) (Object) stackIn_13_0).a(stackIn_13_1, true);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (0 != var4.field_a) {
                                statePc = 16;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            mm.a(-14, 1L);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var4.field_a != param2) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var5 = (DataInputStream) var4.field_f;
                            int discarded$1 = var5.read();
                            var5.close();
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var3 = (Exception) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
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

    private en(long param0, km param1, km param2, String param3) {
        super(param0, (km) null);
        ((en) this).field_Ib = new km(0L, param1);
        ((en) this).field_Gb = new km(0L, param2);
        ((en) this).field_Gb.field_V = param3;
        ((en) this).a(0, ((en) this).field_Ib);
        ((en) this).a(0, ((en) this).field_Gb);
        ((en) this).b((byte) 42);
    }

    final static int a(boolean param0, String param1, jc param2) {
        int var3 = 0;
        byte[] var4 = null;
        Object var5 = null;
        CharSequence var6 = null;
        var3 = param2.field_l;
        var6 = (CharSequence) (Object) param1;
        var4 = ak.a(1514, var6);
        if (!param0) {
          var5 = null;
          int discarded$2 = en.a(true, (String) null, (jc) null);
          param2.f(var4.length, 30408);
          param2.field_l = param2.field_l + ph.field_k.a(var4.length, param2.field_l, -7089, 0, var4, param2.field_g);
          return -var3 + param2.field_l;
        } else {
          param2.f(var4.length, 30408);
          param2.field_l = param2.field_l + ph.field_k.a(var4.length, param2.field_l, -7089, 0, var4, param2.field_g);
          return -var3 + param2.field_l;
        }
    }

    final int a(byte param0, int param1) {
        int var3 = -9 / ((param0 - -62) / 61);
        return param1 + ((en) this).field_Ib.c((byte) 48) - -((en) this).field_Gb.c((byte) 113);
    }

    private final void b(int param0, int param1) {
        ((en) this).field_Ib.a(0, ((en) this).field_ub, ((en) this).field_Ib.c((byte) 36), (byte) -47, 0);
        int var3 = param0 + ((en) this).field_Ib.field_K;
        ((en) this).field_Gb.a(var3, ((en) this).field_ub, -var3 + ((en) this).field_K, (byte) -107, 0);
        int var4 = -128 % ((54 - param1) / 39);
    }

    en(long param0, en param1, String param2) {
        this(param0, param1.field_Ib, param1.field_Gb, param2);
    }

    en(long param0, mg param1, mg param2, int param3, km param4, String param5) {
        this(param0, (km) null, param4, param5);
        ((en) this).field_Ib.field_D = param3;
        ((en) this).field_Ib.field_jb = param1;
        ((en) this).field_Ib.field_qb = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_Hb = new int[8192];
        field_Jb = 0;
        field_Fb = false;
        field_Eb = "Previous";
    }
}
