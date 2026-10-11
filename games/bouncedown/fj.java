/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fj extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_k;
    static String field_d;
    boolean field_e;
    static String field_g;
    static int field_b;
    public static int field_j;
    public static boolean field_h;
    public static int field_c;
    public static int field_l;
    public static boolean field_i;
    public static boolean field_a;
    public static int field_f;

    final static void a(int param0, int param1, int param2, wi param3, int param4) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param1 != 6) {
            field_b = -112;
          }
          param3.a(12, (byte) 103);
          param3.e(param1 ^ -750655090, 17);
          param3.e(param1 ^ -750655090, param2);
          param3.e(-750655096, param0);
          param3.a(param4, (byte) 78);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("fj.T(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = fa.a(87);
          var4 = qj.field_a[sh.field_hb];
          qj.field_a[sh.field_hb] = var2_long;
          if (0L != var4 &&
            var2_long <= var4) {
          }
          sh.field_hb = 31 & sh.field_hb + 1;
          if (param0 >= -33) {
            this.b((byte) 102);
          }
          var6 = this;
          synchronized (var6) {
            gk.field_f = k.field_H;
          }
          this.a((byte) 37);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) ((Object) runtimeException), "fj.DA(" + param0 + ')');
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
          throw ii.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (i.field_h != null) {
          return null;
        }
        if (null != a.field_c &&
          a.field_c != this) {
          return a.field_c.getCodeBase();
        }
        return super.getCodeBase();
    }

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
            if (this.field_e) {
              return;
            }
            this.field_e = true;
            var3_int = 37 / ((29 - param0) / 57);
            System.out.println("error_game_" + param1);
            try {
              ac.a(vi.b(0), "loggedout", -31185);
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
            stackIn_14_1 = new StringBuilder().append("fj.LA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void d(byte param0);

    public final void start() {
        if (this != og.field_c ||
          jb.field_d) {
          return;
        }
        try {
          ua.field_d = 0L;
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "fj.start()");
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
          if (og.field_c == this &&
            !jb.field_d) {
            ae.field_b = true;
            if (hh.field_k &&
              -jc.field_k + fa.a(125) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < ib.field_k) {
                  return;
                }
                if (var2.height < ej.field_d) {
                  return;
                }
              }
              ef.field_f = true;
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
          throw ii.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public static void e(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 < 115) {
            field_g = (String) null;
          }
          field_g = null;
          field_k = null;
          field_d = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "fj.W(" + param0 + ')');
        }
    }

    abstract void c(byte param0);

    public abstract void init();

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Bounce.field_N;
        try {
          if (null != ch.field_h) {
            ch.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
            ch.field_h.getParent().setBackground(java.awt.Color.black);
            ch.field_h.getParent().remove((java.awt.Component) ((Object) ch.field_h));
          }
          boolean decompiledFrameRemainder0 = true;
          if (ai.field_b != null) {
            var2 = ai.field_b;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (i.field_h != null) {
              var2 = i.field_h;
              if (var4 != 0) {
                if (a.field_c == null) {
                  var2 = og.field_c;
                  var2 = a.field_c;
                } else {
                  var2 = a.field_c;
                }
              }
            } else {
              if (a.field_c == null) {
                var2 = og.field_c;
                if (var4 != 0) {
                  var2 = a.field_c;
                }
              } else {
                var2 = a.field_c;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          if (param0 != 12955) {
            this.focusGained((java.awt.event.FocusEvent) null);
          }
          ch.field_h = (java.awt.Canvas) ((Object) new th((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ch.field_h));
          ch.field_h.setSize(kj.field_i, jc.field_i);
          ch.field_h.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == i.field_h);
          if (!decompiledSharedTail0) {
            ch.field_h.setLocation(el.field_e, ob.field_d);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = i.field_h.getInsets();
            ch.field_h.setLocation(var3.left + el.field_e, ob.field_d + var3.top);
          }
          ch.field_h.addFocusListener((java.awt.event.FocusListener) (this));
          ch.field_h.requestFocus();
          gk.field_f = true;
          k.field_H = true;
          ae.field_b = true;
          ef.field_f = false;
          jc.field_k = fa.a(-73);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ii.a((Throwable) (var2), "fj.KA(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("fj.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          a.field_c = param0;
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
          throw ii.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != i.field_h) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (a.field_c != null &&
            a.field_c != this) {
            stackIn_12_0 = a.field_c.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "fj.getDocumentBase()");
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (i.field_h != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (a.field_c != null &&
            this != a.field_c) {
            stackIn_8_0 = a.field_c.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) var1), "fj.getAppletContext()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          k.field_H = false;
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
          throw ii.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static rj a(gk param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_7_0 = null;
        rj stackIn_9_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_b = 10;
          }
          var3 = param0.c(param1 ^ 121, param2);
          if (var3 == null) {
            stackIn_7_0 = null;
            return (rj) (stackIn_7_0);
          }
          stackIn_9_0 = new rj(var3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("fj.IA(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    abstract void e(int param0);

    final static void a(boolean param0, String param1, int param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          va.field_f = param0;
          ng.field_b = true;
          nk.field_a = new sh(q.field_N, ne.field_v, param1, fe.field_g, va.field_f);
          if (param2 != -1) {
            return;
          }
          q.field_N.b(nk.field_a, false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_7_0 = runtimeException;
          stackIn_7_1 = new StringBuilder().append("fj.FA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ii.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        return true;
    }

    final void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          si dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          mk var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Bounce.field_N;
          try {
            try {
              if (og.field_c != null) {
                kl.field_g = kl.field_g + 1;
                if (kl.field_g >= 3) {
                  this.a((byte) 110, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              el.field_e = 0;
              if (param3 < 2) {
                this.c((byte) -74);
              }
              jc.field_i = param5;
              ej.field_d = param5;
              kj.field_i = param6;
              ib.field_k = param6;
              ob.field_d = 0;
              nd.field_E = param4;
              og.field_c = this;
              gk.field_j = vi.b(0);
              dupTemp$0 = new si(param0, param1, param2, true);
              ck.field_e = dupTemp$0;
              jj.field_a = dupTemp$0;
              var8 = ck.field_e.a(1, (byte) -102, (Runnable) (this));
              while (true) {
                if (0 == var8.field_f) {
                  wh.a(10L, 19406);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              ti.a(var8_ref, (byte) 100, (String) null);
              this.a((byte) -124, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("fj.AA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw ii.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_82_0 = 0;
          int stackIn_82_1 = 0;
          int stackIn_103_0 = 0;
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
          var5 = Bounce.field_N;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != si.field_r) {
                var1 = si.field_r.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = si.field_d;
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
                    this.a((byte) -84, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_66_0 = kf.a(-49, var2.charAt(var3));
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
                      if (qi.a((CharSequence) ((Object) var4), 10) &&
                        !(gf.a(10, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a((byte) 96, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (si.field_d != null))) {
                stackIn_66_0 = si.field_d.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (si.field_d.length() > var1_int) {
                    var3 = si.field_d.charAt(var1_int);
                    stackIn_82_0 = -49;
                    stackIn_82_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_82_0 >= stackIn_82_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = var2_int * 10 + var3 - 48;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_82_0 = -6;
                    stackIn_82_1 = ~var2_int;
                  }
                  if (stackIn_82_0 < stackIn_82_1) {
                    break;
                  }
                  hh.field_k = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = og.field_c;
                if (a.field_c != null) {
                  var1 = a.field_c;
                }
                var2_ref = si.field_w;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                oh.a(-117);
                this.d(12955);
                ca.field_d = w.a(kj.field_i, (java.awt.Component) ((Object) ch.field_h), jc.field_i, (byte) 41);
                this.c((byte) -6);
                ff.field_D = jj.a(10000);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (ua.field_d != 0L) {
                    stackIn_103_0 = $cfr$lcmp(ua.field_d, fa.a(-42));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_103_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    nl.field_c = ff.field_D.b(0, hb.field_H);
                    stackIn_103_0 = 0;
                  }
                  var3 = stackIn_103_0;
                  do {
                    if (!(var3 < nl.field_c)) {
                      this.b(1);
                      pg.a((byte) -109, ch.field_h, ck.field_e);
                      break;
                    }
                    this.c(-111);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              ti.a((Throwable) (var1), (byte) 100, (String) null);
              this.a((byte) -85, "crash");
            }
            this.a(true, (byte) -83);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ii.a((Throwable) (var1), "fj.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0, byte param1) {
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Exception var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (jb.field_d) {
              return;
            }
            jb.field_d = true;
          }
          if (a.field_c != null) {
            a.field_c.destroy();
          }
          try {
            if (param1 >= -10) {
              this.d(40);
            }
            this.b((byte) -111);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref = (Exception) (Object) decompiledCaughtException;
          }
          if (ch.field_h != null) {
            try {
              ch.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
              ch.field_h.getParent().remove((java.awt.Component) ((Object) ch.field_h));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (ck.field_e != null) {
            try {
              ck.field_e.b((byte) 94);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.d((byte) -124);
          if (i.field_h != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref2 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ii.a((Throwable) ((Object) runtimeException), "fj.BA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void stop() {
        if (og.field_c != this ||
          jb.field_d) {
          return;
        }
        try {
          ua.field_d = 4000L + fa.a(-81);
        } catch (RuntimeException runtimeException) {
          throw ii.a((Throwable) ((Object) runtimeException), "fj.stop()");
        }
    }

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = fa.a(param0 + 102);
          var4 = l.field_d[cl.field_q];
          l.field_d[cl.field_q] = var2_long;
          cl.field_q = param0 + cl.field_q & 31;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          fieldTemp$1 = fl.field_a;
          fl.field_a = fl.field_a + 1;
          if (fieldTemp$1 > 50) {
            ae.field_b = true;
            fl.field_a = fl.field_a - 50;
            ch.field_h.setSize(kj.field_i, jc.field_i);
            ch.field_h.setVisible(true);
            boolean decompiledSharedTail0 = (null != i.field_h &&
              null == ai.field_b);
            if (!decompiledSharedTail0) {
              ch.field_h.setLocation(el.field_e, ob.field_d);
              decompiledSharedTail0 = (Bounce.field_N != 0);
            }
            if (decompiledSharedTail0) {
              var6 = i.field_h.getInsets();
              ch.field_h.setLocation(var6.left + el.field_e, ob.field_d + var6.top);
            }
          }
          this.e(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) runtimeException), "fj.GA(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          k.field_H = true;
          ae.field_b = true;
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
          throw ii.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          if (null != i.field_h) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != a.field_c &&
            this != a.field_c) {
            stackIn_12_0 = a.field_c.getParameter(param0);
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
          throw ii.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected fj() {
        this.field_e = false;
    }

    abstract void b(byte param0);

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == og.field_c &&
            !jb.field_d) {
            ua.field_d = fa.a(112);
            wh.a(5000L, 19406);
            jj.field_a = null;
            this.a(false, (byte) -57);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ii.a((Throwable) ((Object) runtimeException), "fj.destroy()");
        }
    }

    static {
        field_k = "Loading sound effects";
        field_d = "Change display name";
        field_g = "Fullscreen";
        field_b = 0;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
