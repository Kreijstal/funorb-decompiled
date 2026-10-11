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
        String var3 = null;
        gh stackIn_8_0 = null;
        Object stackIn_10_0 = null;
        RuntimeException stackIn_13_0 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (dj.field_k == ta.field_hb) {
            return null;
          }
          if (param0 != 127) {
            var3 = (String) null;
            ed.a((byte) -55, (String) null);
          }
          if (oi.field_j == ta.field_hb &&
            param1.equals(ih.field_a)) {
            ta.field_hb = mp.field_b;
            stackIn_8_0 = ai.field_g;
            return stackIn_8_0;
          }
          ai.field_g = null;
          ih.field_a = param1;
          ta.field_hb = dj.field_k;
          stackIn_10_0 = null;
          return (gh) (stackIn_10_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_13_0 = var2;
          stackIn_13_1 = new StringBuilder().append("ed.D(").append(param0).append(',');
          if (param1 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_13_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static void a(String param0, long param1, int param2, int param3, boolean param4, int param5) {
        int var7_int = 0;
        ul var8 = null;
        ga stackIn_2_0 = null;
        int stackIn_2_1 = 0;
        int stackIn_3_2 = 0;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var7 = null;
        try {
          ma.field_a.b((byte) -35, param2);
          ma.field_a.field_j = ma.field_a.field_j + 1;
          var7_int = ma.field_a.field_j;
          ma.field_a.a(param1, true);
          ma.field_a.a(param0, (byte) 105);
          ma.field_a.a(-31, param3);
          stackIn_2_0 = ma.field_a;
          stackIn_2_1 = 107;
          if (!param4) {
            stackIn_3_2 = 0;
          } else {
            stackIn_3_2 = 1;
          }
          ((ga) (Object) stackIn_2_0).a(stackIn_2_1, stackIn_3_2);
          ma.field_a.e(76, -var7_int + ma.field_a.field_j);
          if (param5 != 21965) {
            var8 = (ul) null;
            ed.a((ul) null, -63);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var7 = decompiledCaughtException;
          stackIn_8_0 = var7;
          stackIn_8_1 = new StringBuilder().append("ed.C(");
          if (param0 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',').append(param4).append(',').append(param5).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 12814) {
          return;
        }
        field_d = null;
        field_a = null;
    }

    final static ci a(ul param0, int param1) {
        ci var2 = null;
        RuntimeException var2_ref = null;
        ci stackIn_2_0 = null;
        ci stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -2852) {
            stackIn_2_0 = (ci) null;
            return stackIn_2_0;
          }
          var2 = new ci();
          var2.a((byte) 97, param0.a("", "sandbox.zdl", false));
          var2.a((byte) 84, param0.a("", "tutorial.zdl", false));
          var2.a((byte) 111, param0.a("", "n2/ma_1.zdl", false));
          var2.a((byte) 115, param0.a("", "n2/wh_1.zdl", false));
          var2.a((byte) 126, param0.a("", "n2/pp_1.zdl", false));
          var2.a((byte) 94, param0.a("", "n2/pr_1.zdl", false));
          var2.a((byte) 85, param0.a("", "n4/ma_1.zdl", false));
          var2.a((byte) 115, param0.a("", "n4/wh_1.zdl", false));
          var2.a((byte) 125, param0.a("", "n4/pp_1.zdl", false));
          var2.a((byte) 83, param0.a("", "n4/pr_1.zdl", false));
          var2.a((byte) 107, param0.a("", "Badgirls_2.zdl", false));
          var2.a((byte) 110, param0.a("", "Carpark_4.zdl", false));
          var2.a((byte) 103, param0.a("", "Cineplex_2.zdl", false));
          var2.a((byte) 76, param0.a("", "Claustrophobia_2.zdl", false));
          var2.a((byte) 79, param0.a("", "Core_2.zdl", false));
          var2.a((byte) 120, param0.a("", "Hotel_4.zdl", false));
          var2.a((byte) 72, param0.a("", "Megamall_4.zdl", false));
          var2.a((byte) 126, param0.a("", "Prisonbreak_4.zdl", false));
          var2.a((byte) 95, param0.a("", "AnyonesConference.zdl", false));
          var2.a((byte) 80, param0.a("", "impound.zdl", false));
          var2.a((byte) 72, param0.a("", "mini_mart.zdl", false));
          var2.a((byte) 114, param0.a("", "Birdmaster1.zdl", false));
          var2.a((byte) 94, param0.a("", "Sken58_2.zdl", false));
          var2.a((byte) 126, param0.a("", "precinct42.zdl", false));
          var2.a((byte) 125, param0.a("", "sustained_alpha.zdl", false));
          var2.a((byte) 121, param0.a("", "Media_2.zdl", false));
          stackIn_4_0 = var2;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_7_0 = var2_ref;
          stackIn_7_1 = new StringBuilder().append("ed.B(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw fa.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        int var1 = 0;
        int var2 = 0;
        int var0;
        field_a = new int[256];
        field_e = "Haze";
        for (var1 = 0; var1 < 256; var1++) {
          var0 = var1;
          for (var2 = 0; var2 < 8; var2++) {
            if (1 != (1 & var0)) {
              var0 = var0 >>> 1;
            } else {
              var0 = -306674912 ^ var0 >>> 1;
            }
          }
          field_a[var1] = var0;
        }
    }
}
