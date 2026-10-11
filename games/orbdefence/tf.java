/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class tf extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int field_c;
    static java.awt.Canvas field_f;
    static ki field_d;
    static long field_l;
    boolean field_h;
    static volatile boolean field_m;
    public static boolean field_e;
    public static int field_b;
    public static boolean field_j;
    public static boolean field_i;
    public static boolean field_a;
    public static int field_g;
    public static int field_k;

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          int var3_int = 0;
          RuntimeException var3 = null;
          Throwable var4 = null;
          Exception var4_ref = null;
          try {
            var3_int = -119 / ((54 - param0) / 44);
            if (this.field_h) {
              return;
            }
            this.field_h = true;
            System.out.println("error_game_" + param1);
            try {
              gm.a(-31183, "loggedout", uj.b((byte) -120));
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
            stackIn_15_0 = var3;
            stackIn_15_1 = new StringBuilder().append("tf.M(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          mj.field_j = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("tf.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != h.field_J) {
          return null;
        }
        if (mj.field_j != null &&
          mj.field_j != this) {
          return mj.field_j.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void c(byte param0);

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_81_1 = 0;
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
          var5 = OrbDefence.field_D ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (be.field_s != null) {
                var1 = be.field_s.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = be.field_j;
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
                    this.a(-22, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = hm.a(-20625, var2.charAt(var3));
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
                      if (tk.a(10, (CharSequence) ((Object) var4)) &&
                        !(th.a(115, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a(7, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (be.field_j != null))) {
                stackIn_68_0 = be.field_j.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (be.field_j.length() > var1_int) {
                    var3 = be.field_j.charAt(var1_int);
                    stackIn_81_0 = var3;
                    stackIn_81_1 = 48;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 >= stackIn_81_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = -48 - (-var3 - 10 * var2_int);
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
                  d.field_g = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = aj.field_b;
                if (null != mj.field_j) {
                  var1 = mj.field_j;
                }
                var2_ref = be.field_x;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ml.a(117);
                this.e(53);
                cb.field_a = bk.a(bd.field_k, (java.awt.Component) ((Object) field_f), th.field_e, false);
                this.c((byte) -69);
                ge.field_g = ql.a(65280);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (jc.field_o != 0L) {
                    stackIn_98_0 = $cfr$lcmp(ji.b(-117), jc.field_o);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_98_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    m.field_c = ge.field_g.b(0, vc.field_j);
                    stackIn_98_0 = 0;
                  }
                  var3 = stackIn_98_0;
                  do {
                    if (!(m.field_c > var3)) {
                      this.b((byte) -126);
                      vf.a(field_f, 50, wc.field_c);
                      break;
                    }
                    this.a(0);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              pe.a((byte) -13, (Throwable) (var1), (String) null);
              this.a(-25, "crash");
            }
            this.a(0, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw dd.a((Throwable) (var1), "tf.run()");
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
          if (null != h.field_J) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (mj.field_j != null &&
            mj.field_j != this) {
            stackIn_10_0 = mj.field_j.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "tf.getAppletContext()");
        }
    }

    final static void a(java.applet.Applet param0, int param1) {
        try {
          java.net.URL var2 = null;
          RuntimeException stackIn_9_0 = null;
          StringBuilder stackIn_9_1 = null;
          String stackIn_10_2 = null;
          Throwable decompiledCaughtException = null;
          Exception var2_ref = null;
          RuntimeException var2_ref2 = null;
          try {
            try {
              var2 = new java.net.URL(param0.getCodeBase(), "toserverlist.ws");
              param0.getAppletContext().showDocument(f.a(param0, var2, param1 + 6345), "_top");
              if (param1 != -6407) {
                field_l = 20L;
              }
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var2_ref = (Exception) (Object) decompiledCaughtException;
              var2_ref.printStackTrace();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var2_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_9_0 = var2_ref2;
            stackIn_9_1 = new StringBuilder().append("tf.P(");
            if (param0 == null) {
              stackIn_10_2 = "null";
            } else {
              stackIn_10_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final boolean c(int param0) {
        return true;
    }

    abstract void a(byte param0);

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (te.field_G) {
              return;
            }
            te.field_G = true;
          }
          if (mj.field_j != null) {
            mj.field_j.destroy();
          }
          try {
            this.d(176400);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (field_f != null) {
            try {
              field_f.removeFocusListener((java.awt.event.FocusListener) (this));
              field_f.getParent().remove((java.awt.Component) ((Object) field_f));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != wc.field_c) {
            try {
              wc.field_c.a(20647);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.a(true);
          if (param0 != 0) {
            return;
          }
          if (null != h.field_J) {
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
          var3_ref3 = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var3_ref3), "tf.S(" + param0 + ',' + param1 + ')');
        }
    }

    public final void destroy() {
        if (this != aj.field_b ||
          te.field_G) {
          return;
        }
        try {
          jc.field_o = ji.b(126);
          hb.a(5000L, 101);
          df.field_e = null;
          this.a(0, false);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "tf.destroy()");
        }
    }

    abstract void d(byte param0);

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ti.field_cb = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("tf.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void a(boolean param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_10_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (h.field_J != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (mj.field_j != null &&
            mj.field_j != this) {
            stackIn_8_0 = mj.field_j.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("tf.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    abstract void d(int param0);

    public static void b(int param0) {
        try {
          field_d = null;
          field_f = null;
          if (param0 != 13695) {
            tf.b(46);
          }
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "tf.R(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("tf.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = ji.b(-61);
          var4 = qf.field_o[mc.field_i];
          qf.field_o[mc.field_i] = var2_long;
          if ((long)param0 != var4 &&
            var2_long <= var4) {
          }
          mc.field_i = mc.field_i + 1 & 31;
          var6 = this;
          synchronized (var6) {
            wg.field_o = ti.field_cb;
          }
          this.a((byte) 97);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dd.a((Throwable) ((Object) runtimeException), "tf.N(" + param0 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          be dupTemp$0 = null;
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          eb var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = OrbDefence.field_D ? 1 : 0;
          try {
            try {
              if (aj.field_b != null) {
                dh.field_Z = dh.field_Z + 1;
                if (3 <= dh.field_Z) {
                  this.a(100, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              ih.field_a = 0;
              bd.field_k = param3;
              md.field_j = param3;
              aj.field_b = this;
              if (param0 != -10291) {
                return;
              }
              lm.field_d = param1;
              em.field_r = 0;
              th.field_e = param4;
              ph.field_u = param4;
              cg.field_f = uj.b((byte) -120);
              dupTemp$0 = new be(param6, param5, param2, true);
              wc.field_c = dupTemp$0;
              df.field_e = dupTemp$0;
              var8 = wc.field_c.a(314572800, 1, (Runnable) (this));
              while (true) {
                if (var8.field_a == 0) {
                  hb.a(10L, param0 + 10411);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              pe.a((byte) -13, var8_ref, (String) null);
              this.a(124, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var8_ref2;
            stackIn_25_1 = new StringBuilder().append("tf.O(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw dd.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void stop() {
        if (this != aj.field_b ||
          te.field_G) {
          return;
        }
        try {
          jc.field_o = 4000L + ji.b(-51);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "tf.stop()");
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = ji.b(124);
          var4 = jl.field_b[ab.field_f];
          jl.field_b[ab.field_f] = var2_long;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            ud.field_f = (32000 + (var6_int >> 1)) / var6_int;
          }
          ab.field_f = 31 & 1 + ab.field_f;
          fieldTemp$1 = ol.field_j;
          ol.field_j = ol.field_j + 1;
          if (50 < fieldTemp$1) {
            hh.field_c = true;
            ol.field_j = ol.field_j - 50;
            field_f.setSize(bd.field_k, th.field_e);
            field_f.setVisible(true);
            boolean decompiledSharedTail0 = (null != h.field_J &&
              mh.field_b == null);
            if (!decompiledSharedTail0) {
              field_f.setLocation(em.field_r, ih.field_a);
              decompiledSharedTail0 = (OrbDefence.field_D);
            }
            if (decompiledSharedTail0) {
              var6 = h.field_J.getInsets();
              field_f.setLocation(em.field_r + var6.left, var6.top + ih.field_a);
            }
          }
          this.d((byte) -114);
          if (param0 >= -83) {
            field_l = -117L;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) runtimeException), "tf.T(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("tf.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public abstract void init();

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    protected tf() {
        this.field_h = false;
    }

    public final void start() {
        if (aj.field_b != this ||
          te.field_G) {
          return;
        }
        try {
          jc.field_o = 0L;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "tf.start()");
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
          if (this == aj.field_b &&
            !te.field_G) {
            hh.field_c = true;
            if (d.field_g &&
              ji.b(123) - dc.field_j > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < md.field_j) {
                  return;
                }
                if (ph.field_u > var2.height) {
                  return;
                }
              }
              vc.field_a = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("tf.paint(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = OrbDefence.field_D ? 1 : 0;
        try {
          if (null != field_f) {
            field_f.removeFocusListener((java.awt.event.FocusListener) (this));
            field_f.getParent().setBackground(java.awt.Color.black);
            field_f.getParent().remove((java.awt.Component) ((Object) field_f));
          }
          boolean decompiledFrameRemainder0 = true;
          if (mh.field_b != null) {
            var2 = mh.field_b;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null != h.field_J) {
              var2 = h.field_J;
              if (var4 != 0) {
                if (null != mj.field_j) {
                  var2 = mj.field_j;
                  var2 = aj.field_b;
                } else {
                  var2 = aj.field_b;
                }
              }
            } else {
              if (null != mj.field_j) {
                var2 = mj.field_j;
                if (var4 != 0) {
                  var2 = aj.field_b;
                }
              } else {
                var2 = aj.field_b;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          field_f = (java.awt.Canvas) ((Object) new al((java.awt.Component) (this)));
          if (param0 < 40) {
            field_c = -118;
          }
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) field_f));
          field_f.setSize(bd.field_k, th.field_e);
          field_f.setVisible(true);
          if (var2 == h.field_J) {
            var3 = h.field_J.getInsets();
            field_f.setLocation(em.field_r + var3.left, ih.field_a + var3.top);
            if (var4 != 0) {
              field_f.setLocation(em.field_r, ih.field_a);
            }
          } else {
            field_f.setLocation(em.field_r, ih.field_a);
          }
          field_f.addFocusListener((java.awt.event.FocusListener) (this));
          field_f.requestFocus();
          ti.field_cb = true;
          wg.field_o = true;
          hh.field_c = true;
          vc.field_a = false;
          dc.field_j = ji.b(107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dd.a((Throwable) (var2), "tf.Q(" + param0 + ')');
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != h.field_J) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != mj.field_j &&
            this != mj.field_j) {
            stackIn_12_0 = mj.field_j.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "tf.getDocumentBase()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          ti.field_cb = true;
          hh.field_c = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("tf.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_m = false;
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
