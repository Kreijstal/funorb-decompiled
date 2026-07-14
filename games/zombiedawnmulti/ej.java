/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    static String field_o;
    static ja field_g;
    static jh field_n;
    static int field_e;
    private go field_s;
    private di field_c;
    private int field_m;
    private int field_h;
    static ja field_j;
    private boolean field_i;
    static int field_q;
    private InputStream field_d;
    private OutputStream field_l;
    private java.net.Socket field_f;
    private boolean field_r;
    private int field_a;
    private byte[] field_b;
    static String field_k;
    static int[] field_p;

    public static void b(byte param0) {
        field_n = null;
        field_g = null;
        field_j = null;
        field_k = null;
        if (param0 <= 10) {
            field_q = -107;
        }
        field_o = null;
        field_p = null;
    }

    final void b(int param0) throws IOException {
        if (((ej) this).field_r) {
            return;
        }
        if (!(!((ej) this).field_i)) {
            ((ej) this).field_i = false;
            throw new IOException();
        }
        if (param0 != -26844) {
            ((ej) this).c(-17);
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            IOException var1 = null;
            Exception var1_ref = null;
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
                        var6 = ZombieDawnMulti.field_E ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((ej) this).field_a != ((ej) this).field_h) {
                                statePc = 5;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (!((ej) this).field_r) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            this.wait();
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((ej) this).field_a < ((ej) this).field_h) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1_int = -((ej) this).field_h + ((ej) this).field_a;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = -((ej) this).field_h + ((ej) this).field_m;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = ((ej) this).field_h;
                            if (0 < var1_int) {
                                statePc = 10;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            ((ej) this).field_l.write(((ej) this).field_b, var2, var1_int);
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof IOException ? 12 : 30);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ej) this).field_i = true;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            ((ej) this).field_h = (((ej) this).field_h - -var1_int) % ((ej) this).field_m;
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (((ej) this).field_h != ((ej) this).field_a) {
                                statePc = 1;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((ej) this).field_l.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 17 : 30);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((ej) this).field_i = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (null != ((ej) this).field_d) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((ej) this).field_d.close();
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null == ((ej) this).field_l) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((ej) this).field_l.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (((ej) this).field_f != null) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            ((ej) this).field_f.close();
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            ((ej) this).field_b = null;
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        bd.a((String) null, (Throwable) (Object) var1_ref, false);
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
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

    final static cr a(byte param0, int param1) {
        if (param0 >= -32) {
            ej.b((byte) 24);
        }
        cr var2 = new cr();
        dc.field_Gb.a((br) (Object) var2, false);
        mi.b(1, param1);
        return var2;
    }

    protected final void finalize() {
        ((ej) this).c(92);
    }

    final static void a(ja param0, byte param1, ja param2) {
        jj.field_F = new ja[7];
        rb.field_e = new ja[7];
        eg.field_D = new ja(300, 200);
        rb.field_e[0] = param2;
        jj.field_F[0] = new ja(param2.field_x - -20, param2.field_w - -10);
        rb.field_e[1] = param0;
        jj.field_F[1] = new ja(param0.field_x + 10, 10 + param0.field_w);
        rb.field_e[2] = new ja(150, 100);
        jj.field_F[2] = new ja(150, 100);
        rb.field_e[3] = new ja(120, 50);
        jj.field_F[3] = new ja(120, 50);
        rb.field_e[4] = new ja(300, 50);
        jj.field_F[4] = new ja(300, 50);
        rb.field_e[5] = new ja(200, 90);
        jj.field_F[5] = new ja(200, 90);
        rb.field_e[6] = new ja(200, 50);
        if (param1 < -4) {
          jj.field_F[6] = new ja(200, 50);
          g.c();
          jj.field_F[0].a();
          rb.field_e[0].f(5, 5, 16777215);
          jm.d((byte) -18);
          rb.field_e[0].f(5, 5, 0);
          jj.field_F[1].a();
          rb.field_e[1].f(-35, 5, 16777215);
          g.a(16777215);
          jm.d((byte) -18);
          rb.field_e[1].f(-35, 5, 0);
          g.b();
          return;
        } else {
          return;
        }
    }

    ej(java.net.Socket param0, go param1) throws IOException {
        this(param0, param1, 5000);
    }

    final int a(int param0) throws IOException {
        if (((ej) this).field_r) {
            return 0;
        }
        int var2 = -42 / ((param0 - -37) / 35);
        return ((ej) this).field_d.available();
    }

    final static long a(byte param0) {
        long var1 = 0L;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        var1 = 0L;
        var3 = -15 / ((35 - param0) / 62);
        var4 = 0;
        L0: while (true) {
          if (var4 >= em.field_Y.length) {
            return var1;
          } else {
            var5 = 0;
            L1: while (true) {
              if (var5 >= em.field_Y[var4][0].length) {
                var4++;
                continue L0;
              } else {
                if ((em.field_Y[var4][0][var5] ^ -1) != -256) {
                  var1 = var1 | 1L << em.field_Y[var4][0][var5];
                  var5++;
                  continue L1;
                } else {
                  var5++;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final void a(int param0, int param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!(!((ej) this).field_r)) {
            return;
        }
        while (0 < param0) {
            var5 = ((ej) this).field_d.read(param2, param1, param0);
            if (!(var5 > 0)) {
                throw new EOFException();
            }
            param1 = param1 + var5;
            param0 = param0 - var5;
        }
        if (param3 <= 96) {
            ej.b((byte) 10);
        }
    }

    final void c(int param0) {
        int var4 = 0;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        if (((ej) this).field_r) {
            return;
        }
        Object var2_ref_Object = this;
        // monitorenter this
        ((ej) this).field_r = true;
        this.notifyAll();
        // monitorexit var2_ref_Object
        int var2 = 61 / ((param0 - 20) / 58);
        if (!(((ej) this).field_c == null)) {
            while (((ej) this).field_c.field_f == 0) {
                vd.a(false, 1L);
            }
            if (((ej) this).field_c.field_f == 1) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((ej) this).field_c.field_d).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((ej) this).field_c = null;
    }

    final void a(int param0, int param1, int param2, byte[] param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        Object var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = ZombieDawnMulti.field_E ? 1 : 0;
                    if (((ej) this).field_r) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return;
                }
                case 3: {
                    if (!((ej) this).field_i) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((ej) this).field_i = false;
                    throw new IOException();
                }
                case 5: {
                    if (null != ((ej) this).field_b) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((ej) this).field_b = new byte[((ej) this).field_m];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var5 = this;
                    // monitorenter this
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        if (param1 == -100) {
                            statePc = 10;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var9 = null;
                        ej.a((ja) null, (byte) -16, (ja) null);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var6 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param2 <= var6) {
                            statePc = 16;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        ((ej) this).field_b[((ej) this).field_a] = param3[param0 + var6];
                        ((ej) this).field_a = (((ej) this).field_a - -1) % ((ej) this).field_m;
                        if (((ej) this).field_a == (-100 + (((ej) this).field_m + ((ej) this).field_h)) % ((ej) this).field_m) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var6++;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (null != ((ej) this).field_c) {
                            statePc = 18;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        ((ej) this).field_c = ((ej) this).field_s.a(47, (Runnable) this, 3);
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        this.notifyAll();
                        // monitorexit var5
                        statePc = 22;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        var7 = caughtException;
                        // monitorexit var5
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 21: {
                    if (var7 instanceof RuntimeException) throw (RuntimeException) var7;
                    if (var7 instanceof Error) throw (Error) var7;
                    throw (IOException) (Object) var7;
                }
                case 22: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final int c(byte param0) throws IOException {
        if (param0 != 59) {
            ((ej) this).field_r = true;
        }
        if (!(!((ej) this).field_r)) {
            return 0;
        }
        return ((ej) this).field_d.read();
    }

    private ej(java.net.Socket param0, go param1, int param2) throws IOException {
        ((ej) this).field_h = 0;
        ((ej) this).field_r = false;
        ((ej) this).field_a = 0;
        ((ej) this).field_i = false;
        ((ej) this).field_s = param1;
        ((ej) this).field_f = param0;
        ((ej) this).field_f.setSoTimeout(30000);
        ((ej) this).field_f.setTcpNoDelay(true);
        ((ej) this).field_d = ((ej) this).field_f.getInputStream();
        ((ej) this).field_l = ((ej) this).field_f.getOutputStream();
        ((ej) this).field_m = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Please log in as a subscribing member to access this feature.";
        field_e = 0;
        field_k = "Select a human!";
    }
}
