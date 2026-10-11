/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class fd implements Iterable {
    static lj field_c;
    static long field_e;
    da[] field_a;
    static int field_f;
    static int field_g;
    private da field_b;
    static ka field_h;
    int field_d;

    final void a(byte param0, da param1, long param2) {
        if (null != param1.field_h) {
          param1.a(true);
        }
        da var5 = this.field_a[(int)((long)(this.field_d - 1) & param2)];
        if (param0 < 2) {
          return;
        }
        try {
          param1.field_f = var5;
          param1.field_h = var5.field_h;
          param1.field_h.field_f = param1;
          param1.field_d = param2;
          param1.field_f.field_h = param1;
        } catch (RuntimeException runtimeException) {
          throw oj.a((Throwable) ((Object) runtimeException), "fd.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    public static void b(int param0) {
        field_c = null;
        if (param0 != 0) {
          return;
        }
        field_h = null;
    }

    final static void a(byte param0, ka param1) {
        int var7 = 0;
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var9 = 0;
        var9 = TorChallenge.field_F ? 1 : 0;
        try {
          if ((3 & (param1.field_x | param1.field_u | param1.field_s | param1.field_p)) == 0) {
            return;
          }
          var2_int = (3 & param1.field_s) + param1.field_u;
          var2_int = 4 - ((var2_int & 3) - var2_int);
          var3 = param1.field_x + (param1.field_p & 3);
          var3 = 4 - (var3 & 3) + var3;
          var4 = new int[var2_int * var3];
          var5 = 0;
          if (param0 != -44) {
            field_h = (ka) null;
          }
          var6 = (3 & param1.field_p) * var2_int + (param1.field_s & 3);
          for (var7 = 0; param1.field_x > var7; var7++) {
            for (var8 = 0; param1.field_u > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_y[incrementValue$1];
            }
            var6 = var6 + (var2_int - param1.field_u);
          }
          param1.field_x = var3;
          param1.field_u = var2_int;
          param1.field_p = param1.field_p & -4;
          param1.field_y = var4;
          param1.field_s = param1.field_s & -4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("fd.G(").append(param0).append(',');
          if (param1 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(')').toString());
        }
    }

    final static void a(int param0) {
        bg.field_K.c(0, new ih());
        if (param0 != -2068) {
          field_h = (ka) null;
        }
    }

    final static boolean a(qk param0, int param1, qk param2) {
        int var3_int = 0;
        int var4 = 0;
        ka var5 = null;
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var4 = TorChallenge.field_F ? 1 : 0;
        try {
          if (param1 <= 49) {
            var5 = (ka) null;
            fd.a((byte) -65, (ka) null);
          }
          var3_int = param0.field_ob - param2.field_ob;
          if (param0.field_mb == me.field_d) {
            var3_int -= 200;
          } else {
            if (null == param0.field_mb) {
              var3_int += 200;
            }
          }
          if (me.field_d != param2.field_mb) {
            if (null == param2.field_mb) {
              var3_int -= 200;
            }
          } else {
            var3_int += 200;
          }
          return !(var3_int <= 0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_19_0 = var3;
          stackIn_19_1 = new StringBuilder().append("fd.A(");
          if (param0 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw oj.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    final da a(int param0, long param1) {
        da var4;
        da var5;
        int var6;
        qk var7;
        da var5Lifetime1;
        var6 = TorChallenge.field_F ? 1 : 0;
        var4 = this.field_a[(int)(param1 & (long)(-1 + this.field_d))];
        if (param0 > 72) {
          this.field_b = var4.field_f;
          while (true) {
            if (this.field_b == var4) {
              this.field_b = null;
              return null;
            }
            if (param1 != this.field_b.field_d) {
              this.field_b = this.field_b.field_f;
              continue;
            }
            break;
          }
          var5 = this.field_b;
          this.field_b = this.field_b.field_f;
          return var5;
        }
        var7 = (qk) null;
        fd.a((qk) null, -124, (qk) null);
        this.field_b = var4.field_f;
        while (true) {
          if (this.field_b == var4) {
            this.field_b = null;
            return null;
          }
          if (param1 != this.field_b.field_d) {
            this.field_b = this.field_b.field_f;
            continue;
          }
          break;
        }
        var5Lifetime1 = this.field_b;
        this.field_b = this.field_b.field_f;
        return var5Lifetime1;
    }

    public final Iterator iterator() {
        return (Iterator) ((Object) new md(this));
    }

    final static void a(byte param0) {
        fe var1 = cj.field_h[9];
        int var2 = ab.field_g[9];
        var1.field_l = var1.field_k.length;
        if (param0 == -86) {
          pg.field_p = nc.a(var1, 100, var2);
          pg.field_p.e(-1);
          pg.field_p.e(0, var1.field_k.length);
          ok.field_a = we.a(pg.field_p, 6222);
          return;
        }
    }

    private fd() throws Throwable {
        throw new Error();
    }

    static {
        field_g = 9;
    }
}
