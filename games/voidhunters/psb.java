/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class psb {
    static int field_a;
    static ufb field_b;

    final static ge a(String param0, int param1) {
        if (param1 == 0) {
          if (wba.field_p.a(4)) {
            if (param0.equals((Object) (Object) wba.field_p.b(4))) {
              return wba.field_p;
            } else {
              wba.field_p = gi.a(param0, (byte) 110);
              return wba.field_p;
            }
          } else {
            return wba.field_p;
          }
        } else {
          return null;
        }
    }

    final static int a(byte[] param0, int param1, int param2) {
        Object var4 = null;
        if (param2 != 0) {
          var4 = null;
          ge discarded$2 = psb.a((String) null, 28);
          return k.a((byte) -69, param1, param0, 0);
        } else {
          return k.a((byte) -69, param1, param0, 0);
        }
    }

    public static void a(boolean param0) {
        field_b = null;
        if (param0) {
            Object var2 = null;
            ge discarded$0 = psb.a((String) null, -33);
        }
    }

    static {
    }
}
