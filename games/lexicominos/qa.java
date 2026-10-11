/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qa {
    static String field_b;
    private int[] field_a;
    static la field_c;

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 < 42) {
          qa.a(101);
        }
    }

    final static void b(int param0) {
        wb.field_g = null;
        af.field_a = null;
        if (param0 != 0) {
          qa.b(-30);
        }
    }

    final int a(int param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
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
        var11 = Lexicominos.field_L ? 1 : 0;
        try {
          if (~param0 == param1) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          param0 = param0 + param3;
          var8 = param4;
          L2: while (true) {
            var9 = param2[var8];
            if (var9 < 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$0 = this.field_a[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param3;
              param3++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param3 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 64) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$2 = this.field_a[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param3;
              param3++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param0 <= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$4 = this.field_a[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (dupTemp$4 < 0) {
              incrementValue$5 = param3;
              param3++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param3 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_a[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param3;
              param3++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param3 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_a[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param3;
              param3++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param0 <= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_a[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param3;
              param3++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 <= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 2)) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            dupTemp$12 = this.field_a[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              incrementValue$13 = param3;
              param3++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param0 <= param3) {
                return var8 - (-1 + param4);
              }
              var7_int = 0;
            }
            if ((var9 & 1) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_a[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param3;
              param3++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param3 >= param0) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_66_0 = var8 - (-1 + param4);
          return stackIn_66_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_69_0 = var7;
          stackIn_69_1 = new StringBuilder().append("qa.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_70_2 = "null";
          } else {
            stackIn_70_2 = "{...}";
          }
          stackIn_72_1 = ((StringBuilder) (Object) stackIn_69_1).append(stackIn_70_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_69_0), ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(')').toString());
        }
    }

    private qa() throws Throwable {
        throw new Error();
    }

    static {
        field_b = "Unpacking animations";
    }
}
