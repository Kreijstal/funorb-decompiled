/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gj {
    static String field_c;
    static String field_d;
    static String field_b;
    static boolean field_e;
    static boolean field_f;
    static String field_a;

    final static boolean b(int param0) {
        if (param0 == -26966) {
          if (ng.field_g != null) {
            if (!ng.field_g.a(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = gj.b(17);
          if (ng.field_g != null) {
            if (!ng.field_g.a(0)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static void a(int param0) {
        br var1 = null;
        int var2 = ZombieDawnMulti.field_E ? 1 : 0;
        if (!df.field_H) {
            return;
        }
        try {
            var1 = fd.field_M.c(54);
            while (var1 instanceof wj) {
                aa.a(true, ((wj) (Object) var1).field_m);
                var1 = var1.field_d;
            }
            var1 = qo.field_q.c(53);
            while (var1 instanceof wj) {
                aa.a(true, ((wj) (Object) var1).field_m);
                var1 = var1.field_d;
            }
            if (param0 != 6962) {
                gj.a((byte) 105);
            }
            var1 = jp.field_c.c(83);
            while (var1 instanceof wj) {
                aa.a(true, ((wj) (Object) var1).field_m);
                var1 = var1.field_d;
            }
            fd.field_M.e(-30986);
            qo.field_q.e(-30986);
            jp.field_c.e(param0 ^ -25148);
        } catch (RuntimeException runtimeException) {
            throw fa.a((Throwable) (Object) runtimeException, "gj.A(" + param0 + 41);
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 != 91) {
          gj.a((byte) -121);
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = false;
        field_b = null;
        field_c = "Mobile";
        field_d = "Match by...";
        field_a = "Age:";
    }
}
