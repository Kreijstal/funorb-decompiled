/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class uf implements Runnable {
    private tb field_w;
    tc field_p;
    private Thread field_u;
    static String field_e;
    private boolean field_r;
    private ul field_j;
    private static String field_a;
    private Object field_d;
    java.awt.EventQueue field_i;
    static java.lang.reflect.Method field_m;
    private static String field_h;
    boolean field_l;
    private Object field_f;
    tc[] field_q;
    private boolean field_c;
    tc field_t;
    tc field_v;
    private static int field_s;
    private static String field_x;
    static String field_g;
    static String field_b;
    private ce field_k;
    private ce field_n;
    private static volatile long field_o;

    final ce a(boolean param0, java.net.URL param1) {
        if (param0) {
            ce discarded$0 = ((uf) this).a((String) null, (Class[]) null, -97, (Class) null);
        }
        return this.a(0, 1484280784, (Object) (Object) param1, 0, 4);
    }

    final boolean b(int param0) {
        if (!((uf) this).field_l) {
            return false;
        }
        if (param0 != -4) {
            return false;
        }
        if (!((uf) this).field_c) {
            return null != ((uf) this).field_d ? true : false;
        }
        return ((uf) this).field_j != null ? true : false;
    }

    final ce a(int param0, int param1, String param2) {
        if (param0 <= 14) {
            ce discarded$0 = ((uf) this).a(-124, 6, (String) null);
        }
        return this.a(false, param1, param2, (byte) -126);
    }

    final ce a(int param0, Runnable param1, int param2) {
        if (param2 < 0) {
            return null;
        }
        return this.a(0, 1484280784, (Object) (Object) param1, param0, 2);
    }

    final ce a(String param0, Class[] param1, int param2, Class param3) {
        if (param2 != 0) {
            field_h = null;
        }
        return this.a(0, 1484280784, (Object) (Object) new Object[3], 0, 8);
    }

    private final ce a(boolean param0, int param1, String param2, byte param3) {
        if (param3 > -124) {
            field_g = null;
        }
        return this.a(0, 1484280784, (Object) (Object) param2, param1, !param0 ? 1 : 22);
    }

    final ce a(java.awt.Frame param0, int param1) {
        if (param1 > -15) {
            return null;
        }
        return this.a(0, 1484280784, (Object) (Object) param0, 0, 7);
    }

    final ce a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 54) {
            ce discarded$0 = ((uf) this).a((String) null, (Class[]) null, 110, (Class) null);
        }
        return this.a((param1 << 604983024) - -param2, 1484280784, (Object) null, param4 + (param3 << 1484280784), 6);
    }

    private final static tc a(String param0, int param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            tc var8_ref = null;
            tc stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            tc stackOut_14_0 = null;
            L0: {
              if (-34 == (param1 ^ -1)) {
                var4 = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if ((param1 ^ -1) == -35) {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_x, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param2 > 33) {
                break L1;
              } else {
                field_g = null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7 = var5_array[var6];
                  if ((var7.length() ^ -1) >= -1) {
                    break L3;
                  } else {
                    if (new File(var7).exists()) {
                      break L3;
                    } else {
                      var6++;
                      continue L2;
                    }
                  }
                }
                try {
                  var8_ref = new tc(new File(var7, var4), "rw", 10000L);
                  stackOut_14_0 = (tc) var8_ref;
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

    final ce a(int param0, String param1, Class param2) {
        if (param0 != -26462) {
            ((uf) this).run();
        }
        return this.a(0, 1484280784, (Object) (Object) new Object[2], 0, 9);
    }

    final void a(byte param0) {
        try {
            InterruptedException interruptedException = null;
            IOException iOException = null;
            Object var2_ref_Object = null;
            int var2 = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var2_ref_Object = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            ((uf) this).field_r = true;
                            this.notifyAll();
                            // monitorexit var2_ref_Object
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
                            // monitorexit var2_ref_Object
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
                            ((uf) this).field_u.join();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        interruptedException = (InterruptedException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (((uf) this).field_t == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            ((uf) this).field_t.a(-31576);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (((uf) this).field_v == null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((uf) this).field_v.a(-31576);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (((uf) this).field_q == null) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var2 = 0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (var2 >= ((uf) this).field_q.length) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (((uf) this).field_q[var2] != null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var2++;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 22: {
                        try {
                            ((uf) this).field_q[var2].a(-31576);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        var2++;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 24: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2++;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 25: {
                        if (((uf) this).field_p != null) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            ((uf) this).field_p.a(-31576);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 30;
                        continue stateLoop;
                    }
                    case 30: {
                        var2 = -30 / ((1 - param0) / 47);
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

    private final ce a(int param0, int param1, Object param2, int param3, int param4) {
        ce var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new ce();
                    if (param1 == 1484280784) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ce discarded$3 = ((uf) this).a(21, 107, (String) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_c = param2;
                    var6.field_d = param0;
                    var6.field_g = param4;
                    var6.field_b = param3;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null != ((uf) this).field_n) {
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
                        ((uf) this).field_k = var6;
                        ((uf) this).field_n = var6;
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
                        ((uf) this).field_n.field_a = var6;
                        ((uf) this).field_n = var6;
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

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            dj var3_ref = null;
            Exception var3_ref2 = null;
            tc var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            ce var8 = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_85_0 = 0;
            int stackOut_83_0 = 0;
            int stackOut_84_0 = 0;
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
                            if (!((uf) this).field_r) {
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
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (null == ((uf) this).field_k) {
                                statePc = 7;
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
                            var8 = ((uf) this).field_k;
                            ((uf) this).field_k = ((uf) this).field_k.field_a;
                            if (((uf) this).field_k != null) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((uf) this).field_n = null;
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.wait();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = (stateCaught_7 instanceof InterruptedException ? 9 : 12);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var4 = caughtException;
                            // monitorexit var2
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 12;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        throw (RuntimeException) (Object) var4;
                    }
                    case 14: {
                        try {
                            var2_int = var8.field_g;
                            if (-2 == (var2_int ^ -1)) {
                                statePc = 105;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (22 != var2_int) {
                                statePc = 22;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((field_o ^ -1L) < (qg.a(false) ^ -1L)) {
                                statePc = 18;
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
                            statePc = 19;
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
                            var8.field_e = (Object) (Object) oj.a((String) var8.field_c, var8.field_b, 0).c(-118);
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof dj ? 21 : (stateCaught_19 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var3_ref = (dj) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (-3 == (var2_int ^ -1)) {
                                statePc = 104;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (4 != var2_int) {
                                statePc = 28;
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
                            if ((qg.a(false) ^ -1L) > (field_o ^ -1L)) {
                                statePc = 26;
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
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_c).openStream());
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2_int != 8) {
                                statePc = 34;
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
                            var9 = (Object[]) var8.field_c;
                            if (!((uf) this).field_l) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((Class) var9[0]).getClassLoader() == null) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var2_int == 9) {
                                statePc = 100;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (18 == var2_int) {
                                statePc = 99;
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
                            if (19 != var2_int) {
                                statePc = 38;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_c;
                            var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((uf) this).field_l) {
                                statePc = 40;
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var2_int == -4) {
                                statePc = 96;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (21 == var2_int) {
                                statePc = 93;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (-6 != var2_int) {
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
                            if (((uf) this).field_c) {
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
                            var8.field_e = Class.forName("eg").getMethod("listmodes", new Class[0]).invoke(((uf) this).field_d, new Object[0]);
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
                            var8.field_e = (Object) (Object) ((uf) this).field_j.a(0);
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
                            if (-7 == (var2_int ^ -1)) {
                                statePc = 90;
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
                            if ((var2_int ^ -1) != -8) {
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
                            if (((uf) this).field_c) {
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
                            Object discarded$6 = Class.forName("eg").getMethod("exit", new Class[0]).invoke(((uf) this).field_d, new Object[0]);
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
                            ((uf) this).field_j.a((byte) -2, (java.awt.Frame) var8.field_c);
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
                            if (12 == var2_int) {
                                statePc = 89;
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
                            if (var2_int == -14) {
                                statePc = 88;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (!((uf) this).field_l) {
                                statePc = 58;
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
                            if (-15 != var2_int) {
                                statePc = 58;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var3_int = var8.field_b;
                            var4_int = var8.field_d;
                            if (!((uf) this).field_c) {
                                statePc = 57;
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
                            ((uf) this).field_w.a(31942, var3_int, var4_int);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            Object discarded$7 = Class.forName("wc").getDeclaredMethod("movemouse", new Class[2]).invoke(((uf) this).field_f, new Object[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (!((uf) this).field_l) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if ((var2_int ^ -1) == -16) {
                                statePc = 82;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (((uf) this).field_c) {
                                statePc = 64;
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
                            if (var2_int != 17) {
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
                            var11 = (Object[]) var8.field_c;
                            Object discarded$8 = Class.forName("wc").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((uf) this).field_f, new Object[5]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (-17 != (var2_int ^ -1)) {
                                statePc = 81;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (!field_b.startsWith("win")) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 80 : (stateCaught_65 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 80 : (stateCaught_66 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 80 : (stateCaught_67 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var12 = (String) var8.field_c;
                            if (var12.startsWith("http://")) {
                                statePc = 72;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 80 : (stateCaught_68 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (!var12.startsWith("https://")) {
                                statePc = 71;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 80 : (stateCaught_69 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 80 : (stateCaught_70 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 80 : (stateCaught_71 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 80 : (stateCaught_72 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var5 >= var12.length()) {
                                statePc = 78;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 80 : (stateCaught_73 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if ((var4_ref.indexOf((int) var12.charAt(var5)) ^ -1) == 0) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 80 : (stateCaught_74 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 80 : (stateCaught_75 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 80 : (stateCaught_76 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var5++;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 80 : (stateCaught_77 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_e = null;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 80 : (stateCaught_78 instanceof ThreadDeath ? 111 : 112));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (var8.field_b == 0) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackOut_83_0 = 1;
                            stackIn_85_0 = stackOut_83_0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            stackOut_84_0 = 0;
                            stackIn_85_0 = stackOut_84_0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var3_int = stackIn_85_0;
                            var13 = (java.awt.Component) var8.field_c;
                            if (!((uf) this).field_c) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            ((uf) this).field_w.a(var3_int != 0, var13, 5745);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            Object discarded$10 = Class.forName("wc").getDeclaredMethod("showcursor", new Class[2]).invoke(((uf) this).field_f, new Object[2]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var3_ref3 = uf.a((String) var8.field_c, field_s, 124, "");
                            var8.field_e = (Object) (Object) var3_ref3;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var3_ref3 = uf.a((String) var8.field_c, field_s, 40, field_a);
                            var8.field_e = (Object) (Object) var3_ref3;
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
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (((uf) this).field_c) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            Object discarded$11 = Class.forName("eg").getMethod("enter", new Class[5]).invoke(((uf) this).field_d, new Object[5]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            ((uf) this).field_j.a(65535 & var8.field_b, var8.field_d >> -1496725264, var8.field_b >>> 864236560, false, var14, var8.field_d & 65535);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if ((field_o ^ -1L) >= (qg.a(false) ^ -1L)) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_c).getAddress();
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (qg.a(false) >= field_o) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var15 = (var8.field_b >> -417455912 & 255) + "." + (255 & var8.field_b >> 743279344) + "." + ((65479 & var8.field_b) >> 633715528) + "." + (255 & var8.field_b);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var16.getContents((Object) null);
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
                            var17 = (Object[]) var8.field_c;
                            if (!((uf) this).field_l) {
                                statePc = 103;
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
                            if (((Class) var17[0]).getClassLoader() != null) {
                                statePc = 103;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var18 = new Thread((Runnable) var8.field_c);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_b);
                            var8.field_e = (Object) (Object) var18;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (qg.a(false) < field_o) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_c), var8.field_b);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 111 : 112);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var8.field_f = 1;
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
                        var8.field_f = 2;
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

    final ce a(int param0) {
        if (param0 <= 33) {
            return null;
        }
        return this.a(0, 1484280784, (Object) null, 0, 5);
    }

    uf(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ul var6 = null;
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
                    ((uf) this).field_p = null;
                    ((uf) this).field_l = false;
                    ((uf) this).field_r = false;
                    ((uf) this).field_c = false;
                    ((uf) this).field_v = null;
                    ((uf) this).field_t = null;
                    ((uf) this).field_n = null;
                    ((uf) this).field_k = null;
                    field_a = param1;
                    field_g = "1.1";
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
                    ((uf) this).field_l = stackIn_3_1 != 0;
                    field_e = "Unknown";
                    field_s = param0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_e = System.getProperty("java.vendor");
                        field_g = System.getProperty("java.version");
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
                    if (0 == (field_e.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((uf) this).field_c = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_h = System.getProperty("os.name");
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
                    field_h = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_b = field_h.toLowerCase();
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
                        field_x = System.getProperty("user.home");
                        if (null == field_x) {
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
                        field_x = field_x + "/";
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
                    if (null == field_x) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_x = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((uf) this).field_i = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((uf) this).field_c) {
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
                        field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    tj.a(field_s, field_a, (byte) -119);
                    if (!((uf) this).field_l) {
                        statePc = 55;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((uf) this).field_p = new tc(tj.a(field_s, (byte) 78, (String) null, "random.dat"), "rw", 25L);
                    ((uf) this).field_t = new tc(tj.a((byte) -61, "main_file_cache.dat2"), "rw", 314572800L);
                    ((uf) this).field_v = new tc(tj.a((byte) -61, "main_file_cache.idx255"), "rw", 1048576L);
                    ((uf) this).field_q = new tc[param2];
                    var5_int = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var5_int >= param2) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((uf) this).field_q[var5_int] = new tc(tj.a((byte) -61, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (!((uf) this).field_c) {
                        statePc = 45;
                    } else {
                        statePc = 42;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("ph").newInstance();
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
                        if (((uf) this).field_c) {
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
                        ((uf) this).field_d = Class.forName("eg").newInstance();
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
                        var6 = new ul();
                        ((uf) this).field_j = var6;
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
                        if (((uf) this).field_c) {
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
                        ((uf) this).field_f = Class.forName("wc").newInstance();
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
                        ((uf) this).field_w = new tb();
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
                    ((uf) this).field_r = false;
                    ((uf) this).field_u = new Thread((Runnable) this);
                    ((uf) this).field_u.setPriority(10);
                    ((uf) this).field_u.setDaemon(true);
                    ((uf) this).field_u.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = 0L;
    }
}
