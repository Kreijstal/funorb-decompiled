/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eca extends bi {
    private po field_k;

    final int b(int param0, int param1) {
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (param1 != 40) {
          this.field_k = (po) null;
        }
        var3 = param0;
        if (0 == var3) {
          return 140;
        }
        if (1 == var3) {
          return 225;
        }
        if (var3 == 2) {
          return 450;
        }
        if (var3 != 3) {
          throw new IllegalArgumentException();
        }
        return 600;
    }

    final int a(int param0, boolean param1) {
        int var3;
        int var4;
        var4 = BachelorFridge.field_y;
        if (!param1) {
          this.p(97);
        }
        var3 = param0;
        if (var3 == 0) {
          return 60;
        }
        if (var3 == 1) {
          return 145;
        }
        if (2 == var3) {
          return 260;
        }
        if (3 == var3) {
          return 475;
        }
        throw new IllegalArgumentException();
    }

    public eca() {
        super(5);
        this.field_k = (po) ((Object) jha.field_g);
    }

    final void b(boolean param0, int param1, int param2) {
        kv var12 = null;
        String var13 = null;
        int var5 = 0;
        pia var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        pia var7Lifetime1;
        int var5Lifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        if (param2 != 0) {
          this.field_k = (po) null;
          var12 = this.b(param1, (byte) 81);
          kv var11 = var12;
          var5 = this.d(param1, 26891) ? 1 : 0;
          var13 = this.d(false, pj.field_b[this.field_b][param1]);
          String var6 = var13;
          var7 = fn.field_n;
          var8 = var5 != 0 ? param0 ? 10 : 9 : 8;
          var9 = this.a(param1, true) + this.b(param1, 40) >> 1;
          var10 = this.a(param1, (byte) -74) + (this.a(param2 - 119, param1) >> 1);
          if (var5 == 0) {
            var12.b(var9 - (var12.field_n >> 1), var10 - 22, 128);
            ((po) ((Object) var7)).a(var13, var9, var10 + 6, var8, -1);
            return;
          }
          var12.e(-(var12.field_n >> 1) + var9, var10 - 22);
          ((po) ((Object) var7)).a(var13, var9, var10 + 6, var8, -1);
          return;
        }
        kv var14 = this.b(param1, (byte) 81);
        var5Lifetime1 = this.d(param1, 26891) ? 1 : 0;
        String var15 = this.d(false, pj.field_b[this.field_b][param1]);
        var7Lifetime1 = fn.field_n;
        var8Lifetime1 = var5Lifetime1 != 0 ? param0 ? 10 : 9 : 8;
        var9Lifetime1 = this.a(param1, true) + this.b(param1, 40) >> 1;
        var10Lifetime1 = this.a(param1, (byte) -74) + (this.a(param2 - 119, param1) >> 1);
        if (var5Lifetime1 == 0) {
          var14.b(var9Lifetime1 - (var14.field_n >> 1), var10Lifetime1 - 22, 128);
          ((po) ((Object) var7Lifetime1)).a(var15, var9Lifetime1, var10Lifetime1 + 6, var8Lifetime1, -1);
          return;
        }
        var14.e(-(var14.field_n >> 1) + var9Lifetime1, var10Lifetime1 - 22);
        ((po) ((Object) var7Lifetime1)).a(var15, var9Lifetime1, var10Lifetime1 + 6, var8Lifetime1, -1);
    }

    private final void a(int param0, int param1, int param2, String param3, byte param4) {
        int var6_int = 0;
        try {
          if (param4 <= 71) {
            this.q(-87);
          }
          var6_int = oja.field_a[param2] + oja.field_a[1 + param2] >> 1;
          this.field_k.a(param3, var6_int, param0, param1, -1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "eca.UA(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final String e(byte param0) {
        int var2;
        String[] var3;
        int[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var10;
        String var11;
        String stackIn_17_0 = null;
        String stackIn_23_0 = null;
        String stackIn_32_0 = null;
        String stackIn_52_0 = null;
        String stackIn_57_0 = null;
        String var28;
        int var7Lifetime1;
        int var7Lifetime2;
        int var7Lifetime3;
        int var8Lifetime1;
        int var7Lifetime4;
        var10 = BachelorFridge.field_y;
        var2 = 0;
        var3 = ri.field_b.field_k[ks.field_i];
        var4 = ri.field_b.field_g[ks.field_i];
        var5 = this.field_k.field_u + 108;
        this.a(0, od.field_z, param0 ^ 9);
        var6 = 0;
        this.a(1, hea.field_q, 0);
        if (param0 == 9) {
          this.a(2, aj.field_b, 0);
          this.a(3, ej.field_n, param0 - 9);
          this.a(4, es.field_h, 0);
          this.a(5, eg.field_q, 0);
          for (var7 = 0; var7 < 10; var7++) {
            if (null != var3[var7] &&
              !var3[var7].equals("")) {
              var8 = 16777215;
              var28 = var3[var7];
              if (wb.a((byte) 52, var28)) {
                var8 = 16760864;
                var6 = 1;
              }
              var2 = 1;
              this.a(var28, var5, var4[3 + 4 * var7], 22442, var4[var7 * 4], var4[var7 * 4 + 1], var4[2 + var7 * 4], var8, var7);
            }
            var5 += 23;
          }
          if (var6 == 0) {
            if (ri.field_b.field_f == 0 &&
              ri.field_b.field_h == 0 &&
              ri.field_b.field_l == 0) {
              if (var2 == 0) {
                stackIn_52_0 = gea.field_g;
              } else {
                stackIn_52_0 = "";
              }
              return stackIn_52_0;
            }
            var7Lifetime4 = 3518976;
            this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7Lifetime4, -1);
            var2 = 1;
          }
          if (var2 == 0) {
            stackIn_57_0 = gea.field_g;
          } else {
            stackIn_57_0 = "";
          }
          return stackIn_57_0;
        }
        this.field_k = (po) null;
        this.a(2, aj.field_b, 0);
        this.a(3, ej.field_n, param0 - 9);
        this.a(4, es.field_h, 0);
        this.a(5, eg.field_q, 0);
        for (var7Lifetime1 = 0; var7Lifetime1 < 10; var7Lifetime1++) {
          if (null != var3[var7Lifetime1] &&
            !var3[var7Lifetime1].equals("")) {
            var8Lifetime1 = 16777215;
            var11 = var3[var7Lifetime1];
            if (wb.a((byte) 52, var11)) {
              var8Lifetime1 = 16760864;
              var6 = 1;
            }
            var2 = 1;
            this.a(var11, var5, var4[3 + 4 * var7Lifetime1], 22442, var4[var7Lifetime1 * 4], var4[var7Lifetime1 * 4 + 1], var4[2 + var7Lifetime1 * 4], var8Lifetime1, var7Lifetime1);
          }
          var5 += 23;
        }
        if (var6 != 0) {
          if (var2 == 0) {
            stackIn_17_0 = gea.field_g;
          } else {
            stackIn_17_0 = "";
          }
          return stackIn_17_0;
        }
        if (ri.field_b.field_f != 0) {
          var7Lifetime2 = 3518976;
          this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7Lifetime2, -1);
          var2 = 1;
          if (var2 == 0) {
            stackIn_23_0 = gea.field_g;
          } else {
            stackIn_23_0 = "";
          }
          return stackIn_23_0;
        }
        if (ri.field_b.field_h != 0 ||
          ri.field_b.field_l != 0) {
          var7Lifetime3 = 3518976;
          this.a(cha.field_l, var5, ri.field_b.field_l, 22442, ri.field_b.field_j, ri.field_b.field_f, ri.field_b.field_h, var7Lifetime3, -1);
          var2 = 1;
        }
        if (var2 == 0) {
          stackIn_32_0 = gea.field_g;
        } else {
          stackIn_32_0 = "";
        }
        return stackIn_32_0;
    }

    private final void q(int param0) {
        String var5 = null;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String var9 = null;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        int var3Lifetime1;
        int var3Lifetime2;
        int var3Lifetime3;
        int var3Lifetime4;
        int var3Lifetime5;
        if (ri.field_b == null) {
          ri.field_b = au.a(7, 16757, 0, 10);
        }
        if (param0 != 1) {
          this.field_k = (po) null;
          if (!ri.field_b.field_p) {
            var5 = fo.field_b;
            var3 = 95 + this.field_k.field_u + 253;
            this.field_k.a(var5, 320, var3, 3518976, -1);
            return;
          }
          if (null != ri.field_b.field_k) {
            var6 = this.e((byte) 9);
            var3Lifetime4 = 95 + this.field_k.field_u + 253;
            this.field_k.a(var6, 320, var3Lifetime4, 3518976, -1);
            return;
          }
          var7 = qe.field_d;
          var3Lifetime5 = 95 + this.field_k.field_u + 253;
          this.field_k.a(var7, 320, var3Lifetime5, 3518976, -1);
          return;
        }
        if (!ri.field_b.field_p) {
          var8 = fo.field_b;
          var3Lifetime1 = 95 + this.field_k.field_u + 253;
          this.field_k.a(var8, 320, var3Lifetime1, 3518976, -1);
          return;
        }
        if (null != ri.field_b.field_k) {
          var9 = this.e((byte) 9);
          var3Lifetime2 = 95 + this.field_k.field_u + 253;
          this.field_k.a(var9, 320, var3Lifetime2, 3518976, -1);
          return;
        }
        String var10 = qe.field_d;
        var3Lifetime3 = 95 + this.field_k.field_u + 253;
        this.field_k.a(var10, 320, var3Lifetime3, 3518976, -1);
    }

    final void l(int param0) {
        this.i(-12988);
        j.a(wa.field_l, 40, 16760896, true, 320, false);
        dg.a(40, 60, 560, 335, 20, 0, 80);
        if (param0 != 9) {
          this.field_k = (po) null;
          if (bp.e(param0 - 29928)) {
            this.p(-118);
            this.c(true);
            return;
          }
          this.q(1);
          this.c(true);
          return;
        }
        if (bp.e(param0 - 29928)) {
          this.p(-118);
          this.c(true);
          return;
        }
        this.q(1);
        this.c(true);
    }

    final kv b(int param0, byte param1) {
        int var3;
        if (param1 < 62) {
          return (kv) null;
        }
        var3 = param0;
        if (var3 == 3) {
          return gj.field_F;
        }
        if (var3 != 2) {
          return ana.field_r;
        }
        return jt.field_g;
    }

    private final void a(String param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        String stackIn_11_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        String var11 = null;
        try {
          var10_int = param2 + param5 + param6;
          if (param3 != 22442) {
            this.field_k = (po) null;
          }
          if (param8 != -1) {
            this.field_k.b(param8 + 1 + ". ", 70, param1, param7, -1);
          }
          if (0 != var10_int) {
            param6 = (param6 * 200 + var10_int) / (2 * var10_int);
            param2 = (var10_int + 200 * param2) / (var10_int * 2);
            param5 = (param5 * 200 + var10_int) / (2 * var10_int);
          }
          this.field_k.c(param0, 80, param1, param7, -1);
          if (var10_int >= 50) {
            stackIn_11_0 = "50+";
          } else {
            stackIn_11_0 = Integer.toString(var10_int);
          }
          var11 = stackIn_11_0;
          this.a(param1, param7, 1, Integer.toString(param4), (byte) 119);
          this.a(param1, param7, 2, var11, (byte) 109);
          this.a(param1, param7, 3, param5 + "%", (byte) 81);
          this.a(param1, param7, 4, param2 + "%", (byte) 73);
          this.a(param1, param7, 5, param6 + "%", (byte) 121);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_15_0 = var10;
          stackIn_15_1 = new StringBuilder().append("eca.L(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(')').toString());
        }
    }

    private final void a(int param0, String param1, int param2) {
        int var4_int = 0;
        pia var5 = null;
        try {
          if (param2 != param0) {
            dg.b(oja.field_a[param0], 80, 276, 0, 64);
          }
          var4_int = oja.field_a[1 + param0] + oja.field_a[param0] >> 1;
          var5 = fn.field_n;
          ((po) ((Object) var5)).a(param1, var4_int, 100, 10, -1);
        } catch (RuntimeException runtimeException) {
          throw pe.a((Throwable) ((Object) runtimeException), "eca.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final int a(int param0, int param1) {
        int var3 = 114 % ((param0 + 64) / 38);
        return 40;
    }

    final int a(int param0, byte param1) {
        if (param1 >= -38) {
          return -97;
        }
        return 418;
    }

    final boolean c(int param0, int param1) {
        if (param1 != 19950) {
          return false;
        }
        if (bp.e(param1 ^ -14641)) {
          return param0 >= 2 ? true : false;
        }
        return param0 != 2 ? true : false;
    }

    private final void p(int param0) {
        this.field_k.a(d.field_E, 320, this.field_k.field_u + 353 + 11, 3518976, -1);
        if (param0 >= -113) {
          this.a((String) null, -62, 37, -6, 83, 78, 31, -18, -51);
        }
    }

    static {
    }
}
