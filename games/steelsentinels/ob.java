/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ob extends ck {
    static ja field_t;
    static String field_x;
    static String field_w;
    static int field_o;
    static m field_r;
    static boolean field_u;
    int[] field_p;
    static String field_s;
    static volatile int field_q;
    static ek field_z;
    static boolean field_y;
    static boolean field_v;

    final static boolean a(byte param0, String param1) {
        RuntimeException var2 = null;
        CharSequence var3 = null;
        RuntimeException stackIn_14_0 = null;
        StringBuilder stackIn_14_1 = null;
        String stackIn_15_2 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          if (param0 != -38) {
            ob.d(118);
          }
          if (!jn.field_g) {
            return false;
          }
          if (ib.field_b == 2 &&
            bk.field_U != null) {
            var3 = (CharSequence) ((Object) param1);
            if (bk.field_U.equals(ui.a(1, var3))) {
              return true;
            }
          }
          return false;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2 = decompiledCaughtException;
          stackIn_14_0 = var2;
          stackIn_14_1 = new StringBuilder().append("ob.B(").append(param0).append(',');
          if (param1 == null) {
            stackIn_15_2 = "null";
          } else {
            stackIn_15_2 = "{...}";
          }
          throw ci.a((Throwable) ((Object) stackIn_14_0), ((StringBuilder) (Object) stackIn_14_1).append(stackIn_15_2).append(')').toString());
        }
    }

    public static void d(int param0) {
        if (param0 == 18601) {
          field_w = null;
          field_z = null;
          field_t = null;
          field_r = null;
          field_s = null;
          field_x = null;
          return;
        }
        ob.d(118);
        field_w = null;
        field_z = null;
        field_t = null;
        field_r = null;
        field_s = null;
        field_x = null;
    }

    private ob() throws Throwable {
        throw new Error();
    }

    static {
        field_t = new ja();
        field_u = false;
        field_w = "E";
        field_q = 0;
        field_s = "<%1> was destroyed";
        field_o = 0;
        field_x = "BOSS ";
        field_v = false;
    }
}
