/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lca implements fo {
    private static String[] field_g;
    int field_b;
    int field_c;
    oo field_a;
    int field_f;
    int field_e;
    int field_d;

    public final boolean d(byte param0) {
        if (param0 != 48) {
            int discarded$0 = ((lca) this).e((byte) 127);
            return ((lca) this).field_a.d((byte) 48);
        }
        return ((lca) this).field_a.d((byte) 48);
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            ((lca) this).field_a = null;
        }
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            ((lca) this).field_d = -90;
            return ((lca) this).field_a.e((byte) -121);
        }
        return ((lca) this).field_a.e((byte) -121);
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            return -97;
        }
        return ((lca) this).field_a.c((byte) 117) - -((lca) this).field_d;
    }

    public final int b(byte param0) {
        int var2 = 1 % ((-23 - param0) / 53);
        return ((lca) this).field_a.b((byte) -79) - -((lca) this).field_b;
    }

    final static boolean a(boolean param0) {
        if (!param0) {
          if (null != wu.field_a) {
            if (wu.field_a.a((byte) 119) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          lca.a(-63);
          if (null != wu.field_a) {
            if (wu.field_a.a((byte) 119) == null) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    public final void a(int param0, iq param1) {
        gr var3 = null;
        if (param0 > 103) {
          var3 = ((lca) this).field_a.c(-114);
          if (var3 != null) {
            if (var3.a(-50)) {
              gqa.a(dfa.a(((lca) this).field_e, 2048, -108), -83584144, ((lca) this).c((byte) 97), ((lca) this).b((byte) -92), ((lca) this).field_a.a(false, (lca) this), ((lca) this).e((byte) -110));
              return;
            } else {
              return;
            }
          } else {
            gqa.a(dfa.a(((lca) this).field_e, 2048, -108), -83584144, ((lca) this).c((byte) 97), ((lca) this).b((byte) -92), ((lca) this).field_a.a(false, (lca) this), ((lca) this).e((byte) -110));
            return;
          }
        } else {
          return;
        }
    }

    public static void a(int param0) {
        if (param0 != -22593) {
            field_g = null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new String[8];
        field_g[3] = "Rolling Boulder";
        field_g[7] = "Key";
        field_g[2] = "Pushable Block";
        field_g[4] = "Rotating Flamer";
        field_g[6] = "Damocles Block";
        field_g[1] = "Solid Block";
        field_g[5] = "Tracking Beam";
        field_g[0] = "Pit";
    }
}
