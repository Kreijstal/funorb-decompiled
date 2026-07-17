/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qg implements qk {
    private int field_d;
    private mi field_b;
    static String field_i;
    private int field_k;
    static String field_g;
    private int field_c;
    static wk[] field_f;
    private int field_e;
    static String field_o;
    static String field_l;
    static boolean[][] field_j;
    private int field_m;
    static int field_a;
    static je field_n;
    private int field_h;
    static String field_p;

    final static void a(byte param0) {
        int var1 = 45 / ((param0 - 70) / 41);
        tc.a((byte) -113);
        hc.a(4, 0);
    }

    final static int a(byte param0, int param1) {
        int var2 = 0;
        int var3 = 0;
        var3 = SteelSentinels.field_G;
        var2 = param1;
        if (96 != var2) {
          if (var2 != 97) {
            if (var2 != 98) {
              if (var2 != 99) {
                if (100 != var2) {
                  if (102 != var2) {
                    if (103 != var2) {
                      if (var2 != 104) {
                        if (var2 != 105) {
                          if (var2 != 106) {
                            if (param0 != -60) {
                              return 104;
                            } else {
                              return -1;
                            }
                          } else {
                            return 93;
                          }
                        } else {
                          return 89;
                        }
                      } else {
                        return 85;
                      }
                    } else {
                      return 80;
                    }
                  } else {
                    return 76;
                  }
                } else {
                  return 70;
                }
              } else {
                return 66;
              }
            } else {
              return 58;
            }
          } else {
            return 56;
          }
        } else {
          return 2;
        }
    }

    public static void b(byte param0) {
        field_f = null;
        field_n = null;
        field_o = null;
        field_g = null;
        field_i = null;
        field_j = null;
        field_l = null;
        field_p = null;
    }

    public final void a(int param0, lh param1, byte param2, boolean param3, int param4) {
        RuntimeException var6 = null;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        um var12 = null;
        lh stackIn_4_0 = null;
        RuntimeException stackIn_15_0 = null;
        StringBuilder stackIn_15_1 = null;
        RuntimeException stackIn_16_0 = null;
        StringBuilder stackIn_16_1 = null;
        RuntimeException stackIn_17_0 = null;
        StringBuilder stackIn_17_1 = null;
        String stackIn_17_2 = null;
        RuntimeException decompiledCaughtException = null;
        lh stackOut_3_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_14_0 = null;
        StringBuilder stackOut_14_1 = null;
        RuntimeException stackOut_16_0 = null;
        StringBuilder stackOut_16_1 = null;
        String stackOut_16_2 = null;
        RuntimeException stackOut_15_0 = null;
        StringBuilder stackOut_15_1 = null;
        String stackOut_15_2 = null;
        var11 = SteelSentinels.field_G;
        try {
          L0: {
            L1: {
              if (param1 instanceof um) {
                stackOut_3_0 = (lh) param1;
                stackIn_4_0 = stackOut_3_0;
                break L1;
              } else {
                stackOut_2_0 = null;
                stackIn_4_0 = (lh) (Object) stackOut_2_0;
                break L1;
              }
            }
            L2: {
              var12 = (um) (Object) stackIn_4_0;
              pb.a(param0 + param1.field_o, param1.field_z + param4, param1.field_x, param1.field_E, ((qg) this).field_m);
              if (var12 != null) {
                break L2;
              } else {
                break L2;
              }
            }
            var7 = -(2 * var12.field_Y) + param1.field_x;
            var8 = var12.field_Y + (param1.field_o + param0);
            var9 = var12.field_ab + (param1.field_z + param4);
            pb.d(var8, var9, var7 + var8, var9, ((qg) this).field_k);
            var10 = -1 + var12.h(24129);
            L3: while (true) {
              if (var10 < 0) {
                L4: {
                  if (null != ((qg) this).field_b) {
                    ((qg) this).field_b.a(var12.field_y, var8 - -(var7 / 2), var12.field_ab + ((qg) this).field_b.field_W + var9, ((qg) this).field_e, ((qg) this).field_d);
                    break L4;
                  } else {
                    break L4;
                  }
                }
                if (param2 == -30) {
                  break L0;
                } else {
                  field_o = null;
                  return;
                }
              } else {
                pb.e(var8 + var7 * var12.a(var10, -128) / var12.g((byte) 64), var9, ((qg) this).field_c, ((qg) this).field_h);
                var10--;
                continue L3;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_14_0 = (RuntimeException) var6;
            stackOut_14_1 = new StringBuilder().append("qg.A(").append(param0).append(44);
            stackIn_16_0 = stackOut_14_0;
            stackIn_16_1 = stackOut_14_1;
            stackIn_15_0 = stackOut_14_0;
            stackIn_15_1 = stackOut_14_1;
            if (param1 == null) {
              stackOut_16_0 = (RuntimeException) (Object) stackIn_16_0;
              stackOut_16_1 = (StringBuilder) (Object) stackIn_16_1;
              stackOut_16_2 = "null";
              stackIn_17_0 = stackOut_16_0;
              stackIn_17_1 = stackOut_16_1;
              stackIn_17_2 = stackOut_16_2;
              break L5;
            } else {
              stackOut_15_0 = (RuntimeException) (Object) stackIn_15_0;
              stackOut_15_1 = (StringBuilder) (Object) stackIn_15_1;
              stackOut_15_2 = "{...}";
              stackIn_17_0 = stackOut_15_0;
              stackIn_17_1 = stackOut_15_1;
              stackIn_17_2 = stackOut_15_2;
              break L5;
            }
          }
          throw ci.a((Throwable) (Object) stackIn_17_0, stackIn_17_2 + 44 + param2 + 44 + param3 + 44 + param4 + 41);
        }
    }

    qg(mi param0, int param1, int param2, int param3, int param4, int param5, int param6) {
        try {
            ((qg) this).field_e = param1;
            ((qg) this).field_h = param6;
            ((qg) this).field_k = param3;
            ((qg) this).field_d = param2;
            ((qg) this).field_m = param4;
            ((qg) this).field_b = param0;
            ((qg) this).field_c = param5;
        } catch (RuntimeException runtimeException) {
            throw ci.a((Throwable) (Object) runtimeException, "qg.<init>(" + (param0 != null ? "{...}" : "null") + 44 + param1 + 44 + param2 + 44 + param3 + 44 + param4 + 44 + param5 + 44 + param6 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_g = "Your rating is <%0>";
        field_l = "COMPONENTS:";
        field_j = new boolean[][]{null, new boolean[3], new boolean[6]};
        field_i = "Add friend";
        field_o = "We have scanned the <%0> you managed to destroy and succeeded in reverse engineering it. You may now select this chassis in the 'Configuration' screen.";
        field_p = "Training";
    }
}
