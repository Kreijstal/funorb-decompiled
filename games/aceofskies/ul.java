/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul extends sl {
    static un field_r;
    static String field_s;
    static String field_t;

    final static boolean a(String param0, byte param1) {
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        String stackIn_16_2 = null;
        RuntimeException decompiledCaughtException = null;
        var4 = AceOfSkies.field_G ? 1 : 0;
        try {
          for (var2_int = 0; var2_int < param0.length(); var2_int++) {
            var3 = param0.charAt(var2_int);
            if (!df.a((char) var3, 63) &&
              !oj.a((char) var3, (byte) -15)) {
              return true;
            }
          }
          if (param1 <= -103) {
            return false;
          }
          return true;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_15_0 = var2;
          stackIn_15_1 = new StringBuilder().append("ul.O(");
          if (param0 == null) {
            stackIn_16_2 = "null";
          } else {
            stackIn_16_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_15_0), ((StringBuilder) (Object) stackIn_15_1).append(stackIn_16_2).append(',').append(param1).append(')').toString());
        }
    }

    final String d(ea param0, int param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = -91 / ((3 - param1) / 35);
          stackIn_1_0 = pt.a((byte) -126, param0.field_f.length(), '*');
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("ul.AA(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw pn.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    private ul(hc param0, int param1) {
        super(param0, param1);
    }

    final static void a(boolean param0, boolean param1, int param2) {
        if (!param1) {
          vp.a();
        } else {
          vp.b(0, 0, vp.field_i, vp.field_c, 0, 192);
        }
        if (param2 != -7395) {
          field_t = (String) null;
        }
        si.a(param1, -32106);
    }

    ul(int param0) {
        this(qo.field_b, param0);
    }

    public static void a(byte param0) {
        field_t = null;
        field_r = null;
        int var1 = 11 / ((param0 + 50) / 55);
        field_s = null;
    }

    static {
        field_t = "Service unavailable";
    }
}
