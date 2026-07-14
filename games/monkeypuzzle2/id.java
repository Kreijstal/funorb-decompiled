/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class id implements Runnable {
    static String field_h;
    private java.net.Socket field_j;
    private OutputStream field_b;
    static int field_a;
    private md field_f;
    private InputStream field_g;
    private ic field_d;
    private int field_l;
    static int field_m;
    private byte[] field_c;
    private int field_e;
    private boolean field_n;
    private boolean field_i;
    private int field_k;

    protected final void finalize() {
        ((id) this).a((byte) 73);
    }

    final int a(int param0) throws IOException {
        if (param0 != -16840) {
            return 43;
        }
        if (!(!((id) this).field_n)) {
            return 0;
        }
        return ((id) this).field_g.read();
    }

    final void a(byte param0) {
        int var4 = 0;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (((id) this).field_n) {
            return;
        }
        Object var2 = this;
        // monitorenter this
        ((id) this).field_n = true;
        this.notifyAll();
        // monitorexit var2
        if (((id) this).field_d != null) {
            while (((id) this).field_d.field_g == 0) {
                em.a(1L, false);
            }
            if (1 == ((id) this).field_d.field_g) {
                try {
                    if (false) throw (InterruptedException) null;
                    ((Thread) ((id) this).field_d.field_b).join();
                } catch (InterruptedException interruptedException) {
                }
            }
        }
        ((id) this).field_d = null;
        if (param0 != 73) {
            ((id) this).field_n = true;
        }
    }

    final void b(byte param0) throws IOException {
        if (!(!((id) this).field_n)) {
            return;
        }
        if (!(!((id) this).field_i)) {
            ((id) this).field_i = false;
            throw new IOException();
        }
        int var2 = 122 / ((-61 - param0) / 56);
    }

    final static String a(Throwable param0, byte param1) throws IOException {
        String var2 = null;
        PrintWriter var4 = null;
        String var5 = null;
        BufferedReader var6 = null;
        String var7 = null;
        String var8 = null;
        int var9 = 0;
        int var10 = 0;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        dd var14 = null;
        StringWriter var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var19 = null;
        L0: {
          var13 = MonkeyPuzzle2.field_F ? 1 : 0;
          if (param0 instanceof dd) {
            var14 = (dd) (Object) param0;
            param0 = var14.field_b;
            var2 = var14.field_c + " | ";
            var11 = var2;
            var2 = var11;
            var11 = var2;
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        L1: {
          if (param1 == 37) {
            break L1;
          } else {
            field_h = null;
            break L1;
          }
        }
        var15 = new StringWriter();
        var4 = new PrintWriter((Writer) (Object) var15);
        param0.printStackTrace(var4);
        var4.close();
        var5 = var15.toString();
        var11 = var5;
        var2 = var11;
        var11 = var5;
        var6 = new BufferedReader((Reader) (Object) new StringReader(var5));
        var7 = var6.readLine();
        var11 = var7;
        var2 = var11;
        var11 = var7;
        L2: while (true) {
          var8 = var6.readLine();
          var11 = var8;
          var2 = var11;
          var11 = var8;
          if (var8 == null) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', 1 + var9);
              if (0 == (var9 ^ -1)) {
                var11 = var8;
                var2 = var11;
                var2 = var11;
                break L3;
              } else {
                var11 = var8.substring(0, var9);
                break L3;
              }
            }
            L4: {
              var16 = var11.trim();
              var2 = var16;
              var2 = var16;
              var17 = var16.substring(1 + var16.lastIndexOf(' '));
              var2 = var17;
              var2 = var17;
              var18 = var17.substring(var17.lastIndexOf('\t') + 1);
              var2 = var18;
              var2 = var18;
              var19 = var2 + var18;
              var2 = var19;
              var2 = var19;
              if (var9 == -1) {
                break L4;
              } else {
                if ((var10 ^ -1) != 0) {
                  var12 = var8.indexOf(".java:", var9);
                  if (-1 >= (var12 ^ -1)) {
                    var2 = var19 + var8.substring(5 + var12, var10);
                    break L4;
                  } else {
                    break L4;
                  }
                } else {
                  var2 = var2 + 32;
                  continue L2;
                }
              }
            }
            var2 = var2 + 32;
            continue L2;
          }
        }
    }

    id(java.net.Socket param0, md param1) throws IOException {
        this(param0, param1, 5000);
    }

    final void a(byte[] param0, int param1, byte param2, int param3) throws IOException {
        Object var5 = null;
        int var6 = 0;
        Object var7 = null;
        int var8 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = MonkeyPuzzle2.field_F ? 1 : 0;
                    if (!((id) this).field_n) {
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
                    if (!((id) this).field_i) {
                        statePc = 4;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    ((id) this).field_i = false;
                    throw new IOException();
                }
                case 4: {
                    if (((id) this).field_c != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((id) this).field_c = new byte[((id) this).field_k];
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
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (var6 >= param3) {
                            statePc = 13;
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
                        ((id) this).field_c[((id) this).field_e] = param0[var6 + param1];
                        ((id) this).field_e = (((id) this).field_e - -1) % ((id) this).field_k;
                        if ((-100 + (((id) this).field_k + ((id) this).field_l)) % ((id) this).field_k == ((id) this).field_e) {
                            statePc = 11;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw new IOException();
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var6++;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (null == ((id) this).field_d) {
                            statePc = 15;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        ((id) this).field_d = ((id) this).field_f.a((Runnable) this, 3, 0);
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 20;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        if (param2 >= 12) {
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
                        ((id) this).a((byte) 110);
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

    public static void b(int param0) {
        field_h = null;
        if (param0 != 1) {
            field_h = null;
        }
    }

    final void a(int param0, boolean param1, byte[] param2, int param3) throws IOException {
        int var5 = 0;
        int var6 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (!(!((id) this).field_n)) {
            return;
        }
        while (0 < param0) {
            var5 = ((id) this).field_g.read(param2, param3, param0);
            if (!(-1 > (var5 ^ -1))) {
                throw new EOFException();
            }
            param0 = param0 - var5;
            param3 = param3 + var5;
        }
        if (!param1) {
            ((id) this).a((byte) 64);
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
                        var6 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var3 = this;
                            if (((id) this).field_e != ((id) this).field_l) {
                                statePc = 6;
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
                            if (((id) this).field_n) {
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.wait();
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = ((id) this).field_l;
                            if (((id) this).field_e < ((id) this).field_l) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1_int = ((id) this).field_e - ((id) this).field_l;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var1_int = ((id) this).field_k - ((id) this).field_l;
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (-1 > (var1_int ^ -1)) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            ((id) this).field_b.write(((id) this).field_c, var2, var1_int);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = (stateCaught_11 instanceof IOException ? 13 : 30);
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((id) this).field_i = true;
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
                            ((id) this).field_l = (((id) this).field_l - -var1_int) % ((id) this).field_k;
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (((id) this).field_e != ((id) this).field_l) {
                                statePc = 1;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            ((id) this).field_b.flush();
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof IOException ? 18 : 30);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            ((id) this).field_i = true;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (((id) this).field_g == null) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof IOException ? 27 : 30);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            ((id) this).field_g.close();
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
                            if (((id) this).field_b == null) {
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
                            ((id) this).field_b.close();
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
                            if (null != ((id) this).field_j) {
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
                            ((id) this).field_j.close();
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
                            ((id) this).field_c = null;
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
                        kk.a((String) null, (byte) 69, (Throwable) (Object) var1_ref);
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

    final int c(int param0) throws IOException {
        int var2 = -80 % ((param0 - -42) / 38);
        if (((id) this).field_n) {
            return 0;
        }
        return ((id) this).field_g.available();
    }

    private id(java.net.Socket param0, md param1, int param2) throws IOException {
        ((id) this).field_l = 0;
        ((id) this).field_n = false;
        ((id) this).field_e = 0;
        ((id) this).field_i = false;
        ((id) this).field_j = param0;
        ((id) this).field_f = param1;
        ((id) this).field_j.setSoTimeout(30000);
        ((id) this).field_j.setTcpNoDelay(true);
        ((id) this).field_g = ((id) this).field_j.getInputStream();
        ((id) this).field_b = ((id) this).field_j.getOutputStream();
        ((id) this).field_k = param2;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_h = "Type your password again to make sure it's correct";
        field_a = 250;
    }
}
