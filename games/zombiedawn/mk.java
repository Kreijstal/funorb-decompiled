/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mk {
    static vn[] field_a;

    final static void a(int param0) {
        int var2 = 0;
        RuntimeException decompiledCaughtException = null;
        RuntimeException var1 = null;
        var2 = ZombieDawn.field_J;
        try {
          if (!we.o((byte) -80)) {
            if (cn.field_b != null &&
              cn.field_b.field_a) {
              re.a((byte) -71);
              wo.field_xb.a(new i(wo.field_xb, gf.field_b), true);
            }
            return;
          }
          if (param0 > -100) {
            return;
          }
          wo.field_xb.a(um.field_a, ah.field_eb, true, true);
          wo.field_xb.g(-128);
          while (on.b(102)) {
            wo.field_xb.a(kg.field_i, (byte) 106, lc.field_c);
          }
          return;
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "mk.A(" + param0 + ')');
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
