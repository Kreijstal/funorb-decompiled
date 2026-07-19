/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static vn[] field_a;

    final static void a(int param0) {
        boolean discarded$15 = false;
        boolean discarded$16 = false;
        RuntimeException var1 = null;
        int var2 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var2 = ZombieDawn.field_J;
        try {
          L0: {
            if (we.o((byte) -80)) {
              if (param0 <= -100) {
                discarded$15 = wo.field_xb.a(um.field_a, ah.field_eb, true, true);
                wo.field_xb.g(-128);
                L1: while (true) {
                  if (!on.b(102)) {
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    discarded$16 = wo.field_xb.a(kg.field_i, (byte) 106, lc.field_c);
                    continue L1;
                  }
                }
              } else {
                decompiledRegionSelector0 = 1;
                break L0;
              }
            } else {
              L2: {
                if (cn.field_b == null) {
                  break L2;
                } else {
                  if (!cn.field_b.field_a) {
                    break L2;
                  } else {
                    re.a((byte) -71);
                    wo.field_xb.a(new i(wo.field_xb, gf.field_b), true);
                    break L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "mk.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return;
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
