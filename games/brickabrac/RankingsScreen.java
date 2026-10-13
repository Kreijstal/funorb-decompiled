/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingsScreen extends MenuScreen {
    static long field_u;
    private int sortIndex;
    static IndexedSprite field_t;
    static int[] field_r;
    static mh field_s;

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        if (obfuscationGuard != 1) {
          return -54;
        }
        int var3 = this.buttons[buttonIndex].actionId;
        if (this.buttons.length == 2 ||
          8 != var3) {
          return this.buttonTop;
        }
        return this.buttonSpacing + this.buttonTop;
    }

    final void layoutButtons(boolean obfuscationGuard) {
        int var5_int = 0;
        int var2;
        int var3;
        int var4;
        MenuButton var4_ref_q;
        MenuButton var5;
        MenuButton var6;
        int var6_int;
        int var7;
        String var8;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        var7 = BrickABrac.field_J ? 1 : 0;
        if (this.buttons.length != 2) {
          var2 = 0;
          for (var3 = 0; var3 < 2; var3++) {
            var4_ref_q = this.buttons[var3];
            var8 = ag.buttonLabels[var4_ref_q.actionId];
            var6_int = 30 + nn.field_g.measureText(var8);
            if (var6_int > var2) {
              var2 = var6_int;
            }
          }
          var3Lifetime1 = 10 + 2 * var2;
          var4 = (640 - var3Lifetime1) / 2;
          for (var5_int = 0; var5_int < 2; var5_int++) {
            var6 = this.buttons[var5_int];
            var6.x = var4;
            var6.y = this.getButtonTop(var5_int, 1);
            var6.width = var2;
            var6.height = this.getButtonHeight((byte) -30, var5_int);
            var4 = var4 + (10 + var6.width);
          }
          var2Lifetime1 = 30 + nn.field_g.measureText(this.e((byte) 111));
          var4Lifetime1 = (-var2Lifetime1 + 640) / 2;
          var5 = this.buttons[2];
          var5.x = var4Lifetime1;
          var5.y = this.getButtonTop(2, 1);
          var5.width = var2Lifetime1;
          var5.height = this.getButtonHeight((byte) -86, 2);
        } else {
          this.e(2);
        }
        if (!obfuscationGuard) {
          field_r = (int[]) null;
        }
    }

    final void onEnter(boolean usePointer, int initialSelection, int obfuscationGuard) {
        super.onEnter(usePointer, initialSelection, 121);
        if (obfuscationGuard <= 96) {
          return;
        }
        ch.field_h = null;
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        super.advanceScreen(updateFlag, inputEnabled, -94);
        if (og.h(-26090)) {
          return;
        }
        if (obfuscationGuard >= -52) {
          return;
        }
        if (ch.field_h == null) {
          ch.field_h = GameScreen.a(7, 0, 10, (byte) -114);
        }
    }

    final static void a(RasterCacheSurface param0, int param1, int param2, RgbSprite param3, int param4, int param5) {
        try {
          IndexedSpriteGeometry.pushSpriteRaster(-59, param0.sprite);
          if (param5 < 39) {
            RankingsScreen.a(true, 49, true);
          }
          Rasterizer2D.fillVerticalGradient(0, 0, param0.width, param0.height, kg.field_i[param4], 16777215);
          param3.b((-param3.canvasWidth + param0.width) / 2 - 50 / param1, -(189 / param1) + (-param3.canvasHeight + param0.height) + param2, 55, 83);
          sc.popRaster(-94);
        } catch (RuntimeException runtimeException) {
          throw qb.addExceptionContext((Throwable) ((Object) runtimeException), "lf.G(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final void onExit(byte obfuscationGuard) {
        ch.field_h = null;
        if (obfuscationGuard != 79) {
          field_s = (mh) null;
        }
    }

    final static void a(byte param0, boolean param1) {
        ag.a((byte) -16, false, param1);
        if (param0 >= -61) {
          field_r = (int[]) null;
        }
    }

    RankingsScreen() {
        super(6, 38, 460, 402, 35, td.field_s);
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        String[] var8;
        String[] var9;
        int var6Lifetime1;
        this.sortIndex = 0;
        qo.field_N = 10 + ob.field_D.measureText("10. ");
        var8 = new String[]{so.field_e, NodeDeque.field_c, be.field_e, hj.field_Vb, jg.field_p};
        var9 = var8;
        var2 = nn.field_g.measureText(IntrusiveNode.a((CharSequence[]) ((Object) var9), true));
        var3 = 582;
        var4 = 182;
        var5 = (-var4 + (var3 - var2)) / 5;
        mf.field_d = new int[var8.length];
        if (var5 < 0) {
          var5 = 0;
        }
        for (var6 = 0; var6 < mf.field_d.length; var6++) {
          mf.field_d[var6] = var5 + nn.field_g.measureText(var8[var6]);
          if (0 < var6) {
            mf.field_d[var6] = mf.field_d[var6] + mf.field_d[var6 - 1];
          }
        }
        for (var6Lifetime1 = 0; mf.field_d.length > var6Lifetime1; var6Lifetime1++) {
          mf.field_d[var6Lifetime1] = mf.field_d[var6Lifetime1] + var4;
        }
    }

    final static void f(int param0) {
        if (param0 != -1) {
          RgbSprite var2 = (RgbSprite) null;
          RankingsScreen.a((RasterCacheSurface) null, -117, -10, (RgbSprite) null, -120, 52);
        }
        ag.f((byte) 122);
    }

    final static void a(boolean param0, int param1, boolean param2) {
        if (param1 >= -51) {
          RankingsScreen.a((byte) -69, false);
        }
        if (param2) {
          Rasterizer2D.fillRectangleAlpha(0, 0, Rasterizer2D.width, Rasterizer2D.height, 0, 192);
        } else {
          Rasterizer2D.clear();
        }
        wc.a(param2, -1);
    }

    final boolean handleMenuAction(int buttonIndex, boolean inputFlag, byte obfuscationGuard) {
        int var4;
        MenuButton var5;
        int var6;
        int var7;
        int var8;
        var8 = BrickABrac.field_J ? 1 : 0;
        var4 = 0;
        var5 = this.buttons[buttonIndex];
        var6 = var5.actionId;
        var7 = var6;
        if (var7 != 17) {
          if (18 != var7) {
            return super.handleMenuAction(buttonIndex, inputFlag, (byte) 123);
          }
          if (this.selection.isActivated((byte) 113)) {
            this.sortIndex = 1;
            this.markButton(true, buttonIndex);
            var4 = 1;
          }
        } else {
          if (this.selection.isActivated((byte) 113)) {
            this.sortIndex = 0;
            this.markButton(true, buttonIndex);
            var4 = 1;
          }
        }
        if (obfuscationGuard != 123) {
          this.handleNavigationKey(49, -67, '￩');
        }
        return var4 != 0;
    }

    final void drawScreen(byte obfuscationGuard) {
        int var8 = 0;
        int var2;
        int var3;
        Object var4;
        String[] var5;
        int[] var6;
        int var7;
        int var9;
        int var2Lifetime1;
        int var3Lifetime1;
        Object var4Lifetime1;
        var9 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -101);
        im.a(550, 5, 243, 5, 140, (byte) -62, 45);
        al.a(this.screenId, 19);
        this.a(0);
        if (og.h(-26090)) {
          bo.a((byte) 97, na.field_N);
          return;
        }
        var2 = 149 + nn.field_g.capHeight;
        var3 = 0;
        nn.field_g.drawLeft(DualLinkIterator.field_i, 66, var2, var3, -1);
        nn.field_g.drawRight(so.field_e, mf.field_d[0], var2, var3, -1);
        nn.field_g.drawRight(NodeDeque.field_c, mf.field_d[1], var2, var3, -1);
        if (obfuscationGuard >= -14) {
          this.advanceScreen(false, true, 9);
        }
        nn.field_g.drawRight(be.field_e, mf.field_d[2], var2, var3, -1);
        nn.field_g.drawRight(hj.field_Vb, mf.field_d[3], var2, var3, -1);
        nn.field_g.drawRight(jg.field_p, mf.field_d[4], var2, var3, -1);
        var2Lifetime1 = 149 + (nn.field_g.capHeight + nn.field_g.descent) * 5 / 2;
        var4 = null;
        if (ch.field_h != null &&
          ch.field_h.field_v) {
          if (null == ch.field_h.field_r) {
            var4Lifetime1 = rn.field_d;
          } else {
            var4Lifetime1 = ef.field_f;
            var5 = ch.field_h.field_r[this.sortIndex];
            var6 = ch.field_h.field_u[this.sortIndex];
            var7 = 0;
            for (var8 = 0; var8 < 10; var8++) {
              if (var5[var8] != null) {
                var3Lifetime1 = 2;
                if (ci.a(var5[var8], -15)) {
                  var3Lifetime1 = 1;
                  var7 = 1;
                }
                if (0 == (1 & var8)) {
                  Rasterizer2D.fillRectangleAlpha(50, -15 + var2Lifetime1, 540, 18, 16777215, 16);
                }
                var4Lifetime1 = null;
                AchievementIcon.a(var6[4 * var8 + 3], var2Lifetime1, var5[var8], var6[var8 * 4 + 1], var6[4 * var8], var3Lifetime1, -1, var6[var8 * 4 + 2], var8);
              }
              var2Lifetime1 += 18;
            }
            if (var7 == 0) {
              AchievementIcon.a(ch.field_h.field_j, var2Lifetime1, tb.field_cb, ch.field_h.field_l, ch.field_h.field_n, 1, -1, ch.field_h.field_k, -1);
            }
          }
        } else {
          var4Lifetime1 = kd.field_a;
        }
        if (var4Lifetime1 != null) {
          bo.a((byte) 119, (String) (var4Lifetime1));
        }
        return;
    }

    final void refreshMenu(int obfuscationGuard) {
        this.initializeButtons(se.field_j, 0);
        this.markButton(true, 0);
        if (obfuscationGuard >= -60) {
          this.sortIndex = -47;
        }
    }

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (this.buttons.length != 2) {
          if (96 == keyCode) {
            if (this.selection.selectedIndex <= 0) {
              this.selection.setSelectedIndex(false, 1);
            } else {
              if (this.selection.selectedIndex != 2) {
                this.selection.setSelectedIndex(false, 0);
              }
            }
          }
          if (keyCode == 97) {
            if (this.selection.selectedIndex != 1) {
              if (this.selection.selectedIndex != 2) {
                this.selection.setSelectedIndex(false, 1);
              }
            } else {
              this.selection.setSelectedIndex(false, 0);
            }
          }
          if (keyCode == 99) {
            if (0 > this.selection.selectedIndex) {
              this.selection.setSelectedIndex(false, this.sortIndex);
            } else {
              if (1 < this.selection.selectedIndex) {
                this.selection.setSelectedIndex(false, this.sortIndex);
              } else {
                this.selection.setSelectedIndex(false, 2);
              }
            }
          }
          if (keyCode == 98) {
            if (this.selection.selectedIndex != 2) {
              this.selection.setSelectedIndex(false, 2);
            } else {
              this.selection.setSelectedIndex(false, this.sortIndex);
            }
          }
          this.selection.pollKeyboardCode((byte) -124);
        } else {
          this.selection.navigateHorizontal(0, -1);
        }
        if (obfuscationGuard != -120) {
          RankingsScreen.f(0);
        }
    }

    public static void g(int param0) {
        field_r = null;
        field_t = null;
        field_s = null;
        if (param0 >= -65) {
          field_u = 26L;
        }
    }

    static {
    }
}
