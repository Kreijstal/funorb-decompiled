/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cc implements Runnable {
    static String[] field_b;
    private rb field_a;
    private java.net.URL field_j;
    private DataInputStream field_g;
    static int field_i;
    private rk field_d;
    private en field_h;
    private en field_e;
    private en field_f;
    private int field_c;

    protected final void finalize() {
        if (null != ((cc) this).field_f) {
            if (((cc) this).field_f.field_f != null) {
                try {
                    ((DataInputStream) ((cc) this).field_f.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((cc) this).field_f = null;
        }
        if (!(null == ((cc) this).field_e)) {
            if (((cc) this).field_e.field_f != null) {
                try {
                    ((java.net.Socket) ((cc) this).field_e.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((cc) this).field_e = null;
        }
        if (!(((cc) this).field_g == null)) {
            try {
                ((cc) this).field_g.close();
            } catch (Exception exception) {
            }
            ((cc) this).field_g = null;
        }
        ((cc) this).field_h = null;
    }

    final rb a(boolean param0) {
        if (!param0) {
            return (rb) null;
        }
        if (3 != ((cc) this).field_c) {
            return null;
        }
        return ((cc) this).field_a;
    }

    final synchronized boolean a(byte param0) {
        int var2 = 0;
        IOException var3 = null;
        OutputStream var4 = null;
        java.net.Socket var5 = null;
        CharSequence var6 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((cc) this).field_c >= 2) {
                        statePc = 2;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 2: {
                    return true;
                }
                case 3: {
                    if (0 != ((cc) this).field_c) {
                        statePc = 12;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (null == ((cc) this).field_f) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((cc) this).field_f = ((cc) this).field_d.a((byte) 71, ((cc) this).field_j);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((cc) this).field_f.field_a != 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return false;
                }
                case 9: {
                    if ((((cc) this).field_f.field_a ^ -1) != -2) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((cc) this).field_f = null;
                    ((cc) this).field_c = ((cc) this).field_c + 1;
                    return false;
                }
                case 12: {
                    var2 = -109 % ((11 - param0) / 36);
                    if (-2 != (((cc) this).field_c ^ -1)) {
                        statePc = 20;
                    } else {
                        statePc = 13;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((cc) this).field_e == null) {
                        statePc = 15;
                    } else {
                        statePc = 16;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((cc) this).field_e = ((cc) this).field_d.a(2, ((cc) this).field_j.getHost(), 443);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (((cc) this).field_e.field_a != 0) {
                        statePc = 18;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return false;
                }
                case 18: {
                    if ((((cc) this).field_e.field_a ^ -1) == -2) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((cc) this).field_c = ((cc) this).field_c + 1;
                    ((cc) this).field_e = null;
                    return false;
                }
                case 20: {
                    if (null == ((cc) this).field_g) {
                        statePc = 30;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (null == ((cc) this).field_h) {
                        statePc = 23;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 23: {
                    ((cc) this).field_h = ((cc) this).field_d.a(5, 1048576, (Runnable) this);
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (((cc) this).field_h.field_a != 0) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    return false;
                }
                case 26: {
                    if (((cc) this).field_h.field_a == -2) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    ((cc) this).finalize();
                    ((cc) this).field_c = ((cc) this).field_c + 1;
                    return false;
                }
                case 28: {
                    return false;
                }
                case 30: {
                    try {
                        if (-1 != ((cc) this).field_c) {
                            statePc = 32;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        ((cc) this).field_g = (DataInputStream) ((cc) this).field_f.field_f;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (-2 != (((cc) this).field_c ^ -1)) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = (java.net.Socket) ((cc) this).field_e.field_f;
                        var5.setSoTimeout(10000);
                        var4 = var5.getOutputStream();
                        var4.write(17);
                        var6 = (CharSequence) ("JAGGRAB " + ((cc) this).field_j.getFile() + "\n\n");
                        var4.write(fa.a(var6, 8482));
                        ((cc) this).field_g = new DataInputStream(var5.getInputStream());
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        ((cc) this).field_a.field_g = 0;
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 35: {
                    if (null == ((cc) this).field_h) {
                        statePc = 37;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((cc) this).field_h = ((cc) this).field_d.a(5, 1048576, (Runnable) this);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (((cc) this).field_h.field_a == 0) {
                        statePc = 43;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if ((((cc) this).field_h.field_a ^ -1) != -2) {
                        statePc = 41;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((cc) this).finalize();
                    ((cc) this).field_c = ((cc) this).field_c + 1;
                    statePc = 42;
                    continue stateLoop;
                }
                case 42: {
                    return false;
                }
                case 43: {
                    return false;
                }
                case 45: {
                    var3 = (IOException) (Object) caughtException;
                    ((cc) this).finalize();
                    ((cc) this).field_c = ((cc) this).field_c + 1;
                    if (null == ((cc) this).field_h) {
                        statePc = 47;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 47: {
                    ((cc) this).field_h = ((cc) this).field_d.a(5, 1048576, (Runnable) this);
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    if (((cc) this).field_h.field_a == 0) {
                        statePc = 53;
                    } else {
                        statePc = 49;
                    }
                    continue stateLoop;
                }
                case 49: {
                    if ((((cc) this).field_h.field_a ^ -1) != -2) {
                        statePc = 51;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 51: {
                    ((cc) this).finalize();
                    ((cc) this).field_c = ((cc) this).field_c + 1;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
            cc.a(-19);
            field_b = null;
            return;
        }
        field_b = null;
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
                        var4 = AceOfSkies.field_G ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((cc) this).field_a.field_g >= ((cc) this).field_a.field_f.length) {
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
                            var1_int = ((cc) this).field_g.read(((cc) this).field_a.field_f, ((cc) this).field_a.field_g, -((cc) this).field_a.field_g + ((cc) this).field_a.field_f.length);
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
                            ((cc) this).field_a.field_g = ((cc) this).field_a.field_g + var1_int;
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
                            if (((cc) this).field_a.field_g == ((cc) this).field_a.field_f.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((cc) this).field_a.field_f.length + " " + ((cc) this).field_j);
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
                            ((cc) this).finalize();
                            ((cc) this).field_c = 3;
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
                            ((cc) this).finalize();
                            ((cc) this).field_c = ((cc) this).field_c + 1;
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

    cc(rk param0, java.net.URL param1, int param2) {
        ((cc) this).field_d = param0;
        ((cc) this).field_j = param1;
        ((cc) this).field_a = new rb(param2);
    }

    static {
    }
}
