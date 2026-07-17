/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rf extends vh {
    volatile boolean field_A;
    boolean field_x;
    static oa field_w;
    boolean field_C;
    static rh field_u;
    static int field_v;
    static String field_y;
    static String field_s;
    static int[] field_p;
    static boolean field_r;
    static String field_t;
    static ui[] field_B;
    static rh field_z;
    static String field_q;

    public static void a(boolean param0) {
        field_t = null;
        field_s = null;
        field_z = null;
        field_w = null;
        field_u = null;
        field_B = null;
        field_p = null;
        field_y = null;
        field_q = null;
    }

    abstract byte[] b(boolean param0);

    abstract int c(int param0);

    final static void d(byte param0) {
        Object var1 = null;
        Throwable var2 = null;
        Throwable decompiledCaughtException = null;
        if (null == a.field_d) {
          if (param0 < 81) {
            field_y = null;
            return;
          } else {
            return;
          }
        } else {
          var1 = (Object) (Object) a.field_d;
          synchronized (var1) {
            L0: {
              a.field_d = null;
              break L0;
            }
          }
          L1: {
            if (param0 >= 81) {
              break L1;
            } else {
              field_y = null;
              break L1;
            }
          }
          return;
        }
    }

    rf() {
        ((rf) this).field_A = true;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_w = new oa();
        field_y = "As you are under 13, we won't save your email address on our systems. Your email address will still be used to log in, but you won't recieve any emails from Jagex. For more information, please check the relevant parts of our <%0><hotspot=0>Terms and Conditions</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_s = "OBJECTIVE FAILED";
        field_t = "Undo troop placement";
        field_u = new rh(4, 1, 1, 1);
        field_B = new ui[]{new ui(0), new ui(1), new ui(2), new ui(3), new ui(4), new ui(5), new ui(6), new ui(7), new ui(8)};
        field_z = new rh(1, 2, 2, 0);
        field_q = "Reload ";
    }
}
