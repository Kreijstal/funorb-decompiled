/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class rka {
    int field_c;
    int field_e;
    int field_a;
    int field_b;
    int field_f;
    int field_d;

    abstract void a(int param0, int param1, int param2);

    final static void a(String param0) {
        try {
            int discarded$0 = -55;
            wta.a(param0);
            vn.a(100, gja.field_bb, false);
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) (Object) runtimeException, "rka.E(" + (param0 != null ? "{...}" : "null") + ',' + false + ')');
        }
    }

    final static void a() {
        kn.field_p = null;
        eda.field_f = null;
        qf.field_j = null;
        qr.field_v = null;
        System.gc();
    }

    abstract void b(int param0, int param1);

    final static String a(int param0, boolean param1) {
        return 1 + param0 + "/" + 11;
    }

    final static String a(int param0) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        L0: {
          var2 = param0;
          if (var2 > 20) {
            var2 = var2 % 10;
            break L0;
          } else {
            break L0;
          }
        }
        var3 = 7;
        var4 = var2;
        if (var4 != 1) {
          if (var4 != 2) {
            if (3 != var4) {
              return param0 + "th";
            } else {
              return param0 + "rd";
            }
          } else {
            return param0 + "nd";
          }
        } else {
          return param0 + "st";
        }
    }

    static {
    }
}
