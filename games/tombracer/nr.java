/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nr implements GamePacket {
    private int field_b;
    static mla field_d;
    private int field_c;
    static sla field_a;

    public final void decode(BitPacketBuffer param0, byte param1) {
        RuntimeException var3 = null;
        BitPacketBuffer var4 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          param0.beginBitAccess((byte) -37);
          this.field_b = param0.readBits((byte) 44, 3);
          if (param0.readBits((byte) 44, 1) != 1) {
            this.field_c = param0.readBits((byte) 44, 2);
          } else {
            this.field_c = -1;
          }
          param0.endBitAccess((byte) 98);
          if (param1 == -19) {
            return;
          }
          var4 = (BitPacketBuffer) null;
          this.decode((BitPacketBuffer) null, (byte) -120);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("nr.A(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void releaseStatics(boolean param0) {
        field_d = null;
        if (param0) {
          nr.releaseStatics(true);
          field_a = null;
          return;
        }
        field_a = null;
    }

    public final void encode(int param0, BitPacketBuffer param1) {
        try {
          param1.beginBitWrite(8);
          param1.writeBits((byte) 89, this.field_b, 3);
          if (param0 != 200) {
            nr.releaseStatics(false);
          }
          if (this.field_c == -1) {
            param1.writeBits((byte) -127, 1, 1);
          } else {
            param1.writeBits((byte) 121, 0, 1);
            param1.writeBits((byte) 53, this.field_c, 2);
          }
          param1.endBitWrite(param0 - 1826190886);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nr.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void apply(byte param0, MatchScreen param1, MatchProtocol param2) {
        try {
          param1.a((byte) 113, this.field_b, this.field_c);
          if (param0 != -78) {
            nr.releaseStatics(false);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "nr.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_d = new mla();
        field_a = new sla();
    }
}
