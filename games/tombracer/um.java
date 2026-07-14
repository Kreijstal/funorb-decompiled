/*
 * Decompiled by CFR-JS 0.4.0.
 */
class um extends od {
    static String field_k;
    static byte[] field_m;
    static mpa field_l;

    final static vb a(int param0, int param1, u param2, int param3, int param4) {
        qia var5 = null;
        sc var6 = null;
        vb var7 = null;
        if (param3 != -6455) {
          field_k = null;
          var5 = qia.b(param2, 100, param4, param0);
          var6 = hda.a(param1, 1303, (cg) (Object) var5);
          var7 = new vb(var5, (vg) (Object) var6);
          tna.field_e.b((byte) -57, (vg) (Object) var7);
          kva.field_n.a((cg) (Object) var6);
          return var7;
        } else {
          var5 = qia.b(param2, 100, param4, param0);
          var6 = hda.a(param1, 1303, (cg) (Object) var5);
          var7 = new vb(var5, (vg) (Object) var6);
          tna.field_e.b((byte) -57, (vg) (Object) var7);
          kva.field_n.a((cg) (Object) var6);
          return var7;
        }
    }

    um() {
    }

    final static int a(int param0, int param1, int param2) {
        if ((param2 ^ -1) == param1) {
          if (!kba.a(param1 + 1, param0)) {
            return epa.field_r[param2];
          } else {
            return 29;
          }
        } else {
          return epa.field_r[param2];
        }
    }

    public static void a(byte param0) {
        int var1 = -34 % ((-66 - param0) / 45);
        field_m = null;
        field_l = null;
        field_k = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_k = "OpenGL";
    }
}
