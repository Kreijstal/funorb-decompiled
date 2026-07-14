/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class un implements Runnable {
    private Object field_v;
    private in field_t;
    private static String field_r;
    private gb field_o;
    gl field_g;
    private gb field_b;
    private static int field_c;
    static String field_m;
    private Object field_w;
    gl field_s;
    private boolean field_q;
    gl[] field_n;
    static String field_u;
    static java.lang.reflect.Method field_l;
    private static volatile long field_k;
    static String field_e;
    private hh field_x;
    java.awt.EventQueue field_d;
    private Thread field_j;
    private boolean field_i;
    private static String field_f;
    boolean field_h;
    gl field_p;
    private static String field_a;

    final gb a(byte param0, Class param1, Class[] param2, String param3) {
        if (param0 > -49) {
            ((un) this).run();
        }
        return this.a(0, 8, (Object) (Object) new Object[3], true, 0);
    }

    final boolean b(int param0) {
        if (param0 != 5) {
            ((un) this).field_d = null;
        }
        if (!(((un) this).field_h)) {
            return false;
        }
        if (!((un) this).field_i) {
            return ((un) this).field_v != null ? true : false;
        }
        return ((un) this).field_x != null ? true : false;
    }

    final gb a(int param0, String param1, Class param2) {
        int var4 = -116 % ((param0 - -49) / 40);
        return this.a(0, 9, (Object) (Object) new Object[2], true, 0);
    }

    private final static gl a(String param0, int param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            gl var8_ref = null;
            gl stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            gl stackOut_13_0 = null;
            L0: {
              if (33 != param2) {
                if ((param2 ^ -1) == -35) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            if (param1 < -12) {
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7 = var5_array[var6];
                    if (-1 <= (var7.length() ^ -1)) {
                      break L2;
                    } else {
                      if (new File(var7).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    var8_ref = new gl(new File(var7, var4), "rw", 10000L);
                    stackOut_13_0 = (gl) var8_ref;
                    stackIn_14_0 = stackOut_13_0;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return stackIn_14_0;
                  }
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final gb a(byte param0) {
        if (param0 > -12) {
            Object var3 = null;
            gb discarded$0 = ((un) this).a(-51, false, (String) null);
        }
        return this.a(0, 5, (Object) null, true, 0);
    }

    private final gb a(int param0, int param1, Object param2, boolean param3, int param4) {
        gb var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new gb();
                    var6.field_g = param4;
                    var6.field_e = param2;
                    var6.field_f = param0;
                    var6.field_d = param1;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param3) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_c = -46;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (null == ((un) this).field_o) {
                            statePc = 5;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        ((un) this).field_o.field_c = var6;
                        ((un) this).field_o = var6;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((un) this).field_b = var6;
                        ((un) this).field_o = var6;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        this.notify();
                        // monitorexit var7
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 9: {
                    throw (RuntimeException) (Object) var8;
                }
                case 10: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final gb a(int param0, java.net.URL param1) {
        if (param0 != 5) {
            return null;
        }
        return this.a(0, 4, (Object) (Object) param1, true, 0);
    }

    final gb a(java.awt.Frame param0, byte param1) {
        if (param1 != -116) {
            Object var4 = null;
            gb discarded$0 = ((un) this).a((Runnable) null, 17, -112);
        }
        return this.a(0, 7, (Object) (Object) param0, true, 0);
    }

    final gb a(int param0, boolean param1, String param2) {
        if (param1) {
            Object var5 = null;
            gb discarded$0 = ((un) this).a(52, false, (String) null);
        }
        return this.a(param2, true, false, param0);
    }

    final void a(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((un) this).field_q = true;
                            if (param0 > 95) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_f = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 7: {
                        try {
                            ((un) this).field_j.join();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 10;
                        continue stateLoop;
                    }
                    case 10: {
                        if (((un) this).field_p != null) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((un) this).field_p.d(107);
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 15;
                        continue stateLoop;
                    }
                    case 15: {
                        if (null != ((un) this).field_g) {
                            statePc = 17;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        try {
                            ((un) this).field_g.d(102);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (null != ((un) this).field_n) {
                            statePc = 22;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var2_int = 0;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        if (var2_int >= ((un) this).field_n.length) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (((un) this).field_n[var2_int] != null) {
                            statePc = 26;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 26: {
                        try {
                            ((un) this).field_n[var2_int].d(119);
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 28: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 29: {
                        if (null != ((un) this).field_s) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((un) this).field_s.d(98);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 33;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 34;
                        continue stateLoop;
                    }
                    case 34: {
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

    private final gb a(String param0, boolean param1, boolean param2, int param3) {
        if (!param1) {
            return null;
        }
        return this.a(param3, !param2 ? 1 : 22, (Object) (Object) param0, param1, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            va var3_ref2 = null;
            gl var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            gb var8 = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_57_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_56_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2 = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (!((un) this).field_q) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (((un) this).field_b != null) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var8 = ((un) this).field_b;
                            ((un) this).field_b = ((un) this).field_b.field_c;
                            if (((un) this).field_b == null) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((un) this).field_o = null;
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            this.wait();
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = (stateCaught_9 instanceof InterruptedException ? 11 : 14);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            // monitorexit var2
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 16: {
                        try {
                            var2_int = var8.field_d;
                            if (var2_int == -2) {
                                statePc = 107;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (22 == var2_int) {
                                statePc = 101;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-3 == var2_int) {
                                statePc = 100;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((var2_int ^ -1) != -5) {
                                statePc = 24;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (field_k > lo.a((byte) 97)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var8.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_e).openStream());
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if ((var2_int ^ -1) == -9) {
                                statePc = 95;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (9 != var2_int) {
                                statePc = 31;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var9 = (Object[]) var8.field_e;
                            if (!((un) this).field_h) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (null == ((Class) var9[0]).getClassLoader()) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredField((String) var9[1]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if ((var2_int ^ -1) != -19) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_b = (Object) (Object) var10.getContents((Object) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var2_int == 19) {
                                statePc = 94;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (((un) this).field_h) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (-4 == (var2_int ^ -1)) {
                                statePc = 91;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var2_int == -22) {
                                statePc = 88;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var2_int == 5) {
                                statePc = 85;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (-7 == var2_int) {
                                statePc = 82;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if ((var2_int ^ -1) != -8) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (!((un) this).field_i) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((un) this).field_x.a((byte) 54, (java.awt.Frame) var8.field_e);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            Object discarded$6 = Class.forName("bg").getMethod("exit", new Class[0]).invoke(((un) this).field_v, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var2_int != 12) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var3_ref3 = un.a((String) var8.field_e, -63, field_c, field_a);
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((var2_int ^ -1) == -14) {
                                statePc = 81;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!((un) this).field_h) {
                                statePc = 52;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2_int ^ -1) != -15) {
                                statePc = 52;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3_int = var8.field_f;
                            var4_int = var8.field_g;
                            if (((un) this).field_i) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            Object discarded$7 = Class.forName("up").getDeclaredMethod("movemouse", new Class[2]).invoke(((un) this).field_w, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            ((un) this).field_t.a(var4_int, var3_int, 0);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((un) this).field_h) {
                                statePc = 60;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (15 != var2_int) {
                                statePc = 60;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (-1 == (var8.field_f ^ -1)) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            stackOut_55_0 = 1;
                            stackIn_57_0 = stackOut_55_0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            stackOut_56_0 = 0;
                            stackIn_57_0 = stackOut_56_0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var3_int = stackIn_57_0;
                            var11 = (java.awt.Component) var8.field_e;
                            if (!((un) this).field_i) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((un) this).field_t.a(var3_int != 0, var11, (byte) 88);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            Object discarded$8 = Class.forName("up").getDeclaredMethod("showcursor", new Class[2]).invoke(((un) this).field_w, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((un) this).field_i) {
                                statePc = 63;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var2_int == 17) {
                                statePc = 80;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (16 == var2_int) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (!field_u.startsWith("win")) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 79 : (stateCaught_65 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 79 : (stateCaught_66 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 79 : (stateCaught_67 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var12 = (String) var8.field_e;
                            if (var12.startsWith("http://")) {
                                statePc = 71;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 79 : (stateCaught_68 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var12.startsWith("https://")) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 79 : (stateCaught_69 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 79 : (stateCaught_70 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 79 : (stateCaught_71 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var5 >= var12.length()) {
                                statePc = 77;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 79 : (stateCaught_72 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if ((var4_ref.indexOf((int) var12.charAt(var5)) ^ -1) == 0) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 79 : (stateCaught_73 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 79 : (stateCaught_74 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 79 : (stateCaught_75 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var5++;
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 79 : (stateCaught_76 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_b = null;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 79 : (stateCaught_77 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var13 = (Object[]) var8.field_e;
                            Object discarded$10 = Class.forName("up").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((un) this).field_w, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var3_ref3 = un.a((String) var8.field_e, -26, field_c, "");
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_b = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (((un) this).field_i) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            Object discarded$11 = Class.forName("bg").getMethod("enter", new Class[5]).invoke(((un) this).field_v, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((un) this).field_x.a(var8.field_f >>> 1073737104, var8.field_g >> -124729264, (byte) -108, 65535 & var8.field_f, var14, var8.field_g & 65535);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (!((un) this).field_i) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var8.field_b = (Object) (Object) ((un) this).field_x.a((byte) 88);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var8.field_b = Class.forName("bg").getMethod("listmodes", new Class[0]).invoke(((un) this).field_v, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (field_k <= lo.a((byte) 127)) {
                                statePc = 90;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_e).getAddress();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (field_k <= lo.a((byte) 90)) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var15 = (var8.field_f >> -1945308808 & 255) + "." + (255 & var8.field_f >> 1028868624) + "." + (var8.field_f >> -1219629784 & 255) + "." + (255 & var8.field_f);
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_e;
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var17 = (Object[]) var8.field_e;
                            if (!((un) this).field_h) {
                                statePc = 99;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (null == ((Class) var17[0]).getClassLoader()) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var18 = new Thread((Runnable) var8.field_e);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_f);
                            var8.field_b = (Object) (Object) var18;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (lo.a((byte) 108) < field_k) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var8.field_b = (Object) (Object) sj.a(var8.field_f, (String) var8.field_e, (byte) 122).a(true);
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof va ? 106 : (stateCaught_104 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var3_ref2 = (va) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (field_k > lo.a((byte) 111)) {
                                statePc = 109;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var8.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_e), var8.field_f);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8.field_a = 1;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 114: {
                        var2_ref2 = caughtException;
                        var8.field_a = 2;
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 116;
                        continue stateLoop;
                    }
                    case 116: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        throw (RuntimeException) (Object) var6;
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

    final gb a(int param0, int param1, int param2, int param3, byte param4) {
        if (param4 != 4) {
            Object var7 = null;
            gb discarded$0 = this.a((String) null, false, true, 4);
        }
        return this.a((param0 << 844095504) - -param1, 6, (Object) null, true, param3 + (param2 << 1496836240));
    }

    final gb a(Runnable param0, int param1, int param2) {
        if (param1 != 2) {
            return null;
        }
        return this.a(param2, 2, (Object) (Object) param0, true, 0);
    }

    un(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        hh var6 = null;
        Object stackIn_1_0 = null;
        Object stackIn_2_0 = null;
        Object stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        Object stackOut_0_0 = null;
        Object stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        Object stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((un) this).field_o = null;
                    ((un) this).field_b = null;
                    ((un) this).field_g = null;
                    ((un) this).field_q = false;
                    ((un) this).field_p = null;
                    ((un) this).field_i = false;
                    ((un) this).field_h = false;
                    ((un) this).field_s = null;
                    field_m = "1.1";
                    field_a = param1;
                    field_e = "Unknown";
                    stackOut_0_0 = this;
                    stackIn_2_0 = stackOut_0_0;
                    stackIn_1_0 = stackOut_0_0;
                    if (!param3) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    stackOut_1_0 = this;
                    stackOut_1_1 = 1;
                    stackIn_3_0 = stackOut_1_0;
                    stackIn_3_1 = stackOut_1_1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 2: {
                    stackOut_2_0 = this;
                    stackOut_2_1 = 0;
                    stackIn_3_0 = stackOut_2_0;
                    stackIn_3_1 = stackOut_2_1;
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    ((un) this).field_h = stackIn_3_1 != 0;
                    field_c = param0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_e = System.getProperty("java.vendor");
                        field_m = System.getProperty("java.version");
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 7;
                    continue stateLoop;
                }
                case 7: {
                    if ((field_e.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((un) this).field_i = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_r = System.getProperty("os.name");
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 11: {
                    var5 = (Exception) (Object) caughtException;
                    field_r = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_u = field_r.toLowerCase();
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    try {
                        String discarded$4 = System.getProperty("os.arch").toLowerCase();
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 15;
                        continue stateLoop;
                    }
                }
                case 15: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 16;
                    continue stateLoop;
                }
                case 16: {
                    try {
                        String discarded$5 = System.getProperty("os.version").toLowerCase();
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 18: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 19;
                    continue stateLoop;
                }
                case 19: {
                    try {
                        field_f = System.getProperty("user.home");
                        if (field_f == null) {
                            statePc = 23;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        field_f = field_f + "/";
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 22: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 23;
                    continue stateLoop;
                }
                case 23: {
                    if (null != field_f) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_f = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((un) this).field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 27;
                        continue stateLoop;
                    }
                }
                case 27: {
                    var5_ref = caughtException;
                    statePc = 28;
                    continue stateLoop;
                }
                case 28: {
                    if (((un) this).field_i) {
                        statePc = 35;
                    } else {
                        statePc = 29;
                    }
                    continue stateLoop;
                }
                case 29: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 31;
                        continue stateLoop;
                    }
                }
                case 31: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 32;
                    continue stateLoop;
                }
                case 32: {
                    try {
                        field_l = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 34;
                        continue stateLoop;
                    }
                }
                case 34: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 35;
                    continue stateLoop;
                }
                case 35: {
                    lh.a(-98, field_a, field_c);
                    if (!((un) this).field_h) {
                        statePc = 53;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((un) this).field_s = new gl(lh.a((String) null, 6234, "random.dat", field_c), "rw", 25L);
                    ((un) this).field_p = new gl(lh.a("main_file_cache.dat2", -93), "rw", 314572800L);
                    ((un) this).field_g = new gl(lh.a("main_file_cache.idx255", -86), "rw", 1048576L);
                    ((un) this).field_n = new gl[param2];
                    var5_int = 0;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    if (param2 <= var5_int) {
                        statePc = 39;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((un) this).field_n[var5_int] = new gl(lh.a("main_file_cache.idx" + var5_int, -95), "rw", 1048576L);
                    var5_int++;
                    statePc = 37;
                    continue stateLoop;
                }
                case 39: {
                    if (!((un) this).field_i) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    try {
                        Object discarded$7 = Class.forName("ki").newInstance();
                        statePc = 43;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 42;
                        continue stateLoop;
                    }
                }
                case 42: {
                    var5_ref = caughtException;
                    statePc = 43;
                    continue stateLoop;
                }
                case 43: {
                    try {
                        if (((un) this).field_i) {
                            statePc = 45;
                        } else {
                            statePc = 44;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        ((un) this).field_v = Class.forName("bg").newInstance();
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6 = new hh();
                        ((un) this).field_x = var6;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 47: {
                    var5_ref = caughtException;
                    statePc = 48;
                    continue stateLoop;
                }
                case 48: {
                    try {
                        if (((un) this).field_i) {
                            statePc = 50;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((un) this).field_w = Class.forName("up").newInstance();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((un) this).field_t = new in();
                        statePc = 53;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 52;
                        continue stateLoop;
                    }
                }
                case 52: {
                    var5_ref = caughtException;
                    statePc = 53;
                    continue stateLoop;
                }
                case 53: {
                    ((un) this).field_q = false;
                    ((un) this).field_j = new Thread((Runnable) this);
                    ((un) this).field_j.setPriority(10);
                    ((un) this).field_j.setDaemon(true);
                    ((un) this).field_j.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = 0L;
    }
}
