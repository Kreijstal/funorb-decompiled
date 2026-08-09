/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class lg extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_a;
    static boolean field_l;
    static String field_b;
    static fh field_g;
    static String field_f;
    boolean field_m;
    public static boolean field_i;
    public static boolean field_h;
    public static int field_d;
    public static boolean field_e;
    public static boolean field_j;
    public static int field_c;
    public static boolean field_k;

    public static void e(int param0) {
        try {
            field_a = null;
            field_g = null;
            field_b = null;
            field_f = null;
            if (param0 != 48) {
                lg.e(-42);
            }
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) ((Object) runtimeException), "lg.CA(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != vd.field_c) {
          return null;
        } else {
          L0: {
            if (fb.field_o == null) {
              break L0;
            } else {
              if (fb.field_o != this) {
                return fb.field_o.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vd.field_c == null) {
              L1: {
                if (null == fb.field_o) {
                  break L1;
                } else {
                  if (fb.field_o != this) {
                    stackIn_10_0 = fb.field_o.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_12_0 = super.getDocumentBase();
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lg.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final void run() {
        try {
            boolean stackIn_50_0 = false;
            boolean stackIn_68_0 = false;
            int stackIn_72_0 = 0;
            int stackIn_72_1 = 0;
            int stackIn_83_0 = 0;
            int stackIn_83_1 = 0;
            int stackIn_97_0 = 0;
            int stackIn_102_0 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            int var2_int = 0;
            java.lang.reflect.Method var2_ref = null;
            int var3 = 0;
            Throwable var3_ref_Throwable = null;
            String var4 = null;
            int var5 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (pn.field_p != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var1 = pn.field_p.toLowerCase();
                            if (-1 != ((String) (var1)).indexOf("sun")) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((String) (var1)).indexOf("apple") == -1) {
                                statePc = 63;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = pn.field_r;
                            if (var2.equals("1.1")) {
                                statePc = 41;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 41;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 41;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 41;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 41;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 41;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 41;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 41;
                            } else {
                                statePc = 28;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 41;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 41;
                            } else {
                                statePc = 34;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            if (var2.equals("1.6.0")) {
                                statePc = 41;
                            } else {
                                statePc = 37;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            this.a("wrongjava", -16946);
                            if (var5 == 0) {
                                statePc = 110;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (var2.startsWith("1.6.0_")) {
                                statePc = 47;
                            } else {
                                statePc = 43;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            var3 = 6;
                            statePc = 48;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var3 ^ -1) <= (var2.length() ^ -1)) {
                                statePc = 56;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackIn_68_0 = oa.a(-4278, var2.charAt(var3));
                            stackIn_50_0 = stackIn_68_0;
                            if (var5 != 0) {
                                statePc = 68;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (!stackIn_50_0) {
                                statePc = 56;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 48;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!fg.a((CharSequence) ((Object) var4), -111)) {
                                statePc = 63;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if ((dj.a((CharSequence) ((Object) var4), -118) ^ -1) > -11) {
                                statePc = 62;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            this.a("wrongjava", -16946);
                            if (var5 == 0) {
                                statePc = 110;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (pn.field_r == null) {
                                statePc = 86;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackIn_68_0 = pn.field_r.startsWith("1.");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (!stackIn_68_0) {
                                statePc = 86;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if ((var1_int ^ -1) <= (pn.field_r.length() ^ -1)) {
                                statePc = 82;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            var3 = pn.field_r.charAt(var1_int);
                            stackIn_83_0 = var3;
                            stackIn_72_0 = stackIn_83_0;
                            stackIn_83_1 = 48;
                            stackIn_72_1 = stackIn_83_1;
                            if (var5 != 0) {
                                statePc = 83;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            if (stackIn_72_0 < stackIn_72_1) {
                                statePc = 82;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            statePc = 75;
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (57 >= var3) {
                                statePc = 81;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (var5 == 0) {
                                statePc = 82;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var1_int++;
                            var2_int = -48 - (-var3 - 10 * var2_int);
                            if (var5 == 0) {
                                statePc = 70;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            stackIn_83_0 = 5;
                            stackIn_83_1 = var2_int;
                            statePc = 83;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            if (stackIn_83_0 > stackIn_83_1) {
                                statePc = 86;
                            } else {
                                statePc = 84;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            ob.field_u = true;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var1 = km.field_m;
                            if (fb.field_o == null) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var1 = fb.field_o;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var2_ref = pn.field_c;
                            if (var2_ref != null) {
                                statePc = 91;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 93;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 94;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            im.b((byte) 98);
                            this.a(false);
                            sb.field_bb = qf.a(li.field_A, na.field_i, (java.awt.Component) ((Object) sl.field_n), (byte) -113);
                            this.b(26689);
                            gd.field_qb = dl.g((byte) 3);
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (0L == qa.field_P) {
                                statePc = 100;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            stackIn_102_0 = (qa.field_P < mm.a(-123) ? -1 : (qa.field_P == mm.a(-123) ? 0 : 1));
                            stackIn_97_0 = stackIn_102_0;
                            if (var5 != 0) {
                                statePc = 102;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            if (stackIn_97_0 <= 0) {
                                statePc = 110;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            di.field_a = gd.field_qb.a((byte) -122, ud.field_v);
                            stackIn_102_0 = 0;
                            statePc = 102;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            var3 = stackIn_102_0;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if ((var3 ^ -1) <= (di.field_a ^ -1)) {
                                statePc = 108;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            this.d(0);
                            var3++;
                            if (var5 != 0) {
                                statePc = 109;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (var5 == 0) {
                                statePc = 103;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            this.f(-7035);
                            le.a(sl.field_n, 50, hb.field_i);
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            if (var5 == 0) {
                                statePc = 95;
                            } else {
                                statePc = 110;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            var1 = caughtException;
                            sj.a((String) null, -60, (Throwable) (var1));
                            this.a("crash", -16946);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            this.a(true, (byte) 56);
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        var1 = caughtException;
                        throw ci.a((Throwable) (var1), "lg.run()");
                    }
                    case 115: {
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

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vd.field_c == null) {
              L1: {
                if (fb.field_o == null) {
                  break L1;
                } else {
                  if (this != fb.field_o) {
                    stackIn_10_0 = fb.field_o.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_12_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            } else {
              stackIn_2_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lg.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final boolean b(byte param0) {
        return true;
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != km.field_m) {
                break L1;
              } else {
                if (je.field_v) {
                  break L1;
                } else {
                  qa.field_P = mm.a(-91);
                  a.a((byte) 124, 5000L);
                  ug.field_M = null;
                  this.a(false, (byte) -101);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            pa.field_f = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lg.focusLost(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static void g(int param0) {
        int var2 = 0;
        int var4 = 0;
        int stackIn_28_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param0 == -27983) {
                break L1;
              } else {
                field_f = (String) null;
                break L1;
              }
            }
            var1 = wc.field_i;
            synchronized (var1) {
              L2: {
                L3: {
                  L4: {
                    L5: {
                      ad.field_b = mn.field_y;
                      km.field_f = km.field_f + 1;
                      if (-1 >= (qj.field_h ^ -1)) {
                        break L5;
                      } else {
                        var2 = 0;
                        L6: while (true) {
                          L7: {
                            L8: {
                              if (-113 >= (var2 ^ -1)) {
                                break L8;
                              } else {
                                fc.field_e[var2] = false;
                                var2++;
                                if (var4 != 0) {
                                  break L7;
                                } else {
                                  if (var4 == 0) {
                                    continue L6;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                            qj.field_h = hh.field_b;
                            break L7;
                          }
                          if (var4 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                    }
                    L9: while (true) {
                      if ((qj.field_h ^ -1) == (hh.field_b ^ -1)) {
                        break L4;
                      } else {
                        var2 = ni.field_b[hh.field_b];
                        hh.field_b = 127 & 1 + hh.field_b;
                        stackIn_28_0 = var2;

                        if (var4 != 0) {
                          break L3;
                        } else {
                          L10: {
                            L11: {
                              if (stackIn_28_0 < 0) {
                                break L11;
                              } else {
                                fc.field_e[var2] = true;
                                if (var4 == 0) {
                                  break L10;
                                } else {
                                  break L11;
                                }
                              }
                            }
                            fc.field_e[var2 ^ -1] = false;
                            break L10;
                          }
                          if (var4 == 0) {
                            continue L9;
                          } else {
                            break L4;
                          }
                        }
                      }
                    }
                  }
                  stackIn_28_0 = fk.field_e;
                  break L3;
                }
                mn.field_y = stackIn_28_0;
                break L2;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "lg.FA(" + param0 + ')');
        }
    }

    final static int a(ik param0, ik param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var3_int = -75 % ((13 - param2) / 60);
            stackIn_1_0 = ka.a((String) null, false, 0, (byte) -90, 0, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3 = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (var3);

            stackIn_5_1 = new StringBuilder().append("lg.JA(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          L2: {


            stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_6_2).append(',');

            if (param1 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "null";
              break L2;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_10_1 = (StringBuilder) ((Object) stackIn_9_1);
              stackIn_10_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_10_2 + ',' + param2 + ')');
        }
        return stackIn_1_0;
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lg.windowClosing(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void f(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              var2_long = mm.a(59);
              var4 = bm.field_T[cm.field_g];
              bm.field_T[cm.field_g] = var2_long;
              if (-1L == (var4 ^ -1L)) {
                break L1;
              } else {
                if (var2_long > var4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (param0 == -7035) {
              L2: {
                cm.field_g = 1 + cm.field_g & 31;
                fieldTemp$1 = ml.field_a;
                ml.field_a = ml.field_a + 1;
                if ((fieldTemp$1 ^ -1) >= -51) {
                  break L2;
                } else {
                  L3: {
                    dd.field_e = true;
                    ml.field_a = ml.field_a - 50;
                    sl.field_n.setSize(na.field_i, li.field_A);
                    sl.field_n.setVisible(true);
                    if (vd.field_c == null) {
                      break L3;
                    } else {
                      if (gh.field_N != null) {
                        break L3;
                      } else {
                        var6 = vd.field_c.getInsets();
                        sl.field_n.setLocation(kf.field_p + var6.left, var6.top + ij.field_X);
                        if (SteelSentinels.field_G == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  sl.field_n.setLocation(kf.field_p, ij.field_X);
                  break L2;
                }
              }
              this.a((byte) 112);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "lg.AA(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (km.field_m != this) {
                break L1;
              } else {
                if (je.field_v) {
                  break L1;
                } else {
                  qa.field_P = 0L;
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void c(byte param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (null != sl.field_n) {
                sl.field_n.removeFocusListener((java.awt.event.FocusListener) (this));
                sl.field_n.getParent().setBackground(java.awt.Color.black);
                sl.field_n.getParent().remove((java.awt.Component) ((Object) sl.field_n));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != gh.field_N) {
                  break L3;
                } else {
                  L4: {
                    if (null == vd.field_c) {
                      break L4;
                    } else {
                      var2 = vd.field_c;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null == fb.field_o) {
                      break L5;
                    } else {
                      var2 = fb.field_o;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = km.field_m;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = gh.field_N;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                sl.field_n = (java.awt.Canvas) ((Object) new pi((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) sl.field_n));
                sl.field_n.setSize(na.field_i, li.field_A);
                sl.field_n.setVisible(true);
                if (vd.field_c != var2) {
                  break L7;
                } else {
                  var3 = vd.field_c.getInsets();
                  sl.field_n.setLocation(kf.field_p + var3.left, var3.top - -ij.field_X);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              sl.field_n.setLocation(kf.field_p, ij.field_X);
              break L6;
            }
            sl.field_n.addFocusListener((java.awt.event.FocusListener) (this));
            sl.field_n.requestFocus();
            kc.field_q = true;
            pa.field_f = true;
            dd.field_e = true;
            ti.field_x = param0;
            pl.field_Y = mm.a(-61);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "lg.MA(" + param0 + ')');
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            this.paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lg.update(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = mm.a(-111);
              var4 = hg.field_c[ah.field_Wb];
              hg.field_c[ah.field_Wb] = var2_long;
              if (var4 == (long)param0) {
                break L1;
              } else {
                if (var4 < var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ah.field_Wb = 31 & ah.field_Wb + 1;
            var6 = this;
            synchronized (var6) {
              L2: {
                kc.field_q = pa.field_f;
                break L2;
              }
            }
            this.c(2);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.IA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!je.field_v) {
                  je.field_v = true;
                  var4 = 67 / ((param1 - 7) / 46);
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (null != fb.field_o) {
                fb.field_o.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                this.c((byte) 106);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            L5: {
              if (sl.field_n == null) {
                break L5;
              } else {
                try {
                  L6: {
                    sl.field_n.removeFocusListener((java.awt.event.FocusListener) (this));
                    sl.field_n.getParent().remove((java.awt.Component) ((Object) sl.field_n));
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                break L5;
              }
            }
            L8: {
              if (null == hb.field_i) {
                break L8;
              } else {
                try {
                  L9: {
                    hb.field_i.c(0);
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              }
            }
            L11: {
              this.a(91);
              if (vd.field_c == null) {
                break L11;
              } else {
                try {
                  L12: {
                    System.exit(0);
                    break L12;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    throwable = decompiledCaughtException;
                    break L13;
                  }
                }
                break L11;
              }
            }
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.NA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0);

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (vd.field_c != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (fb.field_o == null) {
                  break L1;
                } else {
                  if (this != fb.field_o) {
                    stackIn_12_0 = fb.field_o.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_14_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_18_0 = (RuntimeException) (var2);

            stackIn_18_1 = new StringBuilder().append("lg.getParameter(");

            if (param0 == null) {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "null";
              break L2;
            } else {
              stackIn_19_0 = (RuntimeException) ((Object) stackIn_18_0);
              stackIn_19_1 = (StringBuilder) ((Object) stackIn_18_1);
              stackIn_19_2 = "{...}";
              break L2;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var8 = SteelSentinels.field_G;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        var3_int = 0;
                        if (param0 == 5) {
                            statePc = 4;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        stackIn_3_0 = -108;
                        statePc = 3;
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 3: {
                    return stackIn_3_0;
                }
                case 4: {
                    try {
                        var4 = ug.field_Q;
                        statePc = 5;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        if ((r.field_j.length ^ -1) >= (var3_int ^ -1)) {
                            statePc = 16;
                        } else {
                            statePc = 6;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        var5 = bl.field_m[var3_int];
                        stackIn_17_0 = 0;
                        stackIn_7_0 = stackIn_17_0;
                        if (var8 != 0) {
                            statePc = 17;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        if (stackIn_7_0 <= var5) {
                            statePc = 11;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var4 = var4 + ih.field_r;
                        if (var8 == 0) {
                            statePc = 15;
                        } else {
                            statePc = 11;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        var6 = wd.a(r.field_j[var3_int], (byte) 52, true);
                        var7 = mg.field_kc + -(var6 >> 1615756769);
                        var4 = var4 + ng.field_m;
                        if (!pg.a(rn.field_q + (rc.field_j << 2090619713), (ud.field_y << 1381375073) + var6, param1, var7 + -ud.field_y, 0, var4, param2)) {
                            statePc = 14;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        stackIn_13_0 = var5;
                        statePc = 13;
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 13: {
                    return stackIn_13_0;
                }
                case 14: {
                    try {
                        var4 = var4 + (rn.field_q + ng.field_m + (rc.field_j << 1033835905));
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 15: {
                    try {
                        var3_int++;
                        if (var8 == 0) {
                            statePc = 5;
                        } else {
                            statePc = 16;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_15) {
                        caughtException = stateCaught_15;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        stackIn_17_0 = -1;
                        statePc = 17;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 18;
                        continue stateLoop;
                    }
                }
                case 17: {
                    return stackIn_17_0;
                }
                case 18: {
                    var3 = (RuntimeException) ((Object) caughtException);
                    throw ci.a((Throwable) ((Object) var3), "lg.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != km.field_m) {
                break L1;
              } else {
                if (je.field_v) {
                  break L1;
                } else {
                  qa.field_P = 4000L + mm.a(54);
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public abstract void init();

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            fb.field_o = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lg.provideLoaderApplet(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (km.field_m != this) {
                break L1;
              } else {
                if (je.field_v) {
                  break L1;
                } else {
                  L2: {
                    dd.field_e = true;
                    if (!ob.field_u) {
                      break L2;
                    } else {
                      if (mm.a(-82) - pl.field_Y <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if ((var2.width ^ -1) > (dc.field_c ^ -1)) {
                              break L2;
                            } else {
                              if ((var2.height ^ -1) > (ih.field_t ^ -1)) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        ti.field_x = true;
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            }
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2_ref = decompiledCaughtException;
            stackIn_24_0 = (RuntimeException) (var2_ref);

            stackIn_24_1 = new StringBuilder().append("lg.paint(");

            if (param0 == null) {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "null";
              break L4;
            } else {
              stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
              stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
              stackIn_25_2 = "{...}";
              break L4;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void c(int param0);

    final void a(String param0, int param1) {
        try {
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (!this.field_m) {
                  this.field_m = true;
                  if (param1 == -16946) {
                    System.out.println("error_game_" + param0);
                    try {
                      L1: {
                        hn.a(wl.d((byte) -21), (byte) -96, "loggedout");
                        break L1;
                      }
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      L2: {
                        var3 = decompiledCaughtException;
                        break L2;
                      }
                    }
                    try {
                      L3: {
                        this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
                        break L3;
                      }
                    } catch (java.lang.Exception decompiledCaughtParameter1) {
                      decompiledCaughtException = decompiledCaughtParameter1;
                      L4: {
                        var3_ref = (Exception) (Object) decompiledCaughtException;
                        break L4;
                      }
                    }
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var3_ref2);

                stackIn_15_1 = new StringBuilder().append("lg.BA(");

                if (param0 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L5;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L5;
                }
              }
              throw ci.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              if (decompiledRegionSelector0 == 1) {
                return;
              } else {
                return;
              }
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            pa.field_f = true;
            dd.field_e = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("lg.focusGained(");

            if (param0 == null) {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "null";
              break L1;
            } else {
              stackIn_6_0 = (RuntimeException) ((Object) stackIn_5_0);
              stackIn_6_1 = (StringBuilder) ((Object) stackIn_5_1);
              stackIn_6_2 = "{...}";
              break L1;
            }
          }
          throw ci.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, byte param3, String param4, int param5, int param6) {
        try {
            pn dupTemp$0 = null;
            RuntimeException stackIn_20_0 = null;
            StringBuilder stackIn_20_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            String stackIn_23_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var8_int = 0;
            RuntimeException var8 = null;
            wj var9 = null;
            Throwable var9_ref = null;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = SteelSentinels.field_G;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var8_int = 65 / ((-41 - param3) / 58);
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (null == km.field_m) {
                                statePc = 10;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            rh.field_s = rh.field_s + 1;
                            if (-4 < (rh.field_s ^ -1)) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            this.a("alreadyloaded", -16946);
                            statePc = 7;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        return;
                    }
                    case 8: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            li.field_A = param1;
                            ih.field_t = param1;
                            na.field_i = param0;
                            dc.field_c = param0;
                            ij.field_X = 0;
                            dd.field_d = param5;
                            kf.field_p = 0;
                            km.field_m = (lg) (this);
                            ug.field_O = wl.d((byte) -21);
                            dupTemp$0 = new pn(param2, param4, param6, true);
                            hb.field_i = dupTemp$0;
                            ug.field_M = dupTemp$0;
                            var9 = hb.field_i.a(2, 1, (Runnable) (this));
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (-1 != (var9.field_a ^ -1)) {
                                statePc = 16;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            a.a((byte) 120, 10L);
                            if (var10 != 0) {
                                statePc = 24;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var10 == 0) {
                                statePc = 11;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 17;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            var9_ref = caughtException;
                            sj.a((String) null, -106, var9_ref);
                            this.a("crash", -16946);
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        var8 = (RuntimeException) ((Object) caughtException);
                        stackIn_22_0 = (RuntimeException) (var8);
                        stackIn_20_0 = stackIn_22_0;
                        stackIn_22_1 = new StringBuilder().append("lg.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
                        stackIn_20_1 = stackIn_22_1;
                        if (param4 == null) {
                            statePc = 22;
                        } else {
                            statePc = 20;
                        }
                        continue stateLoop;
                    }
                    case 20: {
                        stackIn_23_0 = (RuntimeException) ((Object) stackIn_20_0);
                        stackIn_23_1 = (StringBuilder) ((Object) stackIn_20_1);
                        stackIn_23_2 = "{...}";
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 22: {
                        stackIn_23_0 = (RuntimeException) ((Object) stackIn_22_0);
                        stackIn_23_1 = (StringBuilder) ((Object) stackIn_22_1);
                        stackIn_23_2 = "null";
                        statePc = 23;
                        continue stateLoop;
                    }
                    case 23: {
                        throw ci.a((Throwable) ((Object) stackIn_23_0), stackIn_23_2 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 24: {
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

    protected lg() {
        this.field_m = false;
    }

    abstract void a(byte param0);

    abstract void b(int param0);

    static {
        field_a = "Please wait...";
        field_f = "Names can only contain letters, numbers, spaces and underscores";
        field_b = "You are advised to complete training mission <%0> before attempting this mission.";
    }
}
