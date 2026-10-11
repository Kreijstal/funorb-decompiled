/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mc {
    static int field_b;
    static k[] field_c;
    static int field_a;

    public static void a(byte param0) {
        if (param0 <= 82) {
          mc.a((byte) 110);
          field_c = null;
          return;
        }
        field_c = null;
    }

    final static void a(dd param0, String param1, int param2) {
        try {
          pa.field_k = param1;
          if (param2 != 0) {
            field_c = (k[]) null;
          }
          cd.field_b = param0;
        } catch (RuntimeException runtimeException) {
          throw pf.a((Throwable) ((Object) runtimeException), "mc.A(" + (param0 != null ? "{...}" : "null") + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ')');
        }
    }

    final static boolean b(byte param0) {
        int var1 = -121 % ((-69 - param0) / 40);
        if (ib.field_k < 20) {
          return true;
        }
        if (!nl.a(99)) {
          return true;
        }
        if (0 >= nb.field_h) {
          return false;
        }
        if (!lk.a(95)) {
          return true;
        }
        return false;
    }

    final static boolean a(int param0, byte param1) {
        if (param1 == -124) {
          return (-param0 & param0) == param0 ? true : false;
        }
        field_b = -97;
        return (-param0 & param0) == param0 ? true : false;
    }

    static {
    }
}
