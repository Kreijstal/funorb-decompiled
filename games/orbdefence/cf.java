/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class cf {
    static int field_c;
    static int[] field_b;
    static String field_g;
    private int[] field_f;
    static eb field_a;
    static int field_d;
    static int[] field_e;

    public static void a(int param0) {
        field_g = null;
        field_a = null;
        if (param0 == 0) {
          field_b = null;
          field_e = null;
          return;
        }
        field_a = (eb) null;
        field_b = null;
        field_e = null;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = OrbDefence.field_D ? 1 : 0;
        try {
          if (!ml.b(-107)) {
            if (mg.field_k != null &&
              mg.field_k.field_e) {
              lb.a(true);
              b.field_n.b((byte) 74, (pj) (new gg(b.field_n, hh.field_d)));
            }
            return;
          }
          b.field_n.a(em.field_q, false, true, lc.field_t);
          b.field_n.o(117);
          var1_int = 17 % ((param0 - 53) / 47);
          while (nf.e(32722)) {
            b.field_n.a(od.field_k, true, ob.field_K);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var1), "cf.B(" + param0 + ')');
        }
    }

    private cf() throws Throwable {
        throw new Error();
    }

    final int a(int param0, byte[] param1, int param2, int param3, byte[] param4, int param5) {
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
        int stackIn_68_0 = 0;
        RuntimeException stackIn_71_0 = null;
        StringBuilder stackIn_71_1 = null;
        String stackIn_72_2 = null;
        StringBuilder stackIn_74_1 = null;
        String stackIn_75_2 = null;
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
        var11 = OrbDefence.field_D ? 1 : 0;
        try {
          if (0 == param5) {
            stackIn_4_0 = 0;
            return stackIn_4_0;
          }
          var7_int = 0;
          if (param2 != -1) {
            field_e = (int[]) null;
          }
          param5 = param5 + param3;
          var8 = param0;
          L3: while (true) {
            var9 = param4[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$0 = this.field_f[var7_int];
            var10 = dupTemp$0;
            if (dupTemp$0 < 0) {
              incrementValue$1 = param3;
              param3++;
              param1[incrementValue$1] = (byte)(~var10);
              if (param3 >= param5) {
                break L3;
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
              incrementValue$3 = param3;
              param3++;
              param1[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param5 <= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 32) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$4 = this.field_f[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param3;
              param3++;
              param1[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param5 <= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((16 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$6 = this.field_f[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param3;
              param3++;
              param1[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param5 <= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if ((var9 & 8) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_f[var7_int];
            }
            dupTemp$8 = this.field_f[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param3;
              param3++;
              param1[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param5 <= param3) {
                break L3;
              }
              var7_int = 0;
            }
            if (0 != (4 & var9)) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$10 = this.field_f[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param3;
              param3++;
              param1[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param5 <= param3) {
                return 1 + var8 - param0;
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
            if (0 > dupTemp$12) {
              incrementValue$13 = param3;
              param3++;
              param1[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param3 >= param5) {
                break L3;
              }
              var7_int = 0;
            }
            if ((1 & var9) != 0) {
              var7_int = this.field_f[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$14 = this.field_f[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param3;
              param3++;
              param1[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param5 <= param3) {
                break L3;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_68_0 = 1 + var8 - param0;
          return stackIn_68_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_71_0 = var7;
          stackIn_71_1 = new StringBuilder().append("cf.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_72_2 = "null";
          } else {
            stackIn_72_2 = "{...}";
          }
          stackIn_74_1 = ((StringBuilder) (Object) stackIn_71_1).append(stackIn_72_2).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_75_2 = "null";
          } else {
            stackIn_75_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_71_0), ((StringBuilder) (Object) stackIn_74_1).append(stackIn_75_2).append(',').append(param5).append(')').toString());
        }
    }

    static {
        field_b = new int[8192];
        field_g = "TIME";
        field_e = new int[8192];
    }
}
