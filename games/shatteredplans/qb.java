/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qb implements Runnable {
    ra[] field_p;
    private static int field_h;
    java.awt.EventQueue field_q;
    private Object field_t;
    static String field_r;
    ra field_a;
    static String field_b;
    boolean field_w;
    ra field_n;
    private Object field_o;
    ra field_k;
    private static String field_x;
    private fn field_c;
    private static volatile long field_u;
    private Thread field_j;
    static java.lang.reflect.Method field_v;
    private pb field_l;
    static String field_i;
    private boolean field_g;
    private static String field_s;
    private boolean field_e;
    private pb field_f;
    private pp field_m;
    private static String field_d;

    private final pb a(int param0, boolean param1, String param2, int param3) {
        if (param3 > -96) {
            return null;
        }
        return this.a(param0, !param1 ? 1 : 22, (Object) (Object) param2, (byte) -120, 0);
    }

    final pb a(Class[] param0, String param1, int param2, Class param3) {
        if (param2 < 72) {
            field_d = null;
        }
        return this.a(0, 8, (Object) (Object) new Object[3], (byte) -122, 0);
    }

    final pb a(boolean param0, int param1, Runnable param2) {
        if (!param0) {
            return null;
        }
        return this.a(param1, 2, (Object) (Object) param2, (byte) -100, 0);
    }

    final pb a(int param0, int param1, String param2) {
        if (param0 != 65535) {
            ((qb) this).field_e = true;
        }
        return this.a(param1, false, param2, param0 ^ -65434);
    }

    final pb a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != -1194) {
            ((qb) this).field_k = null;
        }
        return this.a(param1 + (param2 << -1226382192), 6, (Object) null, (byte) 47, (param3 << -1078131920) + param0);
    }

    final boolean a(boolean param0) {
        if (param0) {
            Object var3 = null;
            ra discarded$0 = qb.a((String) null, -128, (String) null, true);
        }
        if (!(((qb) this).field_w)) {
            return false;
        }
        if (((qb) this).field_g) {
            return ((qb) this).field_c != null ? true : false;
        }
        return null != ((qb) this).field_t ? true : false;
    }

    final pb a(java.net.URL param0, boolean param1) {
        if (param1) {
            Object var4 = null;
            pb discarded$0 = this.a(-90, true, (String) null, -75);
        }
        return this.a(0, 4, (Object) (Object) param0, (byte) 92, 0);
    }

    private final pb a(int param0, int param1, Object param2, byte param3, int param4) {
        pb var6 = null;
        Object var7 = null;
        int var8 = 0;
        Throwable var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new pb();
                    var6.field_a = param4;
                    var6.field_b = param2;
                    var6.field_c = param1;
                    var6.field_g = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((qb) this).field_f != null) {
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
                        ((qb) this).field_l = var6;
                        ((qb) this).field_f = var6;
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
                        ((qb) this).field_f.field_f = var6;
                        ((qb) this).field_f = var6;
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
                        var8 = 14 / ((param3 - -38) / 62);
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

    private final static ra a(String param0, int param1, String param2, boolean param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            ra var8_ref = null;
            ra stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            ra stackOut_13_0 = null;
            L0: {
              if (param1 != 33) {
                if (-35 != (param1 ^ -1)) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_d, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param3) {
                break L1;
              } else {
                field_v = null;
                break L1;
              }
            }
            var6 = 0;
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7 = var5_array[var6];
                  if (var7.length() <= 0) {
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
                  var8_ref = new ra(new File(var7, var4), "rw", 10000L);
                  stackOut_13_0 = (ra) var8_ref;
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

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            lg var3_ref2 = null;
            ra var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            pb var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            String var11 = null;
            Object[] var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Object[] var18 = null;
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
                            if (((qb) this).field_e) {
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
                            if (((qb) this).field_l != null) {
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
                            var8 = ((qb) this).field_l;
                            ((qb) this).field_l = ((qb) this).field_l.field_f;
                            if (((qb) this).field_l == null) {
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
                            ((qb) this).field_f = null;
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
                            var2_int = var8.field_c;
                            if (1 != var2_int) {
                                statePc = 22;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (pr.a(14274) < field_u) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_b), var8.field_g);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2_int == 22) {
                                statePc = 111;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_int != 2) {
                                statePc = 25;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var9 = new Thread((Runnable) var8.field_b);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_g);
                            var8.field_e = (Object) (Object) var9;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if ((var2_int ^ -1) != -5) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((field_u ^ -1L) < (pr.a(14274) ^ -1L)) {
                                statePc = 28;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_b).openStream());
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (-9 == (var2_int ^ -1)) {
                                statePc = 105;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (9 != var2_int) {
                                statePc = 37;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var10 = (Object[]) var8.field_b;
                            if (((qb) this).field_w) {
                                statePc = 34;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (null != ((Class) var10[0]).getClassLoader()) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var2_int == -19) {
                                statePc = 104;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-20 == var2_int) {
                                statePc = 103;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (!((qb) this).field_w) {
                                statePc = 102;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (3 == var2_int) {
                                statePc = 98;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (-22 != (var2_int ^ -1)) {
                                statePc = 45;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if ((pr.a(14274) ^ -1L) <= (field_u ^ -1L)) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_b).getAddress();
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var2_int == 5) {
                                statePc = 95;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (-7 == (var2_int ^ -1)) {
                                statePc = 92;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (var2_int == 7) {
                                statePc = 89;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (12 != var2_int) {
                                statePc = 50;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3_ref3 = qb.a((String) var8.field_b, field_h, field_s, true);
                            var8.field_e = (Object) (Object) var3_ref3;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if ((var2_int ^ -1) != -14) {
                                statePc = 52;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var3_ref3 = qb.a((String) var8.field_b, field_h, "", true);
                            var8.field_e = (Object) (Object) var3_ref3;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((qb) this).field_w) {
                                statePc = 55;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (14 == var2_int) {
                                statePc = 86;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (!((qb) this).field_w) {
                                statePc = 58;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (var2_int == 15) {
                                statePc = 80;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((qb) this).field_g) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (var2_int == 17) {
                                statePc = 79;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if ((var2_int ^ -1) != -17) {
                                statePc = 78;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (!field_b.startsWith("win")) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 77 : (stateCaught_63 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 77 : (stateCaught_64 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 77 : (stateCaught_65 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            var11 = (String) var8.field_b;
                            if (var11.startsWith("http://")) {
                                statePc = 69;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 77 : (stateCaught_66 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            if (var11.startsWith("https://")) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 77 : (stateCaught_67 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 77 : (stateCaught_68 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 77 : (stateCaught_69 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var5 >= var11.length()) {
                                statePc = 75;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 77 : (stateCaught_70 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (0 == (var4_ref.indexOf((int) var11.charAt(var5)) ^ -1)) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 77 : (stateCaught_71 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 77 : (stateCaught_72 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 77 : (stateCaught_73 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var5++;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 77 : (stateCaught_74 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            Process discarded$6 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var11 + "\"");
                            var8.field_e = null;
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 77 : (stateCaught_75 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var12 = (Object[]) var8.field_b;
                            Object discarded$7 = Class.forName("lj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((qb) this).field_o, new Object[5]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            if (var8.field_g == 0) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 119 : 120);
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
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 119 : 120);
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
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var3_int = stackIn_83_0;
                            var13 = (java.awt.Component) var8.field_b;
                            if (!((qb) this).field_g) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((qb) this).field_m.a(var3_int != 0, var13, 0);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Object discarded$8 = Class.forName("lj").getDeclaredMethod("showcursor", new Class[2]).invoke(((qb) this).field_o, new Object[2]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var3_int = var8.field_g;
                            var4 = var8.field_a;
                            if (((qb) this).field_g) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            Object discarded$9 = Class.forName("lj").getDeclaredMethod("movemouse", new Class[2]).invoke(((qb) this).field_o, new Object[2]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            ((qb) this).field_m.a(var3_int, -4, var4);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (((qb) this).field_g) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            Object discarded$10 = Class.forName("ic").getMethod("exit", new Class[0]).invoke(((qb) this).field_t, new Object[0]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            ((qb) this).field_c.a(0, (java.awt.Frame) var8.field_b);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (!((qb) this).field_g) {
                                statePc = 94;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            ((qb) this).field_c.a(var14, 65535 & var8.field_a, var8.field_g >>> 1266773072, 65535 & var8.field_g, var8.field_a >> 813690320, 0);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            Object discarded$11 = Class.forName("ic").getMethod("enter", new Class[5]).invoke(((qb) this).field_t, new Object[5]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (!((qb) this).field_g) {
                                statePc = 97;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var8.field_e = (Object) (Object) ((qb) this).field_c.a(-19750);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var8.field_e = Class.forName("ic").getMethod("listmodes", new Class[0]).invoke(((qb) this).field_t, new Object[0]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (pr.a(14274) < field_u) {
                                statePc = 100;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var15 = (255 & var8.field_g >> -687229096) + "." + ((16756253 & var8.field_g) >> -97451440) + "." + ((var8.field_g & 65287) >> -483633272) + "." + (255 & var8.field_g);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_b;
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var17.getContents((Object) null);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var18 = (Object[]) var8.field_b;
                            if (((qb) this).field_w) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (null == ((Class) var18[0]).getClassLoader()) {
                                statePc = 109;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            if (field_u > pr.a(14274)) {
                                statePc = 113;
                            } else {
                                statePc = 112;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var8.field_e = (Object) (Object) ho.a(var8.field_g, -4276, (String) var8.field_b).b(-10463);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof lg ? 116 : (stateCaught_114 instanceof ThreadDeath ? 119 : 120));
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            var3_ref2 = (lg) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            var8.field_d = 1;
                            statePc = 121;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = (stateCaught_117 instanceof ThreadDeath ? 119 : 120);
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 120: {
                        var2_ref2 = caughtException;
                        var8.field_d = 2;
                        statePc = 121;
                        continue stateLoop;
                    }
                    case 121: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 122;
                        continue stateLoop;
                    }
                    case 122: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_122) {
                            caughtException = stateCaught_122;
                            statePc = 124;
                            continue stateLoop;
                        }
                    }
                    case 124: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 125;
                            continue stateLoop;
                        } catch (Throwable stateCaught_124) {
                            caughtException = stateCaught_124;
                            statePc = 124;
                            continue stateLoop;
                        }
                    }
                    case 125: {
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

    final void b(int param0) {
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
                            ((qb) this).field_e = true;
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
                        if (param0 >= 55) {
                            statePc = 7;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            ((qb) this).field_j.join();
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
                        if (null != ((qb) this).field_k) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((qb) this).field_k.c(10);
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
                        if (((qb) this).field_n == null) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((qb) this).field_n.c(10);
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
                        if (null != ((qb) this).field_p) {
                            statePc = 21;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        var2_int = 0;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        if (var2_int >= ((qb) this).field_p.length) {
                            statePc = 29;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (((qb) this).field_p[var2_int] != null) {
                            statePc = 26;
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
                    case 26: {
                        try {
                            ((qb) this).field_p[var2_int].c(10);
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
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 28: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 29: {
                        if (null != ((qb) this).field_a) {
                            statePc = 31;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    }
                    case 31: {
                        try {
                            ((qb) this).field_a.c(10);
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

    final pb a(java.awt.Frame param0, byte param1) {
        if (param1 <= 119) {
            ((qb) this).field_k = null;
        }
        return this.a(0, 7, (Object) (Object) param0, (byte) 55, 0);
    }

    final pb a(int param0) {
        if (param0 != 12) {
            return null;
        }
        return this.a(0, 5, (Object) null, (byte) -110, 0);
    }

    final pb a(Class param0, byte param1, String param2) {
        if (param1 <= 24) {
            boolean discarded$0 = ((qb) this).a(false);
        }
        return this.a(0, 9, (Object) (Object) new Object[2], (byte) -110, 0);
    }

    qb(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        fn var7 = null;
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
                    ((qb) this).field_w = false;
                    ((qb) this).field_n = null;
                    ((qb) this).field_k = null;
                    ((qb) this).field_a = null;
                    ((qb) this).field_l = null;
                    ((qb) this).field_e = false;
                    ((qb) this).field_g = false;
                    ((qb) this).field_f = null;
                    field_r = "Unknown";
                    field_s = param1;
                    field_h = param0;
                    field_i = "1.1";
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
                    ((qb) this).field_w = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_r = System.getProperty("java.vendor");
                        field_i = System.getProperty("java.version");
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
                    if (-1 != field_r.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((qb) this).field_g = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_x = System.getProperty("os.name");
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
                    field_x = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_b = field_x.toLowerCase();
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
                        ((qb) this).field_q = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((qb) this).field_g) {
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
                        field_v = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    ug.a(field_h, field_s, (byte) 116);
                    if (!((qb) this).field_w) {
                        statePc = 57;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((qb) this).field_a = new ra(ug.a("random.dat", field_h, -18261, (String) null), "rw", 25L);
                    ((qb) this).field_k = new ra(ug.a("main_file_cache.dat2", false), "rw", 314572800L);
                    ((qb) this).field_n = new ra(ug.a("main_file_cache.idx255", false), "rw", 1048576L);
                    ((qb) this).field_p = new ra[param2];
                    var5_int = 0;
                    statePc = 40;
                    continue stateLoop;
                }
                case 40: {
                    if (param2 <= var5_int) {
                        statePc = 42;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    ((qb) this).field_p[var5_int] = new ra(ug.a("main_file_cache.idx" + var5_int, false), "rw", 1048576L);
                    var5_int++;
                    statePc = 40;
                    continue stateLoop;
                }
                case 42: {
                    if (((qb) this).field_g) {
                        statePc = 44;
                    } else {
                        statePc = 47;
                    }
                    continue stateLoop;
                }
                case 44: {
                    try {
                        Object discarded$7 = Class.forName("mo").newInstance();
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
                        if (((qb) this).field_g) {
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
                        ((qb) this).field_t = Class.forName("ic").newInstance();
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
                        var7 = new fn();
                        ((qb) this).field_c = var7;
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
                        if (!((qb) this).field_g) {
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
                        ((qb) this).field_m = new pp();
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
                        ((qb) this).field_o = Class.forName("lj").newInstance();
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
                    ((qb) this).field_e = false;
                    ((qb) this).field_j = new Thread((Runnable) this);
                    ((qb) this).field_j.setPriority(10);
                    ((qb) this).field_j.setDaemon(true);
                    ((qb) this).field_j.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = 0L;
    }
}
