/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class bh {
    static int field_j;
    int field_a;
    static int field_e;
    int field_d;
    static int field_f;
    static String field_b;
    int field_l;
    int field_k;
    int field_c;
    static int field_g;
    int field_i;
    static String field_h;

    abstract void a(int param0, int param1, int param2);

    public static void a(int param0) {
        field_h = null;
        field_b = null;
        if (param0 != -8765) {
          bh.a(68);
        }
    }

    abstract void a(int param0, int param1);

    final static String a(byte param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var12;
        String var16;
        String var17;
        String var18;
        String var19;
        String var20;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        var5 = MonkeyPuzzle2.field_F ? 1 : 0;
        if (param0 < 0) {
          var18 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
          var1 = var18;
          if (rc.field_f <= 0) {
            return var1;
          }
          var1Lifetime3 = var18 + ":";
          for (var2 = 0; rc.field_f > var2; var2++) {
            var19 = var1Lifetime3 + ' ';
            var3 = 255 & MonkeyPuzzle2.field_D.field_g[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (var4 >= 10) {
              var4 += 55;
            } else {
              var4 += 48;
            }
            var20 = var19 + (char)var4;
            if (var3 < 10) {
              var3 += 48;
            } else {
              var3 += 55;
            }
            var1Lifetime3 = var20 + (char)var3;
          }
          return var1Lifetime3;
        }
        field_j = -79;
        var12 = "(" + bk.field_f + " " + il.field_e + " " + hk.field_l + ") " + wk.field_a;
        var1Lifetime1 = var12;
        if (rc.field_f <= 0) {
          return var1Lifetime1;
        }
        var1Lifetime2 = var12 + ":";
        for (var2Lifetime1 = 0; rc.field_f > var2Lifetime1; var2Lifetime1++) {
          var16 = var1Lifetime2 + ' ';
          var3Lifetime1 = 255 & MonkeyPuzzle2.field_D.field_g[var2Lifetime1];
          var4Lifetime1 = var3Lifetime1 >> 4;
          var3Lifetime1 = var3Lifetime1 & 15;
          if (var4Lifetime1 >= 10) {
            var4Lifetime1 += 55;
          } else {
            var4Lifetime1 += 48;
          }
          var17 = var16 + (char)var4Lifetime1;
          if (var3Lifetime1 < 10) {
            var3Lifetime1 += 48;
          } else {
            var3Lifetime1 += 55;
          }
          var1Lifetime2 = var17 + (char)var3Lifetime1;
        }
        return var1Lifetime2;
    }

    static {
        field_e = 0;
        field_h = "Account created successfully!";
    }
}
