/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class ch extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int field_b;
    boolean field_a;
    static int[] field_d;
    public static boolean field_h;
    public static boolean field_e;
    public static boolean field_i;
    public static boolean field_c;
    public static boolean field_f;
    public static int field_g;
    public static boolean field_j;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (sg.field_a != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == kg.field_m) {
                  break L1;
                } else {
                  if (this == kg.field_m) {
                    break L1;
                  } else {
                    stackIn_10_0 = kg.field_m.getDocumentBase();
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
          throw t.a((Throwable) ((Object) var1), "ch.getDocumentBase()");
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
            kg.field_m = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ch.provideLoaderApplet(");

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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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

            stackIn_5_1 = new StringBuilder().append("ch.windowClosing(");

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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (ad.field_p) {
                  return;
                } else {
                  ad.field_p = true;
                  break L1;
                }
              }
            }
            L2: {
              if (null != kg.field_m) {
                kg.field_m.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                L4: {
                  this.c(1);
                  if (param0 == 14) {
                    break L4;
                  } else {
                    this.a(-33);
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
              if (f.field_kb == null) {
                break L6;
              } else {
                try {
                  L7: {
                    f.field_kb.removeFocusListener((java.awt.event.FocusListener) (this));
                    f.field_kb.getParent().remove((java.awt.Component) ((Object) f.field_kb));
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
              }
            }
            L9: {
              if (ka.field_i == null) {
                break L9;
              } else {
                try {
                  L10: {
                    ka.field_i.a((byte) 13);
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
              this.b((byte) -64);
              if (null != sg.field_a) {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var3_ref = decompiledCaughtException;
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
          throw t.a((Throwable) ((Object) runtimeException), "ch.I(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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

            stackIn_5_1 = new StringBuilder().append("ch.update(");

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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public static void c(byte param0) {
        try {
            field_d = null;
            int var1_int = 30 % ((30 - param0) / 52);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ch.E(" + param0 + ')');
        }
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
            wc.field_g = true;
            dl.field_c = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ch.focusGained(");

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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
                if (!this.field_a) {
                  L1: {
                    this.field_a = true;
                    System.out.println("error_game_" + param1);
                    if (param0 == 79) {
                      break L1;
                    } else {
                      ch.c((byte) -125);
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      wk.a((byte) -6, k.c(115), "loggedout");
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
                stackIn_15_0 = (RuntimeException) (var3_ref2);

                stackIn_15_1 = new StringBuilder().append("ch.A(").append(param0).append(',');

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
              throw t.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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

    public final void run() {
        try {
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_70_0 = 0;
            int stackIn_70_1 = 0;
            int stackIn_78_0 = 0;
            int stackIn_78_1 = 0;
            int stackIn_94_0 = 0;
            int stackIn_99_0 = 0;
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
                        var5 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (d.field_o != null) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var1 = d.field_o.toLowerCase();
                            if (-1 != ((String) (var1)).indexOf("sun")) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if ((((String) (var1)).indexOf("apple") ^ -1) == 0) {
                                statePc = 61;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = d.field_t;
                            if (var2.equals("1.1")) {
                                statePc = 41;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            this.a((byte) 79, "wrongjava");
                            if (var5 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 46: {
                        try {
                            if (var2.length() <= var3) {
                                statePc = 54;
                            } else {
                                statePc = 47;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_46) {
                            caughtException = stateCaught_46;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            stackIn_66_0 = rc.a(-58, var2.charAt(var3));
                            stackIn_48_0 = stackIn_66_0;
                            if (var5 != 0) {
                                statePc = 66;
                            } else {
                                statePc = 48;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            statePc = 51;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            statePc = 54;
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!f.b((byte) -115, (CharSequence) ((Object) var4))) {
                                statePc = 61;
                            } else {
                                statePc = 55;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            if (ol.a(false, (CharSequence) ((Object) var4)) < 10) {
                                statePc = 60;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            this.a((byte) 79, "wrongjava");
                            if (var5 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (d.field_t == null) {
                                statePc = 81;
                            } else {
                                statePc = 62;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            statePc = 64;
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            stackIn_66_0 = d.field_t.startsWith("1.");
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            if (!stackIn_66_0) {
                                statePc = 81;
                            } else {
                                statePc = 67;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 108;
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
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            if ((d.field_t.length() ^ -1) >= (var1_int ^ -1)) {
                                statePc = 77;
                            } else {
                                statePc = 69;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            var3 = d.field_t.charAt(var1_int);
                            stackIn_78_0 = var3;
                            stackIn_70_0 = stackIn_78_0;
                            stackIn_78_1 = 48;
                            stackIn_70_1 = stackIn_78_1;
                            if (var5 != 0) {
                                statePc = 78;
                            } else {
                                statePc = 70;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (stackIn_70_0 < stackIn_70_1) {
                                statePc = 77;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (-58 > (var3 ^ -1)) {
                                statePc = 77;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            var2_int = 10 * var2_int - 48 - -var3;
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 68;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            stackIn_78_0 = var2_int ^ -1;
                            stackIn_78_1 = -6;
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if (stackIn_78_0 > stackIn_78_1) {
                                statePc = 81;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            oe.field_S = true;
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            var1 = qa.field_d;
                            if (null != kg.field_m) {
                                statePc = 84;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var1 = kg.field_m;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var2_ref = d.field_v;
                            if (null != var2_ref) {
                                statePc = 88;
                            } else {
                                statePc = 86;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 90;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 91;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 91: {
                        try {
                            oc.a(75);
                            this.b(true);
                            sh.field_y = fk.a(false, (java.awt.Component) ((Object) f.field_kb), ok.field_c, kh.field_d);
                            this.b(117);
                            eg.field_p = ba.a(5000);
                            statePc = 92;
                            continue stateLoop;
                        } catch (Throwable stateCaught_91) {
                            caughtException = stateCaught_91;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            if (0L == ka.field_a) {
                                statePc = 97;
                            } else {
                                statePc = 93;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            stackIn_99_0 = ((ka.field_a ^ -1L) < (oa.a(-12520) ^ -1L) ? -1 : ((ka.field_a ^ -1L) == (oa.a(-12520) ^ -1L) ? 0 : 1));
                            stackIn_94_0 = stackIn_99_0;
                            if (var5 != 0) {
                                statePc = 99;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            if (stackIn_94_0 >= 0) {
                                statePc = 107;
                            } else {
                                statePc = 95;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            nf.field_w = eg.field_p.a((byte) -6, oj.field_c);
                            stackIn_99_0 = 0;
                            statePc = 99;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            var3 = stackIn_99_0;
                            statePc = 100;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (nf.field_w <= var3) {
                                statePc = 105;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            this.a((byte) -10);
                            var3++;
                            if (var5 != 0) {
                                statePc = 106;
                            } else {
                                statePc = 102;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 102: {
                        try {
                            if (var5 == 0) {
                                statePc = 100;
                            } else {
                                statePc = 103;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_102) {
                            caughtException = stateCaught_102;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.d(32000);
                            wj.a(ka.field_i, (byte) 83, f.field_kb);
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (var5 == 0) {
                                statePc = 92;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            var1 = caughtException;
                            gi.a((Throwable) (var1), (String) null, (byte) 125);
                            this.a((byte) 79, "crash");
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
                            this.a((byte) 14, true);
                            statePc = 112;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 111;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        var1 = caughtException;
                        throw t.a((Throwable) (var1), "ch.run()");
                    }
                    case 112: {
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

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (sg.field_a == null) {
              L1: {
                if (kg.field_m == null) {
                  break L1;
                } else {
                  if (this == kg.field_m) {
                    break L1;
                  } else {
                    stackIn_8_0 = kg.field_m.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getAppletContext();
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
          throw t.a((Throwable) ((Object) var1), "ch.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void b(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.field_C;
        try {
          L0: {
            L1: {
              if (f.field_kb != null) {
                f.field_kb.removeFocusListener((java.awt.event.FocusListener) (this));
                f.field_kb.getParent().setBackground(java.awt.Color.black);
                f.field_kb.getParent().remove((java.awt.Component) ((Object) f.field_kb));
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (he.field_a != null) {
                  break L3;
                } else {
                  L4: {
                    if (null != sg.field_a) {
                      break L4;
                    } else {
                      L5: {
                        if (kg.field_m == null) {
                          break L5;
                        } else {
                          var2 = kg.field_m;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = qa.field_d;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = sg.field_a;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = he.field_a;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                f.field_kb = (java.awt.Canvas) ((Object) new bh((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) f.field_kb));
                f.field_kb.setSize(kh.field_d, ok.field_c);
                f.field_kb.setVisible(param0);
                if (sg.field_a == var2) {
                  break L7;
                } else {
                  f.field_kb.setLocation(qa.field_b, hk.field_B);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = sg.field_a.getInsets();
              f.field_kb.setLocation(var3.left + qa.field_b, var3.top - -hk.field_B);
              break L6;
            }
            f.field_kb.addFocusListener((java.awt.event.FocusListener) (this));
            f.field_kb.requestFocus();
            lh.field_d = true;
            wc.field_g = true;
            dl.field_c = true;
            ab.field_a = false;
            Geoblox.field_D = oa.a(-12520);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) (var2), "ch.H(" + param0 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != qa.field_d) {
                break L1;
              } else {
                if (ad.field_p) {
                  break L1;
                } else {
                  ka.field_a = 0L;
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
          throw t.a((Throwable) ((Object) runtimeException), "ch.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2;
        sa var3;
        StringWriter var3_ref;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        L0: {
          if (param0 instanceof sa) {
            var3 = (sa) ((Object) param0);
            param0 = var3.field_a;
            var2 = var3.field_d + " | ";
            break L0;
          } else {
            var2 = "";
            break L0;
          }
        }
        L1: {
          var3_ref = new StringWriter();
          if (param1 == 1) {
            break L1;
          } else {
            field_b = 61;
            break L1;
          }
        }
        var4 = new PrintWriter((Writer) ((Object) var3_ref));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var3_ref.toString();
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        L2: while (true) {
          var8 = var6.readLine();
          if (null == var8) {
            var2 = var2 + "| " + var7;
            return var2;
          } else {
            L3: {
              var9 = var8.indexOf('(');
              var10 = var8.indexOf(')', var9 + 1);
              if (-1 != var9) {
                var11 = var8.substring(0, var9);
                break L3;
              } else {
                var11 = var8;
                break L3;
              }
            }
            L4: {
              var11 = var11.trim();
              var11 = var11.substring(var11.lastIndexOf(' ') + 1);
              var11 = var11.substring(1 + var11.lastIndexOf('\t'));
              var2 = var2 + var11;
              if (var9 == -1) {
                break L4;
              } else {
                if (-1 == var10) {
                  break L4;
                } else {
                  var12 = var8.indexOf(".java:", var9);
                  if (var12 < 0) {
                    break L4;
                  } else {
                    var2 = var2 + var8.substring(var12 + 5, var10);
                    break L4;
                  }
                }
              }
            }
            var2 = var2 + ' ';
            continue L2;
          }
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean a(boolean param0) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != sg.field_a) {
          return null;
        } else {
          L0: {
            if (null == kg.field_m) {
              break L0;
            } else {
              if (kg.field_m != this) {
                return kg.field_m.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
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
            wc.field_g = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("ch.focusLost(");

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
          throw t.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void b(int param0);

    private final void a(byte param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              if (param0 == -10) {
                break L1;
              } else {
                field_b = -102;
                break L1;
              }
            }
            L2: {
              var2_long = oa.a(param0 ^ 12526);
              var4 = tl.field_l[ij.field_cb];
              tl.field_l[ij.field_cb] = var2_long;
              ij.field_cb = 31 & 1 + ij.field_cb;
              if (var4 == 0L) {
                break L2;
              } else {
                if (var2_long > var4) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L3: {
                lh.field_d = wc.field_g;
                break L3;
              }
            }
            this.c(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ch.L(" + param0 + ')');
        }
    }

    abstract void b(byte param0);

    public abstract void init();

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
              if (qa.field_d != this) {
                break L1;
              } else {
                if (ad.field_p) {
                  break L1;
                } else {
                  L2: {
                    dl.field_c = true;
                    if (!oe.field_S) {
                      break L2;
                    } else {
                      if ((-Geoblox.field_D + oa.a(-12520) ^ -1L) >= -1001L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (null == var2) {
                            break L3;
                          } else {
                            if ((var2.width ^ -1) > (qb.field_G ^ -1)) {
                              break L2;
                            } else {
                              if (sd.field_w <= var2.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        ab.field_a = true;
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

            stackIn_25_1 = new StringBuilder().append("ch.paint(");

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
          throw t.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void destroy() {
        if (qa.field_d != this || ad.field_p) {
            return;
        }
        try {
            ka.field_a = oa.a(-12520);
            bc.a(0, 5000L);
            ml.field_s = null;
            this.a((byte) 14, false);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "ch.destroy()");
        }
    }

    abstract void c(boolean param0);

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
            d dupTemp$0 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            cb var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Geoblox.field_C;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (qa.field_d != null) {
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
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            wg.field_j = wg.field_j + 1;
                            if ((wg.field_j ^ -1) > -4) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            this.a((byte) 79, "alreadyloaded");
                            statePc = 6;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 18;
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
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        return;
                    }
                    case 9: {
                        try {
                            kk.field_t = param2;
                            ok.field_c = param3;
                            sd.field_w = param3;
                            qa.field_b = 0;
                            hk.field_B = 0;
                            kh.field_d = param4;
                            qb.field_G = param4;
                            qa.field_d = (ch) (this);
                            c.field_x = k.c(107);
                            if (param1 == -14948) {
                                statePc = 11;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            dupTemp$0 = new d(param0, param5, param6, true);
                            ka.field_i = dupTemp$0;
                            ml.field_s = dupTemp$0;
                            var8 = ka.field_i.a((Runnable) (this), 0, 1);
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            if (-1 != (var8.field_a ^ -1)) {
                                statePc = 17;
                            } else {
                                statePc = 13;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            bc.a(0, 10L);
                            if (var9 != 0) {
                                statePc = 25;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 18;
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
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 18;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            var8_ref = caughtException;
                            gi.a(var8_ref, (String) null, (byte) 125);
                            this.a((byte) 79, "crash");
                            statePc = 25;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_23_0 = (RuntimeException) (var8_ref2);
                        stackIn_21_0 = stackIn_23_0;
                        stackIn_23_1 = new StringBuilder().append("ch.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                        stackIn_21_1 = stackIn_23_1;
                        if (param5 == null) {
                            statePc = 23;
                        } else {
                            statePc = 21;
                        }
                        continue stateLoop;
                    }
                    case 21: {
                        stackIn_24_0 = (RuntimeException) ((Object) stackIn_21_0);
                        stackIn_24_1 = (StringBuilder) ((Object) stackIn_21_1);
                        stackIn_24_2 = "{...}";
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 23: {
                        stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
                        stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
                        stackIn_24_2 = "null";
                        statePc = 24;
                        continue stateLoop;
                    }
                    case 24: {
                        throw t.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ',' + param6 + ')');
                    }
                    case 25: {
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

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
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
            if (sg.field_a != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (kg.field_m == null) {
                  break L1;
                } else {
                  if (this == kg.field_m) {
                    break L1;
                  } else {
                    stackIn_10_0 = kg.field_m.getParameter(param0);
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getParameter(param0);
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_16_0 = (RuntimeException) (var2);

            stackIn_16_1 = new StringBuilder().append("ch.getParameter(");

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
          throw t.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return (String) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          L0: {
            L1: {
              if (param0 == 32000) {
                break L1;
              } else {
                this.windowActivated((java.awt.event.WindowEvent) null);
                break L1;
              }
            }
            L2: {
              var2_long = oa.a(param0 + -44520);
              var4 = pb.field_p[fe.field_k];
              pb.field_p[fe.field_k] = var2_long;
              fe.field_k = 31 & fe.field_k + 1;
              if (0L == var4) {
                break L2;
              } else {
                if (var4 < var2_long) {
                  var6_int = (int)(-var4 + var2_long);
                  ec.field_b = (32000 - -(var6_int >> 41624225)) / var6_int;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              fieldTemp$1 = rj.field_i;
              rj.field_i = rj.field_i + 1;
              if ((fieldTemp$1 ^ -1) < -51) {
                L4: {
                  L5: {
                    rj.field_i = rj.field_i - 50;
                    dl.field_c = true;
                    f.field_kb.setSize(kh.field_d, ok.field_c);
                    f.field_kb.setVisible(true);
                    if (sg.field_a == null) {
                      break L5;
                    } else {
                      if (he.field_a == null) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  f.field_kb.setLocation(qa.field_b, hk.field_B);
                  if (Geoblox.field_C == 0) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                var6 = sg.field_a.getInsets();
                f.field_kb.setLocation(var6.left + qa.field_b, hk.field_B + var6.top);
                break L3;
              } else {
                break L3;
              }
            }
            this.a(25853);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "ch.F(" + param0 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != qa.field_d) {
                break L1;
              } else {
                if (ad.field_p) {
                  break L1;
                } else {
                  ka.field_a = 4000L + oa.a(-12520);
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
          throw t.a((Throwable) ((Object) runtimeException), "ch.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract void a(int param0);

    abstract void c(int param0);

    protected ch() {
        this.field_a = false;
    }

    static {
        field_b = 0;
        field_d = new int[1024];
    }
}
