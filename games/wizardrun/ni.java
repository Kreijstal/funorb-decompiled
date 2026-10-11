/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ni {
    static int field_b;
    static String field_a;

    public static void a(int param0) {
        int var1 = 2 / ((-46 - param0) / 47);
        field_a = null;
    }

    final static String c(int param0) {
        int var2 = 0;
        String var1;
        int var3;
        int var4;
        int var5;
        String var6;
        String var7;
        String var8;
        var5 = wizardrun.field_H;
        if (param0 != 6) {
          ni.b(-9);
        }
        var6 = "(" + l.field_P + " " + wizardrun.field_E + " " + me.field_c + ") " + ra.field_k;
        var1 = var6;
        if (gd.field_c > 0) {
          var1 = var6 + ":";
          for (var2 = 0; gd.field_c > var2; var2++) {
            var7 = var1 + ' ';
            var3 = nk.field_N.field_k[var2] & 255;
            var4 = var3 >> 4;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var3 = var3 & 15;
            var8 = var7 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var8 + (char)var3;
          }
        }
        return var1;
    }

    final static void b(int param0) {
        int var6 = 0;
        int incrementValue$0 = 0;
        int incrementValue$1 = 0;
        int incrementValue$2 = 0;
        int stackIn_14_0 = 0;
        RuntimeException decompiledCaughtException = null;
        Object var1 = null;
        byte[] var1_array = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var7 = 0;
        var7 = wizardrun.field_H;
        try {
          var1 = null;
          var1_array = fl.field_T[qh.field_l][ql.field_c];
          if (var1_array == null) {
            return;
          }
          var2 = 0;
          if (param0 != 7530) {
            return;
          }
          var4 = 0;
          var5 = 0;
          for (var6 = 0; var6 < 300; var6++) {
            incrementValue$0 = var2;
            var2++;
            tc.field_l.field_j[var6] = var1_array[incrementValue$0];
            incrementValue$1 = var2;
            var2++;
            tc.field_l.field_f[var6] = var1_array[incrementValue$1];
            if (tc.field_l.field_j[var6] >= 1) {
              stackIn_14_0 = (tc.field_l.field_j[var6] <= 3) ? 1 : 0;
            } else {
              stackIn_14_0 = 0;
            }
            var3 = stackIn_14_0;
            if (1 == qh.field_l &&
              7 <= tc.field_l.field_j[var6] &&
              tc.field_l.field_j[var6] <= 9) {
              var3 = 1;
              tc.field_l.field_f[var6] = 1;
            }
            if (qh.field_l == 2 &&
              tc.field_l.field_j[var6] >= 10 &&
              12 >= tc.field_l.field_j[var6]) {
              var3 = 1;
              tc.field_l.field_f[var6] = 1;
            }
            if (qh.field_l == 0 &&
              ql.field_c == 0) {
              var3 = 0;
            }
            if (6 <= var5 &&
              var5 < 9) {
              if (var4 >= 6 &&
                14 > var4) {
                var3 = 0;
              }
            } else if (var4 < 6 ||
              var4 >= 14) {
              var3 = 0;
            }
            var4++;
            if (var3 == 0) {
              tc.field_l.field_d[var6] = false;
            } else {
              tc.field_l.field_d[var6] = true;
            }
            if (var4 >= 20) {
              var4 = 0;
              var5++;
            }
            incrementValue$2 = var2;
            var2++;
            tc.field_l.field_a[var6] = var1_array[incrementValue$2];
          }
          ge.field_f = 0;
          il.field_e = false;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw bd.a((Throwable) ((Object) var1_ref), "ni.C(" + param0 + ')');
        }
    }

    final static void a(String param0, int param1, String[] param2, int param3) {
        int var5 = 0;
        String[] var6 = null;
        int stackIn_6_0 = 0;
        boolean stackIn_7_1 = false;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        StringBuilder stackIn_19_1 = null;
        String stackIn_20_2 = null;
        RuntimeException decompiledCaughtException = null;
        String[] var4 = null;
        RuntimeException var4_ref = null;
        var5 = wizardrun.field_H;
        try {
          wc.field_j = mi.field_z;
          if (param1 != -101) {
            ni.b(64);
          }
          if (255 != param3) {
            if (param3 >= 100 &&
              param3 <= 105) {
              var4 = param2;
              f.a((byte) -117, var4);
              kd.field_a = rc.a(param2, (byte) -106);
              return;
            }
            kd.field_a = hf.a(-105, param0, param3);
          } else {
            stackIn_6_0 = -29309;
            stackIn_7_1 = !(ac.field_t >= 13);
            kd.field_a = ii.a(stackIn_6_0, stackIn_7_1);
            var6 = (String[]) null;
            f.a((byte) -117, (String[]) null);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_16_0 = var4_ref;
          stackIn_16_1 = new StringBuilder().append("ni.B(");
          if (param0 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          stackIn_19_1 = ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_20_2 = "null";
          } else {
            stackIn_20_2 = "{...}";
          }
          throw bd.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_19_1).append(stackIn_20_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_a = "Use this alternative as your account name";
    }
}
