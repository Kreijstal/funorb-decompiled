/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class fa {
    static kb field_b;
    static long field_a;

    public static void a(int param0) {
        if (param0 != 908) {
            return;
        }
        field_b = null;
    }

    final static void a(rj param0, le param1, int param2, String param3, byte param4) {
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        var9 = Lexicominos.field_L ? 1 : 0;
        var5 = 0;
        if (param4 > 89) {
          var6 = -1;
          var7 = 1;
          if (param3.length() > var7) {
            L0: {
              var8 = param3.charAt(var7);
              if (var8 == 60) {
                var6 = (var5 >> -1378449592) - -param0.field_a[0] - -param1.b(param3.substring(0, var7));
                break L0;
              } else {
                break L0;
              }
            }
            if (0 == (var6 ^ -1)) {
              L1: {
                if (var8 != 32) {
                  break L1;
                } else {
                  var5 = var5 + param2;
                  break L1;
                }
              }
              L2: {
                param0.field_a[var7] = param0.field_a[0] + ((var5 >> -728364984) - -param1.b(param3.substring(0, 1 + var7)) + -param1.a((char) var8));
                if (var8 == 62) {
                  var6 = -1;
                  var7++;
                  break L2;
                } else {
                  var7++;
                  break L2;
                }
              }
              var7++;
              var7++;
              return;
            } else {
              L3: {
                param0.field_a[var7] = var6;
                if (var8 == 62) {
                  var6 = -1;
                  var7++;
                  break L3;
                } else {
                  var7++;
                  break L3;
                }
              }
              var7++;
              var7++;
              return;
            }
          } else {
            return;
          }
        } else {
          field_a = -103L;
          var6 = -1;
          var7 = 1;
          L4: while (true) {
            if (param3.length() <= var7) {
              return;
            } else {
              L5: {
                var8 = param3.charAt(var7);
                if (var8 == 60) {
                  var6 = (var5 >> -1378449592) - -param0.field_a[0] - -param1.b(param3.substring(0, var7));
                  break L5;
                } else {
                  break L5;
                }
              }
              L6: {
                if (0 != (var6 ^ -1)) {
                  param0.field_a[var7] = var6;
                  break L6;
                } else {
                  L7: {
                    if (var8 != 32) {
                      break L7;
                    } else {
                      var5 = var5 + param2;
                      break L7;
                    }
                  }
                  param0.field_a[var7] = param0.field_a[0] + ((var5 >> -728364984) - -param1.b(param3.substring(0, 1 + var7)) + -param1.a((char) var8));
                  break L6;
                }
              }
              if (var8 == 62) {
                var6 = -1;
                var7++;
                var7++;
                continue L4;
              } else {
                var7++;
                var7++;
                continue L4;
              }
            }
          }
        }
    }

    final static int a(int param0, int param1) {
        param1--;
        param1 = param1 | param1 >>> -1854361759;
        if (param0 > -32) {
          int discarded$1 = fa.a(78, -6);
          param1 = param1 | param1 >>> -2134165982;
          param1 = param1 | param1 >>> 1796537348;
          param1 = param1 | param1 >>> -124584952;
          param1 = param1 | param1 >>> 460566480;
          return 1 + param1;
        } else {
          param1 = param1 | param1 >>> -2134165982;
          param1 = param1 | param1 >>> 1796537348;
          param1 = param1 | param1 >>> -124584952;
          param1 = param1 | param1 >>> 460566480;
          return 1 + param1;
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = null;
    }
}
