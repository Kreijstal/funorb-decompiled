/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LevelSequence {
    LevelPack pack;
    static String field_a;
    static String field_g;
    private int period;
    private int[] order;
    static boolean chatFiltersChanged;
    boolean repeats;

    final void decodeLevel(ga unusedContext, IntNode levelState, NodeDeque motionPaths, int levelIndex, byte obfuscationGuard, NodeDeque[] brickGroups) {
        if (obfuscationGuard > -90) {
          return;
        }
        try {
          VolcanicBackground.decodeLevelBytes(brickGroups, this.pack.levelData[this.order[levelIndex % this.period]], levelState, motionPaths, unusedContext, 10792131);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oi.G(" + (unusedContext != null ? "{...}" : "null") + ',' + (levelState != null ? "{...}" : "null") + ',' + (motionPaths != null ? "{...}" : "null") + ',' + levelIndex + ',' + obfuscationGuard + ',' + (brickGroups != null ? "{...}" : "null") + ')');
        }
    }

    final int getPeriod(int obfuscationGuard) {
        int var2 = -58 / ((16 - obfuscationGuard) / 35);
        return this.period;
    }

    final String getLevelTitle(int levelIndex, byte obfuscationGuard) {
        if (obfuscationGuard < -117) {
          return this.pack.metadata[this.getLevelId(levelIndex, true)].title;
        }
        this.period = 122;
        return this.pack.metadata[this.getLevelId(levelIndex, true)].title;
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 <= 47) {
          LevelSequence.a(97, -60, 47, -79);
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (param1 != -1) {
          return true;
        }
        if (null != GameRenderAudioHelpers.contextActions &&
          GameRenderAudioHelpers.contextActions.handleContextCancelKey(param1 ^ -2100)) {
          ActivityIndicatorWidget.f((byte) -123);
          return true;
        }
        if (CircleBody.reportAbuseDialog != null &&
          CircleBody.reportAbuseDialog.handleCancelKey((byte) 119)) {
          CircleBody.reportAbuseDialog = null;
          ActivityIndicatorWidget.f((byte) -55);
          return true;
        }
        if (DateFieldsWidget.j((byte) -60)) {
          return true;
        }
        if (NinjaBackground.a(param3, param0, (byte) 108, param2)) {
          return true;
        }
        return false;
    }

    private final int getLevelId(int levelIndex, boolean obfuscationGuard) {
        if (obfuscationGuard) {
          return this.order[levelIndex % this.period];
        }
        field_a = (String) null;
        return this.order[levelIndex % this.period];
    }

    final String getLevelNumberLabel(byte obfuscationGuard, int levelIndex) {
        if (obfuscationGuard > 94) {
          return this.pack.metadata[this.getLevelId(levelIndex, true)].numberLabel;
        }
        this.period = 59;
        return this.pack.metadata[this.getLevelId(levelIndex, true)].numberLabel;
    }

    LevelSequence(LevelPack pack) {
        this(pack, IndexedSpriteHelpers.createIndexOrder(false, pack.levelCount, (IsaacGenerator) null), pack.levelCount);
    }

    LevelSequence(LevelPack pack, int[] order, int period) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.order = order;
          this.pack = pack;
          this.period = period;
          if (this.period >= 0) {
            return;
          }
          this.period = this.order.length;
          this.repeats = true;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("oi.<init>(");
          if (pack == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (order == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(period).append(')').toString());
        }
    }

    static {
        field_g = null;
        chatFiltersChanged = true;
        field_a = "Close";
    }
}
