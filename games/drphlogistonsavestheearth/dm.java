/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dm extends mj {
    static he[] field_z;
    static ok field_x;
    static ej[] field_B;
    static vi field_A;
    static he[] field_y;

    final String b(int param0, vg param1) {
        RuntimeException var3 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 > -101) {
            dm.d((byte) 96);
          }
          stackIn_3_0 = qj.a(param1.field_p.length(), '*', -77);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_6_0 = var3;
          stackIn_6_1 = new StringBuilder().append("dm.M(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static String a(int param0, CharSequence[] param1) {
        RuntimeException var2 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != 0) {
            dm.c((byte) 87);
          }
          stackIn_3_0 = fi.a(param1.length, (byte) -33, 0, param1);
          return stackIn_3_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_6_0 = var2;
          stackIn_6_1 = new StringBuilder().append("dm.W(").append(param0).append(',');
          if (param1 == null) {
            stackIn_7_2 = "null";
          } else {
            stackIn_7_2 = "{...}";
          }
          throw ie.a((Throwable) ((Object) stackIn_6_0), ((StringBuilder) (Object) stackIn_6_1).append(stackIn_7_2).append(')').toString());
        }
    }

    final static void c(byte param0) {
        if (param0 < 58) {
          return;
        }
        ac.field_h = null;
        bd.field_S = null;
    }

    public static void d(byte param0) {
        field_A = null;
        if (param0 < -125) {
          field_z = null;
          field_y = null;
          field_x = null;
          field_B = null;
          return;
        }
        dm.d((byte) 37);
        field_z = null;
        field_y = null;
        field_x = null;
        field_B = null;
    }

    private dm(rf param0, int param1) {
        super(param0, param1);
    }

    final static int d(int param0) {
        fl.field_a.a(64);
        if (param0 >= -18) {
          return -62;
        }
        if (!p.field_a.b(false)) {
          return vj.e((byte) -95);
        }
        return 0;
    }

    dm(int param0) {
        this(uh.field_i, param0);
    }

    static {
        field_A = new vi();
    }
}
