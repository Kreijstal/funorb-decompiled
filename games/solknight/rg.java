/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rg {
    static boolean[] field_e;
    static qf field_f;
    static byte[][][] field_d;
    static ff field_b;
    static int field_c;
    static String field_a;

    final static pc a(byte param0, String param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        Object var6 = null;
        var5 = SolKnight.field_L ? 1 : 0;
        var2 = param1.length();
        if (var2 != 0) {
          if ((var2 ^ -1) >= -64) {
            var3 = 0;
            L0: while (true) {
              if (var3 >= var2) {
                if (param0 <= 102) {
                  var6 = null;
                  ug discarded$1 = rg.a((String) null, -120, -30);
                  return null;
                } else {
                  return null;
                }
              } else {
                var4 = param1.charAt(var3);
                if (var4 == 45) {
                  L1: {
                    if (0 == var3) {
                      break L1;
                    } else {
                      if (var3 == var2 + -1) {
                        break L1;
                      } else {
                        var3++;
                        continue L0;
                      }
                    }
                  }
                  return si.field_C;
                } else {
                  if (0 == (cg.field_b.indexOf(var4) ^ -1)) {
                    return si.field_C;
                  } else {
                    var3++;
                    continue L0;
                  }
                }
              }
            }
          } else {
            return el.field_o;
          }
        } else {
          return h.field_a;
        }
    }

    final static ug a(String param0, int param1, int param2) {
        qk var3 = new qk();
        ((ug) (Object) var3).field_b = param1;
        if (param2 != 2525) {
            String discarded$0 = rg.a(-91);
        }
        ((ug) (Object) var3).field_c = param0;
        return (ug) (Object) var3;
    }

    final static void a(o[] param0, int param1) {
        int var2 = 39 / ((param1 - 51) / 37);
        jb.field_d = param0;
        if (jb.field_d != null) {
            if (-4 < (param0.length ^ -1)) {
                throw new IllegalArgumentException("");
            }
        }
    }

    public static void a(byte param0) {
        field_b = null;
        field_e = null;
        field_d = null;
        if (param0 != -40) {
            field_a = null;
        }
        field_a = null;
        field_f = null;
    }

    final static String a(int param0) {
        if (param0 != 0) {
            field_c = 11;
        }
        if (!(gf.field_Z != ma.field_o)) {
            return te.field_K;
        }
        if (!(gb.field_i != gf.field_Z)) {
            return uh.field_r;
        }
        if (!(td.field_h.a(false))) {
            return uh.field_r;
        }
        return me.field_h;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = new qf();
        field_b = new ff(8, 0, 4, 1);
        field_a = "Game over";
    }
}
