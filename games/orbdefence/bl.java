/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bl {
    static RgbSprite field_n;
    WidgetRenderer field_e;
    int field_k;
    WidgetRenderer field_c;
    private boolean field_b;
    BitmapFont field_j;
    int field_i;
    int field_d;
    int field_o;
    static int field_p;
    int field_a;
    static volatile int field_g;
    private int field_m;
    WidgetRenderer field_f;
    int field_h;
    int field_r;
    WidgetRenderer field_l;
    WidgetRenderer field_q;

    final void a(BitmapFont param0, int param1) {
        DefaultTextWidgetRenderer var18 = null;
        sj var4 = null;
        RgbSprite[] var5 = null;
        ArgbSprite var17 = null;
        ArgbSprite var19 = null;
        int var7_int = 0;
        sj var6 = null;
        sj var7 = null;
        ab discarded$0 = null;
        ck discarded$1 = null;
        sj var8 = null;
        RgbSprite[] var9 = null;
        RgbSprite[] var10 = null;
        RgbSprite dupTemp$2 = null;
        sj var11 = null;
        sj var12 = null;
        RgbSprite var13 = null;
        sj var14 = null;
        sj var20 = null;
        int var15 = OrbDefence.field_D ? 1 : 0;
        sj var14Lifetime1;
        sj var14Lifetime2;
        try {
          var18 = new DefaultTextWidgetRenderer(param0, 2, 2, 2236962, 1, 1, 1, param0.field_B + param0.field_H + 2);
          var18.field_s = 16777215;
          this.field_f = (WidgetRenderer) ((Object) var18);
          var4 = new sj();
          var18.copyStyleTo((byte) 81, var4);
          this.field_h = 3;
          this.field_i = -1;
          this.field_a = 3;
          this.field_r = 15658734;
          var4.field_m = 15658734;
          this.field_o = 3;
          this.field_m = 15658734;
          this.field_k = 5592405;
          this.field_d = 3;
          var4.field_d = 11711154;
          this.field_j = param0;
          var4.a(0, true).a((byte) 123, 15658734).a(vf.a(7829367, 10066329, 8947848, (byte) -106), 0);
          var4.a(1, true).a(vf.a(13421772, 10066329, 11184810, (byte) -118), 0);
          var4.a(3, true).a(vf.a(10066329, 7829367, 8947848, (byte) -90), 0).a(1, 0).b(1, 2);
          var5 = new RgbSprite[9];
          var17 = new ArgbSprite(32, 32);
          var19 = var17;
          for (var7_int = 0; var7_int < var19.field_v.length; var7_int++) {
            var17.field_v[var7_int] = 1077952576;
          }
          var5[4] = (RgbSprite) ((Object) var19);
          var4.a(4, true).a(true, (byte) -57).a(var5, 0);
          var4.a(5, true).a(ByteArrayPoolSupport.a(false, 0, 0, 0, 65793), 0).a(true, (byte) -57).a((byte) 114, -1);
          this.field_l = (WidgetRenderer) ((Object) var4);
          var6 = new sj(var4, true);
          var6.field_h = 0;
          var7 = new sj(var4, true);
          var7.field_h = 0;
          var7.a(124, bg.a(-84, 8947848));
          var7.a(1, true).a(bg.a(-126, 11184810), 0).a((byte) 113, 2236962);
          this.field_e = (WidgetRenderer) ((Object) new ci(param0, 2, 2, 16777215, -1, 5, 5, 15, 15, 4473924));
          if (param1 != -2699) {
            String var16 = (String) null;
            this.a(-85, (byte) 81, -88, (String) null);
          }
          discarded$0 = new ab(param0, 2, 2, 16777215, -1, 16777215, 16729156, 4473924);
          discarded$1 = new ck(param0, 16777215, -1, 125269879, 4473924, 3, 268435455);
          var8 = new sj();
          var18.copyStyleTo((byte) 81, var8);
          var8.a(0, true).a(vf.a(10066329, 7829367, 15658734, (byte) -94), 0).a((byte) 116, 1118481).c(-1, param1 + 2701);
          var8.a(4, true).a(true, (byte) -57).a(var5, 0);
          this.field_q = (WidgetRenderer) ((Object) var8);
          var9 = new RgbSprite[9];
          var9[4] = new RgbSprite(2, 1);
          var10 = new RgbSprite[9];
          var10[4] = new RgbSprite(1, 2);
          dupTemp$2 = var9[4];
          dupTemp$2.field_v = new int[]{6710886, 7829367};
          var10[4].field_v = new int[]{6710886, 7829367};
          var11 = new sj();
          var12 = new sj();
          var11.a(0, var9, 87);
          var12.a(0, var10, 94);
          var13 = new RgbSprite(7, 4);
          var13.field_v = new int[]{8947848, 8947848, 8947848, 13421772, 8947848, 8947848, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 8947848, 8947848, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 8947848, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772, 13421772};
          var14 = new sj(var4, true);
          var14.a(param1 ^ 2698, var13.copy());
          var13.rotateClockwise();
          var14Lifetime1 = new sj(var4, true);
          var14Lifetime1.a(param1 + 2698, var13.copy());
          var13.rotateClockwise();
          var14Lifetime2 = new sj(var4, true);
          var14Lifetime2.a(-1, var13.copy());
          var13.rotateClockwise();
          var20 = new sj(var4, true);
          var20.a(-1, var13);
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "bl.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final void a(int param0, boolean param1, int param2, int param3, int param4, int param5) {
        SoftwareRasterizer.drawLine(param0, param5, param4, param2, param3);
        if (param1) {
          String var8 = (String) null;
          this.a(97, -24, 37, (String) null);
        }
    }

    private final void a(boolean param0, String param1, int param2, int param3) {
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
          var5_int = this.field_j.stringWidth(param1);
          var6 = this.field_j.field_B + this.field_j.field_E;
          var7 = param3;
          if (param0) {
            bl.clearStaticReferences(21);
          }
          if (var5_int + (var7 + 6) > SoftwareRasterizer.field_f) {
            var7 = -var5_int + SoftwareRasterizer.field_f - 6;
          }
          var8 = 32 + param2 - this.field_j.field_E;
          if (SoftwareRasterizer.field_l < var8 + (var6 + 6)) {
            var8 = -var6 + SoftwareRasterizer.field_l - 6;
          }
          SoftwareRasterizer.drawRectangleOutline(var7, var8, var5_int + 6, var6 + 6, this.field_m);
          SoftwareRasterizer.fillRectangle(1 + var7, var8 + 1, 4 + var5_int, var6 + 4, this.field_k);
          this.field_j.drawString(param1, 3 + var7, this.field_j.field_E + (var8 + 3), this.field_m, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_11_0 = var5;
          stackIn_11_1 = new StringBuilder().append("bl.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final void a(int param0, int param1, int param2, String param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!this.field_b) {
            this.a(false, param3, param0, param1);
          } else {
            this.a(param1, (byte) 84, param0, param3);
          }
          if (param2 != 0) {
            bl.clearStaticReferences(-79);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("bl.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 != 13756) {
          return;
        }
        field_n = null;
    }

    private final void a(int param0, byte param1, int param2, String param3) {
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
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = this.field_h + this.field_a;
          var6 = this.field_d + this.field_o;
          var7 = this.field_i;
          if (-1 == var7) {
            var7 = this.field_j.field_B + this.field_j.field_H;
          }
          var8 = SoftwareRasterizer.field_f >> 2;
          var9 = this.field_j.stringWidth(param3);
          if (param1 <= 63) {
            this.a(-73, 11, -20, 9, -90, 41, -128);
          }
          var10 = this.field_j.field_H + this.field_j.field_B;
          var11 = 1;
          if (var9 > var8 ||
            param3.indexOf("<br>") != -1) {
            if (var8 >= var9) {
              var12 = var8;
            } else {
              var13 = var9 / var8;
              var12 = var8 + (var13 + var9 % var8 - 1) / var13 * 2;
            }
            if (null == ck.field_h) {
              ck.field_h = new String[16];
            }
            var11Lifetime1 = this.field_j.wrapText(param3, new int[]{var12}, ck.field_h);
            var10 = var10 + var7 * (var11Lifetime1 - 1);
            var9 = 0;
            for (var13Lifetime2 = 0; var13Lifetime2 < var11Lifetime1; var13Lifetime2++) {
              var14 = this.field_j.stringWidth(ck.field_h[var13Lifetime2]);
              if (var14 > var9) {
                var9 = var14;
              }
            }
          }
          var12 = param0;
          if (SoftwareRasterizer.field_f < var5_int + var9 + var12) {
            var12 = SoftwareRasterizer.field_f - (var9 + var5_int);
          }
          var13Lifetime1 = param2 - (this.field_j.field_E - 32);
          if (SoftwareRasterizer.field_l < var6 + (var13Lifetime1 + var10)) {
            var13Lifetime1 = -var10 + param2 - var6;
          }
          SoftwareRasterizer.drawRectangleOutline(var12, var13Lifetime1, var5_int + var9, var10 + var6, this.field_r);
          SoftwareRasterizer.fillRectangle(var12 + 1, 1 + var13Lifetime1, -2 + var9 + var5_int, var10 - (-var6 + 2), this.field_k);
          this.field_j.drawParagraph(param3, var12 + this.field_h, var13Lifetime1 + this.field_o, var9, var10, this.field_m, -1, 0, 0, var7);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_29_0 = var5;
          stackIn_29_1 = new StringBuilder().append("bl.B(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) stackIn_29_0), ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (null != MusicPatchPcmStream.field_n) {
          return;
        }
        MusicPatchPcmStream.field_n = new String[27];
        MusicPatchPcmStream.field_n[3] = vh.field_i;
        MusicPatchPcmStream.field_n[11] = qf.field_h;
        MusicPatchPcmStream.field_n[15] = ha.field_j;
        MusicPatchPcmStream.field_n[6] = jl.field_a;
        MusicPatchPcmStream.field_n[14] = nf.field_l;
        MusicPatchPcmStream.field_n[16] = bm.field_c;
        MusicPatchPcmStream.field_n[5] = jl.field_a;
        MusicPatchPcmStream.field_n[12] = l.field_j;
        MusicPatchPcmStream.field_n[0] = k.field_e;
        MusicPatchPcmStream.field_n[4] = MusicPatchEnvelope.field_i;
        MusicPatchPcmStream.field_n[7] = dk.field_b;
        MusicPatchPcmStream.field_n[2] = BoundedRandomAccessFile.field_f;
        MusicPatchPcmStream.field_n[1] = vg.field_s;
        MusicPatchPcmStream.field_n[13] = BoundedRandomAccessFile.field_a;
        MusicPatchPcmStream.field_n[24] = gb.field_g[5];
        MusicPatchPcmStream.field_n[9] = eg.field_w[1];
        if (param0 < 14) {
          bl.clearStaticReferences(-55);
        }
        MusicPatchPcmStream.field_n[20] = gb.field_g[1];
        MusicPatchPcmStream.field_n[23] = gb.field_g[4];
        MusicPatchPcmStream.field_n[18] = AccountServiceResult.field_g;
        MusicPatchPcmStream.field_n[21] = gb.field_g[2];
        MusicPatchPcmStream.field_n[10] = eg.field_w[2];
        MusicPatchPcmStream.field_n[8] = eg.field_w[0];
        MusicPatchPcmStream.field_n[19] = gb.field_g[0];
        MusicPatchPcmStream.field_n[26] = wh.field_d;
        MusicPatchPcmStream.field_n[17] = mi.field_d;
        MusicPatchPcmStream.field_n[22] = gb.field_g[3];
        MusicPatchPcmStream.field_n[25] = TextHotspotBounds.field_m;
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (param6 < 90) {
          return;
        }
        SoftwareRasterizer.fillRectangleAlpha(param5, param3, param1, param2, param0, param4);
    }

    public bl() {
        this.field_b = true;
    }

    static {
        field_g = -1;
    }
}
