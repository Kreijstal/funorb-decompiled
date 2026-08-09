/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class eh extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String[] field_k;
    static boolean field_m;
    static rh field_f;
    boolean field_i;
    static ci field_b;
    static gg[] field_g;
    static int field_d;
    public static boolean field_j;
    public static int field_a;
    public static int field_e;
    public static boolean field_h;
    public static boolean field_n;
    public static boolean field_c;
    public static boolean field_l;

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
            le.field_r = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("eh.provideLoaderApplet(");

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
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_28_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (gm.field_f != this) {
                break L1;
              } else {
                if (qi.field_f) {
                  break L1;
                } else {
                  L2: {
                    il.field_e = true;
                    if (!bh.field_f) {
                      break L2;
                    } else {
                      if (-1001L > (ll.a(1000) - oj.field_x ^ -1L)) {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (var2.width < hd.field_i) {
                              break L2;
                            } else {
                              if (dj.field_a <= var2.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        ai.field_h = true;
                        break L2;
                      } else {
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
            stackIn_27_0 = (RuntimeException) (var2_ref);

            stackIn_27_1 = new StringBuilder().append("eh.paint(");

            if (param0 == null) {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "null";
              break L4;
            } else {
              stackIn_28_0 = (RuntimeException) ((Object) stackIn_27_0);
              stackIn_28_1 = (StringBuilder) ((Object) stackIn_27_1);
              stackIn_28_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_28_0), stackIn_28_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
            if (al.field_W == null) {
              L1: {
                if (null == le.field_r) {
                  break L1;
                } else {
                  if (le.field_r == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = le.field_r.getAppletContext();
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
          throw qk.a((Throwable) ((Object) var1), "eh.getAppletContext()");
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
            if (al.field_W == null) {
              L1: {
                if (null == le.field_r) {
                  break L1;
                } else {
                  if (this != le.field_r) {
                    stackIn_10_0 = le.field_r.getParameter(param0);
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

            stackIn_16_1 = new StringBuilder().append("eh.getParameter(");

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
          throw qk.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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

    public static void c(int param0) {
        try {
            field_f = null;
            field_g = null;
            field_k = null;
            field_b = null;
            if (param0 != -25) {
                field_g = (gg[]) null;
            }
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "eh.G(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
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

            stackIn_5_1 = new StringBuilder().append("eh.windowClosing(");

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
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void run() {
        try {
            boolean stackIn_50_0 = false;
            boolean stackIn_68_0 = false;
            int stackIn_73_0 = 0;
            int stackIn_73_1 = 0;
            int stackIn_84_0 = 0;
            int stackIn_84_1 = 0;
            int stackIn_98_0 = 0;
            int stackIn_103_0 = 0;
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
                        var5 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != he.field_j) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var1 = he.field_j.toLowerCase();
                            if ((((String) (var1)).indexOf("sun") ^ -1) != 0) {
                                statePc = 8;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            var2 = he.field_d;
                            if (var2.equals("1.1")) {
                                statePc = 39;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            statePc = 12;
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            statePc = 15;
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 21;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            statePc = 24;
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 28: {
                        try {
                            statePc = 30;
                            continue stateLoop;
                        } catch (Throwable stateCaught_28) {
                            caughtException = stateCaught_28;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 31: {
                        try {
                            statePc = 33;
                            continue stateLoop;
                        } catch (Throwable stateCaught_31) {
                            caughtException = stateCaught_31;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 34: {
                        try {
                            statePc = 36;
                            continue stateLoop;
                        } catch (Throwable stateCaught_34) {
                            caughtException = stateCaught_34;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 37: {
                        try {
                            statePc = 39;
                            continue stateLoop;
                        } catch (Throwable stateCaught_37) {
                            caughtException = stateCaught_37;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            this.a("wrongjava", true);
                            if (var5 == 0) {
                                statePc = 111;
                            } else {
                                statePc = 40;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 40: {
                        try {
                            statePc = 42;
                            continue stateLoop;
                        } catch (Throwable stateCaught_40) {
                            caughtException = stateCaught_40;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 43: {
                        try {
                            statePc = 45;
                            continue stateLoop;
                        } catch (Throwable stateCaught_43) {
                            caughtException = stateCaught_43;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 112;
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
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            stackIn_68_0 = gb.a((byte) 41, var2.charAt(var3));
                            stackIn_50_0 = stackIn_68_0;
                            if (var5 != 0) {
                                statePc = 68;
                            } else {
                                statePc = 50;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            statePc = 53;
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 54: {
                        try {
                            statePc = 56;
                            continue stateLoop;
                        } catch (Throwable stateCaught_54) {
                            caughtException = stateCaught_54;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!te.a((CharSequence) ((Object) var4), true)) {
                                statePc = 63;
                            } else {
                                statePc = 57;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 57: {
                        try {
                            if (10 <= ta.a((CharSequence) ((Object) var4), 121)) {
                                statePc = 63;
                            } else {
                                statePc = 58;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_57) {
                            caughtException = stateCaught_57;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            statePc = 60;
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            this.a("wrongjava", true);
                            if (var5 == 0) {
                                statePc = 111;
                            } else {
                                statePc = 61;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            statePc = 63;
                            continue stateLoop;
                        } catch (Throwable stateCaught_61) {
                            caughtException = stateCaught_61;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            if (null == he.field_d) {
                                statePc = 87;
                            } else {
                                statePc = 64;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 64: {
                        try {
                            statePc = 66;
                            continue stateLoop;
                        } catch (Throwable stateCaught_64) {
                            caughtException = stateCaught_64;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            stackIn_68_0 = he.field_d.startsWith("1.");
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_69) {
                            caughtException = stateCaught_69;
                            statePc = 112;
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
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            if ((he.field_d.length() ^ -1) >= (var1_int ^ -1)) {
                                statePc = 83;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var3 = he.field_d.charAt(var1_int);
                            stackIn_84_0 = 48;
                            stackIn_73_0 = stackIn_84_0;
                            stackIn_84_1 = var3;
                            stackIn_73_1 = stackIn_84_1;
                            if (var5 != 0) {
                                statePc = 84;
                            } else {
                                statePc = 73;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (stackIn_73_0 > stackIn_73_1) {
                                statePc = 83;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            statePc = 76;
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            if (var3 <= 57) {
                                statePc = 82;
                            } else {
                                statePc = 77;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            statePc = 79;
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            if (var5 == 0) {
                                statePc = 83;
                            } else {
                                statePc = 80;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            var1_int++;
                            var2_int = var2_int * 10 - (-var3 + 48);
                            if (var5 == 0) {
                                statePc = 71;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            stackIn_84_0 = 5;
                            stackIn_84_1 = var2_int;
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            if (stackIn_84_0 <= stackIn_84_1) {
                                statePc = 86;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            bh.field_f = true;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var1 = gm.field_f;
                            if (null == le.field_r) {
                                statePc = 89;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            var1 = le.field_r;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var2_ref = he.field_x;
                            if (null != var2_ref) {
                                statePc = 92;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 94;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            oa.a((byte) -119);
                            this.d(0);
                            k.field_f = bi.a(ja.field_j, -126, wc.field_p, (java.awt.Component) ((Object) ae.field_G));
                            this.f(-120);
                            ea.field_k = qc.a(-1);
                            statePc = 96;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            if (ae.field_M == 0L) {
                                statePc = 101;
                            } else {
                                statePc = 97;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            stackIn_103_0 = (ae.field_M < ll.a(1000) ? -1 : (ae.field_M == ll.a(1000) ? 0 : 1));
                            stackIn_98_0 = stackIn_103_0;
                            if (var5 != 0) {
                                statePc = 103;
                            } else {
                                statePc = 98;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (stackIn_98_0 <= 0) {
                                statePc = 111;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            statePc = 101;
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            bb.field_d = ea.field_k.a(dm.field_f, -121);
                            stackIn_103_0 = 0;
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            var3 = stackIn_103_0;
                            statePc = 104;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 104: {
                        try {
                            if ((var3 ^ -1) <= (bb.field_d ^ -1)) {
                                statePc = 109;
                            } else {
                                statePc = 105;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_104) {
                            caughtException = stateCaught_104;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            this.e(8028);
                            var3++;
                            if (var5 != 0) {
                                statePc = 110;
                            } else {
                                statePc = 106;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if (var5 == 0) {
                                statePc = 104;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            statePc = 109;
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            this.b(0);
                            cf.a(nj.field_l, false, ae.field_G);
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
                            if (var5 == 0) {
                                statePc = 96;
                            } else {
                                statePc = 111;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_110) {
                            caughtException = stateCaught_110;
                            statePc = 112;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_111) {
                            caughtException = stateCaught_111;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 112: {
                        try {
                            var1 = caughtException;
                            bd.a((Throwable) (var1), (String) null, -97);
                            this.a("crash", true);
                            statePc = 113;
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            this.a(true, true);
                            statePc = 116;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 115;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        var1 = caughtException;
                        throw qk.a((Throwable) (var1), "eh.run()");
                    }
                    case 116: {
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

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (al.field_W != null) {
          return null;
        } else {
          L0: {
            if (le.field_r == null) {
              break L0;
            } else {
              if (this == le.field_r) {
                break L0;
              } else {
                return le.field_r.getCodeBase();
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
            wb.field_d = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("eh.focusLost(");

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
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void a(byte param0);

    final void a(String param0, boolean param1) {
        try {
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
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
                  this.field_i = param1;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      cd.a((byte) -128, "loggedout", dg.a(false));
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackIn_14_0 = (RuntimeException) (var3_ref2);

                stackIn_14_1 = new StringBuilder().append("eh.M(");

                if (param0 == null) {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "null";
                  break L5;
                } else {
                  stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
                  stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
                  stackIn_15_2 = "{...}";
                  break L5;
                }
              }
              throw qk.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
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

    private final void a(boolean param0, boolean param1) {
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
                if (!qi.field_f) {
                  qi.field_f = param0;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (le.field_r == null) {
                break L2;
              } else {
                le.field_r.destroy();
                break L2;
              }
            }
            try {
              L3: {
                this.b((byte) 118);
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
              if (null == ae.field_G) {
                break L5;
              } else {
                try {
                  L6: {
                    ae.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
                    ae.field_G.getParent().remove((java.awt.Component) ((Object) ae.field_G));
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
              if (null != nj.field_l) {
                try {
                  L9: {
                    nj.field_l.c(-7538);
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
              this.a(102);
              if (al.field_W != null) {
                try {
                  L12: {
                    System.exit(0);
                    break L12;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var3_ref2 = decompiledCaughtException;
                    break L13;
                  }
                }
                break L11;
              } else {
                break L11;
              }
            }
            System.out.println("Shutdown complete - clean:" + param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "eh.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
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
              var2_long = ll.a(param0 + 1000);
              var4 = bb.field_f[ck.field_b];
              bb.field_f[ck.field_b] = var2_long;
              if (-1L == (var4 ^ -1L)) {
                break L1;
              } else {
                if ((var4 ^ -1L) <= (var2_long ^ -1L)) {
                  break L1;
                } else {
                  var6_int = (int)(var2_long - var4);
                  gl.field_k = ((var6_int >> -406609503) + 32000) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 0) {
                break L2;
              } else {
                eh.a(108, (dh) null);
                break L2;
              }
            }
            L3: {
              ck.field_b = ck.field_b - -1 & 31;
              fieldTemp$1 = q.field_Db;
              q.field_Db = q.field_Db + 1;
              if (50 < fieldTemp$1) {
                L4: {
                  il.field_e = true;
                  q.field_Db = q.field_Db - 50;
                  ae.field_G.setSize(ja.field_j, wc.field_p);
                  ae.field_G.setVisible(true);
                  if (null == al.field_W) {
                    break L4;
                  } else {
                    if (jb.field_e != null) {
                      break L4;
                    } else {
                      var6 = al.field_W.getInsets();
                      ae.field_G.setLocation(var6.left + ng.field_v, uh.field_P + var6.top);
                      if (Terraphoenix.field_V == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                ae.field_G.setLocation(ng.field_v, uh.field_P);
                break L3;
              } else {
                break L3;
              }
            }
            this.a((byte) -89);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "eh.J(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = ll.a(1000);
              var4 = jb.field_d[o.field_b];
              jb.field_d[o.field_b] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if ((var2_long ^ -1L) >= (var4 ^ -1L)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 8028) {
                break L2;
              } else {
                this.windowClosing((java.awt.event.WindowEvent) null);
                break L2;
              }
            }
            o.field_b = 1 + o.field_b & 31;
            var6 = this;
            synchronized (var6) {
              L3: {
                uk.field_c = wb.field_d;
                break L3;
              }
            }
            this.a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "eh.H(" + param0 + ')');
        }
    }

    public abstract void init();

    public final void destroy() {
        if (gm.field_f != this || qi.field_f) {
            return;
        }
        try {
            ae.field_M = ll.a(1000);
            gi.a((byte) -113, 5000L);
            d.field_K = null;
            this.a(true, false);
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "eh.destroy()");
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

            stackIn_5_1 = new StringBuilder().append("eh.update(");

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
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void f(int param0);

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          L0: {
            L1: {
              if (null == ae.field_G) {
                break L1;
              } else {
                ae.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
                ae.field_G.getParent().setBackground(java.awt.Color.black);
                ae.field_G.getParent().remove((java.awt.Component) ((Object) ae.field_G));
                break L1;
              }
            }
            L2: {
              L3: {
                if (jb.field_e != null) {
                  break L3;
                } else {
                  L4: {
                    if (al.field_W == null) {
                      break L4;
                    } else {
                      var2 = al.field_W;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  L5: {
                    if (le.field_r != null) {
                      break L5;
                    } else {
                      var2 = gm.field_f;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = le.field_r;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = jb.field_e;
              break L2;
            }
            ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
            ae.field_G = (java.awt.Canvas) ((Object) new jm((java.awt.Component) (this)));
            if (param0 == 0) {
              L6: {
                L7: {
                  ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ae.field_G));
                  ae.field_G.setSize(ja.field_j, wc.field_p);
                  ae.field_G.setVisible(true);
                  if (var2 != al.field_W) {
                    break L7;
                  } else {
                    var3 = al.field_W.getInsets();
                    ae.field_G.setLocation(ng.field_v + var3.left, uh.field_P + var3.top);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                ae.field_G.setLocation(ng.field_v, uh.field_P);
                break L6;
              }
              ae.field_G.addFocusListener((java.awt.event.FocusListener) (this));
              ae.field_G.requestFocus();
              uk.field_c = true;
              wb.field_d = true;
              il.field_e = true;
              ai.field_h = false;
              oj.field_x = ll.a(1000);
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
          throw qk.a((Throwable) (var2), "eh.E(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void stop() {
        if (this != gm.field_f || qi.field_f) {
            return;
        }
        try {
            ae.field_M = ll.a(1000) + 4000L;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "eh.stop()");
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (gm.field_f != this || qi.field_f) {
            return;
        }
        try {
            ae.field_M = 0L;
        } catch (RuntimeException runtimeException) {
            throw qk.a((Throwable) ((Object) runtimeException), "eh.start()");
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
            if (null == al.field_W) {
              L1: {
                if (null == le.field_r) {
                  break L1;
                } else {
                  if (le.field_r != this) {
                    stackIn_10_0 = le.field_r.getDocumentBase();
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
          throw qk.a((Throwable) ((Object) var1), "eh.getDocumentBase()");
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

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final boolean b(boolean param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
            he dupTemp$0 = null;
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
            mf var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (gm.field_f != null) {
                                statePc = 4;
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
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            jm.field_f = jm.field_f + 1;
                            if ((jm.field_f ^ -1) <= -4) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
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
                            this.a("alreadyloaded", true);
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
                            gm.field_f = (eh) (this);
                            ng.field_v = 0;
                            ja.field_j = param4;
                            hd.field_i = param4;
                            wc.field_p = param6;
                            dj.field_a = param6;
                            if (param1 == 50) {
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
                            this.e(-55);
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
                            uh.field_P = 0;
                            ve.field_b = param3;
                            td.field_b = dg.a(false);
                            dupTemp$0 = new he(param2, param5, param0, true);
                            nj.field_l = dupTemp$0;
                            d.field_K = dupTemp$0;
                            var8 = nj.field_l.a((Runnable) (this), (byte) -21, 1);
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
                            if ((var8.field_d ^ -1) != -1) {
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
                            gi.a((byte) -56, 10L);
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
                            bd.a(var8_ref, (String) null, 108);
                            this.a("crash", true);
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
                        stackIn_26_1 = new StringBuilder().append("eh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
                        stackIn_24_1 = stackIn_26_1;
                        if (param5 == null) {
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
                        throw qk.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ',' + param6 + ')');
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
            wb.field_d = true;
            il.field_e = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("eh.focusGained(");

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
          throw qk.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, dh param1) {
        try {
            RuntimeException runtimeException = null;
            byte[] var2 = null;
            int var5 = 0;
            byte stackIn_10_0 = 0;
            int stackIn_17_0 = 0;
            RuntimeException stackIn_30_0 = null;
            StringBuilder stackIn_30_1 = null;
            RuntimeException stackIn_32_0 = null;
            StringBuilder stackIn_32_1 = null;
            RuntimeException stackIn_33_0 = null;
            StringBuilder stackIn_33_1 = null;
            String stackIn_33_2 = null;
            int decompiledRegionSelector0 = 0;
            byte stackOut_9_0;
            int statePc = 0;
            Throwable caughtException = null;
            int var3_int = 0;
            Exception var3 = null;
            int var4 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var5 = Terraphoenix.field_V;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            var2 = new byte[24];
                            if (param0 == 9371) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            field_g = (gg[]) null;
                            statePc = 4;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            if (mh.field_b != null) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            mh.field_b.a(false, 0L);
                            mh.field_b.a(var2, param0 + -2766);
                            var3_int = 0;
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = ((Object) stateCaught_7 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            if ((var3_int ^ -1) <= -25) {
                                statePc = 16;
                            } else {
                                statePc = 9;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = ((Object) stateCaught_8 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 9: {
                        try {
                            stackOut_9_0 = var2[var3_int];
                            stackIn_17_0 = stackOut_9_0;
                            stackIn_10_0 = stackOut_9_0;
                            if (var5 != 0) {
                                statePc = 17;
                            } else {
                                statePc = 10;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_9) {
                            caughtException = stateCaught_9;
                            statePc = ((Object) stateCaught_9 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            if (stackIn_10_0 != 0) {
                                statePc = 16;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = ((Object) stateCaught_10 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            statePc = 13;
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = ((Object) stateCaught_11 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 13: {
                        try {
                            var3_int++;
                            if (var5 == 0) {
                                statePc = 8;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = ((Object) stateCaught_13 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            statePc = 16;
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = ((Object) stateCaught_14 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            stackIn_17_0 = -25;
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = ((Object) stateCaught_16 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (stackIn_17_0 < (var3_int ^ -1)) {
                                statePc = 20;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = ((Object) stateCaught_17 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            throw new IOException();
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = ((Object) stateCaught_18 instanceof Exception ? 21 : 29);
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            var3 = (Exception) ((Object) caughtException);
                            var4 = 0;
                            statePc = 22;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        try {
                            if (var4 >= 24) {
                                statePc = 27;
                            } else {
                                statePc = 23;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_22) {
                            caughtException = stateCaught_22;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            var2[var4] = (byte) -1;
                            var4++;
                            if (var5 != 0) {
                                statePc = 34;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            if (var5 == 0) {
                                statePc = 22;
                            } else {
                                statePc = 25;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 25: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_25) {
                            caughtException = stateCaught_25;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            param1.a(-222449912, var2, 24, 0);
                            statePc = 34;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 29;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        runtimeException = (RuntimeException) ((Object) caughtException);
                        stackIn_32_0 = (RuntimeException) (runtimeException);
                        stackIn_30_0 = stackIn_32_0;
                        stackIn_32_1 = new StringBuilder().append("eh.L(").append(param0).append(',');
                        stackIn_30_1 = stackIn_32_1;
                        if (param1 == null) {
                            statePc = 32;
                        } else {
                            statePc = 30;
                        }
                        continue stateLoop;
                    }
                    case 30: {
                        stackIn_33_0 = (RuntimeException) ((Object) stackIn_30_0);
                        stackIn_33_1 = (StringBuilder) ((Object) stackIn_30_1);
                        stackIn_33_2 = "{...}";
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 32: {
                        stackIn_33_0 = (RuntimeException) ((Object) stackIn_32_0);
                        stackIn_33_1 = (StringBuilder) ((Object) stackIn_32_1);
                        stackIn_33_2 = "null";
                        statePc = 33;
                        continue stateLoop;
                    }
                    case 33: {
                        throw qk.a((Throwable) ((Object) stackIn_33_0), stackIn_33_2 + ')');
                    }
                    case 34: {
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

    protected eh() {
        this.field_i = false;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              if (null == pe.field_b) {
                break L1;
              } else {
                pe.field_b.field_N.a(-11678, param1);
                break L1;
              }
            }
            L2: {
              if (rd.field_s == null) {
                break L2;
              } else {
                rd.field_s.field_N.a(-11678, param1);
                break L2;
              }
            }
            L3: {
              if (param0 == -32202) {
                break L3;
              } else {
                eh.a(-61, (String[]) null);
                break L3;
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_13_0 = (RuntimeException) (var2);

            stackIn_13_1 = new StringBuilder().append("eh.N(").append(param0).append(',');

            if (param1 == null) {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "null";
              break L4;
            } else {
              stackIn_14_0 = (RuntimeException) ((Object) stackIn_13_0);
              stackIn_14_1 = (StringBuilder) ((Object) stackIn_13_1);
              stackIn_14_2 = "{...}";
              break L4;
            }
          }
          throw qk.a((Throwable) ((Object) stackIn_14_0), stackIn_14_2 + ')');
        }
    }

    static {
        field_k = new String[255];
        field_m = false;
        field_f = new rh(10, 2, 2, 0);
        field_d = 0;
    }
}
