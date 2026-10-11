/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fj extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_b;
    static String field_f;
    static String field_c;
    public static boolean field_g;
    public static int field_j;
    public static boolean field_h;
    public static int field_a;
    public static int field_i;
    public static int field_d;
    public static int field_e;

    abstract void b(byte param0);

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
          stackIn_5_1 = new StringBuilder().append("fj.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == jj.field_a &&
            !tk.field_q) {
            t.field_h = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "fj.start()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          gh.field_j = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fj.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != q.field_g) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (uh.field_i != null &&
            this != uh.field_i) {
            stackIn_12_0 = uh.field_i.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "fj.getAppletContext()");
        }
    }

    private final void a(boolean param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (tk.field_q) {
              return;
            }
            tk.field_q = true;
          }
          if (uh.field_i != null) {
            uh.field_i.destroy();
          }
          try {
            this.f(-58);
            if (param1) {
              this.getAppletContext();
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != tb.field_c) {
            try {
              tb.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
              tb.field_c.getParent().remove((java.awt.Component) ((Object) tb.field_c));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (jk.field_a != null) {
            try {
              jk.field_a.a(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.a(0);
          if (q.field_g != null) {
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
          throw ma.a((Throwable) ((Object) runtimeException), "fj.OB(" + param0 + ',' + param1 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
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
          var5 = Main.field_T;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != le.field_v) {
                var1 = le.field_v.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = le.field_w;
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
                    this.a((byte) -96, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_66_0 = Main.a(-49, var2.charAt(var3));
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
                      if (pg.a(false, (CharSequence) ((Object) var4)) &&
                        !(ie.a(false, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a((byte) -41, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (le.field_w != null))) {
                stackIn_66_0 = le.field_w.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < le.field_w.length()) {
                    var3 = le.field_w.charAt(var1_int);
                    stackIn_81_0 = var3;
                    stackIn_81_1 = 48;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 >= stackIn_81_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var2_int = var3 + (-48 + 10 * var2_int);
                      var1_int++;
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
                  hi.field_a = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = jj.field_a;
                if (null != uh.field_i) {
                  var1 = uh.field_i;
                }
                var2_ref = le.field_g;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ac.a(7400);
                this.d(-1775094552);
                gf.field_e = ij.a(-114, (java.awt.Component) ((Object) tb.field_c), hj.field_j, gg.field_d);
                this.c(4405028);
                ag.field_b = ca.a(false);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (t.field_h != 0L) {
                    stackIn_102_0 = $cfr$lcmp(id.a(127), t.field_h);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    de.field_c = ag.field_b.a(qb.field_f, -127);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(de.field_c > var3)) {
                      this.e(5);
                      Main.a(tb.field_c, jk.field_a, (byte) 119);
                      break;
                    }
                    this.b(31);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              k.a((Throwable) (var1), (byte) -126, (String) null);
              this.a((byte) -56, "crash");
            }
            this.a(true, false);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ma.a((Throwable) (var1), "fj.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        if (jj.field_a != this ||
          tk.field_q) {
          return;
        }
        try {
          t.field_h = id.a(56);
          wk.a((byte) -123, 5000L);
          Main.field_W = null;
          this.a(false, false);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "fj.destroy()");
        }
    }

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
          if (q.field_g != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (uh.field_i != null &&
            this != uh.field_i) {
            stackIn_12_0 = uh.field_i.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("fj.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_b) {
              return;
            }
            this.field_b = true;
            if (param0 > -30) {
              return;
            }
            System.out.println("error_game_" + param1);
            try {
              vh.a("loggedout", -12151, mk.g(-125));
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
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("fj.RB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(boolean param0);

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Main.field_T;
        try {
          if (null != tb.field_c) {
            tb.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
            tb.field_c.getParent().setBackground(java.awt.Color.black);
            tb.field_c.getParent().remove((java.awt.Component) ((Object) tb.field_c));
          }
          boolean decompiledFrameRemainder0 = true;
          if (fg.field_n == null) {
            if (q.field_g != null) {
              var2 = q.field_g;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null != uh.field_i) {
                var2 = uh.field_i;
                if (var4 != 0) {
                  var2 = jj.field_a;
                  var2 = fg.field_n;
                }
              } else {
                var2 = jj.field_a;
                if (var4 != 0) {
                  var2 = fg.field_n;
                }
              }
            }
          } else {
            var2 = fg.field_n;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          tb.field_c = (java.awt.Canvas) ((Object) new ce((java.awt.Component) (this)));
          if (param0 != -1775094552) {
            return;
          }
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) tb.field_c));
          tb.field_c.setSize(gg.field_d, hj.field_j);
          tb.field_c.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == q.field_g);
          if (!decompiledSharedTail0) {
            tb.field_c.setLocation(sk.field_d, rh.field_k);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = q.field_g.getInsets();
            tb.field_c.setLocation(var3.left + sk.field_d, var3.top + rh.field_k);
          }
          tb.field_c.addFocusListener((java.awt.event.FocusListener) (this));
          tb.field_c.requestFocus();
          gh.field_j = true;
          r.field_q = true;
          ii.field_a = true;
          vd.field_w = false;
          ej.field_jb = id.a(33);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (var2), "fj.PB(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void e(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          var2_long = id.a(24);
          var4 = ak.field_P[ud.field_b];
          ak.field_P[ud.field_b] = var2_long;
          if (param0 != 5) {
            this.windowClosed((java.awt.event.WindowEvent) null);
          }
          ud.field_b = 31 & 1 + ud.field_b;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            ma.field_c = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = ag.field_f;
          ag.field_f = ag.field_f + 1;
          if (fieldTemp$1 > 50) {
            ag.field_f = ag.field_f - 50;
            ii.field_a = true;
            tb.field_c.setSize(gg.field_d, hj.field_j);
            tb.field_c.setVisible(true);
            if (q.field_g != null &&
              fg.field_n == null) {
              var6 = q.field_g.getInsets();
              tb.field_c.setLocation(var6.left + sk.field_d, rh.field_k + var6.top);
              if (Main.field_T != 0) {
                tb.field_c.setLocation(sk.field_d, rh.field_k);
              }
            } else {
              tb.field_c.setLocation(sk.field_d, rh.field_k);
            }
          }
          this.b((byte) 59);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "fj.VB(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("fj.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (q.field_g != null) {
          return null;
        }
        if (null != uh.field_i &&
          uh.field_i != this) {
          return uh.field_i.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void c(int param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        if (this != jj.field_a ||
          tk.field_q) {
          return;
        }
        try {
          t.field_h = 4000L + id.a(30);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "fj.stop()");
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = id.a(60);
          var4 = hj.field_n[kh.field_e];
          hj.field_n[kh.field_e] = var2_long;
          if (0L != var4 &&
            var4 < var2_long) {
          }
          kh.field_e = param0 & 1 + kh.field_e;
          var6 = this;
          synchronized (var6) {
            r.field_q = gh.field_j;
          }
          this.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "fj.TB(" + param0 + ')');
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
          if (this == jj.field_a &&
            !tk.field_q) {
            ii.field_a = true;
            if (hi.field_a &&
              -ej.field_jb + id.a(124) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (vk.field_b > var2.width) {
                  return;
                }
                if (var2.height < qe.field_I) {
                  return;
                }
              }
              vd.field_w = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("fj.paint(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var2), "fj.MB(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_f = null;
          if (param0 != -67) {
            fj.a(102, 66, -111, -47, 21, -43, (mg) null, 86);
          }
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "fj.NB(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          gh.field_j = true;
          ii.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fj.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          uh.field_i = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fj.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void f(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (q.field_g != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (uh.field_i != null &&
            this != uh.field_i) {
            stackIn_10_0 = uh.field_i.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "fj.getDocumentBase()");
        }
    }

    public abstract void init();

    protected fj() {
        this.field_b = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, mg param6, int param7) {
        int stackIn_25_0 = 0;
        int[] stackIn_28_0 = null;
        int stackIn_29_1 = 0;
        int stackIn_31_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_44_0 = 0;
        int stackIn_48_0 = 0;
        ha stackIn_64_0 = null;
        int stackIn_72_0 = 0;
        int stackIn_77_0 = 0;
        RuntimeException stackIn_83_0 = null;
        StringBuilder stackIn_83_1 = null;
        String stackIn_84_2 = null;
        RuntimeException decompiledCaughtException = null;
        mg var8 = null;
        int[] var8_array = null;
        RuntimeException var8_ref = null;
        byte[] var9 = null;
        int[] var9_array = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        ha var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int var33 = 0;
        int var34 = 0;
        int var35 = 0;
        int var36 = 0;
        int var37 = 0;
        int var38 = 0;
        int var39 = 0;
        int var40 = 0;
        int var13Lifetime1;
        int var14Lifetime1;
        int var15Lifetime1;
        int var15Lifetime2;
        var40 = Main.field_T;
        try {
          if (param0 > -14) {
            return;
          }
          var8 = param6;
          if (null != var8.field_D &&
            1 < var8.field_E) {
            var9 = var8.field_D;
            wh.a(var9, 0, 0, tb.field_h, (byte) 80);
            if (var40 != 0) {
              cc.b(124);
            }
          } else {
            cc.b(124);
          }
          var8_array = new int[param6.field_c];
          var9_array = new int[param6.field_c];
          var10 = ve.field_d;
          var11 = mc.field_b;
          var12 = oa.field_e;
          var13 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (!(param6.field_c > var13)))) {
            var14 = var11[var13] * param1 + var10[var13] * param5 + var12[var13] * param4 >> 8;
            stackIn_31_0 = var14;
            if (var40 == 0) {
              if (stackIn_31_0 < 0) {
                var14 = -var14;
              }
              if (var14 >= 0) {
                if (var14 >= 128) {
                  stackIn_25_0 = 256;
                } else {
                  stackIn_25_0 = var14 + 128;
                }
              } else {
                stackIn_25_0 = 128;
              }
              var14 = stackIn_25_0;
              var15 = var12[var13] * param3 + (var10[var13] * param2 + var11[var13] * param7) >> 8;
              stackIn_28_0 = sh.field_l;
              if (var15 < 0) {
                stackIn_29_1 = -var15;
              } else {
                stackIn_29_1 = var15;
              }
              var15Lifetime2 = stackIn_28_0[stackIn_29_1];
              var14 = var14 * (-var15Lifetime2 + 256) >>> 8;
              var8_array[var13] = var14;
              var9_array[var13] = var15Lifetime2;
              var13++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_31_0 = 0;
          }
          var13Lifetime1 = stackIn_31_0;
          while (var13Lifetime1 < ol.field_X) {
            var14Lifetime1 = lf.field_a[var13Lifetime1];
            var15Lifetime1 = param6.field_a[var14Lifetime1];
            var16 = param6.field_Q[var14Lifetime1];
            var17 = param6.field_d[var14Lifetime1];
            if (var40 != 0) {
              return;
            }
            if (ve.field_d.length <= param6.field_g[var14Lifetime1]) {
              stackIn_40_0 = -1;
            } else {
              stackIn_40_0 = param6.field_g[var14Lifetime1];
            }
            var18 = stackIn_40_0;
            if (ve.field_d.length <= param6.field_v[var14Lifetime1]) {
              stackIn_44_0 = -1;
            } else {
              stackIn_44_0 = param6.field_v[var14Lifetime1];
            }
            var19 = stackIn_44_0;
            if (ve.field_d.length > param6.field_p[var14Lifetime1]) {
              stackIn_48_0 = param6.field_p[var14Lifetime1];
            } else {
              stackIn_48_0 = -1;
            }
            var20 = stackIn_48_0;
            if (ga.field_b != null &&
              param6.field_N != null &&
              var14Lifetime1 < param6.field_N.length &&
              param6.field_N[var14Lifetime1] != -1 &&
              param6.field_N[var14Lifetime1] < ga.field_b.length) {
              stackIn_64_0 = ga.field_b[param6.field_N[var14Lifetime1]];
            } else {
              stackIn_64_0 = null;
            }
            var21 = stackIn_64_0;
            var22 = se.field_F[var15Lifetime1];
            var23 = ai.field_j[var15Lifetime1];
            var24 = se.field_F[var16];
            var25 = ai.field_j[var16];
            var26 = se.field_F[var17];
            var27 = ai.field_j[var17];
            if (var19 == var18 &&
              var20 == var19) {
              var28 = var8_array[var18];
              var29 = var9_array[var18];
              if (null == var21) {
                stackIn_72_0 = 8355711;
              } else {
                stackIn_72_0 = var21.field_b;
              }
              var30 = stackIn_72_0;
              var31 = var30 & 16711935;
              var32 = 65280 & var30;
              var33 = var28 * var32 >>> 8 & -1308557568 | (var31 * var28 & -16711773) >>> 8;
              var33 = var33 + 65793 * var29;
              cd.a(var23, var27, var25, -1, var22, var24, (var33 & 16711422) >> 1, var26);
            } else {
              var28 = var8_array[var18];
              var29 = var8_array[var19];
              var30 = var8_array[var20];
              var31 = var9_array[var18];
              var32 = var9_array[var19];
              var33 = var9_array[var20];
              if (var21 != null) {
                stackIn_77_0 = var21.field_b;
              } else {
                stackIn_77_0 = 8355711;
              }
              var34 = stackIn_77_0;
              var35 = 16711935 & var34;
              var36 = 65280 & var34;
              var37 = var36 * var28 >>> 8 & 587267840 | var28 * var35 >>> 8 & 1258225919;
              var38 = 1509884159 & var35 * var29 >>> 8 | -234815744 & var36 * var29 >>> 8;
              var37 = var37 + var31 * 65793;
              var39 = var35 * var30 >>> 8 & 469696767 | (var36 * var30 & 16711689) >>> 8;
              var38 = var38 + var32 * 65793;
              var39 = var39 + var33 * 65793;
              gi.a(var39 >> 16, var38 & 255, (65465 & var39) >> 8, var39 & 255, var37 >> 16, var38 >> 16, var22, var23, 255 & var38 >> 8, 0, var25, var27, (65354 & var37) >> 8, var26, var24, var37 & 255);
            }
            var13Lifetime1++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8_ref = decompiledCaughtException;
          stackIn_83_0 = var8_ref;
          stackIn_83_1 = new StringBuilder().append("fj.SB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_84_2 = "null";
          } else {
            stackIn_84_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_83_0), ((StringBuilder) (Object) stackIn_83_1).append(stackIn_84_2).append(',').append(param7).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final void a(byte param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          le dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          vi var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Main.field_T;
          try {
            try {
              if (jj.field_a != null) {
                sk.field_e = sk.field_e + 1;
                if (sk.field_e >= 3) {
                  this.a((byte) -126, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              gg.field_d = param5;
              vk.field_b = param5;
              hj.field_j = param4;
              qe.field_I = param4;
              ca.field_d = param3;
              jj.field_a = this;
              sk.field_d = 0;
              rh.field_k = 0;
              tk.field_o = mk.g(-118);
              dupTemp$0 = new le(param6, param1, param2, true);
              jk.field_a = dupTemp$0;
              Main.field_W = dupTemp$0;
              if (param0 <= 38) {
                this.a(-62);
              }
              var8 = jk.field_a.a(0, 1, (Runnable) (this));
              while (true) {
                if (var8.field_a == 0) {
                  wk.a((byte) -94, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              k.a(var8_ref, (byte) -106, (String) null);
              this.a((byte) -118, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("fj.QB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_f = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
