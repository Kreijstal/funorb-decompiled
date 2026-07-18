/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.lang.String;
import java.net.URL;

public abstract class re extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static uf field_f;
    static pj field_g;
    boolean field_e;
    static boolean field_k;
    static oh field_c;
    static String field_m;
    public static int field_j;
    public static int field_b;
    public static boolean field_l;
    public static boolean field_d;
    public static boolean field_i;
    public static boolean field_h;
    public static boolean field_a;

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.applet.AppletContext stackOut_9_0 = null;
        java.applet.AppletContext stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (ii.field_s == null) {
              L1: {
                if (null == q.field_c) {
                  break L1;
                } else {
                  if ((Object) (Object) q.field_c != this) {
                    stackOut_9_0 = q.field_c.getAppletContext();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = super.getAppletContext();
              stackIn_12_0 = stackOut_11_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (java.applet.AppletContext) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "re.getAppletContext()");
        }
        return stackIn_12_0;
    }

    abstract void a(int param0);

    public abstract void init();

    final static qj[] a(byte param0, int param1) {
        qj[] var2 = null;
        RuntimeException var2_ref = null;
        qj[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        qj[] stackOut_3_0 = null;
        try {
          L0: {
            L1: {
              var2 = new qj[9];
              var2[4] = ee.a(param1, 64, (byte) 117);
              if (param0 > 115) {
                break L1;
              } else {
                qj[] discarded$2 = re.a((byte) -81, -92);
                break L1;
              }
            }
            stackOut_3_0 = (qj[]) var2;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2_ref, "re.MA(" + param0 + ',' + param1 + ')');
        }
        return stackIn_4_0;
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) f.field_c != this) {
                break L1;
              } else {
                if (jk.field_a) {
                  break L1;
                } else {
                  v.field_a = qg.a(false);
                  int discarded$2 = 0;
                  wl.a(5000L);
                  field_f = null;
                  this.a(-121, false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) (Object) runtimeException, "re.destroy()");
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
            q.field_c = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("re.provideLoaderApplet(");
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
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final static String c(int param0) {
        RuntimeException var1 = null;
        String stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_12_0 = null;
        String stackOut_14_0 = null;
        String stackOut_7_0 = null;
        String stackOut_1_0 = null;
        try {
          L0: {
            if (oe.field_b != fd.field_h) {
              L1: {
                if (param0 == 6) {
                  break L1;
                } else {
                  int discarded$2 = re.g(-74);
                  break L1;
                }
              }
              if (sa.field_Q.b((byte) 114)) {
                if (oe.field_b == rk.field_X) {
                  stackOut_12_0 = sa.field_Q.a((byte) 63);
                  stackIn_13_0 = stackOut_12_0;
                  return stackIn_13_0;
                } else {
                  stackOut_14_0 = qg.field_c;
                  stackIn_15_0 = stackOut_14_0;
                  break L0;
                }
              } else {
                stackOut_7_0 = sa.field_Q.a((byte) 63);
                stackIn_8_0 = stackOut_7_0;
                return stackIn_8_0;
              }
            } else {
              stackOut_1_0 = fi.field_l;
              stackIn_2_0 = stackOut_1_0;
              return stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "re.HA(" + param0 + ')');
        }
        return stackIn_15_0;
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
            vj.field_b = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("re.focusLost(");
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
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              if (ki.field_f == null) {
                break L1;
              } else {
                ki.field_f.removeFocusListener((java.awt.event.FocusListener) this);
                ki.field_f.getParent().setBackground(java.awt.Color.black);
                ki.field_f.getParent().remove((java.awt.Component) (Object) ki.field_f);
                break L1;
              }
            }
            L2: {
              L3: {
                if (sf.field_H == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) sf.field_H;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null != ii.field_s) {
                  break L4;
                } else {
                  L5: {
                    if (q.field_c != null) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) f.field_c;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) q.field_c;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = (Object) (Object) ii.field_s;
              break L2;
            }
            ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
            ki.field_f = (java.awt.Canvas) (Object) new te((java.awt.Component) this);
            java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ki.field_f);
            ki.field_f.setSize(og.field_pb, wf.field_b);
            ki.field_f.setVisible(true);
            if (param0 < -54) {
              L6: {
                L7: {
                  if (var2 == (Object) (Object) ii.field_s) {
                    break L7;
                  } else {
                    ki.field_f.setLocation(gb.field_i, ri.field_P);
                    if (var4 == 0) {
                      break L6;
                    } else {
                      break L7;
                    }
                  }
                }
                var3 = ii.field_s.getInsets();
                ki.field_f.setLocation(var3.left - -gb.field_i, ri.field_P + var3.top);
                break L6;
              }
              ki.field_f.addFocusListener((java.awt.event.FocusListener) this);
              ki.field_f.requestFocus();
              lb.field_M = true;
              vj.field_b = true;
              vh.field_q = true;
              mj.field_c = false;
              rj.field_c = qg.a(false);
              break L0;
            } else {
              return;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw sl.a((Throwable) var2, "re.LA(" + param0 + ')');
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
            ((re) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("re.windowClosing(");
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
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            ((re) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("re.update(");
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
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final void a(String param0, byte param1) {
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
                if (!((re) this).field_e) {
                  ((re) this).field_e = true;
                  System.out.println("error_game_" + param0);
                  try {
                    L1: {
                      L2: {
                        Object discarded$2 = sj.a((byte) -7, "loggedout", gd.b((byte) 77));
                        if (param1 == 100) {
                          break L2;
                        } else {
                          java.applet.AppletContext discarded$3 = ((re) this).getAppletContext();
                          break L2;
                        }
                      }
                      break L1;
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
                      ((re) this).getAppletContext().showDocument(new java.net.URL(((re) this).getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
                      break L4;
                    }
                  } catch (java.lang.Exception decompiledCaughtParameter1) {
                    decompiledCaughtException = decompiledCaughtParameter1;
                    L5: {
                      var3_ref = (Exception) (Object) decompiledCaughtException;
                      break L5;
                    }
                  }
                  break L0;
                } else {
                  return;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_11_0 = (RuntimeException) var3_ref2;
                stackOut_11_1 = new StringBuilder().append("re.PA(");
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
                  break L6;
                } else {
                  stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
                  stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
                  stackOut_12_2 = "{...}";
                  stackIn_15_0 = stackOut_12_0;
                  stackIn_15_1 = stackOut_12_1;
                  stackIn_15_2 = stackOut_12_2;
                  break L6;
                }
              }
              throw sl.a((Throwable) (Object) stackIn_15_0, stackIn_15_2 + ',' + param1 + ')');
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
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_20_0 = null;
        StringBuilder stackOut_20_1 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        RuntimeException stackOut_21_0 = null;
        StringBuilder stackOut_21_1 = null;
        String stackOut_21_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) f.field_c != this) {
                break L1;
              } else {
                if (!jk.field_a) {
                  L2: {
                    vh.field_q = true;
                    if (!rh.field_F) {
                      break L2;
                    } else {
                      if (-rj.field_c + qg.a(false) > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (kb.field_b > var2_ref.width) {
                              break L2;
                            } else {
                              if (~var2_ref.height <= ~mf.field_g) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        mj.field_c = true;
                        break L2;
                      } else {
                        break L2;
                      }
                    }
                  }
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
          L4: {
            var2 = decompiledCaughtException;
            stackOut_20_0 = (RuntimeException) var2;
            stackOut_20_1 = new StringBuilder().append("re.paint(");
            stackIn_23_0 = stackOut_20_0;
            stackIn_23_1 = stackOut_20_1;
            stackIn_21_0 = stackOut_20_0;
            stackIn_21_1 = stackOut_20_1;
            if (param0 == null) {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "null";
              stackIn_24_0 = stackOut_23_0;
              stackIn_24_1 = stackOut_23_1;
              stackIn_24_2 = stackOut_23_2;
              break L4;
            } else {
              stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
              stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
              stackOut_21_2 = "{...}";
              stackIn_24_0 = stackOut_21_0;
              stackIn_24_1 = stackOut_21_1;
              stackIn_24_2 = stackOut_21_2;
              break L4;
            }
          }
          throw sl.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    final boolean a(byte param0) {
        return true;
    }

    final static int g(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_3_0 = 0;
        try {
          L0: {
            L1: {
              if (param0 == 48) {
                break L1;
              } else {
                field_c = null;
                break L1;
              }
            }
            stackOut_3_0 = -bk.field_D + cd.field_b;
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "re.SA(" + param0 + ')');
        }
        return stackIn_4_0;
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) f.field_c) {
                break L1;
              } else {
                if (jk.field_a) {
                  break L1;
                } else {
                  v.field_a = 4000L + qg.a(false);
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) (Object) runtimeException, "re.stop()");
        }
    }

    abstract void h(int param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) f.field_c != this) {
                break L1;
              } else {
                if (jk.field_a) {
                  break L1;
                } else {
                  v.field_a = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) (Object) runtimeException, "re.start()");
        }
    }

    protected re() {
        ((re) this).field_e = false;
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
            vj.field_b = true;
            vh.field_q = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("re.focusGained(");
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
          throw sl.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            boolean stackIn_46_0 = false;
            boolean stackIn_64_0 = false;
            int stackIn_69_0 = 0;
            int stackIn_69_1 = 0;
            int stackIn_80_0 = 0;
            int stackIn_80_1 = 0;
            int stackIn_92_0 = 0;
            int stackIn_97_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_45_0 = false;
            boolean stackOut_62_0 = false;
            int stackOut_68_0 = 0;
            int stackOut_68_1 = 0;
            int stackOut_79_0 = 0;
            int stackOut_79_1 = 0;
            int stackOut_91_0 = 0;
            int stackOut_95_0 = 0;
            var5 = TrackController.field_F ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null == uf.field_e) {
                              break L5;
                            } else {
                              L6: {
                                var1 = (Object) (Object) uf.field_e.toLowerCase();
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
                                  var2 = uf.field_g;
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
                                ((re) this).a("wrongjava", (byte) 100);
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
                                      stackOut_45_0 = hd.a(-123, var2.charAt(var3));
                                      stackIn_64_0 = stackOut_45_0;
                                      stackIn_46_0 = stackOut_45_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        if (!stackIn_46_0) {
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
                                  if (!ej.a(false, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    int discarded$4 = 10;
                                    if (uk.a((CharSequence) (Object) var4) < 10) {
                                      ((re) this).a("wrongjava", (byte) 100);
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
                            }
                          }
                          if (null == uf.field_g) {
                            break L3;
                          } else {
                            stackOut_62_0 = uf.field_g.startsWith("1.");
                            stackIn_64_0 = stackOut_62_0;
                            break L4;
                          }
                        }
                        if (stackIn_64_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (~uf.field_g.length() >= ~var1_int) {
                                  break L13;
                                } else {
                                  var3 = uf.field_g.charAt(var1_int);
                                  stackOut_68_0 = -49;
                                  stackOut_68_1 = ~var3;
                                  stackIn_80_0 = stackOut_68_0;
                                  stackIn_80_1 = stackOut_68_1;
                                  stackIn_69_0 = stackOut_68_0;
                                  stackIn_69_1 = stackOut_68_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_69_0 < stackIn_69_1) {
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
                                      var2_int = var2_int * 10 + -48 + var3;
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_79_0 = ~var2_int;
                              stackOut_79_1 = -6;
                              stackIn_80_0 = stackOut_79_0;
                              stackIn_80_1 = stackOut_79_1;
                              break L12;
                            }
                            if (stackIn_80_0 > stackIn_80_1) {
                              break L3;
                            } else {
                              rh.field_F = true;
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) f.field_c;
                        if (q.field_c == null) {
                          break L15;
                        } else {
                          var1 = (Object) (Object) q.field_c;
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = uf.field_m;
                        if (null == var2_ref) {
                          break L16;
                        } else {
                          try {
                            L17: {
                              Object discarded$5 = var2_ref.invoke(var1, new Object[1]);
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
                      tc.c((byte) 46);
                      ((re) this).f(-121);
                      ia.field_b = tf.a(og.field_pb, true, wf.field_b, (java.awt.Component) (Object) ki.field_f);
                      ((re) this).c((byte) 122);
                      wl.field_i = qk.j(-17514);
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (0L == v.field_a) {
                              break L21;
                            } else {
                              stackOut_91_0 = (v.field_a < qg.a(false) ? -1 : (v.field_a == qg.a(false) ? 0 : 1));
                              stackIn_97_0 = stackOut_91_0;
                              stackIn_92_0 = stackOut_91_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_92_0 <= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          v.field_f = wl.field_i.a((byte) 120, ba.field_f);
                          stackOut_95_0 = 0;
                          stackIn_97_0 = stackOut_95_0;
                          break L20;
                        }
                        var3 = stackIn_97_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~v.field_f >= ~var3) {
                                break L24;
                              } else {
                                int discarded$6 = 8865;
                                this.d();
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
                            int discarded$7 = 57;
                            this.b();
                            f.a((Object) (Object) ki.field_f, (byte) -127, rg.field_c);
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
                    hb.a((Throwable) var1, 0, (String) null);
                    ((re) this).a("crash", (byte) 100);
                    break L25;
                  }
                }
                this.a(-122, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw sl.a((Throwable) var1, "re.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final static void a(byte param0, String param1) {
        L0: {
          if (param0 == 53) {
            break L0;
          } else {
            re.a((byte) 113, (String) null);
            break L0;
          }
        }
        System.out.println("Error: " + bb.a(param1, (byte) -82, "\n", "%0a"));
    }

    abstract void e(int param0);

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 <= -70) {
                break L1;
              } else {
                field_k = true;
                break L1;
              }
            }
            field_c = null;
            field_g = null;
            field_m = null;
            field_f = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var1, "re.QA(" + param0 + ')');
        }
    }

    abstract void c(byte param0);

    private final void d() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        Object var6 = null;
        Throwable var7 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var2_long = qg.a(false);
            var4 = ai.field_g[ge.field_G];
            ai.field_g[ge.field_G] = var2_long;
            L1: {
              ge.field_G = 1 + ge.field_G & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if (~var2_long >= ~var4) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            var6 = this;
            synchronized (var6) {
              L2: {
                lb.field_M = vj.field_b;
                break L2;
              }
            }
            ((re) this).a(false);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "re.RA(" + 8865 + ')');
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
          L0: {
            if (null != ii.field_s) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (q.field_c == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) q.field_c) {
                    stackOut_11_0 = q.field_c.getParameter(param0);
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
            stackOut_15_1 = new StringBuilder().append("re.getParameter(");
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
          throw sl.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        java.net.URL stackOut_9_0 = null;
        java.net.URL stackOut_11_0 = null;
        Object stackOut_1_0 = null;
        try {
          L0: {
            if (ii.field_s == null) {
              L1: {
                if (q.field_c == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) q.field_c) {
                    stackOut_9_0 = q.field_c.getDocumentBase();
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  } else {
                    break L1;
                  }
                }
              }
              stackOut_11_0 = super.getDocumentBase();
              stackIn_12_0 = stackOut_11_0;
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
          throw sl.a((Throwable) (Object) var1, "re.getDocumentBase()");
        }
        return stackIn_12_0;
    }

    final void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            ce var8_ref2 = null;
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
            var9 = TrackController.field_F ? 1 : 0;
            try {
              try {
                L0: {
                  if (null == f.field_c) {
                    L1: {
                      if (param6 == 10) {
                        break L1;
                      } else {
                        ((re) this).run();
                        break L1;
                      }
                    }
                    f.field_c = (re) this;
                    og.field_pb = param4;
                    kb.field_b = param4;
                    lj.field_a = param2;
                    ri.field_P = 0;
                    gb.field_i = 0;
                    wf.field_b = param5;
                    mf.field_g = param5;
                    qf.field_b = gd.b((byte) 77);
                    uf dupTemp$2 = new uf(param0, param3, param1, true);
                    rg.field_c = dupTemp$2;
                    field_f = dupTemp$2;
                    var8_ref2 = rg.field_c.a(1, (Runnable) this, 64);
                    L2: while (true) {
                      L3: {
                        L4: {
                          if (var8_ref2.field_f != 0) {
                            break L4;
                          } else {
                            int discarded$3 = 0;
                            wl.a(10L);
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
                    cd.field_g = cd.field_g + 1;
                    if (3 > cd.field_g) {
                      ((re) this).getAppletContext().showDocument(((re) this).getDocumentBase(), "_self");
                      return;
                    } else {
                      ((re) this).a("alreadyloaded", (byte) 100);
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L5: {
                  var8 = decompiledCaughtException;
                  hb.a(var8, 0, (String) null);
                  ((re) this).a("crash", (byte) 100);
                  break L5;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L6: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var8_ref;
                stackOut_21_1 = new StringBuilder().append("re.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param3 == null) {
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
              throw sl.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != ii.field_s) {
          return null;
        } else {
          L0: {
            if (q.field_c == null) {
              break L0;
            } else {
              if (this != (Object) (Object) q.field_c) {
                return q.field_c.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
        }
    }

    private final void b() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = qg.a(false);
            var4 = bc.field_a[ai.field_f];
            bc.field_a[ai.field_f] = var2_long;
            L1: {
              ai.field_f = ai.field_f - -1 & 31;
              if (var4 == 0L) {
                break L1;
              } else {
                if (var2_long <= var4) {
                  break L1;
                } else {
                  var6_int = (int)(-var4 + var2_long);
                  dh.field_p = (32000 + (var6_int >> 1)) / var6_int;
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$1 = gf.field_g;
              gf.field_g = gf.field_g + 1;
              if (50 < fieldTemp$1) {
                L3: {
                  vh.field_q = true;
                  gf.field_g = gf.field_g - 50;
                  ki.field_f.setSize(og.field_pb, wf.field_b);
                  ki.field_f.setVisible(true);
                  if (null == ii.field_s) {
                    break L3;
                  } else {
                    if (sf.field_H != null) {
                      break L3;
                    } else {
                      var6 = ii.field_s.getInsets();
                      ki.field_f.setLocation(gb.field_i + var6.left, ri.field_P + var6.top);
                      if (!TrackController.field_F) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ki.field_f.setLocation(gb.field_i, ri.field_P);
                break L2;
              } else {
                break L2;
              }
            }
            ((re) this).a(160);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (Object) var2, "re.IA(" + 57 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (jk.field_a) {
                  return;
                } else {
                  jk.field_a = true;
                  break L1;
                }
              }
            }
            L2: {
              if (param0 < -113) {
                break L2;
              } else {
                ((re) this).run();
                break L2;
              }
            }
            L3: {
              if (null != q.field_c) {
                q.field_c.destroy();
                break L3;
              } else {
                break L3;
              }
            }
            try {
              L4: {
                ((re) this).h(-24452);
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
              if (ki.field_f == null) {
                break L6;
              } else {
                try {
                  L7: {
                    ki.field_f.removeFocusListener((java.awt.event.FocusListener) this);
                    ki.field_f.getParent().remove((java.awt.Component) (Object) ki.field_f);
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
              if (rg.field_c == null) {
                break L9;
              } else {
                try {
                  L10: {
                    rg.field_c.a((byte) -126);
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
              ((re) this).e(105);
              if (null == ii.field_s) {
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
          throw sl.a((Throwable) (Object) runtimeException, "re.JA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = false;
        field_m = "Email: ";
    }
}
