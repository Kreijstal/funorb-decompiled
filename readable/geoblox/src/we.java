/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class we {
    int[] field_c;
    int field_a;
    int[] field_d;
    int field_b;

    we() {
        int var1 = 0;
        MusicDecoder_ua.readBits_b(16);
        this.field_b = MusicDecoder_ua.readBit_b() != 0 ? MusicDecoder_ua.readBits_b(4) + 1 : 1;
        if (MusicDecoder_ua.readBit_b() != 0) {
            MusicDecoder_ua.readBits_b(8);
        }
        MusicDecoder_ua.readBits_b(2);
        if (this.field_b > 1) {
            this.field_a = MusicDecoder_ua.readBits_b(4);
        }
        this.field_c = new int[this.field_b];
        this.field_d = new int[this.field_b];
        for (var1 = 0; var1 < this.field_b; var1++) {
            MusicDecoder_ua.readBits_b(8);
            this.field_c[var1] = MusicDecoder_ua.readBits_b(8);
            this.field_d[var1] = MusicDecoder_ua.readBits_b(8);
        }
    }
}
