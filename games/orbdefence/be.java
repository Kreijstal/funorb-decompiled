/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class be implements Runnable {
    gl field_u;
    private static String field_a;
    static String field_j;
    private kl field_o;
    private eb field_r;
    gl field_g;
    gl field_v;
    private Object field_i;
    private boolean field_b;
    private static String field_e;
    private Thread field_k;
    static java.lang.reflect.Method field_x;
    private rb field_l;
    private static volatile long field_w;
    static String field_s;
    private Object field_h;
    java.awt.EventQueue field_t;
    private static int field_f;
    private eb field_d;
    static String field_c;
    private boolean field_m;
    gl[] field_p;
    private static String field_n;
    boolean field_q;

    private final eb a(int param0, int param1, Object param2, int param3, int param4) {
        eb var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param0 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    eb discarded$3 = ((be) this).a((java.net.URL) null, (byte) 74);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new eb();
                    var6.field_e = param2;
                    var6.field_f = param3;
                    var6.field_b = param1;
                    var6.field_c = param4;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((be) this).field_d == null) {
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
                        ((be) this).field_d.field_d = var6;
                        ((be) this).field_d = var6;
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
                        ((be) this).field_r = var6;
                        ((be) this).field_d = var6;
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

    final eb a(int param0, int param1, String param2) {
        if (param1 != 0) {
            ((be) this).field_d = null;
        }
        return this.a(false, param2, 1, param0);
    }

    final eb a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 28252) {
            return null;
        }
        return this.a(param3 ^ 28252, (param1 << 863553136) - -param4, (Object) null, 6, (param0 << -397836560) - -param2);
    }

    final eb a(java.net.URL param0, byte param1) {
        if (param1 != -49) {
            return null;
        }
        return this.a(param1 + 49, 0, (Object) (Object) param0, 4, 0);
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
                            ((be) this).field_b = true;
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
                            ((be) this).field_k.join();
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
                        if (null != ((be) this).field_u) {
                            statePc = 10;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 10: {
                        try {
                            ((be) this).field_u.d(109);
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
                        if (null == ((be) this).field_g) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((be) this).field_g.d(56);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (param0 == 20647) {
                            statePc = 19;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        ((be) this).field_t = null;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (((be) this).field_p == null) {
                            statePc = 28;
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
                        if (var2_int >= ((be) this).field_p.length) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (((be) this).field_p[var2_int] != null) {
                            statePc = 25;
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
                    case 25: {
                        try {
                            ((be) this).field_p[var2_int].d(21);
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
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 27: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 28: {
                        if (((be) this).field_v == null) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((be) this).field_v.d(param0 + -20603);
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

    final eb a(Class[] param0, int param1, String param2, Class param3) {
        if (param1 != -334290960) {
            field_s = null;
        }
        return this.a(0, 0, (Object) (Object) new Object[3], 8, 0);
    }

    final boolean b(byte param0) {
        if (!((be) this).field_q) {
            return false;
        }
        if (param0 > -70) {
            return false;
        }
        if (!((be) this).field_m) {
            return ((be) this).field_i != null ? true : false;
        }
        return ((be) this).field_o != null ? true : false;
    }

    final eb a(byte param0, java.awt.Frame param1) {
        if (param0 != -120) {
            Object var4 = null;
            eb discarded$0 = ((be) this).a(27, -112, (String) null);
        }
        return this.a(0, 0, (Object) (Object) param1, 7, 0);
    }

    final eb a(int param0, int param1, Runnable param2) {
        if (param0 != 314572800) {
            return null;
        }
        return this.a(0, param1, (Object) (Object) param2, 2, 0);
    }

    private final static gl a(String param0, String param1, byte param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            gl var8_ref = null;
            gl stackIn_11_0 = null;
            Throwable decompiledCaughtException = null;
            gl stackOut_10_0 = null;
            L0: {
              if (-34 == (param3 ^ -1)) {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (34 == param3) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            L1: while (true) {
              if (var5_array.length <= var6) {
                var8 = (Exception) (Object) decompiledCaughtException;
                var6++;
              } else {
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
                  var8_ref = new gl(new File(var7, var4), "rw", 10000L);
                  stackOut_10_0 = (gl) var8_ref;
                  stackIn_11_0 = stackOut_10_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return stackIn_11_0;
                }
                continue L1;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final eb a(boolean param0, String param1, int param2, int param3) {
        if (param2 != 1) {
            ((be) this).field_o = null;
        }
        return this.a(0, param3, (Object) (Object) param1, param0 ? 22 : 1, 0);
    }

    final eb a(Class param0, String param1, int param2) {
        int var4 = 16 % ((param2 - -85) / 34);
        return this.a(0, 0, (Object) (Object) new Object[2], 9, 0);
    }

    final eb a(byte param0) {
        if (param0 != 31) {
            ((be) this).field_b = false;
        }
        return this.a(0, 0, (Object) null, 5, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            bk var3_ref2 = null;
            gl var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            eb var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            java.awt.Component var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.Frame var16 = null;
            String var17 = null;
            Object[] var18 = null;
            int stackIn_65_0 = 0;
            int stackOut_63_0 = 0;
            int stackOut_64_0 = 0;
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
                            if (((be) this).field_b) {
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
                            if (((be) this).field_r != null) {
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
                            var8 = ((be) this).field_r;
                            ((be) this).field_r = ((be) this).field_r.field_d;
                            if (null != ((be) this).field_r) {
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
                            ((be) this).field_d = null;
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
                            var2_int = var8.field_f;
                            if ((var2_int ^ -1) != -2) {
                                statePc = 20;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((field_w ^ -1L) >= (ji.b(-60) ^ -1L)) {
                                statePc = 19;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_e), var8.field_b);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (22 == var2_int) {
                                statePc = 103;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (2 != var2_int) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var9 = new Thread((Runnable) var8.field_e);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_b);
                            var8.field_g = (Object) (Object) var9;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (-5 == var2_int) {
                                statePc = 100;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-9 == var2_int) {
                                statePc = 94;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if ((var2_int ^ -1) != -10) {
                                statePc = 31;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var10 = (Object[]) var8.field_e;
                            if (((be) this).field_q) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 111 : 112);
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
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (18 != var2_int) {
                                statePc = 33;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_g = (Object) (Object) var11.getContents((Object) null);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-20 != (var2_int ^ -1)) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_e;
                            var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (((be) this).field_q) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (3 == var2_int) {
                                statePc = 91;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (21 != var2_int) {
                                statePc = 42;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((field_w ^ -1L) >= (ji.b(-81) ^ -1L)) {
                                statePc = 41;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_e).getAddress();
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var2_int != 5) {
                                statePc = 46;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (!((be) this).field_m) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_g = (Object) (Object) ((be) this).field_o.a(109);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var8.field_g = Class.forName("oi").getMethod("listmodes", new Class[0]).invoke(((be) this).field_i, new Object[0]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (6 == var2_int) {
                                statePc = 88;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (-8 != (var2_int ^ -1)) {
                                statePc = 51;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (((be) this).field_m) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            Object discarded$6 = Class.forName("oi").getMethod("exit", new Class[0]).invoke(((be) this).field_i, new Object[0]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((be) this).field_o.a((java.awt.Frame) var8.field_e, (byte) 34);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (12 != var2_int) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var3_ref3 = be.a((String) var8.field_e, field_a, (byte) 123, field_f);
                            var8.field_g = (Object) (Object) var3_ref3;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (13 != var2_int) {
                                statePc = 55;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var3_ref3 = be.a((String) var8.field_e, "", (byte) -32, field_f);
                            var8.field_g = (Object) (Object) var3_ref3;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (!((be) this).field_q) {
                                statePc = 60;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (14 != var2_int) {
                                statePc = 60;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var3_int = var8.field_b;
                            var4_int = var8.field_c;
                            if (!((be) this).field_m) {
                                statePc = 59;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            ((be) this).field_l.a(var4_int, var3_int, -117);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            Object discarded$7 = Class.forName("jh").getDeclaredMethod("movemouse", new Class[2]).invoke(((be) this).field_h, new Object[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (!((be) this).field_q) {
                                statePc = 68;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (15 != var2_int) {
                                statePc = 68;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (0 == var8.field_b) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            stackOut_63_0 = 1;
                            stackIn_65_0 = stackOut_63_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 0;
                            stackIn_65_0 = stackOut_64_0;
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var3_int = stackIn_65_0;
                            var13 = (java.awt.Component) var8.field_e;
                            if (((be) this).field_m) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            Object discarded$8 = Class.forName("jh").getDeclaredMethod("showcursor", new Class[2]).invoke(((be) this).field_h, new Object[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            ((be) this).field_l.a(32512, var13, var3_int != 0);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (((be) this).field_m) {
                                statePc = 71;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if ((var2_int ^ -1) != -18) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var14 = (Object[]) var8.field_e;
                            Object discarded$9 = Class.forName("jh").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((be) this).field_h, new Object[5]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var2_int != 16) {
                                statePc = 87;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (field_c.startsWith("win")) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 86 : (stateCaught_72 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 86 : (stateCaught_73 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var15 = (String) var8.field_e;
                            if (var15.startsWith("http://")) {
                                statePc = 78;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 86 : (stateCaught_74 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (!var15.startsWith("https://")) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 86 : (stateCaught_75 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 86 : (stateCaught_76 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 86 : (stateCaught_77 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 86 : (stateCaught_78 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var5 >= var15.length()) {
                                statePc = 84;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 86 : (stateCaught_79 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var4_ref.indexOf((int) var15.charAt(var5)) == -1) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 86 : (stateCaught_80 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 86 : (stateCaught_81 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 86 : (stateCaught_82 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var5++;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 86 : (stateCaught_83 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var15 + "\"");
                            var8.field_g = null;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 86 : (stateCaught_84 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var16 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_g = (Object) (Object) var16;
                            var16.setResizable(false);
                            if (((be) this).field_m) {
                                statePc = 90;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            Object discarded$11 = Class.forName("oi").getMethod("enter", new Class[5]).invoke(((be) this).field_i, new Object[5]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            ((be) this).field_o.a(var8.field_b >>> 1977134512, var8.field_c & 65535, -121, var8.field_c >> -334290960, var8.field_b & 65535, var16);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if ((field_w ^ -1L) >= (ji.b(126) ^ -1L)) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var17 = (var8.field_b >> 4231288 & 255) + "." + ((var8.field_b & 16767812) >> 1266990736) + "." + ((var8.field_b & 65280) >> -1098476408) + "." + (var8.field_b & 255);
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName(var17).getHostName();
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var18 = (Object[]) var8.field_e;
                            if (((be) this).field_q) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (null == ((Class) var18[0]).getClassLoader()) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if ((ji.b(106) ^ -1L) <= (field_w ^ -1L)) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_e).openStream());
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if ((field_w ^ -1L) < (ji.b(127) ^ -1L)) {
                                statePc = 105;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var8.field_g = (Object) (Object) a.a(var8.field_b, (String) var8.field_e, -115).b(0);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof bk ? 108 : (stateCaught_106 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var3_ref2 = (bk) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var8.field_a = 1;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 112: {
                        var2_ref2 = caughtException;
                        var8.field_a = 2;
                        statePc = 113;
                        continue stateLoop;
                    }
                    case 113: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 114;
                        continue stateLoop;
                    }
                    case 114: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 116;
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 116;
                            continue stateLoop;
                        }
                    }
                    case 117: {
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

    be(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        kl var6 = null;
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
                    ((be) this).field_b = false;
                    ((be) this).field_v = null;
                    ((be) this).field_r = null;
                    ((be) this).field_u = null;
                    ((be) this).field_m = false;
                    ((be) this).field_g = null;
                    ((be) this).field_d = null;
                    ((be) this).field_q = false;
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
                    ((be) this).field_q = stackIn_3_1 != 0;
                    field_j = "1.1";
                    field_f = param0;
                    field_a = param1;
                    field_s = "Unknown";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_s = System.getProperty("java.vendor");
                        field_j = System.getProperty("java.version");
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
                    if ((field_s.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((be) this).field_m = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_e = System.getProperty("os.name");
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
                    field_e = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_c = field_e.toLowerCase();
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
                        field_n = System.getProperty("user.home");
                        if (field_n == null) {
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
                        field_n = field_n + "/";
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
                    if (field_n != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_n = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((be) this).field_t = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((be) this).field_m) {
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
                    ri.a(field_a, (byte) -94, field_f);
                    if (!((be) this).field_q) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((be) this).field_v = new gl(ri.a(-121, (String) null, field_f, "random.dat"), "rw", 25L);
                    ((be) this).field_u = new gl(ri.a("main_file_cache.dat2", 1), "rw", 314572800L);
                    ((be) this).field_g = new gl(ri.a("main_file_cache.idx255", 1), "rw", 1048576L);
                    ((be) this).field_p = new gl[param2];
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
                    ((be) this).field_p[var5_int] = new gl(ri.a("main_file_cache.idx" + var5_int, 1), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((be) this).field_m) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("je").newInstance();
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
                        if (((be) this).field_m) {
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
                        ((be) this).field_i = Class.forName("oi").newInstance();
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
                        var6 = new kl();
                        ((be) this).field_o = var6;
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
                        if (!((be) this).field_m) {
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
                        ((be) this).field_l = new rb();
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
                        ((be) this).field_h = Class.forName("jh").newInstance();
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
                    ((be) this).field_b = false;
                    ((be) this).field_k = new Thread((Runnable) this);
                    ((be) this).field_k.setPriority(10);
                    ((be) this).field_k.setDaemon(true);
                    ((be) this).field_k.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = 0L;
    }
}
