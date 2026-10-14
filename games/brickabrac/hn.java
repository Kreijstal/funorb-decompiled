/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hn {
    static int field_a;
    static RgbSprite ninjaFarSprite;

    public static void a(int param0) {
        int var1 = 125 % ((28 - param0) / 60);
        ninjaFarSprite = null;
    }

    final static boolean b(byte param0) {
        if (param0 != 7) {
          return true;
        }
        return o.currentLobbyGame.protocolId64 == Widget.field_p ? true : false;
    }

    final static RgbSprite[] a(int param0, int param1, int param2, int param3) {
        RgbSprite[] var7 = null;
        RgbSprite[] var4 = null;
        int var5 = 0;
        int var6 = BrickABrac.field_J ? 1 : 0;
        RgbSprite[] var7Lifetime1;
        RgbSprite[] var4Lifetime1;
        int var5Lifetime1;
        if (param3 != -10) {
          hn.a(22, -77, 60, 46);
        } else {
          var7 = new RgbSprite[9];
          var4 = var7;
          var7[0] = hd.a(param0, param2, (byte) -6);
          for (var5 = 1; var5 < 9; var5++) {
            var7[var5] = var7[0];
          }
          var4[4] = hd.a(param1, 64, (byte) -6);
          return var4;
        }
        var7Lifetime1 = new RgbSprite[9];
        var4Lifetime1 = var7Lifetime1;
        var7Lifetime1[0] = hd.a(param0, param2, (byte) -6);
        for (var5Lifetime1 = 1; var5Lifetime1 < 9; var5Lifetime1++) {
          var7Lifetime1[var5Lifetime1] = var7Lifetime1[0];
        }
        var4Lifetime1[4] = hd.a(param1, 64, (byte) -6);
        return var4Lifetime1;
    }

    final static void a(byte param0) {
        if (eq.gameTransport != null) {
          eq.gameTransport.close((byte) 113);
          eq.gameTransport = null;
        }
        if (param0 < 49) {
          ninjaFarSprite = (RgbSprite) null;
          return;
        }
    }

    final static void a(UiComponent param0, UiComponent param1, int param2) {
        try {
          if (param1.children == null) {
            param1.children = new NodeDeque();
          }
          int var3_int = -102 / ((param2 + 58) / 50);
          if (param0.children == null) {
            param0.children = new NodeDeque();
          }
          if (null == BlankScreen.friendIndex) {
            BlankScreen.friendIndex = new SecondaryHashTable(64);
          }
          if (FullscreenFailureKind.ignoreIndex == null) {
            FullscreenFailureKind.ignoreIndex = new SecondaryHashTable(64);
          }
          ToggleButtonWidget.friendEntries = param1.children;
          CachedArchiveSource.ignoreEntries = param0.children;
          EmailConfirmationValidator.e(108);
        } catch (RuntimeException runtimeException) {
          throw FarmBackground.addExceptionContext((Throwable) ((Object) runtimeException), "hn.E(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
    }
}
