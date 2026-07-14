/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ej implements Runnable {
    kb field_e;
    kb field_f;
    private Thread field_n;
    private boolean field_t;
    private me field_h;
    boolean field_p;
    private re field_q;
    private static volatile long field_o;
    private re field_v;
    private Object field_c;
    private static String field_x;
    kb field_d;
    private jl field_j;
    kb[] field_l;
    private static String field_i;
    private Object field_a;
    private static int field_b;
    private boolean field_m;
    static java.lang.reflect.Method field_w;
    private static String field_u;
    static String field_r;
    static String field_g;
    static String field_k;
    java.awt.EventQueue field_s;

    final re b(int param0) {
        if (param0 < 66) {
            field_k = null;
        }
        return this.a(5, 0, 1, 0, (Object) null);
    }

    private final static kb a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            kb var8_ref = null;
            kb stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            kb stackOut_13_0 = null;
            L0: {
              if (param1 == 33) {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              } else {
                if (-35 != (param1 ^ -1)) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param0 < -48) {
                break L1;
              } else {
                field_w = null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7 = var5_array[var6];
                  if (-1 <= (var7.length() ^ -1)) {
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
                  var8_ref = new kb(new File(var7, var4), "rw", 10000L);
                  stackOut_13_0 = (kb) var8_ref;
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

    final re a(int param0, int param1, int param2, int param3, int param4) {
        if (param0 != 2019341456) {
            field_o = 51L;
        }
        return this.a(6, (param4 << 1676019184) + param1, param0 ^ 2019341457, (param3 << 2019341456) - -param2, (Object) null);
    }

    final re a(java.awt.Frame param0, byte param1) {
        if (param1 != -107) {
            ((ej) this).field_p = true;
        }
        return this.a(7, 0, param1 ^ -108, 0, (Object) (Object) param0);
    }

    final re a(int param0, java.net.URL param1) {
        if (param0 != 5284) {
            return null;
        }
        return this.a(4, 0, 1, 0, (Object) (Object) param1);
    }

    private final re a(int param0, int param1, boolean param2, String param3) {
        if (param0 != -19897) {
            ((ej) this).field_a = null;
        }
        return this.a(!param2 ? 1 : 22, 0, 1, param1, (Object) (Object) param3);
    }

    final re a(Runnable param0, int param1, int param2) {
        if (param2 != 0) {
            re discarded$0 = ((ej) this).b(27);
        }
        return this.a(2, 0, 1, param1, (Object) (Object) param0);
    }

    final re a(String param0, Class[] param1, int param2, Class param3) {
        if (param2 < 107) {
            return null;
        }
        return this.a(8, 0, 1, 0, (Object) (Object) new Object[3]);
    }

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
                            if (param0 == 0) {
                                statePc = 4;
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
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            ((ej) this).field_m = true;
                            this.notifyAll();
                            // monitorexit var2
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
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 8: {
                        try {
                            ((ej) this).field_n.join();
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 10;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 11;
                        continue stateLoop;
                    }
                    case 11: {
                        if (((ej) this).field_f != null) {
                            statePc = 13;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((ej) this).field_f.a(105);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        if (null != ((ej) this).field_d) {
                            statePc = 18;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        try {
                            ((ej) this).field_d.a(param0 ^ -30);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (((ej) this).field_l != null) {
                            statePc = 23;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        var2_int = 0;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        if (((ej) this).field_l.length <= var2_int) {
                            statePc = 31;
                        } else {
                            statePc = 25;
                        }
                        continue stateLoop;
                    }
                    case 25: {
                        if (null != ((ej) this).field_l[var2_int]) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 28: {
                        try {
                            ((ej) this).field_l[var2_int].a(-101);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 30: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 31: {
                        if (((ej) this).field_e == null) {
                            statePc = 35;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 32: {
                        try {
                            ((ej) this).field_e.a(-62);
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 34;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 35;
                        continue stateLoop;
                    }
                    case 35: {
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

    final re a(String param0, byte param1, int param2) {
        if (param1 != 34) {
            field_k = null;
        }
        return this.a(-19897, param2, false, param0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            tl var3_ref = null;
            Exception var3_ref2 = null;
            kb var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            re var8 = null;
            Object[] var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.Frame var11 = null;
            java.awt.Component var12 = null;
            String var13 = null;
            Object[] var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_66_0 = 0;
            int stackOut_64_0 = 0;
            int stackOut_65_0 = 0;
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
                            if (((ej) this).field_m) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 15;
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
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        return;
                    }
                    case 5: {
                        try {
                            if (null != ((ej) this).field_v) {
                                statePc = 7;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var8 = ((ej) this).field_v;
                            ((ej) this).field_v = ((ej) this).field_v.field_e;
                            if (null == ((ej) this).field_v) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((ej) this).field_q = null;
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            this.wait();
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = (stateCaught_10 instanceof InterruptedException ? 12 : 15);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var3 = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            // monitorexit var2
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4_ref_Throwable = caughtException;
                            // monitorexit var2
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 17: {
                        try {
                            var2_int = var8.field_d;
                            if (var2_int == 1) {
                                statePc = 109;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2_int != 22) {
                                statePc = 25;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (field_o > ih.a((byte) -98)) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var8.field_b = (Object) (Object) og.a((byte) -122, (String) var8.field_a, var8.field_g).b(-128);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof tl ? 24 : (stateCaught_22 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var3_ref = (tl) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-3 == (var2_int ^ -1)) {
                                statePc = 108;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2_int == 4) {
                                statePc = 105;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (8 != var2_int) {
                                statePc = 34;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            var9 = (Object[]) var8.field_a;
                            if (((ej) this).field_p) {
                                statePc = 30;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (null == ((Class) var9[0]).getClassLoader()) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if ((var2_int ^ -1) == -10) {
                                statePc = 101;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (18 == var2_int) {
                                statePc = 100;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 115 : 116);
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
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_a;
                            var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (((ej) this).field_p) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-4 == var2_int) {
                                statePc = 97;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (-22 != var2_int) {
                                statePc = 46;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (field_o > ih.a((byte) -98)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_a).getAddress();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((var2_int ^ -1) != -6) {
                                statePc = 50;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!((ej) this).field_t) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            var8.field_b = (Object) (Object) ((ej) this).field_j.a(0);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var8.field_b = Class.forName("hg").getMethod("listmodes", new Class[0]).invoke(((ej) this).field_c, new Object[0]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var2_int != 6) {
                                statePc = 54;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var11 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_b = (Object) (Object) var11;
                            var11.setResizable(false);
                            if (!((ej) this).field_t) {
                                statePc = 53;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((ej) this).field_j.a((byte) 85, var8.field_g >>> 769608592, var8.field_c & 65535, var11, var8.field_c >> 235490096, 65535 & var8.field_g);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            Object discarded$6 = Class.forName("hg").getMethod("enter", new Class[5]).invoke(((ej) this).field_c, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (-8 == (var2_int ^ -1)) {
                                statePc = 94;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (12 == var2_int) {
                                statePc = 93;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var2_int != 13) {
                                statePc = 58;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var3_ref3 = ej.a(-122, field_b, "", (String) var8.field_a);
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (!((ej) this).field_p) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (14 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (!((ej) this).field_p) {
                                statePc = 69;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (var2_int != 15) {
                                statePc = 69;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var8.field_g == 0) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackOut_64_0 = 1;
                            stackIn_66_0 = stackOut_64_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            stackOut_65_0 = 0;
                            stackIn_66_0 = stackOut_65_0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var3_int = stackIn_66_0;
                            var12 = (java.awt.Component) var8.field_a;
                            if (((ej) this).field_t) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            Object discarded$7 = Class.forName("ne").getDeclaredMethod("showcursor", new Class[2]).invoke(((ej) this).field_a, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            ((ej) this).field_h.a(var3_int != 0, var12, (byte) -66);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (((ej) this).field_t) {
                                statePc = 72;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var2_int == -18) {
                                statePc = 89;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (-17 != var2_int) {
                                statePc = 88;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (field_k.startsWith("win")) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 87 : (stateCaught_74 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 87 : (stateCaught_75 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var13 = (String) var8.field_a;
                            if (var13.startsWith("http://")) {
                                statePc = 79;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 87 : (stateCaught_76 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var13.startsWith("https://")) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 87 : (stateCaught_77 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 87 : (stateCaught_78 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 87 : (stateCaught_79 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var13.length() <= var5) {
                                statePc = 85;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 87 : (stateCaught_80 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (-1 == var4_ref.indexOf((int) var13.charAt(var5))) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 87 : (stateCaught_81 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 87 : (stateCaught_82 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 87 : (stateCaught_83 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var5++;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 87 : (stateCaught_84 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_b = null;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 87 : (stateCaught_85 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var14 = (Object[]) var8.field_a;
                            Object discarded$9 = Class.forName("ne").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ej) this).field_a, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var3_int = var8.field_g;
                            var4 = var8.field_c;
                            if (((ej) this).field_t) {
                                statePc = 92;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            Object discarded$10 = Class.forName("ne").getDeclaredMethod("movemouse", new Class[2]).invoke(((ej) this).field_a, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            ((ej) this).field_h.a(var4, var3_int, (byte) -25);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var3_ref3 = ej.a(-100, field_b, field_x, (String) var8.field_a);
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (!((ej) this).field_t) {
                                statePc = 96;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            ((ej) this).field_j.a((java.awt.Frame) var8.field_a, (byte) -86);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            Object discarded$11 = Class.forName("hg").getMethod("exit", new Class[0]).invoke(((ej) this).field_c, new Object[0]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (ih.a((byte) -98) >= field_o) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var15 = (var8.field_g >> -1586218504 & 255) + "." + ((16759916 & var8.field_g) >> -1321324240) + "." + ((var8.field_g & 65314) >> 1087273864) + "." + (var8.field_g & 255);
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_b = (Object) (Object) var16.getContents((Object) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var17 = (Object[]) var8.field_a;
                            if (!((ej) this).field_p) {
                                statePc = 104;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (null != ((Class) var17[0]).getClassLoader()) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if ((ih.a((byte) -98) ^ -1L) <= (field_o ^ -1L)) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var8.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_a).openStream());
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var18 = new Thread((Runnable) var8.field_a);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_g);
                            var8.field_b = (Object) (Object) var18;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if ((field_o ^ -1L) < (ih.a((byte) -98) ^ -1L)) {
                                statePc = 111;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var8.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_a), var8.field_g);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            var8.field_f = 1;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 116: {
                        var2_ref2 = caughtException;
                        var8.field_f = 2;
                        statePc = 117;
                        continue stateLoop;
                    }
                    case 117: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = 120;
                            continue stateLoop;
                        }
                    }
                    case 121: {
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

    final re a(Class param0, int param1, String param2) {
        if (param1 != 0) {
            ((ej) this).field_h = null;
        }
        return this.a(9, 0, 1, 0, (Object) (Object) new Object[2]);
    }

    private final re a(int param0, int param1, int param2, int param3, Object param4) {
        re var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new re();
                    var6.field_c = param1;
                    var6.field_d = param0;
                    var6.field_g = param3;
                    var6.field_a = param4;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((ej) this).field_q != null) {
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
                        ((ej) this).field_v = var6;
                        ((ej) this).field_q = var6;
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
                        ((ej) this).field_q.field_e = var6;
                        ((ej) this).field_q = var6;
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
                        var8 = caughtException;
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
                    throw (RuntimeException) (Object) var8;
                }
                case 8: {
                    if (param2 == 1) {
                        statePc = 10;
                    } else {
                        statePc = 9;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((ej) this).field_a = null;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final boolean a(int param0) {
        int var2 = 89 / ((param0 - 61) / 57);
        if (!((ej) this).field_p) {
            return false;
        }
        if (!((ej) this).field_t) {
            return null != ((ej) this).field_c ? true : false;
        }
        return null != ((ej) this).field_j ? true : false;
    }

    ej(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        jl var7 = null;
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
                    ((ej) this).field_f = null;
                    ((ej) this).field_t = false;
                    ((ej) this).field_v = null;
                    ((ej) this).field_q = null;
                    ((ej) this).field_d = null;
                    ((ej) this).field_m = false;
                    ((ej) this).field_p = false;
                    ((ej) this).field_e = null;
                    field_x = param1;
                    field_g = "Unknown";
                    field_b = param0;
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
                    ((ej) this).field_p = stackIn_3_1 != 0;
                    field_r = "1.1";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_g = System.getProperty("java.vendor");
                        field_r = System.getProperty("java.version");
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
                    if ((field_g.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((ej) this).field_t = true;
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
                    field_k = field_i.toLowerCase();
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
                        field_u = System.getProperty("user.home");
                        if (field_u == null) {
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
                        field_u = field_u + "/";
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
                    if (null != field_u) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_u = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((ej) this).field_s = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((ej) this).field_t) {
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
                        field_w = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    c.a(field_b, 93, field_x);
                    if (!((ej) this).field_p) {
                        statePc = 53;
                    } else {
                        statePc = 36;
                    }
                    continue stateLoop;
                }
                case 36: {
                    ((ej) this).field_e = new kb(c.a("random.dat", field_b, (String) null, (byte) -6), "rw", 25L);
                    ((ej) this).field_f = new kb(c.a("main_file_cache.dat2", 0), "rw", 314572800L);
                    ((ej) this).field_d = new kb(c.a("main_file_cache.idx255", 0), "rw", 1048576L);
                    ((ej) this).field_l = new kb[param2];
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
                    ((ej) this).field_l[var5_int] = new kb(c.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                    var5_int++;
                    statePc = 37;
                    continue stateLoop;
                }
                case 39: {
                    if (!((ej) this).field_t) {
                        statePc = 43;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    try {
                        Object discarded$7 = Class.forName("cb").newInstance();
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
                        if (((ej) this).field_t) {
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
                        ((ej) this).field_c = Class.forName("hg").newInstance();
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
                        var7 = new jl();
                        ((ej) this).field_j = var7;
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
                        if (!((ej) this).field_t) {
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
                        ((ej) this).field_h = new me();
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
                        ((ej) this).field_a = Class.forName("ne").newInstance();
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
                    ((ej) this).field_m = false;
                    ((ej) this).field_n = new Thread((Runnable) this);
                    ((ej) this).field_n.setPriority(10);
                    ((ej) this).field_n.setDaemon(true);
                    ((ej) this).field_n.start();
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
