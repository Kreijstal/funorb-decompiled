/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class IdleTickHelpers {
    static String field_e;
    static ScrollBar field_a;
    static LoginForm field_c;
    static int[] field_f;
    static int field_b;
    static int field_d;

    public static void releaseStatics(int param0) {
        field_e = null;
        field_a = null;
        int var1 = 5 / ((42 - param0) / 45);
        field_c = null;
        field_f = null;
    }

    final static int getIdleTicks(boolean param0) {
        if (!param0) {
          field_a = (ScrollBar) null;
          return LevelFileEntry.field_m;
        }
        return LevelFileEntry.field_m;
    }

    static {
        field_f = new int[4];
        field_e = "Withdraw request to join <%0>'s game";
        field_d = 20;
    }
}
