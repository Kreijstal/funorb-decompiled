/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static vn[] field_a;

    final static void a(int param0) {
        int var2 = 0;
        var2 = ZombieDawn.field_J;
        if (we.o((byte) -80)) {
          if (param0 > -100) {
            return;
          } else {
            boolean discarded$2 = wo.field_xb.a(um.field_a, ah.field_eb, true, true);
            wo.field_xb.g(-128);
            L0: while (true) {
              if (!on.b(102)) {
                return;
              } else {
                boolean discarded$3 = wo.field_xb.a(kg.field_i, (byte) 106, lc.field_c);
                continue L0;
              }
            }
          }
        } else {
          if (cn.field_b != null) {
            if (!cn.field_b.field_a) {
              return;
            } else {
              re.a((byte) -71);
              wo.field_xb.a((ga) (Object) new i(wo.field_xb, gf.field_b), true);
              return;
            }
          } else {
            return;
          }
        }
    }

    final static void a(byte param0) {
        if (param0 != -121) {
            return;
        }
        og.b(-123, 4);
    }

    public static void b(int param0) {
        if (param0 != 4) {
            mk.b(-103);
            field_a = null;
            return;
        }
        field_a = null;
    }

    static {
    }
}
