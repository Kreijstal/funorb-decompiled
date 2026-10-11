/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tn extends gf {
    static String field_m;
    static uh field_l;

    final static void a(int param0, int param1) {
        int var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        int var4Lifetime1;
        int var5Lifetime1;
        int var6Lifetime1;
        int var4Lifetime2;
        int var5Lifetime2;
        int var6Lifetime2;
        int var6Lifetime3;
        var7 = Torquing.field_u;
        var2 = 0;
        var3 = jh.field_z;
        if (var3 < 5) {
          var2 = 8192 * var3 * var3 / 1100;
          var4 = 1;
          var5 = 0;
          if (param1 == 3) {
            var4 = -1;
          }
          if (param1 == 1) {
            var5 = 1;
          }
          if (4 == param1) {
            var4 = 1;
            var5 = 1;
          }
          if (param1 == 5) {
            var4 = -1;
            var5 = 1;
          }
          if (6 == param1) {
            var5 = -1;
            var4 = 1;
          }
          if (param1 == 7) {
            var5 = -1;
            var4 = -1;
            if (param1 == 11) {
              var4 = -1;
            }
            if (12 == param1) {
              var5 = -1;
              var4 = -1;
            }
            var6 = -21 % ((param0 - 17) / 52);
            if (param1 == 13) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 14) {
              var5 = 1;
              var4 = -1;
            }
            if (param1 == 15) {
              var4 = 1;
              var5 = 1;
            }
            mo.field_B = lp.a(var4 * var2, false, var5 * var2);
            return;
          }
          if (param1 != 8) {
            if (param1 == 11) {
              var4 = -1;
            }
            if (12 == param1) {
              var5 = -1;
              var4 = -1;
            }
            var6Lifetime2 = -21 % ((param0 - 17) / 52);
            if (param1 == 13) {
              var4 = 1;
              var5 = -1;
            }
            if (param1 == 14) {
              var5 = 1;
              var4 = -1;
            }
            if (param1 == 15) {
              var4 = 1;
              var5 = 1;
            }
            mo.field_B = lp.a(var4 * var2, false, var5 * var2);
            return;
          }
          var5Lifetime2 = -1;
          var4Lifetime2 = -1;
          if (param1 == 11) {
            var4Lifetime2 = -1;
          }
          if (12 == param1) {
            var5Lifetime2 = -1;
            var4Lifetime2 = -1;
          }
          var6Lifetime3 = -21 % ((param0 - 17) / 52);
          if (param1 == 13) {
            var4Lifetime2 = 1;
            var5Lifetime2 = -1;
          }
          if (param1 == 14) {
            var5Lifetime2 = 1;
            var4Lifetime2 = -1;
          }
          if (param1 == 15) {
            var4Lifetime2 = 1;
            var5Lifetime2 = 1;
          }
          mo.field_B = lp.a(var4Lifetime2 * var2, false, var5Lifetime2 * var2);
          return;
        }
        if (var3 < 105) {
          var2 = (var3 * 16384 - 40960) / 220;
        } else {
          if (var3 < 120) {
            var3 = -var3 + 120;
            var2 = 8192 - 8192 * var3 * var3 / 3300;
          }
        }
        var4Lifetime1 = 1;
        var5Lifetime1 = 0;
        if (param1 == 3) {
          var4Lifetime1 = -1;
        }
        if (param1 == 1) {
          var5Lifetime1 = 1;
        }
        if (4 == param1) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        if (param1 == 5) {
          var4Lifetime1 = -1;
          var5Lifetime1 = 1;
        }
        if (6 == param1) {
          var5Lifetime1 = -1;
          var4Lifetime1 = 1;
        }
        if (param1 == 7) {
          var5Lifetime1 = -1;
          var4Lifetime1 = -1;
        } else {
          if (param1 == 8) {
            var5Lifetime1 = -1;
            var4Lifetime1 = -1;
          }
        }
        if (param1 == 11) {
          var4Lifetime1 = -1;
        }
        if (12 == param1) {
          var5Lifetime1 = -1;
          var4Lifetime1 = -1;
        }
        var6Lifetime1 = -21 % ((param0 - 17) / 52);
        if (param1 == 13) {
          var4Lifetime1 = 1;
          var5Lifetime1 = -1;
        }
        if (param1 == 14) {
          var5Lifetime1 = 1;
          var4Lifetime1 = -1;
        }
        if (param1 == 15) {
          var4Lifetime1 = 1;
          var5Lifetime1 = 1;
        }
        mo.field_B = lp.a(var4Lifetime1 * var2, false, var5Lifetime1 * var2);
    }

    tn(tk param0) {
        super(param0);
    }

    public static void e(int param0) {
        if (param0 != 0) {
          tn.e(-1);
          field_l = null;
          field_m = null;
          return;
        }
        field_l = null;
        field_m = null;
    }

    final cd a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        cd stackIn_6_0 = null;
        cd stackIn_9_0 = null;
        cd stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          stackIn_3_0 = (lg.a(param1, 98) != null) ? 0 : 1;
          var3_int = stackIn_3_0;
          if (var3_int == 0) {
            stackIn_6_0 = so.field_u;
            return stackIn_6_0;
          }
          if (param0 > 62) {
            stackIn_11_0 = so.field_s;
            return stackIn_11_0;
          }
          stackIn_9_0 = (cd) null;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_14_0 = var3;
          stackIn_14_1 = new StringBuilder().append("tn.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_4_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -121) {
            field_m = (String) null;
          }
          if (this.a(78, param1) != so.field_u) {
            stackIn_6_0 = cp.field_h;
            return stackIn_6_0;
          }
          stackIn_4_0 = pl.field_t;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_9_0 = var3;
          stackIn_9_1 = new StringBuilder().append("tn.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw rb.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
        field_m = "Accept";
    }
}
