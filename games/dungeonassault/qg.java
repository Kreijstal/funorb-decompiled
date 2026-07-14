/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class qg implements Runnable {
    private boolean field_w;
    static String field_p;
    private static String field_r;
    private static volatile long field_a;
    private static String field_k;
    private Object field_b;
    private pn field_u;
    static String field_c;
    static String field_n;
    private ma field_m;
    qp[] field_v;
    private Thread field_f;
    private static String field_i;
    private on field_l;
    boolean field_j;
    private static int field_t;
    qp field_h;
    static java.lang.reflect.Method field_g;
    java.awt.EventQueue field_e;
    private Object field_s;
    qp field_q;
    qp field_x;
    private boolean field_d;
    private pn field_o;

    private final static qp a(String param0, String param1, int param2, int param3) {
        try {
            String var4 = null;
            Object[] var5 = null;
            String[] var5_array = null;
            int var6 = 0;
            String var7 = null;
            Exception var8 = null;
            qp var8_ref = null;
            Object var9 = null;
            qp stackIn_14_0 = null;
            Throwable decompiledCaughtException = null;
            qp stackOut_13_0 = null;
            L0: {
              if ((param3 ^ -1) == -34) {
                var4 = "jagex_" + param1 + "_preferences" + param0 + "_rc.dat";
                break L0;
              } else {
                if ((param3 ^ -1) == -35) {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + "_wip.dat";
                  break L0;
                } else {
                  var4 = "jagex_" + param1 + "_preferences" + param0 + ".dat";
                  break L0;
                }
              }
            }
            L1: {
              var5_array = new String[]{"c:/rscache/", "/rscache/", field_r, "c:/windows/", "c:/winnt/", "c:/", "/tmp/", ""};
              var6 = 0;
              if (param2 == -35) {
                break L1;
              } else {
                var9 = null;
                qp discarded$1 = qg.a((String) null, (String) null, -3, -52);
                break L1;
              }
            }
            L2: while (true) {
              if (var6 < var5_array.length) {
                L3: {
                  var7 = var5_array[var6];
                  if (-1 <= (var7.length() ^ -1)) {
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
                  var8_ref = new qp(new File(var7, var4), "rw", 10000L);
                  stackOut_13_0 = (qp) var8_ref;
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
            wl var3_ref2 = null;
            qp var3_ref3 = null;
            int var3_int = 0;
            Throwable var4_ref_Throwable = null;
            int var4 = 0;
            String var4_ref = null;
            int var5 = 0;
            Throwable var6 = null;
            java.awt.datatransfer.Transferable var7 = null;
            pn var8 = null;
            String var9 = null;
            java.awt.Frame var10 = null;
            java.awt.Component var11 = null;
            Object[] var12 = null;
            String var13 = null;
            java.awt.datatransfer.Clipboard var14 = null;
            java.awt.datatransfer.Clipboard var15 = null;
            Object[] var16 = null;
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
                            if (!((qg) this).field_w) {
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
                            if (((qg) this).field_o != null) {
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
                            var8 = ((qg) this).field_o;
                            ((qg) this).field_o = ((qg) this).field_o.field_a;
                            if (((qg) this).field_o == null) {
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
                            ((qg) this).field_u = null;
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
                            var4_ref_Throwable = caughtException;
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
                        throw (RuntimeException) (Object) var4_ref_Throwable;
                    }
                    case 16: {
                        try {
                            var2_int = var8.field_e;
                            if (-2 == (var2_int ^ -1)) {
                                statePc = 108;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = (stateCaught_16 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if ((var2_int ^ -1) == -23) {
                                statePc = 102;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = (stateCaught_17 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (2 == var2_int) {
                                statePc = 101;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = (stateCaught_18 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (4 != var2_int) {
                                statePc = 23;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = (stateCaught_19 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (field_a <= kd.c(-2456)) {
                                statePc = 22;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = (stateCaught_20 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = (stateCaught_21 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var8.field_f = (Object) (Object) new DataInputStream(((java.net.URL) var8.field_d).openStream());
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = (stateCaught_22 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2_int == -9) {
                                statePc = 95;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = (stateCaught_23 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (9 == var2_int) {
                                statePc = 90;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = (stateCaught_24 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (-19 == var2_int) {
                                statePc = 89;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = (stateCaught_25 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if ((var2_int ^ -1) == -20) {
                                statePc = 88;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = (stateCaught_26 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (((qg) this).field_j) {
                                statePc = 29;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = (stateCaught_27 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = (stateCaught_28 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if ((var2_int ^ -1) != -4) {
                                statePc = 33;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = (stateCaught_29 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if ((kd.c(-2456) ^ -1L) <= (field_a ^ -1L)) {
                                statePc = 32;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = (stateCaught_30 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = (stateCaught_31 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            var9 = (255 & var8.field_g >> 125883832) + "." + (255 & var8.field_g >> 1123390064) + "." + (255 & var8.field_g >> -1786608568) + "." + (255 & var8.field_g);
                            var8.field_f = (Object) (Object) java.net.InetAddress.getByName(var9).getHostName();
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = (stateCaught_32 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (-22 != (var2_int ^ -1)) {
                                statePc = 38;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = (stateCaught_33 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if ((kd.c(-2456) ^ -1L) > (field_a ^ -1L)) {
                                statePc = 36;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = (stateCaught_34 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = (stateCaught_35 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = (stateCaught_36 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var8.field_f = (Object) (Object) java.net.InetAddress.getByName((String) var8.field_d).getAddress();
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = (stateCaught_37 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (-6 == (var2_int ^ -1)) {
                                statePc = 85;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = (stateCaught_38 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            if (6 != var2_int) {
                                statePc = 43;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = (stateCaught_39 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            var10 = new java.awt.Frame("Jagex Full Screen");
                            var8.field_f = (Object) (Object) var10;
                            var10.setResizable(false);
                            if (((qg) this).field_d) {
                                statePc = 42;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = (stateCaught_40 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            Object discarded$6 = Class.forName("eo").getMethod("enter", new Class[5]).invoke(((qg) this).field_b, new Object[5]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = (stateCaught_41 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            ((qg) this).field_m.a((byte) 6, var10, var8.field_g >>> 1376249200, var8.field_g & 65535, var8.field_b >> 414241968, 65535 & var8.field_b);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = (stateCaught_42 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            if (-8 == (var2_int ^ -1)) {
                                statePc = 82;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = (stateCaught_43 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if ((var2_int ^ -1) != -13) {
                                statePc = 46;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = (stateCaught_44 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var3_ref3 = qg.a((String) var8.field_d, field_k, -35, field_t);
                            var8.field_f = (Object) (Object) var3_ref3;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = (stateCaught_45 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var2_int == -14) {
                                statePc = 81;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = (stateCaught_46 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (!((qg) this).field_j) {
                                statePc = 50;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = (stateCaught_47 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-15 == var2_int) {
                                statePc = 78;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = (stateCaught_48 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = (stateCaught_49 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!((qg) this).field_j) {
                                statePc = 58;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = (stateCaught_50 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            if (15 != var2_int) {
                                statePc = 58;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = (stateCaught_51 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (var8.field_g == 0) {
                                statePc = 54;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = (stateCaught_52 instanceof ThreadDeath ? 114 : 115);
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
                            statePc = (stateCaught_53 instanceof ThreadDeath ? 114 : 115);
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
                            statePc = (stateCaught_54 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var3_int = stackIn_55_0;
                            var11 = (java.awt.Component) var8.field_d;
                            if (((qg) this).field_d) {
                                statePc = 57;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = (stateCaught_55 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            Object discarded$7 = Class.forName("w").getDeclaredMethod("showcursor", new Class[2]).invoke(((qg) this).field_s, new Object[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = (stateCaught_56 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            ((qg) this).field_l.a(-14677, var11, var3_int != 0);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = (stateCaught_57 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            if (((qg) this).field_d) {
                                statePc = 61;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = (stateCaught_58 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if ((var2_int ^ -1) != -18) {
                                statePc = 61;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = (stateCaught_59 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            var12 = (Object[]) var8.field_d;
                            Object discarded$8 = Class.forName("w").getDeclaredMethod("setcustomcursor", new Class[5]).invoke(((qg) this).field_s, new Object[5]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = (stateCaught_60 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (16 != var2_int) {
                                statePc = 77;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = (stateCaught_61 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            if (field_n.startsWith("win")) {
                                statePc = 64;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = (stateCaught_62 instanceof Exception ? 76 : (stateCaught_62 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = (stateCaught_63 instanceof Exception ? 76 : (stateCaught_63 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            var13 = (String) var8.field_d;
                            if (var13.startsWith("http://")) {
                                statePc = 68;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = (stateCaught_64 instanceof Exception ? 76 : (stateCaught_64 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (!var13.startsWith("https://")) {
                                statePc = 67;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = (stateCaught_65 instanceof Exception ? 76 : (stateCaught_65 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = (stateCaught_66 instanceof Exception ? 76 : (stateCaught_66 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = (stateCaught_67 instanceof Exception ? 76 : (stateCaught_67 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var4_ref = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789?&=,.%+-_#:/*";
                            var5 = 0;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = (stateCaught_68 instanceof Exception ? 76 : (stateCaught_68 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (var13.length() <= var5) {
                                statePc = 74;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = (stateCaught_69 instanceof Exception ? 76 : (stateCaught_69 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (var4_ref.indexOf((int) var13.charAt(var5)) == -1) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = (stateCaught_70 instanceof Exception ? 76 : (stateCaught_70 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = (stateCaught_71 instanceof Exception ? 76 : (stateCaught_71 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            throw (RuntimeException) (Object) new Exception();
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = (stateCaught_72 instanceof Exception ? 76 : (stateCaught_72 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            var5++;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = (stateCaught_73 instanceof Exception ? 76 : (stateCaught_73 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            Process discarded$9 = Runtime.getRuntime().exec("cmd /c start \"j\" \"" + var13 + "\"");
                            var8.field_f = null;
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = (stateCaught_74 instanceof Exception ? 76 : (stateCaught_74 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = (stateCaught_75 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var3_ref = (Exception) (Object) caughtException;
                            var8.field_f = (Object) (Object) var3_ref;
                            throw (RuntimeException) (Object) var3_ref;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = (stateCaught_76 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            throw (RuntimeException) (Object) new Exception("");
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = (stateCaught_77 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            var3_int = var8.field_g;
                            var4 = var8.field_b;
                            if (!((qg) this).field_d) {
                                statePc = 80;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = (stateCaught_78 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            ((qg) this).field_l.a(var3_int, true, var4);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = (stateCaught_79 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            Object discarded$10 = Class.forName("w").getDeclaredMethod("movemouse", new Class[2]).invoke(((qg) this).field_s, new Object[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = (stateCaught_80 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var3_ref3 = qg.a((String) var8.field_d, "", -35, field_t);
                            var8.field_f = (Object) (Object) var3_ref3;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = (stateCaught_81 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (((qg) this).field_d) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = (stateCaught_82 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            Object discarded$11 = Class.forName("eo").getMethod("exit", new Class[0]).invoke(((qg) this).field_b, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = (stateCaught_83 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ((qg) this).field_m.a(42, (java.awt.Frame) var8.field_d);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = (stateCaught_84 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            if (((qg) this).field_d) {
                                statePc = 87;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = (stateCaught_85 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var8.field_f = Class.forName("eo").getMethod("listmodes", new Class[0]).invoke(((qg) this).field_b, new Object[0]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = (stateCaught_86 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var8.field_f = (Object) (Object) ((qg) this).field_m.a(10127);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = (stateCaught_87 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var7 = (java.awt.datatransfer.Transferable) var8.field_d;
                            var14 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var14.setContents(var7, (java.awt.datatransfer.ClipboardOwner) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = (stateCaught_88 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var15 = java.awt.Toolkit.getDefaultToolkit().getSystemClipboard();
                            var8.field_f = (Object) (Object) var15.getContents((Object) null);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = (stateCaught_89 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var16 = (Object[]) var8.field_d;
                            if (!((qg) this).field_j) {
                                statePc = 94;
                            } else {
                                statePc = 91;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = (stateCaught_90 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (null == ((Class) var16[0]).getClassLoader()) {
                                statePc = 93;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = (stateCaught_91 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = (stateCaught_92 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = (stateCaught_93 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var8.field_f = (Object) (Object) ((Class) var16[0]).getDeclaredField((String) var16[1]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = (stateCaught_94 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            var17 = (Object[]) var8.field_d;
                            if (((qg) this).field_j) {
                                statePc = 97;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = (stateCaught_95 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = (stateCaught_96 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (((Class) var17[0]).getClassLoader() == null) {
                                statePc = 99;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = (stateCaught_97 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = (stateCaught_98 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            throw new SecurityException();
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = (stateCaught_99 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var8.field_f = (Object) (Object) ((Class) var17[0]).getDeclaredMethod((String) var17[1], (Class[]) var17[2]);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = (stateCaught_100 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            var18 = new Thread((Runnable) var8.field_d);
                            var18.setDaemon(true);
                            var18.start();
                            var18.setPriority(var8.field_g);
                            var8.field_f = (Object) (Object) var18;
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = (stateCaught_101 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (field_a > kd.c(-2456)) {
                                statePc = 104;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = (stateCaught_102 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = (stateCaught_103 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = (stateCaught_104 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var8.field_f = (Object) (Object) bp.a(var8.field_g, (byte) 127, (String) var8.field_d).b(13905);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = (stateCaught_105 instanceof wl ? 107 : (stateCaught_105 instanceof ThreadDeath ? 114 : 115));
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = (stateCaught_106 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var3_ref2 = (wl) (Object) caughtException;
                            var8.field_f = (Object) (Object) var3_ref2.getMessage();
                            throw var3_ref2;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = (stateCaught_107 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if ((kd.c(-2456) ^ -1L) > (field_a ^ -1L)) {
                                statePc = 110;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = (stateCaught_108 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = (stateCaught_109 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = (stateCaught_110 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var8.field_f = (Object) (Object) new java.net.Socket(java.net.InetAddress.getByName((String) var8.field_d), var8.field_g);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = (stateCaught_111 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var8.field_c = 1;
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = (stateCaught_112 instanceof ThreadDeath ? 114 : 115);
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        var2_ref = (ThreadDeath) (Object) caughtException;
                        throw var2_ref;
                    }
                    case 115: {
                        var2_ref2 = caughtException;
                        var8.field_c = 2;
                        statePc = 116;
                        continue stateLoop;
                    }
                    case 116: {
                        var2 = (Object) (Object) var8;
                        // monitorenter var8
                        statePc = 117;
                        continue stateLoop;
                    }
                    case 117: {
                        try {
                            ((Object) (Object) var8).notify();
                            // monitorexit var2
                            statePc = 0;
                            continue stateLoop;
                        } catch (Throwable stateCaught_117) {
                            caughtException = stateCaught_117;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 119: {
                        try {
                            var6 = caughtException;
                            // monitorexit var2
                            statePc = 120;
                            continue stateLoop;
                        } catch (Throwable stateCaught_119) {
                            caughtException = stateCaught_119;
                            statePc = 119;
                            continue stateLoop;
                        }
                    }
                    case 120: {
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

    final pn a(int param0, java.net.URL param1) {
        if (param0 != -18) {
            return null;
        }
        return this.a(0, (Object) (Object) param1, 6, 4, 0);
    }

    final boolean a(int param0) {
        if (!((qg) this).field_j) {
            return false;
        }
        if (param0 < 25) {
            Object var3 = null;
            pn discarded$0 = ((qg) this).a((java.awt.Frame) null, (byte) -13);
        }
        if (!((qg) this).field_d) {
            return ((qg) this).field_b != null ? true : false;
        }
        return ((qg) this).field_m != null ? true : false;
    }

    private final pn a(int param0, Object param1, int param2, int param3, int param4) {
        pn var6 = null;
        Object var7 = null;
        Throwable var8 = null;
        Object var9 = null;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    if (param2 == 6) {
                        statePc = 2;
                    } else {
                        statePc = 1;
                    }
                    continue stateLoop;
                }
                case 1: {
                    var9 = null;
                    pn discarded$3 = ((qg) this).a(91, 66, (String) null);
                    statePc = 2;
                    continue stateLoop;
                }
                case 2: {
                    var6 = new pn();
                    var6.field_d = param1;
                    var6.field_g = param0;
                    var6.field_e = param3;
                    var6.field_b = param4;
                    var7 = this;
                    // monitorenter this
                    statePc = 3;
                    continue stateLoop;
                }
                case 3: {
                    try {
                        if (null == ((qg) this).field_u) {
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
                        ((qg) this).field_u.field_a = var6;
                        ((qg) this).field_u = var6;
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
                        ((qg) this).field_o = var6;
                        ((qg) this).field_u = var6;
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

    final pn a(int param0, int param1, String param2) {
        if (param0 >= -68) {
            return null;
        }
        return this.a(false, param2, param1, 1);
    }

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
                            ((qg) this).field_w = true;
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
                            ((qg) this).field_f.join();
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 7;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        var2_ref = (InterruptedException) (Object) caughtException;
                        statePc = 8;
                        continue stateLoop;
                    }
                    case 8: {
                        if (((qg) this).field_x == null) {
                            statePc = 12;
                        } else {
                            statePc = 9;
                        }
                        continue stateLoop;
                    }
                    case 9: {
                        try {
                            ((qg) this).field_x.a(param0 ^ -119);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 11;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        var2_ref2 = (IOException) (Object) caughtException;
                        statePc = 12;
                        continue stateLoop;
                    }
                    case 12: {
                        if (param0 == -119) {
                            statePc = 14;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    }
                    case 13: {
                        field_i = null;
                        statePc = 14;
                        continue stateLoop;
                    }
                    case 14: {
                        if (((qg) this).field_q == null) {
                            statePc = 18;
                        } else {
                            statePc = 15;
                        }
                        continue stateLoop;
                    }
                    case 15: {
                        try {
                            ((qg) this).field_q.a(0);
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
                        if (null != ((qg) this).field_v) {
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
                        if (var2_int >= ((qg) this).field_v.length) {
                            statePc = 27;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        if (null != ((qg) this).field_v[var2_int]) {
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
                            ((qg) this).field_v[var2_int].a(0);
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
                        if (null != ((qg) this).field_h) {
                            statePc = 29;
                        } else {
                            statePc = 32;
                        }
                        continue stateLoop;
                    }
                    case 29: {
                        try {
                            ((qg) this).field_h.a(param0 ^ -119);
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

    final pn a(int param0, int param1, Runnable param2) {
        if (param0 != -21432) {
            return null;
        }
        return this.a(param1, (Object) (Object) param2, 6, 2, 0);
    }

    final pn a(byte param0, int param1, int param2, int param3, int param4) {
        if (param0 >= -10) {
            Object var7 = null;
            pn discarded$0 = ((qg) this).a(-77, -50, (Runnable) null);
        }
        return this.a((param2 << 723897136) - -param4, (Object) null, 6, 6, param1 + (param3 << -2072740144));
    }

    final pn a(java.awt.Component param0, byte param1, boolean param2) {
        if (param1 < 13) {
            ((qg) this).field_v = null;
        }
        return this.a(!param2 ? 0 : 1, (Object) (Object) param0, 6, 15, 0);
    }

    final pn a(int param0, Class param1, String param2) {
        if (param0 != 65535) {
            Object var5 = null;
            pn discarded$0 = this.a(21, (Object) null, -63, 47, 126);
        }
        return this.a(0, (Object) (Object) new Object[2], 6, 9, 0);
    }

    final pn a(boolean param0) {
        if (param0) {
            field_a = 9L;
        }
        return this.a(0, (Object) null, 6, 5, 0);
    }

    final pn a(java.awt.Frame param0, byte param1) {
        if (param1 > -36) {
            field_c = null;
        }
        return this.a(0, (Object) (Object) param0, 6, 7, 0);
    }

    final pn a(Class[] param0, Class param1, int param2, String param3) {
        if (param2 != -1) {
            return null;
        }
        return this.a(0, (Object) (Object) new Object[3], 6, 8, 0);
    }

    private final pn a(boolean param0, String param1, int param2, int param3) {
        if (param3 != 1) {
            ((qg) this).field_m = null;
        }
        return this.a(param2, (Object) (Object) param1, 6, param0 ? 22 : 1, 0);
    }

    qg(int param0, String param1, int param2, boolean param3) throws Exception {
        Exception var5 = null;
        Throwable var5_ref = null;
        int var5_int = 0;
        ma var7 = null;
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
                    ((qg) this).field_w = false;
                    ((qg) this).field_u = null;
                    ((qg) this).field_j = false;
                    ((qg) this).field_x = null;
                    ((qg) this).field_h = null;
                    ((qg) this).field_d = false;
                    ((qg) this).field_o = null;
                    ((qg) this).field_q = null;
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
                    ((qg) this).field_j = stackIn_3_1 != 0;
                    field_c = "Unknown";
                    field_k = param1;
                    field_t = param0;
                    field_p = "1.1";
                    statePc = 4;
                    continue stateLoop;
                }
                case 4: {
                    try {
                        field_c = System.getProperty("java.vendor");
                        field_p = System.getProperty("java.version");
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
                    if (-1 == field_c.toLowerCase().indexOf("microsoft")) {
                        statePc = 9;
                    } else {
                        statePc = 8;
                    }
                    continue stateLoop;
                }
                case 8: {
                    ((qg) this).field_d = true;
                    statePc = 9;
                    continue stateLoop;
                }
                case 9: {
                    try {
                        field_i = System.getProperty("os.name");
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
                    field_i = "Unknown";
                    statePc = 12;
                    continue stateLoop;
                }
                case 12: {
                    field_n = field_i.toLowerCase();
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
                        field_r = System.getProperty("user.home");
                        if (null == field_r) {
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
                        field_r = field_r + "/";
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
                    if (field_r != null) {
                        statePc = 25;
                    } else {
                        statePc = 24;
                    }
                    continue stateLoop;
                }
                case 24: {
                    field_r = "~/";
                    statePc = 25;
                    continue stateLoop;
                }
                case 25: {
                    try {
                        ((qg) this).field_e = java.awt.Toolkit.getDefaultToolkit().getSystemEventQueue();
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
                    if (!((qg) this).field_d) {
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
                    nc.a(field_t, 116, field_k);
                    if (!((qg) this).field_j) {
                        statePc = 55;
                    } else {
                        statePc = 37;
                    }
                    continue stateLoop;
                }
                case 37: {
                    ((qg) this).field_h = new qp(nc.a("random.dat", field_t, (String) null, -6665), "rw", 25L);
                    ((qg) this).field_x = new qp(nc.a(0, "main_file_cache.dat2"), "rw", 314572800L);
                    ((qg) this).field_q = new qp(nc.a(0, "main_file_cache.idx255"), "rw", 1048576L);
                    ((qg) this).field_v = new qp[param2];
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
                    ((qg) this).field_v[var5_int] = new qp(nc.a(0, "main_file_cache.idx" + var5_int), "rw", 1048576L);
                    var5_int++;
                    statePc = 38;
                    continue stateLoop;
                }
                case 40: {
                    if (((qg) this).field_d) {
                        statePc = 42;
                    } else {
                        statePc = 45;
                    }
                    continue stateLoop;
                }
                case 42: {
                    try {
                        Object discarded$7 = Class.forName("pl").newInstance();
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
                        if (!((qg) this).field_d) {
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
                        var7 = new ma();
                        ((qg) this).field_m = var7;
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
                        ((qg) this).field_b = Class.forName("eo").newInstance();
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
                        if (!((qg) this).field_d) {
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
                        ((qg) this).field_l = new on();
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
                        ((qg) this).field_s = Class.forName("w").newInstance();
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
                    ((qg) this).field_w = false;
                    ((qg) this).field_f = new Thread((Runnable) this);
                    ((qg) this).field_f.setPriority(10);
                    ((qg) this).field_f.setDaemon(true);
                    ((qg) this).field_f.start();
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 0L;
    }
}
