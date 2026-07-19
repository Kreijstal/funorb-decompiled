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
        int discarded$0 = 0;
        if (param0 != 48) {
            discarded$0 = this.e((byte) 127);
            return this.field_a.d((byte) 48);
        }
        return this.field_a.d((byte) 48);
    }

    public final void f(int param0) {
        if (param0 != -4366) {
            this.field_a = (oo) null;
        }
    }

    public final int e(byte param0) {
        if (param0 > -86) {
            this.field_d = -90;
            return this.field_a.e((byte) -121);
        }
        return this.field_a.e((byte) -121);
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            return -97;
        }
        return this.field_a.c((byte) 117) - -this.field_d;
    }

    public final int b(byte param0) {
        int var2 = 1 % ((-23 - param0) / 53);
        return this.field_a.b((byte) -79) - -this.field_b;
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
        if (param0 <= 103) {
            return;
        }
        gr var3 = this.field_a.c(-114);
        if (var3 != null) {
            if (!var3.a(-50)) {
                return;
            }
        }
        try {
            gqa.a(dfa.a(this.field_e, 2048, -108), -83584144, this.c((byte) 97), this.b((byte) -92), this.field_a.a(false, (lca) (this)), this.e((byte) -110));
        } catch (RuntimeException runtimeException) {
            throw tba.a((Throwable) ((Object) runtimeException), "lca.DB(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ')');
        }
    }

    public static void a(int param0) {
        if (param0 != -22593) {
            field_g = (String[]) null;
            field_g = null;
            return;
        }
        field_g = null;
    }

    static {
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
