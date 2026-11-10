/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingDataRequest extends IntrusiveNode {
    int field_h;
    static int field_i;
    byte[] field_f;
    static boolean field_g;

    final static void shutdownSession(boolean param0) {
        FullscreenSupport.exitActiveFullscreen(-54);
        if (NameEntryPopup.field_Ib != null) {
          SpriteState.detachCanvasInput(95, NameEntryPopup.field_Ib);
        }
        GradientOutlineTextPainter.disableKeyboardInput(4862);
        if (param0) {
          return;
        }
        Js5Transport.clearMouseHandler(31);
        InflaterDecompressor.closeArchiveConnections(-8);
        if (!TickButtonPainter.isServerSessionActive(23517)) {
          ClientShellHelpers.closeGameSocket((byte) -111);
          return;
        }
        TextValidationFailure.field_a.writeCipheredOpcode((byte) -35, 1);
        PowerupProgressCard.flushPackets(0, false);
        ClientShellHelpers.closeGameSocket((byte) -111);
    }

    final static boolean isPlayerDataReady(byte param0) {
        if (param0 != 107) {
          field_g = true;
          if (!PasswordValidator.field_r) {
            return ScorePopup.isGuestSession(98) ? true : false;
          }
          if (!GameScreen.field_bb) {
            return ScorePopup.isGuestSession(98) ? true : false;
          }
          return true;
        }
        if (PasswordValidator.field_r) {
          if (GameScreen.field_bb) {
            return true;
          }
          return ScorePopup.isGuestSession(98) ? true : false;
        }
        if (!ScorePopup.isGuestSession(98)) {
          return false;
        }
        return true;
    }

    PendingDataRequest(byte[] param0) {
        try {
          this.field_f = param0;
        } catch (RuntimeException runtimeException) {
          throw ReportAbuseDialog.addExceptionContext((Throwable) ((Object) runtimeException), "n.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean isMessageBoxOpen(byte param0) {
        if (param0 >= -16) {
          return true;
        }
        return SectorCacheStore.field_c;
    }

    static {
        field_i = 1;
        field_g = false;
    }
}
