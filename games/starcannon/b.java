/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class b {
    static int[] field_c;
    static String field_d;
    static String field_a;
    private int[] field_b;
    static String field_e;

    final int a(byte param0, byte[] param1, int param2, byte[] param3, int param4, int param5) {
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
        int stackIn_66_0 = 0;
        RuntimeException stackIn_69_0 = null;
        StringBuilder stackIn_69_1 = null;
        String stackIn_70_2 = null;
        StringBuilder stackIn_72_1 = null;
        String stackIn_73_2 = null;
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
        var11 = StarCannon.field_A;
        try {
          if (param2 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (param0 < 22) {
            stackIn_7_0 = -63;
            return stackIn_7_0;
          }
          param2 = param2 + param5;
          var7_int = 0;
          var8 = param4;
          L2: while (true) {
            var9 = param1[var8];
            if (var9 < 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_b[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param5;
              param5++;
              param3[incrementValue$1] = (byte)(~var10);
              if (param5 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$2 = this.field_b[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param5;
              param5++;
              param3[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param2 <= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$4 = this.field_b[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param5;
              param5++;
              param3[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param5 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((16 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$6 = this.field_b[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param5;
              param5++;
              param3[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param2 <= param5) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 8)) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$8 = this.field_b[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param5;
              param5++;
              param3[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param5 >= param2) {
                return 1 + (var8 - param4);
              }
              var7_int = 0;
            }
            if (0 == (var9 & 4)) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$10 = this.field_b[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param5;
              param5++;
              param3[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param5 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$12 = this.field_b[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param5;
              param5++;
              param3[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param5 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_b[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param5;
              param5++;
              param3[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param5 >= param2) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = 1 + (var8 - param4);
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("b.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        if (!param0) {
          b.a(true);
        }
        field_c = null;
        field_a = null;
        field_e = null;
        field_d = null;
    }

    final static ue a(boolean param0, int param1) {
        if (param0) {
          b.a(true);
        }
        return ri.a(true, false, 1, param1, false, true);
    }

    private b() throws Throwable {
        throw new Error();
    }

    final static sk a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        String[] var3 = null;
        String[] var4 = null;
        int var5 = 0;
        String var6 = null;
        sk var7 = null;
        int var8 = 0;
        sk stackIn_3_0 = null;
        sk stackIn_7_0 = null;
        sk stackIn_10_0 = null;
        sk stackIn_15_0 = null;
        sk stackIn_20_0 = null;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        RuntimeException decompiledCaughtException = null;
        var8 = StarCannon.field_A;
        try {
          var2_int = param0.length();
          if (var2_int == 0) {
            stackIn_3_0 = qb.field_b;
            return stackIn_3_0;
          }
          if (var2_int > 255) {
            stackIn_7_0 = ai.field_a;
            return stackIn_7_0;
          }
          var3 = uj.a(-29, '.', param0);
          if (var3.length < 2) {
            stackIn_10_0 = qb.field_b;
            return stackIn_10_0;
          }
          var4 = var3;
          var5 = 0;
          while (true) {
            if (var5 >= var4.length) {
              if (param1 < 108) {
                field_d = (String) null;
              }
              stackIn_20_0 = vf.a(var3[-1 + var3.length], (byte) -18);
              return stackIn_20_0;
            }
            var6 = var4[var5];
            var7 = ad.a(-127, var6);
            if (var7 == null) {
              var5++;
              continue;
            }
            break;
          }
          stackIn_15_0 = var7;
          return stackIn_15_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_23_0 = var2;
          stackIn_23_1 = new StringBuilder().append("b.D(");
          if (param0 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          throw sd.a((Throwable) ((Object) stackIn_23_0), ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_c = new int[8];
        field_d = "HELIX POWER:";
        field_a = "No highscores";
    }
}
