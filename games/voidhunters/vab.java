/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vab {
    int field_b;
    static String field_a;
    private qfa field_c;

    protected final void finalize() throws Throwable {
        ((vab) this).field_c.g(((vab) this).field_b, -92);
        super.finalize();
    }

    final static void a(byte param0, ml param1) {
        int var2 = 0;
        int var4 = 0;
        ml var5 = null;
        ml var6 = null;
        var4 = VoidHunters.field_G;
        if (param0 == -94) {
          var2 = 0;
          L0: while (true) {
            if ((var2 ^ -1) <= -5) {
              return;
            } else {
              var6 = new ml(32);
              var6.a(1, 1, new ml(24));
              var6.a(param0 ^ -93, 2, new ml(24));
              var6.a(1, 3, new ml(24));
              var6.a(param0 ^ -93, 4, new ml(24));
              var6.a(1, 5, new ml(24));
              param1.a(param0 ^ -93, var2, var6);
              var2++;
              continue L0;
            }
          }
        } else {
          field_a = null;
          var2 = 0;
          L1: while (true) {
            if ((var2 ^ -1) <= -5) {
              return;
            } else {
              var5 = new ml(32);
              var5.a(1, 1, new ml(24));
              var5.a(param0 ^ -93, 2, new ml(24));
              var5.a(1, 3, new ml(24));
              var5.a(param0 ^ -93, 4, new ml(24));
              var5.a(1, 5, new ml(24));
              param1.a(param0 ^ -93, var2, var5);
              var2++;
              continue L1;
            }
          }
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        if (param0) {
            field_a = null;
        }
    }

    vab(qfa param0, int param1, int param2) {
        ((vab) this).field_b = param2;
        ((vab) this).field_c = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Back";
    }
}
