/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qn extends ResizableModalPanel implements ButtonListener {
    private TextButton field_V;
    static String field_kb;
    static BattleScreen field_ob;
    static String field_lb;
    static String field_pb;
    static IntrusiveDeque field_mb;
    static String field_nb;
    static String field_jb;

    final static void setTargetFrameRate(int param0, int param1) {
        fd.field_d = 1000000000L / (long)param1;
        if (param0 != 16) {
          field_nb = (String) null;
        }
    }

    final static int packChatSettings(byte param0) {
        if (param0 != -14) {
          return -111;
        }
        return hd.field_b + ((on.field_h << 4) + (ra.field_m << 2));
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param0) {
            qn.a(-13, -64, -6, 93, true, 96, 127);
          }
          if (this.field_V != param4) {
            return;
          }
          this.close(109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("qn.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final TextButton addButton(UiListener param0, String param1, byte param2) {
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        TextButton stackIn_2_0 = null;
        TextButton stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param1, param0);
          var4.field_r = (WidgetPainter) ((Object) new MenuButtonPainter());
          var5 = this.field_k - 6;
          this.field_k = this.field_k + 38;
          var4.setBounds(30, var5, -14 + (this.field_v - 16), 15, -128);
          if (param2 <= 1) {
            stackIn_2_0 = (TextButton) null;
            return stackIn_2_0;
          }
          this.addChild(-110, var4);
          this.refreshLayout((byte) 86);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("qn.F(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, ResourceArchive param1, ResourceArchive param2) {
        try {
          bb.field_a = param2;
          EmailLoginCredentials.field_o = param1;
          if (param0 != -24539) {
            qn.a(-80, (byte) 86);
          }
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "qn.K(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void i(int param0) {
        DualLinkNode var1 = null;
        int var2 = ArcanistsMulti.field_G ? 1 : 0;
        DualLinkNode var1Lifetime1;
        try {
          LoadingTracker.field_m = 0;
          ie.field_Nb = null;
          pc.field_b = 0;
          TextLine.field_d.clear(-124);
          oo.field_B.clear(-124);
          var1 = ie.field_Qb.firstInTraversal(-118);
          while (var1 != null) {
            var1.unlinkSecondary((byte) 88);
            var1 = ie.field_Qb.nextInTraversal(-1);
          }
          if (param0 < 30) {
            field_ob = (BattleScreen) null;
          }
          var1Lifetime1 = uc.field_c.firstInTraversal(-63);
          while (var1Lifetime1 != null) {
            var1Lifetime1.unlinkSecondary((byte) 88);
            var1Lifetime1 = uc.field_c.nextInTraversal(-1);
          }
          SpriteState.field_t = 0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "qn.C(" + param0 + ')');
        }
    }

    private final void close(int param0) {
        if (param0 < 33) {
          return;
        }
        if (!this.field_G) {
          return;
        }
        this.field_G = false;
    }

    final static void a(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        String var7 = null;
        if (nj.field_c == 2) {
          var7 = KeyboardInputHandler.field_e;
        } else {
          var7 = Js5NetworkRequest.field_v;
        }
        if (param1 <= -50) {
          uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
          return;
        }
        ResourceArchive var8 = (ResourceArchive) null;
        qn.a(10, (ResourceArchive) null, (ResourceArchive) null);
        uf.a(param5, param2, param6, param4, -7361, var7, param3, param0);
    }

    final static boolean a(int param0, byte param1) {
        if (param1 >= -6) {
          return false;
        }
        if (param0 == 2) {
          return true;
        }
        if (param0 == 3) {
          return true;
        }
        if (4 == param0) {
          return true;
        }
        if (param0 == 1) {
          return true;
        }
        if (param0 == 14) {
          return true;
        }
        if (param0 != 5) {
          return false;
        }
        return true;
    }

    public static void releaseStatics(int param0) {
        if (param0 == 1) {
          field_nb = null;
          field_lb = null;
          field_jb = null;
          field_ob = null;
          field_mb = null;
          field_pb = null;
          field_kb = null;
          return;
        }
        qn.packChatSettings((byte) 17);
        field_nb = null;
        field_lb = null;
        field_jb = null;
        field_ob = null;
        field_mb = null;
        field_pb = null;
        field_kb = null;
    }

    qn(ModalPanelStack param0, ih param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiComponent var4 = null;
        try {
          var3 = null;
          if (oo.field_C == param1) {
            var3 = DirectByteStorage.field_j;
          } else {
            if (param1 != FadingModalPanel.field_C) {
              if (param1 == bh.field_c) {
                this.field_k = this.field_k + 30;
                var3 = fl.field_d;
              }
            } else {
              this.field_k = this.field_k + 10;
              var3 = ki.field_w;
              if (PlayerActionMenu.canEnterFullscreen(-22768)) {
                this.field_k = this.field_k + 20;
                var3 = CredentialKind.field_f;
              }
            }
          }
          var4 = new UiComponent((String) (var3), (UiListener) null);
          var4.field_v = this.field_v;
          var4.field_j = 50;
          var4.field_k = 80;
          var4.field_n = 0;
          var4.field_r = (WidgetPainter) ((Object) new TextWidgetPainter(WidgetStyleLayer.field_e, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(-86, var4);
          this.field_V = this.addButton((UiListener) (this), dd.field_e, (byte) 113);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("qn.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw aa.wrapException((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    static {
        field_kb = "Unit cannot use this ability after being damaged";
        field_lb = "Continue";
        field_pb = "Join";
        field_mb = new IntrusiveDeque();
        field_nb = "Report abuse";
        field_jb = "With spells like this, you just need to click on the location you wish the effect to be centred on and the spell will be activated. Try clicking on a target.";
    }
}
