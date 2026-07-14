/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class u implements Runnable {
    static String[][] field_e;
    static ew[] field_j;
    private iw field_g;
    private wu field_l;
    private wu field_f;
    private bu field_a;
    private DataInputStream field_d;
    private int field_b;
    static wn field_h;
    private java.net.URL field_k;
    private wu field_i;
    static boolean field_c;

    final iw b(int param0) {
        if (param0 != 0) {
            return null;
        }
        if (!(((u) this).field_b != 3)) {
            return ((u) this).field_g;
        }
        return null;
    }

    final synchronized boolean a(byte param0) {
        IOException var2 = null;
        OutputStream var3 = null;
        java.net.Socket var4 = null;
        CharSequence var5 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (-3 >= ((u) this).field_b) {
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
                    if (-1 != ((u) this).field_b) {
                        statePc = 11;
                    } else {
                        statePc = 4;
                    }
                    continue stateLoop;
                }
                case 4: {
                    if (((u) this).field_l == null) {
                        statePc = 6;
                    } else {
                        statePc = 7;
                    }
                    continue stateLoop;
                }
                case 6: {
                    ((u) this).field_l = ((u) this).field_a.a(((u) this).field_k, (byte) -122);
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if (((u) this).field_l.field_a != 0) {
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
                    if ((((u) this).field_l.field_a ^ -1) == -2) {
                        statePc = 11;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 10: {
                    ((u) this).field_l = null;
                    ((u) this).field_b = ((u) this).field_b + 1;
                    return false;
                }
                case 11: {
                    if (1 == ((u) this).field_b) {
                        statePc = 13;
                    } else {
                        statePc = 20;
                    }
                    continue stateLoop;
                }
                case 13: {
                    if (((u) this).field_f != null) {
                        statePc = 15;
                    } else {
                        statePc = 14;
                    }
                    continue stateLoop;
                }
                case 14: {
                    ((u) this).field_f = ((u) this).field_a.a(true, ((u) this).field_k.getHost(), 443);
                    statePc = 15;
                    continue stateLoop;
                }
                case 15: {
                    if (-1 == (((u) this).field_f.field_a ^ -1)) {
                        statePc = 17;
                    } else {
                        statePc = 18;
                    }
                    continue stateLoop;
                }
                case 17: {
                    return false;
                }
                case 18: {
                    if (((u) this).field_f.field_a == 1) {
                        statePc = 20;
                    } else {
                        statePc = 19;
                    }
                    continue stateLoop;
                }
                case 19: {
                    ((u) this).field_b = ((u) this).field_b + 1;
                    ((u) this).field_f = null;
                    return false;
                }
                case 20: {
                    if (null == ((u) this).field_d) {
                        statePc = 32;
                    } else {
                        statePc = 21;
                    }
                    continue stateLoop;
                }
                case 21: {
                    if (param0 > 45) {
                        statePc = 23;
                    } else {
                        statePc = 22;
                    }
                    continue stateLoop;
                }
                case 22: {
                    String discarded$3 = u.a(false);
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (null == ((u) this).field_i) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    ((u) this).field_i = ((u) this).field_a.a(5, (byte) 125, (Runnable) this);
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    if (-1 != ((u) this).field_i.field_a) {
                        statePc = 28;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 27: {
                    return false;
                }
                case 28: {
                    if (-2 == ((u) this).field_i.field_a) {
                        statePc = 30;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    ((u) this).finalize();
                    ((u) this).field_b = ((u) this).field_b + 1;
                    return false;
                }
                case 30: {
                    return false;
                }
                case 32: {
                    try {
                        if (((u) this).field_b != 0) {
                            statePc = 34;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        ((u) this).field_d = (DataInputStream) ((u) this).field_l.field_b;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if (1 == ((u) this).field_b) {
                            statePc = 36;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var4 = (java.net.Socket) ((u) this).field_f.field_b;
                        var4.setSoTimeout(10000);
                        var3 = var4.getOutputStream();
                        var3.write(17);
                        var5 = (CharSequence) (Object) ("JAGGRAB " + ((u) this).field_k.getFile() + "\n\n");
                        var3.write(ok.a(var5, (byte) 106));
                        ((u) this).field_d = new DataInputStream(var4.getInputStream());
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        ((u) this).field_g.field_n = 0;
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 38: {
                    if (param0 > 45) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    String discarded$4 = u.a(false);
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (null == ((u) this).field_i) {
                        statePc = 42;
                    } else {
                        statePc = 43;
                    }
                    continue stateLoop;
                }
                case 42: {
                    ((u) this).field_i = ((u) this).field_a.a(5, (byte) 125, (Runnable) this);
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    if (-1 == ((u) this).field_i.field_a) {
                        statePc = 48;
                    } else {
                        statePc = 44;
                    }
                    continue stateLoop;
                }
                case 44: {
                    if (-2 != ((u) this).field_i.field_a) {
                        statePc = 46;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 46: {
                    ((u) this).finalize();
                    ((u) this).field_b = ((u) this).field_b + 1;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    return false;
                }
                case 48: {
                    return false;
                }
                case 50: {
                    var2 = (IOException) (Object) caughtException;
                    ((u) this).finalize();
                    ((u) this).field_b = ((u) this).field_b + 1;
                    if (param0 > 45) {
                        statePc = 61;
                    } else {
                        statePc = 51;
                    }
                    continue stateLoop;
                }
                case 51: {
                    String discarded$5 = u.a(false);
                    if (null == ((u) this).field_i) {
                        statePc = 53;
                    } else {
                        statePc = 54;
                    }
                    continue stateLoop;
                }
                case 53: {
                    ((u) this).field_i = ((u) this).field_a.a(5, (byte) 125, (Runnable) this);
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    if (-1 == ((u) this).field_i.field_a) {
                        statePc = 59;
                    } else {
                        statePc = 55;
                    }
                    continue stateLoop;
                }
                case 55: {
                    if (-2 != ((u) this).field_i.field_a) {
                        statePc = 57;
                    } else {
                        statePc = 58;
                    }
                    continue stateLoop;
                }
                case 57: {
                    ((u) this).finalize();
                    ((u) this).field_b = ((u) this).field_b + 1;
                    statePc = 58;
                    continue stateLoop;
                }
                case 58: {
                    return false;
                }
                case 59: {
                    return false;
                }
                case 61: {
                    if (null == ((u) this).field_i) {
                        statePc = 63;
                    } else {
                        statePc = 64;
                    }
                    continue stateLoop;
                }
                case 63: {
                    ((u) this).field_i = ((u) this).field_a.a(5, (byte) 125, (Runnable) this);
                    statePc = 64;
                    continue stateLoop;
                }
                case 64: {
                    if (-1 == ((u) this).field_i.field_a) {
                        statePc = 69;
                    } else {
                        statePc = 65;
                    }
                    continue stateLoop;
                }
                case 65: {
                    if (-2 != ((u) this).field_i.field_a) {
                        statePc = 67;
                    } else {
                        statePc = 68;
                    }
                    continue stateLoop;
                }
                case 67: {
                    ((u) this).finalize();
                    ((u) this).field_b = ((u) this).field_b + 1;
                    statePc = 68;
                    continue stateLoop;
                }
                case 68: {
                    return false;
                }
                case 69: {
                    return false;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final static String a(boolean param0) {
        if (param0) {
          if (!nc.field_a) {
            if (us.field_e <= k.field_i) {
              if (k.field_i >= rd.field_i + us.field_e) {
                return null;
              } else {
                return mh.field_o;
              }
            } else {
              return null;
            }
          } else {
            return null;
          }
        } else {
          u.a(28);
          if (!nc.field_a) {
            if (us.field_e <= k.field_i) {
              if (k.field_i >= rd.field_i + us.field_e) {
                return null;
              } else {
                return mh.field_o;
              }
            } else {
              return null;
            }
          } else {
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
                        var4 = Kickabout.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (((u) this).field_g.field_f.length <= ((u) this).field_g.field_n) {
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
                            var1_int = ((u) this).field_d.read(((u) this).field_g.field_f, ((u) this).field_g.field_n, -((u) this).field_g.field_n + ((u) this).field_g.field_f.length);
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
                            ((u) this).field_g.field_n = ((u) this).field_g.field_n + var1_int;
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
                            if (((u) this).field_g.field_n == ((u) this).field_g.field_f.length) {
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
                            throw (RuntimeException) (Object) new Exception("HG1: " + ((u) this).field_g.field_f.length + " " + ((u) this).field_k);
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
                            ((u) this).finalize();
                            ((u) this).field_b = 3;
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
                            ((u) this).finalize();
                            ((u) this).field_b = ((u) this).field_b + 1;
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

    public static void a(int param0) {
        field_h = null;
        field_j = null;
        if (param0 != -2) {
          field_e = null;
          field_e = null;
          return;
        } else {
          field_e = null;
          return;
        }
    }

    u(bu param0, java.net.URL param1, int param2) {
        ((u) this).field_a = param0;
        ((u) this).field_k = param1;
        ((u) this).field_g = new iw(param2);
    }

    protected final void finalize() {
        if (null != ((u) this).field_l) {
            if (null != ((u) this).field_l.field_b) {
                try {
                    ((DataInputStream) ((u) this).field_l.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((u) this).field_l = null;
        }
        if (null != ((u) this).field_f) {
            if (null != ((u) this).field_f.field_b) {
                try {
                    ((java.net.Socket) ((u) this).field_f.field_b).close();
                } catch (Exception exception) {
                }
            }
            ((u) this).field_f = null;
        }
        if (((u) this).field_d != null) {
            try {
                ((u) this).field_d.close();
            } catch (Exception exception) {
            }
            ((u) this).field_d = null;
        }
        ((u) this).field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = new String[][]{new String[2], new String[2]};
    }
}
