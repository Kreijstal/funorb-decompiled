/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class wh extends am {
    static int field_x;
    static sm[] field_t;
    static String[] field_z;
    static int field_s;
    static int field_w;
    private boolean field_A;
    static String field_u;
    private int field_v;
    static int[] field_y;

    final static String a(int param0, byte param1) {
        StringBuilder discarded$3 = null;
        int var6 = Torquing.field_u;
        if (param0 < 0) {
          param0 = 0;
        }
        int var2 = (999 + param0) / 1000;
        int var3 = var2 / 60;
        var2 = var2 % 60;
        int var4 = 16 / ((-66 - param1) / 52);
        StringBuilder var5 = new StringBuilder(5);
        StringBuilder discarded$0 = var5.append((char)(48 + var2 % 10));
        StringBuilder discarded$1 = var5.append((char)(48 + var2 / 10));
        StringBuilder discarded$2 = var5.append(':');
        do {
          discarded$3 = var5.append((char)(48 + var3 % 10));
          var3 = var3 / 10;
        } while (var3 > 0);
        return db.a(var5.toString(), 31108);
    }

    final void a(fj param0, int param1, int param2) {
        int var4_int = 0;
        int var5 = 0;
        boolean stackIn_8_1 = false;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var5 = Torquing.field_u;
        try {
          var4_int = param2;
          if (var4_int == 0) {
            this.field_v = param0.i(param1 ^ 7059);
          } else {
            if (var4_int == 1) {
              stackIn_8_1 = (param0.i((byte) -101) == 1);
              this.field_A = stackIn_8_1;
            }
          }
          if (param1 != 35) {
            this.a(-19, 115);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("wh.H(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(')').toString());
        }
    }

    public static void g(byte param0) {
        if (param0 < 86) {
          wh.b(104);
        }
        field_t = null;
        field_u = null;
        field_y = null;
        field_z = null;
    }

    final int[][] a(int param0, int param1) {
        int[] var40 = null;
        int[] var5 = null;
        int[] var41 = null;
        int[] var42 = null;
        int[] var43 = null;
        int[] var44 = null;
        int var10 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        int var17 = 0;
        int var18 = 0;
        int var19 = 0;
        int var20 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var21 = Torquing.field_u;
        if (param0 != -29116) {
          field_t = (sm[]) null;
        }
        int[][] var29 = this.field_r.a(15142, param1);
        int[][] var23 = var29;
        int[][] var22 = var23;
        int[][] var3 = var22;
        if (!this.field_r.field_b) {
        } else {
          var40 = this.b(param0 + 29116, 0, vp.field_I & param1 - 1);
          var5 = this.b(0, 0, param1);
          var41 = this.b(0, 0, vp.field_I & param1 + 1);
          var42 = var29[0];
          var43 = var29[1];
          var44 = var29[2];
          for (var10 = 0; var10 < ci.field_c; var10++) {
            var14 = this.field_v * (-var40[var10] + var41[var10]);
            var15 = (var5[jh.field_A & var10 + 1] - var5[var10 - 1 & jh.field_A]) * this.field_v;
            var16 = var15 >> 12;
            var17 = var14 >> 12;
            var18 = var16 * var16 >> 12;
            var19 = var17 * var17 >> 12;
            var20 = (int)(Math.sqrt((double)((float)(var19 + var18 + 4096) / 4096.0f)) * 4096.0);
            if (var20 != 0) {
              var11 = var15 / var20;
              var12 = var14 / var20;
              var13 = 16777216 / var20;
            } else {
              var13 = 0;
              var11 = 0;
              var12 = 0;
            }
            if (this.field_A) {
              var12 = 2048 + (var12 >> 1);
              var13 = 2048 + (var13 >> 1);
              var11 = 2048 + (var11 >> 1);
            }
            var42[var10] = var11;
            var43[var10] = var12;
            var44[var10] = var13;
          }
        }
        return var22;
    }

    final static void b(int param0) {
        int var7 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        h var4_ref_h = null;
        qk var5 = null;
        int var5_int = 0;
        int[] var6 = null;
        int var8 = 0;
        df var10 = null;
        int[] var11 = null;
        int[] var12 = null;
        var8 = Torquing.field_u;
        try {
          if (param0 < 85) {
            wh.a(0, -125, 67, -97, -50, -52);
          }
          var10 = kj.field_d;
          var2 = var10.i((byte) -101);
          var3 = var10.i((byte) -101);
          if (var2 == 0) {
            var4_ref_h = (h) (to.field_s.b(0));
            if (var4_ref_h == null) {
              ih.b(true);
              return;
            }
            var5_int = -var10.field_n + oo.field_a;
            var12 = var4_ref_h.field_k;
            var11 = var12;
            var6 = var11;
            if (var5_int > var12.length << 2) {
              var5_int = var12.length << 2;
            }
            for (var7 = 0; var7 < var5_int; var7++) {
              var6[var7 >> 2] = var6[var7 >> 2] + (var10.i((byte) -101) << ie.a(768, var7 << 8));
            }
            var4_ref_h.field_n = true;
            var4_ref_h.f(0);
            return;
          }
          if (var2 == 1) {
            var4 = var10.g((byte) -126);
            var5 = (qk) (kc.field_z.b(0));
            while (var5 != null) {
              if (var5.field_k != var3 ||
                var5.field_o != var4) {
                var5 = (qk) (kc.field_z.f(-24059));
                continue;
              }
              break;
            }
            if (var5 != null) {
              var5.f(0);
              return;
            }
            ih.b(true);
            return;
          }
          nn.a("LR1: " + me.a(-1), (Throwable) null, -9958);
          ih.b(true);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var1), "wh.E(" + param0 + ')');
        }
    }

    final static void a(int param0, int param1, int param2, int param3, int param4, int param5) {
        int var6_int = 0;
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
        int var21 = 0;
        int var22 = 0;
        int var23 = 0;
        int var24 = 0;
        int var25 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var6 = null;
        var25 = Torquing.field_u;
        try {
          var6_int = 0;
          var7 = param4;
          var8 = param2 * param2;
          var9 = param4 * param4;
          var10 = var9 << 1;
          var11 = var8 << 1;
          var12 = param4 << 1;
          var13 = var10 + var8 * (-var12 + 1);
          var14 = -((-1 + var12) * var11) + var9;
          var15 = var8 << 2;
          var16 = var9 << 2;
          var17 = (3 + (var6_int << 1)) * var10;
          var18 = ((var7 << 1) - 3) * var11;
          var19 = (1 + var6_int) * var16;
          if (param1 != -1817) {
            return;
          }
          di.a(param3 - param2, (byte) 108, param0, qd.field_a[param5], param3 + param2);
          var20 = (-1 + var7) * var15;
          while (0 < var7) {
            if (0 > var13) {
              while (var13 < 0) {
                var14 = var14 + var19;
                var13 = var13 + var17;
                var6_int++;
                var19 = var19 + var16;
                var17 = var17 + var16;
              }
            }
            if (var14 < 0) {
              var14 = var14 + var19;
              var13 = var13 + var17;
              var6_int++;
              var17 = var17 + var16;
              var19 = var19 + var16;
            }
            var14 = var14 - var18;
            var13 = var13 - var20;
            var20 = var20 - var15;
            var18 = var18 - var15;
            var7--;
            var21 = param5 - var7;
            var22 = param5 + var7;
            var23 = param3 + var6_int;
            var24 = -var6_int + param3;
            di.a(var24, (byte) 114, param0, qd.field_a[var21], var23);
            di.a(var24, (byte) 37, param0, qd.field_a[var22], var23);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          throw rb.a((Throwable) ((Object) var6), "wh.C(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ')');
        }
    }

    public wh() {
        super(1, false);
        this.field_v = 4096;
        this.field_A = true;
    }

    final static void a(int param0, int param1, byte[] param2, int param3, int param4, int param5, int[] param6, byte param7, int param8, int param9, int param10, int[] param11) {
        int var14 = 0;
        int incrementValue$1 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var12_int = 0;
        RuntimeException var12 = null;
        int var13 = 0;
        int var15 = 0;
        int var16 = 0;
        var16 = Torquing.field_u;
        try {
          var12_int = 256 - param4;
          var13 = -param3;
          if (param7 != 29) {
            wh.g((byte) -10);
          }
          while (var13 < 0) {
            for (var14 = -param10; var14 < 0; var14++) {
              param0 = param2[param1++];
              if (param0 == 0) {
                param9++;
              } else {
                var15 = param6[param9];
                incrementValue$1 = param9;
                param9++;
                param6[incrementValue$1] = ie.a(16711680, var12_int * ie.a(var15, 65280)) + ie.a(ie.a(16711935, var15) * var12_int, -16711936) >> 8;
              }
            }
            param1 = param1 + param8;
            param9 = param9 + param5;
            var13++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var12 = decompiledCaughtException;
          stackIn_14_0 = var12;
          stackIn_14_1 = new StringBuilder().append("wh.D(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',');
          if (param6 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_s = 0;
        field_x = 0;
    }
}
