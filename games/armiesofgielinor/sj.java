/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class sj {
    private int field_c;
    static wj field_a;
    int field_h;
    static String field_b;
    private int[] field_f;
    static String field_g;
    private boolean field_i;
    static int field_e;
    static int field_d;

    final void a(int param0, int param1, byte param2) {
        int var4;
        int var5;
        int var6;
        int var7;
        int var11;
        int var12;
        int var13;
        int var14;
        int var8;
        int var9;
        int var10;
        var14 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        if (!this.field_i) {
          vg.field_q[0].g(param1, param0);
        } else {
          var4 = 0;
          var5 = SoftwareRaster.field_l * param0 + param1;
          var6 = SoftwareRaster.field_l - cm.field_b;
          var12 = 0;
          while (ac.field_m > var12) {
            var13 = 0;
            while (var13 < cm.field_b) {
              var7 = vg.field_q[0].field_B[var4];
              var11 = var7 >>> 24;
              if (0 != var11) {
                if (var11 >= 255) {
                  if (this.field_f[var4] <= this.field_h) {
                    var7 = vg.field_q[1].field_B[var4];
                  }
                  SoftwareRaster.field_d[var5] = var7;
                } else {
                  if (this.field_h >= this.field_f[var4]) {
                    var7 = vg.field_q[1].field_B[var4];
                    var11 = var7 >>> 24;
                  }
                  var8 = 16711935 & var7;
                  var9 = var7 & 65280;
                  var7 = 256 - var11;
                  var8 = var8 * var7;
                  var9 = var9 * var7;
                  var7 = SoftwareRaster.field_d[var5];
                  var10 = var7 & 16711935;
                  var10 = var10 * var11;
                  var9 = var9 + var9;
                  var8 = var8 + var10;
                  var8 = var8 & -16711936;
                  var9 = var9 & 16711680;
                  SoftwareRaster.field_d[var5] = oe.c(var9, var8) >>> 8;
                }
              }
              var4++;
              var13++;
              var5++;
            }
            var12++;
            var5 = var5 + var6;
          }
        }
        DeployEvent.field_z.b(384, 2464, param1 + (cm.field_b >> 1) << 4, param0 + (ac.field_m >> 1) << 4, this.field_h * 65535 / this.field_c, 1024);
        if (param2 == 121) {
          return;
        }
        this.a(false, -122, (byte) -12);
    }

    final void a(boolean param0, int param1, byte param2) {
        int var5 = 0;
        int var6 = 0;
        if (param1 < 0) {
          this.field_h = 0;
          this.field_i = true;
          return;
        }
        if (param1 > this.field_h) {
          param1 = param1 - this.field_c;
        }
        int var4 = 23 % ((param2 - 82) / 42);
        if (this.field_h > param1) {
          var5 = -param1 + this.field_h;
          var6 = tp.b(-84) * 2;
          this.field_h = this.field_h - (var6 <= var5 ? var6 : var5);
        }
        if (0 > this.field_h) {
          this.field_i = param0 ? true : false;
          this.field_h = this.field_h + this.field_c;
        }
    }

    final static int a(int param0, int param1, byte param2, int param3, int param4, int param5, int param6, int param7, int param8, CipherPacketBuffer param9) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          var10_int = 111 / ((25 - param2) / 56);
          var10_intLifetime1 = param9.g(-108, 2);
          if (0 == var10_intLifetime1) {
            if (param8 == 0) {
              stackIn_4_0 = 0;
            } else {
              stackIn_4_0 = UnitSpell.a(param9, param8, 1);
            }
            return stackIn_4_0;
          }
          if (1 == var10_intLifetime1) {
            if (0 != param7) {
              stackIn_9_0 = UnitSpell.a(param9, param7, 1);
            } else {
              stackIn_9_0 = 0;
            }
            var11 = stackIn_9_0;
            var12 = param6;
            if (var11 >= 0) {
              stackIn_12_0 = var11 + var12;
            } else {
              stackIn_12_0 = -var12 + var11;
            }
            return stackIn_12_0;
          }
          if (var10_intLifetime1 == 2) {
            if (param4 != 0) {
              stackIn_26_0 = UnitSpell.a(param9, param4, 1);
            } else {
              stackIn_26_0 = 0;
            }
            var11Lifetime1 = stackIn_26_0;
            var12Lifetime1 = param5 + param6;
            if (0 > var11Lifetime1) {
              stackIn_29_0 = var11Lifetime1 - var12Lifetime1;
            } else {
              stackIn_29_0 = var12Lifetime1 + var11Lifetime1;
            }
            return stackIn_29_0;
          }
          if (3 != var10_intLifetime1) {
            throw new IllegalStateException();
          }
          if (0 == param3) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = UnitSpell.a(param9, param3, 1);
          }
          var11Lifetime2 = stackIn_18_0;
          var12Lifetime2 = param5 + param1 + param6;
          if (var11Lifetime2 < 0) {
            stackIn_21_0 = -var12Lifetime2 + var11Lifetime2;
          } else {
            stackIn_21_0 = var11Lifetime2 + var12Lifetime2;
          }
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_32_0 = var10;
          stackIn_32_1 = new StringBuilder().append("sj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }

    final static void a(int param0, p param1) {
        int var3 = 0;
        sn[] array$0 = null;
        int var4 = 0;
        sn var5 = null;
        int var6 = ArmiesOfGielinor.obfuscationControl ? 1 : 0;
        try {
          wh.field_f = false;
          td.field_d = new sn[cr.field_W.length][];
          int var2_int = 93 / ((27 - param0) / 62);
          for (var3 = 0; cr.field_W.length > var3; var3++) {
            array$0 = new sn[cr.field_W[var3].length];
            td.field_d[var3] = array$0;
            for (var4 = 0; cr.field_W[var3].length > var4; var4++) {
              var5 = param1.a(cr.field_W[var3][var4], (byte) -97, "");
              if (var5 == null) {
                var5 = param1.a((byte) -127, "", cr.field_W[var3][var4]);
              }
              if (var5 != null) {
              }
              td.field_d[var3][var4] = var5;
            }
          }
          ke.a((byte) 90, param1);
          wh.field_f = true;
        } catch (RuntimeException runtimeException) {
          throw ig.a((Throwable) ((Object) runtimeException), "sj.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_a = null;
        field_g = null;
        if (param0 > -17) {
          field_b = (String) null;
        }
    }

    sj(int param0) {
        int var4 = 0;
        int var2;
        int var3;
        int var5;
        int var6;
        int var7;
        this.field_i = false;
        this.field_c = param0;
        var2 = 2147483647;
        this.field_f = new int[ac.field_m * cm.field_b];
        var3 = -2147483648;
        for (var4 = 0; ac.field_m * cm.field_b > var4; var4++) {
          var5 = var4 % cm.field_b - (cm.field_b >> 1);
          var6 = -(ac.field_m >> 1) + var4 / cm.field_b;
          var7 = (this.field_c - (int)(Math.atan2((double)(-var5), (double)var6) * (double)this.field_c / 3.141592653589793)) / 2;
          if (var3 < var7) {
            var3 = var7;
          }
          this.field_f[var4] = var7;
          if (var7 < var2) {
            var2 = var7;
          }
        }
    }

    static {
        field_g = "You can only use equipment on your turn.";
        field_a = null;
        field_e = -1;
    }

    /* Full JVM integer arguments; original narrow signature preserved. */
    final static int $cfr$intArgs$a$eb6d2a313bbb(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7, int param8, CipherPacketBuffer param9) {
        int stackIn_4_0 = 0;
        int stackIn_9_0 = 0;
        int stackIn_12_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException stackIn_32_0 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var10_int = 0;
        RuntimeException var10 = null;
        int var11 = 0;
        int var12 = 0;
        int var10_intLifetime1;
        int var11Lifetime1;
        int var11Lifetime2;
        int var12Lifetime1;
        int var12Lifetime2;
        try {
          var10_int = 111 / ((25 - param2) / 56);
          var10_intLifetime1 = param9.g(-108, 2);
          if (0 == var10_intLifetime1) {
            if (param8 == 0) {
              stackIn_4_0 = 0;
            } else {
              stackIn_4_0 = UnitSpell.a(param9, param8, 1);
            }
            return stackIn_4_0;
          }
          if (1 == var10_intLifetime1) {
            if (0 != param7) {
              stackIn_9_0 = UnitSpell.a(param9, param7, 1);
            } else {
              stackIn_9_0 = 0;
            }
            var11 = stackIn_9_0;
            var12 = param6;
            if (var11 >= 0) {
              stackIn_12_0 = var11 + var12;
            } else {
              stackIn_12_0 = -var12 + var11;
            }
            return stackIn_12_0;
          }
          if (var10_intLifetime1 == 2) {
            if (param4 != 0) {
              stackIn_26_0 = UnitSpell.a(param9, param4, 1);
            } else {
              stackIn_26_0 = 0;
            }
            var11Lifetime1 = stackIn_26_0;
            var12Lifetime1 = param5 + param6;
            if (0 > var11Lifetime1) {
              stackIn_29_0 = var11Lifetime1 - var12Lifetime1;
            } else {
              stackIn_29_0 = var12Lifetime1 + var11Lifetime1;
            }
            return stackIn_29_0;
          }
          if (3 != var10_intLifetime1) {
            throw new IllegalStateException();
          }
          if (0 == param3) {
            stackIn_18_0 = 0;
          } else {
            stackIn_18_0 = UnitSpell.a(param9, param3, 1);
          }
          var11Lifetime2 = stackIn_18_0;
          var12Lifetime2 = param5 + param1 + param6;
          if (var11Lifetime2 < 0) {
            stackIn_21_0 = -var12Lifetime2 + var11Lifetime2;
          } else {
            stackIn_21_0 = var11Lifetime2 + var12Lifetime2;
          }
          return stackIn_21_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var10 = decompiledCaughtException;
          stackIn_32_0 = var10;
          stackIn_32_1 = new StringBuilder().append("sj.D(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          throw ig.a((Throwable) ((Object) stackIn_32_0), ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(')').toString());
        }
    }
}
