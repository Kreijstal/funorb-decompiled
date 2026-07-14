/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ji extends ng {
    private String field_c;
    static eh field_d;
    private long field_e;

    sb b(byte param0) {
        if (param0 >= -57) {
            return null;
        }
        return pg.field_b;
    }

    public static void c(byte param0) {
        field_d = null;
        int var1 = 39 / ((-41 - param0) / 51);
    }

    final void a(boolean param0, wi param1) {
        if (param0) {
          ((ji) this).field_c = null;
          param1.a(252186072, ((ji) this).field_e);
          param1.b(((ji) this).field_c, (byte) -118);
          return;
        } else {
          param1.a(252186072, ((ji) this).field_e);
          param1.b(((ji) this).field_c, (byte) -118);
          return;
        }
    }

    ji(long param0, String param1) {
        ((ji) this).field_e = param0;
        ((ji) this).field_c = param1;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new eh(8, 0, 4, 1);
    }
}
