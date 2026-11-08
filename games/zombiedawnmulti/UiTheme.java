/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiTheme {
    static boolean field_j;
    int field_p;
    WidgetPainter field_o;
    int field_e;
    int field_c;
    WidgetPainter field_k;
    static String field_r;
    int field_m;
    static String field_q;
    WidgetPainter field_a;
    int field_b;
    int field_d;
    WidgetPainter field_s;
    BitmapFont field_h;
    WidgetPainter field_n;
    static UiComponent field_i;
    private int field_f;
    int field_l;
    private boolean field_g;

    final static int a(byte param0) {
        int var1 = -15 % ((-16 - param0) / 38);
        return Waypoint.field_j;
    }

    public static void releaseStatics(int param0) {
        field_i = null;
        field_q = null;
        if (param0 != -1020346174) {
          field_i = (UiComponent) null;
          field_r = null;
          return;
        }
        field_r = null;
    }

    private final void drawSingleLineTooltip(int param0, String param1, int param2, int param3) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        try {
          var5_int = this.field_h.textWidth(param1);
          var6 = this.field_h.field_J + this.field_h.maxDescent;
          var7 = param2;
          if (var7 + var5_int + 6 > SoftwareRasterizer.width) {
            var7 = -var5_int + (SoftwareRasterizer.width - 6);
          }
          var8 = 32 + (-this.field_h.field_J + param3);
          if (!(var6 + var8 + param0 <= SoftwareRasterizer.height)) {
            var8 = -var6 + SoftwareRasterizer.height - 6;
          }
          SoftwareRasterizer.drawRect(var7, var8, 6 + var5_int, 6 + var6, this.field_f);
          SoftwareRasterizer.fillRect(1 + var7, 1 + var8, 4 + var5_int, var6 + 4, this.field_d);
          this.field_h.c(param1, 3 + var7, this.field_h.field_J + (3 + var8), this.field_f, -1);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sk.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6) {
        int var8 = -11 % ((param3 + 28) / 57);
        SoftwareRasterizer.fillRectAlpha(param0, param6, param2, param1, param4, param5);
    }

    final void initializePainters(int param0, BitmapFont param1) {
        TextWidgetPainter var18 = null;
        StatefulTextPainter var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var17 = null;
        ArgbSprite var19 = null;
        int var7_int = 0;
        StatefulTextPainter var6 = null;
        StatefulTextPainter var7 = null;
        bg discarded$0 = null;
        MarkerSliderPainter discarded$1 = null;
        StatefulTextPainter var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        StatefulTextPainter var11 = null;
        StatefulTextPainter var12 = null;
        Sprite var13 = null;
        StatefulTextPainter var14 = null;
        StatefulTextPainter var20 = null;
        int var15 = ZombieDawnMulti.field_E ? 1 : 0;
        StatefulTextPainter var14Lifetime1;
        StatefulTextPainter var14Lifetime2;
        try {
          var18 = new TextWidgetPainter(param1, 2, 2, 2236962, 1, 1, 1, param1.maxDescent + (param1.maxAscent + 2));
          this.field_s = (WidgetPainter) ((Object) var18);
          var18.field_q = 16777215;
          var4 = new StatefulTextPainter();
          var18.copyStyleTo(param0 - 125269882, var4);
          this.field_d = 5592405;
          this.field_h = param1;
          var4.field_i = 11711154;
          this.field_p = -1;
          this.field_b = 15658734;
          this.field_l = 3;
          this.field_f = 15658734;
          var4.field_h = 15658734;
          this.field_m = 3;
          this.field_c = 3;
          this.field_e = 3;
          var4.createStateLayer(0, (byte) -36).b(15658734, 0).setFrameSprites(vn.a(43, 7829367, 10066329, 8947848), 2147483647);
          var4.createStateLayer(1, (byte) -36).setFrameSprites(vn.a(62, 13421772, 10066329, 11184810), 2147483647);
          var4.createStateLayer(3, (byte) -36).setFrameSprites(vn.a(67, 10066329, 7829367, 8947848), 2147483647).a(1, 2147483647).setOffsetX(1, (byte) 47);
          var5 = new Sprite[9];
          var17 = new ArgbSprite(32, 32);
          var19 = var17;
          for (var7_int = 0; var19.pixels.length > var7_int; var7_int++) {
            var17.pixels[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var19);
          var4.createStateLayer(4, (byte) -36).a(true, 2521).setFrameSprites(var5, 2147483647);
          var4.createStateLayer(5, (byte) -36).setFrameSprites(u.a(21242, 0, 65793, 0, 0), 2147483647).a(true, 2521).b(-1, 0);
          this.field_n = (WidgetPainter) ((Object) var4);
          var6 = new StatefulTextPainter(var4, true);
          var6.field_d = 0;
          var7 = new StatefulTextPainter(var4, true);
          var7.field_d = 0;
          var7.setFrameSpritesForAllStates(nk.a(8947848, (byte) -98), false);
          var7.createStateLayer(1, (byte) -36).setFrameSprites(nk.a(11184810, (byte) 108), 2147483647).b(2236962, 0);
          this.field_k = (WidgetPainter) ((Object) new CheckboxPainter(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new bg(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new MarkerSliderPainter(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new StatefulTextPainter();
          var18.copyStyleTo(-3, var8);
          var8.createStateLayer(0, (byte) -36).setFrameSprites(vn.a(120, 10066329, 7829367, 15658734), 2147483647).b(1118481, 0).a((byte) 44, -1);
          var8.createStateLayer(4, (byte) -36).a(true, 2521).setFrameSprites(var5, 2147483647);
          this.field_o = (WidgetPainter) ((Object) var8);
          var9 = new Sprite[9];
          var10 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.pixels = new int[]{6710886, 7829367};
          var10[4].pixels = new int[]{6710886, 7829367};
          var11 = new StatefulTextPainter();
          var12 = new StatefulTextPainter();
          var11.setStateFrameSprites(var9, 0, false);
          if (param0 != 125269879) {
            String var16 = (String) null;
            this.a(21, (String) null, -114, (byte) -66);
          }
          var12.setStateFrameSprites(var10, 0, false);
          var13 = new Sprite(7, 4);
          var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new StatefulTextPainter(var4, true);
          var14.a(var13.copy(), (byte) -102);
          var13.rotateClockwise();
          var14Lifetime1 = new StatefulTextPainter(var4, true);
          var14Lifetime1.a(var13.copy(), (byte) 79);
          var13.rotateClockwise();
          var14Lifetime2 = new StatefulTextPainter(var4, true);
          var14Lifetime2.a(var13.copy(), (byte) -53);
          var13.rotateClockwise();
          var20 = new StatefulTextPainter(var4, true);
          var20.a(var13, (byte) -107);
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "sk.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        vj.field_t = param1;
        if (b.field_d != t.field_e) {
          var2 = b.field_d * b.field_d;
          var3 = -(t.field_e * t.field_e) + var2;
          param1 = param1 + var3 * (-param1 + ValidationMessageWidget.field_cb) / var2;
        }
        ImageProducerRasterBuffer.field_k.setBounds(120, param1, 640, ck.field_a, -3344);
        eo.a(nj.field_h, LevelFileCatalog.field_c, 0, -10, 5, 640, ValidationMessageWidget.field_cb - 24);
        if (!param0) {
          return;
        }
        UiTheme.a((byte) -33);
    }

    final void a(int param0, String param1, int param2, byte param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 != 95) {
            this.field_h = (BitmapFont) null;
          }
          if (!this.field_g) {
            this.drawSingleLineTooltip(6, param1, param0, param2);
            return;
          }
          this.drawWrappedTooltip(param2, 2, param1, param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("sk.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, byte param4, int param5) {
        if (param4 == 100) {
          SoftwareRasterizer.drawLine(param1, param2, param5, param0, param3);
          return;
        }
        this.field_c = 52;
        SoftwareRasterizer.drawLine(param1, param2, param5, param0, param3);
    }

    private final void drawWrappedTooltip(int param0, int param1, String param2, int param3) {
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
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
        var15 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var5_int = this.field_l + this.field_c;
          var6 = this.field_m + this.field_e;
          var7 = this.field_p;
          if (-1 == var7) {
            var7 = this.field_h.maxAscent + this.field_h.maxDescent;
          }
          if (param1 != 2) {
            return;
          }
          var8 = SoftwareRasterizer.width >> 2;
          var9 = this.field_h.textWidth(param2);
          var10 = this.field_h.maxDescent + this.field_h.maxAscent;
          var11 = 1;
          if (var9 > var8 ||
            -1 != param2.indexOf("<br>")) {
            if (vm.field_gb == null) {
              vm.field_gb = new String[16];
            }
            if (var9 <= var8) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = 2 * ((-1 + var13 + var9 % var8) / var13) + var8;
            }
            var11Lifetime1 = this.field_h.wrapText(param2, new int[]{var12}, vm.field_gb);
            var9 = 0;
            var10 = var10 + var7 * (-1 + var11Lifetime1);
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_h.textWidth(vm.field_gb[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param3;
          if (var9 + var12 + var5_int > SoftwareRasterizer.width) {
            var12 = SoftwareRasterizer.width - (var9 + var5_int);
          }
          var13Lifetime1 = -this.field_h.field_J + (param0 + 32);
          if (var13Lifetime1 - (-var10 - var6) > SoftwareRasterizer.height) {
            var13Lifetime1 = -var10 + param0 - var6;
          }
          SoftwareRasterizer.drawRect(var12, var13Lifetime1, var9 + var5_int, var6 + var10, this.field_b);
          SoftwareRasterizer.fillRect(1 + var12, var13Lifetime1 + 1, -2 + (var5_int + var9), var6 + var10 - 2, this.field_d);
          this.field_h.drawParagraph(param2, var12 + this.field_l, var13Lifetime1 + this.field_e, var9, var10, this.field_f, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("sk.I(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param3).append(')').toString());
        }
    }

    public UiTheme() {
        this.field_g = true;
    }

    static {
        field_r = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_q = "Powerups with this modifier will fool even enemy overlords.";
    }
}
