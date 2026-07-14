/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bl implements Runnable {
    private boolean field_s;
    private static String field_a;
    private mb field_v;
    private static String field_p;
    static String field_r;
    private static int field_l;
    java.awt.EventQueue field_x;
    pf field_b;
    private w field_k;
    private boolean field_i;
    boolean field_o;
    private static volatile long field_w;
    static String field_t;
    static String field_n;
    pf[] field_c;
    private Thread field_h;
    private static String field_f;
    pf field_d;
    private il field_q;
    private Object field_u;
    pf field_m;
    private il field_j;
    private Object field_e;
    static java.lang.reflect.Method field_g;

    final il a(int param0, java.net.URL param1) {
        if (param0 <= 96) {
            return null;
        }
        return this.a(0, 4, (Object) (Object) param1, 0, 0);
    }

    final il a(String param0, int param1, int param2) {
        int var4 = -60 / ((param2 - -13) / 39);
        return this.a(param0, -122, param1, false);
    }

    final boolean a(int param0) {
        int stackIn_9_0 = 0;
        int stackIn_13_0 = 0;
        int stackOut_12_0 = 0;
        int stackOut_11_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_7_0 = 0;
        if (!((bl) this).field_o) {
          return false;
        } else {
          if (param0 == -20) {
            if (!((bl) this).field_s) {
              L0: {
                if (((bl) this).field_e == null) {
                  stackOut_12_0 = 0;
                  stackIn_13_0 = stackOut_12_0;
                  break L0;
                } else {
                  stackOut_11_0 = 1;
                  stackIn_13_0 = stackOut_11_0;
                  break L0;
                }
              }
              return stackIn_13_0 != 0;
            } else {
              L1: {
                if (null == ((bl) this).field_v) {
                  stackOut_8_0 = 0;
                  stackIn_9_0 = stackOut_8_0;
                  break L1;
                } else {
                  stackOut_7_0 = 1;
                  stackIn_9_0 = stackOut_7_0;
                  break L1;
                }
              }
              return stackIn_9_0 != 0;
            }
          } else {
            return false;
          }
        }
    }

    final il a(Runnable param0, int param1, byte param2) {
        int var4 = 67 % ((param2 - -62) / 51);
        return this.a(0, 2, (Object) (Object) param0, param1, 0);
    }

    final il a(byte param0) {
        if (param0 > -77) {
            ((bl) this).field_u = null;
        }
        return this.a(0, 5, (Object) null, 0, 0);
    }

    final void b(byte param0) {
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
                            ((bl) this).field_i = true;
                            if (param0 > 50) {
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
                            il discarded$1 = ((bl) this).a((byte) 40);
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
                            ((bl) this).field_h.join();
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
                        if (null == ((bl) this).field_d) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((bl) this).field_d.c(127);
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
                        if (null == ((bl) this).field_b) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((bl) this).field_b.c(-59);
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
                        if (((bl) this).field_c == null) {
                            statePc = 27;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        var2_int = 0;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 20: {
                        if (((bl) this).field_c.length <= var2_int) {
                            statePc = 27;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        if (null != ((bl) this).field_c[var2_int]) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        var2_int++;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 24: {
                        try {
                            ((bl) this).field_c[var2_int].c(108);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 26;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        var2_int++;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 26: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 20;
                        continue stateLoop;
                    }
                    case 27: {
                        if (null != ((bl) this).field_m) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((bl) this).field_m.c(119);
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

    final il a(Class param0, String param1, byte param2) {
        if (param2 != 14) {
            Object var5 = null;
            il discarded$0 = this.a((String) null, 80, -32, false);
        }
        return this.a(0, 9, (Object) (Object) new Object[2], 0, 0);
    }

    final il a(java.awt.Frame param0, byte param1) {
        int var3 = -63 % ((-42 - param1) / 41);
        return this.a(0, 7, (Object) (Object) param0, 0, 0);
    }

    private final static pf a(String param0, byte param1, String param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            pf var8_ref = null;
            pf stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            pf stackOut_14_0 = null;
            var7_ref = null;
            L0: {
              if (33 == param3) {
                var4 = "jagex_" + param0 + "_preferences" + param2 + "_rc.dat";
                break L0;
              } else {
                if (-35 == (param3 ^ -1)) {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param2 + ".dat";
                  break L0;
                }
              }
            }
            if (param1 == -77) {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_f, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              L1: while (true) {
                if (var5_array.length > var6) {
                  L2: {
                    var7_ref = var5_array[var6];
                    if (var7_ref.length() <= 0) {
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
                    var8_ref = new pf(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (pf) var8_ref;
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

    final il a(int param0, int param1, int param2, int param3, int param4) {
        if (param3 != 0) {
            ((bl) this).field_j = null;
        }
        return this.a(param2 + (param4 << -246695856), 6, (Object) null, (param0 << 1597502544) - -param1, 0);
    }

    final il a(String param0, Class param1, Class[] param2, byte param3) {
        if (param3 != -39) {
            field_w = 95L;
        }
        return this.a(0, 8, (Object) (Object) new Object[3], 0, 0);
    }

    private final il a(String param0, int param1, int param2, boolean param3) {
        if (param1 >= -120) {
            field_n = null;
        }
        return this.a(0, !param3 ? 1 : 22, (Object) (Object) param0, param2, 0);
    }

    private final il a(int param0, int param1, Object param2, int param3, int param4) {
        il var6 = null;
        Object var7 = null;
        Throwable var8 = null;
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
                    return null;
                }
                case 2: {
                    var6 = new il();
                    var6.field_e = param1;
                    var6.field_d = param2;
                    var6.field_a = param3;
                    var6.field_f = param0;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null != ((bl) this).field_j) {
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
                        ((bl) this).field_q = var6;
                        ((bl) this).field_j = var6;
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
                        ((bl) this).field_j.field_c = var6;
                        ((bl) this).field_j = var6;
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
            qk var3_ref = null;
            Exception var3_ref2 = null;
            pf var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            il var8 = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.Frame var12 = null;
            java.awt.Component var13 = null;
            String var14 = null;
            Object[] var15 = null;
            String var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_80_0 = 0;
            int stackOut_78_0 = 0;
            int stackOut_79_0 = 0;
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
                            if (!((bl) this).field_i) {
                                statePc = 4;
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
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (null != ((bl) this).field_q) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var8 = ((bl) this).field_q;
                            ((bl) this).field_q = ((bl) this).field_q.field_c;
                            if (null == ((bl) this).field_q) {
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
                            ((bl) this).field_j = null;
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
                            var2_int = var8.field_e;
                            if (-2 != (var2_int ^ -1)) {
                                statePc = 20;
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
                            if ((field_w ^ -1L) >= (la.a(false) ^ -1L)) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_d), var8.field_a);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var2_int != 22) {
                                statePc = 27;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((la.a(false) ^ -1L) > (field_w ^ -1L)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var8.field_g = (Object) (Object) el.a((String) var8.field_d, var8.field_a, (byte) 58).a(true);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof qk ? 26 : (stateCaught_24 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var3_ref = (qk) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var2_int == 2) {
                                statePc = 107;
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
                            if (4 != var2_int) {
                                statePc = 32;
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
                            if (field_w <= la.a(false)) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var8.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_d).openStream());
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (8 != var2_int) {
                                statePc = 39;
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
                            var9 = (Object[]) var8.field_d;
                            if (((bl) this).field_o) {
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
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (((Class) var9[0]).getClassLoader() == null) {
                                statePc = 37;
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
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (var2_int != 9) {
                                statePc = 45;
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
                            var10 = (Object[]) var8.field_d;
                            if (((bl) this).field_o) {
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
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (null != ((Class) var10[0]).getClassLoader()) {
                                statePc = 44;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
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
                            if (-19 == (var2_int ^ -1)) {
                                statePc = 106;
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
                            if ((var2_int ^ -1) != -20) {
                                statePc = 48;
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
                            var7 = (java.awt.datatransfer.Transferable) var8.field_d;
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var11.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (!((bl) this).field_o) {
                                statePc = 105;
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
                            if (var2_int == 3) {
                                statePc = 102;
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
                            if (var2_int != 21) {
                                statePc = 54;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (field_w <= la.a(false)) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_d).getAddress();
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if ((var2_int ^ -1) != -6) {
                                statePc = 58;
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
                            if (((bl) this).field_s) {
                                statePc = 57;
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
                            var8.field_g = Class.forName("ve").getMethod("listmodes", new Class[0]).invoke(((bl) this).field_e, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            var8.field_g = (Object) (Object) ((bl) this).field_v.a(0);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (-7 != (var2_int ^ -1)) {
                                statePc = 62;
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
                            var12 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_g = (Object) (Object) var12;
                            var12.setResizable(false);
                            if (((bl) this).field_s) {
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
                            Object discarded$6 = Class.forName("ve").getMethod("enter", new Class[5]).invoke(((bl) this).field_e, new Object[5]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            ((bl) this).field_v.a(65535 & var8.field_f, var8.field_a >>> -147600336, var8.field_f >> 438819344, -16, 65535 & var8.field_a, var12);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (var2_int != 7) {
                                statePc = 66;
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
                            if (!((bl) this).field_s) {
                                statePc = 65;
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
                            ((bl) this).field_v.a(7537, (java.awt.Frame) var8.field_d);
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
                            Object discarded$7 = Class.forName("ve").getMethod("exit", new Class[0]).invoke(((bl) this).field_e, new Object[0]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if ((var2_int ^ -1) != -13) {
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
                            var3_ref3 = bl.a(field_p, (byte) -77, (String) var8.field_d, field_l);
                            var8.field_g = (Object) (Object) var3_ref3;
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
                            if (13 != var2_int) {
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
                            var3_ref3 = bl.a("", (byte) -77, (String) var8.field_d, field_l);
                            var8.field_g = (Object) (Object) var3_ref3;
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (!((bl) this).field_o) {
                                statePc = 75;
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
                            if (var2_int != 14) {
                                statePc = 75;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var3_int = var8.field_a;
                            var4_int = var8.field_f;
                            if (((bl) this).field_s) {
                                statePc = 74;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            Object discarded$8 = Class.forName("tj").getDeclaredMethod("movemouse", new Class[2]).invoke(((bl) this).field_u, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            ((bl) this).field_k.a(var3_int, 1, var4_int);
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
                            if (!((bl) this).field_o) {
                                statePc = 83;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (15 != var2_int) {
                                statePc = 83;
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
                            if (var8.field_a == 0) {
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
                            stackOut_78_0 = 1;
                            stackIn_80_0 = stackOut_78_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            stackOut_79_0 = 0;
                            stackIn_80_0 = stackOut_79_0;
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var3_int = stackIn_80_0;
                            var13 = (java.awt.Component) var8.field_d;
                            if (!((bl) this).field_s) {
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
                            ((bl) this).field_k.a((byte) -126, var13, var3_int != 0);
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
                            Object discarded$9 = Class.forName("tj").getDeclaredMethod("showcursor", new Class[2]).invoke(((bl) this).field_u, new Object[2]);
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
                            if (((bl) this).field_s) {
                                statePc = 86;
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
                            if (-18 == (var2_int ^ -1)) {
                                statePc = 101;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (16 == var2_int) {
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            if (field_r.startsWith("win")) {
                                statePc = 90;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 100 : (stateCaught_88 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof Exception ? 100 : (stateCaught_89 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var14 = (String) var8.field_d;
                            if (var14.startsWith("http://")) {
                                statePc = 93;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof Exception ? 100 : (stateCaught_90 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (var14.startsWith("https://")) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof Exception ? 100 : (stateCaught_91 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof Exception ? 100 : (stateCaught_92 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof Exception ? 100 : (stateCaught_93 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (var14.length() <= var5) {
                                statePc = 98;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof Exception ? 100 : (stateCaught_94 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if ((var4_ref.indexOf((int) var14.charAt(var5)) ^ -1) != 0) {
                                statePc = 97;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof Exception ? 100 : (stateCaught_95 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof Exception ? 100 : (stateCaught_96 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            var5++;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof Exception ? 100 : (stateCaught_97 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            Process discarded$10 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var14 + "\"");
                            var8.field_g = null;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof Exception ? 100 : (stateCaught_98 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
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
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var15 = (Object[]) var8.field_d;
                            Object discarded$11 = Class.forName("tj").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((bl) this).field_u, new Object[5]);
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
                            if (la.a(false) >= field_w) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var16 = (255 & var8.field_a >> 1374883384) + "." + (255 & var8.field_a >> -1415344816) + "." + ((var8.field_a & 65384) >> 919597160) + "." + (var8.field_a & 255);
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName(var16).getHostName();
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_g = (Object) (Object) var17.getContents((Object) null);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var18 = new Thread((Runnable) var8.field_d);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_a);
                            var8.field_g = (Object) (Object) var18;
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

    bl(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        mb var6 = null;
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
                    ((bl) this).field_s = false;
                    ((bl) this).field_o = false;
                    ((bl) this).field_b = null;
                    ((bl) this).field_i = false;
                    ((bl) this).field_d = null;
                    ((bl) this).field_m = null;
                    ((bl) this).field_q = null;
                    ((bl) this).field_j = null;
                    field_t = "1.1";
                    field_n = "Unknown";
                    field_p = param1;
                    field_l = param0;
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
                    ((bl) this).field_o = stackIn_3_1 != 0;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_n = System.getProperty("java.vendor");
                        field_t = System.getProperty("java.version");
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
                    if ((field_n.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((bl) this).field_s = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_a = System.getProperty("os.name");
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
                    field_a = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_r = field_a.toLowerCase();
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
                        field_f = System.getProperty("user.home");
                        if (null == field_f) {
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
                        field_f = field_f + "/";
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
                    if (null == field_f) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_f = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((bl) this).field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((bl) this).field_s) {
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
                        field_g = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    vf.a(true, field_p, field_l);
                    if (!((bl) this).field_o) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((bl) this).field_m = new pf(vf.a(field_l, 1387, (String) null, "random.dat"), "rw", 25L);
                    ((bl) this).field_d = new pf(vf.a(0, "main_file_cache.dat2"), "rw", 314572800L);
                    ((bl) this).field_b = new pf(vf.a(0, "main_file_cache.idx255"), "rw", 1048576L);
                    ((bl) this).field_c = new pf[param2];
                    var5_int = 0;
                    statePc = 38;
                    continue stateLoop;
                }
                case 38: {
                    if (param2 <= var5_int) {
                        statePc = 40;
                    } else {
                        statePc = 39;
                    }
                    continue stateLoop;
                }
                case 39: {
                    ((bl) this).field_c[var5_int] = new pf(vf.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (((bl) this).field_s) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("ef").newInstance();
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
                        if (((bl) this).field_s) {
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
                        ((bl) this).field_e = Class.forName("ve").newInstance();
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
                        var6 = new mb();
                        ((bl) this).field_v = var6;
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
                        if (((bl) this).field_s) {
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
                        ((bl) this).field_u = Class.forName("tj").newInstance();
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
                        ((bl) this).field_k = new w();
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
                    ((bl) this).field_i = false;
                    ((bl) this).field_h = new Thread((Runnable) this);
                    ((bl) this).field_h.setPriority(10);
                    ((bl) this).field_h.setDaemon(true);
                    ((bl) this).field_h.start();
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
