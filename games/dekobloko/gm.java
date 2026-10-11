/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends di {
    static String field_J;
    static int field_H;
    static boolean field_I;

    final static void a(int param0, int param1) {
        ql.field_d = new int[3];
        kf.field_M = param1;
        pd.field_g = new hl[param1 * 15];
        if (param0 == -3504) {
          ic.field_c = 0;
          return;
        }
        field_J = (String) null;
        ic.field_c = 0;
    }

    private gm(mm param0, int param1) {
        super(param0, param1);
    }

    gm(int param0) {
        this(hh.field_e, param0);
    }

    public static void d(int param0) {
        int var1 = 85 / ((-16 - param0) / 51);
        field_J = null;
    }

    final String b(ce param0, byte param1) {
        int var3_int = 0;
        RuntimeException var3 = null;
        String stackIn_1_0 = null;
        RuntimeException stackIn_4_0 = null;
        StringBuilder stackIn_4_1 = null;
        String stackIn_5_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          var3_int = 61 / ((param1 - 59) / 53);
          stackIn_1_0 = vb.a('*', param0.field_E.length(), -12681);
          return stackIn_1_0;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          stackIn_4_0 = var3;
          stackIn_4_1 = new StringBuilder().append("gm.D(");
          if (param0 == null) {
            stackIn_5_2 = "null";
          } else {
            stackIn_5_2 = "{...}";
          }
          throw dh.a((Throwable) ((Object) stackIn_4_0), ((StringBuilder) (Object) stackIn_4_1).append(stackIn_5_2).append(',').append(param1).append(')').toString());
        }
    }

    final static void b(int param0, int param1) {
        uf var2 = null;
        uf var2Lifetime1;
        if (param1 > 35) {
          var2 = we.field_b;
          var2.f(param0, -4);
          var2.a(true, 1);
          var2.a(true, 2);
          return;
        }
        field_J = (String) null;
        var2Lifetime1 = we.field_b;
        var2Lifetime1.f(param0, -4);
        var2Lifetime1.a(true, 1);
        var2Lifetime1.a(true, 2);
    }

    static {
        field_J = "OK";
    }
}
