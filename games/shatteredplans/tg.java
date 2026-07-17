/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class tg {
    static Random field_b;
    static int[] field_d;
    static int field_a;
    static qr field_c;

    final static boolean a(int param0, int param1, byte param2, int param3) {
        Object var5 = null;
        if (param2 < -91) {
          if (param1 < 0) {
            return false;
          } else {
            if (param1 <= 11) {
              if (param0 >= 1) {
                if (oq.a((byte) -123, param3, param1) >= param0) {
                  return true;
                } else {
                  return false;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          }
        } else {
          var5 = null;
          tg.a(-57, (bi) null, (byte) 36, -126);
          if (param1 >= 0) {
            if (param1 <= 11) {
              if (param0 >= 1) {
                if (oq.a((byte) -123, param3, param1) < param0) {
                  return false;
                } else {
                  return true;
                }
              } else {
                return false;
              }
            } else {
              return false;
            }
          } else {
            return false;
          }
        }
    }

    public static void a() {
        field_c = null;
        field_b = null;
        field_d = null;
        int var1 = 2;
    }

    final static void a(int param0, bi param1, byte param2, int param3) {
        RuntimeException var4 = null;
        int var4_int = 0;
        int var5 = 0;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        int var14 = 0;
        int var15 = 0;
        int var16 = 0;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var16 = ShatteredPlansClient.field_F ? 1 : 0;
        try {
          L0: {
            L1: {
              param3 = param3 + param1.field_t;
              param0 = param0 + param1.field_x;
              var4_int = 0;
              var5 = 0;
              var6 = param1.field_z;
              if (gf.field_i > param3) {
                var6 = var6 + (param3 + -gf.field_i);
                var4_int = -param3 + gf.field_i;
                param3 = gf.field_i;
                break L1;
              } else {
                break L1;
              }
            }
            L2: {
              var7 = param1.field_w;
              if (param0 < gf.field_a) {
                var5 = -param0 + gf.field_a;
                var7 = var7 + (-gf.field_a + param0);
                param0 = gf.field_a;
                break L2;
              } else {
                break L2;
              }
            }
            L3: {
              if (var6 + param3 <= gf.field_l) {
                break L3;
              } else {
                var6 = gf.field_l - param3;
                break L3;
              }
            }
            L4: {
              var8 = -74 % ((param2 - -81) / 43);
              if (var7 + param0 <= gf.field_f) {
                break L4;
              } else {
                var7 = -param0 + gf.field_f;
                break L4;
              }
            }
            var9 = var4_int + var5 * param1.field_z;
            var10 = -var6 + param1.field_z;
            var11 = gf.field_b * param0 - -param3;
            var12 = -var6 + gf.field_b;
            param0 = -var7;
            L5: while (true) {
              if (0 <= param0) {
                break L0;
              } else {
                param3 = -var6;
                L6: while (true) {
                  if (0 <= param3) {
                    var9 = var9 + var10;
                    var11 = var11 + var12;
                    param0++;
                    continue L5;
                  } else {
                    L7: {
                      int incrementValue$2 = var9;
                      var9++;
                      var13 = 255 & param1.field_B[incrementValue$2];
                      if (var13 != 0) {
                        L8: {
                          var14 = gf.field_h[var11];
                          if (255 > var13) {
                            var13 = var13 >> 2;
                            var15 = var14 & 65280;
                            var14 = var14 & 16711935;
                            var14 = var14 * (256 + -var13);
                            var14 = var14 & -16711936;
                            var15 = var15 * (256 - var13);
                            var15 = var15 & 16711680;
                            var14 = (var14 | var15) >>> 8;
                            var14 = var14 + var13 * 65793;
                            break L8;
                          } else {
                            var14 = 8355711 & var14 >>> 1 | 8421504;
                            break L8;
                          }
                        }
                        int incrementValue$3 = var11;
                        var11++;
                        gf.field_h[incrementValue$3] = var14;
                        param3++;
                        break L7;
                      } else {
                        var11++;
                        param3++;
                        break L7;
                      }
                    }
                    param3++;
                    continue L6;
                  }
                }
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L9: {
            var4 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var4;
            stackOut_27_1 = new StringBuilder().append("tg.A(").append(param0).append(44);
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param1 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L9;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L9;
            }
          }
          throw r.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_b = new Random();
        field_d = new int[8192];
    }
}
