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
        int var1 = 114 % ((-67 - param0) / 47);
    }

    final ii a(op param0, int param1) {
        int fieldTemp$1 = 0;
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
        ii stackIn_3_0 = null;
        naa stackIn_26_0 = null;
        RuntimeException stackIn_28_0 = null;
        StringBuilder stackIn_28_1 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        String stackIn_30_2 = null;
        int decompiledRegionSelector0 = 0;
        RuntimeException decompiledCaughtException = null;
        naa stackOut_25_0 = null;
        ii stackOut_2_0 = null;
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
            var16 = this.field_h.a(param1 + 9, param0);
            var4 = new naa(this.field_g, new nq(var16));
            var4.field_t = this.field_n;
            var4.field_q = this.field_k;
            var20 = var4.d(9268);
            var6 = 17;
            var7 = 17;
            var8 = -1 + var6 >> 1719895905;
            var9 = -1 + var7 >> 849890977;
            var4.field_u = 0;
            if (param1 == 3) {
              var10 = 0;
              L1: while (true) {
                if (var6 <= var10) {
                  L2: {
                    if (-1 <= (var4.field_u ^ -1)) {
                      break L2;
                    } else {
                      var4.field_r = kla.a(var4.field_u, param0.field_w, -2147483648);
                      break L2;
                    }
                  }
                  stackOut_25_0 = (naa) (var4);
                  stackIn_26_0 = stackOut_25_0;
                  decompiledRegionSelector0 = 1;
                  break L0;
                } else {
                  var11 = 0;
                  L3: while (true) {
                    if (var11 >= var7) {
                      var10++;
                      continue L1;
                    } else {
                      L4: {
                        if (-2 != (var20[var10][var11] ^ -1)) {
                          break L4;
                        } else {
                          var12 = -var8 + (var10 + this.field_k);
                          var13 = this.field_n + var11 + -var9;
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
                                          fieldTemp$1 = var4.field_u;
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
              stackOut_2_0 = (ii) null;
              stackIn_3_0 = stackOut_2_0;
              decompiledRegionSelector0 = 0;
              break L0;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var3 = decompiledCaughtException;
            stackOut_27_0 = (RuntimeException) (var3);
            stackOut_27_1 = new StringBuilder().append("ci.A(");
            stackIn_29_0 = stackOut_27_0;
            stackIn_29_1 = stackOut_27_1;
            stackIn_28_0 = stackOut_27_0;
            stackIn_28_1 = stackOut_27_1;
            if (param0 == null) {
              stackOut_29_0 = (RuntimeException) ((Object) stackIn_29_0);
              stackOut_29_1 = (StringBuilder) ((Object) stackIn_29_1);
              stackOut_29_2 = "null";
              stackIn_30_0 = stackOut_29_0;
              stackIn_30_1 = stackOut_29_1;
              stackIn_30_2 = stackOut_29_2;
              break L5;
            } else {
              stackOut_28_0 = (RuntimeException) ((Object) stackIn_28_0);
              stackOut_28_1 = (StringBuilder) ((Object) stackIn_28_1);
              stackOut_28_2 = "{...}";
              stackIn_30_0 = stackOut_28_0;
              stackIn_30_1 = stackOut_28_1;
              stackIn_30_2 = stackOut_28_2;
              break L5;
            }
          }
          throw pe.a((Throwable) ((Object) stackIn_30_0), stackIn_30_2 + ',' + param1 + ')');
        }
        if (decompiledRegionSelector0 == 0) {
          return stackIn_3_0;
        } else {
          return (ii) ((Object) stackIn_26_0);
        }
    }

    ci(int param0, aga param1, int param2, int param3) {
        super(param0, param1);
        try {
            this.field_n = param3;
            this.field_k = param2;
        } catch (RuntimeException runtimeException) {
            throw pe.a((Throwable) ((Object) runtimeException), "ci.<init>(" + param0 + ',' + (param1 != null ? "{...}" : "null") + ',' + param2 + ',' + param3 + ')');
        }
    }

    static {
        field_q = new int[16384];
        field_p = "Quick Chat Help";
    }
}
