/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ToolkitRasterState {
    static int field_g;
    static int field_b;
    ToolkitRasterState next;
    static String field_d;
    int clipBottom;
    int clipRight;
    static int field_i;
    static int field_c;
    int clipTop;
    static String field_j;
    ToolkitSprite target;
    int clipLeft;

    final void setState(int param0, ToolkitRasterState param1, int param2, ToolkitSprite param3, int param4, int param5, int param6) {
        try {
          this.next = param1;
          this.target = param3;
          if (param4 != 4096) {
            ToolkitRasterState.clearSharedReferences((byte) 30);
          }
          this.clipLeft = param6;
          this.clipTop = param5;
          this.clipBottom = param2;
          this.clipRight = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "sja.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        int var1 = -46 / ((param0 - 64) / 44);
        field_j = null;
        field_d = null;
    }

    static {
        field_b = 2;
        field_g = 0;
        field_d = "You have been removed from <%0>'s game.";
        field_i = 4096;
        field_j = "The account name you use to access RuneScape and other Jagex.com games";
        field_c = -1;
    }
}
