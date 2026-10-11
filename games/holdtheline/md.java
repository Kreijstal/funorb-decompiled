/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class md extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static go[] field_j;
    boolean field_b;
    static gn field_i;
    static String field_c;
    public static boolean field_h;
    public static int field_k;
    public static int field_g;
    public static boolean field_f;
    public static boolean field_a;
    public static int field_e;
    public static boolean field_d;

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vf.field_j == this &&
            !cf.field_y) {
            im.field_c = 4000L + bb.b(-1);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "md.stop()");
        }
    }

    public static void g(int param0) {
        field_c = null;
        field_i = null;
        if (param0 != -1) {
          return;
        }
        try {
          field_j = null;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "md.KA(" + param0 + ')');
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fm.field_a != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != ne.field_b &&
            ne.field_b != this) {
            stackIn_10_0 = ne.field_b.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "md.getAppletContext()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (fm.field_a != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (ne.field_b != null &&
            ne.field_b != this) {
            stackIn_12_0 = ne.field_b.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var1), "md.getDocumentBase()");
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
          stackIn_5_1 = new StringBuilder().append("md.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static fn a(int param0, byte[] param1) {
        fn var2 = null;
        RuntimeException var2_ref = null;
        Object stackIn_7_0 = null;
        fn stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -24327) {
            md.provideLoaderApplet((java.applet.Applet) null);
          }
          if (null == param1) {
            stackIn_7_0 = null;
            return (fn) (stackIn_7_0);
          }
          var2 = new fn(param1, la.field_j, wb.field_g, nk.field_K, ad.field_d, lk.field_e);
          tk.a(false);
          stackIn_9_0 = var2;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_13_0 = var2_ref;
          stackIn_13_1 = new StringBuilder().append("md.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void a(byte param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        java.awt.Insets var6 = null;
        try {
          if (param0 < 14) {
            field_j = (go[]) null;
          }
          var2_long = bb.b(-1);
          var4 = bf.field_b[d.field_e];
          bf.field_b[d.field_e] = var2_long;
          if (0L != var4 &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            lk.field_f = ((var6_int >> 1) + 32000) / var6_int;
          }
          d.field_e = 31 & d.field_e + 1;
          fieldTemp$1 = ek.field_j;
          ek.field_j = ek.field_j + 1;
          if (50 < fieldTemp$1) {
            cg.field_a = true;
            ek.field_j = ek.field_j - 50;
            kd.field_b.setSize(lj.field_f, g.field_i);
            kd.field_b.setVisible(true);
            boolean decompiledSharedTail0 = (null != fm.field_a &&
              null == mg.field_f);
            if (!decompiledSharedTail0) {
              kd.field_b.setLocation(vm.field_Bb, ko.field_b);
              decompiledSharedTail0 = (HoldTheLine.field_D != 0);
            }
            if (decompiledSharedTail0) {
              var6 = fm.field_a.getInsets();
              kd.field_b.setLocation(var6.left + vm.field_Bb, ko.field_b + var6.top);
            }
          }
          this.c(256);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var2), "md.JA(" + param0 + ')');
        }
    }

    abstract void b(int param0);

    abstract void f(int param0);

    abstract void b(byte param0);

    public abstract void init();

    final synchronized void c(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HoldTheLine.field_D;
        try {
          if (kd.field_b != null) {
            kd.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
            kd.field_b.getParent().setBackground(java.awt.Color.black);
            kd.field_b.getParent().remove((java.awt.Component) ((Object) kd.field_b));
          }
          boolean decompiledFrameRemainder0 = true;
          if (mg.field_f != null) {
            var2 = mg.field_f;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null == fm.field_a) {
              if (ne.field_b != null) {
                var2 = ne.field_b;
                if (var4 != 0) {
                  var2 = vf.field_j;
                  var2 = fm.field_a;
                }
              } else {
                var2 = vf.field_j;
                if (var4 != 0) {
                  var2 = fm.field_a;
                }
              }
            } else {
              var2 = fm.field_a;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          kd.field_b = (java.awt.Canvas) ((Object) new mi((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) kd.field_b));
          kd.field_b.setSize(lj.field_f, g.field_i);
          kd.field_b.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == fm.field_a);
          if (!decompiledSharedTail0) {
            kd.field_b.setLocation(vm.field_Bb, ko.field_b);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = fm.field_a.getInsets();
            kd.field_b.setLocation(var3.left + vm.field_Bb, ko.field_b + var3.top);
          }
          kd.field_b.addFocusListener((java.awt.event.FocusListener) (this));
          kd.field_b.requestFocus();
          if (param0 <= 25) {
            return;
          }
          td.field_c = true;
          vk.field_a = true;
          cg.field_a = true;
          ud.field_n = false;
          n.field_n = bb.b(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw kk.a((Throwable) (var2), "md.CA(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != fm.field_a) {
          return null;
        }
        if (ne.field_b != null &&
          this != ne.field_b) {
          return ne.field_b.getCodeBase();
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
          td.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("md.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_b) {
              return;
            }
            this.field_b = true;
            System.out.println("error_game_" + param0);
            try {
              eo.a(21896, "loggedout", en.a(param1 ^ 182));
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
              if (param1 != 221) {
                field_i = (gn) null;
              }
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("md.EA(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (this != vf.field_j ||
          cf.field_y) {
          return;
        }
        try {
          im.field_c = 0L;
        } catch (RuntimeException runtimeException) {
          throw kk.a((Throwable) ((Object) runtimeException), "md.start()");
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
          td.field_c = true;
          cg.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("md.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (vf.field_j == this &&
            !cf.field_y) {
            cg.field_a = true;
            if (hl.field_b &&
              -n.field_n + bb.b(-1) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < sa.field_b) {
                  return;
                }
                if (rg.field_j > var2.height) {
                  return;
                }
              }
              ud.field_n = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_27_0 = var2_ref;
          stackIn_27_1 = new StringBuilder().append("md.paint(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    final void a(String param0, int param1, int param2, int param3, byte param4, int param5, int param6) {
        try {
          ib dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          af var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = HoldTheLine.field_D;
          try {
            try {
              if (null != vf.field_j) {
                cb.field_l = cb.field_l + 1;
                if (cb.field_l >= 3) {
                  this.a("alreadyloaded", 221);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              ko.field_b = 0;
              vf.field_j = this;
              if (param4 >= -74) {
                this.update((java.awt.Graphics) null);
              }
              lj.field_f = param1;
              sa.field_b = param1;
              vm.field_Bb = 0;
              im.field_a = param5;
              g.field_i = param3;
              rg.field_j = param3;
              rd.field_d = en.a(105);
              dupTemp$0 = new ib(param6, param0, param2, true);
              wi.field_b = dupTemp$0;
              te.field_d = dupTemp$0;
              var8 = wi.field_b.a((byte) -28, 1, (Runnable) (this));
              while (true) {
                if (0 == var8.field_d) {
                  qe.a(10L, (byte) 45);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              bl.a(var8_ref, (byte) -46, (String) null);
              this.a("crash", 221);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("md.AA(");
            if (param0 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw kk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        RuntimeException var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (cf.field_y) {
              return;
            }
            cf.field_y = true;
          }
          if (ne.field_b != null) {
            ne.field_b.destroy();
          }
          try {
            this.b(30);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (param1 != 0) {
            return;
          }
          if (kd.field_b != null) {
            try {
              kd.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
              kd.field_b.getParent().remove((java.awt.Component) ((Object) kd.field_b));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != wi.field_b) {
            try {
              wi.field_b.a((byte) 55);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.f(128);
          if (fm.field_a != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw kk.a((Throwable) ((Object) var3_ref2), "md.GA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = bb.b(-1);
          var4 = lb.field_w[de.field_G];
          lb.field_w[de.field_G] = var2_long;
          de.field_G = de.field_G + 1 & 31;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          var6 = this;
          synchronized (var6) {
            vk.field_a = td.field_c;
            if (param0 != 0) {
              this.e(-122);
            }
          }
          this.a(-88);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "md.HA(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vf.field_j == this &&
            !cf.field_y) {
            im.field_c = bb.b(-1);
            qe.a(5000L, (byte) 45);
            te.field_d = null;
            this.a(false, 0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw kk.a((Throwable) ((Object) runtimeException), "md.destroy()");
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    protected md() {
        this.field_b = false;
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
          stackIn_5_1 = new StringBuilder().append("md.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          if (null != fm.field_a) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (ne.field_b != null &&
            this != ne.field_b) {
            stackIn_10_0 = ne.field_b.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("md.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_81_1 = 0;
          int stackIn_100_0 = 0;
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
          var5 = HoldTheLine.field_D;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (ib.field_p != null) {
                var1 = ib.field_p.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = ib.field_j;
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
                    this.a("wrongjava", 221);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_66_0 = ii.a(48, var2.charAt(var3));
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
                      if (ik.a((CharSequence) ((Object) var4), true) &&
                        !(mo.a((CharSequence) ((Object) var4), (byte) -116) >= 10)) {
                        this.a("wrongjava", 221);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != ib.field_j))) {
                stackIn_66_0 = ib.field_j.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (ib.field_j.length() > var1_int) {
                    var3 = ib.field_j.charAt(var1_int);
                    stackIn_81_0 = -49;
                    stackIn_81_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 >= stackIn_81_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = 10 * var2_int + var3 - 48;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = ~var2_int;
                    stackIn_81_1 = -6;
                  }
                  if (stackIn_81_0 > stackIn_81_1) {
                    break;
                  }
                  hl.field_b = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = vf.field_j;
                if (null != ne.field_b) {
                  var1 = ne.field_b;
                }
                var2_ref = ib.field_c;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                kh.a(false);
                this.c((byte) 36);
                b.field_c = rd.a(g.field_i, -89, (java.awt.Component) ((Object) kd.field_b), lj.field_f);
                this.b((byte) 101);
                oi.field_e = od.a(false);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (im.field_c != 0L) {
                    stackIn_100_0 = $cfr$lcmp(bb.b(-1), im.field_c);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    uj.field_h = oi.field_e.b(tm.field_c, 68);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(var3 < uj.field_h)) {
                      this.a((byte) 32);
                      vn.a(0, kd.field_b, wi.field_b);
                      break;
                    }
                    this.d(0);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              bl.a((Throwable) (var1), (byte) -128, (String) null);
              this.a("crash", 221);
            }
            this.a(true, 0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw kk.a((Throwable) (var1), "md.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void c(int param0);

    final boolean e(int param0) {
        return true;
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ne.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("md.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw kk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
        field_c = "Passwords can only contain letters and numbers";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
