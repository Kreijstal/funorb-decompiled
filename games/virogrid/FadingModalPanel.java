/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class FadingModalPanel extends WidgetContainer {
    private WidgetLayerStack field_L;
    static int[][] field_E;
    static SpriteWidget field_F;
    boolean field_G;
    static String[] field_I;
    static PacketBuffer field_D;
    static SpriteWidget field_M;
    static String field_N;
    private int field_H;
    static String field_J;
    static ScrollPaneWithFooter field_K;

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        if (0 == this.field_H) {
          return;
        }
        if (256 <= this.field_H) {
          if (0 != param3) {
            return;
          }
          this.drawDialogBackground(param2 + this.field_u, 40, param1 + this.field_l);
          super.drawLayer((byte) 37, param1, param2, param3);
          return;
        }
        if (RegistrationRequestDialog.field_Eb == null ||
          !(RegistrationRequestDialog.field_Eb.field_w >= this.field_g) ||
          !(RegistrationRequestDialog.field_Eb.field_p >= this.field_m)) {
          RegistrationRequestDialog.field_Eb = new Sprite(this.field_g, this.field_m);
        }
        ChatPanelSetupHelpers.setRenderTargetSprite(RegistrationRequestDialog.field_Eb, 16865);
        Rasterizer.clear();
        this.drawDialogBackground(0, 23, 0);
        super.drawLayer(param0, -param1 - this.field_l, -param2 - this.field_u, param3);
        ContextMenuHelpers.popRasterTarget(true);
        RegistrationRequestDialog.field_Eb.drawWithOpacity(param1 + this.field_l, this.field_u + param2, this.field_H);
    }

    boolean finishFadeAndCheckHidden(byte param0) {
        int var2;
        boolean stackIn_4_0 = false;
        var2 = -67 / ((50 - param0) / 33);
        this.field_H = this.getTargetAlpha((byte) 30);
        stackIn_4_0 = (this.field_H == 0) && (!this.field_G);
        return stackIn_4_0;
    }

    public static void releaseStatics(int param0) {
        field_K = null;
        field_F = null;
        field_I = null;
        field_J = null;
        field_D = null;
        field_E = (int[][]) null;
        if (param0 != -1) {
          CharSequence var2 = (CharSequence) null;
          FadingModalPanel.countOccurrences((CharSequence) null, 'ﾙ', 7);
        }
        field_N = null;
        field_M = null;
    }

    final UiWidget findFocusedChild(byte param0) {
        UiWidget var2 = super.findFocusedChild(param0);
        if (var2 != null) {
          return var2;
        }
        return (UiWidget) (this);
    }

    private final int getTargetAlpha(byte param0) {
        if (param0 < 28) {
          field_I = (String[]) null;
        }
        return !this.field_G ? 0 : this.field_L.getTopVisibleLayer((byte) 51) != this ? 0 : 256;
    }

    boolean tickLayerAndCheckHidden(int param0) {
        int var2;
        int var3;
        boolean stackIn_11_0 = false;
        if (param0 != 3) {
          this.setCenteredSize(8, 89, 62);
        }
        var2 = this.getTargetAlpha((byte) 99);
        var3 = -this.field_H + var2;
        if (var3 > 0) {
          this.field_H = this.field_H + (var3 + 7) / 8;
        }
        if (var3 < 0) {
          this.field_H = this.field_H + (-16 + var3 + 1) / 16;
        }
        stackIn_11_0 = (0 == this.field_H) && (var2 == 0) && (!this.field_G);
        return stackIn_11_0;
    }

    final void setCenteredSize(int param0, int param1, int param2) {
        this.setBounds(param0, true, DrawOfferMenuHelpers.field_a - param0 >> 1, IsaacRandom.field_i - param2 >> 1, param2);
        if (param1 < 106) {
          field_F = (SpriteWidget) null;
        }
    }

    final static int countOccurrences(CharSequence param0, char param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        CharSequence var7 = null;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Virogrid.field_F ? 1 : 0;
        try {
          var3_int = 0;
          var4 = param0.length();
          var5 = 0;
          if (param2 != 16) {
            var7 = (CharSequence) null;
            FadingModalPanel.countOccurrences((CharSequence) null, '`', -91);
          }
          while (var5 < var4) {
            if (param0.charAt(var5) == param1) {
              var3_int++;
            }
            var5++;
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("gg.EA(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    final static void setDialogFrameStyle(int param0, FrameSkin param1, boolean param2, int param3) {
        try {
          if (!param2) {
            field_F = (SpriteWidget) null;
          }
          GameOptions.field_o = param1;
          SessionSeedHelpers.field_f = param0;
          RasterSnapshot.field_w = param3;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gg.HA(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    FadingModalPanel(WidgetLayerStack param0, int param1, int param2) {
        super(-param1 + IsaacRandom.field_i >> 1, -param2 + DrawOfferMenuHelpers.field_a >> 1, param1, param2, (WidgetListener) null);
        try {
          this.field_G = false;
          this.field_L = param0;
          this.field_H = 0;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gg.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static void resetChatRateLimit(int param0) {
        SpriteLoadHelpers.field_b = ClockAndTextHelpers.monotonicMillis(-9986);
        if (param0 != 15810) {
          return;
        }
        SoundCache.field_e = 0;
    }

    abstract void drawDialogBackground(int param0, int param1, int param2);

    static {
        field_I = new String[16];
        field_N = "You have won!";
        field_D = new PacketBuffer(256);
        field_J = "You are on <%0>";
    }
}
