/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pg {
    private ti[] field_c;
    static boolean field_a;
    static oa field_b;

    final void a(int param0, int param1, int param2, byte param3, int param4) {
        dk.a(param4, ((pg) this).field_c, -28018, param2, param1, param0);
        int var6 = 110 / ((-9 - param3) / 42);
    }

    final static void a(int param0) {
        if (null != ci.field_f) {
          L0: {
            ci.field_f.j(127);
            if (gh.field_m != null) {
              gh.field_m.r(-96);
              break L0;
            } else {
              break L0;
            }
          }
          dg.c(-1);
          return;
        } else {
          L1: {
            if (gh.field_m != null) {
              gh.field_m.r(-96);
              break L1;
            } else {
              break L1;
            }
          }
          dg.c(-1);
          return;
        }
    }

    final static void a(long param0, int param1) {
        if (param0 <= 0L) {
          return;
        } else {
          if (param0 % 10L != 0L) {
            bc.a(param0, -23850);
            if (param1 <= -76) {
              return;
            } else {
              field_a = false;
              return;
            }
          } else {
            bc.a(-1L + param0, -23850);
            bc.a(1L, -23850);
            if (param1 <= -76) {
              return;
            } else {
              field_a = false;
              return;
            }
          }
        }
    }

    public static void a(byte param0) {
        if (param0 >= -15) {
            field_b = null;
            field_b = null;
            return;
        }
        field_b = null;
    }

    pg(ti[] param0) {
        try {
            ((pg) this).field_c = param0;
        } catch (RuntimeException runtimeException) {
            throw ch.a((Throwable) (Object) runtimeException, "pg.<init>(" + (param0 != null ? "{...}" : "null") + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = false;
    }
}
