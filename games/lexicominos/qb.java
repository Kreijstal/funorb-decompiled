/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class qb extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_m;
    static aj field_d;
    boolean field_g;
    static String field_a;
    static db[] field_o;
    static volatile int field_j;
    static int[] field_b;
    static boolean field_c;
    static int[][] field_l;
    public static boolean field_k;
    public static int field_e;
    public static int field_f;
    public static boolean field_i;
    public static int field_p;
    public static boolean field_h;
    public static boolean field_n;

    public final void start() {
        if (c.field_j != this ||
          ee.field_d) {
          return;
        }
        try {
          rf.field_a = 0L;
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "qb.start()");
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ck.field_d != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (pg.field_b != null &&
            pg.field_b != this) {
            stackIn_8_0 = pg.field_b.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "qb.getAppletContext()");
        }
    }

    public abstract void init();

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          ab dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          ei var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Lexicominos.field_L ? 1 : 0;
          try {
            try {
              if (null != c.field_j) {
                lh.field_u = lh.field_u + 1;
                if (3 > lh.field_u) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a("alreadyloaded", 123);
                return;
              }
              ga.field_c = 0;
              bk.field_d = param3;
              wl.field_m = param3;
              c.field_j = this;
              ef.field_e = 0;
              u.field_sb = param2;
              fi.field_j = param2;
              ki.field_f = param0;
              tg.field_i = kk.c(-14047);
              dupTemp$0 = new ab(param5, param6, param1, true);
              jh.field_a = dupTemp$0;
              pk.field_n = dupTemp$0;
              var8 = jh.field_a.a((Runnable) (this), false, 1);
              while (true) {
                if (var8.field_b == 0) {
                  ge.a(0, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              uj.a((String) null, var8_ref, 1);
              this.a("crash", 82);
            }
            if (param4 < 3) {
              field_a = (String) null;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("qb.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void b(byte param0);

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (c.field_j == this &&
            !ee.field_d) {
            rf.field_a = 4000L + rf.c(0);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) runtimeException), "qb.stop()");
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
            if (param1 <= 66) {
              field_o = (db[]) null;
            }
            try {
              oa.a(true, kk.c(-14047), "loggedout");
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
            stackIn_15_1 = new StringBuilder().append("qb.G(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ld.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = rf.c(param0 - 1);
          var4 = f.field_i[qg.field_c];
          f.field_i[qg.field_c] = var2_long;
          qg.field_c = 31 & qg.field_c + param0;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            ij.field_j = ((var6_int >> 1) + 32000) / var6_int;
          }
          var6 = this;
          synchronized (var6) {
            vi.field_j = rk.field_m;
          }
          this.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ld.a((Throwable) ((Object) runtimeException), "qb.E(" + param0 + ')');
        }
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (ee.field_d) {
              return;
            }
            ee.field_d = true;
          }
          if (pg.field_b != null) {
            pg.field_b.destroy();
          }
          try {
            this.a((byte) 40);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ug.field_y) {
            try {
              ug.field_y.removeFocusListener((java.awt.event.FocusListener) (this));
              ug.field_y.getParent().remove((java.awt.Component) ((Object) ug.field_y));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (jh.field_a != null) {
            try {
              jh.field_a.a(-265);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.b((byte) 79);
          if (ck.field_d != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          if (param1 != -23646) {
            this.windowDeactivated((java.awt.event.WindowEvent) null);
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ld.a((Throwable) ((Object) runtimeException), "qb.B(" + param0 + ',' + param1 + ')');
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
          if (this == c.field_j &&
            !ee.field_d) {
            dl.field_b = true;
            if (eh.field_a &&
              -mk.field_j + rf.c(0) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (fi.field_j > var2.width) {
                  return;
                }
                if (var2.height < wl.field_m) {
                  return;
                }
              }
              rl.field_O = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_23_0 = var2_ref;
          stackIn_23_1 = new StringBuilder().append("qb.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void a(byte param0);

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          rk.field_m = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("qb.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Lexicominos.field_L ? 1 : 0;
        try {
          if (null != ug.field_y) {
            ug.field_y.removeFocusListener((java.awt.event.FocusListener) (this));
            ug.field_y.getParent().setBackground(java.awt.Color.black);
            ug.field_y.getParent().remove((java.awt.Component) ((Object) ug.field_y));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null != hh.field_G) {
            var2 = hh.field_G;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null != ck.field_d) {
              var2 = ck.field_d;
              if (var4 != 0) {
                if (pg.field_b == null) {
                  var2 = c.field_j;
                  var2 = pg.field_b;
                } else {
                  var2 = pg.field_b;
                }
              }
            } else {
              if (pg.field_b == null) {
                var2 = c.field_j;
                if (var4 != 0) {
                  var2 = pg.field_b;
                }
              } else {
                var2 = pg.field_b;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ug.field_y = (java.awt.Canvas) ((Object) new jc((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ug.field_y));
          ug.field_y.setSize(u.field_sb, bk.field_d);
          ug.field_y.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == ck.field_d);
          if (!decompiledSharedTail0) {
            ug.field_y.setLocation(ef.field_e, ga.field_c);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = ck.field_d.getInsets();
            ug.field_y.setLocation(ef.field_e + var3.left, var3.top + ga.field_c);
          }
          ug.field_y.addFocusListener((java.awt.event.FocusListener) (this));
          ug.field_y.requestFocus();
          if (param0 != 467) {
            field_b = (int[]) null;
          }
          rk.field_m = true;
          vi.field_j = true;
          dl.field_b = true;
          rl.field_O = false;
          mk.field_j = rf.c(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) (var2), "qb.J(" + param0 + ')');
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == c.field_j &&
            !ee.field_d) {
            rf.field_a = rf.c(0);
            ge.a(0, 5000L);
            pk.field_n = null;
            this.a(false, -23646);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) runtimeException), "qb.destroy()");
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (ck.field_d != null) {
          return null;
        }
        if (pg.field_b != null &&
          pg.field_b != this) {
          return pg.field_b.getCodeBase();
        }
        return super.getCodeBase();
    }

    final boolean c(int param0) {
        return true;
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
          if (null != ck.field_d) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (pg.field_b != null &&
            pg.field_b != this) {
            stackIn_12_0 = pg.field_b.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("qb.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ck.field_d != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (pg.field_b != null &&
            pg.field_b != this) {
            stackIn_8_0 = pg.field_b.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "qb.getDocumentBase()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          rk.field_m = true;
          dl.field_b = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("qb.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void run() {
        try {
          boolean stackIn_70_0 = false;
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
          var5 = Lexicominos.field_L ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (ab.field_j != null) {
                var1 = ab.field_j.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = ab.field_v;
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
                    this.a("wrongjava", 69);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_70_0 = ne.a((byte) 56, var2.charAt(var3));
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_70_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (bc.a(false, (CharSequence) ((Object) var4)) &&
                        !(si.a((byte) 117, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a("wrongjava", 68);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != ab.field_v))) {
                stackIn_70_0 = ab.field_v.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_70_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (ab.field_v.length() > var1_int) {
                    var3 = ab.field_v.charAt(var1_int);
                    stackIn_83_0 = ~var3;
                    stackIn_83_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 <= stackIn_83_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = 10 * var2_int + var3 - 48;
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
                  eh.field_a = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = c.field_j;
                if (null != pg.field_b) {
                  var1 = pg.field_b;
                }
                var2_ref = ab.field_x;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                na.b((byte) 114);
                this.f(467);
                v.field_B = pj.a(bk.field_d, (byte) 99, u.field_sb, (java.awt.Component) ((Object) ug.field_y));
                this.b(false);
                bg.field_a = v.c(65476);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (rf.field_a != 0L) {
                    stackIn_102_0 = $cfr$lcmp(~rf.c(0), ~rf.field_a);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    jj.field_c = bg.field_a.a((byte) 91, ca.field_h);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(var3 < jj.field_c)) {
                      this.b(24344);
                      ki.a(ug.field_y, jh.field_a, 50);
                      break;
                    }
                    this.a(1);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              uj.a((String) null, (Throwable) (var1), 1);
              this.a("crash", 89);
            }
            this.a(true, -23646);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ld.a((Throwable) (var1), "qb.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    abstract void a(boolean param0);

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
          stackIn_5_1 = new StringBuilder().append("qb.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void b(boolean param0);

    private final void b(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (param0 != 24344) {
            field_o = (db[]) null;
          }
          var2_long = rf.c(param0 - 24344);
          var4 = kj.field_q[gb.field_a];
          kj.field_q[gb.field_a] = var2_long;
          gb.field_a = 31 & gb.field_a + 1;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            tj.field_i = (32000 + (var6_int >> 1)) / var6_int;
          }
          fieldTemp$1 = wj.field_o;
          wj.field_o = wj.field_o + 1;
          if (fieldTemp$1 > 50) {
            dl.field_b = true;
            wj.field_o = wj.field_o - 50;
            ug.field_y.setSize(u.field_sb, bk.field_d);
            ug.field_y.setVisible(true);
            boolean decompiledSharedTail0 = (null != ck.field_d &&
              hh.field_G == null);
            if (!decompiledSharedTail0) {
              ug.field_y.setLocation(ef.field_e, ga.field_c);
              decompiledSharedTail0 = (Lexicominos.field_L);
            }
            if (decompiledSharedTail0) {
              var6 = ck.field_d.getInsets();
              ug.field_y.setLocation(var6.left + ef.field_e, var6.top + ga.field_c);
            }
          }
          this.d(18380);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var2), "qb.A(" + param0 + ')');
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          pg.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("qb.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void d(int param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public static void e(int param0) {
        try {
          field_a = null;
          field_d = null;
          field_b = null;
          field_o = null;
          field_m = null;
          field_l = (int[][]) null;
          if (param0 != 439) {
            qb.provideLoaderApplet((java.applet.Applet) null);
          }
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "qb.H(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("qb.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    protected qb() {
        this.field_g = false;
    }

    static {
        field_m = "Unfortunately your configuration doesn't support fullscreen mode.";
        field_d = new aj(15, 0, 1, 0);
        field_j = 0;
        field_a = "Password is valid";
        field_b = new int[307200];
        field_l = new int[][]{new int[]{464, 469, 473, 475, 475, 472, 471, 468, 469, 471}, new int[]{464, 468, 473, 475, 475, 472, 471, 468, 469, 471}, new int[]{463, 468, 472, 474, 474, 472, 470, 468, 469, 470}, new int[]{462, 467, 472, 474, 474, 471, 470, 467, 468, 469}, new int[]{462, 466, 471, 473, 473, 470, 469, 466, 467, 468}, new int[]{460, 465, 469, 471, 471, 469, 467, 465, 466, 467}, new int[]{459, 464, 468, 470, 470, 468, 466, 464, 465, 466}, new int[]{458, 462, 466, 468, 468, 466, 464, 462, 463, 464}, new int[]{456, 461, 465, 467, 467, 464, 463, 460, 461, 463}, new int[]{454, 459, 463, 465, 465, 462, 461, 459, 460, 461}, new int[]{452, 457, 461, 463, 463, 460, 459, 457, 458, 459}, new int[]{451, 455, 459, 461, 461, 458, 457, 455, 456, 457}, new int[]{449, 453, 457, 459, 459, 456, 455, 453, 454, 455}, new int[]{447, 451, 455, 457, 457, 454, 453, 451, 452, 453}, new int[]{445, 449, 453, 455, 455, 452, 451, 449, 450, 451}, new int[]{443, 447, 451, 453, 453, 451, 449, 447, 448, 449}, new int[]{442, 446, 449, 451, 451, 449, 448, 446, 446, 447}, new int[]{440, 444, 448, 449, 449, 447, 446, 444, 445, 446}, new int[]{439, 443, 446, 448, 448, 446, 445, 443, 443, 444}, new int[]{438, 441, 445, 446, 446, 444, 443, 441, 442, 443}, new int[]{437, 440, 444, 445, 445, 443, 442, 440, 441, 442}, new int[]{436, 439, 443, 444, 444, 442, 441, 439, 440, 441}, new int[]{435, 439, 442, 444, 444, 442, 440, 439, 439, 440}, new int[]{435, 438, 441, 443, 443, 441, 440, 438, 439, 440}, new int[]{434, 438, 441, 443, 443, 441, 440, 438, 439, 439}, new int[]{434, 438, 441, 443, 443, 441, 440, 438, 438, 439}, new int[]{434, 438, 441, 443, 443, 441, 440, 438, 439, 439}, new int[]{435, 438, 441, 443, 443, 441, 440, 438, 439, 440}, new int[]{435, 439, 442, 444, 444, 442, 440, 439, 439, 440}, new int[]{436, 439, 443, 444, 444, 442, 441, 439, 440, 441}, new int[]{437, 440, 444, 445, 445, 443, 442, 440, 441, 442}, new int[]{438, 441, 445, 446, 446, 444, 443, 441, 442, 443}, new int[]{439, 443, 446, 448, 448, 446, 445, 443, 443, 444}, new int[]{440, 444, 448, 449, 449, 447, 446, 444, 445, 446}, new int[]{442, 446, 449, 451, 451, 449, 448, 446, 446, 447}, new int[]{443, 447, 451, 453, 453, 451, 449, 447, 448, 449}, new int[]{445, 449, 453, 455, 455, 452, 451, 449, 450, 451}, new int[]{447, 451, 455, 457, 457, 454, 453, 451, 452, 453}, new int[]{449, 453, 457, 459, 459, 456, 455, 453, 454, 455}, new int[]{451, 455, 459, 461, 461, 458, 457, 455, 456, 457}, new int[]{452, 457, 461, 463, 463, 460, 459, 457, 458, 459}};
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
