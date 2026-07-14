/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class md implements Runnable {
    private static volatile long field_s;
    private static int field_a;
    pl field_t;
    pl field_x;
    private eh field_g;
    boolean field_q;
    private static String field_w;
    private boolean field_o;
    private static String field_d;
    pl[] field_e;
    private static String field_j;
    private ic field_u;
    static String field_f;
    static String field_l;
    static String field_m;
    private Thread field_p;
    private pk field_k;
    static java.lang.reflect.Method field_h;
    private ic field_r;
    private boolean field_c;
    private Object field_v;
    pl field_i;
    java.awt.EventQueue field_b;
    private Object field_n;

    final ic b(byte param0) {
        if (param0 > -10) {
            ((md) this).field_v = null;
        }
        return this.a(0, 0, 5, (Object) null, (byte) 116);
    }

    final boolean a(int param0) {
        if (param0 != 2) {
            Object var3 = null;
            ic discarded$0 = this.a(76, -63, -117, (Object) null, (byte) 11);
        }
        if (!(((md) this).field_q)) {
            return false;
        }
        if (!((md) this).field_o) {
            return null != ((md) this).field_v ? true : false;
        }
        return null != ((md) this).field_k ? true : false;
    }

    final void a(byte param0) {
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
                            ((md) this).field_c = true;
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
                            if (param0 == -84) {
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
                        try {
                            ((md) this).run();
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 9;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((md) this).field_p.join();
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
                        if (((md) this).field_t == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((md) this).field_t.a(19808);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (((md) this).field_i != null) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((md) this).field_i.a(param0 + 19892);
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
                        if (null == ((md) this).field_e) {
                            statePc = 27;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var2_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (((md) this).field_e.length <= var2_int) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (((md) this).field_e[var2_int] != null) {
                            statePc = 24;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 24: {
                        try {
                            ((md) this).field_e[var2_int].a(19808);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 26: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 27: {
                        if (((md) this).field_x == null) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        try {
                            ((md) this).field_x.a(19808);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var2_ref2 = (IOException) (Object) caughtException;
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

    private final ic a(int param0, int param1, int param2, Object param3, byte param4) {
        ic var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new ic();
                    var6.field_c = param0;
                    var6.field_e = param3;
                    if (param4 == 116) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ic discarded$3 = ((md) this).b((byte) 104);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_d = param1;
                    var6.field_a = param2;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((md) this).field_u != null) {
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
                        ((md) this).field_r = var6;
                        ((md) this).field_u = var6;
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
                        ((md) this).field_u.field_f = var6;
                        ((md) this).field_u = var6;
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

    private final static pl a(int param0, String param1, String param2, byte param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            pl var8_ref = null;
            pl stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            pl stackOut_14_0 = null;
            var7_ref = null;
            L0: {
              if (param0 == -34) {
                var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (-35 == param0) {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              if (param3 == 84) {
                break L1;
              } else {
                field_l = null;
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var5_array.length > var6) {
                L3: {
                  var7_ref = var5_array[var6];
                  if (-1 <= (var7_ref.length() ^ -1)) {
                    break L3;
                  } else {
                    if (new File(var7_ref).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  var8_ref = new pl(new File(var7_ref, var4), "rw", 10000L);
                  stackOut_14_0 = (pl) var8_ref;
                  stackIn_15_0 = stackOut_14_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_15_0;
                }
                continue L2;
              } else {
                return null;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final ic a(int param0, Class[] param1, Class param2, String param3) {
        int var5 = -103 / ((param0 - 62) / 32);
        return this.a(0, 0, 8, (Object) (Object) new Object[3], (byte) 116);
    }

    private final ic a(byte param0, String param1, boolean param2, int param3) {
        if (param0 != 118) {
            return null;
        }
        return this.a(param3, 0, param2 ? 22 : 1, (Object) (Object) param1, (byte) 116);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            pg var3_ref_pg = null;
            Exception var3_ref_Exception = null;
            pl var3_ref = null;
            int var3 = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            ic var8 = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            String var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            String var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_83_0 = 0;
            int stackOut_81_0 = 0;
            int stackOut_82_0 = 0;
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
                            if (((md) this).field_c) {
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
                            if (null == ((md) this).field_r) {
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
                            var8 = ((md) this).field_r;
                            ((md) this).field_r = ((md) this).field_r.field_f;
                            if (null != ((md) this).field_r) {
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
                            ((md) this).field_u = null;
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
                            var4 = caughtException;
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
                        throw (RuntimeException) (Object) var4;
                    }
                    case 15: {
                        try {
                            var2_int = var8.field_a;
                            if ((var2_int ^ -1) == -2) {
                                statePc = 107;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((var2_int ^ -1) != -23) {
                                statePc = 22;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((pf.a(0) ^ -1L) <= (field_s ^ -1L)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8.field_b = (Object) (Object) bf.a((String) var8.field_e, (byte) -84, var8.field_c).a(0);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof pg ? 21 : (stateCaught_19 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var3_ref_pg = (pg) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref_pg.getMessage();
                            throw var3_ref_pg;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (2 == var2_int) {
                                statePc = 106;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_int == 4) {
                                statePc = 103;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-9 == (var2_int ^ -1)) {
                                statePc = 97;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2_int != 9) {
                                statePc = 32;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var9 = (Object[]) var8.field_e;
                            if (((md) this).field_q) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (null == ((Class) var9[0]).getClassLoader()) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredField((String) var9[1]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2_int != 18) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_b = (Object) (Object) var10.getContents((Object) null);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-20 != (var2_int ^ -1)) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_e;
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (!((md) this).field_q) {
                                statePc = 96;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (3 == var2_int) {
                                statePc = 92;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var2_int == 21) {
                                statePc = 89;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (-6 == var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-7 != var2_int) {
                                statePc = 44;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var12 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_b = (Object) (Object) var12;
                            var12.setResizable(false);
                            if (!((md) this).field_o) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((md) this).field_k.a(var8.field_d & 65535, 65535 & var8.field_c, var8.field_d >> 1757663600, var8.field_c >>> -292531472, -16, var12);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            Object discarded$6 = Class.forName("se").getMethod("enter", new Class[5]).invoke(((md) this).field_v, new Object[5]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (7 != var2_int) {
                                statePc = 48;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (!((md) this).field_o) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            ((md) this).field_k.a(106, (java.awt.Frame) var8.field_e);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            Object discarded$7 = Class.forName("se").getMethod("exit", new Class[0]).invoke(((md) this).field_v, new Object[0]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (var2_int != -13) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3_ref = md.a(field_a, field_j, (String) var8.field_e, (byte) 84);
                            var8.field_b = (Object) (Object) var3_ref;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (-14 != var2_int) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var3_ref = md.a(field_a, "", (String) var8.field_e, (byte) 84);
                            var8.field_b = (Object) (Object) var3_ref;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((md) this).field_q) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var2_int != 14) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var3 = var8.field_c;
                            var4_int = var8.field_d;
                            if (((md) this).field_o) {
                                statePc = 56;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            Object discarded$8 = Class.forName("bm").getDeclaredMethod("movemouse", new Class[2]).invoke(((md) this).field_n, new Object[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((md) this).field_g.a((byte) 121, var3, var4_int);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (!((md) this).field_q) {
                                statePc = 60;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (-16 == (var2_int ^ -1)) {
                                statePc = 80;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((md) this).field_o) {
                                statePc = 63;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (17 == var2_int) {
                                statePc = 79;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (16 != var2_int) {
                                statePc = 78;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (field_f.startsWith("win")) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 77 : (stateCaught_65 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 77 : (stateCaught_66 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var13 = (String) var8.field_e;
                            if (var13.startsWith("http://")) {
                                statePc = 70;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 77 : (stateCaught_67 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var13.startsWith("https://")) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 77 : (stateCaught_68 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 77 : (stateCaught_69 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 77 : (stateCaught_70 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var5 >= var13.length()) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 77 : (stateCaught_71 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (0 != (var4_ref.indexOf((int) var13.charAt(var5)) ^ -1)) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 77 : (stateCaught_72 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 77 : (stateCaught_73 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var5++;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 77 : (stateCaught_74 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_b = null;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 77 : (stateCaught_75 instanceof ThreadDeath ? 112 : 113));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var3_ref_Exception = (Exception) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref_Exception;
                            throw (RuntimeException) (Object) var3_ref_Exception;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var14 = (Object[]) var8.field_e;
                            Object discarded$10 = Class.forName("bm").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((md) this).field_n, new Object[5]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var8.field_c == 0) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            stackOut_81_0 = 1;
                            stackIn_83_0 = stackOut_81_0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackOut_82_0 = 0;
                            stackIn_83_0 = stackOut_82_0;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3 = stackIn_83_0;
                            var15 = (java.awt.Component) var8.field_e;
                            if (!((md) this).field_o) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((md) this).field_g.a(var3 != 0, (byte) 90, var15);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Object discarded$11 = Class.forName("bm").getDeclaredMethod("showcursor", new Class[2]).invoke(((md) this).field_n, new Object[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (((md) this).field_o) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var8.field_b = Class.forName("se").getMethod("listmodes", new Class[0]).invoke(((md) this).field_v, new Object[0]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var8.field_b = (Object) (Object) ((md) this).field_k.a((byte) 88);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if ((pf.a(0) ^ -1L) <= (field_s ^ -1L)) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_e).getAddress();
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (pf.a(0) < field_s) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var16 = (255 & var8.field_c >> -1496461928) + "." + (255 & var8.field_c >> 728374000) + "." + ((var8.field_c & 65491) >> -357642552) + "." + (255 & var8.field_c);
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var17 = (Object[]) var8.field_e;
                            if (((md) this).field_q) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (((Class) var17[0]).getClassLoader() == null) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if ((field_s ^ -1L) >= (pf.a(0) ^ -1L)) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var8.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_e).openStream());
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var18 = new Thread((Runnable) var8.field_e);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_c);
                            var8.field_b = (Object) (Object) var18;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (pf.a(0) >= field_s) {
                                statePc = 109;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var8.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_e), var8.field_c);
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var8.field_g = 1;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 112 : 113);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 113: {
                        var2_ref2 = caughtException;
                        var8.field_g = 2;
                        statePc = 114;
                        continue stateLoop;
                    }
                    case 114: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 118: {
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

    final ic a(boolean param0, Class param1, String param2) {
        if (param0) {
            ic discarded$0 = ((md) this).b((byte) -62);
        }
        return this.a(0, 0, 9, (Object) (Object) new Object[2], (byte) 116);
    }

    final ic a(String param0, int param1, int param2) {
        if (param1 != 0) {
            ((md) this).a((byte) 110);
        }
        return this.a((byte) 118, param0, false, param2);
    }

    final ic a(java.awt.Frame param0, int param1) {
        int var3 = 18 % ((-50 - param1) / 57);
        return this.a(0, 0, 7, (Object) (Object) param0, (byte) 116);
    }

    final ic a(byte param0, java.net.URL param1) {
        if (param0 <= 96) {
            ((md) this).field_b = null;
        }
        return this.a(0, 0, 4, (Object) (Object) param1, (byte) 116);
    }

    final ic a(Runnable param0, int param1, int param2) {
        if (param2 != 0) {
            ((md) this).field_v = null;
        }
        return this.a(param1, 0, 2, (Object) (Object) param0, (byte) 116);
    }

    final ic a(int param0, int param1, boolean param2, int param3, int param4) {
        if (param2) {
            Object var7 = null;
            ic discarded$0 = ((md) this).a(111, (Class[]) null, (Class) null, (String) null);
        }
        return this.a(param1 + (param0 << -1854977072), param3 + (param4 << 663126928), 6, (Object) null, (byte) 116);
    }

    md(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        pk var7 = null;
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
                    ((md) this).field_x = null;
                    ((md) this).field_u = null;
                    ((md) this).field_q = false;
                    ((md) this).field_t = null;
                    ((md) this).field_r = null;
                    ((md) this).field_o = false;
                    ((md) this).field_c = false;
                    ((md) this).field_i = null;
                    field_a = param0;
                    field_m = "1.1";
                    field_j = param1;
                    field_l = "Unknown";
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
                    ((md) this).field_q = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_l = System.getProperty("java.vendor");
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
                    if (0 != (field_l.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((md) this).field_o = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_w = System.getProperty("os.name");
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
                    field_w = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_f = field_w.toLowerCase();
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
                        field_d = System.getProperty("user.home");
                        if (field_d == null) {
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
                        field_d = field_d + "/";
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
                    if (field_d == null) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    field_d = "~/";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((md) this).field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 29: {
                    var5_ref = caughtException;
                    statePc = 30;
                    continue stateLoop;
                }
                case 30: {
                    if (!((md) this).field_o) {
                        statePc = 32;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 32: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
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
                    try {
                        field_h = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 38;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 37;
                        continue stateLoop;
                    }
                }
                case 37: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    nk.a(field_a, 0, field_j);
                    if (!((md) this).field_q) {
                        statePc = 57;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((md) this).field_x = new pl(nk.a(-1, "random.dat", (String) null, field_a), "rw", 25L);
                    ((md) this).field_t = new pl(nk.a("main_file_cache.dat2", -2), "rw", 314572800L);
                    ((md) this).field_i = new pl(nk.a("main_file_cache.idx255", -2), "rw", 1048576L);
                    ((md) this).field_e = new pl[param2];
                    var5_int = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (var5_int >= param2) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((md) this).field_e[var5_int] = new pl(nk.a("main_file_cache.idx" + var5_int, -2), "rw", 1048576L);
                    var5_int++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 42: {
                    if (((md) this).field_o) {
                        statePc = 44;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 44: {
                    try {
                        Object discarded$7 = Class.forName("oc").newInstance();
                        statePc = 47;
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 46;
                        continue stateLoop;
                    }
                }
                case 46: {
                    var5_ref = caughtException;
                    statePc = 47;
                    continue stateLoop;
                }
                case 47: {
                    try {
                        if (((md) this).field_o) {
                            statePc = 49;
                        } else {
                            statePc = 48;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((md) this).field_v = Class.forName("se").newInstance();
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        var7 = new pk();
                        ((md) this).field_k = var7;
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 51;
                        continue stateLoop;
                    }
                }
                case 51: {
                    var5_ref = caughtException;
                    statePc = 52;
                    continue stateLoop;
                }
                case 52: {
                    try {
                        if (((md) this).field_o) {
                            statePc = 54;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((md) this).field_n = Class.forName("bm").newInstance();
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        ((md) this).field_g = new eh();
                        statePc = 57;
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 56;
                        continue stateLoop;
                    }
                }
                case 56: {
                    var5_ref = caughtException;
                    statePc = 57;
                    continue stateLoop;
                }
                case 57: {
                    ((md) this).field_c = false;
                    ((md) this).field_p = new Thread((Runnable) this);
                    ((md) this).field_p.setPriority(10);
                    ((md) this).field_p.setDaemon(true);
                    ((md) this).field_p.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 0L;
    }
}
