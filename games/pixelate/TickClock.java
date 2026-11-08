/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class TickClock {
    static boolean field_b;
    static SceneWidget field_e;
    static int field_d;
    static String[] field_c;
    static int field_a;

    public static void releaseStatics(boolean param0) {
        if (param0) {
          return;
        }
        field_c = null;
        field_e = null;
    }

    abstract int advanceTicks(boolean param0, long param1);

    final static SceneWidget getIgnoreListContent(int param0) {
        if (param0 <= 101) {
          TickClock.getIgnoreListContent(47);
          return PairedTextColumns.getIgnoreListContent((byte) 123);
        }
        return PairedTextColumns.getIgnoreListContent((byte) 123);
    }

    abstract void resynchronize(boolean param0);

    final int waitForTicks(byte param0, long param1) {
        int var4 = -125 % ((param0 + 64) / 46);
        long var5 = this.getMillisUntilNextTick(-23239);
        if (var5 <= 0L) {
          return this.advanceTicks(false, param1);
        }
        SecondaryNodeHashTable.sleepMillis(var5, (byte) 23);
        return this.advanceTicks(false, param1);
    }

    abstract long getMillisUntilNextTick(int param0);

    static {
        field_b = false;
        field_c = new String[16];
    }
}
