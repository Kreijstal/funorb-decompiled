/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class NameSuggestionsPanel extends UiContainer implements ButtonListener {
    private NameSuggestionListener field_D;
    static String field_H;
    private String[] field_K;
    static String field_I;
    static String field_G;
    static byte[] field_E;
    private TextButton[] field_J;
    static BinaryBitmapFont field_F;

    final static void notifyBrowserResizing(int param0, int param1) {
        try {
          try {
            JavaScriptBridge.callFunctionWithArgs("resizing", IconButtonPainter.getApplet(113), (byte) 114, new Object[]{new Integer(param0)});
          } catch (Throwable throwable) {
          }
          if (param1 != 0) {
            NameSuggestionsPanel.notifyBrowserResizing(-52, 47);
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        super.drawLayer((byte) -109, param1, param2, param3);
        if (param2 != 0) {
          return;
        }
        BitmapFont var5 = ia.field_c;
        if (param0 >= -52) {
          UiComponent var6 = (UiComponent) null;
          this.handleKeyInput((UiComponent) null, (byte) -28, 'ￒ', -66);
        }
        if (null != this.field_K) {
          var5.drawParagraph(KeyboardInputHandler.field_f, this.field_n + param1, param3 + this.field_j, this.field_v, 20, 16777215, -1, 0, 0, var5.field_C + var5.field_m);
        }
    }

    final boolean handleKeyInput(UiComponent param0, byte param1, char param2, int param3) {
        RuntimeException var5 = null;
        boolean stackIn_8_0 = false;
        boolean stackIn_11_0 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyInput(param0, (byte) -124, param2, param3)) {
            return true;
          }
          if (param1 >= -120) {
            this.field_D = (NameSuggestionListener) null;
          }
          if (param3 == 98) {
            stackIn_8_0 = this.focusPreviousChild(param0, 9555);
            return stackIn_8_0;
          }
          if (param3 != 99) {
            return false;
          }
          stackIn_11_0 = this.focusNextChild(2, param0);
          return stackIn_11_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_16_0 = var5;
          stackIn_16_1 = new StringBuilder().append("li.N(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void drawFrameDecorations(byte param0) {
        int var9 = 0;
        int var10 = ArcanistsMulti.field_G ? 1 : 0;
        int var9Lifetime1;
        if (EmailLoginCredentials.field_f <= 0 ||
          EmailLoginCredentials.field_j <= 0) {
          return;
        }
        int var1_int = PacketBuffer.field_l.field_w;
        int var2 = PacketBuffer.field_l.field_n;
        int var3 = NameCheckRequest.field_e.field_n;
        int var4 = -var3 + EmailLoginCredentials.field_f;
        int var5 = NameCheckRequest.field_e.field_w;
        int var6 = -var5 + EmailLoginCredentials.field_j;
        int var7 = EmailLoginCredentials.field_f - var1_int;
        int var8 = EmailLoginCredentials.field_j - var1_int;
        NameCheckRequest.field_e.drawTransparent(0, 0);
        NameCheckRequest.field_e.drawHorizontalFlip(var4, 0);
        NameCheckRequest.field_e.drawVerticalFlip(0, var6);
        if (param0 <= 68) {
          return;
        }
        try {
          NameCheckRequest.field_e.drawRotated180(var4, var6);
          SoftwareRasterizer.setClip(var3, 0, var4, EmailLoginCredentials.field_j);
          for (var9 = var3; var4 > var9; var9 = var9 + var2) {
            PacketBuffer.field_l.drawTransparent(var9, 0);
            PacketBuffer.field_l.drawVerticalFlip(var9, var8);
          }
          SoftwareRasterizer.setClip(0, var5, EmailLoginCredentials.field_f, var6);
          for (var9Lifetime1 = var5; var9Lifetime1 < var6; var9Lifetime1 = var9Lifetime1 + var2) {
            MusicPatchPcmStream.field_k.drawTransparent(0, var9Lifetime1);
            MusicPatchPcmStream.field_k.drawHorizontalFlip(var7, var9Lifetime1);
          }
          SoftwareRasterizer.resetClip();
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "li.F(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 1313) {
          return;
        }
        field_G = null;
        field_H = null;
        field_E = null;
        field_I = null;
        field_F = null;
    }

    public final void onButtonActivated(boolean param0, int param1, int param2, int param3, TextButton param4) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          for (var6_int = 0; this.field_K.length > var6_int; var6_int++) {
            if (this.field_J[var6_int] == param4) {
              this.field_D.onNameSelected(this.field_K[var6_int], 90);
            }
          }
          if (!param0) {
            return;
          }
          if (this.field_J[this.field_K.length] == param4) {
            this.field_D.onSuggestionsChanged((byte) -7);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_16_0 = var6;
          stackIn_16_1 = new StringBuilder().append("li.U(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    NameSuggestionsPanel(NameSuggestionListener param0) {
        super(0, 0, 0, 0, (WidgetPainter) null);
        try {
          this.field_D = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "li.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final void setSuggestions(String[] param0, byte param1) {
        int var4_int = 0;
        int var5 = 0;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var3_int = 0;
        RuntimeException var3 = null;
        LinkButtonPainter var4 = null;
        int var6 = 0;
        int var7 = 0;
        var7 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          this.field_B.clear(109);
          if (param0 != null &&
            param0.length != 0) {
            var3_int = param0.length;
            this.field_K = new String[var3_int];
            for (var4_int = 0; var4_int < var3_int; var4_int++) {
              this.field_K[var4_int] = qo.normalizeName((byte) 80, (CharSequence) ((Object) param0[var4_int])).replace(' ', ' ');
            }
            var4 = new LinkButtonPainter(ia.field_c, 0, 1);
            this.field_J = new TextButton[var3_int + 1];
            for (var5 = 0; var5 < var3_int; var5++) {
              this.field_J[var5] = new TextButton(this.field_K[var5], (UiListener) (this));
              this.field_J[var5].field_r = (WidgetPainter) ((Object) var4);
              this.field_J[var5].field_q = CheckboxPainter.field_q;
              this.field_J[var5].setBounds(15, var5 * 16 + 20, 80, 0, -80);
              this.addChild(-82, this.field_J[var5]);
            }
            var6 = 11 / ((6 - param1) / 42);
            this.field_J[var3_int] = new TextButton(pc.field_d, (UiListener) (this));
            this.field_J[var3_int].field_r = (WidgetPainter) ((Object) var4);
            this.field_J[var3_int].setBounds(15, (1 + var3_int) * 16 + 20, 100, 0, -60);
            this.addChild(-87, this.field_J[var3_int]);
            return;
          }
          this.field_K = null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_16_0 = var3;
          stackIn_16_1 = new StringBuilder().append("li.C(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw aa.wrapException((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_H = "Shortcut Reference";
        field_I = "Casting ";
        field_G = "to keep fullscreen or";
        field_E = new byte[]{(byte)7, (byte)10, (byte)2};
    }
}
