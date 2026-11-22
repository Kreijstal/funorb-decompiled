/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class s {
    static String field_b;
    static String[] field_c;
    static String field_a;

    final static void a(oa param0, int param1, boolean param2) {
        int var4 = 0;
        ih var5 = ud.field_b;
        var5.e(8, param1);
        if (param2) {
          return;
        }
        try {
          var5.position = var5.position + 1;
          var4 = var5.position;
          var5.writeByte(-11, 1);
          if (param0.field_k == null) {
            var5.writeByte(-11, 0);
          } else {
            var5.writeByte(-11, param0.field_k.length);
            var5.writeBytes(param0.field_k, param0.field_k.length, 0, 0);
          }
          var5.appendCrc32(var4, -30532);
          var5.position = var5.position - 4;
          param0.field_i = var5.readInt((byte) -3);
          var5.backpatchByteLength((byte) -128, -var4 + var5.position);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "s.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void clearStaticReferences(byte param0) {
        field_a = null;
        field_b = null;
        if (param0 != 123) {
          field_b = (String) null;
        }
        field_c = null;
    }

    final static void a(int param0, int param1, bh param2) {
        ih var8 = null;
        ih var9 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = fleas.field_A ? 1 : 0;
        try {
          var8 = ud.field_b;
          var9 = var8;
          var9.e(param0 ^ -4479, param1);
          var9.position = var9.position + 1;
          var4 = var9.position;
          if (param0 != -4471) {
            bh var7 = (bh) null;
            s.a(120, -80, (bh) null);
          }
          var9.writeByte(-11, 1);
          var9.writeShort((byte) 76, param2.field_s);
          var9.writeShort((byte) -49, param2.field_o);
          var9.writeShort((byte) 105, param2.field_i);
          var9.writeInt(param2.field_j, (byte) -50);
          var9.writeInt(param2.field_r, (byte) -35);
          var9.writeInt(param2.field_v, (byte) -56);
          var9.writeInt(param2.field_m, (byte) -15);
          var9.writeByte(-11, param2.field_p.length);
          for (var5 = 0; var5 < param2.field_p.length; var5++) {
            var8.writeInt(param2.field_p[var5], (byte) -50);
          }
          var9.appendCrc32(var4, -30532);
          var9.backpatchByteLength((byte) -110, var9.position - var4);
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "s.C(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = new String[]{null, "Or click", "Or click", "Or click", "Or click", "Or click", "Or click", "Or click"};
        field_a = "Try again";
    }
}
