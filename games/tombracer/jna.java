/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class jna extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static ka[] field_j;
    boolean field_b;
    public static boolean field_m;
    public static boolean field_k;
    public static boolean field_f;
    public static int field_n;
    public static boolean field_h;
    public static boolean field_e;
    public static int field_l;
    public static int field_a;
    public static boolean field_i;
    public static int field_g;
    public static int field_c;
    public static int field_o;
    public static boolean field_d;

    abstract void a(boolean param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

    final void a(int param0, String param1) {
        try {
            Throwable throwable = null;
            Exception exception = null;
            RuntimeException runtimeException = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            RuntimeException stackIn_18_0 = null;
            StringBuilder stackIn_18_1 = null;
            String stackIn_18_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_14_0 = null;
            StringBuilder stackOut_14_1 = null;
            RuntimeException stackOut_17_0 = null;
            StringBuilder stackOut_17_1 = null;
            String stackOut_17_2 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            try {
              L0: {
                if (((jna) this).field_b) {
                  return;
                } else {
                  ((jna) this).field_b = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      Object discarded$3 = lb.b(di.a(43), 2864, "loggedout");
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
                      ((jna) this).getAppletContext().showDocument(new java.net.URL(((jna) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                    if (param0 == -6738) {
                      break L5;
                    } else {
                      ((jna) this).start();
                      break L5;
                    }
                  }
                  break L0;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                runtimeException = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_14_0 = (RuntimeException) runtimeException;
                stackOut_14_1 = new StringBuilder().append("jna.S(").append(param0).append(44);
                stackIn_17_0 = stackOut_14_0;
                stackIn_17_1 = stackOut_14_1;
                stackIn_15_0 = stackOut_14_0;
                stackIn_15_1 = stackOut_14_1;
                if (param1 == null) {
                  stackOut_17_0 = (RuntimeException) (Object) stackIn_17_0;
                  stackOut_17_1 = (StringBuilder) (Object) stackIn_17_1;
                  stackOut_17_2 = "null";
                  stackIn_18_0 = stackOut_17_0;
                  stackIn_18_1 = stackOut_17_1;
                  stackIn_18_2 = stackOut_17_2;
                  break L6;
                } else {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "{...}";
                  stackIn_18_0 = stackOut_15_0;
                  stackIn_18_1 = stackOut_15_1;
                  stackIn_18_2 = stackOut_15_2;
                  break L6;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_18_0, stackIn_18_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        String stackOut_9_0 = null;
        Object stackOut_1_0 = null;
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
            if (rla.field_x == null) {
              L1: {
                if (cba.field_a == null) {
                  break L1;
                } else {
                  if ((Object) (Object) cba.field_a == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = cba.field_a.getParameter(param0);
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_9_0 = super.getParameter(param0);
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (String) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("jna.getParameter(");
            stackIn_14_0 = stackOut_11_0;
            stackIn_14_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param0 == null) {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "null";
              stackIn_15_0 = stackOut_14_0;
              stackIn_15_1 = stackOut_14_1;
              stackIn_15_2 = stackOut_14_2;
              break L2;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L2;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
        }
        return stackIn_10_0;
    }

    public static void c(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -87) {
                break L1;
              } else {
                jna.provideLoaderApplet((java.applet.Applet) null);
                break L1;
              }
            }
            field_j = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "jna.M(" + param0 + 41);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) kua.field_j != this) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  boa.field_t = bva.b((byte) -107) - -4000L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "jna.stop()");
        }
    }

    private final void f() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = bva.b((byte) -107);
            L1: {
              var4 = eia.field_r[sla.field_d];
              eia.field_r[sla.field_d] = var2_long;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long <= var4) {
                  break L1;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  oea.field_f = (32000 - -(var6_int >> 1)) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              sla.field_d = 31 & 1 + sla.field_d;
              int fieldTemp$1 = nsa.field_d;
              nsa.field_d = nsa.field_d + 1;
              if (fieldTemp$1 <= 50) {
                break L2;
              } else {
                L3: {
                  L4: {
                    bsa.field_k = true;
                    nsa.field_d = nsa.field_d - 50;
                    nma.field_l.setSize(mma.field_a, qf.field_i);
                    nma.field_l.setVisible(true);
                    if (null == rla.field_x) {
                      break L4;
                    } else {
                      if (null == nb.field_d) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  nma.field_l.setLocation(lp.field_g, vu.field_f);
                  if (!TombRacer.field_G) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = rla.field_x.getInsets();
                nma.field_l.setLocation(lp.field_g + var6.left, var6.top - -vu.field_f);
                break L2;
              }
            }
            ((jna) this).c(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "jna.O(" + 270 + 41);
        }
    }

    final boolean a(byte param0) {
        return true;
    }

    private final void g() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = bva.b((byte) -107);
              var4 = bv.field_xb[aaa.field_b];
              bv.field_xb[aaa.field_b] = var2_long;
              aaa.field_b = 31 & 1 + aaa.field_b;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var4 <= ~var2_long) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                bn.field_n = oea.field_k;
                break L2;
              }
            }
            ((jna) this).a(true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) (Object) var2, "jna.H(" + -6 + 41);
        }
    }

    abstract void h(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) kua.field_j) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  boa.field_t = bva.b((byte) -107);
                  vja.a(0, 5000L);
                  nea.field_c = null;
                  this.a((byte) 109, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "jna.destroy()");
        }
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
          L0: {
            oea.field_k = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("jna.focusLost(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_3_0 = null;
        java.applet.AppletContext stackOut_11_0 = null;
        java.applet.AppletContext stackOut_13_0 = null;
        try {
          L0: {
            if (rla.field_x != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (cba.field_a == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) cba.field_a) {
                    stackOut_11_0 = cba.field_a.getAppletContext();
                    stackIn_12_0 = stackOut_11_0;
                    return stackIn_12_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_13_0 = super.getAppletContext();
              stackIn_14_0 = stackOut_13_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "jna.getAppletContext()");
        }
        return stackIn_14_0;
    }

    final static boolean a(boolean param0, int param1, int param2, cn param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        int stackOut_1_0 = 0;
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
            var4 = param3.a(param0, param2, param1);
            if (null != var4) {
              ira.a(0, var4);
              stackOut_3_0 = 1;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = 0;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0 != 0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var4_ref = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4_ref;
            stackOut_5_1 = new StringBuilder().append("jna.L(").append(param0).append(44).append(param1).append(44).append(param2).append(44);
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
          throw tba.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0 != 0;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (rla.field_x != null) {
          return null;
        } else {
          L0: {
            if (cba.field_a == null) {
              break L0;
            } else {
              if ((Object) (Object) cba.field_a != this) {
                return cba.field_a.getCodeBase();
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
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_7_0 = null;
        java.net.URL stackOut_9_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (rla.field_x == null) {
              L1: {
                if (null == cba.field_a) {
                  break L1;
                } else {
                  if (this == (Object) (Object) cba.field_a) {
                    break L1;
                  } else {
                    stackOut_7_0 = cba.field_a.getDocumentBase();
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              stackOut_9_0 = super.getDocumentBase();
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.net.URL) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) (Object) var1, "jna.getDocumentBase()");
        }
        return stackIn_10_0;
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
            ((jna) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("jna.update(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) kua.field_j != this) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  boa.field_t = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) (Object) runtimeException, "jna.start()");
        }
    }

    public final void run() {
        try {
            Object var1 = null;
            int var1_int = 0;
            String var2 = null;
            java.lang.reflect.Method var2_ref = null;
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
            int stackIn_94_0 = 0;
            int stackIn_99_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_47_0 = false;
            boolean stackOut_64_0 = false;
            int stackOut_70_0 = 0;
            int stackOut_70_1 = 0;
            int stackOut_81_0 = 0;
            int stackOut_81_1 = 0;
            int stackOut_93_0 = 0;
            int stackOut_97_0 = 0;
            var5 = TombRacer.field_G ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (fia.field_e != null) {
                              L6: {
                                var1 = (Object) (Object) fia.field_e.toLowerCase();
                                if (((String) var1).indexOf("sun") != -1) {
                                  break L6;
                                } else {
                                  if (-1 == ((String) var1).indexOf("apple")) {
                                    break L5;
                                  } else {
                                    break L6;
                                  }
                                }
                              }
                              L7: {
                                L8: {
                                  var2 = fia.field_v;
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
                                                      if (var2.equals((Object) (Object) "1.6.0")) {
                                                        break L8;
                                                      } else {
                                                        break L7;
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
                                ((jna) this).a(-6738, "wrongjava");
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
                                    if (~var2.length() >= ~var3) {
                                      break L10;
                                    } else {
                                      stackOut_47_0 = dp.a(120, var2.charAt(var3));
                                      stackIn_66_0 = stackOut_47_0;
                                      stackIn_48_0 = stackOut_47_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        if (!stackIn_48_0) {
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
                                  int discarded$6 = -3;
                                  if (!sqa.a((CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    int discarded$7 = 70;
                                    if (jb.a((CharSequence) (Object) var4) >= 10) {
                                      break L5;
                                    } else {
                                      ((jna) this).a(-6738, "wrongjava");
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              }
                            } else {
                              break L5;
                            }
                          }
                          if (null == fia.field_v) {
                            break L3;
                          } else {
                            stackOut_64_0 = fia.field_v.startsWith("1.");
                            stackIn_66_0 = stackOut_64_0;
                            break L4;
                          }
                        }
                        if (stackIn_66_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (var1_int >= fia.field_v.length()) {
                                  break L13;
                                } else {
                                  var3 = fia.field_v.charAt(var1_int);
                                  stackOut_70_0 = 48;
                                  stackOut_70_1 = var3;
                                  stackIn_82_0 = stackOut_70_0;
                                  stackIn_82_1 = stackOut_70_1;
                                  stackIn_71_0 = stackOut_70_0;
                                  stackIn_71_1 = stackOut_70_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_71_0 > stackIn_71_1) {
                                      break L13;
                                    } else {
                                      L14: {
                                        if (57 >= var3) {
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
                                      var2_int = var2_int * 10 + (-48 + var3);
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_81_0 = -6;
                              stackOut_81_1 = ~var2_int;
                              stackIn_82_0 = stackOut_81_0;
                              stackIn_82_1 = stackOut_81_1;
                              break L12;
                            }
                            if (stackIn_82_0 < stackIn_82_1) {
                              break L3;
                            } else {
                              da.field_c = true;
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) kua.field_j;
                        if (null == cba.field_a) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) cba.field_a;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = fia.field_b;
                        if (var2_ref == null) {
                          break L16;
                        } else {
                          try {
                            L17: {
                              Object discarded$8 = var2_ref.invoke(var1, new Object[1]);
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
                        }
                      }
                      int discarded$9 = -84;
                      wk.a();
                      ((jna) this).b((byte) 68);
                      gn.field_C = ns.a(117, mma.field_a, (java.awt.Component) (Object) nma.field_l, qf.field_i);
                      ((jna) this).h(-71);
                      cq.field_a = bca.a(0);
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (boa.field_t == 0L) {
                              break L21;
                            } else {
                              stackOut_93_0 = (~boa.field_t < ~bva.b((byte) -107) ? -1 : (~boa.field_t == ~bva.b((byte) -107) ? 0 : 1));
                              stackIn_99_0 = stackOut_93_0;
                              stackIn_94_0 = stackOut_93_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_94_0 >= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          mt.field_a = cq.field_a.a((byte) 12, mga.field_i);
                          stackOut_97_0 = 0;
                          stackIn_99_0 = stackOut_97_0;
                          break L20;
                        }
                        var3 = stackIn_99_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (mt.field_a <= var3) {
                                break L24;
                              } else {
                                int discarded$10 = -6;
                                this.g();
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
                            int discarded$11 = 270;
                            this.f();
                            kla.a(dsa.field_c, (byte) 86, (Object) (Object) nma.field_l);
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
                    ssa.a((String) null, (byte) 127, (Throwable) var1);
                    ((jna) this).a(-6738, "crash");
                    break L25;
                  }
                }
                this.a((byte) 109, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw tba.a((Throwable) var1, "jna.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
              if ((Object) (Object) kua.field_j != this) {
                break L1;
              } else {
                if (tla.field_b) {
                  break L1;
                } else {
                  L2: {
                    bsa.field_k = true;
                    if (!da.field_c) {
                      break L2;
                    } else {
                      if (-lt.field_b + bva.b((byte) -107) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (var2_ref.width < rv.field_a) {
                              break L2;
                            } else {
                              if (var2_ref.height < eca.field_a) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        wla.field_Cb = true;
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
            stackOut_23_1 = new StringBuilder().append("jna.paint(");
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
          throw tba.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
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
            ((jna) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("jna.windowClosing(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public abstract void init();

    private final void a(byte param0, boolean param1) {
        Object var3 = null;
        Object var3_ref = null;
        Exception var3_ref2 = null;
        Throwable var3_ref3 = null;
        RuntimeException var3_ref4 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3_ref = this;
            synchronized (var3_ref) {
              L1: {
                if (!tla.field_b) {
                  tla.field_b = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (null == cba.field_a) {
                break L2;
              } else {
                cba.field_a.destroy();
                break L2;
              }
            }
            try {
              L3: {
                ((jna) this).d(-66);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref2 = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            L5: {
              if (nma.field_l == null) {
                break L5;
              } else {
                try {
                  L6: {
                    nma.field_l.removeFocusListener((java.awt.event.FocusListener) this);
                    nma.field_l.getParent().remove((java.awt.Component) (Object) nma.field_l);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                break L5;
              }
            }
            L8: {
              if (dsa.field_c == null) {
                break L8;
              } else {
                try {
                  L9: {
                    dsa.field_c.b((byte) 59);
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    var3_ref2 = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              }
            }
            L11: {
              ((jna) this).e(-3666);
              if (rla.field_x != null) {
                try {
                  L12: {
                    System.exit(0);
                    break L12;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L13: {
                    var3_ref3 = decompiledCaughtException;
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
          var3_ref4 = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) (Object) var3_ref4, "jna.J(" + 109 + 44 + param1 + 41);
        }
    }

    abstract void e(int param0);

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
            oea.field_k = true;
            bsa.field_k = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("jna.focusGained(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            naa var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            RuntimeException stackOut_24_0 = null;
            StringBuilder stackOut_24_1 = null;
            String stackOut_24_2 = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            String stackOut_22_2 = null;
            var9 = TombRacer.field_G ? 1 : 0;
            try {
              try {
                L0: {
                  if (kua.field_j == null) {
                    L1: {
                      kua.field_j = (jna) this;
                      qf.field_i = param1;
                      eca.field_a = param1;
                      vu.field_f = 0;
                      mma.field_a = param2;
                      rv.field_a = param2;
                      sua.field_L = param4;
                      lp.field_g = 0;
                      if (!param0) {
                        break L1;
                      } else {
                        ((jna) this).paint((java.awt.Graphics) null);
                        break L1;
                      }
                    }
                    dfa.field_e = di.a(49);
                    fia dupTemp$1 = new fia(param5, param6, param3, true);
                    dsa.field_c = dupTemp$1;
                    nea.field_c = dupTemp$1;
                    var8_ref2 = dsa.field_c.a((Runnable) this, 425, 1);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_ref2.field_b != 0) {
                            break L4;
                          } else {
                            vja.a(0, 10L);
                            if (var9 != 0) {
                              break L3;
                            } else {
                              if (var9 == 0) {
                                continue L2;
                              } else {
                                break L4;
                              }
                            }
                          }
                        }
                        break L3;
                      }
                      break L0;
                    }
                  } else {
                    lpa.field_v = lpa.field_v + 1;
                    if (lpa.field_v < 3) {
                      ((jna) this).getAppletContext().showDocument(((jna) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((jna) this).a(-6738, "alreadyloaded");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  ssa.a((String) null, (byte) 118, var8);
                  ((jna) this).a(-6738, "crash");
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var8_ref;
                stackOut_21_1 = new StringBuilder().append("jna.E(").append(param0).append(44).append(param1).append(44).append(param2).append(44).append(param3).append(44).append(param4).append(44).append(param5).append(44);
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param6 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L6;
                } else {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "{...}";
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_25_1 = stackOut_22_1;
                  stackIn_25_2 = stackOut_22_2;
                  break L6;
                }
              }
              throw tba.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
          L0: {
            cba.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("jna.provideLoaderApplet(");
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
          throw tba.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final synchronized void b(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != nma.field_l) {
                nma.field_l.removeFocusListener((java.awt.event.FocusListener) this);
                nma.field_l.getParent().setBackground(java.awt.Color.black);
                nma.field_l.getParent().remove((java.awt.Component) (Object) nma.field_l);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (null != nb.field_d) {
                  break L3;
                } else {
                  L4: {
                    if (rla.field_x != null) {
                      break L4;
                    } else {
                      L5: {
                        if (null == cba.field_a) {
                          break L5;
                        } else {
                          var2 = (Object) (Object) cba.field_a;
                          if (var4 == 0) {
                            break L2;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var2 = (Object) (Object) kua.field_j;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var2 = (Object) (Object) rla.field_x;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              var2 = (Object) (Object) nb.field_d;
              break L2;
            }
            ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
            nma.field_l = (java.awt.Canvas) (Object) new he((java.awt.Component) this);
            java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) nma.field_l);
            nma.field_l.setSize(mma.field_a, qf.field_i);
            nma.field_l.setVisible(true);
            if (param0 > 9) {
              L6: {
                L7: {
                  if ((Object) (Object) rla.field_x == var2) {
                    break L7;
                  } else {
                    nma.field_l.setLocation(lp.field_g, vu.field_f);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var3 = rla.field_x.getInsets();
                nma.field_l.setLocation(var3.left + lp.field_g, var3.top + vu.field_f);
                break L6;
              }
              nma.field_l.addFocusListener((java.awt.event.FocusListener) this);
              nma.field_l.requestFocus();
              oea.field_k = true;
              bn.field_n = true;
              bsa.field_k = true;
              wla.field_Cb = false;
              lt.field_b = bva.b((byte) -107);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw tba.a((Throwable) var2, "jna.Q(" + param0 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    protected jna() {
        ((jna) this).field_b = false;
    }

    final static int a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int stackOut_6_0 = 0;
        int stackOut_8_0 = 0;
        int stackOut_2_0 = 0;
        RuntimeException stackOut_10_0 = null;
        StringBuilder stackOut_10_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        String stackOut_11_2 = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            if (param0 == 10) {
              var2_int = 0;
              var3 = 0;
              L1: while (true) {
                L2: {
                  L3: {
                    if (var3 >= param1.length) {
                      break L3;
                    } else {
                      stackOut_6_0 = var2_int + param1[var3];
                      stackIn_9_0 = stackOut_6_0;
                      stackIn_7_0 = stackOut_6_0;
                      if (var4 != 0) {
                        break L2;
                      } else {
                        var2_int = stackIn_7_0;
                        var3++;
                        if (var4 == 0) {
                          continue L1;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  stackOut_8_0 = var2_int;
                  stackIn_9_0 = stackOut_8_0;
                  break L2;
                }
                break L0;
              }
            } else {
              stackOut_2_0 = -40;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackOut_10_0 = (RuntimeException) var2;
            stackOut_10_1 = new StringBuilder().append("jna.N(").append(param0).append(44);
            stackIn_13_0 = stackOut_10_0;
            stackIn_13_1 = stackOut_10_1;
            stackIn_11_0 = stackOut_10_0;
            stackIn_11_1 = stackOut_10_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L4;
            } else {
              stackOut_11_0 = (RuntimeException) (Object) stackIn_11_0;
              stackOut_11_1 = (StringBuilder) (Object) stackIn_11_1;
              stackOut_11_2 = "{...}";
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_14_2 = stackOut_11_2;
              break L4;
            }
          }
          throw tba.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return stackIn_9_0;
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
    }
}
