/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tj {
    byte field_f;
    static String field_h;
    short field_e;
    static int field_c;
    static int field_b;
    byte field_g;
    static int field_a;
    LegacyVertexArray field_d;

    final static java.awt.Container getTopContainer(int param0) {
        if (null != DropdownList.field_x) {
          return (java.awt.Container) ((Object) DropdownList.field_x);
        }
        if (param0 == 25128) {
          return (java.awt.Container) ((Object) di.getApplet(param0 - 25099));
        }
        field_c = -12;
        return (java.awt.Container) ((Object) di.getApplet(param0 - 25099));
    }

    public static void releaseStatics(int param0) {
        if (param0 != 360) {
          field_a = 58;
          field_h = null;
          return;
        }
        field_h = null;
    }

    tj(LegacyVertexArray param0, int param1, int param2, int param3) {
        try {
          this.field_g = (byte)param3;
          this.field_e = (short)param1;
          this.field_d = param0;
          this.field_f = (byte)param2;
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "tj.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_h = "Unfortunately there was a focus problem while setting fullscreen mode. You could try disabling any multiple monitor drivers or window enhancements, if you have any enabled, or try a different resolution.";
        field_b = 360;
        field_a = 4;
    }
}
