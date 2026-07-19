/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df implements cn {
    private com.ms.directX.DSBufferDesc[] field_a;
    private com.ms.directX.DSCursors[] field_b;

    public df() throws Exception {
        int var1 = 0;
        this.field_b = new com.ms.directX.DSCursors[2];
        this.field_a = new com.ms.directX.DSBufferDesc[2];
        com.ms.directX.DirectSound discarded$0 = new com.ms.directX.DirectSound();
        com.ms.directX.WaveFormatEx discarded$1 = new com.ms.directX.WaveFormatEx();
        for (var1 = 0; var1 < 2; var1++) {
            this.field_a[var1] = new com.ms.directX.DSBufferDesc();
        }
        for (var1 = 0; var1 < 2; var1++) {
            this.field_b[var1] = new com.ms.directX.DSCursors();
        }
    }
}
