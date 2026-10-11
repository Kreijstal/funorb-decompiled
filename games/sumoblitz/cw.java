/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw extends fs {
    final void b(byte param0, float param1) {
        int var3 = -104 / ((-3 - param0) / 59);
        int var4 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$0] = (byte)(var4 >> 24);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$1] = (byte)(var4 >> 16);
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$2] = (byte)(var4 >> 8);
        int fieldTemp$3 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$3] = (byte)var4;
    }

    cw(int param0) {
        super(param0);
    }

    final void c(byte param0, float param1) {
        int fieldTemp$0 = 0;
        int fieldTemp$1 = 0;
        int fieldTemp$2 = 0;
        int fieldTemp$3 = 0;
        int var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        if (param0 == -36) {
          fieldTemp$0 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$0] = (byte)var3;
          fieldTemp$1 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$1] = (byte)(var3 >> 8);
          fieldTemp$2 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$2] = (byte)(var3 >> 16);
          fieldTemp$3 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$3] = (byte)(var3 >> 24);
          return;
        }
    }

    static {
    }
}
