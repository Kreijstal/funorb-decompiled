/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class AchievementSubmission extends IntrusiveNode {
    static String field_h;
    int field_j;
    static String field_m;
    int field_g;
    int field_f;
    int field_i;
    static int field_l;
    int field_e;
    int field_k;

    final static void buildTrinketPreviewSprites(int param0) {
        int var1_int = 0;
        ModelMesh var2 = null;
        int var3 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var3 = Kickabout.field_G;
        try {
          LocalizedTextLoader.field_c = new Sprite[AnimationSkeleton.field_g.length];
          if (param0 != 65280) {
            field_l = -68;
          }
          for (var1_int = 0; var1_int < AnimationSkeleton.field_g.length; var1_int++) {
            LocalizedTextLoader.field_c[var1_int] = new Sprite(94, 84);
            var2 = AuctionsHelpScreen.createKitMesh(var1_int, (int) ClubStateFactory.a(255, 63), true, (int) ClubStateFactory.a(65280, param0 - 65217)).createModelMesh(100, 728, 20, -56, -20);
            MeshPreviewSupport.renderMeshPreview(var2, LocalizedTextLoader.field_c[var1_int], var1_int, 40);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw GameSoundEffect.wrapException((Throwable) ((Object) var1), "ii.C(" + param0 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        field_h = null;
        if (param0 != 84) {
          field_m = (String) null;
          field_m = null;
          return;
        }
        field_m = null;
    }

    final static void applyAndQueueManagerAction(ManagerAction param0, int param1) {
        try {
          RegistrationRequestState.field_h.applyAction(param0, AuctionLogEntry.isLoggedInJagexModerator(15137), 0);
          MusicPatchNode.field_h.addLast(param0, 3);
          if (param1 < 47) {
            field_h = (String) null;
          }
        } catch (RuntimeException runtimeException) {
          throw GameSoundEffect.wrapException((Throwable) ((Object) runtimeException), "ii.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void playUiClickSound(byte param0) {
        ShopPlayerSlot.playDefaultFadingSound(48, 36);
        if (param0 >= -116) {
          field_h = (String) null;
        }
    }

    private AchievementSubmission() throws Throwable {
        throw new Error();
    }

    static {
        field_h = "MY KIT";
        field_m = "Connection restored.";
        field_l = 0;
    }
}
