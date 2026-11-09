/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeErrorDialog extends ResizingDialog implements WidgetActionListener {
    private InteractiveWidget field_O;
    static int field_P;

    DisplayModeErrorDialog(DialogLayer param0, DisplayModeFailure param1) {
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
          if (Bzip2State.FULLSCREEN_UNSUPPORTED != param1) {
            if (CachedArchiveProvider.FULLSCREEN_FOCUS_FAILURE == param1) {
              this.height = this.height + 10;
              var3 = LimitedRandomAccessFile.field_c;
              if (CacheReferenceNode.canAutoResizeCanvas((byte) -96)) {
                this.height = this.height + 20;
                var3 = PasswordInputRenderer.unfortunatelyThereWasAText;
              }
            } else {
              if (param1 == FontMetrics.FULLSCREEN_CONFIRMATION_TIMEOUT) {
                this.height = this.height + 30;
                var3 = OpenGlBuffer.fullscreenModeWasCancelledText;
              }
            }
          } else {
            var3 = LegacyOpenGlGraphicsToolkit.unfortunatelyYourConfigurationDoesnText;
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.height = 80;
          var4.width = this.width;
          var4.y = 50;
          var4.x = 0;
          var4.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(MouseInputShutdown.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, 96);
          this.field_O = this.a((byte) -105, (WidgetListener) (this), DraggableWidget.closeText);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("u.<init>(");
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static MusicPatch a(ResourceArchive param0, int param1, int param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        byte[] var4 = null;
        Object stackIn_4_0 = null;
        MusicPatch stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            field_P = 21;
          }
          var4 = param0.fetchFlatFile(-14296, param1);
          var3 = var4;
          if (var4 != null) {
            stackIn_6_0 = new MusicPatch(var4);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (MusicPatch) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_9_0 = var3_ref;
          stackIn_9_1 = new StringBuilder().append("u.O(");
          if (param0 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    private final void closeDialog(int guard) {
        if (!this.open) {
          return;
        }
        this.open = false;
        if (guard != 38) {
          field_P = -104;
        }
    }

    private final InteractiveWidget a(byte param0, WidgetListener param1, String param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        InteractiveWidget var5 = null;
        int var6 = 0;
        InteractiveWidget stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 112 % ((-21 - param0) / 53);
          var5 = new InteractiveWidget(param2, param1);
          var5.renderer = (WidgetRenderer) ((Object) new SpriteStripButtonRenderer());
          var6 = this.height - 6;
          this.height = this.height + 38;
          var5.setBounds(104, 15, var6, 30, -30 + this.width);
          this.addChild(var5, 102);
          this.refreshLayout(false);
          stackIn_1_0 = var5;
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("u.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_O == source) {
            this.closeDialog(38);
          }
          if (guard == 710) {
            return;
          }
          field_P = 55;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("u.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    final static void a(MusicTrack param0, int param1, byte param2, int param3, boolean param4) {
        RuntimeException var5 = null;
        ResourceArchive var6 = null;
        MusicCrossfadeStream stackIn_2_0;
        int stackIn_2_1;
        int stackIn_2_2;
        MusicTrack stackIn_2_3;
        boolean stackIn_3_4 = false;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_2_0 = AccountConnectionPhase.field_b;
          stackIn_2_1 = param2 + 88;
          stackIn_2_2 = 1000000;
          stackIn_2_3 = (MusicTrack) (param0);
          stackIn_3_4 = !(param4);
          ((MusicCrossfadeStream) (Object) stackIn_2_0).transitionToTrack(stackIn_2_1, stackIn_2_2, stackIn_2_3, stackIn_3_4, param3, param1);
          if (param2 == -87) {
            return;
          }
          var6 = (ResourceArchive) null;
          DisplayModeErrorDialog.a((ResourceArchive) null, -117, -123);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("u.E(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
    }
}
