/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ig {
    static int field_e;
    static String field_d;
    static ResourceArchive field_c;
    static int field_b;
    static String field_a;

    final static boolean a(int param0) {
        if (param0 != -20144) {
          field_d = (String) null;
          if (MidiPcmStream.field_x == null) {
            return false;
          }
          if (mh.a(MidiPcmStream.field_x, -1)) {
            return true;
          }
          return false;
        }
        if (MidiPcmStream.field_x == null) {
          return false;
        }
        if (mh.a(MidiPcmStream.field_x, -1)) {
          return true;
        }
        return false;
    }

    final static void a(int param0, int param1, il param2) {
        CipherPacketBuffer var3 = null;
        int var4 = 0;
        try {
          var3 = sn.field_c;
          var3.d((byte) -77, param0);
          var3.position = var3.position + 1;
          var4 = var3.position;
          var3.writeByte(param1, 25564);
          var3.writeByte(param2.field_r, 25564);
          var3.writeSignedSmart(-87, param2.field_p);
          var3.writeInt((byte) 110, param2.field_o);
          var3.writeInt((byte) 82, param2.field_q);
          var3.writeInt((byte) 106, param2.field_u);
          var3.writeInt((byte) 121, param2.field_w);
          var3.appendCrc32(-128, var4);
          var3.backpatchByteLength(-1, var3.position - var4);
        } catch (RuntimeException runtimeException) {
          throw lj.wrapClientException((Throwable) ((Object) runtimeException), "ig.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        field_d = null;
        if (param0 >= 44) {
          field_a = null;
          return;
        }
        il var2 = (il) null;
        ig.a(7, 86, (il) null);
        field_a = null;
    }

    static {
        field_d = "The charge is a step up from dynamite, as it can be used underwater. Press <img=19> to drop a charge.";
        field_a = "Updates will sent to the email address you've given";
    }
}
