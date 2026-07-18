/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jb {
    static String[] field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static void a(String param0, int param1) {
        System.out.println("Error: " + eh.a("%0a", -104, "\n", param0));
    }

    public static void a(int param0) {
        if (param0 != -27134) {
            jb.a(-25);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new String[]{"Player_engine_loop1", "npc_prop_engine_loop1", "npc_prop_engine_loop2", "npc_big_plane_engine_loop1", "npc_jet_engine_loop1", "npc_jet_engine_loop2", "ufo_engine_loop"};
    }
}
