/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bg {
    static int field_d;
    static String field_a;
    static mm field_g;
    static int field_b;
    static String field_e;
    static String field_c;
    static String field_f;

    final static c a(boolean param0) {
        if (hd.field_r == null) {
          hd.field_r = new c();
          hd.field_r.a(13421772, hh.field_e);
          hd.field_r.field_n = 14;
          hd.field_r.field_p = bj.field_f;
          hd.field_r.field_q = 0;
          hd.field_r.field_d = 5;
          hd.field_r.field_o = 7697781;
          hd.field_r.field_f = 2763306;
          hd.field_r.field_c = 6;
          hd.field_r.field_h = 4;
        }
        if (param0) {
          return hd.field_r;
        }
        field_c = (String) null;
        return hd.field_r;
    }

    public static void a(byte param0) {
        field_c = null;
        field_f = null;
        field_g = null;
        field_a = null;
        field_e = null;
        int var1 = -115 / ((param0 + 42) / 57);
    }

    final static void a(int param0) {
        int var1_int = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        int var1_intLifetime1;
        var4 = client.field_A ? 1 : 0;
        try {
          qg.b();
          ch.field_b = new int[260];
          if (param0 > -113) {
            bg.a(-59);
          }
          me.field_y = 11;
          for (var1_int = 0; 256 > var1_int; var1_int++) {
            var2 = 15.0;
            ch.field_b[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
          }
          var5 = 256;
          var1_intLifetime1 = var5;
          while (ch.field_b.length > var5) {
            ch.field_b[var5] = 255;
            var5++;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dh.a((Throwable) ((Object) var1), "bg.A(" + param0 + ')');
        }
    }

    final static void a(byte[] param0, int[] param1, String[] param2, byte[] param3, int param4, String[][] param5, ji param6, int param7, int param8, ji param9, ck[][] param10, ck[][] param11, boolean param12, ji param13, String[][] param14) {
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        String stackIn_6_2 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        StringBuilder stackIn_11_1 = null;
        String stackIn_12_2 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        StringBuilder stackIn_23_1 = null;
        String stackIn_24_2 = null;
        StringBuilder stackIn_26_1 = null;
        String stackIn_27_2 = null;
        StringBuilder stackIn_29_1 = null;
        String stackIn_30_2 = null;
        StringBuilder stackIn_32_1 = null;
        String stackIn_33_2 = null;
        StringBuilder stackIn_35_1 = null;
        String stackIn_36_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var15 = null;
        try {
          s.a(param8 ^ 25206, param4, param11, param3, param10, param7, param12, param14, param1, param0, param6, (int[]) null, param9, (pi[]) null, param2, param5, param13);
          if (param8 != 25150) {
            bg.a((byte) 118);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var15 = decompiledCaughtException;
          stackIn_5_0 = var15;
          stackIn_5_1 = new StringBuilder().append("bg.C(");
          if (param0 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',');
          if (param1 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',');
          if (param2 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',');
          if (param3 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param4).append(',');
          if (param5 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',');
          if (param6 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          stackIn_23_1 = ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(',').append(param7).append(',').append(param8).append(',');
          if (param9 == null) {
            stackIn_24_2 = "null";
          } else {
            stackIn_24_2 = "{...}";
          }
          stackIn_26_1 = ((StringBuilder) (Object) stackIn_23_1).append(stackIn_24_2).append(',');
          if (param10 == null) {
            stackIn_27_2 = "null";
          } else {
            stackIn_27_2 = "{...}";
          }
          stackIn_29_1 = ((StringBuilder) (Object) stackIn_26_1).append(stackIn_27_2).append(',');
          if (param11 == null) {
            stackIn_30_2 = "null";
          } else {
            stackIn_30_2 = "{...}";
          }
          stackIn_32_1 = ((StringBuilder) (Object) stackIn_29_1).append(stackIn_30_2).append(',').append(param12).append(',');
          if (param13 == null) {
            stackIn_33_2 = "null";
          } else {
            stackIn_33_2 = "{...}";
          }
          stackIn_35_1 = ((StringBuilder) (Object) stackIn_32_1).append(stackIn_33_2).append(',');
          if (param14 == null) {
            stackIn_36_2 = "null";
          } else {
            stackIn_36_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_35_1).append(stackIn_36_2).append(')').toString());
        }
    }

    static {
        field_a = "<%0> has entered another game.";
        field_f = "This password contains your email address, and would be easy to guess";
        field_c = "Loading extra data";
        field_e = "You do not have a suitable number of players for the current options.";
    }
}
