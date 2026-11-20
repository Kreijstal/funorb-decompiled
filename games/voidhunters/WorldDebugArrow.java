/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WorldDebugArrow extends IntrusiveNode {
    int endY;
    int endX;
    int startY;
    static int[][] debugPolygons;
    int remainingTicks;
    int startX;

    public static void clearSharedReferences(byte param0) {
        int var1 = 2 % ((param0 - 73) / 41);
        debugPolygons = (int[][]) null;
    }

    WorldDebugArrow(int param0, int param1, int param2, int param3) {
        this.startX = param0;
        this.startY = param1;
        this.endX = param2;
        this.remainingTicks = SetAutoaim.field_o;
        this.endY = param3;
    }

    static {
        AdminMessageFactory discarded$0 = new AdminMessageFactory();
    }
}
