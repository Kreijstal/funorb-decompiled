/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UiTheme {
    private boolean field_o;
    static String[] field_p;
    static java.awt.Image field_j;
    int field_t;
    int field_w;
    int field_n;
    int field_g;
    static String field_m;
    static String field_s;
    static int field_q;
    static int field_l;
    int field_d;
    WidgetPainter field_c;
    int field_a;
    BitmapFont field_v;
    WidgetPainter field_x;
    WidgetPainter field_h;
    static String field_i;
    int field_b;
    WidgetPainter field_u;
    static PcmStreamMixer field_e;
    private int field_k;
    static NodeDeque field_r;
    WidgetPainter field_f;

    final void a(int param0, String param1, int param2, int param3) {
        RuntimeException var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!this.field_o) {
            this.a(param1, param0, (byte) -22, param2);
          } else {
            this.a((byte) 102, param2, param0, param1);
          }
          if (param3 == 15658734) {
            return;
          }
          this.field_k = -127;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("ll.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        SoftwareRaster.c(param2, param6, param0, param3, param5, param4);
        if (param1 != 5939) {
          field_i = (String) null;
        }
    }

    private final void a(byte param0, int param1, int param2, String param3) {
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
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
        var15 = SteelSentinels.obfuscationControl;
        try {
          var5_int = this.field_g + this.field_d;
          var6 = this.field_w + this.field_a;
          var7 = this.field_b;
          if (var7 == -1) {
            var7 = this.field_v.field_F + this.field_v.field_G;
          }
          var8 = SoftwareRaster.field_c >> 2;
          var9 = this.field_v.textWidth(param3);
          var10 = this.field_v.field_G + this.field_v.field_F;
          var11 = 1;
          if (var9 > var8 ||
            param3.indexOf("<br>") != -1) {
            if (t.field_b == null) {
              t.field_b = new String[16];
            }
            if (var9 > var8) {
              var13 = var9 / var8;
              var12 = (-1 + var13 + var9 % var8) / var13 * 2 + var8;
            } else {
              var12 = var8;
            }
            var11Lifetime1 = this.field_v.wrapText(param3, new int[]{var12}, t.field_b);
            var10 = var10 + (var11Lifetime1 - 1) * var7;
            var9 = 0;
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_v.textWidth(t.field_b[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param2;
          if (SoftwareRaster.field_c < var5_int + (var12 + var9)) {
            var12 = -var9 + (SoftwareRaster.field_c - var5_int);
          }
          var13Lifetime1 = 32 + (param1 - this.field_v.field_U);
          if (var10 + (var13Lifetime1 + var6) > SoftwareRaster.field_j) {
            var13Lifetime1 = -var6 - var10 + param1;
          }
          SoftwareRaster.drawRectangleOutline(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_t);
          SoftwareRaster.fillRectangle(1 + var12, var13Lifetime1 + 1, -2 + var5_int + var9, var10 + (var6 - 2), this.field_n);
          this.field_v.a(param3, this.field_g + var12, this.field_a + var13Lifetime1, var9, var10, this.field_k, -1, 0, 0, var7);
          if (param0 == 102) {
            return;
          }
          field_j = (java.awt.Image) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_30_0 = var5;
          stackIn_30_1 = new StringBuilder().append("ll.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(')').toString());
        }
    }

    private final void a(String param0, int param1, byte param2, int param3) {
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
          var5_int = this.field_v.textWidth(param0);
          var6 = this.field_v.field_U + this.field_v.field_F;
          var7 = param1;
          if (var7 + var5_int + 6 > SoftwareRaster.field_c) {
            var7 = -6 + (-var5_int + SoftwareRaster.field_c);
          }
          var8 = -this.field_v.field_U + param3 + 32;
          if (var8 + var6 + 6 > SoftwareRaster.field_j) {
            var8 = -var6 + SoftwareRaster.field_j - 6;
          }
          if (param2 != -22) {
            return;
          }
          SoftwareRaster.drawRectangleOutline(var7, var8, 6 + var5_int, 6 + var6, this.field_k);
          SoftwareRaster.fillRectangle(var7 + 1, var8 + 1, var5_int + 4, var6 + 4, this.field_n);
          this.field_v.drawLeft(param0, var7 + 3, this.field_v.field_U + var8 + 3, this.field_k, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("ll.F(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void initializePainters(int param0, BitmapFont param1) {
        int var7_int = 0;
        StatefulTextPainter var19 = null;
        int var15 = SteelSentinels.obfuscationControl;
        TextWidgetPainter var17 = new TextWidgetPainter(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.field_G + param1.field_F));
        this.field_h = (WidgetPainter) ((Object) var17);
        var17.field_k = 16777215;
        StatefulTextPainter var4 = new StatefulTextPainter();
        var17.a(var4, -3);
        this.field_v = param1;
        var4.field_e = 15658734;
        this.field_d = 3;
        this.field_w = 3;
        this.field_t = 15658734;
        this.field_n = 5592405;
        this.field_b = -1;
        this.field_k = 15658734;
        this.field_a = 3;
        this.field_g = 3;
        var4.field_c = 11711154;
        var4.a(-25088, 0).a((byte) -107, 15658734).a(1, TickClock.a(8947848, (byte) 112, 7829367, 10066329));
        var4.a(-25088, 1).a(1, TickClock.a(11184810, (byte) 123, 13421772, 10066329));
        var4.a(-25088, 3).a(1, TickClock.a(8947848, (byte) 116, 10066329, 7829367)).a(true, 1).setTextColor(1, 120);
        RgbSprite[] var5 = new RgbSprite[9];
        ArgbSprite var16 = new ArgbSprite(32, 32);
        ArgbSprite var18 = var16;
        for (var7_int = 0; var18.field_E.length > var7_int; var7_int++) {
          var16.field_E[var7_int] = 1077952576;
        }
        var5[4] = (RgbSprite) ((Object) var18);
        var4.a(-25088, 4).a(true, (byte) 125).a(1, var5);
        var4.a(-25088, 5).a(1, hf.a(0, 65793, 0, 0, true)).a(true, (byte) 126).a((byte) -118, -1);
        this.field_f = (WidgetPainter) ((Object) var4);
        StatefulTextPainter var6 = new StatefulTextPainter(var4, true);
        var6.field_a = 0;
        StatefulTextPainter var7 = new StatefulTextPainter(var4, true);
        var7.field_a = 0;
        var7.a(false, sl.a(8947848, 2));
        var7.a(-25088, 1).a(1, sl.a(11184810, 2)).a((byte) -120, 2236962);
        this.field_x = (WidgetPainter) ((Object) new CheckboxPainter(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
        DialWidgetPainter discarded$0 = new DialWidgetPainter(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
        MarkerSliderPainter discarded$1 = new MarkerSliderPainter(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
        StatefulTextPainter var8 = new StatefulTextPainter();
        var17.a(var8, -3);
        var8.a(-25088, 0).a(1, TickClock.a(15658734, (byte) 118, 10066329, 7829367)).a((byte) -96, 1118481).setShadowColor(1, -1);
        var8.a(-25088, 4).a(true, (byte) 125).a(1, var5);
        this.field_c = (WidgetPainter) ((Object) var8);
        RgbSprite[] var9 = new RgbSprite[9];
        RgbSprite[] var10 = new RgbSprite[9];
        var9[4] = new RgbSprite(2, 1);
        var10[4] = new RgbSprite(1, 2);
        RgbSprite dupTemp$2 = var9[4];
        dupTemp$2.field_E = new int[]{6710886, 7829367};
        var10[4].field_E = new int[]{6710886, 7829367};
        StatefulTextPainter var11 = new StatefulTextPainter();
        StatefulTextPainter var12 = new StatefulTextPainter();
        var11.a(var9, false, 0);
        var12.a(var10, false, 0);
        RgbSprite var13 = new RgbSprite(7, 4);
        var13.field_E = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
        StatefulTextPainter var14 = new StatefulTextPainter(var4, true);
        if (param0 <= 110) {
          return;
        }
        try {
          var14.a(var13.copySprite(), (byte) 88);
          var13.rotateCounterClockwise();
          var14 = new StatefulTextPainter(var4, true);
          var14.a(var13.copySprite(), (byte) 88);
          var13.rotateCounterClockwise();
          var14 = new StatefulTextPainter(var4, true);
          var14.a(var13.copySprite(), (byte) 88);
          var13.rotateCounterClockwise();
          var19 = new StatefulTextPainter(var4, true);
          var19.a(var13, (byte) 88);
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "ll.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 > 51) {
          field_e = null;
          field_j = null;
          field_m = null;
          field_s = null;
          field_r = null;
          field_p = null;
          return;
        }
    }

    final void a(int param0, int param1, int param2, byte param3, int param4, int param5) {
        SoftwareRaster.drawLine(param4, param0, param5, param1, param2);
        if (param3 > -53) {
          this.a(14, -110, -118, (byte) 18, -35, -121);
        }
    }

    public UiTheme() {
        this.field_o = true;
    }

    static {
        field_p = new String[]{"Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Increases your sentinel's energy capacity for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Gives your sentinel extra energy shielding for <col=ffffff>30 seconds</col>.", "Unleashes an EMP on all nearby sentinels.", "Gives you the ability to target your enemies.<br>Hold <col=ffffff>'ALT'</col> to target.<br>Power-up lasts for <col=ffffff>30 seconds</col>.", "Gives you missile defences for <col=ffffff>30 seconds</col>.", "Quickly disrupts any target lock on your sentinel. Lasts for <col=ffffff>30 seconds</col>.", "Gradually repairs your sentinel's damage.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's power generation for <col=ffffff>30 seconds</col>.", "Scans and tracks the movement of sentinels and projectiles for <col=ffffff>30 seconds</col>.", "Rockets and missiles reload faster for <col=ffffff>30 seconds</col>.", "Reduces the energy drain of plasma weapons for <col=ffffff>30 seconds</col>.", "Teleports you to a different point on the map.<br>Press <col=ffffff>'F2'</col> to fire.<br><col=ffffff>One use only</col>.", "Increases the power of laser weapons for <col=ffffff>30 seconds</col>.", "Recharges your shields when you take damage.<br>Lasts <col=ffffff>30 seconds</col>.", "Protects you from the energy-sapping effects of EMP.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's jumping ability.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's flight ability.<br>Lasts <col=ffffff>30 seconds</col>.", "Gives your sentinel the ability to be invisible when not engaged in combat.<br>Lasts <col=ffffff>30 seconds</col>.", "Increases your sentinel's ability to fire while on the ground.<br>Lasts <col=ffffff>30 seconds</col>.", "Reduces kinetic damage on your sentinel.<br>Lasts <col=ffffff>30 seconds</col>.", "Reduces explosive damage on your sentinel.<br>Lasts <col=ffffff>30 seconds</col>.", "<This should never be seen>", "Light missiles and rockets reload very fast for <col=ffffff>30 seconds</col>.", "Boosts your sentinel's health.", "Gives your sentinel unlimited energy for <col=ffffff>30 seconds</col>.", "Protects your sentinel from all damage for <col=ffffff>30 seconds</col>.", "Boosts the ground speed of your sentinel for <col=ffffff>30 seconds</col>.", "Gives your sentinel the benefits of reinforced, reactive, energised and EMP armour for <col=ffffff>30 seconds</col>.", "All weapons are four times more powerful for <col=ffffff>30 seconds</col>.", "All weapons have EMP effects for <col=ffffff>30 seconds</col>.", "Gives you the MGFN technology that increases your score over time.<br>Lasts until your sentinel is destroyed.", "Heavy rocket strike from above.", "Gives you an extra respawn."};
        field_q = 256;
        field_m = "MAX";
    }
}
