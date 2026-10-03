/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc extends IntrusiveNode {
    PcmSample field_i;
    static int keyboardEventFrameEndIndex;
    int field_y;
    int field_l;
    int field_k;
    int field_w;
    int field_q;
    static int field_f;
    int field_g;
    InstrumentPatch field_z;
    int field_E;
    int field_s;
    PcmSampleStream field_u;
    int field_m;
    int field_t;
    int field_h;
    static int archiveLanguageId;
    int field_B;
    int field_r;
    int field_o;
    int field_j;
    int field_D;
    int field_n;
    static int field_v;
    InstrumentEnvelope field_x;

    final static void a(byte param0) {
        int var1 = -125 / ((param0 - 56) / 54);
        jk.a((byte) -90);
        if (null != MessageDialog.gameCanvas) {
            nb.a(-2, MessageDialog.gameCanvas);
            kj.c(-11099);
            hc.b(true);
            dk.a((byte) -121);
            if (vh.g(-88)) {
                fj.field_q.writeCipherByte(1, (byte) -27);
                cm.a(-1, 0);
                Bzip2DecoderState.closeSessionSocket((byte) -126);
                return;
            }
            Bzip2DecoderState.closeSessionSocket((byte) -126);
            return;
        }
        kj.c(-11099);
        hc.b(true);
        dk.a((byte) -121);
        if (!vh.g(-88)) {
            Bzip2DecoderState.closeSessionSocket((byte) -126);
            return;
        }
        fj.field_q.writeCipherByte(1, (byte) -27);
        cm.a(-1, 0);
        Bzip2DecoderState.closeSessionSocket((byte) -126);
    }

    final static void a(int param0, boolean param1) {
        if (param1) {
            archiveLanguageId = 99;
            GzipInflater.field_d = param0;
            return;
        }
        GzipInflater.field_d = param0;
    }

    final void b(int param0) {
        this.field_u = null;
        this.field_x = null;
        if (param0 == -1) {
            this.field_i = null;
            this.field_z = null;
            return;
        }
        field_f = 41;
        this.field_i = null;
        this.field_z = null;
    }

    pc() {
    }

    static {
        keyboardEventFrameEndIndex = 0;
        field_f = -1;
    }
}
