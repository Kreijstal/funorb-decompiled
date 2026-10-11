/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va {
    static boolean field_j;
    static r field_g;
    static int field_b;
    static bi field_e;
    static String field_i;
    boolean field_f;
    int field_c;
    boolean field_k;
    static bi[] field_d;
    int field_h;
    int field_a;

    public static void a(int param0) {
        int var1 = 46 / ((param0 - 30) / 48);
        field_e = null;
        field_g = null;
        field_d = null;
        field_i = null;
    }

    final static String a(int param0, String[] param1) {
        int var4 = 0;
        StringBuilder discarded$8 = null;
        StringBuilder discarded$9 = null;
        StringBuilder discarded$5 = null;
        StringBuilder discarded$6 = null;
        StringBuilder discarded$7 = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        StringBuilder var3 = null;
        int var5 = 0;
        String stackIn_8_0 = null;
        String stackIn_13_0 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          if (param1 == null) {
            return null;
          }
          if (param1.length == 0) {
            return null;
          }
          if (1 == param1.length) {
            stackIn_8_0 = param1[0];
            return stackIn_8_0;
          }
          var2_int = param1.length + param0;
          var3 = new StringBuilder(20);
          for (var4 = 0; var2_int > var4; var4++) {
            discarded$8 = var3.append(param1[var4]);
            discarded$9 = var3.append(ef.field_d);
          }
          discarded$5 = var3.append(param1[var2_int]);
          discarded$6 = var3.append(qn.field_d);
          discarded$7 = var3.append(param1[1 + var2_int]);
          stackIn_13_0 = var3.toString();
          return stackIn_13_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_16_0 = var2;
          stackIn_16_1 = new StringBuilder().append("va.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_17_2 = "null";
          } else {
            stackIn_17_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_16_0), ((StringBuilder) (Object) stackIn_16_1).append(stackIn_17_2).append(')').toString());
        }
    }

    final static void a(String[] args, byte param1, int param2, String param3) {
        RuntimeException var4 = null;
        int var5 = 0;
        bc var6 = null;
        int stackIn_12_0 = 0;
        boolean stackIn_13_1 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        var5 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          ee.field_l = rh.field_g;
          if (param1 != -113) {
            var6 = (bc) null;
            va.a((String) null, -24, (String) null, (bc) null);
          }
          if (param2 != 255) {
            if (100 > param2) {
              wh.field_c = ck.a(param3, param2, -80);
              return;
            }
            if (param2 <= 105) {
              wh.field_c = tc.a(args, (byte) -64);
              return;
            }
            wh.field_c = ck.a(param3, param2, -80);
            return;
          }
          stackIn_12_0 = 93;
          stackIn_13_1 = !(jm.field_t >= 13);
          wh.field_c = ub.$cfr$intArgs$a$be17d4c2d3e3(stackIn_12_0, stackIn_13_1);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_17_0 = var4;
          stackIn_17_1 = new StringBuilder().append("va.C(");
          if (args == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    final static bi[] a(String param0, int param1, String param2, bc param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        bi[] stackIn_2_0 = null;
        bi[] stackIn_4_0 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        StringBuilder stackIn_13_1 = null;
        String stackIn_14_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var4_int = param3.a(123, param2);
          var5 = param3.a(var4_int, (byte) 106, param0);
          if (param1 == 0) {
            stackIn_4_0 = um.a(var4_int, param3, var5, param1 - 84);
            return stackIn_4_0;
          }
          stackIn_2_0 = (bi[]) null;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("va.E(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          stackIn_13_1 = ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',');
          if (param3 == null) {
            stackIn_14_2 = "null";
          } else {
            stackIn_14_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_13_1).append(stackIn_14_2).append(')').toString());
        }
    }

    final static boolean a(String param0, int param1, String param2) {
        String var3 = null;
        boolean stackIn_14_0 = false;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        StringBuilder stackIn_20_1 = null;
        String stackIn_21_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var3_ref = null;
        try {
          if (param1 != -1) {
            field_g = (r) null;
          }
          var3 = dn.a(param0, true);
          if (param2.indexOf(param0) != -1) {
            return true;
          }
          if (-1 != param2.indexOf(var3)) {
            return true;
          }
          stackIn_14_0 = (param2.startsWith(param0)) || (param2.startsWith(var3)) || (param2.endsWith(param0)) || (param2.endsWith(var3));
          return stackIn_14_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          stackIn_17_0 = var3_ref;
          stackIn_17_1 = new StringBuilder().append("va.B(");
          if (param0 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          stackIn_20_1 = ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_21_2 = "null";
          } else {
            stackIn_21_2 = "{...}";
          }
          throw r.a((Throwable) ((Object) stackIn_17_0), ((StringBuilder) (Object) stackIn_20_1).append(stackIn_21_2).append(')').toString());
        }
    }

    static {
        field_i = "RuneScape clan";
    }
}
