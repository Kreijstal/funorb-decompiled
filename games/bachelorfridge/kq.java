/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq extends pp {
    static int field_i;
    static af field_j;
    static int field_k;

    kq() {
    }

    final void a(PacketBuffer param0, byte param1) {
        try {
          int var3_int = 91 % ((34 - param1) / 58);
          super.a(param0, (byte) 126);
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kq.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void d(byte param0) {
        if (param0 != -91) {
          kq.d((byte) -84);
          field_j = null;
          return;
        }
        field_j = null;
    }

    final void a(aga param0, op param1, int param2) {
        try {
          param1.field_l = false;
          if (param2 != 12) {
            PacketBuffer var5 = (PacketBuffer) null;
            this.a((PacketBuffer) null, (byte) 108);
          }
        } catch (RuntimeException runtimeException) {
          throw pe.wrapException((Throwable) ((Object) runtimeException), "kq.C(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_j = new af();
        field_k = 0;
    }
}
