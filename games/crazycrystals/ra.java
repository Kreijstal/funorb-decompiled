/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ra {
    private int[] field_b;
    static fc field_d;
    static String field_a;
    static vc field_c;

    public static void a(boolean param0) {
        field_c = null;
        field_d = null;
        field_a = null;
        if (!param0) {
          field_a = (String) null;
        }
    }

    final int a(byte[] param0, int param1, int param2, int param3, int param4, byte[] param5) {
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
        var11 = CrazyCrystals.field_B;
        try {
          if (~param3 == param2) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var7_int = 0;
          param3 = param3 + param1;
          var8 = param4;
          L2: while (true) {
            var9 = param0[var8];
            if (0 > var9) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_b[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param1;
              param1++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param3 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 64) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$2 = this.field_b[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param1;
              param1++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$4 = this.field_b[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param1;
              param1++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param1 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_b[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param1;
              param1++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param1 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (8 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$8 = this.field_b[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param1;
              param1++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param1 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 4) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$10 = this.field_b[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param1;
              param1++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param3 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 2) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_b[var7_int];
            }
            dupTemp$12 = this.field_b[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param1;
              param1++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param3 <= param1) {
                return -param4 + var8 + 1;
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_b[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_b[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param1;
              param1++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param3 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_64_0 = -param4 + var8 + 1;
          return stackIn_64_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_67_0 = var7;
          stackIn_67_1 = new StringBuilder().append("ra.B(");
          if (param0 == null) {
            stackIn_68_2 = "null";
          } else {
            stackIn_68_2 = "{...}";
          }
          stackIn_70_1 = ((StringBuilder) (Object) stackIn_67_1).append(stackIn_68_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          throw dn.a((Throwable) ((Object) stackIn_67_0), ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(')').toString());
        }
    }

    private ra() throws Throwable {
        throw new Error();
    }

    static {
        field_d = new fc(16);
        field_a = "Last Bomb";
    }
}
