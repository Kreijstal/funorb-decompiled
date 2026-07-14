/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gfb implements dja {
    static llb field_a;

    final static Object a(boolean param0, byte[] param1, int param2) {
        se var3 = null;
        if (param2 == -12445) {
          if (param1 != null) {
            if (-137 > (param1.length ^ -1)) {
              var3 = new se();
              ((ps) (Object) var3).a((byte) -28, param1);
              return (Object) (Object) var3;
            } else {
              if (param0) {
                return (Object) (Object) nia.a(param1, (byte) -100);
              } else {
                return (Object) (Object) param1;
              }
            }
          } else {
            return null;
          }
        } else {
          return null;
        }
    }

    public final tv a(byte param0) {
        int var2 = 37 % ((param0 - -64) / 50);
        return (tv) (Object) new it();
    }

    public final tv[] a(int param0, int param1) {
        if (param0 != 11995) {
            tv discarded$0 = ((gfb) this).a((byte) -124);
            return (tv[]) (Object) new it[param1];
        }
        return (tv[]) (Object) new it[param1];
    }

    final static String a(int param0, String param1) {
        int var2 = ppa.a(nfa.field_d, go.field_p, false);
        if (param0 == var2) {
            param1 = "<img=0>" + param1;
        }
        if (-3 == (var2 ^ -1)) {
            param1 = "<img=1>" + param1;
        }
        return param1;
    }

    public static void b(byte param0) {
        int var1 = 12 / ((param0 - 15) / 40);
        field_a = null;
    }

    static {
    }
}
