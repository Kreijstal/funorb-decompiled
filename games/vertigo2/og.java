/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class og extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_c;
    static String field_i;
    boolean field_f;
    static String field_k;
    public static int field_a;
    public static int field_e;
    public static boolean field_h;
    public static boolean field_g;
    public static int field_j;
    public static int field_d;
    public static int field_b;

    abstract void d(int param0);

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          jj dupTemp$0 = null;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          wk var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Vertigo2.field_L ? 1 : 0;
          try {
            try {
              if (qe.field_T != null) {
                rh.field_H = rh.field_H + 1;
                if (rh.field_H < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(0, "alreadyloaded");
                return;
              }
              oq.field_I = param3;
              op.field_c = param5;
              lc.field_a = param5;
              qe.field_T = this;
              to.field_e = 0;
              bk.field_f = 0;
              gh.field_a = param4;
              hk.field_m = param4;
              nh.field_h = ob.e((byte) -106);
              if (param1 < 8) {
                return;
              }
              dupTemp$0 = new jj(param0, param6, param2, true);
              gi.field_s = dupTemp$0;
              mr.field_b = dupTemp$0;
              var8 = gi.field_s.a(1, (Runnable) (this), 0);
              while (true) {
                if (0 == var8.field_b) {
                  um.a(true, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              ke.a(var8_ref, (String) null, 0);
              this.a(0, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var8_ref2;
            stackIn_23_1 = new StringBuilder().append("og.DA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
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
          if (eo.field_k != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (va.field_o != null &&
            this != va.field_o) {
            stackIn_12_0 = va.field_o.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("og.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sj.field_b = true;
          uh.field_sc = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("og.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qe.field_T == this &&
            !gf.field_g) {
            lf.field_B = gk.a(52);
            um.a(true, 5000L);
            mr.field_b = null;
            this.a((byte) -53, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "og.destroy()");
        }
    }

    final boolean c(int param0) {
        return true;
    }

    public abstract void init();

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
            if (this.field_f) {
              return;
            }
            if (param0 != 0) {
              this.a(110, -90, 45, 6, 64, 46, (String) null);
            }
            this.field_f = true;
            System.out.println("error_game_" + param1);
            try {
              je.a(ob.e((byte) -121), false, "loggedout");
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
            stackIn_16_1 = new StringBuilder().append("og.FA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw wn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void start() {
        if (this != qe.field_T ||
          gf.field_g) {
          return;
        }
        try {
          lf.field_B = 0L;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "og.start()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    abstract void b(byte param0);

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          va.field_o = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("og.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void b(int param0);

    private final void e(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var2_long = gk.a(50);
          var4 = hd.field_d[nl.field_d];
          hd.field_d[nl.field_d] = var2_long;
          nl.field_d = nl.field_d + 1 & 31;
          var6 = -101 % ((param0 - 59) / 36);
          if (0L != var4 &&
            var2_long <= var4) {
          }
          var7 = this;
          synchronized (var7) {
            uj.field_g = sj.field_b;
          }
          this.f(69);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "og.CA(" + param0 + ')');
        }
    }

    final static int a(CharSequence param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_3_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = Vertigo2.field_L ? 1 : 0;
        try {
          var2_int = param0.length();
          var3 = 0;
          if (param1 >= -88) {
            stackIn_3_0 = -78;
            return stackIn_3_0;
          }
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var2_int <= var4))) {
            stackIn_9_0 = (var3 << 5) - var3 + ke.a(param0.charAt(var4), (byte) -120);
            if (var5 == 0) {
              var3 = stackIn_9_0;
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_9_0 = var3;
          }
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("og.T(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final synchronized void a(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Vertigo2.field_L ? 1 : 0;
        try {
          if (null != ne.field_F) {
            ne.field_F.removeFocusListener((java.awt.event.FocusListener) (this));
            ne.field_F.getParent().setBackground(java.awt.Color.black);
            ne.field_F.getParent().remove((java.awt.Component) ((Object) ne.field_F));
          }
          boolean decompiledFrameRemainder0 = true;
          if (lo.field_j == null) {
            if (null != eo.field_k) {
              var2 = eo.field_k;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null != va.field_o) {
                var2 = va.field_o;
                if (var4 != 0) {
                  var2 = qe.field_T;
                  var2 = lo.field_j;
                }
              } else {
                var2 = qe.field_T;
                if (var4 != 0) {
                  var2 = lo.field_j;
                }
              }
            }
          } else {
            var2 = lo.field_j;
          }
          if (param0 != -57) {
            return;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ne.field_F = (java.awt.Canvas) ((Object) new tg((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ne.field_F));
          ne.field_F.setSize(op.field_c, gh.field_a);
          ne.field_F.setVisible(true);
          if (var2 == eo.field_k) {
            var3 = eo.field_k.getInsets();
            ne.field_F.setLocation(bk.field_f + var3.left, var3.top + to.field_e);
            if (var4 != 0) {
              ne.field_F.setLocation(bk.field_f, to.field_e);
            }
          } else {
            ne.field_F.setLocation(bk.field_f, to.field_e);
          }
          ne.field_F.addFocusListener((java.awt.event.FocusListener) (this));
          ne.field_F.requestFocus();
          sj.field_b = true;
          uj.field_g = true;
          uh.field_sc = true;
          oh.field_F = false;
          nf.field_x = gk.a(89);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw wn.a((Throwable) (var2), "og.EA(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (eo.field_k != null) {
          return null;
        }
        if (va.field_o != null &&
          this != va.field_o) {
          return va.field_o.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void d(byte param0);

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (qe.field_T == this &&
            !gf.field_g) {
            lf.field_B = 4000L + gk.a(113);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "og.stop()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    static long a(long param0, long param1) {
        long stackIn_1_0 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          stackIn_1_0 = param0 ^ param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var4), "og.BA(" + param0 + ',' + param1 + ')');
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
          stackIn_5_1 = new StringBuilder().append("og.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        int stackIn_73_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int[] var15_ref_int__ = null;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int[] var22 = null;
        int var23 = 0;
        int[] var22Lifetime1;
        int[] var22Lifetime2;
        int[] var22Lifetime1Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        int var18Lifetime1;
        int var19Lifetime1;
        int var20Lifetime1;
        int var21Lifetime1;
        int var16Lifetime1Lifetime1;
        int var17Lifetime1Lifetime1;
        int var18Lifetime1Lifetime1;
        int var19Lifetime1Lifetime1;
        var23 = Vertigo2.field_L ? 1 : 0;
        try {
          jk.a(2, param4);
          var7_int = 0;
          var8 = -param6 + param4;
          if (0 > var8) {
            var8 = 0;
          }
          var9 = param4;
          var10 = -param4;
          var11 = var8;
          var12 = -var8;
          var13 = param2;
          var14 = -1;
          if (param5 >= ua.field_e &&
            cj.field_D >= param5) {
            var15_ref_int__ = vl.field_e[param5];
            var16 = pk.a((byte) -14, ib.field_a, -param4 + param3, ap.field_e);
            var17 = pk.a((byte) -14, ib.field_a, param4 + param3, ap.field_e);
            var18 = pk.a((byte) -14, ib.field_a, param3 - var8, ap.field_e);
            var19 = pk.a((byte) -14, ib.field_a, param3 + var8, ap.field_e);
            ki.a(-99, var16, var15_ref_int__, var18, param0);
            ki.a(param2 - 84, var18, var15_ref_int__, var19, param1);
            ki.a(-125, var19, var15_ref_int__, var17, param0);
          }
          while (var9 > var7_int) {
            var14 += 2;
            var13 += 2;
            var10 = var10 + var13;
            var12 = var12 + var14;
            if (var23 != 0) {
              return;
            }
            if (var12 >= 0 &&
              var11 >= 1) {
              var11--;
              var12 = var12 - (var11 << 1);
              jo.field_h[var11] = var7_int;
            }
            var7_int++;
            if (var10 >= 0) {
              var9--;
              var10 = var10 - (var9 << 1);
              var15 = -var9 + param5;
              var16Lifetime1 = var9 + param5;
              if (var16Lifetime1 >= ua.field_e &&
                var15 <= cj.field_D) {
                if (var8 > var9) {
                  var17Lifetime1 = jo.field_h[var9];
                  var18Lifetime1 = pk.a((byte) -14, ib.field_a, param3 + var7_int, ap.field_e);
                  var19Lifetime1 = pk.a((byte) -14, ib.field_a, param3 - var7_int, ap.field_e);
                  var20 = pk.a((byte) -14, ib.field_a, param3 + var17Lifetime1, ap.field_e);
                  var21 = pk.a((byte) -14, ib.field_a, -var17Lifetime1 + param3, ap.field_e);
                  if (cj.field_D >= var16Lifetime1) {
                    var22 = vl.field_e[var16Lifetime1];
                    ki.a(-102, var19Lifetime1, var22, var21, param0);
                    ki.a(-98, var21, var22, var20, param1);
                    ki.a(-106, var20, var22, var18Lifetime1, param0);
                  }
                  if (var15 >= ua.field_e) {
                    var22Lifetime2 = vl.field_e[var15];
                    ki.a(-75, var19Lifetime1, var22Lifetime2, var21, param0);
                    ki.a(-104, var21, var22Lifetime2, var20, param1);
                    ki.a(-79, var20, var22Lifetime2, var18Lifetime1, param0);
                  }
                } else {
                  var17Lifetime1 = pk.a((byte) -14, ib.field_a, var7_int + param3, ap.field_e);
                  var18Lifetime1 = pk.a((byte) -14, ib.field_a, -var7_int + param3, ap.field_e);
                  if (var16Lifetime1 <= cj.field_D) {
                    ki.a(param2 ^ 87, var18Lifetime1, vl.field_e[var16Lifetime1], var17Lifetime1, param0);
                  }
                  if (var15 >= ua.field_e) {
                    ki.a(-83, var18Lifetime1, vl.field_e[var15], var17Lifetime1, param0);
                  }
                }
              }
            }
            boolean decompiledFrameRemainder0 = true;
            var15Lifetime1 = -var7_int + param5;
            var16Lifetime1Lifetime1 = param5 + var7_int;
            if (var16Lifetime1Lifetime1 >= ua.field_e &&
              var15Lifetime1 <= cj.field_D) {
              var17Lifetime1Lifetime1 = param3 + var9;
              var18Lifetime1Lifetime1 = -var9 + param3;
              if (var17Lifetime1Lifetime1 >= ap.field_e &&
                var18Lifetime1Lifetime1 <= ib.field_a) {
                var17Lifetime1Lifetime1 = pk.a((byte) -14, ib.field_a, var17Lifetime1Lifetime1, ap.field_e);
                var18Lifetime1Lifetime1 = pk.a((byte) -14, ib.field_a, var18Lifetime1Lifetime1, ap.field_e);
                if (var8 <= var7_int) {
                  if (cj.field_D >= var16Lifetime1Lifetime1) {
                    ki.a(-91, var18Lifetime1Lifetime1, vl.field_e[var16Lifetime1Lifetime1], var17Lifetime1Lifetime1, param0);
                  }
                  if (!(var15Lifetime1 < ua.field_e)) {
                    ki.a(-96, var18Lifetime1Lifetime1, vl.field_e[var15Lifetime1], var17Lifetime1Lifetime1, param0);
                  }
                  decompiledFrameRemainder0 = false;
                }
                else {
                  if (var11 >= var7_int) {
                    stackIn_73_0 = var11;
                  } else {
                    stackIn_73_0 = jo.field_h[var7_int];
                  }
                  var19Lifetime1Lifetime1 = stackIn_73_0;
                  var20Lifetime1 = pk.a((byte) -14, ib.field_a, param3 + var19Lifetime1Lifetime1, ap.field_e);
                  var21Lifetime1 = pk.a((byte) -14, ib.field_a, param3 - var19Lifetime1Lifetime1, ap.field_e);
                  if (var16Lifetime1Lifetime1 <= cj.field_D) {
                    var22Lifetime1 = vl.field_e[var16Lifetime1Lifetime1];
                    ki.a(-95, var18Lifetime1Lifetime1, var22Lifetime1, var21Lifetime1, param0);
                    ki.a(param2 - 98, var21Lifetime1, var22Lifetime1, var20Lifetime1, param1);
                    ki.a(-80, var20Lifetime1, var22Lifetime1, var17Lifetime1Lifetime1, param0);
                  }
                  if (ua.field_e <= var15Lifetime1) {
                    var22Lifetime1Lifetime1 = vl.field_e[var15Lifetime1];
                    ki.a(-82, var18Lifetime1Lifetime1, var22Lifetime1Lifetime1, var21Lifetime1, param0);
                    ki.a(param2 ^ 125, var21Lifetime1, var22Lifetime1Lifetime1, var20Lifetime1, param1);
                    ki.a(-97, var20Lifetime1, var22Lifetime1Lifetime1, var17Lifetime1Lifetime1, param0);
                  }
                }
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var7), "og.W(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
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
          stackIn_5_1 = new StringBuilder().append("og.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        field_i = null;
        field_c = null;
        if (param0 != 26) {
          return;
        }
        try {
          field_k = null;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "og.GA(" + param0 + ')');
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != eo.field_k) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != va.field_o &&
            this != va.field_o) {
            stackIn_10_0 = va.field_o.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "og.getDocumentBase()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          sj.field_b = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("og.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void f(int param0);

    protected og() {
        this.field_f = false;
    }

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
            if (gf.field_g) {
              return;
            }
            gf.field_g = true;
          }
          if (null != va.field_o) {
            va.field_o.destroy();
          }
          try {
            this.b((byte) -123);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ne.field_F) {
            try {
              ne.field_F.removeFocusListener((java.awt.event.FocusListener) (this));
              ne.field_F.getParent().remove((java.awt.Component) ((Object) ne.field_F));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (param0 != -53) {
            field_i = (String) null;
          }
          if (null != gi.field_s) {
            try {
              gi.field_s.a(false);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.d((byte) 108);
          if (null != eo.field_k) {
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
          throw wn.a((Throwable) ((Object) runtimeException), "og.AA(" + param0 + ',' + param1 + ')');
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
          if (qe.field_T == this &&
            !gf.field_g) {
            uh.field_sc = true;
            if (kj.field_E &&
              gk.a(88) - nf.field_x > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (lc.field_a > var2.width) {
                  return;
                }
                if (var2.height < hk.field_m) {
                  return;
                }
              }
              oh.field_F = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("og.paint(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          var2_long = gk.a(param0 ^ 91);
          var4 = l.field_b[eb.field_e];
          l.field_b[eb.field_e] = var2_long;
          eb.field_e = param0 & eb.field_e + 1;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            li.field_d = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = km.field_x;
          km.field_x = km.field_x + 1;
          if (fieldTemp$1 > 50) {
            km.field_x = km.field_x - 50;
            uh.field_sc = true;
            ne.field_F.setSize(op.field_c, gh.field_a);
            ne.field_F.setVisible(true);
            if (eo.field_k != null &&
              null == lo.field_j) {
              var6 = eo.field_k.getInsets();
              ne.field_F.setLocation(bk.field_f + var6.left, var6.top + to.field_e);
              if (Vertigo2.field_L) {
                ne.field_F.setLocation(bk.field_f, to.field_e);
              }
            } else {
              ne.field_F.setLocation(bk.field_f, to.field_e);
            }
          }
          this.d(param0 - 48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) runtimeException), "og.V(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_80_0 = 0;
          int stackIn_80_1 = 0;
          int stackIn_101_0 = 0;
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
          var5 = Vertigo2.field_L ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (jj.field_m != null) {
                var1 = jj.field_m.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = jj.field_d;
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
                      stackIn_68_0 = ab.a(false, var2.charAt(var3));
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
                      if (qb.a((CharSequence) ((Object) var4), -69) &&
                        !(10 <= cf.a(86, (CharSequence) ((Object) var4)))) {
                        this.a(0, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (jj.field_d != null))) {
                stackIn_68_0 = jj.field_d.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < jj.field_d.length()) {
                    var3 = jj.field_d.charAt(var1_int);
                    stackIn_80_0 = var3;
                    stackIn_80_1 = 48;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_80_0 >= stackIn_80_1 &&
                      57 >= var3)) {
                      var1_int++;
                      var2_int = -48 + (var3 + var2_int * 10);
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_80_0 = 5;
                    stackIn_80_1 = var2_int;
                  }
                  if (stackIn_80_0 > stackIn_80_1) {
                    break;
                  }
                  kj.field_E = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = qe.field_T;
                if (null != va.field_o) {
                  var1 = va.field_o;
                }
                var2_ref = jj.field_e;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                nf.a(true);
                this.a((byte) -57);
                ro.field_g = nn.a(gh.field_a, (java.awt.Component) ((Object) ne.field_F), true, op.field_c);
                this.b(255);
                wa.field_i = bl.c(true);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (lf.field_B != 0L) {
                    stackIn_101_0 = $cfr$lcmp(~gk.a(73), ~lf.field_B);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_101_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    tf.field_n = wa.field_i.a(sl.field_w, true);
                    stackIn_101_0 = 0;
                  }
                  var3 = stackIn_101_0;
                  do {
                    if (!(var3 < tf.field_n)) {
                      this.a(31);
                      e.a(gi.field_s, ne.field_F, -29785);
                      break;
                    }
                    this.e(11);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              ke.a((Throwable) (var1), (String) null, 0);
              this.a(0, "crash");
            }
            this.a((byte) -53, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw wn.a((Throwable) (var1), "og.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (eo.field_k != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != va.field_o &&
            this != va.field_o) {
            stackIn_10_0 = va.field_o.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wn.a((Throwable) ((Object) var1), "og.getAppletContext()");
        }
    }

    static {
        field_i = "<%0> has left the lobby.";
        field_c = "The block with the green vortex is a portal. This takes you to another point on the level. At the top of the level there are cracked blocks. Move onto them and they start to shake; they'll crumble once you move off of them. Since they are blue, you must get rid of them to complete the level.";
        field_k = "Use this alternative as your account name";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
