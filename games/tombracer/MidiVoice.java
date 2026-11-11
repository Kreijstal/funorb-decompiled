/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiVoice extends IntrusiveNode {
    int field_w;
    int field_z;
    bq field_v;
    int field_q;
    int field_s;
    int field_A;
    int field_o;
    PcmSample field_n;
    int field_r;
    int field_p;
    PcmSampleStream field_x;
    int field_h;
    static String field_j;
    int field_f;
    int field_B;
    int field_u;
    int field_l;
    int field_k;
    static int field_g;
    int field_t;
    int field_i;
    int field_m;
    MidiPatch field_y;

    public static void releaseStatics(int param0) {
        field_j = null;
        if (param0 >= -64) {
          MidiVoice.releaseStatics(36);
        }
    }

    final void clearReferences(int param0) {
        this.field_x = null;
        this.field_n = null;
        this.field_y = null;
        if (param0 != 5806) {
          return;
        }
        this.field_v = null;
    }

    MidiVoice() {
    }

    static {
        field_j = "Password: ";
        field_g = 64;
    }
}
