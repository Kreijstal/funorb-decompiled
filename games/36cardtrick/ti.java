/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ti {
    static int[] field_d;
    static String field_b;
    static int field_a;
    static String field_c;
    static fh field_e;

    final static byte[] a(int param0, byte[] param1, int param2, int param3) {
        int var5_int = 0;
        byte[] var4 = null;
        RuntimeException var4_ref = null;
        dd var5 = null;
        byte[] var6 = null;
        int var7 = 0;
        byte[] var8 = null;
        byte[] stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var7 = Main.field_T;
        try {
          if (param0 > 0) {
            var8 = new byte[param2];
            var4 = var8;
            for (var5_int = 0; param2 > var5_int; var5_int++) {
              var8[var5_int] = param1[param0 + var5_int];
            }
          } else {
            var4 = param1;
          }
          var5 = new dd();
          var5.a((byte) 98);
          var5.a((long)(8 * param2), (byte) 124, var4);
          var6 = new byte[64];
          var5.a(param3 ^ 5319, var6, param3);
          stackIn_7_0 = var6;
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4_ref = decompiledCaughtException;
          stackIn_10_0 = var4_ref;
          stackIn_10_1 = new StringBuilder().append("ti.C(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    final static int a(jk param0, jk param1, int param2) {
        RuntimeException var3 = null;
        byte[] var4 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        StringBuilder stackIn_9_1 = null;
        String stackIn_10_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 != 0) {
            var4 = (byte[]) null;
            ti.a(-112, (byte[]) null, -39, 50);
          }
          stackIn_3_0 = pa.a((String) null, param0, param1, 0, 0, param2 + 18, false);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ti.D(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          stackIn_9_1 = ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',');
          if (param1 == null) {
            stackIn_10_2 = "null";
          } else {
            stackIn_10_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_9_1).append(stackIn_10_2).append(',').append(param2).append(')').toString());
        }
    }

    public static void a(boolean param0) {
        field_c = null;
        if (!param0) {
          return;
        }
        field_b = null;
        field_d = null;
        field_e = null;
    }

    final static void a(float param0, byte param1, String param2, boolean param3) {
        RuntimeException var4 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (null == ji.field_a) {
            ji.field_a = new rk(sd.field_c, rk.field_ab);
            sd.field_c.b(ji.field_a, (byte) 117);
          }
          ji.field_a.a(param2, param3, param0, (byte) -63);
          vj.d();
          ga.a(true, 40);
          if (param1 == 54) {
            return;
          }
          field_d = (int[]) null;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_7_0 = var4;
          stackIn_7_1 = new StringBuilder().append("ti.A(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param3).append(')').toString());
        }
    }

    static {
        field_d = new int[8192];
        field_b = "SCORE";
        field_a = -1;
    }
}
