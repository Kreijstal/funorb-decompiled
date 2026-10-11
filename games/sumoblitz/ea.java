/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ea {
    static ts field_a;
    static String field_b;

    public static void b(int param0) {
        int var1 = -48 % ((-58 - param0) / 49);
        field_a = null;
        field_b = null;
    }

    final static al a(int param0) {
        if (param0 != 14263) {
          field_b = (String) null;
          return sj.field_c;
        }
        return sj.field_c;
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        RuntimeException var3 = null;
        int stackIn_3_0 = 0;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -73) {
            field_b = (String) null;
          }
          stackIn_3_0 = uv.a(param2, param1, true, (byte) -86);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("ea.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param2).append(')').toString());
        }
    }

    final static void a(int param0, boolean param1, String param2, boolean param3) {
        iu.a((byte) -124);
        if (param0 != 1) {
          return;
        }
        try {
          rf.field_a.a((byte) -34);
          no.field_a = new cv(ac.field_F, (String) null, pg.field_a, param3, param1);
          vi.field_y = new dc(rf.field_a, no.field_a);
          rf.field_a.a((byte) 104, vi.field_y);
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ea.F(" + param0 + ',' + param1 + ',' + (param2 != null ? "{...}" : "null") + ',' + param3 + ')');
        }
    }

    final static boolean a(byte param0, char param1) {
        if (param0 != -54) {
          return false;
        }
        if (param1 < 48) {
          return false;
        }
        if (57 < param1) {
          return false;
        }
        return true;
    }

    final static boolean a(String param0, byte param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 != -25) {
            field_b = (String) null;
          }
          var3 = (CharSequence) ((Object) param0);
          stackIn_3_0 = tc.field_f.equals(uk.a(param1 ^ 24, var3));
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("ea.G(");
          if (param0 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void a(ki param0, boolean param1, byte param2, ki param3, ki param4) {
        ut.field_o = aj.a(false, "");
        ut.field_o.a(113, false);
        da.a(param4, param3, 17474, param0);
        if (param2 < 20) {
          return;
        }
        try {
          ro.b(246);
          vm.field_c = hm.field_a;
          nw.field_e = hm.field_a;
        } catch (RuntimeException runtimeException) {
          throw qo.a((Throwable) ((Object) runtimeException), "ea.C(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ',' + param2 + ',' + (param3 != null ? "{...}" : "null") + ',' + (param4 != null ? "{...}" : "null") + ')');
        }
    }

    static {
        field_a = new ts(12, 0, 1, 0);
        field_b = "Difficulty: ";
    }
}
