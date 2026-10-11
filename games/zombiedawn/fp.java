/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fp extends an {
    int field_L;
    int field_J;
    int field_E;
    static int field_H;
    int field_I;
    int field_K;
    int field_G;

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, byte param7) {
        int var9 = ZombieDawn.field_J;
        if (param5 >= param4) {
          if (param1 <= param5) {
            if (param4 < param1) {
              wd.a(param0, param2, param6, param1, param5, param4, false, param3, bi.field_c);
              if (param7 <= 51) {
                fp.a(-83, false, -32, -105);
                return;
              }
              return;
            }
            wd.a(param0, param6, param2, param4, param5, param1, false, param3, bi.field_c);
            if (param7 <= 51) {
              fp.a(-83, false, -32, -105);
              return;
            }
            return;
          }
          wd.a(param6, param2, param0, param5, param1, param4, false, param3, bi.field_c);
          if (param7 <= 51) {
            fp.a(-83, false, -32, -105);
            return;
          }
          return;
        }
        if (param1 > param4) {
          wd.a(param6, param0, param2, param4, param1, param5, false, param3, bi.field_c);
          if (param7 <= 51) {
            fp.a(-83, false, -32, -105);
            return;
          }
          return;
        }
        if (param1 > param5) {
          wd.a(param2, param0, param6, param1, param4, param5, false, param3, bi.field_c);
          if (param7 <= 51) {
            fp.a(-83, false, -32, -105);
            return;
          }
          return;
        }
        wd.a(param2, param6, param0, param5, param4, param1, false, param3, bi.field_c);
        if (param7 <= 51) {
          fp.a(-83, false, -32, -105);
          return;
        }
    }

    final static boolean a(int param0, boolean param1, int param2, int param3) {
        int var4;
        int var5;
        int var4Lifetime1;
        int var4Lifetime2;
        int var5Lifetime1;
        int var5Lifetime2;
        int var4Lifetime3;
        int var5Lifetime3;
        if (!param1) {
          if (qp.field_b[param3] > qp.field_b[param0]) {
            return true;
          }
          if (qp.field_b[param0] > qp.field_b[param3]) {
            return false;
          }
          if (dj.field_g[param3] > dj.field_g[param0]) {
            return true;
          }
          if (dj.field_g[param3] < dj.field_g[param0]) {
            return false;
          }
          if (param2 == 0) {
            var4 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
            var5 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
            if (var5 > var4) {
              return true;
            }
            if (var5 < var4) {
              return false;
            }
            return !(param0 >= param3);
          }
          field_H = -122;
          var4Lifetime3 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
          var5Lifetime3 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
          if (var5Lifetime3 > var4Lifetime3) {
            return true;
          }
          if (var5Lifetime3 < var4Lifetime3) {
            return false;
          }
          return !(param0 >= param3);
        }
        if (dj.field_g[param0] < dj.field_g[param3]) {
          return true;
        }
        if (dj.field_g[param0] > dj.field_g[param3]) {
          return false;
        }
        if (qp.field_b[param3] > qp.field_b[param0]) {
          return true;
        }
        if (qp.field_b[param0] > qp.field_b[param3]) {
          return false;
        }
        if (param2 == 0) {
          var4Lifetime1 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
          var5Lifetime1 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
          if (var5Lifetime1 > var4Lifetime1) {
            return true;
          }
          if (var5Lifetime1 < var4Lifetime1) {
            return false;
          }
          return !(param0 >= param3);
        }
        field_H = -122;
        var4Lifetime2 = sg.field_kb[param0] + qo.field_r[param0] + jd.field_d[param0];
        var5Lifetime2 = sg.field_kb[param3] + qo.field_r[param3] + jd.field_d[param3];
        if (var5Lifetime2 > var4Lifetime2) {
          return true;
        }
        if (var5Lifetime2 < var4Lifetime2) {
          return false;
        }
        if (param0 >= param3) {
          return false;
        }
        return true;
    }

    final boolean a(int param0, int param1, int param2, int param3, int param4, int param5, ga param6) {
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var8_int = 0;
        RuntimeException var8 = null;
        int var9 = 0;
        double var10 = 0.0;
        int var12 = 0;
        var12 = ZombieDawn.field_J;
        try {
          if (!super.a(param0, param1 ^ 0, param2, param3, param4, param5, param6)) {
            if (param1 != 1) {
              this.field_L = -88;
            }
            return false;
          }
          var8_int = -this.field_k - (param4 + this.field_K) + param0;
          var9 = -this.field_j - param2 + (-this.field_G + param3);
          if (var8_int * var8_int + var9 * var9 >= this.field_I * this.field_I) {
            return true;
          }
          var10 = Math.atan2((double)var9, (double)var8_int) - hn.field_j;
          if (!(var10 < 0.0)) {
            if (var10 > 0.0) {
              var10 = var10 + 3.141592653589793 / (double)this.field_L;
            }
          } else {
            var10 = var10 - 3.141592653589793 / (double)this.field_L;
          }
          this.field_J = (int)(var10 * (double)this.field_L / 6.283185307179586);
          while (this.field_J >= this.field_L) {
            this.field_J = this.field_J - this.field_L;
          }
          while (0 > this.field_J) {
            this.field_J = this.field_J + this.field_L;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var8 = decompiledCaughtException;
          stackIn_22_0 = var8;
          stackIn_22_1 = new StringBuilder().append("fp.AA(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw sh.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(')').toString());
        }
    }

    private fp() throws Throwable {
        throw new Error();
    }

    static {
    }
}
