/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbCombFilter {
    int filteredSample;
    int[] delayBuffer;
    int delayIndex;

    final void clear() {
        int var1 = 0;
        this.filteredSample = 0;
        for (var1 = 0; var1 < this.delayBuffer.length; var1++) {
          this.delayBuffer[var1] = 0;
        }
    }

    ReverbCombFilter(int param0) {
        this.delayBuffer = new int[param0];
    }
}
