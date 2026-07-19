/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jea {
    int field_b;
    int field_a;
    int field_e;
    static ofa field_c;
    static String field_d;

    final static void a(boolean param0) {
        if (!param0) {
          L0: {
            jea.a(25);
            lga.c((byte) 112);
            if (dca.field_y != null) {
              wd.a((byte) 70, dca.field_y);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            oda.a(-705481812);
            qi.b(-1);
            te.c((byte) 94);
            if (lt.a((byte) 99)) {
              sja.field_fb.c(1, (byte) 125);
              hna.a(0, 68);
              break L1;
            } else {
              break L1;
            }
          }
          vc.a((byte) -96);
          return;
        } else {
          L2: {
            lga.c((byte) 112);
            if (dca.field_y != null) {
              wd.a((byte) 70, dca.field_y);
              break L2;
            } else {
              break L2;
            }
          }
          L3: {
            oda.a(-705481812);
            qi.b(-1);
            te.c((byte) 94);
            if (lt.a((byte) 99)) {
              sja.field_fb.c(1, (byte) 125);
              hna.a(0, 68);
              break L3;
            } else {
              break L3;
            }
          }
          vc.a((byte) -96);
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != 1) {
            field_c = (ofa) null;
            field_c = null;
            field_d = null;
            return;
        }
        field_c = null;
        field_d = null;
    }

    static {
        field_d = "<%0> wins!";
    }
}
