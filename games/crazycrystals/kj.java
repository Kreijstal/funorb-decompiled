/*
 * Decompiled by CFR-JS 0.4.0.
 */
import java.util.*;

final class kj {
    static dl[] field_a;
    static int field_b;
    static String field_c;

    public static void a(int param0) {
        if (param0 >= -90) {
            kj.a(29);
        }
        field_a = null;
        field_c = null;
    }

    final static void a(byte param0) {
        bp.field_b = null;
        m.field_l = null;
        pd.field_g = null;
        r.field_i = null;
        ib.field_l = null;
        fo.field_m = null;
        if (param0 <= 16) {
            return;
        }
        ma.field_n = null;
        vm.field_j = null;
    }

    final static void a(uf param0, byte param1) {
        RuntimeException var2 = null;
        int var2_int = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        RuntimeException stackIn_23_0 = null;
        StringBuilder stackIn_23_1 = null;
        RuntimeException stackIn_24_0 = null;
        StringBuilder stackIn_24_1 = null;
        RuntimeException stackIn_25_0 = null;
        StringBuilder stackIn_25_1 = null;
        String stackIn_25_2 = null;
        RuntimeException decompiledCaughtException = null;
        RuntimeException stackOut_22_0 = null;
        StringBuilder stackOut_22_1 = null;
        RuntimeException stackOut_24_0 = null;
        StringBuilder stackOut_24_1 = null;
        String stackOut_24_2 = null;
        RuntimeException stackOut_23_0 = null;
        StringBuilder stackOut_23_1 = null;
        String stackOut_23_2 = null;
        var5 = CrazyCrystals.field_B;
        try {
          L0: {
            var2_int = 0;
            L1: while (true) {
              if (var2_int >= 3) {
                var2_int = 0;
                L2: while (true) {
                  if (jl.field_d <= var2_int) {
                    int dupTemp$4 = param0.a(true);
                    cl.field_j[dupTemp$4] = cl.field_j[dupTemp$4] + 1;
                    var2_int = 0;
                    var3 = 0;
                    L3: while (true) {
                      if (jl.field_d <= var3) {
                        jl.field_d = var2_int;
                        int fieldTemp$5 = jl.field_d;
                        jl.field_d = jl.field_d + 1;
                        ol.field_D[fieldTemp$5] = param0;
                        break L0;
                      } else {
                        L4: {
                          L5: {
                            if (param0.field_f == ol.field_D[var3].field_f) {
                              var4 = ol.field_D[var3].a(true);
                              if (cj.field_A < cl.field_j[var4]) {
                                cl.field_j[var4] = cl.field_j[var4] - 1;
                                break L4;
                              } else {
                                break L5;
                              }
                            } else {
                              break L5;
                            }
                          }
                          int incrementValue$6 = var2_int;
                          var2_int++;
                          ol.field_D[incrementValue$6] = ol.field_D[var3];
                          break L4;
                        }
                        var3++;
                        continue L3;
                      }
                    }
                  } else {
                    L6: {
                      if (ol.field_D[var2_int].field_f != param0.field_f) {
                        break L6;
                      } else {
                        int dupTemp$7 = ol.field_D[var2_int].a(true);
                        cl.field_j[dupTemp$7] = cl.field_j[dupTemp$7] + 1;
                        break L6;
                      }
                    }
                    var2_int++;
                    continue L2;
                  }
                }
              } else {
                cl.field_j[var2_int] = 0;
                var2_int++;
                continue L1;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L7: {
            var2 = decompiledCaughtException;
            stackOut_22_0 = (RuntimeException) var2;
            stackOut_22_1 = new StringBuilder().append("kj.C(");
            stackIn_24_0 = stackOut_22_0;
            stackIn_24_1 = stackOut_22_1;
            stackIn_23_0 = stackOut_22_0;
            stackIn_23_1 = stackOut_22_1;
            if (param0 == null) {
              stackOut_24_0 = (RuntimeException) (Object) stackIn_24_0;
              stackOut_24_1 = (StringBuilder) (Object) stackIn_24_1;
              stackOut_24_2 = "null";
              stackIn_25_0 = stackOut_24_0;
              stackIn_25_1 = stackOut_24_1;
              stackIn_25_2 = stackOut_24_2;
              break L7;
            } else {
              stackOut_23_0 = (RuntimeException) (Object) stackIn_23_0;
              stackOut_23_1 = (StringBuilder) (Object) stackIn_23_1;
              stackOut_23_2 = "{...}";
              stackIn_25_0 = stackOut_23_0;
              stackIn_25_1 = stackOut_23_1;
              stackIn_25_2 = stackOut_23_2;
              break L7;
            }
          }
          throw dn.a((Throwable) (Object) stackIn_25_0, stackIn_25_2 + ',' + 36 + ')');
        }
    }

    static {
        $cfr$clinit();
    }

    private static void $cfr$clinit() {
        field_c = "Connection restored.";
        field_a = new dl[4];
    }
}
