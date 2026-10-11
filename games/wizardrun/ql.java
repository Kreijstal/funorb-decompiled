/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ql {
    private int[] field_d;
    static String field_a;
    static long[] field_b;
    static int field_c;

    final static void a(int param0, int param1, int param2) {
        int var3 = param0 << param2;
        if (0 != (ti.field_a & var3)) {
          return;
        }
        qf.field_l = qf.field_l | var3;
        ti.field_a = ti.field_a | var3;
        uc.field_b.a(new ra(param2), false);
        if (!tc.field_j) {
          ie.field_l.a(new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
          return;
        }
        if (dd.field_m >= 2) {
          ie.field_l.a(new pg(param2, param1, hi.field_c + qh.field_g, -(64 * sg.field_f) + wg.field_b, field_c + me.field_f, ic.field_a + 6 * qh.field_l), false);
          return;
        }
    }

    final static sf a(String param0, boolean param1) {
        RuntimeException var2 = null;
        sf stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_b = (long[]) null;
          }
          stackIn_3_0 = new sf(param0);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ql.E(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (param0 >= -32) {
          return;
        }
        if (null != jc.field_H) {
          jc.field_H.b((byte) 76);
          jc.field_H = null;
        }
    }

    final static boolean a(boolean param0) {
        if (param0) {
          ql.a(-48, 28, 36);
          if (oa.field_c == null) {
            return false;
          }
          if (oa.field_c.b(0)) {
            return true;
          }
          return false;
        }
        if (oa.field_c == null) {
          return false;
        }
        if (oa.field_c.b(0)) {
          return true;
        }
        return false;
    }

    public static void b(int param0) {
        int var1 = 8 % ((param0 - 73) / 33);
        field_a = null;
        field_b = null;
    }

    final int a(boolean param0, int param1, byte[] param2, int param3, int param4, byte[] param5) {
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
        int stackIn_6_0 = 0;
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
        var11 = wizardrun.field_H;
        try {
          if (param3 == 0) {
            stackIn_3_0 = 0;
            return stackIn_3_0;
          }
          var7_int = 0;
          if (param0) {
            stackIn_6_0 = 107;
            return stackIn_6_0;
          }
          param3 = param3 + param1;
          var8 = param4;
          L2: while (true) {
            var9 = param5[var8];
            if (var9 >= 0) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$0 = this.field_d[var7_int];
            var10 = dupTemp$0;
            if (0 > dupTemp$0) {
              incrementValue$1 = param1;
              param1++;
              param2[incrementValue$1] = (byte)(~var10);
              if (param3 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 != (var9 & 64)) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$2 = this.field_d[var7_int];
            var10Lifetime1 = dupTemp$2;
            if (dupTemp$2 < 0) {
              incrementValue$3 = param1;
              param1++;
              param2[incrementValue$3] = (byte)(~var10Lifetime1);
              if (param1 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((32 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$4 = this.field_d[var7_int];
            var10Lifetime2 = dupTemp$4;
            if (0 > dupTemp$4) {
              incrementValue$5 = param1;
              param1++;
              param2[incrementValue$5] = (byte)(~var10Lifetime2);
              if (param3 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 16) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$6 = this.field_d[var7_int];
            var10Lifetime3 = dupTemp$6;
            if (dupTemp$6 < 0) {
              incrementValue$7 = param1;
              param1++;
              param2[incrementValue$7] = (byte)(~var10Lifetime3);
              if (param1 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((var9 & 8) != 0) {
              var7_int = this.field_d[var7_int];
            } else {
              var7_int++;
            }
            dupTemp$8 = this.field_d[var7_int];
            var10Lifetime4 = dupTemp$8;
            if (dupTemp$8 < 0) {
              incrementValue$9 = param1;
              param1++;
              param2[incrementValue$9] = (byte)(~var10Lifetime4);
              if (param3 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            if (0 == (4 & var9)) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$10 = this.field_d[var7_int];
            var10Lifetime5 = dupTemp$10;
            if (dupTemp$10 < 0) {
              incrementValue$11 = param1;
              param1++;
              param2[incrementValue$11] = (byte)(~var10Lifetime5);
              if (param1 >= param3) {
                break L2;
              }
              var7_int = 0;
            }
            if ((2 & var9) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$12 = this.field_d[var7_int];
            var10Lifetime6 = dupTemp$12;
            if (0 > dupTemp$12) {
              incrementValue$13 = param1;
              param1++;
              param2[incrementValue$13] = (byte)(~var10Lifetime6);
              if (param3 <= param1) {
                return var8 + 1 - param4;
              }
              var7_int = 0;
            }
            if ((var9 & 1) == 0) {
              var7_int++;
            } else {
              var7_int = this.field_d[var7_int];
            }
            dupTemp$14 = this.field_d[var7_int];
            var10Lifetime7 = dupTemp$14;
            if (dupTemp$14 < 0) {
              incrementValue$15 = param1;
              param1++;
              param2[incrementValue$15] = (byte)(~var10Lifetime7);
              if (param3 <= param1) {
                break L2;
              }
              var7_int = 0;
            }
            var8++;
            continue;

          }
          stackIn_67_0 = var8 + 1 - param4;
          return stackIn_67_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_70_0 = var7;
          stackIn_70_1 = new StringBuilder().append("ql.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_71_2 = "null";
          } else {
            stackIn_71_2 = "{...}";
          }
          stackIn_73_1 = ((StringBuilder) (Object) stackIn_70_1).append(stackIn_71_2).append(',').append(param3).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_74_2 = "null";
          } else {
            stackIn_74_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_70_0), ((StringBuilder) (Object) stackIn_73_1).append(stackIn_74_2).append(')').toString());
        }
    }

    private ql() throws Throwable {
        throw new Error();
    }

    static {
        field_b = new long[32];
        field_a = "it with spells to knock";
    }
}
