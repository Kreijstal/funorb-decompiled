/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class te extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_i;
    static String field_g;
    static vk field_c;
    static String field_d;
    boolean field_e;
    public static int field_k;
    public static boolean field_h;
    public static boolean field_f;
    public static int field_l;
    public static int field_b;
    public static boolean field_j;
    public static boolean field_a;

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (rj.field_e == this &&
            !da.field_b) {
            ve.field_f = true;
            if (si.field_b &&
              ri.a(-3) - kj.field_a > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (kn.field_c > var2.width) {
                  return;
                }
                if (var2.height < la.field_R) {
                  return;
                }
              }
              ac.field_a = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_20_0 = var2_ref;
          stackIn_20_1 = new StringBuilder().append("te.paint(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fc.field_f = true;
          ve.field_f = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("te.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final void a(String param0, boolean param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_e) {
              return;
            }
            this.field_e = true;
            System.out.println("error_game_" + param0);
            try {
              kf.a(89, "loggedout", ii.b(param1));
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
              if (param1) {
                this.h(47);
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
            stackIn_14_1 = new StringBuilder().append("te.A(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = ri.a(param0 ^ -30);
          var4 = of.field_c[fm.field_b];
          of.field_c[fm.field_b] = var2_long;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          fm.field_b = param0 & fm.field_b + 1;
          var6 = this;
          synchronized (var6) {
            on.field_e = fc.field_f;
          }
          this.e(-1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "te.L(" + param0 + ')');
        }
    }

    final synchronized void g(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          if (param0 < 119) {
            field_i = (String) null;
          }
          if (fb.field_b != null) {
            fb.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
            fb.field_b.getParent().setBackground(java.awt.Color.black);
            fb.field_b.getParent().remove((java.awt.Component) ((Object) fb.field_b));
          }
          if (null == sf.field_o) {
            if (wh.field_cb == null) {
              if (kc.field_d != null) {
                var2 = kc.field_d;
                if (var4 != 0) {
                  var2 = rj.field_e;
                  var2 = wh.field_cb;
                  var2 = sf.field_o;
                }
              } else {
                var2 = rj.field_e;
                if (var4 != 0) {
                  var2 = wh.field_cb;
                  var2 = sf.field_o;
                }
              }
            } else {
              var2 = wh.field_cb;
              if (var4 != 0) {
                var2 = sf.field_o;
              }
            }
          } else {
            var2 = sf.field_o;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          fb.field_b = (java.awt.Canvas) ((Object) new ie((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) fb.field_b));
          fb.field_b.setSize(wm.field_ab, im.field_b);
          fb.field_b.setVisible(true);
          if (var2 == wh.field_cb) {
            var3 = wh.field_cb.getInsets();
            fb.field_b.setLocation(var3.left + ei.field_kb, vf.field_c + var3.top);
            if (var4 != 0) {
              fb.field_b.setLocation(ei.field_kb, vf.field_c);
            }
          } else {
            fb.field_b.setLocation(ei.field_kb, vf.field_c);
          }
          fb.field_b.addFocusListener((java.awt.event.FocusListener) (this));
          fb.field_b.requestFocus();
          fc.field_f = true;
          on.field_e = true;
          ve.field_f = true;
          ac.field_a = false;
          kj.field_a = ri.a(-3);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sd.a((Throwable) (var2), "te.C(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("te.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          if (null != wh.field_cb) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != kc.field_d &&
            this != kc.field_d) {
            stackIn_10_0 = kc.field_d.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("te.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static vk a(byte param0, int param1, mi param2, int param3, m param4) {
        byte[] var5 = null;
        RuntimeException var5_ref = null;
        Object stackIn_5_0 = null;
        vk stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -89) {
            field_i = (String) null;
          }
          var5 = param2.a((byte) -2, param3, param1);
          if (null != var5) {
            stackIn_7_0 = new vk(new kg(var5), param4);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (vk) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_11_0 = var5_ref;
          stackIn_11_1 = new StringBuilder().append("te.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final boolean a(boolean param0) {
        return true;
    }

    public abstract void init();

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (rj.field_e == this &&
            !da.field_b) {
            hk.field_d = ri.a(-3);
            jd.a(1, 5000L);
            hh.field_c = null;
            this.a(29121, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "te.destroy()");
        }
    }

    abstract void c(int param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wh.field_cb != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != kc.field_d &&
            kc.field_d != this) {
            stackIn_10_0 = kc.field_d.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "te.getAppletContext()");
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (wh.field_cb != null) {
          return null;
        }
        if (null != kc.field_d &&
          kc.field_d != this) {
          return kc.field_d.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
          var5 = Confined.field_J ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (df.field_b != null) {
                var1 = df.field_b.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = df.field_s;
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
                    this.a("wrongjava", false);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = hc.a(var2.charAt(var3), -58);
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
                      if (vl.a((CharSequence) ((Object) var4), -182) &&
                        !(10 <= cc.a(true, (CharSequence) ((Object) var4)))) {
                        this.a("wrongjava", false);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (df.field_s != null))) {
                stackIn_66_0 = df.field_s.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < df.field_s.length()) {
                    var3 = df.field_s.charAt(var1_int);
                    stackIn_81_0 = -49;
                    stackIn_81_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 >= stackIn_81_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = var3 - 48 + 10 * var2_int;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = 5;
                    stackIn_81_1 = var2_int;
                  }
                  if (stackIn_81_0 > stackIn_81_1) {
                    break;
                  }
                  si.field_b = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = rj.field_e;
                if (kc.field_d != null) {
                  var1 = kc.field_d;
                }
                var2_ref = df.field_r;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                g.b(-1);
                this.g(125);
                pi.field_S = on.a((java.awt.Component) ((Object) fb.field_b), im.field_b, wm.field_ab, 1359);
                this.f(-3998);
                kh.field_gb = og.e(1);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (hk.field_d != 0L) {
                    stackIn_100_0 = $cfr$lcmp(~ri.a(-3), ~hk.field_d);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    Confined.field_D = kh.field_gb.b(0, ij.field_u);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(Confined.field_D > var3)) {
                      this.a((byte) 11);
                      mb.a(fb.field_b, 1001, ki.field_d);
                      break;
                    }
                    this.a(31);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              mb.a((String) null, true, (Throwable) (var1));
              this.a("crash", false);
            }
            this.a(29121, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw sd.a((Throwable) (var1), "te.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != wh.field_cb) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != kc.field_d &&
            this != kc.field_d) {
            stackIn_12_0 = kc.field_d.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "te.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kc.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("te.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("te.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_i = null;
        field_g = null;
        if (param0 != 32575) {
          return;
        }
        try {
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "te.J(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fc.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("te.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        if (this != rj.field_e ||
          da.field_b) {
          return;
        }
        try {
          hk.field_d = 4000L + ri.a(-3);
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "te.stop()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          df dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          bc var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Confined.field_J ? 1 : 0;
          try {
            try {
              if (rj.field_e != null) {
                ve.field_a = ve.field_a + 1;
                if (ve.field_a < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", false);
                return;
              }
              uh.field_f = param1;
              wm.field_ab = param2;
              kn.field_c = param2;
              rj.field_e = this;
              ei.field_kb = 0;
              im.field_b = param0;
              la.field_R = param0;
              if (param3 < 42) {
                field_d = (String) null;
              }
              vf.field_c = 0;
              kc.field_k = ii.b(false);
              dupTemp$0 = new df(param5, param6, param4, true);
              ki.field_d = dupTemp$0;
              hh.field_c = dupTemp$0;
              var8 = ki.field_d.a((byte) 101, (Runnable) (this), 1);
              while (true) {
                if (var8.field_g == 0) {
                  jd.a(1, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              mb.a((String) null, true, var8_ref);
              this.a("crash", false);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("te.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw sd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void f(int param0);

    public final void start() {
        if (rj.field_e != this ||
          da.field_b) {
          return;
        }
        try {
          hk.field_d = 0L;
        } catch (RuntimeException runtimeException) {
          throw sd.a((Throwable) ((Object) runtimeException), "te.start()");
        }
    }

    private final void a(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          var2_long = ri.a(-3);
          var4 = wg.field_d[jc.field_e];
          wg.field_d[jc.field_e] = var2_long;
          jc.field_e = 1 + jc.field_e & 31;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          fieldTemp$1 = md.field_a;
          md.field_a = md.field_a + 1;
          if (fieldTemp$1 > 50) {
            ve.field_f = true;
            md.field_a = md.field_a - 50;
            fb.field_b.setSize(wm.field_ab, im.field_b);
            fb.field_b.setVisible(true);
            boolean decompiledSharedTail0 = (wh.field_cb != null &&
              null == sf.field_o);
            if (!decompiledSharedTail0) {
              fb.field_b.setLocation(ei.field_kb, vf.field_c);
              decompiledSharedTail0 = (Confined.field_J);
            }
            if (decompiledSharedTail0) {
              var6 = wh.field_cb.getInsets();
              fb.field_b.setLocation(var6.left + ei.field_kb, vf.field_c + var6.top);
            }
          }
          if (param0 != 11) {
            field_g = (String) null;
          }
          this.h(51200);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "te.K(" + param0 + ')');
        }
    }

    final static l a(mi param0, int param1, int param2, mi param3, int param4) {
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        l stackIn_7_0 = null;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!mc.a(param2, param4, param3, (byte) 119)) {
            stackIn_2_0 = null;
            return (l) (stackIn_2_0);
          }
          if (param1 != 10) {
            field_c = (vk) null;
          }
          stackIn_7_0 = h.a(false, param0.a((byte) -2, param4, param2));
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("te.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param4).append(')').toString());
        }
    }

    abstract void e(int param0);

    abstract void h(int param0);

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (da.field_b) {
              return;
            }
            da.field_b = true;
          }
          if (null != kc.field_d) {
            kc.field_d.destroy();
          }
          try {
            this.d(param0 ^ -6098);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (fb.field_b != null) {
            try {
              fb.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
              fb.field_b.getParent().remove((java.awt.Component) ((Object) fb.field_b));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (ki.field_d != null) {
            try {
              ki.field_d.b(20269);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c(192);
          if (param0 != 29121) {
            this.g(103);
          }
          if (wh.field_cb != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw sd.a((Throwable) ((Object) runtimeException), "te.I(" + param0 + ',' + param1 + ')');
        }
    }

    protected te() {
        this.field_e = false;
    }

    static {
        field_g = "<col=FFFFFF>Cluster mine:</col> the Level 15 and later bosses drop these. They explode into five shells which come straight for you, so avoid hitting them at all costs. From Level 21, all aliens drop them!";
        field_i = "Back";
        field_d = "Email address is unavailable";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
