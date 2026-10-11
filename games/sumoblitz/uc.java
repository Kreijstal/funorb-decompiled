/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uc {
    static ts field_d;
    static int field_f;
    static int[] field_b;
    static hr[] field_e;
    static hr field_a;
    static int[] field_c;

    final static long b(int param0) {
        if (param0 != 26560) {
          return -46L;
        }
        return -jt.field_x + wq.a(param0 - 26634);
    }

    final static boolean a(byte param0, wi param1) {
        RuntimeException var2 = null;
        boolean stackIn_3_0 = false;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -29) {
            uc.b(118);
          }
          stackIn_3_0 = param1.a((byte) -101);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("uc.A(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        field_c = null;
        field_a = null;
        int var1 = 98 % ((param0 + 76) / 49);
        field_d = null;
        field_e = null;
        field_b = null;
    }

    final static void a(ha param0, boolean param1) {
        RuntimeException var2 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1) {
            field_d = (ts) null;
          }
          if (!fq.field_f.a((byte) 91)) {
            return;
          }
          fq.field_f.a(param0, -4475);
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_7_0 = var2;
          stackIn_7_1 = new StringBuilder().append("uc.C(");
          if (param0 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw qo.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(',').append(param1).append(')').toString());
        }
    }

    static {
        field_d = new ts(15, 0, 1, 0);
    }
}
