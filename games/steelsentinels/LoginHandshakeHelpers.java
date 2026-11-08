/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoginHandshakeHelpers {
    static RgbSprite[] field_g;
    static String field_a;
    static int[][] field_c;
    static boolean field_b;
    static MusicTrack field_e;
    static String field_d;
    static SceneWidget field_f;

    final static void writeLoginHandshake(int param0, int param1, int param2, boolean param3) {
        FallingPickup.field_y.position = 0;
        FallingPickup.field_y.writeByte((byte) 122, 12);
        FallingPickup.field_y.writeInt(param3, rb.field_g.nextInt());
        FallingPickup.field_y.writeInt(true, rb.field_g.nextInt());
        FallingPickup.field_y.writeByte((byte) 121, param0);
        FallingPickup.field_y.writeByte((byte) 109, param2);
        FallingPickup.field_y.writeShort(param1, 59);
        FallingPickup.field_y.rsaEncryptContents(qe.field_d, AccountNoticeDialog.field_ib, -10048);
        ClockAndCookieHelpers.field_g.writeCipheredOpcode(18, (byte) -117);
        int fieldTemp$0 = ClockAndCookieHelpers.field_g.position + 1;
        ClockAndCookieHelpers.field_g.position = ClockAndCookieHelpers.field_g.position + 1;
        int var4 = fieldTemp$0;
        ClockAndCookieHelpers.field_g.writeBytes(FallingPickup.field_y.position, (byte) -122, 0, FallingPickup.field_y.payload);
        ClockAndCookieHelpers.field_g.backpatchByteLength((byte) 89, -var4 + ClockAndCookieHelpers.field_g.position);
    }

    final static int getSoundBufferMillis(byte param0) {
        if (param0 <= 21) {
          field_b = true;
          return MusicPatchPcmStream.field_B;
        }
        return MusicPatchPcmStream.field_B;
    }

    final static void drawChatPanelAt(byte param0, boolean param1, int param2, int param3) {
        FullscreenFocusCanvas.a(-1604006872, param1, param3, param2);
        if (param0 != 38) {
          CharSequence[] var5 = (CharSequence[]) null;
          LoginHandshakeHelpers.joinCharSequences((CharSequence[]) null, -124);
        }
    }

    final static void resetChildLayouts(int param0, SceneWidget param1) {
        SceneWidget var4 = null;
        SceneWidget var5 = null;
        int var3 = SteelSentinels.obfuscationControl;
        try {
          var4 = (SceneWidget) (param1.field_M.first(13058));
          SceneWidget var2 = var4;
          while (var4 != null) {
            var4.field_Lb = 0;
            var4.field_lb = 0;
            var4.field_eb = 0;
            var4.field_gb = 0;
            var5 = (SceneWidget) (param1.field_M.next((byte) -34));
            var5 = var5;
          }
          param1.field_Lb = 0;
          param1.field_eb = 0;
          param1.field_lb = 0;
          param1.field_gb = param0;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "ue.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static String joinCharSequences(CharSequence[] param0, int param1) {
        RuntimeException var2 = null;
        String stackIn_2_0 = null;
        String stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 0) {
            stackIn_4_0 = LoginDialog.a(param0.length, 0, (byte) 50, param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = (String) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("ue.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_d = null;
        field_f = null;
        field_c = (int[][]) null;
        field_g = null;
        field_e = null;
        int var1 = 69 % ((param0 + 34) / 55);
        field_a = null;
    }

    static {
        field_a = "Waiting for sound effects";
        field_c = new int[][]{null, null, null};
        field_g = new RgbSprite[field_c.length];
        field_d = "<col=00ffff>You are reading a past message, and your training schedule has been paused.<br>To continue your training, press <img=20> until you return to your current objective.</col>";
        field_b = false;
    }
}
