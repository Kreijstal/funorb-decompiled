/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;
import java.util.*;

final class td implements Runnable {
    private boolean field_h;
    private InputStream field_b;
    private boolean field_e;
    private int field_m;
    static java.util.zip.CRC32 field_a;
    private OutputStream field_q;
    private int field_j;
    private kk field_k;
    static bd field_f;
    private int field_i;
    private fd field_g;
    static int[] field_d;
    static long field_c;
    static vl field_o;
    static String field_p;
    private java.net.Socket field_n;
    private byte[] field_l;

    td(java.net.Socket param0, fd param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(int param0) {
        int var4 = 0;
        var4 = HostileSpawn.field_I ? 1 : 0;
        if (((td) this).field_e) {
            return;
        }
        Object var2_ref_Object = this;
        // monitorenter this
        ((td) this).field_e = true;
        this.notifyAll();
        // monitorexit var2_ref_Object
        if (null != ((td) this).field_k) {
            while (((td) this).field_k.field_f == 0) {
                vj.a(1L, (byte) -49);
            }
            if (-2 == (((td) this).field_k.field_f ^ -1)) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((td) this).field_k.field_c).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        int var2 = -81 % ((param0 - -12) / 41);
        ((td) this).field_k = null;
    }

    final int b(byte param0) throws IOException {
        if (!(!((td) this).field_e)) {
            return 0;
        }
        if (param0 < 26) {
            ((td) this).field_l = null;
        }
        return ((td) this).field_b.available();
    }

    public static void b(int param0) {
        if (param0 != 200) {
            td.b(-94);
        }
        field_d = null;
        field_f = null;
        field_o = null;
        field_p = null;
        field_a = null;
    }

    final static void c(byte param0) {
        if (!jk.a(-23322)) {
            return;
        }
        hh.a(5, 4, false);
        if (param0 <= 104) {
            field_d = null;
        }
    }

    final int d(byte param0) throws IOException {
        if (((td) this).field_e) {
            return 0;
        }
        int var2 = 118 % ((-52 - param0) / 44);
        return ((td) this).field_b.read();
    }

    protected final void finalize() {
        ((td) this).a(118);
    }

    final static boolean a(vb param0, boolean param1, vb param2) {
        int var3 = 0;
        int var4 = 0;
        int stackIn_14_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_12_0 = 0;
        L0: {
          var4 = HostileSpawn.field_I ? 1 : 0;
          var3 = param2.field_Gb - param0.field_Gb;
          if (param1) {
            break L0;
          } else {
            field_p = null;
            break L0;
          }
        }
        L1: {
          if (param2.field_Mb == eg.field_w) {
            // wide iinc 3 -200
            break L1;
          } else {
            if (null == param2.field_Mb) {
              // wide iinc 3 200
              break L1;
            } else {
              break L1;
            }
          }
        }
        L2: {
          if (param0.field_Mb != eg.field_w) {
            if (null != param0.field_Mb) {
              break L2;
            } else {
              // wide iinc 3 -200
              break L2;
            }
          } else {
            // wide iinc 3 200
            break L2;
          }
        }
        L3: {
          if (-1 <= (var3 ^ -1)) {
            stackOut_13_0 = 0;
            stackIn_14_0 = stackOut_13_0;
            break L3;
          } else {
            stackOut_12_0 = 1;
            stackIn_14_0 = stackOut_12_0;
            break L3;
          }
        }
        return stackIn_14_0 != 0;
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
            java.net.URL var2 = null;
            Exception var2_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = new java.net.URL(param0.getCodeBase(), "tosupport.ws");
                            param0.getAppletContext().showDocument(nj.a(param0, true, var2), "_top");
                            if (param1 == 200) {
                                statePc = 4;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            td.b(-26);
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        var2_ref = (Exception) (Object) caughtException;
                        var2_ref.printStackTrace();
                        statePc = 4;
                        continue stateLoop;
                    }
                    case 4: {
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
                        var6 = HostileSpawn.field_I ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((td) this).field_i == ((td) this).field_j) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (((td) this).field_e) {
                                statePc = 5;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 31;
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
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (((td) this).field_j <= ((td) this).field_i) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((td) this).field_m - ((td) this).field_j;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var1_int = -((td) this).field_j + ((td) this).field_i;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = ((td) this).field_j;
                            if ((var1_int ^ -1) < -1) {
                                statePc = 12;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((td) this).field_q.write(((td) this).field_l, var2, var1_int);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 14 : 31);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((td) this).field_h = true;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            ((td) this).field_j = (var1_int + ((td) this).field_j) % ((td) this).field_m;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (((td) this).field_j != ((td) this).field_i) {
                                statePc = 1;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 19 : 31);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((td) this).field_q.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 19 : 31);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((td) this).field_h = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (((td) this).field_b != null) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            ((td) this).field_b.close();
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (((td) this).field_q == null) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            ((td) this).field_q.close();
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (((td) this).field_n == null) {
                                statePc = 29;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            ((td) this).field_n.close();
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof IOException ? 28 : 31);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var1 = (IOException) (Object) caughtException;
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((td) this).field_l = null;
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        var1_ref = (Exception) (Object) caughtException;
                        var7 = null;
                        ic.a((byte) -120, (String) null, (Throwable) (Object) var1_ref);
                        statePc = 32;
                        continue stateLoop;
                    }
                    case 32: {
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

    final void a(int param0, byte[] param1, byte param2, int param3) throws IOException {
        int var5 = 0;
        Object var6 = null;
        int var7 = 0;
        Object var8 = null;
        int var9 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var9 = HostileSpawn.field_I ? 1 : 0;
                    if (((td) this).field_e) {
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
                    if (!((td) this).field_h) {
                        statePc = 5;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    ((td) this).field_h = false;
                    throw new IOException();
                }
                case 5: {
                    var5 = 100 % ((param2 - -12) / 42);
                    if (null != ((td) this).field_l) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((td) this).field_l = new byte[((td) this).field_m];
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    var6 = this;
                    // monitorenter this
                    statePc = 8;
                    continue stateLoop;
                }
                case 8: {
                    try {
                        var7 = 0;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        if (var7 >= param0) {
                            statePc = 13;
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
                        ((td) this).field_l[((td) this).field_i] = param1[var7 + param3];
                        ((td) this).field_i = (((td) this).field_i - -1) % ((td) this).field_m;
                        if ((((td) this).field_m + (((td) this).field_j - 100)) % ((td) this).field_m != ((td) this).field_i) {
                            statePc = 12;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var7++;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null != ((td) this).field_k) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        ((td) this).field_k = ((td) this).field_g.a(3, (Runnable) this, 85);
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
                        // monitorexit var6
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
                        var8 = caughtException;
                        // monitorexit var6
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 17;
                        continue stateLoop;
                    }
                }
                case 18: {
                    if (var8 instanceof RuntimeException) throw (RuntimeException) var8;
                    if (var8 instanceof Error) throw (Error) var8;
                    throw (IOException) (Object) var8;
                }
                case 19: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private td(java.net.Socket param0, fd param1, int param2) throws IOException {
        ((td) this).field_h = false;
        ((td) this).field_e = false;
        ((td) this).field_i = 0;
        ((td) this).field_j = 0;
        ((td) this).field_g = param1;
        ((td) this).field_n = param0;
        ((td) this).field_n.setSoTimeout(30000);
        ((td) this).field_n.setTcpNoDelay(true);
        ((td) this).field_b = ((td) this).field_n.getInputStream();
        ((td) this).field_q = ((td) this).field_n.getOutputStream();
        ((td) this).field_m = param2;
    }

    final void a(byte param0) throws IOException {
        if (((td) this).field_e) {
            return;
        }
        if (!(!((td) this).field_h)) {
            ((td) this).field_h = false;
            throw new IOException();
        }
        int var2 = 69 / ((param0 - 81) / 32);
    }

    final void a(int param0, byte[] param1, int param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = HostileSpawn.field_I ? 1 : 0;
        if (!(!((td) this).field_e)) {
            return;
        }
        if (param0 != -1) {
            field_o = null;
        }
        while (-1 > param3) {
            var5 = ((td) this).field_b.read(param1, param2, param3);
            if (!(-1 < var5)) {
                throw new EOFException();
            }
            param3 = param3 - var5;
            param2 = param2 + var5;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new java.util.zip.CRC32();
        field_d = new int[]{5};
        field_p = "Oh, a blast door. A rocket launcher would be useful at this point.";
        field_o = new vl();
    }
}
