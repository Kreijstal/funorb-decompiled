/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ReverbAllPassFilter {
    int delayIndex;
    int[] delayBuffer;

    final void clear() {
        for (int var1 = 0; var1 < this.delayBuffer.length; var1++) {
          this.delayBuffer[var1] = 0;
        }
    }

    ReverbAllPassFilter(int param0) {
        this.delayBuffer = new int[param0];
    }
}
