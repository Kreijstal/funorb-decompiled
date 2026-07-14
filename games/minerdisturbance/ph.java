/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ph {
    static wh field_a;
    static java.math.BigInteger field_g;
    static int field_f;
    static ea[] field_e;
    static int field_d;
    static int field_c;
    static int field_b;

    public static void a(int param0) {
        Object var2 = null;
        field_e = null;
        field_g = null;
        if (param0 != 0) {
          var2 = null;
          String discarded$2 = ph.a((byte) 20, -27, (byte[]) null, 126);
          field_a = null;
          return;
        } else {
          field_a = null;
          return;
        }
    }

    final static String a(byte param0, int param1, byte[] param2, int param3) {
        char[] var4 = null;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        char[] var10 = null;
        char[] var11 = null;
        char[] var12 = null;
        char[] var13 = null;
        char[] var14 = null;
        char[] var15 = null;
        char[] var16 = null;
        var9 = MinerDisturbance.field_ab;
        if (param0 > 13) {
          var15 = new char[param1];
          var13 = var15;
          var12 = var13;
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          if (param1 > var6) {
            var7 = param2[var6 + param3] & 255;
            if (0 != var7) {
              if (var7 >= 128) {
                if ((var7 ^ -1) <= -161) {
                  var5++;
                  var10[var5] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var15, 0, var5);
                } else {
                  L0: {
                    var8 = tk.field_e[var7 + -128];
                    if (var8 != 0) {
                      break L0;
                    } else {
                      var8 = 63;
                      break L0;
                    }
                  }
                  var7 = var8;
                  var5++;
                  var10[var5] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var15, 0, var5);
                }
              } else {
                var5++;
                var10[var5] = (char)var7;
                var6++;
                var6++;
                var6++;
                return new String(var15, 0, var5);
              }
            } else {
              var6++;
              var6++;
              var6++;
              var6++;
              return new String(var15, 0, var5);
            }
          } else {
            return new String(var15, 0, var5);
          }
        } else {
          field_e = null;
          var16 = new char[param1];
          var14 = var16;
          var12 = var14;
          var11 = var12;
          var10 = var11;
          var4 = var10;
          var5 = 0;
          var6 = 0;
          if (param1 > var6) {
            var7 = param2[var6 + param3] & 255;
            if (0 != var7) {
              if (var7 >= 128) {
                if ((var7 ^ -1) <= -161) {
                  var5++;
                  var10[var5] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var16, 0, var5);
                } else {
                  L1: {
                    var8 = tk.field_e[var7 + -128];
                    if (var8 != 0) {
                      break L1;
                    } else {
                      var8 = 63;
                      break L1;
                    }
                  }
                  var7 = var8;
                  var5++;
                  var10[var5] = (char)var7;
                  var6++;
                  var6++;
                  var6++;
                  return new String(var16, 0, var5);
                }
              } else {
                var5++;
                var10[var5] = (char)var7;
                var6++;
                var6++;
                var6++;
                return new String(var16, 0, var5);
              }
            } else {
              var6++;
              var6++;
              var6++;
              var6++;
              return new String(var16, 0, var5);
            }
          } else {
            return new String(var16, 0, var5);
          }
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = new java.math.BigInteger("65537");
        field_c = 0;
    }
}
