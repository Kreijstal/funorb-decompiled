/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class PendingIntArrayRequest extends IntrusiveNode {
    static int field_o;
    static ArticulatedPart field_v;
    static java.lang.reflect.Constructor field_u;
    static RgbSprite[] field_p;
    int[] field_s;
    static int field_q;
    static RgbSprite field_r;
    boolean field_t;

    final static String getCurrentAccountName(int param0) {
        if (DiskCacheWorker.field_j == AccountTermsPanel.field_ab) {
          return kf.field_o;
        }
        if (!gf.field_a.isComplete((byte) -72)) {
          return gf.field_a.getName(true);
        }
        if (AccountTermsPanel.field_ab == jn.field_b) {
          return gf.field_a.getName(true);
        }
        if (param0 >= 80) {
          return LobbyPlayer.field_Xb;
        }
        PendingIntArrayRequest.getCurrentAccountName(-61);
        return LobbyPlayer.field_Xb;
    }

    public static void releaseStatics(int param0) {
        field_r = null;
        if (param0 == 0) {
          field_p = null;
          field_v = null;
          field_u = null;
          return;
        }
        field_o = 50;
        field_p = null;
        field_v = null;
        field_u = null;
    }

    final static SceneWidget getActiveOverlayWidget(byte param0) {
        if (fj.field_f > 0) {
          return Js5NetworkRequest.field_L;
        }
        if (bd.field_c > 0) {
          return Js5NetworkRequest.field_L;
        }
        if (param0 != -66) {
          PendingIntArrayRequest.getActiveOverlayWidget((byte) 61);
          return null;
        }
        return null;
    }

    PendingIntArrayRequest() {
        this.field_t = false;
    }

    static {
        field_o = 5;
        field_p = new RgbSprite[110];
    }
}
