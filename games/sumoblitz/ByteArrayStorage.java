/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ByteArrayStorage {
    static SpriteData[] field_a;

    final static void receiveChatMessage(ChatMessage message, byte guard) {
        int var2_int = 0;
        ChatMessage var3 = null;
        int var4 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          if (null == message.text) {
            return;
          }
          if (guard < 43) {
            field_a = (SpriteData[]) null;
          }
          if (message.messageIdHigh != 0 ||
            0 != message.messageIdLow) {
            for (var2_int = 0; LegacyOpenGlBuffer.chatMessageCount > var2_int; var2_int++) {
              var3 = DroneDebris.chatHistory[var2_int];
              if (var3.type == 2 &&
                message.messageIdHigh == var3.messageIdHigh &&
                var3.messageIdLow == message.messageIdLow) {
                return;
              }
            }
          }
          if (null == message.quickChatResponses) {
          }
          LegacyOpenGlTransform3D.appendChatHistory(message, (byte) 76);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_22_0 = var2;
          stackIn_22_1 = new StringBuilder().append("nn.E(");
          if (message == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(guard).append(')').toString());
        }
    }

    final static void drawBeveledBorder(int param0, int param1, int param2, byte param3, int param4) {
        int var7 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var8 = 0;
        int var9 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          SoftwareRasterizer.drawHorizontalLine(param1, param4, 1 + param2, 10000536);
          SoftwareRasterizer.drawHorizontalLine(param1, param4 + param0, 1 + param2, 12105912);
          var5_int = 1;
          if (param3 != -84) {
            return;
          }
          var6 = param0;
          if (SoftwareRasterizer.clipTop > var5_int + param4) {
            var5_int = -param4 + SoftwareRasterizer.clipTop;
          }
          if (param4 + var6 > SoftwareRasterizer.clipBottom) {
            var6 = SoftwareRasterizer.clipBottom - param4;
          }
          for (var7 = var5_int; var6 > var7; var7++) {
            var8 = 152 + 48 * var7 / param0;
            var9 = var8 << 16 | var8 << 8 | var8;
            SoftwareRasterizer.pixels[param1 + SoftwareRasterizer.width * (var7 + param4)] = var9;
            SoftwareRasterizer.pixels[(param4 + var7) * SoftwareRasterizer.width + (param1 + param2)] = var9;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var5), "nn.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    abstract byte[] copyRange(int offset, int length, int guard);

    final static boolean areFirstLevelsCompleteOnHard(int count, int guard) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Sumoblitz.field_L ? 1 : 0;
        try {
          var2_int = 0;
          var3 = 53 / ((55 - guard) / 52);
          while (true) {
            if (count <= var2_int) {
              return true;
            }
            if (NineSlicePanel.field_d[var2_int]) {
              var2_int++;
              continue;
            }
            break;
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) var2), "nn.C(" + count + ',' + guard + ')');
        }
    }

    abstract byte[] copyBytes(boolean param0);

    abstract void setBytes(byte[] bytes, int guard);

    final static void drawHorizontalSpriteStrip(int param0, int param1, int param2, int param3, Sprite[] param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        int var8 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = Sumoblitz.field_L ? 1 : 0;
        if (param4 == null ||
          param1 <= 0) {
          return;
        }
        try {
          var6_int = param4[0].paddedWidth;
          var7 = param4[2].paddedWidth;
          var8 = param4[1].paddedWidth;
          param4[0].drawRecolored(param5, param2, param0);
          int var9 = -64 % ((param3 + 25) / 61);
          param4[2].drawRecolored(-var7 + param1 + param5, param2, param0);
          SoftwareRasterizer.saveClip(PerlinNoise2D.field_t);
          SoftwareRasterizer.intersectClip(param5 + var6_int, param2, -var7 + (param1 + param5), param2 + param4[1].paddedHeight);
          var10 = param5 + var6_int;
          var11 = -var7 + param1 + param5;
          for (param5 = var10; param5 < var11; param5 = param5 + var8) {
            param4[1].drawRecolored(param5, param2, param0);
          }
          SoftwareRasterizer.restoreClip(PerlinNoise2D.field_t);
        } catch (RuntimeException runtimeException) {
          throw ClientExceptionSupport.wrapWithContext((Throwable) ((Object) runtimeException), "nn.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ',' + param5 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        int var1 = 65 / ((-2 - param0) / 57);
        field_a = null;
    }

    final static void compatibilityNoOp(int param0, int param1) {
        if (param1 > -95) {
          ByteArrayStorage.drawBeveledBorder(27, 41, -94, (byte) -104, 35);
        }
    }

    static {
    }
}
