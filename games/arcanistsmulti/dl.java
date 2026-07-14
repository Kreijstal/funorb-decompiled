/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class dl implements Runnable {
    private og field_x;
    private static volatile long field_w;
    kb field_e;
    private ca field_m;
    private static String field_t;
    static String field_c;
    private Object field_k;
    private Object field_g;
    static String field_l;
    private boolean field_j;
    kb field_n;
    private static String field_i;
    kb field_q;
    private boolean field_v;
    kb[] field_d;
    private static String field_h;
    private t field_u;
    boolean field_p;
    static String field_s;
    private og field_b;
    private static int field_r;
    java.awt.EventQueue field_a;
    static java.lang.reflect.Method field_f;
    private Thread field_o;

    final og a(boolean param0, java.net.URL param1) {
        if (!param0) {
            ((dl) this).field_v = true;
        }
        return this.a(false, 4, 0, 0, (Object) (Object) param1);
    }

    private final static kb a(String param0, int param1, String param2, int param3) {
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
              if (-34 == (param1 ^ -1)) {
                var4 = "jagex_" + param2 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if (param1 == 34) {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param2 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_h, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              if (param3 == 10000) {
                break L1;
              } else {
                field_l = null;
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
                  var8_ref = new kb(new File(var7, var4), "rw", 10000L);
                  stackOut_13_0 = (kb) var8_ref;
                  stackIn_14_0 = stackOut_13_0;
                } catch (java.lang.Exception decompiledCaughtParameter) {
                  decompiledCaughtException = decompiledCaughtParameter;
                  return (kb) (Object) stackIn_14_0;
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

    final og b(int param0) {
        if (param0 != -27886) {
            Object var3 = null;
            og discarded$0 = ((dl) this).a(-93, true, (String) null);
        }
        return this.a(false, 5, 0, 0, (Object) null);
    }

    final og a(int param0, boolean param1, String param2) {
        if (!param1) {
            field_i = null;
        }
        return this.a(false, param2, (byte) 46, param0);
    }

    public final void run() {
        try {
            Object var2 = null;
            ThreadDeath var2_ref = null;
            Throwable var2_ref2 = null;
            int var2_int = 0;
            InterruptedException var3 = null;
            Exception var3_ref = null;
            hj var3_ref2 = null;
            kb var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            og var8 = null;
            Object[] var9 = null;
            String var10 = null;
            java.awt.Component var11 = null;
            String var12 = null;
            Object[] var13 = null;
            java.awt.Frame var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            java.awt.datatransfer.Clipboard var16 = null;
            Object[] var17 = null;
            Thread var18 = null;
            int stackIn_55_0 = 0;
            int stackOut_53_0 = 0;
            int stackOut_54_0 = 0;
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
                            if (((dl) this).field_v) {
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
                            if (((dl) this).field_x != null) {
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
                            var8 = ((dl) this).field_x;
                            ((dl) this).field_x = ((dl) this).field_x.field_d;
                            if (((dl) this).field_x == null) {
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
                            ((dl) this).field_b = null;
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
                            var2_int = var8.field_f;
                            if (-2 == var2_int) {
                                statePc = 108;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (-23 == var2_int) {
                                statePc = 102;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (-3 == (var2_int ^ -1)) {
                                statePc = 101;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (4 != var2_int) {
                                statePc = 24;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (qj.b(-26572) >= field_w) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var8.field_g = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_b).openStream());
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (-9 == (var2_int ^ -1)) {
                                statePc = 96;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if ((var2_int ^ -1) != -10) {
                                statePc = 31;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            var9 = (Object[]) var8.field_b;
                            if (!((dl) this).field_p) {
                                statePc = 30;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (null == ((Class) var9[0]).getClassLoader()) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var9[0]).getDeclaredField((String) var9[1]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2_int == 18) {
                                statePc = 95;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2_int == 19) {
                                statePc = 94;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (!((dl) this).field_p) {
                                statePc = 93;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (var2_int != 3) {
                                statePc = 38;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (field_w <= qj.b(-26572)) {
                                statePc = 37;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var10 = (var8.field_c >> 75295768 & 255) + "." + ((var8.field_c & 16726054) >> -1512485584) + "." + ((65321 & var8.field_c) >> -1528070872) + "." + (var8.field_c & 255);
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName(var10).getHostName();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var2_int == 21) {
                                statePc = 89;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (-6 != (var2_int ^ -1)) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!((dl) this).field_j) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            var8.field_g = (Object) (Object) ((dl) this).field_u.a(0);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            var8.field_g = Class.forName("vj").getMethod("listmodes", new Class[0]).invoke(((dl) this).field_g, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (var2_int == 6) {
                                statePc = 86;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if ((var2_int ^ -1) == -8) {
                                statePc = 83;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var2_int == 12) {
                                statePc = 82;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (13 == var2_int) {
                                statePc = 81;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!((dl) this).field_p) {
                                statePc = 50;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2_int ^ -1) == -15) {
                                statePc = 78;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!((dl) this).field_p) {
                                statePc = 58;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var2_int != 15) {
                                statePc = 58;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var8.field_c == 0) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            stackOut_53_0 = 1;
                            stackIn_55_0 = stackOut_53_0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            stackOut_54_0 = 0;
                            stackIn_55_0 = stackOut_54_0;
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var3_int = stackIn_55_0;
                            var11 = (java.awt.Component) var8.field_b;
                            if (!((dl) this).field_j) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            ((dl) this).field_m.a(122, var11, var3_int != 0);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            Object discarded$6 = Class.forName("fa").getDeclaredMethod("showcursor", new Class[2]).invoke(((dl) this).field_k, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((dl) this).field_j) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (-18 == var2_int) {
                                statePc = 77;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (-17 == var2_int) {
                                statePc = 63;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (field_s.startsWith("win")) {
                                statePc = 65;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 76 : (stateCaught_63 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 76 : (stateCaught_64 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var12 = (String) var8.field_b;
                            if (var12.startsWith("http://")) {
                                statePc = 69;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 76 : (stateCaught_65 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!var12.startsWith("https://")) {
                                statePc = 68;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 76 : (stateCaught_66 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 76 : (stateCaught_67 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 76 : (stateCaught_68 instanceof ThreadDeath ? 113 : 114));
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
                            statePc = (stateCaught_69 instanceof Exception ? 76 : (stateCaught_69 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var12.length() <= var5) {
                                statePc = 74;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 76 : (stateCaught_70 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (-1 != var4_ref.indexOf((int) var12.charAt(var5))) {
                                statePc = 73;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 76 : (stateCaught_71 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 76 : (stateCaught_72 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var5++;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 76 : (stateCaught_73 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var12 + "\"");
                            var8.field_g = null;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 76 : (stateCaught_74 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var13 = (Object[]) var8.field_b;
                            Object discarded$8 = Class.forName("fa").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((dl) this).field_k, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var3_int = var8.field_c;
                            var4 = var8.field_a;
                            if (((dl) this).field_j) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            Object discarded$9 = Class.forName("fa").getDeclaredMethod("movemouse", new Class[2]).invoke(((dl) this).field_k, new Object[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            ((dl) this).field_m.a(26899, var4, var3_int);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var3_ref3 = dl.a((String) var8.field_b, field_r, "", 10000);
                            var8.field_g = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var3_ref3 = dl.a((String) var8.field_b, field_r, field_i, 10000);
                            var8.field_g = (Object) (Object) var3_ref3;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (!((dl) this).field_j) {
                                statePc = 85;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((dl) this).field_u.a((java.awt.Frame) var8.field_b, (byte) 6);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Object discarded$10 = Class.forName("vj").getMethod("exit", new Class[0]).invoke(((dl) this).field_g, new Object[0]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var14 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_g = (Object) (Object) var14;
                            var14.setResizable(false);
                            if (!((dl) this).field_j) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            ((dl) this).field_u.a(18, var8.field_a >> -289391728, var8.field_c & 65535, var14, var8.field_c >>> -61650896, var8.field_a & 65535);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            Object discarded$11 = Class.forName("vj").getMethod("enter", new Class[5]).invoke(((dl) this).field_g, new Object[5]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            if (field_w > qj.b(-26572)) {
                                statePc = 91;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var8.field_g = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_b).getAddress();
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_b;
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var15.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var16 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_g = (Object) (Object) var16.getContents((Object) null);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var17 = (Object[]) var8.field_b;
                            if (((dl) this).field_p) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (((Class) var17[0]).getClassLoader() != null) {
                                statePc = 100;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var8.field_g = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var18 = new Thread((Runnable) var8.field_b);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_c);
                            var8.field_g = (Object) (Object) var18;
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if ((qj.b(-26572) ^ -1L) > (field_w ^ -1L)) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var8.field_g = (Object) (Object) ka.a((String) var8.field_b, var8.field_c, 0).b((byte) -128);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof hj ? 107 : (stateCaught_105 instanceof ThreadDeath ? 113 : 114));
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var3_ref2 = (hj) (Object) caughtException;
                            var8.field_g = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if ((qj.b(-26572) ^ -1L) <= (field_w ^ -1L)) {
                                statePc = 110;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            var8.field_g = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_b), var8.field_c);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8.field_e = 1;
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 113 : 114);
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 114: {
                        var2_ref2 = caughtException;
                        var8.field_e = 2;
                        statePc = 115;
                        continue stateLoop;
                    }
                    case 115: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 116;
                        continue stateLoop;
                    }
                    case 116: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_116) {
                            caughtException = stateCaught_116;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 118: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 119;
                            continue stateLoop;
                        } catch (Throwable stateCaught_118) {
                            caughtException = stateCaught_118;
                            statePc = 118;
                            continue stateLoop;
                        }
                    }
                    case 119: {
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

    final og a(java.awt.Frame param0, int param1) {
        if (param1 != 6) {
            Object var4 = null;
            og discarded$0 = ((dl) this).a(-82, (String) null, (Class[]) null, (Class) null);
        }
        return this.a(false, 7, 0, 0, (Object) (Object) param0);
    }

    final void a(int param0) {
        try {
            Object var2_ref_Object = null;
            InterruptedException var2_ref_InterruptedException = null;
            IOException var2_ref_IOException = null;
            int var2 = 0;
            Throwable var3 = null;
            int var3_int = 0;
            IOException var3_ref = null;
            IOException var4 = null;
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
                            ((dl) this).field_v = true;
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
                            ((dl) this).field_o.join();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var2_ref_InterruptedException = (InterruptedException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (null == ((dl) this).field_q) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            ((dl) this).field_q.c(-103);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2_ref_IOException = (IOException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (((dl) this).field_e == null) {
                            statePc = 16;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        try {
                            ((dl) this).field_e.c(101);
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 15;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        var2_ref_IOException = (IOException) (Object) caughtException;
                        statePc = 16;
                        continue stateLoop;
                    }
                    case 16: {
                        var2 = -36 % ((param0 - -60) / 54);
                        if (((dl) this).field_d == null) {
                            statePc = 25;
                        } else {
                            statePc = 17;
                        }
                        continue stateLoop;
                    }
                    case 17: {
                        var3_int = 0;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 18: {
                        if (var3_int >= ((dl) this).field_d.length) {
                            statePc = 25;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        if (null != ((dl) this).field_d[var3_int]) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var3_int++;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 22: {
                        try {
                            ((dl) this).field_d[var3_int].c(101);
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 24;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        var3_int++;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 24: {
                        var4 = (IOException) (Object) caughtException;
                        var3_int++;
                        statePc = 18;
                        continue stateLoop;
                    }
                    case 25: {
                        if (null == ((dl) this).field_n) {
                            statePc = 29;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    }
                    case 26: {
                        try {
                            ((dl) this).field_n.c(-20);
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 28;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        var3_ref = (IOException) (Object) caughtException;
                        statePc = 29;
                        continue stateLoop;
                    }
                    case 29: {
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

    private final og a(boolean param0, String param1, byte param2, int param3) {
        if (param2 <= 8) {
            boolean discarded$0 = ((dl) this).a((byte) -97);
        }
        return this.a(false, param0 ? 22 : 1, 0, param3, (Object) (Object) param1);
    }

    private final og a(boolean param0, int param1, int param2, int param3, Object param4) {
        og var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object stackIn_3_0 = null;
        Object stackOut_2_0 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new og();
                    var6.field_b = param4;
                    var6.field_f = param1;
                    var6.field_a = param2;
                    var6.field_c = param3;
                    var7 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (!param0) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        // monitorexit var7
                        stackOut_2_0 = null;
                        stackIn_3_0 = stackOut_2_0;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return (og) (Object) stackIn_3_0;
                }
                case 4: {
                    try {
                        if (null == ((dl) this).field_b) {
                            statePc = 6;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        ((dl) this).field_b.field_d = var6;
                        ((dl) this).field_b = var6;
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        ((dl) this).field_x = var6;
                        ((dl) this).field_b = var6;
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
                        this.notify();
                        // monitorexit var7
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 9: {
                    try {
                        var8 = caughtException;
                        // monitorexit var7
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_9) {
                        caughtException = stateCaught_9;
                        statePc = 9;
                        continue stateLoop;
                    }
                }
                case 10: {
                    throw (RuntimeException) (Object) var8;
                }
                case 11: {
                    return var6;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    final og a(byte param0, String param1, Class param2) {
        if (param0 != -95) {
            ((dl) this).field_d = null;
        }
        return this.a(false, 9, 0, 0, (Object) (Object) new Object[2]);
    }

    final og a(int param0, int param1, int param2, int param3, int param4) {
        if (param2 <= 94) {
            ((dl) this).field_j = true;
        }
        return this.a(false, 6, (param1 << -1227485840) + param4, (param0 << -661178480) - -param3, (Object) null);
    }

    final boolean a(byte param0) {
        if (!((dl) this).field_p) {
            return false;
        }
        if (param0 != 46) {
            og discarded$0 = ((dl) this).b(53);
        }
        if (((dl) this).field_j) {
            return null != ((dl) this).field_u ? true : false;
        }
        return ((dl) this).field_g != null ? true : false;
    }

    final og a(int param0, String param1, Class[] param2, Class param3) {
        if (param0 != -30176) {
            field_l = null;
        }
        return this.a(false, 8, 0, 0, (Object) (Object) new Object[3]);
    }

    final og a(int param0, int param1, Runnable param2) {
        if (param0 < 121) {
            field_t = null;
        }
        return this.a(false, 2, 0, param1, (Object) (Object) param2);
    }

    dl(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        t var7 = null;
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
                    ((dl) this).field_x = null;
                    ((dl) this).field_j = false;
                    ((dl) this).field_v = false;
                    ((dl) this).field_q = null;
                    ((dl) this).field_e = null;
                    ((dl) this).field_n = null;
                    ((dl) this).field_b = null;
                    ((dl) this).field_p = false;
                    field_l = "Unknown";
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
                    ((dl) this).field_p = stackIn_3_1 != 0;
                    field_r = param0;
                    field_c = "1.1";
                    field_i = param1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_l = System.getProperty("java.vendor");
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
                    if ((field_l.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((dl) this).field_j = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_t = System.getProperty("os.name");
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
                    field_t = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_s = field_t.toLowerCase();
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
                        field_h = System.getProperty("user.home");
                        if (field_h == null) {
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
                        field_h = field_h + "/";
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
                    if (null != field_h) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_h = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((dl) this).field_a = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((dl) this).field_j) {
                        statePc = 30;
                    } else {
                        statePc = 36;
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
                        field_f = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    nd.a(field_i, field_r, true);
                    if (!((dl) this).field_p) {
                        statePc = 54;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((dl) this).field_n = new kb(nd.a("random.dat", -3, field_r, (String) null), "rw", 25L);
                    ((dl) this).field_q = new kb(nd.a((byte) 67, "main_file_cache.dat2"), "rw", 314572800L);
                    ((dl) this).field_e = new kb(nd.a((byte) 67, "main_file_cache.idx255"), "rw", 1048576L);
                    ((dl) this).field_d = new kb[param2];
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
                    ((dl) this).field_d[var5_int] = new kb(nd.a((byte) 67, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (!((dl) this).field_j) {
                        statePc = 44;
                    } else {
                        statePc = 41;
                    }
                    continue stateLoop;
                }
                case 41: {
                    try {
                        Object discarded$7 = Class.forName("te").newInstance();
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
                        if (((dl) this).field_j) {
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
                        ((dl) this).field_g = Class.forName("vj").newInstance();
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
                        var7 = new t();
                        ((dl) this).field_u = var7;
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
                        if (!((dl) this).field_j) {
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
                        ((dl) this).field_m = new ca();
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
                        ((dl) this).field_k = Class.forName("fa").newInstance();
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
                    ((dl) this).field_v = false;
                    ((dl) this).field_o = new Thread((Runnable) this);
                    ((dl) this).field_o.setPriority(10);
                    ((dl) this).field_o.setDaemon(true);
                    ((dl) this).field_o.start();
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
