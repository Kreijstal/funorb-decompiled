/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    private ti[] field_c;
    static boolean field_a;
    static oa field_b;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        dk.a(param4, this.field_c, -28018, param2, param1, param0);
        int var6 = 110 / ((-9 - param3) / 42);
    }

    final static void a(int param0) {
        if (param0 != 0) {
          pg.a((byte) -65);
          if (null != ci.field_f) {
            ci.field_f.j(param0 + 127);
            if (gh.field_m != null) {
              gh.field_m.r(-96);
            }
            dg.c(-1);
            return;
          }
          if (gh.field_m != null) {
            gh.field_m.r(-96);
          }
          dg.c(-1);
          return;
        }
        if (null == ci.field_f) {
          if (gh.field_m != null) {
            gh.field_m.r(-96);
          }
          dg.c(-1);
          return;
        }
        ci.field_f.j(param0 + 127);
        if (gh.field_m != null) {
          gh.field_m.r(-96);
        }
        dg.c(-1);
    }

    final static void a(long param0, int param1) {
        if (param0 <= 0L) {
          return;
        }
        if (param0 % 10L == 0L) {
          bc.a(-1L + param0, -23850);
          bc.a(1L, -23850);
          if (param1 > -76) {
            field_a = false;
            return;
          }
          return;
        }
        bc.a(param0, -23850);
        if (param1 > -76) {
          field_a = false;
          return;
        }
    }

    public static void a(byte param0) {
        if (param0 >= -15) {
          field_b = (oa) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    pg(ti[] param0) {
        try {
          this.field_c = param0;
        } catch (RuntimeException runtimeException) {
          throw ch.a((Throwable) ((Object) runtimeException), "pg.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = false;
    }
}
