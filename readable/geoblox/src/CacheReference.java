/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheReference extends DualLinkNode {
    static PacketBuffer outgoingSessionBuffer;
    static int generatedInCurrentTheme;
    int entryWeight;
    static AudioOutput gameMusicOutput;
    static int menuPointerRepeatInterval;

    abstract boolean requiresStrongPromotion(int methodGuard);

    abstract Object getReferent(byte methodGuard);

    CacheReference(int entryWeight) {
        this.entryWeight = entryWeight;
    }

    final static boolean haveRequiredClientStages(int methodGuard) {
        if (methodGuard != -31456) {
            outgoingSessionBuffer = (PacketBuffer) null;
            if (SpriteConstructionSupport.clientScreenStage < 10) {
                return false;
            }
            if (VisualPropertyOverrides.clientBootstrapStage >= 13) {
                return true;
            }
            return false;
        }
        if (SpriteConstructionSupport.clientScreenStage < 10) {
            return false;
        }
        if (VisualPropertyOverrides.clientBootstrapStage >= 13) {
            return true;
        }
        return false;
    }

    public static void releaseCacheReferenceResources(int methodGuard) {
        gameMusicOutput = null;
        if (methodGuard > -92) {
            CacheReference.haveRequiredClientStages(64);
            outgoingSessionBuffer = null;
            return;
        }
        outgoingSessionBuffer = null;
    }

    final static void initializeAccountUiResources(byte methodGuard, ResourceArchive buttonImageArchive, boolean unusedMemberAccountMode, ResourceArchive fontArchive, ResourceArchive commonUiSpriteArchive) {
        try {
            EntityContactSupport.activeEmailAvailabilityQuery = ImageProducerRasterBuffer.a((byte) 86, "");
            int guardResidue = 103 / ((methodGuard - 70) / 34);
            EntityContactSupport.activeEmailAvailabilityQuery.complete((byte) -126, false);
            IndexedSpriteState.a((byte) 103, buttonImageArchive, commonUiSpriteArchive, fontArchive);
            AccountCreationForm.rebuildAccountDialogLayerAndOpenLogin((byte) -121);
            ClientFlowState.accountCreationFlowState = DiskCacheWorker.idleClientFlowToken;
            WidgetSkinState.usernameQueryFlowState = DiskCacheWorker.idleClientFlowToken;
        } catch (RuntimeException resourceInitializationFailure) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) resourceInitializationFailure), "fj.H(" + methodGuard + ',' + (buttonImageArchive != null ? "{...}" : "null") + ',' + unusedMemberAccountMode + ',' + (fontArchive != null ? "{...}" : "null") + ',' + (commonUiSpriteArchive != null ? "{...}" : "null") + ')');
        }
    }

    static {
        menuPointerRepeatInterval = 4;
    }
}
