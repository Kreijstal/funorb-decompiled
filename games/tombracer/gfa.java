/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class gfa extends bs {
    static ur field_l;
    private int field_n;
    private int field_k;
    static iu field_j;
    static String field_i;
    static String field_m;

    final void a(kh param0, int param1) {
        super.a(param0, param1);
        param0.a((byte) -128, ((gfa) this).field_n, 4);
        param0.a((byte) -125, ((gfa) this).field_k, 6);
    }

    public static void b(int param0) {
        field_i = null;
        field_m = null;
        field_l = null;
        if (param0 <= 33) {
            gfa.b(-87);
            field_j = null;
            return;
        }
        field_j = null;
    }

    final boolean a(boolean param0) {
        int var2 = 0;
        if (!param0) {
          var2 = ((gfa) this).field_n;
          if (var2 != -5) {
            if (-6 != var2) {
              return false;
            } else {
              return true;
            }
          } else {
            return true;
          }
        } else {
          return false;
        }
    }

    final int b(byte param0) {
        if (param0 != 121) {
            ((gfa) this).field_k = -8;
            return 0;
        }
        return 0;
    }

    gfa(int param0, kh param1) {
        super(param0, param1);
        ((gfa) this).field_n = param1.b((byte) 44, 4);
        ((gfa) this).field_k = param1.b((byte) 44, 6);
    }

    final int a(byte param0) {
        if (param0 != -28) {
            field_j = null;
            return ((gfa) this).field_k;
        }
        return ((gfa) this).field_k;
    }

    final boolean a(boolean param0, bs param1) {
        if (param0) {
            field_j = null;
            if (!(param1 instanceof gfa)) {
                return false;
            }
            return ((gfa) (Object) param1).field_n == ((gfa) this).field_n ? true : false;
        }
        if (!(param1 instanceof gfa)) {
            return false;
        }
        return ((gfa) (Object) param1).field_n == ((gfa) this).field_n ? true : false;
    }

    final void a(dt param0, int param1, int param2, int param3) {
        if (param1 > 110) {
          if (!((gfa) this).a(false)) {
            param0.a(((gfa) this).field_n, param3, -85);
            return;
          } else {
            param0.a(((gfa) this).field_n, param3, -121, param2);
            return;
          }
        } else {
          field_j = null;
          if (!((gfa) this).a(false)) {
            param0.a(((gfa) this).field_n, param3, -85);
            return;
          } else {
            param0.a(((gfa) this).field_n, param3, -121, param2);
            return;
          }
        }
    }

    final void a(int param0, byte param1, dt param2) {
        int var4 = 0;
        if (((gfa) this).a(false)) {
          param2.a((byte) -97, ((gfa) this).field_n, param0);
          var4 = 30 % ((param1 - 46) / 46);
          return;
        } else {
          param2.b(((gfa) this).field_n, -1);
          var4 = 30 % ((param1 - 46) / 46);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_l = new ur(3);
        field_i = "This is <%0>'s RuneScape clan if they have one.";
        field_m = "Report abuse";
    }
}
