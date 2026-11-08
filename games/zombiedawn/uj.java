/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uj {
    static String field_b;
    static cg field_a;
    private static long[] field_c;
    static int field_d;

    final static void a(int param0, int param1, byte param2, PacketBuffer param3, int param4) {
        try {
          param3.writeByte(12, 55);
          if (param2 != -114) {
            field_c = (long[]) null;
          }
          param3.writeShort(17, (byte) 105);
          param3.writeShort(param4, (byte) 105);
          param3.writeShort(param0, (byte) 105);
          param3.writeByte(param1, param2 + 218);
        } catch (RuntimeException runtimeException) {
          throw ExceptionWrapper.wrapException((Throwable) ((Object) runtimeException), "uj.B(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    public static void releaseStatics(int param0) {
        if (param0 != 256) {
          return;
        }
        field_b = null;
        field_a = null;
        field_c = null;
    }

    static {
        int var2 = 0;
        int var3 = 0;
        long var0;
        field_b = "Paused";
        field_a = new cg(6, 0, 4, 2);
        field_c = new long[256];
        for (var2 = 0; var2 < 256; var2++) {
          var0 = (long)var2;
          for (var3 = 0; var3 < 8; var3++) {
            if ((1L & var0) != 1L) {
              var0 = var0 >>> 1;
            } else {
              var0 = -3932672073523589310L ^ var0 >>> 1;
            }
          }
          field_c[var2] = var0;
        }
    }
}
