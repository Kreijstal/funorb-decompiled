/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ul extends eo {
    static String field_o;
    int field_n;

    public static void b(boolean param0) {
        field_o = null;
    }

    abstract Object e(int param0);

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 1;
        param1 = param1 | param1 >>> 2;
        if (param0 > -48) {
          field_o = null;
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return param1 + 1;
        } else {
          param1 = param1 | param1 >>> 4;
          param1 = param1 | param1 >>> 8;
          param1 = param1 | param1 >>> 16;
          return param1 + 1;
        }
    }

    abstract boolean f(int param0);

    ul(int param0) {
        ((ul) this).field_n = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "End Game";
    }
}
