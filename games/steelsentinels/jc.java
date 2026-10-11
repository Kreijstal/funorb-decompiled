/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc {
    static String field_j;
    static boolean field_k;
    private ul field_h;
    static int field_f;
    private ck field_a;
    static String field_i;
    static boolean field_d;
    static gk[] field_c;
    static wk field_b;
    static String field_e;
    static String field_g;

    final ck a(int param0, ck param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        ck stackIn_8_0 = null;
        ck stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_h.field_e.field_i;
          } else {
            var3 = param1;
          }
          if (this.field_h.field_e == var3) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (ck) (stackIn_5_0);
          }
          this.field_a = var3.field_i;
          if (param0 == 24192) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = (ck) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("jc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final ck b(int param0) {
        ck var2 = null;
        ck var2Lifetime1;
        if (param0 != 2) {
          ck var3 = (ck) null;
          this.a(-4, (ck) null);
          var2 = this.field_h.field_e.field_k;
          if (var2 == this.field_h.field_e) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_k;
          return var2;
        }
        var2Lifetime1 = this.field_h.field_e.field_k;
        if (var2Lifetime1 == this.field_h.field_e) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_k;
        return var2Lifetime1;
    }

    final static String b(byte param0) {
        if (pg.field_A) {
          if (param0 != -122) {
            field_j = (String) null;
            return null;
          }
          return null;
        }
        if (si.field_m < ik.field_c) {
          if (param0 != -122) {
            field_j = (String) null;
            return null;
          }
          return null;
        }
        if (ik.field_c + ni.field_c > si.field_m) {
          return rc.field_b;
        }
        if (param0 != -122) {
          field_j = (String) null;
          return null;
        }
        return null;
    }

    final static boolean a(int param0) {
        if (param0 != 2) {
          field_c = (gk[]) null;
          if (an.field_i != null) {
            return true;
          }
          if (fk.a(0)) {
            return true;
          }
          if (n.field_x != null) {
            return true;
          }
          if (!a.a(false)) {
            return false;
          }
          return true;
        }
        if (an.field_i != null) {
          return true;
        }
        if (fk.a(0)) {
          return true;
        }
        if (n.field_x != null) {
          return true;
        }
        if (!a.a(false)) {
          return false;
        }
        return true;
    }

    jc(ul param0) {
        try {
          this.field_h = param0;
        } catch (RuntimeException runtimeException) {
          throw ci.a((Throwable) ((Object) runtimeException), "jc.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final ck d(int param0) {
        if (param0 != 2) {
          return (ck) null;
        }
        ck var2 = this.field_a;
        if (this.field_h.field_e != var2) {
          this.field_a = var2.field_k;
          return var2;
        }
        this.field_a = null;
        return null;
    }

    final static void a(byte param0) {
        nm.field_n = null;
        dj.field_j = null;
        vl.field_r = false;
        oc.field_d = null;
        a.field_g = null;
        if (param0 != -2) {
          jc.b((byte) 42);
        }
    }

    final ck c(int param0) {
        ck var2 = null;
        ck var2Lifetime1;
        if (param0 != 2) {
          this.field_h = (ul) null;
          var2 = this.field_h.field_e.field_i;
          if (var2 == this.field_h.field_e) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_i;
          return var2;
        }
        var2Lifetime1 = this.field_h.field_e.field_i;
        if (var2Lifetime1 == this.field_h.field_e) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_i;
        return var2Lifetime1;
    }

    final ck a(boolean param0) {
        ck var2 = null;
        ck var2Lifetime1;
        if (!param0) {
          jc.a(-87);
          var2 = this.field_a;
          if (this.field_h.field_e == var2) {
            this.field_a = null;
            return null;
          }
          this.field_a = var2.field_i;
          return var2;
        }
        var2Lifetime1 = this.field_a;
        if (this.field_h.field_e == var2Lifetime1) {
          this.field_a = null;
          return null;
        }
        this.field_a = var2Lifetime1.field_i;
        return var2Lifetime1;
    }

    final ck a(boolean param0, ck param1) {
        ck var3 = null;
        RuntimeException var3_ref = null;
        Object stackIn_5_0 = null;
        ck stackIn_8_0 = null;
        ck stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            var3 = this.field_h.field_e.field_k;
          } else {
            var3 = param1;
          }
          if (this.field_h.field_e == var3) {
            this.field_a = null;
            stackIn_5_0 = null;
            return (ck) (stackIn_5_0);
          }
          this.field_a = var3.field_k;
          if (!param0) {
            stackIn_10_0 = var3;
            return stackIn_10_0;
          }
          stackIn_8_0 = (ck) null;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_13_0 = var3_ref;
          stackIn_13_1 = new StringBuilder().append("jc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    public static void e(int param0) {
        field_i = null;
        if (param0 == 5370) {
          field_j = null;
          field_b = null;
          field_g = null;
          field_e = null;
          field_c = null;
          return;
        }
        field_d = false;
        field_j = null;
        field_b = null;
        field_g = null;
        field_e = null;
        field_c = null;
    }

    static {
        field_j = "Movement and Navigation";
        field_f = 2;
        field_k = false;
        field_e = "RESIGNED";
        field_i = "Return to Main Menu";
        field_g = "Your ignore list is full. Max of 100 hit.";
    }
}
