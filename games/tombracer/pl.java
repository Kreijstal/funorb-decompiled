/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class pl {
    static String field_c;
    static float field_a;
    int field_d;
    static String field_b;

    final static int a(byte param0) {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        int stackIn_6_0 = 0;
        boolean stackIn_10_0 = false;
        int stackIn_12_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_5_0 = 0;
        boolean stackOut_9_0 = false;
        int stackOut_11_0 = 0;
        int stackOut_14_0 = 0;
        var2 = TombRacer.field_G ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param0 == 64) {
                break L1;
              } else {
                pl.a(-48);
                break L1;
              }
            }
            if (cm.field_a == null) {
              stackOut_5_0 = -1;
              stackIn_6_0 = stackOut_5_0;
              decompiledRegionSelector0 = 0;
              break L0;
            } else {
              var1_int = 0;
              L2: while (true) {
                L3: {
                  L4: {
                    if (cm.field_a.length <= var1_int) {
                      break L4;
                    } else {
                      stackOut_9_0 = cm.field_a[var1_int].a((byte) -47);
                      stackIn_15_0 = stackOut_9_0 ? 1 : 0;
                      stackIn_10_0 = stackOut_9_0;
                      if (var2 != 0) {
                        break L3;
                      } else {
                        if (!stackIn_10_0) {
                          var1_int++;
                          if (var2 == 0) {
                            continue L2;
                          } else {
                            break L4;
                          }
                        } else {
                          stackOut_11_0 = var1_int;
                          stackIn_12_0 = stackOut_11_0;
                          decompiledRegionSelector0 = 2;
                          break L0;
                        }
                      }
                    }
                  }
                  stackOut_14_0 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                }
                decompiledRegionSelector0 = 1;
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw tba.a((Throwable) ((Object) var1), "pl.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_6_0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_15_0;
          } else {
            return stackIn_12_0;
          }
        }
    }

    public final String toString() {
        throw new IllegalStateException();
    }

    pl(int param0) {
        this.field_d = param0;
    }

    public static void a(int param0) {
        field_c = null;
        field_b = null;
        if (param0 != 0) {
            field_a = 0.024353690445423126f;
        }
    }

    static {
        field_c = "Suggest muting this player";
        field_b = "Instructions";
    }
}
