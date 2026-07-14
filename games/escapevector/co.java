/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class co {
    static hh field_d;
    static om field_b;
    static lm field_a;
    static String[] field_c;
    static String field_f;
    static String[] field_e;

    public static void a(byte param0) {
        field_b = null;
        field_d = null;
        field_e = null;
        field_a = null;
        field_f = null;
        field_c = null;
        if (param0 != 63) {
            co.a((byte) -70);
        }
    }

    final static char a(ih param0, byte param1) {
        int var2 = 0;
        int var3 = 0;
        char[] var4_ref_char__ = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        char[] var9 = null;
        char[] var10 = null;
        char[] var12 = null;
        char[] var14 = null;
        char[] var16 = null;
        char[] var17 = null;
        var8 = EscapeVector.field_A;
        var2 = 119;
        var3 = param0.a((char) var2);
        var16 = tc.field_k[0];
        var14 = var16;
        var12 = var14;
        var10 = var12;
        var9 = var10;
        var4_ref_char__ = var9;
        if (param1 < -122) {
          var5 = 0;
          L0: while (true) {
            if (var5 >= var16.length) {
              var17 = tc.field_k[1];
              var5 = 0;
              L1: while (true) {
                if (var17.length <= var5) {
                  L2: {
                    var4 = vk.a((byte) -89, bb.field_R[0], param0, uj.field_f[0]);
                    var5 = param0.a((char) var4);
                    if (var5 > var3) {
                      var3 = var5;
                      var2 = var4;
                      break L2;
                    } else {
                      break L2;
                    }
                  }
                  L3: {
                    var4 = vk.a((byte) -63, bb.field_R[1], param0, uj.field_f[1]);
                    var5 = param0.a((char) var4);
                    if (var5 <= var3) {
                      break L3;
                    } else {
                      var3 = var5;
                      var2 = var4;
                      break L3;
                    }
                  }
                  return (char) var2;
                } else {
                  var6 = var17[var5];
                  var7 = param0.a((char) var6);
                  if (ml.a((char) var6, 21654)) {
                    if (var7 > var3) {
                      var2 = var6;
                      var3 = var7;
                      var5++;
                      continue L1;
                    } else {
                      var5++;
                      continue L1;
                    }
                  } else {
                    var5++;
                    continue L1;
                  }
                }
              }
            } else {
              var6 = var16[var5];
              if (ml.a((char) var6, 21654)) {
                var7 = param0.a((char) var6);
                if (var3 < var7) {
                  var3 = var7;
                  var2 = var6;
                  var5++;
                  continue L0;
                } else {
                  var5++;
                  continue L0;
                }
              } else {
                var5++;
                continue L0;
              }
            }
          }
        } else {
          return 'ￇ';
        }
    }

    final static tk a(String param0, int param1) {
        int var3 = 0;
        int var4 = 0;
        int var5 = EscapeVector.field_A;
        int var2 = param0.length();
        for (var3 = param1; var3 < var2; var3++) {
            var4 = param0.charAt(var3);
            if (48 > var4) {
                return null;
            }
            if (57 < var4) {
                return null;
            }
        }
        return wh.field_p;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_f = "Type your email address again to make sure it's correct";
        field_b = new om(0, 2, 2, 1);
        field_e = new String[]{"Well done, commander. You have secured all the stolen technology stored in the aliens' outer system.", "We are now heading for the centre of the system, where <photo>a moon orbiting a sun-baked planet holds more of our technology.<br><br>This seems to be an important centre for the aliens. <photo>There are several fuel depots. Your ship has been converted to run on alien fuel if necessary.", "Watch out for these items. Land next to them to upgrade your ship.", "Be warned that these caves are defended. These dangerous red cylinders will pull your ship in like a magnet if you get too close."};
    }
}
