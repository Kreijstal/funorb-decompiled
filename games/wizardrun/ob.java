/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    int field_a;
    static o field_c;
    int field_b;

    final void b(int param0) {
        ((ob) this).field_a = 0;
        ((ob) this).field_b = 0;
        if (param0 != 17939) {
            ((ob) this).field_b = 87;
        }
    }

    public static void a(int param0) {
        if (param0 != 12523) {
            ob.a(6);
            field_c = null;
            return;
        }
        field_c = null;
    }

    final void a(int param0, ob param1) {
        Object var4 = null;
        ((ob) this).field_b = param1.field_b;
        if (param0 > -79) {
          var4 = null;
          ((ob) this).a(86, (ob) null);
          ((ob) this).field_a = param1.field_a;
          return;
        } else {
          ((ob) this).field_a = param1.field_a;
          return;
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        if (param0 != -68) {
            field_c = null;
            var2 = 20 * ((ob) this).field_a + ((ob) this).field_b;
            if (!(-1 >= (var2 ^ -1))) {
                var2 = 0;
            }
            if (!((var2 ^ -1) >= -300)) {
                var2 = 299;
            }
            return var2;
        }
        var2 = 20 * ((ob) this).field_a + ((ob) this).field_b;
        if (!(-1 >= (var2 ^ -1))) {
            var2 = 0;
        }
        if (!((var2 ^ -1) >= -300)) {
            var2 = 299;
        }
        return var2;
    }

    ob() {
        ((ob) this).field_b = 0;
        ((ob) this).field_a = 0;
    }

    ob(ob param0) {
        ((ob) this).field_b = param0.field_b;
        ((ob) this).field_a = param0.field_a;
    }

    static {
    }
}
