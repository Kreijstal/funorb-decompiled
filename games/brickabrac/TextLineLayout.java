/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextLineLayout {
    int bottom;
    static String[] field_e;
    int top;
    static int[] viewVertexZ;
    static int field_f;
    int[] caretX;
    static int field_b;

    final static RgbSprite a(ResourceArchive param0, int param1, int param2, int param3) {
        RuntimeException var4 = null;
        RgbSprite stackIn_5_0 = null;
        RgbSprite stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!ln.decodeSpritesFromArchive(-100, param2, param0, param1)) {
            return null;
          }
          if (param3 == 1) {
            stackIn_7_0 = NineSliceFrame.b(param3 ^ 13875);
            return stackIn_7_0;
          }
          stackIn_5_0 = (RgbSprite) null;
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("ml.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void requestMatchmakingOptions(int opcode, int obfuscationGuard) {
        BitPacketBuffer packet = TextFieldValidator.outgoingPackets;
        packet.writeCipheredOpcode(-13413, opcode);
        packet.writeByte(-21, 1);
        if (obfuscationGuard != -1) {
          field_f = 16;
        }
        packet.writeByte(-111, 0);
    }

    final int findCaretIndex(byte obfuscationGuard, int x) {
        int caretIndex = 0;
        int unusedGameFlag;
        unusedGameFlag = BrickABrac.field_J ? 1 : 0;
        if (null != this.caretX &&
          this.caretX.length != 0) {
          if (obfuscationGuard != -95) {
            this.bottom = -53;
          }
          for (caretIndex = 1; this.caretX.length > caretIndex; caretIndex++) {
            if ((this.caretX[-1 + caretIndex] + this.caretX[caretIndex] >> 1) > x) {
              return -1 + caretIndex;
            }
          }
          return this.caretX.length - 1;
        }
        return 0;
    }

    final int getRightEdge(byte obfuscationGuard) {
        int stackIn_7_0 = 0;
        if (obfuscationGuard != 56) {
          return 69;
        }
        if (this.caretX != null &&
          0 != this.caretX.length) {
          stackIn_7_0 = this.caretX[-1 + this.caretX.length];
        } else {
          stackIn_7_0 = 0;
        }
        return stackIn_7_0;
    }

    final static void a(int param0, IndexedSprite param1, byte param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_35_0 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = BrickABrac.field_J ? 1 : 0;
        try {
          var6_int = (-param5 + param0 << 8) / param1.canvasWidth;
          param4 = param4 + param1.offsetX;
          param3 = param3 + param1.offsetY;
          var7 = var6_int * param1.offsetX + (param5 << 8);
          if (param2 <= 80) {
            field_e = (String[]) null;
          }
          var8 = param3 * Rasterizer2D.width + param4;
          var9 = 0;
          var10 = param1.height;
          var11 = param1.width;
          var12 = Rasterizer2D.width - var11;
          var13 = 0;
          if (param3 < Rasterizer2D.clipTop) {
            var14 = -param3 + Rasterizer2D.clipTop;
            var9 = var9 + var11 * var14;
            var10 = var10 - var14;
            param3 = Rasterizer2D.clipTop;
            var8 = var8 + Rasterizer2D.width * var14;
          }
          if (param4 < Rasterizer2D.clipLeft) {
            var14Lifetime1 = -param4 + Rasterizer2D.clipLeft;
            param4 = Rasterizer2D.clipLeft;
            var9 = var9 + var14Lifetime1;
            var13 = var13 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var12 = var12 + var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            var8 = var8 + var14Lifetime1;
          }
          if (var10 + param3 > Rasterizer2D.clipBottom) {
            var10 = var10 - (param3 - (-var10 + Rasterizer2D.clipBottom));
          }
          if (Rasterizer2D.clipRight < param4 + var11) {
            var14Lifetime2 = param4 + (var11 - Rasterizer2D.clipRight);
            var12 = var12 + var14Lifetime2;
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param3 = -var10; param3 < 0; param3++) {
              var14Lifetime3 = var7;
              for (param4 = -var11; 0 > param4; param4++) {
                var15 = var14Lifetime3 >> 8;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                var16 = 256 - var15;
                if (var15 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param1.palette[255 & param1.indices[incrementValue$0]];
                  if (var17 != 0) {
                    if (var15 > 255) {
                      Rasterizer2D.pixels[var8] = var17;
                    } else {
                      var18 = Rasterizer2D.pixels[var8];
                      var19 = (16711935 & var18) * var16 + (var17 & 16711935) * var15 >> 8 & 16711935;
                      Rasterizer2D.pixels[var8] = IntrusiveHashIterator.a(65280, var16 * IntrusiveHashIterator.a(var18, 65280) + var15 * IntrusiveHashIterator.a(65280, var17) >> 8) + var19;
                    }
                  }
                  var8++;
                } else {
                  var9++;
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_35_0 = var6;
          stackIn_35_1 = new StringBuilder().append("ml.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_35_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(byte param0) {
        viewVertexZ = null;
        field_e = null;
        if (param0 != 111) {
          IndexedSprite var2 = (IndexedSprite) null;
          TextLineLayout.a(26, (IndexedSprite) null, (byte) 26, -9, 66, -42);
        }
    }

    TextLineLayout(int top, int bottom, int sourceLength) {
        this.bottom = bottom;
        this.caretX = new int[sourceLength + 1];
        this.top = top;
    }

    static {
        viewVertexZ = new int[8192];
    }
}
