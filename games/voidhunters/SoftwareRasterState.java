/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoftwareRasterState extends IntrusiveNode {
    int[] pixels;
    int clipLeft;
    int clipRight;
    int clipTop;
    static ConsoleCommandRegistry field_f;
    int height;
    int width;
    int clipBottom;

    final static void setRequestedPlayerName(byte param0, String param1) {
        try {
          GetFighterBayAimspeed.requestedPlayerName = param1;
          if (param0 != -74) {
            String var3 = (String) null;
            SoftwareRasterState.setRequestedPlayerName((byte) 76, (String) null);
          }
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ajb.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void clearSharedReferences(byte param0) {
        field_f = null;
        if (param0 != 44) {
          SoftwareRasterState.clearSharedReferences((byte) 98);
        }
    }

    final void setState(int param0, int[] param1, int param2, byte param3, int param4, int param5, int param6, int param7) {
        try {
          this.clipTop = param2;
          this.clipBottom = param5;
          this.width = param6;
          this.pixels = param1;
          if (param3 >= -84) {
            this.clipLeft = -65;
          }
          this.height = param0;
          this.clipRight = param4;
          this.clipLeft = param7;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "ajb.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + param7 + ')');
        }
    }

    SoftwareRasterState() {
    }

    static {
        field_f = new ConsoleCommandRegistry();
    }
}
