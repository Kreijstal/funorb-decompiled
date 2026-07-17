/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nd extends jl {
    static int field_s;
    static String field_u;
    int field_t;

    public static void c() {
        field_u = null;
    }

    abstract boolean f(byte param0);

    final static boolean a(char param0) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_8_0 = 0;
        int stackIn_16_0 = 0;
        int stackIn_19_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_18_0 = 0;
        int stackOut_15_0 = 0;
        int stackOut_7_0 = 0;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              L2: {
                if (param0 <= 0) {
                  break L2;
                } else {
                  if (param0 < 128) {
                    break L1;
                  } else {
                    break L2;
                  }
                }
              }
              L3: {
                if (param0 < 160) {
                  break L3;
                } else {
                  if (param0 <= 255) {
                    break L1;
                  } else {
                    break L3;
                  }
                }
              }
              if (param0 != 0) {
                var6 = cd.field_m;
                var2 = var6;
                var3 = 0;
                L4: while (true) {
                  if (var3 >= var6.length) {
                    stackOut_18_0 = 0;
                    stackIn_19_0 = stackOut_18_0;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (var4 == param0) {
                      stackOut_15_0 = 1;
                      stackIn_16_0 = stackOut_15_0;
                      return stackIn_16_0 != 0;
                    } else {
                      var3++;
                      continue L4;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackOut_7_0 = 1;
            stackIn_8_0 = stackOut_7_0;
            return stackIn_8_0 != 0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var2_ref, "nd.E(" + param0 + 44 + -18 + 41);
        }
        return stackIn_19_0 != 0;
    }

    final static void e() {
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        od var3 = null;
        int var4 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            var1_int = 1;
            L1: while (true) {
              if (var1_int >= 3) {
                break L0;
              } else {
                var2 = 0;
                L2: while (true) {
                  if (4 <= var2) {
                    var1_int++;
                    continue L1;
                  } else {
                    od dupTemp$7 = new od(bf.field_R[-1 + var1_int][var2], false, true, true, true);
                    bf.field_R[var1_int][var2] = dupTemp$7;
                    var3 = dupTemp$7;
                    var3.a(80, 80, 80);
                    var2++;
                    continue L2;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) (Object) var1, "nd.A(" + 18 + 41);
        }
    }

    abstract Object d(int param0);

    nd(int param0) {
        ((nd) this).field_t = param0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_u = "<col=FFFFFF>Wing pods:</col> pilotless ships that surround your ship, back up some of your weapons with extra power, collect power-ups for you, and occasionally take enemy attacks for you. You can have up to five.";
    }
}
