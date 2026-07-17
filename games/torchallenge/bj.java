/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.io.*;

final class bj extends IOException {
    static int[] field_b;
    static volatile int field_c;
    static int[] field_d;
    static int[] field_a;

    final static void a(int param0) {
        fl.a(-128, true, mj.field_d, uf.field_j);
        int var1 = 25 / ((param0 - -28) / 48);
        ae.field_C = true;
    }

    final static void a(byte param0) {
        int var1_int = 0;
        int var2 = TorChallenge.field_F ? 1 : 0;
        try {
            if (!(null != wa.field_pb)) {
                wa.field_pb = new boolean[5];
            }
            for (var1_int = 0; var1_int < 5; var1_int++) {
                mh.field_d[var1_int] = -1;
                wa.field_pb[var1_int] = false;
            }
            gh.field_m = false;
            bi.field_f = false;
            vi.field_a = 0;
            jj.field_d = false;
            qk.field_lb = 0;
            wj.field_a = 0;
            ih.a(112);
        } catch (RuntimeException runtimeException) {
            throw oj.a((Throwable) (Object) runtimeException, "bj.B(" + 71 + 41);
        }
    }

    final static void a(boolean param0) {
        fk.a(false, 17);
    }

    bj(String param0) {
        super(param0);
    }

    public static void b(int param0) {
        field_b = null;
        int var1 = 0;
        field_a = null;
        field_d = null;
    }

    final static int a(int param0, boolean param1, int param2, int param3, int param4) {
        RuntimeException var5 = null;
        int var5_int = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int stackIn_3_0 = 0;
        int stackIn_17_0 = 0;
        int stackIn_20_0 = 0;
        int stackIn_23_0 = 0;
        int stackIn_30_0 = 0;
        RuntimeException decompiledCaughtException = null;
        int stackOut_29_0 = 0;
        int stackOut_22_0 = 0;
        int stackOut_19_0 = 0;
        int stackOut_16_0 = 0;
        int stackOut_2_0 = 0;
        var12 = TorChallenge.field_F ? 1 : 0;
        try {
          L0: {
            if (!param1) {
              L1: {
                var5_int = -param0 + param4;
                var6 = -param2 + param3;
                var7 = 0;
                var8 = 1;
                if (var5_int >= 0) {
                  break L1;
                } else {
                  var8 = -1;
                  var5_int = -var5_int;
                  break L1;
                }
              }
              L2: {
                var9 = 0;
                if (var5_int > 32) {
                  var9 = -var8;
                  break L2;
                } else {
                  var9 = var8;
                  break L2;
                }
              }
              L3: {
                if (var6 < 0) {
                  var6 = -var6;
                  break L3;
                } else {
                  break L3;
                }
              }
              L4: {
                if (var5_int >= 32) {
                  var5_int = -var5_int + 64;
                  break L4;
                } else {
                  break L4;
                }
              }
              if (var5_int <= 64) {
                if (var5_int <= 16) {
                  if (var6 * 64 <= 240) {
                    var10 = var5_int * var5_int;
                    var11 = 0;
                    L5: while (true) {
                      if (var10 <= 0) {
                        L6: {
                          var7 = -var11 + 9;
                          var7 = var7 << 7;
                          if (var9 <= 0) {
                            break L6;
                          } else {
                            var7 = -var7 + 256;
                            break L6;
                          }
                        }
                        stackOut_29_0 = var7;
                        stackIn_30_0 = stackOut_29_0;
                        break L0;
                      } else {
                        var11++;
                        var10 = var10 >> 1;
                        continue L5;
                      }
                    }
                  } else {
                    stackOut_22_0 = -1;
                    stackIn_23_0 = stackOut_22_0;
                    return stackIn_23_0;
                  }
                } else {
                  stackOut_19_0 = -1;
                  stackIn_20_0 = stackOut_19_0;
                  return stackIn_20_0;
                }
              } else {
                stackOut_16_0 = -1;
                stackIn_17_0 = stackOut_16_0;
                return stackIn_17_0;
              }
            } else {
              stackOut_2_0 = -82;
              stackIn_3_0 = stackOut_2_0;
              return stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var5 = decompiledCaughtException;
          throw oj.a((Throwable) (Object) var5, "bj.D(" + param0 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
        return stackIn_30_0;
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = -1;
        field_d = new int[]{28, 26, 24, 22, 20};
        field_a = new int[]{0, 5, 10};
    }
}
