/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class g {
    static hd field_a;
    static int[] field_b;

    final static void b(boolean param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = Kickabout.field_G;
        try {
          m.field_d = new int[16];
          if (param0) {
            return;
          }
          for (var1_int = 0; var1_int < m.field_d.length; var1_int++) {
            m.field_d[var1_int] = (var1_int << 2) * 65793;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw nb.a((Throwable) ((Object) var1), "g.A(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (!param0) {
          field_a = (hd) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    static {
        field_b = new int[5];
        field_b[0] = 286720;
        field_b[3] = 163840;
        field_b[4] = 327680;
        field_b[2] = 163840;
        field_b[1] = 163840;
    }
}
