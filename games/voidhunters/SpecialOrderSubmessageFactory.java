/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SpecialOrderSubmessageFactory implements GameStateFactory {
    static String field_a;

    final static SoftwareIndexedSprite2D[] loadIndexedSprites(int param0, byte param1, int param2, ResourceArchive param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        SoftwareIndexedSprite2D[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!SpriteArchiveDecoder.decodeSpriteArchiveFile(param0, 2, param3, param2)) {
            return null;
          }
          var4_int = -44 % ((param1 - 53) / 50);
          stackIn_4_0 = GpuFractalNoiseVolume.createIndexedSprites((byte) -91);
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ng.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.wrapClientException((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public final SerializableGameState create(byte param0) {
        int var2 = 29 / ((-64 - param0) / 50);
        return (SerializableGameState) ((Object) new SpecialOrderSubmessage());
    }

    final static int segmentIntersectionFraction(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, int param9) {
        if (Math.max(param3, param5) < Math.min(param7, param4)) {
          return -1;
        }
        if (Math.max(param1, param9) < Math.min(param6, param8)) {
          return -1;
        }
        if (Math.max(param7, param4) < Math.min(param3, param5)) {
          return -1;
        }
        if (Math.max(param6, param8) < Math.min(param1, param9)) {
          return -1;
        }
        param4 = param4 - param7;
        param9 = param9 - param1;
        param5 = param5 - param3;
        param8 = param8 - param6;
        param1 = param1 - param6;
        param3 = param3 - param7;
        int var10 = -14 + Math.max(Math.max(IntegerLogarithms.floorLog2Magnitude(112, param3), IntegerLogarithms.floorLog2Magnitude(119, param5)), IntegerLogarithms.floorLog2Magnitude(112, param4));
        if (var10 > 0) {
          param5 = param5 >> var10;
          param4 = param4 >> var10;
          param3 = param3 >> var10;
        }
        var10 = -14 + Math.max(Math.max(IntegerLogarithms.floorLog2Magnitude(116, param1), IntegerLogarithms.floorLog2Magnitude(123, param9)), IntegerLogarithms.floorLog2Magnitude(111, param8));
        if (0 < var10) {
          param9 = param9 >> var10;
          param1 = param1 >> var10;
          param8 = param8 >> var10;
        }
        if (param2 >= 45) {
          return SegmentIntersections.intersectionFraction(param8, param5, param1, param4, param0, param9, param3, 0);
        }
        field_a = (String) null;
        return SegmentIntersections.intersectionFraction(param8, param5, param1, param4, param0, param9, param3, 0);
    }

    public static void clearSharedReferences(boolean param0) {
        field_a = null;
        if (param0) {
          ResourceArchive var2 = (ResourceArchive) null;
          SpecialOrderSubmessageFactory.loadIndexedSprites(-49, (byte) -68, 33, (ResourceArchive) null);
        }
    }

    public final SerializableGameState[] createArray(int param0, int param1) {
        if (param0 != 11995) {
          SpecialOrderSubmessageFactory.clearSharedReferences(true);
          return (SerializableGameState[]) ((Object) new SpecialOrderSubmessage[param1]);
        }
        return (SerializableGameState[]) ((Object) new SpecialOrderSubmessage[param1]);
    }

    static {
        field_a = "Activate scrambler pulse";
    }
}
