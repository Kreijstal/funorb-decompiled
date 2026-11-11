/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class HardwareSceneLight extends SceneLight {
    static UiComponent field_o;

    final static void resetChatRateLimit(byte param0) {
        int var1 = -20 % ((64 - param0) / 44);
        vaa.field_b = bva.currentTimeMillis((byte) -107);
        gp.field_h = 0;
    }

    final void setIntensity(byte param0, float param1) {
        this.intensity = param1;
        if (param0 <= 77) {
          field_o = (UiComponent) null;
        }
    }

    final void setRadius(byte param0, int param1) {
        this.radius = param1;
        if (param0 != 62) {
          field_o = (UiComponent) null;
        }
    }

    final static void a(int param0, byte param1) {
        BitPacketBuffer var2 = ql.field_k;
        var2.writeCipheredOpcode(param0, -2988);
        var2.position = var2.position + 1;
        int var3 = var2.position;
        var2.writeByte(2, 0);
        var2.writeBytes(0, CourseLayoutFactory.field_b, CourseLayoutFactory.field_b.length, 71);
        int var4 = -104 % ((param1 - 22) / 36);
        var2.writeByte(CoinBagItemComponent.field_H, 0);
        var2.writeByte(mua.field_b, 0);
        var2.writeBytes(0, TileGrid.field_e, TileGrid.field_e.length, 119);
        var2.backpatchByteLength(var2.position - var3, (byte) -102);
    }

    final static LegacyOpenGlSpriteTexture createSpriteTexture(byte[] param0, int param1, byte param2, int param3, OpenGlToolkit param4, int param5, boolean param6, int param7) {
        RuntimeException var8 = null;
        OpenGlToolkit var9 = null;
        LegacyOpenGlSpriteTexture stackIn_8_0 = null;
        LegacyOpenGlSpriteTexture stackIn_10_0 = null;
        LegacyOpenGlSpriteTexture stackIn_12_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 <= 52) {
            var9 = (OpenGlToolkit) null;
            HardwareSceneLight.createSpriteTexture((byte[]) null, 99, (byte) 8, -3, (OpenGlToolkit) null, -12, false, 23);
          }
          if (!param4.field_Gb && (!PbufferEntry.isPowerOfTwoOrZero(9181, param5) ||
            !PbufferEntry.isPowerOfTwoOrZero(9181, param7))) {
            if (param4.field_Cc) {
              stackIn_10_0 = new LegacyOpenGlSpriteTexture(param4, 34037, param3, param5, param7, param6, param0, param1);
              return stackIn_10_0;
            }
            stackIn_8_0 = new LegacyOpenGlSpriteTexture(param4, param3, param5, param7, lla.nextPowerOfTwo(false, param5), lla.nextPowerOfTwo(false, param7), param0, param1);
            return stackIn_8_0;
          }
          stackIn_12_0 = new LegacyOpenGlSpriteTexture(param4, 3553, param3, param5, param7, param6, param0, param1);
          return stackIn_12_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_15_0 = var8;
          stackIn_15_1 = new StringBuilder().append("jq.F(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          stackIn_18_1 = ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    final void setColour(int param0, int param1) {
        this.colour = param1;
        if (param0 != 255) {
          field_o = (UiComponent) null;
        }
    }

    HardwareSceneLight(int param0, int param1, int param2, int param3, int param4, float param5) {
        super(param0, param1, param2, param3, param4, param5);
    }

    public static void releaseStatics(byte param0) {
        if (param0 != -112) {
          return;
        }
        field_o = null;
    }

    final void setPosition(int param0, int param1, byte param2, int param3) {
        this.x = param1;
        int var5 = 97 % ((param2 + 55) / 58);
        this.y = param0;
        this.z = param3;
    }

    static {
    }
}
