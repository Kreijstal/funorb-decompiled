/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class kg extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static long field_d;
    boolean field_i;
    static cn field_a;
    static nh field_b;
    static String[] field_e;
    static int field_f;
    static String field_m;
    static String field_k;
    public static boolean field_j;
    public static boolean field_g;
    public static int field_h;
    public static int field_n;
    public static boolean field_c;
    public static boolean field_o;
    public static int field_l;

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

            stackIn_5_1 = new StringBuilder().append("kg.windowClosing(");

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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean b(int param0) {
        return true;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void c(boolean param0);

    abstract void b(boolean param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (ad.field_d != null) {
          return null;
        } else {
          L0: {
            if (rc.field_b == null) {
              break L0;
            } else {
              if (rc.field_b == this) {
                break L0;
              } else {
                return rc.field_b.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ba.field_c != this) {
                break L1;
              } else {
                if (cc.field_c) {
                  break L1;
                } else {
                  nj.field_e = 4000L + kd.c(-2456);
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
          throw vk.a((Throwable) ((Object) runtimeException), "kg.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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

            stackIn_5_1 = new StringBuilder().append("kg.update(");

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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public abstract void init();

    public final void destroy() {
        if (ba.field_c != this || cc.field_c) {
            return;
        }
        try {
            nj.field_e = kd.c(-2456);
            pj.a(0, 5000L);
            kf.field_o = null;
            this.a((byte) 116, false);
        } catch (RuntimeException runtimeException) {
            throw vk.a((Throwable) ((Object) runtimeException), "kg.destroy()");
        }
    }

    public final void run() {
        try {
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_70_0 = 0;
            int stackIn_70_1 = 0;
            int stackIn_81_0 = 0;
            int stackIn_81_1 = 0;
            int stackIn_95_0 = 0;
            int stackIn_100_0 = 0;
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
                        var5 = DungeonAssault.field_K;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (qg.field_c == null) {
                                statePc = 61;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = qg.field_c.toLowerCase();
                            if (((String) (var1)).indexOf("sun") != -1) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if ((((String) (var1)).indexOf("apple") ^ -1) == 0) {
                                statePc = 61;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = qg.field_p;
                            if (var2.equals("1.1")) {
                                statePc = 37;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 37;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 37;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 37;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 37;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 37;
                            } else {
                                statePc = 20;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 37;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 37;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 37;
                            } else {
                                statePc = 29;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 37;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            if (!var2.equals("1.6.0")) {
                                statePc = 40;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.a((byte) -112, "wrongjava");
                            if (var5 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (var2.startsWith("1.6.0_")) {
                                statePc = 45;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            var3 = 6;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var3 >= var2.length()) {
                                statePc = 54;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_66_0 = qm.a(57, var2.charAt(var3));
                            stackIn_48_0 = stackIn_66_0;
                            if (var5 != 0) {
                                statePc = 66;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (!stackIn_48_0) {
                                statePc = 54;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 46;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!sj.a((CharSequence) ((Object) var4), 10)) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (-11 >= (ri.a((byte) 96, (CharSequence) ((Object) var4)) ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.a((byte) -112, "wrongjava");
                            if (var5 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (qg.field_p == null) {
                                statePc = 84;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackIn_66_0 = qg.field_p.startsWith("1.");
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!stackIn_66_0) {
                                statePc = 84;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var1_int >= qg.field_p.length()) {
                                statePc = 80;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var3 = qg.field_p.charAt(var1_int);
                            stackIn_81_0 = 48;
                            stackIn_70_0 = stackIn_81_0;
                            stackIn_81_1 = var3;
                            stackIn_70_1 = stackIn_81_1;
                            if (var5 != 0) {
                                statePc = 81;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (stackIn_70_0 > stackIn_70_1) {
                                statePc = 80;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (var3 <= 57) {
                                statePc = 79;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var5 == 0) {
                                statePc = 80;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var2_int = var2_int * 10 + (var3 + -48);
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            stackIn_81_0 = -6;
                            stackIn_81_1 = var2_int ^ -1;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (stackIn_81_0 >= stackIn_81_1) {
                                statePc = 83;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            ia.field_O = true;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var1 = ba.field_c;
                            if (null == rc.field_b) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var1 = rc.field_b;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var2_ref = qg.field_g;
                            if (var2_ref != null) {
                                statePc = 89;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 91;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            eg.b(116);
                            this.d((byte) 114);
                            k.field_h = bn.a(-1, (java.awt.Component) ((Object) c.field_h), up.field_d, eg.field_d);
                            this.a((byte) -80);
                            o.field_o = fd.b((byte) 108);
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (-1L == (nj.field_e ^ -1L)) {
                                statePc = 98;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            stackIn_100_0 = (nj.field_e < kd.c(-2456) ? -1 : (nj.field_e == kd.c(-2456) ? 0 : 1));
                            stackIn_95_0 = stackIn_100_0;
                            if (var5 != 0) {
                                statePc = 100;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            if (stackIn_95_0 <= 0) {
                                statePc = 108;
                            } else {
                                statePc = 96;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            nk.field_Kb = o.field_o.a(hk.field_e, -108);
                            stackIn_100_0 = 0;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            var3 = stackIn_100_0;
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if ((var3 ^ -1) <= (nk.field_Kb ^ -1)) {
                                statePc = 106;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            this.c(-1);
                            var3++;
                            if (var5 != 0) {
                                statePc = 107;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            if (var5 == 0) {
                                statePc = 101;
                            } else {
                                statePc = 104;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            this.c((byte) -68);
                            ho.a(i.field_A, c.field_h, (byte) -32);
                            statePc = 107;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            if (var5 == 0) {
                                statePc = 93;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            var1 = caughtException;
                            sm.a((Throwable) (var1), 1, (String) null);
                            this.a((byte) -112, "crash");
                            statePc = 110;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        try {
                            this.a((byte) 116, true);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        var1 = caughtException;
                        throw vk.a((Throwable) (var1), "kg.run()");
                    }
                    case 113: {
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
            rc.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kg.provideLoaderApplet(");

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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(byte param0, String param1) {
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
                if (this.field_i) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.field_i = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      L2: {
                        ee.a((byte) -21, m.c(true), "loggedout");
                        if (param0 == -112) {
                          break L2;
                        } else {
                          this.c(116);
                          break L2;
                        }
                      }
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L3: {
                      var3 = decompiledCaughtException;
                      break L3;
                    }
                  }
                  try {
                    L4: {
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_15_0 = (RuntimeException) (var3_ref2);

                stackIn_15_1 = new StringBuilder().append("kg.N(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "null";
                  break L6;
                } else {
                  stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
                  stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
                  stackIn_16_2 = "{...}";
                  break L6;
                }
              }
              throw vk.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
            }
            if (decompiledRegionSelector0 == 0) {
              return;
            } else {
              return;
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            rn.field_b = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kg.focusLost(");

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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ad.field_d) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (rc.field_b == null) {
                  break L1;
                } else {
                  if (rc.field_b != this) {
                    stackIn_12_0 = rc.field_b.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_14_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kg.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    final synchronized void d(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          L0: {
            L1: {
              if (c.field_h == null) {
                break L1;
              } else {
                c.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
                c.field_h.getParent().setBackground(java.awt.Color.black);
                c.field_h.getParent().remove((java.awt.Component) ((Object) c.field_h));
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == hh.field_k) {
                  break L3;
                } else {
                  var2 = hh.field_k;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (ad.field_d == null) {
                  break L4;
                } else {
                  var2 = ad.field_d;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (rc.field_b == null) {
                  break L5;
                } else {
                  var2 = rc.field_b;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = ba.field_c;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                c.field_h = (java.awt.Canvas) ((Object) new ql((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) c.field_h));
                c.field_h.setSize(up.field_d, eg.field_d);
                c.field_h.setVisible(true);
                if (ad.field_d != var2) {
                  break L7;
                } else {
                  var3 = ad.field_d.getInsets();
                  c.field_h.setLocation(aj.field_Gb + var3.left, rb.field_L + var3.top);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              c.field_h.setLocation(aj.field_Gb, rb.field_L);
              break L6;
            }
            c.field_h.addFocusListener((java.awt.event.FocusListener) (this));
            c.field_h.requestFocus();
            rj.field_o = true;
            rn.field_b = true;
            im.field_d = true;
            ve.field_a = false;
            if (param0 >= 111) {
              pj.field_z = kd.c(-2456);
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
          throw vk.a((Throwable) (var2), "kg.K(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0);

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != ba.field_c) {
                break L1;
              } else {
                if (cc.field_c) {
                  break L1;
                } else {
                  nj.field_e = 0L;
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
          throw vk.a((Throwable) ((Object) runtimeException), "kg.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_22_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (ba.field_c != this) {
                break L1;
              } else {
                if (!cc.field_c) {
                  L2: {
                    im.field_d = true;
                    if (!ia.field_O) {
                      break L2;
                    } else {
                      if ((-pj.field_z + kd.c(-2456) ^ -1L) >= -1001L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (var2.width < sf.field_h) {
                              break L2;
                            } else {
                              if (var2.height >= sl.field_d) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        ve.field_a = true;
                        break L2;
                      }
                    }
                  }
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
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
            stackIn_21_0 = (RuntimeException) (var2_ref);

            stackIn_21_1 = new StringBuilder().append("kg.paint(");

            if (param0 == null) {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "null";
              break L4;
            } else {
              stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
              stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
              stackIn_22_2 = "{...}";
              break L4;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void c(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              if (param0 == -1) {
                break L1;
              } else {
                this.b((byte) -82);
                break L1;
              }
            }
            L2: {
              var2_long = kd.c(param0 + -2455);
              var4 = jf.field_g[jl.field_d];
              jf.field_g[jl.field_d] = var2_long;
              if (-1L == (var4 ^ -1L)) {
                break L2;
              } else {
                if (var4 >= var2_long) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            jl.field_d = 1 + jl.field_d & 31;
            var6 = this;
            synchronized (var6) {
              L3: {
                rj.field_o = rn.field_b;
                break L3;
              }
            }
            this.a(-100);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "kg.J(" + param0 + ')');
        }
    }

    abstract void b(byte param0);

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
            rn.field_b = true;
            im.field_d = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kg.focusGained(");

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
          throw vk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == ad.field_d) {
              L1: {
                if (null == rc.field_b) {
                  break L1;
                } else {
                  if (rc.field_b == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = rc.field_b.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getParameter(param0);
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
          L2: {
            var2 = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("kg.getParameter(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L2;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L2;
            }
          }
          throw vk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    private final void c(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          L0: {
            L1: {
              var2_long = kd.c(-2456);
              var4 = id.field_b[np.field_K];
              if (param0 == -68) {
                break L1;
              } else {
                this.field_i = false;
                break L1;
              }
            }
            L2: {
              id.field_b[np.field_K] = var2_long;
              if (var4 == 0L) {
                break L2;
              } else {
                if (var2_long <= var4) {
                  break L2;
                } else {
                  var6_int = (int)(var2_long - var4);
                  bc.field_a = (32000 - -(var6_int >> 2111784705)) / var6_int;
                  break L2;
                }
              }
            }
            L3: {
              np.field_K = 31 & np.field_K + 1;
              fieldTemp$1 = sb.field_b;
              sb.field_b = sb.field_b + 1;
              if ((fieldTemp$1 ^ -1) < -51) {
                L4: {
                  im.field_d = true;
                  sb.field_b = sb.field_b - 50;
                  c.field_h.setSize(up.field_d, eg.field_d);
                  c.field_h.setVisible(true);
                  if (null == ad.field_d) {
                    break L4;
                  } else {
                    if (null != hh.field_k) {
                      break L4;
                    } else {
                      var6 = ad.field_d.getInsets();
                      c.field_h.setLocation(var6.left + aj.field_Gb, rb.field_L + var6.top);
                      if (DungeonAssault.field_K == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                c.field_h.setLocation(aj.field_Gb, rb.field_L);
                break L3;
              } else {
                break L3;
              }
            }
            this.b((byte) 38);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "kg.L(" + param0 + ')');
        }
    }

    protected kg() {
        this.field_i = false;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (cc.field_c) {
                  return;
                } else {
                  cc.field_c = true;
                  break L1;
                }
              }
            }
            L2: {
              if (null == rc.field_b) {
                break L2;
              } else {
                rc.field_b.destroy();
                break L2;
              }
            }
            try {
              L3: {
                L4: {
                  this.c(true);
                  if (param0 == 116) {
                    break L4;
                  } else {
                    field_d = 31L;
                    break L4;
                  }
                }
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            L6: {
              if (c.field_h != null) {
                try {
                  L7: {
                    c.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
                    c.field_h.getParent().remove((java.awt.Component) ((Object) c.field_h));
                    break L7;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L8: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L8;
                  }
                }
                break L6;
              } else {
                break L6;
              }
            }
            L9: {
              if (i.field_A == null) {
                break L9;
              } else {
                try {
                  L10: {
                    i.field_A.a((byte) -119);
                    break L10;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L11: {
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L11;
                  }
                }
                break L9;
              }
            }
            L12: {
              this.b(false);
              if (ad.field_d == null) {
                break L12;
              } else {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    throwable = decompiledCaughtException;
                    break L14;
                  }
                }
                break L12;
              }
            }
            System.out.println("Shutdown complete - clean:" + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "kg.I(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_a = null;
              field_e = null;
              field_b = null;
              field_k = null;
              if (!param0) {
                break L1;
              } else {
                kg.provideLoaderApplet((java.applet.Applet) null);
                break L1;
              }
            }
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kg.O(" + param0 + ')');
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null != ad.field_d) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == rc.field_b) {
                  break L1;
                } else {
                  if (rc.field_b == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = rc.field_b.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getDocumentBase();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kg.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final void a(int param0, byte param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            qg dupTemp$0 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            pn var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = DungeonAssault.field_K;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == ba.field_c) {
                                statePc = 11;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ql.field_b = ql.field_b + 1;
                            if (-4 >= (ql.field_b ^ -1)) {
                                statePc = 7;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.a((byte) -112, "alreadyloaded");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            eg.field_d = param3;
                            sl.field_d = param3;
                            rb.field_L = 0;
                            up.field_d = param4;
                            sf.field_h = param4;
                            wj.field_s = param6;
                            ba.field_c = (kg) (this);
                            aj.field_Gb = 0;
                            ci.field_q = m.c(true);
                            dupTemp$0 = new qg(param0, param2, param5, true);
                            i.field_A = dupTemp$0;
                            kf.field_o = dupTemp$0;
                            var8 = i.field_A.a(-21432, 1, (Runnable) (this));
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var8.field_c != 0) {
                                statePc = 17;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            pj.a(0, 10L);
                            if (var9 != 0) {
                                statePc = 20;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var9 == 0) {
                                statePc = 12;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (param1 >= 83) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            this.field_i = false;
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var8_ref = caughtException;
                            sm.a(var8_ref, 1, (String) null);
                            this.a((byte) -112, "crash");
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 23;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_26_0 = (RuntimeException) (var8_ref2);
                        stackIn_24_0 = stackIn_26_0;
                        stackIn_26_1 = new StringBuilder().append("kg.M(").append(param0).append(',').append(param1).append(',');
                        stackIn_24_1 = stackIn_26_1;
                        if (param2 == null) {
                            statePc = 26;
                        } else {
                            statePc = 24;
                        }
                        continue stateLoop;
                    }
                    case 24: {
                        stackIn_27_0 = (RuntimeException) ((Object) stackIn_24_0);
                        stackIn_27_1 = (StringBuilder) ((Object) stackIn_24_1);
                        stackIn_27_2 = "{...}";
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 26: {
                        stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
                        stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
                        stackIn_27_2 = "null";
                        statePc = 27;
                        continue stateLoop;
                    }
                    case 27: {
                        throw vk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 28: {
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

    static {
        field_e = new String[]{"Dragons of Renown", "<%highlight>You've reached the end of the Just Play tutorial. To continue, and battle in the realm of Dungaria, please log in or create an account.<br><br><%command>Exit this page and return to the main menu."};
        field_k = "Order your raider to disarm the guardian. <br><br>If the raider is detected by the guardian, nearby monsters will be alerted.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
        field_m = "Dead";
    }
}
