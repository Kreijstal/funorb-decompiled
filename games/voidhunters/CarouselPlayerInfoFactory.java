/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CarouselPlayerInfoFactory implements GameStateFactory {
    static int fontDefaultColor;
    static int field_a;

    final static void fillRasterRectangleUnchecked(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var8 = VoidHunters.field_G;
        try {
          for (var6_int = param2; var6_int <= param5; var6_int++) {
            GetSalvoRepairTimeMultiplier.fillArraySpan(param4, param1, ResourceNode.field_b[var6_int], (byte) 75, param0);
          }
          int var7 = -38 % ((-5 - param3) / 63);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) runtimeException), "nn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, Camera2D param4, int param5) {
        int var16 = 0;
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var23 = VoidHunters.field_G;
        try {
          var6_int = param5;
          var7 = param0;
          var8 = param5;
          var9 = param0;
          var10 = param3 - param5;
          var11 = param2 - param0;
          var12 = var11;
          var13 = -var10;
          var14 = TextLayout.approximateVectorLength(var12, (byte) 103, var13);
          var13 = (var13 << 8) / var14;
          var12 = (var12 << 8) / var14;
          var15 = 64;
          for (var16 = param1; var15 + 1 > var16; var16++) {
            var17 = GetNumStars.cosAngle(512 * SetMinimapWidth.field_o - (var16 << 8), (byte) -65) >> 14;
            var18 = GetNumStars.cosAngle(-(var16 << 8) + SetMinimapWidth.field_o * 500, (byte) 59) >> 14;
            var19 = var12 * var17 + var10 * var16 / var15 + param5;
            var20 = var17 * var13 + var16 * var11 / var15 + param0;
            var21 = param5 + var10 * var16 / var15 - var18 * var12;
            SetShowTutorial.a(param4.worldToScreenX(var6_int, (byte) 126), (byte) 66, param4.worldToScreenX(var19, (byte) 126), param4.worldToScreenY(true, var7), 11206400, param4.worldToScreenY(true, var20), 200);
            var22 = -(var13 * var18) + (param0 + var11 * var16 / var15);
            var7 = var20;
            SetShowTutorial.a(param4.worldToScreenX(var8, (byte) 113), (byte) 66, param4.worldToScreenX(var21, (byte) 125), param4.worldToScreenY(true, var9), 12320512, param4.worldToScreenY(true, var22), 240);
            var6_int = var19;
            var8 = var21;
            var9 = var22;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("nn.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param5).append(')').toString());
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          fontDefaultColor = -83;
        }
        return (SerializableGameState[]) ((Object) new CarouselPlayerInfo[param1]);
    }

    public final SerializableGameState create(byte param0) {
        int var2 = -59 % ((param0 + 64) / 50);
        return (SerializableGameState) ((Object) new CarouselPlayerInfo());
    }

    static {
        field_a = 18;
        fontDefaultColor = 0;
    }
}
