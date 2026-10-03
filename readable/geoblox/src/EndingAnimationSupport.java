/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class EndingAnimationSupport {
    static String musicLabelText;
    static ByteArrayBuffer loginPayloadBuffer;
    static Sprite[] blackOrbFrames;
    static double field_a;
    static Sprite[] avatarEyeFrames;
    static volatile boolean pointerActivityPending;
    static int nextScoreSubmissionId;

    final static void advanceEndingEntityAnimations(int methodGuard) {
        RuntimeException caughtEndingAnimationException = null;
        GameplayEntity attachedThenTransientEntity = null;
        RuntimeException endingAnimationFailure = null;
        int guardResidue = 0;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          LoginPanel.endingEntityScanClear = true;
          attachedThenTransientEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.firstForIteration(0));
          while (attachedThenTransientEntity != null) {
            attachedThenTransientEntity.advanceEntityAnimation(true);
            if (6 == attachedThenTransientEntity.entitySpriteKindId) {
              LoginPanel.endingEntityScanClear = false;
              if (attachedThenTransientEntity.animationFrameIndex >= 3) {
                SecondaryNodeDeque.availableEntities.addLast(-67, attachedThenTransientEntity);
              }
            }
            attachedThenTransientEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.nextForIteration(1));
          }
          guardResidue = 12 % ((-69 - methodGuard) / 38);
          attachedThenTransientEntity = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.firstForIteration(0));
          while (attachedThenTransientEntity != null) {
            attachedThenTransientEntity.advanceEntityAnimation(true);
            if (!((5 != attachedThenTransientEntity.entitySpriteKindId) &&
                (attachedThenTransientEntity.entitySpriteKindId != 7) &&
                (attachedThenTransientEntity.entitySpriteKindId != 8))) {
              LoginPanel.endingEntityScanClear = false;
              if (attachedThenTransientEntity.animationFrameIndex >= 3) {
                SecondaryNodeDeque.availableEntities.addLast(-115, attachedThenTransientEntity);
              }
            }
            attachedThenTransientEntity = (GameplayEntity) ((Object) DelegatingCanvas.transientEntities.nextForIteration(1));
          }
          return;
        } catch (java.lang.RuntimeException caughtEndingAnimationFailure) {
          caughtEndingAnimationException = caughtEndingAnimationFailure;
          endingAnimationFailure = caughtEndingAnimationException;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) endingAnimationFailure), "fc.B(" + methodGuard + ')');
        }
    }

    final static void presentPreparedFrame(boolean drawEnabled, java.awt.Canvas canvas) {
        if (!(SpriteConstructionSupport.clientScreenStage != 11)) {
            w.a(31);
        }
        if (!drawEnabled) {
            return;
        }
        try {
            ByteArrayBuffer.a(ArchiveRequest.field_s, oi.field_e, lb.field_a, (byte) -40);
            MeshDepthSupport.drawMainRasterToCanvas(0, (byte) 117, canvas, 0);
        } catch (RuntimeException framePresentationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) framePresentationFailure), "fc.A(" + drawEnabled + ',' + (canvas != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStaticReferences(byte methodGuard) {
        avatarEyeFrames = null;
        blackOrbFrames = null;
        if (methodGuard < -79) {
            loginPayloadBuffer = null;
            musicLabelText = null;
            return;
        }
        EndingAnimationSupport.advanceEndingEntityAnimations(-17);
        loginPayloadBuffer = null;
        musicLabelText = null;
    }

    static {
        musicLabelText = "Music: ";
        loginPayloadBuffer = new ByteArrayBuffer(256);
        field_a = 0.0;
        pointerActivityPending = false;
    }
}
