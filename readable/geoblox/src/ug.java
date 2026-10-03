/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ug {
    static int newAchievementMask;
    static vg field_a;
    static String createEmailText;

    final static StringBuilder a(StringBuilder param0, byte param1, char param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        String var7 = null;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Geoblox.clientControlFlowFlag;
        try {
          if (param1 >= -125) {
            var7 = (String) null;
            ug.loadSprite((String) null, (ResourceArchive) null, (byte) 14, (String) null);
          }
          var4_int = param0.length();
          param0.setLength(param3);
          for (var5 = var4_int; param3 > var5; var5++) {
            param0.setCharAt(var5, param2);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ug.D(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void spawnScorePopup(int points, boolean methodGuard, int originY, int chainMultiplier, int originX) {
        ScorePopup popup = (ScorePopup) ((Object) ue.availableScorePopups.removeLast(1));
        if (!(popup != null)) {
            UiWidget.gameplaySession.addScore((byte) 127, points);
            return;
        }
        popup.progress = 0.0f;
        popup.points = points;
        popup.pointsText = Integer.toString(points);
        popup.originX = (float)originX;
        popup.chainMultiplier = chainMultiplier;
        if (methodGuard) {
            popup.originY = (float)originY;
            md.activeScorePopups.addLast(-95, popup);
            return;
        }
        createEmailText = (String) null;
        popup.originY = (float)originY;
        md.activeScorePopups.addLast(-95, popup);
    }

    final static Sprite loadSprite(String resourceName, ResourceArchive graphicsArchive, byte methodGuard, String groupName) {
        int archiveGroupId = 0;
        RuntimeException var4 = null;
        int archiveFileId = 0;
        Sprite stackIn_2_0 = null;
        Sprite stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          archiveGroupId = graphicsArchive.findGroupId((byte) 127, groupName);
          archiveFileId = graphicsArchive.findFileId(resourceName, -57, archiveGroupId);
          if (methodGuard == -78) {
            stackIn_4_0 = ByteArrayBuffer.a(archiveGroupId, methodGuard ^ -95, archiveFileId, graphicsArchive);
            return stackIn_4_0;
          }
          stackIn_2_0 = (Sprite) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ug.C(");
          if (resourceName == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (graphicsArchive == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(methodGuard).append(',');
          if (groupName == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        createEmailText = null;
        field_a = null;
        if (param0 != 9144) {
            String var2 = (String) null;
            ug.loadSprite((String) null, (ResourceArchive) null, (byte) 53, (String) null);
        }
    }

    static {
        createEmailText = "Email (Login):";
    }
}
