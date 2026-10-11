/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private int[] field_c;
    static fn field_b;
    static int field_a;

    final int a(byte[] param0, boolean param1, int param2, int param3, int param4, byte[] param5) {
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
        int stackIn_65_0 = 0;
        RuntimeException stackIn_68_0 = null;
        StringBuilder stackIn_68_1 = null;
        String stackIn_69_2 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
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
        var11 = EscapeVector.field_A;
        try {
          if (param4 == 0) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var7_int = 0;
          if (!param1) {
            stackIn_7_0 = 81;
            return stackIn_7_0;
          }
          param4 = param4 + param2;
          var8 = param3;
          L2: while (true) {
            var9 = param5[var8];
            if (0 > var9) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_c[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param2;
              param2++;
              param0[incrementValue$1] = (byte)(~var10);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if ((64 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_c[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param2;
              param2++;
              param0[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 32)) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            dupTemp$4 = this.field_c[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param2;
              param2++;
              param0[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param4) {
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
              param0[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_c[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param2;
              param2++;
              param0[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_c[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param2;
              param2++;
              param0[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 >= param4) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (2 & var9)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$12 = this.field_c[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param2;
              param2++;
              param0[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param2 >= param4) {
                return -param3 + 1 + var8;
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
              param0[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 <= param2) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_65_0 = -param3 + 1 + var8;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_68_0 = var7;
          stackIn_68_1 = new StringBuilder().append("ph.A(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw t.a((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static ed[] a(int param0, int param1, int param2, int param3) {
        if (param1 == 1) {
          return ob.a(param2, param3, 1, 1, param0);
        }
        ph.a((byte) 124);
        return ob.a(param2, param3, 1, 1, param0);
    }

    private ph() throws Throwable {
        throw new Error();
    }

    public static void a(byte param0) {
        if (param0 != 106) {
          field_b = (fn) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = new fn(16, 6);
    }
}
