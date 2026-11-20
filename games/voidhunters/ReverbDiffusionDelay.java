/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbDiffusionDelay {
    int cursor;
    int[] samples;

    final void clear() {
        int var1 = 0;
        for (var1 = 0; var1 < this.samples.length; var1++) {
          this.samples[var1] = 0;
        }
    }

    ReverbDiffusionDelay(int param0) {
        this.samples = new int[param0];
    }
}
