/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class db {
    static kc field_b;
    static String field_c;
    static String field_d;
    static int field_e;
    static w field_a;

    public final String toString() {
        throw new IllegalStateException();
    }

    final static kc a(boolean param0) {
        if (oo.field_y > 0) {
          return mi.field_m;
        }
        if (sm.field_a > 0) {
          return mi.field_m;
        }
        if (param0) {
          return (kc) null;
        }
        return null;
    }

    final static int a(int param0, boolean param1, byte[] param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ArcanistsMulti.field_G ? 1 : 0;
        try {
          if (param1) {
            db.a(true);
          }
          var4_int = -1;
          for (var5 = param3; param0 > var5; var5++) {
            var4_int = bl.field_i[255 & (param2[var5] ^ var4_int)] ^ var4_int >>> 8;
          }
          var4_int = ~var4_int;
          stackIn_7_0 = var4_int;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("db.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_c = null;
        field_a = null;
        if (param0 != 255) {
          field_e = -80;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_c = "No options available";
        field_d = "Familiars:";
    }
}
