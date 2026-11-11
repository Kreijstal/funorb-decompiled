/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class C2SChooseCharacterPacket implements GamePacket {
    static String field_c;
    private int field_b;
    static int field_d;
    static UiComponent field_a;

    final void setCharacter(int param0, byte param1) {
        this.field_b = param0;
        if (param1 != -119) {
          this.setCharacter(-18, (byte) -105);
        }
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        try {
          param0.beginBitAccess((byte) 124);
          this.field_b = param0.readBits((byte) 44, 4);
          param0.endBitAccess((byte) 98);
          if (param1 != -19) {
            this.field_b = -114;
          }
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ap.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        try {
          param1.beginBitWrite(8);
          if (param0 != 200) {
            field_c = (String) null;
          }
          param1.writeBits((byte) -125, this.field_b, 4);
          param1.endBitWrite(-1826190686);
        } catch (RuntimeException runtimeException) {
          throw tba.wrapException((Throwable) ((Object) runtimeException), "ap.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void releaseStatics(byte param0) {
        field_c = null;
        field_a = null;
        int var1 = -8 % ((-38 - param0) / 53);
    }

    static {
        field_c = "Location";
    }
}
