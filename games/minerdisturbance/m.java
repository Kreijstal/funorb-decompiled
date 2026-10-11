/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class m extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int[] field_j;
    static ta field_c;
    static int field_e;
    boolean field_i;
    static ea field_m;
    static String[] field_g;
    public static boolean field_h;
    public static boolean field_b;
    public static int field_f;
    public static boolean field_k;
    public static int field_l;
    public static boolean field_a;
    public static boolean field_d;

    final void a(byte param0, String param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          int var3_int = 0;
          RuntimeException var3 = null;
          Throwable var4 = null;
          Exception var4_ref = null;
          try {
            if (this.field_i) {
              return;
            }
            var3_int = -100 % ((-77 - param0) / 41);
            this.field_i = true;
            System.out.println("error_game_" + param1);
            try {
              lk.a((byte) 18, "loggedout", bm.c(-86));
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var4 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3;
            stackIn_14_1 = new StringBuilder().append("m.LB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (j.field_h == this &&
            !tn.field_J) {
            mf.field_k = sf.a((byte) 124);
            gf.a(5000L, -10309);
            hd.field_g = null;
            this.a(true, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) runtimeException), "m.destroy()");
        }
    }

    abstract void b(boolean param0);

    abstract void a(boolean param0);

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = sf.a((byte) 100);
          var4 = si.field_f[pn.field_e];
          si.field_f[pn.field_e] = var2_long;
          pn.field_e = 31 & 1 + pn.field_e;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            fd.field_F = ((var6_int >> 1) + 32000) / var6_int;
          }
          var6 = this;
          synchronized (var6) {
            rd.field_f = pe.field_rb;
          }
          if (param0 != 0) {
            this.field_i = true;
          }
          this.b((byte) 76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw lj.a((Throwable) ((Object) runtimeException), "m.HB(" + param0 + ')');
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public static void f(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_m = null;
          if (param0 != -1) {
            m.provideLoaderApplet((java.applet.Applet) null);
          }
          field_j = null;
          field_c = null;
          field_g = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "m.GB(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (j.field_h == this &&
            !tn.field_J) {
            bh.field_cb = true;
            if (dh.field_e &&
              -pk.field_e + sf.a((byte) 113) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < nf.field_h) {
                  return;
                }
                if (an.field_h > var2.height) {
                  return;
                }
              }
              fa.field_a = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("m.paint(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    abstract void b(byte param0);

    final boolean a(byte param0) {
        return true;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (j.field_h != this ||
          tn.field_J) {
          return;
        }
        try {
          mf.field_k = 0L;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "m.start()");
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nd.field_f != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (of.field_b != null &&
            this != of.field_b) {
            stackIn_12_0 = of.field_b.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "m.getAppletContext()");
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_84_0 = 0;
          int stackIn_84_1 = 0;
          int stackIn_101_0 = 0;
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
          var5 = MinerDisturbance.field_ab;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != vf.field_s) {
                var1 = vf.field_s.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = vf.field_b;
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
                    this.a((byte) 70, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = g.a(var2.charAt(var3), (byte) -68);
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
                      if (oi.a(-19804, (CharSequence) ((Object) var4)) &&
                        !(md.a((CharSequence) ((Object) var4), true) >= 10)) {
                        this.a((byte) -128, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (vf.field_b != null))) {
                stackIn_68_0 = vf.field_b.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < vf.field_b.length()) {
                    var3 = vf.field_b.charAt(var1_int);
                    stackIn_84_0 = -49;
                    stackIn_84_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_84_0 >= stackIn_84_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = var3 + (-48 + 10 * var2_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_84_0 = -6;
                    stackIn_84_1 = ~var2_int;
                  }
                  if (stackIn_84_0 < stackIn_84_1) {
                    break;
                  }
                  dh.field_e = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = j.field_h;
                if (of.field_b != null) {
                  var1 = of.field_b;
                }
                var2_ref = vf.field_h;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                mb.a((byte) -71);
                this.c(-10);
                bj.field_e = ab.a((byte) -98, nk.field_x, (java.awt.Component) ((Object) ef.field_c), ml.field_a);
                this.a(47);
                eb.field_d = ik.f((byte) -2);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (mf.field_k != 0L) {
                    stackIn_101_0 = $cfr$lcmp(mf.field_k, sf.a((byte) -74));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_101_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ig.field_b = eb.field_d.a(rj.field_c, -114);
                    stackIn_101_0 = 0;
                  }
                  var3 = stackIn_101_0;
                  do {
                    if (!(ig.field_b > var3)) {
                      this.d(-23036);
                      jk.a(-23765, qa.field_a, ef.field_c);
                      break;
                    }
                    this.e(0);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              di.a((Throwable) (var1), 1, (String) null);
              this.a((byte) -125, "crash");
            }
            this.a(true, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw lj.a((Throwable) (var1), "m.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          var3_ref = this;
          synchronized (var3_ref) {
            if (tn.field_J) {
              return;
            }
            tn.field_J = param0;
          }
          if (of.field_b != null) {
            of.field_b.destroy();
          }
          try {
            this.a(false);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ef.field_c) {
            try {
              ef.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
              ef.field_c.getParent().remove((java.awt.Component) ((Object) ef.field_c));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (qa.field_a != null) {
            try {
              qa.field_a.a(-29109);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.b(1);
          if (nd.field_f != null) {
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
          throw lj.a((Throwable) ((Object) runtimeException), "m.JB(" + param0 + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          pe.field_rb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("m.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          if (param0 != -23036) {
            return;
          }
          var2_long = sf.a((byte) -26);
          var4 = fb.field_e[wb.field_p];
          fb.field_e[wb.field_p] = var2_long;
          wb.field_p = wb.field_p + 1 & 31;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            nd.field_b = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = jb.field_p;
          jb.field_p = jb.field_p + 1;
          if (50 < fieldTemp$1) {
            jb.field_p = jb.field_p - 50;
            bh.field_cb = true;
            ef.field_c.setSize(nk.field_x, ml.field_a);
            ef.field_c.setVisible(true);
            boolean decompiledSharedTail0 = (null != nd.field_f &&
              null == hd.field_h);
            if (!decompiledSharedTail0) {
              ef.field_c.setLocation(tg.field_f, qi.field_j);
              decompiledSharedTail0 = (MinerDisturbance.field_ab != 0);
            }
            if (decompiledSharedTail0) {
              var6 = nd.field_f.getInsets();
              ef.field_c.setLocation(var6.left + tg.field_f, var6.top + qi.field_j);
            }
          }
          this.b(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) runtimeException), "m.NB(" + param0 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("m.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (nd.field_f != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != of.field_b &&
            of.field_b != this) {
            stackIn_10_0 = of.field_b.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw lj.a((Throwable) ((Object) var1), "m.getDocumentBase()");
        }
    }

    public abstract void init();

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          of.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("m.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void c(int param0) {
        Object var2 = null;
        int var3 = 0;
        java.awt.Insets var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var5 = MinerDisturbance.field_ab;
        try {
          if (null != ef.field_c) {
            ef.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
            ef.field_c.getParent().setBackground(java.awt.Color.black);
            ef.field_c.getParent().remove((java.awt.Component) ((Object) ef.field_c));
          }
          boolean decompiledFrameRemainder0 = true;
          if (hd.field_h != null) {
            var2 = hd.field_h;
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (nd.field_f == null) {
              if (null == of.field_b) {
                var2 = j.field_h;
                if (var5 != 0) {
                  var2 = of.field_b;
                  var2 = nd.field_f;
                }
              } else {
                var2 = of.field_b;
                if (var5 != 0) {
                  var2 = nd.field_f;
                }
              }
            } else {
              var2 = nd.field_f;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ef.field_c = (java.awt.Canvas) ((Object) new dc((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ef.field_c));
          ef.field_c.setSize(nk.field_x, ml.field_a);
          var3 = 9 / ((53 - param0) / 42);
          ef.field_c.setVisible(true);
          if (var2 == nd.field_f) {
            var4 = nd.field_f.getInsets();
            ef.field_c.setLocation(var4.left + tg.field_f, var4.top + qi.field_j);
            if (var5 != 0) {
              ef.field_c.setLocation(tg.field_f, qi.field_j);
            }
          } else {
            ef.field_c.setLocation(tg.field_f, qi.field_j);
          }
          ef.field_c.addFocusListener((java.awt.event.FocusListener) (this));
          ef.field_c.requestFocus();
          rd.field_f = true;
          pe.field_rb = true;
          bh.field_cb = true;
          fa.field_a = false;
          pk.field_e = sf.a((byte) 113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw lj.a((Throwable) (var2), "m.MB(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (nd.field_f != null) {
          return null;
        }
        if (null != of.field_b &&
          this != of.field_b) {
          return of.field_b.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void stop() {
        if (this != j.field_h ||
          tn.field_J) {
          return;
        }
        try {
          mf.field_k = sf.a((byte) -2) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw lj.a((Throwable) ((Object) runtimeException), "m.stop()");
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
          stackIn_5_1 = new StringBuilder().append("m.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void b(int param0);

    protected m() {
        this.field_i = false;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          pe.field_rb = true;
          bh.field_cb = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("m.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          if (nd.field_f != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != of.field_b &&
            this != of.field_b) {
            stackIn_8_0 = of.field_b.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("m.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw lj.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        try {
          vf dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          ia var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = MinerDisturbance.field_ab;
          try {
            try {
              if (null != j.field_h) {
                ij.field_v = ij.field_v + 1;
                if (ij.field_v < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a((byte) -31, "alreadyloaded");
                return;
              }
              tb.field_h = param2;
              ml.field_a = param5;
              an.field_h = param5;
              nk.field_x = param0;
              nf.field_h = param0;
              tg.field_f = 0;
              qi.field_j = 0;
              if (param3 != 3) {
                field_m = (ea) null;
              }
              j.field_h = this;
              aj.field_d = bm.c(-108);
              dupTemp$0 = new vf(param6, param4, param1, true);
              qa.field_a = dupTemp$0;
              hd.field_g = dupTemp$0;
              var8 = qa.field_a.a((Runnable) (this), (byte) 52, 1);
              while (true) {
                if (0 == var8.field_c) {
                  gf.a(10L, -10309);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              di.a(var8_ref, 1, (String) null);
              this.a((byte) -121, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("m.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw lj.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_c = null;
        field_e = 0;
        field_j = new int[36864];
        field_g = new String[26];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
