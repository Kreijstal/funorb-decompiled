/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fg {
    static hh field_a;
    static int field_b;

    final static int a(boolean param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var3 = param1 >> -572659792;
        if (param0) {
          field_a = (hh) null;
          var4 = param1 & 65535;
          var5 = param2 >> 663982480;
          var6 = param2 & 65535;
          return var4 * var5 + param2 * var3 - -(var6 * var4 >> 929399280);
        } else {
          var4 = param1 & 65535;
          var5 = param2 >> 663982480;
          var6 = param2 & 65535;
          return var4 * var5 + param2 * var3 - -(var6 * var4 >> 929399280);
        }
    }

    final static boolean c(int param0) {
        int var1 = mm.a(4, 5) ? 1 : 0;
        sl.field_b[6][param0] = uj.field_a;
        return var1 != 0;
    }

    final static te[] a(int param0) {
        te[] var1 = null;
        int var2 = 0;
        int var3 = 0;
        var3 = EscapeVector.field_A;
        var1 = new te[qk.field_j];
        if (param0 != 13029) {
          fg.b(16);
          var2 = 0;
          L0: while (true) {
            if (qk.field_j <= var2) {
              of.a(false);
              return var1;
            } else {
              var1[var2] = new te(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], qe.field_a[var2], qk.field_f);
              var2++;
              continue L0;
            }
          }
        } else {
          var2 = 0;
          L1: while (true) {
            if (qk.field_j <= var2) {
              of.a(false);
              return var1;
            } else {
              var1[var2] = new te(on.field_e, hd.field_c, gn.field_k[var2], gi.field_e[var2], qh.field_k[var2], bc.field_a[var2], qe.field_a[var2], qk.field_f);
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void a(byte param0) {
        field_a = null;
        if (param0 >= -113) {
            field_a = (hh) null;
        }
    }

    final static void b(int param0) {
        String[] var2 = null;
        int var3_int = 0;
        String var4 = null;
        ed var5 = null;
        String var3 = null;
        int var6 = EscapeVector.field_A;
        if (!(bj.e((byte) 118))) {
            return;
        }
        String var1 = "simulator";
        if (!(fi.field_j.a(param0, var1))) {
            return;
        }
        try {
            ob.field_b = new ed[17];
            var2 = pl.field_k;
            for (var3_int = 0; var2.length > var3_int; var3_int++) {
                var4 = var2[var3_int];
                var5 = fe.a(var1, fi.field_j, var4, true);
                ob.field_b[var3_int] = var5;
            }
            var3 = "infrastructure_virtual";
            v.field_a = kh.a(fi.field_j, (byte) 126, var1, var3);
            var3 = "seeker_mine";
            ka.field_a = fe.a(var1, fi.field_j, var3, true);
            var3 = "rock_buster";
            ej.field_a = fe.a(var1, fi.field_j, var3, true);
        } catch (RuntimeException runtimeException) {
            throw t.a((Throwable) ((Object) runtimeException), "fg.B(" + param0 + ')');
        }
    }

    static {
    }
}
