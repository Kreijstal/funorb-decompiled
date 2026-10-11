/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class dm {
    ed[] field_c;
    static hj[] field_b;
    static int[] field_g;
    static int field_a;
    static int field_e;
    static int field_f;
    static char[] field_d;

    final int a(int param0, byte param1) {
        int var3 = 0;
        ed var4 = null;
        int var5 = OrbDefence.field_D ? 1 : 0;
        if (param1 != 107) {
          dm.a(43, -63, -39);
        }
        for (var3 = 0; this.field_c.length > var3; var3++) {
          var4 = this.field_c[var3];
          if (!(var4.field_g.length <= param0)) {
            return var3;
          }
          param0 = param0 - (var4.field_g.length - 1);
        }
        return this.field_c.length;
    }

    final static void a(int param0, int param1, int param2) {
        if (param0 != 1) {
          dm.a(-96, -106, true, 45, 11, -128, -46);
        }
        lm.field_a = param2;
        kf.field_e = param1;
    }

    final int b(int param0) {
        int stackIn_6_0 = 0;
        if (param0 <= 105) {
          dm.a(-11, -7, false, 50, 72, -55, -61);
        }
        if (null != this.field_c &&
          0 < this.field_c.length) {
          stackIn_6_0 = -this.field_c[0].field_f + this.field_c[-1 + this.field_c.length].field_c;
        } else {
          stackIn_6_0 = 0;
        }
        return stackIn_6_0;
    }

    final int a(int param0, int param1) {
        ed var5 = null;
        int var6 = OrbDefence.field_D ? 1 : 0;
        ed[] var3 = this.field_c;
        int var4 = 0;
        if (param0 > -68) {
          dm.a(-22);
        }
        while (var4 < var3.length) {
          var5 = var3[var4];
          if (var5.field_g.length > param1) {
            return var5.field_g[param1];
          }
          param1 = param1 - (-1 + var5.field_g.length);
          var4++;
        }
        return 0;
    }

    final int a(int param0, int param1, byte param2) {
        int var5 = 0;
        int var4;
        ed var6_ref_ed;
        int var6;
        int var7;
        int var8;
        var8 = OrbDefence.field_D ? 1 : 0;
        if (this.field_c != null &&
          this.field_c.length != 0 &&
          this.field_c[0].field_f <= param0) {
          if (this.field_c[-1 + this.field_c.length].field_c < param0) {
            return -1;
          }
          if (this.field_c.length == 1) {
            return this.field_c[0].a(param1, -1052047551);
          }
          var4 = 0;
          for (var5 = 0; var5 < this.field_c.length; var5++) {
            var6_ref_ed = this.field_c[var5];
            if (param0 >= var6_ref_ed.field_f &&
              var6_ref_ed.field_c >= param0) {
              var7 = var6_ref_ed.a(param1, -1052047551);
              if (var7 != -1) {
                return var7 + var4;
              }
              return -1;
            }
            var4 = var4 + (var6_ref_ed.field_g.length - 1);
          }
          var6 = -37 % ((73 - param2) / 44);
          return -1;
        }
        return -1;
    }

    final int a(boolean param0) {
        int var4 = 0;
        int var2;
        ed[] var3;
        ed var5;
        int var7;
        int var6;
        var7 = OrbDefence.field_D ? 1 : 0;
        if (param0) {
          field_a = 108;
        }
        var2 = -1;
        if (null != this.field_c) {
          var3 = this.field_c;
          for (var4 = 0; var4 < var3.length; var4++) {
            var5 = var3[var4];
            if (var5 != null) {
              var6 = var5.a(param0);
              if (var6 > var2) {
                var2 = var6;
              }
            }
          }
        }
        return var2;
    }

    final int a(String param0, int param1, int param2, byte param3) {
        int var8 = 0;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var9 = 0;
        int var10 = 0;
        int stackIn_17_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        RuntimeException decompiledCaughtException = null;
        var10 = OrbDefence.field_D ? 1 : 0;
        try {
          var5_int = 0;
          var6 = 0;
          var7 = param0.length();
          if (param3 != 74) {
            field_b = (hj[]) null;
          }
          for (var8 = 0; var8 < var7; var8++) {
            var9 = param0.charAt(var8);
            if (60 != var9) {
              if (var9 != 62) {
                if (var6 == 0 &&
                  var9 == 32) {
                  var5_int++;
                }
              } else {
                var6 = 0;
              }
            } else {
              var6 = 1;
            }
          }
          if (0 >= var5_int) {
            stackIn_19_0 = 0;
            return stackIn_19_0;
          }
          stackIn_17_0 = (param1 - param2 << 8) / var5_int;
          return stackIn_17_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_22_0 = var5;
          stackIn_22_1 = new StringBuilder().append("dm.A(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static void a(int param0, int param1, boolean param2, int param3, int param4, int param5, int param6) {
        int var12 = 0;
        int incrementValue$0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var7_intLifetime1;
        int var8Lifetime1;
        int var9Lifetime1;
        int var10Lifetime1;
        var15 = OrbDefence.field_D ? 1 : 0;
        try {
          if (param0 <= param5) {
            return;
          }
          if (param5 + 1 >= param4) {
            return;
          }
          if (5 + param5 < param4 &&
            param1 != param3) {
            var7_int = (param1 >> 1) - (-(param3 >> 1) - (1 & (param1 & param3)));
            var8 = param5;
            var9 = param3;
            var10 = param1;
            var11 = -75 % ((-46 - param6) / 49);
            for (var12 = param5; param4 > var12; var12++) {
              var13 = bc.field_o[var12];
              if (!param2) {
                stackIn_23_0 = rh.field_c[var13];
              } else {
                stackIn_23_0 = tl.field_d[var13];
              }
              var14 = stackIn_23_0;
              if (var14 > var7_int) {
                bc.field_o[var12] = bc.field_o[var8];
                if (var14 < var9) {
                  var9 = var14;
                }
                incrementValue$0 = var8;
                var8++;
                bc.field_o[incrementValue$0] = var13;
              } else {
                if (var10 < var14) {
                  var10 = var14;
                }
              }
            }
            dm.a(param0, var9, param2, param3, var8, param5, 28);
            dm.a(param0, param1, param2, var10, param4, var8, 126);
            return;
          }
          for (var7_intLifetime1 = -1 + param4; param5 < var7_intLifetime1; var7_intLifetime1--) {
            for (var8Lifetime1 = param5; var8Lifetime1 < var7_intLifetime1; var8Lifetime1++) {
              var9Lifetime1 = bc.field_o[var8Lifetime1];
              var10Lifetime1 = bc.field_o[1 + var8Lifetime1];
              if (hl.a(param2, -122, var10Lifetime1, var9Lifetime1)) {
                bc.field_o[var8Lifetime1] = var10Lifetime1;
                bc.field_o[1 + var8Lifetime1] = var9Lifetime1;
              }
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var7), "dm.E(" + param0 + ',' + param1 + ',' + param2 + ',' + param3 + ',' + param4 + ',' + param5 + ',' + param6 + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != 0) {
          field_g = (int[]) null;
        }
        field_b = null;
        field_d = null;
        field_g = null;
    }

    static {
        field_d = new char[]{(char)91, (char)93, (char)35};
        field_g = new int[16384];
    }
}
