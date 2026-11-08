/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LoadingStatusHelpers {
    static int field_d;
    static String field_b;
    static int field_c;
    static GameKeyHandler field_a;

    final static String getLoadingStatusText(int param0) {
        if (2 > GrowableIntList.field_a) {
          return HighscoreRowName.field_b;
        }
        if (DebouncedValidator.field_i != null) {
          if (!DebouncedValidator.field_i.ensureIndexLoaded(param0 ^ -31281)) {
            return ArrayWidgetContainer.field_N;
          }
          return KeyEventHelpers.field_e;
        }
        if (!LoadingScreenHelpers.field_i.ensureIndexLoaded(param0 ^ -31275)) {
          return QuickChatCategory.field_C;
        }
        if (!LoadingScreenHelpers.field_i.loadGroupByName("commonui", (byte) -106)) {
          return NameAlphabetTable.field_c + " - " + LoadingScreenHelpers.field_i.getGroupProgressByName("commonui", true) + "%";
        }
        if (param0 != -31307) {
          field_b = (String) null;
        }
        if (!ConnectionTimingHelpers.field_a.ensureIndexLoaded(113)) {
          return QuickChatHelpDialog.field_Kb;
        }
        if (!ConnectionTimingHelpers.field_a.loadGroupByName("commonui", (byte) -119)) {
          return TextMetricsGlobals.field_a + " - " + ConnectionTimingHelpers.field_a.getGroupProgressByName("commonui", true) + "%";
        }
        if (!LinkTextPainter.field_b.ensureIndexLoaded(param0 ^ -31270)) {
          return BufferedSocket.field_a;
        }
        if (!LinkTextPainter.field_b.areAllGroupsLoaded(false)) {
          return QueuedListRequest.field_w + " - " + LinkTextPainter.field_b.getOverallProgress(22300) + "%";
        }
        return WidgetStyleLayer.field_m;
    }

    public static void releaseStatics(int param0) {
        if (param0 < 12) {
          field_a = (GameKeyHandler) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_d = 0;
        field_b = "Show players in <%0>'s game";
        field_a = new GameKeyHandler();
    }
}
