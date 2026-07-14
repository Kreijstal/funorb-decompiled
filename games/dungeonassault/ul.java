/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ul {
    static String field_b;
    static String field_a;
    static String field_d;
    static char[] field_c;

    final static void a(la param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = DungeonAssault.field_K;
        var2 = 0;
        if (param1 == -440) {
          L0: while (true) {
            if (-4 >= (var2 ^ -1)) {
              var2 = 0;
              L1: while (true) {
                if (var2 >= ud.field_x) {
                  nn.field_j[param0.b((byte) 107)] = nn.field_j[param0.b((byte) 107)] + 1;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (var3 >= ud.field_x) {
                      ud.field_x = var2;
                      ud.field_x = ud.field_x + 1;
                      nb.field_a[ud.field_x] = param0;
                      return;
                    } else {
                      L3: {
                        if (nb.field_a[var3].field_n != param0.field_n) {
                          break L3;
                        } else {
                          var4 = nb.field_a[var3].b((byte) 104);
                          if (nn.field_j[var4] > co.field_H) {
                            nn.field_j[var4] = nn.field_j[var4] - 1;
                            var3++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        }
                      }
                      var2++;
                      nb.field_a[var2] = nb.field_a[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  if (param0.field_n == nb.field_a[var2].field_n) {
                    nn.field_j[nb.field_a[var2].b((byte) 115)] = nn.field_j[nb.field_a[var2].b((byte) 115)] + 1;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              nn.field_j[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
        }
    }

    public static void a(boolean param0) {
        field_a = null;
        field_b = null;
        if (!param0) {
            return;
        }
        field_d = null;
        field_c = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = "Data server full or too many connections from your address. Please try again in a few minutes.";
        field_a = "A room full of large, maggot-like creatures; their bile can burn through raiders' armour in seconds, inflicting permanent injury.<br><br>Defeated raiders permanently lose 1 <%attack>.";
        field_c = new char[]{(char)91, (char)93, (char)35};
    }
}
