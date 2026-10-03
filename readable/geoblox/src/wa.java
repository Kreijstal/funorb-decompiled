/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    private boolean field_o;
    int field_f;
    BitmapFont field_m;
    dh field_j;
    int field_h;
    int field_p;
    dh field_g;
    static int avatarShockEffectTicks;
    dh field_c;
    dh field_l;
    int field_d;
    private int field_k;
    dh field_b;
    int field_e;
    int field_i;
    int field_n;

    private final void a(byte param0, int param1, String param2, int param3) {
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        String var9 = null;
        try {
          var5_int = this.field_m.measureTextWidth(param2);
          var6 = this.field_m.maxDescent + this.field_m.capitalXAscent;
          var7 = param1;
          if (SoftwareRasterizer.stride < 6 + var7 + var5_int) {
            var7 = -6 + SoftwareRasterizer.stride - var5_int;
          }
          var8 = -this.field_m.capitalXAscent + (param3 + 32);
          if (SoftwareRasterizer.framebufferHeight < 6 + (var8 + var6)) {
            var8 = SoftwareRasterizer.framebufferHeight - var6 - 6;
          }
          SoftwareRasterizer.drawRectangle(var7, var8, 6 + var5_int, var6 + 6, this.field_k);
          if (param0 != 69) {
            var9 = (String) null;
            this.a(-83, false, 61, (String) null);
          }
          SoftwareRasterizer.fillRectangle(1 + var7, var8 + 1, var5_int + 4, 4 + var6, this.field_f);
          this.field_m.drawText(param2, 3 + var7, this.field_m.capitalXAscent + 3 + var8, this.field_k, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_12_0 = (RuntimeException) (var5);
          stackIn_12_1 = new StringBuilder().append("wa.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, BitmapFont param1) {
        ff var17 = null;
        rd var4 = null;
        Sprite[] var5 = null;
        ArgbSprite var16 = null;
        ArgbSprite var18 = null;
        int var7_int = 0;
        rd var6 = null;
        rd var7 = null;
        hb discarded$0 = null;
        jf discarded$1 = null;
        rd var8 = null;
        Sprite[] var9 = null;
        Sprite[] var10 = null;
        Sprite dupTemp$2 = null;
        rd var11 = null;
        rd var12 = null;
        Sprite var13 = null;
        rd var14 = null;
        rd var19 = null;
        int var15 = Geoblox.clientControlFlowFlag;
        try {
            var17 = new ff(param1, 2, 2, 2236962, 1, 1, 1, 2 + (param1.maxAscent + param1.maxDescent));
            this.field_b = (dh) ((Object) var17);
            var17.field_o = 16777215;
            var4 = new rd();
            var17.a(var4, true);
            this.field_n = 15658734;
            var4.field_h = 11711154;
            var4.field_c = 15658734;
            this.field_f = 5592405;
            this.field_e = 3;
            this.field_p = 3;
            this.field_k = 15658734;
            this.field_h = -1;
            this.field_d = 3;
            this.field_i = 3;
            this.field_m = param1;
            var4.a(param0 - 126, 0).b(256, 15658734).a(wa.a(10066329, 8947848, 7829367, 1), true);
            var4.a(-106, 1).a(wa.a(10066329, 11184810, 13421772, 1), true);
            var4.a(param0 ^ -100, 3).a(wa.a(7829367, 8947848, 10066329, param0 - 8), true).b((byte) -53, 1).a(param0 - 9, 1);
            var5 = new Sprite[9];
            var16 = new ArgbSprite(32, 32);
            var18 = var16;
            for (var7_int = 0; var18.pixels.length > var7_int; var7_int++) {
                var16.pixels[var7_int] = 1077952576;
            }
            var5[4] = (Sprite) ((Object) var18);
            var4.a(-127, 4).a(true, (byte) 73).a(var5, true);
            var4.a(-101, 5).a(IntrusiveDeque.buildUnitBorderNineSliceSprites(0, 0, 116, 0, 65793), true).a(true, (byte) 73).b(256, -1);
            this.field_j = (dh) ((Object) var4);
            var6 = new rd(var4, true);
            var6.field_g = 0;
            var7 = new rd(var4, true);
            var7.field_g = 0;
            var7.a((byte) 124, va.a(8947848, (byte) -112));
            var7.a(-116, 1).a(va.a(11184810, (byte) -112), true).b(256, 2236962);
            this.field_c = (dh) ((Object) new bi(param1, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
            discarded$0 = new hb(param1, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
            discarded$1 = new jf(param1, 16777215, -1, 125269879, 4473924, 3, 268435455);
            var8 = new rd();
            var17.a(var8, true);
            var8.a(-124, 0).a(wa.a(7829367, 15658734, 10066329, 1), true).b(256, 1118481).a((byte) 16, -1);
            var8.a(-105, 4).a(true, (byte) 73).a(var5, true);
            this.field_g = (dh) ((Object) var8);
            var9 = new Sprite[param0];
            var10 = new Sprite[9];
            var9[4] = new Sprite(2, 1);
            var10[4] = new Sprite(1, 2);
            dupTemp$2 = var9[4];
            dupTemp$2.pixels = new int[]{6710886, 7829367};
            var10[4].pixels = new int[]{6710886, 7829367};
            var11 = new rd();
            var12 = new rd();
            var11.a(var9, 0, (byte) 57);
            var12.a(var10, 0, (byte) 108);
            var13 = new Sprite(7, 4);
            var13.pixels = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
            var14 = new rd(var4, true);
            var14.a(0, var13.copy());
            var13.rotateClockwise();
            var14 = new rd(var4, true);
            var14.a(param0 ^ 9, var13.copy());
            var13.rotateClockwise();
            var14 = new rd(var4, true);
            var14.a(0, var13.copy());
            var13.rotateClockwise();
            var19 = new rd(var4, true);
            var19.a(param0 ^ 9, var13);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "wa.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private final void a(int param0, String param1, int param2, int param3) {
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
        var15 = Geoblox.clientControlFlowFlag;
        try {
          var5_int = this.field_e + this.field_d;
          var6 = this.field_p + this.field_i;
          var7 = this.field_h;
          if (param3 != -3140) {
            return;
          }
          if (-1 == var7) {
            var7 = this.field_m.maxDescent + this.field_m.maxAscent;
          }
          var8 = SoftwareRasterizer.stride >> 2;
          var9 = this.field_m.measureTextWidth(param1);
          var10 = this.field_m.maxDescent + this.field_m.maxAscent;
          var11 = 1;
          if (!((var8 >= var9) &&
              (-1 == param1.indexOf("<br>")))) {
            if (dd.field_E == null) {
              dd.field_E = new String[16];
            }
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = (var9 % var8 + var13 - 1) / var13 * 2 + var8;
            }
            var11 = this.field_m.wrapText(param1, new int[]{var12}, dd.field_E);
            var9 = 0;
            var10 = var10 + (var11 - 1) * var7;
            for (var13 = 0; var13 < var11; var13++) {
              var14 = this.field_m.measureTextWidth(dd.field_E[var13]);
              if (var14 <= var9) {
                continue;
              }
              var9 = var14;
            }
          }
          var12 = param2;
          if (var5_int + var9 + var12 > SoftwareRasterizer.stride) {
            var12 = -var5_int + (SoftwareRasterizer.stride - var9);
          }
          var13 = 32 + (-this.field_m.capitalXAscent + param0);
          if (SoftwareRasterizer.framebufferHeight < var10 + (var13 + var6)) {
            var13 = param0 - var10 - var6;
          }
          SoftwareRasterizer.drawRectangle(var12, var13, var5_int + var9, var10 + var6, this.field_n);
          SoftwareRasterizer.fillRectangle(1 + var12, 1 + var13, var9 + (var5_int - 2), -2 + (var10 + var6), this.field_f);
          this.field_m.drawParagraph(param1, this.field_d + var12, this.field_i + var13, var9, var10, this.field_k, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = (RuntimeException) (var5);
          stackIn_28_1 = new StringBuilder().append("wa.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, boolean param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!this.field_o) {
            this.a((byte) 69, param2, param3, param0);
          } else {
            this.a(param0, param3, param2, -3140);
          }
          if (!param1) {
            this.field_c = (dh) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var5);
          stackIn_8_1 = new StringBuilder().append("wa.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    private final static Sprite[] a(int param0, int param1, int param2, int param3) {
        if (param3 != 1) {
            wa.a(-34, 65, 52, 47);
        }
        return dj.a(param0, (byte) -70, param2, param1, 1);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param4 != 15658734) {
            return;
        }
        SoftwareRasterizer.fillRectangleAlpha(param6, param0, param2, param1, param5, param3);
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.drawLine(param4, param3, param1, param0, param2);
        if (param5 != 8947848) {
            this.field_p = 22;
        }
    }

    public wa() {
        this.field_o = true;
    }

    final static int collectUnfinishedPopupPoints(int param0) {
        int unfinishedPoints = 0;
        RuntimeException var1 = null;
        ScorePopup popup = null;
        int var3 = 0;
        int stackIn_7_0 = 0;
        RuntimeException decompiledCaughtException = null;
        var3 = Geoblox.clientControlFlowFlag;
        try {
          unfinishedPoints = 0;
          if (param0 != -25866) {
            wa.a(53, -56, 122, 126);
          }
          popup = (ScorePopup) ((Object) md.activeScorePopups.removeFirst((byte) -121));
          while (popup != null) {
            unfinishedPoints = unfinishedPoints + popup.points;
            popup = (ScorePopup) ((Object) md.activeScorePopups.removeFirst((byte) -99));
          }
          stackIn_7_0 = unfinishedPoints;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) var1), "wa.H(" + param0 + ')');
        }
    }

    static {
        avatarShockEffectTicks = 0;
    }
}
