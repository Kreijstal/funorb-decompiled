/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class fa extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int[] field_d;
    static jc field_j;
    boolean field_g;
    static km field_e;
    static String field_k;
    public static boolean field_b;
    public static int field_c;
    public static boolean field_l;
    public static int field_f;
    public static int field_a;
    public static boolean field_h;
    public static boolean field_i;

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
          stackIn_5_1 = new StringBuilder().append("fa.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void b(int param0);

    final static void a(ac param0, int param1, int param2) {
        RuntimeException runtimeException = null;
        nk var3 = null;
        int var4 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = qn.field_U;
          var3.f(param2, -65);
          var3.field_l = var3.field_l + 1;
          var4 = var3.field_l;
          var3.c(1, (byte) -114);
          var3.c(param0.field_q, (byte) 124);
          if (param1 != 15079) {
            field_d = (int[]) null;
          }
          var3.c(param0.field_m, (byte) -90);
          var3.d(param0.field_r, (byte) -81);
          var3.d(param0.field_s, (byte) -81);
          var3.d(param0.field_o, (byte) -81);
          var3.d(param0.field_n, (byte) -81);
          var3.b(var4, (byte) -126);
          var3.a(var3.field_l - var4, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_8_0 = runtimeException;
          stackIn_8_1 = new StringBuilder().append("fa.D(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public abstract void init();

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          qe.field_B = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fa.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void a(boolean param0);

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (nk.field_w == this &&
            !jf.field_a) {
            od.field_W = true;
            if (om.field_l &&
              ud.a(2) - pj.field_g > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (sl.field_c > var2.width) {
                  return;
                }
                if (hk.field_H > var2.height) {
                  return;
                }
              }
              hf.field_a = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("fa.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          b.field_f = true;
          od.field_W = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fa.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void e(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("fa.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(String param0, int param1) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_g) {
              return;
            }
            this.field_g = true;
            System.out.println("error_game_" + param0);
            try {
              u.a(true, "loggedout", bh.i(81));
              if (param1 != -58) {
                fa.a((byte) -79);
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
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("fa.I(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        if (nk.field_w != this ||
          jf.field_a) {
          return;
        }
        try {
          mk.field_b = 4000L + ud.a(2);
        } catch (RuntimeException runtimeException) {
          throw fk.a((Throwable) ((Object) runtimeException), "fa.stop()");
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == nk.field_w &&
            !jf.field_a) {
            mk.field_b = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "fa.start()");
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != lk.field_a) {
          return null;
        }
        if (null != qe.field_B &&
          this != qe.field_B) {
          return qe.field_B.getCodeBase();
        }
        return super.getCodeBase();
    }

    final static ld a(int param0, boolean param1) {
        boolean stackIn_5_0 = false;
        int stackIn_15_0 = 0;
        int[] stackIn_39_0 = null;
        ld stackIn_43_0 = null;
        Throwable decompiledCaughtException = null;
        nk var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        dj var6 = null;
        Exception var6_ref = null;
        int var7 = 0;
        var7 = Chess.field_G;
        try {
          var2 = tk.field_h;
          var3 = var2.i(-118);
          stackIn_5_0 = ((128 & var3) != 0);
          ue.field_c = stackIn_5_0;
          tk.field_b = var3 & 127;
          fj.field_a = var2.i(-118);
          sa.field_e = var2.d((byte) 115);
          if (tk.field_b == 2) {
            va.field_a = var2.f(674914976);
            ud.field_a = var2.k(1389913160);
            if (var7 != 0) {
              va.field_a = 0;
              ud.field_a = 0;
            }
          } else {
            va.field_a = 0;
            ud.field_a = 0;
          }
          stackIn_15_0 = (var2.i(-107) != 1) ? 0 : 1;
          var4 = stackIn_15_0;
          an.field_a = var2.d(param0 + param0);
          if (var4 == 0) {
            oh.field_e = an.field_a;
          }
          if (var4 != 0 ||
            var7 != 0) {
            oh.field_e = var2.d(0);
          }
          if (1 != tk.field_b &&
            tk.field_b != 4) {
            qn.field_M = 0;
            bh.field_H = null;
            if (var7 != 0) {
              qn.field_M = var2.f(674914976);
              bh.field_H = var2.d(0);
            }
          } else {
            qn.field_M = var2.f(674914976);
            bh.field_H = var2.d(0);
          }
          if (!param1) {
            sn.field_g = am.a(var2, 80, (byte) 89);
            mk.field_d = null;
          }
          if (param1 ||
            var7 != 0) {
            var5 = var2.f(674914976);
            try {
              var6 = oa.field_b.a((byte) 79, var5);
              sn.field_g = var6.e((byte) -125);
              if (!oh.field_e.equals(ci.field_J)) {
                stackIn_39_0 = var6.field_u;
              } else {
                stackIn_39_0 = null;
              }
              mk.field_d = stackIn_39_0;
            } catch (java.lang.Exception decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var6_ref = (Exception) (Object) decompiledCaughtException;
              fg.a((Throwable) ((Object) var6_ref), (byte) -77, "CC1");
              mk.field_d = null;
              sn.field_g = null;
            }
          }
          stackIn_43_0 = new ld(param1);
          return stackIn_43_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
          decompiledCaughtException = decompiledCaughtParameter1;
          var2_ref = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2_ref), "fa.K(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
          boolean stackIn_64_0 = false;
          int stackIn_76_0 = 0;
          int stackIn_76_1 = 0;
          int stackIn_95_0 = 0;
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
          var5 = Chess.field_G;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (jk.field_o != null) {
                var1 = jk.field_o.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = jk.field_i;
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
                    this.a("wrongjava", -58);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_64_0 = di.a(-49, var2.charAt(var3));
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
                      if (lg.a((byte) 88, (CharSequence) ((Object) var4)) &&
                        !(fn.a((CharSequence) ((Object) var4), 0) >= 10)) {
                        this.a("wrongjava", -58);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (jk.field_i != null))) {
                stackIn_64_0 = jk.field_i.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_64_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < jk.field_i.length()) {
                    var3 = jk.field_i.charAt(var1_int);
                    stackIn_76_0 = ~var3;
                    stackIn_76_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_76_0 <= stackIn_76_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = var3 - 48 + var2_int * 10;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_76_0 = ~var2_int;
                    stackIn_76_1 = -6;
                  }
                  if (stackIn_76_0 > stackIn_76_1) {
                    break;
                  }
                  om.field_l = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = nk.field_w;
                if (null != qe.field_B) {
                  var1 = qe.field_B;
                }
                var2_ref = jk.field_m;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                bb.a(75);
                this.d((byte) 125);
                ph.field_j = ad.a((java.awt.Component) ((Object) ja.field_h), (byte) -80, em.field_O, tm.field_c);
                this.b(2);
                v.field_e = dj.h(-13154);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != mk.field_b) {
                    stackIn_95_0 = $cfr$lcmp(mk.field_b, ud.a(2));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_95_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    hk.field_M = v.field_e.b(ji.field_U, -102);
                    stackIn_95_0 = 0;
                  }
                  var3 = stackIn_95_0;
                  do {
                    if (!(hk.field_M > var3)) {
                      this.c((byte) 119);
                      ak.a(oc.field_l, (byte) 111, ja.field_h);
                      break;
                    }
                    this.c(-120);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              fg.a((Throwable) (var1), (byte) -77, (String) null);
              this.a("crash", -58);
            }
            this.a((byte) 33, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw fk.a((Throwable) (var1), "fa.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void b(byte param0);

    private final void c(int param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          var2_long = ud.a(2);
          var4 = fi.field_d[qm.field_b];
          fi.field_d[qm.field_b] = var2_long;
          qm.field_b = qm.field_b + 1 & 31;
          if (param0 > -87) {
            return;
          }
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          var6 = this;
          synchronized (var6) {
            wc.field_x = b.field_f;
          }
          this.b((byte) 122);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var2), "fa.J(" + param0 + ')');
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lk.field_a != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != qe.field_B &&
            qe.field_B != this) {
            stackIn_8_0 = qe.field_B.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "fa.getAppletContext()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lk.field_a != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != qe.field_B &&
            this != qe.field_B) {
            stackIn_10_0 = qe.field_B.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "fa.getDocumentBase()");
        }
    }

    private final void a(byte param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Throwable var3_ref = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (jf.field_a) {
              return;
            }
            jf.field_a = true;
          }
          if (qe.field_B != null) {
            qe.field_B.destroy();
          }
          try {
            this.e((byte) 12);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ja.field_h) {
            try {
              ja.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
              ja.field_h.getParent().remove((java.awt.Component) ((Object) ja.field_h));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != oc.field_l) {
            try {
              oc.field_l.b(param0 - 33);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.f((byte) 53);
          if (lk.field_a != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          if (param0 != 33) {
            field_d = (int[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "fa.C(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void f(byte param0);

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          jk dupTemp$0 = null;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          nl var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          int var10 = 0;
          var10 = Chess.field_G;
          try {
            try {
              if (null != nk.field_w) {
                ih.field_O = ih.field_O + 1;
                if (ih.field_O >= 3) {
                  this.a("alreadyloaded", -58);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              tm.field_c = param5;
              sl.field_c = param5;
              nk.field_w = this;
              ka.field_c = 0;
              db.field_p = 0;
              cg.field_a = param3;
              em.field_O = param0;
              hk.field_H = param0;
              ba.field_L = bh.i(81);
              dupTemp$0 = new jk(param4, param2, param6, true);
              oc.field_l = dupTemp$0;
              um.field_g = dupTemp$0;
              var8 = oc.field_l.a(1, true, (Runnable) (this));
              var9 = 75 % ((-48 - param1) / 46);
              while (true) {
                if (var8.field_f == 0) {
                  bc.a(10L, (byte) 62);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              fg.a(var8_ref, (byte) -77, (String) null);
              this.a("crash", -58);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var8_ref2;
            stackIn_23_1 = new StringBuilder().append("fa.L(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw fk.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(byte param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != -53) {
            field_k = (String) null;
          }
          field_d = null;
          field_e = null;
          field_k = null;
          field_j = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) var1), "fa.M(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          b.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("fa.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void c(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = ud.a(2);
          var4 = vj.field_f[qk.field_e];
          vj.field_f[qk.field_e] = var2_long;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            ie.field_a = ((var6_int >> 1) + 32000) / var6_int;
          }
          qk.field_e = qk.field_e + 1 & 31;
          fieldTemp$1 = td.field_p;
          td.field_p = td.field_p + 1;
          if (50 < fieldTemp$1) {
            td.field_p = td.field_p - 50;
            od.field_W = true;
            ja.field_h.setSize(tm.field_c, em.field_O);
            ja.field_h.setVisible(true);
            boolean decompiledSharedTail0 = (null != lk.field_a &&
              null == ec.field_e);
            if (!decompiledSharedTail0) {
              ja.field_h.setLocation(db.field_p, ka.field_c);
              decompiledSharedTail0 = (Chess.field_G != 0);
            }
            if (decompiledSharedTail0) {
              var6 = lk.field_a.getInsets();
              ja.field_h.setLocation(var6.left + db.field_p, var6.top + ka.field_c);
            }
          }
          this.a(true);
          if (param0 < 116) {
            field_e = (km) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "fa.F(" + param0 + ')');
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == nk.field_w &&
            !jf.field_a) {
            mk.field_b = ud.a(2);
            bc.a(5000L, (byte) -92);
            um.field_g = null;
            this.a((byte) 33, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw fk.a((Throwable) ((Object) runtimeException), "fa.destroy()");
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final synchronized void d(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Chess.field_G;
        try {
          if (null != ja.field_h) {
            ja.field_h.removeFocusListener((java.awt.event.FocusListener) (this));
            ja.field_h.getParent().setBackground(java.awt.Color.black);
            ja.field_h.getParent().remove((java.awt.Component) ((Object) ja.field_h));
          }
          boolean decompiledFrameRemainder0 = true;
          if (ec.field_e == null) {
            if (lk.field_a != null) {
              var2 = lk.field_a;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (null == qe.field_B) {
                var2 = nk.field_w;
                if (var4 != 0) {
                  var2 = qe.field_B;
                  var2 = ec.field_e;
                }
              } else {
                var2 = qe.field_B;
                if (var4 != 0) {
                  var2 = ec.field_e;
                }
              }
            }
          } else {
            var2 = ec.field_e;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ja.field_h = (java.awt.Canvas) ((Object) new g((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ja.field_h));
          ja.field_h.setSize(tm.field_c, em.field_O);
          ja.field_h.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == lk.field_a);
          if (!decompiledSharedTail0) {
            ja.field_h.setLocation(db.field_p, ka.field_c);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = lk.field_a.getInsets();
            ja.field_h.setLocation(var3.left + db.field_p, ka.field_c + var3.top);
          }
          ja.field_h.addFocusListener((java.awt.event.FocusListener) (this));
          ja.field_h.requestFocus();
          wc.field_x = true;
          b.field_f = true;
          od.field_W = true;
          hf.field_a = false;
          pj.field_g = ud.a(2);
          if (param0 != 125) {
            field_k = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw fk.a((Throwable) (var2), "fa.O(" + param0 + ')');
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
          if (lk.field_a != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != qe.field_B &&
            this != qe.field_B) {
            stackIn_8_0 = qe.field_B.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("fa.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final boolean a(int param0) {
        return true;
    }

    protected fa() {
        this.field_g = false;
    }

    static {
        field_d = new int[4];
        field_j = new jc();
        field_k = "Back";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
