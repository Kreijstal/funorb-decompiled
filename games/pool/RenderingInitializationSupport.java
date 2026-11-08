/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RenderingInitializationSupport {
    static String muChatGameFriends;
    static String[] achievementNames;
    static int field_b;
    static byte[] field_c;
    static UiComponent field_d;

    final static boolean a(byte param0) {
        if (param0 >= -11) {
          field_d = (UiComponent) null;
          return LoginPayload.field_b;
        }
        return LoginPayload.field_b;
    }

    static int bitwiseOr(int param0, int param1) {
        return param0 | param1;
    }

    final static void initializeRendering(int param0) {
        TriangleRasterizer.setBrightness(0.6000000238418579f);
        TriangleRasterizer.useRasterClip();
        TriangleRasterizer.setProjectionCenter(320, 240);
        ViewportController.field_q.field_k = 0;
        TriangleRasterizer.setTextureProvider(new TextureCache(NetworkGameClient.field_F, ViewportController.field_q, param0, 128));
        ResourceArchive.a(0);
    }

    public static void releaseStatics(boolean param0) {
        achievementNames = null;
        field_d = null;
        if (param0) {
          muChatGameFriends = null;
          field_c = null;
          return;
        }
        RenderingInitializationSupport.a((byte) -8);
        muChatGameFriends = null;
        field_c = null;
    }

    static {
        muChatGameFriends = "Show game chat from my friends";
        achievementNames = new String[]{"Double Pot", "Snooker-fly", "Snooker-fly Pot", "Planter", "Master Gardener", "The Cover-up", "Barnstorming", "Shut-out", "Perfect 9", "Nine-to-One", "Pool Shark", "Hustler", "Hot Pocket", "Magic Pockets", "The Smell of Money", "The Colour of Money", "The Feel of Money ", "Black Belter", "Around the World in Eighty Pots", "Plan 9: the Perfect Break", "Beat the Clock", "Clean Break", "One-break Wonder", "Beat the Clock, Unguided", "Clean Break, Unguided", "One-break Wonder, Unguided", "Bury the Undead"};
        field_b = 480;
    }
}
