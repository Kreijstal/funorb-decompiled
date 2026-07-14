/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class lh {
    int field_a;
    String field_e;
    String field_d;
    static int field_f;
    String field_b;
    gk field_c;

    final static String a(int param0, int param1, int param2, byte[] param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        var9 = Bounce.field_N;
        var11 = new char[param2];
        var10 = var11;
        var4 = var10;
        var5 = 0;
        var6 = 0;
        if (param1 == -3789) {
          L0: while (true) {
            if (param2 <= var6) {
              return new String(var11, 0, var5);
            } else {
              var7 = param3[var6 + param0] & 255;
              if (-1 != (var7 ^ -1)) {
                L1: {
                  if (var7 < 128) {
                    break L1;
                  } else {
                    if (160 <= var7) {
                      break L1;
                    } else {
                      L2: {
                        var8 = sa.field_j[var7 + -128];
                        if (var8 == 0) {
                          var8 = 63;
                          break L2;
                        } else {
                          break L2;
                        }
                      }
                      var7 = var8;
                      break L1;
                    }
                  }
                }
                var5++;
                var4[var5] = (char)var7;
                var6++;
                continue L0;
              } else {
                var6++;
                continue L0;
              }
            }
          }
        } else {
          return null;
        }
    }

    final static boolean a(int param0) {
        if (param0 != 255) {
            Object var2 = null;
            String discarded$0 = lh.a(-62, -97, (CharSequence[]) null, 63);
        }
        return qg.field_g == vc.field_F ? true : false;
    }

    final static String a(int param0, int param1, CharSequence[] param2, int param3) {
        CharSequence var4_ref = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7_int = 0;
        StringBuilder var7 = null;
        CharSequence var8_ref_CharSequence = null;
        int var8 = 0;
        CharSequence var9 = null;
        int var10 = 0;
        CharSequence var11 = null;
        var10 = Bounce.field_N;
        if (-1 != (param1 ^ -1)) {
          if (param1 == 1) {
            var11 = param2[param3];
            var4_ref = var11;
            if (var4_ref != null) {
              return ((Object) (Object) var11).toString();
            } else {
              return "null";
            }
          } else {
            var4 = param3 + param1;
            var5 = 0;
            var6 = -43 % ((-71 - param0) / 42);
            var7_int = param3;
            L0: while (true) {
              if (var4 <= var7_int) {
                var7 = new StringBuilder(var5);
                var8 = param3;
                L1: while (true) {
                  if (var8 >= var4) {
                    return var7.toString();
                  } else {
                    var9 = param2[var8];
                    if (var9 != null) {
                      StringBuilder discarded$2 = var7.append(var9);
                      var8++;
                      continue L1;
                    } else {
                      StringBuilder discarded$3 = var7.append("null");
                      var8++;
                      continue L1;
                    }
                  }
                }
              } else {
                var8_ref_CharSequence = param2[var7_int];
                if (var8_ref_CharSequence != null) {
                  var5 = var5 + var8_ref_CharSequence.length();
                  var7_int++;
                  continue L0;
                } else {
                  var5 += 4;
                  var7_int++;
                  continue L0;
                }
              }
            }
          }
        } else {
          return "";
        }
    }

    private lh() throws Throwable {
        throw new Error();
    }

    static {
    }
}
