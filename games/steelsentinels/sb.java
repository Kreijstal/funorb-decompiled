/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sb extends oa {
    static int field_Z;
    static he field_bb;
    static int[] field_V;
    static SceneWidget field_Y;
    static RgbSprite field_W;
    static SceneWidget field_ab;
    static RgbSprite[] field_X;

    public static void g(int param0) {
        field_bb = null;
        if (param0 >= 92) {
          field_ab = null;
          field_X = null;
          field_V = null;
          field_Y = null;
          field_W = null;
          return;
        }
        sb.g(-16);
        field_ab = null;
        field_X = null;
        field_V = null;
        field_Y = null;
        field_W = null;
    }

    sb(String param0, tn param1, boolean param2) {
        this(param0, param1);
        try {
          this.field_T = param2 ? true : false;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    private sb(String param0, qk param1, tn param2) {
        super(param0, param1, param2);
        try {
          this.field_p = ad.field_j.field_x;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(int param0, byte param1, int param2, int param3) {
        this.field_T = !this.field_T ? true : false;
        super.b(param0, (byte) -127, param2, param3);
        if (param1 < -122) {
          return;
        }
        this.b(-25, (byte) 43, -53, 29);
    }

    final static void a(boolean param0) {
        nn.a(param0);
        fg.a(10, db.field_b, dh.field_y[0].field_z, da.field_g, ua.field_G, te.field_b);
    }

    private sb(String param0, tn param1) {
        this(param0, ad.field_j.field_f, param1);
        try {
          this.field_p = ad.field_j.field_x;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "sb.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_V = new int[8192];
    }
}
