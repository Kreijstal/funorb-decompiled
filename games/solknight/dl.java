/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    static String field_a;
    sg field_b;
    sg field_c;
    private vj field_u;
    private nj field_m;
    private static String field_i;
    private boolean field_l;
    private static int field_o;
    private static String field_n;
    static String field_t;
    java.awt.EventQueue field_d;
    boolean field_h;
    private static volatile long field_p;
    sg[] field_v;
    private static String field_f;
    private Object field_r;
    static String field_x;
    private boolean field_k;
    private nj field_w;
    private tb field_g;
    static java.lang.reflect.Method field_e;
    private Object field_j;
    sg field_s;
    private Thread field_q;

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
                            ((dl) this).field_l = true;
                            if (param0 == 29) {
                                statePc = 3;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ((dl) this).field_d = null;
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var3 = caughtException;
                            // monitorexit var2
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 5;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        throw (RuntimeException) (Object) var3;
                    }
                    case 7: {
                        try {
                            ((dl) this).field_q.join();
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
                        if (null != ((dl) this).field_c) {
                            statePc = 12;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 12: {
                        try {
                            ((dl) this).field_c.a((byte) -5);
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
                        if (((dl) this).field_s == null) {
                            statePc = 19;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((dl) this).field_s.a((byte) -123);
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
                        if (null != ((dl) this).field_v) {
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
                        if (var2_int >= ((dl) this).field_v.length) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (null != ((dl) this).field_v[var2_int]) {
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
                            ((dl) this).field_v[var2_int].a((byte) 53);
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
                        if (null == ((dl) this).field_b) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((dl) this).field_b.a((byte) -124);
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

    private final nj a(int param0, boolean param1, String param2, int param3) {
        int var5 = 22 % ((0 - param0) / 52);
        return this.a(0, (Object) (Object) param2, param3, !param1 ? 1 : 22, -19);
    }

    final nj a(int param0, int param1, int param2, byte param3, int param4) {
        if (param3 >= 0) {
            field_o = -61;
        }
        return this.a((param2 << 1671009552) + param4, (Object) null, param1 + (param0 << -1983735696), 6, -19);
    }

    final nj a(java.net.URL param0, byte param1) {
        if (param1 != 68) {
            return null;
        }
        return this.a(0, (Object) (Object) param0, 0, 4, -19);
    }

    final nj a(byte param0, String param1, Class[] param2, Class param3) {
        if (param0 <= 93) {
            return null;
        }
        return this.a(0, (Object) (Object) new Object[3], 0, 8, -19);
    }

    final nj a(int param0) {
        if (param0 != 7721) {
            nj discarded$0 = ((dl) this).a(65);
        }
        return this.a(0, (Object) null, 0, 5, param0 + -7740);
    }

    private final nj a(int param0, Object param1, int param2, int param3, int param4) {
        nj var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new nj();
                    var6.field_a = param3;
                    var6.field_d = param2;
                    var6.field_f = param1;
                    if (param4 == -19) {
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
                    var6.field_b = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null != ((dl) this).field_m) {
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
                        ((dl) this).field_w = var6;
                        ((dl) this).field_m = var6;
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
                        ((dl) this).field_m.field_g = var6;
                        ((dl) this).field_m = var6;
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

    final nj a(String param0, int param1, int param2) {
        if (param2 != -28148) {
            return null;
        }
        return this.a(109, false, param0, param1);
    }

    final nj a(int param0, java.awt.Frame param1) {
        if (param0 <= 12) {
            return null;
        }
        return this.a(0, (Object) (Object) param1, 0, 7, -19);
    }

    private final static sg a(int param0, String param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            sg var8_ref = null;
            sg stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            sg stackOut_14_0 = null;
            L0: {
              if ((param2 ^ -1) != -34) {
                if (34 != param2) {
                  var4 = "jagex_" + param1 + "_preferences" + param3 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param1 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_n, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            if (param0 > 34) {
              var6 = 0;
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
                    var8_ref = new sg(new File(var7, var4), "rw", 10000L);
                    stackOut_14_0 = (sg) var8_ref;
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

    final nj a(int param0, int param1, Runnable param2) {
        if (param1 > -2) {
            return null;
        }
        return this.a(0, (Object) (Object) param2, param0, 2, -19);
    }

    final nj a(int param0, Class param1, String param2) {
        if (param0 != 0) {
            boolean discarded$0 = ((dl) this).b((byte) -96);
        }
        return this.a(0, (Object) (Object) new Object[2], 0, 9, -19);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            Object var2_ref3 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            cb var3_ref = null;
            Exception var3_ref2 = null;
            sg var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            nj var8 = null;
            Thread var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            java.awt.Frame var14 = null;
            java.awt.Component var15 = null;
            Object[] var16 = null;
            Object var17 = null;
            String var17_ref = null;
            java.awt.datatransfer.Clipboard var18 = null;
            int stackIn_73_0 = 0;
            int stackOut_71_0 = 0;
            int stackOut_72_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
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
                            if (!((dl) this).field_l) {
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
                            if (((dl) this).field_w != null) {
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
                            var8 = ((dl) this).field_w;
                            ((dl) this).field_w = ((dl) this).field_w.field_g;
                            if (((dl) this).field_w == null) {
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
                            ((dl) this).field_m = null;
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
                            var4 = caughtException;
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
                        throw (RuntimeException) (Object) var4;
                    }
                    case 17: {
                        try {
                            var2_int = var8.field_a;
                            if (var2_int == 1) {
                                statePc = 105;
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
                            if (-23 != (var2_int ^ -1)) {
                                statePc = 25;
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
                            if (je.a(1) < field_p) {
                                statePc = 21;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var8.field_e = (Object) (Object) rg.a((String) var8.field_f, var8.field_d, 2525).a((byte) -93);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof cb ? 24 : (stateCaught_22 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var3_ref = (cb) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (2 != var2_int) {
                                statePc = 27;
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
                            var9 = new Thread((Runnable) var8.field_f);
                            var9.setDaemon(true);
                            var9.start();
                            var9.setPriority(var8.field_d);
                            var8.field_e = (Object) (Object) var9;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (4 != var2_int) {
                                statePc = 31;
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
                            if (je.a(1) >= field_p) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_f).openStream());
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
                            if (8 != var2_int) {
                                statePc = 37;
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
                            var10 = (Object[]) var8.field_f;
                            if (((dl) this).field_h) {
                                statePc = 34;
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
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 110 : 111);
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
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredMethod((String) var10[1], (Class[]) var10[2]);
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
                            if ((var2_int ^ -1) != -10) {
                                statePc = 43;
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
                            var11 = (Object[]) var8.field_f;
                            if (((dl) this).field_h) {
                                statePc = 40;
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
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (((Class) var11[0]).getClassLoader() != null) {
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
                            throw new SecurityException();
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var8.field_e = (Object) (Object) ((Class) var11[0]).getDeclaredField((String) var11[1]);
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
                            if (-19 == var2_int) {
                                statePc = 104;
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
                            if (-20 != var2_int) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_f;
                            var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (!((dl) this).field_h) {
                                statePc = 103;
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
                            if (var2_int != 3) {
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
                            if ((field_p ^ -1L) >= (je.a(1) ^ -1L)) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            var13 = (var8.field_d >> 1249496 & 255) + "." + ((16723280 & var8.field_d) >> -1416988272) + "." + ((var8.field_d & 65382) >> 457425544) + "." + (var8.field_d & 255);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var13).getHostName();
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
                            if ((var2_int ^ -1) != -22) {
                                statePc = 55;
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
                            if (je.a(1) >= field_p) {
                                statePc = 54;
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
                            throw new IOException();
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_f).getAddress();
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (5 == var2_int) {
                                statePc = 100;
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
                            if (-7 != (var2_int ^ -1)) {
                                statePc = 60;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (((dl) this).field_k) {
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
                            Object discarded$6 = Class.forName("bd").getMethod("enter", new Class[5]).invoke(((dl) this).field_j, new Object[5]);
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
                            ((dl) this).field_u.a(65535 & var8.field_b, var14, var8.field_d >>> 470708304, -32, var8.field_b >> 1503561424, 65535 & var8.field_d);
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
                            if (7 == var2_int) {
                                statePc = 97;
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
                            if (12 == var2_int) {
                                statePc = 96;
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
                            if (-14 == (var2_int ^ -1)) {
                                statePc = 95;
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
                            if (!((dl) this).field_h) {
                                statePc = 68;
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
                            if ((var2_int ^ -1) != -15) {
                                statePc = 68;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var3_int = var8.field_d;
                            var4_int = var8.field_b;
                            if (((dl) this).field_k) {
                                statePc = 67;
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
                            Object discarded$7 = Class.forName("cc").getDeclaredMethod("movemouse", new Class[2]).invoke(((dl) this).field_r, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            ((dl) this).field_g.a(var3_int, var4_int, 0);
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
                            if (!((dl) this).field_h) {
                                statePc = 76;
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
                            if (15 != var2_int) {
                                statePc = 76;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (0 == var8.field_d) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            stackOut_71_0 = 1;
                            stackIn_73_0 = stackOut_71_0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            stackOut_72_0 = 0;
                            stackIn_73_0 = stackOut_72_0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var3_int = stackIn_73_0;
                            var15 = (java.awt.Component) var8.field_f;
                            if (((dl) this).field_k) {
                                statePc = 75;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            Object discarded$8 = Class.forName("cc").getDeclaredMethod("showcursor", new Class[2]).invoke(((dl) this).field_r, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            ((dl) this).field_g.a(var3_int != 0, var15, (byte) -55);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (((dl) this).field_k) {
                                statePc = 79;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if ((var2_int ^ -1) != -18) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var16 = (Object[]) var8.field_f;
                            Object discarded$9 = Class.forName("cc").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((dl) this).field_r, new Object[5]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (-17 == (var2_int ^ -1)) {
                                statePc = 81;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (field_t.startsWith("win")) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 94 : (stateCaught_81 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 94 : (stateCaught_82 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var17_ref = (String) var8.field_f;
                            if (var17_ref.startsWith("http://")) {
                                statePc = 87;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 94 : (stateCaught_83 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (!var17_ref.startsWith("https://")) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 94 : (stateCaught_84 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 94 : (stateCaught_85 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 94 : (stateCaught_86 instanceof ThreadDeath ? 110 : 111));
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
                            statePc = (stateCaught_87 instanceof Exception ? 94 : (stateCaught_87 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (var17_ref.length() <= var5) {
                                statePc = 92;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 94 : (stateCaught_88 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (-1 != var4_ref.indexOf((int) var17_ref.charAt(var5))) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof Exception ? 94 : (stateCaught_89 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof Exception ? 94 : (stateCaught_90 instanceof ThreadDeath ? 110 : 111));
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
                            statePc = (stateCaught_91 instanceof Exception ? 94 : (stateCaught_91 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var17_ref + "\"");
                            var8.field_e = null;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof Exception ? 94 : (stateCaught_92 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
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
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var3_ref3 = dl.a(93, "", field_o, (String) var8.field_f);
                            var8.field_e = (Object) (Object) var3_ref3;
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
                            var3_ref3 = dl.a(92, field_i, field_o, (String) var8.field_f);
                            var8.field_e = (Object) (Object) var3_ref3;
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
                            if (((dl) this).field_k) {
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
                            Object discarded$11 = Class.forName("bd").getMethod("exit", new Class[0]).invoke(((dl) this).field_j, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            ((dl) this).field_u.a(-16, (java.awt.Frame) var8.field_f);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (!((dl) this).field_k) {
                                statePc = 102;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var8.field_e = (Object) (Object) ((dl) this).field_u.a((byte) -63);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var8.field_e = Class.forName("bd").getMethod("listmodes", new Class[0]).invoke(((dl) this).field_j, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var18 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var18.getContents((Object) null);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if ((field_p ^ -1L) >= (je.a(1) ^ -1L)) {
                                statePc = 107;
                            } else {
                                statePc = 106;
                            }
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
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_f), var8.field_d);
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
                            var8.field_c = 1;
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
                        var8.field_c = 2;
                        statePc = 112;
                        continue stateLoop;
                    }
                    case 112: {
                        var2_ref3 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 113;
                        continue stateLoop;
                    }
                    case 113: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2_ref3
                            statePc = 1;
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
                            // monitorexit var2_ref3
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

    final boolean b(byte param0) {
        if (!(((dl) this).field_h)) {
            return false;
        }
        int var2 = -56 % ((-65 - param0) / 48);
        if (!((dl) this).field_k) {
            return ((dl) this).field_j != null ? true : false;
        }
        return null != ((dl) this).field_u ? true : false;
    }

    dl(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        vj var6 = null;
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
                    ((dl) this).field_c = null;
                    ((dl) this).field_b = null;
                    ((dl) this).field_m = null;
                    ((dl) this).field_k = false;
                    ((dl) this).field_s = null;
                    ((dl) this).field_w = null;
                    ((dl) this).field_h = false;
                    ((dl) this).field_l = false;
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
                    ((dl) this).field_h = stackIn_3_1 != 0;
                    field_x = "1.1";
                    field_a = "Unknown";
                    field_i = param1;
                    field_o = param0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_a = System.getProperty("java.vendor");
                        field_x = System.getProperty("java.version");
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
                    if (field_a.toLowerCase().indexOf("microsoft") != -1) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((dl) this).field_k = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_f = System.getProperty("os.name");
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
                    field_f = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_t = field_f.toLowerCase();
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
                        field_n = System.getProperty("user.home");
                        if (field_n == null) {
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
                        field_n = field_n + "/";
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
                    if (null != field_n) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_n = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((dl) this).field_d = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((dl) this).field_k) {
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
                        field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    nd.a(field_i, field_o, (byte) -115);
                    if (!((dl) this).field_h) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((dl) this).field_b = new sg(nd.a((String) null, "random.dat", field_o, (byte) -75), "rw", 25L);
                    ((dl) this).field_c = new sg(nd.a("main_file_cache.dat2", -19154), "rw", 314572800L);
                    ((dl) this).field_s = new sg(nd.a("main_file_cache.idx255", -19154), "rw", 1048576L);
                    ((dl) this).field_v = new sg[param2];
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
                    ((dl) this).field_v[var5_int] = new sg(nd.a("main_file_cache.idx" + var5_int, -19154), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((dl) this).field_k) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("tf").newInstance();
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
                        if (((dl) this).field_k) {
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
                        ((dl) this).field_j = Class.forName("bd").newInstance();
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
                        var6 = new vj();
                        ((dl) this).field_u = var6;
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
                        if (!((dl) this).field_k) {
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
                        ((dl) this).field_g = new tb();
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
                        ((dl) this).field_r = Class.forName("cc").newInstance();
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
                    ((dl) this).field_l = false;
                    ((dl) this).field_q = new Thread((Runnable) this);
                    ((dl) this).field_q.setPriority(10);
                    ((dl) this).field_q.setDaemon(true);
                    ((dl) this).field_q.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = 0L;
    }
}
