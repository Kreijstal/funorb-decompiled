/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gm extends hl {
    int field_mb;
    static int[][] field_kb;
    String field_jb;
    static String field_ib;
    String field_lb;
    static int field_ob;
    static int field_nb;

    final static void e(byte param0) {
        int var1 = 0;
        Object var2 = null;
        Throwable var3 = null;
        Throwable decompiledCaughtException = null;
        var1 = 1;
        if (sg.field_i != null) {
          var2 = (Object) (Object) sg.field_i;
          synchronized (var2) {
            L0: {
              sg.field_i = null;
              break L0;
            }
          }
          return;
        } else {
          return;
        }
    }

    public static void c(boolean param0) {
        field_ib = null;
        field_kb = null;
    }

    gm() {
        super(0L, (hl) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_ib = "<%0>Bridge:<%1> these collapse as the fleas run across so that only one flea gets over, and the others fall down behind.";
    }
}
