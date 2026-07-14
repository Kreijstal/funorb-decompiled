/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class bo {
    static int field_h;
    static String field_g;
    private fo field_b;
    private pa field_d;
    static kp field_i;
    static hc field_a;
    private int[] field_e;
    private ha field_c;
    private fo field_f;

    final static boolean a(byte param0) {
        if (param0 == 102) {
          if (hr.field_e != null) {
            if (null == hr.field_e.d((byte) -112)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        } else {
          boolean discarded$5 = bo.a((byte) -128);
          if (hr.field_e != null) {
            if (null == hr.field_e.d((byte) -112)) {
              return false;
            } else {
              return true;
            }
          } else {
            return false;
          }
        }
    }

    final static rh a(al[] param0, int param1, int param2) {
        if (param2 != 23187) {
          field_g = (String) null;
          return gg.a(param0[qq.a(20, param0.length)], param1, -27227);
        } else {
          return gg.a(param0[qq.a(20, param0.length)], param1, -27227);
        }
    }

    final void a(boolean param0) {
        fo var2 = null;
        fo var3 = null;
        if (((bo) this).field_b.field_b == ((bo) this).field_d) {
          if (!param0) {
            bo.a(65);
            ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
            var3 = ((bo) this).field_b;
            var2 = var3;
            ((bo) this).field_b = ((bo) this).field_b.field_c;
            var3.field_c = ((bo) this).field_f;
            var3.field_b = null;
            ((bo) this).field_f = var3;
            return;
          } else {
            ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
            var3 = ((bo) this).field_b;
            var2 = var3;
            ((bo) this).field_b = ((bo) this).field_b.field_c;
            var3.field_c = ((bo) this).field_f;
            var3.field_b = null;
            ((bo) this).field_f = var3;
            return;
          }
        } else {
          ((bo) this).field_c.a();
          if (null == ((bo) this).field_b.field_b) {
            ((bo) this).field_d = ((bo) this).field_b.field_b;
            if (param0) {
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            } else {
              bo.a(65);
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            }
          } else {
            ((bo) this).field_c.a(((bo) this).field_b.field_b, true);
            ((bo) this).field_d = ((bo) this).field_b.field_b;
            if (param0) {
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            } else {
              bo.a(65);
              ((bo) this).field_c.KA(((bo) this).field_b.field_d, ((bo) this).field_b.field_g, ((bo) this).field_b.field_a, ((bo) this).field_b.field_e);
              var3 = ((bo) this).field_b;
              var2 = var3;
              ((bo) this).field_b = ((bo) this).field_b.field_c;
              var3.field_c = ((bo) this).field_f;
              var3.field_b = null;
              ((bo) this).field_f = var3;
              return;
            }
          }
        }
    }

    private final void b(int param0) {
        fo var2 = null;
        L0: {
          ((bo) this).field_c.K(((bo) this).field_e);
          if (null == ((bo) this).field_f) {
            var2 = new fo();
            break L0;
          } else {
            var2 = ((bo) this).field_f;
            ((bo) this).field_f = ((bo) this).field_f.field_c;
            break L0;
          }
        }
        var2.a((byte) 46, ((bo) this).field_e[3], ((bo) this).field_e[2], ((bo) this).field_b, ((bo) this).field_e[1], ((bo) this).field_d, ((bo) this).field_e[0]);
        ((bo) this).field_b = (fo) var2;
        if (param0 != 884) {
          field_h = -21;
          return;
        } else {
          return;
        }
    }

    public static void a(int param0) {
        field_i = null;
        if (param0 != 18598) {
            field_i = (kp) null;
            field_g = null;
            field_a = null;
            return;
        }
        field_g = null;
        field_a = null;
    }

    final void a(int param0, int param1, int param2, int param3, int param4) {
        int var6 = 120 % ((param4 - 25) / 44);
        this.b(884);
        ((bo) this).field_c.T(param1, param3, param0, param2);
    }

    bo(ha param0) {
        ((bo) this).field_d = null;
        ((bo) this).field_e = new int[4];
        ((bo) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Loading extra data";
        field_i = new kp();
    }
}
