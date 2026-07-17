/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class ci extends td {
    static String field_p;
    static int[] field_q;

    public static void b(int param0) {
        field_q = null;
        field_p = null;
        int var1 = 0;
    }

    final ii a(op param0, int param1) {
        RuntimeException var3 = null;
        naa var4 = null;
        int var6 = 0;
        int var7 = 0;
        int var8 = 0;
        int var9 = 0;
        int var10 = 0;
        int var11 = 0;
        int var12 = 0;
        int var13 = 0;
        wia var14 = null;
        int var15 = 0;
        aga var16 = null;
        int[][] var20 = null;
        Object stackIn_3_0 = null;
        naa stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        RuntimeException decompiledCaughtException = null;
        naa stackOut_25_0 = null;
        Object stackOut_2_0 = null;
        RuntimeException stackOut_27_0 = null;
        StringBuilder stackOut_27_1 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        String stackOut_28_2 = null;
        var15 = BachelorFridge.field_y;
        try {
          L0: {
            var16 = ((ci) this).field_h.a(param1 + 9, param0);
            var4 = new naa(((ci) this).field_g, new nq(var16));
            var4.field_t = ((ci) this).field_n;
            var4.field_q = ((ci) this).field_k;
            var20 = var4.d(9268);
            var6 = 17;
            var7 = 17;
            var8 = -1 + var6 >> 1;
            var9 = -1 + var7 >> 1;
            var4.field_u = 0;
            if (param1 == 3) {
              var10 = 0;
              L1: while (true) {
                if (var6 <= var10) {
                  L2: {
                    if (var4.field_u <= 0) {
                      break L2;
                    } else {
                      var4.field_r = kla.a(var4.field_u, param0.field_w, -2147483648);
                      break L2;
                    }
                  }
                  stackOut_25_0 = (naa) var4;
                  stackIn_26_0 = stackOut_25_0;
                  break L0;
                } else {
                  var11 = 0;
                  L3: while (true) {
                    if (var11 >= var7) {
                      var10++;
                      continue L1;
                    } else {
                      L4: {
                        if (var20[var10][var11] != 1) {
                          break L4;
                        } else {
                          var12 = -var8 + (var10 + ((ci) this).field_k);
                          var13 = ((ci) this).field_n + var11 + -var9;
                          if (0 > var12) {
                            break L4;
                          } else {
                            if (var12 >= param0.field_z) {
                              break L4;
                            } else {
                              if (var13 < 0) {
                                break L4;
                              } else {
                                if (param0.field_B > var13) {
                                  var14 = param0.field_a[var12][var13];
                                  if (0 != var14.field_n) {
                                    break L4;
                                  } else {
                                    if (var14.field_l == null) {
                                      if (6 <= var4.field_u) {
                                        break L4;
                                      } else {
                                        if (kla.a(10, param0.field_w, -2147483648) <= 3) {
                                          int fieldTemp$1 = var4.field_u;
                                          var4.field_u = var4.field_u + 1;
                                          var4.field_s[fieldTemp$1] = new aj(var12, var13);
                                          break L4;
                                        } else {
                                          break L4;
                                        }
                                      }
                                    } else {
                                      break L4;
                                    }
                                  }
                                } else {
                                  break L4;
                                }
                              }
                            }
                          }
                        }
                      }
                      var11++;
                      continue L3;
                    }
                  }
                }
              }
            } else {
              stackOut_2_0 = null;
              stackIn_3_0 = stackOut_2_0;
              return (ii) (Object) stackIn_3_0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) var3;
            stackOut_27_1 = new StringBuilder().append("ci.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) (Object) stackIn_28_0;
              stackOut_28_1 = (StringBuilder) (Object) stackIn_28_1;
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw pe.a((Throwable) (Object) stackIn_30_0, stackIn_30_2 + 44 + param1 + 41);
        }
        return (ii) (Object) stackIn_26_0;
    }

    ci(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            ((ci) this).field_n = param3;
            ((ci) this).field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) (Object) runtimeException, "ci.<init>(" + param0 + 44 + (param1 != null ? "{...}" : "null") + 44 + param2 + 44 + param3 + 41);
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_q = new int[16384];
        field_p = "Quick Chat Help";
    }
}
