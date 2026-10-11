/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class hh extends qb {
    static sc field_g;
    int field_h;

    public static void a(int param0) {
        if (param0 != 20364) {
          hh.b((byte) -87);
          field_g = null;
          return;
        }
        field_g = null;
    }

    final static String b(byte param0) {
        String var1;
        String var1Lifetime1;
        if (param0 == 23) {
          var1 = "";
          if (null != i.field_a) {
            var1 = i.field_a.d((byte) -99);
          }
          if (var1.length() == 0) {
            var1 = sg.b(param0 + 91);
          }
          if (var1.length() == 0) {
            var1 = vd.field_l;
          }
          return var1;
        }
        field_g = (sc) null;
        var1Lifetime1 = "";
        if (null != i.field_a) {
          var1Lifetime1 = i.field_a.d((byte) -99);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = sg.b(param0 + 91);
        }
        if (var1Lifetime1.length() == 0) {
          var1Lifetime1 = vd.field_l;
        }
        return var1Lifetime1;
    }

    hh(int param0) {
        this.field_h = param0;
    }

    static {
        field_g = new sc();
    }
}
