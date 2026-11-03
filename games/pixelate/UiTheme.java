/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class UiTheme {
    private boolean field_k;
    int field_p;
    int field_g;
    int field_o;
    WidgetPainter field_t;
    WidgetPainter field_s;
    int field_d;
    static String field_b;
    int field_q;
    static dj field_j;
    WidgetPainter field_r;
    WidgetPainter field_i;
    BitmapFont field_m;
    private int tooltipTextAndBorderColor;
    int tooltipBackgroundColor;
    WidgetPainter field_a;
    static Random field_f;
    static String field_l;
    static String field_h;
    int field_n;

    public static void a(boolean param0) {
        field_f = null;
        if (!param0) {
          return;
        }
        field_j = null;
        field_l = null;
        field_b = null;
        field_h = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, boolean param5) {
        if (!param5) {
          SoftwareRasterizer.b(param3, param0, param2, param1, param4);
          return;
        }
        String var8 = (String) null;
        this.drawSingleLineTooltip((String) null, 6, 30, -19);
        SoftwareRasterizer.b(param3, param0, param2, param1, param4);
    }

    static long a(long param0, long param1) {
        return param0 | param1;
    }

    final void drawTooltip(String param0, int param1, boolean param2, int param3) {
        RuntimeException var5 = null;
        String var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2) {
            var6 = (String) null;
            this.drawWrappedTooltip((String) null, -42, -69, (byte) -38);
          }
          if (this.field_k) {
            this.drawWrappedTooltip(param0, param3, param1, (byte) 127);
            return;
          }
          this.drawSingleLineTooltip(param0, param1, param3, 109);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("tg.J(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean a(String param0, long param1, int param2, int param3, int[] param4) {
        QuickChatMenu var6 = null;
        RuntimeException var6_ref = null;
        CharSequence var7 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!SpriteState.a(param1, param4, param0, param2, 500)) {
            return false;
          }
          if (param3 == ~param2) {
            param2 = 0;
          }
          ce.field_d = param2;
          CheckboxPainter.field_k = param0;
          var7 = (CharSequence) ((Object) param0);
          fp.field_d = dh.a(var7, (byte) 26);
          fp.field_e = param1;
          var6 = ThreeSliceButtonPainter.a(49, AccountMessagePanel.field_L, param4, ue.field_t, AccountNamePrompt.field_Ib);
          mh.a(var6, (byte) 127);
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6_ref = decompiledCaughtException;
          stackIn_10_0 = var6_ref;
          stackIn_10_1 = new StringBuilder().append("tg.E(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        SoftwareRasterizer.a(param2, param6, param4, param3, param1, param0);
        int var8 = -61 / ((-21 - param5) / 44);
    }

    private final void drawSingleLineTooltip(String param0, int param1, int param2, int param3) {
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
          var5_int = this.field_m.textWidth(param0);
          var6 = this.field_m.maxDescent + this.field_m.field_D;
          var7 = param2;
          if (param3 < 27) {
            this.tooltipBackgroundColor = 119;
          }
          if (var5_int + var7 + 6 > SoftwareRasterizer.field_j) {
            var7 = -var5_int + (SoftwareRasterizer.field_j - 6);
          }
          var8 = -this.field_m.field_D + (param1 + 32);
          if (6 + (var6 + var8) > SoftwareRasterizer.field_d) {
            var8 = -6 + (-var6 + SoftwareRasterizer.field_d);
          }
          SoftwareRasterizer.a(var7, var8, 6 + var5_int, 6 + var6, this.tooltipTextAndBorderColor);
          SoftwareRasterizer.d(1 + var7, 1 + var8, var5_int + 4, 4 + var6, this.tooltipBackgroundColor);
          this.field_m.drawText(param0, 3 + var7, this.field_m.field_D + (var8 + 3), this.tooltipTextAndBorderColor, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("tg.G(");
          if (param0 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final void drawWrappedTooltip(String param0, int param1, int param2, byte param3) {
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
        var15 = Pixelate.field_H ? 1 : 0;
        try {
          var5_int = this.field_p + this.field_n;
          var6 = this.field_g + this.field_o;
          var7 = this.field_q;
          if (var7 == -1) {
            var7 = this.field_m.maxAscent + this.field_m.maxDescent;
          }
          var8 = SoftwareRasterizer.field_j >> 2;
          var9 = this.field_m.textWidth(param0);
          var10 = this.field_m.maxAscent + this.field_m.maxDescent;
          var11 = 1;
          if (var8 < var9 ||
            param0.indexOf("<br>") != -1) {
            if (var9 > var8) {
              var13 = var9 / var8;
              var12 = var8 + (-1 + var13 + var9 % var8) / var13 * 2;
            } else {
              var12 = var8;
            }
            if (Js5Transport.field_j == null) {
              Js5Transport.field_j = new String[16];
            }
            var11Lifetime1 = this.field_m.wrapText(param0, new int[]{var12}, Js5Transport.field_j);
            var9 = 0;
            var10 = var10 + var7 * (var11Lifetime1 - 1);
            for (var13Lifetime2 = 0; var11Lifetime1 > var13Lifetime2; var13Lifetime2++) {
              var14 = this.field_m.textWidth(Js5Transport.field_j[var13Lifetime2]);
              if (var9 < var14) {
                var9 = var14;
              }
            }
          }
          var12 = param1;
          if (var5_int + (var9 + var12) > SoftwareRasterizer.field_j) {
            var12 = -var5_int + SoftwareRasterizer.field_j - var9;
          }
          var13Lifetime1 = 32 + param2 - this.field_m.field_D;
          if (var6 + var10 + var13Lifetime1 > SoftwareRasterizer.field_d) {
            var13Lifetime1 = param2 - var10 - var6;
          }
          if (param3 <= 123) {
            return;
          }
          SoftwareRasterizer.a(var12, var13Lifetime1, var9 + var5_int, var10 + var6, this.field_d);
          SoftwareRasterizer.d(var12 + 1, 1 + var13Lifetime1, var9 - (-var5_int + 2), -2 + (var10 + var6), this.tooltipBackgroundColor);
          this.field_m.drawParagraph(param0, var12 + this.field_n, var13Lifetime1 + this.field_o, var9, var10, this.tooltipTextAndBorderColor, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_32_0 = var5;
          stackIn_32_1 = new StringBuilder().append("tg.C(");
          if (param0 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, BitmapFont param1) {
        TextWidgetPainter var17 = null;
        StatefulTextPainter var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        StatefulTextPainter var6 = null;
        StatefulTextPainter var7 = null;
        DialWidgetPainter discarded$0 = null;
        MarkerSliderPainter discarded$1 = null;
        StatefulTextPainter var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        StatefulTextPainter var11 = null;
        StatefulTextPainter var12 = null;
        Sprite var13 = null;
        StatefulTextPainter var14 = null;
        StatefulTextPainter var19 = null;
        int var15 = Pixelate.field_H ? 1 : 0;
        StatefulTextPainter var14Lifetime1;
        StatefulTextPainter var14Lifetime2;
        try {
          var17 = new TextWidgetPainter(param1, 2, 2, 2236962, 1, 1, 1, param1.maxDescent + (param1.maxAscent + 2));
          var17.field_g = 16777215;
          this.field_a = (WidgetPainter) ((Object) var17);
          var4 = new StatefulTextPainter();
          var17.copyStyleTo(var4, (byte) 126);
          this.tooltipBackgroundColor = 5592405;
          this.field_p = 3;
          this.field_o = 3;
          var4.field_e = 15658734;
          var4.field_o = 11711154;
          this.field_d = 15658734;
          this.tooltipTextAndBorderColor = 15658734;
          this.field_q = -1;
          this.field_n = 3;
          this.field_m = param1;
          this.field_g = 3;
          var4.a(0, 7177).a(15658734, 15115).a(ClientException.a(8947848, 7829367, 10066329, 3), (byte) -65);
          var4.a(1, 7177).a(ClientException.a(11184810, 13421772, 10066329, param0 ^ 7), (byte) -65);
          var4.a(3, 7177).a(ClientException.a(8947848, 10066329, 7829367, 3), (byte) -65).a((byte) 124, 1).a(1, false);
          var5 = new Sprite[9];
          var16 = new ArgbSprite(32, 32);
          var18 = var16;
          for (var7_int = 0; var18.field_G.length > var7_int; var7_int++) {
            var16.field_G[var7_int] = 1077952576;
          }
          var5[4] = (Sprite) ((Object) var18);
          var4.a(4, 7177).a(true, true).a(var5, (byte) -65);
          var4.a(5, 7177).a(og.a(0, true, 65793, 0, 0), (byte) -65).a(true, true).a(-1, 15115);
          this.field_r = (WidgetPainter) ((Object) var4);
          var6 = new StatefulTextPainter(var4, true);
          var6.field_l = 0;
          var7 = new StatefulTextPainter(var4, true);
          var7.field_l = 0;
          var7.setContentSprite(0, SecondaryNodeDeque.a(8947848, (byte) -128));
          var7.a(1, 7177).a(SecondaryNodeDeque.a(11184810, (byte) -93), (byte) -65).a(2236962, 15115);
          this.field_t = (WidgetPainter) ((Object) new CheckboxPainter(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          discarded$0 = new DialWidgetPainter(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new MarkerSliderPainter(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new StatefulTextPainter();
          var17.copyStyleTo(var8, (byte) 126);
          var8.a(0, 7177).a(ClientException.a(15658734, 10066329, 7829367, 3), (byte) -65).a(1118481, 15115).a(-1, (byte) -68);
          var8.a(4, 7177).a(true, true).a(var5, (byte) -65);
          this.field_i = (WidgetPainter) ((Object) var8);
          var9 = new Sprite[9];
          var10 = new Sprite[9];
          var9[4] = new Sprite(2, 1);
          var10[4] = new Sprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_G = new int[]{6710886, 7829367};
          var10[param0].field_G = new int[]{6710886, 7829367};
          var11 = new StatefulTextPainter();
          var12 = new StatefulTextPainter();
          var11.a(122, 0, var9);
          var12.a(92, 0, var10);
          var13 = new Sprite(7, 4);
          var13.field_G = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new StatefulTextPainter(var4, true);
          var14.a(param0 + 107, var13.a());
          var13.b();
          var14Lifetime1 = new StatefulTextPainter(var4, true);
          var14Lifetime1.a(79, var13.a());
          var13.b();
          var14Lifetime2 = new StatefulTextPainter(var4, true);
          var14Lifetime2.a(-8, var13.a());
          var13.b();
          var19 = new StatefulTextPainter(var4, true);
          var19.a(param0 ^ -20, var13);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "tg.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static byte[] a(boolean param0, boolean param1, Object param2) {
        byte[] var3 = null;
        RuntimeException var3_ref = null;
        ByteStorage var4 = null;
        Object stackIn_4_0 = null;
        byte[] stackIn_9_0 = null;
        byte[] stackIn_11_0 = null;
        byte[] stackIn_15_0 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0) {
            field_h = (String) null;
          }
          if (param2 == null) {
            stackIn_4_0 = null;
            return (byte[]) (stackIn_4_0);
          }
          if (!(param2 instanceof byte[])) {
            if (!(param2 instanceof ByteStorage)) {
              throw new IllegalArgumentException();
            }
            var4 = (ByteStorage) (param2);
            stackIn_15_0 = var4.toByteArray(32);
            return stackIn_15_0;
          }
          var3 = (byte[]) (param2);
          if (!param1) {
            stackIn_11_0 = var3;
            return stackIn_11_0;
          }
          stackIn_9_0 = re.a(true, var3);
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_19_0 = var3_ref;
          stackIn_19_1 = new StringBuilder().append("tg.H(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(')').toString());
        }
    }

    public UiTheme() {
        this.field_k = true;
    }

    static {
        field_b = "Total Time: ";
        field_j = new dj();
        field_l = "<%0> must play <%1> more rated games before playing with the current options.";
        field_h = null;
    }
}
