/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class mg extends hn implements hi {
    static int field_i;
    static ak field_h;
    static String field_g;
    static String field_k;
    static boolean field_l;
    private c field_j;

    public static void d(int param0) {
        field_g = null;
        field_h = null;
        field_k = null;
        int var1 = 57 / ((-8 - param0) / 42);
    }

    abstract String a(int param0, String param1);

    final String c(int param0) {
        if (param0 != -1) {
          boolean discarded$2 = ((mg) this).a(10);
          return ((mg) this).a(-128, ((mg) this).field_j.field_q);
        } else {
          return ((mg) this).a(-128, ((mg) this).field_j.field_q);
        }
    }

    public final boolean a(int param0) {
        int stackIn_5_0 = 0;
        int stackOut_3_0 = 0;
        if (param0 == -22265) {
          if (null != ((mg) this).field_j.field_q) {
            if (((mg) this).field_j.field_q.length() == 0) {
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

    abstract dj a(String param0, boolean param1);

    public final void a(int param0, c param1) {
        ((mg) this).b(2048);
        int var3 = -22 % ((-30 - param0) / 60);
    }

    public final void a(c param0, int param1) {
        if (param1 != 4) {
            field_i = -81;
        }
    }

    final dj a(boolean param0) {
        Object var3 = null;
        if (!param0) {
          var3 = null;
          String discarded$2 = ((mg) this).a(17, (String) null);
          return ((mg) this).a(((mg) this).field_j.field_q, param0);
        } else {
          return ((mg) this).a(((mg) this).field_j.field_q, param0);
        }
    }

    mg(c param0) {
        ((mg) this).field_j = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Shortcut Reference";
        field_k = "Options Menu";
    }
}
