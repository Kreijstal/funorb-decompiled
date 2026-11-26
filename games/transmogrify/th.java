/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class th {
    static int field_a;
    static String shuffleLabel;
    static String field_e;
    static String[] field_d;
    static td field_c;

    final static void a(int param0, int param1, ng param2) {
        hj var3 = null;
        try {
          var3 = ff.field_D;
          if (param0 != 65536) {
            field_a = -12;
          }
          var3.a(false, param1);
          var3.writeByte(6389, param2.field_m);
          var3.writeByte(6389, param2.field_k);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "th.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final static void a(int param0, PacketBuffer param1) {
        int var2_int = 0;
        int var2_intLifetime1;
        int var2_intLifetime2;
        try {
          ia.field_j = param1.readUnsignedShort((byte) -116) << 5;
          var2_int = param1.readUnsignedByte((byte) 41);
          DiskArchiveRequest.field_x = (var2_int & 7) << 18;
          ia.field_j = ia.field_j + (var2_int >> 3);
          DiskArchiveRequest.field_x = DiskArchiveRequest.field_x + (param1.readUnsignedShort((byte) -112) << 2);
          var2_intLifetime1 = param1.readUnsignedByte((byte) 64);
          DiskArchiveRequest.field_x = DiskArchiveRequest.field_x + (var2_intLifetime1 >> 6);
          ug.field_b = 2064384 & var2_intLifetime1 << 15;
          ug.field_b = ug.field_b + (param1.readUnsignedByte((byte) 41) << 7);
          if (param0 < 91) {
            field_e = (String) null;
          }
          var2_intLifetime2 = param1.readUnsignedByte((byte) 127);
          BoundedRandomAccessFile.field_e = 65536 & var2_intLifetime2 << 16;
          ug.field_b = ug.field_b + (var2_intLifetime2 >> 1);
          BoundedRandomAccessFile.field_e = BoundedRandomAccessFile.field_e + param1.readUnsignedShort((byte) -104);
        } catch (RuntimeException runtimeException) {
          throw ch.wrapClientException((Throwable) ((Object) runtimeException), "th.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        shuffleLabel = null;
        field_e = null;
        field_c = null;
        field_d = null;
        if (param0 != -42) {
          ng var2 = (ng) null;
          th.a(-43, 125, (ng) null);
        }
    }

    static {
        field_a = 0;
        shuffleLabel = "Shuffle";
        field_e = "No highscores";
    }
}
