/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cc {
    static le[][] field_a;
    static long field_b;

    abstract void a(int param0, java.awt.Component param1);

    final static void b(boolean param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        double var2 = 0.0;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = MonkeyPuzzle2.field_F ? 1 : 0;
        try {
          L0: {
            ig.b();
            r.field_a = new int[260];
            uc.field_b = 11;
            var1_int = 0;
            L1: while (true) {
              L2: {
                L3: {
                  if (256 <= var1_int) {
                    break L3;
                  } else {
                    var2 = 15.0;
                    r.field_a[var1_int] = (int)(Math.pow((double)((float)var1_int / 256.0f), var2) * 255.0);
                    var1_int++;
                    if (var4 != 0) {
                      break L2;
                    } else {
                      if (var4 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                if (param0) {
                  break L2;
                } else {
                  field_a = (le[][]) null;
                  break L2;
                }
              }
              var1_int = 256;
              L4: while (true) {
                if (var1_int >= r.field_a.length) {
                  break L0;
                } else {
                  r.field_a[var1_int] = 255;
                  var1_int++;
                  if (var4 == 0) {
                    continue L4;
                  } else {
                    return;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw la.a((Throwable) ((Object) var1), "cc.F(" + param0 + ')');
        }
    }

    abstract int a(boolean param0);

    final static void a(int param0, boolean param1, boolean param2) {
        if (!param1) {
          ge.d();
          vj.a(1, param1);
          if (param0 == 192) {
            return;
          } else {
            cc.a(-77);
            return;
          }
        } else {
          ge.c(0, 0, ge.field_h, ge.field_g, 0, 192);
          if (MonkeyPuzzle2.field_F) {
            ge.d();
            vj.a(1, param1);
            if (param0 != 192) {
              cc.a(-77);
              return;
            } else {
              return;
            }
          } else {
            vj.a(1, param1);
            if (param0 != 192) {
              cc.a(-77);
              return;
            } else {
              return;
            }
          }
        }
    }

    public static void a(int param0) {
        if (param0 != 256) {
            return;
        }
        field_a = (le[][]) null;
    }

    abstract void a(java.awt.Component param0, int param1);

    static {
        field_a = new le[3][];
    }
}
