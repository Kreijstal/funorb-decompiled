/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oj extends ep {
    static int field_m;
    static String field_s;
    private String field_w;
    private int field_n;
    private int field_l;
    static java.awt.Image field_r;
    static MusicTrack field_q;
    static String field_o;
    private boolean field_x;
    static long lastGameReadMillis;
    private int field_p;
    private TextFont field_u;
    private int field_v;
    private int field_y;

    final void a(String param0, int param1, TextFont param2, int param3, int param4) {
        ml var8 = null;
        int var7 = 0;
        if (param0 == null) {
          this.field_c = null;
          return;
        }
        if (param2 == this.field_u &&
          this.field_x &&
          this.field_l == 1 &&
          this.field_w != null &&
          this.field_w.equals(param0)) {
          return;
        }
        try {
          this.field_x = true;
          this.field_u = param2;
          this.field_l = param4;
          var8 = this.a(param0, param2, (byte) -72, param1);
          var7 = param2.measureText(param0);
          var8.field_g[0] = param3 - (var7 >> 1);
          var8.field_g[param0.length()] = param3 + (var7 >> 1);
          dn.a(25293, param0, var8, 0, param2);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oj.J(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void a(boolean param0, byte param1) {
        UiComponent stackIn_7_0 = null;
        boolean stackIn_7_1 = false;
        boolean stackIn_8_2 = false;
        UiComponent stackIn_11_0 = null;
        boolean stackIn_11_1 = false;
        boolean stackIn_12_2 = false;
        UiComponent stackIn_17_0 = null;
        boolean stackIn_17_1 = false;
        boolean stackIn_18_2 = false;
        UiComponent stackIn_21_0 = null;
        boolean stackIn_21_1 = false;
        boolean stackIn_22_2 = false;
        UiComponent stackIn_26_0 = null;
        boolean stackIn_26_1 = false;
        boolean stackIn_27_2 = false;
        UiComponent stackIn_30_0 = null;
        boolean stackIn_30_1 = false;
        boolean stackIn_31_2 = false;
        UiComponent stackIn_39_0 = null;
        boolean stackIn_39_1 = false;
        boolean stackIn_40_2 = false;
        UiComponent stackIn_43_0 = null;
        boolean stackIn_43_1 = false;
        boolean stackIn_44_2 = false;
        UiComponent stackIn_48_0 = null;
        boolean stackIn_48_1 = false;
        boolean stackIn_49_2 = false;
        UiComponent stackIn_52_0 = null;
        boolean stackIn_52_1 = false;
        boolean stackIn_53_2 = false;
        UiComponent stackIn_60_0 = null;
        boolean stackIn_60_1 = false;
        boolean stackIn_61_2 = false;
        UiComponent stackIn_64_0 = null;
        boolean stackIn_64_1 = false;
        boolean stackIn_65_2 = false;
        UiComponent stackIn_69_0 = null;
        boolean stackIn_69_1 = false;
        boolean stackIn_70_2 = false;
        UiComponent stackIn_73_0 = null;
        boolean stackIn_73_1 = false;
        boolean stackIn_74_2 = false;
        UiComponent stackIn_82_0 = null;
        boolean stackIn_82_1 = false;
        boolean stackIn_83_2 = false;
        UiComponent stackIn_86_0 = null;
        boolean stackIn_86_1 = false;
        boolean stackIn_87_2 = false;
        UiComponent stackIn_91_0 = null;
        boolean stackIn_91_1 = false;
        boolean stackIn_92_2 = false;
        UiComponent stackIn_95_0 = null;
        boolean stackIn_95_1 = false;
        boolean stackIn_96_2 = false;
        int var2;
        int var2Lifetime1;
        int var2Lifetime2;
        int var2Lifetime3;
        int var2Lifetime4;
        MovingBody.a((byte) 74, 640 + Rasterizer2D.width >> 1, -640 + Rasterizer2D.width >> 1, 0, Rasterizer2D.height);
        if (ml.field_b <= 0) {
          if (IntArrayRequest.field_j > 0) {
            if (null == c.field_e) {
              stackIn_60_0 = NinjaBackground.field_w;
              stackIn_60_1 = true;
              stackIn_61_2 = (param0) && (!hc.field_c);
              ((UiComponent) (Object) stackIn_60_0).drawRoot(stackIn_60_1, stackIn_61_2);
              stackIn_64_0 = MultiplayerMatch.field_d;
              stackIn_64_1 = true;
              stackIn_65_2 = (param0) && (!hc.field_c);
              ((UiComponent) (Object) stackIn_64_0).drawRoot(stackIn_64_1, stackIn_65_2);
            } else {
              c.field_e.drawAt(NinjaBackground.field_w.localX, 0);
              stackIn_69_0 = NinjaBackground.field_w;
              stackIn_69_1 = true;
              stackIn_70_2 = (param0) && (!hc.field_c);
              ((UiComponent) (Object) stackIn_69_0).drawRoot(stackIn_69_1, stackIn_70_2);
              stackIn_73_0 = MultiplayerMatch.field_d;
              stackIn_73_1 = true;
              stackIn_74_2 = (param0) && (!hc.field_c);
              ((UiComponent) (Object) stackIn_73_0).drawRoot(stackIn_73_1, stackIn_74_2);
            }
          } else {
            if (TableDataRequest.field_m > 0) {
              if (null == c.field_e) {
                stackIn_82_0 = NinjaBackground.field_w;
                stackIn_82_1 = true;
                stackIn_83_2 = (param0) && (!hc.field_c);
                ((UiComponent) (Object) stackIn_82_0).drawRoot(stackIn_82_1, stackIn_83_2);
                stackIn_86_0 = MultiplayerMatch.field_d;
                stackIn_86_1 = true;
                stackIn_87_2 = (param0) && (!hc.field_c);
                ((UiComponent) (Object) stackIn_86_0).drawRoot(stackIn_86_1, stackIn_87_2);
              } else {
                c.field_e.drawAt(NinjaBackground.field_w.localX, 0);
                stackIn_91_0 = NinjaBackground.field_w;
                stackIn_91_1 = true;
                stackIn_92_2 = (param0) && (!hc.field_c);
                ((UiComponent) (Object) stackIn_91_0).drawRoot(stackIn_91_1, stackIn_92_2);
                stackIn_95_0 = MultiplayerMatch.field_d;
                stackIn_95_1 = true;
                stackIn_96_2 = (param0) && (!hc.field_c);
                ((UiComponent) (Object) stackIn_95_0).drawRoot(stackIn_95_1, stackIn_96_2);
              }
            }
          }
          sc.popRaster(-123);
          var2 = -63 / ((70 - param1) / 49);
          return;
        }
        if (null != c.field_e) {
          c.field_e.drawAt(fe.field_gb.localX, 0);
        }
        stackIn_7_0 = fe.field_gb;
        stackIn_7_1 = true;
        stackIn_8_2 = (param0) && (!sc.field_c);
        ((UiComponent) (Object) stackIn_7_0).drawRoot(stackIn_7_1, stackIn_8_2);
        stackIn_11_0 = rm.field_a;
        stackIn_11_1 = true;
        stackIn_12_2 = (param0) && (!sc.field_c);
        ((UiComponent) (Object) stackIn_11_0).drawRoot(stackIn_11_1, stackIn_12_2);
        if (IntArrayRequest.field_j > 0) {
          if (null == c.field_e) {
            stackIn_17_0 = NinjaBackground.field_w;
            stackIn_17_1 = true;
            stackIn_18_2 = (param0) && (!hc.field_c);
            ((UiComponent) (Object) stackIn_17_0).drawRoot(stackIn_17_1, stackIn_18_2);
            stackIn_21_0 = MultiplayerMatch.field_d;
            stackIn_21_1 = true;
            stackIn_22_2 = (param0) && (!hc.field_c);
            ((UiComponent) (Object) stackIn_21_0).drawRoot(stackIn_21_1, stackIn_22_2);
          } else {
            c.field_e.drawAt(NinjaBackground.field_w.localX, 0);
            stackIn_26_0 = NinjaBackground.field_w;
            stackIn_26_1 = true;
            stackIn_27_2 = (param0) && (!hc.field_c);
            ((UiComponent) (Object) stackIn_26_0).drawRoot(stackIn_26_1, stackIn_27_2);
            stackIn_30_0 = MultiplayerMatch.field_d;
            stackIn_30_1 = true;
            stackIn_31_2 = (param0) && (!hc.field_c);
            ((UiComponent) (Object) stackIn_30_0).drawRoot(stackIn_30_1, stackIn_31_2);
          }
          sc.popRaster(-123);
          var2Lifetime1 = -63 / ((70 - param1) / 49);
          return;
        }
        if (TableDataRequest.field_m <= 0) {
          sc.popRaster(-123);
          var2Lifetime2 = -63 / ((70 - param1) / 49);
          return;
        }
        if (null == c.field_e) {
          stackIn_39_0 = NinjaBackground.field_w;
          stackIn_39_1 = true;
          stackIn_40_2 = (param0) && (!hc.field_c);
          ((UiComponent) (Object) stackIn_39_0).drawRoot(stackIn_39_1, stackIn_40_2);
          stackIn_43_0 = MultiplayerMatch.field_d;
          stackIn_43_1 = true;
          stackIn_44_2 = (param0) && (!hc.field_c);
          ((UiComponent) (Object) stackIn_43_0).drawRoot(stackIn_43_1, stackIn_44_2);
          sc.popRaster(-123);
          var2Lifetime3 = -63 / ((70 - param1) / 49);
          return;
        }
        c.field_e.drawAt(NinjaBackground.field_w.localX, 0);
        stackIn_48_0 = NinjaBackground.field_w;
        stackIn_48_1 = true;
        stackIn_49_2 = (param0) && (!hc.field_c);
        ((UiComponent) (Object) stackIn_48_0).drawRoot(stackIn_48_1, stackIn_49_2);
        stackIn_52_0 = MultiplayerMatch.field_d;
        stackIn_52_1 = true;
        stackIn_53_2 = (param0) && (!hc.field_c);
        ((UiComponent) (Object) stackIn_52_0).drawRoot(stackIn_52_1, stackIn_53_2);
        sc.popRaster(-123);
        var2Lifetime4 = -63 / ((70 - param1) / 49);
        return;
    }

    final void a(TextFont param0, int param1, int param2, String param3, int param4) {
        ml var7 = null;
        ml var8 = null;
        if (param3 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_u == param0 && this.field_x && this.field_l == 0 && this.field_w != null &&
          this.field_w.equals(param3)) {
          return;
        }
        try {
          this.field_u = param0;
          this.field_x = true;
          this.field_w = param3;
          this.field_l = param4;
          var7 = this.a(param3, param0, (byte) -109, param1);
          var8 = var7;
          var7.field_g[0] = param2;
          var8.field_g[param3.length()] = param0.measureText(param3) + param2;
          dn.a(param4 ^ 25293, param3, var8, 0, param0);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oj.N(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(int param0, Paddle param1, int param2, int param3, byte param4, PlayerBoard param5, int param6) {
        RgbSprite[] stackIn_4_0 = null;
        RgbSprite[] stackIn_7_0 = null;
        RgbSprite stackIn_10_0 = null;
        RuntimeException stackIn_44_0 = null;
        StringBuilder stackIn_44_1 = null;
        String stackIn_45_2 = null;
        StringBuilder stackIn_47_1 = null;
        String stackIn_48_2 = null;
        RuntimeException decompiledCaughtException = null;
        RgbSprite[] var7 = null;
        RuntimeException var7_ref = null;
        RgbSprite[] var8 = null;
        RgbSprite var9 = null;
        int var10 = 0;
        int var11 = 0;
        RgbSprite var12 = null;
        int var12_int = 0;
        int var13 = 0;
        RgbSprite[] var14 = null;
        RgbSprite var15 = null;
        RgbSprite var12Lifetime1;
        int var12_intLifetime1;
        var13 = BrickABrac.field_J ? 1 : 0;
        try {
          if (oa.currentBackground != null) {
            stackIn_4_0 = oa.currentBackground.a((byte) -89, param2);
          } else {
            stackIn_4_0 = null;
          }
          var14 = stackIn_4_0;
          var7 = var14;
          if (oa.currentBackground != null) {
            stackIn_7_0 = oa.currentBackground.a(param2, true);
          } else {
            stackIn_7_0 = null;
          }
          var8 = stackIn_7_0;
          if (oa.currentBackground == null) {
            stackIn_10_0 = null;
          } else {
            stackIn_10_0 = oa.currentBackground.a(true, param2);
          }
          var9 = stackIn_10_0;
          if (param4 < 54) {
            return;
          }
          var10 = param1.y256 >> 8;
          var11 = param1.x256 >> 8;
          if (param0 == 2) {
            var15 = bq.field_e[1][ChocolateBackground.field_w.nextBoundedInt(-37880252, bq.field_e[1].length)];
            var12 = var15;
            var12.f((var11 + param6 * param2 - var15.canvasWidth * param2 + 3) / param2, (3 + (param2 * param3 + var10)) / param2, 196);
          }
          tf.field_c[0].drawTransparent(var11 / param2 + param6, var10 / param2 + param3);
          if (var7 != null) {
            var14[0].drawTransparent(param6 + var11 / param2, param3 + var10 / param2);
          }
          var11 += 16;
          for (var12_int = 0; param1.sizeStage / 2 > var12_int; var12_int++) {
            fq.field_d[0].drawTransparent(var11 / param2 + param6, param3 + var10 / param2);
            if (null != var8) {
              var8[0].drawTransparent(var11 / param2 + param6, var10 / param2 + param3);
            }
            var11 += 6;
          }
          gg.field_o.drawTransparent(param6 + var11 / param2, var10 / param2 + param3);
          if (var9 != null) {
            var9.drawTransparent(param6 + var11 / param2, var10 / param2 + param3);
          }
          var11 += 8;
          for (var12_intLifetime1 = 0; param1.sizeStage / 2 > var12_intLifetime1; var12_intLifetime1++) {
            fq.field_d[1].drawTransparent(var11 / param2 + param6, var10 / param2 + param3);
            if (null != var8) {
              var8[1].drawTransparent(var11 / param2 + param6, param3 + var10 / param2);
            }
            var11 += 6;
          }
          if (0 == param0) {
            var12Lifetime1 = bq.field_e[0][ChocolateBackground.field_w.nextBoundedInt(-37880252, bq.field_e[0].length)];
            var12Lifetime1.f((var11 + (16 + param6 * param2) - 3) / param2, (3 + param2 * param3 + var10) / param2, 196);
          }
          tf.field_c[1].drawTransparent(param6 + var11 / param2, var10 / param2 + param3);
          if (var7 == null) {
            return;
          }
          var14[1].drawTransparent(param6 + var11 / param2, param3 + var10 / param2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7_ref = decompiledCaughtException;
          stackIn_44_0 = var7_ref;
          stackIn_44_1 = new StringBuilder().append("oj.P(").append(param0).append(',');
          if (param1 == null) {
            stackIn_45_2 = "null";
          } else {
            stackIn_45_2 = "{...}";
          }
          stackIn_47_1 = ((StringBuilder) (Object) stackIn_44_1).append(stackIn_45_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_48_2 = "null";
          } else {
            stackIn_48_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_44_0), ((StringBuilder) (Object) stackIn_47_1).append(stackIn_48_2).append(',').append(param6).append(')').toString());
        }
    }

    private final ml a(String param0, TextFont param1, byte param2, int param3) {
        ml var5 = null;
        RuntimeException var5_ref = null;
        ml var6 = null;
        ml stackIn_2_0 = null;
        ml stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = new ml(-param1.ascent + param3, param3 + param1.descent, param0.length());
          var5 = var6;
          this.field_c = new ml[]{var6};
          if (param2 < -71) {
            stackIn_4_0 = var5;
            return stackIn_4_0;
          }
          stackIn_2_0 = (ml) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("oj.I(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 == -51) {
          field_q = null;
          field_r = null;
          field_s = null;
          field_o = null;
          return;
        }
        lastGameReadMillis = -70L;
        field_q = null;
        field_r = null;
        field_s = null;
        field_o = null;
    }

    final void a(String param0, TextFont param1, int param2, byte param3, int param4) {
        ml var9 = null;
        ml var10 = null;
        if (param0 == null) {
          this.field_c = null;
          return;
        }
        if (param1 == this.field_u && this.field_x && 2 == this.field_l && null != this.field_w &&
          this.field_w.equals(param0)) {
          return;
        }
        try {
          if (param3 > -90) {
            TextFont var7 = (TextFont) null;
            this.a((String) null, -87, (TextFont) null, 2, -3);
          }
          this.field_u = param1;
          this.field_w = param0;
          this.field_x = true;
          this.field_l = 2;
          var9 = this.a(param0, param1, (byte) -108, param4);
          var10 = var9;
          var10.field_g[0] = param2 - param1.measureText(param0);
          var10.field_g[param0.length()] = param2;
          dn.a(25293, param0, var10, 0, param1);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "oj.L(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static int b(boolean param0) {
        if (GameConnectionShell.clientStage < 2) {
          return 0;
        }
        if (cd.field_e == 0) {
          if (!ma.field_P.ensureIndex((byte) -127)) {
            return 20;
          }
          if (!ma.field_P.ensureGroupAvailableByName("commonui", -28138)) {
            return 40;
          }
          if (!vh.field_S.ensureIndex((byte) -127)) {
            return 50;
          }
          if (!vh.field_S.ensureGroupAvailableByName("commonui", -28138)) {
            return 60;
          }
          if (!ja.field_c.ensureIndex((byte) -127)) {
            return 70;
          }
          if (!ja.field_c.ensureAllGroupsAvailable(117)) {
            return 80;
          }
        } else {
          if (wl.field_K != null) {
            if (!wl.field_K.ensureIndex((byte) -127)) {
              return 14;
            }
            if (!wl.field_K.hasGroupName(-104, "")) {
              return 29;
            }
            if (!wl.field_K.ensureGroupAvailableByName("", -28138)) {
              return 29;
            }
          }
          if (!ma.field_P.ensureIndex((byte) -127)) {
            return 43;
          }
          if (!ma.field_P.ensureGroupAvailableByName("commonui", -28138)) {
            return 57;
          }
          if (!vh.field_S.ensureIndex((byte) -127)) {
            return 71;
          }
          if (!vh.field_S.ensureGroupAvailableByName("commonui", -28138)) {
            return 80;
          }
          if (!ja.field_c.ensureIndex((byte) -127)) {
            return 82;
          }
          if (!ja.field_c.ensureAllGroupsAvailable(110)) {
            return 86;
          }
        }
        if (param0) {
          return 71;
        }
        return 100;
    }

    final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, TextFont param7) {
        ml stackIn_34_0;
        ml stackIn_34_1;
        int stackIn_34_2;
        int stackIn_34_3;
        ml stackIn_35_0 = null;
        ml stackIn_35_1 = null;
        int stackIn_35_4 = 0;
        int stackIn_39_0 = 0;
        String stackIn_39_1 = null;
        ml stackIn_39_2 = null;
        int stackIn_40_3;
        RuntimeException stackIn_45_0 = null;
        StringBuilder stackIn_45_1 = null;
        String stackIn_46_2 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var9_int = 0;
        RuntimeException var9 = null;
        String[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        ml var15 = null;
        int var16 = 0;
        int var13Lifetime1;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          if (0 == param4) {
            param4 = param7.baselineHeight;
          }
          if (param0 == null) {
            this.field_c = null;
            return;
          }
          if (param7 == this.field_u &&
            !this.field_x &&
            param1 == this.field_l &&
            param6 == this.field_v &&
            this.field_p == param4 &&
            this.field_y == param3 &&
            param5 == this.field_n &&
            this.field_w != null &&
            this.field_w.equals(param0)) {
            return;
          }
          var9_int = -125 % ((26 - param2) / 49);
          this.field_l = param1;
          this.field_x = false;
          this.field_w = param0;
          this.field_y = param3;
          this.field_v = param6;
          this.field_p = param4;
          this.field_n = param5;
          this.field_u = param7;
          var10 = new String[1 + param7.countWrappedLines(param0, param5)];
          var11 = Math.max(1, param7.wrapText(param0, new int[]{param5}, var10));
          if (this.field_v == 3 &&
            var11 == 1) {
            this.field_v = 1;
          }
          this.field_c = new ml[var11];
          if (this.field_v == 0) {
            var12 = param7.ascent;
          } else {
            if (this.field_v == 1) {
              var12 = (-(var11 * this.field_p) + this.field_y >> 1) + param7.ascent;
            } else {
              if (2 != this.field_v) {
                var13 = (this.field_y - this.field_p * var11) / (var11 + 1);
                if (var13 < 0) {
                  var13 = 0;
                }
                var12 = var13 + param7.ascent;
                this.field_p = this.field_p + var13;
              } else {
                var12 = this.field_y - param7.descent - var11 * this.field_p;
              }
            }
          }
          for (var13Lifetime1 = 0; var11 > var13Lifetime1; var13Lifetime1++) {
            var14 = var10[var13Lifetime1];
            stackIn_34_0 = null;
            stackIn_34_1 = null;
            stackIn_34_2 = var12 - param7.ascent;
            stackIn_34_3 = param7.descent + var12;
            if (var14 != null) {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = var14.length();
            } else {
              stackIn_35_0 = null;
              stackIn_35_1 = null;
              stackIn_35_4 = 0;
            }
            var15 = new ml(stackIn_34_2, stackIn_34_3, stackIn_35_4);
            var15.field_g[0] = 0;
            if (var14 != null) {
              var15.field_g[var14.length()] = param7.measureText(var14);
              stackIn_39_0 = 25293;
              stackIn_39_1 = var14;
              stackIn_39_2 = var15;
              if (param1 != 3) {
                stackIn_40_3 = 0;
              } else {
                stackIn_40_3 = this.a(param5, param7.measureText(var14), var14, true);
              }
              dn.a(stackIn_39_0, stackIn_39_1, stackIn_39_2, stackIn_40_3, param7);
            }
            this.field_c[var13Lifetime1] = var15;
            var12 = var12 + param4;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_45_0 = var9;
          stackIn_45_1 = new StringBuilder().append("oj.O(");
          if (param0 == null) {
            stackIn_46_2 = "null";
          } else {
            stackIn_46_2 = "{...}";
          }
          stackIn_48_1 = ((StringBuilder) (Object) stackIn_45_1).append(stackIn_46_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',');
          if (param7 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_45_0), ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(')').toString());
        }
    }

    public oj() {
    }

    static {
        field_o = "Seriously offensive language";
        field_s = "Please select a level.";
    }
}
