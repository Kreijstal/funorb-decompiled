/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class eg {
    static int field_i;
    static bb field_h;
    static ag field_a;
    static int field_e;
    static vd field_c;
    static String field_b;
    static String field_g;
    static nh field_d;
    static he[] field_f;

    final static int a(int param0, int param1) {
        int var2 = 0;
        if ((param1 & 7) != 0) {
          var2 = -(param1 & 7) + 8;
        }
        int var3 = param1 + var2;
        if (param0 == -17077) {
          return var3;
        }
        field_f = (he[]) null;
        return var3;
    }

    final static sd[] b(byte param0) {
        if (param0 < -103) {
          return new sd[]{p.field_d, ka.field_q, mf.field_A};
        }
        eg.a(99, 71);
        return new sd[]{p.field_d, ka.field_q, mf.field_A};
    }

    final static int a(int param0, int param1, CharSequence param2) {
        RuntimeException var3 = null;
        int stackIn_2_0 = 0;
        int stackIn_4_0 = 0;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_8_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param1 >= 69) {
            stackIn_4_0 = fj.a(param0, param2, 84, true);
            return stackIn_4_0;
          }
          stackIn_2_0 = 87;
          return stackIn_2_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_7_0 = var3;
          stackIn_7_1 = new StringBuilder().append("eg.E(").append(param0).append(',').append(param1).append(',');
          if (param2 == null) {
            stackIn_8_2 = "null";
          } else {
            stackIn_8_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_7_0), ((StringBuilder) (Object) stackIn_7_1).append(stackIn_8_2).append(')').toString());
        }
    }

    public static void a(int param0) {
        if (param0 == -1) {
          field_f = null;
          field_b = null;
          field_h = null;
          field_c = null;
          field_d = null;
          field_a = null;
          field_g = null;
          return;
        }
    }

    final static void a(byte param0) {
        if (uj.field_j != null) {
          uj.field_j.b(50);
          uj.field_j = null;
        }
        if (param0 != 126) {
          eg.b((byte) 72);
          return;
        }
    }

    final static nh[] a(byte param0, int param1, int param2, int param3) {
        if (param0 >= 66) {
          return af.a(param1, 1, param2, (byte) 32, param3);
        }
        eg.b((byte) 0);
        return af.a(param1, 1, param2, (byte) 32, param3);
    }

    static {
        field_i = 0;
        field_h = new bb();
        field_e = 4;
        field_c = new vd();
        field_b = "Please try again in a few minutes.";
        field_g = "Change display name";
    }
}
