/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class uk extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_g;
    static int field_c;
    boolean field_i;
    public static int field_f;
    public static int field_e;
    public static boolean field_b;
    public static int field_h;
    public static int field_j;
    public static int field_d;
    public static boolean field_a;

    public abstract void init();

    abstract void a(int param0);

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_i) {
              return;
            }
            this.field_i = true;
            System.out.println("error_game_" + param1);
            try {
              q.b("loggedout", 6168, mb.g((byte) 16));
              if (param0 != -25296) {
                this.windowDeiconified((java.awt.event.WindowEvent) null);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("uk.P(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void update(java.awt.Graphics param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 6) {
            field_g = (String) null;
          }
          lm.a(param1 - 6);
          df.h(param2, param4, param3, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var5), "uk.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    private final void a(boolean param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          var2_long = hc.a(-9986);
          var4 = ig.field_b[qg.field_n];
          ig.field_b[qg.field_n] = var2_long;
          if (!param0) {
            return;
          }
          if (var4 != 0L &&
            var2_long > var4) {
          }
          qg.field_n = 31 & 1 + qg.field_n;
          var6 = this;
          synchronized (var6) {
            fe.field_Gb = ub.field_F;
          }
          this.c(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "uk.N(" + param0 + ')');
        }
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (md.field_d) {
              return;
            }
            if (param0 != 20) {
              return;
            }
            md.field_d = true;
          }
          if (ai.field_a != null) {
            ai.field_a.destroy();
          }
          try {
            this.a(param0 ^ -76);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (fi.field_v != null) {
            try {
              fi.field_v.removeFocusListener((java.awt.event.FocusListener) (this));
              fi.field_v.getParent().remove((java.awt.Component) ((Object) fi.field_v));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (ei.field_c != null) {
            try {
              ei.field_c.a(23607);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.d(0);
          if (bj.field_m != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref2 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw kg.a((Throwable) ((Object) runtimeException), "uk.G(" + param0 + ',' + param1 + ')');
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (bj.field_m != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (ai.field_a != null &&
            this != ai.field_a) {
            stackIn_10_0 = ai.field_a.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("uk.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    abstract void c(boolean param0);

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_26_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vg.field_I != null) {
            stackIn_8_0 = vg.field_I.field_g ? 1 : 0;
          } else {
            stackIn_8_0 = (null == ei.field_b) ? 0 : 1;
          }
          var3_int = stackIn_8_0;
          if (var3_int != 0) {
            stackIn_12_0 = we.field_c.field_J;
          } else {
            stackIn_12_0 = 480;
          }
          var4 = stackIn_12_0;
          var5 = var4 - param2;
          var6 = param1 + (int)kd.field_t - 644;
          var7 = var5 / 20;
          if (param0 >= -103) {
            uk.a(-101, 19, -78, 79, -92);
          }
          if (var5 < 0 ||
            var6 < 0 ||
            var7 > 1) {
            var7 = -1;
          }
          if (1 == var7) {
            var7 = var6 / 26 + 1;
          }
          stackIn_26_0 = var7;
          return stackIn_26_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var3), "uk.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Virogrid.field_F ? 1 : 0;
        try {
          if (fi.field_v != null) {
            fi.field_v.removeFocusListener((java.awt.event.FocusListener) (this));
            fi.field_v.getParent().setBackground(java.awt.Color.black);
            fi.field_v.getParent().remove((java.awt.Component) ((Object) fi.field_v));
          }
          boolean decompiledFrameRemainder0 = true;
          if (mk.field_cb == null) {
            if (bj.field_m != null) {
              var2 = bj.field_m;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null == ai.field_a) {
                var2 = jj.field_n;
                if (var4 != 0) {
                  var2 = ai.field_a;
                  var2 = mk.field_cb;
                }
              } else {
                var2 = ai.field_a;
                if (var4 != 0) {
                  var2 = mk.field_cb;
                }
              }
            }
          } else {
            var2 = mk.field_cb;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          fi.field_v = (java.awt.Canvas) ((Object) new ag((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) fi.field_v));
          if (param0 != 21616) {
            this.b(false);
          }
          fi.field_v.setSize(fl.field_i, km.field_B);
          fi.field_v.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == bj.field_m);
          if (!decompiledSharedTail0) {
            fi.field_v.setLocation(fi.field_s, rk.field_c);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = bj.field_m.getInsets();
            fi.field_v.setLocation(fi.field_s + var3.left, var3.top + rk.field_c);
          }
          fi.field_v.addFocusListener((java.awt.event.FocusListener) (this));
          fi.field_v.requestFocus();
          fe.field_Gb = true;
          ub.field_F = true;
          ce.field_K = true;
          km.field_Db = false;
          oi.field_b = hc.a(param0 ^ -29554);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) (var2), "uk.H(" + param0 + ')');
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != bj.field_m) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (ai.field_a != null &&
            this != ai.field_a) {
            stackIn_10_0 = ai.field_a.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "uk.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ai.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, String param2, int param3, long param4) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 5) {
            return;
          }
          hn.field_n = param2;
          nd.field_c = param4;
          ve.field_o = param3;
          ld.field_d = param0;
          li.field_m = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("uk.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != bj.field_m) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != ai.field_a &&
            ai.field_a != this) {
            stackIn_12_0 = ai.field_a.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var1), "uk.getAppletContext()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ub.field_F = true;
          ce.field_K = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void d(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void b(boolean param0);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          pd dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          un var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Virogrid.field_F ? 1 : 0;
          try {
            try {
              if (null != jj.field_n) {
                km.field_pb = km.field_pb + 1;
                if (km.field_pb < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(-25296, "alreadyloaded");
                return;
              }
              km.field_B = param1;
              ah.field_g = param1;
              db.field_v = param4;
              rk.field_c = 0;
              if (param0 <= 22) {
                this.focusLost((java.awt.event.FocusEvent) null);
              }
              fl.field_i = param2;
              he.field_nc = param2;
              jj.field_n = this;
              fi.field_s = 0;
              wf.field_m = mb.g((byte) 109);
              dupTemp$0 = new pd(param3, param6, param5, true);
              ei.field_c = dupTemp$0;
              qn.field_R = dupTemp$0;
              var8 = ei.field_c.a(1, (Runnable) (this), 255);
              while (true) {
                if (var8.field_a == 0) {
                  mm.a(-115, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              en.a((String) null, var8_ref, 1);
              this.a(-25296, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("uk.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw kg.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
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

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == jj.field_n &&
            !md.field_d) {
            rl.field_t = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) runtimeException), "uk.start()");
        }
    }

    public final void destroy() {
        if (jj.field_n != this ||
          md.field_d) {
          return;
        }
        try {
          rl.field_t = hc.a(-9986);
          mm.a(-22, 5000L);
          qn.field_R = null;
          this.a((byte) 20, false);
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "uk.destroy()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ub.field_F = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("uk.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_81_1 = 0;
          int stackIn_102_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var1 = null;
          int var1_int = 0;
          String var2 = null;
          int var2_int = 0;
          java.lang.reflect.Method var2_ref = null;
          int var3 = 0;
          Throwable var3_ref_Throwable = null;
          String var4 = null;
          int var5 = 0;
          var5 = Virogrid.field_F ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (pd.field_q != null) {
                var1 = pd.field_q.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = pd.field_k;
                  if (var2.equals("1.1") ||
                    var2.startsWith("1.1.") ||
                    var2.equals("1.2") ||
                    var2.startsWith("1.2.") ||
                    var2.equals("1.3") ||
                    var2.startsWith("1.3.") ||
                    var2.equals("1.4") ||
                    var2.startsWith("1.4.") ||
                    var2.equals("1.5") ||
                    var2.startsWith("1.5.") ||
                    var2.equals("1.6.0")) {
                    this.a(-25296, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = kf.a(0, var2.charAt(var3));
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_68_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (pa.a((CharSequence) ((Object) var4), -128) &&
                        !(fm.a((CharSequence) ((Object) var4), false) >= 10)) {
                        this.a(-25296, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (pd.field_k != null))) {
                stackIn_68_0 = pd.field_k.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < pd.field_k.length()) {
                    var3 = pd.field_k.charAt(var1_int);
                    stackIn_81_0 = 48;
                    stackIn_81_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 <= stackIn_81_1 &&
                      57 >= var3)) {
                      var2_int = 10 * var2_int - (-var3 + 48);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = -6;
                    stackIn_81_1 = ~var2_int;
                  }
                  if (stackIn_81_0 < stackIn_81_1) {
                    break;
                  }
                  g.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = jj.field_n;
                if (ai.field_a != null) {
                  var1 = ai.field_a;
                }
                var2_ref = pd.field_v;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                we.a(1);
                this.e(21616);
                ca.field_M = eg.a((java.awt.Component) ((Object) fi.field_v), fl.field_i, km.field_B, 101);
                this.c(true);
                kb.field_b = gf.g(true);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (rl.field_t != 0L) {
                    stackIn_102_0 = $cfr$lcmp(rl.field_t, hc.a(-9986));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ae.field_c = kb.field_b.a(16680, hd.field_f);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(ae.field_c > var3)) {
                      this.f(9282);
                      od.a(ei.field_c, fi.field_v, (byte) -102);
                      break;
                    }
                    this.a(true);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              en.a((String) null, (Throwable) (var1), 1);
              this.a(-25296, "crash");
            }
            this.a((byte) 20, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw kg.a((Throwable) (var1), "uk.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          if (param0 != 9282) {
            this.getDocumentBase();
          }
          var2_long = hc.a(-9986);
          var4 = ke.field_q[ci.field_r];
          ke.field_q[ci.field_r] = var2_long;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            mj.field_E = (32000 + (var6_int >> 1)) / var6_int;
          }
          ci.field_r = 31 & ci.field_r + 1;
          fieldTemp$1 = lm.field_a;
          lm.field_a = lm.field_a + 1;
          if (fieldTemp$1 > 50) {
            ce.field_K = true;
            lm.field_a = lm.field_a - 50;
            fi.field_v.setSize(fl.field_i, km.field_B);
            fi.field_v.setVisible(true);
            if (null != bj.field_m &&
              mk.field_cb == null) {
              var6 = bj.field_m.getInsets();
              fi.field_v.setLocation(fi.field_s + var6.left, rk.field_c + var6.top);
              if (Virogrid.field_F) {
                fi.field_v.setLocation(fi.field_s, rk.field_c);
              }
            } else {
              fi.field_v.setLocation(fi.field_s, rk.field_c);
            }
          }
          this.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kg.a((Throwable) ((Object) var2), "uk.O(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected uk() {
        this.field_i = false;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != bj.field_m) {
          return null;
        }
        if (null != ai.field_a &&
          ai.field_a != this) {
          return ai.field_a.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void c(int param0);

    public static void b(int param0) {
        try {
          field_g = null;
          if (param0 != -6490) {
            field_g = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "uk.I(" + param0 + ')');
        }
    }

    public final void stop() {
        if (jj.field_n != this ||
          md.field_d) {
          return;
        }
        try {
          rl.field_t = hc.a(-9986) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw kg.a((Throwable) ((Object) runtimeException), "uk.stop()");
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (jj.field_n == this &&
            !md.field_d) {
            ce.field_K = true;
            if (g.field_c &&
              hc.a(-9986) - oi.field_b > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < he.field_nc) {
                  return;
                }
                if (ah.field_g > var2.height) {
                  return;
                }
              }
              km.field_Db = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("uk.paint(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw kg.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    static {
        field_g = "blue";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
