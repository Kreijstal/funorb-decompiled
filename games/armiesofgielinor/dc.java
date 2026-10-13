/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends IntrusiveNode {
    static String field_l;
    int field_p;
    int[] field_m;
    int[] field_v;
    PlatformTask[] field_k;
    PlatformTask[] field_r;
    static RgbSprite field_n;
    byte[][][] field_u;
    static String field_s;
    static long field_o;
    int[] field_t;
    int field_q;

    final static void a(java.awt.Component param0, int param1) {
        try {
          if (param1 > -25) {
            dc.a(false, false);
          }
          param0.removeMouseListener(BattleCharacter.pointerInputHandler);
          param0.removeMouseMotionListener(BattleCharacter.pointerInputHandler);
          param0.removeFocusListener(BattleCharacter.pointerInputHandler);
          GridWidgetContainer.heldPointerButton = 0;
        } catch (RuntimeException runtimeException) {
          throw AnimationSkeleton.addExceptionContext((Throwable) ((Object) runtimeException), "dc.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static wd a(boolean param0, boolean param1) {
        wd var2 = null;
        wd var2Lifetime1;
        if (!param1) {
          var2 = new wd(true);
          var2.field_h = param0 ? true : false;
          return var2;
        }
        dc.a(false, false);
        var2Lifetime1 = new wd(true);
        var2Lifetime1.field_h = param0 ? true : false;
        return var2Lifetime1;
    }

    public static void a(int param0) {
        if (param0 == 540) {
          field_s = null;
          field_l = null;
          field_n = null;
          return;
        }
        field_o = 127L;
        field_s = null;
        field_l = null;
        field_n = null;
    }

    dc() {
    }

    static {
        field_l = "Chat is currently disabled.";
        field_n = new RgbSprite(540, 140);
        field_s = "High";
    }
}
