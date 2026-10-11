/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uf extends tj {
    static String field_o;
    static dg field_m;
    static String field_l;
    static int field_n;

    final static void a(int param0, int param1, int param2, byte param3, int param4, int param5, int param6, int param7, int param8, int param9, int param10, int param11, int param12, int param13, int param14, int param15) {
        int var17;
        var17 = Lexicominos.field_L ? 1 : 0;
        if (param9 < param6) {
          if (param15 > param6) {
            ul.a(param2, param15, param0, param9, lf.field_b, param11, param6, param10, param14, param8, param7, param12, -1464114640, param1, param5, param13, param4);
          } else {
            if (param15 > param9) {
              ul.a(param7, param6, param13, param9, lf.field_b, param11, param15, param10, param5, param4, param2, param12, -1464114640, param1, param14, param0, param8);
            } else {
              ul.a(param7, param6, param13, param15, lf.field_b, param2, param9, param14, param5, param1, param11, param0, -1464114640, param4, param10, param12, param8);
            }
          }
        } else {
          if (param15 > param9) {
            ul.a(param2, param15, param0, param6, lf.field_b, param7, param9, param5, param14, param1, param11, param13, -1464114640, param8, param10, param12, param4);
          } else {
            if (param6 < param15) {
              ul.a(param11, param9, param12, param6, lf.field_b, param7, param15, param5, param10, param4, param2, param13, param3 - 1464114612, param8, param14, param0, param1);
            } else {
              ul.a(param11, param9, param12, param15, lf.field_b, param2, param6, param14, param10, param8, param7, param0, param3 - 1464114612, param4, param5, param13, param1);
            }
          }
        }
        if (param3 == -28) {
          return;
        }
        field_n = -121;
    }

    public static void c(boolean param0) {
        field_l = null;
        field_o = null;
        if (param0) {
          return;
        }
        field_m = null;
    }

    final String a(byte param0, String param1) {
        RuntimeException var3 = null;
        String stackIn_2_0 = null;
        String stackIn_6_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (this.a(param0 ^ -126, param1) == ni.field_b) {
            stackIn_2_0 = ok.field_d;
            return stackIn_2_0;
          }
          if (param0 == -126) {
            return null;
          }
          stackIn_6_0 = (String) null;
          return stackIn_6_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_10_0 = var3;
          stackIn_10_1 = new StringBuilder().append("uf.F(").append(param0).append(',');
          if (param1 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(')').toString());
        }
    }

    uf(rl param0) {
        super(param0);
    }

    final sc a(int param0, String param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        CharSequence var4 = null;
        CharSequence var5 = null;
        sc stackIn_4_0 = null;
        sc stackIn_9_0 = null;
        RuntimeException stackIn_12_0 = null;
        StringBuilder stackIn_12_1 = null;
        String stackIn_13_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            field_m = (dg) null;
          }
          var4 = (CharSequence) ((Object) param1);
          if (!bc.a(false, var4)) {
            stackIn_4_0 = ni.field_b;
            return stackIn_4_0;
          }
          var5 = (CharSequence) ((Object) param1);
          var3_int = si.a((byte) 123, var5);
          if (var3_int > 0 &&
            130 >= var3_int) {
            return rh.field_p;
          }
          stackIn_9_0 = ni.field_b;
          return stackIn_9_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_12_0 = var3;
          stackIn_12_1 = new StringBuilder().append("uf.H(").append(param0).append(',');
          if (param1 == null) {
            stackIn_13_2 = "null";
          } else {
            stackIn_13_2 = "{...}";
          }
          throw ld.a((Throwable) ((Object) stackIn_12_0), ((StringBuilder) (Object) stackIn_12_1).append(stackIn_13_2).append(')').toString());
        }
    }

    final static void a(String param0, int param1, String param2, boolean param3) {
        try {
          dd.field_d = param0;
          rf.field_b = param2;
          m.a(ca.field_o, -118, param3);
          int var4_int = -15 % ((param1 - 43) / 40);
        } catch (RuntimeException runtimeException) {
          throw ld.a((Throwable) ((Object) runtimeException), "uf.A(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    static {
        field_o = "Age:";
        field_l = "This password contains your Player Name, and would be easy to guess";
        field_n = -1;
    }
}
