/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class CacheReference extends DualLinkNode {
    static PacketBuffer outgoingSessionBuffer;
    static int field_m;
    int field_n;
    static AudioOutput gameMusicOutput;
    static int menuPointerRepeatInterval;

    abstract boolean g(int param0);

    abstract Object e(byte param0);

    CacheReference(int param0) {
        this.field_n = param0;
    }

    final static boolean f(int param0) {
        if (param0 != -31456) {
            outgoingSessionBuffer = (PacketBuffer) null;
            if (SpriteConstructionSupport.clientScreenStage < 10) {
                return false;
            }
            if (VisualPropertyOverrides.field_C >= 13) {
                return true;
            }
            return false;
        }
        if (SpriteConstructionSupport.clientScreenStage < 10) {
            return false;
        }
        if (VisualPropertyOverrides.field_C >= 13) {
            return true;
        }
        return false;
    }

    public static void e(int param0) {
        gameMusicOutput = null;
        if (param0 > -92) {
            CacheReference.f(64);
            outgoingSessionBuffer = null;
            return;
        }
        outgoingSessionBuffer = null;
    }

    final static void a(byte param0, ResourceArchive param1, boolean param2, ResourceArchive param3, ResourceArchive param4) {
        try {
            EntityContactSupport.activeEmailAvailabilityQuery = ImageProducerRasterBuffer.a((byte) 86, "");
            int var5_int = 103 / ((param0 - 70) / 34);
            EntityContactSupport.activeEmailAvailabilityQuery.complete((byte) -126, false);
            IndexedSpriteState.a((byte) 103, param1, param4, param3);
            AccountCreationForm.h((byte) -121);
            ClientFlowState.accountCreationFlowState = DiskCacheWorker.idleClientFlowToken;
            WidgetSkinState.usernameQueryFlowState = DiskCacheWorker.idleClientFlowToken;
        } catch (RuntimeException runtimeException) {
            throw InstrumentEnvelope.withFailureContext((Throwable) ((Object) runtimeException), "fj.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        menuPointerRepeatInterval = 4;
    }
}
