/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    private int[] field_c;
    static SpriteOffset field_b;
    static int field_a;

    final int a(byte[] param0, boolean param1, int param2, int param3, int param4, byte[] param5) {
        String stackIn_69_2 = null;
        String stackIn_72_2 = null;
        int var11 = EscapeVector.obfuscationControl;
        try {
          if (param4 == 0) {
            int stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          int var7_int = 0;
          if (!param1) {
            int stackIn_7_0 = 81;
            return stackIn_7_0;
          }
          param4 = param4 + param2;
          int var8 = param3;
          scanLoop1: while (true) {
            int var9 = param5[var8];
            if (0 > var9) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            int dupTemp$0 = this.field_c[var7_int];
            int var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              int incrementValue$1 = param2;
              param2++;
              param0[incrementValue$1] = (byte)(~var10);
              if (param2 >= param4) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((64 & var9) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            int dupTemp$2 = this.field_c[var7_int];
            int var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              int incrementValue$3 = param2;
              param2++;
              param0[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param4 <= param2) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 == (var9 & 32)) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            int dupTemp$4 = this.field_c[var7_int];
            int var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              int incrementValue$5 = param2;
              param2++;
              param0[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param2 >= param4) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 16) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_c[var7_int];
            }
            int dupTemp$6 = this.field_c[var7_int];
            int var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              int incrementValue$7 = param2;
              param2++;
              param0[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param4 <= param2) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            int dupTemp$8 = this.field_c[var7_int];
            int var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              int incrementValue$9 = param2;
              param2++;
              param0[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param4 <= param2) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if ((var9 & 4) != 0) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            int dupTemp$10 = this.field_c[var7_int];
            int var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              int incrementValue$11 = param2;
              param2++;
              param0[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param2 >= param4) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            if (0 != (2 & var9)) {
              var7_int = this.field_c[var7_int];
            } else {
              var7_int++;
            }
            int dupTemp$12 = this.field_c[var7_int];
            int var10Lifetime6 = dupTemp$12;
            if (dupTemp$12 < 0) {
              int incrementValue$13 = param2;
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
            int dupTemp$14 = this.field_c[var7_int];
            int var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              int incrementValue$15 = param2;
              param2++;
              param0[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param4 <= param2) {
                break scanLoop1;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          int stackIn_65_0 = -param3 + 1 + var8;
          return stackIn_65_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          RuntimeException decompiledCaughtException = decompiledCaughtParameter0;
          RuntimeException var7 = decompiledCaughtException;
          RuntimeException stackIn_68_0 = var7;
          StringBuilder stackIn_68_1 = new StringBuilder().append("ph.A(");
          if (param0 == null) {
            stackIn_69_2 = "null";
          } else {
            stackIn_69_2 = "{...}";
          }
          StringBuilder stackIn_71_1 = ((StringBuilder) (Object) stackIn_68_1).append(stackIn_69_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          throw MainMenuScreen.wrapClientException((Throwable) ((Object) stackIn_68_0), ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(')').toString());
        }
    }

    final static Sprite[] a(int param0, int param1, int param2, int param3) {
        if (param1 == 1) {
          return ArchiveProvider.a(param2, param3, 1, 1, param0);
        }
        ph.releaseStatics((byte) 124);
        return ArchiveProvider.a(param2, param3, 1, 1, param0);
    }

    private ph() throws Throwable {
        throw new Error();
    }

    public static void releaseStatics(byte guard) {
        if (guard != 106) {
          field_b = (SpriteOffset) null;
          field_b = null;
          return;
        }
        field_b = null;
    }

    static {
        field_b = new SpriteOffset(16, 6);
    }
}
