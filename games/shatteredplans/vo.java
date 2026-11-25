/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vo {
    static String field_c;
    static String field_a;
    static int field_b;

    public static void clearStatics(int param0) {
        field_a = null;
        field_c = null;
        if (param0 != 256) {
          vo.clearStatics(45);
        }
    }

    final static void a(Archive param0, Archive param1, int param2) {
        try {
          LobbyPlayerEntry.field_Sb = new SoundCache(param1, param0);
          SoundEffectSupport.loadSoundEffectDefinition(param2 + 28, 153, "shatteredplans_menu_open");
          SoundEffectSupport.loadSoundEffectDefinition(128, 153, "shatteredplans_menu_close");
          us.field_d = SoundEffectSupport.loadSoundEffectDefinition(128, 256, "shatteredplans_ship_selection");
          StandardMapGenerator.field_l = SoundEffectSupport.loadSoundEffectDefinition(128, 256, "shatteredplans_ship_move_order");
          ConquestVictoryChecker.field_l = SoundEffectSupport.loadSoundEffectDefinition(128, 256, "shatteredplans_ship_attack_order");
          SocketArchiveNetworkClient.field_w = SoundEffectSupport.loadSoundEffectDefinition(128, 256, "shatteredplans_factory_noise");
          TertiaryListSequence.field_m = ConquestVictoryChecker.a((byte) -111, 120, "shatteredplans_explosion");
          SoundEffectSupport.loadSoundEffectDefinition(128, param2, "shatteredplans_tab_open");
          SoundEffectSupport.loadSoundEffectDefinition(128, 100, "shatteredplans_tab_close");
          ScrollPane.field_yb = SoundEffectSupport.loadSoundEffectDefinition(param2 ^ 228, 256, "shatteredplans_next_open");
          sf.field_g = SoundEffectSupport.loadSoundEffectDefinition(128, 256, "shatteredplans_next_close");
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "vo.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_c = "Right click to cancel the <%0> at <%1>";
        field_a = "Battles lost in friendly space.";
    }
}
