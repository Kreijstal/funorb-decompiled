/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class iv extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static fl field_b;
    static String field_a;
    static String field_m;
    static int[][] field_e;
    static String field_c;
    boolean field_i;
    public static boolean field_k;
    public static boolean field_g;
    public static int field_f;
    public static int field_d;
    public static int field_j;
    public static int field_l;
    public static boolean field_h;

    public abstract void init();

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
          if (g.field_f != null) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (la.field_g != null &&
            this != la.field_g) {
            stackIn_8_0 = la.field_g.getParameter(param0);
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getParameter(param0);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("iv.getParameter(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
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
          if (this == lr.field_a &&
            !rh.field_c) {
            ol.field_z = true;
            if (se.field_c &&
              -AttackEvent.field_P + vi.b(62) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (ce.field_N > var2.width) {
                  return;
                }
                if (dm.field_D > var2.height) {
                  return;
                }
              }
              tq.field_a = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = var2_ref;
          stackIn_25_1 = new StringBuilder().append("iv.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (lr.field_a == this &&
            !rh.field_c) {
            SpellAreaSelection.field_s = vi.b(-46);
            nu.a(5000L, 0);
            PacketBuffer.field_s = null;
            this.a(false, -1251);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "iv.destroy()");
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
          stackIn_5_1 = new StringBuilder().append("iv.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          la.field_g = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("iv.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        if (lr.field_a != this ||
          rh.field_c) {
          return;
        }
        try {
          SpellAreaSelection.field_s = 4000L + vi.b(-62);
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "iv.stop()");
        }
    }

    final boolean e(int param0) {
        return true;
    }

    final void a(int param0, int param1, String param2, int param3, int param4, int param5, int param6) {
        try {
          hd dupTemp$0 = null;
          RuntimeException stackIn_25_0 = null;
          StringBuilder stackIn_25_1 = null;
          String stackIn_26_2 = null;
          Throwable decompiledCaughtException = null;
          wo var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            try {
              if (lr.field_a != null) {
                gs.field_b = gs.field_b + 1;
                if (gs.field_b >= 3) {
                  this.a("alreadyloaded", (byte) -85);
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              mh.field_c = 0;
              bn.field_b = param0;
              ce.field_N = param0;
              sp.field_b = 0;
              hw.field_B = param4;
              dt.field_a = param6;
              dm.field_D = param6;
              lr.field_a = this;
              if (param3 != 10) {
                return;
              }
              vu.field_L = CombatEvent.d((byte) 10);
              dupTemp$0 = new hd(param1, param2, param5, true);
              ft.field_m = dupTemp$0;
              PacketBuffer.field_s = dupTemp$0;
              var8 = ft.field_m.a(1, 0, (Runnable) (this));
              while (true) {
                if (var8.field_g == 0) {
                  nu.a(10L, param3 ^ 10);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              af.a(var8_ref, param3 - 118, (String) null);
              this.a("crash", (byte) -62);
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_25_0 = var8_ref2;
            stackIn_25_1 = new StringBuilder().append("iv.AB(").append(param0).append(',').append(param1).append(',');
            if (param2 == null) {
              stackIn_26_2 = "null";
            } else {
              stackIn_26_2 = "{...}";
            }
            throw ig.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void b(int param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = vi.b(120);
          var4 = om.field_r[os.field_o];
          om.field_r[os.field_o] = var2_long;
          if (0L != var4 &&
            var4 >= var2_long) {
          }
          if (param0 != 17684) {
            this.destroy();
          }
          os.field_o = 1 + os.field_o & 31;
          var6 = this;
          synchronized (var6) {
            ph.field_f = wj.field_l;
          }
          this.a((byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "iv.WA(" + param0 + ')');
        }
    }

    abstract void b(byte param0);

    public final void windowClosed(java.awt.event.WindowEvent param0) {
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
            if (this.field_i) {
              return;
            }
            this.field_i = true;
            System.out.println("error_game_" + param0);
            try {
              lj.a("loggedout", (byte) -121, CombatEvent.d((byte) -123));
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var3 = decompiledCaughtException;
            }
            try {
              if (param1 >= -35) {
                return;
              }
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
            stackIn_15_1 = new StringBuilder().append("iv.TA(");
            if (param0 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ig.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    abstract void a(boolean param0);

    private final void a(boolean param0, int param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        try {
          var3 = this;
          synchronized (var3) {
            if (rh.field_c) {
              return;
            }
            rh.field_c = true;
          }
          if (la.field_g != null) {
            la.field_g.destroy();
          }
          try {
            this.b((byte) 103);
            if (param1 != -1251) {
              this.c((byte) 114);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != si.field_b) {
            try {
              si.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
              si.field_b.getParent().remove((java.awt.Component) ((Object) si.field_b));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != ft.field_m) {
            try {
              ft.field_m.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.d((byte) -72);
          if (null != g.field_f) {
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
          throw ig.a((Throwable) ((Object) runtimeException), "iv.CB(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void a(byte param0);

    final static void a(boolean param0, boolean param1, java.awt.Canvas param2) {
        int var3_int = 0;
        int var4 = 0;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          if (f.field_E >= 10) {
            if (lk.b(true)) {
              if (p.field_b == 0) {
                tq.a(param1, false, 112);
                pt.a(0, 12, param2, 0);
                decompiledFrameRemainder0 = (var4 != 0);
              }
              if (decompiledFrameRemainder0) {
                pr.a((byte) 111, param2);
                if (var4 != 0) {
                  SoftwareRaster.b();
                  sc.a(240, 320, -121);
                  pt.a(0, 12, param2, 0);
                  var3_int = 0;
                  if (ol.field_z) {
                    ol.field_z = false;
                    var3_int = 1;
                  }
                  tl.a(-5790, TurnEffectEvent.field_F, SpellCastEvent.g(-15862), var3_int != 0, dd.a(false));
                }
              }
            } else {
              SoftwareRaster.b();
              sc.a(240, 320, -121);
              pt.a(0, 12, param2, 0);
              if (var4 != 0) {
                var3_int = 0;
                if (ol.field_z) {
                  ol.field_z = false;
                  var3_int = 1;
                }
                tl.a(-5790, TurnEffectEvent.field_F, SpellCastEvent.g(-15862), var3_int != 0, dd.a(false));
              }
            }
          } else {
            var3_int = 0;
            if (ol.field_z) {
              ol.field_z = false;
              var3_int = 1;
            }
            tl.a(-5790, TurnEffectEvent.field_F, SpellCastEvent.g(-15862), var3_int != 0, dd.a(false));
          }
          if (param0) {
            field_m = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_29_0 = var3;
          stackIn_29_1 = new StringBuilder().append("iv.BB(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != g.field_f) {
          return null;
        }
        if (la.field_g != null &&
          la.field_g != this) {
          return la.field_g.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
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
          var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != hd.field_t) {
                var1 = hd.field_t.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = hd.field_u;
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
                    this.a("wrongjava", (byte) -39);
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = mu.a(28799, var2.charAt(var3));
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
                      if (vv.a(-45, (CharSequence) ((Object) var4)) &&
                        !(dq.a(107, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a("wrongjava", (byte) -101);
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (hd.field_u != null))) {
                stackIn_68_0 = hd.field_u.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < hd.field_u.length()) {
                    var3 = hd.field_u.charAt(var1_int);
                    stackIn_83_0 = ~var3;
                    stackIn_83_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_83_0 <= stackIn_83_1 && (var3 <= 57 ||
                      var5 != 0))) {
                      var2_int = 10 * var2_int + (var3 - 48);
                      var1_int++;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_83_0 = -6;
                    stackIn_83_1 = ~var2_int;
                  }
                  if (stackIn_83_0 < stackIn_83_1) {
                    break;
                  }
                  se.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = lr.field_a;
                if (null != la.field_g) {
                  var1 = la.field_g;
                }
                var2_ref = hd.field_x;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                jh.c((byte) -76);
                this.c((byte) 87);
                so.field_b = rj.a(bn.field_b, dt.field_a, 1423111778, (java.awt.Component) ((Object) si.field_b));
                this.a(false);
                qc.field_h = wc.c(false);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != SpellAreaSelection.field_s) {
                    stackIn_102_0 = $cfr$lcmp(SpellAreaSelection.field_s, vi.b(-56));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_102_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    kb.field_A = qc.field_h.a(-125, rd.field_i);
                    stackIn_102_0 = 0;
                  }
                  var3 = stackIn_102_0;
                  do {
                    if (!(kb.field_A > var3)) {
                      this.c(-11);
                      MapTile.a(ft.field_m, si.field_b, true);
                      break;
                    }
                    this.b(17684);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              af.a((Throwable) (var1), -102, (String) null);
              this.a("crash", (byte) -121);
            }
            this.a(true, -1251);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ig.a((Throwable) (var1), "iv.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
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
          stackIn_5_1 = new StringBuilder().append("iv.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void start() {
        if (lr.field_a != this ||
          rh.field_c) {
          return;
        }
        try {
          SpellAreaSelection.field_s = 0L;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "iv.start()");
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wj.field_l = true;
          ol.field_z = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("iv.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void d(byte param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_12_0 = null;
        java.net.URL stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (g.field_f != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != la.field_g &&
            this != la.field_g) {
            stackIn_12_0 = la.field_g.getDocumentBase();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getDocumentBase();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "iv.getDocumentBase()");
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (g.field_f != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (la.field_g != null &&
            la.field_g != this) {
            stackIn_10_0 = la.field_g.getAppletContext();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var1), "iv.getAppletContext()");
        }
    }

    abstract void a(int param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    private final void c(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_long = vi.b(94);
          var4 = jb.field_u[ih.field_ab];
          jb.field_u[ih.field_ab] = var2_long;
          ih.field_ab = ih.field_ab + 1 & 31;
          if (0L != var4 &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            hr.field_i = (32000 + (var6_int >> 1)) / var6_int;
          }
          fieldTemp$1 = uh.field_d;
          uh.field_d = uh.field_d + 1;
          if (fieldTemp$1 > 50) {
            uh.field_d = uh.field_d - 50;
            ol.field_z = true;
            si.field_b.setSize(bn.field_b, dt.field_a);
            si.field_b.setVisible(true);
            if (null != g.field_f &&
              cs.field_bb == null) {
              var6 = g.field_f.getInsets();
              si.field_b.setLocation(sp.field_b + var6.left, mh.field_c + var6.top);
              if (ArmiesOfGielinor.obfuscationControl) {
                si.field_b.setLocation(sp.field_b, mh.field_c);
              }
            } else {
              si.field_b.setLocation(sp.field_b, mh.field_c);
            }
          }
          if (param0 != -11) {
            this.start();
          }
          this.a(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) runtimeException), "iv.UA(" + param0 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final synchronized void c(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (si.field_b != null) {
            si.field_b.removeFocusListener((java.awt.event.FocusListener) (this));
            si.field_b.getParent().setBackground(java.awt.Color.black);
            si.field_b.getParent().remove((java.awt.Component) ((Object) si.field_b));
          }
          boolean decompiledFrameRemainder0 = true;
          if (cs.field_bb != null) {
            var2 = cs.field_bb;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (g.field_f != null) {
              var2 = g.field_f;
              if (var4 != 0) {
                if (la.field_g != null) {
                  var2 = la.field_g;
                  var2 = lr.field_a;
                } else {
                  var2 = lr.field_a;
                }
              }
            } else {
              if (la.field_g != null) {
                var2 = la.field_g;
                if (var4 != 0) {
                  var2 = lr.field_a;
                }
              } else {
                var2 = lr.field_a;
              }
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          si.field_b = (java.awt.Canvas) ((Object) new le((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) si.field_b));
          si.field_b.setSize(bn.field_b, dt.field_a);
          if (param0 != 87) {
            return;
          }
          si.field_b.setVisible(true);
          boolean decompiledSharedTail0 = (var2 == g.field_f);
          if (!decompiledSharedTail0) {
            si.field_b.setLocation(sp.field_b, mh.field_c);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = g.field_f.getInsets();
            si.field_b.setLocation(var3.left + sp.field_b, var3.top + mh.field_c);
          }
          si.field_b.addFocusListener((java.awt.event.FocusListener) (this));
          si.field_b.requestFocus();
          ph.field_f = true;
          wj.field_l = true;
          ol.field_z = true;
          tq.field_a = false;
          AttackEvent.field_P = vi.b(param0 + 7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ig.a((Throwable) (var2), "iv.RA(" + param0 + ')');
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wj.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("iv.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    protected iv() {
        this.field_i = false;
    }

    public static void d(int param0) {
        field_m = null;
        field_c = null;
        if (param0 <= 86) {
          return;
        }
        try {
          field_a = null;
          field_b = null;
          field_e = (int[][]) null;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "iv.VA(" + param0 + ')');
        }
    }

    static {
        field_m = "Curses";
        field_a = "Enter name of friend to add to list";
        field_c = "Unable to add friend - system busy";
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
