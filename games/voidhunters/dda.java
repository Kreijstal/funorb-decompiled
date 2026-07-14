/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dda extends dg implements uq {
    static mka[] field_d;
    static String field_c;

    public final int a(boolean param0) {
        if (!param0) {
            return 79;
        }
        return 0;
    }

    public static void a(int param0) {
        if (param0 != 0) {
            field_d = null;
            field_d = null;
            field_c = null;
            return;
        }
        field_d = null;
        field_c = null;
    }

    final static void a(int param0, int param1) {
        if (null == dw.field_a) {
          dw.field_a = new int[param0];
          if (param1 > 52) {
            return;
          } else {
            field_d = null;
            return;
          }
        } else {
          if (dw.field_a.length < param0) {
            dw.field_a = new int[param0];
            if (param1 <= 52) {
              field_d = null;
              return;
            } else {
              return;
            }
          } else {
            if (param1 > 52) {
              return;
            } else {
              field_d = null;
              return;
            }
          }
        }
    }

    final static void a(int param0, boolean param1) {
        if (param0 != 18090) {
            field_d = null;
            ll.field_o = param1;
            return;
        }
        ll.field_o = param1;
    }

    dda(qfa param0, int param1, byte[] param2, int param3) {
        super(param0, param2, param3);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        field_d = new mka[255];
        for (var0 = 0; field_d.length > var0; var0++) {
            field_d[var0] = new mka();
        }
        field_c = "Unrated game";
    }
}
