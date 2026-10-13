/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

public abstract class ke extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static mh field_e;
    static String field_k;
    boolean field_d;
    private static Calendar field_n;
    static int[] field_m;
    static String field_b;
    static String field_f;
    public static int field_l;
    public static int field_j;
    public static boolean field_i;
    public static int field_a;
    public static boolean field_g;
    public static int field_h;
    public static int field_c;

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void f(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != cb.field_o) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != sl.field_x &&
            sl.field_x != this) {
            stackIn_8_0 = sl.field_x.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "ke.getDocumentBase()");
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = ue.a(false);
          if (param0 != 26573) {
            field_f = (String) null;
          }
          var4 = sm.field_c[cq.field_t];
          sm.field_c[cq.field_t] = var2_long;
          cq.field_t = 31 & 1 + cq.field_t;
          if (0L != var4 &&
            var4 < var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            qa.field_r = CircleBody.field_r;
          }
          this.f(-107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "ke.S(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != cb.field_o) {
          return null;
        }
        if (null != sl.field_x &&
          sl.field_x != this) {
          return sl.field_x.getCodeBase();
        }
        return super.getCodeBase();
    }

    final boolean e(int param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          tg dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          ql var9 = null;
          int var10 = 0;
          var10 = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              if (so.field_f != null) {
                sp.field_l = sp.field_l + 1;
                if (sp.field_l < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", 4000);
                return;
              }
              to.field_b = param3;
              u.field_d = param3;
              so.field_f = this;
              to.field_i = 0;
              var8_int = 88 / ((param1 - 24) / 56);
              hk.field_W = 0;
              oj.field_m = param4;
              be.field_g = param2;
              mc.field_d = param2;
              mk.field_i = uc.e((byte) -64);
              dupTemp$0 = new tg(param0, param5, param6, true);
              lp.field_ub = dupTemp$0;
              mq.field_e = dupTemp$0;
              var9 = lp.field_ub.a(1, (Runnable) (this), (byte) -124);
              while (true) {
                if (var9.field_f == 0) {
                  wj.a(-125, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              rk.a((String) null, var8, 52);
              this.a("crash", 4000);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("ke.N(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (cb.field_o != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (sl.field_x != null &&
            this != sl.field_x) {
            stackIn_10_0 = sl.field_x.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "ke.getAppletContext()");
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
          stackIn_5_1 = new StringBuilder().append("ke.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int[] param0, byte param1, fo param2) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          MovingBody.a(-122, param0, 5, param2);
          if (param1 != 39) {
            ke.a(false, (byte[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("ke.U(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
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
          if (so.field_f == this &&
            !ai.field_s) {
            qc.field_i = true;
            if (tf.field_h &&
              -er.field_c + ue.a(false) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < u.field_d) {
                  return;
                }
                if (mc.field_d > var2.height) {
                  return;
                }
              }
              tn.field_A = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_27_0 = var2_ref;
          stackIn_27_1 = new StringBuilder().append("ke.paint(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_79_1 = 0;
          int stackIn_98_0 = 0;
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
          var5 = BrickABrac.field_J ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != tg.field_g) {
                var1 = tg.field_g.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = tg.field_o;
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
                    this.a("wrongjava", 4000);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = eh.a(var2.charAt(var3), (byte) 86);
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
                      if (dc.a((CharSequence) ((Object) var4), -102) &&
                        !(fl.a((CharSequence) ((Object) var4), -28734) >= 10)) {
                        this.a("wrongjava", 4000);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (tg.field_o != null))) {
                stackIn_66_0 = tg.field_o.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < tg.field_o.length()) {
                    var3 = tg.field_o.charAt(var1_int);
                    stackIn_79_0 = ~var3;
                    stackIn_79_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_79_0 <= stackIn_79_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = var2_int * 10 + var3 - 48;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_79_0 = -6;
                    stackIn_79_1 = ~var2_int;
                  }
                  if (stackIn_79_0 < stackIn_79_1) {
                    break;
                  }
                  tf.field_h = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = so.field_f;
                if (sl.field_x != null) {
                  var1 = sl.field_x;
                }
                var2_ref = tg.field_x;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                sh.b(1);
                this.c(false);
                kc.field_q = jm.a((java.awt.Component) ((Object) kj.field_D), to.field_b, -2414, be.field_g);
                this.b(false);
                re.field_b = ja.a((byte) 123);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != jg.field_k) {
                    stackIn_98_0 = $cfr$lcmp(jg.field_k, ue.a(false));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_98_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    c.field_a = re.field_b.a(hb.field_x, (byte) -71);
                    stackIn_98_0 = 0;
                  }
                  var3 = stackIn_98_0;
                  do {
                    if (!(c.field_a > var3)) {
                      this.h(0);
                      kq.a(-4317, lp.field_ub, kj.field_D);
                      break;
                    }
                    this.c(26573);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              rk.a((String) null, (Throwable) (var1), 77);
              this.a("crash", 4000);
            }
            this.a(true, -93);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw qb.a((Throwable) (var1), "ke.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void h(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = ue.a(false);
          var4 = ig.field_M[de.field_w];
          ig.field_M[de.field_w] = var2_long;
          de.field_w = 31 & 1 + de.field_w;
          if ((long)param0 != var4 &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            d.field_H = (32000 + (var6_int >> 1)) / var6_int;
          }
          fieldTemp$1 = gk.field_a;
          gk.field_a = gk.field_a + 1;
          if (50 < fieldTemp$1) {
            qc.field_i = true;
            gk.field_a = gk.field_a - 50;
            kj.field_D.setSize(to.field_b, be.field_g);
            kj.field_D.setVisible(true);
            if (null != cb.field_o &&
              null == fd.field_e) {
              var6 = cb.field_o.getInsets();
              kj.field_D.setLocation(var6.left + to.field_i, var6.top + hk.field_W);
              if (BrickABrac.field_J) {
                kj.field_D.setLocation(to.field_i, hk.field_W);
              }
            } else {
              kj.field_D.setLocation(to.field_i, hk.field_W);
            }
          }
          this.g(param0 + 102);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "ke.W(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CircleBody.field_r = true;
          qc.field_i = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ke.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        if (so.field_f != this ||
          ai.field_s) {
          return;
        }
        try {
          jg.field_k = ue.a(false) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ke.stop()");
        }
    }

    public static void d(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_m = null;
          if (param0 != 19254) {
            ke.a((int[]) null, (byte) -57, (fo) null);
          }
          field_b = null;
          field_f = null;
          field_n = null;
          field_k = null;
          field_e = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var1), "ke.O(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Exception var4_ref = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable decompiledCaughtException = null;
        Throwable var4 = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (ai.field_s) {
              return;
            }
            ai.field_s = true;
          }
          if (null != sl.field_x) {
            sl.field_x.destroy();
          }
          try {
            this.a(false);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          var3_int = -40 % ((-22 - param1) / 54);
          if (kj.field_D != null) {
            try {
              kj.field_D.removeFocusListener((java.awt.event.FocusListener) (this));
              kj.field_D.getParent().remove((java.awt.Component) ((Object) kj.field_D));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var4_ref = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (lp.field_ub != null) {
            try {
              lp.field_ub.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var4_ref = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.d(true);
          if (null != cb.field_o) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var4 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "ke.BA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void c(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = BrickABrac.field_J ? 1 : 0;
        try {
          if (kj.field_D != null) {
            kj.field_D.removeFocusListener((java.awt.event.FocusListener) (this));
            kj.field_D.getParent().setBackground(java.awt.Color.black);
            kj.field_D.getParent().remove((java.awt.Component) ((Object) kj.field_D));
          }
          boolean decompiledFrameRemainder0 = true;
          if (fd.field_e == null) {
            if (null != cb.field_o) {
              var2 = cb.field_o;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null == sl.field_x) {
                var2 = so.field_f;
                if (var4 != 0) {
                  var2 = sl.field_x;
                  var2 = fd.field_e;
                }
              } else {
                var2 = sl.field_x;
                if (var4 != 0) {
                  var2 = fd.field_e;
                }
              }
            }
          } else {
            var2 = fd.field_e;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          kj.field_D = (java.awt.Canvas) ((Object) new od((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) kj.field_D));
          kj.field_D.setSize(to.field_b, be.field_g);
          kj.field_D.setVisible(true);
          if (cb.field_o == var2) {
            var3 = cb.field_o.getInsets();
            kj.field_D.setLocation(var3.left + to.field_i, var3.top + hk.field_W);
            if (var4 != 0) {
              kj.field_D.setLocation(to.field_i, hk.field_W);
            }
          } else {
            kj.field_D.setLocation(to.field_i, hk.field_W);
          }
          kj.field_D.addFocusListener((java.awt.event.FocusListener) (this));
          kj.field_D.requestFocus();
          CircleBody.field_r = true;
          qa.field_r = true;
          qc.field_i = true;
          tn.field_A = param0;
          er.field_c = ue.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw qb.a((Throwable) (var2), "ke.DA(" + param0 + ')');
        }
    }

    final static byte[] a(boolean param0, byte[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_e = (mh) null;
          }
          var2_int = param1.length;
          var3 = new byte[var2_int];
          pm.a(param1, 0, var3, 0, var2_int);
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("ke.R(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          CircleBody.field_r = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ke.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_d) {
              return;
            }
            this.field_d = true;
            System.out.println("error_game_" + param0);
            try {
              ne.a("loggedout", -123, uc.e((byte) -124));
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
            if (param1 != 4000) {
              field_k = (String) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = runtimeException;
            stackIn_17_1 = new StringBuilder().append("ke.CA(");
            if (param0 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw qb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void b(boolean param0);

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == so.field_f &&
            !ai.field_s) {
            jg.field_k = ue.a(false);
            wj.a(-127, 5000L);
            mq.field_e = null;
            this.a(false, 46);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) runtimeException), "ke.destroy()");
        }
    }

    abstract void a(boolean param0);

    abstract void d(boolean param0);

    final static String a(byte param0, long param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        String stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          field_n.setTime(new Date(param1));
          var3_int = field_n.get(7);
          var4 = field_n.get(5);
          var5 = field_n.get(2);
          var6 = field_n.get(1);
          var7 = field_n.get(11);
          if (param0 != -75) {
            ke.a((int[]) null, (byte) -75, (fo) null);
          }
          var8 = field_n.get(12);
          var9 = field_n.get(13);
          stackIn_4_0 = ip.field_u[-1 + var3_int] + ", " + var4 / 10 + var4 % 10 + "-" + ek.field_eb[var5] + "-" + var6 + " " + var7 / 10 + var7 % 10 + ":" + var8 / 10 + var8 % 10 + ":" + var9 / 10 + var9 % 10 + " GMT";
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw qb.a((Throwable) ((Object) var3), "ke.P(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void g(int param0);

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sl.field_x = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ke.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        if (so.field_f != this ||
          ai.field_s) {
          return;
        }
        try {
          jg.field_k = 0L;
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "ke.start()");
        }
    }

    public abstract void init();

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
          if (cb.field_o != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != sl.field_x &&
            this != sl.field_x) {
            stackIn_10_0 = sl.field_x.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ke.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    protected ke() {
        this.field_d = false;
    }

    final static void a(int param0, sp param1, int param2) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        pi var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = BrickABrac.field_J ? 1 : 0;
        try {
          var3 = k.field_h;
          var3.e(param2 ^ -3818, param0);
          var3.field_l = var3.field_l + 1;
          var4 = var3.field_l;
          var3.a(106, 1);
          var3.b((byte) 116, param1.field_m);
          var3.b((byte) 112, param1.field_o);
          var3.b((byte) 127, param1.field_q);
          var3.a(param1.field_k, (byte) -79);
          var3.a(param1.field_n, (byte) -79);
          var3.a(param1.field_r, (byte) -79);
          if (param2 != 14989) {
            field_f = (String) null;
          }
          var3.a(param1.field_j, (byte) -79);
          var3.a(-28, param1.field_i.length);
          var5 = 0;
          while (var5 < param1.field_i.length) {
            var3.a(param1.field_i[var5], (byte) -79);
            var5++;
            if (var6 != 0) {
              return;
            }
          }
          var3.d(3, var4);
          var3.d((byte) 113, var3.field_l - var4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_15_0 = var3_ref;
          stackIn_15_1 = new StringBuilder().append("ke.Q(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("ke.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_k = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_n = Calendar.getInstance(TimeZone.getTimeZone("GMT"));
        field_m = new int[128];
        field_b = null;
        field_f = "Shrink: makes your paddle shorter.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
