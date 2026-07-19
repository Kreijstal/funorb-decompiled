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
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var9 = null;
        String var13 = null;
        String var14 = null;
        String var15 = null;
        String var16 = null;
        String var17 = null;
        var5 = Confined.field_J ? 1 : 0;
        if (param0 == 10) {
          var15 = "(" + kk.field_c + " " + pk.field_c + " " + qm.field_y + ") " + Confined.field_F;
          var1 = var15;
          if (0 >= ai.field_i) {
            return var1;
          } else {
            var1 = var15 + ":";
            var2 = 0;
            L0: while (true) {
              if (ai.field_i <= var2) {
                return var1;
              } else {
                L1: {
                  var16 = var1 + ' ';
                  var3 = 255 & e.field_c.field_m[var2];
                  var4 = var3 >> 320483268;
                  var3 = var3 & 15;
                  if (10 > var4) {
                    var4 += 48;
                    break L1;
                  } else {
                    var4 += 55;
                    break L1;
                  }
                }
                L2: {
                  if (-11 >= (var3 ^ -1)) {
                    var3 += 55;
                    break L2;
                  } else {
                    var3 += 48;
                    break L2;
                  }
                }
                var17 = var16 + (char)var4;
                var1 = var17 + (char)var3;
                var2++;
                continue L0;
              }
            }
          }
        } else {
          field_b = (String) null;
          var9 = "(" + kk.field_c + " " + pk.field_c + " " + qm.field_y + ") " + Confined.field_F;
          var1 = var9;
          if (0 < ai.field_i) {
            var1 = var9 + ":";
            var2 = 0;
            L3: while (true) {
              if (ai.field_i > var2) {
                L4: {
                  var13 = var1 + ' ';
                  var3 = 255 & e.field_c.field_m[var2];
                  var4 = var3 >> 320483268;
                  var3 = var3 & 15;
                  if (10 > var4) {
                    var4 += 48;
                    break L4;
                  } else {
                    var4 += 55;
                    break L4;
                  }
                }
                L5: {
                  if (-11 >= (var3 ^ -1)) {
                    var3 += 55;
                    break L5;
                  } else {
                    var3 += 48;
                    break L5;
                  }
                }
                var14 = var13 + (char)var4;
                var1 = var14 + (char)var3;
                var2++;
                continue L3;
              } else {
                return var1;
              }
            }
          } else {
            return var1;
          }
        }
    }

    public static void a(byte param0) {
        String discarded$2 = null;
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0 != 110) {
          discarded$2 = ui.a(43);
          field_b = null;
          field_d = null;
          return;
        } else {
          field_b = null;
          field_d = null;
          return;
        }
    }

    static {
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = "To server list";
    }
}
