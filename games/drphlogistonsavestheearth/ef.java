/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ef implements vl {
    private com.ms.directX.DSCursors[] field_a;
    private com.ms.directX.DSBufferDesc[] field_b;

    public ef() throws Exception {
        int var1 = 0;
        ((ef) this).field_b = new com.ms.directX.DSBufferDesc[2];
        ((ef) this).field_a = new com.ms.directX.DSCursors[2];
        com.ms.directX.DirectSound discarded$0 = new com.ms.directX.DirectSound();
        com.ms.directX.WaveFormatEx discarded$1 = new com.ms.directX.WaveFormatEx();
        for (var1 = 0; 2 > var1; var1++) {
            ((ef) this).field_b[var1] = new com.ms.directX.DSBufferDesc();
        }
        for (var1 = 0; var1 < 2; var1++) {
            ((ef) this).field_a[var1] = new com.ms.directX.DSCursors();
        }
    }
}
