/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jc extends na {
    static int field_f;
    static String field_e;

    final gf a(byte param0, String param1) {
        CharSequence var4 = (CharSequence) (Object) param1;
        if (!jf.a(param0 ^ -13159, var4)) {
            return qr.field_e;
        }
        CharSequence var5 = (CharSequence) (Object) param1;
        int var3 = no.a((byte) -128, var5);
        if (param0 != 26) {
            return null;
        }
        if (-1 > (var3 ^ -1)) {
            // if_icmplt L67
        } else {
            return qr.field_e;
        }
        return qe.field_a;
    }

    jc(dh param0) {
        super(param0);
    }

    public static void c(byte param0) {
        field_e = null;
        int var1 = 5 % ((param0 - -18) / 53);
    }

    final String a(int param0, String param1) {
        if (!(((jc) this).a((byte) 26, param1) != qr.field_e)) {
            return gn.field_g;
        }
        if (param0 == 0) {
            return null;
        }
        int discarded$0 = jc.b(true);
        return null;
    }

    final static int b(boolean param0) {
        int var1 = 0;
        int var2 = 0;
        int var3 = 0;
        L0: {
          var3 = Sumoblitz.field_L ? 1 : 0;
          var1 = 0;
          var2 = 0;
          if (param0) {
            break L0;
          } else {
            field_f = 118;
            break L0;
          }
        }
        L1: while (true) {
          if (var2 >= aa.field_a.length) {
            return var1;
          } else {
            if (aa.field_a[var2] != null) {
              if (aa.field_a[var2].field_Q != 0) {
                var1++;
                var2++;
                continue L1;
              } else {
                var2++;
                continue L1;
              }
            } else {
              var2++;
              continue L1;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = 0;
        field_e = "Go Back";
    }
}
