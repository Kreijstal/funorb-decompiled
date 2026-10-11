/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport128 {
    static java.applet.Applet appletState0002;
    static String stringState0530;

    final static void performAction1819(MusicTrack musicTrackArgument1, int integerArgument2) {
        try {
          UiComponentPart033.midiSynthesizerState0001.performAction0773(musicTrackArgument1, integerArgument2, 0, -1);
          AudioSupport004.musicTrackState0005 = musicTrackArgument1;
        } catch (RuntimeException runtimeException) {
          throw ClientException.computeDiagnosticSupport0020400((Throwable) ((Object) runtimeException), "th.B(" + (musicTrackArgument1 != null ? "{...}" : "null") + ',' + integerArgument2 + ')');
        }
    }

    public static void performAction1816(int integerArgument1) {
        stringState0530 = null;
        if (integerArgument1 <= 120) {
          appletState0002 = (java.applet.Applet) null;
          appletState0002 = null;
          return;
        }
        appletState0002 = null;
    }

    final static void performAction1817(int integerArgument1, int integerArgument2, boolean booleanArgument3, int integerArgument4, boolean booleanArgument5, boolean booleanArgument6, boolean booleanArgument7, int integerArgument8, int integerArgument9, int integerArgument10, int integerArgument11, byte byteArgument12, int integerArgument13, boolean booleanArgument14) {
        MixedSupport122.stringState0515 = null;
        UiComponent.performAction0246(116);
        booleanArgument14 = BucketBoard.computeBoolean1093(integerArgument9, -121, integerArgument2, integerArgument11, booleanArgument14, integerArgument10, integerArgument4);
        UiComponentPart023.performAction1419(booleanArgument6, integerArgument13, integerArgument8, booleanArgument7, booleanArgument14, booleanArgument3, booleanArgument5, -1, integerArgument1, integerArgument11);
        MixedSupport001.performAction0011(integerArgument13, booleanArgument6, true);
        if (byteArgument12 <= 42) {
          stringState0530 = (String) null;
        } else {
          UiComponentPart031.performAction1806(integerArgument9, booleanArgument14, 0, integerArgument13);
          return;
        }
        UiComponentPart031.performAction1806(integerArgument9, booleanArgument14, 0, integerArgument13);
    }

    final static void performAction1818(int integerArgument1, boolean booleanArgument2) {
        CipherPacketBuffer cipherPacketBufferLocal1 = SocketFactory.cipherPacketBufferState0002;
        cipherPacketBufferLocal1.performAction1861(integerArgument1, -4);
        cipherPacketBufferLocal1.position = cipherPacketBufferLocal1.position + 1;
        int integerLocal2 = cipherPacketBufferLocal1.position;
        cipherPacketBufferLocal1.performAction2073(true, 2);
        cipherPacketBufferLocal1.performAction2074(false, MixedSupport074.byteArrayState0011.length, MixedSupport074.byteArrayState0011, 0);
        cipherPacketBufferLocal1.performAction2073(true, MixedSupport108.integerState0595);
        cipherPacketBufferLocal1.performAction2073(booleanArgument2, DiagnosticSupport002.integerState0340);
        cipherPacketBufferLocal1.performAction2074(false, MixedSupport141.byteArrayState0029.length, MixedSupport141.byteArrayState0029, 0);
        cipherPacketBufferLocal1.performAction2079(cipherPacketBufferLocal1.position - integerLocal2, booleanArgument2);
    }

    static {
        stringState0530 = "Settling Score: ";
    }
}
