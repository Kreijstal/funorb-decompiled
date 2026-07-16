/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class kq extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String[] field_g;
    boolean field_n;
    static di field_m;
    static dd field_h;
    static int field_c;
    static vh field_a;
    static en field_l;
    public static boolean field_k;
    public static int field_i;
    public static boolean field_d;
    public static boolean field_f;
    public static int field_j;
    public static boolean field_e;
    public static int field_b;

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
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
            ((kq) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kq.windowClosing(");
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
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
            if (op.field_e != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (oc.field_t == null) {
                  break L1;
                } else {
                  if ((Object) (Object) oc.field_t == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = oc.field_t.getAppletContext();
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
          throw wm.a((Throwable) (Object) var1, "kq.getAppletContext()");
        }
        return stackIn_12_0;
    }

    public abstract void init();

    final void a(byte param0, String param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            int var3_int = 0;
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
                if (((kq) this).field_n) {
                  return;
                } else {
                  ((kq) this).field_n = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      Object discarded$1 = mo.a((byte) 122, "loggedout", hk.d(71));
                      var3_int = -37 % ((param0 - 57) / 34);
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
                      ((kq) this).getAppletContext().showDocument(new java.net.URL(((kq) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                stackOut_11_1 = new StringBuilder().append("kq.D(").append(param0).append(44);
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
              throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 41);
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final synchronized void f(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (null != pa.field_K) {
                pa.field_K.removeFocusListener((java.awt.event.FocusListener) this);
                pa.field_K.getParent().setBackground(java.awt.Color.black);
                pa.field_K.getParent().remove((java.awt.Component) (Object) pa.field_K);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (iq.field_l == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) iq.field_l;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != op.field_e) {
                  break L4;
                } else {
                  L5: {
                    if (null != oc.field_t) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) ni.field_ib;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) oc.field_t;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = (Object) (Object) op.field_e;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                pa.field_K = (java.awt.Canvas) (Object) new cn((java.awt.Component) this);
                java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) pa.field_K);
                pa.field_K.setSize(ml.field_d, ad.field_c);
                pa.field_K.setVisible(true);
                if ((Object) (Object) op.field_e != var2) {
                  break L7;
                } else {
                  var3 = op.field_e.getInsets();
                  pa.field_K.setLocation(var3.left + cl.field_e, ua.field_v + var3.top);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              pa.field_K.setLocation(cl.field_e, ua.field_v);
              break L6;
            }
            pa.field_K.addFocusListener((java.awt.event.FocusListener) this);
            pa.field_K.requestFocus();
            if (param0 >= 40) {
              vl.field_q = true;
              um.field_e = true;
              he.field_c = true;
              wd.field_Sb = false;
              ph.field_b = rl.a((byte) -94);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw wm.a((Throwable) var2, "kq.A(" + param0 + 41);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ni.field_ib != this) {
                break L1;
              } else {
                if (ka.field_p) {
                  break L1;
                } else {
                  rm.field_c = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "kq.start()");
        }
    }

    final boolean b(int param0) {
        return true;
    }

    abstract void d(byte param0);

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
        Object stackOut_1_0 = null;
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
            if (op.field_e == null) {
              L1: {
                if (null == oc.field_t) {
                  break L1;
                } else {
                  if (this != (Object) (Object) oc.field_t) {
                    stackOut_9_0 = oc.field_t.getParameter(param0);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = super.getParameter(param0);
              stackIn_12_0 = stackOut_11_0;
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
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("kq.getParameter(");
            stackIn_16_0 = stackOut_13_0;
            stackIn_16_1 = stackOut_13_1;
            stackIn_14_0 = stackOut_13_0;
            stackIn_14_1 = stackOut_13_1;
            if (param0 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L2;
            } else {
              stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
              stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
              stackOut_14_2 = "{...}";
              stackIn_17_0 = stackOut_14_0;
              stackIn_17_1 = stackOut_14_1;
              stackIn_17_2 = stackOut_14_2;
              break L2;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 41);
        }
        return stackIn_12_0;
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
            oc.field_t = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kq.provideLoaderApplet(");
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    final static void a(dd[] param0, int param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            L1: {
              nf.field_V = param0;
              if (param1 == -58) {
                break L1;
              } else {
                field_a = null;
                break L1;
              }
            }
            L2: {
              if (null == nf.field_V) {
                break L2;
              } else {
                if ((param0.length ^ -1) > -4) {
                  throw new IllegalArgumentException("");
                } else {
                  break L2;
                }
              }
            }
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("kq.O(");
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
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_15_0 = stackOut_12_0;
              stackIn_15_1 = stackOut_12_1;
              stackIn_15_2 = stackOut_12_2;
              break L3;
            }
          }
          throw wm.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + 44 + param1 + 41);
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
            vl.field_q = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kq.focusLost(");
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    private final void b(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = rl.a((byte) -115);
            if (param0 <= -19) {
              L1: {
                var4 = dj.field_l[t.field_d];
                dj.field_l[t.field_d] = var2_long;
                t.field_d = 31 & t.field_d - -1;
                if (0L == var4) {
                  break L1;
                } else {
                  if (var2_long > var4) {
                    var6_int = (int)(-var4 + var2_long);
                    un.field_g = ((var6_int >> 1140598529) + 32000) / var6_int;
                    break L1;
                  } else {
                    break L1;
                  }
                }
              }
              L2: {
                int fieldTemp$2 = ei.field_o;
                ei.field_o = ei.field_o + 1;
                if (fieldTemp$2 > 50) {
                  L3: {
                    he.field_c = true;
                    ei.field_o = ei.field_o - 50;
                    pa.field_K.setSize(ml.field_d, ad.field_c);
                    pa.field_K.setVisible(true);
                    if (null == op.field_e) {
                      break L3;
                    } else {
                      if (iq.field_l != null) {
                        break L3;
                      } else {
                        var6 = op.field_e.getInsets();
                        pa.field_K.setLocation(var6.left - -cl.field_e, var6.top - -ua.field_v);
                        if (Pool.field_O == 0) {
                          break L2;
                        } else {
                          break L3;
                        }
                      }
                    }
                  }
                  pa.field_K.setLocation(cl.field_e, ua.field_v);
                  break L2;
                } else {
                  break L2;
                }
              }
              ((kq) this).a((byte) 120);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "kq.H(" + param0 + 41);
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
          L0: {
            ((kq) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kq.update(");
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) ni.field_ib != this) {
                break L1;
              } else {
                if (ka.field_p) {
                  break L1;
                } else {
                  rm.field_c = rl.a((byte) -113) - -4000L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "kq.stop()");
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_long = rl.a((byte) -118);
              if (param0 == -15568) {
                break L1;
              } else {
                ((kq) this).windowIconified((java.awt.event.WindowEvent) null);
                break L1;
              }
            }
            L2: {
              var4 = oa.field_f[kb.field_e];
              oa.field_f[kb.field_e] = var2_long;
              if ((var4 ^ -1L) == -1L) {
                break L2;
              } else {
                if ((var4 ^ -1L) <= (var2_long ^ -1L)) {
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            kb.field_e = 31 & 1 + kb.field_e;
            var6 = this;
            synchronized (var6) {
              L3: {
                um.field_e = vl.field_q;
                break L3;
              }
            }
            ((kq) this).e((byte) -99);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) (Object) runtimeException, "kq.F(" + param0 + 41);
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
        var5 = Pool.field_O;
        try {
          L0: {
            try {
              L1: {
                L2: {
                  L3: {
                    L4: {
                      L5: {
                        if (null != sj.field_o) {
                          L6: {
                            var1 = (Object) (Object) sj.field_o.toLowerCase();
                            if ((((String) var1).indexOf("sun") ^ -1) != 0) {
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
                              var2 = sj.field_t;
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
                            ((kq) this).a((byte) 124, "wrongjava");
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
                                if (var3 >= var2.length()) {
                                  break L10;
                                } else {
                                  stackOut_47_0 = kh.a(var2.charAt(var3), (byte) 19);
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
                              if (!ka.a(10, (CharSequence) (Object) var4)) {
                                break L5;
                              } else {
                                if ((kq.a((byte) 105, (CharSequence) (Object) var4) ^ -1) <= -11) {
                                  break L5;
                                } else {
                                  ((kq) this).a((byte) -89, "wrongjava");
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
                      if (sj.field_t == null) {
                        break L3;
                      } else {
                        stackOut_64_0 = sj.field_t.startsWith("1.");
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
                            if (sj.field_t.length() <= var1_int) {
                              break L13;
                            } else {
                              var3 = sj.field_t.charAt(var1_int);
                              stackOut_70_0 = -49;
                              stackOut_70_1 = var3 ^ -1;
                              stackIn_82_0 = stackOut_70_0;
                              stackIn_82_1 = stackOut_70_1;
                              stackIn_71_0 = stackOut_70_0;
                              stackIn_71_1 = stackOut_70_1;
                              if (var5 != 0) {
                                break L12;
                              } else {
                                if (stackIn_71_0 < stackIn_71_1) {
                                  break L13;
                                } else {
                                  L14: {
                                    if (-58 <= (var3 ^ -1)) {
                                      break L14;
                                    } else {
                                      if (var5 == 0) {
                                        break L13;
                                      } else {
                                        break L14;
                                      }
                                    }
                                  }
                                  var2_int = -48 + (var3 + var2_int * 10);
                                  var1_int++;
                                  if (var5 == 0) {
                                    continue L11;
                                  } else {
                                    break L13;
                                  }
                                }
                              }
                            }
                          }
                          stackOut_81_0 = var2_int;
                          stackOut_81_1 = 5;
                          stackIn_82_0 = stackOut_81_0;
                          stackIn_82_1 = stackOut_81_1;
                          break L12;
                        }
                        if (stackIn_82_0 < stackIn_82_1) {
                          break L3;
                        } else {
                          bq.field_o = true;
                          break L3;
                        }
                      }
                    } else {
                      break L3;
                    }
                  }
                  L15: {
                    var1 = (Object) (Object) ni.field_ib;
                    if (null == oc.field_t) {
                      break L15;
                    } else {
                      var1 = (Object) (Object) oc.field_t;
                      break L15;
                    }
                  }
                  L16: {
                    var2_ref = sj.field_q;
                    if (var2_ref == null) {
                      break L16;
                    } else {
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
                    }
                  }
                  lo.a(-19);
                  ((kq) this).f((byte) 55);
                  sh.field_P = id.a(ml.field_d, ad.field_c, -44, (java.awt.Component) (Object) pa.field_K);
                  ((kq) this).d((byte) -46);
                  pj.field_J = ug.e(0);
                  L19: while (true) {
                    L20: {
                      L21: {
                        if (-1L == (rm.field_c ^ -1L)) {
                          break L21;
                        } else {
                          stackOut_93_0 = ((rm.field_c ^ -1L) < (rl.a((byte) -122) ^ -1L) ? -1 : ((rm.field_c ^ -1L) == (rl.a((byte) -122) ^ -1L) ? 0 : 1));
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
                      rn.field_b = pj.field_J.a(oh.field_e, (byte) 39);
                      stackOut_97_0 = 0;
                      stackIn_99_0 = stackOut_97_0;
                      break L20;
                    }
                    var3 = stackIn_99_0;
                    L22: while (true) {
                      L23: {
                        L24: {
                          if (var3 >= rn.field_b) {
                            break L24;
                          } else {
                            this.a(-15568);
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
                        this.b((byte) -30);
                        cb.a((Object) (Object) pa.field_K, lg.field_s, 125);
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
                tc.a((Throwable) var1, (String) null, -8555);
                ((kq) this).a((byte) -103, "crash");
                break L25;
              }
            }
            this.a(20171, true);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
          decompiledCaughtException = decompiledCaughtParameter2;
          var1 = (Object) (Object) decompiledCaughtException;
          throw wm.a((Throwable) var1, "kq.run()");
        }
    }

    public static void g(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              field_h = null;
              field_m = null;
              if (param0 <= -14) {
                break L1;
              } else {
                field_c = 127;
                break L1;
              }
            }
            field_l = null;
            field_g = null;
            field_a = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) (Object) var1, "kq.C(" + param0 + 41);
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var3_ref = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (ka.field_p) {
                  return;
                } else {
                  ka.field_p = true;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 == 20171) {
                break L2;
              } else {
                field_h = null;
                break L2;
              }
            }
            L3: {
              if (null != oc.field_t) {
                oc.field_t.destroy();
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                ((kq) this).c((byte) -39);
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
              if (null == pa.field_K) {
                break L6;
              } else {
                try {
                  L7: {
                    pa.field_K.removeFocusListener((java.awt.event.FocusListener) this);
                    pa.field_K.getParent().remove((java.awt.Component) (Object) pa.field_K);
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
              if (lg.field_s != null) {
                try {
                  L10: {
                    lg.field_s.a(true);
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
              ((kq) this).h((byte) -28);
              if (null != op.field_e) {
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
          throw wm.a((Throwable) (Object) runtimeException, "kq.L(" + param0 + 44 + param1 + 41);
        }
    }

    final static int a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
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
            L1: {
              if (param0 > 56) {
                break L1;
              } else {
                field_c = 38;
                break L1;
              }
            }
            stackOut_3_0 = ao.a(10, true, true, param1);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("kq.G(").append(param0).append(44);
            stackIn_8_0 = stackOut_5_0;
            stackIn_8_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param1 == null) {
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
          throw wm.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + 41);
        }
        return stackIn_4_0;
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) ni.field_ib) {
                break L1;
              } else {
                if (!ka.field_p) {
                  rm.field_c = rl.a((byte) -119);
                  cf.a(-79, 5000L);
                  wh.field_c = null;
                  this.a(20171, false);
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
          throw wm.a((Throwable) (Object) runtimeException, "kq.destroy()");
        }
    }

    abstract void e(byte param0);

    final void a(int param0, int param1, String param2, byte param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            le var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_22_0 = null;
            StringBuilder stackOut_22_1 = null;
            RuntimeException stackOut_25_0 = null;
            StringBuilder stackOut_25_1 = null;
            String stackOut_25_2 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            var9 = Pool.field_O;
            try {
              try {
                L0: {
                  if (null == ni.field_ib) {
                    L1: {
                      ok.field_rb = param0;
                      cl.field_e = 0;
                      ni.field_ib = (kq) this;
                      ad.field_c = param1;
                      rb.field_f = param1;
                      ua.field_v = 0;
                      ml.field_d = param6;
                      dl.field_b = param6;
                      gj.field_W = hk.d(77);
                      sj dupTemp$1 = new sj(param4, param2, param5, true);
                      lg.field_s = dupTemp$1;
                      wh.field_c = dupTemp$1;
                      var8_ref2 = lg.field_s.a(113, 1, (Runnable) this);
                      if (param3 == 115) {
                        break L1;
                      } else {
                        ((kq) this).a((byte) -22, (String) null);
                        break L1;
                      }
                    }
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_ref2.field_f != 0) {
                            break L4;
                          } else {
                            cf.a(param3 + -228, 10L);
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
                    oe.field_V = oe.field_V + 1;
                    if (oe.field_V >= 3) {
                      ((kq) this).a((byte) -46, "alreadyloaded");
                      return;
                    } else {
                      ((kq) this).getAppletContext().showDocument(((kq) this).getDocumentBase(), "_self");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  tc.a(var8, (String) null, -8555);
                  ((kq) this).a((byte) -108, "crash");
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_22_0 = (RuntimeException) var8_ref;
                stackOut_22_1 = new StringBuilder().append("kq.J(").append(param0).append(44).append(param1).append(44);
                stackIn_25_0 = stackOut_22_0;
                stackIn_25_1 = stackOut_22_1;
                stackIn_23_0 = stackOut_22_0;
                stackIn_23_1 = stackOut_22_1;
                if (param2 == null) {
                  stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
                  stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
                  stackOut_25_2 = "null";
                  stackIn_26_0 = stackOut_25_0;
                  stackIn_26_1 = stackOut_25_1;
                  stackIn_26_2 = stackOut_25_2;
                  break L6;
                } else {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "{...}";
                  stackIn_26_0 = stackOut_23_0;
                  stackIn_26_1 = stackOut_23_1;
                  stackIn_26_2 = stackOut_23_2;
                  break L6;
                }
              }
              throw wm.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
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
              if ((Object) (Object) ni.field_ib != this) {
                break L1;
              } else {
                if (ka.field_p) {
                  break L1;
                } else {
                  L2: {
                    he.field_c = true;
                    if (!bq.field_o) {
                      break L2;
                    } else {
                      if (-ph.field_b + rl.a((byte) -128) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if ((dl.field_b ^ -1) < (var2_ref.width ^ -1)) {
                              break L2;
                            } else {
                              if (rb.field_f > var2_ref.height) {
                                break L2;
                              } else {
                                break L3;
                              }
                            }
                          }
                        }
                        wd.field_Sb = true;
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
            stackOut_23_1 = new StringBuilder().append("kq.paint(");
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
          throw wm.a((Throwable) (Object) stackIn_27_0, stackIn_27_2 + 41);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (op.field_e == null) {
          L0: {
            if (null == oc.field_t) {
              break L0;
            } else {
              if ((Object) (Object) oc.field_t != this) {
                return oc.field_t.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        } else {
          return null;
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
            vl.field_q = true;
            he.field_c = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("kq.focusGained(");
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
          throw wm.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + 41);
        }
    }

    abstract void a(byte param0);

    abstract void h(byte param0);

    protected kq() {
        ((kq) this).field_n = false;
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
            if (op.field_e != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.net.URL) (Object) stackIn_4_0;
            } else {
              L1: {
                if (oc.field_t == null) {
                  break L1;
                } else {
                  if ((Object) (Object) oc.field_t != this) {
                    stackOut_11_0 = oc.field_t.getDocumentBase();
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
          throw wm.a((Throwable) (Object) var1, "kq.getDocumentBase()");
        }
        return stackIn_14_0;
    }

    abstract void c(byte param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = 20;
    }
}
