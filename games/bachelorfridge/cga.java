/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class cga extends eo {
    static int field_p;
    static ee field_r;
    boolean field_q;
    boolean field_o;
    volatile boolean field_n;

    abstract byte[] d(byte param0);

    final static boolean a(int param0, char param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_9_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_8_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_22_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackOut_8_0 = 1;
                  stackIn_9_0 = stackOut_8_0;
                  return stackIn_9_0 != 0;
                } else {
                  break L1;
                }
              }
            }
            L2: {
              if (param1 < 160) {
                break L2;
              } else {
                if (param1 > 255) {
                  break L2;
                } else {
                  return true;
                }
              }
            }
            L3: {
              if (param1 == 0) {
                break L3;
              } else {
                var6 = on.field_s;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var6.length <= var3) {
                    break L3;
                  } else {
                    var4 = var6[var3];
                    if (param1 == var4) {
                      stackOut_19_0 = 1;
                      stackIn_20_0 = stackOut_19_0;
                      return stackIn_20_0 != 0;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              }
            }
            stackOut_22_0 = 0;
            stackIn_23_0 = stackOut_22_0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "cga.C(" + 255 + 44 + param1 + 41);
        }
        return stackIn_23_0 != 0;
    }

    abstract int e(int param0);

    public static void b() {
        field_r = null;
    }

    cga() {
        ((cga) this).field_n = true;
    }

    static {
    }
}
