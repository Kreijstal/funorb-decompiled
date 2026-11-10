/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class WidgetTheme {
    WidgetPainter field_d;
    WidgetPainter field_b;
    WidgetPainter field_m;
    private boolean field_l;
    int field_r;
    int field_q;
    int field_f;
    int field_k;
    int field_e;
    int field_t;
    int field_p;
    WidgetPainter field_g;
    WidgetPainter field_a;
    Font field_c;
    WidgetPainter field_n;
    WidgetPainter field_s;
    private int field_j;
    int field_h;
    int field_o;
    int field_i;

    final void pushClipRect(int param0, int param1, byte param2, int param3, int param4) {
        Mover.intersectClipIntArgs(param3, 99, param1, param4, param0);
        if (param2 > -60) {
          this.field_k = 55;
        }
    }

    final void drawLine(int param0, int param1, byte param2, int param3, int param4, int param5) {
        Rasterizer.drawLine(param3, param4, param5, param0, param1);
        if (param2 != -14) {
          this.field_f = 122;
        }
    }

    final static InputValidationResult validateEmailDomain(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        InputValidationResult var7 = null;
        int var8 = 0;
        InputValidationResult stackIn_3_0 = null;
        InputValidationResult stackIn_6_0 = null;
        InputValidationResult stackIn_9_0 = null;
        InputValidationResult stackIn_13_0 = null;
        InputValidationResult stackIn_18_0 = null;
        InputValidationResult stackIn_21_0 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = ZombieDawn.field_J;
        try {
          if (param1 != 8947848) {
            stackIn_3_0 = (InputValidationResult) null;
            return stackIn_3_0;
          }
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_6_0 = DelayedPacket.field_l;
            return stackIn_6_0;
          }
          if (var2_int > 255) {
            stackIn_9_0 = InstructionsScreen.field_m;
            return stackIn_9_0;
          }
          var3 = PacketBuffer.split('.', param0, -124);
          if (2 > var3.length) {
            stackIn_13_0 = DelayedPacket.field_l;
            return stackIn_13_0;
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var4.length <= var5) {
              stackIn_21_0 = RasterCanvasSizeTarget.validateDigitsOnly(var3[-1 + var3.length], false);
              return stackIn_21_0;
            }
            var6 = var4[var5];
            var7 = GameKeyHandler.validateDomainLabel(-126, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_18_0 = var7;
          return stackIn_18_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_24_0 = var2;
          stackIn_24_1 = new StringBuilder().append("of.G(");
          if (param0 == null) {
            stackIn_25_2 = "null";
          } else {
            stackIn_25_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_24_0), ((StringBuilder) (Object) stackIn_24_1).append(stackIn_25_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void drawScreenFrame(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var2Lifetime1;
        int var3Lifetime1;
        var4 = ZombieDawn.field_J;
        try {
          if (IntrusiveDeque.field_a != null &&
            IntrusiveDeque.field_a[0] != null) {
            var1_int = IntrusiveDeque.field_a[0].field_w;
            IntrusiveDeque.field_a[0].drawWithOffsets(0, 0);
            IntrusiveDeque.field_a[1].drawWithOffsets(-var1_int + WhirlpoolHasher.field_e, 0);
            IntrusiveDeque.field_a[2].drawWithOffsets(0, DropdownList.field_P - var1_int);
            IntrusiveDeque.field_a[3].drawWithOffsets(-var1_int + WhirlpoolHasher.field_e, -var1_int + DropdownList.field_P);
            Mover.intersectClipIntArgs(0, 99, -var1_int + WhirlpoolHasher.field_e, DropdownList.field_P, var1_int);
            if (param0 != 11690) {
              return;
            }
            var3 = DropdownList.field_P - var1_int;
            for (var2 = var1_int; var2 < Rasterizer.clipRight; var2 = var2 + ByteArrayPool.field_a.field_w) {
              ByteArrayPool.field_a.drawWithOffsets(var2, 0);
              ByteArrayPool.field_a.drawVerticalFlip(var2, var3);
            }
            Rasterizer.setClip(0, var1_int, WhirlpoolHasher.field_e, DropdownList.field_P - var1_int);
            var2Lifetime1 = -var1_int + WhirlpoolHasher.field_e;
            for (var3Lifetime1 = var1_int; Rasterizer.clipBottom > var3Lifetime1; var3Lifetime1 = var3Lifetime1 + GameWorld.field_x.field_t) {
              GameWorld.field_x.drawWithOffsets(0, var3Lifetime1);
              GameWorld.field_x.drawMirrored(var2Lifetime1, var3Lifetime1);
            }
            SingleChildWidget.popRasterState(-21189);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ExceptionWrapper.wrapException((Throwable) ((Object) var1), "of.F(" + param0 + ')');
        }
    }

    final void drawTooltip(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 >= -100) {
            return;
          }
          if (this.field_l) {
            this.drawWrappedTooltip(param1, param2, param0, 0);
          } else {
            this.drawSingleLineTooltip(param2, param1, param0, (byte) 53);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("of.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param3).append(')').toString());
        }
    }

    private final void drawSingleLineTooltip(String param0, int param1, int param2, byte param3) {
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
          var5_int = this.field_c.textWidth(param0);
          var6 = this.field_c.field_x + this.field_c.field_w;
          if (param3 != 53) {
            this.pushClipRect(60, -58, (byte) 14, 69, -115);
          }
          var7 = param1;
          if (Rasterizer.width < 6 + (var5_int + var7)) {
            var7 = -6 + (-var5_int + Rasterizer.width);
          }
          var8 = param2 - (this.field_c.field_w - 32);
          if (Rasterizer.height < var8 + var6 + 6) {
            var8 = -6 + (-var6 + Rasterizer.height);
          }
          Rasterizer.drawRectOutline(var7, var8, 6 + var5_int, 6 + var6, this.field_j);
          Rasterizer.fillRect(var7 + 1, var8 + 1, var5_int + 4, var6 + 4, this.field_k);
          this.field_c.drawString(param0, var7 + 3, this.field_c.field_w + 3 + var8, this.field_j, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("of.J(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void installDefaultPainters(int param0, Font param1) {
        TextWidgetPainter var17 = null;
        StatefulWidgetRenderer var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        StatefulWidgetRenderer var6 = null;
        StatefulWidgetRenderer var7 = null;
        DialWidgetPainter discarded$0 = null;
        MarkerSliderPainter discarded$1 = null;
        StatefulWidgetRenderer var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        StatefulWidgetRenderer var11 = null;
        StatefulWidgetRenderer var12 = null;
        Sprite var13 = null;
        StatefulWidgetRenderer var14 = null;
        StatefulWidgetRenderer var19 = null;
        int var15 = ZombieDawn.field_J;
        StatefulWidgetRenderer var14Lifetime1;
        StatefulWidgetRenderer var14Lifetime2;
        try {
          var17 = new TextWidgetPainter(param1, 2, 2, 2236962, 1, 1, 1, 2 + param1.field_I + param1.field_x);
          this.field_n = (WidgetPainter) ((Object) var17);
          var17.field_l = 16777215;
          var4 = new StatefulWidgetRenderer();
          var17.copyStyleTo(var4, (byte) 106);
          this.field_h = 3;
          this.field_q = 3;
          var4.field_j = 11711154;
          var4.field_a = 15658734;
          this.field_k = 5592405;
          this.field_c = param1;
          this.field_r = 3;
          this.field_e = 3;
          this.field_i = 15658734;
          this.field_j = 15658734;
          this.field_t = -1;
          var4.createStateStyle((byte) 73, 0).setTextColor((byte) -21, 15658734).setFrameSprites(EditableTextWidget.createSolidFrameSprites(10066329, 8947848, -2967, 7829367), param0 ^ 37);
          var4.createStateStyle((byte) 73, 1).setFrameSprites(EditableTextWidget.createSolidFrameSprites(10066329, 11184810, -2967, 13421772), 33);
          var4.createStateStyle((byte) 73, 3).setFrameSprites(EditableTextWidget.createSolidFrameSprites(7829367, 8947848, param0 - 2971, 10066329), param0 ^ 37).setOffsetX((byte) 126, 1).setOffsetY(1, (byte) 57);
          var5 = new Sprite[9];
          var16 = new ArgbSprite(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.field_z.length > var7_int; var7_int++) {
            var16.field_z[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var18);
          var4.createStateStyle((byte) 73, 4).setFlushBeforeOverlay(true, (byte) 74).setFrameSprites(var5, 33);
          var4.createStateStyle((byte) 73, 5).setFrameSprites(NanoTickClock.createSimpleBevelFrameSprites(0, (byte) -36, 0, 0, 65793), 33).setFlushBeforeOverlay(true, (byte) -113).setTextColor((byte) -21, -1);
          this.field_a = (WidgetPainter) ((Object) var4);
          var6 = new StatefulWidgetRenderer(var4, true);
          var6.field_h = 0;
          var7 = new StatefulWidgetRenderer(var4, true);
          var7.field_h = 0;
          var7.setFrameSpritesForAllStates(69, HuffmanCodec.createSolidNineSliceSprites((byte) -75, 8947848));
          var7.createStateStyle((byte) 73, 1).setFrameSprites(HuffmanCodec.createSolidNineSliceSprites((byte) -107, 11184810), param0 ^ 37).setTextColor((byte) -21, 2236962);
          this.field_g = (WidgetPainter) ((Object) new CheckboxPainter(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new DialWidgetPainter(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new MarkerSliderPainter(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new StatefulWidgetRenderer();
          var17.copyStyleTo(var8, (byte) -57);
          var8.createStateStyle((byte) 73, 0).setFrameSprites(EditableTextWidget.createSolidFrameSprites(7829367, 15658734, param0 ^ -2963, 10066329), param0 + 29).setTextColor((byte) -21, 1118481).setTextShadowColor(-1, param0 ^ -107);
          var8.createStateStyle((byte) 73, param0).setFlushBeforeOverlay(true, (byte) 72).setFrameSprites(var5, param0 + 29);
          this.field_b = (WidgetPainter) ((Object) var8);
          var9 = new Sprite[9];
          var10 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_z = new int[]{6710886, 7829367};
          var10[4].field_z = new int[]{6710886, 7829367};
          var11 = new StatefulWidgetRenderer();
          var12 = new StatefulWidgetRenderer();
          var11.setStateFrameSprites(1, var9, 0);
          var12.setStateFrameSprites(1, var10, 0);
          this.field_m = (WidgetPainter) ((Object) var4);
          this.field_s = (WidgetPainter) ((Object) var12);
          var13 = new Sprite(7, 4);
          var13.field_z = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          this.field_p = 10;
          var14 = new StatefulWidgetRenderer(var4, true);
          var14.setIconForAllStates(var13.copySprite(), 0);
          var13.rotateCounterClockwise();
          var14Lifetime1 = new StatefulWidgetRenderer(var4, true);
          var14Lifetime1.setIconForAllStates(var13.copySprite(), param0 - 4);
          var13.rotateCounterClockwise();
          var14Lifetime2 = new StatefulWidgetRenderer(var4, true);
          var14Lifetime2.setIconForAllStates(var13.copySprite(), 0);
          var13.rotateCounterClockwise();
          var19 = new StatefulWidgetRenderer(var4, true);
          var19.setIconForAllStates(var13, 0);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "of.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void popClipRect(int param0) {
        if (param0 != 3) {
          return;
        }
        SingleChildWidget.popRasterState(-21189);
    }

    private final void drawWrappedTooltip(int param0, String param1, int param2, int param3) {
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
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
        var15 = ZombieDawn.field_J;
        try {
          var5_int = this.field_e + this.field_r;
          var6 = this.field_q + this.field_h;
          var7 = this.field_t;
          if (var7 == -1) {
            var7 = this.field_c.field_I + this.field_c.field_x;
          }
          var8 = Rasterizer.width >> 2;
          var9 = this.field_c.textWidth(param1);
          var10 = this.field_c.field_I + this.field_c.field_x;
          var11 = 1;
          if (var9 > var8 ||
            -1 != param1.indexOf("<br>")) {
            if (AgeValidator.field_j == null) {
              AgeValidator.field_j = new String[16];
            }
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((var9 % var8 + var13 - 1) / var13) + var8;
            }
            var11Lifetime1 = this.field_c.wrapText(param1, new int[]{var12}, AgeValidator.field_j);
            var9 = 0;
            var10 = var10 + var7 * (-1 + var11Lifetime1);
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_c.textWidth(AgeValidator.field_j[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param0;
          if (var5_int + (var9 + var12) > Rasterizer.width) {
            var12 = -var9 + Rasterizer.width - var5_int;
          }
          var13Lifetime1 = -this.field_c.field_w + (param2 + 32);
          if (Rasterizer.height < var13Lifetime1 - (-var10 - var6)) {
            var13Lifetime1 = -var6 - var10 + param2;
          }
          Rasterizer.drawRectOutline(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_i);
          Rasterizer.fillRect(var12 + 1, var13Lifetime1 + 1, -2 + var9 + var5_int, var10 + var6 - 2, this.field_k);
          this.field_c.drawParagraph(param1, var12 + this.field_r, this.field_q + var13Lifetime1, var9, var10, this.field_j, -1, 0, param3, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("of.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ExceptionWrapper.wrapException((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void fillRectangleAlpha(int param0, int param1, int param2, int param3, int param4, byte param5, int param6) {
        Rasterizer.fillRectangleBlended(param3, param0, param2, param1, param6, param4);
        if (param5 > -88) {
          String var9 = (String) null;
          WidgetTheme.validateEmailDomain((String) null, -19);
        }
    }

    public WidgetTheme() {
        this.field_l = true;
    }

    static {
    }
}
