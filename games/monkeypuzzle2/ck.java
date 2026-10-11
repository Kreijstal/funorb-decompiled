/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ck {
    static boolean field_e;
    private ug field_c;
    static int field_b;
    static String field_f;
    static le[] field_a;
    private pj field_h;
    static String field_d;
    static int[] field_g;

    public static void b(int param0) {
        field_a = null;
        if (param0 != 110) {
          return;
        }
        field_g = null;
        field_d = null;
        field_f = null;
    }

    final ug a(byte param0, ug param1) {
        ug var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ug stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -127) {
            field_e = false;
          }
          if (param1 == null) {
            var3 = this.field_h.field_f.field_d;
          } else {
            var3 = param1;
          }
          if (var3 == this.field_h.field_f) {
            this.field_c = null;
            stackIn_8_0 = null;
            return (ug) (stackIn_8_0);
          }
          this.field_c = var3.field_d;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ck.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static le[] a(int param0, int param1) {
        le[] var3 = new le[9];
        le[] var2 = var3;
        var3[4] = sj.a(64, 74, param0);
        if (param1 == -14377) {
          return var2;
        }
        field_g = (int[]) null;
        return var2;
    }

    final ug a(boolean param0) {
        ug var2 = this.field_c;
        if (var2 == this.field_h.field_f) {
          this.field_c = null;
          return null;
        }
        if (param0) {
          this.field_c = var2.field_d;
          return var2;
        }
        field_d = (String) null;
        this.field_c = var2.field_d;
        return var2;
    }

    final ug b(byte param0) {
        if (param0 > -95) {
          return (ug) null;
        }
        ug var2 = this.field_h.field_f.field_c;
        if (var2 != this.field_h.field_f) {
          this.field_c = var2.field_c;
          return var2;
        }
        this.field_c = null;
        return null;
    }

    final ug a(int param0) {
        ug var2 = null;
        ug var2Lifetime1;
        if (param0 != -3703) {
          this.a(false);
          var2 = this.field_c;
          if (var2 == this.field_h.field_f) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.field_c;
          return var2;
        }
        var2Lifetime1 = this.field_c;
        if (var2Lifetime1 == this.field_h.field_f) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2Lifetime1.field_c;
        return var2Lifetime1;
    }

    ck(pj param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw la.a((Throwable) ((Object) runtimeException), "ck.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ug a(byte param0) {
        ug var2 = this.field_h.field_f.field_d;
        if (var2 == this.field_h.field_f) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_d;
        if (param0 == -37) {
          return var2;
        }
        return (ug) null;
    }

    final ug a(int param0, ug param1) {
        ug var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_8_0 = null;
        ug stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -11121) {
            field_e = true;
          }
          if (param1 != null) {
            var3 = param1;
          } else {
            var3 = this.field_h.field_f.field_c;
          }
          if (this.field_h.field_f == var3) {
            this.field_c = null;
            stackIn_8_0 = null;
            return (ug) (stackIn_8_0);
          }
          this.field_c = var3.field_c;
          stackIn_10_0 = var3;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("ck.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw la.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    static {
        field_b = -1;
        field_g = new int[]{0, 110, 10, 100, 20, 90, 30, 80, 40, 70, 50, 60};
        field_d = "This password is part of your Player Name, and would be easy to guess";
    }
}
