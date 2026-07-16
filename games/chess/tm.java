/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class tm {
    int field_e;
    static int field_c;
    int field_g;
    static jc field_a;
    int field_f;
    int field_i;
    static int field_d;
    static String field_b;
    static String field_h;

    final static void a(boolean param0, pg param1, int param2) {
        nk var3 = null;
        var3 = qn.field_U;
        var3.f(param2, -114);
        if (param0) {
          field_d = -61;
          var3.c(param1.field_q, (byte) -91);
          var3.c(param1.field_u, (byte) -60);
          return;
        } else {
          var3.c(param1.field_q, (byte) -91);
          var3.c(param1.field_u, (byte) -60);
          return;
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_h = null;
        field_a = null;
        if (param0 <= 5) {
            field_d = -35;
        }
    }

    final static String b(byte param0) {
        String var1 = null;
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        String var6 = null;
        String var7 = null;
        String var8 = null;
        int stackIn_12_0 = 0;
        int stackIn_12_1 = 0;
        int stackIn_14_0 = 0;
        int stackIn_14_1 = 0;
        int stackOut_11_0 = 0;
        int stackOut_11_1 = 0;
        var5 = Chess.field_G;
        var6 = "(" + lf.field_T + " " + wc.field_u + " " + hh.field_o + ") " + wg.field_B;
        if (sb.field_sb > 0) {
          var1 = var6 + ":";
          var2 = 0;
          L0: while (true) {
            if (sb.field_sb > var2) {
              var7 = var1 + 32;
              var3 = 255 & tk.field_h.field_o[var2];
              var4 = var3 >> -1927438172;
              var3 = var3 & 15;
              stackOut_11_0 = var4 ^ -1;
              stackOut_11_1 = -11;
              stackIn_14_0 = stackOut_11_0;
              stackIn_14_1 = stackOut_11_1;
              stackIn_12_0 = stackOut_11_0;
              stackIn_12_1 = stackOut_11_1;
              if (var5 != 0) {
                if (stackIn_14_0 > stackIn_14_1) {
                  String discarded$4 = tm.b((byte) 71);
                  return var7;
                } else {
                  return var7;
                }
              } else {
                L1: {
                  L2: {
                    if (stackIn_12_0 > stackIn_12_1) {
                      break L2;
                    } else {
                      var4 += 55;
                      if (var5 == 0) {
                        break L1;
                      } else {
                        break L2;
                      }
                    }
                  }
                  var4 += 48;
                  break L1;
                }
                L3: {
                  L4: {
                    if (var3 < 10) {
                      break L4;
                    } else {
                      var3 += 55;
                      if (var5 == 0) {
                        break L3;
                      } else {
                        break L4;
                      }
                    }
                  }
                  var3 += 48;
                  break L3;
                }
                var8 = var7 + (char)var4;
                var1 = var8 + (char)var3;
                var2++;
                if (var5 == 0) {
                  continue L0;
                } else {
                  if (param0 > -119) {
                    String discarded$5 = tm.b((byte) 71);
                    return var1;
                  } else {
                    return var1;
                  }
                }
              }
            } else {
              if (param0 > -119) {
                String discarded$6 = tm.b((byte) 71);
                return var1;
              } else {
                return var1;
              }
            }
          }
        } else {
          if (param0 > -119) {
            String discarded$7 = tm.b((byte) 71);
            return var6;
          } else {
            return var6;
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = new jc();
        field_b = "Show players in <%0>'s game";
        field_h = "Players";
    }
}
