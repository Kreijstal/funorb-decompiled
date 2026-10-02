/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ij extends oe implements pl {
    static int field_X;
    static float field_ab;
    private hk field_bb;
    static String field_Z;
    static int field_cb;
    static int field_W;
    static String field_Y;

    private final hk a(String param0, byte param1, bb param2) {
        hk var4 = null;
        RuntimeException var4_ref = null;
        int var5 = 0;
        hk stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4 = new hk(param0, param2);
          if (param1 != 87) {
            field_X = 121;
          }
          var4.field_q = (dh) ((Object) new ml());
          var5 = this.field_h - 6;
          this.field_h = this.field_h + 38;
          var4.a(30, -14 + (this.field_r - 16), (byte) -111, var5, 15);
          this.b((byte) -70, var4);
          this.c(param1 - 198);
          stackIn_3_0 = (hk) (var4);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_6_0 = (RuntimeException) (var4_ref);
          stackIn_6_1 = new StringBuilder().append("ij.B(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void i(byte param0) {
        field_Z = null;
        if (param0 > 0) {
            ij.i((byte) 25);
            field_Y = null;
            return;
        }
        field_Y = null;
    }

    final static int m(int param0) {
        if (param0 <= 18) {
            ij.m(48);
            return qi.b(f.field_qb, 1);
        }
        return qi.b(f.field_qb, 1);
    }

    ij(ng param0, uj param1) {
        super(param0, 200, 150);
        Object var3 = null;
        Object stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        el var4 = null;
        try {
          var3 = null;
          if (q.field_h == param1) {
            var3 = ei.field_gb;
          } else {
            if (param1 == ei.field_hb) {
              var3 = k.field_b;
              this.field_h = this.field_h + 10;
              if (nb.a(true)) {
                var3 = ad.field_n;
                this.field_h = this.field_h + 20;
              }
            } else {
              if (param1 == pa.field_b) {
                var3 = f.field_nb;
                this.field_h = this.field_h + 30;
              }
            }
          }
          var4 = new el((String) (var3), (bb) null);
          var4.field_v = 0;
          var4.field_h = 80;
          var4.field_r = this.field_r;
          var4.field_m = 50;
          var4.field_q = (dh) ((Object) new ff(hh.field_d, 10, 10, 0, 10, 16777215, -1, 1, 0, 16, 0, 0, true));
          this.b((byte) -91, var4);
          this.field_bb = this.a(hh.field_b, (byte) 87, (bb) (this));
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("ij.<init>(");
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
          throw t.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    private final void j(byte param0) {
        if (!(this.field_I)) {
            return;
        }
        int var2 = 102 / ((param0 - 6) / 43);
        this.field_I = false;
    }

    public final void a(int param0, byte param1, int param2, int param3, hk param4) {
        RuntimeException var6 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param4 == this.field_bb) {
            this.j((byte) 122);
          }
          if (param1 == -20) {
            return;
          }
          field_W = -95;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_8_0 = (RuntimeException) (var6);
          stackIn_8_1 = new StringBuilder().append("ij.Q(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static void h(byte param0) {
        int var1 = 0;
        int var2 = 0;
        if (!el.field_o.field_x) {
            var1 = el.field_o.field_w - 2;
            var2 = el.field_o.field_u - 2;
            if (!(wa.field_a <= 0)) {
                vg.field_f[ha.field_g].b(320 - (vg.field_f[ha.field_g].field_s >> 1), -(vg.field_f[ha.field_g].field_o >> 1) + 240);
            }
            fc.field_b[uf.field_b].b(var1 + 320, 240 + var2, rj.field_c);
            vh.field_H[nd.field_a].b(320 + var1, 240 + var2, rj.field_c);
            if (param0 >= 3) {
                return;
            }
            field_Z = (String) null;
            return;
        }
        if (null == ul.field_a) {
            var1 = el.field_o.field_w - 2;
            var2 = el.field_o.field_u - 2;
            if (!(wa.field_a <= 0)) {
                vg.field_f[ha.field_g].b(320 - (vg.field_f[ha.field_g].field_s >> 1), -(vg.field_f[ha.field_g].field_o >> 1) + 240);
            }
            fc.field_b[uf.field_b].b(var1 + 320, 240 + var2, rj.field_c);
            vh.field_H[nd.field_a].b(320 + var1, 240 + var2, rj.field_c);
            if (param0 >= 3) {
                return;
            }
            field_Z = (String) null;
            return;
        }
        ul.field_a.b(-(ul.field_a.field_s >> 1) + 319, -(ul.field_a.field_o >> 1) + 240);
        if (param0 >= 3) {
            return;
        }
        field_Z = (String) null;
    }

    static {
        field_X = 0;
        field_Z = "Menu";
        field_ab = 0.5f;
        field_Y = "Enter a password for this account. Try to pick a strong password that can't easily be guessed.";
    }
}
