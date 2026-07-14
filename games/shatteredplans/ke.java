/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ke implements Runnable {
    private int field_a;
    private pb field_p;
    private qb field_m;
    static int[] field_q;
    private java.net.Socket field_o;
    private int field_g;
    private boolean field_d;
    static long[][] field_l;
    private int field_b;
    private byte[] field_e;
    static boolean field_j;
    private boolean field_c;
    static long[] field_k;
    private OutputStream field_n;
    static bi field_i;
    private InputStream field_f;
    static String field_h;

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ShatteredPlansClient.field_F ? 1 : 0;
                    if (!((ke) this).field_c) {
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
                    if (!((ke) this).field_d) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((ke) this).field_d = false;
                    throw new IOException();
                }
                case 4: {
                    if (((ke) this).field_e != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((ke) this).field_e = new byte[((ke) this).field_g];
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    var5 = this;
                    // monitorenter this
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    try {
                        var6 = 0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6 >= param0) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        ((ke) this).field_e[((ke) this).field_b] = param2[param1 + var6];
                        ((ke) this).field_b = (((ke) this).field_b + 1) % ((ke) this).field_g;
                        if (((ke) this).field_b != (-100 + ((ke) this).field_g + ((ke) this).field_a) % ((ke) this).field_g) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        if (null == ((ke) this).field_p) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((ke) this).field_p = ((ke) this).field_m.a(true, 3, (Runnable) this);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 19: {
                    if (param3 == -13976) {
                        statePc = 21;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 20: {
                    ((ke) this).field_f = null;
                    statePc = 21;
                    continue stateLoop;
                }
                case 21: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final void b(int param0) {
        int var4 = 0;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        if (!(!((ke) this).field_c)) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((ke) this).field_c = true;
        this.notifyAll();
        // monitorexit var2
        if (((ke) this).field_p != null) {
            while (((ke) this).field_p.field_d == 0) {
                jb.a((byte) -111, 1L);
            }
            if (!(((ke) this).field_p.field_d != 1)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((ke) this).field_p.field_e).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((ke) this).field_p = null;
        if (param0 < 83) {
            ke.a(52, 12, -47, -94, 64);
        }
    }

    public static void b(byte param0) {
        field_l = null;
        field_h = null;
        field_k = null;
        if (param0 > -124) {
            field_k = null;
        }
        field_q = null;
        field_i = null;
    }

    final int a(byte param0) throws IOException {
        if (!(!((ke) this).field_c)) {
            return 0;
        }
        if (param0 <= 120) {
            ((ke) this).field_a = -122;
        }
        return ((ke) this).field_f.read();
    }

    final void a(boolean param0) throws IOException {
        if (!(!((ke) this).field_c)) {
            return;
        }
        if (param0) {
            ((ke) this).finalize();
        }
        if (!(!((ke) this).field_d)) {
            ((ke) this).field_d = false;
            throw new IOException();
        }
    }

    protected final void finalize() {
        ((ke) this).b(104);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        wh.a(false);
        if (param0 != -6187) {
            ke.b((byte) 13);
        }
        gf.i(param4, param3, param1, param2);
    }

    final int a(int param0) throws IOException {
        if (!(!((ke) this).field_c)) {
            return 0;
        }
        if (param0 != -1) {
            field_h = null;
        }
        return ((ke) this).field_f.available();
    }

    public final void run() {
        try {
            IOException var1 = null;
            Exception var1_ref = null;
            int var1_int = 0;
            int var2 = 0;
            Object var3 = null;
            IOException var3_ref = null;
            int var6 = 0;
            Object var7 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var6 = ShatteredPlansClient.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((ke) this).field_b == ((ke) this).field_a) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((ke) this).field_c) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.wait();
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((ke) this).field_a > ((ke) this).field_b) {
                                statePc = 9;
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
                            var1_int = ((ke) this).field_b - ((ke) this).field_a;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1_int = -((ke) this).field_a + ((ke) this).field_g;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = ((ke) this).field_a;
                            if (-1 > (var1_int ^ -1)) {
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
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((ke) this).field_n.write(((ke) this).field_e, var2, var1_int);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 14 : 34);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ke) this).field_d = true;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((ke) this).field_a = (var1_int + ((ke) this).field_a) % ((ke) this).field_g;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (((ke) this).field_b == ((ke) this).field_a) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 20 : 34);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 20 : 34);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            ((ke) this).field_n.flush();
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 20 : 34);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ke) this).field_d = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (((ke) this).field_f != null) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            ((ke) this).field_f.close();
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (null != ((ke) this).field_n) {
                                statePc = 26;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((ke) this).field_n.close();
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (null != ((ke) this).field_o) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((ke) this).field_o.close();
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 31 : 34);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            ((ke) this).field_e = null;
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        jq.a(-29901, (Throwable) (Object) var1_ref, (String) null);
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
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

    final void a(byte[] param0, int param1, int param2, byte param3) throws IOException {
        int var6 = 0;
        int var7 = ShatteredPlansClient.field_F ? 1 : 0;
        int var5 = 26 / ((param3 - 64) / 40);
        if (((ke) this).field_c) {
            return;
        }
        while (0 < param1) {
            var6 = ((ke) this).field_f.read(param0, param2, param1);
            if (!(-1 > (var6 ^ -1))) {
                throw new EOFException();
            }
            param2 = param2 + var6;
            param1 = param1 - var6;
        }
    }

    ke(java.net.Socket param0, qb param1) throws IOException {
        this(param0, param1, 5000);
    }

    final static void a(int param0, si param1) {
        param1.field_s = new char[]{(char)63};
        if (param0 >= -39) {
            field_h = null;
        }
        param1.field_x = new int[]{-1};
    }

    private ke(java.net.Socket param0, qb param1, int param2) throws IOException {
        ((ke) this).field_a = 0;
        ((ke) this).field_b = 0;
        ((ke) this).field_d = false;
        ((ke) this).field_c = false;
        ((ke) this).field_m = param1;
        ((ke) this).field_o = param0;
        ((ke) this).field_o.setSoTimeout(30000);
        ((ke) this).field_o.setTcpNoDelay(true);
        ((ke) this).field_f = ((ke) this).field_o.getInputStream();
        ((ke) this).field_n = ((ke) this).field_o.getOutputStream();
        ((ke) this).field_g = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        long var2 = 0L;
        long var4 = 0L;
        long var6 = 0L;
        long var8 = 0L;
        long var10 = 0L;
        long var12 = 0L;
        int var14 = 0;
        long stackIn_5_0 = 0L;
        long stackOut_4_0 = 0L;
        long stackOut_3_0 = 0L;
        field_l = new long[8][256];
        field_q = new int[5];
        field_k = new long[11];
        var0 = 0;
        L0: while (true) {
          if (256 <= var0) {
            field_k[0] = 0L;
            var0 = 1;
            L1: while (true) {
              if ((var0 ^ -1) < -11) {
              } else {
                var1 = (var0 + -1) * 8;
                field_k[var0] = bg.a(bg.a(co.a(65280L, field_l[6][var1 + 6]), bg.a(bg.a(co.a(4278190080L, field_l[4][var1 - -4]), bg.a(co.a(1095216660480L, field_l[3][var1 + 3]), bg.a(co.a(field_l[2][2 + var1], 280375465082880L), bg.a(co.a(field_l[1][var1 + 1], 71776119061217280L), co.a(field_l[0][var1], -72057594037927936L))))), co.a(field_l[5][var1 + 5], 16711680L))), co.a(field_l[7][var1 - -7], 255L));
                var0++;
                continue L1;
              }
            }
          } else {
            L2: {
              var1 = "ᠣ웨螸ŏ㚦틵祯酒悼鮎ꌌ笵ᷠퟂ⹋﹗ᕷ㟥鿰䫚壉⤊놠殅뵝ჴ쬾է䆋Ᵹ闘ﯮ籦���䞞쨭뼇굚茳挂ꩱ젙䧙守騦㊰햀뻍㑈ｺ遟⁨᪮둔錢擱猒䀈쏬���贽需켫皂혛떯橐䗳ワ㽕ꋪ斺⿀���﵍鉵ڊ닦ฟ拔ꢖ暈╙葲㥌幸㢌톥댡鰞䏇ﰄ写洍﫟縤㮫츑轎럫㲁铷뤓ⳓ쐃噄義⪻셓���鵬ㅴ겉ᓡᘺ椉炶탭챂颤⡜".charAt(var0 / 2);
              if ((var0 & 1) == 0) {
                stackOut_4_0 = (long)(var1 >>> -645714104);
                stackIn_5_0 = stackOut_4_0;
                break L2;
              } else {
                stackOut_3_0 = (long)(255 & var1);
                stackIn_5_0 = stackOut_3_0;
                break L2;
              }
            }
            L3: {
              var2 = stackIn_5_0;
              var4 = var2 << -1859226175;
              if (var4 >= 256L) {
                var4 = var4 ^ 285L;
                break L3;
              } else {
                break L3;
              }
            }
            L4: {
              var6 = var4 << -1214699583;
              if (256L > var6) {
                break L4;
              } else {
                var6 = var6 ^ 285L;
                break L4;
              }
            }
            L5: {
              var8 = var2 ^ var6;
              var10 = var6 << -1083364031;
              if ((var10 ^ -1L) <= -257L) {
                var10 = var10 ^ 285L;
                break L5;
              } else {
                break L5;
              }
            }
            var12 = var10 ^ var2;
            field_l[0][var0] = ff.a(var12, ff.a(ff.a(var8 << -890568688, ff.a(var10 << 674617880, ff.a(var2 << 779538336, ff.a(ff.a(var2 << -1992280392, var2 << -247570640), var6 << 495817640)))), var4 << -394852152));
            var14 = 1;
            L6: while (true) {
              if (var14 >= 8) {
                var0++;
                continue L0;
              } else {
                field_l[var14][var0] = ff.a(field_l[-1 + var14][var0] >>> -1113970040, field_l[-1 + var14][var0] << -1028846728);
                var14++;
                continue L6;
              }
            }
          }
        }
    }
}
