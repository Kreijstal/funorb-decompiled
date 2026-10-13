/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cn {
    static int field_c;
    static byte[][] field_a;
    static RgbSprite[] field_e;
    static int field_d;
    static String field_b;

    final static AchievementIcon acquireAchievementIcon(int remainingOffset, int y, int width, AchievementBrowserScreen owner, int height, int transitionBitIndex, int x, int achievementId, int transitionBit) {
        AchievementIcon icon = null;
        RuntimeException var9_ref = null;
        AchievementIcon stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          icon = (AchievementIcon) (aa.achievementIconPool.removeFirst(3));
          if (icon == null) {
            icon = new AchievementIcon();
          }
          icon.y = y;
          icon.width = width;
          icon.height = height;
          icon.owner = owner;
          icon.achievementId = achievementId;
          icon.x = x;
          icon.remainingOffset = remainingOffset;
          icon.transitionKeepMask = ~(transitionBit << transitionBitIndex);
          stackIn_3_0 = icon;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9_ref = decompiledCaughtException;
          stackIn_6_0 = var9_ref;
          stackIn_6_1 = new StringBuilder().append("cn.A(").append(remainingOffset).append(',').append(y).append(',').append(width).append(',');
          if (owner == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qb.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(height).append(',').append(transitionBitIndex).append(',').append(x).append(',').append(achievementId).append(',').append(transitionBit).append(')').toString());
        }
    }

    final static void a(ScorePopup param0, PlayerBoard param1, int param2, int param3, int param4) {
        try {
          nn.field_g.drawCenteredAlpha(param0.text, (param0.x256 >> 8) + param3, (param0.y256 >> 8) + param4 + nn.field_g.capHeight, 0, -1, 256 * param0.remainingTicks / 50);
          if (param2 != 10030) {
            PlayerBoard var6 = (PlayerBoard) null;
            cn.a((ScorePopup) null, (PlayerBoard) null, -6, -71, 111);
          }
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "cn.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_a = (byte[][]) null;
        field_b = null;
        if (param0 < 97) {
          PlayerBoard var2 = (PlayerBoard) null;
          cn.a((ScorePopup) null, (PlayerBoard) null, 41, -50, 10);
        }
    }

    static {
        field_b = "Auto-respond to <%0>";
    }
}
