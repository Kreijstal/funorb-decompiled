/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenStatusDialog extends ResizableModalDialog implements WidgetActivationListener {
    private InteractiveWidget field_hb;
    static e field_lb;
    static AudioOutput field_ob;
    static RgbSprite[] field_mb;
    static String field_ib;
    static int field_jb;
    static String field_nb;
    static int field_kb;

    final static void a(int param0, boolean param1) {
        if (param0 > -29) {
          field_ob = (AudioOutput) null;
        }
        if (kc.field_o) {
          KeyboardInput.field_a = EmailFormatValidator.a(320, true, param1, oj.field_B);
        } else {
          if (bj.field_m) {
            ji.field_e = qh.a(param1, (byte) 108);
          } else {
            da.field_e.b(param1, (byte) -115);
            if (!ej.field_b) {
              ej.field_b = true;
              he.field_d.addListener(WingPod.field_R);
            }
          }
        }
    }

    final static void n(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Confined.field_J ? 1 : 0;
        try {
          if (param0 != 15102) {
            return;
          }
          if (!LightningArc.f((byte) 6)) {
            if (null != dn.field_d &&
              dn.field_d.field_f) {
              qh.c(4);
              DelegatingCanvas.field_b.showDialog(new FullscreenStatusDialog(DelegatingCanvas.field_b, GrowableIntArray.field_f), param0 - 15102);
            }
            return;
          }
          DelegatingCanvas.field_b.processPointerInput(true, true, pe.field_m, DraggableWidgetContainer.field_Q);
          DelegatingCanvas.field_b.advanceDialogs((byte) 52);
          while (nm.e((byte) -96)) {
            DelegatingCanvas.field_b.processKeyInput((byte) 101, ad.field_h, gk.field_r);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw TextLineMetrics.a((Throwable) ((Object) var1), "ei.B(" + param0 + ')');
        }
    }

    final static void h(byte param0) {
        he.field_f = -1;
        DefaultTextWidgetRenderer.field_o = null;
        DampedProjectile.field_R = false;
        if (param0 > -93) {
          return;
        }
        LightningArc.field_qb = 0;
        nm.field_I = -1;
    }

    private FullscreenStatusDialog(ModalDialogHost param0, FullscreenNoticeType param1) {
        super(param0, 200, 150);
        Object var3 = null;
        UiWidget var4 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3 = null;
          if (SocketArchiveNetworkClient.field_t != param1) {
            if (GrowableIntArray.field_f == param1) {
              var3 = sf.field_s;
              this.field_z = this.field_z + 10;
              if (kj.a((byte) -14)) {
                var3 = AccountCreationResultPanel.field_Cb;
                this.field_z = this.field_z + 20;
              }
            } else {
              if (UiWidget.field_x == param1) {
                var3 = StageDirector.field_A;
                this.field_z = this.field_z + 30;
              }
            }
          } else {
            var3 = IntrusiveNodeHashTable.field_d;
          }
          var4 = new UiWidget((String) (var3), (WidgetEventListener) null);
          var4.field_F = this.field_F;
          var4.field_z = 80;
          var4.field_q = 0;
          var4.field_m = 50;
          var4.field_n = (WidgetRenderer) ((Object) new DefaultTextWidgetRenderer(fa.field_Q, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, 10);
          this.field_hb = this.createCloseButton((WidgetEventListener) (this), DropTargetWidgetContainer.field_J, -27167);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ei.<init>(");
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
          throw TextLineMetrics.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final InteractiveWidget createCloseButton(WidgetEventListener param0, String param1, int param2) {
        InteractiveWidget discarded$1 = null;
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        InteractiveWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(param1, param0);
          var4.field_n = (WidgetRenderer) ((Object) new je());
          if (param2 != -27167) {
            var6 = (String) null;
            discarded$1 = this.createCloseButton((WidgetEventListener) null, (String) null, 101);
          }
          var5 = this.field_z - 6;
          this.field_z = this.field_z + 38;
          var4.setBounds(param2 ^ 27234, -16 + this.field_F - 14, var5, 30, 15);
          this.addChild(var4, 10);
          this.refreshLayout(param2 ^ -27171);
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ei.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_ob = null;
        field_nb = null;
        int var1 = -69 / ((param0 - 9) / 60);
        field_lb = null;
        field_ib = null;
        field_mb = null;
    }

    final static bm o(int param0) {
        bm var1 = new bm(kb.field_a, em.field_e, DualLinkNode.field_p[0], ij.field_r[0], InteractiveWidget.field_I[0], TextLineMetrics.field_f[0], rj.field_f[0], an.field_p);
        StageDirector.clearIndexedSpriteDecodeBuffers(false);
        if (param0 >= 20) {
          return var1;
        }
        field_jb = 35;
        return var1;
    }

    public final void onWidgetActivated(int param0, int param1, int param2, InteractiveWidget param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 <= 68) {
            this.field_hb = (InteractiveWidget) null;
          }
          if (this.field_hb != param3) {
            return;
          }
          this.closeStatusNotice(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ei.FA(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw TextLineMetrics.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param4).append(')').toString());
        }
    }

    private final void closeStatusNotice(boolean param0) {
        if (!this.field_H) {
          return;
        }
        this.field_H = false;
        if (!param0) {
          field_jb = 117;
        }
    }

    static {
        field_lb = new e(13, 0, 1, 0);
        field_jb = 0;
        field_ib = "Orb coins: ";
        field_kb = 0;
        field_nb = "Reload game";
    }
}
