/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class pn implements Runnable {
    static String field_p;
    sn field_m;
    boolean field_x;
    private boolean field_e;
    static String field_r;
    private static int field_t;
    private vj field_o;
    private pk field_v;
    static String field_w;
    sn field_f;
    sn[] field_a;
    private Thread field_i;
    private Object field_n;
    private static String field_k;
    private boolean field_s;
    private static String field_u;
    private static volatile long field_d;
    private wj field_h;
    private wj field_j;
    sn field_g;
    private static String field_l;
    private Object field_q;
    java.awt.EventQueue field_b;
    static java.lang.reflect.Method field_c;

    final wj a(java.awt.Frame param0, int param1) {
        if (param1 != -1463474960) {
            Object var4 = null;
            wj discarded$0 = ((pn) this).a((String) null, 76, -2);
        }
        return this.a(0, 0, 94, (Object) (Object) param0, 7);
    }

    final wj a(String param0, int param1, int param2) {
        if (param2 != 376255344) {
            field_w = null;
        }
        return this.a(param1, false, false, param0);
    }

    final wj a(int param0, Class param1, String param2) {
        if (param0 != 9) {
            ((pn) this).field_s = false;
        }
        return this.a(0, 0, -93, (Object) (Object) new Object[2], 9);
    }

    final wj a(java.net.URL param0, int param1) {
        if (param1 <= 28) {
            field_k = null;
        }
        return this.a(0, 0, -111, (Object) (Object) param0, 4);
    }

    private final static sn a(String param0, int param1, int param2, String param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            sn var8_ref = null;
            sn stackIn_13_0 = null;
            Throwable decompiledCaughtException = null;
            sn stackOut_12_0 = null;
            L0: {
              if (-34 != (param2 ^ -1)) {
                if (34 == param2) {
                  var4 = "jagex_" + param0 + "_preferences" + param3 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param0 + "_preferences" + param3 + ".dat";
                  break L0;
                }
              } else {
                var4 = "jagex_" + param0 + "_preferences" + param3 + "_rc.dat";
                break L0;
              }
            }
            var5_array = new String[]{"c:/rscache/", "/rscache/", field_l, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
            var6 = 0;
            if (param1 == 11677) {
              L1: while (true) {
                if (var6 < var5_array.length) {
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
                    var8_ref = new sn(new File(var7, var4), "rw", 10000L);
                    stackOut_12_0 = (sn) var8_ref;
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
            } else {
              return null;
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
            InterruptedException var3_ref_InterruptedException = null;
            vg var3_ref_vg = null;
            Exception var3_ref_Exception = null;
            sn var3_ref = null;
            int var3 = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            wj var8 = null;
            Object[] var9 = null;
            Object[] var10 = null;
            java.awt.datatransfer.Clipboard var11 = null;
            java.awt.datatransfer.Clipboard var12 = null;
            String var13 = null;
            Object[] var14 = null;
            java.awt.Component var15 = null;
            java.awt.Frame var16 = null;
            String var17 = null;
            Thread var18 = null;
            int stackIn_93_0 = 0;
            int stackOut_91_0 = 0;
            int stackOut_92_0 = 0;
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
                            if (!((pn) this).field_s) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 13;
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
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        return;
                    }
                    case 4: {
                        try {
                            if (null != ((pn) this).field_j) {
                                statePc = 6;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var8 = ((pn) this).field_j;
                            ((pn) this).field_j = ((pn) this).field_j.field_d;
                            if (null != ((pn) this).field_j) {
                                statePc = 11;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            ((pn) this).field_h = null;
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.wait();
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = (stateCaught_8 instanceof InterruptedException ? 10 : 13);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var3_ref_InterruptedException = (InterruptedException) (Object) caughtException;
                            statePc = 1;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            // monitorexit var2
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var4_ref_Throwable = caughtException;
                            // monitorexit var2
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 13;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 15: {
                        try {
                            var2_int = var8.field_f;
                            if (var2_int != 1) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = (stateCaught_15 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if ((mm.a(105) ^ -1L) > (field_d ^ -1L)) {
                                statePc = 18;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8.field_c = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_b), var8.field_e);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if ((var2_int ^ -1) != -23) {
                                statePc = 26;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if ((field_d ^ -1L) >= (mm.a(80) ^ -1L)) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var8.field_c = (Object) (Object) tc.a((String) var8.field_b, var8.field_e, 22137).a(-90);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof vg ? 25 : (stateCaught_23 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            var3_ref_vg = (vg) (Object) caughtException;
                            var8.field_c = (Object) (Object) var3_ref_vg.getMessage();
                            throw var3_ref_vg;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2_int == 2) {
                                statePc = 112;
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
                            if ((var2_int ^ -1) != -5) {
                                statePc = 32;
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
                            if (mm.a(109) < field_d) {
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
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            var8.field_c = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_b).openStream());
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 115 : 116);
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
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            var9 = (Object[]) var8.field_b;
                            if (((pn) this).field_x) {
                                statePc = 35;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (null == ((Class) var9[0]).getClassLoader()) {
                                statePc = 37;
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
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            var8.field_c = (Object) (Object) ((Class) var9[0]).getDeclaredMethod((String) var9[1], (Class[]) var9[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if ((var2_int ^ -1) != -10) {
                                statePc = 45;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var10 = (Object[]) var8.field_b;
                            if (!((pn) this).field_x) {
                                statePc = 44;
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
                            if (null == ((Class) var10[0]).getClassLoader()) {
                                statePc = 43;
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
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            var8.field_c = (Object) (Object) ((Class) var10[0]).getDeclaredField((String) var10[1]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            if (var2_int != 18) {
                                statePc = 47;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            var11 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_c = (Object) (Object) var11.getContents((Object) null);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (-20 != (var2_int ^ -1)) {
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
                            var7 = (java.awt.datatransfer.Transferable) var8.field_b;
                            var12 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var12.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
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
                            if (((pn) this).field_x) {
                                statePc = 51;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (var2_int == -4) {
                                statePc = 109;
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
                            if (var2_int == -22) {
                                statePc = 105;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-6 == var2_int) {
                                statePc = 102;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            if (-7 == var2_int) {
                                statePc = 99;
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
                            if (-8 != (var2_int ^ -1)) {
                                statePc = 59;
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
                            if (((pn) this).field_e) {
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
                            Object discarded$6 = Class.forName("ga").getMethod("exit", new Class[0]).invoke(((pn) this).field_n, new Object[0]);
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
                            ((pn) this).field_v.a((java.awt.Frame) var8.field_b, (byte) 107);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (var2_int != 12) {
                                statePc = 61;
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
                            var3_ref = pn.a(field_k, 11677, field_t, (String) var8.field_b);
                            var8.field_c = (Object) (Object) var3_ref;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if ((var2_int ^ -1) != -14) {
                                statePc = 63;
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
                            var3_ref = pn.a("", 11677, field_t, (String) var8.field_b);
                            var8.field_c = (Object) (Object) var3_ref;
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (!((pn) this).field_x) {
                                statePc = 66;
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
                            if (-15 == var2_int) {
                                statePc = 96;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
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
                            if (!((pn) this).field_x) {
                                statePc = 69;
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
                            if (-16 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (((pn) this).field_e) {
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
                            if (var2_int == 17) {
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
                            if (-17 != (var2_int ^ -1)) {
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
                            if (!field_w.startsWith("win")) {
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
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof Exception ? 87 : (stateCaught_75 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof Exception ? 87 : (stateCaught_76 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var13 = (String) var8.field_b;
                            if (var13.startsWith("http://")) {
                                statePc = 80;
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
                            if (var13.startsWith("https://")) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof Exception ? 87 : (stateCaught_78 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof Exception ? 87 : (stateCaught_79 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof Exception ? 87 : (stateCaught_80 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var5 >= var13.length()) {
                                statePc = 85;
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
                            if (var4_ref.indexOf((int) var13.charAt(var5)) != -1) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
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
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof Exception ? 87 : (stateCaught_84 instanceof ThreadDeath ? 115 : 116));
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            Process discarded$7 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_c = null;
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
                            var3_ref_Exception = (Exception) (Object) caughtException;
                            var8.field_c = (Object) (Object) var3_ref_Exception;
                            throw (RuntimeException) (Object) var3_ref_Exception;
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
                            var14 = (Object[]) var8.field_b;
                            Object discarded$8 = Class.forName("th").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((pn) this).field_q, new Object[5]);
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
                            if (var8.field_e == 0) {
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
                            stackOut_91_0 = 1;
                            stackIn_93_0 = stackOut_91_0;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            stackOut_92_0 = 0;
                            stackIn_93_0 = stackOut_92_0;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var3 = stackIn_93_0;
                            var15 = (java.awt.Component) var8.field_b;
                            if (!((pn) this).field_e) {
                                statePc = 95;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            ((pn) this).field_o.a(var15, 32512, var3 != 0);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            Object discarded$9 = Class.forName("th").getDeclaredMethod("showcursor", new Class[2]).invoke(((pn) this).field_q, new Object[2]);
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
                            var3 = var8.field_e;
                            var4 = var8.field_g;
                            if (((pn) this).field_e) {
                                statePc = 98;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            Object discarded$10 = Class.forName("th").getDeclaredMethod("movemouse", new Class[2]).invoke(((pn) this).field_q, new Object[2]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            ((pn) this).field_o.a(var4, var3, false);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var16 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_c = (Object) (Object) var16;
                            var16.setResizable(false);
                            if (!((pn) this).field_e) {
                                statePc = 101;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            ((pn) this).field_v.a(var8.field_g & 65535, var16, var8.field_e & 65535, var8.field_g >> -1463474960, (byte) -107, var8.field_e >>> 1391263632);
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
                            Object discarded$11 = Class.forName("ga").getMethod("enter", new Class[5]).invoke(((pn) this).field_n, new Object[5]);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (!((pn) this).field_e) {
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
                            var8.field_c = (Object) (Object) ((pn) this).field_v.a(0);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            var8.field_c = Class.forName("ga").getMethod("listmodes", new Class[0]).invoke(((pn) this).field_n, new Object[0]);
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
                            if ((mm.a(-120) ^ -1L) > (field_d ^ -1L)) {
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
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var8.field_c = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_b).getAddress();
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
                            if (mm.a(75) >= field_d) {
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
                            throw new IOException();
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var17 = (255 & var8.field_e >> 1298511512) + "." + (255 & var8.field_e >> 541883216) + "." + ((65309 & var8.field_e) >> -614610360) + "." + (255 & var8.field_e);
                            var8.field_c = (Object) (Object) java.net.InetAddress.getByName(var17).getHostName();
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 115 : 116);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var18 = new Thread((Runnable) var8.field_b);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_e);
                            var8.field_c = (Object) (Object) var18;
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
                            var8.field_a = 1;
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
                        var8.field_a = 2;
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

    private final wj a(int param0, int param1, int param2, Object param3, int param4) {
        wj var6 = null;
        int var7 = 0;
        Object var8 = null;
        Throwable var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var6 = new wj();
                    var6.field_e = param1;
                    var6.field_b = param3;
                    var6.field_f = param4;
                    var7 = 101 % ((-43 - param2) / 45);
                    var6.field_g = param0;
                    var8 = this;
                    // monitorenter this
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (((pn) this).field_h == null) {
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
                        ((pn) this).field_h.field_d = var6;
                        ((pn) this).field_h = var6;
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
                        ((pn) this).field_j = var6;
                        ((pn) this).field_h = var6;
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
                        // monitorexit var8
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
                        // monitorexit var8
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

    final boolean b(int param0) {
        if (!((pn) this).field_x) {
            return false;
        }
        if (param0 >= -26) {
            return false;
        }
        if (!((pn) this).field_e) {
            return ((pn) this).field_n != null ? true : false;
        }
        return ((pn) this).field_v != null ? true : false;
    }

    final wj a(int param0) {
        if (param0 != -30756) {
            return null;
        }
        return this.a(0, 0, 17, (Object) null, 5);
    }

    final wj a(int param0, int param1, int param2, int param3, int param4) {
        if (param4 != 6) {
            return null;
        }
        return this.a(param1 + (param2 << -505354032), param0 + (param3 << 1282052784), 127, (Object) null, 6);
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
                            ((pn) this).field_s = true;
                            this.notifyAll();
                            if (param0 == 0) {
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
                            field_t = -42;
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
                            ((pn) this).field_i.join();
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
                        if (((pn) this).field_f == null) {
                            statePc = 14;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    }
                    case 11: {
                        try {
                            ((pn) this).field_f.a(true);
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
                        if (null == ((pn) this).field_g) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((pn) this).field_g.a(true);
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
                        if (((pn) this).field_a != null) {
                            statePc = 20;
                        } else {
                            statePc = 27;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        var2_int = 0;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 21: {
                        if (((pn) this).field_a.length <= var2_int) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (null != ((pn) this).field_a[var2_int]) {
                            statePc = 24;
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
                    case 24: {
                        try {
                            ((pn) this).field_a[var2_int].a(true);
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
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 26: {
                        var3_ref = (IOException) (Object) caughtException;
                        var2_int++;
                        statePc = 21;
                        continue stateLoop;
                    }
                    case 27: {
                        if (null == ((pn) this).field_m) {
                            statePc = 31;
                        } else {
                            statePc = 28;
                        }
                        continue stateLoop;
                    }
                    case 28: {
                        try {
                            ((pn) this).field_m.a(true);
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 30;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 31;
                        continue stateLoop;
                    }
                    case 31: {
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

    final wj a(String param0, byte param1, Class param2, Class[] param3) {
        if (param1 != 52) {
            field_k = null;
        }
        return this.a(0, 0, -122, (Object) (Object) new Object[3], 8);
    }

    final wj a(int param0, int param1, Runnable param2) {
        if (param0 != 2) {
            wj discarded$0 = ((pn) this).a(-125, -51, 63, 104, 101);
        }
        return this.a(0, param1, 112, (Object) (Object) param2, 2);
    }

    private final wj a(int param0, boolean param1, boolean param2, String param3) {
        if (param1) {
            Object var6 = null;
            wj discarded$0 = ((pn) this).a((String) null, -15, 36);
        }
        return this.a(0, param0, 108, (Object) (Object) param3, param2 ? 22 : 1);
    }

    pn(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        pk var6 = null;
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
                    ((pn) this).field_m = null;
                    ((pn) this).field_e = false;
                    ((pn) this).field_x = false;
                    ((pn) this).field_f = null;
                    ((pn) this).field_s = false;
                    ((pn) this).field_h = null;
                    ((pn) this).field_j = null;
                    ((pn) this).field_g = null;
                    field_r = "1.1";
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
                    ((pn) this).field_x = stackIn_3_1 != 0;
                    field_t = param0;
                    field_p = "Unknown";
                    field_k = param1;
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_p = System.getProperty("java.vendor");
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
                    if ((field_p.toLowerCase().indexOf("microsoft") ^ -1) == 0) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((pn) this).field_e = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_u = System.getProperty("os.name");
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
                    field_u = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_w = field_u.toLowerCase();
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
                        field_l = System.getProperty("user.home");
                        if (null == field_l) {
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
                        field_l = field_l + "/";
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
                    if (field_l == null) {
                        statePc = 25;
                    } else {
                        statePc = 26;
                    }
                    continue stateLoop;
                }
                case 25: {
                    field_l = "~/";
                    statePc = 26;
                    continue stateLoop;
                }
                case 26: {
                    try {
                        ((pn) this).field_b = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((pn) this).field_e) {
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
                        field_c = Class.forName("java.awt.Container").getDeclaredMethod("setFocusCycleRoot", new Class[1]);
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
                    wm.a(field_k, true, field_t);
                    if (!((pn) this).field_x) {
                        statePc = 56;
                    } else {
                        statePc = 38;
                    }
                    continue stateLoop;
                }
                case 38: {
                    ((pn) this).field_m = new sn(wm.a((String) null, field_t, (byte) 35, "random.dat"), "rw", 25L);
                    ((pn) this).field_f = new sn(wm.a(8244, "main_file_cache.dat2"), "rw", 314572800L);
                    ((pn) this).field_g = new sn(wm.a(8244, "main_file_cache.idx255"), "rw", 1048576L);
                    ((pn) this).field_a = new sn[param2];
                    var5_int = 0;
                    statePc = 39;
                    continue stateLoop;
                }
                case 39: {
                    if (var5_int >= param2) {
                        statePc = 41;
                    } else {
                        statePc = 40;
                    }
                    continue stateLoop;
                }
                case 40: {
                    ((pn) this).field_a[var5_int] = new sn(wm.a(8244, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 39;
                    continue stateLoop;
                }
                case 41: {
                    if (((pn) this).field_e) {
                        statePc = 43;
                    } else {
                        statePc = 46;
                    }
                    continue stateLoop;
                }
                case 43: {
                    try {
                        Object discarded$7 = Class.forName("gg").newInstance();
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
                        if (!((pn) this).field_e) {
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
                        var6 = new pk();
                        ((pn) this).field_v = var6;
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
                        ((pn) this).field_n = Class.forName("ga").newInstance();
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
                        if (((pn) this).field_e) {
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
                        ((pn) this).field_q = Class.forName("th").newInstance();
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
                        ((pn) this).field_o = new vj();
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
                    ((pn) this).field_s = false;
                    ((pn) this).field_i = new Thread((Runnable) this);
                    ((pn) this).field_i.setPriority(10);
                    ((pn) this).field_i.setDaemon(true);
                    ((pn) this).field_i.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = 0L;
    }
}
