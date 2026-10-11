/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fa extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static vd field_i;
    boolean field_j;
    static int field_f;
    static String field_g;
    public static boolean field_b;
    public static int field_c;
    public static boolean field_h;
    public static int field_k;
    public static boolean field_a;
    public static boolean field_d;
    public static boolean field_e;

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        int var2_int = 0;
        long var3 = 0L;
        long var5 = 0L;
        int var7_int = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var2_int = -41 / ((-5 - param0) / 36);
          var3 = lk.a(0);
          var5 = ik.field_ib[td.field_a];
          ik.field_ib[td.field_a] = var3;
          if (var5 != 0L &&
            var3 > var5) {
            var7_int = (int)(-var5 + var3);
            oc.field_y = (32000 + (var7_int >> 1)) / var7_int;
          }
          td.field_a = 1 + td.field_a & 31;
          var7 = this;
          synchronized (var7) {
            rj.field_b = bi.field_M;
          }
          this.b((byte) -111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ch.a((Throwable) ((Object) runtimeException), "fa.V(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          bi.field_M = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fa.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        return true;
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (aj.field_t != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != i.field_f &&
            i.field_f != this) {
            stackIn_10_0 = i.field_f.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "fa.getAppletContext()");
        }
    }

    public static void f(int param0) {
        try {
          field_i = null;
          field_g = null;
          int var1_int = -65 / ((param0 + 30) / 46);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fa.P(" + param0 + ')');
        }
    }

    final static od a(int param0, hb param1, byte param2, int param3) {
        RuntimeException var4 = null;
        od stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 124) {
            fa.a(-14, (hb) null, (byte) -35, 21);
          }
          stackIn_4_0 = ql.a(123, param3, 96, param1, param0);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("fa.U(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    abstract void b(byte param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (aj.field_t != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (i.field_f != null &&
            i.field_f != this) {
            stackIn_8_0 = i.field_f.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var1), "fa.getDocumentBase()");
        }
    }

    final synchronized void a(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          if (null != gd.field_k) {
            gd.field_k.removeFocusListener((java.awt.event.FocusListener) (this));
            gd.field_k.getParent().setBackground(java.awt.Color.black);
            gd.field_k.getParent().remove((java.awt.Component) ((Object) gd.field_k));
          }
          boolean decompiledFrameRemainder0 = true;
          if (nf.field_e != null) {
            var2 = nf.field_e;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (aj.field_t == null) {
              if (null == i.field_f) {
                var2 = wi.field_f;
                if (var4 != 0) {
                  var2 = i.field_f;
                  var2 = aj.field_t;
                }
              } else {
                var2 = i.field_f;
                if (var4 != 0) {
                  var2 = aj.field_t;
                }
              }
            } else {
              var2 = aj.field_t;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          gd.field_k = (java.awt.Canvas) ((Object) new ah((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) gd.field_k));
          gd.field_k.setSize(fk.field_E, mk.field_x);
          gd.field_k.setVisible(true);
          if (aj.field_t == var2) {
            var3 = aj.field_t.getInsets();
            gd.field_k.setLocation(var3.left + gl.field_D, var3.top + uc.field_a);
            if (var4 != 0) {
              gd.field_k.setLocation(gl.field_D, uc.field_a);
            }
          } else {
            gd.field_k.setLocation(gl.field_D, uc.field_a);
          }
          gd.field_k.addFocusListener((java.awt.event.FocusListener) (this));
          gd.field_k.requestFocus();
          rj.field_b = true;
          bi.field_M = true;
          kb.field_l = true;
          mg.field_c = param0;
          tg.field_b = lk.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ch.a((Throwable) (var2), "fa.N(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (wi.field_f == this &&
            !gh.field_i) {
            lb.field_b = lk.a(0) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) runtimeException), "fa.stop()");
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (this == wi.field_f &&
            !gh.field_i) {
            kb.field_l = true;
            if (pg.field_a &&
              lk.a(0) - tg.field_b > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (ch.field_b > var2.width) {
                  return;
                }
                if (uh.field_j > var2.height) {
                  return;
                }
              }
              mg.field_c = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("fa.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
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
            if (gh.field_i) {
              return;
            }
            gh.field_i = true;
          }
          if (i.field_f != null) {
            i.field_f.destroy();
          }
          try {
            this.e(0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (gd.field_k != null) {
            try {
              gd.field_k.removeFocusListener((java.awt.event.FocusListener) (this));
              gd.field_k.getParent().remove((java.awt.Component) ((Object) gd.field_k));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (lk.field_b != null) {
            try {
              lk.field_b.a((byte) -23);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (param0) {
            fa.f(-17);
          }
          this.c(3);
          if (aj.field_t != null) {
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
          throw ch.a((Throwable) ((Object) runtimeException), "fa.O(" + param0 + ',' + param1 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == wi.field_f &&
            !gh.field_i) {
            lb.field_b = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) runtimeException), "fa.start()");
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
          stackIn_5_1 = new StringBuilder().append("fa.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          i.field_f = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fa.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void b(int param0);

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          var2_long = lk.a(0);
          var4 = kd.field_b[kh.field_b];
          kd.field_b[kh.field_b] = var2_long;
          kh.field_b = 31 & kh.field_b + 1;
          if (param0 != -58) {
            this.getAppletContext();
          }
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            ub.field_a = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = ak.field_a;
          ak.field_a = ak.field_a + 1;
          if (50 < fieldTemp$1) {
            kb.field_l = true;
            ak.field_a = ak.field_a - 50;
            gd.field_k.setSize(fk.field_E, mk.field_x);
            gd.field_k.setVisible(true);
            boolean decompiledSharedTail0 = (null != aj.field_t &&
              nf.field_e == null);
            if (!decompiledSharedTail0) {
              gd.field_k.setLocation(gl.field_D, uc.field_a);
              decompiledSharedTail0 = (Transmogrify.field_A);
            }
            if (decompiledSharedTail0) {
              var6 = aj.field_t.getInsets();
              gd.field_k.setLocation(gl.field_D + var6.left, var6.top + uc.field_a);
            }
          }
          this.b(15648);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) runtimeException), "fa.Q(" + param0 + ')');
        }
    }

    public abstract void init();

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != aj.field_t) {
          return null;
        }
        if (i.field_f != null &&
          this != i.field_f) {
          return i.field_f.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void e(int param0);

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          bi.field_M = true;
          kb.field_l = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fa.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_70_0 = false;
          int stackIn_86_0 = 0;
          int stackIn_86_1 = 0;
          int stackIn_105_0 = 0;
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
          var5 = Transmogrify.field_A ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != fe.field_w) {
                var1 = fe.field_w.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = fe.field_c;
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
                    this.a((byte) -127, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_70_0 = dj.a(var2.charAt(var3), true);
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_70_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (qj.a((CharSequence) ((Object) var4), 110) &&
                        !(aa.a(-97, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a((byte) -127, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != fe.field_c))) {
                stackIn_70_0 = fe.field_c.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_70_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (fe.field_c.length() > var1_int) {
                    var3 = fe.field_c.charAt(var1_int);
                    stackIn_86_0 = ~var3;
                    stackIn_86_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_86_0 <= stackIn_86_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = var3 - 48 + var2_int * 10;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_86_0 = 5;
                    stackIn_86_1 = var2_int;
                  }
                  if (stackIn_86_0 > stackIn_86_1) {
                    break;
                  }
                  pg.field_a = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = wi.field_f;
                if (null != i.field_f) {
                  var1 = i.field_f;
                }
                var2_ref = fe.field_x;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                wb.a((byte) -124);
                this.a(false);
                ri.field_k = wc.a(4, (java.awt.Component) ((Object) gd.field_k), mk.field_x, fk.field_E);
                this.a(-9);
                th.field_c = oc.j(0);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (lb.field_b != 0L) {
                    stackIn_105_0 = $cfr$lcmp(~lb.field_b, ~lk.a(0));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_105_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ca.field_b = th.field_c.a((byte) -117, fg.field_j);
                    stackIn_105_0 = 0;
                  }
                  var3 = stackIn_105_0;
                  do {
                    if (!(ca.field_b > var3)) {
                      this.d(-58);
                      db.a(lk.field_b, gd.field_k, -85);
                      break;
                    }
                    this.a((byte) -98);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              d.a((Throwable) (var1), 1, (String) null);
              this.a((byte) -113, "crash");
            }
            this.a(false, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ch.a((Throwable) (var1), "fa.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected fa() {
        this.field_j = false;
    }

    public final void destroy() {
        if (wi.field_f != this ||
          gh.field_i) {
          return;
        }
        try {
          lb.field_b = lk.a(0);
          pg.a(5000L, -120);
          f.field_b = null;
          this.a(false, false);
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "fa.destroy()");
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
            if (this.field_j) {
              return;
            }
            this.field_j = true;
            System.out.println("error_game_" + param1);
            if (param0 >= -90) {
              field_i = (vd) null;
            }
            try {
              kj.a(ha.b(74), false, "loggedout");
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
            stackIn_15_1 = new StringBuilder().append("fa.S(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          stackIn_5_1 = new StringBuilder().append("fa.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void a(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
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
          if (aj.field_t != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (i.field_f != null &&
            this != i.field_f) {
            stackIn_10_0 = i.field_f.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("fa.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          fe dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          ib var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Transmogrify.field_A ? 1 : 0;
          try {
            try {
              if (null != wi.field_f) {
                bh.field_c = bh.field_c + 1;
                if (bh.field_c >= 3) {
                  this.a((byte) -94, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              wi.field_f = this;
              gl.field_D = 0;
              uc.field_a = 0;
              mk.field_x = param1;
              uh.field_j = param1;
              fk.field_E = param6;
              ch.field_b = param6;
              gh.field_h = param3;
              re.field_i = ha.b(108);
              dupTemp$0 = new fe(param5, param2, param4, true);
              lk.field_b = dupTemp$0;
              f.field_b = dupTemp$0;
              var8 = lk.field_b.a((Runnable) (this), 1, 65535);
              if (param0 != 79) {
                return;
              }
              while (true) {
                if (var8.field_c == 0) {
                  pg.a(10L, -82);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              d.a(var8_ref, -124, (String) null);
              this.a((byte) -108, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("fa.R(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw ch.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
        field_f = 1;
        field_g = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
