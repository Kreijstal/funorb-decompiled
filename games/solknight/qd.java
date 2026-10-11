/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qd {
    static String field_a;
    static o[] field_e;
    private int field_c;
    static o[] field_f;
    private gg field_h;
    private gg[] field_g;
    static int field_d;
    private gg field_b;
    private int field_i;

    final gg c(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        gg var4;
        gg var5;
        gg var9;
        gg var12;
        var3 = SolKnight.field_L ? 1 : 0;
        if (param0 < 49) {
          return (gg) null;
        }
        if (0 >= this.field_c) {
          do {
            if (this.field_i <= this.field_c) {
              return null;
            }
            fieldTemp$1 = this.field_c;
            this.field_c = this.field_c + 1;
            var4 = this.field_g[fieldTemp$1].field_d;
            var5 = var4;
          } while (var4 == this.field_g[this.field_c - 1]);
          this.field_h = var5.field_d;
          return var5;
        }
        if (this.field_g[this.field_c - 1] != this.field_h) {
          var12 = this.field_h;
          this.field_h = var12.field_d;
          return var12;
        }
        do {
          if (this.field_i <= this.field_c) {
            return null;
          }
          fieldTemp$0 = this.field_c;
          this.field_c = this.field_c + 1;
          var4 = this.field_g[fieldTemp$0].field_d;
          var9 = var4;
        } while (var4 == this.field_g[this.field_c - 1]);
        this.field_h = var9.field_d;
        return var9;
    }

    final gg a(boolean param0, long param1) {
        gg var5 = null;
        int var6 = SolKnight.field_L ? 1 : 0;
        gg var4 = this.field_g[(int)((long)(this.field_i - 1) & param1)];
        this.field_b = var4.field_d;
        while (var4 != this.field_b) {
          if (~this.field_b.field_g == ~param1) {
            var5 = this.field_b;
            this.field_b = this.field_b.field_d;
            return var5;
          }
          this.field_b = this.field_b.field_d;
        }
        this.field_b = null;
        if (param0) {
          return null;
        }
        this.c((byte) -46);
        return null;
    }

    final gg b(int param0) {
        this.field_c = param0;
        return this.c((byte) 107);
    }

    final static void a(byte param0) {
        h.a(4, true);
        if (param0 == -13) {
          return;
        }
        qd.a(28);
    }

    public static void a(int param0) {
        field_f = null;
        if (param0 != 4) {
          return;
        }
        field_a = null;
        field_e = null;
    }

    final void a(byte param0, gg param1, long param2) {
        gg var5 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        try {
          if (param1.field_a != null) {
            param1.c(10);
          }
          var5 = this.field_g[(int)(param2 & (long)(this.field_i - 1))];
          param1.field_d = var5;
          param1.field_a = var5.field_a;
          param1.field_a.field_d = param1;
          param1.field_d.field_a = param1;
          param1.field_g = param2;
          if (param0 <= 22) {
            field_d = -118;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("qd.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param2).append(')').toString());
        }
    }

    final static boolean b(byte param0) {
        if (te.field_O == -1) {
          if (!bf.c(79, 1)) {
            return false;
          }
          te.field_O = te.field_N.j(255);
          te.field_N.field_m = 0;
        }
        if (te.field_O == -2) {
          if (!bf.c(36, 2)) {
            return false;
          }
          te.field_O = te.field_N.i(-22);
          te.field_N.field_m = 0;
        }
        if (param0 <= 124) {
          qd.a(-104);
          return bf.c(100, te.field_O);
        }
        return bf.c(100, te.field_O);
    }

    qd(int param0) {
        int var2 = 0;
        gg dupTemp$1 = null;
        gg var3;
        this.field_c = 0;
        this.field_g = new gg[param0];
        this.field_i = param0;
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new gg();
          var3 = dupTemp$1;
          this.field_g[var2] = dupTemp$1;
          var3.field_a = var3;
          var3.field_d = var3;
        }
    }

    static {
        field_a = "To server list";
        field_d = 0;
    }
}
