/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class fa {
    static vd field_d;
    static gh field_f;
    static wk field_e;
    static int[] field_c;
    static wk field_b;
    static gk[] field_a;

    abstract jl b(byte param0);

    final static boolean a(boolean param0, CharSequence param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        if (f.a(param1, 4, param0)) {
          var2 = 0;
          L0: while (true) {
            if (param1.length() > var2) {
              if (qh.a((byte) -30, param1.charAt(var2))) {
                var2++;
                continue L0;
              } else {
                return false;
              }
            } else {
              return true;
            }
          }
        } else {
          return false;
        }
    }

    final static String a(char param0, int param1) {
        if (param1 != 29448) {
            Object var3 = null;
            boolean discarded$0 = fa.a(true, (CharSequence) null);
            return String.valueOf(param0);
        }
        return String.valueOf(param0);
    }

    abstract int a(boolean param0, int param1);

    final static boolean a(int param0) {
        if (param0 != 38) {
            field_b = null;
            return !uc.field_g ? true : false;
        }
        return !uc.field_g ? true : false;
    }

    final static void a(byte param0) {
        qj.field_a[44] = 71;
        qj.field_a[93] = 43;
        qj.field_a[59] = 57;
        qj.field_a[46] = 72;
        qj.field_a[91] = 42;
        if (param0 < 106) {
          boolean discarded$1 = fa.a(-119);
          qj.field_a[222] = 58;
          qj.field_a[192] = 28;
          qj.field_a[520] = 59;
          qj.field_a[47] = 73;
          qj.field_a[45] = 26;
          qj.field_a[92] = 74;
          qj.field_a[61] = 27;
          return;
        } else {
          qj.field_a[222] = 58;
          qj.field_a[192] = 28;
          qj.field_a[520] = 59;
          qj.field_a[47] = 73;
          qj.field_a[45] = 26;
          qj.field_a[92] = 74;
          qj.field_a[61] = 27;
          return;
        }
    }

    abstract byte[] a(int param0, int param1);

    final static void a(boolean param0, byte param1, boolean param2) {
        L0: {
          if (!param0) {
            pb.b();
            pb.b();
            pb.b();
            break L0;
          } else {
            pb.c(0, 0, pb.field_c, pb.field_j, 0, 192);
            break L0;
          }
        }
        if (param1 <= 32) {
          field_d = null;
          wn.a(0, param0);
          return;
        } else {
          wn.a(0, param0);
          return;
        }
    }

    public static void b(int param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (param0 != 38) {
            field_b = null;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = new int[]{38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, 38, -1, -1, -1, 7};
        field_d = new vd();
    }
}
