/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MidiNote extends IntrusiveNode {
    int field_p;
    static BufferedSocket field_l;
    int field_z;
    InstrumentPatch field_y;
    int field_t;
    int field_A;
    int field_q;
    int field_g;
    int field_m;
    int field_s;
    int field_k;
    int field_f;
    int field_n;
    int field_u;
    PcmSample field_x;
    int field_i;
    int field_v;
    int field_j;
    InstrumentEnvelope field_r;
    int field_h;
    static int field_o;
    int field_w;
    PcmSampleStream field_e;

    final void a(int param0) {
        this.field_y = null;
        this.field_e = null;
        this.field_r = null;
        if (param0 == 11821) {
          this.field_x = null;
          return;
        }
        this.field_v = -33;
        this.field_x = null;
    }

    public static void a(byte param0) {
        field_l = null;
        if (param0 < 96) {
          MidiNote.a((byte) -80);
        }
    }

    MidiNote() {
    }

    static {
    }
}
