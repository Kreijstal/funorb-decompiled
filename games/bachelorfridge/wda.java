/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wda {
    static long field_a;
    byte field_d;
    static int[][] field_c;
    static int[] field_b;
    int field_e;
    static String field_g;
    it field_f;

    final static void a(byte param0) {
        String[][] dupTemp$0 = null;
        int[][] dupTemp$1 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        ne var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6_int = 0;
        String[][] var6 = null;
        int[][] var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        pf var14 = null;
        int var6_intLifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        var12 = BachelorFridge.field_y;
        try {
          var14 = ig.field_m;
          var2 = var14.b(16711935);
          var3 = (ne) (rg.field_f.b((byte) 90));
          if (param0 < 98) {
            return;
          }
          while (var3 != null) {
            if (var2 != var3.field_o) {
              var3 = (ne) (rg.field_f.c(0));
              continue;
            }
            break;
          }
          if (var3 == null) {
            vc.a((byte) -113);
            return;
          }
          var4 = var14.b(16711935);
          if (var4 != 0) {
            vs.field_a[0] = cha.field_l;
            var5 = var3.field_i;
            for (var6_int = 1; var4 > var6_int; var6_int++) {
              vs.field_a[var6_int] = var14.g(80);
            }
            iw.a(var5, -10410, var4);
            for (var6_intLifetime1 = 0; var6_intLifetime1 < var4; var6_intLifetime1++) {
              ml.a(var14, 2064384);
              if (var6_intLifetime1 == 0) {
                var3.field_h = al.field_a;
                var3.field_f = gk.field_b;
                var3.field_l = fe.field_k;
                var3.field_j = kka.field_g;
                im.a(var6_intLifetime1, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
              } else {
                im.a(var6_intLifetime1, kka.field_g, al.field_a, false, fe.field_k, gk.field_b);
              }
            }
            it.a(8766, var5);
            dupTemp$0 = new String[2][var5];
            var3.field_k = dupTemp$0;
            var6 = dupTemp$0;
            dupTemp$1 = new int[2][var5 * 4];
            var3.field_g = dupTemp$1;
            var7 = dupTemp$1;
            var8 = ut.field_l;
            var9 = 0;
            var10 = 0;
            while (var8 > var9) {
              var11 = fn.field_k[var9];
              var6[0][var10] = vs.field_a[var11];
              var7[0][4 * var10] = gk.field_a[var11];
              var7[0][1 + var10 * 4] = mba.field_a[var11];
              var7[0][2 + var10 * 4] = sc.field_o[var11];
              var7[0][3 + var10 * 4] = uda.field_X[var11];
              if (wb.a((byte) 52, vs.field_a[var11]) &&
                0 == sc.field_o[var11] + mba.field_a[var11] + uda.field_X[var11]) {
                var6[0][var10] = null;
                var10--;
              }
              var9++;
              var10++;
            }
            var9Lifetime1 = 0;
            var13 = 0;
            var10Lifetime1 = var13;
            while (var9Lifetime1 < var8) {
              var11Lifetime1 = fn.field_k[var5 + var9Lifetime1];
              var6[1][var13] = vs.field_a[var11Lifetime1];
              var7[1][4 * var13] = gk.field_a[var11Lifetime1];
              var7[1][4 * var13 + 1] = mba.field_a[var11Lifetime1];
              var7[1][4 * var13 + 2] = sc.field_o[var11Lifetime1];
              var7[1][4 * var13 + 3] = uda.field_X[var11Lifetime1];
              if (wb.a((byte) 52, vs.field_a[var11Lifetime1]) &&
                sc.field_o[var11Lifetime1] + (mba.field_a[var11Lifetime1] + uda.field_X[var11Lifetime1]) == 0) {
                var6[1][var13] = null;
                var13--;
              }
              var9Lifetime1++;
              var13++;
            }
          }
          var3.field_p = true;
          var3.a(false);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var1), "wda.C(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 4) {
          return;
        }
        field_c = (int[][]) null;
        field_g = null;
        field_b = null;
    }

    final boolean a(boolean param0, it param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return false;
          }
          if (this.field_f != null &&
            this.field_f.field_a) {
            return false;
          }
          this.field_f = param1;
          this.field_f.a((byte) -83);
          if (!param0) {
            return true;
          }
          field_g = (String) null;
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_13_0 = var3;
          stackIn_13_1 = new StringBuilder().append("wda.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    wda(byte param0, int param1) {
        this.field_d = param0;
        this.field_e = param1;
    }

    wda(lu param0) {
        RuntimeException runtimeException = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          this.field_d = param0.b(true);
          this.field_e = param0.b(16711935);
          if (param0.b(true) != -1) {
            param0.field_g = param0.field_g - 1;
            this.field_f = new it(param0);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          runtimeException = decompiledCaughtException;
          stackIn_6_0 = runtimeException;
          stackIn_6_1 = new StringBuilder().append("wda.<init>(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw pe.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_g = "Wait...";
        field_b = new int[24];
    }
}
