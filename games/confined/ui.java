/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ui {
    static String field_d;
    static jj field_c;
    static nf field_a;
    static String field_e;
    static String field_b;

    final static String a(int param0) {
        String var1;
        int var2;
        int var3;
        int var4;
        int var5;
        String var9;
        String var13;
        String var14;
        String var15;
        String var16;
        String var17;
        int var2Lifetime1;
        int var3Lifetime1;
        int var4Lifetime1;
        String var1Lifetime1;
        String var1Lifetime2;
        String var1Lifetime3;
        var5 = Confined.field_J ? 1 : 0;
        if (param0 == 10) {
          var15 = "(" + kk.field_c + " " + pk.field_c + " " + qm.field_y + ") " + Confined.field_F;
          var1 = var15;
          if (0 >= ai.field_i) {
            return var1;
          }
          var1Lifetime3 = var15 + ":";
          for (var2 = 0; ai.field_i > var2; var2++) {
            var16 = var1Lifetime3 + ' ';
            var3 = 255 & e.field_c.field_m[var2];
            var4 = var3 >> 4;
            var3 = var3 & 15;
            if (10 > var4) {
              var4 += 48;
            } else {
              var4 += 55;
            }
            if (var3 >= 10) {
              var3 += 55;
            } else {
              var3 += 48;
            }
            var17 = var16 + (char)var4;
            var1Lifetime3 = var17 + (char)var3;
          }
          return var1Lifetime3;
        }
        field_b = (String) null;
        var9 = "(" + kk.field_c + " " + pk.field_c + " " + qm.field_y + ") " + Confined.field_F;
        var1Lifetime1 = var9;
        if (0 >= ai.field_i) {
          return var1Lifetime1;
        }
        var1Lifetime2 = var9 + ":";
        for (var2Lifetime1 = 0; ai.field_i > var2Lifetime1; var2Lifetime1++) {
          var13 = var1Lifetime2 + ' ';
          var3Lifetime1 = 255 & e.field_c.field_m[var2Lifetime1];
          var4Lifetime1 = var3Lifetime1 >> 4;
          var3Lifetime1 = var3Lifetime1 & 15;
          if (10 > var4Lifetime1) {
            var4Lifetime1 += 48;
          } else {
            var4Lifetime1 += 55;
          }
          if (var3Lifetime1 >= 10) {
            var3Lifetime1 += 55;
          } else {
            var3Lifetime1 += 48;
          }
          var14 = var13 + (char)var4Lifetime1;
          var1Lifetime2 = var14 + (char)var3Lifetime1;
        }
        return var1Lifetime2;
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0 == 110) {
          field_b = null;
          field_d = null;
          return;
        }
        ui.a(43);
        field_b = null;
        field_d = null;
    }

    static {
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = "To server list";
    }
}
