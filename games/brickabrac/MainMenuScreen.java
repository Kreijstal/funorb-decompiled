/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MainMenuScreen extends MenuScreen {
    static String field_r;
    static RgbSprite field_s;
    private NodeDeque tooltipSprites;
    static UiComponent field_t;
    static int field_x;
    static RgbSprite field_w;
    static String field_z;
    static RgbSprite field_u;
    static String field_y;

    final int getButtonTop(int buttonIndex, int obfuscationGuard) {
        int var3 = this.buttons[buttonIndex].actionId;
        if (obfuscationGuard != 1) {
          field_t = (UiComponent) null;
        }
        if (var3 == 42) {
          return super.getButtonTop(7, 1);
        }
        return super.getButtonTop(buttonIndex, 1);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = BrickABrac.field_J ? 1 : 0;
        try {
          if (Rasterizer2D.clipLeft > param0) {
            param2 = param2 - (-param0 + Rasterizer2D.clipLeft);
            param0 = Rasterizer2D.clipLeft;
          }
          if (param5 < Rasterizer2D.clipTop) {
            param4 = param4 - (-param5 + Rasterizer2D.clipTop);
            param5 = Rasterizer2D.clipTop;
          }
          if (param0 + param2 > Rasterizer2D.clipRight) {
            param2 = -param0 + Rasterizer2D.clipRight;
          }
          if (Rasterizer2D.clipBottom < param4 + param5) {
            param4 = Rasterizer2D.clipBottom - param5;
          }
          var6_int = -param2 + Rasterizer2D.width;
          var7 = Rasterizer2D.width * param5 + param0;
          for (param5 = 0; param4 > param5; param5++) {
            for (param0 = -param2; param0 < 0; param0++) {
              var8 = Rasterizer2D.pixels[var7];
              incrementValue$0 = var7;
              var7++;
              Rasterizer2D.pixels[incrementValue$0] = IntrusiveHashIterator.a(-16711936, IntrusiveHashIterator.a(var8, 16711935) * param3) + IntrusiveHashIterator.a(16711680, param3 * IntrusiveHashIterator.a(65280, var8)) >>> 8;
            }
            var7 = var7 + var6_int;
          }
          if (param1 != 65280) {
            field_y = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw FarmBackground.addExceptionContext((Throwable) ((Object) var6), "rp.D(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    final int getButtonLeft(boolean obfuscationGuard, int buttonIndex) {
        int var3 = this.buttons[buttonIndex].actionId;
        if (!obfuscationGuard) {
          field_s = (RgbSprite) null;
        }
        if (var3 != 42) {
          return super.getButtonLeft(true, buttonIndex);
        }
        return 19;
    }

    final void drawScreen(byte obfuscationGuard) {
        TooltipSprite var4 = null;
        int var3 = BrickABrac.field_J ? 1 : 0;
        super.drawScreen((byte) -68);
        GzipInflater.a(this.buttonRight + (-this.buttonLeft + 30), 0, 468, 0, 6, (byte) -90, -15 + this.buttonLeft);
        MovingBody.a((byte) -105);
        this.a(0);
        if (obfuscationGuard > -14) {
          field_s = (RgbSprite) null;
        }
        IntrusiveHashTable.a(MusicPatch.pointerX, (byte) -118, ResourcePreparationEntry.pointerY, MeshLobbyUiHelpers.field_h);
        if (!DelayedPacket.c(77)) {
          var4 = (TooltipSprite) (this.tooltipSprites.first(-90));
          while (var4 != null) {
            var4.draw(2);
            var4 = (TooltipSprite) (this.tooltipSprites.next((byte) 116));
          }
        }
    }

    final void advanceScreen(boolean updateFlag, boolean inputEnabled, int obfuscationGuard) {
        int fieldTemp$0 = 0;
        TooltipSprite var6 = null;
        int var5 = BrickABrac.field_J ? 1 : 0;
        super.advanceScreen(updateFlag, inputEnabled, -95);
        if (obfuscationGuard > -52) {
          this.getButtonHeight((byte) 59, 93);
        }
        if (inputEnabled &&
          GrowableIntList.field_g > 0) {
          fieldTemp$0 = GrowableIntList.field_g - 1;
          GrowableIntList.field_g = GrowableIntList.field_g - 1;
          if (0 == fieldTemp$0) {
            IndexedSpriteGeometry.pushSpriteRaster(-59, field_s);
            TranslucentNineSliceFrame.a(true);
            RasterStackHelpers.popRaster(-96);
            if (IntrusiveHashTable.field_k != null) {
              IntArrayRequest.lastBackgroundId = IntrusiveHashTable.field_k.sceneId;
            }
            IntrusiveHashTable.field_k = GamePresentationHelpers.selectBackground(0, (byte) 19);
            MeshLobbyUiHelpers.field_h = 2 * ButtonWidgetRenderer.field_w.nextBoundedInt(-37880252, 2);
            GzipInflater.field_e = 50;
          }
        }
        if (!DelayedPacket.c(112)) {
          var6 = (TooltipSprite) (this.tooltipSprites.first(-90));
          while (var6 != null) {
            var6.updateHover(0);
            var6 = (TooltipSprite) (this.tooltipSprites.next((byte) 116));
          }
        }
    }

    final void handleNavigationKey(int obfuscationGuard, int keyCode, char character) {
        int var5;
        var5 = BrickABrac.field_J ? 1 : 0;
        if (obfuscationGuard != -120) {
          return;
        }
        boolean decompiledFrameRemainder0 = true;
        if (DelayedPacket.c(117)) {
          if (this.selection.selectedIndex == 9) {
            if (keyCode == 99) {
              this.selection.setSelectedIndex(false, 0);
            } else {
              if (keyCode == 96) {
                this.selection.setSelectedIndex(false, 0);
              } else {
                if (keyCode == 97) {
                  this.selection.setSelectedIndex(false, 0);
                } else {
                  if (keyCode == 98) {
                    this.selection.setSelectedIndex(false, 8);
                  }
                }
              }
            }
          } else {
            if (96 != keyCode &&
              keyCode != 97) {
              if (keyCode == 99) {
                this.selection.setSelectedIndex(false, 1 + this.selection.selectedIndex);
              } else {
                if ((keyCode == 98)) {
                  if (this.selection.selectedIndex <= 0) {
                    this.selection.setSelectedIndex(false, 9);
                  } else {
                    this.selection.setSelectedIndex(false, -1 + this.selection.selectedIndex);
                  }
                }
              }
              decompiledFrameRemainder0 = false;
            }
            else {
              this.selection.setSelectedIndex(false, 9);
            }
          }
        } else {
          super.handleNavigationKey(-120, keyCode, character);
        }

    }

    public static void c(boolean param0) {
        field_s = null;
        field_u = null;
        field_z = null;
        field_t = null;
        field_y = null;
        field_w = null;
        if (param0) {
          int[] var2 = (int[]) null;
          MainMenuScreen.blendInterpolatedHalfRgbSpan((byte) -63, 85, -10, 116, -76, 75, -37, -95, (int[]) null, 59);
        }
        field_r = null;
    }

    final void refreshMenu(int obfuscationGuard) {
        if (obfuscationGuard > -60) {
          MainMenuScreen.c(false);
        }
        if (!DelayedPacket.c(102)) {
          this.initializeButtons(PasswordValidator.field_o, 0);
        }
    }

    final int getButtonRight(int obfuscationGuard, int buttonIndex) {
        if (obfuscationGuard > -71) {
          field_u = (RgbSprite) null;
        }
        int var3 = this.buttons[buttonIndex].actionId;
        if (var3 == 42) {
          return 147;
        }
        return super.getButtonRight(-106, buttonIndex);
    }

    MainMenuScreen() {
        super(0, 180, 460, 150, 35, MeshLobbyUiHelpers.field_e);
        this.tooltipSprites = new NodeDeque();
        int var1 = 468;
        var1 = var1 - ArchiveNetworkRequest.packSelectorIcons[1].canvasHeight;
        this.tooltipSprites.addLast(new TooltipSprite(12, var1, ArchiveNetworkRequest.packSelectorIcons[1], GamePresentationHelpers.formatIndexedText(RasterSnapshot.field_s, new String[]{CanvasResizeController.packNames[1]}, (byte) 103)), (byte) 3);
    }

    final static void blendInterpolatedHalfRgbSpan(byte obfuscationGuard, int blueQ16, int blueStepQ16, int redStepQ16, int greenStepQ16, int offset, int length, int redQ16, int[] target, int greenQ16) {
        int[] var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int[] var17 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var10_ref = null;
        var16 = BrickABrac.field_J ? 1 : 0;
        try {
          if (obfuscationGuard <= 115) {
            field_y = (String) null;
          }
          while (true) {
            length--;
            if (0 > length) {
              return;
            }
            var17 = target;
            var10 = var17;
            var11 = offset;
            var12 = redQ16;
            var13 = greenQ16;
            var14 = blueQ16;
            var15 = var17[var11] >> 1 & 8355711;
            var10[var11] = IntrusiveHashIterator.a(255, var14 >> 17) - (-IntrusiveHashIterator.a(var12 >> 1, 16711680) + (-(IntrusiveHashIterator.a(33423869, var13) >> 9) - var15));
            greenQ16 = greenQ16 + greenStepQ16;
            blueQ16 = blueQ16 + blueStepQ16;
            offset++;
            redQ16 = redQ16 + redStepQ16;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10_ref = decompiledCaughtException;
          stackIn_8_0 = var10_ref;
          stackIn_8_1 = new StringBuilder().append("rp.C(").append(obfuscationGuard).append(',').append(blueQ16).append(',').append(blueStepQ16).append(',').append(redStepQ16).append(',').append(greenStepQ16).append(',').append(offset).append(',').append(length).append(',').append(redQ16).append(',');
          if (target == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw FarmBackground.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(greenQ16).append(')').toString());
        }
    }

    final int getButtonHeight(byte obfuscationGuard, int buttonIndex) {
        int var4 = -61 % ((obfuscationGuard - 66) / 45);
        int var3 = this.buttons[buttonIndex].actionId;
        if (42 != var3) {
          return super.getButtonHeight((byte) 121, buttonIndex);
        }
        return this.buttonSpacing + super.getButtonHeight((byte) 8, buttonIndex);
    }

    static {
        field_r = "Invite only";
        field_s = new RgbSprite(640, 480);
        field_z = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_y = "Click or press F10 to open Quick Chat";
    }
}
