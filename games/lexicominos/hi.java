/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hi {
    static String field_a;
    static int[] field_c;
    static ll field_d;
    static db[] field_b;

    final static short[] a(th param0, byte param1, int param2, short[] param3) {
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        Object stackIn_3_0 = null;
        short[] stackIn_10_0 = null;
        short[] stackIn_19_0 = null;
        RuntimeException stackIn_22_0 = null;
        StringBuilder stackIn_22_1 = null;
        String stackIn_23_2 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_26_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var4 = null;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          var4_int = param0.g(param2, 26527);
          if (0 == var4_int) {
            stackIn_3_0 = null;
            return (short[]) (stackIn_3_0);
          }
          if (param3 == null ||
            param3.length != var4_int) {
            param3 = new short[var4_int];
          }
          var5 = param0.g(4, 26527);
          if (param1 > -32) {
            stackIn_10_0 = (short[]) null;
            return stackIn_10_0;
          }
          var6 = (short)param0.g(16, 26527);
          if (var5 > 0) {
            for (var7 = 0; var4_int > var7; var7++) {
              param3[var7] = (short)(param0.g(var5, 26527) + var6);
            }
          } else {
            for (var7 = 0; var7 < var4_int; var7++) {
              param3[var7] = (short)var6;
            }
          }
          stackIn_19_0 = (short[]) (param3);
          return stackIn_19_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_22_0 = var4;
          stackIn_22_1 = new StringBuilder().append("hi.D(");
          if (param0 == null) {
            stackIn_23_2 = "null";
          } else {
            stackIn_23_2 = "{...}";
          }
          stackIn_25_1 = ((StringBuilder) (Object) stackIn_22_1).append(stackIn_23_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_26_2 = "null";
          } else {
            stackIn_26_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_22_0), ((StringBuilder) (Object) stackIn_25_1).append(stackIn_26_2).append(')').toString());
        }
    }

    final static void b(int param0) {
        int var3 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        String stackIn_25_0 = null;
        String stackIn_32_0 = null;
        String stackIn_37_0 = null;
        boolean stackIn_38_1 = false;
        wh stackIn_43_0 = null;
        RuntimeException decompiledCaughtException = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        long var3_long = 0L;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        int var7 = 0;
        int var8 = 0;
        wh var9 = null;
        int var10 = 0;
        int var7Lifetime1;
        int var8Lifetime1;
        var10 = Lexicominos.field_L ? 1 : 0;
        try {
          var1_int = rf.field_c;
          var2 = param0;
          if (sh.field_a == 2) {
            var3_long = -ug.field_x + rf.c(param0 + 0);
            var2 = (int)((-var3_long + 10999L) / 1000L);
            if (var2 < 0) {
              var2 = 0;
            }
          }
          for (var3 = 0; ee.field_g.length > var3; var3++) {
            var4 = ni.field_a[var3];
            if (var4 >= 0) {
              if (bc.field_H.field_d == var4) {
                var5 = g.field_n;
              } else {
                var5 = ec.field_c;
              }
            } else {
              var5 = ea.field_b;
            }
            var6 = ee.field_g[var3];
            if (sh.field_a == 2 &&
              var2 == 1) {
              if (hf.field_b.length > ed.field_t.length) {
                stackIn_16_0 = hf.field_b.length;
              } else {
                stackIn_16_0 = ed.field_t.length;
              }
              var7 = stackIn_16_0;
              if (qc.field_e.length < nl.field_a.length) {
                stackIn_19_0 = nl.field_a.length;
              } else {
                stackIn_19_0 = qc.field_e.length;
              }
              var8 = stackIn_19_0;
              if (6 <= var3 &&
                var7 + 6 > var3) {
                if (0 <= var3 - (6 - ed.field_t.length) - var7) {
                  stackIn_25_0 = ed.field_t[-var7 + ed.field_t.length + (-6 + var3)];
                } else {
                  stackIn_25_0 = "";
                }
                var6 = stackIn_25_0;
              }
              if (var7 + 7 <= var3 &&
                var8 + (7 + var7) > var3) {
                if (qc.field_e.length <= -var7 - 7 + var3) {
                  stackIn_32_0 = "";
                } else {
                  stackIn_32_0 = qc.field_e[-var7 + (-7 + var3)];
                }
                var6 = stackIn_32_0;
              }
            }
            if (var4 == -2) {
              var6 = Integer.toString(var2);
            }
            stackIn_37_0 = var6;
            stackIn_38_1 = !(var4 < 0);
            var7Lifetime1 = ii.a(stackIn_37_0, stackIn_38_1, 0);
            var8Lifetime1 = -(var7Lifetime1 >> 1) + uh.field_D;
            if (var4 >= 0) {
              if (bc.field_H.field_d != var4) {
                stackIn_43_0 = sc.field_d;
              } else {
                stackIn_43_0 = fg.field_c;
              }
              var9 = stackIn_43_0;
              var1_int = var1_int + we.field_l;
              if (var9 != null) {
                var9.a(var1_int, (oh.field_b << 1) + fb.field_g, var7Lifetime1 + (jh.field_e << 1), var8Lifetime1 - jh.field_e, -1160208572);
              }
              var1_int = var1_int + oh.field_b;
            }
            if (var4 < 0) {
              pb.field_i.b(var6, var8Lifetime1, var1_int + sb.field_f, var5, -1);
              var1_int = var1_int + hc.field_fb;
            } else {
              fb.field_m.b(var6, var8Lifetime1, var1_int + kk.field_o, var5, -1);
              var1_int = var1_int + (oh.field_b + we.field_l + fb.field_g);
            }
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var1), "hi.B(" + param0 + ')');
        }
    }

    public static void a(int param0) {
        field_d = null;
        field_b = null;
        field_a = null;
        field_c = null;
        if (param0 != 5) {
          field_c = (int[]) null;
        }
    }

    final static boolean a(int param0, char param1) {
        boolean stackIn_10_0 = false;
        if (param0 != 18670) {
          field_d = (ll) null;
        }
        stackIn_10_0 = ((!(param1 < 65) &&
          !(90 < param1)) ||
          (!(param1 < 97) &&
          !(param1 > 122)));
        return stackIn_10_0;
    }

    static {
        field_c = new int[]{2, 2, 3, 5, 1, 2, 3, 5, 3, 5, 10, 1, 3, 5, 10, 2};
        field_a = "Create your own free Jagex account";
    }
}
