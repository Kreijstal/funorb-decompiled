/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oq {
    final static fga getSharedShellListener(byte param0) {
        if (param0 != 124) {
          return (fga) null;
        }
        if (null == RoomVariant.field_d) {
          RoomVariant.field_d = new fga();
          return RoomVariant.field_d;
        }
        return RoomVariant.field_d;
    }

    final static void drawRectangleOutline3D(int param0, int param1, int param2, int param3, int param4, int param5, int param6, boolean param7) {
        if (param7) {
          jia.drawLine3D(param0, param3, param2, param5, param0, 67, param1, param6, param2);
          jia.drawLine3D(param4, param3, param2, param5, param0, 76, param1, param1, param2);
          jia.drawLine3D(param0, param3, param2, param5, param4, 75, param6, param6, param2);
          jia.drawLine3D(param4, param3, param2, param5, param4, 61, param6, param1, param2);
          return;
        }
    }

    static {
    }
}
