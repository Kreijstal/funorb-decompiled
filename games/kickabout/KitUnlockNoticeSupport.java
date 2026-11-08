/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class KitUnlockNoticeSupport {
    static String field_a;
    static String field_b;

    final static void enqueueLockedKitNotice(byte param0, int param1) {
        String var2 = IsSixCommand.field_G[35];
        String var4 = var2;
        var4 = var2;
        String var3 = ProxyAuthenticationRequiredException.field_a[param1];
        if (param0 == -98) {
          if (FadingSoundSupport.field_a[param1]) {
            var3 = NetworkGameClient.field_w;
            var4 = var3;
            var4 = var3;
          }
          var4 = LoginDialog.substitutePlaceholders(-18, ListingRowCache.field_e[35], new String[]{AvailabilityCheckRequest.field_c[param1], var3});
          if (GoalkeeperAiSupport.field_a[param1] &&
            !ClientPacketFlushSupport.isBitSet(param1, 0, BufferedSocket.field_f)) {
            var4 = ContextMenuItem.field_Gb;
          }
          ScrollPane.field_Jb.addLast(new MessageDialog(35, (PopupCard) null, var2, var4), 3);
          return;
        }
        field_b = (String) null;
        if (FadingSoundSupport.field_a[param1]) {
          var3 = NetworkGameClient.field_w;
          var4 = var3;
          var4 = var3;
        }
        var4 = LoginDialog.substitutePlaceholders(-18, ListingRowCache.field_e[35], new String[]{AvailabilityCheckRequest.field_c[param1], var3});
        if (GoalkeeperAiSupport.field_a[param1] &&
          !ClientPacketFlushSupport.isBitSet(param1, 0, BufferedSocket.field_f)) {
          var4 = ContextMenuItem.field_Gb;
        }
        ScrollPane.field_Jb.addLast(new MessageDialog(35, (PopupCard) null, var2, var4), 3);
    }

    final static boolean handleSharedPromptKey(int param0) {
        if (param0 <= 39) {
          KitUnlockNoticeSupport.enqueueLockedKitNotice((byte) 2, -21);
          if (null == StreetSceneryLoader.field_m) {
            return false;
          }
          if (StreetSceneryLoader.field_m.handleNameInputKey((byte) 16)) {
            return true;
          }
          return false;
        }
        if (null == StreetSceneryLoader.field_m) {
          return false;
        }
        if (StreetSceneryLoader.field_m.handleNameInputKey((byte) 16)) {
          return true;
        }
        return false;
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_b = (String) null;
          field_b = null;
          field_a = null;
          return;
        }
        field_b = null;
        field_a = null;
    }

    static {
        field_b = "The team captain is choosing a formation.";
        field_a = "Show players in <%0>'s game";
    }
}
