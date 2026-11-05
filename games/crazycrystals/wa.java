/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class wa extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_b;
    static String field_k;
    static String field_f;
    static String field_j;
    public static int field_e;
    public static int field_d;
    public static boolean field_g;
    public static int field_c;
    public static int field_a;
    public static boolean field_h;
    public static boolean field_i;

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gl.field_h == this &&
            !kf.field_g) {
            tc.field_j = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) runtimeException), "wa.start()");
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
          var5 = CrazyCrystals.field_B;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (un.field_e != null) {
                var1 = un.field_e.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = un.field_m;
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
                    this.a(0, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_66_0 = ag.a(var2.charAt(var3), 48);
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
                      if (cd.a((CharSequence) ((Object) var4), (byte) -123) &&
                        !(ti.a(100, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a(0, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != un.field_m))) {
                stackIn_66_0 = un.field_m.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (un.field_m.length() > var1_int) {
                    var3 = un.field_m.charAt(var1_int);
                    stackIn_81_0 = 48;
                    stackIn_81_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 <= stackIn_81_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var2_int = 10 * var2_int - 48 + var3;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = var2_int;
                    stackIn_81_1 = 5;
                  }
                  if (stackIn_81_0 < stackIn_81_1) {
                    break;
                  }
                  jd.field_H = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = gl.field_h;
                if (null != tk.field_i) {
                  var1 = tk.field_i;
                }
                var2_ref = un.field_l;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                lc.b(24536);
                this.b(-42);
                dk.field_o = oj.a(ap.field_r, 6641, (java.awt.Component) ((Object) jd.field_D), rh.field_f);
                this.a((byte) -82);
                jm.field_h = sn.a(27801);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != tc.field_j) {
                    stackIn_100_0 = $cfr$lcmp(tc.field_j, lo.a((byte) -120));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    hf.field_a = jm.field_h.b(s.field_k, -1);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(var3 < hf.field_a)) {
                      this.b((byte) 122);
                      so.a(jd.field_D, te.field_a, true);
                      break;
                    }
                    this.d(2648);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              wp.a((Throwable) (var1), (String) null, 21862);
              this.a(0, "crash");
            }
            this.a(false, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw dn.a((Throwable) (var1), "wa.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
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
          if (uc.field_d != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != tk.field_i &&
            tk.field_i != this) {
            stackIn_8_0 = tk.field_i.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wa.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    private final void d(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = lo.a((byte) 88);
          if (param0 != 2648) {
            field_k = (String) null;
          }
          var4 = v.field_a[ak.field_m];
          v.field_a[ak.field_m] = var2_long;
          ak.field_m = 31 & ak.field_m + 1;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          var6 = this;
          synchronized (var6) {
            mb.field_d = sl.field_t;
          }
          this.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw dn.a((Throwable) ((Object) runtimeException), "wa.B(" + param0 + ')');
        }
    }

    private final void b(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        try {
          var2_long = lo.a((byte) 125);
          var4 = mc.field_p[ne.field_c];
          mc.field_p[ne.field_c] = var2_long;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            p.field_j = (32000 + (var6_int >> 1)) / var6_int;
          }
          ne.field_c = ne.field_c + 1 & 31;
          fieldTemp$1 = wf.field_h;
          wf.field_h = wf.field_h + 1;
          if (fieldTemp$1 > 50) {
            al.field_f = true;
            wf.field_h = wf.field_h - 50;
            jd.field_D.setSize(ap.field_r, rh.field_f);
            jd.field_D.setVisible(true);
            if (uc.field_d != null &&
              null == vk.field_F) {
              var6 = uc.field_d.getInsets();
              jd.field_D.setLocation(ui.field_a + var6.left, wm.field_e + var6.top);
              if (CrazyCrystals.field_B != 0) {
                jd.field_D.setLocation(ui.field_a, wm.field_e);
              }
            } else {
              jd.field_D.setLocation(ui.field_a, wm.field_e);
            }
          }
          if (param0 != 122) {
            field_f = (String) null;
          }
          this.a(-123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) runtimeException), "wa.E(" + param0 + ')');
        }
    }

    abstract void a(byte param0);

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_14_0 = null;
          StringBuilder stackIn_14_1 = null;
          String stackIn_15_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_b) {
              return;
            }
            this.field_b = true;
            System.out.println("error_game_" + param1);
            try {
              hi.a(le.b((byte) -20), "loggedout", 28);
              if (param0 != 0) {
                this.field_b = false;
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
            stackIn_14_0 = var3_ref2;
            stackIn_14_1 = new StringBuilder().append("wa.G(").append(param0).append(',');
            if (param1 == null) {
              stackIn_15_2 = "null";
            } else {
              stackIn_15_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void c(int param0);

    abstract void c(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

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
            if (param0) {
              return;
            }
            if (kf.field_g) {
              return;
            }
            kf.field_g = true;
          }
          if (tk.field_i != null) {
            tk.field_i.destroy();
          }
          try {
            this.c(241);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != jd.field_D) {
            try {
              jd.field_D.removeFocusListener((java.awt.event.FocusListener) (this));
              jd.field_D.getParent().remove((java.awt.Component) ((Object) jd.field_D));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (te.field_a != null) {
            try {
              te.field_a.a(113);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c((byte) 89);
          if (uc.field_d != null) {
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
          throw dn.a((Throwable) ((Object) runtimeException), "wa.K(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final boolean f(int param0) {
        return true;
    }

    final synchronized void b(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = CrazyCrystals.field_B;
        try {
          if (null != jd.field_D) {
            jd.field_D.removeFocusListener((java.awt.event.FocusListener) (this));
            jd.field_D.getParent().setBackground(java.awt.Color.black);
            jd.field_D.getParent().remove((java.awt.Component) ((Object) jd.field_D));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != vk.field_F) {
            var2 = vk.field_F;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null == uc.field_d) {
              if (null == tk.field_i) {
                var2 = gl.field_h;
                if (var4 != 0) {
                  var2 = tk.field_i;
                  var2 = uc.field_d;
                }
              } else {
                var2 = tk.field_i;
                if (var4 != 0) {
                  var2 = uc.field_d;
                }
              }
            } else {
              var2 = uc.field_d;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          jd.field_D = (java.awt.Canvas) ((Object) new pg((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) jd.field_D));
          jd.field_D.setSize(ap.field_r, rh.field_f);
          if (param0 >= -38) {
            return;
          }
          jd.field_D.setVisible(true);
          if (var2 == uc.field_d) {
            var3 = uc.field_d.getInsets();
            jd.field_D.setLocation(var3.left + ui.field_a, wm.field_e + var3.top);
            if (var4 != 0) {
              jd.field_D.setLocation(ui.field_a, wm.field_e);
            }
          } else {
            jd.field_D.setLocation(ui.field_a, wm.field_e);
          }
          jd.field_D.addFocusListener((java.awt.event.FocusListener) (this));
          jd.field_D.requestFocus();
          mb.field_d = true;
          sl.field_t = true;
          al.field_f = true;
          em.field_f = false;
          bd.field_m = lo.a((byte) 95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw dn.a((Throwable) (var2), "wa.D(" + param0 + ')');
        }
    }

    public final void destroy() {
        if (this != gl.field_h ||
          kf.field_g) {
          return;
        }
        try {
          tc.field_j = lo.a((byte) 119);
          fh.a(true, 5000L);
          rd.field_g = null;
          this.a(false, false);
        } catch (RuntimeException runtimeException) {
          throw dn.a((Throwable) ((Object) runtimeException), "wa.destroy()");
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (this == gl.field_h &&
            !kf.field_g) {
            al.field_f = true;
            if (jd.field_H &&
              -bd.field_m + lo.a((byte) -23) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (jm.field_c > var2.width) {
                  return;
                }
                if (var2.height < wk.field_b) {
                  return;
                }
              }
              em.field_f = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("wa.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
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
          sl.field_t = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wa.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == gl.field_h &&
            !kf.field_g) {
            tc.field_j = lo.a((byte) -9) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) runtimeException), "wa.stop()");
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
          stackIn_5_1 = new StringBuilder().append("wa.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(byte param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        try {
          un dupTemp$0 = null;
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          gb var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = CrazyCrystals.field_B;
          try {
            try {
              if (gl.field_h != null) {
                nj.field_e = nj.field_e + 1;
                if (3 <= nj.field_e) {
                  this.a(0, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              me.field_e = param4;
              wm.field_e = 0;
              ui.field_a = 0;
              gl.field_h = this;
              if (param0 != 118) {
                return;
              }
              rh.field_f = param5;
              wk.field_b = param5;
              ap.field_r = param6;
              jm.field_c = param6;
              pj.field_w = le.b((byte) -20);
              dupTemp$0 = new un(param1, param3, param2, true);
              te.field_a = dupTemp$0;
              rd.field_g = dupTemp$0;
              var8 = te.field_a.a((Runnable) (this), 2, 1);
              while (true) {
                if (0 == var8.field_a) {
                  fh.a(true, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              wp.a(var8_ref, (String) null, 21862);
              this.a(0, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var8_ref2;
            stackIn_25_1 = new StringBuilder().append("wa.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw dn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    protected wa() {
        this.field_b = false;
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

    public static void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_k = null;
          field_j = null;
          if (param0 != 5) {
            field_k = (String) null;
          }
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "wa.C(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (uc.field_d != null) {
          return null;
        }
        if (null != tk.field_i &&
          tk.field_i != this) {
          return tk.field_i.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          tk.field_i = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wa.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sl.field_t = true;
          al.field_f = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("wa.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("wa.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != uc.field_d) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (tk.field_i != null &&
            tk.field_i != this) {
            stackIn_12_0 = tk.field_i.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "wa.getAppletContext()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uc.field_d != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (tk.field_i != null &&
            tk.field_i != this) {
            stackIn_12_0 = tk.field_i.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) ((Object) var1), "wa.getDocumentBase()");
        }
    }

    static {
        field_k = "Cancel";
        field_j = "This hole has been filled.<br>You may pass.";
        field_f = "Think before you leap. Which wall are these balls following?";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
