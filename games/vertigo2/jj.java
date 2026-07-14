/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class jj implements Runnable {
    java.awt.EventQueue field_j;
    private static int field_f;
    private fl field_w;
    boolean field_p;
    static String field_m;
    private wk field_b;
    private Object field_c;
    private boolean field_u;
    bj field_k;
    private wk field_s;
    private static volatile long field_l;
    private static String field_t;
    static String field_v;
    private boolean field_q;
    private Object field_g;
    private a field_i;
    bj[] field_n;
    static java.lang.reflect.Method field_e;
    static String field_d;
    bj field_o;
    private Thread field_a;
    private static String field_x;
    bj field_r;
    private static String field_h;

    private final static bj a(int param0, int param1, String param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            bj var8_ref = null;
            bj stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            bj stackOut_12_0 = null;
            L0: {
              if ((param1 ^ -1) != -34) {
                if (34 != param1) {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param2 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_t, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = param0;
            L1: while (true) {
              if (var6 < var5_array.length) {
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
                  var8_ref = new bj(new File(var7, var4), "rw", 10000L);
                  stackOut_12_0 = (bj) var8_ref;
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

    final wk b(int param0) {
        if (param0 > -105) {
            ((jj) this).field_c = null;
        }
        return this.a(0, (Object) null, 0, 5, 0);
    }

    private final wk a(int param0, Object param1, int param2, int param3, int param4) {
        wk var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param4 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    wk discarded$3 = ((jj) this).a(-30, (Class) null, (String) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new wk();
                    var6.field_a = param3;
                    var6.field_f = param1;
                    var6.field_c = param2;
                    var6.field_g = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (((jj) this).field_b == null) {
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
                        ((jj) this).field_b.field_e = var6;
                        ((jj) this).field_b = var6;
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
                        ((jj) this).field_s = var6;
                        ((jj) this).field_b = var6;
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

    final wk a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 1636602704) {
            Object var7 = null;
            wk discarded$0 = ((jj) this).a(-115, (Runnable) null, -90);
        }
        return this.a((param1 << 1636602704) - -param0, (Object) null, (param3 << 1667790544) + param2, 6, 0);
    }

    final wk a(int param0, Class param1, String param2) {
        if (param0 > -50) {
            ((jj) this).run();
        }
        return this.a(0, (Object) (Object) new Object[2], 0, 9, 0);
    }

    private final wk a(boolean param0, String param1, int param2, int param3) {
        if (param2 != 1) {
            return null;
        }
        return this.a(param3, (Object) (Object) param1, 0, param0 ? 22 : 1, 0);
    }

    final wk a(boolean param0, java.awt.Frame param1) {
        if (param0) {
            return null;
        }
        return this.a(0, (Object) (Object) param1, 0, 7, 0);
    }

    final wk a(int param0, Runnable param1, int param2) {
        if (param2 != 0) {
            return null;
        }
        return this.a(param0, (Object) (Object) param1, 0, 2, 0);
    }

    final wk a(Class[] param0, int param1, Class param2, String param3) {
        if (param1 < 29) {
            boolean discarded$0 = ((jj) this).a(38);
        }
        return this.a(0, (Object) (Object) new Object[3], 0, 8, 0);
    }

    final wk a(int param0, int param1, String param2) {
        if (param0 >= -79) {
            field_f = -84;
        }
        return this.a(false, param2, 1, param1);
    }

    final boolean a(int param0) {
        if (param0 >= -118) {
            ((jj) this).field_n = null;
        }
        if (!((jj) this).field_p) {
            return false;
        }
        if (((jj) this).field_u) {
            return ((jj) this).field_i != null ? true : false;
        }
        return null != ((jj) this).field_c ? true : false;
    }

    final wk a(int param0, java.net.URL param1) {
        int var3 = -127 % ((48 - param0) / 60);
        return this.a(0, (Object) (Object) param1, 0, 4, 0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            rg var3_ref = null;
            Exception var3_ref2 = null;
            bj var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            wk var8 = null;
            Thread var9 = null;
            java.awt.datatransfer.Clipboard var10 = null;
            java.awt.Component var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Object[] var18 = null;
            int stackIn_57_0 = 0;
            int stackOut_55_0 = 0;
            int stackOut_56_0 = 0;
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
                            if (((jj) this).field_q) {
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
                            if (null == ((jj) this).field_s) {
                                statePc = 9;
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
                            var8 = ((jj) this).field_s;
                            ((jj) this).field_s = ((jj) this).field_s.field_e;
                            if (null == ((jj) this).field_s) {
                                statePc = 8;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((jj) this).field_b = null;
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
                            var2_int = var8.field_a;
                            if (var2_int == -2) {
                                statePc = 104;
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
                            if (-23 != var2_int) {
                                statePc = 23;
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
                            if (field_l <= gk.a(61)) {
                                statePc = 20;
                            } else {
                                statePc = 19;
                            }
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
                            var8.field_d = (Object) (Object) wp.a((String) var8.field_f, (byte) -109, var8.field_g).b(640);
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof rg ? 22 : (stateCaught_20 instanceof ThreadDeath ? 110 : 111));
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
                            var3_ref = (rg) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if ((var2_int ^ -1) != -3) {
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
                            var9 = new Thread((Runnable) var8.field_f);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_g);
                            var8.field_d = (Object) (Object) var9;
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
                            if (-5 == (var2_int ^ -1)) {
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
                            if (var2_int == 8) {
                                statePc = 96;
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
                            if ((var2_int ^ -1) == -10) {
                                statePc = 91;
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
                            if (var2_int == 18) {
                                statePc = 90;
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
                            if (19 != var2_int) {
                                statePc = 31;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_f;
                            var10 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var10.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                            if (!((jj) this).field_p) {
                                statePc = 89;
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
                            if (3 == var2_int) {
                                statePc = 86;
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
                            if ((var2_int ^ -1) != -22) {
                                statePc = 37;
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
                            if ((field_l ^ -1L) >= (gk.a(101) ^ -1L)) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_f).getAddress();
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            if (var2_int == 5) {
                                statePc = 83;
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
                            if ((var2_int ^ -1) == -7) {
                                statePc = 80;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var2_int != 7) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((jj) this).field_u) {
                                statePc = 42;
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
                            Object discarded$6 = Class.forName("pa").getMethod("exit", new Class[0]).invoke(((jj) this).field_c, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((jj) this).field_i.a((java.awt.Frame) var8.field_f, 0);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if ((var2_int ^ -1) != -13) {
                                statePc = 45;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var3_ref3 = jj.a(0, field_f, field_h, (String) var8.field_f);
                            var8.field_d = (Object) (Object) var3_ref3;
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
                            if (13 != var2_int) {
                                statePc = 47;
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
                            var3_ref3 = jj.a(0, field_f, "", (String) var8.field_f);
                            var8.field_d = (Object) (Object) var3_ref3;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!((jj) this).field_p) {
                                statePc = 52;
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
                            if ((var2_int ^ -1) != -15) {
                                statePc = 52;
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
                            var3_int = var8.field_g;
                            var4_int = var8.field_c;
                            if (!((jj) this).field_u) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            ((jj) this).field_w.a(var3_int, (byte) 76, var4_int);
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
                            Object discarded$7 = Class.forName("pj").getDeclaredMethod("movemouse", new Class[2]).invoke(((jj) this).field_g, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!((jj) this).field_p) {
                                statePc = 60;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if ((var2_int ^ -1) != -16) {
                                statePc = 60;
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
                            if (var8.field_g == 0) {
                                statePc = 56;
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
                            stackOut_55_0 = 1;
                            stackIn_57_0 = stackOut_55_0;
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            stackOut_56_0 = 0;
                            stackIn_57_0 = stackOut_56_0;
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
                            var3_int = stackIn_57_0;
                            var11 = (java.awt.Component) var8.field_f;
                            if (((jj) this).field_u) {
                                statePc = 59;
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
                            Object discarded$8 = Class.forName("pj").getDeclaredMethod("showcursor", new Class[2]).invoke(((jj) this).field_g, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            ((jj) this).field_w.a(11333, var11, var3_int != 0);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            if (((jj) this).field_u) {
                                statePc = 63;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var2_int != 17) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            var12 = (Object[]) var8.field_f;
                            Object discarded$9 = Class.forName("pj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((jj) this).field_g, new Object[5]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (var2_int != 16) {
                                statePc = 79;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (!field_v.startsWith("win")) {
                                statePc = 66;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 78 : (stateCaught_64 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 67;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 78 : (stateCaught_65 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 78 : (stateCaught_66 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var13 = (String) var8.field_f;
                            if (var13.startsWith("http://")) {
                                statePc = 70;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 78 : (stateCaught_67 instanceof ThreadDeath ? 110 : 111));
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
                            statePc = (stateCaught_68 instanceof Exception ? 78 : (stateCaught_68 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 78 : (stateCaught_69 instanceof ThreadDeath ? 110 : 111));
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
                            statePc = (stateCaught_70 instanceof Exception ? 78 : (stateCaught_70 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var13.length() <= var5) {
                                statePc = 76;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 78 : (stateCaught_71 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (0 == (var4_ref.indexOf((int) var13.charAt(var5)) ^ -1)) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 78 : (stateCaught_72 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 78 : (stateCaught_73 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 78 : (stateCaught_74 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var5++;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 78 : (stateCaught_75 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_d = null;
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 78 : (stateCaught_76 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_d = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_d = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (!((jj) this).field_u) {
                                statePc = 82;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            ((jj) this).field_i.a(var8.field_g >>> 1238158800, var8.field_c & 65535, (byte) -70, var8.field_c >> -496884304, 65535 & var8.field_g, var14);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            Object discarded$11 = Class.forName("pa").getMethod("enter", new Class[5]).invoke(((jj) this).field_c, new Object[5]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (!((jj) this).field_u) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var8.field_d = (Object) (Object) ((jj) this).field_i.a((byte) -99);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var8.field_d = Class.forName("pa").getMethod("listmodes", new Class[0]).invoke(((jj) this).field_c, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (field_l <= gk.a(115)) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var15 = (var8.field_g >> -2068135208 & 255) + "." + ((16726532 & var8.field_g) >> -1798626576) + "." + (var8.field_g >> 1267688776 & 255) + "." + (var8.field_g & 255);
                            var8.field_d = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_d = (Object) (Object) var16.getContents((Object) null);
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
                            var17 = (Object[]) var8.field_f;
                            if (((jj) this).field_p) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (null != ((Class) var17[0]).getClassLoader()) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var8.field_d = (Object) (Object) ((Class) var17[0]).getDeclaredField((String) var17[1]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var18 = (Object[]) var8.field_f;
                            if (!((jj) this).field_p) {
                                statePc = 100;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (((Class) var18[0]).getClassLoader() == null) {
                                statePc = 99;
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
                            statePc = 100;
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
                            var8.field_d = (Object) (Object) ((Class) var18[0]).getDeclaredMethod((String) var18[1], (Class[]) var18[2]);
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
                            if (field_l <= gk.a(52)) {
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
                            var8.field_d = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_f).openStream());
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
                            if (field_l > gk.a(126)) {
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
                            var8.field_d = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_f), var8.field_g);
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
                            var8.field_b = 1;
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
                        var8.field_b = 2;
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

    final void a(boolean param0) {
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
                            ((jj) this).field_q = true;
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
                            if (!param0) {
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
                            ((jj) this).field_a.join();
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
                        if (null != ((jj) this).field_o) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((jj) this).field_o.a(0);
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
                        if (null == ((jj) this).field_r) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((jj) this).field_r.a(0);
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
                        if (((jj) this).field_n == null) {
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
                        if (var2_int >= ((jj) this).field_n.length) {
                            statePc = 28;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (null != ((jj) this).field_n[var2_int]) {
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
                            ((jj) this).field_n[var2_int].a(0);
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
                        if (null != ((jj) this).field_k) {
                            statePc = 30;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        try {
                            ((jj) this).field_k.a(0);
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

    jj(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        a var7 = null;
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
                    ((jj) this).field_p = false;
                    ((jj) this).field_s = null;
                    ((jj) this).field_b = null;
                    ((jj) this).field_q = false;
                    ((jj) this).field_k = null;
                    ((jj) this).field_o = null;
                    ((jj) this).field_u = false;
                    ((jj) this).field_r = null;
                    field_f = param0;
                    field_h = param1;
                    field_m = "Unknown";
                    field_d = "1.1";
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
                    ((jj) this).field_p = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_m = System.getProperty("java.vendor");
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
                    if (field_m.toLowerCase().indexOf("microsoft") == -1) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((jj) this).field_u = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_x = System.getProperty("os.name");
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
                    field_x = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_v = field_x.toLowerCase();
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
                        field_t = System.getProperty("user.home");
                        if (field_t == null) {
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
                        field_t = field_t + "/";
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
                    if (null == field_t) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_t = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((jj) this).field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((jj) this).field_u) {
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
                        field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    gq.a((byte) -110, field_h, field_f);
                    if (!((jj) this).field_p) {
                        statePc = 56;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((jj) this).field_k = new bj(gq.a(0, field_f, "random.dat", (String) null), "rw", 25L);
                    ((jj) this).field_o = new bj(gq.a("main_file_cache.dat2", -122), "rw", 314572800L);
                    ((jj) this).field_r = new bj(gq.a("main_file_cache.idx255", -121), "rw", 1048576L);
                    ((jj) this).field_n = new bj[param2];
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
                    ((jj) this).field_n[var5_int] = new bj(gq.a("main_file_cache.idx" + var5_int, -122), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (((jj) this).field_u) {
                        statePc = 43;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("hf").newInstance();
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
                        if (((jj) this).field_u) {
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
                        ((jj) this).field_c = Class.forName("pa").newInstance();
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
                        var7 = new a();
                        ((jj) this).field_i = var7;
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
                        if (((jj) this).field_u) {
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
                        ((jj) this).field_g = Class.forName("pj").newInstance();
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
                        ((jj) this).field_w = new fl();
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
                    ((jj) this).field_q = false;
                    ((jj) this).field_a = new Thread((Runnable) this);
                    ((jj) this).field_a.setPriority(10);
                    ((jj) this).field_a.setDaemon(true);
                    ((jj) this).field_a.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = 0L;
    }
}
