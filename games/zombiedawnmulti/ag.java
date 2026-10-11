/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class ag extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_f;
    static ja field_b;
    static th field_i;
    static String field_g;
    public static boolean field_d;
    public static int field_e;
    public static boolean field_a;
    public static boolean field_h;
    public static int field_k;
    public static boolean field_c;
    public static int field_j;

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
          stackIn_5_1 = new StringBuilder().append("ag.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          fd.field_L = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ag.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
        RuntimeException var3_ref2 = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (aq.field_t) {
              return;
            }
            if (param0 < 49) {
              this.a((byte) 54);
            }
            aq.field_t = true;
          }
          if (fd.field_L != null) {
            fd.field_L.destroy();
          }
          try {
            this.d(-18941);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (dk.field_Ib != null) {
            try {
              dk.field_Ib.removeFocusListener((java.awt.event.FocusListener) (this));
              dk.field_Ib.getParent().remove((java.awt.Component) ((Object) dk.field_Ib));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (pl.field_J != null) {
            try {
              pl.field_J.b(124);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c(-97);
          if (null != cg.field_m) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var3_ref2), "ag.SA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

    final void a(int param0, String param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_f) {
              return;
            }
            this.field_f = true;
            System.out.println("error_game_" + param1);
            try {
              fo.b(jl.b(param0 ^ 27200), 13093, "loggedout");
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
            if (param0 != 27200) {
              field_b = (ja) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = runtimeException;
            stackIn_16_1 = new StringBuilder().append("ag.NA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = bl.a((byte) 88);
          var4 = pj.field_K[ik.field_c];
          pj.field_K[ik.field_c] = var2_long;
          ik.field_c = 1 + ik.field_c & 31;
          if (param0 < 84) {
            this.focusGained((java.awt.event.FocusEvent) null);
          }
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            ei.field_b = (32000 + (var6_int >> 1)) / var6_int;
          }
          var6 = this;
          synchronized (var6) {
            ro.field_L = df.field_P;
          }
          this.e(-11);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "ag.RA(" + param0 + ')');
        }
    }

    abstract void g(int param0);

    public final void stop() {
        if (this != tg.field_i ||
          aq.field_t) {
          return;
        }
        try {
          kj.field_n = 4000L + bl.a((byte) 107);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ag.stop()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          df.field_P = true;
          cj.field_ub = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ag.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, byte param1) {
        ga var2 = ma.field_a;
        var2.b((byte) -35, param0);
        var2.a(-28, 1);
        if (param1 != 98) {
          return;
        }
        try {
          var2.a(param1 + 13, 3);
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "ag.UA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (null != dk.field_Ib) {
            dk.field_Ib.removeFocusListener((java.awt.event.FocusListener) (this));
            dk.field_Ib.getParent().setBackground(java.awt.Color.black);
            dk.field_Ib.getParent().remove((java.awt.Component) ((Object) dk.field_Ib));
          }
          boolean decompiledFrameRemainder0 = true;
          if (ll.field_g != null) {
            var2 = ll.field_g;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (cg.field_m != null) {
              var2 = cg.field_m;
              if (var4 != 0) {
                if (fd.field_L != null) {
                  var2 = fd.field_L;
                  var2 = tg.field_i;
                } else {
                  var2 = tg.field_i;
                }
              }
            } else {
              if (fd.field_L != null) {
                var2 = fd.field_L;
                if (var4 != 0) {
                  var2 = tg.field_i;
                }
              } else {
                var2 = tg.field_i;
              }
            }
          }
          if (param0 != -58) {
            return;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          dk.field_Ib = (java.awt.Canvas) ((Object) new kq((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) dk.field_Ib));
          dk.field_Ib.setSize(ng.field_d, pi.field_i);
          dk.field_Ib.setVisible(true);
          if (var2 == cg.field_m) {
            var3 = cg.field_m.getInsets();
            dk.field_Ib.setLocation(bl.field_a + var3.left, var3.top + lo.field_d);
            if (var4 != 0) {
              dk.field_Ib.setLocation(bl.field_a, lo.field_d);
            }
          } else {
            dk.field_Ib.setLocation(bl.field_a, lo.field_d);
          }
          dk.field_Ib.addFocusListener((java.awt.event.FocusListener) (this));
          dk.field_Ib.requestFocus();
          df.field_P = true;
          ro.field_L = true;
          cj.field_ub = true;
          hn.field_h = false;
          eo.field_d = bl.a((byte) 64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fa.a((Throwable) (var2), "ag.WA(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_83_0 = 0;
          int stackIn_83_1 = 0;
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
          var5 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != go.field_r) {
                var1 = go.field_r.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = go.field_q;
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
                    this.a(27200, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = vh.a(var2.charAt(var3), (byte) 85);
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
                      if (ti.a((byte) -121, (CharSequence) ((Object) var4)) &&
                        !(md.a((CharSequence) ((Object) var4), -9159) >= 10)) {
                        this.a(27200, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (go.field_q != null))) {
                stackIn_68_0 = go.field_q.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < go.field_q.length()) {
                    var3 = go.field_q.charAt(var1_int);
                    stackIn_83_0 = 48;
                    stackIn_83_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 <= stackIn_83_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = 10 * var2_int - 48 + var3;
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_83_0 = ~var2_int;
                    stackIn_83_1 = -6;
                  }
                  if (stackIn_83_0 > stackIn_83_1) {
                    break;
                  }
                  mj.field_Rb = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = tg.field_i;
                if (fd.field_L != null) {
                  var1 = fd.field_L;
                }
                var2_ref = go.field_h;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                wa.a((byte) 43);
                this.f(-58);
                dl.field_h = wb.a(1, (java.awt.Component) ((Object) dk.field_Ib), ng.field_d, pi.field_i);
                this.a(73);
                kj.field_r = hn.a((byte) -92);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (kj.field_n != 0L) {
                    stackIn_100_0 = $cfr$lcmp(kj.field_n, bl.a((byte) 76));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ic.field_a = kj.field_r.b(td.field_g, false);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(ic.field_a > var3)) {
                      this.a(false);
                      de.a(pl.field_J, (byte) 99, dk.field_Ib);
                      break;
                    }
                    this.a((byte) 114);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              bd.a((String) null, (Throwable) (var1), false);
              this.a(27200, "crash");
            }
            this.a((byte) 87, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw fa.a((Throwable) (var1), "ag.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == tg.field_i &&
            !aq.field_t) {
            kj.field_n = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "ag.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          go dupTemp$0 = null;
          RuntimeException stackIn_26_0 = null;
          StringBuilder stackIn_26_1 = null;
          String stackIn_27_2 = null;
          Throwable decompiledCaughtException = null;
          di var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = ZombieDawnMulti.field_E ? 1 : 0;
          try {
            try {
              if (null != tg.field_i) {
                wb.field_Ab = wb.field_Ab + 1;
                if (wb.field_Ab >= 3) {
                  this.a(param3 - 4800, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              pi.field_i = param4;
              lf.field_d = param4;
              ng.field_d = param1;
              mi.field_Hb = param1;
              lo.field_d = 0;
              pn.field_b = param0;
              bl.field_a = 0;
              tg.field_i = this;
              if (param3 != 32000) {
                field_g = (String) null;
              }
              aq.field_w = jl.b(0);
              dupTemp$0 = new go(param2, param5, param6, true);
              pl.field_J = dupTemp$0;
              kk.field_y = dupTemp$0;
              var8 = pl.field_J.a(param3 ^ 32125, (Runnable) (this), 1);
              while (true) {
                if (var8.field_f == 0) {
                  vd.a(false, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              bd.a((String) null, var8_ref, false);
              this.a(27200, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_26_0 = var8_ref2;
            stackIn_26_1 = new StringBuilder().append("ag.TA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_27_2 = "null";
            } else {
              stackIn_27_2 = "{...}";
            }
            throw fa.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != cg.field_m) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (fd.field_L != null &&
            fd.field_L != this) {
            stackIn_8_0 = fd.field_L.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ag.getAppletContext()");
        }
    }

    private final void a(boolean param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = bl.a((byte) 47);
          var4 = dc.field_Ib[al.field_Z];
          dc.field_Ib[al.field_Z] = var2_long;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            ji.field_b = ((var6_int >> 1) + 32000) / var6_int;
          }
          if (param0) {
            this.field_f = true;
          }
          al.field_Z = al.field_Z + 1 & 31;
          fieldTemp$1 = mq.field_r;
          mq.field_r = mq.field_r + 1;
          if (fieldTemp$1 > 50) {
            cj.field_ub = true;
            mq.field_r = mq.field_r - 50;
            dk.field_Ib.setSize(ng.field_d, pi.field_i);
            dk.field_Ib.setVisible(true);
            if (null != cg.field_m &&
              ll.field_g == null) {
              var6 = cg.field_m.getInsets();
              dk.field_Ib.setLocation(var6.left + bl.field_a, lo.field_d + var6.top);
              if (ZombieDawnMulti.field_E) {
                dk.field_Ib.setLocation(bl.field_a, lo.field_d);
              }
            } else {
              dk.field_Ib.setLocation(bl.field_a, lo.field_d);
            }
          }
          this.g(-30169);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "ag.PA(" + param0 + ')');
        }
    }

    public static void b(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_b = null;
          field_g = null;
          if (!param0) {
            field_g = (String) null;
          }
          field_i = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ag.VA(" + param0 + ')');
        }
    }

    protected ag() {
        this.field_f = false;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (cg.field_m != null) {
          return null;
        }
        if (null != fd.field_L &&
          this != fd.field_L) {
          return fd.field_L.getCodeBase();
        }
        return super.getCodeBase();
    }

    public abstract void init();

    final static void a(byte param0, nh param1, int param2) {
        RuntimeException runtimeException = null;
        ga var3 = null;
        int var4 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = 8 / ((-46 - param0) / 37);
          var3 = ma.field_a;
          var3.b((byte) -35, param2);
          var3.a(-128, 5);
          var3.a(123, 0);
          var3.a(param1.field_l, (byte) -44);
          var3.a(126, param1.field_k);
          var3.a(111, param1.field_f);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ag.OA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final boolean b(int param0) {
        return true;
    }

    abstract void c(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != cg.field_m) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (fd.field_L != null &&
            this != fd.field_L) {
            stackIn_12_0 = fd.field_L.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) var1), "ag.getDocumentBase()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          df.field_P = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ag.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          if (null != cg.field_m) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (fd.field_L != null &&
            this != fd.field_L) {
            stackIn_8_0 = fd.field_L.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ag.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    abstract void e(int param0);

    abstract void a(int param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (this == tg.field_i &&
            !aq.field_t) {
            cj.field_ub = true;
            if (mj.field_Rb &&
              bl.a((byte) 124) - eo.field_d > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < mi.field_Hb) {
                  return;
                }
                if (var2.height < lf.field_d) {
                  return;
                }
              }
              hn.field_h = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("ag.paint(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("ag.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (tg.field_i == this &&
            !aq.field_t) {
            kj.field_n = bl.a((byte) 40);
            vd.a(false, 5000L);
            kk.field_y = null;
            this.a((byte) 73, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fa.a((Throwable) ((Object) runtimeException), "ag.destroy()");
        }
    }

    static {
        field_i = new th();
        field_g = "Hide players in <%0>'s game";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
