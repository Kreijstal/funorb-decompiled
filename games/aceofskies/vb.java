/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class vb extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static pt field_o;
    static fr field_l;
    boolean field_e;
    public static int field_a;
    public static boolean field_i;
    public static boolean field_h;
    public static boolean field_g;
    public static boolean field_k;
    public static boolean field_d;
    public static boolean field_j;
    public static int field_b;
    public static int field_c;
    public static boolean field_n;
    public static boolean field_m;
    public static boolean field_p;
    public static int field_f;

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) gh.field_f != this) {
                break L1;
              } else {
                if (!sk.field_c) {
                  lb.field_g = 4000L + kh.a(-61);
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
          throw pn.a((Throwable) (Object) runtimeException, "vb.stop()");
        }
    }

    abstract void e(int param0);

    final synchronized void b(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null == ci.field_f) {
                break L1;
              } else {
                ci.field_f.removeFocusListener((java.awt.event.FocusListener) this);
                ci.field_f.getParent().setBackground(java.awt.Color.black);
                ci.field_f.getParent().remove((java.awt.Component) (Object) ci.field_f);
                break L1;
              }
            }
            L2: {
              L3: {
                if (ku.field_f == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) ku.field_f;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (null == si.field_d) {
                  break L4;
                } else {
                  var2 = (Object) (Object) si.field_d;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              L5: {
                if (hu.field_a != null) {
                  break L5;
                } else {
                  var2 = (Object) (Object) gh.field_f;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L5;
                  }
                }
              }
              var2 = (Object) (Object) hu.field_a;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                ci.field_f = (java.awt.Canvas) (Object) new gj((java.awt.Component) this);
                java.awt.Component discarded$1 = ((java.awt.Container) var2).add((java.awt.Component) (Object) ci.field_f);
                ci.field_f.setSize(td.field_b, ps.field_h);
                ci.field_f.setVisible(true);
                if ((Object) (Object) si.field_d == var2) {
                  break L7;
                } else {
                  ci.field_f.setLocation(ci.field_g, jt.field_x);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              var3 = si.field_d.getInsets();
              ci.field_f.setLocation(ci.field_g + var3.left, var3.top - -jt.field_x);
              break L6;
            }
            L8: {
              ci.field_f.addFocusListener((java.awt.event.FocusListener) this);
              ci.field_f.requestFocus();
              na.field_a = true;
              im.field_e = true;
              AceOfSkies.field_J = true;
              if (param0 == -14829) {
                break L8;
              } else {
                ((vb) this).windowDeiconified((java.awt.event.WindowEvent) null);
                break L8;
              }
            }
            or.field_c = false;
            mg.field_b = kh.a(param0 + 14763);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw pn.a((Throwable) var2, "vb.MA(" + param0 + ')');
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
            hu.field_a = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("vb.provideLoaderApplet(");
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_25_0 = null;
        StringBuilder stackOut_25_1 = null;
        String stackOut_25_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) gh.field_f != this) {
                break L1;
              } else {
                if (sk.field_c) {
                  break L1;
                } else {
                  L2: {
                    AceOfSkies.field_J = true;
                    if (!rl.field_p) {
                      break L2;
                    } else {
                      if (-mg.field_b + kh.a(-67) <= 1000L) {
                        break L2;
                      } else {
                        L3: {
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if (nj.field_e > var2.width) {
                              break L2;
                            } else {
                              if (~hb.field_b >= ~var2.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        or.field_c = true;
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
            var2_ref = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2_ref;
            stackOut_22_1 = new StringBuilder().append("vb.paint(");
            stackIn_25_0 = stackOut_22_0;
            stackIn_25_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_25_0 = (RuntimeException) (Object) stackIn_25_0;
              stackOut_25_1 = (StringBuilder) (Object) stackIn_25_1;
              stackOut_25_2 = "null";
              stackIn_26_0 = stackOut_25_0;
              stackIn_26_1 = stackOut_25_1;
              stackIn_26_2 = stackOut_25_2;
              break L4;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_26_0 = stackOut_23_0;
              stackIn_26_1 = stackOut_23_1;
              stackIn_26_2 = stackOut_23_2;
              break L4;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_26_0, stackIn_26_2 + ')');
        }
    }

    public static void b(byte param0) {
        try {
            field_o = null;
            int var1_int = -69 % ((18 - param0) / 42);
            field_l = null;
        } catch (RuntimeException runtimeException) {
            throw pn.a((Throwable) (Object) runtimeException, "vb.PA(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
            if (si.field_d != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == hu.field_a) {
                  break L1;
                } else {
                  if ((Object) (Object) hu.field_a != this) {
                    stackOut_11_0 = hu.field_a.getParameter(param0);
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
            stackOut_15_1 = new StringBuilder().append("vb.getParameter(");
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
          throw pn.a((Throwable) (Object) stackIn_19_0, stackIn_19_2 + ')');
        }
        return stackIn_14_0;
    }

    final static void a(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_o = null;
                break L1;
              }
            }
            fj.field_a = nm.field_c.h(-17883);
            cf.field_h = vu.a(125, (CharSequence) (Object) fj.field_a);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var1, "vb.OA(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != si.field_d) {
          return null;
        } else {
          L0: {
            if (hu.field_a == null) {
              break L0;
            } else {
              if (this == (Object) (Object) hu.field_a) {
                break L0;
              } else {
                return hu.field_a.getCodeBase();
              }
            }
          }
          return super.getCodeBase();
        }
    }

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
            if (si.field_d == null) {
              L1: {
                if (hu.field_a == null) {
                  break L1;
                } else {
                  if (this != (Object) (Object) hu.field_a) {
                    stackOut_9_0 = hu.field_a.getAppletContext();
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
          throw pn.a((Throwable) (Object) var1, "vb.getAppletContext()");
        }
        return stackIn_12_0;
    }

    private final void a() {
        int var2_int = 0;
        RuntimeException var2 = null;
        long var3 = 0L;
        long var5 = 0L;
        int var7_int = 0;
        java.awt.Insets var7 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var3 = kh.a(-86);
              var5 = pn.field_b[ce.field_A];
              pn.field_b[ce.field_A] = var3;
              ce.field_A = 31 & ce.field_A - -1;
              if (var5 == 0L) {
                break L1;
              } else {
                if (~var3 < ~var5) {
                  var7_int = (int)(-var5 + var3);
                  wk.field_f = (32000 + (var7_int >> 1)) / var7_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$1 = iu.field_g;
              iu.field_g = iu.field_g + 1;
              if (fieldTemp$1 > 50) {
                L3: {
                  AceOfSkies.field_J = true;
                  iu.field_g = iu.field_g - 50;
                  ci.field_f.setSize(td.field_b, ps.field_h);
                  ci.field_f.setVisible(true);
                  if (null == si.field_d) {
                    break L3;
                  } else {
                    if (null != ku.field_f) {
                      break L3;
                    } else {
                      var7 = si.field_d.getInsets();
                      ci.field_f.setLocation(ci.field_g + var7.left, var7.top - -jt.field_x);
                      if (!AceOfSkies.field_G) {
                        break L2;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                ci.field_f.setLocation(ci.field_g, jt.field_x);
                break L2;
              } else {
                break L2;
              }
            }
            ((vb) this).e(150);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (Object) var2, "vb.KA(" + 118 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
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
                if (sk.field_c) {
                  return;
                } else {
                  sk.field_c = true;
                  break L1;
                }
              }
            }
            L2: {
              if (null == hu.field_a) {
                break L2;
              } else {
                hu.field_a.destroy();
                break L2;
              }
            }
            try {
              L3: {
                ((vb) this).f(-123);
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
              if (null == ci.field_f) {
                break L5;
              } else {
                try {
                  L6: {
                    ci.field_f.removeFocusListener((java.awt.event.FocusListener) this);
                    ci.field_f.getParent().remove((java.awt.Component) (Object) ci.field_f);
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
              if (pt.field_b != null) {
                try {
                  L9: {
                    pt.field_b.b(-115);
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
              ((vb) this).d(19469);
              if (si.field_d == null) {
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
            var3_int = -103 / ((-36 - param1) / 54);
            System.out.println("Shutdown complete - clean:" + param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "vb.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c() {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        long var3 = 0L;
        long var5 = 0L;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = 0;
              var3 = kh.a(-69);
              var5 = ob.field_c[ur.field_a];
              ob.field_c[ur.field_a] = var3;
              if (var5 == 0L) {
                break L1;
              } else {
                if (var3 <= var5) {
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            ur.field_a = 31 & ur.field_a - -1;
            var7 = this;
            synchronized (var7) {
              L2: {
                im.field_e = na.field_a;
                break L2;
              }
            }
            ((vb) this).c(5883);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) (Object) runtimeException, "vb.RA(" + 111 + ')');
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
            ((vb) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("vb.windowClosing(");
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final void a(int param0, String param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            RuntimeException stackIn_17_0 = null;
            StringBuilder stackIn_17_1 = null;
            String stackIn_17_2 = null;
            Throwable decompiledCaughtException = null;
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
                if (((vb) this).field_e) {
                  return;
                } else {
                  ((vb) this).field_e = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      L2: {
                        if (param0 < -102) {
                          break L2;
                        } else {
                          field_l = null;
                          break L2;
                        }
                      }
                      Object discarded$1 = fe.a("loggedout", (byte) -108, bm.m(107));
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
                      ((vb) this).getAppletContext().showDocument(new java.net.URL(((vb) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              L6: {
                var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_13_0 = (RuntimeException) var3_ref2;
                stackOut_13_1 = new StringBuilder().append("vb.LA(").append(param0).append(',');
                stackIn_16_0 = stackOut_13_0;
                stackIn_16_1 = stackOut_13_1;
                stackIn_14_0 = stackOut_13_0;
                stackIn_14_1 = stackOut_13_1;
                if (param1 == null) {
                  stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
                  stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
                  stackOut_16_2 = "null";
                  stackIn_17_0 = stackOut_16_0;
                  stackIn_17_1 = stackOut_16_1;
                  stackIn_17_2 = stackOut_16_2;
                  break L6;
                } else {
                  stackOut_14_0 = (RuntimeException) (Object) stackIn_14_0;
                  stackOut_14_1 = (StringBuilder) (Object) stackIn_14_1;
                  stackOut_14_2 = "{...}";
                  stackIn_17_0 = stackOut_14_0;
                  stackIn_17_1 = stackOut_14_1;
                  stackIn_17_2 = stackOut_14_2;
                  break L6;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
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
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) gh.field_f) {
                break L1;
              } else {
                if (!sk.field_c) {
                  lb.field_g = kh.a(-96);
                  int discarded$2 = 0;
                  wf.a(5000L);
                  mj.field_a = null;
                  this.a(false, (byte) 29);
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
          throw pn.a((Throwable) (Object) runtimeException, "vb.destroy()");
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) gh.field_f) {
                break L1;
              } else {
                if (!sk.field_c) {
                  lb.field_g = 0L;
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
          throw pn.a((Throwable) (Object) runtimeException, "vb.start()");
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
            if (null == si.field_d) {
              L1: {
                if (hu.field_a == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) hu.field_a) {
                    break L1;
                  } else {
                    stackOut_7_0 = hu.field_a.getDocumentBase();
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
          throw pn.a((Throwable) (Object) var1, "vb.getDocumentBase()");
        }
        return stackIn_10_0;
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
            boolean stackIn_50_0 = false;
            boolean stackIn_68_0 = false;
            int stackIn_73_0 = 0;
            int stackIn_73_1 = 0;
            int stackIn_81_0 = 0;
            int stackIn_81_1 = 0;
            int stackIn_95_0 = 0;
            int stackIn_100_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_49_0 = false;
            boolean stackOut_66_0 = false;
            int stackOut_72_0 = 0;
            int stackOut_72_1 = 0;
            int stackOut_80_0 = 0;
            int stackOut_80_1 = 0;
            int stackOut_94_0 = 0;
            int stackOut_98_0 = 0;
            var5 = AceOfSkies.field_G ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (rk.field_o != null) {
                              L6: {
                                var1 = (Object) (Object) rk.field_o.toLowerCase();
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
                                  var2 = rk.field_l;
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
                                ((vb) this).a(-119, "wrongjava");
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
                                    if (~var3 <= ~var2.length()) {
                                      break L10;
                                    } else {
                                      stackOut_49_0 = oj.a(var2.charAt(var3), (byte) -2);
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
                                  if (!vl.a(10, (CharSequence) (Object) var4)) {
                                    break L5;
                                  } else {
                                    int discarded$4 = 38;
                                    if (td.a((CharSequence) (Object) var4) < 10) {
                                      ((vb) this).a(-111, "wrongjava");
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
                          if (rk.field_l == null) {
                            break L3;
                          } else {
                            stackOut_66_0 = rk.field_l.startsWith("1.");
                            stackIn_68_0 = stackOut_66_0;
                            break L4;
                          }
                        }
                        if (stackIn_68_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (var1_int >= rk.field_l.length()) {
                                  break L13;
                                } else {
                                  var3 = rk.field_l.charAt(var1_int);
                                  stackOut_72_0 = -49;
                                  stackOut_72_1 = ~var3;
                                  stackIn_81_0 = stackOut_72_0;
                                  stackIn_81_1 = stackOut_72_1;
                                  stackIn_73_0 = stackOut_72_0;
                                  stackIn_73_1 = stackOut_72_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_73_0 < stackIn_73_1) {
                                      break L13;
                                    } else {
                                      if (57 < var3) {
                                        break L13;
                                      } else {
                                        var2_int = -48 - (-var3 - var2_int * 10);
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
                              }
                              stackOut_80_0 = ~var2_int;
                              stackOut_80_1 = -6;
                              stackIn_81_0 = stackOut_80_0;
                              stackIn_81_1 = stackOut_80_1;
                              break L12;
                            }
                            if (stackIn_81_0 <= stackIn_81_1) {
                              rl.field_p = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L14: {
                        var1 = (Object) (Object) gh.field_f;
                        if (null == hu.field_a) {
                          break L14;
                        } else {
                          var1 = (Object) (Object) hu.field_a;
                          break L14;
                        }
                      }
                      L15: {
                        var2_ref = rk.field_e;
                        if (var2_ref != null) {
                          try {
                            L16: {
                              Object discarded$5 = var2_ref.invoke(var1, new Object[1]);
                              break L16;
                            }
                          } catch (java.lang.Throwable decompiledCaughtParameter0) {
                            decompiledCaughtException = decompiledCaughtParameter0;
                            L17: {
                              var3_ref_Throwable = decompiledCaughtException;
                              break L17;
                            }
                          }
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      qp.a(34069);
                      ((vb) this).b(-14829);
                      cl.field_fb = qd.a((java.awt.Component) (Object) ci.field_f, true, ps.field_h, td.field_b);
                      ((vb) this).a(28060);
                      io.field_c = ij.c(8194);
                      L18: while (true) {
                        L19: {
                          L20: {
                            if (lb.field_g == 0L) {
                              break L20;
                            } else {
                              stackOut_94_0 = (kh.a(-125) < lb.field_g ? -1 : (kh.a(-125) == lb.field_g ? 0 : 1));
                              stackIn_100_0 = stackOut_94_0;
                              stackIn_95_0 = stackOut_94_0;
                              if (var5 != 0) {
                                break L19;
                              } else {
                                if (stackIn_95_0 >= 0) {
                                  break L2;
                                } else {
                                  break L20;
                                }
                              }
                            }
                          }
                          eu.field_g = io.field_c.a(ld.field_b, (byte) -18);
                          stackOut_98_0 = 0;
                          stackIn_100_0 = stackOut_98_0;
                          break L19;
                        }
                        var3 = stackIn_100_0;
                        L21: while (true) {
                          L22: {
                            L23: {
                              if (eu.field_g <= var3) {
                                break L23;
                              } else {
                                int discarded$6 = 111;
                                this.c();
                                var3++;
                                if (var5 != 0) {
                                  break L22;
                                } else {
                                  if (var5 == 0) {
                                    continue L21;
                                  } else {
                                    break L23;
                                  }
                                }
                              }
                            }
                            int discarded$7 = 118;
                            this.a();
                            rb.a(-116, (Object) (Object) ci.field_f, pt.field_b);
                            break L22;
                          }
                          if (var5 == 0) {
                            continue L18;
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
                  L24: {
                    var1 = (Object) (Object) decompiledCaughtException;
                    v.a((String) null, (byte) -52, (Throwable) var1);
                    ((vb) this).a(-107, "crash");
                    break L24;
                  }
                }
                this.a(true, (byte) 82);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw pn.a((Throwable) var1, "vb.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            ((vb) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("vb.update(");
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
          L0: {
            na.field_a = true;
            AceOfSkies.field_J = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("vb.focusGained(");
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void f(int param0);

    abstract void d(int param0);

    abstract void c(int param0);

    final boolean b(boolean param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            en var8_ref2 = null;
            int var9 = 0;
            RuntimeException stackIn_21_0 = null;
            StringBuilder stackIn_21_1 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            String stackIn_24_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_20_0 = null;
            StringBuilder stackOut_20_1 = null;
            RuntimeException stackOut_23_0 = null;
            StringBuilder stackOut_23_1 = null;
            String stackOut_23_2 = null;
            RuntimeException stackOut_21_0 = null;
            StringBuilder stackOut_21_1 = null;
            String stackOut_21_2 = null;
            var9 = AceOfSkies.field_G ? 1 : 0;
            try {
              try {
                L0: {
                  if (null == gh.field_f) {
                    bs.field_c = param4;
                    ps.field_h = param5;
                    hb.field_b = param5;
                    gh.field_f = (vb) this;
                    td.field_b = param0;
                    nj.field_e = param0;
                    ci.field_g = param1;
                    jt.field_x = 0;
                    fb.field_c = bm.m(124);
                    rk dupTemp$2 = new rk(param6, param3, param2, true);
                    pt.field_b = dupTemp$2;
                    mj.field_a = dupTemp$2;
                    var8_ref2 = pt.field_b.a(1, 1048576, (Runnable) this);
                    L1: while (true) {
                      L2: {
                        L3: {
                          if (var8_ref2.field_a != 0) {
                            break L3;
                          } else {
                            int discarded$3 = 0;
                            wf.a(10L);
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
                  } else {
                    cd.field_b = cd.field_b + 1;
                    if (cd.field_b >= 3) {
                      ((vb) this).a(-110, "alreadyloaded");
                      return;
                    } else {
                      ((vb) this).getAppletContext().showDocument(((vb) this).getDocumentBase(), "_self");
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var8 = decompiledCaughtException;
                  v.a((String) null, (byte) -52, var8);
                  ((vb) this).a(param1 ^ -119, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_20_0 = (RuntimeException) var8_ref;
                stackOut_20_1 = new StringBuilder().append("vb.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
                stackIn_23_0 = stackOut_20_0;
                stackIn_23_1 = stackOut_20_1;
                stackIn_21_0 = stackOut_20_0;
                stackIn_21_1 = stackOut_20_1;
                if (param3 == null) {
                  stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
                  stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
                  stackOut_23_2 = "null";
                  stackIn_24_0 = stackOut_23_0;
                  stackIn_24_1 = stackOut_23_1;
                  stackIn_24_2 = stackOut_23_2;
                  break L5;
                } else {
                  stackOut_21_0 = (RuntimeException) (Object) stackIn_21_0;
                  stackOut_21_1 = (StringBuilder) (Object) stackIn_21_1;
                  stackOut_21_2 = "{...}";
                  stackIn_24_0 = stackOut_21_0;
                  stackIn_24_1 = stackOut_21_1;
                  stackIn_24_2 = stackOut_21_2;
                  break L5;
                }
              }
              throw pn.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
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
            na.field_a = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("vb.focusLost(");
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
          throw pn.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    protected vb() {
        ((vb) this).field_e = false;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = new pt();
    }
}
