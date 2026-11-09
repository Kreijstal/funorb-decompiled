/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class FloatPacketBuffer extends PacketBuffer {
    final void writeFloat(byte guard, float value) {
        int var3 = -104 / ((-3 - guard) / 59);
        int var4 = jaclib.memory.Stream.floatToRawIntBits(value);
        int fieldTemp$0 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$0] = (byte)(var4 >> 24);
        int fieldTemp$1 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$1] = (byte)(var4 >> 16);
        int fieldTemp$2 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$2] = (byte)(var4 >> 8);
        int fieldTemp$3 = this.position;
        this.position = this.position + 1;
        this.payload[fieldTemp$3] = (byte)var4;
    }

    FloatPacketBuffer(int capacity) {
        super(capacity);
    }

    final void writeFloatLE(byte guard, float value) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = jaclib.memory.Stream.floatToRawIntBits(value);
        if (guard == -36) {
          fieldTemp$0 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$0] = (byte)var3;
          fieldTemp$1 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$1] = (byte)(var3 >> 8);
          fieldTemp$2 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$2] = (byte)(var3 >> 16);
          fieldTemp$3 = this.position;
          this.position = this.position + 1;
          this.payload[fieldTemp$3] = (byte)(var3 >> 24);
          return;
        }
    }

    static {
    }
}
