/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fd extends IntrusiveNode {
    int field_k;
    int field_m;
    int field_j;
    static int field_n;
    static String field_o;
    static String field_l;

    final static void a(int param0) {
        h var1_ref = null;
        Object var1 = null;
        h var1_refLifetime1;
        if (param0 != 28773) {
          fd.a(66, -74, -52L);
          var1_ref = (h) (tm.field_a.removeFirst(56));
          if (var1_ref == null) {
            throw new IllegalStateException();
          }
          SoftwareRasterizer.setRasterBuffer(var1_ref.field_q, var1_ref.field_j, var1_ref.field_r);
          SoftwareRasterizer.setClip(var1_ref.field_l, var1_ref.field_o, var1_ref.field_p, var1_ref.field_k);
          var1_ref.field_q = null;
          ni.field_c.addFirst((IntrusiveNode) (var1_ref), (byte) 105);
          return;
        }
        var1_refLifetime1 = (h) (tm.field_a.removeFirst(56));
        if (var1_refLifetime1 == null) {
          throw new IllegalStateException();
        }
        SoftwareRasterizer.setRasterBuffer(var1_refLifetime1.field_q, var1_refLifetime1.field_j, var1_refLifetime1.field_r);
        SoftwareRasterizer.setClip(var1_refLifetime1.field_l, var1_refLifetime1.field_o, var1_refLifetime1.field_p, var1_refLifetime1.field_k);
        var1_refLifetime1.field_q = null;
        ni.field_c.addFirst((IntrusiveNode) (var1_refLifetime1), (byte) 105);
    }

    final static void a(int param0, int param1, int param2, int param3) {
        if (param1 == 7) {
          le.field_f = param3;
          kj.field_h = param0;
          kg.field_V = param2;
          return;
        }
        ResourceArchive var5 = (ResourceArchive) null;
        fd.a((byte) 74, (ResourceArchive) null);
        le.field_f = param3;
        kj.field_h = param0;
        kg.field_V = param2;
    }

    public static void clearStaticReferences(byte param0) {
        int var1 = 123 / ((-58 - param0) / 50);
        field_o = null;
        field_l = null;
    }

    final static void a(byte param0, ResourceArchive param1) {
        hi var2 = null;
        try {
          hi.b(param1.getFileByName("headers.packvorbis", 30045, ""));
          int var3 = -89 / ((-60 - param0) / 43);
          var2 = hi.a(param1, "jagex logo2.packvorbis", "");
          var2.a();
        } catch (RuntimeException runtimeException) {
          throw SpriteGeometry.wrapClientException((Throwable) ((Object) runtimeException), "fd.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    private fd() throws Throwable {
        throw new Error();
    }

    final static void a(int param0, int param1, long param2) {
        BitPacketBuffer var4 = EditableTextField.field_U;
        var4.writeCipheredByte(param0, -87);
        var4.position = var4.position + 1;
        int var5 = var4.position;
        var4.writeByte(7, (byte) -84);
        if (param1 < -41) {
          var4.writeLong(-74, param2);
          var4.backpatchByteLength(var4.position - var5, -1);
          return;
        }
        field_l = (String) null;
        var4.writeLong(-74, param2);
        var4.backpatchByteLength(var4.position - var5, -1);
    }

    static {
        field_l = "No";
        field_o = "Create a free Account";
    }
}
