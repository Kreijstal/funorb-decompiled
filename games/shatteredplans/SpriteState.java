/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class SpriteState extends DualLinkNode {
    static String field_r;
    int field_t;
    static String field_v;
    int field_x;
    int field_z;
    static String field_s;
    static AnimatedPanel field_u;
    static Sprite field_q;
    int field_w;
    static Sprite field_y;
    int field_o;
    int field_p;

    final static void a(Archive param0, Archive param1, int param2) {
        sf.field_d = MusicTrack.load(param0, "", "shattered_plans_intro");
        wp.field_a = MusicTrack.load(param0, "", "shattered_plans_ingame_two");
        js.field_i = MusicTrack.load(param0, "", "shattered_plans_ingame");
        hk.field_nb = wp.field_a;
        PlacementEvent.field_n = MusicTrack.load(param0, "", "shattered_plans_win");
        wh.field_b = MusicTrack.load(param0, "", "shattered_plans_lose");
        ValidationState.field_b.field_u.preparePatches(param1, sf.field_d, 50, 0, mj.field_Sb);
        ValidationState.field_b.field_u.preparePatches(param1, wp.field_a, 41, 0, mj.field_Sb);
        ValidationState.field_b.field_u.preparePatches(param1, js.field_i, 111, 0, mj.field_Sb);
        if (param2 < 26) {
          return;
        }
        try {
          ValidationState.field_b.field_u.f(256);
          mj.field_Sb = null;
        } catch (RuntimeException runtimeException) {
          throw UrlLoader.wrapThrowable((Throwable) ((Object) runtimeException), "ii.WB(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = this.field_o << 3;
        int var7 = this.field_p << 3;
        param3 = (param3 << 4) + (var6 & 15);
        param1 = (param1 << 4) + (param0 & var7);
        this.rotateNearest(var6, var7, param3, param1, param4, param2);
    }

    public static void e(int param0) {
        field_s = null;
        if (param0 == 997342595) {
          field_y = null;
          field_r = null;
          field_q = null;
          field_v = null;
          field_u = null;
          return;
        }
        Archive var2 = (Archive) null;
        SpriteState.a((Archive) null, (Archive) null, 124);
        field_y = null;
        field_r = null;
        field_q = null;
        field_v = null;
        field_u = null;
    }

    abstract void rotateNearest(int param0, int param1, int param2, int param3, int param4, int param5);

    SpriteState() {
    }

    static {
        field_v = "Discard";
        field_s = "PENDING";
        field_r = "Loading graphics";
    }
}
