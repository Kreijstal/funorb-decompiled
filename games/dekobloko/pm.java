/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pm {
    static boolean field_b;
    static String field_a;
    static long field_e;
    static int field_g;
    static String field_c;
    static int field_f;
    static int field_d;

    public static void a(int param0) {
        int var1 = -26 / ((param0 - -34) / 48);
        field_a = null;
        field_c = null;
    }

    final static int a(int param0, int param1, int param2) {
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = client.field_A ? 1 : 0;
        var3 = 0;
        if (param1 == -2141435999) {
          var4 = rn.field_d;
          L0: while (true) {
            if (ef.field_M.length > var3) {
              var5 = ug.field_q[var3];
              if (-1 < (var5 ^ -1)) {
                var4 = var4 + ma.field_I;
                var3++;
                var3++;
                continue L0;
              } else {
                var6 = qb.a(0, ef.field_M[var3], true);
                var4 = var4 + je.field_c;
                var7 = -(var6 >> -2141435999) + af.field_f;
                if (!gi.a(17, param0, param2, var6 + (ba.field_d << 695051425), var4, vb.field_V - -(le.field_t << 1525011617), var7 + -ba.field_d)) {
                  var4 = var4 + ((le.field_t << -201922079) + (je.field_c + vb.field_V));
                  var3++;
                  var3++;
                  continue L0;
                } else {
                  return var5;
                }
              }
            } else {
              return -1;
            }
          }
        } else {
          int discarded$2 = pm.a(7, 120, -115);
          var4 = rn.field_d;
          if (ef.field_M.length > var3) {
            var5 = ug.field_q[var3];
            if (-1 >= (var5 ^ -1)) {
              var6 = qb.a(0, ef.field_M[var3], true);
              var4 = var4 + je.field_c;
              var7 = -(var6 >> -2141435999) + af.field_f;
              if (gi.a(17, param0, param2, var6 + (ba.field_d << 695051425), var4, vb.field_V - -(le.field_t << 1525011617), var7 + -ba.field_d)) {
                return var5;
              } else {
                var4 = var4 + ((le.field_t << -201922079) + (je.field_c + vb.field_V));
                var3++;
                var3++;
                var3++;
                var3++;
                return -1;
              }
            } else {
              var4 = var4 + ma.field_I;
              var3++;
              var3++;
              var3++;
              return -1;
            }
          } else {
            return -1;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = false;
        field_a = "You have declined the invitation.";
        field_c = "Sound: ";
        field_f = 0;
    }
}
