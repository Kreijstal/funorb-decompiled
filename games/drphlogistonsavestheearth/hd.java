/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hd extends vg {
    boolean field_E;
    private int field_A;
    static String field_O;
    private int field_G;
    private int field_J;
    private nh field_C;
    private nh field_H;
    private int field_K;
    static int field_B;
    private int field_z;
    private nh[] field_D;
    private nh field_F;
    private int field_N;
    static String field_L;
    int field_I;

    final void a(boolean param0, int param1, int param2) {
        this.field_G = 8355711 & param1 >> 1;
        this.field_K = (param2 & 16711422) >> 1;
        if (param0) {
          bl var5 = (bl) null;
          hd.a((byte) 69, (od) null, (bl) null, 110);
        }
        this.field_N = param1;
        this.field_A = param2;
        this.f(2);
    }

    private final nh a(int param0, byte param1, int param2) {
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        nh var14 = new nh(this.field_J * 2, this.field_k);
        int var8Lifetime1;
        int var9Lifetime1;
        int var12Lifetime1;
        aj.a(var14, (byte) 54);
        int var5 = this.field_k >> 1;
        if (param1 != 43) {
          this.field_I = 26;
        }
        for (var6 = 0; var6 < this.field_k; var6++) {
          var7 = (var6 >> 1) * (-1 + 2 * this.field_J) % (2 * this.field_J);
          var8 = 16711935 & param2;
          var9 = param2 & 65280;
          var10 = -var5 + var6;
          var11 = (int)(128.0 * (Math.sqrt((double)(var5 * var5 - var10 * var10)) / (double)var5)) + 128;
          var12 = 256 <= var11 ? var8 | var9 : (16711680 & var9 * var11 | -16711936 & var8 * var11) >>> 8;
          wj.g(var7, var6, this.field_J, var12);
          var9Lifetime1 = 65280 & param0;
          wj.g(-(2 * this.field_J) + var7, var6, this.field_J, var12);
          var8Lifetime1 = param0 & 16711935;
          var12Lifetime1 = var11 >= 256 ? var8Lifetime1 | var9Lifetime1 : (16711680 & var9Lifetime1 * var11 | -16711936 & var8Lifetime1 * var11) >>> 8;
          wj.g(var7 + this.field_J, var6, this.field_J, var12Lifetime1);
          wj.g(var7 - this.field_J, var6, this.field_J, var12Lifetime1);
        }
        cl.d((byte) -115);
        return var14;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        super.a(param0, param1, param2, param3, param4);
        this.f(2);
    }

    hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        this(param0, param1, param2, param3, param4, param5, param6, param5 >> 1 & 8355711, (16711422 & param6) >> 1);
    }

    final void a(int param0, int param1, byte param2, int param3) {
        if (0 != param1) {
          return;
        }
        int var5 = this.field_o + param0;
        if (param2 != -21) {
          this.field_C = (nh) null;
        }
        int var6 = this.field_m + param3;
        this.a((byte) -116, var5, this.field_D[0], var6);
        if (this.field_I < 65536) {
          ib.a(var6, this.field_k + var6, (byte) 124, this.field_w + var5, (this.field_w * this.field_I >> 16) + var5);
          this.a((byte) -112, var5, this.field_D[1], var6);
          cl.d((byte) -117);
        }
    }

    public static void b(boolean param0) {
        field_L = null;
        field_O = null;
        if (param0) {
          hd.b(true);
        }
    }

    final static void a(byte param0, od param1, bl param2, int param3) {
        try {
          int var5 = 0;
          int var11_int = 0;
          int var12_int = 0;
          byte[] array$0 = null;
          String dupTemp$1 = null;
          RuntimeException stackIn_38_0 = null;
          StringBuilder stackIn_38_1 = null;
          String stackIn_39_2 = null;
          StringBuilder stackIn_41_1 = null;
          String stackIn_42_2 = null;
          Throwable decompiledCaughtException = null;
          RuntimeException var4 = null;
          int var6_int = 0;
          ClassNotFoundException var6 = null;
          SecurityException var6_ref = null;
          NullPointerException var6_ref2 = null;
          Exception var6_ref3 = null;
          Throwable var6_ref4 = null;
          String var8 = null;
          int var9 = 0;
          String[] var10 = null;
          byte[][] var11 = null;
          Class[] var12 = null;
          int var13 = 0;
          int var14 = 0;
          String var15 = null;
          String var16 = null;
          int var17 = 0;
          lc var18 = null;
          byte[][] var19 = null;
          String var20 = null;
          byte[][] var21 = null;
          int var13Lifetime1;
          var14 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
          try {
            var18 = new lc();
            var18.field_r = param1.l(31760);
            var18.field_l = param1.h(-108);
            if (param0 <= 95) {
              return;
            }
            var18.field_t = new byte[var18.field_r][][];
            var18.field_p = new int[var18.field_r];
            var18.field_w = new int[var18.field_r];
            var18.field_j = new int[var18.field_r];
            var18.field_n = new il[var18.field_r];
            var18.field_o = new il[var18.field_r];
            for (var5 = 0; var5 < var18.field_r; var5++) {
              try {
                var6_int = param1.l(31760);
                if (var6_int != 0 &&
                  var6_int != 1 &&
                  var6_int != 2) {
                  if (var6_int == 3 ||
                    var6_int == 4) {
                    var20 = param1.b((byte) -93);
                    var8 = param1.b((byte) -99);
                    var9 = param1.l(31760);
                    var10 = new String[var9];
                    for (var11_int = 0; var11_int < var9; var11_int++) {
                      var10[var11_int] = param1.b((byte) -119);
                    }
                    var21 = new byte[var9][];
                    var19 = var21;
                    var11 = var19;
                    if (var6_int == 3) {
                      for (var12_int = 0; var12_int < var9; var12_int++) {
                        var13 = param1.h(-92);
                        array$0 = new byte[var13];
                        var11[var12_int] = array$0;
                        param1.b(0, var13, 128, var21[var12_int]);
                      }
                    }
                    var18.field_j[var5] = var6_int;
                    var12 = new Class[var9];
                    var17 = 0;
                    var13Lifetime1 = var17;
                    while (var9 > var17) {
                      var12[var17] = i.a(-32512, var10[var17]);
                      var17++;
                    }
                    var18.field_o[var5] = param2.a(var8, i.a(-32512, var20), var12, (byte) -39);
                    var18.field_t[var5] = var21;
                  }
                } else {
                  var15 = param1.b((byte) -77);
                  dupTemp$1 = param1.b((byte) -101);
                  var16 = dupTemp$1;
                  var8 = dupTemp$1;
                  var9 = 0;
                  if (var6_int == 1) {
                    var9 = param1.h(-124);
                  }
                  var18.field_j[var5] = var6_int;
                  var18.field_w[var5] = var9;
                  var18.field_n[var5] = param2.a(i.a(-32512, var15), var16, (byte) 14);
                }
              } catch (java.lang.ClassNotFoundException decompiledCaughtParameter0) {
                decompiledCaughtException = decompiledCaughtParameter0;
                var6 = (ClassNotFoundException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -1;
              } catch (java.lang.SecurityException decompiledCaughtParameter1) {
                decompiledCaughtException = decompiledCaughtParameter1;
                var6_ref = (SecurityException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -2;
              } catch (java.lang.NullPointerException decompiledCaughtParameter2) {
                decompiledCaughtException = decompiledCaughtParameter2;
                var6_ref2 = (NullPointerException) (Object) decompiledCaughtException;
                var18.field_p[var5] = -3;
              } catch (java.lang.Exception decompiledCaughtParameter3) {
                decompiledCaughtException = decompiledCaughtParameter3;
                var6_ref3 = (Exception) (Object) decompiledCaughtException;
                var18.field_p[var5] = -4;
              } catch (java.lang.Throwable decompiledCaughtParameter4) {
                decompiledCaughtException = decompiledCaughtParameter4;
                var6_ref4 = decompiledCaughtException;
                var18.field_p[var5] = -5;
              }
            }
            g.field_t.a(var18, 255);
            return;
          } catch (java.lang.RuntimeException decompiledCaughtParameter5) {
            decompiledCaughtException = decompiledCaughtParameter5;
            var4 = (RuntimeException) (Object) decompiledCaughtException;
            stackIn_38_0 = var4;
            stackIn_38_1 = new StringBuilder().append("hd.B(").append(param0).append(',');
            if (param1 == null) {
              stackIn_39_2 = "null";
            } else {
              stackIn_39_2 = "{...}";
            }
            stackIn_41_1 = ((StringBuilder) (Object) stackIn_38_1).append(stackIn_39_2).append(',');
            if (param2 == null) {
              stackIn_42_2 = "null";
            } else {
              stackIn_42_2 = "{...}";
            }
            throw ie.a((Throwable) ((Object) stackIn_38_0), ((StringBuilder) (Object) stackIn_41_1).append(stackIn_42_2).append(',').append(param3).append(')').toString());
          }
        } catch (RuntimeException | Error decompiledUncheckedException) {
          throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
          throw new RuntimeException(decompiledCheckedException);
        }
    }

    final void a(vg param0, int param1, int param2, byte param3) {
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5 = null;
        try {
          if (param3 >= -127) {
            return;
          }
          if (this.field_E) {
            this.field_z = this.field_z + 1;
            if (this.field_z > 2 * this.field_J) {
              this.field_z = this.field_z - 2 * this.field_J;
              return;
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_8_0 = var5;
          stackIn_8_1 = new StringBuilder().append("hd.I(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    private final nh a(byte param0) {
        int var4 = 0;
        int var5 = 0;
        double var6 = 0.0;
        int var8 = 0;
        nh discarded$0 = null;
        int var9 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        int var2 = this.field_k >> 1;
        nh var3 = new nh(var2, this.field_k);
        aj.a(var3, (byte) 85);
        for (var4 = 0; this.field_k > var4; var4++) {
          for (var5 = 0; var5 < var2; var5++) {
            var6 = (double)var5 * (double)var5 / (double)((-var4 + this.field_k) * var4);
            var8 = 1;
            if (var6 < 1.0) {
              var6 = Math.sqrt(-var6 + 1.0);
              var8 = !(var6 >= 1.0) ? (int)(255.0 * var6) : 255;
            }
            wj.a(var5, var4, var8 << 16 | (var8 << 8 | var8));
          }
        }
        if (param0 != 101) {
          discarded$0 = this.a(-23, (byte) -84, -68);
        }
        cl.d((byte) -80);
        return var3;
    }

    final static nh[] c(boolean param0) {
        int var2 = 0;
        int var3 = 0;
        byte[] var4 = null;
        int[] var5 = null;
        int var6 = 0;
        int var7 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        if (!param0) {
          return (nh[]) null;
        }
        nh[] var1 = new nh[bd.field_M];
        for (var2 = 0; var2 < bd.field_M; var2++) {
          var3 = gf.field_o[var2] * qa.field_J[var2];
          var4 = a.field_e[var2];
          var5 = new int[var3];
          for (var6 = 0; var3 > var6; var6++) {
            var5[var6] = aj.field_a[rk.a(255, (int) var4[var6])];
          }
          var1[var2] = new nh(oe.field_b, ih.field_K, kh.field_i[var2], vi.field_b[var2], gf.field_o[var2], qa.field_J[var2], var5);
        }
        oc.a((byte) -21);
        return var1;
    }

    private final void f(int param0) {
        if (param0 != 2) {
          return;
        }
        this.field_D = new nh[]{this.a(this.field_A, (byte) 43, this.field_N), this.a(this.field_K, (byte) 43, this.field_G)};
        this.field_C = this.a((byte) 101);
        this.field_H = this.field_C.e();
        this.field_F = new nh(this.field_k >> 1, this.field_k);
    }

    private final void a(byte param0, int param1, nh param2, int param3) {
        int var6 = 0;
        RuntimeException stackIn_18_0 = null;
        StringBuilder stackIn_18_1 = null;
        String stackIn_19_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var7 = 0;
        int var8 = 0;
        var8 = DrPhlogistonSavesTheEarth.field_D ? 1 : 0;
        try {
          var5_int = param1 + this.field_w;
          if (param0 > -89) {
            this.a(false, 41, 72);
          }
          ib.a(param3, param3 + this.field_k, (byte) 114, -this.field_C.field_y + var5_int, param1 + this.field_C.field_y);
          for (var6 = param1 - this.field_z; var5_int > var6; var6 = var6 + param2.field_y) {
            param2.d(var6, param3);
          }
          cl.d((byte) -67);
          if (this.field_C.field_y + param1 >= wj.field_g) {
            aj.a(this.field_F, (byte) 84);
            param2.d(-this.field_z, 0);
            param2.d(2 * this.field_J - this.field_z, 0);
            this.field_H.c(0, 0);
            cl.d((byte) -120);
            this.field_F.d(param1, param3);
          }
          if (-this.field_C.field_y + var5_int <= wj.field_b) {
            aj.a(this.field_F, (byte) 63);
            for (var7 = this.field_z + (-this.field_C.field_y + this.field_w); this.field_J * 2 < var7; var7 = var7 - 2 * this.field_J) {
            }
            param2.d(-var7, 0);
            param2.d(this.field_J * 2 - var7, 0);
            this.field_C.c(0, 0);
            cl.d((byte) -85);
            this.field_F.d(var5_int - this.field_C.field_y, param3);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_18_0 = var5;
          stackIn_18_1 = new StringBuilder().append("hd.F(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_19_2 = "null";
          } else {
            stackIn_19_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_18_0), ((StringBuilder) (Object) stackIn_18_1).append(stackIn_19_2).append(',').append(param3).append(')').toString());
        }
    }

    private hd(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8) {
        this.field_A = param6;
        this.field_G = param7;
        this.field_N = param5;
        this.field_K = param8;
        this.field_J = param4;
        this.a(param1, param3, param0, 16535, param2);
    }

    static {
        field_O = "Fire";
        field_L = "End Game";
    }
}
