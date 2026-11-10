/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wga implements GamePacket {
    private int field_b;
    static int[] field_a;

    final void a(int param0, v param1, qh param2) {
        try {
          param2.field_k.h(this.field_b, 78);
          if (param0 != 4545315) {
            this.field_b = 35;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wga.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(boolean param0, int param1) {
        BitPacketBuffer var2 = ql.field_k;
        if (param0) {
          var2.writeCipheredOpcode(param1, -2988);
          var2.writeByte(2, 0);
          var2.writeByte(4, 0);
          var2.writeByte(r.f(11), 0);
          return;
        }
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        try {
          param0.beginBitAccess((byte) 125);
          if (param1 != -19) {
            wga.releaseStatics(false);
          }
          this.field_b = param0.readBits((byte) 44, 5);
          param0.endBitAccess((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wga.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public static void releaseStatics(boolean param0) {
        if (!param0) {
          field_a = (int[]) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        try {
          param1.beginBitWrite(8);
          param1.writeBits((byte) 31, this.field_b, 5);
          param1.endBitWrite(param0 ^ -1826190742);
          if (param0 != 200) {
            this.field_b = 49;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "wga.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new int[]{4545315, 2375003, 5973028, 5252187};
    }
}
