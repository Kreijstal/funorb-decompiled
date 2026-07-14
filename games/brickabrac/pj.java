/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class pj implements ia {
    static int[] field_b;
    static String field_e;
    private long field_f;
    static so field_c;
    static String field_d;
    static int field_a;

    public final String a(int param0) {
        int var2 = 0;
        var2 = -4 / ((-23 - param0) / 56);
        if (!((pj) this).a((byte) -119)) {
          if ((ue.a(false) ^ -1L) > (350L + ((pj) this).field_f ^ -1L)) {
            return null;
          } else {
            return ((pj) this).b(28600);
          }
        } else {
          return null;
        }
    }

    public final void a(boolean param0) {
        ((pj) this).field_f = ue.a(param0);
    }

    public static void d(int param0) {
        field_c = null;
        field_e = null;
        field_b = null;
        field_d = null;
        if (param0 != 31366) {
            pj.d(-12);
        }
    }

    abstract qh c(int param0);

    abstract String b(int param0);

    public final qh b(byte param0) {
        if (!((pj) this).a((byte) -44)) {
          if (param0 == -31) {
            if (ue.a(false) < ((pj) this).field_f - -350L) {
              return m.field_c;
            } else {
              return ((pj) this).c(4);
            }
          } else {
            pj.d(100);
            if (ue.a(false) < ((pj) this).field_f - -350L) {
              return m.field_c;
            } else {
              return ((pj) this).c(4);
            }
          }
        } else {
          return uo.field_f;
        }
    }

    final static Class a(String param0, boolean param1) throws ClassNotFoundException {
        if (!(!param0.equals((Object) (Object) "B"))) {
            return Byte.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "I"))) {
            return Integer.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "S"))) {
            return Short.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "J"))) {
            return Long.TYPE;
        }
        if (!param1) {
            return null;
        }
        if (!(!param0.equals((Object) (Object) "Z"))) {
            return Boolean.TYPE;
        }
        if (param0.equals((Object) (Object) "F")) {
            return Float.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "D"))) {
            return Double.TYPE;
        }
        if (!(!param0.equals((Object) (Object) "C"))) {
            return Character.TYPE;
        }
        return Class.forName(param0);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_d = "Score";
        field_e = "Return to game";
    }
}
