/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFailureDialog extends PopupWidgetLayer implements WidgetActionListener {
    static int[] sortedFaceIds;
    static int field_bb;
    static int textChoiceButtonPaddingX;
    static int field_kb;
    static String field_gb;
    static int keyChangeReadIndex;
    static int decodedCanvasHeight;
    static RgbSprite field_hb;
    private FocusableWidget dismissButton;
    static String[] field_eb;
    static String field_fb;

    final static IndexedSprite a(IndexedSprite param0, byte param1, int[] param2) {
        IndexedSprite var3 = null;
        RuntimeException var3_ref = null;
        IndexedSprite stackIn_2_0 = null;
        IndexedSprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= -57) {
            stackIn_2_0 = (IndexedSprite) null;
            return stackIn_2_0;
          }
          var3 = new IndexedSprite(0, 0, 0);
          var3.indices = param0.indices;
          var3.height = param0.height;
          var3.width = param0.width;
          var3.canvasHeight = param0.canvasHeight;
          var3.offsetY = param0.offsetY;
          var3.palette = param2;
          var3.canvasWidth = param0.canvasWidth;
          var3.offsetX = param0.offsetX;
          stackIn_4_0 = var3;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_7_0 = var3_ref;
          stackIn_7_1 = new StringBuilder().append("ek.L(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    FullscreenFailureDialog(WidgetLayerStack layerStack, FullscreenFailureKind failureKind) {
        super(layerStack, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        Widget var4 = null;
        try {
          var3 = null;
          if (UiComponent.fullscreenUnsupported == failureKind) {
            var3 = AccountDateHelpers.field_d;
          } else {
            if (ch.fullscreenFocusProblem != failureKind) {
              if (failureKind == QuickChatPhraseRegistry.fullscreenTimeout) {
                this.height = this.height + 30;
                var3 = DirectByteStorage.field_h;
              }
            } else {
              this.height = this.height + 10;
              var3 = ChocolateBackground.field_s;
              if (ok.a(true)) {
                var3 = AccountResponse.field_h;
                this.height = this.height + 20;
              }
            }
          }
          var4 = new Widget((String) (var3), (WidgetListener) null);
          var4.y = 50;
          var4.height = 80;
          var4.width = this.width;
          var4.x = 0;
          var4.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(QuickChatMenu.field_Yb, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, true);
          this.dismissButton = this.a(LevelSequence.field_a, 101, (WidgetListener) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ek.<init>(");
          if (layerStack == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (failureKind == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void setFailureDialogVisible(boolean visible) {
        if (!this.visible) {
          return;
        }
        this.visible = visible ? true : false;
    }

    private final FocusableWidget a(String param0, int param1, WidgetListener param2) {
        FocusableWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        FocusableWidget stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new FocusableWidget(param0, param2);
          var4.renderer = (WidgetRenderer) ((Object) new ButtonWidgetRenderer());
          var5 = -6 + this.height;
          this.height = this.height + 38;
          var4.setBounds(30, 15, var5, (byte) -119, -30 + this.width);
          this.addChild(var4, true);
          this.relayout(1);
          if (param1 < 23) {
            keyChangeReadIndex = -75;
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ek.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void c(boolean param0) {
        field_gb = null;
        field_fb = null;
        sortedFaceIds = null;
        field_hb = null;
        field_eb = null;
        if (!param0) {
          field_gb = (String) null;
        }
    }

    public final void onAction(int pointerY, int button, byte obfuscationGuard, int pointerX, FocusableWidget widget) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (obfuscationGuard > -22) {
            FullscreenFailureDialog.c(false);
          }
          if (widget != this.dismissButton) {
            return;
          }
          this.setFailureDialogVisible(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("ek.Q(").append(pointerY).append(',').append(button).append(',').append(obfuscationGuard).append(',').append(pointerX).append(',');
          if (widget == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static int a(ConditionalTextValue param0, ConditionalTextValue param1, byte param2) {
        RuntimeException var3 = null;
        ConditionalTextValue var4 = null;
        String var5 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > 0) {
            var4 = (ConditionalTextValue) null;
            FullscreenFailureDialog.a((ConditionalTextValue) null, (ConditionalTextValue) null, (byte) 87);
          }
          var5 = (String) null;
          stackIn_3_0 = ValidationIconWidget.a((String) null, false, 0, param0, 0, param1, 4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ek.K(");
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
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void l(int param0) {
        ArchiveFetchClient.a(true, ReportAbuseDialog.field_cc, VerticalScrollbar.field_Qb, 2);
        BytePayloadSubmission.field_l = true;
        int var1 = -31 / ((-11 - param0) / 62);
    }

    static {
        field_gb = "Mute this player for 48 hours";
        field_bb = 20;
        keyChangeReadIndex = 0;
        sortedFaceIds = new int[16384];
        field_eb = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_fb = "From <%0>: ";
    }
}
