/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class GameTransportHelpers {
    static int fullscreenDialogPaddingX;
    static RgbSprite ninjaFarSprite;

    public static void clearSharedReferences(int obfuscationGuard) {
        int var1 = 125 % ((28 - obfuscationGuard) / 60);
        ninjaFarSprite = null;
    }

    final static boolean isCurrentGameCompatible(byte param0) {
        if (param0 != 7) {
          return true;
        }
        return ClientResourceHelpers.currentLobbyGame.protocolId64 == Widget.field_p ? true : false;
    }

    final static RgbSprite[] createSolidSpriteGrid(int edgeColor, int centerColor, int edgeSize, int obfuscationGuard) {
        RgbSprite[] var7 = null;
        RgbSprite[] var4 = null;
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        RgbSprite[] var7Lifetime1;
        RgbSprite[] var4Lifetime1;
        int var5Lifetime1;
        if (obfuscationGuard != -10) {
          GameTransportHelpers.createSolidSpriteGrid(22, -77, 60, 46);
        } else {
          var7 = new RgbSprite[9];
          var4 = var7;
          var7[0] = InvitationDialogHelpers.createSolidSprite(edgeColor, edgeSize, (byte) -6);
          for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
          }
          var4[4] = InvitationDialogHelpers.createSolidSprite(centerColor, 64, (byte) -6);
          return var4;
        }
        var7Lifetime1 = new RgbSprite[9];
        var4Lifetime1 = var7Lifetime1;
        var7Lifetime1[0] = InvitationDialogHelpers.createSolidSprite(edgeColor, edgeSize, (byte) -6);
        for (var5Lifetime1 = 1; var5Lifetime1 < 9; var5Lifetime1++) {
          var7Lifetime1[var5Lifetime1] = var7Lifetime1[0];
        }
        var4Lifetime1[4] = InvitationDialogHelpers.createSolidSprite(centerColor, 64, (byte) -6);
        return var4Lifetime1;
    }

    final static void closeGameTransport(byte obfuscationGuard) {
        if (WhirlpoolHasher.gameTransport != null) {
          WhirlpoolHasher.gameTransport.close((byte) 113);
          WhirlpoolHasher.gameTransport = null;
        }
        if (obfuscationGuard < 49) {
          ninjaFarSprite = (RgbSprite) null;
          return;
        }
    }

    final static void bindSocialListEntries(UiComponent ignoreListContent, UiComponent friendsListContent, int obfuscationGuard) {
        try {
          if (friendsListContent.children == null) {
            friendsListContent.children = new NodeDeque();
          }
          int var3_int = -102 / ((obfuscationGuard + 58) / 50);
          if (ignoreListContent.children == null) {
            ignoreListContent.children = new NodeDeque();
          }
          if (null == BlankScreen.friendIndex) {
            BlankScreen.friendIndex = new SecondaryHashTable(64);
          }
          if (FullscreenFailureKind.ignoreIndex == null) {
            FullscreenFailureKind.ignoreIndex = new SecondaryHashTable(64);
          }
          ToggleButtonWidget.friendEntries = friendsListContent.children;
          CachedArchiveSource.ignoreEntries = ignoreListContent.children;
          EmailConfirmationValidator.clearSocialLists(108);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hn.E(" + (ignoreListContent != null ? "{...}" : "null") + ',' + (friendsListContent != null ? "{...}" : "null") + ',' + obfuscationGuard + ')');
        }
    }

    static {
    }
}
