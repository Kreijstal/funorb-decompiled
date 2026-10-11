/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ho extends bw {
    static sna field_g;
    static String field_f;
    int field_i;
    pd field_h;
    static ee[] field_j;

    public static void a(int param0) {
        field_j = null;
        field_g = null;
        if (param0 < 70) {
          return;
        }
        field_f = null;
    }

    final ho c(byte param0) {
        if (param0 > 45) {
          return new ho(this.field_h, this.field_i);
        }
        field_j = (ee[]) null;
        return new ho(this.field_h, this.field_i);
    }

    final static int a(int param0, int param1) {
        int var2 = 0;
        if (param0 > 25) {
          var2 = param1 >>> 1;
          var2 = var2 | var2 >>> 1;
          var2 = var2 | var2 >>> 2;
          var2 = var2 | var2 >>> 4;
          var2 = var2 | var2 >>> 8;
          var2 = var2 | var2 >>> 16;
          return ~var2 & param1;
        }
        return -114;
    }

    ho(pd param0, int param1) {
        try {
          this.field_i = param1;
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "ho.<init>(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    static {
        field_f = "Hide private chat and appear offline to friends";
    }
}
