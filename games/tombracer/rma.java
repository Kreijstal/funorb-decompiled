/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rma {
    static UiComponent field_b;
    static String field_a;

    final static void startLoginAttempt(boolean param0, String param1, String param2, byte param3) {
        ConstrainToLatticeLocomotor.field_u = param2;
        if (param3 < 66) {
          return;
        }
        try {
          ScrollControlWidget.field_E = param1;
          vn.showMessageDialog(108, HardwareModel.field_bb, param0);
        } catch (RuntimeException runtimeException) {
          throw MonochromeRowCacheEntry.wrapException((Throwable) ((Object) runtimeException), "rma.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static String readFreeLevelBanner(int param0) {
        int var1 = 9 / ((param0 - 74) / 41);
        return GameFontMetrics.loadLevelFile(true, "\\\\contentfs\\mgcontent_v4\\WIP\\tombracer\\src\\freelevels\\banner.trlev");
    }

    public static void releaseStatics(int param0) {
        field_b = null;
        field_a = null;
        if (param0 != 13902) {
          field_b = (UiComponent) null;
        }
    }

    static {
        field_a = "Enter the name you'd prefer. This is the name displayed to other players.";
    }
}
