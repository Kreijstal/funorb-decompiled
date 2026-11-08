/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameOptions {
    int field_i;
    boolean field_h;
    boolean field_k;
    int field_e;
    boolean field_g;
    int field_f;
    static String[] field_b;
    static BitmapFont field_n;
    static FrameSkin field_o;
    int field_a;
    static Js5Archive field_j;
    int field_c;
    boolean field_m;
    boolean field_d;
    static String field_l;

    GameOptions() {
        this(3);
    }

    final static void initializeAccountUi(boolean param0, Js5Archive param1, Js5Archive param2, Js5Archive param3, int param4) {
        try {
          if (param4 != -1) {
            field_n = (BitmapFont) null;
          }
          ValidationIndicator.field_I = SessionSeedHelpers.createEmailCheckResult("", false);
          ValidationIndicator.field_I.complete(false, 11358);
          CommonUiHelpers.loadCommonUi(param2, param3, 60, param1);
          SoundCache.createLoginUiRoot(461050508);
          MouseWheelInput.field_c = ClientServiceHelpers.field_e;
          MusicVoiceMixer.field_l = ClientServiceHelpers.field_e;
        } catch (RuntimeException runtimeException) {
          throw AsyncCheckResult.wrapException((Throwable) ((Object) runtimeException), "jf.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static boolean containsFilterText(int param0, String param1) {
        RuntimeException var2 = null;
        boolean stackIn_9_0 = false;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == LobbyGame.field_Wb) {
            return false;
          }
          if (param0 <= -51) {
            stackIn_9_0 = !(param1.toLowerCase().indexOf(LobbyGame.field_Wb.toLowerCase()) < 0);
            return stackIn_9_0;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_12_0 = var2;
          stackIn_12_1 = new StringBuilder().append("jf.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static CoverageBitmapFont createBitmapFont(byte[] param0, int param1) {
        CoverageBitmapFont var2 = null;
        RuntimeException var2_ref = null;
        CoverageBitmapFont stackIn_5_0 = null;
        CoverageBitmapFont stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == null) {
            return null;
          }
          var2 = new CoverageBitmapFont(param0, BufferedSocket.field_w, ContentTransitionDialog.field_bb, Bzip2State.field_k, MarkerSlider.field_F, GameEntryHelpers.field_c, CheckboxPainter.field_j);
          PlayingSound.releaseDecodeArrays((byte) -28);
          if (param1 == 20) {
            stackIn_7_0 = var2;
            return stackIn_7_0;
          }
          stackIn_5_0 = (CoverageBitmapFont) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_10_0 = var2_ref;
          stackIn_10_1 = new StringBuilder().append("jf.B(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(byte param0) {
        field_o = null;
        field_b = null;
        field_n = null;
        field_l = null;
        if (param0 == -124) {
          field_j = null;
          return;
        }
        field_o = (FrameSkin) null;
        field_j = null;
    }

    GameOptions(int param0) {
        int var2;
        var2 = param0;
        if (var2 == 0) {
          this.field_h = false;
          this.field_k = false;
          this.field_g = false;
          this.field_f = 0;
          this.field_m = false;
          this.field_e = -1;
          this.field_d = true;
        } else {
          if (var2 == 1) {
            this.field_e = -1;
            this.field_g = false;
            this.field_f = 0;
            this.field_a = 20;
            this.field_h = false;
            this.field_c = 50;
            this.field_k = false;
            this.field_m = true;
            this.field_i = 1;
            this.field_d = true;
          } else {
            if (var2 == 2) {
              this.field_f = 0;
              this.field_e = -1;
              this.field_g = true;
              this.field_m = false;
              this.field_h = false;
              this.field_k = false;
              this.field_d = true;
            } else {
              if (var2 == 3) {
                this.field_c = 50;
                this.field_k = true;
                this.field_h = false;
                this.field_f = 0;
                this.field_a = 20;
                this.field_g = true;
                this.field_m = false;
                this.field_d = true;
                this.field_e = -1;
                this.field_i = 1;
              }
            }
          }
        }
    }

    static {
        field_l = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
