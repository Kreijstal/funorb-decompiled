/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class rc {
    int field_d;
    byte[] field_c;
    int field_e;
    int field_b;
    static sc field_a;
    int field_l;
    int field_h;
    int field_k;
    byte[] field_g;
    static int field_i;
    int field_j;
    static long field_f;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int stackIn_6_0 = 0;
        int stackIn_11_0 = 0;
        int stackIn_15_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_14_0 = 0;
        int stackOut_5_0 = 0;
        int stackOut_10_0 = 0;
        var8 = Lexicominos.field_L ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 0;
              if (param1 == 29532) {
                break L1;
              } else {
                field_a = (sc) null;
                break L1;
              }
            }
            var4 = rf.field_c;
            L2: while (true) {
              L3: {
                if (ee.field_g.length <= var3_int) {
                  stackOut_14_0 = -1;
                  stackIn_15_0 = stackOut_14_0;
                  break L3;
                } else {
                  var5 = ni.field_a[var3_int];
                  stackOut_5_0 = var5;
                  stackIn_15_0 = stackOut_5_0;
                  stackIn_6_0 = stackOut_5_0;
                  if (var8 != 0) {
                    break L3;
                  } else {
                    L4: {
                      L5: {
                        if (stackIn_6_0 >= 0) {
                          break L5;
                        } else {
                          var4 = var4 + hc.field_fb;
                          if (var8 == 0) {
                            break L4;
                          } else {
                            break L5;
                          }
                        }
                      }
                      var6 = ii.a(ee.field_g[var3_int], true, 0);
                      var4 = var4 + we.field_l;
                      var7 = -(var6 >> 870040769) + uh.field_D;
                      if (sj.a(param2, (oh.field_b << -603556095) + fb.field_g, var4, var6 + (jh.field_e << -960709887), param0, true, -jh.field_e + var7)) {
                        stackOut_10_0 = var5;
                        stackIn_11_0 = stackOut_10_0;
                        decompiledRegionSelector0 = 1;
                        break L0;
                      } else {
                        var4 = var4 + (fb.field_g + (oh.field_b << 1762055041) + we.field_l);
                        break L4;
                      }
                    }
                    var3_int++;
                    continue L2;
                  }
                }
              }
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ld.a((Throwable) ((Object) var3), "rc.B(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_15_0;
        } else {
          return stackIn_11_0;
        }
    }

    public static void a(int param0) {
        field_a = null;
        if (param0 != 870040769) {
            field_a = (sc) null;
        }
    }

    static {
        field_a = new sc();
    }
}
