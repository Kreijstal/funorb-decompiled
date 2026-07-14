/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class jh {
    static int field_a;

    final static void a(int param0) {
        lb.field_O = le.a(-1461);
        if (param0 >= -54) {
            return;
        }
        gl.field_E = new vl();
        nk.a(true, 41, true);
    }

    final static int a(oh param0, String param1, int param2, boolean param3) {
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        L0: {
          var9 = TrackController.field_F ? 1 : 0;
          var4 = 0;
          if (!param3) {
            break L0;
          } else {
            jh.a(91);
            break L0;
          }
        }
        var5 = 0;
        var6 = param1.length();
        var7 = 0;
        L1: while (true) {
          if (var7 >= var6) {
            L2: {
              if (var4 >= var5) {
                break L2;
              } else {
                var4 = var5;
                break L2;
              }
            }
            return var4;
          } else {
            var8 = param1.charAt(var7);
            var5 = var5 + param0.a((char) var8);
            if (param2 <= var5) {
              L3: {
                if (var8 == 32) {
                  var5 = var5 - param0.a((char) var8);
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var8 == 32) {
                  break L4;
                } else {
                  if (var8 == 45) {
                    break L4;
                  } else {
                    var7++;
                    continue L1;
                  }
                }
              }
              L5: {
                if (var4 < var5) {
                  var4 = var5;
                  break L5;
                } else {
                  break L5;
                }
              }
              var5 = 0;
              var7++;
              continue L1;
            } else {
              var7++;
              continue L1;
            }
          }
        }
    }

    static {
    }
}
