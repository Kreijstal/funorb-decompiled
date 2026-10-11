/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameApplet extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_a;
    static boolean field_l;
    static String field_b;
    static fh field_g;
    static String field_f;
    boolean field_m;
    public static boolean field_i;
    public static boolean field_h;
    public static int field_d;
    public static boolean field_e;
    public static boolean field_j;
    public static int field_c;
    public static boolean field_k;

    public static void e(int param0) {
        try {
          field_a = null;
          field_g = null;
          field_b = null;
          field_f = null;
          if (param0 != 48) {
            GameApplet.e(-42);
          }
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "lg.CA(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != vd.field_c) {
          return null;
        }
        if (fb.field_o != null &&
          fb.field_o != this) {
          return fb.field_o.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vd.field_c != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != fb.field_o &&
            fb.field_o != this) {
            stackIn_10_0 = fb.field_o.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lg.getDocumentBase()");
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_83_0 = 0;
          int stackIn_83_1 = 0;
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
          var5 = SteelSentinels.obfuscationControl;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (pn.field_p != null) {
                var1 = pn.field_p.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = pn.field_r;
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
                    this.a("wrongjava", -16946);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = oa.a(-4278, var2.charAt(var3));
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
                      if (fg.a((CharSequence) ((Object) var4), -111) &&
                        !(dj.a((CharSequence) ((Object) var4), -118) >= 10)) {
                        this.a("wrongjava", -16946);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (pn.field_r != null))) {
                stackIn_68_0 = pn.field_r.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < pn.field_r.length()) {
                    var3 = pn.field_r.charAt(var1_int);
                    stackIn_83_0 = var3;
                    stackIn_83_1 = 48;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 >= stackIn_83_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = -48 - (-var3 - 10 * var2_int);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_83_0 = 5;
                    stackIn_83_1 = var2_int;
                  }
                  if (stackIn_83_0 > stackIn_83_1) {
                    break;
                  }
                  ob.field_u = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = km.field_m;
                if (fb.field_o != null) {
                  var1 = fb.field_o;
                }
                var2_ref = pn.field_c;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                im.b((byte) 98);
                this.a(false);
                sb.field_bb = qf.a(li.field_A, na.field_i, (java.awt.Component) ((Object) sl.field_n), (byte) -113);
                this.b(26689);
                gd.field_qb = dl.g((byte) 3);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != qa.field_P) {
                    stackIn_102_0 = $cfr$lcmp(qa.field_P, mm.a(-123));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    di.field_a = gd.field_qb.a((byte) -122, ud.field_v);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(var3 < di.field_a)) {
                      this.f(-7035);
                      le.a(sl.field_n, 50, hb.field_i);
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
              sj.a((String) null, -60, (Throwable) (var1));
              this.a("crash", -16946);
            }
            this.a(true, (byte) 56);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ci.a((Throwable) (var1), "lg.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vd.field_c != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (fb.field_o != null &&
            this != fb.field_o) {
            stackIn_10_0 = fb.field_o.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1), "lg.getAppletContext()");
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final boolean b(byte param0) {
        return true;
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == km.field_m &&
            !SentinelCommand.field_v) {
            qa.field_P = mm.a(-91);
            a.a((byte) 124, 5000L);
            ug.field_M = null;
            this.a(false, (byte) -101);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.destroy()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          pa.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("lg.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static void g(int param0) {
        int var2 = 0;
        int var4 = 0;
        int stackIn_28_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        int var2Lifetime1;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (param0 != -27983) {
            field_f = (String) null;
          }
          var1 = wc.field_i;
          synchronized (var1) {
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            ad.field_b = mn.field_y;
            km.field_f = km.field_f + 1;
            if (qj.field_h < 0) {
              var2 = 0;
              while (true) {
                if (var2 < 112) {
                  fc.field_e[var2] = false;
                  var2++;
                  if (var4 == 0) {
                    continue;
                  }
                } else {
                  qj.field_h = hh.field_b;
                }
                break;
              }
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              while (true) {
                if (~qj.field_h == ~hh.field_b) {
                  break;
                }
                var2Lifetime1 = ni.field_b[hh.field_b];
                hh.field_b = 127 & 1 + hh.field_b;
                stackIn_28_0 = var2Lifetime1;
                if (var4 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_28_0 >= 0) {
                  fc.field_e[var2Lifetime1] = true;
                } else {
                  fc.field_e[~var2Lifetime1] = false;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_28_0 = fk.field_e;
            }
            mn.field_y = stackIn_28_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var1_ref), "lg.FA(" + param0 + ')');
        }
    }

    final static int a(ik param0, ik param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_1_0 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -75 % ((13 - param2) / 60);
          stackIn_1_0 = ka.a((String) null, false, 0, (byte) -90, 0, param1, param0);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_5_0 = var3;
          stackIn_5_1 = new StringBuilder().append("lg.JA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("lg.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          var2_long = mm.a(59);
          var4 = bm.field_T[cm.field_g];
          bm.field_T[cm.field_g] = var2_long;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          if (param0 != -7035) {
            return;
          }
          cm.field_g = 1 + cm.field_g & 31;
          fieldTemp$1 = ml.field_a;
          ml.field_a = ml.field_a + 1;
          if (fieldTemp$1 > 50) {
            dd.field_e = true;
            ml.field_a = ml.field_a - 50;
            sl.field_n.setSize(na.field_i, li.field_A);
            sl.field_n.setVisible(true);
            if (vd.field_c != null &&
              SceneWidget.field_N == null) {
              var6 = vd.field_c.getInsets();
              sl.field_n.setLocation(kf.field_p + var6.left, var6.top + ij.field_X);
              if (SteelSentinels.obfuscationControl != 0) {
                sl.field_n.setLocation(kf.field_p, ij.field_X);
              }
            } else {
              sl.field_n.setLocation(kf.field_p, ij.field_X);
            }
          }
          this.a((byte) 112);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var2), "lg.AA(" + param0 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (km.field_m == this &&
            !SentinelCommand.field_v) {
            qa.field_P = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.start()");
        }
    }

    abstract void c(byte param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = SteelSentinels.obfuscationControl;
        try {
          if (null != sl.field_n) {
            sl.field_n.removeFocusListener((java.awt.event.FocusListener) (this));
            sl.field_n.getParent().setBackground(java.awt.Color.black);
            sl.field_n.getParent().remove((java.awt.Component) ((Object) sl.field_n));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == SceneWidget.field_N) {
            if (null != vd.field_c) {
              var2 = vd.field_c;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null != fb.field_o) {
                var2 = fb.field_o;
                if (var4 != 0) {
                  var2 = km.field_m;
                  var2 = SceneWidget.field_N;
                }
              } else {
                var2 = km.field_m;
                if (var4 != 0) {
                  var2 = SceneWidget.field_N;
                }
              }
            }
          } else {
            var2 = SceneWidget.field_N;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          sl.field_n = (java.awt.Canvas) ((Object) new pi((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) sl.field_n));
          sl.field_n.setSize(na.field_i, li.field_A);
          sl.field_n.setVisible(true);
          if (vd.field_c == var2) {
            var3 = vd.field_c.getInsets();
            sl.field_n.setLocation(kf.field_p + var3.left, var3.top + ij.field_X);
            if (var4 != 0) {
              sl.field_n.setLocation(kf.field_p, ij.field_X);
            }
          } else {
            sl.field_n.setLocation(kf.field_p, ij.field_X);
          }
          sl.field_n.addFocusListener((java.awt.event.FocusListener) (this));
          sl.field_n.requestFocus();
          kc.field_q = true;
          pa.field_f = true;
          dd.field_e = true;
          ti.field_x = param0;
          pl.field_Y = mm.a(-61);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ci.a((Throwable) (var2), "lg.MA(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("lg.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = mm.a(-111);
          var4 = hg.field_c[ah.field_Wb];
          hg.field_c[ah.field_Wb] = var2_long;
          if (var4 != (long)param0 &&
            var4 < var2_long) {
          }
          ah.field_Wb = 31 & ah.field_Wb + 1;
          var6 = this;
          synchronized (var6) {
            kc.field_q = pa.field_f;
          }
          this.c(2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.IA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (SentinelCommand.field_v) {
              return;
            }
            SentinelCommand.field_v = true;
            var4 = 67 / ((param1 - 7) / 46);
          }
          if (null != fb.field_o) {
            fb.field_o.destroy();
          }
          try {
            this.c((byte) 106);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (sl.field_n != null) {
            try {
              sl.field_n.removeFocusListener((java.awt.event.FocusListener) (this));
              sl.field_n.getParent().remove((java.awt.Component) ((Object) sl.field_n));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != hb.field_i) {
            try {
              hb.field_i.c(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.a(91);
          if (vd.field_c != null) {
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
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.NA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void a(int param0);

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_12_0 = null;
        String stackIn_14_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (vd.field_c != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (fb.field_o != null &&
            this != fb.field_o) {
            stackIn_12_0 = fb.field_o.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("lg.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_3_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_17_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var8 = SteelSentinels.obfuscationControl;
        try {
          var3_int = 0;
          if (param0 != 5) {
            stackIn_3_0 = -108;
            return stackIn_3_0;
          }
          var4 = ug.field_Q;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(r.field_j.length > var3_int)))) {
            var5 = bl.field_m[var3_int];
            stackIn_17_0 = 0;
            if (var8 == 0) {
              if (stackIn_17_0 > var5) {
                var4 = var4 + ih.field_r;
              } else {
                var6 = wd.$cfr$intArgs$a$1694234bddb3(r.field_j[var3_int], 52, true);
                var7 = mg.field_kc - (var6 >> 1);
                var4 = var4 + ng.field_m;
                if (pg.a(rn.field_q + (rc.field_j << 1), (ud.field_y << 1) + var6, param1, var7 - ud.field_y, 0, var4, param2)) {
                  stackIn_13_0 = var5;
                  return stackIn_13_0;
                }
                var4 = var4 + (rn.field_q + ng.field_m + (rc.field_j << 1));
              }
              var3_int++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_17_0 = -1;
          }
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) var3), "lg.HA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == km.field_m &&
            !SentinelCommand.field_v) {
            qa.field_P = 4000L + mm.a(54);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ci.a((Throwable) ((Object) runtimeException), "lg.stop()");
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
          fb.field_o = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("lg.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (km.field_m == this &&
            !SentinelCommand.field_v) {
            dd.field_e = true;
            if (ob.field_u &&
              mm.a(-82) - pl.field_Y > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < dc.field_c) {
                  return;
                }
                if (var2.height < ih.field_t) {
                  return;
                }
              }
              ti.field_x = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("lg.paint(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    abstract void c(int param0);

    final void a(String param0, int param1) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_m) {
              return;
            }
            this.field_m = true;
            if (param1 != -16946) {
              return;
            }
            System.out.println("error_game_" + param0);
            try {
              hn.a(Projectile.d((byte) -21), (byte) -96, "loggedout");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param0 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("lg.BA(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          pa.field_f = true;
          dd.field_e = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("lg.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, byte param3, String param4, int param5, int param6) {
        try {
          pn dupTemp$0 = null;
          RuntimeException stackIn_22_0 = null;
          StringBuilder stackIn_22_1 = null;
          String stackIn_23_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          RuntimeException var8 = null;
          wj var9 = null;
          Throwable var9_ref = null;
          int var10 = 0;
          var10 = SteelSentinels.obfuscationControl;
          try {
            var8_int = 65 / ((-41 - param3) / 58);
            try {
              if (null != km.field_m) {
                rh.field_s = rh.field_s + 1;
                if (rh.field_s < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", -16946);
                return;
              }
              li.field_A = param1;
              ih.field_t = param1;
              na.field_i = param0;
              dc.field_c = param0;
              ij.field_X = 0;
              dd.field_d = param5;
              kf.field_p = 0;
              km.field_m = this;
              ug.field_O = Projectile.d((byte) -21);
              dupTemp$0 = new pn(param2, param4, param6, true);
              hb.field_i = dupTemp$0;
              ug.field_M = dupTemp$0;
              var9 = hb.field_i.a(2, 1, (Runnable) (this));
              while (true) {
                if (var9.field_a == 0) {
                  a.a((byte) 120, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var9_ref = decompiledCaughtException;
              sj.a((String) null, -106, var9_ref);
              this.a("crash", -16946);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_22_0 = var8;
            stackIn_22_1 = new StringBuilder().append("lg.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_23_2 = "null";
            } else {
              stackIn_23_2 = "{...}";
            }
            throw ci.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected GameApplet() {
        this.field_m = false;
    }

    abstract void a(byte param0);

    abstract void b(int param0);

    static {
        field_a = "Please wait...";
        field_f = "Names can only contain letters, numbers, spaces and underscores";
        field_b = "You are advised to complete training mission <%0> before attempting this mission.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
