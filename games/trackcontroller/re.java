/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class re extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static uf field_f;
    static pj field_g;
    boolean field_e;
    static boolean field_k;
    static oh field_c;
    static String field_m;
    public static int field_j;
    public static int field_b;
    public static boolean field_l;
    public static boolean field_d;
    public static boolean field_i;
    public static boolean field_h;
    public static boolean field_a;

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ii.field_s != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != q.field_c &&
            q.field_c != this) {
            stackIn_10_0 = q.field_c.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "re.getAppletContext()");
        }
    }

    abstract void a(int param0);

    public abstract void init();

    final static qj[] a(byte param0, int param1) {
        qj[] var2 = null;
        RuntimeException var2_ref = null;
        qj[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new qj[9];
          var2[4] = ee.a(param1, 64, (byte) 117);
          if (param0 <= 115) {
            re.a((byte) -81, -92);
          }
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var2_ref), "re.MA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (f.field_c == this &&
            !jk.field_a) {
            v.field_a = qg.a(false);
            wl.a(5000L, false);
            field_f = null;
            this.a(-121, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) runtimeException), "re.destroy()");
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          q.field_c = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("re.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static String c(int param0) {
        RuntimeException var1 = null;
        String stackIn_2_0 = null;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        String stackIn_15_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (oe.field_b == fd.field_h) {
            stackIn_2_0 = fi.field_l;
            return stackIn_2_0;
          }
          if (param0 != 6) {
            re.g(-74);
          }
          if (!sa.field_Q.b((byte) 114)) {
            stackIn_8_0 = sa.field_Q.a((byte) 63);
            return stackIn_8_0;
          }
          if (oe.field_b == rk.field_X) {
            stackIn_13_0 = sa.field_Q.a((byte) 63);
            return stackIn_13_0;
          }
          stackIn_15_0 = qg.field_c;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "re.HA(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vj.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("re.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TrackController.field_F ? 1 : 0;
        try {
          if (ki.field_f != null) {
            ki.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
            ki.field_f.getParent().setBackground(java.awt.Color.black);
            ki.field_f.getParent().remove((java.awt.Component) ((Object) ki.field_f));
          }
          boolean decompiledFrameRemainder0 = true;
          if (sf.field_H != null) {
            var2 = sf.field_H;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null == ii.field_s) {
              if (q.field_c == null) {
                var2 = f.field_c;
                if (var4 != 0) {
                  var2 = q.field_c;
                  var2 = ii.field_s;
                }
              } else {
                var2 = q.field_c;
                if (var4 != 0) {
                  var2 = ii.field_s;
                }
              }
            } else {
              var2 = ii.field_s;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ki.field_f = (java.awt.Canvas) ((Object) new te((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ki.field_f));
          ki.field_f.setSize(og.field_pb, wf.field_b);
          ki.field_f.setVisible(true);
          if (param0 >= -54) {
            return;
          }
          boolean decompiledSharedTail0 = (var2 == ii.field_s);
          if (!decompiledSharedTail0) {
            ki.field_f.setLocation(gb.field_i, ri.field_P);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = ii.field_s.getInsets();
            ki.field_f.setLocation(var3.left + gb.field_i, ri.field_P + var3.top);
          }
          ki.field_f.addFocusListener((java.awt.event.FocusListener) (this));
          ki.field_f.requestFocus();
          lb.field_M = true;
          vj.field_b = true;
          vh.field_q = true;
          mj.field_c = false;
          rj.field_c = qg.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw sl.a((Throwable) (var2), "re.LA(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("re.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("re.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final void a(String param0, byte param1) {
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
              sj.a((byte) -7, "loggedout", gd.b((byte) 77));
              if (param1 != 100) {
                this.getAppletContext();
              }
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
            stackIn_14_1 = new StringBuilder().append("re.PA(");
            if (param0 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          if (f.field_c == this &&
            !jk.field_a) {
            vh.field_q = true;
            if (rh.field_F &&
              -rj.field_c + qg.a(false) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (kb.field_b > var2.width) {
                  return;
                }
                if (var2.height < mf.field_g) {
                  return;
                }
              }
              mj.field_c = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("re.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final boolean a(byte param0) {
        return true;
    }

    final static int g(int param0) {
        RuntimeException var1 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 48) {
            field_c = (oh) null;
          }
          stackIn_4_0 = -bk.field_D + cd.field_b;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "re.SA(" + param0 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == f.field_c &&
            !jk.field_a) {
            v.field_a = 4000L + qg.a(false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) runtimeException), "re.stop()");
        }
    }

    abstract void h(int param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (f.field_c == this &&
            !jk.field_a) {
            v.field_a = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) runtimeException), "re.start()");
        }
    }

    protected re() {
        this.field_e = false;
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          vj.field_b = true;
          vh.field_q = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("re.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_64_0 = false;
          int stackIn_80_0 = 0;
          int stackIn_80_1 = 0;
          int stackIn_97_0 = 0;
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
          var5 = TrackController.field_F ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != uf.field_e) {
                var1 = uf.field_e.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = uf.field_g;
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
                    this.a("wrongjava", (byte) 100);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_64_0 = hd.a(-123, var2.charAt(var3));
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_64_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ej.a(false, (CharSequence) ((Object) var4)) &&
                        !(uk.a((CharSequence) ((Object) var4), 10) >= 10)) {
                        this.a("wrongjava", (byte) 100);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != uf.field_g))) {
                stackIn_64_0 = uf.field_g.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_64_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (uf.field_g.length() > var1_int) {
                    var3 = uf.field_g.charAt(var1_int);
                    stackIn_80_0 = -49;
                    stackIn_80_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_80_0 >= stackIn_80_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = var2_int * 10 - 48 + var3;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_80_0 = ~var2_int;
                    stackIn_80_1 = -6;
                  }
                  if (stackIn_80_0 > stackIn_80_1) {
                    break;
                  }
                  rh.field_F = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = f.field_c;
                if (q.field_c != null) {
                  var1 = q.field_c;
                }
                var2_ref = uf.field_m;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                tc.c((byte) 46);
                this.f(-121);
                ia.field_b = tf.a(og.field_pb, true, wf.field_b, (java.awt.Component) ((Object) ki.field_f));
                this.c((byte) 122);
                wl.field_i = qk.j(-17514);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != v.field_a) {
                    stackIn_97_0 = $cfr$lcmp(v.field_a, qg.a(false));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_97_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    v.field_f = wl.field_i.a((byte) 120, ba.field_f);
                    stackIn_97_0 = 0;
                  }
                  var3 = stackIn_97_0;
                  do {
                    if (!(v.field_f > var3)) {
                      this.b(57);
                      f.a(ki.field_f, (byte) -127, rg.field_c);
                      break;
                    }
                    this.d(8865);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              hb.a((Throwable) (var1), 0, (String) null);
              this.a("crash", (byte) 100);
            }
            this.a(-122, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw sl.a((Throwable) (var1), "re.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final static void a(byte param0, String param1) {
        if (param0 != 53) {
          re.a((byte) 113, (String) null);
        }
        System.out.println("Error: " + bb.a(param1, (byte) -82, "\n", "%0a"));
    }

    abstract void e(int param0);

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -70) {
            field_k = true;
          }
          field_c = null;
          field_g = null;
          field_m = null;
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "re.QA(" + param0 + ')');
        }
    }

    abstract void c(byte param0);

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = qg.a(false);
          var4 = ai.field_g[ge.field_G];
          ai.field_g[ge.field_G] = var2_long;
          if (param0 != 8865) {
            this.focusLost((java.awt.event.FocusEvent) null);
          }
          ge.field_G = 1 + ge.field_G & 31;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          var6 = this;
          synchronized (var6) {
            lb.field_M = vj.field_b;
          }
          this.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw sl.a((Throwable) ((Object) runtimeException), "re.RA(" + param0 + ')');
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
          if (null != ii.field_s) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (q.field_c != null &&
            this != q.field_c) {
            stackIn_12_0 = q.field_c.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("re.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw sl.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ii.field_s != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (q.field_c != null &&
            this != q.field_c) {
            stackIn_10_0 = q.field_c.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) var1), "re.getDocumentBase()");
        }
    }

    final void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        try {
          uf dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          ce var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = TrackController.field_F ? 1 : 0;
          try {
            try {
              if (null != f.field_c) {
                cd.field_g = cd.field_g + 1;
                if (3 > cd.field_g) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", (byte) 100);
                return;
              }
              if (param6 != 10) {
                this.run();
              }
              f.field_c = this;
              og.field_pb = param4;
              kb.field_b = param4;
              lj.field_a = param2;
              ri.field_P = 0;
              gb.field_i = 0;
              wf.field_b = param5;
              mf.field_g = param5;
              qf.field_b = gd.b((byte) 77);
              dupTemp$0 = new uf(param0, param3, param1, true);
              rg.field_c = dupTemp$0;
              field_f = dupTemp$0;
              var8 = rg.field_c.a(1, (Runnable) (this), 64);
              while (true) {
                if (var8.field_f == 0) {
                  wl.a(10L, false);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              hb.a(var8_ref, 0, (String) null);
              this.a("crash", (byte) 100);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("re.KA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw sl.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != ii.field_s) {
          return null;
        }
        if (q.field_c != null &&
          this != q.field_c) {
          return q.field_c.getCodeBase();
        }
        return super.getCodeBase();
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
          var2_long = qg.a(false);
          var4 = bc.field_a[ai.field_f];
          bc.field_a[ai.field_f] = var2_long;
          if (param0 != 57) {
            field_g = (pj) null;
          }
          ai.field_f = ai.field_f + 1 & 31;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            dh.field_p = (32000 + (var6_int >> 1)) / var6_int;
          }
          fieldTemp$1 = gf.field_g;
          gf.field_g = gf.field_g + 1;
          if (50 < fieldTemp$1) {
            vh.field_q = true;
            gf.field_g = gf.field_g - 50;
            ki.field_f.setSize(og.field_pb, wf.field_b);
            ki.field_f.setVisible(true);
            if (null != ii.field_s &&
              sf.field_H == null) {
              var6 = ii.field_s.getInsets();
              ki.field_f.setLocation(gb.field_i + var6.left, ri.field_P + var6.top);
              if (TrackController.field_F) {
                ki.field_f.setLocation(gb.field_i, ri.field_P);
              }
            } else {
              ki.field_f.setLocation(gb.field_i, ri.field_P);
            }
          }
          this.a(160);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw sl.a((Throwable) ((Object) runtimeException), "re.IA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (jk.field_a) {
              return;
            }
            jk.field_a = true;
          }
          if (param0 >= -113) {
            this.run();
          }
          if (null != q.field_c) {
            q.field_c.destroy();
          }
          try {
            this.h(-24452);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (ki.field_f != null) {
            try {
              ki.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
              ki.field_f.getParent().remove((java.awt.Component) ((Object) ki.field_f));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (rg.field_c != null) {
            try {
              rg.field_c.a((byte) -126);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.e(105);
          if (null != ii.field_s) {
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
          throw sl.a((Throwable) ((Object) runtimeException), "re.JA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    static {
        field_k = false;
        field_m = "Email: ";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
