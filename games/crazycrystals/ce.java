/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ce extends dj {
    static int field_gb;
    String field_fb;
    static String field_bb;
    int field_db;
    String field_cb;
    static dl field_eb;

    final static double[] b(byte param0) {
        int var1 = 0;
        int[] var2 = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        double var8 = 0.0;
        double var10 = 0.0;
        double var12 = 0.0;
        int var14 = 0;
        fq var15 = null;
        fq var16 = null;
        L0: {
          var14 = CrazyCrystals.field_B;
          var1 = 0;
          var2 = new int[]{tm.field_d[0].length * 48, 0, 48 * tm.field_d.length, 0};
          if (qh.field_o.isEmpty()) {
            var3 = 0;
            L1: while (true) {
              if ((var3 ^ -1) <= -4) {
                if (0 != var1) {
                  break L0;
                } else {
                  return null;
                }
              } else {
                var16 = oe.field_a[var3];
                if (var16 != null) {
                  var1++;
                  ii.a(var2, var16, (byte) 118);
                  var3++;
                  continue L1;
                } else {
                  var3++;
                  continue L1;
                }
              }
            }
          } else {
            var1 = qh.field_o.size();
            var3 = 0;
            L2: while (true) {
              if (var3 >= var1) {
                break L0;
              } else {
                var15 = (fq) qh.field_o.elementAt(var3);
                ii.a(var2, var15, (byte) 118);
                var3++;
                continue L2;
              }
            }
          }
        }
        var3 = var2[0];
        var4 = var2[1];
        var5 = var2[2];
        if (param0 < -121) {
          L3: {
            // wide iinc 5 -192
            // wide iinc 3 -192
            var6 = var2[3];
            // wide iinc 4 192
            // wide iinc 6 192
            var7 = -var3 + var4;
            if (-var5 + var6 <= var7) {
              break L3;
            } else {
              var7 = var6 + -var5;
              break L3;
            }
          }
          L4: {
            var8 = (double)(var3 - -var4) * 0.5;
            var10 = 0.5 * (double)(var5 + var6);
            var12 = 24.0;
            if (-481 <= (var7 ^ -1)) {
              break L4;
            } else {
              var12 = 480.0 * var12 / (double)var7;
              var10 = var12 * var10 / 24.0;
              var8 = var8 * var12 / 24.0;
              break L4;
            }
          }
          return new double[]{var8, var10, var12};
        } else {
          return null;
        }
    }

    public static void b(boolean param0) {
        field_eb = null;
        if (param0) {
            return;
        }
        field_bb = null;
    }

    ce() {
        super(0L, (dj) null);
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_bb = "Email: ";
        field_gb = -1;
    }
}
