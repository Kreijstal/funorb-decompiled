/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class eh extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String[] field_k;
    static boolean field_m;
    static rh field_f;
    boolean field_i;
    static ci field_b;
    static gg[] field_g;
    static int field_d;
    public static boolean field_j;
    public static int field_a;
    public static int field_e;
    public static boolean field_h;
    public static boolean field_n;
    public static boolean field_c;
    public static boolean field_l;

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          le.field_r = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("eh.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (gm.field_f == this &&
            !qi.field_f) {
            il.field_e = true;
            if (bh.field_f &&
              ll.a(1000) - oj.field_x > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < hd.field_i) {
                  return;
                }
                if (dj.field_a > var2.height) {
                  return;
                }
              }
              ai.field_h = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_27_0 = var2_ref;
          stackIn_27_1 = new StringBuilder().append("eh.paint(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (al.field_W != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != le.field_r &&
            le.field_r != this) {
            stackIn_8_0 = le.field_r.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "eh.getAppletContext()");
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
          if (al.field_W != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != le.field_r &&
            this != le.field_r) {
            stackIn_10_0 = le.field_r.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("eh.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public static void c(int param0) {
        try {
          field_f = null;
          field_g = null;
          field_k = null;
          field_b = null;
          if (param0 != -25) {
            field_g = (gg[]) null;
          }
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "eh.G(" + param0 + ')');
        }
    }

    abstract void a(int param0);

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
          stackIn_5_1 = new StringBuilder().append("eh.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_84_0 = 0;
          int stackIn_84_1 = 0;
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
          var5 = Terraphoenix.field_V;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != he.field_j) {
                var1 = he.field_j.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = he.field_d;
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
                    this.a("wrongjava", true);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = gb.a((byte) 41, var2.charAt(var3));
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
                      if (te.a((CharSequence) ((Object) var4), true) &&
                        !(10 <= ta.a((CharSequence) ((Object) var4), 121))) {
                        this.a("wrongjava", true);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != he.field_d))) {
                stackIn_68_0 = he.field_d.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (he.field_d.length() > var1_int) {
                    var3 = he.field_d.charAt(var1_int);
                    stackIn_84_0 = 48;
                    stackIn_84_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_84_0 <= stackIn_84_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = var2_int * 10 - (-var3 + 48);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_84_0 = 5;
                    stackIn_84_1 = var2_int;
                  }
                  if (stackIn_84_0 > stackIn_84_1) {
                    break;
                  }
                  bh.field_f = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = gm.field_f;
                if (null != le.field_r) {
                  var1 = le.field_r;
                }
                var2_ref = he.field_x;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                oa.a((byte) -119);
                this.d(0);
                k.field_f = bi.a(ja.field_j, -126, wc.field_p, (java.awt.Component) ((Object) ae.field_G));
                this.f(-120);
                ea.field_k = qc.a(-1);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (ae.field_M != 0L) {
                    stackIn_103_0 = $cfr$lcmp(ae.field_M, ll.a(1000));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_103_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    bb.field_d = ea.field_k.a(dm.field_f, -121);
                    stackIn_103_0 = 0;
                  }
                  var3 = stackIn_103_0;
                  do {
                    if (!(var3 < bb.field_d)) {
                      this.b(0);
                      cf.a(nj.field_l, false, ae.field_G);
                      break;
                    }
                    this.e(8028);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              bd.a((Throwable) (var1), (String) null, -97);
              this.a("crash", true);
            }
            this.a(true, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw qk.a((Throwable) (var1), "eh.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (al.field_W != null) {
          return null;
        }
        if (le.field_r != null &&
          this != le.field_r) {
          return le.field_r.getCodeBase();
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
          wb.field_d = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("eh.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void a(byte param0);

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
            if (this.field_i) {
              return;
            }
            this.field_i = param1;
            System.out.println("error_game_" + param0);
            try {
              cd.a((byte) -128, "loggedout", dg.a(false));
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
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("eh.M(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
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
            if (qi.field_f) {
              return;
            }
            qi.field_f = param0;
          }
          if (le.field_r != null) {
            le.field_r.destroy();
          }
          try {
            this.b((byte) 118);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ae.field_G) {
            try {
              ae.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
              ae.field_G.getParent().remove((java.awt.Component) ((Object) ae.field_G));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != nj.field_l) {
            try {
              nj.field_l.c(-7538);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.a(102);
          if (al.field_W != null) {
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
          throw qk.a((Throwable) ((Object) runtimeException), "eh.O(" + param0 + ',' + param1 + ')');
        }
    }

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          var2_long = ll.a(param0 + 1000);
          var4 = bb.field_f[ck.field_b];
          bb.field_f[ck.field_b] = var2_long;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            gl.field_k = ((var6_int >> 1) + 32000) / var6_int;
          }
          if (param0 != 0) {
            eh.a(108, (dh) null);
          }
          ck.field_b = ck.field_b + 1 & 31;
          fieldTemp$1 = q.field_Db;
          q.field_Db = q.field_Db + 1;
          if (50 < fieldTemp$1) {
            il.field_e = true;
            q.field_Db = q.field_Db - 50;
            ae.field_G.setSize(ja.field_j, wc.field_p);
            ae.field_G.setVisible(true);
            if (null != al.field_W &&
              jb.field_e == null) {
              var6 = al.field_W.getInsets();
              ae.field_G.setLocation(var6.left + ng.field_v, uh.field_P + var6.top);
              if (Terraphoenix.field_V != 0) {
                ae.field_G.setLocation(ng.field_v, uh.field_P);
              }
            } else {
              ae.field_G.setLocation(ng.field_v, uh.field_P);
            }
          }
          this.a((byte) -89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "eh.J(" + param0 + ')');
        }
    }

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = ll.a(1000);
          var4 = jb.field_d[o.field_b];
          jb.field_d[o.field_b] = var2_long;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          if (param0 != 8028) {
            this.windowClosing((java.awt.event.WindowEvent) null);
          }
          o.field_b = 1 + o.field_b & 31;
          var6 = this;
          synchronized (var6) {
            uk.field_c = wb.field_d;
          }
          this.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qk.a((Throwable) ((Object) runtimeException), "eh.H(" + param0 + ')');
        }
    }

    public abstract void init();

    public final void destroy() {
        if (gm.field_f != this ||
          qi.field_f) {
          return;
        }
        try {
          ae.field_M = ll.a(1000);
          gi.a((byte) -113, 5000L);
          d.field_K = null;
          this.a(true, false);
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "eh.destroy()");
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
          stackIn_5_1 = new StringBuilder().append("eh.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void f(int param0);

    final synchronized void d(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Terraphoenix.field_V;
        try {
          if (null != ae.field_G) {
            ae.field_G.removeFocusListener((java.awt.event.FocusListener) (this));
            ae.field_G.getParent().setBackground(java.awt.Color.black);
            ae.field_G.getParent().remove((java.awt.Component) ((Object) ae.field_G));
          }
          boolean decompiledFrameRemainder0 = true;
          if (jb.field_e == null) {
            if (al.field_W != null) {
              var2 = al.field_W;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (le.field_r == null) {
                var2 = gm.field_f;
                if (var4 != 0) {
                  var2 = le.field_r;
                  var2 = jb.field_e;
                }
              } else {
                var2 = le.field_r;
                if (var4 != 0) {
                  var2 = jb.field_e;
                }
              }
            }
          } else {
            var2 = jb.field_e;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ae.field_G = (java.awt.Canvas) ((Object) new jm((java.awt.Component) (this)));
          if (param0 != 0) {
            return;
          }
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ae.field_G));
          ae.field_G.setSize(ja.field_j, wc.field_p);
          ae.field_G.setVisible(true);
          if (var2 == al.field_W) {
            var3 = al.field_W.getInsets();
            ae.field_G.setLocation(ng.field_v + var3.left, uh.field_P + var3.top);
            if (var4 != 0) {
              ae.field_G.setLocation(ng.field_v, uh.field_P);
            }
          } else {
            ae.field_G.setLocation(ng.field_v, uh.field_P);
          }
          ae.field_G.addFocusListener((java.awt.event.FocusListener) (this));
          ae.field_G.requestFocus();
          uk.field_c = true;
          wb.field_d = true;
          il.field_e = true;
          ai.field_h = false;
          oj.field_x = ll.a(1000);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qk.a((Throwable) (var2), "eh.E(" + param0 + ')');
        }
    }

    public final void stop() {
        if (this != gm.field_f ||
          qi.field_f) {
          return;
        }
        try {
          ae.field_M = ll.a(1000) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "eh.stop()");
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (gm.field_f != this ||
          qi.field_f) {
          return;
        }
        try {
          ae.field_M = 0L;
        } catch (RuntimeException runtimeException) {
          throw qk.a((Throwable) ((Object) runtimeException), "eh.start()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != al.field_W) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != le.field_r &&
            le.field_r != this) {
            stackIn_10_0 = le.field_r.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qk.a((Throwable) ((Object) var1), "eh.getDocumentBase()");
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final boolean b(boolean param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          he dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          mf var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Terraphoenix.field_V;
          try {
            try {
              if (gm.field_f != null) {
                jm.field_f = jm.field_f + 1;
                if (jm.field_f >= 3) {
                  this.a("alreadyloaded", true);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              gm.field_f = this;
              ng.field_v = 0;
              ja.field_j = param4;
              hd.field_i = param4;
              wc.field_p = param6;
              dj.field_a = param6;
              if (param1 != 50) {
                this.e(-55);
              }
              uh.field_P = 0;
              ve.field_b = param3;
              td.field_b = dg.a(false);
              dupTemp$0 = new he(param2, param5, param0, true);
              nj.field_l = dupTemp$0;
              d.field_K = dupTemp$0;
              var8 = nj.field_l.a((Runnable) (this), (byte) -21, 1);
              while (true) {
                if (var8.field_d == 0) {
                  gi.a((byte) -56, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              bd.a(var8_ref, (String) null, 108);
              this.a("crash", true);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("eh.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void b(byte param0);

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wb.field_d = true;
          il.field_e = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("eh.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, dh param1) {
        try {
          RuntimeException runtimeException = null;
          byte[] var2 = null;
          int var5 = 0;
          byte stackIn_10_0 = 0;
          int stackIn_17_0 = 0;
          RuntimeException stackIn_32_0 = null;
          StringBuilder stackIn_32_1 = null;
          String stackIn_33_2 = null;
          int decompiledRegionSelector0 = 0;
          Throwable decompiledCaughtException = null;
          byte stackOut_9_0;
          int var3_int = 0;
          Exception var3 = null;
          int var4 = 0;
          var5 = Terraphoenix.field_V;
          try {
            var2 = new byte[24];
            if (param0 != 9371) {
              field_g = (gg[]) null;
            }
            if (mh.field_b != null) {
              try {
                mh.field_b.a(false, 0L);
                mh.field_b.a(var2, param0 - 2766);
                var3_int = 0;
                L5: while (true) {
                  if (var3_int < 24) {
                    stackOut_9_0 = var2[var3_int];
                    stackIn_17_0 = stackOut_9_0;
                    stackIn_10_0 = stackOut_9_0;
                    if (var5 != 0) {
                      break L5;
                    }
                    if (stackIn_10_0 == 0) {
                      var3_int++;
                      continue;
                    }
                  }
                  stackIn_17_0 = -25;
                  break;
                }
                if (stackIn_17_0 >= ~var3_int) {
                  throw new IOException();
                }
                decompiledRegionSelector0 = 0;
              } catch (java.lang.Exception decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                boolean decompiledFrameCompleted0 = true;
                var3 = (Exception) (Object) decompiledCaughtException;
                var4 = 0;
                while (var4 < 24) {
                  var2[var4] = (byte) -1;
                  var4++;
                  if (var5 != 0) {
                    decompiledRegionSelector0 = 1;
                    decompiledFrameCompleted0 = false;
                    break;
                  }
                }
                if (decompiledFrameCompleted0) {
                  decompiledRegionSelector0 = 0;
                }
              }
              if (decompiledRegionSelector0 != 0) {
                return;
              }
            }
            param1.a(-222449912, var2, 24, 0);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_32_0 = runtimeException;
            stackIn_32_1 = new StringBuilder().append("eh.L(").append(param0).append(',');
            if (param1 == null) {
              stackIn_33_2 = "null";
            } else {
              stackIn_33_2 = "{...}";
            }
            throw qk.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected eh() {
        this.field_i = false;
    }

    final static void a(int param0, String[] param1) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (null != pe.field_b) {
            pe.field_b.field_N.a(-11678, param1);
          }
          if (rd.field_s != null) {
            rd.field_s.field_N.a(-11678, param1);
          }
          if (param0 != -32202) {
            eh.a(-61, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("eh.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw qk.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_k = new String[255];
        field_m = false;
        field_f = new rh(10, 2, 2, 0);
        field_d = 0;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
