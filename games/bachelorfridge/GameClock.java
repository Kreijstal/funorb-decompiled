/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class GameClock {
    static AccountRequestState field_a;
    static String field_b;

    final int waitAndCountTicks(byte param0, long param1) {
        long var4 = this.getDelayMillis((byte) 63);
        if (var4 > 0L) {
          DisplayNameSelectionPanel.sleepMillis(false, var4);
          if (param0 != 109) {
            this.advanceTicks(-82L, 55);
            return this.advanceTicks(param1, 0);
          }
          return this.advanceTicks(param1, 0);
        }
        if (param0 == 109) {
          return this.advanceTicks(param1, 0);
        }
        this.advanceTicks(-82L, 55);
        return this.advanceTicks(param1, 0);
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 0) {
          field_a = (AccountRequestState) null;
        }
    }

    final static boolean isNonnegativeScreenId(int param0, int param1) {
        if (param1 > 116) {
          return param0 >= 0 ? true : false;
        }
        GameClock.isNonnegativeScreenId(-33, 0);
        return param0 >= 0 ? true : false;
    }

    abstract void resetTiming(boolean param0);

    abstract int advanceTicks(long param0, int param1);

    abstract long getDelayMillis(byte param0);

    static {
        field_a = new AccountRequestState();
        field_b = "<%0> has left the lobby.";
    }
}
