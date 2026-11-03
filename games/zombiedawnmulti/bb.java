/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bb extends IntrusiveNode {
    long field_j;
    static String field_h;
    static UiComponent field_k;
    static String field_o;
    static Sprite field_n;
    int field_l;
    static String field_m;
    static MusicTrack field_g;
    static String field_i;
    byte[] field_f;

    public static void a(int param0) {
        if (param0 == -18535) {
          field_h = null;
          field_g = null;
          field_n = null;
          field_m = null;
          field_o = null;
          field_i = null;
          field_k = null;
          return;
        }
        bb.c(-69);
        field_h = null;
        field_g = null;
        field_n = null;
        field_m = null;
        field_o = null;
        field_i = null;
        field_k = null;
    }

    final static String c(int param0) {
        if (dj.field_k == SceneObject.field_B) {
          return am.field_a;
        }
        if (param0 != -19385) {
          return (String) null;
        }
        return s.field_a;
    }

    bb(long param0, int param1, byte[] param2) {
        try {
          this.field_j = param0;
          this.field_f = param2;
          this.field_l = param1;
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bb.<init>(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_m = "Come ready for battle.";
        field_h = "Deadly skills!";
        field_o = "Waiting for patches";
        field_i = "Foil their plans.";
    }
}
