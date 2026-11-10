/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class S2CCharacterChoicePacket implements GamePacket {
    private int field_b;
    static int field_a;
    static String field_c;
    private int field_d;

    public static void releaseStatics(int param0) {
        field_c = null;
        if (param0 != 4) {
          S2CCharacterChoicePacket.releaseStatics(22);
        }
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        try {
          param1.beginBitWrite(8);
          param1.writeBits((byte) -128, this.field_b, 3);
          param1.writeBits((byte) -126, this.field_d, 4);
          param1.endBitWrite(param0 ^ -1826190742);
          if (param0 != 200) {
            S2CCharacterChoicePacket.releaseStatics(79);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vra.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void apply(MatchScreen param0, byte param1, MatchProtocol param2) {
        try {
          if (param1 >= -81) {
            S2CCharacterChoicePacket.releaseStatics(-117);
          }
          param0.onCharacterChoice(this.field_d, 112, this.field_b);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vra.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public final void decode(BitPacketBuffer param0, byte param1) {
        param0.beginBitAccess((byte) 126);
        if (param1 != -19) {
          return;
        }
        try {
          this.field_b = param0.readBits((byte) 44, 3);
          this.field_d = param0.readBits((byte) 44, 4);
          param0.endBitAccess((byte) 98);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "vra.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_c = "Please remove <%0> from your ignore list first.";
    }
}
