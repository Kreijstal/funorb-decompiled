/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fc {
    static String musicLabelText;
    static ByteArrayBuffer field_d;
    static Sprite[] blackOrbFrames;
    static double field_a;
    static Sprite[] avatarEyeFrames;
    static volatile boolean pointerActivityPending;
    static int field_c;

    final static void advanceEndingEntityAnimations(int methodGuard) {
        RuntimeException caughtEndingAnimationException = null;
        GameplayEntity attachedThenTransientEntity = null;
        RuntimeException endingAnimationFailure = null;
        int guardResidue = 0;
        int clientControlFlowSnapshot = 0;
        clientControlFlowSnapshot = Geoblox.clientControlFlowFlag;
        try {
          LoginPanel.endingEntityScanClear = true;
          attachedThenTransientEntity = (GameplayEntity) ((Object) a.attachedEntities.firstForIteration(0));
          while (attachedThenTransientEntity != null) {
            attachedThenTransientEntity.advanceEntityAnimation(true);
            if (6 == attachedThenTransientEntity.entitySpriteKindId) {
              LoginPanel.endingEntityScanClear = false;
              if (attachedThenTransientEntity.animationFrameIndex >= 3) {
                SecondaryNodeDeque.availableEntities.addLast(-67, attachedThenTransientEntity);
              }
            }
            attachedThenTransientEntity = (GameplayEntity) ((Object) a.attachedEntities.nextForIteration(1));
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

    final static void a(boolean param0, java.awt.Canvas param1) {
        if (!(hj.field_a != 11)) {
            w.a(31);
        }
        if (!param0) {
            return;
        }
        try {
            ByteArrayBuffer.a(ArchiveRequest.field_s, oi.field_e, lb.field_a, (byte) -40);
            i.a(0, (byte) 117, param1, 0);
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fc.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        avatarEyeFrames = null;
        blackOrbFrames = null;
        if (param0 < -79) {
            field_d = null;
            musicLabelText = null;
            return;
        }
        fc.advanceEndingEntityAnimations(-17);
        field_d = null;
        musicLabelText = null;
    }

    static {
        musicLabelText = "Music: ";
        field_d = new ByteArrayBuffer(256);
        field_a = 0.0;
        pointerActivityPending = false;
    }
}
