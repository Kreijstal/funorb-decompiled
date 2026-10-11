/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class ac extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static java.applet.Applet field_c;
    static sb field_k;
    static sb field_n;
    boolean field_g;
    static ba field_h;
    static char[] field_i;
    static volatile int field_e;
    public static int field_m;
    public static boolean field_b;
    public static boolean field_j;
    public static boolean field_a;
    public static boolean field_l;
    public static boolean field_d;
    public static boolean field_f;

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          ej dupTemp$0 = null;
          RuntimeException stackIn_21_0 = null;
          StringBuilder stackIn_21_1 = null;
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var8_int = 0;
          Throwable var8 = null;
          RuntimeException var8_ref = null;
          re var9 = null;
          int var10 = 0;
          var10 = stellarshard.field_B;
          try {
            try {
              var8_int = -5 / ((-44 - param4) / 51);
              if (bc.field_j != null) {
                aj.field_b = aj.field_b + 1;
                if (3 > aj.field_b) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(1, "alreadyloaded");
                return;
              }
              lg.field_d = param3;
              td.field_d = param2;
              dd.field_d = param2;
              bc.field_j = this;
              df.field_c = 0;
              fb.field_f = 0;
              lk.field_j = param5;
              kg.field_H = param5;
              tc.field_u = hf.a((byte) -96);
              dupTemp$0 = new ej(param0, param6, param1, true);
              ic.field_d = dupTemp$0;
              fb.field_d = dupTemp$0;
              var9 = ic.field_d.a((Runnable) (this), 1, 0);
              while (true) {
                if (var9.field_f == 0) {
                  jj.a((byte) -127, 10L);
                  if (var10 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8 = decompiledCaughtException;
              qe.a(-25, (String) null, var8);
              this.a(1, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_21_0 = var8_ref;
            stackIn_21_1 = new StringBuilder().append("ac.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
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
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ah.field_q != null) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != field_c &&
            field_c != this) {
            stackIn_12_0 = field_c.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ac.getAppletContext()");
        }
    }

    final void a(int param0, String param1) {
        try {
          RuntimeException stackIn_17_0 = null;
          StringBuilder stackIn_17_1 = null;
          String stackIn_18_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_g) {
              return;
            }
            if (param0 != 1) {
              field_i = (char[]) null;
            }
            this.field_g = true;
            System.out.println("error_game_" + param1);
            try {
              sh.a("loggedout", hf.a((byte) -7), (byte) 78);
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
            stackIn_17_0 = var3_ref2;
            stackIn_17_1 = new StringBuilder().append("ac.MA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_18_2 = "null";
            } else {
              stackIn_18_2 = "{...}";
            }
            throw ma.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void b(int param0) {
        field_k = null;
        if (param0 >= -25) {
          return;
        }
        try {
          field_n = null;
          field_i = null;
          field_h = null;
          field_c = null;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ac.HA(" + param0 + ')');
        }
    }

    abstract void a(boolean param0);

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
          if (null != ah.field_q) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != field_c &&
            this != field_c) {
            stackIn_10_0 = field_c.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("ac.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("ac.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          field_c = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ac.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        if (bc.field_j != this ||
          qc.field_b) {
          return;
        }
        try {
          gk.field_h = 0L;
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ac.start()");
        }
    }

    abstract void c(byte param0);

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
          stackIn_5_1 = new StringBuilder().append("ac.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    final static int[] d(byte param0) {
        RuntimeException var1 = null;
        int[] stackIn_2_0 = null;
        int[] stackIn_4_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 >= 116) {
            stackIn_4_0 = new int[8];
            return stackIn_4_0;
          }
          stackIn_2_0 = (int[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ac.RA(" + param0 + ')');
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (ah.field_q != null) {
          return null;
        }
        if (null != field_c &&
          field_c != this) {
          return field_c.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void f(byte param0);

    public abstract void init();

    protected ac() {
        this.field_g = false;
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void a(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = ih.a((byte) -98);
          var4 = ce.field_c[qi.field_b];
          ce.field_c[qi.field_b] = var2_long;
          if (var4 != 0L &&
            var4 >= var2_long) {
          }
          qi.field_b = 1 + qi.field_b & 31;
          var6 = this;
          synchronized (var6) {
            ua.field_b = lh.field_f;
            if (param0 >= -102) {
              this.a((byte) 48);
            }
          }
          this.a(48);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "ac.JA(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_64_0 = false;
          int stackIn_77_0 = 0;
          int stackIn_77_1 = 0;
          int stackIn_96_0 = 0;
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
          var5 = stellarshard.field_B;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (ej.field_g != null) {
                var1 = ej.field_g.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = ej.field_r;
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
                    this.a(1, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_64_0 = bh.a(-1, var2.charAt(var3));
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
                      if (rg.a((byte) 19, (CharSequence) ((Object) var4)) &&
                        !(10 <= pf.a((CharSequence) ((Object) var4), (byte) 125))) {
                        this.a(1, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (ej.field_r != null))) {
                stackIn_64_0 = ej.field_r.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_64_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (ej.field_r.length() > var1_int) {
                    var3 = ej.field_r.charAt(var1_int);
                    stackIn_77_0 = ~var3;
                    stackIn_77_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_77_0 <= stackIn_77_1 &&
                      var3 <= 57)) {
                      var2_int = -48 - (-var3 - 10 * var2_int);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_77_0 = var2_int;
                    stackIn_77_1 = 5;
                  }
                  if (stackIn_77_0 < stackIn_77_1) {
                    break;
                  }
                  wl.field_ab = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = bc.field_j;
                if (null != field_c) {
                  var1 = field_c;
                }
                var2_ref = ej.field_w;
                if (null != var2_ref) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                k.a(3);
                this.c(31178);
                pd.field_h = cg.a((java.awt.Component) ((Object) qd.field_j), false, lk.field_j, td.field_d);
                this.a(true);
                rb.field_u = qb.f(-17887);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (gk.field_h != 0L) {
                    stackIn_96_0 = $cfr$lcmp(ih.a((byte) -98), gk.field_h);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_96_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    ol.field_c = rb.field_u.a(ph.field_B, 1);
                    stackIn_96_0 = 0;
                  }
                  var3 = stackIn_96_0;
                  do {
                    if (!(ol.field_c > var3)) {
                      this.e((byte) 56);
                      ni.a(ic.field_d, qd.field_j, -127);
                      break;
                    }
                    this.a((byte) -128);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              qe.a(36, (String) null, (Throwable) (var1));
              this.a(1, "crash");
            }
            this.a(-1, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ma.a((Throwable) (var1), "ac.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static boolean b(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_10_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 107) {
            ac.b(-49);
          }
          stackIn_10_0 = (ja.field_m != null) && (ja.field_m.d(2));
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ac.SA(" + param0 + ')');
        }
    }

    final synchronized void c(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = stellarshard.field_B;
        try {
          if (qd.field_j != null) {
            qd.field_j.removeFocusListener((java.awt.event.FocusListener) (this));
            qd.field_j.getParent().setBackground(java.awt.Color.black);
            qd.field_j.getParent().remove((java.awt.Component) ((Object) qd.field_j));
          }
          boolean decompiledFrameRemainder0 = true;
          if (la.field_L != null) {
            var2 = la.field_L;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (ah.field_q == null) {
              if (null == field_c) {
                var2 = bc.field_j;
                if (var4 != 0) {
                  var2 = field_c;
                  var2 = ah.field_q;
                }
              } else {
                var2 = field_c;
                if (var4 != 0) {
                  var2 = ah.field_q;
                }
              }
            } else {
              var2 = ah.field_q;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          qd.field_j = (java.awt.Canvas) ((Object) new hi((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) qd.field_j));
          qd.field_j.setSize(lk.field_j, td.field_d);
          qd.field_j.setVisible(true);
          if (ah.field_q == var2) {
            var3 = ah.field_q.getInsets();
            qd.field_j.setLocation(fb.field_f + var3.left, df.field_c + var3.top);
            if (var4 != 0) {
              qd.field_j.setLocation(fb.field_f, df.field_c);
            }
          } else {
            qd.field_j.setLocation(fb.field_f, df.field_c);
          }
          qd.field_j.addFocusListener((java.awt.event.FocusListener) (this));
          qd.field_j.requestFocus();
          lh.field_f = true;
          ua.field_b = true;
          of.field_F = true;
          if (param0 != 31178) {
            return;
          }
          tl.field_d = false;
          kk.field_m = ih.a((byte) -98);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ma.a((Throwable) (var2), "ac.KA(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    private final void a(int param0, boolean param1) {
        Exception exception = null;
        Throwable throwable = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        RuntimeException var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (qc.field_b) {
              return;
            }
            qc.field_b = true;
          }
          if (field_c != null) {
            field_c.destroy();
          }
          if (param0 != -1) {
            return;
          }
          try {
            this.f((byte) 100);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != qd.field_j) {
            try {
              qd.field_j.removeFocusListener((java.awt.event.FocusListener) (this));
              qd.field_j.getParent().remove((java.awt.Component) ((Object) qd.field_j));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (ic.field_d != null) {
            try {
              ic.field_d.c(~param0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c((byte) -128);
          if (null != ah.field_q) {
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
          var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var3_ref2), "ac.OA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void d(int param0);

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lh.field_f = true;
          of.field_F = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ac.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (this == bc.field_j &&
            !qc.field_b) {
            of.field_F = true;
            if (wl.field_ab &&
              ih.a((byte) -98) - kk.field_m > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < kg.field_H) {
                  return;
                }
                if (var2.height < dd.field_d) {
                  return;
                }
              }
              tl.field_d = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("ac.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ah.field_q) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != field_c &&
            field_c != this) {
            stackIn_10_0 = field_c.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) var1), "ac.getDocumentBase()");
        }
    }

    final boolean g(byte param0) {
        return true;
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          lh.field_f = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ac.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void e(byte param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          if (param0 != 56) {
            return;
          }
          var2_long = ih.a((byte) -98);
          var4 = vg.field_t[bl.field_b];
          vg.field_t[bl.field_b] = var2_long;
          bl.field_b = bl.field_b + 1 & 31;
          if (var4 != 0L &&
            var2_long > var4) {
          }
          fieldTemp$1 = ab.field_a;
          ab.field_a = ab.field_a + 1;
          if (fieldTemp$1 > 50) {
            ab.field_a = ab.field_a - 50;
            of.field_F = true;
            qd.field_j.setSize(lk.field_j, td.field_d);
            qd.field_j.setVisible(true);
            boolean decompiledSharedTail0 = (null != ah.field_q &&
              la.field_L == null);
            if (!decompiledSharedTail0) {
              qd.field_j.setLocation(fb.field_f, df.field_c);
              decompiledSharedTail0 = (stellarshard.field_B != 0);
            }
            if (decompiledSharedTail0) {
              var6 = ah.field_q.getInsets();
              qd.field_j.setLocation(var6.left + fb.field_f, var6.top + df.field_c);
            }
          }
          this.d(-20880);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "ac.PA(" + param0 + ')');
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == bc.field_j &&
            !qc.field_b) {
            gk.field_h = ih.a((byte) -98);
            jj.a((byte) -127, 5000L);
            fb.field_d = null;
            this.a(-1, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ma.a((Throwable) ((Object) runtimeException), "ac.destroy()");
        }
    }

    public final void stop() {
        if (bc.field_j != this ||
          qc.field_b) {
          return;
        }
        try {
          gk.field_h = 4000L + ih.a((byte) -98);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "ac.stop()");
        }
    }

    abstract void a(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    static {
        field_e = 0;
        field_i = new char[128];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
