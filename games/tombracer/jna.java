/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class jna extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static ka[] field_j;
    boolean field_b;
    public static boolean field_m;
    public static boolean field_k;
    public static boolean field_f;
    public static int field_n;
    public static boolean field_h;
    public static boolean field_e;
    public static int field_l;
    public static int field_a;
    public static boolean field_i;
    public static int field_g;
    public static int field_c;
    public static int field_o;
    public static boolean field_d;

    abstract void a(boolean param0);

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

    final void a(int param0, String param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_b) {
              return;
            }
            this.field_b = true;
            System.out.println("error_game_" + param1);
            try {
              lb.b(di.a(43), 2864, "loggedout");
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              throwable = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
            if (param0 != -6738) {
              this.start();
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_17_0 = runtimeException;
            stackIn_17_1 = new StringBuilder().append("jna.S(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
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
          if (rla.field_x != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (cba.field_a != null &&
            cba.field_a != this) {
            stackIn_8_0 = cba.field_a.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("jna.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 > -87) {
            jna.provideLoaderApplet((java.applet.Applet) null);
          }
          field_j = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "jna.M(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (kua.field_j == this &&
            !tla.field_b) {
            boa.field_t = bva.b((byte) -107) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "jna.stop()");
        }
    }

    private final void f(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = bva.b((byte) -107);
          if (param0 != 270) {
            return;
          }
          var4 = eia.field_r[sla.field_d];
          eia.field_r[sla.field_d] = var2_long;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            oea.field_f = (32000 + (var6_int >> 1)) / var6_int;
          }
          sla.field_d = 31 & 1 + sla.field_d;
          fieldTemp$1 = nsa.field_d;
          nsa.field_d = nsa.field_d + 1;
          if (fieldTemp$1 > 50) {
            bsa.field_k = true;
            nsa.field_d = nsa.field_d - 50;
            nma.field_l.setSize(mma.field_a, qf.field_i);
            nma.field_l.setVisible(true);
            boolean decompiledSharedTail0 = (null != rla.field_x &&
              null == nb.field_d);
            if (!decompiledSharedTail0) {
              nma.field_l.setLocation(lp.field_g, vu.field_f);
              decompiledSharedTail0 = (TombRacer.field_G);
            }
            if (decompiledSharedTail0) {
              var6 = rla.field_x.getInsets();
              nma.field_l.setLocation(lp.field_g + var6.left, var6.top + vu.field_f);
            }
          }
          this.c(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "jna.O(" + param0 + ')');
        }
    }

    final boolean a(byte param0) {
        return true;
    }

    private final void g(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          if (param0 != -6) {
            this.field_b = true;
          }
          var2_long = bva.b((byte) -107);
          var4 = bv.field_xb[aaa.field_b];
          bv.field_xb[aaa.field_b] = var2_long;
          aaa.field_b = 31 & 1 + aaa.field_b;
          if (var4 != 0L &&
            var4 >= var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            bn.field_n = oea.field_k;
          }
          this.a(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var2), "jna.H(" + param0 + ')');
        }
    }

    abstract void h(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == kua.field_j &&
            !tla.field_b) {
            boa.field_t = bva.b((byte) -107);
            vja.a(0, 5000L);
            nea.field_c = null;
            this.a((byte) 109, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "jna.destroy()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oea.field_k = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("jna.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (rla.field_x != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (cba.field_a != null &&
            this != cba.field_a) {
            stackIn_12_0 = cba.field_a.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "jna.getAppletContext()");
        }
    }

    final static boolean a(boolean param0, int param1, int param2, cn param3) {
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = param3.a(param0, param2, param1);
          if (null == var4) {
            return false;
          }
          ira.a(0, var4);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_8_0 = var4_ref;
          stackIn_8_1 = new StringBuilder().append("jna.L(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (rla.field_x != null) {
          return null;
        }
        if (cba.field_a != null &&
          cba.field_a != this) {
          return cba.field_a.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (rla.field_x != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != cba.field_a &&
            this != cba.field_a) {
            stackIn_8_0 = cba.field_a.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "jna.getDocumentBase()");
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
          stackIn_5_1 = new StringBuilder().append("jna.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (kua.field_j == this &&
            !tla.field_b) {
            boa.field_t = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) runtimeException), "jna.start()");
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
          var5 = TombRacer.field_G ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (fia.field_e != null) {
                var1 = fia.field_e.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = fia.field_v;
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
                    this.a(-6738, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_66_0 = dp.a(120, var2.charAt(var3));
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
                      if (sqa.a((CharSequence) ((Object) var4), -3) &&
                        !(jb.a((CharSequence) ((Object) var4), (byte) 70) >= 10)) {
                        this.a(-6738, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != fia.field_v))) {
                stackIn_66_0 = fia.field_v.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < fia.field_v.length()) {
                    var3 = fia.field_v.charAt(var1_int);
                    stackIn_82_0 = 48;
                    stackIn_82_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_82_0 <= stackIn_82_1 && (57 >= var3 ||
                      var5 != 0))) {
                      var1_int++;
                      var2_int = var2_int * 10 + (-48 + var3);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_82_0 = -6;
                    stackIn_82_1 = ~var2_int;
                  }
                  if (stackIn_82_0 < stackIn_82_1) {
                    break;
                  }
                  da.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = kua.field_j;
                if (null != cba.field_a) {
                  var1 = cba.field_a;
                }
                var2_ref = fia.field_b;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                wk.a((byte) -84);
                this.b((byte) 68);
                gn.field_C = ns.a(117, mma.field_a, (java.awt.Component) ((Object) nma.field_l), qf.field_i);
                this.h(-71);
                cq.field_a = bca.a(0);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (boa.field_t != 0L) {
                    stackIn_99_0 = $cfr$lcmp(~boa.field_t, ~bva.b((byte) -107));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_99_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    mt.field_a = cq.field_a.a((byte) 12, mga.field_i);
                    stackIn_99_0 = 0;
                  }
                  var3 = stackIn_99_0;
                  do {
                    if (!(mt.field_a > var3)) {
                      this.f(270);
                      kla.a(dsa.field_c, (byte) 86, nma.field_l);
                      break;
                    }
                    this.g(-6);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              ssa.a((String) null, (byte) 127, (Throwable) (var1));
              this.a(-6738, "crash");
            }
            this.a((byte) 109, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw tba.a((Throwable) (var1), "jna.run()");
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
          if (kua.field_j == this &&
            !tla.field_b) {
            bsa.field_k = true;
            if (da.field_c &&
              -lt.field_b + bva.b((byte) -107) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < rv.field_a) {
                  return;
                }
                if (var2.height < eca.field_a) {
                  return;
                }
              }
              wla.field_Cb = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("jna.paint(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("jna.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public abstract void init();

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (tla.field_b) {
              return;
            }
            tla.field_b = true;
          }
          if (null != cba.field_a) {
            cba.field_a.destroy();
          }
          try {
            if (param0 != 109) {
              jna.a(false, -94, 60, (cn) null);
            }
            this.d(param0 ^ -45);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (nma.field_l != null) {
            try {
              nma.field_l.removeFocusListener((java.awt.event.FocusListener) (this));
              nma.field_l.getParent().remove((java.awt.Component) ((Object) nma.field_l));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (dsa.field_c != null) {
            try {
              dsa.field_c.b((byte) 59);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.e(-3666);
          if (rla.field_x != null) {
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
          throw tba.a((Throwable) ((Object) runtimeException), "jna.J(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void e(int param0);

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          oea.field_k = true;
          bsa.field_k = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("jna.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          fia dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          naa var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = TombRacer.field_G ? 1 : 0;
          try {
            try {
              if (kua.field_j != null) {
                lpa.field_v = lpa.field_v + 1;
                if (lpa.field_v < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(-6738, "alreadyloaded");
                return;
              }
              kua.field_j = this;
              qf.field_i = param1;
              eca.field_a = param1;
              vu.field_f = 0;
              mma.field_a = param2;
              rv.field_a = param2;
              sua.field_L = param4;
              lp.field_g = 0;
              if (param0) {
                this.paint((java.awt.Graphics) null);
              }
              dfa.field_e = di.a(49);
              dupTemp$0 = new fia(param5, param6, param3, true);
              dsa.field_c = dupTemp$0;
              nea.field_c = dupTemp$0;
              var8 = dsa.field_c.a((Runnable) (this), 425, 1);
              while (true) {
                if (var8.field_b == 0) {
                  vja.a(0, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              ssa.a((String) null, (byte) 118, var8_ref);
              this.a(-6738, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("jna.E(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw tba.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
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
          cba.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("jna.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void b(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (null != nma.field_l) {
            nma.field_l.removeFocusListener((java.awt.event.FocusListener) (this));
            nma.field_l.getParent().setBackground(java.awt.Color.black);
            nma.field_l.getParent().remove((java.awt.Component) ((Object) nma.field_l));
          }
          if (null == nb.field_d) {
            if (rla.field_x == null) {
              if (null != cba.field_a) {
                var2 = cba.field_a;
                if (var4 != 0) {
                  var2 = kua.field_j;
                  var2 = rla.field_x;
                  var2 = nb.field_d;
                }
              } else {
                var2 = kua.field_j;
                if (var4 != 0) {
                  var2 = rla.field_x;
                  var2 = nb.field_d;
                }
              }
            } else {
              var2 = rla.field_x;
              if (var4 != 0) {
                var2 = nb.field_d;
              }
            }
          } else {
            var2 = nb.field_d;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          nma.field_l = (java.awt.Canvas) ((Object) new he((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) nma.field_l));
          nma.field_l.setSize(mma.field_a, qf.field_i);
          nma.field_l.setVisible(true);
          if (param0 <= 9) {
            return;
          }
          boolean decompiledSharedTail0 = (rla.field_x == var2);
          if (!decompiledSharedTail0) {
            nma.field_l.setLocation(lp.field_g, vu.field_f);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = rla.field_x.getInsets();
            nma.field_l.setLocation(var3.left + lp.field_g, var3.top + vu.field_f);
          }
          nma.field_l.addFocusListener((java.awt.event.FocusListener) (this));
          nma.field_l.requestFocus();
          oea.field_k = true;
          bn.field_n = true;
          bsa.field_k = true;
          wla.field_Cb = false;
          lt.field_b = bva.b((byte) -107);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw tba.a((Throwable) (var2), "jna.Q(" + param0 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void c(int param0);

    protected jna() {
        this.field_b = false;
    }

    final static int a(int param0, int[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = TombRacer.field_G ? 1 : 0;
        try {
          if (param0 != 10) {
            stackIn_3_0 = -40;
            return stackIn_3_0;
          }
          var2_int = 0;
          var3 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var3 >= param1.length))) {
            stackIn_9_0 = var2_int + param1[var3];
            if (var4 == 0) {
              var2_int = stackIn_9_0;
              var3++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_9_0 = var2_int;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("jna.N(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    static {
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
