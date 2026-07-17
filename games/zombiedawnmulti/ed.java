/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ed {
    static cj field_d;
    static int field_b;
    static int[] field_a;
    static int field_c;
    static String field_e;

    final static gh a(byte param0, String param1) {
        RuntimeException var2 = null;
        Object var3 = null;
        gh stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        gh stackOut_7_0 = null;
        Object stackOut_9_0 = null;
        RuntimeException stackOut_11_0 = null;
        StringBuilder stackOut_11_1 = null;
        RuntimeException stackOut_13_0 = null;
        StringBuilder stackOut_13_1 = null;
        String stackOut_13_2 = null;
        RuntimeException stackOut_12_0 = null;
        StringBuilder stackOut_12_1 = null;
        String stackOut_12_2 = null;
        try {
          L0: {
            if (dj.field_k != ta.field_hb) {
              L1: {
                if (param0 == 127) {
                  break L1;
                } else {
                  var3 = null;
                  gh discarded$2 = ed.a((byte) -55, (String) null);
                  break L1;
                }
              }
              L2: {
                if (oi.field_j != ta.field_hb) {
                  break L2;
                } else {
                  if (!param1.equals((Object) (Object) ih.field_a)) {
                    break L2;
                  } else {
                    ta.field_hb = mp.field_b;
                    stackOut_7_0 = ai.field_g;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
              ai.field_g = null;
              ih.field_a = param1;
              ta.field_hb = dj.field_k;
              stackOut_9_0 = null;
              stackIn_10_0 = stackOut_9_0;
              break L0;
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L3: {
            var2 = decompiledCaughtException;
            stackOut_11_0 = (RuntimeException) var2;
            stackOut_11_1 = new StringBuilder().append("ed.D(").append(param0).append(44);
            stackIn_13_0 = stackOut_11_0;
            stackIn_13_1 = stackOut_11_1;
            stackIn_12_0 = stackOut_11_0;
            stackIn_12_1 = stackOut_11_1;
            if (param1 == null) {
              stackOut_13_0 = (RuntimeException) (Object) stackIn_13_0;
              stackOut_13_1 = (StringBuilder) (Object) stackIn_13_1;
              stackOut_13_2 = "null";
              stackIn_14_0 = stackOut_13_0;
              stackIn_14_1 = stackOut_13_1;
              stackIn_14_2 = stackOut_13_2;
              break L3;
            } else {
              stackOut_12_0 = (RuntimeException) (Object) stackIn_12_0;
              stackOut_12_1 = (StringBuilder) (Object) stackIn_12_1;
              stackOut_12_2 = "{...}";
              stackIn_14_0 = stackOut_12_0;
              stackIn_14_1 = stackOut_12_1;
              stackIn_14_2 = stackOut_12_2;
              break L3;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_14_0, stackIn_14_2 + 41);
        }
        return (gh) (Object) stackIn_10_0;
    }

    final static void a(String param0, long param1, int param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        RuntimeException var7 = null;
        ga stackIn_1_0 = null;
        int stackIn_1_1 = 0;
        ga stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        ga stackIn_3_0 = null;
        int stackIn_3_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ga stackOut_0_0 = null;
        int stackOut_0_1 = 0;
        ga stackOut_2_0 = null;
        int stackOut_2_1 = 0;
        int stackOut_2_2 = 0;
        ga stackOut_1_0 = null;
        int stackOut_1_1 = 0;
        int stackOut_1_2 = 0;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            L1: {
              ma.field_a.b((byte) -35, param2);
              ma.field_a.field_j = ma.field_a.field_j + 1;
              var7_int = ma.field_a.field_j;
              ma.field_a.a(param1, true);
              ma.field_a.a(param0, (byte) 105);
              ma.field_a.a(-31, param3);
              stackOut_0_0 = ma.field_a;
              stackOut_0_1 = 107;
              stackIn_2_0 = stackOut_0_0;
              stackIn_2_1 = stackOut_0_1;
              stackIn_1_0 = stackOut_0_0;
              stackIn_1_1 = stackOut_0_1;
              if (!param4) {
                stackOut_2_0 = (ga) (Object) stackIn_2_0;
                stackOut_2_1 = stackIn_2_1;
                stackOut_2_2 = 0;
                stackIn_3_0 = stackOut_2_0;
                stackIn_3_1 = stackOut_2_1;
                stackIn_3_2 = stackOut_2_2;
                break L1;
              } else {
                stackOut_1_0 = (ga) (Object) stackIn_1_0;
                stackOut_1_1 = stackIn_1_1;
                stackOut_1_2 = 1;
                stackIn_3_0 = stackOut_1_0;
                stackIn_3_1 = stackOut_1_1;
                stackIn_3_2 = stackOut_1_2;
                break L1;
              }
            }
            ((ga) (Object) stackIn_3_0).a(stackIn_3_1, stackIn_3_2);
            ma.field_a.e(76, -var7_int + ma.field_a.field_j);
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var7 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var7;
            stackOut_5_1 = new StringBuilder().append("ed.C(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L2;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L2;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + 21965 + 41);
        }
    }

    public static void a(int param0) {
        field_e = null;
        field_d = null;
        field_a = null;
    }

    final static ci a(ul param0, int param1) {
        RuntimeException var2 = null;
        ci var2_ref = null;
        Object stackIn_2_0 = null;
        ci stackIn_4_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        ci stackOut_3_0 = null;
        Object stackOut_1_0 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        RuntimeException stackOut_7_0 = null;
        StringBuilder stackOut_7_1 = null;
        String stackOut_7_2 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        try {
          L0: {
            if (param1 == -2852) {
              var2_ref = new ci();
              var2_ref.a((byte) 97, param0.a("", "sandbox.zdl", false));
              var2_ref.a((byte) 84, param0.a("", "tutorial.zdl", false));
              var2_ref.a((byte) 111, param0.a("", "n2/ma_1.zdl", false));
              var2_ref.a((byte) 115, param0.a("", "n2/wh_1.zdl", false));
              var2_ref.a((byte) 126, param0.a("", "n2/pp_1.zdl", false));
              var2_ref.a((byte) 94, param0.a("", "n2/pr_1.zdl", false));
              var2_ref.a((byte) 85, param0.a("", "n4/ma_1.zdl", false));
              var2_ref.a((byte) 115, param0.a("", "n4/wh_1.zdl", false));
              var2_ref.a((byte) 125, param0.a("", "n4/pp_1.zdl", false));
              var2_ref.a((byte) 83, param0.a("", "n4/pr_1.zdl", false));
              var2_ref.a((byte) 107, param0.a("", "Badgirls_2.zdl", false));
              var2_ref.a((byte) 110, param0.a("", "Carpark_4.zdl", false));
              var2_ref.a((byte) 103, param0.a("", "Cineplex_2.zdl", false));
              var2_ref.a((byte) 76, param0.a("", "Claustrophobia_2.zdl", false));
              var2_ref.a((byte) 79, param0.a("", "Core_2.zdl", false));
              var2_ref.a((byte) 120, param0.a("", "Hotel_4.zdl", false));
              var2_ref.a((byte) 72, param0.a("", "Megamall_4.zdl", false));
              var2_ref.a((byte) 126, param0.a("", "Prisonbreak_4.zdl", false));
              var2_ref.a((byte) 95, param0.a("", "AnyonesConference.zdl", false));
              var2_ref.a((byte) 80, param0.a("", "impound.zdl", false));
              var2_ref.a((byte) 72, param0.a("", "mini_mart.zdl", false));
              var2_ref.a((byte) 114, param0.a("", "Birdmaster1.zdl", false));
              var2_ref.a((byte) 94, param0.a("", "Sken58_2.zdl", false));
              var2_ref.a((byte) 126, param0.a("", "precinct42.zdl", false));
              var2_ref.a((byte) 125, param0.a("", "sustained_alpha.zdl", false));
              var2_ref.a((byte) 121, param0.a("", "Media_2.zdl", false));
              stackOut_3_0 = (ci) var2_ref;
              stackIn_4_0 = stackOut_3_0;
              break L0;
            } else {
              stackOut_1_0 = null;
              stackIn_2_0 = stackOut_1_0;
              return (ci) (Object) stackIn_2_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L1: {
            var2 = decompiledCaughtException;
            stackOut_5_0 = (RuntimeException) var2;
            stackOut_5_1 = new StringBuilder().append("ed.B(");
            stackIn_7_0 = stackOut_5_0;
            stackIn_7_1 = stackOut_5_1;
            stackIn_6_0 = stackOut_5_0;
            stackIn_6_1 = stackOut_5_1;
            if (param0 == null) {
              stackOut_7_0 = (RuntimeException) (Object) stackIn_7_0;
              stackOut_7_1 = (StringBuilder) (Object) stackIn_7_1;
              stackOut_7_2 = "null";
              stackIn_8_0 = stackOut_7_0;
              stackIn_8_1 = stackOut_7_1;
              stackIn_8_2 = stackOut_7_2;
              break L1;
            } else {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "{...}";
              stackIn_8_0 = stackOut_6_0;
              stackIn_8_1 = stackOut_6_1;
              stackIn_8_2 = stackOut_6_2;
              break L1;
            }
          }
          throw fa.a((Throwable) (Object) stackIn_8_0, stackIn_8_2 + 44 + param1 + 41);
        }
        return stackIn_4_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var1 = 0;
        int var0 = 0;
        int var2 = 0;
        field_a = new int[256];
        field_e = "Haze";
        for (var1 = 0; var1 < 256; var1++) {
            var0 = var1;
            for (var2 = 0; var2 < 8; var2++) {
                if (1 == (1 & var0)) {
                    var0 = -306674912 ^ var0 >>> 1;
                } else {
                    var0 = var0 >>> 1;
                }
            }
            field_a[var1] = var0;
        }
    }
}
