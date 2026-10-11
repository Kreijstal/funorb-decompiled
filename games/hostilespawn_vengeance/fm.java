/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fm {
    static bd field_b;
    static bd[] field_a;
    static int[] field_c;

    final static void a(p param0, boolean param1, int param2, int[] param3) {
        int var4_int = 0;
        RuntimeException var4 = null;
        int stackIn_5_0 = 0;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_18_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (!param1) {
            field_a = (bd[]) null;
          }
          stackIn_5_0 = (param2 == 17) ? 3 : 6;
          var4_int = stackIn_5_0;
          if (param3[param0.field_j.b(-4)] != 2) {
            param0.field_l.a(var4_int, (byte) 94, param0.field_c);
          }
          param0.a(8573);
          param0.field_e = param0.field_e + 1;
          if (param0.field_e <= 32) {
            return;
          }
          param0.field_i = -1;
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var4 = decompiledCaughtException;
          stackIn_14_0 = var4;
          stackIn_14_1 = new StringBuilder().append("fm.B(");
          if (param0 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          stackIn_17_1 = ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(',').append(param1).append(',').append(param2).append(',');
          if (param3 == null) {
            stackIn_18_2 = "null";
          } else {
            stackIn_18_2 = "{...}";
          }
          throw wg.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_17_1).append(stackIn_18_2).append(')').toString());
        }
    }

    public static void a(byte param0) {
        if (param0 < -22) {
          field_a = null;
          field_b = null;
          field_c = null;
          return;
        }
        int[] var2 = (int[]) null;
        fm.a((p) null, true, -4, (int[]) null);
        field_a = null;
        field_b = null;
        field_c = null;
    }

    static {
        field_c = new int[8192];
    }
}
