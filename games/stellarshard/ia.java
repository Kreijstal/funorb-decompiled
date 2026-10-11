/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ia extends tb implements oi {
    private ig field_P;

    ia(ei param0, di param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        rj var4 = null;
        try {
          var3 = null;
          if (param1 == ke.field_c) {
            var3 = ld.field_D;
          } else {
            if (param1 == nb.field_K) {
              this.field_t = this.field_t + 10;
              var3 = wh.field_d;
              if (ac.b((byte) 124)) {
                this.field_t = this.field_t + 20;
                var3 = dl.field_B;
              }
            } else {
              if (param1 == jj.field_k) {
                var3 = df.field_k;
                this.field_t = this.field_t + 30;
              }
            }
          }
          var4 = new rj((String) (var3), (lf) null);
          var4.field_p = this.field_p;
          var4.field_k = 50;
          var4.field_t = 80;
          var4.field_w = 0;
          var4.field_u = (uk) ((Object) new id(de.field_c, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b(4, var4);
          this.field_P = this.a(-120, (lf) (this), td.field_a);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ia.<init>(");
          if (param0 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          stackIn_15_1 = ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw ma.a((Throwable) (stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static int l(int param0) {
        if (rk.field_f < 2) {
          return 0;
        }
        if (bb.field_d == 0) {
          if (!lk.field_i.a((byte) -36)) {
            return 20;
          }
          if (!lk.field_i.a("commonui", (byte) -109)) {
            return 40;
          }
          if (!wf.field_e.a((byte) -36)) {
            return 50;
          }
          if (!wf.field_e.a("commonui", (byte) -109)) {
            return 60;
          }
          if (!am.field_g.a((byte) -36)) {
            return 70;
          }
          if (!am.field_g.c((byte) -111)) {
            return 80;
          }
        } else {
          if (null != pg.field_db) {
            if (!pg.field_db.a((byte) -36)) {
              return 14;
            }
            if (!pg.field_db.c("", (byte) -116)) {
              return 29;
            }
            if (!pg.field_db.a("", (byte) -109)) {
              return 29;
            }
          }
          if (!lk.field_i.a((byte) -36)) {
            return 43;
          }
          if (!lk.field_i.a("commonui", (byte) -109)) {
            return 57;
          }
          if (!wf.field_e.a((byte) -36)) {
            return 71;
          }
          if (!wf.field_e.a("commonui", (byte) -109)) {
            return 80;
          }
          if (!am.field_g.a((byte) -36)) {
            return 82;
          }
          if (!am.field_g.c((byte) -111)) {
            return 86;
          }
        }
        if (param0 != 50) {
          return 101;
        }
        return 100;
    }

    private final void k(int param0) {
        if (param0 != 13807) {
          ig var3 = (ig) null;
          this.a(-72, -99, (ig) null, false, 3);
          if (this.field_G) {
            this.field_G = false;
            return;
          }
          return;
        }
        if (this.field_G) {
          this.field_G = false;
          return;
        }
    }

    public final void a(int param0, int param1, ig param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == this.field_P) {
            this.k(13807);
          }
          if (!param3) {
            return;
          }
          this.k(-2);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_7_0 = var6;
          stackIn_7_1 = new StringBuilder().append("ia.M(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    private final ig a(int param0, lf param1, String param2) {
        ig var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        ig stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new ig(param2, param1);
          var4.field_u = (uk) ((Object) new b());
          var5 = -6 + this.field_t;
          this.field_t = this.field_t + 38;
          var4.b(-30 + this.field_p, 15, var5, 30, 23987);
          this.b(4, var4);
          this.f(0);
          if (param0 >= -116) {
            this.k(-89);
          }
          stackIn_3_0 = var4;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = var4_ref;
          stackIn_6_1 = new StringBuilder().append("ia.K(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
