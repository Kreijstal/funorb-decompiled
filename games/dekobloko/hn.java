/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class hn extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_f;
    static ij field_c;
    static nk field_h;
    static int field_a;
    static lm field_g;
    public static boolean field_j;
    public static boolean field_b;
    public static int field_k;
    public static boolean field_e;
    public static int field_i;
    public static int field_l;
    public static boolean field_d;

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ge.field_i = true;
          cd.field_g = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hn.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    final static pi a(String param0, ji param1, String param2, byte param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        pi stackIn_4_0 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 26) {
            field_c = (ij) null;
          }
          var4_int = param1.b(-1, param2);
          var5 = param1.a(var4_int, 13030, param0);
          stackIn_4_0 = ma.a(param1, var4_int, var5, 21828);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_8_0 = var4;
          stackIn_8_1 = new StringBuilder().append("hn.M(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_12_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param3).append(')').toString());
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
          if (null != hg.field_c) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != kb.field_h &&
            this != kb.field_h) {
            stackIn_12_0 = kb.field_h.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("hn.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hg.field_c != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (kb.field_h != null &&
            kb.field_h != this) {
            stackIn_10_0 = kb.field_h.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "hn.getAppletContext()");
        }
    }

    final void a(String param0, int param1, int param2, boolean param3, int param4, int param5, int param6) {
        try {
          fd dupTemp$1 = null;
          mh var8 = null;
          int var9 = 0;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          var9 = client.field_A ? 1 : 0;
          try {
            try {
              if (ta.field_i != null) {
                be.field_q = be.field_q + 1;
                if (be.field_q < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(true, "alreadyloaded");
                return;
              }
              pn.field_ab = 0;
              de.field_M = param5;
              oe.field_H = param5;
              qd.field_Rb = 0;
              ob.field_g = param4;
              lf.field_c = param4;
              ta.field_i = this;
              wb.field_Rb = param6;
              th.field_b = se.h(25144);
              dupTemp$1 = new fd(param1, param0, param2, param3);
              lf.field_e = dupTemp$1;
              o.field_f = dupTemp$1;
              var8 = lf.field_e.a((byte) -126, 1, (Runnable) (this));
              while (true) {
                if (0 == var8.field_c) {
                  ua.a(10L, -128);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              qb.a(var8_ref, 16408, (String) null);
              this.a(true, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref2;
            stackIn_21_1 = new StringBuilder().append("hn.B(");
            if (param0 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean a(byte param0) {
        return true;
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kb.field_h = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hn.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ta.field_i == this &&
            !eg.field_d) {
            l.field_h = ik.a(4);
            ua.a(5000L, -128);
            o.field_f = null;
            this.a(false, -124);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) runtimeException), "hn.destroy()");
        }
    }

    private final void a(boolean param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        try {
          var2_long = ik.a(4);
          var4 = sf.field_y[ec.field_h];
          sf.field_y[ec.field_h] = var2_long;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            jf.field_c = (32000 + (var6_int >> 1)) / var6_int;
          }
          if (param0) {
            return;
          }
          ec.field_h = ec.field_h + 1 & 31;
          fieldTemp$1 = jb.field_d;
          jb.field_d = jb.field_d + 1;
          if (fieldTemp$1 > 50) {
            cd.field_g = true;
            jb.field_d = jb.field_d - 50;
            jh.field_b.setSize(de.field_M, ob.field_g);
            jh.field_b.setVisible(true);
            boolean decompiledSharedTail0 = (null != hg.field_c &&
              oj.field_c == null);
            if (!decompiledSharedTail0) {
              jh.field_b.setLocation(qd.field_Rb, pn.field_ab);
              decompiledSharedTail0 = (client.field_A);
            }
            if (decompiledSharedTail0) {
              var6 = hg.field_c.getInsets();
              jh.field_b.setLocation(qd.field_Rb + var6.left, pn.field_ab + var6.top);
            }
          }
          this.d(320);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "hn.H(" + param0 + ')');
        }
    }

    final synchronized void b(byte param0) {
        int var2_int = 0;
        Object var3 = null;
        java.awt.Insets var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = client.field_A ? 1 : 0;
        try {
          if (null != jh.field_b) {
            jh.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
            jh.field_b.getParent().setBackground(java.awt.Color.black);
            jh.field_b.getParent().remove((java.awt.Component) ((Object) jh.field_b));
          }
          boolean decompiledFrameRemainder0 = true;
          var2_int = 123 / ((param0 - 18) / 39);
          if (null != oj.field_c) {
            var3 = oj.field_c;
            decompiledFrameRemainder0 = (var5 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (hg.field_c == null) {
              if (kb.field_h != null) {
                var3 = kb.field_h;
                if (var5 != 0) {
                  var3 = ta.field_i;
                  var3 = hg.field_c;
                }
              } else {
                var3 = ta.field_i;
                if (var5 != 0) {
                  var3 = hg.field_c;
                }
              }
            } else {
              var3 = hg.field_c;
            }
          }
          ((java.awt.Container) (var3)).setLayout((java.awt.LayoutManager) null);
          jh.field_b = (java.awt.Canvas) ((Object) new dk((java.awt.Component) (this)));
          ((java.awt.Container) (var3)).add((java.awt.Component) ((Object) jh.field_b));
          jh.field_b.setSize(de.field_M, ob.field_g);
          jh.field_b.setVisible(true);
          if (hg.field_c == var3) {
            var4 = hg.field_c.getInsets();
            jh.field_b.setLocation(var4.left + qd.field_Rb, pn.field_ab + var4.top);
            if (var5 != 0) {
              jh.field_b.setLocation(qd.field_Rb, pn.field_ab);
            }
          } else {
            jh.field_b.setLocation(qd.field_Rb, pn.field_ab);
          }
          jh.field_b.addFocusListener((java.awt.event.FocusListener) (this));
          jh.field_b.requestFocus();
          ge.field_i = true;
          qc.field_N = true;
          cd.field_g = true;
          jg.field_e = false;
          gn.field_f = ik.a(4);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var2), "hn.K(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (eg.field_d) {
              return;
            }
            eg.field_d = true;
          }
          if (null != kb.field_h) {
            kb.field_h.destroy();
          }
          try {
            this.e(0);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (jh.field_b != null) {
            try {
              jh.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
              jh.field_b.getParent().remove((java.awt.Component) ((Object) jh.field_b));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != lf.field_e) {
            try {
              lf.field_e.a(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.a(124);
          if (null != hg.field_c) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          var3_int = -105 / ((param1 - 7) / 62);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dh.a((Throwable) ((Object) runtimeException), "hn.C(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    public final void start() {
        if (this != ta.field_i ||
          eg.field_d) {
          return;
        }
        try {
          l.field_h = 0L;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "hn.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final void a(boolean param0, String param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_f) {
              return;
            }
            this.field_f = true;
            System.out.println("error_game_" + param1);
            try {
              nc.a(param0, "loggedout", se.h(25144));
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
            stackIn_14_1 = new StringBuilder().append("hn.L(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw dh.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("hn.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var2_long = ik.a(4);
          var4 = jd.field_Ub[le.field_s];
          jd.field_Ub[le.field_s] = var2_long;
          le.field_s = 31 & 1 + le.field_s;
          if (var4 != 0L &&
            var4 >= var2_long) {
          }
          var6 = -68 / ((-31 - param0) / 40);
          var7 = this;
          synchronized (var7) {
            qc.field_N = ge.field_i;
          }
          this.c(11978);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dh.a((Throwable) ((Object) runtimeException), "hn.N(" + param0 + ')');
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
          var5 = client.field_A ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != fd.field_k) {
                var1 = fd.field_k.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = fd.field_c;
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
                    this.a(true, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = fl.a(var2.charAt(var3), (byte) 23);
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
                      if (be.a((byte) 98, (CharSequence) ((Object) var4)) &&
                        !(cb.a((byte) 51, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a(true, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != fd.field_c))) {
                stackIn_68_0 = fd.field_c.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < fd.field_c.length()) {
                    var3 = fd.field_c.charAt(var1_int);
                    stackIn_83_0 = ~var3;
                    stackIn_83_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 <= stackIn_83_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = var2_int * 10 - (-var3 + 48);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_83_0 = -6;
                    stackIn_83_1 = ~var2_int;
                  }
                  if (stackIn_83_0 < stackIn_83_1) {
                    break;
                  }
                  oh.field_b = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ta.field_i;
                if (null != kb.field_h) {
                  var1 = kb.field_h;
                }
                var2_ref = fd.field_f;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                si.b(1);
                this.b((byte) 125);
                le.field_m = el.a(ob.field_g, (byte) 120, de.field_M, (java.awt.Component) ((Object) jh.field_b));
                this.b(false);
                cm.field_f = eg.a((byte) 63);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (l.field_h != 0L) {
                    stackIn_102_0 = $cfr$lcmp(~ik.a(4), ~l.field_h);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    vm.field_r = cm.field_f.a(ul.field_g, 4);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(var3 < vm.field_r)) {
                      this.a(false);
                      db.a(-61, jh.field_b, lf.field_e);
                      break;
                    }
                    this.f(121);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              qb.a((Throwable) (var1), 16408, (String) null);
              this.a(true, "crash");
            }
            this.a(true, -128);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw dh.a((Throwable) (var1), "hn.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public abstract void init();

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ge.field_i = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("hn.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void b(int param0) {
        field_h = null;
        field_c = null;
        if (param0 != 6) {
          return;
        }
        try {
          field_g = null;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "hn.E(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != hg.field_c) {
          return null;
        }
        if (null != kb.field_h &&
          kb.field_h != this) {
          return kb.field_h.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_26_0 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (ta.field_i == this &&
            !eg.field_d) {
            cd.field_g = true;
            if (oh.field_b &&
              -gn.field_f + ik.a(4) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (oe.field_H > var2.width) {
                  return;
                }
                if (var2.height < lf.field_c) {
                  return;
                }
              }
              jg.field_e = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("hn.paint(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    abstract void e(int param0);

    public final void stop() {
        if (ta.field_i != this ||
          eg.field_d) {
          return;
        }
        try {
          l.field_h = ik.a(4) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw dh.a((Throwable) ((Object) runtimeException), "hn.stop()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hg.field_c != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != kb.field_h &&
            kb.field_h != this) {
            stackIn_12_0 = kb.field_h.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "hn.getDocumentBase()");
        }
    }

    abstract void d(int param0);

    protected hn() {
        this.field_f = false;
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
          stackIn_5_1 = new StringBuilder().append("hn.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void b(boolean param0);

    static {
        field_c = new ij("");
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
