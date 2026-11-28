/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameAppletShell extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_d;
    static RgbSprite field_i;
    boolean field_c;
    static PacketBuffer field_h;
    static int field_k;
    public static int field_g;
    public static int field_e;
    public static boolean field_l;
    public static boolean field_f;
    public static int field_a;
    public static int field_j;
    public static boolean field_b;

    static int a(int param0, int param1) {
        int stackIn_1_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          stackIn_1_0 = param0 | param1;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) var2), "li.GA(" + param0 + ',' + param1 + ')');
        }
    }

    public final void start() {
        if (hh.field_e != this ||
          ai.field_B) {
          return;
        }
        try {
          sf.field_j = 0L;
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.start()");
        }
    }

    private final void renderAppletFrame(int param0) {
        int fieldTemp$1 = 0;
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        java.awt.Insets var6 = null;
        try {
          var2_long = la.correctedCurrentTimeMillis(false);
          var4 = ph.field_g[lf.field_a];
          ph.field_g[lf.field_a] = var2_long;
          lf.field_a = 31 & lf.field_a + 1;
          if (var4 != 0L &&
            var2_long > var4) {
            var6_int = (int)(-var4 + var2_long);
            pc.field_a = ((var6_int >> 1) + 32000) / var6_int;
          }
          if (param0 != 31180) {
            field_d = (String) null;
          }
          fieldTemp$1 = qh.field_b;
          qh.field_b = qh.field_b + 1;
          if (fieldTemp$1 > 50) {
            eh.field_a = true;
            qh.field_b = qh.field_b - 50;
            DiskCacheWorker.field_g.setSize(fg.field_h, ByteStorage.field_a);
            DiskCacheWorker.field_g.setVisible(true);
            if (bb.field_a != null &&
              null == AccountCreationResultPanel.field_Gb) {
              var6 = bb.field_a.getInsets();
              DiskCacheWorker.field_g.setLocation(tg.field_b + var6.left, hg.field_pb + var6.top);
              if (DrPhlogistonSavesTheEarth.field_D) {
                DiskCacheWorker.field_g.setLocation(tg.field_b, hg.field_pb);
              }
            } else {
              DiskCacheWorker.field_g.setLocation(tg.field_b, hg.field_pb);
            }
          }
          this.renderClientFrame(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.NA(" + param0 + ')');
        }
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_79_1 = 0;
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
          var5 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (null != PlatformTaskDispatcher.field_n) {
                var1 = PlatformTaskDispatcher.field_n.toLowerCase();
                if (-1 != ((String) (var1)).indexOf("sun") ||
                  ((String) (var1)).indexOf("apple") != -1) {
                  var2 = PlatformTaskDispatcher.field_t;
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
                    this.showErrorPage(-51, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if ((decompiledFrameRemainder3) &&
                    (var2.startsWith("1.6.0_"))) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = ArchiveRequest.a(var2.charAt(var3), true);
                      if (var5 != 0) {
                        decompiledFrameCompleted0 = false;
                        break;
                      }
                      if (stackIn_66_0) {
                        var3++;
                        continue;
                      }
                      break;
                    }
                    if (decompiledFrameCompleted0) {
                      var4 = var2.substring(6, var3);
                      if (ContentTransitionDialog.a((CharSequence) ((Object) var4), 7552) &&
                        !(hh.a(10, (CharSequence) ((Object) var4)) >= 10)) {
                        this.showErrorPage(-51, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (((decompiledFrameRemainder3) && (decompiledFrameCompleted0)) &&
                (decompiledFrameRemainder2 = (null != PlatformTaskDispatcher.field_t))) {
                stackIn_66_0 = PlatformTaskDispatcher.field_t.startsWith("1.");
              }
              if ((decompiledFrameRemainder3) &&
                (decompiledFrameRemainder2) &&
                (stackIn_66_0)) {
                var1_int = 2;
                var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (PlatformTaskDispatcher.field_t.length() > var1_int) {
                    var3 = PlatformTaskDispatcher.field_t.charAt(var1_int);
                    stackIn_79_0 = -49;
                    stackIn_79_1 = ~var3;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if ((decompiledFrameRemainder1) && (stackIn_79_0 >= stackIn_79_1 &&
                      57 >= var3)) {
                      var1_int++;
                      var2_int = var2_int * 10 - 48 + var3;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_79_0 = var2_int;
                    stackIn_79_1 = 5;
                  }
                  if (stackIn_79_0 < stackIn_79_1) {
                    break;
                  }
                  MidiPcmStream.field_x = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = hh.field_e;
                if (null != wi.field_d) {
                  var1 = wi.field_d;
                }
                var2_ref = PlatformTaskDispatcher.field_g;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                b.e(-117);
                this.f(118);
                ArchiveRequest.field_C = al.a((byte) -73, fg.field_h, (java.awt.Component) ((Object) DiskCacheWorker.field_g), ByteStorage.field_a);
                this.initializeClient(32);
                BufferedSocket.field_e = ProxyAuthenticationRequiredException.a(65280);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (sf.field_j != 0L) {
                    stackIn_100_0 = compareLongs(~la.correctedCurrentTimeMillis(false), ~sf.field_j);
                    decompiledFrameRemainder0 = (var5 == 0);
                    if ((decompiledFrameRemainder0) &&
                      (stackIn_100_0 <= 0)) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    jj.field_b = BufferedSocket.field_e.waitAndCountTicks(ProgressMessageDialog.field_vb, 1);
                    stackIn_100_0 = 0;
                  }
                  var3 = stackIn_100_0;
                  do {
                    if (!(var3 < jj.field_b)) {
                      this.renderAppletFrame(31180);
                      oh.a(sb.field_d, 1, DiskCacheWorker.field_g);
                      break;
                    }
                    this.processClientTick((byte) -17);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              ArchiveNetworkClient.a((Throwable) (var1), (String) null, 10);
              this.showErrorPage(-51, "crash");
            }
            this.shutdownApplet(0, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw ie.wrapClientException((Throwable) (var1), "li.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    final static void b(int param0) {
        try {
          int var1_int = 127 % ((param0 + 31) / 32);
          ck.a(0, 5, 1, true);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.DA(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          NetworkArchiveRequest.field_J = true;
          eh.field_a = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("li.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void renderClientFrame(int param0);

    public final java.net.URL getDocumentBase() {
        RuntimeException var1 = null;
        Object stackIn_2_0 = null;
        java.net.URL stackIn_8_0 = null;
        java.net.URL stackIn_10_0 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (bb.field_a != null) {
            stackIn_2_0 = null;
            return (java.net.URL) (stackIn_2_0);
          }
          if (null != wi.field_d &&
            wi.field_d != this) {
            stackIn_8_0 = wi.field_d.getDocumentBase();
            return stackIn_8_0;
          }
          stackIn_10_0 = super.getDocumentBase();
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) var1), "li.getDocumentBase()");
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          wi.field_d = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("li.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final static boolean d(int param0) {
        RuntimeException var1 = null;
        boolean stackIn_18_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (gf.field_C == -1) {
            if (!NameSuggestionsPanel.a(1, param0 + 35356)) {
              return false;
            }
            gf.field_C = LabeledWidgetContainer.field_N.readUnsignedByte(31760);
            LabeledWidgetContainer.field_N.position = 0;
          }
          if (-2 == gf.field_C) {
            if (!NameSuggestionsPanel.a(2, 5929)) {
              return false;
            }
            gf.field_C = LabeledWidgetContainer.field_N.readUnsignedShort(-788751192);
            LabeledWidgetContainer.field_N.position = 0;
          }
          if (param0 != -29427) {
            field_h = (PacketBuffer) null;
          }
          stackIn_18_0 = NameSuggestionsPanel.a(gf.field_C, 5929);
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) var1), "li.OA(" + param0 + ')');
        }
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        RuntimeException stackIn_27_0 = null;
        StringBuilder stackIn_27_1 = null;
        String stackIn_28_2 = null;
        RuntimeException decompiledCaughtException = null;
        java.awt.Rectangle var2 = null;
        RuntimeException var2_ref = null;
        try {
          if (hh.field_e == this &&
            !ai.field_B) {
            eh.field_a = true;
            if (MidiPcmStream.field_x &&
              -DebouncedFieldValidator.field_c + la.correctedCurrentTimeMillis(false) > 1000L) {
              var2 = param0.getClipBounds();
              if (null != var2) {
                if (kj.field_a > var2.width) {
                  return;
                }
                if (var2.height < IsaacRandom.field_c) {
                  return;
                }
              }
              ValidationStatusWidget.field_U = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_27_0 = var2_ref;
          stackIn_27_1 = new StringBuilder().append("li.paint(");
          if (param0 == null) {
            stackIn_28_2 = "null";
          } else {
            stackIn_28_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_27_0), ((StringBuilder) (Object) stackIn_27_1).append(stackIn_28_2).append(')').toString());
        }
    }

    public final void stop() {
        RuntimeException runtimeException = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (hh.field_e == this &&
            !ai.field_B) {
            sf.field_j = 4000L + la.correctedCurrentTimeMillis(false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.stop()");
        }
    }

    final static void a(byte[] param0, int param1, int[] param2, int param3, int param4) {
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        byte dupTemp$2 = 0;
        int dupTemp$3 = 0;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (param1 < 47) {
            field_k = 123;
          }
          var5_int = 0;
          while (of.field_w.length > var5_int) {
            param4 = of.field_w[var5_int];
            if (var7 != 0) {
              return;
            }
            var6 = var5_int << 4;
            while (true) {
              incrementValue$0 = param4;
              param4--;
              if (incrementValue$0 != 0) {
                incrementValue$1 = var6;
                var6++;
                param3 = p.field_c[incrementValue$1];
                dupTemp$2 = param0[param3];
                dupTemp$3 = param2[dupTemp$2];
                param2[dupTemp$2] = dupTemp$3 + 1;
                p.field_c[dupTemp$3] = param3;
                continue;
              }
              break;
            }
            var5_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_19_0 = var5;
          stackIn_19_1 = new StringBuilder().append("li.KA(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    abstract void clearClientResources(boolean param0);

    final static void b(byte param0) {
        RuntimeException runtimeException = null;
        Object var1 = null;
        int var2 = 0;
        int var4 = 0;
        int stackIn_28_0 = 0;
        Throwable decompiledCaughtException = null;
        Object var1_ref = null;
        int var2Lifetime1;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var1_ref = ji.field_c;
          synchronized (var1_ref) {
            if (param0 != -81) {
              return;
            }
            boolean decompiledFrameCompleted0 = true;
            boolean decompiledFrameRemainder0 = true;
            rc.field_g = vb.field_l;
            dk.field_c = dk.field_c + 1;
            if (ValidationStatusIcon.field_O < 0) {
              var2 = 0;
              while (true) {
                if (var2 < 112) {
                  ck.field_f[var2] = false;
                  var2++;
                  if (var4 == 0) {
                    continue;
                  }
                } else {
                  ValidationStatusIcon.field_O = b.field_l;
                }
                break;
              }
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              while (true) {
                if (~ValidationStatusIcon.field_O == ~b.field_l) {
                  break;
                }
                var2Lifetime1 = ProxyAuthenticationRequiredException.field_f[b.field_l];
                b.field_l = 127 & b.field_l + 1;
                stackIn_28_0 = -1;
                if (var4 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_28_0 < ~var2Lifetime1) {
                  ck.field_f[~var2Lifetime1] = false;
                } else {
                  ck.field_f[var2Lifetime1] = true;
                }
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_28_0 = DirectByteStorage.field_j;
            }
            vb.field_l = stackIn_28_0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.V(" + param0 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void focusLost(java.awt.event.FocusEvent param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          NetworkArchiveRequest.field_J = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_5_0 = runtimeException;
          stackIn_5_1 = new StringBuilder().append("li.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    private final void shutdownApplet(int param0, boolean param1) {
        Exception exception = null;
        RuntimeException runtimeException = null;
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Object var3_ref = null;
        Throwable var3_ref2 = null;
        try {
          var3_ref = this;
          synchronized (var3_ref) {
            if (ai.field_B) {
              return;
            }
            ai.field_B = true;
          }
          if (wi.field_d != null) {
            wi.field_d.destroy();
          }
          if (param0 != 0) {
            this.startApplet(-127, -17, -46, -55, -40, (String) null, 12);
          }
          try {
            this.disposeClient((byte) -126);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            exception = (Exception) (Object) decompiledCaughtException;
          }
          if (DiskCacheWorker.field_g != null) {
            try {
              DiskCacheWorker.field_g.removeFocusListener((java.awt.event.FocusListener) (this));
              DiskCacheWorker.field_g.getParent().remove((java.awt.Component) ((Object) DiskCacheWorker.field_g));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (null != sb.field_d) {
            try {
              sb.field_d.shutdown((byte) 53);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              exception = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.clearClientResources(false);
          if (null != bb.field_a) {
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
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.HA(" + param0 + ',' + param1 + ')');
        }
    }

    final synchronized void f(int param0) {
        Object var2 = null;
        java.awt.Insets var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          if (DiskCacheWorker.field_g != null) {
            DiskCacheWorker.field_g.removeFocusListener((java.awt.event.FocusListener) (this));
            DiskCacheWorker.field_g.getParent().setBackground(java.awt.Color.black);
            DiskCacheWorker.field_g.getParent().remove((java.awt.Component) ((Object) DiskCacheWorker.field_g));
          }
          boolean decompiledFrameRemainder0 = true;
          if (AccountCreationResultPanel.field_Gb == null) {
            if (bb.field_a != null) {
              var2 = bb.field_a;
              decompiledFrameRemainder0 = (var4 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (wi.field_d != null) {
                var2 = wi.field_d;
                if (var4 != 0) {
                  var2 = hh.field_e;
                  var2 = AccountCreationResultPanel.field_Gb;
                }
              } else {
                var2 = hh.field_e;
                if (var4 != 0) {
                  var2 = AccountCreationResultPanel.field_Gb;
                }
              }
            }
          } else {
            var2 = AccountCreationResultPanel.field_Gb;
          }
          ((java.awt.Container) (var2)).setLayout((java.awt.LayoutManager) null);
          DiskCacheWorker.field_g = (java.awt.Canvas) ((Object) new DelegatingCanvas((java.awt.Component) (this)));
          ((java.awt.Container) (var2)).add((java.awt.Component) ((Object) DiskCacheWorker.field_g));
          DiskCacheWorker.field_g.setSize(fg.field_h, ByteStorage.field_a);
          DiskCacheWorker.field_g.setVisible(true);
          boolean decompiledSharedTail0 = (bb.field_a == var2);
          if (!decompiledSharedTail0) {
            DiskCacheWorker.field_g.setLocation(tg.field_b, hg.field_pb);
            decompiledSharedTail0 = (var4 != 0);
          }
          if (decompiledSharedTail0) {
            var3 = bb.field_a.getInsets();
            DiskCacheWorker.field_g.setLocation(tg.field_b + var3.left, hg.field_pb + var3.top);
          }
          DiskCacheWorker.field_g.addFocusListener((java.awt.event.FocusListener) (this));
          DiskCacheWorker.field_g.requestFocus();
          DequeWidgetContainer.field_C = true;
          NetworkArchiveRequest.field_J = true;
          eh.field_a = true;
          ValidationStatusWidget.field_U = false;
          if (param0 <= 108) {
            return;
          }
          DebouncedFieldValidator.field_c = la.correctedCurrentTimeMillis(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) (var2), "li.FA(" + param0 + ')');
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    abstract void updateClient(byte param0);

    abstract void disposeClient(byte param0);

    final boolean allowAppletStartup(int param0) {
        return true;
    }

    public static void c(int param0) {
        try {
          field_h = null;
          field_i = null;
          field_d = null;
          if (param0 != -1) {
            field_k = 117;
          }
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.U(" + param0 + ')');
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
          stackIn_5_1 = new StringBuilder().append("li.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final void showErrorPage(int param0, String param1) {
        try {
          RuntimeException stackIn_15_0 = null;
          StringBuilder stackIn_15_1 = null;
          String stackIn_16_2 = null;
          Throwable decompiledCaughtException = null;
          Throwable var3 = null;
          Exception var3_ref = null;
          RuntimeException var3_ref2 = null;
          try {
            if (this.field_c) {
              return;
            }
            this.field_c = true;
            System.out.println("error_game_" + param1);
            if (param0 != -51) {
              field_d = (String) null;
            }
            try {
              JavaScriptBridge.callWithoutArguments("loggedout", nb.a(param0 - 64), true);
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
            stackIn_15_0 = var3_ref2;
            stackIn_15_1 = new StringBuilder().append("li.JA(").append(param0).append(',');
            if (param1 == null) {
              stackIn_16_2 = "null";
            } else {
              stackIn_16_2 = "{...}";
            }
            throw ie.wrapClientException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void processClientTick(byte param0) {
        RuntimeException runtimeException = null;
        long var2_long = 0L;
        long var4 = 0L;
        int var6_int = 0;
        Throwable decompiledCaughtException = null;
        Object var6 = null;
        try {
          var2_long = la.correctedCurrentTimeMillis(false);
          var4 = wi.field_b[BufferedRandomAccessFile.field_f];
          wi.field_b[BufferedRandomAccessFile.field_f] = var2_long;
          if (0L != var4 &&
            var4 < var2_long) {
            var6_int = (int)(-var4 + var2_long);
            qj.field_c = ((var6_int >> 1) + 32000) / var6_int;
          }
          BufferedRandomAccessFile.field_f = 31 & 1 + BufferedRandomAccessFile.field_f;
          var6 = this;
          synchronized (var6) {
            DequeWidgetContainer.field_C = NetworkArchiveRequest.field_J;
            if (param0 != -17) {
              field_i = (RgbSprite) null;
            }
          }
          this.updateClient((byte) 35);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.IA(" + param0 + ')');
        }
    }

    public final void destroy() {
        if (this != hh.field_e ||
          ai.field_B) {
          return;
        }
        try {
          sf.field_j = la.correctedCurrentTimeMillis(false);
          kk.sleepMillis(5000L, true);
          DiskCacheWorker.field_h = null;
          this.shutdownApplet(0, false);
        } catch (RuntimeException runtimeException) {
          throw ie.wrapClientException((Throwable) ((Object) runtimeException), "li.destroy()");
        }
    }

    protected GameAppletShell() {
        this.field_c = false;
    }

    final void startApplet(int param0, int param1, int param2, int param3, int param4, String param5, int param6) {
        try {
          PlatformTaskDispatcher dupTemp$0 = null;
          RuntimeException stackIn_24_0 = null;
          StringBuilder stackIn_24_1 = null;
          String stackIn_25_2 = null;
          Throwable decompiledCaughtException = null;
          PlatformTask var8 = null;
          Throwable var8_ref = null;
          RuntimeException var8_ref2 = null;
          int var9 = 0;
          var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            try {
              if (null != hh.field_e) {
                wl.field_a = wl.field_a + 1;
                if (wl.field_a < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.showErrorPage(-51, "alreadyloaded");
                return;
              }
              hg.field_pb = 0;
              tg.field_b = 0;
              vb.field_o = param2;
              ByteStorage.field_a = param4;
              IsaacRandom.field_c = param4;
              hh.field_e = this;
              if (param0 != -4) {
                field_i = (RgbSprite) null;
              }
              fg.field_h = param6;
              kj.field_a = param6;
              LevelSession.field_K = nb.a(-84);
              dupTemp$0 = new PlatformTaskDispatcher(param3, param5, param1, true);
              sb.field_d = dupTemp$0;
              DiskCacheWorker.field_h = dupTemp$0;
              var8 = sb.field_d.requestThreadStart((Runnable) (this), 1, (byte) -128);
              while (true) {
                if (var8.status == 0) {
                  kk.sleepMillis(10L, true);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var8_ref = decompiledCaughtException;
              ArchiveNetworkClient.a(var8_ref, (String) null, 10);
              this.showErrorPage(param0 - 47, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_24_0 = var8_ref2;
            stackIn_24_1 = new StringBuilder().append("li.CA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
            if (param5 == null) {
              stackIn_25_2 = "null";
            } else {
              stackIn_25_2 = "{...}";
            }
            throw ie.wrapClientException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param6).append(')').toString());
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
          if (null != bb.field_a) {
            stackIn_4_0 = null;
            return (java.applet.AppletContext) (stackIn_4_0);
          }
          if (null != wi.field_d &&
            wi.field_d != this) {
            stackIn_12_0 = wi.field_d.getAppletContext();
            return stackIn_12_0;
          }
          stackIn_14_0 = super.getAppletContext();
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ie.wrapClientException((Throwable) ((Object) var1), "li.getAppletContext()");
        }
    }

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (null != bb.field_a) {
          return null;
        }
        if (wi.field_d != null &&
          wi.field_d != this) {
          return wi.field_d.getCodeBase();
        }
        return super.getCodeBase();
    }

    abstract void initializeClient(int param0);

    public abstract void init();

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
          stackIn_5_1 = new StringBuilder().append("li.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
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
          if (null != bb.field_a) {
            stackIn_2_0 = null;
            return (String) (stackIn_2_0);
          }
          if (null != wi.field_d &&
            this != wi.field_d) {
            stackIn_10_0 = wi.field_d.getParameter(param0);
            return stackIn_10_0;
          }
          stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("li.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ie.wrapClientException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    static {
        field_d = "Please send me news and updates (I can unsubscribe at any time)";
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
