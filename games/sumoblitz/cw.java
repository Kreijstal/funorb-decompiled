/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw extends fs {
    final void b(byte param0, float param1) {
        int var3 = -104 / ((-3 - param0) / 59);
        int var4 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$0 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$0] = (byte)(var4 >> 174932952);
        int fieldTemp$1 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$1] = (byte)(var4 >> 253767696);
        int fieldTemp$2 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$2] = (byte)(var4 >> 496550600);
        int fieldTemp$3 = this.field_p;
        this.field_p = this.field_p + 1;
        this.field_n[fieldTemp$3] = (byte)var4;
    }

    cw(int param0) {
        super(param0);
    }

    final void c(byte param0, float param1) {
        int fieldTemp$4 = 0;
        int fieldTemp$5 = 0;
        int fieldTemp$6 = 0;
        int fieldTemp$7 = 0;
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        if (param0 != -36) {
          return;
        } else {
          fieldTemp$4 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$4] = (byte)var3;
          fieldTemp$5 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$5] = (byte)(var3 >> 1291361256);
          fieldTemp$6 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$6] = (byte)(var3 >> 712213136);
          fieldTemp$7 = this.field_p;
          this.field_p = this.field_p + 1;
          this.field_n[fieldTemp$7] = (byte)(var3 >> -415996200);
          return;
        }
    }

    static {
    }
}
