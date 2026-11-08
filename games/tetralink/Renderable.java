/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class Renderable {
    static double field_b;
    static String field_c;
    static String field_a;
    static Js5Transport field_e;
    static boolean field_d;

    public static void releaseStatics(int param0) {
        field_c = null;
        int var1 = 75 % ((62 - param0) / 63);
        field_a = null;
        field_e = null;
    }

    final static void advanceIntroTimer(int param0) {
        if (0 - ClientException.field_f == SingleChildWidget.field_K) {
          if (param0 < -29) {
            SingleChildWidget.field_K = SingleChildWidget.field_K + 1;
            return;
          }
          Renderable.releaseStatics(-111);
          SingleChildWidget.field_K = SingleChildWidget.field_K + 1;
          return;
        }
        if (250 - ClientException.field_f != SingleChildWidget.field_K) {
          if (param0 < -29) {
            SingleChildWidget.field_K = SingleChildWidget.field_K + 1;
            return;
          }
          Renderable.releaseStatics(-111);
          SingleChildWidget.field_K = SingleChildWidget.field_K + 1;
          return;
        }
        if (param0 < -29) {
          SingleChildWidget.field_K = SingleChildWidget.field_K + 1;
          return;
        }
        Renderable.releaseStatics(-111);
        SingleChildWidget.field_K = SingleChildWidget.field_K + 1;
    }

    static {
        field_b = Math.sqrt(2.0) / 2.0;
        field_c = "You are offering a rematch.";
        field_a = "White";
        field_d = false;
    }
}
