/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GrowableIntListFactory {
    static int[] field_i;
    static String playerListAreGroupName;
    static int field_h;
    static String mpCancelrematchUnrated;
    static String quickchatHelp;
    static String[] field_k;
    static int[] field_d;
    static QuickChatMenu field_b;
    static SceneDrawable[] field_a;
    static String playerX2HaveResigned;
    static String playerVsPlayer;
    static int[][] field_j;
    static Sprite field_f;

    public static void releaseStatics(int param0) {
        field_i = null;
        playerVsPlayer = null;
        quickchatHelp = null;
        field_d = null;
        field_f = null;
        mpCancelrematchUnrated = null;
        if (param0 < 9) {
          return;
        }
        field_j = (int[][]) null;
        field_a = null;
        playerX2HaveResigned = null;
        field_b = null;
        playerListAreGroupName = null;
        field_k = null;
    }

    final static int alignUpToEight(int obfuscationGuard, int value) {
        int var2 = 0;
        if ((value & 7) != 0) {
          var2 = 8 - (value & 7);
        }
        int var3 = value + var2;
        if (obfuscationGuard != 8) {
          return -16;
        }
        return var3;
    }

    final static void setMenuAnchor(int x, int obfuscationGuard, int y) {
        ArchiveIndex.field_u = x;
        RatingTextState.field_f = y;
        int var3 = 62 % ((59 - obfuscationGuard) / 59);
    }

    final static boolean isValidAccountName(boolean mode, CharSequence name, byte obfuscationGuard) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pool.field_O;
        try {
          if (!ModelInstance.isValidDisplayName(name, (byte) -113, mode)) {
            return false;
          }
          if (obfuscationGuard != -37) {
            return true;
          }
          for (var3_int = 0; var3_int < name.length(); var3_int++) {
            if (!RasterStateSupport.isNameCharacter(name.charAt(var3_int), (byte) -51)) {
              return false;
            }
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_18_0 = var3;
          stackIn_18_1 = new StringBuilder().append("w.D(").append(mode).append(',');
          if (name == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static GrowableIntList createGrowableIntList(boolean param0, int param1) {
        GrowableIntList var2 = new GrowableIntList(param1, param0);
        return var2;
    }

    static {
        playerListAreGroupName = "<%0> are <%2>.";
        field_i = new int[]{1, 1, 1, 1, 1, 2, 2, 3, 3, 3, 32, 32, 34, 53, 68, 69, 69, 69, 73, 73, 83, 83, 83, 92, 97, 99};
        mpCancelrematchUnrated = "Cancel unrated rematch";
        field_d = new int[]{12, 20, 21, 49, 6, 7};
        quickchatHelp = "Quick Chat Help";
        playerX2HaveResigned = "<%0> and <%1> have resigned!";
        playerVsPlayer = "<%0><br>versus<br><%1>";
    }
}
