/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bf extends br {
    static tq field_n;
    static ja field_f;
    private th field_p;
    private int[][] field_k;
    static boolean field_m;
    static String field_j;
    int field_l;
    static String field_q;
    int field_i;
    int field_o;
    static cj field_h;
    static int field_g;

    final boolean a(lm param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        ui var5 = null;
        int var6 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (param1 != 0) {
            this.c(-49);
          }
          var3_int = param0.e((byte) -112);
          var4 = param0.g(param1 ^ 1829947600);
          var5 = (ui) (this.field_p.c(69));
          while (var5 != null) {
            if (var5.a(param1 + 40, var3_int, var4)) {
              return true;
            }
            var5 = (ui) (this.field_p.b(6));
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("bf.G(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(ka param0, int param1) {
        int var2_int = 0;
        ka var3 = null;
        int var4 = 0;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var2 = null;
        int var2_intLifetime1;
        var4 = ZombieDawnMulti.field_E ? 1 : 0;
        try {
          if (null == param0.field_d) {
            return;
          }
          if (param0.field_i != 0 ||
            param0.field_o != 0) {
            for (var2_int = 0; uf.field_g > var2_int; var2_int++) {
              var3 = uk.field_M[var2_int];
              if (var3.field_l == 2 &&
                var3.field_i == param0.field_i &&
                param0.field_o == var3.field_o) {
                return;
              }
            }
          }
          if (param0.field_r != null) {
            ld.field_Kb = param0.field_a;
            bq.field_f = param0.field_e;
            tb.field_t = param0.field_r;
            en.field_c = param0.field_l;
          }
          var2_intLifetime1 = 98 % ((param1 + 13) / 35);
          vk.a(param0, (byte) 83);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_21_0 = var2;
          stackIn_21_1 = new StringBuilder().append("bf.C(");
          if (param0 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void d(int param0) {
        field_f = null;
        if (param0 != 29919) {
          return;
        }
        field_n = null;
        field_j = null;
        field_h = null;
        field_q = null;
    }

    final boolean a(int param0, int param1, byte param2) {
        int var5 = ZombieDawnMulti.field_E ? 1 : 0;
        ui var7 = (ui) (this.field_p.c(param2 ^ 100));
        while (var7 != null) {
          if (var7.a(param2 - 146, param0, param1)) {
            return true;
          }
          var7 = (ui) (this.field_p.b(6));
        }
        if (param2 == 29) {
          return false;
        }
        String var6 = (String) null;
        bf.a(false, -90, (String) null);
        return false;
    }

    final void c(int param0) {
        ui var4 = null;
        int var3 = ZombieDawnMulti.field_E ? 1 : 0;
        if (param0 == 0) {
          var4 = (ui) (this.field_p.c(43));
          while (var4 != null) {
            var4.c(9307);
            var4 = (ui) (this.field_p.b(6));
          }
          return;
        }
    }

    final void a(int param0) {
        int var2 = -43 / ((param0 + 32) / 47);
        this.a(true);
    }

    final static void a(boolean param0, int param1, String param2) {
        int var3_int = 0;
        try {
          nj.field_f = false;
          ud.field_ab = false;
          if (!param0) {
            field_j = (String) null;
          }
          if (null != h.field_L &&
            h.field_L.field_R) {
            var3_int = 1;
            if (param1 == 8) {
              if (!ch.field_e) {
                param2 = f.field_b;
              } else {
                param2 = ql.field_f;
              }
              param1 = 2;
              b.field_c.a(-120, fa.field_Ib);
            }
            if (param1 == 10) {
              var3_int = 0;
              ua.i(-2);
            }
            if (var3_int != 0) {
              if (ud.field_ab) {
                param2 = vl.a(cj.field_Eb, new String[]{param2}, 2);
              }
              if (bl.field_h) {
                param2 = wg.field_c;
              }
              h.field_L.a(param2, 125, param1);
            }
            if (256 != param1) {
              if (param1 == 10) {
                return;
              }
              if (!ch.field_e) {
                b.field_c.g((byte) 106);
                return;
              }
            }
          }
        } catch (RuntimeException runtimeException) {
          throw fa.a((Throwable) ((Object) runtimeException), "bf.A(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    bf(fh param0, int param1, int param2, int param3) {
        RuntimeException stackIn_55_0 = null;
        StringBuilder stackIn_55_1 = null;
        String stackIn_56_2 = null;
        RuntimeException decompiledCaughtException = null;
        boolean[][] var5 = null;
        RuntimeException var5_ref = null;
        boolean[][] var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        boolean[][] var10_ref_boolean____ = null;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        boolean[][] var15 = null;
        int var16 = 0;
        boolean[][] var17 = null;
        boolean[][] var18 = null;
        int var9Lifetime1;
        int var10Lifetime1;
        int var11Lifetime1;
        int var12Lifetime1;
        int var13Lifetime1;
        try {
          this.field_k = param0.field_i.field_k;
          this.field_l = param3;
          this.field_i = param2;
          this.field_o = param1;
          param3 = param3 / 24;
          param2 = param2 / 24;
          var18 = new boolean[oi.field_i * 2 + 1][1 + 2 * oi.field_i];
          var17 = var18;
          var15 = var17;
          var5 = var15;
          var6 = new boolean[var18.length][var18[0].length];
          var7 = param2 - oi.field_i;
          var8 = param3 - oi.field_i;
          var15[oi.field_i][oi.field_i] = true;
          for (var9 = 0; oi.field_i > var9; var9++) {
            for (var10 = 0; var5.length > var10; var10++) {
              for (var11 = 0; var5[0].length > var11; var11++) {
                var12 = var11 + var7;
                var13 = var10 + var8;
                if (var12 > 0 &&
                  var13 > 0 &&
                  var12 < this.field_k[0].length &&
                  this.field_k.length > var13 &&
                  (this.field_k[var13][var12] & 1) != 0 && (var5[var10][var11] ||
                  (var11 > 0 &&
                  var5[var10][var11 - 1] ||
                  var10 > 0 &&
                  var5[var10 - 1][var11] ||
                  var11 < var5[0].length - 1 &&
                  var5[var10][var11 + 1]) ||
                  var10 < -1 + var5.length &&
                  var5[1 + var10][var11])) {
                  var6[var10][var11] = true;
                }
              }
            }
            var10_ref_boolean____ = var5;
            var5 = var6;
            var6 = var10_ref_boolean____;
          }
          this.field_p = new th();
          for (var9Lifetime1 = 0; var5.length > var9Lifetime1; var9Lifetime1++) {
            var16 = 0;
            var10Lifetime1 = var16;
            while (var5[0].length > var16) {
              var11Lifetime1 = var7 + var16;
              var12Lifetime1 = var9Lifetime1 + var8;
              var13Lifetime1 = (param3 - var12Lifetime1) * (-var12Lifetime1 + param3) + (param2 - var11Lifetime1) * (param2 - var11Lifetime1);
              if (64 > var13Lifetime1 &&
                var5[var9Lifetime1][var16]) {
                this.field_p.a(new ui(var11Lifetime1, var12Lifetime1, var13Lifetime1), false);
              }
              var16++;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_55_0 = var5_ref;
          stackIn_55_1 = new StringBuilder().append("bf.<init>(");
          if (param0 == null) {
            stackIn_56_2 = "null";
          } else {
            stackIn_56_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_55_0), ((StringBuilder) (Object) stackIn_55_1).append(stackIn_56_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_m = false;
        field_j = "Full";
        field_q = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
    }
}
