/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fc extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_l;
    static te field_j;
    static String field_m;
    static te field_g;
    static va field_k;
    static String field_b;
    public static boolean field_c;
    public static int field_e;
    public static boolean field_f;
    public static int field_i;
    public static int field_h;
    public static int field_a;
    public static int field_d;

    final boolean b(byte param0) {
        return true;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
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
            hh.field_o = true;
            gb.field_j = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fc.focusGained(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
            hh.field_o = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fc.focusLost(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
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

            stackIn_5_1 = new StringBuilder().append("fc.windowClosing(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void b(boolean param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (hk.field_e == null) {
              L1: {
                if (ll.field_b == null) {
                  break L1;
                } else {
                  if (this != ll.field_b) {
                    stackIn_10_0 = ll.field_b.getAppletContext();
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
          throw la.a((Throwable) ((Object) var1), "fc.getAppletContext()");
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

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (m.field_f != this) {
                break L1;
              } else {
                if (dl.field_b) {
                  break L1;
                } else {
                  hj.field_db = pf.a(0);
                  em.a(5000L, false);
                  fk.field_c = null;
                  this.a(false, false);
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
          throw la.a((Throwable) ((Object) runtimeException), "fc.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != md.field_l) {
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
                            var1 = md.field_l.toLowerCase();
                            if (((String) (var1)).indexOf("sun") != -1) {
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
                            if (0 == (((String) (var1)).indexOf("apple") ^ -1)) {
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
                            var2 = md.field_m;
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
                            this.a((byte) 75, "wrongjava");
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
                            if (var3 >= var2.length()) {
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
                            stackIn_68_0 = re.a(-49, var2.charAt(var3));
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
                            if (!ra.a((CharSequence) ((Object) var4), (byte) -116)) {
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
                            if (vi.a(63, (CharSequence) ((Object) var4)) < 10) {
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
                            this.a((byte) 123, "wrongjava");
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
                            if (null == md.field_m) {
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
                            stackIn_68_0 = md.field_m.startsWith("1.");
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
                            if ((var1_int ^ -1) <= (md.field_m.length() ^ -1)) {
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
                            var3 = md.field_m.charAt(var1_int);
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
                            if (-58 <= (var3 ^ -1)) {
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
                            var2_int = var2_int * 10 + (var3 - 48);
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
                            if (stackIn_83_0 <= stackIn_83_1) {
                                statePc = 85;
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
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            sd.field_c = true;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            var1 = m.field_f;
                            if (ll.field_b == null) {
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
                            var1 = ll.field_b;
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
                            var2_ref = md.field_h;
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
                            pf.a(true);
                            this.a(false);
                            ac.field_a = ub.a((byte) -85, ub.field_b, (java.awt.Component) ((Object) ie.field_e), lb.field_z);
                            this.a(-17);
                            ne.field_c = il.a(-20601);
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
                            if (-1L == (hj.field_db ^ -1L)) {
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
                            stackIn_102_0 = ((pf.a(0) ^ -1L) < (hj.field_db ^ -1L) ? -1 : ((pf.a(0) ^ -1L) == (hj.field_db ^ -1L) ? 0 : 1));
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
                            bg.field_E = ne.field_c.a(ed.field_d, -128);
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
                            if (var3 >= bg.field_E) {
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
                            this.a((byte) -85);
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
                            this.b(57);
                            em.a(ie.field_e, (byte) -101, rc.field_k);
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
                            kk.a((String) null, (byte) 124, (Throwable) (var1));
                            this.a((byte) 98, "crash");
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
                            this.a(false, true);
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
                        throw la.a((Throwable) (var1), "fc.run()");
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

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (this != m.field_f) {
                break L1;
              } else {
                if (!dl.field_b) {
                  L2: {
                    gb.field_j = true;
                    if (!sd.field_c) {
                      break L2;
                    } else {
                      if (-1001L > (pf.a(0) - ah.field_e ^ -1L)) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (var2.width < kk.field_b) {
                              break L2;
                            } else {
                              if ((var2.height ^ -1) <= (ih.field_b ^ -1)) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        aj.field_c = true;
                        break L2;
                      } else {
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
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("fc.paint(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_j = null;
              if (!param0) {
                break L1;
              } else {
                field_g = (te) null;
                break L1;
              }
            }
            field_k = null;
            field_g = null;
            field_b = null;
            field_m = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "fc.EA(" + param0 + ')');
        }
    }

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
            if (hk.field_e != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == ll.field_b) {
                  break L1;
                } else {
                  if (this != ll.field_b) {
                    stackIn_12_0 = ll.field_b.getParameter(param0);
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

            stackIn_18_1 = new StringBuilder().append("fc.getParameter(");

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
          throw la.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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

    abstract void c(int param0);

    private final void a(boolean param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!dl.field_b) {
                  dl.field_b = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (ll.field_b != null) {
                ll.field_b.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                this.b(param0);
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
              if (ie.field_e == null) {
                break L5;
              } else {
                try {
                  L6: {
                    ie.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
                    ie.field_e.getParent().remove((java.awt.Component) ((Object) ie.field_e));
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
              if (null != rc.field_k) {
                try {
                  L9: {
                    rc.field_k.a((byte) -84);
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
              } else {
                break L8;
              }
            }
            L11: {
              this.c((byte) 26);
              if (null == hk.field_e) {
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
            System.out.println("Shutdown complete - clean:" + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.DA(" + param0 + ',' + param1 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (hk.field_e == null) {
          L0: {
            if (null == ll.field_b) {
              break L0;
            } else {
              if (this == ll.field_b) {
                break L0;
              } else {
                return ll.field_b.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
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
            if (hk.field_e == null) {
              L1: {
                if (null == ll.field_b) {
                  break L1;
                } else {
                  if (ll.field_b != this) {
                    stackIn_10_0 = ll.field_b.getDocumentBase();
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
          throw la.a((Throwable) ((Object) var1), "fc.getDocumentBase()");
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

    final static java.net.URL a(String param0, java.net.URL param1, String param2, int param3, int param4) {
        try {
            StringBuilder discarded$0 = null;
            StringBuilder discarded$1 = null;
            StringBuilder discarded$2 = null;
            StringBuilder discarded$3 = null;
            StringBuilder discarded$4 = null;
            StringBuilder discarded$5 = null;
            StringBuilder discarded$6 = null;
            StringBuilder discarded$7 = null;
            StringBuilder discarded$8 = null;
            java.net.URL stackIn_60_0 = null;
            java.net.URL stackIn_62_0 = null;
            RuntimeException stackIn_64_0 = null;
            StringBuilder stackIn_64_1 = null;
            RuntimeException stackIn_66_0 = null;
            StringBuilder stackIn_66_1 = null;
            RuntimeException stackIn_67_0 = null;
            StringBuilder stackIn_67_1 = null;
            String stackIn_67_2 = null;
            RuntimeException stackIn_68_0 = null;
            StringBuilder stackIn_68_1 = null;
            RuntimeException stackIn_70_0 = null;
            StringBuilder stackIn_70_1 = null;
            RuntimeException stackIn_71_0 = null;
            StringBuilder stackIn_71_1 = null;
            String stackIn_71_2 = null;
            RuntimeException stackIn_72_0 = null;
            StringBuilder stackIn_72_1 = null;
            RuntimeException stackIn_74_0 = null;
            StringBuilder stackIn_74_1 = null;
            RuntimeException stackIn_75_0 = null;
            StringBuilder stackIn_75_1 = null;
            String stackIn_75_2 = null;
            int statePc = 0;
            Throwable caughtException = null;
            int var5_int = 0;
            RuntimeException var5 = null;
            String var6 = null;
            int var7 = 0;
            int var8_int = 0;
            StringBuilder var8 = null;
            Exception var9 = null;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var5_int = -123 / ((-26 - param4) / 60);
                            var6 = param1.getFile();
                            var7 = 0;
                            statePc = 2;
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            if (var6.regionMatches(var7, "/l=", 0, 3)) {
                                statePc = 4;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var8_int = var6.indexOf('/', var7 - -1);
                            if ((var8_int ^ -1) <= -1) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            if (0 <= param3) {
                                statePc = 9;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var7 = var8_int;
                            if (var10 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            var6 = var6.substring(0, var7) + var6.substring(var8_int);
                            if (var10 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (!var6.regionMatches(var7, "/a=", 0, 3)) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            var8_int = var6.indexOf('/', var7 - -1);
                            if (var8_int >= 0) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var7 = var8_int;
                            if (var10 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var6.regionMatches(var7, "/p=", 0, 3)) {
                                statePc = 18;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8_int = var6.indexOf('/', var7 - -1);
                            if (var8_int >= 0) {
                                statePc = 21;
                            } else {
                                statePc = 19;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            if (null == param0) {
                                statePc = 23;
                            } else {
                                statePc = 22;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            var6 = var6.substring(0, var7) + var6.substring(var8_int);
                            if (var10 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var7 = var8_int;
                            if (var10 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var6.regionMatches(var7, "/s=", 0, 3)) {
                                statePc = 30;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            if (var6.regionMatches(var7, "/c=", 0, 3)) {
                                statePc = 30;
                            } else {
                                statePc = 26;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            var8_int = var6.indexOf('/', var7 + 1);
                            if ((var8_int ^ -1) > -1) {
                                statePc = 36;
                            } else {
                                statePc = 31;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            if (null == param2) {
                                statePc = 35;
                            } else {
                                statePc = 32;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            var6 = var6.substring(0, var7) + var6.substring(var8_int);
                            if (var10 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 35;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            var7 = var8_int;
                            if (var10 == 0) {
                                statePc = 2;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            var8 = new StringBuilder(var7);
                            discarded$0 = var8.append(var6.substring(0, var7));
                            if (-1 <= (param3 ^ -1)) {
                                statePc = 40;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            discarded$1 = var8.append("/l=");
                            discarded$2 = var8.append(Integer.toString(param3));
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (param0 == null) {
                                statePc = 47;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            if (-1 > (param0.length() ^ -1)) {
                                statePc = 46;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            discarded$3 = var8.append("/p=");
                            discarded$4 = var8.append(param0);
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            if (null == param2) {
                                statePc = 53;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if (-1 <= (param2.length() ^ -1)) {
                                statePc = 53;
                            } else {
                                statePc = 49;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_48) {
                            caughtException = stateCaught_48;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            discarded$5 = var8.append("/s=");
                            discarded$6 = var8.append(param2);
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (var7 < var6.length()) {
                                statePc = 57;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            discarded$7 = var8.append('/');
                            if (var10 == 0) {
                                statePc = 59;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            statePc = 57;
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            discarded$8 = var8.append(var6.substring(var7, var6.length()));
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            stackIn_60_0 = new java.net.URL(param1, var8.toString());
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = ((Object) stateCaught_59 instanceof Exception ? 61 : 63);
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        return stackIn_60_0;
                    }
                    case 61: {
                        try {
                            var9 = (Exception) ((Object) caughtException);
                            var9.printStackTrace();
                            stackIn_62_0 = (java.net.URL) (param1);
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 63;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        return stackIn_62_0;
                    }
                    case 63: {
                        var5 = (RuntimeException) ((Object) caughtException);
                        stackIn_66_0 = (RuntimeException) (var5);
                        stackIn_64_0 = stackIn_66_0;
                        stackIn_66_1 = new StringBuilder().append("fc.LA(");
                        stackIn_64_1 = stackIn_66_1;
                        if (param0 == null) {
                            statePc = 66;
                        } else {
                            statePc = 64;
                        }
                        continue stateLoop;
                    }
                    case 64: {
                        stackIn_67_0 = (RuntimeException) ((Object) stackIn_64_0);
                        stackIn_67_1 = (StringBuilder) ((Object) stackIn_64_1);
                        stackIn_67_2 = "{...}";
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 66: {
                        stackIn_67_0 = (RuntimeException) ((Object) stackIn_66_0);
                        stackIn_67_1 = (StringBuilder) ((Object) stackIn_66_1);
                        stackIn_67_2 = "null";
                        statePc = 67;
                        continue stateLoop;
                    }
                    case 67: {
                        stackIn_70_0 = (RuntimeException) ((Object) stackIn_67_0);
                        stackIn_68_0 = stackIn_70_0;
                        stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_67_2).append(',');
                        stackIn_68_1 = stackIn_70_1;
                        if (param1 == null) {
                            statePc = 70;
                        } else {
                            statePc = 68;
                        }
                        continue stateLoop;
                    }
                    case 68: {
                        stackIn_71_0 = (RuntimeException) ((Object) stackIn_68_0);
                        stackIn_71_1 = (StringBuilder) ((Object) stackIn_68_1);
                        stackIn_71_2 = "{...}";
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 70: {
                        stackIn_71_0 = (RuntimeException) ((Object) stackIn_70_0);
                        stackIn_71_1 = (StringBuilder) ((Object) stackIn_70_1);
                        stackIn_71_2 = "null";
                        statePc = 71;
                        continue stateLoop;
                    }
                    case 71: {
                        stackIn_74_0 = (RuntimeException) ((Object) stackIn_71_0);
                        stackIn_72_0 = stackIn_74_0;
                        stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_71_2).append(',');
                        stackIn_72_1 = stackIn_74_1;
                        if (param2 == null) {
                            statePc = 74;
                        } else {
                            statePc = 72;
                        }
                        continue stateLoop;
                    }
                    case 72: {
                        stackIn_75_0 = (RuntimeException) ((Object) stackIn_72_0);
                        stackIn_75_1 = (StringBuilder) ((Object) stackIn_72_1);
                        stackIn_75_2 = "{...}";
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 74: {
                        stackIn_75_0 = (RuntimeException) ((Object) stackIn_74_0);
                        stackIn_75_1 = (StringBuilder) ((Object) stackIn_74_1);
                        stackIn_75_2 = "null";
                        statePc = 75;
                        continue stateLoop;
                    }
                    case 75: {
                        throw la.a((Throwable) ((Object) stackIn_75_0), stackIn_75_2 + ',' + param3 + ',' + param4 + ')');
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

    abstract void d(int param0);

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          L0: {
            L1: {
              var2_long = pf.a(0);
              var4 = dl.field_a[bh.field_f];
              dl.field_a[bh.field_f] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if ((var2_long ^ -1L) < (var4 ^ -1L)) {
                  var6_int = (int)(var2_long - var4);
                  s.field_T = (32000 - -(var6_int >> -1703689151)) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              bh.field_f = bh.field_f + 1 & 31;
              if (param0 == 57) {
                break L2;
              } else {
                this.run();
                break L2;
              }
            }
            L3: {
              fieldTemp$1 = ud.field_d;
              ud.field_d = ud.field_d + 1;
              if (fieldTemp$1 > 50) {
                L4: {
                  gb.field_j = true;
                  ud.field_d = ud.field_d - 50;
                  ie.field_e.setSize(ub.field_b, lb.field_z);
                  ie.field_e.setVisible(true);
                  if (hk.field_e == null) {
                    break L4;
                  } else {
                    if (b.field_i != null) {
                      break L4;
                    } else {
                      var6 = hk.field_e.getInsets();
                      ie.field_e.setLocation(var6.left + ue.field_D, var6.top + wi.field_c);
                      if (!MonkeyPuzzle2.field_F) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ie.field_e.setLocation(ue.field_D, wi.field_c);
                break L3;
              } else {
                break L3;
              }
            }
            this.d(-25976);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.MA(" + param0 + ')');
        }
    }

    final static void a(mk param0, byte param1, int param2) {
        RuntimeException runtimeException = null;
        hb var3 = null;
        int var4 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var3 = gf.field_c;
              var3.b(true, param2);
              var3.field_h = var3.field_h + 1;
              var4 = var3.field_h;
              var3.b(1, -49152);
              if (param1 > 106) {
                break L1;
              } else {
                field_j = (te) null;
                break L1;
              }
            }
            L2: {
              L3: {
                if (null == param0.field_g) {
                  break L3;
                } else {
                  var3.b(param0.field_g.length, -49152);
                  var3.b(param0.field_g, param0.field_g.length, -2, 0);
                  if (!MonkeyPuzzle2.field_F) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var3.b(0, -49152);
              break L2;
            }
            var3.a((byte) -76, var4);
            var3.field_h = var3.field_h - 4;
            param0.field_e = var3.e(126);
            var3.a(-var4 + var3.field_h, (byte) 29);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            runtimeException = decompiledCaughtException;
            stackIn_14_0 = (RuntimeException) (runtimeException);

            stackIn_14_1 = new StringBuilder().append("fc.KA(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L4;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L4;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void a(mj param0, byte param1, ad param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          L0: {
            L1: {
              ea.field_b = gg.c(param1 + -111) * param3 / 1000;
              if (param1 == 111) {
                break L1;
              } else {
                field_b = (String) null;
                break L1;
              }
            }
            ed.a(param2, param1 ^ 31);
            nc.a(param2, 2);
            dl.a(param1 ^ 11490, param2);
            cc.b(true);
            cm.a(15);
            uj.field_i = -ea.field_b + 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("fc.IA(");

            if (param0 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          L3: {


            stackIn_12_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(',').append(param1).append(',');

            if (param2 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "null";
              break L3;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_9_0);
              stackIn_13_1 = (StringBuilder) ((Object) stackIn_12_1);
              stackIn_13_2 = "{...}";
              break L3;
            }
          }
          throw la.a((Throwable) ((Object) stackIn_9_0), stackIn_13_2 + ',' + param3 + ')');
        }
    }

    public final void start() {
        if (this != m.field_f || dl.field_b) {
            return;
        }
        try {
            hj.field_db = 0L;
        } catch (RuntimeException runtimeException) {
            throw la.a((Throwable) ((Object) runtimeException), "fc.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = pf.a(0);
              var4 = ve.field_w[fe.field_d];
              ve.field_w[fe.field_d] = var2_long;
              if (-1L == (var4 ^ -1L)) {
                break L1;
              } else {
                if (var2_long > var4) {
                  var6_int = (int)(-var4 + var2_long);
                  jf.field_g = (32000 + (var6_int >> -127391487)) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            fe.field_d = 1 + fe.field_d & 31;
            var6 = this;
            synchronized (var6) {
              L2: {
                ke.field_a = hh.field_o;
                break L2;
              }
            }
            L3: {
              if (param0 < -52) {
                break L3;
              } else {
                this.a(false);
                break L3;
              }
            }
            this.c(15245);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw la.a((Throwable) ((Object) runtimeException), "fc.GA(" + param0 + ')');
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

            stackIn_5_1 = new StringBuilder().append("fc.update(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, byte param6) {
        try {
            md dupTemp$0 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            ic var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = MonkeyPuzzle2.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (param6 == -48) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_g = (te) null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (null != m.field_f) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            nf.field_N = nf.field_N + 1;
                            if ((nf.field_N ^ -1) > -4) {
                                statePc = 10;
                            } else {
                                statePc = 8;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            this.a((byte) 75, "alreadyloaded");
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        return;
                    }
                    case 10: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        return;
                    }
                    case 12: {
                        try {
                            lb.field_z = param3;
                            ih.field_b = param3;
                            ub.field_b = param1;
                            kk.field_b = param1;
                            wi.field_c = 0;
                            ue.field_D = 0;
                            kd.field_c = param2;
                            m.field_f = (fc) (this);
                            ni.field_e = ii.a(false);
                            dupTemp$0 = new md(param4, param5, param0, true);
                            rc.field_k = dupTemp$0;
                            fk.field_c = dupTemp$0;
                            var8 = rc.field_k.a((Runnable) (this), 1, 0);
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            if (var8.field_g != 0) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            em.a(10L, false);
                            if (var9 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var9 == 0) {
                                statePc = 13;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8_ref = caughtException;
                            kk.a((String) null, (byte) 78, var8_ref);
                            this.a((byte) 79, "crash");
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_24_0 = (RuntimeException) (var8_ref2);
                        stackIn_22_0 = stackIn_24_0;
                        stackIn_24_1 = new StringBuilder().append("fc.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                        stackIn_22_1 = stackIn_24_1;
                        if (param5 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                        stackIn_25_2 = "{...}";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                        stackIn_25_2 = "null";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        throw la.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param6 + ')');
                    }
                    case 26: {
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

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != m.field_f) {
                break L1;
              } else {
                if (dl.field_b) {
                  break L1;
                } else {
                  hj.field_db = 4000L + pf.a(0);
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
          throw la.a((Throwable) ((Object) runtimeException), "fc.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            ll.field_b = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fc.provideLoaderApplet(");

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
          throw la.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void a(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void c(byte param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ie.field_e) {
                break L1;
              } else {
                ie.field_e.removeFocusListener((java.awt.event.FocusListener) (this));
                ie.field_e.getParent().setBackground(java.awt.Color.black);
                ie.field_e.getParent().remove((java.awt.Component) ((Object) ie.field_e));
                break L1;
              }
            }
            L2: {
              L3: {
                if (b.field_i != null) {
                  break L3;
                } else {
                  L4: {
                    if (hk.field_e != null) {
                      break L4;
                    } else {
                      L5: {
                        if (ll.field_b != null) {
                          break L5;
                        } else {
                          var2 = m.field_f;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = ll.field_b;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = hk.field_e;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = b.field_i;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                ie.field_e = (java.awt.Canvas) ((Object) new ji((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ie.field_e));
                ie.field_e.setSize(ub.field_b, lb.field_z);
                ie.field_e.setVisible(true);
                if (var2 != hk.field_e) {
                  break L7;
                } else {
                  var3 = hk.field_e.getInsets();
                  ie.field_e.setLocation(ue.field_D + var3.left, wi.field_c + var3.top);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              ie.field_e.setLocation(ue.field_D, wi.field_c);
              break L6;
            }
            ie.field_e.addFocusListener((java.awt.event.FocusListener) (this));
            ie.field_e.requestFocus();
            ke.field_a = true;
            hh.field_o = true;
            gb.field_j = true;
            aj.field_c = param0;
            ah.field_e = pf.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw la.a((Throwable) (var2), "fc.PA(" + param0 + ')');
        }
    }

    final void a(byte param0, String param1) {
        try {
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (!this.field_l) {
                  L1: {
                    if (param0 >= 41) {
                      break L1;
                    } else {
                      field_k = (va) null;
                      break L1;
                    }
                  }
                  this.field_l = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L2: {
                      mf.a(-26159, "loggedout", ii.a(false));
                      break L2;
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
                } else {
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("fc.OA(").append(param0).append(',');

                if (param1 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L6;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L6;
                }
              }
              throw la.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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

    protected fc() {
        this.field_l = false;
    }

    static {
        field_j = new te(8, 0, 4, 1);
        field_m = "To server list";
        field_g = new te(1, 2, 2, 0);
        field_b = "This password contains your Player Name, and would be easy to guess";
    }
}
