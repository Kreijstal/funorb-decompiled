/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MenuInputState {
    boolean selectionChanged;
    static String field_b;
    private int repeatButton;
    int selectedIndex;
    boolean pointerDriven;
    private int heldButton;
    static TrackerMusicDefinition field_d;
    private int keyCode;
    private int initialPressButton;
    int itemCount;
    static int field_l;
    private int repeatCountdown;

    public static void releaseStatics(byte guard) {
        field_b = null;
        field_d = null;
        if (guard != 49) {
          MenuInputState.drawAccountOverlay(false, -49, true);
        }
    }

    final boolean isBackwardAction(boolean guard) {
        if (guard) {
          this.repeatButton = -57;
          if (this.repeatButton != 2) {
            return this.keyCode == 96 ? true : false;
          }
          return true;
        }
        if (this.repeatButton == 2) {
          return true;
        }
        if (this.keyCode != 96) {
          return false;
        }
        return true;
    }

    final boolean isRightPressed(int guard) {
        if (guard == -98) {
          return this.keyCode == 97 ? true : false;
        }
        this.heldButton = -21;
        return this.keyCode == 97 ? true : false;
    }

    final static int introDurationMillis(int guard) {
        if (guard != -31119) {
          MenuInputState.requestProgress(97, -30, 91, (byte) 54);
          return TextHotspotRegion.field_h;
        }
        return TextHotspotRegion.field_h;
    }

    final boolean isInitialActivation(byte guard) {
        if (guard != -18) {
          this.hitVerticalList((byte) -45, -80, 2, 65, -24, 89, 16);
          if (0 != this.initialPressButton) {
            return true;
          }
          if (this.keyCode != 84) {
            return 83 == this.keyCode ? true : false;
          }
          return true;
        }
        if (0 != this.initialPressButton) {
          return true;
        }
        if (this.keyCode == 84) {
          return true;
        }
        if (83 != this.keyCode) {
          return false;
        }
        return true;
    }

    final boolean isEndPressed(int guard) {
        if (guard != 0) {
          return true;
        }
        return this.keyCode == 103 ? true : false;
    }

    final void updateVerticalList(int guard, int left, int top, int rowHeight, int right) {
        if (guard == 0) {
          int var6 = this.hitVerticalList((byte) 113, top, GzipDecoder.field_d, rowHeight, right, UiContainer.field_y, left);
          int var7 = this.hitVerticalList((byte) 124, top, SessionCounterState.field_c, rowHeight, right, LoginDialog.field_ob, left);
          this.updatePointer(var7, (byte) 118, var6);
          return;
        }
    }

    final void selectFromKeyboard(boolean consumeKey, int index) {
        if (this.heldButton == 0) {
          this.selectionChanged = true;
          this.pointerDriven = false;
          this.selectedIndex = index;
          if (consumeKey) {
            this.keyCode = -57;
            return;
          }
          return;
        }
        if (!consumeKey) {
          return;
        }
        this.keyCode = -57;
    }

    final void handleKeyEvent(byte guard) {
        this.selectionChanged = false;
        this.keyCode = 0;
        if (guard != 6) {
          return;
        }
        this.repeatButton = 0;
        this.initialPressButton = 0;
        if (this.heldButton != 0) {
          if (0 == this.heldButton) {
            this.keyCode = PasswordValidator.field_n;
          }
        } else if (PasswordValidator.field_n != 98) {
          if (0 != this.heldButton) {
            if (0 == this.heldButton &&
              PasswordValidator.field_n == 99) {
              this.selectedIndex = this.selectedIndex + 1;
              this.pointerDriven = false;
              this.selectionChanged = true;
              if (this.selectedIndex >= this.itemCount) {
                this.selectedIndex = 0;
              }
            }
            return;
          }
          this.keyCode = PasswordValidator.field_n;
        } else if (this.selectedIndex > 0) {
          this.selectionChanged = true;
          this.pointerDriven = false;
          this.selectedIndex = this.selectedIndex - 1;
          if (0 == this.heldButton) {
            this.keyCode = PasswordValidator.field_n;
            if (0 == this.heldButton &&
              PasswordValidator.field_n == 99) {
              this.selectedIndex = this.selectedIndex + 1;
              this.pointerDriven = false;
              this.selectionChanged = true;
              if (this.selectedIndex >= this.itemCount) {
                this.selectedIndex = 0;
              }
            }
            return;
          }
        } else {
          this.selectedIndex = this.itemCount;
          this.selectionChanged = true;
          this.pointerDriven = false;
          this.selectedIndex = this.selectedIndex - 1;
          if (0 == this.heldButton) {
            this.keyCode = PasswordValidator.field_n;
          }
        }
        if (0 != this.heldButton) {
          return;
        }
        if (PasswordValidator.field_n != 99) {
          return;
        }
        this.selectedIndex = this.selectedIndex + 1;
        this.pointerDriven = false;
        this.selectionChanged = true;
        if (this.selectedIndex < this.itemCount) {
          return;
        }
        this.selectedIndex = 0;
    }

    final void initializeSelection(int guard, boolean pointerDriven, int pointerIndex, int keyboardIndex) {
        this.pointerDriven = pointerDriven ? true : false;
        this.heldButton = 0;
        if (guard <= 89) {
          return;
        }
        if (this.pointerDriven) {
          this.selectedIndex = pointerIndex;
          return;
        }
        this.selectedIndex = keyboardIndex;
    }

    final static void loadCommonUiAssets(int guard, ResourceArchive legacyArchive, ResourceArchive spriteArchive, ResourceArchive fontArchive) {
        int var9 = 0;
        int var13 = EscapeVector.obfuscationControl;
        SecondaryNodeHashTable.field_a = SpriteArchiveSupport.loadNamedSprites(spriteArchive, (byte) 126, "commonui", "frame_top");
        AccountPayloadSupport.field_d = SpriteArchiveSupport.loadNamedSprites(spriteArchive, (byte) -114, "commonui", "frame_bottom");
        ProgressRecord.field_j = MembershipPromotionScreen.loadNamedSprite("commonui", spriteArchive, "jagex_logo_grey", true);
        LoginCredentialType.field_f = SpriteArchiveSupport.loadNamedSprites(spriteArchive, (byte) -81, "commonui", "button");
        EditableTextWidget.field_E = MeshMaterial.loadSpritesByName("validation", spriteArchive, "commonui", (byte) 77);
        LegacyMenuFontSupport.field_c = (BitmapFont) ((Object) KeyboardStateSupport.loadCoverageFont("arezzo12", -110, spriteArchive, "commonui", fontArchive));
        Js5Transport.field_a = (BitmapFont) ((Object) KeyboardStateSupport.loadCoverageFont("arezzo14", -124, spriteArchive, "commonui", fontArchive));
        RasterRestoreSupport.field_b = (BitmapFont) ((Object) KeyboardStateSupport.loadCoverageFont("arezzo14bold", -93, spriteArchive, "commonui", fontArchive));
        Sprite var17 = new Sprite(legacyArchive.getNamedFile(-4, "", "button.gif"), (java.awt.Component) ((Object) SpriteDecodeSupport.field_d));
        AccountRegistrationPanel.a(spriteArchive, 50, "dropdown", "commonui");
        IndexedSprite[] var5 = SpriteCheckboxPainter.loadIndexedSprites("commonui", "screen_options", (byte) -65, spriteArchive);
        SoundCache.field_f = new IndexedSprite[4];
        CachedArchiveProvider.field_w = new IndexedSprite[4];
        BitCountSupport.field_f = new IndexedSprite[4];
        IndexedSprite[][] var6 = new IndexedSprite[][]{SoundCache.field_f, BitCountSupport.field_f, CachedArchiveProvider.field_w};
        int[][] var19 = new int[4][];
        int[][] var16 = var19;
        int[][] var7 = var16;
        var7[0] = var5[0].field_l;
        for (int var8 = 1; var19.length > var8; var8++) {
          var7[var8] = (int[]) ((Object) var19[0].clone());
        }
        int var8Lifetime1 = var5[0].field_k[0];
        var19[2][var8Lifetime1] = 16777215;
        var19[1][var8Lifetime1] = 2394342;
        var19[3][var8Lifetime1] = 4767999;
        for (var9 = 0; 3 > var9; var9++) {
          IndexedSprite[] var14 = var6[var9];
          IndexedSprite[] var10 = var14;
          for (int var11_int = 0; var14.length > var11_int; var11_int++) {
            var14[var11_int] = ValidationState.a(-50, var5[var9], var19[var11_int]);
          }
        }
        var9 = var17.height;
        LoginStage.pushRasterState(-123);
        var17.bindAsFramebuffer();
        SoftwareRasterizer.grayscaleRectangle(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height);
        Sprite var15 = new Sprite(var9, var9);
        Sprite var18 = var15;
        var18.bindAsFramebuffer();
        var17.drawOpaque(0, 0);
        if (guard != 83) {
          return;
        }
        try {
          Sprite var11 = new Sprite(var9, var9);
          var11.bindAsFramebuffer();
          var17.drawOpaque(-var17.width + var9, 0);
          Sprite var12 = new Sprite(-(var9 * 2) + var17.width, var9);
          var12.bindAsFramebuffer();
          var17.drawOpaque(-var9, 0);
          RasterRestoreSupport.popRasterState((byte) -109);
          LoginCredentialType.field_f = new Sprite[]{var15, var12, var11};
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "wc.L(" + guard + ',' + (legacyArchive != null ? "{...}" : "null") + ',' + (spriteArchive != null ? "{...}" : "null") + ',' + (fontArchive != null ? "{...}" : "null") + ')');
        }
    }

    final boolean isLeftPressed(int guard) {
        int var2 = -51 / ((guard - 67) / 37);
        return this.keyCode == 96 ? true : false;
    }

    final boolean isHomePressed(int guard) {
        if (guard == -10809) {
          return this.keyCode == 102 ? true : false;
        }
        this.selectedIndex = 24;
        return this.keyCode == 102 ? true : false;
    }

    final static ProgressQuery requestProgress(int campaignId, int opcode, int wordCount, byte guard) {
        ProgressQuery var4 = new ProgressQuery();
        var4.progressWords = new int[wordCount];
        var4.campaignId = campaignId;
        if (guard == -51) {
          AchievementTracker.field_i.addLast(-12328, var4);
          ArchiveRequest.writeProgressQuery(opcode, var4, -755);
          return var4;
        }
        field_d = (TrackerMusicDefinition) null;
        AchievementTracker.field_i.addLast(-12328, var4);
        ArchiveRequest.writeProgressQuery(opcode, var4, -755);
        return var4;
    }

    final void updatePointer(int clickIndex, byte guard, int hoverIndex) {
        if (this.itemCount <= hoverIndex) {
          throw new IllegalArgumentException();
        }
        if (clickIndex >= this.itemCount) {
          throw new IllegalArgumentException();
        }
        this.repeatButton = 0;
        this.initialPressButton = 0;
        this.selectionChanged = false;
        this.keyCode = 0;
        if (0 != AccountMessagePanel.field_N) {
          this.heldButton = AccountMessagePanel.field_N;
          this.repeatButton = AccountMessagePanel.field_N;
          this.initialPressButton = AccountMessagePanel.field_N;
          this.pointerDriven = true;
          this.selectedIndex = clickIndex;
          this.repeatCountdown = FullscreenFocusCanvas.field_h;
        }
        if (this.heldButton == 0) {
          if (AccountMessagePanel.field_N == 0) {
            if (DialWidget.field_K != 0) {
              if (guard < 116) {
                return;
              }
              if (this.heldButton != 0) {
                return;
              }
              if (!this.pointerDriven &&
                !TextFieldValidator.field_h) {
                return;
              }
              if (hoverIndex >= 0) {
                if (hoverIndex == this.selectedIndex) {
                  this.selectedIndex = hoverIndex;
                  this.pointerDriven = true;
                  return;
                }
                this.selectionChanged = true;
                this.selectedIndex = hoverIndex;
                this.pointerDriven = true;
                return;
              }
              if (this.pointerDriven) {
                this.selectedIndex = -1;
              }
              return;
            }
            this.heldButton = 0;
          }
        } else if (DialWidget.field_K != 0) {
          if (0 >= this.repeatCountdown) {
            this.repeatCountdown = AccountChoicePanel.field_H;
            this.repeatButton = this.heldButton;
          }
          this.repeatCountdown = this.repeatCountdown - 1;
          if (AccountMessagePanel.field_N == 0 &&
            DialWidget.field_K == 0) {
            this.heldButton = 0;
          }
        } else if (AccountMessagePanel.field_N == 0 &&
          DialWidget.field_K == 0) {
          this.heldButton = 0;
        }
        if (guard < 116) {
          return;
        }
        if (this.heldButton != 0) {
          return;
        }
        if (!this.pointerDriven &&
          !TextFieldValidator.field_h) {
          return;
        }
        if (hoverIndex < 0) {
          if (!this.pointerDriven) {
            return;
          }
          this.selectedIndex = -1;
          return;
        }
        if (hoverIndex != this.selectedIndex) {
          this.selectionChanged = true;
        }
        this.selectedIndex = hoverIndex;
        this.pointerDriven = true;
    }

    final static void writeAccountHandshake(int firstShort, int byteValue, boolean guard, int secondShort, PacketBuffer output) {
        try {
          output.writeByte(12, -123);
          output.writeShort(-119, 17);
          output.writeShort(-114, secondShort);
          output.writeShort(92, firstShort);
          output.writeByte(byteValue, -123);
          if (!guard) {
            field_b = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) runtimeException), "wc.C(" + firstShort + ',' + byteValue + ',' + guard + ',' + secondShort + ',' + (output != null ? "{...}" : "null") + ')');
        }
    }

    final void handleKeyWithoutNavigation(int guard) {
        this.selectionChanged = false;
        this.initialPressButton = 0;
        this.keyCode = 0;
        this.repeatButton = 0;
        if (this.heldButton == 0) {
          this.keyCode = PasswordValidator.field_n;
        }
        if (guard >= 69) {
          return;
        }
        this.isForwardAction(103);
    }

    final static void drawAccountOverlay(boolean unused, int guard, boolean dimBackground) {
        if (dimBackground) {
          SoftwareRasterizer.fillRectangleAlpha(0, 0, SoftwareRasterizer.width, SoftwareRasterizer.height, 0, 192);
          if (guard != 1983) {
            MenuInputState.requestProgress(97, 35, -50, (byte) 98);
            FrameCadenceSupport.renderAccountPanels(dimBackground, guard + 15130);
            return;
          }
          FrameCadenceSupport.renderAccountPanels(dimBackground, guard + 15130);
          return;
        }
        SoftwareRasterizer.clearFramebuffer();
        if (guard != 1983) {
          MenuInputState.requestProgress(97, 35, -50, (byte) 98);
          FrameCadenceSupport.renderAccountPanels(dimBackground, guard + 15130);
          return;
        }
        FrameCadenceSupport.renderAccountPanels(dimBackground, guard + 15130);
    }

    final void setPointerSelection(int index, boolean pointerDriven, int guard) {
        this.heldButton = 0;
        if (guard != 4767999) {
          this.setPointerSelection(114, true, -119);
          this.pointerDriven = pointerDriven ? true : false;
          if (!this.pointerDriven) {
            return;
          }
          this.selectedIndex = index;
          return;
        }
        this.pointerDriven = pointerDriven ? true : false;
        if (!this.pointerDriven) {
          return;
        }
        this.selectedIndex = index;
    }

    final boolean isPointerHeld(boolean guard) {
        if (!guard) {
          return this.heldButton != 0 ? true : false;
        }
        this.updateVerticalList(65, 8, 125, -70, -123);
        return this.heldButton != 0 ? true : false;
    }

    final boolean isForwardAction(int guard) {
        if (guard != 23518) {
          return false;
        }
        if (this.repeatButton == 1) {
          return true;
        }
        if (this.keyCode == 97) {
          return true;
        }
        if (this.keyCode == 84) {
          return true;
        }
        if (this.keyCode != 83) {
          return false;
        }
        return true;
    }

    final int hitVerticalList(byte guard, int top, int x, int rowHeight, int right, int y, int left) {
        if (left > x) {
          if (guard > 112) {
            return -1;
          }
          this.isInitialActivation((byte) -27);
          return -1;
        }
        if (right <= x) {
          if (guard > 112) {
            return -1;
          }
          this.isInitialActivation((byte) -27);
          return -1;
        }
        if (y >= top) {
          if (top + this.itemCount * rowHeight > y) {
            return (y - top) / rowHeight;
          }
          if (guard > 112) {
            return -1;
          }
          this.isInitialActivation((byte) -27);
          return -1;
        }
        if (guard > 112) {
          return -1;
        }
        this.isInitialActivation((byte) -27);
        return -1;
    }

    MenuInputState(int itemCount) {
        this.pointerDriven = false;
        this.selectedIndex = 0;
        this.itemCount = itemCount;
    }

    static {
        field_b = "Hard";
    }
}
