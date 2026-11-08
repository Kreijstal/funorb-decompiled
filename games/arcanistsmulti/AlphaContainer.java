/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AlphaContainer extends SingleChildContainer {
    int field_K;
    static String field_I;
    static String field_J;
    static int field_H;
    static int[] field_G;
    static SceneWidget field_E;
    static String field_F;

    final static void clearValidationState(byte param0) {
        ValidationState.field_e = null;
        int var1 = -115 / ((param0 - 8) / 53);
    }

    final void drawLayer(byte param0, int param1, int param2, int param3) {
        Sprite var8 = null;
        if (0 != param2) {
          return;
        }
        if (null == this.field_B) {
          return;
        }
        if (0 == this.field_K) {
          return;
        }
        if (this.field_K == 256) {
          this.field_B.drawLayer((byte) -66, param1 + this.field_n, param2, this.field_j + param3);
          return;
        }
        if (param0 < -52) {
          var8 = new Sprite(this.field_B.field_v, this.field_B.field_k);
          SoundEffectVoice.setSpriteRasterTarget(var8, -23095);
          this.field_B.drawLayer((byte) -128, 0, param2, 0);
          QuickChatCategory.popClipState(-15405);
          var8.drawAlpha(param1 + this.field_n, this.field_j + param3, this.field_K);
          return;
        }
        AlphaContainer.isMessageQueueIdle((byte) -53);
        Sprite var7 = new Sprite(this.field_B.field_v, this.field_B.field_k);
        SoundEffectVoice.setSpriteRasterTarget(var7, -23095);
        this.field_B.drawLayer((byte) -128, 0, param2, 0);
        QuickChatCategory.popClipState(-15405);
        var7.drawAlpha(param1 + this.field_n, this.field_j + param3, this.field_K);
    }

    final static boolean isMessageQueueIdle(byte param0) {
        int var2 = 0;
        TimedMessage var1 = (TimedMessage) (QueuedResponse.field_m.first(12623));
        int var2Lifetime1;
        int var2Lifetime2;
        if (var1 == null) {
          var2 = 31 % ((param0 - 40) / 56);
          return true;
        }
        if (!var1.field_i) {
          var2Lifetime1 = 31 % ((param0 - 40) / 56);
          return true;
        }
        if (75 >= var1.field_h) {
          var2Lifetime2 = 31 % ((param0 - 40) / 56);
          return true;
        }
        return false;
    }

    public static void releaseStatics(boolean param0) {
        field_E = null;
        field_J = null;
        field_F = null;
        field_G = null;
        if (!param0) {
          return;
        }
        field_I = null;
    }

    final static Boolean takePendingFlag(int param0) {
        Boolean var1 = PendingMessageHelpers.field_e;
        if (param0 != 18727) {
          AlphaContainer.isMessageQueueIdle((byte) 104);
          PendingMessageHelpers.field_e = null;
          return var1;
        }
        PendingMessageHelpers.field_e = null;
        return var1;
    }

    public AlphaContainer() {
        super(0, 0, 0, 0, (WidgetPainter) null, (UiListener) null);
        this.field_K = 256;
    }

    AlphaContainer(UiComponent param0) {
        super(param0.field_n, param0.field_j, param0.field_v, param0.field_k, (WidgetPainter) null, (UiListener) null);
        try {
          param0.setBounds(this.field_k, 0, this.field_v, 0, -81);
          this.field_B = param0;
          this.field_K = 256;
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "dm.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_G = new int[]{0, 1, 2};
        field_J = "Hide game chat";
        field_I = "Add name";
        field_F = "If you do nothing the game will revert to normal view in <%0> second.";
    }
}
