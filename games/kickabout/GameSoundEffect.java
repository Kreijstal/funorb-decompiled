/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameSoundEffect {
    private String field_a;
    int field_c;
    static int field_b;
    static int field_k;
    static String field_g;
    static WidgetTheme field_i;
    PcmSample field_l;
    static int[] field_e;
    static Sprite[] field_j;
    boolean field_d;
    static String field_h;
    static boolean field_f;

    final static int keeperReach(FootballerAgent param0, int param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 170) {
            stackIn_4_0 = 170 - param0.field_o * 8;
            return stackIn_4_0;
          }
          stackIn_2_0 = -67;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("nb.G(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          return;
        }
        field_h = null;
        field_i = null;
        field_g = null;
        field_e = null;
        field_j = null;
    }

    final boolean loadSound(int param0) {
        if (!SortCriterion.field_h.ensurePackedGroupByName(false, this.field_a)) {
          return false;
        }
        if (param0 == 32) {
          this.field_l = VorbisSample.loadNamed(SortCriterion.field_h, this.field_a, "").decodeAllToPcm();
          this.field_d = true;
          return true;
        }
        return true;
    }

    final static boolean hasPendingManagerActions(int param0) {
        if (param0 != 64) {
          return false;
        }
        return MusicPatchNode.field_h.size(false) > 0 ? true : false;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Kickabout.field_G;
        try {
          NamedValueEntry.field_f = new PlayerPortraitCacheEntry[64];
          var1_int = 0;
          var2 = 74 % ((-30 - param0) / 62);
          while (NamedValueEntry.field_f.length > var1_int) {
            NamedValueEntry.field_f[var1_int] = new PlayerPortraitCacheEntry();
            var1_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "nb.A(" + param0 + ')');
        }
    }

    final static int getTargetFramesPerSecond(byte param0) {
        int var1 = 47 / ((49 - param0) / 51);
        return (int)(1000000000L / LeagueWinnerDialog.field_H);
    }

    final static ClientException wrapException(Throwable param0, String param1) {
        ClientException var2 = null;
        if (param0 instanceof ClientException) {
          var2 = (ClientException) ((Object) param0);
          var2.field_d = var2.field_d + ' ' + param1;
        } else {
          var2 = new ClientException(param0, param1);
        }
        return var2;
    }

    GameSoundEffect(int param0, int param1, String param2) {
        this.field_l = null;
        this.field_d = false;
        try {
          this.field_a = param2;
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nb.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    GameSoundEffect(PcmSample param0) {
        this.field_l = null;
        this.field_d = false;
        try {
          this.field_d = true;
          this.field_l = param0;
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "nb.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_e = new int[16384];
        field_g = "Unfortunately you are not eligible to create an account.";
        field_h = "Management";
        field_f = true;
    }
}
