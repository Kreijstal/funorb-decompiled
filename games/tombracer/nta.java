/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nta implements fo {
    private int field_g;
    static String field_e;
    private int field_a;
    private bua field_f;
    private int field_i;
    static String[] field_b;
    private int field_c;
    static int field_d;
    private int field_j;
    static int field_h;

    final void a(byte param0, uw param1, int param2) {
        if (!(param1 != null)) {
            return;
        }
        param1.a((byte) -100, 2, (fo) this);
        int var4 = 5 / ((-52 - param0) / 57);
    }

    public final int e(byte param0) {
        if (param0 >= -86) {
            field_e = null;
            return ((nta) this).field_g;
        }
        return ((nta) this).field_g;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != -25821) {
            return;
        }
        field_b = null;
    }

    public final void f(int param0) {
        L0: {
          if (-1 > (((nta) this).field_a ^ -1)) {
            ((nta) this).field_a = ((nta) this).field_a - 1;
            break L0;
          } else {
            break L0;
          }
        }
        ((nta) this).field_f.a(0);
        if (param0 != -4366) {
          field_d = -24;
          return;
        } else {
          return;
        }
    }

    public final void a(int param0, iq param1) {
        ka var3 = null;
        var3 = ((nta) this).field_f.b((byte) 74);
        gqa.a(((nta) this).field_c, -83584144, ((nta) this).c((byte) 106), ((nta) this).b((byte) 90), var3, ((nta) this).e((byte) -106));
        if (param0 < 103) {
          ((nta) this).field_j = -39;
          return;
        } else {
          return;
        }
    }

    public final int c(byte param0) {
        if (param0 <= 91) {
            ((nta) this).f(-64);
            return ((nta) this).field_i;
        }
        return ((nta) this).field_i;
    }

    public final boolean d(byte param0) {
        if (param0 == 48) {
          if (-1 == ((nta) this).field_a) {
            return true;
          } else {
            return false;
          }
        } else {
          field_b = null;
          if (-1 == ((nta) this).field_a) {
            return true;
          } else {
            return false;
          }
        }
    }

    public final int b(byte param0) {
        int var2 = -32 % ((-23 - param0) / 53);
        return ((nta) this).field_j;
    }

    nta(int param0, int param1, int param2, bua param3, int param4, int param5) {
        ((nta) this).field_a = param5;
        ((nta) this).field_j = param0;
        ((nta) this).field_c = param4;
        ((nta) this).field_i = param1;
        ((nta) this).field_g = param2;
        ((nta) this).field_f = param3;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new String[]{"<%0> went squish", "<%0> was smushed", "<%0> became two-dimensional", "<%0> was pulverised", "<%0> got stuck between a rock and a hard place", "<%0> couldn't take the pressure", "<%0> felt the squeeze", "<%0> always wanted to be thinner"};
        field_e = "The invitation has been withdrawn.";
        field_h = -2073743619;
    }
}
