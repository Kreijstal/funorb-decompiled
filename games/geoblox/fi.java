/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    static String field_h;
    private hf[] field_e;
    static Boolean field_b;
    private hf field_a;
    private int field_c;
    private int field_f;
    private hf field_g;
    static bg field_d;

    final hf a(long param0, byte param1) {
        hf var5 = null;
        hf var4 = this.field_e[(int)((long)(-1 + this.field_c) & param0)];
        this.field_g = var4.field_b;
        while (var4 != this.field_g) {
            if (!(~this.field_g.field_a != ~param0)) {
                var5 = this.field_g;
                this.field_g = this.field_g.field_b;
                return var5;
            }
            this.field_g = this.field_g.field_b;
        }
        if (param1 >= -73) {
            this.a((byte) -38);
            this.field_g = null;
            return null;
        }
        this.field_g = null;
        return null;
    }

    final static int a(int param0, int param1) {
        if (param1 != 2048) {
            field_h = (String) null;
            param0 = param0 & 8191;
            if (param0 >= 4096) {
                return param0 >= 6144 ? ai.field_l[-6144 + param0] : -ai.field_l[-param0 + 6144];
            }
            return 2048 <= param0 ? -ai.field_l[param0 - 2048] : ai.field_l[-param0 + 2048];
        }
        param0 = param0 & 8191;
        if (param0 >= 4096) {
            return param0 >= 6144 ? ai.field_l[-6144 + param0] : -ai.field_l[-param0 + 6144];
        }
        return 2048 <= param0 ? -ai.field_l[param0 - 2048] : ai.field_l[-param0 + 2048];
    }

    final void a(byte param0, hf param1, long param2) {
        hf var5 = null;
        try {
            if (!(null == param1.field_c)) {
                param1.a(false);
            }
            var5 = this.field_e[(int)((long)(this.field_c - 1) & param2)];
            param1.field_b = var5;
            param1.field_c = var5.field_c;
            param1.field_c.field_b = param1;
            param1.field_a = param2;
            if (param0 != 102) {
                field_d = (bg) null;
            }
            param1.field_b.field_c = param1;
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fi.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static void a(int param0, rf param1) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_h = (String) null;
          }
          if (param1 != null) {
            if (param1 != fe.field_e) {
              uh.field_y.d(-9268);
              fj.field_p.a();
              fe.field_e = param1;
              uh.field_y.a(true, fe.field_e, -1706);
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_10_0 = (RuntimeException) (runtimeException);
          stackIn_10_1 = new StringBuilder().append("fi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final hf a(byte param0) {
        if (param0 != 125) {
            fi.a(103);
            this.field_f = 0;
            return this.b(param0 - 195);
        }
        this.field_f = 0;
        return this.b(param0 - 195);
    }

    public static void a(int param0) {
        field_h = null;
        if (param0 >= -113) {
            return;
        }
        field_b = null;
        field_d = null;
    }

    fi(int param0) {
        int var2 = 0;
        hf dupTemp$1 = null;
        hf var3;
        this.field_f = 0;
        this.field_c = param0;
        this.field_e = new hf[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$1 = new hf();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.field_b = var3;
          var3.field_c = var3;
        }
    }

    final hf b(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var2;
        hf var3;
        hf var4;
        hf var7;
        if (this.field_f <= 0) {
          L1: while (true) {
            if (this.field_c <= this.field_f) {
              var2 = 47 % ((param0 - 28) / 38);
              return null;
            }
            {
              fieldTemp$1 = this.field_f;
              this.field_f = this.field_f + 1;
              var3 = this.field_e[fieldTemp$1].field_b;
              if (this.field_e[-1 + this.field_f] == var3) {
                continue L1;
              }
              this.field_a = var3.field_b;
              return var3;
            }
          }
        }
        if (this.field_a != this.field_e[this.field_f - 1]) {
          var7 = this.field_a;
          this.field_a = var7.field_b;
          return var7;
        }
        L0: while (true) {
          if (this.field_c <= this.field_f) {
            var2 = 47 % ((param0 - 28) / 38);
            return null;
          }
          {
            fieldTemp$0 = this.field_f;
            this.field_f = this.field_f + 1;
            var4 = this.field_e[fieldTemp$0].field_b;
            if (this.field_e[-1 + this.field_f] == var4) {
              continue L0;
            }
            this.field_a = var4.field_b;
            return var4;
          }
        }
    }

    static {
        field_h = "Change display name";
    }
}
