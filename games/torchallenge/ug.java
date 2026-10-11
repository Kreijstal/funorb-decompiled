/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class ug extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static pd[] field_i;
    static String field_a;
    static boolean field_p;
    static int field_o;
    private static int field_j;
    static int[] field_e;
    static dg field_n;
    static eg field_f;
    boolean field_g;
    public static int field_k;
    public static boolean field_l;
    public static boolean field_d;
    public static boolean field_b;
    public static int field_c;
    public static boolean field_m;
    public static boolean field_h;

    final synchronized void e(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param0 >= -61) {
            field_o = -101;
          }
          if (bg.field_P != null) {
            bg.field_P.removeFocusListener((java.awt.event.FocusListener) (this));
            bg.field_P.getParent().setBackground(java.awt.Color.black);
            bg.field_P.getParent().remove((java.awt.Component) ((Object) bg.field_P));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == nk.field_d) {
            if (gi.field_b != null) {
              var2 = gi.field_b;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (aj.field_g != null) {
                var2 = aj.field_g;
                if (var4 != 0) {
                  var2 = mj.field_c;
                  var2 = nk.field_d;
                }
              } else {
                var2 = mj.field_c;
                if (var4 != 0) {
                  var2 = nk.field_d;
                }
              }
            }
          } else {
            var2 = nk.field_d;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          bg.field_P = (java.awt.Canvas) ((Object) new pk((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) bg.field_P));
          bg.field_P.setSize(sd.field_c, fl.field_v);
          bg.field_P.setVisible(true);
          if (var2 == gi.field_b) {
            var3 = gi.field_b.getInsets();
            bg.field_P.setLocation(ra.field_g + var3.left, bc.field_d + var3.top);
            if (var4 != 0) {
              bg.field_P.setLocation(ra.field_g, bc.field_d);
            }
          } else {
            bg.field_P.setLocation(ra.field_g, bc.field_d);
          }
          bg.field_P.addFocusListener((java.awt.event.FocusListener) (this));
          bg.field_P.requestFocus();
          c.field_a = true;
          m.field_d = true;
          je.field_f = true;
          sa.field_c = false;
          hc.field_R = ol.a(256);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) (var2), "ug.V(" + param0 + ')');
        }
    }

    final static void a(int param0) {
        try {
          if (param0 != -13) {
            ug.a(-72, (byte) 117, (int[]) null, -82, -38, 20, -70, -121, 2, -97);
          }
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ug.U(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
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
          var5 = TorChallenge.field_F ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != uj.field_j) {
                var1 = uj.field_j.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = uj.field_n;
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
                    this.a((byte) -126, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = qb.a(var2.charAt(var3), true);
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
                      if (ei.a((byte) -117, (CharSequence) ((Object) var4)) &&
                        !(qh.a((CharSequence) ((Object) var4), (byte) -85) >= 10)) {
                        this.a((byte) -116, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != uj.field_n))) {
                stackIn_68_0 = uj.field_n.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < uj.field_n.length()) {
                    var3 = uj.field_n.charAt(var1_int);
                    stackIn_81_0 = 48;
                    stackIn_81_1 = var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 <= stackIn_81_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = -48 + var3 + 10 * var2_int;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = ~var2_int;
                    stackIn_81_1 = -6;
                  }
                  if (stackIn_81_0 > stackIn_81_1) {
                    break;
                  }
                  ah.field_h = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = mj.field_c;
                if (null != aj.field_g) {
                  var1 = aj.field_g;
                }
                var2_ref = uj.field_o;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ef.a((byte) 88);
                this.e(-87);
                la.field_f = dk.a(fl.field_v, (java.awt.Component) ((Object) bg.field_P), -124, sd.field_c);
                this.d(-117);
                hl.field_b = ac.a(true);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (vd.field_a != 0L) {
                    stackIn_100_0 = $cfr$lcmp(~vd.field_a, ~ol.a(256));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    k.field_g = hl.field_b.a((byte) -12, cj.field_i);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(k.field_g > var3)) {
                      this.g(-30261);
                      hd.a(119, sh.field_u, bg.field_P);
                      break;
                    }
                    this.c(126);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              td.a((String) null, (Throwable) (var1), (byte) -128);
              this.a((byte) -127, "crash");
            }
            this.a(0, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw oj.a((Throwable) (var1), "ug.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void g(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        long var2_long = 0L;
        RuntimeException var2 = null;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          var2_long = ol.a(param0 + 30517);
          var4 = cj.field_l[nk.field_e];
          cj.field_l[nk.field_e] = var2_long;
          if (param0 != -30261) {
            field_j = 67;
          }
          nk.field_e = nk.field_e + 1 & 31;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            oh.field_e = ((var6_int >> 1) + 32000) / var6_int;
          }
          fieldTemp$0 = lg.field_c;
          lg.field_c = lg.field_c + 1;
          if (fieldTemp$0 > 50) {
            je.field_f = true;
            lg.field_c = lg.field_c - 50;
            bg.field_P.setSize(sd.field_c, fl.field_v);
            bg.field_P.setVisible(true);
            if (null != gi.field_b &&
              nk.field_d == null) {
              var6 = gi.field_b.getInsets();
              bg.field_P.setLocation(var6.left + ra.field_g, bc.field_d + var6.top);
              if (TorChallenge.field_F) {
                bg.field_P.setLocation(ra.field_g, bc.field_d);
              }
            } else {
              bg.field_P.setLocation(ra.field_g, bc.field_d);
            }
          }
          this.f(param0 ^ -26805);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var2), "ug.R(" + param0 + ')');
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (this == mj.field_c &&
            !jf.field_rb) {
            je.field_f = true;
            if (ah.field_h &&
              -hc.field_R + ol.a(256) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < kd.field_r) {
                  return;
                }
                if (var2.height < bk.field_i) {
                  return;
                }
              }
              sa.field_c = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("ug.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static void a(int param0, lj param1) {
        wg var2 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          wg.b(param1.a(-2, "", "headers.packvorbis"));
          if (param0 != 0) {
            field_i = (pd[]) null;
          }
          var2 = wg.a(param1, "jagex logo2.packvorbis", "");
          var2.c();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_8_0 = var2_ref;
          stackIn_8_1 = new StringBuilder().append("ug.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          aj.field_g = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ug.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != gi.field_b) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (aj.field_g != null &&
            aj.field_g != this) {
            stackIn_8_0 = aj.field_g.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ug.getDocumentBase()");
        }
    }

    abstract void b(int param0);

    final void a(byte param0, String param1) {
        try {
          Throwable throwable = null;
          Exception exception = null;
          RuntimeException runtimeException = null;
          RuntimeException stackIn_16_0 = null;
          StringBuilder stackIn_16_1 = null;
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_g) {
              return;
            }
            this.field_g = true;
            System.out.println("error_game_" + param1);
            try {
              ff.a("loggedout", gi.b(12476), 20511);
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
            if (param0 > -98) {
              this.d((byte) 48);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            runtimeException = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_16_0 = runtimeException;
            stackIn_16_1 = new StringBuilder().append("ug.AA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void d(byte param0);

    abstract void f(int param0);

    public abstract void init();

    abstract void b(byte param0);

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          c.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ug.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, String param1, int param2, int param3, int param4, int param5, int param6) {
        try {
          uj dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          mi var9 = null;
          int var10 = 0;
          var10 = TorChallenge.field_F ? 1 : 0;
          try {
            try {
              if (mj.field_c != null) {
                ih.field_J = ih.field_J + 1;
                if (ih.field_J < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a((byte) -127, "alreadyloaded");
                return;
              }
              ra.field_g = 0;
              ae.field_k = param5;
              fl.field_v = param0;
              bk.field_i = param0;
              sd.field_c = param3;
              kd.field_r = param3;
              var8_int = 111 / ((-79 - param2) / 46);
              mj.field_c = this;
              bc.field_d = 0;
              li.field_O = gi.b(12476);
              dupTemp$0 = new uj(param4, param1, param6, true);
              sh.field_u = dupTemp$0;
              u.field_a = dupTemp$0;
              var9 = sh.field_u.a((Runnable) (this), true, 1);
              while (true) {
                if (var9.field_d == 0) {
                  c.a(-123, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              td.a((String) null, var8, (byte) -69);
              this.a((byte) -124, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("ug.BA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw oj.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6 = 0;
        Throwable decompiledCaughtException = null;
        Object var7 = null;
        try {
          var2_long = ol.a(256);
          var4 = ij.field_A[field_j];
          ij.field_A[field_j] = var2_long;
          var6 = -48 % ((param0 - 82) / 42);
          field_j = field_j + 1 & 31;
          if (0L != var4 &&
            var4 < var2_long) {
          }
          var7 = this;
          synchronized (var7) {
            m.field_d = c.field_a;
          }
          this.d((byte) 119);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "ug.S(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

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
          stackIn_5_1 = new StringBuilder().append("ug.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final boolean c(byte param0) {
        return true;
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gi.field_b != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (aj.field_g != null &&
            this != aj.field_g) {
            stackIn_12_0 = aj.field_g.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var1), "ug.getAppletContext()");
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (gi.field_b != null) {
          return null;
        }
        if (null != aj.field_g &&
          this != aj.field_g) {
          return aj.field_g.getCodeBase();
        }
        return super.getCodeBase();
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
            if (jf.field_rb) {
              return;
            }
            jf.field_rb = true;
          }
          if (aj.field_g != null) {
            aj.field_g.destroy();
          }
          if (param0 != 0) {
            field_p = true;
          }
          try {
            this.b(55);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != bg.field_P) {
            try {
              bg.field_P.removeFocusListener((java.awt.event.FocusListener) (this));
              bg.field_P.getParent().remove((java.awt.Component) ((Object) bg.field_P));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (sh.field_u != null) {
            try {
              sh.field_u.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.b((byte) 114);
          if (null != gi.field_b) {
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
          throw oj.a((Throwable) ((Object) runtimeException), "ug.EA(" + param0 + ',' + param1 + ')');
        }
    }

    final static void a(int param0, byte param1, int[] param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var10 = null;
        RuntimeException var10_ref = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = TorChallenge.field_F ? 1 : 0;
        try {
          while (true) {
            param5--;
            if (param5 >= 0) {
              var10 = param2;
              var11 = param6;
              var12 = param8;
              var13 = param0;
              var14 = param9;
              var15 = var10[var11] >> 1 & 8355711;
              var10[var11] = var15 + jh.a(var14 >> 17, 255) + ((jh.a(var12, 33423361) >> 1) + jh.a(var13 >> 9, 65280));
              param8 = param8 + param3;
              param0 = param0 + param4;
              param9 = param9 + param7;
              param6++;
              if (var16 != 0) {
                return;
              }
              continue;
            }
            break;
          }
          if (param1 >= -26) {
            ug.a(-77, (lj) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_13_0 = var10_ref;
          stackIn_13_1 = new StringBuilder().append("ug.Q(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("ug.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_2_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gi.field_b != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != aj.field_g &&
            this != aj.field_g) {
            stackIn_10_0 = aj.field_g.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ug.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (mj.field_c == this &&
            !jf.field_rb) {
            vd.field_a = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "ug.start()");
        }
    }

    public static void a(byte param0) {
        field_n = null;
        field_f = null;
        field_a = null;
        field_e = null;
        if (param0 != -57) {
          return;
        }
        try {
          field_i = null;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ug.DA(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          c.field_a = true;
          je.field_f = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ug.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == mj.field_c &&
            !jf.field_rb) {
            vd.field_a = ol.a(256) + 4000L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "ug.stop()");
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (mj.field_c == this &&
            !jf.field_rb) {
            vd.field_a = ol.a(256);
            c.a(79, 5000L);
            u.field_a = null;
            this.a(0, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) runtimeException), "ug.destroy()");
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final static String a(CharSequence param0, boolean param1, int param2) {
        String stackIn_5_0 = null;
        String stackIn_13_0 = null;
        String stackIn_21_0 = null;
        String stackIn_29_0 = null;
        boolean stackIn_33_0 = false;
        String stackIn_46_0 = null;
        int stackIn_49_0 = 0;
        String stackIn_52_0 = null;
        Object stackIn_54_0 = null;
        RuntimeException stackIn_58_0 = null;
        StringBuilder stackIn_58_1 = null;
        String stackIn_59_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_32_0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        String var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          if (null == param0) {
            stackIn_5_0 = le.field_b;
            return stackIn_5_0;
          }
          var3_int = param0.length();
          var4 = -5 / ((5 - param2) / 53);
          if (var3_int >= 1 &&
            var3_int <= 12) {
            var5 = il.a(param0, (byte) 21);
            if (var5 != null &&
              var5.length() >= 1) {
              if (!ak.a(95, var5.charAt(0)) &&
                !ak.a(95, var5.charAt(var5.length() - 1))) {
                var6 = 0;
                var7 = 0;
                boolean decompiledNaturalLoopExit0 = false;
                while (!(decompiledNaturalLoopExit0 = (!(param0.length() > var7)))) {
                  var8 = param0.charAt(var7);
                  stackOut_32_0 = ak.a(95, (char) var8);
                  stackIn_49_0 = stackOut_32_0 ? 1 : 0;
                  stackIn_33_0 = stackOut_32_0;
                  if (var9 == 0) {
                    if (!stackIn_33_0) {
                      var6 = 0;
                    } else {
                      var6++;
                    }
                    if (var6 >= 2 &&
                      !param1) {
                      stackIn_46_0 = a.field_b;
                      return stackIn_46_0;
                    }
                    var7++;
                    continue;
                  }
                  break;
                }
                if (decompiledNaturalLoopExit0) {
                  stackIn_49_0 = var6;
                }
                if (stackIn_49_0 > 0) {
                  stackIn_52_0 = ng.field_E;
                  return stackIn_52_0;
                }
                stackIn_54_0 = null;
                return (String) (stackIn_54_0);
              }
              stackIn_29_0 = ng.field_E;
              return stackIn_29_0;
            }
            stackIn_21_0 = le.field_b;
            return stackIn_21_0;
          }
          stackIn_13_0 = le.field_b;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_58_0 = var3;
          stackIn_58_1 = new StringBuilder().append("ug.CA(");
          if (param0 == null) {
            stackIn_59_2 = "null";
          } else {
            stackIn_59_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_58_0), ((StringBuilder) (Object) stackIn_58_1).append(stackIn_59_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    protected ug() {
        this.field_g = false;
    }

    static {
        field_a = "Connection lost. <%0>";
        field_p = false;
        field_o = 0;
        field_i = new pd[16];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
