/*
 * Decompiled by CFR-JS 0.4.0.
 */
abstract class nd extends jl {
    static int field_s;
    static String field_u;
    int field_t;

    public static void c(int param0) {
        field_u = null;
        if (param0 != 30661) {
            field_u = (String) null;
        }
    }

    abstract boolean f(byte param0);

    final static boolean a(char param0, byte param1) {
        char[] var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        char[] var6 = null;
        int stackIn_10_0 = 0;
        int stackIn_18_0 = 0;
        int stackIn_21_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_20_0 = 0;
        int stackOut_17_0 = 0;
        int stackOut_9_0 = 0;
        var5 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            L1: {
              if (param1 == -18) {
                break L1;
              } else {
                nd.c(-35);
                break L1;
              }
            }
            L2: {
              L3: {
                if (param0 <= 0) {
                  break L3;
                } else {
                  if (param0 < 128) {
                    break L2;
                  } else {
                    break L3;
                  }
                }
              }
              L4: {
                if (param0 < 160) {
                  break L4;
                } else {
                  if (param0 <= 255) {
                    break L2;
                  } else {
                    break L4;
                  }
                }
              }
              if (param0 != 0) {
                var6 = cd.field_m;
                var2 = var6;
                var3 = 0;
                L5: while (true) {
                  if (var3 >= var6.length) {
                    stackOut_20_0 = 0;
                    stackIn_21_0 = stackOut_20_0;
                    decompiledRegionSelector0 = 2;
                    break L0;
                  } else {
                    var4 = var6[var3];
                    if (var4 == param0) {
                      stackOut_17_0 = 1;
                      stackIn_18_0 = stackOut_17_0;
                      decompiledRegionSelector0 = 1;
                      break L0;
                    } else {
                      var3++;
                      continue L5;
                    }
                  }
                }
              } else {
                return false;
              }
            }
            stackOut_9_0 = 1;
            stackIn_10_0 = stackOut_9_0;
            decompiledRegionSelector0 = 0;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var2_ref), "nd.E(" + param0 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_10_0 != 0;
        } else {
          if (decompiledRegionSelector0 == 1) {
            return stackIn_18_0 != 0;
          } else {
            return stackIn_21_0 != 0;
          }
        }
    }

    final static void e(byte param0) {
        od dupTemp$7 = null;
        int var1_int = 0;
        RuntimeException var1 = null;
        int var2 = 0;
        od var3 = null;
        int var4 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Confined.field_J ? 1 : 0;
        try {
          L0: {
            if (param0 == 18) {
              var1_int = 1;
              L1: while (true) {
                if (-4 >= (var1_int ^ -1)) {
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var2 = 0;
                  L2: while (true) {
                    if (4 <= var2) {
                      var1_int++;
                      continue L1;
                    } else {
                      dupTemp$7 = new od(bf.field_R[-1 + var1_int][var2], false, true, true, true);
                      bf.field_R[var1_int][var2] = dupTemp$7;
                      var3 = dupTemp$7;
                      var3.a(80, 80, 80);
                      var2++;
                      continue L2;
                    }
                  }
                }
              }
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw sd.a((Throwable) ((Object) var1), "nd.A(" + param0 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    abstract Object d(int param0);

    nd(int param0) {
        this.field_t = param0;
    }

    static {
        field_u = "<col=FFFFFF>Wing pods:</col> pilotless ships that surround your ship, back up some of your weapons with extra power, collect power-ups for you, and occasionally take enemy attacks for you. You can have up to five.";
    }
}
