/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class qo {
    static int field_b;
    static int field_a;
    static int[] field_c;
    ha[] field_d;
    static ln field_e;

    final int a(byte param0, int param1) {
        ha var4 = null;
        int var5 = ShatteredPlansClient.field_F ? 1 : 0;
        int var3 = 0;
        if (param0 < 43) {
          qo.a(55);
        }
        while (this.field_d.length > var3) {
          var4 = this.field_d[var3];
          if (var4.field_b.length > param1) {
            return var3;
          }
          param1 = param1 - (var4.field_b.length - 1);
          var3++;
        }
        return this.field_d.length;
    }

    final static void a(int param0, int param1) {
        int var2 = (kh.field_Mb - 640) / 2;
        int var3 = ed.field_f * ed.field_f;
        int var4 = var3 - param1 * param1;
        if (param0 != 22353) {
          field_b = 102;
        }
        am.field_xb.a(199, gf.field_k - 120 - 94, (byte) 109, 90, var2 - 199 * var4 / var3);
        pf.field_g.a(438, -124 + gf.field_k, (byte) 77, 0, 438 * var4 / var3 + var2 + 202);
    }

    public static void a(int param0) {
        field_c = null;
        field_e = null;
        int var1 = -47 % ((param0 + 43) / 59);
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 != 438) {
          return 23;
        }
        if (null != this.field_d &&
          this.field_d.length > 0) {
          stackIn_6_0 = this.field_d[this.field_d.length - 1].field_c - this.field_d[0].field_e;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int c(int param0) {
        int var4 = 0;
        int var2;
        ha[] var3_ref_ha__;
        ha var5;
        int var7;
        int var3;
        int var6;
        var7 = ShatteredPlansClient.field_F ? 1 : 0;
        var2 = -1;
        if (null != this.field_d) {
          var3_ref_ha__ = this.field_d;
          for (var4 = 0; var3_ref_ha__.length > var4; var4++) {
            var5 = var3_ref_ha__[var4];
            if (var5 != null) {
              var6 = var5.b(35);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        var3 = -49 % ((param0 - 25) / 59);
        return var2;
    }

    final int a(int param0, int param1, int param2, String param3) {
        int var8 = 0;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_3_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_25_0 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        String stackIn_29_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        var10 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param0 != -28135) {
            stackIn_3_0 = 43;
            return stackIn_3_0;
          }
          var5_int = 0;
          var6 = 0;
          var7 = param3.length();
          for (var8 = 0; var7 > var8; var8++) {
            var9 = param3.charAt(var8);
            if (var9 == 60) {
              var6 = 1;
            } else {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            }
          }
          if (var5_int > 0) {
            stackIn_23_0 = (param1 - param2 << 8) / var5_int;
            return stackIn_23_0;
          }
          stackIn_25_0 = 0;
          return stackIn_25_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_28_0 = var5;
          stackIn_28_1 = new StringBuilder().append("qo.K(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_29_2 = "null";
          } else {
            stackIn_29_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_28_0), ((StringBuilder) (Object) stackIn_28_1).append(stackIn_29_2).append(')').toString());
        }
    }

    final int a(int param0, int param1, int param2) {
        int var5 = 0;
        int var4;
        ha var6;
        int var7;
        int var8;
        var8 = ShatteredPlansClient.field_F ? 1 : 0;
        if (this.field_d != null &&
          this.field_d.length != 0 &&
          this.field_d[0].field_e <= param2) {
          if (this.field_d[this.field_d.length - 1].field_c < param2) {
            return -1;
          }
          if (this.field_d.length == 1) {
            return this.field_d[0].a(false, param0);
          }
          var4 = 0;
          if (param1 != 3357) {
            this.b(-63);
          }
          for (var5 = 0; var5 < this.field_d.length; var5++) {
            var6 = this.field_d[var5];
            if (param2 >= var6.field_e &&
              var6.field_c >= param2) {
              var7 = var6.a(false, param0);
              if (var7 == -1) {
                return -1;
              }
              return var4 + var7;
            }
            var4 = var4 + (-1 + var6.field_b.length);
          }
          return -1;
        }
        return -1;
    }

    final int a(boolean param0, int param1) {
        ha var5 = null;
        int var6 = ShatteredPlansClient.field_F ? 1 : 0;
        ha[] var3 = this.field_d;
        int var4 = 0;
        if (!param0) {
          field_c = (int[]) null;
        }
        while (var3.length > var4) {
          var5 = var3[var4];
          if (var5.field_b.length > param1) {
            return var5.field_b[param1];
          }
          param1 = param1 - (var5.field_b.length - 1);
          var4++;
        }
        return 0;
    }

    static {
        field_c = new int[8192];
    }
}
