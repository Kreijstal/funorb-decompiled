/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class oc {
    private da field_c;
    static java.awt.Frame field_a;
    private da field_b;
    static String field_e;
    private v field_d;

    final ba a(byte param0, int param1) {
        byte[] var4 = null;
        ba var3 = (ba) (this.field_d.a(0, (long)param1));
        if (var3 != null) {
          return var3;
        }
        if (param1 < 32768) {
          var4 = this.field_c.b(1, param0 + 12366, param1);
        } else {
          var4 = this.field_b.b(1, 12257, param1 & 32767);
        }
        ba var5 = new ba();
        if (param0 != -109) {
          return (ba) null;
        }
        if (var4 != null) {
          var5.a(new gb(var4), false);
          if (32768 <= param1) {
            var5.g(39);
            this.field_d.a(87, var5, (long)param1);
            return var5;
          }
          this.field_d.a(87, var5, (long)param1);
          return var5;
        }
        if (32768 > param1) {
          this.field_d.a(87, var5, (long)param1);
          return var5;
        }
        var5.g(39);
        this.field_d.a(87, var5, (long)param1);
        return var5;
    }

    public static void a(int param0) {
        field_e = null;
        if (param0 != 255) {
          field_e = (String) null;
          field_a = null;
          return;
        }
        field_a = null;
    }

    final static String a(boolean param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var6;
        String var12;
        String var13;
        String var14;
        String var15;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        var5 = SolKnight.field_L ? 1 : 0;
        var6 = "(" + nf.field_U + " " + kl.field_b + " " + jg.field_e + ") " + ob.field_h;
        var1 = var6;
        if (!param0) {
          if (te.field_O <= 0) {
            return var1;
          }
          var1 = var6 + ":";
          for (var2 = 0; te.field_O > var2; var2++) {
            var14 = var1 + ' ';
            var3 = te.field_N.field_l[var2] & 255;
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 <= var4) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var15 = var14 + (char)var4;
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var1 = var15 + (char)var3;
          }
          return var1;
        }
        field_a = (java.awt.Frame) null;
        if (te.field_O <= 0) {
          return var1;
        }
        var1Lifetime1 = var6 + ":";
        for (var2Lifetime1 = 0; te.field_O > var2Lifetime1; var2Lifetime1++) {
          var12 = var1Lifetime1 + ' ';
          var3Lifetime1 = te.field_N.field_l[var2Lifetime1] & 255;
          var4Lifetime1 = var3Lifetime1 >> 4;
          var3Lifetime1 = var3Lifetime1 & 15;
          if (10 <= var4Lifetime1) {
            var4Lifetime1 += 55;
          } else {
            var4Lifetime1 += 48;
          }
          var13 = var12 + (char)var4Lifetime1;
          if (var3Lifetime1 >= 10) {
            var3Lifetime1 += 55;
          } else {
            var3Lifetime1 += 48;
          }
          var1Lifetime1 = var13 + (char)var3Lifetime1;
        }
        return var1Lifetime1;
    }

    private oc() throws Throwable {
        throw new Error();
    }

    static {
        field_e = "The account name you use to access RuneScape and other Jagex.com games";
    }
}
