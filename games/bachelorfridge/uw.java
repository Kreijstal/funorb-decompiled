/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class uw extends eo {
    static kia field_o;
    byte[] field_n;

    final static void e(int param0) {
        kv var1 = null;
        kv var2 = null;
        int var3 = 0;
        int var4 = BachelorFridge.field_y;
        try {
            var1 = new kv(540, 140);
            bu.a(0, var1);
            jb.d();
            dg.d();
            ur.field_d = 0;
            tc.b(-8144);
            var2 = var1.a();
            if (param0 != 65536) {
                field_o = (kia) null;
            }
            for (var3 = 0; 15 > var3; var3++) {
                var2.c(-2, -2, 16777215);
                dg.a(4, 4, 0, 0, 540, 140);
            }
            rg.field_j.b();
            var1.f(0, 0);
            db.b(78);
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "uw.B(" + param0 + ')');
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 != 6144) {
            field_o = (kia) null;
        }
    }

    final static void g(int param0) {
        int discarded$8 = 0;
        int discarded$9 = 0;
        int discarded$10 = 0;
        int discarded$11 = 0;
        int discarded$12 = 0;
        int discarded$13 = 0;
        int discarded$14 = 0;
        int discarded$15 = 0;
        jb.field_d = false;
        jb.b(1.0f);
        if (param0 <= -127) {
          jb.d();
          mu.field_j = new int[]{0, 0, -270, 65536, 0, 0, 0, 69632, 0, 0, 0, 65536};
          lka.field_G = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          discarded$8 = via.a(6144, (byte) 71);
          discarded$9 = ft.a(6144, (byte) -128);
          discarded$10 = ft.a(6144, (byte) -128);
          discarded$11 = via.a(6144, (byte) 66);
          jb.b(320, 240);
          return;
        } else {
          field_o = (kia) null;
          jb.d();
          mu.field_j = new int[]{0, 0, -270, 65536, 0, 0, 0, 69632, 0, 0, 0, 65536};
          lka.field_G = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
          discarded$12 = via.a(6144, (byte) 71);
          discarded$13 = ft.a(6144, (byte) -128);
          discarded$14 = ft.a(6144, (byte) -128);
          discarded$15 = via.a(6144, (byte) 66);
          jb.b(320, 240);
          return;
        }
    }

    uw(byte[] param0) {
        try {
            this.field_n = param0;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "uw.<init>(" + (param0 != null ? "{...}" : "null") + ')');
        }
    }

    static {
    }
}
