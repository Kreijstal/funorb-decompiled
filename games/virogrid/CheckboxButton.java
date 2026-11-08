/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CheckboxButton extends TextButton {
    static Js5Archive field_G;
    static String field_H;
    static SpriteWidget field_F;
    static String field_I;

    final void activate(byte param0, int param1, int param2, int param3) {
        this.field_z = !this.field_z ? true : false;
        super.activate((byte) 69, param1, param2, param3);
        int var5 = 65 % ((param0 + 33) / 42);
    }

    private CheckboxButton(String param0, UiListener param1) {
        this(param0, PasswordLoginCredentials.field_g.field_l, param1);
        try {
          this.listener = PasswordLoginCredentials.field_g.field_i;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        field_H = null;
        if (!param0) {
          String var2 = (String) null;
          CheckboxButton.beginFadeToScreen((byte) 42, (String) null, 7);
        }
        field_G = null;
        field_I = null;
        field_F = null;
    }

    final static Sprite buildFirstDecodedSprite(byte param0) {
        int var4_int = 0;
        int var5 = Virogrid.field_F ? 1 : 0;
        int var1 = MarkerSlider.field_F[0] * Bzip2State.field_k[0];
        byte[] var2 = CheckboxPainter.field_j[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
          var3[var4_int] = GameEntryHelpers.field_c[WidgetFactoryHelpers.bitAnd((int) var2[var4_int], 255)];
        }
        Sprite var4 = new Sprite(QuickChatMenu.field_Kb, LobbyJoinTextGlobals.field_d, BufferedSocket.field_w[0], ContentTransitionDialog.field_bb[0], Bzip2State.field_k[0], MarkerSlider.field_F[0], var3);
        if (param0 != -9) {
          CheckboxButton.releaseStatics(true);
        }
        PlayingSound.releaseDecodeArrays((byte) -28);
        return var4;
    }

    final static void beginFadeToScreen(byte param0, String param1, int param2) {
        try {
          TextButton.field_x = 1;
          int var3_int = -66 / ((-14 - param0) / 41);
          MouseTrailPoint.field_k = param2;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gn.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private CheckboxButton(String param0, WidgetListener param1, UiListener param2) {
        super(param0, param1, param2);
        try {
          this.listener = PasswordLoginCredentials.field_g.field_i;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    CheckboxButton(String param0, UiListener param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_z = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "gn.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_H = "Waiting for textures";
        field_I = "Don't mind";
    }
}
