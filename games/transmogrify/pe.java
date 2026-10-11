/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pe {
    private int[] field_c;
    static String field_a;
    static int[] field_b;

    final static hh a(byte param0, ci param1, int param2, ci param3, int param4) {
        RuntimeException var5 = null;
        hh stackIn_2_0 = null;
        Object stackIn_5_0 = null;
        hh stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -66) {
            stackIn_2_0 = (hh) null;
            return stackIn_2_0;
          }
          if (rl.a(param4, 0, param2, param1)) {
            stackIn_7_0 = ak.a(param3.a((byte) -93, param4, param2), 21725);
            return stackIn_7_0;
          }
          stackIn_5_0 = null;
          return (hh) (stackIn_5_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_10_0 = var5;
          stackIn_10_1 = new StringBuilder().append("pe.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',').append(param4).append(')').toString());
        }
    }

    final static void a(int param0, int[] param1, int param2, byte param3, int param4) {
        int var8 = 0;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        int[] var5 = null;
        RuntimeException var5_ref = null;
        int var6 = 0;
        int var7 = 0;
        int[] var9 = null;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param3 < 92) {
            field_b = (int[]) null;
          }
          param0--;
          while (param0 >= 0) {
            var9 = param1;
            var5 = var9;
            var6 = param2;
            var7 = param4;
            var9[var6] = (vg.c(var9[var6], 16711422) >> 1) + var7;
            param2++;
            param0--;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_10_0 = var5_ref;
          stackIn_10_1 = new StringBuilder().append("pe.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(')').toString());
        }
    }

    final int a(int param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_3_0 = 0;
        int stackIn_64_0 = 0;
        RuntimeException stackIn_67_0 = null;
        StringBuilder stackIn_67_1 = null;
        String stackIn_68_2 = null;
        StringBuilder stackIn_70_1 = null;
        String stackIn_71_2 = null;
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
        var11 = Transmogrify.field_A ? 1 : 0;
        try {
          if (param0 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          param0 = param0 + param2;
          var7_int = param4;
          var8 = param5;
          L2: while (true) {
            var9 = param3[var8];
            if (var9 < 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param2;
              param2++;
              param1[incrementValue$1] = (byte)(~var10);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 64) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param1[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param2;
              param2++;
              param1[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$6 = this.field_c[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param2;
              param2++;
              param1[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 >= param0) {
                return -param5 + var8 + 1;
              }
              var7_int = 0;
            }
            if (0 == (8 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param1[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param2 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param1[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 2)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param1[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param0 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_c[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param2;
              param2++;
              param1[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param2 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_64_0 = -param5 + var8 + 1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("pe.E(").append(param0).append(',');
          if (param1 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    final static int a(int param0, int param1) {
        param1 = param1 & 8191;
        if (param0 <= param1) {
          return param1 >= 6144 ? -nj.field_r[-param1 + 8192] : -nj.field_r[param1 - 4096];
        }
        return param1 < 2048 ? nj.field_r[param1] : nj.field_r[-param1 + 4096];
    }

    public static void a(byte param0) {
        field_a = null;
        field_b = null;
        int var1 = -82 % ((49 - param0) / 47);
    }

    private pe() throws Throwable {
        throw new Error();
    }

    static {
        field_a = "Try again";
    }
}
