/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class le implements Runnable {
    private static String field_s;
    private gb field_f;
    wk field_d;
    java.awt.EventQueue field_e;
    private boolean field_q;
    static String field_m;
    private l field_i;
    wk field_t;
    wk field_x;
    static String field_v;
    private Thread field_j;
    static java.lang.reflect.Method field_g;
    private static int field_u;
    boolean field_b;
    wk[] field_o;
    private static String field_r;
    private vi field_c;
    private static String field_a;
    static String field_w;
    private boolean field_n;
    private Object field_l;
    private static volatile long field_k;
    private Object field_h;
    private vi field_p;

    final vi a(java.net.URL param0, boolean param1) {
        if (!param1) {
            ((le) this).field_d = (wk) null;
        }
        return this.a(4, 0, 0, 13003, (Object) (Object) param0);
    }

    final boolean b(byte param0) {
        if (!((le) this).field_b) {
            return false;
        }
        if (param0 >= -115) {
            java.awt.Frame var3 = (java.awt.Frame) null;
            vi discarded$0 = ((le) this).a((byte) 54, (java.awt.Frame) null);
        }
        if (!((le) this).field_q) {
            return null != ((le) this).field_l ? true : false;
        }
        return null != ((le) this).field_i ? true : false;
    }

    private final static wk a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            wk var8_ref = null;
            wk stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            wk stackOut_13_0 = null;
            L0: {
              if ((param1 ^ -1) == -34) {
                var4 = "jagex_" + param3 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_s, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 <= -61) {
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
                  L2: {
                    var7 = var5_array[var6];
                    if (var7.length() <= 0) {
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
                    var8_ref = new wk(new File(var7, var4), "rw", 10000L);
                    stackOut_13_0 = (wk) var8_ref;
                    stackIn_14_0 = stackOut_13_0;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return (wk) (Object) stackIn_14_0;
                  }
                  continue L1;
                } else {
                  return null;
                }
              }
            } else {
              return (wk) null;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final vi a(int param0, int param1, int param2, int param3, Object param4) {
        vi var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param3 == 13003) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((le) this).field_o = (wk[]) null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new vi();
                    var6.field_c = param0;
                    var6.field_g = param4;
                    var6.field_d = param2;
                    var6.field_b = param1;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null == ((le) this).field_c) {
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
                        ((le) this).field_c.field_f = (vi) var6;
                        ((le) this).field_c = (vi) var6;
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
                        ((le) this).field_p = var6;
                        ((le) this).field_c = var6;
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

    final vi a(byte param0) {
        if (param0 != 104) {
            return (vi) null;
        }
        return this.a(5, 0, 0, 13003, (Object) null);
    }

    final vi a(int param0, int param1, Runnable param2) {
        if (param0 != 0) {
            ((le) this).run();
        }
        return this.a(2, 0, param1, 13003, (Object) (Object) param2);
    }

    final vi a(Class param0, String param1, int param2) {
        if (param2 <= 58) {
            java.net.URL var5 = (java.net.URL) null;
            vi discarded$0 = ((le) this).a((java.net.URL) null, true);
        }
        return this.a(9, 0, 0, 13003, (Object) (Object) new Object[2]);
    }

    final vi a(byte param0, java.awt.Frame param1) {
        if (param0 >= -9) {
            return (vi) null;
        }
        return this.a(7, 0, 0, 13003, (Object) (Object) param1);
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
                            ((le) this).field_n = true;
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 3;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 5: {
                        try {
                            if (param0 == 0) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            ((le) this).field_j.join();
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
                        if (null != ((le) this).field_t) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((le) this).field_t.a((byte) 42);
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
                        if (((le) this).field_d == null) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((le) this).field_d.a((byte) 79);
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (null != ((le) this).field_o) {
                            statePc = 21;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var2_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (((le) this).field_o.length <= var2_int) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (((le) this).field_o[var2_int] != null) {
                            statePc = 25;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 25: {
                        try {
                            ((le) this).field_o[var2_int].a((byte) 39);
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 27;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 27: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 28: {
                        if (null == ((le) this).field_x) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((le) this).field_x.a((byte) 14);
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        var2_ref2 = (IOException) (Object) caughtException;
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

    final vi a(byte param0, Class param1, String param2, Class[] param3) {
        if (param0 != 99) {
            ((le) this).field_t = (wk) null;
        }
        return this.a(8, 0, 0, 13003, (Object) (Object) new Object[3]);
    }

    final vi a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 != -30) {
            return (vi) null;
        }
        return this.a(6, (param0 << 1230207248) + param2, param1 + (param4 << -515191568), 13003, (Object) null);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            vc var3_ref_vc = null;
            Exception var3_ref_Exception = null;
            wk var3_ref = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            vi var8 = null;
            Thread var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Component var14 = null;
            java.awt.Frame var15 = null;
            String var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_77_0 = 0;
            int stackOut_75_0 = 0;
            int stackOut_76_0 = 0;
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
                            if (((le) this).field_n) {
                                statePc = 3;
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var2
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            if (null == ((le) this).field_p) {
                                statePc = 8;
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
                            var8 = ((le) this).field_p;
                            ((le) this).field_p = ((le) this).field_p.field_f;
                            if (((le) this).field_p != null) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((le) this).field_c = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.wait();
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof InterruptedException ? 10 : 13);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3_ref_InterruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var4_ref_Throwable = caughtException;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 15: {
                        try {
                            var2_int = ((vi) var8).field_c;
                            if ((var2_int ^ -1) == -2) {
                                statePc = 107;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (22 != var2_int) {
                                statePc = 23;
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
                            if ((field_k ^ -1L) < (id.a(98) ^ -1L)) {
                                statePc = 19;
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
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var8.field_e = (Object) (Object) nc.a((String) ((vi) var8).field_g, (byte) 40, ((vi) var8).field_d).a(-26042);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof vc ? 22 : (stateCaught_20 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3_ref_vc = (vc) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref_vc.getMessage();
                            throw var3_ref_vc;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-3 != (var2_int ^ -1)) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var9 = new Thread((Runnable) ((vi) var8).field_g);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(((vi) var8).field_d);
                            var8.field_e = (Object) (Object) var9;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_int == 4) {
                                statePc = 103;
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
                            if (-9 == var2_int) {
                                statePc = 99;
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
                            if (var2_int == 9) {
                                statePc = 94;
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
                            if (-19 != var2_int) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var10.getContents((Object) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2_int != 19) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) ((vi) var8).field_g;
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (!((le) this).field_b) {
                                statePc = 93;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-4 == (var2_int ^ -1)) {
                                statePc = 89;
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
                            if ((var2_int ^ -1) != -22) {
                                statePc = 38;
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
                            if (id.a(123) >= field_k) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) ((vi) var8).field_g).getAddress();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-6 == (var2_int ^ -1)) {
                                statePc = 86;
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
                            if (var2_int == 6) {
                                statePc = 83;
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
                            if (var2_int != 7) {
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
                            if (((le) this).field_q) {
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
                            Object discarded$6 = Class.forName("ka").getMethod("exit", new Class[0]).invoke(((le) this).field_l, new Object[0]);
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
                            ((le) this).field_i.a((java.awt.Frame) ((vi) var8).field_g, -104);
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
                            if (var2_int != -13) {
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
                            var3_ref = le.a(-120, field_u, (String) ((vi) var8).field_g, field_a);
                            var8.field_e = (Object) (Object) var3_ref;
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
                            if (-14 != var2_int) {
                                statePc = 48;
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
                            var3_ref = le.a(-120, field_u, (String) ((vi) var8).field_g, "");
                            var8.field_e = (Object) (Object) var3_ref;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (!((le) this).field_b) {
                                statePc = 51;
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
                            if (14 == var2_int) {
                                statePc = 80;
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
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (!((le) this).field_b) {
                                statePc = 54;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (-16 == (var2_int ^ -1)) {
                                statePc = 74;
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
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (((le) this).field_q) {
                                statePc = 57;
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
                            if (var2_int != 17) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var12 = (Object[]) (Object[]) ((vi) var8).field_g;
                            Object discarded$7 = Class.forName("ob").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((le) this).field_h, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (var2_int != 16) {
                                statePc = 73;
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
                            if (!field_m.startsWith("win")) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof Exception ? 72 : (stateCaught_58 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof Exception ? 72 : (stateCaught_59 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 72 : (stateCaught_60 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            var13 = (String) ((vi) var8).field_g;
                            if (var13.startsWith("http://")) {
                                statePc = 65;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 72 : (stateCaught_61 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (!var13.startsWith("https://")) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 72 : (stateCaught_62 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 72 : (stateCaught_63 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 72 : (stateCaught_64 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 72 : (stateCaught_65 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var5 >= var13.length()) {
                                statePc = 70;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 72 : (stateCaught_66 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (-1 != var4_ref.indexOf((int) var13.charAt(var5))) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 72 : (stateCaught_67 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 72 : (stateCaught_68 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var5++;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 72 : (stateCaught_69 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_e = null;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 72 : (stateCaught_70 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var3_ref_Exception = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref_Exception;
                            throw (RuntimeException) (Object) var3_ref_Exception;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (-1 == (((vi) var8).field_d ^ -1)) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            stackOut_75_0 = 1;
                            stackIn_77_0 = stackOut_75_0;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            stackOut_76_0 = 0;
                            stackIn_77_0 = stackOut_76_0;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var3 = stackIn_77_0;
                            var14 = (java.awt.Component) ((vi) var8).field_g;
                            if (((le) this).field_q) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            Object discarded$9 = Class.forName("ob").getDeclaredMethod("showcursor", new Class[2]).invoke(((le) this).field_h, new Object[2]);
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
                            ((le) this).field_f.a(var3 != 0, var14, -4);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var3 = ((vi) var8).field_d;
                            var4 = ((vi) var8).field_b;
                            if (!((le) this).field_q) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((le) this).field_f.a(var3, var4, 32512);
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
                            Object discarded$10 = Class.forName("ob").getDeclaredMethod("movemouse", new Class[2]).invoke(((le) this).field_h, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var15 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var15;
                            var15.setResizable(false);
                            if (((le) this).field_q) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            Object discarded$11 = Class.forName("ka").getMethod("enter", new Class[5]).invoke(((le) this).field_l, new Object[5]);
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
                            ((le) this).field_i.a(119, ((vi) var8).field_d & 65535, ((vi) var8).field_d >>> 343492560, ((vi) var8).field_b >> -1968731152, 65535 & ((vi) var8).field_b, var15);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (!((le) this).field_q) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var8.field_e = (Object) (Object) ((le) this).field_i.a(0);
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
                            var8.field_e = Class.forName("ka").getMethod("listmodes", new Class[0]).invoke(((le) this).field_l, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if ((id.a(23) ^ -1L) > (field_k ^ -1L)) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var16 = (255 & ((vi) var8).field_d >> 268944440) + "." + ((((vi) var8).field_d & 16776207) >> -1105248112) + "." + (255 & ((vi) var8).field_d >> 1233793992) + "." + (255 & ((vi) var8).field_d);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var17 = (Object[]) (Object[]) ((vi) var8).field_g;
                            if (!((le) this).field_b) {
                                statePc = 98;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (((Class) var17[0]).getClassLoader() == null) {
                                statePc = 97;
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
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var18 = (Object[]) (Object[]) ((vi) var8).field_g;
                            if (!((le) this).field_b) {
                                statePc = 102;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (null != ((Class) var18[0]).getClassLoader()) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) (Class[]) var18[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if ((id.a(58) ^ -1L) > (field_k ^ -1L)) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) ((vi) var8).field_g).openStream());
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if ((id.a(22) ^ -1L) > (field_k ^ -1L)) {
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
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) ((vi) var8).field_g), ((vi) var8).field_d);
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

    final vi a(String param0, byte param1, int param2) {
        if (param1 >= -19) {
            vi discarded$0 = ((le) this).a((byte) -67);
        }
        return this.a(param0, false, param2, (byte) 127);
    }

    private final vi a(String param0, boolean param1, int param2, byte param3) {
        if (param3 <= 126) {
            ((le) this).field_e = (java.awt.EventQueue) null;
        }
        return this.a(param1 ? 22 : 1, 0, param2, 13003, (Object) (Object) param0);
    }

    le(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        l var6 = null;
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
                    ((le) this).field_t = null;
                    ((le) this).field_b = false;
                    ((le) this).field_d = null;
                    ((le) this).field_x = null;
                    ((le) this).field_q = false;
                    ((le) this).field_n = false;
                    ((le) this).field_c = null;
                    ((le) this).field_p = null;
                    field_v = "Unknown";
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
                    ((le) this).field_b = stackIn_3_1 != 0;
                    field_u = param0;
                    field_w = "1.1";
                    field_a = param1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_v = System.getProperty("java.vendor");
                        field_w = System.getProperty("java.version");
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
                    if ((field_v.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((le) this).field_q = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_r = System.getProperty("os.name");
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 12;
                        continue stateLoop;
                    }
                }
                case 12: {
                    var5 = (Exception) (Object) caughtException;
                    field_r = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_m = field_r.toLowerCase();
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    try {
                        String discarded$4 = System.getProperty("os.arch").toLowerCase();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 16;
                        continue stateLoop;
                    }
                }
                case 16: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 17;
                    continue stateLoop;
                }
                case 17: {
                    try {
                        String discarded$5 = System.getProperty("os.version").toLowerCase();
                        statePc = 20;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 19;
                        continue stateLoop;
                    }
                }
                case 19: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 20;
                    continue stateLoop;
                }
                case 20: {
                    try {
                        field_s = System.getProperty("user.home");
                        if (field_s == null) {
                            statePc = 24;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        field_s = field_s + "/";
                        statePc = 24;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 23;
                        continue stateLoop;
                    }
                }
                case 23: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 24;
                    continue stateLoop;
                }
                case 24: {
                    if (null != field_s) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_s = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((le) this).field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 28;
                        continue stateLoop;
                    }
                }
                case 28: {
                    var5_ref = caughtException;
                    statePc = 29;
                    continue stateLoop;
                }
                case 29: {
                    if (!((le) this).field_q) {
                        statePc = 31;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 31: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 33;
                        continue stateLoop;
                    }
                }
                case 33: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 34;
                    continue stateLoop;
                }
                case 34: {
                    try {
                        field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 36;
                        continue stateLoop;
                    }
                }
                case 36: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 37;
                    continue stateLoop;
                }
                case 37: {
                    dk.a(field_a, field_u, (byte) 86);
                    if (!((le) this).field_b) {
                        statePc = 55;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((le) this).field_x = new wk(dk.a((String) null, field_u, (byte) 123, "random.dat"), "rw", 25L);
                    ((le) this).field_t = new wk(dk.a(false, "main_file_cache.dat2"), "rw", 314572800L);
                    ((le) this).field_d = new wk(dk.a(false, "main_file_cache.idx255"), "rw", 1048576L);
                    ((le) this).field_o = new wk[param2];
                    var5_int = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (param2 <= var5_int) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((le) this).field_o[var5_int] = new wk(dk.a(false, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (!((le) this).field_q) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("oi").newInstance();
                        statePc = 45;
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = 44;
                        continue stateLoop;
                    }
                }
                case 44: {
                    var5_ref = caughtException;
                    statePc = 45;
                    continue stateLoop;
                }
                case 45: {
                    try {
                        if (((le) this).field_q) {
                            statePc = 47;
                        } else {
                            statePc = 46;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((le) this).field_l = Class.forName("ka").newInstance();
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = new l();
                        ((le) this).field_i = var6;
                        statePc = 50;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 49;
                        continue stateLoop;
                    }
                }
                case 49: {
                    var5_ref = caughtException;
                    statePc = 50;
                    continue stateLoop;
                }
                case 50: {
                    try {
                        if (((le) this).field_q) {
                            statePc = 52;
                        } else {
                            statePc = 51;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((le) this).field_h = Class.forName("ob").newInstance();
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((le) this).field_f = new gb();
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 54;
                        continue stateLoop;
                    }
                }
                case 54: {
                    var5_ref = caughtException;
                    statePc = 55;
                    continue stateLoop;
                }
                case 55: {
                    ((le) this).field_n = false;
                    ((le) this).field_j = new Thread((Runnable) this);
                    ((le) this).field_j.setPriority(10);
                    ((le) this).field_j.setDaemon(true);
                    ((le) this).field_j.start();
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
