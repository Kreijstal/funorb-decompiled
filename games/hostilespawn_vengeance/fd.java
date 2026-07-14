/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd implements Runnable {
    private boolean field_o;
    ee field_q;
    private sl field_r;
    ee field_l;
    static String field_c;
    ee[] field_v;
    private Object field_p;
    private static volatile long field_x;
    private static String field_m;
    static java.lang.reflect.Method field_i;
    private kk field_s;
    ee field_f;
    boolean field_k;
    private static String field_e;
    private kk field_n;
    private tl field_a;
    static String field_h;
    private static int field_t;
    private static String field_g;
    private boolean field_b;
    private Thread field_w;
    static String field_u;
    private Object field_j;
    java.awt.EventQueue field_d;

    private final kk a(boolean param0, String param1, int param2, int param3) {
        if (param3 != 20691) {
            field_u = null;
        }
        return this.a(!param0 ? 1 : 22, (Object) (Object) param1, false, 0, param2);
    }

    final kk a(String param0, int param1, int param2) {
        if (param1 <= 47) {
            ((fd) this).field_o = true;
        }
        return this.a(false, param0, param2, 20691);
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
                            ((fd) this).field_o = true;
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
                            ((fd) this).field_w.join();
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
                        if (((fd) this).field_l == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            ((fd) this).field_l.c(-1);
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
                        if (null != ((fd) this).field_f) {
                            statePc = 14;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 14: {
                        try {
                            ((fd) this).field_f.c(-1);
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        iOException = (IOException) (Object) caughtException;
                        statePc = 17;
                        continue stateLoop;
                    }
                    case 17: {
                        if (null == ((fd) this).field_v) {
                            statePc = 25;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    }
                    case 18: {
                        var2 = 0;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 19: {
                        if (((fd) this).field_v.length <= var2) {
                            statePc = 25;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        if (null != ((fd) this).field_v[var2]) {
                            statePc = 22;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var2++;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 22: {
                        try {
                            ((fd) this).field_v[var2].c(-1);
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
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 24: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2++;
                        statePc = 19;
                        continue stateLoop;
                    }
                    case 25: {
                        if (null != ((fd) this).field_q) {
                            statePc = 27;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 27: {
                        try {
                            ((fd) this).field_q.c(-1);
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
                        var2 = 53 / ((47 - param0) / 41);
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

    final kk a(boolean param0, int param1, int param2, int param3, int param4) {
        if (param0) {
            return null;
        }
        return this.a(6, (Object) null, param0, param2 + (param4 << -786885712), (param1 << 558717520) + param3);
    }

    final boolean a(boolean param0) {
        if (!param0) {
            return false;
        }
        if (!((fd) this).field_k) {
            return false;
        }
        if (!((fd) this).field_b) {
            return null != ((fd) this).field_p ? true : false;
        }
        return null != ((fd) this).field_r ? true : false;
    }

    final kk a(int param0, java.awt.Frame param1) {
        if (param0 != 7) {
            return null;
        }
        return this.a(7, (Object) (Object) param1, false, 0, 0);
    }

    private final static ee a(int param0, String param1, String param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            ee var8_ref = null;
            ee stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            ee stackOut_14_0 = null;
            var7_ref = null;
            if (param3 == -7) {
              L0: {
                if ((param0 ^ -1) == -34) {
                  var4 = "jagex_" + param2 + "_preferences" + param1 + "_rc.dat";
                  break L0;
                } else {
                  if ((param0 ^ -1) == -35) {
                    var4 = "jagex_" + param2 + "_preferences" + param1 + "_wip.dat";
                    break L0;
                  } else {
                    var4 = "jagex_" + param2 + "_preferences" + param1 + ".dat";
                    break L0;
                  }
                }
              }
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_g, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var6 < var5_array.length) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (-1 <= (var7_ref.length() ^ -1)) {
                      break L2;
                    } else {
                      if (new File(var7_ref).exists()) {
                        break L2;
                      } else {
                        var6++;
                        continue L1;
                      }
                    }
                  }
                  try {
                    var8_ref = new ee(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (ee) var8_ref;
                    stackIn_15_0 = stackOut_14_0;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return stackIn_15_0;
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

    final kk a(int param0, java.net.URL param1) {
        if (param0 != 30085) {
            Object var4 = null;
            kk discarded$0 = this.a(true, (String) null, -77, -50);
        }
        return this.a(4, (Object) (Object) param1, false, 0, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            ab var3_ref2 = null;
            ee var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            kk var8 = null;
            Object[] var9 = null;
            java.awt.Component var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Frame var13 = null;
            String var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_50_0 = 0;
            int stackOut_48_0 = 0;
            int stackOut_49_0 = 0;
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
                            if (((fd) this).field_o) {
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
                            if (null != ((fd) this).field_s) {
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
                            var8 = ((fd) this).field_s;
                            ((fd) this).field_s = ((fd) this).field_s.field_e;
                            if (((fd) this).field_s != null) {
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
                            ((fd) this).field_n = null;
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
                            var2_int = var8.field_g;
                            if (var2_int == -2) {
                                statePc = 110;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (22 == var2_int) {
                                statePc = 104;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-3 == var2_int) {
                                statePc = 103;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (4 == var2_int) {
                                statePc = 99;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (8 != var2_int) {
                                statePc = 27;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var9 = (Object[]) var8.field_a;
                            if (((fd) this).field_k) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (null == ((Class) var9[0]).getClassLoader()) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var8.field_c = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (-10 == var2_int) {
                                statePc = 93;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2_int == 18) {
                                statePc = 92;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (-20 == var2_int) {
                                statePc = 91;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (((fd) this).field_k) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2_int == -4) {
                                statePc = 88;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var2_int == 21) {
                                statePc = 84;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (-6 == var2_int) {
                                statePc = 81;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (-7 == (var2_int ^ -1)) {
                                statePc = 78;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if ((var2_int ^ -1) == -8) {
                                statePc = 75;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var2_int == -13) {
                                statePc = 74;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-14 != var2_int) {
                                statePc = 40;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var3_ref3 = fd.a(field_t, (String) var8.field_a, "", -7);
                            var8.field_c = (Object) (Object) var3_ref3;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!((fd) this).field_k) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (14 != var2_int) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var3_int = var8.field_b;
                            var4_int = var8.field_d;
                            if (!((fd) this).field_b) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            ((fd) this).field_a.a(var4_int, -93, var3_int);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            Object discarded$6 = Class.forName("dm").getDeclaredMethod("movemouse", new Class[2]).invoke(((fd) this).field_j, new Object[2]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (!((fd) this).field_k) {
                                statePc = 53;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (15 != var2_int) {
                                statePc = 53;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var8.field_b == 0) {
                                statePc = 49;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            stackOut_48_0 = 1;
                            stackIn_50_0 = stackOut_48_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackOut_49_0 = 0;
                            stackIn_50_0 = stackOut_49_0;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var3_int = stackIn_50_0;
                            var10 = (java.awt.Component) var8.field_a;
                            if (((fd) this).field_b) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            Object discarded$7 = Class.forName("dm").getDeclaredMethod("showcursor", new Class[2]).invoke(((fd) this).field_j, new Object[2]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            ((fd) this).field_a.a(0, var3_int != 0, var10);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (((fd) this).field_b) {
                                statePc = 56;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if ((var2_int ^ -1) == -18) {
                                statePc = 73;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var2_int != 16) {
                                statePc = 72;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (field_c.startsWith("win")) {
                                statePc = 60;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof Exception ? 71 : (stateCaught_58 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof Exception ? 71 : (stateCaught_59 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var11 = (String) var8.field_a;
                            if (var11.startsWith("http://")) {
                                statePc = 63;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof Exception ? 71 : (stateCaught_60 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var11.startsWith("https://")) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof Exception ? 71 : (stateCaught_61 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 71 : (stateCaught_62 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 71 : (stateCaught_63 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (var5 >= var11.length()) {
                                statePc = 69;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 71 : (stateCaught_64 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if ((var4_ref.indexOf((int) var11.charAt(var5)) ^ -1) == 0) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 71 : (stateCaught_65 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 71 : (stateCaught_66 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 71 : (stateCaught_67 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var5++;
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 71 : (stateCaught_68 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_c = null;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 71 : (stateCaught_69 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_c = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var12 = (Object[]) var8.field_a;
                            Object discarded$9 = Class.forName("dm").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fd) this).field_j, new Object[5]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var3_ref3 = fd.a(field_t, (String) var8.field_a, field_m, -7);
                            var8.field_c = (Object) (Object) var3_ref3;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (((fd) this).field_b) {
                                statePc = 77;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            Object discarded$10 = Class.forName("hc").getMethod("exit", new Class[0]).invoke(((fd) this).field_p, new Object[0]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            ((fd) this).field_r.a((java.awt.Frame) var8.field_a, -7738);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var13 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_c = (Object) (Object) var13;
                            var13.setResizable(false);
                            if (((fd) this).field_b) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            Object discarded$11 = Class.forName("hc").getMethod("enter", new Class[5]).invoke(((fd) this).field_p, new Object[5]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((fd) this).field_r.a(65535 & var8.field_b, var8.field_b >>> 240395504, -7018, 65535 & var8.field_d, var13, var8.field_d >> 266378672);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (!((fd) this).field_b) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var8.field_c = (Object) (Object) ((fd) this).field_r.a((byte) 113);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var8.field_c = Class.forName("hc").getMethod("listmodes", new Class[0]).invoke(((fd) this).field_p, new Object[0]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (hn.a((byte) 80) < field_x) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var8.field_c = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_a).getAddress();
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (hn.a((byte) 80) >= field_x) {
                                statePc = 90;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var14 = (255 & var8.field_b >> -98594184) + "." + ((var8.field_b & 16770738) >> -244953584) + "." + ((var8.field_b & 65486) >> -750180536) + "." + (255 & var8.field_b);
                            var8.field_c = (Object) (Object) java.net.InetAddress.getByName(var14).getHostName();
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_a;
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_c = (Object) (Object) var16.getContents((Object) null);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var17 = (Object[]) var8.field_a;
                            if (((fd) this).field_k) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 116 : 117);
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
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var8.field_c = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if (hn.a((byte) 80) < field_x) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_c = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_a).openStream());
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var18 = new Thread((Runnable) var8.field_a);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_b);
                            var8.field_c = (Object) (Object) var18;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if ((hn.a((byte) 80) ^ -1L) > (field_x ^ -1L)) {
                                statePc = 106;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var8.field_c = (Object) (Object) qj.a(27, (String) var8.field_a, var8.field_b).a(31067);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ab ? 109 : (stateCaught_107 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var3_ref2 = (ab) (Object) caughtException;
                            var8.field_c = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if ((field_x ^ -1L) < (hn.a((byte) 80) ^ -1L)) {
                                statePc = 112;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            var8.field_c = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_a), var8.field_b);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var8.field_f = 1;
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 117: {
                        var2_ref2 = caughtException;
                        var8.field_f = 2;
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 119;
                        continue stateLoop;
                    }
                    case 119: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = 121;
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 122;
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = 121;
                            continue stateLoop;
                        }
                    }
                    case 122: {
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

    final kk a(byte param0, Class param1, String param2) {
        if (param0 <= 91) {
            ((fd) this).field_s = null;
        }
        return this.a(9, (Object) (Object) new Object[2], false, 0, 0);
    }

    private final kk a(int param0, Object param1, boolean param2, int param3, int param4) {
        kk var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new kk();
                    if (!param2) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    field_c = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6.field_d = param3;
                    var6.field_b = param4;
                    var6.field_a = param1;
                    var6.field_g = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null != ((fd) this).field_n) {
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
                        ((fd) this).field_s = var6;
                        ((fd) this).field_n = var6;
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
                        ((fd) this).field_n.field_e = var6;
                        ((fd) this).field_n = var6;
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

    final kk a(int param0, Runnable param1, int param2) {
        int var4 = -31 / ((9 - param2) / 44);
        return this.a(2, (Object) (Object) param1, false, 0, param0);
    }

    final kk a(int param0) {
        int var2 = 102 % ((-15 - param0) / 43);
        return this.a(5, (Object) null, false, 0, 0);
    }

    final kk a(Class[] param0, Class param1, String param2, int param3) {
        if (param3 < 104) {
            ((fd) this).field_w = null;
        }
        return this.a(8, (Object) (Object) new Object[3], false, 0, 0);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        sl var6 = null;
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
                    ((fd) this).field_o = false;
                    ((fd) this).field_q = null;
                    ((fd) this).field_n = null;
                    ((fd) this).field_k = false;
                    ((fd) this).field_b = false;
                    ((fd) this).field_f = null;
                    ((fd) this).field_l = null;
                    ((fd) this).field_s = null;
                    field_m = param1;
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
                    ((fd) this).field_k = stackIn_3_1 != 0;
                    field_u = "Unknown";
                    field_t = param0;
                    field_h = "1.1";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_u = System.getProperty("java.vendor");
                        field_h = System.getProperty("java.version");
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
                    if ((field_u.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((fd) this).field_b = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_e = System.getProperty("os.name");
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
                    field_e = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_c = field_e.toLowerCase();
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
                        field_g = System.getProperty("user.home");
                        if (null == field_g) {
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
                        field_g = field_g + "/";
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
                    if (field_g == null) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    field_g = "~/";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((fd) this).field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((fd) this).field_b) {
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
                        field_i = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    qd.a(-1, field_t, field_m);
                    if (!((fd) this).field_k) {
                        statePc = 57;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((fd) this).field_q = new ee(qd.a(field_t, (String) null, "random.dat", true), "rw", 25L);
                    ((fd) this).field_l = new ee(qd.a("main_file_cache.dat2", -19005), "rw", 314572800L);
                    ((fd) this).field_f = new ee(qd.a("main_file_cache.idx255", -19005), "rw", 1048576L);
                    ((fd) this).field_v = new ee[param2];
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
                    ((fd) this).field_v[var5_int] = new ee(qd.a("main_file_cache.idx" + var5_int, -19005), "rw", 1048576L);
                    var5_int++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 42: {
                    if (((fd) this).field_b) {
                        statePc = 44;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 44: {
                    try {
                        Object discarded$7 = Class.forName("qe").newInstance();
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
                        if (((fd) this).field_b) {
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
                        ((fd) this).field_p = Class.forName("hc").newInstance();
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
                        var6 = new sl();
                        ((fd) this).field_r = var6;
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
                        if (!((fd) this).field_b) {
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
                        ((fd) this).field_a = new tl();
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
                        ((fd) this).field_j = Class.forName("dm").newInstance();
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
                    ((fd) this).field_o = false;
                    ((fd) this).field_w = new Thread((Runnable) this);
                    ((fd) this).field_w.setPriority(10);
                    ((fd) this).field_w.setDaemon(true);
                    ((fd) this).field_w.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_x = 0L;
    }
}
