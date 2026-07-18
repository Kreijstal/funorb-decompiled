/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lr {
    static ri field_c;
    static int[] field_a;
    private pv field_d;
    static qr field_b;

    final static int[] a() {
        return new int[8];
    }

    final static void a(boolean param0, String param1, byte param2, String param3) {
        try {
            int var4_int = -26 % ((76 - param2) / 42);
            ac.field_F = param3;
            kh.field_d = param1;
            oc.a(us.field_m, param0, (byte) -99);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "lr.D(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ')');
        }
    }

    public static void c() {
        field_b = null;
        field_a = null;
        field_c = null;
    }

    final static void a(tv param0) {
        try {
            jd.a(param0, (byte) 109, true);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) (Object) runtimeException, "lr.E(" + (param0 != null ? "{...}" : "null") + ',' + 56 + ')');
        }
    }

    lr(boolean param0) {
    }

    final void b(int param0) {
        Object var3 = null;
        if (param0 != 16711680) {
          L0: {
            var3 = null;
            lr.a(false, (String) null, (byte) -120, (String) null);
            if (((lr) this).field_d != null) {
              ((lr) this).field_d.b(12001);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (((lr) this).field_d != null) {
              ((lr) this).field_d.b(12001);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new int[]{10813242, 16711680, 16739328, 16766976, 13725607, 108799};
        field_b = new qr();
    }
}
