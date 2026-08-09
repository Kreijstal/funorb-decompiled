/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class ug extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static pd[] field_i;
    static String field_a;
    static boolean field_p;
    static int field_o;
    private static int field_j;
    static int[] field_e;
    static dg field_n;
    static eg field_f;
    boolean field_g;
    public static int field_k;
    public static boolean field_l;
    public static boolean field_d;
    public static boolean field_b;
    public static int field_c;
    public static boolean field_m;
    public static boolean field_h;

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 < -61) {
                break L1;
              } else {
                field_o = -101;
                break L1;
              }
            }
            L2: {
              if (bg.field_P == null) {
                break L2;
              } else {
                bg.field_P.removeFocusListener((java.awt.event.FocusListener) (this));
                bg.field_P.getParent().setBackground(java.awt.Color.black);
                bg.field_P.getParent().remove((java.awt.Component) ((Object) bg.field_P));
                break L2;
              }
            }
            L3: {
              L4: {
                if (null != nk.field_d) {
                  break L4;
                } else {
                  L5: {
                    if (gi.field_b == null) {
                      break L5;
                    } else {
                      var2 = gi.field_b;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L5;
                      }
                    }
                  }
                  L6: {
                    if (aj.field_g == null) {
                      break L6;
                    } else {
                      var2 = aj.field_g;
                      if (var4 == 0) {
                        break L3;
                      } else {
                        break L6;
                      }
                    }
                  }
                  var2 = mj.field_c;
                  if (var4 == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = nk.field_d;
              break L3;
            }
            L7: {
              L8: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                bg.field_P = (java.awt.Canvas) ((Object) new pk((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) bg.field_P));
                bg.field_P.setSize(sd.field_c, fl.field_v);
                bg.field_P.setVisible(true);
                if (var2 != gi.field_b) {
                  break L8;
                } else {
                  var3 = gi.field_b.getInsets();
                  bg.field_P.setLocation(ra.field_g + var3.left, bc.field_d + var3.top);
                  if (var4 == 0) {
                    break L7;
                  } else {
                    break L8;
                  }
                }
              }
              bg.field_P.setLocation(ra.field_g, bc.field_d);
              break L7;
            }
            bg.field_P.addFocusListener((java.awt.event.FocusListener) (this));
            bg.field_P.requestFocus();
            c.field_a = true;
            m.field_d = true;
            je.field_f = true;
            sa.field_c = false;
            hc.field_R = ol.a(256);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (var2), "ug.V(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
            if (param0 != -13) {
                ug.a(-72, (byte) 117, (int[]) null, -82, -38, 20, -70, -121, 2, -97);
            }
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ug.U(" + param0 + ')');
        }
    }

    public final void run() {
        try {
            boolean stackIn_50_0 = false;
            boolean stackIn_68_0 = false;
            int stackIn_73_0 = 0;
            int stackIn_73_1 = 0;
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
                        var5 = TorChallenge.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != uj.field_j) {
                                statePc = 4;
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
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var1 = uj.field_j.toLowerCase();
                            if (-1 != ((String) (var1)).indexOf("sun")) {
                                statePc = 10;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (0 != (((String) (var1)).indexOf("apple") ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = uj.field_n;
                            if (var2.equals("1.1")) {
                                statePc = 43;
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
                            if (var2.startsWith("1.1.")) {
                                statePc = 43;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 43;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 43;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 43;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 43;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 43;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 43;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 43;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 43;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (var2.equals("1.6.0")) {
                                statePc = 43;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            this.a((byte) -126, "wrongjava");
                            if (var5 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 44;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 63;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 109;
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
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 48: {
                        try {
                            if ((var2.length() ^ -1) >= (var3 ^ -1)) {
                                statePc = 56;
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
                            stackIn_68_0 = qb.a(var2.charAt(var3), true);
                            stackIn_50_0 = stackIn_68_0;
                            if (var5 != 0) {
                                statePc = 68;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 109;
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
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 109;
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
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!ei.a((byte) -117, (CharSequence) ((Object) var4))) {
                                statePc = 63;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (-11 >= (qh.a((CharSequence) ((Object) var4), (byte) -85) ^ -1)) {
                                statePc = 63;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            this.a((byte) -116, "wrongjava");
                            if (var5 == 0) {
                                statePc = 108;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (null == uj.field_n) {
                                statePc = 84;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
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
                            stackIn_68_0 = uj.field_n.startsWith("1.");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (stackIn_68_0) {
                                statePc = 70;
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
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if (var1_int >= uj.field_n.length()) {
                                statePc = 80;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var3 = uj.field_n.charAt(var1_int);
                            stackIn_81_0 = 48;
                            stackIn_73_0 = stackIn_81_0;
                            stackIn_81_1 = var3;
                            stackIn_73_1 = stackIn_81_1;
                            if (var5 != 0) {
                                statePc = 81;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (stackIn_73_0 > stackIn_73_1) {
                                statePc = 80;
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
                            if ((var3 ^ -1) < -58) {
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
                            var1_int++;
                            var2_int = -48 - -var3 + 10 * var2_int;
                            if (var5 == 0) {
                                statePc = 71;
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
                            stackIn_81_0 = var2_int ^ -1;
                            stackIn_81_1 = -6;
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
                            if (stackIn_81_0 > stackIn_81_1) {
                                statePc = 84;
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
                            ah.field_h = true;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var1 = mj.field_c;
                            if (null != aj.field_g) {
                                statePc = 87;
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
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var1 = aj.field_g;
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 109;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var2_ref = uj.field_o;
                            if (null == var2_ref) {
                                statePc = 92;
                            } else {
                                statePc = 89;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
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
                            ef.a((byte) 88);
                            this.e(-87);
                            la.field_f = dk.a(fl.field_v, (java.awt.Component) ((Object) bg.field_P), -124, sd.field_c);
                            this.d(-117);
                            hl.field_b = ac.a(true);
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
                            if (vd.field_a == 0L) {
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
                            stackIn_100_0 = ((vd.field_a ^ -1L) < (ol.a(256) ^ -1L) ? -1 : ((vd.field_a ^ -1L) == (ol.a(256) ^ -1L) ? 0 : 1));
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
                            if (stackIn_95_0 >= 0) {
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
                            k.field_g = hl.field_b.a((byte) -12, cj.field_i);
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
                            if (k.field_g <= var3) {
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
                            this.c(126);
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
                            this.g(-30261);
                            hd.a(119, sh.field_u, bg.field_P);
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
                            td.a((String) null, (Throwable) (var1), (byte) -128);
                            this.a((byte) -127, "crash");
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
                            this.a(0, true);
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
                        throw oj.a((Throwable) (var1), "ug.run()");
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

    private final void g(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          L0: {
            L1: {
              var2_long = ol.a(param0 + 30517);
              var4 = cj.field_l[nk.field_e];
              cj.field_l[nk.field_e] = var2_long;
              if (param0 == -30261) {
                break L1;
              } else {
                field_j = 67;
                break L1;
              }
            }
            L2: {
              nk.field_e = nk.field_e - -1 & 31;
              if (-1L == (var4 ^ -1L)) {
                break L2;
              } else {
                if ((var2_long ^ -1L) >= (var4 ^ -1L)) {
                  break L2;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  oh.field_e = ((var6_int >> 1803922721) + 32000) / var6_int;
                  break L2;
                }
              }
            }
            L3: {
              fieldTemp$0 = lg.field_c;
              lg.field_c = lg.field_c + 1;
              if ((fieldTemp$0 ^ -1) >= -51) {
                break L3;
              } else {
                L4: {
                  je.field_f = true;
                  lg.field_c = lg.field_c - 50;
                  bg.field_P.setSize(sd.field_c, fl.field_v);
                  bg.field_P.setVisible(true);
                  if (null == gi.field_b) {
                    break L4;
                  } else {
                    if (nk.field_d != null) {
                      break L4;
                    } else {
                      var6 = gi.field_b.getInsets();
                      bg.field_P.setLocation(var6.left + ra.field_g, bc.field_d + var6.top);
                      if (!TorChallenge.field_F) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                bg.field_P.setLocation(ra.field_g, bc.field_d);
                break L3;
              }
            }
            this.f(param0 ^ -26805);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "ug.R(" + param0 + ')');
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (this != mj.field_c) {
                break L1;
              } else {
                if (jf.field_rb) {
                  break L1;
                } else {
                  L2: {
                    je.field_f = true;
                    if (!ah.field_h) {
                      break L2;
                    } else {
                      if (-1001L <= (-hc.field_R + ol.a(256) ^ -1L)) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if ((var2.width ^ -1) > (kd.field_r ^ -1)) {
                              break L2;
                            } else {
                              if ((var2.height ^ -1) <= (bk.field_i ^ -1)) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        sa.field_c = true;
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
            stackIn_25_0 = (RuntimeException) (var2_ref);

            stackIn_25_1 = new StringBuilder().append("ug.paint(");

            if (param0 == null) {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "null";
              break L4;
            } else {
              stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
              stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
              stackIn_26_2 = "{...}";
              break L4;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, lj param1) {
        wg var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              wg.b(param1.a(-2, "", "headers.packvorbis"));
              if (param0 == 0) {
                break L1;
              } else {
                field_i = (pd[]) null;
                break L1;
              }
            }
            var2 = wg.a(param1, "jagex logo2.packvorbis", "");
            var2.c();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2_ref = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2_ref);

            stackIn_8_1 = new StringBuilder().append("ug.W(").append(param0).append(',');

            if (param1 == null) {
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
          throw oj.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
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
            aj.field_g = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ug.provideLoaderApplet(");

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
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (null == gi.field_b) {
              L1: {
                if (aj.field_g == null) {
                  break L1;
                } else {
                  if (aj.field_g == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = aj.field_g.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getDocumentBase();
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
          throw oj.a((Throwable) ((Object) var1), "ug.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    abstract void b(int param0);

    final void a(byte param0, String param1) {
        try {
            Throwable throwable = null;
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                if (!this.field_g) {
                  this.field_g = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      ff.a("loggedout", gi.b(12476), 20511);
                      break L1;
                    }
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    L2: {
                      throwable = decompiledCaughtException;
                      break L2;
                    }
                  }
                  try {
                    L3: {
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      exception = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  L5: {
                    if (param0 <= -98) {
                      break L5;
                    } else {
                      this.d((byte) 48);
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
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (runtimeException);

                stackIn_16_1 = new StringBuilder().append("ug.AA(").append(param0).append(',');

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
              throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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

    abstract void d(byte param0);

    abstract void f(int param0);

    public abstract void init();

    abstract void b(byte param0);

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
            c.field_a = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ug.focusLost(");

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
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            uj dupTemp$0 = null;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            int var8_int = 0;
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            mi var9 = null;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = TorChallenge.field_F ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (mj.field_c == null) {
                                statePc = 9;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            ih.field_J = ih.field_J + 1;
                            if ((ih.field_J ^ -1) > -4) {
                                statePc = 7;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.a((byte) -127, "alreadyloaded");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        return;
                    }
                    case 7: {
                        try {
                            this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            ra.field_g = 0;
                            ae.field_k = param5;
                            fl.field_v = param0;
                            bk.field_i = param0;
                            sd.field_c = param3;
                            kd.field_r = param3;
                            var8_int = 111 / ((-79 - param2) / 46);
                            mj.field_c = (ug) (this);
                            bc.field_d = 0;
                            li.field_O = gi.b(12476);
                            dupTemp$0 = new uj(param4, param1, param6, true);
                            sh.field_u = dupTemp$0;
                            u.field_a = dupTemp$0;
                            var9 = sh.field_u.a((Runnable) (this), true, 1);
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (-1 != (var9.field_d ^ -1)) {
                                statePc = 15;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            c.a(-123, 10L);
                            if (var10 != 0) {
                                statePc = 23;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (var10 == 0) {
                                statePc = 10;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            var8 = caughtException;
                            td.a((String) null, var8, (byte) -69);
                            this.a((byte) -124, "crash");
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        var8_ref = (RuntimeException) ((Object) caughtException);
                        stackIn_21_0 = (RuntimeException) (var8_ref);
                        stackIn_19_0 = stackIn_21_0;
                        stackIn_21_1 = new StringBuilder().append("ug.BA(").append(param0).append(',');
                        stackIn_19_1 = stackIn_21_1;
                        if (param1 == null) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    }
                    case 19: {
                        stackIn_22_0 = (RuntimeException) ((Object) stackIn_19_0);
                        stackIn_22_1 = (StringBuilder) ((Object) stackIn_19_1);
                        stackIn_22_2 = "{...}";
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 21: {
                        stackIn_22_0 = (RuntimeException) ((Object) stackIn_21_0);
                        stackIn_22_1 = (StringBuilder) ((Object) stackIn_21_1);
                        stackIn_22_2 = "null";
                        statePc = 22;
                        continue stateLoop;
                    }
                    case 22: {
                        throw oj.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 23: {
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

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          L0: {
            L1: {
              var2_long = ol.a(256);
              var4 = ij.field_A[field_j];
              ij.field_A[field_j] = var2_long;
              var6 = -48 % ((param0 - 82) / 42);
              field_j = field_j - -1 & 31;
              if (0L == var4) {
                break L1;
              } else {
                if ((var4 ^ -1L) > (var2_long ^ -1L)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var7 = this;
            synchronized (var7) {
              L2: {
                m.field_d = c.field_a;
                break L2;
              }
            }
            this.d((byte) 119);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "ug.S(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

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

            stackIn_5_1 = new StringBuilder().append("ug.update(");

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
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean c(byte param0) {
        return true;
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
            if (gi.field_b != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (aj.field_g == null) {
                  break L1;
                } else {
                  if (this != aj.field_g) {
                    stackIn_12_0 = aj.field_g.getAppletContext();
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
          throw oj.a((Throwable) ((Object) var1), "ug.getAppletContext()");
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

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (gi.field_b != null) {
          return null;
        } else {
          L0: {
            if (null == aj.field_g) {
              break L0;
            } else {
              if (this != aj.field_g) {
                return aj.field_g.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!jf.field_rb) {
                  jf.field_rb = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (aj.field_g != null) {
                aj.field_g.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (param0 == 0) {
                break L3;
              } else {
                field_p = true;
                break L3;
              }
            }
            try {
              L4: {
                this.b(55);
                break L4;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L5: {
                exception = (Exception) (Object) decompiledCaughtException;
                break L5;
              }
            }
            L6: {
              if (null != bg.field_P) {
                try {
                  L7: {
                    bg.field_P.removeFocusListener((java.awt.event.FocusListener) (this));
                    bg.field_P.getParent().remove((java.awt.Component) ((Object) bg.field_P));
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
              if (sh.field_u == null) {
                break L9;
              } else {
                try {
                  L10: {
                    sh.field_u.a(true);
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
              this.b((byte) 114);
              if (null != gi.field_b) {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var3_ref2 = decompiledCaughtException;
                    break L14;
                  }
                }
                break L12;
              } else {
                break L12;
              }
            }
            System.out.println("Shutdown complete - clean:" + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "ug.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        int statePc = 0;
        Throwable caughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var16 = TorChallenge.field_F ? 1 : 0;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        param5--;
                        if (-1 < (param5 ^ -1)) {
                            statePc = 6;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 2: {
                    try {
                        var10 = param2;
                        var11 = param6;
                        var12 = param8;
                        var13 = param0;
                        var14 = param9;
                        var15 = var10[var11] >> -708943455 & 8355711;
                        var10[var11] = var15 + jh.a(var14 >> -549480239, 255) + ((jh.a(var12, 33423361) >> 1632474497) + jh.a(var13 >> 575641609, 65280));
                        param8 = param8 + param3;
                        param0 = param0 + param4;
                        param9 = param9 + param7;
                        param6++;
                        if (var16 != 0) {
                            statePc = 15;
                        } else {
                            statePc = 3;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_2) {
                        caughtException = stateCaught_2;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 3: {
                    try {
                        if (var16 == 0) {
                            statePc = 1;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        statePc = 6;
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 6: {
                    try {
                        if (param1 < -26) {
                            statePc = 15;
                        } else {
                            statePc = 7;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_6) {
                        caughtException = stateCaught_6;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        ug.a(-77, (lj) null);
                        statePc = 15;
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 10;
                        continue stateLoop;
                    }
                }
                case 10: {
                    var10_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_13_0 = (RuntimeException) (var10_ref);
                    stackIn_11_0 = stackIn_13_0;
                    stackIn_13_1 = new StringBuilder().append("ug.Q(").append(param0).append(',').append(param1).append(',');
                    stackIn_11_1 = stackIn_13_1;
                    if (param2 == null) {
                        statePc = 13;
                    } else {
                        statePc = 11;
                    }
                    continue stateLoop;
                }
                case 11: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_11_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_11_1);
                    stackIn_14_2 = "{...}";
                    statePc = 14;
                    continue stateLoop;
                }
                case 13: {
                    stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
                    stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
                    stackIn_14_2 = "null";
                    statePc = 14;
                    continue stateLoop;
                }
                case 14: {
                    throw oj.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ')');
                }
                case 15: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
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

            stackIn_5_1 = new StringBuilder().append("ug.windowClosing(");

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
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (gi.field_b == null) {
              L1: {
                if (null == aj.field_g) {
                  break L1;
                } else {
                  if (this != aj.field_g) {
                    stackIn_10_0 = aj.field_g.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_12_0 = super.getParameter(param0);
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
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("ug.getParameter(");

            if (param0 == null) {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "null";
              break L2;
            } else {
              stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
              stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
              stackIn_17_2 = "{...}";
              break L2;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (mj.field_c != this) {
                break L1;
              } else {
                if (jf.field_rb) {
                  break L1;
                } else {
                  vd.field_a = 0L;
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
          throw oj.a((Throwable) ((Object) runtimeException), "ug.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_f = null;
        field_a = null;
        field_e = null;
        if (param0 != -57) {
            return;
        }
        try {
            field_i = null;
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) ((Object) runtimeException), "ug.DA(" + param0 + ')');
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
            c.field_a = true;
            je.field_f = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ug.focusGained(");

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
          throw oj.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != mj.field_c) {
                break L1;
              } else {
                if (jf.field_rb) {
                  break L1;
                } else {
                  vd.field_a = ol.a(256) + 4000L;
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
          throw oj.a((Throwable) ((Object) runtimeException), "ug.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (mj.field_c != this) {
                break L1;
              } else {
                if (jf.field_rb) {
                  break L1;
                } else {
                  vd.field_a = ol.a(256);
                  c.a(79, 5000L);
                  u.field_a = null;
                  this.a(0, false);
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
          throw oj.a((Throwable) ((Object) runtimeException), "ug.destroy()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String stackIn_5_0 = null;
        String stackIn_13_0 = null;
        String stackIn_21_0 = null;
        String stackIn_29_0 = null;
        boolean stackIn_33_0 = false;
        String stackIn_46_0 = null;
        int stackIn_49_0 = 0;
        String stackIn_52_0 = null;
        Object stackIn_54_0 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        RuntimeException stackIn_59_0 = null;
        StringBuilder stackIn_59_1 = null;
        String stackIn_59_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_32_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (null == param0) {
              stackIn_5_0 = le.field_b;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                var3_int = param0.length();
                var4 = -5 / ((5 - param2) / 53);
                if ((var3_int ^ -1) > -2) {
                  break L1;
                } else {
                  if (-13 > (var3_int ^ -1)) {
                    break L1;
                  } else {
                    L2: {
                      var5 = il.a(param0, (byte) 21);
                      if (var5 == null) {
                        break L2;
                      } else {
                        if (var5.length() < 1) {
                          break L2;
                        } else {
                          L3: {
                            if (ak.a(95, var5.charAt(0))) {
                              break L3;
                            } else {
                              if (ak.a(95, var5.charAt(var5.length() - 1))) {
                                break L3;
                              } else {
                                var6 = 0;
                                var7 = 0;
                                L4: while (true) {
                                  L5: {
                                    L6: {
                                      if (param0.length() <= var7) {
                                        break L6;
                                      } else {
                                        var8 = param0.charAt(var7);
                                        stackOut_32_0 = ak.a(95, (char) var8);
                                        stackIn_49_0 = stackOut_32_0 ? 1 : 0;
                                        stackIn_33_0 = stackOut_32_0;
                                        if (var9 != 0) {
                                          break L5;
                                        } else {
                                          L7: {
                                            L8: {
                                              if (stackIn_33_0) {
                                                break L8;
                                              } else {
                                                var6 = 0;
                                                if (var9 == 0) {
                                                  break L7;
                                                } else {
                                                  break L8;
                                                }
                                              }
                                            }
                                            var6++;
                                            break L7;
                                          }
                                          L9: {
                                            if ((var6 ^ -1) > -3) {
                                              break L9;
                                            } else {
                                              if (!param1) {
                                                stackIn_46_0 = a.field_b;
                                                decompiledRegionSelector0 = 4;
                                                break L0;
                                              } else {
                                                break L9;
                                              }
                                            }
                                          }
                                          var7++;
                                          if (var9 == 0) {
                                            continue L4;
                                          } else {
                                            break L6;
                                          }
                                        }
                                      }
                                    }
                                    stackIn_49_0 = var6;
                                    break L5;
                                  }
                                  if (stackIn_49_0 > 0) {
                                    stackIn_52_0 = ng.field_E;
                                    decompiledRegionSelector0 = 5;
                                    break L0;
                                  } else {
                                    stackIn_54_0 = null;
                                    decompiledRegionSelector0 = 6;
                                    break L0;
                                  }
                                }
                              }
                            }
                          }
                          stackIn_29_0 = ng.field_E;
                          decompiledRegionSelector0 = 3;
                          break L0;
                        }
                      }
                    }
                    stackIn_21_0 = le.field_b;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  }
                }
              }
              stackIn_13_0 = le.field_b;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L10: {
            var3 = decompiledCaughtException;
            stackIn_58_0 = (RuntimeException) (var3);

            stackIn_58_1 = new StringBuilder().append("ug.CA(");

            if (param0 == null) {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "null";
              break L10;
            } else {
              stackIn_59_0 = (RuntimeException) ((Object) stackIn_58_0);
              stackIn_59_1 = (StringBuilder) ((Object) stackIn_58_1);
              stackIn_59_2 = "{...}";
              break L10;
            }
          }
          throw oj.a((Throwable) ((Object) stackIn_59_0), stackIn_59_2 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_5_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_13_0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_21_0;
            } else {
              if (decompiledRegionSelector0 == 3) {
                return stackIn_29_0;
              } else {
                if (decompiledRegionSelector0 == 4) {
                  return stackIn_46_0;
                } else {
                  if (decompiledRegionSelector0 == 5) {
                    return stackIn_52_0;
                  } else {
                    return (String) ((Object) stackIn_54_0);
                  }
                }
              }
            }
          }
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected ug() {
        this.field_g = false;
    }

    static {
        field_a = "Connection lost. <%0>";
        field_p = false;
        field_o = 0;
        field_i = new pd[16];
    }
}
