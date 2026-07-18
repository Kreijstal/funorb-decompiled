/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.applet.AppletContext;
import java.net.URL;

public abstract class fa extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static vd field_i;
    boolean field_j;
    static int field_f;
    static String field_g;
    public static boolean field_b;
    public static int field_c;
    public static boolean field_h;
    public static int field_k;
    public static boolean field_a;
    public static boolean field_d;
    public static boolean field_e;

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    private final void a() {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7_int = 0;
        Object var7 = null;
        Throwable var8 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              var2_int = -20;
              var3 = lk.a(0);
              var5 = ik.field_ib[td.field_a];
              ik.field_ib[td.field_a] = var3;
              if (var5 == 0L) {
                break L1;
              } else {
                if (var3 > var5) {
                  var7_int = (int)(-var5 + var3);
                  oc.field_y = (32000 + (var7_int >> 1)) / var7_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            td.field_a = 1 + td.field_a & 31;
            var7 = this;
            synchronized (var7) {
              L2: {
                rj.field_b = bi.field_M;
                break L2;
              }
            }
            ((fa) this).b((byte) -111);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) (Object) runtimeException, "fa.V(" + -98 + ')');
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
            bi.field_M = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fa.focusLost(");
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
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    final boolean c(byte param0) {
        return true;
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
            if (aj.field_t != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (java.applet.AppletContext) (Object) stackIn_4_0;
            } else {
              L1: {
                if (null == i.field_f) {
                  break L1;
                } else {
                  if ((Object) (Object) i.field_f == this) {
                    break L1;
                  } else {
                    stackOut_9_0 = i.field_f.getAppletContext();
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
          throw ch.a((Throwable) (Object) var1, "fa.getAppletContext()");
        }
        return stackIn_12_0;
    }

    public static void f(int param0) {
        try {
            field_i = null;
            field_g = null;
            int var1_int = -65 / ((param0 - -30) / 46);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "fa.P(" + param0 + ')');
        }
    }

    final static od a(int param0, hb param1, byte param2, int param3) {
        RuntimeException var4 = null;
        od stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        od stackOut_3_0 = null;
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
              if (param2 > 124) {
                break L1;
              } else {
                od discarded$2 = fa.a(-14, (hb) null, (byte) -35, 21);
                break L1;
              }
            }
            stackOut_3_0 = ql.a(123, param3, 96, param1, param0);
            stackIn_4_0 = stackOut_3_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var4;
            stackOut_5_1 = new StringBuilder().append("fa.U(").append(param0).append(',');
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
          throw ch.a((Throwable) (Object) stackIn_9_0, stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
        }
        return stackIn_4_0;
    }

    abstract void b(byte param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
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
            if (aj.field_t == null) {
              L1: {
                if (i.field_f == null) {
                  break L1;
                } else {
                  if ((Object) (Object) i.field_f == this) {
                    break L1;
                  } else {
                    stackOut_7_0 = i.field_f.getDocumentBase();
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
          throw ch.a((Throwable) (Object) var1, "fa.getDocumentBase()");
        }
        return stackIn_10_0;
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              if (null != gd.field_k) {
                gd.field_k.removeFocusListener((java.awt.event.FocusListener) this);
                gd.field_k.getParent().setBackground(java.awt.Color.black);
                gd.field_k.getParent().remove((java.awt.Component) (Object) gd.field_k);
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              L3: {
                if (nf.field_e == null) {
                  break L3;
                } else {
                  var2 = (Object) (Object) nf.field_e;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (aj.field_t != null) {
                  break L4;
                } else {
                  L5: {
                    if (null != i.field_f) {
                      break L5;
                    } else {
                      var2 = (Object) (Object) wi.field_f;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = (Object) (Object) i.field_f;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = (Object) (Object) aj.field_t;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) var2).setLayout((java.awt.LayoutManager) null);
                gd.field_k = (java.awt.Canvas) (Object) new ah((java.awt.Component) this);
                java.awt.Component discarded$6 = ((java.awt.Container) var2).add((java.awt.Component) (Object) gd.field_k);
                gd.field_k.setSize(fk.field_E, mk.field_x);
                gd.field_k.setVisible(true);
                if ((Object) (Object) aj.field_t != var2) {
                  break L7;
                } else {
                  var3 = aj.field_t.getInsets();
                  gd.field_k.setLocation(var3.left + gl.field_D, var3.top - -uc.field_a);
                  if (var4 == 0) {
                    break L6;
                  } else {
                    break L7;
                  }
                }
              }
              gd.field_k.setLocation(gl.field_D, uc.field_a);
              break L6;
            }
            gd.field_k.addFocusListener((java.awt.event.FocusListener) this);
            gd.field_k.requestFocus();
            rj.field_b = true;
            bi.field_M = true;
            kb.field_l = true;
            mg.field_c = param0;
            tg.field_b = lk.a(0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (Object) (Object) decompiledCaughtException;
          throw ch.a((Throwable) var2, "fa.N(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) wi.field_f != this) {
                break L1;
              } else {
                if (gh.field_i) {
                  break L1;
                } else {
                  lb.field_b = lk.a(0) + 4000L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ch.a((Throwable) (Object) runtimeException, "fa.stop()");
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
              if (this != (Object) (Object) wi.field_f) {
                break L1;
              } else {
                if (!gh.field_i) {
                  L2: {
                    kb.field_l = true;
                    if (!pg.field_a) {
                      break L2;
                    } else {
                      if (lk.a(0) - tg.field_b > 1000L) {
                        L3: {
                          var2_ref = param0.getClipBounds();
                          if (var2_ref == null) {
                            break L3;
                          } else {
                            if (~ch.field_b < ~var2_ref.width) {
                              break L2;
                            } else {
                              if (~uh.field_j >= ~var2_ref.height) {
                                break L3;
                              } else {
                                break L2;
                              }
                            }
                          }
                        }
                        mg.field_c = true;
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
            stackOut_20_1 = new StringBuilder().append("fa.paint(");
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
          throw ch.a((Throwable) (Object) stackIn_24_0, stackIn_24_2 + ')');
        }
    }

    private final void a(boolean param0, boolean param1) {
        Object var3 = null;
        Exception var3_ref = null;
        Throwable var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        Throwable var4 = null;
        Throwable decompiledCaughtException = null;
        try {
          L0: {
            var3 = this;
            synchronized (var3) {
              L1: {
                if (!gh.field_i) {
                  gh.field_i = true;
                  break L1;
                } else {
                  return;
                }
              }
            }
            L2: {
              if (i.field_f == null) {
                break L2;
              } else {
                i.field_f.destroy();
                break L2;
              }
            }
            try {
              L3: {
                ((fa) this).e(0);
                break L3;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              L4: {
                var3_ref = (Exception) (Object) decompiledCaughtException;
                break L4;
              }
            }
            L5: {
              if (gd.field_k != null) {
                try {
                  L6: {
                    gd.field_k.removeFocusListener((java.awt.event.FocusListener) this);
                    gd.field_k.getParent().remove((java.awt.Component) (Object) gd.field_k);
                    break L6;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter1) {
                  decompiledCaughtException = decompiledCaughtParameter1;
                  L7: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    break L7;
                  }
                }
                break L5;
              } else {
                break L5;
              }
            }
            L8: {
              if (lk.field_b == null) {
                break L8;
              } else {
                try {
                  L9: {
                    lk.field_b.a((byte) -23);
                    break L9;
                  }
                } catch (java.lang.Exception decompiledCaughtParameter2) {
                  decompiledCaughtException = decompiledCaughtParameter2;
                  L10: {
                    var3_ref = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              }
            }
            L11: {
              ((fa) this).c(3);
              if (aj.field_t != null) {
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
          var3_ref3 = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) (Object) var3_ref3, "fa.O(" + false + ',' + param1 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != (Object) (Object) wi.field_f) {
                break L1;
              } else {
                if (gh.field_i) {
                  break L1;
                } else {
                  lb.field_b = 0L;
                  break L0;
                }
              }
            }
            return;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ch.a((Throwable) (Object) runtimeException, "fa.start()");
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
            ((fa) this).paint(param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fa.update(");
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
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            i.field_f = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fa.provideLoaderApplet(");
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
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void b(int param0);

    private final void d() {
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            var2_long = lk.a(0);
            var4 = kd.field_b[kh.field_b];
            kd.field_b[kh.field_b] = var2_long;
            kh.field_b = 31 & kh.field_b - -1;
            L1: {
              if (var4 == 0L) {
                break L1;
              } else {
                if (var4 < var2_long) {
                  var6_int = (int)(var2_long + -var4);
                  ub.field_a = ((var6_int >> 1) + 32000) / var6_int;
                  break L1;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              int fieldTemp$1 = ak.field_a;
              ak.field_a = ak.field_a + 1;
              if (50 >= fieldTemp$1) {
                break L2;
              } else {
                L3: {
                  L4: {
                    kb.field_l = true;
                    ak.field_a = ak.field_a - 50;
                    gd.field_k.setSize(fk.field_E, mk.field_x);
                    gd.field_k.setVisible(true);
                    if (null == aj.field_t) {
                      break L4;
                    } else {
                      if (nf.field_e == null) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  gd.field_k.setLocation(gl.field_D, uc.field_a);
                  if (!Transmogrify.field_A) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
                var6 = aj.field_t.getInsets();
                gd.field_k.setLocation(gl.field_D + var6.left, var6.top + uc.field_a);
                break L2;
              }
            }
            ((fa) this).b(15648);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (Object) var2, "fa.Q(" + -58 + ')');
        }
    }

    public abstract void init();

    public final java.net.URL getCodeBase() {
        RuntimeException var1 = null;
        if (null != aj.field_t) {
          return null;
        } else {
          L0: {
            if (i.field_f == null) {
              break L0;
            } else {
              if (this != (Object) (Object) i.field_f) {
                return i.field_f.getCodeBase();
              } else {
                break L0;
              }
            }
          }
          return super.getCodeBase();
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
            bi.field_M = true;
            kb.field_l = true;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fa.focusGained(");
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
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
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
            boolean stackIn_52_0 = false;
            boolean stackIn_70_0 = false;
            int stackIn_75_0 = 0;
            int stackIn_75_1 = 0;
            int stackIn_86_0 = 0;
            int stackIn_86_1 = 0;
            int stackIn_100_0 = 0;
            int stackIn_105_0 = 0;
            Throwable decompiledCaughtException = null;
            boolean stackOut_51_0 = false;
            boolean stackOut_68_0 = false;
            int stackOut_74_0 = 0;
            int stackOut_74_1 = 0;
            int stackOut_85_0 = 0;
            int stackOut_85_1 = 0;
            int stackOut_99_0 = 0;
            int stackOut_103_0 = 0;
            var5 = Transmogrify.field_A ? 1 : 0;
            try {
              L0: {
                try {
                  L1: {
                    L2: {
                      L3: {
                        L4: {
                          L5: {
                            if (null != fe.field_w) {
                              L6: {
                                var1 = (Object) (Object) fe.field_w.toLowerCase();
                                if (((String) var1).indexOf("sun") != -1) {
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
                                  var2 = fe.field_c;
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
                                ((fa) this).a((byte) -127, "wrongjava");
                                if (var5 == 0) {
                                  break L2;
                                } else {
                                  break L7;
                                }
                              }
                              if (var2.startsWith("1.6.0_")) {
                                var3 = 6;
                                L9: while (true) {
                                  L10: {
                                    if (var2.length() <= var3) {
                                      break L10;
                                    } else {
                                      int discarded$6 = 1;
                                      stackOut_51_0 = dj.a(var2.charAt(var3));
                                      stackIn_70_0 = stackOut_51_0;
                                      stackIn_52_0 = stackOut_51_0;
                                      if (var5 != 0) {
                                        break L4;
                                      } else {
                                        if (!stackIn_52_0) {
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
                                  if (!qj.a((CharSequence) (Object) var4, 110)) {
                                    break L5;
                                  } else {
                                    if (aa.a(-97, (CharSequence) (Object) var4) >= 10) {
                                      break L5;
                                    } else {
                                      ((fa) this).a((byte) -127, "wrongjava");
                                      if (var5 == 0) {
                                        break L2;
                                      } else {
                                        break L5;
                                      }
                                    }
                                  }
                                }
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          if (null == fe.field_c) {
                            break L3;
                          } else {
                            stackOut_68_0 = fe.field_c.startsWith("1.");
                            stackIn_70_0 = stackOut_68_0;
                            break L4;
                          }
                        }
                        if (stackIn_70_0) {
                          var1_int = 2;
                          var2_int = 0;
                          L11: while (true) {
                            L12: {
                              L13: {
                                if (fe.field_c.length() <= var1_int) {
                                  break L13;
                                } else {
                                  var3 = fe.field_c.charAt(var1_int);
                                  stackOut_74_0 = ~var3;
                                  stackOut_74_1 = -49;
                                  stackIn_86_0 = stackOut_74_0;
                                  stackIn_86_1 = stackOut_74_1;
                                  stackIn_75_0 = stackOut_74_0;
                                  stackIn_75_1 = stackOut_74_1;
                                  if (var5 != 0) {
                                    break L12;
                                  } else {
                                    if (stackIn_75_0 > stackIn_75_1) {
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
                                      var2_int = var3 - 48 + var2_int * 10;
                                      if (var5 == 0) {
                                        continue L11;
                                      } else {
                                        break L13;
                                      }
                                    }
                                  }
                                }
                              }
                              stackOut_85_0 = 5;
                              stackOut_85_1 = var2_int;
                              stackIn_86_0 = stackOut_85_0;
                              stackIn_86_1 = stackOut_85_1;
                              break L12;
                            }
                            if (stackIn_86_0 <= stackIn_86_1) {
                              pg.field_a = true;
                              break L3;
                            } else {
                              break L3;
                            }
                          }
                        } else {
                          break L3;
                        }
                      }
                      L15: {
                        var1 = (Object) (Object) wi.field_f;
                        if (null != i.field_f) {
                          var1 = (Object) (Object) i.field_f;
                          break L15;
                        } else {
                          break L15;
                        }
                      }
                      L16: {
                        var2_ref = fe.field_x;
                        if (null == var2_ref) {
                          break L16;
                        } else {
                          try {
                            L17: {
                              Object discarded$7 = var2_ref.invoke(var1, new Object[1]);
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
                      int discarded$8 = -124;
                      wb.a();
                      ((fa) this).a(false);
                      ri.field_k = wc.a(4, (java.awt.Component) (Object) gd.field_k, mk.field_x, fk.field_E);
                      ((fa) this).a(-9);
                      int discarded$9 = 0;
                      th.field_c = oc.j();
                      L19: while (true) {
                        L20: {
                          L21: {
                            if (lb.field_b == 0L) {
                              break L21;
                            } else {
                              stackOut_99_0 = (~lb.field_b < ~lk.a(0) ? -1 : (~lb.field_b == ~lk.a(0) ? 0 : 1));
                              stackIn_105_0 = stackOut_99_0;
                              stackIn_100_0 = stackOut_99_0;
                              if (var5 != 0) {
                                break L20;
                              } else {
                                if (stackIn_100_0 >= 0) {
                                  break L2;
                                } else {
                                  break L21;
                                }
                              }
                            }
                          }
                          ca.field_b = th.field_c.a((byte) -117, fg.field_j);
                          stackOut_103_0 = 0;
                          stackIn_105_0 = stackOut_103_0;
                          break L20;
                        }
                        var3 = stackIn_105_0;
                        L22: while (true) {
                          L23: {
                            L24: {
                              if (~ca.field_b >= ~var3) {
                                break L24;
                              } else {
                                int discarded$10 = -98;
                                this.a();
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
                            int discarded$11 = -58;
                            this.d();
                            db.a(lk.field_b, (Object) (Object) gd.field_k, -85);
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
                    d.a((Throwable) var1, 1, (String) null);
                    ((fa) this).a((byte) -113, "crash");
                    break L25;
                  }
                }
                this.a(false, true);
                break L0;
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (Object) (Object) decompiledCaughtException;
              throw ch.a((Throwable) var1, "fa.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected fa() {
        ((fa) this).field_j = false;
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if ((Object) (Object) wi.field_f != this) {
                break L1;
              } else {
                if (!gh.field_i) {
                  lb.field_b = lk.a(0);
                  pg.a(5000L, -120);
                  f.field_b = null;
                  this.a(false, false);
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
          throw ch.a((Throwable) (Object) runtimeException, "fa.destroy()");
        }
    }

    final void a(byte param0, String param1) {
        try {
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            RuntimeException stackIn_13_0 = null;
            StringBuilder stackIn_13_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            RuntimeException stackIn_16_0 = null;
            StringBuilder stackIn_16_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            RuntimeException stackOut_12_0 = null;
            StringBuilder stackOut_12_1 = null;
            RuntimeException stackOut_15_0 = null;
            StringBuilder stackOut_15_1 = null;
            String stackOut_15_2 = null;
            RuntimeException stackOut_13_0 = null;
            StringBuilder stackOut_13_1 = null;
            String stackOut_13_2 = null;
            try {
              L0: {
                if (!((fa) this).field_j) {
                  L1: {
                    ((fa) this).field_j = true;
                    System.out.println("error_game_" + param1);
                    if (param0 < -90) {
                      break L1;
                    } else {
                      field_i = null;
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      Object discarded$1 = kj.a(ha.b(74), false, "loggedout");
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
                      ((fa) this).getAppletContext().showDocument(new java.net.URL(((fa) this).getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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
                stackOut_12_0 = (RuntimeException) var3_ref2;
                stackOut_12_1 = new StringBuilder().append("fa.S(").append(param0).append(',');
                stackIn_15_0 = stackOut_12_0;
                stackIn_15_1 = stackOut_12_1;
                stackIn_13_0 = stackOut_12_0;
                stackIn_13_1 = stackOut_12_1;
                if (param1 == null) {
                  stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
                  stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
                  stackOut_15_2 = "null";
                  stackIn_16_0 = stackOut_15_0;
                  stackIn_16_1 = stackOut_15_1;
                  stackIn_16_2 = stackOut_15_2;
                  break L6;
                } else {
                  stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
                  stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
                  stackOut_13_2 = "{...}";
                  stackIn_16_0 = stackOut_13_0;
                  stackIn_16_1 = stackOut_13_1;
                  stackIn_16_2 = stackOut_13_2;
                  break L6;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_16_0, stackIn_16_2 + ')');
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
            ((fa) this).destroy();
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackOut_2_0 = (RuntimeException) runtimeException;
            stackOut_2_1 = new StringBuilder().append("fa.windowClosing(");
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
          throw ch.a((Throwable) (Object) stackIn_6_0, stackIn_6_2 + ')');
        }
    }

    abstract void a(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
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
        Object stackOut_3_0 = null;
        String stackOut_9_0 = null;
        String stackOut_11_0 = null;
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
            if (aj.field_t != null) {
              stackOut_3_0 = null;
              stackIn_4_0 = stackOut_3_0;
              return (String) (Object) stackIn_4_0;
            } else {
              L1: {
                if (i.field_f == null) {
                  break L1;
                } else {
                  if (this == (Object) (Object) i.field_f) {
                    break L1;
                  } else {
                    stackOut_9_0 = i.field_f.getParameter(param0);
                    stackIn_10_0 = stackOut_9_0;
                    return stackIn_10_0;
                  }
                }
              }
              stackOut_11_0 = super.getParameter(param0);
              stackIn_12_0 = stackOut_11_0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackOut_13_0 = (RuntimeException) var2;
            stackOut_13_1 = new StringBuilder().append("fa.getParameter(");
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
          throw ch.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + ')');
        }
        return stackIn_12_0;
    }

    final void a(byte param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            Throwable var8 = null;
            RuntimeException var8_ref = null;
            ib var8_ref2 = null;
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
            var9 = Transmogrify.field_A ? 1 : 0;
            try {
              try {
                L0: {
                  if (null != wi.field_f) {
                    bh.field_c = bh.field_c + 1;
                    if (bh.field_c >= 3) {
                      ((fa) this).a((byte) -94, "alreadyloaded");
                      return;
                    } else {
                      ((fa) this).getAppletContext().showDocument(((fa) this).getDocumentBase(), "_self");
                      return;
                    }
                  } else {
                    wi.field_f = (fa) this;
                    gl.field_D = 0;
                    uc.field_a = 0;
                    mk.field_x = param1;
                    uh.field_j = param1;
                    fk.field_E = param6;
                    ch.field_b = param6;
                    gh.field_h = param3;
                    re.field_i = ha.b(108);
                    fe dupTemp$1 = new fe(param5, param2, param4, true);
                    lk.field_b = dupTemp$1;
                    f.field_b = dupTemp$1;
                    var8_ref2 = lk.field_b.a((Runnable) this, 1, 65535);
                    if (param0 == 79) {
                      L1: while (true) {
                        L2: {
                          L3: {
                            if (var8_ref2.field_c != 0) {
                              break L3;
                            } else {
                              pg.a(10L, -82);
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
                      return;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                L4: {
                  var8 = decompiledCaughtException;
                  d.a(var8, -124, (String) null);
                  ((fa) this).a((byte) -108, "crash");
                  break L4;
                }
              }
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              L5: {
                var8_ref = (RuntimeException) (Object) decompiledCaughtException;
                stackOut_21_0 = (RuntimeException) var8_ref;
                stackOut_21_1 = new StringBuilder().append("fa.R(").append(param0).append(',').append(param1).append(',');
                stackIn_24_0 = stackOut_21_0;
                stackIn_24_1 = stackOut_21_1;
                stackIn_22_0 = stackOut_21_0;
                stackIn_22_1 = stackOut_21_1;
                if (param2 == null) {
                  stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
                  stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
                  stackOut_24_2 = "null";
                  stackIn_25_0 = stackOut_24_0;
                  stackIn_25_1 = stackOut_24_1;
                  stackIn_25_2 = stackOut_24_2;
                  break L5;
                } else {
                  stackOut_22_0 = (RuntimeException) (Object) stackIn_22_0;
                  stackOut_22_1 = (StringBuilder) (Object) stackIn_22_1;
                  stackOut_22_2 = "{...}";
                  stackIn_25_0 = stackOut_22_0;
                  stackIn_25_1 = stackOut_22_1;
                  stackIn_25_2 = stackOut_22_2;
                  break L5;
                }
              }
              throw ch.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 1;
        field_g = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
