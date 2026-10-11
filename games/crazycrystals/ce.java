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
        int var1;
        int[] var2;
        int var3;
        int var4;
        int var5;
        int var6;
        int var7;
        double var8;
        double var10;
        double var12;
        int var14;
        fq var15;
        fq var16;
        int var3Lifetime1;
        var14 = CrazyCrystals.field_B;
        var1 = 0;
        var2 = new int[]{tm.field_d[0].length * 48, 0, 48 * tm.field_d.length, 0};
        if (!qh.field_o.isEmpty()) {
          var1 = qh.field_o.size();
          for (var3 = 0; var3 < var1; var3++) {
            var15 = (fq) (qh.field_o.elementAt(var3));
            ii.a(var2, var15, (byte) 118);
          }
        } else {
          for (var3 = 0; var3 < 3; var3++) {
            var16 = oe.field_a[var3];
            if (var16 != null) {
              var1++;
              ii.a(var2, var16, (byte) 118);
            }
          }
          if (0 == var1) {
            return null;
          }
        }
        var3Lifetime1 = var2[0];
        var4 = var2[1];
        var5 = var2[2];
        if (param0 >= -121) {
          return (double[]) null;
        }
        var5 -= 192;
        var3Lifetime1 -= 192;
        var6 = var2[3];
        var4 += 192;
        var6 += 192;
        var7 = -var3Lifetime1 + var4;
        if (-var5 + var6 > var7) {
          var7 = var6 - var5;
        }
        var8 = (double)(var3Lifetime1 + var4) * 0.5;
        var10 = 0.5 * (double)(var5 + var6);
        var12 = 24.0;
        if (var7 > 480) {
          var12 = 480.0 * var12 / (double)var7;
          var10 = var12 * var10 / 24.0;
          var8 = var8 * var12 / 24.0;
        }
        return new double[]{var8, var10, var12};
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
        field_bb = "Email: ";
        field_gb = -1;
    }
}
