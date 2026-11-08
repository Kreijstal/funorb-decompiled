/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RankingQuery extends IntrusiveNode {
    int field_B;
    static long field_v;
    int field_p;
    int field_s;
    int field_o;
    boolean field_r;
    int[][] field_x;
    int field_t;
    static EmailFormatError field_A;
    static int field_D;
    int field_u;
    String[][] field_z;
    static boolean field_q;
    static String field_w;
    static int field_y;
    static int field_C;

    final static void setTuhstatbutCookie(boolean param0) {
        if (!param0) {
          field_C = -27;
          MusicPatchEnvelope.setTuhstatbutMarker(-128, Projectile.getApplet((byte) -21));
          return;
        }
        MusicPatchEnvelope.setTuhstatbutMarker(-128, Projectile.getApplet((byte) -21));
    }

    final static boolean isLoggedIn(int param0) {
        int var1 = -125 % ((-54 - param0) / 33);
        if (null == rb.field_h) {
          return false;
        }
        if (AccountNoticeDialog.field_sb == PendingAckRequest.field_v) {
          return true;
        }
        return false;
    }

    RankingQuery() {
    }

    public static void releaseStatics(int param0) {
        if (param0 != 20000000) {
          RankingQuery.isLoggedIn(-26);
          field_A = null;
          field_w = null;
          return;
        }
        field_A = null;
        field_w = null;
    }

    static {
        field_v = 20000000L;
        field_A = new EmailFormatError();
    }
}
