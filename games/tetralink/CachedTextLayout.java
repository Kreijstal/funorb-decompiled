/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CachedTextLayout extends TextLayout {
    private String field_j;
    private int field_i;
    static SocialTabsPanel field_e;
    private int field_f;
    static String field_m;
    static String field_n;
    private int field_h;
    private int field_p;
    private BitmapFont field_g;
    static BitmapFont field_k;
    private int field_l;
    private boolean field_o;

    final static void sortRankingRange(int param0, int param1, int param2, int param3, boolean param4, int param5, int param6) {
        int var11 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var14 = TetraLink.field_J;
        try {
          if (param5 >= param3) {
            return;
          }
          if (param2 <= param5 + 1) {
            return;
          }
          if (5 + param5 < param2 &&
            param6 != param1) {
            var7_int = (param1 >> 1) + (param6 >> 1) + (1 & (param6 & param1));
            var8 = param5;
            var9 = param6;
            var10 = param1;
            for (var11 = param5; var11 < param2; var11++) {
              var12 = DialWidget.field_W[var11];
              if (!param4) {
                stackIn_23_0 = MusicTrackHelpers.field_b[var12];
              } else {
                stackIn_23_0 = DateOfBirthPanel.field_P[var12];
              }
              var13 = stackIn_23_0;
              if (var13 <= var7_int) {
                if (var13 > var10) {
                  var10 = var13;
                }
              } else {
                DialWidget.field_W[var11] = DialWidget.field_W[var8];
                incrementValue$0 = var8;
                var8++;
                DialWidget.field_W[incrementValue$0] = var12;
                if (var9 > var13) {
                  var9 = var13;
                }
              }
            }
            CachedTextLayout.sortRankingRange(0, var9, var8, param3, param4, param5, param6);
            CachedTextLayout.sortRankingRange(param0 ^ param0, param1, param2, param3, param4, var8, var10);
            return;
          }
          for (var7_intLifetime1 = -1 + param2; param5 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var7_intLifetime1 > var8Lifetime1; var8Lifetime1++) {
              var9Lifetime1 = DialWidget.field_W[var8Lifetime1];
              var10Lifetime1 = DialWidget.field_W[var8Lifetime1 + 1];
              if (ReportAbuseDialog.comesBeforeRankingRow(param4, var10Lifetime1, 113, var9Lifetime1)) {
                DialWidget.field_W[var8Lifetime1] = var10Lifetime1;
                DialWidget.field_W[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var7), "we.B(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    final static PlayingSound playSoundEffect(int param0, PcmSampleStream param1) {
        PlayingSound var2 = null;
        RuntimeException var2_ref = null;
        PlayingSound stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var2 = new PlayingSound(param1, param1);
          MouseInputHandler.field_b.addLast(var2, false);
          QuickChatPhraseCache.field_g.addSubStream(param1);
          if (param0 != -11040) {
            field_e = (SocialTabsPanel) null;
          }
          stackIn_3_0 = var2;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("we.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final void layoutRightAlignedLine(String param0, int param1, int param2, boolean param3, BitmapFont param4) {
        TextLayoutLine var8 = null;
        TextLayoutLine var9 = null;
        if (param0 == null) {
          this.field_c = null;
          return;
        }
        if (param4 == this.field_g &&
          this.field_o &&
          this.field_l == 2 &&
          this.field_j != null &&
          this.field_j.equals(param0)) {
          return;
        }
        try {
          this.field_j = param0;
          this.field_g = param4;
          this.field_l = 2;
          this.field_o = true;
          var8 = this.createSingleLine(param0, param1, -19395, param4);
          var9 = var8;
          var9.field_j[0] = -param4.textWidth(param0) + param2;
          var9.field_j[param0.length()] = param2;
          DirectByteStorage.computeCaretPositions(param0, var9, param4, param3, 0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "we.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void layoutCenteredLine(String param0, byte param1, BitmapFont param2, int param3, int param4) {
        TextLayoutLine var8 = null;
        int var7 = 0;
        if (param0 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_g == param2 &&
          this.field_o &&
          this.field_l == 1 &&
          null != this.field_j &&
          this.field_j.equals(param0)) {
          return;
        }
        try {
          if (param1 != 124) {
            this.field_o = true;
          }
          this.field_o = true;
          this.field_g = param2;
          this.field_l = 1;
          var8 = this.createSingleLine(param0, param4, -19395, param2);
          var7 = param2.textWidth(param0);
          var8.field_j[0] = param3 - (var7 >> 1);
          var8.field_j[param0.length()] = param3 + (var7 >> 1);
          DirectByteStorage.computeCaretPositions(param0, var8, param2, false, 0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "we.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ',' + param4 + ')');
        }
    }

    final static void updateOverlays(boolean param0, int param1, int param2, int param3) {
        if (param2 != -2) {
          return;
        }
        PopupAndStripHelpers.updateActivePopup((byte) 116, param0);
        QuickChatCategoryCache.updateQuickChatMenu(param0, param3, param1, false);
    }

    final void layoutLeftAlignedLine(int param0, BitmapFont param1, int param2, int param3, String param4) {
        TextLayoutLine var7 = null;
        TextLayoutLine var8 = null;
        if (param4 == null) {
          this.field_c = null;
          return;
        }
        if (param1 == this.field_g && this.field_o && 0 == this.field_l && null != this.field_j &&
          this.field_j.equals(param4)) {
          return;
        }
        try {
          this.field_g = param1;
          this.field_j = param4;
          this.field_o = true;
          this.field_l = 0;
          var7 = this.createSingleLine(param4, param3, -19395, param1);
          var8 = var7;
          var7.field_j[param2] = param0;
          var8.field_j[param4.length()] = param1.textWidth(param4) + param0;
          DirectByteStorage.computeCaretPositions(param4, var8, param1, false, 0);
        } catch (RuntimeException runtimeException) {
          throw IndexedSpriteState.wrapException((Throwable) ((Object) runtimeException), "we.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void layoutWrappedText(int param0, int param1, String param2, int param3, BitmapFont param4, int param5, int param6, int param7) {
        TextLayoutLine stackIn_38_0;
        TextLayoutLine stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        TextLayoutLine stackIn_39_0 = null;
        TextLayoutLine stackIn_39_1 = null;
        int stackIn_39_4 = 0;
        String stackIn_43_0;
        TextLayoutLine stackIn_43_1;
        BitmapFont stackIn_43_2;
        boolean stackIn_43_3;
        int stackIn_44_4;
        RuntimeException stackIn_49_0 = null;
        StringBuilder stackIn_49_1 = null;
        String stackIn_50_2 = null;
        StringBuilder stackIn_52_1 = null;
        String stackIn_53_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        TextLayoutLine var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = TetraLink.field_J;
        try {
          if (param7 == 0) {
            param7 = param4.field_H;
          }
          if (param2 == null) {
            this.field_c = null;
            return;
          }
          if (param4 == this.field_g &&
            !this.field_o &&
            this.field_l == param5 &&
            this.field_f == param6 &&
            param7 == this.field_p &&
            this.field_h == param1 &&
            param3 == this.field_i &&
            null != this.field_j &&
            this.field_j.equals(param2)) {
            return;
          }
          this.field_p = param7;
          this.field_i = param3;
          this.field_f = param6;
          this.field_h = param1;
          this.field_l = param5;
          this.field_j = param2;
          if (param0 != -24340) {
            return;
          }
          this.field_g = param4;
          this.field_o = false;
          var16 = new String[1 + param4.wrappedLineCount(param2, param3)];
          var17 = var16;
          var10 = Math.max(1, param4.wrapText(param2, new int[]{param3}, var17));
          if (this.field_f == 3 &&
            var10 == 1) {
            this.field_f = 1;
          }
          this.field_c = new TextLayoutLine[var10];
          if (this.field_f == 0) {
            var11 = param4.field_N;
          } else {
            if (1 != this.field_f) {
              if (2 == this.field_f) {
                var11 = -(var10 * this.field_p) + (-param4.field_K + this.field_h);
              } else {
                var12 = (-(this.field_p * var10) + this.field_h) / (1 + var10);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_p = this.field_p + var12;
                var11 = var12 + param4.field_N;
              }
            } else {
              var11 = (this.field_h - var10 * this.field_p >> 1) + param4.field_N;
            }
          }
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_38_0 = null;
            stackIn_38_1 = null;
            stackIn_38_2 = var11 - param4.field_N;
            stackIn_38_3 = var11 + param4.field_K;
            if (var13 != null) {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = var13.length();
            } else {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = 0;
            }
            var14 = new TextLayoutLine(stackIn_38_2, stackIn_38_3, stackIn_39_4);
            var14.field_j[0] = 0;
            if (var13 != null) {
              var14.field_j[var13.length()] = param4.textWidth(var13);
              stackIn_43_0 = var13;
              stackIn_43_1 = var14;
              stackIn_43_2 = (BitmapFont) (param4);
              stackIn_43_3 = false;
              if (param5 == 3) {
                stackIn_44_4 = this.justificationSpacing(param4.textWidth(var13), (byte) -126, param3, var13);
              } else {
                stackIn_44_4 = 0;
              }
              DirectByteStorage.computeCaretPositions(stackIn_43_0, stackIn_43_1, stackIn_43_2, stackIn_43_3, stackIn_44_4);
            }
            this.field_c[var12Lifetime1] = var14;
            var11 = var11 + param7;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_49_0 = var9;
          stackIn_49_1 = new StringBuilder().append("we.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_50_2 = "null";
          } else {
            stackIn_50_2 = "{...}";
          }
          stackIn_52_1 = ((StringBuilder) (Object) stackIn_49_1).append(stackIn_50_2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_53_2 = "null";
          } else {
            stackIn_53_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_49_0), ((StringBuilder) (Object) stackIn_52_1).append(stackIn_53_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 0) {
          field_n = (String) null;
        }
        field_e = null;
        field_k = null;
        field_m = null;
        field_n = null;
    }

    private final TextLayoutLine createSingleLine(String param0, int param1, int param2, BitmapFont param3) {
        TextLayoutLine var5 = null;
        RuntimeException var5_ref = null;
        TextLayoutLine var6 = null;
        TextLayoutLine stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != -19395) {
            CachedTextLayout.sortRankingRange(-73, 23, -34, 70, true, 88, 94);
          }
          var6 = new TextLayoutLine(-param3.field_N + param1, param1 + param3.field_K, param0.length());
          var5 = var6;
          this.field_c = new TextLayoutLine[]{var6};
          stackIn_3_0 = var5;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_6_0 = var5_ref;
          stackIn_6_1 = new StringBuilder().append("we.F(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw IndexedSpriteState.wrapException((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    final static void drawGradientPanel(int param0, int param1, int param2, int param3, byte param4, int param5, boolean param6) {
        int var7_int = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int stackIn_6_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        int var11Lifetime1;
        var13 = TetraLink.field_J;
        try {
          var7_int = WhirlpoolHasher.field_l[0].field_t + (param5 - 3);
          var8 = param0 + WhirlpoolHasher.field_l[0].field_F - 3;
          var9 = -WhirlpoolHasher.field_l[2].field_t - WhirlpoolHasher.field_l[0].field_t + param2 + 6;
          var10 = -WhirlpoolHasher.field_l[6].field_F + (-WhirlpoolHasher.field_l[0].field_F + 6 + param3);
          for (var11 = 0; var11 < 48; var11++) {
            if (param6) {
              stackIn_6_0 = var11 * 5 + 4;
            } else {
              stackIn_6_0 = -(var11 * 5) + 239;
            }
            var12 = stackIn_6_0;
            SoftwareRasterizer.drawVerticalLine(var11 + var7_int, var8, var10, var12);
            SoftwareRasterizer.drawVerticalLine(-var11 + (-1 + var7_int) + var9, var8, var10, var12);
          }
          stackIn_10_0 = (param6) ? 244 : 4;
          var11Lifetime1 = stackIn_10_0;
          SoftwareRasterizer.fillRectangle(48 + var7_int, var8, var9 - 96, var10, var11Lifetime1);
          NineSliceFrameHelpers.drawNineSliceFrame(param2, (byte) -36, WhirlpoolHasher.field_l, param5, param3, param0);
          if (param4 <= 39) {
            field_e = (SocialTabsPanel) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var7), "we.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public CachedTextLayout() {
    }

    static {
        field_n = "Not available in 2D mode";
        field_m = "Creating a Jagex account is simple and free. Your account will remember your progress, highscores and achievements in every game. You can also use it to play some of our multiplayer games - and Jagex's other games!<br><br><col=2164A2>Please note - if you have a RuneScape account, you can click 'Go Back' and use your existing account to log in!</col>";
    }
}
