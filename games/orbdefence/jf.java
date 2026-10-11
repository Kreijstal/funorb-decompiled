/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jf extends s {
    private ga field_I;
    static int field_H;
    private int field_G;

    final void a(byte param0, pj param1, int param2, int param3) {
        try {
          this.field_G = this.field_G + 1;
          super.a(param0, param1, param2, param3);
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jf.A(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    final void a(int param0, int param1, int param2, int param3) {
        int var5;
        int var6;
        qd var8;
        int var9;
        int var10;
        int var11;
        hj var12;
        hj var13;
        hj var14;
        var11 = OrbDefence.field_D ? 1 : 0;
        super.a(param0, param1, param2, param3);
        if (0 != param1) {
          return;
        }
        var5 = param3 - (-this.field_s - (this.field_m >> 1));
        var6 = (this.field_r >> 1) + (this.field_n + param0);
        var8 = this.field_I.d(param2 ^ -1040730);
        if (ml.field_a != var8 &&
          var8 != uj.field_b) {
          if (vh.field_h == var8) {
            var13 = wd.field_C[2];
            var13.e(-(var13.field_o >> 1) + var5, var6 - (var13.field_k >> 1), 256);
          } else if (nc.field_bb == var8) {
            var14 = wd.field_C[1];
            var14.e(-(var14.field_o >> 1) + var5, -(var14.field_k >> 1) + var6, 256);
          }
        } else {
          var12 = wd.field_C[0];
          var9 = var12.field_s << 1;
          var10 = var12.field_t << 1;
          if (null != lj.field_N &&
            var9 <= lj.field_N.field_o &&
            lj.field_N.field_k >= var10) {
            de.a(-128, lj.field_N);
            ul.d();
          } else {
            lj.field_N = new hj(var9, var10);
            de.a(param2 ^ -1048454, lj.field_N);
          }
          var12.b(112, 144, var12.field_s << 4, var12.field_t << 4, -this.field_G << 10, 4096);
          oc.g((byte) -105);
          lj.field_N.e(-var12.field_s + var5, var6 - var12.field_t, 256);
        }
    }

    final boolean a(int param0, pj param1) {
        RuntimeException var3 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 == -81) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("jf.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    jf(ga param0) {
        try {
          this.field_I = param0;
        } catch (RuntimeException runtimeException) {
          throw dd.a((Throwable) ((Object) runtimeException), "jf.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    final static boolean j(int param0) {
        if (param0 != 989270945) {
          hj var2 = (hj) null;
          jf.a((byte) 68, 27, (hj) null, 15, -89, 88);
        }
        return mb.field_c;
    }

    final String g(int param0) {
        if (param0 != -8235) {
          return (String) null;
        }
        if (this.field_t) {
          return this.field_I.a(126);
        }
        return null;
    }

    final static void a(byte param0, int param1, hj param2, int param3, int param4, int param5) {
        int incrementValue$0 = 0;
        RuntimeException stackIn_33_0 = null;
        StringBuilder stackIn_33_1 = null;
        String stackIn_34_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var6_int = 0;
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var14Lifetime1;
        int var14Lifetime2;
        int var14Lifetime3;
        var20 = OrbDefence.field_D ? 1 : 0;
        try {
          var6_int = (-param3 + param1 << 8) / param2.field_s;
          param4 = param4 + param2.field_u;
          param5 = param5 + param2.field_p;
          var7 = (param3 << 8) + param2.field_p * var6_int;
          var8 = param5 + ul.field_f * param4;
          var9 = 0;
          var10 = param2.field_k;
          var11 = param2.field_o;
          var12 = -var11 + ul.field_f;
          if (param4 < ul.field_d) {
            var14 = ul.field_d - param4;
            var9 = var9 + var14 * var11;
            var10 = var10 - var14;
            param4 = ul.field_d;
            var8 = var8 + var14 * ul.field_f;
          }
          var13 = 0;
          if (ul.field_i > param5) {
            var14Lifetime1 = ul.field_i - param5;
            var12 = var12 + var14Lifetime1;
            var8 = var8 + var14Lifetime1;
            param5 = ul.field_i;
            var13 = var13 + var14Lifetime1;
            var11 = var11 - var14Lifetime1;
            var7 = var7 + var14Lifetime1 * var6_int;
            var9 = var9 + var14Lifetime1;
          }
          if (ul.field_a < var10 + param4) {
            var10 = var10 - (-ul.field_a + (var10 + param4));
          }
          if (var11 + param5 > ul.field_e) {
            var14Lifetime2 = -ul.field_e + (var11 + param5);
            var11 = var11 - var14Lifetime2;
            var13 = var13 + var14Lifetime2;
            var12 = var12 + var14Lifetime2;
          }
          if (var11 > 0 &&
            var10 > 0) {
            for (param4 = -var10; param4 < 0; param4++) {
              var14Lifetime3 = var7;
              for (param5 = -var11; param5 < 0; param5++) {
                var15 = var14Lifetime3 >> 8;
                var16 = 256 - var15;
                var14Lifetime3 = var14Lifetime3 + var6_int;
                if (var15 >= 0) {
                  incrementValue$0 = var9;
                  var9++;
                  var17 = param2.field_v[incrementValue$0];
                  if (0 != var17) {
                    if (var15 <= 255) {
                      var18 = ul.field_b[var8];
                      var19 = 16711935 & var15 * (var17 & 16711935) + var16 * (16711935 & var18) >> 8;
                      ul.field_b[var8] = var19 + (vi.a(16711715, vi.a(var17, 65280) * var15 + vi.a(var18, 65280) * var16) >> 8);
                    } else {
                      ul.field_b[var8] = var17;
                    }
                  }
                  var8++;
                } else {
                  var9++;
                  var8++;
                }
              }
              var8 = var8 + var12;
              var9 = var9 + var13;
            }
            if (param0 != -20) {
              field_H = -96;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_33_0 = var6;
          stackIn_33_1 = new StringBuilder().append("jf.KA(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_34_2 = "null";
          } else {
            stackIn_34_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_33_0), ((StringBuilder) (Object) stackIn_33_1).append(stackIn_34_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_H = 10;
    }
}
