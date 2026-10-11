/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ag {
    static String field_g;
    private static int field_h;
    static dd field_b;
    static vh field_f;
    static int field_e;
    static int field_a;
    static String field_d;
    static int field_c;

    public static void a(int param0) {
        field_b = null;
        if (param0 != 0) {
          ko var2 = (ko) null;
          ag.a(105, (ko) null, -112, 90);
        }
        field_g = null;
        field_d = null;
        field_f = null;
    }

    final static void a(int[] param0, float[] param1, int param2) {
        float var3_float = 0.0f;
        float var4 = 0.0f;
        float var5 = 0.0f;
        try {
          param1[0] = param1[0] - (float)param0[0];
          param1[1] = param1[1] - (float)param0[1];
          param1[2] = param1[2] - (float)param0[2];
          var3_float = param1[1] * (float)param0[4] / 65536.0f + param1[0] * (float)param0[3] / 65536.0f + (float)param0[5] * param1[2] / 65536.0f;
          var4 = param1[0] * (float)param0[6] / 65536.0f + param1[1] * (float)param0[7] / 65536.0f + (float)param0[8] * param1[2] / 65536.0f;
          var5 = param1[0] * (float)param0[param2] / 65536.0f + param1[1] * (float)param0[10] / 65536.0f + param1[2] * (float)param0[11] / 65536.0f;
          param1[0] = (float)fb.field_q + 512.0f * var3_float / var5;
          param1[1] = 512.0f * var4 / var5 + (float)fb.field_d;
          param1[2] = var5;
        } catch (RuntimeException runtimeException) {
          throw wm.a((Throwable) ((Object) runtimeException), "ag.B(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static gi a(int param0, ko param1, int param2, int param3) {
        RuntimeException var4 = null;
        gi var5 = null;
        gi var6 = null;
        int var7 = 0;
        ko var8 = null;
        aa var9 = null;
        gi stackIn_12_0 = null;
        Object stackIn_18_0 = null;
        RuntimeException stackIn_21_0 = null;
        StringBuilder stackIn_21_1 = null;
        String stackIn_22_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Pool.field_O;
        try {
          var9 = new aa(param1);
          var5 = (gi) (var9.b((byte) -92));
          while (var5 != null) {
            var6 = var5;
            while (var5 != null) {
              if (var6.field_m <= param2 &&
                param2 < var6.field_l + var6.field_m &&
                param0 >= var6.field_q &&
                var6.field_q + var6.field_r > param0) {
                stackIn_12_0 = var5;
                return stackIn_12_0;
              }
              var5 = var5.field_s;
            }
            var5 = (gi) (var9.b(-81));
          }
          if (param3 == 15395) {
            return null;
          }
          var8 = (ko) null;
          ag.a(15, (ko) null, 110, 38);
          stackIn_18_0 = null;
          return (gi) (stackIn_18_0);
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_21_0 = var4;
          stackIn_21_1 = new StringBuilder().append("ag.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_22_2 = "null";
          } else {
            stackIn_22_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_21_0), ((StringBuilder) (Object) stackIn_21_1).append(stackIn_22_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static dd a(byte param0, int param1, String param2) {
        RuntimeException var3 = null;
        int var6 = 0;
        int var7 = 0;
        dd var8 = null;
        dd var10 = null;
        int[] var16 = null;
        int[] var17 = null;
        dd stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var10 = new dd(4 + ni.field_Z.b(param2), 4 + ni.field_Z.field_C + ni.field_Z.field_w);
          var10.field_G = -2;
          var10.field_B = -2;
          var16 = new int[4];
          var17 = qh.field_d;
          var6 = qh.field_l;
          var7 = qh.field_f;
          qh.a(var16);
          var10.e();
          ni.field_Z.d(param2, 2, 2 + ni.field_Z.field_C, param1, -1);
          var10.e(4144959);
          qh.a(var17, var6, var7);
          qh.b(var16);
          var10.field_y = var10.field_A;
          var10.field_w = var10.field_z;
          var10.field_B = 0;
          var8 = var10;
          var8.field_G = 0;
          if (param0 != 89) {
            ag.a(-120);
          }
          stackIn_3_0 = var10;
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ag.C(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw wm.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    static {
        field_h = 7;
        field_e = 1 << field_h;
        field_g = "Connection restored.";
        field_d = "Add name";
    }
}
