/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    private int field_i;
    private int field_k;
    private int field_h;
    private int field_o;
    private int field_l;
    private int field_b;
    private hd field_f;
    static String field_g;
    private int field_j;
    static String field_d;
    static hh[][][] field_c;
    private int field_e;
    private int field_a;
    private int field_n;
    static int[] field_m;

    final static void a(String param0, int param1, String param2) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3 = null;
        try {
          if (to.field_r != null) {
            to.field_r.p(-92);
          }
          nf.field_b = new be(param0, param2, false, true, true);
          ph.field_l.c(nf.field_b, -120);
          if (param1 > -30) {
            field_d = (String) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_8_0 = var3;
          stackIn_8_1 = new StringBuilder().append("al.F(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final static int a(int param0, char param1, CharSequence param2) {
        int var5 = 0;
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var6 = 0;
        int stackIn_8_0 = 0;
        RuntimeException stackIn_11_0 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Pixelate.field_H ? 1 : 0;
        try {
          var3_int = param0;
          var4 = param2.length();
          for (var5 = 0; var5 < var4; var5++) {
            if (param2.charAt(var5) == param1) {
              var3_int++;
            }
          }
          stackIn_8_0 = var3_int;
          return stackIn_8_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_11_0 = var3;
          stackIn_11_1 = new StringBuilder().append("al.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_11_0), ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(')').toString());
        }
    }

    final void a(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        var6 = Pixelate.field_H ? 1 : 0;
        var2 = 20 / ((param0 + 63) / 56);
        var3 = 32 * this.field_f.field_i;
        var4 = 32 * this.field_f.field_a;
        if (oa.field_j == 0) {
          this.field_e = this.field_e + this.field_n;
          if (this.field_e > var4 + var3 ||
            0 > this.field_e) {
            this.field_e = -this.field_n - this.field_n + this.field_e;
            this.field_n = -this.field_n;
          }
          if (var3 > this.field_e) {
            this.field_o = this.field_l + 6;
            this.field_j = this.field_e + this.field_i;
          } else {
            this.field_o = -var3 + this.field_e - 10 + this.field_l + 16;
            this.field_j = this.field_i - (-var3 + 16) + 10;
          }
        } else {
          this.field_j = (var3 >> 1) + this.field_i - 64;
          this.field_o = 6 + this.field_l;
        }
        var5 = 138;
        if (this.field_o < var5) {
          this.field_o = var5;
        }
    }

    final static void a(int param0, byte param1, int param2, we param3, int param4) {
        try {
          param3.e(160, 12);
          if (param1 != 66) {
            tf[] var6 = (tf[]) null;
            al.a(true, (tf[]) null);
          }
          param3.b(param1 + 1276387878, 17);
          param3.b(1276387944, param4);
          param3.b(1276387944, param0);
          param3.e(160, param2);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "al.C(" + param0 + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + param4 + ')');
        }
    }

    final static void a(String param0, int param1) {
        if (param1 != 0) {
          return;
        }
        System.out.println("Error: " + qk.a(param0, "%0a", "\n", -127));
    }

    al(dd param0, hd param1, kk param2) {
        try {
          this.field_f = param1;
          this.field_n = 20;
          this.field_i = param2.field_t;
          this.field_l = param2.field_u;
          this.field_h = param0.field_h;
          this.field_k = param0.field_j;
          this.field_a = param0.field_n;
          this.a(-127);
        } catch (RuntimeException runtimeException) {
          throw aa.a((Throwable) ((Object) runtimeException), "al.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + (param2 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(int param0, int param1, int param2) {
        int fieldTemp$0 = 0;
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_27_0 = 0;
        tf stackIn_38_0 = null;
        tf stackIn_41_0 = null;
        tf stackIn_44_0 = null;
        tf stackIn_47_0 = null;
        tf stackIn_51_0 = null;
        tf stackIn_54_0 = null;
        tf stackIn_57_0 = null;
        tf stackIn_60_0 = null;
        boolean[] var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        int var14;
        int var15;
        int var16;
        int var17;
        int var18;
        Object var19;
        tf var19_ref;
        Object var20;
        tf var20_ref;
        int var21;
        int var22;
        tf var23;
        tf var24;
        var4 = this.field_f.field_s;
        if (this.field_h < param0) {
          if (this.field_a >= param0) {
            stackIn_8_0 = (0 == param0 % 2) ? 1 : 0;
          } else {
            stackIn_8_0 = 0;
          }
        } else {
          stackIn_8_0 = 0;
        }
        var5 = stackIn_8_0;
        var6 = this.field_f.field_e;
        var7 = this.field_f.field_h;
        var8 = -param0 + 10;
        if (param0 >= 10) {
          stackIn_11_0 = 256;
        } else {
          stackIn_11_0 = (param0 << 8) / 10;
        }
        var9 = stackIn_11_0;
        var10 = this.field_k * (-10 + param0 + (-this.field_h - this.field_a)) >> 16;
        if (var10 < 0) {
          var10 = 0;
        }
        if (256 < var10) {
          var10 = 256;
        }
        var11 = 256 - var10;
        var12 = var10;
        var13 = this.field_i + 32 * var6;
        var14 = this.field_l + 32 * (2 + var7);
        var15 = 64 + (64 * var11 >> 8);
        var16 = this.field_j + ((var13 - this.field_j) * var12 >> 8);
        var17 = ((-this.field_o + var14) * var12 >> 8) + (this.field_o - var15);
        if (var5 != 0) {
          var16 += 5;
        }
        if (jc.field_d) {
          fieldTemp$0 = this.field_b + 1;
          this.field_b = this.field_b + 1;
          if (fieldTemp$0 >= 50) {
            this.field_b = 0;
          }
          gd.field_f[this.field_b].b(1 + var13, -63 + var14, var9);
        }
        t.a(1 + var13, -63 + var14, 63, 63, 16777215);
        t.a(2 + var13, var14 - 64 + 2, 61, 61, 0);
        var18 = var9 * var11 * 15 >> 16;
        fi.a(6 + var16, var17 + 5, var13, var14 - 64, 6, var18, gg.field_z);
        fi.a(-7 + (var15 + var16), 5 + var17, 64 + var13, var14 - 64, 6, var18, gg.field_z);
        fi.a(var16 + 6, var15 + var17, var13, var14 - 1, 6, var18, gg.field_z);
        fi.a(var16 - (-var15 + 7), var15 + var17, 64 + var13, var14 - 1, 6, var18, gg.field_z);
        var15 = var15 / 2;
        var19 = null;
        var20 = null;
        if (null == fq.field_o) {
          stackIn_27_0 = 0;
        } else {
          stackIn_27_0 = fo.field_t;
        }
        var21 = stackIn_27_0;
        if (var21 == 0) {
          var19_ref = rg.field_e.field_f[0];
          var20_ref = rg.field_e.field_f[1];
        } else {
          if (var21 == 1) {
            var20_ref = fq.field_o.field_f[1];
            var19_ref = fq.field_o.field_f[0];
          } else {
            var23 = im.field_Hb[0];
            var19_ref = var23;
            var24 = im.field_Hb[1];
            var20_ref = var24;
            var23.c();
            rg.field_e.field_f[0].f(0, 0);
            fq.field_o.field_f[0].a(0, 0, var21);
            var24.c();
            rg.field_e.field_f[1].f(0, 0);
            fq.field_o.field_f[1].a(0, 0, var21);
            qa.field_f.a(param2 ^ 19692);
          }
        }
        if (param2 < var8) {
          if (var4[0]) {
            stackIn_51_0 = var20_ref;
          } else {
            stackIn_51_0 = var19_ref;
          }
          fi.a(stackIn_51_0, ii.field_p[var8 - 1], var16, var17);
          if (!var4[1]) {
            stackIn_54_0 = var19_ref;
          } else {
            stackIn_54_0 = var20_ref;
          }
          fi.a(stackIn_54_0, ii.field_p[-1 + var8], var16 + var15, var17);
          if (!var4[2]) {
            stackIn_57_0 = var19_ref;
          } else {
            stackIn_57_0 = var20_ref;
          }
          fi.a(stackIn_57_0, ii.field_p[var8 - 1], var16, var15 + var17);
          if (var4[3]) {
            stackIn_60_0 = var20_ref;
          } else {
            stackIn_60_0 = var19_ref;
          }
          fi.a(stackIn_60_0, ii.field_p[-1 + var8], var16 + var15, var17 + var15);
        } else {
          var22 = 0;
          if (param1 != 0) {
            var22 = 8 - param1 << 2;
            var22 = var22 + (var22 * var11 >> 8);
          }
          if (!var4[0]) {
            stackIn_38_0 = var19_ref;
          } else {
            stackIn_38_0 = var20_ref;
          }
          ((tf) (Object) stackIn_38_0).a(var16, var22 + var17, var15, var15);
          if (!var4[1]) {
            stackIn_41_0 = var19_ref;
          } else {
            stackIn_41_0 = var20_ref;
          }
          ((tf) (Object) stackIn_41_0).a(var15 + var16 - var22, var17, var15, var15);
          if (!var4[2]) {
            stackIn_44_0 = var19_ref;
          } else {
            stackIn_44_0 = var20_ref;
          }
          ((tf) (Object) stackIn_44_0).a(var22 + var16, var15 + var17, var15, var15);
          if (var4[3]) {
            stackIn_47_0 = var20_ref;
          } else {
            stackIn_47_0 = var19_ref;
          }
          ((tf) (Object) stackIn_47_0).a(var15 + var16, -var22 + var17 + var15, var15, var15);
        }
    }

    final static tf[] a(boolean param0, tf[] param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        tf var3 = null;
        int var4 = 0;
        we var5 = null;
        tf[] stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = Pixelate.field_H ? 1 : 0;
        try {
          var2_int = 0;
          if (param0) {
            var5 = (we) null;
            al.a(99, (byte) 118, 123, (we) null, -60);
          }
          while (var2_int < param1.length) {
            var3 = param1[var2_int];
            param1[var2_int].field_y = 0;
            var3.field_D = 0;
            param1[var2_int].field_A = param1[var2_int].field_F;
            param1[var2_int].field_B = param1[var2_int].field_E;
            var2_int++;
          }
          stackIn_6_0 = (tf[]) (param1);
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_9_0 = var2;
          stackIn_9_1 = new StringBuilder().append("al.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw aa.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        field_g = null;
        field_m = null;
        field_d = null;
        if (param0 != 51) {
          return;
        }
        field_c = (hh[][][]) null;
    }

    static {
        field_c = new hh[6][6][];
        field_d = "Resign";
        field_m = new int[8192];
    }
}
