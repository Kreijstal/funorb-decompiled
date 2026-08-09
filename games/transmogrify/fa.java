/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7_int = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          L0: {
            L1: {
              var2_int = -41 / ((-5 - param0) / 36);
              var3 = lk.a(0);
              var5 = ik.field_ib[td.field_a];
              ik.field_ib[td.field_a] = var3;
              if (var5 == 0L) {
                break L1;
              } else {
                if (var3 > var5) {
                  var7_int = (int)(-var5 + var3);
                  oc.field_y = (32000 + (var7_int >> 2068731809)) / var7_int;
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
            this.b((byte) -111);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) ((Object) runtimeException), "fa.V(" + param0 + ')');
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
            bi.field_M = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fa.focusLost(");

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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (aj.field_t != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (null == i.field_f) {
                  break L1;
                } else {
                  if (i.field_f == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = i.field_f.getAppletContext();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_12_0 = super.getAppletContext();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "fa.getAppletContext()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.applet.AppletContext) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_10_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public static void f(int param0) {
        try {
            field_i = null;
            field_g = null;
            int var1_int = -65 / ((param0 - -30) / 46);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fa.P(" + param0 + ')');
        }
    }

    final static od a(int param0, hb param1, byte param2, int param3) {
        RuntimeException var4 = null;
        od stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param2 > 124) {
                break L1;
              } else {
                fa.a(-14, (hb) null, (byte) -35, 21);
                break L1;
              }
            }
            stackIn_4_0 = ql.a(123, param3, 96, param1, param0);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var4 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var4);

            stackIn_8_1 = new StringBuilder().append("fa.U(").append(param0).append(',');

            if (param1 == null) {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "null";
              break L2;
            } else {
              stackIn_9_0 = (RuntimeException) ((Object) stackIn_8_0);
              stackIn_9_1 = (StringBuilder) ((Object) stackIn_8_1);
              stackIn_9_2 = "{...}";
              break L2;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ',' + param2 + ',' + param3 + ')');
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
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (aj.field_t == null) {
              L1: {
                if (i.field_f == null) {
                  break L1;
                } else {
                  if (i.field_f == this) {
                    break L1;
                  } else {
                    stackIn_8_0 = i.field_f.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  }
                }
              }
              stackIn_10_0 = super.getDocumentBase();
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
          throw ch.a((Throwable) ((Object) var1), "fa.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_2_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_8_0;
          } else {
            return stackIn_10_0;
          }
        }
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
                gd.field_k.removeFocusListener((java.awt.event.FocusListener) (this));
                gd.field_k.getParent().setBackground(java.awt.Color.black);
                gd.field_k.getParent().remove((java.awt.Component) ((Object) gd.field_k));
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
                  var2 = nf.field_e;
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
                      var2 = wi.field_f;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = i.field_f;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = aj.field_t;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                gd.field_k = (java.awt.Canvas) ((Object) new ah((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) gd.field_k));
                gd.field_k.setSize(fk.field_E, mk.field_x);
                gd.field_k.setVisible(true);
                if (aj.field_t != var2) {
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
            gd.field_k.addFocusListener((java.awt.event.FocusListener) (this));
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
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (var2), "fa.N(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (wi.field_f != this) {
                break L1;
              } else {
                if (gh.field_i) {
                  break L1;
                } else {
                  lb.field_b = lk.a(0) + 4000L;
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
          throw ch.a((Throwable) ((Object) runtimeException), "fa.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_24_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (this != wi.field_f) {
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
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if ((ch.field_b ^ -1) < (var2.width ^ -1)) {
                              break L2;
                            } else {
                              if ((uh.field_j ^ -1) >= (var2.height ^ -1)) {
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
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  break L1;
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
            stackIn_23_0 = (RuntimeException) (var2_ref);

            stackIn_23_1 = new StringBuilder().append("fa.paint(");

            if (param0 == null) {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "null";
              break L4;
            } else {
              stackIn_24_0 = (RuntimeException) ((Object) stackIn_23_0);
              stackIn_24_1 = (StringBuilder) ((Object) stackIn_23_1);
              stackIn_24_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_24_0), stackIn_24_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
                this.e(0);
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
              if (gd.field_k != null) {
                try {
                  L6: {
                    gd.field_k.removeFocusListener((java.awt.event.FocusListener) (this));
                    gd.field_k.getParent().remove((java.awt.Component) ((Object) gd.field_k));
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
                    exception = (Exception) (Object) decompiledCaughtException;
                    break L10;
                  }
                }
                break L8;
              }
            }
            L11: {
              if (!param0) {
                break L11;
              } else {
                fa.f(-17);
                break L11;
              }
            }
            L12: {
              this.c(3);
              if (aj.field_t != null) {
                try {
                  L13: {
                    System.exit(0);
                    break L13;
                  }
                } catch (java.lang.Throwable decompiledCaughtParameter3) {
                  decompiledCaughtException = decompiledCaughtParameter3;
                  L14: {
                    var3_ref2 = decompiledCaughtException;
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
          throw ch.a((Throwable) ((Object) runtimeException), "fa.O(" + param0 + ',' + param1 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (this != wi.field_f) {
                break L1;
              } else {
                if (gh.field_i) {
                  break L1;
                } else {
                  lb.field_b = 0L;
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
          throw ch.a((Throwable) ((Object) runtimeException), "fa.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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

            stackIn_5_1 = new StringBuilder().append("fa.update(");

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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
            i.field_f = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fa.provideLoaderApplet(");

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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void b(int param0);

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          L0: {
            L1: {
              var2_long = lk.a(0);
              var4 = kd.field_b[kh.field_b];
              kd.field_b[kh.field_b] = var2_long;
              kh.field_b = 31 & kh.field_b - -1;
              if (param0 == -58) {
                break L1;
              } else {
                this.getAppletContext();
                break L1;
              }
            }
            L2: {
              if (var4 == 0L) {
                break L2;
              } else {
                if (var4 < var2_long) {
                  var6_int = (int)(var2_long + -var4);
                  ub.field_a = ((var6_int >> -187730399) + 32000) / var6_int;
                  break L2;
                } else {
                  break L2;
                }
              }
            }
            L3: {
              fieldTemp$1 = ak.field_a;
              ak.field_a = ak.field_a + 1;
              if (50 >= fieldTemp$1) {
                break L3;
              } else {
                L4: {
                  L5: {
                    kb.field_l = true;
                    ak.field_a = ak.field_a - 50;
                    gd.field_k.setSize(fk.field_E, mk.field_x);
                    gd.field_k.setVisible(true);
                    if (null == aj.field_t) {
                      break L5;
                    } else {
                      if (nf.field_e == null) {
                        break L4;
                      } else {
                        break L5;
                      }
                    }
                  }
                  gd.field_k.setLocation(gl.field_D, uc.field_a);
                  if (!Transmogrify.field_A) {
                    break L3;
                  } else {
                    break L4;
                  }
                }
                var6 = aj.field_t.getInsets();
                gd.field_k.setLocation(gl.field_D + var6.left, var6.top + uc.field_a);
                break L3;
              }
            }
            this.b(15648);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) runtimeException), "fa.Q(" + param0 + ')');
        }
    }

    public abstract void init();

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != aj.field_t) {
          return null;
        } else {
          L0: {
            if (i.field_f == null) {
              break L0;
            } else {
              if (this != i.field_f) {
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("fa.focusGained(");

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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void run() {
        try {
            boolean stackIn_52_0 = false;
            boolean stackIn_70_0 = false;
            int stackIn_75_0 = 0;
            int stackIn_75_1 = 0;
            int stackIn_86_0 = 0;
            int stackIn_86_1 = 0;
            int stackIn_100_0 = 0;
            int stackIn_105_0 = 0;
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
                        var5 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != fe.field_w) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            var1 = fe.field_w.toLowerCase();
                            if (0 != (((String) (var1)).indexOf("sun") ^ -1)) {
                                statePc = 10;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            if (((String) (var1)).indexOf("apple") != -1) {
                                statePc = 10;
                            } else {
                                statePc = 6;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 6: {
                        try {
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_6) {
                            caughtException = stateCaught_6;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 8: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_8) {
                            caughtException = stateCaught_8;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        try {
                            var2 = fe.field_c;
                            if (var2.equals("1.1")) {
                                statePc = 41;
                            } else {
                                statePc = 11;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_10) {
                            caughtException = stateCaught_10;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 11: {
                        try {
                            if (var2.startsWith("1.1.")) {
                                statePc = 41;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var2.equals("1.2")) {
                                statePc = 41;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            statePc = 17;
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            if (var2.startsWith("1.2.")) {
                                statePc = 41;
                            } else {
                                statePc = 18;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 20;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            if (var2.equals("1.3")) {
                                statePc = 41;
                            } else {
                                statePc = 21;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        try {
                            statePc = 23;
                            continue stateLoop;
                        } catch (Throwable stateCaught_21) {
                            caughtException = stateCaught_21;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 23: {
                        try {
                            if (var2.startsWith("1.3.")) {
                                statePc = 41;
                            } else {
                                statePc = 24;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_23) {
                            caughtException = stateCaught_23;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 24: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_24) {
                            caughtException = stateCaught_24;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 26: {
                        try {
                            if (var2.equals("1.4")) {
                                statePc = 41;
                            } else {
                                statePc = 27;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_26) {
                            caughtException = stateCaught_26;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 27: {
                        try {
                            statePc = 29;
                            continue stateLoop;
                        } catch (Throwable stateCaught_27) {
                            caughtException = stateCaught_27;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 29: {
                        try {
                            if (var2.startsWith("1.4.")) {
                                statePc = 41;
                            } else {
                                statePc = 30;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_29) {
                            caughtException = stateCaught_29;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 30: {
                        try {
                            statePc = 32;
                            continue stateLoop;
                        } catch (Throwable stateCaught_30) {
                            caughtException = stateCaught_30;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 32: {
                        try {
                            if (var2.equals("1.5")) {
                                statePc = 41;
                            } else {
                                statePc = 33;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_32) {
                            caughtException = stateCaught_32;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 33: {
                        try {
                            statePc = 35;
                            continue stateLoop;
                        } catch (Throwable stateCaught_33) {
                            caughtException = stateCaught_33;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 35: {
                        try {
                            if (var2.startsWith("1.5.")) {
                                statePc = 41;
                            } else {
                                statePc = 36;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_35) {
                            caughtException = stateCaught_35;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 36: {
                        try {
                            statePc = 38;
                            continue stateLoop;
                        } catch (Throwable stateCaught_36) {
                            caughtException = stateCaught_36;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 38: {
                        try {
                            if (!var2.equals("1.6.0")) {
                                statePc = 44;
                            } else {
                                statePc = 39;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_38) {
                            caughtException = stateCaught_38;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 39: {
                        try {
                            statePc = 41;
                            continue stateLoop;
                        } catch (Throwable stateCaught_39) {
                            caughtException = stateCaught_39;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 41: {
                        try {
                            this.a((byte) -127, "wrongjava");
                            if (var5 == 0) {
                                statePc = 113;
                            } else {
                                statePc = 42;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_41) {
                            caughtException = stateCaught_41;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 42: {
                        try {
                            statePc = 44;
                            continue stateLoop;
                        } catch (Throwable stateCaught_42) {
                            caughtException = stateCaught_42;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 44: {
                        try {
                            if (var2.startsWith("1.6.0_")) {
                                statePc = 49;
                            } else {
                                statePc = 45;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_44) {
                            caughtException = stateCaught_44;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 45: {
                        try {
                            statePc = 47;
                            continue stateLoop;
                        } catch (Throwable stateCaught_45) {
                            caughtException = stateCaught_45;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 47: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_47) {
                            caughtException = stateCaught_47;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 49: {
                        try {
                            var3 = 6;
                            statePc = 50;
                            continue stateLoop;
                        } catch (Throwable stateCaught_49) {
                            caughtException = stateCaught_49;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 50: {
                        try {
                            if (var2.length() <= var3) {
                                statePc = 58;
                            } else {
                                statePc = 51;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_50) {
                            caughtException = stateCaught_50;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 51: {
                        try {
                            stackIn_70_0 = dj.a(var2.charAt(var3), true);
                            stackIn_52_0 = stackIn_70_0;
                            if (var5 != 0) {
                                statePc = 70;
                            } else {
                                statePc = 52;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_51) {
                            caughtException = stateCaught_51;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 52: {
                        try {
                            if (!stackIn_52_0) {
                                statePc = 58;
                            } else {
                                statePc = 53;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_52) {
                            caughtException = stateCaught_52;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 53: {
                        try {
                            statePc = 55;
                            continue stateLoop;
                        } catch (Throwable stateCaught_53) {
                            caughtException = stateCaught_53;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 55: {
                        try {
                            var3++;
                            if (var5 == 0) {
                                statePc = 50;
                            } else {
                                statePc = 56;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_55) {
                            caughtException = stateCaught_55;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 56: {
                        try {
                            statePc = 58;
                            continue stateLoop;
                        } catch (Throwable stateCaught_56) {
                            caughtException = stateCaught_56;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 58: {
                        try {
                            var4 = var2.substring(6, var3);
                            if (!qj.a((CharSequence) ((Object) var4), 110)) {
                                statePc = 65;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            if (-11 >= (aa.a(-97, (CharSequence) ((Object) var4)) ^ -1)) {
                                statePc = 65;
                            } else {
                                statePc = 60;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 60: {
                        try {
                            statePc = 62;
                            continue stateLoop;
                        } catch (Throwable stateCaught_60) {
                            caughtException = stateCaught_60;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 62: {
                        try {
                            this.a((byte) -127, "wrongjava");
                            if (var5 == 0) {
                                statePc = 113;
                            } else {
                                statePc = 63;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_62) {
                            caughtException = stateCaught_62;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 63: {
                        try {
                            statePc = 65;
                            continue stateLoop;
                        } catch (Throwable stateCaught_63) {
                            caughtException = stateCaught_63;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 65: {
                        try {
                            if (null == fe.field_c) {
                                statePc = 89;
                            } else {
                                statePc = 66;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_65) {
                            caughtException = stateCaught_65;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 66: {
                        try {
                            statePc = 68;
                            continue stateLoop;
                        } catch (Throwable stateCaught_66) {
                            caughtException = stateCaught_66;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            stackIn_70_0 = fe.field_c.startsWith("1.");
                            statePc = 70;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 70: {
                        try {
                            if (stackIn_70_0) {
                                statePc = 72;
                            } else {
                                statePc = 71;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_70) {
                            caughtException = stateCaught_70;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 71: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 73;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 73: {
                        try {
                            if (fe.field_c.length() <= var1_int) {
                                statePc = 85;
                            } else {
                                statePc = 74;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_73) {
                            caughtException = stateCaught_73;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            var3 = fe.field_c.charAt(var1_int);
                            stackIn_86_0 = var3 ^ -1;
                            stackIn_75_0 = stackIn_86_0;
                            stackIn_86_1 = -49;
                            stackIn_75_1 = stackIn_86_1;
                            if (var5 != 0) {
                                statePc = 86;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            if (stackIn_75_0 > stackIn_75_1) {
                                statePc = 85;
                            } else {
                                statePc = 76;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 76: {
                        try {
                            statePc = 78;
                            continue stateLoop;
                        } catch (Throwable stateCaught_76) {
                            caughtException = stateCaught_76;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            if ((var3 ^ -1) >= -58) {
                                statePc = 84;
                            } else {
                                statePc = 79;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 79: {
                        try {
                            statePc = 81;
                            continue stateLoop;
                        } catch (Throwable stateCaught_79) {
                            caughtException = stateCaught_79;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            if (var5 == 0) {
                                statePc = 85;
                            } else {
                                statePc = 82;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            statePc = 84;
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 84: {
                        try {
                            var1_int++;
                            var2_int = var3 - 48 + var2_int * 10;
                            if (var5 == 0) {
                                statePc = 73;
                            } else {
                                statePc = 85;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_84) {
                            caughtException = stateCaught_84;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            stackIn_86_0 = 5;
                            stackIn_86_1 = var2_int;
                            statePc = 86;
                            continue stateLoop;
                        } catch (Throwable stateCaught_85) {
                            caughtException = stateCaught_85;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 86: {
                        try {
                            if (stackIn_86_0 <= stackIn_86_1) {
                                statePc = 88;
                            } else {
                                statePc = 87;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 88: {
                        try {
                            pg.field_a = true;
                            statePc = 89;
                            continue stateLoop;
                        } catch (Throwable stateCaught_88) {
                            caughtException = stateCaught_88;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 89: {
                        try {
                            var1 = wi.field_f;
                            if (null != i.field_f) {
                                statePc = 92;
                            } else {
                                statePc = 90;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_89) {
                            caughtException = stateCaught_89;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 90: {
                        try {
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_90) {
                            caughtException = stateCaught_90;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 92: {
                        try {
                            var1 = i.field_f;
                            statePc = 93;
                            continue stateLoop;
                        } catch (Throwable stateCaught_92) {
                            caughtException = stateCaught_92;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 93: {
                        try {
                            var2_ref = fe.field_x;
                            if (null == var2_ref) {
                                statePc = 97;
                            } else {
                                statePc = 94;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_93) {
                            caughtException = stateCaught_93;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 94: {
                        try {
                            var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                            statePc = 95;
                            continue stateLoop;
                        } catch (Throwable stateCaught_94) {
                            caughtException = stateCaught_94;
                            statePc = 96;
                            continue stateLoop;
                        }
                    }
                    case 95: {
                        try {
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_95) {
                            caughtException = stateCaught_95;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 96: {
                        try {
                            var3_ref_Throwable = caughtException;
                            statePc = 97;
                            continue stateLoop;
                        } catch (Throwable stateCaught_96) {
                            caughtException = stateCaught_96;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 97: {
                        try {
                            wb.a((byte) -124);
                            this.a(false);
                            ri.field_k = wc.a(4, (java.awt.Component) ((Object) gd.field_k), mk.field_x, fk.field_E);
                            this.a(-9);
                            th.field_c = oc.j(0);
                            statePc = 98;
                            continue stateLoop;
                        } catch (Throwable stateCaught_97) {
                            caughtException = stateCaught_97;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 98: {
                        try {
                            if (lb.field_b == 0L) {
                                statePc = 103;
                            } else {
                                statePc = 99;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_98) {
                            caughtException = stateCaught_98;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 99: {
                        try {
                            stackIn_105_0 = ((lb.field_b ^ -1L) < (lk.a(0) ^ -1L) ? -1 : ((lb.field_b ^ -1L) == (lk.a(0) ^ -1L) ? 0 : 1));
                            stackIn_100_0 = stackIn_105_0;
                            if (var5 != 0) {
                                statePc = 105;
                            } else {
                                statePc = 100;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_99) {
                            caughtException = stateCaught_99;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 100: {
                        try {
                            if (stackIn_100_0 >= 0) {
                                statePc = 113;
                            } else {
                                statePc = 101;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_100) {
                            caughtException = stateCaught_100;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 101: {
                        try {
                            statePc = 103;
                            continue stateLoop;
                        } catch (Throwable stateCaught_101) {
                            caughtException = stateCaught_101;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 103: {
                        try {
                            ca.field_b = th.field_c.a((byte) -117, fg.field_j);
                            stackIn_105_0 = 0;
                            statePc = 105;
                            continue stateLoop;
                        } catch (Throwable stateCaught_103) {
                            caughtException = stateCaught_103;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 105: {
                        try {
                            var3 = stackIn_105_0;
                            statePc = 106;
                            continue stateLoop;
                        } catch (Throwable stateCaught_105) {
                            caughtException = stateCaught_105;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 106: {
                        try {
                            if ((ca.field_b ^ -1) >= (var3 ^ -1)) {
                                statePc = 111;
                            } else {
                                statePc = 107;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_106) {
                            caughtException = stateCaught_106;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 107: {
                        try {
                            this.a((byte) -98);
                            var3++;
                            if (var5 != 0) {
                                statePc = 112;
                            } else {
                                statePc = 108;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_107) {
                            caughtException = stateCaught_107;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 108: {
                        try {
                            if (var5 == 0) {
                                statePc = 106;
                            } else {
                                statePc = 109;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_108) {
                            caughtException = stateCaught_108;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 109: {
                        try {
                            statePc = 111;
                            continue stateLoop;
                        } catch (Throwable stateCaught_109) {
                            caughtException = stateCaught_109;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 111: {
                        try {
                            this.d(-58);
                            db.a(lk.field_b, gd.field_k, -85);
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
                            if (var5 == 0) {
                                statePc = 98;
                            } else {
                                statePc = 113;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_112) {
                            caughtException = stateCaught_112;
                            statePc = 114;
                            continue stateLoop;
                        }
                    }
                    case 113: {
                        try {
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_113) {
                            caughtException = stateCaught_113;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 114: {
                        try {
                            var1 = caughtException;
                            d.a((Throwable) (var1), 1, (String) null);
                            this.a((byte) -113, "crash");
                            statePc = 115;
                            continue stateLoop;
                        } catch (Throwable stateCaught_114) {
                            caughtException = stateCaught_114;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 115: {
                        try {
                            this.a(false, true);
                            statePc = 118;
                            continue stateLoop;
                        } catch (Throwable stateCaught_115) {
                            caughtException = stateCaught_115;
                            statePc = 117;
                            continue stateLoop;
                        }
                    }
                    case 117: {
                        var1 = caughtException;
                        throw ch.a((Throwable) (var1), "fa.run()");
                    }
                    case 118: {
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

    protected fa() {
        this.field_j = false;
    }

    public final void destroy() {
        if (wi.field_f != this || gh.field_i) {
            return;
        }
        try {
            lb.field_b = lk.a(0);
            pg.a(5000L, -120);
            f.field_b = null;
            this.a(false, false);
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) ((Object) runtimeException), "fa.destroy()");
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
                if (!this.field_j) {
                  L1: {
                    this.field_j = true;
                    System.out.println("error_game_" + param1);
                    if (param0 < -90) {
                      break L1;
                    } else {
                      field_i = (vd) null;
                      break L1;
                    }
                  }
                  try {
                    L2: {
                      kj.a(ha.b(74), false, "loggedout");
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

                stackIn_15_1 = new StringBuilder().append("fa.S(").append(param0).append(',');

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
              throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ')');
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

            stackIn_5_1 = new StringBuilder().append("fa.windowClosing(");

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
          throw ch.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (aj.field_t != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (i.field_f == null) {
                  break L1;
                } else {
                  if (this == i.field_f) {
                    break L1;
                  } else {
                    stackIn_10_0 = i.field_f.getParameter(param0);
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

            stackIn_16_1 = new StringBuilder().append("fa.getParameter(");

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
          throw ch.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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

    final void a(byte param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
            fe dupTemp$0 = null;
            RuntimeException stackIn_22_0 = null;
            StringBuilder stackIn_22_1 = null;
            RuntimeException stackIn_24_0 = null;
            StringBuilder stackIn_24_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            String stackIn_25_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            ib var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Transmogrify.field_A ? 1 : 0;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != wi.field_f) {
                                statePc = 4;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            statePc = 11;
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 4: {
                        try {
                            bh.field_c = bh.field_c + 1;
                            if (bh.field_c >= 3) {
                                statePc = 7;
                            } else {
                                statePc = 5;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_4) {
                            caughtException = stateCaught_4;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.a((byte) -94, "alreadyloaded");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 19;
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
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            wi.field_f = (fa) (this);
                            gl.field_D = 0;
                            uc.field_a = 0;
                            mk.field_x = param1;
                            uh.field_j = param1;
                            fk.field_E = param6;
                            ch.field_b = param6;
                            gh.field_h = param3;
                            re.field_i = ha.b(108);
                            dupTemp$0 = new fe(param5, param2, param4, true);
                            lk.field_b = dupTemp$0;
                            f.field_b = dupTemp$0;
                            var8 = lk.field_b.a((Runnable) (this), 1, 65535);
                            if (param0 == 79) {
                                statePc = 13;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        return;
                    }
                    case 13: {
                        try {
                            if (var8.field_c != 0) {
                                statePc = 18;
                            } else {
                                statePc = 14;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_13) {
                            caughtException = stateCaught_13;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            pg.a(10L, -82);
                            if (var9 != 0) {
                                statePc = 26;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            if (var9 == 0) {
                                statePc = 13;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            statePc = 18;
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 19;
                            continue stateLoop;
                        }
                    }
                    case 18: {
                        try {
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_18) {
                            caughtException = stateCaught_18;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            var8_ref = caughtException;
                            d.a(var8_ref, -124, (String) null);
                            this.a((byte) -108, "crash");
                            statePc = 26;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 21;
                            continue stateLoop;
                        }
                    }
                    case 21: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_24_0 = (RuntimeException) (var8_ref2);
                        stackIn_22_0 = stackIn_24_0;
                        stackIn_24_1 = new StringBuilder().append("fa.R(").append(param0).append(',').append(param1).append(',');
                        stackIn_22_1 = stackIn_24_1;
                        if (param2 == null) {
                            statePc = 24;
                        } else {
                            statePc = 22;
                        }
                        continue stateLoop;
                    }
                    case 22: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_22_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_22_1);
                        stackIn_25_2 = "{...}";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 24: {
                        stackIn_25_0 = (RuntimeException) ((Object) stackIn_24_0);
                        stackIn_25_1 = (StringBuilder) ((Object) stackIn_24_1);
                        stackIn_25_2 = "null";
                        statePc = 25;
                        continue stateLoop;
                    }
                    case 25: {
                        throw ch.a((Throwable) ((Object) stackIn_25_0), stackIn_25_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 26: {
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

    static {
        field_f = 1;
        field_g = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
