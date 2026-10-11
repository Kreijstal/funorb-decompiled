/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class bg extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static byte[][] field_j;
    static int[] field_k;
    boolean field_b;
    static char[] field_g;
    static kh field_c;
    static String field_n;
    static int[] field_f;
    public static boolean field_l;
    public static boolean field_i;
    public static boolean field_d;
    public static int field_m;
    public static int field_e;
    public static boolean field_a;
    public static int field_h;

    final static boolean a(int param0, int param1, int param2) {
        RuntimeException var3 = null;
        boolean stackIn_16_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (dg.field_e == 13) {
            fk.e((byte) -8);
            return true;
          }
          if (dg.field_e == 102) {
            gl.field_o.i(20424);
            return true;
          }
          if (param2 != -9614) {
            return false;
          }
          stackIn_16_0 = (null != gl.field_o) && (gl.field_o.b(110, param1, param0));
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var3), "bg.WA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_b) {
              return;
            }
            this.field_b = true;
            System.out.println("error_game_" + param1);
            try {
              if (param0 != 24044) {
                this.getAppletContext();
              }
              ii.a((byte) 64, "loggedout", lk.q(13));
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
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("bg.RA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != ea.field_h) {
          return null;
        }
        if (null != ik.field_c &&
          ik.field_c != this) {
          return ik.field_c.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void g(int param0);

    final boolean a(byte param0) {
        return true;
    }

    final static void c(int param0) {
        try {
          if (param0 <= 30) {
            field_j = (byte[][]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bg.TA(" + param0 + ')');
        }
    }

    abstract void b(int param0);

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ik.field_c = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("bg.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ea.field_h != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != ik.field_c &&
            this != ik.field_c) {
            stackIn_10_0 = ik.field_c.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bg.getDocumentBase()");
        }
    }

    public abstract void init();

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ea.field_h) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (ik.field_c != null &&
            this != ik.field_c) {
            stackIn_10_0 = ik.field_c.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) var1), "bg.getAppletContext()");
        }
    }

    abstract void f(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lc.field_a == this &&
            !cf.field_r) {
            ao.field_b = k.a(0) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "bg.stop()");
        }
    }

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TetraLink.field_J;
        try {
          if (uh.field_b != null) {
            uh.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
            uh.field_b.getParent().setBackground(java.awt.Color.black);
            uh.field_b.getParent().remove((java.awt.Component) ((Object) uh.field_b));
          }
          boolean decompiledFrameRemainder0 = true;
          if (sa.field_b != null) {
            var2 = sa.field_b;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (ea.field_h != null) {
              var2 = ea.field_h;
              if (var4 != 0) {
                if (null != ik.field_c) {
                  var2 = ik.field_c;
                  var2 = lc.field_a;
                } else {
                  var2 = lc.field_a;
                }
              }
            } else {
              if (null != ik.field_c) {
                var2 = ik.field_c;
                if (var4 != 0) {
                  var2 = lc.field_a;
                }
              } else {
                var2 = lc.field_a;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          uh.field_b = (java.awt.Canvas) ((Object) new wb((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) uh.field_b));
          uh.field_b.setSize(n.field_M, d.field_h);
          uh.field_b.setVisible(true);
          boolean decompiledSharedTail0 = (ea.field_h == var2);
          if (!decompiledSharedTail0) {
            uh.field_b.setLocation(sa.field_g, wg.field_e);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = ea.field_h.getInsets();
            uh.field_b.setLocation(sa.field_g + var3.left, wg.field_e + var3.top);
          }
          uh.field_b.addFocusListener((java.awt.event.FocusListener) (this));
          uh.field_b.requestFocus();
          ac.field_e = true;
          fb.field_a = true;
          if (param0 > -42) {
            return;
          }
          ja.field_h = true;
          ha.field_h = false;
          wk.field_w = k.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oi.a((Throwable) (var2), "bg.UA(" + param0 + ')');
        }
    }

    final void a(int param0, byte param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          ie dupTemp$0 = null;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          vl var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = TetraLink.field_J;
          try {
            try {
              if (lc.field_a != null) {
                rf.field_b = rf.field_b + 1;
                if (rf.field_b < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(24044, "alreadyloaded");
                return;
              }
              wg.field_e = 0;
              n.field_M = param0;
              ba.field_Q = param0;
              cc.field_f = param6;
              if (param1 < 109) {
                return;
              }
              d.field_h = param5;
              te.field_R = param5;
              lc.field_a = this;
              sa.field_g = 0;
              lc.field_h = lk.q(13);
              dupTemp$0 = new ie(param4, param2, param3, true);
              nd.field_Pb = dupTemp$0;
              pj.field_b = dupTemp$0;
              var8 = nd.field_Pb.a((Runnable) (this), -65, 1);
              while (true) {
                if (0 == var8.field_d) {
                  tb.a(false, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              fk.a(-63, var8_ref, (String) null);
              this.a(24044, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var8_ref2;
            stackIn_23_1 = new StringBuilder().append("bg.VA(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean a(int param0, int param1, ah param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = param2.a(param0 + 141, param1);
          if (var3 == null) {
            return false;
          }
          if (param0 != -141) {
            bg.a((bh) null, (byte) 32);
          }
          hk.a(var3, -115);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("bg.QA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(bh param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_4_0 = 0;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.d((byte) -99);
          stackIn_4_0 = (1 == var2_int) ? 1 : 0;
          var3 = stackIn_4_0;
          var4 = 46 % ((param1 - 2) / 45);
          stackIn_5_0 = var3;
          return stackIn_5_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("bg.CB(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (this == lc.field_a &&
            !cf.field_r) {
            ja.field_h = true;
            if (ng.field_r &&
              k.a(0) - wk.field_w > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < ba.field_Q) {
                  return;
                }
                if (var2.height < te.field_R) {
                  return;
                }
              }
              ha.field_h = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("bg.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ea.field_h != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (ik.field_c != null &&
            ik.field_c != this) {
            stackIn_8_0 = ik.field_c.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("bg.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    abstract void a(int param0);

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (param0 != 32744) {
              return;
            }
            if (cf.field_r) {
              return;
            }
            cf.field_r = true;
          }
          if (ik.field_c != null) {
            ik.field_c.destroy();
          }
          try {
            this.b(1);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != uh.field_b) {
            try {
              uh.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
              uh.field_b.getParent().remove((java.awt.Component) ((Object) uh.field_b));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (nd.field_Pb != null) {
            try {
              nd.field_Pb.a(32632);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.h(param0 ^ 31426);
          if (null != ea.field_h) {
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
          throw oi.a((Throwable) ((Object) runtimeException), "bg.DB(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fb.field_a = true;
          ja.field_h = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("bg.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        if (this != lc.field_a ||
          cf.field_r) {
          return;
        }
        try {
          ao.field_b = 0L;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bg.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

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
          stackIn_5_1 = new StringBuilder().append("bg.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fb.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("bg.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void h(int param0);

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_78_0 = 0;
          int stackIn_78_1 = 0;
          int stackIn_97_0 = 0;
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
          var5 = TetraLink.field_J;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != ie.field_v) {
                var1 = ie.field_v.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = ie.field_x;
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
                    this.a(24044, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = fd.a(var2.charAt(var3), (byte) 113);
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_66_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ni.a((CharSequence) ((Object) var4), 10) &&
                        !(rc.a((CharSequence) ((Object) var4), 10) >= 10)) {
                        this.a(24044, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != ie.field_x))) {
                stackIn_66_0 = ie.field_x.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < ie.field_x.length()) {
                    var3 = ie.field_x.charAt(var1_int);
                    stackIn_78_0 = ~var3;
                    stackIn_78_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_78_0 <= stackIn_78_1 &&
                      57 >= var3)) {
                      var2_int = -48 + var3 + 10 * var2_int;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_78_0 = var2_int;
                    stackIn_78_1 = 5;
                  }
                  if (stackIn_78_0 < stackIn_78_1) {
                    break;
                  }
                  ng.field_r = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = lc.field_a;
                if (null != ik.field_c) {
                  var1 = ik.field_c;
                }
                var2_ref = ie.field_o;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                nd.d((byte) -63);
                this.d(-109);
                pk.field_O = en.a(d.field_h, (java.awt.Component) ((Object) uh.field_b), n.field_M, (byte) -103);
                this.a(-20173);
                wn.field_t = bi.a((byte) 53);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (ao.field_b != 0L) {
                    stackIn_97_0 = $cfr$lcmp(~k.a(0), ~ao.field_b);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_97_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    qh.field_n = wn.field_t.a((byte) -70, mb.field_B);
                    stackIn_97_0 = 0;
                  }
                  var3 = stackIn_97_0;
                  do {
                    if (!(qh.field_n > var3)) {
                      this.b((byte) 0);
                      li.a(nd.field_Pb, uh.field_b, (byte) -121);
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
              fk.a(-89, (Throwable) (var1), (String) null);
              this.a(24044, "crash");
            }
            this.a(32744, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw oi.a((Throwable) (var1), "bg.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Object var6 = null;
        Throwable decompiledCaughtException = null;
        Object var6_ref = null;
        try {
          var2_long = k.a(0);
          var4 = ui.field_c[tl.field_Q];
          ui.field_c[tl.field_Q] = var2_long;
          tl.field_Q = 1 + tl.field_Q & 31;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          var6_ref = this;
          synchronized (var6_ref) {
            if (!param0) {
              return;
            }
            ac.field_e = fb.field_a;
          }
          this.f(48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "bg.SA(" + param0 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("bg.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oi.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == lc.field_a &&
            !cf.field_r) {
            ao.field_b = k.a(0);
            tb.a(false, 5000L);
            pj.field_b = null;
            this.a(32744, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "bg.destroy()");
        }
    }

    protected bg() {
        this.field_b = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          var2_long = k.a(0);
          var4 = uh.field_c[h.field_b];
          uh.field_c[h.field_b] = var2_long;
          h.field_b = 31 & h.field_b + 1;
          if (param0 != 0) {
            field_n = (String) null;
          }
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            tc.field_v = (32000 + (var6_int >> 1)) / var6_int;
          }
          fieldTemp$1 = fn.field_O;
          fn.field_O = fn.field_O + 1;
          if (fieldTemp$1 > 50) {
            fn.field_O = fn.field_O - 50;
            ja.field_h = true;
            uh.field_b.setSize(n.field_M, d.field_h);
            uh.field_b.setVisible(true);
            boolean decompiledSharedTail0 = (null != ea.field_h &&
              sa.field_b == null);
            if (!decompiledSharedTail0) {
              uh.field_b.setLocation(sa.field_g, wg.field_e);
              decompiledSharedTail0 = (TetraLink.field_J != 0);
            }
            if (decompiledSharedTail0) {
              var6 = ea.field_h.getInsets();
              uh.field_b.setLocation(var6.left + sa.field_g, wg.field_e + var6.top);
            }
          }
          this.g(115);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oi.a((Throwable) ((Object) runtimeException), "bg.PA(" + param0 + ')');
        }
    }

    public static void e(int param0) {
        field_k = null;
        field_g = null;
        field_n = null;
        if (param0 != 6) {
          return;
        }
        try {
          field_f = null;
          field_c = null;
          field_j = (byte[][]) null;
        } catch (RuntimeException runtimeException) {
          throw oi.a((Throwable) ((Object) runtimeException), "bg.AB(" + param0 + ')');
        }
    }

    static {
        field_g = new char[]{'[', ']', '#'};
        field_n = "Go Back";
        field_j = new byte[250][];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
