/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jr {
    int field_g;
    int field_b;
    boolean field_a;
    static String field_e;
    static int[][] field_h;
    private int field_d;
    int field_c;
    int field_i;
    static vg field_f;

    final static int a(boolean param0) {
        if (param0) {
          field_e = (String) null;
          return cg.field_j;
        }
        return cg.field_j;
    }

    final static String a(int param0) {
        if (param0 != -1) {
          return (String) null;
        }
        if (du.field_d == oh.field_L) {
          return qk.field_b;
        }
        return ah.field_d;
    }

    public static void b(int param0) {
        field_e = null;
        if (param0 > 52) {
          field_f = null;
          field_h = (int[][]) null;
          return;
        }
        jr.b(125);
        field_f = null;
        field_h = (int[][]) null;
    }

    final void a(int param0, int param1, boolean param2, int param3) {
        int var6;
        var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (param2) {
          jr.a(false);
        }
        if (!this.field_a) {
          if (param0 > 0) {
            if (this.b(112, sm.field_d, param1, param3, ko.field_b)) {
              hr.field_d[this.field_c].g(this.field_b + param3 - 25, param1 + (this.field_g - 25));
              hr.field_d[0].f(param3 + (this.field_b - 25), -25 + this.field_g + param1, 256);
              if (var6 != 0) {
                hr.field_d[this.field_c].g(this.field_b + param3 - 25, param1 + (this.field_g - 25));
                hr.field_d[this.field_c].g(param3 - (-this.field_b + 25), -25 + (this.field_g + param1), 128);
              }
            } else {
              hr.field_d[this.field_c].g(this.field_b + param3 - 25, param1 + (this.field_g - 25));
              if (var6 != 0) {
                hr.field_d[this.field_c].g(param3 - (-this.field_b + 25), -25 + (this.field_g + param1), 128);
              }
            }
          } else {
            hr.field_d[this.field_c].g(param3 - (-this.field_b + 25), -25 + (this.field_g + param1), 128);
          }
          fe.a(this.field_b + param3, param1 + this.field_g, this.field_c, param0, fe.field_b);
          if (var6 == 0) {
            return;
          }
        }
        if (0 < param0) {
          if (this.b(31, sm.field_d, param1, param3, ko.field_b)) {
            lw.field_ob.b(param3 - (-this.field_b + 20), -20 + (this.field_g + param1), bo.field_g[this.field_c]);
            if (var6 == 0) {
              if (this.field_i != 81) {
                pl.field_x[this.field_i].g(this.field_b + param3 - 20, this.field_g + param1 - 20);
                km.field_h[0].g(-23 + (this.field_b + param3), -23 + param1 + this.field_g);
                return;
              }
              pl.field_x[4].g(-20 + this.field_b + param3, -20 + (param1 + this.field_g));
              km.field_h[0].g(-23 + (this.field_b + param3), -23 + param1 + this.field_g);
              return;
            }
          }
          lw.field_ob.d(-20 + this.field_b + param3, param1 + this.field_g - 20, bo.field_g[this.field_c]);
          if (this.field_i == 81) {
            pl.field_x[4].g(-20 + this.field_b + param3, -20 + (param1 + this.field_g));
            if (var6 != 0) {
              pl.field_x[this.field_i].g(this.field_b + param3 - 20, this.field_g + param1 - 20);
            }
          } else {
            pl.field_x[this.field_i].g(this.field_b + param3 - 20, this.field_g + param1 - 20);
          }
          km.field_h[0].g(-23 + (this.field_b + param3), -23 + param1 + this.field_g);
          if (var6 != 0) {
            lw.field_ob.d(this.field_b + (param3 - 20), -20 + param1 + this.field_g, fe.b(bo.field_g[this.field_c], 128));
            if (this.field_i != 81) {
              pl.field_x[this.field_i].g(-20 + this.field_b + param3, -20 + (param1 + this.field_g), 0);
            }
            pl.field_x[4].g(-20 + (param3 + this.field_b), param1 + this.field_g - 20, 0);
            km.field_h[0].g(-23 + param3 + this.field_b, -23 + (param1 + this.field_g), 10);
          }
          return;
        }
        lw.field_ob.d(this.field_b + (param3 - 20), -20 + param1 + this.field_g, fe.b(bo.field_g[this.field_c], 128));
        if (this.field_i == 81) {
          pl.field_x[4].g(-20 + (param3 + this.field_b), param1 + this.field_g - 20, 0);
        } else {
          pl.field_x[this.field_i].g(-20 + this.field_b + param3, -20 + (param1 + this.field_g), 0);
          if (var6 != 0) {
            pl.field_x[4].g(-20 + (param3 + this.field_b), param1 + this.field_g - 20, 0);
          }
        }
        km.field_h[0].g(-23 + param3 + this.field_b, -23 + (param1 + this.field_g), 10);
    }

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var11 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          param0 = param0 | param0 << 8;
          var5_int = param0 ^ param0 >> 1;
          var8 = -74 % ((55 - param1) / 32);
          var9 = 0;
          while (var9 < 4) {
            var7 = (7 & param0) + param2 + (bm.field_y[var9][1] - 64);
            var6 = -54 + (param4 + (bm.field_y[var9][0] + (var5_int & 15)));
            var10 = (param0 + param3 / (4 + (param0 & 3))) % 3;
            param0 = param0 >> 1;
            var5_int = var5_int >> 1;
            jq.field_G[var10].h(60 + var6, 50 + var7);
            var9++;
            if (var11 != 0) {
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw ig.a((Throwable) ((Object) var5), "jr.A(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ')');
        }
    }

    jr(boolean param0, int param1, int param2, int param3) {
        this.field_d = param3;
        this.field_a = param0 ? true : false;
        this.field_c = param1;
        this.field_i = param2;
    }

    final boolean b(int param0, int param1, int param2, int param3, int param4) {
        int var7 = 0;
        int var6 = -param1 + param3 + this.field_b;
        int var7Lifetime1;
        if (param0 < 10) {
          field_e = (String) null;
          var7 = this.field_g + param2 - param4;
          if (this.field_d * this.field_d <= var7 * var7 + var6 * var6) {
            return false;
          }
          return true;
        }
        var7Lifetime1 = this.field_g + param2 - param4;
        if (this.field_d * this.field_d <= var7Lifetime1 * var7Lifetime1 + var6 * var6) {
          return false;
        }
        return true;
    }

    final static void a(int param0, je param1, int param2, byte[] param3, int param4, je param5, int param6, int param7, int param8, je param9) {
        RuntimeException stackIn_19_0 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        var12 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          uf.field_a = param7;
          t.field_b = param3;
          oh.field_H = -1L;
          tq.field_b = param3.length;
          no.field_K = null;
          ua.field_s = false;
          if (param8 >= -52) {
            field_h = (int[][]) null;
          }
          ln.field_d = new byte[(uf.field_a + 7) / 8];
          vu.field_M = null;
          var10_int = 0;
          var11 = 0;
          do {
            if (!(t.field_b.length > var11)) {
              var10_int = (7 + var10_int) / 8;
              tg.field_d = new byte[var10_int];
              break;
            }
            var10_int = var10_int + (t.field_b[var11] & 255);
            var11++;
          } while (var12 == 0);
          if (param9.field_fb == null) {
            param9.field_fb = new NodeDeque();
          }
          be.field_u = param9.field_fb;
          be.field_u.b(80);
          oi.field_d = new tp(param4);
          vj.field_a = 0;
          be.field_s = -1;
          oo.field_a = 0;
          GlobalSpell.field_g = -1;
          if (null == param1.field_fb) {
            param1.field_fb = new NodeDeque();
          }
          qc.field_g = param1.field_fb;
          qc.field_g.b(120);
          qm.field_J = new tp(param6);
          if (null == param5.field_fb) {
            param5.field_fb = new NodeDeque();
          }
          wl.field_F = param5.field_fb;
          wl.field_F.b(122);
          eu.field_e = new tp(param0);
          qd.field_K = param2;
          ph.field_d = 0L;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_19_0 = var10;
          stackIn_19_1 = new StringBuilder().append("jr.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          stackIn_22_1 = ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          stackIn_28_1 = ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_19_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    static {
        field_e = "<%0> has used <%1>";
        field_h = new int[][]{new int[]{303, 375, 440, 498, 560}, new int[]{288, 360, 425, 488, 560}, new int[]{303, 375, 440, 498, 560}, new int[]{283, 350, 417, 488, 560}};
        field_f = null;
    }
}
