/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbyGameLookupHelpers {
    static String[] field_c;
    static String[] field_e;
    static String field_f;
    static SecondaryNodeHashTable field_b;
    static LoginMethod field_a;
    static boolean field_d;
    static String field_g;

    final static LobbyGame findLobbyGame(int param0, byte param1) {
        if (param1 <= -102) {
          return null == QuickChatSendHelpers.field_f ? null : (LobbyGame) (QuickChatSendHelpers.field_f.get(-11434, (long)param0));
        }
        LobbyGameLookupHelpers.unpackChatFilterSettings(-99, (byte) 98);
        return null == QuickChatSendHelpers.field_f ? null : (LobbyGame) (QuickChatSendHelpers.field_f.get(-11434, (long)param0));
    }

    final static ResourceArchive createArchive(boolean param0, byte param1, boolean param2, int param3, int param4) {
        if (param1 == 22) {
          return EmailValidationState.createResourceArchive(-107, param0, false, param3, param4, param2);
        }
        LobbyGameLookupHelpers.findLobbyGame(-98, (byte) 84);
        return EmailValidationState.createResourceArchive(-107, param0, false, param3, param4, param2);
    }

    final static void unpackChatFilterSettings(int param0, byte param1) {
        if (param1 > -62) {
          return;
        }
        LoginMethod.field_e = 3 & param0 >> 4;
        if (LoginMethod.field_e > 2) {
          LoginMethod.field_e = 2;
          GradientOutlineTextPainter.field_v = (14 & param0) >> 2;
          if (!(GradientOutlineTextPainter.field_v <= 2)) {
            GradientOutlineTextPainter.field_v = 2;
          }
          GridSize.field_e = param0 & 3;
          if (GridSize.field_e > 2) {
            GridSize.field_e = 2;
            return;
          }
          return;
        }
        GradientOutlineTextPainter.field_v = (14 & param0) >> 2;
        if (!(GradientOutlineTextPainter.field_v <= 2)) {
          GradientOutlineTextPainter.field_v = 2;
        }
        GridSize.field_e = param0 & 3;
        if (GridSize.field_e <= 2) {
          return;
        }
        GridSize.field_e = 2;
    }

    public static void releaseStatics(int param0) {
        field_e = null;
        if (param0 > 77) {
          field_b = null;
          field_g = null;
          field_c = null;
          field_a = null;
          field_f = null;
          return;
        }
        LobbyGameLookupHelpers.releaseStatics(11);
        field_b = null;
        field_g = null;
        field_c = null;
        field_a = null;
        field_f = null;
    }

    static {
        field_f = "Try Again";
        field_a = new LoginMethod("usename");
        field_g = "Cancel";
    }
}
