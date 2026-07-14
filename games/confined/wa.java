/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wa {
    mi field_e;
    String field_b;
    String field_a;
    static int[] field_d;
    String field_c;
    int field_f;

    public static void a(byte param0) {
        field_d = null;
        if (param0 >= -59) {
            wa.a(38, (byte) 118);
        }
    }

    final static void a(int param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = Confined.field_J ? 1 : 0;
        sb.a(0, cg.field_f, hj.field_j, mc.field_c, (byte) 92, param0, true);
        if (param1 == 117) {
          var2 = 0;
          L0: while (true) {
            if (mc.field_c <= var2) {
              sb.a(param0, mi.field_f, ka.field_P, mc.field_c + param0, (byte) 92, param0 + param0, false);
              if (mc.field_c > param0) {
                mc.field_c = param0;
                return;
              } else {
                return;
              }
            } else {
              sj.field_rb[param0 + var2] = var2;
              var2++;
              continue L0;
            }
          }
        } else {
          wa.a(-119);
          var2 = 0;
          L1: while (true) {
            if (mc.field_c <= var2) {
              sb.a(param0, mi.field_f, ka.field_P, mc.field_c + param0, (byte) 92, param0 + param0, false);
              if (mc.field_c <= param0) {
                return;
              } else {
                mc.field_c = param0;
                return;
              }
            } else {
              sj.field_rb[param0 + var2] = var2;
              var2++;
              continue L1;
            }
          }
        }
    }

    final static void a(int param0) {
        vf.a((byte) -126, 17);
        if (param0 != -20683) {
            field_d = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = new int[8192];
    }
}
