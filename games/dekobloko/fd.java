/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class fd implements Runnable {
    static String field_k;
    java.awt.EventQueue field_w;
    private ae field_r;
    private static int field_n;
    private mh field_h;
    private Object field_x;
    private static volatile long field_t;
    boolean field_a;
    hf field_i;
    private static String field_b;
    static String field_c;
    hf[] field_o;
    private Thread field_s;
    private mh field_p;
    private boolean field_j;
    private boolean field_m;
    static String field_d;
    static java.lang.reflect.Method field_f;
    private Object field_q;
    private static String field_u;
    hf field_v;
    private static String field_g;
    private fg field_e;
    hf field_l;

    final mh a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 <= 39) {
            ((fd) this).field_r = null;
        }
        return this.a(param4 + (param2 << 75254128), 1, (Object) null, 6, (param3 << 261205040) + param1);
    }

    final mh a(int param0, String param1, int param2) {
        if (param0 <= 98) {
            Object var5 = null;
            mh discarded$0 = this.a(12, true, -60, (String) null);
        }
        return this.a(param2, false, -10742, param1);
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
                            ((fd) this).field_m = true;
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
                            ((fd) this).field_s.join();
                            if (param0 == 0) {
                                statePc = 9;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((fd) this).a(-106);
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 8;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 9;
                        continue stateLoop;
                    }
                    case 9: {
                        if (((fd) this).field_i != null) {
                            statePc = 11;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((fd) this).field_i.a(-72);
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
                        if (null != ((fd) this).field_l) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((fd) this).field_l.a(param0 + -55);
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
                        if (null != ((fd) this).field_o) {
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
                        if (var2_int >= ((fd) this).field_o.length) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (null != ((fd) this).field_o[var2_int]) {
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
                            ((fd) this).field_o[var2_int].a(param0 ^ -71);
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
                        if (((fd) this).field_v == null) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((fd) this).field_v.a(-72);
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

    final mh a(boolean param0, String param1, Class param2) {
        if (param0) {
            return null;
        }
        return this.a(0, 1, (Object) (Object) new Object[2], 9, 0);
    }

    private final mh a(int param0, boolean param1, int param2, String param3) {
        if (param2 != -10742) {
            ((fd) this).field_h = null;
        }
        return this.a(0, 1, (Object) (Object) param3, param1 ? 22 : 1, param0);
    }

    final boolean b(int param0) {
        if (param0 != -86) {
            return false;
        }
        if (!(((fd) this).field_a)) {
            return false;
        }
        if (((fd) this).field_j) {
            return null != ((fd) this).field_e ? true : false;
        }
        return ((fd) this).field_x != null ? true : false;
    }

    final mh a(int param0, String param1, Class param2, Class[] param3) {
        if (param0 != -10962) {
            field_f = null;
        }
        return this.a(0, param0 ^ -10961, (Object) (Object) new Object[3], 8, 0);
    }

    private final static hf a(byte param0, String param1, String param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            hf var8_ref = null;
            hf stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            hf stackOut_13_0 = null;
            L0: {
              if (33 == param3) {
                var4 = "jagex_" + param1 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if ((param3 ^ -1) == -35) {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_u, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 == -32) {
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
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
                    var8_ref = new hf(new File(var7, var4), "rw", 10000L);
                    stackOut_13_0 = (hf) var8_ref;
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

    final mh a(int param0, java.awt.Frame param1) {
        if (param0 != 75254128) {
            return null;
        }
        return this.a(0, 1, (Object) (Object) param1, 7, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            Object var2_ref3 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            db var3_ref = null;
            Exception var3_ref2 = null;
            hf var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            mh var8 = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            Object[] var15 = null;
            Object var16 = null;
            String var16_ref = null;
            Object var17 = null;
            java.awt.Component var17_ref = null;
            Thread var18 = null;
            int stackIn_95_0 = 0;
            int stackOut_93_0 = 0;
            int stackOut_94_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var16 = null;
                        var17 = null;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        var2_ref3 = this;
                        // monitorenter this
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        try {
                            if (!((fd) this).field_m) {
                                statePc = 5;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            // monitorexit var2_ref3
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
                            if (((fd) this).field_h != null) {
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
                            var8 = ((fd) this).field_h;
                            ((fd) this).field_h = ((fd) this).field_h.field_f;
                            if (null == ((fd) this).field_h) {
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
                            ((fd) this).field_p = null;
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
                            statePc = 2;
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
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            // monitorexit var2_ref3
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
                            // monitorexit var2_ref3
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
                            if (-2 == var2_int) {
                                statePc = 111;
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
                            if (-23 != var2_int) {
                                statePc = 24;
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
                            if ((ik.a(4) ^ -1L) <= (field_t ^ -1L)) {
                                statePc = 21;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var8.field_b = (Object) (Object) pn.a((String) var8.field_e, var8.field_g, 23155).a(-7);
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof db ? 23 : (stateCaught_21 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var3_ref = (db) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2_int == -3) {
                                statePc = 110;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (4 == var2_int) {
                                statePc = 106;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (-9 != var2_int) {
                                statePc = 33;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            var9 = (Object[]) var8.field_e;
                            if (((fd) this).field_a) {
                                statePc = 29;
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
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (((Class) var9[0]).getClassLoader() == null) {
                                statePc = 31;
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
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-10 != (var2_int ^ -1)) {
                                statePc = 40;
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
                            var10 = (Object[]) var8.field_e;
                            if (((fd) this).field_a) {
                                statePc = 36;
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
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (null == ((Class) var10[0]).getClassLoader()) {
                                statePc = 38;
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
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var8.field_b = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
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
                            if (-19 != (var2_int ^ -1)) {
                                statePc = 42;
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
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_b = (Object) (Object) var11.getContents((Object) null);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((var2_int ^ -1) != -20) {
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
                            var7 = (java.awt.datatransfer.Transferable) var8.field_e;
                            var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                            if (!((fd) this).field_a) {
                                statePc = 105;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if ((var2_int ^ -1) != -4) {
                                statePc = 50;
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
                            if ((field_t ^ -1L) < (ik.a(4) ^ -1L)) {
                                statePc = 48;
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
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var13 = (var8.field_g >> -1649452392 & 255) + "." + (255 & var8.field_g >> -1316320240) + "." + ((var8.field_g & 65502) >> -1967676120) + "." + (255 & var8.field_g);
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName(var13).getHostName();
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var2_int == -22) {
                                statePc = 102;
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
                            if (-6 != var2_int) {
                                statePc = 55;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((fd) this).field_j) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var8.field_b = (Object) (Object) ((fd) this).field_e.a(0);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var8.field_b = Class.forName("vc").getMethod("listmodes", new Class[0]).invoke(((fd) this).field_x, new Object[0]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (6 != var2_int) {
                                statePc = 59;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_b = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (!((fd) this).field_j) {
                                statePc = 58;
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
                            ((fd) this).field_e.a(var8.field_a >> -339845072, false, var8.field_g >>> 615328656, var8.field_g & 65535, var8.field_a & 65535, var14);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            Object discarded$6 = Class.forName("vc").getMethod("enter", new Class[5]).invoke(((fd) this).field_x, new Object[5]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if ((var2_int ^ -1) != -8) {
                                statePc = 63;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((fd) this).field_j) {
                                statePc = 62;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            Object discarded$7 = Class.forName("vc").getMethod("exit", new Class[0]).invoke(((fd) this).field_x, new Object[0]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            ((fd) this).field_e.a((java.awt.Frame) var8.field_e, (byte) 122);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (12 == var2_int) {
                                statePc = 101;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (-14 != (var2_int ^ -1)) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var3_ref3 = fd.a((byte) -32, "", (String) var8.field_e, field_n);
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!((fd) this).field_a) {
                                statePc = 69;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var2_int == -15) {
                                statePc = 98;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (!((fd) this).field_a) {
                                statePc = 72;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (15 == var2_int) {
                                statePc = 92;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 72;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (((fd) this).field_j) {
                                statePc = 75;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (-18 != var2_int) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var15 = (Object[]) var8.field_e;
                            Object discarded$8 = Class.forName("il").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((fd) this).field_q, new Object[5]);
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
                            if (16 == var2_int) {
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (!field_d.startsWith("win")) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 91 : (stateCaught_77 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 91 : (stateCaught_78 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 91 : (stateCaught_79 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var16_ref = (String) var8.field_e;
                            if (var16_ref.startsWith("http://")) {
                                statePc = 84;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 91 : (stateCaught_80 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (!var16_ref.startsWith("https://")) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 91 : (stateCaught_81 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 91 : (stateCaught_82 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 91 : (stateCaught_83 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 91 : (stateCaught_84 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var16_ref.length() <= var5) {
                                statePc = 89;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 91 : (stateCaught_85 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (0 != (var4_ref.indexOf((int) var16_ref.charAt(var5)) ^ -1)) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 91 : (stateCaught_86 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof Exception ? 91 : (stateCaught_87 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var5++;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 91 : (stateCaught_88 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var16_ref + "\"");
                            var8.field_b = null;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof Exception ? 91 : (stateCaught_89 instanceof ThreadDeath ? 116 : 117));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
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
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_b = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (var8.field_g == 0) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            stackOut_93_0 = 1;
                            stackIn_95_0 = stackOut_93_0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            stackOut_94_0 = 0;
                            stackIn_95_0 = stackOut_94_0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var3_int = stackIn_95_0;
                            var17_ref = (java.awt.Component) var8.field_e;
                            if (((fd) this).field_j) {
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
                            Object discarded$10 = Class.forName("il").getDeclaredMethod("showcursor", new Class[2]).invoke(((fd) this).field_q, new Object[2]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            ((fd) this).field_r.a(var3_int != 0, var17_ref, (byte) 111);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var3_int = var8.field_g;
                            var4 = var8.field_a;
                            if (((fd) this).field_j) {
                                statePc = 100;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            Object discarded$11 = Class.forName("il").getDeclaredMethod("movemouse", new Class[2]).invoke(((fd) this).field_q, new Object[2]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            ((fd) this).field_r.a(var3_int, var4, (byte) -98);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var3_ref3 = fd.a((byte) -32, field_g, (String) var8.field_e, field_n);
                            var8.field_b = (Object) (Object) var3_ref3;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (field_t <= ik.a(4)) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var8.field_b = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_e).getAddress();
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (field_t > ik.a(4)) {
                                statePc = 108;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var8.field_b = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_e).openStream());
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var18 = new Thread((Runnable) var8.field_e);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_g);
                            var8.field_b = (Object) (Object) var18;
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 116 : 117);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            if (ik.a(4) >= field_t) {
                                statePc = 113;
                            } else {
                                statePc = 112;
                            }
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
                            var8.field_b = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_e), var8.field_g);
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
                            var8.field_c = 1;
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
                        var8.field_c = 2;
                        statePc = 118;
                        continue stateLoop;
                    }
                    case 118: {
                        var2_ref3 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 119;
                        continue stateLoop;
                    }
                    case 119: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2_ref3
                            statePc = 1;
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
                            // monitorexit var2_ref3
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

    final mh a(java.net.URL param0, byte param1) {
        int var3 = -74 % ((-9 - param1) / 45);
        return this.a(0, 1, (Object) (Object) param0, 4, 0);
    }

    final mh a(byte param0) {
        if (param0 <= 121) {
            return null;
        }
        return this.a(0, 1, (Object) null, 5, 0);
    }

    private final mh a(int param0, int param1, Object param2, int param3, int param4) {
        mh var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new mh();
                    var6.field_g = param4;
                    var6.field_a = param0;
                    var6.field_d = param3;
                    var6.field_e = param2;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (null != ((fd) this).field_p) {
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
                        ((fd) this).field_h = var6;
                        ((fd) this).field_p = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        ((fd) this).field_p.field_f = var6;
                        ((fd) this).field_p = var6;
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        this.notify();
                        if (param1 == 1) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        field_t = -68L;
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

    final mh a(byte param0, int param1, Runnable param2) {
        int var4 = -20 / ((param0 - 80) / 41);
        return this.a(0, 1, (Object) (Object) param2, 2, param1);
    }

    fd(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        fg var6 = null;
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
                    ((fd) this).field_h = null;
                    ((fd) this).field_i = null;
                    ((fd) this).field_p = null;
                    ((fd) this).field_m = false;
                    ((fd) this).field_j = false;
                    ((fd) this).field_a = false;
                    ((fd) this).field_l = null;
                    ((fd) this).field_v = null;
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
                    ((fd) this).field_a = stackIn_3_1 != 0;
                    field_n = param0;
                    field_c = "1.1";
                    field_g = param1;
                    field_k = "Unknown";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_k = System.getProperty("java.vendor");
                        field_c = System.getProperty("java.version");
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
                    if ((field_k.toLowerCase().indexOf("microsoft") ^ -1) != 0) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((fd) this).field_j = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_b = System.getProperty("os.name");
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
                    field_b = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_d = field_b.toLowerCase();
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
                        field_u = System.getProperty("user.home");
                        if (field_u == null) {
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
                        field_u = field_u + "/";
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
                    if (field_u == null) {
                        statePc = 26;
                    } else {
                        statePc = 27;
                    }
                    continue stateLoop;
                }
                case 26: {
                    field_u = "~/";
                    statePc = 27;
                    continue stateLoop;
                }
                case 27: {
                    try {
                        ((fd) this).field_w = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((fd) this).field_j) {
                        statePc = 37;
                    } else {
                        statePc = 31;
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
                        field_f = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    od.a(field_n, field_g, 7154);
                    if (!((fd) this).field_a) {
                        statePc = 56;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((fd) this).field_v = new hf(od.a((String) null, 30869, "random.dat", field_n), "rw", 25L);
                    ((fd) this).field_i = new hf(od.a(0, "main_file_cache.dat2"), "rw", 314572800L);
                    ((fd) this).field_l = new hf(od.a(0, "main_file_cache.idx255"), "rw", 1048576L);
                    ((fd) this).field_o = new hf[param2];
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
                    ((fd) this).field_o[var5_int] = new hf(od.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (((fd) this).field_j) {
                        statePc = 43;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("hi").newInstance();
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 45;
                        continue stateLoop;
                    }
                }
                case 45: {
                    var5_ref = caughtException;
                    statePc = 46;
                    continue stateLoop;
                }
                case 46: {
                    try {
                        if (!((fd) this).field_j) {
                            statePc = 48;
                        } else {
                            statePc = 47;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var6 = new fg();
                        ((fd) this).field_e = var6;
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        ((fd) this).field_x = Class.forName("vc").newInstance();
                        statePc = 51;
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 50;
                        continue stateLoop;
                    }
                }
                case 50: {
                    var5_ref = caughtException;
                    statePc = 51;
                    continue stateLoop;
                }
                case 51: {
                    try {
                        if (!((fd) this).field_j) {
                            statePc = 53;
                        } else {
                            statePc = 52;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        ((fd) this).field_r = new ae();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        ((fd) this).field_q = Class.forName("il").newInstance();
                        statePc = 56;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 55;
                        continue stateLoop;
                    }
                }
                case 55: {
                    var5_ref = caughtException;
                    statePc = 56;
                    continue stateLoop;
                }
                case 56: {
                    ((fd) this).field_m = false;
                    ((fd) this).field_s = new Thread((Runnable) this);
                    ((fd) this).field_s.setPriority(10);
                    ((fd) this).field_s.setDaemon(true);
                    ((fd) this).field_s.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_t = 0L;
    }
}
