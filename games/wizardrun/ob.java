/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob {
    int field_a;
    static o field_c;
    int field_b;

    final void b(int param0) {
        this.field_a = 0;
        this.field_b = 0;
        if (param0 != 17939) {
            this.field_b = 87;
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
        try {
            this.field_b = param1.field_b;
            if (param0 > -79) {
                ob var4 = (ob) null;
                this.a(86, (ob) null);
            }
            this.field_a = param1.field_a;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ob.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final int a(byte param0) {
        int var2 = 0;
        if (param0 != -68) {
          L0: {
            field_c = (o) null;
            var2 = 20 * this.field_a + this.field_b;
            if (-1 < (var2 ^ -1)) {
              var2 = 0;
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if ((var2 ^ -1) < -300) {
              var2 = 299;
              break L1;
            } else {
              break L1;
            }
          }
          return var2;
        } else {
          L2: {
            var2 = 20 * this.field_a + this.field_b;
            if (-1 < (var2 ^ -1)) {
              var2 = 0;
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            if ((var2 ^ -1) < -300) {
              var2 = 299;
              break L3;
            } else {
              break L3;
            }
          }
          return var2;
        }
    }

    ob() {
        this.field_b = 0;
        this.field_a = 0;
    }

    ob(ob param0) {
        try {
            this.field_b = param0.field_b;
            this.field_a = param0.field_a;
        } catch (RuntimeException runtimeException) {
            throw bd.a((Throwable) ((Object) runtimeException), "ob.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
