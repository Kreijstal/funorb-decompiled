/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nga extends ci {
    static iu[] field_n;
    static String field_q;
    static int field_p;
    static String field_o;
    private int field_m;

    private nga(int param0) {
        super(0, true);
        ((nga) this).field_m = 4096;
        ((nga) this).field_m = param0;
    }

    final void a(byte param0, uia param1, int param2) {
        int var4 = 0;
        L0: {
          var4 = param2;
          if (0 != var4) {
            break L0;
          } else {
            ((nga) this).field_m = (param1.h(255) << 325608940) / 255;
            break L0;
          }
        }
        if (param0 != 107) {
          ((nga) this).field_m = -5;
          return;
        } else {
          return;
        }
    }

    final int[] c(int param0, int param1) {
        int[] var3 = null;
        int[] var4 = null;
        var4 = ((nga) this).field_i.a((byte) 61, param1);
        var3 = var4;
        if (!((nga) this).field_i.field_d) {
          if (param0 != 1) {
            field_o = null;
            return var4;
          } else {
            return var4;
          }
        } else {
          lua.a(var4, 0, ns.field_g, ((nga) this).field_m);
          if (param0 == 1) {
            return var4;
          } else {
            field_o = null;
            return var4;
          }
        }
    }

    final static boolean c(int param0) {
        if (!ni.field_c) {
            return false;
        }
        if (bta.field_q != param0) {
            return false;
        }
        return true;
    }

    public nga() {
        this(4096);
    }

    public static void d(byte param0) {
        field_q = null;
        int var1 = 51 / ((param0 - -47) / 38);
        field_o = null;
        field_n = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_o = "Friends";
        field_q = "Retry";
    }
}
