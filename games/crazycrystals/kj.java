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
        int var2 = 0;
        int var3 = 0;
        int var4 = 0;
        int var5 = 0;
        var5 = CrazyCrystals.field_B;
        if (param1 > 3) {
          var2 = 0;
          L0: while (true) {
            if (var2 >= 3) {
              var2 = 0;
              L1: while (true) {
                if (jl.field_d <= var2) {
                  int dupTemp$4 = param0.a(true);
                  cl.field_j[dupTemp$4] = cl.field_j[dupTemp$4] + 1;
                  var2 = 0;
                  var3 = 0;
                  L2: while (true) {
                    if (jl.field_d <= var3) {
                      jl.field_d = var2;
                      int fieldTemp$5 = jl.field_d;
                      jl.field_d = jl.field_d + 1;
                      ol.field_D[fieldTemp$5] = param0;
                      return;
                    } else {
                      L3: {
                        if (param0.field_f == ol.field_D[var3].field_f) {
                          var4 = ol.field_D[var3].a(true);
                          if (cj.field_A < cl.field_j[var4]) {
                            cl.field_j[var4] = cl.field_j[var4] - 1;
                            var3++;
                            continue L2;
                          } else {
                            break L3;
                          }
                        } else {
                          break L3;
                        }
                      }
                      int incrementValue$6 = var2;
                      var2++;
                      ol.field_D[incrementValue$6] = ol.field_D[var3];
                      var3++;
                      continue L2;
                    }
                  }
                } else {
                  if (ol.field_D[var2].field_f == param0.field_f) {
                    int dupTemp$7 = ol.field_D[var2].a(true);
                    cl.field_j[dupTemp$7] = cl.field_j[dupTemp$7] + 1;
                    var2++;
                    continue L1;
                  } else {
                    var2++;
                    continue L1;
                  }
                }
              }
            } else {
              cl.field_j[var2] = 0;
              var2++;
              continue L0;
            }
          }
        } else {
          return;
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
