/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vk extends jf {
    private int field_d;
    static o[] field_i;
    static char[] field_e;
    private int field_h;
    private String field_k;
    static int field_m;
    static int field_g;
    static int field_p;
    private int field_n;
    private int field_o;
    private int field_f;
    private boolean field_j;
    private mg field_l;

    final void a(mg param0, byte param1, int param2, int param3, String param4) {
        le var7 = null;
        if (param4 == null) {
          this.field_c = null;
          return;
        }
        int var6_int = 118 / ((-3 - param1) / 61);
        if (param0 == this.field_l &&
          this.field_j &&
          this.field_h == 0 &&
          null != this.field_k &&
          this.field_k.equals(param4)) {
          return;
        }
        try {
          this.field_j = true;
          this.field_k = param4;
          this.field_h = 0;
          this.field_l = param0;
          var7 = this.a(param0, param4, param3, (byte) 125);
          var7.field_c[0] = param2;
          var7.field_c[param4.length()] = param0.b(param4) + param2;
          lc.a(123, 0, param4, var7, param0);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "vk.L(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + param3 + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2, mg param3, String param4) {
        le var8 = null;
        int var7 = 0;
        if (param4 == null) {
          this.field_c = null;
          return;
        }
        if (param3 == this.field_l && this.field_j && this.field_h == 1 && null != this.field_k &&
          this.field_k.equals(param4)) {
          return;
        }
        try {
          this.field_l = param3;
          this.field_h = 1;
          this.field_j = true;
          var8 = this.a(param3, param4, param2, (byte) 127);
          var7 = param3.b(param4);
          var8.field_c[0] = -(var7 >> 1) + param0;
          var8.field_c[param4.length()] = (var7 >> 1) + param0;
          lc.a(125, param1, param4, var8, param3);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "vk.O(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, mg param1, int param2, String param3, int param4) {
        le var8 = null;
        le var9 = null;
        if (param3 == null) {
          this.field_c = null;
          return;
        }
        if (this.field_l == param1 &&
          this.field_j &&
          this.field_h == 2 &&
          this.field_k != null &&
          this.field_k.equals(param3)) {
          return;
        }
        try {
          this.field_j = true;
          this.field_k = param3;
          this.field_l = param1;
          this.field_h = 2;
          var8 = this.a(param1, param3, param2, (byte) 127);
          var9 = var8;
          var9.field_c[0] = param4 - param1.b(param3);
          if (param0 != -13323) {
            this.field_d = -67;
          }
          var9.field_c[param3.length()] = param4;
          lc.a(113, 0, param3, var9, param1);
        } catch (RuntimeException runtimeException) {
          throw fc.a((Throwable) ((Object) runtimeException), "vk.H(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    private final le a(mg param0, String param1, int param2, byte param3) {
        le var5 = null;
        RuntimeException var5_ref = null;
        le var6 = null;
        le stackIn_2_0 = null;
        le stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param3 <= 121) {
            stackIn_2_0 = (le) null;
            return stackIn_2_0;
          }
          var6 = new le(param2 - param0.field_F, param2 + param0.field_s, param1.length());
          var5 = var6;
          this.field_c = new le[]{var6};
          stackIn_4_0 = var5;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_7_0 = var5_ref;
          stackIn_7_1 = new StringBuilder().append("vk.N(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void b(byte param0) {
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        rb var4_ref_rb = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var5Lifetime1;
        var6 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 >= -116) {
            field_e = (char[]) null;
          }
          var1_int = -16000;
          var2 = -7680;
          var3 = ud.field_k;
          if (kf.field_G != null) {
            for (var5 = kf.field_G.length - 1; var5 > 0; var5--) {
              if (null != kf.field_G[var5] &&
                kf.field_G[var5].field_j >= 25 &&
                kf.field_G[var5].field_j != 31) {
                if (Math.abs(kf.field_G[var5].field_a) + Math.abs(-7680 + kf.field_G[var5].field_b) < Math.abs(var1_int) + Math.abs(var2 - 7680) &&
                  kf.field_G[var5].field_b < 7040) {
                  var1_int = kf.field_G[var5].field_c * 15 + kf.field_G[var5].field_a;
                  var2 = kf.field_G[var5].field_d * 15 + kf.field_G[var5].field_b;
                }
                if (null == kf.field_G[-1 + var5] ||
                  !(kf.field_G[-1 + var5].field_j >= 25) ||
                  31 == kf.field_G[var5 - 1].field_j) {
                  var4_ref_rb = kf.field_G[var5];
                  kf.field_G[var5] = kf.field_G[-1 + var5];
                  kf.field_G[var5 - 1] = var4_ref_rb;
                }
              }
            }
            for (var5Lifetime1 = 0; kf.field_G.length > var5Lifetime1; var5Lifetime1++) {
              if (kf.field_G[var5Lifetime1] != null) {
                kf.field_G[var5Lifetime1] = kf.field_G[var5Lifetime1].b(15);
              }
            }
          }
          if (-16000 == var1_int) {
            var1_int = 0;
          }
          if (0 <= ve.field_b) {
            ic.field_t = ic.field_t - (lc.field_h >>> 17) * ud.field_k;
            bi.field_i = bi.field_i - ud.field_k;
            ud.field_k = 0;
          }
          if (ud.field_k > qh.field_a[7]) {
            var4 = ud.field_k - qh.field_a[7];
            ic.field_t = ic.field_t - (lc.field_h >>> 17) * var4;
            bi.field_i = bi.field_i - var4;
            ud.field_k = qh.field_a[7];
          }
          wg.field_e = (wg.field_e * 9 + var2) / 10;
          sk.field_o = (sk.field_o * 9 + var1_int) / 10;
          if (1 * qh.field_a[7] / 10 > var3 &&
            ud.field_k >= qh.field_a[7] * 1 / 10) {
            vk.a(250, (byte) 89, 5);
          }
          if (var3 < qh.field_a[7] * 3 / 10 &&
            ud.field_k >= qh.field_a[7] * 3 / 10) {
            vk.a(249, (byte) 89, 6);
          }
          if (6 * qh.field_a[7] / 10 > var3 &&
            qh.field_a[7] * 6 / 10 <= ud.field_k) {
            vk.a(248, (byte) 89, 7);
          }
          if (var3 < qh.field_a[7]) {
            if (ud.field_k < qh.field_a[7]) {
              return;
            }
            vk.a(247, (byte) 89, 8);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1), "vk.J(" + param0 + ')');
        }
    }

    public static void c(int param0) {
        if (param0 != -14275) {
          field_g = 28;
          field_e = null;
          field_i = null;
          return;
        }
        field_e = null;
        field_i = null;
    }

    final static void a(int param0, byte param1, int param2) {
        int var3 = 1 << param2;
        if ((ah.field_f & var3) != 0) {
          return;
        }
        ah.field_f = ah.field_f | var3;
        jl.field_d = jl.field_d | var3;
        lc.field_t.a(new la(param2), -7044);
        if (!oa.field_n) {
          w.field_a.a(new bl(param2, param0, bi.field_i, ic.field_t, lc.field_h, lk.field_e), -7044);
          if (param1 != 89) {
            vk.b((byte) 46);
            return;
          }
          return;
        }
        if (param1 != 89) {
          vk.b((byte) 46);
          return;
        }
    }

    final void a(String param0, int param1, int param2, int param3, mg param4, int param5, int param6, int param7) {
        le stackIn_38_0;
        le stackIn_38_1;
        int stackIn_38_2;
        int stackIn_38_3;
        le stackIn_39_0 = null;
        le stackIn_39_1 = null;
        int stackIn_39_4 = 0;
        int stackIn_42_0 = 0;
        int stackIn_43_1 = 0;
        RuntimeException stackIn_48_0 = null;
        StringBuilder stackIn_48_1 = null;
        String stackIn_49_2 = null;
        StringBuilder stackIn_51_1 = null;
        String stackIn_52_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var9 = null;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        String var13 = null;
        le var14 = null;
        int var15 = 0;
        String[] var16 = null;
        String[] var17 = null;
        int var12Lifetime1;
        var15 = SolKnight.field_L ? 1 : 0;
        try {
          if (0 == param1) {
            param1 = param4.field_x;
          }
          if (param0 == null) {
            this.field_c = null;
            return;
          }
          if (param4 == this.field_l &&
            !this.field_j &&
            param2 == this.field_h &&
            this.field_f == param7 &&
            this.field_o == param1 &&
            param6 == this.field_n &&
            param5 == this.field_d &&
            this.field_k != null &&
            this.field_k.equals(param0)) {
            return;
          }
          this.field_d = param5;
          this.field_k = param0;
          this.field_h = param2;
          this.field_n = param6;
          this.field_l = param4;
          if (param3 <= 36) {
            this.field_l = (mg) null;
          }
          this.field_f = param7;
          this.field_j = false;
          this.field_o = param1;
          var16 = new String[param4.b(param0, param5) + 1];
          var17 = var16;
          var10 = Math.max(1, param4.a(param0, new int[]{param5}, var17));
          if (this.field_f == 3 &&
            var10 == 1) {
            this.field_f = 1;
          }
          if (this.field_f == 0) {
            var11 = param4.field_F;
          } else {
            if (this.field_f == 1) {
              var11 = param4.field_F + (-(var10 * this.field_o) + this.field_n >> 1);
            } else {
              if (this.field_f == 2) {
                var11 = -param4.field_s + (this.field_n - var10 * this.field_o);
              } else {
                var12 = (-(this.field_o * var10) + this.field_n) / (var10 + 1);
                if (var12 < 0) {
                  var12 = 0;
                }
                this.field_o = this.field_o + var12;
                var11 = var12 + param4.field_F;
              }
            }
          }
          this.field_c = new le[var10];
          for (var12Lifetime1 = 0; var10 > var12Lifetime1; var12Lifetime1++) {
            var13 = var16[var12Lifetime1];
            stackIn_38_0 = null;
            stackIn_38_1 = null;
            stackIn_38_2 = var11 - param4.field_F;
            stackIn_38_3 = param4.field_s + var11;
            if (var13 == null) {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = 0;
            } else {
              stackIn_39_0 = null;
              stackIn_39_1 = null;
              stackIn_39_4 = var13.length();
            }
            var14 = new le(stackIn_38_2, stackIn_38_3, stackIn_39_4);
            var14.field_c[0] = 0;
            if (var13 != null) {
              var14.field_c[var13.length()] = param4.b(var13);
              stackIn_42_0 = 114;
              if (param2 != 3) {
                stackIn_43_1 = 0;
              } else {
                stackIn_43_1 = this.a(param4.b(var13), param5, 21107, var13);
              }
              lc.a(stackIn_42_0, stackIn_43_1, var13, var14, param4);
            }
            var11 = var11 + param1;
            this.field_c[var12Lifetime1] = var14;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var9 = decompiledCaughtException;
          stackIn_48_0 = var9;
          stackIn_48_1 = new StringBuilder().append("vk.M(");
          if (param0 == null) {
            stackIn_49_2 = "null";
          } else {
            stackIn_49_2 = "{...}";
          }
          stackIn_51_1 = ((StringBuilder) (Object) stackIn_48_1).append(stackIn_49_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_52_2 = "null";
          } else {
            stackIn_52_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_48_0), ((StringBuilder) (Object) stackIn_51_1).append(stackIn_52_2).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(')').toString());
        }
    }

    public vk() {
    }

    static {
        field_e = new char[]{(char)8364, (char)0, (char)8218, (char)402, (char)8222, (char)8230, (char)8224, (char)8225, (char)710, (char)8240, (char)352, (char)8249, (char)338, (char)0, (char)381, (char)0, (char)0, (char)8216, (char)8217, (char)8220, (char)8221, (char)8226, (char)8211, (char)8212, (char)732, (char)8482, (char)353, (char)8250, (char)339, (char)0, (char)382, (char)376};
    }
}
