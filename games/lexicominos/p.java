/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class p {
    static int[] field_d;
    static String[] field_a;
    static long field_c;
    static String field_b;

    final static void a(tg param0, int param1, byte param2) {
        BitPacketBuffer var5 = null;
        int var4 = 0;
        try {
          var5 = SpriteGeometry.field_q;
          var5.writeCipheredByte(param1, 0);
          if (param2 != 24) {
            field_a = (String[]) null;
          }
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(1, -1);
          if (null == param0.field_h) {
            var5.writeByte(0, -1);
          } else {
            var5.writeByte(param0.field_h.length, -1);
            var5.writeBytes(0, param0.field_h, 255, param0.field_h.length);
          }
          var5.appendCrc32(var4, (byte) 85);
          var5.position = var5.position - 4;
          param0.field_k = var5.readInt((byte) 19);
          var5.backpatchByteLength(-var4 + var5.position, (byte) -125);
        } catch (RuntimeException runtimeException) {
          throw ld.wrapClientException((Throwable) ((Object) runtimeException), "p.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void clearStaticReferences(int param0) {
        if (param0 < -124) {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
        field_b = (String) null;
        field_b = null;
        field_d = null;
        field_a = null;
    }

    static {
        field_a = new String[]{"Showing by rating", "Showing by win percentage"};
        field_b = "Password: ";
    }
}
