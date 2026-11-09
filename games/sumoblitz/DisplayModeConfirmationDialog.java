/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class DisplayModeConfirmationDialog extends ResizingDialog implements WidgetActionListener {
    static int droneTypeStreakMask;
    private InteractiveWidget field_P;
    private long field_W;
    private InteractiveWidget field_Q;
    private UiWidget field_S;
    static BufferedSocket accountSocket;
    static String unfortunatelyWeAreUnableText;
    static int field_U;
    static SpriteData[] field_V;

    final void update(int parentX, int guard, UiWidget root, int parentY) {
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        long var5_long = 0L;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        try {
          super.update(parentX, 74, root, parentY);
          if (LegacyOpenGlClientVertexBuffer.field_d) {
            root.clearFocus((byte) 116);
          }
          var7 = -26 / ((guard + 25) / 45);
          var5_long = -this.field_W + wq.monotonicTimeMillis(-118);
          var8 = (int)((10999L - var5_long) / 1000L);
          if (var8 > 0) {
            this.field_S.text = "" + var8;
          } else {
            HardwareAnimatedWaterEffect.d(1);
            this.e(true);
            this.dialogLayer.pushDialog((byte) 121, new DisplayModeErrorDialog(this.dialogLayer, FontMetrics.field_f));
          }
          if (this.open &&
            null == CompactMeshGeometry.field_o) {
            this.e(true);
            this.dialogLayer.pushDialog((byte) 97, new DisplayModeErrorDialog(this.dialogLayer, CachedArchiveProvider.field_e));
          }
          if (null != CompactMeshGeometry.field_o) {
            if (!CompactMeshGeometry.field_o.field_a) {
              return;
            }
            this.e(true);
            this.dialogLayer.pushDialog((byte) 122, new DisplayModeErrorDialog(this.dialogLayer, CachedArchiveProvider.field_e));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("qk.U(").append(parentX).append(',').append(guard).append(',');
          if (root == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(parentY).append(')').toString());
        }
    }

    final boolean onKey(UiWidget root, char character, byte guard, int keyCode) {
        int var5_int = 0;
        RuntimeException var5 = null;
        boolean stackIn_10_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = keyCode;
          if (var5_int == 99) {
            this.field_Q.requestFocus((UiWidget) (this), (byte) 61);
            return true;
          }
          if (var5_int == 98) {
            this.field_P.requestFocus((UiWidget) (this), (byte) 61);
            return true;
          }
          if (guard <= 9) {
            this.field_W = 89L;
          }
          stackIn_10_0 = super.onKey(root, character, (byte) 13, keyCode);
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("qk.KA(");
          if (root == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(character).append(',').append(guard).append(',').append(keyCode).append(')').toString());
        }
    }

    DisplayModeConfirmationDialog(DialogLayer param0) {
        super(param0, 200, 200);
        UiWidget var3 = null;
        try {
          this.field_W = wq.monotonicTimeMillis(-97);
          var3 = new UiWidget(GraphicsToolkit.field_d, (WidgetListener) null);
          var3.height = 100;
          var3.y = 50;
          var3.width = this.width;
          var3.x = 0;
          var3.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(jm.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var3, 89);
          this.field_S = new UiWidget(GraphicsToolkit.field_d, (WidgetListener) null);
          this.field_S.y = var3.height + (var3.y + 20);
          this.field_S.width = this.width;
          this.field_S.x = 0;
          this.field_S.height = 80;
          this.field_S.renderer = (WidgetRenderer) ((Object) new TextWidgetRenderer(LegacyOpenGlDisplayLists.field_a, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(this.field_S, 117);
          this.field_P = this.a((WidgetListener) (this), 20556, km.acceptText);
          this.field_Q = this.a((WidgetListener) (this), 20556, up.cancelText);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "qk.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    private final InteractiveWidget a(WidgetListener param0, int param1, String param2) {
        InteractiveWidget var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        InteractiveWidget stackIn_2_0 = null;
        InteractiveWidget stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new InteractiveWidget(param2, param0);
          var4.renderer = (WidgetRenderer) ((Object) new SpriteStripButtonRenderer());
          var5 = this.height - 6;
          this.height = this.height + 38;
          var4.setBounds(114, 15, var5, 30, -16 + this.width - 14);
          this.addChild(var4, param1 - 20458);
          if (param1 != 20556) {
            stackIn_2_0 = (InteractiveWidget) null;
            return stackIn_2_0;
          }
          this.refreshLayout(false);
          stackIn_4_0 = var4;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_7_0 = var4_ref;
          stackIn_7_1 = new StringBuilder().append("qk.E(");
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
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    private final void e(boolean param0) {
        if (!param0) {
          this.field_W = -123L;
          if (this.open) {
            this.open = false;
            return;
          }
          return;
        }
        if (this.open) {
          this.open = false;
          return;
        }
    }

    public static void releaseStatics(byte param0) {
        unfortunatelyWeAreUnableText = null;
        if (param0 != -43) {
          DisplayModeConfirmationDialog.releaseStatics((byte) -2);
          field_V = null;
          accountSocket = null;
          return;
        }
        field_V = null;
        accountSocket = null;
    }

    public final void onAction(int action, int guard, InteractiveWidget source, int pointerX, int pointerY) {
        RuntimeException var6 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_P == source) {
            this.e(true);
          } else {
            if (source == this.field_Q) {
              HardwareAnimatedWaterEffect.d(guard ^ 711);
              this.e(true);
            }
          }
          if (guard == 710) {
            return;
          }
          field_U = 24;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_9_0 = var6;
          stackIn_9_1 = new StringBuilder().append("qk.C(").append(action).append(',').append(guard).append(',');
          if (source == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(pointerX).append(',').append(pointerY).append(')').toString());
        }
    }

    static {
        droneTypeStreakMask = 0;
        unfortunatelyWeAreUnableText = "Unfortunately we are unable to create an account for you at this time.";
    }
}
