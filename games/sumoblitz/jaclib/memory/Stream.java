/*
 * Decompiled by CFR-JS 0.4.0.
 */
package jaclib.memory;

public final class Stream {
    private jaclib.memory.Buffer target;
    private byte[] bytes;
    private int position;
    private int limit;
    private int bufferedBytes;

    public final void writeFloatBigEndian(float value) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.bytes.length > 3 + this.bufferedBytes) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(value);
          fieldTemp$0 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$0] = (byte)(var2 >> 24);
          fieldTemp$1 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$1] = (byte)(var2 >> 16);
          fieldTemp$2 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$2] = (byte)(var2 >> 8);
          fieldTemp$3 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$3] = (byte)var2;
          return;
        }
        this.flush();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(value);
        int fieldTemp$4 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$4] = (byte)(var2Lifetime1 >> 24);
        int fieldTemp$5 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$5] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$6 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$6] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$7 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$7] = (byte)var2Lifetime1;
    }

    public final void writeFloatLittleEndian(float value) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var2 = 0;
        int var2Lifetime1;
        if (this.bytes.length > 3 + this.bufferedBytes) {
          var2 = jaclib.memory.Stream.floatToRawIntBits(value);
          fieldTemp$0 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$0] = (byte)var2;
          fieldTemp$1 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$1] = (byte)(var2 >> 8);
          fieldTemp$2 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$2] = (byte)(var2 >> 16);
          fieldTemp$3 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$3] = (byte)(var2 >> 24);
          return;
        }
        this.flush();
        var2Lifetime1 = jaclib.memory.Stream.floatToRawIntBits(value);
        int fieldTemp$4 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$4] = (byte)var2Lifetime1;
        int fieldTemp$5 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$5] = (byte)(var2Lifetime1 >> 8);
        int fieldTemp$6 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$6] = (byte)(var2Lifetime1 >> 16);
        int fieldTemp$7 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$7] = (byte)(var2Lifetime1 >> 24);
    }

    public final native static int floatToRawIntBits(float param0);

    public final void flush() {
        if (this.bufferedBytes > 0) {
          if (this.position + this.bufferedBytes > this.limit) {
            throw new RuntimeException();
          }
          this.target.putBytes(this.bytes, 0, this.position, this.bufferedBytes);
          this.position = this.position + this.bufferedBytes;
          this.bufferedBytes = 0;
        }
    }

    public final static boolean isNativeBigEndian() {
        return jaclib.memory.Stream.getLSB(-65536) == -1;
    }

    public final void writeShortLittleEndian(int value) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (this.bytes.length > this.bufferedBytes + 1) {
          fieldTemp$0 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$0] = (byte)value;
          fieldTemp$1 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$1] = (byte)(value >> 8);
          return;
        }
        this.flush();
        int fieldTemp$2 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$2] = (byte)value;
        int fieldTemp$3 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$3] = (byte)(value >> 8);
    }

    private final void bindRange(jaclib.memory.Buffer buffer, int offset, int length) {
        this.flush();
        this.position = offset;
        this.limit = offset + length;
        this.target = buffer;
        if (!(this.limit <= buffer.getSize())) {
          throw new RuntimeException();
        }
    }

    private final native static byte getLSB(int param0);

    public final void bind(jaclib.memory.Buffer buffer) {
        this.bindRange(buffer, 0, buffer.getSize());
    }

    public Stream() {
        this(4096);
    }

    public final void writeShortBigEndian(int value) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        if (this.bytes.length > this.bufferedBytes + 1) {
          fieldTemp$0 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$0] = (byte)(value >> 8);
          fieldTemp$1 = this.bufferedBytes;
          this.bufferedBytes = this.bufferedBytes + 1;
          this.bytes[fieldTemp$1] = (byte)value;
          return;
        }
        this.flush();
        int fieldTemp$2 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$2] = (byte)(value >> 8);
        int fieldTemp$3 = this.bufferedBytes;
        this.bufferedBytes = this.bufferedBytes + 1;
        this.bytes[fieldTemp$3] = (byte)value;
    }

    private Stream(int param0) {
        this.bytes = new byte[param0];
    }
}
