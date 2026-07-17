/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends r {
    static int field_I;
    static ra field_J;
    static String field_H;
    static bi field_D;
    static vl field_E;
    static long field_G;
    static vl field_F;

    public static void b() {
        field_F = null;
        field_E = null;
        field_H = null;
        field_J = null;
        field_D = null;
    }

    final static int b(byte param0, int param1) {
        if (param0 > -84) {
          int discarded$1 = ob.b((byte) 47, 6);
          param1 = ((param1 & -1431655766) >>> 1) + (1431655765 & param1);
          param1 = ((param1 & -858993460) >>> 2) + (param1 & 858993459);
          param1 = (param1 >>> 4) + param1 & 252645135;
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return 255 & param1;
        } else {
          param1 = ((param1 & -1431655766) >>> 1) + (1431655765 & param1);
          param1 = ((param1 & -858993460) >>> 2) + (param1 & 858993459);
          param1 = (param1 >>> 4) + param1 & 252645135;
          param1 = param1 + (param1 >>> 8);
          param1 = param1 + (param1 >>> 16);
          return 255 & param1;
        }
    }

    ob(int param0) {
        this(a.field_u, param0);
    }

    final String a(oc param0, boolean param1) {
        RuntimeException var3 = null;
        Object var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_5_0 = null;
        StringBuilder stackIn_5_1 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_2_0 = null;
        RuntimeException stackOut_4_0 = null;
        StringBuilder stackOut_4_1 = null;
        RuntimeException stackOut_6_0 = null;
        StringBuilder stackOut_6_1 = null;
        String stackOut_6_2 = null;
        RuntimeException stackOut_5_0 = null;
        StringBuilder stackOut_5_1 = null;
        String stackOut_5_2 = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var4 = null;
                String discarded$2 = ((ob) this).a((oc) null, false);
                break L1;
              }
            }
            stackOut_2_0 = sa.a('*', 122, param0.field_A.length());
            stackIn_3_0 = stackOut_2_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackOut_4_0 = (RuntimeException) var3;
            stackOut_4_1 = new StringBuilder().append("ob.Q(");
            stackIn_6_0 = stackOut_4_0;
            stackIn_6_1 = stackOut_4_1;
            stackIn_5_0 = stackOut_4_0;
            stackIn_5_1 = stackOut_4_1;
            if (param0 == null) {
              stackOut_6_0 = (RuntimeException) (Object) stackIn_6_0;
              stackOut_6_1 = (StringBuilder) (Object) stackIn_6_1;
              stackOut_6_2 = "null";
              stackIn_7_0 = stackOut_6_0;
              stackIn_7_1 = stackOut_6_1;
              stackIn_7_2 = stackOut_6_2;
              break L2;
            } else {
              stackOut_5_0 = (RuntimeException) (Object) stackIn_5_0;
              stackOut_5_1 = (StringBuilder) (Object) stackIn_5_1;
              stackOut_5_2 = "{...}";
              stackIn_7_0 = stackOut_5_0;
              stackIn_7_1 = stackOut_5_1;
              stackIn_7_2 = stackOut_5_2;
              break L2;
            }
          }
          throw qb.a((Throwable) (Object) stackIn_7_0, stackIn_7_2 + 44 + param1 + 41);
        }
        return stackIn_3_0;
    }

    private ob(dh param0, int param1) {
        super(param0, param1);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_H = "Add <%0> to ignore list";
        field_I = -1;
        field_E = new vl();
        field_F = new vl();
    }
}
