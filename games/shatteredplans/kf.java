/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class kf extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    boolean field_e;
    static gq field_c;
    static int field_i;
    static int field_g;
    static String field_a;
    static String field_h;
    static int[] field_f;
    public static int field_l;
    public static int field_j;
    public static int field_b;
    public static int field_m;
    public static boolean field_d;
    public static boolean field_n;
    public static int field_k;

    public final void start() {
        if (this != ts.field_G ||
          fc.field_a) {
          return;
        }
        try {
          oe.field_a = 0L;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kf.start()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void g(int param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (uf.field_b != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != hb.field_a &&
            hb.field_a != this) {
            stackIn_10_0 = hb.field_a.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kf.getAppletContext()");
        }
    }

    public final void stop() {
        if (ts.field_G != this ||
          fc.field_a) {
          return;
        }
        try {
          oe.field_a = pr.a(14274) + 4000L;
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kf.stop()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(int param0);

    abstract void d(int param0);

    final static void e(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 <= 112) {
            return;
          }
          if (null != aj.field_e) {
            aj.field_e.c();
          }
          if (null != hg.field_q) {
            hg.field_q.c();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kf.QA(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("kf.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("kf.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static String[] a(String param0, byte param1, char param2) {
        int incrementValue$1 = 0;
        String[] var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        String[] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int stackIn_10_0 = 0;
        int stackIn_10_1 = 0;
        Object stackIn_13_0 = null;
        String[] stackIn_21_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var4Lifetime1;
        int var5Lifetime1;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var3 = so.a(param0, param2, 90);
          var5 = 0;
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var3.length))) {
            stackIn_10_0 = 0;
            stackIn_10_1 = var3[var4].trim().length();
            if (var8 == 0) {
              if (stackIn_10_0 < stackIn_10_1) {
                var5++;
              }
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_10_0 = -1;
            stackIn_10_1 = ~var5;
          }
          if (stackIn_10_0 == stackIn_10_1) {
            stackIn_13_0 = null;
            return (String[]) (stackIn_13_0);
          }
          var6 = new String[var5];
          var7 = 49 / ((29 - param1) / 56);
          var5Lifetime1 = 0;
          var4Lifetime1 = 0;
          while (var4Lifetime1 < var3.length) {
            if (var3[var4Lifetime1].trim().length() > 0) {
              incrementValue$1 = var5Lifetime1;
              var5Lifetime1++;
              var6[incrementValue$1] = var3[var4Lifetime1].trim();
            }
            var4Lifetime1++;
            if (var8 == 0) {
              continue;
            }
            break;
          }
          stackIn_21_0 = var6;
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_25_0 = var3_ref;
          stackIn_25_1 = new StringBuilder().append("kf.PA(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    protected kf() {
        this.field_e = false;
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_78_0 = 0;
          int stackIn_78_1 = 0;
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
          var5 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (qb.field_r != null) {
                var1 = qb.field_r.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = qb.field_i;
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
                    this.a((byte) 9, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = dk.a((byte) 63, var2.charAt(var3));
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
                      if (go.a(0, (CharSequence) ((Object) var4)) &&
                        !(ma.a((CharSequence) ((Object) var4), 2) >= 10)) {
                        this.a((byte) -113, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != qb.field_i))) {
                stackIn_66_0 = qb.field_i.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < qb.field_i.length()) {
                    var3 = qb.field_i.charAt(var1_int);
                    stackIn_78_0 = 48;
                    stackIn_78_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_78_0 <= stackIn_78_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = var2_int * 10 - 48 + var3;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_78_0 = 5;
                    stackIn_78_1 = var2_int;
                  }
                  if (stackIn_78_0 > stackIn_78_1) {
                    break;
                  }
                  me.field_a = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ts.field_G;
                if (hb.field_a != null) {
                  var1 = hb.field_a;
                }
                var2_ref = qb.field_v;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                dc.d(22943);
                this.f(0);
                so.field_q = in.a((java.awt.Component) ((Object) tm.field_i), 16, me.field_e, nn.field_b);
                this.c(-1);
                oe.field_d = ij.b(115);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != oe.field_a) {
                    stackIn_97_0 = $cfr$lcmp(oe.field_a, pr.a(14274));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_97_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    hp.field_p = oe.field_d.a(vg.field_i, -1);
                    stackIn_97_0 = 0;
                  }
                  var3 = stackIn_97_0;
                  do {
                    if (!(hp.field_p > var3)) {
                      this.c((byte) 58);
                      ud.a(-22, fa.field_W, tm.field_i);
                      break;
                    }
                    this.a((byte) -23);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              jq.a(-29901, (Throwable) (var1), (String) null);
              this.a((byte) -105, "crash");
            }
            this.a(-78, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw r.a((Throwable) (var1), "kf.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          field_f = null;
          field_a = null;
          if (param0 <= 113) {
            kf.a((String) null, 22, (bc) null, (String) null);
          }
          field_h = null;
          field_c = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kf.UA(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != uf.field_b) {
          return null;
        }
        if (null != hb.field_a &&
          this != hb.field_a) {
          return hb.field_a.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static int[] a(int[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int[] var3 = null;
        int var4 = 0;
        int var5 = 0;
        int[] stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 <= 83) {
            field_i = 66;
          }
          var2_int = param0.length;
          var3 = new int[var2_int];
          var4 = 0;
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 >= var2_int))) {
            stackIn_11_0 = var3;
            if (var5 == 0) {
              stackIn_11_0[param0[var4]] = var4;
              var4++;
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            stackIn_11_0 = var3;
          }
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("kf.NA(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
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
          if (uf.field_b != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (hb.field_a != null &&
            hb.field_a != this) {
            stackIn_8_0 = hb.field_a.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("kf.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lq.field_q = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kf.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != uf.field_b) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != hb.field_a &&
            hb.field_a != this) {
            stackIn_8_0 = hb.field_a.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var1), "kf.getDocumentBase()");
        }
    }

    final void a(byte param0, int param1, int param2, int param3, String param4, int param5, int param6) {
        try {
          qb dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          pb var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = ShatteredPlansClient.field_F ? 1 : 0;
          try {
            try {
              if (null != ts.field_G) {
                js.field_d = js.field_d + 1;
                if (js.field_d < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a((byte) -107, "alreadyloaded");
                return;
              }
              nn.field_b = param2;
              b.field_u = param2;
              if (param0 != -50) {
                field_f = (int[]) null;
              }
              gn.field_B = 0;
              ts.field_G = this;
              me.field_e = param6;
              tj.field_h = param6;
              td.field_G = param5;
              gs.field_k = 0;
              ei.field_c = kq.f((byte) 126);
              dupTemp$0 = new qb(param3, param4, param1, true);
              fa.field_W = dupTemp$0;
              jl.field_S = dupTemp$0;
              var8 = fa.field_W.a(true, 1, (Runnable) (this));
              while (true) {
                if (0 == var8.field_d) {
                  jb.a((byte) -120, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              jq.a(-29901, var8_ref, (String) null);
              this.a((byte) -95, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("kf.AB(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
            if (param4 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param5).append(',').append(param6).append(')').toString());
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
          if (ts.field_G == this &&
            !fc.field_a) {
            oq.field_e = true;
            if (me.field_a &&
              pr.a(14274) - nh.field_m > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < tj.field_h) {
                  return;
                }
                if (var2.height < b.field_u) {
                  return;
                }
              }
              pf.field_c = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_26_0 = var2_ref;
          stackIn_26_1 = new StringBuilder().append("kf.paint(");
          if (param0 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_26_0), ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          hb.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kf.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static nk a(String param0, int param1, bc param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        nk stackIn_1_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = -40 / ((-13 - param1) / 47);
          var4_int = param2.a(127, param0);
          var6 = param2.a(var4_int, (byte) 106, param3);
          stackIn_1_0 = lg.a(-78, var6, var4_int, param2);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_5_0 = var4;
          stackIn_5_1 = new StringBuilder().append("kf.SA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public abstract void init();

    final void a(byte param0, String param1) {
        try {
          RuntimeException stackIn_13_0 = null;
          StringBuilder stackIn_13_1 = null;
          String stackIn_14_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          int var3_int = 0;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_e) {
              return;
            }
            this.field_e = true;
            System.out.println("error_game_" + param1);
            try {
              ll.a("loggedout", kq.f((byte) 126), (byte) 55);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
              var3_int = -31 % ((-37 - param0) / 44);
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_13_0 = var3_ref2;
            stackIn_13_1 = new StringBuilder().append("kf.TA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_14_2 = "null";
            } else {
              stackIn_14_2 = "{...}";
            }
            throw r.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void c(int param0);

    final boolean b(byte param0) {
        return true;
    }

    private final void c(byte param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        java.awt.Insets var6 = null;
        try {
          var2_long = pr.a(param0 ^ 14328);
          var4 = nm.field_b[qo.field_a];
          nm.field_b[qo.field_a] = var2_long;
          qo.field_a = 1 + qo.field_a & 31;
          if (param0 != 58) {
            return;
          }
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            rq.field_i = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$1 = mk.field_a;
          mk.field_a = mk.field_a + 1;
          if (fieldTemp$1 > 50) {
            mk.field_a = mk.field_a - 50;
            oq.field_e = true;
            tm.field_i.setSize(me.field_e, nn.field_b);
            tm.field_i.setVisible(true);
            if (uf.field_b != null &&
              null == cg.field_K) {
              var6 = uf.field_b.getInsets();
              tm.field_i.setLocation(var6.left + gs.field_k, var6.top + gn.field_B);
              if (ShatteredPlansClient.field_F) {
                tm.field_i.setLocation(gs.field_k, gn.field_B);
              }
            } else {
              tm.field_i.setLocation(gs.field_k, gn.field_B);
            }
          }
          this.d(1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var2), "kf.BB(" + param0 + ')');
        }
    }

    public final void destroy() {
        if (ts.field_G != this ||
          fc.field_a) {
          return;
        }
        try {
          oe.field_a = pr.a(14274);
          jb.a((byte) -108, 5000L);
          jl.field_S = null;
          this.a(-113, false);
        } catch (RuntimeException runtimeException) {
          throw r.a((Throwable) ((Object) runtimeException), "kf.destroy()");
        }
    }

    final static gr a(byte param0, int param1, int param2, int param3) {
        gr var4 = null;
        int var5 = 0;
        gr stackIn_9_0 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        gr stackIn_16_0 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          var4 = (gr) (qa.field_r.d(0));
          boolean decompiledNaturalLoopExit0 = false;
          while (!(decompiledNaturalLoopExit0 = (var4 == null))) {
            stackIn_12_0 = param1;
            stackIn_12_1 = var4.field_k;
            if (var5 == 0) {
              if (stackIn_12_0 == stackIn_12_1) {
                stackIn_9_0 = var4;
                return stackIn_9_0;
              }
              var4 = (gr) (qa.field_r.a((byte) -71));
              continue;
            }
            break;
          }
          if (decompiledNaturalLoopExit0) {
            var4 = new gr();
            var4.field_k = param1;
            var4.field_j = param3;
            qa.field_r.a((byte) -113, var4);
            uf.a(var4, param2, false);
            stackIn_12_0 = param0;
            stackIn_12_1 = 29;
          }
          if (stackIn_12_0 < stackIn_12_1) {
            kf.a((String) null, -57, (bc) null, (String) null);
          }
          stackIn_16_0 = var4;
          return stackIn_16_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          throw r.a((Throwable) ((Object) var4_ref), "kf.VA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = pr.a(14274);
          var4 = fb.field_Cb[ca.field_j];
          fb.field_Cb[ca.field_j] = var2_long;
          if (0L != var4 &&
            var4 < var2_long) {
          }
          ca.field_j = ca.field_j + 1 & 31;
          var6 = this;
          synchronized (var6) {
            br.field_i = lq.field_q;
            if (param0 >= -20) {
              field_i = -95;
            }
          }
          this.a(-96);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kf.WA(" + param0 + ')');
        }
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (fc.field_a) {
              return;
            }
            fc.field_a = true;
          }
          if (null != hb.field_a) {
            hb.field_a.destroy();
          }
          try {
            this.a(false);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (param0 > -15) {
            return;
          }
          if (null != tm.field_i) {
            try {
              tm.field_i.removeFocusListener((java.awt.event.FocusListener) (this));
              tm.field_i.getParent().remove((java.awt.Component) ((Object) tm.field_i));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (fa.field_W != null) {
            try {
              fa.field_W.b(58);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.g(-24069);
          if (uf.field_b != null) {
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
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw r.a((Throwable) ((Object) runtimeException), "kf.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lq.field_q = true;
          oq.field_e = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("kf.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void a(boolean param0);

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null != tm.field_i) {
            tm.field_i.removeFocusListener((java.awt.event.FocusListener) (this));
            tm.field_i.getParent().setBackground(java.awt.Color.black);
            tm.field_i.getParent().remove((java.awt.Component) ((Object) tm.field_i));
          }
          if (param0 != 0) {
            this.c((byte) -79);
          }
          if (null == cg.field_K) {
            if (null == uf.field_b) {
              if (hb.field_a == null) {
                var2 = ts.field_G;
                if (var4 != 0) {
                  var2 = hb.field_a;
                  var2 = uf.field_b;
                  var2 = cg.field_K;
                }
              } else {
                var2 = hb.field_a;
                if (var4 != 0) {
                  var2 = uf.field_b;
                  var2 = cg.field_K;
                }
              }
            } else {
              var2 = uf.field_b;
              if (var4 != 0) {
                var2 = cg.field_K;
              }
            }
          } else {
            var2 = cg.field_K;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          tm.field_i = (java.awt.Canvas) ((Object) new af((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) tm.field_i));
          tm.field_i.setSize(me.field_e, nn.field_b);
          tm.field_i.setVisible(true);
          if (uf.field_b == var2) {
            var3 = uf.field_b.getInsets();
            tm.field_i.setLocation(gs.field_k + var3.left, var3.top + gn.field_B);
            if (var4 != 0) {
              tm.field_i.setLocation(gs.field_k, gn.field_B);
            }
          } else {
            tm.field_i.setLocation(gs.field_k, gn.field_B);
          }
          tm.field_i.addFocusListener((java.awt.event.FocusListener) (this));
          tm.field_i.requestFocus();
          br.field_i = true;
          lq.field_q = true;
          oq.field_e = true;
          pf.field_c = false;
          nh.field_m = pr.a(14274);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw r.a((Throwable) (var2), "kf.RA(" + param0 + ')');
        }
    }

    static {
        field_c = new gq(7, 0, 1, 1);
        field_i = 2;
        field_a = "Play rated game";
        field_h = "You have 1 unread message!";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
