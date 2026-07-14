/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.net.URL;
import java.applet.AppletContext;

public abstract class fj extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_k;
    static String field_d;
    boolean field_e;
    static String field_g;
    static int field_b;
    public static int field_j;
    public static boolean field_h;
    public static int field_c;
    public static int field_l;
    public static boolean field_i;
    public static boolean field_a;
    public static int field_f;

    final static void a(int param0, int param1, int param2, wi param3, int param4) {
        RuntimeException var5 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == 6) {
              break L0;
            } else {
              field_b = -112;
              break L0;
            }
          }
          param3.a(12, (byte) 103);
          param3.e(param1 ^ -750655090, 17);
          param3.e(param1 ^ -750655090, param2);
          param3.e(-750655096, param0);
          param3.a(param4, (byte) 78);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var5 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var5;
            stackOut_5_1 = new StringBuilder().append("fj.T(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param3 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 44 + param4 + 41);
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_long = fa.a(87);
            var4 = qj.field_a[sh.field_hb];
            qj.field_a[sh.field_hb] = var2_long;
            if (0L == var4) {
              break L0;
            } else {
              if ((var2_long ^ -1L) >= (var4 ^ -1L)) {
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            sh.field_hb = 31 & sh.field_hb + 1;
            if (param0 < -33) {
              break L1;
            } else {
              ((fj) this).b((byte) 102);
              break L1;
            }
          }
          var6 = this;
          synchronized (var6) {
            gk.field_f = k.field_H;
          }
          ((fj) this).a((byte) 37);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "fj.DA(" + param0 + 41);
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          ((fj) this).destroy();
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.windowClosing(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (i.field_h != null) {
          return null;
        } else {
          L0: {
            if (null == a.field_c) {
              break L0;
            } else {
              if ((Object) (Object) a.field_c == this) {
                break L0;
              } else {
                return a.field_c.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

    final void a(byte param0, String param1) {
        try {
            RuntimeException var3 = null;
            int var3_int = 0;
            Throwable var4 = null;
            Exception var4_ref = null;
            RuntimeException stackIn_12_0 = null;
            StringBuilder stackIn_12_1 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_11_0 = null;
            StringBuilder stackOut_11_1 = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            String stackOut_14_2 = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            String stackOut_12_2 = null;
            try {
              if (((fj) this).field_e) {
                return;
              } else {
                ((fj) this).field_e = true;
                var3_int = 37 / ((29 - param0) / 57);
                System.out.println("error_game_" + param1);
                try {
                  Object discarded$1 = ac.a(vi.b(0), "loggedout", -31185);
                } catch (java.lang.Throwable decompiledCaughtParameter0) {
                  decompiledCaughtException = decompiledCaughtParameter0;
                  var4 = decompiledCaughtException;
                }
                try {
                  ((fj) this).getAppletContext().showDocument(new java.net.URL(((fj) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  var4_ref = (Exception) (Object) decompiledCaughtException;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L0: {
                var3 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3;
                stackOut_11_1 = new StringBuilder().append("fj.LA(").append(param0).append(44);
                stackIn_14_0 = stackOut_11_0;
                stackIn_14_1 = stackOut_11_1;
                stackIn_12_0 = stackOut_11_0;
                stackIn_12_1 = stackOut_11_1;
                if (param1 == null) {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "null";
                  stackIn_15_0 = stackOut_14_0;
                  stackIn_15_1 = stackOut_14_1;
                  stackIn_15_2 = stackOut_14_2;
                  break L0;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L0;
                }
              }
              throw ii.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void d(byte param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this != (Object) (Object) og.field_c) {
              break L0;
            } else {
              if (!jb.field_d) {
                ua.field_d = 0L;
              } else {
                break L0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "fj.start()");
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        String stackOut_22_2 = null;
        try {
          L0: {
            if ((Object) (Object) og.field_c != this) {
              break L0;
            } else {
              if (jb.field_d) {
                break L0;
              } else {
                L1: {
                  ae.field_b = true;
                  if (!hh.field_k) {
                    break L1;
                  } else {
                    if (-1001L <= (-jc.field_k + fa.a(125) ^ -1L)) {
                      break L1;
                    } else {
                      L2: {
                        var2 = param0.getClipBounds();
                        if (null == var2) {
                          break L2;
                        } else {
                          if (var2.width < ib.field_k) {
                            break L1;
                          } else {
                            if ((var2.height ^ -1) > (ej.field_d ^ -1)) {
                              break L1;
                            } else {
                              break L2;
                            }
                          }
                        }
                      }
                      ef.field_f = true;
                      break L1;
                    }
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2_ref = decompiledCaughtException;
            stackOut_21_0 = (RuntimeException) var2_ref;
            stackOut_21_1 = new StringBuilder().append("fj.paint(");
            stackIn_24_0 = stackOut_21_0;
            stackIn_24_1 = stackOut_21_1;
            stackIn_22_0 = stackOut_21_0;
            stackIn_22_1 = stackOut_21_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L3;
            } else {
              stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
              stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
              stackOut_22_2 = "{...}";
              stackIn_25_0 = stackOut_22_0;
              stackIn_25_1 = stackOut_22_1;
              stackIn_25_2 = stackOut_22_2;
              break L3;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
        }
    }

    public static void e(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (param0 >= 115) {
              break L0;
            } else {
              field_g = null;
              break L0;
            }
          }
          field_g = null;
          field_k = null;
          field_d = null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "fj.W(" + param0 + 41);
        }
    }

    abstract void c(byte param0);

    public abstract void init();

    final synchronized void d(int param0) {
        java.awt.Frame var2 = null;
        RuntimeException var2_ref = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          L0: {
            if (null == ch.field_h) {
              break L0;
            } else {
              ch.field_h.removeFocusListener((java.awt.event.FocusListener) this);
              ch.field_h.getParent().setBackground(java.awt.Color.black);
              ch.field_h.getParent().remove((java.awt.Component) (Object) ch.field_h);
              break L0;
            }
          }
          L1: {
            L2: {
              if (ai.field_b == null) {
                break L2;
              } else {
                var2 = ai.field_b;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              if (i.field_h == null) {
                break L3;
              } else {
                var2 = i.field_h;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L3;
                }
              }
            }
            L4: {
              if (a.field_c != null) {
                break L4;
              } else {
                var2 = (java.awt.Frame) (Object) og.field_c;
                if (var4 == 0) {
                  break L1;
                } else {
                  break L4;
                }
              }
            }
            var2 = (java.awt.Frame) (Object) a.field_c;
            break L1;
          }
          L5: {
            ((java.awt.Container) (Object) var2).setLayout((java.awt.LayoutManager) null);
            if (param0 == 12955) {
              break L5;
            } else {
              ((fj) this).focusGained((java.awt.event.FocusEvent) null);
              break L5;
            }
          }
          L6: {
            L7: {
              ch.field_h = (java.awt.Canvas) (Object) new th((java.awt.Component) this);
              java.awt.Component discarded$2 = ((java.awt.Container) (Object) var2).add((java.awt.Component) (Object) ch.field_h);
              ch.field_h.setSize(kj.field_i, jc.field_i);
              ch.field_h.setVisible(true);
              if (var2 == i.field_h) {
                break L7;
              } else {
                ch.field_h.setLocation(el.field_e, ob.field_d);
                if (var4 == 0) {
                  break L6;
                } else {
                  break L7;
                }
              }
            }
            var3 = i.field_h.getInsets();
            ch.field_h.setLocation(var3.left - -el.field_e, ob.field_d + var3.top);
            break L6;
          }
          ch.field_h.addFocusListener((java.awt.event.FocusListener) this);
          ch.field_h.requestFocus();
          gk.field_f = true;
          k.field_H = true;
          ae.field_b = true;
          ef.field_f = false;
          jc.field_k = fa.a(-73);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var2_ref, "fj.KA(" + param0 + 41);
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          ((fj) this).paint(param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.update(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          a.field_c = param0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.provideLoaderApplet(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.net.URL stackOut_11_0 = null;
        java.net.URL stackOut_13_0 = null;
        try {
          if (null != i.field_h) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (java.net.URL) (Object) stackIn_4_0;
          } else {
            L0: {
              if (a.field_c == null) {
                break L0;
              } else {
                if ((Object) (Object) a.field_c != this) {
                  stackOut_11_0 = a.field_c.getDocumentBase();
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  break L0;
                }
              }
            }
            stackOut_13_0 = super.getDocumentBase();
            stackIn_14_0 = stackOut_13_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "fj.getDocumentBase()");
        }
        return stackIn_14_0;
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.applet.AppletContext stackOut_7_0 = null;
        java.applet.AppletContext stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        try {
          if (i.field_h == null) {
            L0: {
              if (a.field_c == null) {
                break L0;
              } else {
                if (this == (Object) (Object) a.field_c) {
                  break L0;
                } else {
                  stackOut_7_0 = a.field_c.getAppletContext();
                  stackIn_8_0 = stackOut_7_0;
                  return stackIn_8_0;
                }
              }
            }
            stackOut_9_0 = super.getAppletContext();
            stackIn_10_0 = stackOut_9_0;
          } else {
            stackOut_1_0 = null;
            stackIn_2_0 = stackOut_1_0;
            return (java.applet.AppletContext) (Object) stackIn_2_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1, "fj.getAppletContext()");
        }
        return stackIn_10_0;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          k.field_H = false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.focusLost(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static rj a(gk param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        rj stackIn_9_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_6_0 = null;
        rj stackOut_8_0 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        try {
          L0: {
            if (param1 == 0) {
              break L0;
            } else {
              field_b = 10;
              break L0;
            }
          }
          var3 = param0.c(param1 ^ 121, param2);
          if (var3 == null) {
            stackOut_6_0 = null;
            stackIn_7_0 = stackOut_6_0;
            return (rj) (Object) stackIn_7_0;
          } else {
            stackOut_8_0 = new rj(var3);
            stackIn_9_0 = stackOut_8_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var3_ref = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var3_ref;
            stackOut_10_1 = new StringBuilder().append("fj.IA(");
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param0 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L1;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 44 + param1 + 44 + param2 + 41);
        }
        return stackIn_9_0;
    }

    abstract void e(int param0);

    final static void a(boolean param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          va.field_f = param0;
          ng.field_b = true;
          nk.field_a = new sh(q.field_N, ne.field_v, param1, fe.field_g, va.field_f);
          if (param2 == -1) {
            q.field_N.b((lk) (Object) nk.field_a, false);
          } else {
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) runtimeException;
            stackOut_4_1 = new StringBuilder().append("fj.FA(").append(param0).append(44);
            stackIn_7_0 = stackOut_4_0;
            stackIn_7_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param1 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L0;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_8_0 = stackOut_5_0;
              stackIn_8_1 = stackOut_5_1;
              stackIn_8_2 = stackOut_5_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param2 + 41);
        }
    }

    final boolean a(int param0) {
        return true;
    }

    final void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            mk var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            RuntimeException stackIn_27_0 = null;
            StringBuilder stackIn_27_1 = null;
            String stackIn_27_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            RuntimeException stackOut_26_0 = null;
            StringBuilder stackOut_26_1 = null;
            String stackOut_26_2 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            var9 = Bounce.field_N;
            try {
              if (og.field_c != null) {
                kl.field_g = kl.field_g + 1;
                if (-4 >= (kl.field_g ^ -1)) {
                  ((fj) this).a((byte) 110, "alreadyloaded");
                  return;
                } else {
                  ((fj) this).getAppletContext().showDocument(((fj) this).getDocumentBase(), "_self");
                  return;
                }
              } else {
                L0: {
                  el.field_e = 0;
                  if (param3 >= 2) {
                    break L0;
                  } else {
                    ((fj) this).c((byte) -74);
                    break L0;
                  }
                }
                jc.field_i = param5;
                ej.field_d = param5;
                kj.field_i = param6;
                ib.field_k = param6;
                ob.field_d = 0;
                nd.field_E = param4;
                og.field_c = (fj) this;
                gk.field_j = vi.b(0);
                ck.field_e = new si(param0, param1, param2, true);
                jj.field_a = new si(param0, param1, param2, true);
                var8_ref2 = ck.field_e.a(1, (byte) -102, (Runnable) this);
                L1: while (true) {
                  L2: {
                    L3: {
                      if (0 != var8_ref2.field_f) {
                        break L3;
                      } else {
                        wh.a(10L, 19406);
                        if (var9 != 0) {
                          break L2;
                        } else {
                          if (var9 == 0) {
                            continue L1;
                          } else {
                            break L3;
                          }
                        }
                      }
                    }
                    break L2;
                  }
                }
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              ti.a(var8, (byte) 100, (String) null);
              ((fj) this).a((byte) -124, "crash");
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L4: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_23_0 = (RuntimeException) var8_ref;
                stackOut_23_1 = new StringBuilder().append("fj.AA(").append(param0).append(44);
                stackIn_26_0 = stackOut_23_0;
                stackIn_26_1 = stackOut_23_1;
                stackIn_24_0 = stackOut_23_0;
                stackIn_24_1 = stackOut_23_1;
                if (param1 == null) {
                  stackOut_26_0 = (RuntimeException) (Object) stackIn_26_0;
                  stackOut_26_1 = (StringBuilder) (Object) stackIn_26_1;
                  stackOut_26_2 = "null";
                  stackIn_27_0 = stackOut_26_0;
                  stackIn_27_1 = stackOut_26_1;
                  stackIn_27_2 = stackOut_26_2;
                  break L4;
                } else {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "{...}";
                  stackIn_27_0 = stackOut_24_0;
                  stackIn_27_1 = stackOut_24_1;
                  stackIn_27_2 = stackOut_24_2;
                  break L4;
                }
              }
              throw ii.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        Throwable var1 = null;
        RuntimeException var1_ref = null;
        String var1_ref2 = null;
        int var1_int = 0;
        String var2 = null;
        int var2_int = 0;
        Throwable var3_ref_Throwable = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        boolean stackIn_48_0 = false;
        boolean stackIn_66_0 = false;
        int stackIn_71_0 = 0;
        int stackIn_71_1 = 0;
        int stackIn_82_0 = 0;
        int stackIn_82_1 = 0;
        int stackIn_98_0 = 0;
        int stackIn_103_0 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_47_0 = false;
        boolean stackOut_64_0 = false;
        int stackOut_70_0 = 0;
        int stackOut_70_1 = 0;
        int stackOut_81_0 = 0;
        int stackOut_81_1 = 0;
        int stackOut_97_0 = 0;
        int stackOut_101_0 = 0;
        var5 = Bounce.field_N;
        try {
          try {
            L0: {
              L1: {
                L2: {
                  L3: {
                    if (null != si.field_r) {
                      L4: {
                        var1_ref2 = si.field_r.toLowerCase();
                        if (var1_ref2.indexOf("sun") != -1) {
                          break L4;
                        } else {
                          if (0 == (var1_ref2.indexOf("apple") ^ -1)) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      L5: {
                        L6: {
                          var2 = si.field_d;
                          if (var2.equals((Object) (Object) "1.1")) {
                            break L6;
                          } else {
                            if (var2.startsWith("1.1.")) {
                              break L6;
                            } else {
                              if (var2.equals((Object) (Object) "1.2")) {
                                break L6;
                              } else {
                                if (var2.startsWith("1.2.")) {
                                  break L6;
                                } else {
                                  if (var2.equals((Object) (Object) "1.3")) {
                                    break L6;
                                  } else {
                                    if (var2.startsWith("1.3.")) {
                                      break L6;
                                    } else {
                                      if (var2.equals((Object) (Object) "1.4")) {
                                        break L6;
                                      } else {
                                        if (var2.startsWith("1.4.")) {
                                          break L6;
                                        } else {
                                          if (var2.equals((Object) (Object) "1.5")) {
                                            break L6;
                                          } else {
                                            if (var2.startsWith("1.5.")) {
                                              break L6;
                                            } else {
                                              if (!var2.equals((Object) (Object) "1.6.0")) {
                                                break L5;
                                              } else {
                                                break L6;
                                              }
                                            }
                                          }
                                        }
                                      }
                                    }
                                  }
                                }
                              }
                            }
                          }
                        }
                        ((fj) this).a((byte) -84, "wrongjava");
                        if (var5 == 0) {
                          break L0;
                        } else {
                          break L5;
                        }
                      }
                      if (!var2.startsWith("1.6.0_")) {
                        break L3;
                      } else {
                        var3 = 6;
                        L7: while (true) {
                          L8: {
                            if ((var2.length() ^ -1) >= (var3 ^ -1)) {
                              break L8;
                            } else {
                              stackOut_47_0 = kf.a(-49, var2.charAt(var3));
                              stackIn_66_0 = stackOut_47_0;
                              stackIn_48_0 = stackOut_47_0;
                              if (var5 != 0) {
                                break L2;
                              } else {
                                if (!stackIn_48_0) {
                                  break L8;
                                } else {
                                  var3++;
                                  if (var5 == 0) {
                                    continue L7;
                                  } else {
                                    break L8;
                                  }
                                }
                              }
                            }
                          }
                          var4 = var2.substring(6, var3);
                          if (!qi.a((CharSequence) (Object) var4, 10)) {
                            break L3;
                          } else {
                            if (gf.a(10, (CharSequence) (Object) var4) >= 10) {
                              break L3;
                            } else {
                              ((fj) this).a((byte) 96, "wrongjava");
                              if (var5 == 0) {
                                break L0;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  if (si.field_d == null) {
                    break L1;
                  } else {
                    stackOut_64_0 = si.field_d.startsWith("1.");
                    stackIn_66_0 = stackOut_64_0;
                    break L2;
                  }
                }
                if (stackIn_66_0) {
                  var1_int = 2;
                  var2_int = 0;
                  L9: while (true) {
                    L10: {
                      L11: {
                        if (si.field_d.length() <= var1_int) {
                          break L11;
                        } else {
                          var3 = si.field_d.charAt(var1_int);
                          stackOut_70_0 = -49;
                          stackOut_70_1 = var3 ^ -1;
                          stackIn_82_0 = stackOut_70_0;
                          stackIn_82_1 = stackOut_70_1;
                          stackIn_71_0 = stackOut_70_0;
                          stackIn_71_1 = stackOut_70_1;
                          if (var5 != 0) {
                            break L10;
                          } else {
                            if (stackIn_71_0 < stackIn_71_1) {
                              break L11;
                            } else {
                              L12: {
                                if (-58 <= (var3 ^ -1)) {
                                  break L12;
                                } else {
                                  if (var5 == 0) {
                                    break L11;
                                  } else {
                                    break L12;
                                  }
                                }
                              }
                              var2_int = var2_int * 10 + var3 - 48;
                              var1_int++;
                              if (var5 == 0) {
                                continue L9;
                              } else {
                                break L11;
                              }
                            }
                          }
                        }
                      }
                      stackOut_81_0 = -6;
                      stackOut_81_1 = var2_int ^ -1;
                      stackIn_82_0 = stackOut_81_0;
                      stackIn_82_1 = stackOut_81_1;
                      break L10;
                    }
                    if (stackIn_82_0 >= stackIn_82_1) {
                      hh.field_k = true;
                      break L1;
                    } else {
                      break L1;
                    }
                  }
                } else {
                  break L1;
                }
              }
              L13: {
                var1_ref2 = (String) (Object) og.field_c;
                if (a.field_c != null) {
                  var1_ref2 = (String) (Object) a.field_c;
                  break L13;
                } else {
                  break L13;
                }
              }
              L14: {
                var2 = (String) (Object) si.field_w;
                if (null != var2) {
                  try {
                    Object discarded$1 = ((java.lang.reflect.Method) (Object) var2).invoke((Object) (Object) var1_ref2, new Object[1]);
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                  break L14;
                } else {
                  break L14;
                }
              }
              oh.a(-117);
              ((fj) this).d(12955);
              ca.field_d = w.a(kj.field_i, (java.awt.Component) (Object) ch.field_h, jc.field_i, (byte) 41);
              ((fj) this).c((byte) -6);
              ff.field_D = jj.a(10000);
              L15: while (true) {
                L16: {
                  L17: {
                    if (ua.field_d == 0L) {
                      break L17;
                    } else {
                      stackOut_97_0 = (ua.field_d < fa.a(-42) ? -1 : (ua.field_d == fa.a(-42) ? 0 : 1));
                      stackIn_103_0 = stackOut_97_0;
                      stackIn_98_0 = stackOut_97_0;
                      if (var5 != 0) {
                        break L16;
                      } else {
                        if (stackIn_98_0 <= 0) {
                          break L0;
                        } else {
                          break L17;
                        }
                      }
                    }
                  }
                  nl.field_c = ff.field_D.b(0, hb.field_H);
                  stackOut_101_0 = 0;
                  stackIn_103_0 = stackOut_101_0;
                  break L16;
                }
                var3 = stackIn_103_0;
                L18: while (true) {
                  L19: {
                    L20: {
                      if ((var3 ^ -1) <= (nl.field_c ^ -1)) {
                        break L20;
                      } else {
                        this.c(-111);
                        var3++;
                        if (var5 != 0) {
                          break L19;
                        } else {
                          if (var5 == 0) {
                            continue L18;
                          } else {
                            break L20;
                          }
                        }
                      }
                    }
                    this.b(1);
                    pg.a((byte) -109, (Object) (Object) ch.field_h, ck.field_e);
                    break L19;
                  }
                  if (var5 == 0) {
                    continue L15;
                  } else {
                    break L0;
                  }
                }
              }
            }
          } catch (java.lang.Throwable decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var1 = decompiledCaughtException;
            ti.a(var1, (byte) 100, (String) null);
            ((fj) this).a((byte) -85, "crash");
          }
          this.a(true, (byte) -83);
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) (Object) var1_ref, "fj.run()");
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        Exception var3_ref = null;
        Throwable var3_ref2 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (jb.field_d) {
              return;
            } else {
              jb.field_d = true;
            }
          }
          L0: {
            if (a.field_c == null) {
              break L0;
            } else {
              a.field_c.destroy();
              break L0;
            }
          }
          try {
            L1: {
              if (param1 < -10) {
                break L1;
              } else {
                ((fj) this).d(40);
                break L1;
              }
            }
            ((fj) this).b((byte) -111);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
          L2: {
            if (ch.field_h != null) {
              try {
                ch.field_h.removeFocusListener((java.awt.event.FocusListener) this);
                ch.field_h.getParent().remove((java.awt.Component) (Object) ch.field_h);
              } catch (java.lang.Exception decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var3_ref = (Exception) (Object) decompiledCaughtException;
              }
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if (ck.field_e != null) {
              try {
                ck.field_e.b((byte) 94);
              } catch (java.lang.Exception decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var3_ref = (Exception) (Object) decompiledCaughtException;
              }
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            ((fj) this).d((byte) -124);
            if (i.field_h != null) {
              try {
                System.exit(0);
              } catch (java.lang.Throwable decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var3_ref2 = decompiledCaughtException;
              }
              break L4;
            } else {
              break L4;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "fj.BA(" + param0 + 44 + param1 + 41);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if ((Object) (Object) og.field_c != this) {
              break L0;
            } else {
              if (!jb.field_d) {
                ua.field_d = 4000L + fa.a(-81);
              } else {
                break L0;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "fj.stop()");
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = fa.a(param0 + 102);
            var4 = l.field_d[cl.field_q];
            l.field_d[cl.field_q] = var2_long;
            cl.field_q = param0 + cl.field_q & 31;
            if (-1L == (var4 ^ -1L)) {
              break L0;
            } else {
              if ((var2_long ^ -1L) < (var4 ^ -1L)) {
                break L0;
              } else {
                break L0;
              }
            }
          }
          L1: {
            fl.field_a = fl.field_a + 1;
            if ((fl.field_a ^ -1) >= -51) {
              break L1;
            } else {
              L2: {
                L3: {
                  ae.field_b = true;
                  fl.field_a = fl.field_a - 50;
                  ch.field_h.setSize(kj.field_i, jc.field_i);
                  ch.field_h.setVisible(true);
                  if (null == i.field_h) {
                    break L3;
                  } else {
                    if (null == ai.field_b) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                }
                ch.field_h.setLocation(el.field_e, ob.field_d);
                if (Bounce.field_N == 0) {
                  break L1;
                } else {
                  break L2;
                }
              }
              var6 = i.field_h.getInsets();
              ch.field_h.setLocation(var6.left - -el.field_e, ob.field_d + var6.top);
              break L1;
            }
          }
          ((fj) this).e(4);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "fj.GA(" + param0 + 41);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_3_0 = null;
        StringBuilder stackIn_3_1 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_2_0 = null;
        StringBuilder stackOut_2_1 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        RuntimeException stackOut_3_0 = null;
        StringBuilder stackOut_3_1 = null;
        String stackOut_3_2 = null;
        try {
          k.field_H = true;
          ae.field_b = true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L0: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fj.focusGained(");
            stackIn_5_0 = stackOut_2_0;
            stackIn_5_1 = stackOut_2_1;
            stackIn_3_0 = stackOut_2_0;
            stackIn_3_1 = stackOut_2_1;
            if (param0 == null) {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "null";
              stackIn_6_0 = stackOut_5_0;
              stackIn_6_1 = stackOut_5_1;
              stackIn_6_2 = stackOut_5_2;
              break L0;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L0;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        String stackOut_11_0 = null;
        String stackOut_13_0 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        RuntimeException stackOut_18_0 = null;
        StringBuilder stackOut_18_1 = null;
        String stackOut_18_2 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        try {
          if (null != i.field_h) {
            stackOut_3_0 = null;
            stackIn_4_0 = stackOut_3_0;
            return (String) (Object) stackIn_4_0;
          } else {
            L0: {
              if (null == a.field_c) {
                break L0;
              } else {
                if (this != (Object) (Object) a.field_c) {
                  stackOut_11_0 = a.field_c.getParameter(param0);
                  stackIn_12_0 = stackOut_11_0;
                  return stackIn_12_0;
                } else {
                  break L0;
                }
              }
            }
            stackOut_13_0 = super.getParameter(param0);
            stackIn_14_0 = stackOut_13_0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("fj.getParameter(");
            stackIn_18_0 = stackOut_15_0;
            stackIn_18_1 = stackOut_15_1;
            stackIn_16_0 = stackOut_15_0;
            stackIn_16_1 = stackOut_15_1;
            if (param0 == null) {
              stackOut_18_0 = (RuntimeException) (Object) stackIn_18_0;
              stackOut_18_1 = (StringBuilder) (Object) stackIn_18_1;
              stackOut_18_2 = "null";
              stackIn_19_0 = stackOut_18_0;
              stackIn_19_1 = stackOut_18_1;
              stackIn_19_2 = stackOut_18_2;
              break L1;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L1;
            }
          }
          throw ii.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_14_0;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected fj() {
        ((fj) this).field_e = false;
    }

    abstract void b(byte param0);

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (this != (Object) (Object) og.field_c) {
              break L0;
            } else {
              if (jb.field_d) {
                break L0;
              } else {
                ua.field_d = fa.a(112);
                wh.a(5000L, 19406);
                jj.field_a = null;
                this.a(false, (byte) -57);
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) (Object) runtimeException, "fj.destroy()");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "Loading sound effects";
        field_d = "Change display name";
        field_g = "Fullscreen";
        field_b = 0;
    }
}
