/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameAppletShell extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static pt field_o;
    static fr field_l;
    boolean field_e;
    public static int field_a;
    public static boolean field_i;
    public static boolean field_h;
    public static boolean field_g;
    public static boolean field_k;
    public static boolean field_d;
    public static boolean field_j;
    public static int field_b;
    public static int field_c;
    public static boolean field_n;
    public static boolean field_m;
    public static boolean field_p;
    public static int field_f;

    public final void stop() {
        if (gh.field_f != this ||
          sk.field_c) {
          return;
        }
        try {
          lb.field_g = 4000L + kh.a(-61);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vb.stop()");
        }
    }

    abstract void renderGame(int obfuscationGuard);

    final synchronized void b(int param0) {
        Object var2 = null;
        boolean var4 = (AceOfSkies.obfuscationControl);
        try {
          if (null != ci.field_f) {
            ci.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
            ci.field_f.getParent().setBackground(java.awt.Color.black);
            ci.field_f.getParent().remove((java.awt.Component) ((Object) ci.field_f));
          }
          boolean decompiledFrameRemainder0 = true;
          if (ku.field_f != null) {
            var2 = ku.field_f;
            decompiledFrameRemainder0 = ((var4));
          }
          if (decompiledFrameRemainder0) {
            if (null != si.field_d) {
              var2 = si.field_d;
              if (var4) {
                if (hu.field_a == null) {
                  var2 = gh.field_f;
                  var2 = hu.field_a;
                } else {
                  var2 = hu.field_a;
                }
              }
            } else if (hu.field_a == null) {
              var2 = gh.field_f;
              if (var4) {
                var2 = hu.field_a;
              }
            } else {
              var2 = hu.field_a;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ci.field_f = (java.awt.Canvas) ((Object) new GameCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ci.field_f));
          ci.field_f.setSize(td.field_b, ArchiveIndex.field_h);
          ci.field_f.setVisible(true);
          boolean decompiledSharedTail0 = (si.field_d == var2);
          if (!decompiledSharedTail0) {
            ci.field_f.setLocation(ci.field_g, jt.field_x);
            decompiledSharedTail0 = ((var4));
          }
          if (decompiledSharedTail0) {
            java.awt.Insets var3 = si.field_d.getInsets();
            ci.field_f.setLocation(ci.field_g + var3.left, var3.top + jt.field_x);
          }
          ci.field_f.addFocusListener((java.awt.event.FocusListener) (this));
          ci.field_f.requestFocus();
          na.field_a = true;
          im.field_e = true;
          AceOfSkies.field_J = true;
          if (param0 != -14829) {
            this.windowDeiconified((java.awt.event.WindowEvent) null);
          }
          or.field_c = false;
          mg.field_b = kh.a(param0 + 14763);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw pn.a((Throwable) (var2), "vb.MA(" + param0 + ')');
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        String stackIn_6_2 = null;
        try {
          hu.field_a = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("vb.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        String stackIn_26_2 = null;
        try {
          if (gh.field_f == this &&
            !sk.field_c) {
            AceOfSkies.field_J = true;
            if (rl.field_p &&
              -mg.field_b + kh.a(-67) > 1000L) {
              java.awt.Rectangle var2 = param0.getClipBounds();
              if (var2 != null) {
                if (nj.field_e > var2.width) {
                  return;
                }
                if (hb.field_b > var2.height) {
                  return;
                }
              }
              or.field_c = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_25_0 = var2_ref;
          StringBuilder stackIn_25_1 = new StringBuilder().append("vb.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public static void b(byte param0) {
        try {
          field_o = null;
          int var1_int = -69 % ((18 - param0) / 42);
          field_l = null;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vb.PA(" + param0 + ')');
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    public abstract void init();

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    public final String getParameter(String param0) {
        String stackIn_19_2 = null;
        try {
          if (si.field_d != null) {
            Object stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != hu.field_a &&
            hu.field_a != this) {
            String stackIn_12_0 = hu.field_a.getParameter(param0);
            return stackIn_12_0;
          }
          String stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_18_0 = var2;
          StringBuilder stackIn_18_1 = new StringBuilder().append("vb.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    final static void a(boolean param0) {
        try {
          if (!param0) {
            field_o = (pt) null;
          }
          fj.playerDisplayName = IntKeyLookup.incomingPacket.readNullTerminatedText(-17883);
          cf.normalizedPlayerName = vu.normalizePlayerName(125, (CharSequence) ((Object) fj.playerDisplayName));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vb.OA(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    abstract void initializeClient(int obfuscationGuard);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != si.field_d) {
          return null;
        }
        if (hu.field_a != null &&
          this != hu.field_a) {
          return hu.field_a.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final java.applet.AppletContext getAppletContext() {
        try {
          if (si.field_d != null) {
            Object stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (hu.field_a != null &&
            this != hu.field_a) {
            java.applet.AppletContext stackIn_10_0 = hu.field_a.getAppletContext();
            return stackIn_10_0;
          }
          java.applet.AppletContext stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vb.getAppletContext()");
        }
    }

    private final void a(byte param0) {
        try {
          int var2_int = 116 % ((36 - param0) / 48);
          long var3 = kh.a(-86);
          long var5 = pn.field_b[ce.field_A];
          pn.field_b[ce.field_A] = var3;
          ce.field_A = 31 & ce.field_A + 1;
          if (var5 != 0L &&
            var3 > var5) {
            int var7_int = (int)(-var5 + var3);
            wk.field_f = (32000 + (var7_int >> 1)) / var7_int;
          }
          int fieldTemp$0 = iu.field_g;
          iu.field_g = iu.field_g + 1;
          if (fieldTemp$0 > 50) {
            AceOfSkies.field_J = true;
            iu.field_g = iu.field_g - 50;
            ci.field_f.setSize(td.field_b, ArchiveIndex.field_h);
            ci.field_f.setVisible(true);
            if (null != si.field_d &&
              null == ku.field_f) {
              java.awt.Insets var7 = si.field_d.getInsets();
              ci.field_f.setLocation(ci.field_g + var7.left, var7.top + jt.field_x);
              if (AceOfSkies.obfuscationControl) {
                ci.field_f.setLocation(ci.field_g, jt.field_x);
              }
            } else {
              ci.field_f.setLocation(ci.field_g, jt.field_x);
            }
          }
          this.renderGame(150);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var2), "vb.KA(" + param0 + ')');
        }
    }

    private final void a(boolean param0, byte param1) {
        Exception exception = null;
        Throwable decompiledCaughtException = null;
        try {
          Object var3 = this;
          synchronized (var3) {
            if (sk.field_c) {
              return;
            }
            sk.field_c = true;
          }
          if (null != hu.field_a) {
            hu.field_a.destroy();
          }
          try {
            this.shutdownClient(-123);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ci.field_f) {
            try {
              ci.field_f.removeFocusListener((java.awt.event.FocusListener) (this));
              ci.field_f.getParent().remove((java.awt.Component) ((Object) ci.field_f));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (pt.field_b != null) {
            try {
              pt.field_b.b(-115);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.releaseClientStatics(19469);
          if (si.field_d != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              Throwable throwable = decompiledCaughtException;
            }
          }
          int var3_int = -103 / ((-36 - param1) / 54);
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          RuntimeException runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "vb.QA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void c(byte param0) {
        try {
          int var2_int = 20 % ((param0 - 13) / 40);
          long var3 = kh.a(-69);
          long var5 = SoundCache.field_c[ur.field_a];
          SoundCache.field_c[ur.field_a] = var3;
          if (var5 != 0L &&
            var3 <= var5) {
          }
          ur.field_a = 31 & ur.field_a + 1;
          Object var7 = this;
          synchronized (var7) {
            im.field_e = na.field_a;
          }
          this.updateClient(5883);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw pn.a((Throwable) ((Object) runtimeException), "vb.RA(" + param0 + ')');
        }
    }

    public final void windowClosing(java.awt.event.WindowEvent param0) {
        String stackIn_6_2 = null;
        try {
          this.destroy();
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("vb.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(int param0, String param1) {
        try {
          String stackIn_17_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (this.field_e) {
              return;
            }
            this.field_e = true;
            System.out.println("error_game_" + param1);
            try {
              if (param0 >= -102) {
                field_l = (fr) null;
              }
              fe.a("loggedout", (byte) -108, bm.m(107));
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var3 = decompiledCaughtException;
            }
            try {
              this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              Exception var3_ref = (Exception) (Object) decompiledCaughtException;
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            RuntimeException var3_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_16_0 = var3_ref2;
            StringBuilder stackIn_16_1 = new StringBuilder().append("vb.LA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_17_2 = "null";
            } else {
              stackIn_17_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        if (this != gh.field_f ||
          sk.field_c) {
          return;
        }
        try {
          lb.field_g = kh.a(-96);
          IntrusiveNode.a(5000L, false);
          mj.field_a = null;
          this.a(false, (byte) 29);
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vb.destroy()");
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        if (this != gh.field_f ||
          sk.field_c) {
          return;
        }
        try {
          lb.field_g = 0L;
        } catch (RuntimeException runtimeException) {
          throw pn.a((Throwable) ((Object) runtimeException), "vb.start()");
        }
    }

    public final java.net.URL getDocumentBase() {
        try {
          if (null != si.field_d) {
            Object stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (hu.field_a != null &&
            this != hu.field_a) {
            java.net.URL stackIn_8_0 = hu.field_a.getDocumentBase();
            return stackIn_8_0;
          }
          java.net.URL stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw pn.a((Throwable) ((Object) var1), "vb.getDocumentBase()");
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
          int var3 = 0;
          boolean var5 = (AceOfSkies.obfuscationControl);
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (rk.field_o != null) {
                var1 = rk.field_o.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  String var2 = rk.field_l;
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
                    this.a(-119, "wrongjava");
                    decompiledFrameRemainder3 = ((var5));
                  }
                  if (decompiledFrameRemainder3 &&
                    var2.startsWith("1.6.0_")) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = oj.a(var2.charAt(var3), (byte) -2);
                      if (var5) {
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
                      String var4 = var2.substring(6, var3);
                      if (vl.a(10, (CharSequence) ((Object) var4)) &&
                        !(td.a((CharSequence) ((Object) var4), (byte) 38) >= 10)) {
                        this.a(-111, "wrongjava");
                        decompiledFrameRemainder3 = ((var5));
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder3 && decompiledFrameCompleted0 &&
                (decompiledFrameRemainder2 = (rk.field_l != null))) {
                stackIn_68_0 = rk.field_l.startsWith("1.");
              }
              if (decompiledFrameRemainder3 &&
                decompiledFrameRemainder2 &&
                stackIn_68_0) {
                int var1_int = 2;
                int var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (var1_int < rk.field_l.length()) {
                    var3 = rk.field_l.charAt(var1_int);
                    stackIn_81_0 = -49;
                    stackIn_81_1 = ~var3;
                    decompiledFrameRemainder1 = ((!(var5)));
                    if (decompiledFrameRemainder1 && (stackIn_81_0 >= stackIn_81_1 &&
                      57 >= var3)) {
                      var2_int = -48 - (-var3 - var2_int * 10);
                      var1_int++;
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
                  rl.field_p = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = gh.field_f;
                if (null != hu.field_a) {
                  var1 = hu.field_a;
                }
                java.lang.reflect.Method var2_ref = rk.field_e;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    Throwable var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                qp.a(34069);
                this.b(-14829);
                cl.field_fb = qd.a((java.awt.Component) ((Object) ci.field_f), true, ArchiveIndex.field_h, td.field_b);
                this.initializeClient(28060);
                io.field_c = ij.c(8194);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (lb.field_g != 0L) {
                    stackIn_100_0 = $cfr$lcmp(kh.a(-125), lb.field_g);
                    decompiledFrameRemainder0 = ((!(var5)));
                    if (decompiledFrameRemainder0 &&
                      stackIn_100_0 >= 0) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    Bullet.field_g = io.field_c.a(ld.field_b, (byte) -18);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(Bullet.field_g > var3)) {
                      this.a((byte) 118);
                      PacketBuffer.a(-116, ci.field_f, pt.field_b);
                      break;
                    }
                    this.c((byte) 111);
                    var3++;
                  } while (!var5);
                } while (!var5);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              v.a((String) null, (byte) -52, (Throwable) (var1));
              this.a(-107, "crash");
            }
            this.a(true, (byte) 82);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw pn.a((Throwable) (var1), "vb.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void update(java.awt.Graphics param0) {
        String stackIn_6_2 = null;
        try {
          this.paint(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("vb.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        String stackIn_6_2 = null;
        try {
          na.field_a = true;
          AceOfSkies.field_J = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("vb.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void shutdownClient(int obfuscationGuard);

    abstract void releaseClientStatics(int obfuscationGuard);

    abstract void updateClient(int obfuscationGuard);

    final boolean b(boolean param0) {
        return true;
    }

    final void a(int param0, int param1, int param2, String param3, int param4, int param5, int param6) {
        try {
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          boolean var9 = (AceOfSkies.obfuscationControl);
          try {
            try {
              if (null != gh.field_f) {
                cd.field_b = cd.field_b + 1;
                if (cd.field_b >= 3) {
                  this.a(-110, "alreadyloaded");
                  return;
                }
                this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                return;
              }
              bs.field_c = param4;
              ArchiveIndex.field_h = param5;
              hb.field_b = param5;
              gh.field_f = this;
              td.field_b = param0;
              nj.field_e = param0;
              ci.field_g = param1;
              jt.field_x = 0;
              fb.field_c = bm.m(124);
              rk dupTemp$0 = new rk(param6, param3, param2, true);
              pt.field_b = dupTemp$0;
              mj.field_a = dupTemp$0;
              en var8 = pt.field_b.a(1, 1048576, (Runnable) (this));
              while (true) {
                if (var8.field_a == 0) {
                  IntrusiveNode.a(10L, false);
                  if (!var9) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var8_ref = decompiledCaughtException;
              v.a((String) null, (byte) -52, var8_ref);
              this.a(param1 ^ -119, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_23_0 = var8_ref2;
            StringBuilder stackIn_23_1 = new StringBuilder().append("vb.NA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
            if (param3 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw pn.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        String stackIn_6_2 = null;
        try {
          na.field_a = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("vb.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    protected GameAppletShell() {
        this.field_e = false;
    }

    static {
        field_o = new pt();
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
