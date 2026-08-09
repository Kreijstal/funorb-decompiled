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

    public static void b(int param0) {
        field_F = null;
        field_E = null;
        if (param0 >= -55) {
            return;
        }
        field_H = null;
        field_J = null;
        field_D = null;
    }

    final static int b(byte param0, int param1) {
        if (param0 > -84) {
          ob.b((byte) 47, 6);
          param1 = ((param1 & -1431655766) >>> 855225153) + (1431655765 & param1);
          param1 = ((param1 & -858993460) >>> 1729646082) + (param1 & 858993459);
          param1 = (param1 >>> 1327714020) + param1 & 252645135;
          param1 = param1 + (param1 >>> -339374712);
          param1 = param1 + (param1 >>> -185059984);
          return 255 & param1;
        } else {
          param1 = ((param1 & -1431655766) >>> 855225153) + (1431655765 & param1);
          param1 = ((param1 & -858993460) >>> 1729646082) + (param1 & 858993459);
          param1 = (param1 >>> 1327714020) + param1 & 252645135;
          param1 = param1 + (param1 >>> -339374712);
          param1 = param1 + (param1 >>> -185059984);
          return 255 & param1;
        }
    }

    ob(int param0) {
        this(a.field_u, param0);
    }

    final String a(oc param0, boolean param1) {
        RuntimeException var3 = null;
        oc var4 = null;
        String stackIn_3_0 = null;
        RuntimeException stackIn_6_0 = null;
        StringBuilder stackIn_6_1 = null;
        RuntimeException stackIn_7_0 = null;
        StringBuilder stackIn_7_1 = null;
        String stackIn_7_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param1) {
                break L1;
              } else {
                var4 = (oc) null;
                this.a((oc) null, false);
                break L1;
              }
            }
            stackIn_3_0 = sa.a('*', 122, param0.field_A.length());
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L2: {
            var3 = decompiledCaughtException;
            stackIn_6_0 = (RuntimeException) (var3);

            stackIn_6_1 = new StringBuilder().append("ob.Q(");

            if (param0 == null) {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "null";
              break L2;
            } else {
              stackIn_7_0 = (RuntimeException) ((Object) stackIn_6_0);
              stackIn_7_1 = (StringBuilder) ((Object) stackIn_6_1);
              stackIn_7_2 = "{...}";
              break L2;
            }
          }
          throw qb.a((Throwable) ((Object) stackIn_7_0), stackIn_7_2 + ',' + param1 + ')');
        }
        return stackIn_3_0;
    }

    private ob(dh param0, int param1) {
        super(param0, param1);
    }

    static {
        field_H = "Add <%0> to ignore list";
        field_I = -1;
        field_E = new vl();
        field_F = new vl();
    }
}
