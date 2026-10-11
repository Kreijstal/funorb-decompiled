/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class kg extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static long field_d;
    boolean field_i;
    static cn field_a;
    static nh field_b;
    static String[] field_e;
    static int field_f;
    static String field_m;
    static String field_k;
    public static boolean field_j;
    public static boolean field_g;
    public static int field_h;
    public static int field_n;
    public static boolean field_c;
    public static boolean field_o;
    public static int field_l;

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
          stackIn_5_1 = new StringBuilder().append("kg.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final boolean b(int param0) {
        return true;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void c(boolean param0);

    abstract void b(boolean param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (ad.field_d != null) {
          return null;
        }
        if (rc.field_b != null &&
          rc.field_b != this) {
          return rc.field_b.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ba.field_c == this &&
            !cc.field_c) {
            nj.field_e = 4000L + kd.c(-2456);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "kg.stop()");
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
          stackIn_5_1 = new StringBuilder().append("kg.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public abstract void init();

    public final void destroy() {
        if (ba.field_c != this ||
          cc.field_c) {
          return;
        }
        try {
          nj.field_e = kd.c(-2456);
          pj.a(0, 5000L);
          kf.field_o = null;
          this.a((byte) 116, false);
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "kg.destroy()");
        }
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_81_0 = 0;
          int stackIn_81_1 = 0;
          int stackIn_100_0 = 0;
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
          var5 = DungeonAssault.field_K;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (qg.field_c != null) {
                var1 = qg.field_c.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = qg.field_p;
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
                    this.a((byte) -112, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = qm.a(57, var2.charAt(var3));
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
                      if (sj.a((CharSequence) ((Object) var4), 10) &&
                        !(ri.a((byte) 96, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a((byte) -112, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (qg.field_p != null))) {
                stackIn_66_0 = qg.field_p.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < qg.field_p.length()) {
                    var3 = qg.field_p.charAt(var1_int);
                    stackIn_81_0 = 48;
                    stackIn_81_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 <= stackIn_81_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = var2_int * 10 + (var3 - 48);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = -6;
                    stackIn_81_1 = ~var2_int;
                  }
                  if (stackIn_81_0 < stackIn_81_1) {
                    break;
                  }
                  ia.field_O = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ba.field_c;
                if (null != rc.field_b) {
                  var1 = rc.field_b;
                }
                var2_ref = qg.field_g;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                eg.b(116);
                this.d((byte) 114);
                k.field_h = bn.a(-1, (java.awt.Component) ((Object) c.field_h), up.field_d, eg.field_d);
                this.a((byte) -80);
                o.field_o = fd.b((byte) 108);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (nj.field_e != 0L) {
                    stackIn_100_0 = $cfr$lcmp(nj.field_e, kd.c(-2456));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    nk.field_Kb = o.field_o.a(hk.field_e, -108);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(var3 < nk.field_Kb)) {
                      this.c((byte) -68);
                      ho.a(i.field_A, c.field_h, (byte) -32);
                      break;
                    }
                    this.c(-1);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              sm.a((Throwable) (var1), 1, (String) null);
              this.a((byte) -112, "crash");
            }
            this.a((byte) 116, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw vk.a((Throwable) (var1), "kg.run()");
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
          rc.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kg.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
            if (this.field_i) {
              return;
            }
            this.field_i = true;
            System.out.println("error_game_" + param1);
            try {
              ee.a((byte) -21, m.c(true), "loggedout");
              if (param0 != -112) {
                this.c(116);
              }
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
            stackIn_15_1 = new StringBuilder().append("kg.N(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          rn.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kg.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ad.field_d) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (rc.field_b != null &&
            rc.field_b != this) {
            stackIn_12_0 = rc.field_b.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kg.getAppletContext()");
        }
    }

    final synchronized void d(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DungeonAssault.field_K;
        try {
          if (c.field_h != null) {
            c.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
            c.field_h.getParent().setBackground(java.awt.Color.black);
            c.field_h.getParent().remove((java.awt.Component) ((Object) c.field_h));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != hh.field_k) {
            var2 = hh.field_k;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (ad.field_d != null) {
              var2 = ad.field_d;
              if (var4 != 0) {
                if (rc.field_b != null) {
                  var2 = rc.field_b;
                  var2 = ba.field_c;
                } else {
                  var2 = ba.field_c;
                }
              }
            } else {
              if (rc.field_b != null) {
                var2 = rc.field_b;
                if (var4 != 0) {
                  var2 = ba.field_c;
                }
              } else {
                var2 = ba.field_c;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          c.field_h = (java.awt.Canvas) ((Object) new ql((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) c.field_h));
          c.field_h.setSize(up.field_d, eg.field_d);
          c.field_h.setVisible(true);
          if (ad.field_d == var2) {
            var3 = ad.field_d.getInsets();
            c.field_h.setLocation(aj.field_Gb + var3.left, rb.field_L + var3.top);
            if (var4 != 0) {
              c.field_h.setLocation(aj.field_Gb, rb.field_L);
            }
          } else {
            c.field_h.setLocation(aj.field_Gb, rb.field_L);
          }
          c.field_h.addFocusListener((java.awt.event.FocusListener) (this));
          c.field_h.requestFocus();
          rj.field_o = true;
          rn.field_b = true;
          im.field_d = true;
          ve.field_a = false;
          if (param0 < 111) {
            return;
          }
          pj.field_z = kd.c(-2456);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw vk.a((Throwable) (var2), "kg.K(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == ba.field_c &&
            !cc.field_c) {
            nj.field_e = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "kg.start()");
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (ba.field_c == this &&
            !cc.field_c) {
            im.field_d = true;
            if (ia.field_O &&
              -pj.field_z + kd.c(-2456) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < sf.field_h) {
                  return;
                }
                if (var2.height < sl.field_d) {
                  return;
                }
              }
              ve.field_a = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_21_0 = var2_ref;
          stackIn_21_1 = new StringBuilder().append("kg.paint(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
        }
    }

    private final void c(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          if (param0 != -1) {
            this.b((byte) -82);
          }
          var2_long = kd.c(param0 - 2455);
          var4 = jf.field_g[jl.field_d];
          jf.field_g[jl.field_d] = var2_long;
          if (var4 != 0L &&
            var4 >= var2_long) {
          }
          jl.field_d = 1 + jl.field_d & 31;
          var6 = this;
          synchronized (var6) {
            rj.field_o = rn.field_b;
          }
          this.a(-100);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var2), "kg.J(" + param0 + ')');
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
          rn.field_b = true;
          im.field_d = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kg.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
          if (null != ad.field_d) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != rc.field_b &&
            rc.field_b != this) {
            stackIn_8_0 = rc.field_b.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("kg.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          var2_long = kd.c(-2456);
          var4 = id.field_b[np.field_K];
          if (param0 != -68) {
            this.field_i = false;
          }
          id.field_b[np.field_K] = var2_long;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            bc.field_a = (32000 + (var6_int >> 1)) / var6_int;
          }
          np.field_K = 31 & np.field_K + 1;
          fieldTemp$1 = sb.field_b;
          sb.field_b = sb.field_b + 1;
          if (fieldTemp$1 > 50) {
            im.field_d = true;
            sb.field_b = sb.field_b - 50;
            c.field_h.setSize(up.field_d, eg.field_d);
            c.field_h.setVisible(true);
            if (null != ad.field_d &&
              null == hh.field_k) {
              var6 = ad.field_d.getInsets();
              c.field_h.setLocation(var6.left + aj.field_Gb, rb.field_L + var6.top);
              if (DungeonAssault.field_K != 0) {
                c.field_h.setLocation(aj.field_Gb, rb.field_L);
              }
            } else {
              c.field_h.setLocation(aj.field_Gb, rb.field_L);
            }
          }
          this.b((byte) 38);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) runtimeException), "kg.L(" + param0 + ')');
        }
    }

    protected kg() {
        this.field_i = false;
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (cc.field_c) {
              return;
            }
            cc.field_c = true;
          }
          if (null != rc.field_b) {
            rc.field_b.destroy();
          }
          try {
            this.c(true);
            if (param0 != 116) {
              field_d = 31L;
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (c.field_h != null) {
            try {
              c.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
              c.field_h.getParent().remove((java.awt.Component) ((Object) c.field_h));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (i.field_A != null) {
            try {
              i.field_A.a((byte) -119);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.b(false);
          if (ad.field_d != null) {
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
          throw vk.a((Throwable) ((Object) runtimeException), "kg.I(" + param0 + ',' + param1 + ')');
        }
    }

    public static void a(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_a = null;
          field_e = null;
          field_b = null;
          field_k = null;
          if (param0) {
            kg.provideLoaderApplet((java.applet.Applet) null);
          }
          field_m = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kg.O(" + param0 + ')');
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ad.field_d) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != rc.field_b &&
            rc.field_b != this) {
            stackIn_10_0 = rc.field_b.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw vk.a((Throwable) ((Object) var1), "kg.getDocumentBase()");
        }
    }

    final void a(int param0, byte param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          qg dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          pn var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = DungeonAssault.field_K;
          try {
            try {
              if (null != ba.field_c) {
                ql.field_b = ql.field_b + 1;
                if (ql.field_b >= 3) {
                  this.a((byte) -112, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              eg.field_d = param3;
              sl.field_d = param3;
              rb.field_L = 0;
              up.field_d = param4;
              sf.field_h = param4;
              wj.field_s = param6;
              ba.field_c = this;
              aj.field_Gb = 0;
              ci.field_q = m.c(true);
              dupTemp$0 = new qg(param0, param2, param5, true);
              i.field_A = dupTemp$0;
              kf.field_o = dupTemp$0;
              var8 = i.field_A.a(-21432, 1, (Runnable) (this));
              do {
                if (var8.field_c != 0) {
                  if (param1 < 83) {
                    this.field_i = false;
                  }
                  break;
                }
                pj.a(0, 10L);
              } while (var9 == 0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              sm.a(var8_ref, 1, (String) null);
              this.a((byte) -112, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("kg.M(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw vk.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_e = new String[]{"Dragons of Renown", "<%highlight>You've reached the end of the Just Play tutorial. To continue, and battle in the realm of Dungaria, please log in or create an account.<br><br><%command>Exit this page and return to the main menu."};
        field_k = "Order your raider to disarm the guardian. <br><br>If the raider is detected by the guardian, nearby monsters will be alerted.<br><br>Requires: <col=21634A>Dodge</col>, <col=00A7D2>Sneak</col>";
        field_m = "Dead";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
