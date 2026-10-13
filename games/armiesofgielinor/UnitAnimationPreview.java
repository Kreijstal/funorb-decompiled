/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class UnitAnimationPreview {
    private AnimationPlayer animationPlayer;
    private int unitType;
    private boolean projectionVariant;
    static boolean field_h;
    private boolean animationEnabled;
    static ClientUiComponent field_m;
    private int projectionCenterY;
    private int animationSlot;
    private boolean hidden;
    private int yaw;
    private int tilt;
    static int field_l;
    private ModelMesh model;
    static ResourceArchive field_j;
    private int animationVariant;
    static int[] opcodePayloadLengths;
    private int projectionCenterX;
    static int[] field_r;

    private final void installFrameSet(byte obfuscationGuard) {
        int frameGroup = 0;
        AnimationFrameSet frameSet = null;
        AnimationFrameSet alternateFrameSet;
        int alternateFrameGroup;
        if (obfuscationGuard >= 20) {
          frameGroup = this.animationPlayer.frameId >> 16;
          frameSet = we.a(frameGroup, true);
          MusicPatch.a(frameSet, (byte) -34);
          return;
        }
        field_m = (ClientUiComponent) null;
        alternateFrameGroup = this.animationPlayer.frameId >> 16;
        alternateFrameSet = we.a(alternateFrameGroup, true);
        MusicPatch.a(alternateFrameSet, (byte) -34);
    }

    final void advanceAnimation(int obfuscationGuard) {
        int sequenceCompleted;
        if (!this.animationEnabled) {
          return;
        }
        sequenceCompleted = this.animationPlayer.advance(-105) ? 1 : 0;
        if (obfuscationGuard != -19812) {
          this.yaw = -51;
        }
        if (sequenceCompleted != 0) {
          this.startAnimationVariant((byte) -125, this.animationVariant);
        }
        if (!this.animationPlayer.frameChanged) {
          return;
        }
        if (3 == this.animationSlot &&
          this.animationPlayer.frameIndex == ClientUiComponent.field_K[this.unitType][0]) {
          dh.a(this.unitType, 4, 32);
        }
        if (this.animationSlot != 4) {
          return;
        }
        if (this.animationPlayer.frameIndex != ClientUiComponent.field_K[this.unitType][1]) {
          return;
        }
        dh.a(this.unitType, 7, 32);
        return;
    }

    final void showPreview(boolean obfuscationGuard) {
        if (!obfuscationGuard) {
          this.projectionVariant = true;
          this.hidden = false;
          return;
        }
        this.hidden = false;
    }

    final void selectModel(int modelVariant, int unitType) {
        this.unitType = unitType;
        if (ActionRequest.unitModels[this.unitType] == null) {
          this.unitType = 24;
        }
        this.model = (ModelMesh) (ActionRequest.unitModels[this.unitType][modelVariant]);
        this.projectionVariant = DiskCacheRequest.unitProjectionVariants[this.unitType];
    }

    final void drawPreview(byte obfuscationGuard) {
        ModelMesh animatedModelReference = null;
        ModelMesh unanimatedModel = null;
        ModelMesh unanimatedModelReference = null;
        ModelMesh alternateAnimatedModelReference = null;
        ModelMesh alternateUnanimatedModel = null;
        ModelMesh alternateUnanimatedModelReference = null;
        ModelMesh animatedModel = null;
        ModelMesh alternateAnimatedModel = null;
        int copyFlagOne = 0;
        int copyFlagTwo = 0;
        int firstRotation = 0;
        int wrappedYaw = 0;
        int halfTurn = 0;
        int fullTurn = 0;
        int tiltDivisor = 0;
        int wrappedTilt = 0;
        int translationX = 0;
        int translationY = 0;
        int translationZ = 0;
        Object animatedCopyReference = null;
        Object unanimatedCopyReference = null;
        Object canonicalAnimatedCopyReference = null;
        Object canonicalUnanimatedCopyReference = null;
        int alternateCopyFlagOne;
        int alternateCopyFlagTwo;
        int alternateFirstRotation;
        int alternateWrappedYaw;
        int alternateHalfTurn;
        int alternateFullTurn;
        int alternateTiltDivisor;
        int alternateWrappedTilt;
        int alternateTranslationX;
        int alternateTranslationY;
        int alternateTranslationZ;
        if (this.hidden) {
          return;
        }
        if (obfuscationGuard >= 92) {
          copyFlagOne = 0;
          copyFlagTwo = 0;
          firstRotation = 0;
          wrappedYaw = th.floorModWithOffset(this.yaw, 1, 2048);
          halfTurn = 1024;
          fullTurn = 2048;
          tiltDivisor = 12;
          wrappedTilt = th.floorModWithOffset(this.tilt - fullTurn / tiltDivisor + fullTurn, 1, 2048);
          translationX = 0;
          translationY = (!this.projectionVariant ? 300 : 400) - this.tilt * 2;
          translationZ = -400;
          if (this.animationEnabled) {
            animatedModel = (ModelMesh) (this.animationPlayer.applyCurrentFrame(copyFlagOne != 0, true, copyFlagTwo != 0, this.model));
            animatedModelReference = animatedModel;
            animatedModel.scaleGeometry(QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType]);
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(this.projectionCenterX, this.projectionCenterY);
            animatedModelReference.a(firstRotation, wrappedYaw, halfTurn, wrappedTilt, translationX, translationY, translationZ);
          } else {
            TriangleRasterizer.useRasterClip();
            TriangleRasterizer.setProjectionCenter(this.projectionCenterX, this.projectionCenterY);
            unanimatedModel = (ModelMesh) (this.model.a(copyFlagOne != 0, false, copyFlagTwo != 0));
            unanimatedModelReference = unanimatedModel;
            unanimatedModel.scaleGeometry(QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType]);
            unanimatedModelReference.a(firstRotation, wrappedYaw, halfTurn, wrappedTilt, translationX, translationY, translationZ);
          }
          return;
        }
        field_l = 22;
        alternateCopyFlagOne = 0;
        alternateCopyFlagTwo = 0;
        alternateFirstRotation = 0;
        alternateWrappedYaw = th.floorModWithOffset(this.yaw, 1, 2048);
        alternateHalfTurn = 1024;
        alternateFullTurn = 2048;
        alternateTiltDivisor = 12;
        alternateWrappedTilt = th.floorModWithOffset(this.tilt - alternateFullTurn / alternateTiltDivisor + alternateFullTurn, 1, 2048);
        alternateTranslationX = 0;
        alternateTranslationY = (!this.projectionVariant ? 300 : 400) - this.tilt * 2;
        alternateTranslationZ = -400;
        if (this.animationEnabled) {
          alternateAnimatedModel = (ModelMesh) (this.animationPlayer.applyCurrentFrame(alternateCopyFlagOne != 0, true, alternateCopyFlagTwo != 0, this.model));
          alternateAnimatedModelReference = alternateAnimatedModel;
          alternateAnimatedModel.scaleGeometry(QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType]);
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(this.projectionCenterX, this.projectionCenterY);
          alternateAnimatedModelReference.a(alternateFirstRotation, alternateWrappedYaw, alternateHalfTurn, alternateWrappedTilt, alternateTranslationX, alternateTranslationY, alternateTranslationZ);
        } else {
          TriangleRasterizer.useRasterClip();
          TriangleRasterizer.setProjectionCenter(this.projectionCenterX, this.projectionCenterY);
          alternateUnanimatedModel = (ModelMesh) (this.model.a(alternateCopyFlagOne != 0, false, alternateCopyFlagTwo != 0));
          alternateUnanimatedModelReference = alternateUnanimatedModel;
          alternateUnanimatedModel.scaleGeometry(QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType], QuickChatHelpDialog.field_Jb[this.unitType]);
          alternateUnanimatedModelReference.a(alternateFirstRotation, alternateWrappedYaw, alternateHalfTurn, alternateWrappedTilt, alternateTranslationX, alternateTranslationY, alternateTranslationZ);
        }
    }

    private final void startAnimationVariant(byte obfuscationGuard, int animationVariant) {
        int animationGroup;
        AnimationSequence sequence;
        int guardRemainder;
        int soundSlot;
        int obfuscationControl;
        obfuscationControl = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.animationEnabled) {
          return;
        }
        this.animationVariant = animationVariant;
        animationGroup = ResizableModalDialog.unitAnimationGroups[this.unitType];
        sequence = ck.animationSequencesByGroup[animationGroup][this.animationVariant];
        guardRemainder = 81 % ((obfuscationGuard + 53) / 59);
        this.animationPlayer.selectSequence(-1, sequence);
        this.installFrameSet((byte) 122);
        soundSlot = this.animationSlot;
        if (soundSlot == 1) {
          dh.a(this.unitType, 0, 32);
          return;
        }
        if (2 == soundSlot) {
          dh.a(this.unitType, 0, 32);
          return;
        }
        if (soundSlot == 3) {
          dh.a(this.unitType, 3, 32);
          return;
        }
        if (soundSlot == 5) {
          dh.a(this.unitType, 6, 32);
          return;
        }
        if (soundSlot == 6) {
          dh.a(this.unitType, 2, 32);
          dh.a(this.unitType, 1, 32);
          return;
        }
        if (soundSlot != 7) {
          return;
        }
        dh.a(this.unitType, 5, 32);
        dh.a(this.unitType, 2, 32);
        return;
    }

    final void enableAnimation(int obfuscationGuard) {
        int var2 = 34 % ((obfuscationGuard - 45) / 36);
        this.animationEnabled = true;
    }

    final void selectAnimation(int animationVariant, int animationSlot, byte obfuscationGuard) {
        this.animationSlot = animationSlot;
        this.startAnimationVariant((byte) -114, animationVariant);
        if (obfuscationGuard < 43) {
          this.enableAnimation(-118);
        }
    }

    public static void b(byte param0) {
        if (param0 != 40) {
          return;
        }
        opcodePayloadLengths = null;
        field_j = null;
        field_r = null;
        field_m = null;
    }

    final static ClientUiComponent d(byte param0) {
        if (param0 < 69) {
          UnitAnimationPreview.b((byte) 50);
          return MapTile.field_f.content;
        }
        return MapTile.field_f.content;
    }

    private final void hidePreview(byte obfuscationGuard) {
        if (obfuscationGuard != -79) {
          return;
        }
        this.hidden = true;
    }

    final void configureProjection(int tilt, int unusedArgument, int projectionCenterY, int obfuscationGuard, int yaw, int projectionCenterX) {
        this.yaw = yaw;
        this.projectionCenterX = projectionCenterX;
        if (obfuscationGuard == -29001) {
          this.projectionCenterY = projectionCenterY;
          this.tilt = tilt;
          return;
        }
        this.tilt = 36;
        this.projectionCenterY = projectionCenterY;
        this.tilt = tilt;
    }

    UnitAnimationPreview() {
        this.animationPlayer = new AnimationPlayer(1);
        this.selectModel(0, 0);
        this.enableAnimation(-28);
        this.selectAnimation(0, 0, (byte) 115);
        this.configureProjection(0, 1, so.field_b.field_g >> 1, -29001, 0, so.field_b.field_a >> 1);
        this.hidePreview((byte) -79);
    }

    static {
        field_l = 360;
        opcodePayloadLengths = new int[256];
        field_r = new int[]{8};
    }
}
