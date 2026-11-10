/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class BootstrapLoadingHelpers {
    static IntrusiveDeque field_a;
    static String field_c;
    static String field_b;

    public static void releaseStatics(int param0) {
        if (param0 != -21) {
          return;
        }
        field_c = null;
        field_b = null;
        field_a = null;
    }

    final static boolean shouldShowBootstrapLoadingScreen(byte param0) {
        if (param0 != -44) {
          BootstrapLoadingHelpers.releaseStatics(31);
          if (AlternateLongAndNameCredentials.field_j < 20) {
            return true;
          }
          if (!CacheEntry.isClientReady(param0 ^ -18868)) {
            return true;
          }
          if (AccountRequestState.field_b <= 0) {
            return false;
          }
          if (!IntRecordReplyHelpers.alwaysTrue(-23022)) {
            return true;
          }
          return false;
        }
        if (AlternateLongAndNameCredentials.field_j < 20) {
          return true;
        }
        if (!CacheEntry.isClientReady(param0 ^ -18868)) {
          return true;
        }
        if (AccountRequestState.field_b <= 0) {
          return false;
        }
        if (!IntRecordReplyHelpers.alwaysTrue(-23022)) {
          return true;
        }
        return false;
    }

    final static void readLocalPlayerName(boolean param0) {
        CharSequence var3 = null;
        VisualPropertyNode.field_r = MatchingTextValidator.field_g.readNullTerminatedString(true);
        if (!param0) {
          var3 = (CharSequence) ((Object) VisualPropertyNode.field_r);
          FullscreenMembershipDialog.field_T = CheckboxWidget.normalizeDisplayName(var3, -122);
          return;
        }
        field_b = (String) null;
        CharSequence var2 = (CharSequence) ((Object) VisualPropertyNode.field_r);
        FullscreenMembershipDialog.field_T = CheckboxWidget.normalizeDisplayName(var2, -122);
    }

    final static String formatFraction(int param0, byte param1, int param2) {
        int var3 = -37 % ((param1 + 79) / 44);
        return param0 + "/" + param2;
    }

    static {
        field_a = new IntrusiveDeque();
        field_b = "Instructions";
        field_c = "Discard";
    }
}
