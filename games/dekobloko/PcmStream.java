/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class PcmStream extends HashNode {
    AudioSupport006 audioSupport006State0001;
    PcmStream pcmStreamState0002;
    int integerState0567;
    volatile boolean booleanState0130;

    int computeInteger0481() {
        return 255;
    }

    final void performAction1372(int[] integerArrayArgument1, int integerArgument2, int integerArgument3) {
        if (this.booleanState0130) {
          this.performAction0492(integerArrayArgument1, integerArgument2, integerArgument3);
        } else {
          this.performAction0469(integerArgument3);
        }
    }

    abstract PcmStream computePcmStream0499();

    abstract int computeInteger0468();

    abstract void performAction0492(int[] integerArrayArgument1, int integerArgument2, int integerArgument3);

    abstract PcmStream computePcmStream0494();

    PcmStream() {
        this.booleanState0130 = true;
    }

    abstract void performAction0469(int integerArgument1);
}
