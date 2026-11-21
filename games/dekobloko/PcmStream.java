/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends HashNode {
    AbstractAudioSample abstractAudioSampleState0001;
    PcmStream pcmStreamState0002;
    int integerState0567;
    volatile boolean booleanState0130;

    int getPriority() {
        return 255;
    }

    final void fillOrSkip(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        if (this.booleanState0130) {
          this.fill(integerArrayArgument1, integerArgument2, integerArgument3);
        } else {
          this.skip(integerArgument3);
        }
    }

    abstract PcmStream firstSubStream();

    abstract int getStreamCost();

    abstract void fill(int[] integerArrayArgument1, int integerArgument2, int integerArgument3);

    abstract PcmStream nextSubStream();

    PcmStream() {
        this.booleanState0130 = true;
    }

    abstract void skip(int integerArgument1);
}
