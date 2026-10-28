/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SavedDataRequestSupport {
    static String playTutorialLabel;
    static AccountRequestDialog requestDialog;

    public static void releaseStatics(byte guard) {
        playTutorialLabel = null;
        if (guard > -103) {
          playTutorialLabel = (String) null;
          requestDialog = null;
          return;
        }
        requestDialog = null;
    }

    final static void writePendingRequests(int opcode, int guard) {
        int var3 = EscapeVector.obfuscationControl;
        try {
          if (guard != 17205) {
            SavedDataRequestSupport.releaseStatics((byte) 71);
          }
          SavedDataWrite var4 = (SavedDataWrite) (SpaceCompactionSupport.pendingSavedDataWrites.first(false));
          while (var4 != null) {
            SingleChildContainer.writeSavedData(-118, var4, opcode);
            var4 = (SavedDataWrite) (SpaceCompactionSupport.pendingSavedDataWrites.next((byte) 70));
          }
          IntrusiveNode var2 = SpriteState.field_w.first(false);
          while (var2 != null) {
            MarkerSlider.writeSavedDataQuery(opcode, (byte) -63);
            var2 = SpriteState.field_w.next((byte) 70);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var2_ref = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var2_ref), "be.B(" + opcode + ',' + guard + ')');
        }
    }

    static {
        playTutorialLabel = "Play Tutorial";
        IntrusiveDeque discarded$0 = new IntrusiveDeque();
    }
}
