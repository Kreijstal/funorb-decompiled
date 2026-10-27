/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class SoundEnvelope {
    int start;
    private int valueQ15;
    private int stepQ15;
    int form;
    private int nextSegmentTick;
    int end;
    private int segmentIndex;
    private int[] segmentValues;
    private int elapsedTicks;
    private int[] segmentTimes;
    private int segmentCount;

    final int advance(int duration) {
        if (this.elapsedTicks >= this.nextSegmentTick) {
          int fieldTemp$0 = this.segmentIndex;
          this.segmentIndex = this.segmentIndex + 1;
          this.valueQ15 = this.segmentValues[fieldTemp$0] << 15;
          if (this.segmentIndex >= this.segmentCount) {
            this.segmentIndex = this.segmentCount - 1;
          }
          this.nextSegmentTick = (int)((double)this.segmentTimes[this.segmentIndex] / 65536.0 * (double)duration);
          if (this.nextSegmentTick > this.elapsedTicks) {
            this.stepQ15 = ((this.segmentValues[this.segmentIndex] << 15) - this.valueQ15) / (this.nextSegmentTick - this.elapsedTicks);
          }
        }
        this.valueQ15 = this.valueQ15 + this.stepQ15;
        this.elapsedTicks = this.elapsedTicks + 1;
        return this.valueQ15 - this.stepQ15 >> 15;
    }

    final void reset() {
        this.nextSegmentTick = 0;
        this.segmentIndex = 0;
        this.stepQ15 = 0;
        this.valueQ15 = 0;
        this.elapsedTicks = 0;
    }

    final void decode(PacketBuffer input) {
        this.form = input.readUnsignedByte(0);
        this.start = input.readInt(-5053);
        this.end = input.readInt(-5053);
        this.decodeSegments(input);
    }

    final void decodeSegments(PacketBuffer input) {
        this.segmentCount = input.readUnsignedByte(0);
        this.segmentTimes = new int[this.segmentCount];
        this.segmentValues = new int[this.segmentCount];
        for (int var2 = 0; var2 < this.segmentCount; var2++) {
          this.segmentTimes[var2] = input.readUnsignedShort(1952);
          this.segmentValues[var2] = input.readUnsignedShort(1952);
        }
    }

    SoundEnvelope() {
        this.segmentCount = 2;
        this.segmentTimes = new int[2];
        this.segmentValues = new int[2];
        this.segmentTimes[0] = 0;
        this.segmentTimes[1] = 65535;
        this.segmentValues[0] = 0;
        this.segmentValues[1] = 65535;
    }
}
