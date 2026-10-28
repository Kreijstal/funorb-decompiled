/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AccountOverlayController {
    static String field_a;
    static PcmSample field_b;

    public static void releaseStatics(byte guard) {
        field_b = null;
        if (guard != 118) {
          return;
        }
        field_a = null;
    }

    final static void updateAccountOverlay(int guard) {
        int var2 = EscapeVector.obfuscationControl;
        try {
          if (!IntrusiveNode.b(12)) {
            if (null != IsaacRandom.field_d &&
              IsaacRandom.field_d.field_c) {
              ri.a(-25123);
              AccountRequestDialog.field_pb.pushPanel(new AccountNoticeDialog(AccountRequestDialog.field_pb, ThreeSliceButtonPainter.field_A), 69);
            }
            return;
          }
          AccountRequestDialog.field_pb.handlePointerFrame(true, (byte) -33, on.field_a, DebouncedValidator.field_b);
          AccountRequestDialog.field_pb.updatePanels(0);
          while (AccountRequestDialog.pollKeyEvent(-104)) {
            AccountRequestDialog.field_pb.handleKey(KeyCodeSupport.currentKeyCharacter, PasswordValidator.field_n, (byte) -121);
          }
          if (guard < -31) {
            return;
          }
          field_a = (String) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var1 = decompiledCaughtException;
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) var1), "b.B(" + guard + ')');
        }
    }

    static {
        field_a = "TNT - Collide with object to detonate";
    }
}
