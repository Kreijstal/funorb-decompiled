/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class tn extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String[] field_k;
    static String field_m;
    static String[] field_n;
    static String field_f;
    static int field_i;
    static int[] field_j;
    boolean field_c;
    static int field_o;
    static String field_d;
    public static int field_l;
    public static int field_h;
    public static boolean field_g;
    public static boolean field_b;
    public static int field_a;
    public static int field_e;
    public static boolean field_p;

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
          var5 = Pixelate.field_H ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (cb.field_o != null) {
                var1 = cb.field_o.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = cb.field_l;
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
                    this.a(-18310, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = ti.a(89, var2.charAt(var3));
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
                      if (td.a(-128, (CharSequence) ((Object) var4)) &&
                        !(na.a((CharSequence) ((Object) var4), (byte) -33) >= 10)) {
                        this.a(-18310, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (cb.field_l != null))) {
                stackIn_68_0 = cb.field_l.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (cb.field_l.length() > var1_int) {
                    var3 = cb.field_l.charAt(var1_int);
                    stackIn_81_0 = ~var3;
                    stackIn_81_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_81_0 <= stackIn_81_1 &&
                      57 >= var3)) {
                      var2_int = var2_int * 10 - (48 - var3);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_81_0 = -6;
                    stackIn_81_1 = ~var2_int;
                  }
                  if (stackIn_81_0 < stackIn_81_1) {
                    break;
                  }
                  il.field_g = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = ne.field_I;
                if (null != bd.field_b) {
                  var1 = bd.field_b;
                }
                var2_ref = cb.field_j;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                gh.a((byte) 90);
                this.a(-27106);
                qa.field_f = vk.a(wp.field_c, -88, (java.awt.Component) ((Object) ec.field_u), uo.field_i);
                this.a((byte) -15);
                gn.field_y = rj.j(-30272);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (bf.field_m != 0L) {
                    stackIn_100_0 = $cfr$lcmp(~hm.a(64), ~bf.field_m);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    id.field_b = gn.field_y.a((byte) 42, wa.field_b);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(var3 < id.field_b)) {
                      this.e(-1);
                      fm.a(mc.field_k, ec.field_u, (byte) -52);
                      break;
                    }
                    this.f(5176);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              jo.a(1, (String) null, (Throwable) (var1));
              this.a(-18310, "crash");
            }
            this.a(true, -238);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw aa.a((Throwable) (var1), "tn.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          stackIn_5_1 = new StringBuilder().append("tn.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void d(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (eg.field_j != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (bd.field_b != null &&
            bd.field_b != this) {
            stackIn_12_0 = bd.field_b.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "tn.getDocumentBase()");
        }
    }

    private final void e(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = hm.a(64);
          var4 = rh.field_x[la.field_b];
          rh.field_x[la.field_b] = var2_long;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(var2_long - var4);
            kk.field_k = ((var6_int >> 1) + 32000) / var6_int;
          }
          la.field_b = la.field_b - param0 & 31;
          fieldTemp$1 = oh.field_e;
          oh.field_e = oh.field_e + 1;
          if (50 < fieldTemp$1) {
            oh.field_e = oh.field_e - 50;
            sn.field_s = true;
            ec.field_u.setSize(uo.field_i, wp.field_c);
            ec.field_u.setVisible(true);
            boolean decompiledSharedTail0 = (eg.field_j != null &&
              eg.field_i == null);
            if (!decompiledSharedTail0) {
              ec.field_u.setLocation(ae.field_a, mc.field_m);
              decompiledSharedTail0 = (Pixelate.field_H);
            }
            if (decompiledSharedTail0) {
              var6 = eg.field_j.getInsets();
              ec.field_u.setLocation(var6.left + ae.field_a, var6.top + mc.field_m);
            }
          }
          this.d(124);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "tn.QA(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("tn.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public abstract void init();

    final void a(int param0, byte param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          cb dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          ei var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Pixelate.field_H ? 1 : 0;
          try {
            try {
              if (null != ne.field_I) {
                ki.field_j = ki.field_j + 1;
                if (ki.field_j < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(param1 - 18206, "alreadyloaded");
                return;
              }
              ne.field_I = this;
              ae.field_a = 0;
              uo.field_i = param2;
              gk.field_ib = param2;
              wp.field_c = param0;
              de.field_j = param0;
              jh.field_M = param4;
              mc.field_m = 0;
              qm.field_L = ao.a(13867);
              dupTemp$0 = new cb(param6, param5, param3, true);
              mc.field_k = dupTemp$0;
              fp.field_c = dupTemp$0;
              var8 = mc.field_k.a(1, (Runnable) (this), (byte) -123);
              do {
                if (var8.field_b != 0) {
                  if (param1 != -104) {
                    field_o = 50;
                  }
                  break;
                }
                vg.a(10L, (byte) 23);
              } while (var9 == 0);
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              jo.a(1, (String) null, var8_ref);
              this.a(-18310, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("tn.UA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void f(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = hm.a(64);
          if (param0 != 5176) {
            this.update((java.awt.Graphics) null);
          }
          var4 = gf.field_a[wf.field_b];
          gf.field_a[wf.field_b] = var2_long;
          if (var4 != 0L &&
            var2_long <= var4) {
          }
          wf.field_b = 31 & 1 + wf.field_b;
          var6 = this;
          synchronized (var6) {
            ro.field_d = kn.field_K;
          }
          this.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "tn.PA(" + param0 + ')');
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (this == ne.field_I &&
            !si.field_U) {
            sn.field_s = true;
            if (il.field_g &&
              hm.a(64) - um.field_m > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (gk.field_ib > var2.width) {
                  return;
                }
                if (var2.height < de.field_j) {
                  return;
                }
              }
              wl.field_i = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("tn.paint(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (ne.field_I != this ||
          si.field_U) {
          return;
        }
        try {
          bf.field_m = 0L;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tn.start()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kn.field_K = true;
          sn.field_s = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("tn.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
            if (param0 != -18310) {
              this.a((byte) -44);
            }
            if (this.field_c) {
              return;
            }
            this.field_c = true;
            System.out.println("error_game_" + param1);
            try {
              cq.a("loggedout", (byte) -84, ao.a(13867));
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
            stackIn_16_1 = new StringBuilder().append("tn.OA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw aa.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == ne.field_I &&
            !si.field_U) {
            bf.field_m = hm.a(64);
            vg.a(5000L, (byte) 23);
            fp.field_c = null;
            this.a(false, -238);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) runtimeException), "tn.destroy()");
        }
    }

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        RuntimeException var3_ref3 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (si.field_U) {
              return;
            }
            if (param1 != -238) {
              field_k = (String[]) null;
            }
            si.field_U = true;
          }
          if (bd.field_b != null) {
            bd.field_b.destroy();
          }
          try {
            this.b(-90);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (ec.field_u != null) {
            try {
              ec.field_u.removeFocusListener((java.awt.event.FocusListener) (this));
              ec.field_u.getParent().remove((java.awt.Component) ((Object) ec.field_u));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != mc.field_k) {
            try {
              mc.field_k.a(-1204);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.c(23118);
          if (eg.field_j != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              var3_ref2 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          var3_ref3 = (RuntimeException) (Object) decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var3_ref3), "tn.SA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void a(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (ec.field_u != null) {
            ec.field_u.removeFocusListener((java.awt.event.FocusListener) (this));
            ec.field_u.getParent().setBackground(java.awt.Color.black);
            ec.field_u.getParent().remove((java.awt.Component) ((Object) ec.field_u));
          }
          boolean decompiledFrameRemainder0 = true;
          if (null == eg.field_i) {
            if (null != eg.field_j) {
              var2 = eg.field_j;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (bd.field_b == null) {
                var2 = ne.field_I;
                if (var4 != 0) {
                  var2 = bd.field_b;
                  var2 = eg.field_i;
                }
              } else {
                var2 = bd.field_b;
                if (var4 != 0) {
                  var2 = eg.field_i;
                }
              }
            }
          } else {
            var2 = eg.field_i;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ec.field_u = (java.awt.Canvas) ((Object) new hk((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ec.field_u));
          ec.field_u.setSize(uo.field_i, wp.field_c);
          ec.field_u.setVisible(true);
          if (var2 == eg.field_j) {
            var3 = eg.field_j.getInsets();
            ec.field_u.setLocation(ae.field_a + var3.left, var3.top + mc.field_m);
            if (var4 != 0) {
              ec.field_u.setLocation(ae.field_a, mc.field_m);
            }
          } else {
            ec.field_u.setLocation(ae.field_a, mc.field_m);
          }
          ec.field_u.addFocusListener((java.awt.event.FocusListener) (this));
          ec.field_u.requestFocus();
          kn.field_K = true;
          ro.field_d = true;
          if (param0 != -27106) {
            return;
          }
          sn.field_s = true;
          wl.field_i = false;
          um.field_m = hm.a(64);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw aa.a((Throwable) (var2), "tn.VA(" + param0 + ')');
        }
    }

    abstract void b(int param0);

    public final void stop() {
        if (ne.field_I != this ||
          si.field_U) {
          return;
        }
        try {
          bf.field_m = 4000L + hm.a(64);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tn.stop()");
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean c(byte param0) {
        return true;
    }

    abstract void a(byte param0);

    abstract void c(int param0);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != eg.field_j) {
          return null;
        }
        if (bd.field_b != null &&
          this != bd.field_b) {
          return bd.field_b.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kn.field_K = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("tn.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void a(boolean param0);

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
          if (eg.field_j != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (bd.field_b != null &&
            this != bd.field_b) {
            stackIn_8_0 = bd.field_b.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("tn.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (eg.field_j != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (bd.field_b != null &&
            this != bd.field_b) {
            stackIn_8_0 = bd.field_b.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "tn.getAppletContext()");
        }
    }

    public static void b(boolean param0) {
        if (!param0) {
          return;
        }
        try {
          field_f = null;
          field_d = null;
          field_m = null;
          field_n = null;
          field_k = null;
          field_j = null;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tn.TA(" + param0 + ')');
        }
    }

    final static java.awt.Container b(byte param0) {
        RuntimeException var1 = null;
        java.awt.Frame stackIn_4_0 = null;
        java.applet.Applet stackIn_9_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (eg.field_j != null) {
            stackIn_4_0 = eg.field_j;
            return (java.awt.Container) ((Object) stackIn_4_0);
          }
          if (param0 <= 41) {
            tn.b(false);
          }
          stackIn_9_0 = ao.a(13867);
          return (java.awt.Container) ((Object) stackIn_9_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw aa.a((Throwable) ((Object) var1), "tn.NA(" + param0 + ')');
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          bd.field_b = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("tn.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    protected tn() {
        this.field_c = false;
    }

    static {
        field_m = "You cannot chat to <%0> because <%0> is offline in your friend list.";
        field_n = new String[]{"Pixel Artist", "Pixel Master", "Pixel Legend", "Pixel Perfect", "The Difficult", "The Very Difficult", "The Impossible", "Take Your Time", "Excellence", "Brilliance", "Perfection", "Relentless", "Pixel Player", "Pixel Addict", "Elementary", "Puzzling", "Diligence", "Relentless 2", "Negative", "Backwards", "Straightforward", "Timewaster"};
        field_k = new String[]{"Your target picture always appears on the left. There are five pictures per level and each level is played on a different type of grid.", "The background <col=FF9900>skin</col> changes as you play - try not to lose your concentration!"};
        field_f = "Puzzles";
        field_j = new int[]{-1, -1, -1, -1, -1, -1, -1, -1, 85, 80, 84, -1, 91, -1, -1, -1, 81, 82, 86, -1, -1, -1, -1, -1, -1, -1, -1, 13, -1, -1, -1, -1, 83, 104, 105, 103, 102, 96, 98, 97, 99, -1, -1, -1, -1, -1, -1, -1, 25, 16, 17, 18, 19, 20, 21, 22, 23, 24, -1, -1, -1, -1, -1, -1, -1, 48, 68, 66, 50, 34, 51, 52, 53, 39, 54, 55, 56, 70, 69, 40, 41, 32, 35, 49, 36, 38, 67, 33, 65, 37, 64, -1, -1, -1, -1, -1, 228, 231, 227, 233, 224, 219, 225, 230, 226, 232, 89, 87, -1, 88, 229, 90, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10, 11, 12, -1, -1, -1, 101, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, 100, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1, -1};
        field_d = "Visit the Account Management section on the main site to view.";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
