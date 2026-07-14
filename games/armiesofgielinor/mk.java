/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mk extends rb implements fb {
    private fn field_g;
    static String field_f;
    static String field_d;
    static int field_e;
    static String field_i;
    static boolean field_h;

    public final boolean b(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 >= 12) {
          if (null != ((mk) this).field_g.field_v) {
            if (((mk) this).field_g.field_v.length() == 0) {
              return true;
            } else {
              return false;
            }
          } else {
            stackOut_3_0 = 1;
            stackIn_5_0 = stackOut_3_0;
            return stackIn_5_0 != 0;
          }
        } else {
          return true;
        }
    }

    abstract gu a(int param0, String param1);

    public final void b(fn param0, int param1) {
        ((mk) this).a(126);
        int var3 = 59 % ((-80 - param1) / 33);
    }

    mk(fn param0) {
        ((mk) this).field_g = param0;
    }

    abstract String a(byte param0, String param1);

    final String b(byte param0) {
        if (param0 != -71) {
          field_h = false;
          return ((mk) this).a((byte) 115, ((mk) this).field_g.field_v);
        } else {
          return ((mk) this).a((byte) 115, ((mk) this).field_g.field_v);
        }
    }

    final gu c(int param0) {
        int var2 = 85 / ((56 - param0) / 32);
        return ((mk) this).a(-3137, ((mk) this).field_g.field_v);
    }

    public final void a(fn param0, int param1) {
        if (param1 != 80) {
            field_i = null;
        }
    }

    public static void f(int param0) {
        field_d = null;
        if (param0 != -1) {
            field_i = null;
            field_f = null;
            field_i = null;
            return;
        }
        field_f = null;
        field_i = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = null;
        field_d = "A detailed explanation of each rule can be found through the link on our website.<br>(in the Help Section)";
        field_e = -1;
        field_i = "STRENGTH";
        field_h = true;
    }
}
