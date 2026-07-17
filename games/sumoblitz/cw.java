/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw extends fs {
    final void b(byte param0, float param1) {
        int var3 = -104 / ((-3 - param0) / 59);
        int var4 = jaclib.memory.Stream.floatToRawIntBits(param1);
        int fieldTemp$0 = ((cw) this).field_p;
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[fieldTemp$0] = (byte)(var4 >> 24);
        int fieldTemp$1 = ((cw) this).field_p;
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[fieldTemp$1] = (byte)(var4 >> 16);
        int fieldTemp$2 = ((cw) this).field_p;
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[fieldTemp$2] = (byte)(var4 >> 8);
        int fieldTemp$3 = ((cw) this).field_p;
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[fieldTemp$3] = (byte)var4;
    }

    cw(int param0) {
        super(param0);
    }

    final void c(byte param0, float param1) {
        int var3 = 0;
        var3 = jaclib.memory.Stream.floatToRawIntBits(param1);
        if (param0 != -36) {
          return;
        } else {
          int fieldTemp$4 = ((cw) this).field_p;
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[fieldTemp$4] = (byte)var3;
          int fieldTemp$5 = ((cw) this).field_p;
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[fieldTemp$5] = (byte)(var3 >> 8);
          int fieldTemp$6 = ((cw) this).field_p;
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[fieldTemp$6] = (byte)(var3 >> 16);
          int fieldTemp$7 = ((cw) this).field_p;
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[fieldTemp$7] = (byte)(var3 >> 24);
          return;
        }
    }

    static {
    }
}
