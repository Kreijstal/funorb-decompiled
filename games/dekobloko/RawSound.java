/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class RawSound extends AbstractAudioSample {
    int integerState0794;
    byte[] byteArrayState0028;
    int integerState0795;
    boolean booleanState0192;
    int integerState0796;

    final RawSound computeRawSound1663(PcmResampler pcmResamplerArgument1) {
        this.byteArrayState0028 = pcmResamplerArgument1.resample(14, this.byteArrayState0028);
        this.integerState0794 = pcmResamplerArgument1.scaleRate(false, this.integerState0794);
        if (this.integerState0795 != this.integerState0796) {
          this.integerState0795 = pcmResamplerArgument1.scalePosition(this.integerState0795, 86);
          this.integerState0796 = pcmResamplerArgument1.scalePosition(this.integerState0796, 36);
          if (this.integerState0795 == this.integerState0796) {
            this.integerState0795 = this.integerState0795 - 1;
          }
          return this;
        }
        int cachedIntegerLocal1 = pcmResamplerArgument1.scalePosition(this.integerState0795, 114);
        this.integerState0796 = cachedIntegerLocal1;
        this.integerState0795 = cachedIntegerLocal1;
        return this;
    }

    RawSound(int integerArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4) {
        this.integerState0794 = integerArgument1;
        this.byteArrayState0028 = byteArrayArgument2;
        this.integerState0795 = integerArgument3;
        this.integerState0796 = integerArgument4;
    }

    RawSound(int integerArgument1, byte[] byteArrayArgument2, int integerArgument3, int integerArgument4, boolean booleanArgument5) {
        this.integerState0794 = integerArgument1;
        this.byteArrayState0028 = byteArrayArgument2;
        this.integerState0795 = integerArgument3;
        this.integerState0796 = integerArgument4;
        this.booleanState0192 = booleanArgument5 ? true : false;
    }
}
