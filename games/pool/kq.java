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
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kq.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (op.field_e != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (oc.field_t != null &&
            oc.field_t != this) {
            stackIn_10_0 = oc.field_t.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "kq.getAppletContext()");
        }
    }

    public abstract void init();

    final void a(byte param0, String param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          int var3_int = 0;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_n) {
              return;
            }
            this.field_n = true;
            System.out.println("error_game_" + param1);
            try {
              mo.a((byte) 122, "loggedout", hk.d(71));
              var3_int = -37 % ((param0 - 57) / 34);
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
            stackIn_14_1 = new StringBuilder().append("kq.D(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (null != pa.field_K) {
            pa.field_K.removeFocusListener((java.awt.event.FocusListener) (this));
            pa.field_K.getParent().setBackground(java.awt.Color.black);
            pa.field_K.getParent().remove((java.awt.Component) ((Object) pa.field_K));
          }
          boolean decompiledFrameRemainder0 = true;
          if (iq.field_l != null) {
            var2 = iq.field_l;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null == op.field_e) {
              if (null == oc.field_t) {
                var2 = ni.field_ib;
                if (var4 != 0) {
                  var2 = oc.field_t;
                  var2 = op.field_e;
                }
              } else {
                var2 = oc.field_t;
                if (var4 != 0) {
                  var2 = op.field_e;
                }
              }
            } else {
              var2 = op.field_e;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          pa.field_K = (java.awt.Canvas) ((Object) new cn((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) pa.field_K));
          pa.field_K.setSize(ml.field_d, ad.field_c);
          pa.field_K.setVisible(true);
          if (op.field_e == var2) {
            var3 = op.field_e.getInsets();
            pa.field_K.setLocation(var3.left + cl.field_e, ua.field_v + var3.top);
            if (var4 != 0) {
              pa.field_K.setLocation(cl.field_e, ua.field_v);
            }
          } else {
            pa.field_K.setLocation(cl.field_e, ua.field_v);
          }
          pa.field_K.addFocusListener((java.awt.event.FocusListener) (this));
          pa.field_K.requestFocus();
          if (param0 < 40) {
            return;
          }
          vl.field_q = true;
          um.field_e = true;
          he.field_c = true;
          wd.field_Sb = false;
          ph.field_b = rl.a((byte) -94);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wm.a((Throwable) (var2), "kq.A(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ni.field_ib == this &&
            !ka.field_p) {
            rm.field_c = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "kq.start()");
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
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (op.field_e != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != oc.field_t &&
            this != oc.field_t) {
            stackIn_10_0 = oc.field_t.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("kq.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oc.field_t = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kq.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(dd[] param0, int param1) {
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          nf.field_V = param0;
          if (param1 != -58) {
            field_a = (vh) null;
          }
          if (null != nf.field_V &&
            param0.length < 3) {
            throw new IllegalArgumentException("");
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("kq.O(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
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
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vl.field_q = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kq.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          var2_long = rl.a((byte) -115);
          if (param0 > -19) {
            return;
          }
          var4 = dj.field_l[t.field_d];
          dj.field_l[t.field_d] = var2_long;
          t.field_d = 31 & t.field_d + 1;
          if (0L != var4 &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            un.field_g = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = ei.field_o;
          ei.field_o = ei.field_o + 1;
          if (fieldTemp$1 > 50) {
            he.field_c = true;
            ei.field_o = ei.field_o - 50;
            pa.field_K.setSize(ml.field_d, ad.field_c);
            pa.field_K.setVisible(true);
            if (null != op.field_e &&
              iq.field_l == null) {
              var6 = op.field_e.getInsets();
              pa.field_K.setLocation(var6.left + cl.field_e, var6.top + ua.field_v);
              if (Pool.field_O != 0) {
                pa.field_K.setLocation(cl.field_e, ua.field_v);
              }
            } else {
              pa.field_K.setLocation(cl.field_e, ua.field_v);
            }
          }
          this.a((byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "kq.H(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("kq.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ni.field_ib == this &&
            !ka.field_p) {
            rm.field_c = rl.a((byte) -113) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "kq.stop()");
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = rl.a((byte) -118);
          if (param0 != -15568) {
            this.windowIconified((java.awt.event.WindowEvent) null);
          }
          var4 = oa.field_f[kb.field_e];
          oa.field_f[kb.field_e] = var2_long;
          if (var4 != 0L &&
            var4 >= var2_long) {
          }
          kb.field_e = 31 & 1 + kb.field_e;
          var6 = this;
          synchronized (var6) {
            um.field_e = vl.field_q;
          }
          this.e((byte) -99);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wm.a((Throwable) ((Object) runtimeException), "kq.F(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_82_0 = 0;
          int stackIn_82_1 = 0;
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
          var5 = Pool.field_O;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != sj.field_o) {
                var1 = sj.field_o.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = sj.field_t;
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
                    this.a((byte) 124, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = kh.a(var2.charAt(var3), (byte) 19);
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
                      if (ka.a(10, (CharSequence) ((Object) var4)) &&
                        !(kq.a((byte) 105, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a((byte) -89, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (sj.field_t != null))) {
                stackIn_66_0 = sj.field_t.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (sj.field_t.length() > var1_int) {
                    var3 = sj.field_t.charAt(var1_int);
                    stackIn_82_0 = -49;
                    stackIn_82_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_82_0 >= stackIn_82_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = -48 + (var3 + var2_int * 10);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_82_0 = var2_int;
                    stackIn_82_1 = 5;
                  }
                  if (stackIn_82_0 < stackIn_82_1) {
                    break;
                  }
                  bq.field_o = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ni.field_ib;
                if (null != oc.field_t) {
                  var1 = oc.field_t;
                }
                var2_ref = sj.field_q;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                lo.a(-19);
                this.f((byte) 55);
                sh.field_P = id.a(ml.field_d, ad.field_c, -44, (java.awt.Component) ((Object) pa.field_K));
                this.d((byte) -46);
                pj.field_J = ug.e(0);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (rm.field_c != 0L) {
                    stackIn_99_0 = $cfr$lcmp(~rm.field_c, ~rl.a((byte) -122));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_99_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    rn.field_b = pj.field_J.a(oh.field_e, (byte) 39);
                    stackIn_99_0 = 0;
                  }
                  var3 = stackIn_99_0;
                  do {
                    if (!(var3 < rn.field_b)) {
                      this.b((byte) -30);
                      cb.a(pa.field_K, lg.field_s, 125);
                      break;
                    }
                    this.a(-15568);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              tc.a((Throwable) (var1), (String) null, -8555);
              this.a((byte) -103, "crash");
            }
            this.a(20171, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw wm.a((Throwable) (var1), "kq.run()");
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
          field_h = null;
          field_m = null;
          if (param0 > -14) {
            field_c = 127;
          }
          field_l = null;
          field_g = null;
          field_a = null;
          return;
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
          var3 = this;
          synchronized (var3) {
            if (ka.field_p) {
              return;
            }
            ka.field_p = true;
          }
          if (param0 != 20171) {
            field_h = (dd) null;
          }
          if (null != oc.field_t) {
            oc.field_t.destroy();
          }
          try {
            this.c((byte) -39);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != pa.field_K) {
            try {
              pa.field_K.removeFocusListener((java.awt.event.FocusListener) (this));
              pa.field_K.getParent().remove((java.awt.Component) ((Object) pa.field_K));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (lg.field_s != null) {
            try {
              lg.field_s.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.h((byte) -28);
          if (null != op.field_e) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
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
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 56) {
            field_c = 38;
          }
          stackIn_4_0 = ao.a(10, true, true, param1);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("kq.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void destroy() {
        if (this != ni.field_ib ||
          ka.field_p) {
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
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          le var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Pool.field_O;
          try {
            try {
              if (null != ni.field_ib) {
                oe.field_V = oe.field_V + 1;
                if (oe.field_V >= 3) {
                  this.a((byte) -46, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              ok.field_rb = param0;
              cl.field_e = 0;
              ni.field_ib = this;
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
              if (param3 != 115) {
                this.a((byte) -22, (String) null);
              }
              while (true) {
                if (var8.field_f == 0) {
                  cf.a(param3 - 228, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              tc.a(var8_ref, (String) null, -8555);
              this.a((byte) -108, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var8_ref2;
            stackIn_25_1 = new StringBuilder().append("kq.J(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw wm.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
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
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (ni.field_ib == this &&
            !ka.field_p) {
            he.field_c = true;
            if (bq.field_o &&
              -ph.field_b + rl.a((byte) -128) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (dl.field_b > var2.width) {
                  return;
                }
                if (rb.field_f > var2.height) {
                  return;
                }
              }
              wd.field_Sb = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("kq.paint(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (op.field_e != null) {
          return null;
        }
        if (null != oc.field_t &&
          oc.field_t != this) {
          return oc.field_t.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vl.field_q = true;
          he.field_c = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kq.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
        RuntimeException decompiledCaughtException = null;
        try {
          if (op.field_e != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (oc.field_t != null &&
            oc.field_t != this) {
            stackIn_12_0 = oc.field_t.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wm.a((Throwable) ((Object) var1), "kq.getDocumentBase()");
        }
    }

    abstract void c(byte param0);

    static {
        field_g = new String[]{"Showing by rating", "Showing by win percentage"};
        field_c = 20;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
