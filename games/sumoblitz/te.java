/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class te {
    private ms[] field_i;
    static int field_c;
    private int field_b;
    private int field_a;
    static iw field_f;
    private ms field_e;
    private ms field_d;
    static jn field_g;
    static String field_h;

    final ms a(boolean param0) {
        int fieldTemp$0 = 0;
        ms var2;
        int var3;
        var3 = Sumoblitz.field_L ? 1 : 0;
        if (this.field_b > 0 &&
          this.field_i[this.field_b - 1] != this.field_d) {
          var2 = this.field_d;
          this.field_d = var2.field_b;
          return var2;
        }
        if (!param0) {
          return (ms) null;
        }
        do {
          if (this.field_a <= this.field_b) {
            return null;
          }
          fieldTemp$0 = this.field_b;
          this.field_b = this.field_b + 1;
          var2 = this.field_i[fieldTemp$0].field_b;
        } while (this.field_i[-1 + this.field_b] == var2);
        this.field_d = var2.field_b;
        return var2;
    }

    final ms a(int param0, long param1) {
        ms var5 = null;
        int var6 = Sumoblitz.field_L ? 1 : 0;
        if (param0 < 102) {
          return (ms) null;
        }
        ms var4 = this.field_i[(int)(param1 & (long)(-1 + this.field_a))];
        this.field_e = var4.field_b;
        while (this.field_e != var4) {
          if (~param1 == ~this.field_e.field_h) {
            var5 = this.field_e;
            this.field_e = this.field_e.field_b;
            return var5;
          }
          this.field_e = this.field_e.field_b;
        }
        this.field_e = null;
        return null;
    }

    final void c(int param0) {
        int var2 = 0;
        ms var3 = null;
        ms var4 = null;
        int var5 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 6407) {
          return;
        }
        for (var2 = 0; this.field_a > var2; var2++) {
          var3 = this.field_i[var2];
          while (true) {
            var4 = var3.field_b;
            if (var4 == var3) {
              break;
            }
            var4.b(false);
          }
        }
        this.field_d = null;
        this.field_e = null;
    }

    public static void b(int param0) {
        if (param0 != 6406) {
          te.b(41);
        }
        field_h = null;
        field_f = null;
        field_g = null;
    }

    final ms a(int param0) {
        this.field_b = 0;
        if (param0 < 36) {
          return (ms) null;
        }
        return this.a(true);
    }

    final static boolean a(boolean param0, int param1, int param2) {
        if (param0) {
          field_h = (String) null;
        }
        return (is.a(!param0 ? true : false, param1, param2) | oj.b(param1, param2, -126) | pk.a(param1, param2, 52)) & jf.a(param1, (byte) -91, param2);
    }

    final void a(ms param0, int param1, long param2) {
        ms var5 = null;
        try {
          if (param0.field_g != null) {
            param0.b(false);
          }
          var5 = this.field_i[(int)(param2 & (long)(param1 + this.field_a))];
          param0.field_g = var5.field_g;
          param0.field_b = var5;
          param0.field_g.field_b = param0;
          param0.field_b.field_g = param0;
          param0.field_h = param2;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "te.B(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    final static int a(int param0, iw param1) {
        RuntimeException var2 = null;
        int stackIn_2_0 = 0;
        int stackIn_5_0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_14_0 = 0;
        int stackIn_19_0 = 0;
        int stackIn_21_0 = 0;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -21339) {
            stackIn_2_0 = 57;
            return stackIn_2_0;
          }
          if (m.field_X == param1) {
            stackIn_5_0 = 6407;
            return stackIn_5_0;
          }
          if (nl.field_p == param1) {
            stackIn_8_0 = 6408;
            return stackIn_8_0;
          }
          if (field_f == param1) {
            stackIn_11_0 = 6406;
            return stackIn_11_0;
          }
          if (kd.field_b == param1) {
            stackIn_14_0 = 6409;
            return stackIn_14_0;
          }
          if (param1 == ps.field_c) {
            stackIn_21_0 = 6410;
            return stackIn_21_0;
          }
          if (rg.field_A != param1) {
            throw new IllegalStateException();
          }
          stackIn_19_0 = 6145;
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_25_0 = var2;
          stackIn_25_1 = new StringBuilder().append("te.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_25_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    te(int param0) {
        int var2 = 0;
        ms dupTemp$0 = null;
        ms var3 = null;
        this.field_b = 0;
        this.field_a = param0;
        this.field_i = new ms[param0];
        for (var2 = 0; var2 < param0; var2++) {
          dupTemp$0 = new ms();
          var3 = dupTemp$0;
          this.field_i[var2] = dupTemp$0;
          var3.field_b = var3;
          var3.field_g = var3;
        }
    }

    static {
        field_c = 0;
        field_f = new iw(1);
        field_g = new jn();
        field_h = "Cancel";
    }
}
