/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends sh {
    private int field_K;
    private BitmapFont field_F;
    private String field_J;
    static Sprite sportsForegroundSprite;
    static int[] nineSliceSavedClip;
    private boolean field_B;
    private int field_C;
    static char[] field_D;
    private int field_G;

    final void a(int param0, int param1, byte param2, int param3) {
        int var5 = param0 + this.field_v;
        int var6 = param1 + this.field_m;
        super.a(param0, param1, (byte) 105, param3);
        int var7 = -79 / ((param2 - 1) / 43);
        if (!(param3 == 0)) {
            return;
        }
        int var8 = !this.field_B ? 0 : -this.field_K + (this.field_r - this.field_C * 2);
        this.field_F.drawParagraph(this.field_J, this.field_C + (var8 + var5), this.field_C + var6, -this.field_C + this.field_K, -(this.field_C * 2) + this.field_h, this.field_G, -1, !this.field_B ? 2 : 0, 1, this.field_F.maxAscent);
    }

    public static void f(byte param0) {
        sportsForegroundSprite = null;
        if (param0 != -52) {
            return;
        }
        field_D = null;
        nineSliceSavedClip = null;
    }

    final static void recordEntityRelease(int param0) {
        if (el.gameplaySession.tutorialMode) {
          return;
        }
        di.releasedInDifficultyStep = di.releasedInDifficultyStep + 1;
        ul.releasedInCurrentTheme = ul.releasedInCurrentTheme + 1;
        if ((sa.releasesPerDifficultyStep == di.releasedInDifficultyStep) &&
            (gb.field_c < 2)) {
          di.releasedInDifficultyStep = 0;
          ld.advanceDifficulty(false);
          gb.field_c = gb.field_c + 1;
        }
        if (param0 != 2) {
          nineSliceSavedClip = (int[]) null;
        }
        if (fa.releasesPerTheme == ul.releasedInCurrentTheme) {
          ul.releasedInCurrentTheme = 0;
          fj.field_m = 0;
          el.gameplaySession.sessionPhase = 1;
          di.releasedInDifficultyStep = 0;
          if (gb.field_c < 2) {
            ld.advanceDifficulty(false);
          }
          gb.field_c = 0;
          el.field_t = el.field_t + 1;
        }
    }

    final String c(byte param0) {
        int var2 = this.field_A.field_l ? 1 : 0;
        this.field_A.field_l = this.field_l;
        String var3 = this.field_A.c(param0);
        this.field_A.field_l = var2 != 0 ? true : false;
        return var3;
    }

    hd(int param0, int param1, int param2, int param3, el param4, boolean param5, int param6, int param7, BitmapFont param8, int param9, String param10) {
        super(param0, param1, param2, param3, (dh) null, (bb) null);
        boolean stackIn_4_1 = false;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var14 = 0;
        try {
          this.field_G = param9;
          this.field_A = param4;
          this.field_C = param7;
          this.field_F = param8;
          if (!param5) {
            stackIn_4_1 = false;
          } else {
            stackIn_4_1 = true;
          }
          ((hd) (this)).field_B = stackIn_4_1;
          this.field_K = param6;
          this.field_J = param10;
          var12_int = this.field_K - this.field_C;
          var13 = this.field_F.measureWrappedHeight(param10, var12_int, this.field_F.maxAscent) + 2 * this.field_C;
          if (var13 <= param3) {
            var13 = param3;
          } else {
            this.a(var13, param2, (byte) -74, param1, param0);
          }
          if (!this.field_B) {
            stackIn_10_0 = this.field_K + this.field_C * 2;
          } else {
            stackIn_10_0 = 0;
          }
          var14 = stackIn_10_0;
          this.field_A.a(-(2 * this.field_C) + param3, param2 - this.field_K - this.field_C * 3, (byte) -105, (-param3 + var13 >> 1) + this.field_C, var14);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = (RuntimeException) (var12);
          stackIn_14_1 = new StringBuilder().append("hd.<init>(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',');
          if (param8 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param9).append(',');
          if (param10 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        nineSliceSavedClip = new int[4];
        field_D = new char[]{(char)32, (char)160, (char)95, (char)45, (char)224, (char)225, (char)226, (char)228, (char)227, (char)192, (char)193, (char)194, (char)196, (char)195, (char)232, (char)233, (char)234, (char)235, (char)200, (char)201, (char)202, (char)203, (char)237, (char)238, (char)239, (char)205, (char)206, (char)207, (char)242, (char)243, (char)244, (char)246, (char)245, (char)210, (char)211, (char)212, (char)214, (char)213, (char)249, (char)250, (char)251, (char)252, (char)217, (char)218, (char)219, (char)220, (char)231, (char)199, (char)255, (char)376, (char)241, (char)209, (char)223};
    }
}
