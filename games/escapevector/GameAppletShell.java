/*
 * Decompiled by CFR-JS 0.4.0.
 */
public abstract class GameAppletShell extends java.applet.Applet implements Runnable, java.awt.event.FocusListener, java.awt.event.WindowListener {
    static String field_f;
    boolean field_b;
    static String field_g;
    static boolean field_k;
    static int field_a;
    public static boolean field_h;
    public static boolean field_l;
    public static int field_e;
    public static int field_i;
    public static int field_d;
    public static boolean field_c;
    public static boolean field_j;

    final boolean a(boolean param0) {
        return true;
    }

    public final void windowDeiconified(java.awt.event.WindowEvent param0) {
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, String param6) {
        try {
          String stackIn_22_2 = null;
          Throwable decompiledCaughtException = null;
          int var9 = EscapeVector.obfuscationControl;
          try {
            try {
              if (null != he.field_r) {
                DynamicTerrainRenderer.field_b = DynamicTerrainRenderer.field_b + 1;
                if (DynamicTerrainRenderer.field_b < 3) {
                  this.getAppletContext().showDocument(this.getDocumentBase(), "_self");
                  return;
                }
                this.a(-1, "alreadyloaded");
                return;
              }
              pd.field_b = param3;
              j.field_b = param3;
              BoundedUrlRequest.field_d = param4;
              qa.field_G = param4;
              he.field_r = this;
              Js5NetworkRequest.field_D = 0;
              pb.field_b = 0;
              uf.field_n = param0;
              IntrusiveNode.field_c = PointCloudEffect.d((byte) -109);
              SystemTaskService dupTemp$1 = new SystemTaskService(param5, param6, param1, true);
              NetworkGameClient.field_r = dupTemp$1;
              ae.field_a = dupTemp$1;
              SystemTask var8 = NetworkGameClient.field_r.a(true, param2, (Runnable) (this));
              while (true) {
                if (var8.field_f == 0) {
                  en.a((byte) 100, 10L);
                  if (var9 == 0) {
                    continue;
                  }
                }
                break;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              Throwable var8_ref = decompiledCaughtException;
              pf.a(false, (String) null, var8_ref);
              this.a(-1, "crash");
            }
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter1) {
            decompiledCaughtException = decompiledCaughtParameter1;
            RuntimeException var8_ref2 = (RuntimeException) (Object) decompiledCaughtException;
            RuntimeException stackIn_21_0 = var8_ref2;
            StringBuilder stackIn_21_1 = new StringBuilder().append("eh.M(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
            if (param6 == null) {
              stackIn_22_2 = "null";
            } else {
              stackIn_22_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final java.net.URL getDocumentBase() {
        try {
          if (qj.field_i != null) {
            Object stackIn_4_0 = null;
            return (java.net.URL) (stackIn_4_0);
          }
          if (null != bb.field_P &&
            bb.field_P != this) {
            java.net.URL stackIn_10_0 = bb.field_P.getDocumentBase();
            return stackIn_10_0;
          }
          java.net.URL stackIn_12_0 = super.getDocumentBase();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "eh.getDocumentBase()");
        }
    }

    abstract void b(boolean param0);

    abstract void releaseClientStatics(byte guard);

    public final void focusLost(java.awt.event.FocusEvent param0) {
        String stackIn_6_2 = null;
        try {
          qd.field_l = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.focusLost(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public static void d(byte param0) {
        try {
          field_g = null;
          if (param0 != -111) {
            field_k = false;
          }
          field_f = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "eh.Q(" + param0 + ')');
        }
    }

    public final java.applet.AppletContext getAppletContext() {
        try {
          if (null != qj.field_i) {
            Object stackIn_2_0 = null;
            return (java.applet.AppletContext) (stackIn_2_0);
          }
          if (null != bb.field_P &&
            this != bb.field_P) {
            java.applet.AppletContext stackIn_10_0 = bb.field_P.getAppletContext();
            return stackIn_10_0;
          }
          java.applet.AppletContext stackIn_12_0 = super.getAppletContext();
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var1), "eh.getAppletContext()");
        }
    }

    private final void a(int param0) {
        try {
          long var2_long = td.b(128);
          long var4 = CipherPacketBuffer.field_t[r.field_z];
          CipherPacketBuffer.field_t[r.field_z] = var2_long;
          r.field_z = 31 & r.field_z + 1;
          if (param0 != 48) {
            field_a = -22;
          }
          if (var4 != 0L &&
            var2_long > var4) {
            int var6_int = (int)(var2_long - var4);
            qf.field_j = ((var6_int >> 1) + 32000) / var6_int;
          }
          Object var6 = this;
          synchronized (var6) {
            ObjectSpriteSet.field_b = qd.field_l;
          }
          this.updateClient(-111);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          Throwable decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "eh.N(" + param0 + ')');
        }
    }

    public final void stop() {
        if (he.field_r != this ||
          rl.field_j) {
          return;
        }
        try {
          me.field_p = 4000L + td.b(128);
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "eh.stop()");
        }
    }

    final static boolean a(int param0, char param1) {
        int stackIn_28_0 = 0;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if ((param1 <= 0 ||
            param1 >= 128) &&
            (param1 < 160 ||
            param1 > 255)) {
            boolean decompiledFrameCompleted0 = true;
            if (param1 != param0) {
              char[] var2_array = IntrusiveDeque.field_c;
              int var3 = 0;
              while (var2_array.length > var3) {
                int var4 = var2_array[var3];
                stackIn_28_0 = ~param1;
                if (var5 != 0) {
                  decompiledFrameCompleted0 = false;
                  break;
                }
                if (stackIn_28_0 == ~var4) {
                  return true;
                }
                var3++;
              }
            }
            if (decompiledFrameCompleted0) {
              stackIn_28_0 = 0;
            }
            return stackIn_28_0 != 0;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "eh.K(" + param0 + ',' + param1 + ')');
        }
    }

    abstract void updateClient(int guard);

    final void a(int param0, String param1) {
        try {
          String stackIn_19_2 = null;
          Throwable decompiledCaughtException = null;
          try {
            if (param0 != -1) {
              field_k = true;
            }
            if (this.field_b) {
              return;
            }
            this.field_b = true;
            System.out.println("error_game_" + param1);
            try {
              JavaScriptBridge.callWindowFunction(PointCloudEffect.d((byte) -87), "loggedout", -29155);
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
            RuntimeException stackIn_18_0 = var3_ref2;
            StringBuilder stackIn_18_1 = new StringBuilder().append("eh.F(").append(param0).append(',');
            if (param1 == null) {
              stackIn_19_2 = "null";
            } else {
              stackIn_19_2 = "{...}";
            }
            throw t.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    public final void destroy() {
        try {
          if (this == he.field_r &&
            !rl.field_j) {
            me.field_p = td.b(128);
            en.a((byte) 100, 5000L);
            ae.field_a = null;
            this.a((byte) 107, false);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "eh.destroy()");
        }
    }

    public final String getParameter(String param0) {
        String stackIn_17_2 = null;
        try {
          if (null != qj.field_i) {
            Object stackIn_4_0 = null;
            return (String) (stackIn_4_0);
          }
          if (bb.field_P != null &&
            this != bb.field_P) {
            String stackIn_10_0 = bb.field_P.getParameter(param0);
            return stackIn_10_0;
          }
          String stackIn_12_0 = super.getParameter(param0);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          RuntimeException stackIn_16_0 = var2;
          StringBuilder stackIn_16_1 = new StringBuilder().append("eh.getParameter(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    public final void windowDeactivated(java.awt.event.WindowEvent param0) {
    }

    public final void run() {
        try {
          boolean stackIn_66_0 = false;
          int stackIn_79_0 = 0;
          int stackIn_79_1 = 0;
          int stackIn_98_0 = 0;
          Throwable decompiledCaughtException = null;
          Object var1 = null;
          int var3 = 0;
          int var5 = EscapeVector.obfuscationControl;
          try {
            try {
              boolean decompiledFrameRemainder3 = true;
              boolean decompiledFrameRemainder2 = true;
              boolean decompiledFrameCompleted0 = true;
              if (SystemTaskService.field_s != null) {
                var1 = SystemTaskService.field_s.toLowerCase();
                if (((String) (var1)).indexOf("sun") != -1 ||
                  -1 != ((String) (var1)).indexOf("apple")) {
                  String var2 = SystemTaskService.field_v;
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
                    this.a(-1, "wrongjava");
                    decompiledFrameRemainder3 = (var5 != 0);
                  }
                  if (decompiledFrameRemainder3 &&
                    var2.startsWith("1.6.0_")) {
                    var3 = 6;
                    while (var3 < var2.length()) {
                      stackIn_66_0 = on.a(var2.charAt(var3), false);
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
                      String var4 = var2.substring(6, var3);
                      if (fk.a(false, (CharSequence) ((Object) var4)) &&
                        !(gn.a(16777215, (CharSequence) ((Object) var4)) >= 10)) {
                        this.a(-1, "wrongjava");
                        decompiledFrameRemainder3 = (var5 != 0);
                      }
                    }
                  }
                }
              }
              if (decompiledFrameRemainder3 && decompiledFrameCompleted0 &&
                (decompiledFrameRemainder2 = (null != SystemTaskService.field_v))) {
                stackIn_66_0 = SystemTaskService.field_v.startsWith("1.");
              }
              if (decompiledFrameRemainder3 &&
                decompiledFrameRemainder2 &&
                stackIn_66_0) {
                int var1_int = 2;
                int var2_int = 0;
                while (true) {
                  boolean decompiledFrameRemainder1 = true;
                  if (SystemTaskService.field_v.length() > var1_int) {
                    var3 = SystemTaskService.field_v.charAt(var1_int);
                    stackIn_79_0 = ~var3;
                    stackIn_79_1 = -49;
                    decompiledFrameRemainder1 = (var5 == 0);
                    if (decompiledFrameRemainder1 && (stackIn_79_0 <= stackIn_79_1 &&
                      57 >= var3)) {
                      var1_int++;
                      var2_int = var3 - 48 + var2_int * 10;
                      continue;
                    }
                  }
                  if (decompiledFrameRemainder1) {
                    stackIn_79_0 = -6;
                    stackIn_79_1 = ~var2_int;
                  }
                  if (stackIn_79_0 < stackIn_79_1) {
                    break;
                  }
                  dh.field_c = true;
                  break;
                }
              }
              if (decompiledFrameRemainder3) {
                var1 = he.field_r;
                if (bb.field_P != null) {
                  var1 = bb.field_P;
                }
                java.lang.reflect.Method var2_ref = SystemTaskService.field_r;
                if (var2_ref != null) {
                  try {
                    var2_ref.invoke(var1, new Object[]{Boolean.TRUE});
                  } catch (java.lang.Throwable decompiledCaughtParameter0) {
                    decompiledCaughtException = decompiledCaughtParameter0;
                    Throwable var3_ref_Throwable = decompiledCaughtException;
                  }
                }
                dm.a((byte) -61);
                this.d(2);
                md.field_D = PcmResampler.createRasterBuffer((java.awt.Component) ((Object) of.field_d), BoundedUrlRequest.field_d, (byte) 125, pd.field_b);
                this.initializeClient((byte) -97);
                IntrusiveNodeHashTable.field_f = pe.a(18863);
                do {
                  boolean decompiledFrameRemainder0 = true;
                  if (0L != me.field_p) {
                    stackIn_98_0 = compareLongs(me.field_p, td.b(128));
                    decompiledFrameRemainder0 = (var5 == 0);
                    if (decompiledFrameRemainder0 &&
                      stackIn_98_0 <= 0) {
                      break;
                    }
                  }
                  if (decompiledFrameRemainder0) {
                    Js5NetworkRequest.field_z = IntrusiveNodeHashTable.field_f.a(sn.field_d, 97);
                    stackIn_98_0 = 0;
                  }
                  var3 = stackIn_98_0;
                  do {
                    if (!(var3 < Js5NetworkRequest.field_z)) {
                      this.c((byte) 92);
                      FullscreenFocusCanvas.a((byte) -61, NetworkGameClient.field_r, of.field_d);
                      break;
                    }
                    this.a(48);
                    var3++;
                  } while (var5 == 0);
                } while (var5 == 0);
              }
            } catch (java.lang.Throwable decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var1 = decompiledCaughtException;
              pf.a(false, (String) null, (Throwable) (var1));
              this.a(-1, "crash");
            }
            this.a((byte) 101, true);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter2) {
            decompiledCaughtException = decompiledCaughtParameter2;
            var1 = (RuntimeException) (Object) decompiledCaughtException;
            throw t.a((Throwable) (var1), "eh.run()");
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    private final void c(byte param0) {
        try {
          long var2_long = td.b(128);
          long var4 = wi.field_d[rl.field_h];
          wi.field_d[rl.field_h] = var2_long;
          rl.field_h = 1 + rl.field_h & 31;
          if (var4 != 0L &&
            var4 < var2_long) {
            int var6 = (int)(-var4 + var2_long);
            Bzip2State.field_p = ((var6 >> 1) + 32000) / var6;
          }
          int fieldTemp$0 = QuickChatPhraseDefinition.field_r;
          QuickChatPhraseDefinition.field_r = QuickChatPhraseDefinition.field_r + 1;
          if (fieldTemp$0 > 50) {
            QuickChatPhraseDefinition.field_r = QuickChatPhraseDefinition.field_r - 50;
            rh.field_H = true;
            of.field_d.setSize(pd.field_b, BoundedUrlRequest.field_d);
            of.field_d.setVisible(true);
            if (null != qj.field_i &&
              null == qj.field_f) {
              java.awt.Insets var6_ref_java_awt_Insets = qj.field_i.getInsets();
              of.field_d.setLocation(var6_ref_java_awt_Insets.left + pb.field_b, Js5NetworkRequest.field_D + var6_ref_java_awt_Insets.top);
              if (EscapeVector.obfuscationControl != 0) {
                of.field_d.setLocation(pb.field_b, Js5NetworkRequest.field_D);
              }
            } else {
              of.field_d.setLocation(pb.field_b, Js5NetworkRequest.field_D);
            }
          }
          this.renderClient((byte) 26);
          int var6Lifetime1 = 112 % ((param0 + 83) / 36);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "eh.J(" + param0 + ')');
        }
    }

    public final void focusGained(java.awt.event.FocusEvent param0) {
        String stackIn_6_2 = null;
        try {
          qd.field_l = true;
          rh.field_H = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.focusGained(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
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
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.update(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    abstract void renderClient(byte guard);

    public final java.net.URL getCodeBase() {
        RuntimeException var1;
        if (qj.field_i != null) {
          return null;
        }
        if (null != bb.field_P &&
          bb.field_P != this) {
          return bb.field_P.getCodeBase();
        }
        return super.getCodeBase();
    }

    public final void windowActivated(java.awt.event.WindowEvent param0) {
    }

    abstract void initializeClient(byte guard);

    final static void b(int param0) {
        try {
          IntValueNode.a("", (String) null, 63);
          if (param0 >= -12) {
            GameAppletShell.d((byte) 116);
          }
        } catch (RuntimeException runtimeException) {
          throw t.a((Throwable) ((Object) runtimeException), "eh.A(" + param0 + ')');
        }
    }

    protected GameAppletShell() {
        this.field_b = false;
    }

    public abstract void init();

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10) {
        try {
          SoftwareRasterizer.a(param1 + 1, param2 + 1, -2 - param1 + param7, -2 - param2 + param5, 0, param0);
          qi.a(param3, param7, param8, param4, param2, -28, param1, param5, param10);
          if (param6 != -3) {
            GameAppletShell.d((byte) 59);
          }
          if (0 <= param9) {
            qi.a(param9, param7 - 3, param3, -1, param2 + 3, 110, 3 + param1, -3 + param5, param10);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var11 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var11), "eh.G(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ',' + param8 + ',' + param9 + ',' + param10 + ')');
        }
    }

    public final void windowClosed(java.awt.event.WindowEvent param0) {
    }

    public final void start() {
        try {
          if (he.field_r == this &&
            !rl.field_j) {
            me.field_p = 0L;
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "eh.start()");
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
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.windowClosing(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    public final void windowIconified(java.awt.event.WindowEvent param0) {
    }

    public final synchronized void paint(java.awt.Graphics param0) {
        String stackIn_24_2 = null;
        try {
          if (he.field_r == this &&
            !rl.field_j) {
            rh.field_H = true;
            if (dh.field_c &&
              -bn.field_c + td.b(128) > 1000L) {
              java.awt.Rectangle var2 = param0.getClipBounds();
              if (null != var2) {
                if (var2.width < j.field_b) {
                  return;
                }
                if (var2.height < qa.field_G) {
                  return;
                }
              }
              PacketBuffer.field_i = true;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          RuntimeException stackIn_23_0 = var2_ref;
          StringBuilder stackIn_23_1 = new StringBuilder().append("eh.paint(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(')').toString());
        }
    }

    public final static void provideLoaderApplet(java.applet.Applet param0) {
        String stackIn_6_2 = null;
        try {
          bb.field_P = param0;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException runtimeException = decompiledCaughtException;
          RuntimeException stackIn_5_0 = runtimeException;
          StringBuilder stackIn_5_1 = new StringBuilder().append("eh.provideLoaderApplet(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(')').toString());
        }
    }

    final synchronized void d(int param0) {
        Object var3 = null;
        int var5 = EscapeVector.obfuscationControl;
        try {
          if (of.field_d != null) {
            of.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
            of.field_d.getParent().setBackground(java.awt.Color.black);
            of.field_d.getParent().remove((java.awt.Component) ((Object) of.field_d));
          }
          boolean decompiledFrameRemainder0 = true;
          int var2_int = -119 % ((76 - param0) / 49);
          if (qj.field_f == null) {
            if (qj.field_i != null) {
              var3 = qj.field_i;
              decompiledFrameRemainder0 = (var5 != 0);
            }
            if (decompiledFrameRemainder0) {
              if (bb.field_P != null) {
                var3 = bb.field_P;
                if (var5 != 0) {
                  var3 = he.field_r;
                  var3 = qj.field_f;
                }
              } else {
                var3 = he.field_r;
                if (var5 != 0) {
                  var3 = qj.field_f;
                }
              }
            }
          } else {
            var3 = qj.field_f;
          }
          ((java.awt.Container) (var3)).setLayout((java.awt.LayoutManager) null);
          of.field_d = (java.awt.Canvas) ((Object) new hd((java.awt.Component) (this)));
          ((java.awt.Container) (var3)).add((java.awt.Component) ((Object) of.field_d));
          of.field_d.setSize(pd.field_b, BoundedUrlRequest.field_d);
          of.field_d.setVisible(true);
          if (var3 == qj.field_i) {
            java.awt.Insets var4 = qj.field_i.getInsets();
            of.field_d.setLocation(var4.left + pb.field_b, var4.top + Js5NetworkRequest.field_D);
            if (var5 != 0) {
              of.field_d.setLocation(pb.field_b, Js5NetworkRequest.field_D);
            }
          } else {
            of.field_d.setLocation(pb.field_b, Js5NetworkRequest.field_D);
          }
          of.field_d.addFocusListener((java.awt.event.FocusListener) (this));
          of.field_d.requestFocus();
          ObjectSpriteSet.field_b = true;
          qd.field_l = true;
          rh.field_H = true;
          PacketBuffer.field_i = false;
          bn.field_c = td.b(128);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2 = decompiledCaughtException;
          throw t.a((Throwable) ((Object) var2), "eh.L(" + param0 + ')');
        }
    }

    public final void windowOpened(java.awt.event.WindowEvent param0) {
    }

    final static int a(int param0, int param1, CharSequence param2) {
        String stackIn_9_2 = null;
        try {
          if (param1 != 27672) {
            GameAppletShell.a(31, -73, -54, 36, 120, -37, -8, -46, 86, 6, -127);
          }
          int stackIn_4_0 = wk.a(true, param0, param2, 97);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var3 = decompiledCaughtException;
          RuntimeException stackIn_8_0 = var3;
          StringBuilder stackIn_8_1 = new StringBuilder().append("eh.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final void a(byte param0, boolean param1) {
        Object var3 = null;
        Throwable decompiledCaughtException = null;
        Exception var3_ref2 = null;
        try {
          Object var3_ref = this;
          synchronized (var3_ref) {
            if (rl.field_j) {
              return;
            }
            rl.field_j = true;
          }
          if (null != bb.field_P) {
            bb.field_P.destroy();
          }
          try {
            if (param0 < 100) {
              this.run();
            }
            this.b(true);
          } catch (java.lang.Exception decompiledCaughtParameter0) {
            decompiledCaughtException = decompiledCaughtParameter0;
            var3_ref2 = (Exception) (Object) decompiledCaughtException;
          }
          if (of.field_d != null) {
            try {
              of.field_d.removeFocusListener((java.awt.event.FocusListener) (this));
              of.field_d.getParent().remove((java.awt.Component) ((Object) of.field_d));
            } catch (java.lang.Exception decompiledCaughtParameter1) {
              decompiledCaughtException = decompiledCaughtParameter1;
              var3_ref2 = (Exception) (Object) decompiledCaughtException;
            }
          }
          if (NetworkGameClient.field_r != null) {
            try {
              NetworkGameClient.field_r.b(0);
            } catch (java.lang.Exception decompiledCaughtParameter2) {
              decompiledCaughtException = decompiledCaughtParameter2;
              var3_ref2 = (Exception) (Object) decompiledCaughtException;
            }
          }
          this.releaseClientStatics((byte) -105);
          if (qj.field_i != null) {
            try {
              System.exit(0);
            } catch (java.lang.Throwable decompiledCaughtParameter3) {
              decompiledCaughtException = decompiledCaughtParameter3;
              Throwable var3_ref3 = decompiledCaughtException;
            }
          }
          System.out.println("Shutdown complete - clean:" + param1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter4) {
          decompiledCaughtException = decompiledCaughtParameter4;
          RuntimeException runtimeException = (RuntimeException) (Object) decompiledCaughtException;
          throw t.a((Throwable) ((Object) runtimeException), "eh.I(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_f = "You are unable to access this level yet.";
        field_a = -1;
    }

    private static int compareLongs(long left, long right) {
        return left < right ? -1 : (left == right ? 0 : 1);
    }
}
