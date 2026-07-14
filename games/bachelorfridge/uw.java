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
        int var4 = 0;
        var4 = BachelorFridge.field_y;
        var1 = new kv(540, 140);
        bu.a(0, var1);
        jb.d();
        dg.d();
        ur.field_d = 0;
        tc.b(-8144);
        var2 = var1.a();
        if (param0 != 65536) {
          field_o = null;
          var3 = 0;
          L0: while (true) {
            if (15 <= var3) {
              rg.field_j.b();
              var1.f(0, 0);
              db.b(78);
              return;
            } else {
              var2.c(-2, -2, 16777215);
              dg.a(4, 4, 0, 0, 540, 140);
              var3++;
              continue L0;
            }
          }
        } else {
          var3 = 0;
          L1: while (true) {
            if (15 <= var3) {
              rg.field_j.b();
              var1.f(0, 0);
              db.b(78);
              return;
            } else {
              var2.c(-2, -2, 16777215);
              dg.a(4, 4, 0, 0, 540, 140);
              var3++;
              continue L1;
            }
          }
        }
    }

    public static void f(int param0) {
        field_o = null;
        if (param0 != 6144) {
            field_o = null;
        }
    }

    final static void g(int param0) {
        L0: {
          jb.field_d = false;
          jb.b(1.0f);
          if (param0 <= -127) {
            jb.d();
            break L0;
          } else {
            field_o = null;
            break L0;
          }
        }
        jb.d();
        jb.d();
        mu.field_j = new int[]{0, 0, -270, 65536, 0, 0, 0, 69632, 0, 0, 0, 65536};
        lka.field_G = new int[]{0, 0, 0, 65536, 0, 0, 0, 65536, 0, 0, 0, 65536};
        int discarded$4 = via.a(6144, (byte) 71);
        int discarded$5 = ft.a(6144, (byte) -128);
        int discarded$6 = ft.a(6144, (byte) -128);
        int discarded$7 = via.a(6144, (byte) 66);
        jb.b(320, 240);
    }

    uw(byte[] param0) {
        ((uw) this).field_n = param0;
    }

    static {
    }
}
