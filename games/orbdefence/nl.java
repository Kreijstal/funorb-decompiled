/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nl {
    static RgbSprite field_e;
    static int field_b;
    static volatile int field_d;
    static String field_a;
    static String field_c;

    public static void resetStaticState(byte param0) {
        field_c = null;
        field_a = null;
        field_e = null;
        if (param0 > -39) {
          field_d = -54;
        }
    }

    final static void a(int param0, int param1, int param2, PacketBuffer param3, int param4) {
        try {
          param3.writeByte(12, -44);
          param3.writeShort((byte) -60, 17);
          param3.writeShort((byte) -60, param2);
          param3.writeShort((byte) -60, param1);
          param3.writeByte(param4, param0 ^ -21022);
          if (param0 != 20994) {
            PacketBuffer var6 = (PacketBuffer) null;
            nl.a(20, -5, -65, (PacketBuffer) null, -69);
          }
        } catch (RuntimeException runtimeException) {
          throw DraggableWidgetContainer.wrapClientException((Throwable) ((Object) runtimeException), "nl.A(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    static {
        field_d = 0;
        field_a = null;
        field_c = "Wave Complete";
    }
}
