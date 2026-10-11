/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bc {
    static int field_a;
    static String field_b;

    final static void a(int param0) {
        da.field_b = false;
        if (param0 != -464379825) {
          field_a = 5;
        }
        rd.field_j.f(96);
    }

    static int a(int param0, int param1) {
        return param0 & param1;
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
          field_a = -21;
        }
    }

    final static void a(boolean param0, pb param1) {
        cg.field_h = param1.d((byte) 72) << 5;
        int var2_int = param1.f(-128);
        cg.field_h = cg.field_h + (var2_int >> 3);
        sa.field_a = (7 & var2_int) << 18;
        sa.field_a = sa.field_a + (param1.d((byte) 72) << 2);
        var2_int = param1.f(123);
        pc.field_c = 2064384 & var2_int << 15;
        sa.field_a = sa.field_a + (var2_int >> 6);
        pc.field_c = pc.field_c + (param1.f(-107) << 7);
        var2_int = param1.f(90);
        if (param0) {
          return;
        }
        try {
          nl.field_b = 65536 & var2_int << 16;
          pc.field_c = pc.field_c + (var2_int >> 1);
          nl.field_b = nl.field_b + param1.d((byte) 72);
        } catch (RuntimeException runtimeException) {
          throw ma.a((Throwable) ((Object) runtimeException), "bc.B(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    final static StringBuilder a(StringBuilder param0, char param1, int param2, int param3) {
        int var5 = 0;
        int var4_int = 0;
        RuntimeException var4 = null;
        int var6 = 0;
        StringBuilder stackIn_7_0 = null;
        RuntimeException stackIn_10_0 = null;
        StringBuilder stackIn_10_1 = null;
        String stackIn_11_2 = null;
        RuntimeException decompiledCaughtException = null;
        var6 = Main.field_T;
        try {
          var4_int = param0.length();
          param0.setLength(param2);
          if (param3 != 2053368837) {
            field_b = (String) null;
          }
          for (var5 = var4_int; var5 < param2; var5++) {
            param0.setCharAt(var5, param1);
          }
          stackIn_7_0 = (StringBuilder) (param0);
          return stackIn_7_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_10_0 = var4;
          stackIn_10_1 = new StringBuilder().append("bc.C(");
          if (param0 == null) {
            stackIn_11_2 = "null";
          } else {
            stackIn_11_2 = "{...}";
          }
          throw ma.a((Throwable) ((Object) stackIn_10_0), ((StringBuilder) (Object) stackIn_10_1).append(stackIn_11_2).append(',').append(param1).append(',').append(param2).append(',').append(param3).append(')').toString());
        }
    }

    static {
    }
}
