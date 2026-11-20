/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PointLight extends IntrusiveNode {
    int layer;
    static boolean field_k;
    boolean enabled;
    static PlatformTaskDispatcher field_s;
    static Sprite field_t;
    int y;
    static SpriteSheetAsset field_q;
    static NineSlicePanel field_p;
    int radius;
    int x;
    static String field_o;
    static int[] field_r;

    final static void queueAchievementUnlock(int param0, AchievementUnlockRequest param1, byte param2) {
        try {
          AccountFormText.field_c.addLast((byte) -105, param1);
          NanoTickClock.sendAchievementUnlock(1, param0, param1);
          if (param2 != -79) {
            PointLight.clearSharedReferences(54);
          }
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "na.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void clearSharedReferences(int param0) {
        field_r = null;
        field_t = null;
        field_o = null;
        field_q = null;
        field_s = null;
        field_p = null;
        if (param0 >= -70) {
          field_q = (SpriteSheetAsset) null;
        }
    }

    PointLight(int param0, int param1, int param2, int param3, Sprite param4) {
        try {
          this.x = param0;
          this.enabled = false;
          this.radius = param3;
          this.y = param1;
          this.layer = param2;
        } catch (RuntimeException runtimeException) {
          throw EntitySound.wrapException((Throwable) ((Object) runtimeException), "na.<init>(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_k = false;
        field_o = "Creating your account";
        field_r = new int[128];
    }
}
