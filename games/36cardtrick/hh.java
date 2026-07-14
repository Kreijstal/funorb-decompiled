/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends qb {
    static sc field_g;
    int field_h;

    public static void a(int param0) {
        if (param0 != 20364) {
            String discarded$0 = hh.b((byte) -87);
            field_g = null;
            return;
        }
        field_g = null;
    }

    final static String b(byte param0) {
        String var1 = null;
        if (param0 != 23) {
          L0: {
            field_g = (sc) null;
            var1 = "";
            if (null != i.field_a) {
              var1 = i.field_a.d((byte) -99);
              break L0;
            } else {
              break L0;
            }
          }
          L1: {
            if (-1 == var1.length()) {
              var1 = sg.b(param0 + 91);
              break L1;
            } else {
              break L1;
            }
          }
          L2: {
            if (-1 != var1.length()) {
              break L2;
            } else {
              var1 = vd.field_l;
              break L2;
            }
          }
          return var1;
        } else {
          L3: {
            var1 = "";
            if (null != i.field_a) {
              var1 = i.field_a.d((byte) -99);
              break L3;
            } else {
              break L3;
            }
          }
          L4: {
            if (-1 == var1.length()) {
              var1 = sg.b(param0 + 91);
              break L4;
            } else {
              break L4;
            }
          }
          L5: {
            if (-1 != var1.length()) {
              break L5;
            } else {
              var1 = vd.field_l;
              break L5;
            }
          }
          return var1;
        }
    }

    hh(int param0) {
        ((hh) this).field_h = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new sc();
    }
}
