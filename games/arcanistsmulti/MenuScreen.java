/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuScreen {
    private int field_i;
    private MenuInputState field_g;
    private int field_h;
    static IntrusiveDeque field_j;
    private int field_n;
    static String field_r;
    private Sprite field_b;
    private int field_l;
    private int field_m;
    private double field_f;
    static String field_c;
    static String field_a;
    static LoginMessageTable[] field_q;
    private int field_d;
    static String field_o;
    static String field_k;
    static String field_e;
    static String field_p;

    private final void drawHintText(int param0, int param1, int param2, int param3) {
        int stackIn_28_0 = 0;
        int stackIn_28_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int stackIn_28_0Lifetime1;
        int stackIn_28_1Lifetime1;
        int var5_intLifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -120)) {
            return;
          }
          if (param1 > 0) {
            SpellProjectile.field_B.drawParagraph(SpriteTrimHelpers.field_b, param2, -48 + param0, 300, 80, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
            param0 += 24;
            param2 += 16;
            SpellProjectile.field_B.drawParagraph(IsaacCipher.field_l + param1, param2, param0, 70, 32, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
            param2 += 90;
            if (param1 > 99) {
              param2 += 8;
            }
            var5_int = 0;
            while (var5_int < param1) {
              stackIn_28_0 = param1;
              stackIn_28_1 = 5 + var5_int;
              if (stackIn_28_0 <= stackIn_28_1) {
                DualLinkDeque.field_b[7].draw(param2, param0);
                param2 += 9;
              } else {
                param2 -= 4;
                DualLinkDeque.field_b[8].draw(param2, param0);
                param2 += 15;
                var5_int += 4;
                if (~var5_int == ~((-(param1 % 10) + param1) / 2 - 1) &&
                  param1 > 50) {
                  param0 += 8;
                  param2 = param2 - var5_int * 2;
                }
              }
              var5_int++;
            }
          } else {
            SpellProjectile.field_B.drawParagraph(TextFieldValidator.field_i, param2, -48 + param0, 300, 80, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
            SpellProjectile.field_B.drawParagraph(CommonUiHelpers.field_j, param2, param0 + 24, 300, 32, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
          }
          stackIn_28_0Lifetime1 = 97;
          stackIn_28_1Lifetime1 = (param3 - 56) / 48;
          var5_intLifetime1 = stackIn_28_0Lifetime1 % stackIn_28_1Lifetime1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var5), "lc.I(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final int getItemX(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_10_1 = 0;
        int stackIn_11_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_28_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_46_0 = 0;
        int stackIn_51_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_69_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (6 == this.field_l) {
            if (MenuScreen.getSessionFlag((byte) 112)) {
              stackIn_5_0 = this.getColumnX(param1, 200) + 320;
              return stackIn_5_0;
            }
            stackIn_9_0 = this.getColumnX(param1, 200);
            if (param1 >= 2) {
              stackIn_10_1 = 300;
            } else {
              stackIn_10_1 = 150;
            }
            stackIn_11_0 = stackIn_9_0 + stackIn_10_1;
            return stackIn_11_0;
          }
          if (7 == this.field_l) {
            stackIn_16_0 = 200 + this.getColumnX(param1, 200);
            return stackIn_16_0;
          }
          if (this.field_l == 11) {
            if (param1 == 0) {
              stackIn_23_0 = 295;
              return stackIn_23_0;
            }
            if (param1 != 1) {
              stackIn_28_0 = 200 + this.getColumnX(param1, 200);
              return stackIn_28_0;
            }
            stackIn_26_0 = 611;
            return stackIn_26_0;
          }
          if (this.field_l == 12) {
            if (param1 == 0) {
              stackIn_35_0 = 271;
              return stackIn_35_0;
            }
            if (param1 != 1) {
              stackIn_40_0 = 200 + this.getColumnX(param1, 200);
              return stackIn_40_0;
            }
            stackIn_38_0 = 619;
            return stackIn_38_0;
          }
          if (this.field_l == 14) {
            stackIn_43_0 = this.getColumnX(param1, param0 ^ -193) + 200;
            return stackIn_43_0;
          }
          if (3 == this.field_l) {
            stackIn_46_0 = 560;
            return stackIn_46_0;
          }
          if (this.field_l == 9) {
            stackIn_51_0 = 440;
            return stackIn_51_0;
          }
          if (~this.field_l == param0) {
            if (param1 == 0) {
              stackIn_59_0 = 220;
              return stackIn_59_0;
            }
            if (param1 == 1) {
              stackIn_64_0 = 420;
              return stackIn_64_0;
            }
            if (param1 == 2) {
              stackIn_67_0 = 620;
              return stackIn_67_0;
            }
          }
          stackIn_69_0 = PackedShortHelpers.field_b[this.field_l];
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.V(" + param0 + ',' + param1 + ')');
        }
    }

    final static boolean getSessionFlag(byte param0) {
        RuntimeException var1 = null;
        boolean stackIn_4_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 112) {
            field_o = (String) null;
          }
          stackIn_4_0 = QueuedPacket.field_p;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var1), "lc.F(" + param0 + ')');
        }
    }

    private final void updateHoverSelection(int param0) {
        int var2_int = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        try {
          if (WrappedTextLayout.field_r == 1) {
            var2_int = PasswordCheckHelpers.field_g;
            if (LabeledField.field_K != var2_int) {
              if (var2_int != -1) {
                LabeledField.field_K = var2_int;
              }
            } else {
              LabeledField.field_K = -1;
            }
          }
          if (param0 != -1) {
            this.field_g = (MenuInputState) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.C(" + param0 + ')');
        }
    }

    final static int measureText(boolean param0, String param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 > -82) {
            stackIn_2_0 = -107;
            return stackIn_2_0;
          }
          if (!param0) {
            stackIn_7_0 = ResizableModalPanel.field_T.textWidth(param1);
            return stackIn_7_0;
          }
          stackIn_5_0 = TextLine.field_c.textWidth(param1);
          return stackIn_5_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("lc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param2).append(')').toString());
        }
    }

    private final void drawContent(byte param0) {
        boolean discarded$0 = false;
        String var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var12_int = 0;
        int var23 = 0;
        String stackIn_48_0 = null;
        int stackIn_94_0 = 0;
        int stackIn_94_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int[] var11 = null;
        String[] var12 = null;
        int var13_int = 0;
        int[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        Sprite var20 = null;
        int var21 = 0;
        int var22 = 0;
        int var24 = 0;
        int stackIn_94_0Lifetime1;
        int stackIn_94_1Lifetime1;
        var23 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var3 = QuickChatHelpers.field_a + 96;
          var4 = 64 + ValidatedTextWidget.field_I;
          var5 = var4;
          var6 = 512;
          var12_int = SecondaryNodeDequeIterator.field_e;
          if (var12_int != 0) {
            if (var12_int != 1) {
              if (var12_int == 2) {
                var2 = ScreenTransitionHelpers.field_d;
                var3 = var3 + (8 + CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C));
                var7 = var4;
                var9 = 45 + ValidatedTextWidget.field_I;
                var8 = 550;
                var10 = 230 + ValidatedTextWidget.field_I;
                SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                var2 = CredentialParseHelpers.field_e;
                var3 = var3 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                LoginLoadingHelpers.field_g[0].drawTransparent(var4, var3);
                var4 += 40;
                LoginLoadingHelpers.field_g[12].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[14].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[38].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[43].drawHalfSize(var4, var3);
                var3 -= 20;
                var4 += 20;
                LoginLoadingHelpers.field_g[44].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[49].drawHalfSize(var4, var3);
                var3 -= 20;
                var4 += 20;
                LoginLoadingHelpers.field_g[51].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[61].drawHalfSize(var4, var3);
                var3 -= 20;
                var4 += 20;
                LoginLoadingHelpers.field_g[64].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[96].drawHalfSize(var4, var3);
                var3 -= 20;
                var4 += 20;
                LoginLoadingHelpers.field_g[100].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[108].drawHalfSize(var4, var3);
                var4 += 20;
                var3 += 30;
                var2 = EmailValidationHelpers.field_g;
                var4 = var7;
                SpellProjectile.field_B.drawParagraph(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                var2 = ClientException.field_h;
                var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                LoginLoadingHelpers.field_g[1].drawTransparent(var4, var3);
                var4 += 40;
                LoginLoadingHelpers.field_g[8].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[10].drawHalfSize(var4, var3);
                var3 -= 20;
                var4 += 20;
                LoginLoadingHelpers.field_g[19].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[26].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[31].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[34].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[45].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[56].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[132].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[97].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[101].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[115].drawHalfSize(var4, var3);
                var3 -= 20;
                var4 += 20;
                var3 += 50;
                var2 = field_o;
                SpellProjectile.field_B.drawParagraph(var2, var10, var3 - 65, 356, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                var4 = var7;
                SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                var2 = Scrollbar.field_S;
                var3 = var3 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                LoginLoadingHelpers.field_g[7].drawTransparent(var4, var3);
                var4 += 40;
                LoginLoadingHelpers.field_g[20].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[72].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[135].drawHalfSize(var4, var3);
                var3 += 20;
                var3 += 30;
                var2 = LoginMethodHelpers.field_a;
                var4 = var7;
                SpellProjectile.field_B.drawParagraph(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                var2 = MatchingFieldValidator.field_q;
                var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                LoginLoadingHelpers.field_g[3].drawTransparent(var4, var3);
                var4 += 40;
                LoginLoadingHelpers.field_g[13].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[24].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[36].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[98].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                LoginLoadingHelpers.field_g[99].drawHalfSize(var4, var3);
                var3 += 20;
                LoginLoadingHelpers.field_g[114].drawHalfSize(var4, var3);
                var4 += 20;
                var3 -= 20;
                var2 = ConnectionState.field_b;
                var3 += 30;
                var4 = var7;
                SpellProjectile.field_B.drawParagraph(var2, var10, -65 + var3, 356, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
              } else {
                if (3 == var12_int) {
                  var9 = 45 + ValidatedTextWidget.field_I;
                  var10 = ValidatedTextWidget.field_I + 290;
                  var2 = NodeHashTableIterator.field_i;
                  var8 = 550;
                  var7 = var4;
                  var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                  var7 = var4;
                  SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                  var2 = TimeAndInputHelpers.field_b;
                  var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                  LoginLoadingHelpers.field_g[2].drawTransparent(var4, var3);
                  var4 += 40;
                  LoginLoadingHelpers.field_g[15].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[25].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[32].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[33].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[35].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[37].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[53].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[54].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[59].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[65].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[66].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[71].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[76].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[77].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[133].drawHalfSize(var4, var3);
                  var3 += 20;
                  var2 = JaggrabDownloader.field_i;
                  var3 += 30;
                  SpellProjectile.field_B.drawParagraph(var2, var10, var3 - 65, 286, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                  var4 = var7;
                  SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                  var2 = LoadingTracker.field_f;
                  var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                  LoginLoadingHelpers.field_g[4].drawTransparent(var4, var3);
                  var4 += 40;
                  LoginLoadingHelpers.field_g[5].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[9].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[11].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[17].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[21].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[29].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[39].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[41].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[42].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[52].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[55].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[63].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[67].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[68].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[74].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[106].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[109].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[112].drawHalfSize(var4, var3);
                  var3 += 30;
                  var4 += 20;
                  var2 = DisplayNameForm.field_J;
                  var4 = var7;
                  SpellProjectile.field_B.drawParagraph(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                  SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                  var2 = MenuButtonPanel.field_P;
                  var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                  LoginLoadingHelpers.field_g[73].drawTransparent(var4, var3);
                  var4 += 40;
                  LoginLoadingHelpers.field_g[22].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[46].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[48].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[60].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[103].drawHalfSize(var4, var3);
                  var3 += 20;
                  var3 += 30;
                  var2 = IsaacRandom.field_e;
                  SpellProjectile.field_B.drawParagraph(var2, var10, var3 - 65, 286, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                  var4 = var7;
                  SoftwareRasterizer.fillRectangleAlpha(var9, var3, var8, 60, 16777215, 128);
                  SoftwareRasterizer.setClip(0, var3 + 60, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j);
                  SoftwareRasterizer.fillRoundedRectangleBlended(var9, var3, var8, 105, 25, 16777215, 128);
                  SoftwareRasterizer.resetClip();
                  var2 = CapsuleBar.field_L;
                  var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                  LoginLoadingHelpers.field_g[75].drawTransparent(var4, var3);
                  var4 += 40;
                  LoginLoadingHelpers.field_g[6].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[16].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[18].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[23].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[27].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[28].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[30].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[40].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[47].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[50].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[57].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[58].drawHalfSize(var4, var3);
                  var3 -= 20;
                  var4 += 20;
                  LoginLoadingHelpers.field_g[62].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[69].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[70].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[102].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 -= 20;
                  LoginLoadingHelpers.field_g[104].drawHalfSize(var4, var3);
                  var3 += 20;
                  LoginLoadingHelpers.field_g[110].drawHalfSize(var4, var3);
                  var4 += 20;
                  var3 += 30;
                  var2 = SecondaryNodeDeque.field_e;
                  SpellProjectile.field_B.drawParagraph(var2, var10, -65 + var3, 286, 60, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                  var2 = LobbyStateHelpers.field_b;
                  SpellProjectile.field_B.drawParagraph(var2, var5, -5 + var3, var6, 60, 0, -1, 1, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                  var4 = var7;
                } else {
                  if (var12_int == 4) {
                    var2 = IntKeyLookup.field_e;
                    var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                    var4 = 320 + (ValidatedTextWidget.field_I - 80);
                    var3 = -70 + QuickChatHelpers.field_a + 240;
                    SoftwareRasterizer.drawRectangle(-1 + var4, var3 - 1, 162, 122, 0);
                    FlagSumHelpers.field_f[2].drawScaled(var4, -24 + var3, 160, 160);
                    SoftwareRasterizer.drawLine(var4 - 170, var3 + 22, var4 - 10, 22 + var3, 16711680);
                    SoftwareRasterizer.drawLine(var4 + 5, 5 + var3 + 15, -10 + var4, var3 + 22, 16711680);
                    SpellProjectile.field_B.drawText(BattleStartHelpers.field_a, -180 + var4, 20 + var3, 0, 16711680);
                    SoftwareRasterizer.drawRoundedRectangle(var4 + 5, var3 + 5, 50, 30, 6, 16711680);
                    SoftwareRasterizer.fillRoundedRectangleBlended(5 + var4, var3 + 5, 50, 30, 6, 16711680, 64);
                    SoftwareRasterizer.drawLine(-170 + var4, -18 + var3, var4 + 40, -18 + var3, 65280);
                    SoftwareRasterizer.drawLine(10 + (var4 + 70), var3, var4 + 40, var3 - 18, 65280);
                    SpellProjectile.field_B.drawText(ValueListPainter.field_h, var4 - 180, -20 + var3, 0, 65280);
                    SoftwareRasterizer.drawRoundedRectangle(70 + var4, var3, 20, 15, 4, 65280);
                    SoftwareRasterizer.fillRoundedRectangleBlended(70 + var4, var3, 20, 15, 4, 65280, 64);
                    SoftwareRasterizer.drawLine(180 + (160 + var4), var3 + 22, 10 + (160 + var4), var3 + 22, 33023);
                    SoftwareRasterizer.drawLine(var4 + 145 + 10, var3 + 10, 160 + var4 + 10, var3 + 22, 33023);
                    SpellProjectile.field_B.drawRightAlignedText(HuffmanCodec.field_m, 160 + var4 + 180, 20 + var3, 0, 33023);
                    SoftwareRasterizer.drawRoundedRectangle(145 + var4, 5 + var3, 10, 10, 4, 33023);
                    SoftwareRasterizer.fillRoundedRectangleBlended(var4 + 145, 5 + var3, 10, 10, 4, 33023, 64);
                    SoftwareRasterizer.drawLine(-170 + var4, 122 + var3, -10 + var4, 122 + var3, 16711935);
                    SoftwareRasterizer.drawLine(var4 + 5, 7 + (var3 + 105), -10 + var4, var3 + 122, 16711935);
                    SpellProjectile.field_B.drawText(ConditionalTextValue.field_a, var4 - 180, var3 + 120, 0, 16711935);
                    SoftwareRasterizer.drawRoundedRectangle(var4 + 5, var3 + 105, 110, 15, 6, 16711935);
                    SoftwareRasterizer.fillRoundedRectangleBlended(var4 + 5, 105 + var3, 110, 15, 6, 16711935, 64);
                    SoftwareRasterizer.drawLine(180 + var4 + 160, var3 + 102, var4 + 170, 102 + var3, 16776960);
                    SoftwareRasterizer.drawLine(40 + var4 + 125, 7 + (105 + var3), 170 + var4, 102 + var3, 16776960);
                    SpellProjectile.field_B.drawRightAlignedText(LoginResultHelpers.field_b, 180 + (var4 + 160), 100 + var3, 0, 16776960);
                    SoftwareRasterizer.drawRoundedRectangle(125 + var4, var3 + 105, 40, 15, 6, 16776960);
                    SoftwareRasterizer.fillRoundedRectangleBlended(125 + var4, var3 + 105, 40, 15, 6, 16776960, 64);
                    var3 += 140;
                    var2 = QuickChatPhrase.field_m;
                    var4 = ValidatedTextWidget.field_I + 64;
                    var3 = var3 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var4, var3, 512, 128, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                    var2 = SceneTabStrip.field_Kb;
                    var3 += 16;
                    var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var4, var3, 192, 128, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                    var12_int = 0;
                    var13_int = 0;
                    var14 = 0;
                    var15 = 0;
                    var16 = 16;
                    var17 = 0;
                    var18 = -16;
                    var3 = 32;
                    var19 = 0;
                    var4 = 32;
                    var20 = new Sprite(128, 128);
                    var20.makeRasterTarget();
                    SoftwareRasterizer.fillCircle(64, 64, 32, 7829367);
                    QuickChatPhraseCache.fillCircleMasked(32, (byte) 62, 128, 64, 64);
                    TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var17 + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 118, QuickChatCategoryCache.field_d[1], QueuedPacket.field_i[MenuInputState.field_c[3]], var4 + var16);
                    if (MenuInputState.field_c[0] != 46) {
                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3 + var13_int, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -123, QuickChatCategoryCache.field_d[1], GameListHelpers.field_b[0], var4 + var12_int);
                    }
                    TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 109, QuickChatCategoryCache.field_d[1], IsaacRandom.field_j[MenuInputState.field_c[0]], var4);
                    var3 -= 8;
                    var3 -= 16;
                    TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 47, QuickChatCategoryCache.field_d[1], SceneWidget.field_kb[MenuInputState.field_c[1]], var4);
                    var3 += 16;
                    TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -99, QuickChatCategoryCache.field_d[1], JaggrabDownloader.field_d[MenuInputState.field_c[5]], var4);
                    if (MenuInputState.field_c[5] != 53 &&
                      MenuInputState.field_c[5] != 55) {
                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -90, QuickChatCategoryCache.field_d[1], NameErrorHelpers.field_a[0], var4);
                    }
                    var3 -= 16;
                    TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -80, QuickChatCategoryCache.field_d[1], CachedArchiveProvider.field_A[MenuInputState.field_c[4]], var4);
                    var3 += 8;
                    var3 += 16;
                    if (46 != MenuInputState.field_c[0]) {
                      TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3 + var15, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -117, QuickChatCategoryCache.field_d[1], ModalPanelStack.field_I[0], var14 + var4);
                    }
                    TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3 + var19, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 20, QuickChatCategoryCache.field_d[1], DiskCacheRequest.field_u[MenuInputState.field_c[2]], var4 + var18);
                    GameSelectionHelpers.field_m.makeRasterTarget(true);
                    var21 = 320 + ValidatedTextWidget.field_I;
                    var22 = 350 + QuickChatHelpers.field_a;
                    var20.drawHalfSize(var21, var22);
                    SoftwareRasterizer.setClip(var21, 46 + var22, 64 + var21, EmailLoginCredentials.field_j);
                    TextLayout.field_d.draw(var21 - 32, -92 + (10 + var22));
                    SoftwareRasterizer.resetClip();
                    SpellProjectile.field_B.drawCentered("250", var21 + 32, var22 + 8, 16777215, -1);
                  } else {
                    if (var12_int != 5) {
                      if (var12_int == 6) {
                        var2 = NineSliceHelpers.field_a;
                        var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                        var2 = BufferedMessage.field_i;
                        var3 = var3 + ((SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) + 8);
                        var2 = GrowableIntList.field_f;
                        var3 = var3 + (8 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m));
                        var2 = UrlHelpers.field_d;
                        var3 = var3 + (16 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5 + 32, var3, var6 - 64, 480, 16777215, 0, 1, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
                        var2 = GradientPanelPainter.field_a;
                        var3 = var3 + (8 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m));
                      } else {
                        if (var12_int == 7) {
                          var2 = Crc32Helpers.field_d;
                          if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -99)) {
                            var12_int = 74 + ValidatedTextWidget.field_I + CachedArchiveProvider.field_t.textWidth(var2);
                            IconHighlightPainter.field_d.drawScaled(var12_int, -2 + var3, 32, 32);
                            SpellProjectile.field_B.drawText(SceneWidget.field_M, var12_int + 40, (SpellProjectile.field_B.field_C + CachedArchiveProvider.field_t.field_C) / 2 + var3, 16711680, -1);
                          }
                          var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                          var2 = GzipDecoder.field_c;
                          var3 = var3 + (8 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m));
                          var2 = ArrayWidgetContainer.field_F;
                          var3 = var3 + ((SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 6);
                          var11 = new int[]{16711935, 16711680, 16746632, 16776960, 65535, 34816, 16777215, 4521762, 1364125, 16755302};
                          var2 = ClipState.field_q;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                          var2 = CachedArchiveProvider.formatTemplate(-115, new String[]{Integer.toString(var11[1], 16)}, ArchiveRequest.field_s);
                          var3 = var3 + (2 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
                          var2 = LobbyBuilderHelpers.field_a;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                          var2 = CachedArchiveProvider.formatTemplate(-51, new String[]{Integer.toString(var11[2], 16)}, DateHelpers.field_b);
                          var3 = var3 + ((SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 2);
                          var2 = field_p;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                          var2 = CachedArchiveProvider.formatTemplate(-116, new String[]{Integer.toString(var11[3], 16)}, Cp1252Helpers.field_a);
                          var3 = var3 + (2 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
                          var2 = IterableNodeHashTable.field_b;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                          var2 = CachedArchiveProvider.formatTemplate(-47, new String[]{Integer.toString(var11[4], 16)}, TexturedSpriteHelpers.field_a);
                          var3 = var3 + ((SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) + 2);
                          var2 = ScrollContainer.field_M;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                          var2 = CachedArchiveProvider.formatTemplate(-120, new String[]{Integer.toString(var11[5], 16)}, NodeHashTable.field_b);
                          var3 = var3 + ((SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 2);
                          var2 = QueuedResponse.field_l;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                          var2 = CachedArchiveProvider.formatTemplate(122, new String[]{Integer.toString(var11[6], 16)}, SocketConnector.field_f);
                          var3 = var3 + ((SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 2);
                          var2 = CanvasRasterBuffer.field_f;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                          var2 = CachedArchiveProvider.formatTemplate(-71, new String[]{Integer.toString(var11[7], 16)}, DateHelpers.field_e);
                          var3 = var3 + ((SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) + 2);
                          var2 = MusicPatch.field_i;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                          var2 = CachedArchiveProvider.formatTemplate(113, new String[]{Integer.toString(var11[8], 16)}, MessageCaptionGlobals.field_i);
                          var3 = var3 + ((SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 2);
                          var2 = EffectVolumeHelpers.field_e;
                          SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 2, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                          var2 = CachedArchiveProvider.formatTemplate(-33, new String[]{Integer.toString(var11[9], 16)}, StatusDialog.field_Rb);
                          var3 = var3 + (6 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
                          var2 = IntrusiveDeque.field_a;
                          var3 = var3 + (8 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
                        } else {
                          if (var12_int == 8) {
                            var2 = EmailLoginCredentials.field_m;
                            var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                            this.drawPlayerTile(var3, var4, (byte) -102, 3);
                            var2 = PlayerActionMenu.field_j;
                            SpellProjectile.field_B.drawParagraph(var2, 320 + ValidatedTextWidget.field_I, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                            var2 = LobbyGameEntry.field_Tb;
                            var3 += 128;
                            var3 = var3 + (8 + CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C));
                            this.drawPlayerTile(var3, var4, (byte) -77, 0);
                            var2 = OptionsDialog.field_pb;
                            SpellProjectile.field_B.drawParagraph(var2, ValidatedTextWidget.field_I + 320, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                            LoginLoadingHelpers.field_g[5].drawTransparent(var4, var3 + 80);
                          } else {
                            if (var12_int != 9) {
                              if (var12_int == 10) {
                                var2 = QuickChatCategory.field_q;
                                var3 = var3 + (8 + CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C));
                                this.drawPlayerTile(var3, var4, (byte) -47, 4);
                                var2 = ValidationHelpWidget.field_S;
                                SpellProjectile.field_B.drawParagraph(var2, 320 + ValidatedTextWidget.field_I, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                                LoginLoadingHelpers.field_g[29].drawTransparent(var4, 120 + (-40 + var3));
                                var2 = SingleChildContainer.field_A;
                                var3 += 128;
                                var3 = var3 + (8 + CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C));
                                this.drawPlayerTile(var3, var4, (byte) -86, 5);
                                var2 = GameDetailsRenderer.field_d;
                                SpellProjectile.field_B.drawParagraph(var2, 320 + ValidatedTextWidget.field_I, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                                LoginLoadingHelpers.field_g[55].drawTransparent(var4, 80 + var3);
                              } else {
                                if (var12_int == 11) {
                                  var2 = MusicVolumeHelpers.field_c;
                                  var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                                  this.drawPlayerTile(var3, var4, (byte) -36, 6);
                                  var2 = TimeAndInputHelpers.field_f;
                                  SpellProjectile.field_B.drawParagraph(var2, 320 + ValidatedTextWidget.field_I, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
                                  LoginLoadingHelpers.field_g[67].drawTransparent(var4, var3 + 80);
                                  var3 += 128;
                                  var2 = ThrowableFormatHelpers.field_c;
                                  var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                                  this.drawPlayerTile(var3, var4, (byte) -42, 7);
                                  var2 = ClipState.field_l;
                                  SpellProjectile.field_B.drawParagraph(var2, 320 + ValidatedTextWidget.field_I, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                                  LoginLoadingHelpers.field_g[85].drawTransparent(var4, 120 + (-40 + var3));
                                } else {
                                  if (12 == var12_int) {
                                    var2 = AgeValidator.field_t;
                                    var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                                    var2 = LobbyLayoutHelpers.field_b;
                                    var12 = new String[50];
                                    var13 = new int[]{480};
                                    var14 = SpellProjectile.field_B.wrapText(var2, var13, var12);
                                    var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                                    var24 = 0;
                                    var15 = var24;
                                    while (var14 > var24) {
                                      SpellProjectile.field_B.drawText(var12[var24], var4, var3, 0, -1);
                                      stackIn_94_0 = var12[var24].length();
                                      stackIn_94_1 = 2;
                                      if (stackIn_94_0 > stackIn_94_1 &&
                                        45 == var12[var24].charAt(1)) {
                                        ScreenSwitchHelpers.field_f[0].draw(-2 + var4, -12 + var3);
                                      }
                                      var3 = var3 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                                      var24++;
                                    }
                                  }
                                }
                              }
                            } else {
                              var2 = GradientBarButton.field_J;
                              var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                              this.drawPlayerTile(var3, var4, (byte) -49, 1);
                              var2 = AccountFlowHelpers.field_e;
                              SpellProjectile.field_B.drawParagraph(var2, ValidatedTextWidget.field_I + 320, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                              LoginLoadingHelpers.field_g[17].drawTransparent(var4, var3 + 80);
                              var2 = JaggrabDownloader.field_o;
                              var3 += 128;
                              var3 = var3 + (8 + CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C));
                              this.drawPlayerTile(var3, var4, (byte) -71, 2);
                              var2 = SceneScrollPane.field_Bb;
                              SpellProjectile.field_B.drawParagraph(var2, ValidatedTextWidget.field_I + 320, var3, 256, 120, 0, -1, 0, 1, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
                              LoginLoadingHelpers.field_g[42].drawTransparent(var4, 80 + var3);
                            }
                          }
                        }
                      }
                    } else {
                      var2 = ChatPanel.field_h;
                      if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -92)) {
                        var12_int = ValidatedTextWidget.field_I + (74 + CachedArchiveProvider.field_t.textWidth(var2));
                        IconHighlightPainter.field_d.drawScaled(var12_int, -2 + var3, 32, 32);
                        SpellProjectile.field_B.drawText(QuickChatPhrase.field_o, 40 + var12_int, var3 + (CachedArchiveProvider.field_t.field_C + SpellProjectile.field_B.field_C) / 2, 16711680, -1);
                      }
                      var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
                      var2 = NameCheckRequest.field_b;
                      var3 = var3 + ((SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 8);
                      var2 = MouseWheelHandler.field_a;
                      var3 = var3 + ((SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, 32 + var5, var3, 448, 480, 16777215, 0, 1, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) + 16);
                      var3 += 24;
                      var4 += 320;
                      var3 += 16;
                      SoftwareRasterizer.setClip(0, var3, EmailLoginCredentials.field_f, EmailLoginCredentials.field_j);
                      PendingTask.field_g.drawTransparent(ValidatedTextWidget.field_I + 43, var3 - 32);
                      PendingTask.field_g.drawTransparent(106 + ValidatedTextWidget.field_I, -32 + var3);
                      SoftwareRasterizer.resetClip();
                      DualLinkDeque.field_b[7].draw(var4, -2 + var3);
                      SpellProjectile.field_B.drawText("= 1" + SingleChildContainer.field_x, 20 + var4, 20 + var3, 16776960, 0);
                      DualLinkDeque.field_b[8].draw(var4 + 100, -2 + var3);
                      SpellProjectile.field_B.drawText("= 5" + CanvasRasterBuffer.field_g, 20 + var4 + 100, var3 + 20, 16776960, 0);
                      var2 = EmailLoginCredentials.field_n;
                      var4 -= 320;
                      var2 = CachedArchiveProvider.formatTemplate(127, new String[]{KeyboardInputHandler.field_l}, var2);
                      var3 -= 48;
                      var3 = var3 + (16 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 312, 480, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
                      var3 += 48;
                      var3 += 24;
                      var2 = MessageCaptionGlobals.field_j;
                      var3 -= 32;
                      WhirlpoolHasher.field_o[9].drawHalfSize(64 + ValidatedTextWidget.field_I, var3);
                      WhirlpoolHasher.field_o[2].drawHalfSize(ValidatedTextWidget.field_I + 64, var3);
                      QuickChatPhrase.field_x[4].drawHalfSize(56 + ValidatedTextWidget.field_I, var3);
                      var3 += 16;
                      var3 = var3 + ((SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, 136 + ValidatedTextWidget.field_I, var3, 440, EmailLoginCredentials.field_j, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) + 16);
                    }
                  }
                }
              }
            } else {
              var2 = BitAndSpriteHelpers.field_g;
              var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
              var2 = FlagSumHelpers.field_e;
              var3 = var3 + (16 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, 512, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
              var2 = UiComponent.field_l;
              var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
              var2 = AngleHelpers.field_b;
              var2 = CachedArchiveProvider.formatTemplate(118, new String[]{GameListHelpers.field_g[84], GameListHelpers.field_g[85], GameListHelpers.field_g[82], GameListHelpers.field_g[81]}, var2);
              var3 = var3 + (16 + (SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C));
              var2 = CredentialKind.field_e;
              var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 8);
              var2 = RawDataNode.field_p;
              var2 = CachedArchiveProvider.formatTemplate(124, new String[]{GameListHelpers.field_g[69], GameListHelpers.field_g[LobbyLayoutHelpers.field_f]}, var2);
              var3 = var3 + (32 + (SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m));
            }
          } else {
            var2 = PaddedContainer.field_J;
            var3 = var3 + (CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C) + 16);
            var2 = NameCheckHelpers.field_j;
            var3 = var3 + ((SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 16);
            var2 = GameApplet.field_u;
            var3 = var3 + (16 + CachedArchiveProvider.field_t.field_C * CachedArchiveProvider.field_t.drawParagraph(var2, var5, var3, var6, 352, 16777215, 0, 0, 0, CachedArchiveProvider.field_t.field_C));
            if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -121)) {
              stackIn_48_0 = GameListSortHelpers.field_d;
            } else {
              stackIn_48_0 = BirthDateEntryPanel.field_J;
            }
            var2 = stackIn_48_0;
            var2 = CachedArchiveProvider.formatTemplate(119, new String[]{StatusDialog.field_Lb, KeyboardInputHandler.field_l}, var2);
            var3 = var3 + ((SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 16);
            var2 = CookieHelpers.field_c;
            var3 = var3 + ((SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) * SpellProjectile.field_B.drawParagraph(var2, var5, var3, var6, 352, 0, -1, 0, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C) + 32);
          }
          stackIn_94_0Lifetime1 = param0;
          stackIn_94_1Lifetime1 = 71;
          if (stackIn_94_0Lifetime1 < stackIn_94_1Lifetime1) {
            discarded$0 = this.isItemUnlocked(-45, -88);
          }
          CachedArchiveProvider.field_t.drawRightAlignedText(Bzip2State.formatPageNumber(SecondaryNodeDequeIterator.field_e, (byte) 69), 590 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 112, 0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "lc.GA(" + param0 + ')');
        }
    }

    final static void setScreenSize(int param0, int param1, boolean param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (param2) {
            MenuScreen.releaseStatics(true);
          }
          SoundCache.field_c = param1;
          EffectVolumeHelpers.field_c = param0;
          if (null != EmailValidationHelpers.field_e) {
            EmailValidationHelpers.field_e.recentrePanels(-120, param1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.S(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final void activateItem(boolean param0, int param1, byte param2) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        try {
          if (this.field_g.field_h != -1) {
            param1 = this.field_g.field_h;
          }
          if (this.field_l == 10) {
            param1 = 1;
          }
          this.field_g.reset(param0, param1, false, this.hitTestItem((byte) 88, EmailLoginCredentials.field_g, MenuButtonPanel.field_I));
          LabeledField.field_K = -1;
          if (param2 >= -113) {
            field_r = (String) null;
          }
          PasswordCheckHelpers.field_g = -1;
          LoginMethodHelpers.field_e = SpriteState.field_v;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "lc.AA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void drawAnimatedScreen(int param0) {
        boolean discarded$0 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$3 = false;
        boolean discarded$4 = false;
        boolean discarded$5 = false;
        boolean discarded$6 = false;
        boolean discarded$7 = false;
        boolean discarded$8 = false;
        boolean discarded$9 = false;
        boolean discarded$10 = false;
        Object stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        Object stackIn_7_0 = null;
        int stackIn_7_1 = 0;
        int stackIn_10_0 = 0;
        int stackIn_39_0 = 0;
        int stackIn_39_1 = 0;
        int stackIn_51_0 = 0;
        int stackIn_51_1 = 0;
        int stackIn_205_0 = 0;
        int stackIn_205_1 = 0;
        int stackIn_209_0 = 0;
        int stackIn_209_1 = 0;
        int stackIn_621_0 = 0;
        int stackIn_728_0 = 0;
        int stackIn_728_1 = 0;
        int stackIn_732_0 = 0;
        int stackIn_732_1 = 0;
        int stackIn_781_0 = 0;
        int stackIn_781_1 = 0;
        int stackIn_785_0 = 0;
        int stackIn_785_1 = 0;
        int stackIn_839_0 = 0;
        int stackIn_839_1 = 0;
        int stackIn_843_0 = 0;
        int stackIn_843_1 = 0;
        int stackIn_862_0 = 0;
        int stackIn_862_1 = 0;
        int stackIn_866_0 = 0;
        int stackIn_866_1 = 0;
        int statePc = 0;
        Throwable caughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4_int = 0;
        Object var4 = null;
        int var5 = 0;
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
        Object var16_ref = null;
        int var16 = 0;
        int var17_int = 0;
        int[] var17 = null;
        int var18_int = 0;
        Object var18 = null;
        int var19 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        int var32 = 0;
        int[] var33 = null;
        int[] var34 = null;
        scanLoop1: while (true) {
            switch (statePc) {
                case 0: {
                    var32 = ArcanistsMulti.field_G ? 1 : 0;
                    statePc = 1;
                    continue scanLoop1;
                }
                case 1: {
                    try {
                        this.drawBottomPanel(-26733);
                        this.field_m = -1;
                        var3 = 142;
                        var4_int = 0;
                        statePc = 2;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_1) {
                        statePc = ((Object) stateCaught_1 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_1);
                        }
                        caughtException = stateCaught_1;
                        continue scanLoop1;
                    }
                }
                case 2: {
                    try {
                        if (var4_int >= 7) {
                            /* Inlined CFG state: 18. */
                            {
                                var4 = null;
                                if (0 != this.field_h) {
                                    statePc = 20;
                                } else {
                                    statePc = 19;
                                }
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 3. */
                            {
                                stackIn_6_0 = this;
                                stackIn_4_0 = stackIn_6_0;
                                if (this.field_h != var4_int) {
                                    /* Inlined CFG state: 6. */
                                    {
                                        stackIn_7_0 = this;
                                        stackIn_7_1 = 0;
                                        statePc = 7;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 4. */
                                    {
                                        stackIn_7_0 = this;
                                        stackIn_7_1 = 1;
                                        statePc = 7;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_2) {
                        statePc = ((Object) stateCaught_2 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_2);
                        }
                        caughtException = stateCaught_2;
                        continue scanLoop1;
                    }
                }
                case 7: {
                    try {
                        if (!this.drawButtonBox(stackIn_7_1 != 0, 65, (byte) -127, true, 32 + (ValidatedTextWidget.field_I + 86 * var4_int), 65, QuickChatHelpers.field_a + 104)) {
                            /* Inlined CFG state: 9. */
                            {
                                stackIn_10_0 = 0;
                                statePc = 10;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 8. */
                            {
                                stackIn_10_0 = 1;
                                statePc = 10;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_7) {
                        statePc = ((Object) stateCaught_7 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_7);
                        }
                        caughtException = stateCaught_7;
                        continue scanLoop1;
                    }
                }
                case 10: {
                    try {
                        var5 = stackIn_10_0;
                        QuickChatInputHelpers.field_a[var4_int].drawTransparent(86 * var4_int + (32 + ValidatedTextWidget.field_I), 104 + QuickChatHelpers.field_a);
                        if (var5 == 0) {
                            statePc = 17;
                        } else {
                            statePc = 11;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_10) {
                        statePc = ((Object) stateCaught_10 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_10);
                        }
                        caughtException = stateCaught_10;
                        continue scanLoop1;
                    }
                }
                case 11: {
                    try {
                        if (var4_int == 6) {
                            /* Inlined CFG state: 16. */
                            {
                                this.field_m = 7;
                                var6 = -128 + (var4_int * 86 + 32 + ValidatedTextWidget.field_I);
                                var7 = 103 + (QuickChatHelpers.field_a - 16);
                                SpellProjectile.field_B.drawParagraph(NameCheckHelpers.field_l, var6, var7 - 1, 192, 192, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                SpellProjectile.field_B.drawParagraph(NameCheckHelpers.field_l, var6 - 1, var7, 192, 192, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                SpellProjectile.field_B.drawParagraph(NameCheckHelpers.field_l, 1 + var6, var7, 192, 192, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                SpellProjectile.field_B.drawParagraph(NameCheckHelpers.field_l, var6, 1 + var7, 192, 192, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                SpellProjectile.field_B.drawParagraph(NameCheckHelpers.field_l, var6, var7, 192, 192, 16777215, 0, 1, 0, SpellProjectile.field_B.field_C);
                                statePc = 17;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 12. */
                            {
                                /* Sequential CFG blocks: 12, 14. */
                                {
                                }
                                {
                                    this.field_i = var4_int;
                                    this.field_m = 1;
                                    statePc = 17;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_11) {
                        statePc = ((Object) stateCaught_11 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_11);
                        }
                        caughtException = stateCaught_11;
                        continue scanLoop1;
                    }
                }
                case 17: {
                    try {
                        var4_int++;
                        statePc = 2;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_17) {
                        statePc = ((Object) stateCaught_17 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_17);
                        }
                        caughtException = stateCaught_17;
                        continue scanLoop1;
                    }
                }
                case 19: {
                    try {
                        var4 = IsaacRandom.field_j;
                        statePc = 20;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_19) {
                        statePc = ((Object) stateCaught_19 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_19);
                        }
                        caughtException = stateCaught_19;
                        continue scanLoop1;
                    }
                }
                case 20: {
                    try {
                        if (this.field_h != 1) {
                            statePc = 22;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 21. */
                            {
                                var4 = SceneWidget.field_kb;
                                statePc = 22;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_20) {
                        statePc = ((Object) stateCaught_20 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_20);
                        }
                        caughtException = stateCaught_20;
                        continue scanLoop1;
                    }
                }
                case 22: {
                    try {
                        if (2 == this.field_h) {
                            /* Inlined CFG state: 25. */
                            {
                                var4 = DiskCacheRequest.field_u;
                                statePc = 26;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 23. */
                            {
                                statePc = 26;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_22) {
                        statePc = ((Object) stateCaught_22 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_22);
                        }
                        caughtException = stateCaught_22;
                        continue scanLoop1;
                    }
                }
                case 26: {
                    try {
                        if (this.field_h == 3) {
                            /* Inlined CFG state: 29. */
                            {
                                var4 = QueuedPacket.field_i;
                                statePc = 30;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 27. */
                            {
                                statePc = 30;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_26) {
                        statePc = ((Object) stateCaught_26 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_26);
                        }
                        caughtException = stateCaught_26;
                        continue scanLoop1;
                    }
                }
                case 30: {
                    try {
                        if (this.field_h != 4) {
                            statePc = 32;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 31. */
                            {
                                var4 = CachedArchiveProvider.field_A;
                                statePc = 32;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_30) {
                        statePc = ((Object) stateCaught_30 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_30);
                        }
                        caughtException = stateCaught_30;
                        continue scanLoop1;
                    }
                }
                case 32: {
                    try {
                        if (this.field_h == 5) {
                            /* Inlined CFG state: 35. */
                            {
                                var4 = JaggrabDownloader.field_d;
                                statePc = 36;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 33. */
                            {
                                statePc = 36;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_32) {
                        statePc = ((Object) stateCaught_32 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_32);
                        }
                        caughtException = stateCaught_32;
                        continue scanLoop1;
                    }
                }
                case 36: {
                    try {
                        discarded$0 = this.drawButtonBox(true, 180, (byte) -106, false, ValidatedTextWidget.field_I + 32, 114, 182 + QuickChatHelpers.field_a);
                        var3 = 210 + QuickChatHelpers.field_a;
                        var2_int = ValidatedTextWidget.field_I + 90;
                        var13 = -1;
                        var14 = 0;
                        statePc = 37;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_36) {
                        statePc = ((Object) stateCaught_36 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_36);
                        }
                        caughtException = stateCaught_36;
                        continue scanLoop1;
                    }
                }
                case 37: {
                    try {
                        if (4 < var14) {
                            /* Inlined CFG state: 50. */
                            {
                                stackIn_51_0 = var13;
                                stackIn_51_1 = -1;
                                statePc = 51;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 38. */
                            {
                                stackIn_51_0 = 12;
                                stackIn_39_0 = stackIn_51_0;
                                stackIn_51_1 = ThrowableFormatHelpers.field_f[var14];
                                stackIn_39_1 = stackIn_51_1;
                                if (false) {
                                    statePc = 51;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 39. */
                                    {
                                        if (stackIn_39_0 > stackIn_39_1) {
                                            statePc = 49;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 40. */
                                            {
                                                /* Sequential CFG blocks: 40, 42. */
                                                {
                                                }
                                                {
                                                    if (0 != ThrowableFormatHelpers.field_f[var14] % 12) {
                                                        statePc = 49;
                                                        continue scanLoop1;
                                                    } else {
                                                        /* Inlined CFG state: 43. */
                                                        {
                                                            /* Sequential CFG blocks: 43, 45. */
                                                            {
                                                            }
                                                            {
                                                                if (ThrowableFormatHelpers.field_f[11 + var14] != 11 + ThrowableFormatHelpers.field_f[var14]) {
                                                                    statePc = 49;
                                                                } else {
                                                                    statePc = 46;
                                                                }
                                                                continue scanLoop1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_37) {
                        statePc = ((Object) stateCaught_37 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_37);
                        }
                        caughtException = stateCaught_37;
                        continue scanLoop1;
                    }
                }
                case 46: {
                    try {
                        /* Sequential CFG blocks: 46, 48. */
                        {
                        }
                        {
                            var13 = ThrowableFormatHelpers.field_f[var14] / 12 - 1;
                            statePc = 49;
                            continue scanLoop1;
                        }
                    } catch (Throwable stateCaught_46) {
                        statePc = ((Object) stateCaught_46 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_46);
                        }
                        caughtException = stateCaught_46;
                        continue scanLoop1;
                    }
                }
                case 49: {
                    try {
                        var14++;
                        statePc = 37;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_49) {
                        statePc = ((Object) stateCaught_49 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_49);
                        }
                        caughtException = stateCaught_49;
                        continue scanLoop1;
                    }
                }
                case 51: {
                    try {
                        if ((stackIn_51_0 ^ stackIn_51_1) == 0) {
                            statePc = 112;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 52. */
                            {
                                var2_int -= 40;
                                var14 = 0;
                                var15 = 0;
                                var16_ref = null;
                                if (0 == var13) {
                                    statePc = 55;
                                } else {
                                    statePc = 53;
                                }
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_51) {
                        statePc = ((Object) stateCaught_51 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_51);
                        }
                        caughtException = stateCaught_51;
                        continue scanLoop1;
                    }
                }
                case 53: {
                    try {
                        statePc = 56;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_53) {
                        statePc = ((Object) stateCaught_53 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_53);
                        }
                        caughtException = stateCaught_53;
                        continue scanLoop1;
                    }
                }
                case 55: {
                    try {
                        var15 = 1;
                        var16_ref = ScreenTransitionHelpers.field_c;
                        var14 = 1;
                        statePc = 56;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_55) {
                        statePc = ((Object) stateCaught_55 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_55);
                        }
                        caughtException = stateCaught_55;
                        continue scanLoop1;
                    }
                }
                case 56: {
                    try {
                        if (var13 == 1) {
                            /* Inlined CFG state: 59. */
                            {
                                var16_ref = DualLinkNode.field_j;
                                statePc = 60;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 57. */
                            {
                                statePc = 60;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_56) {
                        statePc = ((Object) stateCaught_56 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_56);
                        }
                        caughtException = stateCaught_56;
                        continue scanLoop1;
                    }
                }
                case 60: {
                    try {
                        if (var13 != 2) {
                            statePc = 62;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 61. */
                            {
                                var16_ref = SceneTabbedPanel.field_Pb;
                                var15 = 1;
                                var14 = 1;
                                statePc = 62;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_60) {
                        statePc = ((Object) stateCaught_60 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_60);
                        }
                        caughtException = stateCaught_60;
                        continue scanLoop1;
                    }
                }
                case 62: {
                    try {
                        if (var13 != 3) {
                            statePc = 64;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 63. */
                            {
                                var16_ref = MessageCaptionGlobals.field_g;
                                statePc = 64;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_62) {
                        statePc = ((Object) stateCaught_62 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_62);
                        }
                        caughtException = stateCaught_62;
                        continue scanLoop1;
                    }
                }
                case 64: {
                    try {
                        if (var13 == 4) {
                            /* Inlined CFG state: 67. */
                            {
                                var16_ref = SpriteDecodeHelpers.field_e;
                                var14 = 1;
                                statePc = 68;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 65. */
                            {
                                statePc = 68;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_64) {
                        statePc = ((Object) stateCaught_64 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_64);
                        }
                        caughtException = stateCaught_64;
                        continue scanLoop1;
                    }
                }
                case 68: {
                    try {
                        if (5 != var13) {
                            statePc = 70;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 69. */
                            {
                                var14 = 1;
                                var15 = 1;
                                var16_ref = KeyboardInputHandler.field_h;
                                statePc = 70;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_68) {
                        statePc = ((Object) stateCaught_68 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_68);
                        }
                        caughtException = stateCaught_68;
                        continue scanLoop1;
                    }
                }
                case 70: {
                    try {
                        if (var13 == 6) {
                            /* Inlined CFG state: 73. */
                            {
                                var16_ref = LoadingTracker.field_k;
                                var14 = 1;
                                statePc = 74;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 71. */
                            {
                                statePc = 74;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_70) {
                        statePc = ((Object) stateCaught_70 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_70);
                        }
                        caughtException = stateCaught_70;
                        continue scanLoop1;
                    }
                }
                case 74: {
                    try {
                        if (7 == var13) {
                            /* Inlined CFG state: 77. */
                            {
                                var16_ref = PackedShortHelpers.field_a;
                                statePc = 78;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 75. */
                            {
                                statePc = 78;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_74) {
                        statePc = ((Object) stateCaught_74 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_74);
                        }
                        caughtException = stateCaught_74;
                        continue scanLoop1;
                    }
                }
                case 78: {
                    try {
                        if (var13 != 8) {
                            statePc = 80;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 79. */
                            {
                                var15 = 1;
                                var14 = 1;
                                var16_ref = LobbyRequestHelpers.field_a;
                                statePc = 80;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_78) {
                        statePc = ((Object) stateCaught_78 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_78);
                        }
                        caughtException = stateCaught_78;
                        continue scanLoop1;
                    }
                }
                case 80: {
                    try {
                        if (var14 != 0) {
                            /* Inlined CFG state: 98. */
                            {
                                if (var15 == 0) {
                                    /* Inlined CFG state: 106. */
                                    {
                                        var17_int = -12;
                                        statePc = 107;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 99. */
                                    {
                                        /* Sequential CFG blocks: 99, 101. */
                                        {
                                        }
                                        {
                                            var17_int = -8;
                                            statePc = 102;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 81. */
                            {
                                var17_int = var2_int;
                                var18_int = var3;
                                var19 = 0;
                                var20 = 0;
                                var21 = 0;
                                var22 = 0;
                                var23 = 0;
                                var24 = 0;
                                var25 = 0;
                                var26 = 0;
                                var27 = (int)(8.0 * Math.cos(this.field_f * 2.0));
                                var28 = (int)(Math.sin(2.0 * this.field_f) * 8.0);
                                if (var27 <= 0) {
                                    statePc = 83;
                                } else {
                                    statePc = 82;
                                }
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_80) {
                        statePc = ((Object) stateCaught_80 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_80);
                        }
                        caughtException = stateCaught_80;
                        continue scanLoop1;
                    }
                }
                case 82: {
                    try {
                        var22 = -var27;
                        statePc = 84;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_82) {
                        statePc = ((Object) stateCaught_82 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_82);
                        }
                        caughtException = stateCaught_82;
                        continue scanLoop1;
                    }
                }
                case 83: {
                    try {
                        var22 = 0;
                        statePc = 84;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_83) {
                        statePc = ((Object) stateCaught_83 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_83);
                        }
                        caughtException = stateCaught_83;
                        continue scanLoop1;
                    }
                }
                case 84: {
                    try {
                        var21 = var28;
                        if (var27 < 0) {
                            /* Inlined CFG state: 86. */
                            {
                                var26 = var27;
                                statePc = 87;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 85. */
                            {
                                var26 = 0;
                                statePc = 87;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_84) {
                        statePc = ((Object) stateCaught_84 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_84);
                        }
                        caughtException = stateCaught_84;
                        continue scanLoop1;
                    }
                }
                case 87: {
                    try {
                        var25 = -var28;
                        var24 = -(var28 >> 2);
                        var26 += 2;
                        var23 = -6 - (var27 >> 1);
                        var20 = var28 >> 2;
                        var19 = 6 + (var27 >> 1);
                        var22 -= 2;
                        var29 = 0;
                        if (var15 == 0) {
                            statePc = 93;
                        } else {
                            statePc = 88;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_87) {
                        statePc = ((Object) stateCaught_87 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_87);
                        }
                        caughtException = stateCaught_87;
                        continue scanLoop1;
                    }
                }
                case 88: {
                    try {
                        var30 = -5;
                        statePc = 89;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_88) {
                        statePc = ((Object) stateCaught_88 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_88);
                        }
                        caughtException = stateCaught_88;
                        continue scanLoop1;
                    }
                }
                case 89: {
                    try {
                        if (5 < var30) {
                            /* Inlined CFG state: 92. */
                            {
                                var29 = var29 + ((int)(4.0 * Math.sin(this.field_f)) + 32);
                                statePc = 97;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 90. */
                            {
                                var31 = (int)(2.0 * Math.sqrt((double)(-(var30 * var30) + 25)));
                                SoftwareRasterizer.drawHorizontalLineAlpha(-var31 + (var2_int + 32), var30 + (var3 + 64), var31 * 2, 0, 128);
                                var30++;
                                statePc = 89;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_89) {
                        statePc = ((Object) stateCaught_89 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_89);
                        }
                        caughtException = stateCaught_89;
                        continue scanLoop1;
                    }
                }
                case 93: {
                    try {
                        var30 = -8;
                        statePc = 94;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_93) {
                        statePc = ((Object) stateCaught_93 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_93);
                        }
                        caughtException = stateCaught_93;
                        continue scanLoop1;
                    }
                }
                case 94: {
                    try {
                        if (var30 > 8) {
                            statePc = 97;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 95. */
                            {
                                var31 = (int)(Math.sqrt((double)(-(var30 * var30) + 64)) * 2.0);
                                SoftwareRasterizer.drawHorizontalLineAlpha(32 + (var2_int - var31), 64 + var3 + var30, var31 * 2, 0, 128);
                                var30++;
                                statePc = 94;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_94) {
                        statePc = ((Object) stateCaught_94 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_94);
                        }
                        caughtException = stateCaught_94;
                        continue scanLoop1;
                    }
                }
                case 97: {
                    try {
                        var2_int += 20;
                        var3 += 40;
                        var3 = var3 - var29;
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var20 + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -82, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[5]), var19 + var2_int);
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3 + var22, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -105, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[4]), var21 + var2_int);
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 75, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[3]), var2_int);
                        var3 -= 3;
                        var3 -= 6;
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -77, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[2]), var2_int);
                        var3 += 6;
                        var3 -= 6;
                        var3 += 3;
                        var3 += 6;
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var26 + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 51, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[1]), var2_int + var25);
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var24 + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 37, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[0]), var23 + var2_int);
                        var2_int = var17_int;
                        var3 = var18_int;
                        statePc = 111;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_97) {
                        statePc = ((Object) stateCaught_97 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_97);
                        }
                        caughtException = stateCaught_97;
                        continue scanLoop1;
                    }
                }
                case 102: {
                    try {
                        if (var17_int > 8) {
                            /* Inlined CFG state: 105. */
                            {
                                var17_int = MessageCaptionGlobals.field_k / 10 % java.lang.reflect.Array.getLength(var16_ref);
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3 - ((Sprite) (((Object[]) (var16_ref))[var17_int])).field_w - (-32 + (int)(Math.sin(this.field_f) * 4.0)), QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 100, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((Sprite) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2_int));
                                statePc = 111;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 103. */
                            {
                                var18_int = (int)(2.0 * Math.sqrt((double)(64 - var17_int * var17_int)));
                                SoftwareRasterizer.drawHorizontalLineAlpha(32 + (var2_int - var18_int), 64 + (var17_int + var3), var18_int * 2, 0, 128);
                                var17_int++;
                                statePc = 102;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_102) {
                        statePc = ((Object) stateCaught_102 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_102);
                        }
                        caughtException = stateCaught_102;
                        continue scanLoop1;
                    }
                }
                case 107: {
                    try {
                        if (var17_int > 12) {
                            /* Inlined CFG state: 110. */
                            {
                                var17_int = MessageCaptionGlobals.field_k / 10 % java.lang.reflect.Array.getLength(var16_ref);
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], 64 - ((Sprite) (((Object[]) (var16_ref))[var17_int])).field_w + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 117, QuickChatCategoryCache.field_d[1], (Sprite) (((Object[]) (var16_ref))[var17_int]), 32 + (-(((Sprite) (((Object[]) (var16_ref))[var17_int])).field_n / 2) + var2_int));
                                statePc = 111;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 108. */
                            {
                                var18_int = (int)(Math.sqrt((double)(144 - var17_int * var17_int)) * 2.0);
                                SoftwareRasterizer.drawHorizontalLineAlpha(-var18_int + (var2_int + 32), var3 + var17_int + 64, 2 * var18_int, 0, 128);
                                var17_int++;
                                statePc = 107;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_107) {
                        statePc = ((Object) stateCaught_107 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_107);
                        }
                        caughtException = stateCaught_107;
                        continue scanLoop1;
                    }
                }
                case 111: {
                    try {
                        var2_int += 64;
                        statePc = 112;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_111) {
                        statePc = ((Object) stateCaught_111 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_111);
                        }
                        caughtException = stateCaught_111;
                        continue scanLoop1;
                    }
                }
                case 112: {
                    try {
                        var14 = -16;
                        statePc = 113;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_112) {
                        statePc = ((Object) stateCaught_112 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_112);
                        }
                        caughtException = stateCaught_112;
                        continue scanLoop1;
                    }
                }
                case 113: {
                    try {
                        if (var14 > 16) {
                            /* Inlined CFG state: 116. */
                            {
                                if (!(6.28 < this.field_f)) {
                                    statePc = 119;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 117. */
                                    {
                                        this.field_f = this.field_f - 6.28;
                                        statePc = 119;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 114. */
                            {
                                var15 = (int)(Math.sqrt((double)(256 - var14 * var14)) * 2.0);
                                SoftwareRasterizer.drawHorizontalLineAlpha(-var15 + (var2_int + 32), 64 + (var14 + var3), var15 * 2, 0, 128);
                                var14++;
                                statePc = 113;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_113) {
                        statePc = ((Object) stateCaught_113 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_113);
                        }
                        caughtException = stateCaught_113;
                        continue scanLoop1;
                    }
                }
                case 119: {
                    try {
                        if (!(0.0 > this.field_f)) {
                            statePc = 122;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 120. */
                            {
                                this.field_f = this.field_f + 6.28;
                                statePc = 122;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_119) {
                        statePc = ((Object) stateCaught_119 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_119);
                        }
                        caughtException = stateCaught_119;
                        continue scanLoop1;
                    }
                }
                case 122: {
                    try {
                        var14 = (int)(Math.cos(this.field_f) * 16.0);
                        var15 = (int)(16.0 * Math.sin(this.field_f));
                        var5 = -var15;
                        var6 = var15;
                        if (var14 <= 0) {
                            /* Inlined CFG state: 124. */
                            {
                                var8 = 0;
                                statePc = 125;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 123. */
                            {
                                var8 = -var14;
                                statePc = 125;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_122) {
                        statePc = ((Object) stateCaught_122 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_122);
                        }
                        caughtException = stateCaught_122;
                        continue scanLoop1;
                    }
                }
                case 125: {
                    try {
                        if (var14 < 0) {
                            /* Inlined CFG state: 127. */
                            {
                                var7 = var14;
                                statePc = 128;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 126. */
                            {
                                var7 = 0;
                                statePc = 128;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_125) {
                        statePc = ((Object) stateCaught_125 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_125);
                        }
                        caughtException = stateCaught_125;
                        continue scanLoop1;
                    }
                }
                case 128: {
                    try {
                        var10 = 16 + (var14 >> 1);
                        var11 = -(var15 >> 2);
                        var12 = var15 >> 2;
                        var9 = -(var14 >> 1) - 16;
                        var8 -= 2;
                        var7 += 2;
                        var16 = -DiskCacheRequest.field_u[MenuInputState.field_c[2]].field_o + (-DiskCacheRequest.field_u[MenuInputState.field_c[2]].field_y + DiskCacheRequest.field_u[MenuInputState.field_c[2]].field_w);
                        if (var11 > var16) {
                            statePc = 131;
                        } else {
                            statePc = 129;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_128) {
                        statePc = ((Object) stateCaught_128 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_128);
                        }
                        caughtException = stateCaught_128;
                        continue scanLoop1;
                    }
                }
                case 129: {
                    try {
                        statePc = 132;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_129) {
                        statePc = ((Object) stateCaught_129 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_129);
                        }
                        caughtException = stateCaught_129;
                        continue scanLoop1;
                    }
                }
                case 131: {
                    try {
                        var11 = var16;
                        statePc = 132;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_131) {
                        statePc = ((Object) stateCaught_131 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_131);
                        }
                        caughtException = stateCaught_131;
                        continue scanLoop1;
                    }
                }
                case 132: {
                    try {
                        var16 = -QueuedPacket.field_i[MenuInputState.field_c[3]].field_o - QueuedPacket.field_i[MenuInputState.field_c[3]].field_y + QueuedPacket.field_i[MenuInputState.field_c[3]].field_w;
                        if (var16 < var12) {
                            /* Inlined CFG state: 135. */
                            {
                                var12 = var16;
                                statePc = 136;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 133. */
                            {
                                statePc = 136;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_132) {
                        statePc = ((Object) stateCaught_132 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_132);
                        }
                        caughtException = stateCaught_132;
                        continue scanLoop1;
                    }
                }
                case 136: {
                    try {
                        var34 = new int[6];
                        var33 = var34;
                        var17 = var33;
                        var18_int = 0;
                        statePc = 137;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_136) {
                        statePc = ((Object) stateCaught_136 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_136);
                        }
                        caughtException = stateCaught_136;
                        continue scanLoop1;
                    }
                }
                case 137: {
                    try {
                        if (var18_int >= 6) {
                            /* Inlined CFG state: 140. */
                            {
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var12 + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -121, QuickChatCategoryCache.field_d[1], QueuedPacket.field_i[MenuInputState.field_c[3]], var2_int + var10);
                                if (46 != MenuInputState.field_c[0]) {
                                    /* Inlined CFG state: 143. */
                                    {
                                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var8 + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 105, QuickChatCategoryCache.field_d[1], GameListHelpers.field_b[0], var6 + var2_int);
                                        statePc = 144;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 141. */
                                    {
                                        statePc = 144;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 138. */
                            {
                                var17[var18_int] = MenuInputState.field_c[var18_int];
                                var18_int++;
                                statePc = 137;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_137) {
                        statePc = ((Object) stateCaught_137 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_137);
                        }
                        caughtException = stateCaught_137;
                        continue scanLoop1;
                    }
                }
                case 144: {
                    try {
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -92, QuickChatCategoryCache.field_d[1], IsaacRandom.field_j[MenuInputState.field_c[0]], var2_int);
                        var3 -= 8;
                        var3 -= 16;
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 75, QuickChatCategoryCache.field_d[1], SceneWidget.field_kb[MenuInputState.field_c[1]], var2_int);
                        var3 += 16;
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -80, QuickChatCategoryCache.field_d[1], JaggrabDownloader.field_d[MenuInputState.field_c[5]], var2_int);
                        if (MenuInputState.field_c[5] == 53) {
                            statePc = 150;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 145. */
                            {
                                if (MenuInputState.field_c[5] != 55) {
                                    /* Inlined CFG state: 149. */
                                    {
                                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -99, QuickChatCategoryCache.field_d[1], NameErrorHelpers.field_a[0], var2_int);
                                        statePc = 150;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 146. */
                                    {
                                        statePc = 150;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_144) {
                        statePc = ((Object) stateCaught_144 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_144);
                        }
                        caughtException = stateCaught_144;
                        continue scanLoop1;
                    }
                }
                case 150: {
                    try {
                        var3 -= 16;
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -109, QuickChatCategoryCache.field_d[1], CachedArchiveProvider.field_A[MenuInputState.field_c[4]], var2_int);
                        var3 += 8;
                        var3 += 16;
                        if (46 == MenuInputState.field_c[0]) {
                            statePc = 153;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 151. */
                            {
                                TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var3 + var7, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -127, QuickChatCategoryCache.field_d[1], ModalPanelStack.field_I[0], var2_int + var5);
                                statePc = 153;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_150) {
                        statePc = ((Object) stateCaught_150 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_150);
                        }
                        caughtException = stateCaught_150;
                        continue scanLoop1;
                    }
                }
                case 153: {
                    try {
                        TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var11 + var3, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -95, QuickChatCategoryCache.field_d[1], DiskCacheRequest.field_u[MenuInputState.field_c[2]], var9 + var2_int);
                        var18_int = 0;
                        statePc = 154;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_153) {
                        statePc = ((Object) stateCaught_153 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_153);
                        }
                        caughtException = stateCaught_153;
                        continue scanLoop1;
                    }
                }
                case 154: {
                    try {
                        if (var18_int >= 6) {
                            /* Inlined CFG state: 157. */
                            {
                                if (this.field_n <= 0) {
                                    /* Inlined CFG state: 174. */
                                    {
                                        /* Sequential CFG blocks: 174, 176. */
                                        {
                                            SceneWidgetNode.field_q.drawSilhouette(225 + ValidatedTextWidget.field_I, 182 + QuickChatHelpers.field_a, 0);
                                        }
                                        {
                                            SceneWidgetNode.field_q.drawAlpha(225 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 182, 128);
                                            statePc = 177;
                                            continue scanLoop1;
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 158. */
                                    {
                                        if (~(ValidatedTextWidget.field_I + 225) < ~EmailLoginCredentials.field_g) {
                                            statePc = 172;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 159. */
                                            {
                                                /* Sequential CFG blocks: 159, 161. */
                                                {
                                                }
                                                {
                                                    if (~EmailLoginCredentials.field_g <= ~(SceneWidgetNode.field_q.field_n + ValidatedTextWidget.field_I + 225)) {
                                                        statePc = 172;
                                                        continue scanLoop1;
                                                    } else {
                                                        /* Inlined CFG state: 162. */
                                                        {
                                                            /* Sequential CFG blocks: 162, 164. */
                                                            {
                                                            }
                                                            {
                                                                if (~MenuButtonPanel.field_I > ~(QuickChatHelpers.field_a + 182)) {
                                                                    statePc = 172;
                                                                } else {
                                                                    statePc = 165;
                                                                }
                                                                continue scanLoop1;
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 155. */
                            {
                                MenuInputState.field_c[var18_int] = var34[var18_int];
                                var18_int++;
                                statePc = 154;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_154) {
                        statePc = ((Object) stateCaught_154 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_154);
                        }
                        caughtException = stateCaught_154;
                        continue scanLoop1;
                    }
                }
                case 165: {
                    try {
                        /* Sequential CFG blocks: 165, 167. */
                        {
                        }
                        {
                            if (~MenuButtonPanel.field_I <= ~(SceneWidgetNode.field_q.field_w + (QuickChatHelpers.field_a + 182))) {
                                statePc = 172;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 168. */
                                {
                                    /* Sequential CFG blocks: 168, 170. */
                                    {
                                    }
                                    {
                                        SceneWidgetNode.field_q.drawSilhouette(225 + ValidatedTextWidget.field_I, 182 + QuickChatHelpers.field_a, 16777215);
                                        SceneWidgetNode.field_q.drawAlpha(ValidatedTextWidget.field_I + 225, 182 + QuickChatHelpers.field_a, 128);
                                        this.field_i = -3;
                                        this.field_m = 6;
                                        statePc = 177;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_165) {
                        statePc = ((Object) stateCaught_165 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_165);
                        }
                        caughtException = stateCaught_165;
                        continue scanLoop1;
                    }
                }
                case 172: {
                    try {
                        SceneWidgetNode.field_q.drawTransparent(225 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 182);
                        statePc = 177;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_172) {
                        statePc = ((Object) stateCaught_172 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_172);
                        }
                        caughtException = stateCaught_172;
                        continue scanLoop1;
                    }
                }
                case 177: {
                    try {
                        if (this.field_n >= -27 + DropdownItemList.getKeyCodeForSlot(this.field_h, 813231272)) {
                            /* Inlined CFG state: 189. */
                            {
                                this.field_b.drawSilhouette(590 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 182, 0);
                                this.field_b.drawAlpha(590 + ValidatedTextWidget.field_I, 182 + QuickChatHelpers.field_a, 128);
                                statePc = 191;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 178. */
                            {
                                if (SpellProjectile.isPointerInRect(SceneWidgetNode.field_q.field_w, QuickChatHelpers.field_a + 182, SceneWidgetNode.field_q.field_n, param0 ^ -12, 590 + ValidatedTextWidget.field_I)) {
                                    /* Inlined CFG state: 183. */
                                    {
                                        if (this.field_b == null) {
                                            /* Inlined CFG state: 187. */
                                            {
                                                this.field_b = SceneWidgetNode.field_q.copyFlippedHorizontal();
                                                statePc = 188;
                                                continue scanLoop1;
                                            }
                                        } else {
                                            /* Inlined CFG state: 184. */
                                            {
                                                statePc = 188;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                } else {
                                    /* Inlined CFG state: 179. */
                                    {
                                        /* Sequential CFG blocks: 179, 181. */
                                        {
                                        }
                                        {
                                            SceneWidgetNode.field_q.drawHorizontalFlip(ValidatedTextWidget.field_I + 590, QuickChatHelpers.field_a + 182);
                                            statePc = 191;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_177) {
                        statePc = ((Object) stateCaught_177 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_177);
                        }
                        caughtException = stateCaught_177;
                        continue scanLoop1;
                    }
                }
                case 188: {
                    try {
                        this.field_b.drawSilhouette(ValidatedTextWidget.field_I + 590, 182 + QuickChatHelpers.field_a, 16777215);
                        this.field_b.drawAlpha(ValidatedTextWidget.field_I + 590, QuickChatHelpers.field_a + 182, 128);
                        this.field_i = 3;
                        this.field_m = 6;
                        statePc = 191;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_188) {
                        statePc = ((Object) stateCaught_188 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_188);
                        }
                        caughtException = stateCaught_188;
                        continue scanLoop1;
                    }
                }
                case 191: {
                    try {
                        discarded$1 = this.drawButtonBox(false, 330, (byte) -24, false, ValidatedTextWidget.field_I + 254, 114, 182 + QuickChatHelpers.field_a);
                        if (var4 != null) {
                            statePc = 194;
                        } else {
                            statePc = 192;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_191) {
                        statePc = ((Object) stateCaught_191 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_191);
                        }
                        caughtException = stateCaught_191;
                        continue scanLoop1;
                    }
                }
                case 192: {
                    try {
                        statePc = 200;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_192) {
                        statePc = ((Object) stateCaught_192 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_192);
                        }
                        caughtException = stateCaught_192;
                        continue scanLoop1;
                    }
                }
                case 194: {
                    try {
                        var18_int = DropdownItemList.getKeyCodeForSlot(this.field_h, 813231272);
                        statePc = 195;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_194) {
                        statePc = ((Object) stateCaught_194 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_194);
                        }
                        caughtException = stateCaught_194;
                        continue scanLoop1;
                    }
                }
                case 195: {
                    try {
                        if (0 <= this.field_n) {
                            statePc = 198;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 196. */
                            {
                                this.field_n = this.field_n + var18_int;
                                statePc = 195;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_195) {
                        statePc = ((Object) stateCaught_195 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_195);
                        }
                        caughtException = stateCaught_195;
                        continue scanLoop1;
                    }
                }
                case 198: {
                    try {
                        if (~var18_int < ~this.field_n) {
                            statePc = 200;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 199. */
                            {
                                this.field_n = this.field_n - var18_int;
                                statePc = 198;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_198) {
                        statePc = ((Object) stateCaught_198 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_198);
                        }
                        caughtException = stateCaught_198;
                        continue scanLoop1;
                    }
                }
                case 200: {
                    try {
                        var18 = null;
                        var19 = 0;
                        var20 = 0;
                        var3 = QuickChatHelpers.field_a + 188;
                        var2_int = 264 + ValidatedTextWidget.field_I;
                        if (param0 == 12) {
                            statePc = 203;
                        } else {
                            statePc = 201;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_200) {
                        statePc = ((Object) stateCaught_200 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_200);
                        }
                        caughtException = stateCaught_200;
                        continue scanLoop1;
                    }
                }
                case 201: {
                    try {
                        discarded$2 = this.canMoveToPage((byte) 5, -89);
                        statePc = 203;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_201) {
                        statePc = ((Object) stateCaught_201 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_201);
                        }
                        caughtException = stateCaught_201;
                        continue scanLoop1;
                    }
                }
                case 203: {
                    try {
                        var21 = this.field_n;
                        var22 = 35;
                        var23 = 0;
                        statePc = 204;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_203) {
                        statePc = ((Object) stateCaught_203 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_203);
                        }
                        caughtException = stateCaught_203;
                        continue scanLoop1;
                    }
                }
                case 204: {
                    try {
                        stackIn_205_0 = var23;
                        stackIn_205_1 = 9;
                        statePc = 205;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_204) {
                        statePc = ((Object) stateCaught_204 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_204);
                        }
                        caughtException = stateCaught_204;
                        continue scanLoop1;
                    }
                }
                case 205: {
                    try {
                        if (stackIn_205_0 >= stackIn_205_1) {
                            /* Inlined CFG state: 674. */
                            {
                                if (var18 != null) {
                                    /* Inlined CFG state: 677. */
                                    {
                                        SpellProjectile.field_B.drawParagraph((String) (var18), 96 + var19 * var22 + (var2_int - 256), var22 * var20 + (var3 - 1) - 16, 256, 64, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                        SpellProjectile.field_B.drawParagraph((String) (var18), 96 + (-1 + (var19 * var22 + (var2_int - 256))), -16 + (var3 + var22 * var20), 256, 64, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                        SpellProjectile.field_B.drawParagraph((String) (var18), 97 + (var2_int + var22 * var19) - 256, -16 + var22 * var20 + var3, 256, 64, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                        SpellProjectile.field_B.drawParagraph((String) (var18), -256 + (var2_int + var19 * var22) + 96, var22 * var20 + (var3 - 15), 256, 64, 0, 0, 1, 0, SpellProjectile.field_B.field_C);
                                        SpellProjectile.field_B.drawParagraph((String) (var18), -160 + var2_int + var22 * var19, -16 + (var3 + var22 * var20), 256, 64, 16777215, 0, 1, 0, SpellProjectile.field_B.field_C);
                                        statePc = 678;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 675. */
                                    {
                                        statePc = 678;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 206. */
                            {
                                var24 = 0;
                                statePc = 207;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_205) {
                        statePc = ((Object) stateCaught_205 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_205);
                        }
                        caughtException = stateCaught_205;
                        continue scanLoop1;
                    }
                }
                case 207: {
                    try {
                        if (var24 >= 3) {
                            /* Inlined CFG state: 673. */
                            {
                                var23++;
                                statePc = 204;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 208. */
                            {
                                stackIn_205_0 = DropdownItemList.getKeyCodeForSlot(this.field_h, 813231272);
                                stackIn_209_0 = stackIn_205_0;
                                stackIn_205_1 = var21;
                                stackIn_209_1 = stackIn_205_1;
                                if (false) {
                                    statePc = 205;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 209. */
                                    {
                                        if (stackIn_209_0 <= stackIn_209_1) {
                                            statePc = 672;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 210. */
                                            {
                                                SoftwareRasterizer.drawRectangle(-1 + (var22 * var23 + var2_int), var24 * var22 + var3 - 1, 34, 34, 8745077);
                                                SoftwareRasterizer.drawRectangle(var2_int + var22 * var23, var3 + var24 * var22, 32, 32, 5720140);
                                                var25 = 14207693;
                                                var26 = 0;
                                                var27 = -1;
                                                var28 = 64;
                                                var29 = -1;
                                                if (this.field_h != 0) {
                                                    statePc = 322;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 211. */
                                                    {
                                                        var28 = 48;
                                                        if (12 > var21) {
                                                            statePc = 217;
                                                        } else {
                                                            statePc = 212;
                                                        }
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_207) {
                        statePc = ((Object) stateCaught_207 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_207);
                        }
                        caughtException = stateCaught_207;
                        continue scanLoop1;
                    }
                }
                case 212: {
                    try {
                        if (var21 < 15) {
                            /* Inlined CFG state: 216. */
                            {
                                var27 = 0;
                                var25 = var25 + 2105376;
                                statePc = 217;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 213. */
                            {
                                statePc = 217;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_212) {
                        statePc = ((Object) stateCaught_212 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_212);
                        }
                        caughtException = stateCaught_212;
                        continue scanLoop1;
                    }
                }
                case 217: {
                    try {
                        if (var21 < 15) {
                            statePc = 222;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 218. */
                            {
                                if (var21 >= 18) {
                                    statePc = 222;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 219. */
                                    {
                                        /* Sequential CFG blocks: 219, 221. */
                                        {
                                        }
                                        {
                                            var27 = 1;
                                            statePc = 222;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_217) {
                        statePc = ((Object) stateCaught_217 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_217);
                        }
                        caughtException = stateCaught_217;
                        continue scanLoop1;
                    }
                }
                case 222: {
                    try {
                        if (var21 < 18) {
                            statePc = 228;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 223. */
                            {
                                if (var21 < 21) {
                                    /* Inlined CFG state: 227. */
                                    {
                                        var27 = 2;
                                        var25 = var25 + 2105376;
                                        statePc = 228;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 224. */
                                    {
                                        statePc = 228;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_222) {
                        statePc = ((Object) stateCaught_222 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_222);
                        }
                        caughtException = stateCaught_222;
                        continue scanLoop1;
                    }
                }
                case 228: {
                    try {
                        if (var21 < 21) {
                            statePc = 234;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 229. */
                            {
                                if (var21 < 24) {
                                    /* Inlined CFG state: 233. */
                                    {
                                        var27 = 3;
                                        statePc = 234;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 230. */
                                    {
                                        statePc = 234;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_228) {
                        statePc = ((Object) stateCaught_228 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_228);
                        }
                        caughtException = stateCaught_228;
                        continue scanLoop1;
                    }
                }
                case 234: {
                    try {
                        if (var21 < 24) {
                            statePc = 240;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 235. */
                            {
                                if (var21 < 27) {
                                    /* Inlined CFG state: 239. */
                                    {
                                        var25 = var25 + 2105376;
                                        var27 = 4;
                                        statePc = 240;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 236. */
                                    {
                                        statePc = 240;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_234) {
                        statePc = ((Object) stateCaught_234 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_234);
                        }
                        caughtException = stateCaught_234;
                        continue scanLoop1;
                    }
                }
                case 240: {
                    try {
                        if (var21 < 27) {
                            statePc = 246;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 241. */
                            {
                                if (30 > var21) {
                                    /* Inlined CFG state: 245. */
                                    {
                                        var27 = 5;
                                        statePc = 246;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 242. */
                                    {
                                        statePc = 246;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_240) {
                        statePc = ((Object) stateCaught_240 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_240);
                        }
                        caughtException = stateCaught_240;
                        continue scanLoop1;
                    }
                }
                case 246: {
                    try {
                        if (var21 == 30) {
                            statePc = 251;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 247. */
                            {
                                if (33 == var21) {
                                    statePc = 251;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 248. */
                                    {
                                        statePc = 252;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_246) {
                        statePc = ((Object) stateCaught_246 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_246);
                        }
                        caughtException = stateCaught_246;
                        continue scanLoop1;
                    }
                }
                case 251: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 6;
                        statePc = 252;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_251) {
                        statePc = ((Object) stateCaught_251 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_251);
                        }
                        caughtException = stateCaught_251;
                        continue scanLoop1;
                    }
                }
                case 252: {
                    try {
                        if (31 == var21) {
                            statePc = 257;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 253. */
                            {
                                if (var21 == 34) {
                                    statePc = 257;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 254. */
                                    {
                                        statePc = 258;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_252) {
                        statePc = ((Object) stateCaught_252 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_252);
                        }
                        caughtException = stateCaught_252;
                        continue scanLoop1;
                    }
                }
                case 257: {
                    try {
                        var27 = 7;
                        statePc = 258;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_257) {
                        statePc = ((Object) stateCaught_257 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_257);
                        }
                        caughtException = stateCaught_257;
                        continue scanLoop1;
                    }
                }
                case 258: {
                    try {
                        if (var21 == 32) {
                            statePc = 262;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 259. */
                            {
                                if (var21 != 35) {
                                    statePc = 263;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 260. */
                                    {
                                        statePc = 262;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_258) {
                        statePc = ((Object) stateCaught_258 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_258);
                        }
                        caughtException = stateCaught_258;
                        continue scanLoop1;
                    }
                }
                case 262: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 8;
                        statePc = 263;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_262) {
                        statePc = ((Object) stateCaught_262 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_262);
                        }
                        caughtException = stateCaught_262;
                        continue scanLoop1;
                    }
                }
                case 263: {
                    try {
                        if (var21 == 36) {
                            statePc = 268;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 264. */
                            {
                                if (var21 == 39) {
                                    statePc = 268;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 265. */
                                    {
                                        statePc = 269;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_263) {
                        statePc = ((Object) stateCaught_263 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_263);
                        }
                        caughtException = stateCaught_263;
                        continue scanLoop1;
                    }
                }
                case 268: {
                    try {
                        var27 = 9;
                        statePc = 269;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_268) {
                        statePc = ((Object) stateCaught_268 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_268);
                        }
                        caughtException = stateCaught_268;
                        continue scanLoop1;
                    }
                }
                case 269: {
                    try {
                        if (var21 == 37) {
                            statePc = 274;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 270. */
                            {
                                if (var21 == 40) {
                                    statePc = 274;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 271. */
                                    {
                                        statePc = 275;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_269) {
                        statePc = ((Object) stateCaught_269 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_269);
                        }
                        caughtException = stateCaught_269;
                        continue scanLoop1;
                    }
                }
                case 274: {
                    try {
                        var27 = 10;
                        var25 = var25 + 2105376;
                        statePc = 275;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_274) {
                        statePc = ((Object) stateCaught_274 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_274);
                        }
                        caughtException = stateCaught_274;
                        continue scanLoop1;
                    }
                }
                case 275: {
                    try {
                        if (38 == var21) {
                            statePc = 280;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 276. */
                            {
                                if (var21 == 41) {
                                    statePc = 280;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 277. */
                                    {
                                        statePc = 281;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_275) {
                        statePc = ((Object) stateCaught_275 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_275);
                        }
                        caughtException = stateCaught_275;
                        continue scanLoop1;
                    }
                }
                case 280: {
                    try {
                        var27 = 11;
                        statePc = 281;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_280) {
                        statePc = ((Object) stateCaught_280 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_280);
                        }
                        caughtException = stateCaught_280;
                        continue scanLoop1;
                    }
                }
                case 281: {
                    try {
                        if (var21 == 42) {
                            statePc = 285;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 282. */
                            {
                                if (var21 != 45) {
                                    statePc = 286;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 283. */
                                    {
                                        statePc = 285;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_281) {
                        statePc = ((Object) stateCaught_281 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_281);
                        }
                        caughtException = stateCaught_281;
                        continue scanLoop1;
                    }
                }
                case 285: {
                    try {
                        var27 = 16;
                        var25 = var25 + 2105376;
                        statePc = 286;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_285) {
                        statePc = ((Object) stateCaught_285 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_285);
                        }
                        caughtException = stateCaught_285;
                        continue scanLoop1;
                    }
                }
                case 286: {
                    try {
                        if (var21 == 43) {
                            statePc = 291;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 287. */
                            {
                                if (var21 == 46) {
                                    statePc = 291;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 288. */
                                    {
                                        statePc = 292;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_286) {
                        statePc = ((Object) stateCaught_286 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_286);
                        }
                        caughtException = stateCaught_286;
                        continue scanLoop1;
                    }
                }
                case 291: {
                    try {
                        var27 = 17;
                        statePc = 292;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_291) {
                        statePc = ((Object) stateCaught_291 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_291);
                        }
                        caughtException = stateCaught_291;
                        continue scanLoop1;
                    }
                }
                case 292: {
                    try {
                        if (44 != var21) {
                            statePc = 294;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 293. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 26;
                                statePc = 294;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_292) {
                        statePc = ((Object) stateCaught_292 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_292);
                        }
                        caughtException = stateCaught_292;
                        continue scanLoop1;
                    }
                }
                case 294: {
                    try {
                        if (var21 != 47) {
                            statePc = 296;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 295. */
                            {
                                var27 = 28;
                                var25 = var25 + 2105376;
                                statePc = 296;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_294) {
                        statePc = ((Object) stateCaught_294 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_294);
                        }
                        caughtException = stateCaught_294;
                        continue scanLoop1;
                    }
                }
                case 296: {
                    try {
                        if (var21 != 48) {
                            statePc = 298;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 297. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 298;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_296) {
                        statePc = ((Object) stateCaught_296 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_296);
                        }
                        caughtException = stateCaught_296;
                        continue scanLoop1;
                    }
                }
                case 298: {
                    try {
                        if (var21 == 49) {
                            /* Inlined CFG state: 301. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 302;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 299. */
                            {
                                statePc = 302;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_298) {
                        statePc = ((Object) stateCaught_298 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_298);
                        }
                        caughtException = stateCaught_298;
                        continue scanLoop1;
                    }
                }
                case 302: {
                    try {
                        if (50 == var21) {
                            /* Inlined CFG state: 305. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 1;
                                statePc = 306;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 303. */
                            {
                                statePc = 306;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_302) {
                        statePc = ((Object) stateCaught_302 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_302);
                        }
                        caughtException = stateCaught_302;
                        continue scanLoop1;
                    }
                }
                case 306: {
                    try {
                        if (var21 != 51) {
                            statePc = 308;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 307. */
                            {
                                var29 = 2;
                                statePc = 308;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_306) {
                        statePc = ((Object) stateCaught_306 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_306);
                        }
                        caughtException = stateCaught_306;
                        continue scanLoop1;
                    }
                }
                case 308: {
                    try {
                        if (var21 != 52) {
                            statePc = 310;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 309. */
                            {
                                var29 = 2;
                                statePc = 310;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_308) {
                        statePc = ((Object) stateCaught_308 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_308);
                        }
                        caughtException = stateCaught_308;
                        continue scanLoop1;
                    }
                }
                case 310: {
                    try {
                        if (var21 == 53) {
                            /* Inlined CFG state: 313. */
                            {
                                var29 = 2;
                                statePc = 314;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 311. */
                            {
                                statePc = 314;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_310) {
                        statePc = ((Object) stateCaught_310 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_310);
                        }
                        caughtException = stateCaught_310;
                        continue scanLoop1;
                    }
                }
                case 314: {
                    try {
                        if (54 != var21) {
                            statePc = 316;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 315. */
                            {
                                var27 = 55;
                                var25 = var25 + 2105376;
                                statePc = 316;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_314) {
                        statePc = ((Object) stateCaught_314 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_314);
                        }
                        caughtException = stateCaught_314;
                        continue scanLoop1;
                    }
                }
                case 316: {
                    try {
                        if (var21 != 55) {
                            statePc = 318;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 317. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 55;
                                statePc = 318;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_316) {
                        statePc = ((Object) stateCaught_316 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_316);
                        }
                        caughtException = stateCaught_316;
                        continue scanLoop1;
                    }
                }
                case 318: {
                    try {
                        if (var21 == 56) {
                            /* Inlined CFG state: 321. */
                            {
                                var27 = 55;
                                var25 = var25 + 2105376;
                                statePc = 322;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 319. */
                            {
                                statePc = 322;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_318) {
                        statePc = ((Object) stateCaught_318 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_318);
                        }
                        caughtException = stateCaught_318;
                        continue scanLoop1;
                    }
                }
                case 322: {
                    try {
                        if (this.field_h != 2) {
                            statePc = 402;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 323. */
                            {
                                var28 = 48;
                                if (var21 < 12) {
                                    statePc = 328;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 324. */
                                    {
                                        if (var21 >= 15) {
                                            statePc = 328;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 325. */
                                            {
                                                /* Sequential CFG blocks: 325, 327. */
                                                {
                                                }
                                                {
                                                    var25 = var25 + 2105376;
                                                    var27 = 0;
                                                    statePc = 328;
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_322) {
                        statePc = ((Object) stateCaught_322 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_322);
                        }
                        caughtException = stateCaught_322;
                        continue scanLoop1;
                    }
                }
                case 328: {
                    try {
                        if (var21 < 15) {
                            statePc = 333;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 329. */
                            {
                                if (18 <= var21) {
                                    statePc = 333;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 330. */
                                    {
                                        /* Sequential CFG blocks: 330, 332. */
                                        {
                                        }
                                        {
                                            var27 = 1;
                                            statePc = 333;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_328) {
                        statePc = ((Object) stateCaught_328 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_328);
                        }
                        caughtException = stateCaught_328;
                        continue scanLoop1;
                    }
                }
                case 333: {
                    try {
                        if (var21 < 18) {
                            statePc = 339;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 334. */
                            {
                                if (21 > var21) {
                                    /* Inlined CFG state: 338. */
                                    {
                                        var27 = 2;
                                        var25 = var25 + 2105376;
                                        statePc = 339;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 335. */
                                    {
                                        statePc = 339;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_333) {
                        statePc = ((Object) stateCaught_333 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_333);
                        }
                        caughtException = stateCaught_333;
                        continue scanLoop1;
                    }
                }
                case 339: {
                    try {
                        if (var21 < 21) {
                            statePc = 344;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 340. */
                            {
                                if (var21 >= 24) {
                                    statePc = 344;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 341. */
                                    {
                                        /* Sequential CFG blocks: 341, 343. */
                                        {
                                        }
                                        {
                                            var27 = 3;
                                            statePc = 344;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_339) {
                        statePc = ((Object) stateCaught_339 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_339);
                        }
                        caughtException = stateCaught_339;
                        continue scanLoop1;
                    }
                }
                case 344: {
                    try {
                        if (var21 < 24) {
                            statePc = 350;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 345. */
                            {
                                if (27 > var21) {
                                    /* Inlined CFG state: 349. */
                                    {
                                        var27 = 4;
                                        var25 = var25 + 2105376;
                                        statePc = 350;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 346. */
                                    {
                                        statePc = 350;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_344) {
                        statePc = ((Object) stateCaught_344 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_344);
                        }
                        caughtException = stateCaught_344;
                        continue scanLoop1;
                    }
                }
                case 350: {
                    try {
                        if (var21 < 27) {
                            statePc = 356;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 351. */
                            {
                                if (var21 < 30) {
                                    /* Inlined CFG state: 355. */
                                    {
                                        var27 = 5;
                                        statePc = 356;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 352. */
                                    {
                                        statePc = 356;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_350) {
                        statePc = ((Object) stateCaught_350 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_350);
                        }
                        caughtException = stateCaught_350;
                        continue scanLoop1;
                    }
                }
                case 356: {
                    try {
                        if (var21 == 30) {
                            statePc = 360;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 357. */
                            {
                                if (var21 != 33) {
                                    statePc = 361;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 358. */
                                    {
                                        statePc = 360;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_356) {
                        statePc = ((Object) stateCaught_356 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_356);
                        }
                        caughtException = stateCaught_356;
                        continue scanLoop1;
                    }
                }
                case 360: {
                    try {
                        var27 = 6;
                        var25 = var25 + 2105376;
                        statePc = 361;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_360) {
                        statePc = ((Object) stateCaught_360 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_360);
                        }
                        caughtException = stateCaught_360;
                        continue scanLoop1;
                    }
                }
                case 361: {
                    try {
                        if (var21 == 31) {
                            statePc = 365;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 362. */
                            {
                                if (var21 != 34) {
                                    statePc = 366;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 363. */
                                    {
                                        statePc = 365;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_361) {
                        statePc = ((Object) stateCaught_361 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_361);
                        }
                        caughtException = stateCaught_361;
                        continue scanLoop1;
                    }
                }
                case 365: {
                    try {
                        var27 = 7;
                        statePc = 366;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_365) {
                        statePc = ((Object) stateCaught_365 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_365);
                        }
                        caughtException = stateCaught_365;
                        continue scanLoop1;
                    }
                }
                case 366: {
                    try {
                        if (var21 == 32) {
                            statePc = 371;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 367. */
                            {
                                if (var21 == 35) {
                                    statePc = 371;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 368. */
                                    {
                                        statePc = 372;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_366) {
                        statePc = ((Object) stateCaught_366 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_366);
                        }
                        caughtException = stateCaught_366;
                        continue scanLoop1;
                    }
                }
                case 371: {
                    try {
                        var27 = 8;
                        var25 = var25 + 2105376;
                        statePc = 372;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_371) {
                        statePc = ((Object) stateCaught_371 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_371);
                        }
                        caughtException = stateCaught_371;
                        continue scanLoop1;
                    }
                }
                case 372: {
                    try {
                        if (var21 == 36) {
                            statePc = 377;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 373. */
                            {
                                if (var21 == 39) {
                                    statePc = 377;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 374. */
                                    {
                                        statePc = 378;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_372) {
                        statePc = ((Object) stateCaught_372 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_372);
                        }
                        caughtException = stateCaught_372;
                        continue scanLoop1;
                    }
                }
                case 377: {
                    try {
                        var27 = 9;
                        statePc = 378;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_377) {
                        statePc = ((Object) stateCaught_377 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_377);
                        }
                        caughtException = stateCaught_377;
                        continue scanLoop1;
                    }
                }
                case 378: {
                    try {
                        switch (var21) {
                            case 37: statePc = -1; break;
                            case 40: statePc = -1; break;
                            case 38: statePc = -1; break;
                            case 41: statePc = -1; break;
                            case 42: statePc = -1; break;
                            case 45: statePc = -1; break;
                            case 43: statePc = 381; break;
                            case 46: statePc = 381; break;
                            default: statePc = 382; break;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_378) {
                        statePc = ((Object) stateCaught_378 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_378);
                        }
                        caughtException = stateCaught_378;
                        continue scanLoop1;
                    }
                }
                case 381: {
                    try {
                        var27 = 17;
                        statePc = 382;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_381) {
                        statePc = ((Object) stateCaught_381 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_381);
                        }
                        caughtException = stateCaught_381;
                        continue scanLoop1;
                    }
                }
                case 382: {
                    try {
                        if (var21 == 44) {
                            /* Inlined CFG state: 385. */
                            {
                                var27 = 26;
                                var25 = var25 + 2105376;
                                statePc = 386;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 383. */
                            {
                                statePc = 386;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_382) {
                        statePc = ((Object) stateCaught_382 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_382);
                        }
                        caughtException = stateCaught_382;
                        continue scanLoop1;
                    }
                }
                case 386: {
                    try {
                        if (var21 != 47) {
                            statePc = 388;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 387. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 28;
                                statePc = 388;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_386) {
                        statePc = ((Object) stateCaught_386 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_386);
                        }
                        caughtException = stateCaught_386;
                        continue scanLoop1;
                    }
                }
                case 388: {
                    try {
                        if (48 != var21) {
                            statePc = 390;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 389. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 390;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_388) {
                        statePc = ((Object) stateCaught_388 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_388);
                        }
                        caughtException = stateCaught_388;
                        continue scanLoop1;
                    }
                }
                case 390: {
                    try {
                        if (49 != var21) {
                            statePc = 392;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 391. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 392;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_390) {
                        statePc = ((Object) stateCaught_390 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_390);
                        }
                        caughtException = stateCaught_390;
                        continue scanLoop1;
                    }
                }
                case 392: {
                    try {
                        if (50 != var21) {
                            statePc = 394;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 393. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 394;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_392) {
                        statePc = ((Object) stateCaught_392 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_392);
                        }
                        caughtException = stateCaught_392;
                        continue scanLoop1;
                    }
                }
                case 394: {
                    try {
                        if (var21 != 51) {
                            statePc = 396;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 395. */
                            {
                                var29 = 2;
                                statePc = 396;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_394) {
                        statePc = ((Object) stateCaught_394 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_394);
                        }
                        caughtException = stateCaught_394;
                        continue scanLoop1;
                    }
                }
                case 396: {
                    try {
                        if (var21 == 52) {
                            /* Inlined CFG state: 399. */
                            {
                                var29 = 2;
                                statePc = 400;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 397. */
                            {
                                statePc = 400;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_396) {
                        statePc = ((Object) stateCaught_396 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_396);
                        }
                        caughtException = stateCaught_396;
                        continue scanLoop1;
                    }
                }
                case 400: {
                    try {
                        if (var21 != 53) {
                            statePc = 402;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 401. */
                            {
                                var29 = 2;
                                statePc = 402;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_400) {
                        statePc = ((Object) stateCaught_400 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_400);
                        }
                        caughtException = stateCaught_400;
                        continue scanLoop1;
                    }
                }
                case 402: {
                    try {
                        if (this.field_h == 3) {
                            /* Inlined CFG state: 405. */
                            {
                                if (var21 < 12) {
                                    statePc = 411;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 406. */
                                    {
                                        if (var21 < 15) {
                                            /* Inlined CFG state: 410. */
                                            {
                                                var27 = 0;
                                                var25 = var25 + 2105376;
                                                statePc = 411;
                                                continue scanLoop1;
                                            }
                                        } else {
                                            /* Inlined CFG state: 407. */
                                            {
                                                statePc = 411;
                                                continue scanLoop1;
                                            }
                                        }
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 403. */
                            {
                                statePc = 489;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_402) {
                        statePc = ((Object) stateCaught_402 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_402);
                        }
                        caughtException = stateCaught_402;
                        continue scanLoop1;
                    }
                }
                case 411: {
                    try {
                        var28 = 48;
                        if (var21 < 15) {
                            statePc = 416;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 412. */
                            {
                                if (var21 >= 18) {
                                    statePc = 416;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 413. */
                                    {
                                        /* Sequential CFG blocks: 413, 415. */
                                        {
                                        }
                                        {
                                            var27 = 1;
                                            statePc = 416;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_411) {
                        statePc = ((Object) stateCaught_411 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_411);
                        }
                        caughtException = stateCaught_411;
                        continue scanLoop1;
                    }
                }
                case 416: {
                    try {
                        if (var21 < 18) {
                            statePc = 422;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 417. */
                            {
                                if (var21 < 21) {
                                    /* Inlined CFG state: 421. */
                                    {
                                        var25 = var25 + 2105376;
                                        var27 = 2;
                                        statePc = 422;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 418. */
                                    {
                                        statePc = 422;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_416) {
                        statePc = ((Object) stateCaught_416 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_416);
                        }
                        caughtException = stateCaught_416;
                        continue scanLoop1;
                    }
                }
                case 422: {
                    try {
                        if (var21 < 21) {
                            statePc = 428;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 423. */
                            {
                                if (24 > var21) {
                                    /* Inlined CFG state: 427. */
                                    {
                                        var27 = 3;
                                        statePc = 428;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 424. */
                                    {
                                        statePc = 428;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_422) {
                        statePc = ((Object) stateCaught_422 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_422);
                        }
                        caughtException = stateCaught_422;
                        continue scanLoop1;
                    }
                }
                case 428: {
                    try {
                        if (var21 < 24) {
                            statePc = 434;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 429. */
                            {
                                if (var21 < 27) {
                                    /* Inlined CFG state: 433. */
                                    {
                                        var27 = 4;
                                        var25 = var25 + 2105376;
                                        statePc = 434;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 430. */
                                    {
                                        statePc = 434;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_428) {
                        statePc = ((Object) stateCaught_428 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_428);
                        }
                        caughtException = stateCaught_428;
                        continue scanLoop1;
                    }
                }
                case 434: {
                    try {
                        if (var21 < 27) {
                            statePc = 439;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 435. */
                            {
                                if (var21 >= 30) {
                                    statePc = 439;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 436. */
                                    {
                                        /* Sequential CFG blocks: 436, 438. */
                                        {
                                        }
                                        {
                                            var27 = 5;
                                            statePc = 439;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_434) {
                        statePc = ((Object) stateCaught_434 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_434);
                        }
                        caughtException = stateCaught_434;
                        continue scanLoop1;
                    }
                }
                case 439: {
                    try {
                        if (var21 == 30) {
                            statePc = 444;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 440. */
                            {
                                if (var21 == 33) {
                                    statePc = 444;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 441. */
                                    {
                                        statePc = 445;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_439) {
                        statePc = ((Object) stateCaught_439 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_439);
                        }
                        caughtException = stateCaught_439;
                        continue scanLoop1;
                    }
                }
                case 444: {
                    try {
                        var27 = 6;
                        var25 = var25 + 2105376;
                        statePc = 445;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_444) {
                        statePc = ((Object) stateCaught_444 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_444);
                        }
                        caughtException = stateCaught_444;
                        continue scanLoop1;
                    }
                }
                case 445: {
                    try {
                        if (var21 == 31) {
                            statePc = 450;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 446. */
                            {
                                if (34 == var21) {
                                    statePc = 450;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 447. */
                                    {
                                        statePc = 451;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_445) {
                        statePc = ((Object) stateCaught_445 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_445);
                        }
                        caughtException = stateCaught_445;
                        continue scanLoop1;
                    }
                }
                case 450: {
                    try {
                        var27 = 7;
                        statePc = 451;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_450) {
                        statePc = ((Object) stateCaught_450 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_450);
                        }
                        caughtException = stateCaught_450;
                        continue scanLoop1;
                    }
                }
                case 451: {
                    try {
                        if (var21 == 32) {
                            statePc = 456;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 452. */
                            {
                                if (var21 == 35) {
                                    statePc = 456;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 453. */
                                    {
                                        statePc = 457;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_451) {
                        statePc = ((Object) stateCaught_451 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_451);
                        }
                        caughtException = stateCaught_451;
                        continue scanLoop1;
                    }
                }
                case 456: {
                    try {
                        var27 = 8;
                        var25 = var25 + 2105376;
                        statePc = 457;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_456) {
                        statePc = ((Object) stateCaught_456 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_456);
                        }
                        caughtException = stateCaught_456;
                        continue scanLoop1;
                    }
                }
                case 457: {
                    try {
                        switch (var21) {
                            case 36: statePc = -1; break;
                            case 39: statePc = -1; break;
                            case 37: statePc = -1; break;
                            case 40: statePc = -1; break;
                            case 38: statePc = -1; break;
                            case 41: statePc = -1; break;
                            case 42: statePc = 460; break;
                            case 45: statePc = 460; break;
                            default: statePc = 461; break;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_457) {
                        statePc = ((Object) stateCaught_457 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_457);
                        }
                        caughtException = stateCaught_457;
                        continue scanLoop1;
                    }
                }
                case 460: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 16;
                        statePc = 461;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_460) {
                        statePc = ((Object) stateCaught_460 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_460);
                        }
                        caughtException = stateCaught_460;
                        continue scanLoop1;
                    }
                }
                case 461: {
                    try {
                        if (var21 == 43) {
                            statePc = 466;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 462. */
                            {
                                if (var21 == 46) {
                                    statePc = 466;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 463. */
                                    {
                                        statePc = 467;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_461) {
                        statePc = ((Object) stateCaught_461 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_461);
                        }
                        caughtException = stateCaught_461;
                        continue scanLoop1;
                    }
                }
                case 466: {
                    try {
                        var27 = 17;
                        statePc = 467;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_466) {
                        statePc = ((Object) stateCaught_466 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_466);
                        }
                        caughtException = stateCaught_466;
                        continue scanLoop1;
                    }
                }
                case 467: {
                    try {
                        if (var21 == 44) {
                            /* Inlined CFG state: 470. */
                            {
                                var27 = 26;
                                var25 = var25 + 2105376;
                                statePc = 471;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 468. */
                            {
                                statePc = 471;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_467) {
                        statePc = ((Object) stateCaught_467 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_467);
                        }
                        caughtException = stateCaught_467;
                        continue scanLoop1;
                    }
                }
                case 471: {
                    try {
                        if (var21 == 47) {
                            /* Inlined CFG state: 474. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 28;
                                statePc = 475;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 472. */
                            {
                                statePc = 475;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_471) {
                        statePc = ((Object) stateCaught_471 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_471);
                        }
                        caughtException = stateCaught_471;
                        continue scanLoop1;
                    }
                }
                case 475: {
                    try {
                        if (var21 == 48) {
                            /* Inlined CFG state: 478. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 479;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 476. */
                            {
                                statePc = 479;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_475) {
                        statePc = ((Object) stateCaught_475 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_475);
                        }
                        caughtException = stateCaught_475;
                        continue scanLoop1;
                    }
                }
                case 479: {
                    try {
                        if (var21 != 49) {
                            statePc = 481;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 480. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 481;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_479) {
                        statePc = ((Object) stateCaught_479 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_479);
                        }
                        caughtException = stateCaught_479;
                        continue scanLoop1;
                    }
                }
                case 481: {
                    try {
                        if (50 != var21) {
                            statePc = 483;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 482. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 483;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_481) {
                        statePc = ((Object) stateCaught_481 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_481);
                        }
                        caughtException = stateCaught_481;
                        continue scanLoop1;
                    }
                }
                case 483: {
                    try {
                        if (var21 != 51) {
                            statePc = 485;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 484. */
                            {
                                var29 = 2;
                                statePc = 485;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_483) {
                        statePc = ((Object) stateCaught_483 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_483);
                        }
                        caughtException = stateCaught_483;
                        continue scanLoop1;
                    }
                }
                case 485: {
                    try {
                        if (var21 != 52) {
                            statePc = 487;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 486. */
                            {
                                var29 = 2;
                                statePc = 487;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_485) {
                        statePc = ((Object) stateCaught_485 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_485);
                        }
                        caughtException = stateCaught_485;
                        continue scanLoop1;
                    }
                }
                case 487: {
                    try {
                        if (var21 != 53) {
                            statePc = 489;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 488. */
                            {
                                var29 = 2;
                                statePc = 489;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_487) {
                        statePc = ((Object) stateCaught_487 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_487);
                        }
                        caughtException = stateCaught_487;
                        continue scanLoop1;
                    }
                }
                case 489: {
                    try {
                        if (1 == this.field_h) {
                            /* Inlined CFG state: 492. */
                            {
                                var28 = 54;
                                statePc = 493;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 490. */
                            {
                                statePc = 493;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_489) {
                        statePc = ((Object) stateCaught_489 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_489);
                        }
                        caughtException = stateCaught_489;
                        continue scanLoop1;
                    }
                }
                case 493: {
                    try {
                        if (4 == this.field_h) {
                            /* Inlined CFG state: 496. */
                            {
                                if (42 == var21) {
                                    /* Inlined CFG state: 499. */
                                    {
                                        var27 = 0;
                                        var25 = var25 + 2105376;
                                        statePc = 500;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 497. */
                                    {
                                        statePc = 500;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 494. */
                            {
                                statePc = 583;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_493) {
                        statePc = ((Object) stateCaught_493 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_493);
                        }
                        caughtException = stateCaught_493;
                        continue scanLoop1;
                    }
                }
                case 500: {
                    try {
                        var28 = 66;
                        if (var21 == 43) {
                            /* Inlined CFG state: 503. */
                            {
                                var27 = 1;
                                statePc = 504;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 501. */
                            {
                                statePc = 504;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_500) {
                        statePc = ((Object) stateCaught_500 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_500);
                        }
                        caughtException = stateCaught_500;
                        continue scanLoop1;
                    }
                }
                case 504: {
                    try {
                        if (var21 != 44) {
                            statePc = 506;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 505. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 2;
                                statePc = 506;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_504) {
                        statePc = ((Object) stateCaught_504 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_504);
                        }
                        caughtException = stateCaught_504;
                        continue scanLoop1;
                    }
                }
                case 506: {
                    try {
                        if (var21 != 45) {
                            statePc = 508;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 507. */
                            {
                                var27 = 3;
                                statePc = 508;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_506) {
                        statePc = ((Object) stateCaught_506 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_506);
                        }
                        caughtException = stateCaught_506;
                        continue scanLoop1;
                    }
                }
                case 508: {
                    try {
                        if (46 == var21) {
                            /* Inlined CFG state: 511. */
                            {
                                var25 = var25 + 2105376;
                                var27 = 4;
                                statePc = 512;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 509. */
                            {
                                statePc = 512;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_508) {
                        statePc = ((Object) stateCaught_508 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_508);
                        }
                        caughtException = stateCaught_508;
                        continue scanLoop1;
                    }
                }
                case 512: {
                    try {
                        if (47 == var21) {
                            /* Inlined CFG state: 515. */
                            {
                                var27 = 5;
                                statePc = 516;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 513. */
                            {
                                statePc = 516;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_512) {
                        statePc = ((Object) stateCaught_512 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_512);
                        }
                        caughtException = stateCaught_512;
                        continue scanLoop1;
                    }
                }
                case 516: {
                    try {
                        if (var21 == 48) {
                            statePc = 521;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 517. */
                            {
                                if (var21 == 51) {
                                    statePc = 521;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 518. */
                                    {
                                        statePc = 522;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_516) {
                        statePc = ((Object) stateCaught_516 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_516);
                        }
                        caughtException = stateCaught_516;
                        continue scanLoop1;
                    }
                }
                case 521: {
                    try {
                        var27 = 6;
                        var25 = var25 + 2105376;
                        statePc = 522;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_521) {
                        statePc = ((Object) stateCaught_521 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_521);
                        }
                        caughtException = stateCaught_521;
                        continue scanLoop1;
                    }
                }
                case 522: {
                    try {
                        if (var21 == 49) {
                            statePc = 527;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 523. */
                            {
                                if (var21 == 52) {
                                    statePc = 527;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 524. */
                                    {
                                        statePc = 528;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_522) {
                        statePc = ((Object) stateCaught_522 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_522);
                        }
                        caughtException = stateCaught_522;
                        continue scanLoop1;
                    }
                }
                case 527: {
                    try {
                        var27 = 7;
                        statePc = 528;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_527) {
                        statePc = ((Object) stateCaught_527 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_527);
                        }
                        caughtException = stateCaught_527;
                        continue scanLoop1;
                    }
                }
                case 528: {
                    try {
                        if (var21 == 50) {
                            statePc = 532;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 529. */
                            {
                                if (53 != var21) {
                                    statePc = 533;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 530. */
                                    {
                                        statePc = 532;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_528) {
                        statePc = ((Object) stateCaught_528 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_528);
                        }
                        caughtException = stateCaught_528;
                        continue scanLoop1;
                    }
                }
                case 532: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 8;
                        statePc = 533;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_532) {
                        statePc = ((Object) stateCaught_532 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_532);
                        }
                        caughtException = stateCaught_532;
                        continue scanLoop1;
                    }
                }
                case 533: {
                    try {
                        if (var21 == 54) {
                            statePc = 538;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 534. */
                            {
                                if (var21 == 57) {
                                    statePc = 538;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 535. */
                                    {
                                        statePc = 539;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_533) {
                        statePc = ((Object) stateCaught_533 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_533);
                        }
                        caughtException = stateCaught_533;
                        continue scanLoop1;
                    }
                }
                case 538: {
                    try {
                        var27 = 9;
                        statePc = 539;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_538) {
                        statePc = ((Object) stateCaught_538 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_538);
                        }
                        caughtException = stateCaught_538;
                        continue scanLoop1;
                    }
                }
                case 539: {
                    try {
                        if (var21 == 55) {
                            statePc = 543;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 540. */
                            {
                                if (var21 != 58) {
                                    statePc = 544;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 541. */
                                    {
                                        statePc = 543;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_539) {
                        statePc = ((Object) stateCaught_539 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_539);
                        }
                        caughtException = stateCaught_539;
                        continue scanLoop1;
                    }
                }
                case 543: {
                    try {
                        var25 = var25 + 2105376;
                        var27 = 10;
                        statePc = 544;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_543) {
                        statePc = ((Object) stateCaught_543 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_543);
                        }
                        caughtException = stateCaught_543;
                        continue scanLoop1;
                    }
                }
                case 544: {
                    try {
                        if (56 == var21) {
                            statePc = 548;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 545. */
                            {
                                if (var21 != 59) {
                                    statePc = 549;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 546. */
                                    {
                                        statePc = 548;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_544) {
                        statePc = ((Object) stateCaught_544 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_544);
                        }
                        caughtException = stateCaught_544;
                        continue scanLoop1;
                    }
                }
                case 548: {
                    try {
                        var27 = 11;
                        statePc = 549;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_548) {
                        statePc = ((Object) stateCaught_548 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_548);
                        }
                        caughtException = stateCaught_548;
                        continue scanLoop1;
                    }
                }
                case 549: {
                    try {
                        if (var21 == 60) {
                            statePc = 554;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 550. */
                            {
                                if (var21 == 63) {
                                    statePc = 554;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 551. */
                                    {
                                        statePc = 555;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_549) {
                        statePc = ((Object) stateCaught_549 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_549);
                        }
                        caughtException = stateCaught_549;
                        continue scanLoop1;
                    }
                }
                case 554: {
                    try {
                        var27 = 16;
                        var25 = var25 + 2105376;
                        statePc = 555;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_554) {
                        statePc = ((Object) stateCaught_554 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_554);
                        }
                        caughtException = stateCaught_554;
                        continue scanLoop1;
                    }
                }
                case 555: {
                    try {
                        if (var21 == 61) {
                            statePc = 560;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 556. */
                            {
                                if (var21 == 64) {
                                    statePc = 560;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 557. */
                                    {
                                        statePc = 561;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_555) {
                        statePc = ((Object) stateCaught_555 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_555);
                        }
                        caughtException = stateCaught_555;
                        continue scanLoop1;
                    }
                }
                case 560: {
                    try {
                        var27 = 17;
                        statePc = 561;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_560) {
                        statePc = ((Object) stateCaught_560 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_560);
                        }
                        caughtException = stateCaught_560;
                        continue scanLoop1;
                    }
                }
                case 561: {
                    try {
                        if (var21 != 62) {
                            statePc = 563;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 562. */
                            {
                                var27 = 27;
                                var25 = var25 + 2105376;
                                statePc = 563;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_561) {
                        statePc = ((Object) stateCaught_561 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_561);
                        }
                        caughtException = stateCaught_561;
                        continue scanLoop1;
                    }
                }
                case 563: {
                    try {
                        if (65 != var21) {
                            statePc = 565;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 564. */
                            {
                                var27 = 29;
                                var25 = var25 + 2105376;
                                statePc = 565;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_563) {
                        statePc = ((Object) stateCaught_563 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_563);
                        }
                        caughtException = stateCaught_563;
                        continue scanLoop1;
                    }
                }
                case 565: {
                    try {
                        if (var21 != 66) {
                            statePc = 567;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 566. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 567;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_565) {
                        statePc = ((Object) stateCaught_565 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_565);
                        }
                        caughtException = stateCaught_565;
                        continue scanLoop1;
                    }
                }
                case 567: {
                    try {
                        if (var21 != 67) {
                            statePc = 569;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 568. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 569;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_567) {
                        statePc = ((Object) stateCaught_567 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_567);
                        }
                        caughtException = stateCaught_567;
                        continue scanLoop1;
                    }
                }
                case 569: {
                    try {
                        if (var21 != 68) {
                            statePc = 571;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 570. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 571;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_569) {
                        statePc = ((Object) stateCaught_569 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_569);
                        }
                        caughtException = stateCaught_569;
                        continue scanLoop1;
                    }
                }
                case 571: {
                    try {
                        if (69 == var21) {
                            /* Inlined CFG state: 574. */
                            {
                                var29 = 2;
                                statePc = 575;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 572. */
                            {
                                statePc = 575;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_571) {
                        statePc = ((Object) stateCaught_571 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_571);
                        }
                        caughtException = stateCaught_571;
                        continue scanLoop1;
                    }
                }
                case 575: {
                    try {
                        if (var21 == 70) {
                            /* Inlined CFG state: 578. */
                            {
                                var29 = 2;
                                statePc = 579;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 576. */
                            {
                                statePc = 579;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_575) {
                        statePc = ((Object) stateCaught_575 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_575);
                        }
                        caughtException = stateCaught_575;
                        continue scanLoop1;
                    }
                }
                case 579: {
                    try {
                        if (71 == var21) {
                            /* Inlined CFG state: 582. */
                            {
                                var29 = 2;
                                statePc = 583;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 580. */
                            {
                                statePc = 583;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_579) {
                        statePc = ((Object) stateCaught_579 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_579);
                        }
                        caughtException = stateCaught_579;
                        continue scanLoop1;
                    }
                }
                case 583: {
                    try {
                        if (this.field_h == 5) {
                            /* Inlined CFG state: 586. */
                            {
                                var28 = 51;
                                if (var21 != 48) {
                                    statePc = 588;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 587. */
                                    {
                                        var25 = var25 + 2105376;
                                        var27 = 27;
                                        statePc = 588;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 584. */
                            {
                                statePc = 614;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_583) {
                        statePc = ((Object) stateCaught_583 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_583);
                        }
                        caughtException = stateCaught_583;
                        continue scanLoop1;
                    }
                }
                case 588: {
                    try {
                        if (49 != var21) {
                            statePc = 590;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 589. */
                            {
                                var27 = 29;
                                var25 = var25 + 2105376;
                                statePc = 590;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_588) {
                        statePc = ((Object) stateCaught_588 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_588);
                        }
                        caughtException = stateCaught_588;
                        continue scanLoop1;
                    }
                }
                case 590: {
                    try {
                        if (var21 != 50) {
                            statePc = 592;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 591. */
                            {
                                var27 = 30;
                                var25 = var25 + 2105376;
                                statePc = 592;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_590) {
                        statePc = ((Object) stateCaught_590 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_590);
                        }
                        caughtException = stateCaught_590;
                        continue scanLoop1;
                    }
                }
                case 592: {
                    try {
                        if (var21 == 51) {
                            /* Inlined CFG state: 595. */
                            {
                                var29 = 0;
                                var25 = var25 + 2105376;
                                statePc = 596;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 593. */
                            {
                                statePc = 596;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_592) {
                        statePc = ((Object) stateCaught_592 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_592);
                        }
                        caughtException = stateCaught_592;
                        continue scanLoop1;
                    }
                }
                case 596: {
                    try {
                        if (52 == var21) {
                            /* Inlined CFG state: 599. */
                            {
                                var25 = var25 + 2105376;
                                var29 = 0;
                                statePc = 600;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 597. */
                            {
                                statePc = 600;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_596) {
                        statePc = ((Object) stateCaught_596 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_596);
                        }
                        caughtException = stateCaught_596;
                        continue scanLoop1;
                    }
                }
                case 600: {
                    try {
                        if (53 != var21) {
                            statePc = 602;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 601. */
                            {
                                var29 = 1;
                                var25 = var25 + 2105376;
                                statePc = 602;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_600) {
                        statePc = ((Object) stateCaught_600 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_600);
                        }
                        caughtException = stateCaught_600;
                        continue scanLoop1;
                    }
                }
                case 602: {
                    try {
                        if (var21 == 54) {
                            /* Inlined CFG state: 605. */
                            {
                                var29 = 2;
                                statePc = 606;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 603. */
                            {
                                statePc = 606;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_602) {
                        statePc = ((Object) stateCaught_602 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_602);
                        }
                        caughtException = stateCaught_602;
                        continue scanLoop1;
                    }
                }
                case 606: {
                    try {
                        if (var21 == 55) {
                            /* Inlined CFG state: 609. */
                            {
                                var29 = 2;
                                statePc = 610;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 607. */
                            {
                                statePc = 610;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_606) {
                        statePc = ((Object) stateCaught_606 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_606);
                        }
                        caughtException = stateCaught_606;
                        continue scanLoop1;
                    }
                }
                case 610: {
                    try {
                        if (56 == var21) {
                            /* Inlined CFG state: 613. */
                            {
                                var29 = 2;
                                statePc = 614;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 611. */
                            {
                                statePc = 614;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_610) {
                        statePc = ((Object) stateCaught_610 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_610);
                        }
                        caughtException = stateCaught_610;
                        continue scanLoop1;
                    }
                }
                case 614: {
                    try {
                        if (var27 != -1) {
                            /* Inlined CFG state: 617. */
                            {
                                var30 = var27 >> 5;
                                var31 = -(var30 << 5) + var27;
                                if ((SpellbookCaptionGlobals.field_f[var30] & 1 << var31) != 0) {
                                    /* Inlined CFG state: 620. */
                                    {
                                        stackIn_621_0 = 0;
                                        statePc = 621;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 618. */
                                    {
                                        stackIn_621_0 = 1;
                                        statePc = 621;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 615. */
                            {
                                statePc = 622;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_614) {
                        statePc = ((Object) stateCaught_614 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_614);
                        }
                        caughtException = stateCaught_614;
                        continue scanLoop1;
                    }
                }
                case 621: {
                    try {
                        var26 = stackIn_621_0;
                        statePc = 622;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_621) {
                        statePc = ((Object) stateCaught_621 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_621);
                        }
                        caughtException = stateCaught_621;
                        continue scanLoop1;
                    }
                }
                case 622: {
                    try {
                        if (var29 == -1) {
                            statePc = 628;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 623. */
                            {
                                if (!this.isItemUnlocked(var29, 0)) {
                                    /* Inlined CFG state: 627. */
                                    {
                                        var26 = 1;
                                        statePc = 628;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 624. */
                                    {
                                        statePc = 628;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_622) {
                        statePc = ((Object) stateCaught_622 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_622);
                        }
                        caughtException = stateCaught_622;
                        continue scanLoop1;
                    }
                }
                case 628: {
                    try {
                        SoftwareRasterizer.fillRectangle(var2_int + var22 * var23 + 1, var22 * var24 + var3 + 1, 30, 30, var25);
                        if (var21 == MenuInputState.field_c[this.field_h]) {
                            /* Inlined CFG state: 631. */
                            {
                                SoftwareRasterizer.fillRectangle(1 + var2_int + var23 * var22, var3 + var22 * var24 + 1, 30, 30, 16711935 | var25);
                                statePc = 632;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 629. */
                            {
                                statePc = 632;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_628) {
                        statePc = ((Object) stateCaught_628 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_628);
                        }
                        caughtException = stateCaught_628;
                        continue scanLoop1;
                    }
                }
                case 632: {
                    try {
                        if (~var28 < ~var21) {
                            statePc = 639;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 633. */
                            {
                                if (var26 == 0) {
                                    statePc = 639;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 634. */
                                    {
                                        /* Sequential CFG blocks: 634, 636. */
                                        {
                                        }
                                        {
                                            if (-1 == var27) {
                                                /* Inlined CFG state: 646. */
                                                {
                                                    SoftwareRasterizer.fillRectangle(1 + var23 * var22 + var2_int, var3 + var22 * var24 + 1, 30, 30, 9996941);
                                                    ((Sprite) (((Object[]) (var4))[var21])).drawDownscaledAveraged(-(((Sprite) (((Object[]) (var4))[var21])).field_q / 4) + (16 + var22 * var23) + var2_int - ((Sprite) (((Object[]) (var4))[var21])).field_x / 2, -(((Sprite) (((Object[]) (var4))[var21])).field_y / 4) + var3 + (var24 * var22 + (16 - ((Sprite) (((Object[]) (var4))[var21])).field_o / 2)), 32, 32);
                                                    SoftwareRasterizer.fillRectangleAlpha(var2_int + var22 * var23 + 1, 1 + (var3 + var24 * var22), 30, 30, 0, 192);
                                                    NodeHashTable.field_d.drawDownscaledAveraged(20 + (var2_int + var22 * var23), 20 + (var3 + var22 * var24), 12, 12);
                                                    statePc = 648;
                                                    continue scanLoop1;
                                                }
                                            } else {
                                                /* Inlined CFG state: 637. */
                                                {
                                                    statePc = 639;
                                                    continue scanLoop1;
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_632) {
                        statePc = ((Object) stateCaught_632 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_632);
                        }
                        caughtException = stateCaught_632;
                        continue scanLoop1;
                    }
                }
                case 639: {
                    try {
                        if (var26 != 0) {
                            /* Inlined CFG state: 644. */
                            {
                                SoftwareRasterizer.fillRectangle(1 + (var22 * var23 + var2_int), 1 + var22 * var24 + var3, 30, 30, 9996941);
                                ((Sprite) (((Object[]) (var4))[var21])).drawDownscaledAveraged(-(((Sprite) (((Object[]) (var4))[var21])).field_q / 4) + 16 + var2_int + var23 * var22 - ((Sprite) (((Object[]) (var4))[var21])).field_x / 2, -(((Sprite) (((Object[]) (var4))[var21])).field_y / 4) + (-(((Sprite) (((Object[]) (var4))[var21])).field_o / 2) + var3) - (-(var24 * var22) - 16), 32, 32);
                                SoftwareRasterizer.fillRectangleAlpha(var2_int + var22 * var23 + 1, var3 + (var22 * var24 + 1), 30, 30, 0, 192);
                                TextLine.field_b.drawDownscaledAveraged(var2_int + var22 * var23 + 20, var24 * var22 + var3 + 20, 12, 12);
                                statePc = 648;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 640. */
                            {
                                /* Sequential CFG blocks: 640, 642. */
                                {
                                }
                                {
                                    ((Sprite) (((Object[]) (var4))[var21])).drawDownscaledAveraged(-(((Sprite) (((Object[]) (var4))[var21])).field_x / 2) + (var23 * var22 + var2_int) - (-16 + ((Sprite) (((Object[]) (var4))[var21])).field_q / 4), -(((Sprite) (((Object[]) (var4))[var21])).field_y / 4) + (16 + var3) + var22 * var24 - ((Sprite) (((Object[]) (var4))[var21])).field_o / 2, 32, 32);
                                    statePc = 648;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_639) {
                        statePc = ((Object) stateCaught_639 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_639);
                        }
                        caughtException = stateCaught_639;
                        continue scanLoop1;
                    }
                }
                case 648: {
                    try {
                        if (MembershipGlobals.field_d < 2) {
                            statePc = 650;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 649. */
                            {
                                var26 = 0;
                                statePc = 650;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_648) {
                        statePc = ((Object) stateCaught_648 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_648);
                        }
                        caughtException = stateCaught_648;
                        continue scanLoop1;
                    }
                }
                case 650: {
                    try {
                        if (~(var2_int + var23 * var22) < ~EmailLoginCredentials.field_g) {
                            statePc = 672;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 651. */
                            {
                                if (~EmailLoginCredentials.field_g <= ~(32 + var2_int + var22 * var23)) {
                                    statePc = 672;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 652. */
                                    {
                                        /* Sequential CFG blocks: 652, 654. */
                                        {
                                        }
                                        {
                                            if (~MenuButtonPanel.field_I > ~(var22 * var24 + var3)) {
                                                statePc = 672;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 655. */
                                                {
                                                    /* Sequential CFG blocks: 655, 657. */
                                                    {
                                                    }
                                                    {
                                                        if (MenuButtonPanel.field_I >= var3 + var24 * var22 + 32) {
                                                            statePc = 672;
                                                            continue scanLoop1;
                                                        } else {
                                                            /* Inlined CFG state: 658. */
                                                            {
                                                                /* Sequential CFG blocks: 658, 660. */
                                                                {
                                                                }
                                                                {
                                                                    QuickChatPhraseCache.fillCircleMasked(15, (byte) 101, 128, var2_int - (1 + (-(var23 * var22) - 17)), var24 * var22 + (var3 + 16));
                                                                    this.field_i = var21;
                                                                    this.field_m = 0;
                                                                    if (var26 == 0) {
                                                                        statePc = 665;
                                                                    } else {
                                                                        statePc = 661;
                                                                    }
                                                                    continue scanLoop1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_650) {
                        statePc = ((Object) stateCaught_650 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_650);
                        }
                        caughtException = stateCaught_650;
                        continue scanLoop1;
                    }
                }
                case 661: {
                    try {
                        /* Sequential CFG blocks: 661, 663. */
                        {
                        }
                        {
                            this.field_m = 8;
                            statePc = 665;
                            continue scanLoop1;
                        }
                    } catch (Throwable stateCaught_661) {
                        statePc = ((Object) stateCaught_661 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_661);
                        }
                        caughtException = stateCaught_661;
                        continue scanLoop1;
                    }
                }
                case 665: {
                    try {
                        if (var26 != 0) {
                            /* Inlined CFG state: 668. */
                            {
                                var19 = var23;
                                if (var29 == -1) {
                                    /* Inlined CFG state: 670. */
                                    {
                                        var18 = CachedArchiveProvider.formatTemplate(123, new String[]{TimedMessage.field_n[var27]}, ArrayWidgetContainer.field_y);
                                        statePc = 671;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 669. */
                                    {
                                        var18 = MeshModel.field_n;
                                        statePc = 671;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 666. */
                            {
                                statePc = 672;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_665) {
                        statePc = ((Object) stateCaught_665 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_665);
                        }
                        caughtException = stateCaught_665;
                        continue scanLoop1;
                    }
                }
                case 671: {
                    try {
                        var20 = var24;
                        statePc = 672;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_671) {
                        statePc = ((Object) stateCaught_671 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_671);
                        }
                        caughtException = stateCaught_671;
                        continue scanLoop1;
                    }
                }
                case 672: {
                    try {
                        var21++;
                        var24++;
                        statePc = 207;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_672) {
                        statePc = ((Object) stateCaught_672 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_672);
                        }
                        caughtException = stateCaught_672;
                        continue scanLoop1;
                    }
                }
                case 678: {
                    try {
                        discarded$3 = this.drawButtonBox(false, 180, (byte) 111, false, ValidatedTextWidget.field_I + 32, 98, 309 + QuickChatHelpers.field_a);
                        discarded$4 = this.drawButtonBox(false, 166, (byte) 79, false, 39 + ValidatedTextWidget.field_I, 29, 390 + QuickChatHelpers.field_a);
                        CachedArchiveProvider.field_t.drawParagraph(DecodedSpriteHelpers.field_f, -1 + (32 + ValidatedTextWidget.field_I + 7), 389 + QuickChatHelpers.field_a, 166, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                        CachedArchiveProvider.field_t.drawParagraph(DecodedSpriteHelpers.field_f, ValidatedTextWidget.field_I + 39, QuickChatHelpers.field_a + 390 - 2, 166, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                        CachedArchiveProvider.field_t.drawParagraph(DecodedSpriteHelpers.field_f, ValidatedTextWidget.field_I + 39, QuickChatHelpers.field_a + 390 - 1, 166, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
                        if (QuickChatCategoryCache.field_d[3] != ViewControllerHelpers.field_b[0]) {
                            statePc = 684;
                        } else {
                            statePc = 679;
                        }
                        continue scanLoop1;
                    } catch (Throwable stateCaught_678) {
                        statePc = ((Object) stateCaught_678 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_678);
                        }
                        caughtException = stateCaught_678;
                        continue scanLoop1;
                    }
                }
                case 679: {
                    try {
                        if (QuickChatCategoryCache.field_d[0] != AlternateUsernameCredentials.field_n[2]) {
                            statePc = 684;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 680. */
                            {
                                /* Sequential CFG blocks: 680, 682. */
                                {
                                }
                                {
                                    QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[3];
                                    statePc = 684;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_679) {
                        statePc = ((Object) stateCaught_679 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_679);
                        }
                        caughtException = stateCaught_679;
                        continue scanLoop1;
                    }
                }
                case 684: {
                    try {
                        if (QuickChatCategoryCache.field_d[3] != ViewControllerHelpers.field_b[0]) {
                            statePc = 690;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 685. */
                            {
                                if (QuickChatCategoryCache.field_d[1] == GameApplet.field_z[2]) {
                                    /* Inlined CFG state: 689. */
                                    {
                                        QuickChatCategoryCache.field_d[1] = GameApplet.field_z[3];
                                        statePc = 690;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 686. */
                                    {
                                        statePc = 690;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_684) {
                        statePc = ((Object) stateCaught_684 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_684);
                        }
                        caughtException = stateCaught_684;
                        continue scanLoop1;
                    }
                }
                case 690: {
                    try {
                        if (QuickChatCategoryCache.field_d[3] != ViewControllerHelpers.field_b[2]) {
                            statePc = 696;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 691. */
                            {
                                if (QuickChatCategoryCache.field_d[0] == AlternateUsernameCredentials.field_n[12]) {
                                    /* Inlined CFG state: 695. */
                                    {
                                        QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[13];
                                        statePc = 696;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 692. */
                                    {
                                        statePc = 696;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_690) {
                        statePc = ((Object) stateCaught_690 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_690);
                        }
                        caughtException = stateCaught_690;
                        continue scanLoop1;
                    }
                }
                case 696: {
                    try {
                        if (QuickChatCategoryCache.field_d[3] != ViewControllerHelpers.field_b[2]) {
                            statePc = 702;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 697. */
                            {
                                if (GameApplet.field_z[12] == QuickChatCategoryCache.field_d[1]) {
                                    /* Inlined CFG state: 701. */
                                    {
                                        QuickChatCategoryCache.field_d[1] = GameApplet.field_z[13];
                                        statePc = 702;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 698. */
                                    {
                                        statePc = 702;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_696) {
                        statePc = ((Object) stateCaught_696 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_696);
                        }
                        caughtException = stateCaught_696;
                        continue scanLoop1;
                    }
                }
                case 702: {
                    try {
                        if (ViewControllerHelpers.field_b[3] != QuickChatCategoryCache.field_d[3]) {
                            statePc = 708;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 703. */
                            {
                                if (GameApplet.field_z[12] != QuickChatCategoryCache.field_d[1]) {
                                    statePc = 708;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 704. */
                                    {
                                        /* Sequential CFG blocks: 704, 706. */
                                        {
                                        }
                                        {
                                            QuickChatCategoryCache.field_d[1] = GameApplet.field_z[14];
                                            statePc = 708;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_702) {
                        statePc = ((Object) stateCaught_702 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_702);
                        }
                        caughtException = stateCaught_702;
                        continue scanLoop1;
                    }
                }
                case 708: {
                    try {
                        if (ViewControllerHelpers.field_b[3] != QuickChatCategoryCache.field_d[3]) {
                            statePc = 714;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 709. */
                            {
                                if (AlternateUsernameCredentials.field_n[12] != QuickChatCategoryCache.field_d[0]) {
                                    statePc = 714;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 710. */
                                    {
                                        /* Sequential CFG blocks: 710, 712. */
                                        {
                                        }
                                        {
                                            QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[14];
                                            statePc = 714;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_708) {
                        statePc = ((Object) stateCaught_708 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_708);
                        }
                        caughtException = stateCaught_708;
                        continue scanLoop1;
                    }
                }
                case 714: {
                    try {
                        if (QuickChatCategoryCache.field_d[3] != ViewControllerHelpers.field_b[3]) {
                            statePc = 720;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 715. */
                            {
                                if (GameApplet.field_z[13] == QuickChatCategoryCache.field_d[1]) {
                                    /* Inlined CFG state: 719. */
                                    {
                                        QuickChatCategoryCache.field_d[1] = GameApplet.field_z[14];
                                        statePc = 720;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 716. */
                                    {
                                        statePc = 720;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_714) {
                        statePc = ((Object) stateCaught_714 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_714);
                        }
                        caughtException = stateCaught_714;
                        continue scanLoop1;
                    }
                }
                case 720: {
                    try {
                        if (ViewControllerHelpers.field_b[3] != QuickChatCategoryCache.field_d[3]) {
                            statePc = 726;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 721. */
                            {
                                if (AlternateUsernameCredentials.field_n[13] == QuickChatCategoryCache.field_d[0]) {
                                    /* Inlined CFG state: 725. */
                                    {
                                        QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[14];
                                        statePc = 726;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 722. */
                                    {
                                        statePc = 726;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_720) {
                        statePc = ((Object) stateCaught_720 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_720);
                        }
                        caughtException = stateCaught_720;
                        continue scanLoop1;
                    }
                }
                case 726: {
                    try {
                        SoftwareRasterizer.drawRectangle(ValidatedTextWidget.field_I + 58, QuickChatHelpers.field_a + 317, 131, 67, 16777215);
                        SoftwareRasterizer.fillRectangle(59 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 318, 129, 65, 0);
                        var23 = 0;
                        statePc = 727;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_726) {
                        statePc = ((Object) stateCaught_726 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_726);
                        }
                        caughtException = stateCaught_726;
                        continue scanLoop1;
                    }
                }
                case 727: {
                    try {
                        stackIn_728_0 = ~var23;
                        stackIn_728_1 = -9;
                        statePc = 728;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_727) {
                        statePc = ((Object) stateCaught_727 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_727);
                        }
                        caughtException = stateCaught_727;
                        continue scanLoop1;
                    }
                }
                case 728: {
                    try {
                        if (stackIn_728_0 <= stackIn_728_1) {
                            /* Inlined CFG state: 779. */
                            {
                                discarded$5 = this.drawButtonBox(false, 180, (byte) 106, false, ValidatedTextWidget.field_I + 225, 98, 309 + QuickChatHelpers.field_a);
                                discarded$6 = this.drawButtonBox(false, 166, (byte) -98, false, 232 + ValidatedTextWidget.field_I, 29, QuickChatHelpers.field_a + 390);
                                CachedArchiveProvider.field_t.drawParagraph(GameSelectionHelpers.field_j, 6 + (ValidatedTextWidget.field_I + 225), -1 + (QuickChatHelpers.field_a + 390), 166, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                                CachedArchiveProvider.field_t.drawParagraph(GameSelectionHelpers.field_j, 7 + (225 + ValidatedTextWidget.field_I), -2 + QuickChatHelpers.field_a + 390, 166, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                                CachedArchiveProvider.field_t.drawParagraph(GameSelectionHelpers.field_j, ValidatedTextWidget.field_I + 225 + 7, -1 + (QuickChatHelpers.field_a + 390), 166, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
                                SoftwareRasterizer.drawRectangle(248 + ValidatedTextWidget.field_I, 317 + QuickChatHelpers.field_a, 131, 67, 16777215);
                                SoftwareRasterizer.fillRectangle(249 + ValidatedTextWidget.field_I, 318 + QuickChatHelpers.field_a, 129, 65, 0);
                                var23 = 0;
                                statePc = 780;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 729. */
                            {
                                var24 = 0;
                                statePc = 730;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_728) {
                        statePc = ((Object) stateCaught_728 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_728);
                        }
                        caughtException = stateCaught_728;
                        continue scanLoop1;
                    }
                }
                case 730: {
                    try {
                        if (4 <= var24) {
                            /* Inlined CFG state: 778. */
                            {
                                var23++;
                                statePc = 727;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 731. */
                            {
                                var25 = var24 * 8 + var23;
                                var3 = QuickChatHelpers.field_a + 319 + var24 * 16;
                                var2_int = var23 * 16 + ValidatedTextWidget.field_I + 60;
                                var26 = (AlternateUsernameCredentials.field_n[var25][0] << 16) + (AlternateUsernameCredentials.field_n[var25][2] + (AlternateUsernameCredentials.field_n[var25][1] << 8));
                                SoftwareRasterizer.fillRectangle(var2_int, var3, 15, 15, var26);
                                stackIn_728_0 = -3;
                                stackIn_732_0 = stackIn_728_0;
                                stackIn_728_1 = ~var25;
                                stackIn_732_1 = stackIn_728_1;
                                if (false) {
                                    statePc = 728;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 732. */
                                    {
                                        if (stackIn_732_0 != stackIn_732_1) {
                                            statePc = 738;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 733. */
                                            {
                                                if (QuickChatCategoryCache.field_d[3] == ViewControllerHelpers.field_b[0]) {
                                                    /* Inlined CFG state: 737. */
                                                    {
                                                        var26 = 0;
                                                        statePc = 738;
                                                        continue scanLoop1;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 734. */
                                                    {
                                                        statePc = 738;
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_730) {
                        statePc = ((Object) stateCaught_730 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_730);
                        }
                        caughtException = stateCaught_730;
                        continue scanLoop1;
                    }
                }
                case 738: {
                    try {
                        if (12 != var25) {
                            statePc = 743;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 739. */
                            {
                                if (QuickChatCategoryCache.field_d[3] != ViewControllerHelpers.field_b[2]) {
                                    statePc = 743;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 740. */
                                    {
                                        /* Sequential CFG blocks: 740, 742. */
                                        {
                                        }
                                        {
                                            var26 = 0;
                                            statePc = 743;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_738) {
                        statePc = ((Object) stateCaught_738 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_738);
                        }
                        caughtException = stateCaught_738;
                        continue scanLoop1;
                    }
                }
                case 743: {
                    try {
                        if (var25 != 12) {
                            statePc = 748;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 744. */
                            {
                                if (QuickChatCategoryCache.field_d[3] != ViewControllerHelpers.field_b[3]) {
                                    statePc = 748;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 745. */
                                    {
                                        /* Sequential CFG blocks: 745, 747. */
                                        {
                                        }
                                        {
                                            var26 = 0;
                                            statePc = 748;
                                            continue scanLoop1;
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_743) {
                        statePc = ((Object) stateCaught_743 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_743);
                        }
                        caughtException = stateCaught_743;
                        continue scanLoop1;
                    }
                }
                case 748: {
                    try {
                        if (var25 != 13) {
                            statePc = 754;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 749. */
                            {
                                if (QuickChatCategoryCache.field_d[3] == ViewControllerHelpers.field_b[3]) {
                                    /* Inlined CFG state: 753. */
                                    {
                                        var26 = 0;
                                        statePc = 754;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 750. */
                                    {
                                        statePc = 754;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_748) {
                        statePc = ((Object) stateCaught_748 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_748);
                        }
                        caughtException = stateCaught_748;
                        continue scanLoop1;
                    }
                }
                case 754: {
                    try {
                        if (var26 == 0) {
                            /* Inlined CFG state: 757. */
                            {
                                SoftwareRasterizer.drawLine(var2_int, var3, var2_int + 14, var3 + 14, 16711680);
                                SoftwareRasterizer.drawLine(var2_int + 1, var3, var2_int + 14, var3 + 13, 0);
                                SoftwareRasterizer.drawLine(var2_int, 1 + var3, var2_int + 13, var3 + 14, 0);
                                SoftwareRasterizer.drawLine(var2_int, var3 + 14, var2_int + 14, var3, 16711680);
                                SoftwareRasterizer.drawLine(var2_int + 1, var3 + 14, 14 + var2_int, 1 + var3, 0);
                                SoftwareRasterizer.drawLine(var2_int, 13 + var3, 13 + var2_int, var3, 0);
                                statePc = 758;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 755. */
                            {
                                statePc = 758;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_754) {
                        statePc = ((Object) stateCaught_754 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_754);
                        }
                        caughtException = stateCaught_754;
                        continue scanLoop1;
                    }
                }
                case 758: {
                    try {
                        if (EmailLoginCredentials.field_g < var2_int) {
                            statePc = 773;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 759. */
                            {
                                if (MenuButtonPanel.field_I < var3) {
                                    statePc = 773;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 760. */
                                    {
                                        /* Sequential CFG blocks: 760, 762. */
                                        {
                                        }
                                        {
                                            if (~EmailLoginCredentials.field_g <= ~(var2_int + 15)) {
                                                statePc = 773;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 763. */
                                                {
                                                    /* Sequential CFG blocks: 763, 765. */
                                                    {
                                                    }
                                                    {
                                                        if (MenuButtonPanel.field_I >= var3 + 15) {
                                                            statePc = 773;
                                                            continue scanLoop1;
                                                        } else {
                                                            /* Inlined CFG state: 766. */
                                                            {
                                                                /* Sequential CFG blocks: 766, 768. */
                                                                {
                                                                }
                                                                {
                                                                    if (var26 != 0) {
                                                                        statePc = 772;
                                                                    } else {
                                                                        statePc = 769;
                                                                    }
                                                                    continue scanLoop1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_758) {
                        statePc = ((Object) stateCaught_758 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_758);
                        }
                        caughtException = stateCaught_758;
                        continue scanLoop1;
                    }
                }
                case 769: {
                    try {
                        statePc = 773;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_769) {
                        statePc = ((Object) stateCaught_769 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_769);
                        }
                        caughtException = stateCaught_769;
                        continue scanLoop1;
                    }
                }
                case 772: {
                    try {
                        SoftwareRasterizer.drawRectangle(var2_int - 1, var3 - 1, 17, 17, 16777215);
                        this.field_m = 2;
                        this.field_i = var25;
                        statePc = 773;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_772) {
                        statePc = ((Object) stateCaught_772 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_772);
                        }
                        caughtException = stateCaught_772;
                        continue scanLoop1;
                    }
                }
                case 773: {
                    try {
                        if (AlternateUsernameCredentials.field_n[var25] == QuickChatCategoryCache.field_d[0]) {
                            /* Inlined CFG state: 776. */
                            {
                                SoftwareRasterizer.drawThickRectangleAlpha(var2_int - 1, var3 - 1, 17, 17, 2, 16777215, 128);
                                statePc = 777;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 774. */
                            {
                                statePc = 777;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_773) {
                        statePc = ((Object) stateCaught_773 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_773);
                        }
                        caughtException = stateCaught_773;
                        continue scanLoop1;
                    }
                }
                case 777: {
                    try {
                        var24++;
                        statePc = 730;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_777) {
                        statePc = ((Object) stateCaught_777 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_777);
                        }
                        caughtException = stateCaught_777;
                        continue scanLoop1;
                    }
                }
                case 780: {
                    try {
                        stackIn_781_0 = var23;
                        stackIn_781_1 = 8;
                        statePc = 781;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_780) {
                        statePc = ((Object) stateCaught_780 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_780);
                        }
                        caughtException = stateCaught_780;
                        continue scanLoop1;
                    }
                }
                case 781: {
                    try {
                        if (stackIn_781_0 >= stackIn_781_1) {
                            /* Inlined CFG state: 833. */
                            {
                                var23 = 79;
                                var24 = 424;
                                if (LinkButtonPainter.field_f == 3) {
                                    /* Inlined CFG state: 836. */
                                    {
                                        var23 += 14;
                                        var24 -= 7;
                                        statePc = 837;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 834. */
                                    {
                                        statePc = 837;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        } else {
                            /* Inlined CFG state: 782. */
                            {
                                var24 = 0;
                                statePc = 783;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_781) {
                        statePc = ((Object) stateCaught_781 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_781);
                        }
                        caughtException = stateCaught_781;
                        continue scanLoop1;
                    }
                }
                case 783: {
                    try {
                        if (var24 >= 4) {
                            /* Inlined CFG state: 832. */
                            {
                                var23++;
                                statePc = 780;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 784. */
                            {
                                var25 = 8 * var24 + var23;
                                var26 = (GameApplet.field_z[var25][0] << 16) + (GameApplet.field_z[var25][2] + (GameApplet.field_z[var25][1] << 8));
                                var3 = var24 * 16 + 319 + QuickChatHelpers.field_a;
                                var2_int = 250 + ValidatedTextWidget.field_I + 16 * var23;
                                SoftwareRasterizer.fillRectangle(var2_int, var3, 15, 15, var26);
                                stackIn_781_0 = 2;
                                stackIn_785_0 = stackIn_781_0;
                                stackIn_781_1 = var25;
                                stackIn_785_1 = stackIn_781_1;
                                if (false) {
                                    statePc = 781;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 785. */
                                    {
                                        if (stackIn_785_0 != stackIn_785_1) {
                                            statePc = 791;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 786. */
                                            {
                                                if (QuickChatCategoryCache.field_d[3] == ViewControllerHelpers.field_b[0]) {
                                                    /* Inlined CFG state: 790. */
                                                    {
                                                        var26 = 0;
                                                        statePc = 791;
                                                        continue scanLoop1;
                                                    }
                                                } else {
                                                    /* Inlined CFG state: 787. */
                                                    {
                                                        statePc = 791;
                                                        continue scanLoop1;
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_783) {
                        statePc = ((Object) stateCaught_783 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_783);
                        }
                        caughtException = stateCaught_783;
                        continue scanLoop1;
                    }
                }
                case 791: {
                    try {
                        if (var25 != 12) {
                            statePc = 797;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 792. */
                            {
                                if (QuickChatCategoryCache.field_d[3] == ViewControllerHelpers.field_b[2]) {
                                    /* Inlined CFG state: 796. */
                                    {
                                        var26 = 0;
                                        statePc = 797;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 793. */
                                    {
                                        statePc = 797;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_791) {
                        statePc = ((Object) stateCaught_791 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_791);
                        }
                        caughtException = stateCaught_791;
                        continue scanLoop1;
                    }
                }
                case 797: {
                    try {
                        if (var25 != 12) {
                            statePc = 803;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 798. */
                            {
                                if (QuickChatCategoryCache.field_d[3] == ViewControllerHelpers.field_b[3]) {
                                    /* Inlined CFG state: 802. */
                                    {
                                        var26 = 0;
                                        statePc = 803;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 799. */
                                    {
                                        statePc = 803;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_797) {
                        statePc = ((Object) stateCaught_797 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_797);
                        }
                        caughtException = stateCaught_797;
                        continue scanLoop1;
                    }
                }
                case 803: {
                    try {
                        if (var25 != 13) {
                            statePc = 809;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 804. */
                            {
                                if (ViewControllerHelpers.field_b[3] == QuickChatCategoryCache.field_d[3]) {
                                    /* Inlined CFG state: 808. */
                                    {
                                        var26 = 0;
                                        statePc = 809;
                                        continue scanLoop1;
                                    }
                                } else {
                                    /* Inlined CFG state: 805. */
                                    {
                                        statePc = 809;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_803) {
                        statePc = ((Object) stateCaught_803 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_803);
                        }
                        caughtException = stateCaught_803;
                        continue scanLoop1;
                    }
                }
                case 809: {
                    try {
                        if (var26 != 0) {
                            statePc = 812;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 810. */
                            {
                                SoftwareRasterizer.drawLine(var2_int, var3, 14 + var2_int, var3 + 14, 16711680);
                                SoftwareRasterizer.drawLine(1 + var2_int, var3, 14 + var2_int, var3 + 13, 0);
                                SoftwareRasterizer.drawLine(var2_int, var3 + 1, var2_int + 13, var3 + 14, 0);
                                SoftwareRasterizer.drawLine(var2_int, var3 + 14, var2_int + 14, var3, 16711680);
                                SoftwareRasterizer.drawLine(var2_int + 1, var3 + 14, 14 + var2_int, var3 + 1, 0);
                                SoftwareRasterizer.drawLine(var2_int, var3 + 13, 13 + var2_int, var3, 0);
                                statePc = 812;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_809) {
                        statePc = ((Object) stateCaught_809 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_809);
                        }
                        caughtException = stateCaught_809;
                        continue scanLoop1;
                    }
                }
                case 812: {
                    try {
                        if (~EmailLoginCredentials.field_g > ~var2_int) {
                            statePc = 827;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 813. */
                            {
                                if (~MenuButtonPanel.field_I > ~var3) {
                                    statePc = 827;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 814. */
                                    {
                                        /* Sequential CFG blocks: 814, 816. */
                                        {
                                        }
                                        {
                                            if (~(15 + var2_int) >= ~EmailLoginCredentials.field_g) {
                                                statePc = 827;
                                                continue scanLoop1;
                                            } else {
                                                /* Inlined CFG state: 817. */
                                                {
                                                    /* Sequential CFG blocks: 817, 819. */
                                                    {
                                                    }
                                                    {
                                                        if (~(var3 + 15) >= ~MenuButtonPanel.field_I) {
                                                            statePc = 827;
                                                            continue scanLoop1;
                                                        } else {
                                                            /* Inlined CFG state: 820. */
                                                            {
                                                                /* Sequential CFG blocks: 820, 822. */
                                                                {
                                                                }
                                                                {
                                                                    if (var26 == 0) {
                                                                        statePc = 827;
                                                                    } else {
                                                                        statePc = 823;
                                                                    }
                                                                    continue scanLoop1;
                                                                }
                                                            }
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_812) {
                        statePc = ((Object) stateCaught_812 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_812);
                        }
                        caughtException = stateCaught_812;
                        continue scanLoop1;
                    }
                }
                case 823: {
                    try {
                        /* Sequential CFG blocks: 823, 825. */
                        {
                        }
                        {
                            SoftwareRasterizer.drawRectangle(-1 + var2_int, -1 + var3, 17, 17, 16777215);
                            this.field_i = var25;
                            this.field_m = 3;
                            statePc = 827;
                            continue scanLoop1;
                        }
                    } catch (Throwable stateCaught_823) {
                        statePc = ((Object) stateCaught_823 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_823);
                        }
                        caughtException = stateCaught_823;
                        continue scanLoop1;
                    }
                }
                case 827: {
                    try {
                        if (QuickChatCategoryCache.field_d[1] == GameApplet.field_z[var25]) {
                            /* Inlined CFG state: 830. */
                            {
                                SoftwareRasterizer.drawThickRectangleAlpha(var2_int - 1, var3 - 1, 17, 17, 2, 16777215, 128);
                                statePc = 831;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 828. */
                            {
                                statePc = 831;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_827) {
                        statePc = ((Object) stateCaught_827 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_827);
                        }
                        caughtException = stateCaught_827;
                        continue scanLoop1;
                    }
                }
                case 831: {
                    try {
                        var24++;
                        statePc = 783;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_831) {
                        statePc = ((Object) stateCaught_831 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_831);
                        }
                        caughtException = stateCaught_831;
                        continue scanLoop1;
                    }
                }
                case 837: {
                    try {
                        discarded$7 = this.drawButtonBox(false, 93, (byte) -106, false, ValidatedTextWidget.field_I + 417, 98, QuickChatHelpers.field_a + 309);
                        discarded$8 = this.drawButtonBox(false, var23, (byte) -96, false, var24 + ValidatedTextWidget.field_I, 29, QuickChatHelpers.field_a + 390);
                        CachedArchiveProvider.field_t.drawParagraph(NameTable.field_j, -1 + ValidatedTextWidget.field_I + var24, QuickChatHelpers.field_a + 390 - 1, var23, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                        CachedArchiveProvider.field_t.drawParagraph(NameTable.field_j, var24 + ValidatedTextWidget.field_I, 390 + (QuickChatHelpers.field_a - 2), var23, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                        CachedArchiveProvider.field_t.drawParagraph(NameTable.field_j, var24 + ValidatedTextWidget.field_I, -1 + (QuickChatHelpers.field_a + 390), var23, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
                        SoftwareRasterizer.drawRectangle(431 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 317, 67, 67, 16777215);
                        SoftwareRasterizer.fillRectangle(ValidatedTextWidget.field_I + 432, QuickChatHelpers.field_a + 318, 65, 65, 0);
                        var25 = 0;
                        statePc = 838;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_837) {
                        statePc = ((Object) stateCaught_837 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_837);
                        }
                        caughtException = stateCaught_837;
                        continue scanLoop1;
                    }
                }
                case 838: {
                    try {
                        stackIn_839_0 = -5;
                        stackIn_839_1 = ~var25;
                        statePc = 839;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_838) {
                        statePc = ((Object) stateCaught_838 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_838);
                        }
                        caughtException = stateCaught_838;
                        continue scanLoop1;
                    }
                }
                case 839: {
                    try {
                        if (stackIn_839_0 >= stackIn_839_1) {
                            /* Inlined CFG state: 860. */
                            {
                                discarded$9 = this.drawButtonBox(false, 93, (byte) 93, false, 520 + ValidatedTextWidget.field_I, 98, 309 + QuickChatHelpers.field_a);
                                discarded$10 = this.drawButtonBox(false, 79, (byte) 121, false, 7 + ValidatedTextWidget.field_I + 520, 29, 390 + QuickChatHelpers.field_a);
                                CachedArchiveProvider.field_t.drawParagraph(ProxySocketConnector.field_l, 7 + ValidatedTextWidget.field_I + 520 - 1, 389 + QuickChatHelpers.field_a, 79, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                                CachedArchiveProvider.field_t.drawParagraph(ProxySocketConnector.field_l, ValidatedTextWidget.field_I + 527, 390 + QuickChatHelpers.field_a - 2, 79, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                                CachedArchiveProvider.field_t.drawParagraph(ProxySocketConnector.field_l, ValidatedTextWidget.field_I + 520 + 7, -1 + QuickChatHelpers.field_a + 390, 79, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
                                SoftwareRasterizer.drawRectangle(535 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 333, 67, 35, 16777215);
                                SoftwareRasterizer.fillRectangle(ValidatedTextWidget.field_I + 536, QuickChatHelpers.field_a + 318 + 16, 65, 33, 0);
                                var25 = 0;
                                statePc = 861;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 840. */
                            {
                                var26 = 0;
                                statePc = 841;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_839) {
                        statePc = ((Object) stateCaught_839 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_839);
                        }
                        caughtException = stateCaught_839;
                        continue scanLoop1;
                    }
                }
                case 841: {
                    try {
                        if (var26 >= 4) {
                            /* Inlined CFG state: 859. */
                            {
                                var25++;
                                statePc = 838;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 842. */
                            {
                                var27 = var25 + var26 * 4;
                                var2_int = var25 * 16 + (ValidatedTextWidget.field_I + 433);
                                var28 = (IsaacCipher.field_d[var27][0] << 16) + (IsaacCipher.field_d[var27][2] + (IsaacCipher.field_d[var27][1] << 8));
                                var3 = 16 * var26 + 319 + QuickChatHelpers.field_a;
                                SoftwareRasterizer.fillRectangle(var2_int, var3, 15, 15, var28);
                                stackIn_839_0 = ~EmailLoginCredentials.field_g;
                                stackIn_843_0 = stackIn_839_0;
                                stackIn_839_1 = ~var2_int;
                                stackIn_843_1 = stackIn_839_1;
                                if (false) {
                                    statePc = 839;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 843. */
                                    {
                                        if (stackIn_843_0 > stackIn_843_1) {
                                            statePc = 855;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 844. */
                                            {
                                                if (var3 > MenuButtonPanel.field_I) {
                                                    statePc = 855;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 845. */
                                                    {
                                                        /* Sequential CFG blocks: 845, 847. */
                                                        {
                                                        }
                                                        {
                                                            if (15 + var2_int <= EmailLoginCredentials.field_g) {
                                                                statePc = 855;
                                                            } else {
                                                                statePc = 848;
                                                            }
                                                            continue scanLoop1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_841) {
                        statePc = ((Object) stateCaught_841 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_841);
                        }
                        caughtException = stateCaught_841;
                        continue scanLoop1;
                    }
                }
                case 848: {
                    try {
                        /* Sequential CFG blocks: 848, 850. */
                        {
                        }
                        {
                            if (MenuButtonPanel.field_I >= var3 + 15) {
                                statePc = 855;
                                continue scanLoop1;
                            } else {
                                /* Inlined CFG state: 851. */
                                {
                                    /* Sequential CFG blocks: 851, 853. */
                                    {
                                    }
                                    {
                                        SoftwareRasterizer.drawRectangle(var2_int - 1, var3 - 1, 17, 17, 16777215);
                                        this.field_i = var27;
                                        this.field_m = 4;
                                        statePc = 855;
                                        continue scanLoop1;
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_848) {
                        statePc = ((Object) stateCaught_848 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_848);
                        }
                        caughtException = stateCaught_848;
                        continue scanLoop1;
                    }
                }
                case 855: {
                    try {
                        if (QuickChatCategoryCache.field_d[2] != IsaacCipher.field_d[var27]) {
                            statePc = 858;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 856. */
                            {
                                SoftwareRasterizer.drawThickRectangleAlpha(var2_int - 1, -1 + var3, 17, 17, 2, 16777215, 128);
                                statePc = 858;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_855) {
                        statePc = ((Object) stateCaught_855 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_855);
                        }
                        caughtException = stateCaught_855;
                        continue scanLoop1;
                    }
                }
                case 858: {
                    try {
                        var26++;
                        statePc = 841;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_858) {
                        statePc = ((Object) stateCaught_858 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_858);
                        }
                        caughtException = stateCaught_858;
                        continue scanLoop1;
                    }
                }
                case 861: {
                    try {
                        stackIn_862_0 = 4;
                        stackIn_862_1 = var25;
                        statePc = 862;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_861) {
                        statePc = ((Object) stateCaught_861 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_861);
                        }
                        caughtException = stateCaught_861;
                        continue scanLoop1;
                    }
                }
                case 862: {
                    try {
                        if (stackIn_862_0 <= stackIn_862_1) {
                            statePc = 885;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 863. */
                            {
                                var26 = 0;
                                statePc = 864;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_862) {
                        statePc = ((Object) stateCaught_862 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_862);
                        }
                        caughtException = stateCaught_862;
                        continue scanLoop1;
                    }
                }
                case 864: {
                    try {
                        if (var26 >= 2) {
                            /* Inlined CFG state: 882. */
                            {
                                var25++;
                                statePc = 861;
                                continue scanLoop1;
                            }
                        } else {
                            /* Inlined CFG state: 865. */
                            {
                                var27 = 4 * var26 + var25;
                                var3 = var26 * 16 + QuickChatHelpers.field_a + 335;
                                var2_int = var25 * 16 + ValidatedTextWidget.field_I + 537;
                                var28 = (ViewControllerHelpers.field_b[var27][0] << 16) + (ViewControllerHelpers.field_b[var27][1] << 8) + ViewControllerHelpers.field_b[var27][2];
                                SoftwareRasterizer.fillRectangle(var2_int, var3, 15, 15, var28);
                                stackIn_862_0 = ~EmailLoginCredentials.field_g;
                                stackIn_866_0 = stackIn_862_0;
                                stackIn_862_1 = ~var2_int;
                                stackIn_866_1 = stackIn_862_1;
                                if (false) {
                                    statePc = 862;
                                    continue scanLoop1;
                                } else {
                                    /* Inlined CFG state: 866. */
                                    {
                                        if (stackIn_866_0 > stackIn_866_1) {
                                            statePc = 878;
                                            continue scanLoop1;
                                        } else {
                                            /* Inlined CFG state: 867. */
                                            {
                                                if (var3 > MenuButtonPanel.field_I) {
                                                    statePc = 878;
                                                    continue scanLoop1;
                                                } else {
                                                    /* Inlined CFG state: 868. */
                                                    {
                                                        /* Sequential CFG blocks: 868, 870. */
                                                        {
                                                        }
                                                        {
                                                            if (~EmailLoginCredentials.field_g <= ~(15 + var2_int)) {
                                                                statePc = 878;
                                                            } else {
                                                                statePc = 871;
                                                            }
                                                            continue scanLoop1;
                                                        }
                                                    }
                                                }
                                            }
                                        }
                                    }
                                }
                            }
                        }
                    } catch (Throwable stateCaught_864) {
                        statePc = ((Object) stateCaught_864 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_864);
                        }
                        caughtException = stateCaught_864;
                        continue scanLoop1;
                    }
                }
                case 871: {
                    try {
                        /* Sequential CFG blocks: 871, 873. */
                        {
                        }
                        {
                            if (~(var3 + 15) < ~MenuButtonPanel.field_I) {
                                /* Inlined CFG state: 877. */
                                {
                                    SoftwareRasterizer.drawRectangle(var2_int - 1, -1 + var3, 17, 17, 16777215);
                                    this.field_i = var27;
                                    this.field_m = 5;
                                    statePc = 878;
                                    continue scanLoop1;
                                }
                            } else {
                                /* Inlined CFG state: 874. */
                                {
                                    statePc = 878;
                                    continue scanLoop1;
                                }
                            }
                        }
                    } catch (Throwable stateCaught_871) {
                        statePc = ((Object) stateCaught_871 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_871);
                        }
                        caughtException = stateCaught_871;
                        continue scanLoop1;
                    }
                }
                case 878: {
                    try {
                        if (ViewControllerHelpers.field_b[var27] != QuickChatCategoryCache.field_d[3]) {
                            statePc = 881;
                            continue scanLoop1;
                        } else {
                            /* Inlined CFG state: 879. */
                            {
                                SoftwareRasterizer.drawThickRectangleAlpha(-1 + var2_int, -1 + var3, 17, 17, 2, 16777215, 128);
                                statePc = 881;
                                continue scanLoop1;
                            }
                        }
                    } catch (Throwable stateCaught_878) {
                        statePc = ((Object) stateCaught_878 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_878);
                        }
                        caughtException = stateCaught_878;
                        continue scanLoop1;
                    }
                }
                case 881: {
                    try {
                        var26++;
                        statePc = 864;
                        continue scanLoop1;
                    } catch (Throwable stateCaught_881) {
                        statePc = ((Object) stateCaught_881 instanceof RuntimeException ? 884 : -1);
                        if (statePc == -1) {
                            throw MenuScreen.<RuntimeException>sneakyThrow(stateCaught_881);
                        }
                        caughtException = stateCaught_881;
                        continue scanLoop1;
                    }
                }
                case 884: {
                    var2 = (RuntimeException) ((Object) caughtException);
                    throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.P(" + param0 + ')');
                }
                case 885: {
                    return;
                }
                default: throw new IllegalStateException("invalid CFG state " + statePc);
            }
        }
    }

    private final void performItemAction(boolean param0, int param1, boolean param2) {
        int stackIn_125_0 = 0;
        boolean stackIn_126_1 = false;
        int stackIn_134_0 = 0;
        boolean stackIn_135_1 = false;
        int stackIn_155_0 = 0;
        boolean stackIn_156_1 = false;
        MenuInputState stackIn_187_0 = null;
        boolean stackIn_188_1 = false;
        MenuInputState stackIn_299_0 = null;
        boolean stackIn_300_1 = false;
        MenuInputState stackIn_309_0 = null;
        boolean stackIn_310_1 = false;
        MenuInputState stackIn_329_0 = null;
        boolean stackIn_330_1 = false;
        MenuInputState stackIn_355_0 = null;
        boolean stackIn_356_1 = false;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        int var7Lifetime1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param2) {
            this.activateItem(false, 127, (byte) 126);
          }
          var4_int = NumericDateInputWidget.field_L[this.field_l][param1];
          var6 = var4_int;
          if (var6 != 0) {
            if (1 != var6) {
              boolean decompiledFrameRemainder0 = true;
              if (var6 != 2) {
                if (var6 == 7) {
                  if (!this.field_g.isActivatePressed(true)) {
                    return;
                  }
                  var6 = param0 ? 1 : 0;
                  stackIn_134_0 = var6;
                  stackIn_135_1 = !(param2);
                  ScreenSwitchHelpers.switchScreen(stackIn_134_0 != 0, stackIn_135_1, 0, MatchingFieldValidator.field_r);
                  MusicCrossfadeStream.field_A = false;
                  DecimalCheckHelpers.field_h = true;
                  return;
                }
                if (var6 == 24) {
                  if (!this.field_g.isActivatePressed(true)) {
                    return;
                  }
                  var6 = param0 ? 1 : 0;
                  ScreenSwitchHelpers.switchScreen(var6 != 0, true, 10, MatchingFieldValidator.field_r);
                  SceneTabStrip.field_Cb = true;
                  return;
                }
                if (var6 != 22) {
                  if (var6 == 14) {
                    if (!this.field_g.isActivatePressed(true)) {
                      return;
                    }
                    var6 = param0 ? 1 : 0;
                    stackIn_155_0 = var6;
                    stackIn_156_1 = !(param2);
                    ScreenSwitchHelpers.switchScreen(stackIn_155_0 != 0, stackIn_156_1, 15, MatchingFieldValidator.field_r);
                    return;
                  }
                  if (15 == var6) {
                    if (this.field_g.isActivatePressed(true)) {
                      if (!MenuScreen.getSessionFlag((byte) 112) &&
                        AccountFlowHelpers.field_c > 0) {
                        return;
                      }
                      var6 = param0 ? 1 : 0;
                      ScreenSwitchHelpers.switchScreen(var6 != 0, true, 16, MatchingFieldValidator.field_r);
                      return;
                    }
                  } else {
                    if (var6 == 5) {
                      if (!this.field_g.isActivatePressed(true)) {
                        return;
                      }
                      SecondaryNodeDequeIterator.field_e = 0;
                      var6 = param0 ? 1 : 0;
                      ScreenSwitchHelpers.switchScreen(var6 != 0, true, 7, MatchingFieldValidator.field_r);
                      return;
                    }
                    if (8 == var6) {
                      if (!this.field_g.isActivatePressed(true)) {
                        return;
                      }
                      var6 = NameTable.field_f;
                      var7 = param0 ? 1 : 0;
                      ScreenSwitchHelpers.switchScreen(var7 != 0, true, var6, MatchingFieldValidator.field_r);
                      return;
                    }
                    if (var6 != 4) {
                      if (var6 != 27) {
                        if (var6 == 28) {
                          if (!this.field_g.isActivatePressed(true)) {
                            return;
                          }
                          var6 = param0 ? 1 : 0;
                          ScreenSwitchHelpers.switchScreen(var6 != 0, true, 12, MatchingFieldValidator.field_r);
                          return;
                        }
                        if (20 == var6) {
                          var5 = 0;
                          if (this.field_g.isHomePressed(-13722) &&
                            CheckboxPainter.field_l > 0) {
                            EffectVolumeHelpers.setSoundEffectVolume(0, 21298);
                            var5 = 1;
                          }
                          if (this.field_g.isEndPressed((byte) 112) &&
                            CheckboxPainter.field_l < 256) {
                            var5 = 1;
                            EffectVolumeHelpers.setSoundEffectVolume(256, 21298);
                          }
                          if (this.field_g.isPointerMode((byte) -26)) {
                            var6 = this.getItemTop(41, param1) + (this.getItemY(param1, (byte) 103) + (FrameAndQuickChatHelpers.field_c - 120)) >> 1;
                            var7Lifetime1 = -var6 + EmailLoginCredentials.field_g;
                            var8 = var7Lifetime1 * 256 / 120;
                            var5 = 1;
                            if (0 >= var8) {
                              EffectVolumeHelpers.setSoundEffectVolume(0, 21298);
                            } else {
                              if (256 > var8) {
                                EffectVolumeHelpers.setSoundEffectVolume(var8, 21298);
                              } else {
                                EffectVolumeHelpers.setSoundEffectVolume(256, 21298);
                              }
                            }
                          }
                          if (this.field_g.isLeftPressed((byte) -40) &&
                            CheckboxPainter.field_l > 0) {
                            var5 = 1;
                            ResizableModalPanel.stepEffectVolumeDown((byte) -109);
                          }
                          if (this.field_g.isRightPressed(-65) &&
                            CheckboxPainter.field_l < 256) {
                            var5 = 1;
                            IndexedSpriteState.stepEffectVolumeUp(false);
                          }
                          if (var5 == 0) {
                            return;
                          }
                          decompiledFrameRemainder0 = (!(this.field_g.isPointerMode((byte) -102)) ||
                            !(LoginMethodHelpers.field_e >= SpriteState.field_v));
                          if (decompiledFrameRemainder0) {
                            if (null != CredentialParseHelpers.field_h[CacheEntry.field_n[0][2]]) {
                              DropdownList.playSampleAtVolume((byte) -30, SceneWidgetNode.field_r[CacheEntry.field_n[0][2]], CredentialParseHelpers.field_h[CacheEntry.field_n[0][2]]);
                            }
                            LoginMethodHelpers.field_e = 20 + SpriteState.field_v;
                            return;
                          }
                        }
                        if (decompiledFrameRemainder0) {
                          if (var6 == 21) {
                            if (this.field_g.isHomePressed(-13722)) {
                              EmptyPainter.setMusicVolume(0, false);
                            }
                            if (this.field_g.isEndPressed((byte) 125)) {
                              EmptyPainter.setMusicVolume(256, false);
                            }
                            if (this.field_g.isPointerMode((byte) 85)) {
                              var6 = -120 + this.getItemTop(41, param1) - (-this.getItemY(param1, (byte) 103) - FrameAndQuickChatHelpers.field_c) >> 1;
                              var7Lifetime1Lifetime1 = -var6 + EmailLoginCredentials.field_g;
                              var8Lifetime1 = 256 * var7Lifetime1Lifetime1 / 120;
                              if (var8Lifetime1 > 0) {
                                if (var8Lifetime1 >= 256) {
                                  EmptyPainter.setMusicVolume(256, false);
                                } else {
                                  EmptyPainter.setMusicVolume(var8Lifetime1, false);
                                }
                              } else {
                                EmptyPainter.setMusicVolume(0, param2);
                              }
                            }
                            if (this.field_g.isLeftPressed((byte) -40)) {
                              TextWidgetPainter.stepMusicVolumeDown(60);
                            }
                            if (!this.field_g.isRightPressed(-74)) {
                              return;
                            }
                            MusicVolumeHelpers.stepMusicVolumeUp((byte) 115);
                            return;
                          }
                          if (var6 == 6) {
                            if (this.field_g.isActivatePressed(true)) {
                              NumericDateInputWidget.initializeLoginStackQuiet(!param2);
                              return;
                            }
                          } else {
                            if (var6 != 9) {
                              if (var6 == 10) {
                                if (!this.field_g.isActivatePressed(true)) {
                                  return;
                                }
                                SpriteState.field_z.sendTurnCommand59(true);
                                var6 = param0 ? 1 : 0;
                                ScreenSwitchHelpers.switchScreen(var6 != 0, true, -1, MatchingFieldValidator.field_r);
                                return;
                              }
                              if (var6 != 11) {
                                if (var6 == 12) {
                                  stackIn_299_0 = this.field_g;
                                  stackIn_300_1 = !(param2);
                                  if (!((MenuInputState) (Object) stackIn_299_0).isActivatePressed(stackIn_300_1)) {
                                    return;
                                  }
                                  SpriteState.field_z.sendTurnCommand61((byte) -61);
                                  var6 = param0 ? 1 : 0;
                                  ScreenSwitchHelpers.switchScreen(var6 != 0, true, -1, MatchingFieldValidator.field_r);
                                  return;
                                }
                                if (var6 != 13) {
                                  if (var6 == 17) {
                                    if (this.field_g.isActivatePressed(true)) {
                                      StatusDialog.field_Sb = 0;
                                      return;
                                    }
                                  } else {
                                    if (var6 == 18) {
                                      stackIn_329_0 = this.field_g;
                                      stackIn_330_1 = !(param2);
                                      if (!((MenuInputState) (Object) stackIn_329_0).isActivatePressed(stackIn_330_1)) {
                                        return;
                                      }
                                      StatusDialog.field_Sb = 1;
                                      return;
                                    }
                                    if (var6 != 23) {
                                      if (var6 == 25) {
                                        stackIn_355_0 = this.field_g;
                                        stackIn_356_1 = !(param2);
                                        if (((MenuInputState) (Object) stackIn_355_0).isActivatePressed(stackIn_356_1)) {
                                          if (!this.canMoveToPage((byte) -46, param1)) {
                                            return;
                                          }
                                          if (CheckboxPainter.field_g == 8) {
                                            IntrusiveDeque.field_g = IntrusiveDeque.field_g - 1;
                                            if (0 > IntrusiveDeque.field_g) {
                                              IntrusiveDeque.field_g = 3;
                                            }
                                          }
                                          if (CheckboxPainter.field_g == 7) {
                                            SecondaryNodeDequeIterator.field_e = SecondaryNodeDequeIterator.field_e - 1;
                                          }
                                          if (14 == CheckboxPainter.field_g) {
                                            var6 = -1 + StatefulTextPainter.field_p;
                                            if (var6 <= 0) {
                                              var6 = 0;
                                              if (!param0) {
                                                this.field_g.field_h = 1;
                                              }
                                            }
                                            UiContainer.selectMenuPage((byte) 120, var6);
                                            return;
                                          }
                                        }
                                      } else {
                                        if (26 == var6) {
                                          if (this.field_g.isActivatePressed(true) &&
                                            this.canMoveToPage((byte) -46, param1)) {
                                            if (CheckboxPainter.field_g == 8) {
                                              IntrusiveDeque.field_g = IntrusiveDeque.field_g + 1;
                                              if (IntrusiveDeque.field_g > 3) {
                                                IntrusiveDeque.field_g = 0;
                                              }
                                            }
                                            if (CheckboxPainter.field_g == 7) {
                                              SecondaryNodeDequeIterator.field_e = SecondaryNodeDequeIterator.field_e + 1;
                                            }
                                            if (14 == CheckboxPainter.field_g) {
                                              var6 = 1 + StatefulTextPainter.field_p;
                                              if (var6 >= 7) {
                                                var6 = 7;
                                                if (!param0) {
                                                  this.field_g.field_h = 0;
                                                }
                                              }
                                              UiContainer.selectMenuPage((byte) -127, var6);
                                              return;
                                            }
                                          }
                                        } else {
                                          if (var6 == 19) {
                                            if (this.field_g.isActivatePressed(true)) {
                                              UsernameCredentials.openQuitPage((byte) 79, IconButtonPainter.getApplet(120));
                                              return;
                                            }
                                          } else {
                                            if (30 == var6) {
                                              if (!this.field_g.isActivatePressed(true)) {
                                                return;
                                              }
                                              UiContainer.selectMenuPage((byte) 89, 7);
                                              return;
                                            }
                                            if (var6 != 29) {
                                              return;
                                            }
                                            if (!this.field_g.isActivatePressed(true)) {
                                              return;
                                            }
                                            var6 = param0 ? 1 : 0;
                                            ScreenSwitchHelpers.switchScreen(var6 != 0, true, -1, MatchingFieldValidator.field_r);
                                          }
                                        }
                                      }
                                    } else {
                                      if (this.field_g.isActivatePressed(true)) {
                                        if ((this.field_l != 8 &&
                                          CheckboxPainter.field_g != 6) &&
                                          (decompiledFrameRemainder0 = (10 == this.field_l))) {
                                          ListEntryMenuHelpers.openSubscribePage(IconButtonPainter.getApplet(103), (byte) -60);
                                          return;
                                        }
                                        if (decompiledFrameRemainder0) {
                                          Bzip2State.setLobbyMode(GameApplet.field_o, (byte) 45, this.field_l);
                                          return;
                                        }
                                      }
                                    }
                                  }
                                } else {
                                  stackIn_309_0 = this.field_g;
                                  stackIn_310_1 = !(param2);
                                  if (((MenuInputState) (Object) stackIn_309_0).isActivatePressed(stackIn_310_1)) {
                                    if (ViewControllerHelpers.field_a) {
                                      var6 = param0 ? 1 : 0;
                                      ScreenSwitchHelpers.switchScreen(var6 != 0, true, -5, MatchingFieldValidator.field_r);
                                    }
                                    if (StatefulTextPainter.field_w) {
                                      QueuedPacket.sendShortSettingRequest(0, (byte) -35, 11);
                                    }
                                    DecimalCheckHelpers.field_h = true;
                                    return;
                                  }
                                }
                              } else {
                                if (this.field_g.isActivatePressed(true)) {
                                  SpriteState.field_z.sendTurnCommand60(26873);
                                  var6 = param0 ? 1 : 0;
                                  ScreenSwitchHelpers.switchScreen(var6 != 0, true, -1, MatchingFieldValidator.field_r);
                                  return;
                                }
                              }
                            } else {
                              if (this.field_g.isActivatePressed(true)) {
                                SpriteState.field_z.returnToLobby(-111, param0);
                                DecimalCheckHelpers.field_h = true;
                                MusicCrossfadeStream.field_A = false;
                                return;
                              }
                            }
                          }
                        }
                      } else {
                        stackIn_187_0 = this.field_g;
                        stackIn_188_1 = !(param2);
                        if (((MenuInputState) (Object) stackIn_187_0).isActivatePressed(stackIn_188_1)) {
                          var6 = param0 ? 1 : 0;
                          ScreenSwitchHelpers.switchScreen(var6 != 0, true, 11, MatchingFieldValidator.field_r);
                          return;
                        }
                      }
                    } else {
                      if (this.field_g.isActivatePressed(true)) {
                        var6 = param0 ? 1 : 0;
                        ScreenSwitchHelpers.switchScreen(var6 != 0, true, 6, MatchingFieldValidator.field_r);
                        return;
                      }
                    }
                  }
                } else {
                  if (!this.field_g.isActivatePressed(true)) {
                    return;
                  }
                  var6 = param0 ? 1 : 0;
                  ScreenSwitchHelpers.switchScreen(var6 != 0, true, 8, MatchingFieldValidator.field_r);
                  if (!param0) {
                    this.field_g.field_h = 1;
                    return;
                  }
                }
              } else {
                if (this.field_g.isActivatePressed(true)) {
                  var6 = param0 ? 1 : 0;
                  stackIn_125_0 = var6;
                  stackIn_126_1 = !(param2);
                  ScreenSwitchHelpers.switchScreen(stackIn_125_0 != 0, stackIn_126_1, -1, MatchingFieldValidator.field_r);
                  return;
                }
              }
            } else {
              if (this.field_g.isActivatePressed(true)) {
                if (MenuScreen.getSessionFlag((byte) 112)) {
                  LabeledField.showFramedNotice(ResizableViewResizeListener.field_h, param0, SpellProjectile.field_B, 1, ArchiveRequest.field_t, 0, EmailLoginCredentials.field_j / 2, 16, SpellProjectile.field_B.field_o, 10, EmailLoginCredentials.field_f / 2, GameApplet.field_o, true, SpellProjectile.field_B.field_o + SpellProjectile.field_B.field_m, -21071);
                } else {
                  var6 = param0 ? 1 : 0;
                  ScreenSwitchHelpers.switchScreen(var6 != 0, true, -4, MatchingFieldValidator.field_r);
                }
              }
            }
          } else {
            if (this.field_g.isActivatePressed(true)) {
              var6 = param0 ? 1 : 0;
              ScreenSwitchHelpers.switchScreen(var6 != 0, true, -3, MatchingFieldValidator.field_r);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "lc.OA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final void drawTitleScreen(int param0) {
        int var8 = 0;
        Object var2 = null;
        Object var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int stackIn_24_0 = 0;
        int stackIn_24_1 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6Lifetime1;
        int stackIn_24_0Lifetime1;
        int stackIn_24_1Lifetime1;
        var9 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = null;
          var3 = null;
          var4 = -32 + 3 * QuickChatHelpers.field_a / 4 + 240;
          PendingTask.field_o.drawTransparent(-(PendingTask.field_o.field_n / 2) + (EmailLoginCredentials.field_f >> 1), -(PendingTask.field_o.field_w / 2) - 20 + var4);
          var5 = (EmailLoginCredentials.field_f >> 1) - 120;
          if (StatefulTextPainter.field_p == 0) {
            var2 = GameOptionType.field_f;
            var3 = BitHelpers.field_d;
            LoginLoadingHelpers.field_g[0].drawTransparent(var5 - 28, -48 + var4);
          }
          if (param0 == StatefulTextPainter.field_p) {
            var2 = AudioService.field_d;
            var3 = LinkButtonPainter.field_b;
            LoginLoadingHelpers.field_g[1].drawTransparent(var5 - 28, -32 + var4);
          }
          if (StatefulTextPainter.field_p == 2) {
            var3 = TexturedSpriteHelpers.field_f;
            var2 = DateInputWidget.field_F;
            LoginLoadingHelpers.field_g[72].drawTransparent(-28 + var5, -48 + var4);
          }
          if (3 == StatefulTextPainter.field_p) {
            var3 = SoundCache.field_h;
            var2 = JaggrabDownloader.field_c;
            LoginLoadingHelpers.field_g[4].drawTransparent(var5 - 28, var4);
          }
          if (StatefulTextPainter.field_p == 4) {
            var2 = ScreenSwitchHelpers.field_b;
            var3 = GameDetailsRenderer.field_h;
            LoginLoadingHelpers.field_g[76].drawTransparent(-28 + var5, -32 + var4);
          }
          if (StatefulTextPainter.field_p == 5) {
            var3 = ButtonMenuDialog.field_pb;
            var2 = PointerOriginHelpers.field_a;
            LoginLoadingHelpers.field_g[75].drawTransparent(-28 + var5, var4 - 48);
          }
          if (StatefulTextPainter.field_p == 6) {
            var2 = QuickChatPhraseCache.field_j;
            SpriteState.field_z.field_z = 6050;
            var3 = LobbyGameEntry.field_lc;
            LoginLoadingHelpers.field_g[0].drawTransparent(var5 - 48, var4);
            LoginLoadingHelpers.field_g[1].drawTransparent(-8 + var5, var4);
            SecondaryNodeDeque.field_c[5].draw(var5 - SecondaryNodeDeque.field_c[0].field_g / 2 - 4, -80 + var4);
            SecondaryNodeDeque.field_c[4].draw(-4 + (var5 - SecondaryNodeDeque.field_c[0].field_g / 2), -80 + var4);
            SecondaryNodeDeque.field_c[3].draw(-(SecondaryNodeDeque.field_c[0].field_g / 2) + (var5 - 4), var4 - 80);
            SecondaryNodeDeque.field_c[2].draw(-4 + (var5 - SecondaryNodeDeque.field_c[0].field_g / 2), -80 + var4);
            SecondaryNodeDeque.field_c[1].draw(var5 - SecondaryNodeDeque.field_c[0].field_g / 2 - 4, var4 - 80);
            SecondaryNodeDeque.field_c[0].draw(-(SecondaryNodeDeque.field_c[0].field_g / 2) + var5 - 16, var4 - 80);
          }
          if (7 == StatefulTextPainter.field_p) {
            var3 = PendingMessageHelpers.field_d;
            var2 = TutorialCaptionGlobals.field_c;
            var6 = 0;
            var7 = 0;
            while (true) {
              stackIn_24_0 = -5;
              stackIn_24_1 = ~var7;
              if (stackIn_24_0 >= stackIn_24_1) {
                break;
              }
              for (var8 = 0; 4 > var8; var8++) {
                stackIn_24_0Lifetime1 = 0;
                stackIn_24_1Lifetime1 = ~ThrowableFormatHelpers.field_f[var6];
                if (stackIn_24_0Lifetime1 != stackIn_24_1Lifetime1) {
                  LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[ThrowableFormatHelpers.field_f[var6]]].drawTransparent((-2 + var7) * 40 + var5 - 8, -30 + (var4 + (var8 - 2) * 40));
                }
                var6++;
              }
              var7++;
            }
          }
          var6Lifetime1 = var4 - 144;
          if (var2 != null) {
            CachedArchiveProvider.field_t.drawParagraph((String) (var2), (EmailLoginCredentials.field_f >> 1) - 233, var6Lifetime1, 208, 288, 13158, 13158, 1, 0, CachedArchiveProvider.field_t.field_C + CachedArchiveProvider.field_t.field_m);
            CachedArchiveProvider.field_t.drawParagraph((String) (var2), -232 + (EmailLoginCredentials.field_f >> 1), var6Lifetime1 - 1, 208, 288, 13158, 13158, 1, 0, CachedArchiveProvider.field_t.field_m + CachedArchiveProvider.field_t.field_C);
            CachedArchiveProvider.field_t.drawParagraph((String) (var2), (EmailLoginCredentials.field_f >> 1) - 232, var6Lifetime1, 208, 288, 12569299, -1, 1, 0, CachedArchiveProvider.field_t.field_m + CachedArchiveProvider.field_t.field_C);
          }
          if (var3 != null) {
            SpellProjectile.field_B.drawParagraph((String) (var3), 16 + (EmailLoginCredentials.field_f >> 1) + 8, var6Lifetime1, 224, 288, 0, -1, 1, 0, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) (var2), "lc.E(" + param0 + ')');
        }
    }

    private final void drawIconBar(boolean param0) {
        int var23 = 0;
        int[][][] var3 = null;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var24 = 0;
        int[] var25 = null;
        boolean[] var26 = null;
        int[] var27 = null;
        int[] var28 = null;
        int[] var31 = null;
        int[] var32 = null;
        Sprite stackIn_35_0 = null;
        int stackIn_37_0 = 0;
        boolean stackIn_41_0 = false;
        int stackIn_75_0 = 0;
        int stackIn_85_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_40_0;
        RuntimeException var2 = null;
        int var18 = 0;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        String[] var29 = null;
        String[] var30 = null;
        int var6Lifetime1;
        int var7Lifetime1;
        int var15Lifetime1;
        int var16Lifetime1;
        int var17Lifetime1;
        var24 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var26 = new boolean[]{false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, false, true, true, true, true, true, true, true, true, false, true, false, true, true, true, false, true, false, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, true, false, false, false, false, false, false, false, false, false, false, true, true, false, false, false, false, false, false, true, true, true, true, false, true, false, true, false, false, false, true, true, true, param0, true, true, true, false, false, false};
          if (Js5Transport.isFeatureEnabled(0, (byte) -116)) {
            var26[55] = false;
          }
          var3 = new int[][][]{new int[][]{new int[]{13, 14}, new int[]{0, 2, 4}, new int[]{1, 3, 5}, new int[]{31, 47}, new int[]{49, 51, 53}, new int[]{50, 52}}, new int[][]{new int[]{46, 56, 87}, new int[]{43, 36, 37, 38, 35}, new int[]{57, 58, 59, 60, 61, 45}, new int[]{41, 44, 12, 72, 73}, new int[]{26, 27, 28, 29}, new int[]{48, 55}}, new int[][]{new int[]{54, 80}, new int[]{6, 7, 8, 9, 10, 11}, new int[]{16, 17, 32}, new int[]{18, 19, 20, 21, 23, 22}, new int[]{24, 25, 33}, new int[]{30}}, new int[][]{new int[]{42, 34, 40, 39, 15}, new int[]{62, 71, 79, 82, 86, 88}, new int[]{65, 66, 67, 69, 85, 92}, new int[]{63, 64, 68, 70, 94, 84}, new int[]{74, 78, 83, 81, 93, 89}, new int[]{91}}};
          var31 = SpellbookCaptionGlobals.field_f;
          var27 = var31;
          var4 = var27;
          if (2 > var31.length) {
            var32 = new int[2];
            var28 = var32;
            var25 = var28;
            var4 = var25;
            var25[0] = SpellbookCaptionGlobals.field_f[0];
            var32[1] = 0;
          }
          var5 = Js5Transport.isFeatureEnabled(0, (byte) -33) ? 1 : 0;
          if ((65536 & var4[1]) != 0) {
            if (var5 == 0 &&
              (8388608 & var4[1]) == 0) {
              var3[1][5] = new int[]{48};
            }
          } else {
            var3[1][5] = new int[]{55};
            if (var5 == 0 &&
              (8388608 & var4[1]) == 0) {
              var3[1][5] = new int[]{};
            }
          }
          if ((134217728 & var4[2]) == 0) {
            var3[3] = new int[][]{var3[3][0], var3[3][1], var3[3][2], var3[3][3], var3[3][4]};
          }
          if ((8388608 & var4[2]) == 0) {
            var3[1][0] = new int[]{46, 56};
          }
          var6 = 80;
          var7 = 100;
          if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -127)) {
            stackIn_35_0 = IconHighlightPainter.field_d;
          } else {
            stackIn_35_0 = TextLine.field_b;
          }
          var8 = stackIn_35_0;
          var9 = 60;
          var10 = 280;
          var11 = 60;
          var12 = 220;
          var13 = PasswordCheckHelpers.field_g;
          PasswordCheckHelpers.field_g = -1;
          var14 = IntrusiveDeque.field_g;
          var15 = 0;
          scanLoop1: while (true) {
            stackIn_37_0 = var3[var14].length;
            if (stackIn_37_0 > var15) {
              var7Lifetime1 = var9 - (-(var10 * (1 + var15) / (var3[var14].length + 1)) - QuickChatHelpers.field_a);
              for (var16 = 0; var3[var14][var15].length > var16; var16++) {
                var17 = var3[var14][var15][var16];
                var6Lifetime1 = ValidatedTextWidget.field_I + var11 + var12 * (1 + var16) / (1 + var3[var14][var15].length);
                stackOut_40_0 = SpellProjectile.isPointerInRect(32, var7Lifetime1, 32, -8, var6Lifetime1);
                stackIn_37_0 = stackOut_40_0 ? 1 : 0;
                stackIn_41_0 = stackOut_40_0;
                if (stackIn_41_0) {
                  PasswordCheckHelpers.field_g = var17;
                }
                if (0 != (var4[var17 >> 5] & 1 << (var17 & 31))) {
                  if (~var17 == ~LabeledField.field_K) {
                    IntrusiveNodeHashTable.field_a[var17].drawQuarterSize(2 + var6Lifetime1, -2 + var7Lifetime1);
                  } else {
                    if (var17 != var13) {
                      IntrusiveNodeHashTable.field_a[var17].drawQuarterSize(var6Lifetime1, var7Lifetime1);
                    } else {
                      IntrusiveNodeHashTable.field_a[var17].drawQuarterSize(1 + var6Lifetime1, var7Lifetime1 - 1);
                    }
                  }
                } else {
                  if (~var17 == ~LabeledField.field_K) {
                    var8.drawQuarterSize(var6Lifetime1 + 2, var7Lifetime1 - 2);
                  } else {
                    if (var17 != var13) {
                      var8.drawQuarterSize(var6Lifetime1, var7Lifetime1);
                    } else {
                      var8.drawQuarterSize(var6Lifetime1 + 1, var7Lifetime1 - 1);
                    }
                  }
                }
              }
              var15++;
              continue scanLoop1;
            }
            break;
          }
          if (-1 != LabeledField.field_K) {
            stackIn_75_0 = LabeledField.field_K;
          } else {
            stackIn_75_0 = PasswordCheckHelpers.field_g;
          }
          var15Lifetime1 = stackIn_75_0;
          if (-1 != var15Lifetime1) {
            var16Lifetime1 = CachedArchiveProvider.field_t.field_o + CachedArchiveProvider.field_t.field_m;
            SpellProjectile.field_B.drawCentered(TimedMessage.field_n[var15Lifetime1], 447 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 126, 0, -1);
            stackIn_85_0 = ((var4[var15Lifetime1 >> 5] & 1 << (31 & var15Lifetime1)) == 0) ? 0 : 1;
            var17Lifetime1 = stackIn_85_0;
            if (var17Lifetime1 != 0) {
              SpellProjectile.field_B.drawCentered(GradientBarButton.field_H, ValidatedTextWidget.field_I + 447, -8 + QuickChatHelpers.field_a + (126 + var16Lifetime1), 0, -1);
            } else {
              SpellProjectile.field_B.drawCentered(AlternateUsernameCredentials.field_l, ValidatedTextWidget.field_I + 447, var16Lifetime1 + QuickChatHelpers.field_a + 118, 16711680, -1);
            }
            var18 = 126 + var16Lifetime1;
            if (var17Lifetime1 != 0) {
              IntrusiveNodeHashTable.field_a[var15Lifetime1].drawTransparent(340 + ValidatedTextWidget.field_I, var18 + QuickChatHelpers.field_a);
            } else {
              TextLine.field_b.drawTransparent(340 + ValidatedTextWidget.field_I, var18 + QuickChatHelpers.field_a);
            }
            var18 = var18 + CachedArchiveProvider.field_t.field_C;
            var18 = var18 + CachedArchiveProvider.field_t.field_C;
            if (var17Lifetime1 == 0 &&
              var26[var15Lifetime1]) {
              var30 = new String[16];
              var20 = SpellProjectile.field_B.wrapText(PacketBuffer.field_k, new int[]{220}, var30);
              for (var21 = 0; var20 > var21; var21++) {
                SpellProjectile.field_B.drawText(var30[var21], 12 + (340 + ValidatedTextWidget.field_I), 95 + QuickChatHelpers.field_a + var18, 0, -1);
                var18 = var18 + SpellProjectile.field_B.field_C;
              }
            } else {
              var29 = new String[16];
              var20 = SpellProjectile.field_B.wrapText(PairedSceneWidget.field_Bb[var15Lifetime1], new int[]{220}, var29);
              for (var21 = 0; var20 > var21; var21++) {
                SpellProjectile.field_B.drawText(var29[var21], 340 + (ValidatedTextWidget.field_I + 12), -8 + (QuickChatHelpers.field_a + var18) + 120, 0, -1);
                var18 = var18 + SpellProjectile.field_B.field_C;
              }
              SpellProjectile.field_B.drawCentered(AgeValidator.field_x, ValidatedTextWidget.field_I + 530, QuickChatHelpers.field_a + 170, 0, -1);
              SpellProjectile.field_B.drawCentered("" + 100 * ValidationState.field_g[var15Lifetime1], ValidatedTextWidget.field_I + 530, 185 + QuickChatHelpers.field_a, 0, -1);
              SpellProjectile.field_B.drawCentered(FullscreenFocusCanvas.field_c, 530 + ValidatedTextWidget.field_I, QuickChatHelpers.field_a + 220, 0, -1);
              var21 = 514;
              var22 = 224;
              if (10 == ValidationState.field_g[var15Lifetime1]) {
                var21 -= 24;
              }
              for (var23 = 0; var23 < ValidationState.field_g[var15Lifetime1]; var23++) {
                PointerOriginHelpers.field_e.drawTransparent(var21 + ValidatedTextWidget.field_I, var22 + QuickChatHelpers.field_a);
                if (ValidationState.field_g[var15Lifetime1] == 10) {
                  PointerOriginHelpers.field_e.drawTransparent(var21 + ValidatedTextWidget.field_I + 32, QuickChatHelpers.field_a + var22);
                }
                var21 -= 8;
                if (0 == var23 % 3) {
                  var21 += 16;
                }
                var22 += 8;
                if (var23 != 4) {
                  continue;
                }
                break;
              }
            }
          } else {
            SpellProjectile.field_B.drawParagraph(NameHelpers.field_c, -16 + (ValidatedTextWidget.field_I + 320) + 50, 134 + QuickChatHelpers.field_a, 200, 64, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
            if (!MenuScreen.getSessionFlag((byte) 112)) {
              SpellProjectile.field_B.drawText(var14 + 1 + "/" + 4, ValidatedTextWidget.field_I + 285, QuickChatHelpers.field_a + 325, 0, -1);
              return;
            }
            SpellProjectile.field_B.drawParagraph(FrameClock.field_c, -16 + (50 + ValidatedTextWidget.field_I) + 320, -16 + (250 + QuickChatHelpers.field_a), 200, 64, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
          }
          SpellProjectile.field_B.drawText(var14 + 1 + "/" + 4, ValidatedTextWidget.field_I + 285, QuickChatHelpers.field_a + 325, 0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.M(" + param0 + ')');
        }
    }

    private final void drawPlayerTile(int param0, int param1, byte param2, int param3) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          SoftwareRasterizer.drawRectangle(param1 - 4, param0 - 4, 248, 127, 0);
          SoftwareRasterizer.drawRectangle(param1 - 3, -3 + param0, 246, 125, 8547138);
          if (param2 > -27) {
            this.field_f = 0.4045710406434804;
          }
          SoftwareRasterizer.drawRectangle(-2 + param1, param0 - 2, 244, 123, 11833896);
          SoftwareRasterizer.drawRectangle(param1 - 1, param0 - 1, 242, 121, 0);
          SoftwareRasterizer.fillVerticalGradient(param1, param0, 240, 119, PaddedContainer.statusColour(param3, (byte) -122), TermsNoticePanel.rankColour((byte) -37, param3));
          if (LoginPanel.field_M[param3] == null) {
            BattleStartHelpers.field_d.field_f = 0;
            LoginPanel.field_M[param3] = PairedSceneWidget.loadIndexedSpriteByName(CachedArchiveProvider.formatTemplate(-46, new String[]{Integer.toString(param3)}, "background<%0>"), "", 19412, BattleStartHelpers.field_d);
            LoginPanel.field_M[param3].drawHalfSize(param1, param0);
            LoginPanel.field_M[param3] = null;
          } else {
            LoginPanel.field_M[param3].drawHalfSize(param1, param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var5), "lc.HA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    private final void drawBottomPanel(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -73)) {
            return;
          }
          var2_int = 80;
          if (LinkButtonPainter.field_f == 3) {
            var2_int += 20;
          }
          var3 = EmailLoginCredentials.field_f - var2_int;
          SoftwareRasterizer.drawRectangle(-3 + var3, 3, var2_int, 48, 0);
          SoftwareRasterizer.drawRectangle(var3 - 2, 2, var2_int, 48, 6837813);
          SoftwareRasterizer.drawRectangle(-1 + var3, 1, var2_int, 48, 8547138);
          SoftwareRasterizer.drawRectangle(var3, 0, var2_int, 48, 11768360);
          SoftwareRasterizer.fillRectangle(1 + var3, -1, var2_int, 48, 0);
          var4 = NodeHashTableIterator.field_j - GridContainer.field_P;
          if (param0 != -26733) {
            return;
          }
          if (var4 < 5) {
            if (0 < var4) {
              if (4 == (4 & var4)) {
                DualLinkDeque.field_b[7].draw(10 + (var3 - 5), 6);
                DualLinkDeque.field_b[7].draw(15 + var3, 6);
                DualLinkDeque.field_b[7].draw(-3 + (10 + var3), 10);
                DualLinkDeque.field_b[7].draw(3 + (var3 + 10), 10);
              }
              if ((var4 & 2) == 2) {
                DualLinkDeque.field_b[7].draw(10 + (var3 - 5), 8);
                DualLinkDeque.field_b[7].draw(var3 + 15, 8);
              }
              if ((var4 & 1) == 1) {
                DualLinkDeque.field_b[7].draw(var3 + 10, 8);
              }
              if (SpellbookCaptionGlobals.field_d <= 0) {
                if (SpellbookCaptionGlobals.field_d <= 0) {
                  SpellProjectile.field_B.drawParagraph(CompoundButton.field_I + var4, var3 + 25, 4, var2_int - 30, 44, 16777215, -1, 1, 1, 14);
                } else {
                  TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].drawTintedGrayscale(var3 + 23, -(TimedMessage.field_o[SpellbookCaptionGlobals.field_d - 1].field_y / 2) - TimedMessage.field_o[SpellbookCaptionGlobals.field_d - 1].field_o + 33, 16711680);
                  SpellProjectile.field_B.drawParagraph(CompoundButton.field_I + var4, var3 + 23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
                }
              } else {
                TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].drawTintedGrayscale(var3 + 23, -(TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].field_y / 2) + (-TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].field_o + 33), 16711680);
                SpellProjectile.field_B.drawParagraph(CompoundButton.field_I + var4, var3 + 23, 4, 50, 44, 16777215, -1, 2, 1, 14);
              }
            } else {
              if (SpellbookCaptionGlobals.field_d > 0) {
                var5 = 19;
                if (LinkButtonPainter.field_f == 3) {
                  var5 -= 7;
                }
                TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].drawTintedGrayscale(var3 + 23, -(TimedMessage.field_o[SpellbookCaptionGlobals.field_d - 1].field_y / 2) - TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].field_o + var5, 16711680);
                SpellProjectile.field_B.drawParagraph(GrowableIntList.field_l, var3 + 5, 4, -10 + var2_int, 38, 16777215, -1, 1, 2, 14);
              } else {
                SpellProjectile.field_B.drawParagraph(GrowableIntList.field_l, 5 + var3, 4, -10 + var2_int, 44, 16777215, -1, 1, 1, 14);
              }
            }
          } else {
            DualLinkDeque.field_b[8].draw(10 + (var3 - 4), 8);
            if (var4 > 5) {
              SpellProjectile.field_B.drawCharacter('+', 17 + var3, 30, 16711935);
            }
            if (SpellbookCaptionGlobals.field_d <= 0) {
              SpellProjectile.field_B.drawParagraph(CompoundButton.field_I + var4, 23 + var3, 4, var2_int - 30, 44, 16777215, -1, 1, 1, 14);
            } else {
              TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].drawTintedGrayscale(23 + var3, -(TimedMessage.field_o[SpellbookCaptionGlobals.field_d - 1].field_y / 2) + (33 - TimedMessage.field_o[-1 + SpellbookCaptionGlobals.field_d].field_o), 16711680);
              SpellProjectile.field_B.drawParagraph(CompoundButton.field_I + var4, var3 + 23, 4, -30 + var2_int, 44, 16777215, -1, 2, 1, 14);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.T(" + param0 + ')');
        }
    }

    private final int getItemTop(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 41) {
            this.drawCaption(-83);
          }
          stackIn_4_0 = this.getColumnX(param1, param0 + 159) + ValidatedTextWidget.field_I;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.KA(" + param0 + ',' + param1 + ')');
        }
    }

    private final int getItemSpacing(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 75) {
            stackIn_4_0 = 30;
            return stackIn_4_0;
          }
          stackIn_2_0 = -10;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.NA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawLobbyCircle(int param0) {
        int var25 = 0;
        BattleScreen var2 = null;
        int var3 = 0;
        double var4 = 0.0;
        int var6 = 0;
        int var7 = 0;
        int var8_int = 0;
        int var9_int = 0;
        int var10_int = 0;
        int var27 = 0;
        int stackIn_20_0 = 0;
        int stackIn_20_1 = 0;
        int stackIn_85_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int[] var8 = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        Sprite[][] var12 = null;
        double[] var13 = null;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        String var19 = null;
        String var20_ref_String = null;
        int var20 = 0;
        String var21 = null;
        int var22 = 0;
        int var23 = 0;
        int var26 = 0;
        int[] var31 = null;
        double var4Lifetime1;
        double var4Lifetime2;
        double var4Lifetime3;
        int var8_intLifetime1;
        int var8_intLifetime2;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int stackIn_20_0Lifetime1;
        int stackIn_20_1Lifetime1;
        int var18Lifetime1;
        int var18Lifetime2;
        int var23Lifetime1;
        int var23Lifetime2;
        var27 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = SpriteState.field_z;
          if (var2 == null) {
            var2 = OverlayHelpers.field_b;
          }
          var3 = var2.field_V.getPlayerCount(0);
          var6 = EmailLoginCredentials.field_f / 2;
          var7 = EmailLoginCredentials.field_j / 2;
          for (var8_int = 0; var8_int < 300; var8_int++) {
            var4 = 3.141592653589793 * (double)var8_int * 2.0 / 300.0;
            var9_int = var6 + (int)(Math.sin(var4) * 240.0);
            var10_int = var7 + (int)(Math.cos(var4) * 160.0);
            SoftwareRasterizer.drawCircleOutline(var9_int, var10_int, 8, 0);
          }
          for (var8_intLifetime1 = 0; var8_intLifetime1 < 300; var8_intLifetime1++) {
            var4Lifetime1 = 2.0 * ((double)var8_intLifetime1 * 3.141592653589793) / 300.0;
            var9_intLifetime1 = var6 + (int)(240.0 * Math.sin(var4Lifetime1));
            var10_intLifetime1 = (int)(Math.cos(var4Lifetime1) * 160.0) + var7;
            SoftwareRasterizer.fillCircle(var9_intLifetime1, var10_intLifetime1, 7, 7891535);
          }
          for (var8_intLifetime2 = 0; var8_intLifetime2 < 300; var8_intLifetime2++) {
            var4Lifetime2 = 2.0 * (3.141592653589793 * (double)var8_intLifetime2) / 300.0;
            var9_intLifetime2 = (int)(Math.sin(var4Lifetime2) * 239.0) + var6;
            var10_intLifetime2 = (int)(160.0 * Math.cos(var4Lifetime2)) + var7;
            SoftwareRasterizer.fillCircle(var9_intLifetime2, -1 + var10_intLifetime2, 4, 11510925);
          }
          SoftwareRasterizer.resetClip();
          var8 = new int[]{255, 0, 0};
          if (param0 != 32) {
            this.field_n = -74;
          }
          var9 = new int[]{0, 255, 0};
          var10 = new int[]{0, 0, 255};
          var11 = new int[]{255, 255, 255};
          var12 = new Sprite[][]{SceneWidget.field_kb, IsaacRandom.field_j, DiskCacheRequest.field_u, QueuedPacket.field_i, JaggrabDownloader.field_d, CachedArchiveProvider.field_A, NameErrorHelpers.field_a, ModalPanelStack.field_I, GameListHelpers.field_b};
          var13 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
          var14 = 0;
          while (true) {
            stackIn_20_0 = var3;
            stackIn_20_1 = var14;
            if (stackIn_20_0 <= stackIn_20_1) {
              return;
            }
            var4Lifetime3 = 3.141592653589793 * var13[var14];
            var15 = var6 + (int)(240.0 * Math.sin(var4Lifetime3));
            var16 = QuickChatHelpers.field_a * 3 / 4 - (-240 - (int)(140.0 * Math.cos(var4Lifetime3)));
            var17 = NameCheckHelpers.field_n[var14];
            for (var18 = -32; var18 < 32; var18++) {
              SoftwareRasterizer.setClip(0, var16 + var18, EmailLoginCredentials.field_f, var18 + var16 + 8);
              SoftwareRasterizer.fillCircle(var15, -(var18 / 2) + var16, 32, 7891535);
              SoftwareRasterizer.drawCircleOutline(var15, -(var18 / 2) + var16, 32, 0);
            }
            for (var18Lifetime1 = -32; 32 > var18Lifetime1; var18Lifetime1++) {
              SoftwareRasterizer.setClip(0, var18Lifetime1 + var16, EmailLoginCredentials.field_f, 8 + (var18Lifetime1 + var16));
              SoftwareRasterizer.fillCircle(var15, -4 - var18Lifetime1 / 2 + var16, 28, 13484723);
              SoftwareRasterizer.drawCircleOutline(var15, -4 - var18Lifetime1 / 2 + var16, 28, 0);
            }
            SoftwareRasterizer.resetClip();
            var18Lifetime2 = -5 + var7;
            var19 = LobbyRequestHelpers.field_d;
            if (var2.field_I == var2.field_V.getCurrentPlayer(false)) {
              if (250 > MusicPatchNode.field_s) {
                var20_ref_String = Integer.toString(5 - (MusicPatchNode.field_s - 1) / 50);
                CachedArchiveProvider.field_t.drawCentered(var20_ref_String, var6 - 1, var18Lifetime2 + 64, 0, 0);
                CachedArchiveProvider.field_t.drawCentered(var20_ref_String, var6, var18Lifetime2 + 64 - 1, 0, 0);
                CachedArchiveProvider.field_t.drawCentered(var20_ref_String, var6, var18Lifetime2 + 64, 16777215, -1);
              }
            } else {
              var19 = QueuedPacket.field_s;
            }
            SpellProjectile.field_B.drawParagraph(var19, var6 - 128 - 1, -1 + var18Lifetime2, 256, 64, 0, -1, 1, 0, 14);
            SpellProjectile.field_B.drawParagraph(var19, -129 + var6, var18Lifetime2 + 1, 256, 64, 0, -1, 1, 0, 14);
            SpellProjectile.field_B.drawParagraph(var19, var6 - 128 + 1, 1 + var18Lifetime2, 256, 64, 0, -1, 1, 0, 14);
            SpellProjectile.field_B.drawParagraph(var19, 1 + (var6 - 128), -1 + var18Lifetime2, 256, 64, 0, -1, 1, 0, 14);
            SpellProjectile.field_B.drawParagraph(var19, -1 + (var6 - 128), var18Lifetime2, 256, 64, 0, 0, 1, 0, 14);
            SpellProjectile.field_B.drawParagraph(var19, var6 - 128, var18Lifetime2 - 1, 256, 64, 0, 0, 1, 0, 14);
            var16 -= 64;
            var15 -= 32;
            SpellProjectile.field_B.drawParagraph(var19, -128 + var6, var18Lifetime2, 256, 64, 16777215, -1, 1, 0, 14);
            var20 = 0;
            if (~var14 == ~(SpriteState.field_v / 50 % var3)) {
              var20 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(SpriteState.field_v % 50) / 50.0));
            }
            var8[0] = var2.field_V.field_N[var14][0];
            var8[1] = var2.field_V.field_N[var14][1];
            var8[2] = var2.field_V.field_N[var14][2];
            var9[0] = var2.field_V.field_N[var14][3];
            var9[1] = var2.field_V.field_N[var14][4];
            var9[2] = var2.field_V.field_N[var14][5];
            var10[0] = var2.field_V.field_N[var14][6];
            var10[1] = var2.field_V.field_N[var14][7];
            var10[2] = var2.field_V.field_N[var14][8];
            var11[0] = var2.field_V.field_N[var14][9];
            var11[1] = var2.field_V.field_N[var14][10];
            var11[2] = var2.field_V.field_N[var14][11];
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, var16 - 2, var11, var8, -101, var9, var12[8][0], 0 + var15);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, var16 + var20 - 0, var11, var8, 34, var9, var12[3][var2.field_V.field_N[var14][15]], var15 + 12);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, 0 + var16, var11, var8, 56, var9, var12[1][var2.field_V.field_N[var14][12]], 0 + var15);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, var16 + 2, var11, var8, 39, var9, var12[7][0], var15 + 0);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, -40 + var16 + 16, var11, var8, -121, var9, var12[0][var2.field_V.field_N[var14][13]], 0 + var15);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, -8 + var16, var11, var8, 37, var9, var12[4][var2.field_V.field_N[var14][17]], 0 + var15);
            if (53 != var2.field_V.field_N[var14][17] &&
              55 != var2.field_V.field_N[var14][17]) {
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, -40 + var16 + 32, var11, var8, -118, var9, var12[6][var14], 0 + var15);
            }
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, 16 + var16 - 40, var11, var8, -105, var9, var12[5][var2.field_V.field_N[var14][16]], var15 + 0);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var10, var20 + var16 - 0, var11, var8, 118, var9, var12[2][var2.field_V.field_N[var14][14]], -12 + var15);
            var15 += 32;
            var16 += 64;
            var21 = var2.field_V.field_k[var14];
            var16 += 16;
            var22 = SpellProjectile.field_B.textWidth("Wmmmmmmmmmmm");
            var15 = var15 - (var22 / 2 + 7);
            var23 = 15 + var22;
            SoftwareRasterizer.fillVerticalGradient(var15 + 3, -8 + (var16 + 3), -6 + var23, 15, var17, (8421504 | var17) ^ 8421504);
            SoftwareRasterizer.setClip(var15 + 3, -8 + var16 + 3, 3 + var15 + (var23 - 6), -10 + var16 + 20);
            while (0 < var23) {
              var23 = var23 - SupportPageHelpers.field_a.field_n;
              SupportPageHelpers.field_a.drawAdditive(3 + var15 + var23, -10 + (3 + (-8 + var16)), 64);
            }
            SoftwareRasterizer.resetClip();
            var23Lifetime1 = var22 + 15;
            SoftwareRasterizer.drawRoundedRectangle(var15, -8 + var16, var23Lifetime1, 21, 6, 0);
            SoftwareRasterizer.drawRoundedRectangle(var15 + 2, -8 + (var16 + 2), -4 + var23Lifetime1, 17, 4, 0);
            SoftwareRasterizer.drawRoundedRectangle(var15 + 1, -8 + (var16 + 1), -2 + var23Lifetime1, 19, 6, 16777215);
            SoftwareRasterizer.drawRoundedRectangle(2 + var15, var16 + 2 - 8, -4 + var23Lifetime1, 17, 6, 0);
            var15 = var15 + (7 + var22 / 2);
            SpellProjectile.field_B.drawCentered(var21, -1 + var15, 1 + var16 + SpellProjectile.field_B.field_C / 2, 0, 0);
            SpellProjectile.field_B.drawCentered(var21, var15, -1 + (var16 - (-1 - SpellProjectile.field_B.field_C / 2)), 0, 0);
            SpellProjectile.field_B.drawCentered(var21, var15, SpellProjectile.field_B.field_C / 2 + (1 + var16), 16777215, -1);
            var16 -= 20;
            var15 -= 40;
            var16 -= 10;
            var23Lifetime2 = 1;
            var31 = var2.field_V.getPlayerSpellSlots(3, var14);
            for (var25 = 0; var25 < 16; var25++) {
              var26 = var31[var25];
              stackIn_20_0Lifetime1 = ~var26;
              stackIn_20_1Lifetime1 = -13;
              if (stackIn_20_0Lifetime1 <= stackIn_20_1Lifetime1 &&
                (-12 + var26) % 12 >= 10 &&
                var26 >= 0) {
                if ((-6 + var26) / 12 == 0) {
                  SoftwareRasterizer.fillCircleAlpha(var15 + 10, 10 + var16, 10, 8912896, 256);
                }
                if ((var26 - 6) / 12 == 1) {
                  SoftwareRasterizer.fillCircleAlpha(10 + var15, 10 + var16, 10, 8404992, 256);
                }
                if ((var26 - 6) / 12 == 2) {
                  SoftwareRasterizer.fillCircleAlpha(10 + var15, 10 + var16, 10, 8947712, 256);
                }
                if ((-6 + var26) / 12 == 3) {
                  SoftwareRasterizer.fillCircleAlpha(10 + var15, 10 + var16, 10, 34952, 256);
                }
                if (4 == (-6 + var26) / 12) {
                  SoftwareRasterizer.fillCircleAlpha(var15 + 10, 10 + var16, 10, 8947848, 256);
                }
                if (5 == (-6 + var26) / 12) {
                  SoftwareRasterizer.fillCircleAlpha(10 + var15, var16 + 10, 10, 65280, 256);
                }
                QuickChatPhraseCache.fillCircleMasked(10, (byte) 99, 256, var15 + 10, var16 + 10);
                stackIn_85_0 = (var23Lifetime2 != 0) ? 0 : 1;
                var23Lifetime2 = stackIn_85_0;
                LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var26]].drawHalfSize(var15, var16);
                if (var23Lifetime2 != 0) {
                  var15 -= 20;
                  var16 -= 20;
                } else {
                  var15 += 20;
                }
              }
            }
            var14++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "lc.Q(" + param0 + ')');
        }
    }

    private final void drawPlayerCircle(boolean param0) {
        StringBuilder discarded$0 = null;
        StringBuilder discarded$1 = null;
        StringBuilder discarded$2 = null;
        StringBuilder discarded$3 = null;
        StringBuilder discarded$4 = null;
        int incrementValue$5 = 0;
        int incrementValue$6 = 0;
        int incrementValue$7 = 0;
        int incrementValue$8 = 0;
        int incrementValue$9 = 0;
        int incrementValue$10 = 0;
        int incrementValue$11 = 0;
        int incrementValue$12 = 0;
        int incrementValue$13 = 0;
        int incrementValue$14 = 0;
        int incrementValue$15 = 0;
        int incrementValue$16 = 0;
        int incrementValue$17 = 0;
        int incrementValue$18 = 0;
        int incrementValue$19 = 0;
        int incrementValue$20 = 0;
        int incrementValue$21 = 0;
        BattleScreen var2 = null;
        int var3 = 0;
        int var4 = 0;
        double var5 = 0.0;
        int var7 = 0;
        int var8 = 0;
        int var9_int = 0;
        int var10_int = 0;
        int var11_int = 0;
        int var33 = 0;
        int stackIn_73_0 = 0;
        int[] stackIn_114_0;
        int stackIn_114_1;
        int[] stackIn_114_2;
        int[] stackIn_114_3;
        int stackIn_114_4;
        int[] stackIn_114_5;
        Sprite[] stackIn_114_6;
        int stackIn_115_7;
        StringBuilder stackIn_137_0 = null;
        String stackIn_138_1 = null;
        StringBuilder stackIn_141_0 = null;
        String stackIn_142_1 = null;
        int stackIn_157_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2_ref = null;
        int[] var9 = null;
        int[] var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        Sprite[][] var13 = null;
        StringBuilder var14 = null;
        String var15 = null;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        double[] var19 = null;
        int var20 = 0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        int var26 = 0;
        Object var27 = null;
        int var28 = 0;
        Object var29 = null;
        int var30 = 0;
        Sprite var31 = null;
        int var32 = 0;
        double var5Lifetime1;
        double var5Lifetime2;
        double var5Lifetime3;
        int var9_intLifetime1;
        int var9_intLifetime2;
        int var10_intLifetime1;
        int var10_intLifetime2;
        int var11_intLifetime1;
        int var11_intLifetime2;
        int var16Lifetime1;
        int var16Lifetime2;
        int var25Lifetime1;
        int var32Lifetime1;
        int var16Lifetime2Lifetime1;
        var33 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var2 = SpriteState.field_z;
          if (var2 == null) {
            var2 = OverlayHelpers.field_b;
          }
          var3 = var2.field_V.getPlayerCount(0);
          var4 = var2.field_V.getCurrentPlayer(false);
          if (0 <= var4 &&
            var2.field_V.field_d) {
            var4 = var4 & 1;
          }
          var7 = EmailLoginCredentials.field_f / 2;
          var8 = EmailLoginCredentials.field_j / 2;
          for (var9_int = 0; var9_int < 300; var9_int++) {
            var5 = (double)var9_int * 3.141592653589793 * 2.0 / 300.0;
            var10_int = var7 + (int)(Math.sin(var5) * 240.0);
            var11_int = var8 + (int)(160.0 * Math.cos(var5));
            SoftwareRasterizer.drawCircleOutline(var10_int, var11_int, 8, 0);
          }
          for (var9_intLifetime1 = 0; 300 > var9_intLifetime1; var9_intLifetime1++) {
            var5Lifetime1 = 3.141592653589793 * (double)var9_intLifetime1 * 2.0 / 300.0;
            var10_intLifetime1 = (int)(240.0 * Math.sin(var5Lifetime1)) + var7;
            var11_intLifetime1 = var8 + (int)(Math.cos(var5Lifetime1) * 160.0);
            SoftwareRasterizer.fillCircle(var10_intLifetime1, var11_intLifetime1, 7, 7891535);
          }
          for (var9_intLifetime2 = 0; 300 > var9_intLifetime2; var9_intLifetime2++) {
            var5Lifetime2 = (double)var9_intLifetime2 * 3.141592653589793 * 2.0 / 300.0;
            var10_intLifetime2 = (int)(239.0 * Math.sin(var5Lifetime2)) + var7;
            var11_intLifetime2 = var8 + (int)(Math.cos(var5Lifetime2) * 160.0);
            SoftwareRasterizer.fillCircle(var10_intLifetime2, -1 + var11_intLifetime2, 4, 11510925);
          }
          SoftwareRasterizer.resetClip();
          var9 = new int[]{255, 0, 0};
          var10 = new int[]{0, 255, 0};
          var11 = new int[]{0, 0, 255};
          var12 = new int[]{255, 255, 255};
          var13 = new Sprite[][]{SceneWidget.field_kb, IsaacRandom.field_j, DiskCacheRequest.field_u, QueuedPacket.field_i, JaggrabDownloader.field_d, CachedArchiveProvider.field_A, NameErrorHelpers.field_a, ModalPanelStack.field_I, GameListHelpers.field_b};
          var14 = new StringBuilder(20);
          if (null != var2.field_w) {
            var2.field_V = var2.field_w;
          }
          if (var4 >= 0) {
            if (var2.field_V.field_d) {
              if (0 == var4) {
                discarded$0 = var14.append(EditableTextWidget.field_K + ThrowableFormatHelpers.field_d + "<br><br>");
              }
              if (1 == var4) {
                discarded$1 = var14.append(EditableTextWidget.field_K + BirthDateEntryPanel.field_I + "<br><br>");
              }
            } else {
              discarded$2 = var14.append(EditableTextWidget.field_K + var2.field_V.field_k[var4] + "<br><br>");
            }
          } else {
            if (-2 == var4) {
              discarded$3 = var14.append(FrameAndQuickChatHelpers.field_d);
            } else {
              discarded$4 = var14.append(NameTable.field_a);
            }
          }
          var15 = var14.toString();
          if (var2.field_V.hasStats(1)) {
            var16 = 0;
            incrementValue$5 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$5, AgeValidator.field_v);
            incrementValue$6 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$6, IntensityTableHelpers.field_e);
            incrementValue$7 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$7, NoticeHelpers.field_p);
            incrementValue$8 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$8, TextHotspotWidget.field_N);
            incrementValue$9 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$9, ArchiveProvider.field_e);
            incrementValue$10 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$10, SectorCacheStore.field_a);
            incrementValue$11 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$11, DropTargetWidget.field_J);
            incrementValue$12 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$12, PacketBuffer.field_h);
            incrementValue$13 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$13, MainMenuDialog.field_Eb);
            incrementValue$14 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$14, ResizableModalPanel.field_X);
            incrementValue$15 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$15, LobbyLayoutHelpers.field_a);
            incrementValue$16 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$16, BattleResetHelpers.field_b);
            incrementValue$17 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$17, SoundCache.field_i);
            incrementValue$18 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$18, NameCheckHelpers.field_i);
            incrementValue$19 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$19, GradientBarButton.field_S);
            incrementValue$20 = var16;
            var16++;
            var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$20, Js5ArchiveManager.field_a);
            if (Js5Transport.isFeatureEnabled(0, (byte) -36)) {
              incrementValue$21 = var16;
              var16++;
              var15 = Js5Transport.appendPlayerStat(var15, 10, incrementValue$21, NanoFrameClock.field_q);
            }
          } else {
            var15 = NameCheckHelpers.field_b;
          }
          var16Lifetime1 = 128 + 14 * SpellProjectile.field_B.wrappedLineCount(var15, 256);
          var17 = SpriteState.field_v / 3 % var16Lifetime1 - 128;
          var18 = QuickChatHelpers.field_a + 180;
          SoftwareRasterizer.setClip(0, var18, EmailLoginCredentials.field_f, 128 + var18);
          SpellProjectile.field_B.drawParagraph(var15, -128 + var7 - 1, -var17 - 1 + var18, 256, 256, 0, -1, 1, 0, 14);
          SpellProjectile.field_B.drawParagraph(var15, var7 - 129, -var17 + var18 + 1, 256, 256, 0, -1, 1, 0, 14);
          SpellProjectile.field_B.drawParagraph(var15, -128 + var7 + 1, -var17 + (var18 + 1), 256, 256, 0, -1, 1, 0, 14);
          SpellProjectile.field_B.drawParagraph(var15, -128 + var7 + 1, -var17 + var18 - 1, 256, 256, 0, -1, 1, 0, 14);
          SpellProjectile.field_B.drawParagraph(var15, var7 - 129, -var17 + var18, 256, 256, 0, 0, 1, 0, 14);
          SpellProjectile.field_B.drawParagraph(var15, var7 - 128, -1 + (var18 - var17), 256, 256, 0, 0, 1, 0, 14);
          SpellProjectile.field_B.drawParagraph(var15, -128 + var7, -var17 + var18, 256, 256, 16777215, -1, 1, 0, 14);
          SoftwareRasterizer.resetClip();
          SoftwareRasterizer.blurRectangle(3, 2, -128 + var7, -1 + var18, 256, 2);
          SoftwareRasterizer.blurRectangle(2, 1, -128 + var7, var18 + 1, 256, 1);
          SoftwareRasterizer.blurRectangle(1, 1, -128 + var7, 2 + var18, 256, 1);
          SoftwareRasterizer.blurRectangle(1, 1, -128 + var7, -3 + (128 + var18), 256, 1);
          SoftwareRasterizer.blurRectangle(2, 1, -128 + var7, -2 + (128 + var18), 256, 1);
          SoftwareRasterizer.blurRectangle(3, 2, var7 - 128, var18 + 127, 256, 2);
          var19 = new double[]{-0.75, 0.75, -0.5, 0.5, -0.25, 0.25};
          var20 = 0;
          if (!param0) {
            return;
          }
          while (var20 < var3) {
            boolean decompiledFrameRemainder0 = true;
            var5Lifetime3 = var19[var20] * 3.141592653589793;
            if ((var2.field_V.field_d ||
              var4 != var20) && (!var2.field_V.field_d ||
              ~var4 != ~(var20 & 1) ||
              (1 << var20 & var2.field_J) != 0)) {
              stackIn_73_0 = 0;
              decompiledFrameRemainder0 = false;
            }
            else {
              stackIn_73_0 = 1;
            }
            var21 = stackIn_73_0;
            var22 = (int)(240.0 * Math.sin(var5Lifetime3)) + var7;
            var23 = QuickChatHelpers.field_a / 2 + (240 + (int)(140.0 * Math.cos(var5Lifetime3)));
            var24 = NameCheckHelpers.field_n[var20];
            if (var21 != 0) {
              for (var25 = -48; var25 < 48; var25++) {
                SoftwareRasterizer.setClip(0, var25 + (var23 - 16), EmailLoginCredentials.field_f, 24 + var23 + var25);
                SoftwareRasterizer.fillCircle(var22, -4 + (-(var25 / 2) + var23 - 16), 28, 13484723);
                QuickChatPhraseCache.fillCircleMasked(48, (byte) 90, 32, var22, -16 + (-(var25 / 2) + var23 - 4));
                SoftwareRasterizer.drawCircleOutline(var22, -16 - var25 / 2 + var23 - 4, 28, 0);
              }
              var23 -= 16;
            } else {
              for (var25 = -32; var25 < 32; var25++) {
                SoftwareRasterizer.setClip(0, var23 + var25, EmailLoginCredentials.field_f, 8 + var25 + var23);
                SoftwareRasterizer.fillCircle(var22, var23 - var25 / 2, 32, 7891535);
                SoftwareRasterizer.drawCircleOutline(var22, -(var25 / 2) + var23, 32, 0);
              }
              for (var25 = -32; var25 < 32; var25++) {
                SoftwareRasterizer.setClip(0, var23 + var25, EmailLoginCredentials.field_f, var25 + var23 + 8);
                SoftwareRasterizer.fillCircle(var22, -4 + var23 - var25 / 2, 28, 13484723);
                SoftwareRasterizer.drawCircleOutline(var22, -4 - var25 / 2 + var23, 28, 0);
              }
            }
            var23 -= 64;
            var22 -= 32;
            SoftwareRasterizer.resetClip();
            var25Lifetime1 = 0;
            var26 = 0;
            if (var21 != 0) {
              var25Lifetime1 = (int)(-16.0 * Math.sin(3.141592653589793 * (double)(SpriteState.field_v % 50) / 50.0));
              if (SpriteState.field_v / 50 % 5 == 0) {
                var26 = var25Lifetime1;
              }
            }
            var9[0] = var2.field_V.field_N[var20][0];
            var9[1] = var2.field_V.field_N[var20][1];
            var9[2] = var2.field_V.field_N[var20][2];
            var10[0] = var2.field_V.field_N[var20][3];
            var10[1] = var2.field_V.field_N[var20][4];
            var10[2] = var2.field_V.field_N[var20][5];
            var11[0] = var2.field_V.field_N[var20][6];
            var11[1] = var2.field_V.field_N[var20][7];
            var11[2] = var2.field_V.field_N[var20][8];
            var12[0] = var2.field_V.field_N[var20][9];
            var12[1] = var2.field_V.field_N[var20][10];
            var12[2] = var2.field_V.field_N[var20][11];
            if (46 != var2.field_V.field_N[var20][12]) {
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, -2 + (var23 + var26), var12, var9, 29, var10, var13[8][0], var22 + 0);
            }
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, var23 + var25Lifetime1 - (0 - var26 / 2), var12, var9, -82, var10, var13[3][var2.field_V.field_N[var20][15]], 12 + var22);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, 0 + var23 + var26 * 3 / 2, var12, var9, -81, var10, var13[1][var2.field_V.field_N[var20][12]], var22 + 0);
            if (var2.field_V.field_N[var20][12] != 46) {
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, 2 + var23, var12, var9, -93, var10, var13[7][0], var22 - 0);
            }
            if (var21 == 0) {
              var23 += 16;
              var22 += 8;
            }
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, -40 + (var23 + (16 + var26 * 3 / 2)), var12, var9, 92, var10, var13[0][var2.field_V.field_N[var20][13]], var22 + 0);
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, var23 - (-32 + (40 - var26 * 3 / 2)), var12, var9, -125, var10, var13[4][var2.field_V.field_N[var20][17]], var22 - 0);
            if (var2.field_V.field_N[var20][17] != 53 &&
              var2.field_V.field_N[var20][17] != 55) {
              stackIn_114_0 = var11;
              stackIn_114_1 = var23 + 32 + (-40 + var26 * 3 / 2);
              stackIn_114_2 = var12;
              stackIn_114_3 = var9;
              stackIn_114_4 = 20;
              stackIn_114_5 = var10;
              stackIn_114_6 = var13[6];
              if (var21 != 0) {
                stackIn_115_7 = 8;
              } else {
                stackIn_115_7 = 16;
              }
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(stackIn_114_0, stackIn_114_1, stackIn_114_2, stackIn_114_3, stackIn_114_4, stackIn_114_5, stackIn_114_6[stackIn_115_7 + (var20 + SpriteState.field_v / 200) % 8], var22 - 0);
            }
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, 3 * var26 / 2 + var23 + 16 - 40, var12, var9, -102, var10, var13[5][var2.field_V.field_N[var20][16]], var22 + 0);
            if (var21 == 0) {
              var23 -= 16;
              var22 -= 8;
            }
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(var11, var26 * 2 + (var25Lifetime1 + var23 + 0), var12, var9, -88, var10, var13[2][var2.field_V.field_N[var20][14]], var22 - 12);
            var22 += 32;
            var23 += 64;
            var27 = var2.field_V.field_k[var20];
            var28 = SpellProjectile.field_B.textWidth("Wmmmmmmmmmmm");
            if (var4 == var20) {
              var23 += 16;
            }
            var22 = var22 - (var28 / 2 + 7);
            var23 += 16;
            var16Lifetime2 = 15 + var28;
            SoftwareRasterizer.fillVerticalGradient(var22 + 3, -8 + (var23 + 3), var16Lifetime2 - 6, 15, var24, 8421504 ^ (8421504 | var24));
            SoftwareRasterizer.setClip(var22 + 3, -5 + var23, var16Lifetime2 + 3 + var22 - 6, -2 + (17 + (var23 - 8)) + 3);
            while (var16Lifetime2 > 0) {
              var16Lifetime2 = var16Lifetime2 - SupportPageHelpers.field_a.field_n;
              SupportPageHelpers.field_a.drawAdditive(var22 + (3 + var16Lifetime2), 3 + (var23 - 18), 64);
            }
            SoftwareRasterizer.resetClip();
            var16Lifetime2Lifetime1 = 15 + var28;
            SoftwareRasterizer.drawRoundedRectangle(var22, var23 - 8, var16Lifetime2Lifetime1, 21, 6, 0);
            SoftwareRasterizer.drawRoundedRectangle(2 + var22, -6 + var23, -4 + var16Lifetime2Lifetime1, 17, 4, 0);
            SoftwareRasterizer.drawRoundedRectangle(1 + var22, 1 + var23 - 8, var16Lifetime2Lifetime1 - 2, 19, 6, 16777215);
            SoftwareRasterizer.drawRoundedRectangle(var22 + 2, -8 + (2 + var23), -4 + var16Lifetime2Lifetime1, 17, 6, 0);
            var22 = var22 + (7 + var28 / 2);
            var29 = null;
            if ((1 << var20 & var2.field_b) != 0) {
              var29 = MembershipOfferScreen.field_b;
            } else {
              if ((~var2.field_a & var2.field_b) > 0) {
                if ((1 << var20 & var2.field_a) != 0) {
                  var29 = DiskCacheRequest.field_I;
                } else {
                  stackIn_137_0 = new StringBuilder().append(field_r);
                  if ((SpriteState.field_v & 11) >> 3 != 0) {
                    stackIn_138_1 = ".";
                  } else {
                    stackIn_138_1 = "";
                  }
                  stackIn_141_0 = ((StringBuilder) (Object) stackIn_137_0).append(stackIn_138_1);
                  if ((2 & SpriteState.field_v >> 3) == 0) {
                    stackIn_142_1 = "";
                  } else {
                    stackIn_142_1 = "..";
                  }
                  var29 = ((StringBuilder) (Object) stackIn_141_0).append(stackIn_142_1).toString();
                }
              }
            }
            if (var29 != null &&
              0 == (128 & SpriteState.field_v)) {
              var27 = var29;
            }
            SpellProjectile.field_B.drawCentered((String) (var27), var22 - 1, var23 + 1 + SpellProjectile.field_B.field_C / 2, 0, 0);
            SpellProjectile.field_B.drawCentered((String) (var27), var22, -1 + (SpellProjectile.field_B.field_C / 2 + 1) + var23, 0, 0);
            SpellProjectile.field_B.drawCentered((String) (var27), var22, SpellProjectile.field_B.field_C / 2 + var23 + 1, 16777215, -1);
            var22 -= 16;
            var23 -= 32;
            if (var2.field_V.hasStats(1)) {
              if (!var2.field_i) {
                stackIn_157_0 = 0;
              } else {
                stackIn_157_0 = var2.field_V.getPlayerValue(-108, var20);
              }
              var30 = stackIn_157_0;
              var31 = new Sprite(32 + (24 + var30 * 8), 80);
              var31.makeRasterTarget();
              for (var32 = 0; var32 < var30; var32++) {
                DualLinkDeque.field_b[7].drawFadedToColour(16 + 8 * var32 + 8, 24, 0, 16744703);
              }
              SoftwareRasterizer.blurRectangle(4, 4, 0, 0, 8 * var30 + 24 + 32, 80);
              GameSelectionHelpers.field_m.makeRasterTarget(true);
              var31.drawAdditive(-(var30 * 8) + (var22 - 36), -24 + var23 - 16, 256);
              var31.drawAdditive(-14 + (var22 + (-(8 * var30) - 16)) + 6, -16 + (-24 + var23), 256);
              var31.drawAdditive(var22 - (8 * var30 + 30), -24 + var23 - 22, 256);
              var31.drawAdditive(-16 - var30 * 8 + var22 - 14, -34 + var23, 256);
              for (var32Lifetime1 = 0; var32Lifetime1 < var30; var32Lifetime1++) {
                DualLinkDeque.field_b[7].draw(-14 - var32Lifetime1 * 8 + var22, var23 - 16);
              }
            }
            var20++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "lc.JA(" + param0 + ')');
        }
    }

    private final boolean drawButtonBox(boolean param0, int param1, byte param2, boolean param3, int param4, int param5, int param6) {
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        int stackIn_16_0 = 0;
        int stackIn_22_0;
        int stackIn_22_1;
        int stackIn_22_2;
        int stackIn_22_3;
        int stackIn_23_4;
        int stackIn_29_0;
        int stackIn_29_1;
        int stackIn_29_2;
        int stackIn_29_3;
        int stackIn_30_4;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 &&
            EmailLoginCredentials.field_g >= param4 &&
            (param1 + param4) > EmailLoginCredentials.field_g &&
            param6 <= MenuButtonPanel.field_I &&
            MenuButtonPanel.field_I < param5 + param6) {
            stackIn_16_0 = 1;
          } else {
            stackIn_16_0 = 0;
          }
          var8_int = stackIn_16_0;
          SoftwareRasterizer.drawRectangle(param4, param6, param1, param5, 14802120);
          param6++;
          param5 -= 2;
          param4++;
          param1 -= 2;
          SoftwareRasterizer.drawRectangle(param4, param6, param1, param5, 1572892);
          param1 -= 2;
          param5 -= 2;
          param4++;
          param6++;
          SoftwareRasterizer.drawRectangle(param4, param6, param1, param5, 7887708);
          param4++;
          param1 -= 2;
          var9 = -96 % ((32 - param2) / 42);
          param6++;
          param5 -= 2;
          if (param0) {
            stackIn_29_0 = param4;
            stackIn_29_1 = param6;
            stackIn_29_2 = param1;
            stackIn_29_3 = param5;
            if (var8_int == 0) {
              stackIn_30_4 = 13220778;
            } else {
              stackIn_30_4 = 16181230;
            }
            SoftwareRasterizer.fillRectangleAlpha(stackIn_29_0, stackIn_29_1, stackIn_29_2, stackIn_29_3, stackIn_30_4, 230);
          } else {
            stackIn_22_0 = param4;
            stackIn_22_1 = param6;
            stackIn_22_2 = param1;
            stackIn_22_3 = param5;
            if (var8_int != 0) {
              stackIn_23_4 = 14075852;
            } else {
              stackIn_23_4 = 11374744;
            }
            SoftwareRasterizer.fillRectangleAlpha(stackIn_22_0, stackIn_22_1, stackIn_22_2, stackIn_22_3, stackIn_23_4, 230);
          }
          SoftwareRasterizer.drawLine(param4 - 1, param6 + 3, param4 + 4, param6 - 2, 1572892);
          SoftwareRasterizer.drawLine(param4 - 2, 5 + param6, 5 + param4, param6 - 2, 14802120);
          SoftwareRasterizer.drawLine(-1 + param4, 5 + param6, 5 + param4, -1 + param6, 1572892);
          SoftwareRasterizer.drawLine(param4, 5 + param6, 5 + param4, param6, 7887708);
          SoftwareRasterizer.drawLine(param1 + (param4 - 0), param6 + 3, param1 + (-5 + param4), -2 + param6, 1572892);
          SoftwareRasterizer.drawLine(param1 + (1 + param4), param6 + 5, param1 + (param4 - 6), -2 + param6, 14802120);
          SoftwareRasterizer.drawLine(param4 + 0 + param1, param6 + 5, -6 + (param4 + param1), param6 - 1, 1572892);
          SoftwareRasterizer.drawLine(-1 + param4 + param1, 5 + param6, param1 + (-6 + param4), param6, 7887708);
          SoftwareRasterizer.drawLine(param4 - 1, param6 - (4 - param5), 4 + param4, 1 + param6 + param5, 1572892);
          SoftwareRasterizer.drawLine(param4 - 2, param6 - 6 + param5, 5 + param4, param5 + 1 + param6, 14802120);
          SoftwareRasterizer.drawLine(-1 + param4, param5 + (-6 + param6), 5 + param4, param5 + (0 + param6), 1572892);
          SoftwareRasterizer.drawLine(param4, param5 - 6 + param6, 5 + param4, param5 + param6 - 1, 7887708);
          SoftwareRasterizer.drawLine(param4 - 0 + param1, param5 + (-4 + param6), param1 + (-5 + param4), param6 + 1 + param5, 1572892);
          SoftwareRasterizer.drawLine(param1 + 1 + param4, param5 + param6 - 6, param4 + (-6 + param1), param5 + 1 + param6, 14802120);
          SoftwareRasterizer.drawLine(param1 + (param4 - 0), param6 - 6 + param5, param4 - 6 + param1, param5 + (param6 + 0), 1572892);
          SoftwareRasterizer.drawLine(param4 - (1 - param1), param5 + (param6 - 6), -6 + (param4 + param1), -1 + (param5 + param6), 7887708);
          stackIn_32_0 = var8_int;
          return stackIn_32_0 != 0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var8), "lc.MA(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    private final void drawOptionsPanel(boolean param0) {
        int var8 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        String[] var5 = null;
        int[] var6 = null;
        int var7 = 0;
        String var9 = null;
        int var10 = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        int var2_intLifetime3;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime1Lifetime1;
        var10 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (MenuScreen.getSessionFlag((byte) 112)) {
            this.drawCaption(12);
            return;
          }
          if (null == NameCheckHelpers.field_e) {
            NameCheckHelpers.field_e = EmptyPainter.findOrCreateListRequest(true, 10, 0, 7);
          }
          var2_int = 125 + QuickChatHelpers.field_a - 16;
          var2_int += 16;
          var3 = 0;
          SpellProjectile.field_B.drawCentered(FixedViewResizeListener.field_d, SocialDialog.field_tb[0] + ValidatedTextWidget.field_I, var2_int, var3, -1);
          SpellProjectile.field_B.drawCentered(TextHotspotWidget.field_H, SocialDialog.field_tb[1] + ValidatedTextWidget.field_I, var2_int, var3, -1);
          SpellProjectile.field_B.drawCentered(QuickChatCategory.field_o, SocialDialog.field_tb[2] + ValidatedTextWidget.field_I, var2_int, var3, -1);
          SpellProjectile.field_B.drawCentered(SpriteDecodeHelpers.field_d, SocialDialog.field_tb[3] + ValidatedTextWidget.field_I, var2_int, var3, -1);
          SpellProjectile.field_B.drawCentered(ScrollContainer.field_N, SocialDialog.field_tb[4] + ValidatedTextWidget.field_I, var2_int, var3, -1);
          if (!param0) {
            this.updateHoverSelection(-123);
          }
          boolean decompiledFrameRemainder0 = true;
          var2_int = var2_int + (8 + CachedArchiveProvider.field_t.field_C);
          if (!NameCheckHelpers.field_e.field_g) {
            var4 = PatchEnvelopeSet.field_f;
          } else {
            if (null != NameCheckHelpers.field_e.field_r) {
              var4 = WhirlpoolHasher.field_d;
              var5 = NameCheckHelpers.field_e.field_r[StatusDialog.field_Sb];
              var6 = NameCheckHelpers.field_e.field_l[StatusDialog.field_Sb];
              var7 = 0;
              for (var8 = 0; var8 < 10; var8++) {
                if (null != var5[var8]) {
                  var3Lifetime1 = 0;
                  if ((var8 & 1) == 1) {
                    var3Lifetime1 = 16777215;
                  }
                  var9 = var5[var8];
                  if (var9.equals(AccountFlowHelpers.field_b)) {
                    var3Lifetime1 = 16776960;
                    var7 = 1;
                  }
                  this.drawStatRow(var3Lifetime1, var6[4 * var8 + 1], var9, var6[3 + var8 * 4], var6[4 * var8], var8, (byte) -114, var6[2 + var8 * 4], var2_int);
                  var4 = "";
                }
                var2_int += 25;
              }
              if ((var7 == 0)) {
                var3Lifetime1Lifetime1 = 16776960;
                this.drawStatRow(var3Lifetime1Lifetime1, NameCheckHelpers.field_e.field_k, AccountFlowHelpers.field_b, NameCheckHelpers.field_e.field_s, NameCheckHelpers.field_e.field_i, -1, (byte) -126, NameCheckHelpers.field_e.field_h, var2_int);
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var4 = GradientBarButton.field_R;
            }
          }
          var3Lifetime2 = 0;
          var2_intLifetime1 = -16 + QuickChatHelpers.field_a + 125;
          SoftwareRasterizer.drawVerticalLine(-((-SocialDialog.field_tb[0] + SocialDialog.field_tb[1]) / 2) + SocialDialog.field_tb[0] + ValidatedTextWidget.field_I, 16 + (var2_intLifetime1 + 9), 276, var3Lifetime2);
          SoftwareRasterizer.drawVerticalLine(ValidatedTextWidget.field_I + (SocialDialog.field_tb[0] + SocialDialog.field_tb[1]) / 2, 16 + (9 + var2_intLifetime1), 276, var3Lifetime2);
          SoftwareRasterizer.drawVerticalLine(ValidatedTextWidget.field_I + (SocialDialog.field_tb[2] + SocialDialog.field_tb[1]) / 2, 16 + (9 + var2_intLifetime1), 276, var3Lifetime2);
          SoftwareRasterizer.drawVerticalLine(ValidatedTextWidget.field_I + (SocialDialog.field_tb[2] + SocialDialog.field_tb[3]) / 2, 16 + var2_intLifetime1 + 9, 276, var3Lifetime2);
          SoftwareRasterizer.drawVerticalLine(ValidatedTextWidget.field_I + (SocialDialog.field_tb[3] + SocialDialog.field_tb[4]) / 2, 9 + var2_intLifetime1 + 16, 276, var3Lifetime2);
          if ("" != var4) {
            var2_intLifetime2 = 16 + QuickChatHelpers.field_a + 125;
            SpellProjectile.field_B.drawText(var4, ValidatedTextWidget.field_I + 64, -16 + var2_intLifetime2, 0, -1);
          }
          if (StatusDialog.field_Sb != 0) {
            var2_intLifetime3 = QuickChatHelpers.field_a + 125;
            SpellProjectile.field_B.drawCentered(SceneTabbedPanel.field_Cb, 320 + ValidatedTextWidget.field_I, var2_intLifetime3 - 16, 0, -1);
          } else {
            var2_intLifetime3 = QuickChatHelpers.field_a + 125;
            SpellProjectile.field_B.drawCentered(MenuButtonPanel.field_N, ValidatedTextWidget.field_I + 320, var2_intLifetime3 - 16, 0, -1);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.U(" + param0 + ')');
        }
    }

    final void leaveScreen(byte param0) {
        if (param0 != 103) {
          return;
        }
        try {
          if (6 == this.field_l) {
            NameCheckHelpers.field_e = null;
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "lc.D(" + param0 + ')');
        }
    }

    private final void drawMenuItem(byte param0, boolean param1, int param2) {
        int stackIn_63_0;
        int stackIn_63_1;
        int stackIn_63_2;
        int stackIn_63_3;
        int stackIn_64_4 = 0;
        int stackIn_68_5;
        int stackIn_77_0 = 0;
        int stackIn_81_0 = 0;
        int stackIn_93_0 = 0;
        int stackIn_97_0 = 0;
        int stackIn_102_0 = 0;
        int stackIn_121_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var4_int = 0;
        RuntimeException var4 = null;
        String var5 = null;
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
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var15Lifetime1;
        var20 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          boolean decompiledFrameRemainder0 = true;
          var4_int = NumericDateInputWidget.field_L[this.field_l][param2];
          var5 = GameSelectionHelpers.field_g[var4_int];
          if (var4_int == 8) {
            if (NameTable.field_f != 0 &&
              MatchingFieldValidator.field_r != 0 &&
              10 != NameTable.field_f &&
              10 != MatchingFieldValidator.field_r) {
              if (NameTable.field_f != 1 &&
                MatchingFieldValidator.field_r != 1) {
                if (NameTable.field_f != 2 &&
                  2 != MatchingFieldValidator.field_r &&
                  3 != NameTable.field_f &&
                  3 != MatchingFieldValidator.field_r &&
                  NameTable.field_f != 4 &&
                  MatchingFieldValidator.field_r != 4) {
                  if ((NameTable.field_f == 15 ||
                    MatchingFieldValidator.field_r == 15)) {
                    var5 = GameSelectionHelpers.field_g[14];
                  }
                } else {
                  var5 = DropTargetWidget.field_I;
                }
              } else {
                var5 = ConfirmedNameValidator.field_r;
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              var5 = GameSelectionHelpers.field_g[7];
            }
          }
          var6 = CachedArchiveProvider.field_t.textWidth(var5);
          var7 = this.getItemTop(41, param2);
          var8 = this.getItemY(param2, (byte) 103);
          var9 = this.getItemColumnLeft(param2, -7661);
          if (var4_int == 20 ||
            var4_int == 21) {
            var6 = FrameAndQuickChatHelpers.field_c + 120;
          }
          var10 = -var6 + (var7 + var8) >> 1;
          var11 = this.getItemSpacing(param2, 110);
          var12 = -var7 + var8;
          var13 = this.getItemSpacing(param2, 100);
          var14 = 0;
          if (this.field_l != 0 &&
            15 != this.field_l) {
            stackIn_63_0 = var7 + 2;
            stackIn_63_1 = 1 + var9;
            stackIn_63_2 = var12 - 4;
            stackIn_63_3 = -2 + var13;
            if (!param1) {
              stackIn_64_4 = 0;
            } else {
              stackIn_64_4 = 2964062;
            }
            if (param1) {
              stackIn_68_5 = 16711164;
            } else {
              stackIn_68_5 = 5928124;
            }
            SoftwareRasterizer.fillVerticalGradient(stackIn_63_0, stackIn_63_1, stackIn_63_2, stackIn_63_3, stackIn_64_4, stackIn_68_5);
            var14 = 1;
            SoftwareRasterizer.drawRoundedRectangle(1 + var7, var9, var12 - 2, var13, 5, 0);
            SoftwareRasterizer.drawRoundedRectangle(var7, var9 - 1, var12, var13 + 2, 6, 16777215);
            SoftwareRasterizer.setClip(var7 + 2, 1 + var9, var12 + (2 + var7 - 4), -2 + (1 + var9 + var13));
            for (var15 = 2 + var7; (var12 + (2 + var7 - 4)) > var15; var15 = var15 + AudioAndCookieHelpers.field_d.field_n) {
              AudioAndCookieHelpers.field_d.drawAdditive(var15, -16 + var9, 32);
            }
            SoftwareRasterizer.resetClip();
            SoftwareRasterizer.fillRoundedRectangleBlended(var7 + 4, var9 + 2, var12 - 8, 9, 4, 16777215, 64);
            SoftwareRasterizer.fillRoundedRectangleBlended(5 + var7, var9 + 3, var12 - 10, 7, 3, 16777215, 64);
          }
          stackIn_77_0 = (!param1) ? 16173159 : 7097239;
          var15Lifetime1 = stackIn_77_0;
          stackIn_81_0 = (param1) ? 16598235 : 16738820;
          var16 = stackIn_81_0;
          if (!MenuScreen.getSessionFlag((byte) 112) &&
            0 < AccountFlowHelpers.field_c &&
            var4_int == 15) {
            stackIn_93_0 = (!param1) ? 0 : 7097239;
            var15Lifetime1 = stackIn_93_0;
            stackIn_97_0 = (!param1) ? 16738820 : 16777215;
            var16 = stackIn_97_0;
          }
          var17 = var15Lifetime1;
          stackIn_102_0 = (param1) ? 7536857 : 10027008;
          var18 = stackIn_102_0;
          if (param0 != 98) {
            this.drawOptionsPanel(false);
          }
          if (var14 != 0) {
            var17 = var16;
            var18 = 0;
          } else {
            if (NumericDateInputWidget.field_L[this.field_l].length > 1) {
              var17 = NameCheckRequest.blendColourStep(param2, NumericDateInputWidget.field_L[this.field_l].length, -1422079448, var16, var15Lifetime1);
            }
          }
          Js5Transport.drawShadowedText(var9, var10, var5, var18, var17, param0 ^ -15);
          if (var4_int != 20 &&
            var4_int != 21) {
            return;
          }
          var10 = var10 + FrameAndQuickChatHelpers.field_c;
          SoftwareRasterizer.fillRoundedRectangle(var10, -4 + (var9 + var11 / 2), 121, 8, 3, var17);
          SoftwareRasterizer.drawRoundedRectangle(var10, -4 + (var11 / 2 + var9), 121, 8, 3, var18);
          if (20 == var4_int) {
            stackIn_121_0 = 120 * CheckboxPainter.field_l / 256;
          } else {
            stackIn_121_0 = 120 * Bzip2State.field_A / 256;
          }
          var19 = stackIn_121_0;
          SoftwareRasterizer.fillRoundedRectangle(-4 + var10 + var19, var9 + 3, 8, var11 - 6, 3, var17);
          SoftwareRasterizer.drawRoundedRectangle(-4 + var19 + var10, 3 + var9, 8, -6 + var11, 3, var18);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "lc.CA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int getItemColumnLeft(int param0, int param1) {
        RuntimeException var3 = null;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.field_l != 14 &&
            this.field_l != 8 &&
            this.field_l != 7) {
            if (param1 == -7661) {
              stackIn_14_0 = this.getItemLeft(param0, param1 + 7736) + QuickChatHelpers.field_a;
              return stackIn_14_0;
            }
            stackIn_12_0 = 94;
            return stackIn_12_0;
          }
          stackIn_9_0 = this.getItemLeft(param0, 75) + QuickChatHelpers.field_a + QuickChatHelpers.field_a / 8;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.G(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawBody(int param0) {
        boolean discarded$0 = false;
        boolean discarded$3 = false;
        boolean discarded$1 = false;
        boolean discarded$2 = false;
        boolean discarded$5 = false;
        String[] array$4 = null;
        int stackIn_87_0 = 0;
        boolean stackIn_91_1 = false;
        int stackIn_152_0 = 0;
        int stackIn_154_0 = 0;
        int stackIn_353_0 = 0;
        int stackIn_353_1 = 0;
        int stackIn_376_0 = 0;
        int stackIn_376_1 = 0;
        int stackIn_493_0 = 0;
        int stackIn_493_1 = 0;
        int stackIn_573_0 = 0;
        int stackIn_573_1 = 0;
        int stackIn_586_0 = 0;
        int stackIn_636_0 = 0;
        int stackIn_636_1 = 0;
        int stackIn_731_0 = 0;
        int stackIn_731_1 = 0;
        int stackIn_770_0 = 0;
        int stackIn_770_1 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        Sprite var8 = null;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13_int = 0;
        String var13 = null;
        double var14_double = 0.0;
        int var14 = 0;
        String var14_ref_String = null;
        int var15 = 0;
        String var15_ref_String = null;
        double var16_double = 0.0;
        int var16 = 0;
        int var17_int = 0;
        double var17_double = 0.0;
        Object var17 = null;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        double var20_double = 0.0;
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25_int = 0;
        double var25 = 0.0;
        int var27 = 0;
        int var28 = 0;
        int var29 = 0;
        int var30 = 0;
        int var31 = 0;
        Sprite var32 = null;
        String var33 = null;
        String var34 = null;
        String var35 = null;
        String var36 = null;
        String var37 = null;
        String var38 = null;
        String var39 = null;
        String var40 = null;
        String var13Lifetime1;
        int stackIn_152_0Lifetime1;
        int stackIn_353_0Lifetime1;
        int stackIn_353_1Lifetime1;
        int stackIn_376_0Lifetime1;
        int stackIn_376_1Lifetime1;
        int stackIn_493_0Lifetime1;
        int stackIn_493_1Lifetime1;
        int stackIn_573_0Lifetime1;
        int stackIn_573_1Lifetime1;
        int stackIn_636_0Lifetime1;
        int stackIn_636_1Lifetime1;
        int stackIn_731_0Lifetime1;
        int stackIn_731_1Lifetime1;
        int stackIn_770_0Lifetime1;
        int var7Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        int var12Lifetime3;
        int var12Lifetime4;
        int var13_intLifetime1;
        int var13_intLifetime2;
        int var13_intLifetime3;
        int var13_intLifetime4;
        int var13_intLifetime5;
        int var13_intLifetime6;
        int var13_intLifetime7;
        double var14_doubleLifetime1;
        double var14_doubleLifetime2;
        int var15Lifetime1;
        int var15Lifetime2;
        int var15Lifetime3;
        int var15Lifetime4;
        int var16Lifetime1;
        int var16Lifetime2;
        int var16Lifetime3;
        int var16Lifetime4;
        int var16Lifetime5;
        int var17_intLifetime1;
        int var17_intLifetime2;
        int var17_intLifetime3;
        int var17_intLifetime4;
        int var18Lifetime1;
        int var18Lifetime2;
        int var18Lifetime3;
        int var19Lifetime1;
        int var19Lifetime2;
        int var19Lifetime3;
        int var20Lifetime1;
        int var24Lifetime1;
        int var24Lifetime2;
        int var25_intLifetime1;
        double var25Lifetime1;
        int var27Lifetime1;
        int var28Lifetime1;
        int stackIn_770_1Lifetime1;
        int var24Lifetime3;
        int var15Lifetime2Lifetime1;
        int var15Lifetime3Lifetime1;
        int var15Lifetime3Lifetime2;
        int var16Lifetime4Lifetime1;
        int var16Lifetime4Lifetime2;
        int var17_intLifetime4Lifetime1;
        int var24Lifetime1Lifetime1;
        var29 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var32 = DualLinkDeque.field_b[7].toRgbSprite();
          var3 = -GridContainer.field_P + NodeHashTableIterator.field_j;
          this.drawBottomPanel(-26733);
          this.field_m = -1;
          discarded$0 = this.drawButtonBox(false, 245, (byte) -43, false, ValidatedTextWidget.field_I + 26, 245, QuickChatHelpers.field_a + 178);
          if (this.field_d < 0) {
            this.field_d = 0;
          }
          var4 = new int[]{0, 1, 2, 3, 4, 5, 6, 7, 8, 9};
          if ((-6 + var4.length) < this.field_d) {
            this.field_d = -6 + var4.length;
          }
          if (this.field_d > this.field_h) {
            this.field_h = this.field_d;
          }
          if (6 + this.field_d <= this.field_h) {
            this.field_h = 5 + this.field_d;
          }
          var5 = QuickChatHelpers.field_a + 102;
          var6 = 41 + ValidatedTextWidget.field_I;
          SoftwareRasterizer.addHorizontalLineScaled(var6, var5 + 4, 558, 16777215, 128);
          SoftwareRasterizer.fillRectangleAlpha(var6, 5 + var5, 558, 55, 16777215, 64);
          SoftwareRasterizer.addHorizontalLineScaled(var6, var5 + 65 - 5, 558, 16777215, 128);
          var7 = var6 - FadingModalPanel.field_I.field_n;
          if (this.field_d > 0) {
            if (var7 <= EmailLoginCredentials.field_g &&
              var6 > EmailLoginCredentials.field_g &&
              var5 <= MenuButtonPanel.field_I &&
              var5 + 65 > MenuButtonPanel.field_I) {
              FadingModalPanel.field_I.drawScaledWithOpacity(var7, var5, FadingModalPanel.field_I.field_n, 65, 16777215);
              FadingModalPanel.field_I.drawScaledAlpha(var7, var5, FadingModalPanel.field_I.field_n, 65, 128);
              this.field_m = 10;
              this.field_i = -1;
            } else {
              FadingModalPanel.field_I.drawScaled(var7, var5, FadingModalPanel.field_I.field_n, 65);
            }
          } else {
            FadingModalPanel.field_I.drawScaledWithOpacity(var7, var5, FadingModalPanel.field_I.field_n, 65, 0);
            FadingModalPanel.field_I.drawScaledAlpha(var7, var5, FadingModalPanel.field_I.field_n, 65, 128);
          }
          var7Lifetime1 = var6 + 558;
          var8 = FadingModalPanel.field_I.copyFlippedHorizontal();
          if (this.field_d < -6 + var4.length) {
            if (var7Lifetime1 <= EmailLoginCredentials.field_g &&
              EmailLoginCredentials.field_g < (var7Lifetime1 + FadingModalPanel.field_I.field_n) &&
              var5 <= MenuButtonPanel.field_I &&
              (65 + var5) > MenuButtonPanel.field_I) {
              var8.drawScaledWithOpacity(var7Lifetime1, var5, FadingModalPanel.field_I.field_n, 65, 16777215);
              var8.drawScaledAlpha(var7Lifetime1, var5, FadingModalPanel.field_I.field_n, 65, 128);
              this.field_m = 10;
              this.field_i = 1;
            } else {
              var8.drawScaled(var7Lifetime1, var5, FadingModalPanel.field_I.field_n, 65);
            }
          } else {
            var8.drawScaledWithOpacity(var7Lifetime1, var5, FadingModalPanel.field_I.field_n, 65, 0);
            var8.drawScaledAlpha(var7Lifetime1, var5, FadingModalPanel.field_I.field_n, 65, 128);
          }
          var9 = this.field_d;
          while (var9 < this.field_d + 6) {
            var10 = (var9 - this.field_d) * 89 + var6 + 24;
            var11 = var5;
            var12 = 0;
            stackIn_152_0 = var9;
            if (stackIn_152_0 == 0) {
              var12 = 16711935;
            }
            if (var9 == 1) {
              var12 = 16711680;
              var11 += 0;
            }
            if (var9 == 2) {
              var11 += 0;
              var12 = 16746632;
            }
            if (var9 == 3) {
              var11 += 0;
              var12 = 16776960;
            }
            if (4 == var9) {
              var11 += 0;
              var12 = 65535;
            }
            if (var9 == 5) {
              var11 += 0;
              var12 = 34816;
            }
            if (var9 == 6) {
              var11 += 0;
              var12 = 16777215;
            }
            if (var9 == 7) {
              var11 += 0;
              var12 = 4521762;
            }
            if (var9 == 8) {
              var11 += 0;
              var12 = 1364125;
            }
            if (var9 == 9) {
              var11 += 0;
              var12 = 8947848;
            }
            stackIn_87_0 = (~OptionToggleHelpers.field_b != ~var9) ? 0 : 1;
            var13_int = stackIn_87_0;
            SoftwareRasterizer.fillRectangle(var10, var11, 65, 65, var12);
            stackIn_91_1 = (var9 == this.field_h);
            discarded$3 = this.drawButtonBox(stackIn_91_1, 65, (byte) 74, true, var10, 65, var11);
            if (var13_int != 0) {
              if (var9 == 9 &&
                !ArcanistsMulti.isOfflineOrNotLoaded((byte) -77) &&
                0 < SpellbookCaptionGlobals.field_d) {
                var13_int = 0;
              }
              if (0L != (1L << -14 + var9 * 8 & GameListSortHelpers.field_e) &&
                var9 > 1 &&
                var9 < 9 &&
                (GameListSortHelpers.field_e & 1L << -13 + 8 * var9 + EffectVolumeHelpers.field_a / 2) != 0L) {
                var13_int = 0;
              }
              if (var13_int != 0) {
                var14_double = 0.5 * (3.14 * Math.sin((double)SpriteState.field_v * 0.1)) + 3.14;
                QuickChatPhrase.field_x[10].drawRotatedQuarterScale(2048, (int)(16.0 * Math.cos(var14_double)) + var11 + 16, 125, var10 + ((int)(Math.sin(var14_double) * 32.0) + 32), 0);
              }
            }
            boolean decompiledFrameRemainder2 = true;
            if (this.field_h == var9) {
              if (this.field_h != 9) {
                if (0L == (1L << -14 + 8 * this.field_h & GameListSortHelpers.field_e) &&
                  1 < this.field_h) {
                  WhirlpoolHasher.field_o[10].drawSilhouette(26 + (ValidatedTextWidget.field_I + (245 - WhirlpoolHasher.field_o[9].field_n) / 2), (-WhirlpoolHasher.field_o[9].field_w + 245) / 2 + 178 + QuickChatHelpers.field_a, var12 >> 1 & 8355711 | 8421504);
                  WhirlpoolHasher.field_o[var9].drawSilhouette(ValidatedTextWidget.field_I + (32 - (6 - (-WhirlpoolHasher.field_o[var9].field_n + 245) / 2)), (-WhirlpoolHasher.field_o[9].field_w + 245) / 2 + 178 + QuickChatHelpers.field_a, 8355711 & var12 >> 1 | 8421504);
                  SoftwareRasterizer.blurRectangle(6, 6, 8 + (32 + ValidatedTextWidget.field_I), 186 + QuickChatHelpers.field_a, 229, 229);
                  WhirlpoolHasher.field_o[10].drawTransparentWithOpacity((-WhirlpoolHasher.field_o[9].field_n + 245) / 2 + ValidatedTextWidget.field_I + 26, (245 - WhirlpoolHasher.field_o[9].field_w) / 2 + QuickChatHelpers.field_a + 178, 64);
                  WhirlpoolHasher.field_o[var9].drawTransparentWithOpacity((245 - WhirlpoolHasher.field_o[var9].field_n) / 2 + (-6 + ValidatedTextWidget.field_I + 32), (245 - WhirlpoolHasher.field_o[9].field_w) / 2 + QuickChatHelpers.field_a + 178, 64);
                  GameSelectionHelpers.field_m.makeRasterTarget(true);
                  var14 = 416 + (ValidatedTextWidget.field_I << 4) + 1960;
                  var15 = 2848 + ((QuickChatHelpers.field_a << 4) + 1960);
                  if (!ArcanistsMulti.isOfflineOrNotLoaded((byte) -102)) {
                    var32.drawRotatedAboutPivot(80, 1088, var14, var15, SpriteState.field_v * 30 - 26214, 4096);
                    var32.drawRotatedAboutPivot(80, 1088, var14, var15, -13107 + SpriteState.field_v * 30, 4096);
                    var32.drawRotatedAboutPivot(80, 1088, var14, var15, SpriteState.field_v * 30 + 0, 4096);
                    var32.drawRotatedAboutPivot(80, 1088, var14, var15, 13107 + SpriteState.field_v * 30, 4096);
                    var32.drawRotatedAboutPivot(80, 1088, var14, var15, 26214 + SpriteState.field_v * 30, 4096);
                    if (5 <= var3) {
                      var16_double = (double)(SpriteState.field_v & 255) * 3.141592653589793 / 128.0;
                      var18 = (int)(4096.0 + 256.0 * Math.cos(4.0 * var16_double) - 256.0);
                      var19 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var16_double));
                      QuickChatPhrase.field_x[4].drawRotatedQuarterScale(var18, QuickChatHelpers.field_a + 300, param0 ^ 0, 148 + ValidatedTextWidget.field_I, var19);
                      QuickChatPhraseCache.fillCircleMasked(16, (byte) 111, 128, -(8 * var18 / 4096) + (148 + ValidatedTextWidget.field_I), -(var18 * 8 / 4096) + 300 + QuickChatHelpers.field_a);
                    }
                  }
                  if (!(!SpellProjectile.isPointerInRect(256, 178 + QuickChatHelpers.field_a, 256, -8, ValidatedTextWidget.field_I + 26))) {
                    this.field_i = var9;
                    this.field_m = 5;
                  }
                  decompiledFrameRemainder2 = false;
                }
                else {
                  WhirlpoolHasher.field_o[10].drawSilhouette(32 + (ValidatedTextWidget.field_I - 6) + (-WhirlpoolHasher.field_o[9].field_n + 245) / 2, 178 + QuickChatHelpers.field_a + (245 - WhirlpoolHasher.field_o[9].field_w) / 2, (16711422 & var12) >> 1 | 8421504);
                  WhirlpoolHasher.field_o[var9].drawSilhouette(-6 + ValidatedTextWidget.field_I - (-32 - (-WhirlpoolHasher.field_o[var9].field_n + 245) / 2), (245 - WhirlpoolHasher.field_o[9].field_w) / 2 + QuickChatHelpers.field_a + 178, 8421504 | (var12 & 16711422) >> 1);
                  SoftwareRasterizer.blurRectangle(6, 6, 8 + ValidatedTextWidget.field_I + 32, 8 + QuickChatHelpers.field_a + 178, 229, 229);
                  WhirlpoolHasher.field_o[10].drawTransparent((245 - WhirlpoolHasher.field_o[9].field_n) / 2 + ValidatedTextWidget.field_I + 26, QuickChatHelpers.field_a + 178 + (245 - WhirlpoolHasher.field_o[9].field_w) / 2);
                  WhirlpoolHasher.field_o[var9].drawTransparent(-6 + ValidatedTextWidget.field_I + (32 + (245 - WhirlpoolHasher.field_o[var9].field_n) / 2), (245 - WhirlpoolHasher.field_o[9].field_w) / 2 + (QuickChatHelpers.field_a + 178));
                }
              } else {
                if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -72) &&
                  0 >= SpellbookCaptionGlobals.field_d) {
                  WhirlpoolHasher.field_o[10].drawSilhouette(32 + (ValidatedTextWidget.field_I - 6 + (245 - WhirlpoolHasher.field_o[9].field_n) / 2), 178 + QuickChatHelpers.field_a + (245 - WhirlpoolHasher.field_o[9].field_w) / 2, (16711422 & var12 | 16843009) >> 1);
                  WhirlpoolHasher.field_o[var9].drawSilhouette((245 - WhirlpoolHasher.field_o[var9].field_n) / 2 + (ValidatedTextWidget.field_I + 32 - 6), 178 + (QuickChatHelpers.field_a + (245 - WhirlpoolHasher.field_o[9].field_w) / 2), (var12 & 16711422 | 16843009) >> 1);
                  SoftwareRasterizer.blurRectangle(6, 6, ValidatedTextWidget.field_I + 32 + 8, 8 + (QuickChatHelpers.field_a + 178), 229, 229);
                  WhirlpoolHasher.field_o[10].drawTransparentWithOpacity(-6 + (ValidatedTextWidget.field_I + 32 + (-WhirlpoolHasher.field_o[9].field_n + 245) / 2), (-WhirlpoolHasher.field_o[9].field_w + 245) / 2 + 178 + QuickChatHelpers.field_a, 64);
                  WhirlpoolHasher.field_o[var9].drawTransparentWithOpacity((245 - WhirlpoolHasher.field_o[var9].field_n) / 2 + (ValidatedTextWidget.field_I + 26), QuickChatHelpers.field_a - (-178 - (-WhirlpoolHasher.field_o[9].field_w + 245) / 2), 64);
                  GameSelectionHelpers.field_m.makeRasterTarget(true);
                } else {
                  WhirlpoolHasher.field_o[10].drawSilhouette((-WhirlpoolHasher.field_o[9].field_n + 245) / 2 - 6 + (ValidatedTextWidget.field_I + 32), 178 + (QuickChatHelpers.field_a + (-WhirlpoolHasher.field_o[9].field_w + 245) / 2), (16843008 | var12 & 16711422) >> 1);
                  WhirlpoolHasher.field_o[var9].drawSilhouette(32 + (ValidatedTextWidget.field_I + (-6 + (245 - WhirlpoolHasher.field_o[var9].field_n) / 2)), (245 - WhirlpoolHasher.field_o[9].field_w) / 2 + QuickChatHelpers.field_a + 178, var12 >> 1 & 8355711 | 8421504);
                  SoftwareRasterizer.blurRectangle(6, 6, 32 + ValidatedTextWidget.field_I + 8, 8 + (QuickChatHelpers.field_a + 178), 229, 229);
                  WhirlpoolHasher.field_o[10].drawTransparent((245 - WhirlpoolHasher.field_o[9].field_n) / 2 + 32 + (ValidatedTextWidget.field_I - 6), (245 - WhirlpoolHasher.field_o[9].field_w) / 2 + QuickChatHelpers.field_a + 178);
                  WhirlpoolHasher.field_o[var9].drawTransparent(-6 + ValidatedTextWidget.field_I + (32 + (245 - WhirlpoolHasher.field_o[var9].field_n) / 2), 178 + (QuickChatHelpers.field_a + (-WhirlpoolHasher.field_o[9].field_w + 245) / 2));
                  GameSelectionHelpers.field_m.makeRasterTarget(true);
                }
              }
            }
            WhirlpoolHasher.field_o[10].drawHalfSize(2 + var10, var11);
            WhirlpoolHasher.field_o[var9].drawHalfSize(var10 + 2, var11);
            if (SpellProjectile.isPointerInRect(65, var11, 65, -8, var10)) {
              this.field_m = 0;
              this.field_i = var9;
            }
            var9++;
          }
          discarded$1 = this.drawButtonBox(false, 332, (byte) -71, false, 287 + ValidatedTextWidget.field_I, 245, 178 + QuickChatHelpers.field_a);
          discarded$2 = this.drawButtonBox(true, 284, (byte) 108, false, 21 + ValidatedTextWidget.field_I + 287, 29, -4 + (178 + QuickChatHelpers.field_a));
          CachedArchiveProvider.field_t.drawParagraph(PasswordFieldPainter.field_F, 21 + (290 + ValidatedTextWidget.field_I) - 1, -4 + (QuickChatHelpers.field_a + 178 - 1), 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
          CachedArchiveProvider.field_t.drawParagraph(PasswordFieldPainter.field_F, 311 + ValidatedTextWidget.field_I, -2 + (178 + QuickChatHelpers.field_a) - 4, 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
          CachedArchiveProvider.field_t.drawParagraph(PasswordFieldPainter.field_F, 290 + (ValidatedTextWidget.field_I + 21), -5 + QuickChatHelpers.field_a + 178, 281, 29, 12569299, -1, param0, 1, CachedArchiveProvider.field_t.field_C);
          var9Lifetime1 = -1;
          var10Lifetime1 = -1;
          var11Lifetime1 = 0;
          stackIn_152_0Lifetime1 = 0;
          var12Lifetime1 = stackIn_152_0Lifetime1;
          scanLoop1: while (true) {
            stackIn_154_0 = ~var12Lifetime1;
            if (stackIn_154_0 > -9) {
              for (var13_intLifetime1 = 0; var13_intLifetime1 < 2; var13_intLifetime1++) {
                var14 = 290 + ValidatedTextWidget.field_I + 41 * var12Lifetime1;
                var15Lifetime1 = 209 + (QuickChatHelpers.field_a + var13_intLifetime1 * 41);
                discarded$5 = this.drawButtonBox(true, 39, (byte) -104, true, var14, 39, var15Lifetime1);
                var16 = ThrowableFormatHelpers.field_f[var13_intLifetime1 + 2 * var12Lifetime1];
                stackIn_154_0 = ~var16;
                if (stackIn_154_0 != 0) {
                  var17_int = 1;
                  var18Lifetime1 = var16;
                  var19Lifetime1 = var18Lifetime1 / 12;
                  SoftwareRasterizer.setClip(1 + var14, var15Lifetime1 + 1, 37 + var14, 37 + var15Lifetime1);
                  if (var18Lifetime1 >= 0) {
                    if (var19Lifetime1 != var9Lifetime1 ||
                      var9Lifetime1 == -1) {
                      var9Lifetime1 = var19Lifetime1;
                      var11Lifetime1 = 0;
                    }
                    if (var18Lifetime1 % 12 >= 10) {
                      if (var19Lifetime1 > 0 &&
                        5 > var11Lifetime1) {
                        var17_int = 0;
                      }
                    } else {
                      if ((1 & var18Lifetime1) == 1 &&
                        var10Lifetime1 != -1 + var18Lifetime1) {
                        var17_int = 0;
                      }
                    }
                    if (var17_int != 0) {
                      var11Lifetime1++;
                      var10Lifetime1 = var18Lifetime1;
                    }
                  }
                  if (var17_int != 0) {
                    LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var16]].drawTransparent(var14 - 1, var15Lifetime1 - 1);
                  } else {
                    LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var16]].drawTransparentWithOpacity(var14 - 1, -1 + var15Lifetime1, 64);
                    SoftwareRasterizer.drawLine(var14, var15Lifetime1, var14 + 32, 32 + var15Lifetime1, 16711680);
                    SoftwareRasterizer.drawLine(32 + var14, var15Lifetime1, var14, 32 + var15Lifetime1, 16711680);
                    ThrowableFormatHelpers.field_f[var13_intLifetime1 + 2 * var12Lifetime1] = -1;
                  }
                  boolean decompiledFrameRemainder5 = true;
                  if (!ArcanistsMulti.isOfflineOrNotLoaded((byte) -62)) {
                    if (var16 < 108) {
                      if (var16 >= 22) {
                        if (var19Lifetime1 > 1 &&
                          0L == (GameListSortHelpers.field_e & 1L << var19Lifetime1 * 8 - 14) && (OptionToggleHelpers.field_b != var19Lifetime1 ||
                          ~EffectVolumeHelpers.field_a != ~(-(var19Lifetime1 * 12) + var16) &&
                          ~(EffectVolumeHelpers.field_a + 1) != ~(var16 - var19Lifetime1 * 12))) {
                          IconHighlightPainter.field_d.drawScaledAlpha(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                          decompiledFrameRemainder5 = false;
                        }
                        else {
                          if (var18Lifetime1 % 12 >= 10) {
                            if ((1L << -18 + (var18Lifetime1 % 12 + 8 * var19Lifetime1) & GameListSortHelpers.field_e) == 0L) {
                              IconHighlightPainter.field_d.drawScaledAlpha(-1 + var14, -1 + var15Lifetime1, 40, 40, 128);
                            }
                          } else {
                            if ((1 & var18Lifetime1) == 1 &&
                              (1L << -13 + 8 * var19Lifetime1 + (var18Lifetime1 % 12 - 1) / 2 & GameListSortHelpers.field_e) == 0L && (~OptionToggleHelpers.field_b != ~var19Lifetime1 ||
                              -(var19Lifetime1 * 12) + var16 != 1 + EffectVolumeHelpers.field_a)) {
                              IconHighlightPainter.field_d.drawScaledAlpha(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                            }
                          }
                        }
                      }
                    } else {
                      if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -119) ||
                        SpellbookCaptionGlobals.field_d == 0) {
                        IconHighlightPainter.field_d.drawScaledAlpha(-1 + var14, var15Lifetime1 - 1, 40, 40, 128);
                      }
                    }
                  } else {
                    if (var16 >= 22) {
                      if (~OptionToggleHelpers.field_b == ~var19Lifetime1) {
                        if ((~EffectVolumeHelpers.field_a != ~(-(var19Lifetime1 * 12) + var16)) &&
                          (-(var19Lifetime1 * 12) + var16 != 1 + EffectVolumeHelpers.field_a)) {
                          IconHighlightPainter.field_d.drawScaledAlpha(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                        }
                      } else {
                        IconHighlightPainter.field_d.drawScaledAlpha(var14 - 1, -1 + var15Lifetime1, 40, 40, 128);
                      }
                    }
                  }
                  SoftwareRasterizer.resetClip();
                  if (EmailLoginCredentials.field_g >= var14 &&
                    var15Lifetime1 <= MenuButtonPanel.field_I &&
                    EmailLoginCredentials.field_g < (var14 + 39) &&
                    var15Lifetime1 + 39 > MenuButtonPanel.field_I) {
                    this.field_m = 2;
                    this.field_i = var13_intLifetime1 + 2 * var12Lifetime1;
                  }
                }
              }
              var12Lifetime1++;
              continue scanLoop1;
            }
            break;
          }
          for (var12Lifetime2 = 0; var12Lifetime2 < 128; var12Lifetime2++) {
            var13_intLifetime2 = 96;
            var14_doubleLifetime1 = (double)var12Lifetime2 * 3.141592653589793 * 2.0 / 128.0;
            var16Lifetime1 = 132 + (ValidatedTextWidget.field_I - (int)(Math.cos(var14_doubleLifetime1) * (double)var13_intLifetime2));
            var17_intLifetime1 = -16 + (122 + (QuickChatHelpers.field_a + 178 - (int)((double)var13_intLifetime2 * Math.sin(var14_doubleLifetime1))));
            SoftwareRasterizer.fillCircle(var16Lifetime1 + 16, 16 + var17_intLifetime1, 5, 0);
          }
          for (var12Lifetime3 = 0; var12Lifetime3 < 128; var12Lifetime3++) {
            var13_intLifetime3 = 96;
            var14_doubleLifetime2 = 3.141592653589793 * (double)var12Lifetime3 * 2.0 / 128.0;
            var16Lifetime2 = 122 + (ValidatedTextWidget.field_I + 32) + (-6 - (int)(Math.cos(var14_doubleLifetime2) * (double)var13_intLifetime3) - 16);
            var17_intLifetime2 = 178 + (QuickChatHelpers.field_a + 122) - ((int)(Math.sin(var14_doubleLifetime2) * (double)var13_intLifetime3) + 16);
            SoftwareRasterizer.fillCircle(var16Lifetime2 + 16, 16 + var17_intLifetime2, 4, 10326659);
          }
          var12Lifetime4 = this.field_h * 12;
          var11Lifetime2 = 12;
          if (var12Lifetime4 < 0) {
            var11Lifetime2 = var11Lifetime2 + var12Lifetime4;
            var12Lifetime4 = 0;
          }
          var13_intLifetime4 = 0;
          while (var13_intLifetime4 < var11Lifetime2) {
            var14 = 96;
            var15Lifetime2 = var13_intLifetime4;
            var16Lifetime3 = 1;
            var17_intLifetime3 = 0;
            var18Lifetime2 = 16;
            var18Lifetime2--;
            var19Lifetime2 = 10326659;
            var15Lifetime2Lifetime1 = var13_intLifetime4;
            stackIn_636_0 = -1;
            stackIn_636_1 = ~var13_intLifetime4;
            if (stackIn_636_0 == stackIn_636_1) {
              var15Lifetime2Lifetime1 = 2;
            }
            if (var13_intLifetime4 == 1) {
              var15Lifetime2Lifetime1 = 4;
            }
            if (2 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 1;
            }
            if (var13_intLifetime4 == 3) {
              var15Lifetime2Lifetime1 = 5;
            }
            if (4 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 0;
            }
            if (5 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 6;
            }
            if (var13_intLifetime4 == 6) {
              var15Lifetime2Lifetime1 = 11;
            }
            if (var13_intLifetime4 == 7) {
              var15Lifetime2Lifetime1 = 7;
            }
            if (var13_intLifetime4 == 8) {
              var15Lifetime2Lifetime1 = 10;
            }
            if (var13_intLifetime4 == 9) {
              var15Lifetime2Lifetime1 = 8;
            }
            if (var13_intLifetime4 == 10) {
              var15Lifetime2Lifetime1 = 3;
            }
            if (11 == var13_intLifetime4) {
              var15Lifetime2Lifetime1 = 9;
            }
            if (var13_intLifetime4 < 10) {
              if ((var13_intLifetime4 & 1) == 1) {
                var20 = 0;
                var30 = 0;
                var21 = var30;
                while (true) {
                  if (var30 < 16) {
                    stackIn_376_0 = ThrowableFormatHelpers.field_f[var30];
                    stackIn_376_1 = -1 + (var12Lifetime4 + var13_intLifetime4);
                    if (stackIn_376_0 == stackIn_376_1) {
                      var20++;
                    }
                    var30++;
                    continue;
                  }
                  break;
                }
                var18Lifetime2++;
                stackIn_376_0Lifetime1 = -1;
                stackIn_376_1Lifetime1 = ~var20;
                if (stackIn_376_0Lifetime1 == stackIn_376_1Lifetime1) {
                  var16Lifetime3 = 0;
                }
                var19Lifetime2 = 16711935;
              }
              if (0 < this.field_h &&
                this.field_h != 9) {
                if ((1 & var13_intLifetime4) != 0) {
                  if ((GameListSortHelpers.field_e & 1L << -13 + 8 * this.field_h + (-1 + var13_intLifetime4) / 2) == 0L && (this.field_h != OptionToggleHelpers.field_b ||
                    EffectVolumeHelpers.field_a != -1 + var13_intLifetime4) && this.field_h > 1) {
                    var16Lifetime3 = 0;
                    var17_intLifetime3 = 2;
                  }
                } else {
                  if (0L == (1L << -14 + 8 * this.field_h & GameListSortHelpers.field_e) && (~this.field_h != ~OptionToggleHelpers.field_b ||
                    EffectVolumeHelpers.field_a != var13_intLifetime4) && 1 < this.field_h) {
                    var16Lifetime3 = 0;
                    var17_intLifetime3 = 0;
                  }
                }
              }
            } else {
              if (0 < this.field_h) {
                var20 = 0;
                var21 = 0;
                while (true) {
                  if (var21 < 16) {
                    stackIn_353_0 = var12Lifetime4;
                    stackIn_353_1 = ThrowableFormatHelpers.field_f[var21];
                    if (stackIn_353_0 <= stackIn_353_1 &&
                      ThrowableFormatHelpers.field_f[var21] < (10 + var12Lifetime4) && (0 == (1 & ThrowableFormatHelpers.field_f[var21]) ||
                      var21 > 0 &&
                      ~(-1 + ThrowableFormatHelpers.field_f[var21]) == ~ThrowableFormatHelpers.field_f[-1 + var21])) {
                      var20++;
                    }
                    var21++;
                    continue;
                  }
                  var19Lifetime2 = 16744703;
                  stackIn_353_0Lifetime1 = ~var20;
                  stackIn_353_1Lifetime1 = -6;
                  if (stackIn_353_0Lifetime1 > stackIn_353_1Lifetime1) {
                    var16Lifetime3 = 0;
                  }
                  var18Lifetime2 += 2;
                  if (0L == (1L << 8 * this.field_h - (-(var13_intLifetime4 % 12) + 18) & GameListSortHelpers.field_e)) {
                    if (this.field_h >= 9) {
                      break;
                    }
                    var17_intLifetime3 = 3;
                    var16Lifetime3 = 0;
                  }
                  break;
                }
              }
            }
            {
              var20_double = 2.0 * ((double)var15Lifetime2Lifetime1 * 3.141592653589793) / (double)var11Lifetime2;
              var22 = 122 + (-6 + ValidatedTextWidget.field_I) + 32 - (int)((double)var14 * Math.cos(var20_double)) - 16;
              var23 = 178 + QuickChatHelpers.field_a - (-122 + (int)((double)var14 * Math.sin(var20_double)) + 16);
              if (this.field_h == 9 && (ArcanistsMulti.isOfflineOrNotLoaded((byte) -87) ||
                !(SpellbookCaptionGlobals.field_d > 0))) {
                if (EmailLoginCredentials.field_g < var22) {
                } else if (var23 > MenuButtonPanel.field_I) {
                } else if ((var22 + 32) <= EmailLoginCredentials.field_g) {
                } else if (MenuButtonPanel.field_I >= (var23 + 32)) {
                } else {
                  this.field_i = var13_intLifetime4 + var12Lifetime4;
                  this.field_m = 6;
                }
              } else {
                if (var16Lifetime3 != 0) {
                  if (EmailLoginCredentials.field_g >= var22 &&
                    MenuButtonPanel.field_I >= var23 &&
                    var22 + 32 > EmailLoginCredentials.field_g &&
                    (var23 + 32) > MenuButtonPanel.field_I) {
                    this.field_m = 1;
                    this.field_i = var12Lifetime4 + var13_intLifetime4;
                    var18Lifetime2 += 4;
                  }
                } else {
                  if (EmailLoginCredentials.field_g >= var22 &&
                    MenuButtonPanel.field_I >= var23 &&
                    EmailLoginCredentials.field_g < (var22 + 32) &&
                    MenuButtonPanel.field_I < (var23 + 32)) {
                    boolean decompiledFrameRemainder4 = true;
                    this.field_i = var13_intLifetime4 + var12Lifetime4;
                    this.field_m = 3;
                    if (10 <= var13_intLifetime4) {
                      this.field_m = 4;
                      for (var24 = 0; var24 < 16; var24++) {
                        stackIn_493_0 = var12Lifetime4;
                        stackIn_493_1 = ThrowableFormatHelpers.field_f[var24];
                        if (stackIn_493_0 <= stackIn_493_1 &&
                          10 + var12Lifetime4 > ThrowableFormatHelpers.field_f[var24] &&
                          (1 & ThrowableFormatHelpers.field_f[var24]) != 0 &&
                          var24 > 0 &&
                          ~ThrowableFormatHelpers.field_f[var24 - 1] == ~(ThrowableFormatHelpers.field_f[var24] - 1)) {
                        }
                      }
                      this.field_i = var12Lifetime4 + var13_intLifetime4;
                    }
                    var18Lifetime2 += 2;
                    if ((GameListSortHelpers.field_e & 1L << -14 + this.field_h * 8) == 0L && (this.field_h != OptionToggleHelpers.field_b ||
                      var13_intLifetime4 != EffectVolumeHelpers.field_a &&
                      ~var13_intLifetime4 != ~(EffectVolumeHelpers.field_a + 1)) && (this.field_h > 1 &&
                      this.field_h < 9)) {
                      this.field_i = var13_intLifetime4 + var12Lifetime4;
                      this.field_m = 6;
                      decompiledFrameRemainder4 = false;
                    }
                    else {
                      stackIn_493_0Lifetime1 = ~var17_intLifetime3;
                      stackIn_493_1Lifetime1 = -1;
                      if (stackIn_493_0Lifetime1 < stackIn_493_1Lifetime1 &&
                        9 > this.field_h) {
                        this.field_m = 7;
                        this.field_i = var12Lifetime4 + var13_intLifetime4;
                        if (2 < var17_intLifetime3) {
                          this.field_m = 8;
                        }
                      }
                    }
                    if (this.field_m == 3) {
                      var24Lifetime3 = -16 + (32 + (ValidatedTextWidget.field_I - 6) + 122 + (int)(Math.cos(var20_double) * (double)var14));
                      QuickChatPhraseCache.fillCircleMasked((int)(Math.cos((double)SpriteState.field_v * 0.1) * 4.0) + 20, (byte) 105, 128 + (int)(Math.sin((double)SpriteState.field_v * 0.1) * 64.0), var24Lifetime3 + 16, 16 + var23);
                    }
                  }
                }
              }
            }
            boolean decompiledFrameRemainder3 = true;
            SoftwareRasterizer.fillCircleAlpha(16 + var22, var23 + 16, 8 + var18Lifetime2, 0, 64);
            SoftwareRasterizer.fillCircle(16 + var22, var23 + 16, 4 + var18Lifetime2, var19Lifetime2);
            SoftwareRasterizer.drawCircleOutline(16 + var22, 16 + var23, var18Lifetime2 + 4, 0);
            SoftwareRasterizer.fillCircle(16 + var22, 16 + var23, var18Lifetime2, 13947080);
            SoftwareRasterizer.drawCircleOutline(var22 + 16, 16 + var23, var18Lifetime2, 0);
            if (9 == this.field_h && (SpellbookCaptionGlobals.field_d == 0 ||
              ArcanistsMulti.isOfflineOrNotLoaded((byte) -74))) {
              LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var13_intLifetime4 + var12Lifetime4]].drawTransparentWithOpacity(-4 + var22, -4 + var23, 32);
              decompiledFrameRemainder3 = false;
            }
            else {
              if ((GameListSortHelpers.field_e & 1L << this.field_h * 8 - 14) == 0L &&
                this.field_h > 1 &&
                this.field_h < 9 &&
                var16Lifetime3 == 0) {
                LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var13_intLifetime4 + var12Lifetime4]].drawTransparentWithOpacity(-4 + var22, var23 - 4, 32);
              } else {
                if (var16Lifetime3 != 0) {
                  LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var13_intLifetime4 + var12Lifetime4]].drawTransparent(-4 + var22, var23 - 4);
                  var24Lifetime1 = 0;
                  var31 = 0;
                  var25_int = var31;
                  while (var31 < 16) {
                    stackIn_573_0 = ThrowableFormatHelpers.field_f[var31];
                    stackIn_573_1 = var13_intLifetime4 + var12Lifetime4;
                    if (stackIn_573_0 == stackIn_573_1) {
                      var24Lifetime1 = 1;
                    }
                    var31++;
                  }
                  if ((var24Lifetime1 != 0)) {
                    QuickChatPhraseCache.fillCircleMasked(24, (byte) 63, -128, var22 + 16, var23 + 16);
                    SoftwareRasterizer.drawCircleOutline(var22 + 16, var23 + 16, 24, 0);
                  }
                  decompiledFrameRemainder3 = false;
                }
                else {
                  if (var17_intLifetime3 == 0) {
                    LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var13_intLifetime4 + var12Lifetime4]].drawTransparentWithOpacity(-4 + var22, -4 + var23, 32);
                  } else {
                    LoginLoadingHelpers.field_g[PasswordCheckHelpers.field_f[var12Lifetime4 + var13_intLifetime4]].drawTransparentWithOpacity(-4 + var22, -4 + var23, 32);
                    var24Lifetime1Lifetime1 = var22 + 16 << 4;
                    var25_intLifetime1 = 16 + var23 << 4;
                    if (!ArcanistsMulti.isOfflineOrNotLoaded((byte) -102)) {
                      if (var17_intLifetime3 == 3) {
                        var32.drawRotatedAboutPivot(80, 320, var24Lifetime1Lifetime1, var25_intLifetime1, SpriteState.field_v * 30 - 21845, 4096);
                        var32.drawRotatedAboutPivot(80, 320, var24Lifetime1Lifetime1, var25_intLifetime1, SpriteState.field_v * 30 + 0, 4096);
                        var32.drawRotatedAboutPivot(80, 320, var24Lifetime1Lifetime1, var25_intLifetime1, 30 * SpriteState.field_v + 21845, 4096);
                      }
                      if (var17_intLifetime3 == 2) {
                        var32.drawRotatedAboutPivot(160, 320, var24Lifetime1Lifetime1, var25_intLifetime1, -16384 + SpriteState.field_v * 30, 4096);
                        var32.drawRotatedAboutPivot(160, 320, var24Lifetime1Lifetime1, var25_intLifetime1, 16384 + 30 * SpriteState.field_v, 4096);
                      }
                    }
                  }
                }
              }
            }
            stackIn_573_0Lifetime1 = 1;
            stackIn_573_1Lifetime1 = this.field_h;
            if (stackIn_573_0Lifetime1 == stackIn_573_1Lifetime1 &&
              10 <= var13_intLifetime4 &&
              ArcanistsMulti.isOfflineOrNotLoaded((byte) -84)) {
              IconHighlightPainter.field_d.drawScaledAlpha(-4 + var22, var23 - 4, 40, 40, 128);
            }
            stackIn_586_0 = ((GameListSortHelpers.field_e & 1L << this.field_h * 8 - 14) == 0L) ? 0 : 1;
            var24Lifetime2 = stackIn_586_0;
            if (var16Lifetime3 == 0 &&
              0 < var17_intLifetime3 &&
              var3 >= var17_intLifetime3 && (var24Lifetime2 != 0 ||
              this.field_h == 1) && (var22 <= EmailLoginCredentials.field_g &&
              var23 <= MenuButtonPanel.field_I &&
              32 + var22 > EmailLoginCredentials.field_g &&
              MenuButtonPanel.field_I < 32 + var23 &&
              !ArcanistsMulti.isOfflineOrNotLoaded((byte) -125))) {
              var25 = 3.141592653589793 * (double)(255 & SpriteState.field_v) / 128.0;
              var27 = (int)(2048.0 + Math.cos(var25 * 4.0) * 256.0 - 256.0);
              var28 = (int)(5000.0 * Math.sin(var25 * 2.0) + 0.0);
              if (16 + var22 < 148) {
                QuickChatPhrase.field_x[4].drawRotatedQuarterScale(var27, var23, -4, var22, var28);
                QuickChatPhraseCache.fillCircleMasked(8, (byte) 118, 128, var22 - var27 * 8 / 4096, var23 - 8 * var27 / 4096);
              } else {
                QuickChatPhrase.field_x[4].drawRotatedQuarterScale(var27, var23, -41, 32 + var22, var28);
                QuickChatPhraseCache.fillCircleMasked(8, (byte) 126, 128, -(var27 * 8 / 4096) + var22 + 32, var23 - 8 * var27 / 4096);
              }
            }
            if (~OptionToggleHelpers.field_b == ~this.field_h && (~var13_intLifetime4 == ~EffectVolumeHelpers.field_a &&
              var24Lifetime2 == 0 ||
              EffectVolumeHelpers.field_a + 1 == var13_intLifetime4 &&
              (1L << (-1 + var13_intLifetime4) / 2 - 13 + 8 * this.field_h & GameListSortHelpers.field_e) == 0L)) {
              var25Lifetime1 = Math.cos(3.141592653589793 * (double)(SpriteState.field_v & 255) / 64.0) * 5.0 + 32.0;
              var27Lifetime1 = (int)(Math.cos(var20_double) * var25Lifetime1) + (16 + var22);
              var28Lifetime1 = (int)(var25Lifetime1 * Math.sin(var20_double)) + 16 + var23;
              QuickChatPhrase.field_x[10].drawRotatedQuarterScale(2048, var28Lifetime1, 120, var27Lifetime1, 0);
            }
            var13_intLifetime4++;
          }
          stackIn_636_0Lifetime1 = -2;
          stackIn_636_1Lifetime1 = ~this.field_h;
          if (stackIn_636_0Lifetime1 > stackIn_636_1Lifetime1 &&
            ArcanistsMulti.isOfflineOrNotLoaded((byte) -127) &&
            this.field_h < 9) {
            var13_intLifetime5 = 122 + (ValidatedTextWidget.field_I + 26);
            var14 = 178 + (QuickChatHelpers.field_a + 122);
            IconHighlightPainter.field_d.drawAlpha(-64 + var13_intLifetime5, -64 + var14, 128);
          }
          if (9 == this.field_h && (!(SpellbookCaptionGlobals.field_d > 0) ||
            ArcanistsMulti.isOfflineOrNotLoaded((byte) -60))) {
            var13_intLifetime6 = 148 + ValidatedTextWidget.field_I;
            var14 = QuickChatHelpers.field_a + 178 + 122;
            IconHighlightPainter.field_d.drawAlpha(var13_intLifetime6 - 64, -64 + var14, 128);
          }
          if (this.field_m != 1 &&
            6 != this.field_m &&
            7 != this.field_m &&
            this.field_m != 8) {
            if (this.field_m == 2) {
              if (this.field_i < 0) {
                return;
              }
              if (this.field_i >= 16) {
                return;
              }
              if (ThrowableFormatHelpers.field_f[this.field_i] == -1) {
                return;
              }
              boolean decompiledFrameRemainder1 = true;
              var13_intLifetime7 = ThrowableFormatHelpers.field_f[this.field_i];
              var36 = PasswordFieldPainter.field_w[var13_intLifetime7];
              var37 = MouseStateHelpers.field_d[var13_intLifetime7];
              var16Lifetime4 = ValidatedTextWidget.field_I + 301;
              var17_intLifetime4 = -1 + (QuickChatHelpers.field_a + 303);
              if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -91) &&
                var13_intLifetime7 >= 22 && (~(var13_intLifetime7 / 12) != ~OptionToggleHelpers.field_b ||
                ~(-(var13_intLifetime7 / 12 * 12) + var13_intLifetime7) != ~EffectVolumeHelpers.field_a &&
                var13_intLifetime7 - 12 * (var13_intLifetime7 / 12) != 1 + EffectVolumeHelpers.field_a)) {
                SpellProjectile.field_B.drawParagraph(var36, var16Lifetime4 - 1, var17_intLifetime4, 141, 29, 13158, 13158, 1, 1, SpellProjectile.field_B.field_C);
                SpellProjectile.field_B.drawParagraph(var36, var16Lifetime4, -1 + var17_intLifetime4, 141, 29, 13158, 13158, 1, 1, SpellProjectile.field_B.field_C);
                SpellProjectile.field_B.drawParagraph(var36, var16Lifetime4, var17_intLifetime4, 141, 29, 12569299, -1, 1, 1, SpellProjectile.field_B.field_C);
                SpellProjectile.field_B.drawParagraph(QueuedPacket.field_r, 447, 294, 171, 29, 16711680, 0, 1, 1, SpellProjectile.field_B.field_C);
                decompiledFrameRemainder1 = false;
              }
              else {
                CachedArchiveProvider.field_t.drawParagraph(var36, 10 + (var16Lifetime4 - 1), var17_intLifetime4, 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                CachedArchiveProvider.field_t.drawParagraph(var36, 10 + var16Lifetime4, var17_intLifetime4 - 1, 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                CachedArchiveProvider.field_t.drawParagraph(var36, var16Lifetime4 + 10, var17_intLifetime4, 281, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
              }
              SpellProjectile.field_B.drawParagraph(var37, 8 + (290 + ValidatedTextWidget.field_I), QuickChatHelpers.field_a + 340 - 8, 307, 128, 0, -1, 1, 0, SpellProjectile.field_B.field_C);
              return;
            }
            var13 = HotspotRegion.field_l;
            if (0 < this.field_h) {
              var13 = SceneTabStrip.field_Ib;
              if (this.field_h == 9 && (SpellbookCaptionGlobals.field_d == 0 ||
                ArcanistsMulti.isOfflineOrNotLoaded((byte) -77))) {
                var13 = IntrusiveDeque.field_j;
              }
            }
            boolean decompiledFrameRemainder0 = true;
            if (EmailLoginCredentials.field_g >= (ValidatedTextWidget.field_I + 557) &&
              (QuickChatHelpers.field_a + 51) >= MenuButtonPanel.field_I &&
              !ArcanistsMulti.isOfflineOrNotLoaded((byte) -50)) {
              var13 = "";
              var14 = ValidatedTextWidget.field_I + 300;
              var15Lifetime3 = 340 + QuickChatHelpers.field_a;
              this.drawHintText(var15Lifetime3, var3, var14, 113);
            } else {
              if (this.field_m == 0) {
                var14_ref_String = DebouncedValidator.field_c;
                var13 = AlternateUsernameCredentials.field_k;
                if (Math.abs(this.field_i) == 1) {
                  var13 = BevelBoxPainter.field_b;
                  var14_ref_String = LoadingProgressDialog.field_qb;
                }
                if (2 == Math.abs(this.field_i)) {
                  var14_ref_String = MusicCrossfadeStream.field_z;
                  var13 = RasterSetupHelpers.field_d;
                }
                if (Math.abs(this.field_i) == 3) {
                  var13 = Cp1252Helpers.field_d;
                  var14_ref_String = UiContainer.field_x;
                }
                if (Math.abs(this.field_i) == 4) {
                  var13 = QuickChatPhrase.field_r;
                  var14_ref_String = SecondaryNodeDequeIterator.field_d;
                }
                if (Math.abs(this.field_i) == 5) {
                  var13 = IterableNodeHashTable.field_g;
                  var14_ref_String = SpellbookCaptionGlobals.field_g;
                }
                if (6 == Math.abs(this.field_i)) {
                  var13 = SoundCache.field_f;
                  var14_ref_String = TextHotspotWidget.field_M;
                }
                if (Math.abs(this.field_i) == 7) {
                  var14_ref_String = Battle.field_e;
                  var13 = QuickChatPhrase.field_w;
                }
                if (Math.abs(this.field_i) == 8) {
                  var13 = SpellProjectile.field_s;
                  var14_ref_String = QuickChatCategory.field_r;
                }
                if (Math.abs(this.field_i) == 9) {
                  var13 = FullscreenFocusCanvas.field_f;
                  var14_ref_String = BevelBoxPainter.field_c;
                }
                CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, -1 + (311 + ValidatedTextWidget.field_I), -1 + (303 + QuickChatHelpers.field_a), 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, 290 + (ValidatedTextWidget.field_I + 21), 303 + QuickChatHelpers.field_a - 2, 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, 21 + (ValidatedTextWidget.field_I + 290), 303 + (QuickChatHelpers.field_a - 1), 281, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
              } else {
                if (3 == this.field_m) {
                  var34 = PasswordFieldPainter.field_w[this.field_i];
                  var14_ref_String = var34;
                  CachedArchiveProvider.field_t.drawParagraph(var34, ValidatedTextWidget.field_I + 310, -1 + (QuickChatHelpers.field_a + 303), 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                  CachedArchiveProvider.field_t.drawParagraph(var34, 21 + ValidatedTextWidget.field_I + 290, 303 + (QuickChatHelpers.field_a - 2), 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                  CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, 21 + ValidatedTextWidget.field_I + 290, -1 + (303 + QuickChatHelpers.field_a), 281, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
                  var13 = CachedArchiveProvider.formatTemplate(param0 + 126, new String[]{PasswordFieldPainter.field_w[-1 + this.field_i]}, NodeHashTableIterator.field_f);
                } else {
                  if (this.field_m == 4) {
                    var33 = PasswordFieldPainter.field_w[this.field_i];
                    var14_ref_String = var33;
                    CachedArchiveProvider.field_t.drawParagraph(var33, 290 + ValidatedTextWidget.field_I + 21 - 1, -1 + QuickChatHelpers.field_a + 303, 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                    CachedArchiveProvider.field_t.drawParagraph(var33, 21 + (ValidatedTextWidget.field_I + 290), 303 + (QuickChatHelpers.field_a - 2), 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                    CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, 290 + (ValidatedTextWidget.field_I + 21), 303 + QuickChatHelpers.field_a - 1, 281, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
                    var15_ref_String = LoadingProgressDialog.field_qb;
                    if (this.field_h == 2) {
                      var15_ref_String = MusicCrossfadeStream.field_z;
                    }
                    if (3 == this.field_h) {
                      var15_ref_String = UiContainer.field_x;
                    }
                    if (this.field_h == 4) {
                      var15_ref_String = SecondaryNodeDequeIterator.field_d;
                    }
                    if (5 == this.field_h) {
                      var15_ref_String = SpellbookCaptionGlobals.field_g;
                    }
                    if (this.field_h == 6) {
                      var15_ref_String = TextHotspotWidget.field_M;
                    }
                    if (this.field_h == 7) {
                      var15_ref_String = Battle.field_e;
                    }
                    if (this.field_h == 8) {
                      var15_ref_String = QuickChatCategory.field_r;
                    }
                    if (this.field_h == 9) {
                      var15_ref_String = BevelBoxPainter.field_c;
                    }
                    var16Lifetime4Lifetime1 = 0;
                    var17_intLifetime4Lifetime1 = 0;
                    while (16 > var17_intLifetime4Lifetime1) {
                      stackIn_770_0 = ThrowableFormatHelpers.field_f[var17_intLifetime4Lifetime1];
                      stackIn_770_1 = this.field_h * 12;
                      if (stackIn_770_0 >= stackIn_770_1 &&
                        10 + 12 * this.field_h >= ThrowableFormatHelpers.field_f[var17_intLifetime4Lifetime1]) {
                        var16Lifetime4Lifetime1++;
                      }
                      var17_intLifetime4Lifetime1++;
                    }
                    stackIn_770_0Lifetime1 = 116;
                    stackIn_770_1Lifetime1 = 2;
                    array$4 = new String[stackIn_770_1Lifetime1];
                    array$4[0] = var15_ref_String;
                    array$4[1] = Integer.toString(var16Lifetime4Lifetime1);
                    var13 = CachedArchiveProvider.formatTemplate(stackIn_770_0Lifetime1, array$4, HotspotRegion.field_k);
                    decompiledFrameRemainder0 = false;
                  }
                  else {
                    if (this.field_m == 5) {
                      var13 = "You Should NEVER EVER EVER SEE THIS!!!";
                      var14_ref_String = LoadingProgressDialog.field_qb;
                      if (Math.abs(this.field_h) == 2) {
                        var13 = AudioShutdownHelpers.field_d + var3;
                        var14_ref_String = MusicCrossfadeStream.field_z;
                      }
                      if (3 == Math.abs(this.field_h)) {
                        var13 = SpriteFrame.field_h + var3;
                        var14_ref_String = UiContainer.field_x;
                      }
                      if (Math.abs(this.field_h) == 4) {
                        var14_ref_String = SecondaryNodeDequeIterator.field_d;
                        var13 = StatusDialog.field_Jb + var3;
                      }
                      if (Math.abs(this.field_h) == 5) {
                        var14_ref_String = SpellbookCaptionGlobals.field_g;
                        var13 = ArchiveIndex.field_v + var3;
                      }
                      if (6 == Math.abs(this.field_h)) {
                        var14_ref_String = TextHotspotWidget.field_M;
                        var13 = ResizableViewResizeListener.field_k + var3;
                      }
                      if (7 == Math.abs(this.field_h)) {
                        var13 = NameValidator.field_q + var3;
                        var14_ref_String = Battle.field_e;
                      }
                      if (Math.abs(this.field_h) == 8) {
                        var14_ref_String = QuickChatCategory.field_r;
                        var13 = DropTargetWidget.field_H + var3;
                      }
                      CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, 290 + (ValidatedTextWidget.field_I + 21 - 1), 302 + QuickChatHelpers.field_a, 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                      CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, 290 + ValidatedTextWidget.field_I + 21, -2 + (303 + QuickChatHelpers.field_a), 281, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
                      CachedArchiveProvider.field_t.drawParagraph(var14_ref_String, ValidatedTextWidget.field_I + 311, QuickChatHelpers.field_a + 302, 281, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
                      var13 = "";
                      var15Lifetime3 = 300 + ValidatedTextWidget.field_I;
                      var16Lifetime4Lifetime1 = QuickChatHelpers.field_a + 336;
                      SpellProjectile.field_B.drawParagraph(GameOptionType.field_b, var15Lifetime3, var16Lifetime4Lifetime1, 70, 32, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
                      var15Lifetime3 += 74;
                      var17_intLifetime4Lifetime1 = 0;
                      while (true) {
                        if (5 > var17_intLifetime4Lifetime1) {
                          stackIn_731_0 = ~var17_intLifetime4Lifetime1;
                          stackIn_731_1 = ~var3;
                          if (stackIn_731_0 > stackIn_731_1) {
                            DualLinkDeque.field_b[7].draw(var15Lifetime3, var16Lifetime4Lifetime1);
                          } else {
                            DualLinkDeque.field_b[7].drawFadedToColour(var15Lifetime3, var16Lifetime4Lifetime1, 64, 0);
                          }
                          var15Lifetime3 += 9;
                          var17_intLifetime4Lifetime1++;
                          continue;
                        }
                        break;
                      }
                      if (ArcanistsMulti.isOfflineOrNotLoaded((byte) -90)) {
                        var13 = Battle.field_yb;
                      } else {
                        stackIn_731_0Lifetime1 = var3;
                        stackIn_731_1Lifetime1 = 5;
                        if (stackIn_731_0Lifetime1 < stackIn_731_1Lifetime1) {
                          var13 = DropdownItemList.field_R;
                        } else {
                          var13 = SceneTabbedPanel.field_Ob;
                        }
                      }
                      SpellProjectile.field_B.drawParagraph(var13, 440 + ValidatedTextWidget.field_I, var16Lifetime4Lifetime1, 170, 32, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
                      var13 = "";
                    }
                  }
                }
              }
            }
            if (153 <= NodeHashTableIterator.field_j &&
              SpellbookCaptionGlobals.field_d < 10) {
              var14 = 308 + (ValidatedTextWidget.field_I + SpellbookCaptionGlobals.field_d * 32);
              var15Lifetime3Lifetime1 = 400 + QuickChatHelpers.field_a;
              if (EmailLoginCredentials.field_g >= (-16 + var14) &&
                EmailLoginCredentials.field_g <= (16 + var14) &&
                MenuButtonPanel.field_I >= -16 + var15Lifetime3Lifetime1 &&
                MenuButtonPanel.field_I <= var15Lifetime3Lifetime1 + 16) {
                this.field_m = 9;
              }
            }
            if ((SceneTabStrip.field_Ib == var13 ||
              var13 == HotspotRegion.field_l) &&
              (153 <= NodeHashTableIterator.field_j &&
              10 > SpellbookCaptionGlobals.field_d)) {
              var13 = DropdownList.field_F;
              if (this.field_m == 9) {
                var35 = UiTheme.field_h;
                var14 = 250 + SpellbookCaptionGlobals.field_d * 250;
                var13 = var35 + CachedArchiveProvider.formatTemplate(param0 ^ -50, new String[]{Integer.toString(var14)}, MusicVolumeHelpers.field_e);
              }
              SpellProjectile.field_B.drawParagraph(var13, ValidatedTextWidget.field_I + 302, 116 + (178 + QuickChatHelpers.field_a), 299, 129, 0, -1, 1, 0, SpellProjectile.field_B.field_C);
              for (var14 = 0; var14 < 10; var14++) {
                var15Lifetime3Lifetime2 = 308 + ValidatedTextWidget.field_I + var14 * 32;
                var16Lifetime4Lifetime2 = QuickChatHelpers.field_a + 400;
                if (SpellbookCaptionGlobals.field_d >= var14) {
                  SoftwareRasterizer.drawCircleOutline(var15Lifetime3Lifetime2, -1 + var16Lifetime4Lifetime2, 14, 16711680);
                  SoftwareRasterizer.drawCircleOutline(var15Lifetime3Lifetime2 - 1, var16Lifetime4Lifetime2, 14, 16711680);
                  SoftwareRasterizer.drawCircleOutline(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2 + 1, 14, 8912896);
                  SoftwareRasterizer.drawCircleOutline(1 + var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 14, 8912896);
                  SoftwareRasterizer.fillCircleAlpha(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 14, 0, 128);
                  SoftwareRasterizer.drawCircleOutline(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 14, 16744576);
                  if (SpellbookCaptionGlobals.field_d != var14) {
                    TimedMessage.field_o[var14].drawTintedGrayscale(var15Lifetime3Lifetime2 - 15, -TimedMessage.field_o[var14].field_o + (var16Lifetime4Lifetime2 - TimedMessage.field_o[var14].field_y / 2), 16711680);
                  } else {
                    TimedMessage.field_o[var14].drawSilhouette(var15Lifetime3Lifetime2 - 15, -(TimedMessage.field_o[var14].field_y / 2) + (var16Lifetime4Lifetime2 - TimedMessage.field_o[var14].field_o), 0);
                    if ((var15Lifetime3Lifetime2 - 16) <= EmailLoginCredentials.field_g &&
                      EmailLoginCredentials.field_g <= 16 + var15Lifetime3Lifetime2 &&
                      (-16 + var16Lifetime4Lifetime2) <= MenuButtonPanel.field_I &&
                      var16Lifetime4Lifetime2 + 16 >= MenuButtonPanel.field_I) {
                      var17_double = (double)(SpriteState.field_v & 255) * 3.141592653589793 / 128.0;
                      var19Lifetime3 = (int)(-256.0 + (Math.cos(4.0 * var17_double) * 256.0 + 4096.0)) / 2;
                      var20Lifetime1 = (int)(0.0 + 5000.0 * Math.sin(2.0 * var17_double));
                      QuickChatPhrase.field_x[4].drawCenteredRotatedScaledBilinear(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, var20Lifetime1, var19Lifetime3);
                      QuickChatPhraseCache.fillCircleMasked(8, (byte) 71, 128, var15Lifetime3Lifetime2 - var19Lifetime3 * 8 / 4096, var16Lifetime4Lifetime2 - 8 * var19Lifetime3 / 4096);
                    } else {
                      var17_double = 3.141592653589793 * (double)(255 & SpriteState.field_v) / 128.0;
                      var19Lifetime3 = (int)(-256.0 + (256.0 * Math.cos(var17_double * 4.0) + 4096.0)) / 2;
                      var20Lifetime1 = (int)(5000.0 * Math.sin(2.0 * var17_double) + 0.0);
                      QuickChatPhrase.field_x[4].drawCenteredRotatedScaledBilinear(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, var20Lifetime1, var19Lifetime3);
                      SoftwareRasterizer.fillCircleAlpha(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, 33 * var19Lifetime3 / 4096, 0, 128);
                      QuickChatPhraseCache.fillCircleMasked(8, (byte) 99, 128, -(var19Lifetime3 * 8 / 4096) + var15Lifetime3Lifetime2, var16Lifetime4Lifetime2 - var19Lifetime3 * 8 / 4096);
                      SoftwareRasterizer.fillCircleAlpha(var15Lifetime3Lifetime2, var16Lifetime4Lifetime2, var19Lifetime3 * 32 / 4096, 0, 128);
                    }
                  }
                } else {
                  TextLine.field_b.drawQuarterSize(var15Lifetime3Lifetime2 - 15, -16 + var16Lifetime4Lifetime2);
                }
              }
              return;
            }
            SpellProjectile.field_B.drawParagraph(var13, 12 + (290 + ValidatedTextWidget.field_I), 294 + QuickChatHelpers.field_a, 299, 129, 0, -1, 1, 1, SpellProjectile.field_B.field_C);
            return;
          }
          if (this.field_i >= var12Lifetime4) {
            var38 = PasswordFieldPainter.field_w[this.field_i];
            var13Lifetime1 = var38;
            var39 = MouseStateHelpers.field_d[this.field_i];
            var15Lifetime4 = 11 + ValidatedTextWidget.field_I + 290;
            var16Lifetime5 = 302 + QuickChatHelpers.field_a;
            if (1 != this.field_m) {
              SpellProjectile.field_B.drawParagraph(var38, -1 + var15Lifetime4, var16Lifetime5, 141, 29, 13158, 13158, 1, 1, SpellProjectile.field_B.field_C);
              SpellProjectile.field_B.drawParagraph(var38, var15Lifetime4, -1 + var16Lifetime5, 141, 29, 13158, 13158, 1, 1, SpellProjectile.field_B.field_C);
              SpellProjectile.field_B.drawParagraph(var13Lifetime1, var15Lifetime4, var16Lifetime5, 141, 29, 12569299, -1, 1, 1, SpellProjectile.field_B.field_C);
              var17 = null;
              var18Lifetime3 = 16711680;
              if (!ArcanistsMulti.isOfflineOrNotLoaded((byte) -101)) {
                if (this.field_m != 6) {
                  if (this.field_m == 7) {
                    if (var3 >= 2) {
                      var18Lifetime3 = 65280;
                      var17 = SoundCache.field_l;
                    } else {
                      var17 = ArchiveIndex.field_d + var3 + "/2)";
                    }
                  } else {
                    if (this.field_m == 8) {
                      if (3 > var3) {
                        var17 = ArchiveIndex.field_d + var3 + "/3)";
                      } else {
                        var18Lifetime3 = 65280;
                        var17 = TextHotspotWidget.field_P;
                      }
                    }
                  }
                } else {
                  var40 = DateHelpers.field_i;
                  if (9 != this.field_h) {
                    SpellProjectile.field_B.drawParagraph(var40, 163 + var15Lifetime4 - 22, var16Lifetime5, 141, 29, var18Lifetime3, 0, 1, 1, SpellProjectile.field_B.field_C);
                    SpellProjectile.field_B.drawParagraph(var39, -3 + var15Lifetime4, 340 + (QuickChatHelpers.field_a - 8), 307, 128, 0, -1, 1, 0, SpellProjectile.field_B.field_C);
                    return;
                  }
                  var17 = RawDataNode.field_h;
                }
              } else {
                var17 = DecodedSpriteHelpers.field_g;
              }
              SpellProjectile.field_B.drawParagraph((String) (var17), 163 + var15Lifetime4 - 22, var16Lifetime5, 141, 29, var18Lifetime3, 0, 1, 1, SpellProjectile.field_B.field_C);
            } else {
              CachedArchiveProvider.field_t.drawParagraph(var38, var15Lifetime4 - 1, var16Lifetime5, 301, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
              CachedArchiveProvider.field_t.drawParagraph(var38, var15Lifetime4, -1 + var16Lifetime5, 301, 29, 13158, 13158, 1, 1, CachedArchiveProvider.field_t.field_C);
              CachedArchiveProvider.field_t.drawParagraph(var13Lifetime1, var15Lifetime4, var16Lifetime5, 301, 29, 12569299, -1, 1, 1, CachedArchiveProvider.field_t.field_C);
            }
            SpellProjectile.field_B.drawParagraph(var39, -3 + var15Lifetime4, 340 + (QuickChatHelpers.field_a - 8), 307, 128, 0, -1, 1, 0, SpellProjectile.field_B.field_C);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.N(" + param0 + ')');
        }
    }

    private final boolean canMoveToPage(byte param0, int param1) {
        RuntimeException var3 = null;
        boolean stackIn_41_0 = false;
        RuntimeException decompiledCaughtException = null;
        try {
          if (7 == this.field_l) {
            if (param1 == 0 &&
              SecondaryNodeDequeIterator.field_e == 0) {
              return false;
            }
            if (param1 == 2 &&
              ~SecondaryNodeDequeIterator.field_e == ~(LoadingProgressDialog.field_kb.length - 1)) {
              return false;
            }
          }
          if (14 == this.field_l) {
            if (param1 == 0 &&
              StatefulTextPainter.field_p == 0) {
              return false;
            }
            if (param1 == 1 &&
              7 == StatefulTextPainter.field_p) {
              return false;
            }
          }
          if (this.field_l != 3) {
            if (param0 != -46) {
              field_c = (String) null;
            }
            return true;
          }
          stackIn_41_0 = (1 == param1) || (SpriteState.field_z != null);
          return stackIn_41_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.L(" + param0 + ',' + param1 + ')');
        }
    }

    private final void handleShortcutKeys(int param0) {
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        var3 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (ThreeButtonPanel.hasMembership(true)) {
            if (RasterSetupHelpers.field_b[82] &&
              RasterSetupHelpers.field_b[28]) {
              ScreenSwitchHelpers.switchScreen(false, true, 10, MatchingFieldValidator.field_r);
            }
            if (RasterSetupHelpers.field_b[82] &&
              RasterSetupHelpers.field_b[70]) {
              AccountFlowHelpers.field_c = 1;
            }
            if (CheckboxPainter.field_g == 12) {
              if (IntrusiveDeque.field_d == 26 &&
                GridContainer.field_P < NodeHashTableIterator.field_j) {
                NodeHashTableIterator.field_j = NodeHashTableIterator.field_j - 1;
              }
              if (IntrusiveDeque.field_d == 27 &&
                NodeHashTableIterator.field_j < 153) {
                NodeHashTableIterator.field_j = NodeHashTableIterator.field_j + 1;
              }
            }
          }
          if (param0 <= 42) {
            this.field_g = (MenuInputState) null;
          }
          if (CheckboxPainter.field_g == 12) {
            if (IntrusiveDeque.field_d == 96) {
              this.field_d = this.field_d - 1;
            }
            if (IntrusiveDeque.field_d == 97) {
              this.field_d = this.field_d + 1;
            }
          }
          if (CheckboxPainter.field_g == 8) {
            if (IntrusiveDeque.field_d == 96 &&
              this.field_g.field_h < 3) {
              this.field_g.field_h = this.field_g.field_h - 1;
              if (0 > this.field_g.field_h) {
                this.field_g.field_h = 2;
              }
            }
            if (97 == IntrusiveDeque.field_d &&
              this.field_g.field_h < 3) {
              this.field_g.field_h = this.field_g.field_h + 1;
              if (this.field_g.field_h > 2) {
                this.field_g.field_h = 0;
              }
            }
            if (IntrusiveDeque.field_d != 98 &&
              IntrusiveDeque.field_d != 99) {
              this.field_g.clearInput(-101);
              return;
            }
            if (this.field_g.field_h != 3) {
              if (this.field_g.field_f == 4) {
                this.field_g.field_h = 3;
              }
            } else {
              this.field_g.field_h = 1;
            }
            this.field_g.clearInput(-101);
          } else {
            if (CheckboxPainter.field_g != 7) {
              if (CheckboxPainter.field_g == 6 &&
                !MenuScreen.getSessionFlag((byte) 112)) {
                this.resetSelection((byte) -92);
                return;
              }
              if (CheckboxPainter.field_g != 14) {
                if (CheckboxPainter.field_g == 10) {
                  this.field_g.pollKeysAndPointer(-100, 0);
                } else {
                  this.field_g.pollKeys((byte) -76);
                }
              } else {
                if (IntrusiveDeque.field_d == 96) {
                  if (this.canMoveToPage((byte) -46, 0)) {
                    this.field_g.setHighlightedItem(0, false);
                  }
                  return;
                }
                if (IntrusiveDeque.field_d == 97) {
                  if (this.canMoveToPage((byte) -46, 1)) {
                    this.field_g.setHighlightedItem(1, false);
                  }
                  return;
                }
                if (IntrusiveDeque.field_d != 98) {
                  if (IntrusiveDeque.field_d == 99) {
                    var2_int = this.field_g.field_h + 1;
                    if (var2_int >= this.field_g.field_f) {
                      var2_int = 0;
                    }
                    if (var2_int == 0 &&
                      !this.canMoveToPage((byte) -46, 0)) {
                      var2_int++;
                    }
                    if (var2_int == 1 &&
                      !this.canMoveToPage((byte) -46, 1)) {
                      var2_int++;
                    }
                    this.field_g.setHighlightedItem(var2_int, false);
                  } else {
                    this.field_g.pollKeys((byte) -76);
                  }
                } else {
                  var2_int = -1 + this.field_g.field_h;
                  if (var2_int == 1 &&
                    !this.canMoveToPage((byte) -46, 1)) {
                    var2_int--;
                  }
                  if (var2_int == 0 &&
                    !this.canMoveToPage((byte) -46, 0)) {
                    var2_int--;
                  }
                  if (var2_int < 0) {
                    var2_int = this.field_g.field_f - 1;
                  }
                  this.field_g.setHighlightedItem(var2_int, false);
                }
              }
            } else {
              this.updatePageButtons(false);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.EA(" + param0 + ')');
        }
    }

    private final int getColumnX(int param0, int param1) {
        int stackIn_5_0 = 0;
        int stackIn_10_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_32_0 = 0;
        int stackIn_35_0 = 0;
        int stackIn_37_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_59_0 = 0;
        int stackIn_64_0 = 0;
        int stackIn_69_0 = 0;
        int stackIn_72_0 = 0;
        int stackIn_78_0 = 0;
        int stackIn_83_0 = 0;
        int stackIn_88_0 = 0;
        int stackIn_93_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_l == 6) {
            if (MenuScreen.getSessionFlag((byte) 112)) {
              stackIn_5_0 = 160;
              return stackIn_5_0;
            }
            if (param0 < 2) {
              stackIn_10_0 = param0 * 150 + 20;
            } else {
              stackIn_10_0 = 320;
            }
            return stackIn_10_0;
          }
          if (this.field_l == 7) {
            stackIn_15_0 = param0 * 200 + 20;
            return stackIn_15_0;
          }
          if (this.field_l == 11) {
            if (param0 == 0) {
              stackIn_21_0 = 33;
              return stackIn_21_0;
            }
            if (param0 == 1) {
              stackIn_24_0 = 304;
              return stackIn_24_0;
            }
          }
          if (this.field_l == 12) {
            if (param0 == 0) {
              stackIn_32_0 = 26;
              return stackIn_32_0;
            }
            if (param0 != 1) {
              stackIn_37_0 = param0 * 220 + GameDetailsRenderer.field_e[this.field_l];
              return stackIn_37_0;
            }
            stackIn_35_0 = 287;
            return stackIn_35_0;
          }
          if (this.field_l == 14) {
            if (NumericDateInputWidget.field_L[this.field_l][param0] == 25) {
              stackIn_48_0 = (!this.canMoveToPage((byte) -46, 1)) ? 220 : 120;
              return stackIn_48_0;
            }
            if (NumericDateInputWidget.field_L[this.field_l][param0] == 26) {
              stackIn_56_0 = (this.canMoveToPage((byte) -46, 0)) ? 320 : 220;
              return stackIn_56_0;
            }
            if (29 == NumericDateInputWidget.field_L[this.field_l][param0]) {
              stackIn_59_0 = 220;
              return stackIn_59_0;
            }
            if (7 == NumericDateInputWidget.field_L[this.field_l][param0]) {
              stackIn_64_0 = 220;
              return stackIn_64_0;
            }
          }
          if (this.field_l == 3) {
            stackIn_69_0 = 80;
            return stackIn_69_0;
          }
          if (this.field_l == 9) {
            stackIn_72_0 = 200;
            return stackIn_72_0;
          }
          if (this.field_l == 8) {
            if (param0 == 0) {
              stackIn_78_0 = 20;
              return stackIn_78_0;
            }
            if (1 == param0) {
              stackIn_83_0 = 220;
              return stackIn_83_0;
            }
            if (param0 == 2) {
              stackIn_88_0 = 420;
              return stackIn_88_0;
            }
          }
          if (param1 != 200) {
            field_q = (LoginMessageTable[]) null;
          }
          stackIn_93_0 = GameDetailsRenderer.field_e[this.field_l];
          return stackIn_93_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.IA(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawStatRow(int param0, int param1, String param2, int param3, int param4, int param5, byte param6, int param7, int param8) {
        int stackIn_9_0;
        int stackIn_9_1;
        int stackIn_9_2;
        int stackIn_9_3;
        int stackIn_9_4;
        int stackIn_10_5;
        String stackIn_25_0 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        int var12 = 0;
        int var13 = 0;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        String var18 = null;
        String var11Lifetime1;
        var13 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          var10_int = param1 - (-param3 - param7);
          if (var10_int != 0) {
            param3 = (200 * param3 + var10_int) / (var10_int * 2);
            param7 = (200 * param7 + var10_int) / (2 * var10_int);
            param1 = (param1 * 200 + var10_int) / (var10_int * 2);
          }
          if (param0 != 0) {
            stackIn_9_0 = 45 + ValidatedTextWidget.field_I;
            stackIn_9_1 = param8 - 22;
            stackIn_9_2 = 550;
            stackIn_9_3 = 26;
            stackIn_9_4 = param0;
            if (param0 == 16777215) {
              stackIn_10_5 = 32;
            } else {
              stackIn_10_5 = 128;
            }
            SoftwareRasterizer.fillRectangleAlpha(stackIn_9_0, stackIn_9_1, stackIn_9_2, stackIn_9_3, stackIn_9_4, stackIn_10_5);
          }
          param8 -= 4;
          param0 = 0;
          if (-1 != param5) {
            SpellProjectile.field_B.drawRightAlignedText(param5 + 1 + ". ", 60 + (ValidatedTextWidget.field_I + 30), param8, param0, -1);
          }
          var14 = param2;
          var11 = var14;
          if (param6 >= -92) {
            this.field_h = -20;
          }
          var12 = var14.length();
          while (175 < SpellProjectile.field_B.textWidth(var11)) {
            var11 = param2.substring(0, var12) + "...";
            var12--;
          }
          SpellProjectile.field_B.drawText(var11, 90 + ValidatedTextWidget.field_I, param8, param0, -1);
          var15 = Integer.toString(param4);
          SpellProjectile.field_B.drawCentered(var15, SocialDialog.field_tb[0] + ValidatedTextWidget.field_I, param8, param0, -1);
          if (500 <= var10_int) {
            stackIn_25_0 = "500+";
          } else {
            stackIn_25_0 = Integer.toString(var10_int);
          }
          var11Lifetime1 = stackIn_25_0;
          SpellProjectile.field_B.drawCentered(var11Lifetime1, ValidatedTextWidget.field_I + SocialDialog.field_tb[1], param8, param0, -1);
          var16 = param1 + "%";
          SpellProjectile.field_B.drawCentered(var16, ValidatedTextWidget.field_I + SocialDialog.field_tb[2], param8, param0, -1);
          var17 = param3 + "%";
          SpellProjectile.field_B.drawCentered(var17, ValidatedTextWidget.field_I + SocialDialog.field_tb[3], param8, param0, -1);
          var18 = param7 + "%";
          SpellProjectile.field_B.drawCentered(var18, ValidatedTextWidget.field_I + SocialDialog.field_tb[4], param8, param0, -1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_30_0 = var10;
          stackIn_30_1 = new StringBuilder().append("lc.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_31_2 = "null";
          } else {
            stackIn_31_2 = "{...}";
          }
          throw CommonUiHelpers.wrapException((Throwable) ((Object) stackIn_30_0), ((StringBuilder) (Object) stackIn_30_1).append(stackIn_31_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void updatePageButtons(boolean param0) {
        int stackIn_8_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_38_0 = 0;
        int stackIn_42_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var2_intLifetime1;
        int var3Lifetime1;
        var4 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0) {
            this.field_g = (MenuInputState) null;
          }
          stackIn_8_0 = (!this.canMoveToPage((byte) -46, 0)) ? 1 : 0;
          var2_int = stackIn_8_0;
          stackIn_12_0 = (this.canMoveToPage((byte) -46, 2)) ? 2 : 1;
          var3 = stackIn_12_0;
          if (!this.field_g.isPointerMode((byte) 84)) {
            if (96 == IntrusiveDeque.field_d) {
              if (this.field_g.field_h > var2_int) {
                this.field_g.setHighlightedItem(this.field_g.field_h - 1, param0);
              } else {
                this.field_g.setHighlightedItem(var3, false);
              }
            }
            if (IntrusiveDeque.field_d == 97) {
              if (0 <= this.field_g.field_h &&
                this.field_g.field_h < var3) {
                this.field_g.setHighlightedItem(1 + this.field_g.field_h, false);
              } else {
                this.field_g.setHighlightedItem(var2_int, false);
              }
            }
          }
          this.field_g.clearInput(51);
          stackIn_38_0 = (this.canMoveToPage((byte) -46, 0)) ? 0 : 1;
          var2_intLifetime1 = stackIn_38_0;
          stackIn_42_0 = (!this.canMoveToPage((byte) -46, 2)) ? 1 : 2;
          var3Lifetime1 = stackIn_42_0;
          if (var2_intLifetime1 > this.field_g.field_h) {
            this.field_g.field_h = var2_intLifetime1;
          }
          if (var3Lifetime1 < this.field_g.field_h) {
            this.field_g.field_h = var3Lifetime1;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.LA(" + param0 + ')');
        }
    }

    final void draw(byte param0) {
        int[] stackIn_35_0 = null;
        int stackIn_36_1 = 0;
        int[] stackIn_42_0 = null;
        int stackIn_46_1 = 0;
        boolean stackIn_153_0 = false;
        int stackIn_161_1 = 0;
        boolean stackIn_162_2 = false;
        int stackIn_165_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_152_0;
        BattleScreen var2 = null;
        int var2_int = 0;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
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
        int var16 = 0;
        Sprite var17 = null;
        int var18 = 0;
        int var19 = 0;
        Object var20 = null;
        String var20_ref = null;
        int var21 = 0;
        BattleScreen var2Lifetime1;
        int stackIn_165_0Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var4Lifetime1;
        int var4Lifetime2;
        int var4Lifetime3;
        int var5Lifetime1;
        int var5Lifetime2;
        int var5Lifetime3;
        int var6Lifetime1;
        int var6Lifetime2;
        int var7Lifetime1;
        int var7Lifetime2;
        int var8Lifetime1;
        int var10Lifetime1;
        int var8Lifetime1Lifetime1;
        var21 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (AngleHelpers.hasPendingValidation((byte) 118)) {
            QueuedResponse.drawOrbCoinScreen(2341);
            return;
          }
          if (param0 != -45) {
            return;
          }
          if (!MenuScreen.getSessionFlag((byte) 112) &&
            0 < AccountFlowHelpers.field_c) {
            GameSelectionHelpers.field_g[15] = ColourBucketTable.field_e;
          }
          if (this.field_l == 16) {
            SoftwareRasterizer.clear();
            SceneWidgetNode.field_s.drawBackground((byte) -102);
            return;
          }
          if (this.field_l == 5 ||
            this.field_l == 3) {
            var2 = SpriteState.field_z;
            if (var2 == null) {
              var2 = OverlayHelpers.field_b;
            }
            var3 = var2.field_V.getCurrentPlayer(false);
            if (var3 < 0) {
              var3 = 6;
            }
            stackIn_35_0 = NameCheckHelpers.field_n;
            if (this.field_l == 3) {
              stackIn_36_1 = var3;
            } else {
              if (var2.field_I >= 0) {
                stackIn_36_1 = var2.field_I;
              } else {
                stackIn_36_1 = 6;
              }
            }
            var4 = stackIn_35_0[stackIn_36_1];
            if (var2.field_V.field_d) {
              stackIn_42_0 = NameCheckHelpers.field_n;
              if (this.field_l != 3) {
                if (var2.field_I >= 0) {
                  stackIn_46_1 = 1 & var3;
                } else {
                  stackIn_46_1 = 6;
                }
              } else {
                stackIn_46_1 = 1 & var3;
              }
              var4 = stackIn_42_0[stackIn_46_1];
            }
            var5 = 240;
            var6 = EmailLoginCredentials.field_f / 2;
            var7 = EmailLoginCredentials.field_j / 2;
            for (var8 = -var5; var8 < var5; var8++) {
              SoftwareRasterizer.setClip(0, var8 + var7, EmailLoginCredentials.field_f, var8 + var7 + 1);
              SoftwareRasterizer.fillCircleAlpha(var6, -4 - var8 / 2 + var7, var5, var4, 192);
              QuickChatPhraseCache.fillCircleMasked(var5, (byte) 126, 100, var6, -(var8 / 2) + (var7 - 4));
            }
            SoftwareRasterizer.resetClip();
          }
          if (this.field_l == 1 ||
            this.field_l == 2 ||
            this.field_l == 4) {
            DropdownList.field_N = -1;
            for (var2_int = 0; var2_int < 256; var2_int++) {
              SoftwareRasterizer.drawHorizontalLineAlpha(0, var2_int, EmailLoginCredentials.field_f, 0, -var2_int + 256);
            }
          }
          if (14 != this.field_l) {
            boolean decompiledFrameRemainder0 = true;
            GameSelectionHelpers.field_m.makeRasterTarget(true);
            if (!MessageDialog.isValidOption(this.field_l, (byte) -32) && (!(640 >= EmailLoginCredentials.field_f) ||
              !(480 >= EmailLoginCredentials.field_j))) {
              ValidationHelpWidget.renderTiledBackground(param0 ^ -47, EmailLoginCredentials.field_j, EmailLoginCredentials.field_f);
              decompiledFrameRemainder0 = false;
            }
            else {
              if (0 == (SpriteState.field_v & 63)) {
                LoginStackHelpers.field_c = null;
              }
            }
            if (15 == this.field_l) {
              PaddedContainer.field_H[0].drawTransparent(ValidatedTextWidget.field_I, QuickChatHelpers.field_a);
            } else {
              if (null != PaddedContainer.field_H[this.field_l]) {
                PaddedContainer.field_H[this.field_l].drawTransparent(ValidatedTextWidget.field_I, QuickChatHelpers.field_a);
              } else {
                NanoFrameClock.renderThemeBackground(true, this.field_l);
                GameSelectionHelpers.field_m.makeRasterTarget(true);
              }
            }
          }
          if (this.field_l == 9) {
            var2_intLifetime1 = (SpriteState.field_v >> 4) % 4;
            var3Lifetime1 = SpriteState.field_v / 2 % 2400;
            if (var3Lifetime1 < 1200) {
              var4Lifetime1 = var3Lifetime1 - 200;
              var4Lifetime1 = EmailLoginCredentials.field_f * var4Lifetime1 / 640;
              for (var5Lifetime1 = 0; var5Lifetime1 < 3; var5Lifetime1++) {
                LoadingTracker.field_d[var2_intLifetime1].drawAlpha(-(120 * var5Lifetime1) + var4Lifetime1, var5Lifetime1 * 30 + 240, 32);
              }
            } else {
              LoadingTracker.field_d[var2_intLifetime1].flipHorizontally();
              var4Lifetime1 = -var3Lifetime1 + 2200;
              var4Lifetime1 = EmailLoginCredentials.field_f * var4Lifetime1 / 640;
              for (var5Lifetime1 = 0; 3 > var5Lifetime1; var5Lifetime1++) {
                LoadingTracker.field_d[var2_intLifetime1].drawAlpha(-(var5Lifetime1 * 120) + var4Lifetime1, -(30 * var5Lifetime1) + 200, 32);
              }
              LoadingTracker.field_d[var2_intLifetime1].flipHorizontally();
            }
          }
          if (this.field_l == 1 ||
            2 == this.field_l ||
            4 == this.field_l) {
            NineSliceHelpers.drawNineSliceFrame(ValidationHelpWidget.field_U[this.field_l] * NumericDateInputWidget.field_L[this.field_l].length + 48, -24 + this.getItemTop(41, 0), -27327, 48 - (-this.getItemY(0, (byte) 103) + this.getItemTop(41, 0)), SharedCaptionGlobals.field_b, this.getItemColumnLeft(0, -7661) - 24);
          }
          var2Lifetime1 = SpriteState.field_z;
          if (var2Lifetime1 == null) {
            var2Lifetime1 = OverlayHelpers.field_b;
          }
          if (this.field_l == 2 &&
            var2Lifetime1.field_V.getCurrentPlayer(false) == var2Lifetime1.field_I) {
            var3Lifetime2 = 0;
            var4Lifetime2 = 0;
            var5Lifetime2 = 0;
            var6Lifetime1 = 0;
            var7Lifetime1 = 16;
            var8Lifetime1 = 0;
            var9 = -16;
            var10 = 0;
            var11 = 0;
            var12 = var2Lifetime1.field_z / 50;
            var13 = (-var12 + 160) / 10;
            if (var13 < 0) {
              var13 = 0;
            }
            var10Lifetime1 = (int)(Math.cos(0.3 * (double)SpriteState.field_v) * (double)var13 - (double)var13);
            var8Lifetime1Lifetime1 = (int)(Math.cos(5.0 + 0.3 * (double)SpriteState.field_v) * (double)var13 - (double)var13);
            var14 = 16;
            if (var12 < 60) {
              var14 = 17;
            }
            if (30 > var12) {
              var11 = var11 - (int)((double)var13 * Math.cos((double)SpriteState.field_v * 0.4) - (double)var13);
              var14 = 18;
            }
            var15 = 32;
            var16 = 160;
            var17 = new Sprite(128, 256);
            var17.makeRasterTarget();
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], -var11 + var16 + var8Lifetime1Lifetime1, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -116, QuickChatCategoryCache.field_d[1], QueuedPacket.field_i[MenuInputState.field_c[3]], var7Lifetime1 + var15);
            if (46 != MenuInputState.field_c[0]) {
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], -(var11 / 2) + var4Lifetime2 + var16, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -81, QuickChatCategoryCache.field_d[1], GameListHelpers.field_b[0], var3Lifetime2 + var15);
            }
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], -var11 + var16, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 68, QuickChatCategoryCache.field_d[1], IsaacRandom.field_j[MenuInputState.field_c[0]], var15);
            var16 -= 8;
            var16 -= 16;
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], -var11 + var16, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 43, QuickChatCategoryCache.field_d[1], SceneWidget.field_kb[MenuInputState.field_c[1]], var15);
            var16 += 16;
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], -var11 + var16, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 45, QuickChatCategoryCache.field_d[1], JaggrabDownloader.field_d[MenuInputState.field_c[5]], var15);
            if (53 != MenuInputState.field_c[5] &&
              MenuInputState.field_c[5] != 55) {
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], -var11 + var16, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -125, QuickChatCategoryCache.field_d[1], NameErrorHelpers.field_a[var14], var15);
            }
            var16 -= 16;
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], -var11 + var16, QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], 2, QuickChatCategoryCache.field_d[1], CachedArchiveProvider.field_A[MenuInputState.field_c[4]], var15);
            var16 += 8;
            var16 += 16;
            if (MenuInputState.field_c[0] != 46) {
              TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var16 + (var6Lifetime1 - var11 / 2), QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -92, QuickChatCategoryCache.field_d[1], ModalPanelStack.field_I[0], var15 + var5Lifetime2);
            }
            TexturedSpriteHelpers.drawTexturedSpriteIntGuard(QuickChatCategoryCache.field_d[2], var10Lifetime1 + (var16 - var11), QuickChatCategoryCache.field_d[3], QuickChatCategoryCache.field_d[0], -111, QuickChatCategoryCache.field_d[1], DiskCacheRequest.field_u[MenuInputState.field_c[2]], var9 + var15);
            GameSelectionHelpers.field_m.makeRasterTarget(true);
            var18 = EmailLoginCredentials.field_f - 256;
            var19 = EmailLoginCredentials.field_j - 128;
            SoftwareRasterizer.fillRectangleAlpha(var18, var19, 256, 128, 0, 192);
            SoftwareRasterizer.drawRectangle(-2 + var18, -2 + var19, 256, 128, 0);
            SoftwareRasterizer.drawRectangle(-1 + var18, var19 - 1, 256, 128, 4799269);
            SoftwareRasterizer.drawRectangle(var18, var19, 256, 128, 8547138);
            SoftwareRasterizer.drawRectangle(var18 + 1, var19 + 1, 256, 128, 11768360);
            SoftwareRasterizer.drawRectangle(2 + var18, 2 + var19, 256, 128, 0);
            var20 = null;
            if (var12 >= 60) {
              if (var12 % 60 >= 10) {
                var20_ref = var12 / 60 + ":" + var12 % 60;
              } else {
                var20_ref = var12 / 60 + ":0" + var12 % 60;
              }
            } else {
              var20_ref = Integer.toString(var12);
            }
            var20_ref = CachedArchiveProvider.formatTemplate(param0 + 1, new String[]{var20_ref}, UsernameCredentials.field_i);
            var17.drawHorizontalFlip(152 + var18, var19 - 104);
            SpellProjectile.field_B.drawParagraph(var20_ref, 8 + var18, 8 + var19, 176, 112, 16777215, 0, 0, 0, SpellProjectile.field_B.field_C + SpellProjectile.field_B.field_m);
          }
          if (13 != this.field_l) {
            for (var3Lifetime3 = 0; var3Lifetime3 < this.field_g.field_f; var3Lifetime3++) {
              stackOut_152_0 = this.canMoveToPage((byte) -46, var3Lifetime3);
              stackIn_165_0 = stackOut_152_0 ? 1 : 0;
              stackIn_153_0 = stackOut_152_0;
              if (stackIn_153_0) {
                stackIn_161_1 = 98;
                stackIn_162_2 = (this.field_g.field_h == var3Lifetime3);
                this.drawMenuItem((byte) stackIn_161_1, stackIn_162_2, var3Lifetime3);
              }
            }
          }
          stackIn_165_0Lifetime1 = ~this.field_l;
          if (stackIn_165_0Lifetime1 == -1) {
            this.drawBottomPanel(-26733);
          }
          if (this.field_l != 6) {
            if (this.field_l == 7) {
              this.drawContent((byte) 89);
            } else {
              if (this.field_l != 8) {
                if (this.field_l != 9) {
                  if (11 == this.field_l) {
                    this.drawAnimatedScreen(12);
                  } else {
                    if (12 == this.field_l) {
                      this.drawBody(1);
                    } else {
                      if (this.field_l != 14) {
                        if (this.field_l == 5) {
                          this.drawLobbyCircle(32);
                        } else {
                          if (3 == this.field_l) {
                            this.drawPlayerCircle(true);
                          }
                        }
                      } else {
                        this.drawTitleScreen(1);
                      }
                    }
                  }
                } else {
                  SpellProjectile.field_B.drawParagraph(TextWidgetPainter.field_b, ValidatedTextWidget.field_I + 80, QuickChatHelpers.field_a + 140, 480, 180, 0, -1, 0, 1, 30);
                }
              } else {
                this.drawIconBar(true);
              }
            }
          } else {
            this.drawOptionsPanel(true);
          }
          if (this.field_l != 0 &&
            this.field_l != 15 &&
            this.field_l != 13) {
            return;
          }
          var3Lifetime4 = -208 + EmailLoginCredentials.field_f;
          var4Lifetime3 = EmailLoginCredentials.field_j - 40;
          var5Lifetime3 = 200 * (SingleChildContainer.field_C + BitHelpers.field_c + SectorCacheStore.field_f) / 127;
          var6Lifetime2 = 11176106;
          var7Lifetime2 = 34;
          if (200 > var5Lifetime3) {
            SoftwareRasterizer.setClip(var3Lifetime4, var4Lifetime3, var3Lifetime4 + var5Lifetime3, var4Lifetime3 + 32);
            SoftwareRasterizer.fillRoundedVerticalGradientAdditive(var3Lifetime4, var4Lifetime3, 200, 32, 15, var6Lifetime2, var7Lifetime2);
            SpellProjectile.field_B.drawCentered(RequestQueueHelpers.field_e, var3Lifetime4 + 100, var4Lifetime3 + 19, 16777215, 0);
            SoftwareRasterizer.setClip(var5Lifetime3 + var3Lifetime4, var4Lifetime3, 200 + var3Lifetime4, var4Lifetime3 + 32);
            SoftwareRasterizer.fillRoundedVerticalGradientAdditive(var3Lifetime4, var4Lifetime3, 200, 32, 15, var6Lifetime2 >> 1 & 8355711, var7Lifetime2);
            SpellProjectile.field_B.drawCentered(RequestQueueHelpers.field_e, var3Lifetime4 + 100, var4Lifetime3 + 19, 0, 16777215);
            SoftwareRasterizer.resetClip();
            SoftwareRasterizer.drawRoundedRectangle(var3Lifetime4, var4Lifetime3, 200, 32, 15, 0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "lc.FA(" + param0 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        try {
          field_q = null;
          field_a = null;
          field_o = null;
          field_r = null;
          field_c = null;
          field_e = null;
          field_k = null;
          field_j = null;
          field_p = null;
          if (!param0) {
            MenuScreen.getSessionFlag((byte) -10);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "lc.BA(" + param0 + ')');
        }
    }

    private final int getItemY(int param0, byte param1) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == 103) {
            stackIn_4_0 = this.getItemX(-9, param0) + ValidatedTextWidget.field_I;
            return stackIn_4_0;
          }
          stackIn_2_0 = -6;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.J(" + param0 + ',' + param1 + ')');
        }
    }

    private final void drawCaption(int param0) {
        try {
          SpellProjectile.field_B.drawParagraph(FrameClock.field_c, 64 + ValidatedTextWidget.field_I, 128 + QuickChatHelpers.field_a, 512, 224, 0, -1, 1, 1, SpellProjectile.field_B.field_m + SpellProjectile.field_B.field_C);
          if (param0 != 12) {
            MenuScreen.getSessionFlag((byte) -6);
          }
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "lc.W(" + param0 + ')');
        }
    }

    private final boolean isItemUnlocked(int param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = param0 / 8;
          if (ResizableViewResizeListener.field_d <= var3_int) {
            return false;
          }
          var4 = 7 - (7 & param0);
          if (param1 != (1 << var4 & DateHelpers.field_f[var3_int])) {
            return true;
          }
          if (2 > MembershipGlobals.field_d) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.K(" + param0 + ',' + param1 + ')');
        }
    }

    private final void resetSelection(byte param0) {
        try {
          int var2_int = -61 % ((-38 - param0) / 46);
          this.field_g.pollKeysAndPointer(82, 2);
        } catch (RuntimeException runtimeException) {
          throw CommonUiHelpers.wrapException((Throwable) ((Object) runtimeException), "lc.H(" + param0 + ')');
        }
    }

    private final int hitTestItem(byte param0, int param1, int param2) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        boolean stackIn_12_0 = false;
        int stackIn_29_0 = 0;
        int stackIn_32_0 = 0;
        RuntimeException decompiledCaughtException = null;
        boolean stackOut_11_0;
        int stackIn_32_0Lifetime1;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (this.field_l == 10) {
            stackIn_5_0 = -1;
            return stackIn_5_0;
          }
          if (param0 != 88) {
            stackIn_8_0 = 124;
            return stackIn_8_0;
          }
          var4_int = 0;
          while (NumericDateInputWidget.field_L[this.field_l].length > var4_int) {
            var5 = this.getItemColumnLeft(var4_int, param0 ^ -7605);
            stackOut_11_0 = this.canMoveToPage((byte) -46, var4_int);
            stackIn_32_0 = stackOut_11_0 ? 1 : 0;
            stackIn_12_0 = stackOut_11_0;
            if (stackIn_12_0 &&
              param1 >= this.getItemTop(41, var4_int) &&
              this.getItemY(var4_int, (byte) 103) > param1 &&
              var5 <= param2 &&
              param2 < var5 + this.getItemSpacing(var4_int, 113)) {
              stackIn_29_0 = var4_int;
              return stackIn_29_0;
            }
            var4_int++;
          }
          stackIn_32_0Lifetime1 = -1;
          return stackIn_32_0Lifetime1;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var4), "lc.DA(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    private final int getItemLeft(int param0, int param1) {
        int stackIn_4_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_24_0 = 0;
        int stackIn_27_0 = 0;
        int stackIn_30_0 = 0;
        int stackIn_40_0 = 0;
        int stackIn_43_0 = 0;
        int stackIn_48_0 = 0;
        int stackIn_53_0 = 0;
        int stackIn_56_0 = 0;
        int stackIn_65_0 = 0;
        int stackIn_67_0 = 0;
        int stackIn_74_0 = 0;
        int stackIn_76_0 = 0;
        int stackIn_78_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (this.field_l == 15) {
            stackIn_4_0 = 75 + (param0 * ValidationHelpWidget.field_U[this.field_l] + DualLinkDeque.field_f[this.field_l]);
            return stackIn_4_0;
          }
          if (2 != this.field_l &&
            this.field_l != 4 &&
            this.field_l != 1) {
            if (this.field_l == 6) {
              if (MenuScreen.getSessionFlag((byte) 112)) {
                stackIn_21_0 = ValidationHelpWidget.field_U[this.field_l] * param0 + DualLinkDeque.field_f[this.field_l];
                return stackIn_21_0;
              }
              stackIn_19_0 = ValidationHelpWidget.field_U[this.field_l] + DualLinkDeque.field_f[this.field_l];
              return stackIn_19_0;
            }
            if (this.field_l == 7) {
              stackIn_24_0 = DualLinkDeque.field_f[this.field_l];
              return stackIn_24_0;
            }
            if (this.field_l == 11) {
              stackIn_27_0 = DualLinkDeque.field_f[this.field_l];
              return stackIn_27_0;
            }
            if (12 == this.field_l) {
              stackIn_30_0 = DualLinkDeque.field_f[this.field_l];
              return stackIn_30_0;
            }
            if (param1 != 75) {
              this.drawCaption(-100);
            }
            if (this.field_l == 14) {
              if (NumericDateInputWidget.field_L[this.field_l][param0] == 25) {
                stackIn_40_0 = 348;
                return stackIn_40_0;
              }
              if (NumericDateInputWidget.field_L[this.field_l][param0] == 26) {
                stackIn_43_0 = 348;
                return stackIn_43_0;
              }
              if (NumericDateInputWidget.field_L[this.field_l][param0] == 30) {
                stackIn_48_0 = 412;
                return stackIn_48_0;
              }
              if (29 == NumericDateInputWidget.field_L[this.field_l][param0]) {
                stackIn_53_0 = 380;
                return stackIn_53_0;
              }
              if (NumericDateInputWidget.field_L[this.field_l][param0] == 7) {
                stackIn_56_0 = 444;
                return stackIn_56_0;
              }
            }
            if (this.field_l == 3) {
              if (param0 == 1 &&
                SpriteState.field_z == null) {
                stackIn_65_0 = 410 + ValidationHelpWidget.field_U[this.field_l] / 2;
                return stackIn_65_0;
              }
              stackIn_67_0 = 410 + param0 * ValidationHelpWidget.field_U[this.field_l];
              return stackIn_67_0;
            }
            if (this.field_l != 8) {
              stackIn_78_0 = DualLinkDeque.field_f[this.field_l] + param0 * ValidationHelpWidget.field_U[this.field_l];
              return stackIn_78_0;
            }
            if (param0 == 3) {
              stackIn_74_0 = DualLinkDeque.field_f[this.field_l];
              return stackIn_74_0;
            }
            stackIn_76_0 = DualLinkDeque.field_f[this.field_l] + 1 * ValidationHelpWidget.field_U[this.field_l];
            return stackIn_76_0;
          }
          stackIn_13_0 = -32 + (param0 - NumericDateInputWidget.field_L[this.field_l].length) * ValidationHelpWidget.field_U[this.field_l] + 480;
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var3), "lc.O(" + param0 + ',' + param1 + ')');
        }
    }

    MenuScreen(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        this.field_d = 0;
        try {
          this.field_l = param0;
          if (null == NumericDateInputWidget.field_L[this.field_l]) {
            this.field_g = null;
          } else {
            this.field_g = new MenuInputState(NumericDateInputWidget.field_L[this.field_l].length);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2), "lc.<init>(" + param0 + ')');
        }
    }

    final void update(int param0) {
        int stackIn_46_0 = 0;
        int stackIn_46_1 = 0;
        MembershipOfferScreen stackIn_71_0 = null;
        boolean stackIn_72_1 = false;
        int stackIn_85_0 = 0;
        int stackIn_121_0 = 0;
        int stackIn_121_1 = 0;
        int stackIn_124_0 = 0;
        int stackIn_124_1 = 0;
        int stackIn_165_0 = 0;
        int stackIn_165_1 = 0;
        int[][] stackIn_217_0;
        int stackIn_217_1;
        int[][] stackIn_217_2;
        int stackIn_217_3;
        int stackIn_218_4;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        MembershipOfferScreen var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int stackIn_46_0Lifetime1;
        int stackIn_46_1Lifetime1;
        int stackIn_121_0Lifetime1;
        int stackIn_121_1Lifetime1;
        int stackIn_165_0Lifetime1;
        int stackIn_165_1Lifetime1;
        int var2_intLifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        int var2_intLifetime1Lifetime1;
        int var2_intLifetime1Lifetime2;
        int var3Lifetime1Lifetime1;
        var5 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param0 <= 76) {
            this.field_h = -27;
          }
          MessageCaptionGlobals.field_k = MessageCaptionGlobals.field_k + 1;
          if (AngleHelpers.hasPendingValidation((byte) 118)) {
            var2_int = IconHighlightPainter.handleOptionKeys(89);
            if (var2_int != 2) {
              return;
            }
            AlphaContainer.clearValidationState((byte) -96);
          }
          if (!TextLayout.field_b &&
            !IntrusiveDequeCursor.field_g) {
            while (true) {
              if (BevelTextPainter.pollKeyEvent(false)) {
                stackIn_46_0 = IntrusiveDeque.field_d;
                stackIn_46_1 = 13;
                if (stackIn_46_0 == stackIn_46_1 &&
                  this.field_l != 0) {
                  if (5 != this.field_l &&
                    this.field_l != 1 &&
                    2 != this.field_l &&
                    3 != this.field_l &&
                    this.field_l != 4) {
                    ScreenSwitchHelpers.switchScreen(false, true, NameTable.field_f, NameTable.field_f);
                    continue;
                  }
                  ScreenSwitchHelpers.switchScreen(false, true, -1, MatchingFieldValidator.field_r);
                  continue;
                }
                this.handleShortcutKeys(111);
                if (this.field_g.field_h == -1) {
                  continue;
                }
                this.performItemAction(false, this.field_g.field_h, false);
                continue;
              }
              this.field_g.setItemBounds(this.hitTestItem((byte) 88, EmailLoginCredentials.field_g, MenuButtonPanel.field_I), this.hitTestItem((byte) 88, QueuedResponse.field_h, ConfirmedNameValidator.field_s), -97);
              stackIn_46_0Lifetime1 = this.field_g.field_h;
              stackIn_46_1Lifetime1 = -1;
              if (stackIn_46_0Lifetime1 == stackIn_46_1Lifetime1) {
                break;
              }
              this.performItemAction(true, this.field_g.field_h, false);
              break;
            }
          }
          if (this.field_l == 13) {
            MusicPatchNode.field_s = MusicPatchNode.field_s + 1;
            if (!(MusicPatchNode.field_s <= 100) ||
              PacketBuffer.field_m != 0 ||
              RasterSetupHelpers.field_b[84]) {
              ScreenSwitchHelpers.switchScreen(false, true, 0, MatchingFieldValidator.field_r);
            }
          }
          if (this.field_l == 8) {
            this.updateHoverSelection(-1);
          }
          if (16 == this.field_l) {
            var2 = SceneWidgetNode.field_s;
            stackIn_71_0 = var2;
            stackIn_72_1 = (!LoadingTracker.canSubmitDate(-1)) && (~MatchingFieldValidator.field_r == ~this.field_l);
            var3 = ((MembershipOfferScreen) (Object) stackIn_71_0).advanceAnimation(stackIn_72_1, true);
            if (var3 != 3 && (var3 == 1 ||
              var3 == 2)) {
              stackIn_85_0 = (var3 != 2) ? 0 : 1;
              var4 = stackIn_85_0;
              ScreenSwitchHelpers.switchScreen(var4 != 0, true, 0, MatchingFieldValidator.field_r);
            }
          }
          if (this.field_l == 5) {
            MusicPatchNode.field_s = MusicPatchNode.field_s + 1;
            if (MusicPatchNode.field_s > 250) {
              ScreenSwitchHelpers.switchScreen(true, true, -1, MatchingFieldValidator.field_r);
            }
          }
          if (3 == this.field_l) {
          }
          if (this.field_l == 12) {
            if (WrappedTextLayout.field_r == 1) {
              if (this.field_m == 10) {
                this.field_d = this.field_d + this.field_i;
              }
              boolean decompiledFrameRemainder0 = true;
              boolean decompiledFrameRemainder1 = true;
              if (1 == this.field_m) {
                var2_intLifetime1 = 0;
                for (var3Lifetime1 = 0; var3Lifetime1 < 16; var3Lifetime1++) {
                  stackIn_121_0 = this.field_i;
                  stackIn_121_1 = ThrowableFormatHelpers.field_f[var3Lifetime1];
                  if (stackIn_121_0 == stackIn_121_1) {
                    var2_intLifetime1 = 1;
                    this.field_i = var3Lifetime1;
                    this.field_m = 2;
                  }
                }
                if ((var2_intLifetime1 != 0) &&
                  (decompiledFrameRemainder0 = (this.field_m == 2))) {
                  for (var2_intLifetime1 = this.field_i; var2_intLifetime1 < 15; var2_intLifetime1++) {
                    ThrowableFormatHelpers.field_f[var2_intLifetime1] = ThrowableFormatHelpers.field_f[1 + var2_intLifetime1];
                  }
                  decompiledFrameRemainder1 = false;
                }
                if ((decompiledFrameRemainder1) &&
                  (decompiledFrameRemainder0)) {
                  var3Lifetime1 = 0;
                  while (true) {
                    stackIn_121_0Lifetime1 = var3Lifetime1;
                    stackIn_121_1Lifetime1 = 16;
                    if (stackIn_121_0Lifetime1 >= stackIn_121_1Lifetime1) {
                      break;
                    }
                    stackIn_124_0 = -1;
                    stackIn_124_1 = ThrowableFormatHelpers.field_f[var3Lifetime1];
                    if (stackIn_124_0 == stackIn_124_1) {
                      ThrowableFormatHelpers.field_f[var3Lifetime1] = this.field_i;
                      this.field_i = -1;
                    }
                    var3Lifetime1++;
                  }
                }
              }
              if ((decompiledFrameRemainder1) && ((decompiledFrameRemainder0) &&
                (decompiledFrameRemainder0 = (this.field_m == 2)))) {
                for (var2_intLifetime1 = this.field_i; var2_intLifetime1 < 15; var2_intLifetime1++) {
                  ThrowableFormatHelpers.field_f[var2_intLifetime1] = ThrowableFormatHelpers.field_f[1 + var2_intLifetime1];
                }
              }
              if (decompiledFrameRemainder0) {
                ThrowableFormatHelpers.field_f[15] = -1;
              }
              if (this.field_m == 0) {
                this.field_h = this.field_i;
              }
              if (this.field_m == 5 &&
                NodeHashTableIterator.field_j >= (5 + GridContainer.field_P)) {
                ByteStorage.sendOptionSelection(2, this.field_h * 8 - 14);
              }
              if (this.field_m == 7 &&
                2 + GridContainer.field_P <= NodeHashTableIterator.field_j) {
                ByteStorage.sendOptionSelection(2, -13 + this.field_h * 8 + (-1 + this.field_i % 12) / 2);
              }
              if (this.field_m == 8 &&
                (3 + GridContainer.field_P) <= NodeHashTableIterator.field_j) {
                ByteStorage.sendOptionSelection(2, this.field_i % 12 + this.field_h * 8 - 18);
              }
              if (this.field_m == 9 &&
                RasterSetupHelpers.field_b[82]) {
                LoginLoadingHelpers.sendSettingsUpdate((byte) -120);
              }
            }
            var2_intLifetime1Lifetime1 = 0;
            scanLoop1: while (true) {
              var2_intLifetime1Lifetime2 = 0;
              var3Lifetime1Lifetime1 = 0;
              while (true) {
                stackIn_165_0 = var3Lifetime1Lifetime1;
                stackIn_165_1 = 15;
                if (stackIn_165_0 >= stackIn_165_1) {
                  if (var2_intLifetime1Lifetime2 != 0) {
                    break;
                  }
                  break scanLoop1;
                }
                stackIn_165_0Lifetime1 = 0;
                stackIn_165_1Lifetime1 = ~ThrowableFormatHelpers.field_f[var3Lifetime1Lifetime1];
                if ((stackIn_165_0Lifetime1 == stackIn_165_1Lifetime1 ||
                  !(ThrowableFormatHelpers.field_f[1 + var3Lifetime1Lifetime1] >= ThrowableFormatHelpers.field_f[var3Lifetime1Lifetime1])) &&
                  ThrowableFormatHelpers.field_f[var3Lifetime1Lifetime1 + 1] != -1) {
                  var4Lifetime1 = ThrowableFormatHelpers.field_f[var3Lifetime1Lifetime1];
                  ThrowableFormatHelpers.field_f[var3Lifetime1Lifetime1] = ThrowableFormatHelpers.field_f[var3Lifetime1Lifetime1 + 1];
                  ThrowableFormatHelpers.field_f[1 + var3Lifetime1Lifetime1] = var4Lifetime1;
                  var2_intLifetime1Lifetime2 = 1;
                }
                var3Lifetime1Lifetime1++;
              }
            }
          }
          if (this.field_l == 11) {
            if (1 == WrappedTextLayout.field_r) {
              if (this.field_m == 0) {
                MenuInputState.field_c[this.field_h] = this.field_i;
              }
              if (this.field_m == 6) {
                this.field_n = this.field_n + this.field_i;
              }
              if (this.field_m != 8) {
              }
              if (1 == this.field_m) {
                this.field_h = this.field_i;
                this.field_n = 0;
              }
              if (this.field_m == 2) {
                QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[this.field_i];
              }
              if (3 == this.field_m) {
                QuickChatCategoryCache.field_d[1] = GameApplet.field_z[this.field_i];
              }
              if (4 == this.field_m) {
                QuickChatCategoryCache.field_d[2] = IsaacCipher.field_d[this.field_i];
              }
              if (this.field_m == 5) {
                QuickChatCategoryCache.field_d[3] = ViewControllerHelpers.field_b[this.field_i];
              }
              if (this.field_m == 7) {
                MenuInputState.field_c[0] = (int)(12.0 * Math.random());
                MenuInputState.field_c[1] = (int)(18.0 * Math.random() * 3.0);
                MenuInputState.field_c[2] = (int)(Math.random() * 12.0);
                MenuInputState.field_c[3] = (int)(12.0 * Math.random());
                MenuInputState.field_c[4] = (int)(3.0 * (14.0 * Math.random()));
                MenuInputState.field_c[5] = (int)(3.0 * (14.0 * Math.random()));
                QuickChatCategoryCache.field_d[0] = AlternateUsernameCredentials.field_n[(int)(Math.random() * (double)AlternateUsernameCredentials.field_n.length)];
                QuickChatCategoryCache.field_d[1] = GameApplet.field_z[(int)(Math.random() * (double)GameApplet.field_z.length)];
                QuickChatCategoryCache.field_d[2] = IsaacCipher.field_d[(int)(Math.random() * (double)IsaacCipher.field_d.length)];
                stackIn_217_0 = QuickChatCategoryCache.field_d;
                stackIn_217_1 = 3;
                stackIn_217_2 = ViewControllerHelpers.field_b;
                stackIn_217_3 = (int)(Math.random() * (double)ViewControllerHelpers.field_b.length);
                if (!(Math.random() < 1.1)) {
                  stackIn_218_4 = 8;
                } else {
                  stackIn_218_4 = 5;
                }
                stackIn_217_0[stackIn_217_1] = stackIn_217_2[stackIn_217_3 % stackIn_218_4];
              }
            }
            this.field_f = this.field_f + 0.4;
          } else {
            this.field_f = 0.0;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw CommonUiHelpers.wrapException((Throwable) ((Object) var2_ref), "lc.R(" + param0 + ')');
        }
    }

    static {
        int var0 = 0;
        field_r = "Waiting";
        field_j = new IntrusiveDeque();
        field_q = new LoginMessageTable[255];
        field_a = "<%0> has resigned.";
        field_c = "Owner";
        for (var0 = 0; field_q.length > var0; var0++) {
          field_q[var0] = new LoginMessageTable();
        }
        field_k = "Type your age in years";
        field_e = "Solicitation";
        field_o = "Bounce off the landscape and either explode after 5 seconds or on each bounce. Hold the mouse to increase the velocity of the attack.";
        field_p = "Improves the abilities of Storm, Thunder Shock and Conductor Rod";
    }

    @SuppressWarnings("unchecked")
    private static <T extends Throwable> RuntimeException sneakyThrow(Throwable throwable) throws T {
        throw (T) throwable;
    }
}
