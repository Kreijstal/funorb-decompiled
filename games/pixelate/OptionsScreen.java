/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class OptionsScreen extends MenuScreen {
    private int field_v;
    private int field_r;
    static String field_w;
    static String field_t;
    static String field_q;
    static PlatformTaskDispatcher field_p;
    private int field_u;
    static int field_s;
    private int field_o;

    private final boolean isPuzzleCompleted(boolean param0, int param1) {
        if (!param0) {
          this.field_o = 93;
        }
        return (CheckboxPainter.field_h & 1L << param1) > 0L ? true : false;
    }

    final static boolean isAccountRequestPending(int param0) {
        int var1 = -97 / ((55 - param0) / 62);
        return Js5NetworkRequest.field_F == MatchingTextValidator.field_n ? true : false;
    }

    final static void setLegacyMenuCentre(int param0, int param1, boolean param2) {
        QuickChatCategory.field_u = param1;
        IntrusiveDeque.field_b = param0;
        if (!param2) {
          field_w = (String) null;
        }
    }

    final void enterScreen(int param0, int param1, boolean param2) {
        int var4 = 0;
        int var5 = Pixelate.field_H ? 1 : 0;
        for (var4 = 0; ModalPanel.field_I.length > var4; var4++) {
          ModalPanel.field_I[var4].hide(-124);
        }
        super.enterScreen(param0, 3, param2);
        this.field_v = 0;
        this.field_r = 1;
    }

    final static Sprite[] buildNineSliceSprites(int param0, int param1, int param2, int param3, int param4, int param5) {
        Sprite var16 = null;
        int[] var18 = SoftwareRasterizer.field_k;
        int[] var17 = var18;
        int[] var15 = var17;
        int[] var6 = var15;
        int var7 = SoftwareRasterizer.field_j;
        int var8 = SoftwareRasterizer.field_d;
        Sprite var9 = new Sprite(param5, -(2 * param5) + param3);
        var9.makeRasterTarget();
        SoftwareRasterizer.fillVerticalGradient(0, 0, param5, -(2 * param5) + param3, param2, param0);
        Sprite var10 = new Sprite(param5, param5);
        var10.makeRasterTarget();
        SoftwareRasterizer.fillRectangle(0, 0, param5, param5, param2);
        Sprite var11 = new Sprite(param1, param5);
        var11.makeRasterTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 16, param5, param2);
        Sprite var12 = new Sprite(param5, param5);
        var12.makeRasterTarget();
        SoftwareRasterizer.fillRectangle(0, 0, param5, param5, param0);
        Sprite var13 = new Sprite(16, param5);
        var13.makeRasterTarget();
        SoftwareRasterizer.fillRectangle(0, 0, 16, param5, param0);
        Object var14 = null;
        if (param4 > 0) {
          var16 = new Sprite(16, 16);
          var14 = var16;
          var16.makeRasterTarget();
          SoftwareRasterizer.fillRectangle(0, 0, 16, 16, param4);
        }
        SoftwareRasterizer.setTarget(var18, var7, var8);
        return new Sprite[]{var10, var11, var10, var9, (Sprite) (var14), var9, var12, var13, var12};
    }

    final void activateRow(int param0, byte param1, boolean param2) {
        int var7;
        int var4;
        int var5;
        String var6;
        var7 = Pixelate.field_H ? 1 : 0;
        if (param0 == 0) {
          if (this.field_g.isActivated(79)) {
            var4 = param2 ? 1 : 0;
            la.changeScreen(MidiPcmStream.field_t, 16, var4 != 0, -25528);
          }
        } else {
          if (param0 == 1) {
            if (param2) {
              if (ef.field_b == 1) {
                this.field_u = -8;
                this.field_r = 3;
              } else {
                this.field_r = 2;
              }
            }
          } else {
            if (param0 != 2) {
              if (BufferedRandomAccessFile.field_j <= 0 &&
                this.field_g.isActivated(74) &&
                param0 > 2 &&
                32 == this.field_k[param0]) {
                var4 = param0 - 3;
                if (var4 >= 10) {
                  var5 = 0;
                  var6 = QuickChatMenu.field_Ib;
                  if (!ArrayWidgetContainer.isAccountUiActive((byte) 105)) {
                    var5 = 1;
                    var6 = InputQueue.field_a;
                  }
                  MatchController.openTextPopup(param2, var5, 17, (byte) 71, var6);
                  return;
                }
              }
              super.activateRow(param0, (byte) -128, param2);
            } else {
              if (param2) {
                if (1 != ef.field_b) {
                  this.field_v = 2;
                } else {
                  this.field_u = 8;
                  this.field_v = 3;
                }
              }
            }
          }
        }
        if (param1 >= -103) {
          this.getRowLeft(125, (byte) 57);
        }
    }

    final void draw(int param0) {
        int var2 = 0;
        int var3 = Pixelate.field_H ? 1 : 0;
        NumericDateInputWidget.field_W[4].drawTransparent(0, 45);
        this.drawDefaultBackdrop((byte) 50);
        this.drawRows((byte) -71);
        if (param0 != 11) {
          return;
        }
        for (var2 = 0; ModalPanel.field_I.length > var2; var2++) {
          ModalPanel.field_I[var2].draw(-25330);
        }
    }

    final int getRowRight(int param0, boolean param1) {
        if (param1) {
          this.enterScreen(103, -99, false);
        }
        if (param0 != 1 &&
          2 != param0) {
          if (param0 <= 2) {
            return super.getRowRight(param0, false);
          }
          return 500;
        }
        return IconTextComponent.field_Jb + hf.field_k;
    }

    final void resetPage(int param0) {
        this.field_o = 0;
        int var2 = 23 / ((-16 - param0) / 43);
    }

    public static void releaseStatics(byte param0) {
        field_t = null;
        field_q = null;
        int var1 = 3 % ((26 - param0) / 48);
        field_w = null;
        field_p = null;
    }

    final static void resetConnectionRetries(byte param0) {
        Match.field_h.field_h = 0;
        if (param0 != 68) {
          return;
        }
        Match.field_h.field_m = 0;
    }

    final int getRowHeight(int param0, int param1) {
        if (param0 != -28071) {
          OptionsScreen.releaseStatics((byte) -35);
        }
        if (1 == param1 ||
          2 == param1) {
          return SectorCacheStore.field_b;
        }
        return super.getRowHeight(-28071, param1);
    }

    final void onCancel(byte param0) {
        if (param0 > -13) {
          this.field_v = 86;
        }
        la.changeScreen(0, 16, false, -25528);
    }

    final void handleNavigation(int param0) {
        boolean discarded$0 = false;
        int stackIn_6_0 = 0;
        int stackIn_12_0 = 0;
        int var2;
        int var3;
        int var4;
        int var5;
        var5 = Pixelate.field_H ? 1 : 0;
        if (param0 >= -35) {
          discarded$0 = this.isPuzzleCompleted(true, 60);
        }
        regionExit1: {
          if (ke.field_a != 98) {
            if (ke.field_a != 99) {
              super.handleNavigation(-72);
              break regionExit1;
            }
            stackIn_12_0 = (98 != ke.field_a) ? 0 : 1;
            var2 = stackIn_12_0;
          } else {
            stackIn_6_0 = (98 != ke.field_a) ? 0 : 1;
            var2 = stackIn_6_0;
          }
          var3 = this.field_g.selectedIndex;
          if (var3 != -1 &&
            var3 != 1 &&
            var3 != 2) {
            if (var3 == 0) {
              if (var2 == 0) {
                this.field_g.selectIndex(false, 3);
                this.field_o = 0;
              } else {
                this.field_g.selectIndex(false, 52);
                this.field_o = DirectByteStorage.field_k;
              }
            } else {
              if ((3 != var3 ||
                var2 == 0) &&
                (var3 != 52 ||
                var2 != 0)) {
                var4 = (-PasswordFieldPainter.field_A + 532) / 2;
                if (var2 != 0) {
                  this.field_g.selectIndex(false, -1 + var3);
                  if (this.getRowY(115, this.field_g.selectedIndex) < var4) {
                    this.field_o = this.field_o - PasswordFieldPainter.field_A;
                  }
                  if (0 <= this.field_o) {
                    break regionExit1;
                  }
                  this.field_o = 0;
                } else {
                  this.field_g.selectIndex(false, var3 + 1);
                  if (this.getRowY(69, this.field_g.selectedIndex) > var4) {
                    this.field_o = this.field_o + PasswordFieldPainter.field_A;
                  }
                  if (this.field_o > DirectByteStorage.field_k) {
                    this.field_o = DirectByteStorage.field_k;
                    break regionExit1;
                  }
                }
              } else {
                this.field_g.selectIndex(false, 0);
              }
            }
            break regionExit1;
          }
          this.field_g.selectIndex(false, 0);
        }
    }

    final int getRowY(int param0, int param1) {
        int var3 = 43 % ((-13 - param0) / 37);
        if (1 != param1) {
          if (param1 != 2) {
            if (param1 <= 2) {
              return super.getRowY(120, param1);
            }
            return (-3 + param1) * PasswordFieldPainter.field_A + (-this.field_o + 184);
          }
          return 355;
        }
        return 150;
    }

    final int rowAt(int param0, int param1, int param2) {
        if (param2 >= -110) {
          return -71;
        }
        int var4 = super.rowAt(param0, param1, -112);
        if (2 < var4 &&
          (param1 < 182 || param1 > 350)) {
          var4 = -1;
        }
        return var4;
    }

    final int getRowLeft(int param0, byte param1) {
        boolean discarded$0 = false;
        if (param1 != 90) {
          discarded$0 = this.isPuzzleCompleted(false, 70);
        }
        if (1 != param0 &&
          param0 != 2) {
          if (2 >= param0) {
            return super.getRowLeft(param0, (byte) 90);
          }
          return 300;
        }
        return IconTextComponent.field_Jb;
    }

    final void handleInput(byte param0) {
        int var3 = 0;
        int var4 = Pixelate.field_H ? 1 : 0;
        this.field_o = this.field_o + this.field_u;
        this.field_o = this.field_o + PasswordFieldPainter.field_A * DriftingParticle.field_i;
        if (this.field_o < 0) {
          this.field_o = 0;
        }
        if (param0 > -64) {
          return;
        }
        if (!(DirectByteStorage.field_k >= this.field_o)) {
          this.field_o = DirectByteStorage.field_k;
        }
        if (0 > this.field_u) {
          this.field_u = this.field_u + 1;
        }
        this.field_v = 0;
        if (0 < this.field_u) {
          this.field_u = this.field_u - 1;
        }
        this.field_r = 0;
        super.handleInput((byte) -100);
        int var2 = this.field_g.selectedIndex < 3 ? -1 : -3 + this.field_g.selectedIndex;
        for (var3 = 0; ModalPanel.field_I.length > var3; var3++) {
          ModalPanel.field_I[var3].fade(var3 == var2 ? true : false, 20);
        }
    }

    final static void initializeSpecularTable(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          if (param0 != 260) {
            field_p = (PlatformTaskDispatcher) null;
          }
          MeshRasterState.useRasterClip();
          Bzip2State.field_x = 11;
          nk.field_d = new int[260];
          for (var1_int = 0; var1_int < 256; var1_int++) {
            var2 = 15.0;
            nk.field_d[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (var5 < nk.field_d.length) {
            nk.field_d[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ChatMessage.addExceptionContext((Throwable) ((Object) var1), "op.B(" + param0 + ')');
        }
    }

    final void drawRow(byte param0, boolean param1, int param2) {
        PaletteBitmapFont stackIn_16_0;
        String stackIn_16_1;
        int stackIn_16_2;
        int stackIn_16_3;
        int stackIn_17_4 = 0;
        Sprite[] stackIn_20_0 = null;
        int stackIn_21_1 = 0;
        int var4;
        int var5;
        String var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        var11 = Pixelate.field_H ? 1 : 0;
        if (param0 > -116) {
          this.field_o = 78;
        }
        var4 = this.field_k[param2];
        if (var4 != 7) {
          if (var4 == 30) {
            if (0 == this.field_o) {
              this.field_r = 1;
            }
            Cloud.field_i[this.field_r].drawTransparent(IconTextComponent.field_Jb, 150);
          } else {
            if (var4 != 31) {
              if (var4 == 32) {
                SoftwareRasterizer.setClip(0, 182, 640, 350);
                var5 = -2 + param2;
                var6 = KiteTailSegment.field_m + ' ' + var5;
                var7 = this.getRowLeft(param2, (byte) 90);
                var8 = this.getRowRight(param2, false);
                var9 = var7 + var8 >> 1;
                var10 = this.getRowY(58, param2);
                if (param1) {
                  SpriteEffectHelpers.drawGreenVerticalGlowBar(var9, -2 + var10, 35, StripedProgressBar.field_N);
                }
                stackIn_16_0 = PieceTiming.field_e;
                stackIn_16_1 = var6;
                stackIn_16_2 = var9;
                stackIn_16_3 = var10 + PieceTiming.field_e.maxAscent;
                stackIn_17_4 = (!param1) ? 2 : 0;
                ((PaletteBitmapFont) (Object) stackIn_16_0).drawCentered(stackIn_16_1, stackIn_16_2, stackIn_16_3, stackIn_17_4, -1);
                if (this.isPuzzleCompleted(true, param2 - 3)) {
                  stackIn_20_0 = ih.field_a;
                  stackIn_21_1 = (!param1) ? 0 : 1;
                  ((Sprite) (Object) stackIn_20_0[stackIn_21_1]).drawTransparent(var8, this.getRowY(118, param2));
                }
                SoftwareRasterizer.resetClip();
              }
            } else {
              if (DirectByteStorage.field_k == this.field_o) {
                this.field_v = 1;
              }
              Cloud.field_i[this.field_v + 4].drawTransparent(IconTextComponent.field_Jb, 355);
            }
          }
        } else {
          this.drawCenteredFooterButton(Checkbox.field_O, StripedProgressBar.field_N, (byte) 122, param1);
        }
    }

    OptionsScreen(int param0, int param1, int param2, int param3, int param4, int[] param5) {
        super(param0, param1, param2, param3, param4, param5);
        int[] var9 = null;
        int var8 = 0;
        try {
          var9 = new int[53];
          int[] var7 = var9;
          for (var8 = 0; var9.length > var8; var8++) {
            var9[var8] = 32;
          }
          var9[2] = 31;
          var9[1] = 30;
          var9[0] = 7;
          this.setItems(var9, (byte) -24);
          this.field_r = 0;
          this.field_v = 0;
        } catch (RuntimeException runtimeException) {
          throw ChatMessage.addExceptionContext((Throwable) ((Object) runtimeException), "op.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + (param5 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_w = "Status";
        field_q = "Remove friend";
    }
}
