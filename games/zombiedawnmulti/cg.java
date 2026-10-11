/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cg extends br {
    static th field_i;
    static java.awt.Frame field_m;
    static cj field_f;
    private th field_k;
    private int field_g;
    static ul field_n;
    static String field_j;
    private int field_h;
    static boolean field_l;

    final void a(int param0) {
        if (param0 != -1) {
          field_f = (cj) null;
        }
        this.a(true);
    }

    final void b(boolean param0) {
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        rq var4 = (rq) (this.field_k.c(125));
        while (var4 != null) {
          var4.a((byte) 95);
          var4 = (rq) (this.field_k.b(6));
        }
        if (param0) {
          cg.a(80, -116, 26L);
        }
    }

    final boolean a(byte param0, int param1, int param2) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 < 54) {
          return true;
        }
        rq var6 = (rq) (this.field_k.c(87));
        while (var6 != null) {
          if (var6.a(param1, (byte) 5, param2)) {
            return true;
          }
          var6 = (rq) (this.field_k.b(6));
        }
        return false;
    }

    final static void a(int param0, int param1, long param2) {
        ga var4 = ma.field_a;
        var4.b((byte) -35, param0);
        if (param1 != -27404) {
          cg.a(-60, -93, 81L);
        }
        var4.field_j = var4.field_j + 1;
        int var5 = var4.field_j;
        var4.a(-59, 7);
        var4.a(param2, true);
        var4.e(29, -var5 + var4.field_j);
    }

    cg(int param0, int param1, int param2) {
        this.field_h = param1;
        this.field_g = param2;
        if (oq.field_u != null) {
          this.a((byte) 108);
        }
    }

    public static void c(byte param0) {
        if (param0 > -33) {
          cg.c((byte) -103);
        }
        field_m = null;
        field_j = null;
        field_f = null;
        field_n = null;
        field_i = null;
    }

    final void a(nm param0, int param1) {
        int var3_int = 0;
        rq var4 = null;
        int var5 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        var5 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = 81 / ((param1 + 32) / 51);
          var4 = (rq) (this.field_k.c(123));
          while (var4 != null) {
            var4.a(param0, (byte) -75);
            var4 = (rq) (this.field_k.b(6));
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("cg.A(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    final boolean a(gm param0, boolean param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        rq var5 = null;
        int var6 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          var3_int = param0.g(73);
          if (param1) {
            field_l = true;
          }
          var4 = param0.h(81);
          var5 = (rq) (this.field_k.c(80));
          while (true) {
            if (var5 == null) {
              return false;
            }
            if (!var5.a(var4, (byte) 111, var3_int)) {
              var5 = (rq) (this.field_k.b(6));
              continue;
            }
            break;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("cg.D(");
          if (param0 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param1).append(')').toString());
        }
    }

    final void a(byte param0) {
        int var2;
        int var3;
        boolean[][] var4;
        int var5;
        boolean[][] var6;
        int var7;
        int var8;
        int var9;
        int var10;
        boolean[][] var10_ref_boolean____;
        int var11;
        int var12;
        int var13;
        int var14;
        boolean[][] var15;
        int var16;
        boolean[][] var17;
        boolean[][] var18;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        var14 = ZombieDawnMulti.field_E ? 1 : 0;
        if (this.field_k != null) {
          return;
        }
        var2 = this.field_h / 24;
        var3 = this.field_g / 24;
        var5 = 109 / ((param0 - 55) / 47);
        var18 = new boolean[1 + 2 * wn.field_t][1 + 2 * wn.field_t];
        var17 = var18;
        var15 = var17;
        var4 = var15;
        var6 = new boolean[var18.length][var18[0].length];
        var7 = -wn.field_t + var2;
        var8 = var3 - wn.field_t;
        var15[wn.field_t][wn.field_t] = true;
        for (var9 = 0; var9 < wn.field_t; var9++) {
          for (var10 = 0; var10 < var4.length; var10++) {
            for (var11 = 0; var11 < var4[0].length; var11++) {
              var12 = var11 + var7;
              var13 = var8 + var10;
              if (var12 > 0 &&
                var13 > 0 &&
                oq.field_u[0].length > var12 &&
                oq.field_u.length > var13 &&
                (oq.field_u[var13][var12] & 1) != 0 && (var4[var10][var11] ||
                (0 < var11 &&
                var4[var10][-1 + var11] ||
                var10 > 0 &&
                var4[-1 + var10][var11] ||
                var11 < -1 + var4[0].length &&
                var4[var10][var11 + 1]) ||
                var10 < var4.length - 1 &&
                var4[var10 + 1][var11])) {
                var6[var10][var11] = true;
              }
            }
          }
          var10_ref_boolean____ = var4;
          var4 = var6;
          var6 = var10_ref_boolean____;
        }
        this.field_k = new th();
        for (var9Lifetime1 = 0; var9Lifetime1 < var4.length; var9Lifetime1++) {
          var16 = 0;
          var10Lifetime1 = var16;
          while (var4[0].length > var16) {
            var11Lifetime1 = var7 + var16;
            var12Lifetime1 = var9Lifetime1 + var8;
            var13Lifetime1 = (var3 - var12Lifetime1) * (var3 - var12Lifetime1) + (var2 - var11Lifetime1) * (var2 - var11Lifetime1);
            if (var13Lifetime1 < 81 &&
              var4[var9Lifetime1][var16]) {
              this.field_k.a(new rq(var11Lifetime1, var12Lifetime1, var13Lifetime1), false);
            }
            var16++;
          }
        }
        return;
    }

    static {
        field_j = "Rating";
    }
}
