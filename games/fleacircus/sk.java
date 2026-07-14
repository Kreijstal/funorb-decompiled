/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class sk implements Runnable {
    private DataInputStream field_b;
    private int field_g;
    private java.net.URL field_c;
    private od field_e;
    private ni field_d;
    private ce field_f;
    private od field_h;
    private od field_a;

    final ni a(int param0) {
        if (param0 < 83) {
            return null;
        }
        if ((((sk) this).field_g ^ -1) != -4) {
            return null;
        }
        return ((sk) this).field_d;
    }

    final synchronized boolean c(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 < ((sk) this).field_g) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return true;
                }
                case 2: {
                    if (-1 == ((sk) this).field_g) {
                        statePc = 4;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((sk) this).field_h != null) {
                        statePc = 6;
                    } else {
                        statePc = 5;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((sk) this).field_h = ((sk) this).field_f.a(((sk) this).field_c, -34);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (-1 != (((sk) this).field_h.field_b ^ -1)) {
                        statePc = 8;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 7: {
                    return false;
                }
                case 8: {
                    if (1 == ((sk) this).field_h.field_b) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((sk) this).field_h = null;
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    return false;
                }
                case 10: {
                    if (param0 > 41) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((sk) this).field_c = null;
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    if (1 == ((sk) this).field_g) {
                        statePc = 14;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (null == ((sk) this).field_e) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((sk) this).field_e = ((sk) this).field_f.a(443, (byte) 32, ((sk) this).field_c.getHost());
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (0 != ((sk) this).field_e.field_b) {
                        statePc = 19;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 18: {
                    return false;
                }
                case 19: {
                    if (-2 != (((sk) this).field_e.field_b ^ -1)) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((sk) this).field_e = null;
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    return false;
                }
                case 22: {
                    if (((sk) this).field_b != null) {
                        statePc = 39;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    try {
                        if (-1 == (((sk) this).field_g ^ -1)) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((sk) this).field_b = (DataInputStream) ((sk) this).field_h.field_e;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        if (1 == ((sk) this).field_g) {
                            statePc = 28;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        var4 = (java.net.Socket) ((sk) this).field_e.field_e;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((sk) this).field_c.getFile() + "\n\n");
                        var3.write(ea.a(-18428, var5));
                        ((sk) this).field_b = new DataInputStream(var4.getInputStream());
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        ((sk) this).field_d.field_i = 0;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 38;
                        continue stateLoop;
                    }
                }
                case 30: {
                    if (((sk) this).field_a != null) {
                        statePc = 32;
                    } else {
                        statePc = 31;
                    }
                    continue stateLoop;
                }
                case 31: {
                    ((sk) this).field_a = ((sk) this).field_f.a(4532, (Runnable) this, 5);
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    if (((sk) this).field_a.field_b != 0) {
                        statePc = 34;
                    } else {
                        statePc = 33;
                    }
                    continue stateLoop;
                }
                case 33: {
                    return false;
                }
                case 34: {
                    if ((((sk) this).field_a.field_b ^ -1) == -2) {
                        statePc = 36;
                    } else {
                        statePc = 35;
                    }
                    continue stateLoop;
                }
                case 35: {
                    ((sk) this).finalize();
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    return false;
                }
                case 36: {
                    return false;
                }
                case 38: {
                    var2 = (IOException) (Object) caughtException;
                    ((sk) this).finalize();
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (((sk) this).field_a != null) {
                        statePc = 47;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((sk) this).field_a = ((sk) this).field_f.a(4532, (Runnable) this, 5);
                    if (((sk) this).field_a.field_b == 0) {
                        statePc = 45;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    if ((((sk) this).field_a.field_b ^ -1) != -2) {
                        statePc = 43;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 43: {
                    ((sk) this).finalize();
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    return false;
                }
                case 45: {
                    return false;
                }
                case 47: {
                    if (((sk) this).field_a.field_b == 0) {
                        statePc = 52;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    if ((((sk) this).field_a.field_b ^ -1) != -2) {
                        statePc = 50;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 50: {
                    ((sk) this).finalize();
                    ((sk) this).field_g = ((sk) this).field_g + 1;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    return false;
                }
                case 52: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(int param0, String param1) {
        if (param0 != 0) {
            return;
        }
        System.out.println("Error: " + tj.a("%0a", param1, "\n", (byte) -66));
    }

    final static void b(byte param0) {
        int[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        Object var5 = null;
        int[] var6 = null;
        int[] var7 = null;
        int[] var8 = null;
        var4 = fleas.field_A ? 1 : 0;
        var8 = ed.field_c;
        var7 = var8;
        var6 = var7;
        var1 = var6;
        var2 = 0;
        var3 = var8.length;
        if (param0 > -75) {
          var5 = null;
          sk.a(-77, (String) null);
          L0: while (true) {
            if (var3 > var2) {
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              continue L0;
            } else {
              return;
            }
          }
        } else {
          L1: while (true) {
            if (var3 > var2) {
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              var2++;
              var1[var2] = 0;
              continue L1;
            } else {
              return;
            }
          }
        }
    }

    public final void run() {
        try {
            int var1_int = 0;
            Object var1 = null;
            Exception var1_ref = null;
            Throwable var2 = null;
            Object var2_ref = null;
            Throwable var3 = null;
            int var4 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var4 = fleas.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((sk) this).field_d.field_i >= ((sk) this).field_d.field_k.length) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((sk) this).field_b.read(((sk) this).field_d.field_k, ((sk) this).field_d.field_i, -((sk) this).field_d.field_i + ((sk) this).field_d.field_k.length);
                            if (0 > var1_int) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((sk) this).field_d.field_i = ((sk) this).field_d.field_i + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((sk) this).field_d.field_i == ((sk) this).field_d.field_k.length) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((sk) this).field_d.field_k.length + " " + ((sk) this).field_c);
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((sk) this).finalize();
                            ((sk) this).field_g = 3;
                            // monitorexit var1
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            return;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((sk) this).finalize();
                            ((sk) this).field_g = ((sk) this).field_g + 1;
                            // monitorexit var2_ref
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        return;
                    }
                    case 16: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        throw (RuntimeException) (Object) var3;
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

    final static java.awt.Container a(byte param0) {
        if (!(cb.field_t == null)) {
            return (java.awt.Container) (Object) cb.field_t;
        }
        if (param0 <= 19) {
            return null;
        }
        return (java.awt.Container) (Object) rl.a((byte) -117);
    }

    sk(ce param0, java.net.URL param1, int param2) {
        ((sk) this).field_f = param0;
        ((sk) this).field_c = param1;
        ((sk) this).field_d = new ni(param2);
    }

    final static void a(int param0, qc param1, int param2, int param3, qc param4, int param5) {
        id.field_c = param5;
        if (param3 != 443) {
            return;
        }
        ae.field_c = param2;
        ge.field_h = param0;
        qg.field_b = param1;
        ub.field_a = param4;
    }

    protected final void finalize() {
        if (!(null == ((sk) this).field_h)) {
            if (!(((sk) this).field_h.field_e == null)) {
                try {
                    ((DataInputStream) ((sk) this).field_h.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((sk) this).field_h = null;
        }
        if (!(((sk) this).field_e == null)) {
            if (!(((sk) this).field_e.field_e == null)) {
                try {
                    ((java.net.Socket) ((sk) this).field_e.field_e).close();
                } catch (Exception exception) {
                }
            }
            ((sk) this).field_e = null;
        }
        if (null != ((sk) this).field_b) {
            try {
                ((sk) this).field_b.close();
            } catch (Exception exception) {
            }
            ((sk) this).field_b = null;
        }
        ((sk) this).field_a = null;
    }

    static {
    }
}
