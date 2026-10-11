/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kp {
    final static void a(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4;
        for (var2 = 0; var2 < 500; var2 += 20) {
          for (var3 = 0; var3 < 660; var3 += 20) {
            var4 = param1 - (640 - var3) / 100 - (480 - var2) / 100;
            if (var4 >= 0) {
              if (var4 > 35) {
                var4 = 35;
              }
              dg.b(var3, var2, var4, param0);
            }
          }
        }
    }

    final static void b(int param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        int var4;
        for (var2 = 0; var2 < 500; var2 += 20) {
          for (var3 = 0; var3 < 660; var3 += 20) {
            var4 = param1 - var3 / 100 - var2 / 100;
            if (var4 >= 0) {
              if (var4 > 35) {
                var4 = 35;
              }
              dg.b(var3, var2, var4, param0);
            }
          }
        }
    }
}
