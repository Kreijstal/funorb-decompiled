/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class he implements Runnable {
    b field_q;
    static String field_j;
    private Object field_f;
    private mf field_h;
    private static String field_t;
    private static int field_e;
    private static String field_k;
    private static String field_i;
    private boolean field_n;
    private Object field_p;
    boolean field_v;
    static String field_d;
    private gk field_l;
    private Thread field_u;
    private static volatile long field_b;
    private mf field_a;
    static String field_o;
    b[] field_s;
    static java.lang.reflect.Method field_x;
    b field_m;
    private ff field_c;
    java.awt.EventQueue field_g;
    b field_r;
    private boolean field_w;

    final void c(int param0) {
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
                            ((he) this).field_w = true;
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
                            ((he) this).field_u.join();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (null != ((he) this).field_r) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((he) this).field_r.a(115);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 13;
                        continue stateLoop;
                    }
                    case 13: {
                        if (((he) this).field_q != null) {
                            statePc = 15;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((he) this).field_q.a(124);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (param0 == -7538) {
                            statePc = 20;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        return;
                    }
                    case 20: {
                        if (((he) this).field_s != null) {
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
                        if (((he) this).field_s.length <= var2_int) {
                            statePc = 29;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        if (((he) this).field_s[var2_int] != null) {
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
                            ((he) this).field_s[var2_int].a(127);
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
                        if (null != ((he) this).field_m) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((he) this).field_m.a(114);
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

    private final mf a(int param0, int param1, int param2, int param3, Object param4) {
        mf var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new mf();
                    var6.field_f = param1;
                    if (param0 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    return null;
                }
                case 2: {
                    var6.field_g = param2;
                    var6.field_a = param3;
                    var6.field_c = param4;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((he) this).field_h == null) {
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
                        ((he) this).field_h.field_b = var6;
                        ((he) this).field_h = var6;
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
                        ((he) this).field_a = var6;
                        ((he) this).field_h = var6;
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

    final mf a(int param0, String param1, byte param2) {
        if (param2 != 60) {
            mf discarded$0 = ((he) this).a(-116);
        }
        return this.a(param1, param0, false, (byte) -2);
    }

    private final static b a(String param0, int param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            b var8_ref = null;
            b stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            b stackOut_12_0 = null;
            L0: {
              if ((param3 ^ -1) == -34) {
                var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (param3 == 34) {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param1;
            L1: while (true) {
              if (var5_array.length > var6) {
                L2: {
                  var7 = var5_array[var6];
                  if (0 >= var7.length()) {
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
                  var8_ref = new b(new File(var7, var4), "rw", 10000L);
                  stackOut_12_0 = (b) var8_ref;
                  stackIn_13_0 = stackOut_12_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_13_0;
                }
                continue L1;
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

    final mf a(int param0, int param1, boolean param2, int param3, int param4) {
        if (!param2) {
            ((he) this).field_w = false;
        }
        return this.a(0, param4 + (param3 << 53898416), param1 + (param0 << -2029748656), 6, (Object) null);
    }

    private final mf a(String param0, int param1, boolean param2, byte param3) {
        if (param3 >= 0) {
            ((he) this).field_r = null;
        }
        return this.a(0, param1, 0, !param2 ? 1 : 22, (Object) (Object) param0);
    }

    final mf a(int param0, Class param1, String param2, Class[] param3) {
        if (param0 < 87) {
            field_j = null;
        }
        return this.a(0, 0, 0, 8, (Object) (Object) new Object[3]);
    }

    final mf a(Runnable param0, byte param1, int param2) {
        if (param1 != -21) {
            Object var5 = null;
            mf discarded$0 = ((he) this).a(-53, (String) null, (byte) -45);
        }
        return this.a(param1 ^ -21, param2, 0, 2, (Object) (Object) param0);
    }

    final mf a(java.net.URL param0, int param1) {
        int var3 = 119 / ((17 - param1) / 54);
        return this.a(0, 0, 0, 4, (Object) (Object) param0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            wb var3_ref = null;
            Exception var3_ref2 = null;
            b var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            mf var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.Frame var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
            int stackIn_62_0 = 0;
            int stackOut_60_0 = 0;
            int stackOut_61_0 = 0;
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
                            if (((he) this).field_w) {
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
                            if (((he) this).field_a == null) {
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
                            var8 = ((he) this).field_a;
                            ((he) this).field_a = ((he) this).field_a.field_b;
                            if (null != ((he) this).field_a) {
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
                            ((he) this).field_h = null;
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
                            var3 = (InterruptedException) (Object) caughtException;
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
                            var2_int = var8.field_a;
                            if (var2_int == 1) {
                                statePc = 104;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (-23 != (var2_int ^ -1)) {
                                statePc = 23;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((ll.a(1000) ^ -1L) > (field_b ^ -1L)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var8.field_e = (Object) (Object) ah.a((String) var8.field_c, var8.field_f, -23891).b(true);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof wb ? 22 : (stateCaught_20 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var3_ref = (wb) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 110 : 111);
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
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var9 = new Thread((Runnable) var8.field_c);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_f);
                            var8.field_e = (Object) (Object) var9;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (4 == var2_int) {
                                statePc = 101;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (8 != var2_int) {
                                statePc = 31;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var10 = (Object[]) var8.field_c;
                            if (!((he) this).field_v) {
                                statePc = 30;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (null != ((Class) var10[0]).getClassLoader()) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (-10 == (var2_int ^ -1)) {
                                statePc = 97;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2_int == 18) {
                                statePc = 96;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((var2_int ^ -1) != -20) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_c;
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (!((he) this).field_v) {
                                statePc = 95;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if ((var2_int ^ -1) != -4) {
                                statePc = 40;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (ll.a(1000) >= field_b) {
                                statePc = 39;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var12 = (255 & var8.field_f >> -429780392) + "." + ((var8.field_f & 16731075) >> -1633662288) + "." + ((var8.field_f & 65324) >> 104177800) + "." + (255 & var8.field_f);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var12).getHostName();
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var2_int != 21) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((field_b ^ -1L) < (ll.a(1000) ^ -1L)) {
                                statePc = 43;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_c).getAddress();
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (5 == var2_int) {
                                statePc = 92;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (-7 == (var2_int ^ -1)) {
                                statePc = 89;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var2_int != 7) {
                                statePc = 51;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (((he) this).field_n) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            Object discarded$6 = Class.forName("ti").getMethod("exit", new Class[0]).invoke(((he) this).field_f, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((he) this).field_c.a((java.awt.Frame) var8.field_c, 8);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var2_int != 12) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var3_ref3 = he.a(field_t, 0, (String) var8.field_c, field_e);
                            var8.field_e = (Object) (Object) var3_ref3;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var2_int == 13) {
                                statePc = 88;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (!((he) this).field_v) {
                                statePc = 57;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (14 == var2_int) {
                                statePc = 85;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (!((he) this).field_v) {
                                statePc = 65;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (-16 != (var2_int ^ -1)) {
                                statePc = 65;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (var8.field_f == 0) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            stackOut_60_0 = 1;
                            stackIn_62_0 = stackOut_60_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            stackOut_61_0 = 0;
                            stackIn_62_0 = stackOut_61_0;
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var3_int = stackIn_62_0;
                            var13 = (java.awt.Component) var8.field_c;
                            if (!((he) this).field_n) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            ((he) this).field_l.a(var3_int != 0, var13, -64);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            Object discarded$7 = Class.forName("ub").getDeclaredMethod("showcursor", new Class[2]).invoke(((he) this).field_p, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (((he) this).field_n) {
                                statePc = 68;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var2_int != 17) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var14 = (Object[]) var8.field_c;
                            Object discarded$8 = Class.forName("ub").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((he) this).field_p, new Object[5]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if ((var2_int ^ -1) == -17) {
                                statePc = 70;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (field_o.startsWith("win")) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 84 : (stateCaught_70 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 84 : (stateCaught_71 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var15 = (String) var8.field_c;
                            if (var15.startsWith("http://")) {
                                statePc = 76;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 84 : (stateCaught_72 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (!var15.startsWith("https://")) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 84 : (stateCaught_73 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 84 : (stateCaught_74 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 84 : (stateCaught_75 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 84 : (stateCaught_76 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var15.length() <= var5) {
                                statePc = 82;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 84 : (stateCaught_77 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (-1 == var4_ref.indexOf((int) var15.charAt(var5))) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 84 : (stateCaught_78 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 84 : (stateCaught_79 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 84 : (stateCaught_80 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var5++;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 84 : (stateCaught_81 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_e = null;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 84 : (stateCaught_82 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var3_int = var8.field_f;
                            var4 = var8.field_g;
                            if (!((he) this).field_n) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((he) this).field_l.a(-2, var4, var3_int);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            Object discarded$10 = Class.forName("ub").getDeclaredMethod("movemouse", new Class[2]).invoke(((he) this).field_p, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var3_ref3 = he.a("", 0, (String) var8.field_c, field_e);
                            var8.field_e = (Object) (Object) var3_ref3;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var16 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var16;
                            var16.setResizable(false);
                            if (!((he) this).field_n) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            ((he) this).field_c.a(var8.field_f >>> -1669174320, var16, 0, var8.field_g >> -361559024, 65535 & var8.field_f, var8.field_g & 65535);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            Object discarded$11 = Class.forName("ti").getMethod("enter", new Class[5]).invoke(((he) this).field_f, new Object[5]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (((he) this).field_n) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var8.field_e = Class.forName("ti").getMethod("listmodes", new Class[0]).invoke(((he) this).field_f, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var8.field_e = (Object) (Object) ((he) this).field_c.a(0);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var17.getContents((Object) null);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var18 = (Object[]) var8.field_c;
                            if (!((he) this).field_v) {
                                statePc = 100;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (null != ((Class) var18[0]).getClassLoader()) {
                                statePc = 100;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var18[0]).getDeclaredField((String) var18[1]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if ((ll.a(1000) ^ -1L) <= (field_b ^ -1L)) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_c).openStream());
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if ((field_b ^ -1L) < (ll.a(1000) ^ -1L)) {
                                statePc = 106;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_c), var8.field_f);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var8.field_d = 1;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 111: {
                        var2_ref2 = caughtException;
                        var8.field_d = 2;
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 113;
                        continue stateLoop;
                    }
                    case 113: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 116: {
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

    final mf a(Class param0, int param1, String param2) {
        if (param1 != -3645) {
            Object var5 = null;
            mf discarded$0 = this.a(-35, 55, -69, 103, (Object) null);
        }
        return this.a(0, 0, 0, 9, (Object) (Object) new Object[2]);
    }

    final boolean b(int param0) {
        if (!(((he) this).field_v)) {
            return false;
        }
        if (param0 != 2) {
            ((he) this).field_w = true;
        }
        if (!((he) this).field_n) {
            return ((he) this).field_f != null ? true : false;
        }
        return ((he) this).field_c != null ? true : false;
    }

    final mf a(java.awt.Frame param0, int param1) {
        if (param1 >= -120) {
            Object var4 = null;
            mf discarded$0 = ((he) this).a((Class) null, -83, (String) null);
        }
        return this.a(0, 0, 0, 7, (Object) (Object) param0);
    }

    final mf a(int param0) {
        if (param0 >= -77) {
            return null;
        }
        return this.a(0, 0, 0, 5, (Object) null);
    }

    he(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ff var7 = null;
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
                    ((he) this).field_v = false;
                    ((he) this).field_n = false;
                    ((he) this).field_m = null;
                    ((he) this).field_h = null;
                    ((he) this).field_a = null;
                    ((he) this).field_q = null;
                    ((he) this).field_r = null;
                    ((he) this).field_w = false;
                    field_e = param0;
                    field_d = "1.1";
                    field_j = "Unknown";
                    field_t = param1;
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
                    ((he) this).field_v = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_j = System.getProperty("java.vendor");
                        field_d = System.getProperty("java.version");
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
                    if (0 == (field_j.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((he) this).field_n = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_k = System.getProperty("os.name");
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
                    field_k = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_o = field_k.toLowerCase();
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
                        field_i = System.getProperty("user.home");
                        if (null == field_i) {
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
                        field_i = field_i + "/";
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
                    if (field_i == null) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_i = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((he) this).field_g = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((he) this).field_n) {
                        statePc = 36;
                    } else {
                        statePc = 30;
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
                        field_x = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    la.a((byte) 119, field_e, field_t);
                    if (!((he) this).field_v) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((he) this).field_m = new b(la.a("random.dat", (String) null, false, field_e), "rw", 25L);
                    ((he) this).field_r = new b(la.a("main_file_cache.dat2", -3), "rw", 314572800L);
                    ((he) this).field_q = new b(la.a("main_file_cache.idx255", -20), "rw", 1048576L);
                    ((he) this).field_s = new b[param2];
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
                    ((he) this).field_s[var5_int] = new b(la.a("main_file_cache.idx" + var5_int, -31), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((he) this).field_n) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("lc").newInstance();
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
                        if (((he) this).field_n) {
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
                        ((he) this).field_f = Class.forName("ti").newInstance();
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
                        var7 = new ff();
                        ((he) this).field_c = var7;
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
                        if (!((he) this).field_n) {
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
                        ((he) this).field_l = new gk();
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
                        ((he) this).field_p = Class.forName("ub").newInstance();
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
                    ((he) this).field_w = false;
                    ((he) this).field_u = new Thread((Runnable) this);
                    ((he) this).field_u.setPriority(10);
                    ((he) this).field_u.setDaemon(true);
                    ((he) this).field_u.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = 0L;
    }
}
