/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eh {
    ub field_i;
    TextFont field_l;
    int field_h;
    int field_g;
    int field_m;
    ub field_q;
    int field_p;
    private int field_c;
    static String[] field_e;
    int field_f;
    int field_j;
    static int field_k;
    static mh field_n;
    ub field_b;
    ub field_r;
    int field_a;
    static String field_d;
    ub field_o;
    private boolean field_s;

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_n = null;
        if (param0 != -31063) {
          field_e = (String[]) null;
        }
    }

    final void a(TextFont param0, int param1) {
        um var17 = null;
        up var4 = null;
        RgbSprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        up var6 = null;
        up var7 = null;
        pf discarded$0 = null;
        dg discarded$1 = null;
        up var8 = null;
        RgbSprite[] var9 = null;
        RgbSprite[] var10 = null;
        RgbSprite dupTemp$2 = null;
        up var11 = null;
        up var12 = null;
        RgbSprite var13 = null;
        up var14 = null;
        up var19 = null;
        int var15 = BrickABrac.field_J ? 1 : 0;
        up var14Lifetime1;
        up var14Lifetime2;
        try {
          var17 = new um(param0, 2, 2, 2236962, 1, 1, 1, param0.ascent + param0.descent + 2);
          var17.field_r = 16777215;
          this.field_i = (ub) ((Object) var17);
          var4 = new up();
          var17.a(-86, var4);
          var4.field_s = 15658734;
          var4.field_c = 11711154;
          this.field_l = param0;
          this.field_f = 3;
          this.field_a = 3;
          this.field_p = 5592405;
          this.field_m = -1;
          this.field_h = 3;
          this.field_c = 15658734;
          this.field_j = 15658734;
          this.field_g = 3;
          var4.b(0, 113).a(false, 15658734).a(ScorePopup.a(7829367, 10066329, (byte) 66, 8947848), -2147483648);
          var4.b(1, 110).a(ScorePopup.a(13421772, 10066329, (byte) 115, 11184810), -2147483648);
          var4.b(3, 118).a(ScorePopup.a(10066329, 7829367, (byte) 115, 8947848), param1 ^ -2134061876).b(1, (byte) -50).a(0, 1);
          var5 = new RgbSprite[9];
          var16 = new ArgbSprite(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
            var16.pixels[var7_int] = 1077952576;
          }
          var5[4] = (RgbSprite) ((Object) var18);
          var4.b(4, 121).a(true, false).a(var5, -2147483648);
          var4.b(5, param1 ^ 13421757).a(fj.a(0, 0, 65793, 1, 0), param1 ^ -2134061876).a(true, false).a(false, -1);
          this.field_q = (ub) ((Object) var4);
          var6 = new up(var4, true);
          var6.field_f = 0;
          var7 = new up(var4, true);
          var7.field_f = 0;
          var7.a(BallPulseEffect.a(8947848, false), false);
          var7.b(1, 110).a(BallPulseEffect.a(11184810, false), param1 + 2134061876).a(false, 2236962);
          this.field_o = (ub) ((Object) new ei(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new pf(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new dg(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new up();
          var17.a(-68, var8);
          var8.b(0, 105).a(ScorePopup.a(10066329, 7829367, (byte) 124, 15658734), -2147483648).a(false, 1118481).a(-1, (byte) -69);
          var8.b(4, 108).a(true, false).a(var5, -2147483648);
          this.field_b = (ub) ((Object) var8);
          var9 = new RgbSprite[9];
          var9[4] = new RgbSprite(2, 1);
          var10 = new RgbSprite[9];
          var10[4] = new RgbSprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          var11 = new up();
          var12 = new up();
          var11.a(true, 0, var9);
          var12.a(true, 0, var10);
          var13 = new RgbSprite(7, 4);
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, param1, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new up(var4, true);
          var14.a(-1553, var13.copy());
          var13.rotateClockwise();
          var14Lifetime1 = new up(var4, true);
          var14Lifetime1.a(-1553, var13.copy());
          var13.rotateClockwise();
          var14Lifetime2 = new up(var4, true);
          var14Lifetime2.a(-1553, var13.copy());
          var13.rotateClockwise();
          var19 = new up(var4, true);
          var19.a(-1553, var13);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "eh.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void decodeSpriteData(byte[] data, boolean obfuscationGuard) {
        byte dupTemp$0 = 0;
        byte dupTemp$1 = 0;
        byte[] stackIn_30_0 = null;
        int stackIn_30_1 = 0;
        PacketBuffer stackIn_30_2 = null;
        boolean stackIn_31_3;
        byte[] stackIn_40_0 = null;
        int stackIn_40_1 = 0;
        PacketBuffer stackIn_40_2 = null;
        boolean stackIn_41_3 = false;
        int stackIn_43_0 = 0;
        int stackIn_44_1 = 0;
        byte[] stackIn_54_0 = null;
        int stackIn_54_1 = 0;
        PacketBuffer stackIn_54_2 = null;
        boolean stackIn_55_3 = false;
        int stackIn_57_0 = 0;
        int stackIn_58_1 = 0;
        RuntimeException stackIn_63_0 = null;
        StringBuilder stackIn_63_1 = null;
        String stackIn_64_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int paletteSize = 0;
        int var4 = 0;
        int spriteWidth = 0;
        int spriteHeight = 0;
        int pixelCount = 0;
        byte[] indices = null;
        byte[] alpha = null;
        int hasNonopaqueAlpha = 0;
        int layoutFlags = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int clientBranchFlag = 0;
        PacketBuffer packet = null;
        PacketBuffer metadataPacket = null;
        byte[] var18 = null;
        byte[] var19 = null;
        byte[] var20 = null;
        byte[] var21 = null;
        int offsetYIndex;
        int widthIndex;
        int heightIndex;
        int paletteIndex;
        int spriteIndex;
        clientBranchFlag = BrickABrac.field_J ? 1 : 0;
        try {
          packet = new PacketBuffer(data);
          metadataPacket = packet;
          metadataPacket.position = -2 + data.length;
          nl.decodedSpriteCount = metadataPacket.readUnsignedShort(65280);
          cn.decodedSpriteIndices = new byte[nl.decodedSpriteCount][];
          jh.decodedSpriteWidths = new int[nl.decodedSpriteCount];
          dl.decodedSpriteOffsetY = new int[nl.decodedSpriteCount];
          gg.decodedSpriteHeights = new int[nl.decodedSpriteCount];
          tm.decodedSpriteHasAlpha = new boolean[nl.decodedSpriteCount];
          bj.decodedSpriteAlpha = new byte[nl.decodedSpriteCount][];
          ag.decodedSpriteOffsetX = new int[nl.decodedSpriteCount];
          metadataPacket.position = -(8 * nl.decodedSpriteCount) + (-7 + data.length);
          cf.decodedCanvasWidth = metadataPacket.readUnsignedShort(65280);
          ek.decodedCanvasHeight = metadataPacket.readUnsignedShort(65280);
          paletteSize = 1 + (metadataPacket.readUnsignedByte(255) & 255);
          for (var4 = 0; nl.decodedSpriteCount > var4; var4++) {
            ag.decodedSpriteOffsetX[var4] = packet.readUnsignedShort(65280);
          }
          for (offsetYIndex = 0; nl.decodedSpriteCount > offsetYIndex; offsetYIndex++) {
            dl.decodedSpriteOffsetY[offsetYIndex] = metadataPacket.readUnsignedShort(65280);
          }
          for (widthIndex = 0; nl.decodedSpriteCount > widthIndex; widthIndex++) {
            jh.decodedSpriteWidths[widthIndex] = metadataPacket.readUnsignedShort(65280);
          }
          for (heightIndex = 0; heightIndex < nl.decodedSpriteCount; heightIndex++) {
            gg.decodedSpriteHeights[heightIndex] = metadataPacket.readUnsignedShort(65280);
          }
          metadataPacket.position = -(3 * (paletteSize - 1)) + (-(nl.decodedSpriteCount * 8) + data.length - 7);
          qp.decodedSpritePalette = new int[paletteSize];
          for (paletteIndex = 1; paletteSize > paletteIndex; paletteIndex++) {
            qp.decodedSpritePalette[paletteIndex] = metadataPacket.readUnsignedMedium((byte) -34);
            if (0 == qp.decodedSpritePalette[paletteIndex]) {
              qp.decodedSpritePalette[paletteIndex] = 1;
            }
          }
          if (obfuscationGuard) {
            field_d = (String) null;
          }
          metadataPacket.position = 0;
          for (spriteIndex = 0; spriteIndex < nl.decodedSpriteCount; spriteIndex++) {
            spriteWidth = jh.decodedSpriteWidths[spriteIndex];
            spriteHeight = gg.decodedSpriteHeights[spriteIndex];
            pixelCount = spriteWidth * spriteHeight;
            var20 = new byte[pixelCount];
            var18 = var20;
            indices = var18;
            cn.decodedSpriteIndices[spriteIndex] = var20;
            var21 = new byte[pixelCount];
            var19 = var21;
            alpha = var19;
            bj.decodedSpriteAlpha[spriteIndex] = var21;
            hasNonopaqueAlpha = 0;
            layoutFlags = metadataPacket.readUnsignedByte(255);
            if ((1 & layoutFlags) == 0) {
              for (var12 = 0; var12 < pixelCount; var12++) {
                indices[var12] = metadataPacket.readByte(true);
              }
              if ((2 & layoutFlags) != 0) {
                for (var12 = 0; var12 < pixelCount; var12++) {
                  stackIn_54_0 = alpha;
                  stackIn_54_1 = var12;
                  stackIn_54_2 = metadataPacket;
                  stackIn_55_3 = !(obfuscationGuard);
                  dupTemp$0 = ((PacketBuffer) (Object) stackIn_54_2).readByte(stackIn_55_3);
                  stackIn_54_0[stackIn_54_1] = dupTemp$0;
                  var13 = dupTemp$0;
                  stackIn_57_0 = hasNonopaqueAlpha;
                  if (var13 == -1) {
                    stackIn_58_1 = 0;
                  } else {
                    stackIn_58_1 = 1;
                  }
                  hasNonopaqueAlpha = stackIn_57_0 | stackIn_58_1;
                }
              }
            } else {
              for (var12 = 0; spriteWidth > var12; var12++) {
                for (var13 = 0; var13 < spriteHeight; var13++) {
                  stackIn_30_0 = indices;
                  stackIn_30_1 = var12 + var13 * spriteWidth;
                  stackIn_30_2 = metadataPacket;
                  stackIn_31_3 = !(obfuscationGuard);
                  stackIn_30_0[stackIn_30_1] = ((PacketBuffer) (Object) stackIn_30_2).readByte(stackIn_31_3);
                }
              }
              if ((2 & layoutFlags) != 0) {
                for (var12 = 0; var12 < spriteWidth; var12++) {
                  for (var13 = 0; spriteHeight > var13; var13++) {
                    stackIn_40_0 = alpha;
                    stackIn_40_1 = var12 + var13 * spriteWidth;
                    stackIn_40_2 = metadataPacket;
                    stackIn_41_3 = !(obfuscationGuard);
                    dupTemp$1 = ((PacketBuffer) (Object) stackIn_40_2).readByte(stackIn_41_3);
                    stackIn_40_0[stackIn_40_1] = dupTemp$1;
                    var14 = dupTemp$1;
                    stackIn_43_0 = hasNonopaqueAlpha;
                    if (-1 == var14) {
                      stackIn_44_1 = 0;
                    } else {
                      stackIn_44_1 = 1;
                    }
                    hasNonopaqueAlpha = stackIn_43_0 | stackIn_44_1;
                  }
                }
              }
            }
            tm.decodedSpriteHasAlpha[spriteIndex] = hasNonopaqueAlpha != 0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_63_0 = var2;
          stackIn_63_1 = new StringBuilder().append("eh.J(");
          if (data == null) {
            stackIn_64_2 = "null";
          } else {
            stackIn_64_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_63_0), ((StringBuilder) (Object) stackIn_63_1).append(stackIn_64_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final static void a(boolean param0, int param1) {
        BitPacketBuffer var2 = k.outgoingPackets;
        var2.writeCipheredOpcode(-13413, param1);
        if (!param0) {
          eh.a('￪', (byte) -120);
        }
        var2.writeByte(-101, 2);
        var2.writeByte(-103, 4);
        var2.writeByte(-109, qf.p(248));
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var7 = -9 % ((11 - param3) / 49);
        Rasterizer2D.drawLine(param1, param2, param5, param4, param0);
    }

    private final void a(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_l.measureText(param1);
          var6 = this.field_l.capHeight + this.field_l.descent;
          if (param0 != 8081) {
            return;
          }
          var7 = param3;
          if (Rasterizer2D.width < 6 + var7 + var5_int) {
            var7 = -6 + (Rasterizer2D.width - var5_int);
          }
          var8 = param2 - (this.field_l.capHeight - 32);
          if (6 + (var8 + var6) > Rasterizer2D.height) {
            var8 = -var6 + Rasterizer2D.height - 6;
          }
          Rasterizer2D.drawRectangle(var7, var8, var5_int + 6, var6 + 6, this.field_c);
          Rasterizer2D.fillRectangle(1 + var7, 1 + var8, var5_int + 4, var6 + 4, this.field_p);
          this.field_l.drawLeft(param1, var7 + 3, this.field_l.capHeight + var8 + 3, this.field_c, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("eh.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(boolean param0, int param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (this.field_s) {
            this.a(param3, 8947848, param1, param2);
          } else {
            this.a(8081, param3, param1, param2);
          }
          if (!param0) {
            this.field_j = -47;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("eh.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static boolean a(char param0, byte param1) {
        boolean stackIn_6_0 = false;
        if (param1 <= 27) {
          return true;
        }
        stackIn_6_0 = (param0 >= 48) && (param0 <= 57);
        return stackIn_6_0;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        int var8 = 115 / ((param5 + 18) / 63);
        Rasterizer2D.fillRectangleAlpha(param3, param0, param6, param4, param2, param1);
    }

    final static void a(boolean param0, boolean param1) {
        if (sq.field_c != null) {
          Rasterizer2D.darkenRectangle(Rasterizer2D.clipLeft, Rasterizer2D.clipTop, Rasterizer2D.clipRight - Rasterizer2D.clipLeft, Rasterizer2D.clipBottom - Rasterizer2D.clipTop);
          sq.field_c.a(true, param0);
        }
        if (!param1) {
          field_k = -26;
        }
    }

    final static java.awt.Frame a(int param0, PlatformServices param1, int param2, int param3, int param4, int param5) {
        int var8 = 0;
        Object stackIn_7_0 = null;
        Object stackIn_38_0 = null;
        java.awt.Frame stackIn_40_0 = null;
        RuntimeException stackIn_43_0 = null;
        StringBuilder stackIn_43_1 = null;
        String stackIn_44_2 = null;
        RuntimeException decompiledCaughtException = null;
        hg[] var6 = null;
        RuntimeException var6_ref = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var9 = 0;
        hg[] var10 = null;
        PlatformTask var11 = null;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (!param1.b(-122)) {
            return null;
          }
          if (0 == param4) {
            var10 = PowerUpWarning.a(true, param1);
            var6 = var10;
            if (var6 == null) {
              stackIn_7_0 = null;
              return (java.awt.Frame) (stackIn_7_0);
            }
            var7_int = 0;
            for (var8 = 0; var10.length > var8; var8++) {
              if (var10[var8].field_d == param5 &&
                var10[var8].field_c == param2 && ((param0 == 0 ||
                param0 == var10[var8].field_f) &&
                (var7_int == 0 ||
                !(var10[var8].field_h <= param4)))) {
                param4 = var10[var8].field_h;
                var7_int = 1;
              }
            }
            if (var7_int == 0) {
              return null;
            }
          }
          var11 = param1.a(param0, -35, param2, param4, param5);
          while (0 == var11.status) {
            wj.sleepMillis(-126, 10L);
          }
          var7 = (java.awt.Frame) (var11.result);
          if (param3 <= 80) {
            eh.a('4', (byte) 78);
          }
          if (var7 == null) {
            return null;
          }
          if (var11.status != 2) {
            stackIn_40_0 = var7;
            return stackIn_40_0;
          }
          sq.a(param1, -20954, var7);
          stackIn_38_0 = null;
          return (java.awt.Frame) (stackIn_38_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_43_0 = var6_ref;
          stackIn_43_1 = new StringBuilder().append("eh.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_44_2 = "null";
          } else {
            stackIn_44_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_43_0), ((StringBuilder) (Object) stackIn_43_1).append(stackIn_44_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    private final void a(String param0, int param1, int param2, int param3) {
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var11Lifetime1;
        int var13Lifetime1;
        int var13Lifetime2;
        var15 = BrickABrac.field_J ? 1 : 0;
        try {
          var5_int = this.field_h + this.field_f;
          var6 = this.field_a + this.field_g;
          var7 = this.field_m;
          if (param1 != 8947848) {
            field_d = (String) null;
          }
          if (var7 == -1) {
            var7 = this.field_l.ascent + this.field_l.descent;
          }
          var8 = Rasterizer2D.width >> 2;
          var9 = this.field_l.measureText(param0);
          var10 = this.field_l.descent + this.field_l.ascent;
          var11 = 1;
          if (var9 > var8 ||
            param0.indexOf("<br>") != -1) {
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var9 % var8 + var13) / var13) + var8;
            }
            if (null == an.field_j) {
              an.field_j = new String[16];
            }
            var11Lifetime1 = this.field_l.wrapText(param0, new int[]{var12}, an.field_j);
            var9 = 0;
            var10 = var10 + (-1 + var11Lifetime1) * var7;
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_l.measureText(an.field_j[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param3;
          if (var12 + var9 + var5_int > Rasterizer2D.width) {
            var12 = Rasterizer2D.width - var9 - var5_int;
          }
          var13Lifetime1 = -this.field_l.capHeight + (param2 + 32);
          if (var13Lifetime1 + var10 + var6 > Rasterizer2D.height) {
            var13Lifetime1 = -var6 - var10 + param2;
          }
          Rasterizer2D.drawRectangle(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_j);
          Rasterizer2D.fillRectangle(var12 + 1, 1 + var13Lifetime1, var5_int + (var9 - 2), var10 + (var6 - 2), this.field_p);
          this.field_l.a(param0, this.field_h + var12, var13Lifetime1 + this.field_g, var9, var10, this.field_c, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("eh.L(");
          if (param0 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw qb.addExceptionContext((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public eh() {
        this.field_s = true;
    }

    static {
        field_d = "Multiball: spilts your ball into eight other balls.";
    }
}
