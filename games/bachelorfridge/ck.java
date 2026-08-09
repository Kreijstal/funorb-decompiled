/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class ck extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_e;
    static String field_f;
    boolean field_g;
    public static int field_a;
    public static boolean field_i;
    public static boolean field_j;
    public static int field_h;
    public static int field_d;
    public static int field_b;
    public static boolean field_c;

    private final void a(int param0, boolean param1) {
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
                if (dd.field_H) {
                  return;
                } else {
                  dd.field_H = true;
                  break L1;
                }
              }
            }
            L2: {
              if (null != ov.field_f) {
                ov.field_f.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                this.d(76);
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
              if (param0 == 0) {
                break L5;
              } else {
                this.d(-15);
                break L5;
              }
            }
            L6: {
              if (dca.field_y != null) {
                try {
                  L7: {
                    dca.field_y.removeFocusListener((java.awt.event.FocusListener) (this));
                    dca.field_y.getParent().remove((java.awt.Component) ((Object) dca.field_y));
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
              if (null == ju.field_r) {
                break L9;
              } else {
                try {
                  L10: {
                    ju.field_r.a(94);
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
              this.b(84);
              if (null == fda.field_j) {
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
          throw pe.a((Throwable) ((Object) runtimeException), "ck.RA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void b(int param0);

    public final void run() {
        try {
            boolean stackIn_46_0 = false;
            boolean stackIn_64_0 = false;
            int stackIn_68_0 = 0;
            int stackIn_68_1 = 0;
            int stackIn_79_0 = 0;
            int stackIn_79_1 = 0;
            int stackIn_93_0 = 0;
            int stackIn_98_0 = 0;
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
                        var5 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == ht.field_g) {
                                statePc = 59;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            var1 = ht.field_g.toLowerCase();
                            if (-1 != ((String) (var1)).indexOf("sun")) {
                                statePc = 6;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if (0 == (((String) (var1)).indexOf("apple") ^ -1)) {
                                statePc = 59;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            var2 = ht.field_c;
                            if (var2.equals("1.1")) {
                                statePc = 37;
                            } else {
                                statePc = 7;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 10;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            statePc = 28;
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            statePc = 31;
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 107;
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
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            statePc = 37;
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            this.a("wrongjava", (byte) -48);
                            if (var5 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 38;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            statePc = 40;
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 59;
                            } else {
                                statePc = 41;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            statePc = 43;
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            var3 = 6;
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if ((var3 ^ -1) <= (var2.length() ^ -1)) {
                                statePc = 52;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            stackIn_64_0 = ula.a(var2.charAt(var3), 48);
                            stackIn_46_0 = stackIn_64_0;
                            if (var5 != 0) {
                                statePc = 64;
                            } else {
                                statePc = 46;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (!stackIn_46_0) {
                                statePc = 52;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 49;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 44;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            statePc = 52;
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!vn.a((byte) 114, (CharSequence) ((Object) var4))) {
                                statePc = 59;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            if (-11 < (pd.a((byte) 47, (CharSequence) ((Object) var4)) ^ -1)) {
                                statePc = 58;
                            } else {
                                statePc = 54;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 59;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.a("wrongjava", (byte) -48);
                            if (var5 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (null == ht.field_c) {
                                statePc = 82;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            stackIn_64_0 = ht.field_c.startsWith("1.");
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            if (!stackIn_64_0) {
                                statePc = 82;
                            } else {
                                statePc = 65;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (var1_int >= ht.field_c.length()) {
                                statePc = 78;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 67: {
                        try {
                            var3 = ht.field_c.charAt(var1_int);
                            stackIn_79_0 = var3 ^ -1;
                            stackIn_68_0 = stackIn_79_0;
                            stackIn_79_1 = -49;
                            stackIn_68_1 = stackIn_79_1;
                            if (var5 != 0) {
                                statePc = 79;
                            } else {
                                statePc = 68;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (stackIn_68_0 > stackIn_68_1) {
                                statePc = 78;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 71;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if ((var3 ^ -1) >= -58) {
                                statePc = 77;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (var5 == 0) {
                                statePc = 78;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            var2_int = var3 - (48 - 10 * var2_int);
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 66;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            stackIn_79_0 = -6;
                            stackIn_79_1 = var2_int ^ -1;
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (stackIn_79_0 < stackIn_79_1) {
                                statePc = 82;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            bha.field_n = true;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var1 = re.field_C;
                            if (ov.field_f == null) {
                                statePc = 84;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            var1 = ov.field_f;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var2_ref = ht.field_m;
                            if (var2_ref != null) {
                                statePc = 87;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 89;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 90;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            pr.a((byte) -21);
                            this.a(50);
                            hga.field_U = lp.a(dda.field_j, nn.field_b, (java.awt.Component) ((Object) dca.field_y), 29548);
                            this.c((byte) 91);
                            ena.field_m = us.a(-4127);
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            if (0L == am.field_K) {
                                statePc = 96;
                            } else {
                                statePc = 92;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            stackIn_98_0 = (am.field_K < f.b((byte) 73) ? -1 : (am.field_K == f.b((byte) 73) ? 0 : 1));
                            stackIn_93_0 = stackIn_98_0;
                            if (var5 != 0) {
                                statePc = 98;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            if (stackIn_93_0 <= 0) {
                                statePc = 106;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            ea.field_f = ena.field_m.a((byte) 109, fe.field_h);
                            stackIn_98_0 = 0;
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            var3 = stackIn_98_0;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            if ((ea.field_f ^ -1) >= (var3 ^ -1)) {
                                statePc = 104;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            this.f(-84);
                            var3++;
                            if (var5 != 0) {
                                statePc = 105;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            if (var5 == 0) {
                                statePc = 99;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            this.c(-2100834399);
                            he.a(ju.field_r, false, dca.field_y);
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            if (var5 == 0) {
                                statePc = 91;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 107;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 110;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            var1 = caughtException;
                            cv.a(1, (String) null, (Throwable) (var1));
                            this.a("crash", (byte) -48);
                            statePc = 108;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 110;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            this.a(0, true);
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 110;
                            continue stateLoop;
                        }
                    }
                    case 110: {
                        var1 = caughtException;
                        throw pe.a((Throwable) (var1), "ck.run()");
                    }
                    case 111: {
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

    final void a(String param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        try {
            ht dupTemp$0 = null;
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
            eh var9 = null;
            int var10 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var10 = BachelorFridge.field_y;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (re.field_C != null) {
                                statePc = 4;
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
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            pe.field_k = pe.field_k + 1;
                            if (pe.field_k < 3) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 16;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.a("alreadyloaded", (byte) -48);
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
                            dda.field_j = param4;
                            kb.field_h = param4;
                            qw.field_d = 0;
                            wk.field_g = 0;
                            ej.field_p = param1;
                            nn.field_b = param6;
                            tha.field_q = param6;
                            re.field_C = (ck) (this);
                            jia.field_m = nia.d(-31768);
                            var8_int = -118 / ((35 - param3) / 54);
                            dupTemp$0 = new ht(param2, param0, param5, true);
                            ju.field_r = dupTemp$0;
                            v.field_d = dupTemp$0;
                            var9 = ju.field_r.a((Runnable) (this), 2, 1);
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
                            if (-1 != (var9.field_f ^ -1)) {
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
                            gda.a(false, 10L);
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
                            cv.a(1, (String) null, var8);
                            this.a("crash", (byte) -48);
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
                        stackIn_21_1 = new StringBuilder().append("ck.UA(");
                        stackIn_19_1 = stackIn_21_1;
                        if (param0 == null) {
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
                        throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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

    public final void stop() {
        if (re.field_C != this || dd.field_H) {
            return;
        }
        try {
            am.field_K = f.b((byte) 73) - -4000L;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ck.stop()");
        }
    }

    abstract void b(byte param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (fda.field_j == null) {
              L1: {
                if (null == ov.field_f) {
                  break L1;
                } else {
                  if (this != ov.field_f) {
                    stackIn_10_0 = ov.field_f.getDocumentBase();
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
          throw pe.a((Throwable) ((Object) var1), "ck.getDocumentBase()");
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

    final boolean d(byte param0) {
        return true;
    }

    final void a(String param0, byte param1) {
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
                if (this.field_g) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.field_g = true;
                  if (param1 == -48) {
                    System.out.println("error_game_" + param0);
                    try {
                      L1: {
                        ac.a(nia.d(param1 ^ 31800), "loggedout", (byte) 64);
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
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_16_0 = (RuntimeException) (var3_ref2);

                stackIn_16_1 = new StringBuilder().append("ck.TA(");

                if (param0 == null) {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "null";
                  break L5;
                } else {
                  stackIn_17_0 = (RuntimeException) ((Object) stackIn_16_0);
                  stackIn_17_1 = (StringBuilder) ((Object) stackIn_16_1);
                  stackIn_17_2 = "{...}";
                  break L5;
                }
              }
              throw pe.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ',' + param1 + ')');
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

    abstract void d(int param0);

    abstract void a(byte param0);

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
            if (fda.field_j != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (ov.field_f == null) {
                  break L1;
                } else {
                  if (this != ov.field_f) {
                    stackIn_12_0 = ov.field_f.getParameter(param0);
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

            stackIn_18_1 = new StringBuilder().append("ck.getParameter(");

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
          throw pe.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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

    public static void e(int param0) {
        if (param0 != -12132) {
            return;
        }
        try {
            field_e = null;
            field_f = null;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ck.SA(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
              if (this != re.field_C) {
                break L1;
              } else {
                if (!dd.field_H) {
                  L2: {
                    nf.field_K = true;
                    if (!bha.field_n) {
                      break L2;
                    } else {
                      if ((-gd.field_l + f.b((byte) 73) ^ -1L) >= -1001L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if ((var2.width ^ -1) > (kb.field_h ^ -1)) {
                              break L2;
                            } else {
                              if ((tha.field_q ^ -1) >= (var2.height ^ -1)) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        daa.field_vb = true;
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

            stackIn_21_1 = new StringBuilder().append("ck.paint(");

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
          throw pe.a((Throwable) ((Object) stackIn_22_0), stackIn_22_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = f.b((byte) 73);
              var4 = baa.field_C[laa.field_j];
              baa.field_C[laa.field_j] = var2_long;
              laa.field_j = 1 + laa.field_j & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if ((var4 ^ -1L) > (var2_long ^ -1L)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                L3: {
                  if (param0 <= -47) {
                    break L3;
                  } else {
                    this.stop();
                    break L3;
                  }
                }
                kt.field_i = ub.field_l;
                break L2;
              }
            }
            this.b((byte) 120);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "ck.PA(" + param0 + ')');
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (fda.field_j != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == ov.field_f) {
                  break L1;
                } else {
                  if (this == ov.field_f) {
                    break L1;
                  } else {
                    stackIn_10_0 = ov.field_f.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "ck.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    final synchronized void a(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (dca.field_y != null) {
                dca.field_y.removeFocusListener((java.awt.event.FocusListener) (this));
                dca.field_y.getParent().setBackground(java.awt.Color.black);
                dca.field_y.getParent().remove((java.awt.Component) ((Object) dca.field_y));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (ve.field_n == null) {
                  break L3;
                } else {
                  var2 = ve.field_n;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (fda.field_j != null) {
                  break L4;
                } else {
                  L5: {
                    if (null == ov.field_f) {
                      break L5;
                    } else {
                      var2 = ov.field_f;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = re.field_C;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = fda.field_j;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                dca.field_y = (java.awt.Canvas) ((Object) new hr((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) dca.field_y));
                dca.field_y.setSize(dda.field_j, nn.field_b);
                dca.field_y.setVisible(true);
                if (var2 == fda.field_j) {
                  break L7;
                } else {
                  dca.field_y.setLocation(qw.field_d, wk.field_g);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = fda.field_j.getInsets();
              dca.field_y.setLocation(var3.left + qw.field_d, var3.top - -wk.field_g);
              break L6;
            }
            L8: {
              dca.field_y.addFocusListener((java.awt.event.FocusListener) (this));
              dca.field_y.requestFocus();
              if (param0 >= 2) {
                break L8;
              } else {
                field_e = (String) null;
                break L8;
              }
            }
            ub.field_l = true;
            kt.field_i = true;
            nf.field_K = true;
            daa.field_vb = false;
            gd.field_l = f.b((byte) 73);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pe.a((Throwable) (var2), "ck.VA(" + param0 + ')');
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
            ub.field_l = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ck.focusLost(");

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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

            stackIn_5_1 = new StringBuilder().append("ck.windowClosing(");

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
            ov.field_f = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ck.provideLoaderApplet(");

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void destroy() {
        if (re.field_C != this || dd.field_H) {
            return;
        }
        try {
            am.field_K = f.b((byte) 73);
            gda.a(false, 5000L);
            v.field_d = null;
            this.a(0, false);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ck.destroy()");
        }
    }

    public final void start() {
        if (re.field_C != this || dd.field_H) {
            return;
        }
        try {
            am.field_K = 0L;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ck.start()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    abstract void c(byte param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (fda.field_j == null) {
          L0: {
            if (ov.field_f == null) {
              break L0;
            } else {
              if (this == ov.field_f) {
                break L0;
              } else {
                return ov.field_f.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
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
            ub.field_l = true;
            nf.field_K = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ck.focusGained(");

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    private final void c(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          L0: {
            L1: {
              var2_long = f.b((byte) 73);
              var4 = ta.field_d[ega.field_a];
              ta.field_d[ega.field_a] = var2_long;
              ega.field_a = 31 & 1 + ega.field_a;
              if (var4 == 0L) {
                break L1;
              } else {
                if ((var4 ^ -1L) > (var2_long ^ -1L)) {
                  var6_int = (int)(var2_long + -var4);
                  pr.field_i = ((var6_int >> -2100834399) + 32000) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              fieldTemp$1 = jc.field_v;
              jc.field_v = jc.field_v + 1;
              if (fieldTemp$1 <= 50) {
                break L2;
              } else {
                L3: {
                  nf.field_K = true;
                  jc.field_v = jc.field_v - 50;
                  dca.field_y.setSize(dda.field_j, nn.field_b);
                  dca.field_y.setVisible(true);
                  if (fda.field_j == null) {
                    break L3;
                  } else {
                    if (ve.field_n != null) {
                      break L3;
                    } else {
                      var6 = fda.field_j.getInsets();
                      dca.field_y.setLocation(var6.left + qw.field_d, wk.field_g + var6.top);
                      if (BachelorFridge.field_y == 0) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                dca.field_y.setLocation(qw.field_d, wk.field_g);
                break L2;
              }
            }
            L4: {
              this.a((byte) 32);
              if (param0 == -2100834399) {
                break L4;
              } else {
                this.windowDeactivated((java.awt.event.WindowEvent) null);
                break L4;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) runtimeException), "ck.OA(" + param0 + ')');
        }
    }

    protected ck() {
        this.field_g = false;
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

            stackIn_5_1 = new StringBuilder().append("ck.update(");

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
          throw pe.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    static {
        field_e = "to return to the normal view.";
        field_f = "Sorry, you were removed from the game you were in. This can happen if you are disconnected for too long or if the server is updated.";
    }
}
