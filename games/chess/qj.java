/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    static int field_f;
    private o field_c;
    private jc field_b;
    static String field_g;
    static ci field_e;
    static String field_a;
    static boolean field_d;
    static String field_h;

    public static void a(int param0) {
        int var1 = -79 / ((-15 - param0) / 45);
        field_a = null;
        field_g = null;
        field_h = null;
        field_e = null;
    }

    final o a(boolean param0, o param1) {
        o var3 = null;
        L0: {
          if (param1 != null) {
            var3 = param1;
            break L0;
          } else {
            var3 = ((qj) this).field_b.field_a.field_h;
            break L0;
          }
        }
        if (var3 == ((qj) this).field_b.field_a) {
          ((qj) this).field_c = null;
          return null;
        } else {
          ((qj) this).field_c = var3.field_h;
          if (param0) {
            qj.a(89);
            return var3;
          } else {
            return var3;
          }
        }
    }

    final o a(o param0, byte param1) {
        o var3 = null;
        int var4 = -115 % ((27 - param1) / 56);
        if (param0 != null) {
            var3 = param0;
        } else {
            var3 = ((qj) this).field_b.field_a.field_c;
        }
        if (!(var3 != ((qj) this).field_b.field_a)) {
            ((qj) this).field_c = null;
            return null;
        }
        ((qj) this).field_c = var3.field_c;
        return var3;
    }

    final o b(byte param0) {
        o var2 = null;
        var2 = ((qj) this).field_c;
        if (var2 != ((qj) this).field_b.field_a) {
          if (param0 > -52) {
            qj.a(92);
            ((qj) this).field_c = var2.field_c;
            return var2;
          } else {
            ((qj) this).field_c = var2.field_c;
            return var2;
          }
        } else {
          ((qj) this).field_c = null;
          return null;
        }
    }

    qj(jc param0) {
        ((qj) this).field_b = param0;
    }

    final static km[] a(int param0, int param1, byte param2, um param3) {
        if (param2 == 108) {
          if (!tj.a(param1, param0, param3, (byte) 83)) {
            return null;
          } else {
            return af.a((byte) -109);
          }
        } else {
          field_e = null;
          if (!tj.a(param1, param0, param3, (byte) 83)) {
            return null;
          } else {
            return af.a((byte) -109);
          }
        }
    }

    final o c(int param0) {
        o var2 = ((qj) this).field_b.field_a.field_h;
        if (param0 != -20229) {
            return null;
        }
        if (!(((qj) this).field_b.field_a != var2)) {
            ((qj) this).field_c = null;
            return null;
        }
        ((qj) this).field_c = var2.field_h;
        return var2;
    }

    final o b(int param0) {
        o var2 = null;
        var2 = ((qj) this).field_c;
        if (((qj) this).field_b.field_a != var2) {
          if (param0 != 8922) {
            return null;
          } else {
            ((qj) this).field_c = var2.field_h;
            return var2;
          }
        } else {
          ((qj) this).field_c = null;
          return null;
        }
    }

    final o a(byte param0) {
        o var2 = null;
        int var3 = 0;
        var2 = ((qj) this).field_b.field_a.field_c;
        if (var2 == ((qj) this).field_b.field_a) {
          ((qj) this).field_c = null;
          return null;
        } else {
          ((qj) this).field_c = var2.field_c;
          var3 = -4 / ((66 - param0) / 34);
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 1;
        field_g = "Confirm Email:";
        field_a = "Invalid name";
        field_d = false;
        field_h = "Players";
    }
}
