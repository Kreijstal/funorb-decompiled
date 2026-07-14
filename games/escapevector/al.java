/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class al {
    static int[] field_f;
    static int[] field_a;
    static hf field_d;
    static hh field_b;
    static long field_e;
    static String field_c;

    final static int a(int param0, int param1) {
        param0 = l.a(param1 + -34966, param0);
        if (-1 < (param0 ^ -1)) {
            return -1;
        }
        if (param0 == -2) {
            return 1;
        }
        if (!(-1 != param0)) {
            return 0;
        }
        if (!(param0 != 2)) {
            return 2;
        }
        if ((param0 ^ -1) == -4) {
            return 3;
        }
        if (param1 != 26504) {
            Object var3 = null;
            af discarded$0 = al.a(-101, -4, (lk) null, 127, 70, -30);
        }
        return -1;
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    public static void a(int param0) {
        field_b = null;
        field_a = null;
        field_d = null;
        if (param0 > -1) {
            ed discarded$0 = al.a((byte) 104);
        }
        field_f = null;
        field_c = null;
    }

    final static ed a(byte param0) {
        int var4_int = 0;
        int var5 = EscapeVector.field_A;
        int var1 = bc.field_a[0] * qh.field_k[0];
        byte[] var2 = qe.field_a[0];
        int[] var3 = new int[var1];
        for (var4_int = 0; var4_int < var1; var4_int++) {
            var3[var4_int] = qk.field_f[ae.a((int) var2[var4_int], 255)];
        }
        ed var4 = new ed(on.field_e, hd.field_c, gn.field_k[0], gi.field_e[0], qh.field_k[0], bc.field_a[0], var3);
        of.a(false);
        if (param0 < 98) {
            field_a = null;
        }
        return var4;
    }

    final static af a(int param0, int param1, lk param2, int param3, int param4, int param5) {
        java.awt.Frame var8 = ib.a((byte) 93, param0, param3, param2, param4, param5);
        java.awt.Frame var6 = var8;
        if (var8 == null) {
            return null;
        }
        af var7 = new af();
        var7.field_d = var8;
        java.awt.Component discarded$7 = var7.field_d.add((java.awt.Component) (Object) var7);
        if (param1 != -16493) {
            field_b = null;
        }
        var7.setBounds(0, 0, param0, param3);
        var7.addFocusListener((java.awt.event.FocusListener) (Object) var7);
        var7.requestFocus();
        return var7;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        int var0 = 0;
        int var1 = 0;
        int var2 = 0;
        field_a = new int[256];
        field_f = new int[1024];
        var1 = 0;
        L0: while (true) {
          if (var1 >= 256) {
            field_c = "If you do nothing the game will revert to normal view in <%0> seconds.";
          } else {
            var0 = var1;
            var2 = 0;
            L1: while (true) {
              if (-9 >= (var2 ^ -1)) {
                field_a[var1] = var0;
                var1++;
                continue L0;
              } else {
                if ((var0 & 1 ^ -1) == -2) {
                  var0 = -306674912 ^ var0 >>> 1337436961;
                  var2++;
                  continue L1;
                } else {
                  var0 = var0 >>> 1;
                  var2++;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
