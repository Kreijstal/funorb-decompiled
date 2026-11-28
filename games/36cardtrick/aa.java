/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class aa extends kj {
    String field_gb;
    static ResourceArchive field_db;
    String field_cb;
    static String field_fb;
    int field_eb;

    aa() {
        super(0L, (kj) null);
    }

    final static void a(ad param0, int param1, int param2) {
        BitPacketBuffer var7 = null;
        BitPacketBuffer var8 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = Main.field_T;
        try {
          var7 = NetworkArchiveRequest.field_r;
          var8 = var7;
          var8.writeCipheredByte(param2, 0);
          var8.position = var8.position + 1;
          var4 = var8.position;
          var8.writeByte(-9469, 1);
          var8.writeShort(param0.field_p, param1 + 22742);
          var8.writeShort(param0.field_r, 26040);
          var8.writeShort(param0.field_m, 26040);
          var8.writeInt(-246, param0.field_k);
          var8.writeInt(-246, param0.field_l);
          var8.writeInt(param1 ^ -3096, param0.field_n);
          var8.writeInt(param1 - 3544, param0.field_s);
          var8.writeByte(-9469, param0.field_o.length);
          for (var5 = 0; param0.field_o.length > var5; var5++) {
            var7.writeInt(-246, param0.field_o[var5]);
          }
          if (param1 != 3298) {
            field_fb = (String) null;
          }
          var8.appendCrc32(var4, (byte) 5);
          var8.backpatchByteLength(var8.position - var4, 8049);
        } catch (RuntimeException runtimeException) {
          throw ma.wrapException((Throwable) ((Object) runtimeException), "aa.H(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void d(byte param0) {
        field_fb = null;
        field_db = null;
        if (param0 != -49) {
          ad var2 = (ad) null;
          aa.a((ad) null, 19, 27);
        }
    }

    static {
    }
}
