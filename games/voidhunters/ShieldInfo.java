/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ShieldInfo {
    int kind;
    int arcHalfAngle;
    int y;
    int x;
    int deltaY;
    int radius;
    int angle;
    int deltaX;
    ShipBody body;

    final static Sprite[] createGradientNineSliceSprites(int param0, int param1, int param2, int param3, int param4, int param5) {
        Sprite var11 = null;
        Sprite var12 = null;
        Sprite var13 = null;
        Object var14 = null;
        Sprite var16 = null;
        int[] var18 = SoftwareRasterizer2D.pixels;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = SoftwareRasterizer2D.width;
        int var8 = SoftwareRasterizer2D.height;
        Sprite var9 = new Sprite(param5, param1 - param5 * 2);
        var9.setRasterTarget();
        SoftwareRasterizer2D.fillGradientRectangle(0, 0, param5, param1 - param5 * 2, param0, param3);
        Sprite var10 = new Sprite(param5, param5);
        if (param4 > 86) {
          var10.setRasterTarget();
          SoftwareRasterizer2D.fillRectangle(0, 0, param5, param5, param0);
          var11 = new Sprite(16, param5);
          var11.setRasterTarget();
          SoftwareRasterizer2D.fillRectangle(0, 0, 16, param5, param0);
          var12 = new Sprite(param5, param5);
          var12.setRasterTarget();
          SoftwareRasterizer2D.fillRectangle(0, 0, param5, param5, param3);
          var13 = new Sprite(16, param5);
          var13.setRasterTarget();
          SoftwareRasterizer2D.fillRectangle(0, 0, 16, param5, param3);
          var14 = null;
          if (param2 > 0) {
            var16 = new Sprite(16, 16);
            var14 = var16;
            var16.setRasterTarget();
            SoftwareRasterizer2D.fillRectangle(0, 0, 16, 16, param2);
          }
          SoftwareRasterizer2D.setTarget(var18, var7, var8);
          return new Sprite[]{var10, var11, var10, var9, (Sprite) (var14), var9, var12, var13, var12};
        }
        return (Sprite[]) null;
    }

    final void configure(int param0, int param1, int param2, int param3, int param4, int param5, byte param6, ShipBody param7, int param8, int param9) {
        try {
          if (param6 < 7) {
            this.body = (ShipBody) null;
          }
          this.deltaY = param9;
          this.deltaX = param5;
          this.angle = param8;
          this.y = param1;
          this.x = param2;
          this.kind = param4;
          this.body = param7;
          this.radius = param3;
          this.arcHalfAngle = param0;
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "uwa.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ',' + (param7 != null ? "{...}" : "null") + ',' + param8 + ',' + param9 + ')');
        }
    }

    final static int readSignedBits(int param0, IsaacPacketBuffer param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 20) {
            stackIn_4_0 = (param1.readBits(0, param0) ^ 1 << -1 + param0) - (1 << -1 + param0);
            return stackIn_4_0;
          }
          stackIn_2_0 = -29;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("uwa.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    static {
    }
}
