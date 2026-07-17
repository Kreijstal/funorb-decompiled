/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class kn {
    static da field_a;
    static al[] field_c;
    static vs field_b;

    final static java.awt.Frame a(rk param0, int param1, int param2, int param3) {
        RuntimeException var6 = null;
        rm[] var6_array = null;
        int var7_int = 0;
        java.awt.Frame var7 = null;
        int var8 = 0;
        int var9 = 0;
        rm[] var10 = null;
        en var11 = null;
        Object stackIn_8_0 = null;
        Object stackIn_16_0 = null;
        Object stackIn_22_0 = null;
        Object stackIn_27_0 = null;
        RuntimeException stackIn_29_0 = null;
        StringBuilder stackIn_29_1 = null;
        RuntimeException stackIn_30_0 = null;
        StringBuilder stackIn_30_1 = null;
        RuntimeException stackIn_31_0 = null;
        StringBuilder stackIn_31_1 = null;
        String stackIn_31_2 = null;
        RuntimeException decompiledCaughtException = null;
        Object stackOut_15_0 = null;
        Object stackOut_7_0 = null;
        Object stackOut_26_0 = null;
        Object stackOut_21_0 = null;
        RuntimeException stackOut_28_0 = null;
        StringBuilder stackOut_28_1 = null;
        RuntimeException stackOut_30_0 = null;
        StringBuilder stackOut_30_1 = null;
        String stackOut_30_2 = null;
        RuntimeException stackOut_29_0 = null;
        StringBuilder stackOut_29_1 = null;
        String stackOut_29_2 = null;
        var9 = AceOfSkies.field_G ? 1 : 0;
        try {
          L0: {
            if (param0.a((byte) 84)) {
              L1: {
                if (param3 == 0) {
                  int discarded$2 = 1175069442;
                  var10 = sk.a(param0);
                  var6_array = var10;
                  if (var6_array != null) {
                    var7_int = 0;
                    var8 = 0;
                    L2: while (true) {
                      if (var8 >= var10.length) {
                        if (var7_int != 0) {
                          break L1;
                        } else {
                          stackOut_15_0 = null;
                          stackIn_16_0 = stackOut_15_0;
                          return (java.awt.Frame) (Object) stackIn_16_0;
                        }
                      } else {
                        L3: {
                          if (param1 != var10[var8].field_f) {
                            break L3;
                          } else {
                            break L3;
                          }
                        }
                        var8++;
                        continue L2;
                      }
                    }
                  } else {
                    stackOut_7_0 = null;
                    stackIn_8_0 = stackOut_7_0;
                    return (java.awt.Frame) (Object) stackIn_8_0;
                  }
                } else {
                  break L1;
                }
              }
              var11 = param0.a(param1, -83, 0, param2, param3);
              L4: while (true) {
                if (var11.field_a != 0) {
                  var7 = (java.awt.Frame) var11.field_f;
                  if (var7 != null) {
                    if (var11.field_a == 2) {
                      ke.a(973, param0, var7);
                      stackOut_26_0 = null;
                      stackIn_27_0 = stackOut_26_0;
                      break L0;
                    } else {
                      return var7;
                    }
                  } else {
                    stackOut_21_0 = null;
                    stackIn_22_0 = stackOut_21_0;
                    return (java.awt.Frame) (Object) stackIn_22_0;
                  }
                } else {
                  int discarded$3 = 0;
                  wf.a(10L);
                  continue L4;
                }
              }
            } else {
              return null;
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          L5: {
            var6 = decompiledCaughtException;
            stackOut_28_0 = (RuntimeException) var6;
            stackOut_28_1 = new StringBuilder().append("kn.A(");
            stackIn_30_0 = stackOut_28_0;
            stackIn_30_1 = stackOut_28_1;
            stackIn_29_0 = stackOut_28_0;
            stackIn_29_1 = stackOut_28_1;
            if (param0 == null) {
              stackOut_30_0 = (RuntimeException) (Object) stackIn_30_0;
              stackOut_30_1 = (StringBuilder) (Object) stackIn_30_1;
              stackOut_30_2 = "null";
              stackIn_31_0 = stackOut_30_0;
              stackIn_31_1 = stackOut_30_1;
              stackIn_31_2 = stackOut_30_2;
              break L5;
            } else {
              stackOut_29_0 = (RuntimeException) (Object) stackIn_29_0;
              stackOut_29_1 = (StringBuilder) (Object) stackIn_29_1;
              stackOut_29_2 = "{...}";
              stackIn_31_0 = stackOut_29_0;
              stackIn_31_1 = stackOut_29_1;
              stackIn_31_2 = stackOut_29_2;
              break L5;
            }
          }
          throw pn.a((Throwable) (Object) stackIn_31_0, stackIn_31_2 + 44 + param1 + 44 + param2 + 44 + param3 + 44 + 0 + 44 + 29742 + 41);
        }
        return (java.awt.Frame) (Object) stackIn_27_0;
    }

    public static void b() {
        field_a = null;
        field_c = null;
        field_b = null;
    }

    final static wp[] a() {
        int var3 = 0;
        int var4 = AceOfSkies.field_G ? 1 : 0;
        int var1 = -18;
        wp[] var2 = new wp[to.field_t];
        for (var3 = 0; var3 < to.field_t; var3++) {
            var2[var3] = new wp(pu.field_a, cc.field_i, lh.field_a[var3], lg.field_j[var3], ji.field_b[var3], ee.field_e[var3], fk.field_a[var3], ud.field_e);
        }
        int discarded$0 = 1;
        kf.f();
        return var2;
    }

    static {
    }
}
