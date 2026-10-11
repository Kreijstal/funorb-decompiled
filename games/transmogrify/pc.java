/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pc {
    static ci field_a;
    static int field_b;

    final static int a(boolean param0, ig param1, byte param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param2 == 120) {
            stackIn_4_0 = param1.a(param0, 115);
            return stackIn_4_0;
          }
          stackIn_2_0 = 120;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("pc.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0) {
        if (null != nk.field_b) {
          nk.field_b.a(true);
          nk.field_b = null;
        }
        if (param0 == 1) {
          return;
        }
        ci var2 = (ci) null;
        pc.a((String) null, (String) null, (ci) null, -89);
    }

    final static ti a(String param0, String param1, ci param2, int param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int var5 = 0;
        int var6 = 0;
        ti stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var6 = 60 / ((-91 - param3) / 33);
          var4_int = param2.b(77, param0);
          var5 = param2.a(-1, param1, var4_int);
          stackIn_1_0 = ac.a(var4_int, var5, param2, false);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_4_0 = var4;
          stackIn_4_1 = new StringBuilder().append("pc.A(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          stackIn_7_1 = ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',');
          if (param1 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          stackIn_10_1 = ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',');
          if (param2 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ch.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param3).append(')').toString());
        }
    }

    final static boolean b(int param0) {
        Object var1 = null;
        int var2 = 0;
        Throwable var3 = null;
        boolean stackIn_6_0 = false;
        Throwable decompiledCaughtException = null;
        var1 = el.field_n;
        synchronized (var1) {
          if (bf.field_B == bg.field_l) {
            return false;
          }
          ch.field_d = te.field_c[bg.field_l];
          var2 = -67 % ((param0 + 82) / 39);
          sg.field_n = hf.field_h[bg.field_l];
          bg.field_l = 127 & 1 + bg.field_l;
          stackIn_6_0 = true;
        }
        return stackIn_6_0;
    }

    public static void c(int param0) {
        field_a = null;
        if (param0 != 1) {
          field_b = -120;
        }
    }

    static {
    }
}
