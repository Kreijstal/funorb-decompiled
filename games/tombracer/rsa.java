/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rsa extends osa {
    private int field_v;
    static String field_x;
    static boolean field_s;
    static String field_z;
    static String field_u;
    private int field_w;
    private int field_y;
    private int field_t;

    final int a(int param0, int param1) {
        if (param0 != 0) {
          return -51;
        }
        return param1;
    }

    final void b(byte param0) {
        int var2 = -27 / ((param0 + 69) / 42);
    }

    private final void k(byte param0) {
        if (this.field_v % 2 != 1) {
          this.field_v = this.field_v + 1;
        }
        if (this.field_w % 2 != 1) {
          this.field_w = this.field_w + 1;
        }
        if (param0 > -22) {
          fsa var3 = (fsa) null;
          this.a(-103, (fsa) null);
        }
    }

    final void a(int param0, fsa param1) {
        if (param0 <= 35) {
          return;
        }
        try {
          super.a(68, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rsa.F(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final void a(kh param0, byte param1) {
        try {
          super.a(param0, (byte) -123);
          param0.a((byte) -128, this.field_t >> 16, 10);
          param0.a((byte) -128, this.field_y >> 16, 10);
          param0.a((byte) -127, this.field_v, 7);
          param0.a((byte) -127, this.field_w, 7);
          if (param1 >= -78) {
            kh var4 = (kh) null;
            this.a((kh) null, (byte) -48);
          }
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rsa.R(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    rsa(la param0, kh param1, boolean param2) {
        super(param0, param1, param2);
        try {
          this.field_t = param1.b((byte) 44, 10) << 16;
          this.field_y = param1.b((byte) 44, 10) << 16;
          this.field_v = param1.b((byte) 44, 7);
          this.field_w = param1.b((byte) 44, 7);
          this.k((byte) -56);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rsa.<init>(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final void b(int param0) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var8;
        int var9;
        int var10;
        int var11;
        int var12;
        int var13;
        var13 = TombRacer.field_G ? 1 : 0;
        var2 = this.field_n.s(25745) - this.f(10);
        var3 = this.field_n.e(false) - this.g((byte) 30);
        if (var2 == 0 &&
          0 == var3) {
          return;
        }
        var4 = 0;
        var5 = 0;
        var6 = this.field_t * (this.field_v - 1) / 2;
        var7 = this.field_y * (-1 + this.field_w) / 2;
        if (param0 != 1) {
          return;
        }
        var8 = 0;
        if (var2 > var6) {
          var4 = -(var2 - var6);
          var8 = 1;
        }
        if (var2 < -var6) {
          var8 = 1;
          var4 = -var6 - var2;
        }
        if (var3 > var7) {
          var5 = -(-var7 + var3);
          var8 = 1;
        }
        if (-var7 > var3) {
          var5 = -var7 - var3;
          var8 = 1;
        }
        boolean decompiledFrameRemainder0 = true;
        if (var8 == 0) {
          if (var2 >= 0) {
            var9 = (this.field_t / 2 + var2) / this.field_t;
          } else {
            var9 = (-(this.field_t / 2) + var2) / this.field_t;
          }
          if (var3 >= 0) {
            var10 = (this.field_y / 2 + var3) / this.field_y;
          } else {
            var10 = (var3 - this.field_y / 2) / this.field_y;
          }
          var11 = -var2 + this.field_t * var9;
          var12 = -var3 + this.field_y * var10;
          if (0 != var11) {
            if (var12 == 0) {
              this.field_n.a((byte) -31, var4, var5);
              decompiledFrameRemainder0 = false;
            }
            else {
              if (ua.a(var11, param0 + 104) <= ua.a(var12, -104)) {
                var4 = var11;
              } else {
                var5 = var12;
              }
            }
          }
        }
        if (decompiledFrameRemainder0) {
          this.field_n.a((byte) -31, var4, var5);
        }

    }

    final static void a(int param0, iu[] param1, int param2, int param3, int param4, int param5) {
        int var21 = 0;
        int stackIn_10_0 = 0;
        int stackIn_13_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_72_0 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
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
        int var22 = 0;
        int var20Lifetime1;
        int var20Lifetime2;
        int var20Lifetime3;
        int var20Lifetime4;
        var22 = TombRacer.field_G ? 1 : 0;
        try {
          if (param1 == null) {
            return;
          }
          if (param4 > 0 &&
            param0 > 0) {
            if (param1[3] != null) {
              stackIn_10_0 = param1[3].field_n;
            } else {
              stackIn_10_0 = 0;
            }
            var6_int = stackIn_10_0;
            if (param1[5] == null) {
              stackIn_13_0 = 0;
            } else {
              stackIn_13_0 = param1[5].field_n;
            }
            var7 = stackIn_13_0;
            if (param1[1] == null) {
              stackIn_16_0 = 0;
            } else {
              stackIn_16_0 = param1[1].field_k;
            }
            var8 = stackIn_16_0;
            if (param1[7] == null) {
              stackIn_19_0 = 0;
            } else {
              stackIn_19_0 = param1[7].field_k;
            }
            var9 = stackIn_19_0;
            var10 = param4 + param5;
            var11 = param0 + param2;
            var12 = param5 + var6_int;
            var13 = -var7 + var10;
            var14 = param2 + var8;
            var15 = -var9 + var11;
            var16 = var12;
            var17 = var13;
            if (var17 < var16) {
              var17 = param5 + param4 * var6_int / (var7 + var6_int);
              var16 = param5 + param4 * var6_int / (var7 + var6_int);
            }
            var18 = var14;
            var19 = var15;
            bea.b(bba.field_a);
            if (var18 > var19) {
              var19 = var8 * param0 / (var9 + var8) + param2;
              var18 = var8 * param0 / (var9 + var8) + param2;
            }
            if (param1[0] != null) {
              bea.g(param5, param2, var16, var18);
              param1[0].b(param5, param2);
              bea.a(bba.field_a);
            }
            if (null != param1[2]) {
              bea.g(var17, param2, var10, var18);
              param1[2].b(var13, param2);
              bea.a(bba.field_a);
            }
            if (param1[6] != null) {
              bea.g(param5, var19, var16, var11);
              param1[6].b(param5, var15);
              bea.a(bba.field_a);
            }
            if (param1[8] != null) {
              bea.g(var17, var19, var10, var11);
              param1[8].b(var13, var15);
              bea.a(bba.field_a);
            }
            if (param3 > -116) {
              return;
            }
            if (null != param1[1] &&
              param1[1].field_n != 0) {
              bea.g(var16, param2, var17, var18);
              for (var20 = var12; var13 > var20; var20 = var20 + param1[1].field_n) {
                param1[1].b(var20, param2);
              }
              bea.a(bba.field_a);
            }
            if (param1[7] != null &&
              param1[7].field_n != 0) {
              bea.g(var16, var19, var17, var11);
              for (var20Lifetime1 = var12; var20Lifetime1 < var13; var20Lifetime1 = var20Lifetime1 + param1[7].field_n) {
                param1[7].b(var20Lifetime1, var15);
              }
              bea.a(bba.field_a);
            }
            if (param1[3] != null &&
              param1[3].field_k != 0) {
              bea.g(param5, var18, var16, var19);
              for (var20Lifetime2 = var14; var20Lifetime2 < var15; var20Lifetime2 = var20Lifetime2 + param1[3].field_k) {
                param1[3].b(param5, var20Lifetime2);
              }
              bea.a(bba.field_a);
            }
            if (param1[5] != null &&
              param1[5].field_k != 0) {
              bea.g(var17, var18, var10, var19);
              for (var20Lifetime3 = var14; var15 > var20Lifetime3; var20Lifetime3 = var20Lifetime3 + param1[5].field_k) {
                param1[5].b(var13, var20Lifetime3);
              }
              bea.a(bba.field_a);
            }
            if (null != param1[4] &&
              0 != param1[4].field_n &&
              0 != param1[4].field_k) {
              bea.g(var16, var18, var17, var19);
              for (var20Lifetime4 = var14; var15 > var20Lifetime4; var20Lifetime4 = var20Lifetime4 + param1[4].field_k) {
                for (var21 = var12; var13 > var21; var21 = var21 + param1[4].field_n) {
                  param1[4].b(var21, var20Lifetime4);
                }
              }
              bea.a(bba.field_a);
              return;
            }
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var6 = decompiledCaughtException;
          stackIn_72_0 = var6;
          stackIn_72_1 = new StringBuilder().append("rsa.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw tba.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void j(byte param0) {
        field_x = null;
        if (param0 <= 105) {
          return;
        }
        field_z = null;
        field_u = null;
    }

    final int c(int param0) {
        if (param0 != 1) {
          kh var3 = (kh) null;
          this.a((kh) null, (byte) 14);
        }
        return 12;
    }

    static {
        field_z = "Press F10 to open Quick Chat.";
    }
}
