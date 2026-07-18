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
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_26_0 = 0;
        int stackIn_29_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_19_0 = 0;
        int stackOut_25_0 = 0;
        int stackOut_28_0 = 0;
        int stackOut_14_0 = 0;
        int stackOut_11_0 = 0;
        var5 = BachelorFridge.field_y;
        try {
          L0: {
            L1: {
              L2: {
                if (param1 <= 0) {
                  break L2;
                } else {
                  if (param1 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param1 < 160) {
                  break L3;
                } else {
                  if (param1 > 255) {
                    break L3;
                  } else {
                    break L1;
                  }
                }
              }
              if (param0 == 255) {
                L4: {
                  L5: {
                    if (param1 == 0) {
                      break L5;
                    } else {
                      var2 = on.field_s;
                      var3 = 0;
                      L6: while (true) {
                        if (var2.length <= var3) {
                          break L5;
                        } else {
                          var4 = var2[var3];
                          stackOut_19_0 = ~param1;
                          stackIn_29_0 = stackOut_19_0;
                          stackIn_20_0 = stackOut_19_0;
                          if (var5 != 0) {
                            break L4;
                          } else {
                            if (stackIn_20_0 == ~var4) {
                              stackOut_25_0 = 1;
                              stackIn_26_0 = stackOut_25_0;
                              return stackIn_26_0 != 0;
                            } else {
                              var3++;
                              if (var5 == 0) {
                                continue L6;
                              } else {
                                break L5;
                              }
                            }
                          }
                        }
                      }
                    }
                  }
                  stackOut_28_0 = 0;
                  stackIn_29_0 = stackOut_28_0;
                  break L4;
                }
                break L0;
              } else {
                stackOut_14_0 = 1;
                stackIn_15_0 = stackOut_14_0;
                return stackIn_15_0 != 0;
              }
            }
            stackOut_11_0 = 1;
            stackIn_12_0 = stackOut_11_0;
            return stackIn_12_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var2_ref, "cga.C(" + param0 + ',' + param1 + ')');
        }
        return stackIn_29_0 != 0;
    }

    abstract int e(int param0);

    public static void b(boolean param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0) {
                break L1;
              } else {
                field_r = null;
                break L1;
              }
            }
            field_r = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw pe.a((Throwable) (Object) var1, "cga.A(" + param0 + ')');
        }
    }

    cga() {
        ((cga) this).field_n = true;
    }

    static {
    }
}
