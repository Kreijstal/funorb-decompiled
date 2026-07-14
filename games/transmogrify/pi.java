/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pi extends wf {
    static int field_j;
    static ci field_g;
    static int field_k;
    static int field_h;
    int field_i;

    final static fc a(int param0, String param1) {
        if (param0 == 17118) {
          if (dl.field_l.b(-26753)) {
            if (param1.equals((Object) (Object) dl.field_l.a((byte) -41))) {
              return dl.field_l;
            } else {
              dl.field_l = bh.a(param0 ^ -17080, param1);
              return dl.field_l;
            }
          } else {
            return dl.field_l;
          }
        } else {
          pi.a((byte) 93);
          if (!dl.field_l.b(-26753)) {
            return dl.field_l;
          } else {
            L0: {
              if (!param1.equals((Object) (Object) dl.field_l.a((byte) -41))) {
                dl.field_l = bh.a(param0 ^ -17080, param1);
                break L0;
              } else {
                break L0;
              }
            }
            return dl.field_l;
          }
        }
    }

    public static void a(byte param0) {
        field_g = null;
        if (param0 != -110) {
            field_k = -126;
        }
    }

    final static byte[] a(byte param0, byte[] param1) {
        int var2 = 0;
        byte[] var3 = null;
        Object var4 = null;
        var2 = param1.length;
        var3 = new byte[var2];
        ji.a(param1, 0, var3, 0, var2);
        if (param0 != -29) {
          var4 = null;
          fc discarded$2 = pi.a(-109, (String) null);
          return var3;
        } else {
          return var3;
        }
    }

    pi(int param0) {
        ((pi) this).field_i = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_j = 10;
    }
}
