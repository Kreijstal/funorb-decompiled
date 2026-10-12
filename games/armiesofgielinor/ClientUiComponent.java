/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ClientUiComponent extends ClientUiNode {
    private boolean selectWhenFocused;
    int width;
    int disabledTextColour;
    private int matchedButtonOffsetX;
    static ClientUiComponent field_Q;
    boolean drawSkinInParentBounds;
    RgbSprite[] disabledSkinSprites;
    NodeDeque children;
    RgbSprite[] matchedButtonSkinSprites;
    int heldPressOffsetY;
    int textColour;
    boolean field_M;
    int heldPressButton;
    RgbSprite[] skinSprites;
    boolean heldButtonMatches;
    int textHorizontalPadding;
    int matchedButtonTextColour;
    private int matchedButtonOffsetY;
    private boolean inheritParentVisualState;
    String text;
    RgbSprite sprite;
    int selectedOffsetY;
    static String field_zb;
    String blinkTextSuffix;
    int screenX;
    int horizontalAlignment;
    boolean draggable;
    int heldPressOffsetX;
    int textLineSpacing;
    RgbSprite[] selectedSkinSprites;
    int pendingHeightDelta;
    int contentOffsetX;
    private int pendingXDelta;
    int textOpacity;
    boolean inputEnabled;
    boolean selected;
    int dragGrabX;
    int selectedOffsetX;
    int heldPressTextColour;
    int pressedButton;
    int x;
    int height;
    RgbSprite selectedSprite;
    int contentOffsetY;
    int pendingYDelta;
    static String field_lb;
    private int pendingWidthDelta;
    int screenY;
    boolean hovered;
    int selectedTextColour;
    boolean focused;
    int verticalAlignment;
    private int dragGrabY;
    RgbSprite[] heldPressSkinSprites;
    static int[][] field_K;
    RgbSprite disabledSprite;
    private int spriteOpacity;
    RgbSprite matchedButtonSprite;
    int y;
    RgbSprite heldPressSprite;
    BitmapFont font;

    final void draw(boolean blinkOn, int obfuscationGuard) {
        this.drawTree((byte) -26, SoftwareRaster.height, blinkOn, SoftwareRaster.width, 0, false, false, false, 0, true, false);
        if (obfuscationGuard != 20) {
          ClientUiComponent var4 = (ClientUiComponent) null;
          this.positionAfter((ClientUiComponent) null, false, 64, (ClientUiComponent) null);
        }
    }

    final static void c(boolean param0, int param1) {
        int var3;
        var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param1 > -101) {
          field_K = (int[][]) null;
        }
        if (param0 ||
          null == vu.currentRoom) {
          vk.field_f = false;
        }
        if (!param0) {
          if (null != vu.currentRoom) {
            if (gk.field_J <= 0) {
              if (PreparedAction.field_r <= 0) {
                if (mj.field_c > InstructionsPanel.field_D) {
                  if (InstructionsPanel.field_D == 0) {
                    RadialSummonMenu.a(false, false);
                  }
                  InstructionsPanel.field_D = InstructionsPanel.field_D + 1;
                }
              } else {
                PreparedAction.field_r = PreparedAction.field_r - 1;
              }
            } else {
              gk.field_J = gk.field_J - 1;
            }
          } else {
            if (null == no.roomSetup) {
              vk.field_f = false;
              if (PreparedAction.field_r > 0) {
                PreparedAction.field_r = PreparedAction.field_r - 1;
              } else {
                if (InstructionsPanel.field_D > 0) {
                  InstructionsPanel.field_D = InstructionsPanel.field_D - 1;
                } else {
                  if (mj.field_c > gk.field_J) {
                    if (gk.field_J == 0) {
                      DeployEvent.h(14570);
                    }
                    gk.field_J = gk.field_J + 1;
                  }
                }
              }
            } else {
              if (gk.field_J > 0) {
                gk.field_J = gk.field_J - 1;
              } else {
                if (InstructionsPanel.field_D <= 0) {
                  if (mj.field_c > PreparedAction.field_r) {
                    if (0 == PreparedAction.field_r) {
                      RadialSummonMenu.a(false, true);
                    }
                    PreparedAction.field_r = PreparedAction.field_r + 1;
                  }
                } else {
                  InstructionsPanel.field_D = InstructionsPanel.field_D - 1;
                }
              }
            }
          }
        } else {
          if (0 < gk.field_J) {
            gk.field_J = gk.field_J - 1;
          } else {
            if (PreparedAction.field_r <= 0) {
              if (0 < InstructionsPanel.field_D) {
                InstructionsPanel.field_D = InstructionsPanel.field_D - 1;
              }
            } else {
              PreparedAction.field_r = PreparedAction.field_r - 1;
            }
          }
        }
    }

    final void applyStyle(int obfuscationGuard, ClientUiComponent style) {
        boolean stackIn_72_1 = false;
        RuntimeException stackIn_101_0 = null;
        StringBuilder stackIn_101_1 = null;
        String stackIn_102_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (style != null) {
            if (style.heldPressSprite != null) {
              this.heldPressSprite = style.heldPressSprite;
            }
            if (style.textColour != 0) {
              this.textColour = style.textColour;
            }
            if (style.drawSkinInParentBounds) {
              this.drawSkinInParentBounds = style.drawSkinInParentBounds;
            }
            if (style.disabledSprite != null) {
              this.disabledSprite = style.disabledSprite;
            }
            if (style.textHorizontalPadding != 0) {
              this.textHorizontalPadding = style.textHorizontalPadding;
            }
            if (style.inheritParentVisualState) {
              this.inheritParentVisualState = style.inheritParentVisualState;
            }
            if (null != style.matchedButtonSkinSprites) {
              this.matchedButtonSkinSprites = style.matchedButtonSkinSprites;
            }
            if (style.selected) {
              this.selected = style.selected;
            }
            if (style.disabledSkinSprites != null) {
              this.disabledSkinSprites = style.disabledSkinSprites;
            }
            if (style.textOpacity != 256) {
              this.textOpacity = style.textOpacity;
            }
            if (style.field_M) {
              this.field_M = style.field_M;
            }
            if (0 != style.textLineSpacing) {
              this.textLineSpacing = style.textLineSpacing;
            }
            if (null != style.skinSprites) {
              this.skinSprites = style.skinSprites;
            }
            if (style.blinkTextSuffix != null) {
              this.blinkTextSuffix = style.blinkTextSuffix;
            }
            if (style.selectedSprite != null) {
              this.selectedSprite = style.selectedSprite;
            }
            if (null != style.font) {
              this.font = style.font;
            }
            if (null != style.sprite) {
              this.sprite = style.sprite;
            }
            if (style.heldPressTextColour >= 0) {
              this.heldPressTextColour = style.heldPressTextColour;
            }
            if (style.selectedTextColour >= 0) {
              this.selectedTextColour = style.selectedTextColour;
            }
            if (!style.inputEnabled) {
              this.inputEnabled = style.inputEnabled;
            }
            if (null != style.text) {
              this.text = style.text;
            }
            if (style.matchedButtonTextColour >= 0) {
              this.matchedButtonTextColour = style.matchedButtonTextColour;
            }
            if (0 <= style.disabledTextColour) {
              this.disabledTextColour = style.disabledTextColour;
            }
            if (style.selectedSkinSprites != null) {
              this.selectedSkinSprites = style.selectedSkinSprites;
            }
            if (style.heldPressSkinSprites != null) {
              this.heldPressSkinSprites = style.heldPressSkinSprites;
            }
            if (null != style.matchedButtonSprite) {
              this.matchedButtonSprite = style.matchedButtonSprite;
            }
            if (-2147483648 != style.selectedOffsetX) {
              this.selectedOffsetX = style.selectedOffsetX;
            }
            stackIn_72_1 = (this.field_M) && (style.focused);
            this.focused = stackIn_72_1;
            if (style.heldPressOffsetY != -2147483648) {
              this.heldPressOffsetY = style.heldPressOffsetY;
            }
            if (style.draggable) {
              this.draggable = style.draggable;
            }
            if (style.matchedButtonOffsetX != -2147483648) {
              this.matchedButtonOffsetX = style.matchedButtonOffsetX;
            }
            this.selectWhenFocused = style.selectWhenFocused;
            if (style.contentOffsetY != 0) {
              this.contentOffsetY = style.contentOffsetY;
            }
            if (0 != style.verticalAlignment) {
              this.verticalAlignment = style.verticalAlignment;
            }
            if (style.matchedButtonOffsetY != -2147483648) {
              this.matchedButtonOffsetY = style.matchedButtonOffsetY;
            }
            if (style.heldPressOffsetX != -2147483648) {
              this.heldPressOffsetX = style.heldPressOffsetX;
            }
            if (style.horizontalAlignment != 0) {
              this.horizontalAlignment = style.horizontalAlignment;
            }
            if (style.selectedOffsetY != -2147483648) {
              this.selectedOffsetY = style.selectedOffsetY;
            }
            if (style.contentOffsetX != 0) {
              this.contentOffsetX = style.contentOffsetX;
            }
          }
          if (obfuscationGuard != 0) {
            this.field_M = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_101_0 = var3;
          stackIn_101_1 = new StringBuilder().append("je.TA(").append(obfuscationGuard).append(',');
          if (style == null) {
            stackIn_102_2 = "null";
          } else {
            stackIn_102_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_101_0), ((StringBuilder) (Object) stackIn_101_1).append(stackIn_102_2).append(')').toString());
        }
    }

    final void addChild(ClientUiComponent child, int obfuscationGuard) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (null == this.children) {
            this.children = new NodeDeque();
          }
          this.children.addLast((byte) -119, (IntrusiveNode) (child));
          if (obfuscationGuard < 36) {
            this.field_M = true;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("je.MA(");
          if (child == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(')').toString());
        }
    }

    final void layoutVerticalContent(boolean preserveChildLayout, int viewportHeight, int childSpacing, int obfuscationGuard) {
        ClientUiComponent child = null;
        int stackEndY = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int maximumTargetScroll;
        if (obfuscationGuard != -1379) {
          return;
        }
        int currentScroll = -this.y;
        int targetScroll = -this.pendingYDelta + currentScroll;
        int currentHeight = this.height;
        int targetHeight = this.pendingHeightDelta + currentHeight;
        if (!preserveChildLayout) {
          stackEndY = 0;
          child = (ClientUiComponent) (this.children.first((byte) 124));
          while (child != null) {
            child.pendingYDelta = -child.y + stackEndY;
            stackEndY = stackEndY + (childSpacing + (child.pendingHeightDelta + child.height));
            child = (ClientUiComponent) (this.children.next((byte) 123));
          }
          targetHeight = stackEndY - childSpacing;
        }
        maximumTargetScroll = -viewportHeight + targetHeight;
        if (maximumTargetScroll < targetScroll) {
          targetScroll = maximumTargetScroll;
        }
        if (targetScroll < 0) {
          targetScroll = 0;
        }
        int maximumCurrentScroll = currentHeight - viewportHeight;
        if (maximumCurrentScroll < currentScroll) {
          currentScroll = maximumCurrentScroll;
        }
        if (currentScroll < 0) {
          currentScroll = 0;
        }
        this.height = currentHeight;
        this.pendingYDelta = -targetScroll + currentScroll;
        this.pendingHeightDelta = -currentHeight + targetHeight;
        this.y = -currentScroll;
    }

    ClientUiComponent(long key, ClientUiComponent style) {
        this(key, style, 0, 0, 0, 0, (String) null);
    }

    private final void updateInputTree(boolean inputAllowed, boolean capturePress, int parentY, int parentHeight, int parentWidth, int parentX) {
        boolean pointerInsideClip = false;
        boolean buttonMatches = false;
        int xStep;
        int savedClipLeft;
        int savedClipTop;
        int savedClipRight;
        int savedClipBottom;
        int pressCaptured;
        ClientUiComponent child;
        int obfuscationControl;
        int yStep;
        int widthStep;
        int heightStep;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.pendingXDelta > 0) {
          xStep = -(-this.pendingXDelta >> 2);
        } else {
          xStep = this.pendingXDelta >> 2;
        }
        this.pendingXDelta = this.pendingXDelta - xStep;
        this.x = this.x + xStep;
        if (0 < this.pendingYDelta) {
          yStep = -(-this.pendingYDelta >> 2);
        } else {
          yStep = this.pendingYDelta >> 2;
        }
        this.y = this.y + yStep;
        this.pendingYDelta = this.pendingYDelta - yStep;
        if (this.pendingWidthDelta > 0) {
          widthStep = -(-this.pendingWidthDelta >> 2);
        } else {
          widthStep = this.pendingWidthDelta >> 2;
        }
        this.width = this.width + widthStep;
        this.pendingWidthDelta = this.pendingWidthDelta - widthStep;
        if (this.pendingHeightDelta > 0) {
          heightStep = -(-this.pendingHeightDelta >> 2);
        } else {
          heightStep = this.pendingHeightDelta >> 2;
        }
        this.screenX = parentX + this.x;
        inputAllowed = inputAllowed & this.inputEnabled;
        this.height = this.height + heightStep;
        this.pendingHeightDelta = this.pendingHeightDelta - heightStep;
        this.screenY = this.y + parentY;
        savedClipLeft = SoftwareRaster.clipLeft;
        savedClipTop = SoftwareRaster.clipTop;
        savedClipRight = SoftwareRaster.clipRight;
        savedClipBottom = SoftwareRaster.clipBottom;
        SoftwareRaster.b(this.screenX, this.screenY, this.screenX + this.width, this.screenY + this.height);
        pressCaptured = capturePress ? 1 : 0;
        if (!SectorCacheStore.field_e &&
          inputAllowed &&
          DeployEvent.pointerPressButton != 0 &&
          SoftwareRaster.clipLeft <= BattleTutorial.pointerPressX &&
          BattleTutorial.pointerPressX < SoftwareRaster.clipRight &&
          TeleportAction.pointerPressY >= SoftwareRaster.clipTop &&
          TeleportAction.pointerPressY < SoftwareRaster.clipBottom) {
          this.pressedButton = DeployEvent.pointerPressButton;
          this.heldPressButton = DeployEvent.pointerPressButton;
          this.dragGrabX = -this.screenX + BattleTutorial.pointerPressX;
          pressCaptured = 1;
          this.dragGrabY = -this.screenY + TeleportAction.pointerPressY;
        } else {
          this.pressedButton = 0;
          if (DeployEvent.pointerPressButton != 0) {
            this.heldPressButton = 0;
          }
        }
        pointerInsideClip = (!QuickChatCategoryRepository.field_f) && (SoftwareRaster.clipLeft <= AiPlanningStrategy.pointerX) && (SoftwareRaster.clipRight > AiPlanningStrategy.pointerX) && (SoftwareRaster.clipTop <= ko.pointerY) && (SoftwareRaster.clipBottom > ko.pointerY);
        this.hovered = pointerInsideClip;
        if (ro.pointerButton == 0) {
          this.heldPressButton = 0;
        }
        buttonMatches = (this.hovered) && (ro.pointerButton == this.heldPressButton) && (inputAllowed);
        this.heldButtonMatches = buttonMatches;
        if (null != this.children) {
          child = (ClientUiComponent) (this.children.last((byte) -82));
          while (child != null) {
            child.updateInputTree(inputAllowed, capturePress, this.screenY, this.height, this.width, this.screenX);
            child = (ClientUiComponent) (this.children.previous((byte) 88));
          }
        }
        if (pressCaptured != 0) {
          SectorCacheStore.field_e = true;
        }
        if (this.hovered) {
          QuickChatCategoryRepository.field_f = true;
        }
        SoftwareRaster.f(savedClipLeft, savedClipTop, savedClipRight, savedClipBottom);
        if (this.heldPressButton != 0 &&
          this.draggable) {
          this.x = -this.dragGrabX + AiPlanningStrategy.pointerX - parentX;
          this.y = -this.dragGrabY + ko.pointerY - parentY;
          if (0 > this.x) {
            this.x = 0;
          }
          if (this.y < 0) {
            this.y = 0;
          }
          if (this.x > parentWidth - this.width) {
            this.x = -this.width + parentWidth;
          }
          this.pendingYDelta = 0;
          if (this.y > parentHeight - this.height) {
            this.y = parentHeight - this.height;
          }
          this.screenX = this.x + parentX;
          this.pendingXDelta = 0;
          this.screenY = parentY + this.y;
        }
    }

    final void setFocusedComponent(int obfuscationGuard, ClientUiComponent focusedComponent) {
        NodeIterator var3 = null;
        ClientUiComponent var4 = null;
        int var5 = 0;
        boolean stackIn_11_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (obfuscationGuard != 3) {
            this.layoutVerticalContent(true, 119, -41, -35);
          }
          if (null != this.children) {
            var3 = new NodeIterator(this.children);
            var4 = (ClientUiComponent) (var3.first(obfuscationGuard + 47));
            while (var4 != null) {
              var4.setFocusedComponent(obfuscationGuard ^ 0, focusedComponent);
              var4 = (ClientUiComponent) (var3.next(obfuscationGuard + 47));
            }
          }
          stackIn_11_1 = (focusedComponent == this);
          this.focused = stackIn_11_1;
          if (this.selectWhenFocused) {
            this.selected = this.focused;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_16_0 = var3_ref;
          stackIn_16_1 = new StringBuilder().append("je.DB(").append(obfuscationGuard).append(',');
          if (focusedComponent == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1) {
        int var6 = 0;
        int var11 = 0;
        int stackIn_4_0 = 0;
        ClientUiComponent stackIn_6_0;
        int stackIn_6_1;
        int stackIn_6_2;
        int stackIn_6_3;
        int stackIn_7_4 = 0;
        int stackIn_43_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        ClientUiComponent var7 = null;
        int var7_int = 0;
        int var8 = 0;
        ClientUiComponent var8_ref_je = null;
        IconTextComponent var9 = null;
        int var9_int = 0;
        int var10 = 0;
        IconTextComponent var10_ref_nf = null;
        int var12 = 0;
        int var13 = 0;
        ClientUiComponent var14 = null;
        var13 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          tq.field_c = SoftwareRaster.width;
          CachedArchiveProvider.field_p = SoftwareRaster.height;
          if (param1) {
            stackIn_4_0 = PreparedAction.field_r;
          } else {
            stackIn_4_0 = InstructionsPanel.field_D;
          }
          AnimationSequence.a(stackIn_4_0, -106);
          ij.field_w.setLayout(-40 + lk.field_a.height - 2, (byte) -125, 0, lk.field_a.width, 0);
          gg.field_E.setBounds(jn.field_d, -20500, eb.field_c.width, 0, 0);
          stackIn_6_0 = di.field_l;
          stackIn_6_1 = 18;
          stackIn_6_2 = -20500;
          stackIn_6_3 = eb.field_c.width;
          if (fh.field_c) {
            stackIn_7_4 = 2 + jn.field_c + 42;
          } else {
            stackIn_7_4 = 0;
          }
          ((ClientUiComponent) (Object) stackIn_6_0).setBounds(stackIn_6_1, stackIn_6_2, stackIn_6_3 - stackIn_7_4, 2 + jn.field_d, 0);
          SpellCastEvent.field_D.setBounds(18, -20500, 42 + jn.field_c, 2 + jn.field_d, -40 + (eb.field_c.width - jn.field_c - 2));
          bu.field_a.setLayout(0, false, eb.field_c.width, 2, jn.field_c, 20 + (2 + jn.field_d), -20 + (-2 + (-jn.field_d + eb.field_c.height)));
          SocialListPanel.field_Lb.setBounds(40, -20500, lk.field_a.width, lk.field_a.height - 40, 0);
          kd.field_F.setBounds(30, -20500, pd.field_c.width, 0, 0);
          if (param0 < 13) {
            return;
          }
          vc.field_l.setBounds(-2 + pd.field_c.height - 70, -20500, pd.field_c.width, 30, 0);
          var2_int = 3 + tq.gameOptionCount;
          if (2 > lm.field_e.length) {
            var2_int--;
          }
          if (param1) {
            var2_int--;
          }
          var3 = -2 + (-15 + (-5 + vc.field_l.height + (2 + (1 + var2_int) / 2))) / (var2_int + 1);
          if (var3 > 30) {
            var3 = 30;
          }
          var4 = -5 + (vc.field_l.height - (5 + (var3 + 2) * var2_int));
          if (var4 > 40) {
            var4 = 40;
          }
          BattleTutorial.field_d.setBounds(var4, -20500, vc.field_l.width - 5 - 5, 5, 5);
          var5 = 5 + var4 + 2;
          for (var6 = 0; 4 + tq.gameOptionCount > var6; var6++) {
            if ((var6 != 1 ||
              !(lm.field_e.length < 2)) && (3 != var6 ||
              !(1 >= BoundedFile.field_h))) {
              if (!param1 &&
                var6 == 3) {
                var7 = KingBlackDragonEvent.field_z[var6];
                KingBlackDragonEvent.field_z[var6].height = 0;
                var7.width = 0;
                for (var8 = 0; var8 < pu.field_k[var6].length; var8++) {
                  if (null != pu.field_k[var6][var8]) {
                    var9 = pu.field_k[var6][var8];
                    pu.field_k[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else if (param1 &&
                var6 == 0) {
                var14 = KingBlackDragonEvent.field_z[var6];
                var7 = var14;
                KingBlackDragonEvent.field_z[var6].height = 0;
                var14.width = 0;
                for (var8 = 0; pu.field_k[var6].length > var8; var8++) {
                  if (null != pu.field_k[var6][var8]) {
                    var9 = pu.field_k[var6][var8];
                    pu.field_k[var6][var8].height = 0;
                    var9.width = 0;
                  }
                }
              } else {
                if (param1) {
                  if (var6 >= 4) {
                    if (EventPresenter.field_o != null) {
                      stackIn_43_0 = (EventPresenter.field_o[var6 - 4]) ? 1 : 0;
                    } else {
                      stackIn_43_0 = 0;
                    }
                  } else {
                    stackIn_43_0 = 0;
                  }
                } else {
                  stackIn_43_0 = 0;
                }
                var7_int = stackIn_43_0;
                if (var7_int != 0) {
                  var8_ref_je = KingBlackDragonEvent.field_z[var6];
                  KingBlackDragonEvent.field_z[var6].height = 0;
                  var8_ref_je.width = 0;
                  for (var9_int = 0; var9_int < pu.field_k[var6].length; var9_int++) {
                    if (pu.field_k[var6][var9_int] != null) {
                      var10_ref_nf = pu.field_k[var6][var9_int];
                      pu.field_k[var6][var9_int].height = 0;
                      var10_ref_nf.width = 0;
                    }
                  }
                } else {
                  KingBlackDragonEvent.field_z[var6].setBounds(var3, -20500, 103, var5, 5);
                  var8 = 110;
                  if (param1) {
                    pu.field_k[var6][0].setLayout(var3, 2, -30061, 38, var5, var8, io.field_n);
                    var8 += 40;
                  } else {
                    if (pu.field_k[var6][0] != null) {
                      var9 = pu.field_k[var6][0];
                      pu.field_k[var6][0].height = 0;
                      var9.width = 0;
                    }
                  }
                  var9_int = -5 + (pd.field_c.width + (-var8 + 2));
                  var10 = pu.field_k[var6].length - 1;
                  for (var11 = 0; var10 > var11; var11++) {
                    var12 = var11 * var9_int / var10;
                    pu.field_k[var6][var11 + 1].setLayout(var3, 2, -30061, var9_int * (1 + var11) / var10 - 2 - var12, var5, var8 + var12, io.field_n);
                  }
                  var5 = var5 + (var3 + 2);
                }
              }
            }
          }
          ta.field_R.setBounds(-134 + (SoftwareRaster.height - 10), -20500, 360, 10, SoftwareRaster.width - 360 >> 1);
          bk.field_f.setBounds(24, -20500, ta.field_R.width, 0, 0);
          df.field_K.setBounds(-24 + ta.field_R.height, -20500, ta.field_R.width, 24, 0);
          df.field_K.skinSprites = tq.a(11579568, false, df.field_K.height, 1, 3, 8421504);
          IconTextComponent.field_Kb.setBounds(df.field_K.height - 36, -20500, df.field_K.width - 10, 5, 5);
          dv.field_m.setBounds(24, -20500, 80, -24 + df.field_K.height - 5, (df.field_K.width - 80) / 2);
          mj.a((byte) 120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "je.CB(" + param0 + ',' + param1 + ')');
        }
    }

    final void updateInput(boolean inputAllowed, boolean enableCapture) {
        SectorCacheStore.field_e = !enableCapture ? true : false;
        QuickChatCategoryRepository.field_f = !enableCapture ? true : false;
        this.updateInputTree(inputAllowed, false, 0, SoftwareRaster.height, SoftwareRaster.width, 0);
    }

    ClientUiComponent(long key, ClientUiComponent style, String text) {
        this(key, style, 0, 0, 0, 0, text);
    }

    final void inheritVisualStateForDescendants(int obfuscationGuard) {
        ClientUiComponent var4 = null;
        int var3 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (null != this.children) {
          var4 = (ClientUiComponent) (this.children.last((byte) -112));
          while (var4 != null) {
            var4.inheritParentVisualState = true;
            var4.inheritVisualStateForDescendants(-10027);
            var4 = (ClientUiComponent) (this.children.previous((byte) -104));
          }
        }
        if (obfuscationGuard != -10027) {
          this.children = (NodeDeque) null;
        }
    }

    final void positionAfter(ClientUiComponent child, boolean obfuscationGuard, int spacing, ClientUiComponent previousSibling) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (!obfuscationGuard) {
            ClientUiComponent.a(-53, false);
          }
          if (previousSibling == null) {
            child.pendingYDelta = 0;
            child.y = 0;
          } else {
            child.pendingYDelta = previousSibling.pendingHeightDelta + previousSibling.pendingYDelta;
            child.y = previousSibling.y - (-previousSibling.height - spacing);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("je.PA(");
          if (child == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(obfuscationGuard).append(',').append(spacing).append(',');
          if (previousSibling == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    private final void drawTree(byte obfuscationGuard, int parentHeight, boolean blinkOn, int parentWidth, int parentY, boolean inheritedHeldPress, boolean inheritedFocus, boolean inheritedSelection, int parentX, boolean inputAllowed, boolean inheritedButtonMatch) {
        boolean stackIn_5_0 = false;
        int var12;
        int var13;
        int var14;
        int var15;
        RgbSprite[] var16;
        RgbSprite var17;
        int var18;
        int var19;
        int var20;
        int var21;
        int var22;
        int var23_int;
        String var23;
        ClientUiComponent var23_ref;
        int var24;
        int var25;
        String var26;
        String var23Lifetime1;
        String var23Lifetime2;
        var25 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.screenX = this.x + parentX;
        this.screenY = this.y + parentY;
        var12 = SoftwareRaster.clipLeft;
        var13 = SoftwareRaster.clipTop;
        var14 = SoftwareRaster.clipRight;
        var15 = SoftwareRaster.clipBottom;
        SoftwareRaster.b(this.screenX, this.screenY, this.width + this.screenX, this.height + this.screenY);
        inputAllowed = inputAllowed & this.inputEnabled;
        if (!this.inheritParentVisualState) {
          inheritedSelection = this.selected;
          inheritedButtonMatch = this.heldButtonMatches;
          stackIn_5_0 = (0 != this.heldPressButton);
          inheritedHeldPress = stackIn_5_0;
        }
        if (obfuscationGuard != -26) {
          return;
        }
        var16 = this.skinSprites;
        var17 = this.sprite;
        var18 = this.textColour;
        var19 = 0;
        if (!inputAllowed) {
          if (this.disabledTextColour >= 0) {
            var18 = this.disabledTextColour;
          }
          if (this.disabledSprite != null) {
            var17 = this.disabledSprite;
          }
          if (null != this.disabledSkinSprites) {
            var16 = this.disabledSkinSprites;
          }
        }
        var20 = 0;
        if (inheritedButtonMatch) {
          if (null != this.matchedButtonSkinSprites) {
            var16 = this.matchedButtonSkinSprites;
          }
          if (null != this.matchedButtonSprite) {
            var17 = this.matchedButtonSprite;
          }
          if (-2147483648 != this.matchedButtonOffsetX) {
            var19 = this.matchedButtonOffsetX;
          }
          if (-2147483648 != this.matchedButtonOffsetY) {
            var20 = this.matchedButtonOffsetY;
          }
          if (this.matchedButtonTextColour >= 0) {
            var18 = this.matchedButtonTextColour;
          }
        }
        if (inheritedHeldPress) {
          if (null != this.heldPressSprite) {
            var17 = this.heldPressSprite;
          }
          if (this.heldPressOffsetY != -2147483648) {
            var20 = this.heldPressOffsetY;
          }
          if (null != this.heldPressSkinSprites) {
            var16 = this.heldPressSkinSprites;
          }
          if (this.heldPressOffsetX != -2147483648) {
            var19 = this.heldPressOffsetX;
          }
          if (this.heldPressTextColour >= 0) {
            var18 = this.heldPressTextColour;
          }
        }
        if (inheritedSelection) {
          if (this.selectedSkinSprites != null) {
            var16 = this.selectedSkinSprites;
          }
          if (this.selectedOffsetX != -2147483648) {
            var19 = this.selectedOffsetX;
          }
          if (-2147483648 != this.selectedOffsetY) {
            var20 = this.selectedOffsetY;
          }
          if (null != this.selectedSprite) {
            var17 = this.selectedSprite;
          }
          if (this.selectedTextColour >= 0) {
            var18 = this.selectedTextColour;
          }
        }
        var21 = this.contentOffsetX + var19;
        var22 = var20 + this.contentOffsetY;
        if (this.drawSkinInParentBounds) {
          ReportAbuseDialog.drawNineSlice(var16, parentHeight, parentX, (byte) -47, parentY, parentWidth);
        } else {
          ReportAbuseDialog.drawNineSlice(var16, this.height, this.screenX, (byte) -47, this.screenY, this.width);
        }
        if (var17 != null) {
          var23_int = var21 + this.screenX;
          if (1 == this.horizontalAlignment) {
            var23_int = var23_int + (this.width - var17.canvasWidth) / 2;
          }
          var24 = this.screenY + var22;
          if (this.verticalAlignment == 1) {
            var24 = var24 + (-var17.canvasHeight + this.height) / 2;
          }
          if (2 == this.horizontalAlignment) {
            var23_int = var23_int + (this.width - var17.canvasWidth);
          }
          if (2 == this.verticalAlignment) {
            var24 = var24 + (this.height - var17.canvasHeight);
          }
          if (256 <= this.spriteOpacity) {
            var17.g(var23_int, var24);
          } else {
            var17.e(var23_int, var24, this.spriteOpacity);
          }
        }
        boolean decompiledFrameRemainder0 = true;
        if (null != this.text &&
          this.font != null) {
          var26 = this.text;
          var23 = var26;
          var23Lifetime1 = var26;
          var23Lifetime2 = var26;
          if (blinkOn &&
            null != this.blinkTextSuffix) {
            var23Lifetime2 = var26 + this.blinkTextSuffix;
          }
          if (this.font.a(var23Lifetime2) <= this.width - 2 * this.textHorizontalPadding &&
            var23Lifetime2.indexOf("<br>") < 0) {
            if (this.verticalAlignment != 1) {
              if (this.verticalAlignment == 2) {
                var22 = var22 + (-this.font.field_H + (-this.font.field_L + this.height));
              }
            } else {
              var22 = var22 + (-this.font.field_L + this.height - this.font.field_H) / 2;
            }
            if (this.horizontalAlignment == 0) {
              this.font.b(var23Lifetime2, this.textHorizontalPadding + this.screenX + var21, this.font.field_H + (this.screenY + var22), var18, -1, this.textOpacity);
            } else {
              if (this.horizontalAlignment == 1) {
                this.font.a(var23Lifetime2, var21 + (this.screenX + this.textHorizontalPadding + (this.width - 2 * this.textHorizontalPadding) / 2), var22 + (this.screenY + this.font.field_H), var18, -1, this.textOpacity);
              } else {
                if (2 != this.horizontalAlignment) {
                  this.font.a(var23Lifetime2, this.screenX + this.textHorizontalPadding + var21, var22 + this.screenY, -(2 * this.textHorizontalPadding) + this.width, this.height, var18, -1, this.textOpacity, this.horizontalAlignment, this.verticalAlignment, this.textLineSpacing);
                } else {
                  this.font.c(var23Lifetime2, this.screenX + this.textHorizontalPadding + var21 - (-this.width + this.textHorizontalPadding * 2), var22 + this.screenY + this.font.field_H, var18, -1, this.textOpacity);
                }
              }
            }
            decompiledFrameRemainder0 = false;
          }
          else {
            this.font.a(var23Lifetime2, this.textHorizontalPadding + this.screenX + var21, var22 + this.screenY, -(2 * this.textHorizontalPadding) + this.width, this.height, var18, -1, this.textOpacity, this.horizontalAlignment, this.verticalAlignment, this.textLineSpacing);
          }
        }
        if (this.children != null) {
          var23_ref = (ClientUiComponent) (this.children.first((byte) 118));
          while (var23_ref != null) {
            var23_ref.drawTree((byte) -26, this.height, blinkOn, this.width, var20 + this.screenY, inheritedHeldPress, this.focused, inheritedSelection, this.screenX + var19, inputAllowed, inheritedButtonMatch);
            var23_ref = (ClientUiComponent) (this.children.next((byte) 123));
          }
        }
        SoftwareRaster.f(var12, var13, var14, var15);
        return;
    }

    final int getPreferredWidth(int obfuscationGuard) {
        int var2 = -17 % ((30 - obfuscationGuard) / 58);
        return this.measureContentWidth(true, 2147483647);
    }

    final void setBounds(int height, int obfuscationGuard, int width, int y, int x) {
        this.y = y;
        this.pendingHeightDelta = 0;
        this.width = width;
        this.pendingXDelta = 0;
        if (obfuscationGuard != -20500) {
          return;
        }
        this.pendingYDelta = 0;
        this.pendingWidthDelta = 0;
        this.x = x;
        this.height = height;
    }

    final int measureContentWidth(boolean obfuscationGuard, int maximumTextWidth) {
        ClientUiComponent var4 = null;
        int var5 = 0;
        int var4_int = 0;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        int var4_intLifetime1;
        if (!obfuscationGuard) {
          this.y = -10;
        }
        int var3 = 0;
        if (null != this.text &&
          null != this.font) {
          var4_int = this.font.a(this.text, maximumTextWidth);
          if (var3 < var4_int) {
            var3 = var4_int;
          }
        }
        if (this.sprite != null) {
          var4_intLifetime1 = this.sprite.canvasWidth;
          if (var3 < var4_intLifetime1) {
            var3 = var4_intLifetime1;
          }
        }
        if (this.children != null) {
          var4 = (ClientUiComponent) (this.children.first((byte) 93));
          while (var4 != null) {
            var5 = var4.x + var4.width;
            if (var5 > var3) {
              var3 = var5;
            }
            var4 = (ClientUiComponent) (this.children.next((byte) 123));
          }
        }
        return var3;
    }

    public static void h(int param0) {
        field_Q = null;
        int var1 = 52 / ((param0 + 55) / 44);
        field_K = (int[][]) null;
        field_zb = null;
        field_lb = null;
    }

    public ClientUiComponent() {
        this.disabledTextColour = -1;
        this.selectWhenFocused = false;
        this.textOpacity = 256;
        this.matchedButtonOffsetX = -2147483648;
        this.matchedButtonTextColour = -1;
        this.selectedOffsetX = -2147483648;
        this.heldPressOffsetX = -2147483648;
        this.field_M = false;
        this.heldPressTextColour = -1;
        this.matchedButtonOffsetY = -2147483648;
        this.heldPressOffsetY = -2147483648;
        this.inputEnabled = true;
        this.focused = false;
        this.spriteOpacity = 256;
        this.selectedTextColour = -1;
        this.selectedOffsetY = -2147483648;
    }

    ClientUiComponent(long key, ClientUiComponent style, int x, int y, int width, int height, String text) {
        this.disabledTextColour = -1;
        this.selectWhenFocused = false;
        this.textOpacity = 256;
        this.matchedButtonOffsetX = -2147483648;
        this.matchedButtonTextColour = -1;
        this.selectedOffsetX = -2147483648;
        this.heldPressOffsetX = -2147483648;
        this.field_M = false;
        this.heldPressTextColour = -1;
        this.matchedButtonOffsetY = -2147483648;
        this.heldPressOffsetY = -2147483648;
        this.inputEnabled = true;
        this.focused = false;
        this.spriteOpacity = 256;
        this.selectedTextColour = -1;
        this.selectedOffsetY = -2147483648;
        try {
          this.height = height;
          this.x = x;
          this.y = y;
          this.width = width;
          this.key = key;
          this.applyStyle(0, style);
          if (text != null) {
            this.text = text;
          }
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "je.<init>(" + key + ',' + (style != null ? "{...}" : "null") + ',' + x + ',' + y + ',' + width + ',' + height + ',' + (text != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_lb = "Wizards and warriors, foul demons and brutal orks, vicious goblins and fearless dwarves: all are yours to summon and command.";
        field_zb = "Private";
        field_K = new int[][]{new int[]{35, 0}, new int[]{42, 42}, new int[]{35, 0}, new int[]{13, 40}, new int[]{33, 48}, new int[]{25, 0}, new int[]{28, 0}, new int[]{50, 41}, new int[]{43, 0}, new int[]{30, 0}, new int[]{50, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{32, 0}, new int[]{36, 36}, new int[]{30, 0}, new int[]{24, 39}, new int[]{50, 41}, new int[]{38, 38}, new int[]{35, 0}, new int[]{20, 0}, new int[]{35, 0}, new int[]{50, 41}, new int[]{33, 0}, new int[]{45, 0}, new int[]{25, 38}, new int[]{49, 0}, new int[]{30, 0}, new int[]{24, 0}, new int[]{25, 0}, new int[]{37, 0}, new int[]{58, 0}, new int[]{50, 41}, new int[]{35, 0}, new int[]{35, 0}, new int[]{51, 0}, new int[]{50, 0}, new int[]{11, 11}, new int[]{20, 20}, new int[]{35, 0}, new int[]{38, 0}, new int[]{30, 0}, new int[]{75, 0}, new int[]{24, 0}, new int[]{24, 0}, new int[]{20, 0}, new int[]{58, 0}, new int[]{37, 0}, new int[]{25, 38}, new int[]{37, 0}, new int[]{50, 0}, new int[]{40, 35}, new int[]{31, 0}, new int[]{28, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{44, 0}, new int[]{53, 0}, new int[]{53, 0}, new int[]{41, 0}, new int[]{53, 0}, new int[]{30, 0}, new int[]{38, 0}, new int[]{47, 0}, new int[]{63, 0}, new int[]{32, 0}, new int[]{22, 0}, new int[]{43, 0}, new int[]{36, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{25, 0}, new int[]{50, 41}, new int[]{33, 48}, new int[]{18, 18}, new int[]{1, 0}, new int[]{24, 0}, new int[]{24, 39}, new int[]{25, 38}, new int[]{25, 38}, new int[]{33, 48}, new int[]{50, 41}, new int[]{34, 4}, new int[]{25, 3}, new int[]{35, 21}, new int[]{19, 3}, new int[]{18, 2}, new int[]{25, 6}, new int[]{35, 21}};
    }
}
