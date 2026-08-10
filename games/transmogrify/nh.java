/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class nh {
    int field_d;
    byte[] field_c;
    int field_a;
    int field_k;
    static String field_l;
    static int[] field_j;
    int field_e;
    int field_i;
    int field_f;
    static String field_h;
    int field_b;
    static String field_m;
    byte[] field_g;

    final static int a(int param0, int param1, int param2) {
        int var3_int = 0;
        RuntimeException var3 = null;
        int var4 = 0;
        int stackIn_9_0 = 0;
        int stackIn_11_0 = 0;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        var4 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            L1: {
              var3_int = 1;
              if (param2 == 26186) {
                break L1;
              } else {
                field_j = (int[]) null;
                break L1;
              }
            }
            L2: while (true) {
              if (param1 <= 1) {
                if ((param1 ^ -1) != -2) {
                  stackIn_11_0 = var3_int;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  stackIn_9_0 = param0 * var3_int;
                  decompiledRegionSelector0 = 0;
                  break L0;
                }
              } else {
                L3: {
                  if ((1 & param1) == 0) {
                    break L3;
                  } else {
                    var3_int = var3_int * param0;
                    break L3;
                  }
                }
                param0 = param0 * param0;
                param1 = param1 >> 1;
                continue L2;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var3 = decompiledCaughtException;
          throw ch.a((Throwable) ((Object) var3), "nh.D(" + param0 + ',' + param1 + ',' + param2 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_9_0;
        } else {
          return stackIn_11_0;
        }
    }

    final static void a(ti param0, byte param1) {
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        String stackIn_16_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        int var2_int = 0;
        RuntimeException var2 = null;
        int var3 = 0;
        int var4 = 0;
        int[] var5 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        var8 = Transmogrify.field_A ? 1 : 0;
        try {
          L0: {
            if (param1 >= 31) {
              L1: {
                if (-1 != ((param0.field_m | param0.field_n) & 3 ^ -1)) {
                  var2_int = 4 - (param0.field_n & 3);
                  var3 = -(3 & param0.field_m) + 4;
                  var4 = param0.field_n + var2_int;
                  var5 = new int[(param0.field_n + var2_int) * (param0.field_m + var3)];
                  var6 = 0;
                  L2: while (true) {
                    if (var6 >= param0.field_m) {
                      param0.field_u = param0.field_u - var2_int;
                      param0.field_n = param0.field_n + var2_int;
                      param0.field_l = param0.field_l - var3;
                      param0.field_w = var5;
                      param0.field_m = param0.field_m + var3;
                      break L1;
                    } else {
                      var7 = 0;
                      L3: while (true) {
                        if (var7 >= param0.field_n) {
                          var6++;
                          continue L2;
                        } else {
                          var5[(var6 + var3) * var4 - -var2_int - -var7] = param0.field_w[var7 + var6 * param0.field_n];
                          var7++;
                          continue L3;
                        }
                      }
                    }
                  }
                } else {
                  break L1;
                }
              }
              decompiledRegionSelector0 = 1;
              break L0;
            } else {
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L4: {
            var2 = decompiledCaughtException;
            stackIn_15_0 = (RuntimeException) (var2);

            stackIn_15_1 = new StringBuilder().append("nh.E(");

            if (param0 == null) {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "null";
              break L4;
            } else {
              stackIn_16_0 = (RuntimeException) ((Object) stackIn_15_0);
              stackIn_16_1 = (StringBuilder) ((Object) stackIn_15_1);
              stackIn_16_2 = "{...}";
              break L4;
            }
          }
          throw ch.a((Throwable) ((Object) stackIn_16_0), stackIn_16_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return;
        } else {
          return;
        }
    }

    final static gd a(int param0, int param1, int param2, int param3, int param4, int param5, int param6, int param7) {
        gd var8 = new gd(param4, param2, param3, param1, param0, param5);
        int var9 = -40 % ((param7 - 6) / 59);
        rh.field_r.a(var8, -107);
        ne.a((byte) 7, var8, param6);
        return var8;
    }

    public static void a(int param0) {
        field_l = null;
        field_j = null;
        field_h = null;
        field_m = null;
        int var1 = 43 % ((47 - param0) / 61);
    }

    final static rj b(int param0) {
        try {
            Throwable var1 = null;
            ti var2 = null;
            rj stackIn_3_0 = null;
            Throwable decompiledCaughtException = null;
            try {
              L0: {
                L1: {
                  if (param0 == 1) {
                    break L1;
                  } else {
                    var2 = (ti) null;
                    nh.a((ti) null, (byte) 65);
                    break L1;
                  }
                }
                stackIn_3_0 = (rj) (Class.forName("sk").newInstance());
                break L0;
              }
            } catch (java.lang.Throwable decompiledCaughtParameter0) {
              decompiledCaughtException = decompiledCaughtParameter0;
              var1 = decompiledCaughtException;
              return null;
            }
            return stackIn_3_0;
        } catch (RuntimeException | Error decompiledUncheckedException) {
            throw decompiledUncheckedException;
        } catch (Throwable decompiledCheckedException) {
            throw new RuntimeException(decompiledCheckedException);
        }
    }

    static {
        field_j = new int[8192];
        field_l = "Discard";
        field_h = "Cancel";
        field_m = "Unfortunately your configuration doesn't support fullscreen mode. You could try restarting your browser and using the signed applet.";
    }
}
