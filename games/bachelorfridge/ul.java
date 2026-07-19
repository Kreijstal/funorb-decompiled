/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ul extends eo {
    static String field_o;
    int field_n;

    public static void b(boolean param0) {
        if (param0) {
            field_o = (String) null;
            field_o = null;
            return;
        }
        field_o = null;
    }

    abstract Object e(int param0);

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> 999823585;
        param1 = param1 | param1 >>> 2040846850;
        if (param0 > -48) {
          field_o = (String) null;
          param1 = param1 | param1 >>> -1527520284;
          param1 = param1 | param1 >>> -580620856;
          param1 = param1 | param1 >>> 1551319728;
          return param1 + 1;
        } else {
          param1 = param1 | param1 >>> -1527520284;
          param1 = param1 | param1 >>> -580620856;
          param1 = param1 | param1 >>> 1551319728;
          return param1 + 1;
        }
    }

    abstract boolean f(int param0);

    ul(int param0) {
        this.field_n = param0;
    }

    static {
        field_o = "End Game";
    }
}
