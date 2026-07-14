/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class vd {
    static int field_a;
    static pb field_b;

    final static jd a(int param0) {
        int var1 = 0;
        var1 = 63 / ((-10 - param0) / 63);
        if (ml.field_e == null) {
          ml.field_e = new jd(qj.field_d, 20, 0, 0, 0, 11579568, -1, 0, 0, qj.field_d.field_s, -1, 2147483647, true);
          return ml.field_e;
        } else {
          return ml.field_e;
        }
    }

    public static void b(int param0) {
        if (param0 != 1567641170) {
            return;
        }
        field_b = null;
    }

    final static String a(byte param0, CharSequence param1, boolean param2) {
        String var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        var6 = Bounce.field_N;
        var3 = ih.a(param2, param1, false);
        var4 = 68 / ((-7 - param0) / 57);
        if (var3 == null) {
          var5 = 0;
          L0: while (true) {
            if (param1.length() > var5) {
              if (uc.a(2, param1.charAt(var5))) {
                var5++;
                continue L0;
              } else {
                return wb.field_d;
              }
            } else {
              return null;
            }
          }
        } else {
          return var3;
        }
    }

    final static void a(byte param0, wi param1) {
        int var2 = 0;
        if (param0 <= 35) {
          field_a = 33;
          de.field_b = param1.a(-1640531527) << -1550769147;
          var2 = param1.d((byte) -104);
          kf.field_a = (7 & var2) << 1567641170;
          de.field_b = de.field_b + (var2 >> -1377873053);
          kf.field_a = kf.field_a + (param1.a(-1640531527) << -861514622);
          var2 = param1.d((byte) -119);
          ed.field_b = (63 & var2) << 1514819055;
          kf.field_a = kf.field_a + (var2 >> -1975404442);
          ed.field_b = ed.field_b + (param1.d((byte) -119) << -657938713);
          var2 = param1.d((byte) -119);
          qe.field_i = (1 & var2) << -1163733040;
          ed.field_b = ed.field_b + (var2 >> -28957119);
          qe.field_i = qe.field_i + param1.a(-1640531527);
          return;
        } else {
          de.field_b = param1.a(-1640531527) << -1550769147;
          var2 = param1.d((byte) -104);
          kf.field_a = (7 & var2) << 1567641170;
          de.field_b = de.field_b + (var2 >> -1377873053);
          kf.field_a = kf.field_a + (param1.a(-1640531527) << -861514622);
          var2 = param1.d((byte) -119);
          ed.field_b = (63 & var2) << 1514819055;
          kf.field_a = kf.field_a + (var2 >> -1975404442);
          ed.field_b = ed.field_b + (param1.d((byte) -119) << -657938713);
          var2 = param1.d((byte) -119);
          qe.field_i = (1 & var2) << -1163733040;
          ed.field_b = ed.field_b + (var2 >> -28957119);
          qe.field_i = qe.field_i + param1.a(-1640531527);
          return;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = 6;
        field_b = null;
    }
}
