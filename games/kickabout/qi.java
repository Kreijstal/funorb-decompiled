/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qi extends sr {
    static String field_o;
    static int[] field_n;
    static int field_p;

    final int a(int param0, Object param1, Object param2) {
        up var4 = null;
        up var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int stackIn_3_0 = 0;
        int stackIn_10_0 = 0;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4_ref = null;
        var9 = Kickabout.field_G;
        try {
          var4 = ((sp) (param1)).field_Sb;
          if (param0 != 2) {
            stackIn_3_0 = -108;
            return stackIn_3_0;
          }
          var5 = ((sp) (param2)).field_Sb;
          var8 = this.field_i % 3;
          if (0 == var8) {
            var6 = var4.field_n;
            var7 = var5.field_n;
          } else {
            if (var8 != 1) {
              var7 = var5.field_o;
              var6 = var4.field_o;
            } else {
              var6 = var4.field_g;
              var7 = var5.field_g;
            }
          }
          stackIn_10_0 = -var7 + var6 ^ this.field_i / 3 << 31;
          return stackIn_10_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_13_0 = var4_ref;
          stackIn_13_1 = new StringBuilder().append("qi.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          stackIn_16_1 = ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(',');
          if (param2 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final int a(int param0) {
        if (param0 >= -69) {
          Object var3 = (Object) null;
          this.a(81, (Object) null, (Object) null);
        }
        return 6;
    }

    qi() {
    }

    final static int b(int param0) {
        if (param0 != 3) {
          return 118;
        }
        return 180;
    }

    final static int a(boolean param0) {
        wk.a(nj.a(-100), 0);
        if (param0) {
          qi.b((byte) -67);
        }
        return oa.field_a.get(5);
    }

    public static void b(byte param0) {
        if (param0 != 85) {
          field_p = -51;
        }
        field_n = null;
        field_o = null;
    }

    final static void a(int param0, int param1, int param2, int[] param3, int[] param4) {
        int var10 = 0;
        int stackIn_7_0 = 0;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        int var5_int = 0;
        RuntimeException var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        var13 = Kickabout.field_G;
        try {
          if (param2 != -1) {
            field_n = (int[]) null;
          }
          if (param0 < param1) {
            var5_int = (param0 + param1) / 2;
            var6 = param0;
            var7 = param3[var5_int];
            param3[var5_int] = param3[param1];
            param3[param1] = var7;
            var8 = param4[var5_int];
            param4[var5_int] = param4[param1];
            param4[param1] = var8;
            stackIn_7_0 = (2147483647 == var7) ? 0 : 1;
            var9 = stackIn_7_0;
            for (var10 = param0; var10 < param1; var10++) {
              if ((-(var10 & var9) + var7) < param3[var10]) {
                var11 = param3[var10];
                param3[var10] = param3[var6];
                param3[var6] = var11;
                var12 = param4[var10];
                param4[var10] = param4[var6];
                param4[var6++] = var12;
              }
            }
            param3[param1] = param3[var6];
            param3[var6] = var7;
            param4[param1] = param4[var6];
            param4[var6] = var8;
            qi.a(param0, -1 + var6, param2 + 0, param3, param4);
            qi.a(var6 + 1, param1, -1, param3, param4);
            return;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          stackIn_17_0 = var5;
          stackIn_17_1 = new StringBuilder().append("qi.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param4 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw nb.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
    }
}
