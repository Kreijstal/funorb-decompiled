/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class imb implements ntb, utb {
    int field_c;
    static int field_a;
    int field_e;
    int field_d;
    static String field_b;

    public static void a(int param0) {
        field_b = null;
        if (param0 <= 54) {
            imb.a(64);
        }
    }

    public final void a(faa param0, byte param1) {
        param0.a(-632, ((imb) this).field_c + 1, 5);
        param0.a(-632, ((imb) this).field_e, 32);
        if (param1 > -91) {
          return;
        } else {
          param0.a(-632, ((imb) this).field_d, 32);
          return;
        }
    }

    public final void a(faa param0, int param1) {
        ((imb) this).field_c = param0.i(0, 5) + -1;
        ((imb) this).field_e = param0.i(0, param1);
        ((imb) this).field_d = param0.i(0, 32);
    }

    public final boolean a(byte param0, tv param1) {
        int var4 = -41 % ((param0 - 22) / 59);
        imb var3 = (imb) (Object) param1;
        return var3.field_c != var3.field_c ? true : false;
    }

    public final void b(byte param0, tv param1) {
        imb var5 = null;
        imb var6 = null;
        var5 = (imb) (Object) param1;
        var6 = var5;
        if (param0 <= 54) {
          ((imb) this).field_d = -122;
          var6.field_e = var5.field_e;
          var6.field_d = var5.field_d;
          var6.field_c = var5.field_c;
          return;
        } else {
          var6.field_e = var5.field_e;
          var6.field_d = var5.field_d;
          var6.field_c = var5.field_c;
          return;
        }
    }

    imb() {
        ((imb) this).field_c = -1;
    }

    public final void b(faa param0, int param1) {
        if (param1 > -109) {
            return;
        }
        param0.a(-632, 1 + ((imb) this).field_c, 5);
    }

    public final void a(faa param0, boolean param1) {
        if (param1) {
          ((imb) this).field_e = -38;
          ((imb) this).field_c = param0.i(0, 5) - 1;
          return;
        } else {
          ((imb) this).field_c = param0.i(0, 5) - 1;
          return;
        }
    }

    public final void a(tv param0, int param1) {
        int var4 = 0;
        Object var5 = null;
        imb var6 = null;
        L0: {
          var6 = (imb) (Object) param0;
          var4 = 0;
          if (var6.field_c != var6.field_c) {
            System.out.println("int connected_component_idx has changed. before=" + var6.field_c + ", now=" + var6.field_c);
            var4 = 1;
            break L0;
          } else {
            break L0;
          }
        }
        L1: {
          if (var6.field_e == var6.field_e) {
            break L1;
          } else {
            var4 = 1;
            System.out.println("int worldx has changed. before=" + var6.field_e + ", now=" + var6.field_e);
            break L1;
          }
        }
        L2: {
          if (var6.field_d == var6.field_d) {
            break L2;
          } else {
            var4 = 1;
            System.out.println("int worldy has changed. before=" + var6.field_d + ", now=" + var6.field_d);
            break L2;
          }
        }
        if (param1 < -19) {
          if (var4 != 0) {
            System.out.println("This instance of Hardpoint has changed");
            return;
          } else {
            return;
          }
        } else {
          var5 = null;
          ((imb) this).b((byte) 67, (tv) null);
          if (var4 == 0) {
            return;
          } else {
            System.out.println("This instance of Hardpoint has changed");
            return;
          }
        }
    }

    final void a(int param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        Object var9 = null;
        ((imb) this).field_d = (param3 * param6 + param0 * param5 >> 1448795056) + param2;
        if (param4 != -665140432) {
          var9 = null;
          ((imb) this).a((faa) null, true);
          ((imb) this).field_e = param1 - -(-(param6 * param0) + param3 * param5 >> -665140432);
          return;
        } else {
          ((imb) this).field_e = param1 - -(-(param6 * param0) + param3 * param5 >> -665140432);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Accurate and long ranged. High energy consumption";
    }
}
