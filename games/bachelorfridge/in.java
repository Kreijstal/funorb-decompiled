/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class in {
    static String field_d;
    static double field_e;
    private eo field_a;
    private eo field_c;
    static kv field_b;

    final eo a(boolean param0) {
        eo var2 = this.field_a.field_m;
        if (this.field_a == var2) {
          return null;
        }
        var2.b(0);
        if (param0) {
          return var2;
        }
        return (eo) null;
    }

    final int b(boolean param0) {
        int var4 = BachelorFridge.field_y;
        int var2 = 0;
        eo var3 = this.field_a.field_m;
        while (var3 != this.field_a) {
          var3 = var3.field_m;
          var2++;
        }
        if (param0) {
          return var2;
        }
        field_e = 0.13565851329759948;
        return var2;
    }

    final eo a(int param0) {
        eo var2 = this.field_a.field_m;
        if (param0 >= -73) {
          return (eo) null;
        }
        if (var2 != this.field_a) {
          this.field_c = var2.field_m;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final eo a(byte param0) {
        eo var2 = this.field_c;
        if (var2 == this.field_a) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_m;
        if (param0 >= 80) {
          return var2;
        }
        this.a((byte) 52);
        return var2;
    }

    public in() {
        this.field_a = new eo();
        this.field_a.field_i = this.field_a;
        this.field_a.field_m = this.field_a;
    }

    public static void b(int param0) {
        field_d = null;
        field_b = null;
        if (param0 != -1) {
          field_d = (String) null;
        }
    }

    final void a(eo param0, byte param1) {
        try {
          if (param0.field_i != null) {
            param0.b(0);
          }
          param0.field_i = this.field_a.field_i;
          param0.field_m = this.field_a;
          param0.field_i.field_m = param0;
          int var3_int = -71 / ((param1 - 20) / 55);
          param0.field_m.field_i = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "in.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_e = -1.0;
        field_d = "<%0> is not a member, and cannot play with the current options.";
    }
}
