/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClock {
    static String field_d;
    static UiComponent field_f;
    static UiComponent field_e;
    static long[] field_c;
    static java.awt.Canvas field_b;
    static String field_a;

    final static Sprite[] loadSpriteSheet(int param0, int param1, Archive param2, int param3) {
        RuntimeException var4 = null;
        Object stackIn_4_0 = null;
        Sprite[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != 0) {
            field_e = (UiComponent) null;
          }
          if (AccountTermsPanel.decodeSpriteSheetFromArchive(param0, param2, param3, -60)) {
            stackIn_6_0 = LobbyPlayerEntry.buildSpritesFromDecodedSheet((byte) 76);
            return stackIn_6_0;
          }
          stackIn_4_0 = null;
          return (Sprite[]) (stackIn_4_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_9_0 = var4;
          stackIn_9_1 = new StringBuilder().append("uh.G(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param3).append(')').toString());
        }
    }

    final int waitAndAdvance(byte param0, long param1) {
        long var4 = 0L;
        long var4Lifetime1;
        if (param0 == -70) {
          var4 = this.getMillisUntilNextTick((byte) -58);
          if (0L < var4) {
            AnimationSequence.sleepMillis(false, var4);
          }
          return this.advanceTicks(param1, (byte) 52);
        }
        field_c = (long[]) null;
        var4Lifetime1 = this.getMillisUntilNextTick((byte) -58);
        if (0L < var4Lifetime1) {
          AnimationSequence.sleepMillis(false, var4Lifetime1);
        }
        return this.advanceTicks(param1, (byte) 52);
    }

    abstract void resetTiming(int param0);

    abstract long getMillisUntilNextTick(byte param0);

    final static UiComponent getIgnoreListContent(int param0) {
        if (param0 != 32) {
          field_e = (UiComponent) null;
          return TriangleSpanHelpers.getIgnoreListContent(57);
        }
        return TriangleSpanHelpers.getIgnoreListContent(57);
    }

    abstract int advanceTicks(long param0, byte param1);

    public static void releaseStatics(byte param0) {
        if (param0 == 41) {
          field_b = null;
          field_c = null;
          field_e = null;
          field_f = null;
          field_d = null;
          field_a = null;
          return;
        }
        GameClock.getIgnoreListContent(-116);
        field_b = null;
        field_c = null;
        field_e = null;
        field_f = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_c = new long[32];
        field_d = "Show lobby chat from my friends";
        field_a = "Quit to website";
    }
}
