/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ci implements dja {
    static llb field_c;
    static int field_b;
    static String field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        if (!li.field_i) {
          dma.d(param4, param0, param3, param1, param2);
          if (param6 == 0) {
            return;
          } else {
            field_a = (String) null;
            return;
          }
        } else {
          param5 = param5 | -16777216;
          param2 = param2 | -16777216;
          hcb.a(8, param0 + param1, 1, param2, param4, param3 + param4, param1 + param0, param0, param2, param4, param5);
          hcb.a(8, param0, 1, param5, param4, param3 + param4, param1 + param0, param0, param2, param3 + param4, param5);
          if (param6 == 0) {
            return;
          } else {
            field_a = (String) null;
            return;
          }
        }
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            return (tv[]) null;
        }
        return (tv[]) ((Object) new gqa[param1]);
    }

    public final tv a(byte param0) {
        int var2 = -88 % ((param0 - -64) / 50);
        return (tv) ((Object) new gqa());
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != -5254) {
            return;
        }
        field_c = null;
    }

    final static boolean b(byte param0) {
        boolean discarded$7 = false;
        if (!(vja.field_a != -1)) {
            if (!boa.a(1, 30000)) {
                return false;
            }
            vja.field_a = qga.field_b.e((byte) -126);
            qga.field_b.field_e = 0;
        }
        if (param0 <= 9) {
            discarded$7 = ci.b((byte) -116);
            if (!((vja.field_a ^ -1) != 1)) {
                if (boa.a(2, 30000)) {
                    vja.field_a = qga.field_b.e(1869);
                    qga.field_b.field_e = 0;
                    return boa.a(vja.field_a, 30000);
                }
                return false;
            }
            return boa.a(vja.field_a, 30000);
        }
        if (!((vja.field_a ^ -1) != 1)) {
            if (boa.a(2, 30000)) {
                vja.field_a = qga.field_b.e(1869);
                qga.field_b.field_e = 0;
                return boa.a(vja.field_a, 30000);
            }
            return false;
        }
        return boa.a(vja.field_a, 30000);
    }

    static {
        field_a = "Remove name";
        field_b = -1;
    }
}
