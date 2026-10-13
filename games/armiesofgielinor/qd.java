/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd extends DequeWidgetContainer implements TextHotspotListener, WidgetActivationListener {
    static String chatRecipientName;
    static int lobbyNotificationDuration;
    static QuickChatMenu activeQuickChatMenu;
    private HotspotTextWidget field_F;
    private oe field_H;
    private InteractiveWidget field_M;
    static String decodedChatDisplayName;
    static String field_J;

    public static void k(int param0) {
        decodedChatDisplayName = null;
        chatRecipientName = null;
        activeQuickChatMenu = null;
        if (param0 != -15) {
          qd.k(71);
          field_J = null;
          return;
        }
        field_J = null;
    }

    private final String a(byte param0) {
        if (param0 != -117) {
          this.field_M = (InteractiveWidget) null;
          return "</col></u>";
        }
        return "</col></u>";
    }

    public final void hotspotActivated(int hotspotId, int button, byte obfuscationGuard, HotspotTextWidget widget) {
        RuntimeException var5 = null;
        int var6 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (hotspotId != 0) {
            if (hotspotId == 1) {
              BitmapTextLayout.a("privacy.ws", (byte) -77);
            } else {
              if (hotspotId == 2) {
                BitmapTextLayout.a("conduct.ws", (byte) -117);
              }
            }
          } else {
            BitmapTextLayout.a("terms.ws", (byte) -98);
          }
          if (obfuscationGuard > 102) {
            return;
          }
          this.field_F = (HotspotTextWidget) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = var5;
          stackIn_12_1 = new StringBuilder().append("qd.H(").append(hotspotId).append(',').append(button).append(',').append(obfuscationGuard).append(',');
          if (widget == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static boolean a(String param0, String param1, boolean param2) {
        RuntimeException var3 = null;
        PcmStreamMixer var4 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (ab.a(param0, 0)) {
            return false;
          }
          if (ph.a(param0, (byte) 123)) {
            return false;
          }
          if (pd.a(param0, 0)) {
            return false;
          }
          if (param1.length() == 0) {
            return true;
          }
          if (rb.a(param1, param0, 113)) {
            return false;
          }
          if (e.a(86, param1, param0)) {
            return false;
          }
          if (param2) {
            var4 = (PcmStreamMixer) null;
            qd.a((ResourceArchive) null, (byte) 120, (PcmStreamMixer) null, -19);
          }
          if (!Battlefield.a(param0, (byte) -26, param1)) {
            return true;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_30_0 = var3;
          stackIn_30_1 = new StringBuilder().append("qd.B(");
          if (param0 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          stackIn_33_1 = ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',');
          if (param1 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param2).append(')').toString());
        }
    }

    final boolean handleKey(Widget rootWidget, int keyCode, char character, int obfuscationGuard) {
        RuntimeException var5 = null;
        boolean stackIn_6_0 = false;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKey(rootWidget, keyCode, character, obfuscationGuard)) {
            return true;
          }
          if (98 == keyCode) {
            stackIn_6_0 = this.focusPreviousChild(false, rootWidget);
            return stackIn_6_0;
          }
          if (keyCode != 99) {
            return false;
          }
          stackIn_10_0 = this.focusNextChild((byte) -125, rootWidget);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qd.F(");
          if (rootWidget == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(keyCode).append(',').append(character).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(ResourceArchive param0, byte param1, PcmStreamMixer param2, int param3) {
        try {
          InteractiveWidget.field_C = DualNodeHashTable.getNominalTickRate(-74) * param3 / 1000;
          DualNodeDeque.a((byte) -124, param0);
          jj.a(-93, param0);
          lg.a(32381, param0);
          DropdownArrowPainter.a(54);
          ng.b(true);
          if (param1 <= 70) {
            String var5 = (String) null;
            qd.a((String) null, (String) null, true);
          }
          ib.field_j = 0 - InteractiveWidget.field_C;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "qd.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    qd(oe param0) {
        super(0, 0, 288, 0, (WidgetPainter) null);
        String var7 = null;
        int var3 = 0;
        BitmapTextWidgetPainter var4 = null;
        int var5 = 0;
        int var6 = 0;
        try {
          this.field_H = param0;
          this.field_M = new InteractiveWidget(ro.field_kb, (WidgetListener) null);
          this.field_M.painter = (WidgetPainter) ((Object) new nu());
          var7 = fo.a(4800, MidiPcmStream.field_R, new String[]{this.a(-29442), this.a((byte) -117)});
          var3 = 20;
          var4 = new BitmapTextWidgetPainter(ArmiesOfGielinor.field_J, 0, 0, 0, 0, 16777215, -1, 3, 0, ArmiesOfGielinor.field_J.maxAscent, -1, 2147483647, true);
          this.field_F = new HotspotTextWidget(var7, var4);
          this.field_F.tooltipText = "";
          this.field_F.setHotspotTooltip(DiskCacheRequest.field_I, false, 0);
          this.field_F.setHotspotTooltip(DiskCacheRequest.field_I, false, 1);
          this.field_F.width = -40 + this.width;
          this.field_F.listener = (WidgetListener) (this);
          this.field_F.setTextBounds(this.width - 40, 9567, 26, var3);
          var3 = var3 + (this.field_F.height + 15);
          this.addChild((byte) 10, (Widget) (this.field_F));
          var5 = 4;
          var6 = 200;
          this.field_M.setBounds(-var6 + 300 >> 1, var6, var3, 8192, 40);
          this.field_M.listener = (WidgetListener) (this);
          this.addChild((byte) 10, (Widget) (this.field_M));
          this.setBounds(0, 300, 0, 8192, var5 + var3 + 55);
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "qd.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    public final void widgetActivated(int pointerX, int obfuscationGuard, int button, int pointerY, InteractiveWidget widget) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard != 11) {
            decodedChatDisplayName = (String) null;
          }
          if (widget != this.field_M) {
            return;
          }
          bt.b(0);
          this.field_H.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("qd.N(").append(pointerX).append(',').append(obfuscationGuard).append(',').append(button).append(',').append(pointerY).append(',');
          if (widget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final String a(int param0) {
        if (param0 != -29442) {
          return (String) null;
        }
        return "<u=2164A2><col=2164A2>";
    }

    static {
        field_J = "Off";
    }
}
