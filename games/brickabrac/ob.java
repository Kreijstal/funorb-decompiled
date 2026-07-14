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
          int discarded$1 = ob.b((byte) 47, 6);
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
        Object var4 = null;
        if (!param1) {
          var4 = null;
          String discarded$2 = ((ob) this).a((oc) null, false);
          return sa.a('*', 122, param0.field_A.length());
        } else {
          return sa.a('*', 122, param0.field_A.length());
        }
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
