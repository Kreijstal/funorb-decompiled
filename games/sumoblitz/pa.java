/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    private static jn field_b;
    private static int field_a;
    private static boolean field_c;

    final synchronized static void a(int param0) {
        jn stackIn_4_0 = null;
        ui var1;
        if (param0 >= -119) {
          return;
        }
        stackIn_4_0 = (jn) (field_b);
        while (true) {
          var1 = (ui) (((jn) (Object) stackIn_4_0).c(9));
          if (var1 == null) {
            return;
          }
          var1.field_k.w(true);
          var1.b(false);
          stackIn_4_0 = (jn) (field_b);
        }
    }

    final synchronized static void b(byte param0) {
        field_a = field_a + 1;
        if (param0 < -113) {
          return;
        }
        field_b = (jn) null;
    }

    final synchronized static void a(e param0, byte param1) {
        ui var2 = null;
        ui var2Lifetime1;
        if (field_c) {
          return;
        }
        if (param1 == -37) {
          if (field_a <= 0) {
            param0.w(false);
          } else {
            var2 = new ui();
            var2.field_k = param0;
            field_b.a((ms) (var2), (byte) 39);
          }
          return;
        }
        pa.a(-21);
        if (field_a <= 0) {
          param0.w(false);
        } else {
          var2Lifetime1 = new ui();
          var2Lifetime1.field_k = param0;
          field_b.a((ms) (var2Lifetime1), (byte) 39);
        }
    }

    final synchronized static void a(byte param0) {
        field_a = field_a - 1;
        if (0 == field_a) {
          pa.a(-121);
          if (param0 > -93) {
            field_c = false;
            return;
          }
          return;
        }
        if (param0 > -93) {
          field_c = false;
          return;
        }
    }

    static {
        field_a = 0;
        field_c = false;
        field_b = new jn();
    }
}
