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

    final static void a(String param0, boolean param1) {
        try {
          wta.a(param0, (byte) -55);
          vn.a(100, gja.field_bb, param1);
        } catch (RuntimeException runtimeException) {
          throw tba.a((Throwable) ((Object) runtimeException), "rka.E(" + (param0 != null ? "{...}" : "null") + ',' + param1 + ')');
        }
    }

    final static void a(boolean param0) {
        kn.field_p = null;
        if (param0) {
          return;
        }
        eda.field_f = null;
        qf.field_j = null;
        qr.field_v = null;
        System.gc();
    }

    abstract void b(int param0, int param1);

    final static String a(int param0, boolean param1) {
        if (param1) {
          return 1 + param0 + "/" + 11;
        }
        return (String) null;
    }

    final static String a(int param0, int param1) {
        int var2 = param0;
        if (var2 > 20) {
          var2 = var2 % 10;
        }
        int var3 = -23 / ((-16 - param1) / 42);
        int var4 = var2;
        if (var4 == 1) {
          return param0 + "st";
        }
        if (var4 == 2) {
          return param0 + "nd";
        }
        if (3 == var4) {
          return param0 + "rd";
        }
        return param0 + "th";
    }

    static {
    }
}
