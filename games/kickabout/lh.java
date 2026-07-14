/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh extends tm {
    static int[][] field_E;
    static al field_D;
    static String field_A;
    static String field_C;
    static String field_F;

    final static ut a(int param0, byte param1, int param2) {
        ut var3 = null;
        int var4 = 0;
        int var5 = 0;
        ut var6 = null;
        var5 = Kickabout.field_G;
        if (param1 != -96) {
          return null;
        } else {
          var6 = new ut(param2, param2);
          var3 = var6;
          var4 = 0;
          L0: while (true) {
            if (var3.field_y.length <= var4) {
              return var3;
            } else {
              var6.field_y[var4] = param0;
              var4++;
              continue L0;
            }
          }
        }
    }

    lh(String param0, Class[] param1, String param2) {
        super(param0, param1, param2);
    }

    final static String a(int param0, int param1, String param2) {
        int var4 = 0;
        ml var6 = null;
        ml var7 = null;
        CharSequence var8 = null;
        var8 = (CharSequence) (Object) param2;
        if (ef.a(var8, param1 + -10007)) {
          if ((ts.field_d ^ -1) != -3) {
            return ss.field_h;
          } else {
            if (hm.a((byte) 82, param2)) {
              return ec.field_g;
            } else {
              if (!lf.a(param2, -64)) {
                if (param1 <= bc.field_d) {
                  if (-1 > eq.field_d) {
                    if (-201 > bc.field_d) {
                      if (hi.a(0, param2)) {
                        return vo.a((byte) -18, at.field_Gb, new String[1]);
                      } else {
                        var7 = or.field_d;
                        var7.b(param0, (byte) 93);
                        var7.field_n = var7.field_n + 1;
                        var4 = var7.field_n;
                        var7.a(123, 0);
                        var7.a(param1 ^ 14090, param2);
                        var7.c(62, -var4 + var7.field_n);
                        return null;
                      }
                    } else {
                      return jg.field_A;
                    }
                  } else {
                    return jg.field_A;
                  }
                } else {
                  if (-201 < (bc.field_d ^ -1)) {
                    if (hi.a(0, param2)) {
                      return vo.a((byte) -18, at.field_Gb, new String[1]);
                    } else {
                      var6 = or.field_d;
                      var6.b(param0, (byte) 93);
                      var6.field_n = var6.field_n + 1;
                      var4 = var6.field_n;
                      var6.a(123, 0);
                      var6.a(param1 ^ 14090, param2);
                      var6.c(62, -var4 + var6.field_n);
                      return null;
                    }
                  } else {
                    return jg.field_A;
                  }
                }
              } else {
                return vo.a((byte) -18, ah.field_m, new String[1]);
              }
            }
          }
        } else {
          return kq.field_Ib;
        }
    }

    public static void g(byte param0) {
        field_A = null;
        field_C = null;
        if (param0 != 96) {
            return;
        }
        field_F = null;
        field_D = null;
        field_E = null;
    }

    final li a(byte param0, li[] param1) {
        if (param0 != 84) {
            return null;
        }
        lb.a(-28153, (String) param1[0].field_d);
        return new li((Object) (Object) "void");
    }

    final static bc a(iw param0, int param1) {
        bc var2 = null;
        Object var3 = null;
        if (param1 != 18653) {
          var3 = null;
          String discarded$2 = lh.a(8, 73, (String) null);
          var2 = new bc();
          var2.a(param0, 62);
          return var2;
        } else {
          var2 = new bc();
          var2.a(param0, 62);
          return var2;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_C = "Amateur Teams";
        field_F = "Go to Auctions";
    }
}
