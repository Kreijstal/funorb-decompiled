/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pa {
    private static jn field_b;
    private static int field_a;
    private static boolean field_c;

    final synchronized static void a(int param0) {
        ui var1 = null;
        jn stackIn_4_0 = null;
        jn stackOut_2_0 = null;
        jn stackOut_3_0 = null;
        if (param0 < -119) {
          stackOut_2_0 = (jn) (field_b);
          stackIn_4_0 = stackOut_2_0;
          L0: while (true) {
            var1 = (ui) ((Object) ((jn) (Object) stackIn_4_0).c(9));
            if (var1 == null) {
              return;
            } else {
              var1.field_k.w(true);
              var1.b(false);
              stackOut_3_0 = (jn) (field_b);
              stackIn_4_0 = stackOut_3_0;
              continue L0;
            }
          }
        } else {
          return;
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
        if (!field_c) {
          if (param1 != -37) {
            L0: {
              pa.a(-21);
              if ((field_a ^ -1) < -1) {
                var2 = new ui();
                var2.field_k = param0;
                field_b.a((ms) (var2), (byte) 39);
                break L0;
              } else {
                param0.w(false);
                break L0;
              }
            }
            return;
          } else {
            L1: {
              if ((field_a ^ -1) < -1) {
                var2 = new ui();
                var2.field_k = param0;
                field_b.a((ms) (var2), (byte) 39);
                break L1;
              } else {
                param0.w(false);
                break L1;
              }
            }
            return;
          }
        } else {
          return;
        }
    }

    final synchronized static void a(byte param0) {
        field_a = field_a - 1;
        if (0 != field_a) {
          if (param0 <= -93) {
            return;
          } else {
            field_c = false;
            return;
          }
        } else {
          pa.a(-121);
          if (param0 <= -93) {
            return;
          } else {
            field_c = false;
            return;
          }
        }
    }

    static {
        field_a = 0;
        field_c = false;
        field_b = new jn();
    }
}
