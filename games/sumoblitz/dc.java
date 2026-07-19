/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class dc extends ur {
    static hr[] field_ab;
    static String field_bb;

    final void b(byte param0, pk param1) {
        try {
            if (param0 >= -87) {
                field_ab = (hr[]) null;
            }
            super.b((byte) -96, param1);
        } catch (RuntimeException runtimeException) {
            throw qo.a((Throwable) ((Object) runtimeException), "dc.E(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    dc(dg param0, pk param1) {
        super(param0, param1, 33, 20, 30);
    }

    public static void m(int param0) {
        if (param0 < 89) {
            field_bb = (String) null;
            field_ab = null;
            field_bb = null;
            return;
        }
        field_ab = null;
        field_bb = null;
    }

    final static void l(int param0) {
        int var1 = 0;
        if (param0 > kr.field_c) {
          var1 = kr.field_c % 32;
          lf.a(32 + (kr.field_c + -var1), (byte) -58);
          if (Sumoblitz.field_L) {
            lf.a(256, (byte) -58);
            return;
          } else {
            return;
          }
        } else {
          lf.a(256, (byte) -58);
          return;
        }
    }

    static {
        field_bb = "Type your age in years";
    }
}
