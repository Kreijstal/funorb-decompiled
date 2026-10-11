/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class wd {
    static String field_b;
    static int field_a;
    static volatile int field_d;
    static int field_c;

    final static void b(int param0) {
        int fieldTemp$0 = 0;
        RuntimeException decompiledCaughtException = null;
        jd var1 = null;
        RuntimeException var1_ref = null;
        int var2 = 0;
        int var3 = 0;
        var3 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != 8) {
            return;
          }
          var1 = id.field_c;
          while (ec.e(param0 ^ 7697789)) {
            var1.e(8, -2147483648);
            fieldTemp$0 = var1.field_m + 1;
            var1.field_m = var1.field_m + 1;
            var2 = fieldTemp$0;
            db.a(var1, (byte) -115);
            id.field_c.b(1, -var2 + var1.field_m);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1_ref = decompiledCaughtException;
          throw fc.a((Throwable) ((Object) var1_ref), "wd.C(" + param0 + ')');
        }
    }

    abstract ha c(int param0);

    abstract byte[] a(int param0, int param1);

    final static void a(int param0, int param1, int param2, int param3, int[] param4) {
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int[] var9 = null;
        RuntimeException stackIn_8_0 = null;
        StringBuilder stackIn_8_1 = null;
        String stackIn_9_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var5_ref = null;
        var8 = SolKnight.field_L ? 1 : 0;
        try {
          if (param0 != 0) {
            return;
          }
          while (true) {
            param2--;
            if (0 > param2) {
              return;
            }
            var9 = param4;
            var5 = var9;
            var6 = param1;
            var7 = param3;
            var9[var6] = var7 + fi.a(var9[var6] >> 1, 8355711);
            param1++;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5_ref = decompiledCaughtException;
          stackIn_8_0 = var5_ref;
          stackIn_8_1 = new StringBuilder().append("wd.F(").append(param0).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(',');
          if (param4 == null) {
            stackIn_9_2 = "null";
          } else {
            stackIn_9_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_8_0), ((StringBuilder) (Object) stackIn_8_1).append(stackIn_9_2).append(')').toString());
        }
    }

    final static pc a(String param0, int param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        String var4 = null;
        String var5 = null;
        pc var6 = null;
        pc stackIn_4_0 = null;
        pc stackIn_7_0 = null;
        pc stackIn_11_0 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != null &&
            param0.length() != 0) {
            var3 = 27 / ((param1 + 77) / 33);
            var2_int = param0.indexOf('@');
            if (var2_int == -1) {
              stackIn_7_0 = h.field_a;
              return stackIn_7_0;
            }
            var4 = param0.substring(0, var2_int);
            var5 = param0.substring(1 + var2_int);
            var6 = ad.b((byte) -126, var4);
            if (var6 == null) {
              return ne.a(var5, 62);
            }
            stackIn_11_0 = var6;
            return stackIn_11_0;
          }
          stackIn_4_0 = gb.field_h;
          return stackIn_4_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("wd.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw fc.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_b = null;
        if (param0 == 8355711) {
          return;
        }
        field_a = -50;
    }

    abstract int a(int param0, byte param1);

    static {
        field_d = 0;
        field_b = "Email address is unavailable";
        field_a = 0;
    }
}
