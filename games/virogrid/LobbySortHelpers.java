/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class LobbySortHelpers {
    static String textEndgameResignedYou;
    static int field_g;
    int field_d;
    static boolean field_h;
    static int field_e;
    static String hotseatoptionGridwidthColon;
    static String[] field_c;
    int field_b;
    int field_f;
    static int[] field_j;

    final static int getListContentHeight(boolean param0) {
        if (!param0) {
          hotseatoptionGridwidthColon = (String) null;
          return CheckboxPainter.field_g;
        }
        return CheckboxPainter.field_g;
    }

    final static void insertSortedLobbyGame(boolean param0, LobbyGame param1) {
        LobbyGame var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var3 = Virogrid.field_F ? 1 : 0;
        try {
          param1.unlink(param0);
          var2 = (LobbyGame) (ProxyAuthenticationRequiredException.field_f.first((byte) -126));
          while (var2 != null) {
            if (var2.sortsBefore(param1, -12712)) {
              var2 = (LobbyGame) (ProxyAuthenticationRequiredException.field_f.next(16213));
              continue;
            }
            break;
          }
          if (var2 != null) {
            CanvasPresentHelpers.insertAfter(var2, (byte) 89, param1);
            return;
          }
          ProxyAuthenticationRequiredException.field_f.addFirst(param1, (byte) -42);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_11_0 = var2_ref;
          stackIn_11_1 = new StringBuilder().append("pg.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw AsyncCheckResult.wrapException((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    public static void releaseStatics(int param0) {
        field_c = null;
        field_j = null;
        textEndgameResignedYou = null;
        if (param0 != 8192) {
          LobbySortHelpers.isRankedPlayUnavailable((byte) 74);
          hotseatoptionGridwidthColon = null;
          return;
        }
        hotseatoptionGridwidthColon = null;
    }

    final static String getPendingResultMessage(int param0) {
        if (param0 != -1) {
          field_g = -109;
          return TriangleSortHelpers.field_a;
        }
        return TriangleSortHelpers.field_a;
    }

    final static boolean isRankedPlayUnavailable(byte param0) {
        int var1 = -1 / ((-93 - param0) / 33);
        if (VerticalScrollbar.isGuestSession(20)) {
          return true;
        }
        if (NameCharacterHelpers.field_d > 0) {
          return false;
        }
        return true;
    }

    static {
        textEndgameResignedYou = "You resigned";
        hotseatoptionGridwidthColon = "Grid width: <%0>";
        field_c = new String[]{"Jan", "Feb", "Mar", "Apr", "May", "Jun", "Jul", "Aug", "Sep", "Oct", "Nov", "Dec"};
        field_j = new int[8192];
    }
}
