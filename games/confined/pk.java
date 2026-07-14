/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pk implements Runnable {
    private bc field_i;
    private java.net.URL field_g;
    private DataInputStream field_h;
    private bc field_b;
    private df field_j;
    static String field_f;
    private kg field_d;
    private bc field_a;
    static int field_c;
    private int field_e;

    final kg a(int param0) {
        if ((((pk) this).field_e ^ -1) != param0) {
            return null;
        }
        return ((pk) this).field_d;
    }

    public static void c(int param0) {
        if (param0 != -13541) {
            pk.c(46);
            field_f = null;
            return;
        }
        field_f = null;
    }

    protected final void finalize() {
        if (!(null == ((pk) this).field_b)) {
            if (null != ((pk) this).field_b.field_f) {
                try {
                    ((DataInputStream) ((pk) this).field_b.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((pk) this).field_b = null;
        }
        if (((pk) this).field_i != null) {
            if (null != ((pk) this).field_i.field_f) {
                try {
                    ((java.net.Socket) ((pk) this).field_i.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((pk) this).field_i = null;
        }
        if (((pk) this).field_h != null) {
            try {
                ((pk) this).field_h.close();
            } catch (Exception exception) {
            }
            ((pk) this).field_h = null;
        }
        ((pk) this).field_a = null;
    }

    final synchronized boolean b(int param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (((pk) this).field_e >= 2) {
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
                    if (0 == ((pk) this).field_e) {
                        statePc = 5;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 5: {
                    if (null != ((pk) this).field_b) {
                        statePc = 7;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((pk) this).field_b = ((pk) this).field_j.a(param0 ^ 1, ((pk) this).field_g);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((pk) this).field_b.field_g == 0) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    return false;
                }
                case 10: {
                    if (((pk) this).field_b.field_g == -2) {
                        statePc = 12;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((pk) this).field_b = null;
                    ((pk) this).field_e = ((pk) this).field_e + 1;
                    return false;
                }
                case 12: {
                    if (-2 == ((pk) this).field_e) {
                        statePc = 14;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (((pk) this).field_i == null) {
                        statePc = 16;
                    } else {
                        statePc = 17;
                    }
                    continue stateLoop;
                }
                case 16: {
                    ((pk) this).field_i = ((pk) this).field_j.a(443, param0 + -125, ((pk) this).field_g.getHost());
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    if (((pk) this).field_i.field_g != 0) {
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
                    if (((pk) this).field_i.field_g != 1) {
                        statePc = 21;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 21: {
                    ((pk) this).field_e = ((pk) this).field_e + 1;
                    ((pk) this).field_i = null;
                    return false;
                }
                case 22: {
                    if (((pk) this).field_h == null) {
                        statePc = 31;
                    } else {
                        statePc = 23;
                    }
                    continue stateLoop;
                }
                case 23: {
                    if (((pk) this).field_a != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    ((pk) this).field_a = ((pk) this).field_j.a((byte) 106, (Runnable) this, 5);
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    if (0 != ((pk) this).field_a.field_g) {
                        statePc = 27;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 26: {
                    return false;
                }
                case 27: {
                    if (((pk) this).field_a.field_g != param0) {
                        statePc = 29;
                    } else {
                        statePc = 28;
                    }
                    continue stateLoop;
                }
                case 28: {
                    return false;
                }
                case 29: {
                    ((pk) this).finalize();
                    ((pk) this).field_e = ((pk) this).field_e + 1;
                    return false;
                }
                case 31: {
                    try {
                        if (-1 != ((pk) this).field_e) {
                            statePc = 33;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        ((pk) this).field_h = (DataInputStream) ((pk) this).field_b.field_f;
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        if (-2 != ((pk) this).field_e) {
                            statePc = 35;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        var4 = (java.net.Socket) ((pk) this).field_i.field_f;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((pk) this).field_g.getFile() + "\n\n");
                        var3.write(ta.a((byte) -126, var5));
                        ((pk) this).field_h = new DataInputStream(var4.getInputStream());
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        ((pk) this).field_d.field_n = 0;
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 36: {
                    if (((pk) this).field_a != null) {
                        statePc = 38;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((pk) this).field_a = ((pk) this).field_j.a((byte) 106, (Runnable) this, 5);
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (0 == ((pk) this).field_a.field_g) {
                        statePc = 42;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    if (((pk) this).field_a.field_g == param0) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((pk) this).finalize();
                    ((pk) this).field_e = ((pk) this).field_e + 1;
                    statePc = 41;
                    continue stateLoop;
                }
                case 41: {
                    return false;
                }
                case 42: {
                    return false;
                }
                case 44: {
                    var2 = (IOException) (Object) caughtException;
                    ((pk) this).finalize();
                    ((pk) this).field_e = ((pk) this).field_e + 1;
                    if (((pk) this).field_a != null) {
                        statePc = 51;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 45: {
                    ((pk) this).field_a = ((pk) this).field_j.a((byte) 106, (Runnable) this, 5);
                    if (0 != ((pk) this).field_a.field_g) {
                        statePc = 47;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 46: {
                    return false;
                }
                case 47: {
                    if (((pk) this).field_a.field_g == param0) {
                        statePc = 49;
                    } else {
                        statePc = 48;
                    }
                    continue stateLoop;
                }
                case 48: {
                    ((pk) this).finalize();
                    ((pk) this).field_e = ((pk) this).field_e + 1;
                    return false;
                }
                case 49: {
                    return false;
                }
                case 51: {
                    if (0 != ((pk) this).field_a.field_g) {
                        statePc = 53;
                    } else {
                        statePc = 52;
                    }
                    continue stateLoop;
                }
                case 52: {
                    return false;
                }
                case 53: {
                    if (((pk) this).field_a.field_g != param0) {
                        statePc = 55;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 54: {
                    return false;
                }
                case 55: {
                    ((pk) this).finalize();
                    ((pk) this).field_e = ((pk) this).field_e + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static void a(boolean param0, String param1, java.applet.Applet param2, byte param3) {
        try {
            if (df.field_f.startsWith("win")) {
                if (!(!ik.a(param1, -1))) {
                    return;
                }
            }
            try {
                int var4_int = -70 / ((param3 - -9) / 51);
                param2.getAppletContext().showDocument(new java.net.URL(param1), "_blank");
            } catch (java.net.MalformedURLException malformedURLException) {
                mb.a("MGR1: " + param1, true, (Throwable) null);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
                        var4 = Confined.field_J ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((pk) this).field_d.field_m.length <= ((pk) this).field_d.field_n) {
                                statePc = 5;
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
                            var1_int = ((pk) this).field_h.read(((pk) this).field_d.field_m, ((pk) this).field_d.field_n, ((pk) this).field_d.field_m.length + -((pk) this).field_d.field_n);
                            if (-1 >= (var1_int ^ -1)) {
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            ((pk) this).field_d.field_n = ((pk) this).field_d.field_n + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((pk) this).field_d.field_n != ((pk) this).field_d.field_m.length) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((pk) this).field_d.field_m.length + " " + ((pk) this).field_g);
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
                            ((pk) this).finalize();
                            ((pk) this).field_e = 3;
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
                            ((pk) this).finalize();
                            ((pk) this).field_e = ((pk) this).field_e + 1;
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

    pk(df param0, java.net.URL param1, int param2) {
        ((pk) this).field_g = param1;
        ((pk) this).field_j = param0;
        ((pk) this).field_d = new kg(param2);
    }

    final static void a(byte param0, String param1) {
        if (param0 < 10) {
            return;
        }
        if (!ie.field_a) {
            hc.field_u = param1;
            bg.field_f = 0;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_f = "<col=FFFFFF>Disruption cannon:</col> operated similarly to the charge cannon but with <col=FFFFFF><%0></col>, this weapon fires a light-bending vortex that sucks things in and blows them up. It also gets bigger as it gets further away!";
    }
}
