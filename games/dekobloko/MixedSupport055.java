/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class MixedSupport055 implements CallbackContract001 {
    private com.ms.directX.DSBufferDesc[] dSBufferDescArrayState0001;
    private com.ms.directX.DSCursors[] dSCursorsArrayState0001;

    public MixedSupport055() throws Exception {
        int integerLocal1 = 0;
        int integerLocal2;
        this.dSCursorsArrayState0001 = new com.ms.directX.DSCursors[2];
        this.dSBufferDescArrayState0001 = new com.ms.directX.DSBufferDesc[2];
        com.ms.directX.DirectSound discarded$0 = new com.ms.directX.DirectSound();
        com.ms.directX.WaveFormatEx discarded$1 = new com.ms.directX.WaveFormatEx();
        for (integerLocal1 = 0; 2 > integerLocal1; integerLocal1++) {
          this.dSBufferDescArrayState0001[integerLocal1] = new com.ms.directX.DSBufferDesc();
        }
        for (integerLocal2 = 0; integerLocal2 < 2; integerLocal2++) {
          this.dSCursorsArrayState0001[integerLocal2] = new com.ms.directX.DSCursors();
        }
    }
}
