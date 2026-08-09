/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fj extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_b;
    static String field_f;
    static String field_c;
    public static boolean field_g;
    public static int field_j;
    public static boolean field_h;
    public static int field_a;
    public static int field_i;
    public static int field_d;
    public static int field_e;

    abstract void b(byte param0);

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

            stackIn_5_1 = new StringBuilder().append("fj.update(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != jj.field_a) {
                break L1;
              } else {
                if (tk.field_q) {
                  break L1;
                } else {
                  t.field_h = 0L;
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
          throw ma.a((Throwable) ((Object) runtimeException), "fj.start()");
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
            gh.field_j = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fj.focusLost(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
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
            if (null != q.field_g) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (uh.field_i == null) {
                  break L1;
                } else {
                  if (this != uh.field_i) {
                    stackIn_12_0 = uh.field_i.getAppletContext();
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
          throw ma.a((Throwable) ((Object) var1), "fj.getAppletContext()");
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
                if (!tk.field_q) {
                  tk.field_q = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (uh.field_i != null) {
                uh.field_i.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                L4: {
                  this.f(-58);
                  if (!param1) {
                    break L4;
                  } else {
                    this.getAppletContext();
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
              if (null != tb.field_c) {
                try {
                  L7: {
                    tb.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
                    tb.field_c.getParent().remove((java.awt.Component) ((Object) tb.field_c));
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
              if (jk.field_a != null) {
                try {
                  L10: {
                    jk.field_a.a(0);
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
              } else {
                break L9;
              }
            }
            L12: {
              this.a(0);
              if (q.field_g == null) {
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
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "fj.OB(" + param0 + ',' + param1 + ')');
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
                        var5 = Main.field_T;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == le.field_v) {
                                statePc = 61;
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
                            var1 = le.field_v.toLowerCase();
                            if ((((String) (var1)).indexOf("sun") ^ -1) != 0) {
                                statePc = 8;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            if ((((String) (var1)).indexOf("apple") ^ -1) != 0) {
                                statePc = 8;
                            } else {
                                statePc = 4;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = le.field_w;
                            if (var2.equals("1.1")) {
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                                statePc = 39;
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
                            if (!var2.equals("1.6.0")) {
                                statePc = 42;
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
                            this.a((byte) -96, "wrongjava");
                            if (var5 == 0) {
                                statePc = 110;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            if (!var2.startsWith("1.6.0_")) {
                                statePc = 61;
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
                            var3 = 6;
                            statePc = 46;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if ((var2.length() ^ -1) >= (var3 ^ -1)) {
                                statePc = 54;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_66_0 = Main.a(-49, var2.charAt(var3));
                            stackIn_48_0 = stackIn_66_0;
                            if (var5 != 0) {
                                statePc = 66;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!pg.a(false, (CharSequence) ((Object) var4))) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (-11 >= (ie.a(false, (CharSequence) ((Object) var4)) ^ -1)) {
                                statePc = 61;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            this.a((byte) -41, "wrongjava");
                            if (var5 == 0) {
                                statePc = 110;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (le.field_w == null) {
                                statePc = 84;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackIn_66_0 = le.field_w.startsWith("1.");
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
                            if (!stackIn_66_0) {
                                statePc = 84;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if (var1_int >= le.field_w.length()) {
                                statePc = 80;
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
                            var3 = le.field_w.charAt(var1_int);
                            stackIn_81_0 = var3;
                            stackIn_70_0 = stackIn_81_0;
                            stackIn_81_1 = 48;
                            stackIn_70_1 = stackIn_81_1;
                            if (var5 != 0) {
                                statePc = 81;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (stackIn_70_0 < stackIn_70_1) {
                                statePc = 80;
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
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (57 >= var3) {
                                statePc = 79;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            var2_int = var3 + (-48 + 10 * var2_int);
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 111;
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
                            statePc = 111;
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
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            hi.field_a = true;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var1 = jj.field_a;
                            if (null != uh.field_i) {
                                statePc = 87;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 88;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var1 = uh.field_i;
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
                            var2_ref = le.field_g;
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
                            ac.a(7400);
                            this.d(-1775094552);
                            gf.field_e = ij.a(-114, (java.awt.Component) ((Object) tb.field_c), hj.field_j, gg.field_d);
                            this.c(4405028);
                            ag.field_b = ca.a(false);
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
                            if ((t.field_h ^ -1L) == -1L) {
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
                            stackIn_102_0 = (id.a(127) < t.field_h ? -1 : (id.a(127) == t.field_h ? 0 : 1));
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
                            if (stackIn_97_0 >= 0) {
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
                            de.field_c = ag.field_b.a(qb.field_f, -127);
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
                            if (de.field_c <= var3) {
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
                            this.b(31);
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
                            this.e(5);
                            Main.a(tb.field_c, jk.field_a, (byte) 119);
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
                            k.a((Throwable) (var1), (byte) -126, (String) null);
                            this.a((byte) -56, "crash");
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
                            this.a(true, false);
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
                        throw ma.a((Throwable) (var1), "fj.run()");
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

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        if (jj.field_a != this || tk.field_q) {
            return;
        }
        try {
            t.field_h = id.a(56);
            wk.a((byte) -123, 5000L);
            Main.field_W = null;
            this.a(false, false);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fj.destroy()");
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
            if (q.field_g != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (uh.field_i == null) {
                  break L1;
                } else {
                  if (this != uh.field_i) {
                    stackIn_12_0 = uh.field_i.getParameter(param0);
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

            stackIn_18_1 = new StringBuilder().append("fj.getParameter(");

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
          throw ma.a((Throwable) ((Object) stackIn_19_0), stackIn_19_2 + ')');
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
                if (!this.field_b) {
                  this.field_b = true;
                  if (param0 <= -30) {
                    System.out.println("error_game_" + param1);
                    try {
                      L1: {
                        vh.a("loggedout", -12151, mk.g(-125));
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
                        this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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

                stackIn_15_1 = new StringBuilder().append("fj.RB(").append(param0).append(',');

                if (param1 == null) {
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
              throw ma.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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

    abstract void a(boolean param0);

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          L0: {
            L1: {
              if (null != tb.field_c) {
                tb.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
                tb.field_c.getParent().setBackground(java.awt.Color.black);
                tb.field_c.getParent().remove((java.awt.Component) ((Object) tb.field_c));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (fg.field_n != null) {
                  break L3;
                } else {
                  L4: {
                    if (q.field_g == null) {
                      break L4;
                    } else {
                      var2 = q.field_g;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (null == uh.field_i) {
                      break L5;
                    } else {
                      var2 = uh.field_i;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = jj.field_a;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = fg.field_n;
              break L2;
            }
            ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
            tb.field_c = (java.awt.Canvas) ((Object) new ce((java.awt.Component) (this)));
            if (param0 == -1775094552) {
              L6: {
                L7: {
                  ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) tb.field_c));
                  tb.field_c.setSize(gg.field_d, hj.field_j);
                  tb.field_c.setVisible(true);
                  if (var2 == q.field_g) {
                    break L7;
                  } else {
                    tb.field_c.setLocation(sk.field_d, rh.field_k);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var3 = q.field_g.getInsets();
                tb.field_c.setLocation(var3.left - -sk.field_d, var3.top + rh.field_k);
                break L6;
              }
              tb.field_c.addFocusListener((java.awt.event.FocusListener) (this));
              tb.field_c.requestFocus();
              gh.field_j = true;
              r.field_q = true;
              ii.field_a = true;
              vd.field_w = false;
              ej.field_jb = id.a(33);
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
          throw ma.a((Throwable) (var2), "fj.PB(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void e(int param0) {
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
              var2_long = id.a(24);
              var4 = ak.field_P[ud.field_b];
              ak.field_P[ud.field_b] = var2_long;
              if (param0 == 5) {
                break L1;
              } else {
                this.windowClosed((java.awt.event.WindowEvent) null);
                break L1;
              }
            }
            L2: {
              ud.field_b = 31 & 1 + ud.field_b;
              if (var4 == 0L) {
                break L2;
              } else {
                if ((var2_long ^ -1L) >= (var4 ^ -1L)) {
                  break L2;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  ma.field_c = ((var6_int >> 1259657313) + 32000) / var6_int;
                  break L2;
                }
              }
            }
            L3: {
              fieldTemp$1 = ag.field_f;
              ag.field_f = ag.field_f + 1;
              if ((fieldTemp$1 ^ -1) < -51) {
                L4: {
                  ag.field_f = ag.field_f - 50;
                  ii.field_a = true;
                  tb.field_c.setSize(gg.field_d, hj.field_j);
                  tb.field_c.setVisible(true);
                  if (q.field_g == null) {
                    break L4;
                  } else {
                    if (fg.field_n != null) {
                      break L4;
                    } else {
                      var6 = q.field_g.getInsets();
                      tb.field_c.setLocation(var6.left + sk.field_d, rh.field_k + var6.top);
                      if (Main.field_T == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                tb.field_c.setLocation(sk.field_d, rh.field_k);
                break L3;
              } else {
                break L3;
              }
            }
            this.b((byte) 59);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "fj.VB(" + param0 + ')');
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

            stackIn_5_1 = new StringBuilder().append("fj.windowClosing(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final boolean c(byte param0) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (q.field_g == null) {
          L0: {
            if (null == uh.field_i) {
              break L0;
            } else {
              if (uh.field_i == this) {
                break L0;
              } else {
                return uh.field_i.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    abstract void c(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        if (this != jj.field_a || tk.field_q) {
            return;
        }
        try {
            t.field_h = 4000L + id.a(30);
        } catch (RuntimeException runtimeException) {
            throw ma.a((Throwable) ((Object) runtimeException), "fj.stop()");
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = id.a(60);
              var4 = hj.field_n[kh.field_e];
              hj.field_n[kh.field_e] = var2_long;
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
            kh.field_e = param0 & 1 + kh.field_e;
            var6 = this;
            synchronized (var6) {
              L2: {
                r.field_q = gh.field_j;
                break L2;
              }
            }
            this.a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "fj.TB(" + param0 + ')');
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
              if (this != jj.field_a) {
                break L1;
              } else {
                if (tk.field_q) {
                  break L1;
                } else {
                  L2: {
                    ii.field_a = true;
                    if (!hi.field_a) {
                      break L2;
                    } else {
                      if (-ej.field_jb + id.a(124) <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (vk.field_b > var2.width) {
                              break L2;
                            } else {
                              if ((var2.height ^ -1) > (qe.field_I ^ -1)) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        vd.field_w = true;
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

            stackIn_24_1 = new StringBuilder().append("fj.paint(");

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
          throw ma.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            stackIn_1_0 = param0 | param1;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "fj.MB(" + param0 + ',' + param1 + ')');
        }
        return stackIn_1_0;
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          L0: {
            L1: {
              field_f = null;
              if (param0 == -67) {
                break L1;
              } else {
                fj.a(102, 66, -111, -47, 21, -43, (mg) null, 86);
                break L1;
              }
            }
            field_c = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "fj.NB(" + param0 + ')');
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
            gh.field_j = true;
            ii.field_a = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fj.focusGained(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
            uh.field_i = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fj.provideLoaderApplet(");

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
          throw ma.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void f(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (q.field_g != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (uh.field_i == null) {
                  break L1;
                } else {
                  if (this == uh.field_i) {
                    break L1;
                  } else {
                    stackIn_10_0 = uh.field_i.getDocumentBase();
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
          throw ma.a((Throwable) ((Object) var1), "fj.getDocumentBase()");
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

    public abstract void init();

    protected fj() {
        this.field_b = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, mg param6, int param7) {
        int stackIn_13_0 = 0;
        int stackIn_25_0 = 0;
        int[] stackIn_26_0 = null;
        int[] stackIn_28_0 = null;
        int[] stackIn_29_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        ha stackIn_64_0 = null;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_81_0 = null;
        StringBuilder stackIn_81_1 = null;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        RuntimeException stackIn_84_0 = null;
        StringBuilder stackIn_84_1 = null;
        String stackIn_84_2 = null;
        int decompiledRegionSelector0 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        mg var8 = null;
        int[] var8_array = null;
        RuntimeException var8_ref = null;
        byte[] var9 = null;
        int[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ha var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        stateLoop: while (true) {
            switch (statePc) {
                case 0: {
                    var40 = Main.field_T;
                    statePc = 1;
                    continue stateLoop;
                }
                case 1: {
                    try {
                        if (param0 <= -14) {
                            statePc = 3;
                        } else {
                            statePc = 2;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_1) {
                        caughtException = stateCaught_1;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 2: {
                    return;
                }
                case 3: {
                    try {
                        var8 = param6;
                        if (null == var8.field_D) {
                            statePc = 8;
                        } else {
                            statePc = 4;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_3) {
                        caughtException = stateCaught_3;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 4: {
                    try {
                        if (1 >= var8.field_E) {
                            statePc = 8;
                        } else {
                            statePc = 5;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_4) {
                        caughtException = stateCaught_4;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 5: {
                    try {
                        statePc = 7;
                        continue stateLoop;
                    } catch (Throwable stateCaught_5) {
                        caughtException = stateCaught_5;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 7: {
                    try {
                        var9 = var8.field_D;
                        wh.a(var9, 0, 0, tb.field_h, (byte) 80);
                        if (var40 == 0) {
                            statePc = 10;
                        } else {
                            statePc = 8;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_7) {
                        caughtException = stateCaught_7;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 8: {
                    try {
                        cc.b(124);
                        statePc = 10;
                        continue stateLoop;
                    } catch (Throwable stateCaught_8) {
                        caughtException = stateCaught_8;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 10: {
                    try {
                        var8_array = new int[param6.field_c];
                        var9_array = new int[param6.field_c];
                        var10 = ve.field_d;
                        var11 = mc.field_b;
                        var12 = oa.field_e;
                        var13 = 0;
                        statePc = 11;
                        continue stateLoop;
                    } catch (Throwable stateCaught_10) {
                        caughtException = stateCaught_10;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 11: {
                    try {
                        if (param6.field_c <= var13) {
                            statePc = 30;
                        } else {
                            statePc = 12;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_11) {
                        caughtException = stateCaught_11;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 12: {
                    try {
                        var14 = var11[var13] * param1 + var10[var13] * param5 - -(var12[var13] * param4) >> 911391784;
                        stackIn_31_0 = var14;
                        stackIn_13_0 = stackIn_31_0;
                        if (var40 != 0) {
                            statePc = 31;
                        } else {
                            statePc = 13;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_12) {
                        caughtException = stateCaught_12;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 13: {
                    try {
                        if (stackIn_13_0 < 0) {
                            statePc = 17;
                        } else {
                            statePc = 14;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_13) {
                        caughtException = stateCaught_13;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 14: {
                    try {
                        statePc = 16;
                        continue stateLoop;
                    } catch (Throwable stateCaught_14) {
                        caughtException = stateCaught_14;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 16: {
                    try {
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_16) {
                        caughtException = stateCaught_16;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 17: {
                    try {
                        var14 = -var14;
                        statePc = 18;
                        continue stateLoop;
                    } catch (Throwable stateCaught_17) {
                        caughtException = stateCaught_17;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 18: {
                    try {
                        if ((var14 ^ -1) <= -1) {
                            statePc = 21;
                        } else {
                            statePc = 19;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_18) {
                        caughtException = stateCaught_18;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 19: {
                    try {
                        stackIn_25_0 = 128;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_19) {
                        caughtException = stateCaught_19;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 21: {
                    try {
                        if ((var14 ^ -1) <= -129) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_21) {
                        caughtException = stateCaught_21;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 22: {
                    try {
                        stackIn_25_0 = var14 + 128;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_22) {
                        caughtException = stateCaught_22;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 24: {
                    try {
                        stackIn_25_0 = 256;
                        statePc = 25;
                        continue stateLoop;
                    } catch (Throwable stateCaught_24) {
                        caughtException = stateCaught_24;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 25: {
                    try {
                        var14 = stackIn_25_0;
                        var15 = var12[var13] * param3 + (var10[var13] * param2 + var11[var13] * param7) >> -1775094552;
                        stackIn_28_0 = sh.field_l;
                        stackIn_26_0 = stackIn_28_0;
                        if (var15 < 0) {
                            statePc = 28;
                        } else {
                            statePc = 26;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_25) {
                        caughtException = stateCaught_25;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 26: {
                    try {
                        stackIn_29_0 = (int[]) ((Object) stackIn_26_0);
                        stackIn_29_1 = var15;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_26) {
                        caughtException = stateCaught_26;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 28: {
                    try {
                        stackIn_29_0 = (int[]) ((Object) stackIn_28_0);
                        stackIn_29_1 = -var15;
                        statePc = 29;
                        continue stateLoop;
                    } catch (Throwable stateCaught_28) {
                        caughtException = stateCaught_28;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 29: {
                    try {
                        var15 = stackIn_29_0[stackIn_29_1];
                        var14 = var14 * (-var15 + 256) >>> -1789064920;
                        var8_array[var13] = var14;
                        var9_array[var13] = var15;
                        var13++;
                        if (var40 == 0) {
                            statePc = 11;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_29) {
                        caughtException = stateCaught_29;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 30: {
                    try {
                        stackIn_31_0 = 0;
                        statePc = 31;
                        continue stateLoop;
                    } catch (Throwable stateCaught_30) {
                        caughtException = stateCaught_30;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 31: {
                    try {
                        var13 = stackIn_31_0;
                        statePc = 32;
                        continue stateLoop;
                    } catch (Throwable stateCaught_31) {
                        caughtException = stateCaught_31;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 32: {
                    try {
                        if (var13 >= ol.field_X) {
                            statePc = 85;
                        } else {
                            statePc = 33;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_32) {
                        caughtException = stateCaught_32;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 33: {
                    try {
                        var14 = lf.field_a[var13];
                        var15 = param6.field_a[var14];
                        var16 = param6.field_Q[var14];
                        var17 = param6.field_d[var14];
                        if (var40 != 0) {
                            statePc = 85;
                        } else {
                            statePc = 34;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_33) {
                        caughtException = stateCaught_33;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 34: {
                    try {
                        if ((ve.field_d.length ^ -1) >= (param6.field_g[var14] ^ -1)) {
                            statePc = 39;
                        } else {
                            statePc = 35;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_34) {
                        caughtException = stateCaught_34;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 35: {
                    try {
                        statePc = 37;
                        continue stateLoop;
                    } catch (Throwable stateCaught_35) {
                        caughtException = stateCaught_35;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 37: {
                    try {
                        stackIn_40_0 = param6.field_g[var14];
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_37) {
                        caughtException = stateCaught_37;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 39: {
                    try {
                        stackIn_40_0 = -1;
                        statePc = 40;
                        continue stateLoop;
                    } catch (Throwable stateCaught_39) {
                        caughtException = stateCaught_39;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 40: {
                    try {
                        var18 = stackIn_40_0;
                        if ((ve.field_d.length ^ -1) >= (param6.field_v[var14] ^ -1)) {
                            statePc = 43;
                        } else {
                            statePc = 41;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_40) {
                        caughtException = stateCaught_40;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 41: {
                    try {
                        stackIn_44_0 = param6.field_v[var14];
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_41) {
                        caughtException = stateCaught_41;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 43: {
                    try {
                        stackIn_44_0 = -1;
                        statePc = 44;
                        continue stateLoop;
                    } catch (Throwable stateCaught_43) {
                        caughtException = stateCaught_43;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 44: {
                    try {
                        var19 = stackIn_44_0;
                        if ((ve.field_d.length ^ -1) < (param6.field_p[var14] ^ -1)) {
                            statePc = 47;
                        } else {
                            statePc = 45;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_44) {
                        caughtException = stateCaught_44;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 45: {
                    try {
                        stackIn_48_0 = -1;
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_45) {
                        caughtException = stateCaught_45;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 47: {
                    try {
                        stackIn_48_0 = param6.field_p[var14];
                        statePc = 48;
                        continue stateLoop;
                    } catch (Throwable stateCaught_47) {
                        caughtException = stateCaught_47;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 48: {
                    try {
                        var20 = stackIn_48_0;
                        if (ga.field_b == null) {
                            statePc = 61;
                        } else {
                            statePc = 49;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_48) {
                        caughtException = stateCaught_48;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 49: {
                    try {
                        if (param6.field_N == null) {
                            statePc = 61;
                        } else {
                            statePc = 50;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_49) {
                        caughtException = stateCaught_49;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 50: {
                    try {
                        statePc = 52;
                        continue stateLoop;
                    } catch (Throwable stateCaught_50) {
                        caughtException = stateCaught_50;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 52: {
                    try {
                        if ((var14 ^ -1) <= (param6.field_N.length ^ -1)) {
                            statePc = 61;
                        } else {
                            statePc = 53;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_52) {
                        caughtException = stateCaught_52;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 53: {
                    try {
                        statePc = 55;
                        continue stateLoop;
                    } catch (Throwable stateCaught_53) {
                        caughtException = stateCaught_53;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 55: {
                    try {
                        if ((param6.field_N[var14] ^ -1) == 0) {
                            statePc = 61;
                        } else {
                            statePc = 56;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_55) {
                        caughtException = stateCaught_55;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 56: {
                    try {
                        statePc = 58;
                        continue stateLoop;
                    } catch (Throwable stateCaught_56) {
                        caughtException = stateCaught_56;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 58: {
                    try {
                        if ((param6.field_N[var14] ^ -1) > (ga.field_b.length ^ -1)) {
                            statePc = 63;
                        } else {
                            statePc = 59;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_58) {
                        caughtException = stateCaught_58;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 59: {
                    try {
                        statePc = 61;
                        continue stateLoop;
                    } catch (Throwable stateCaught_59) {
                        caughtException = stateCaught_59;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 61: {
                    try {
                        stackIn_64_0 = null;
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_61) {
                        caughtException = stateCaught_61;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 63: {
                    try {
                        stackIn_64_0 = ga.field_b[param6.field_N[var14]];
                        statePc = 64;
                        continue stateLoop;
                    } catch (Throwable stateCaught_63) {
                        caughtException = stateCaught_63;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 64: {
                    try {
                        var21 = stackIn_64_0;
                        var22 = se.field_F[var15];
                        var23 = ai.field_j[var15];
                        var24 = se.field_F[var16];
                        var25 = ai.field_j[var16];
                        var26 = se.field_F[var17];
                        var27 = ai.field_j[var17];
                        if (var19 != var18) {
                            statePc = 73;
                        } else {
                            statePc = 65;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_64) {
                        caughtException = stateCaught_64;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 65: {
                    try {
                        if (var20 != var19) {
                            statePc = 73;
                        } else {
                            statePc = 66;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_65) {
                        caughtException = stateCaught_65;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 66: {
                    try {
                        statePc = 68;
                        continue stateLoop;
                    } catch (Throwable stateCaught_66) {
                        caughtException = stateCaught_66;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 68: {
                    try {
                        var28 = var8_array[var18];
                        var29 = var9_array[var18];
                        if (null == var21) {
                            statePc = 71;
                        } else {
                            statePc = 69;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_68) {
                        caughtException = stateCaught_68;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 69: {
                    try {
                        stackIn_72_0 = var21.field_b;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_69) {
                        caughtException = stateCaught_69;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 71: {
                    try {
                        stackIn_72_0 = 8355711;
                        statePc = 72;
                        continue stateLoop;
                    } catch (Throwable stateCaught_71) {
                        caughtException = stateCaught_71;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 72: {
                    try {
                        var30 = stackIn_72_0;
                        var31 = var30 & 16711935;
                        var32 = 65280 & var30;
                        var33 = var28 * var32 >>> 829291624 & -1308557568 | (var31 * var28 & -16711773) >>> -764179480;
                        var33 = var33 + 65793 * var29;
                        cd.a(var23, var27, var25, -1, var22, var24, (var33 & 16711422) >> -1170966847, var26);
                        if (var40 == 0) {
                            statePc = 78;
                        } else {
                            statePc = 73;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_72) {
                        caughtException = stateCaught_72;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 73: {
                    try {
                        var28 = var8_array[var18];
                        var29 = var8_array[var19];
                        var30 = var8_array[var20];
                        var31 = var9_array[var18];
                        var32 = var9_array[var19];
                        var33 = var9_array[var20];
                        if (var21 != null) {
                            statePc = 76;
                        } else {
                            statePc = 74;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_73) {
                        caughtException = stateCaught_73;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 74: {
                    try {
                        stackIn_77_0 = 8355711;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_74) {
                        caughtException = stateCaught_74;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 76: {
                    try {
                        stackIn_77_0 = var21.field_b;
                        statePc = 77;
                        continue stateLoop;
                    } catch (Throwable stateCaught_76) {
                        caughtException = stateCaught_76;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 77: {
                    try {
                        var34 = stackIn_77_0;
                        var35 = 16711935 & var34;
                        var36 = 65280 & var34;
                        var37 = var36 * var28 >>> -1332259768 & 587267840 | var28 * var35 >>> -1731800 & 1258225919;
                        var38 = 1509884159 & var35 * var29 >>> -1112080024 | -234815744 & var36 * var29 >>> -1442233880;
                        var37 = var37 + var31 * 65793;
                        var39 = var35 * var30 >>> 2144060808 & 469696767 | (var36 * var30 & 16711689) >>> 424839144;
                        var38 = var38 + var32 * 65793;
                        var39 = var39 + var33 * 65793;
                        gi.a(var39 >> -336599632, var38 & 255, (65465 & var39) >> 1451264104, var39 & 255, var37 >> -778607440, var38 >> 91065648, var22, var23, 255 & var38 >> 1984901416, 0, var25, var27, (65354 & var37) >> -1227080824, var26, var24, var37 & 255);
                        statePc = 78;
                        continue stateLoop;
                    } catch (Throwable stateCaught_77) {
                        caughtException = stateCaught_77;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 78: {
                    try {
                        var13++;
                        if (var40 == 0) {
                            statePc = 32;
                        } else {
                            statePc = 85;
                        }
                        continue stateLoop;
                    } catch (Throwable stateCaught_78) {
                        caughtException = stateCaught_78;
                        statePc = 80;
                        continue stateLoop;
                    }
                }
                case 80: {
                    var8_ref = (RuntimeException) ((Object) caughtException);
                    stackIn_83_0 = (RuntimeException) (var8_ref);
                    stackIn_81_0 = stackIn_83_0;
                    stackIn_83_1 = new StringBuilder().append("fj.SB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
                    stackIn_81_1 = stackIn_83_1;
                    if (param6 == null) {
                        statePc = 83;
                    } else {
                        statePc = 81;
                    }
                    continue stateLoop;
                }
                case 81: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_81_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_81_1);
                    stackIn_84_2 = "{...}";
                    statePc = 84;
                    continue stateLoop;
                }
                case 83: {
                    stackIn_84_0 = (RuntimeException) ((Object) stackIn_83_0);
                    stackIn_84_1 = (StringBuilder) ((Object) stackIn_83_1);
                    stackIn_84_2 = "null";
                    statePc = 84;
                    continue stateLoop;
                }
                case 84: {
                    throw ma.a((Throwable) ((Object) stackIn_84_0), stackIn_84_2 + ',' + param7 + ')');
                }
                case 85: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final void a(byte param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            le dupTemp$0 = null;
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
            vi var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Main.field_T;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (jj.field_a == null) {
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
                            sk.field_e = sk.field_e + 1;
                            if (-4 >= (sk.field_e ^ -1)) {
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
                            this.a((byte) -126, "alreadyloaded");
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
                            gg.field_d = param5;
                            vk.field_b = param5;
                            hj.field_j = param4;
                            qe.field_I = param4;
                            ca.field_d = param3;
                            jj.field_a = (fj) (this);
                            sk.field_d = 0;
                            rh.field_k = 0;
                            tk.field_o = mk.g(-118);
                            dupTemp$0 = new le(param6, param1, param2, true);
                            jk.field_a = dupTemp$0;
                            Main.field_W = dupTemp$0;
                            if (param0 > 38) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            this.a(-62);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            var8 = jk.field_a.a(0, 1, (Runnable) (this));
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (-1 != (var8.field_a ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            wk.a((byte) -94, 10L);
                            if (var9 != 0) {
                                statePc = 28;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var9 == 0) {
                                statePc = 15;
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
                            k.a(var8_ref, (byte) -106, (String) null);
                            this.a((byte) -118, "crash");
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
                        stackIn_26_1 = new StringBuilder().append("fj.QB(").append(param0).append(',');
                        stackIn_24_1 = stackIn_26_1;
                        if (param1 == null) {
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
                        throw ma.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }
}
