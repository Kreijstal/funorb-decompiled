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
        String var6 = null;
        String var7 = null;
        String var8 = null;
        String stackIn_4_0 = null;
        String stackIn_14_0 = null;
        String stackOut_3_0 = null;
        String stackOut_13_0 = null;
        var5 = Confined.field_J ? 1 : 0;
        field_b = null;
        var6 = "(" + kk.field_c + " " + pk.field_c + " " + qm.field_y + ") " + Confined.field_F;
        if (0 >= ai.field_i) {
          return var6;
        } else {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            L1: {
              L2: {
                if (ai.field_i <= var2) {
                  break L2;
                } else {
                  stackOut_3_0 = var1 + 32;
                  stackIn_14_0 = stackOut_3_0;
                  stackIn_4_0 = stackOut_3_0;
                  if (var5 != 0) {
                    break L1;
                  } else {
                    L3: {
                      L4: {
                        var7 = stackIn_4_0;
                        var3 = 255 & e.field_c.field_m[var2];
                        var4 = var3 >> 4;
                        var3 = var3 & 15;
                        if (10 > var4) {
                          break L4;
                        } else {
                          var4 += 55;
                          if (var5 == 0) {
                            break L3;
                          } else {
                            break L4;
                          }
                        }
                      }
                      var4 += 48;
                      break L3;
                    }
                    L5: {
                      L6: {
                        if (var3 >= 10) {
                          break L6;
                        } else {
                          var3 += 48;
                          if (var5 == 0) {
                            break L5;
                          } else {
                            break L6;
                          }
                        }
                      }
                      var3 += 55;
                      break L5;
                    }
                    var8 = var7 + (char)var4;
                    var1 = var8 + (char)var3;
                    var2++;
                    if (var5 == 0) {
                      continue L0;
                    } else {
                      break L2;
                    }
                  }
                }
              }
              stackOut_13_0 = (String) var1;
              stackIn_14_0 = stackOut_13_0;
              break L1;
            }
            return stackIn_14_0;
          }
        }
    }

    public static void a(byte param0) {
        field_e = null;
        field_a = null;
        field_c = null;
        if (param0 != 110) {
          String discarded$2 = ui.a(43);
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
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_e = "By clicking Create, you agree to the <%0><hotspot=0>Terms of Use</hotspot><%1> and <%0><hotspot=1>Privacy Policy</hotspot><%1>.";
        field_d = "To server list";
    }
}
