/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fl {
    private String field_e;
    private boolean field_d;
    static int[] field_g;
    static String field_f;
    static String field_c;
    static fm field_b;
    private boolean field_a;

    final static qe c(int param0) {
        int var1_int = 0;
        qe var2 = null;
        qe stackIn_6_0 = null;
        Throwable decompiledCaughtException = null;
        IllegalArgumentException var1 = null;
        try {
          if (param0 != -3060) {
            fl.a((byte) 81);
          }
          var1_int = 0;
          while (true) {
            var2 = w.field_y.a(var1_int, false);
            if (var2.field_y) {
              stackIn_6_0 = var2;
              return stackIn_6_0;
            }
            var1_int++;
          }
        } catch (java.lang.IllegalArgumentException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = (IllegalArgumentException) (Object) decompiledCaughtException;
          return null;
        }
    }

    final static boolean a(int param0, int param1, int param2, int param3) {
        if (ln.field_q) {
          return td.field_b.a(nj.field_f, ke.field_a, false);
        }
        if (un.field_l) {
          return vl.b(102, param2, param1);
        }
        if (hn.a(param1, param2, param3)) {
          return true;
        }
        if (lh.field_g) {
          return false;
        }
        return go.a(param0, -35, param1);
    }

    final boolean d(int param0) {
        if (param0 <= 35) {
          this.b((byte) 37);
          return this.field_d;
        }
        return this.field_d;
    }

    final static void a(byte param0) {
        wa.field_c.e((byte) 54);
        int var1 = -119 / ((param0 + 55) / 51);
        if (null != cn.field_b) {
          wa.field_c.b(-6183, cn.field_b);
          return;
        }
        cn.field_b = new ko(wa.field_c, wp.field_a);
        wa.field_c.b(-6183, cn.field_b);
    }

    final boolean b(int param0) {
        if (param0 != -20425) {
          fl.a((byte) -122);
          return this.field_a;
        }
        return this.field_a;
    }

    final void a(int param0, boolean param1) {
        if (param0 == 0) {
          this.field_d = true;
          this.field_a = param1 ? true : false;
          return;
        }
        field_g = (int[]) null;
        this.field_d = true;
        this.field_a = param1 ? true : false;
    }

    public static void a(int param0) {
        field_g = null;
        field_c = null;
        field_f = null;
        field_b = null;
        if (param0 != 0) {
          field_g = (int[]) null;
        }
    }

    final String b(byte param0) {
        int var2 = 63 / ((param0 - 28) / 50);
        return this.field_e;
    }

    fl(String param0) {
        this.field_d = false;
        this.field_a = false;
        try {
          this.field_e = param0;
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "fl.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_c = "Ignore";
        field_f = "Names cannot contain consecutive spaces";
    }
}
