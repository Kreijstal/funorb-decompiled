/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class MouseWheelInput {
    static int field_b;
    static String field_a;
    static PcmSample field_c;

    abstract void detach(int param0, java.awt.Component param1);

    final static void handleSubmissionAcknowledgement(boolean param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        PacketDiagnosticsHelpers var4_ref_hc = null;
        Object var5 = null;
        int var6 = 0;
        PendingSubmission var8 = null;
        BitPacketBuffer var9 = null;
        byte[] var13 = null;
        var6 = TetraLink.field_J;
        try {
          if (param0) {
            field_c = (PcmSample) null;
          }
          var9 = BackgroundSparkle.field_q;
          var2 = var9.readUnsignedByte((byte) -99);
          if (0 == var2) {
            var8 = (PendingSubmission) (NetworkGameClient.field_F.first(false));
            if (var8 == null) {
              SocialTabsPanel.closeGameSocket(false);
              return;
            }
            var4 = var9.readUnsignedByte((byte) -99);
            if (0 == var4) {
              var5 = null;
            } else {
              var13 = new byte[var4];
              var9.readBytes(var4, 0, var13, 126);
            }
            var9.position = var9.position + 4;
            if (!var9.verifyChecksum(4)) {
              SocialTabsPanel.closeGameSocket(param0);
              return;
            }
            var8.unlink(false);
            return;
          }
          if (var2 != 1) {
            HotspotTextWidget.reportClientError(-83, (Throwable) null, "A1: " + PacketDiagnosticsHelpers.describeCurrentPacket(false));
            SocialTabsPanel.closeGameSocket(false);
            return;
          }
          var3 = var9.readInt(-122);
          var4_ref_hc = (PacketDiagnosticsHelpers) (NameAlphabetTable.field_f.first(false));
          while (var4_ref_hc != null) {
            if (var4_ref_hc.field_t != var3) {
              var4_ref_hc = (PacketDiagnosticsHelpers) (NameAlphabetTable.field_f.next((byte) -70));
              continue;
            }
            break;
          }
          if (var4_ref_hc == null) {
            SocialTabsPanel.closeGameSocket(false);
            return;
          }
          var4_ref_hc.unlink(param0);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw IndexedSpriteState.wrapException((Throwable) ((Object) var1), "se.E(" + param0 + ')');
        }
    }

    abstract void attach(int param0, java.awt.Component param1);

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != -1) {
          MouseWheelInput.handleSubmissionAcknowledgement(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    abstract int takeRotation(int param0);

    static {
        field_a = "Waiting for music";
        field_b = -1;
    }
}
