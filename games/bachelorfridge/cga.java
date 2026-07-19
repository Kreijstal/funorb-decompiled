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
        int stackIn_8_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_7_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_20_0 = 0;
        int stackOut_10_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              if (param1 <= 0) {
                break L1;
              } else {
                if (param1 < 128) {
                  stackOut_7_0 = 1;
                  stackIn_8_0 = stackOut_7_0;
                  decompiledRegionSelector0 = 0;
                  break L0;
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
            if (param0 == 255) {
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
                        stackOut_17_0 = 1;
                        stackIn_18_0 = stackOut_17_0;
                        decompiledRegionSelector0 = 2;
                        break L0;
                      } else {
                        var3++;
                        continue L4;
                      }
                    }
                  }
                }
              }
              stackOut_20_0 = 0;
              stackIn_21_0 = stackOut_20_0;
              decompiledRegionSelector0 = 3;
              break L0;
            } else {
              stackOut_10_0 = 1;
              stackIn_11_0 = stackOut_10_0;
              decompiledRegionSelector0 = 1;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) ((Object) var2_ref), "cga.C(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_8_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_11_0 != 0;
          } else {
            if (decompiledRegionSelector0 == 2) {
              return stackIn_18_0 != 0;
            } else {
              return stackIn_21_0 != 0;
            }
          }
        }
    }

    abstract int e(int param0);

    public static void b(boolean param0) {
        if (!param0) {
            field_r = (ee) null;
            field_r = null;
            return;
        }
        field_r = null;
    }

    cga() {
        this.field_n = true;
    }

    static {
    }
}
