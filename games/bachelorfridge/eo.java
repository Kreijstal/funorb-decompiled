/*
 * Decompiled by CFR-JS 0.4.0.
 */
class eo extends bw {
    static kv[] field_k;
    static js field_f;
    eo field_m;
    static String field_j;
    static int field_l;
    static String field_g;
    long field_h;
    eo field_i;

    final void b(int param0) {
        if (null == this.field_i) {
          return;
        }
        this.field_i.field_m = this.field_m;
        if (param0 == 0) {
          this.field_m.field_i = this.field_i;
          this.field_i = null;
          this.field_m = null;
          return;
        }
    }

    public static void c(byte param0) {
        field_j = null;
        field_k = null;
        field_g = null;
        if (param0 != 114) {
          return;
        }
        field_f = null;
    }

    final long d(int param0) {
        if (param0 >= -97) {
          return 6L;
        }
        return this.field_h;
    }

    final boolean a(int param0) {
        if (param0 != 0) {
          this.b(115);
          if (this.field_i != null) {
            return true;
          }
          return false;
        }
        if (this.field_i != null) {
          return true;
        }
        return false;
    }

    final static pp a(lu param0, int param1) {
        nq var2 = null;
        RuntimeException var2_ref = null;
        fda stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -4479) {
            field_l = 115;
          }
          var2 = qi.a(param0, (byte) 64);
          stackIn_3_0 = new fda(var2);
          return (pp) ((Object) stackIn_3_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_6_0 = var2_ref;
          stackIn_6_1 = new StringBuilder().append("eo.J(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void c(int param0) {
        eo var1 = null;
        int var3 = BachelorFridge.field_y;
        eo var1Lifetime1;
        try {
          bda.field_l = 0;
          sja.field_gb = null;
          maa.field_v = 0;
          es.field_j.d(71);
          cca.field_v.d(59);
          var1 = wja.field_m.b((byte) -73);
          while (var1 != null) {
            var1.b(0);
            var1 = wja.field_m.a(-25177);
          }
          int var2 = -42 / ((param0 - 35) / 54);
          var1Lifetime1 = fq.field_s.b((byte) -73);
          while (var1Lifetime1 != null) {
            var1Lifetime1.b(0);
            var1Lifetime1 = fq.field_s.a(-25177);
          }
          um.field_c = 0;
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "eo.I(" + param0 + ')');
        }
    }

    final void a(boolean param0, long param1) {
        if (null != this.field_i) {
          throw new RuntimeException();
        }
        if (!param0) {
          return;
        }
        this.field_h = param1;
    }

    protected eo() {
    }

    static {
        field_l = 0;
        field_j = "Visit the Account Management section on the main site to view.";
        field_g = "Achieved";
    }
}
