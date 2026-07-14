/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class ke {
    static int field_f;
    static int field_e;
    static int field_c;
    static ci field_b;
    static fa field_d;
    static String field_g;
    static bg[] field_a;

    final static void a(byte param0) {
        if (param0 > -100) {
            field_f = -51;
        }
    }

    final static void b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        var2 = Terraphoenix.field_V;
        if (param0) {
          return;
        } else {
          var1 = 0;
          L0: while (true) {
            if (4 <= var1) {
              return;
            } else {
              sj.field_a[var1] = new lg(var1);
              var1++;
              continue L0;
            }
          }
        }
    }

    abstract byte[] c(boolean param0);

    abstract void a(byte[] param0, boolean param1);

    final static void a(java.applet.Applet param0, byte param1) {
        bl.field_e = true;
        String var2 = "tuhstatbut";
        String var3 = "rvnadlm";
        long var4 = -1L;
        ll.a(var3, var4, (byte) 116, param0, var2);
        int var6 = -64 / ((param1 - -40) / 38);
    }

    public static void a(boolean param0) {
        field_g = null;
        if (param0) {
          field_g = null;
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        } else {
          field_d = null;
          field_b = null;
          field_a = null;
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        kk.a(50, 100);
        field_g = "Left click to select destination";
    }
}
