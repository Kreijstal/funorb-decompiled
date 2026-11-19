/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenFailureDialog extends ResizableDialog implements ButtonActionListener {
    static String field_U;
    private TextButton field_V;
    static ContentTransitionPhase field_W;

    FullscreenFailureDialog(DialogLayer param0, FullscreenFailureKind param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        UiWidget var4 = null;
        try {
          var3 = null;
          if (param1 == AccountValidationHelpers.field_e) {
            var3 = FullscreenController.field_b;
          } else {
            if (param1 != WrappedTextLayout.field_f) {
              if (StatefulWidgetPainter.field_r == param1) {
                var3 = DialogLayer.field_G;
                this.height = this.height + 30;
              }
            } else {
              this.height = this.height + 10;
              var3 = SocketConnector.field_b;
              if (HuffmanDecoder.a(false)) {
                var3 = ArchiveCatalog.field_c;
                this.height = this.height + 20;
              }
            }
          }
          var4 = new UiWidget((String) (var3), (WidgetListener) null);
          var4.y = 50;
          var4.height = 80;
          var4.width = this.width;
          var4.x = 0;
          var4.renderer = (WidgetRenderer) ((Object) new WidgetPainter(ThreePieceFrameHelpers.field_b, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.addChild(var4, (byte) 117);
          this.field_V = this.addDialogButton(23813, (WidgetListener) (this), wizardrun.field_F);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("vg.<init>(");
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
          throw ExceptionSupport.wrapException((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int parseSignedInteger(int param0, boolean param1, CharSequence param2) {
        RuntimeException var3 = null;
        CharSequence var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            var4 = (CharSequence) null;
            FullscreenFailureDialog.parseSignedInteger(-14, true, (CharSequence) null);
          }
          stackIn_3_0 = RadixParsingHelpers.parseIntRadix(param0, (byte) -22, param2, true);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("vg.EA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static byte[] copyBytes(byte[] param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        byte[] var3 = null;
        byte[] var4 = null;
        byte[] stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2_int = param0.length;
          var3 = new byte[var2_int];
          if (param1 > -90) {
            var4 = (byte[]) null;
            FullscreenFailureDialog.copyBytes((byte[]) null, 127);
          }
          ArrayOperations.copy(param0, 0, var3, 0, var2_int);
          stackIn_3_0 = var3;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("vg.CA(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        TextButton discarded$1 = null;
        RuntimeException var6 = null;
        String var7 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -18905) {
            var7 = (String) null;
            discarded$1 = this.addDialogButton(-124, (WidgetListener) null, (String) null);
          }
          if (this.field_V != param1) {
            return;
          }
          this.hideFailureDialog(30);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = var6;
          stackIn_8_1 = new StringBuilder().append("vg.DA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 == 80) {
          field_U = null;
          field_W = null;
          return;
        }
        String var2 = (String) null;
        FullscreenFailureDialog.loadSprite(11, (String) null, (ResourceArchive) null, (String) null);
        field_U = null;
        field_W = null;
    }

    final static Sprite loadSprite(int param0, String param1, ResourceArchive param2, String param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 15) {
            stackIn_2_0 = (Sprite) null;
            return stackIn_2_0;
          }
          var4_int = param2.getGroupId(param0 - 16, param3);
          var5 = param2.getFileId(var4_int, param1, -11986);
          stackIn_4_0 = IntegerMathHelpers.loadSprite(var4_int, param2, var5, 104);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("vg.JA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    private final void hideFailureDialog(int param0) {
        if (!this.field_H) {
          return;
        }
        if (param0 == 30) {
          this.field_H = false;
          return;
        }
        String var3 = (String) null;
        FullscreenFailureDialog.loadSprite(24, (String) null, (ResourceArchive) null, (String) null);
        this.field_H = false;
    }

    final static void completeEmailCheck(boolean param0, int param1) {
        UiSpriteThemeHelpers.field_c.complete(param0, 126);
        if (param1 != 3289) {
          field_U = (String) null;
        }
    }

    private final TextButton addDialogButton(int param0, WidgetListener param1, String param2) {
        TextButton discarded$1 = null;
        TextButton var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        String var6 = null;
        TextButton stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new TextButton(param2, param1);
          var4.renderer = (WidgetRenderer) ((Object) new SpriteButtonPainter());
          var5 = this.height - 6;
          this.height = this.height + 38;
          var4.setBounds(123, var5, 30, this.width - 30, 15);
          this.addChild((UiWidget) (var4), (byte) 48);
          this.refreshLayout(117);
          if (param0 != 23813) {
            var6 = (String) null;
            discarded$1 = this.addDialogButton(-111, (WidgetListener) null, (String) null);
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("vg.GA(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ExceptionSupport.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_U = "You are not currently logged in to the<nbsp>game.";
        field_W = new ContentTransitionPhase();
    }
}
