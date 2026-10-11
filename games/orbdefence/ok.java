/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ok {
    int field_b;
    int field_g;
    float field_d;
    int field_c;
    float field_e;
    static dj[] field_a;
    static int field_f;

    public static void b(byte param0) {
        int var1 = 26 % ((-61 - param0) / 51);
        field_a = null;
    }

    final static int a(byte param0) {
        if (param0 == 84) {
          return (int)(1000000000L / vc.field_j);
        }
        byte[] var2 = (byte[]) null;
        ok.a(-48, (byte[]) null);
        return (int)(1000000000L / vc.field_j);
    }

    final static void a(int param0, int param1, int param2, hj[] param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, hj[] param11, int param12, int param13, int param14, hj[] param15, int param16, int param17, int param18, kc param19, kc param20) {
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
        RuntimeException decompiledCaughtException = null;
        RuntimeException var21 = null;
        try {
          gg.a(param9, param12, param1, param18, param8, param5, param17, param19, param20, param16, param6, param2, new pf(param11), param14, param10, new pf(param3), -90, new pf(param15), param4, param13, param0);
          if (param7 != -1) {
            field_a = (dj[]) null;
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var21 = decompiledCaughtException;
          stackIn_5_0 = var21;
          stackIn_5_1 = new StringBuilder().append("ok.C(").append(param0).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_6_2 = "null";
          } else {
            stackIn_6_2 = "{...}";
          }
          stackIn_8_1 = ((StringBuilder) (Object) stackIn_5_1).append(stackIn_6_2).append(',').append(param4).append(',').append(param5).append(',').append(param6).append(',').append(param7).append(',').append(param8).append(',').append(param9).append(',').append(param10).append(',');
          if (param11 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          stackIn_11_1 = ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(',').append(param12).append(',').append(param13).append(',').append(param14).append(',');
          if (param15 == null) {
            stackIn_12_2 = "null";
          } else {
            stackIn_12_2 = "{...}";
          }
          stackIn_14_1 = ((StringBuilder) (Object) stackIn_11_1).append(stackIn_12_2).append(',').append(param16).append(',').append(param17).append(',').append(param18).append(',');
          if (param19 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',');
          if (param20 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_5_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    final static boolean a(int param0, boolean param1) {
        if (-1 == param0) {
          return true;
        }
        if (!param1) {
          return 0 != (ql.field_e & 1 << param0) ? true : false;
        }
        return true;
    }

    final static u a(int param0, byte[] param1) {
        u var2 = null;
        RuntimeException var2_ref = null;
        kc var3 = null;
        u stackIn_6_0 = null;
        RuntimeException stackIn_9_0 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 == null) {
            return null;
          }
          var2 = new u(param1, jd.field_g, wc.field_a, wh.field_b, m.field_a, vc.field_g, fl.field_a);
          if (param0 != -3362) {
            var3 = (kc) null;
            ok.a(-59, 87, -24, (hj[]) null, 6, 29, -83, 20, 104, 36, 30, (hj[]) null, 1, -123, 74, (hj[]) null, 86, 93, -3, (kc) null, (kc) null);
          }
          md.$cfr$intArgs$a$6121ff5511c4(-127);
          stackIn_6_0 = var2;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          stackIn_9_0 = var2_ref;
          stackIn_9_1 = new StringBuilder().append("ok.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw dd.a((Throwable) ((Object) stackIn_9_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(')').toString());
        }
    }

    static {
    }
}
