/*
 * Decompiled by CFR-JS 0.4.0.
 */
final class qj {
    boolean field_d;
    static String field_a;
    String field_e;
    static String field_g;
    String[] field_c;
    int field_b;
    boolean field_f;

    public static void a(int param0) {
        field_a = null;
        if (param0 != -28342) {
            return;
        }
        field_g = null;
    }

    final static void a(int param0, int param1) {
        vg var2 = null;
        RuntimeException var2_ref = null;
        int var3 = 0;
        gj var4 = null;
        vg stackIn_4_0 = null;
        Object stackIn_6_0 = null;
        RuntimeException decompiledCaughtException = null;
        vg stackOut_3_0 = null;
        ca stackOut_5_0 = null;
        var3 = OrbDefence.field_D ? 1 : 0;
        try {
          L0: {
            var2 = (vg) ((Object) kk.field_X.b((byte) -45));
            L1: while (true) {
              L2: {
                L3: {
                  if (var2 == null) {
                    break L3;
                  } else {
                    bk.a(true, param0, var2);
                    stackOut_3_0 = (vg) ((Object) kk.field_X.d(param1 ^ 7970));
                    stackIn_6_0 = stackOut_3_0;
                    stackIn_4_0 = stackOut_3_0;
                    if (var3 != 0) {
                      break L2;
                    } else {
                      var2 = stackIn_4_0;
                      if (var3 == 0) {
                        continue L1;
                      } else {
                        break L3;
                      }
                    }
                  }
                }
                stackOut_5_0 = cb.field_b.b((byte) 123);
                stackIn_6_0 = stackOut_5_0;
                break L2;
              }
              var4 = (gj) ((Object) stackIn_6_0);
              L4: while (true) {
                L5: {
                  L6: {
                    if (var4 == null) {
                      break L6;
                    } else {
                      se.a(var4, param0, -49);
                      var4 = (gj) ((Object) cb.field_b.d(param1 ^ 7970));
                      if (var3 != 0) {
                        break L5;
                      } else {
                        if (var3 == 0) {
                          continue L4;
                        } else {
                          break L6;
                        }
                      }
                    }
                  }
                  if (param1 == 7287) {
                    break L5;
                  } else {
                    field_a = (String) null;
                    return;
                  }
                }
                break L0;
              }
            }
          }
        } catch (java.lang.RuntimeException decompiledCaughtParameter0) {
          decompiledCaughtException = decompiledCaughtParameter0;
          var2_ref = decompiledCaughtException;
          throw dd.a((Throwable) ((Object) var2_ref), "qj.A(" + param0 + ',' + param1 + ')');
        }
    }

    qj(boolean param0) {
        this.field_f = param0 ? true : false;
    }

    static {
        field_a = "FULL ACCESS";
        field_g = "Next";
    }
}
