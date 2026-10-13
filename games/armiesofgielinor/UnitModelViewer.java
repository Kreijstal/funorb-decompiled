/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class UnitModelViewer {
    private BinaryBitmapFont font;
    private int previewCenterY;
    static int[][] field_o;
    static String field_d;
    private int selectedUnitType;
    static int campaignMetricMutationCounter;
    private String[] unitOptions;
    private int[] colours;
    static int decodedChatIconId;
    static String field_w;
    private int selectedAnimationSlot;
    private SpriteDropdownControl unitDropdown;
    static boolean field_i;
    private SpriteFramedLabel unitLabel;
    private int previewTilt;
    private RgbSprite[] arrowSprites;
    private RgbSprite[] frameSprites;
    static int field_q;
    private int previewYaw;
    private SpriteDropdownControl animationDropdown;
    private int previewCenterX;
    private SpriteFramedLabel animationLabel;
    private String[] animationOptions;
    private UnitAnimationPreview preview;

    private final void drawDropdowns(byte obfuscationGuard) {
        if (this.unitDropdown.isInputEnabled(260)) {
          this.animationDropdown.drawControl((byte) 126);
          this.unitDropdown.drawControl((byte) 127);
        } else {
          if (this.animationDropdown.isInputEnabled(260)) {
            this.unitDropdown.drawControl((byte) -53);
            this.animationDropdown.drawControl((byte) 1);
          }
        }
        if (obfuscationGuard != -25) {
          this.previewCenterX = 40;
          return;
        }
    }

    private final void selectUnit(int unitType, byte obfuscationGuard) {
        int discardedControlWidth = 0;
        int obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        this.selectedUnitType = unitType;
        this.unitDropdown.setSelectedIndex(0, this.selectedUnitType);
        this.preview.selectModel(0, this.selectedUnitType);
        this.preview.showPreview(true);
        this.animationOptions = new String[ContentTransitionDialog.unitAnimationSlotNames.length + 1];
        int animationNameIndex = 0;
        if (obfuscationGuard != 39) {
          discardedControlWidth = this.controlWidth(-92, 45);
        }
        while (ContentTransitionDialog.unitAnimationSlotNames.length > animationNameIndex) {
          this.animationOptions[animationNameIndex] = ContentTransitionDialog.unitAnimationSlotNames[animationNameIndex];
          animationNameIndex++;
        }
        this.animationOptions[ContentTransitionDialog.unitAnimationSlotNames.length] = "special";
        this.animationDropdown.setOptions(this.animationOptions, -29799);
        this.selectAnimation(false, 0);
    }

    private final void updateRotationKeys(int obfuscationGuard) {
        if (obfuscationGuard <= 116) {
          this.drawDropdowns((byte) -94);
        }
        if (br.heldKeys[96]) {
          this.previewYaw = this.previewYaw + 5;
        }
        if (br.heldKeys[97]) {
          this.previewYaw = this.previewYaw - 5;
        }
        if (br.heldKeys[98]) {
          this.previewTilt = this.previewTilt + 2;
        }
        if (br.heldKeys[99]) {
          this.previewTilt = this.previewTilt - 2;
        }
    }

    private final void applyUnitSelection(byte obfuscationGuard) {
        int var2 = this.unitDropdown.getSelectedIndex(5);
        if (var2 == this.selectedUnitType) {
          return;
        }
        this.selectUnit(var2, (byte) 39);
        if (obfuscationGuard != 111) {
          return;
        }
    }

    private final void drawReturnHint(boolean obfuscationGuard) {
        if (obfuscationGuard) {
          this.frameSprites = (RgbSprite[]) null;
        }
        int hintCenterX = so.field_b.field_a >> 1;
        int hintBaselineY = -this.font.maxAscent + (so.field_b.field_g - (this.font.maxDescent << 1));
        int hintColour = this.colours[0];
        this.font.drawCentered("Press Esc to return to the main menu", hintCenterX, hintBaselineY, hintColour, -1);
    }

    private final int controlHeight(byte obfuscationGuard, int controlIndex) {
        if (obfuscationGuard != -47) {
          this.previewCenterX = 67;
        }
        if (controlIndex == 0) {
          return this.unitLabel.getHeight((byte) -50);
        }
        if (controlIndex == 1) {
          return this.unitDropdown.getHeight(true);
        }
        if (controlIndex == 2) {
          return this.animationLabel.getHeight((byte) -11);
        }
        if (controlIndex == 3) {
          return this.animationDropdown.getHeight(true);
        }
        return 0;
    }

    private final void updateDropdownInput(boolean pressed, boolean held, int obfuscationGuard, int pointerY, int pointerX, int wheelDelta) {
        this.routeDropdownFocus(obfuscationGuard ^ 9, pointerY, pointerX);
        if (obfuscationGuard != 8) {
          this.selectedAnimationSlot = 40;
        }
        if (this.unitDropdown.isInputEnabled(obfuscationGuard ^ 268)) {
          this.unitDropdown.updateInput(pressed, -18596, pointerY, pointerX, held, wheelDelta);
        }
        if (this.animationDropdown.isInputEnabled(260)) {
          this.animationDropdown.updateInput(pressed, obfuscationGuard ^ -18604, pointerY, pointerX, held, wheelDelta);
        }
        if (this.unitDropdown.hasInputChanged((byte) 111) ||
          this.animationDropdown.hasInputChanged((byte) 74)) {
          this.layoutControls(0, so.field_b.field_a >> 1, so.field_b.field_a >> 1, so.field_b.field_g, 0);
          return;
        }
    }

    private final int controlWidth(int obfuscationGuard, int controlIndex) {
        if (controlIndex == 0) {
          return this.unitLabel.getWidth(-29408);
        }
        if (1 == controlIndex) {
          return this.unitDropdown.getWidth(-18332);
        }
        if (controlIndex == 2) {
          return this.animationLabel.getWidth(-29408);
        }
        int guardRemainder = 19 % ((39 - obfuscationGuard) / 62);
        if (controlIndex != 3) {
          return 0;
        }
        return this.animationDropdown.getWidth(-18332);
    }

    final void updateInput(int obfuscationGuard, boolean held, boolean pressed, int pointerX, int pointerY, int wheelDelta) {
        this.updateDropdownInput(pressed, held, 8, pointerY, pointerX, wheelDelta);
        if (obfuscationGuard <= 66) {
          this.drawReturnHint(true);
        }
        this.applyUnitSelection((byte) 111);
        this.applyAnimationSelection(125);
        this.advancePreview((byte) -95);
    }

    final static char a(int param0, char param1) {
        if (param1 != 181 &&
          param1 != 402) {
          if (param0 != 98) {
            UnitModelViewer.a(39, 'ﾫ');
          }
          return Character.toTitleCase(param1);
        }
        return param1;
    }

    public static void b(int param0) {
        field_o = (int[][]) null;
        field_w = null;
        field_d = null;
        if (param0 != 1017) {
          UnitModelViewer.b(44);
        }
    }

    final static void a(int param0, boolean param1) {
        int var2_int = 0;
        MapTile var3 = null;
        Unit var4 = null;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          if (param1) {
            UnitModelViewer.a(-115, false);
          }
          for (var2_int = 0; var2_int < vs.field_e.length; var2_int++) {
            var3 = vs.field_e[var2_int];
            var4 = var3.occupant;
            if (var4 != null &&
              param0 == var4.ownerPlayer) {
              ResourceArchive.field_a.setFocusTile((byte) 53, var2_int);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) var2), "hc.N(" + param0 + ',' + param1 + ')');
        }
    }

    final void drawViewer(byte obfuscationGuard) {
        SoftwareRaster.b();
        this.unitLabel.drawLabel(71);
        this.animationLabel.drawLabel(45);
        this.font.drawCentered("shift: " + DiskCacheRequest.unitProjectionVariants[this.selectedUnitType], 480, 230, 16777215, -1);
        this.font.drawCentered("model ID: " + ResizableModalDialog.unitAnimationGroups[this.selectedUnitType], 480, 242, 16777215, -1);
        this.drawReturnHint(false);
        this.drawDropdowns((byte) -25);
        this.preview.drawPreview((byte) 109);
        if (obfuscationGuard > -52) {
          return;
        }
    }

    private final void advancePreview(byte obfuscationGuard) {
        this.updateRotationKeys(127);
        if (obfuscationGuard >= -30) {
          UnitModelViewer.a(-57, true);
        }
        this.preview.configureProjection(this.previewTilt, 1, this.previewCenterY, -29001, this.previewYaw, this.previewCenterX);
        this.preview.advanceAnimation(-19812);
    }

    private final int chooseAnimationVariant(int animationSlot, int obfuscationGuard) {
        int variantIndex = 0;
        int[] variants;
        int selectedVariant;
        int[] fallbackVariants;
        int candidateVariant;
        int obfuscationControl;
        int[] unitSlotVariants;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        unitSlotVariants = BestScoreStrategy.unitAnimationVariants[this.selectedUnitType][animationSlot];
        variants = unitSlotVariants;
        selectedVariant = variants[AttackEvent.nextBoundedInt(false, unitSlotVariants.length, new Random())];
        if (0 <= selectedVariant) {
          return selectedVariant;
        }
        fallbackVariants = variants;
        for (variantIndex = 0; fallbackVariants.length > variantIndex; variantIndex++) {
          candidateVariant = fallbackVariants[variantIndex];
          if (candidateVariant >= 0) {
            return candidateVariant;
          }
        }
        if (obfuscationGuard != -6892) {
          this.createControls((byte) -91);
        }
        return BestScoreStrategy.unitAnimationVariants[this.selectedUnitType][0][0];
    }

    private final void routeDropdownFocus(int obfuscationGuard, int pointerY, int pointerX) {
        int var5;
        var5 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (this.unitDropdown.isMenuOpen((byte) 97) &&
          this.unitDropdown.containsOption(pointerY, obfuscationGuard - 1, pointerX)) {
          this.unitDropdown.enableInput(0);
          this.animationDropdown.disableInput(32);
        } else if (this.animationDropdown.isMenuOpen((byte) 97) &&
          this.animationDropdown.containsOption(pointerY, obfuscationGuard - 1, pointerX)) {
          this.animationDropdown.enableInput(0);
          this.unitDropdown.disableInput(32);
        } else {
          if (!this.unitDropdown.containsPointer(pointerX, obfuscationGuard + 106, pointerY)) {
            if (this.animationDropdown.containsPointer(pointerX, 81, pointerY)) {
              this.animationDropdown.enableInput(obfuscationGuard - 1);
              this.unitDropdown.disableInput(32);
            } else {
              if (!this.unitDropdown.isMenuOpen((byte) 97)) {
                if (!this.animationDropdown.isMenuOpen((byte) 97)) {
                  this.unitDropdown.enableInput(0);
                  this.animationDropdown.disableInput(32);
                } else {
                  this.animationDropdown.enableInput(0);
                  this.unitDropdown.disableInput(32);
                }
              } else {
                this.unitDropdown.enableInput(0);
                this.animationDropdown.disableInput(32);
              }
            }
          } else {
            this.unitDropdown.enableInput(obfuscationGuard ^ 1);
            this.animationDropdown.disableInput(32);
          }
        }
        if (obfuscationGuard == 1) {
          return;
        }
        this.selectUnit(-69, (byte) 100);
    }

    private final void applyAnimationSelection(int obfuscationGuard) {
        int var2 = this.animationDropdown.getSelectedIndex(5);
        if (var2 == this.selectedAnimationSlot) {
          return;
        }
        int var3 = -5 % ((obfuscationGuard - 58) / 50);
        this.selectAnimation(false, var2);
    }

    private final void selectAnimation(boolean obfuscationGuard, int animationSlot) {
        this.selectedAnimationSlot = animationSlot;
        this.animationDropdown.setSelectedIndex(0, this.selectedAnimationSlot);
        this.preview.enableAnimation(115);
        int var3 = this.chooseAnimationVariant(this.selectedAnimationSlot, -6892);
        if (obfuscationGuard) {
          return;
        }
        this.preview.selectAnimation(var3, this.selectedAnimationSlot, (byte) 63);
        this.preview.showPreview(true);
    }

    private final void initializePreview(int heightMultiplier) {
        this.previewCenterY = heightMultiplier * (so.field_b.field_g >> 2);
        this.previewYaw = 0;
        this.previewCenterX = so.field_b.field_a / 3;
        this.preview = new UnitAnimationPreview();
    }

    private final void positionControl(int y, int x, int controlIndex, int obfuscationGuard) {
        if (controlIndex == 0) {
          this.unitLabel.setPosition(y, (byte) 67, x);
        }
        if (controlIndex == 1) {
          this.unitDropdown.setPosition(105, x, y);
        }
        if (obfuscationGuard <= 18) {
          return;
        }
        if (controlIndex == 2) {
          this.animationLabel.setPosition(y, (byte) 53, x);
        }
        if (controlIndex == 3) {
          this.animationDropdown.setPosition(68, x, y);
        }
    }

    private final void createControls(byte obfuscationGuard) {
        this.unitLabel = new SpriteFramedLabel(this.frameSprites, this.font, this.colours, "Model", 0, 0);
        this.animationLabel = new SpriteFramedLabel(this.frameSprites, this.font, this.colours, "Animation", 0, 0);
        this.unitOptions = hf.unitModelNames;
        this.unitDropdown = new SpriteDropdownControl(this.frameSprites, this.arrowSprites, this.font, this.colours, this.unitOptions, 0, 0);
        if (obfuscationGuard >= -122) {
          campaignMetricMutationCounter = 61;
        }
        this.animationDropdown = new SpriteDropdownControl(this.frameSprites, this.arrowSprites, this.font, this.colours, this.animationOptions, 0, 0);
    }

    private final void layoutControls(int firstControl, int columnWidth, int columnX, int columnHeight, int columnY) {
        int controlIndex = 0;
        int thirdHeight;
        int controlWidth;
        int controlX;
        int controlY;
        int pairBoundaryY;
        int labelHeight;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        thirdHeight = columnHeight / 3;
        for (controlIndex = firstControl; controlIndex < 4; controlIndex++) {
          controlWidth = this.controlWidth(firstControl - 100, controlIndex);
          controlX = columnX + (-controlWidth + columnWidth >> 1);
          if (2 > controlIndex) {
            pairBoundaryY = thirdHeight + columnY;
            controlY = pairBoundaryY;
            if (0 == controlIndex) {
              labelHeight = this.controlHeight((byte) -47, controlIndex);
              controlY = controlY - labelHeight;
            }
          } else {
            pairBoundaryY = columnY + columnHeight - thirdHeight;
            controlY = pairBoundaryY;
            if (controlIndex == 2) {
              labelHeight = this.controlHeight((byte) -47, controlIndex);
              controlY = -labelHeight + controlY;
            }
          }
          this.positionControl(controlY, controlX, controlIndex, 35);
        }
    }

    UnitModelViewer(RgbSprite[] frameSprites, RgbSprite[] arrowSprites, BinaryBitmapFont font, int[] colours, int initialUnitType, int unusedArgument) {
        RuntimeException var7 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.arrowSprites = arrowSprites;
          this.colours = colours;
          this.font = font;
          this.animationOptions = ContentTransitionDialog.unitAnimationSlotNames;
          this.frameSprites = frameSprites;
          this.createControls((byte) -127);
          this.initializePreview(3);
          this.selectUnit(initialUnitType, (byte) 39);
          this.layoutControls(0, so.field_b.field_a >> 1, so.field_b.field_a >> 1, so.field_b.field_g, 0);
          qt.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_5_0 = var7;
          stackIn_5_1 = new StringBuilder().append("hc.<init>(");
          if (frameSprites == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (arrowSprites == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (font == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (colours == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(initialUnitType).append(',').append(unusedArgument).append(')').toString());
        }
    }

    static {
        field_w = "Benefits";
        field_d = "Computer players: ";
        field_o = new int[][]{new int[]{-1, 3, 1, 0}, new int[]{-1, 4, 1, 0}, new int[]{-1, 5, 1, 0}, new int[]{-1, 6, 1, 0}, new int[]{-1, 7, 1, 0}, new int[]{-1, 8, 1, 0}, new int[]{-1, 5, 1, 1}, new int[]{-1, 6, 1, 1}, new int[]{-1, 7, 1, 1}, new int[]{-1, 8, 1, 1}, new int[]{-1, 7, 1, 2}, new int[]{-1, 8, 1, 2}, new int[]{-1, 2, 1, 3}, new int[]{-1, 2, 4, 1}, new int[]{-1, 3, 4, 1}, new int[]{-1, 5, 4, 1}, new int[]{-1, 7, 4, 1}};
        field_q = 0;
    }
}
