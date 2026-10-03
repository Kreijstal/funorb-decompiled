/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

public abstract class ch extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static int queuedMeshFaceCount;
    boolean field_a;
    static int[] meshFaceCountsByDepthBucket;
    public static boolean field_h;
    public static boolean field_e;
    public static boolean field_i;
    public static boolean field_c;
    public static boolean field_f;
    public static int field_g;
    public static boolean field_j;

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_4_0 = null;
        java.net.URL stackIn_10_0 = null;
        java.net.URL stackIn_12_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sg.field_a != null) {
            stackIn_4_0 = null;
            return (java.net.URL) ((Object) stackIn_4_0);
          }
          if ((null != kg.field_m) &&
              (this != kg.field_m)) {
            stackIn_10_0 = kg.field_m.getDocumentBase();
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ch.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          kg.field_m = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);
          stackIn_5_1 = new StringBuilder().append("ch.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          stackIn_5_0 = (RuntimeException) (runtimeException);
          stackIn_5_1 = new StringBuilder().append("ch.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
            if (ad.field_p) {
              return;
            }
            ad.field_p = true;
          }
          if (null != kg.field_m) {
            kg.field_m.destroy();
          }
          try {
            this.serviceAudio(1);
            if (param0 != 14) {
              this.renderFrame(-33);
            }
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (MessageDialog.gameCanvas != null) {
            try {
              MessageDialog.gameCanvas.removeFocusListener((java.awt.event.FocusListener) (this));
              MessageDialog.gameCanvas.getParent().remove((java.awt.Component) ((Object) MessageDialog.gameCanvas));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (MenuScreen.platformTaskDispatcher != null) {
            try {
              MenuScreen.platformTaskDispatcher.shutdown((byte) 13);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.releaseGameResources((byte) -64);
          if (null != sg.field_a) {
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
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.I(" + param0 + ',' + param1 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
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
          stackIn_5_0 = (RuntimeException) (runtimeException);
          stackIn_5_1 = new StringBuilder().append("ch.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void c(byte param0) {
        try {
            meshFaceCountsByDepthBucket = null;
            int var1_int = 30 % ((30 - param0) / 52);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.E(" + param0 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wc.field_g = true;
          dl.field_c = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);
          stackIn_5_1 = new StringBuilder().append("ch.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void a(byte param0, String param1) {
        try {
            RuntimeException stackIn_15_0 = null;
            StringBuilder stackIn_15_1 = null;
            String stackIn_16_2 = null;
            Throwable decompiledCaughtException = null;
            Throwable var3 = null;
            Exception var3_ref = null;
            RuntimeException var3_ref2 = null;
            try {
              if (this.field_a) {
                return;
              }
              this.field_a = true;
              System.out.println("error_game_" + param1);
              if (param0 != 79) {
                ch.c((byte) -125);
              }
              try {
                wk.a((byte) -6, k.c(115), "loggedout");
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
              stackIn_15_0 = (RuntimeException) (var3_ref2);
              stackIn_15_1 = new StringBuilder().append("ch.A(").append(param0).append(',');
              if (param1 == null) {
                stackIn_16_2 = "null";
              } else {
                stackIn_16_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void run() {
        try {
            boolean stackIn_66_0 = false;
            int stackIn_78_0 = 0;
            int stackIn_78_1 = 0;
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
            var5 = Geoblox.clientControlFlowFlag;
            try {
              try {
                L1: {
                  L2: {
                    L3: {
                      L4: {
                        if (PlatformTaskDispatcher.javaVendor != null) {
                          var1 = PlatformTaskDispatcher.javaVendor.toLowerCase();
                          if ((-1 == ((String) (var1)).indexOf("sun")) &&
                              (((String) (var1)).indexOf("apple") == -1)) {
                            break L4;
                          }
                          var2 = PlatformTaskDispatcher.javaVersion;
                          if (!((!var2.equals("1.1")) &&
                              (!var2.startsWith("1.1.")) &&
                              (!var2.equals("1.2")) &&
                              (!var2.startsWith("1.2.")) &&
                              (!var2.equals("1.3")) &&
                              (!var2.startsWith("1.3.")) &&
                              (!var2.equals("1.4")) &&
                              (!var2.startsWith("1.4.")) &&
                              (!var2.equals("1.5")) &&
                              (!var2.startsWith("1.5.")) &&
                              (!var2.equals("1.6.0")))) {
                            this.a((byte) 79, "wrongjava");
                            if (var5 == 0) {
                              break L1;
                            }
                          }
                          if (var2.startsWith("1.6.0_")) {
                            var3 = 6;
                            while (var2.length() > var3) {
                              stackIn_66_0 = DualLinkNode.a(-58, var2.charAt(var3));
                              if (var5 != 0) {
                                break L3;
                              }
                              if (stackIn_66_0) {
                                var3++;
                                if (var5 == 0) {
                                  continue;
                                }
                              }
                              break;
                            }
                            var4 = var2.substring(6, var3);
                            if (!MessageDialog.isSignedDecimalInt((byte) -115, (CharSequence) ((Object) var4))) {
                              break L4;
                            }
                            if (ol.a(false, (CharSequence) ((Object) var4)) >= 10) {
                              break L4;
                            }
                            this.a((byte) 79, "wrongjava");
                            if (var5 == 0) {
                              break L1;
                            }
                          }
                        }
                      }
                      if (PlatformTaskDispatcher.javaVersion == null) {
                        break L2;
                      }
                      stackIn_66_0 = PlatformTaskDispatcher.javaVersion.startsWith("1.");
                    }
                    if (stackIn_66_0) {
                      var1_int = 2;
                      var2_int = 0;
                      while (true) {
                        L11: {
                          if (~PlatformTaskDispatcher.javaVersion.length() < ~var1_int) {
                            var3 = PlatformTaskDispatcher.javaVersion.charAt(var1_int);
                            stackIn_78_0 = var3;
                            stackIn_78_1 = 48;
                            if (var5 != 0) {
                              break L11;
                            }
                            if ((stackIn_78_0 >= stackIn_78_1) &&
                                (var3 <= 57)) {
                              var2_int = 10 * var2_int - 48 + var3;
                              var1_int++;
                              if (var5 == 0) {
                                continue;
                              }
                            }
                          }
                          stackIn_78_0 = ~var2_int;
                          stackIn_78_1 = -6;
                        }
                        if (stackIn_78_0 > stackIn_78_1) {
                          break L2;
                        }
                        ResizableDialog.field_S = true;
                        break L2;
                      }
                    }
                  }
                  var1 = PrefixCodeDecoder.field_d;
                  if (null != kg.field_m) {
                    var1 = kg.field_m;
                  }
                  var2_ref = PlatformTaskDispatcher.setFocusCycleRootMethod;
                  if (null != var2_ref) {
                    try {
                      var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                    } catch (java.lang.Throwable decompiledCaughtParameter0) {
                      decompiledCaughtException = decompiledCaughtParameter0;
                      var3_ref_Throwable = decompiledCaughtException;
                    }
                  }
                  oc.a(75);
                  this.b(true);
                  SingleChildWidget.mainRasterBuffer = fk.createCanvasRasterBuffer(false, (java.awt.Component) ((Object) MessageDialog.gameCanvas), ok.field_c, kh.field_d);
                  this.initializeGame(117);
                  eg.field_p = BufferedSocket.createFrameClock(5000);
                  L17: while (true) {
                    L18: {
                      if (0L != MenuScreen.appletStopDeadlineMillis) {
                        stackIn_99_0 = $cfr$lcmp(~MenuScreen.appletStopDeadlineMillis, ~oa.a(-12520));
                        if (var5 != 0) {
                          break L18;
                        }
                        if (stackIn_99_0 >= 0) {
                          break L1;
                        }
                      }
                      TriangleMesh.field_w = eg.field_p.a((byte) -6, oj.field_c);
                      stackIn_99_0 = 0;
                    }
                    var3 = stackIn_99_0;
                    while (true) {
                      L21: {
                        if (TriangleMesh.field_w > var3) {
                          this.a((byte) -10);
                          var3++;
                          if (var5 != 0) {
                            break L21;
                          }
                          if (var5 == 0) {
                            continue;
                          }
                        }
                        this.d(32000);
                        OpacityWidget.a(MenuScreen.platformTaskDispatcher, (byte) 83, MessageDialog.gameCanvas);
                      }
                      if (var5 == 0) {
                        continue L17;
                      }
                      break L1;
                    }
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var1 = decompiledCaughtException;
                gi.a((Throwable) (var1), (String) null, (byte) 125);
                this.a((byte) 79, "crash");
              }
              this.a((byte) 14, true);
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var1 = (RuntimeException) (Object) decompiledCaughtException;
              throw InstrumentEnvelope.withFailureContext((Throwable) (var1), "ch.run()");
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.applet.AppletContext stackIn_8_0 = null;
        java.applet.AppletContext stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sg.field_a != null) {
            stackIn_2_0 = null;
            return (java.applet.AppletContext) ((Object) stackIn_2_0);
          }
          if ((kg.field_m != null) &&
              (this != kg.field_m)) {
            stackIn_8_0 = kg.field_m.getAppletContext();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getAppletContext();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "ch.getAppletContext()");
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final synchronized void b(boolean param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Geoblox.clientControlFlowFlag;
        try {
          if (MessageDialog.gameCanvas != null) {
            MessageDialog.gameCanvas.removeFocusListener((java.awt.event.FocusListener) (this));
            MessageDialog.gameCanvas.getParent().setBackground(java.awt.Color.black);
            MessageDialog.gameCanvas.getParent().remove((java.awt.Component) ((Object) MessageDialog.gameCanvas));
          }
          L1: {
            if (he.field_a == null) {
              if (null == sg.field_a) {
                if (kg.field_m != null) {
                  var2 = kg.field_m;
                  if (var4 == 0) {
                    break L1;
                  }
                }
                var2 = PrefixCodeDecoder.field_d;
                if (var4 == 0) {
                  break L1;
                }
              }
              var2 = sg.field_a;
              if (var4 == 0) {
                break L1;
              }
            }
            var2 = he.field_a;
          }
          L5: {
            ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
            MessageDialog.gameCanvas = (java.awt.Canvas) ((Object) new bh((java.awt.Component) (this)));
            ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) MessageDialog.gameCanvas));
            MessageDialog.gameCanvas.setSize(kh.field_d, ok.field_c);
            MessageDialog.gameCanvas.setVisible(param0);
            if (sg.field_a != var2) {
              MessageDialog.gameCanvas.setLocation(PrefixCodeDecoder.field_b, ButtonWidget.field_B);
              if (var4 == 0) {
                break L5;
              }
            }
            var3 = sg.field_a.getInsets();
            MessageDialog.gameCanvas.setLocation(var3.left + PrefixCodeDecoder.field_b, var3.top + ButtonWidget.field_B);
          }
          MessageDialog.gameCanvas.addFocusListener((java.awt.event.FocusListener) (this));
          MessageDialog.gameCanvas.requestFocus();
          lh.field_d = true;
          wc.field_g = true;
          dl.field_c = true;
          ab.field_a = false;
          Geoblox.canvasCreationTimeMillis = oa.a(-12520);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) (var2), "ch.H(" + param0 + ')');
        }
    }

    public final void start() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this == PrefixCodeDecoder.field_d) &&
              (!ad.field_p)) {
            MenuScreen.appletStopDeadlineMillis = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.start()");
        }
    }

    final static String a(Throwable param0, int param1) throws IOException {
        String var2;
        sa var3;
        StringWriter var3_ref;
        PrintWriter var4;
        String var5;
        BufferedReader var6;
        String var7;
        String var8;
        int var9;
        int var10;
        String var11;
        int var12;
        if (param0 instanceof sa) {
          var3 = (sa) ((Object) param0);
          param0 = var3.field_a;
          var2 = var3.field_d + " | ";
        } else {
          var2 = "";
        }
        var3_ref = new StringWriter();
        if (param1 != 1) {
          queuedMeshFaceCount = 61;
        }
        var4 = new PrintWriter((Writer) ((Object) var3_ref));
        param0.printStackTrace(var4);
        var4.close();
        var5 = var3_ref.toString();
        var6 = new BufferedReader((Reader) ((Object) new StringReader(var5)));
        var7 = var6.readLine();
        while (true) {
          var8 = var6.readLine();
          if (null == var8) {
            var2 = var2 + "| " + var7;
            return var2;
          }
          var9 = var8.indexOf('(');
          var10 = var8.indexOf(')', var9 + 1);
          if (-1 != var9) {
            var11 = var8.substring(0, var9);
          } else {
            var11 = var8;
          }
          var11 = var11.trim();
          var11 = var11.substring(var11.lastIndexOf(' ') + 1);
          var11 = var11.substring(1 + var11.lastIndexOf('\t'));
          var2 = var2 + var11;
          if ((var9 != -1) &&
              (-1 != var10)) {
            var12 = var8.indexOf(".java:", var9);
            if (var12 >= 0) {
              var2 = var2 + var8.substring(var12 + 5, var10);
            }
          }
          var2 = var2 + ' ';
          continue;
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    final boolean a(boolean param0) {
        return true;
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != sg.field_a) {
          return null;
        }
        if ((null != kg.field_m) &&
            (kg.field_m != this)) {
          return kg.field_m.getCodeBase();
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
          wc.field_g = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = (RuntimeException) (runtimeException);
          stackIn_5_1 = new StringBuilder().append("ch.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void initializeGame(int param0);

    private final void a(byte param0) {
        long var2_long = 0L;
        long var4 = 0L;
        Throwable decompiledCaughtException = null;
        RuntimeException var2 = null;
        Object var6 = null;
        try {
          if (param0 != -10) {
            queuedMeshFaceCount = -102;
          }
          var2_long = oa.a(param0 ^ 12526);
          var4 = tl.field_l[ij.field_cb];
          tl.field_l[ij.field_cb] = var2_long;
          ij.field_cb = 31 & 1 + ij.field_cb;
          if ((var4 != 0L) &&
              (var2_long > var4)) {
          }
          var6 = this;
          synchronized (var6) {
            lh.field_d = wc.field_g;
          }
          this.updateGame(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = (RuntimeException) (Object) decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "ch.L(" + param0 + ')');
        }
    }

    abstract void releaseGameResources(byte param0);

    public abstract void init();

    public final synchronized void paint(java.awt.Graphics param0) {
        java.awt.Rectangle var2 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        try {
          if ((PrefixCodeDecoder.field_d == this) &&
              (!ad.field_p)) {
            dl.field_c = true;
            if ((ResizableDialog.field_S) &&
                (-Geoblox.canvasCreationTimeMillis + oa.a(-12520) > 1000L)) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (~var2.width > ~qb.field_G) {
                  return;
                }
                if (NetworkArchiveRequest.field_w > var2.height) {
                  return;
                }
              }
              ab.field_a = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_25_0 = (RuntimeException) (var2_ref);
          stackIn_25_1 = new StringBuilder().append("ch.paint(");
          if (param0 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void destroy() {
        if (PrefixCodeDecoder.field_d != this || ad.field_p) {
            return;
        }
        try {
            MenuScreen.appletStopDeadlineMillis = oa.a(-12520);
            bc.sleepMillis(0, 5000L);
            ml.field_s = null;
            this.a((byte) 14, false);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.destroy()");
        }
    }

    abstract void updateGame(boolean param0);

    final void a(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
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
            var9 = Geoblox.clientControlFlowFlag;
            try {
              try {
                L0: {
                  if (PrefixCodeDecoder.field_d != null) {
                    wg.field_j = wg.field_j + 1;
                    if (wg.field_j < 3) {
                      this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                      return;
                    }
                    this.a((byte) 79, "alreadyloaded");
                    return;
                  }
                  SocketArchiveNetworkClient.field_t = param2;
                  ok.field_c = param3;
                  NetworkArchiveRequest.field_w = param3;
                  PrefixCodeDecoder.field_b = 0;
                  ButtonWidget.field_B = 0;
                  kh.field_d = param4;
                  qb.field_G = param4;
                  PrefixCodeDecoder.field_d = (ch) (this);
                  GameScreen.errorReportApplet = k.c(107);
                  if (param1 != -14948) {
                    return;
                  }
                  dupTemp$0 = new PlatformTaskDispatcher(param0, param5, param6, true);
                  MenuScreen.platformTaskDispatcher = dupTemp$0;
                  ml.field_s = dupTemp$0;
                  var8 = MenuScreen.platformTaskDispatcher.startThread((Runnable) (this), 0, 1);
                  while (true) {
                    if (var8.status == 0) {
                      bc.sleepMillis(0, 10L);
                      if (!(var9 != 0)) {
                        if (var9 == 0) {
                          continue;
                        }
                      }
                    }
                    break L0;
                  }
                }
              } catch (java.lang.Throwable decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var8_ref = decompiledCaughtException;
                gi.a(var8_ref, (String) null, (byte) 125);
                this.a((byte) 79, "crash");
              }
              return;
            } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
              stackIn_23_0 = (RuntimeException) (var8_ref2);
              stackIn_23_1 = new StringBuilder().append("ch.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
              if (param5 == null) {
                stackIn_24_2 = "null";
              } else {
                stackIn_24_2 = "{...}";
              }
              throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param6).append(')').toString());
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final String getParameter(String param0) {
        RuntimeException var2 = null;
        Object stackIn_4_0 = null;
        String stackIn_10_0 = null;
        String stackIn_12_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (sg.field_a != null) {
            stackIn_4_0 = null;
            return (String) ((Object) stackIn_4_0);
          }
          if ((kg.field_m != null) &&
              (this != kg.field_m)) {
            stackIn_10_0 = kg.field_m.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = (RuntimeException) (var2);
          stackIn_16_1 = new StringBuilder().append("ch.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    private final void d(int param0) {
        int fieldTemp$1 = 0;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          if (param0 != 32000) {
            this.windowActivated((java.awt.event.WindowEvent) null);
          }
          var2_long = oa.a(param0 - 44520);
          var4 = ArchiveRequest.field_p[GzipInflater.field_k];
          ArchiveRequest.field_p[GzipInflater.field_k] = var2_long;
          GzipInflater.field_k = 31 & GzipInflater.field_k + 1;
          if ((0L != var4) &&
              (var4 < var2_long)) {
            var6_int = (int)(-var4 + var2_long);
            ec.field_b = (32000 + (var6_int >> 1)) / var6_int;
          }
          L2: {
            fieldTemp$1 = rj.field_i;
            rj.field_i = rj.field_i + 1;
            if (fieldTemp$1 > 50) {
              rj.field_i = rj.field_i - 50;
              dl.field_c = true;
              MessageDialog.gameCanvas.setSize(kh.field_d, ok.field_c);
              MessageDialog.gameCanvas.setVisible(true);
              if (!((sg.field_a != null) &&
                  (he.field_a == null))) {
                MessageDialog.gameCanvas.setLocation(PrefixCodeDecoder.field_b, ButtonWidget.field_B);
                if (Geoblox.clientControlFlowFlag == 0) {
                  break L2;
                }
              }
              var6 = sg.field_a.getInsets();
              MessageDialog.gameCanvas.setLocation(var6.left + PrefixCodeDecoder.field_b, ButtonWidget.field_B + var6.top);
            }
          }
          this.renderFrame(25853);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var2), "ch.F(" + param0 + ')');
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if ((this == PrefixCodeDecoder.field_d) &&
              (!ad.field_p)) {
            MenuScreen.appletStopDeadlineMillis = 4000L + oa.a(-12520);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "ch.stop()");
        }
    }

    abstract void renderFrame(int param0);

    abstract void serviceAudio(int param0);

    protected ch() {
        this.field_a = false;
    }

    static {
        queuedMeshFaceCount = 0;
        meshFaceCountsByDepthBucket = new int[1024];
    }

    private static int $cfr$lcmp(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
