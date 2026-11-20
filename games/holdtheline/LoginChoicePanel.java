/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginChoicePanel extends WidgetContainer implements ButtonActionListener {
    static int field_L;
    static int[] field_I;
    private TextButton field_K;
    static char field_M;
    static h field_N;
    static AudioOutput field_G;
    private TextButton field_P;
    private TextButton field_F;
    static SpriteSheetAsset field_O;
    static PcmStreamMixer field_H;
    static String field_J;

    final boolean handleKeyPress(UiWidget param0, int param1, byte param2, char param3) {
        RuntimeException var5 = null;
        boolean stackIn_5_0 = false;
        boolean stackIn_8_0 = false;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (super.handleKeyPress(param0, param1, param2, param3)) {
            return true;
          }
          if (param1 == 98) {
            stackIn_5_0 = this.focusPreviousChild(param0, -1);
            return stackIn_5_0;
          }
          if (param1 != 99) {
            return false;
          }
          stackIn_8_0 = this.focusNextChild(param0, param2 ^ -51);
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_13_0 = var5;
          stackIn_13_1 = new StringBuilder().append("pk.T(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public LoginChoicePanel() {
        super(0, 0, 476, 225, (WidgetRenderer) null);
        this.field_K = new TextButton(ArchiveKeyRequest.field_m, (WidgetListener) null);
        this.field_P = new TextButton(um.field_c, (WidgetListener) null);
        this.field_F = new TextButton(ue.field_a, (WidgetListener) null);
        SpriteButtonRenderer var1 = new SpriteButtonRenderer();
        this.field_K.renderer = (WidgetRenderer) ((Object) var1);
        this.field_P.renderer = (WidgetRenderer) ((Object) var1);
        this.field_F.renderer = (WidgetRenderer) ((Object) var1);
        int var2 = 4;
        int var3 = 326;
        int var4 = var3 - var2 >> 1;
        this.field_P.setBounds(-var3 + this.width >> 1, (byte) 122, -var2 + (-48 + this.height), 30, var4);
        this.field_F.setBounds((-var3 + this.width >> 1) + var4 + var2, (byte) 122, -48 + (this.height - var2), 30, var4);
        this.field_K.setBounds(this.width - var3 >> 1, (byte) 122, -(2 * var2) - 78 + this.height, 30, var3);
        this.field_P.listener = (WidgetListener) (this);
        this.field_K.listener = (WidgetListener) (this);
        this.field_K.tooltip = ml.field_b;
        this.field_F.listener = (WidgetListener) (this);
        this.field_F.tooltip = TrackCurve.field_j;
        this.addChild(true, this.field_P);
        this.addChild(true, this.field_K);
        this.addChild(true, this.field_F);
    }

    final void drawLayer(int param0, int param1, int param2, int param3) {
        int var5 = this.x + param2;
        int var6 = param1 + this.y;
        IntrusiveNode.field_g.drawParagraph(DisplayNameForm.field_P, var5 + 20, 20 + var6, this.width - 40, this.height - 50, 16777215, -1, 1, 0, IntrusiveNode.field_g.ascent);
        super.drawLayer(param0, param1, param2, param3);
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != -25335) {
          return;
        }
        field_N = null;
        field_H = null;
        field_O = null;
        field_G = null;
        field_J = null;
        field_I = null;
    }

    final static sh a(byte param0, String param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        sh stackIn_4_0 = null;
        sh stackIn_8_0 = null;
        sh stackIn_17_0 = null;
        sh stackIn_20_0 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var6 = HoldTheLine.field_D;
        try {
          var2_int = param1.length();
          if (0 == var2_int) {
            stackIn_4_0 = ArchiveKeyRequest.field_k;
            return stackIn_4_0;
          }
          if (63 < var2_int) {
            stackIn_8_0 = Vector2i.field_h;
            return stackIn_8_0;
          }
          var3 = 0;
          var4 = 43 / ((param0 + 45) / 35);
          while (var2_int > var3) {
            var5 = param1.charAt(var3);
            if (45 == var5) {
              if (0 == var3 ||
                -1 + var2_int == var3) {
                stackIn_17_0 = DialogLayer.field_F;
                return stackIn_17_0;
              }
            } else {
              if (rc.field_e.indexOf(var5) == -1) {
                stackIn_20_0 = DialogLayer.field_F;
                return stackIn_20_0;
              }
            }
            var3++;
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("pk.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    public final void onButtonAction(int param0, TextButton param1, int param2, int param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = HoldTheLine.field_D;
        try {
          if (param2 != -4) {
            return;
          }
          if (param1 == this.field_P) {
            TextButton.h(param2 + 88);
            return;
          }
          if (param1 == this.field_K) {
            DialogLayer.h((byte) 83);
            return;
          }
          if (param1 != this.field_F) {
            return;
          }
          FadingDialog.h(0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_12_0 = var6;
          stackIn_12_1 = new StringBuilder().append("pk.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw EntitySound.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    static {
        field_I = new int[128];
        field_N = new h();
        field_J = "Email is valid";
    }
}
