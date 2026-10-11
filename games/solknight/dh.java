/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class dh extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_c;
    static int field_h;
    static o field_j;
    static o[] field_f;
    static int field_i;
    public static boolean field_l;
    public static boolean field_g;
    public static boolean field_d;
    public static int field_k;
    public static boolean field_a;
    public static boolean field_b;
    public static int field_e;

    abstract void e(int param0);

    abstract void c(byte param0);

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == ib.field_l &&
            !fc.field_m) {
            lj.field_G = je.a(1) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) runtimeException), "dh.stop()");
        }
    }

    private final void a(byte param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          var2_long = je.a(1);
          var4 = pg.field_d[jl.field_f];
          pg.field_d[jl.field_f] = var2_long;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          jl.field_f = 31 & jl.field_f + 1;
          if (param0 <= 68) {
            return;
          }
          var6 = this;
          synchronized (var6) {
            wh.field_b = kk.field_b;
          }
          this.e(-27);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var2), "dh.C(" + param0 + ')');
        }
    }

    final void a(String param0, int param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_c) {
              return;
            }
            this.field_c = true;
            System.out.println("error_game_" + param0);
            try {
              fd.a(ia.g(99), "loggedout", (byte) 127);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
            if (param1 != -1) {
              field_f = (o[]) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = runtimeException;
            stackIn_16_1 = new StringBuilder().append("dh.A(");
            if (param0 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void f(int param0);

    final boolean c(int param0) {
        return true;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ib.field_l == this &&
            !fc.field_m) {
            lj.field_G = je.a(1);
            i.a((byte) 125, 5000L);
            lg.field_l = null;
            this.a(false, true);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) runtimeException), "dh.destroy()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          s.field_jb = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dh.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void d(int param0);

    private final void a(boolean param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (fc.field_m) {
              return;
            }
            fc.field_m = param1;
          }
          if (null != s.field_jb) {
            s.field_jb.destroy();
          }
          try {
            this.f(-1);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != dc.field_q) {
            try {
              dc.field_q.removeFocusListener((java.awt.event.FocusListener) (this));
              dc.field_q.getParent().remove((java.awt.Component) ((Object) dc.field_q));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (wh.field_c != null) {
            try {
              wh.field_c.a((byte) 29);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c((byte) -104);
          if (oc.field_a != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw fc.a((Throwable) ((Object) runtimeException), "dh.F(" + param0 + ',' + param1 + ')');
        }
    }

    public final void start() {
        if (ib.field_l != this ||
          fc.field_m) {
          return;
        }
        try {
          lj.field_G = 0L;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "dh.start()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oc.field_a != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (s.field_jb != null &&
            s.field_jb != this) {
            stackIn_10_0 = s.field_jb.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "dh.getDocumentBase()");
        }
    }

    final static long b(int param0) {
        RuntimeException var1 = null;
        long stackIn_4_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -1) {
            field_f = (o[]) null;
          }
          stackIn_4_0 = -md.field_y + je.a(param0 ^ -2);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "dh.P(" + param0 + ')');
        }
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
          stackIn_5_1 = new StringBuilder().append("dh.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    protected dh() {
        this.field_c = false;
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
          stackIn_5_1 = new StringBuilder().append("dh.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_80_0 = 0;
          int stackIn_80_1 = 0;
          int stackIn_99_0 = 0;
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
          var5 = SolKnight.field_L ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != dl.field_a) {
                var1 = dl.field_a.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = dl.field_x;
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
                    this.a("wrongjava", -1);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = gh.a(var2.charAt(var3), (byte) -124);
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
                      if (ec.a(30418, (CharSequence) ((Object) var4)) &&
                        !(il.a((CharSequence) ((Object) var4), 6054) >= 10)) {
                        this.a("wrongjava", -1);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (dl.field_x != null))) {
                stackIn_68_0 = dl.field_x.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (dl.field_x.length() > var1_int) {
                    var3 = dl.field_x.charAt(var1_int);
                    stackIn_80_0 = var3;
                    stackIn_80_1 = 48;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_80_0 >= stackIn_80_1 &&
                      var3 <= 57)) {
                      var2_int = 10 * var2_int - (-var3 + 48);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_80_0 = 5;
                    stackIn_80_1 = var2_int;
                  }
                  if (stackIn_80_0 > stackIn_80_1) {
                    break;
                  }
                  bg.field_u = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ib.field_l;
                if (null != s.field_jb) {
                  var1 = s.field_jb;
                }
                var2_ref = dl.field_e;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                be.i(4);
                this.a(true);
                hj.field_e = nc.a(ec.field_h, cf.field_d, (byte) -35, (java.awt.Component) ((Object) dc.field_q));
                this.d(-31680);
                fh.field_e = ee.e(-1);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != lj.field_G) {
                    stackIn_99_0 = $cfr$lcmp(lj.field_G, je.a(1));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_99_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    mj.field_b = fh.field_e.a(0, ta.field_a);
                    stackIn_99_0 = 0;
                  }
                  var3 = stackIn_99_0;
                  do {
                    if (!(var3 < mj.field_b)) {
                      this.b((byte) -99);
                      pb.a(wh.field_c, dc.field_q, (byte) -80);
                      break;
                    }
                    this.a((byte) 123);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              hi.a((Throwable) (var1), (String) null, 1);
              this.a("crash", -1);
            }
            this.a(true, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw fc.a((Throwable) (var1), "dh.run()");
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
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oc.field_a != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != s.field_jb &&
            s.field_jb != this) {
            stackIn_10_0 = s.field_jb.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("dh.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (this == ib.field_l &&
            !fc.field_m) {
            wa.field_b = true;
            if (bg.field_u &&
              1000L < -lc.field_s + je.a(1)) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < rc.field_l) {
                  return;
                }
                if (var2.height < ph.field_c) {
                  return;
                }
              }
              jd.field_p = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("dh.paint(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    final static void a(mf param0, java.awt.Component param1, boolean param2, byte param3, int param4, dl param5) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != -40) {
            return;
          }
          ub.a(param5, param2, param4, 1024, param1, param0, false, param4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("dh.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SolKnight.field_L ? 1 : 0;
        try {
          if (dc.field_q != null) {
            dc.field_q.removeFocusListener((java.awt.event.FocusListener) (this));
            dc.field_q.getParent().setBackground(java.awt.Color.black);
            dc.field_q.getParent().remove((java.awt.Component) ((Object) dc.field_q));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == bg.field_w) {
            if (oc.field_a != null) {
              var2 = oc.field_a;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (s.field_jb == null) {
                var2 = ib.field_l;
                if (var4 != 0) {
                  var2 = s.field_jb;
                  var2 = bg.field_w;
                }
              } else {
                var2 = s.field_jb;
                if (var4 != 0) {
                  var2 = bg.field_w;
                }
              }
            }
          } else {
            var2 = bg.field_w;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          dc.field_q = (java.awt.Canvas) ((Object) new wk((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) dc.field_q));
          dc.field_q.setSize(ec.field_h, cf.field_d);
          dc.field_q.setVisible(true);
          boolean decompiledSharedTail0 = (oc.field_a == var2);
          if (!decompiledSharedTail0) {
            dc.field_q.setLocation(ib.field_j, nc.field_g);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = oc.field_a.getInsets();
            dc.field_q.setLocation(var3.left + ib.field_j, nc.field_g + var3.top);
          }
          dc.field_q.addFocusListener((java.awt.event.FocusListener) (this));
          dc.field_q.requestFocus();
          wh.field_b = param0;
          kk.field_b = true;
          wa.field_b = true;
          jd.field_p = false;
          lc.field_s = je.a(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fc.a((Throwable) (var2), "dh.E(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          if (param0 != -99) {
            return;
          }
          var2_long = je.a(1);
          var4 = qf.field_c[uc.field_f];
          qf.field_c[uc.field_f] = var2_long;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          uc.field_f = 1 + uc.field_f & 31;
          fieldTemp$1 = jb.field_e;
          jb.field_e = jb.field_e + 1;
          if (fieldTemp$1 > 50) {
            wa.field_b = true;
            jb.field_e = jb.field_e - 50;
            dc.field_q.setSize(ec.field_h, cf.field_d);
            dc.field_q.setVisible(true);
            boolean decompiledSharedTail0 = (null != oc.field_a &&
              null == bg.field_w);
            if (!decompiledSharedTail0) {
              dc.field_q.setLocation(ib.field_j, nc.field_g);
              decompiledSharedTail0 = (SolKnight.field_L);
            }
            if (decompiledSharedTail0) {
              var6 = oc.field_a.getInsets();
              dc.field_q.setLocation(var6.left + ib.field_j, nc.field_g + var6.top);
            }
          }
          this.a(param0 ^ 11538);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) runtimeException), "dh.B(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(String param0, boolean param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            dh.d((byte) 96);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("dh.O(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != oc.field_a) {
          return null;
        }
        if (s.field_jb != null &&
          s.field_jb != this) {
          return s.field_jb.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kk.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dh.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        field_j = null;
        if (param0 != -41) {
          return;
        }
        try {
          field_f = null;
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "dh.I(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kk.field_b = true;
          wa.field_b = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dh.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          dl dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          nj var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = SolKnight.field_L ? 1 : 0;
          try {
            try {
              if (ib.field_l != null) {
                rk.field_c = rk.field_c + 1;
                if (rk.field_c >= 3) {
                  this.a("alreadyloaded", -1);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              if (param0 <= 62) {
                field_j = (o) null;
              }
              ec.field_h = param2;
              rc.field_l = param2;
              ib.field_l = this;
              ib.field_j = 0;
              cf.field_d = param5;
              ph.field_c = param5;
              ke.field_J = param6;
              nc.field_g = 0;
              ik.field_c = ia.g(-33);
              dupTemp$0 = new dl(param3, param1, param4, true);
              wh.field_c = dupTemp$0;
              lg.field_l = dupTemp$0;
              var8 = wh.field_c.a(1, -95, (Runnable) (this));
              while (true) {
                if (var8.field_c == 0) {
                  i.a((byte) 114, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              hi.a(var8_ref, (String) null, 1);
              this.a("crash", -1);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("dh.J(").append(param0).append(',');
            if (param1 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw fc.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != oc.field_a) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != s.field_jb &&
            s.field_jb != this) {
            stackIn_8_0 = s.field_jb.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "dh.getAppletContext()");
        }
    }

    static {
        field_i = 4;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
