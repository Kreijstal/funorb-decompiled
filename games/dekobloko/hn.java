/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class hn extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_f;
    static ij field_c;
    static nk field_h;
    static int field_a;
    static lm field_g;
    public static boolean field_j;
    public static boolean field_b;
    public static int field_k;
    public static boolean field_e;
    public static int field_i;
    public static int field_l;
    public static boolean field_d;

    public final void windowOpened(java.awt.event.WindowEvent param0) {
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
          L0: {
            ge.field_i = true;
            cd.field_g = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hn.focusGained(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    final static pi a(String param0, ji param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pi stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_13_2 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi stackOut_3_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_8_0 = null;
        StringBuilder stackOut_8_1 = null;
        String stackOut_8_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_9_0 = null;
        StringBuilder stackOut_9_1 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        String stackOut_10_2 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        String stackOut_14_2 = null;
        try {
          L0: {
            L1: {
              if (param3 > 26) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            var4_int = param1.b(-1, param2);
            var5 = param1.a(var4_int, 13030, param0);
            stackOut_3_0 = ma.a(param1, var4_int, var5, 21828);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("hn.M(");
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_8_0 = (RuntimeException) (Object) stackIn_8_0;
              stackOut_8_1 = (StringBuilder) (Object) stackIn_8_1;
              stackOut_8_2 = "null";
              stackIn_9_0 = stackOut_8_0;
              stackIn_9_1 = stackOut_8_1;
              stackIn_9_2 = stackOut_8_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_9_0 = stackOut_6_0;
              stackIn_9_1 = stackOut_6_1;
              stackIn_9_2 = stackOut_6_2;
              break L2;
            }
          }
          L3: {
            stackOut_9_0 = (RuntimeException) (Object) stackIn_9_0;
            stackOut_9_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_9_2).append(44);
            stackIn_12_0 = stackOut_9_0;
            stackIn_12_1 = stackOut_9_1;
            stackIn_10_0 = stackOut_9_0;
            stackIn_10_1 = stackOut_9_1;
            if (param1 == null) {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "null";
              stackIn_13_0 = stackOut_12_0;
              stackIn_13_1 = stackOut_12_1;
              stackIn_13_2 = stackOut_12_2;
              break L3;
            } else {
              stackOut_10_0 = (RuntimeException) (Object) stackIn_10_0;
              stackOut_10_1 = (StringBuilder) (Object) stackIn_10_1;
              stackOut_10_2 = "{...}";
              stackIn_13_0 = stackOut_10_0;
              stackIn_13_1 = stackOut_10_1;
              stackIn_13_2 = stackOut_10_2;
              break L3;
            }
          }
          L4: {
            stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
            stackOut_13_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_13_2).append(44);
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param2 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L4;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L4;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param3 + 41);
        }
        return stackIn_4_0;
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
          L0: {
            if (null != hg.field_c) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == kb.field_h) {
                  break L1;
                } else {
                  if (this != (Object) (Object) kb.field_h) {
                    stackOut_11_0 = kb.field_h.getParameter(param0);
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_13_0 = super.getParameter(param0);
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_15_0 = (RuntimeException) var2;
            stackOut_15_1 = new StringBuilder().append("hn.getParameter(");
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
              break L2;
            } else {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "{...}";
              stackIn_19_0 = stackOut_16_0;
              stackIn_19_1 = stackOut_16_1;
              stackIn_19_2 = stackOut_16_2;
              break L2;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + 41);
        }
        return stackIn_14_0;
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.applet.AppletContext stackOut_9_0 = null;
        java.applet.AppletContext stackOut_11_0 = null;
        try {
          L0: {
            if (hg.field_c != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (kb.field_h == null) {
                  break L1;
                } else {
                  if ((Object) (Object) kb.field_h == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = kb.field_h.getAppletContext();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              stackOut_11_0 = super.getAppletContext();
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "hn.getAppletContext()");
        }
        return stackIn_12_0;
    }

    final void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            mh var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_19_0 = null;
            StringBuilder stackIn_19_1 = null;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            String stackIn_22_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_18_0 = null;
            StringBuilder stackOut_18_1 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            RuntimeException stackOut_19_0 = null;
            StringBuilder stackOut_19_1 = null;
            String stackOut_19_2 = null;
            var9 = client.field_A ? 1 : 0;
            try {
              try {
                L0: {
                  if (ta.field_i != null) {
                    be.field_q = be.field_q + 1;
                    if (be.field_q < 3) {
                      ((hn) this).getAppletContext().showDocument(((hn) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((hn) this).a(true, "alreadyloaded");
                      return;
                    }
                  } else {
                    pn.field_ab = 0;
                    de.field_M = param5;
                    oe.field_H = param5;
                    qd.field_Rb = 0;
                    ob.field_g = param4;
                    lf.field_c = param4;
                    ta.field_i = (hn) this;
                    wb.field_Rb = param6;
                    th.field_b = se.h(25144);
                    fd dupTemp$1 = new fd(param1, param0, param2, param3);
                    lf.field_e = dupTemp$1;
                    o.field_f = dupTemp$1;
                    var8_ref2 = lf.field_e.a((byte) -126, 1, (Runnable) this);
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (0 != var8_ref2.field_c) {
                            break L3;
                          } else {
                            ua.a(10L, -128);
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
                      break L0;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var8 = decompiledCaughtException;
                  qb.a(var8, 16408, (String) null);
                  ((hn) this).a(true, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_18_0 = (RuntimeException) var8_ref;
                stackOut_18_1 = new StringBuilder().append("hn.B(");
                stackIn_21_0 = stackOut_18_0;
                stackIn_21_1 = stackOut_18_1;
                stackIn_19_0 = stackOut_18_0;
                stackIn_19_1 = stackOut_18_1;
                if (param0 == null) {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "null";
                  stackIn_22_0 = stackOut_21_0;
                  stackIn_22_1 = stackOut_21_1;
                  stackIn_22_2 = stackOut_21_2;
                  break L5;
                } else {
                  stackOut_19_0 = (RuntimeException) (Object) stackIn_19_0;
                  stackOut_19_1 = (StringBuilder) (Object) stackIn_19_1;
                  stackOut_19_2 = "{...}";
                  stackIn_22_0 = stackOut_19_0;
                  stackIn_22_1 = stackOut_19_1;
                  stackIn_22_2 = stackOut_19_2;
                  break L5;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_22_0, stackIn_22_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        return true;
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
          L0: {
            kb.field_h = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hn.provideLoaderApplet(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ta.field_i != this) {
                break L1;
              } else {
                if (eg.field_d) {
                  break L1;
                } else {
                  l.field_h = ik.a(4);
                  ua.a(5000L, -128);
                  o.field_f = null;
                  this.a(false, -124);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "hn.destroy()");
        }
    }

    private final void a(boolean param0) {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = ik.a(4);
              var4 = sf.field_y[ec.field_h];
              sf.field_y[ec.field_h] = var2_long;
              if ((var4 ^ -1L) == -1L) {
                break L1;
              } else {
                if (var4 < var2_long) {
                  var6_int = (int)(-var4 + var2_long);
                  jf.field_c = (32000 - -(var6_int >> -555538303)) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            if (!param0) {
              L2: {
                ec.field_h = ec.field_h - -1 & 31;
                int fieldTemp$2 = jb.field_d;
                jb.field_d = jb.field_d + 1;
                if (-51 <= (fieldTemp$2 ^ -1)) {
                  break L2;
                } else {
                  L3: {
                    L4: {
                      cd.field_g = true;
                      jb.field_d = jb.field_d - 50;
                      jh.field_b.setSize(de.field_M, ob.field_g);
                      jh.field_b.setVisible(true);
                      if (null == hg.field_c) {
                        break L4;
                      } else {
                        if (oj.field_c == null) {
                          break L3;
                        } else {
                          break L4;
                        }
                      }
                    }
                    jh.field_b.setLocation(qd.field_Rb, pn.field_ab);
                    if (!client.field_A) {
                      break L2;
                    } else {
                      break L3;
                    }
                  }
                  var6 = hg.field_c.getInsets();
                  jh.field_b.setLocation(qd.field_Rb + var6.left, pn.field_ab + var6.top);
                  break L2;
                }
              }
              ((hn) this).d(320);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "hn.H(" + param0 + 41);
        }
    }

    final synchronized void b(byte param0) {
        int var2_int = 0;
        RuntimeException var2 = null;
        Object var3 = null;
        java.awt.Insets var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == jh.field_b) {
                break L1;
              } else {
                jh.field_b.removeFocusListener((java.awt.event.FocusListener) this);
                jh.field_b.getParent().setBackground(java.awt.Color.black);
                jh.field_b.getParent().remove((java.awt.Component) (Object) jh.field_b);
                break L1;
              }
            }
            L2: {
              L3: {
                var2_int = 123 / ((param0 - 18) / 39);
                if (null == oj.field_c) {
                  break L3;
                } else {
                  var3 = (Object) (Object) oj.field_c;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (hg.field_c != null) {
                  break L4;
                } else {
                  L5: {
                    if (kb.field_h == null) {
                      break L5;
                    } else {
                      var3 = (Object) (Object) kb.field_h;
                      if (var5 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var3 = (Object) (Object) ta.field_i;
                  if (var5 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var3 = (Object) (Object) hg.field_c;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var3).setLayout((java.awt.LayoutManager) null);
                jh.field_b = (java.awt.Canvas) (Object) new dk((java.awt.Component) this);
                java.awt.Component discarded$6 = ((java.awt.Container) var3).add((java.awt.Component) (Object) jh.field_b);
                jh.field_b.setSize(de.field_M, ob.field_g);
                jh.field_b.setVisible(true);
                if ((Object) (Object) hg.field_c != var3) {
                  break L7;
                } else {
                  var4 = hg.field_c.getInsets();
                  jh.field_b.setLocation(var4.left - -qd.field_Rb, pn.field_ab + var4.top);
                  if (var5 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              jh.field_b.setLocation(qd.field_Rb, pn.field_ab);
              break L6;
            }
            jh.field_b.addFocusListener((java.awt.event.FocusListener) this);
            jh.field_b.requestFocus();
            ge.field_i = true;
            qc.field_N = true;
            cd.field_g = true;
            jg.field_e = false;
            gn.field_f = ik.a(4);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var2, "hn.K(" + param0 + 41);
        }
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (eg.field_d) {
                  return;
                } else {
                  eg.field_d = true;
                  break L1;
                }
              }
            }
            L2: {
              if (null != kb.field_h) {
                kb.field_h.destroy();
                break L2;
              } else {
                break L2;
              }
            }
            try {
              L3: {
                ((hn) this).e(0);
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
              if (jh.field_b == null) {
                break L5;
              } else {
                try {
                  L6: {
                    jh.field_b.removeFocusListener((java.awt.event.FocusListener) this);
                    jh.field_b.getParent().remove((java.awt.Component) (Object) jh.field_b);
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
              if (null == lf.field_e) {
                break L8;
              } else {
                try {
                  L9: {
                    lf.field_e.a(0);
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
              ((hn) this).a(124);
              if (null == hg.field_c) {
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
            var3_int = -105 / ((param1 - 7) / 62);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "hn.C(" + param0 + 44 + param1 + 41);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) ta.field_i) {
                break L1;
              } else {
                if (!eg.field_d) {
                  l.field_h = 0L;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "hn.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(boolean param0, String param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
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
              L0: {
                if (((hn) this).field_f) {
                  return;
                } else {
                  ((hn) this).field_f = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      Object discarded$1 = nc.a(param0, "loggedout", se.h(25144));
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
                      ((hn) this).getAppletContext().showDocument(new java.net.URL(((hn) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
                      break L3;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L4: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
                      break L4;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L5: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("hn.L(").append(param0).append(44);
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
                  break L5;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L5;
                }
              }
              throw dh.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
          L0: {
            ((hn) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hn.windowClosing(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = ik.a(4);
              var4 = jd.field_Ub[le.field_s];
              jd.field_Ub[le.field_s] = var2_long;
              le.field_s = 31 & 1 + le.field_s;
              if (-1L == (var4 ^ -1L)) {
                break L1;
              } else {
                if ((var4 ^ -1L) <= (var2_long ^ -1L)) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = -68 / ((-31 - param0) / 40);
            var7 = this;
            synchronized (var7) {
              L2: {
                qc.field_N = ge.field_i;
                break L2;
              }
            }
            ((hn) this).c(11978);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "hn.N(" + param0 + 41);
        }
    }

    public final void run() {
        Object var1 = null;
        int var1_int = 0;
        String var2 = null;
        java.lang.reflect.Method var2_ref = null;
        int var2_int = 0;
        Throwable var3_ref_Throwable = null;
        int var3 = 0;
        String var4 = null;
        int var5 = 0;
        boolean stackIn_50_0 = false;
        boolean stackIn_68_0 = false;
        int stackIn_72_0 = 0;
        int stackIn_72_1 = 0;
        int stackIn_83_0 = 0;
        int stackIn_83_1 = 0;
        int stackIn_97_0 = 0;
        int stackIn_102_0 = 0;
        Throwable decompiledCaughtException = null;
        boolean stackOut_49_0 = false;
        boolean stackOut_66_0 = false;
        int stackOut_71_0 = 0;
        int stackOut_71_1 = 0;
        int stackOut_82_0 = 0;
        int stackOut_82_1 = 0;
        int stackOut_96_0 = 0;
        int stackOut_100_0 = 0;
        var5 = client.field_A ? 1 : 0;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        if (null != fd.field_k) {
                          L6: {
                            var1 = (Object) (Object) fd.field_k.toLowerCase();
                            if (-1 != ((String) var1).indexOf("sun")) {
                              break L6;
                            } else {
                              if (((String) var1).indexOf("apple") != -1) {
                                break L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                          L7: {
                            L8: {
                              var2 = fd.field_c;
                              if (var2.equals((Object) (Object) "1.1")) {
                                break L8;
                              } else {
                                if (var2.startsWith("1.1.")) {
                                  break L8;
                                } else {
                                  if (var2.equals((Object) (Object) "1.2")) {
                                    break L8;
                                  } else {
                                    if (var2.startsWith("1.2.")) {
                                      break L8;
                                    } else {
                                      if (var2.equals((Object) (Object) "1.3")) {
                                        break L8;
                                      } else {
                                        if (var2.startsWith("1.3.")) {
                                          break L8;
                                        } else {
                                          if (var2.equals((Object) (Object) "1.4")) {
                                            break L8;
                                          } else {
                                            if (var2.startsWith("1.4.")) {
                                              break L8;
                                            } else {
                                              if (var2.equals((Object) (Object) "1.5")) {
                                                break L8;
                                              } else {
                                                if (var2.startsWith("1.5.")) {
                                                  break L8;
                                                } else {
                                                  if (!var2.equals((Object) (Object) "1.6.0")) {
                                                    break L7;
                                                  } else {
                                                    break L8;
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
                            ((hn) this).a(true, "wrongjava");
                            if (var5 == 0) {
                              break L2;
                            } else {
                              break L7;
                            }
                          }
                          if (!var2.startsWith("1.6.0_")) {
                            break L5;
                          } else {
                            var3 = 6;
                            L9: while (true) {
                              L10: {
                                if (var2.length() <= var3) {
                                  break L10;
                                } else {
                                  stackOut_49_0 = fl.a(var2.charAt(var3), (byte) 23);
                                  stackIn_68_0 = stackOut_49_0;
                                  stackIn_50_0 = stackOut_49_0;
                                  if (var5 != 0) {
                                    break L4;
                                  } else {
                                    if (!stackIn_50_0) {
                                      break L10;
                                    } else {
                                      var3++;
                                      if (var5 == 0) {
                                        continue L9;
                                      } else {
                                        break L10;
                                      }
                                    }
                                  }
                                }
                              }
                              var4 = var2.substring(6, var3);
                              if (!be.a((byte) 98, (CharSequence) (Object) var4)) {
                                break L5;
                              } else {
                                if (-11 < (cb.a((byte) 51, (CharSequence) (Object) var4) ^ -1)) {
                                  ((hn) this).a(true, "wrongjava");
                                  if (var5 == 0) {
                                    break L2;
                                  } else {
                                    break L5;
                                  }
                                } else {
                                  break L5;
                                }
                              }
                            }
                          }
                        } else {
                          break L5;
                        }
                      }
                      if (null == fd.field_c) {
                        break L3;
                      } else {
                        stackOut_66_0 = fd.field_c.startsWith("1.");
                        stackIn_68_0 = stackOut_66_0;
                        break L4;
                      }
                    }
                    if (!stackIn_68_0) {
                      break L3;
                    } else {
                      var1_int = 2;
                      var2_int = 0;
                      L11: while (true) {
                        L12: {
                          L13: {
                            if ((var1_int ^ -1) <= (fd.field_c.length() ^ -1)) {
                              break L13;
                            } else {
                              var3 = fd.field_c.charAt(var1_int);
                              stackOut_71_0 = var3 ^ -1;
                              stackOut_71_1 = -49;
                              stackIn_83_0 = stackOut_71_0;
                              stackIn_83_1 = stackOut_71_1;
                              stackIn_72_0 = stackOut_71_0;
                              stackIn_72_1 = stackOut_71_1;
                              if (var5 != 0) {
                                break L12;
                              } else {
                                if (stackIn_72_0 > stackIn_72_1) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (var3 <= 57) {
                                      break L14;
                                    } else {
                                      if (var5 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var1_int++;
                                  var2_int = var2_int * 10 - (-var3 + 48);
                                  if (var5 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_82_0 = -6;
                          stackOut_82_1 = var2_int ^ -1;
                          stackIn_83_0 = stackOut_82_0;
                          stackIn_83_1 = stackOut_82_1;
                          break L12;
                        }
                        if (stackIn_83_0 < stackIn_83_1) {
                          break L3;
                        } else {
                          oh.field_b = true;
                          break L3;
                        }
                      }
                    }
                  }
                  L15: {
                    var1 = (Object) (Object) ta.field_i;
                    if (null == kb.field_h) {
                      break L15;
                    } else {
                      var1 = (Object) (Object) kb.field_h;
                      break L15;
                    }
                  }
                  L16: {
                    var2_ref = fd.field_f;
                    if (var2_ref != null) {
                      try {
                        L17: {
                          Object discarded$1 = var2_ref.invoke(var1, new Object[1]);
                          break L17;
                        }
                      } catch (java.lang.Throwable decompiledCaughtParameter0) {
                        decompiledCaughtException = decompiledCaughtParameter0;
                        L18: {
                          var3_ref_Throwable = decompiledCaughtException;
                          break L18;
                        }
                      }
                      break L16;
                    } else {
                      break L16;
                    }
                  }
                  si.b(1);
                  ((hn) this).b((byte) 125);
                  le.field_m = el.a(ob.field_g, (byte) 120, de.field_M, (java.awt.Component) (Object) jh.field_b);
                  ((hn) this).b(false);
                  cm.field_f = eg.a((byte) 63);
                  L19: while (true) {
                    L20: {
                      L21: {
                        if ((l.field_h ^ -1L) == -1L) {
                          break L21;
                        } else {
                          stackOut_96_0 = ((ik.a(4) ^ -1L) < (l.field_h ^ -1L) ? -1 : ((ik.a(4) ^ -1L) == (l.field_h ^ -1L) ? 0 : 1));
                          stackIn_102_0 = stackOut_96_0;
                          stackIn_97_0 = stackOut_96_0;
                          if (var5 != 0) {
                            break L20;
                          } else {
                            if (stackIn_97_0 <= 0) {
                              break L2;
                            } else {
                              break L21;
                            }
                          }
                        }
                      }
                      vm.field_r = cm.field_f.a(ul.field_g, 4);
                      stackOut_100_0 = 0;
                      stackIn_102_0 = stackOut_100_0;
                      break L20;
                    }
                    var3 = stackIn_102_0;
                    L22: while (true) {
                      L23: {
                        L24: {
                          if ((var3 ^ -1) <= (vm.field_r ^ -1)) {
                            break L24;
                          } else {
                            this.f(121);
                            var3++;
                            if (var5 != 0) {
                              break L23;
                            } else {
                              if (var5 == 0) {
                                continue L22;
                              } else {
                                break L24;
                              }
                            }
                          }
                        }
                        this.a(false);
                        db.a(-61, (Object) (Object) jh.field_b, lf.field_e);
                        break L23;
                      }
                      if (var5 == 0) {
                        continue L19;
                      } else {
                        break L2;
                      }
                    }
                  }
                }
                break L1;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L25: {
                var1 = (Object) (Object) decompiledCaughtException;
                qb.a((Throwable) var1, 16408, (String) null);
                ((hn) this).a(true, "crash");
                break L25;
              }
            }
            this.a(true, -128);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1 = (Object) (Object) decompiledCaughtException;
          throw dh.a((Throwable) var1, "hn.run()");
        }
    }

    public abstract void init();

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
          L0: {
            ge.field_i = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hn.focusLost(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_c = null;
        if (param0 != 6) {
            return;
        }
        try {
            field_g = null;
        } catch (RuntimeException runtimeException) {
            throw dh.a((Throwable) (Object) runtimeException, "hn.E(" + param0 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null == hg.field_c) {
          L0: {
            if (null == kb.field_h) {
              break L0;
            } else {
              if ((Object) (Object) kb.field_h == this) {
                break L0;
              } else {
                return kb.field_h.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException var2 = null;
        java.awt.Rectangle var2_ref = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        RuntimeException stackOut_26_0 = null;
        StringBuilder stackOut_26_1 = null;
        String stackOut_26_2 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ta.field_i != this) {
                break L1;
              } else {
                if (eg.field_d) {
                  break L1;
                } else {
                  L2: {
                    cd.field_g = true;
                    if (!oh.field_b) {
                      break L2;
                    } else {
                      if (-gn.field_f + ik.a(4) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (null == var2_ref) {
                            break L3;
                          } else {
                            if ((oe.field_H ^ -1) < (var2_ref.width ^ -1)) {
                              break L2;
                            } else {
                              if (var2_ref.height < lf.field_c) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        jg.field_e = true;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_23_0 = (RuntimeException) var2;
            stackOut_23_1 = new StringBuilder().append("hn.paint(");
            stackIn_26_0 = stackOut_23_0;
            stackIn_26_1 = stackOut_23_1;
            stackIn_24_0 = stackOut_23_0;
            stackIn_24_1 = stackOut_23_1;
            if (param0 == null) {
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
          throw dh.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    abstract void e(int param0);

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ta.field_i != this) {
                break L1;
              } else {
                if (!eg.field_d) {
                  l.field_h = ik.a(4) - -4000L;
                  break L0;
                } else {
                  break L1;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) (Object) runtimeException, "hn.stop()");
        }
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
          L0: {
            if (hg.field_c != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == kb.field_h) {
                  break L1;
                } else {
                  if ((Object) (Object) kb.field_h != this) {
                    stackOut_11_0 = kb.field_h.getDocumentBase();
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_13_0 = super.getDocumentBase();
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) (Object) var1, "hn.getDocumentBase()");
        }
        return stackIn_14_0;
    }

    abstract void d(int param0);

    protected hn() {
        ((hn) this).field_f = false;
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
          L0: {
            ((hn) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("hn.update(");
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
              break L1;
            } else {
              stackOut_3_0 = (RuntimeException) (Object) stackIn_3_0;
              stackOut_3_1 = (StringBuilder) (Object) stackIn_3_1;
              stackOut_3_2 = "{...}";
              stackIn_6_0 = stackOut_3_0;
              stackIn_6_1 = stackOut_3_1;
              stackIn_6_2 = stackOut_3_2;
              break L1;
            }
          }
          throw dh.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void b(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new ij("");
    }
}
