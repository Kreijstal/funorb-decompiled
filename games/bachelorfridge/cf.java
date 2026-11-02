/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static String field_a;
    static UiComponent field_b;

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void releaseStatics(int param0) {
        field_a = null;
        if (param0 != 0) {
          field_a = (String) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    final static void a(boolean param0, int param1, boolean param2, byte param3) {
        int var5 = BachelorFridge.field_y;
        if (param1 == -1) {
          BoardChange.a(param0, true);
          if (param3 >= 13) {
            return;
          }
          cf.releaseStatics(-81);
          return;
        }
        if (-3 == param1) {
          BoardChange.a(param0, true);
          if (param3 >= 13) {
            return;
          }
          cf.releaseStatics(-81);
          return;
        }
        if (-2 == param1) {
          SoftwareRasterizer.clear();
          if (param3 >= 13) {
            return;
          }
          cf.releaseStatics(-81);
          return;
        }
        if (param2) {
          BoardChange.a(false, true);
          SoftwareRasterizer.darkenRectangle(0, 0, 640, 480);
          LevitateSpecial.field_p[param1].l(9);
          if (param3 >= 13) {
            return;
          }
          cf.releaseStatics(-81);
          return;
        }
        LevitateSpecial.field_p[param1].l(9);
        if (param3 >= 13) {
          return;
        }
        cf.releaseStatics(-81);
    }

    static {
        field_a = "OUT";
    }
}
