/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class se extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_g;
    static java.awt.Canvas field_h;
    static String field_c;
    static int[] field_d;
    boolean field_i;
    public static boolean field_f;
    public static int field_a;
    public static int field_b;
    public static boolean field_e;
    public static int field_l;
    public static int field_k;
    public static int field_j;

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == te.field_E &&
            !kj.field_c) {
            nf.field_n = hn.a((byte) 80);
            vj.a(5000L, (byte) -49);
            lj.field_t = null;
            this.a(0, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) runtimeException), "se.destroy()");
        }
    }

    final synchronized void b(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (field_h != null) {
            field_h.removeFocusListener((java.awt.event.FocusListener) (this));
            field_h.getParent().setBackground(java.awt.Color.black);
            field_h.getParent().remove((java.awt.Component) ((Object) field_h));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == db.field_r) {
            if (md.field_n != null) {
              var2 = md.field_n;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (p.field_a == null) {
                var2 = te.field_E;
                if (var4 != 0) {
                  var2 = p.field_a;
                  var2 = db.field_r;
                }
              } else {
                var2 = p.field_a;
                if (var4 != 0) {
                  var2 = db.field_r;
                }
              }
            }
          } else {
            var2 = db.field_r;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          field_h = (java.awt.Canvas) ((Object) new vc((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) field_h));
          field_h.setSize(hf.field_h, qc.field_s);
          field_h.setVisible(true);
          boolean decompiledSharedTail0 = (md.field_n == var2);
          if (!decompiledSharedTail0) {
            field_h.setLocation(sg.field_a, bb.field_d);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = md.field_n.getInsets();
            field_h.setLocation(var3.left + sg.field_a, bb.field_d + var3.top);
          }
          field_h.addFocusListener((java.awt.event.FocusListener) (this));
          field_h.requestFocus();
          nm.field_a = true;
          i.field_i = true;
          pc.field_a = true;
          ih.field_s = false;
          uc.field_c = hn.a((byte) 80);
          if (param0 >= -35) {
            field_h = (java.awt.Canvas) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) (var2), "se.HB(" + param0 + ')');
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
          i.field_i = true;
          pc.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("se.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public abstract void init();

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == te.field_E &&
            !kj.field_c) {
            nf.field_n = hn.a((byte) 80) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) runtimeException), "se.stop()");
        }
    }

    private final void f(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        try {
          if (param0 > -8) {
            field_c = (String) null;
          }
          var2_long = hn.a((byte) 80);
          var4 = bm.field_d[fj.field_Lb];
          bm.field_d[fj.field_Lb] = var2_long;
          fj.field_Lb = 1 + fj.field_Lb & 31;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            df.field_c = (32000 + (var6_int >> 1)) / var6_int;
          }
          fieldTemp$1 = ch.field_e;
          ch.field_e = ch.field_e + 1;
          if (fieldTemp$1 > 50) {
            ch.field_e = ch.field_e - 50;
            pc.field_a = true;
            field_h.setSize(hf.field_h, qc.field_s);
            field_h.setVisible(true);
            boolean decompiledSharedTail0 = (md.field_n != null &&
              db.field_r == null);
            if (!decompiledSharedTail0) {
              field_h.setLocation(sg.field_a, bb.field_d);
              decompiledSharedTail0 = (HostileSpawn.field_I);
            }
            if (decompiledSharedTail0) {
              var6 = md.field_n.getInsets();
              field_h.setLocation(sg.field_a + var6.left, bb.field_d + var6.top);
            }
          }
          this.a((byte) -48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var2), "se.GB(" + param0 + ')');
        }
    }

    final static void b(boolean param0) {
        Throwable decompiledCaughtException = null;
        Object var1 = null;
        RuntimeException var1_ref = null;
        try {
          var1 = jc.field_b;
          synchronized (var1) {
            sg.field_o = sg.field_o + 1;
            ig.field_L = mk.field_I;
            j.field_c = lc.field_d;
            rb.field_m = cm.field_b;
            um.field_d = rg.field_e;
            rg.field_e = param0;
            pf.field_o = dc.field_d;
            ec.field_a = rf.field_o;
            rc.field_b = pa.field_l;
            dc.field_d = 0;
            el.field_m = cg.field_d;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1_ref), "se.FB(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("se.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          if (null != md.field_n) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (p.field_a != null &&
            this != p.field_a) {
            stackIn_12_0 = p.field_a.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("se.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, String param5, int param6) {
        try {
          fd dupTemp$0 = null;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          kk var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = HostileSpawn.field_I ? 1 : 0;
          try {
            try {
              if (te.field_E != null) {
                pb.field_Hb = pb.field_Hb + 1;
                if (pb.field_Hb < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(3904, "alreadyloaded");
                return;
              }
              qc.field_s = param0;
              he.field_x = param0;
              ql.field_a = param6;
              sg.field_a = 0;
              te.field_E = this;
              hf.field_h = param1;
              gm.field_m = param1;
              bb.field_d = 0;
              HostileSpawn.field_B = bn.c(-1);
              dupTemp$0 = new fd(param2, param5, param4, true);
              gf.field_b = dupTemp$0;
              lj.field_t = dupTemp$0;
              var8 = gf.field_b.a(1, (Runnable) (this), -99);
              if (param3 <= 119) {
                field_d = (int[]) null;
              }
              while (true) {
                if (var8.field_f == 0) {
                  vj.a(10L, (byte) -49);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              ic.a((byte) -118, (String) null, var8_ref);
              this.a(3904, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var8_ref2;
            stackIn_23_1 = new StringBuilder().append("se.IB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

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
          stackIn_5_1 = new StringBuilder().append("se.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (kj.field_c) {
              return;
            }
            kj.field_c = true;
          }
          if (p.field_a != null) {
            p.field_a.destroy();
          }
          try {
            this.e(21085);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (param0 != 0) {
            this.windowClosed((java.awt.event.WindowEvent) null);
          }
          if (null != field_h) {
            try {
              field_h.removeFocusListener((java.awt.event.FocusListener) (this));
              field_h.getParent().remove((java.awt.Component) ((Object) field_h));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (gf.field_b != null) {
            try {
              gf.field_b.a((byte) 114);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c(28);
          if (md.field_n != null) {
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
          throw wg.a((Throwable) ((Object) runtimeException), "se.EB(" + param0 + ',' + param1 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          i.field_i = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("se.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          p.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("se.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void e(int param0);

    public final void start() {
        if (this != te.field_E ||
          kj.field_c) {
          return;
        }
        try {
          nf.field_n = 0L;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "se.start()");
        }
    }

    final static void a(vm param0, int param1, vm param2, vh param3, int param4, int param5, vh param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15, vh param16, int param17, int param18, int param19, int param20) {
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          cn.a(126, param0, param12, param2);
          ub.a(param9, param17, param10, param13, (byte) -127);
          wc.a(param14, param19, -1);
          re.a(param15 - 3996, param6, param7, param1, param11, param3);
          kb.a(param20, 126, param5, param16);
          tm.a(param8, param18, param4, true);
          if (param15 != 4000) {
            field_c = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_6_0 = var21;
          stackIn_6_1 = new StringBuilder().append("se.AB(");
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
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',').append(param11).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',').append(param15).append(',');
          if (param16 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param17).append(',').append(param18).append(',').append(param19).append(',').append(param20).append(')').toString());
        }
    }

    abstract void c(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != md.field_n) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (p.field_a != null &&
            this != p.field_a) {
            stackIn_8_0 = p.field_a.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "se.getDocumentBase()");
        }
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = hn.a((byte) 80);
          var4 = el.field_e[oa.field_f];
          el.field_e[oa.field_f] = var2_long;
          if (0L != var4 &&
            var4 >= var2_long) {
          }
          oa.field_f = 31 & 1 + oa.field_f;
          var6 = this;
          synchronized (var6) {
            nm.field_a = i.field_i;
          }
          if (!param0) {
            field_c = (String) null;
          }
          this.b((byte) -35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wg.a((Throwable) ((Object) runtimeException), "se.BB(" + param0 + ')');
        }
    }

    abstract void a(int param0);

    abstract void b(byte param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (md.field_n != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (p.field_a != null &&
            this != p.field_a) {
            stackIn_12_0 = p.field_a.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "se.getAppletContext()");
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
          var5 = HostileSpawn.field_I ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (fd.field_u != null) {
                var1 = fd.field_u.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = fd.field_h;
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
                    this.a(3904, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = qh.a(var2.charAt(var3), -49);
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
                      if (sf.a((byte) 126, (CharSequence) ((Object) var4)) &&
                        !(hi.a(109, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a(3904, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (fd.field_h != null))) {
                stackIn_68_0 = fd.field_h.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (fd.field_h.length() > var1_int) {
                    var3 = fd.field_h.charAt(var1_int);
                    stackIn_83_0 = ~var3;
                    stackIn_83_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 <= stackIn_83_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = 10 * var2_int - (48 - var3);
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
                  ei.field_i = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = te.field_E;
                if (p.field_a != null) {
                  var1 = p.field_a;
                }
                var2_ref = fd.field_i;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ph.h(1048576);
                this.b(-54);
                o.field_n = rf.a(hf.field_h, (java.awt.Component) ((Object) field_h), qc.field_s, false);
                this.a(-4323);
                vj.field_v = dd.c(false);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (nf.field_n != 0L) {
                    stackIn_102_0 = $cfr$lcmp(hn.a((byte) 80), nf.field_n);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ve.field_a = vj.field_v.a(ch.field_a, 107);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(var3 < ve.field_a)) {
                      this.f(-114);
                      eb.a(gf.field_b, 1001, field_h);
                      break;
                    }
                    this.a(true);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              ic.a((byte) -125, (String) null, (Throwable) (var1));
              this.a(3904, "crash");
            }
            this.a(0, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw wg.a((Throwable) (var1), "se.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != md.field_n) {
          return null;
        }
        if (p.field_a != null &&
          this != p.field_a) {
          return p.field_a.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    protected se() {
        this.field_i = false;
    }

    public static void c(byte param0) {
        try {
          field_c = null;
          field_g = null;
          int var1_int = -114 % ((-33 - param0) / 61);
          field_h = null;
          field_d = null;
        } catch (RuntimeException runtimeException) {
          throw wg.a((Throwable) ((Object) runtimeException), "se.JB(" + param0 + ')');
        }
    }

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
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
              if (param0 != 3904) {
                this.init();
              }
              a.a("loggedout", bn.c(param0 ^ -3905), -126);
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
            stackIn_16_0 = var3_ref2;
            stackIn_16_1 = new StringBuilder().append("se.DB(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw wg.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
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
          if (te.field_E == this &&
            !kj.field_c) {
            pc.field_a = true;
            if (ei.field_i &&
              hn.a((byte) 80) - uc.field_c > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < gm.field_m) {
                  return;
                }
                if (var2.height < he.field_x) {
                  return;
                }
              }
              ih.field_s = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("se.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    final boolean d(int param0) {
        return true;
    }

    static {
        field_g = null;
        field_d = new int[8192];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
