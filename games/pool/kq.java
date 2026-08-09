/*
 * Decompiled by CFR-JS 0.4.0.
 */
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

            stackIn_5_1 = new StringBuilder().append("kq.windowClosing(");

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
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
            if (op.field_e != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (oc.field_t == null) {
                  break L1;
                } else {
                  if (oc.field_t == this) {
                    break L1;
                  } else {
                    stackIn_10_0 = oc.field_t.getAppletContext();
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
          throw wm.a((Throwable) ((Object) var1), "kq.getAppletContext()");
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

    public abstract void init();

    final void a(byte param0, String param1) {
        try {
            RuntimeException stackIn_14_0 = null;
            StringBuilder stackIn_14_1 = null;
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_15_2 = null;
            int decompiledRegionSelector0 = 0;
            Throwable decompiledCaughtException = null;
            int var3_int = 0;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              L0: {
                if (this.field_n) {
                  decompiledRegionSelector0 = 0;
                  break L0;
                } else {
                  this.field_n = true;
                  System.out.println("error_game_" + param1);
                  try {
                    L1: {
                      mo.a((byte) 122, "loggedout", hk.d(71));
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
                      this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
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

                stackIn_14_1 = new StringBuilder().append("kq.D(").append(param0).append(',');

                if (param1 == null) {
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
              throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ')');
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

    final synchronized void f(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          L0: {
            L1: {
              if (null != pa.field_K) {
                pa.field_K.removeFocusListener((java.awt.event.FocusListener) (this));
                pa.field_K.getParent().setBackground(java.awt.Color.black);
                pa.field_K.getParent().remove((java.awt.Component) ((Object) pa.field_K));
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
                  var2 = iq.field_l;
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
                      var2 = ni.field_ib;
                      if (var4 == 0) {
                        break L2;
                      } else {
                        break L5;
                      }
                    }
                  }
                  var2 = oc.field_t;
                  if (var4 == 0) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              var2 = op.field_e;
              break L2;
            }
            L6: {
              L7: {
                ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
                pa.field_K = (java.awt.Canvas) ((Object) new cn((java.awt.Component) (this)));
                ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) pa.field_K));
                pa.field_K.setSize(ml.field_d, ad.field_c);
                pa.field_K.setVisible(true);
                if (op.field_e != var2) {
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
            pa.field_K.addFocusListener((java.awt.event.FocusListener) (this));
            pa.field_K.requestFocus();
            if (param0 >= 40) {
              vl.field_q = true;
              um.field_e = true;
              he.field_c = true;
              wd.field_Sb = false;
              ph.field_b = rl.a((byte) -94);
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
          throw wm.a((Throwable) (var2), "kq.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ni.field_ib != this) {
                break L1;
              } else {
                if (ka.field_p) {
                  break L1;
                } else {
                  rm.field_c = 0L;
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
          throw wm.a((Throwable) ((Object) runtimeException), "kq.start()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
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
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (op.field_e == null) {
              L1: {
                if (null == oc.field_t) {
                  break L1;
                } else {
                  if (this != oc.field_t) {
                    stackIn_10_0 = oc.field_t.getParameter(param0);
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

            stackIn_16_1 = new StringBuilder().append("kq.getParameter(");

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
          throw wm.a((Throwable) ((Object) stackIn_17_0), stackIn_17_2 + ')');
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
            oc.field_t = param0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kq.provideLoaderApplet(");

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    final static void a(dd[] param0, int param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          L0: {
            L1: {
              nf.field_V = param0;
              if (param1 == -58) {
                break L1;
              } else {
                field_a = (vh) null;
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
            stackIn_14_0 = (RuntimeException) (var2);

            stackIn_14_1 = new StringBuilder().append("kq.O(");

            if (param0 == null) {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "null";
              break L3;
            } else {
              stackIn_15_0 = (RuntimeException) ((Object) stackIn_14_0);
              stackIn_15_1 = (StringBuilder) ((Object) stackIn_14_1);
              stackIn_15_2 = "{...}";
              break L3;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_15_0), stackIn_15_2 + ',' + param1 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
            vl.field_q = false;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            runtimeException = decompiledCaughtException;
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kq.focusLost(");

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
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
                fieldTemp$1 = ei.field_o;
                ei.field_o = ei.field_o + 1;
                if (fieldTemp$1 > 50) {
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
              this.a((byte) 120);
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "kq.H(" + param0 + ')');
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

            stackIn_5_1 = new StringBuilder().append("kq.update(");

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (ni.field_ib != this) {
                break L1;
              } else {
                if (ka.field_p) {
                  break L1;
                } else {
                  rm.field_c = rl.a((byte) -113) - -4000L;
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
          throw wm.a((Throwable) ((Object) runtimeException), "kq.stop()");
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          L0: {
            L1: {
              var2_long = rl.a((byte) -118);
              if (param0 == -15568) {
                break L1;
              } else {
                this.windowIconified((java.awt.event.WindowEvent) null);
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
            this.e((byte) -99);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "kq.F(" + param0 + ')');
        }
    }

    public final void run() {
        try {
            boolean stackIn_48_0 = false;
            boolean stackIn_66_0 = false;
            int stackIn_71_0 = 0;
            int stackIn_71_1 = 0;
            int stackIn_82_0 = 0;
            int stackIn_82_1 = 0;
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
                        var5 = Pool.field_O;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null != sj.field_o) {
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
                            var1 = sj.field_o.toLowerCase();
                            if ((((String) (var1)).indexOf("sun") ^ -1) != 0) {
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
                            if (-1 == ((String) (var1)).indexOf("apple")) {
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
                            var2 = sj.field_t;
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
                            this.a((byte) 124, "wrongjava");
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
                            if (var3 >= var2.length()) {
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
                            stackIn_66_0 = kh.a(var2.charAt(var3), (byte) 19);
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
                            if (!ka.a(10, (CharSequence) ((Object) var4))) {
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
                            if ((kq.a((byte) 105, (CharSequence) ((Object) var4)) ^ -1) <= -11) {
                                statePc = 61;
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
                            this.a((byte) -89, "wrongjava");
                            if (var5 == 0) {
                                statePc = 107;
                            } else {
                                statePc = 59;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_58) {
                            caughtException = stateCaught_58;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 59: {
                        try {
                            statePc = 61;
                            continue stateLoop;
                        } catch (Throwable stateCaught_59) {
                            caughtException = stateCaught_59;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 61: {
                        try {
                            if (sj.field_t == null) {
                                statePc = 85;
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
                            stackIn_66_0 = sj.field_t.startsWith("1.");
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
                            if (stackIn_66_0) {
                                statePc = 68;
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
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_67) {
                            caughtException = stateCaught_67;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 68: {
                        try {
                            var1_int = 2;
                            var2_int = 0;
                            statePc = 69;
                            continue stateLoop;
                        } catch (Throwable stateCaught_68) {
                            caughtException = stateCaught_68;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 69: {
                        try {
                            if (sj.field_t.length() <= var1_int) {
                                statePc = 81;
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
                            var3 = sj.field_t.charAt(var1_int);
                            stackIn_82_0 = -49;
                            stackIn_71_0 = stackIn_82_0;
                            stackIn_82_1 = var3 ^ -1;
                            stackIn_71_1 = stackIn_82_1;
                            if (var5 != 0) {
                                statePc = 82;
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
                            if (stackIn_71_0 < stackIn_71_1) {
                                statePc = 81;
                            } else {
                                statePc = 72;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_71) {
                            caughtException = stateCaught_71;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 72: {
                        try {
                            statePc = 74;
                            continue stateLoop;
                        } catch (Throwable stateCaught_72) {
                            caughtException = stateCaught_72;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 74: {
                        try {
                            if (-58 <= (var3 ^ -1)) {
                                statePc = 80;
                            } else {
                                statePc = 75;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_74) {
                            caughtException = stateCaught_74;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 75: {
                        try {
                            statePc = 77;
                            continue stateLoop;
                        } catch (Throwable stateCaught_75) {
                            caughtException = stateCaught_75;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 77: {
                        try {
                            if (var5 == 0) {
                                statePc = 81;
                            } else {
                                statePc = 78;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_77) {
                            caughtException = stateCaught_77;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 78: {
                        try {
                            statePc = 80;
                            continue stateLoop;
                        } catch (Throwable stateCaught_78) {
                            caughtException = stateCaught_78;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 80: {
                        try {
                            var2_int = -48 + (var3 + var2_int * 10);
                            var1_int++;
                            if (var5 == 0) {
                                statePc = 69;
                            } else {
                                statePc = 81;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_80) {
                            caughtException = stateCaught_80;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 81: {
                        try {
                            stackIn_82_0 = var2_int;
                            stackIn_82_1 = 5;
                            statePc = 82;
                            continue stateLoop;
                        } catch (Throwable stateCaught_81) {
                            caughtException = stateCaught_81;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 82: {
                        try {
                            if (stackIn_82_0 < stackIn_82_1) {
                                statePc = 85;
                            } else {
                                statePc = 83;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_82) {
                            caughtException = stateCaught_82;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 83: {
                        try {
                            bq.field_o = true;
                            statePc = 85;
                            continue stateLoop;
                        } catch (Throwable stateCaught_83) {
                            caughtException = stateCaught_83;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 85: {
                        try {
                            var1 = ni.field_ib;
                            if (null == oc.field_t) {
                                statePc = 87;
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
                            var1 = oc.field_t;
                            statePc = 87;
                            continue stateLoop;
                        } catch (Throwable stateCaught_86) {
                            caughtException = stateCaught_86;
                            statePc = 108;
                            continue stateLoop;
                        }
                    }
                    case 87: {
                        try {
                            var2_ref = sj.field_q;
                            if (var2_ref == null) {
                                statePc = 91;
                            } else {
                                statePc = 88;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_87) {
                            caughtException = stateCaught_87;
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
                            lo.a(-19);
                            this.f((byte) 55);
                            sh.field_P = id.a(ml.field_d, ad.field_c, -44, (java.awt.Component) ((Object) pa.field_K));
                            this.d((byte) -46);
                            pj.field_J = ug.e(0);
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
                            if (-1L == (rm.field_c ^ -1L)) {
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
                            stackIn_99_0 = ((rm.field_c ^ -1L) < (rl.a((byte) -122) ^ -1L) ? -1 : ((rm.field_c ^ -1L) == (rl.a((byte) -122) ^ -1L) ? 0 : 1));
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
                            rn.field_b = pj.field_J.a(oh.field_e, (byte) 39);
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
                            if (var3 >= rn.field_b) {
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
                            this.a(-15568);
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
                            this.b((byte) -30);
                            cb.a(pa.field_K, lg.field_s, 125);
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
                            tc.a((Throwable) (var1), (String) null, -8555);
                            this.a((byte) -103, "crash");
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
                            this.a(20171, true);
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
                        throw wm.a((Throwable) (var1), "kq.run()");
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

    public static void g(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
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
          throw wm.a((Throwable) ((Object) var1), "kq.C(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
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
                field_h = (dd) null;
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
                this.c((byte) -39);
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
                    pa.field_K.removeFocusListener((java.awt.event.FocusListener) (this));
                    pa.field_K.getParent().remove((java.awt.Component) ((Object) pa.field_K));
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
              this.h((byte) -28);
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
          throw wm.a((Throwable) ((Object) runtimeException), "kq.L(" + param0 + ',' + param1 + ')');
        }
    }

    final static int a(byte param0, CharSequence param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_4_0 = ao.a(10, true, true, param1);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var2 = decompiledCaughtException;
            stackIn_8_0 = (RuntimeException) (var2);

            stackIn_8_1 = new StringBuilder().append("kq.G(").append(param0).append(',');

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
          throw wm.a((Throwable) ((Object) stackIn_9_0), stackIn_9_2 + ')');
        }
        return stackIn_4_0;
    }

    public final void destroy() {
        if (this != ni.field_ib || ka.field_p) {
            return;
        }
        try {
            rm.field_c = rl.a((byte) -119);
            cf.a(-79, 5000L);
            wh.field_c = null;
            this.a(20171, false);
        } catch (RuntimeException runtimeException) {
            throw wm.a((Throwable) ((Object) runtimeException), "kq.destroy()");
        }
    }

    abstract void e(byte param0);

    final void a(int param0, int param1, String param2, byte param3, int param4, int param5, int param6) {
        try {
            sj dupTemp$0 = null;
            RuntimeException stackIn_23_0 = null;
            StringBuilder stackIn_23_1 = null;
            RuntimeException stackIn_25_0 = null;
            StringBuilder stackIn_25_1 = null;
            RuntimeException stackIn_26_0 = null;
            StringBuilder stackIn_26_1 = null;
            String stackIn_26_2 = null;
            int decompiledRegionSelector0 = 0;
            int decompiledRegionSelector1 = 0;
            int statePc = 0;
            Throwable caughtException = null;
            le var8 = null;
            Throwable var8_ref = null;
            RuntimeException var8_ref2 = null;
            int var9 = 0;
            stateLoop: while (true) {
                switch (statePc) {
                    case 0: {
                        var9 = Pool.field_O;
                        statePc = 1;
                        continue stateLoop;
                    }
                    case 1: {
                        try {
                            if (null == ni.field_ib) {
                                statePc = 11;
                            } else {
                                statePc = 2;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_1) {
                            caughtException = stateCaught_1;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 2: {
                        try {
                            oe.field_V = oe.field_V + 1;
                            if (oe.field_V >= 3) {
                                statePc = 7;
                            } else {
                                statePc = 3;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_2) {
                            caughtException = stateCaught_2;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 3: {
                        try {
                            statePc = 5;
                            continue stateLoop;
                        } catch (Throwable stateCaught_3) {
                            caughtException = stateCaught_3;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 5: {
                        try {
                            statePc = 9;
                            continue stateLoop;
                        } catch (Throwable stateCaught_5) {
                            caughtException = stateCaught_5;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 7: {
                        try {
                            this.a((byte) -46, "alreadyloaded");
                            statePc = 8;
                            continue stateLoop;
                        } catch (Throwable stateCaught_7) {
                            caughtException = stateCaught_7;
                            statePc = 20;
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
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 10: {
                        return;
                    }
                    case 11: {
                        try {
                            ok.field_rb = param0;
                            cl.field_e = 0;
                            ni.field_ib = (kq) (this);
                            ad.field_c = param1;
                            rb.field_f = param1;
                            ua.field_v = 0;
                            ml.field_d = param6;
                            dl.field_b = param6;
                            gj.field_W = hk.d(77);
                            dupTemp$0 = new sj(param4, param2, param5, true);
                            lg.field_s = dupTemp$0;
                            wh.field_c = dupTemp$0;
                            var8 = lg.field_s.a(113, 1, (Runnable) (this));
                            if (param3 == 115) {
                                statePc = 14;
                            } else {
                                statePc = 12;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_11) {
                            caughtException = stateCaught_11;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 12: {
                        try {
                            this.a((byte) -22, (String) null);
                            statePc = 14;
                            continue stateLoop;
                        } catch (Throwable stateCaught_12) {
                            caughtException = stateCaught_12;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 14: {
                        try {
                            if (var8.field_f != 0) {
                                statePc = 19;
                            } else {
                                statePc = 15;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_14) {
                            caughtException = stateCaught_14;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 15: {
                        try {
                            cf.a(param3 + -228, 10L);
                            if (var9 != 0) {
                                statePc = 27;
                            } else {
                                statePc = 16;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_15) {
                            caughtException = stateCaught_15;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 16: {
                        try {
                            if (var9 == 0) {
                                statePc = 14;
                            } else {
                                statePc = 17;
                            }
                            continue stateLoop;
                        } catch (Throwable stateCaught_16) {
                            caughtException = stateCaught_16;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 17: {
                        try {
                            statePc = 19;
                            continue stateLoop;
                        } catch (Throwable stateCaught_17) {
                            caughtException = stateCaught_17;
                            statePc = 20;
                            continue stateLoop;
                        }
                    }
                    case 19: {
                        try {
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_19) {
                            caughtException = stateCaught_19;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 20: {
                        try {
                            var8_ref = caughtException;
                            tc.a(var8_ref, (String) null, -8555);
                            this.a((byte) -108, "crash");
                            statePc = 27;
                            continue stateLoop;
                        } catch (Throwable stateCaught_20) {
                            caughtException = stateCaught_20;
                            statePc = 22;
                            continue stateLoop;
                        }
                    }
                    case 22: {
                        var8_ref2 = (RuntimeException) ((Object) caughtException);
                        stackIn_25_0 = (RuntimeException) (var8_ref2);
                        stackIn_23_0 = stackIn_25_0;
                        stackIn_25_1 = new StringBuilder().append("kq.J(").append(param0).append(',').append(param1).append(',');
                        stackIn_23_1 = stackIn_25_1;
                        if (param2 == null) {
                            statePc = 25;
                        } else {
                            statePc = 23;
                        }
                        continue stateLoop;
                    }
                    case 23: {
                        stackIn_26_0 = (RuntimeException) ((Object) stackIn_23_0);
                        stackIn_26_1 = (StringBuilder) ((Object) stackIn_23_1);
                        stackIn_26_2 = "{...}";
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 25: {
                        stackIn_26_0 = (RuntimeException) ((Object) stackIn_25_0);
                        stackIn_26_1 = (StringBuilder) ((Object) stackIn_25_1);
                        stackIn_26_2 = "null";
                        statePc = 26;
                        continue stateLoop;
                    }
                    case 26: {
                        throw wm.a((Throwable) ((Object) stackIn_26_0), stackIn_26_2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
                    }
                    case 27: {
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

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_27_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          L0: {
            L1: {
              if (ni.field_ib != this) {
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
                          var2 = param0.getClipBounds();
                          if (var2 == null) {
                            break L3;
                          } else {
                            if ((dl.field_b ^ -1) < (var2.width ^ -1)) {
                              break L2;
                            } else {
                              if (rb.field_f > var2.height) {
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
            stackIn_26_0 = (RuntimeException) (var2_ref);

            stackIn_26_1 = new StringBuilder().append("kq.paint(");

            if (param0 == null) {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "null";
              break L4;
            } else {
              stackIn_27_0 = (RuntimeException) ((Object) stackIn_26_0);
              stackIn_27_1 = (StringBuilder) ((Object) stackIn_26_1);
              stackIn_27_2 = "{...}";
              break L4;
            }
          }
          throw wm.a((Throwable) ((Object) stackIn_27_0), stackIn_27_2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (op.field_e == null) {
          L0: {
            if (null == oc.field_t) {
              break L0;
            } else {
              if (oc.field_t != this) {
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
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
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
            stackIn_5_0 = (RuntimeException) (runtimeException);

            stackIn_5_1 = new StringBuilder().append("kq.focusGained(");

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
          throw wm.a((Throwable) ((Object) stackIn_6_0), stackIn_6_2 + ')');
        }
    }

    abstract void a(byte param0);

    abstract void h(byte param0);

    protected kq() {
        this.field_n = false;
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            if (op.field_e != null) {
              stackIn_4_0 = null;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              L1: {
                if (oc.field_t == null) {
                  break L1;
                } else {
                  if (oc.field_t != this) {
                    stackIn_12_0 = oc.field_t.getDocumentBase();
                    decompiledRegionSelector0 = 1;
                    break L0;
                  } else {
                    break L1;
                  }
                }
              }
              stackIn_14_0 = super.getDocumentBase();
              decompiledRegionSelector0 = 2;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "kq.getDocumentBase()");
        }
        if (decompiledRegionSelector0 == 0) {
          return (java.net.URL) ((Object) stackIn_4_0);
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_12_0;
          } else {
            return stackIn_14_0;
          }
        }
    }

    abstract void c(byte param0);

    static {
        field_g = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = 20;
    }
}
