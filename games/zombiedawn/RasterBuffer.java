/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class RasterBuffer {
    static long field_b;
    int[] field_c;
    java.awt.Image field_f;
    int field_a;
    static PacketBuffer field_e;
    static String field_g;
    int field_d;

    abstract void drawImage(java.awt.Graphics param0, int param1, int param2, byte param3);

    final void makeRasterTarget(int param0) {
        int var2 = -12 % ((param0 + 53) / 62);
        Rasterizer.setBuffer(this.field_c, this.field_d, this.field_a);
    }

    abstract void initialize(int param0, int param1, java.awt.Component param2, int param3);

    final static void advanceLoginTransition(int param0) {
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var2;
        var2 = ZombieDawn.field_J;
        if (param0 == 256) {
          if (PendingRecordRequest.field_p == GlowAreaSupport.field_k) {
            fieldTemp$3 = TickClock.field_b;
            TickClock.field_b = TickClock.field_b + 1;
            if (fieldTemp$3 < 16) {
              return;
            }
            if (MasterIndexHelpers.field_a) {
              OfflineLoginHelpers.returnToLoginFromOffline(112);
            } else {
              PowerupCard.openLoginPanelAtStage(0);
            }
            PendingRecordRequest.field_p = DelayedPacket.field_k;
            return;
          }
          if (PendingRecordRequest.field_p != DelayedPacket.field_k) {
            if (AccountPromptTexts.field_f != PendingRecordRequest.field_p) {
              return;
            }
            fieldTemp$2 = TickClock.field_b;
            TickClock.field_b = TickClock.field_b - 1;
            if (0 < fieldTemp$2) {
              return;
            }
            PendingRecordRequest.field_p = PendingRecordRequest.field_x;
            return;
          }
        } else {
          field_e = (PacketBuffer) null;
          if (PendingRecordRequest.field_p == GlowAreaSupport.field_k) {
            fieldTemp$1 = TickClock.field_b;
            TickClock.field_b = TickClock.field_b + 1;
            if (fieldTemp$1 < 16) {
              return;
            }
            if (MasterIndexHelpers.field_a) {
              OfflineLoginHelpers.returnToLoginFromOffline(112);
            } else {
              PowerupCard.openLoginPanelAtStage(0);
            }
            PendingRecordRequest.field_p = DelayedPacket.field_k;
            return;
          }
          if (PendingRecordRequest.field_p != DelayedPacket.field_k) {
            if (AccountPromptTexts.field_f != PendingRecordRequest.field_p) {
              return;
            }
            fieldTemp$0 = TickClock.field_b;
            TickClock.field_b = TickClock.field_b - 1;
            if (0 < fieldTemp$0) {
              return;
            }
            PendingRecordRequest.field_p = PendingRecordRequest.field_x;
            return;
          }
        }
        if (!MeleeHuman.isGuestSession(13296)) {
          if (null != MasterIndexHelpers.field_c) {
            BufferedSocket.queueHighscoreSubmission(MasterIndexHelpers.field_c, (byte) 110, 3);
          }
          LogoPoseHelpers.resetScriptedMinigunnerTrigger((byte) 47);
          if (UiContainer.field_C) {
            UiContainer.field_C = false;
            DisplayState.requestFullscreen(false, false);
          }
        }
        PendingRecordRequest.field_p = AccountPromptTexts.field_f;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 != 16) {
          RasterBuffer.advanceLoginTransition(-103);
          field_g = null;
          return;
        }
        field_g = null;
    }

    static {
        field_e = new PacketBuffer(256);
        field_g = "Unpacking graphics";
    }
}
