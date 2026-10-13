/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wk extends IntrusiveNode {
    String field_o;
    int field_l;
    static int field_m;
    int field_n;
    int field_q;
    String field_j;
    int field_i;
    static boolean field_p;
    static String field_k;

    public static void a(byte param0) {
        field_k = null;
        if (param0 <= 90) {
          wk.a((byte) -14);
        }
    }

    final void a(int param0, PacketBuffer param1) {
        try {
          if (param0 != -12988) {
            this.field_i = -16;
          }
          this.field_n = param1.readUnsignedShort(param0 ^ -52668);
          this.field_o = op.a(false, 1 + this.field_n);
          this.field_q = param1.readInt(255);
          this.field_l = param1.readUnsignedByte(255);
          this.field_i = param1.readInt(param0 ^ -12869);
          this.field_j = param1.readLegacyUtf8String((byte) 24);
        } catch (RuntimeException runtimeException) {
          throw qb.a((Throwable) ((Object) runtimeException), "wk.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    wk() {
    }

    static {
    }
}
