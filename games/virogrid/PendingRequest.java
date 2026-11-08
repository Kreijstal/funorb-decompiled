/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingRequest extends IntrusiveNode {
    int[] field_h;
    static int field_j;
    static int field_k;
    boolean field_l;
    static int field_m;
    static volatile int field_i;
    int field_g;
    static String field_n;

    final static void openLoginPanelAtStage(int param0) {
        if (!MenuScreen.field_d) {
          throw new IllegalStateException();
        }
        LobbySortHelpers.field_h = true;
        NodeHashTableIterator.openLoginPrompt(false, -125);
        NodeHashTableIterator.field_l = param0;
    }

    final static void sortRankingRange(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_24_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = Virogrid.field_F ? 1 : 0;
        try {
          if (param1 <= param6) {
            return;
          }
          if (param6 + 1 >= param3) {
            return;
          }
          if (5 + param6 < param3 &&
            param4 != param0) {
            var7_int = (1 & (param4 & param0)) + ((param4 >> 1) + (param0 >> 1));
            var8 = param6;
            var9 = param0;
            var10 = param4;
            for (var11 = param6; var11 < param3; var11++) {
              var12 = LobbyPlayerEntry.field_Tb[var11];
              if (!param2) {
                stackIn_24_0 = TextureCache.field_i[var12];
              } else {
                stackIn_24_0 = ByteStorage.field_c[var12];
              }
              var13 = stackIn_24_0;
              if (var7_int < var13) {
                LobbyPlayerEntry.field_Tb[var11] = LobbyPlayerEntry.field_Tb[var8];
                incrementValue$0 = var8;
                var8++;
                LobbyPlayerEntry.field_Tb[incrementValue$0] = var12;
                if (var13 < var9) {
                  var9 = var13;
                }
              } else {
                if (var13 > var10) {
                  var10 = var13;
                }
              }
            }
            PendingRequest.sortRankingRange(param0, param1, param2, var8, var9, param5 + param5, param6);
            PendingRequest.sortRankingRange(var10, param1, param2, param3, param4, 0, var8);
            return;
          }
          for (var7_intLifetime1 = -1 + param3; param6 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param6; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = LobbyPlayerEntry.field_Tb[var8Lifetime1];
              var10Lifetime1 = LobbyPlayerEntry.field_Tb[1 + var8Lifetime1];
              if (LoginMethodHelpers.comesBeforeRankingRow(param5 ^ 3005, param2, var9Lifetime1, var10Lifetime1)) {
                LobbyPlayerEntry.field_Tb[var8Lifetime1] = var10Lifetime1;
                LobbyPlayerEntry.field_Tb[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw AsyncCheckResult.wrapException((Throwable) ((Object) var7), "ka.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static void createGameOptions(boolean param0, byte param1) {
        MarkerSlider.field_H = new GameOptions(ByteArrayPool.field_c);
        if (param1 != 87) {
          return;
        }
        NodeHashTable.field_g = -1;
        MarkerSlider.field_H.field_d = MarkerSlider.field_H.field_d | param0;
    }

    public static void releaseStatics(int param0) {
        int var1 = 19 / ((55 - param0) / 49);
        field_n = null;
    }

    PendingRequest() {
        this.field_l = false;
    }

    static {
        field_i = -1;
        field_n = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
