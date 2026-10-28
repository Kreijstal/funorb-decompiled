/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbCombFilter {
    int[] delayBuffer;
    int delayIndex;
    int filteredSample;

    final void clear() {
        this.filteredSample = 0;
        for (int var1 = 0; var1 < this.delayBuffer.length; var1++) {
          this.delayBuffer[var1] = 0;
        }
    }

    ReverbCombFilter(int param0) {
        this.delayBuffer = new int[param0];
    }
}
