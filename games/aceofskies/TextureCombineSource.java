/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class TextureCombineSource {
    static String[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void printClientError(String param0, int param1) {
        System.out.println("Error: " + AchievementStateRequest.replaceSubstring("%0a", -104, "\n", param0));
        if (param1 != 20164) {
          field_a = (String[]) null;
        }
    }

    public static void clearTextureCombineSourceStatics(int param0) {
        if (param0 != -27134) {
          TextureCombineSource.clearTextureCombineSourceStatics(-25);
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_a = new String[]{"Player_engine_loop1", "npc_prop_engine_loop1", "npc_prop_engine_loop2", "npc_big_plane_engine_loop1", "npc_jet_engine_loop1", "npc_jet_engine_loop2", "ufo_engine_loop"};
    }
}
