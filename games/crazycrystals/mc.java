/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.lang.String;

abstract class mc extends ij {
    static long[] field_p;
    int field_o;
    int field_n;
    static int[] field_m;
    int field_t;
    static int field_s;
    static int field_r;
    static int field_q;
    int field_l;
    int field_u;
    int field_v;

    public static void b(byte param0) {
        RuntimeException var1 = null;
        RuntimeException decompiledCaughtException = null;
        try {
          L0: {
            L1: {
              if (param0 > 104) {
                break L1;
              } else {
                mc.b((byte) 31);
                break L1;
              }
            }
            field_m = null;
            field_p = null;
            break L0;
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "mc.B(" + param0 + ')');
        }
    }

    final static String a(byte param0) {
        RuntimeException var1 = null;
        String stackIn_8_0 = null;
        Object stackIn_11_0 = null;
        Object stackIn_13_0 = null;
        RuntimeException decompiledCaughtException = null;
        String stackOut_7_0 = null;
        Object stackOut_12_0 = null;
        Object stackOut_10_0 = null;
        try {
          L0: {
            L1: {
              if (co.field_F) {
                break L1;
              } else {
                if (~cl.field_o > ~ih.field_a) {
                  break L1;
                } else {
                  if (~cl.field_o <= ~(ih.field_a + u.field_a)) {
                    break L1;
                  } else {
                    stackOut_7_0 = kf.field_f;
                    stackIn_8_0 = stackOut_7_0;
                    return stackIn_8_0;
                  }
                }
              }
            }
            if (param0 == 6) {
              stackOut_12_0 = null;
              stackIn_13_0 = stackOut_12_0;
              break L0;
            } else {
              stackOut_10_0 = null;
              stackIn_11_0 = stackOut_10_0;
              return (String) (Object) stackIn_11_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var1 = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var1, "mc.C(" + param0 + ')');
        }
        return (String) (Object) stackIn_13_0;
    }

    final static dl a(int param0, int param1, int param2) {
        dl var3 = null;
        RuntimeException var3_ref = null;
        int var4 = 0;
        int var5 = 0;
        dl stackIn_7_0 = null;
        dl stackIn_11_0 = null;
        RuntimeException decompiledCaughtException = null;
        dl stackOut_6_0 = null;
        dl stackOut_10_0 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            L1: {
              if (param1 < -10) {
                break L1;
              } else {
                field_m = null;
                break L1;
              }
            }
            var3 = new dl(param0, param0);
            var4 = 0;
            L2: while (true) {
              L3: {
                L4: {
                  if (~var3.field_w.length >= ~var4) {
                    break L4;
                  } else {
                    stackOut_6_0 = (dl) var3;
                    stackIn_11_0 = stackOut_6_0;
                    stackIn_7_0 = stackOut_6_0;
                    if (var5 != 0) {
                      break L3;
                    } else {
                      stackIn_7_0.field_w[var4] = param2;
                      var4++;
                      if (var5 == 0) {
                        continue L2;
                      } else {
                        break L4;
                      }
                    }
                  }
                }
                stackOut_10_0 = (dl) var3;
                stackIn_11_0 = stackOut_10_0;
                break L3;
              }
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3_ref = decompiledCaughtException;
          throw dn.a((Throwable) (Object) var3_ref, "mc.A(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        return stackIn_11_0;
    }

    mc() {
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_p = new long[32];
        field_m = new int[4];
    }
}
