/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    static int field_d;
    private int[] field_f;
    static int field_e;
    static b field_c;
    static ub field_a;
    static int field_b;

    public static void a(int param0) {
        if (param0 != 8281) {
          return;
        }
        field_a = null;
        field_c = null;
    }

    private rc() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, int param4, byte[] param5) {
        int dupTemp$0 = 0;
        int incrementValue$1 = 0;
        int dupTemp$2 = 0;
        int incrementValue$3 = 0;
        int dupTemp$4 = 0;
        int incrementValue$5 = 0;
        int dupTemp$6 = 0;
        int incrementValue$7 = 0;
        int dupTemp$8 = 0;
        int incrementValue$9 = 0;
        int dupTemp$10 = 0;
        int incrementValue$11 = 0;
        int dupTemp$12 = 0;
        int incrementValue$13 = 0;
        int dupTemp$14 = 0;
        int incrementValue$15 = 0;
        int stackIn_4_0 = 0;
        int stackIn_7_0 = 0;
        int stackIn_67_0 = 0;
        RuntimeException stackIn_70_0 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
        StringBuilder stackIn_73_1 = null;
        String stackIn_74_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var7_int = 0;
        RuntimeException var7 = null;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var10Lifetime1;
        int var10Lifetime2;
        int var10Lifetime3;
        int var10Lifetime4;
        int var10Lifetime5;
        int var10Lifetime6;
        int var10Lifetime7;
        var11 = HostileSpawn.field_I ? 1 : 0;
        try {
          if (0 == param4) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param3 != 17112) {
            stackIn_7_0 = -39;
            return stackIn_7_0;
          }
          param4 = param4 + param0;
          var7_int = 0;
          var8 = param2;
          L2: while (true) {
            var9 = param1[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$0 = this.field_f[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param0;
              param0++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param4 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$2 = this.field_f[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param0;
              param0++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param4 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$4 = this.field_f[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param0;
              param0++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((16 & var9) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_f[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param0;
              param0++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((8 & var9) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_f[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param0;
              param0++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param0 >= param4) {
                return 1 + var8 - param2;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_f[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param0;
              param0++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$12 = this.field_f[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param0;
              param0++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param0 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (1 & var9)) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_f[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (0 > dupTemp$14) {
              incrementValue$15 = param0;
              param0++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 <= param0) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_67_0 = 1 + var8 - param2;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("rc.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var2 = 0;
        int var3 = 0;
        uj var3_ref_uj = null;
        m var4 = null;
        int var4_int = 0;
        Object var5 = null;
        int var6 = 0;
        en var9 = null;
        byte[] var13 = null;
        var6 = HostileSpawn.field_I ? 1 : 0;
        try {
          var9 = sc.field_g;
          var2 = var9.l(32270);
          if (var2 != 0) {
            if (var2 == 1) {
              var3 = var9.d(param0 ^ 8193);
              var4 = (m) (wk.field_g.g(-90));
              while (var4 != null) {
                if (~var3 != ~var4.field_o) {
                  var4 = (m) (wk.field_g.a(12684));
                  continue;
                }
                break;
              }
              if (var4 == null) {
                le.c((byte) 60);
                return;
              }
              var4.b(-80);
            } else {
              ic.a((byte) -119, "A1: " + gf.a((byte) -122), (Throwable) null);
              le.c((byte) 117);
            }
          } else {
            var3_ref_uj = (uj) (ve.field_b.g(param0 ^ -65));
            if (var3_ref_uj == null) {
              le.c((byte) 51);
              return;
            }
            var4_int = var9.l(32270);
            if (var4_int == 0) {
              var5 = null;
            } else {
              var13 = new byte[var4_int];
              var9.a(var4_int, 0, var13, -18181);
            }
            var9.field_i = var9.field_i + 4;
            if (!var9.c((byte) -4)) {
              le.c((byte) 119);
              return;
            }
            var3_ref_uj.field_j = true;
            var3_ref_uj.b(120);
          }
          if (param0 == 2) {
            return;
          }
          field_e = -123;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw wg.a((Throwable) ((Object) var1), "rc.B(" + param0 + ')');
        }
    }

    static {
        field_e = 0;
        field_b = 0;
        field_c = null;
    }
}
