/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class df extends a {
    private String field_j;
    private boolean field_k;

    final static void a(int param0, boolean param1) {
        we.field_h = 0;
        ua.field_L = 0;
        wd.field_a = 0;
        ti.field_e = uc.field_e;
        qh.field_b = new sf(2);
        qh.field_b.a(param1, -1, ad.a(ad.field_m, gb.field_j, param0), param0 + 121);
    }

    final String a(String param0, boolean param1) {
        String var3 = null;
        RuntimeException var3_ref = null;
        wg var4 = null;
        String var5 = null;
        CharSequence var6 = null;
        String stackIn_5_0 = null;
        Object stackIn_11_0 = null;
        String stackIn_15_0 = null;
        String stackIn_17_0 = null;
        RuntimeException stackIn_20_0 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            var5 = (String) null;
            this.a((String) null, true);
          }
          var6 = (CharSequence) ((Object) param0);
          var3 = sj.a(var6, 0);
          if (var3 != null) {
            stackIn_5_0 = var3;
            return stackIn_5_0;
          }
          if (!param0.equals(this.field_j)) {
            var4 = gb.a(param0, (byte) 122);
            if (var4 == null) {
              return null;
            }
            if (null != var4.field_d) {
              stackIn_11_0 = null;
              return (String) (stackIn_11_0);
            }
            this.field_k = var4.field_c;
            this.field_j = param0;
          }
          if (this.field_k) {
            stackIn_17_0 = hj.field_o;
            return stackIn_17_0;
          }
          stackIn_15_0 = pc.field_d;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_20_0 = var3_ref;
          stackIn_20_1 = new StringBuilder().append("df.K(");
          if (param0 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_20_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(boolean param0) {
        this.field_j = null;
        if (!param0) {
          String var3 = (String) null;
          this.a((String) null, true);
        }
    }

    final static void h(int param0) {
        kd.field_c = -1;
        s.field_ib = null;
        bf.field_a = param0;
        kk.field_d = 0;
        ab.field_u = false;
    }

    final qf a(String param0, byte param1) {
        wg var3 = null;
        RuntimeException var3_ref = null;
        String var4 = null;
        CharSequence var5 = null;
        qf stackIn_2_0 = null;
        qf stackIn_8_0 = null;
        qf stackIn_15_0 = null;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5 = (CharSequence) ((Object) param0);
          if (!rc.a(111, var5)) {
            stackIn_2_0 = rg.field_f;
            return stackIn_2_0;
          }
          if (!param0.equals(this.field_j)) {
            var3 = gb.a(param0, (byte) 100);
            if (var3 != null &&
              var3.field_d == null) {
              this.field_j = param0;
              this.field_k = var3.field_c;
            } else {
              stackIn_8_0 = db.field_u;
              return stackIn_8_0;
            }
          }
          if (param1 > -109) {
            var4 = (String) null;
            this.a((String) null, true);
          }
          if (!this.field_k) {
            stackIn_15_0 = rg.field_f;
          } else {
            stackIn_15_0 = ph.field_g;
          }
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_18_0 = var3_ref;
          stackIn_18_1 = new StringBuilder().append("df.J(");
          if (param0 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param1).append(')').toString());
        }
    }

    df(vg param0) {
        super(param0);
        this.field_k = false;
    }

    static {
    }
}
