/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class ta {
    static String field_a;

    final static void a(int param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = ZombieDawn.field_J;
        try {
          L0: {
            L1: {
              en.c();
              jj.field_H = new int[260];
              f.field_a = 11;
              if (param0 == 255) {
                break L1;
              } else {
                field_a = (String) null;
                break L1;
              }
            }
            var1_int = 0;
            L2: while (true) {
              if (-257 >= (var1_int ^ -1)) {
                var5 = 256;
                var1_int = var5;
                L3: while (true) {
                  if (jj.field_H.length <= var5) {
                    break L0;
                  } else {
                    jj.field_H[var5] = 255;
                    var5++;
                    continue L3;
                  }
                }
              } else {
                var2 = 15.0;
                jj.field_H[var1_int] = (int)(255.0 * Math.pow((double)((float)var1_int / 256.0f), var2));
                var1_int++;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sh.a((Throwable) ((Object) var1), "ta.A(" + param0 + ')');
        }
    }

    public static void a(boolean param0) {
        if (param0) {
            return;
        }
        field_a = null;
    }

    static {
        field_a = "Player";
    }
}
