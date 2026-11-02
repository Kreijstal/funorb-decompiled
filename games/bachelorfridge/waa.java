/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class waa {
    static int field_a;

    final static String a(boolean param0) {
        if (!param0) {
          field_a = 2;
          if (kq.field_j == FridgeScreen.field_p) {
            return em.field_V;
          }
          if (kq.field_j == ReportAbusePanel.field_G) {
            return BagpipeAnimation.field_w;
          }
          if (ut.field_m.a(!param0 ? true : false)) {
            return IncomingSpecial.field_p;
          }
          return BagpipeAnimation.field_w;
        }
        if (kq.field_j == FridgeScreen.field_p) {
          return em.field_V;
        }
        if (kq.field_j == ReportAbusePanel.field_G) {
          return BagpipeAnimation.field_w;
        }
        if (ut.field_m.a(!param0 ? true : false)) {
          return IncomingSpecial.field_p;
        }
        return BagpipeAnimation.field_w;
    }

    final static void b(boolean param0) {
        HomingMissileAnimation.field_G.field_e = 0;
        HomingMissileAnimation.field_G.field_k = 0;
        if (param0) {
          waa.a(-59, 44);
        }
    }

    final static void a(int param0, int param1) {
        if (param0 != 0) {
          field_a = -53;
        }
    }

    static {
    }
}
