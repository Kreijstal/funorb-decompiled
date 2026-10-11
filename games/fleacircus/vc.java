/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vc {
    lh field_e;
    static int field_d;
    static boolean field_b;
    static int field_f;
    private lh field_c;
    static int field_a;
    static String field_g;

    final lh c(byte param0) {
        lh var2 = this.field_e.field_h;
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_h;
        if (param0 == 47) {
          return var2;
        }
        field_b = true;
        return var2;
    }

    final lh a(byte param0) {
        int var2 = 3 / ((28 - param0) / 36);
        lh var3 = this.field_e.field_a;
        if (this.field_e != var3) {
          var3.c(-1);
          return var3;
        }
        return null;
    }

    final void b(boolean param0, lh param1) {
        try {
          if (param1.field_a != null) {
            param1.c(-1);
          }
          param1.field_a = this.field_e;
          param1.field_h = this.field_e.field_h;
          param1.field_a.field_h = param1;
          if (!param0) {
            lh var4 = (lh) null;
            this.a(true, (lh) null);
          }
          param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "vc.G(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final lh b(int param0) {
        lh var2 = this.field_e.field_a;
        if (this.field_e == var2) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_a;
        if (param0 <= -33) {
          return var2;
        }
        return (lh) null;
    }

    final lh b(byte param0) {
        lh var2 = this.field_c;
        if (param0 != -105) {
          field_g = (String) null;
          if (var2 == this.field_e) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.field_h;
          return var2;
        }
        if (var2 == this.field_e) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2.field_h;
        return var2;
    }

    final static void a(byte param0, rh param1) {
        int var5 = 0;
        int var3 = 0;
        int var4 = 0;
        si var6 = null;
        int[] var7 = null;
        int var8 = 0;
        ih var9 = null;
        ih var10 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var4Lifetime1;
        var8 = fleas.field_A ? 1 : 0;
        try {
          var9 = new ih(param1.a(0, "", "logo.fo3d"));
          var10 = var9;
          var3 = var10.e(false);
          var10.k(8);
          fc.field_a = fleas.a(var10, -6383);
          ij.field_F = new si[var3];
          gm.field_kb = new int[var3][];
          for (var4 = 0; var3 > var4; var4++) {
            ij.field_F[var4] = d.a(-124, var9);
          }
          var10.m(8);
          var4Lifetime1 = 17 % ((param0 - 75) / 44);
          for (var5 = 0; var3 > var5; var5++) {
            var6 = ij.field_F[var5];
            var6.a(6, 1, 6, 6, 0);
            var6.b(-23443);
            var7 = new int[]{var6.field_m + var6.field_B >> 1, var6.field_e + var6.field_k >> 1, var6.field_A + var6.field_b >> 1};
            gm.field_kb[var5] = var7;
            var6.a(-var7[1], -var7[0], -var7[2], (byte) -82);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_10_0 = var2;
          stackIn_10_1 = new StringBuilder().append("vc.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw pf.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    final lh c(int param0) {
        lh var2 = null;
        lh var2Lifetime1;
        if (param0 <= 3) {
          field_d = -51;
          var2 = this.field_c;
          if (var2 == this.field_e) {
            this.field_c = null;
            return null;
          }
          this.field_c = var2.field_a;
          return var2;
        }
        var2Lifetime1 = this.field_c;
        if (var2Lifetime1 == this.field_e) {
          this.field_c = null;
          return null;
        }
        this.field_c = var2Lifetime1.field_a;
        return var2Lifetime1;
    }

    final void a(boolean param0, lh param1) {
        try {
          if (null != param1.field_a) {
            param1.c(-1);
          }
          if (param0) {
            field_b = false;
          }
          param1.field_h = this.field_e;
          param1.field_a = this.field_e.field_a;
          param1.field_a.field_h = param1;
          param1.field_h.field_a = param1;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "vc.C(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_7_0 = 0;
        int stackIn_9_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var3_intLifetime1;
        var4 = fleas.field_A ? 1 : 0;
        try {
          if (param2 < param0) {
            var3_int = param2;
            param2 = param0;
            param0 = var3_int;
          }
          while (param0 != 0) {
            var3_intLifetime1 = param2 % param0;
            param2 = param0;
            param0 = var3_intLifetime1;
          }
          if (param1 == -1) {
            stackIn_9_0 = param2;
            return stackIn_9_0;
          }
          stackIn_7_0 = -66;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw pf.a((Throwable) ((Object) var3), "vc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
    }

    final lh e(int param0) {
        lh var2 = this.field_e.field_h;
        if (var2 == this.field_e) {
          return null;
        }
        if (param0 == -22033) {
          var2.c(-1);
          return var2;
        }
        return (lh) null;
    }

    final void f(int param0) {
        lh var2;
        int var3;
        var3 = fleas.field_A ? 1 : 0;
        while (true) {
          var2 = this.field_e.field_h;
          if (this.field_e != var2) {
            var2.c(-1);
            continue;
          }
          break;
        }
        if (param0 == 1) {
          this.field_c = null;
          return;
        }
        field_a = 42;
        this.field_c = null;
        return;
    }

    public vc() {
        this.field_e = new lh();
        this.field_e.field_h = this.field_e;
        this.field_e.field_a = this.field_e;
    }

    final boolean a(int param0) {
        if (param0 == -1092895903) {
          return this.field_e.field_h == this.field_e ? true : false;
        }
        this.b((byte) -25);
        return this.field_e.field_h == this.field_e ? true : false;
    }

    public static void d(int param0) {
        field_g = null;
        if (param0 == -29943) {
          return;
        }
        field_g = (String) null;
    }

    static {
        field_d = 0;
        field_g = "You can quickly switch between left slopes, right slopes and blocks by pressing the keys 1, 2 and 3 respectively";
    }
}
