/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class cb implements Runnable {
    lj field_m;
    static String field_p;
    private boolean field_v;
    boolean field_x;
    private cp field_d;
    private static volatile long field_c;
    private static String field_r;
    static String field_l;
    lj field_k;
    private ei field_q;
    private static String field_i;
    private Object field_g;
    private ei field_h;
    private Object field_n;
    private boolean field_f;
    static java.lang.reflect.Method field_j;
    java.awt.EventQueue field_w;
    private Thread field_b;
    static String field_o;
    private static String field_a;
    private static int field_t;
    lj[] field_u;
    private vb field_s;
    lj field_e;

    private final ei a(int param0, int param1, int param2, Object param3, int param4) {
        ei var6 = null;
        Object var7 = null;
        int var8 = 0;
        Throwable var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new ei();
                    var6.field_g = param3;
                    var6.field_a = param4;
                    var6.field_d = param1;
                    var6.field_c = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != ((cb) this).field_q) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        ((cb) this).field_h = var6;
                        ((cb) this).field_q = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((cb) this).field_q.field_f = var6;
                        ((cb) this).field_q = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var8 = 10 % ((param2 - -52) / 43);
                        this.notify();
                        // monitorexit var7
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var9 = caughtException;
                        // monitorexit var7
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 7: {
                    throw (RuntimeException) (Object) var9;
                }
                case 8: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final ei a(int param0, Class[] param1, String param2, Class param3) {
        if (param0 != 0) {
            return null;
        }
        return this.a(0, 8, 19, (Object) (Object) new Object[3], 0);
    }

    private final static lj a(int param0, String param1, String param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            lj var8_ref = null;
            Object var9 = null;
            lj stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            lj stackOut_13_0 = null;
            var7_ref = null;
            L0: {
              if (param3 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
                break L0;
              } else {
                if ((param3 ^ -1) == -35) {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              if (param0 < -98) {
                break L1;
              } else {
                var9 = null;
                lj discarded$1 = cb.a(120, (String) null, (String) null, 79);
                break L1;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_a, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7_ref = var5_array[var6];
                  if (var7_ref.length() <= 0) {
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
                  var8_ref = new lj(new File(var7_ref, var4), "rw", 10000L);
                  stackOut_13_0 = (lj) var8_ref;
                  stackIn_14_0 = stackOut_13_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_14_0;
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
                            ((cb) this).field_f = true;
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
                            if (param0 == -1204) {
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
                            field_j = null;
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
                            ((cb) this).field_b.join();
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
                        if (((cb) this).field_k != null) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((cb) this).field_k.b(-5317);
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
                        if (((cb) this).field_m == null) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((cb) this).field_m.b(param0 ^ 4215);
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
                        if (((cb) this).field_u != null) {
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
                        if (((cb) this).field_u.length <= var2_int) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (((cb) this).field_u[var2_int] != null) {
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
                            ((cb) this).field_u[var2_int].b(-5317);
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
                        if (((cb) this).field_e != null) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        try {
                            ((cb) this).field_e.b(-5317);
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 32;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
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
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3_ref_InterruptedException = null;
            uf var3_ref_uf = null;
            Exception var3_ref_Exception = null;
            lj var3_ref = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            ei var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.Frame var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            java.awt.datatransfer.Clipboard var18 = null;
            int stackIn_75_0 = 0;
            int stackOut_73_0 = 0;
            int stackOut_74_0 = 0;
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
                            if (((cb) this).field_f) {
                                statePc = 3;
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
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
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
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            if (((cb) this).field_h != null) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var8 = ((cb) this).field_h;
                            ((cb) this).field_h = ((cb) this).field_h.field_f;
                            if (((cb) this).field_h != null) {
                                statePc = 12;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((cb) this).field_q = null;
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
                            var3_ref_InterruptedException = (InterruptedException) (Object) caughtException;
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
                            var4_ref_Throwable = caughtException;
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
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 16: {
                        try {
                            var2_int = var8.field_d;
                            if (1 != var2_int) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (field_c <= hm.a(64)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_g), var8.field_a);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (22 != var2_int) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((hm.a(64) ^ -1L) <= (field_c ^ -1L)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var8.field_e = (Object) (Object) qe.a((String) var8.field_g, var8.field_a, (byte) 126).a(116);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof uf ? 25 : (stateCaught_23 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_ref_uf = (uf) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref_uf.getMessage();
                            throw var3_ref_uf;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (2 != var2_int) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var9 = new Thread((Runnable) var8.field_g);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_a);
                            var8.field_e = (Object) (Object) var9;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2_int != 4) {
                                statePc = 32;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((hm.a(64) ^ -1L) <= (field_c ^ -1L)) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_g).openStream());
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (8 != var2_int) {
                                statePc = 38;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var10 = (Object[]) var8.field_g;
                            if (((cb) this).field_x) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (((Class) var10[0]).getClassLoader() != null) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if ((var2_int ^ -1) != -10) {
                                statePc = 43;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var11 = (Object[]) var8.field_g;
                            if (!((cb) this).field_x) {
                                statePc = 42;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (null != ((Class) var11[0]).getClassLoader()) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var11[0]).getDeclaredField((String) var11[1]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (-19 == (var2_int ^ -1)) {
                                statePc = 106;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (19 == var2_int) {
                                statePc = 105;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (((cb) this).field_x) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var2_int != 3) {
                                statePc = 52;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (field_c > hm.a(64)) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var12 = (var8.field_a >> 447997272 & 255) + "." + (255 & var8.field_a >> 1450062288) + "." + (255 & var8.field_a >> -582846200) + "." + (var8.field_a & 255);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (21 != var2_int) {
                                statePc = 57;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (field_c > hm.a(64)) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_g).getAddress();
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (-6 != (var2_int ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (!((cb) this).field_v) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            var8.field_e = (Object) (Object) ((cb) this).field_s.a(5003);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var8.field_e = Class.forName("gl").getMethod("listmodes", new Class[0]).invoke(((cb) this).field_g, new Object[0]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (-7 == (var2_int ^ -1)) {
                                statePc = 102;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (7 == var2_int) {
                                statePc = 99;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if ((var2_int ^ -1) != -13) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var3_ref = cb.a(-121, (String) var8.field_g, field_r, field_t);
                            var8.field_e = (Object) (Object) var3_ref;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (13 != var2_int) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var3_ref = cb.a(-117, (String) var8.field_g, "", field_t);
                            var8.field_e = (Object) (Object) var3_ref;
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (!((cb) this).field_x) {
                                statePc = 70;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var2_int == -15) {
                                statePc = 96;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (!((cb) this).field_x) {
                                statePc = 78;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (-16 != var2_int) {
                                statePc = 78;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (var8.field_a == 0) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            stackOut_73_0 = 1;
                            stackIn_75_0 = stackOut_73_0;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            stackOut_74_0 = 0;
                            stackIn_75_0 = stackOut_74_0;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var3 = stackIn_75_0;
                            var13 = (java.awt.Component) var8.field_g;
                            if (((cb) this).field_v) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            Object discarded$6 = Class.forName("cj").getDeclaredMethod("showcursor", new Class[2]).invoke(((cb) this).field_n, new Object[2]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            ((cb) this).field_d.a(var13, var3 != 0, false);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (((cb) this).field_v) {
                                statePc = 81;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if ((var2_int ^ -1) != -18) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var14 = (Object[]) var8.field_g;
                            Object discarded$7 = Class.forName("cj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((cb) this).field_n, new Object[5]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if ((var2_int ^ -1) != -17) {
                                statePc = 95;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (field_p.startsWith("win")) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 94 : (stateCaught_82 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 94 : (stateCaught_83 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var15 = (String) var8.field_g;
                            if (var15.startsWith("http://")) {
                                statePc = 87;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 94 : (stateCaught_84 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var15.startsWith("https://")) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 94 : (stateCaught_85 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 94 : (stateCaught_86 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof Exception ? 94 : (stateCaught_87 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (var15.length() <= var5) {
                                statePc = 92;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 94 : (stateCaught_88 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (var4_ref.indexOf((int) var15.charAt(var5)) != -1) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof Exception ? 94 : (stateCaught_89 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof Exception ? 94 : (stateCaught_90 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var5++;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof Exception ? 94 : (stateCaught_91 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_e = null;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof Exception ? 94 : (stateCaught_92 instanceof ThreadDeath ? 109 : 110));
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var3_ref_Exception = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref_Exception;
                            throw (RuntimeException) (Object) var3_ref_Exception;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var3 = var8.field_a;
                            var4 = var8.field_c;
                            if (!((cb) this).field_v) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            ((cb) this).field_d.a(var3, var4, (byte) 112);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            Object discarded$9 = Class.forName("cj").getDeclaredMethod("movemouse", new Class[2]).invoke(((cb) this).field_n, new Object[2]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (((cb) this).field_v) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            Object discarded$10 = Class.forName("gl").getMethod("exit", new Class[0]).invoke(((cb) this).field_g, new Object[0]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            ((cb) this).field_s.a(8, (java.awt.Frame) var8.field_g);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var16 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var16;
                            var16.setResizable(false);
                            if (!((cb) this).field_v) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            ((cb) this).field_s.a(65535 & var8.field_a, (byte) 122, 65535 & var8.field_c, var8.field_c >> 1436388368, var8.field_a >>> 666638064, var16);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            Object discarded$11 = Class.forName("gl").getMethod("enter", new Class[5]).invoke(((cb) this).field_g, new Object[5]);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_g;
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var17.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var18.getContents((Object) null);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var8.field_b = 1;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 109 : 110);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 110: {
                        var2_ref2 = caughtException;
                        var8.field_b = 2;
                        statePc = 111;
                        continue stateLoop;
                    }
                    case 111: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 115: {
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

    final ei a(int param0, String param1, int param2) {
        if (param0 != 20278) {
            ((cb) this).field_n = null;
        }
        return this.a(false, param2, false, param1);
    }

    final ei a(java.awt.Frame param0, int param1) {
        if (param1 >= -71) {
            Object var4 = null;
            lj discarded$0 = cb.a(112, (String) null, (String) null, 9);
        }
        return this.a(0, 7, -102, (Object) (Object) param0, 0);
    }

    final ei a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 27705) {
            Object var7 = null;
            lj discarded$0 = cb.a(-61, (String) null, (String) null, -124);
        }
        return this.a(param4 + (param0 << 155206064), 6, param3 + -27832, (Object) null, param1 + (param2 << -1754554384));
    }

    final boolean a(byte param0) {
        int var2 = -64 % ((28 - param0) / 46);
        if (!(((cb) this).field_x)) {
            return false;
        }
        if (!((cb) this).field_v) {
            return null != ((cb) this).field_g ? true : false;
        }
        return ((cb) this).field_s != null ? true : false;
    }

    final ei a(String param0, Class param1, byte param2) {
        int var4 = -55 / ((param2 - -22) / 54);
        return this.a(0, 9, 123, (Object) (Object) new Object[2], 0);
    }

    private final ei a(boolean param0, int param1, boolean param2, String param3) {
        if (param2) {
            field_i = null;
        }
        return this.a(0, param0 ? 22 : 1, 34, (Object) (Object) param3, param1);
    }

    final ei a(int param0, Runnable param1, byte param2) {
        if (param2 != -123) {
            return null;
        }
        return this.a(0, 2, param2 + 249, (Object) (Object) param1, param0);
    }

    final ei a(boolean param0) {
        if (!param0) {
            return null;
        }
        return this.a(0, 5, -110, (Object) null, 0);
    }

    final ei a(byte param0, java.net.URL param1) {
        if (param0 != -44) {
            ((cb) this).field_n = null;
        }
        return this.a(0, 4, 32, (Object) (Object) param1, 0);
    }

    cb(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        vb var6 = null;
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
                    ((cb) this).field_v = false;
                    ((cb) this).field_h = null;
                    ((cb) this).field_k = null;
                    ((cb) this).field_q = null;
                    ((cb) this).field_f = false;
                    ((cb) this).field_x = false;
                    ((cb) this).field_m = null;
                    ((cb) this).field_e = null;
                    field_o = "Unknown";
                    field_l = "1.1";
                    field_r = param1;
                    field_t = param0;
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
                    ((cb) this).field_x = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_o = System.getProperty("java.vendor");
                        field_l = System.getProperty("java.version");
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
                    if ((field_o.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((cb) this).field_v = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_i = System.getProperty("os.name");
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
                    field_i = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_p = field_i.toLowerCase();
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
                        field_a = System.getProperty("user.home");
                        if (field_a == null) {
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
                        field_a = field_a + "/";
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
                    if (null != field_a) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_a = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((cb) this).field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((cb) this).field_v) {
                        statePc = 30;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 30: {
                    try {
                        java.lang.reflect.Method discarded$6 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 33;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 32;
                        continue stateLoop;
                    }
                }
                case 32: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 33;
                    continue stateLoop;
                }
                case 33: {
                    try {
                        field_j = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 36;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 35;
                        continue stateLoop;
                    }
                }
                case 35: {
                    var5 = (Exception) (Object) caughtException;
                    statePc = 36;
                    continue stateLoop;
                }
                case 36: {
                    va.a(field_r, 71, field_t);
                    if (!((cb) this).field_x) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((cb) this).field_e = new lj(va.a((String) null, field_t, true, "random.dat"), "rw", 25L);
                    ((cb) this).field_k = new lj(va.a("main_file_cache.dat2", (byte) -61), "rw", 314572800L);
                    ((cb) this).field_m = new lj(va.a("main_file_cache.idx255", (byte) -61), "rw", 1048576L);
                    ((cb) this).field_u = new lj[param2];
                    var5_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (var5_int >= param2) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((cb) this).field_u[var5_int] = new lj(va.a("main_file_cache.idx" + var5_int, (byte) -61), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((cb) this).field_v) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("mf").newInstance();
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 43;
                        continue stateLoop;
                    }
                }
                case 43: {
                    var5_ref = caughtException;
                    statePc = 44;
                    continue stateLoop;
                }
                case 44: {
                    try {
                        if (!((cb) this).field_v) {
                            statePc = 46;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        var6 = new vb();
                        ((cb) this).field_s = var6;
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        ((cb) this).field_g = Class.forName("gl").newInstance();
                        statePc = 49;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 48;
                        continue stateLoop;
                    }
                }
                case 48: {
                    var5_ref = caughtException;
                    statePc = 49;
                    continue stateLoop;
                }
                case 49: {
                    try {
                        if (!((cb) this).field_v) {
                            statePc = 51;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        ((cb) this).field_d = new cp();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((cb) this).field_n = Class.forName("cj").newInstance();
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 53: {
                    var5_ref = caughtException;
                    statePc = 54;
                    continue stateLoop;
                }
                case 54: {
                    ((cb) this).field_f = false;
                    ((cb) this).field_b = new Thread((Runnable) this);
                    ((cb) this).field_b.setPriority(10);
                    ((cb) this).field_b.setDaemon(true);
                    ((cb) this).field_b.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = 0L;
    }
}
