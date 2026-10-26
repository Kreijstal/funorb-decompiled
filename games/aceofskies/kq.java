/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kq {
    private int[] field_a;
    static PcmSample field_b;

    final int a(int param0, int param1, byte[] param2, boolean param3, int param4, byte[] param5) {
        String stackIn_73_2 = null;
        String stackIn_76_2 = null;
        int var11 = AceOfSkies.obfuscationControl ? 1 : 0;
        try {
          if (param1 == 0) {
            int stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          if (!param3) {
            int stackIn_7_0 = 13;
            return stackIn_7_0;
          }
          param1 = param1 + param0;
          int var7_int = 0;
          int var8 = param4;
          scanLoop1: while (true) {
            int var9 = param2[var8];
            if (0 <= var9) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            int dupTemp$0 = this.field_a[var7_int];
            int var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              int incrementValue$1 = param0;
              param0++;
              param5[incrementValue$1] = (byte)(~var10);
              if (param0 >= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 64)) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            int dupTemp$2 = this.field_a[var7_int];
            int var10Lifetime1 = dupTemp$2;
            if (0 > dupTemp$2) {
              int incrementValue$3 = param0;
              param0++;
              param5[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 <= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            int dupTemp$4 = this.field_a[var7_int];
            int var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              int incrementValue$5 = param0;
              param0++;
              param5[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param1 <= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 16)) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            int dupTemp$6 = this.field_a[var7_int];
            int var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              int incrementValue$7 = param0;
              param0++;
              param5[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param0 >= param1) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 8) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            int dupTemp$8 = this.field_a[var7_int];
            int var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              int incrementValue$9 = param0;
              param0++;
              param5[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param1 <= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((4 & var9) != 0) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            int dupTemp$10 = this.field_a[var7_int];
            int var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              int incrementValue$11 = param0;
              param0++;
              param5[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param0 >= param1) {
                return 1 + var8 - param4;
              }
              var7_int = 0;
            }
            if (0 != (2 & var9)) {
              var7_int = this.field_a[var7_int];
            } else {
              var7_int++;
            }
            int dupTemp$12 = this.field_a[var7_int];
            int var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              int incrementValue$13 = param0;
              param0++;
              param5[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param1 <= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 1)) {
              var7_int++;
            } else {
              var7_int = this.field_a[var7_int];
            }
            int dupTemp$14 = this.field_a[var7_int];
            int var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              int incrementValue$15 = param0;
              param0++;
              param5[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param1 <= param0) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          int stackIn_69_0 = 1 + var8 - param4;
          return stackIn_69_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_72_0 = var7;
          StringBuilder stackIn_72_1 = new StringBuilder().append("kq.B(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_73_2 = "null";
          } else {
            stackIn_73_2 = "{...}";
          }
          StringBuilder stackIn_75_1 = ((StringBuilder) (Object) stackIn_72_1).append(stackIn_73_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_76_2 = "null";
          } else {
            stackIn_76_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_72_0), ((StringBuilder) (Object) stackIn_75_1).append(stackIn_76_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 != 1178) {
          kq.a(-49);
        }
    }

    private kq() throws Throwable {
        throw new Error();
    }

    static {
    }
}
