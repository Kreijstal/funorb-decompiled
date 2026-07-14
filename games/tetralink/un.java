/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class un implements Runnable {
    private vl field_i;
    private ie field_a;
    static int[] field_j;
    private vl field_b;
    private DataInputStream field_d;
    private vl field_h;
    private java.net.URL field_e;
    static long field_f;
    private bh field_g;
    private int field_c;

    final synchronized boolean b(byte param0) {
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
                    var2 = 21 / ((59 - param0) / 58);
                    if (-3 < (((un) this).field_c ^ -1)) {
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
                    if (((un) this).field_c != 0) {
                        statePc = 12;
                    } else {
                        statePc = 3;
                    }
                    continue stateLoop;
                }
                case 3: {
                    if (null == ((un) this).field_h) {
                        statePc = 5;
                    } else {
                        statePc = 6;
                    }
                    continue stateLoop;
                }
                case 5: {
                    ((un) this).field_h = ((un) this).field_a.a(false, ((un) this).field_e);
                    statePc = 6;
                    continue stateLoop;
                }
                case 6: {
                    if (0 == ((un) this).field_h.field_d) {
                        statePc = 8;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 8: {
                    return false;
                }
                case 9: {
                    if (-2 != ((un) this).field_h.field_d) {
                        statePc = 11;
                    } else {
                        statePc = 12;
                    }
                    continue stateLoop;
                }
                case 11: {
                    ((un) this).field_c = ((un) this).field_c + 1;
                    ((un) this).field_h = null;
                    return false;
                }
                case 12: {
                    if (-2 == ((un) this).field_c) {
                        statePc = 14;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 14: {
                    if (((un) this).field_i != null) {
                        statePc = 16;
                    } else {
                        statePc = 15;
                    }
                    continue stateLoop;
                }
                case 15: {
                    ((un) this).field_i = ((un) this).field_a.a(443, ((un) this).field_e.getHost(), (byte) 112);
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    if (0 != ((un) this).field_i.field_d) {
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
                    if (((un) this).field_i.field_d == 1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((un) this).field_c = ((un) this).field_c + 1;
                    ((un) this).field_i = null;
                    return false;
                }
                case 20: {
                    if (null != ((un) this).field_d) {
                        statePc = 37;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    try {
                        if (-1 != (((un) this).field_c ^ -1)) {
                            statePc = 23;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        ((un) this).field_d = (DataInputStream) ((un) this).field_h.field_f;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if ((((un) this).field_c ^ -1) != -2) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        var5 = (java.net.Socket) ((un) this).field_i.field_f;
                        var5.setSoTimeout(10000);
                        var4 = var5.getOutputStream();
                        var4.write(17);
                        var6 = (CharSequence) (Object) ("JAGGRAB " + ((un) this).field_e.getFile() + "\n\n");
                        var4.write(q.a(-125, var6));
                        ((un) this).field_d = new DataInputStream(var5.getInputStream());
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        ((un) this).field_g.field_t = 0;
                        statePc = 26;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 26: {
                    if (((un) this).field_b == null) {
                        statePc = 28;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 28: {
                    ((un) this).field_b = ((un) this).field_a.a((Runnable) this, -106, 5);
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (((un) this).field_b.field_d == 0) {
                        statePc = 31;
                    } else {
                        statePc = 32;
                    }
                    continue stateLoop;
                }
                case 31: {
                    return false;
                }
                case 32: {
                    if (1 != ((un) this).field_b.field_d) {
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
                    ((un) this).finalize();
                    ((un) this).field_c = ((un) this).field_c + 1;
                    return false;
                }
                case 36: {
                    var3 = (IOException) (Object) caughtException;
                    ((un) this).finalize();
                    ((un) this).field_c = ((un) this).field_c + 1;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (((un) this).field_b == null) {
                        statePc = 39;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((un) this).field_b = ((un) this).field_a.a((Runnable) this, -106, 5);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (((un) this).field_b.field_d == 0) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    return false;
                }
                case 43: {
                    if (1 != ((un) this).field_b.field_d) {
                        statePc = 45;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    return false;
                }
                case 45: {
                    ((un) this).finalize();
                    ((un) this).field_c = ((un) this).field_c + 1;
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public static void a(int param0) {
        if (param0 != -2) {
            field_j = null;
            field_j = null;
            return;
        }
        field_j = null;
    }

    final bh a(byte param0) {
        if (((un) this).field_c == 3) {
          return ((un) this).field_g;
        } else {
          if (param0 == 79) {
            return null;
          } else {
            bh discarded$2 = ((un) this).a((byte) -122);
            return null;
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
                        var4 = TetraLink.field_J;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((un) this).field_g.field_u.length <= ((un) this).field_g.field_t) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1_int = ((un) this).field_d.read(((un) this).field_g.field_u, ((un) this).field_g.field_t, ((un) this).field_g.field_u.length + -((un) this).field_g.field_t);
                            if ((var1_int ^ -1) > -1) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            ((un) this).field_g.field_t = ((un) this).field_g.field_t + var1_int;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (((un) this).field_g.field_t != ((un) this).field_g.field_u.length) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((un) this).field_g.field_u.length + " " + ((un) this).field_e);
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var1 = this;
                            // monitorenter this
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((un) this).finalize();
                            ((un) this).field_c = 3;
                            // monitorexit var1
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            return;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var2 = caughtException;
                            // monitorexit var1
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            throw (RuntimeException) (Object) var2;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var1_ref = (Exception) (Object) caughtException;
                        var2_ref = this;
                        // monitorenter this
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((un) this).finalize();
                            ((un) this).field_c = ((un) this).field_c + 1;
                            // monitorexit var2_ref
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        return;
                    }
                    case 15: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2_ref
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 16: {
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

    un(ie param0, java.net.URL param1, int param2) {
        ((un) this).field_e = param1;
        ((un) this).field_a = param0;
        ((un) this).field_g = new bh(param2);
    }

    final static ig a(int param0, ah param1, int param2, int param3, ah param4) {
        if (param0 == -29082) {
          if (!ia.a(param3, param4, param2, -58)) {
            return null;
          } else {
            return fa.a(param0 + 28748, param1.a(param0 + 28976, param3, param2));
          }
        } else {
          return null;
        }
    }

    protected final void finalize() {
        if (!(null == ((un) this).field_h)) {
            if (null != ((un) this).field_h.field_f) {
                try {
                    ((DataInputStream) ((un) this).field_h.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((un) this).field_h = null;
        }
        if (null != ((un) this).field_i) {
            if (((un) this).field_i.field_f != null) {
                try {
                    ((java.net.Socket) ((un) this).field_i.field_f).close();
                } catch (Exception exception) {
                }
            }
            ((un) this).field_i = null;
        }
        if (!(((un) this).field_d == null)) {
            try {
                ((un) this).field_d.close();
            } catch (Exception exception) {
            }
            ((un) this).field_d = null;
        }
        ((un) this).field_b = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = new int[5];
    }
}
