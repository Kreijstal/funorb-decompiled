/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sn extends pu {
    static UiComponent field_l;
    static UiComponent field_m;

    public static void releaseStatics(int param0) {
        field_l = null;
        if (param0 > -88) {
          field_l = (UiComponent) null;
          field_m = null;
          return;
        }
        field_m = null;
    }

    final static boolean c(int param0) {
        if (param0 <= 44) {
          sn.c(-66);
          if (20 > SuperSpeedAllEvent.field_r) {
            return true;
          }
          if (!gw.a((byte) 110)) {
            return true;
          }
          if (rja.field_o <= 0) {
            return false;
          }
          if (!FullHealAnimation.e(37)) {
            return true;
          }
          return false;
        }
        if (20 > SuperSpeedAllEvent.field_r) {
          return true;
        }
        if (!gw.a((byte) 110)) {
          return true;
        }
        if (rja.field_o <= 0) {
          return false;
        }
        if (!FullHealAnimation.e(37)) {
          return true;
        }
        return false;
    }

    static {
    }
}
