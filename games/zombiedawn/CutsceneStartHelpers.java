/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class CutsceneStartHelpers {
    static int field_b;
    static String field_a;

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 0) {
          CutsceneStartHelpers.releaseStatics(-78);
        }
    }

    final static void startCutscene(int param0, int param1) {
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = ZombieDawn.field_J;
        try {
          ExceptionWrapper.field_e = param1;
          if (param0 == ExceptionWrapper.field_e) {
            LoginMethodCookieHelpers.field_c = new RopeLadder(-28 + UiContainer.field_A.getX(true), 8 + UiContainer.field_A.getY(237239984));
            NetworkArchiveRequest.field_A = false;
            LevelSelectScreen.field_t = new GlassShard[100];
            for (var2_int = 0; var2_int < 100; var2_int++) {
              var3 = SpriteEffectHelpers.randomInt(8192);
              var4 = SpriteEffectHelpers.randomInt(90);
              var5 = (var4 * WorldObject.cosFixed(1311979239, var3) >> 16) + 480;
              var6 = 490 + (var4 * DropTargetWidget.cosine(true, var3) >> 16);
              LevelSelectScreen.field_t[var2_int] = new GlassShard(var5, var6, -15 + SpriteEffectHelpers.randomInt(30));
            }
          }
          CutsceneStateHelpers.setCutsceneActive(true, param0 + 111);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "qm.A(" + param0 + ',' + param1 + ')');
        }
    }

    static {
        field_a = "abcdefghijklmnopqrstuvwxyzABCDEFGHIJKLMNOPQRSTUVWXYZ0123456789";
    }
}
