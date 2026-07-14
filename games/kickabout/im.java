/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class im extends hd {
    static String field_Bb;
    static String field_zb;
    static int field_Ab;
    static int field_yb;

    im() {
    }

    public static void a(int param0) {
        field_Bb = null;
        field_zb = null;
        if (param0 != -18523) {
            field_Ab = -103;
        }
    }

    boolean b(int param0) {
        if (param0 != 15377) {
            field_zb = null;
            return false;
        }
        return false;
    }

    abstract void c(int param0, boolean param1);

    final static void h(int param0) {
        java.awt.Canvas var1 = null;
        Object var2 = null;
        L0: {
          if (dr.field_a) {
            dr.field_a = false;
            var1 = ln.l(param0 ^ 634588136);
            wu discarded$6 = oo.field_c.a((byte) 53, us.field_j, wt.field_x, (java.awt.Component) (Object) var1);
            wu discarded$7 = oo.field_c.a(-118, (java.awt.Component) (Object) var1, true);
            n.field_m = us.field_j;
            el.field_A = wt.field_x;
            break L0;
          } else {
            break L0;
          }
        }
        if (param0 != 634588072) {
          var2 = null;
          int discarded$8 = im.a((byte) 6, (CharSequence) null, -12);
          return;
        } else {
          return;
        }
    }

    final static int a(byte param0, CharSequence param1, int param2) {
        int var3 = 75 / ((66 - param0) / 50);
        return kt.a(param1, true, (byte) 125, param2);
    }

    abstract void b(int param0, int param1);

    final static void a(java.applet.Applet param0, int param1, String param2) {
        try {
            java.net.URL var3 = null;
            if (param1 < 70) {
                return;
            }
            try {
                var3 = new java.net.URL(param0.getCodeBase(), param2);
                var3 = qr.a(param0, var3, 3);
                bv.a(0, var3.toString(), true, param0);
            } catch (Exception exception) {
                exception.printStackTrace();
            }
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    final static void a(int param0, int param1, int param2, ut param3) {
        if (param0 == -12376) {
          if ((hw.field_i ^ -1) == -257) {
            param3.c(param1, param2);
            return;
          } else {
            param3.a(param1, param2, hw.field_i * param3.field_o >> -602669464, hw.field_i * param3.field_v >> 634588072);
            return;
          }
        } else {
          field_Bb = null;
          if ((hw.field_i ^ -1) == -257) {
            param3.c(param1, param2);
            return;
          } else {
            param3.a(param1, param2, hw.field_i * param3.field_o >> -602669464, hw.field_i * param3.field_v >> 634588072);
            return;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_zb = "No Buyout";
        field_Ab = 480;
        field_Bb = "ESC - cancel this line";
        field_yb = 9;
    }
}
