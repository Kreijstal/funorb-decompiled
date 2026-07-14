/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kw {
    static vn field_b;
    static qr field_c;
    static hr field_a;

    final static void a(int param0, int param1, int param2, int param3, int param4) {
        kc.j(125);
        lk.e(param3, param1, param4, param0);
        if (param2 != 1) {
            field_b = null;
        }
    }

    final static void a(byte param0, tk param1, int param2, vn param3, String param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Sumoblitz.field_L ? 1 : 0;
        if (param0 != 90) {
          field_b = null;
          var5 = 0;
          var6 = -1;
          var7 = 1;
          L0: while (true) {
            if (param4.length() <= var7) {
              return;
            } else {
              L1: {
                var8 = param4.charAt(var7);
                if (60 != var8) {
                  break L1;
                } else {
                  var6 = (var5 >> -887551960) - -param1.field_b[0] - -param3.a(param4.substring(0, var7));
                  break L1;
                }
              }
              L2: {
                if ((var6 ^ -1) == 0) {
                  L3: {
                    if (var8 != 32) {
                      break L3;
                    } else {
                      var5 = var5 + param2;
                      break L3;
                    }
                  }
                  param1.field_b[var7] = param1.field_b[0] + ((var5 >> 1316085832) + (param3.a(param4.substring(0, 1 + var7)) + -param3.a((char) var8)));
                  break L2;
                } else {
                  param1.field_b[var7] = var6;
                  break L2;
                }
              }
              if (62 == var8) {
                var6 = -1;
                var7++;
                var7++;
                continue L0;
              } else {
                var7++;
                var7++;
                continue L0;
              }
            }
          }
        } else {
          L4: {
            var5 = 0;
            var6 = -1;
            var7 = 1;
            if (param4.length() <= var7) {
              break L4;
            } else {
              L5: {
                var8 = param4.charAt(var7);
                if (60 != var8) {
                  break L5;
                } else {
                  var6 = (var5 >> -887551960) - -param1.field_b[0] - -param3.a(param4.substring(0, var7));
                  break L5;
                }
              }
              L6: {
                if ((var6 ^ -1) == 0) {
                  L7: {
                    if (var8 != 32) {
                      break L7;
                    } else {
                      var5 = var5 + param2;
                      break L7;
                    }
                  }
                  param1.field_b[var7] = param1.field_b[0] + ((var5 >> 1316085832) + (param3.a(param4.substring(0, 1 + var7)) + -param3.a((char) var8)));
                  break L6;
                } else {
                  param1.field_b[var7] = var6;
                  break L6;
                }
              }
              L8: {
                if (62 != var8) {
                  var7++;
                  break L8;
                } else {
                  var6 = -1;
                  var7++;
                  break L8;
                }
              }
              var7++;
              var7++;
              break L4;
            }
          }
          return;
        }
    }

    public static void a(byte param0) {
        field_c = null;
        if (param0 >= -86) {
            field_b = null;
            field_b = null;
            field_a = null;
            return;
        }
        field_b = null;
        field_a = null;
    }

    static {
    }
}
