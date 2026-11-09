/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ListContent implements MenuContent {
    static String field_c;
    static int[] field_b;
    MenuList[] field_h;
    MenuButton[] field_i;
    static String field_e;
    static String field_d;
    static String field_a;
    static boolean field_g;
    SpriteButton[][] field_f;

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (LoginMethodPreference.field_g) {
          return wi.field_c.a(oq.field_j, ho.field_h, true);
        }
        if (QuickChatCategoryDefinition.field_t) {
          return QuickChatCategoryDefinition.a(-85, param1, param3);
        }
        if (MouseInputHandler.a(param0 ^ 5, param3, param1)) {
          return true;
        }
        if (ae.field_b) {
          return false;
        }
        if (param0 == 4) {
          return ByteArrayStorage.a(param1, param2, false);
        }
        field_d = (String) null;
        return ByteArrayStorage.a(param1, param2, false);
    }

    final static void a(int param0) {
        hd var1 = null;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1_ref = null;
        var2 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (null == DirectByteArrayStorage.field_h) {
            return;
          }
          var1 = (hd) (DirectByteArrayStorage.field_h.startForward(param0));
          while (var1 != null) {
            if (0 > var1.field_h) {
              var1.unlink((byte) -70);
            }
            var1 = (hd) (DirectByteArrayStorage.field_h.nextForward((byte) -71));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw UrlLoader.wrapThrowable((Throwable) ((Object) var1_ref), "ph.B(" + param0 + ')');
        }
    }

    final static void a(Archive param0, int param1) {
        try {
          DialogRoot.a((byte) 23, param0.getFileByName(true, "tutorial.txt", ""));
          int var2_int = -90 / ((param1 + 9) / 32);
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ph.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void clearStatics(byte param0) {
        field_d = null;
        field_a = null;
        field_c = null;
        field_e = null;
        field_b = null;
        int var1 = -96 / ((param0 - 53) / 46);
    }

    ListContent(int param0) {
        this.field_h = new MenuList[param0];
        this.field_f = new SpriteButton[param0][-1 + param0];
        this.field_i = new MenuButton[param0 - 1];
    }

    static {
        field_c = "Invite players";
        field_e = "Login: ";
        field_b = new int[4];
        field_a = "Overview";
        field_d = "Fleets in motion";
    }
}
