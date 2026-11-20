/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FullscreenExit {
    static String field_a;

    final static void exitFullscreen(byte param0) {
        if (null == EmailAvailabilityChecks.fullscreenCanvas) {
          return;
        }
        if (param0 != -95) {
          return;
        }
        ShieldInfoPool.detachCanvasInput(EmailAvailabilityChecks.fullscreenCanvas, -28);
        EmailAvailabilityChecks.fullscreenCanvas.exitFullscreen(SetTorpedoProjectiles.field_o, -32335);
        EmailAvailabilityChecks.fullscreenCanvas = null;
        if (MissionConditionFactory.field_b == null) {
          GammaCorrection.canvas.requestFocus();
          return;
        }
        MissionConditionFactory.field_b.restorePreviousSize(param0 - 29579);
        GammaCorrection.canvas.requestFocus();
    }

    public static void clearSharedReferences(int param0) {
        if (param0 != 0) {
          return;
        }
        field_a = null;
    }

    final static boolean isActivePublicChat(int param0) {
        if (param0 >= -54) {
          return true;
        }
        if (!SetFightersPerPlayerMaximum.chatInputActive) {
          return false;
        }
        if (NetworkMessageState.chatChannel == 0) {
          return true;
        }
        return false;
    }

    final static void setHuffmanCodec(byte param0, HuffmanCodec param1) {
        try {
          GetMissileLauncherAimspeed.huffmanCodec = param1;
          int var2_int = 12 % ((param0 - 19) / 37);
        } catch (RuntimeException runtimeException) {
          throw GetMissileLauncherRandomness.a((Throwable) ((Object) runtimeException), "spb.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = "Find opponent";
    }
}
