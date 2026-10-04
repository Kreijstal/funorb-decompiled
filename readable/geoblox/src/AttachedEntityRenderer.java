/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AttachedEntityRenderer {
    static int achievementTrackingBits;
    static ResourceArchive initialUiFontArchive;
    static int secondPreviousPacketOpcode;

    public static void releaseStaticReferences(int methodGuard) {
        initialUiFontArchive = null;
        if (methodGuard < 121) {
            secondPreviousPacketOpcode = 78;
        }
    }

    final static void drawAttachedEntities(int methodGuard) {
        RuntimeException drawFailureForContext = null;
        int unusedClientControlSnapshot = 0;
        GameplayEntity attachedEntity = null;
        RuntimeException caughtDrawFailure = null;
        unusedClientControlSnapshot = Geoblox.clientControlFlowFlag;
        try {
          attachedEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.firstForIteration(0));
          while (attachedEntity != null) {
            attachedEntity.drawEntityAtPosition(1643839728);
            attachedEntity = (GameplayEntity) ((Object) BoardEntityState.attachedEntities.nextForIteration(1));
          }
          if (methodGuard == 7838) {
            return;
          }
          AttachedEntityRenderer.releaseStaticReferences(-80);
          return;
        } catch (java.lang.RuntimeException drawFailure) {
          caughtDrawFailure = drawFailure;
          drawFailureForContext = caughtDrawFailure;
          throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) drawFailureForContext), "dc.A(" + methodGuard + ')');
        }
    }

    static {
        secondPreviousPacketOpcode = -1;
    }
}
