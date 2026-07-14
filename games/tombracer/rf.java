/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rf {
    static String field_b;
    static String field_a;
    static String[] field_c;

    public static void a(byte param0) {
        field_c = null;
        field_b = null;
        if (param0 != -19) {
            return;
        }
        field_a = null;
    }

    final static long b(byte param0) {
        if (param0 != -121) {
            return 20L;
        }
        return -ue.field_s + bva.b((byte) -107);
    }

    final static String a(boolean param0, String param1, int param2) {
        int var4 = 0;
        kh var6 = null;
        kh var7 = null;
        CharSequence var8 = null;
        int stackIn_11_0 = 0;
        int stackOut_10_0 = 0;
        int stackOut_9_0 = 0;
        var8 = (CharSequence) (Object) param1;
        if (!fs.a(param0, var8)) {
          return pk.field_v;
        } else {
          if (ae.field_g != 2) {
            return db.field_j;
          } else {
            if (!ue.a(param1, 0)) {
              L0: {
                if (param0) {
                  stackOut_10_0 = 0;
                  stackIn_11_0 = stackOut_10_0;
                  break L0;
                } else {
                  stackOut_9_0 = 1;
                  stackIn_11_0 = stackOut_9_0;
                  break L0;
                }
              }
              if (dda.a(stackIn_11_0 != 0, param1)) {
                return gl.a((byte) 119, ce.field_w, new String[1]);
              } else {
                if (ii.field_a >= 100) {
                  if (wla.field_ub > 0) {
                    if (-201 < (ii.field_a ^ -1)) {
                      if (qaa.a(2180, param1)) {
                        return gl.a((byte) 119, vra.field_c, new String[1]);
                      } else {
                        var7 = ql.field_k;
                        var7.k(param2, -2988);
                        var7.field_h = var7.field_h + 1;
                        var4 = var7.field_h;
                        var7.i(0, 0);
                        var7.a(param1, false);
                        var7.d(var7.field_h + -var4, (byte) 40);
                        return null;
                      }
                    } else {
                      return bq.field_b;
                    }
                  } else {
                    return bq.field_b;
                  }
                } else {
                  if (-201 < (ii.field_a ^ -1)) {
                    if (qaa.a(2180, param1)) {
                      return gl.a((byte) 119, vra.field_c, new String[1]);
                    } else {
                      var6 = ql.field_k;
                      var6.k(param2, -2988);
                      var6.field_h = var6.field_h + 1;
                      var4 = var6.field_h;
                      var6.i(0, 0);
                      var6.a(param1, false);
                      var6.d(var6.field_h + -var4, (byte) 40);
                      return null;
                    }
                  } else {
                    return bq.field_b;
                  }
                }
              }
            } else {
              return iia.field_q;
            }
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Reset penalty <%0>";
        field_b = "Find opponent";
        field_c = new String[]{"Title", "Game", "Win", "Lose"};
    }
}
