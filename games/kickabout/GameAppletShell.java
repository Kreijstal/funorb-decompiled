/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameAppletShell extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_m;
    static String field_n;
    static String field_b;
    static Sprite field_l;
    static String field_f;
    static long field_c;
    boolean field_e;
    public static boolean field_d;
    public static int field_j;
    public static int field_k;
    public static boolean field_i;
    public static boolean field_g;
    public static int field_a;
    public static int field_h;

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean d(byte param0) {
        return true;
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if (this == MatchScreen.field_p &&
            !hp.field_b) {
            oo.field_f = true;
            if (is.field_c &&
              -TextLine.field_e + nj.monotonicMillis(80) > 1000L) {
              var2 = param0.getClipBounds();
              if (var2 != null) {
                if (var2.width < uk.field_a) {
                  return;
                }
                if (var2.height < vs.field_f) {
                  return;
                }
              }
              SquadGridWidget.field_Ib = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_24_0 = var2_ref;
          stackIn_24_1 = new StringBuilder().append("ah.paint(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(')').toString());
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.applet.AppletContext stackIn_12_0 = null;
        java.applet.AppletContext stackIn_14_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null != ServerMessageScreen.field_A) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (PlayerShopScreen.field_M != null &&
            this != PlayerShopScreen.field_M) {
            stackIn_12_0 = PlayerShopScreen.field_M.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ah.getAppletContext()");
        }
    }

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        RuntimeException decompiledCaughtException = null;
        java.awt.Insets var6 = null;
        try {
          var2_long = nj.monotonicMillis(85);
          var4 = mi.field_b[CachedArchiveSource.field_E];
          if (param0 >= -31) {
            field_n = (String) null;
          }
          mi.field_b[CachedArchiveSource.field_E] = var2_long;
          if (0L != var4 &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            nk.field_h = ((var6_int >> 1) + 32000) / var6_int;
          }
          CachedArchiveSource.field_E = 31 & CachedArchiveSource.field_E + 1;
          fieldTemp$1 = TeamSelectionView.field_q;
          TeamSelectionView.field_q = TeamSelectionView.field_q + 1;
          if (50 < fieldTemp$1) {
            TeamSelectionView.field_q = TeamSelectionView.field_q - 50;
            oo.field_f = true;
            ic.field_d.setSize(f.field_d, ReceivedAuctionItem.field_B);
            ic.field_d.setVisible(true);
            if (null != ServerMessageScreen.field_A &&
              null == fa.field_k) {
              var6 = ServerMessageScreen.field_A.getInsets();
              ic.field_d.setLocation(BytePlusOneCommand.field_H + var6.left, is.field_g + var6.top);
              if (Kickabout.field_G != 0) {
                ic.field_d.setLocation(BytePlusOneCommand.field_H, is.field_g);
              }
            } else {
              ic.field_d.setLocation(BytePlusOneCommand.field_H, is.field_g);
            }
          }
          this.paintFrame((byte) 82);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ah.V(" + param0 + ')');
        }
    }

    abstract void onStartup(byte param0);

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    final static void a(ResourceArchive param0, byte param1) {
        RuntimeException runtimeException = null;
        VorbisSample var2 = null;
        int var3 = 0;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          VorbisSample.decodeSetup(param0.a("", "headers.packvorbis", 110));
          var2 = VorbisSample.a(param0, "jagex logo2.packvorbis", "");
          var2.decodeAllToPcm();
          var3 = 116 % ((-33 - param1) / 60);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ah.EA(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param1).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          PlayerShopScreen.field_M = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ah.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void stop() {
        if (this != MatchScreen.field_p ||
          hp.field_b) {
          return;
        }
        try {
          SquadPickerDialog.field_I = 4000L + nj.monotonicMillis(-58);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ah.stop()");
        }
    }

    public abstract void init();

    abstract void onShutdown(byte param0);

    abstract void paintFrame(byte param0);

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
          if (null != ServerMessageScreen.field_A) {
            stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (null != PlayerShopScreen.field_M &&
            this != PlayerShopScreen.field_M) {
            stackIn_12_0 = PlayerShopScreen.field_M.getParameter(param0);
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getParameter(param0);
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_18_0 = var2;
          stackIn_18_1 = new StringBuilder().append("ah.getParameter(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    private final void shutdownShell(boolean param0, byte param1) {
        Exception exception = null;
        Throwable throwable = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        int var3_int = 0;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (hp.field_b) {
              return;
            }
            hp.field_b = true;
          }
          if (PlayerShopScreen.field_M != null) {
            PlayerShopScreen.field_M.destroy();
          }
          try {
            this.onShutdown((byte) -24);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (null != ic.field_d) {
            try {
              ic.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
              ic.field_d.getParent().remove((java.awt.Component) ((Object) ic.field_d));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != oo.field_c) {
            try {
              oo.field_c.a(true);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.releaseStatics(6);
          if (null != ServerMessageScreen.field_A) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              throwable = decompiledCaughtException;
            }
          }
          var3_int = -40 % ((param1 + 22) / 63);
          System.out.println("Shutdown complete - clean:" + param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ah.FA(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void releaseStatics(int param0);

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
          stackIn_5_1 = new StringBuilder().append("ah.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          er.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ah.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          er.field_l = true;
          oo.field_f = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("ah.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void f(byte param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Kickabout.field_G;
        try {
          if (ic.field_d != null) {
            ic.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
            ic.field_d.getParent().setBackground(java.awt.Color.black);
            ic.field_d.getParent().remove((java.awt.Component) ((Object) ic.field_d));
          }
          boolean decompiledFrameRemainder0 = true;
          if (fa.field_k != null) {
            var2 = fa.field_k;
            decompiledFrameRemainder0 = (var4 != 0);
          }
          if (decompiledFrameRemainder0) {
            if (null == ServerMessageScreen.field_A) {
              if (null != PlayerShopScreen.field_M) {
                var2 = PlayerShopScreen.field_M;
                if (var4 != 0) {
                  var2 = MatchScreen.field_p;
                  var2 = ServerMessageScreen.field_A;
                }
              } else {
                var2 = MatchScreen.field_p;
                if (var4 != 0) {
                  var2 = ServerMessageScreen.field_A;
                }
              }
            } else {
              var2 = ServerMessageScreen.field_A;
            }
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          ic.field_d = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) ic.field_d));
          ic.field_d.setSize(f.field_d, ReceivedAuctionItem.field_B);
          ic.field_d.setVisible(true);
          boolean decompiledSharedTail0 = (ServerMessageScreen.field_A == var2);
          if (!decompiledSharedTail0) {
            ic.field_d.setLocation(BytePlusOneCommand.field_H, is.field_g);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = ServerMessageScreen.field_A.getInsets();
            ic.field_d.setLocation(BytePlusOneCommand.field_H + var3.left, is.field_g + var3.top);
          }
          ic.field_d.addFocusListener((java.awt.event.FocusListener) (this));
          ic.field_d.requestFocus();
          er.field_l = true;
          vb.field_k = true;
          oo.field_f = true;
          if (param0 >= -79) {
            this.run();
          }
          SquadGridWidget.field_Ib = false;
          TextLine.field_e = nj.monotonicMillis(-95);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) (var2), "ah.W(" + param0 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this == MatchScreen.field_p &&
            !hp.field_b) {
            SquadPickerDialog.field_I = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ah.start()");
        }
    }

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ServerMessageScreen.field_A != null) {
            stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (PlayerShopScreen.field_M != null &&
            PlayerShopScreen.field_M != this) {
            stackIn_10_0 = PlayerShopScreen.field_M.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ah.getDocumentBase()");
        }
    }

    public final void run() {
        try {
          boolean stackIn_68_0 = false;
          int stackIn_80_0 = 0;
          int stackIn_80_1 = 0;
          int stackIn_99_0 = 0;
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
          var5 = Kickabout.field_G;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (PlatformTaskDispatcher.field_u != null) {
                var1 = PlatformTaskDispatcher.field_u.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  var2 = PlatformTaskDispatcher.field_r;
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
                    this.a((byte) 79, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_68_0 = IntrusiveNode.a(12105, var2.charAt(var3));
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
                      if (ClubState.a((byte) 15, (CharSequence) ((Object) var4)) &&
                        !(rr.a(10, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a((byte) 118, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (PlatformTaskDispatcher.field_r != null))) {
                stackIn_68_0 = PlatformTaskDispatcher.field_r.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_68_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (PlatformTaskDispatcher.field_r.length() > var1_int) {
                    var3 = PlatformTaskDispatcher.field_r.charAt(var1_int);
                    stackIn_80_0 = ~var3;
                    stackIn_80_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_80_0 <= stackIn_80_1 &&
                      var3 <= 57)) {
                      var1_int++;
                      var2_int = var2_int * 10 + var3 - 48;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_80_0 = var2_int;
                    stackIn_80_1 = 5;
                  }
                  if (stackIn_80_0 < stackIn_80_1) {
                    break;
                  }
                  is.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = MatchScreen.field_p;
                if (null != PlayerShopScreen.field_M) {
                  var1 = PlayerShopScreen.field_M;
                }
                var2_ref = PlatformTaskDispatcher.field_x;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                SingleChildContainer.i(-1);
                this.f((byte) -105);
                ea.field_f = DelayedServerPacket.a(105, f.field_d, ReceivedAuctionItem.field_B, (java.awt.Component) ((Object) ic.field_d));
                this.onStartup((byte) -76);
                SplashScreen.field_k = SumIntegersCommand.h(3);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (SquadPickerDialog.field_I != 0L) {
                    stackIn_99_0 = compareLongs(~nj.monotonicMillis(-51), ~SquadPickerDialog.field_I);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_99_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    SectorCacheStore.field_b = SplashScreen.field_k.a((byte) -113, LeagueWinnerDialog.field_H);
                    stackIn_99_0 = 0;
                  }
                  var3 = stackIn_99_0;
                  do {
                    if (!(var3 < SectorCacheStore.field_b)) {
                      this.d(-43);
                      ReflectionCheck.a((byte) 41, oo.field_c, ic.field_d);
                      break;
                    }
                    this.a(true);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              UnreadMessagesScreen.a((String) null, (Throwable) (var1), 1);
              this.a((byte) 60, "crash");
            }
            this.shutdownShell(true, (byte) -119);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw GameSoundEffect.wrapException((Throwable) (var1), "ah.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final void destroy() {
        if (MatchScreen.field_p != this ||
          hp.field_b) {
          return;
        }
        try {
          SquadPickerDialog.field_I = nj.monotonicMillis(-99);
          aj.a(5000L, 1);
          DelegatingCanvas.field_a = null;
          this.shutdownShell(false, (byte) -113);
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ah.destroy()");
        }
    }

    abstract void runFrameStep(byte param0);

    final void a(int param0, int param1, int param2, byte param3, int param4, String param5, int param6) {
        try {
          PlatformTaskDispatcher dupTemp$0 = null;
          RuntimeException stackIn_23_0 = null;
          StringBuilder stackIn_23_1 = null;
          String stackIn_24_2 = null;
          Throwable decompiledCaughtException = null;
          PlatformTask var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = Kickabout.field_G;
          try {
            try {
              if (MatchScreen.field_p != null) {
                AnimationClip.field_l = AnimationClip.field_l + 1;
                if (AnimationClip.field_l < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a((byte) 14, "alreadyloaded");
                return;
              }
              f.field_d = param1;
              uk.field_a = param1;
              MatchScreen.field_p = this;
              BytePlusOneCommand.field_H = 0;
              if (param3 != -126) {
                return;
              }
              ReceivedAuctionItem.field_B = param4;
              vs.field_f = param4;
              is.field_g = 0;
              ei.field_e = param2;
              ug.field_a = so.a(31);
              dupTemp$0 = new PlatformTaskDispatcher(param6, param5, param0, true);
              oo.field_c = dupTemp$0;
              DelegatingCanvas.field_a = dupTemp$0;
              var8 = oo.field_c.a(1, (byte) 110, (Runnable) (this));
              while (true) {
                if (var8.field_a == 0) {
                  aj.a(10L, 1);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              UnreadMessagesScreen.a((String) null, var8_ref, 1);
              this.a((byte) -118, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_23_0 = var8_ref2;
            stackIn_23_1 = new StringBuilder().append("ah.R(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_24_2 = "null";
            } else {
              stackIn_24_2 = "{...}";
            }
            throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(')').toString());
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
          stackIn_5_1 = new StringBuilder().append("ah.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != ServerMessageScreen.field_A) {
          return null;
        }
        if (null != PlayerShopScreen.field_M &&
          this != PlayerShopScreen.field_M) {
          return PlayerShopScreen.field_M.getCodeBase();
        }
        return super.getCodeBase();
    }

    public static void c(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        try {
          if (param0 != 1) {
            GameAppletShell.provideLoaderApplet((java.applet.Applet) null);
          }
          field_m = null;
          field_n = null;
          field_b = null;
          field_l = null;
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ah.BA(" + param0 + ')');
        }
    }

    final void a(byte param0, String param1) {
        try {
          int var3_int = 0;
          if (this.field_e) {
            return;
          }
          this.field_e = true;
          System.out.println("error_game_" + param1);
          try {
            AppletJavaScriptBridge.a(30858, "loggedout", so.a(-90));
          } catch (Throwable throwable) {
          }
          try {
            this.getAppletContext().showDocument(new java.net.URL(this.getCodeBase(), "error_game_" + param1 + ".ws"), "_top");
          } catch (Exception exception) {
          }
          var3_int = 106 / ((param0 + 25) / 36);
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void a(boolean param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = nj.monotonicMillis(88);
          var4 = AudioService.field_d[gf.field_c];
          AudioService.field_d[gf.field_c] = var2_long;
          gf.field_c = 1 + gf.field_c & 31;
          if (var4 != 0L &&
            var4 < var2_long) {
            var6_int = (int)(var2_long - var4);
            NumericDateInputWidget.field_T = ((var6_int >> 1) + 32000) / var6_int;
          }
          var6 = this;
          synchronized (var6) {
            vb.field_k = er.field_l;
            if (!param0) {
              field_f = (String) null;
            }
          }
          this.runFrameStep((byte) -105);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ah.S(" + param0 + ')');
        }
    }

    protected GameAppletShell() {
        this.field_e = false;
    }

    static {
        field_n = "Confirm Email:";
        field_m = "<%0> is already on your friend list.";
        field_b = "RECORDS";
        field_f = "Options";
        field_c = 0L;
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
