/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class va extends rf {
    int[] field_q;
    int[] field_g;
    byte[][][] field_l;
    int field_k;
    static String field_u;
    bk[] field_i;
    int[] field_r;
    bk[] field_p;
    int field_n;
    static rk field_h;
    static long field_j;
    static int field_f;
    static o field_m;
    static int field_s;
    static String[] field_t;
    static String field_o;

    final static String a(int param0, int param1, byte[] param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        var13 = new char[param3];
        var12 = var13;
        var11 = var12;
        var10 = var11;
        var9 = var10;
        var4 = var9;
        var5 = 0;
        if (param1 <= 59) {
          va.b((byte) 21);
          var6 = 0;
          if (param3 > var6) {
            var7 = 255 & param2[param0 - -var6];
            if (0 != var7) {
              if (128 <= var7) {
                if (-161 >= (var7 ^ -1)) {
                  var5++;
                  var9[var5] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var13, 0, var5);
                } else {
                  L0: {
                    var8 = ee.field_c[-128 + var7];
                    if (0 == var8) {
                      var8 = 63;
                      break L0;
                    } else {
                      break L0;
                    }
                  }
                  var7 = var8;
                  var5++;
                  var9[var5] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var13, 0, var5);
                }
              } else {
                var5++;
                var9[var5] = (char)var7;
                var6++;
                var6++;
                var6++;
                var6++;
                return new String(var13, 0, var5);
              }
            } else {
              var6++;
              var6++;
              var6++;
              var6++;
              return new String(var13, 0, var5);
            }
          } else {
            return new String(var13, 0, var5);
          }
        } else {
          L1: {
            var6 = 0;
            if (param3 <= var6) {
              break L1;
            } else {
              L2: {
                var7 = 255 & param2[param0 - -var6];
                if (0 != var7) {
                  L3: {
                    if (128 > var7) {
                      break L3;
                    } else {
                      if (-161 >= (var7 ^ -1)) {
                        break L3;
                      } else {
                        L4: {
                          var8 = ee.field_c[-128 + var7];
                          if (0 == var8) {
                            var8 = 63;
                            break L4;
                          } else {
                            break L4;
                          }
                        }
                        var7 = var8;
                        break L3;
                      }
                    }
                  }
                  var5++;
                  var9[var5] = (char)var7;
                  var6++;
                  break L2;
                } else {
                  var6++;
                  var6++;
                  break L2;
                }
              }
              var6++;
              var6++;
              break L1;
            }
          }
          return new String(var13, 0, var5);
        }
    }

    public static void b(byte param0) {
        field_h = null;
        int var1 = -70 / ((8 - param0) / 59);
        field_m = null;
        field_o = null;
        field_u = null;
        field_t = null;
    }

    va() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "Friends can be added in multiplayer<nbsp>games";
        field_h = new rk();
        field_m = new o(0, 2, 2, 1);
        field_o = "Error connecting to server. Please try using a different server.";
    }
}
