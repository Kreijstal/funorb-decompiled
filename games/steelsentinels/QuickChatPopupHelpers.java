/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class QuickChatPopupHelpers {
    static String field_a;
    static long field_b;
    static String field_c;

    final static void detachMouseInput(int param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (param0 > -79) {
          QuickChatPopupHelpers.releaseStatics((byte) -45);
        }
        if (SoundCache.field_e == null) {
          return;
        }
        var1 = SoundCache.field_e;
        synchronized (var1) {
          SoundCache.field_e = null;
        }
    }

    public static void releaseStatics(byte param0) {
        field_a = null;
        if (param0 > -61) {
          return;
        }
        field_c = null;
    }

    final static void refreshQuickChatPopupMenu(int param0) {
        if (!QuickChatMenu.isLegacyMenuOpen(true)) {
          return;
        }
        LoginResultHelpers.buildPopupMenu(118, false, 4);
        if (param0 != -5213) {
          field_c = (String) null;
        }
    }

    final static int getInstructionListHeight(boolean param0) {
        PartInstruction[] var1 = null;
        PartInstruction[] var2 = null;
        PartInstruction[] var1Lifetime1;
        PartInstruction[] var1Lifetime2;
        PartInstruction[] var2Lifetime1;
        PartInstruction[] var1Lifetime3;
        if (param0) {
          var1 = new PartInstruction[]{};
          var2 = PendingIntArrayRequest.field_v.collectSlotsAcceptingType(var1, -21636, RegistrationRequestDialog.field_Ob);
          var1Lifetime3 = var2;
          return var2.length * 36;
        }
        QuickChatPopupHelpers.detachMouseInput(124);
        var1Lifetime1 = new PartInstruction[]{};
        var2Lifetime1 = PendingIntArrayRequest.field_v.collectSlotsAcceptingType(var1Lifetime1, -21636, RegistrationRequestDialog.field_Ob);
        var1Lifetime2 = var2Lifetime1;
        return var2Lifetime1.length * 36;
    }

    static {
        field_a = "Hide game chat";
        field_c = "Waiting for fonts";
    }
}
