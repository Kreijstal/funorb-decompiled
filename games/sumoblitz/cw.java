/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cw extends fs {
    final void b(byte param0, float param1) {
        int var3 = -104 / ((-3 - param0) / 59);
        int var4 = jaclib.memory.Stream.floatToRawIntBits(param1);
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[((cw) this).field_p] = (byte)(var4 >> 174932952);
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[((cw) this).field_p] = (byte)(var4 >> 253767696);
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[((cw) this).field_p] = (byte)(var4 >> 496550600);
        ((cw) this).field_p = ((cw) this).field_p + 1;
        ((cw) this).field_n[((cw) this).field_p] = (byte)var4;
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
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[((cw) this).field_p] = (byte)var3;
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[((cw) this).field_p] = (byte)(var3 >> 1291361256);
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[((cw) this).field_p] = (byte)(var3 >> 712213136);
          ((cw) this).field_p = ((cw) this).field_p + 1;
          ((cw) this).field_n[((cw) this).field_p] = (byte)(var3 >> -415996200);
          return;
        }
    }

    static {
    }
}
