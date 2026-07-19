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
        } else {
          this.field_j.field_p = this.field_p;
          this.field_p.field_j = this.field_j;
          this.field_p = null;
          if (param0 != 0) {
            this.h(3);
            this.field_j = null;
            return;
          } else {
            this.field_j = null;
            return;
          }
        }
    }

    final boolean a(byte param0) {
        if (param0 > 71) {
          if (this.field_j == null) {
            return false;
          } else {
            return true;
          }
        } else {
          field_n = 110;
          if (this.field_j == null) {
            return false;
          } else {
            return true;
          }
        }
    }

    public static void g(int param0) {
        field_m = null;
        int var1 = -7 % ((13 - param0) / 62);
    }

    protected ta() {
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        var7 = Torquing.field_u;
        try {
          L0: {
            L1: {
              var6_int = param2;
              if (param0 == 0) {
                break L1;
              } else {
                ta.g(-46);
                break L1;
              }
            }
            L2: while (true) {
              if (param1 < var6_int) {
                break L0;
              } else {
                di.a(param4, (byte) -97, param3, qd.field_a[var6_int], param5);
                var6_int++;
                continue L2;
              }
            }
          }
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
