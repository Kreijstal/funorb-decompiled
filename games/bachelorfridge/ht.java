/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class ht implements Runnable {
    java.awt.EventQueue field_x;
    private Object field_f;
    private static int field_w;
    qaa field_h;
    static String field_g;
    private Object field_p;
    static String field_i;
    qaa[] field_v;
    private qp field_d;
    private Thread field_r;
    private static String field_e;
    private static String field_o;
    boolean field_k;
    static java.lang.reflect.Method field_m;
    qaa field_n;
    private static String field_s;
    private eh field_b;
    private boolean field_j;
    private static volatile long field_u;
    private eh field_t;
    static String field_c;
    qaa field_a;
    private pq field_l;
    private boolean field_q;

    private final static qaa a(String param0, String param1, int param2, int param3) {
        try {
            String var7_ref = null;
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            Object var7 = null;
            Exception var8 = null;
            qaa var8_ref = null;
            qaa stackIn_15_0 = null;
            Throwable decompiledCaughtException = null;
            qaa stackOut_14_0 = null;
            var7_ref = null;
            L0: {
              if (param2 != 33) {
                if (param2 != 34) {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + ".dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param1 + "_wip.dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param1 + "_rc.dat";
                break L0;
              }
            }
            if (param3 == -1) {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_o, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
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
                    var8_ref = new qaa(new File(var7_ref, var4), "rw", 10000L);
                    stackOut_14_0 = (qaa) var8_ref;
                    stackIn_15_0 = stackOut_14_0;
                  } catch (java.lang.Exception decompiledCaughtParameter) {
                    decompiledCaughtException = decompiledCaughtParameter;
                    return (qaa) (Object) stackIn_15_0;
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

    final eh a(byte param0, String param1, int param2) {
        if (param0 < 117) {
            field_o = null;
        }
        return this.a(param2, false, -127, param1);
    }

    final boolean b(int param0) {
        if (!((ht) this).field_k) {
            return false;
        }
        if (param0 != 34) {
            return false;
        }
        if (((ht) this).field_j) {
            return ((ht) this).field_d != null ? true : false;
        }
        return null != ((ht) this).field_f ? true : false;
    }

    final eh a(java.awt.Component param0, boolean param1, int param2) {
        if (param2 <= 122) {
            ((ht) this).field_q = true;
        }
        return this.a(0, (Object) (Object) param0, param1 ? 1 : 0, 0, 15);
    }

    final eh a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 < 87) {
            return null;
        }
        return this.a(param4 + (param0 << -62859664), (Object) null, param3 + (param1 << -671281808), 0, 6);
    }

    final eh a(java.net.URL param0, int param1) {
        int var3 = 54 % ((param1 - -56) / 36);
        return this.a(0, (Object) (Object) param0, 0, 0, 4);
    }

    final eh a(java.awt.Frame param0, boolean param1) {
        if (param1) {
            eh discarded$0 = ((ht) this).a(-38, -51, 84, 7, -4);
        }
        return this.a(0, (Object) (Object) param0, 0, 0, 7);
    }

    final eh c(int param0) {
        if (param0 != -1) {
            return null;
        }
        return this.a(0, (Object) null, 0, 0, 5);
    }

    final eh a(Runnable param0, int param1, int param2) {
        if (param1 != 2) {
            ((ht) this).a(-34);
        }
        return this.a(0, (Object) (Object) param0, param2, 0, 2);
    }

    private final eh a(int param0, Object param1, int param2, int param3, int param4) {
        eh var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param3 == 0) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    ((ht) this).field_l = null;
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new eh();
                    var6.field_d = param1;
                    var6.field_c = param0;
                    var6.field_a = param2;
                    var6.field_b = param4;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null != ((ht) this).field_b) {
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
                        ((ht) this).field_t = var6;
                        ((ht) this).field_b = var6;
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
                        ((ht) this).field_b.field_g = var6;
                        ((ht) this).field_b = var6;
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

    private final eh a(int param0, boolean param1, int param2, String param3) {
        int var5 = 49 % ((param2 - -66) / 51);
        return this.a(0, (Object) (Object) param3, param0, 0, param1 ? 22 : 1);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            en var3_ref = null;
            Exception var3_ref2 = null;
            qaa var3_ref3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            int var4_int = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            eh var8 = null;
            Object[] var9 = null;
            Object[] var10 = null;
            Object[] var11 = null;
            String var12 = null;
            java.awt.Component var13 = null;
            java.awt.Frame var14 = null;
            String var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            java.awt.datatransfer.Clipboard var17 = null;
            Thread var18 = null;
            int stackIn_95_0 = 0;
            int stackOut_93_0 = 0;
            int stackOut_94_0 = 0;
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
                            if (((ht) this).field_q) {
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
                            if (((ht) this).field_t == null) {
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
                            var8 = ((ht) this).field_t;
                            ((ht) this).field_t = ((ht) this).field_t.field_g;
                            if (((ht) this).field_t == null) {
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
                            ((ht) this).field_b = null;
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
                            var2_int = var8.field_b;
                            if (-2 != (var2_int ^ -1)) {
                                statePc = 21;
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
                            if ((f.b((byte) 73) ^ -1L) > (field_u ^ -1L)) {
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
                            var8.field_e = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_d), var8.field_a);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2_int != 22) {
                                statePc = 27;
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
                            if ((f.b((byte) 73) ^ -1L) <= (field_u ^ -1L)) {
                                statePc = 24;
                            } else {
                                statePc = 23;
                            }
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
                            var8.field_e = (Object) (Object) lda.a((String) var8.field_d, var8.field_a, (byte) -113).a((byte) -70);
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof en ? 26 : (stateCaught_24 instanceof ThreadDeath ? 110 : 111));
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
                            var3_ref = (en) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref.getMessage();
                            throw var3_ref;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if ((var2_int ^ -1) == -3) {
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
                            if ((field_u ^ -1L) >= (f.b((byte) 73) ^ -1L)) {
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
                            var8.field_e = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_d).openStream());
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
                            if (-9 != (var2_int ^ -1)) {
                                statePc = 37;
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
                            if (!((ht) this).field_k) {
                                statePc = 36;
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
                            if (((Class) var9[0]).getClassLoader() != null) {
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
                            var8.field_e = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
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
                            if (var2_int != 9) {
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
                            var10 = (Object[]) var8.field_d;
                            if (((ht) this).field_k) {
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
                            if (null != ((Class) var10[0]).getClassLoader()) {
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
                            var8.field_e = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
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
                            if (18 == var2_int) {
                                statePc = 106;
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
                            if ((var2_int ^ -1) == -20) {
                                statePc = 105;
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
                            if (((ht) this).field_k) {
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
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (3 == var2_int) {
                                statePc = 102;
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
                            if (21 != var2_int) {
                                statePc = 53;
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
                            if ((f.b((byte) 73) ^ -1L) > (field_u ^ -1L)) {
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
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_d).getAddress();
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
                            if (var2_int != 5) {
                                statePc = 57;
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
                            if (!((ht) this).field_j) {
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
                            var8.field_e = (Object) (Object) ((ht) this).field_d.a(101);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var8.field_e = Class.forName("hma").getMethod("listmodes", new Class[0]).invoke(((ht) this).field_f, new Object[0]);
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
                            if (6 == var2_int) {
                                statePc = 99;
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
                            if (-8 != (var2_int ^ -1)) {
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
                            if (!((ht) this).field_j) {
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
                            ((ht) this).field_d.a(-31, (java.awt.Frame) var8.field_d);
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
                            Object discarded$6 = Class.forName("hma").getMethod("exit", new Class[0]).invoke(((ht) this).field_f, new Object[0]);
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
                            if (12 == var2_int) {
                                statePc = 98;
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
                            if (var2_int != 13) {
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
                            var3_ref3 = ht.a("", (String) var8.field_d, field_w, -1);
                            var8.field_e = (Object) (Object) var3_ref3;
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
                            if (!((ht) this).field_k) {
                                statePc = 70;
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
                            if (var2_int != 14) {
                                statePc = 70;
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
                            var3_int = var8.field_a;
                            var4_int = var8.field_c;
                            if (((ht) this).field_j) {
                                statePc = 69;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            Object discarded$7 = Class.forName("br").getDeclaredMethod("movemouse", new Class[2]).invoke(((ht) this).field_p, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            ((ht) this).field_l.a(var4_int, var3_int, 9537);
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
                            if (!((ht) this).field_k) {
                                statePc = 73;
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
                            if (var2_int == -16) {
                                statePc = 92;
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
                            if (((ht) this).field_j) {
                                statePc = 76;
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
                            if (-18 != var2_int) {
                                statePc = 76;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            var11 = (Object[]) var8.field_d;
                            Object discarded$8 = Class.forName("br").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((ht) this).field_p, new Object[5]);
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
                            if (16 != var2_int) {
                                statePc = 91;
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
                            if (!field_i.startsWith("win")) {
                                statePc = 79;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof Exception ? 90 : (stateCaught_77 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 90 : (stateCaught_78 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 90 : (stateCaught_79 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var12 = (String) var8.field_d;
                            if (var12.startsWith("http://")) {
                                statePc = 83;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 90 : (stateCaught_80 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var12.startsWith("https://")) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof Exception ? 90 : (stateCaught_81 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof Exception ? 90 : (stateCaught_82 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof Exception ? 90 : (stateCaught_83 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (var12.length() <= var5) {
                                statePc = 88;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 90 : (stateCaught_84 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (var4_ref.indexOf((int) var12.charAt(var5)) != -1) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof Exception ? 90 : (stateCaught_85 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof Exception ? 90 : (stateCaught_86 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var5++;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof Exception ? 90 : (stateCaught_87 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_e = null;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof Exception ? 90 : (stateCaught_88 instanceof ThreadDeath ? 110 : 111));
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var3_ref2 = (Exception) (Object) caughtException;
                            var8.field_e = (Object) (Object) var3_ref2;
                            throw (RuntimeException) (Object) var3_ref2;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (-1 == (var8.field_a ^ -1)) {
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
                            stackOut_93_0 = 1;
                            stackIn_95_0 = stackOut_93_0;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 110 : 111);
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
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var3_int = stackIn_95_0;
                            var13 = (java.awt.Component) var8.field_d;
                            if (!((ht) this).field_j) {
                                statePc = 97;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            ((ht) this).field_l.a(var13, (byte) -86, var3_int != 0);
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
                            Object discarded$10 = Class.forName("br").getDeclaredMethod("showcursor", new Class[2]).invoke(((ht) this).field_p, new Object[2]);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var3_ref3 = ht.a(field_e, (String) var8.field_d, field_w, -1);
                            var8.field_e = (Object) (Object) var3_ref3;
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
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_e = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (((ht) this).field_j) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            Object discarded$11 = Class.forName("hma").getMethod("enter", new Class[5]).invoke(((ht) this).field_f, new Object[5]);
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
                            ((ht) this).field_d.a((byte) -122, var8.field_a & 65535, var8.field_c >> -2136222448, var8.field_a >>> -349671120, var14, 65535 & var8.field_c);
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
                            if (field_u <= f.b((byte) 73)) {
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
                            var15 = (255 & var8.field_a >> 541306456) + "." + (var8.field_a >> -1875997232 & 255) + "." + (var8.field_a >> 669500040 & 255) + "." + (255 & var8.field_a);
                            var8.field_e = (Object) (Object) java.net.InetAddress.getByName(var15).getHostName();
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
                            var7 = (java.awt.datatransfer.Transferable) var8.field_d;
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var16.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof ThreadDeath ? 110 : 111);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            var17 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_e = (Object) (Object) var17.getContents((Object) null);
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
                            var8.field_e = (Object) (Object) var18;
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
                            var8.field_f = 1;
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
                        var8.field_f = 2;
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

    final void a(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            int var2_int = 0;
            Object var2_ref3 = null;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        if (param0 > 20) {
                            statePc = 2;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    }
                    case 1: {
                        ((ht) this).a(-108);
                        statePc = 2;
                        continue stateLoop;
                    }
                    case 2: {
                        var2_ref3 = this;
                        // monitorenter this
                        statePc = 3;
                        continue stateLoop;
                    }
                    case 3: {
                        try {
                            ((ht) this).field_q = true;
                            this.notifyAll();
                            // monitorexit var2_ref3
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
                            // monitorexit var2_ref3
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
                            ((ht) this).field_r.join();
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
                        if (null == ((ht) this).field_h) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((ht) this).field_h.a(true);
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
                        if (null != ((ht) this).field_n) {
                            statePc = 16;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 16: {
                        try {
                            ((ht) this).field_n.a(true);
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
                        if (null != ((ht) this).field_v) {
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
                        if (((ht) this).field_v.length <= var2_int) {
                            statePc = 28;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        if (null != ((ht) this).field_v[var2_int]) {
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
                            ((ht) this).field_v[var2_int].a(true);
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
                        if (null == ((ht) this).field_a) {
                            statePc = 32;
                        } else {
                            statePc = 29;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((ht) this).field_a.a(true);
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

    final eh a(String param0, Class param1, int param2) {
        if (param2 >= -127) {
            return null;
        }
        return this.a(0, (Object) (Object) new Object[2], 0, 0, 9);
    }

    final eh a(int param0, Class param1, Class[] param2, String param3) {
        if (param0 != 31633) {
            field_o = null;
        }
        return this.a(0, (Object) (Object) new Object[3], 0, param0 + -31633, 8);
    }

    ht(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        qp var7 = null;
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
                    ((ht) this).field_k = false;
                    ((ht) this).field_h = null;
                    ((ht) this).field_b = null;
                    ((ht) this).field_j = false;
                    ((ht) this).field_n = null;
                    ((ht) this).field_a = null;
                    ((ht) this).field_q = false;
                    ((ht) this).field_t = null;
                    field_e = param1;
                    field_w = param0;
                    field_g = "Unknown";
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
                    ((ht) this).field_k = stackIn_3_1 != 0;
                    field_c = "1.1";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_g = System.getProperty("java.vendor");
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
                    if (0 != (field_g.toLowerCase().indexOf("microsoft") ^ -1)) {
                        statePc = 9;
                    } else {
                        statePc = 10;
                    }
                    continue stateLoop;
                }
                case 9: {
                    ((ht) this).field_j = true;
                    statePc = 10;
                    continue stateLoop;
                }
                case 10: {
                    try {
                        field_s = System.getProperty("os.name");
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
                    field_s = "Unknown";
                    statePc = 13;
                    continue stateLoop;
                }
                case 13: {
                    field_i = field_s.toLowerCase();
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
                        field_o = System.getProperty("user.home");
                        if (field_o == null) {
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
                        field_o = field_o + "/";
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
                    if (null != field_o) {
                        statePc = 26;
                    } else {
                        statePc = 25;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_o = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((ht) this).field_x = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (((ht) this).field_j) {
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
                        field_m = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    hu.a(0, field_w, field_e);
                    if (!((ht) this).field_k) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((ht) this).field_a = new qaa(hu.a(field_w, "random.dat", (String) null, 1), "rw", 25L);
                    ((ht) this).field_h = new qaa(hu.a("main_file_cache.dat2", 0), "rw", 314572800L);
                    ((ht) this).field_n = new qaa(hu.a("main_file_cache.idx255", 0), "rw", 1048576L);
                    ((ht) this).field_v = new qaa[param2];
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
                    ((ht) this).field_v[var5_int] = new qaa(hu.a("main_file_cache.idx" + var5_int, 0), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((ht) this).field_j) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("cna").newInstance();
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
                        if (((ht) this).field_j) {
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
                        ((ht) this).field_f = Class.forName("hma").newInstance();
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
                        var7 = new qp();
                        ((ht) this).field_d = var7;
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
                        if (!((ht) this).field_j) {
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
                        ((ht) this).field_l = new pq();
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
                        ((ht) this).field_p = Class.forName("br").newInstance();
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
                    ((ht) this).field_q = false;
                    ((ht) this).field_r = new Thread((Runnable) this);
                    ((ht) this).field_r.setPriority(10);
                    ((ht) this).field_r.setDaemon(true);
                    ((ht) this).field_r.start();
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
