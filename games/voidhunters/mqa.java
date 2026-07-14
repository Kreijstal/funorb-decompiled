/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class mqa extends rqa {
    static int field_s;
    static gl field_r;
    static String field_p;
    static float field_o;
    static int field_q;

    mqa(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static lkb a(int param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = VoidHunters.field_G;
        var2 = param1.length();
        if (-1 == (var2 ^ -1)) {
          return br.field_f;
        } else {
          if ((var2 ^ -1) < -64) {
            return qw.field_j;
          } else {
            var3 = 0;
            L0: while (true) {
              if (var2 <= var3) {
                if (param0 == -23150) {
                  return null;
                } else {
                  var6 = null;
                  lkb discarded$1 = mqa.a(-101, (String) null);
                  return null;
                }
              } else {
                var4 = param1.charAt(var3);
                if (var4 != 45) {
                  if (tea.field_a.indexOf(var4) == -1) {
                    return ira.field_b;
                  } else {
                    var3++;
                    var3++;
                    continue L0;
                  }
                } else {
                  L1: {
                    if (var3 == 0) {
                      break L1;
                    } else {
                      if (var3 == var2 - 1) {
                        break L1;
                      } else {
                        var3++;
                        var3++;
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return ira.field_b;
                }
              }
            }
          }
        }
    }

    public static void a(int param0) {
        Object var2 = null;
        if (param0 > -6) {
          var2 = null;
          lkb discarded$2 = mqa.a(105, (String) null);
          field_p = null;
          field_r = null;
          return;
        } else {
          field_p = null;
          field_r = null;
          return;
        }
    }

    final nc a(nc[] param0, int param1) {
        Object var4 = null;
        si.a(33, 62, param0[0].a(29));
        if (param1 >= -119) {
          var4 = null;
          nc discarded$2 = ((mqa) this).a((nc[]) null, -71);
          return new nc((Object) (Object) "void");
        } else {
          return new nc((Object) (Object) "void");
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_s = 131072;
        field_r = new gl(1);
        field_o = 1.0f;
        field_p = "Remove selected event";
    }
}
