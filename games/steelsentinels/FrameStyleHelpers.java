/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FrameStyleHelpers {
    static int field_c;
    static String field_b;
    static String field_d;
    static int field_e;
    static String field_f;
    static String field_a;

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          return;
        }
        field_a = null;
        field_f = null;
        field_b = null;
        field_d = null;
    }

    final static void setMenuButtonStyle(SpriteFrame param0, int param1, int param2, SpriteFrame param3, int param4, int param5) {
        try {
          SectorCacheStore.field_j = param1;
          MembershipPromotionScreen.field_m = param2;
          if (param4 >= -122) {
            SpriteFrame var7 = (SpriteFrame) null;
            FrameStyleHelpers.setMenuButtonStyle((SpriteFrame) null, -18, -91, (SpriteFrame) null, 27, -75);
          }
          vd.field_f = param0;
          ud.field_y = param5;
          TextAndMenuHelpers.field_c = param3;
        } catch (RuntimeException runtimeException) {
          throw ClientErrorSupport.addExceptionContext((Throwable) ((Object) runtimeException), "hf.D(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ',' + param5 + ')');
        }
    }

    final static void updateMainPanelWidget(boolean param0, int param1) {
        if (param1 == 1) {
          LoginActionHelpers.field_a.drawFullScreen(param0, (byte) 127);
          return;
        }
        FrameStyleHelpers.buildBevelFrame(-30, 29, 66, -59, false);
        LoginActionHelpers.field_a.drawFullScreen(param0, (byte) 127);
    }

    final static RgbSprite[] buildBevelFrame(int param0, int param1, int param2, int param3, boolean param4) {
        if (param4) {
          return ArrayWidgetContainer.a(3, 1, 4, param2, param1, param3, param0, 1, 1);
        }
        SpriteFrame var6 = (SpriteFrame) null;
        FrameStyleHelpers.setMenuButtonStyle((SpriteFrame) null, 52, -37, (SpriteFrame) null, -67, 63);
        return ArrayWidgetContainer.a(3, 1, 4, param2, param1, param3, param0, 1, 1);
    }

    static {
        field_b = "Camera follows sentinel: On";
        field_a = "Slots:<br><%0> <times> <%1>";
        field_e = 20;
        field_d = "Name is available";
        field_f = "Invite more players, or alternatively try changing the '<%0>' setting.";
    }
}
