/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fi {
    private gp field_i;
    static String field_j;
    static byte[] field_c;
    static tj field_b;
    private long field_d;
    static String field_e;
    private int field_h;
    private int field_g;
    private gp field_a;
    private gp[] field_f;

    final static void a(int param0, boolean param1, String param2) {
        try {
          bf.field_a = param1;
          ed.field_t = true;
          df.field_l = new fj(ch.field_e, sg.field_a, param2, tk.field_e, bf.field_a);
          ch.field_e.b(df.field_l, param0 ^ param0);
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fi.B(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(gp param0, long param1, int param2) {
        gp var5 = null;
        try {
          if (null != param0.field_o) {
            param0.a(-107);
          }
          int var6 = 118 / ((param2 + 20) / 35);
          var5 = this.field_f[(int)(param1 & (long)(-1 + this.field_g))];
          param0.field_p = var5;
          param0.field_o = var5.field_o;
          param0.field_o.field_p = param0;
          param0.field_n = param1;
          param0.field_p.field_o = param0;
        } catch (RuntimeException runtimeException) {
          throw wn.a((Throwable) ((Object) runtimeException), "fi.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != 0) {
          return;
        }
        field_j = null;
        field_e = null;
        field_b = null;
        field_c = null;
    }

    final gp a(byte param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int fieldTemp$3 = 0;
        int fieldTemp$2 = 0;
        int var3;
        gp var4;
        gp var5;
        gp var29;
        gp var57;
        gp var58;
        gp var59;
        var3 = Vertigo2.field_L ? 1 : 0;
        if (this.field_h <= 0) {
          if (param0 == -60) {
            do {
              if (this.field_g <= this.field_h) {
                return null;
              }
              fieldTemp$1 = this.field_h;
              this.field_h = this.field_h + 1;
              var4 = this.field_f[fieldTemp$1].field_p;
              var58 = var4;
            } while (var4 == this.field_f[-1 + this.field_h]);
            this.field_a = var58.field_p;
            return var58;
          }
          this.a(-90);
          do {
            if (this.field_g <= this.field_h) {
              return null;
            }
            fieldTemp$0 = this.field_h;
            this.field_h = this.field_h + 1;
            var4 = this.field_f[fieldTemp$0].field_p;
            var59 = var4;
          } while (var4 == this.field_f[-1 + this.field_h]);
          this.field_a = var59.field_p;
          return var59;
        }
        if (this.field_a != this.field_f[this.field_h - 1]) {
          var57 = this.field_a;
          this.field_a = var57.field_p;
          return var57;
        }
        if (param0 == -60) {
          do {
            if (this.field_g <= this.field_h) {
              return null;
            }
            fieldTemp$3 = this.field_h;
            this.field_h = this.field_h + 1;
            var4 = this.field_f[fieldTemp$3].field_p;
            var5 = var4;
          } while (var4 == this.field_f[-1 + this.field_h]);
          this.field_a = var5.field_p;
          return var5;
        }
        this.a(-90);
        do {
          if (this.field_g <= this.field_h) {
            return null;
          }
          fieldTemp$2 = this.field_h;
          this.field_h = this.field_h + 1;
          var4 = this.field_f[fieldTemp$2].field_p;
          var29 = var4;
        } while (var4 == this.field_f[-1 + this.field_h]);
        this.field_a = var29.field_p;
        return var29;
    }

    final static co a(int param0, r param1, r param2, int param3, byte param4) {
        int var5_int = 0;
        RuntimeException var5 = null;
        Object stackIn_2_0 = null;
        co stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var5_int = 34 % ((-6 - param4) / 33);
          if (hq.a(124, param0, param3, param1)) {
            stackIn_4_0 = m.a(param2.a(param0, param3, (byte) -103), 0);
            return stackIn_4_0;
          }
          stackIn_2_0 = null;
          return (co) (stackIn_2_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_7_0 = var5;
          stackIn_7_1 = new StringBuilder().append("fi.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw wn.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final gp b(int param0) {
        int var2 = 59 / ((-72 - param0) / 53);
        this.field_h = 0;
        return this.a((byte) -60);
    }

    final gp a(int param0, long param1) {
        gp var4;
        gp var5;
        int var6;
        var6 = Vertigo2.field_L ? 1 : 0;
        this.field_d = param1;
        if (param0 != 3661) {
          return (gp) null;
        }
        var4 = this.field_f[(int)((long)(this.field_g - 1) & param1)];
        this.field_i = var4.field_p;
        while (true) {
          if (var4 == this.field_i) {
            this.field_i = null;
            return null;
          }
          if (~param1 != ~this.field_i.field_n) {
            this.field_i = this.field_i.field_p;
            continue;
          }
          break;
        }
        var5 = this.field_i;
        this.field_i = this.field_i.field_p;
        return var5;
    }

    final gp a(int param0) {
        gp var2;
        gp var3;
        int var4;
        var4 = Vertigo2.field_L ? 1 : 0;
        if (null == this.field_i) {
          return null;
        }
        if (param0 > -89) {
          return (gp) null;
        }
        var2 = this.field_f[(int)(this.field_d & (long)(-1 + this.field_g))];
        while (true) {
          if (this.field_i == var2) {
            this.field_i = null;
            return null;
          }
          if (~this.field_i.field_n != ~this.field_d) {
            this.field_i = this.field_i.field_p;
            continue;
          }
          break;
        }
        var3 = this.field_i;
        this.field_i = this.field_i.field_p;
        return var3;
    }

    fi(int param0) {
        int var2 = 0;
        gp dupTemp$1 = null;
        gp var3;
        this.field_h = 0;
        this.field_g = param0;
        this.field_f = new gp[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new gp();
          var3 = dupTemp$1;
          this.field_f[var2] = dupTemp$1;
          var3.field_p = var3;
          var3.field_o = var3;
        }
    }

    static {
        field_j = "Average rating";
        field_b = new tj();
    }
}
