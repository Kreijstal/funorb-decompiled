/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_a;

    final static void a(int param0) {
        int var1 = 0;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        var4 = ZombieDawn.field_J;
        en.c();
        jj.field_H = new int[260];
        f.field_a = 11;
        if (param0 == 255) {
          var1 = 0;
          L0: while (true) {
            if (-257 >= (var1 ^ -1)) {
              var5 = 256;
              var1 = var5;
              L1: while (true) {
                if (jj.field_H.length > var5) {
                  jj.field_H[var5] = 255;
                  var5++;
                  continue L1;
                } else {
                  return;
                }
              }
            } else {
              var2 = 15.0;
              jj.field_H[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
              var1++;
              continue L0;
            }
          }
        } else {
          field_a = null;
          var1 = 0;
          L2: while (true) {
            if (-257 >= (var1 ^ -1)) {
              var5 = 256;
              var1 = var5;
              L3: while (true) {
                if (jj.field_H.length > var5) {
                  jj.field_H[var5] = 255;
                  var5++;
                  continue L3;
                } else {
                  return;
                }
              }
            } else {
              var2 = 15.0;
              jj.field_H[var1] = (int)(255.0 * Math.pow((double)((float)var1 / 256.0f), var2));
              var1++;
              continue L2;
            }
          }
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_a = "Player";
    }
}
