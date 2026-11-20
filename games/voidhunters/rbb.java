/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rbb {
    int field_c;
    int field_h;
    int field_u;
    UiRenderer field_a;
    UiRenderer field_l;
    int field_r;
    int field_s;
    UiRenderer field_e;
    static ScrollableActionPanel field_k;
    private boolean field_f;
    int field_m;
    UiRenderer field_o;
    UiRenderer field_d;
    int field_j;
    private int field_t;
    int field_b;
    UiRenderer field_n;
    int field_i;
    int field_g;
    UiRenderer field_q;
    BitmapFont field_p;

    final void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        if (!param2) {
          this.a((byte) 18);
        }
        SoftwareRasterizer2D.fillRectangleAlpha(param5, param0, param3, param6, param4, param1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        if (param5 != 11480) {
          String var8 = (String) null;
          this.a(-20, -99, (String) null, 15);
        }
        SoftwareRasterizer2D.drawLine(param4, param1, param3, param2, param0);
    }

    private final void a(boolean param0, int param1, int param2, String param3) {
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_32_2 = null;
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
        var15 = VoidHunters.field_G;
        try {
          var5_int = this.field_j + this.field_h;
          var6 = this.field_u + this.field_c;
          var7 = this.field_g;
          if (-1 == var7) {
            var7 = this.field_p.maxAscent + this.field_p.maxDescent;
          }
          var8 = SoftwareRasterizer2D.width >> 2;
          if (!param0) {
            this.a(53, -30, true, -4, 116, 102, 70);
          }
          var9 = this.field_p.getStringWidth(param3);
          var10 = this.field_p.maxDescent + this.field_p.maxAscent;
          var11 = 1;
          if (var9 > var8 ||
            -1 != param3.indexOf("<br>")) {
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = (var13 + var9 % var8 - 1) / var13 * 2 + var8;
            }
            if (SetVariableActionFactory.field_d == null) {
              SetVariableActionFactory.field_d = new String[16];
            }
            var11Lifetime1 = this.field_p.wrapLines(param3, new int[]{var12}, SetVariableActionFactory.field_d);
            var10 = var10 + var7 * (-1 + var11Lifetime1);
            var9 = 0;
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_p.getStringWidth(SetVariableActionFactory.field_d[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param1;
          if (SoftwareRasterizer2D.width < var12 + var9 + var5_int) {
            var12 = -var5_int - var9 + SoftwareRasterizer2D.width;
          }
          var13Lifetime1 = -this.field_p.capHeight + param2 + 32;
          if (SoftwareRasterizer2D.height < var13Lifetime1 + var10 + var6) {
            var13Lifetime1 = -var10 + param2 - var6;
          }
          SoftwareRasterizer2D.drawRectangle(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.field_m);
          SoftwareRasterizer2D.fillRectangle(var12 + 1, 1 + var13Lifetime1, var9 - (-var5_int + 2), var10 + (var6 - 2), this.field_b);
          this.field_p.drawParagraph(param3, var12 + this.field_h, this.field_u + var13Lifetime1, var9, var10, this.field_t, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_31_0 = var5;
          stackIn_31_1 = new StringBuilder().append("rbb.I(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_32_2 = "null";
          } else {
            stackIn_32_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_31_0), ((StringBuilder) (Object) stackIn_31_1).append(stackIn_32_2).append(')').toString());
        }
    }

    public static void clearSharedReferences(byte param0) {
        if (param0 != -29) {
          return;
        }
        field_k = null;
    }

    final void a(byte param0) {
        bia.popRasterState((byte) 124);
        if (param0 < 82) {
          rbb.clearSharedReferences((byte) 6);
        }
    }

    final void a(byte param0, String param1, int param2, int param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param0 != 27) {
            this.field_s = -7;
          }
          if (this.field_f) {
            this.a(true, param2, param3, param1);
          } else {
            this.a(param3, 3, param1, param2);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("rbb.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void a(int param0, int param1, String param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_p.getStringWidth(param2);
          var6 = this.field_p.maxDescent + this.field_p.capHeight;
          var7 = param3;
          if (!(var5_int + var7 + 6 <= SoftwareRasterizer2D.width)) {
            var7 = -6 + (-var5_int + SoftwareRasterizer2D.width);
          }
          var8 = 32 - this.field_p.capHeight + param0;
          if (SoftwareRasterizer2D.height < 6 + var6 + var8) {
            var8 = SoftwareRasterizer2D.height - var6 - 6;
          }
          SoftwareRasterizer2D.drawRectangle(var7, var8, var5_int + 6, var6 + 6, this.field_t);
          SoftwareRasterizer2D.fillRectangle(1 + var7, 1 + var8, var5_int + 4, 4 + var6, this.field_b);
          this.field_p.draw(param2, var7 + 3, this.field_p.capHeight + param1 + var8, this.field_t, -1);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rbb.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final void a(int param0, byte param1, int param2, int param3, int param4) {
        if (param1 <= 103) {
          this.field_b = -4;
        }
        SelectableIconLabelWidget.pushClip(param2, param0, param4, true, param3);
    }

    final void a(BitmapFont param0, int param1) {
        UiTextStyle var17 = null;
        UiStatefulStyle var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        UiStatefulStyle var6 = null;
        UiStatefulStyle var7 = null;
        ei discarded$0 = null;
        jba discarded$1 = null;
        UiStatefulStyle var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        UiStatefulStyle var11 = null;
        UiStatefulStyle var12 = null;
        Sprite var13 = null;
        UiStatefulStyle var14 = null;
        UiStatefulStyle var19 = null;
        int var15 = VoidHunters.field_G;
        UiStatefulStyle var14Lifetime1;
        UiStatefulStyle var14Lifetime2;
        try {
          var17 = new UiTextStyle(param0, 2, 2, 2236962, 1, 1, 1, 2 + param0.maxDescent + param0.maxAscent);
          var17.textColor = 16777215;
          this.field_n = (UiRenderer) ((Object) var17);
          var4 = new UiStatefulStyle();
          var17.copyTo(param1 + 24639, var4);
          this.field_t = 15658734;
          this.field_b = 5592405;
          var4.caretColor = 15658734;
          this.field_p = param0;
          this.field_h = 3;
          this.field_m = 15658734;
          this.field_g = -1;
          var4.selectionColor = 11711154;
          this.field_j = 3;
          this.field_c = 3;
          this.field_u = 3;
          var4.createStateStyle(0, -1).setTextColor(15658734, -2147483648).setBackgroundSprites(true, LaunchFightersOrderDefinition.a(10066329, 8947848, 117, 7829367));
          if (param1 != -24763) {
            this.a(99, (byte) 19, 39, -32, 64);
          }
          var4.createStateStyle(1, -1).setBackgroundSprites(true, LaunchFightersOrderDefinition.a(10066329, 11184810, 118, 13421772));
          var4.createStateStyle(3, -1).setBackgroundSprites(true, LaunchFightersOrderDefinition.a(7829367, 8947848, 123, 10066329)).setOffsetX(113, 1).setOffsetY(1, false);
          var5 = new Sprite[9];
          var16 = new ArgbSprite(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
            var16.pixels[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var18);
          var4.createStateStyle(4, -1).setDrawPreviousLayer(-123, true).setBackgroundSprites(true, var5);
          var4.createStateStyle(5, -1).setBackgroundSprites(true, SetCountermeasureLauncherFireForce.a(0, (byte) 119, 0, 65793, 0)).setDrawPreviousLayer(param1 + 24638, true).setTextColor(-1, param1 - 2147458885);
          this.field_a = (UiRenderer) ((Object) var4);
          var6 = new UiStatefulStyle(var4, true);
          var6.horizontalAlignment = 0;
          var7 = new UiStatefulStyle(var4, true);
          var7.horizontalAlignment = 0;
          var7.setBackgroundSpritesForAllStates(GetBurstFireRegenerationRate.createCenterSpriteTile(true, 8947848), (byte) -54);
          var7.createStateStyle(1, -1).setBackgroundSprites(true, GetBurstFireRegenerationRate.createCenterSpriteTile(true, 11184810)).setTextColor(2236962, -2147483648);
          this.field_d = (UiRenderer) ((Object) new UiToggleButtonRenderer(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new ei(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new jba(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new UiStatefulStyle();
          var17.copyTo(-122, var8);
          var8.createStateStyle(0, -1).setBackgroundSprites(true, LaunchFightersOrderDefinition.a(7829367, 15658734, param1 + 24884, 10066329)).setTextColor(1118481, -2147483648).setTextShadowColor(-1, param1 - 2147458885);
          var8.createStateStyle(4, -1).setDrawPreviousLayer(param1 + 24635, true).setBackgroundSprites(true, var5);
          this.field_o = (UiRenderer) ((Object) var8);
          var9 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10 = new Sprite[9];
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          var11 = new UiStatefulStyle();
          var12 = new UiStatefulStyle();
          var11.setStateBackgroundSprites(0, var9, 15486);
          var12.setStateBackgroundSprites(0, var10, param1 ^ -23749);
          this.field_l = (UiRenderer) ((Object) var4);
          this.field_e = (UiRenderer) ((Object) var12);
          var13 = new Sprite(7, 4);
          this.field_s = 10;
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new UiStatefulStyle(var4, true);
          var14.setForegroundSpriteForAllStates(param1 ^ -7799, var13.copy());
          var13.rotateClockwise();
          var14Lifetime1 = new UiStatefulStyle(var4, true);
          var14Lifetime1.setForegroundSpriteForAllStates(32460, var13.copy());
          var13.rotateClockwise();
          var14Lifetime2 = new UiStatefulStyle(var4, true);
          var14Lifetime2.setForegroundSpriteForAllStates(32460, var13.copy());
          var13.rotateClockwise();
          var19 = new UiStatefulStyle(var4, true);
          var19.setForegroundSpriteForAllStates(32460, var13);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "rbb.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public rbb() {
        this.field_f = true;
    }

    static {
    }
}
