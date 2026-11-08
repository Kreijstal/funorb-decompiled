/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MusicPatchNode extends IntrusiveNode {
    int field_u;
    int field_l;
    int field_h;
    int field_i;
    int field_H;
    int field_I;
    int field_j;
    int field_q;
    static String field_o;
    int field_C;
    PatchEnvelopeSet field_x;
    int field_v;
    static int field_r;
    static int field_s;
    int field_y;
    static IndexedSprite[] field_E;
    MusicPatch field_D;
    static Sprite field_F;
    static int field_g;
    int field_p;
    PcmSample field_m;
    int field_w;
    int field_t;
    PcmSampleStream field_n;
    int field_k;
    int field_z;
    int field_B;

    final static void a(IndexedSprite param0, byte param1, int param2, byte param3, int param4, int param5, nf param6) {
        try {
          if (param1 != -47) {
            field_o = (String) null;
          }
          DisplayNameForm.a(param5, param0, param2, -19, param6, true, param4, param3);
        } catch (RuntimeException runtimeException) {
          throw aa.wrapException((Throwable) ((Object) runtimeException), "o.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + (param6 != null ? "{...}" : "null") + ')');
        }
    }

    final void b(boolean param0) {
        if (param0) {
          this.field_x = null;
          this.field_n = null;
          this.field_m = null;
          this.field_D = null;
          return;
        }
        this.b(false);
        this.field_x = null;
        this.field_n = null;
        this.field_m = null;
        this.field_D = null;
    }

    final static void a(byte param0) {
        GrowableIntList.field_c.field_i = 0;
        GrowableIntList.field_c.field_o = 0;
        if (param0 != -34) {
          MusicPatchNode.c(false);
        }
    }

    public static void c(boolean param0) {
        if (param0) {
          field_o = null;
          field_E = null;
          field_F = null;
          return;
        }
        field_g = 98;
        field_o = null;
        field_E = null;
        field_F = null;
    }

    MusicPatchNode() {
    }

    static {
        field_s = 0;
        field_o = "Game options";
        field_g = 4;
    }
}
