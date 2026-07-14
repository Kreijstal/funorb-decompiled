/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nkb extends rqa {
    static byte[] field_p;
    static int field_r;
    static int field_q;
    static String field_o;

    final static void a(int param0, boolean param1) {
        if (param0 != 12) {
            return;
        }
        wba.field_p.a(7861, param1);
    }

    nkb(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    public static void e(byte param0) {
        field_p = null;
        field_o = null;
        if (param0 > -67) {
            field_q = -100;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((nkb) this).a((nc[]) null, -79);
          return new nc((Object) (Object) frb.a(12, 95));
        } else {
          return new nc((Object) (Object) frb.a(12, 95));
        }
    }

    final static tpa a(int param0) {
        if (dn.field_r != kla.field_d) {
          if (dn.field_r == gka.field_o) {
            dn.field_r = kla.field_d;
            return cjb.field_b;
          } else {
            if (param0 == 10589) {
              return null;
            } else {
              field_p = null;
              return null;
            }
          }
        } else {
          throw new IllegalStateException();
        }
    }

    final static void a(boolean param0, String param1) {
        if (param0) {
          L0: {
            nkb.e((byte) 12);
            if (ssa.b(2)) {
              System.out.println(param1);
              break L0;
            } else {
              break L0;
            }
          }
          return;
        } else {
          L1: {
            if (ssa.b(2)) {
              System.out.println(param1);
              break L1;
            } else {
              break L1;
            }
          }
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        gmb discarded$0 = new gmb();
    }
}
