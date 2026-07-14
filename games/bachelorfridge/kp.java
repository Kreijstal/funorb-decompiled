/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 500) {
            return;
          } else {
            var3 = 0;
            L1: while (true) {
              if (var3 >= 660) {
                var2 += 20;
                continue L0;
              } else {
                var4 = param1 - (640 - var3) / 100 - (480 - var2) / 100;
                if (var4 >= 0) {
                  L2: {
                    if (var4 <= 35) {
                      break L2;
                    } else {
                      var4 = 35;
                      break L2;
                    }
                  }
                  dg.b(var3, var2, var4, param0);
                  var3 += 20;
                  var3 += 20;
                  continue L1;
                } else {
                  var3 += 20;
                  var3 += 20;
                  var3 += 20;
                  continue L1;
                }
              }
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        var2 = 0;
        L0: while (true) {
          if (var2 >= 500) {
            return;
          } else {
            var3 = 0;
            L1: while (true) {
              if (var3 >= 660) {
                var2 += 20;
                continue L0;
              } else {
                var4 = param1 - var3 / 100 - var2 / 100;
                if (var4 >= 0) {
                  L2: {
                    if (var4 <= 35) {
                      break L2;
                    } else {
                      var4 = 35;
                      break L2;
                    }
                  }
                  dg.b(var3, var2, var4, param0);
                  var3 += 20;
                  var3 += 20;
                  continue L1;
                } else {
                  var3 += 20;
                  var3 += 20;
                  var3 += 20;
                  continue L1;
                }
              }
            }
          }
        }
    }
}
