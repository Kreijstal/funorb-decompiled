/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementQuery extends IntrusiveNode {
    static int[] field_g;
    int[] resultValues;
    boolean complete;
    static String[] field_h;

    final static Sprite[] loadSpriteSheet(int param0, int param1, byte param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = 75 / ((72 - param2) / 47);
          if (RankingRowFactory.decodeSpriteSheetFromArchive(param1, param3, param0, 117)) {
            return LeaderboardParticipant.buildDecodedSprites(-125);
          }
          return null;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_6_0 = var4;
          stackIn_6_1 = new StringBuilder().append("dk.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw GameSoundEffect.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void clipToGridCell(int param0, int param1, int param2, int param3, int param4) {
        int var5;
        int var6;
        int var7;
        int var8;
        ResourceArchive var9;
        ResourceArchive var9Lifetime1;
        ResourceArchive var9Lifetime2;
        var5 = param4 * 52 + param0;
        var6 = var5 + 52;
        var7 = 75 * param3 + param2;
        var8 = 75 + var7;
        boolean decompiledFrameRemainder0 = true;
        if (0 < param4) {
          var5++;
          if (param4 < 2) {
            var6--;
          }
        } else {
          if (param4 >= 2) {
            if (2 > param3) {
              var8--;
              decompiledFrameRemainder0 = false;
            }
            else {
              if (0 < param3) {
                var7++;
                if (param1 > -95) {
                  var9 = (ResourceArchive) null;
                  AchievementQuery.loadSpriteSheet(72, -51, (byte) 107, (ResourceArchive) null);
                }
                AuctionListing.pushRasterClip(var6, -22914, var5, var8, var7);
                return;
              }
              if (param1 <= -95) {
                AuctionListing.pushRasterClip(var6, -22914, var5, var8, var7);
                return;
              }
              var9Lifetime2 = (ResourceArchive) null;
              AchievementQuery.loadSpriteSheet(72, -51, (byte) 107, (ResourceArchive) null);
              AuctionListing.pushRasterClip(var6, -22914, var5, var8, var7);
              return;
            }
          }
          if (decompiledFrameRemainder0) {
            var6--;
          }
        }
        if ((decompiledFrameRemainder0) &&
          (2 > param3)) {
          var8--;
        }
        if (0 < param3) {
          var7++;
        }
        if (param1 > -95) {
          var9Lifetime1 = (ResourceArchive) null;
          AchievementQuery.loadSpriteSheet(72, -51, (byte) 107, (ResourceArchive) null);
        }
        AuctionListing.pushRasterClip(var6, -22914, var5, var8, var7);
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        field_g = null;
        if (param0 != 7571) {
          field_g = (int[]) null;
        }
    }

    AchievementQuery() {
        this.complete = false;
    }

    static {
        field_h = new String[]{"THE TANK", "THE KEEPER", "THE RANGER", "THE HOTSHOT", "THE ELITE"};
    }
}
