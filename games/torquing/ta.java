/*
 * Decompiled by CFR-JS 0.4.0.
 */
class ta extends q {
    static int field_n;
    long field_l;
    static int field_o;
    static long field_k;
    static String field_m;
    ta field_p;
    ta field_j;

    final void h(int param0) {
        if (null == this.field_j) {
          return;
        }
        this.field_j.field_p = this.field_p;
        this.field_p.field_j = this.field_j;
        this.field_p = null;
        if (param0 == 0) {
          this.field_j = null;
          return;
        }
        this.h(3);
        this.field_j = null;
    }

    final boolean a(byte param0) {
        if (param0 <= 71) {
          field_n = 110;
          if (this.field_j != null) {
            return true;
          }
          return false;
        }
        if (this.field_j != null) {
          return true;
        }
        return false;
    }

    public static void g(int param0) {
        field_m = null;
        int var1 = -7 % ((13 - param0) / 62);
    }

    protected ta() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var7 = Torquing.field_u;
        try {
          var6_int = param2;
          if (param0 != 0) {
            ta.g(-46);
          }
          while (param1 >= var6_int) {
            di.a(param4, (byte) -97, param3, qd.field_a[var6_int], param5);
            var6_int++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "ta.Q(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    static {
        field_m = "Age:";
        field_o = 0;
        field_n = 0;
    }
}
