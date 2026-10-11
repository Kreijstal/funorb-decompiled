/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ha {
    private da[] field_e;
    private int field_b;
    private da field_f;
    static int field_d;
    private da field_c;
    private int field_a;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_9_0 = 0;
        int stackIn_15_0 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var8 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param2 > -21) {
            ha.a(-128, -24, 80);
          }
          var3_int = 0;
          var4 = jl.field_e;
          while (gf.field_s.length > var3_int) {
            var5 = dl.field_s[var3_int];
            if (var5 < 0) {
              var4 = var4 + ok.field_e;
            } else {
              var6 = ki.$cfr$intArgs$a$62abead39cee(-18, true, gf.field_s[var3_int]);
              var7 = -(var6 >> 1) + dg.field_ab;
              var4 = var4 + uc.field_Y;
              if (kg.a((byte) -121, var4, var6 + (ni.field_i << 1), var7 - ni.field_i, param1, param0, (ai.field_a << 1) + sl.field_f)) {
                stackIn_9_0 = var5;
                return stackIn_9_0;
              }
              var4 = var4 + (sl.field_f + (uc.field_Y + (ai.field_a << 1)));
            }
            var3_int++;
          }
          stackIn_15_0 = -1;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw oj.a((Throwable) ((Object) var3), "ha.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final da a(int param0) {
        int fieldTemp$1 = 0;
        int fieldTemp$0 = 0;
        int var3;
        da var4;
        da var5;
        da var6;
        da var9;
        var3 = TorChallenge.field_F ? 1 : 0;
        if (0 >= this.field_a) {
          do {
            if (this.field_a >= this.field_b) {
              if (param0 == -27377) {
                return null;
              }
              ha.a(-111, 26, -58);
              return null;
            }
            fieldTemp$1 = this.field_a;
            this.field_a = this.field_a + 1;
            var4 = this.field_e[fieldTemp$1].field_f;
            var5 = var4;
          } while (var4 == this.field_e[-1 + this.field_a]);
          this.field_c = var5.field_f;
          return var5;
        }
        if (this.field_e[this.field_a - 1] != this.field_c) {
          var9 = this.field_c;
          this.field_c = var9.field_f;
          return var9;
        }
        do {
          if (this.field_a >= this.field_b) {
            if (param0 == -27377) {
              return null;
            }
            ha.a(-111, 26, -58);
            return null;
          }
          fieldTemp$0 = this.field_a;
          this.field_a = this.field_a + 1;
          var4 = this.field_e[fieldTemp$0].field_f;
          var6 = var4;
        } while (var4 == this.field_e[-1 + this.field_a]);
        this.field_c = var6.field_f;
        return var6;
    }

    ha(int param0) {
        int var2 = 0;
        da dupTemp$1 = null;
        da var3;
        this.field_a = 0;
        this.field_b = param0;
        this.field_e = new da[param0];
        for (var2 = 0; param0 > var2; var2++) {
          dupTemp$1 = new da();
          var3 = dupTemp$1;
          this.field_e[var2] = dupTemp$1;
          var3.field_f = var3;
          var3.field_h = var3;
        }
    }

    final da a(byte param0) {
        if (param0 != -73) {
          return (da) null;
        }
        this.field_a = 0;
        return this.a(-27377);
    }

    final da a(byte param0, long param1) {
        da var5 = null;
        int var6 = TorChallenge.field_F ? 1 : 0;
        da var4 = this.field_e[(int)(param1 & (long)(-1 + this.field_b))];
        this.field_f = var4.field_f;
        while (var4 != this.field_f) {
          if (~param1 == ~this.field_f.field_d) {
            var5 = this.field_f;
            this.field_f = this.field_f.field_f;
            return var5;
          }
          this.field_f = this.field_f.field_f;
        }
        this.field_f = null;
        if (param0 < 88) {
          this.field_e = (da[]) null;
          return null;
        }
        return null;
    }

    final void a(int param0, da param1, long param2) {
        da var5 = null;
        try {
          if (param1.field_h != null) {
            param1.a(true);
          }
          var5 = this.field_e[(int)((long)(this.field_b - 1) & param2)];
          param1.field_h = var5.field_h;
          param1.field_f = var5;
          param1.field_h.field_f = param1;
          param1.field_f.field_h = param1;
          int var6 = 80 / ((-24 - param0) / 40);
          param1.field_d = param2;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "ha.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    static {
        field_d = 0;
    }
}
