/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class rk implements Runnable {
    static String field_o;
    static String field_l;
    private static int field_v;
    private pc field_x;
    private static String field_k;
    private static volatile long field_u;
    private Thread field_s;
    fs field_a;
    private fi field_d;
    fs[] field_r;
    static java.lang.reflect.Method field_e;
    private en field_b;
    private static String field_t;
    private en field_w;
    fs field_g;
    boolean field_p;
    java.awt.EventQueue field_j;
    static String field_f;
    private Object field_m;
    fs field_n;
    private Object field_h;
    boolean field_q;
    private static String field_i;
    private boolean field_c;

    final en a(java.awt.Frame param0, int param1) {
        RuntimeException var3 = null;
        en stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param1 == 16823) {
                break L0;
              } else {
                ((rk) this).field_m = (Object) null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) (Object) param0, 0, 0, 7, (byte) 125);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final boolean a(File param0, byte[] param1, boolean param2) {
        FileOutputStream var4 = null;
        IOException var4_ref = null;
        RuntimeException var4_ref2 = null;
        int stackIn_6_0 = 0;
        int stackOut_5_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var4 = new FileOutputStream(param0);
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = (stateCaught_0 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        var4.write(param1, 0, param1.length);
                        var4.close();
                        if (param2) {
                            statePc = 5;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = (stateCaught_1 instanceof IOException ? 4 : 8);
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_t = (String) null;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof IOException ? 4 : 8);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = (stateCaught_3 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = (stateCaught_4 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        stackOut_5_0 = 1;
                        stackIn_6_0 = stackOut_5_0;
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof IOException ? 7 : 8);
                        continue stateLoop;
                    }
                }
                case 6: {
                    return stackIn_6_0 != 0;
                }
                case 7: {
                    try {
                        var4_ref = (IOException) (Object) caughtException;
                        throw new RuntimeException();
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 8;
                        continue stateLoop;
                    }
                }
                case 8: {
                    var4_ref2 = (RuntimeException) (Object) caughtException;
                    throw var4_ref2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final en a(int param0, boolean param1, String param2, int param3) {
        RuntimeException var5 = null;
        en stackIn_2_0 = null;
        Object stackIn_4_0 = null;
        String stackIn_4_1 = null;
        int stackIn_4_2 = 0;
        int stackIn_4_3 = 0;
        Object stackIn_6_0 = null;
        String stackIn_6_1 = null;
        int stackIn_6_2 = 0;
        int stackIn_6_3 = 0;
        Object stackIn_7_0 = null;
        String stackIn_7_1 = null;
        int stackIn_7_2 = 0;
        int stackIn_7_3 = 0;
        int stackIn_7_4 = 0;
        en stackIn_8_0 = null;
        en stackOut_1_0 = null;
        Object stackOut_3_0 = null;
        String stackOut_3_1 = null;
        int stackOut_3_2 = 0;
        int stackOut_3_3 = 0;
        Object stackOut_4_0 = null;
        String stackOut_4_1 = null;
        int stackOut_4_2 = 0;
        int stackOut_4_3 = 0;
        int stackOut_4_4 = 0;
        Object stackOut_6_0 = null;
        String stackOut_6_1 = null;
        int stackOut_6_2 = 0;
        int stackOut_6_3 = 0;
        int stackOut_6_4 = 0;
        en stackOut_7_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param3 >= 10) {
                            statePc = 3;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        stackOut_1_0 = (en) null;
                        stackIn_2_0 = stackOut_1_0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return (en) (Object) stackIn_2_0;
                }
                case 3: {
                    try {
                        stackOut_3_0 = this;
                        stackOut_3_1 = (String) param2;
                        stackOut_3_2 = 0;
                        stackOut_3_3 = param0;
                        stackIn_6_0 = stackOut_3_0;
                        stackIn_6_1 = stackOut_3_1;
                        stackIn_6_2 = stackOut_3_2;
                        stackIn_6_3 = stackOut_3_3;
                        stackIn_4_0 = stackOut_3_0;
                        stackIn_4_1 = stackOut_3_1;
                        stackIn_4_2 = stackOut_3_2;
                        stackIn_4_3 = stackOut_3_3;
                        if (param1) {
                            statePc = 6;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        stackOut_4_0 = this;
                        stackOut_4_1 = (String) (Object) stackIn_4_1;
                        stackOut_4_2 = stackIn_4_2;
                        stackOut_4_3 = stackIn_4_3;
                        stackOut_4_4 = 1;
                        stackIn_7_0 = stackOut_4_0;
                        stackIn_7_1 = stackOut_4_1;
                        stackIn_7_2 = stackOut_4_2;
                        stackIn_7_3 = stackOut_4_3;
                        stackIn_7_4 = stackOut_4_4;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        stackOut_6_0 = this;
                        stackOut_6_1 = (String) (Object) stackIn_6_1;
                        stackOut_6_2 = stackIn_6_2;
                        stackOut_6_3 = stackIn_6_3;
                        stackOut_6_4 = 22;
                        stackIn_7_0 = stackOut_6_0;
                        stackIn_7_1 = stackOut_6_1;
                        stackIn_7_2 = stackOut_6_2;
                        stackIn_7_3 = stackOut_6_3;
                        stackIn_7_4 = stackOut_6_4;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = this.a((Object) (Object) stackIn_7_1, stackIn_7_2, stackIn_7_3, stackIn_7_4, (byte) 125);
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return (en) (Object) stackIn_8_0;
                }
                case 9: {
                    var5 = (RuntimeException) (Object) caughtException;
                    throw var5;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void run() {
        try {
            en var1 = null;
            RuntimeException var1_ref = null;
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            ls var3_ref2 = null;
            Thread var3_ref3 = null;
            Object[] var3_array = null;
            java.awt.datatransfer.Transferable var3_ref4 = null;
            int var3_int = 0;
            String var3_ref5 = null;
            Throwable var4 = null;
            java.awt.datatransfer.Clipboard var4_ref = null;
            int var4_int = 0;
            java.awt.Component var4_ref2 = null;
            int var5 = 0;
            Throwable var6 = null;
            int stackIn_93_0 = 0;
            int stackIn_100_0 = 0;
            int stackIn_109_0 = 0;
            int stackIn_117_0 = 0;
            String stackIn_131_0 = null;
            int stackOut_92_0 = 0;
            int stackOut_99_0 = 0;
            int stackOut_106_0 = 0;
            int stackOut_108_0 = 0;
            int stackOut_116_0 = 0;
            String stackOut_130_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            if (!((rk) this).field_c) {
                                statePc = 4;
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
                            // monitorexit var2
                            statePc = 3;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (null == ((rk) this).field_w) {
                                statePc = 10;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            var1 = ((rk) this).field_w;
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            ((rk) this).field_w = ((rk) this).field_w.field_d;
                            if (((rk) this).field_w == null) {
                                statePc = 9;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            ((rk) this).field_b = null;
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
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var4 = caughtException;
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
                        try {
                            throw (RuntimeException) (Object) var4;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var2_int = var1.field_g;
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-2 != (var2_int ^ -1)) {
                                statePc = 26;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if ((kh.a(-101) ^ -1L) > (field_u ^ -1L)) {
                                statePc = 24;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var1.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var1.field_e), var1.field_c);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (-23 == (var2_int ^ -1)) {
                                statePc = 183;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if ((var2_int ^ -1) == -3) {
                                statePc = 182;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((var2_int ^ -1) != -5) {
                                statePc = 40;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if ((kh.a(-59) ^ -1L) > (field_u ^ -1L)) {
                                statePc = 38;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var1.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var1.field_e).openStream());
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (-9 == (var2_int ^ -1)) {
                                statePc = 173;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if ((var2_int ^ -1) != -10) {
                                statePc = 52;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var3_array = (Object[]) (Object[]) var1.field_e;
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (((rk) this).field_q) {
                                statePc = 48;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (((Class) var3_array[0]).getClassLoader() != null) {
                                statePc = 51;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var1.field_f = (Object) (Object) ((Class) var3_array[0]).getDeclaredField((String) var3_array[1]);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if ((var2_int ^ -1) == -19) {
                                statePc = 172;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (19 == var2_int) {
                                statePc = 171;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            if (((rk) this).field_q) {
                                statePc = 61;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (var2_int != 3) {
                                statePc = 69;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if ((kh.a(-87) ^ -1L) > (field_u ^ -1L)) {
                                statePc = 67;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var3_ref3 = (Thread) (Object) ((var1.field_c >> 1176283960 & 255) + "." + ((16746416 & var1.field_c) >> 1900384752) + "." + (255 & var1.field_c >> 819548232) + "." + (var1.field_c & 255));
                            var1.field_f = (Object) (Object) java.net.InetAddress.getByName((String) (Object) var3_ref3).getHostName();
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var2_int == 21) {
                                statePc = 166;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (5 == var2_int) {
                                statePc = 162;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (6 != var2_int) {
                                statePc = 82;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var3_ref3 = (Thread) (Object) new java.awt.Frame("Jagex Full Screen");
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var1.field_f = (Object) (Object) var3_ref3;
                            ((java.awt.Frame) (Object) var3_ref3).setResizable(false);
                            if (!((rk) this).field_p) {
                                statePc = 80;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            ((rk) this).field_x.a(var1.field_c >>> 644391888, 17, (java.awt.Frame) (Object) var3_ref3, 65535 & var1.field_c, var1.field_b >> -855980336, 65535 & var1.field_b);
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            Object discarded$6 = Class.forName("il").getMethod("enter", new Class[5]).invoke(((rk) this).field_m, new Object[5]);
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (7 == var2_int) {
                                statePc = 158;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if ((var2_int ^ -1) == -13) {
                                statePc = 157;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (-14 == (var2_int ^ -1)) {
                                statePc = 156;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (!((rk) this).field_q) {
                                statePc = 96;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            stackOut_92_0 = var2_int;
                            stackIn_93_0 = stackOut_92_0;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if ((stackIn_93_0 ^ -1) == -15) {
                                statePc = 150;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (!((rk) this).field_q) {
                                statePc = 115;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            stackOut_99_0 = var2_int;
                            stackIn_100_0 = stackOut_99_0;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (stackIn_100_0 != 15) {
                                statePc = 115;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (-1 == (var1.field_c ^ -1)) {
                                statePc = 108;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            stackOut_106_0 = 1;
                            stackIn_109_0 = stackOut_106_0;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            stackOut_108_0 = 0;
                            stackIn_109_0 = stackOut_108_0;
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var3_int = stackIn_109_0;
                            var4_ref2 = (java.awt.Component) var1.field_e;
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            if (((rk) this).field_p) {
                                statePc = 113;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            Object discarded$7 = Class.forName("wr").getDeclaredMethod("showcursor", new Class[2]).invoke(((rk) this).field_h, new Object[2]);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            ((rk) this).field_d.a(var3_int != 0, var4_ref2, -4);
                            statePc = 114;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = (stateCaught_113 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = (stateCaught_114 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            if (((rk) this).field_p) {
                                statePc = 120;
                            } else {
                                statePc = 116;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = (stateCaught_115 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 116: {
                        try {
                            stackOut_116_0 = var2_int;
                            stackIn_117_0 = stackOut_116_0;
                            statePc = 117;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = (stateCaught_116 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        try {
                            if ((stackIn_117_0 ^ -1) == -18) {
                                statePc = 149;
                            } else {
                                statePc = 118;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = (stateCaught_117 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = (stateCaught_118 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 120: {
                        try {
                            if (-17 == (var2_int ^ -1)) {
                                statePc = 125;
                            } else {
                                statePc = 121;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_120) {
                            caughtException = stateCaught_120;
                            statePc = (stateCaught_120 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 121: {
                        try {
                            statePc = 123;
                            continue stateLoop;
                        } catch (Throwable stateCaught_121) {
                            caughtException = stateCaught_121;
                            statePc = (stateCaught_121 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 123: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_123) {
                            caughtException = stateCaught_123;
                            statePc = (stateCaught_123 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 125: {
                        try {
                            if (field_f.startsWith("win")) {
                                statePc = 128;
                            } else {
                                statePc = 126;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_125) {
                            caughtException = stateCaught_125;
                            statePc = (stateCaught_125 instanceof Exception ? 148 : (stateCaught_125 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 126: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_126) {
                            caughtException = stateCaught_126;
                            statePc = (stateCaught_126 instanceof Exception ? 148 : (stateCaught_126 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 128: {
                        try {
                            var3_ref5 = (String) var1.field_e;
                            statePc = 129;
                            continue stateLoop;
                        } catch (Throwable stateCaught_128) {
                            caughtException = stateCaught_128;
                            statePc = (stateCaught_128 instanceof Exception ? 148 : (stateCaught_128 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 129: {
                        try {
                            if (var3_ref5.startsWith("http://")) {
                                statePc = 137;
                            } else {
                                statePc = 130;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_129) {
                            caughtException = stateCaught_129;
                            statePc = (stateCaught_129 instanceof Exception ? 148 : (stateCaught_129 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 130: {
                        try {
                            stackOut_130_0 = (String) var3_ref5;
                            stackIn_131_0 = stackOut_130_0;
                            statePc = 131;
                            continue stateLoop;
                        } catch (Throwable stateCaught_130) {
                            caughtException = stateCaught_130;
                            statePc = (stateCaught_130 instanceof Exception ? 148 : (stateCaught_130 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 131: {
                        try {
                            if (!((String) (Object) stackIn_131_0).startsWith("https://")) {
                                statePc = 136;
                            } else {
                                statePc = 132;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_131) {
                            caughtException = stateCaught_131;
                            statePc = (stateCaught_131 instanceof Exception ? 148 : (stateCaught_131 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 132: {
                        try {
                            statePc = 134;
                            continue stateLoop;
                        } catch (Throwable stateCaught_132) {
                            caughtException = stateCaught_132;
                            statePc = (stateCaught_132 instanceof Exception ? 148 : (stateCaught_132 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 134: {
                        try {
                            statePc = 137;
                            continue stateLoop;
                        } catch (Throwable stateCaught_134) {
                            caughtException = stateCaught_134;
                            statePc = (stateCaught_134 instanceof Exception ? 148 : (stateCaught_134 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 136: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_136) {
                            caughtException = stateCaught_136;
                            statePc = (stateCaught_136 instanceof Exception ? 148 : (stateCaught_136 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 137: {
                        try {
                            var4_ref = (java.awt.datatransfer.Clipboard) (Object) "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 138;
                            continue stateLoop;
                        } catch (Throwable stateCaught_137) {
                            caughtException = stateCaught_137;
                            statePc = (stateCaught_137 instanceof Exception ? 148 : (stateCaught_137 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 138: {
                        try {
                            if ((var5 ^ -1) <= (var3_ref5.length() ^ -1)) {
                                statePc = 146;
                            } else {
                                statePc = 139;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_138) {
                            caughtException = stateCaught_138;
                            statePc = (stateCaught_138 instanceof Exception ? 148 : (stateCaught_138 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 139: {
                        try {
                            if ((((String) (Object) var4_ref).indexOf((int) var3_ref5.charAt(var5)) ^ -1) == 0) {
                                statePc = 144;
                            } else {
                                statePc = 140;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_139) {
                            caughtException = stateCaught_139;
                            statePc = (stateCaught_139 instanceof Exception ? 148 : (stateCaught_139 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 140: {
                        try {
                            statePc = 142;
                            continue stateLoop;
                        } catch (Throwable stateCaught_140) {
                            caughtException = stateCaught_140;
                            statePc = (stateCaught_140 instanceof Exception ? 148 : (stateCaught_140 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 142: {
                        try {
                            statePc = 145;
                            continue stateLoop;
                        } catch (Throwable stateCaught_142) {
                            caughtException = stateCaught_142;
                            statePc = (stateCaught_142 instanceof Exception ? 148 : (stateCaught_142 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 144: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_144) {
                            caughtException = stateCaught_144;
                            statePc = (stateCaught_144 instanceof Exception ? 148 : (stateCaught_144 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 145: {
                        try {
                            var5++;
                            statePc = 138;
                            continue stateLoop;
                        } catch (Throwable stateCaught_145) {
                            caughtException = stateCaught_145;
                            statePc = (stateCaught_145 instanceof Exception ? 148 : (stateCaught_145 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 146: {
                        try {
                            Process discarded$8 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var3_ref5 + "\"");
                            var1.field_f = null;
                            statePc = 147;
                            continue stateLoop;
                        } catch (Throwable stateCaught_146) {
                            caughtException = stateCaught_146;
                            statePc = (stateCaught_146 instanceof Exception ? 148 : (stateCaught_146 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 147: {
                        try {
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_147) {
                            caughtException = stateCaught_147;
                            statePc = (stateCaught_147 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 148: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var1.field_f = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_148) {
                            caughtException = stateCaught_148;
                            statePc = (stateCaught_148 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 149: {
                        try {
                            var3_array = (Object[]) (Object[]) var1.field_e;
                            Object discarded$9 = Class.forName("wr").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((rk) this).field_h, new Object[5]);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_149) {
                            caughtException = stateCaught_149;
                            statePc = (stateCaught_149 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 150: {
                        try {
                            var3_int = var1.field_c;
                            var4_int = var1.field_b;
                            statePc = 151;
                            continue stateLoop;
                        } catch (Throwable stateCaught_150) {
                            caughtException = stateCaught_150;
                            statePc = (stateCaught_150 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 151: {
                        try {
                            if (((rk) this).field_p) {
                                statePc = 154;
                            } else {
                                statePc = 152;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_151) {
                            caughtException = stateCaught_151;
                            statePc = (stateCaught_151 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 152: {
                        try {
                            Object discarded$10 = Class.forName("wr").getDeclaredMethod("movemouse", new Class[2]).invoke(((rk) this).field_h, new Object[2]);
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_152) {
                            caughtException = stateCaught_152;
                            statePc = (stateCaught_152 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 154: {
                        try {
                            ((rk) this).field_d.a(0, var3_int, var4_int);
                            statePc = 155;
                            continue stateLoop;
                        } catch (Throwable stateCaught_154) {
                            caughtException = stateCaught_154;
                            statePc = (stateCaught_154 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 155: {
                        try {
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_155) {
                            caughtException = stateCaught_155;
                            statePc = (stateCaught_155 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 156: {
                        try {
                            var3_ref3 = (Thread) (Object) rk.a((String) var1.field_e, field_v, (byte) -97, "");
                            var1.field_f = (Object) (Object) var3_ref3;
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_156) {
                            caughtException = stateCaught_156;
                            statePc = (stateCaught_156 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 157: {
                        try {
                            var3_ref3 = (Thread) (Object) rk.a((String) var1.field_e, field_v, (byte) -97, field_t);
                            var1.field_f = (Object) (Object) var3_ref3;
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_157) {
                            caughtException = stateCaught_157;
                            statePc = (stateCaught_157 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 158: {
                        try {
                            if (((rk) this).field_p) {
                                statePc = 161;
                            } else {
                                statePc = 159;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_158) {
                            caughtException = stateCaught_158;
                            statePc = (stateCaught_158 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 159: {
                        try {
                            Object discarded$11 = Class.forName("il").getMethod("exit", new Class[0]).invoke(((rk) this).field_m, new Object[0]);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_159) {
                            caughtException = stateCaught_159;
                            statePc = (stateCaught_159 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 161: {
                        try {
                            ((rk) this).field_x.a((java.awt.Frame) var1.field_e, -70);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_161) {
                            caughtException = stateCaught_161;
                            statePc = (stateCaught_161 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 162: {
                        try {
                            if (((rk) this).field_p) {
                                statePc = 165;
                            } else {
                                statePc = 163;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_162) {
                            caughtException = stateCaught_162;
                            statePc = (stateCaught_162 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 163: {
                        try {
                            var1.field_f = Class.forName("il").getMethod("listmodes", new Class[0]).invoke(((rk) this).field_m, new Object[0]);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_163) {
                            caughtException = stateCaught_163;
                            statePc = (stateCaught_163 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 165: {
                        try {
                            var1.field_f = (Object) (Object) ((rk) this).field_x.a(-116);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_165) {
                            caughtException = stateCaught_165;
                            statePc = (stateCaught_165 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 166: {
                        try {
                            if (kh.a(-92) < field_u) {
                                statePc = 169;
                            } else {
                                statePc = 167;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_166) {
                            caughtException = stateCaught_166;
                            statePc = (stateCaught_166 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 167: {
                        try {
                            statePc = 170;
                            continue stateLoop;
                        } catch (Throwable stateCaught_167) {
                            caughtException = stateCaught_167;
                            statePc = (stateCaught_167 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 169: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_169) {
                            caughtException = stateCaught_169;
                            statePc = (stateCaught_169 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 170: {
                        try {
                            var1.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var1.field_e).getAddress();
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_170) {
                            caughtException = stateCaught_170;
                            statePc = (stateCaught_170 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 171: {
                        try {
                            var3_ref4 = (java.awt.datatransfer.Transferable) var1.field_e;
                            var4_ref = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var4_ref.setContents(var3_ref4, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_171) {
                            caughtException = stateCaught_171;
                            statePc = (stateCaught_171 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 172: {
                        try {
                            var3_ref3 = (Thread) (Object) java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var1.field_f = (Object) (Object) ((java.awt.datatransfer.Clipboard) (Object) var3_ref3).getContents((Object) null);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_172) {
                            caughtException = stateCaught_172;
                            statePc = (stateCaught_172 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 173: {
                        try {
                            var3_array = (Object[]) (Object[]) var1.field_e;
                            statePc = 174;
                            continue stateLoop;
                        } catch (Throwable stateCaught_173) {
                            caughtException = stateCaught_173;
                            statePc = (stateCaught_173 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 174: {
                        try {
                            if (!((rk) this).field_q) {
                                statePc = 181;
                            } else {
                                statePc = 175;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_174) {
                            caughtException = stateCaught_174;
                            statePc = (stateCaught_174 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 175: {
                        try {
                            if (((Class) var3_array[0]).getClassLoader() == null) {
                                statePc = 180;
                            } else {
                                statePc = 176;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_175) {
                            caughtException = stateCaught_175;
                            statePc = (stateCaught_175 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 176: {
                        try {
                            statePc = 178;
                            continue stateLoop;
                        } catch (Throwable stateCaught_176) {
                            caughtException = stateCaught_176;
                            statePc = (stateCaught_176 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 178: {
                        try {
                            statePc = 181;
                            continue stateLoop;
                        } catch (Throwable stateCaught_178) {
                            caughtException = stateCaught_178;
                            statePc = (stateCaught_178 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 180: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_180) {
                            caughtException = stateCaught_180;
                            statePc = (stateCaught_180 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 181: {
                        try {
                            var1.field_f = (Object) (Object) ((Class) var3_array[0]).getDeclaredMethod((String) var3_array[1], (Class[]) (Class[]) var3_array[2]);
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_181) {
                            caughtException = stateCaught_181;
                            statePc = (stateCaught_181 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 182: {
                        try {
                            var3_ref3 = new Thread((Runnable) var1.field_e);
                            var3_ref3.setDaemon(true);
                            var3_ref3.start();
                            var3_ref3.setPriority(var1.field_c);
                            var1.field_f = (Object) (Object) var3_ref3;
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_182) {
                            caughtException = stateCaught_182;
                            statePc = (stateCaught_182 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 183: {
                        try {
                            if ((field_u ^ -1L) < (kh.a(-107) ^ -1L)) {
                                statePc = 186;
                            } else {
                                statePc = 184;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_183) {
                            caughtException = stateCaught_183;
                            statePc = (stateCaught_183 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 184: {
                        try {
                            statePc = 187;
                            continue stateLoop;
                        } catch (Throwable stateCaught_184) {
                            caughtException = stateCaught_184;
                            statePc = (stateCaught_184 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 186: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_186) {
                            caughtException = stateCaught_186;
                            statePc = (stateCaught_186 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 187: {
                        try {
                            var1.field_f = (Object) (Object) dd.a((String) var1.field_e, var1.field_c, -105).a((byte) 97);
                            statePc = 188;
                            continue stateLoop;
                        } catch (Throwable stateCaught_187) {
                            caughtException = stateCaught_187;
                            statePc = (stateCaught_187 instanceof ls ? 189 : (stateCaught_187 instanceof ThreadDeath ? 192 : 193));
                            continue stateLoop;
                        }
                    }
                    case 188: {
                        try {
                            statePc = 190;
                            continue stateLoop;
                        } catch (Throwable stateCaught_188) {
                            caughtException = stateCaught_188;
                            statePc = (stateCaught_188 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 189: {
                        try {
                            var3_ref2 = (ls) (Object) caughtException;
                            var1.field_f = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_189) {
                            caughtException = stateCaught_189;
                            statePc = (stateCaught_189 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 190: {
                        try {
                            var1.field_a = 1;
                            statePc = 191;
                            continue stateLoop;
                        } catch (Throwable stateCaught_190) {
                            caughtException = stateCaught_190;
                            statePc = (stateCaught_190 instanceof ThreadDeath ? 192 : 193);
                            continue stateLoop;
                        }
                    }
                    case 191: {
                        try {
                            statePc = 194;
                            continue stateLoop;
                        } catch (Throwable stateCaught_191) {
                            caughtException = stateCaught_191;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 192: {
                        try {
                            var2_ref = (ThreadDeath) (Object) caughtException;
                            throw var2_ref;
                        } catch (Throwable stateCaught_192) {
                            caughtException = stateCaught_192;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 193: {
                        try {
                            var2_ref2 = caughtException;
                            var1.field_a = 2;
                            statePc = 194;
                            continue stateLoop;
                        } catch (Throwable stateCaught_193) {
                            caughtException = stateCaught_193;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 194: {
                        try {
                            var2 = (Object) (Object) var1;
                            // monitorenter var1
                            statePc = 195;
                            continue stateLoop;
                        } catch (Throwable stateCaught_194) {
                            caughtException = stateCaught_194;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 195: {
                        try {
                            ((Object) (Object) var1).notify();
                            // monitorexit var2
                            statePc = 196;
                            continue stateLoop;
                        } catch (Throwable stateCaught_195) {
                            caughtException = stateCaught_195;
                            statePc = 197;
                            continue stateLoop;
                        }
                    }
                    case 196: {
                        try {
                            statePc = 199;
                            continue stateLoop;
                        } catch (Throwable stateCaught_196) {
                            caughtException = stateCaught_196;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 197: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 198;
                            continue stateLoop;
                        } catch (Throwable stateCaught_197) {
                            caughtException = stateCaught_197;
                            statePc = 197;
                            continue stateLoop;
                        }
                    }
                    case 198: {
                        try {
                            throw (RuntimeException) (Object) var6;
                        } catch (Throwable stateCaught_198) {
                            caughtException = stateCaught_198;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 199: {
                        try {
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_199) {
                            caughtException = stateCaught_199;
                            statePc = 200;
                            continue stateLoop;
                        }
                    }
                    case 200: {
                        var1_ref = (RuntimeException) (Object) caughtException;
                        throw var1_ref;
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

    final en a(int param0, int param1, Runnable param2) {
        RuntimeException var4 = null;
        en stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param1 == 1048576) {
                break L0;
              } else {
                en discarded$2 = ((rk) this).a((byte) 49, (java.net.URL) null);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) (Object) param2, 0, param0, 2, (byte) 117);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final void b(int param0) {
        try {
            Object var2 = null;
            InterruptedException var2_ref = null;
            IOException var2_ref2 = null;
            RuntimeException var2_ref3 = null;
            int var2_int = 0;
            Throwable var3 = null;
            IOException var3_ref = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            var2 = this;
                            // monitorenter this
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            ((rk) this).field_c = true;
                            if (param0 < -99) {
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
                            this.notifyAll();
                            // monitorexit var2
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 6;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 41;
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
                        try {
                            throw (RuntimeException) (Object) var3;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            ((rk) this).field_s.join();
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof InterruptedException ? 10 : 41);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2_ref = (InterruptedException) (Object) caughtException;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (null == ((rk) this).field_n) {
                                statePc = 16;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            ((rk) this).field_n.a(19260);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = (stateCaught_12 instanceof IOException ? 15 : 14);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 14;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (null == ((rk) this).field_a) {
                                statePc = 21;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            ((rk) this).field_a.a(19260);
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof IOException ? 20 : 19);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (((rk) this).field_r != null) {
                                statePc = 24;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof InterruptedException ? 23 : 41);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof InterruptedException ? 23 : 41);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            var2_int = 0;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (((rk) this).field_r.length <= var2_int) {
                                statePc = 34;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof InterruptedException ? 28 : 41);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (((rk) this).field_r[var2_int] == null) {
                                statePc = 33;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof RuntimeException ? 31 : 28);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            ((rk) this).field_r[var2_int].a(19260);
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof IOException ? 32 : 31);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 31;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var3_ref = (IOException) (Object) caughtException;
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var2_int++;
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (null != ((rk) this).field_g) {
                                statePc = 37;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof InterruptedException ? 36 : 41);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof InterruptedException ? 36 : 41);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            ((rk) this).field_g.a(19260);
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof IOException ? 39 : 41);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            var2_ref2 = (IOException) (Object) caughtException;
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 41;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        var2_ref3 = (RuntimeException) (Object) caughtException;
                        throw var2_ref3;
                    }
                    case 42: {
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

    final en a(Class param0, Class[] param1, String param2, boolean param3) {
        RuntimeException var5 = null;
        en stackIn_2_0 = null;
        en stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_1_0 = null;
        en stackOut_3_0 = null;
        try {
          if (param3) {
            return (en) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = (en) null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a((Object) (Object) new Object[3], 0, 0, 8, (byte) 61);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final en a(int param0) {
        RuntimeException var2 = null;
        en stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 255) {
                break L0;
              } else {
                en discarded$2 = ((rk) this).a((Class) null, (Class[]) null, (String) null, false);
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) null, 0, 0, 5, (byte) 56);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    private final static fs a(String param0, int param1, byte param2, String param3) {
        try {
            RuntimeException var4 = null;
            String var4_ref = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            fs var8_ref = null;
            fs stackIn_2_0 = null;
            fs stackIn_19_0 = null;
            Object stackIn_23_0 = null;
            fs stackOut_1_0 = null;
            fs stackOut_18_0 = null;
            Object stackOut_22_0 = null;
            int statePc = 0;
            Throwable caughtException = null;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        try {
                            if (param2 == -97) {
                                statePc = 3;
                            } else {
                                statePc = 1;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_0) {
                            caughtException = stateCaught_0;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 1: {
                        try {
                            stackOut_1_0 = (fs) null;
                            stackIn_2_0 = stackOut_1_0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        return (fs) (Object) stackIn_2_0;
                    }
                    case 3: {
                        try {
                            if ((param1 ^ -1) == -34) {
                                statePc = 9;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = (stateCaught_3 instanceof RuntimeException ? 24 : 6);
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (param1 == 34) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = (stateCaught_4 instanceof RuntimeException ? 24 : 6);
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            var4_ref = "jagex_" + param3 + "_preferences" + param0 + ".dat";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var4_ref = "jagex_" + param3 + "_preferences" + param0 + "_wip.dat";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var4_ref = "jagex_" + param3 + "_preferences" + param0 + "_rc.dat";
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var5_array = new String[]{"c:/rscache/", "/rscache/", field_i, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
                            var6 = 0;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if ((var6 ^ -1) <= (var5_array.length ^ -1)) {
                                statePc = 22;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            var7 = var5_array[var6];
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var7.length() <= 0) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = (stateCaught_13 instanceof Exception ? 16 : 24);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (new File(var7).exists()) {
                                statePc = 18;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = (stateCaught_14 instanceof Exception ? 16 : 24);
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            throw (RuntimeException) (Object) caughtException;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8_ref = new fs(new File(var7, var4_ref), "rw", 10000L);
                            stackOut_18_0 = (fs) var8_ref;
                            stackIn_19_0 = stackOut_18_0;
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof Exception ? 20 : 24);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        return (fs) (Object) stackIn_19_0;
                    }
                    case 20: {
                        try {
                            var8 = (Exception) (Object) caughtException;
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var6++;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            stackOut_22_0 = null;
                            stackIn_23_0 = stackOut_22_0;
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        return (fs) (Object) stackIn_23_0;
                    }
                    case 24: {
                        var4 = (RuntimeException) (Object) caughtException;
                        throw var4;
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

    final boolean a(byte param0) {
        RuntimeException var2 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_21_0 = 0;
        int stackOut_7_0 = 0;
        int stackOut_13_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_18_0 = 0;
        int stackOut_20_0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        if (param0 == 84) {
                            statePc = 4;
                        } else {
                            statePc = 1;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        ((rk) this).run();
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        statePc = 4;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (!((rk) this).field_q) {
                            statePc = 7;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        stackOut_7_0 = 0;
                        stackIn_8_0 = stackOut_7_0;
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 8: {
                    return stackIn_8_0 != 0;
                }
                case 9: {
                    try {
                        if (!((rk) this).field_p) {
                            statePc = 17;
                        } else {
                            statePc = 10;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        if (((rk) this).field_x == null) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        stackOut_13_0 = 1;
                        stackIn_16_0 = stackOut_13_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        stackOut_15_0 = 0;
                        stackIn_16_0 = stackOut_15_0;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 16: {
                    return stackIn_16_0 != 0;
                }
                case 17: {
                    try {
                        if (((rk) this).field_m == null) {
                            statePc = 20;
                        } else {
                            statePc = 18;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        stackOut_18_0 = 1;
                        stackIn_21_0 = stackOut_18_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        stackOut_20_0 = 0;
                        stackIn_21_0 = stackOut_20_0;
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = 22;
                        continue stateLoop;
                    }
                }
                case 21: {
                    return stackIn_21_0 != 0;
                }
                case 22: {
                    var2 = (RuntimeException) (Object) caughtException;
                    throw var2;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final en a(String param0, Class param1, int param2) {
        RuntimeException var4 = null;
        en stackIn_2_0 = null;
        en stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_1_0 = null;
        en stackOut_3_0 = null;
        try {
          if (param2 == 9) {
            return (en) (Object) stackIn_2_0;
          } else {
            stackOut_1_0 = (en) null;
            stackIn_2_0 = stackOut_1_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_3_0 = this.a((Object) (Object) new Object[2], 0, 0, 9, (byte) 87);
          stackIn_4_0 = stackOut_3_0;
        }
        return null;
    }

    final en a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        en stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param1 < -79) {
                break L0;
              } else {
                ((rk) this).field_x = (pc) null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) null, param2 + (param4 << -588128400), param3 + (param0 << 2039991504), 6, (byte) 83);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final en a(int param0, String param1, int param2) {
        RuntimeException var4 = null;
        en stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 == 2) {
                break L0;
              } else {
                ((rk) this).field_d = (fi) null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a(param2, false, param1, param0 + 114);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    final en a(byte param0, java.net.URL param1) {
        RuntimeException var3 = null;
        en stackIn_5_0 = null;
        RuntimeException decompiledCaughtException = null;
        en stackOut_4_0 = null;
        try {
          try {
            L0: {
              if (param0 >= 55) {
                break L0;
              } else {
                ((rk) this).field_w = (en) null;
                break L0;
              }
            }
          } catch (java.lang.RuntimeException decompiledCaughtParameter) {
            decompiledCaughtException = decompiledCaughtParameter;
          }
          throw decompiledCaughtException;
        } catch (java.lang.RuntimeException decompiledCaughtParameter) {
          decompiledCaughtException = decompiledCaughtParameter;
          stackOut_4_0 = this.a((Object) (Object) param1, 0, 0, 4, (byte) 58);
          stackIn_5_0 = stackOut_4_0;
        }
        return null;
    }

    private final en a(Object param0, int param1, int param2, int param3, byte param4) {
        en var6 = null;
        RuntimeException var6_ref = null;
        Object var7 = null;
        Throwable var8 = null;
        en stackIn_13_0 = null;
        en stackOut_12_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    try {
                        var6 = new en();
                        var6.field_e = param0;
                        var6.field_b = param1;
                        var6.field_g = param3;
                        var6.field_c = param2;
                        var7 = this;
                        // monitorenter this
                        statePc = 1;
                        continue stateLoop;
                    } catch (Throwable stateCaught_0) {
                        caughtException = stateCaught_0;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 1: {
                    try {
                        if (((rk) this).field_b == null) {
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
                        ((rk) this).field_b.field_d = var6;
                        ((rk) this).field_b = var6;
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
                        ((rk) this).field_w = var6;
                        ((rk) this).field_b = var6;
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
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 6;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 8;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 14;
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
                    try {
                        throw (RuntimeException) (Object) var8;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        if (param4 > 54) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        en discarded$2 = ((rk) this).a(47, -115, 69, 14, 3);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 11;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackOut_12_0 = (en) var6;
                        stackIn_13_0 = stackOut_12_0;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 14;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return (en) (Object) stackIn_13_0;
                }
                case 14: {
                    var6_ref = (RuntimeException) (Object) caughtException;
                    throw var6_ref;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    rk(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        RuntimeException var5_ref2 = null;
        int var5_int = 0;
        ThreadGroup var5_ref3 = null;
        ThreadGroup var6 = null;
        Thread[] var7 = null;
        int var8 = 0;
        Thread[] stackIn_73_0 = null;
        Thread[] stackOut_72_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    ((rk) this).field_b = null;
                    ((rk) this).field_w = null;
                    ((rk) this).field_g = null;
                    ((rk) this).field_p = false;
                    ((rk) this).field_a = null;
                    ((rk) this).field_n = null;
                    ((rk) this).field_c = false;
                    ((rk) this).field_q = false;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        ((rk) this).field_q = param3;
                        field_l = "1.1";
                        field_t = param1;
                        field_o = "Unknown";
                        field_v = param0;
                        statePc = 2;
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        field_o = System.getProperty("java.vendor");
                        field_l = System.getProperty("java.version");
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = (stateCaught_2 instanceof Exception ? 4 : 82);
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if (field_o.toLowerCase().indexOf("microsoft") != -1) {
                            statePc = 8;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = (stateCaught_5 instanceof Exception ? 7 : 82);
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = (stateCaught_6 instanceof Exception ? 7 : 82);
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        ((rk) this).field_p = true;
                        statePc = 9;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        field_k = System.getProperty("os.name");
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = (stateCaught_9 instanceof Exception ? 11 : 82);
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        field_k = "Unknown";
                        statePc = 12;
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        field_f = field_k.toLowerCase();
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        String discarded$5 = System.getProperty("os.arch").toLowerCase();
                        statePc = 14;
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = (stateCaught_13 instanceof Exception ? 15 : 82);
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        String discarded$6 = System.getProperty("os.version").toLowerCase();
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = (stateCaught_16 instanceof Exception ? 18 : 82);
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 19;
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        field_i = System.getProperty("user.home");
                        if (null == field_i) {
                            statePc = 21;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = (stateCaught_19 instanceof Exception ? 22 : 82);
                        continue stateLoop;
                    }
                }
                case 20: {
                    try {
                        field_i = field_i + "/";
                        statePc = 21;
                        continue stateLoop;
                    } catch (Throwable stateCaught_20) {
                        caughtException = stateCaught_20;
                        statePc = (stateCaught_20 instanceof Exception ? 22 : 82);
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 23;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 23: {
                    try {
                        if (null != field_i) {
                            statePc = 27;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_23) {
                        caughtException = stateCaught_23;
                        statePc = (stateCaught_23 instanceof Exception ? 26 : 82);
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        field_i = "~/";
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = (stateCaught_24 instanceof Exception ? 26 : 82);
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        statePc = 27;
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 27: {
                    try {
                        ((rk) this).field_j = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
                        statePc = 28;
                        continue stateLoop;
                    } catch (Throwable stateCaught_27) {
                        caughtException = stateCaught_27;
                        statePc = 29;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var5_ref = caughtException;
                        statePc = 30;
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        if (((rk) this).field_p) {
                            statePc = 37;
                        } else {
                            statePc = 31;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        java.lang.reflect.Method discarded$7 = Class.forName("java.awt.Component").getDeclaredMethod("setFocusTraversalKeysEnabled", new Class[1]);
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = (stateCaught_31 instanceof Exception ? 33 : 82);
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 34;
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        field_e = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
                        statePc = 35;
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = (stateCaught_34 instanceof Exception ? 36 : 82);
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 36: {
                    try {
                        var5 = (Exception) (Object) caughtException;
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_36) {
                        caughtException = stateCaught_36;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        qc.a(field_t, field_v, 73);
                        if (!((rk) this).field_q) {
                            statePc = 60;
                        } else {
                            statePc = 38;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 38: {
                    try {
                        ((rk) this).field_g = new fs(qc.a("random.dat", 1, field_v, (String) null), "rw", 25L);
                        ((rk) this).field_n = new fs(qc.a(true, "main_file_cache.dat2"), "rw", 314572800L);
                        ((rk) this).field_a = new fs(qc.a(true, "main_file_cache.idx255"), "rw", 1048576L);
                        ((rk) this).field_r = new fs[param2];
                        var5_int = 0;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_38) {
                        caughtException = stateCaught_38;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        if (var5_int >= param2) {
                            statePc = 42;
                        } else {
                            statePc = 40;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = (stateCaught_39 instanceof Exception ? 41 : 82);
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        ((rk) this).field_r[var5_int] = new fs(qc.a(true, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                        var5_int++;
                        statePc = 39;
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = (stateCaught_40 instanceof Exception ? 41 : 82);
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 42: {
                    try {
                        if (((rk) this).field_p) {
                            statePc = 45;
                        } else {
                            statePc = 43;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_42) {
                        caughtException = stateCaught_42;
                        statePc = (stateCaught_42 instanceof Exception ? 44 : 82);
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = (stateCaught_43 instanceof Exception ? 44 : 82);
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        Object discarded$8 = Class.forName("f").newInstance();
                        statePc = 46;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 47;
                        continue stateLoop;
                    }
                }
                case 46: {
                    try {
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_46) {
                        caughtException = stateCaught_46;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        var5_ref = caughtException;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        if (!((rk) this).field_p) {
                            statePc = 51;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        ((rk) this).field_x = new pc();
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 51: {
                    try {
                        ((rk) this).field_m = Class.forName("il").newInstance();
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_51) {
                        caughtException = stateCaught_51;
                        statePc = 53;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        var5_ref = caughtException;
                        statePc = 54;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 54: {
                    try {
                        if (((rk) this).field_p) {
                            statePc = 57;
                        } else {
                            statePc = 55;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_54) {
                        caughtException = stateCaught_54;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        ((rk) this).field_h = Class.forName("wr").newInstance();
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 57: {
                    try {
                        ((rk) this).field_d = new fi();
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_57) {
                        caughtException = stateCaught_57;
                        statePc = 59;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        var5_ref = caughtException;
                        statePc = 60;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 60: {
                    try {
                        if (!((rk) this).field_q) {
                            statePc = 80;
                        } else {
                            statePc = 61;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_60) {
                        caughtException = stateCaught_60;
                        statePc = (stateCaught_60 instanceof Exception ? 63 : 82);
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        if (((rk) this).field_p) {
                            statePc = 80;
                        } else {
                            statePc = 62;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = (stateCaught_61 instanceof Exception ? 63 : 82);
                        continue stateLoop;
                    }
                }
                case 62: {
                    try {
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_62) {
                        caughtException = stateCaught_62;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var5_ref3 = Thread.currentThread().getThreadGroup();
                        var6 = var5_ref3.getParent();
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var6 == null) {
                            statePc = 67;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        var5_ref3 = var6;
                        var6 = var5_ref3.getParent();
                        statePc = 65;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 67: {
                    try {
                        var7 = new Thread[1000];
                        int discarded$9 = var5_ref3.enumerate(var7);
                        var8 = 0;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_67) {
                        caughtException = stateCaught_67;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        if (var8 >= var7.length) {
                            statePc = 80;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = (stateCaught_68 instanceof Exception ? 71 : 82);
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        if (var7[var8] == null) {
                            statePc = 79;
                        } else {
                            statePc = 70;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = (stateCaught_69 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 70: {
                    try {
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_70) {
                        caughtException = stateCaught_70;
                        statePc = (stateCaught_70 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = (stateCaught_71 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        stackOut_72_0 = (Thread[]) var7;
                        stackIn_73_0 = stackOut_72_0;
                        statePc = 73;
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = (stateCaught_72 instanceof Exception ? 75 : 82);
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        if (!((Thread) (Object) stackIn_73_0[var8]).getName().startsWith("AWT")) {
                            statePc = 79;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = (stateCaught_73 instanceof Exception ? 78 : 82);
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        statePc = 76;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = (stateCaught_74 instanceof Exception ? 78 : 82);
                        continue stateLoop;
                    }
                }
                case 75: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_75) {
                        caughtException = stateCaught_75;
                        statePc = (stateCaught_75 instanceof Exception ? 78 : 82);
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        var7[var8].setPriority(1);
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = (stateCaught_76 instanceof Exception ? 78 : 82);
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        statePc = 79;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        throw (RuntimeException) (Object) caughtException;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 79: {
                    try {
                        var8++;
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_79) {
                        caughtException = stateCaught_79;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 80: {
                    try {
                        ((rk) this).field_c = false;
                        ((rk) this).field_s = new Thread((Runnable) this);
                        ((rk) this).field_s.setPriority(10);
                        ((rk) this).field_s.setDaemon(true);
                        ((rk) this).field_s.start();
                        statePc = 83;
                        continue stateLoop;
                    } catch (Throwable stateCaught_80) {
                        caughtException = stateCaught_80;
                        statePc = 82;
                        continue stateLoop;
                    }
                }
                case 82: {
                    var5_ref2 = (RuntimeException) (Object) caughtException;
                    throw var5_ref2;
                }
                case 83: {
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
