/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class dc extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static aj field_e;
    static int[] field_k;
    static String field_g;
    boolean field_d;
    public static int field_b;
    public static int field_c;
    public static int field_a;
    public static boolean field_j;
    public static boolean field_i;
    public static int field_h;
    public static boolean field_f;

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != gk.field_c) {
          return null;
        }
        if (bd.field_c != null &&
          bd.field_c != this) {
          return bd.field_c.getCodeBase();
        }
        return super.getCodeBase();
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
          var5 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (dl.field_l != null) {
                var1 = dl.field_l.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = dl.field_c;
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
                    this.a("wrongjava", (byte) -128);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var2.length() > var3) {
                      stackIn_68_0 = e.a(30, var2.charAt(var3));
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
                      if (fi.a((CharSequence) ((Object) var4), 10) &&
                        !(10 <= dc.a((CharSequence) ((Object) var4), 126))) {
                        this.a("wrongjava", (byte) -121);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != dl.field_c))) {
                stackIn_68_0 = dl.field_c.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (dl.field_c.length() > var1_int) {
                    var3 = dl.field_c.charAt(var1_int);
                    stackIn_81_0 = ~var3;
                    stackIn_81_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 <= stackIn_81_1 &&
                      57 >= var3)) {
                      var2_int = 10 * var2_int + (-48 + var3);
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
                  an.field_l = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ug.field_k;
                if (bd.field_c != null) {
                  var1 = bd.field_c;
                }
                var2_ref = dl.field_f;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                ee.b(true);
                this.a(-11232);
                ce.field_m = se.a(o.field_r, (java.awt.Component) ((Object) on.field_c), co.field_c, (byte) -123);
                this.e((byte) -116);
                tg.field_e = ki.e((byte) -126);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (wd.field_b != 0L) {
                    stackIn_100_0 = $cfr$lcmp(~wd.field_b, ~qj.b(-26572));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 >= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    e.field_Q = tg.field_e.a(fd.field_d, -1);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(var3 < e.field_Q)) {
                      this.b(85);
                      mb.a(-94, on.field_c, fi.field_d);
                      break;
                    }
                    this.b((byte) -123);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              jh.a((Throwable) (var1), (String) null, (byte) 20);
              this.a("crash", (byte) -126);
            }
            this.a(true, 116);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw aa.a((Throwable) (var1), "dc.run()");
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
          if (this == ug.field_k &&
            !jg.field_r) {
            wd.field_b = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "dc.start()");
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (ug.field_k == this &&
            !jg.field_r) {
            hj.field_d = true;
            if (an.field_l &&
              1000L < qj.b(-26572) - oo.field_s) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < tn.field_Eb) {
                  return;
                }
                if (wh.field_c > var2.height) {
                  return;
                }
              }
              jm.field_j = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_22_0 = var2_ref;
          stackIn_22_1 = new StringBuilder().append("dc.paint(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    abstract void d(byte param0);

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gk.field_c != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (bd.field_c != null &&
            bd.field_c != this) {
            stackIn_8_0 = bd.field_c.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "dc.getAppletContext()");
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
          bd.field_c = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dc.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(String param0, byte param1) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_d) {
              return;
            }
            this.field_d = true;
            System.out.println("error_game_" + param0);
            try {
              ei.a(cd.e(126), 114, "loggedout");
              if (param1 >= -115) {
                field_k = (int[]) null;
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
            stackIn_15_1 = new StringBuilder().append("dc.F(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public static void a(boolean param0) {
        field_g = null;
        field_k = null;
        if (param0) {
          return;
        }
        try {
          field_e = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dc.K(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean a(byte param0) {
        return true;
    }

    abstract void b(boolean param0);

    public final void destroy() {
        if (ug.field_k != this ||
          jg.field_r) {
          return;
        }
        try {
          wd.field_b = qj.b(-26572);
          ao.a(5000L, 1);
          rb.field_k = null;
          this.a(false, -29);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dc.destroy()");
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          k.field_c = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dc.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void a(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (null != on.field_c) {
            on.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
            on.field_c.getParent().setBackground(java.awt.Color.black);
            on.field_c.getParent().remove((java.awt.Component) ((Object) on.field_c));
          }
          boolean decompiledFrameRemainder0 = true;
          if (in.field_Eb == null) {
            if (gk.field_c != null) {
              var2 = gk.field_c;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (bd.field_c != null) {
                var2 = bd.field_c;
                if (var4 != 0) {
                  var2 = ug.field_k;
                  var2 = in.field_Eb;
                }
              } else {
                var2 = ug.field_k;
                if (var4 != 0) {
                  var2 = in.field_Eb;
                }
              }
            }
          } else {
            var2 = in.field_Eb;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          on.field_c = (java.awt.Canvas) ((Object) new jh((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) on.field_c));
          on.field_c.setSize(o.field_r, co.field_c);
          on.field_c.setVisible(true);
          if (gk.field_c == var2) {
            var3 = gk.field_c.getInsets();
            on.field_c.setLocation(ta.field_e + var3.left, var3.top + ge.field_i);
            if (var4 != 0) {
              on.field_c.setLocation(ta.field_e, ge.field_i);
            }
          } else {
            on.field_c.setLocation(ta.field_e, ge.field_i);
          }
          on.field_c.addFocusListener((java.awt.event.FocusListener) (this));
          on.field_c.requestFocus();
          k.field_c = true;
          ie.field_Pb = true;
          hj.field_d = true;
          if (param0 != -11232) {
            this.b(true);
          }
          jm.field_j = false;
          oo.field_s = qj.b(-26572);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (var2), "dc.M(" + param0 + ')');
        }
    }

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = qj.b(-26572);
          var4 = rl.field_l[p.field_e];
          rl.field_l[p.field_e] = var2_long;
          if (0L != var4 &&
            var4 >= var2_long) {
          }
          p.field_e = 1 + p.field_e & 31;
          fieldTemp$1 = om.field_H;
          om.field_H = om.field_H + 1;
          if (fieldTemp$1 > 50) {
            hj.field_d = true;
            om.field_H = om.field_H - 50;
            on.field_c.setSize(o.field_r, co.field_c);
            on.field_c.setVisible(true);
            if (null != gk.field_c &&
              in.field_Eb == null) {
              var6 = gk.field_c.getInsets();
              on.field_c.setLocation(var6.left + ta.field_e, var6.top + ge.field_i);
              if (ArcanistsMulti.field_G) {
                on.field_c.setLocation(ta.field_e, ge.field_i);
              }
            } else {
              on.field_c.setLocation(ta.field_e, ge.field_i);
            }
          }
          this.c((byte) -89);
          if (param0 < 55) {
            this.getCodeBase();
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "dc.I(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          k.field_c = true;
          hj.field_d = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("dc.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static int a(CharSequence param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 < 125) {
            field_e = (aj) null;
          }
          stackIn_4_0 = fn.a(true, (byte) -40, param0, 10);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_8_0 = var2;
          stackIn_8_1 = new StringBuilder().append("dc.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gk.field_c != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != bd.field_c &&
            this != bd.field_c) {
            stackIn_10_0 = bd.field_c.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "dc.getDocumentBase()");
        }
    }

    abstract void c(byte param0);

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var4 = 0;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            var4 = -120 % ((63 - param1) / 36);
            if (jg.field_r) {
              return;
            }
            jg.field_r = true;
          }
          if (bd.field_c != null) {
            bd.field_c.destroy();
          }
          try {
            this.d((byte) -124);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (on.field_c != null) {
            try {
              on.field_c.removeFocusListener((java.awt.event.FocusListener) (this));
              on.field_c.getParent().remove((java.awt.Component) ((Object) on.field_c));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != fi.field_d) {
            try {
              fi.field_d.a(-124);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.b(true);
          if (null != gk.field_c) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "dc.D(" + param0 + ',' + param1 + ')');
        }
    }

    public final void stop() {
        if (ug.field_k != this ||
          jg.field_r) {
          return;
        }
        try {
          wd.field_b = 4000L + qj.b(-26572);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "dc.stop()");
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
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
          stackIn_5_1 = new StringBuilder().append("dc.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void b(byte param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          var2_long = qj.b(-26572);
          var4 = kn.field_tb[qo.field_e];
          kn.field_tb[qo.field_e] = var2_long;
          if (param0 > -59) {
            return;
          }
          qo.field_e = 31 & qo.field_e + 1;
          if (0L != var4 &&
            var4 >= var2_long) {
          }
          var6 = this;
          synchronized (var6) {
            ie.field_Pb = k.field_c;
          }
          this.f((byte) 49);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var2), "dc.H(" + param0 + ')');
        }
    }

    abstract void e(byte param0);

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          dl dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          og var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = ArcanistsMulti.field_G ? 1 : 0;
          try {
            try {
              if (null != ug.field_k) {
                kg.field_b = kg.field_b + 1;
                if (kg.field_b < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", (byte) -121);
                return;
              }
              ug.field_k = this;
              if (param3 != 11431) {
                field_k = (int[]) null;
              }
              ji.field_g = param4;
              ta.field_e = 0;
              o.field_r = param1;
              tn.field_Eb = param1;
              co.field_c = param5;
              wh.field_c = param5;
              ge.field_i = 0;
              hh.field_e = cd.e(104);
              dupTemp$0 = new dl(param0, param2, param6, true);
              fi.field_d = dupTemp$0;
              rb.field_k = dupTemp$0;
              var8 = fi.field_d.a(127, 1, (Runnable) (this));
              while (true) {
                if (var8.field_e == 0) {
                  ao.a(10L, 1);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              jh.a(var8_ref, (String) null, (byte) 20);
              this.a("crash", (byte) -119);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("dc.J(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
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
          if (gk.field_c != null) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != bd.field_c &&
            this != bd.field_c) {
            stackIn_12_0 = bd.field_c.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("dc.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    abstract void f(byte param0);

    protected dc() {
        this.field_d = false;
    }

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
          stackIn_5_1 = new StringBuilder().append("dc.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    static {
        field_k = new int[8192];
        field_g = "Since you are doing so well, try your abilities against Larry, Curly and Moe, the three resident cyclopes.";
        field_e = new aj(15, 0, 1, 0);
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
