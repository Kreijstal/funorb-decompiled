/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class md {
    static int field_b;
    static int field_f;
    static Random field_d;
    ne field_c;
    static String field_a;
    private ne field_e;

    static int b(int param0, int param1) {
        return param0 ^ param1;
    }

    final ne b(byte param0) {
        ne var2 = this.field_c.field_e;
        if (param0 != -124) {
          this.a(80);
          if (var2 != this.field_c) {
            var2.a(false);
            return var2;
          }
          return null;
        }
        if (var2 != this.field_c) {
          var2.a(false);
          return var2;
        }
        return null;
    }

    final void b(int param0) {
        ne var2;
        int var3;
        ne var4;
        var3 = DungeonAssault.field_K;
        while (true) {
          var2 = this.field_c.field_e;
          if (var2 != this.field_c) {
            var2.a(false);
            continue;
          }
          break;
        }
        if (param0 == -4) {
          this.field_e = null;
          return;
        }
        var4 = (ne) null;
        this.b((ne) null, false);
        this.field_e = null;
        return;
    }

    final ne g(int param0) {
        ne var2 = this.field_e;
        if (this.field_c == var2) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2.field_a;
        if (param0 == 20) {
          return var2;
        }
        ne var3 = (ne) null;
        this.a((ne) null, false);
        return var2;
    }

    final static void a(int param0, int param1) {
        mo.field_e = param1;
        if (nk.field_Jb.field_b < 0) {
          if (param0 != 20631) {
            field_b = 78;
            return;
          }
          return;
        }
        if (nl.a(nk.field_Jb.field_b, (byte) -124)) {
          if (param0 != 20631) {
            field_b = 78;
            return;
          }
          return;
        }
        nk.field_Jb.field_b = 1;
        if (param0 != 20631) {
          field_b = 78;
          return;
        }
    }

    final boolean a(byte param0) {
        if (param0 <= -55) {
          return this.field_c.field_e == this.field_c ? true : false;
        }
        this.field_c = (ne) null;
        return this.field_c.field_e == this.field_c ? true : false;
    }

    final static void a(float param0, float param1, float param2, float param3, float param4, int param5, float param6) {
        if (null == bf.field_h) {
          bf.field_h = new ge(wa.field_j);
          hm.field_n.a(bf.field_h);
        }
        bf.field_h.f(param4);
        bf.field_h.e(param1);
        bf.field_h.d(param6);
        bf.field_h.a(param3);
        bf.field_h.b(param0);
        bf.field_h.c(param2);
        if (param5 != 0) {
          field_b = 91;
          return;
        }
    }

    final static boolean f(int param0) {
        if (param0 != 20) {
          return false;
        }
        return null == cm.field_R ? rj.field_o : true;
    }

    public static void h(int param0) {
        field_a = null;
        field_d = null;
        if (param0 == -4) {
          return;
        }
        md.h(69);
    }

    final void a(ne param0, boolean param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0.field_a != null) {
            param0.a(param1);
          }
          param0.field_a = this.field_c.field_a;
          param0.field_e = this.field_c;
          param0.field_a.field_e = param0;
          param0.field_e.field_a = param0;
          if (!param1) {
            return;
          }
          field_d = (Random) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("md.H(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(')').toString());
        }
    }

    final ne a(int param0) {
        ne var2 = null;
        ne var2Lifetime1;
        if (param0 != 4) {
          cn var3 = (cn) null;
          md.a(-3, (cn) null);
          var2 = this.field_e;
          if (var2 == this.field_c) {
            this.field_e = null;
            return null;
          }
          this.field_e = var2.field_e;
          return var2;
        }
        var2Lifetime1 = this.field_e;
        if (var2Lifetime1 == this.field_c) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2Lifetime1.field_e;
        return var2Lifetime1;
    }

    final ne e(int param0) {
        ne var2 = null;
        ne var2Lifetime1;
        if (param0 != -24172) {
          field_d = (Random) null;
          var2 = this.field_c.field_e;
          if (var2 != this.field_c) {
            this.field_e = var2.field_e;
            return var2;
          }
          this.field_e = null;
          return null;
        }
        var2Lifetime1 = this.field_c.field_e;
        if (var2Lifetime1 != this.field_c) {
          this.field_e = var2Lifetime1.field_e;
          return var2Lifetime1;
        }
        this.field_e = null;
        return null;
    }

    final ne c(int param0) {
        ne var2 = this.field_c.field_a;
        if (param0 != 0) {
          this.field_c = (ne) null;
          if (this.field_c != var2) {
            var2.a(false);
            return var2;
          }
          return null;
        }
        if (this.field_c != var2) {
          var2.a(false);
          return var2;
        }
        return null;
    }

    final static void a(int param0, cn param1) {
        int var8 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        var9 = DungeonAssault.field_K;
        try {
          if ((3 & (param1.field_A | (param1.field_w | (param1.field_v | param1.field_y)))) == 0) {
            return;
          }
          var2_int = (3 & param1.field_w) + param1.field_y;
          var2_int = -(3 & var2_int) + 4 + var2_int;
          var3 = (param1.field_A & 3) + param1.field_v;
          var3 = var3 - ((3 & var3) - 4);
          var4 = new int[var3 * var2_int];
          var5 = 0;
          var6 = (3 & param1.field_w) + var2_int * (param1.field_A & 3);
          var7 = 0;
          if (param0 <= 42) {
            field_f = -7;
          }
          while (param1.field_v > var7) {
            for (var8 = 0; param1.field_y > var8; var8++) {
              incrementValue$0 = var6;
              var6++;
              incrementValue$1 = var5;
              var5++;
              var4[incrementValue$0] = param1.field_B[incrementValue$1];
            }
            var6 = var6 + (var2_int - param1.field_y);
            var7++;
          }
          param1.field_y = var2_int;
          param1.field_w = param1.field_w & -4;
          param1.field_v = var3;
          param1.field_A = param1.field_A & -4;
          param1.field_B = var4;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("md.O(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw vk.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final void b(ne param0, boolean param1) {
        try {
          if (null != param0.field_a) {
            param0.a(false);
          }
          if (param1) {
            field_a = (String) null;
          }
          param0.field_a = this.field_c;
          param0.field_e = this.field_c.field_e;
          param0.field_a.field_e = param0;
          param0.field_e.field_a = param0;
        } catch (RuntimeException runtimeException) {
          throw vk.a((Throwable) ((Object) runtimeException), "md.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final ne d(int param0) {
        ne var2 = null;
        ne var2Lifetime1;
        if (param0 != -14205) {
          field_a = (String) null;
          var2 = this.field_c.field_a;
          if (var2 == this.field_c) {
            this.field_e = null;
            return null;
          }
          this.field_e = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_c.field_a;
        if (var2Lifetime1 == this.field_c) {
          this.field_e = null;
          return null;
        }
        this.field_e = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    public md() {
        this.field_c = new ne();
        this.field_c.field_e = this.field_c;
        this.field_c.field_a = this.field_c;
    }

    static {
        field_b = 20;
        field_a = "FULL ACCESS";
        field_d = new Random(6L);
    }
}
